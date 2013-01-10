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

public class btHashString {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btHashString(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btHashString obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btHashString(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_string(String value) {
    gdxBulletJNI.btHashString_m_string_set(swigCPtr, this, value);
  }

  public String getM_string() {
    return gdxBulletJNI.btHashString_m_string_get(swigCPtr, this);
  }

  public void setM_hash(long value) {
    gdxBulletJNI.btHashString_m_hash_set(swigCPtr, this, value);
  }

  public long getM_hash() {
    return gdxBulletJNI.btHashString_m_hash_get(swigCPtr, this);
  }

  public long getHash() {
    return gdxBulletJNI.btHashString_getHash(swigCPtr, this);
  }

  public btHashString(String name) {
    this(gdxBulletJNI.new_btHashString(name), true);
  }

  public int portableStringCompare(String src, String dst) {
    return gdxBulletJNI.btHashString_portableStringCompare(swigCPtr, this, src, dst);
  }

  public boolean equals(btHashString other) {
    return gdxBulletJNI.btHashString_equals(swigCPtr, this, btHashString.getCPtr(other), other);
  }

}
