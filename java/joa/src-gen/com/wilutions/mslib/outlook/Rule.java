/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Rule.
 * 
 */
@CoClass(guid="{000610CD-0000-0000-C000-000000000046}")
public class Rule extends Dispatch implements _Rule {
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
  @DeclDISPID(8450)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(8450,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8450)  public void setName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(8450,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64267)  public Integer getExecutionOrder() throws ComException {
    final Object obj = this._dispatchCall(64267,"ExecutionOrder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(64267)  public void setExecutionOrder(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(64267,"ExecutionOrder", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64268)  public OlRuleType getRuleType() throws ComException {
    final Object obj = this._dispatchCall(64268,"RuleType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlRuleType.valueOf((Integer)obj);
  }
  @DeclDISPID(103)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(103,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(103)  public void setEnabled(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(103,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64269)  public Boolean getIsLocalRule() throws ComException {
    final Object obj = this._dispatchCall(64269,"IsLocalRule", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64270)  public void Execute(final Object ShowProgress, final Object Folder, final Object IncludeSubfolders, final Object RuleExecuteOption) throws ComException {
    assert(ShowProgress != null);
    assert(Folder != null);
    assert(IncludeSubfolders != null);
    assert(RuleExecuteOption != null);
    this._dispatchCall(64270,"Execute", DISPATCH_METHOD,null,Variant.param(ShowProgress),Variant.param(Folder),Variant.param(IncludeSubfolders),Variant.param(RuleExecuteOption));
  }
  @DeclDISPID(64272)  public RuleActions getActions() throws ComException {
    final Object obj = this._dispatchCall(64272,"Actions", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleActions.class);
  }
  @DeclDISPID(64297)  public RuleConditions getConditions() throws ComException {
    final Object obj = this._dispatchCall(64297,"Conditions", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleConditions.class);
  }
  @DeclDISPID(64307)  public RuleConditions getExceptions() throws ComException {
    final Object obj = this._dispatchCall(64307,"Exceptions", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(RuleConditions.class);
  }
  public Rule() throws ComException {
    super("{000610CD-0000-0000-C000-000000000046}", "{000630CD-0000-0000-C000-000000000046}");
  }
  protected Rule(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Rule" + super.toString() + "]";
  }
}
