package p184k6;

/* renamed from: k6.m */
/* loaded from: classes.dex */
public final class C3710m {

    /* renamed from: a */
    public static volatile p248o6.InterfaceC4941w0 f16421a;

    /* renamed from: b */
    public static final java.lang.Object f16422b = null;

    /* renamed from: c */
    public static android.content.Context f16423c;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p184k6.C3710m.f16422b = r0
            return
    }

    /* renamed from: a */
    public static p184k6.C3697a0 m8172a(java.lang.String r5, p184k6.AbstractBinderC3711n r6, boolean r7, boolean r8) {
            java.lang.String r0 = "Failed to get Google certificates from remote"
            java.lang.String r1 = "GoogleCertificates"
            m8174c()     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L40
            android.content.Context r2 = p184k6.C3710m.f16423c
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r2, r3)
            k6.z r2 = new k6.z
            r2.<init>(r5, r6, r7, r8)
            o6.w0 r8 = p184k6.C3710m.f16421a     // Catch: android.os.RemoteException -> L35
            android.content.Context r3 = p184k6.C3710m.f16423c     // Catch: android.os.RemoteException -> L35
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.os.RemoteException -> L35
            x6.b r4 = new x6.b     // Catch: android.os.RemoteException -> L35
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L35
            boolean r8 = r8.mo11084c0(r2, r4)     // Catch: android.os.RemoteException -> L35
            if (r8 == 0) goto L29
            k6.a0 r5 = p184k6.C3697a0.f16388d
            return r5
        L29:
            k6.o r8 = new k6.o
            r8.<init>(r7, r5, r6)
            k6.b0 r5 = new k6.b0
            r6 = 0
            r5.<init>(r8, r6)
            return r5
        L35:
            r5 = move-exception
            android.util.Log.e(r1, r0, r5)
            java.lang.String r6 = "module call"
            k6.a0 r5 = p184k6.C3697a0.m8158b(r6, r5)
            return r5
        L40:
            r5 = move-exception
            android.util.Log.e(r1, r0, r5)
            java.lang.String r6 = "module init: "
            java.lang.String r7 = r5.getMessage()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r8 = r7.length()
            if (r8 == 0) goto L59
            java.lang.String r6 = r6.concat(r7)
            goto L5f
        L59:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6)
            r6 = r7
        L5f:
            k6.a0 r5 = p184k6.C3697a0.m8158b(r6, r5)
            return r5
    }

    /* renamed from: b */
    public static p184k6.C3697a0 m8173b(java.lang.String r10, boolean r11, boolean r12) {
            java.lang.String r0 = "Failed to get Google certificates from remote"
            java.lang.String r1 = "GoogleCertificates"
            android.content.Context r2 = p184k6.C3710m.f16423c
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r2, r3)
            m8174c()     // Catch: com.google.android.gms.dynamite.DynamiteModule.C1102a -> L56
            k6.t r2 = new k6.t
            android.content.Context r3 = p184k6.C3710m.f16423c
            x6.b r8 = new x6.b
            r8.<init>(r3)
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            o6.w0 r10 = p184k6.C3710m.f16421a     // Catch: android.os.RemoteException -> L4f
            k6.v r10 = r10.mo11082M0(r2)     // Catch: android.os.RemoteException -> L4f
            boolean r11 = r10.f16437Y
            if (r11 == 0) goto L2c
            k6.a0 r10 = p184k6.C3697a0.f16388d
            return r10
        L2c:
            java.lang.String r11 = r10.f16438Z
            if (r11 != 0) goto L32
            java.lang.String r11 = "error checking package certificate"
        L32:
            int r10 = r10.f16439a0
            com.google.android.gms.common.a r10 = com.google.android.gms.common.EnumC1078a.m3040e(r10)
            com.google.android.gms.common.a r12 = com.google.android.gms.common.EnumC1078a.f5525a0
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto L4a
            android.content.pm.PackageManager$NameNotFoundException r10 = new android.content.pm.PackageManager$NameNotFoundException
            r10.<init>()
        L45:
            k6.a0 r10 = p184k6.C3697a0.m8158b(r11, r10)
            return r10
        L4a:
            k6.a0 r10 = p184k6.C3697a0.m8157a(r11)
            return r10
        L4f:
            r10 = move-exception
            android.util.Log.e(r1, r0, r10)
            java.lang.String r11 = "module call"
            goto L45
        L56:
            r10 = move-exception
            android.util.Log.e(r1, r0, r10)
            java.lang.String r11 = "module init: "
            java.lang.String r12 = r10.getMessage()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r0 = r12.length()
            if (r0 == 0) goto L6f
            java.lang.String r11 = r11.concat(r12)
            goto L75
        L6f:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r11)
            r11 = r12
        L75:
            k6.a0 r10 = p184k6.C3697a0.m8158b(r11, r10)
            return r10
    }

    /* renamed from: c */
    public static void m8174c() {
            o6.w0 r0 = p184k6.C3710m.f16421a
            if (r0 == 0) goto L5
            return
        L5:
            android.content.Context r0 = p184k6.C3710m.f16423c
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.Object r0 = p184k6.C3710m.f16422b
            monitor-enter(r0)
            o6.w0 r1 = p184k6.C3710m.f16421a     // Catch: java.lang.Throwable -> L41
            if (r1 != 0) goto L3f
            android.content.Context r1 = p184k6.C3710m.f16423c     // Catch: java.lang.Throwable -> L41
            com.google.android.gms.dynamite.DynamiteModule$b r2 = com.google.android.gms.dynamite.DynamiteModule.f5641k     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "com.google.android.gms.googlecertificates"
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.m3108c(r1, r2, r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "com.google.android.gms.common.GoogleCertificatesImpl"
            android.os.IBinder r1 = r1.m3118b(r2)     // Catch: java.lang.Throwable -> L41
            int r2 = p248o6.AbstractBinderC4939v0.f19546a     // Catch: java.lang.Throwable -> L41
            if (r1 != 0) goto L29
            r1 = 0
            goto L3d
        L29:
            java.lang.String r2 = "com.google.android.gms.common.internal.IGoogleCertificatesApi"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch: java.lang.Throwable -> L41
            boolean r3 = r2 instanceof p248o6.InterfaceC4941w0     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L37
            r1 = r2
            o6.w0 r1 = (p248o6.InterfaceC4941w0) r1     // Catch: java.lang.Throwable -> L41
            goto L3d
        L37:
            o6.x0 r2 = new o6.x0     // Catch: java.lang.Throwable -> L41
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L41
            r1 = r2
        L3d:
            p184k6.C3710m.f16421a = r1     // Catch: java.lang.Throwable -> L41
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            return
        L41:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r1
    }
}
