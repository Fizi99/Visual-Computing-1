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

public class ovrTexture {

  StructAccessor accessor;

  private static final int mdIdx = MachineDataInfoRuntime.getStatic().ordinal();
  private final MachineDataInfo md;

  private static final int[] ovrTexture_size = new int[] { 60 /* ARM_MIPS_32 */, 60 /* X86_32_UNIX */, 60 /* X86_32_MACOS */, 60 /* PPC_32_UNIX */, 60 /* SPARC_32_SUNOS */, 60 /* X86_32_WINDOWS */, 96 /* LP64_UNIX */, 96 /* X86_64_WINDOWS */  };
  private static final int[] Header_offset = new int[] { 0 /* ARM_MIPS_32 */, 0 /* X86_32_UNIX */, 0 /* X86_32_MACOS */, 0 /* PPC_32_UNIX */, 0 /* SPARC_32_SUNOS */, 0 /* X86_32_WINDOWS */, 0 /* LP64_UNIX */, 0 /* X86_64_WINDOWS */ };
  private static final int[] Header_size = new int[] { 28 /* ARM_MIPS_32 */, 28 /* X86_32_UNIX */, 28 /* X86_32_MACOS */, 28 /* PPC_32_UNIX */, 28 /* SPARC_32_SUNOS */, 28 /* X86_32_WINDOWS */, 28 /* LP64_UNIX */, 28 /* X86_64_WINDOWS */  };

  public static int size() {
    return ovrTexture_size[mdIdx];
  }

  public static ovrTexture create() {
    return create(Buffers.newDirectByteBuffer(size()));
  }

  public static ovrTexture create(java.nio.ByteBuffer buf) {
      return new ovrTexture(buf);
  }

  ovrTexture(java.nio.ByteBuffer buf) {
    md = MachineDataInfo.StaticConfig.values()[mdIdx].md;
    accessor = new StructAccessor(buf);
  }

  public java.nio.ByteBuffer getBuffer() {
    return accessor.getBuffer();
  }

  /** Getter for native field <code>Header</code>: CType[(StructType) typedef 'ovrTextureHeader', size [fixed false, lnx64 28], [const[false], struct{ovrTextureHeader_: 3, }]] */
  public ovrTextureHeader getHeader() {
    return ovrTextureHeader.create( accessor.slice( Header_offset[mdIdx], Header_size[mdIdx] ) );
 }
}