/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0003.
 * Enumerates the group types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0004_0003 {
  ucCustomGroup(1),
  ucRecentContacts(2),
  ucDistributionGroup(3),
  ucFrequentContacts(4),
  ucFavoriteContacts(5),
  ucDelegateGroup(6),
  ucResponseServiceGroup(7);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0004_0003(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0004_0003 valueOf(int value) {
    switch(value) {
    case 1: return ucCustomGroup;
    case 2: return ucRecentContacts;
    case 3: return ucDistributionGroup;
    case 4: return ucFrequentContacts;
    case 5: return ucFavoriteContacts;
    case 6: return ucDelegateGroup;
    case 7: return ucResponseServiceGroup;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0004_0003.class);
    }
  }
}