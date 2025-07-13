package p244o2;

/* renamed from: o2.e */
/* loaded from: classes.dex */
public class C4881e implements p244o2.InterfaceC4877a {

    /* renamed from: a */
    public final p244o2.C4887k f19364a;

    /* renamed from: b */
    public final java.io.File f19365b;

    /* renamed from: c */
    public final long f19366c;

    /* renamed from: d */
    public final p244o2.C4879c f19367d;

    /* renamed from: e */
    public p140i2.C3063a f19368e;

    @java.lang.Deprecated
    public C4881e(java.io.File r2, long r3) {
            r1 = this;
            r1.<init>()
            o2.c r0 = new o2.c
            r0.<init>()
            r1.f19367d = r0
            r1.f19365b = r2
            r1.f19366c = r3
            o2.k r2 = new o2.k
            r2.<init>()
            r1.f19364a = r2
            return
    }

    @Override // p244o2.InterfaceC4877a
    /* renamed from: a */
    public java.io.File mo11024a(p180k2.InterfaceC3671c r5) {
            r4 = this;
            o2.k r0 = r4.f19364a
            java.lang.String r0 = r0.m11029a(r5)
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r2 = android.util.Log.isLoggable(r1, r2)
            if (r2 == 0) goto L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Get: Obtained: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = " for for Key: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.util.Log.v(r1, r5)
        L2b:
            r5 = 0
            i2.a r2 = r4.m11027c()     // Catch: java.io.IOException -> L3c
            i2.a$e r0 = r2.m7497L(r0)     // Catch: java.io.IOException -> L3c
            if (r0 == 0) goto L49
            r2 = 0
            java.io.File[] r0 = r0.f12325a     // Catch: java.io.IOException -> L3c
            r5 = r0[r2]     // Catch: java.io.IOException -> L3c
            goto L49
        L3c:
            r0 = move-exception
            r2 = 5
            boolean r2 = android.util.Log.isLoggable(r1, r2)
            if (r2 == 0) goto L49
            java.lang.String r2 = "Unable to get from disk cache"
            android.util.Log.w(r1, r2, r0)
        L49:
            return r5
    }

    @Override // p244o2.InterfaceC4877a
    /* renamed from: b */
    public void mo11025b(p180k2.InterfaceC3671c r6, p244o2.InterfaceC4877a.b r7) {
            r5 = this;
            o2.k r0 = r5.f19364a
            java.lang.String r0 = r0.m11029a(r6)
            o2.c r1 = r5.f19367d
            monitor-enter(r1)
            java.util.Map<java.lang.String, o2.c$a> r2 = r1.f19357a     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> Ld5
            o2.c$a r2 = (p244o2.C4879c.a) r2     // Catch: java.lang.Throwable -> Ld5
            if (r2 != 0) goto L31
            o2.c$b r2 = r1.f19358b     // Catch: java.lang.Throwable -> Ld5
            java.util.Queue<o2.c$a> r3 = r2.f19361a     // Catch: java.lang.Throwable -> Ld5
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Ld5
            java.util.Queue<o2.c$a> r2 = r2.f19361a     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L2e
            o2.c$a r2 = (p244o2.C4879c.a) r2     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L28
            o2.c$a r2 = new o2.c$a     // Catch: java.lang.Throwable -> Ld5
            r2.<init>()     // Catch: java.lang.Throwable -> Ld5
        L28:
            java.util.Map<java.lang.String, o2.c$a> r3 = r1.f19357a     // Catch: java.lang.Throwable -> Ld5
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Ld5
            goto L31
        L2e:
            r6 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2e
            throw r6     // Catch: java.lang.Throwable -> Ld5
        L31:
            int r3 = r2.f19360b     // Catch: java.lang.Throwable -> Ld5
            r4 = 1
            int r3 = r3 + r4
            r2.f19360b = r3     // Catch: java.lang.Throwable -> Ld5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld5
            java.util.concurrent.locks.Lock r1 = r2.f19359a
            r1.lock()
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> Lce
            if (r1 == 0) goto L64
            java.lang.String r1 = "DiskLruCacheWrapper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            r2.<init>()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = "Put: Obtained: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lce
            r2.append(r0)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = " for for Key: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lce
            r2.append(r6)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> Lce
            android.util.Log.v(r1, r6)     // Catch: java.lang.Throwable -> Lce
        L64:
            i2.a r6 = r5.m11027c()     // Catch: java.io.IOException -> Lbc java.lang.Throwable -> Lce
            i2.a$e r1 = r6.m7497L(r0)     // Catch: java.io.IOException -> Lbc java.lang.Throwable -> Lce
            if (r1 == 0) goto L74
        L6e:
            o2.c r6 = r5.f19367d
            r6.m11026a(r0)
            return
        L74:
            i2.a$c r6 = r6.m7505n(r0)     // Catch: java.io.IOException -> Lbc java.lang.Throwable -> Lce
            if (r6 == 0) goto La5
            r1 = 0
            java.io.File r1 = r6.m7507b(r1)     // Catch: java.lang.Throwable -> L9c
            m2.f r7 = (p214m2.C4328f) r7     // Catch: java.lang.Throwable -> L9c
            k2.a<DataType> r2 = r7.f17643a     // Catch: java.lang.Throwable -> L9c
            DataType r3 = r7.f17644b     // Catch: java.lang.Throwable -> L9c
            k2.e r7 = r7.f17645c     // Catch: java.lang.Throwable -> L9c
            boolean r7 = r2.mo814d(r3, r1, r7)     // Catch: java.lang.Throwable -> L9c
            if (r7 == 0) goto L94
            i2.a r7 = r6.f12316d     // Catch: java.lang.Throwable -> L9c
            p140i2.C3063a.m7493a(r7, r6, r4)     // Catch: java.lang.Throwable -> L9c
            r6.f12315c = r4     // Catch: java.lang.Throwable -> L9c
        L94:
            boolean r7 = r6.f12315c     // Catch: java.io.IOException -> Lbc java.lang.Throwable -> Lce
            if (r7 != 0) goto L6e
            r6.m7506a()     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lce
            goto L6e
        L9c:
            r7 = move-exception
            boolean r1 = r6.f12315c     // Catch: java.io.IOException -> Lbc java.lang.Throwable -> Lce
            if (r1 != 0) goto La4
            r6.m7506a()     // Catch: java.io.IOException -> La4 java.lang.Throwable -> Lce
        La4:
            throw r7     // Catch: java.io.IOException -> Lbc java.lang.Throwable -> Lce
        La5:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> Lbc java.lang.Throwable -> Lce
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbc java.lang.Throwable -> Lce
            r7.<init>()     // Catch: java.io.IOException -> Lbc java.lang.Throwable -> Lce
            java.lang.String r1 = "Had two simultaneous puts for: "
            r7.append(r1)     // Catch: java.io.IOException -> Lbc java.lang.Throwable -> Lce
            r7.append(r0)     // Catch: java.io.IOException -> Lbc java.lang.Throwable -> Lce
            java.lang.String r7 = r7.toString()     // Catch: java.io.IOException -> Lbc java.lang.Throwable -> Lce
            r6.<init>(r7)     // Catch: java.io.IOException -> Lbc java.lang.Throwable -> Lce
            throw r6     // Catch: java.io.IOException -> Lbc java.lang.Throwable -> Lce
        Lbc:
            r6 = move-exception
            java.lang.String r7 = "DiskLruCacheWrapper"
            r1 = 5
            boolean r7 = android.util.Log.isLoggable(r7, r1)     // Catch: java.lang.Throwable -> Lce
            if (r7 == 0) goto L6e
            java.lang.String r7 = "DiskLruCacheWrapper"
            java.lang.String r1 = "Unable to put to disk cache"
            android.util.Log.w(r7, r1, r6)     // Catch: java.lang.Throwable -> Lce
            goto L6e
        Lce:
            r6 = move-exception
            o2.c r7 = r5.f19367d
            r7.m11026a(r0)
            throw r6
        Ld5:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld5
            throw r6
    }

    /* renamed from: c */
    public final synchronized p140i2.C3063a m11027c() {
            r4 = this;
            monitor-enter(r4)
            i2.a r0 = r4.f19368e     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L10
            java.io.File r0 = r4.f19365b     // Catch: java.lang.Throwable -> L14
            long r1 = r4.f19366c     // Catch: java.lang.Throwable -> L14
            r3 = 1
            i2.a r0 = p140i2.C3063a.m7492R(r0, r3, r3, r1)     // Catch: java.lang.Throwable -> L14
            r4.f19368e = r0     // Catch: java.lang.Throwable -> L14
        L10:
            i2.a r0 = r4.f19368e     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)
            return r0
        L14:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }
}
