/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class SpacingDefinition {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SpacingDefinition(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SpacingDefinition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_SpacingDefinition(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLeft(long value) {
    AdaptiveCardObjectModelJNI.SpacingDefinition_left_set(swigCPtr, this, value);
  }

  public long getLeft() {
    return AdaptiveCardObjectModelJNI.SpacingDefinition_left_get(swigCPtr, this);
  }

  public void setRight(long value) {
    AdaptiveCardObjectModelJNI.SpacingDefinition_right_set(swigCPtr, this, value);
  }

  public long getRight() {
    return AdaptiveCardObjectModelJNI.SpacingDefinition_right_get(swigCPtr, this);
  }

  public void setTop(long value) {
    AdaptiveCardObjectModelJNI.SpacingDefinition_top_set(swigCPtr, this, value);
  }

  public long getTop() {
    return AdaptiveCardObjectModelJNI.SpacingDefinition_top_get(swigCPtr, this);
  }

  public void setBottom(long value) {
    AdaptiveCardObjectModelJNI.SpacingDefinition_bottom_set(swigCPtr, this, value);
  }

  public long getBottom() {
    return AdaptiveCardObjectModelJNI.SpacingDefinition_bottom_get(swigCPtr, this);
  }

  public SpacingDefinition() {
    this(AdaptiveCardObjectModelJNI.new_SpacingDefinition(), true);
  }

}