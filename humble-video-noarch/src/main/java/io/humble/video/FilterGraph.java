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
 * Creates a graph (or map) of Filter objects that can modify MediaRaw<br>
 * objects to do lots of advanced stuff like edge-detection, cropping,<br>
 * blurring, etc.
 */
public class FilterGraph extends Configurable {
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
  protected FilterGraph(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.FilterGraph_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected FilterGraph(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.FilterGraph_SWIGUpcast(cPtr),
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
  protected static long getCPtr(FilterGraph obj) {
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
   * Create a new FilterGraph object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public FilterGraph copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new FilterGraph(swigCPtr, swigCMemOwn, getJavaRefCount());
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
    if (obj instanceof FilterGraph)
      equal = (((FilterGraph)obj).swigCPtr == this.swigCPtr);
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
  

/**
 * Creates a new FilterGraph.
 */
  public static FilterGraph make() {
    long cPtr = VideoJNI.FilterGraph_make();
    return (cPtr == 0) ? null : new FilterGraph(cPtr, false);
  }

/**
 * Add a filter with the given name to the graph.<br>
 * @return An object that refers to the new filter.
 */
  public Filter addFilter(FilterType type, String name) {
    long cPtr = VideoJNI.FilterGraph_addFilter(swigCPtr, this, FilterType.getCPtr(type), type, name);
    return (cPtr == 0) ? null : new Filter(cPtr, false);
  }

/**
 * @return the filter with the given name, or null if not found.
 */
  public Filter getFilter(String name) {
    long cPtr = VideoJNI.FilterGraph_getFilter(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Filter(cPtr, false);
  }

/**
 * Add a FilterAudioSource.<br>
 * @param name the name; must be unique in graph<br>
 * @param timeBase timebase of frames that will be input. If null 1/sampleRate is assumed.<br>
 * @param sampleRate the audio sample rate<br>
 * <br>
 * @param format the sample format<br>
 * <br>
 * @return The FilterSource that was added.<br>
 * @throws RuntimeException if name is already in graph.<br>
 * @throws InvalidArgument if any argument is invalid.
 */
  public FilterAudioSource addAudioSource(String name, int sampleRate, AudioChannel.Layout channelLayout, AudioFormat.Type format, Rational timeBase) {
    long cPtr = VideoJNI.FilterGraph_addAudioSource(swigCPtr, this, name, sampleRate, channelLayout.swigValue(), format.swigValue(), Rational.getCPtr(timeBase), timeBase);
    return (cPtr == 0) ? null : new FilterAudioSource(cPtr, false);
  }

/**
 * Add a FilterPictureSource.<br>
 * @param name the name; must be unique in graph<br>
 * @param width the width in pixels of MediaPicture objects that will be added to this source.<br>
 * @param height the height in pixels  of MediaPicture objects that will be added to this source.<br>
 * @param format the pixel format<br>
 * @param timeBase timebase of frames that will be input. If null, 1/Global.DEFAULT_PTS_PER_SECOND is assumed.<br>
 * @param pixelAspectRatio pixel aspect ratio. If null, 1/1 is assumed.<br>
 * <br>
 * @return The FilterSource that was added.<br>
 * @throws RuntimeException if name is already in graph.<br>
 * @throws InvalidArgument if any argument is invalid.
 */
  public FilterPictureSource addPictureSource(String name, int width, int height, PixelFormat.Type format, Rational timeBase, Rational pixelAspectRatio) {
    long cPtr = VideoJNI.FilterGraph_addPictureSource(swigCPtr, this, name, width, height, format.swigValue(), Rational.getCPtr(timeBase), timeBase, Rational.getCPtr(pixelAspectRatio), pixelAspectRatio);
    return (cPtr == 0) ? null : new FilterPictureSource(cPtr, false);
  }

/**
 * Add a FilterAudioSink.<br>
 * @param name the name; must be unique in graph<br>
 * @param sampleRate the audio sample rate<br>
 * <br>
 * @param format the sample format<br>
 * <br>
 * @return The FilterAudioSink that was added.<br>
 * @throws RuntimeException if name is already in graph.<br>
 * @throws InvalidArgument if any argument is invalid.
 */
  public FilterAudioSink addAudioSink(String name, int sampleRate, AudioChannel.Layout channelLayout, AudioFormat.Type format) {
    long cPtr = VideoJNI.FilterGraph_addAudioSink(swigCPtr, this, name, sampleRate, channelLayout.swigValue(), format.swigValue());
    return (cPtr == 0) ? null : new FilterAudioSink(cPtr, false);
  }

/**
 * Add a FilterPictureSink.<br>
 * @param name the name; must be unique in graph<br>
 * @param format the pixel format desired of pictures taken from this sink.<br>
 * @return The FilterPictureSink that was added.<br>
 * @throws RuntimeException if name is already in graph.<br>
 * @throws InvalidArgument if any argument is invalid.
 */
  public FilterPictureSink addPictureSink(String name, PixelFormat.Type format) {
    long cPtr = VideoJNI.FilterGraph_addPictureSink(swigCPtr, this, name, format.swigValue());
    return (cPtr == 0) ? null : new FilterPictureSink(cPtr, false);
  }

/**
 * @return number of FilterSource added so far.
 */
  public int getNumSources() {
    return VideoJNI.FilterGraph_getNumSources(swigCPtr, this);
  }

/**
 * @param index The n'th of #getNumSoruces() FilterSources attached to this FilterGraph.<br>
 * @return the FilterSource<br>
 * @throws InvalidArgument if index &lt; 0 || index &gt;= #getNumSources()
 */
  public FilterSource getSource(int index) {
    long cPtr = VideoJNI.FilterGraph_getSource__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new FilterSource(cPtr, false);
  }

/**
 * @param name unique name of a FilterSource in this FilterGraph. Should have been added with #addSource(FilterSource,String).<br>
 * @throws PropertyNotFoundException if not in graph.
 */
  public FilterSource getSource(String name) {
    long cPtr = VideoJNI.FilterGraph_getSource__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new FilterSource(cPtr, false);
  }

/**
 * @return number of FilterSink added so far.
 */
  public int getNumSinks() {
    return VideoJNI.FilterGraph_getNumSinks(swigCPtr, this);
  }

/**
 * @param index The n'th of #getNumSoruces() FilterSinks attached to this FilterGraph.<br>
 * @return the FilterSink<br>
 * @throws InvalidArgument if index &lt; 0 || index &gt;= #getNumSinks()
 */
  public FilterSink getSink(int index) {
    long cPtr = VideoJNI.FilterGraph_getSink__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new FilterSink(cPtr, false);
  }

/**
 * @param name unique name of a FilterSink in this FilterGraph. Should have been added with #addSink(FilterSink,String).<br>
 * @throws PropertyNotFoundException if not in graph.
 */
  public FilterSink getSink(String name) {
    long cPtr = VideoJNI.FilterGraph_getSink__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new FilterSink(cPtr, false);
  }

/**
 * Should this graph auto-convert audio or pictures into the formats<br>
 * different filters require (rather than require the user to construct<br>
 * a graph with all filters sets correctly).<br>
 * <br>
 * @param value whether to auto-convert with MediaPictureResampler or MediaAudioResampler objects.
 */
  public void setAutoConvert(FilterGraph.AutoConvertFlag value) {
    VideoJNI.FilterGraph_setAutoConvert(swigCPtr, this, value.swigValue());
  }

/**
 * @return does this graph auto convert MediaPicture and MediaRaw objects to different<br>
 * dimensions/sample-rates/channels/etc. when<br>
 * pulling them through the graph.
 */
  public FilterGraph.AutoConvertFlag getAutoConvert() {
    return FilterGraph.AutoConvertFlag.swigToEnum(VideoJNI.FilterGraph_getAutoConvert(swigCPtr, this));
  }

/**
 * Add a graph described by a string to a graph. For any Sinks or Sources<br>
 * the caller must have called #addSource or #addSink before<br>
 * this call.<br>
 * <br>
 * @param filterDescription The filter string to be parsed, in FFmpeg libavfilter format.<br>
 * @throws RuntimeException if <b>any inputs or outputs</b> are open (i.e. each filter<br>
 *   in the graph must either point to another filter on all inputs or outputs, or point to<br>
 *   a FilterSink or FilterSource when done).
 */
  public void open(String filterDescription) {
    VideoJNI.FilterGraph_open(swigCPtr, this, filterDescription);
  }

  public String sendCommand(String target, String command, String arguments, int flags) {
    return VideoJNI.FilterGraph_sendCommand(swigCPtr, this, target, command, arguments, flags);
  }

/**
 * Queue a command for one or more filter instances.<br>
 * <br>
 * @param target the filter(s) to which the command should be sent<br>
 *               "all" sends to all filters<br>
 *               otherwise it can be a filter or filter instance name<br>
 *               which will send the command to all matching filters.<br>
 * @param command    the command to sent, for handling simplicity all commands must be alphanummeric only<br>
 * @param arguments    the argument for the command<br>
 * @param ts     time at which the command should be sent to the filter<br>
 * <br>
 * Note: As this executes commands after this function returns, no return code<br>
 *       from the filter is provided, also AVFILTER_CMD_FLAG_ONE is not supported.
 */
  public void queueCommand(String target, String command, String arguments, int flags, double ts) {
    VideoJNI.FilterGraph_queueCommand(swigCPtr, this, target, command, arguments, flags, ts);
  }

  public String getDisplayString() {
    return VideoJNI.FilterGraph_getDisplayString(swigCPtr, this);
  }

  public FilterGraph.State getState() {
    return FilterGraph.State.swigToEnum(VideoJNI.FilterGraph_getState(swigCPtr, this));
  }

  /**
   * States a graph can be in.
   */
  public enum State {
  /**
   * Initialized but not yet opened. Properties and graph strings may still be set. 
   */
    STATE_INITED,
  /**
   * Opened. Properites and graphs can no longer be set, but MediaRaw objects<br>
   * can be processed.
   */
    STATE_OPENED,
  /**
   * An error occurred and this graph should be discarded.
   */
    STATE_ERROR,
  ;

    public final int swigValue() {
      return swigValue;
    }

    public static State swigToEnum(int swigValue) {
      State[] swigValues = State.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (State swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + State.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private State() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private State(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private State(State swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum AutoConvertFlag {
  /**
   * all automatic conversions enabled 
   */
    AUTO_CONVERT_ALL(VideoJNI.FilterGraph_AUTO_CONVERT_ALL_get()),
  /**
   * all automatic conversions disabled 
   */
    AUTO_CONVERT_NONE(VideoJNI.FilterGraph_AUTO_CONVERT_NONE_get()),
  ;

    public final int swigValue() {
      return swigValue;
    }

    public static AutoConvertFlag swigToEnum(int swigValue) {
      AutoConvertFlag[] swigValues = AutoConvertFlag.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (AutoConvertFlag swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + AutoConvertFlag.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private AutoConvertFlag() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private AutoConvertFlag(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private AutoConvertFlag(AutoConvertFlag swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
