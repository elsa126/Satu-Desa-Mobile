Type=StaticCode
Version=6
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
' Code module
' Version 1.09
'
' Modified: 15.06.2011 Markus Stipp
'	- Version control of database (GetDBVersion and SetDBVersion Subs)
'	- renamed cursor variables from c to cur since I often use a module named C for constants.
'
' Modified: 30.03.2012 Klaus Christl (klaus)
' - Added DeletRecord		deletes a record, code from Erel
' - Added UpdateRecord2 updates more than one field in a record, code from vasper

Sub Process_Globals
	
End Sub

'Copies a database file that was added in the Files tab. The database must be copied to a writable location.
'This method copies the database to the storage card. If the storage card is not available the file is copied to the internal folder.
'The target folder is returned.
'If the database file already exists then no copying is done.
Sub CopyDBFromAssets (FileName As String) As String
	Dim TargetDir As String
	If File.ExternalWritable Then TargetDir = File.DirDefaultExternal Else TargetDir = File.DirInternal
	If File.Exists(TargetDir, FileName) = False Then
		File.Copy(File.DirAssets, FileName, TargetDir, FileName)
	End If
	Return TargetDir
End Sub

