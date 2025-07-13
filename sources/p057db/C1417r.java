package p057db;

/* renamed from: db.r */
/* loaded from: classes.dex */
public class C1417r {

    /* renamed from: a */
    public final p251o9.C5180d f7085a;

    /* renamed from: b */
    public final p057db.C1421v f7086b;

    /* renamed from: c */
    public final p164j6.C3429c f7087c;

    /* renamed from: d */
    public final p392wa.InterfaceC6823b<p095fb.InterfaceC2137g> f7088d;

    /* renamed from: e */
    public final p392wa.InterfaceC6823b<ua.InterfaceC6369d> f7089e;

    /* renamed from: f */
    public final p412xa.InterfaceC7011d f7090f;

    public C1417r(p251o9.C5180d r3, p057db.C1421v r4, p392wa.InterfaceC6823b<p095fb.InterfaceC2137g> r5, p392wa.InterfaceC6823b<ua.InterfaceC6369d> r6, p412xa.InterfaceC7011d r7) {
            r2 = this;
            j6.c r0 = new j6.c
            r3.m11497a()
            android.content.Context r1 = r3.f20312a
            r0.<init>(r1)
            r2.<init>()
            r2.f7085a = r3
            r2.f7086b = r4
            r2.f7087c = r0
            r2.f7088d = r5
            r2.f7089e = r6
            r2.f7090f = r7
            return
    }

    /* renamed from: a */
    public final p327s7.AbstractC5985i<java.lang.String> m3941a(p327s7.AbstractC5985i<android.os.Bundle> r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = p057db.ExecutorC1416q.f7084Y
            h7.rb r1 = new h7.rb
            r1.<init>(r2)
            s7.i r3 = r3.mo12447e(r0, r1)
            return r3
    }

    /* renamed from: b */
    public final p327s7.AbstractC5985i<android.os.Bundle> m3942b(java.lang.String r3, java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
            r2 = this;
            java.lang.String r0 = "scope"
            r6.putString(r0, r5)
            java.lang.String r5 = "sender"
            r6.putString(r5, r4)
            java.lang.String r5 = "subtype"
            r6.putString(r5, r4)
            java.lang.String r4 = "appid"
            r6.putString(r4, r3)
            java.lang.String r3 = "gmp_app_id"
            o9.d r4 = r2.f7085a
            r4.m11497a()
            o9.h r4 = r4.f20314c
            java.lang.String r4 = r4.f20325b
            r6.putString(r3, r4)
            java.lang.String r3 = "gmsv"
            db.v r4 = r2.f7086b
            monitor-enter(r4)
            int r5 = r4.f7098d     // Catch: java.lang.Throwable -> L162
            if (r5 != 0) goto L37
            java.lang.String r5 = "com.google.android.gms"
            android.content.pm.PackageInfo r5 = r4.m3948c(r5)     // Catch: java.lang.Throwable -> L162
            if (r5 == 0) goto L37
            int r5 = r5.versionCode     // Catch: java.lang.Throwable -> L162
            r4.f7098d = r5     // Catch: java.lang.Throwable -> L162
        L37:
            int r5 = r4.f7098d     // Catch: java.lang.Throwable -> L162
            monitor-exit(r4)
            java.lang.String r4 = java.lang.Integer.toString(r5)
            r6.putString(r3, r4)
            java.lang.String r3 = "osv"
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r4 = java.lang.Integer.toString(r4)
            r6.putString(r3, r4)
            java.lang.String r3 = "app_ver"
            db.v r4 = r2.f7086b
            java.lang.String r4 = r4.m3947a()
            r6.putString(r3, r4)
            java.lang.String r3 = "app_ver_name"
            db.v r4 = r2.f7086b
            monitor-enter(r4)
            java.lang.String r5 = r4.f7097c     // Catch: java.lang.Throwable -> L15f
            if (r5 != 0) goto L63
            r4.m3950e()     // Catch: java.lang.Throwable -> L15f
        L63:
            java.lang.String r5 = r4.f7097c     // Catch: java.lang.Throwable -> L15f
            monitor-exit(r4)
            r6.putString(r3, r5)
            java.lang.String r3 = "firebase-app-name-hash"
            o9.d r4 = r2.f7085a
            r4.m11497a()
            java.lang.String r4 = r4.f20313b
            java.lang.String r5 = "SHA-1"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch: java.security.NoSuchAlgorithmException -> L87
            byte[] r4 = r4.getBytes()     // Catch: java.security.NoSuchAlgorithmException -> L87
            byte[] r4 = r5.digest(r4)     // Catch: java.security.NoSuchAlgorithmException -> L87
            r5 = 11
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r5)     // Catch: java.security.NoSuchAlgorithmException -> L87
            goto L89
        L87:
            java.lang.String r4 = "[HASH-ERROR]"
        L89:
            r6.putString(r3, r4)
            r3 = 0
            xa.d r4 = r2.f7090f     // Catch: java.lang.InterruptedException -> Lb1 java.util.concurrent.ExecutionException -> Lb3
            s7.i r4 = r4.mo14154a(r3)     // Catch: java.lang.InterruptedException -> Lb1 java.util.concurrent.ExecutionException -> Lb3
            java.lang.Object r4 = p327s7.C5988l.m12460a(r4)     // Catch: java.lang.InterruptedException -> Lb1 java.util.concurrent.ExecutionException -> Lb3
            com.google.firebase.installations.a r4 = (com.google.firebase.installations.AbstractC1244a) r4     // Catch: java.lang.InterruptedException -> Lb1 java.util.concurrent.ExecutionException -> Lb3
            java.lang.String r4 = r4.mo3650a()     // Catch: java.lang.InterruptedException -> Lb1 java.util.concurrent.ExecutionException -> Lb3
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.InterruptedException -> Lb1 java.util.concurrent.ExecutionException -> Lb3
            if (r5 != 0) goto La9
            java.lang.String r5 = "Goog-Firebase-Installations-Auth"
            r6.putString(r5, r4)     // Catch: java.lang.InterruptedException -> Lb1 java.util.concurrent.ExecutionException -> Lb3
            goto Lbb
        La9:
            java.lang.String r4 = "FirebaseMessaging"
            java.lang.String r5 = "FIS auth token is empty"
            android.util.Log.w(r4, r5)     // Catch: java.lang.InterruptedException -> Lb1 java.util.concurrent.ExecutionException -> Lb3
            goto Lbb
        Lb1:
            r4 = move-exception
            goto Lb4
        Lb3:
            r4 = move-exception
        Lb4:
            java.lang.String r5 = "FirebaseMessaging"
            java.lang.String r0 = "Failed to get FIS auth token"
            android.util.Log.e(r5, r0, r4)
        Lbb:
            java.lang.String r4 = "cliv"
            java.lang.String r5 = "fcm-22.0.0"
            r6.putString(r4, r5)
            wa.b<ua.d> r4 = r2.f7089e
            java.lang.Object r4 = r4.get()
            ua.d r4 = (ua.InterfaceC6369d) r4
            wa.b<fb.g> r5 = r2.f7088d
            java.lang.Object r5 = r5.get()
            fb.g r5 = (p095fb.InterfaceC2137g) r5
            r0 = 1
            if (r4 == 0) goto Lf5
            if (r5 == 0) goto Lf5
            java.lang.String r1 = "fire-iid"
            int r4 = r4.mo13015a(r1)
            if (r4 == r0) goto Lf5
            java.lang.String r1 = "Firebase-Client-Log-Type"
            int r4 = p365v.C6480g.m13148b(r4)
            java.lang.String r4 = java.lang.Integer.toString(r4)
            r6.putString(r1, r4)
            java.lang.String r4 = "Firebase-Client"
            java.lang.String r5 = r5.mo5694a()
            r6.putString(r4, r5)
        Lf5:
            j6.c r4 = r2.f7087c
            j6.o r5 = r4.f14878c
            monitor-enter(r5)
            int r1 = r5.f14910b     // Catch: java.lang.Throwable -> L15c
            if (r1 != 0) goto L10a
            java.lang.String r1 = "com.google.android.gms"
            android.content.pm.PackageInfo r1 = r5.m7910b(r1)     // Catch: java.lang.Throwable -> L15c
            if (r1 == 0) goto L10a
            int r1 = r1.versionCode     // Catch: java.lang.Throwable -> L15c
            r5.f14910b = r1     // Catch: java.lang.Throwable -> L15c
        L10a:
            int r1 = r5.f14910b     // Catch: java.lang.Throwable -> L15c
            monitor-exit(r5)
            r5 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r1 < r5) goto L135
            android.content.Context r3 = r4.f14877b
            j6.h r3 = p164j6.C3434h.m7889m(r3)
            j6.p r4 = new j6.p
            monitor-enter(r3)
            int r5 = r3.f14895c0     // Catch: java.lang.Throwable -> L132
            int r0 = r5 + 1
            r3.f14895c0 = r0     // Catch: java.lang.Throwable -> L132
            monitor-exit(r3)
            r4.<init>(r5, r6)
            s7.i r3 = r3.m7900n(r4)
            java.util.concurrent.Executor r4 = p164j6.ExecutorC3447u.f14918Y
            s7.a r5 = p164j6.C3443q.f14912Y
            s7.i r3 = r3.mo12447e(r4, r5)
            goto L15b
        L132:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L135:
            j6.o r5 = r4.f14878c
            int r5 = r5.m7909a()
            if (r5 == 0) goto L13e
            r3 = 1
        L13e:
            if (r3 != 0) goto L14c
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "MISSING_INSTANCEID_SERVICE"
            r3.<init>(r4)
            s7.i r3 = p327s7.C5988l.m12463d(r3)
            goto L15b
        L14c:
            s7.i r3 = r4.m7886b(r6)
            java.util.concurrent.Executor r5 = p164j6.ExecutorC3447u.f14918Y
            androidx.appcompat.widget.x r0 = new androidx.appcompat.widget.x
            r0.<init>(r4, r6)
            s7.i r3 = r3.mo12449g(r5, r0)
        L15b:
            return r3
        L15c:
            r3 = move-exception
            monitor-exit(r5)
            throw r3
        L15f:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        L162:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
    }
}
