package p184k6;

/* renamed from: k6.h */
/* loaded from: classes.dex */
public class C3705h {

    /* renamed from: a */
    public static boolean f16411a = false;

    /* renamed from: b */
    public static boolean f16412b = false;

    /* renamed from: c */
    public static final java.util.concurrent.atomic.AtomicBoolean f16413c = null;

    /* renamed from: d */
    public static final java.util.concurrent.atomic.AtomicBoolean f16414d = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            p184k6.C3705h.f16413c = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            p184k6.C3705h.f16414d = r0
            return
    }

    /* renamed from: a */
    public static boolean m8167a(@androidx.annotation.RecentlyNonNull android.content.Context r5) {
            boolean r0 = p184k6.C3705h.f16412b
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L3f
            w6.b r0 = p388w6.C6816c.m13887a(r5)     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L31
            java.lang.String r3 = "com.google.android.gms"
            r4 = 64
            android.content.Context r0 = r0.f26525a     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L31
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L31
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r4)     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L31
            p184k6.C3706i.m8168a(r5)     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L31
            if (r0 == 0) goto L2c
            boolean r5 = p184k6.C3706i.m8170d(r0, r1)     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L31
            if (r5 != 0) goto L2c
            boolean r5 = p184k6.C3706i.m8170d(r0, r2)     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L31
            if (r5 == 0) goto L2c
            p184k6.C3705h.f16411a = r2     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L31
            goto L39
        L2c:
            p184k6.C3705h.f16411a = r1     // Catch: java.lang.Throwable -> L2f android.content.pm.PackageManager.NameNotFoundException -> L31
            goto L39
        L2f:
            r5 = move-exception
            goto L3c
        L31:
            r5 = move-exception
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r3 = "Cannot find Google Play services package name."
            android.util.Log.w(r0, r3, r5)     // Catch: java.lang.Throwable -> L2f
        L39:
            p184k6.C3705h.f16412b = r2
            goto L3f
        L3c:
            p184k6.C3705h.f16412b = r2
            throw r5
        L3f:
            boolean r5 = p184k6.C3705h.f16411a
            if (r5 != 0) goto L4f
            java.lang.String r5 = android.os.Build.TYPE
            java.lang.String r0 = "user"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L4e
            goto L4f
        L4e:
            return r1
        L4f:
            return r2
    }
}
