package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class modulkoneksi {
private static modulkoneksi mostCurrent = new modulkoneksi();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static mysql.mysqlhandler _mhandler = null;
public static mysql.mysqlhandler.ResultSetWrapper _results = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.profile _profile = null;
public b4a.example.trackingpengajuan _trackingpengajuan = null;
public static String  _koneksi(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="modulkoneksi";
if (Debug.shouldDelegate(null, "koneksi", false))
	 {return ((String) Debug.delegate(null, "koneksi", new Object[] {_ba}));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub koneksi";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="MHandler.Initialize(\"meniti.id\", \"u7753801_sadesa";
_mhandler.Initialize("meniti.id","u7753801_sadesa","u7753801_nurjaman","Nurjaman24");
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="If MHandler.isConnected = False Then";
if (_mhandler.isConnected==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="MsgboxAsync(\"Koneksi Terputus\",\"Info\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Koneksi Terputus"),BA.ObjectToCharSequence("Info"),(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="End Sub";
return "";
}
}