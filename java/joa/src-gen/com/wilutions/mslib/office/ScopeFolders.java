/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * ScopeFolders.
 * 
 */
@CoInterface(guid="{000C0369-0000-0000-C000-000000000046}")
public interface ScopeFolders extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public ScopeFolder getItem(final Integer Index) throws ComException;
  @DeclDISPID(4)  public Integer getCount() throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
