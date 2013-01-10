/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btTriangleInfoData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btTriangleInfoData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btTriangleInfoData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btTriangleInfoData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_flags(int value) {
    gdxBulletJNI.btTriangleInfoData_m_flags_set(swigCPtr, this, value);
  }

  public int getM_flags() {
    return gdxBulletJNI.btTriangleInfoData_m_flags_get(swigCPtr, this);
  }

  public void setM_edgeV0V1Angle(float value) {
    gdxBulletJNI.btTriangleInfoData_m_edgeV0V1Angle_set(swigCPtr, this, value);
  }

  public float getM_edgeV0V1Angle() {
    return gdxBulletJNI.btTriangleInfoData_m_edgeV0V1Angle_get(swigCPtr, this);
  }

  public void setM_edgeV1V2Angle(float value) {
    gdxBulletJNI.btTriangleInfoData_m_edgeV1V2Angle_set(swigCPtr, this, value);
  }

  public float getM_edgeV1V2Angle() {
    return gdxBulletJNI.btTriangleInfoData_m_edgeV1V2Angle_get(swigCPtr, this);
  }

  public void setM_edgeV2V0Angle(float value) {
    gdxBulletJNI.btTriangleInfoData_m_edgeV2V0Angle_set(swigCPtr, this, value);
  }

  public float getM_edgeV2V0Angle() {
    return gdxBulletJNI.btTriangleInfoData_m_edgeV2V0Angle_get(swigCPtr, this);
  }

  public btTriangleInfoData() {
    this(gdxBulletJNI.new_btTriangleInfoData(), true);
  }

}
