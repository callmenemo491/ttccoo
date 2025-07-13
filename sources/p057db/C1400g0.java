package p057db;

/* renamed from: db.g0 */
/* loaded from: classes.dex */
public class C1400g0 {

    /* renamed from: j */
    public static final long f7037j = 0;

    /* renamed from: k */
    public static final /* synthetic */ int f7038k = 0;

    /* renamed from: a */
    public final android.content.Context f7039a;

    /* renamed from: b */
    public final p057db.C1421v f7040b;

    /* renamed from: c */
    public final p057db.C1417r f7041c;

    /* renamed from: d */
    public final com.google.firebase.messaging.FirebaseMessaging f7042d;

    /* renamed from: e */
    public final p412xa.InterfaceC7011d f7043e;

    /* renamed from: f */
    public final java.util.Map<java.lang.String, java.util.ArrayDeque<p327s7.C5986j<java.lang.Void>>> f7044f;

    /* renamed from: g */
    public final java.util.concurrent.ScheduledExecutorService f7045g;

    /* renamed from: h */
    public boolean f7046h;

    /* renamed from: i */
    public final p057db.C1396e0 f7047i;

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            r1 = 8
            long r0 = r0.toSeconds(r1)
            p057db.C1400g0.f7037j = r0
            return
    }

    public C1400g0(com.google.firebase.messaging.FirebaseMessaging r2, p412xa.InterfaceC7011d r3, p057db.C1421v r4, p057db.C1396e0 r5, p057db.C1417r r6, android.content.Context r7, java.util.concurrent.ScheduledExecutorService r8) {
            r1 = this;
            r1.<init>()
            s.a r0 = new s.a
            r0.<init>()
            r1.f7044f = r0
            r0 = 0
            r1.f7046h = r0
            r1.f7042d = r2
            r1.f7043e = r3
            r1.f7040b = r4
            r1.f7047i = r5
            r1.f7041c = r6
            r1.f7039a = r7
            r1.f7045g = r8
            return
    }

    /* renamed from: a */
    public static <T> T m3918a(p327s7.AbstractC5985i<T> r3) {
            r0 = 30
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L9 java.lang.InterruptedException -> Lb java.util.concurrent.ExecutionException -> L14
            java.lang.Object r3 = p327s7.C5988l.m12461b(r3, r0, r2)     // Catch: java.util.concurrent.TimeoutException -> L9 java.lang.InterruptedException -> Lb java.util.concurrent.ExecutionException -> L14
            return r3
        L9:
            r3 = move-exception
            goto Lc
        Lb:
            r3 = move-exception
        Lc:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "SERVICE_NOT_AVAILABLE"
            r0.<init>(r1, r3)
            throw r0
        L14:
            r3 = move-exception
            java.lang.Throwable r0 = r3.getCause()
            boolean r1 = r0 instanceof java.io.IOException
            if (r1 != 0) goto L2a
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L24
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L24:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r3)
            throw r0
        L2a:
            java.io.IOException r0 = (java.io.IOException) r0
            throw r0
    }

    /* renamed from: d */
    public static boolean m3919d() {
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L19
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r2 != r5) goto L1a
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L18
            goto L19
        L18:
            return r3
        L19:
            r3 = 1
        L1a:
            return r3
    }

    /* renamed from: b */
    public final void m3920b(java.lang.String r8) {
            r7 = this;
            xa.d r0 = r7.f7043e
            s7.i r0 = r0.mo14165r()
            java.lang.Object r0 = m3918a(r0)
            java.lang.String r0 = (java.lang.String) r0
            db.r r1 = r7.f7041c
            com.google.firebase.messaging.FirebaseMessaging r2 = r7.f7042d
            java.lang.String r2 = r2.m3653a()
            java.util.Objects.requireNonNull(r1)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = java.lang.String.valueOf(r8)
            int r5 = r4.length()
            java.lang.String r6 = "/topics/"
            if (r5 == 0) goto L2d
            java.lang.String r4 = r6.concat(r4)
            goto L32
        L2d:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
        L32:
            java.lang.String r5 = "gcm.topic"
            r3.putString(r5, r4)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r4 = r8.length()
            if (r4 == 0) goto L46
            java.lang.String r8 = r6.concat(r8)
            goto L4b
        L46:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r6)
        L4b:
            s7.i r8 = r1.m3942b(r0, r2, r8, r3)
            s7.i r8 = r1.m3941a(r8)
            m3918a(r8)
            return
    }

    /* renamed from: c */
    public final void m3921c(java.lang.String r8) {
            r7 = this;
            xa.d r0 = r7.f7043e
            s7.i r0 = r0.mo14165r()
            java.lang.Object r0 = m3918a(r0)
            java.lang.String r0 = (java.lang.String) r0
            db.r r1 = r7.f7041c
            com.google.firebase.messaging.FirebaseMessaging r2 = r7.f7042d
            java.lang.String r2 = r2.m3653a()
            java.util.Objects.requireNonNull(r1)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = java.lang.String.valueOf(r8)
            int r5 = r4.length()
            java.lang.String r6 = "/topics/"
            if (r5 == 0) goto L2d
            java.lang.String r4 = r6.concat(r4)
            goto L32
        L2d:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
        L32:
            java.lang.String r5 = "gcm.topic"
            r3.putString(r5, r4)
            java.lang.String r4 = "delete"
            java.lang.String r5 = "1"
            r3.putString(r4, r5)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r4 = r8.length()
            if (r4 == 0) goto L4d
            java.lang.String r8 = r6.concat(r8)
            goto L52
        L4d:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r6)
        L52:
            s7.i r8 = r1.m3942b(r0, r2, r8, r3)
            s7.i r8 = r1.m3941a(r8)
            m3918a(r8)
            return
    }

    /* renamed from: e */
    public synchronized void m3922e(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            r0.f7046h = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: f */
    public boolean m3923f() {
            r8 = this;
        L0:
            monitor-enter(r8)
            db.e0 r0 = r8.f7047i     // Catch: java.lang.Throwable -> L162
            db.d0 r0 = r0.m3916a()     // Catch: java.lang.Throwable -> L162
            r1 = 1
            if (r0 != 0) goto L19
            boolean r0 = m3919d()     // Catch: java.lang.Throwable -> L162
            if (r0 == 0) goto L17
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r2 = "topic sync succeeded"
            android.util.Log.d(r0, r2)     // Catch: java.lang.Throwable -> L162
        L17:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L162
            return r1
        L19:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L162
            java.lang.String r2 = "FirebaseMessaging"
            r3 = 0
            java.lang.String r4 = r0.f7017b     // Catch: java.io.IOException -> Lc3
            int r5 = r4.hashCode()     // Catch: java.io.IOException -> Lc3
            r6 = 83
            if (r5 == r6) goto L36
            r6 = 85
            if (r5 == r6) goto L2c
            goto L40
        L2c:
            java.lang.String r5 = "U"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L40
            r4 = 1
            goto L41
        L36:
            java.lang.String r5 = "S"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L40
            r4 = 0
            goto L41
        L40:
            r4 = -1
        L41:
            java.lang.String r5 = " succeeded."
            if (r4 == 0) goto L96
            if (r4 == r1) goto L6e
            boolean r4 = m3919d()     // Catch: java.io.IOException -> Lc3
            if (r4 == 0) goto L106
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.io.IOException -> Lc3
            int r5 = r4.length()     // Catch: java.io.IOException -> Lc3
            int r5 = r5 + 24
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lc3
            r6.<init>(r5)     // Catch: java.io.IOException -> Lc3
            java.lang.String r5 = "Unknown topic operation"
            r6.append(r5)     // Catch: java.io.IOException -> Lc3
            r6.append(r4)     // Catch: java.io.IOException -> Lc3
            java.lang.String r4 = "."
            r6.append(r4)     // Catch: java.io.IOException -> Lc3
            java.lang.String r4 = r6.toString()     // Catch: java.io.IOException -> Lc3
            goto Lbf
        L6e:
            java.lang.String r4 = r0.f7016a     // Catch: java.io.IOException -> Lc3
            r8.m3921c(r4)     // Catch: java.io.IOException -> Lc3
            boolean r4 = m3919d()     // Catch: java.io.IOException -> Lc3
            if (r4 == 0) goto L106
            java.lang.String r4 = r0.f7016a     // Catch: java.io.IOException -> Lc3
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch: java.io.IOException -> Lc3
            int r6 = r6.length()     // Catch: java.io.IOException -> Lc3
            int r6 = r6 + 35
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lc3
            r7.<init>(r6)     // Catch: java.io.IOException -> Lc3
            java.lang.String r6 = "Unsubscribe from topic: "
            r7.append(r6)     // Catch: java.io.IOException -> Lc3
            r7.append(r4)     // Catch: java.io.IOException -> Lc3
        L92:
            r7.append(r5)     // Catch: java.io.IOException -> Lc3
            goto Lbb
        L96:
            java.lang.String r4 = r0.f7016a     // Catch: java.io.IOException -> Lc3
            r8.m3920b(r4)     // Catch: java.io.IOException -> Lc3
            boolean r4 = m3919d()     // Catch: java.io.IOException -> Lc3
            if (r4 == 0) goto L106
            java.lang.String r4 = r0.f7016a     // Catch: java.io.IOException -> Lc3
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch: java.io.IOException -> Lc3
            int r6 = r6.length()     // Catch: java.io.IOException -> Lc3
            int r6 = r6 + 31
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lc3
            r7.<init>(r6)     // Catch: java.io.IOException -> Lc3
            java.lang.String r6 = "Subscribe to topic: "
            r7.append(r6)     // Catch: java.io.IOException -> Lc3
            r7.append(r4)     // Catch: java.io.IOException -> Lc3
            goto L92
        Lbb:
            java.lang.String r4 = r7.toString()     // Catch: java.io.IOException -> Lc3
        Lbf:
            android.util.Log.d(r2, r4)     // Catch: java.io.IOException -> Lc3
            goto L106
        Lc3:
            r1 = move-exception
            java.lang.String r4 = r1.getMessage()
            java.lang.String r5 = "SERVICE_NOT_AVAILABLE"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto Le7
            java.lang.String r4 = r1.getMessage()
            java.lang.String r5 = "INTERNAL_SERVER_ERROR"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Ldd
            goto Le7
        Ldd:
            java.lang.String r4 = r1.getMessage()
            if (r4 != 0) goto Le6
            java.lang.String r1 = "Topic operation failed without exception message. Will retry Topic operation."
            goto L102
        Le6:
            throw r1
        Le7:
            java.lang.String r1 = r1.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 53
            r5.<init>(r4)
            java.lang.String r4 = "Topic operation failed: "
            java.lang.String r6 = ". Will retry Topic operation."
            java.lang.String r1 = p083f.C1932s.m4774a(r5, r4, r1, r6)
        L102:
            android.util.Log.e(r2, r1)
            r1 = 0
        L106:
            if (r1 != 0) goto L109
            return r3
        L109:
            db.e0 r1 = r8.f7047i
            monitor-enter(r1)
            db.b0 r2 = r1.f7022b     // Catch: java.lang.Throwable -> L15f
            java.lang.String r3 = r0.f7018c     // Catch: java.lang.Throwable -> L15f
            java.util.ArrayDeque<java.lang.String> r4 = r2.f7005d     // Catch: java.lang.Throwable -> L15f
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L15f
            java.util.ArrayDeque<java.lang.String> r5 = r2.f7005d     // Catch: java.lang.Throwable -> L15c
            boolean r3 = r5.remove(r3)     // Catch: java.lang.Throwable -> L15c
            if (r3 == 0) goto L125
            java.util.concurrent.Executor r3 = r2.f7006e     // Catch: java.lang.Throwable -> L15c
            f6.i r5 = new f6.i     // Catch: java.lang.Throwable -> L15c
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L15c
            r3.execute(r5)     // Catch: java.lang.Throwable -> L15c
        L125:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L15c
            monitor-exit(r1)
            java.util.Map<java.lang.String, java.util.ArrayDeque<s7.j<java.lang.Void>>> r2 = r8.f7044f
            monitor-enter(r2)
            java.lang.String r0 = r0.f7018c     // Catch: java.lang.Throwable -> L159
            java.util.Map<java.lang.String, java.util.ArrayDeque<s7.j<java.lang.Void>>> r1 = r8.f7044f     // Catch: java.lang.Throwable -> L159
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> L159
            if (r1 != 0) goto L135
            goto L156
        L135:
            java.util.Map<java.lang.String, java.util.ArrayDeque<s7.j<java.lang.Void>>> r1 = r8.f7044f     // Catch: java.lang.Throwable -> L159
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L159
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L159
            java.lang.Object r3 = r1.poll()     // Catch: java.lang.Throwable -> L159
            s7.j r3 = (p327s7.C5986j) r3     // Catch: java.lang.Throwable -> L159
            if (r3 == 0) goto L14b
            r4 = 0
            s7.q<TResult> r3 = r3.f23075a     // Catch: java.lang.Throwable -> L159
            r3.m12473r(r4)     // Catch: java.lang.Throwable -> L159
        L14b:
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L159
            if (r1 == 0) goto L156
            java.util.Map<java.lang.String, java.util.ArrayDeque<s7.j<java.lang.Void>>> r1 = r8.f7044f     // Catch: java.lang.Throwable -> L159
            r1.remove(r0)     // Catch: java.lang.Throwable -> L159
        L156:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L159
            goto L0
        L159:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L159
            throw r0
        L15c:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L15c
            throw r0     // Catch: java.lang.Throwable -> L15f
        L15f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L162:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L162
            throw r0
    }

    /* renamed from: g */
    public void m3924g(long r11) {
            r10 = this;
            long r0 = r11 + r11
            r2 = 30
            long r0 = java.lang.Math.max(r2, r0)
            long r2 = p057db.C1400g0.f7037j
            long r8 = java.lang.Math.min(r0, r2)
            db.h0 r0 = new db.h0
            android.content.Context r6 = r10.f7039a
            db.v r7 = r10.f7040b
            r4 = r0
            r5 = r10
            r4.<init>(r5, r6, r7, r8)
            java.util.concurrent.ScheduledExecutorService r1 = r10.f7045g
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r1.schedule(r0, r11, r2)
            r11 = 1
            r10.m3922e(r11)
            return
    }
}
