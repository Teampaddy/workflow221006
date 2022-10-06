using System;
using System.Collections.Generic;

public class VCMapping
{
    Dictionary<string, string> m =
    new Dictionary<string, string>();

    public VCMappings()
    {
        m.Add("Back", "back");
        m.Add("Text", "text");
        m.Add("Yes", "yes");
        m.Add("No", "no");
        m.Add("NA", "NA");
        m.Add("Camera", "Camera");
        m.Add("ExitAssetManager", "exit");
        m.Add("WorkflowListBack", "back");
        m.Add("RemoteAdviser", "call");
        m.Add("QRScanner", "qr scanner");
    }
}
