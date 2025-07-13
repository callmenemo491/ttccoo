package p249o7;

/* renamed from: o7.u3 */
/* loaded from: classes.dex */
public final class C5113u3 {

    /* renamed from: a */
    public final com.google.android.gms.measurement.internal.C1113d f20024a;

    public C5113u3(p249o7.C5052m6 r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.measurement.internal.d r1 = r1.f19871l
            r0.f20024a = r1
            return
    }

    /* renamed from: a */
    public final boolean m11422a() {
            r4 = this;
            r0 = 0
            com.google.android.gms.measurement.internal.d r1 = r4.f20024a     // Catch: java.lang.Exception -> L30
            android.content.Context r1 = r1.f5710a     // Catch: java.lang.Exception -> L30
            w6.b r1 = p388w6.C6816c.m13887a(r1)     // Catch: java.lang.Exception -> L30
            if (r1 != 0) goto L19
            com.google.android.gms.measurement.internal.d r1 = r4.f20024a     // Catch: java.lang.Exception -> L30
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: java.lang.Exception -> L30
            o7.f3 r1 = r1.f5680n     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "Failed to get PackageManager for Install Referrer Play Store compatibility check"
            r1.m11169c(r2)     // Catch: java.lang.Exception -> L30
            return r0
        L19:
            java.lang.String r2 = "com.android.vending"
            r3 = 128(0x80, float:1.8E-43)
            android.content.Context r1 = r1.f26525a     // Catch: java.lang.Exception -> L30
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L30
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: java.lang.Exception -> L30
            int r1 = r1.versionCode     // Catch: java.lang.Exception -> L30
            r2 = 80837300(0x4d17ab4, float:4.924835E-36)
            if (r1 < r2) goto L2f
            r0 = 1
        L2f:
            return r0
        L30:
            r1 = move-exception
            com.google.android.gms.measurement.internal.d r2 = r4.f20024a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5680n
            java.lang.String r3 = "Failed to retrieve Play Store version for Install Referrer"
            r2.m11170d(r3, r1)
            return r0
    }
}
