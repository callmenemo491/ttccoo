package p249o7;

/* renamed from: o7.m6 */
/* loaded from: classes.dex */
public final class C5052m6 implements p249o7.InterfaceC5058n4 {

    /* renamed from: C */
    public static volatile p249o7.C5052m6 f19857C;

    /* renamed from: A */
    public final java.util.Map<java.lang.String, p249o7.C4997g> f19858A;

    /* renamed from: B */
    public final p249o7.InterfaceC5100s6 f19859B;

    /* renamed from: a */
    public final p249o7.C4953a4 f19860a;

    /* renamed from: b */
    public final p249o7.C5033k3 f19861b;

    /* renamed from: c */
    public p249o7.C5021j f19862c;

    /* renamed from: d */
    public p249o7.C5049m3 f19863d;

    /* renamed from: e */
    public p249o7.C5004g6 f19864e;

    /* renamed from: f */
    public p249o7.C4956a7 f19865f;

    /* renamed from: g */
    public final p249o7.C5068o6 f19866g;

    /* renamed from: h */
    public p249o7.C5019i5 f19867h;

    /* renamed from: i */
    public p249o7.C5131w5 f19868i;

    /* renamed from: j */
    public final p249o7.C5028j6 f19869j;

    /* renamed from: k */
    public p249o7.C5113u3 f19870k;

    /* renamed from: l */
    public final com.google.android.gms.measurement.internal.C1113d f19871l;

    /* renamed from: m */
    public boolean f19872m;

    /* renamed from: n */
    public boolean f19873n;

    /* renamed from: o */
    public long f19874o;

    /* renamed from: p */
    public java.util.List<java.lang.Runnable> f19875p;

    /* renamed from: q */
    public int f19876q;

    /* renamed from: r */
    public int f19877r;

    /* renamed from: s */
    public boolean f19878s;

    /* renamed from: t */
    public boolean f19879t;

    /* renamed from: u */
    public boolean f19880u;

    /* renamed from: v */
    public java.nio.channels.FileLock f19881v;

    /* renamed from: w */
    public java.nio.channels.FileChannel f19882w;

    /* renamed from: x */
    public java.util.List<java.lang.Long> f19883x;

    /* renamed from: y */
    public java.util.List<java.lang.Long> f19884y;

    /* renamed from: z */
    public long f19885z;

    public C5052m6(p249o7.C5060n6 r3, com.google.android.gms.measurement.internal.C1113d r4) {
            r2 = this;
            r2.<init>()
            r4 = 0
            r2.f19872m = r4
            o7.k6 r4 = new o7.k6
            r0 = 1
            r4.<init>(r2, r0)
            r2.f19859B = r4
            android.content.Context r4 = r3.f19912a
            r0 = 0
            com.google.android.gms.measurement.internal.d r4 = com.google.android.gms.measurement.internal.C1113d.m3157u(r4, r0, r0)
            r2.f19871l = r4
            r0 = -1
            r2.f19885z = r0
            o7.j6 r4 = new o7.j6
            r4.<init>(r2)
            r2.f19869j = r4
            o7.o6 r4 = new o7.o6
            r4.<init>(r2)
            r4.m11248k()
            r2.f19866g = r4
            o7.k3 r4 = new o7.k3
            r4.<init>(r2)
            r4.m11248k()
            r2.f19861b = r4
            o7.a4 r4 = new o7.a4
            r4.<init>(r2)
            r4.m11248k()
            r2.f19860a = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r2.f19858A = r4
            o7.f4 r4 = r2.mo3160b()
            h6.a0 r0 = new h6.a0
            r0.<init>(r2, r3)
            r4.m11176s(r0)
            return
    }

    /* renamed from: I */
    public static final p249o7.AbstractC5020i6 m11327I(p249o7.AbstractC5020i6 r3) {
            if (r3 == 0) goto L26
            boolean r0 = r3.f19764c
            if (r0 == 0) goto L7
            return r3
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r1 = r3.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 27
            r2.<init>(r1)
            java.lang.String r1 = "Component not initialized: "
            java.lang.String r3 = p346u.C6269n.m12888a(r2, r1, r3)
            r0.<init>(r3)
            throw r0
        L26:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Upload Component not created"
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: O */
    public static p249o7.C5052m6 m11328O(android.content.Context r3) {
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r3, r0)
            android.content.Context r0 = r3.getApplicationContext()
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            o7.m6 r0 = p249o7.C5052m6.f19857C
            if (r0 != 0) goto L2b
            java.lang.Class<o7.m6> r0 = p249o7.C5052m6.class
            monitor-enter(r0)
            o7.m6 r1 = p249o7.C5052m6.f19857C     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L26
            o7.n6 r1 = new o7.n6     // Catch: java.lang.Throwable -> L28
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L28
            o7.m6 r3 = new o7.m6     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L28
            p249o7.C5052m6.f19857C = r3     // Catch: java.lang.Throwable -> L28
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            goto L2b
        L28:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r3
        L2b:
            o7.m6 r3 = p249o7.C5052m6.f19857C
            return r3
    }

    /* renamed from: v */
    public static final void m11329v(p185k7.C3984t2 r5, int r6, java.lang.String r7) {
            java.util.List r0 = r5.m9014y()
            r1 = 0
            r2 = 0
        L6:
            int r3 = r0.size()
            java.lang.String r4 = "_err"
            if (r2 >= r3) goto L22
            java.lang.Object r3 = r0.get(r2)
            k7.y2 r3 = (p185k7.C4049y2) r3
            java.lang.String r3 = r3.m9148y()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L1f
            return
        L1f:
            int r2 = r2 + 1
            goto L6
        L22:
            k7.x2 r0 = p185k7.C4049y2.m9136w()
            r0.m9086r(r4)
            long r2 = (long) r6
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            long r2 = r6.longValue()
            r0.m9085q(r2)
            k7.d6 r6 = r0.m8201f()
            k7.y2 r6 = (p185k7.C4049y2) r6
            k7.x2 r0 = p185k7.C4049y2.m9136w()
            java.lang.String r2 = "_ev"
            r0.m9086r(r2)
            r0.m9087s(r7)
            k7.d6 r7 = r0.m8201f()
            k7.y2 r7 = (p185k7.C4049y2) r7
            boolean r0 = r5.f16454a0
            if (r0 == 0) goto L56
            r5.m8203j()
            r5.f16454a0 = r1
        L56:
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r5.f16453Z
            k7.u2 r0 = (p185k7.C3997u2) r0
            p185k7.C3997u2.m9033C(r0, r6)
            boolean r6 = r5.f16454a0
            if (r6 == 0) goto L66
            r5.m8203j()
            r5.f16454a0 = r1
        L66:
            MessageType extends k7.d6<MessageType, BuilderType> r5 = r5.f16453Z
            k7.u2 r5 = (p185k7.C3997u2) r5
            p185k7.C3997u2.m9033C(r5, r7)
            return
    }

    /* renamed from: w */
    public static final void m11330w(p185k7.C3984t2 r3, java.lang.String r4) {
            java.util.List r0 = r3.m9014y()
            r1 = 0
        L5:
            int r2 = r0.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r0.get(r1)
            k7.y2 r2 = (p185k7.C4049y2) r2
            java.lang.String r2 = r2.m9148y()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L1f
            r3.m9009t(r1)
            return
        L1f:
            int r1 = r1 + 1
            goto L5
        L22:
            return
    }

    /* renamed from: A */
    public final void m11331A() {
            r5 = this;
            o7.f4 r0 = r5.mo3160b()
            r0.mo3183i()
            boolean r0 = r5.f19878s
            if (r0 != 0) goto L43
            boolean r0 = r5.f19879t
            if (r0 != 0) goto L43
            boolean r0 = r5.f19880u
            if (r0 == 0) goto L14
            goto L43
        L14:
            com.google.android.gms.measurement.internal.b r0 = r5.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r1 = "Stopping uploading service(s)"
            r0.m11169c(r1)
            java.util.List<java.lang.Runnable> r0 = r5.f19875p
            if (r0 != 0) goto L24
            return
        L24:
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L28
        L38:
            java.util.List<java.lang.Runnable> r0 = r5.f19875p
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            r0.clear()
            return
        L43:
            com.google.android.gms.measurement.internal.b r0 = r5.mo3162d()
            o7.f3 r0 = r0.f5680n
            boolean r1 = r5.f19878s
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r2 = r5.f19879t
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r3 = r5.f19880u
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Not stopping services. fetch, network, upload"
            r0.m11172f(r4, r1, r2, r3)
            return
    }

    /* renamed from: B */
    public final void m11332B(p185k7.C3756c3 r11, long r12, boolean r14) {
            r10 = this;
            r0 = 1
            if (r0 == r14) goto L6
            java.lang.String r1 = "_lte"
            goto L8
        L6:
            java.lang.String r1 = "_se"
        L8:
            o7.j r2 = r10.f19862c
            m11327I(r2)
            java.lang.String r3 = r11.m8258Z()
            o7.r6 r2 = r2.m11260K(r3, r1)
            if (r2 == 0) goto L44
            java.lang.Object r3 = r2.f19984e
            if (r3 != 0) goto L1c
            goto L44
        L1c:
            o7.r6 r9 = new o7.r6
            java.lang.String r3 = r11.m8258Z()
            u6.c r4 = r10.mo3163e()
            u6.d r4 = (p353u6.C6341d) r4
            java.util.Objects.requireNonNull(r4)
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Object r2 = r2.f19984e
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            long r4 = r4 + r12
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "auto"
            r2 = r9
            r5 = r1
            r2.<init>(r3, r4, r5, r6, r8)
            goto L62
        L44:
            o7.r6 r9 = new o7.r6
            java.lang.String r3 = r11.m8258Z()
            u6.c r2 = r10.mo3163e()
            u6.d r2 = (p353u6.C6341d) r2
            java.util.Objects.requireNonNull(r2)
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
            java.lang.String r4 = "auto"
            r2 = r9
            r5 = r1
            r2.<init>(r3, r4, r5, r6, r8)
        L62:
            k7.l3 r2 = p185k7.C3894m3.m8804v()
            r2.m8792q(r1)
            u6.c r3 = r10.mo3163e()
            u6.d r3 = (p353u6.C6341d) r3
            java.util.Objects.requireNonNull(r3)
            long r3 = java.lang.System.currentTimeMillis()
            r2.m8793r(r3)
            java.lang.Object r3 = r9.f19984e
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r2.m8791p(r3)
            k7.d6 r2 = r2.m8201f()
            k7.m3 r2 = (p185k7.C3894m3) r2
            int r1 = p249o7.C5068o6.m11394x(r11, r1)
            r3 = 0
            if (r1 < 0) goto La2
            boolean r4 = r11.f16454a0
            if (r4 == 0) goto L9a
            r11.m8203j()
            r11.f16454a0 = r3
        L9a:
            MessageType extends k7.d6<MessageType, BuilderType> r11 = r11.f16453Z
            k7.d3 r11 = (p185k7.C3770d3) r11
            p185k7.C3770d3.m8421x0(r11, r1, r2)
            goto Lb2
        La2:
            boolean r1 = r11.f16454a0
            if (r1 == 0) goto Lab
            r11.m8203j()
            r11.f16454a0 = r3
        Lab:
            MessageType extends k7.d6<MessageType, BuilderType> r11 = r11.f16453Z
            k7.d3 r11 = (p185k7.C3770d3) r11
            p185k7.C3770d3.m8422y0(r11, r2)
        Lb2:
            r1 = 0
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 <= 0) goto Ld4
            o7.j r11 = r10.f19862c
            m11327I(r11)
            r11.m11280v(r9)
            if (r0 == r14) goto Lc5
            java.lang.String r11 = "lifetime"
            goto Lc7
        Lc5:
            java.lang.String r11 = "session-scoped"
        Lc7:
            com.google.android.gms.measurement.internal.b r12 = r10.mo3162d()
            o7.f3 r12 = r12.f5680n
            java.lang.Object r13 = r9.f19984e
            java.lang.String r14 = "Updated engagement user property. scope, value"
            r12.m11171e(r14, r11, r13)
        Ld4:
            return
    }

    /* renamed from: C */
    public final void m11333C(p185k7.C3984t2 r10, p185k7.C3984t2 r11) {
            r9 = this;
            java.lang.String r0 = r10.m9013x()
            java.lang.String r1 = "_e"
            boolean r0 = r1.equals(r0)
            com.google.android.gms.common.internal.C1101a.m3096a(r0)
            o7.o6 r0 = r9.f19866g
            m11327I(r0)
            k7.d6 r0 = r10.m8201f()
            k7.u2 r0 = (p185k7.C3997u2) r0
            java.lang.String r1 = "_et"
            k7.y2 r0 = p249o7.C5068o6.m11387o(r0, r1)
            if (r0 == 0) goto L6f
            boolean r2 = r0.m9141N()
            if (r2 == 0) goto L6f
            long r2 = r0.m9147v()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L31
            goto L6f
        L31:
            long r2 = r0.m9147v()
            o7.o6 r0 = r9.f19866g
            m11327I(r0)
            k7.d6 r0 = r11.m8201f()
            k7.u2 r0 = (p185k7.C3997u2) r0
            k7.y2 r0 = p249o7.C5068o6.m11387o(r0, r1)
            if (r0 == 0) goto L53
            long r6 = r0.m9147v()
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L53
            long r4 = r0.m9147v()
            long r2 = r2 + r4
        L53:
            o7.o6 r0 = r9.f19866g
            m11327I(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            p249o7.C5068o6.m11385m(r11, r1, r0)
            o7.o6 r11 = r9.f19866g
            m11327I(r11)
            r0 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "_fr"
            p249o7.C5068o6.m11385m(r10, r0, r11)
        L6f:
            return
    }

    /* renamed from: D */
    public final void m11334D() {
            r19 = this;
            r1 = r19
            o7.f4 r0 = r19.mo3160b()
            r0.mo3183i()
            r19.m11348g()
            long r2 = r1.f19874o
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L43
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            u6.c r0 = r19.mo3163e()
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r8 = r1.f19874o
            long r6 = r6 - r8
            long r6 = java.lang.Math.abs(r6)
            long r2 = r2 - r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L41
            com.google.android.gms.measurement.internal.b r0 = r19.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r0.m11170d(r3, r2)
            goto L3e9
        L41:
            r1.f19874o = r4
        L43:
            com.google.android.gms.measurement.internal.d r0 = r1.f19871l
            boolean r0 = r0.m3167i()
            if (r0 == 0) goto L3de
            boolean r0 = r19.m11337G()
            if (r0 != 0) goto L53
            goto L3de
        L53:
            u6.c r0 = r19.mo3163e()
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r19.m11340K()
            o7.u2<java.lang.Long> r0 = p249o7.C5120v2.f20056A
            r6 = 0
            java.lang.Object r0 = r0.m11421a(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r7 = r0.longValue()
            long r7 = java.lang.Math.max(r4, r7)
            o7.j r0 = r1.f19862c
            m11327I(r0)
            java.lang.String r9 = "select count(1) > 0 from raw_events where realtime = 1"
            long r9 = r0.m11283z(r9, r6)
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L85
            r0 = 1
            goto L86
        L85:
            r0 = 0
        L86:
            if (r0 != 0) goto L9f
            o7.j r0 = r1.f19862c
            m11327I(r0)
            java.lang.String r9 = "select count(1) > 0 from queue where has_realtime = 1"
            long r9 = r0.m11283z(r9, r6)
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L99
            r0 = 1
            goto L9a
        L99:
            r0 = 0
        L9a:
            if (r0 == 0) goto L9d
            goto L9f
        L9d:
            r0 = 0
            goto La0
        L9f:
            r0 = 1
        La0:
            if (r0 == 0) goto Lc8
            o7.f r9 = r19.m11340K()
            java.lang.String r10 = "debug.firebase.analytics.app"
            java.lang.String r13 = ""
            java.lang.String r9 = r9.m11151k(r10, r13)
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto Lc2
            java.lang.String r10 = ".none."
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto Lc2
            r19.m11340K()
            o7.u2<java.lang.Long> r9 = p249o7.C5120v2.f20124v
            goto Lcd
        Lc2:
            r19.m11340K()
            o7.u2<java.lang.Long> r9 = p249o7.C5120v2.f20122u
            goto Lcd
        Lc8:
            r19.m11340K()
            o7.u2<java.lang.Long> r9 = p249o7.C5120v2.f20120t
        Lcd:
            java.lang.Object r9 = r9.m11421a(r6)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r4, r9)
            o7.w5 r13 = r1.f19868i
            o7.p3 r13 = r13.f20154i
            long r13 = r13.m11410a()
            o7.w5 r15 = r1.f19868i
            o7.p3 r15 = r15.f20155j
            long r15 = r15.m11410a()
            o7.j r11 = r1.f19862c
            m11327I(r11)
            java.lang.String r12 = "select max(bundle_end_timestamp) from queue"
            long r11 = r11.m11250A(r12, r6, r4)
            o7.j r4 = r1.f19862c
            m11327I(r4)
            java.lang.String r5 = "select max(timestamp) from raw_events"
            r17 = r9
            r9 = 0
            long r4 = r4.m11250A(r5, r6, r9)
            long r4 = java.lang.Math.max(r11, r4)
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 != 0) goto L10f
            goto L18f
        L10f:
            long r4 = r4 - r2
            long r4 = java.lang.Math.abs(r4)
            long r4 = r2 - r4
            long r13 = r13 - r2
            long r9 = java.lang.Math.abs(r13)
            long r15 = r15 - r2
            long r11 = java.lang.Math.abs(r15)
            long r11 = r2 - r11
            long r2 = r2 - r9
            long r2 = java.lang.Math.max(r2, r11)
            long r7 = r7 + r4
            if (r0 == 0) goto L136
            r9 = 0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L136
            long r7 = java.lang.Math.min(r4, r2)
            long r7 = r7 + r17
        L136:
            o7.o6 r0 = r1.f19866g
            m11327I(r0)
            r9 = r17
            boolean r0 = r0.m11404N(r2, r9)
            if (r0 != 0) goto L145
            long r2 = r2 + r9
            goto L146
        L145:
            r2 = r7
        L146:
            r7 = 0
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 == 0) goto L191
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 < 0) goto L191
            r0 = 0
        L151:
            r19.m11340K()
            r4 = 20
            o7.u2<java.lang.Integer> r5 = p249o7.C5120v2.f20058C
            java.lang.Object r5 = r5.m11421a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            int r4 = java.lang.Math.min(r4, r5)
            if (r0 >= r4) goto L18f
            r19.m11340K()
            o7.u2<java.lang.Long> r4 = p249o7.C5120v2.f20057B
            java.lang.Object r4 = r4.m11421a(r6)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r7 = 0
            long r4 = java.lang.Math.max(r7, r4)
            r7 = 1
            long r7 = r7 << r0
            long r4 = r4 * r7
            long r2 = r2 + r4
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 > 0) goto L191
            int r0 = r0 + 1
            goto L151
        L18f:
            r2 = 0
        L191:
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L3d5
            o7.k3 r0 = r1.f19861b
            m11327I(r0)
            boolean r0 = r0.m11288n()
            if (r0 == 0) goto L37f
            o7.w5 r0 = r1.f19868i
            o7.p3 r0 = r0.f20153h
            long r4 = r0.m11410a()
            r19.m11340K()
            o7.u2<java.lang.Long> r0 = p249o7.C5120v2.f20116r
            java.lang.Object r0 = r0.m11421a(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r7 = r0.longValue()
            r9 = 0
            long r7 = java.lang.Math.max(r9, r7)
            o7.o6 r0 = r1.f19866g
            m11327I(r0)
            boolean r0 = r0.m11404N(r4, r7)
            if (r0 != 0) goto L1cf
            long r4 = r4 + r7
            long r2 = java.lang.Math.max(r2, r4)
        L1cf:
            o7.m3 r0 = r19.m11343N()
            r0.m11314a()
            u6.c r0 = r19.mo3163e()
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L211
            r19.m11340K()
            o7.u2<java.lang.Long> r0 = p249o7.C5120v2.f20126w
            java.lang.Object r0 = r0.m11421a(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            long r2 = java.lang.Math.max(r4, r2)
            o7.w5 r0 = r1.f19868i
            o7.p3 r0 = r0.f20154i
            u6.c r4 = r19.mo3163e()
            u6.d r4 = (p353u6.C6341d) r4
            java.util.Objects.requireNonNull(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r0.m11411b(r4)
        L211:
            com.google.android.gms.measurement.internal.b r0 = r19.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.String r5 = "Upload scheduled in approximately ms"
            r0.m11170d(r5, r4)
            o7.g6 r0 = r1.f19864e
            m11327I(r0)
            r0.m11247j()
            com.google.android.gms.measurement.internal.d r4 = r0.f5736a
            java.util.Objects.requireNonNull(r4)
            com.google.android.gms.measurement.internal.d r4 = r0.f5736a
            android.content.Context r4 = r4.f5710a
            boolean r5 = com.google.android.gms.measurement.internal.C1115f.m3186X(r4)
            if (r5 != 0) goto L244
            com.google.android.gms.measurement.internal.d r5 = r0.f5736a
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()
            o7.f3 r5 = r5.f5679m
            java.lang.String r7 = "Receiver not registered/enabled"
            r5.m11169c(r7)
        L244:
            boolean r4 = com.google.android.gms.measurement.internal.C1115f.m3187Y(r4)
            if (r4 != 0) goto L257
            com.google.android.gms.measurement.internal.d r4 = r0.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5679m
            java.lang.String r5 = "Service not registered/enabled"
            r4.m11169c(r5)
        L257:
            r0.m11193m()
            com.google.android.gms.measurement.internal.d r4 = r0.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5680n
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            java.lang.String r7 = "Scheduling upload, millis"
            r4.m11170d(r7, r5)
            com.google.android.gms.measurement.internal.d r4 = r0.f5736a
            u6.c r4 = r4.f5723n
            u6.d r4 = (p353u6.C6341d) r4
            java.util.Objects.requireNonNull(r4)
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r9 = r4 + r2
            com.google.android.gms.measurement.internal.d r4 = r0.f5736a
            java.util.Objects.requireNonNull(r4)
            o7.u2<java.lang.Long> r4 = p249o7.C5120v2.f20128x
            java.lang.Object r4 = r4.m11421a(r6)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r7 = 0
            long r4 = java.lang.Math.max(r7, r4)
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 >= 0) goto L2ab
            o7.k r4 = r0.m11196p()
            long r4 = r4.f19796c
            int r11 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r11 == 0) goto L2a1
            r4 = 1
            goto L2a2
        L2a1:
            r4 = 0
        L2a2:
            if (r4 != 0) goto L2ab
            o7.k r4 = r0.m11196p()
            r4.m11285c(r2)
        L2ab:
            com.google.android.gms.measurement.internal.d r4 = r0.f5736a
            java.util.Objects.requireNonNull(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L35d
            com.google.android.gms.measurement.internal.d r4 = r0.f5736a
            android.content.Context r4 = r4.f5710a
            android.content.ComponentName r5 = new android.content.ComponentName
            java.lang.String r6 = "com.google.android.gms.measurement.AppMeasurementJobService"
            r5.<init>(r4, r6)
            int r0 = r0.m11194n()
            android.os.PersistableBundle r6 = new android.os.PersistableBundle
            r6.<init>()
            java.lang.String r7 = "action"
            java.lang.String r8 = "com.google.android.gms.measurement.UPLOAD"
            r6.putString(r7, r8)
            android.app.job.JobInfo$Builder r7 = new android.app.job.JobInfo$Builder
            r7.<init>(r0, r5)
            android.app.job.JobInfo$Builder r0 = r7.setMinimumLatency(r2)
            long r2 = r2 + r2
            android.app.job.JobInfo$Builder r0 = r0.setOverrideDeadline(r2)
            android.app.job.JobInfo$Builder r0 = r0.setExtras(r6)
            android.app.job.JobInfo r2 = r0.build()
            java.lang.reflect.Method r0 = p185k7.C3837i0.f16669a
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r4.getSystemService(r0)
            r3 = r0
            android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3
            java.util.Objects.requireNonNull(r3)
            java.lang.reflect.Method r0 = p185k7.C3837i0.f16669a
            if (r0 == 0) goto L359
            java.lang.String r0 = "android.permission.UPDATE_DEVICE_STATS"
            int r0 = r4.checkSelfPermission(r0)
            if (r0 == 0) goto L302
            goto L359
        L302:
            java.lang.reflect.Method r0 = p185k7.C3837i0.f16670b
            if (r0 == 0) goto L329
            java.lang.Class<android.os.UserHandle> r4 = android.os.UserHandle.class
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L318 java.lang.IllegalAccessException -> L31a
            java.lang.Object r0 = r0.invoke(r4, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L318 java.lang.IllegalAccessException -> L31a
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.reflect.InvocationTargetException -> L318 java.lang.IllegalAccessException -> L31a
            if (r0 == 0) goto L329
            int r7 = r0.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L318 java.lang.IllegalAccessException -> L31a
            goto L32a
        L318:
            r0 = move-exception
            goto L31b
        L31a:
            r0 = move-exception
        L31b:
            r4 = 6
            java.lang.String r5 = "JobSchedulerCompat"
            boolean r4 = android.util.Log.isLoggable(r5, r4)
            if (r4 == 0) goto L329
            java.lang.String r4 = "myUserId invocation illegal"
            android.util.Log.e(r5, r4, r0)
        L329:
            r7 = 0
        L32a:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r4 = "UploadAlarm"
            java.lang.reflect.Method r5 = p185k7.C3837i0.f16669a
            if (r5 == 0) goto L359
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L351 java.lang.IllegalAccessException -> L353
            r8 = 0
            r6[r8] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L351 java.lang.IllegalAccessException -> L353
            r8 = 1
            r6[r8] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L351 java.lang.IllegalAccessException -> L353
            r0 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L351 java.lang.IllegalAccessException -> L353
            r6[r0] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L351 java.lang.IllegalAccessException -> L353
            r0 = 3
            r6[r0] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L351 java.lang.IllegalAccessException -> L353
            java.lang.Object r0 = r5.invoke(r3, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L351 java.lang.IllegalAccessException -> L353
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.reflect.InvocationTargetException -> L351 java.lang.IllegalAccessException -> L353
            if (r0 == 0) goto L37e
            r0.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L351 java.lang.IllegalAccessException -> L353
            goto L37e
        L351:
            r0 = move-exception
            goto L354
        L353:
            r0 = move-exception
        L354:
            java.lang.String r5 = "error calling scheduleAsPackage"
            android.util.Log.e(r4, r5, r0)
        L359:
            r3.schedule(r2)
            goto L37e
        L35d:
            android.app.AlarmManager r7 = r0.f19708d
            if (r7 == 0) goto L37e
            com.google.android.gms.measurement.internal.d r4 = r0.f5736a
            java.util.Objects.requireNonNull(r4)
            r8 = 2
            o7.u2<java.lang.Long> r4 = p249o7.C5120v2.f20118s
            java.lang.Object r4 = r4.m11421a(r6)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r11 = java.lang.Math.max(r4, r2)
            android.app.PendingIntent r13 = r0.m11195o()
            r7.setInexactRepeating(r8, r9, r11, r13)
        L37e:
            return
        L37f:
            com.google.android.gms.measurement.internal.b r0 = r19.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r2 = "No network"
            r0.m11169c(r2)
            o7.m3 r0 = r19.m11343N()
            o7.m6 r2 = r0.f19842a
            r2.m11348g()
            o7.m6 r2 = r0.f19842a
            o7.f4 r2 = r2.mo3160b()
            r2.mo3183i()
            boolean r2 = r0.f19843b
            if (r2 == 0) goto L3a1
            goto L3f0
        L3a1:
            o7.m6 r2 = r0.f19842a
            com.google.android.gms.measurement.internal.d r2 = r2.f19871l
            android.content.Context r2 = r2.f5710a
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "android.net.conn.CONNECTIVITY_CHANGE"
            r3.<init>(r4)
            r2.registerReceiver(r0, r3)
            o7.m6 r2 = r0.f19842a
            o7.k3 r2 = r2.f19861b
            m11327I(r2)
            boolean r2 = r2.m11288n()
            r0.f19844c = r2
            o7.m6 r2 = r0.f19842a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5680n
            boolean r3 = r0.f19844c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Registering connectivity change receiver. Network connected"
            r2.m11170d(r4, r3)
            r2 = 1
            r0.f19843b = r2
            goto L3f0
        L3d5:
            com.google.android.gms.measurement.internal.b r0 = r19.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r2 = "Next upload time is 0"
            goto L3e6
        L3de:
            com.google.android.gms.measurement.internal.b r0 = r19.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r2 = "Nothing to upload or uploading impossible"
        L3e6:
            r0.m11169c(r2)
        L3e9:
            o7.m3 r0 = r19.m11343N()
            r0.m11314a()
        L3f0:
            o7.g6 r0 = r1.f19864e
            m11327I(r0)
            r0.m11193m()
            return
    }

    /* renamed from: E */
    public final boolean m11335E(p249o7.C5116u6 r4) {
            r3 = this;
            p185k7.C3847ia.m8706c()
            o7.f r0 = r3.m11340K()
            java.lang.String r1 = r4.f20031Y
            o7.u2<java.lang.Boolean> r2 = p249o7.C5120v2.f20089d0
            boolean r0 = r0.m11162v(r1, r2)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2e
            java.lang.String r0 = r4.f20032Z
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2d
            java.lang.String r0 = r4.f20051s0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2d
            java.lang.String r4 = r4.f20047o0
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L2c
            goto L2d
        L2c:
            return r1
        L2d:
            return r2
        L2e:
            java.lang.String r0 = r4.f20032Z
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L40
            java.lang.String r4 = r4.f20047o0
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L3f
            goto L40
        L3f:
            return r1
        L40:
            return r2
    }

    /* renamed from: F */
    public final boolean m11336F(java.lang.String r47, long r48) {
            r46 = this;
            r1 = r46
            java.lang.String r2 = "_si"
            java.lang.String r3 = "_sc"
            java.lang.String r4 = "_sn"
            java.lang.String r5 = "_npa"
            java.lang.String r6 = "_ai"
            o7.j r7 = r1.f19862c
            m11327I(r7)
            r7.m11267R()
            o7.l6 r7 = new o7.l6     // Catch: java.lang.Throwable -> Le02
            r7.<init>(r1)     // Catch: java.lang.Throwable -> Le02
            o7.j r8 = r1.f19862c     // Catch: java.lang.Throwable -> Le02
            m11327I(r8)     // Catch: java.lang.Throwable -> Le02
            r9 = 0
            long r12 = r1.f19885z     // Catch: java.lang.Throwable -> Le02
            r10 = r48
            r14 = r7
            r8.m11281w(r9, r10, r12, r14)     // Catch: java.lang.Throwable -> Le02
            java.util.List<k7.u2> r8 = r7.f19830c     // Catch: java.lang.Throwable -> Le02
            if (r8 == 0) goto Ldf0
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> Le02
            if (r8 == 0) goto L33
            goto Ldf0
        L33:
            k7.d3 r8 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            k7.a6 r8 = r8.m8501o()     // Catch: java.lang.Throwable -> Le02
            k7.c3 r8 = (p185k7.C3756c3) r8     // Catch: java.lang.Throwable -> Le02
            r8.m8279r0()     // Catch: java.lang.Throwable -> Le02
            o7.f r10 = r46.m11340K()     // Catch: java.lang.Throwable -> Le02
            k7.d3 r11 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r11 = r11.m8431D1()     // Catch: java.lang.Throwable -> Le02
            o7.u2<java.lang.Boolean> r12 = p249o7.C5120v2.f20076U     // Catch: java.lang.Throwable -> Le02
            boolean r10 = r10.m11162v(r11, r12)     // Catch: java.lang.Throwable -> Le02
            r9 = -1
            r11 = -1
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
        L5b:
            java.util.List<k7.u2> r12 = r7.f19830c     // Catch: java.lang.Throwable -> Le02
            int r12 = r12.size()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r13 = "_fr"
            r21 = r5
            java.lang.String r5 = "_et"
            r22 = r15
            java.lang.String r15 = "_e"
            r16 = r10
            r24 = r11
            if (r14 >= r12) goto L6a2
            java.util.List<k7.u2> r11 = r7.f19830c     // Catch: java.lang.Throwable -> Le02
            java.lang.Object r11 = r11.get(r14)     // Catch: java.lang.Throwable -> Le02
            k7.u2 r11 = (p185k7.C3997u2) r11     // Catch: java.lang.Throwable -> Le02
            k7.a6 r11 = r11.m8501o()     // Catch: java.lang.Throwable -> Le02
            k7.t2 r11 = (p185k7.C3984t2) r11     // Catch: java.lang.Throwable -> Le02
            o7.a4 r12 = r1.f19860a     // Catch: java.lang.Throwable -> Le02
            m11327I(r12)     // Catch: java.lang.Throwable -> Le02
            k7.d3 r10 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r10 = r10.m8431D1()     // Catch: java.lang.Throwable -> Le02
            r28 = r14
            java.lang.String r14 = r11.m9013x()     // Catch: java.lang.Throwable -> Le02
            boolean r10 = r12.m11096s(r10, r14)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r12 = "_err"
            if (r10 == 0) goto L116
            com.google.android.gms.measurement.internal.b r5 = r46.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r5 = r5.m3142s()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r10 = "Dropping blocked raw event. appId"
            k7.d3 r13 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r13 = r13.m8431D1()     // Catch: java.lang.Throwable -> Le02
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C1111b.m3134u(r13)     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.d r14 = r1.f19871l     // Catch: java.lang.Throwable -> Le02
            o7.c3 r14 = r14.m3174s()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r15 = r11.m9013x()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r14 = r14.m11116d(r15)     // Catch: java.lang.Throwable -> Le02
            r5.m11171e(r10, r13, r14)     // Catch: java.lang.Throwable -> Le02
            o7.a4 r5 = r1.f19860a     // Catch: java.lang.Throwable -> Le02
            m11327I(r5)     // Catch: java.lang.Throwable -> Le02
            k7.d3 r10 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r10 = r10.m8431D1()     // Catch: java.lang.Throwable -> Le02
            boolean r5 = r5.m11094q(r10)     // Catch: java.lang.Throwable -> Le02
            if (r5 != 0) goto L105
            o7.a4 r5 = r1.f19860a     // Catch: java.lang.Throwable -> Le02
            m11327I(r5)     // Catch: java.lang.Throwable -> Le02
            k7.d3 r10 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r10 = r10.m8431D1()     // Catch: java.lang.Throwable -> Le02
            boolean r5 = r5.m11097t(r10)     // Catch: java.lang.Throwable -> Le02
            if (r5 == 0) goto Le0
            goto L105
        Le0:
            java.lang.String r5 = r11.m9013x()     // Catch: java.lang.Throwable -> Le02
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> Le02
            if (r5 != 0) goto L105
            com.google.android.gms.measurement.internal.f r29 = r46.m11345Q()     // Catch: java.lang.Throwable -> Le02
            o7.s6 r5 = r1.f19859B     // Catch: java.lang.Throwable -> Le02
            k7.d3 r10 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r31 = r10.m8431D1()     // Catch: java.lang.Throwable -> Le02
            r32 = 11
            java.lang.String r33 = "_ev"
            java.lang.String r34 = r11.m9013x()     // Catch: java.lang.Throwable -> Le02
            r35 = 0
            r30 = r5
            r29.m3196A(r30, r31, r32, r33, r34, r35)     // Catch: java.lang.Throwable -> Le02
        L105:
            r12 = r3
            r30 = r6
            r5 = r22
            r11 = r24
            r14 = r28
            r3 = r2
            r45 = r9
            r9 = r4
            r4 = r45
            goto L690
        L116:
            java.lang.String r10 = r11.m9013x()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r14 = p249o7.C5066o4.m11378a(r6)     // Catch: java.lang.Throwable -> Le02
            boolean r10 = r10.equals(r14)     // Catch: java.lang.Throwable -> Le02
            if (r10 == 0) goto L18c
            r11.m9010u(r6)     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.b r10 = r46.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r10 = r10.m3141r()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r14 = "Renaming ad_impression to _ai"
            r10.m11169c(r14)     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.b r10 = r46.mo3162d()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r10 = r10.m3144x()     // Catch: java.lang.Throwable -> Le02
            r14 = 5
            boolean r10 = android.util.Log.isLoggable(r10, r14)     // Catch: java.lang.Throwable -> Le02
            if (r10 == 0) goto L18c
            r10 = 0
        L144:
            int r14 = r11.m9005p()     // Catch: java.lang.Throwable -> Le02
            if (r10 >= r14) goto L18c
            java.lang.String r14 = "ad_platform"
            k7.y2 r29 = r11.m9012w(r10)     // Catch: java.lang.Throwable -> Le02
            r30 = r6
            java.lang.String r6 = r29.m9148y()     // Catch: java.lang.Throwable -> Le02
            boolean r6 = r14.equals(r6)     // Catch: java.lang.Throwable -> Le02
            if (r6 == 0) goto L187
            k7.y2 r6 = r11.m9012w(r10)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r6 = r6.m9149z()     // Catch: java.lang.Throwable -> Le02
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Le02
            if (r6 != 0) goto L187
            java.lang.String r6 = "admob"
            k7.y2 r14 = r11.m9012w(r10)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r14 = r14.m9149z()     // Catch: java.lang.Throwable -> Le02
            boolean r6 = r6.equalsIgnoreCase(r14)     // Catch: java.lang.Throwable -> Le02
            if (r6 == 0) goto L187
            com.google.android.gms.measurement.internal.b r6 = r46.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r6 = r6.m3143t()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r14 = "AdMob ad impression logged from app. Potentially duplicative."
            r6.m11169c(r14)     // Catch: java.lang.Throwable -> Le02
        L187:
            int r10 = r10 + 1
            r6 = r30
            goto L144
        L18c:
            r30 = r6
            o7.a4 r6 = r1.f19860a     // Catch: java.lang.Throwable -> Le02
            m11327I(r6)     // Catch: java.lang.Throwable -> Le02
            k7.d3 r10 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r10 = r10.m8431D1()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r14 = r11.m9013x()     // Catch: java.lang.Throwable -> Le02
            boolean r6 = r6.m11095r(r10, r14)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r10 = "_c"
            if (r6 != 0) goto L1f9
            o7.o6 r14 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r14)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r14 = r11.m9013x()     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.common.internal.C1101a.m3100e(r14)     // Catch: java.lang.Throwable -> Le02
            r29 = r2
            int r2 = r14.hashCode()     // Catch: java.lang.Throwable -> Le02
            r31 = r3
            r3 = 94660(0x171c4, float:1.32647E-40)
            if (r2 == r3) goto L1dd
            r3 = 95025(0x17331, float:1.33158E-40)
            if (r2 == r3) goto L1d3
            r3 = 95027(0x17333, float:1.33161E-40)
            if (r2 == r3) goto L1c9
            goto L1e7
        L1c9:
            java.lang.String r2 = "_ui"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L1e7
            r2 = 1
            goto L1e8
        L1d3:
            java.lang.String r2 = "_ug"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L1e7
            r2 = 2
            goto L1e8
        L1dd:
            java.lang.String r2 = "_in"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L1e7
            r2 = 0
            goto L1e8
        L1e7:
            r2 = -1
        L1e8:
            if (r2 == 0) goto L1fd
            r3 = 1
            if (r2 == r3) goto L1fd
            r3 = 2
            if (r2 == r3) goto L1fd
            r25 = r4
            r33 = r5
            r32 = r9
            r6 = 0
            goto L3ba
        L1f9:
            r29 = r2
            r31 = r3
        L1fd:
            r25 = r4
            r2 = 0
            r3 = 0
            r14 = 0
        L202:
            int r4 = r11.m9005p()     // Catch: java.lang.Throwable -> Le02
            r32 = r9
            java.lang.String r9 = "_r"
            if (r2 >= r4) goto L26b
            k7.y2 r4 = r11.m9012w(r2)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r4 = r4.m9148y()     // Catch: java.lang.Throwable -> Le02
            boolean r4 = r10.equals(r4)     // Catch: java.lang.Throwable -> Le02
            if (r4 == 0) goto L237
            k7.y2 r3 = r11.m9012w(r2)     // Catch: java.lang.Throwable -> Le02
            k7.a6 r3 = r3.m8501o()     // Catch: java.lang.Throwable -> Le02
            k7.x2 r3 = (p185k7.C4036x2) r3     // Catch: java.lang.Throwable -> Le02
            r33 = r5
            r4 = 1
            r3.m9085q(r4)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r3 = r3.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.y2 r3 = (p185k7.C4049y2) r3     // Catch: java.lang.Throwable -> Le02
            r11.m9011v(r2, r3)     // Catch: java.lang.Throwable -> Le02
            r5 = r8
            r3 = 1
            goto L263
        L237:
            r33 = r5
            k7.y2 r4 = r11.m9012w(r2)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r4 = r4.m9148y()     // Catch: java.lang.Throwable -> Le02
            boolean r4 = r9.equals(r4)     // Catch: java.lang.Throwable -> Le02
            if (r4 == 0) goto L262
            k7.y2 r4 = r11.m9012w(r2)     // Catch: java.lang.Throwable -> Le02
            k7.a6 r4 = r4.m8501o()     // Catch: java.lang.Throwable -> Le02
            k7.x2 r4 = (p185k7.C4036x2) r4     // Catch: java.lang.Throwable -> Le02
            r5 = r8
            r8 = 1
            r4.m9085q(r8)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r4 = r4.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.y2 r4 = (p185k7.C4049y2) r4     // Catch: java.lang.Throwable -> Le02
            r11.m9011v(r2, r4)     // Catch: java.lang.Throwable -> Le02
            r14 = 1
            goto L263
        L262:
            r5 = r8
        L263:
            int r2 = r2 + 1
            r8 = r5
            r9 = r32
            r5 = r33
            goto L202
        L26b:
            r33 = r5
            r5 = r8
            if (r3 != 0) goto L29c
            if (r6 == 0) goto L29c
            com.google.android.gms.measurement.internal.b r2 = r46.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r2 = r2.m3141r()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r3 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.d r4 = r1.f19871l     // Catch: java.lang.Throwable -> Le02
            o7.c3 r4 = r4.m3174s()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r8 = r11.m9013x()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r4 = r4.m11116d(r8)     // Catch: java.lang.Throwable -> Le02
            r2.m11170d(r3, r4)     // Catch: java.lang.Throwable -> Le02
            k7.x2 r2 = p185k7.C4049y2.m9136w()     // Catch: java.lang.Throwable -> Le02
            r2.m9086r(r10)     // Catch: java.lang.Throwable -> Le02
            r3 = 1
            r2.m9085q(r3)     // Catch: java.lang.Throwable -> Le02
            r11.m9008s(r2)     // Catch: java.lang.Throwable -> Le02
        L29c:
            if (r14 != 0) goto L2c8
            com.google.android.gms.measurement.internal.b r2 = r46.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r2 = r2.m3141r()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r3 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.d r4 = r1.f19871l     // Catch: java.lang.Throwable -> Le02
            o7.c3 r4 = r4.m3174s()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r8 = r11.m9013x()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r4 = r4.m11116d(r8)     // Catch: java.lang.Throwable -> Le02
            r2.m11170d(r3, r4)     // Catch: java.lang.Throwable -> Le02
            k7.x2 r2 = p185k7.C4049y2.m9136w()     // Catch: java.lang.Throwable -> Le02
            r2.m9086r(r9)     // Catch: java.lang.Throwable -> Le02
            r3 = 1
            r2.m9085q(r3)     // Catch: java.lang.Throwable -> Le02
            r11.m9008s(r2)     // Catch: java.lang.Throwable -> Le02
        L2c8:
            o7.j r2 = r1.f19862c     // Catch: java.lang.Throwable -> Le02
            m11327I(r2)     // Catch: java.lang.Throwable -> Le02
            long r35 = r46.m11363x()     // Catch: java.lang.Throwable -> Le02
            k7.d3 r3 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r37 = r3.m8431D1()     // Catch: java.lang.Throwable -> Le02
            r38 = 0
            r39 = 1
            r34 = r2
            o7.h r2 = r34.m11257H(r35, r37, r38, r39)     // Catch: java.lang.Throwable -> Le02
            long r2 = r2.f19715e     // Catch: java.lang.Throwable -> Le02
            o7.f r4 = r46.m11340K()     // Catch: java.lang.Throwable -> Le02
            k7.d3 r8 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r8 = r8.m8431D1()     // Catch: java.lang.Throwable -> Le02
            o7.u2<java.lang.Integer> r14 = p249o7.C5120v2.f20110o     // Catch: java.lang.Throwable -> Le02
            int r4 = r4.m11155o(r8, r14)     // Catch: java.lang.Throwable -> Le02
            r8 = r5
            long r4 = (long) r4     // Catch: java.lang.Throwable -> Le02
            int r14 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r14 <= 0) goto L2fd
            m11330w(r11, r9)     // Catch: java.lang.Throwable -> Le02
            goto L2ff
        L2fd:
            r20 = 1
        L2ff:
            java.lang.String r2 = r11.m9013x()     // Catch: java.lang.Throwable -> Le02
            boolean r2 = com.google.android.gms.measurement.internal.C1115f.m3185W(r2)     // Catch: java.lang.Throwable -> Le02
            if (r2 == 0) goto L3ba
            if (r6 == 0) goto L3ba
            o7.j r2 = r1.f19862c     // Catch: java.lang.Throwable -> Le02
            m11327I(r2)     // Catch: java.lang.Throwable -> Le02
            long r35 = r46.m11363x()     // Catch: java.lang.Throwable -> Le02
            k7.d3 r3 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r37 = r3.m8431D1()     // Catch: java.lang.Throwable -> Le02
            r38 = 1
            r39 = 0
            r34 = r2
            o7.h r2 = r34.m11257H(r35, r37, r38, r39)     // Catch: java.lang.Throwable -> Le02
            long r2 = r2.f19713c     // Catch: java.lang.Throwable -> Le02
            o7.f r4 = r46.m11340K()     // Catch: java.lang.Throwable -> Le02
            k7.d3 r5 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r5 = r5.m8431D1()     // Catch: java.lang.Throwable -> Le02
            o7.u2<java.lang.Integer> r9 = p249o7.C5120v2.f20108n     // Catch: java.lang.Throwable -> Le02
            int r4 = r4.m11155o(r5, r9)     // Catch: java.lang.Throwable -> Le02
            long r4 = (long) r4     // Catch: java.lang.Throwable -> Le02
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L3ba
            com.google.android.gms.measurement.internal.b r2 = r46.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r2 = r2.m3142s()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r3 = "Too many conversions. Not logging as conversion. appId"
            k7.d3 r4 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r4 = r4.m8431D1()     // Catch: java.lang.Throwable -> Le02
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r4)     // Catch: java.lang.Throwable -> Le02
            r2.m11170d(r3, r4)     // Catch: java.lang.Throwable -> Le02
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
        L356:
            int r9 = r11.m9005p()     // Catch: java.lang.Throwable -> Le02
            if (r3 >= r9) goto L380
            k7.y2 r9 = r11.m9012w(r3)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r14 = r9.m9148y()     // Catch: java.lang.Throwable -> Le02
            boolean r14 = r10.equals(r14)     // Catch: java.lang.Throwable -> Le02
            if (r14 == 0) goto L372
            k7.a6 r2 = r9.m8501o()     // Catch: java.lang.Throwable -> Le02
            k7.x2 r2 = (p185k7.C4036x2) r2     // Catch: java.lang.Throwable -> Le02
            r5 = r3
            goto L37d
        L372:
            java.lang.String r9 = r9.m9148y()     // Catch: java.lang.Throwable -> Le02
            boolean r9 = r12.equals(r9)     // Catch: java.lang.Throwable -> Le02
            if (r9 == 0) goto L37d
            r4 = 1
        L37d:
            int r3 = r3 + 1
            goto L356
        L380:
            if (r4 == 0) goto L389
            if (r2 == 0) goto L388
            r11.m9009t(r5)     // Catch: java.lang.Throwable -> Le02
            goto L3ba
        L388:
            r2 = 0
        L389:
            if (r2 == 0) goto L3a3
            k7.a6 r2 = r2.m8204k()     // Catch: java.lang.Throwable -> Le02
            k7.x2 r2 = (p185k7.C4036x2) r2     // Catch: java.lang.Throwable -> Le02
            r2.m9086r(r12)     // Catch: java.lang.Throwable -> Le02
            r3 = 10
            r2.m9085q(r3)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r2 = r2.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.y2 r2 = (p185k7.C4049y2) r2     // Catch: java.lang.Throwable -> Le02
            r11.m9011v(r5, r2)     // Catch: java.lang.Throwable -> Le02
            goto L3ba
        L3a3:
            com.google.android.gms.measurement.internal.b r2 = r46.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r2 = r2.m3140q()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r3 = "Did not find conversion parameter. appId"
            k7.d3 r4 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r4 = r4.m8431D1()     // Catch: java.lang.Throwable -> Le02
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r4)     // Catch: java.lang.Throwable -> Le02
            r2.m11170d(r3, r4)     // Catch: java.lang.Throwable -> Le02
        L3ba:
            if (r6 == 0) goto L473
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le02
            java.util.List r3 = r11.m9014y()     // Catch: java.lang.Throwable -> Le02
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Le02
            r3 = 0
            r4 = -1
            r5 = -1
        L3c8:
            int r6 = r2.size()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r9 = "currency"
            java.lang.String r12 = "value"
            if (r3 >= r6) goto L3f8
            java.lang.Object r6 = r2.get(r3)     // Catch: java.lang.Throwable -> Le02
            k7.y2 r6 = (p185k7.C4049y2) r6     // Catch: java.lang.Throwable -> Le02
            java.lang.String r6 = r6.m9148y()     // Catch: java.lang.Throwable -> Le02
            boolean r6 = r12.equals(r6)     // Catch: java.lang.Throwable -> Le02
            if (r6 == 0) goto L3e4
            r4 = r3
            goto L3f5
        L3e4:
            java.lang.Object r6 = r2.get(r3)     // Catch: java.lang.Throwable -> Le02
            k7.y2 r6 = (p185k7.C4049y2) r6     // Catch: java.lang.Throwable -> Le02
            java.lang.String r6 = r6.m9148y()     // Catch: java.lang.Throwable -> Le02
            boolean r6 = r9.equals(r6)     // Catch: java.lang.Throwable -> Le02
            if (r6 == 0) goto L3f5
            r5 = r3
        L3f5:
            int r3 = r3 + 1
            goto L3c8
        L3f8:
            r3 = -1
            if (r4 != r3) goto L3fd
            goto L474
        L3fd:
            java.lang.Object r3 = r2.get(r4)     // Catch: java.lang.Throwable -> Le02
            k7.y2 r3 = (p185k7.C4049y2) r3     // Catch: java.lang.Throwable -> Le02
            boolean r3 = r3.m9141N()     // Catch: java.lang.Throwable -> Le02
            if (r3 != 0) goto L42e
            java.lang.Object r3 = r2.get(r4)     // Catch: java.lang.Throwable -> Le02
            k7.y2 r3 = (p185k7.C4049y2) r3     // Catch: java.lang.Throwable -> Le02
            boolean r3 = r3.m9139L()     // Catch: java.lang.Throwable -> Le02
            if (r3 != 0) goto L42e
            com.google.android.gms.measurement.internal.b r2 = r46.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r2 = r2.m3143t()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.m11169c(r3)     // Catch: java.lang.Throwable -> Le02
            r11.m9009t(r4)     // Catch: java.lang.Throwable -> Le02
            m11330w(r11, r10)     // Catch: java.lang.Throwable -> Le02
            r2 = 18
            m11329v(r11, r2, r12)     // Catch: java.lang.Throwable -> Le02
            goto L473
        L42e:
            r3 = -1
            if (r5 != r3) goto L432
            goto L45a
        L432:
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Le02
            k7.y2 r2 = (p185k7.C4049y2) r2     // Catch: java.lang.Throwable -> Le02
            java.lang.String r2 = r2.m9149z()     // Catch: java.lang.Throwable -> Le02
            int r5 = r2.length()     // Catch: java.lang.Throwable -> Le02
            r6 = 3
            if (r5 != r6) goto L45a
            r5 = 0
        L444:
            int r6 = r2.length()     // Catch: java.lang.Throwable -> Le02
            if (r5 >= r6) goto L474
            int r6 = r2.codePointAt(r5)     // Catch: java.lang.Throwable -> Le02
            boolean r12 = java.lang.Character.isLetter(r6)     // Catch: java.lang.Throwable -> Le02
            if (r12 == 0) goto L45a
            int r6 = java.lang.Character.charCount(r6)     // Catch: java.lang.Throwable -> Le02
            int r5 = r5 + r6
            goto L444
        L45a:
            com.google.android.gms.measurement.internal.b r2 = r46.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r2 = r2.m3143t()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r5 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.m11169c(r5)     // Catch: java.lang.Throwable -> Le02
            r11.m9009t(r4)     // Catch: java.lang.Throwable -> Le02
            m11330w(r11, r10)     // Catch: java.lang.Throwable -> Le02
            r2 = 19
            m11329v(r11, r2, r9)     // Catch: java.lang.Throwable -> Le02
            goto L474
        L473:
            r3 = -1
        L474:
            java.lang.String r2 = r11.m9013x()     // Catch: java.lang.Throwable -> Le02
            boolean r2 = r15.equals(r2)     // Catch: java.lang.Throwable -> Le02
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L4d9
            o7.o6 r2 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r2)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r2 = r11.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.u2 r2 = (p185k7.C3997u2) r2     // Catch: java.lang.Throwable -> Le02
            k7.y2 r2 = p249o7.C5068o6.m11387o(r2, r13)     // Catch: java.lang.Throwable -> Le02
            if (r2 != 0) goto L4cd
            if (r18 == 0) goto L4bb
            long r9 = r18.m9007r()     // Catch: java.lang.Throwable -> Le02
            long r12 = r11.m9007r()     // Catch: java.lang.Throwable -> Le02
            long r9 = r9 - r12
            long r9 = java.lang.Math.abs(r9)     // Catch: java.lang.Throwable -> Le02
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 > 0) goto L4bb
            k7.a6 r2 = r18.m8204k()     // Catch: java.lang.Throwable -> Le02
            k7.t2 r2 = (p185k7.C3984t2) r2     // Catch: java.lang.Throwable -> Le02
            boolean r4 = r1.m11338H(r11, r2)     // Catch: java.lang.Throwable -> Le02
            if (r4 == 0) goto L4bb
            r13 = r24
            r8.m8238D(r13, r2)     // Catch: java.lang.Throwable -> Le02
            r9 = r32
            r2 = 0
            r18 = 0
            goto L4c0
        L4bb:
            r13 = r24
            r2 = r11
            r9 = r19
        L4c0:
            r17 = r2
            r4 = r9
            r9 = r25
            r3 = r29
            r12 = r31
            r6 = r33
            goto L625
        L4cd:
            r9 = r25
            r3 = r29
            r12 = r31
            r4 = r32
            r6 = r33
            goto L623
        L4d9:
            r13 = r24
            java.lang.String r2 = "_vs"
            java.lang.String r6 = r11.m9013x()     // Catch: java.lang.Throwable -> Le02
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Throwable -> Le02
            if (r2 == 0) goto L53d
            o7.o6 r2 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r2)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r2 = r11.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.u2 r2 = (p185k7.C3997u2) r2     // Catch: java.lang.Throwable -> Le02
            r6 = r33
            k7.y2 r2 = p249o7.C5068o6.m11387o(r2, r6)     // Catch: java.lang.Throwable -> Le02
            if (r2 != 0) goto L539
            if (r17 == 0) goto L52b
            long r9 = r17.m9007r()     // Catch: java.lang.Throwable -> Le02
            long r26 = r11.m9007r()     // Catch: java.lang.Throwable -> Le02
            long r9 = r9 - r26
            long r9 = java.lang.Math.abs(r9)     // Catch: java.lang.Throwable -> Le02
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 > 0) goto L52b
            k7.a6 r2 = r17.m8204k()     // Catch: java.lang.Throwable -> Le02
            k7.t2 r2 = (p185k7.C3984t2) r2     // Catch: java.lang.Throwable -> Le02
            boolean r4 = r1.m11338H(r2, r11)     // Catch: java.lang.Throwable -> Le02
            if (r4 == 0) goto L523
            r4 = r32
            r8.m8238D(r4, r2)     // Catch: java.lang.Throwable -> Le02
            r2 = 0
            r17 = 0
            goto L528
        L523:
            r4 = r32
            r2 = r11
            r13 = r19
        L528:
            r18 = r2
            goto L531
        L52b:
            r4 = r32
            r18 = r11
            r13 = r19
        L531:
            r9 = r25
            r3 = r29
            r12 = r31
            goto L625
        L539:
            r4 = r32
            goto L61b
        L53d:
            r4 = r32
            r6 = r33
            o7.f r2 = r46.m11340K()     // Catch: java.lang.Throwable -> Le02
            k7.d3 r5 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r5 = r5.m8431D1()     // Catch: java.lang.Throwable -> Le02
            o7.u2<java.lang.Boolean> r9 = p249o7.C5120v2.f20095g0     // Catch: java.lang.Throwable -> Le02
            boolean r2 = r2.m11162v(r5, r9)     // Catch: java.lang.Throwable -> Le02
            if (r2 == 0) goto L61b
            java.lang.String r2 = "_ab"
            java.lang.String r5 = r11.m9013x()     // Catch: java.lang.Throwable -> Le02
            boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> Le02
            if (r2 == 0) goto L61b
            o7.o6 r2 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r2)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r2 = r11.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.u2 r2 = (p185k7.C3997u2) r2     // Catch: java.lang.Throwable -> Le02
            k7.y2 r2 = p249o7.C5068o6.m11387o(r2, r6)     // Catch: java.lang.Throwable -> Le02
            if (r2 != 0) goto L61b
            if (r17 == 0) goto L61b
            long r9 = r17.m9007r()     // Catch: java.lang.Throwable -> Le02
            long r26 = r11.m9007r()     // Catch: java.lang.Throwable -> Le02
            long r9 = r9 - r26
            long r9 = java.lang.Math.abs(r9)     // Catch: java.lang.Throwable -> Le02
            r26 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r2 > 0) goto L61b
            k7.a6 r2 = r17.m8204k()     // Catch: java.lang.Throwable -> Le02
            k7.t2 r2 = (p185k7.C3984t2) r2     // Catch: java.lang.Throwable -> Le02
            r1.m11333C(r2, r11)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r5 = r2.m9013x()     // Catch: java.lang.Throwable -> Le02
            boolean r5 = r15.equals(r5)     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.common.internal.C1101a.m3096a(r5)     // Catch: java.lang.Throwable -> Le02
            o7.o6 r5 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r5)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r5 = r2.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.u2 r5 = (p185k7.C3997u2) r5     // Catch: java.lang.Throwable -> Le02
            r9 = r25
            k7.y2 r5 = p249o7.C5068o6.m11387o(r5, r9)     // Catch: java.lang.Throwable -> Le02
            o7.o6 r10 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r10)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r10 = r2.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.u2 r10 = (p185k7.C3997u2) r10     // Catch: java.lang.Throwable -> Le02
            r12 = r31
            k7.y2 r10 = p249o7.C5068o6.m11387o(r10, r12)     // Catch: java.lang.Throwable -> Le02
            o7.o6 r14 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r14)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r14 = r2.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.u2 r14 = (p185k7.C3997u2) r14     // Catch: java.lang.Throwable -> Le02
            r3 = r29
            k7.y2 r14 = p249o7.C5068o6.m11387o(r14, r3)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r17 = ""
            if (r5 == 0) goto L5d6
            java.lang.String r5 = r5.m9149z()     // Catch: java.lang.Throwable -> Le02
            goto L5d8
        L5d6:
            r5 = r17
        L5d8:
            boolean r24 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Le02
            if (r24 != 0) goto L5e9
            r24 = r13
            o7.o6 r13 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r13)     // Catch: java.lang.Throwable -> Le02
            p249o7.C5068o6.m11385m(r11, r9, r5)     // Catch: java.lang.Throwable -> Le02
            goto L5eb
        L5e9:
            r24 = r13
        L5eb:
            if (r10 == 0) goto L5f1
            java.lang.String r17 = r10.m9149z()     // Catch: java.lang.Throwable -> Le02
        L5f1:
            r5 = r17
            boolean r10 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Le02
            if (r10 != 0) goto L601
            o7.o6 r10 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r10)     // Catch: java.lang.Throwable -> Le02
            p249o7.C5068o6.m11385m(r11, r12, r5)     // Catch: java.lang.Throwable -> Le02
        L601:
            if (r14 == 0) goto L613
            o7.o6 r5 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r5)     // Catch: java.lang.Throwable -> Le02
            long r13 = r14.m9147v()     // Catch: java.lang.Throwable -> Le02
            java.lang.Long r5 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> Le02
            p249o7.C5068o6.m11385m(r11, r3, r5)     // Catch: java.lang.Throwable -> Le02
        L613:
            r8.m8238D(r4, r2)     // Catch: java.lang.Throwable -> Le02
            r13 = r24
            r17 = 0
            goto L625
        L61b:
            r24 = r13
            r9 = r25
            r3 = r29
            r12 = r31
        L623:
            r13 = r24
        L625:
            if (r16 != 0) goto L67b
            java.lang.String r2 = r11.m9013x()     // Catch: java.lang.Throwable -> Le02
            boolean r2 = r15.equals(r2)     // Catch: java.lang.Throwable -> Le02
            if (r2 == 0) goto L67b
            int r2 = r11.m9005p()     // Catch: java.lang.Throwable -> Le02
            if (r2 != 0) goto L64c
            com.google.android.gms.measurement.internal.b r2 = r46.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r2 = r2.m3142s()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r5 = "Engagement event does not contain any parameters. appId"
            k7.d3 r6 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r6 = r6.m8431D1()     // Catch: java.lang.Throwable -> Le02
        L647:
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1111b.m3134u(r6)     // Catch: java.lang.Throwable -> Le02
            goto L670
        L64c:
            o7.o6 r2 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r2)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r2 = r11.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.u2 r2 = (p185k7.C3997u2) r2     // Catch: java.lang.Throwable -> Le02
            java.lang.Object r2 = p249o7.C5068o6.m11388p(r2, r6)     // Catch: java.lang.Throwable -> Le02
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> Le02
            if (r2 != 0) goto L674
            com.google.android.gms.measurement.internal.b r2 = r46.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r2 = r2.m3142s()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r5 = "Engagement event does not include duration. appId"
            k7.d3 r6 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r6 = r6.m8431D1()     // Catch: java.lang.Throwable -> Le02
            goto L647
        L670:
            r2.m11170d(r5, r6)     // Catch: java.lang.Throwable -> Le02
            goto L67b
        L674:
            long r5 = r2.longValue()     // Catch: java.lang.Throwable -> Le02
            long r5 = r22 + r5
            goto L67d
        L67b:
            r5 = r22
        L67d:
            java.util.List<k7.u2> r2 = r7.f19830c     // Catch: java.lang.Throwable -> Le02
            k7.d6 r10 = r11.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.u2 r10 = (p185k7.C3997u2) r10     // Catch: java.lang.Throwable -> Le02
            r14 = r28
            r2.set(r14, r10)     // Catch: java.lang.Throwable -> Le02
            int r19 = r19 + 1
            r8.m8270l0(r11)     // Catch: java.lang.Throwable -> Le02
            r11 = r13
        L690:
            int r14 = r14 + 1
            r2 = r3
            r3 = r12
            r10 = r16
            r15 = r5
            r5 = r21
            r6 = r30
            r45 = r9
            r9 = r4
            r4 = r45
            goto L5b
        L6a2:
            r6 = r5
            if (r16 == 0) goto L6fb
            r3 = r19
            r2 = 0
        L6a8:
            if (r2 >= r3) goto L6fb
            k7.u2 r4 = r8.m8266h0(r2)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r5 = r4.m9052z()     // Catch: java.lang.Throwable -> Le02
            boolean r5 = r15.equals(r5)     // Catch: java.lang.Throwable -> Le02
            if (r5 == 0) goto L6cb
            o7.o6 r5 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r5)     // Catch: java.lang.Throwable -> Le02
            k7.y2 r5 = p249o7.C5068o6.m11387o(r4, r13)     // Catch: java.lang.Throwable -> Le02
            if (r5 == 0) goto L6cb
            r8.m8293y0(r2)     // Catch: java.lang.Throwable -> Le02
            int r3 = r3 + (-1)
            int r2 = r2 + (-1)
            goto L6f8
        L6cb:
            o7.o6 r5 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r5)     // Catch: java.lang.Throwable -> Le02
            k7.y2 r4 = p249o7.C5068o6.m11387o(r4, r6)     // Catch: java.lang.Throwable -> Le02
            if (r4 == 0) goto L6f8
            boolean r5 = r4.m9141N()     // Catch: java.lang.Throwable -> Le02
            if (r5 == 0) goto L6e5
            long r4 = r4.m9147v()     // Catch: java.lang.Throwable -> Le02
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> Le02
            goto L6e6
        L6e5:
            r4 = 0
        L6e6:
            if (r4 == 0) goto L6f8
            long r9 = r4.longValue()     // Catch: java.lang.Throwable -> Le02
            r11 = 0
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 <= 0) goto L6f8
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> Le02
            long r22 = r22 + r4
        L6f8:
            r4 = 1
            int r2 = r2 + r4
            goto L6a8
        L6fb:
            r2 = r22
            r4 = 0
            r1.m11332B(r8, r2, r4)     // Catch: java.lang.Throwable -> Le02
            java.util.List r4 = r8.m8261c0()     // Catch: java.lang.Throwable -> Le02
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Le02
        L709:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r6 = "_se"
            if (r5 == 0) goto L72f
            java.lang.String r5 = "_s"
            java.lang.Object r9 = r4.next()     // Catch: java.lang.Throwable -> Le02
            k7.u2 r9 = (p185k7.C3997u2) r9     // Catch: java.lang.Throwable -> Le02
            java.lang.String r9 = r9.m9052z()     // Catch: java.lang.Throwable -> Le02
            boolean r5 = r5.equals(r9)     // Catch: java.lang.Throwable -> Le02
            if (r5 == 0) goto L709
            o7.j r4 = r1.f19862c     // Catch: java.lang.Throwable -> Le02
            m11327I(r4)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r5 = r8.m8258Z()     // Catch: java.lang.Throwable -> Le02
            r4.m11272n(r5, r6)     // Catch: java.lang.Throwable -> Le02
        L72f:
            java.lang.String r4 = "_sid"
            int r4 = p249o7.C5068o6.m11394x(r8, r4)     // Catch: java.lang.Throwable -> Le02
            if (r4 < 0) goto L73c
            r4 = 1
            r1.m11332B(r8, r2, r4)     // Catch: java.lang.Throwable -> Le02
            goto L75c
        L73c:
            int r2 = p249o7.C5068o6.m11394x(r8, r6)     // Catch: java.lang.Throwable -> Le02
            if (r2 < 0) goto L75c
            r8.m8295z0(r2)     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.b r2 = r46.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r2 = r2.m3140q()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            k7.d3 r4 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r4 = r4.m8431D1()     // Catch: java.lang.Throwable -> Le02
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r4)     // Catch: java.lang.Throwable -> Le02
            r2.m11170d(r3, r4)     // Catch: java.lang.Throwable -> Le02
        L75c:
            o7.o6 r2 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r2)     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.d r3 = r2.f5736a     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r3 = r3.m3141r()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r4 = "Checking account type status for ad personalization signals"
            r3.m11169c(r4)     // Catch: java.lang.Throwable -> Le02
            o7.m6 r3 = r2.f19756b     // Catch: java.lang.Throwable -> Le02
            o7.a4 r3 = r3.f19860a     // Catch: java.lang.Throwable -> Le02
            m11327I(r3)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r4 = r8.m8258Z()     // Catch: java.lang.Throwable -> Le02
            boolean r3 = r3.m11092o(r4)     // Catch: java.lang.Throwable -> Le02
            if (r3 == 0) goto L7f3
            o7.m6 r3 = r2.f19756b     // Catch: java.lang.Throwable -> Le02
            o7.j r3 = r3.f19862c     // Catch: java.lang.Throwable -> Le02
            m11327I(r3)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r4 = r8.m8258Z()     // Catch: java.lang.Throwable -> Le02
            o7.h4 r3 = r3.m11255F(r4)     // Catch: java.lang.Throwable -> Le02
            if (r3 == 0) goto L7f3
            boolean r3 = r3.m11245z()     // Catch: java.lang.Throwable -> Le02
            if (r3 == 0) goto L7f3
            com.google.android.gms.measurement.internal.d r3 = r2.f5736a     // Catch: java.lang.Throwable -> Le02
            o7.l r3 = r3.m3171p()     // Catch: java.lang.Throwable -> Le02
            boolean r3 = r3.m11293s()     // Catch: java.lang.Throwable -> Le02
            if (r3 == 0) goto L7f3
            com.google.android.gms.measurement.internal.d r3 = r2.f5736a     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r3 = r3.m3139p()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r4 = "Turning off ad personalization due to account type"
            r3.m11169c(r4)     // Catch: java.lang.Throwable -> Le02
            k7.l3 r3 = p185k7.C3894m3.m8804v()     // Catch: java.lang.Throwable -> Le02
            r4 = r21
            r3.m8792q(r4)     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: java.lang.Throwable -> Le02
            o7.l r2 = r2.m3171p()     // Catch: java.lang.Throwable -> Le02
            long r5 = r2.m11290p()     // Catch: java.lang.Throwable -> Le02
            r3.m8793r(r5)     // Catch: java.lang.Throwable -> Le02
            r5 = 1
            r3.m8791p(r5)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r2 = r3.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.m3 r2 = (p185k7.C3894m3) r2     // Catch: java.lang.Throwable -> Le02
            r3 = 0
        L7d5:
            int r5 = r8.m8263e0()     // Catch: java.lang.Throwable -> Le02
            if (r3 >= r5) goto L7f0
            k7.m3 r5 = r8.m8257Y(r3)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r5 = r5.m8814x()     // Catch: java.lang.Throwable -> Le02
            boolean r5 = r4.equals(r5)     // Catch: java.lang.Throwable -> Le02
            if (r5 == 0) goto L7ed
            r8.m8255W(r3, r2)     // Catch: java.lang.Throwable -> Le02
            goto L7f3
        L7ed:
            int r3 = r3 + 1
            goto L7d5
        L7f0:
            r8.m8272n0(r2)     // Catch: java.lang.Throwable -> Le02
        L7f3:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8.m8253U(r2)     // Catch: java.lang.Throwable -> Le02
            r2 = -9223372036854775808
            r8.m8237C(r2)     // Catch: java.lang.Throwable -> Le02
            r2 = 0
        L801:
            int r3 = r8.m8249P()     // Catch: java.lang.Throwable -> Le02
            if (r2 >= r3) goto L834
            k7.u2 r3 = r8.m8266h0(r2)     // Catch: java.lang.Throwable -> Le02
            long r4 = r3.m9050v()     // Catch: java.lang.Throwable -> Le02
            long r9 = r8.m8265g0()     // Catch: java.lang.Throwable -> Le02
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 >= 0) goto L81e
            long r4 = r3.m9050v()     // Catch: java.lang.Throwable -> Le02
            r8.m8253U(r4)     // Catch: java.lang.Throwable -> Le02
        L81e:
            long r4 = r3.m9050v()     // Catch: java.lang.Throwable -> Le02
            long r9 = r8.m8264f0()     // Catch: java.lang.Throwable -> Le02
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L831
            long r3 = r3.m9050v()     // Catch: java.lang.Throwable -> Le02
            r8.m8237C(r3)     // Catch: java.lang.Throwable -> Le02
        L831:
            int r2 = r2 + 1
            goto L801
        L834:
            r8.m8291x0()     // Catch: java.lang.Throwable -> Le02
            r8.m8275p0()     // Catch: java.lang.Throwable -> Le02
            o7.a7 r9 = r1.f19865f     // Catch: java.lang.Throwable -> Le02
            m11327I(r9)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r10 = r8.m8258Z()     // Catch: java.lang.Throwable -> Le02
            java.util.List r11 = r8.m8261c0()     // Catch: java.lang.Throwable -> Le02
            java.util.List r12 = r8.m8262d0()     // Catch: java.lang.Throwable -> Le02
            long r2 = r8.m8265g0()     // Catch: java.lang.Throwable -> Le02
            java.lang.Long r13 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Le02
            long r2 = r8.m8264f0()     // Catch: java.lang.Throwable -> Le02
            java.lang.Long r14 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Le02
            java.util.List r2 = r9.m11103m(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> Le02
            r8.m8267i0(r2)     // Catch: java.lang.Throwable -> Le02
            o7.f r2 = r46.m11340K()     // Catch: java.lang.Throwable -> Le02
            k7.d3 r3 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r3 = r3.m8431D1()     // Catch: java.lang.Throwable -> Le02
            boolean r2 = r2.m11165y(r3)     // Catch: java.lang.Throwable -> Le02
            if (r2 == 0) goto Lb9d
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le02
            r2.<init>()     // Catch: java.lang.Throwable -> Le02
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le02
            r3.<init>()     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.f r4 = r46.m11345Q()     // Catch: java.lang.Throwable -> Le02
            java.security.SecureRandom r4 = r4.m3235t()     // Catch: java.lang.Throwable -> Le02
            r5 = 0
        L885:
            int r6 = r8.m8249P()     // Catch: java.lang.Throwable -> Le02
            if (r5 >= r6) goto Lb67
            k7.u2 r6 = r8.m8266h0(r5)     // Catch: java.lang.Throwable -> Le02
            k7.a6 r6 = r6.m8501o()     // Catch: java.lang.Throwable -> Le02
            k7.t2 r6 = (p185k7.C3984t2) r6     // Catch: java.lang.Throwable -> Le02
            java.lang.String r9 = r6.m9013x()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r10 = "_sr"
            java.lang.String r11 = "_efs"
            if (r9 == 0) goto L918
            o7.o6 r9 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r9)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r9 = r6.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.u2 r9 = (p185k7.C3997u2) r9     // Catch: java.lang.Throwable -> Le02
            java.lang.String r12 = "_en"
            java.lang.Object r9 = p249o7.C5068o6.m11388p(r9, r12)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> Le02
            java.lang.Object r12 = r2.get(r9)     // Catch: java.lang.Throwable -> Le02
            o7.n r12 = (p249o7.C5053n) r12     // Catch: java.lang.Throwable -> Le02
            if (r12 != 0) goto L8d7
            o7.j r12 = r1.f19862c     // Catch: java.lang.Throwable -> Le02
            m11327I(r12)     // Catch: java.lang.Throwable -> Le02
            k7.d3 r13 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r13 = r13.m8431D1()     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.common.internal.C1101a.m3103h(r9)     // Catch: java.lang.Throwable -> Le02
            o7.n r12 = r12.m11259J(r13, r9)     // Catch: java.lang.Throwable -> Le02
            if (r12 == 0) goto L8d7
            r2.put(r9, r12)     // Catch: java.lang.Throwable -> Le02
        L8d7:
            if (r12 == 0) goto La7d
            java.lang.Long r9 = r12.f19894i     // Catch: java.lang.Throwable -> Le02
            if (r9 != 0) goto La7d
            java.lang.Long r9 = r12.f19895j     // Catch: java.lang.Throwable -> Le02
            if (r9 == 0) goto L8f5
            long r13 = r9.longValue()     // Catch: java.lang.Throwable -> Le02
            r15 = 1
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 <= 0) goto L8f5
            o7.o6 r9 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r9)     // Catch: java.lang.Throwable -> Le02
            java.lang.Long r9 = r12.f19895j     // Catch: java.lang.Throwable -> Le02
            p249o7.C5068o6.m11385m(r6, r10, r9)     // Catch: java.lang.Throwable -> Le02
        L8f5:
            java.lang.Boolean r9 = r12.f19896k     // Catch: java.lang.Throwable -> Le02
            if (r9 == 0) goto L90d
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> Le02
            if (r9 == 0) goto L90d
            o7.o6 r9 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r9)     // Catch: java.lang.Throwable -> Le02
            r9 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> Le02
            p249o7.C5068o6.m11385m(r6, r11, r12)     // Catch: java.lang.Throwable -> Le02
        L90d:
            k7.d6 r9 = r6.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.u2 r9 = (p185k7.C3997u2) r9     // Catch: java.lang.Throwable -> Le02
        L913:
            r3.add(r9)     // Catch: java.lang.Throwable -> Le02
            goto La7d
        L918:
            o7.a4 r9 = r1.f19860a     // Catch: java.lang.Throwable -> Le02
            m11327I(r9)     // Catch: java.lang.Throwable -> Le02
            k7.d3 r12 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r12 = r12.m8431D1()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r13 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r13 = r9.mo11088a(r12, r13)     // Catch: java.lang.Throwable -> Le02
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> Le02
            if (r14 != 0) goto L949
            long r12 = java.lang.Long.parseLong(r13)     // Catch: java.lang.NumberFormatException -> L934 java.lang.Throwable -> Le02
            goto L94b
        L934:
            r0 = move-exception
            r13 = r0
            com.google.android.gms.measurement.internal.d r9 = r9.f5736a     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.b r9 = r9.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r9 = r9.m3142s()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r14 = "Unable to parse timezone offset. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C1111b.m3134u(r12)     // Catch: java.lang.Throwable -> Le02
            r9.m11171e(r14, r12, r13)     // Catch: java.lang.Throwable -> Le02
        L949:
            r12 = 0
        L94b:
            com.google.android.gms.measurement.internal.f r9 = r46.m11345Q()     // Catch: java.lang.Throwable -> Le02
            long r14 = r6.m9007r()     // Catch: java.lang.Throwable -> Le02
            long r14 = r9.m3229p0(r14, r12)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r9 = r6.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.u2 r9 = (p185k7.C3997u2) r9     // Catch: java.lang.Throwable -> Le02
            r49 = r11
            r16 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch: java.lang.Throwable -> Le02
            r16 = r12
            java.lang.String r12 = "_dbg"
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> Le02
            if (r13 != 0) goto L9a3
            java.util.List r9 = r9.m9042A()     // Catch: java.lang.Throwable -> Le02
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> Le02
        L977:
            boolean r13 = r9.hasNext()     // Catch: java.lang.Throwable -> Le02
            if (r13 == 0) goto L9a3
            java.lang.Object r13 = r9.next()     // Catch: java.lang.Throwable -> Le02
            k7.y2 r13 = (p185k7.C4049y2) r13     // Catch: java.lang.Throwable -> Le02
            r18 = r9
            java.lang.String r9 = r13.m9148y()     // Catch: java.lang.Throwable -> Le02
            boolean r9 = r12.equals(r9)     // Catch: java.lang.Throwable -> Le02
            if (r9 == 0) goto L9a0
            long r12 = r13.m9147v()     // Catch: java.lang.Throwable -> Le02
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> Le02
            boolean r9 = r11.equals(r9)     // Catch: java.lang.Throwable -> Le02
            if (r9 != 0) goto L99e
            goto L9a3
        L99e:
            r9 = 1
            goto L9b6
        L9a0:
            r9 = r18
            goto L977
        L9a3:
            o7.a4 r9 = r1.f19860a     // Catch: java.lang.Throwable -> Le02
            m11327I(r9)     // Catch: java.lang.Throwable -> Le02
            k7.d3 r11 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r11 = r11.m8431D1()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r12 = r6.m9013x()     // Catch: java.lang.Throwable -> Le02
            int r9 = r9.m11090m(r11, r12)     // Catch: java.lang.Throwable -> Le02
        L9b6:
            if (r9 > 0) goto L9d5
            com.google.android.gms.measurement.internal.b r10 = r46.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r10 = r10.m3142s()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r6.m9013x()     // Catch: java.lang.Throwable -> Le02
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Le02
            r10.m11171e(r11, r12, r9)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r9 = r6.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.u2 r9 = (p185k7.C3997u2) r9     // Catch: java.lang.Throwable -> Le02
            goto L913
        L9d5:
            java.lang.String r11 = r6.m9013x()     // Catch: java.lang.Throwable -> Le02
            java.lang.Object r11 = r2.get(r11)     // Catch: java.lang.Throwable -> Le02
            o7.n r11 = (p249o7.C5053n) r11     // Catch: java.lang.Throwable -> Le02
            if (r11 != 0) goto La35
            o7.j r11 = r1.f19862c     // Catch: java.lang.Throwable -> Le02
            m11327I(r11)     // Catch: java.lang.Throwable -> Le02
            k7.d3 r12 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r12 = r12.m8431D1()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r13 = r6.m9013x()     // Catch: java.lang.Throwable -> Le02
            o7.n r11 = r11.m11259J(r12, r13)     // Catch: java.lang.Throwable -> Le02
            if (r11 != 0) goto La35
            com.google.android.gms.measurement.internal.b r11 = r46.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r11 = r11.m3142s()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            k7.d3 r13 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r13 = r13.m8431D1()     // Catch: java.lang.Throwable -> Le02
            r18 = r14
            java.lang.String r14 = r6.m9013x()     // Catch: java.lang.Throwable -> Le02
            r11.m11171e(r12, r13, r14)     // Catch: java.lang.Throwable -> Le02
            o7.n r11 = new o7.n     // Catch: java.lang.Throwable -> Le02
            k7.d3 r12 = r7.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r29 = r12.m8431D1()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r30 = r6.m9013x()     // Catch: java.lang.Throwable -> Le02
            r31 = 1
            r33 = 1
            r35 = 1
            long r37 = r6.m9007r()     // Catch: java.lang.Throwable -> Le02
            r39 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r28 = r11
            r28.<init>(r29, r30, r31, r33, r35, r37, r39, r41, r42, r43, r44)     // Catch: java.lang.Throwable -> Le02
            goto La37
        La35:
            r18 = r14
        La37:
            o7.o6 r12 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r12)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r12 = r6.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.u2 r12 = (p185k7.C3997u2) r12     // Catch: java.lang.Throwable -> Le02
            java.lang.String r13 = "_eid"
            java.lang.Object r12 = p249o7.C5068o6.m11388p(r12, r13)     // Catch: java.lang.Throwable -> Le02
            java.lang.Long r12 = (java.lang.Long) r12     // Catch: java.lang.Throwable -> Le02
            if (r12 == 0) goto La4e
            r13 = 1
            goto La4f
        La4e:
            r13 = 0
        La4f:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch: java.lang.Throwable -> Le02
            r14 = 1
            if (r9 != r14) goto La89
            k7.d6 r9 = r6.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.u2 r9 = (p185k7.C3997u2) r9     // Catch: java.lang.Throwable -> Le02
            r3.add(r9)     // Catch: java.lang.Throwable -> Le02
            boolean r9 = r13.booleanValue()     // Catch: java.lang.Throwable -> Le02
            if (r9 == 0) goto La7d
            java.lang.Long r9 = r11.f19894i     // Catch: java.lang.Throwable -> Le02
            if (r9 != 0) goto La71
            java.lang.Long r9 = r11.f19895j     // Catch: java.lang.Throwable -> Le02
            if (r9 != 0) goto La71
            java.lang.Boolean r9 = r11.f19896k     // Catch: java.lang.Throwable -> Le02
            if (r9 == 0) goto La7d
        La71:
            r9 = 0
            o7.n r10 = r11.m11366a(r9, r9, r9)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r9 = r6.m9013x()     // Catch: java.lang.Throwable -> Le02
            r2.put(r9, r10)     // Catch: java.lang.Throwable -> Le02
        La7d:
            r8.m8238D(r5, r6)     // Catch: java.lang.Throwable -> Le02
            r18 = r4
            r19 = r7
            r4 = r8
            r7 = 1
            goto Lb5e
        La89:
            int r14 = r4.nextInt(r9)     // Catch: java.lang.Throwable -> Le02
            if (r14 != 0) goto Laca
            o7.o6 r12 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r12)     // Catch: java.lang.Throwable -> Le02
            long r14 = (long) r9     // Catch: java.lang.Throwable -> Le02
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> Le02
            p249o7.C5068o6.m11385m(r6, r10, r9)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r10 = r6.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.u2 r10 = (p185k7.C3997u2) r10     // Catch: java.lang.Throwable -> Le02
            r3.add(r10)     // Catch: java.lang.Throwable -> Le02
            boolean r10 = r13.booleanValue()     // Catch: java.lang.Throwable -> Le02
            if (r10 == 0) goto Lab0
            r10 = 0
            o7.n r11 = r11.m11366a(r10, r9, r10)     // Catch: java.lang.Throwable -> Le02
        Lab0:
            java.lang.String r9 = r6.m9013x()     // Catch: java.lang.Throwable -> Le02
            long r12 = r6.m9007r()     // Catch: java.lang.Throwable -> Le02
            r14 = r18
            o7.n r10 = r11.m11367b(r12, r14)     // Catch: java.lang.Throwable -> Le02
            r2.put(r9, r10)     // Catch: java.lang.Throwable -> Le02
            r18 = r4
            r19 = r7
            r4 = r8
            r7 = 1
            goto Lb5b
        Laca:
            r14 = r18
            r18 = r4
            java.lang.Long r4 = r11.f19893h     // Catch: java.lang.Throwable -> Le02
            if (r4 == 0) goto Ladf
            long r16 = r4.longValue()     // Catch: java.lang.Throwable -> Le02
            r19 = r7
            r21 = r8
            r23 = r11
            r22 = r12
            goto Laf5
        Ladf:
            com.google.android.gms.measurement.internal.f r4 = r46.m11345Q()     // Catch: java.lang.Throwable -> Le02
            r19 = r7
            r21 = r8
            long r7 = r6.m9006q()     // Catch: java.lang.Throwable -> Le02
            r23 = r11
            r22 = r12
            r11 = r16
            long r16 = r4.m3229p0(r7, r11)     // Catch: java.lang.Throwable -> Le02
        Laf5:
            int r4 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r4 == 0) goto Lb41
            o7.o6 r4 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r4)     // Catch: java.lang.Throwable -> Le02
            r7 = 1
            java.lang.Long r4 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Le02
            r11 = r49
            p249o7.C5068o6.m11385m(r6, r11, r4)     // Catch: java.lang.Throwable -> Le02
            o7.o6 r4 = r1.f19866g     // Catch: java.lang.Throwable -> Le02
            m11327I(r4)     // Catch: java.lang.Throwable -> Le02
            long r11 = (long) r9     // Catch: java.lang.Throwable -> Le02
            java.lang.Long r4 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> Le02
            p249o7.C5068o6.m11385m(r6, r10, r4)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r9 = r6.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.u2 r9 = (p185k7.C3997u2) r9     // Catch: java.lang.Throwable -> Le02
            r3.add(r9)     // Catch: java.lang.Throwable -> Le02
            boolean r9 = r13.booleanValue()     // Catch: java.lang.Throwable -> Le02
            if (r9 == 0) goto Lb2f
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Le02
            r11 = r23
            r10 = 0
            o7.n r11 = r11.m11366a(r10, r4, r9)     // Catch: java.lang.Throwable -> Le02
            goto Lb31
        Lb2f:
            r11 = r23
        Lb31:
            java.lang.String r4 = r6.m9013x()     // Catch: java.lang.Throwable -> Le02
            long r9 = r6.m9007r()     // Catch: java.lang.Throwable -> Le02
            o7.n r9 = r11.m11367b(r9, r14)     // Catch: java.lang.Throwable -> Le02
            r2.put(r4, r9)     // Catch: java.lang.Throwable -> Le02
            goto Lb59
        Lb41:
            r11 = r23
            r7 = 1
            boolean r4 = r13.booleanValue()     // Catch: java.lang.Throwable -> Le02
            if (r4 == 0) goto Lb59
            java.lang.String r4 = r6.m9013x()     // Catch: java.lang.Throwable -> Le02
            r12 = r22
            r9 = 0
            o7.n r10 = r11.m11366a(r12, r9, r9)     // Catch: java.lang.Throwable -> Le02
            r2.put(r4, r10)     // Catch: java.lang.Throwable -> Le02
        Lb59:
            r4 = r21
        Lb5b:
            r4.m8238D(r5, r6)     // Catch: java.lang.Throwable -> Le02
        Lb5e:
            int r5 = r5 + 1
            r8 = r4
            r4 = r18
            r7 = r19
            goto L885
        Lb67:
            r19 = r7
            r4 = r8
            int r5 = r3.size()     // Catch: java.lang.Throwable -> Le02
            int r6 = r4.m8249P()     // Catch: java.lang.Throwable -> Le02
            if (r5 >= r6) goto Lb7a
            r4.m8279r0()     // Catch: java.lang.Throwable -> Le02
            r4.m8268j0(r3)     // Catch: java.lang.Throwable -> Le02
        Lb7a:
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> Le02
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Le02
        Lb82:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Le02
            if (r3 == 0) goto Lba0
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Le02
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Le02
            o7.j r5 = r1.f19862c     // Catch: java.lang.Throwable -> Le02
            m11327I(r5)     // Catch: java.lang.Throwable -> Le02
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Le02
            o7.n r3 = (p249o7.C5053n) r3     // Catch: java.lang.Throwable -> Le02
            r5.m11275q(r3)     // Catch: java.lang.Throwable -> Le02
            goto Lb82
        Lb9d:
            r19 = r7
            r4 = r8
        Lba0:
            r2 = r19
            k7.d3 r3 = r2.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r3 = r3.m8431D1()     // Catch: java.lang.Throwable -> Le02
            o7.j r5 = r1.f19862c     // Catch: java.lang.Throwable -> Le02
            m11327I(r5)     // Catch: java.lang.Throwable -> Le02
            o7.h4 r5 = r5.m11255F(r3)     // Catch: java.lang.Throwable -> Le02
            if (r5 != 0) goto Lbcb
            com.google.android.gms.measurement.internal.b r5 = r46.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r5 = r5.m3140q()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            k7.d3 r7 = r2.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r7 = r7.m8431D1()     // Catch: java.lang.Throwable -> Le02
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1111b.m3134u(r7)     // Catch: java.lang.Throwable -> Le02
            r5.m11170d(r6, r7)     // Catch: java.lang.Throwable -> Le02
            goto Lc27
        Lbcb:
            int r6 = r4.m8249P()     // Catch: java.lang.Throwable -> Le02
            if (r6 <= 0) goto Lc27
            long r6 = r5.m11208H()     // Catch: java.lang.Throwable -> Le02
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto Lbdf
            r4.m8247N(r6)     // Catch: java.lang.Throwable -> Le02
            goto Lbe2
        Lbdf:
            r4.m8285u0()     // Catch: java.lang.Throwable -> Le02
        Lbe2:
            long r8 = r5.m11210J()     // Catch: java.lang.Throwable -> Le02
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto Lbed
            goto Lbee
        Lbed:
            r6 = r8
        Lbee:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto Lbf6
            r4.m8248O(r6)     // Catch: java.lang.Throwable -> Le02
            goto Lbf9
        Lbf6:
            r4.m8287v0()     // Catch: java.lang.Throwable -> Le02
        Lbf9:
            r5.m11221b()     // Catch: java.lang.Throwable -> Le02
            long r6 = r5.m11209I()     // Catch: java.lang.Throwable -> Le02
            int r7 = (int) r6     // Catch: java.lang.Throwable -> Le02
            r4.m8284u(r7)     // Catch: java.lang.Throwable -> Le02
            long r6 = r4.m8265g0()     // Catch: java.lang.Throwable -> Le02
            r5.m11241v(r6)     // Catch: java.lang.Throwable -> Le02
            long r6 = r4.m8264f0()     // Catch: java.lang.Throwable -> Le02
            r5.m11239t(r6)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r6 = r5.m11212L()     // Catch: java.lang.Throwable -> Le02
            if (r6 == 0) goto Lc1c
            r4.m8243I(r6)     // Catch: java.lang.Throwable -> Le02
            goto Lc1f
        Lc1c:
            r4.m8281s0()     // Catch: java.lang.Throwable -> Le02
        Lc1f:
            o7.j r6 = r1.f19862c     // Catch: java.lang.Throwable -> Le02
            m11327I(r6)     // Catch: java.lang.Throwable -> Le02
            r6.m11274p(r5)     // Catch: java.lang.Throwable -> Le02
        Lc27:
            int r5 = r4.m8249P()     // Catch: java.lang.Throwable -> Le02
            if (r5 <= 0) goto Lda7
            com.google.android.gms.measurement.internal.d r5 = r1.f19871l     // Catch: java.lang.Throwable -> Le02
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Throwable -> Le02
            o7.a4 r5 = r1.f19860a     // Catch: java.lang.Throwable -> Le02
            m11327I(r5)     // Catch: java.lang.Throwable -> Le02
            k7.d3 r6 = r2.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r6 = r6.m8431D1()     // Catch: java.lang.Throwable -> Le02
            k7.j2 r5 = r5.m11091n(r6)     // Catch: java.lang.Throwable -> Le02
            r6 = -1
            if (r5 == 0) goto Lc54
            boolean r8 = r5.m8719H()     // Catch: java.lang.Throwable -> Le02
            if (r8 != 0) goto Lc4c
            goto Lc54
        Lc4c:
            long r8 = r5.m8722u()     // Catch: java.lang.Throwable -> Le02
            r4.m8288w(r8)     // Catch: java.lang.Throwable -> Le02
            goto Lc7b
        Lc54:
            k7.d3 r5 = r2.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r5 = r5.m8486z()     // Catch: java.lang.Throwable -> Le02
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Le02
            if (r5 == 0) goto Lc64
            r4.m8288w(r6)     // Catch: java.lang.Throwable -> Le02
            goto Lc7b
        Lc64:
            com.google.android.gms.measurement.internal.b r5 = r46.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r5 = r5.m3142s()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r8 = "Did not find measurement config or missing version info. appId"
            k7.d3 r9 = r2.f19828a     // Catch: java.lang.Throwable -> Le02
            java.lang.String r9 = r9.m8431D1()     // Catch: java.lang.Throwable -> Le02
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1111b.m3134u(r9)     // Catch: java.lang.Throwable -> Le02
            r5.m11170d(r8, r9)     // Catch: java.lang.Throwable -> Le02
        Lc7b:
            o7.j r5 = r1.f19862c     // Catch: java.lang.Throwable -> Le02
            m11327I(r5)     // Catch: java.lang.Throwable -> Le02
            k7.d6 r4 = r4.m8201f()     // Catch: java.lang.Throwable -> Le02
            k7.d3 r4 = (p185k7.C3770d3) r4     // Catch: java.lang.Throwable -> Le02
            r5.mo3183i()     // Catch: java.lang.Throwable -> Le02
            r5.m11247j()     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.common.internal.C1101a.m3103h(r4)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r8 = r4.m8431D1()     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.common.internal.C1101a.m3100e(r8)     // Catch: java.lang.Throwable -> Le02
            boolean r8 = r4.m8443W0()     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.common.internal.C1101a.m3105j(r8)     // Catch: java.lang.Throwable -> Le02
            r5.m11271m()     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.d r8 = r5.f5736a     // Catch: java.lang.Throwable -> Le02
            u6.c r8 = r8.mo3163e()     // Catch: java.lang.Throwable -> Le02
            u6.d r8 = (p353u6.C6341d) r8     // Catch: java.lang.Throwable -> Le02
            long r8 = r8.m12990a()     // Catch: java.lang.Throwable -> Le02
            long r10 = r4.m8471r1()     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.d r12 = r5.f5736a     // Catch: java.lang.Throwable -> Le02
            java.util.Objects.requireNonNull(r12)     // Catch: java.lang.Throwable -> Le02
            long r12 = p249o7.C4989f.m11150j()     // Catch: java.lang.Throwable -> Le02
            long r12 = r8 - r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto Lcd1
            long r10 = r4.m8471r1()     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.d r12 = r5.f5736a     // Catch: java.lang.Throwable -> Le02
            java.util.Objects.requireNonNull(r12)     // Catch: java.lang.Throwable -> Le02
            long r12 = p249o7.C4989f.m11150j()     // Catch: java.lang.Throwable -> Le02
            long r12 = r12 + r8
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto Lcf4
        Lcd1:
            com.google.android.gms.measurement.internal.d r10 = r5.f5736a     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.b r10 = r10.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r10 = r10.m3142s()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r11 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r12 = r4.m8431D1()     // Catch: java.lang.Throwable -> Le02
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C1111b.m3134u(r12)     // Catch: java.lang.Throwable -> Le02
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> Le02
            long r13 = r4.m8471r1()     // Catch: java.lang.Throwable -> Le02
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> Le02
            r10.m11172f(r11, r12, r8, r9)     // Catch: java.lang.Throwable -> Le02
        Lcf4:
            byte[] r8 = r4.m9160i()     // Catch: java.lang.Throwable -> Le02
            o7.m6 r9 = r5.f19756b     // Catch: java.io.IOException -> Ld91 java.lang.Throwable -> Le02
            o7.o6 r9 = r9.f19866g     // Catch: java.io.IOException -> Ld91 java.lang.Throwable -> Le02
            m11327I(r9)     // Catch: java.io.IOException -> Ld91 java.lang.Throwable -> Le02
            byte[] r8 = r9.m11405P(r8)     // Catch: java.io.IOException -> Ld91 java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.d r9 = r5.f5736a     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.b r9 = r9.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r9 = r9.m3141r()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r10 = "Saving bundle, size"
            int r11 = r8.length     // Catch: java.lang.Throwable -> Le02
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> Le02
            r9.m11170d(r10, r11)     // Catch: java.lang.Throwable -> Le02
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch: java.lang.Throwable -> Le02
            r9.<init>()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r10 = "app_id"
            java.lang.String r11 = r4.m8431D1()     // Catch: java.lang.Throwable -> Le02
            r9.put(r10, r11)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r10 = "bundle_end_timestamp"
            long r11 = r4.m8471r1()     // Catch: java.lang.Throwable -> Le02
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> Le02
            r9.put(r10, r11)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r10 = "data"
            r9.put(r10, r8)     // Catch: java.lang.Throwable -> Le02
            java.lang.String r8 = "has_realtime"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r20)     // Catch: java.lang.Throwable -> Le02
            r9.put(r8, r10)     // Catch: java.lang.Throwable -> Le02
            boolean r8 = r4.m8449c1()     // Catch: java.lang.Throwable -> Le02
            if (r8 == 0) goto Ld53
            java.lang.String r8 = "retry_count"
            int r10 = r4.m8457k1()     // Catch: java.lang.Throwable -> Le02
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> Le02
            r9.put(r8, r10)     // Catch: java.lang.Throwable -> Le02
        Ld53:
            android.database.sqlite.SQLiteDatabase r8 = r5.m11253D()     // Catch: android.database.sqlite.SQLiteException -> Ld7a java.lang.Throwable -> Le02
            java.lang.String r10 = "queue"
            r11 = 0
            long r8 = r8.insert(r10, r11, r9)     // Catch: android.database.sqlite.SQLiteException -> Ld7a java.lang.Throwable -> Le02
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto Lda7
            com.google.android.gms.measurement.internal.d r6 = r5.f5736a     // Catch: android.database.sqlite.SQLiteException -> Ld7a java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> Ld7a java.lang.Throwable -> Le02
            o7.f3 r6 = r6.m3140q()     // Catch: android.database.sqlite.SQLiteException -> Ld7a java.lang.Throwable -> Le02
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r4.m8431D1()     // Catch: android.database.sqlite.SQLiteException -> Ld7a java.lang.Throwable -> Le02
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1111b.m3134u(r8)     // Catch: android.database.sqlite.SQLiteException -> Ld7a java.lang.Throwable -> Le02
            r6.m11170d(r7, r8)     // Catch: android.database.sqlite.SQLiteException -> Ld7a java.lang.Throwable -> Le02
            goto Lda7
        Ld7a:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r5 = r5.m3140q()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r7 = "Error storing bundle. appId"
            java.lang.String r4 = r4.m8431D1()     // Catch: java.lang.Throwable -> Le02
        Ld8c:
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r4)     // Catch: java.lang.Throwable -> Le02
            goto Lda4
        Ld91:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r5 = r5.m3140q()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r4 = r4.m8431D1()     // Catch: java.lang.Throwable -> Le02
            goto Ld8c
        Lda4:
            r5.m11171e(r7, r4, r6)     // Catch: java.lang.Throwable -> Le02
        Lda7:
            o7.j r4 = r1.f19862c     // Catch: java.lang.Throwable -> Le02
            m11327I(r4)     // Catch: java.lang.Throwable -> Le02
            java.util.List<java.lang.Long> r2 = r2.f19829b     // Catch: java.lang.Throwable -> Le02
            r4.m11268S(r2)     // Catch: java.lang.Throwable -> Le02
            o7.j r2 = r1.f19862c     // Catch: java.lang.Throwable -> Le02
            m11327I(r2)     // Catch: java.lang.Throwable -> Le02
            android.database.sqlite.SQLiteDatabase r4 = r2.m11253D()     // Catch: java.lang.Throwable -> Le02
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: android.database.sqlite.SQLiteException -> Ldc9 java.lang.Throwable -> Le02
            r6 = 0
            r5[r6] = r3     // Catch: android.database.sqlite.SQLiteException -> Ldc9 java.lang.Throwable -> Le02
            r6 = 1
            r5[r6] = r3     // Catch: android.database.sqlite.SQLiteException -> Ldc9 java.lang.Throwable -> Le02
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r4.execSQL(r6, r5)     // Catch: android.database.sqlite.SQLiteException -> Ldc9 java.lang.Throwable -> Le02
            goto Ldde
        Ldc9:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: java.lang.Throwable -> Le02
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> Le02
            o7.f3 r2 = r2.m3140q()     // Catch: java.lang.Throwable -> Le02
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1111b.m3134u(r3)     // Catch: java.lang.Throwable -> Le02
            r2.m11171e(r5, r3, r4)     // Catch: java.lang.Throwable -> Le02
        Ldde:
            o7.j r2 = r1.f19862c     // Catch: java.lang.Throwable -> Le02
            m11327I(r2)     // Catch: java.lang.Throwable -> Le02
            r2.m11273o()     // Catch: java.lang.Throwable -> Le02
            o7.j r2 = r1.f19862c
            m11327I(r2)
            r2.m11269T()
            r2 = 1
            return r2
        Ldf0:
            o7.j r2 = r1.f19862c     // Catch: java.lang.Throwable -> Le02
            m11327I(r2)     // Catch: java.lang.Throwable -> Le02
            r2.m11273o()     // Catch: java.lang.Throwable -> Le02
            o7.j r2 = r1.f19862c
            m11327I(r2)
            r2.m11269T()
            r2 = 0
            return r2
        Le02:
            r0 = move-exception
            r2 = r0
            o7.j r3 = r1.f19862c
            m11327I(r3)
            r3.m11269T()
            throw r2
    }

    /* renamed from: G */
    public final boolean m11337G() {
            r7 = this;
            o7.f4 r0 = r7.mo3160b()
            r0.mo3183i()
            r7.m11348g()
            o7.j r0 = r7.f19862c
            m11327I(r0)
            r1 = 0
            java.lang.String r2 = "select count(1) > 0 from raw_events"
            long r0 = r0.m11283z(r2, r1)
            r2 = 0
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 != 0) goto L34
            o7.j r0 = r7.f19862c
            m11327I(r0)
            java.lang.String r0 = r0.m11262M()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L33
            goto L34
        L33:
            return r5
        L34:
            return r4
    }

    /* renamed from: H */
    public final boolean m11338H(p185k7.C3984t2 r5, p185k7.C3984t2 r6) {
            r4 = this;
            java.lang.String r0 = r5.m9013x()
            java.lang.String r1 = "_e"
            boolean r0 = r1.equals(r0)
            com.google.android.gms.common.internal.C1101a.m3096a(r0)
            o7.o6 r0 = r4.f19866g
            m11327I(r0)
            k7.d6 r0 = r5.m8201f()
            k7.u2 r0 = (p185k7.C3997u2) r0
            java.lang.String r1 = "_sc"
            k7.y2 r0 = p249o7.C5068o6.m11387o(r0, r1)
            r1 = 0
            if (r0 != 0) goto L23
            r0 = r1
            goto L27
        L23:
            java.lang.String r0 = r0.m9149z()
        L27:
            o7.o6 r2 = r4.f19866g
            m11327I(r2)
            k7.d6 r2 = r6.m8201f()
            k7.u2 r2 = (p185k7.C3997u2) r2
            java.lang.String r3 = "_pc"
            k7.y2 r2 = p249o7.C5068o6.m11387o(r2, r3)
            if (r2 != 0) goto L3b
            goto L3f
        L3b:
            java.lang.String r1 = r2.m9149z()
        L3f:
            if (r1 == 0) goto L4c
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4c
            r4.m11333C(r5, r6)
            r5 = 1
            return r5
        L4c:
            r5 = 0
            return r5
    }

    /* renamed from: J */
    public final p249o7.C5010h4 m11339J(p249o7.C5116u6 r12) {
            r11 = this;
            o7.f4 r0 = r11.mo3160b()
            r0.mo3183i()
            r11.m11348g()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r12, r0)
            java.lang.String r0 = r12.f20031Y
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            o7.j r0 = r11.f19862c
            m11327I(r0)
            java.lang.String r1 = r12.f20031Y
            o7.h4 r0 = r0.m11255F(r1)
            java.lang.String r1 = r12.f20031Y
            o7.g r1 = r11.m11341L(r1)
            java.lang.String r2 = r12.f20052t0
            o7.g r2 = p249o7.C4997g.m11182b(r2)
            o7.g r1 = r1.m11187c(r2)
            boolean r2 = r1.m11189f()
            if (r2 == 0) goto L3e
            o7.w5 r2 = r11.f19868i
            java.lang.String r3 = r12.f20031Y
            java.lang.String r2 = r2.m11441o(r3)
            goto L40
        L3e:
            java.lang.String r2 = ""
        L40:
            r3 = 0
            if (r0 != 0) goto L64
            o7.h4 r0 = new o7.h4
            com.google.android.gms.measurement.internal.d r4 = r11.f19871l
            java.lang.String r5 = r12.f20031Y
            r0.<init>(r4, r5)
            boolean r4 = r1.m11190g()
            if (r4 == 0) goto L59
            java.lang.String r4 = r11.m11346R(r1)
            r0.m11225f(r4)
        L59:
            boolean r1 = r1.m11189f()
            if (r1 == 0) goto L105
            r0.m11243x(r2)
            goto L105
        L64:
            boolean r4 = r1.m11189f()
            if (r4 == 0) goto Lee
            if (r2 == 0) goto Lee
            com.google.android.gms.measurement.internal.d r4 = r0.f19730a
            o7.f4 r4 = r4.mo3160b()
            r4.mo3183i()
            java.lang.String r4 = r0.f19734e
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto Lee
            r0.m11243x(r2)
            java.lang.String r2 = r11.m11346R(r1)
            r0.m11225f(r2)
            p185k7.C3938p8.m8881c()
            o7.f r2 = r11.m11340K()
            o7.u2<java.lang.Boolean> r4 = p249o7.C5120v2.f20121t0
            boolean r2 = r2.m11162v(r3, r4)
            if (r2 == 0) goto L105
            o7.w5 r2 = r11.f19868i
            java.lang.String r4 = r12.f20031Y
            android.util.Pair r1 = r2.m11440n(r4, r1)
            java.lang.Object r1 = r1.first
            java.lang.String r2 = "00000000-0000-0000-0000-000000000000"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L105
            o7.j r1 = r11.f19862c
            m11327I(r1)
            java.lang.String r2 = r12.f20031Y
            java.lang.String r4 = "_id"
            o7.r6 r1 = r1.m11260K(r2, r4)
            if (r1 == 0) goto L105
            o7.j r1 = r11.f19862c
            m11327I(r1)
            java.lang.String r2 = r12.f20031Y
            java.lang.String r4 = "_lair"
            o7.r6 r1 = r1.m11260K(r2, r4)
            if (r1 != 0) goto L105
            u6.c r1 = r11.mo3163e()
            u6.d r1 = (p353u6.C6341d) r1
            java.util.Objects.requireNonNull(r1)
            long r8 = java.lang.System.currentTimeMillis()
            o7.r6 r1 = new o7.r6
            java.lang.String r5 = r12.f20031Y
            r6 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "auto"
            java.lang.String r7 = "_lair"
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r10)
            o7.j r2 = r11.f19862c
            m11327I(r2)
            r2.m11280v(r1)
            goto L105
        Lee:
            java.lang.String r2 = r0.m11214N()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L105
            boolean r2 = r1.m11190g()
            if (r2 == 0) goto L105
            java.lang.String r1 = r11.m11346R(r1)
            r0.m11225f(r1)
        L105:
            java.lang.String r1 = r12.f20032Z
            r0.m11235p(r1)
            java.lang.String r1 = r12.f20047o0
            r0.m11222c(r1)
            p185k7.C3847ia.m8706c()
            o7.f r1 = r11.m11340K()
            java.lang.String r2 = r0.m11213M()
            o7.u2<java.lang.Boolean> r4 = p249o7.C5120v2.f20089d0
            boolean r1 = r1.m11162v(r2, r4)
            if (r1 == 0) goto L127
            java.lang.String r1 = r12.f20051s0
            r0.m11234o(r1)
        L127:
            java.lang.String r1 = r12.f20041i0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L134
            java.lang.String r1 = r12.f20041i0
            r0.m11233n(r1)
        L134:
            long r1 = r12.f20035c0
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L13f
            r0.m11236q(r1)
        L13f:
            java.lang.String r1 = r12.f20033a0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L14c
            java.lang.String r1 = r12.f20033a0
            r0.m11227h(r1)
        L14c:
            long r1 = r12.f20040h0
            r0.m11228i(r1)
            java.lang.String r1 = r12.f20034b0
            if (r1 == 0) goto L158
            r0.m11226g(r1)
        L158:
            long r1 = r12.f20036d0
            r0.m11230k(r1)
            boolean r1 = r12.f20038f0
            r0.m11242w(r1)
            java.lang.String r1 = r12.f20037e0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L16f
            java.lang.String r1 = r12.f20037e0
            r0.m11238s(r1)
        L16f:
            o7.f r1 = r11.m11340K()
            o7.u2<java.lang.Boolean> r2 = p249o7.C5120v2.f20107m0
            boolean r1 = r1.m11162v(r3, r2)
            if (r1 != 0) goto L180
            long r1 = r12.f20042j0
            r0.m11224e(r1)
        L180:
            boolean r1 = r12.f20045m0
            r0.m11223d(r1)
            java.lang.Boolean r1 = r12.f20048p0
            com.google.android.gms.measurement.internal.d r2 = r0.f19730a
            o7.f4 r2 = r2.mo3160b()
            r2.mo3183i()
            boolean r2 = r0.f19727D
            java.lang.Boolean r3 = r0.f19748s
            java.lang.String[] r4 = com.google.android.gms.measurement.internal.C1115f.f5737g
            r4 = 1
            if (r3 != 0) goto L19d
            if (r1 != 0) goto L19d
            r3 = 1
            goto L1a5
        L19d:
            if (r3 != 0) goto L1a1
            r3 = 0
            goto L1a5
        L1a1:
            boolean r3 = r3.equals(r1)
        L1a5:
            r3 = r3 ^ r4
            r2 = r2 | r3
            r0.f19727D = r2
            r0.f19748s = r1
            long r1 = r12.f20049q0
            r0.m11231l(r1)
            com.google.android.gms.measurement.internal.d r12 = r0.f19730a
            o7.f4 r12 = r12.mo3160b()
            r12.mo3183i()
            boolean r12 = r0.f19727D
            if (r12 == 0) goto L1c5
            o7.j r12 = r11.f19862c
            m11327I(r12)
            r12.m11274p(r0)
        L1c5:
            return r0
    }

    /* renamed from: K */
    public final p249o7.C4989f m11340K() {
            r2 = this;
            com.google.android.gms.measurement.internal.d r0 = r2.f19871l
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            o7.f r0 = r0.f5716g
            return r0
    }

    /* renamed from: L */
    public final p249o7.C4997g m11341L(java.lang.String r7) {
            r6 = this;
            o7.f4 r0 = r6.mo3160b()
            r0.mo3183i()
            r6.m11348g()
            java.util.Map<java.lang.String, o7.g> r0 = r6.f19858A
            java.lang.Object r0 = r0.get(r7)
            o7.g r0 = (p249o7.C4997g) r0
            if (r0 != 0) goto L67
            o7.j r0 = r6.f19862c
            m11327I(r0)
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r7, r1)
            r0.mo3183i()
            r0.m11247j()
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r1[r2] = r7
            android.database.sqlite.SQLiteDatabase r3 = r0.m11253D()
            java.lang.String r4 = "select consent_state from consent_settings where app_id=? limit 1;"
            r5 = 0
            android.database.Cursor r5 = r3.rawQuery(r4, r1)     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            if (r1 == 0) goto L43
            java.lang.String r0 = r5.getString(r2)     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            r5.close()
            goto L48
        L43:
            r5.close()
            java.lang.String r0 = "G1"
        L48:
            o7.g r0 = p249o7.C4997g.m11182b(r0)
            r6.m11359r(r7, r0)
            goto L67
        L50:
            r7 = move-exception
            goto L61
        L52:
            r7 = move-exception
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L50
            o7.f3 r0 = r0.f5672f     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = "Database error"
            r0.m11171e(r1, r4, r7)     // Catch: java.lang.Throwable -> L50
            throw r7     // Catch: java.lang.Throwable -> L50
        L61:
            if (r5 == 0) goto L66
            r5.close()
        L66:
            throw r7
        L67:
            return r0
    }

    /* renamed from: M */
    public final p249o7.C5021j m11342M() {
            r1 = this;
            o7.j r0 = r1.f19862c
            m11327I(r0)
            return r0
    }

    /* renamed from: N */
    public final p249o7.C5049m3 m11343N() {
            r2 = this;
            o7.m3 r0 = r2.f19863d
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Network broadcast receiver not created"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: P */
    public final p249o7.C5068o6 m11344P() {
            r1 = this;
            o7.o6 r0 = r1.f19866g
            m11327I(r0)
            return r0
    }

    /* renamed from: Q */
    public final com.google.android.gms.measurement.internal.C1115f m11345Q() {
            r2 = this;
            com.google.android.gms.measurement.internal.d r0 = r2.f19871l
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            com.google.android.gms.measurement.internal.f r0 = r0.m3158A()
            return r0
    }

    /* renamed from: R */
    public final java.lang.String m11346R(p249o7.C4997g r5) {
            r4 = this;
            boolean r5 = r5.m11190g()
            if (r5 == 0) goto L29
            r5 = 16
            byte[] r5 = new byte[r5]
            com.google.android.gms.measurement.internal.f r0 = r4.m11345Q()
            java.security.SecureRandom r0 = r0.m3235t()
            r0.nextBytes(r5)
            java.util.Locale r0 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r1, r5)
            r5 = 0
            r2[r5] = r3
            java.lang.String r5 = "%032x"
            java.lang.String r5 = java.lang.String.format(r0, r5, r2)
            return r5
        L29:
            r5 = 0
            return r5
    }

    /* renamed from: a */
    public final void m11347a() {
            r10 = this;
            o7.f4 r0 = r10.mo3160b()
            r0.mo3183i()
            r10.m11348g()
            boolean r0 = r10.f19873n
            if (r0 != 0) goto L1a6
            r0 = 1
            r10.f19873n = r0
            o7.f4 r1 = r10.mo3160b()
            r1.mo3183i()
            o7.f r1 = r10.m11340K()
            o7.u2<java.lang.Boolean> r2 = p249o7.C5120v2.f20087c0
            r3 = 0
            boolean r1 = r1.m11162v(r3, r2)
            java.lang.String r2 = "Storage concurrent access okay"
            r4 = 0
            if (r1 == 0) goto L3e
            java.nio.channels.FileLock r1 = r10.f19881v
            if (r1 == 0) goto L3e
            boolean r1 = r1.isValid()
            if (r1 != 0) goto L33
            goto L3e
        L33:
            com.google.android.gms.measurement.internal.b r1 = r10.mo3162d()
            o7.f3 r1 = r1.f5680n
            r1.m11169c(r2)
        L3c:
            r1 = 1
            goto La0
        L3e:
            o7.j r1 = r10.f19862c
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.measurement.internal.d r1 = r10.f19871l
            android.content.Context r1 = r1.f5710a
            java.io.File r1 = r1.getFilesDir()
            java.io.File r5 = new java.io.File
            java.lang.String r6 = "google_app_measurement.db"
            r5.<init>(r1, r6)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L7f java.io.IOException -> L89 java.io.FileNotFoundException -> L93
            java.lang.String r6 = "rw"
            r1.<init>(r5, r6)     // Catch: java.nio.channels.OverlappingFileLockException -> L7f java.io.IOException -> L89 java.io.FileNotFoundException -> L93
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L7f java.io.IOException -> L89 java.io.FileNotFoundException -> L93
            r10.f19882w = r1     // Catch: java.nio.channels.OverlappingFileLockException -> L7f java.io.IOException -> L89 java.io.FileNotFoundException -> L93
            java.nio.channels.FileLock r1 = r1.tryLock()     // Catch: java.nio.channels.OverlappingFileLockException -> L7f java.io.IOException -> L89 java.io.FileNotFoundException -> L93
            r10.f19881v = r1     // Catch: java.nio.channels.OverlappingFileLockException -> L7f java.io.IOException -> L89 java.io.FileNotFoundException -> L93
            if (r1 == 0) goto L73
            com.google.android.gms.measurement.internal.b r1 = r10.mo3162d()     // Catch: java.nio.channels.OverlappingFileLockException -> L7f java.io.IOException -> L89 java.io.FileNotFoundException -> L93
            o7.f3 r1 = r1.f5680n     // Catch: java.nio.channels.OverlappingFileLockException -> L7f java.io.IOException -> L89 java.io.FileNotFoundException -> L93
            r1.m11169c(r2)     // Catch: java.nio.channels.OverlappingFileLockException -> L7f java.io.IOException -> L89 java.io.FileNotFoundException -> L93
            goto L3c
        L73:
            com.google.android.gms.measurement.internal.b r1 = r10.mo3162d()     // Catch: java.nio.channels.OverlappingFileLockException -> L7f java.io.IOException -> L89 java.io.FileNotFoundException -> L93
            o7.f3 r1 = r1.f5672f     // Catch: java.nio.channels.OverlappingFileLockException -> L7f java.io.IOException -> L89 java.io.FileNotFoundException -> L93
            java.lang.String r2 = "Storage concurrent data access panic"
            r1.m11169c(r2)     // Catch: java.nio.channels.OverlappingFileLockException -> L7f java.io.IOException -> L89 java.io.FileNotFoundException -> L93
            goto L9f
        L7f:
            r1 = move-exception
            com.google.android.gms.measurement.internal.b r2 = r10.mo3162d()
            o7.f3 r2 = r2.f5675i
            java.lang.String r5 = "Storage lock already acquired"
            goto L9c
        L89:
            r1 = move-exception
            com.google.android.gms.measurement.internal.b r2 = r10.mo3162d()
            o7.f3 r2 = r2.f5672f
            java.lang.String r5 = "Failed to access storage lock file"
            goto L9c
        L93:
            r1 = move-exception
            com.google.android.gms.measurement.internal.b r2 = r10.mo3162d()
            o7.f3 r2 = r2.f5672f
            java.lang.String r5 = "Failed to acquire storage lock"
        L9c:
            r2.m11170d(r5, r1)
        L9f:
            r1 = 0
        La0:
            if (r1 == 0) goto L1a6
            java.nio.channels.FileChannel r1 = r10.f19882w
            o7.f4 r2 = r10.mo3160b()
            r2.mo3183i()
            r5 = 0
            java.lang.String r2 = "Bad channel to read from"
            r7 = 4
            if (r1 == 0) goto Lee
            boolean r8 = r1.isOpen()
            if (r8 != 0) goto Lb9
            goto Lee
        Lb9:
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r7)
            r1.position(r5)     // Catch: java.io.IOException -> Le1
            int r1 = r1.read(r8)     // Catch: java.io.IOException -> Le1
            if (r1 == r7) goto Ld9
            r8 = -1
            if (r1 == r8) goto Lf7
            com.google.android.gms.measurement.internal.b r8 = r10.mo3162d()     // Catch: java.io.IOException -> Le1
            o7.f3 r8 = r8.f5675i     // Catch: java.io.IOException -> Le1
            java.lang.String r9 = "Unexpected data length. Bytes read"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.io.IOException -> Le1
            r8.m11170d(r9, r1)     // Catch: java.io.IOException -> Le1
            goto Lf7
        Ld9:
            r8.flip()     // Catch: java.io.IOException -> Le1
            int r4 = r8.getInt()     // Catch: java.io.IOException -> Le1
            goto Lf7
        Le1:
            r1 = move-exception
            com.google.android.gms.measurement.internal.b r8 = r10.mo3162d()
            o7.f3 r8 = r8.f5672f
            java.lang.String r9 = "Failed to read from channel"
            r8.m11170d(r9, r1)
            goto Lf7
        Lee:
            com.google.android.gms.measurement.internal.b r1 = r10.mo3162d()
            o7.f3 r1 = r1.f5672f
            r1.m11169c(r2)
        Lf7:
            com.google.android.gms.measurement.internal.d r1 = r10.f19871l
            com.google.android.gms.measurement.internal.a r1 = r1.m3172q()
            r1.m11419j()
            int r1 = r1.f5660e
            o7.f4 r8 = r10.mo3160b()
            r8.mo3183i()
            if (r4 <= r1) goto L11f
            com.google.android.gms.measurement.internal.b r0 = r10.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Panic: can't downgrade version. Previous, current version"
        L11b:
            r0.m11171e(r3, r2, r1)
            return
        L11f:
            if (r4 >= r1) goto L1a6
            java.nio.channels.FileChannel r8 = r10.f19882w
            o7.f4 r9 = r10.mo3160b()
            r9.mo3183i()
            if (r8 == 0) goto L18b
            boolean r9 = r8.isOpen()
            if (r9 != 0) goto L133
            goto L18b
        L133:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r7)
            r2.putInt(r1)
            r2.flip()
            r8.truncate(r5)     // Catch: java.io.IOException -> L17e
            o7.f r5 = r10.m11340K()     // Catch: java.io.IOException -> L17e
            o7.u2<java.lang.Boolean> r6 = p249o7.C5120v2.f20105l0     // Catch: java.io.IOException -> L17e
            boolean r3 = r5.m11162v(r3, r6)     // Catch: java.io.IOException -> L17e
            r8.write(r2)     // Catch: java.io.IOException -> L17e
            r8.force(r0)     // Catch: java.io.IOException -> L17e
            long r2 = r8.size()     // Catch: java.io.IOException -> L17e
            r5 = 4
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L16d
            com.google.android.gms.measurement.internal.b r0 = r10.mo3162d()     // Catch: java.io.IOException -> L17e
            o7.f3 r0 = r0.f5672f     // Catch: java.io.IOException -> L17e
            java.lang.String r2 = "Error writing to channel. Bytes written"
            long r5 = r8.size()     // Catch: java.io.IOException -> L17e
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.io.IOException -> L17e
            r0.m11170d(r2, r3)     // Catch: java.io.IOException -> L17e
        L16d:
            com.google.android.gms.measurement.internal.b r0 = r10.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgraded. Previous, current version"
            goto L11b
        L17e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.b r2 = r10.mo3162d()
            o7.f3 r2 = r2.f5672f
            java.lang.String r3 = "Failed to write to channel"
            r2.m11170d(r3, r0)
            goto L194
        L18b:
            com.google.android.gms.measurement.internal.b r0 = r10.mo3162d()
            o7.f3 r0 = r0.f5672f
            r0.m11169c(r2)
        L194:
            com.google.android.gms.measurement.internal.b r0 = r10.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgrade failed. Previous, current version"
            goto L11b
        L1a6:
            return
    }

    @Override // p249o7.InterfaceC5058n4
    /* renamed from: b */
    public final p249o7.C4994f4 mo3160b() {
            r2 = this;
            com.google.android.gms.measurement.internal.d r0 = r2.f19871l
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            o7.f4 r0 = r0.mo3160b()
            return r0
    }

    @Override // p249o7.InterfaceC5058n4
    /* renamed from: c */
    public final android.content.Context mo3161c() {
            r1 = this;
            com.google.android.gms.measurement.internal.d r0 = r1.f19871l
            android.content.Context r0 = r0.f5710a
            return r0
    }

    @Override // p249o7.InterfaceC5058n4
    /* renamed from: d */
    public final com.google.android.gms.measurement.internal.C1111b mo3162d() {
            r2 = this;
            com.google.android.gms.measurement.internal.d r0 = r2.f19871l
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            return r0
    }

    @Override // p249o7.InterfaceC5058n4
    /* renamed from: e */
    public final p353u6.InterfaceC6340c mo3163e() {
            r2 = this;
            com.google.android.gms.measurement.internal.d r0 = r2.f19871l
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            u6.c r0 = r0.f5723n
            return r0
    }

    @Override // p249o7.InterfaceC5058n4
    /* renamed from: f */
    public final p367v1.C6488b mo3164f() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: g */
    public final void m11348g() {
            r2 = this;
            boolean r0 = r2.f19872m
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "UploadController is not initialized"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: h */
    public final void m11349h(p249o7.C5010h4 r14) {
            r13 = this;
            o7.f4 r0 = r13.mo3160b()
            r0.mo3183i()
            p185k7.C3847ia.m8706c()
            o7.f r0 = r13.m11340K()
            java.lang.String r1 = r14.m11213M()
            o7.u2<java.lang.Boolean> r2 = p249o7.C5120v2.f20089d0
            boolean r0 = r0.m11162v(r1, r2)
            java.lang.String r1 = "null reference"
            if (r0 == 0) goto L4c
            java.lang.String r0 = r14.m11219S()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L71
            java.lang.String r0 = r14.m11218R()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L71
            java.lang.String r0 = r14.m11211K()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3b
            goto L71
        L3b:
            java.lang.String r4 = r14.m11213M()
            java.util.Objects.requireNonNull(r4, r1)
            r5 = 204(0xcc, float:2.86E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r13
            r3.m11353l(r4, r5, r6, r7, r8)
            return
        L4c:
            java.lang.String r0 = r14.m11219S()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L71
            java.lang.String r0 = r14.m11211K()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L71
            java.lang.String r4 = r14.m11213M()
            java.util.Objects.requireNonNull(r4, r1)
            r5 = 204(0xcc, float:2.86E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r13
            r3.m11353l(r4, r5, r6, r7, r8)
            return
        L71:
            o7.j6 r0 = r13.f19869j
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            java.lang.String r4 = r14.m11219S()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto La1
            p185k7.C3847ia.m8706c()
            com.google.android.gms.measurement.internal.d r4 = r0.f5736a
            o7.f r4 = r4.f5716g
            java.lang.String r5 = r14.m11213M()
            boolean r2 = r4.m11162v(r5, r2)
            if (r2 == 0) goto L9d
            java.lang.String r4 = r14.m11218R()
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto La1
        L9d:
            java.lang.String r4 = r14.m11211K()
        La1:
            o7.u2<java.lang.String> r2 = p249o7.C5120v2.f20090e
            r5 = 0
            java.lang.Object r2 = r2.m11421a(r5)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r3.scheme(r2)
            o7.u2<java.lang.String> r6 = p249o7.C5120v2.f20092f
            java.lang.Object r6 = r6.m11421a(r5)
            java.lang.String r6 = (java.lang.String) r6
            android.net.Uri$Builder r2 = r2.encodedAuthority(r6)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "config/app/"
            int r7 = r4.length()
            if (r7 == 0) goto Lcb
            java.lang.String r4 = r6.concat(r4)
            goto Ld0
        Lcb:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
        Ld0:
            android.net.Uri$Builder r2 = r2.path(r4)
            java.lang.String r4 = r14.m11214N()
            java.lang.String r6 = "app_instance_id"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r6, r4)
            java.lang.String r4 = "platform"
            java.lang.String r6 = "android"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r4, r6)
            com.google.android.gms.measurement.internal.d r4 = r0.f5736a
            o7.f r4 = r4.f5716g
            r4.m11157q()
            r6 = 43042(0xa822, double:2.12656E-319)
            java.lang.String r4 = java.lang.String.valueOf(r6)
            java.lang.String r6 = "gmp_version"
            r2.appendQueryParameter(r6, r4)
            p185k7.C3792eb.m8525c()
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f r0 = r0.f5716g
            java.lang.String r2 = r14.m11213M()
            o7.u2<java.lang.Boolean> r4 = p249o7.C5120v2.f20119s0
            boolean r0 = r0.m11162v(r2, r4)
            if (r0 == 0) goto L113
            java.lang.String r0 = "runtime_version"
            java.lang.String r2 = "0"
            r3.appendQueryParameter(r0, r2)
        L113:
            android.net.Uri r0 = r3.build()
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = r14.m11213M()     // Catch: java.net.MalformedURLException -> L183
            java.util.Objects.requireNonNull(r8, r1)     // Catch: java.net.MalformedURLException -> L183
            java.net.URL r9 = new java.net.URL     // Catch: java.net.MalformedURLException -> L183
            r9.<init>(r0)     // Catch: java.net.MalformedURLException -> L183
            com.google.android.gms.measurement.internal.b r1 = r13.mo3162d()     // Catch: java.net.MalformedURLException -> L183
            o7.f3 r1 = r1.f5680n     // Catch: java.net.MalformedURLException -> L183
            java.lang.String r2 = "Fetching remote configuration"
            r1.m11170d(r2, r8)     // Catch: java.net.MalformedURLException -> L183
            o7.a4 r1 = r13.f19860a     // Catch: java.net.MalformedURLException -> L183
            m11327I(r1)     // Catch: java.net.MalformedURLException -> L183
            k7.j2 r1 = r1.m11091n(r8)     // Catch: java.net.MalformedURLException -> L183
            o7.a4 r2 = r13.f19860a     // Catch: java.net.MalformedURLException -> L183
            m11327I(r2)     // Catch: java.net.MalformedURLException -> L183
            r2.mo3183i()     // Catch: java.net.MalformedURLException -> L183
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f19572k     // Catch: java.net.MalformedURLException -> L183
            java.lang.Object r2 = r2.get(r8)     // Catch: java.net.MalformedURLException -> L183
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.net.MalformedURLException -> L183
            if (r1 == 0) goto L15d
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.net.MalformedURLException -> L183
            if (r1 != 0) goto L15d
            s.a r5 = new s.a     // Catch: java.net.MalformedURLException -> L183
            r5.<init>()     // Catch: java.net.MalformedURLException -> L183
            java.lang.String r1 = "If-Modified-Since"
            r5.put(r1, r2)     // Catch: java.net.MalformedURLException -> L183
        L15d:
            r11 = r5
            r1 = 1
            r13.f19878s = r1     // Catch: java.net.MalformedURLException -> L183
            o7.k3 r7 = r13.f19861b     // Catch: java.net.MalformedURLException -> L183
            m11327I(r7)     // Catch: java.net.MalformedURLException -> L183
            o7.k6 r12 = new o7.k6     // Catch: java.net.MalformedURLException -> L183
            r1 = 0
            r12.<init>(r13, r1)     // Catch: java.net.MalformedURLException -> L183
            r7.mo3183i()     // Catch: java.net.MalformedURLException -> L183
            r7.m11247j()     // Catch: java.net.MalformedURLException -> L183
            com.google.android.gms.measurement.internal.d r1 = r7.f5736a     // Catch: java.net.MalformedURLException -> L183
            o7.f4 r1 = r1.mo3160b()     // Catch: java.net.MalformedURLException -> L183
            o7.j3 r2 = new o7.j3     // Catch: java.net.MalformedURLException -> L183
            r10 = 0
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: java.net.MalformedURLException -> L183
            r1.m11175r(r2)     // Catch: java.net.MalformedURLException -> L183
            return
        L183:
            com.google.android.gms.measurement.internal.b r1 = r13.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.String r14 = r14.m11213M()
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C1111b.m3134u(r14)
            java.lang.String r2 = "Failed to parse config URL. Not fetching. appId"
            r1.m11171e(r2, r14, r0)
            return
    }

    /* renamed from: i */
    public final void m11350i(p249o7.C5077q r20, p249o7.C5116u6 r21) {
            r19 = this;
            r1 = r19
            r0 = r21
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r0, r2)
            java.lang.String r3 = r0.f20031Y
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            o7.f4 r3 = r19.mo3160b()
            r3.mo3183i()
            r19.m11348g()
            java.lang.String r3 = r0.f20031Y
            r4 = r20
            long r11 = r4.f19954b0
            k7.nb r5 = p185k7.C3915nb.f16780Z
            k7.ob r5 = r5.m8849b()
            r5.mo8872a()
            o7.f r5 = r19.m11340K()
            o7.u2<java.lang.Boolean> r6 = p249o7.C5120v2.f20125v0
            r7 = 0
            boolean r5 = r5.m11162v(r7, r6)
            r6 = 0
            if (r5 == 0) goto L4b
            o7.h3 r4 = p249o7.C5009h3.m11198c(r20)
            o7.f4 r5 = r19.mo3160b()
            r5.mo3183i()
            java.lang.Object r5 = r4.f19723e
            android.os.Bundle r5 = (android.os.Bundle) r5
            com.google.android.gms.measurement.internal.C1115f.m3195x(r7, r5, r6)
            o7.q r4 = r4.m11200b()
        L4b:
            o7.o6 r5 = r1.f19866g
            m11327I(r5)
            boolean r5 = p249o7.C5068o6.m11386n(r4, r0)
            if (r5 != 0) goto L57
            return
        L57:
            boolean r5 = r0.f20038f0
            if (r5 != 0) goto L5f
            r1.m11339J(r0)
            return
        L5f:
            java.util.List<java.lang.String> r5 = r0.f20050r0
            if (r5 == 0) goto L9e
            java.lang.String r7 = r4.f19951Y
            boolean r5 = r5.contains(r7)
            if (r5 == 0) goto L8e
            o7.o r5 = r4.f19952Z
            android.os.Bundle r5 = r5.m11371X()
            r7 = 1
            java.lang.String r9 = "ga_safelisted"
            r5.putLong(r9, r7)
            o7.q r7 = new o7.q
            java.lang.String r14 = r4.f19951Y
            o7.o r15 = new o7.o
            r15.<init>(r5)
            java.lang.String r5 = r4.f19953a0
            long r8 = r4.f19954b0
            r13 = r7
            r16 = r5
            r17 = r8
            r13.<init>(r14, r15, r16, r17)
            goto L9f
        L8e:
            com.google.android.gms.measurement.internal.b r0 = r19.mo3162d()
            o7.f3 r0 = r0.f5679m
            java.lang.String r2 = r4.f19951Y
            java.lang.String r4 = r4.f19953a0
            java.lang.String r5 = "Dropping non-safelisted event. appId, event name, origin"
            r0.m11172f(r5, r3, r2, r4)
            return
        L9e:
            r13 = r4
        L9f:
            o7.j r4 = r1.f19862c
            m11327I(r4)
            r4.m11267R()
            o7.j r4 = r1.f19862c     // Catch: java.lang.Throwable -> L2f4
            m11327I(r4)     // Catch: java.lang.Throwable -> L2f4
            com.google.android.gms.common.internal.C1101a.m3100e(r3)     // Catch: java.lang.Throwable -> L2f4
            r4.mo3183i()     // Catch: java.lang.Throwable -> L2f4
            r4.m11247j()     // Catch: java.lang.Throwable -> L2f4
            r7 = 0
            r5 = 2
            r14 = 1
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 >= 0) goto Ld7
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a     // Catch: java.lang.Throwable -> L2f4
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()     // Catch: java.lang.Throwable -> L2f4
            o7.f3 r4 = r4.f5675i     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r7 = "Invalid time querying timed out conditional properties"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1111b.m3134u(r3)     // Catch: java.lang.Throwable -> L2f4
            java.lang.Long r10 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L2f4
            r4.m11171e(r7, r8, r10)     // Catch: java.lang.Throwable -> L2f4
            java.util.List r4 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L2f4
            goto Le7
        Ld7:
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L2f4
            r7[r6] = r3     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r8 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L2f4
            r7[r14] = r8     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r8 = "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"
            java.util.List r4 = r4.m11264O(r8, r7)     // Catch: java.lang.Throwable -> L2f4
        Le7:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L2f4
        Leb:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Throwable -> L2f4
            if (r7 == 0) goto L133
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Throwable -> L2f4
            o7.b r7 = (p249o7.C4957b) r7     // Catch: java.lang.Throwable -> L2f4
            if (r7 == 0) goto Leb
            com.google.android.gms.measurement.internal.b r8 = r19.mo3162d()     // Catch: java.lang.Throwable -> L2f4
            o7.f3 r8 = r8.f5680n     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r10 = "User property timed out"
            java.lang.String r15 = r7.f19587Y     // Catch: java.lang.Throwable -> L2f4
            com.google.android.gms.measurement.internal.d r14 = r1.f19871l     // Catch: java.lang.Throwable -> L2f4
            o7.c3 r14 = r14.f5722m     // Catch: java.lang.Throwable -> L2f4
            o7.p6 r6 = r7.f19589a0     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r6 = r6.f19945Z     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r6 = r14.m11118f(r6)     // Catch: java.lang.Throwable -> L2f4
            o7.p6 r14 = r7.f19589a0     // Catch: java.lang.Throwable -> L2f4
            java.lang.Object r14 = r14.m11412X()     // Catch: java.lang.Throwable -> L2f4
            r8.m11172f(r10, r15, r6, r14)     // Catch: java.lang.Throwable -> L2f4
            o7.q r6 = r7.f19593e0     // Catch: java.lang.Throwable -> L2f4
            if (r6 == 0) goto L124
            o7.q r8 = new o7.q     // Catch: java.lang.Throwable -> L2f4
            r8.<init>(r6, r11)     // Catch: java.lang.Throwable -> L2f4
            r1.m11362u(r8, r0)     // Catch: java.lang.Throwable -> L2f4
        L124:
            o7.j r6 = r1.f19862c     // Catch: java.lang.Throwable -> L2f4
            m11327I(r6)     // Catch: java.lang.Throwable -> L2f4
            o7.p6 r7 = r7.f19589a0     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r7 = r7.f19945Z     // Catch: java.lang.Throwable -> L2f4
            r6.m11282y(r3, r7)     // Catch: java.lang.Throwable -> L2f4
            r6 = 0
            r14 = 1
            goto Leb
        L133:
            o7.j r4 = r1.f19862c     // Catch: java.lang.Throwable -> L2f4
            m11327I(r4)     // Catch: java.lang.Throwable -> L2f4
            com.google.android.gms.common.internal.C1101a.m3100e(r3)     // Catch: java.lang.Throwable -> L2f4
            r4.mo3183i()     // Catch: java.lang.Throwable -> L2f4
            r4.m11247j()     // Catch: java.lang.Throwable -> L2f4
            if (r9 >= 0) goto L15d
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a     // Catch: java.lang.Throwable -> L2f4
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()     // Catch: java.lang.Throwable -> L2f4
            o7.f3 r4 = r4.f5675i     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r6 = "Invalid time querying expired conditional properties"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1111b.m3134u(r3)     // Catch: java.lang.Throwable -> L2f4
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L2f4
            r4.m11171e(r6, r7, r8)     // Catch: java.lang.Throwable -> L2f4
            java.util.List r4 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L2f4
            goto L16f
        L15d:
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L2f4
            r7 = 0
            r6[r7] = r3     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r7 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L2f4
            r8 = 1
            r6[r8] = r7     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r7 = "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"
            java.util.List r4 = r4.m11264O(r7, r6)     // Catch: java.lang.Throwable -> L2f4
        L16f:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2f4
            int r7 = r4.size()     // Catch: java.lang.Throwable -> L2f4
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L2f4
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L2f4
        L17c:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Throwable -> L2f4
            if (r7 == 0) goto L1ca
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Throwable -> L2f4
            o7.b r7 = (p249o7.C4957b) r7     // Catch: java.lang.Throwable -> L2f4
            if (r7 == 0) goto L17c
            com.google.android.gms.measurement.internal.b r8 = r19.mo3162d()     // Catch: java.lang.Throwable -> L2f4
            o7.f3 r8 = r8.f5680n     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r10 = "User property expired"
            java.lang.String r14 = r7.f19587Y     // Catch: java.lang.Throwable -> L2f4
            com.google.android.gms.measurement.internal.d r15 = r1.f19871l     // Catch: java.lang.Throwable -> L2f4
            o7.c3 r15 = r15.f5722m     // Catch: java.lang.Throwable -> L2f4
            o7.p6 r5 = r7.f19589a0     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r5 = r5.f19945Z     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r5 = r15.m11118f(r5)     // Catch: java.lang.Throwable -> L2f4
            o7.p6 r15 = r7.f19589a0     // Catch: java.lang.Throwable -> L2f4
            java.lang.Object r15 = r15.m11412X()     // Catch: java.lang.Throwable -> L2f4
            r8.m11172f(r10, r14, r5, r15)     // Catch: java.lang.Throwable -> L2f4
            o7.j r5 = r1.f19862c     // Catch: java.lang.Throwable -> L2f4
            m11327I(r5)     // Catch: java.lang.Throwable -> L2f4
            o7.p6 r8 = r7.f19589a0     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r8 = r8.f19945Z     // Catch: java.lang.Throwable -> L2f4
            r5.m11272n(r3, r8)     // Catch: java.lang.Throwable -> L2f4
            o7.q r5 = r7.f19597i0     // Catch: java.lang.Throwable -> L2f4
            if (r5 == 0) goto L1bc
            r6.add(r5)     // Catch: java.lang.Throwable -> L2f4
        L1bc:
            o7.j r5 = r1.f19862c     // Catch: java.lang.Throwable -> L2f4
            m11327I(r5)     // Catch: java.lang.Throwable -> L2f4
            o7.p6 r7 = r7.f19589a0     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r7 = r7.f19945Z     // Catch: java.lang.Throwable -> L2f4
            r5.m11282y(r3, r7)     // Catch: java.lang.Throwable -> L2f4
            r5 = 2
            goto L17c
        L1ca:
            java.util.Iterator r4 = r6.iterator()     // Catch: java.lang.Throwable -> L2f4
        L1ce:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L2f4
            if (r5 == 0) goto L1e3
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L2f4
            o7.q r5 = (p249o7.C5077q) r5     // Catch: java.lang.Throwable -> L2f4
            o7.q r6 = new o7.q     // Catch: java.lang.Throwable -> L2f4
            r6.<init>(r5, r11)     // Catch: java.lang.Throwable -> L2f4
            r1.m11362u(r6, r0)     // Catch: java.lang.Throwable -> L2f4
            goto L1ce
        L1e3:
            o7.j r4 = r1.f19862c     // Catch: java.lang.Throwable -> L2f4
            m11327I(r4)     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r5 = r13.f19951Y     // Catch: java.lang.Throwable -> L2f4
            com.google.android.gms.common.internal.C1101a.m3100e(r3)     // Catch: java.lang.Throwable -> L2f4
            com.google.android.gms.common.internal.C1101a.m3100e(r5)     // Catch: java.lang.Throwable -> L2f4
            r4.mo3183i()     // Catch: java.lang.Throwable -> L2f4
            r4.m11247j()     // Catch: java.lang.Throwable -> L2f4
            if (r9 >= 0) goto L21a
            com.google.android.gms.measurement.internal.d r6 = r4.f5736a     // Catch: java.lang.Throwable -> L2f4
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()     // Catch: java.lang.Throwable -> L2f4
            o7.f3 r6 = r6.f5675i     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r7 = "Invalid time querying triggered conditional properties"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1111b.m3134u(r3)     // Catch: java.lang.Throwable -> L2f4
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a     // Catch: java.lang.Throwable -> L2f4
            o7.c3 r4 = r4.f5722m     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r4 = r4.m11116d(r5)     // Catch: java.lang.Throwable -> L2f4
            java.lang.Long r5 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L2f4
            r6.m11172f(r7, r3, r4, r5)     // Catch: java.lang.Throwable -> L2f4
            java.util.List r3 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L2f4
            goto L230
        L21a:
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L2f4
            r7 = 0
            r6[r7] = r3     // Catch: java.lang.Throwable -> L2f4
            r3 = 1
            r6[r3] = r5     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L2f4
            r5 = 2
            r6[r5] = r3     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r3 = "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"
            java.util.List r3 = r4.m11264O(r3, r6)     // Catch: java.lang.Throwable -> L2f4
        L230:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2f4
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L2f4
            r14.<init>(r4)     // Catch: java.lang.Throwable -> L2f4
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2f4
        L23d:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L2f4
            if (r4 == 0) goto L2c7
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L2f4
            r15 = r4
            o7.b r15 = (p249o7.C4957b) r15     // Catch: java.lang.Throwable -> L2f4
            if (r15 == 0) goto L23d
            o7.p6 r4 = r15.f19589a0     // Catch: java.lang.Throwable -> L2f4
            o7.r6 r10 = new o7.r6     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r5 = r15.f19587Y     // Catch: java.lang.Throwable -> L2f4
            java.util.Objects.requireNonNull(r5, r2)     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r6 = r15.f19588Z     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r7 = r4.f19945Z     // Catch: java.lang.Throwable -> L2f4
            java.lang.Object r8 = r4.m11412X()     // Catch: java.lang.Throwable -> L2f4
            java.util.Objects.requireNonNull(r8, r2)     // Catch: java.lang.Throwable -> L2f4
            r4 = r10
            r16 = r8
            r8 = r11
            r17 = r2
            r2 = r10
            r10 = r16
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L2f4
            o7.j r4 = r1.f19862c     // Catch: java.lang.Throwable -> L2f4
            m11327I(r4)     // Catch: java.lang.Throwable -> L2f4
            boolean r4 = r4.m11280v(r2)     // Catch: java.lang.Throwable -> L2f4
            if (r4 == 0) goto L28e
            com.google.android.gms.measurement.internal.b r4 = r19.mo3162d()     // Catch: java.lang.Throwable -> L2f4
            o7.f3 r4 = r4.f5680n     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r5 = "User property triggered"
            java.lang.String r6 = r15.f19587Y     // Catch: java.lang.Throwable -> L2f4
            com.google.android.gms.measurement.internal.d r7 = r1.f19871l     // Catch: java.lang.Throwable -> L2f4
            o7.c3 r7 = r7.f5722m     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r8 = r2.f19982c     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r7 = r7.m11118f(r8)     // Catch: java.lang.Throwable -> L2f4
        L28b:
            java.lang.Object r8 = r2.f19984e     // Catch: java.lang.Throwable -> L2f4
            goto L2a7
        L28e:
            com.google.android.gms.measurement.internal.b r4 = r19.mo3162d()     // Catch: java.lang.Throwable -> L2f4
            o7.f3 r4 = r4.f5672f     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r5 = "Too many active user properties, ignoring"
            java.lang.String r6 = r15.f19587Y     // Catch: java.lang.Throwable -> L2f4
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1111b.m3134u(r6)     // Catch: java.lang.Throwable -> L2f4
            com.google.android.gms.measurement.internal.d r7 = r1.f19871l     // Catch: java.lang.Throwable -> L2f4
            o7.c3 r7 = r7.f5722m     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r8 = r2.f19982c     // Catch: java.lang.Throwable -> L2f4
            java.lang.String r7 = r7.m11118f(r8)     // Catch: java.lang.Throwable -> L2f4
            goto L28b
        L2a7:
            r4.m11172f(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2f4
            o7.q r4 = r15.f19595g0     // Catch: java.lang.Throwable -> L2f4
            if (r4 == 0) goto L2b1
            r14.add(r4)     // Catch: java.lang.Throwable -> L2f4
        L2b1:
            o7.p6 r4 = new o7.p6     // Catch: java.lang.Throwable -> L2f4
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L2f4
            r15.f19589a0 = r4     // Catch: java.lang.Throwable -> L2f4
            r2 = 1
            r15.f19591c0 = r2     // Catch: java.lang.Throwable -> L2f4
            o7.j r4 = r1.f19862c     // Catch: java.lang.Throwable -> L2f4
            m11327I(r4)     // Catch: java.lang.Throwable -> L2f4
            r4.m11279u(r15)     // Catch: java.lang.Throwable -> L2f4
            r2 = r17
            goto L23d
        L2c7:
            r1.m11362u(r13, r0)     // Catch: java.lang.Throwable -> L2f4
            java.util.Iterator r2 = r14.iterator()     // Catch: java.lang.Throwable -> L2f4
        L2ce:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2f4
            if (r3 == 0) goto L2e3
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2f4
            o7.q r3 = (p249o7.C5077q) r3     // Catch: java.lang.Throwable -> L2f4
            o7.q r4 = new o7.q     // Catch: java.lang.Throwable -> L2f4
            r4.<init>(r3, r11)     // Catch: java.lang.Throwable -> L2f4
            r1.m11362u(r4, r0)     // Catch: java.lang.Throwable -> L2f4
            goto L2ce
        L2e3:
            o7.j r0 = r1.f19862c     // Catch: java.lang.Throwable -> L2f4
            m11327I(r0)     // Catch: java.lang.Throwable -> L2f4
            r0.m11273o()     // Catch: java.lang.Throwable -> L2f4
            o7.j r0 = r1.f19862c
            m11327I(r0)
            r0.m11269T()
            return
        L2f4:
            r0 = move-exception
            o7.j r2 = r1.f19862c
            m11327I(r2)
            r2.m11269T()
            throw r0
    }

    /* renamed from: j */
    public final void m11351j(p249o7.C5077q r34, java.lang.String r35) {
            r33 = this;
            r0 = r33
            r1 = r34
            r3 = r35
            o7.j r2 = r0.f19862c
            m11327I(r2)
            o7.h4 r2 = r2.m11255F(r3)
            if (r2 == 0) goto Le1
            java.lang.String r4 = r2.m11216P()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L1d
            goto Le1
        L1d:
            java.lang.Boolean r4 = r0.m11365z(r2)
            if (r4 != 0) goto L3d
            java.lang.String r4 = r1.f19951Y
            java.lang.String r5 = "_ui"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L53
            com.google.android.gms.measurement.internal.b r4 = r33.mo3162d()
            o7.f3 r4 = r4.f5675i
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1111b.m3134u(r35)
            java.lang.String r6 = "Could not find package. appId"
            r4.m11170d(r6, r5)
            goto L53
        L3d:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L53
            com.google.android.gms.measurement.internal.b r1 = r33.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1111b.m3134u(r35)
            java.lang.String r3 = "App version does not match; dropping event. appId"
            r1.m11170d(r3, r2)
            return
        L53:
            o7.u6 r14 = new o7.u6
            java.lang.String r4 = r2.m11219S()
            java.lang.String r5 = r2.m11216P()
            long r6 = r2.m11202B()
            java.lang.String r8 = r2.m11215O()
            long r9 = r2.m11207G()
            long r11 = r2.m11204D()
            boolean r16 = r2.m11201A()
            java.lang.String r17 = r2.m11217Q()
            long r24 = r2.m11237r()
            boolean r22 = r2.m11245z()
            java.lang.String r26 = r2.m11211K()
            com.google.android.gms.measurement.internal.d r13 = r2.f19730a
            o7.f4 r13 = r13.mo3160b()
            r13.mo3183i()
            java.lang.Boolean r15 = r2.f19748s
            long r27 = r2.m11205E()
            java.util.List r29 = r2.m11220a()
            p185k7.C3847ia.m8706c()
            o7.f r13 = r33.m11340K()
            r18 = r15
            java.lang.String r15 = r2.m11213M()
            o7.u2<java.lang.Boolean> r1 = p249o7.C5120v2.f20089d0
            boolean r1 = r13.m11162v(r15, r1)
            if (r1 == 0) goto Lae
            java.lang.String r1 = r2.m11218R()
            goto Laf
        Lae:
            r1 = 0
        Laf:
            r13 = 0
            r15 = 0
            r31 = r18
            r19 = 0
            r21 = 0
            r23 = 0
            o7.g r2 = r0.m11341L(r3)
            java.lang.String r30 = r2.m11188e()
            r2 = r14
            r3 = r35
            r32 = r14
            r14 = r16
            r16 = r17
            r17 = r24
            r24 = r26
            r25 = r31
            r26 = r27
            r28 = r29
            r29 = r1
            r2.<init>(r3, r4, r5, r6, r8, r9, r11, r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r28, r29, r30)
            r1 = r34
            r2 = r32
            r0.m11352k(r1, r2)
            return
        Le1:
            com.google.android.gms.measurement.internal.b r1 = r33.mo3162d()
            o7.f3 r1 = r1.f5679m
            java.lang.String r2 = "No app data available; dropping event"
            r1.m11170d(r2, r3)
            return
    }

    /* renamed from: k */
    public final void m11352k(p249o7.C5077q r9, p249o7.C5116u6 r10) {
            r8 = this;
            java.lang.String r0 = r10.f20031Y
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            o7.h3 r9 = p249o7.C5009h3.m11198c(r9)
            com.google.android.gms.measurement.internal.f r0 = r8.m11345Q()
            java.lang.Object r1 = r9.f19723e
            android.os.Bundle r1 = (android.os.Bundle) r1
            o7.j r2 = r8.f19862c
            m11327I(r2)
            java.lang.String r3 = r10.f20031Y
            android.os.Bundle r2 = r2.m11254E(r3)
            r0.m3239y(r1, r2)
            com.google.android.gms.measurement.internal.f r0 = r8.m11345Q()
            o7.f r1 = r8.m11340K()
            java.lang.String r2 = r10.f20031Y
            int r1 = r1.m11154n(r2)
            r0.m3240z(r9, r1)
            o7.q r9 = r9.m11200b()
            java.lang.String r0 = r9.f19951Y
            java.lang.String r1 = "_cmp"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3f
            goto L70
        L3f:
            o7.o r0 = r9.f19952Z
            android.os.Bundle r0 = r0.f19913Y
            java.lang.String r1 = "_cis"
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "referrer API v2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L70
            o7.o r0 = r9.f19952Z
            android.os.Bundle r0 = r0.f19913Y
            java.lang.String r1 = "gclid"
            java.lang.String r6 = r0.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L70
            o7.p6 r0 = new o7.p6
            long r4 = r9.f19954b0
            java.lang.String r3 = "_lgclid"
            java.lang.String r7 = "auto"
            r2 = r0
            r2.<init>(r3, r4, r6, r7)
            r8.m11360s(r0, r10)
        L70:
            r8.m11350i(r9, r10)
            return
    }

    /* renamed from: l */
    public final void m11353l(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12) {
            r7 = this;
            o7.f4 r0 = r7.mo3160b()
            r0.mo3183i()
            r7.m11348g()
            com.google.android.gms.common.internal.C1101a.m3100e(r8)
            r0 = 0
            if (r11 != 0) goto L12
            byte[] r11 = new byte[r0]     // Catch: java.lang.Throwable -> L172
        L12:
            com.google.android.gms.measurement.internal.b r1 = r7.mo3162d()     // Catch: java.lang.Throwable -> L172
            o7.f3 r1 = r1.f5680n     // Catch: java.lang.Throwable -> L172
            int r2 = r11.length     // Catch: java.lang.Throwable -> L172
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L172
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.m11170d(r3, r2)     // Catch: java.lang.Throwable -> L172
            o7.j r1 = r7.f19862c     // Catch: java.lang.Throwable -> L172
            m11327I(r1)     // Catch: java.lang.Throwable -> L172
            r1.m11267R()     // Catch: java.lang.Throwable -> L172
            o7.j r1 = r7.f19862c     // Catch: java.lang.Throwable -> L59
            m11327I(r1)     // Catch: java.lang.Throwable -> L59
            o7.h4 r1 = r1.m11255F(r8)     // Catch: java.lang.Throwable -> L59
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r9 == r3) goto L41
            r3 = 204(0xcc, float:2.86E-43)
            if (r9 == r3) goto L41
            if (r9 != r4) goto L45
            r9 = 304(0x130, float:4.26E-43)
        L41:
            if (r10 != 0) goto L45
            r3 = 1
            goto L46
        L45:
            r3 = 0
        L46:
            if (r1 != 0) goto L5c
            com.google.android.gms.measurement.internal.b r9 = r7.mo3162d()     // Catch: java.lang.Throwable -> L59
            o7.f3 r9 = r9.f5675i     // Catch: java.lang.Throwable -> L59
            java.lang.String r10 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1111b.m3134u(r8)     // Catch: java.lang.Throwable -> L59
            r9.m11170d(r10, r8)     // Catch: java.lang.Throwable -> L59
            goto L153
        L59:
            r8 = move-exception
            goto L169
        L5c:
            r5 = 404(0x194, float:5.66E-43)
            r6 = 0
            if (r3 != 0) goto Lcd
            if (r9 != r5) goto L64
            goto Lcd
        L64:
            u6.c r11 = r7.mo3163e()     // Catch: java.lang.Throwable -> L59
            u6.d r11 = (p353u6.C6341d) r11     // Catch: java.lang.Throwable -> L59
            java.util.Objects.requireNonNull(r11)     // Catch: java.lang.Throwable -> L59
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L59
            r1.m11232m(r11)     // Catch: java.lang.Throwable -> L59
            o7.j r11 = r7.f19862c     // Catch: java.lang.Throwable -> L59
            m11327I(r11)     // Catch: java.lang.Throwable -> L59
            r11.m11274p(r1)     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.measurement.internal.b r11 = r7.mo3162d()     // Catch: java.lang.Throwable -> L59
            o7.f3 r11 = r11.f5680n     // Catch: java.lang.Throwable -> L59
            java.lang.String r12 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L59
            r11.m11171e(r12, r1, r10)     // Catch: java.lang.Throwable -> L59
            o7.a4 r10 = r7.f19860a     // Catch: java.lang.Throwable -> L59
            m11327I(r10)     // Catch: java.lang.Throwable -> L59
            r10.mo3183i()     // Catch: java.lang.Throwable -> L59
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f19572k     // Catch: java.lang.Throwable -> L59
            r10.put(r8, r6)     // Catch: java.lang.Throwable -> L59
            o7.w5 r8 = r7.f19868i     // Catch: java.lang.Throwable -> L59
            o7.p3 r8 = r8.f20155j     // Catch: java.lang.Throwable -> L59
            u6.c r10 = r7.mo3163e()     // Catch: java.lang.Throwable -> L59
            u6.d r10 = (p353u6.C6341d) r10     // Catch: java.lang.Throwable -> L59
            java.util.Objects.requireNonNull(r10)     // Catch: java.lang.Throwable -> L59
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L59
            r8.m11411b(r10)     // Catch: java.lang.Throwable -> L59
            r8 = 503(0x1f7, float:7.05E-43)
            if (r9 == r8) goto Lb4
            r8 = 429(0x1ad, float:6.01E-43)
            if (r9 != r8) goto Lc8
        Lb4:
            o7.w5 r8 = r7.f19868i     // Catch: java.lang.Throwable -> L59
            o7.p3 r8 = r8.f20153h     // Catch: java.lang.Throwable -> L59
            u6.c r9 = r7.mo3163e()     // Catch: java.lang.Throwable -> L59
            u6.d r9 = (p353u6.C6341d) r9     // Catch: java.lang.Throwable -> L59
            java.util.Objects.requireNonNull(r9)     // Catch: java.lang.Throwable -> L59
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L59
            r8.m11411b(r9)     // Catch: java.lang.Throwable -> L59
        Lc8:
            r7.m11334D()     // Catch: java.lang.Throwable -> L59
            goto L153
        Lcd:
            if (r12 == 0) goto Ld8
            java.lang.String r10 = "Last-Modified"
            java.lang.Object r10 = r12.get(r10)     // Catch: java.lang.Throwable -> L59
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L59
            goto Ld9
        Ld8:
            r10 = r6
        Ld9:
            if (r10 == 0) goto Le8
            int r12 = r10.size()     // Catch: java.lang.Throwable -> L59
            if (r12 <= 0) goto Le8
            java.lang.Object r10 = r10.get(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L59
            goto Le9
        Le8:
            r10 = r6
        Le9:
            if (r9 == r5) goto Lf7
            if (r9 != r4) goto Lee
            goto Lf7
        Lee:
            o7.a4 r12 = r7.f19860a     // Catch: java.lang.Throwable -> L59
            m11327I(r12)     // Catch: java.lang.Throwable -> L59
            r12.m11098u(r8, r11, r10)     // Catch: java.lang.Throwable -> L59
            goto L10a
        Lf7:
            o7.a4 r10 = r7.f19860a     // Catch: java.lang.Throwable -> L59
            m11327I(r10)     // Catch: java.lang.Throwable -> L59
            k7.j2 r10 = r10.m11091n(r8)     // Catch: java.lang.Throwable -> L59
            if (r10 != 0) goto L10a
            o7.a4 r10 = r7.f19860a     // Catch: java.lang.Throwable -> L59
            m11327I(r10)     // Catch: java.lang.Throwable -> L59
            r10.m11098u(r8, r6, r6)     // Catch: java.lang.Throwable -> L59
        L10a:
            u6.c r10 = r7.mo3163e()     // Catch: java.lang.Throwable -> L59
            u6.d r10 = (p353u6.C6341d) r10     // Catch: java.lang.Throwable -> L59
            java.util.Objects.requireNonNull(r10)     // Catch: java.lang.Throwable -> L59
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L59
            r1.m11229j(r10)     // Catch: java.lang.Throwable -> L59
            o7.j r10 = r7.f19862c     // Catch: java.lang.Throwable -> L59
            m11327I(r10)     // Catch: java.lang.Throwable -> L59
            r10.m11274p(r1)     // Catch: java.lang.Throwable -> L59
            if (r9 != r5) goto L130
            com.google.android.gms.measurement.internal.b r9 = r7.mo3162d()     // Catch: java.lang.Throwable -> L59
            o7.f3 r9 = r9.f5677k     // Catch: java.lang.Throwable -> L59
            java.lang.String r10 = "Config not found. Using empty config. appId"
            r9.m11170d(r10, r8)     // Catch: java.lang.Throwable -> L59
            goto L13f
        L130:
            com.google.android.gms.measurement.internal.b r8 = r7.mo3162d()     // Catch: java.lang.Throwable -> L59
            o7.f3 r8 = r8.f5680n     // Catch: java.lang.Throwable -> L59
            java.lang.String r10 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L59
            r8.m11171e(r10, r9, r2)     // Catch: java.lang.Throwable -> L59
        L13f:
            o7.k3 r8 = r7.f19861b     // Catch: java.lang.Throwable -> L59
            m11327I(r8)     // Catch: java.lang.Throwable -> L59
            boolean r8 = r8.m11288n()     // Catch: java.lang.Throwable -> L59
            if (r8 == 0) goto Lc8
            boolean r8 = r7.m11337G()     // Catch: java.lang.Throwable -> L59
            if (r8 == 0) goto Lc8
            r7.m11361t()     // Catch: java.lang.Throwable -> L59
        L153:
            o7.j r8 = r7.f19862c     // Catch: java.lang.Throwable -> L59
            m11327I(r8)     // Catch: java.lang.Throwable -> L59
            r8.m11273o()     // Catch: java.lang.Throwable -> L59
            o7.j r8 = r7.f19862c     // Catch: java.lang.Throwable -> L172
            m11327I(r8)     // Catch: java.lang.Throwable -> L172
            r8.m11269T()     // Catch: java.lang.Throwable -> L172
            r7.f19878s = r0
            r7.m11331A()
            return
        L169:
            o7.j r9 = r7.f19862c     // Catch: java.lang.Throwable -> L172
            m11327I(r9)     // Catch: java.lang.Throwable -> L172
            r9.m11269T()     // Catch: java.lang.Throwable -> L172
            throw r8     // Catch: java.lang.Throwable -> L172
        L172:
            r8 = move-exception
            r7.f19878s = r0
            r7.m11331A()
            throw r8
    }

    /* renamed from: m */
    public final void m11354m(p249o7.C5116u6 r24) {
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            o7.f4 r8 = r23.mo3160b()
            r8.mo3183i()
            r23.m11348g()
            java.lang.String r8 = "null reference"
            java.util.Objects.requireNonNull(r2, r8)
            java.lang.String r9 = r2.f20031Y
            com.google.android.gms.common.internal.C1101a.m3100e(r9)
            boolean r9 = r23.m11335E(r24)
            if (r9 == 0) goto L58a
            o7.j r9 = r1.f19862c
            m11327I(r9)
            java.lang.String r10 = r2.f20031Y
            o7.h4 r9 = r9.m11255F(r10)
            r10 = 0
            if (r9 == 0) goto L65
            java.lang.String r12 = r9.m11219S()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L65
            java.lang.String r12 = r2.f20032Z
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L65
            r9.m11229j(r10)
            o7.j r12 = r1.f19862c
            m11327I(r12)
            r12.m11274p(r9)
            o7.a4 r9 = r1.f19860a
            m11327I(r9)
            java.lang.String r12 = r2.f20031Y
            r9.mo3183i()
            java.util.Map<java.lang.String, k7.j2> r9 = r9.f19568g
            r9.remove(r12)
        L65:
            boolean r9 = r2.f20038f0
            if (r9 != 0) goto L6d
            r23.m11339J(r24)
            return
        L6d:
            long r12 = r2.f20043k0
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L80
            u6.c r9 = r23.mo3163e()
            u6.d r9 = (p353u6.C6341d) r9
            java.util.Objects.requireNonNull(r9)
            long r12 = java.lang.System.currentTimeMillis()
        L80:
            com.google.android.gms.measurement.internal.d r9 = r1.f19871l
            o7.l r9 = r9.m3171p()
            r9.mo3183i()
            r15 = 0
            r9.f19815f = r15
            r9.f19816g = r10
            int r9 = r2.f20044l0
            r14 = 1
            if (r9 == 0) goto Lab
            if (r9 == r14) goto Lab
            com.google.android.gms.measurement.internal.b r11 = r23.mo3162d()
            o7.f3 r11 = r11.f5675i
            java.lang.String r15 = r2.f20031Y
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C1111b.m3134u(r15)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = "Incorrect app type, assuming installed app. appId, appType"
            r11.m11171e(r10, r15, r9)
            r9 = 0
        Lab:
            o7.j r10 = r1.f19862c
            m11327I(r10)
            r10.m11267R()
            o7.j r10 = r1.f19862c     // Catch: java.lang.Throwable -> L580
            m11327I(r10)     // Catch: java.lang.Throwable -> L580
            java.lang.String r11 = r2.f20031Y     // Catch: java.lang.Throwable -> L580
            java.lang.String r15 = "_npa"
            o7.r6 r10 = r10.m11260K(r11, r15)     // Catch: java.lang.Throwable -> L580
            if (r10 == 0) goto Ld0
            java.lang.String r11 = "auto"
            java.lang.String r14 = r10.f19981b     // Catch: java.lang.Throwable -> L580
            boolean r11 = r11.equals(r14)     // Catch: java.lang.Throwable -> L580
            if (r11 == 0) goto Lcd
            goto Ld0
        Lcd:
            r22 = r3
            goto L11f
        Ld0:
            java.lang.Boolean r11 = r2.f20048p0     // Catch: java.lang.Throwable -> L580
            if (r11 == 0) goto L10a
            o7.p6 r15 = new o7.p6     // Catch: java.lang.Throwable -> L580
            java.lang.String r20 = "_npa"
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L580
            r14 = 1
            if (r14 == r11) goto Le2
            r21 = 0
            goto Le4
        Le2:
            r21 = 1
        Le4:
            java.lang.Long r11 = java.lang.Long.valueOf(r21)     // Catch: java.lang.Throwable -> L580
            java.lang.String r21 = "auto"
            r22 = r3
            r3 = 1
            r14 = r15
            r3 = r15
            r15 = r20
            r16 = r12
            r18 = r11
            r19 = r21
            r14.<init>(r15, r16, r18, r19)     // Catch: java.lang.Throwable -> L580
            if (r10 == 0) goto L106
            java.lang.Object r10 = r10.f19984e     // Catch: java.lang.Throwable -> L580
            java.lang.Long r11 = r3.f19947b0     // Catch: java.lang.Throwable -> L580
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Throwable -> L580
            if (r10 != 0) goto L11f
        L106:
            r1.m11360s(r3, r2)     // Catch: java.lang.Throwable -> L580
            goto L11f
        L10a:
            r22 = r3
            if (r10 == 0) goto L11f
            o7.p6 r3 = new o7.p6     // Catch: java.lang.Throwable -> L580
            java.lang.String r15 = "_npa"
            r18 = 0
            java.lang.String r19 = "auto"
            r14 = r3
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch: java.lang.Throwable -> L580
            r1.m11356o(r3, r2)     // Catch: java.lang.Throwable -> L580
        L11f:
            o7.j r3 = r1.f19862c     // Catch: java.lang.Throwable -> L580
            m11327I(r3)     // Catch: java.lang.Throwable -> L580
            java.lang.String r10 = r2.f20031Y     // Catch: java.lang.Throwable -> L580
            java.util.Objects.requireNonNull(r10, r8)     // Catch: java.lang.Throwable -> L580
            o7.h4 r15 = r3.m11255F(r10)     // Catch: java.lang.Throwable -> L580
            if (r15 == 0) goto L1e3
            com.google.android.gms.measurement.internal.f r3 = r23.m11345Q()     // Catch: java.lang.Throwable -> L580
            java.lang.String r10 = r2.f20032Z     // Catch: java.lang.Throwable -> L580
            java.lang.String r11 = r15.m11219S()     // Catch: java.lang.Throwable -> L580
            java.lang.String r14 = r2.f20047o0     // Catch: java.lang.Throwable -> L580
            r20 = r4
            java.lang.String r4 = r15.m11211K()     // Catch: java.lang.Throwable -> L580
            boolean r3 = r3.m3217a0(r10, r11, r14, r4)     // Catch: java.lang.Throwable -> L580
            if (r3 == 0) goto L1e5
            com.google.android.gms.measurement.internal.b r3 = r23.mo3162d()     // Catch: java.lang.Throwable -> L580
            o7.f3 r3 = r3.f5675i     // Catch: java.lang.Throwable -> L580
            java.lang.String r4 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r10 = r15.m11213M()     // Catch: java.lang.Throwable -> L580
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C1111b.m3134u(r10)     // Catch: java.lang.Throwable -> L580
            r3.m11170d(r4, r10)     // Catch: java.lang.Throwable -> L580
            o7.j r3 = r1.f19862c     // Catch: java.lang.Throwable -> L580
            m11327I(r3)     // Catch: java.lang.Throwable -> L580
            java.lang.String r4 = r15.m11213M()     // Catch: java.lang.Throwable -> L580
            r3.m11247j()     // Catch: java.lang.Throwable -> L580
            r3.mo3183i()     // Catch: java.lang.Throwable -> L580
            com.google.android.gms.common.internal.C1101a.m3100e(r4)     // Catch: java.lang.Throwable -> L580
            android.database.sqlite.SQLiteDatabase r10 = r3.m11253D()     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            r11 = 1
            java.lang.String[] r14 = new java.lang.String[r11]     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            r11 = 0
            r14[r11] = r4     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            java.lang.String r11 = "events"
            int r11 = r10.delete(r11, r0, r14)     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            java.lang.String r15 = "user_attributes"
            int r15 = r10.delete(r15, r0, r14)     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            int r11 = r11 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r10.delete(r15, r0, r14)     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            int r11 = r11 + r15
            java.lang.String r15 = "apps"
            int r15 = r10.delete(r15, r0, r14)     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            int r11 = r11 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r10.delete(r15, r0, r14)     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            int r11 = r11 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r10.delete(r15, r0, r14)     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            int r11 = r11 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r10.delete(r15, r0, r14)     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            int r11 = r11 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r10.delete(r15, r0, r14)     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            int r11 = r11 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r10.delete(r15, r0, r14)     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            int r11 = r11 + r15
            java.lang.String r15 = "consent_settings"
            int r0 = r10.delete(r15, r0, r14)     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            int r11 = r11 + r0
            if (r11 <= 0) goto L1e1
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            o7.f3 r0 = r0.f5680n     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            java.lang.String r10 = "Deleted application data. app, records"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            r0.m11171e(r10, r4, r11)     // Catch: android.database.sqlite.SQLiteException -> L1cf java.lang.Throwable -> L580
            goto L1e1
        L1cf:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a     // Catch: java.lang.Throwable -> L580
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()     // Catch: java.lang.Throwable -> L580
            o7.f3 r3 = r3.f5672f     // Catch: java.lang.Throwable -> L580
            java.lang.String r10 = "Error deleting application data. appId, error"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r4)     // Catch: java.lang.Throwable -> L580
            r3.m11171e(r10, r4, r0)     // Catch: java.lang.Throwable -> L580
        L1e1:
            r15 = 0
            goto L1e5
        L1e3:
            r20 = r4
        L1e5:
            if (r15 == 0) goto L23e
            long r3 = r15.m11202B()     // Catch: java.lang.Throwable -> L580
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L1fe
            long r3 = r15.m11202B()     // Catch: java.lang.Throwable -> L580
            long r10 = r2.f20040h0     // Catch: java.lang.Throwable -> L580
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L1fe
            r14 = 1
            goto L1ff
        L1fe:
            r14 = 0
        L1ff:
            java.lang.String r0 = r15.m11216P()     // Catch: java.lang.Throwable -> L580
            long r3 = r15.m11202B()     // Catch: java.lang.Throwable -> L580
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r15 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r15 != 0) goto L21a
            if (r0 == 0) goto L21a
            java.lang.String r3 = r2.f20033a0     // Catch: java.lang.Throwable -> L580
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Throwable -> L580
            if (r3 != 0) goto L21a
            r3 = 1
            goto L21b
        L21a:
            r3 = 0
        L21b:
            r3 = r3 | r14
            if (r3 == 0) goto L23e
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Throwable -> L580
            r3.<init>()     // Catch: java.lang.Throwable -> L580
            java.lang.String r4 = "_pv"
            r3.putString(r4, r0)     // Catch: java.lang.Throwable -> L580
            o7.q r0 = new o7.q     // Catch: java.lang.Throwable -> L580
            o7.o r4 = new o7.o     // Catch: java.lang.Throwable -> L580
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L580
            java.lang.String r15 = "_au"
            java.lang.String r17 = "auto"
            r14 = r0
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L580
            r1.m11350i(r0, r2)     // Catch: java.lang.Throwable -> L580
        L23e:
            r23.m11339J(r24)     // Catch: java.lang.Throwable -> L580
            if (r9 != 0) goto L252
            o7.j r0 = r1.f19862c     // Catch: java.lang.Throwable -> L580
            m11327I(r0)     // Catch: java.lang.Throwable -> L580
            java.lang.String r3 = r2.f20031Y     // Catch: java.lang.Throwable -> L580
            java.lang.String r4 = "_f"
            o7.n r0 = r0.m11259J(r3, r4)     // Catch: java.lang.Throwable -> L580
            r14 = 0
            goto L260
        L252:
            o7.j r0 = r1.f19862c     // Catch: java.lang.Throwable -> L580
            m11327I(r0)     // Catch: java.lang.Throwable -> L580
            java.lang.String r3 = r2.f20031Y     // Catch: java.lang.Throwable -> L580
            java.lang.String r4 = "_v"
            o7.n r0 = r0.m11259J(r3, r4)     // Catch: java.lang.Throwable -> L580
            r14 = 1
        L260:
            if (r0 != 0) goto L552
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r9 = r12 / r3
            r11 = r6
            r21 = r7
            r6 = 1
            long r9 = r9 + r6
            long r9 = r9 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_r"
            java.lang.String r15 = "_c"
            java.lang.String r6 = "_et"
            if (r14 != 0) goto L4d3
            o7.p6 r0 = new o7.p6     // Catch: java.lang.Throwable -> L580
            java.lang.String r7 = "_fot"
            java.lang.Long r18 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L580
            java.lang.String r19 = "auto"
            r14 = r0
            r9 = r15
            r15 = r7
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch: java.lang.Throwable -> L580
            r1.m11360s(r0, r2)     // Catch: java.lang.Throwable -> L580
            o7.f4 r0 = r23.mo3160b()     // Catch: java.lang.Throwable -> L580
            r0.mo3183i()     // Catch: java.lang.Throwable -> L580
            o7.u3 r7 = r1.f19870k     // Catch: java.lang.Throwable -> L580
            java.util.Objects.requireNonNull(r7, r8)     // Catch: java.lang.Throwable -> L580
            java.lang.String r0 = r2.f20031Y     // Catch: java.lang.Throwable -> L580
            if (r0 == 0) goto L37d
            boolean r10 = r0.isEmpty()     // Catch: java.lang.Throwable -> L580
            if (r10 == 0) goto L2a6
            goto L37d
        L2a6:
            com.google.android.gms.measurement.internal.d r10 = r7.f20024a     // Catch: java.lang.Throwable -> L580
            o7.f4 r10 = r10.mo3160b()     // Catch: java.lang.Throwable -> L580
            r10.mo3183i()     // Catch: java.lang.Throwable -> L580
            boolean r10 = r7.m11422a()     // Catch: java.lang.Throwable -> L580
            if (r10 != 0) goto L2c4
            com.google.android.gms.measurement.internal.d r0 = r7.f20024a     // Catch: java.lang.Throwable -> L580
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L580
            o7.f3 r0 = r0.f5678l     // Catch: java.lang.Throwable -> L580
            java.lang.String r5 = "Install Referrer Reporter is not available"
        L2bf:
            r0.m11169c(r5)     // Catch: java.lang.Throwable -> L580
            goto L389
        L2c4:
            o7.t3 r10 = new o7.t3     // Catch: java.lang.Throwable -> L580
            r10.<init>(r7, r0)     // Catch: java.lang.Throwable -> L580
            com.google.android.gms.measurement.internal.d r0 = r7.f20024a     // Catch: java.lang.Throwable -> L580
            o7.f4 r0 = r0.mo3160b()     // Catch: java.lang.Throwable -> L580
            r0.mo3183i()     // Catch: java.lang.Throwable -> L580
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L580
            java.lang.String r14 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r14)     // Catch: java.lang.Throwable -> L580
            android.content.ComponentName r14 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L580
            java.lang.String r15 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r14.<init>(r5, r15)     // Catch: java.lang.Throwable -> L580
            r0.setComponent(r14)     // Catch: java.lang.Throwable -> L580
            com.google.android.gms.measurement.internal.d r14 = r7.f20024a     // Catch: java.lang.Throwable -> L580
            android.content.Context r14 = r14.f5710a     // Catch: java.lang.Throwable -> L580
            android.content.pm.PackageManager r14 = r14.getPackageManager()     // Catch: java.lang.Throwable -> L580
            if (r14 != 0) goto L2f8
            com.google.android.gms.measurement.internal.d r0 = r7.f20024a     // Catch: java.lang.Throwable -> L580
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L580
            o7.f3 r0 = r0.f5676j     // Catch: java.lang.Throwable -> L580
            java.lang.String r5 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            goto L2bf
        L2f8:
            r15 = 0
            java.util.List r14 = r14.queryIntentServices(r0, r15)     // Catch: java.lang.Throwable -> L580
            if (r14 == 0) goto L371
            boolean r16 = r14.isEmpty()     // Catch: java.lang.Throwable -> L580
            if (r16 != 0) goto L371
            java.lang.Object r14 = r14.get(r15)     // Catch: java.lang.Throwable -> L580
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14     // Catch: java.lang.Throwable -> L580
            android.content.pm.ServiceInfo r14 = r14.serviceInfo     // Catch: java.lang.Throwable -> L580
            if (r14 == 0) goto L389
            java.lang.String r15 = r14.packageName     // Catch: java.lang.Throwable -> L580
            java.lang.String r14 = r14.name     // Catch: java.lang.Throwable -> L580
            if (r14 == 0) goto L365
            boolean r5 = r5.equals(r15)     // Catch: java.lang.Throwable -> L580
            if (r5 == 0) goto L365
            boolean r5 = r7.m11422a()     // Catch: java.lang.Throwable -> L580
            if (r5 == 0) goto L365
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L580
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L580
            t6.a r0 = p338t6.C6181a.m12748b()     // Catch: java.lang.RuntimeException -> L350 java.lang.Throwable -> L580
            com.google.android.gms.measurement.internal.d r14 = r7.f20024a     // Catch: java.lang.RuntimeException -> L350 java.lang.Throwable -> L580
            android.content.Context r14 = r14.f5710a     // Catch: java.lang.RuntimeException -> L350 java.lang.Throwable -> L580
            r15 = 1
            boolean r0 = r0.m12749a(r14, r5, r10, r15)     // Catch: java.lang.RuntimeException -> L350 java.lang.Throwable -> L580
            com.google.android.gms.measurement.internal.d r5 = r7.f20024a     // Catch: java.lang.RuntimeException -> L350 java.lang.Throwable -> L580
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: java.lang.RuntimeException -> L350 java.lang.Throwable -> L580
            o7.f3 r5 = r5.m3141r()     // Catch: java.lang.RuntimeException -> L350 java.lang.Throwable -> L580
            java.lang.String r10 = "Install Referrer Service is"
            java.lang.String r14 = "available"
            java.lang.String r15 = "not available"
            r16 = r14
            r14 = 1
            if (r14 == r0) goto L34a
            r14 = r15
            goto L34c
        L34a:
            r14 = r16
        L34c:
            r5.m11170d(r10, r14)     // Catch: java.lang.RuntimeException -> L350 java.lang.Throwable -> L580
            goto L389
        L350:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r5 = r7.f20024a     // Catch: java.lang.Throwable -> L580
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: java.lang.Throwable -> L580
            o7.f3 r5 = r5.m3140q()     // Catch: java.lang.Throwable -> L580
            java.lang.String r7 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L580
            r5.m11170d(r7, r0)     // Catch: java.lang.Throwable -> L580
            goto L389
        L365:
            com.google.android.gms.measurement.internal.d r0 = r7.f20024a     // Catch: java.lang.Throwable -> L580
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L580
            o7.f3 r0 = r0.f5675i     // Catch: java.lang.Throwable -> L580
            java.lang.String r5 = "Play Store version 8.3.73 or higher required for Install Referrer"
            goto L2bf
        L371:
            com.google.android.gms.measurement.internal.d r0 = r7.f20024a     // Catch: java.lang.Throwable -> L580
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L580
            o7.f3 r0 = r0.f5678l     // Catch: java.lang.Throwable -> L580
            java.lang.String r5 = "Play Service for fetching Install Referrer is unavailable on device"
            goto L2bf
        L37d:
            com.google.android.gms.measurement.internal.d r0 = r7.f20024a     // Catch: java.lang.Throwable -> L580
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: java.lang.Throwable -> L580
            o7.f3 r0 = r0.f5676j     // Catch: java.lang.Throwable -> L580
            java.lang.String r5 = "Install Referrer Reporter was called with invalid app package name"
            goto L2bf
        L389:
            o7.f4 r0 = r23.mo3160b()     // Catch: java.lang.Throwable -> L580
            r0.mo3183i()     // Catch: java.lang.Throwable -> L580
            r23.m11348g()     // Catch: java.lang.Throwable -> L580
            android.os.Bundle r5 = new android.os.Bundle     // Catch: java.lang.Throwable -> L580
            r5.<init>()     // Catch: java.lang.Throwable -> L580
            r14 = 1
            r5.putLong(r9, r14)     // Catch: java.lang.Throwable -> L580
            r5.putLong(r4, r14)     // Catch: java.lang.Throwable -> L580
            r4 = r21
            r9 = 0
            r5.putLong(r4, r9)     // Catch: java.lang.Throwable -> L580
            r5.putLong(r11, r9)     // Catch: java.lang.Throwable -> L580
            r7 = r20
            r5.putLong(r7, r9)     // Catch: java.lang.Throwable -> L580
            r15 = r22
            r5.putLong(r15, r9)     // Catch: java.lang.Throwable -> L580
            r9 = 1
            r5.putLong(r6, r9)     // Catch: java.lang.Throwable -> L580
            boolean r0 = r2.f20046n0     // Catch: java.lang.Throwable -> L580
            if (r0 == 0) goto L3c0
            r5.putLong(r3, r9)     // Catch: java.lang.Throwable -> L580
        L3c0:
            java.lang.String r3 = r2.f20031Y     // Catch: java.lang.Throwable -> L580
            java.util.Objects.requireNonNull(r3, r8)     // Catch: java.lang.Throwable -> L580
            o7.j r0 = r1.f19862c     // Catch: java.lang.Throwable -> L580
            m11327I(r0)     // Catch: java.lang.Throwable -> L580
            com.google.android.gms.common.internal.C1101a.m3100e(r3)     // Catch: java.lang.Throwable -> L580
            r0.mo3183i()     // Catch: java.lang.Throwable -> L580
            r0.m11247j()     // Catch: java.lang.Throwable -> L580
            java.lang.String r8 = "first_open_count"
            long r8 = r0.m11251B(r3, r8)     // Catch: java.lang.Throwable -> L580
            com.google.android.gms.measurement.internal.d r0 = r1.f19871l     // Catch: java.lang.Throwable -> L580
            android.content.Context r0 = r0.f5710a     // Catch: java.lang.Throwable -> L580
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L580
            if (r0 != 0) goto L3f8
            com.google.android.gms.measurement.internal.b r0 = r23.mo3162d()     // Catch: java.lang.Throwable -> L580
            o7.f3 r0 = r0.f5672f     // Catch: java.lang.Throwable -> L580
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1111b.m3134u(r3)     // Catch: java.lang.Throwable -> L580
            r0.m11170d(r4, r3)     // Catch: java.lang.Throwable -> L580
            r20 = r11
        L3f4:
            r3 = 0
            goto L4b3
        L3f8:
            com.google.android.gms.measurement.internal.d r0 = r1.f19871l     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40f java.lang.Throwable -> L580
            android.content.Context r0 = r0.f5710a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40f java.lang.Throwable -> L580
            w6.b r0 = p388w6.C6816c.m13887a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40f java.lang.Throwable -> L580
            android.content.Context r0 = r0.f26525a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40f java.lang.Throwable -> L580
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40f java.lang.Throwable -> L580
            r10 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40f java.lang.Throwable -> L580
            r22 = r15
            r15 = r0
            goto L422
        L40f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.b r10 = r23.mo3162d()     // Catch: java.lang.Throwable -> L580
            o7.f3 r10 = r10.f5672f     // Catch: java.lang.Throwable -> L580
            java.lang.String r14 = "Package info is null, first open report might be inaccurate. appId"
            r22 = r15
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C1111b.m3134u(r3)     // Catch: java.lang.Throwable -> L580
            r10.m11171e(r14, r15, r0)     // Catch: java.lang.Throwable -> L580
            r15 = 0
        L422:
            if (r15 == 0) goto L471
            r20 = r11
            long r10 = r15.firstInstallTime     // Catch: java.lang.Throwable -> L580
            r16 = 0
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 == 0) goto L473
            long r14 = r15.lastUpdateTime     // Catch: java.lang.Throwable -> L580
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 == 0) goto L451
            o7.f r0 = r23.m11340K()     // Catch: java.lang.Throwable -> L580
            o7.u2<java.lang.Boolean> r10 = p249o7.C5120v2.f20097h0     // Catch: java.lang.Throwable -> L580
            r11 = 0
            boolean r0 = r0.m11162v(r11, r10)     // Catch: java.lang.Throwable -> L580
            if (r0 == 0) goto L44e
            r14 = 0
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 != 0) goto L44c
            r14 = 1
        L449:
            r5.putLong(r4, r14)     // Catch: java.lang.Throwable -> L580
        L44c:
            r14 = 0
            goto L453
        L44e:
            r14 = 1
            goto L449
        L451:
            r11 = 0
            r14 = 1
        L453:
            o7.p6 r0 = new o7.p6     // Catch: java.lang.Throwable -> L580
            java.lang.String r15 = "_fi"
            r4 = 1
            if (r4 == r14) goto L45d
            r16 = 0
            goto L45f
        L45d:
            r16 = 1
        L45f:
            java.lang.Long r18 = java.lang.Long.valueOf(r16)     // Catch: java.lang.Throwable -> L580
            java.lang.String r19 = "auto"
            r14 = r0
            r4 = r22
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch: java.lang.Throwable -> L580
            r1.m11360s(r0, r2)     // Catch: java.lang.Throwable -> L580
            goto L476
        L471:
            r20 = r11
        L473:
            r4 = r22
            r11 = 0
        L476:
            com.google.android.gms.measurement.internal.d r0 = r1.f19871l     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L486 java.lang.Throwable -> L580
            android.content.Context r0 = r0.mo3161c()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L486 java.lang.Throwable -> L580
            w6.b r0 = p388w6.C6816c.m13887a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L486 java.lang.Throwable -> L580
            r10 = 0
            android.content.pm.ApplicationInfo r15 = r0.m13884a(r3, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L486 java.lang.Throwable -> L580
            goto L499
        L486:
            r0 = move-exception
            com.google.android.gms.measurement.internal.b r10 = r23.mo3162d()     // Catch: java.lang.Throwable -> L580
            o7.f3 r10 = r10.m3140q()     // Catch: java.lang.Throwable -> L580
            java.lang.String r14 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1111b.m3134u(r3)     // Catch: java.lang.Throwable -> L580
            r10.m11171e(r14, r3, r0)     // Catch: java.lang.Throwable -> L580
            r15 = r11
        L499:
            if (r15 == 0) goto L3f4
            int r0 = r15.flags     // Catch: java.lang.Throwable -> L580
            r3 = 1
            r0 = r0 & r3
            if (r0 == 0) goto L4a6
            r10 = 1
            r5.putLong(r7, r10)     // Catch: java.lang.Throwable -> L580
        L4a6:
            int r0 = r15.flags     // Catch: java.lang.Throwable -> L580
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L3f4
            r10 = 1
            r5.putLong(r4, r10)     // Catch: java.lang.Throwable -> L580
            goto L3f4
        L4b3:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L4bc
            r3 = r20
            r5.putLong(r3, r8)     // Catch: java.lang.Throwable -> L580
        L4bc:
            o7.q r0 = new o7.q     // Catch: java.lang.Throwable -> L580
            o7.o r3 = new o7.o     // Catch: java.lang.Throwable -> L580
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L580
            java.lang.String r15 = "_f"
            java.lang.String r17 = "auto"
            r14 = r0
            r16 = r3
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L580
            r1.m11352k(r0, r2)     // Catch: java.lang.Throwable -> L580
            goto L51e
        L4d3:
            r5 = r15
            o7.p6 r0 = new o7.p6     // Catch: java.lang.Throwable -> L580
            java.lang.String r15 = "_fvt"
            java.lang.Long r18 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L580
            java.lang.String r19 = "auto"
            r14 = r0
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch: java.lang.Throwable -> L580
            r1.m11360s(r0, r2)     // Catch: java.lang.Throwable -> L580
            o7.f4 r0 = r23.mo3160b()     // Catch: java.lang.Throwable -> L580
            r0.mo3183i()     // Catch: java.lang.Throwable -> L580
            r23.m11348g()     // Catch: java.lang.Throwable -> L580
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L580
            r0.<init>()     // Catch: java.lang.Throwable -> L580
            r7 = 1
            r0.putLong(r5, r7)     // Catch: java.lang.Throwable -> L580
            r0.putLong(r4, r7)     // Catch: java.lang.Throwable -> L580
            r0.putLong(r6, r7)     // Catch: java.lang.Throwable -> L580
            boolean r4 = r2.f20046n0     // Catch: java.lang.Throwable -> L580
            if (r4 == 0) goto L508
            r0.putLong(r3, r7)     // Catch: java.lang.Throwable -> L580
        L508:
            o7.q r3 = new o7.q     // Catch: java.lang.Throwable -> L580
            o7.o r4 = new o7.o     // Catch: java.lang.Throwable -> L580
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L580
            java.lang.String r15 = "_v"
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L580
            r1.m11352k(r3, r2)     // Catch: java.lang.Throwable -> L580
        L51e:
            o7.f r0 = r23.m11340K()     // Catch: java.lang.Throwable -> L580
            java.lang.String r3 = r2.f20031Y     // Catch: java.lang.Throwable -> L580
            o7.u2<java.lang.Boolean> r4 = p249o7.C5120v2.f20076U     // Catch: java.lang.Throwable -> L580
            boolean r0 = r0.m11162v(r3, r4)     // Catch: java.lang.Throwable -> L580
            if (r0 != 0) goto L56f
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L580
            r0.<init>()     // Catch: java.lang.Throwable -> L580
            r3 = 1
            r0.putLong(r6, r3)     // Catch: java.lang.Throwable -> L580
            java.lang.String r5 = "_fr"
            r0.putLong(r5, r3)     // Catch: java.lang.Throwable -> L580
            o7.q r3 = new o7.q     // Catch: java.lang.Throwable -> L580
            java.lang.String r15 = "_e"
            o7.o r4 = new o7.o     // Catch: java.lang.Throwable -> L580
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L580
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L580
        L54e:
            r1.m11352k(r3, r2)     // Catch: java.lang.Throwable -> L580
            goto L56f
        L552:
            boolean r0 = r2.f20039g0     // Catch: java.lang.Throwable -> L580
            if (r0 == 0) goto L56f
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L580
            r0.<init>()     // Catch: java.lang.Throwable -> L580
            o7.q r3 = new o7.q     // Catch: java.lang.Throwable -> L580
            o7.o r4 = new o7.o     // Catch: java.lang.Throwable -> L580
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L580
            java.lang.String r15 = "_cd"
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L580
            goto L54e
        L56f:
            o7.j r0 = r1.f19862c     // Catch: java.lang.Throwable -> L580
            m11327I(r0)     // Catch: java.lang.Throwable -> L580
            r0.m11273o()     // Catch: java.lang.Throwable -> L580
            o7.j r0 = r1.f19862c
            m11327I(r0)
            r0.m11269T()
            return
        L580:
            r0 = move-exception
            o7.j r2 = r1.f19862c
            m11327I(r2)
            r2.m11269T()
            throw r0
        L58a:
            return
    }

    /* renamed from: n */
    public final void m11355n(p249o7.C4957b r12, p249o7.C5116u6 r13) {
            r11 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r12, r0)
            java.lang.String r1 = r12.f19587Y
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            o7.p6 r1 = r12.f19589a0
            java.util.Objects.requireNonNull(r1, r0)
            o7.p6 r1 = r12.f19589a0
            java.lang.String r1 = r1.f19945Z
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            o7.f4 r1 = r11.mo3160b()
            r1.mo3183i()
            r11.m11348g()
            boolean r1 = r11.m11335E(r13)
            if (r1 != 0) goto L27
            return
        L27:
            boolean r1 = r13.f20038f0
            if (r1 == 0) goto Le4
            o7.j r1 = r11.f19862c
            m11327I(r1)
            r1.m11267R()
            r11.m11339J(r13)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r3 = r12.f19587Y     // Catch: java.lang.Throwable -> Lda
            java.util.Objects.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> Lda
            o7.j r1 = r11.f19862c     // Catch: java.lang.Throwable -> Lda
            m11327I(r1)     // Catch: java.lang.Throwable -> Lda
            o7.p6 r2 = r12.f19589a0     // Catch: java.lang.Throwable -> Lda
            java.lang.String r2 = r2.f19945Z     // Catch: java.lang.Throwable -> Lda
            o7.b r1 = r1.m11256G(r3, r2)     // Catch: java.lang.Throwable -> Lda
            if (r1 == 0) goto Lac
            com.google.android.gms.measurement.internal.b r2 = r11.mo3162d()     // Catch: java.lang.Throwable -> Lda
            o7.f3 r2 = r2.f5679m     // Catch: java.lang.Throwable -> Lda
            java.lang.String r4 = "Removing conditional user property"
            java.lang.String r5 = r12.f19587Y     // Catch: java.lang.Throwable -> Lda
            com.google.android.gms.measurement.internal.d r6 = r11.f19871l     // Catch: java.lang.Throwable -> Lda
            o7.c3 r6 = r6.f5722m     // Catch: java.lang.Throwable -> Lda
            o7.p6 r7 = r12.f19589a0     // Catch: java.lang.Throwable -> Lda
            java.lang.String r7 = r7.f19945Z     // Catch: java.lang.Throwable -> Lda
            java.lang.String r6 = r6.m11118f(r7)     // Catch: java.lang.Throwable -> Lda
            r2.m11171e(r4, r5, r6)     // Catch: java.lang.Throwable -> Lda
            o7.j r2 = r11.f19862c     // Catch: java.lang.Throwable -> Lda
            m11327I(r2)     // Catch: java.lang.Throwable -> Lda
            o7.p6 r4 = r12.f19589a0     // Catch: java.lang.Throwable -> Lda
            java.lang.String r4 = r4.f19945Z     // Catch: java.lang.Throwable -> Lda
            r2.m11282y(r3, r4)     // Catch: java.lang.Throwable -> Lda
            boolean r2 = r1.f19591c0     // Catch: java.lang.Throwable -> Lda
            if (r2 == 0) goto L7f
            o7.j r2 = r11.f19862c     // Catch: java.lang.Throwable -> Lda
            m11327I(r2)     // Catch: java.lang.Throwable -> Lda
            o7.p6 r4 = r12.f19589a0     // Catch: java.lang.Throwable -> Lda
            java.lang.String r4 = r4.f19945Z     // Catch: java.lang.Throwable -> Lda
            r2.m11272n(r3, r4)     // Catch: java.lang.Throwable -> Lda
        L7f:
            o7.q r2 = r12.f19597i0     // Catch: java.lang.Throwable -> Lda
            if (r2 == 0) goto Lc9
            o7.o r2 = r2.f19952Z     // Catch: java.lang.Throwable -> Lda
            if (r2 == 0) goto L8c
            android.os.Bundle r2 = r2.m11371X()     // Catch: java.lang.Throwable -> Lda
            goto L8d
        L8c:
            r2 = 0
        L8d:
            r5 = r2
            com.google.android.gms.measurement.internal.f r2 = r11.m11345Q()     // Catch: java.lang.Throwable -> Lda
            o7.q r4 = r12.f19597i0     // Catch: java.lang.Throwable -> Lda
            java.util.Objects.requireNonNull(r4, r0)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r4 = r4.f19951Y     // Catch: java.lang.Throwable -> Lda
            java.lang.String r6 = r1.f19588Z     // Catch: java.lang.Throwable -> Lda
            o7.q r12 = r12.f19597i0     // Catch: java.lang.Throwable -> Lda
            long r7 = r12.f19954b0     // Catch: java.lang.Throwable -> Lda
            r9 = 1
            r10 = 1
            o7.q r12 = r2.m3236t0(r3, r4, r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> Lda
            java.util.Objects.requireNonNull(r12, r0)     // Catch: java.lang.Throwable -> Lda
            r11.m11362u(r12, r13)     // Catch: java.lang.Throwable -> Lda
            goto Lc9
        Lac:
            com.google.android.gms.measurement.internal.b r13 = r11.mo3162d()     // Catch: java.lang.Throwable -> Lda
            o7.f3 r13 = r13.f5675i     // Catch: java.lang.Throwable -> Lda
            java.lang.String r0 = "Conditional user property doesn't exist"
            java.lang.String r1 = r12.f19587Y     // Catch: java.lang.Throwable -> Lda
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C1111b.m3134u(r1)     // Catch: java.lang.Throwable -> Lda
            com.google.android.gms.measurement.internal.d r2 = r11.f19871l     // Catch: java.lang.Throwable -> Lda
            o7.c3 r2 = r2.f5722m     // Catch: java.lang.Throwable -> Lda
            o7.p6 r12 = r12.f19589a0     // Catch: java.lang.Throwable -> Lda
            java.lang.String r12 = r12.f19945Z     // Catch: java.lang.Throwable -> Lda
            java.lang.String r12 = r2.m11118f(r12)     // Catch: java.lang.Throwable -> Lda
            r13.m11171e(r0, r1, r12)     // Catch: java.lang.Throwable -> Lda
        Lc9:
            o7.j r12 = r11.f19862c     // Catch: java.lang.Throwable -> Lda
            m11327I(r12)     // Catch: java.lang.Throwable -> Lda
            r12.m11273o()     // Catch: java.lang.Throwable -> Lda
            o7.j r12 = r11.f19862c
            m11327I(r12)
            r12.m11269T()
            return
        Lda:
            r12 = move-exception
            o7.j r13 = r11.f19862c
            m11327I(r13)
            r13.m11269T()
            throw r12
        Le4:
            r11.m11339J(r13)
            return
    }

    /* renamed from: o */
    public final void m11356o(p249o7.C5076p6 r8, p249o7.C5116u6 r9) {
            r7 = this;
            o7.f4 r0 = r7.mo3160b()
            r0.mo3183i()
            r7.m11348g()
            boolean r0 = r7.m11335E(r9)
            if (r0 != 0) goto L11
            return
        L11:
            boolean r0 = r9.f20038f0
            if (r0 != 0) goto L19
            r7.m11339J(r9)
            return
        L19:
            java.lang.String r0 = r8.f19945Z
            java.lang.String r1 = "_npa"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.Boolean r0 = r9.f20048p0
            if (r0 == 0) goto L5f
            com.google.android.gms.measurement.internal.b r8 = r7.mo3162d()
            o7.f3 r8 = r8.f5679m
            java.lang.String r0 = "Falling back to manifest metadata value for ad personalization"
            r8.m11169c(r0)
            o7.p6 r8 = new o7.p6
            u6.c r0 = r7.mo3163e()
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r3 = java.lang.System.currentTimeMillis()
            r0 = 1
            java.lang.Boolean r1 = r9.f20048p0
            boolean r1 = r1.booleanValue()
            if (r0 == r1) goto L4d
            r0 = 0
            goto L4f
        L4d:
            r0 = 1
        L4f:
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            java.lang.String r2 = "_npa"
            java.lang.String r6 = "auto"
            r1 = r8
            r1.<init>(r2, r3, r5, r6)
            r7.m11360s(r8, r9)
            return
        L5f:
            com.google.android.gms.measurement.internal.b r0 = r7.mo3162d()
            o7.f3 r0 = r0.f5679m
            com.google.android.gms.measurement.internal.d r1 = r7.f19871l
            o7.c3 r1 = r1.f5722m
            java.lang.String r2 = r8.f19945Z
            java.lang.String r1 = r1.m11118f(r2)
            java.lang.String r2 = "Removing user property"
            r0.m11170d(r2, r1)
            o7.j r0 = r7.f19862c
            m11327I(r0)
            r0.m11267R()
            r7.m11339J(r9)     // Catch: java.lang.Throwable -> Lb6
            o7.j r0 = r7.f19862c     // Catch: java.lang.Throwable -> Lb6
            m11327I(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r9 = r9.f20031Y     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r9, r1)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r1 = r8.f19945Z     // Catch: java.lang.Throwable -> Lb6
            r0.m11272n(r9, r1)     // Catch: java.lang.Throwable -> Lb6
            o7.j r9 = r7.f19862c     // Catch: java.lang.Throwable -> Lb6
            m11327I(r9)     // Catch: java.lang.Throwable -> Lb6
            r9.m11273o()     // Catch: java.lang.Throwable -> Lb6
            com.google.android.gms.measurement.internal.b r9 = r7.mo3162d()     // Catch: java.lang.Throwable -> Lb6
            o7.f3 r9 = r9.f5679m     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = "User property removed"
            com.google.android.gms.measurement.internal.d r1 = r7.f19871l     // Catch: java.lang.Throwable -> Lb6
            o7.c3 r1 = r1.f5722m     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = r8.f19945Z     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = r1.m11118f(r8)     // Catch: java.lang.Throwable -> Lb6
            r9.m11170d(r0, r8)     // Catch: java.lang.Throwable -> Lb6
            o7.j r8 = r7.f19862c
            m11327I(r8)
            r8.m11269T()
            return
        Lb6:
            r8 = move-exception
            o7.j r9 = r7.f19862c
            m11327I(r9)
            r9.m11269T()
            throw r8
    }

    /* renamed from: p */
    public final void m11357p(p249o7.C5116u6 r8) {
            r7 = this;
            java.lang.String r0 = "app_id=?"
            java.util.List<java.lang.Long> r1 = r7.f19883x
            if (r1 == 0) goto L12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7.f19884y = r1
            java.util.List<java.lang.Long> r2 = r7.f19883x
            r1.addAll(r2)
        L12:
            o7.j r1 = r7.f19862c
            m11327I(r1)
            java.lang.String r2 = r8.f20031Y
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r2, r3)
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.mo3183i()
            r1.m11247j()
            android.database.sqlite.SQLiteDatabase r3 = r1.m11253D()     // Catch: android.database.sqlite.SQLiteException -> L8a
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: android.database.sqlite.SQLiteException -> L8a
            r5 = 0
            r4[r5] = r2     // Catch: android.database.sqlite.SQLiteException -> L8a
            java.lang.String r5 = "apps"
            int r5 = r3.delete(r5, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> L8a
            java.lang.String r6 = "events"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> L8a
            int r5 = r5 + r6
            java.lang.String r6 = "user_attributes"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> L8a
            int r5 = r5 + r6
            java.lang.String r6 = "conditional_properties"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> L8a
            int r5 = r5 + r6
            java.lang.String r6 = "raw_events"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> L8a
            int r5 = r5 + r6
            java.lang.String r6 = "raw_events_metadata"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> L8a
            int r5 = r5 + r6
            java.lang.String r6 = "queue"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> L8a
            int r5 = r5 + r6
            java.lang.String r6 = "audience_filter_values"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> L8a
            int r5 = r5 + r6
            java.lang.String r6 = "main_event_params"
            int r6 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> L8a
            int r5 = r5 + r6
            java.lang.String r6 = "default_event_params"
            int r0 = r3.delete(r6, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> L8a
            int r5 = r5 + r0
            if (r5 <= 0) goto L9c
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a     // Catch: android.database.sqlite.SQLiteException -> L8a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L8a
            o7.f3 r0 = r0.f5680n     // Catch: android.database.sqlite.SQLiteException -> L8a
            java.lang.String r3 = "Reset analytics data. app, records"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: android.database.sqlite.SQLiteException -> L8a
            r0.m11171e(r3, r2, r4)     // Catch: android.database.sqlite.SQLiteException -> L8a
            goto L9c
        L8a:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1111b.m3134u(r2)
            java.lang.String r3 = "Error resetting analytics data. appId, error"
            r1.m11171e(r3, r2, r0)
        L9c:
            boolean r0 = r8.f20038f0
            if (r0 == 0) goto La3
            r7.m11354m(r8)
        La3:
            return
    }

    /* renamed from: q */
    public final void m11358q(p249o7.C4957b r12, p249o7.C5116u6 r13) {
            r11 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r12, r0)
            java.lang.String r1 = r12.f19587Y
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            java.lang.String r1 = r12.f19588Z
            java.util.Objects.requireNonNull(r1, r0)
            o7.p6 r1 = r12.f19589a0
            java.util.Objects.requireNonNull(r1, r0)
            o7.p6 r1 = r12.f19589a0
            java.lang.String r1 = r1.f19945Z
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            o7.f4 r1 = r11.mo3160b()
            r1.mo3183i()
            r11.m11348g()
            boolean r1 = r11.m11335E(r13)
            if (r1 != 0) goto L2c
            return
        L2c:
            boolean r1 = r13.f20038f0
            if (r1 != 0) goto L34
            r11.m11339J(r13)
            return
        L34:
            o7.b r1 = new o7.b
            r1.<init>(r12)
            r12 = 0
            r1.f19591c0 = r12
            o7.j r2 = r11.f19862c
            m11327I(r2)
            r2.m11267R()
            o7.j r2 = r11.f19862c     // Catch: java.lang.Throwable -> L19f
            m11327I(r2)     // Catch: java.lang.Throwable -> L19f
            java.lang.String r3 = r1.f19587Y     // Catch: java.lang.Throwable -> L19f
            java.util.Objects.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L19f
            o7.p6 r4 = r1.f19589a0     // Catch: java.lang.Throwable -> L19f
            java.lang.String r4 = r4.f19945Z     // Catch: java.lang.Throwable -> L19f
            o7.b r2 = r2.m11256G(r3, r4)     // Catch: java.lang.Throwable -> L19f
            if (r2 == 0) goto L7d
            java.lang.String r3 = r2.f19588Z     // Catch: java.lang.Throwable -> L19f
            java.lang.String r4 = r1.f19588Z     // Catch: java.lang.Throwable -> L19f
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L19f
            if (r3 != 0) goto L7d
            com.google.android.gms.measurement.internal.b r3 = r11.mo3162d()     // Catch: java.lang.Throwable -> L19f
            o7.f3 r3 = r3.f5675i     // Catch: java.lang.Throwable -> L19f
            java.lang.String r4 = "Updating a conditional user property with different origin. name, origin, origin (from DB)"
            com.google.android.gms.measurement.internal.d r5 = r11.f19871l     // Catch: java.lang.Throwable -> L19f
            o7.c3 r5 = r5.f5722m     // Catch: java.lang.Throwable -> L19f
            o7.p6 r6 = r1.f19589a0     // Catch: java.lang.Throwable -> L19f
            java.lang.String r6 = r6.f19945Z     // Catch: java.lang.Throwable -> L19f
            java.lang.String r5 = r5.m11118f(r6)     // Catch: java.lang.Throwable -> L19f
            java.lang.String r6 = r1.f19588Z     // Catch: java.lang.Throwable -> L19f
            java.lang.String r7 = r2.f19588Z     // Catch: java.lang.Throwable -> L19f
            r3.m11172f(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L19f
        L7d:
            r3 = 1
            if (r2 == 0) goto Lb3
            boolean r4 = r2.f19591c0     // Catch: java.lang.Throwable -> L19f
            if (r4 == 0) goto Lb3
            java.lang.String r4 = r2.f19588Z     // Catch: java.lang.Throwable -> L19f
            r1.f19588Z = r4     // Catch: java.lang.Throwable -> L19f
            long r4 = r2.f19590b0     // Catch: java.lang.Throwable -> L19f
            r1.f19590b0 = r4     // Catch: java.lang.Throwable -> L19f
            long r4 = r2.f19594f0     // Catch: java.lang.Throwable -> L19f
            r1.f19594f0 = r4     // Catch: java.lang.Throwable -> L19f
            java.lang.String r4 = r2.f19592d0     // Catch: java.lang.Throwable -> L19f
            r1.f19592d0 = r4     // Catch: java.lang.Throwable -> L19f
            o7.q r4 = r2.f19595g0     // Catch: java.lang.Throwable -> L19f
            r1.f19595g0 = r4     // Catch: java.lang.Throwable -> L19f
            r1.f19591c0 = r3     // Catch: java.lang.Throwable -> L19f
            o7.p6 r3 = new o7.p6     // Catch: java.lang.Throwable -> L19f
            o7.p6 r4 = r1.f19589a0     // Catch: java.lang.Throwable -> L19f
            java.lang.String r6 = r4.f19945Z     // Catch: java.lang.Throwable -> L19f
            o7.p6 r5 = r2.f19589a0     // Catch: java.lang.Throwable -> L19f
            long r7 = r5.f19946a0     // Catch: java.lang.Throwable -> L19f
            java.lang.Object r9 = r4.m11412X()     // Catch: java.lang.Throwable -> L19f
            o7.p6 r2 = r2.f19589a0     // Catch: java.lang.Throwable -> L19f
            java.lang.String r10 = r2.f19949d0     // Catch: java.lang.Throwable -> L19f
            r5 = r3
            r5.<init>(r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L19f
            r1.f19589a0 = r3     // Catch: java.lang.Throwable -> L19f
            goto Ld4
        Lb3:
            java.lang.String r2 = r1.f19592d0     // Catch: java.lang.Throwable -> L19f
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L19f
            if (r2 == 0) goto Ld4
            o7.p6 r12 = new o7.p6     // Catch: java.lang.Throwable -> L19f
            o7.p6 r2 = r1.f19589a0     // Catch: java.lang.Throwable -> L19f
            java.lang.String r5 = r2.f19945Z     // Catch: java.lang.Throwable -> L19f
            long r6 = r1.f19590b0     // Catch: java.lang.Throwable -> L19f
            java.lang.Object r8 = r2.m11412X()     // Catch: java.lang.Throwable -> L19f
            o7.p6 r2 = r1.f19589a0     // Catch: java.lang.Throwable -> L19f
            java.lang.String r9 = r2.f19949d0     // Catch: java.lang.Throwable -> L19f
            r4 = r12
            r4.<init>(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L19f
            r1.f19589a0 = r12     // Catch: java.lang.Throwable -> L19f
            r1.f19591c0 = r3     // Catch: java.lang.Throwable -> L19f
            r12 = 1
        Ld4:
            boolean r2 = r1.f19591c0     // Catch: java.lang.Throwable -> L19f
            if (r2 == 0) goto L142
            o7.p6 r2 = r1.f19589a0     // Catch: java.lang.Throwable -> L19f
            o7.r6 r10 = new o7.r6     // Catch: java.lang.Throwable -> L19f
            java.lang.String r4 = r1.f19587Y     // Catch: java.lang.Throwable -> L19f
            java.util.Objects.requireNonNull(r4, r0)     // Catch: java.lang.Throwable -> L19f
            java.lang.String r5 = r1.f19588Z     // Catch: java.lang.Throwable -> L19f
            java.lang.String r6 = r2.f19945Z     // Catch: java.lang.Throwable -> L19f
            long r7 = r2.f19946a0     // Catch: java.lang.Throwable -> L19f
            java.lang.Object r9 = r2.m11412X()     // Catch: java.lang.Throwable -> L19f
            java.util.Objects.requireNonNull(r9, r0)     // Catch: java.lang.Throwable -> L19f
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L19f
            o7.j r0 = r11.f19862c     // Catch: java.lang.Throwable -> L19f
            m11327I(r0)     // Catch: java.lang.Throwable -> L19f
            boolean r0 = r0.m11280v(r10)     // Catch: java.lang.Throwable -> L19f
            if (r0 == 0) goto L117
            com.google.android.gms.measurement.internal.b r0 = r11.mo3162d()     // Catch: java.lang.Throwable -> L19f
            o7.f3 r0 = r0.f5679m     // Catch: java.lang.Throwable -> L19f
            java.lang.String r2 = "User property updated immediately"
            java.lang.String r3 = r1.f19587Y     // Catch: java.lang.Throwable -> L19f
            com.google.android.gms.measurement.internal.d r4 = r11.f19871l     // Catch: java.lang.Throwable -> L19f
            o7.c3 r4 = r4.f5722m     // Catch: java.lang.Throwable -> L19f
            java.lang.String r5 = r10.f19982c     // Catch: java.lang.Throwable -> L19f
            java.lang.String r4 = r4.m11118f(r5)     // Catch: java.lang.Throwable -> L19f
            java.lang.Object r5 = r10.f19984e     // Catch: java.lang.Throwable -> L19f
        L113:
            r0.m11172f(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L19f
            goto L132
        L117:
            com.google.android.gms.measurement.internal.b r0 = r11.mo3162d()     // Catch: java.lang.Throwable -> L19f
            o7.f3 r0 = r0.f5672f     // Catch: java.lang.Throwable -> L19f
            java.lang.String r2 = "(2)Too many active user properties, ignoring"
            java.lang.String r3 = r1.f19587Y     // Catch: java.lang.Throwable -> L19f
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1111b.m3134u(r3)     // Catch: java.lang.Throwable -> L19f
            com.google.android.gms.measurement.internal.d r4 = r11.f19871l     // Catch: java.lang.Throwable -> L19f
            o7.c3 r4 = r4.f5722m     // Catch: java.lang.Throwable -> L19f
            java.lang.String r5 = r10.f19982c     // Catch: java.lang.Throwable -> L19f
            java.lang.String r4 = r4.m11118f(r5)     // Catch: java.lang.Throwable -> L19f
            java.lang.Object r5 = r10.f19984e     // Catch: java.lang.Throwable -> L19f
            goto L113
        L132:
            if (r12 == 0) goto L142
            o7.q r12 = r1.f19595g0     // Catch: java.lang.Throwable -> L19f
            if (r12 == 0) goto L142
            o7.q r0 = new o7.q     // Catch: java.lang.Throwable -> L19f
            long r2 = r1.f19590b0     // Catch: java.lang.Throwable -> L19f
            r0.<init>(r12, r2)     // Catch: java.lang.Throwable -> L19f
            r11.m11362u(r0, r13)     // Catch: java.lang.Throwable -> L19f
        L142:
            o7.j r12 = r11.f19862c     // Catch: java.lang.Throwable -> L19f
            m11327I(r12)     // Catch: java.lang.Throwable -> L19f
            boolean r12 = r12.m11279u(r1)     // Catch: java.lang.Throwable -> L19f
            if (r12 == 0) goto L16d
            com.google.android.gms.measurement.internal.b r12 = r11.mo3162d()     // Catch: java.lang.Throwable -> L19f
            o7.f3 r12 = r12.f5679m     // Catch: java.lang.Throwable -> L19f
            java.lang.String r13 = "Conditional property added"
            java.lang.String r0 = r1.f19587Y     // Catch: java.lang.Throwable -> L19f
            com.google.android.gms.measurement.internal.d r2 = r11.f19871l     // Catch: java.lang.Throwable -> L19f
            o7.c3 r2 = r2.f5722m     // Catch: java.lang.Throwable -> L19f
            o7.p6 r3 = r1.f19589a0     // Catch: java.lang.Throwable -> L19f
            java.lang.String r3 = r3.f19945Z     // Catch: java.lang.Throwable -> L19f
            java.lang.String r2 = r2.m11118f(r3)     // Catch: java.lang.Throwable -> L19f
            o7.p6 r1 = r1.f19589a0     // Catch: java.lang.Throwable -> L19f
            java.lang.Object r1 = r1.m11412X()     // Catch: java.lang.Throwable -> L19f
        L169:
            r12.m11172f(r13, r0, r2, r1)     // Catch: java.lang.Throwable -> L19f
            goto L18e
        L16d:
            com.google.android.gms.measurement.internal.b r12 = r11.mo3162d()     // Catch: java.lang.Throwable -> L19f
            o7.f3 r12 = r12.f5672f     // Catch: java.lang.Throwable -> L19f
            java.lang.String r13 = "Too many conditional properties, ignoring"
            java.lang.String r0 = r1.f19587Y     // Catch: java.lang.Throwable -> L19f
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C1111b.m3134u(r0)     // Catch: java.lang.Throwable -> L19f
            com.google.android.gms.measurement.internal.d r2 = r11.f19871l     // Catch: java.lang.Throwable -> L19f
            o7.c3 r2 = r2.f5722m     // Catch: java.lang.Throwable -> L19f
            o7.p6 r3 = r1.f19589a0     // Catch: java.lang.Throwable -> L19f
            java.lang.String r3 = r3.f19945Z     // Catch: java.lang.Throwable -> L19f
            java.lang.String r2 = r2.m11118f(r3)     // Catch: java.lang.Throwable -> L19f
            o7.p6 r1 = r1.f19589a0     // Catch: java.lang.Throwable -> L19f
            java.lang.Object r1 = r1.m11412X()     // Catch: java.lang.Throwable -> L19f
            goto L169
        L18e:
            o7.j r12 = r11.f19862c     // Catch: java.lang.Throwable -> L19f
            m11327I(r12)     // Catch: java.lang.Throwable -> L19f
            r12.m11273o()     // Catch: java.lang.Throwable -> L19f
            o7.j r12 = r11.f19862c
            m11327I(r12)
            r12.m11269T()
            return
        L19f:
            r12 = move-exception
            o7.j r13 = r11.f19862c
            m11327I(r13)
            r13.m11269T()
            throw r12
    }

    /* renamed from: r */
    public final void m11359r(java.lang.String r6, p249o7.C4997g r7) {
            r5 = this;
            o7.f4 r0 = r5.mo3160b()
            r0.mo3183i()
            r5.m11348g()
            java.util.Map<java.lang.String, o7.g> r0 = r5.f19858A
            r0.put(r6, r7)
            o7.j r0 = r5.f19862c
            m11327I(r0)
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r6, r1)
            r0.mo3183i()
            r0.m11247j()
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r2 = "app_id"
            r1.put(r2, r6)
            java.lang.String r7 = r7.m11188e()
            java.lang.String r2 = "consent_state"
            r1.put(r2, r7)
            android.database.sqlite.SQLiteDatabase r7 = r0.m11253D()     // Catch: android.database.sqlite.SQLiteException -> L56
            java.lang.String r2 = "consent_settings"
            r3 = 0
            r4 = 5
            long r1 = r7.insertWithOnConflict(r2, r3, r1, r4)     // Catch: android.database.sqlite.SQLiteException -> L56
            r3 = -1
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L55
            com.google.android.gms.measurement.internal.d r7 = r0.f5736a     // Catch: android.database.sqlite.SQLiteException -> L56
            com.google.android.gms.measurement.internal.b r7 = r7.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L56
            o7.f3 r7 = r7.f5672f     // Catch: android.database.sqlite.SQLiteException -> L56
            java.lang.String r1 = "Failed to insert/update consent setting (got -1). appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1111b.m3134u(r6)     // Catch: android.database.sqlite.SQLiteException -> L56
            r7.m11170d(r1, r2)     // Catch: android.database.sqlite.SQLiteException -> L56
        L55:
            return
        L56:
            r7 = move-exception
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1111b.m3134u(r6)
            java.lang.String r1 = "Error storing consent setting. appId, error"
            r0.m11171e(r1, r6, r7)
            return
    }

    /* renamed from: s */
    public final void m11360s(p249o7.C5076p6 r14, p249o7.C5116u6 r15) {
            r13 = this;
            o7.f4 r0 = r13.mo3160b()
            r0.mo3183i()
            r13.m11348g()
            boolean r0 = r13.m11335E(r15)
            if (r0 != 0) goto L11
            return
        L11:
            boolean r0 = r15.f20038f0
            if (r0 != 0) goto L19
            r13.m11339J(r15)
            return
        L19:
            com.google.android.gms.measurement.internal.f r0 = r13.m11345Q()
            java.lang.String r1 = r14.f19945Z
            int r5 = r0.m3225l0(r1)
            r0 = 1
            r1 = 24
            r2 = 0
            com.google.android.gms.measurement.internal.f r3 = r13.m11345Q()
            java.lang.String r4 = r14.f19945Z
            if (r5 == 0) goto L4f
            r13.m11340K()
            java.lang.String r7 = r3.m3232r(r4, r1, r0)
            java.lang.String r14 = r14.f19945Z
            if (r14 == 0) goto L40
            int r14 = r14.length()
            r8 = r14
            goto L41
        L40:
            r8 = 0
        L41:
            com.google.android.gms.measurement.internal.f r2 = r13.m11345Q()
            o7.s6 r3 = r13.f19859B
            java.lang.String r4 = r15.f20031Y
            java.lang.String r6 = "_ev"
            r2.m3196A(r3, r4, r5, r6, r7, r8)
            return
        L4f:
            java.lang.Object r5 = r14.m11412X()
            int r9 = r3.m3221h0(r4, r5)
            if (r9 == 0) goto L8d
            com.google.android.gms.measurement.internal.f r3 = r13.m11345Q()
            java.lang.String r4 = r14.f19945Z
            r13.m11340K()
            java.lang.String r11 = r3.m3232r(r4, r1, r0)
            java.lang.Object r14 = r14.m11412X()
            if (r14 == 0) goto L7e
            boolean r0 = r14 instanceof java.lang.String
            if (r0 != 0) goto L74
            boolean r0 = r14 instanceof java.lang.CharSequence
            if (r0 == 0) goto L7e
        L74:
            java.lang.String r14 = java.lang.String.valueOf(r14)
            int r2 = r14.length()
            r12 = r2
            goto L7f
        L7e:
            r12 = 0
        L7f:
            com.google.android.gms.measurement.internal.f r6 = r13.m11345Q()
            o7.s6 r7 = r13.f19859B
            java.lang.String r8 = r15.f20031Y
            java.lang.String r10 = "_ev"
            r6.m3196A(r7, r8, r9, r10, r11, r12)
            return
        L8d:
            com.google.android.gms.measurement.internal.f r0 = r13.m11345Q()
            java.lang.String r1 = r14.f19945Z
            java.lang.Object r2 = r14.m11412X()
            java.lang.Object r0 = r0.m3230q(r1, r2)
            if (r0 != 0) goto L9e
            return
        L9e:
            java.lang.String r1 = r14.f19945Z
            java.lang.String r2 = "_sid"
            boolean r1 = r2.equals(r1)
            java.lang.String r2 = "null reference"
            if (r1 == 0) goto L10f
            long r5 = r14.f19946a0
            java.lang.String r8 = r14.f19949d0
            java.lang.String r1 = r15.f20031Y
            java.util.Objects.requireNonNull(r1, r2)
            o7.j r3 = r13.f19862c
            m11327I(r3)
            java.lang.String r4 = "_sno"
            o7.r6 r3 = r3.m11260K(r1, r4)
            if (r3 == 0) goto Lcd
            java.lang.Object r4 = r3.f19984e
            boolean r7 = r4 instanceof java.lang.Long
            if (r7 == 0) goto Lcd
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            goto Lfd
        Lcd:
            if (r3 == 0) goto Ldc
            com.google.android.gms.measurement.internal.b r4 = r13.mo3162d()
            o7.f3 r4 = r4.f5675i
            java.lang.Object r3 = r3.f19984e
            java.lang.String r7 = "Retrieved last session number from database does not contain a valid (long) value"
            r4.m11170d(r7, r3)
        Ldc:
            o7.j r3 = r13.f19862c
            m11327I(r3)
            java.lang.String r4 = "_s"
            o7.n r1 = r3.m11259J(r1, r4)
            if (r1 == 0) goto Lfb
            long r3 = r1.f19888c
            com.google.android.gms.measurement.internal.b r1 = r13.mo3162d()
            o7.f3 r1 = r1.f5680n
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            java.lang.String r9 = "Backfill the session number. Last used session number"
            r1.m11170d(r9, r7)
            goto Lfd
        Lfb:
            r3 = 0
        Lfd:
            o7.p6 r1 = new o7.p6
            r9 = 1
            long r3 = r3 + r9
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "_sno"
            r3 = r1
            r3.<init>(r4, r5, r7, r8)
            r13.m11360s(r1, r15)
        L10f:
            o7.r6 r1 = new o7.r6
            java.lang.String r4 = r15.f20031Y
            java.util.Objects.requireNonNull(r4, r2)
            java.lang.String r5 = r14.f19949d0
            java.util.Objects.requireNonNull(r5, r2)
            java.lang.String r6 = r14.f19945Z
            long r7 = r14.f19946a0
            r3 = r1
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r9)
            com.google.android.gms.measurement.internal.b r14 = r13.mo3162d()
            o7.f3 r14 = r14.f5680n
            com.google.android.gms.measurement.internal.d r2 = r13.f19871l
            o7.c3 r2 = r2.f5722m
            java.lang.String r3 = r1.f19982c
            java.lang.String r2 = r2.m11118f(r3)
            java.lang.String r3 = "Setting user property"
            r14.m11171e(r3, r2, r0)
            o7.j r14 = r13.f19862c
            m11327I(r14)
            r14.m11267R()
            p185k7.C3938p8.m8881c()     // Catch: java.lang.Throwable -> L1ad
            com.google.android.gms.measurement.internal.d r14 = r13.f19871l     // Catch: java.lang.Throwable -> L1ad
            o7.f r14 = r14.f5716g     // Catch: java.lang.Throwable -> L1ad
            o7.u2<java.lang.Boolean> r0 = p249o7.C5120v2.f20121t0     // Catch: java.lang.Throwable -> L1ad
            r2 = 0
            boolean r14 = r14.m11162v(r2, r0)     // Catch: java.lang.Throwable -> L1ad
            if (r14 == 0) goto L167
            java.lang.String r14 = "_id"
            java.lang.String r0 = r1.f19982c     // Catch: java.lang.Throwable -> L1ad
            boolean r14 = r14.equals(r0)     // Catch: java.lang.Throwable -> L1ad
            if (r14 == 0) goto L167
            o7.j r14 = r13.f19862c     // Catch: java.lang.Throwable -> L1ad
            m11327I(r14)     // Catch: java.lang.Throwable -> L1ad
            java.lang.String r0 = r15.f20031Y     // Catch: java.lang.Throwable -> L1ad
            java.lang.String r2 = "_lair"
            r14.m11272n(r0, r2)     // Catch: java.lang.Throwable -> L1ad
        L167:
            r13.m11339J(r15)     // Catch: java.lang.Throwable -> L1ad
            o7.j r14 = r13.f19862c     // Catch: java.lang.Throwable -> L1ad
            m11327I(r14)     // Catch: java.lang.Throwable -> L1ad
            boolean r14 = r14.m11280v(r1)     // Catch: java.lang.Throwable -> L1ad
            o7.j r0 = r13.f19862c     // Catch: java.lang.Throwable -> L1ad
            m11327I(r0)     // Catch: java.lang.Throwable -> L1ad
            r0.m11273o()     // Catch: java.lang.Throwable -> L1ad
            if (r14 != 0) goto L1a4
            com.google.android.gms.measurement.internal.b r14 = r13.mo3162d()     // Catch: java.lang.Throwable -> L1ad
            o7.f3 r14 = r14.f5672f     // Catch: java.lang.Throwable -> L1ad
            java.lang.String r0 = "Too many unique user properties are set. Ignoring user property"
            com.google.android.gms.measurement.internal.d r2 = r13.f19871l     // Catch: java.lang.Throwable -> L1ad
            o7.c3 r2 = r2.f5722m     // Catch: java.lang.Throwable -> L1ad
            java.lang.String r3 = r1.f19982c     // Catch: java.lang.Throwable -> L1ad
            java.lang.String r2 = r2.m11118f(r3)     // Catch: java.lang.Throwable -> L1ad
            java.lang.Object r1 = r1.f19984e     // Catch: java.lang.Throwable -> L1ad
            r14.m11171e(r0, r2, r1)     // Catch: java.lang.Throwable -> L1ad
            com.google.android.gms.measurement.internal.f r3 = r13.m11345Q()     // Catch: java.lang.Throwable -> L1ad
            o7.s6 r4 = r13.f19859B     // Catch: java.lang.Throwable -> L1ad
            java.lang.String r5 = r15.f20031Y     // Catch: java.lang.Throwable -> L1ad
            r6 = 9
            r7 = 0
            r8 = 0
            r9 = 0
            r3.m3196A(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1ad
        L1a4:
            o7.j r14 = r13.f19862c
            m11327I(r14)
            r14.m11269T()
            return
        L1ad:
            r14 = move-exception
            o7.j r15 = r13.f19862c
            m11327I(r15)
            r15.m11269T()
            throw r14
    }

    /* renamed from: t */
    public final void m11361t() {
            r22 = this;
            r1 = r22
            o7.f4 r0 = r22.mo3160b()
            r0.mo3183i()
            r22.m11348g()
            r2 = 1
            r1.f19880u = r2
            r3 = 0
            com.google.android.gms.measurement.internal.d r0 = r1.f19871l     // Catch: java.lang.Throwable -> L51c
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L51c
            com.google.android.gms.measurement.internal.d r0 = r1.f19871l     // Catch: java.lang.Throwable -> L51c
            o7.v5 r0 = r0.m3179y()     // Catch: java.lang.Throwable -> L51c
            java.lang.Boolean r0 = r0.f20136e     // Catch: java.lang.Throwable -> L51c
            if (r0 != 0) goto L28
            com.google.android.gms.measurement.internal.b r0 = r22.mo3162d()     // Catch: java.lang.Throwable -> L51c
            o7.f3 r0 = r0.f5675i     // Catch: java.lang.Throwable -> L51c
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            goto L53
        L28:
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L51c
            if (r0 == 0) goto L37
            com.google.android.gms.measurement.internal.b r0 = r22.mo3162d()     // Catch: java.lang.Throwable -> L51c
            o7.f3 r0 = r0.f5672f     // Catch: java.lang.Throwable -> L51c
            java.lang.String r2 = "Upload called in the client side when service should be used"
            goto L53
        L37:
            long r4 = r1.f19874o     // Catch: java.lang.Throwable -> L51c
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L40
            goto L6d
        L40:
            o7.f4 r0 = r22.mo3160b()     // Catch: java.lang.Throwable -> L51c
            r0.mo3183i()     // Catch: java.lang.Throwable -> L51c
            java.util.List<java.lang.Long> r0 = r1.f19883x     // Catch: java.lang.Throwable -> L51c
            if (r0 == 0) goto L57
            com.google.android.gms.measurement.internal.b r0 = r22.mo3162d()     // Catch: java.lang.Throwable -> L51c
            o7.f3 r0 = r0.f5680n     // Catch: java.lang.Throwable -> L51c
            java.lang.String r2 = "Uploading requested multiple times"
        L53:
            r0.m11169c(r2)     // Catch: java.lang.Throwable -> L51c
            goto L70
        L57:
            o7.k3 r0 = r1.f19861b     // Catch: java.lang.Throwable -> L51c
            m11327I(r0)     // Catch: java.lang.Throwable -> L51c
            boolean r0 = r0.m11288n()     // Catch: java.lang.Throwable -> L51c
            if (r0 != 0) goto L74
            com.google.android.gms.measurement.internal.b r0 = r22.mo3162d()     // Catch: java.lang.Throwable -> L51c
            o7.f3 r0 = r0.f5680n     // Catch: java.lang.Throwable -> L51c
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.m11169c(r2)     // Catch: java.lang.Throwable -> L51c
        L6d:
            r22.m11334D()     // Catch: java.lang.Throwable -> L51c
        L70:
            r1.f19880u = r3
            goto L510
        L74:
            u6.c r0 = r22.mo3163e()     // Catch: java.lang.Throwable -> L51c
            u6.d r0 = (p353u6.C6341d) r0     // Catch: java.lang.Throwable -> L51c
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L51c
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L51c
            o7.f r0 = r22.m11340K()     // Catch: java.lang.Throwable -> L51c
            o7.u2<java.lang.Integer> r8 = p249o7.C5120v2.f20072Q     // Catch: java.lang.Throwable -> L51c
            r9 = 0
            int r0 = r0.m11155o(r9, r8)     // Catch: java.lang.Throwable -> L51c
            r22.m11340K()     // Catch: java.lang.Throwable -> L51c
            o7.u2<java.lang.Long> r8 = p249o7.C5120v2.f20088d     // Catch: java.lang.Throwable -> L51c
            java.lang.Object r8 = r8.m11421a(r9)     // Catch: java.lang.Throwable -> L51c
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L51c
            long r10 = r8.longValue()     // Catch: java.lang.Throwable -> L51c
            long r10 = r4 - r10
            r8 = 0
        L9e:
            if (r8 >= r0) goto La9
            boolean r12 = r1.m11336F(r9, r10)     // Catch: java.lang.Throwable -> L51c
            if (r12 == 0) goto La9
            int r8 = r8 + 1
            goto L9e
        La9:
            o7.w5 r0 = r1.f19868i     // Catch: java.lang.Throwable -> L51c
            o7.p3 r0 = r0.f20154i     // Catch: java.lang.Throwable -> L51c
            long r10 = r0.m11410a()     // Catch: java.lang.Throwable -> L51c
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto Lca
            com.google.android.gms.measurement.internal.b r0 = r22.mo3162d()     // Catch: java.lang.Throwable -> L51c
            o7.f3 r0 = r0.f5679m     // Catch: java.lang.Throwable -> L51c
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch: java.lang.Throwable -> L51c
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L51c
            r0.m11170d(r6, r7)     // Catch: java.lang.Throwable -> L51c
        Lca:
            o7.j r0 = r1.f19862c     // Catch: java.lang.Throwable -> L51c
            m11327I(r0)     // Catch: java.lang.Throwable -> L51c
            java.lang.String r6 = r0.m11262M()     // Catch: java.lang.Throwable -> L51c
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L51c
            r7 = -1
            if (r0 != 0) goto L48e
            long r10 = r1.f19885z     // Catch: java.lang.Throwable -> L51c
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L11f
            o7.j r10 = r1.f19862c     // Catch: java.lang.Throwable -> L51c
            m11327I(r10)     // Catch: java.lang.Throwable -> L51c
            android.database.sqlite.SQLiteDatabase r0 = r10.m11253D()     // Catch: java.lang.Throwable -> Lfe android.database.sqlite.SQLiteException -> L100
            java.lang.String r11 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r11, r9)     // Catch: java.lang.Throwable -> Lfe android.database.sqlite.SQLiteException -> L100
            boolean r0 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lfc java.lang.Throwable -> L117
            if (r0 != 0) goto Lf7
            goto L111
        Lf7:
            long r7 = r11.getLong(r3)     // Catch: android.database.sqlite.SQLiteException -> Lfc java.lang.Throwable -> L117
            goto L111
        Lfc:
            r0 = move-exception
            goto L102
        Lfe:
            r0 = move-exception
            goto L119
        L100:
            r0 = move-exception
            r11 = r9
        L102:
            com.google.android.gms.measurement.internal.d r10 = r10.f5736a     // Catch: java.lang.Throwable -> L117
            com.google.android.gms.measurement.internal.b r10 = r10.mo3162d()     // Catch: java.lang.Throwable -> L117
            o7.f3 r10 = r10.f5672f     // Catch: java.lang.Throwable -> L117
            java.lang.String r12 = "Error querying raw events"
            r10.m11170d(r12, r0)     // Catch: java.lang.Throwable -> L117
            if (r11 == 0) goto L114
        L111:
            r11.close()     // Catch: java.lang.Throwable -> L51c
        L114:
            r1.f19885z = r7     // Catch: java.lang.Throwable -> L51c
            goto L11f
        L117:
            r0 = move-exception
            r9 = r11
        L119:
            if (r9 == 0) goto L11e
            r9.close()     // Catch: java.lang.Throwable -> L51c
        L11e:
            throw r0     // Catch: java.lang.Throwable -> L51c
        L11f:
            o7.f r0 = r22.m11340K()     // Catch: java.lang.Throwable -> L51c
            o7.u2<java.lang.Integer> r7 = p249o7.C5120v2.f20094g     // Catch: java.lang.Throwable -> L51c
            int r0 = r0.m11155o(r6, r7)     // Catch: java.lang.Throwable -> L51c
            o7.f r7 = r22.m11340K()     // Catch: java.lang.Throwable -> L51c
            o7.u2<java.lang.Integer> r8 = p249o7.C5120v2.f20096h     // Catch: java.lang.Throwable -> L51c
            int r7 = r7.m11155o(r6, r8)     // Catch: java.lang.Throwable -> L51c
            int r7 = java.lang.Math.max(r3, r7)     // Catch: java.lang.Throwable -> L51c
            o7.j r8 = r1.f19862c     // Catch: java.lang.Throwable -> L51c
            m11327I(r8)     // Catch: java.lang.Throwable -> L51c
            r8.mo3183i()     // Catch: java.lang.Throwable -> L51c
            r8.m11247j()     // Catch: java.lang.Throwable -> L51c
            if (r0 <= 0) goto L146
            r10 = 1
            goto L147
        L146:
            r10 = 0
        L147:
            com.google.android.gms.common.internal.C1101a.m3096a(r10)     // Catch: java.lang.Throwable -> L51c
            if (r7 <= 0) goto L14e
            r10 = 1
            goto L14f
        L14e:
            r10 = 0
        L14f:
            com.google.android.gms.common.internal.C1101a.m3096a(r10)     // Catch: java.lang.Throwable -> L51c
            com.google.android.gms.common.internal.C1101a.m3100e(r6)     // Catch: java.lang.Throwable -> L51c
            android.database.sqlite.SQLiteDatabase r11 = r8.m11253D()     // Catch: java.lang.Throwable -> L252 android.database.sqlite.SQLiteException -> L256
            java.lang.String r12 = "rowid"
            java.lang.String r13 = "data"
            java.lang.String r14 = "retry_count"
            java.lang.String[] r13 = new java.lang.String[]{r12, r13, r14}     // Catch: java.lang.Throwable -> L252 android.database.sqlite.SQLiteException -> L256
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L252 android.database.sqlite.SQLiteException -> L256
            r15[r3] = r6     // Catch: java.lang.Throwable -> L252 android.database.sqlite.SQLiteException -> L256
            java.lang.String r12 = "queue"
            java.lang.String r14 = "app_id=?"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L252 android.database.sqlite.SQLiteException -> L256
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L252 android.database.sqlite.SQLiteException -> L256
            boolean r0 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L24e java.lang.Throwable -> L486
            if (r0 != 0) goto L18a
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: android.database.sqlite.SQLiteException -> L24e java.lang.Throwable -> L486
            r11.close()     // Catch: java.lang.Throwable -> L51c
            r20 = r4
            goto L274
        L18a:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L24e java.lang.Throwable -> L486
            r12.<init>()     // Catch: android.database.sqlite.SQLiteException -> L24e java.lang.Throwable -> L486
            r13 = 0
        L190:
            long r14 = r11.getLong(r3)     // Catch: android.database.sqlite.SQLiteException -> L24e java.lang.Throwable -> L486
            byte[] r0 = r11.getBlob(r2)     // Catch: java.io.IOException -> L228 android.database.sqlite.SQLiteException -> L24e java.lang.Throwable -> L486
            o7.m6 r2 = r8.f19756b     // Catch: java.io.IOException -> L228 android.database.sqlite.SQLiteException -> L24e java.lang.Throwable -> L486
            o7.o6 r2 = r2.f19866g     // Catch: java.io.IOException -> L228 android.database.sqlite.SQLiteException -> L24e java.lang.Throwable -> L486
            m11327I(r2)     // Catch: java.io.IOException -> L228 android.database.sqlite.SQLiteException -> L24e java.lang.Throwable -> L486
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> L215 android.database.sqlite.SQLiteException -> L24e java.lang.Throwable -> L486
            r9.<init>(r0)     // Catch: java.io.IOException -> L215 android.database.sqlite.SQLiteException -> L24e java.lang.Throwable -> L486
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.io.IOException -> L215 android.database.sqlite.SQLiteException -> L24e java.lang.Throwable -> L486
            r0.<init>(r9)     // Catch: java.io.IOException -> L215 android.database.sqlite.SQLiteException -> L24e java.lang.Throwable -> L486
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L215 android.database.sqlite.SQLiteException -> L24e java.lang.Throwable -> L486
            r3.<init>()     // Catch: java.io.IOException -> L215 android.database.sqlite.SQLiteException -> L24e java.lang.Throwable -> L486
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch: java.io.IOException -> L215 android.database.sqlite.SQLiteException -> L24e java.lang.Throwable -> L486
            r20 = r4
        L1b4:
            int r4 = r0.read(r10)     // Catch: android.database.sqlite.SQLiteException -> L20c java.io.IOException -> L213 java.lang.Throwable -> L486
            if (r4 > 0) goto L20e
            r0.close()     // Catch: android.database.sqlite.SQLiteException -> L20c java.io.IOException -> L213 java.lang.Throwable -> L486
            r9.close()     // Catch: android.database.sqlite.SQLiteException -> L20c java.io.IOException -> L213 java.lang.Throwable -> L486
            byte[] r0 = r3.toByteArray()     // Catch: android.database.sqlite.SQLiteException -> L20c java.io.IOException -> L213 java.lang.Throwable -> L486
            boolean r2 = r12.isEmpty()     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            if (r2 != 0) goto L1d0
            int r2 = r0.length     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            int r2 = r2 + r13
            if (r2 <= r7) goto L1d0
            goto L249
        L1d0:
            k7.c3 r2 = p185k7.C3770d3.m8424z1()     // Catch: java.io.IOException -> L1fc android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            k7.y4 r2 = p249o7.C5068o6.m11380D(r2, r0)     // Catch: java.io.IOException -> L1fc android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            k7.c3 r2 = (p185k7.C3756c3) r2     // Catch: java.io.IOException -> L1fc android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            r3 = 2
            boolean r4 = r11.isNull(r3)     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            if (r4 != 0) goto L1e8
            int r4 = r11.getInt(r3)     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            r2.m8252T(r4)     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
        L1e8:
            int r0 = r0.length     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            int r13 = r13 + r0
            k7.d6 r0 = r2.m8201f()     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            k7.d3 r0 = (p185k7.C3770d3) r0     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            r12.add(r0)     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            goto L239
        L1fc:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r2 = r8.f5736a     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            o7.f3 r2 = r2.f5672f     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            java.lang.String r3 = "Failed to merge queued bundle. appId"
        L207:
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r6)     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            goto L236
        L20c:
            r0 = move-exception
            goto L25a
        L20e:
            r5 = 0
            r3.write(r10, r5, r4)     // Catch: android.database.sqlite.SQLiteException -> L20c java.io.IOException -> L213 java.lang.Throwable -> L486
            goto L1b4
        L213:
            r0 = move-exception
            goto L218
        L215:
            r0 = move-exception
            r20 = r4
        L218:
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: android.database.sqlite.SQLiteException -> L20c java.io.IOException -> L226 java.lang.Throwable -> L486
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L20c java.io.IOException -> L226 java.lang.Throwable -> L486
            o7.f3 r2 = r2.f5672f     // Catch: android.database.sqlite.SQLiteException -> L20c java.io.IOException -> L226 java.lang.Throwable -> L486
            java.lang.String r3 = "Failed to ungzip content"
            r2.m11170d(r3, r0)     // Catch: android.database.sqlite.SQLiteException -> L20c java.io.IOException -> L226 java.lang.Throwable -> L486
            throw r0     // Catch: android.database.sqlite.SQLiteException -> L20c java.io.IOException -> L226 java.lang.Throwable -> L486
        L226:
            r0 = move-exception
            goto L22b
        L228:
            r0 = move-exception
            r20 = r4
        L22b:
            com.google.android.gms.measurement.internal.d r2 = r8.f5736a     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            o7.f3 r2 = r2.f5672f     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            goto L207
        L236:
            r2.m11171e(r3, r4, r0)     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
        L239:
            boolean r0 = r11.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L20c java.lang.Throwable -> L486
            if (r0 == 0) goto L249
            if (r13 <= r7) goto L242
            goto L249
        L242:
            r4 = r20
            r2 = 1
            r3 = 0
            r9 = 0
            goto L190
        L249:
            r11.close()     // Catch: java.lang.Throwable -> L51c
            r0 = r12
            goto L274
        L24e:
            r0 = move-exception
            r20 = r4
            goto L25a
        L252:
            r0 = move-exception
            r9 = 0
            goto L488
        L256:
            r0 = move-exception
            r20 = r4
            r11 = 0
        L25a:
            com.google.android.gms.measurement.internal.d r2 = r8.f5736a     // Catch: java.lang.Throwable -> L486
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L486
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> L486
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r6)     // Catch: java.lang.Throwable -> L486
            r2.m11171e(r3, r4, r0)     // Catch: java.lang.Throwable -> L486
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L486
            if (r11 == 0) goto L274
            r11.close()     // Catch: java.lang.Throwable -> L51c
        L274:
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> L51c
            if (r2 != 0) goto L50d
            o7.g r2 = r1.m11341L(r6)     // Catch: java.lang.Throwable -> L51c
            boolean r2 = r2.m11189f()     // Catch: java.lang.Throwable -> L51c
            if (r2 == 0) goto L2d9
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L51c
        L288:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L51c
            if (r3 == 0) goto L2a7
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L51c
            android.util.Pair r3 = (android.util.Pair) r3     // Catch: java.lang.Throwable -> L51c
            java.lang.Object r3 = r3.first     // Catch: java.lang.Throwable -> L51c
            k7.d3 r3 = (p185k7.C3770d3) r3     // Catch: java.lang.Throwable -> L51c
            java.lang.String r4 = r3.m8430D()     // Catch: java.lang.Throwable -> L51c
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L51c
            if (r4 != 0) goto L288
            java.lang.String r2 = r3.m8430D()     // Catch: java.lang.Throwable -> L51c
            goto L2a8
        L2a7:
            r2 = 0
        L2a8:
            if (r2 == 0) goto L2d9
            r3 = 0
        L2ab:
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L51c
            if (r3 >= r4) goto L2d9
            java.lang.Object r4 = r0.get(r3)     // Catch: java.lang.Throwable -> L51c
            android.util.Pair r4 = (android.util.Pair) r4     // Catch: java.lang.Throwable -> L51c
            java.lang.Object r4 = r4.first     // Catch: java.lang.Throwable -> L51c
            k7.d3 r4 = (p185k7.C3770d3) r4     // Catch: java.lang.Throwable -> L51c
            java.lang.String r5 = r4.m8430D()     // Catch: java.lang.Throwable -> L51c
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L51c
            if (r5 == 0) goto L2c6
            goto L2d6
        L2c6:
            java.lang.String r4 = r4.m8430D()     // Catch: java.lang.Throwable -> L51c
            boolean r4 = r4.equals(r2)     // Catch: java.lang.Throwable -> L51c
            if (r4 != 0) goto L2d6
            r4 = 0
            java.util.List r0 = r0.subList(r4, r3)     // Catch: java.lang.Throwable -> L51c
            goto L2d9
        L2d6:
            int r3 = r3 + 1
            goto L2ab
        L2d9:
            k7.a3 r2 = p185k7.C3742b3.m8219s()     // Catch: java.lang.Throwable -> L51c
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L51c
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51c
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L51c
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L51c
            o7.f r5 = r22.m11340K()     // Catch: java.lang.Throwable -> L51c
            o7.e r5 = r5.f19666c     // Catch: java.lang.Throwable -> L51c
            java.lang.String r7 = "gaia_collection_enabled"
            java.lang.String r5 = r5.mo11088a(r6, r7)     // Catch: java.lang.Throwable -> L51c
            java.lang.String r7 = "1"
            boolean r5 = r7.equals(r5)     // Catch: java.lang.Throwable -> L51c
            if (r5 == 0) goto L30a
            o7.g r5 = r1.m11341L(r6)     // Catch: java.lang.Throwable -> L51c
            boolean r5 = r5.m11189f()     // Catch: java.lang.Throwable -> L51c
            if (r5 == 0) goto L30a
            r5 = 1
            goto L30b
        L30a:
            r5 = 0
        L30b:
            o7.g r7 = r1.m11341L(r6)     // Catch: java.lang.Throwable -> L51c
            boolean r7 = r7.m11189f()     // Catch: java.lang.Throwable -> L51c
            o7.g r8 = r1.m11341L(r6)     // Catch: java.lang.Throwable -> L51c
            boolean r8 = r8.m11190g()     // Catch: java.lang.Throwable -> L51c
            r9 = 0
        L31c:
            if (r9 >= r3) goto L3ba
            java.lang.Object r10 = r0.get(r9)     // Catch: java.lang.Throwable -> L51c
            android.util.Pair r10 = (android.util.Pair) r10     // Catch: java.lang.Throwable -> L51c
            java.lang.Object r10 = r10.first     // Catch: java.lang.Throwable -> L51c
            k7.d3 r10 = (p185k7.C3770d3) r10     // Catch: java.lang.Throwable -> L51c
            k7.a6 r10 = r10.m8501o()     // Catch: java.lang.Throwable -> L51c
            k7.c3 r10 = (p185k7.C3756c3) r10     // Catch: java.lang.Throwable -> L51c
            java.lang.Object r11 = r0.get(r9)     // Catch: java.lang.Throwable -> L51c
            android.util.Pair r11 = (android.util.Pair) r11     // Catch: java.lang.Throwable -> L51c
            java.lang.Object r11 = r11.second     // Catch: java.lang.Throwable -> L51c
            java.lang.Long r11 = (java.lang.Long) r11     // Catch: java.lang.Throwable -> L51c
            r4.add(r11)     // Catch: java.lang.Throwable -> L51c
            o7.f r11 = r22.m11340K()     // Catch: java.lang.Throwable -> L51c
            r11.m11157q()     // Catch: java.lang.Throwable -> L51c
            boolean r11 = r10.f16454a0     // Catch: java.lang.Throwable -> L51c
            if (r11 == 0) goto L34c
            r10.m8203j()     // Catch: java.lang.Throwable -> L51c
            r11 = 0
            r10.f16454a0 = r11     // Catch: java.lang.Throwable -> L51c
        L34c:
            MessageType extends k7.d6<MessageType, BuilderType> r11 = r10.f16453Z     // Catch: java.lang.Throwable -> L51c
            k7.d3 r11 = (p185k7.C3770d3) r11     // Catch: java.lang.Throwable -> L51c
            p185k7.C3770d3.m8396Q0(r11)     // Catch: java.lang.Throwable -> L51c
            boolean r11 = r10.f16454a0     // Catch: java.lang.Throwable -> L51c
            if (r11 == 0) goto L35d
            r10.m8203j()     // Catch: java.lang.Throwable -> L51c
            r11 = 0
            r10.f16454a0 = r11     // Catch: java.lang.Throwable -> L51c
        L35d:
            MessageType extends k7.d6<MessageType, BuilderType> r11 = r10.f16453Z     // Catch: java.lang.Throwable -> L51c
            k7.d3 r11 = (p185k7.C3770d3) r11     // Catch: java.lang.Throwable -> L51c
            r12 = r20
            p185k7.C3770d3.m8370A0(r11, r12)     // Catch: java.lang.Throwable -> L51c
            com.google.android.gms.measurement.internal.d r11 = r1.f19871l     // Catch: java.lang.Throwable -> L51c
            java.util.Objects.requireNonNull(r11)     // Catch: java.lang.Throwable -> L51c
            boolean r11 = r10.f16454a0     // Catch: java.lang.Throwable -> L51c
            if (r11 == 0) goto L375
            r10.m8203j()     // Catch: java.lang.Throwable -> L51c
            r11 = 0
            r10.f16454a0 = r11     // Catch: java.lang.Throwable -> L51c
        L375:
            MessageType extends k7.d6<MessageType, BuilderType> r11 = r10.f16453Z     // Catch: java.lang.Throwable -> L51c
            k7.d3 r11 = (p185k7.C3770d3) r11     // Catch: java.lang.Throwable -> L51c
            r14 = 0
            p185k7.C3770d3.m8408d0(r11, r14)     // Catch: java.lang.Throwable -> L51c
            if (r5 != 0) goto L382
            r10.m8277q0()     // Catch: java.lang.Throwable -> L51c
        L382:
            if (r7 != 0) goto L38a
            r10.m8289w0()     // Catch: java.lang.Throwable -> L51c
            r10.m8283t0()     // Catch: java.lang.Throwable -> L51c
        L38a:
            if (r8 != 0) goto L38f
            r10.m8273o0()     // Catch: java.lang.Throwable -> L51c
        L38f:
            o7.f r11 = r22.m11340K()     // Catch: java.lang.Throwable -> L51c
            o7.u2<java.lang.Boolean> r14 = p249o7.C5120v2.f20077V     // Catch: java.lang.Throwable -> L51c
            boolean r11 = r11.m11162v(r6, r14)     // Catch: java.lang.Throwable -> L51c
            if (r11 == 0) goto L3b1
            k7.d6 r11 = r10.m8201f()     // Catch: java.lang.Throwable -> L51c
            k7.d3 r11 = (p185k7.C3770d3) r11     // Catch: java.lang.Throwable -> L51c
            byte[] r11 = r11.m9160i()     // Catch: java.lang.Throwable -> L51c
            o7.o6 r14 = r1.f19866g     // Catch: java.lang.Throwable -> L51c
            m11327I(r14)     // Catch: java.lang.Throwable -> L51c
            long r14 = r14.m11408y(r11)     // Catch: java.lang.Throwable -> L51c
            r10.m8286v(r14)     // Catch: java.lang.Throwable -> L51c
        L3b1:
            r2.m8195p(r10)     // Catch: java.lang.Throwable -> L51c
            int r9 = r9 + 1
            r20 = r12
            goto L31c
        L3ba:
            r12 = r20
            com.google.android.gms.measurement.internal.b r0 = r22.mo3162d()     // Catch: java.lang.Throwable -> L51c
            java.lang.String r0 = r0.m3144x()     // Catch: java.lang.Throwable -> L51c
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L51c
            if (r0 == 0) goto L3db
            o7.o6 r0 = r1.f19866g     // Catch: java.lang.Throwable -> L51c
            m11327I(r0)     // Catch: java.lang.Throwable -> L51c
            k7.d6 r5 = r2.m8201f()     // Catch: java.lang.Throwable -> L51c
            k7.b3 r5 = (p185k7.C3742b3) r5     // Catch: java.lang.Throwable -> L51c
            java.lang.String r0 = r0.m11398E(r5)     // Catch: java.lang.Throwable -> L51c
            goto L3dc
        L3db:
            r0 = 0
        L3dc:
            o7.o6 r5 = r1.f19866g     // Catch: java.lang.Throwable -> L51c
            m11327I(r5)     // Catch: java.lang.Throwable -> L51c
            k7.d6 r5 = r2.m8201f()     // Catch: java.lang.Throwable -> L51c
            k7.b3 r5 = (p185k7.C3742b3) r5     // Catch: java.lang.Throwable -> L51c
            byte[] r14 = r5.m9160i()     // Catch: java.lang.Throwable -> L51c
            r22.m11340K()     // Catch: java.lang.Throwable -> L51c
            o7.u2<java.lang.String> r5 = p249o7.C5120v2.f20114q     // Catch: java.lang.Throwable -> L51c
            r7 = 0
            java.lang.Object r5 = r5.m11421a(r7)     // Catch: java.lang.Throwable -> L51c
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L51c
            java.net.URL r7 = new java.net.URL     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            r7.<init>(r5)     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            boolean r8 = r4.isEmpty()     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            r9 = 1
            r8 = r8 ^ r9
            com.google.android.gms.common.internal.C1101a.m3096a(r8)     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            java.util.List<java.lang.Long> r8 = r1.f19883x     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            if (r8 == 0) goto L417
            com.google.android.gms.measurement.internal.b r4 = r22.mo3162d()     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            o7.f3 r4 = r4.m3140q()     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            java.lang.String r8 = "Set uploading progress before finishing the previous upload"
            r4.m11169c(r8)     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            goto L41e
        L417:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            r8.<init>(r4)     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            r1.f19883x = r8     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
        L41e:
            o7.w5 r4 = r1.f19868i     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            o7.p3 r4 = r4.f20155j     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            r4.m11411b(r12)     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L431
            k7.d3 r2 = r2.m8196q()     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            java.lang.String r4 = r2.m8431D1()     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
        L431:
            com.google.android.gms.measurement.internal.b r2 = r22.mo3162d()     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            o7.f3 r2 = r2.m3141r()     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r8 = r14.length     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            r2.m11172f(r3, r4, r8, r0)     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            r2 = 1
            r1.f19879t = r2     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            o7.k3 r11 = r1.f19861b     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            m11327I(r11)     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            androidx.appcompat.widget.x r0 = new androidx.appcompat.widget.x     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            r0.<init>(r1, r6)     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            r11.mo3183i()     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            r11.m11247j()     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            com.google.android.gms.common.internal.C1101a.m3103h(r7)     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            com.google.android.gms.common.internal.C1101a.m3103h(r14)     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            com.google.android.gms.common.internal.C1101a.m3103h(r0)     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            com.google.android.gms.measurement.internal.d r2 = r11.f5736a     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            o7.f4 r2 = r2.mo3160b()     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            o7.j3 r3 = new o7.j3     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            r15 = 0
            r10 = r3
            r12 = r6
            r13 = r7
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            r2.m11175r(r3)     // Catch: java.net.MalformedURLException -> L475 java.lang.Throwable -> L51c
            goto L50d
        L475:
            com.google.android.gms.measurement.internal.b r0 = r22.mo3162d()     // Catch: java.lang.Throwable -> L51c
            o7.f3 r0 = r0.f5672f     // Catch: java.lang.Throwable -> L51c
            java.lang.String r2 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1111b.m3134u(r6)     // Catch: java.lang.Throwable -> L51c
            r0.m11171e(r2, r3, r5)     // Catch: java.lang.Throwable -> L51c
            goto L50d
        L486:
            r0 = move-exception
            r9 = r11
        L488:
            if (r9 == 0) goto L48d
            r9.close()     // Catch: java.lang.Throwable -> L51c
        L48d:
            throw r0     // Catch: java.lang.Throwable -> L51c
        L48e:
            r12 = r4
            r1.f19885z = r7     // Catch: java.lang.Throwable -> L51c
            o7.j r2 = r1.f19862c     // Catch: java.lang.Throwable -> L51c
            m11327I(r2)     // Catch: java.lang.Throwable -> L51c
            r22.m11340K()     // Catch: java.lang.Throwable -> L51c
            o7.u2<java.lang.Long> r0 = p249o7.C5120v2.f20088d     // Catch: java.lang.Throwable -> L51c
            r7 = 0
            java.lang.Object r0 = r0.m11421a(r7)     // Catch: java.lang.Throwable -> L51c
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L51c
            long r3 = r0.longValue()     // Catch: java.lang.Throwable -> L51c
            long r4 = r12 - r3
            r2.mo3183i()     // Catch: java.lang.Throwable -> L51c
            r2.m11247j()     // Catch: java.lang.Throwable -> L51c
            android.database.sqlite.SQLiteDatabase r0 = r2.m11253D()     // Catch: java.lang.Throwable -> L4df android.database.sqlite.SQLiteException -> L4e2
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L4df android.database.sqlite.SQLiteException -> L4e2
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L4df android.database.sqlite.SQLiteException -> L4e2
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L4df android.database.sqlite.SQLiteException -> L4e2
            java.lang.String r4 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r3 = r0.rawQuery(r4, r3)     // Catch: java.lang.Throwable -> L4df android.database.sqlite.SQLiteException -> L4e2
            boolean r0 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L4d6 java.lang.Throwable -> L514
            if (r0 != 0) goto L4d8
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a     // Catch: android.database.sqlite.SQLiteException -> L4d6 java.lang.Throwable -> L514
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> L4d6 java.lang.Throwable -> L514
            o7.f3 r0 = r0.f5680n     // Catch: android.database.sqlite.SQLiteException -> L4d6 java.lang.Throwable -> L514
            java.lang.String r4 = "No expired configs for apps with pending events"
            r0.m11169c(r4)     // Catch: android.database.sqlite.SQLiteException -> L4d6 java.lang.Throwable -> L514
            goto L4f3
        L4d6:
            r0 = move-exception
            goto L4e4
        L4d8:
            r4 = 0
            java.lang.String r0 = r3.getString(r4)     // Catch: android.database.sqlite.SQLiteException -> L4d6 java.lang.Throwable -> L514
            r9 = r0
            goto L4f4
        L4df:
            r0 = move-exception
            r9 = r7
            goto L516
        L4e2:
            r0 = move-exception
            r3 = r7
        L4e4:
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: java.lang.Throwable -> L514
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L514
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> L514
            java.lang.String r4 = "Error selecting expired configs"
            r2.m11170d(r4, r0)     // Catch: java.lang.Throwable -> L514
            if (r3 == 0) goto L4f8
        L4f3:
            r9 = r7
        L4f4:
            r3.close()     // Catch: java.lang.Throwable -> L51c
            goto L4f9
        L4f8:
            r9 = r7
        L4f9:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L51c
            if (r0 != 0) goto L50d
            o7.j r0 = r1.f19862c     // Catch: java.lang.Throwable -> L51c
            m11327I(r0)     // Catch: java.lang.Throwable -> L51c
            o7.h4 r0 = r0.m11255F(r9)     // Catch: java.lang.Throwable -> L51c
            if (r0 == 0) goto L50d
            r1.m11349h(r0)     // Catch: java.lang.Throwable -> L51c
        L50d:
            r2 = 0
            r1.f19880u = r2
        L510:
            r22.m11331A()
            return
        L514:
            r0 = move-exception
            r9 = r3
        L516:
            if (r9 == 0) goto L51b
            r9.close()     // Catch: java.lang.Throwable -> L51c
        L51b:
            throw r0     // Catch: java.lang.Throwable -> L51c
        L51c:
            r0 = move-exception
            r2 = 0
            r1.f19880u = r2
            r22.m11331A()
            throw r0
    }

    /* renamed from: u */
    public final void m11362u(p249o7.C5077q r35, p249o7.C5116u6 r36) {
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = r36
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            com.google.android.gms.common.internal.C1101a.m3103h(r36)
            java.lang.String r8 = r3.f20031Y
            com.google.android.gms.common.internal.C1101a.m3100e(r8)
            long r8 = java.lang.System.nanoTime()
            o7.f4 r10 = r34.mo3160b()
            r10.mo3183i()
            r34.m11348g()
            java.lang.String r10 = r3.f20031Y
            o7.o6 r11 = r1.f19866g
            m11327I(r11)
            boolean r11 = p249o7.C5068o6.m11386n(r35, r36)
            if (r11 != 0) goto L32
            return
        L32:
            boolean r11 = r3.f20038f0
            if (r11 == 0) goto Lad4
            o7.a4 r11 = r1.f19860a
            m11327I(r11)
            java.lang.String r12 = r2.f19951Y
            boolean r11 = r11.m11096s(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto Le1
            com.google.android.gms.measurement.internal.b r3 = r34.mo3162d()
            o7.f3 r3 = r3.m3142s()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r10)
            com.google.android.gms.measurement.internal.d r5 = r1.f19871l
            o7.c3 r5 = r5.m3174s()
            java.lang.String r6 = r2.f19951Y
            java.lang.String r5 = r5.m11116d(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.m11171e(r6, r4, r5)
            o7.a4 r3 = r1.f19860a
            m11327I(r3)
            boolean r3 = r3.m11094q(r10)
            if (r3 != 0) goto L97
            o7.a4 r3 = r1.f19860a
            m11327I(r3)
            boolean r3 = r3.m11097t(r10)
            if (r3 == 0) goto L7a
            goto L97
        L7a:
            java.lang.String r3 = r2.f19951Y
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto Le0
            com.google.android.gms.measurement.internal.f r11 = r34.m11345Q()
            o7.s6 r12 = r1.f19859B
            r14 = 11
            java.lang.String r2 = r2.f19951Y
            r17 = 0
            java.lang.String r15 = "_ev"
            r13 = r10
            r16 = r2
            r11.m3196A(r12, r13, r14, r15, r16, r17)
            return
        L97:
            o7.j r2 = r1.f19862c
            m11327I(r2)
            o7.h4 r2 = r2.m11255F(r10)
            if (r2 == 0) goto Le0
            long r3 = r2.m11206F()
            long r5 = r2.m11203C()
            long r3 = java.lang.Math.max(r3, r5)
            u6.c r5 = r34.mo3163e()
            u6.d r5 = (p353u6.C6341d) r5
            long r5 = r5.m12990a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r34.m11340K()
            o7.u2<java.lang.Long> r5 = p249o7.C5120v2.f20130z
            java.lang.Object r5 = r5.m11421a(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto Le0
            com.google.android.gms.measurement.internal.b r3 = r34.mo3162d()
            o7.f3 r3 = r3.m3139p()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.m11169c(r4)
            r1.m11349h(r2)
        Le0:
            return
        Le1:
            o7.h3 r2 = p249o7.C5009h3.m11198c(r35)
            com.google.android.gms.measurement.internal.f r11 = r34.m11345Q()
            o7.f r12 = r34.m11340K()
            int r12 = r12.m11154n(r10)
            r11.m3240z(r2, r12)
            o7.q r2 = r2.m11200b()
            com.google.android.gms.measurement.internal.b r11 = r34.mo3162d()
            java.lang.String r11 = r11.m3144x()
            r13 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r13)
            if (r11 == 0) goto L11e
            com.google.android.gms.measurement.internal.b r11 = r34.mo3162d()
            o7.f3 r11 = r11.m3141r()
            com.google.android.gms.measurement.internal.d r12 = r1.f19871l
            o7.c3 r12 = r12.m3174s()
            java.lang.String r12 = r12.m11115c(r2)
            java.lang.String r13 = "Logging event"
            r11.m11170d(r13, r12)
        L11e:
            o7.j r11 = r1.f19862c
            m11327I(r11)
            r11.m11267R()
            r1.m11339J(r3)     // Catch: java.lang.Throwable -> Lac9
            p185k7.C3938p8.m8881c()     // Catch: java.lang.Throwable -> Lac9
            o7.f r11 = r34.m11340K()     // Catch: java.lang.Throwable -> Lac9
            o7.u2<java.lang.Boolean> r12 = p249o7.C5120v2.f20121t0     // Catch: java.lang.Throwable -> Lac9
            boolean r11 = r11.m11162v(r14, r12)     // Catch: java.lang.Throwable -> Lac9
            if (r11 != 0) goto L150
            o7.f r11 = r34.m11340K()     // Catch: java.lang.Throwable -> Lac9
            o7.u2<java.lang.Boolean> r12 = p249o7.C5120v2.f20123u0     // Catch: java.lang.Throwable -> Lac9
            boolean r11 = r11.m11162v(r14, r12)     // Catch: java.lang.Throwable -> Lac9
            if (r11 == 0) goto L150
            o7.j r11 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r11)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r12 = r3.f20031Y     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r13 = "_lair"
            r11.m11272n(r12, r13)     // Catch: java.lang.Throwable -> Lac9
        L150:
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.f19951Y     // Catch: java.lang.Throwable -> Lac9
            boolean r11 = r11.equals(r12)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r12 = "refund"
            r28 = 1
            if (r11 != 0) goto L173
            java.lang.String r11 = "purchase"
            java.lang.String r13 = r2.f19951Y     // Catch: java.lang.Throwable -> Lac9
            boolean r11 = r11.equals(r13)     // Catch: java.lang.Throwable -> Lac9
            if (r11 != 0) goto L173
            java.lang.String r11 = r2.f19951Y     // Catch: java.lang.Throwable -> Lac9
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> Lac9
            if (r11 == 0) goto L171
            goto L173
        L171:
            r11 = 0
            goto L174
        L173:
            r11 = 1
        L174:
            java.lang.String r13 = "_iap"
            java.lang.String r14 = r2.f19951Y     // Catch: java.lang.Throwable -> Lac9
            boolean r13 = r13.equals(r14)     // Catch: java.lang.Throwable -> Lac9
            if (r13 != 0) goto L187
            if (r11 == 0) goto L182
            r11 = 1
            goto L187
        L182:
            r29 = r8
            r8 = r15
            goto L323
        L187:
            o7.o r13 = r2.f19952Z     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r14 = "currency"
            java.lang.String r13 = r13.m11375b0(r14)     // Catch: java.lang.Throwable -> Lac9
            if (r11 == 0) goto L1fa
            o7.o r11 = r2.f19952Z     // Catch: java.lang.Throwable -> Lac9
            java.lang.Double r11 = r11.m11372Y()     // Catch: java.lang.Throwable -> Lac9
            double r18 = r11.doubleValue()     // Catch: java.lang.Throwable -> Lac9
            r20 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r18 = r18 * r20
            r22 = 0
            int r11 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r11 != 0) goto L1b8
            o7.o r11 = r2.f19952Z     // Catch: java.lang.Throwable -> Lac9
            java.lang.Long r11 = r11.m11373Z()     // Catch: java.lang.Throwable -> Lac9
            r22 = r15
            long r14 = r11.longValue()     // Catch: java.lang.Throwable -> Lac9
            double r14 = (double) r14     // Catch: java.lang.Throwable -> Lac9
            double r18 = r14 * r20
            goto L1ba
        L1b8:
            r22 = r15
        L1ba:
            r14 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r11 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r11 > 0) goto L1d4
            r14 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r11 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r11 < 0) goto L1d4
            long r14 = java.lang.Math.round(r18)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r11 = r2.f19951Y     // Catch: java.lang.Throwable -> Lac9
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> Lac9
            if (r11 == 0) goto L206
            long r14 = -r14
            goto L206
        L1d4:
            com.google.android.gms.measurement.internal.b r2 = r34.mo3162d()     // Catch: java.lang.Throwable -> Lac9
            o7.f3 r2 = r2.m3142s()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r10)     // Catch: java.lang.Throwable -> Lac9
            java.lang.Double r5 = java.lang.Double.valueOf(r18)     // Catch: java.lang.Throwable -> Lac9
            r2.m11171e(r3, r4, r5)     // Catch: java.lang.Throwable -> Lac9
            o7.j r2 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r2)     // Catch: java.lang.Throwable -> Lac9
            r2.m11273o()     // Catch: java.lang.Throwable -> Lac9
            o7.j r2 = r1.f19862c
            m11327I(r2)
            r2.m11269T()
            return
        L1fa:
            r22 = r15
            o7.o r11 = r2.f19952Z     // Catch: java.lang.Throwable -> Lac9
            java.lang.Long r11 = r11.m11373Z()     // Catch: java.lang.Throwable -> Lac9
            long r14 = r11.longValue()     // Catch: java.lang.Throwable -> Lac9
        L206:
            boolean r11 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> Lac9
            if (r11 != 0) goto L31f
            java.util.Locale r11 = java.util.Locale.US     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r11 = r13.toUpperCase(r11)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r12 = "[A-Z]{3}"
            boolean r12 = r11.matches(r12)     // Catch: java.lang.Throwable -> Lac9
            if (r12 == 0) goto L31f
            java.lang.String r12 = "_ltv_"
            int r13 = r11.length()     // Catch: java.lang.Throwable -> Lac9
            if (r13 == 0) goto L228
            java.lang.String r11 = r12.concat(r11)     // Catch: java.lang.Throwable -> Lac9
        L226:
            r13 = r11
            goto L22e
        L228:
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Throwable -> Lac9
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Lac9
            goto L226
        L22e:
            o7.j r11 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r11)     // Catch: java.lang.Throwable -> Lac9
            o7.r6 r11 = r11.m11260K(r10, r13)     // Catch: java.lang.Throwable -> Lac9
            if (r11 == 0) goto L275
            java.lang.Object r11 = r11.f19984e     // Catch: java.lang.Throwable -> Lac9
            boolean r12 = r11 instanceof java.lang.Long     // Catch: java.lang.Throwable -> Lac9
            if (r12 != 0) goto L240
            goto L275
        L240:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch: java.lang.Throwable -> Lac9
            long r11 = r11.longValue()     // Catch: java.lang.Throwable -> Lac9
            o7.r6 r18 = new o7.r6     // Catch: java.lang.Throwable -> Lac9
            r19 = r13
            java.lang.String r13 = r2.f19953a0     // Catch: java.lang.Throwable -> Lac9
            u6.c r20 = r34.mo3163e()     // Catch: java.lang.Throwable -> Lac9
            u6.d r20 = (p353u6.C6341d) r20     // Catch: java.lang.Throwable -> Lac9
            long r20 = r20.m12990a()     // Catch: java.lang.Throwable -> Lac9
            long r11 = r11 + r14
            java.lang.Long r23 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> Lac9
            r11 = r18
            r12 = r10
            r16 = r19
            r14 = 2
            r15 = 0
            r29 = r8
            r8 = 0
            r9 = 2
            r14 = r16
            r8 = r22
            r9 = 0
            r15 = r20
            r17 = r23
            r11.<init>(r12, r13, r14, r15, r17)     // Catch: java.lang.Throwable -> Lac9
        L272:
            r9 = r18
            goto L2e3
        L275:
            r29 = r8
            r16 = r13
            r8 = r22
            r9 = 0
            o7.j r11 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r11)     // Catch: java.lang.Throwable -> Lac9
            o7.f r12 = r34.m11340K()     // Catch: java.lang.Throwable -> Lac9
            o7.u2<java.lang.Integer> r13 = p249o7.C5120v2.f20060E     // Catch: java.lang.Throwable -> Lac9
            int r12 = r12.m11155o(r10, r13)     // Catch: java.lang.Throwable -> Lac9
            int r12 = r12 + (-1)
            com.google.android.gms.common.internal.C1101a.m3100e(r10)     // Catch: java.lang.Throwable -> Lac9
            r11.mo3183i()     // Catch: java.lang.Throwable -> Lac9
            r11.m11247j()     // Catch: java.lang.Throwable -> Lac9
            android.database.sqlite.SQLiteDatabase r13 = r11.m11253D()     // Catch: android.database.sqlite.SQLiteException -> L2b1 java.lang.Throwable -> Lac9
            r9 = 3
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch: android.database.sqlite.SQLiteException -> L2b1 java.lang.Throwable -> Lac9
            r17 = 0
            r9[r17] = r10     // Catch: android.database.sqlite.SQLiteException -> L2b1 java.lang.Throwable -> Lac9
            r9[r28] = r10     // Catch: android.database.sqlite.SQLiteException -> L2b1 java.lang.Throwable -> Lac9
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: android.database.sqlite.SQLiteException -> L2b1 java.lang.Throwable -> Lac9
            r17 = 2
            r9[r17] = r12     // Catch: android.database.sqlite.SQLiteException -> L2b1 java.lang.Throwable -> Lac9
            java.lang.String r12 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r13.execSQL(r12, r9)     // Catch: android.database.sqlite.SQLiteException -> L2b1 java.lang.Throwable -> Lac9
            goto L2c6
        L2b1:
            r0 = move-exception
            r9 = r0
            com.google.android.gms.measurement.internal.d r11 = r11.f5736a     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.b r11 = r11.mo3162d()     // Catch: java.lang.Throwable -> Lac9
            o7.f3 r11 = r11.m3140q()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r12 = "Error pruning currencies. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C1111b.m3134u(r10)     // Catch: java.lang.Throwable -> Lac9
            r11.m11171e(r12, r13, r9)     // Catch: java.lang.Throwable -> Lac9
        L2c6:
            o7.r6 r18 = new o7.r6     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r13 = r2.f19953a0     // Catch: java.lang.Throwable -> Lac9
            u6.c r9 = r34.mo3163e()     // Catch: java.lang.Throwable -> Lac9
            u6.d r9 = (p353u6.C6341d) r9     // Catch: java.lang.Throwable -> Lac9
            long r19 = r9.m12990a()     // Catch: java.lang.Throwable -> Lac9
            java.lang.Long r17 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> Lac9
            r11 = r18
            r12 = r10
            r14 = r16
            r15 = r19
            r11.<init>(r12, r13, r14, r15, r17)     // Catch: java.lang.Throwable -> Lac9
            goto L272
        L2e3:
            o7.j r11 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r11)     // Catch: java.lang.Throwable -> Lac9
            boolean r11 = r11.m11280v(r9)     // Catch: java.lang.Throwable -> Lac9
            if (r11 != 0) goto L323
            com.google.android.gms.measurement.internal.b r11 = r34.mo3162d()     // Catch: java.lang.Throwable -> Lac9
            o7.f3 r11 = r11.m3140q()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C1111b.m3134u(r10)     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.d r14 = r1.f19871l     // Catch: java.lang.Throwable -> Lac9
            o7.c3 r14 = r14.m3174s()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r15 = r9.f19982c     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r14 = r14.m11118f(r15)     // Catch: java.lang.Throwable -> Lac9
            java.lang.Object r9 = r9.f19984e     // Catch: java.lang.Throwable -> Lac9
            r11.m11172f(r12, r13, r14, r9)     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.f r11 = r34.m11345Q()     // Catch: java.lang.Throwable -> Lac9
            o7.s6 r12 = r1.f19859B     // Catch: java.lang.Throwable -> Lac9
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.m3196A(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lac9
            goto L323
        L31f:
            r29 = r8
            r8 = r22
        L323:
            java.lang.String r9 = r2.f19951Y     // Catch: java.lang.Throwable -> Lac9
            boolean r9 = com.google.android.gms.measurement.internal.C1115f.m3185W(r9)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r11 = r2.f19951Y     // Catch: java.lang.Throwable -> Lac9
            boolean r8 = r8.equals(r11)     // Catch: java.lang.Throwable -> Lac9
            r34.m11345Q()     // Catch: java.lang.Throwable -> Lac9
            o7.o r11 = r2.f19952Z     // Catch: java.lang.Throwable -> Lac9
            if (r11 != 0) goto L339
            r16 = 0
            goto L360
        L339:
            android.os.Bundle r12 = r11.f19913Y     // Catch: java.lang.Throwable -> Lac9
            java.util.Set r12 = r12.keySet()     // Catch: java.lang.Throwable -> Lac9
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> Lac9
            r16 = 0
        L345:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Throwable -> Lac9
            if (r13 == 0) goto L360
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> Lac9
            java.lang.Object r13 = r11.m11374a0(r13)     // Catch: java.lang.Throwable -> Lac9
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch: java.lang.Throwable -> Lac9
            if (r14 == 0) goto L345
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch: java.lang.Throwable -> Lac9
            int r13 = r13.length     // Catch: java.lang.Throwable -> Lac9
            long r13 = (long) r13     // Catch: java.lang.Throwable -> Lac9
            long r16 = r16 + r13
            goto L345
        L360:
            r23 = 1
            long r15 = r16 + r23
            o7.j r11 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r11)     // Catch: java.lang.Throwable -> Lac9
            long r12 = r34.m11363x()     // Catch: java.lang.Throwable -> Lac9
            r17 = 1
            r20 = 0
            r21 = 0
            r32 = r4
            r33 = r5
            r4 = 0
            r14 = r10
            r18 = r9
            r19 = r20
            r20 = r8
            o7.h r11 = r11.m11258I(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> Lac9
            long r12 = r11.f19712b     // Catch: java.lang.Throwable -> Lac9
            r34.m11340K()     // Catch: java.lang.Throwable -> Lac9
            o7.u2<java.lang.Integer> r14 = p249o7.C5120v2.f20102k     // Catch: java.lang.Throwable -> Lac9
            r15 = 0
            java.lang.Object r14 = r14.m11421a(r15)     // Catch: java.lang.Throwable -> Lac9
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch: java.lang.Throwable -> Lac9
            int r14 = r14.intValue()     // Catch: java.lang.Throwable -> Lac9
            long r14 = (long) r14     // Catch: java.lang.Throwable -> Lac9
            long r12 = r12 - r14
            r14 = 1000(0x3e8, double:4.94E-321)
            int r16 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r16 <= 0) goto L3cb
            long r12 = r12 % r14
            int r2 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r2 != 0) goto L3ba
            com.google.android.gms.measurement.internal.b r2 = r34.mo3162d()     // Catch: java.lang.Throwable -> Lac9
            o7.f3 r2 = r2.m3140q()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r10)     // Catch: java.lang.Throwable -> Lac9
            long r5 = r11.f19712b     // Catch: java.lang.Throwable -> Lac9
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lac9
            r2.m11171e(r3, r4, r5)     // Catch: java.lang.Throwable -> Lac9
        L3ba:
            o7.j r2 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r2)     // Catch: java.lang.Throwable -> Lac9
            r2.m11273o()     // Catch: java.lang.Throwable -> Lac9
            o7.j r2 = r1.f19862c
            m11327I(r2)
            r2.m11269T()
            return
        L3cb:
            if (r9 == 0) goto L428
            long r12 = r11.f19711a     // Catch: java.lang.Throwable -> Lac9
            r34.m11340K()     // Catch: java.lang.Throwable -> Lac9
            o7.u2<java.lang.Integer> r14 = p249o7.C5120v2.f20106m     // Catch: java.lang.Throwable -> Lac9
            r15 = 0
            java.lang.Object r14 = r14.m11421a(r15)     // Catch: java.lang.Throwable -> Lac9
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch: java.lang.Throwable -> Lac9
            int r14 = r14.intValue()     // Catch: java.lang.Throwable -> Lac9
            long r14 = (long) r14     // Catch: java.lang.Throwable -> Lac9
            long r12 = r12 - r14
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 <= 0) goto L428
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 % r14
            int r3 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r3 != 0) goto L403
            com.google.android.gms.measurement.internal.b r3 = r34.mo3162d()     // Catch: java.lang.Throwable -> Lac9
            o7.f3 r3 = r3.m3140q()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1111b.m3134u(r10)     // Catch: java.lang.Throwable -> Lac9
            long r6 = r11.f19711a     // Catch: java.lang.Throwable -> Lac9
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> Lac9
            r3.m11171e(r4, r5, r6)     // Catch: java.lang.Throwable -> Lac9
        L403:
            com.google.android.gms.measurement.internal.f r11 = r34.m11345Q()     // Catch: java.lang.Throwable -> Lac9
            o7.s6 r12 = r1.f19859B     // Catch: java.lang.Throwable -> Lac9
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f19951Y     // Catch: java.lang.Throwable -> Lac9
            r17 = 0
            r13 = r10
            r16 = r2
            r11.m3196A(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lac9
            o7.j r2 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r2)     // Catch: java.lang.Throwable -> Lac9
            r2.m11273o()     // Catch: java.lang.Throwable -> Lac9
            o7.j r2 = r1.f19862c
            m11327I(r2)
            r2.m11269T()
            return
        L428:
            r12 = 1000000(0xf4240, float:1.401298E-39)
            if (r8 == 0) goto L478
            long r13 = r11.f19714d     // Catch: java.lang.Throwable -> Lac9
            o7.f r8 = r34.m11340K()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r15 = r3.f20031Y     // Catch: java.lang.Throwable -> Lac9
            o7.u2<java.lang.Integer> r4 = p249o7.C5120v2.f20104l     // Catch: java.lang.Throwable -> Lac9
            int r4 = r8.m11155o(r15, r4)     // Catch: java.lang.Throwable -> Lac9
            int r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> Lac9
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)     // Catch: java.lang.Throwable -> Lac9
            long r4 = (long) r4     // Catch: java.lang.Throwable -> Lac9
            long r13 = r13 - r4
            r4 = 0
            int r8 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r8 <= 0) goto L478
            int r2 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r2 != 0) goto L467
            com.google.android.gms.measurement.internal.b r2 = r34.mo3162d()     // Catch: java.lang.Throwable -> Lac9
            o7.f3 r2 = r2.m3140q()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r10)     // Catch: java.lang.Throwable -> Lac9
            long r5 = r11.f19714d     // Catch: java.lang.Throwable -> Lac9
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lac9
            r2.m11171e(r3, r4, r5)     // Catch: java.lang.Throwable -> Lac9
        L467:
            o7.j r2 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r2)     // Catch: java.lang.Throwable -> Lac9
            r2.m11273o()     // Catch: java.lang.Throwable -> Lac9
            o7.j r2 = r1.f19862c
            m11327I(r2)
            r2.m11269T()
            return
        L478:
            o7.o r4 = r2.f19952Z     // Catch: java.lang.Throwable -> Lac9
            android.os.Bundle r4 = r4.m11371X()     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.f r5 = r34.m11345Q()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r8 = "_o"
            java.lang.String r11 = r2.f19953a0     // Catch: java.lang.Throwable -> Lac9
            r5.m3197B(r4, r8, r11)     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.f r5 = r34.m11345Q()     // Catch: java.lang.Throwable -> Lac9
            boolean r5 = r5.m3214S(r10)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r8 = "_r"
            if (r5 == 0) goto L4a9
            com.google.android.gms.measurement.internal.f r5 = r34.m11345Q()     // Catch: java.lang.Throwable -> Lac9
            java.lang.Long r11 = java.lang.Long.valueOf(r23)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r13 = "_dbg"
            r5.m3197B(r4, r13, r11)     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.f r5 = r34.m11345Q()     // Catch: java.lang.Throwable -> Lac9
            r5.m3197B(r4, r8, r11)     // Catch: java.lang.Throwable -> Lac9
        L4a9:
            java.lang.String r5 = "_s"
            java.lang.String r11 = r2.f19951Y     // Catch: java.lang.Throwable -> Lac9
            boolean r5 = r5.equals(r11)     // Catch: java.lang.Throwable -> Lac9
            if (r5 == 0) goto L4cf
            o7.j r5 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r5)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r11 = r3.f20031Y     // Catch: java.lang.Throwable -> Lac9
            o7.r6 r5 = r5.m11260K(r11, r7)     // Catch: java.lang.Throwable -> Lac9
            if (r5 == 0) goto L4cf
            java.lang.Object r11 = r5.f19984e     // Catch: java.lang.Throwable -> Lac9
            boolean r11 = r11 instanceof java.lang.Long     // Catch: java.lang.Throwable -> Lac9
            if (r11 == 0) goto L4cf
            com.google.android.gms.measurement.internal.f r11 = r34.m11345Q()     // Catch: java.lang.Throwable -> Lac9
            java.lang.Object r5 = r5.f19984e     // Catch: java.lang.Throwable -> Lac9
            r11.m3197B(r4, r7, r5)     // Catch: java.lang.Throwable -> Lac9
        L4cf:
            o7.j r5 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r5)     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.common.internal.C1101a.m3100e(r10)     // Catch: java.lang.Throwable -> Lac9
            r5.mo3183i()     // Catch: java.lang.Throwable -> Lac9
            r5.m11247j()     // Catch: java.lang.Throwable -> Lac9
            android.database.sqlite.SQLiteDatabase r7 = r5.m11253D()     // Catch: android.database.sqlite.SQLiteException -> L50c java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.d r11 = r5.f5736a     // Catch: android.database.sqlite.SQLiteException -> L50c java.lang.Throwable -> Lac9
            o7.f r11 = r11.m3170o()     // Catch: android.database.sqlite.SQLiteException -> L50c java.lang.Throwable -> Lac9
            o7.u2<java.lang.Integer> r13 = p249o7.C5120v2.f20112p     // Catch: android.database.sqlite.SQLiteException -> L50c java.lang.Throwable -> Lac9
            int r11 = r11.m11155o(r10, r13)     // Catch: android.database.sqlite.SQLiteException -> L50c java.lang.Throwable -> Lac9
            int r11 = java.lang.Math.min(r12, r11)     // Catch: android.database.sqlite.SQLiteException -> L50c java.lang.Throwable -> Lac9
            r15 = 0
            int r11 = java.lang.Math.max(r15, r11)     // Catch: android.database.sqlite.SQLiteException -> L509 java.lang.Throwable -> Lac9
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: android.database.sqlite.SQLiteException -> L509 java.lang.Throwable -> Lac9
            r12 = 2
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch: android.database.sqlite.SQLiteException -> L509 java.lang.Throwable -> Lac9
            r12[r15] = r10     // Catch: android.database.sqlite.SQLiteException -> L509 java.lang.Throwable -> Lac9
            r12[r28] = r11     // Catch: android.database.sqlite.SQLiteException -> L509 java.lang.Throwable -> Lac9
            java.lang.String r11 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            int r5 = r7.delete(r6, r11, r12)     // Catch: android.database.sqlite.SQLiteException -> L509 java.lang.Throwable -> Lac9
            long r11 = (long) r5
            goto L524
        L509:
            r0 = move-exception
        L50a:
            r7 = r0
            goto L50f
        L50c:
            r0 = move-exception
            r15 = 0
            goto L50a
        L50f:
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: java.lang.Throwable -> Lac9
            o7.f3 r5 = r5.m3140q()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r11 = "Error deleting over the limit events. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C1111b.m3134u(r10)     // Catch: java.lang.Throwable -> Lac9
            r5.m11171e(r11, r12, r7)     // Catch: java.lang.Throwable -> Lac9
            r11 = 0
        L524:
            r13 = 0
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 <= 0) goto L53f
            com.google.android.gms.measurement.internal.b r5 = r34.mo3162d()     // Catch: java.lang.Throwable -> Lac9
            o7.f3 r5 = r5.m3142s()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r7 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C1111b.m3134u(r10)     // Catch: java.lang.Throwable -> Lac9
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> Lac9
            r5.m11171e(r7, r13, r11)     // Catch: java.lang.Throwable -> Lac9
        L53f:
            o7.m r5 = new o7.m     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.d r12 = r1.f19871l     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r13 = r2.f19953a0     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r7 = r2.f19951Y     // Catch: java.lang.Throwable -> Lac9
            long r2 = r2.f19954b0     // Catch: java.lang.Throwable -> Lac9
            r18 = 0
            r11 = r5
            r14 = r10
            r31 = 0
            r15 = r7
            r16 = r2
            r20 = r4
            r11.<init>(r12, r13, r14, r15, r16, r18, r20)     // Catch: java.lang.Throwable -> Lac9
            o7.j r2 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r2)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r3 = r5.f19834b     // Catch: java.lang.Throwable -> Lac9
            o7.n r2 = r2.m11259J(r10, r3)     // Catch: java.lang.Throwable -> Lac9
            if (r2 != 0) goto L5dd
            o7.j r2 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r2)     // Catch: java.lang.Throwable -> Lac9
            long r2 = r2.m11252C(r10)     // Catch: java.lang.Throwable -> Lac9
            o7.f r4 = r34.m11340K()     // Catch: java.lang.Throwable -> Lac9
            int r4 = r4.m11152l(r10)     // Catch: java.lang.Throwable -> Lac9
            long r11 = (long) r4     // Catch: java.lang.Throwable -> Lac9
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 < 0) goto L5bf
            if (r9 == 0) goto L5bf
            com.google.android.gms.measurement.internal.b r2 = r34.mo3162d()     // Catch: java.lang.Throwable -> Lac9
            o7.f3 r2 = r2.m3140q()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r10)     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.d r6 = r1.f19871l     // Catch: java.lang.Throwable -> Lac9
            o7.c3 r6 = r6.m3174s()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r5 = r5.f19834b     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r5 = r6.m11116d(r5)     // Catch: java.lang.Throwable -> Lac9
            o7.f r6 = r34.m11340K()     // Catch: java.lang.Throwable -> Lac9
            int r6 = r6.m11152l(r10)     // Catch: java.lang.Throwable -> Lac9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lac9
            r2.m11172f(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.f r11 = r34.m11345Q()     // Catch: java.lang.Throwable -> Lac9
            o7.s6 r12 = r1.f19859B     // Catch: java.lang.Throwable -> Lac9
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.m3196A(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lac9
            o7.j r2 = r1.f19862c
            m11327I(r2)
            r2.m11269T()
            return
        L5bf:
            o7.n r2 = new o7.n     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r13 = r5.f19834b     // Catch: java.lang.Throwable -> Lac9
            long r3 = r5.f19836d     // Catch: java.lang.Throwable -> Lac9
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r2
            r12 = r10
            r20 = r3
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch: java.lang.Throwable -> Lac9
            goto L5eb
        L5dd:
            com.google.android.gms.measurement.internal.d r3 = r1.f19871l     // Catch: java.lang.Throwable -> Lac9
            long r9 = r2.f19891f     // Catch: java.lang.Throwable -> Lac9
            o7.m r5 = r5.m11313a(r3, r9)     // Catch: java.lang.Throwable -> Lac9
            long r3 = r5.f19836d     // Catch: java.lang.Throwable -> Lac9
            o7.n r2 = r2.m11368c(r3)     // Catch: java.lang.Throwable -> Lac9
        L5eb:
            o7.j r3 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r3)     // Catch: java.lang.Throwable -> Lac9
            r3.m11275q(r2)     // Catch: java.lang.Throwable -> Lac9
            o7.f4 r2 = r34.mo3160b()     // Catch: java.lang.Throwable -> Lac9
            r2.mo3183i()     // Catch: java.lang.Throwable -> Lac9
            r34.m11348g()     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.common.internal.C1101a.m3103h(r5)     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.common.internal.C1101a.m3103h(r36)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r2 = r5.f19833a     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.common.internal.C1101a.m3100e(r2)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r2 = r5.f19833a     // Catch: java.lang.Throwable -> Lac9
            r3 = r36
            java.lang.String r4 = r3.f20031Y     // Catch: java.lang.Throwable -> Lac9
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.common.internal.C1101a.m3096a(r2)     // Catch: java.lang.Throwable -> Lac9
            k7.c3 r2 = p185k7.C3770d3.m8424z1()     // Catch: java.lang.Throwable -> Lac9
            r2.m8250R()     // Catch: java.lang.Throwable -> Lac9
            r2.m8246M()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r4 = r3.f20031Y     // Catch: java.lang.Throwable -> Lac9
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lac9
            if (r4 != 0) goto L62c
            java.lang.String r4 = r3.f20031Y     // Catch: java.lang.Throwable -> Lac9
            r2.m8274p(r4)     // Catch: java.lang.Throwable -> Lac9
        L62c:
            java.lang.String r4 = r3.f20034b0     // Catch: java.lang.Throwable -> Lac9
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lac9
            if (r4 != 0) goto L639
            java.lang.String r4 = r3.f20034b0     // Catch: java.lang.Throwable -> Lac9
            r2.m8278r(r4)     // Catch: java.lang.Throwable -> Lac9
        L639:
            java.lang.String r4 = r3.f20033a0     // Catch: java.lang.Throwable -> Lac9
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lac9
            if (r4 != 0) goto L646
            java.lang.String r4 = r3.f20033a0     // Catch: java.lang.Throwable -> Lac9
            r2.m8280s(r4)     // Catch: java.lang.Throwable -> Lac9
        L646:
            long r9 = r3.f20040h0     // Catch: java.lang.Throwable -> Lac9
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 == 0) goto L653
            int r4 = (int) r9     // Catch: java.lang.Throwable -> Lac9
            r2.m8282t(r4)     // Catch: java.lang.Throwable -> Lac9
        L653:
            long r9 = r3.f20035c0     // Catch: java.lang.Throwable -> Lac9
            r2.m8242H(r9)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r4 = r3.f20032Z     // Catch: java.lang.Throwable -> Lac9
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lac9
            if (r4 != 0) goto L665
            java.lang.String r4 = r3.f20032Z     // Catch: java.lang.Throwable -> Lac9
            r2.m8241G(r4)     // Catch: java.lang.Throwable -> Lac9
        L665:
            java.lang.String r4 = r3.f20031Y     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.common.internal.C1101a.m3103h(r4)     // Catch: java.lang.Throwable -> Lac9
            o7.g r4 = r1.m11341L(r4)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r7 = r3.f20052t0     // Catch: java.lang.Throwable -> Lac9
            o7.g r7 = p249o7.C4997g.m11182b(r7)     // Catch: java.lang.Throwable -> Lac9
            o7.g r4 = r4.m11187c(r7)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r4 = r4.m11188e()     // Catch: java.lang.Throwable -> Lac9
            r2.m8290x(r4)     // Catch: java.lang.Throwable -> Lac9
            p185k7.C3847ia.m8706c()     // Catch: java.lang.Throwable -> Lac9
            o7.f r4 = r34.m11340K()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r7 = r3.f20031Y     // Catch: java.lang.Throwable -> Lac9
            o7.u2<java.lang.Boolean> r9 = p249o7.C5120v2.f20089d0     // Catch: java.lang.Throwable -> Lac9
            boolean r4 = r4.m11162v(r7, r9)     // Catch: java.lang.Throwable -> Lac9
            if (r4 == 0) goto L6c6
            java.lang.String r4 = r2.m8260b0()     // Catch: java.lang.Throwable -> Lac9
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lac9
            if (r4 == 0) goto L6a7
            java.lang.String r4 = r3.f20051s0     // Catch: java.lang.Throwable -> Lac9
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lac9
            if (r4 != 0) goto L6a7
            java.lang.String r4 = r3.f20051s0     // Catch: java.lang.Throwable -> Lac9
            r2.m8240F(r4)     // Catch: java.lang.Throwable -> Lac9
        L6a7:
            java.lang.String r4 = r2.m8260b0()     // Catch: java.lang.Throwable -> Lac9
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lac9
            if (r4 == 0) goto L6dc
            java.lang.String r4 = r2.m8259a0()     // Catch: java.lang.Throwable -> Lac9
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lac9
            if (r4 == 0) goto L6dc
            java.lang.String r4 = r3.f20047o0     // Catch: java.lang.Throwable -> Lac9
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lac9
            if (r4 != 0) goto L6dc
        L6c3:
            java.lang.String r4 = r3.f20047o0     // Catch: java.lang.Throwable -> Lac9
            goto L6d9
        L6c6:
            java.lang.String r4 = r2.m8260b0()     // Catch: java.lang.Throwable -> Lac9
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lac9
            if (r4 == 0) goto L6dc
            java.lang.String r4 = r3.f20047o0     // Catch: java.lang.Throwable -> Lac9
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lac9
            if (r4 != 0) goto L6dc
            goto L6c3
        L6d9:
            r2.m8234A0(r4)     // Catch: java.lang.Throwable -> Lac9
        L6dc:
            long r9 = r3.f20036d0     // Catch: java.lang.Throwable -> Lac9
            r11 = 0
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 == 0) goto L6e7
            r2.m8292y(r9)     // Catch: java.lang.Throwable -> Lac9
        L6e7:
            long r9 = r3.f20049q0     // Catch: java.lang.Throwable -> Lac9
            r2.m8235B(r9)     // Catch: java.lang.Throwable -> Lac9
            o7.o6 r4 = r1.f19866g     // Catch: java.lang.Throwable -> Lac9
            m11327I(r4)     // Catch: java.lang.Throwable -> Lac9
            o7.m6 r7 = r4.f19756b     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.d r7 = r7.f19871l     // Catch: java.lang.Throwable -> Lac9
            android.content.Context r7 = r7.mo3161c()     // Catch: java.lang.Throwable -> Lac9
            java.util.Map r7 = p249o7.C5120v2.m11424b(r7)     // Catch: java.lang.Throwable -> Lac9
            if (r7 == 0) goto L784
            int r9 = r7.size()     // Catch: java.lang.Throwable -> Lac9
            if (r9 != 0) goto L707
            goto L784
        L707:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lac9
            r14.<init>()     // Catch: java.lang.Throwable -> Lac9
            o7.u2<java.lang.Integer> r9 = p249o7.C5120v2.f20071P     // Catch: java.lang.Throwable -> Lac9
            r10 = 0
            java.lang.Object r9 = r9.m11421a(r10)     // Catch: java.lang.Throwable -> Lac9
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Throwable -> Lac9
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> Lac9
            java.util.Set r7 = r7.entrySet()     // Catch: java.lang.Throwable -> Lac9
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lac9
        L721:
            boolean r10 = r7.hasNext()     // Catch: java.lang.Throwable -> Lac9
            if (r10 == 0) goto L77e
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> Lac9
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch: java.lang.Throwable -> Lac9
            java.lang.Object r11 = r10.getKey()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r12 = "measurement.id."
            boolean r11 = r11.startsWith(r12)     // Catch: java.lang.Throwable -> Lac9
            if (r11 == 0) goto L721
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.NumberFormatException -> L76c java.lang.Throwable -> Lac9
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.NumberFormatException -> L76c java.lang.Throwable -> Lac9
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.NumberFormatException -> L76c java.lang.Throwable -> Lac9
            if (r10 == 0) goto L721
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.NumberFormatException -> L76c java.lang.Throwable -> Lac9
            r14.add(r10)     // Catch: java.lang.NumberFormatException -> L76c java.lang.Throwable -> Lac9
            int r10 = r14.size()     // Catch: java.lang.NumberFormatException -> L76c java.lang.Throwable -> Lac9
            if (r10 < r9) goto L721
            com.google.android.gms.measurement.internal.d r10 = r4.f5736a     // Catch: java.lang.NumberFormatException -> L76c java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.b r10 = r10.mo3162d()     // Catch: java.lang.NumberFormatException -> L76c java.lang.Throwable -> Lac9
            o7.f3 r10 = r10.m3142s()     // Catch: java.lang.NumberFormatException -> L76c java.lang.Throwable -> Lac9
            java.lang.String r11 = "Too many experiment IDs. Number of IDs"
            int r12 = r14.size()     // Catch: java.lang.NumberFormatException -> L76c java.lang.Throwable -> Lac9
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.NumberFormatException -> L76c java.lang.Throwable -> Lac9
            r10.m11170d(r11, r12)     // Catch: java.lang.NumberFormatException -> L76c java.lang.Throwable -> Lac9
            goto L77e
        L76c:
            r0 = move-exception
            r10 = r0
            com.google.android.gms.measurement.internal.d r11 = r4.f5736a     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.b r11 = r11.mo3162d()     // Catch: java.lang.Throwable -> Lac9
            o7.f3 r11 = r11.m3142s()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r12 = "Experiment ID NumberFormatException"
            r11.m11170d(r12, r10)     // Catch: java.lang.Throwable -> Lac9
            goto L721
        L77e:
            int r4 = r14.size()     // Catch: java.lang.Throwable -> Lac9
            if (r4 != 0) goto L785
        L784:
            r14 = 0
        L785:
            if (r14 == 0) goto L78a
            r2.m8269k0(r14)     // Catch: java.lang.Throwable -> Lac9
        L78a:
            java.lang.String r4 = r3.f20031Y     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.common.internal.C1101a.m3103h(r4)     // Catch: java.lang.Throwable -> Lac9
            o7.g r4 = r1.m11341L(r4)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r7 = r3.f20052t0     // Catch: java.lang.Throwable -> Lac9
            o7.g r7 = p249o7.C4997g.m11182b(r7)     // Catch: java.lang.Throwable -> Lac9
            o7.g r4 = r4.m11187c(r7)     // Catch: java.lang.Throwable -> Lac9
            boolean r7 = r4.m11189f()     // Catch: java.lang.Throwable -> Lac9
            if (r7 == 0) goto L7cd
            o7.w5 r7 = r1.f19868i     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r9 = r3.f20031Y     // Catch: java.lang.Throwable -> Lac9
            android.util.Pair r7 = r7.m11440n(r9, r4)     // Catch: java.lang.Throwable -> Lac9
            java.lang.Object r9 = r7.first     // Catch: java.lang.Throwable -> Lac9
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch: java.lang.Throwable -> Lac9
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> Lac9
            if (r9 != 0) goto L7cd
            boolean r9 = r3.f20045m0     // Catch: java.lang.Throwable -> Lac9
            if (r9 == 0) goto L7cd
            java.lang.Object r9 = r7.first     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> Lac9
            r2.m8251S(r9)     // Catch: java.lang.Throwable -> Lac9
            java.lang.Object r7 = r7.second     // Catch: java.lang.Throwable -> Lac9
            if (r7 == 0) goto L7cd
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> Lac9
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> Lac9
            r2.m8244J(r7)     // Catch: java.lang.Throwable -> Lac9
        L7cd:
            com.google.android.gms.measurement.internal.d r7 = r1.f19871l     // Catch: java.lang.Throwable -> Lac9
            o7.l r7 = r7.m3171p()     // Catch: java.lang.Throwable -> Lac9
            r7.m11315l()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r7 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> Lac9
            r2.m8294z(r7)     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.d r7 = r1.f19871l     // Catch: java.lang.Throwable -> Lac9
            o7.l r7 = r7.m3171p()     // Catch: java.lang.Throwable -> Lac9
            r7.m11315l()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r7 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> Lac9
            r2.m8245K(r7)     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.d r7 = r1.f19871l     // Catch: java.lang.Throwable -> Lac9
            o7.l r7 = r7.m3171p()     // Catch: java.lang.Throwable -> Lac9
            long r9 = r7.m11291q()     // Catch: java.lang.Throwable -> Lac9
            int r7 = (int) r9     // Catch: java.lang.Throwable -> Lac9
            r2.m8254V(r7)     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.d r7 = r1.f19871l     // Catch: java.lang.Throwable -> Lac9
            o7.l r7 = r7.m3171p()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r7 = r7.m11292r()     // Catch: java.lang.Throwable -> Lac9
            r2.m8256X(r7)     // Catch: java.lang.Throwable -> Lac9
            o7.f r7 = r34.m11340K()     // Catch: java.lang.Throwable -> Lac9
            o7.u2<java.lang.Boolean> r9 = p249o7.C5120v2.f20107m0     // Catch: java.lang.Throwable -> Lac9
            r10 = 0
            boolean r7 = r7.m11162v(r10, r9)     // Catch: java.lang.Throwable -> Lac9
            if (r7 != 0) goto L816
            long r10 = r3.f20042j0     // Catch: java.lang.Throwable -> Lac9
            r2.m8236B0(r10)     // Catch: java.lang.Throwable -> Lac9
        L816:
            com.google.android.gms.measurement.internal.d r7 = r1.f19871l     // Catch: java.lang.Throwable -> Lac9
            boolean r7 = r7.m3165g()     // Catch: java.lang.Throwable -> Lac9
            if (r7 == 0) goto L82d
            r2.m8258Z()     // Catch: java.lang.Throwable -> Lac9
            r7 = 0
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Lac9
            if (r10 == 0) goto L829
            goto L82d
        L829:
            r2.m8233A()     // Catch: java.lang.Throwable -> Lac9
            throw r7     // Catch: java.lang.Throwable -> Lac9
        L82d:
            o7.j r7 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r7)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r10 = r3.f20031Y     // Catch: java.lang.Throwable -> Lac9
            o7.h4 r7 = r7.m11255F(r10)     // Catch: java.lang.Throwable -> Lac9
            if (r7 != 0) goto L8ab
            o7.h4 r7 = new o7.h4     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.d r10 = r1.f19871l     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r11 = r3.f20031Y     // Catch: java.lang.Throwable -> Lac9
            r7.<init>(r10, r11)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r10 = r1.m11346R(r4)     // Catch: java.lang.Throwable -> Lac9
            r7.m11225f(r10)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r10 = r3.f20041i0     // Catch: java.lang.Throwable -> Lac9
            r7.m11233n(r10)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r10 = r3.f20032Z     // Catch: java.lang.Throwable -> Lac9
            r7.m11235p(r10)     // Catch: java.lang.Throwable -> Lac9
            boolean r10 = r4.m11189f()     // Catch: java.lang.Throwable -> Lac9
            if (r10 == 0) goto L865
            o7.w5 r10 = r1.f19868i     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r11 = r3.f20031Y     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r10 = r10.m11441o(r11)     // Catch: java.lang.Throwable -> Lac9
            r7.m11243x(r10)     // Catch: java.lang.Throwable -> Lac9
        L865:
            r10 = 0
            r7.m11240u(r10)     // Catch: java.lang.Throwable -> Lac9
            r7.m11241v(r10)     // Catch: java.lang.Throwable -> Lac9
            r7.m11239t(r10)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r10 = r3.f20033a0     // Catch: java.lang.Throwable -> Lac9
            r7.m11227h(r10)     // Catch: java.lang.Throwable -> Lac9
            long r10 = r3.f20040h0     // Catch: java.lang.Throwable -> Lac9
            r7.m11228i(r10)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r10 = r3.f20034b0     // Catch: java.lang.Throwable -> Lac9
            r7.m11226g(r10)     // Catch: java.lang.Throwable -> Lac9
            long r10 = r3.f20035c0     // Catch: java.lang.Throwable -> Lac9
            r7.m11236q(r10)     // Catch: java.lang.Throwable -> Lac9
            long r10 = r3.f20036d0     // Catch: java.lang.Throwable -> Lac9
            r7.m11230k(r10)     // Catch: java.lang.Throwable -> Lac9
            boolean r10 = r3.f20038f0     // Catch: java.lang.Throwable -> Lac9
            r7.m11242w(r10)     // Catch: java.lang.Throwable -> Lac9
            o7.f r10 = r34.m11340K()     // Catch: java.lang.Throwable -> Lac9
            r11 = 0
            boolean r9 = r10.m11162v(r11, r9)     // Catch: java.lang.Throwable -> Lac9
            if (r9 != 0) goto L89e
            long r9 = r3.f20042j0     // Catch: java.lang.Throwable -> Lac9
            r7.m11224e(r9)     // Catch: java.lang.Throwable -> Lac9
        L89e:
            long r9 = r3.f20049q0     // Catch: java.lang.Throwable -> Lac9
            r7.m11231l(r9)     // Catch: java.lang.Throwable -> Lac9
            o7.j r9 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r9)     // Catch: java.lang.Throwable -> Lac9
            r9.m11274p(r7)     // Catch: java.lang.Throwable -> Lac9
        L8ab:
            boolean r4 = r4.m11190g()     // Catch: java.lang.Throwable -> Lac9
            if (r4 == 0) goto L8c5
            java.lang.String r4 = r7.m11214N()     // Catch: java.lang.Throwable -> Lac9
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lac9
            if (r4 != 0) goto L8c5
            java.lang.String r4 = r7.m11214N()     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.common.internal.C1101a.m3103h(r4)     // Catch: java.lang.Throwable -> Lac9
            r2.m8276q(r4)     // Catch: java.lang.Throwable -> Lac9
        L8c5:
            java.lang.String r4 = r7.m11217Q()     // Catch: java.lang.Throwable -> Lac9
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lac9
            if (r4 != 0) goto L8d9
            java.lang.String r4 = r7.m11217Q()     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.common.internal.C1101a.m3103h(r4)     // Catch: java.lang.Throwable -> Lac9
            r2.m8239E(r4)     // Catch: java.lang.Throwable -> Lac9
        L8d9:
            o7.j r4 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r4)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r3 = r3.f20031Y     // Catch: java.lang.Throwable -> Lac9
            java.util.List r3 = r4.m11265P(r3)     // Catch: java.lang.Throwable -> Lac9
            r13 = 0
        L8e5:
            int r4 = r3.size()     // Catch: java.lang.Throwable -> Lac9
            if (r13 >= r4) goto L91b
            k7.l3 r4 = p185k7.C3894m3.m8804v()     // Catch: java.lang.Throwable -> Lac9
            java.lang.Object r7 = r3.get(r13)     // Catch: java.lang.Throwable -> Lac9
            o7.r6 r7 = (p249o7.C5092r6) r7     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r7 = r7.f19982c     // Catch: java.lang.Throwable -> Lac9
            r4.m8792q(r7)     // Catch: java.lang.Throwable -> Lac9
            java.lang.Object r7 = r3.get(r13)     // Catch: java.lang.Throwable -> Lac9
            o7.r6 r7 = (p249o7.C5092r6) r7     // Catch: java.lang.Throwable -> Lac9
            long r9 = r7.f19983d     // Catch: java.lang.Throwable -> Lac9
            r4.m8793r(r9)     // Catch: java.lang.Throwable -> Lac9
            o7.o6 r7 = r1.f19866g     // Catch: java.lang.Throwable -> Lac9
            m11327I(r7)     // Catch: java.lang.Throwable -> Lac9
            java.lang.Object r9 = r3.get(r13)     // Catch: java.lang.Throwable -> Lac9
            o7.r6 r9 = (p249o7.C5092r6) r9     // Catch: java.lang.Throwable -> Lac9
            java.lang.Object r9 = r9.f19984e     // Catch: java.lang.Throwable -> Lac9
            r7.m11403L(r4, r9)     // Catch: java.lang.Throwable -> Lac9
            r2.m8271m0(r4)     // Catch: java.lang.Throwable -> Lac9
            int r13 = r13 + 1
            goto L8e5
        L91b:
            o7.j r3 = r1.f19862c     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            m11327I(r3)     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            k7.d6 r4 = r2.m8201f()     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            k7.d3 r4 = (p185k7.C3770d3) r4     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            r3.mo3183i()     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            r3.m11247j()     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            com.google.android.gms.common.internal.C1101a.m3103h(r4)     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            java.lang.String r7 = r4.m8431D1()     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            com.google.android.gms.common.internal.C1101a.m3100e(r7)     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            byte[] r7 = r4.m9160i()     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            o7.m6 r9 = r3.f19756b     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            o7.o6 r9 = r9.f19866g     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            m11327I(r9)     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            long r9 = r9.m11408y(r7)     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            r11.<init>()     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            java.lang.String r12 = r4.m8431D1()     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            r13 = r33
            r11.put(r13, r12)     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            java.lang.Long r12 = java.lang.Long.valueOf(r9)     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            r14 = r32
            r11.put(r14, r12)     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            java.lang.String r12 = "metadata"
            r11.put(r12, r7)     // Catch: java.io.IOException -> La7d java.lang.Throwable -> Lac9
            android.database.sqlite.SQLiteDatabase r7 = r3.m11253D()     // Catch: android.database.sqlite.SQLiteException -> La61 java.io.IOException -> La7d java.lang.Throwable -> Lac9
            java.lang.String r12 = "raw_events_metadata"
            r15 = 4
            r16 = r2
            r2 = 0
            r7.insertWithOnConflict(r12, r2, r11, r15)     // Catch: java.io.IOException -> La5c android.database.sqlite.SQLiteException -> La5f java.lang.Throwable -> Lac9
            o7.j r2 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r2)     // Catch: java.lang.Throwable -> Lac9
            o7.o r3 = r5.f19838f     // Catch: java.lang.Throwable -> Lac9
            android.os.Bundle r3 = r3.f19913Y     // Catch: java.lang.Throwable -> Lac9
            java.util.Set r3 = r3.keySet()     // Catch: java.lang.Throwable -> Lac9
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lac9
        L97f:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lac9
            if (r4 == 0) goto L992
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lac9
            boolean r4 = r8.equals(r4)     // Catch: java.lang.Throwable -> Lac9
            if (r4 == 0) goto L97f
            goto L9cc
        L992:
            o7.a4 r3 = r1.f19860a     // Catch: java.lang.Throwable -> Lac9
            m11327I(r3)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r4 = r5.f19833a     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r7 = r5.f19834b     // Catch: java.lang.Throwable -> Lac9
            boolean r3 = r3.m11095r(r4, r7)     // Catch: java.lang.Throwable -> Lac9
            o7.j r15 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r15)     // Catch: java.lang.Throwable -> Lac9
            long r16 = r34.m11363x()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r4 = r5.f19833a     // Catch: java.lang.Throwable -> Lac9
            r19 = 0
            r20 = 0
            r18 = r4
            o7.h r4 = r15.m11257H(r16, r18, r19, r20)     // Catch: java.lang.Throwable -> Lac9
            if (r3 == 0) goto L9ca
            long r3 = r4.f19715e     // Catch: java.lang.Throwable -> Lac9
            o7.f r7 = r34.m11340K()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r8 = r5.f19833a     // Catch: java.lang.Throwable -> Lac9
            o7.u2<java.lang.Integer> r11 = p249o7.C5120v2.f20110o     // Catch: java.lang.Throwable -> Lac9
            int r7 = r7.m11155o(r8, r11)     // Catch: java.lang.Throwable -> Lac9
            long r7 = (long) r7     // Catch: java.lang.Throwable -> Lac9
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 >= 0) goto L9ca
            goto L9cc
        L9ca:
            r28 = 0
        L9cc:
            r2.mo3183i()     // Catch: java.lang.Throwable -> Lac9
            r2.m11247j()     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.common.internal.C1101a.m3103h(r5)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r3 = r5.f19833a     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.common.internal.C1101a.m3100e(r3)     // Catch: java.lang.Throwable -> Lac9
            o7.m6 r3 = r2.f19756b     // Catch: java.lang.Throwable -> Lac9
            o7.o6 r3 = r3.f19866g     // Catch: java.lang.Throwable -> Lac9
            m11327I(r3)     // Catch: java.lang.Throwable -> Lac9
            k7.u2 r3 = r3.m11397C(r5)     // Catch: java.lang.Throwable -> Lac9
            byte[] r3 = r3.m9160i()     // Catch: java.lang.Throwable -> Lac9
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch: java.lang.Throwable -> Lac9
            r4.<init>()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r7 = r5.f19833a     // Catch: java.lang.Throwable -> Lac9
            r4.put(r13, r7)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.f19834b     // Catch: java.lang.Throwable -> Lac9
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r7 = "timestamp"
            long r11 = r5.f19836d     // Catch: java.lang.Throwable -> Lac9
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> Lac9
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> Lac9
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> Lac9
            r4.put(r14, r7)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r7 = "data"
            r4.put(r7, r3)     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r3 = "realtime"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r28)     // Catch: java.lang.Throwable -> Lac9
            r4.put(r3, r7)     // Catch: java.lang.Throwable -> Lac9
            android.database.sqlite.SQLiteDatabase r3 = r2.m11253D()     // Catch: android.database.sqlite.SQLiteException -> La44 java.lang.Throwable -> Lac9
            r7 = 0
            long r3 = r3.insert(r6, r7, r4)     // Catch: android.database.sqlite.SQLiteException -> La44 java.lang.Throwable -> Lac9
            r6 = -1
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto La3f
            com.google.android.gms.measurement.internal.d r3 = r2.f5736a     // Catch: android.database.sqlite.SQLiteException -> La44 java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()     // Catch: android.database.sqlite.SQLiteException -> La44 java.lang.Throwable -> Lac9
            o7.f3 r3 = r3.m3140q()     // Catch: android.database.sqlite.SQLiteException -> La44 java.lang.Throwable -> Lac9
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r6 = r5.f19833a     // Catch: android.database.sqlite.SQLiteException -> La44 java.lang.Throwable -> Lac9
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1111b.m3134u(r6)     // Catch: android.database.sqlite.SQLiteException -> La44 java.lang.Throwable -> Lac9
            r3.m11170d(r4, r6)     // Catch: android.database.sqlite.SQLiteException -> La44 java.lang.Throwable -> Lac9
            goto La96
        La3f:
            r2 = 0
            r1.f19874o = r2     // Catch: java.lang.Throwable -> Lac9
            goto La96
        La44:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> Lac9
            o7.f3 r2 = r2.m3140q()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r5.f19833a     // Catch: java.lang.Throwable -> Lac9
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1111b.m3134u(r5)     // Catch: java.lang.Throwable -> Lac9
            r2.m11171e(r4, r5, r3)     // Catch: java.lang.Throwable -> Lac9
            goto La96
        La5c:
            r0 = move-exception
        La5d:
            r2 = r0
            goto La81
        La5f:
            r0 = move-exception
            goto La64
        La61:
            r0 = move-exception
            r16 = r2
        La64:
            r2 = r0
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a     // Catch: java.io.IOException -> La5c java.lang.Throwable -> Lac9
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()     // Catch: java.io.IOException -> La5c java.lang.Throwable -> Lac9
            o7.f3 r3 = r3.m3140q()     // Catch: java.io.IOException -> La5c java.lang.Throwable -> Lac9
            java.lang.String r5 = "Error storing raw event metadata. appId"
            java.lang.String r4 = r4.m8431D1()     // Catch: java.io.IOException -> La5c java.lang.Throwable -> Lac9
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r4)     // Catch: java.io.IOException -> La5c java.lang.Throwable -> Lac9
            r3.m11171e(r5, r4, r2)     // Catch: java.io.IOException -> La5c java.lang.Throwable -> Lac9
            throw r2     // Catch: java.io.IOException -> La5c java.lang.Throwable -> Lac9
        La7d:
            r0 = move-exception
            r16 = r2
            goto La5d
        La81:
            com.google.android.gms.measurement.internal.b r3 = r34.mo3162d()     // Catch: java.lang.Throwable -> Lac9
            o7.f3 r3 = r3.m3140q()     // Catch: java.lang.Throwable -> Lac9
            java.lang.String r4 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r5 = r16.m8258Z()     // Catch: java.lang.Throwable -> Lac9
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1111b.m3134u(r5)     // Catch: java.lang.Throwable -> Lac9
            r3.m11171e(r4, r5, r2)     // Catch: java.lang.Throwable -> Lac9
        La96:
            o7.j r2 = r1.f19862c     // Catch: java.lang.Throwable -> Lac9
            m11327I(r2)     // Catch: java.lang.Throwable -> Lac9
            r2.m11273o()     // Catch: java.lang.Throwable -> Lac9
            o7.j r2 = r1.f19862c
            m11327I(r2)
            r2.m11269T()
            r34.m11334D()
            com.google.android.gms.measurement.internal.b r2 = r34.mo3162d()
            o7.f3 r2 = r2.m3141r()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r29
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.m11170d(r4, r3)
            return
        Lac9:
            r0 = move-exception
            r2 = r0
            o7.j r3 = r1.f19862c
            m11327I(r3)
            r3.m11269T()
            throw r2
        Lad4:
            r1.m11339J(r3)
            return
    }

    /* renamed from: x */
    public final long m11363x() {
            r8 = this;
            u6.c r0 = r8.mo3163e()
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = java.lang.System.currentTimeMillis()
            o7.w5 r2 = r8.f19868i
            r2.m11247j()
            r2.mo3183i()
            o7.p3 r3 = r2.f20156k
            long r3 = r3.m11410a()
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L3b
            com.google.android.gms.measurement.internal.d r3 = r2.f5736a
            com.google.android.gms.measurement.internal.f r3 = r3.m3158A()
            java.security.SecureRandom r3 = r3.m3235t()
            r4 = 86400000(0x5265c00, float:7.82218E-36)
            int r3 = r3.nextInt(r4)
            long r3 = (long) r3
            r5 = 1
            long r3 = r3 + r5
            o7.p3 r2 = r2.f20156k
            r2.m11411b(r3)
        L3b:
            long r0 = r0 + r3
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r2 = 60
            long r0 = r0 / r2
            long r0 = r0 / r2
            r2 = 24
            long r0 = r0 / r2
            return r0
    }

    /* renamed from: y */
    public final p249o7.C5116u6 m11364y(java.lang.String r34) {
            r33 = this;
            r0 = r33
            r2 = r34
            o7.j r1 = r0.f19862c
            m11327I(r1)
            o7.h4 r1 = r1.m11255F(r2)
            r3 = 0
            if (r1 == 0) goto Lbe
            java.lang.String r4 = r1.m11216P()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L1c
            goto Lbe
        L1c:
            java.lang.Boolean r4 = r0.m11365z(r1)
            if (r4 == 0) goto L37
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L29
            goto L37
        L29:
            com.google.android.gms.measurement.internal.b r1 = r33.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1111b.m3134u(r34)
            java.lang.String r4 = "App version does not match; dropping. appId"
            goto Lc6
        L37:
            o7.u6 r30 = new o7.u6
            java.lang.String r4 = r1.m11219S()
            java.lang.String r5 = r1.m11216P()
            long r6 = r1.m11202B()
            java.lang.String r8 = r1.m11215O()
            long r9 = r1.m11207G()
            long r15 = r1.m11204D()
            boolean r13 = r1.m11201A()
            java.lang.String r17 = r1.m11217Q()
            long r23 = r1.m11237r()
            boolean r21 = r1.m11245z()
            java.lang.String r25 = r1.m11211K()
            com.google.android.gms.measurement.internal.d r11 = r1.f19730a
            o7.f4 r11 = r11.mo3160b()
            r11.mo3183i()
            java.lang.Boolean r11 = r1.f19748s
            long r26 = r1.m11205E()
            java.util.List r28 = r1.m11220a()
            p185k7.C3847ia.m8706c()
            o7.f r12 = r33.m11340K()
            o7.u2<java.lang.Boolean> r14 = p249o7.C5120v2.f20089d0
            boolean r12 = r12.m11162v(r2, r14)
            if (r12 == 0) goto L8e
            java.lang.String r1 = r1.m11218R()
            r31 = r1
            goto L90
        L8e:
            r31 = r3
        L90:
            r12 = 0
            r14 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            o7.g r1 = r33.m11341L(r34)
            java.lang.String r29 = r1.m11188e()
            r1 = r30
            r2 = r34
            r3 = r4
            r4 = r5
            r5 = r6
            r7 = r8
            r8 = r9
            r32 = r11
            r10 = r15
            r15 = r17
            r16 = r23
            r23 = r25
            r24 = r32
            r25 = r26
            r27 = r28
            r28 = r31
            r1.<init>(r2, r3, r4, r5, r7, r8, r10, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r27, r28, r29)
            return r30
        Lbe:
            com.google.android.gms.measurement.internal.b r1 = r33.mo3162d()
            o7.f3 r1 = r1.f5679m
            java.lang.String r4 = "No app data available; dropping"
        Lc6:
            r1.m11170d(r4, r2)
            return r3
    }

    /* renamed from: z */
    public final java.lang.Boolean m11365z(p249o7.C5010h4 r7) {
            r6 = this;
            long r0 = r7.m11202B()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            r2 = -2147483648(0xffffffff80000000, double:NaN)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L2a
            com.google.android.gms.measurement.internal.d r0 = r6.f19871l     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            android.content.Context r0 = r0.f5710a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            w6.b r0 = p388w6.C6816c.m13887a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            java.lang.String r1 = r7.m11213M()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            android.content.pm.PackageInfo r0 = r0.m13885b(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            int r0 = r0.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            long r1 = r7.m11202B()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            long r3 = (long) r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L4b
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            return r7
        L2a:
            com.google.android.gms.measurement.internal.d r0 = r6.f19871l     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            android.content.Context r0 = r0.f5710a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            w6.b r0 = p388w6.C6816c.m13887a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            java.lang.String r1 = r7.m11213M()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            android.content.pm.PackageInfo r0 = r0.m13885b(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            java.lang.String r0 = r0.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            java.lang.String r7 = r7.m11216P()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            if (r7 == 0) goto L4b
            boolean r7 = r7.equals(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            if (r7 == 0) goto L4b
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            return r7
        L4b:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L4e:
            r7 = 0
            return r7
    }
}
