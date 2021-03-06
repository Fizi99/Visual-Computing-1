/* !---- DO NOT EDIT: This file autogenerated by com/jogamp/gluegen/JavaEmitter.java on Sat Oct 10 03:10:18 CEST 2015 ----! */


package jogamp.nativewindow.x11;

import java.nio.*;

import com.jogamp.gluegen.runtime.*;
import com.jogamp.common.os.*;
import com.jogamp.common.nio.*;
import jogamp.common.os.MachineDataInfoRuntime;

import java.nio.*;
import java.util.*;
import com.jogamp.nativewindow.util.Point;
import com.jogamp.common.util.Bitfield;

public class XRenderDirectFormat {

  StructAccessor accessor;

  private static final int mdIdx = MachineDataInfoRuntime.getStatic().ordinal();
  private final MachineDataInfo md;

  private static final int[] XRenderDirectFormat_size = new int[] { 16 /* ARM_MIPS_32 */, 16 /* X86_32_UNIX */, 16 /* X86_32_MACOS */, 16 /* PPC_32_UNIX */, 16 /* SPARC_32_SUNOS */, 16 /* X86_32_WINDOWS */, 16 /* LP64_UNIX */, 16 /* X86_64_WINDOWS */  };
  private static final int[] red_offset = new int[] { 0 /* ARM_MIPS_32 */, 0 /* X86_32_UNIX */, 0 /* X86_32_MACOS */, 0 /* PPC_32_UNIX */, 0 /* SPARC_32_SUNOS */, 0 /* X86_32_WINDOWS */, 0 /* LP64_UNIX */, 0 /* X86_64_WINDOWS */ };
//private static final int[] red_size = new int[] { 2 /* ARM_MIPS_32 */, 2 /* X86_32_UNIX */, 2 /* X86_32_MACOS */, 2 /* PPC_32_UNIX */, 2 /* SPARC_32_SUNOS */, 2 /* X86_32_WINDOWS */, 2 /* LP64_UNIX */, 2 /* X86_64_WINDOWS */  };
  private static final int[] redMask_offset = new int[] { 2 /* ARM_MIPS_32 */, 2 /* X86_32_UNIX */, 2 /* X86_32_MACOS */, 2 /* PPC_32_UNIX */, 2 /* SPARC_32_SUNOS */, 2 /* X86_32_WINDOWS */, 2 /* LP64_UNIX */, 2 /* X86_64_WINDOWS */ };
//private static final int[] redMask_size = new int[] { 2 /* ARM_MIPS_32 */, 2 /* X86_32_UNIX */, 2 /* X86_32_MACOS */, 2 /* PPC_32_UNIX */, 2 /* SPARC_32_SUNOS */, 2 /* X86_32_WINDOWS */, 2 /* LP64_UNIX */, 2 /* X86_64_WINDOWS */  };
  private static final int[] green_offset = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */ };
//private static final int[] green_size = new int[] { 2 /* ARM_MIPS_32 */, 2 /* X86_32_UNIX */, 2 /* X86_32_MACOS */, 2 /* PPC_32_UNIX */, 2 /* SPARC_32_SUNOS */, 2 /* X86_32_WINDOWS */, 2 /* LP64_UNIX */, 2 /* X86_64_WINDOWS */  };
  private static final int[] greenMask_offset = new int[] { 6 /* ARM_MIPS_32 */, 6 /* X86_32_UNIX */, 6 /* X86_32_MACOS */, 6 /* PPC_32_UNIX */, 6 /* SPARC_32_SUNOS */, 6 /* X86_32_WINDOWS */, 6 /* LP64_UNIX */, 6 /* X86_64_WINDOWS */ };
//private static final int[] greenMask_size = new int[] { 2 /* ARM_MIPS_32 */, 2 /* X86_32_UNIX */, 2 /* X86_32_MACOS */, 2 /* PPC_32_UNIX */, 2 /* SPARC_32_SUNOS */, 2 /* X86_32_WINDOWS */, 2 /* LP64_UNIX */, 2 /* X86_64_WINDOWS */  };
  private static final int[] blue_offset = new int[] { 8 /* ARM_MIPS_32 */, 8 /* X86_32_UNIX */, 8 /* X86_32_MACOS */, 8 /* PPC_32_UNIX */, 8 /* SPARC_32_SUNOS */, 8 /* X86_32_WINDOWS */, 8 /* LP64_UNIX */, 8 /* X86_64_WINDOWS */ };
//private static final int[] blue_size = new int[] { 2 /* ARM_MIPS_32 */, 2 /* X86_32_UNIX */, 2 /* X86_32_MACOS */, 2 /* PPC_32_UNIX */, 2 /* SPARC_32_SUNOS */, 2 /* X86_32_WINDOWS */, 2 /* LP64_UNIX */, 2 /* X86_64_WINDOWS */  };
  private static final int[] blueMask_offset = new int[] { 10 /* ARM_MIPS_32 */, 10 /* X86_32_UNIX */, 10 /* X86_32_MACOS */, 10 /* PPC_32_UNIX */, 10 /* SPARC_32_SUNOS */, 10 /* X86_32_WINDOWS */, 10 /* LP64_UNIX */, 10 /* X86_64_WINDOWS */ };
//private static final int[] blueMask_size = new int[] { 2 /* ARM_MIPS_32 */, 2 /* X86_32_UNIX */, 2 /* X86_32_MACOS */, 2 /* PPC_32_UNIX */, 2 /* SPARC_32_SUNOS */, 2 /* X86_32_WINDOWS */, 2 /* LP64_UNIX */, 2 /* X86_64_WINDOWS */  };
  private static final int[] alpha_offset = new int[] { 12 /* ARM_MIPS_32 */, 12 /* X86_32_UNIX */, 12 /* X86_32_MACOS */, 12 /* PPC_32_UNIX */, 12 /* SPARC_32_SUNOS */, 12 /* X86_32_WINDOWS */, 12 /* LP64_UNIX */, 12 /* X86_64_WINDOWS */ };
//private static final int[] alpha_size = new int[] { 2 /* ARM_MIPS_32 */, 2 /* X86_32_UNIX */, 2 /* X86_32_MACOS */, 2 /* PPC_32_UNIX */, 2 /* SPARC_32_SUNOS */, 2 /* X86_32_WINDOWS */, 2 /* LP64_UNIX */, 2 /* X86_64_WINDOWS */  };
  private static final int[] alphaMask_offset = new int[] { 14 /* ARM_MIPS_32 */, 14 /* X86_32_UNIX */, 14 /* X86_32_MACOS */, 14 /* PPC_32_UNIX */, 14 /* SPARC_32_SUNOS */, 14 /* X86_32_WINDOWS */, 14 /* LP64_UNIX */, 14 /* X86_64_WINDOWS */ };
//private static final int[] alphaMask_size = new int[] { 2 /* ARM_MIPS_32 */, 2 /* X86_32_UNIX */, 2 /* X86_32_MACOS */, 2 /* PPC_32_UNIX */, 2 /* SPARC_32_SUNOS */, 2 /* X86_32_WINDOWS */, 2 /* LP64_UNIX */, 2 /* X86_64_WINDOWS */  };

  public static int size() {
    return XRenderDirectFormat_size[mdIdx];
  }

  public static XRenderDirectFormat create() {
    return create(Buffers.newDirectByteBuffer(size()));
  }

  public static XRenderDirectFormat create(java.nio.ByteBuffer buf) {
      return new XRenderDirectFormat(buf);
  }

  XRenderDirectFormat(java.nio.ByteBuffer buf) {
    md = MachineDataInfo.StaticConfig.values()[mdIdx].md;
    accessor = new StructAccessor(buf);
  }

  public java.nio.ByteBuffer getBuffer() {
    return accessor.getBuffer();
  }

  /** Setter for native field <code>red</code>: CType[(IntType) 'short', size [fixed true, lnx64 2], [const[false], int]] */
  public XRenderDirectFormat setRed(short val) {
    accessor.setShortAt(red_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>red</code>: CType[(IntType) 'short', size [fixed true, lnx64 2], [const[false], int]] */
  public short getRed() {
    return accessor.getShortAt(red_offset[mdIdx]);
  }

  /** Setter for native field <code>redMask</code>: CType[(IntType) 'short', size [fixed true, lnx64 2], [const[false], int]] */
  public XRenderDirectFormat setRedMask(short val) {
    accessor.setShortAt(redMask_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>redMask</code>: CType[(IntType) 'short', size [fixed true, lnx64 2], [const[false], int]] */
  public short getRedMask() {
    return accessor.getShortAt(redMask_offset[mdIdx]);
  }

  /** Setter for native field <code>green</code>: CType[(IntType) 'short', size [fixed true, lnx64 2], [const[false], int]] */
  public XRenderDirectFormat setGreen(short val) {
    accessor.setShortAt(green_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>green</code>: CType[(IntType) 'short', size [fixed true, lnx64 2], [const[false], int]] */
  public short getGreen() {
    return accessor.getShortAt(green_offset[mdIdx]);
  }

  /** Setter for native field <code>greenMask</code>: CType[(IntType) 'short', size [fixed true, lnx64 2], [const[false], int]] */
  public XRenderDirectFormat setGreenMask(short val) {
    accessor.setShortAt(greenMask_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>greenMask</code>: CType[(IntType) 'short', size [fixed true, lnx64 2], [const[false], int]] */
  public short getGreenMask() {
    return accessor.getShortAt(greenMask_offset[mdIdx]);
  }

  /** Setter for native field <code>blue</code>: CType[(IntType) 'short', size [fixed true, lnx64 2], [const[false], int]] */
  public XRenderDirectFormat setBlue(short val) {
    accessor.setShortAt(blue_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>blue</code>: CType[(IntType) 'short', size [fixed true, lnx64 2], [const[false], int]] */
  public short getBlue() {
    return accessor.getShortAt(blue_offset[mdIdx]);
  }

  /** Setter for native field <code>blueMask</code>: CType[(IntType) 'short', size [fixed true, lnx64 2], [const[false], int]] */
  public XRenderDirectFormat setBlueMask(short val) {
    accessor.setShortAt(blueMask_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>blueMask</code>: CType[(IntType) 'short', size [fixed true, lnx64 2], [const[false], int]] */
  public short getBlueMask() {
    return accessor.getShortAt(blueMask_offset[mdIdx]);
  }

  /** Setter for native field <code>alpha</code>: CType[(IntType) 'short', size [fixed true, lnx64 2], [const[false], int]] */
  public XRenderDirectFormat setAlpha(short val) {
    accessor.setShortAt(alpha_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>alpha</code>: CType[(IntType) 'short', size [fixed true, lnx64 2], [const[false], int]] */
  public short getAlpha() {
    return accessor.getShortAt(alpha_offset[mdIdx]);
  }

  /** Setter for native field <code>alphaMask</code>: CType[(IntType) 'short', size [fixed true, lnx64 2], [const[false], int]] */
  public XRenderDirectFormat setAlphaMask(short val) {
    accessor.setShortAt(alphaMask_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>alphaMask</code>: CType[(IntType) 'short', size [fixed true, lnx64 2], [const[false], int]] */
  public short getAlphaMask() {
    return accessor.getShortAt(alphaMask_offset[mdIdx]);
  }
}
