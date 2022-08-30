package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,35);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Activity.LoadLayout(\"LoginPage\")";
Debug.ShouldStop(8);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LoginPage")),main.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,45);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,40);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enkripsi() throws Exception{
try {
		Debug.PushSubsStack("enkripsi (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,95);
if (RapidSub.canDelegate("enkripsi")) { return b4a.example.main.remoteMe.runUserSub(false, "main","enkripsi");}
 BA.debugLineNum = 95;BA.debugLine="Sub enkripsi";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="passwordhash = md.GetMessageDigest(p.GetBytes(\"UT";
Debug.ShouldStop(-2147483648);
main._passwordhash = main.mostCurrent._md.runMethod(false,"GetMessageDigest",(Object)(main.mostCurrent._p.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))),(Object)(RemoteObject.createImmutable("MD5")));
 BA.debugLineNum = 97;BA.debugLine="epass = ByteCon.HexFromBytes(passwordhash)";
Debug.ShouldStop(1);
main.mostCurrent._epass = main.mostCurrent._bytecon.runMethod(true,"HexFromBytes",(Object)(main._passwordhash));
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Dim md As MessageDigest";
main.mostCurrent._md = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim ByteCon As ByteConverter";
main.mostCurrent._bytecon = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
 //BA.debugLineNum = 27;BA.debugLine="Dim passwordhash() As Byte";
main._passwordhash = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 28;BA.debugLine="Dim epass As String";
main.mostCurrent._epass = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Dim p As String";
main.mostCurrent._p = RemoteObject.createImmutable("");
 //BA.debugLineNum = 30;BA.debugLine="Private NamaPengguna As EditText";
main.mostCurrent._namapengguna = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private password As EditText";
main.mostCurrent._password = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _masuk_click() throws Exception{
try {
		Debug.PushSubsStack("Masuk_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,50);
if (RapidSub.canDelegate("masuk_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","masuk_click");}
 BA.debugLineNum = 50;BA.debugLine="Private Sub Masuk_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="If NamaPengguna.Text =  \"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",main.mostCurrent._namapengguna.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 53;BA.debugLine="MsgboxAsync(\"Masukan Nama Pengguna\", \"Info\")";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Masukan Nama Pengguna")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),main.processBA);
 BA.debugLineNum = 54;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 57;BA.debugLine="If password.Text =  \"\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",main.mostCurrent._password.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 58;BA.debugLine="MsgboxAsync(\"Masukan Password\", \"Info\")";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Masukan Password")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),main.processBA);
 BA.debugLineNum = 59;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 62;BA.debugLine="ModulKoneksi.koneksi";
Debug.ShouldStop(536870912);
main.mostCurrent._modulkoneksi.runVoidMethod ("_koneksi" /*RemoteObject*/ ,main.mostCurrent.activityBA);
 BA.debugLineNum = 64;BA.debugLine="p = password.Text";
Debug.ShouldStop(-2147483648);
main.mostCurrent._p = main.mostCurrent._password.runMethod(true,"getText");
 BA.debugLineNum = 66;BA.debugLine="enkripsi";
Debug.ShouldStop(2);
_enkripsi();
 BA.debugLineNum = 68;BA.debugLine="ModulKoneksi.ResultS = ModulKoneksi.MHandler.Quer";
Debug.ShouldStop(8);
main.mostCurrent._modulkoneksi._results /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("mysql.mysqlhandler.ResultSetWrapper"), main.mostCurrent._modulkoneksi._mhandler /*RemoteObject*/ .runMethod(false,"Query",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tb_akunwarga WHERE username='"),main.mostCurrent._namapengguna.runMethod(true,"getText"),RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 69;BA.debugLine="If ModulKoneksi.ResultS.RowCount > 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",main.mostCurrent._modulkoneksi._results /*RemoteObject*/ .runMethod(true,"RowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 71;BA.debugLine="ModulKoneksi.ResultS = ModulKoneksi.MHandler.Que";
Debug.ShouldStop(64);
main.mostCurrent._modulkoneksi._results /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("mysql.mysqlhandler.ResultSetWrapper"), main.mostCurrent._modulkoneksi._mhandler /*RemoteObject*/ .runMethod(false,"Query",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tb_akunwarga WHERE username='"),main.mostCurrent._namapengguna.runMethod(true,"getText"),RemoteObject.createImmutable("' and password ='"),main.mostCurrent._epass,RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 72;BA.debugLine="If ModulKoneksi.ResultS.RowCount > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",main.mostCurrent._modulkoneksi._results /*RemoteObject*/ .runMethod(true,"RowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 75;BA.debugLine="ModulKoneksi.MHandler.Close";
Debug.ShouldStop(1024);
main.mostCurrent._modulkoneksi._mhandler /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 77;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 78;BA.debugLine="StartActivity(Profile)";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._profile.getObject())));
 }else {
 BA.debugLineNum = 81;BA.debugLine="MsgboxAsync(\"Password Tidak Ditemukan\", \"Info\")";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Password Tidak Ditemukan")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),main.processBA);
 BA.debugLineNum = 82;BA.debugLine="password.Text = \"\"";
Debug.ShouldStop(131072);
main.mostCurrent._password.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 83;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 }else {
 BA.debugLineNum = 87;BA.debugLine="MsgboxAsync(\"Nama Pengguna Tidak Ditemukan\",\"Inf";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Nama Pengguna Tidak Ditemukan")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),main.processBA);
 BA.debugLineNum = 88;BA.debugLine="NamaPengguna.Text = \"\"";
Debug.ShouldStop(8388608);
main.mostCurrent._namapengguna.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 89;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
modulkoneksi_subs_0._process_globals();
profile_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
modulkoneksi.myClass = BA.getDeviceClass ("b4a.example.modulkoneksi");
profile.myClass = BA.getDeviceClass ("b4a.example.profile");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}