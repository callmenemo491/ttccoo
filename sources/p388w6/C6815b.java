package p388w6;

/* renamed from: w6.b */
/* loaded from: classes.dex */
public class C6815b {

    /* renamed from: a */
    public final android.content.Context f26525a;

    public C6815b(@androidx.annotation.RecentlyNonNull android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f26525a = r1
            return
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: a */
    public android.content.pm.ApplicationInfo m13884a(@androidx.annotation.RecentlyNonNull java.lang.String r2, int r3) {
            r1 = this;
            android.content.Context r0 = r1.f26525a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo(r2, r3)
            return r2
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: b */
    public android.content.pm.PackageInfo m13885b(@androidx.annotation.RecentlyNonNull java.lang.String r2, int r3) {
            r1 = this;
            android.content.Context r0 = r1.f26525a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r3)
            return r2
    }

    /* renamed from: c */
    public boolean m13886c() {
            r2 = this;
            int r0 = android.os.Binder.getCallingUid()
            int r1 = android.os.Process.myUid()
            if (r0 != r1) goto L11
            android.content.Context r0 = r2.f26525a
            boolean r0 = p388w6.C6814a.m13883a(r0)
            return r0
        L11:
            boolean r0 = p353u6.C6345h.m12995a()
            if (r0 == 0) goto L32
            android.content.Context r0 = r2.f26525a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r1 = android.os.Binder.getCallingUid()
            java.lang.String r0 = r0.getNameForUid(r1)
            if (r0 == 0) goto L32
            android.content.Context r1 = r2.f26525a
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            boolean r0 = r1.isInstantApp(r0)
            return r0
        L32:
            r0 = 0
            return r0
    }
}
