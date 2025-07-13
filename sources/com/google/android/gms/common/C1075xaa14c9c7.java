package com.google.android.gms.common;

@com.google.android.gms.common.annotation.KeepName
/* renamed from: com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException */
/* loaded from: classes.dex */
public final class C1075xaa14c9c7 extends com.google.android.gms.common.C1076x8682a575 {
    public C1075xaa14c9c7(int r4) {
            r3 = this;
            int r0 = p184k6.C3703f.f16408a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 320(0x140, float:4.48E-43)
            r1.<init>(r2)
            java.lang.String r2 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " but found "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r4, r0)
            return
    }
}
