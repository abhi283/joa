/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Reminders.
 * 
 */
@CoClass(guid="{0006F029-0000-0000-C000-000000000046}")
public class Reminders extends Dispatch implements _Reminders {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(80)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(80,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public _Reminder Item(final Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ReminderImpl.class);
  }
  @DeclDISPID(82)  public void Remove(final Object Index) throws ComException {
    assert(Index != null);
    this._dispatchCall(82,"Remove", DISPATCH_METHOD,null,Index);
  }
  public Reminders() throws ComException {
    super("{0006F029-0000-0000-C000-000000000046}", "{000630B1-0000-0000-C000-000000000046}");
  }
  protected Reminders(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Reminders" + super.toString() + "]";
  }
}
