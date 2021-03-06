/* !---- DO NOT EDIT: This file autogenerated by com/jogamp/gluegen/JavaEmitter.java on Sat Oct 10 03:10:51 CEST 2015 ----! */


package jogamp.nativewindow.jawt;

import java.nio.*;

import com.jogamp.gluegen.runtime.*;
import com.jogamp.common.os.*;
import com.jogamp.common.nio.*;
import jogamp.common.os.MachineDataInfoRuntime;

import java.security.*;
import jogamp.nativewindow.jawt.*;
import com.jogamp.common.os.Platform;
import com.jogamp.common.util.VersionNumber;

public class JAWT_Rectangle {

  StructAccessor accessor;

  private static final int mdIdx = MachineDataInfoRuntime.getStatic().ordinal();
  private final MachineDataInfo md;

  private static final int[] JAWT_Rectangle_size = new int[] { 16 /* ARM_MIPS_32 */, 16 /* X86_32_UNIX */, 16 /* X86_32_MACOS */, 16 /* PPC_32_UNIX */, 16 /* SPARC_32_SUNOS */, 16 /* X86_32_WINDOWS */, 16 /* LP64_UNIX */, 16 /* X86_64_WINDOWS */  };
  private static final int[] x_offset = new int[] { 0 /* ARM_MIPS_32 */, 0 /* X86_32_UNIX */, 0 /* X86_32_MACOS */, 0 /* PPC_32_UNIX */, 0 /* SPARC_32_SUNOS */, 0 /* X86_32_WINDOWS */, 0 /* LP64_UNIX */, 0 /* X86_64_WINDOWS */ };
//private static final int[] x_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */  };
  private static final int[] y_offset = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */ };
//private static final int[] y_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */  };
  private static final int[] width_offset = new int[] { 8 /* ARM_MIPS_32 */, 8 /* X86_32_UNIX */, 8 /* X86_32_MACOS */, 8 /* PPC_32_UNIX */, 8 /* SPARC_32_SUNOS */, 8 /* X86_32_WINDOWS */, 8 /* LP64_UNIX */, 8 /* X86_64_WINDOWS */ };
//private static final int[] width_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */  };
  private static final int[] height_offset = new int[] { 12 /* ARM_MIPS_32 */, 12 /* X86_32_UNIX */, 12 /* X86_32_MACOS */, 12 /* PPC_32_UNIX */, 12 /* SPARC_32_SUNOS */, 12 /* X86_32_WINDOWS */, 12 /* LP64_UNIX */, 12 /* X86_64_WINDOWS */ };
//private static final int[] height_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */  };

  public static int size() {
    return JAWT_Rectangle_size[mdIdx];
  }

  public static JAWT_Rectangle create() {
    return create(Buffers.newDirectByteBuffer(size()));
  }

  public static JAWT_Rectangle create(java.nio.ByteBuffer buf) {
      return new JAWT_Rectangle(buf);
  }

  JAWT_Rectangle(java.nio.ByteBuffer buf) {
    md = MachineDataInfo.StaticConfig.values()[mdIdx].md;
    accessor = new StructAccessor(buf);
  }

  public java.nio.ByteBuffer getBuffer() {
    return accessor.getBuffer();
  }

  /** Setter for native field <code>x</code>: CType[(IntType) typedef 'jint', size [fixed true, lnx64 4], [const[false], int]] */
  public JAWT_Rectangle setX(int val) {
    accessor.setIntAt(x_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>x</code>: CType[(IntType) typedef 'jint', size [fixed true, lnx64 4], [const[false], int]] */
  public int getX() {
    return accessor.getIntAt(x_offset[mdIdx]);
  }

  /** Setter for native field <code>y</code>: CType[(IntType) typedef 'jint', size [fixed true, lnx64 4], [const[false], int]] */
  public JAWT_Rectangle setY(int val) {
    accessor.setIntAt(y_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>y</code>: CType[(IntType) typedef 'jint', size [fixed true, lnx64 4], [const[false], int]] */
  public int getY() {
    return accessor.getIntAt(y_offset[mdIdx]);
  }

  /** Setter for native field <code>width</code>: CType[(IntType) typedef 'jint', size [fixed true, lnx64 4], [const[false], int]] */
  public JAWT_Rectangle setWidth(int val) {
    accessor.setIntAt(width_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>width</code>: CType[(IntType) typedef 'jint', size [fixed true, lnx64 4], [const[false], int]] */
  public int getWidth() {
    return accessor.getIntAt(width_offset[mdIdx]);
  }

  /** Setter for native field <code>height</code>: CType[(IntType) typedef 'jint', size [fixed true, lnx64 4], [const[false], int]] */
  public JAWT_Rectangle setHeight(int val) {
    accessor.setIntAt(height_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>height</code>: CType[(IntType) typedef 'jint', size [fixed true, lnx64 4], [const[false], int]] */
  public int getHeight() {
    return accessor.getIntAt(height_offset[mdIdx]);
  }
}
