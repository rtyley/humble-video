/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
/**
 * NOT CURRENTLY USED.
 */
public class MediaSubtitleRectangle extends RefCounted {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    Buffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected MediaSubtitleRectangle(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.MediaSubtitleRectangle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected MediaSubtitleRectangle(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.MediaSubtitleRectangle_SWIGUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  protected static long getCPtr(MediaSubtitleRectangle obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  protected long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new MediaSubtitleRectangle object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public MediaSubtitleRectangle copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new MediaSubtitleRectangle(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof MediaSubtitleRectangle)
      equal = (((MediaSubtitleRectangle)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  
  public int getX() {
    return VideoJNI.MediaSubtitleRectangle_getX(swigCPtr, this);
  }

  public int getY() {
    return VideoJNI.MediaSubtitleRectangle_getY(swigCPtr, this);
  }

  public int getWidth() {
    return VideoJNI.MediaSubtitleRectangle_getWidth(swigCPtr, this);
  }

  public int getHeight() {
    return VideoJNI.MediaSubtitleRectangle_getHeight(swigCPtr, this);
  }

  public int getNumColors() {
    return VideoJNI.MediaSubtitleRectangle_getNumColors(swigCPtr, this);
  }

  public MediaSubtitle.Type getType() {
    return MediaSubtitle.Type.swigToEnum(VideoJNI.MediaSubtitleRectangle_getType(swigCPtr, this));
  }

  public String getText() {
    return VideoJNI.MediaSubtitleRectangle_getText(swigCPtr, this);
  }

  public String getASS() {
    return VideoJNI.MediaSubtitleRectangle_getASS(swigCPtr, this);
  }

  public int getFlags() {
    return VideoJNI.MediaSubtitleRectangle_getFlags(swigCPtr, this);
  }

  public int getPictureLinesize(int line) {
    return VideoJNI.MediaSubtitleRectangle_getPictureLinesize(swigCPtr, this, line);
  }

  public Buffer getPictureData(int line) {
    long cPtr = VideoJNI.MediaSubtitleRectangle_getPictureData(swigCPtr, this, line);
    return (cPtr == 0) ? null : new Buffer(cPtr, false);
  }

  public enum Flag {
    SUBTITLE_FLAG_FORCED(VideoJNI.MediaSubtitleRectangle_SUBTITLE_FLAG_FORCED_get()),
  ;

    public final int swigValue() {
      return swigValue;
    }

    public static Flag swigToEnum(int swigValue) {
      Flag[] swigValues = Flag.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Flag swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Flag.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Flag() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Flag(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Flag(Flag swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
