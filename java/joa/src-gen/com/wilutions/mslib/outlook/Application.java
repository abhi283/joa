/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * Application.
 * 
 */
@CoClass(guid="{0006F03A-0000-0000-C000-000000000046}")
public class Application extends Dispatch implements _Application {
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
  @DeclDISPID(12289)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(12289,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(278)  public String getVersion() throws ComException {
    final Object obj = this._dispatchCall(278,"Version", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(273)  public _Explorer ActiveExplorer() throws ComException {
    final Object obj = this._dispatchCall(273,"ActiveExplorer", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ExplorerImpl.class);
  }
  @DeclDISPID(274)  public _Inspector ActiveInspector() throws ComException {
    final Object obj = this._dispatchCall(274,"ActiveInspector", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._InspectorImpl.class);
  }
  @DeclDISPID(266)  public IDispatch CreateItem(final OlItemType ItemType) throws ComException {
    assert(ItemType != null);
    final Object obj = this._dispatchCall(266,"CreateItem", DISPATCH_METHOD,null,ItemType.value);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(267)  public IDispatch CreateItemFromTemplate(final String TemplatePath, final Object InFolder) throws ComException {
    assert(TemplatePath != null);
    assert(InFolder != null);
    final Object obj = this._dispatchCall(267,"CreateItemFromTemplate", DISPATCH_METHOD,null,TemplatePath,Variant.param(InFolder));
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(277)  public IDispatch CreateObject(final String ObjectName) throws ComException {
    assert(ObjectName != null);
    final Object obj = this._dispatchCall(277,"CreateObject", DISPATCH_METHOD,null,ObjectName);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(272)  public _NameSpace GetNamespace(final String Type) throws ComException {
    assert(Type != null);
    final Object obj = this._dispatchCall(272,"GetNamespace", DISPATCH_METHOD,null,Type);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(275)  public void Quit() throws ComException {
    this._dispatchCall(275,"Quit", DISPATCH_METHOD,null);
  }
  @DeclDISPID(280)  public com.wilutions.mslib.office.COMAddIns getCOMAddIns() throws ComException {
    final Object obj = this._dispatchCall(280,"COMAddIns", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.COMAddInsImpl.class);
  }
  @DeclDISPID(281)  public _Explorers getExplorers() throws ComException {
    final Object obj = this._dispatchCall(281,"Explorers", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ExplorersImpl.class);
  }
  @DeclDISPID(282)  public _Inspectors getInspectors() throws ComException {
    final Object obj = this._dispatchCall(282,"Inspectors", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._InspectorsImpl.class);
  }
  @DeclDISPID(283)  public com.wilutions.mslib.office.LanguageSettings getLanguageSettings() throws ComException {
    final Object obj = this._dispatchCall(283,"LanguageSettings", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.LanguageSettingsImpl.class);
  }
  @DeclDISPID(284)  public String getProductCode() throws ComException {
    final Object obj = this._dispatchCall(284,"ProductCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(287)  public IDispatch ActiveWindow() throws ComException {
    final Object obj = this._dispatchCall(287,"ActiveWindow", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(64098)  public IDispatch CopyFile(final String FilePath, final String DestFolderPath) throws ComException {
    assert(FilePath != null);
    assert(DestFolderPath != null);
    final Object obj = this._dispatchCall(64098,"CopyFile", DISPATCH_METHOD,null,FilePath,DestFolderPath);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(64101)  public Search AdvancedSearch(final String Scope, final Object Filter, final Object SearchSubFolders, final Object Tag) throws ComException {
    assert(Scope != null);
    assert(Filter != null);
    assert(SearchSubFolders != null);
    assert(Tag != null);
    final Object obj = this._dispatchCall(64101,"AdvancedSearch", DISPATCH_METHOD,null,Scope,Variant.param(Filter),Variant.param(SearchSubFolders),Variant.param(Tag));
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.SearchImpl.class);
  }
  @DeclDISPID(64108)  public Boolean IsSearchSynchronous(final String LookInFolders) throws ComException {
    assert(LookInFolders != null);
    final Object obj = this._dispatchCall(64108,"IsSearchSynchronous", DISPATCH_METHOD,null,LookInFolders);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64153)  public _Reminders getReminders() throws ComException {
    final Object obj = this._dispatchCall(64153,"Reminders", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._RemindersImpl.class);
  }
  @DeclDISPID(64214)  public String getDefaultProfileName() throws ComException {
    final Object obj = this._dispatchCall(64214,"DefaultProfileName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64499)  public Boolean getIsTrusted() throws ComException {
    final Object obj = this._dispatchCall(64499,"IsTrusted", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64470)  public IDispatch GetObjectReference(final IDispatch Item, final OlReferenceType ReferenceType) throws ComException {
    assert(ReferenceType != null);
    final Object obj = this._dispatchCall(64470,"GetObjectReference", DISPATCH_METHOD,null,Dispatch.param(Item),ReferenceType.value);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(64520)  public com.wilutions.mslib.office.IAssistance getAssistance() throws ComException {
    final Object obj = this._dispatchCall(64520,"Assistance", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.IAssistanceImpl.class);
  }
  @DeclDISPID(64553)  public TimeZones getTimeZones() throws ComException {
    final Object obj = this._dispatchCall(64553,"TimeZones", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(TimeZones.class);
  }
  @DeclDISPID(64613)  public com.wilutions.mslib.office.PickerDialog getPickerDialog() throws ComException {
    final Object obj = this._dispatchCall(64613,"PickerDialog", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.office.impl.PickerDialogImpl.class);
  }
  @DeclDISPID(64639)  public void RefreshFormRegionDefinition(final String RegionName) throws ComException {
    assert(RegionName != null);
    this._dispatchCall(64639,"RefreshFormRegionDefinition", DISPATCH_METHOD,null,RegionName);
  }
  public Application() throws ComException {
    super("{0006F03A-0000-0000-C000-000000000046}", "{00063001-0000-0000-C000-000000000046}");
  }
  protected Application(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Application" + super.toString() + "]";
  }
}
