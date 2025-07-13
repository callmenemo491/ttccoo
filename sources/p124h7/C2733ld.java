package p124h7;

/* renamed from: h7.ld */
/* loaded from: classes.dex */
public final class C2733ld {

    /* renamed from: a */
    public final java.lang.String f11747a;

    /* renamed from: b */
    public final java.lang.String f11748b;

    public C2733ld(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "FBA-PackageInfo"
            r3.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            r3.f11747a = r5
            r1 = 0
            byte[] r4 = p353u6.C6338a.m12988a(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            if (r4 != 0) goto L2d
            java.lang.String r4 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "single cert required: "
            int r2 = r4.length()
            if (r2 == 0) goto L22
            java.lang.String r4 = r5.concat(r4)
            goto L27
        L22:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r5)
        L27:
            android.util.Log.e(r0, r4)
            r3.f11748b = r1
            return
        L2d:
            r5 = 0
            java.lang.String r4 = p353u6.C6343f.m12993a(r4, r5)
            r3.f11748b = r4
            return
        L35:
            java.lang.String r4 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "no pkg: "
            int r2 = r4.length()
            if (r2 == 0) goto L46
            java.lang.String r4 = r5.concat(r4)
            goto L4b
        L46:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r5)
        L4b:
            android.util.Log.e(r0, r4)
            r3.f11748b = r1
            return
    }
}
