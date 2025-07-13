package gb;

/* renamed from: gb.l */
/* loaded from: classes.dex */
public class C2322l {

    /* renamed from: j */
    public static final java.util.Random f10552j = null;

    /* renamed from: a */
    public final java.util.Map<java.lang.String, gb.C2313c> f10553a;

    /* renamed from: b */
    public final android.content.Context f10554b;

    /* renamed from: c */
    public final java.util.concurrent.ExecutorService f10555c;

    /* renamed from: d */
    public final p251o9.C5180d f10556d;

    /* renamed from: e */
    public final p412xa.InterfaceC7011d f10557e;

    /* renamed from: f */
    public final p273p9.C5378c f10558f;

    /* renamed from: g */
    public final p392wa.InterfaceC6823b<p329s9.InterfaceC5997a> f10559g;

    /* renamed from: h */
    public final java.lang.String f10560h;

    /* renamed from: i */
    public java.util.Map<java.lang.String, java.lang.String> f10561i;

    static {
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            gb.C2322l.f10552j = r0
            return
    }

    public C2322l(android.content.Context r3, p251o9.C5180d r4, p412xa.InterfaceC7011d r5, p273p9.C5378c r6, p392wa.InterfaceC6823b<p329s9.InterfaceC5997a> r7) {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            r2.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.f10553a = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.f10561i = r1
            r2.f10554b = r3
            r2.f10555c = r0
            r2.f10556d = r4
            r2.f10557e = r5
            r2.f10558f = r6
            r2.f10559g = r7
            r4.m11497a()
            o9.h r3 = r4.f20314c
            java.lang.String r3 = r3.f20325b
            r2.f10560h = r3
            gb.i r3 = new gb.i
            r3.<init>(r2)
            p327s7.C5988l.m12462c(r0, r3)
            return
    }

    /* renamed from: e */
    public static boolean m6078e(p251o9.C5180d r1) {
            r1.m11497a()
            java.lang.String r1 = r1.f20313b
            java.lang.String r0 = "[DEFAULT]"
            boolean r1 = r1.equals(r0)
            return r1
    }

    /* renamed from: a */
    public synchronized gb.C2313c m6079a(p251o9.C5180d r16, java.lang.String r17, p412xa.InterfaceC7011d r18, p273p9.C5378c r19, java.util.concurrent.Executor r20, p128hb.C2998c r21, p128hb.C2998c r22, p128hb.C2998c r23, com.google.firebase.remoteconfig.internal.C1247a r24, p128hb.C3001f r25, com.google.firebase.remoteconfig.internal.C1248b r26) {
            r15 = this;
            r1 = r15
            r0 = r17
            monitor-enter(r15)
            java.util.Map<java.lang.String, gb.c> r2 = r1.f10553a     // Catch: java.lang.Throwable -> L61
            boolean r2 = r2.containsKey(r0)     // Catch: java.lang.Throwable -> L61
            if (r2 != 0) goto L57
            gb.c r2 = new gb.c     // Catch: java.lang.Throwable -> L61
            android.content.Context r4 = r1.f10554b     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "firebase"
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L29
            r16.m11497a()     // Catch: java.lang.Throwable -> L61
            r5 = r16
            java.lang.String r3 = r5.f20313b     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = "[DEFAULT]"
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L2b
            r3 = 1
            goto L2c
        L29:
            r5 = r16
        L2b:
            r3 = 0
        L2c:
            if (r3 == 0) goto L31
            r7 = r19
            goto L33
        L31:
            r3 = 0
            r7 = r3
        L33:
            r3 = r2
            r5 = r16
            r6 = r18
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            r14 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L61
            r22.m7370b()     // Catch: java.lang.Throwable -> L61
            r23.m7370b()     // Catch: java.lang.Throwable -> L61
            r21.m7370b()     // Catch: java.lang.Throwable -> L61
            java.util.Map<java.lang.String, gb.c> r3 = r1.f10553a     // Catch: java.lang.Throwable -> L61
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> L61
        L57:
            java.util.Map<java.lang.String, gb.c> r2 = r1.f10553a     // Catch: java.lang.Throwable -> L61
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L61
            gb.c r0 = (gb.C2313c) r0     // Catch: java.lang.Throwable -> L61
            monitor-exit(r15)
            return r0
        L61:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
    }

    /* renamed from: b */
    public final p128hb.C2998c m6080b(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "%s_%s_%s_%s.json"
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r3 = "frc"
            r1[r2] = r3
            java.lang.String r2 = r4.f10560h
            r3 = 1
            r1[r3] = r2
            r2 = 2
            r1[r2] = r5
            r5 = 3
            r1[r5] = r6
            java.lang.String r5 = java.lang.String.format(r0, r1)
            java.util.concurrent.ExecutorService r6 = java.util.concurrent.Executors.newCachedThreadPool()
            android.content.Context r0 = r4.f10554b
            java.util.Map<java.lang.String, hb.g> r1 = p128hb.C3002g.f12114c
            java.lang.Class<hb.g> r1 = p128hb.C3002g.class
            monitor-enter(r1)
            java.util.Map<java.lang.String, hb.g> r2 = p128hb.C3002g.f12114c     // Catch: java.lang.Throwable -> L6d
            r3 = r2
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch: java.lang.Throwable -> L6d
            boolean r3 = r3.containsKey(r5)     // Catch: java.lang.Throwable -> L6d
            if (r3 != 0) goto L3a
            hb.g r3 = new hb.g     // Catch: java.lang.Throwable -> L6d
            r3.<init>(r0, r5)     // Catch: java.lang.Throwable -> L6d
            r0 = r2
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L6d
            r0.put(r5, r3)     // Catch: java.lang.Throwable -> L6d
        L3a:
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r5 = r2.get(r5)     // Catch: java.lang.Throwable -> L6d
            hb.g r5 = (p128hb.C3002g) r5     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r1)
            java.util.Map<java.lang.String, hb.c> r0 = p128hb.C2998c.f12093d
            java.lang.Class<hb.c> r0 = p128hb.C2998c.class
            monitor-enter(r0)
            java.lang.String r1 = r5.f12116b     // Catch: java.lang.Throwable -> L6a
            java.util.Map<java.lang.String, hb.c> r2 = p128hb.C2998c.f12093d     // Catch: java.lang.Throwable -> L6a
            r3 = r2
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch: java.lang.Throwable -> L6a
            boolean r3 = r3.containsKey(r1)     // Catch: java.lang.Throwable -> L6a
            if (r3 != 0) goto L60
            hb.c r3 = new hb.c     // Catch: java.lang.Throwable -> L6a
            r3.<init>(r6, r5)     // Catch: java.lang.Throwable -> L6a
            r5 = r2
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch: java.lang.Throwable -> L6a
            r5.put(r1, r3)     // Catch: java.lang.Throwable -> L6a
        L60:
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r5 = r2.get(r1)     // Catch: java.lang.Throwable -> L6a
            hb.c r5 = (p128hb.C2998c) r5     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r0)
            return r5
        L6a:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L6d:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
    }

    /* renamed from: c */
    public gb.C2313c m6081c() {
            r12 = this;
            java.lang.String r2 = "firebase"
            monitor-enter(r12)
            java.lang.String r0 = "fetch"
            hb.c r6 = r12.m6080b(r2, r0)     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "activate"
            hb.c r7 = r12.m6080b(r2, r0)     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "defaults"
            hb.c r8 = r12.m6080b(r2, r0)     // Catch: java.lang.Throwable -> L81
            android.content.Context r0 = r12.f10554b     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = r12.f10560h     // Catch: java.lang.Throwable -> L81
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = "frc"
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L81
            r4 = 1
            r3[r4] = r1     // Catch: java.lang.Throwable -> L81
            r1 = 2
            r3[r1] = r2     // Catch: java.lang.Throwable -> L81
            r1 = 3
            java.lang.String r4 = "settings"
            r3[r1] = r4     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = "%s_%s_%s_%s"
            java.lang.String r1 = java.lang.String.format(r1, r3)     // Catch: java.lang.Throwable -> L81
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r5)     // Catch: java.lang.Throwable -> L81
            com.google.firebase.remoteconfig.internal.b r11 = new com.google.firebase.remoteconfig.internal.b     // Catch: java.lang.Throwable -> L81
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L81
            hb.f r10 = new hb.f     // Catch: java.lang.Throwable -> L81
            java.util.concurrent.ExecutorService r0 = r12.f10555c     // Catch: java.lang.Throwable -> L81
            r10.<init>(r0, r7, r8)     // Catch: java.lang.Throwable -> L81
            o9.d r0 = r12.f10556d     // Catch: java.lang.Throwable -> L81
            wa.b<s9.a> r1 = r12.f10559g     // Catch: java.lang.Throwable -> L81
            r0.m11497a()     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = r0.f20313b     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = "[DEFAULT]"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L59
            hb.h r0 = new hb.h     // Catch: java.lang.Throwable -> L81
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L81
            goto L5a
        L59:
            r0 = 0
        L5a:
            if (r0 == 0) goto L6e
            gb.j r1 = new gb.j     // Catch: java.lang.Throwable -> L81
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L81
            java.util.Set<u6.b<java.lang.String, hb.d>> r0 = r10.f12110a     // Catch: java.lang.Throwable -> L81
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L81
            java.util.Set<u6.b<java.lang.String, hb.d>> r3 = r10.f12110a     // Catch: java.lang.Throwable -> L6b
            r3.add(r1)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            goto L6e
        L6b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r1     // Catch: java.lang.Throwable -> L81
        L6e:
            o9.d r1 = r12.f10556d     // Catch: java.lang.Throwable -> L81
            xa.d r3 = r12.f10557e     // Catch: java.lang.Throwable -> L81
            p9.c r4 = r12.f10558f     // Catch: java.lang.Throwable -> L81
            java.util.concurrent.ExecutorService r5 = r12.f10555c     // Catch: java.lang.Throwable -> L81
            com.google.firebase.remoteconfig.internal.a r9 = r12.m6082d(r2, r6, r11)     // Catch: java.lang.Throwable -> L81
            r0 = r12
            gb.c r0 = r0.m6079a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L81
            monitor-exit(r12)
            return r0
        L81:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
    }

    /* renamed from: d */
    public synchronized com.google.firebase.remoteconfig.internal.C1247a m6082d(java.lang.String r24, p128hb.C2998c r25, com.google.firebase.remoteconfig.internal.C1248b r26) {
            r23 = this;
            r1 = r23
            r0 = r26
            monitor-enter(r23)
            com.google.firebase.remoteconfig.internal.a r12 = new com.google.firebase.remoteconfig.internal.a     // Catch: java.lang.Throwable -> L5e
            xa.d r3 = r1.f10557e     // Catch: java.lang.Throwable -> L5e
            o9.d r2 = r1.f10556d     // Catch: java.lang.Throwable -> L5e
            boolean r2 = m6078e(r2)     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L14
            wa.b<s9.a> r2 = r1.f10559g     // Catch: java.lang.Throwable -> L5e
            goto L16
        L14:
            gb.k r2 = gb.C2321k.f10551a     // Catch: java.lang.Throwable -> L5e
        L16:
            r4 = r2
            java.util.concurrent.ExecutorService r5 = r1.f10555c     // Catch: java.lang.Throwable -> L5e
            u6.d r6 = p353u6.C6341d.f24789a     // Catch: java.lang.Throwable -> L5e
            java.util.Random r7 = gb.C2322l.f10552j     // Catch: java.lang.Throwable -> L5e
            o9.d r2 = r1.f10556d     // Catch: java.lang.Throwable -> L5e
            r2.m11497a()     // Catch: java.lang.Throwable -> L5e
            o9.h r2 = r2.f20314c     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = r2.f20324a     // Catch: java.lang.Throwable -> L5e
            o9.d r8 = r1.f10556d     // Catch: java.lang.Throwable -> L5e
            r8.m11497a()     // Catch: java.lang.Throwable -> L5e
            o9.h r8 = r8.f20314c     // Catch: java.lang.Throwable -> L5e
            java.lang.String r15 = r8.f20325b     // Catch: java.lang.Throwable -> L5e
            com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient r9 = new com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient     // Catch: java.lang.Throwable -> L5e
            android.content.Context r14 = r1.f10554b     // Catch: java.lang.Throwable -> L5e
            android.content.SharedPreferences r8 = r0.f6651a     // Catch: java.lang.Throwable -> L5e
            java.lang.String r10 = "fetch_timeout_in_seconds"
            r11 = r6
            r22 = r7
            r6 = 60
            long r18 = r8.getLong(r10, r6)     // Catch: java.lang.Throwable -> L5e
            android.content.SharedPreferences r8 = r0.f6651a     // Catch: java.lang.Throwable -> L5e
            long r20 = r8.getLong(r10, r6)     // Catch: java.lang.Throwable -> L5e
            r13 = r9
            r16 = r2
            r17 = r24
            r13.<init>(r14, r15, r16, r17, r18, r20)     // Catch: java.lang.Throwable -> L5e
            java.util.Map<java.lang.String, java.lang.String> r13 = r1.f10561i     // Catch: java.lang.Throwable -> L5e
            r2 = r12
            r6 = r11
            r7 = r22
            r8 = r25
            r10 = r26
            r11 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r23)
            return r12
        L5e:
            r0 = move-exception
            monitor-exit(r23)
            throw r0
    }
}
