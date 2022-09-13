
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.example.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _md = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper");
public static RemoteObject _bytecon = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
public static RemoteObject _passwordhash = null;
public static RemoteObject _epass = RemoteObject.createImmutable("");
public static RemoteObject _p = RemoteObject.createImmutable("");
public static RemoteObject _namapengguna = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _password = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static b4a.example.modulkoneksi _modulkoneksi = null;
public static b4a.example.starter _starter = null;
public static b4a.example.profile _profile = null;
public static b4a.example.trackingpengajuan _trackingpengajuan = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"ByteCon",main.mostCurrent._bytecon,"epass",main.mostCurrent._epass,"md",main.mostCurrent._md,"ModulKoneksi",Debug.moduleToString(b4a.example.modulkoneksi.class),"NamaPengguna",main.mostCurrent._namapengguna,"p",main.mostCurrent._p,"password",main.mostCurrent._password,"passwordhash",main._passwordhash,"Profile",Debug.moduleToString(b4a.example.profile.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"TrackingPengajuan",Debug.moduleToString(b4a.example.trackingpengajuan.class),"xui",main._xui};
}
}