/*******************************************************************************
 * Copyright (c) 2014, Andrew "Art" Clarke.  All rights reserved.
 *   
 * This file is part of Humble-Video.
 *
 * Humble-Video is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Humble-Video is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Humble-Video.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/

#include <stdexcept>

#include <io/humble/ferry/RefPointer.h>
#include <io/humble/ferry/Logger.h>
#include <io/humble/ferry/Buffer.h>
#include <io/humble/video/Global.h>

#include <io/humble/video/PixelFormat.h>

VS_LOG_SETUP(VS_CPP_PACKAGE.PixelFormat);

namespace io {
namespace humble {
namespace video {
using namespace io::humble::ferry;

PixelFormatDescriptor*
PixelFormat::getDescriptor(PixelFormat::Type pix_fmt) {
  Global::init();

  const AVPixFmtDescriptor *ctx = av_pix_fmt_desc_get(
      (enum AVPixelFormat) pix_fmt);
  if (ctx) return PixelFormatDescriptor::make(ctx);
  else return 0;
}

PixelComponentDescriptor*
PixelComponentDescriptor::make(const AVComponentDescriptor* ctx) {
  Global::init();

  if (!ctx)
  VS_THROW(HumbleInvalidArgument("null context"));
  RefPointer<PixelComponentDescriptor> retval = make();
  retval->mCtx = ctx;
  return retval.get();
}

PixelFormatDescriptor*
PixelFormatDescriptor::make(const AVPixFmtDescriptor* ctx) {
  Global::init();

  if (!ctx)
  VS_THROW(HumbleInvalidArgument("null context"));
  RefPointer<PixelFormatDescriptor> retval = make();
  retval->mCtx = ctx;
  return retval.get();
}
PixelComponentDescriptor*
PixelFormatDescriptor::getComponentDescriptor(int32_t c) {
  if (c < 0 || c > 3)
  VS_THROW(HumbleInvalidArgument("component must be >= 0 and <= 3"));
  return PixelComponentDescriptor::make(&mCtx->comp[c]);
}

int32_t
PixelFormat::getNumInstalledFormats() {
  Global::init();
  // not fast at all, but hey, optimize later.
  const AVPixFmtDescriptor* last = 0;
  int32_t i = 0;
  for (; (last = av_pix_fmt_desc_next(last)); i++)
    /* yup; that's it. */;
  return i;
}

PixelFormatDescriptor*
PixelFormat::getInstalledFormatDescriptor(int32_t n) {
  Global::init();
  // not fast at all, but hey, optimize later.
  const AVPixFmtDescriptor* last = 0;
  int32_t i = 0;
  for (; (last = av_pix_fmt_desc_next(last)); i++)
    if (i == n) break;
  return last ? PixelFormatDescriptor::make(last) : 0;
}

int32_t
PixelFormat::getBufferSizeNeeded(int32_t width, int32_t height,
    PixelFormat::Type pix_fmt) {
  Global::init();
  return av_image_get_buffer_size((enum AVPixelFormat) pix_fmt, width, height,
      1);
}

PixelFormat::Type
PixelFormat::getFormat(const char* name) {
  Global::init();
  return
      name && *name ?
          (PixelFormat::Type) av_get_pix_fmt(name) : PixelFormat::PIX_FMT_NONE;
}

const char*
PixelFormat::getFormatName(PixelFormat::Type pix_fmt) {
  Global::init();
  return av_get_pix_fmt_name((enum AVPixelFormat) pix_fmt);
}

int32_t
PixelFormat::getNumPlanes(PixelFormat::Type pix_fmt) {
  Global::init();
  return av_pix_fmt_count_planes((enum AVPixelFormat) pix_fmt);
}

PixelFormat::Type
PixelFormat::swapEndianness(PixelFormat::Type pix_fmt) {
  return (PixelFormat::Type) av_pix_fmt_swap_endianness(
      (enum AVPixelFormat) pix_fmt);
}

int32_t
PixelFormatDescriptor::getBitsPerPixel() {
  return av_get_bits_per_pixel(mCtx);
}

int32_t
PixelFormatDescriptor::getPaddedBitsPerPixel() {
  return av_get_padded_bits_per_pixel(mCtx);
}

PixelFormat::Type
PixelFormatDescriptor::getFormat() {
  return (PixelFormat::Type) av_pix_fmt_desc_get_id(mCtx);
}

}
}
}
