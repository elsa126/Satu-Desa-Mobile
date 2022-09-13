B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private ListView1 As ListView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("TrackingPengajuan")
	
	ShowList
	
	ListView1.TwoLinesLayout.Label.TextColor = Colors.Black
	ListView1.TwoLinesLayout.Label.TextSize = 15
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub ShowList
	ModulKoneksi.koneksi
	
	ListView1.Clear
	ModulKoneksi.ResultS = ModulKoneksi.MHandler.Query("SELECT * FROM tb_pengajuan ORDER BY id_pengajuan ASC")
	
	For i = 0 To ModulKoneksi.ResultS.RowCount - 1
		ModulKoneksi.ResultS.Position = i
		ListView1.AddTwoLines(ModulKoneksi.ResultS.GetString2("id_pengajuan"),ModulKoneksi.ResultS.GetString("tgl_pengajuan"))
		
	Next
		ModulKoneksi.MHandler.Close
End Sub