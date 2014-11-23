/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0045.
 * Enumerates the application sharing resource type 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0045 {
  ucSharingResourceTypeDesktop(0),
  ucSharingResourceTypeMonitor(1),
  ucSharingResourceTypeProcess(2),
  ucSharingResourceTypeWindow(3),
  ucSharingResourceTypeOther(4);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0045(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0045 valueOf(int value) {
    switch(value) {
    case 0: return ucSharingResourceTypeDesktop;
    case 1: return ucSharingResourceTypeMonitor;
    case 2: return ucSharingResourceTypeProcess;
    case 3: return ucSharingResourceTypeWindow;
    case 4: return ucSharingResourceTypeOther;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0045.class);
    }
  }
}