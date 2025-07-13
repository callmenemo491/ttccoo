package p353u6;

/* renamed from: u6.e */
/* loaded from: classes.dex */
public final class C6342e {

    /* renamed from: a */
    public static java.lang.Boolean f24790a;

    /* renamed from: b */
    public static java.lang.Boolean f24791b;

    /* renamed from: c */
    public static java.lang.Boolean f24792c;

    /* renamed from: d */
    public static java.lang.Boolean f24793d;

    @android.annotation.TargetApi(20)
    /* renamed from: a */
    public static boolean m12991a(@androidx.annotation.RecentlyNonNull android.content.Context r1) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.Boolean r0 = p353u6.C6342e.f24790a
            if (r0 != 0) goto L14
            java.lang.String r0 = "android.hardware.type.watch"
            boolean r1 = r1.hasSystemFeature(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            p353u6.C6342e.f24790a = r1
        L14:
            java.lang.Boolean r1 = p353u6.C6342e.f24790a
            boolean r1 = r1.booleanValue()
            return r1
    }

    @android.annotation.TargetApi(26)
    /* renamed from: b */
    public static boolean m12992b(@androidx.annotation.RecentlyNonNull android.content.Context r4) {
            boolean r0 = m12991a(r4)
            r1 = 0
            if (r0 == 0) goto L36
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            r3 = 1
            if (r0 < r2) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L35
            java.lang.Boolean r0 = p353u6.C6342e.f24791b
            if (r0 != 0) goto L27
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r0 = "cn.google"
            boolean r4 = r4.hasSystemFeature(r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            p353u6.C6342e.f24791b = r4
        L27:
            java.lang.Boolean r4 = p353u6.C6342e.f24791b
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L36
            boolean r4 = p353u6.C6345h.m12995a()
            if (r4 != 0) goto L36
        L35:
            return r3
        L36:
            return r1
    }
}
