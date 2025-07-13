package bb;

/* renamed from: bb.a */
/* loaded from: classes.dex */
public class C0730a {

    /* renamed from: a */
    public final android.content.Context f4006a;

    /* renamed from: b */
    public final android.content.SharedPreferences f4007b;

    /* renamed from: c */
    public final p342ta.InterfaceC6205c f4008c;

    /* renamed from: d */
    public boolean f4009d;

    public C0730a(android.content.Context r4, java.lang.String r5, p342ta.InterfaceC6205c r6) {
            r3 = this;
            r3.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto La
            goto L14
        La:
            java.lang.Object r2 = p046d0.C1259a.f6733a
            if (r0 < r1) goto L13
            android.content.Context r4 = p046d0.C1259a.d.m3715a(r4)
            goto L14
        L13:
            r4 = 0
        L14:
            r3.f4006a = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "com.google.firebase.common.prefs:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r0 = 0
            android.content.SharedPreferences r5 = r4.getSharedPreferences(r5, r0)
            r3.f4007b = r5
            r3.f4008c = r6
            java.lang.String r6 = "firebase_data_collection_default_enabled"
            boolean r0 = r5.contains(r6)
            r1 = 1
            if (r0 == 0) goto L3e
            boolean r4 = r5.getBoolean(r6, r1)
            goto L61
        L3e:
            android.content.pm.PackageManager r5 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            if (r5 == 0) goto L60
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            r0 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r4 = r5.getApplicationInfo(r4, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            if (r4 == 0) goto L60
            android.os.Bundle r5 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            if (r5 == 0) goto L60
            boolean r5 = r5.containsKey(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            if (r5 == 0) goto L60
            android.os.Bundle r4 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            boolean r1 = r4.getBoolean(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
        L60:
            r4 = r1
        L61:
            r3.f4009d = r4
            return
    }
}
