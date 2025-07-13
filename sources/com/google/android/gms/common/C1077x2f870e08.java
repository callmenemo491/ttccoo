package com.google.android.gms.common;

@com.google.android.gms.common.annotation.KeepName
/* renamed from: com.google.android.gms.common.GooglePlayServicesMissingManifestValueException */
/* loaded from: classes.dex */
public final class C1077x2f870e08 extends com.google.android.gms.common.C1076x8682a575 {
    public C1077x2f870e08() {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r2.<init>(r0, r1)
            return
    }
}
