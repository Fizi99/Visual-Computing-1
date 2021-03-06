/* !---- DO NOT EDIT: This file autogenerated by com/jogamp/gluegen/JavaEmitter.java on Sat Oct 10 03:10:40 CEST 2015 ----! */


package jogamp.nativewindow.jawt.windows;

import java.nio.*;

import com.jogamp.gluegen.runtime.*;
import com.jogamp.common.os.*;
import com.jogamp.common.nio.*;
import jogamp.common.os.MachineDataInfoRuntime;

import java.security.*;
import jogamp.nativewindow.jawt.*;
import com.jogamp.common.os.Platform;
import com.jogamp.common.util.VersionNumber;

public class JAWT_Win32DrawingSurfaceInfo implements JAWT_PlatformInfo {

  StructAccessor accessor;

  private static final int mdIdx = MachineDataInfoRuntime.getStatic().ordinal();
  private final MachineDataInfo md;

  private static final int[] JAWT_Win32DrawingSurfaceInfo_size = new int[] { 12 /* ARM_MIPS_32 */, 12 /* X86_32_UNIX */, 12 /* X86_32_MACOS */, 12 /* PPC_32_UNIX */, 12 /* SPARC_32_SUNOS */, 12 /* X86_32_WINDOWS */, 24 /* LP64_UNIX */, 24 /* X86_64_WINDOWS */  };
  private static final int[] handle_offset = new int[] { 0 /* ARM_MIPS_32 */, 0 /* X86_32_UNIX */, 0 /* X86_32_MACOS */, 0 /* PPC_32_UNIX */, 0 /* SPARC_32_SUNOS */, 0 /* X86_32_WINDOWS */, 0 /* LP64_UNIX */, 0 /* X86_64_WINDOWS */ };
//private static final int[] handle_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 8 /* LP64_UNIX */, 8 /* X86_64_WINDOWS */  };
  private static final int[] hdc_offset = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 8 /* LP64_UNIX */, 8 /* X86_64_WINDOWS */ };
//private static final int[] hdc_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 8 /* LP64_UNIX */, 8 /* X86_64_WINDOWS */  };

  public static int size() {
    return JAWT_Win32DrawingSurfaceInfo_size[mdIdx];
  }

  public static JAWT_Win32DrawingSurfaceInfo create() {
    return create(Buffers.newDirectByteBuffer(size()));
  }

  public static JAWT_Win32DrawingSurfaceInfo create(java.nio.ByteBuffer buf) {
      return new JAWT_Win32DrawingSurfaceInfo(buf);
  }

  JAWT_Win32DrawingSurfaceInfo(java.nio.ByteBuffer buf) {
    md = MachineDataInfo.StaticConfig.values()[mdIdx].md;
    accessor = new StructAccessor(buf);
  }

  public java.nio.ByteBuffer getBuffer() {
    return accessor.getBuffer();
  }

  /** Setter for native field <code>handle</code>: CType[(PointerType) typedef 'HWND' -> (struct _handle) * , size [fixed false, lnx64 8], [const[false], pointer*1]], with array length of <code>1</code> */
  public JAWT_Win32DrawingSurfaceInfo setHandle(long val) {
    accessor.setLongAt(handle_offset[mdIdx], val, md.pointerSizeInBytes());
    return this;
  }

  /** Getter for native field <code>handle</code>: CType[(PointerType) typedef 'HWND' -> (struct _handle) * , size [fixed false, lnx64 8], [const[false], pointer*1]], with array length of <code>1</code> */
  public long getHandle() {
    return accessor.getLongAt(handle_offset[mdIdx], md.pointerSizeInBytes());
  }


  /** Setter for native field <code>hdc</code>: CType[(PointerType) typedef 'HDC' -> (struct _handle) * , size [fixed false, lnx64 8], [const[false], pointer*1]], with array length of <code>1</code> */
  public JAWT_Win32DrawingSurfaceInfo setHdc(long val) {
    accessor.setLongAt(hdc_offset[mdIdx], val, md.pointerSizeInBytes());
    return this;
  }

  /** Getter for native field <code>hdc</code>: CType[(PointerType) typedef 'HDC' -> (struct _handle) * , size [fixed false, lnx64 8], [const[false], pointer*1]], with array length of <code>1</code> */
  public long getHdc() {
    return accessor.getLongAt(hdc_offset[mdIdx], md.pointerSizeInBytes());
  }



}
