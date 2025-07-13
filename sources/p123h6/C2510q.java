package p123h6;

/* renamed from: h6.q */
/* loaded from: classes.dex */
public final class C2510q {

    /* renamed from: f */
    public static final p123h6.C2489b f11325f = null;

    /* renamed from: g */
    public static final java.lang.Object f11326g = null;

    /* renamed from: a */
    public final long f11327a;

    /* renamed from: b */
    public final android.os.Handler f11328b;

    /* renamed from: c */
    public long f11329c;

    /* renamed from: d */
    public p123h6.InterfaceC2509p f11330d;

    /* renamed from: e */
    public java.lang.Runnable f11331e;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "RequestTracker"
            r0.<init>(r1)
            p123h6.C2510q.f11325f = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p123h6.C2510q.f11326g = r0
            return
    }

    public C2510q(long r1) {
            r0 = this;
            r0.<init>()
            r0.f11327a = r1
            r1 = -1
            r0.f11329c = r1
            e7.k r1 = new e7.k
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.f11328b = r1
            return
    }

    /* renamed from: a */
    public final void m6409a(long r5, p123h6.InterfaceC2509p r7) {
            r4 = this;
            java.lang.Object r0 = p123h6.C2510q.f11326g
            monitor-enter(r0)
            h6.p r1 = r4.f11330d     // Catch: java.lang.Throwable -> L2e
            long r2 = r4.f11329c     // Catch: java.lang.Throwable -> L2e
            r4.f11329c = r5     // Catch: java.lang.Throwable -> L2e
            r4.f11330d = r7     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L11
            r1.mo3032m(r2)
        L11:
            monitor-enter(r0)
            java.lang.Runnable r5 = r4.f11331e     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L1b
            android.os.Handler r6 = r4.f11328b     // Catch: java.lang.Throwable -> L2b
            r6.removeCallbacks(r5)     // Catch: java.lang.Throwable -> L2b
        L1b:
            f6.i r5 = new f6.i     // Catch: java.lang.Throwable -> L2b
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            r4.f11331e = r5     // Catch: java.lang.Throwable -> L2b
            android.os.Handler r6 = r4.f11328b     // Catch: java.lang.Throwable -> L2b
            long r1 = r4.f11327a     // Catch: java.lang.Throwable -> L2b
            r6.postDelayed(r5, r1)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r5
        L2e:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r5
    }

    /* renamed from: b */
    public final boolean m6410b(long r8, int r10, java.lang.Object r11) {
            r7 = this;
            java.lang.Object r0 = p123h6.C2510q.f11326g
            monitor-enter(r0)
            long r1 = r7.f11329c     // Catch: java.lang.Throwable -> L28
            r3 = -1
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L26
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 != 0) goto L26
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L28
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L28
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L28
            r3[r5] = r8     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = "request %d completed"
            java.lang.String r8 = java.lang.String.format(r1, r8, r3)     // Catch: java.lang.Throwable -> L28
            r7.m6413e(r10, r11, r8)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return r2
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return r5
        L28:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r8
    }

    /* renamed from: c */
    public final boolean m6411c() {
            r6 = this;
            java.lang.Object r0 = p123h6.C2510q.f11326g
            monitor-enter(r0)
            long r1 = r6.f11329c     // Catch: java.lang.Throwable -> L10
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    /* renamed from: d */
    public final boolean m6412d(long r8) {
            r7 = this;
            java.lang.Object r0 = p123h6.C2510q.f11326g
            monitor-enter(r0)
            long r1 = r7.f11329c     // Catch: java.lang.Throwable -> L13
            r3 = -1
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L11
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 != 0) goto L11
            r5 = 1
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r5
        L13:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r8
    }

    /* renamed from: e */
    public final void m6413e(int r4, java.lang.Object r5, java.lang.String r6) {
            r3 = this;
            h6.b r0 = p123h6.C2510q.f11325f
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.m6376a(r6, r1)
            java.lang.Object r6 = p123h6.C2510q.f11326g
            monitor-enter(r6)
            h6.p r0 = r3.f11330d     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L14
            long r1 = r3.f11329c     // Catch: java.lang.Throwable -> L2f
            r0.mo3033t(r1, r4, r5)     // Catch: java.lang.Throwable -> L2f
        L14:
            r4 = -1
            r3.f11329c = r4     // Catch: java.lang.Throwable -> L2f
            r4 = 0
            r3.f11330d = r4     // Catch: java.lang.Throwable -> L2f
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.Runnable r5 = r3.f11331e     // Catch: java.lang.Throwable -> L2c
            if (r5 != 0) goto L22
        L20:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2c
            goto L2a
        L22:
            android.os.Handler r0 = r3.f11328b     // Catch: java.lang.Throwable -> L2c
            r0.removeCallbacks(r5)     // Catch: java.lang.Throwable -> L2c
            r3.f11331e = r4     // Catch: java.lang.Throwable -> L2c
            goto L20
        L2a:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2f
            return
        L2c:
            r4 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2c
            throw r4     // Catch: java.lang.Throwable -> L2f
        L2f:
            r4 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2f
            throw r4
    }

    /* renamed from: f */
    public final boolean m6414f(int r7, java.lang.Object r8) {
            r6 = this;
            java.lang.Object r8 = p123h6.C2510q.f11326g
            monitor-enter(r8)
            long r0 = r6.f11329c     // Catch: java.lang.Throwable -> L25
            r2 = -1
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L23
            java.util.Locale r2 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L25
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L25
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L25
            r5[r4] = r0     // Catch: java.lang.Throwable -> L25
            r0 = 0
            java.lang.String r1 = "clearing request %d"
            java.lang.String r1 = java.lang.String.format(r2, r1, r5)     // Catch: java.lang.Throwable -> L25
            r6.m6413e(r7, r0, r1)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L25
            return r3
        L23:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L25
            return r4
        L25:
            r7 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L25
            throw r7
    }
}
