To enable the app to start on boot on android devices:

1) Export a gradle project from unity.
2) insert the MyReceiver.java fileinto the exported project at    
	Workflow\src\main\java\com\utilityar\workflow
3) If any new headsets are being used, add their model string to the model list in the MyReceiver class.
4) Build the android studio project as normal.

