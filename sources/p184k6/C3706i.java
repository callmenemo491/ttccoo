package p184k6;

/* renamed from: k6.i */
/* loaded from: classes.dex */
public class C3706i {

    /* renamed from: c */
    public static p184k6.C3706i f16415c;

    /* renamed from: a */
    public final android.content.Context f16416a;

    /* renamed from: b */
    public volatile java.lang.String f16417b;

    public C3706i(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f16416a = r1
            return
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: a */
    public static p184k6.C3706i m8168a(@androidx.annotation.RecentlyNonNull android.content.Context r4) {
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.Class<k6.i> r0 = p184k6.C3706i.class
            monitor-enter(r0)
            k6.i r1 = p184k6.C3706i.f16415c     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L30
            o6.w0 r1 = p184k6.C3710m.f16421a     // Catch: java.lang.Throwable -> L34
            java.lang.Class<k6.m> r1 = p184k6.C3710m.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L34
            android.content.Context r2 = p184k6.C3710m.f16423c     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L1d
            android.content.Context r2 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L2d
            p184k6.C3710m.f16423c = r2     // Catch: java.lang.Throwable -> L2d
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            goto L25
        L1d:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r3 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r3)     // Catch: java.lang.Throwable -> L2d
            goto L1b
        L25:
            k6.i r1 = new k6.i     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L34
            p184k6.C3706i.f16415c = r1     // Catch: java.lang.Throwable -> L34
            goto L30
        L2d:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            k6.i r4 = p184k6.C3706i.f16415c
            return r4
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
    }

    /* renamed from: c */
    public static p184k6.AbstractBinderC3711n m8169c(android.content.pm.PackageInfo r3, p184k6.AbstractBinderC3711n... r4) {
            android.content.pm.Signature[] r0 = r3.signatures
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.length
            r2 = 1
            if (r0 == r2) goto L12
            java.lang.String r3 = "GoogleSignatureVerifier"
            java.lang.String r4 = "Package has more than one signature."
            android.util.Log.w(r3, r4)
            return r1
        L12:
            k6.q r0 = new k6.q
            android.content.pm.Signature[] r3 = r3.signatures
            r2 = 0
            r3 = r3[r2]
            byte[] r3 = r3.toByteArray()
            r0.<init>(r3)
        L20:
            int r3 = r4.length
            if (r2 >= r3) goto L31
            r3 = r4[r2]
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2e
            r3 = r4[r2]
            return r3
        L2e:
            int r2 = r2 + 1
            goto L20
        L31:
            return r1
    }

    /* renamed from: d */
    public static boolean m8170d(@androidx.annotation.RecentlyNonNull android.content.pm.PackageInfo r3, boolean r4) {
            r0 = 0
            if (r3 == 0) goto L20
            android.content.pm.Signature[] r1 = r3.signatures
            if (r1 == 0) goto L20
            r1 = 1
            if (r4 == 0) goto L11
            k6.n[] r4 = p184k6.C3716s.f16431a
            k6.n r3 = m8169c(r3, r4)
            goto L1d
        L11:
            k6.n[] r4 = new p184k6.AbstractBinderC3711n[r1]
            k6.n[] r2 = p184k6.C3716s.f16431a
            r2 = r2[r0]
            r4[r0] = r2
            k6.n r3 = m8169c(r3, r4)
        L1d:
            if (r3 == 0) goto L20
            return r1
        L20:
            return r0
    }

    /* renamed from: b */
    public boolean m8171b(int r11) {
            r10 = this;
            android.content.Context r0 = r10.f16416a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String[] r11 = r0.getPackagesForUid(r11)
            if (r11 == 0) goto L109
            int r0 = r11.length
            if (r0 != 0) goto L11
            goto L109
        L11:
            r0 = 0
            int r1 = r11.length
            r2 = 0
            r3 = 0
        L15:
            if (r3 >= r1) goto L103
            r0 = r11[r3]
            java.lang.String r4 = "null pkg"
            if (r0 != 0) goto L23
            k6.a0 r0 = p184k6.C3697a0.m8157a(r4)
            goto Lf6
        L23:
            java.lang.String r5 = r10.f16417b
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L2f
            k6.a0 r0 = p184k6.C3697a0.f16388d
            goto Lf6
        L2f:
            o6.w0 r5 = p184k6.C3710m.f16421a
            android.os.StrictMode$ThreadPolicy r5 = android.os.StrictMode.allowThreadDiskReads()
            p184k6.C3710m.m8174c()     // Catch: java.lang.Throwable -> L42 android.os.RemoteException -> L45 com.google.android.gms.dynamite.DynamiteModule.C1102a -> L47
            o6.w0 r6 = p184k6.C3710m.f16421a     // Catch: java.lang.Throwable -> L42 android.os.RemoteException -> L45 com.google.android.gms.dynamite.DynamiteModule.C1102a -> L47
            boolean r6 = r6.mo11083a()     // Catch: java.lang.Throwable -> L42 android.os.RemoteException -> L45 com.google.android.gms.dynamite.DynamiteModule.C1102a -> L47
            android.os.StrictMode.setThreadPolicy(r5)
            goto L53
        L42:
            r11 = move-exception
            goto Lff
        L45:
            r6 = move-exception
            goto L48
        L47:
            r6 = move-exception
        L48:
            java.lang.String r7 = "GoogleCertificates"
            java.lang.String r8 = "Failed to get Google certificates from remote"
            android.util.Log.e(r7, r8, r6)     // Catch: java.lang.Throwable -> L42
            android.os.StrictMode.setThreadPolicy(r5)
            r6 = 0
        L53:
            if (r6 == 0) goto L6d
            android.content.Context r4 = r10.f16416a
            boolean r4 = p184k6.C3705h.m8167a(r4)
            android.os.StrictMode$ThreadPolicy r5 = android.os.StrictMode.allowThreadDiskReads()
            k6.a0 r4 = p184k6.C3710m.m8173b(r0, r4, r2)     // Catch: java.lang.Throwable -> L68
            android.os.StrictMode.setThreadPolicy(r5)
            goto Ld7
        L68:
            r11 = move-exception
            android.os.StrictMode.setThreadPolicy(r5)
            throw r11
        L6d:
            android.content.Context r5 = r10.f16416a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ldf
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ldf
            r6 = 64
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r0, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ldf
            android.content.Context r6 = r10.f16416a
            boolean r6 = p184k6.C3705h.m8167a(r6)
            if (r5 != 0) goto L82
            goto Ld3
        L82:
            android.content.pm.Signature[] r4 = r5.signatures
            if (r4 == 0) goto Ld1
            int r4 = r4.length
            r7 = 1
            if (r4 == r7) goto L8b
            goto Ld1
        L8b:
            k6.q r4 = new k6.q
            android.content.pm.Signature[] r8 = r5.signatures
            r8 = r8[r2]
            byte[] r8 = r8.toByteArray()
            r4.<init>(r8)
            java.lang.String r8 = r5.packageName
            android.os.StrictMode$ThreadPolicy r9 = android.os.StrictMode.allowThreadDiskReads()
            k6.a0 r6 = p184k6.C3710m.m8172a(r8, r4, r6, r2)     // Catch: java.lang.Throwable -> Lcc
            android.os.StrictMode.setThreadPolicy(r9)
            boolean r9 = r6.f16389a
            if (r9 == 0) goto Lca
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo
            if (r5 == 0) goto Lca
            int r5 = r5.flags
            r5 = r5 & 2
            if (r5 == 0) goto Lca
            android.os.StrictMode$ThreadPolicy r5 = android.os.StrictMode.allowThreadDiskReads()
            k6.a0 r4 = p184k6.C3710m.m8172a(r8, r4, r2, r7)     // Catch: java.lang.Throwable -> Lc5
            android.os.StrictMode.setThreadPolicy(r5)
            boolean r4 = r4.f16389a
            if (r4 == 0) goto Lca
            java.lang.String r4 = "debuggable release cert app rejected"
            goto Ld3
        Lc5:
            r11 = move-exception
            android.os.StrictMode.setThreadPolicy(r5)
            throw r11
        Lca:
            r4 = r6
            goto Ld7
        Lcc:
            r11 = move-exception
            android.os.StrictMode.setThreadPolicy(r9)
            throw r11
        Ld1:
            java.lang.String r4 = "single cert required"
        Ld3:
            k6.a0 r4 = p184k6.C3697a0.m8157a(r4)
        Ld7:
            boolean r5 = r4.f16389a
            if (r5 == 0) goto Ldd
            r10.f16417b = r0
        Ldd:
            r0 = r4
            goto Lf6
        Ldf:
            r4 = move-exception
            java.lang.String r5 = "no pkg "
            int r6 = r0.length()
            if (r6 == 0) goto Led
            java.lang.String r0 = r5.concat(r0)
            goto Lf2
        Led:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
        Lf2:
            k6.a0 r0 = p184k6.C3697a0.m8158b(r0, r4)
        Lf6:
            boolean r4 = r0.f16389a
            if (r4 == 0) goto Lfb
            goto L10f
        Lfb:
            int r3 = r3 + 1
            goto L15
        Lff:
            android.os.StrictMode.setThreadPolicy(r5)
            throw r11
        L103:
            java.lang.String r11 = "null reference"
            java.util.Objects.requireNonNull(r0, r11)
            goto L10f
        L109:
            java.lang.String r11 = "no pkgs"
            k6.a0 r0 = p184k6.C3697a0.m8157a(r11)
        L10f:
            boolean r11 = r0.f16389a
            if (r11 != 0) goto L131
            r11 = 3
            java.lang.String r1 = "GoogleCertificatesRslt"
            boolean r11 = android.util.Log.isLoggable(r1, r11)
            if (r11 == 0) goto L131
            java.lang.Throwable r11 = r0.f16391c
            if (r11 == 0) goto L12a
            java.lang.String r11 = r0.mo8159c()
            java.lang.Throwable r2 = r0.f16391c
            android.util.Log.d(r1, r11, r2)
            goto L131
        L12a:
            java.lang.String r11 = r0.mo8159c()
            android.util.Log.d(r1, r11)
        L131:
            boolean r11 = r0.f16389a
            return r11
    }
}
