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
 * An object that describes Containers that HumbleVideo can write MediaPacket objects<br>
 * to.
 */
public class MuxerFormat extends ContainerFormat {
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
  protected MuxerFormat(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.MuxerFormat_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected MuxerFormat(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.MuxerFormat_SWIGUpcast(cPtr),
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
  protected static long getCPtr(MuxerFormat obj) {
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
   * Create a new MuxerFormat object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public MuxerFormat copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new MuxerFormat(swigCPtr, swigCMemOwn, getJavaRefCount());
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
    if (obj instanceof MuxerFormat)
      equal = (((MuxerFormat)obj).swigCPtr == this.swigCPtr);
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
  
  
  @Override
  public String toString()
  {
    StringBuilder result = new StringBuilder();
    
    result.append(this.getClass().getName()+"@"+hashCode()+"[");
    result.append("name:"+getName()+";");
    result.append("description:"+getLongName()+";");
    result.append("mimetype:"+getMimeType()+";");
    result.append("extensions:"+getExtensions()+";");
    result.append("]");
    return result.toString();
  }
  
  /**
   * Return a collection of all output formats installed on this system.
   * @return the list.
   */
  public static java.util.Collection<MuxerFormat>
  getFormats()
  {
    java.util.Collection<MuxerFormat> retval =
      new java.util.HashSet<MuxerFormat>();
    int count = getNumFormats();
    for(int i = 0; i< count;++i)
    {
      MuxerFormat fmt = getFormat(i);
      if (fmt != null)
        retval.add(fmt);
    }
    return retval;
  }


/**
 * Name for format.
 */
  public String getName() {
    return VideoJNI.MuxerFormat_getName(swigCPtr, this);
  }

/**
 * Descriptive name for the format, meant to be more human-readable<br>
 * than name.
 */
  public String getLongName() {
    return VideoJNI.MuxerFormat_getLongName(swigCPtr, this);
  }

/**
 * A comma-separated list of supported filename extensions 
 */
  public String getExtensions() {
    return VideoJNI.MuxerFormat_getExtensions(swigCPtr, this);
  }

/**
 * Flags that tell you what capabilities this format supports.<br>
 * <br>
 * @return a bitmask of Flags
 */
  public int getFlags() {
    return VideoJNI.MuxerFormat_getFlags(swigCPtr, this);
  }

/**
 * Get the default audio codec for this format.
 */
  public Codec.ID getDefaultAudioCodecId() {
    return Codec.ID.swigToEnum(VideoJNI.MuxerFormat_getDefaultAudioCodecId(swigCPtr, this));
  }

/**
 * Get the default video codec for this format.
 */
  public Codec.ID getDefaultVideoCodecId() {
    return Codec.ID.swigToEnum(VideoJNI.MuxerFormat_getDefaultVideoCodecId(swigCPtr, this));
  }

/**
 * Get the default subtitle coded for this format.
 */
  public Codec.ID getDefaultSubtitleCodecId() {
    return Codec.ID.swigToEnum(VideoJNI.MuxerFormat_getDefaultSubtitleCodecId(swigCPtr, this));
  }

/**
 * Get the mime type for this format.
 */
  public String getMimeType() {
    return VideoJNI.MuxerFormat_getMimeType(swigCPtr, this);
  }

/**
 * Return the sink format in the list of registered sink formats<br>
 * which best matches the provided parameters, or return NULL if<br>
 * there is no match.<br>
 * <br>
 * @param shortName if non-NULL checks if short_name matches with the<br>
 * names of the registered formats<br>
 * @param filename if non-NULL checks if filename terminates with the<br>
 * extensions of the registered formats<br>
 * @param mimeType if non-NULL checks if mime_type matches with the<br>
 * MIME type of the registered formats
 */
  public static MuxerFormat guessFormat(String shortName, String filename, String mimeType) {
    long cPtr = VideoJNI.MuxerFormat_guessFormat(shortName, filename, mimeType);
    return (cPtr == 0) ? null : new MuxerFormat(cPtr, false);
  }

  public Codec.ID guessCodec(String shortName, String filename, String mimeType, MediaDescriptor.Type type) {
    return Codec.ID.swigToEnum(VideoJNI.MuxerFormat_guessCodec(swigCPtr, this, shortName, filename, mimeType, type.swigValue()));
  }

/**
 * Get total number of different codecs this container can output.
 */
  protected int getNumSupportedCodecs() {
    return VideoJNI.MuxerFormat_getNumSupportedCodecs(swigCPtr, this);
  }

/**
 * Get the 'best' codec tag for the given codec id for this container.
 */
  public long getBestCodecTag(Codec.ID id) {
    return VideoJNI.MuxerFormat_getBestCodecTag(swigCPtr, this, id.swigValue());
  }

/**
 * Get the Codec.ID for the n'th codec supported by this container.<br>
 * <br>
 * @param n The n'th codec supported by this codec. Lower n are higher priority.<br>
 *   n must be &lt; #getNumSupportedCodecs()<br>
 * @return the Codec.ID at the n'th slot, or Codec.ID.CODEC_ID_NONE if none.
 */
  protected Codec.ID getSupportedCodecId(int n) {
    return Codec.ID.swigToEnum(VideoJNI.MuxerFormat_getSupportedCodecId(swigCPtr, this, n));
  }

/**
 * Get the 32-bit Codec Tag for the n'th codec supported by this container.<br>
 * <br>
 * @param n The n'th codec supported by this codec. Lower n are higher priority.<br>
 *   n must be &lt; #getNumSupportedCodecs()<br>
 * @return the codec tag at the n'th slot, or 0 if none.
 */
  protected long getSupportedCodecTag(int n) {
    return VideoJNI.MuxerFormat_getSupportedCodecTag(swigCPtr, this, n);
  }

/**
 * Get the number of input formats this install can demultiplex (read)<br>
 * from.<br>
 * <br>
 * @return the number of formats
 */
  public static int getNumFormats() {
    return VideoJNI.MuxerFormat_getNumFormats();
  }

/**
 * Return an object for the input format at the given index.<br>
 * <br>
 * @param index an index for the input format list we maintain<br>
 * <br>
 * @return a format object for that input or null if<br>
 *   unknown, index &lt; 0 or index &gt;= #getNumInstalledInputFormats()
 */
  public static MuxerFormat getFormat(int index) {
    long cPtr = VideoJNI.MuxerFormat_getFormat(index);
    return (cPtr == 0) ? null : new MuxerFormat(cPtr, false);
  }

}
