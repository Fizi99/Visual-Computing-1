/* !---- DO NOT EDIT: This file autogenerated by com/jogamp/gluegen/JavaEmitter.java on Sat Oct 10 03:31:13 CEST 2015 ----! */


package com.jogamp.oculusvr;

import java.nio.*;

import com.jogamp.gluegen.runtime.*;
import com.jogamp.common.os.*;
import com.jogamp.common.nio.*;
import jogamp.common.os.MachineDataInfoRuntime;

import com.jogamp.oculusvr.*;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class ovrFovPort {

  StructAccessor accessor;

  private static final int mdIdx = MachineDataInfoRuntime.getStatic().ordinal();
  private final MachineDataInfo md;

  private static final int[] ovrFovPort_size = new int[] { 16 /* ARM_MIPS_32 */, 16 /* X86_32_UNIX */, 16 /* X86_32_MACOS */, 16 /* PPC_32_UNIX */, 16 /* SPARC_32_SUNOS */, 16 /* X86_32_WINDOWS */, 16 /* LP64_UNIX */, 16 /* X86_64_WINDOWS */  };
  private static final int[] UpTan_offset = new int[] { 0 /* ARM_MIPS_32 */, 0 /* X86_32_UNIX */, 0 /* X86_32_MACOS */, 0 /* PPC_32_UNIX */, 0 /* SPARC_32_SUNOS */, 0 /* X86_32_WINDOWS */, 0 /* LP64_UNIX */, 0 /* X86_64_WINDOWS */ };
//private static final int[] UpTan_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */  };
  private static final int[] DownTan_offset = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */ };
//private static final int[] DownTan_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */  };
  private static final int[] LeftTan_offset = new int[] { 8 /* ARM_MIPS_32 */, 8 /* X86_32_UNIX */, 8 /* X86_32_MACOS */, 8 /* PPC_32_UNIX */, 8 /* SPARC_32_SUNOS */, 8 /* X86_32_WINDOWS */, 8 /* LP64_UNIX */, 8 /* X86_64_WINDOWS */ };
//private static final int[] LeftTan_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */  };
  private static final int[] RightTan_offset = new int[] { 12 /* ARM_MIPS_32 */, 12 /* X86_32_UNIX */, 12 /* X86_32_MACOS */, 12 /* PPC_32_UNIX */, 12 /* SPARC_32_SUNOS */, 12 /* X86_32_WINDOWS */, 12 /* LP64_UNIX */, 12 /* X86_64_WINDOWS */ };
//private static final int[] RightTan_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */  };

  public static int size() {
    return ovrFovPort_size[mdIdx];
  }

  public static ovrFovPort create() {
    return create(Buffers.newDirectByteBuffer(size()));
  }

  public static ovrFovPort create(java.nio.ByteBuffer buf) {
      return new ovrFovPort(buf);
  }

  ovrFovPort(java.nio.ByteBuffer buf) {
    md = MachineDataInfo.StaticConfig.values()[mdIdx].md;
    accessor = new StructAccessor(buf);
  }

  public java.nio.ByteBuffer getBuffer() {
    return accessor.getBuffer();
  }

  /** Setter for native field <code>UpTan</code>: CType[(FloatType) 'float', size [fixed true, lnx64 4], [const[false], float]] */
  public ovrFovPort setUpTan(float val) {
    accessor.setFloatAt(UpTan_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>UpTan</code>: CType[(FloatType) 'float', size [fixed true, lnx64 4], [const[false], float]] */
  public float getUpTan() {
    return accessor.getFloatAt(UpTan_offset[mdIdx]);
  }

  /** Setter for native field <code>DownTan</code>: CType[(FloatType) 'float', size [fixed true, lnx64 4], [const[false], float]] */
  public ovrFovPort setDownTan(float val) {
    accessor.setFloatAt(DownTan_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>DownTan</code>: CType[(FloatType) 'float', size [fixed true, lnx64 4], [const[false], float]] */
  public float getDownTan() {
    return accessor.getFloatAt(DownTan_offset[mdIdx]);
  }

  /** Setter for native field <code>LeftTan</code>: CType[(FloatType) 'float', size [fixed true, lnx64 4], [const[false], float]] */
  public ovrFovPort setLeftTan(float val) {
    accessor.setFloatAt(LeftTan_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>LeftTan</code>: CType[(FloatType) 'float', size [fixed true, lnx64 4], [const[false], float]] */
  public float getLeftTan() {
    return accessor.getFloatAt(LeftTan_offset[mdIdx]);
  }

  /** Setter for native field <code>RightTan</code>: CType[(FloatType) 'float', size [fixed true, lnx64 4], [const[false], float]] */
  public ovrFovPort setRightTan(float val) {
    accessor.setFloatAt(RightTan_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>RightTan</code>: CType[(FloatType) 'float', size [fixed true, lnx64 4], [const[false], float]] */
  public float getRightTan() {
    return accessor.getFloatAt(RightTan_offset[mdIdx]);
  }
}
