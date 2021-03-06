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

public class ovrRenderAPIConfig {

  StructAccessor accessor;

  private static final int mdIdx = MachineDataInfoRuntime.getStatic().ordinal();
  private final MachineDataInfo md;

  private static final int[] ovrRenderAPIConfig_size = new int[] { 48 /* ARM_MIPS_32 */, 48 /* X86_32_UNIX */, 48 /* X86_32_MACOS */, 48 /* PPC_32_UNIX */, 48 /* SPARC_32_SUNOS */, 48 /* X86_32_WINDOWS */, 80 /* LP64_UNIX */, 80 /* X86_64_WINDOWS */  };
  private static final int[] Header_offset = new int[] { 0 /* ARM_MIPS_32 */, 0 /* X86_32_UNIX */, 0 /* X86_32_MACOS */, 0 /* PPC_32_UNIX */, 0 /* SPARC_32_SUNOS */, 0 /* X86_32_WINDOWS */, 0 /* LP64_UNIX */, 0 /* X86_64_WINDOWS */ };
  private static final int[] Header_size = new int[] { 16 /* ARM_MIPS_32 */, 16 /* X86_32_UNIX */, 16 /* X86_32_MACOS */, 16 /* PPC_32_UNIX */, 16 /* SPARC_32_SUNOS */, 16 /* X86_32_WINDOWS */, 16 /* LP64_UNIX */, 16 /* X86_64_WINDOWS */  };

  public static int size() {
    return ovrRenderAPIConfig_size[mdIdx];
  }

  public static ovrRenderAPIConfig create() {
    return create(Buffers.newDirectByteBuffer(size()));
  }

  public static ovrRenderAPIConfig create(java.nio.ByteBuffer buf) {
      return new ovrRenderAPIConfig(buf);
  }

  ovrRenderAPIConfig(java.nio.ByteBuffer buf) {
    md = MachineDataInfo.StaticConfig.values()[mdIdx].md;
    accessor = new StructAccessor(buf);
  }

  public java.nio.ByteBuffer getBuffer() {
    return accessor.getBuffer();
  }

  /** Getter for native field <code>Header</code>: CType[(StructType) typedef 'ovrRenderAPIConfigHeader', size [fixed false, lnx64 16], [const[false], struct{ovrRenderAPIConfigHeader_: 3, }]] */
  public ovrRenderAPIConfigHeader getHeader() {
    return ovrRenderAPIConfigHeader.create( accessor.slice( Header_offset[mdIdx], Header_size[mdIdx] ) );
 }
}
