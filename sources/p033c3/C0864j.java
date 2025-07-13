package p033c3;

/* renamed from: c3.j */
/* loaded from: classes.dex */
public final class C0864j<R> implements p033c3.InterfaceC0858d, p049d3.InterfaceC1274f, p033c3.InterfaceC0863i {

    /* renamed from: D */
    public static final boolean f4663D = false;

    /* renamed from: A */
    public int f4664A;

    /* renamed from: B */
    public boolean f4665B;

    /* renamed from: C */
    public java.lang.RuntimeException f4666C;

    /* renamed from: a */
    public final java.lang.String f4667a;

    /* renamed from: b */
    public final p120h3.AbstractC2454d f4668b;

    /* renamed from: c */
    public final java.lang.Object f4669c;

    /* renamed from: d */
    public final p033c3.InterfaceC0861g<R> f4670d;

    /* renamed from: e */
    public final p033c3.InterfaceC0859e f4671e;

    /* renamed from: f */
    public final android.content.Context f4672f;

    /* renamed from: g */
    public final com.bumptech.glide.C1001e f4673g;

    /* renamed from: h */
    public final java.lang.Object f4674h;

    /* renamed from: i */
    public final java.lang.Class<R> f4675i;

    /* renamed from: j */
    public final p033c3.AbstractC0855a<?> f4676j;

    /* renamed from: k */
    public final int f4677k;

    /* renamed from: l */
    public final int f4678l;

    /* renamed from: m */
    public final com.bumptech.glide.EnumC1003g f4679m;

    /* renamed from: n */
    public final p049d3.InterfaceC1275g<R> f4680n;

    /* renamed from: o */
    public final java.util.List<p033c3.InterfaceC0861g<R>> f4681o;

    /* renamed from: p */
    public final p068e3.InterfaceC1514c<? super R> f4682p;

    /* renamed from: q */
    public final java.util.concurrent.Executor f4683q;

    /* renamed from: r */
    public p214m2.InterfaceC4345w<R> f4684r;

    /* renamed from: s */
    public p214m2.C4334l.d f4685s;

    /* renamed from: t */
    public long f4686t;

    /* renamed from: u */
    public volatile p214m2.C4334l f4687u;

    /* renamed from: v */
    public int f4688v;

    /* renamed from: w */
    public android.graphics.drawable.Drawable f4689w;

    /* renamed from: x */
    public android.graphics.drawable.Drawable f4690x;

    /* renamed from: y */
    public android.graphics.drawable.Drawable f4691y;

    /* renamed from: z */
    public int f4692z;

    static {
            java.lang.String r0 = "Request"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            p033c3.C0864j.f4663D = r0
            return
    }

    public C0864j(android.content.Context r4, com.bumptech.glide.C1001e r5, java.lang.Object r6, java.lang.Object r7, java.lang.Class<R> r8, p033c3.AbstractC0855a<?> r9, int r10, int r11, com.bumptech.glide.EnumC1003g r12, p049d3.InterfaceC1275g<R> r13, p033c3.InterfaceC0861g<R> r14, java.util.List<p033c3.InterfaceC0861g<R>> r15, p033c3.InterfaceC0859e r16, p214m2.C4334l r17, p068e3.InterfaceC1514c<? super R> r18, java.util.concurrent.Executor r19) {
            r3 = this;
            r0 = r3
            r1 = r5
            r3.<init>()
            boolean r2 = p033c3.C0864j.f4663D
            if (r2 == 0) goto L12
            int r2 = r3.hashCode()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L13
        L12:
            r2 = 0
        L13:
            r0.f4667a = r2
            h3.d$b r2 = new h3.d$b
            r2.<init>()
            r0.f4668b = r2
            r2 = r6
            r0.f4669c = r2
            r2 = r4
            r0.f4672f = r2
            r0.f4673g = r1
            r2 = r7
            r0.f4674h = r2
            r2 = r8
            r0.f4675i = r2
            r2 = r9
            r0.f4676j = r2
            r2 = r10
            r0.f4677k = r2
            r2 = r11
            r0.f4678l = r2
            r2 = r12
            r0.f4679m = r2
            r2 = r13
            r0.f4680n = r2
            r2 = r14
            r0.f4670d = r2
            r2 = r15
            r0.f4681o = r2
            r2 = r16
            r0.f4671e = r2
            r2 = r17
            r0.f4687u = r2
            r2 = r18
            r0.f4682p = r2
            r2 = r19
            r0.f4683q = r2
            r2 = 1
            r0.f4688v = r2
            java.lang.RuntimeException r2 = r0.f4666C
            if (r2 != 0) goto L6b
            com.bumptech.glide.f r1 = r1.f5130h
            java.lang.Class<com.bumptech.glide.d$c> r2 = com.bumptech.glide.C1000d.c.class
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r1.f5133a
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L6b
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Glide request origin trace"
            r1.<init>(r2)
            r0.f4666C = r1
        L6b:
            return
    }

    @Override // p033c3.InterfaceC0858d
    /* renamed from: a */
    public boolean mo2551a() {
            r3 = this;
            java.lang.Object r0 = r3.f4669c
            monitor-enter(r0)
            int r1 = r3.f4688v     // Catch: java.lang.Throwable -> Ld
            r2 = 4
            if (r1 != r2) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // p049d3.InterfaceC1274f
    /* renamed from: b */
    public void mo2579b(int r24, int r25) {
            r23 = this;
            r15 = r23
            r0 = r24
            r1 = r25
            h3.d r2 = r15.f4668b
            r2.mo6233a()
            java.lang.Object r14 = r15.f4669c
            monitor-enter(r14)
            boolean r21 = p033c3.C0864j.f4663D     // Catch: java.lang.Throwable -> Lf6
            if (r21 == 0) goto L2c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf6
            r2.<init>()     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r3 = "Got onSizeReady in "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf6
            long r3 = r15.f4686t     // Catch: java.lang.Throwable -> Lf6
            double r3 = p106g3.C2234f.m5833a(r3)     // Catch: java.lang.Throwable -> Lf6
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lf6
            r15.m2586n(r2)     // Catch: java.lang.Throwable -> Lf6
        L2c:
            int r2 = r15.f4688v     // Catch: java.lang.Throwable -> Lf6
            r3 = 3
            if (r2 == r3) goto L33
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lf6
            return
        L33:
            r13 = 2
            r15.f4688v = r13     // Catch: java.lang.Throwable -> Lf6
            c3.a<?> r2 = r15.f4676j     // Catch: java.lang.Throwable -> Lf6
            float r2 = r2.f4622Z     // Catch: java.lang.Throwable -> Lf6
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r3) goto L3f
            goto L46
        L3f:
            float r0 = (float) r0     // Catch: java.lang.Throwable -> Lf6
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)     // Catch: java.lang.Throwable -> Lf6
        L46:
            r15.f4692z = r0     // Catch: java.lang.Throwable -> Lf6
            if (r1 != r3) goto L4c
            r0 = r1
            goto L53
        L4c:
            float r0 = (float) r1     // Catch: java.lang.Throwable -> Lf6
            float r2 = r2 * r0
            int r0 = java.lang.Math.round(r2)     // Catch: java.lang.Throwable -> Lf6
        L53:
            r15.f4664A = r0     // Catch: java.lang.Throwable -> Lf6
            if (r21 == 0) goto L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf6
            r0.<init>()     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r1 = "finished setup for calling load in "
            r0.append(r1)     // Catch: java.lang.Throwable -> Lf6
            long r1 = r15.f4686t     // Catch: java.lang.Throwable -> Lf6
            double r1 = p106g3.C2234f.m5833a(r1)     // Catch: java.lang.Throwable -> Lf6
            r0.append(r1)     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lf6
            r15.m2586n(r0)     // Catch: java.lang.Throwable -> Lf6
        L71:
            m2.l r1 = r15.f4687u     // Catch: java.lang.Throwable -> Lf6
            com.bumptech.glide.e r2 = r15.f4673g     // Catch: java.lang.Throwable -> Lf6
            java.lang.Object r3 = r15.f4674h     // Catch: java.lang.Throwable -> Lf6
            c3.a<?> r0 = r15.f4676j     // Catch: java.lang.Throwable -> Lf6
            k2.c r4 = r0.f4632j0     // Catch: java.lang.Throwable -> Lf6
            int r5 = r15.f4692z     // Catch: java.lang.Throwable -> Lf6
            int r6 = r15.f4664A     // Catch: java.lang.Throwable -> Lf6
            java.lang.Class<?> r7 = r0.f4639q0     // Catch: java.lang.Throwable -> Lf6
            java.lang.Class<R> r8 = r15.f4675i     // Catch: java.lang.Throwable -> Lf6
            com.bumptech.glide.g r9 = r15.f4679m     // Catch: java.lang.Throwable -> Lf6
            m2.k r10 = r0.f4623a0     // Catch: java.lang.Throwable -> Lf6
            java.util.Map<java.lang.Class<?>, k2.h<?>> r11 = r0.f4638p0     // Catch: java.lang.Throwable -> Lf6
            boolean r12 = r0.f4633k0     // Catch: java.lang.Throwable -> Lf6
            boolean r13 = r0.f4645w0     // Catch: java.lang.Throwable -> Lf6
            r17 = r13
            k2.e r13 = r0.f4637o0     // Catch: java.lang.Throwable -> Lf6
            r18 = r14
            boolean r14 = r0.f4629g0     // Catch: java.lang.Throwable -> Lf1
            r19 = r14
            boolean r14 = r0.f4643u0     // Catch: java.lang.Throwable -> Lf1
            r20 = r14
            boolean r14 = r0.f4646x0     // Catch: java.lang.Throwable -> Lf1
            boolean r0 = r0.f4644v0     // Catch: java.lang.Throwable -> Lf1
            r24 = r0
            java.util.concurrent.Executor r0 = r15.f4683q     // Catch: java.lang.Throwable -> Lf1
            r16 = r13
            r13 = r17
            r22 = r18
            r17 = r19
            r18 = r20
            r19 = r14
            r14 = r16
            r15 = r17
            r16 = r18
            r17 = r19
            r18 = r24
            r19 = r23
            r20 = r0
            m2.l$d r0 = r1.m9686b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> Led
            r1 = r23
            r1.f4685s = r0     // Catch: java.lang.Throwable -> Leb
            int r0 = r1.f4688v     // Catch: java.lang.Throwable -> Leb
            r2 = 2
            if (r0 == r2) goto Lcd
            r0 = 0
            r1.f4685s = r0     // Catch: java.lang.Throwable -> Leb
        Lcd:
            if (r21 == 0) goto Le9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r0.<init>()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r2 = "finished onSizeReady in "
            r0.append(r2)     // Catch: java.lang.Throwable -> Leb
            long r2 = r1.f4686t     // Catch: java.lang.Throwable -> Leb
            double r2 = p106g3.C2234f.m5833a(r2)     // Catch: java.lang.Throwable -> Leb
            r0.append(r2)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Leb
            r1.m2586n(r0)     // Catch: java.lang.Throwable -> Leb
        Le9:
            monitor-exit(r22)     // Catch: java.lang.Throwable -> Leb
            return
        Leb:
            r0 = move-exception
            goto Lfa
        Led:
            r0 = move-exception
            r1 = r23
            goto Lfa
        Lf1:
            r0 = move-exception
            r1 = r15
            r22 = r18
            goto Lfa
        Lf6:
            r0 = move-exception
            r22 = r14
            r1 = r15
        Lfa:
            r14 = r22
        Lfc:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lfe
            throw r0
        Lfe:
            r0 = move-exception
            goto Lfc
    }

    /* renamed from: c */
    public final void m2580c() {
            r2 = this;
            boolean r0 = r2.f4665B
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r0.<init>(r1)
            throw r0
    }

    @Override // p033c3.InterfaceC0858d
    public void clear() {
            r5 = this;
            java.lang.Object r0 = r5.f4669c
            monitor-enter(r0)
            r5.m2580c()     // Catch: java.lang.Throwable -> L42
            h3.d r1 = r5.f4668b     // Catch: java.lang.Throwable -> L42
            r1.mo6233a()     // Catch: java.lang.Throwable -> L42
            int r1 = r5.f4688v     // Catch: java.lang.Throwable -> L42
            r2 = 6
            if (r1 != r2) goto L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            return
        L12:
            r5.m2581d()     // Catch: java.lang.Throwable -> L42
            m2.w<R> r1 = r5.f4684r     // Catch: java.lang.Throwable -> L42
            r3 = 0
            if (r1 == 0) goto L1d
            r5.f4684r = r3     // Catch: java.lang.Throwable -> L42
            goto L1e
        L1d:
            r1 = r3
        L1e:
            c3.e r3 = r5.f4671e     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L2b
            boolean r3 = r3.mo2553c(r5)     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L29
            goto L2b
        L29:
            r3 = 0
            goto L2c
        L2b:
            r3 = 1
        L2c:
            if (r3 == 0) goto L37
            d3.g<R> r3 = r5.f4680n     // Catch: java.lang.Throwable -> L42
            android.graphics.drawable.Drawable r4 = r5.m2583k()     // Catch: java.lang.Throwable -> L42
            r3.mo2574k(r4)     // Catch: java.lang.Throwable -> L42
        L37:
            r5.f4688v = r2     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L41
            m2.l r0 = r5.f4687u
            r0.m9689f(r1)
        L41:
            return
        L42:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r1
    }

    /* renamed from: d */
    public final void m2581d() {
            r3 = this;
            r3.m2580c()
            h3.d r0 = r3.f4668b
            r0.mo6233a()
            d3.g<R> r0 = r3.f4680n
            r0.mo2572i(r3)
            m2.l$d r0 = r3.f4685s
            if (r0 == 0) goto L23
            m2.l r1 = r0.f17748c
            monitor-enter(r1)
            m2.m<?> r2 = r0.f17746a     // Catch: java.lang.Throwable -> L20
            c3.i r0 = r0.f17747b     // Catch: java.lang.Throwable -> L20
            r2.m9698g(r0)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            r0 = 0
            r3.f4685s = r0
            goto L23
        L20:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            throw r0
        L23:
            return
    }

    @Override // p033c3.InterfaceC0858d
    /* renamed from: e */
    public boolean mo2555e() {
            r3 = this;
            java.lang.Object r0 = r3.f4669c
            monitor-enter(r0)
            int r1 = r3.f4688v     // Catch: java.lang.Throwable -> Ld
            r2 = 6
            if (r1 != r2) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // p033c3.InterfaceC0858d
    /* renamed from: f */
    public boolean mo2556f(p033c3.InterfaceC0858d r17) {
            r16 = this;
            r1 = r16
            r0 = r17
            boolean r2 = r0 instanceof p033c3.C0864j
            r3 = 0
            if (r2 != 0) goto La
            return r3
        La:
            java.lang.Object r2 = r1.f4669c
            monitor-enter(r2)
            int r4 = r1.f4677k     // Catch: java.lang.Throwable -> L77
            int r5 = r1.f4678l     // Catch: java.lang.Throwable -> L77
            java.lang.Object r6 = r1.f4674h     // Catch: java.lang.Throwable -> L77
            java.lang.Class<R> r7 = r1.f4675i     // Catch: java.lang.Throwable -> L77
            c3.a<?> r8 = r1.f4676j     // Catch: java.lang.Throwable -> L77
            com.bumptech.glide.g r9 = r1.f4679m     // Catch: java.lang.Throwable -> L77
            java.util.List<c3.g<R>> r10 = r1.f4681o     // Catch: java.lang.Throwable -> L77
            if (r10 == 0) goto L22
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L77
            goto L23
        L22:
            r10 = 0
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
            c3.j r0 = (p033c3.C0864j) r0
            java.lang.Object r11 = r0.f4669c
            monitor-enter(r11)
            int r2 = r0.f4677k     // Catch: java.lang.Throwable -> L74
            int r12 = r0.f4678l     // Catch: java.lang.Throwable -> L74
            java.lang.Object r13 = r0.f4674h     // Catch: java.lang.Throwable -> L74
            java.lang.Class<R> r14 = r0.f4675i     // Catch: java.lang.Throwable -> L74
            c3.a<?> r15 = r0.f4676j     // Catch: java.lang.Throwable -> L74
            com.bumptech.glide.g r3 = r0.f4679m     // Catch: java.lang.Throwable -> L74
            java.util.List<c3.g<R>> r0 = r0.f4681o     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L3e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L74
            goto L3f
        L3e:
            r0 = 0
        L3f:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L74
            r11 = 1
            if (r4 != r2) goto L72
            if (r5 != r12) goto L72
            char[] r2 = p106g3.C2238j.f10214a
            if (r6 != 0) goto L4f
            if (r13 != 0) goto L4d
            r2 = 1
            goto L5e
        L4d:
            r2 = 0
            goto L5e
        L4f:
            boolean r2 = r6 instanceof p282q2.InterfaceC5554k
            if (r2 == 0) goto L5a
            q2.k r6 = (p282q2.InterfaceC5554k) r6
            boolean r2 = r6.m11836a(r13)
            goto L5e
        L5a:
            boolean r2 = r6.equals(r13)
        L5e:
            if (r2 == 0) goto L72
            boolean r2 = r7.equals(r14)
            if (r2 == 0) goto L72
            boolean r2 = r8.equals(r15)
            if (r2 == 0) goto L72
            if (r9 != r3) goto L72
            if (r10 != r0) goto L72
            r3 = 1
            goto L73
        L72:
            r3 = 0
        L73:
            return r3
        L74:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L74
            throw r0
        L77:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
            throw r0
    }

    @Override // p033c3.InterfaceC0858d
    /* renamed from: g */
    public void mo2557g() {
            r6 = this;
            java.lang.Object r0 = r6.f4669c
            monitor-enter(r0)
            r6.m2580c()     // Catch: java.lang.Throwable -> Lac
            h3.d r1 = r6.f4668b     // Catch: java.lang.Throwable -> Lac
            r1.mo6233a()     // Catch: java.lang.Throwable -> Lac
            int r1 = p106g3.C2234f.f10203b     // Catch: java.lang.Throwable -> Lac
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> Lac
            r6.f4686t = r1     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r1 = r6.f4674h     // Catch: java.lang.Throwable -> Lac
            r2 = 3
            if (r1 != 0) goto L3d
            int r1 = r6.f4677k     // Catch: java.lang.Throwable -> Lac
            int r3 = r6.f4678l     // Catch: java.lang.Throwable -> Lac
            boolean r1 = p106g3.C2238j.m5850j(r1, r3)     // Catch: java.lang.Throwable -> Lac
            if (r1 == 0) goto L2a
            int r1 = r6.f4677k     // Catch: java.lang.Throwable -> Lac
            r6.f4692z = r1     // Catch: java.lang.Throwable -> Lac
            int r1 = r6.f4678l     // Catch: java.lang.Throwable -> Lac
            r6.f4664A = r1     // Catch: java.lang.Throwable -> Lac
        L2a:
            android.graphics.drawable.Drawable r1 = r6.m2582h()     // Catch: java.lang.Throwable -> Lac
            if (r1 != 0) goto L31
            r2 = 5
        L31:
            m2.s r1 = new m2.s     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "Received null model"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Lac
            r6.m2587o(r1, r2)     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lac
            return
        L3d:
            int r1 = r6.f4688v     // Catch: java.lang.Throwable -> Lac
            r3 = 2
            if (r1 == r3) goto La4
            r4 = 4
            r5 = 0
            if (r1 != r4) goto L4f
            m2.w<R> r1 = r6.f4684r     // Catch: java.lang.Throwable -> Lac
            com.bumptech.glide.load.a r2 = com.bumptech.glide.load.EnumC1008a.f5184c0     // Catch: java.lang.Throwable -> Lac
            r6.m2588p(r1, r2, r5)     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lac
            return
        L4f:
            r6.f4688v = r2     // Catch: java.lang.Throwable -> Lac
            int r1 = r6.f4677k     // Catch: java.lang.Throwable -> Lac
            int r4 = r6.f4678l     // Catch: java.lang.Throwable -> Lac
            boolean r1 = p106g3.C2238j.m5850j(r1, r4)     // Catch: java.lang.Throwable -> Lac
            if (r1 == 0) goto L63
            int r1 = r6.f4677k     // Catch: java.lang.Throwable -> Lac
            int r4 = r6.f4678l     // Catch: java.lang.Throwable -> Lac
            r6.mo2579b(r1, r4)     // Catch: java.lang.Throwable -> Lac
            goto L68
        L63:
            d3.g<R> r1 = r6.f4680n     // Catch: java.lang.Throwable -> Lac
            r1.mo2568e(r6)     // Catch: java.lang.Throwable -> Lac
        L68:
            int r1 = r6.f4688v     // Catch: java.lang.Throwable -> Lac
            if (r1 == r3) goto L6e
            if (r1 != r2) goto L84
        L6e:
            c3.e r1 = r6.f4671e     // Catch: java.lang.Throwable -> Lac
            if (r1 == 0) goto L78
            boolean r1 = r1.mo2554d(r6)     // Catch: java.lang.Throwable -> Lac
            if (r1 == 0) goto L79
        L78:
            r5 = 1
        L79:
            if (r5 == 0) goto L84
            d3.g<R> r1 = r6.f4680n     // Catch: java.lang.Throwable -> Lac
            android.graphics.drawable.Drawable r2 = r6.m2583k()     // Catch: java.lang.Throwable -> Lac
            r1.mo2569f(r2)     // Catch: java.lang.Throwable -> Lac
        L84:
            boolean r1 = p033c3.C0864j.f4663D     // Catch: java.lang.Throwable -> Lac
            if (r1 == 0) goto La2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r1.<init>()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lac
            long r2 = r6.f4686t     // Catch: java.lang.Throwable -> Lac
            double r2 = p106g3.C2234f.m5833a(r2)     // Catch: java.lang.Throwable -> Lac
            r1.append(r2)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lac
            r6.m2586n(r1)     // Catch: java.lang.Throwable -> Lac
        La2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lac
            return
        La4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lac
            throw r1     // Catch: java.lang.Throwable -> Lac
        Lac:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lac
            throw r1
    }

    /* renamed from: h */
    public final android.graphics.drawable.Drawable m2582h() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f4691y
            if (r0 != 0) goto L16
            c3.a<?> r0 = r2.f4676j
            android.graphics.drawable.Drawable r1 = r0.f4635m0
            r2.f4691y = r1
            if (r1 != 0) goto L16
            int r0 = r0.f4636n0
            if (r0 <= 0) goto L16
            android.graphics.drawable.Drawable r0 = r2.m2585m(r0)
            r2.f4691y = r0
        L16:
            android.graphics.drawable.Drawable r0 = r2.f4691y
            return r0
    }

    @Override // p033c3.InterfaceC0858d
    /* renamed from: i */
    public boolean mo2559i() {
            r3 = this;
            java.lang.Object r0 = r3.f4669c
            monitor-enter(r0)
            int r1 = r3.f4688v     // Catch: java.lang.Throwable -> Ld
            r2 = 4
            if (r1 != r2) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // p033c3.InterfaceC0858d
    public boolean isRunning() {
            r3 = this;
            java.lang.Object r0 = r3.f4669c
            monitor-enter(r0)
            int r1 = r3.f4688v     // Catch: java.lang.Throwable -> L11
            r2 = 2
            if (r1 == r2) goto Le
            r2 = 3
            if (r1 != r2) goto Lc
            goto Le
        Lc:
            r1 = 0
            goto Lf
        Le:
            r1 = 1
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    @Override // p033c3.InterfaceC0858d
    /* renamed from: j */
    public void mo2560j() {
            r2 = this;
            java.lang.Object r0 = r2.f4669c
            monitor-enter(r0)
            boolean r1 = r2.isRunning()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Lc
            r2.clear()     // Catch: java.lang.Throwable -> Le
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    /* renamed from: k */
    public final android.graphics.drawable.Drawable m2583k() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f4690x
            if (r0 != 0) goto L16
            c3.a<?> r0 = r2.f4676j
            android.graphics.drawable.Drawable r1 = r0.f4627e0
            r2.f4690x = r1
            if (r1 != 0) goto L16
            int r0 = r0.f4628f0
            if (r0 <= 0) goto L16
            android.graphics.drawable.Drawable r0 = r2.m2585m(r0)
            r2.f4690x = r0
        L16:
            android.graphics.drawable.Drawable r0 = r2.f4690x
            return r0
    }

    /* renamed from: l */
    public final boolean m2584l() {
            r1 = this;
            c3.e r0 = r1.f4671e
            if (r0 == 0) goto L11
            c3.e r0 = r0.mo2552b()
            boolean r0 = r0.mo2551a()
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    /* renamed from: m */
    public final android.graphics.drawable.Drawable m2585m(int r3) {
            r2 = this;
            c3.a<?> r0 = r2.f4676j
            android.content.res.Resources$Theme r0 = r0.f4641s0
            if (r0 == 0) goto L7
            goto Ld
        L7:
            android.content.Context r0 = r2.f4672f
            android.content.res.Resources$Theme r0 = r0.getTheme()
        Ld:
            com.bumptech.glide.e r1 = r2.f4673g
            android.graphics.drawable.Drawable r3 = p368v2.C6492a.m13206a(r1, r1, r3, r0)
            return r3
    }

    /* renamed from: n */
    public final void m2586n(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = " this: "
            java.lang.StringBuilder r2 = android.support.v4.media.C0143b.m255a(r2, r0)
            java.lang.String r0 = r1.f4667a
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "Request"
            android.util.Log.v(r0, r2)
            return
    }

    /* renamed from: o */
    public final void m2587o(p214m2.C4341s r9, int r10) {
            r8 = this;
            h3.d r0 = r8.f4668b
            r0.mo6233a()
            java.lang.Object r0 = r8.f4669c
            monitor-enter(r0)
            java.util.Objects.requireNonNull(r9)     // Catch: java.lang.Throwable -> La2
            com.bumptech.glide.e r1 = r8.f4673g     // Catch: java.lang.Throwable -> La2
            int r1 = r1.f5131i     // Catch: java.lang.Throwable -> La2
            if (r1 > r10) goto L4a
            java.lang.String r10 = "Glide"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r2.<init>()     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "Load failed for "
            r2.append(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.Object r3 = r8.f4674h     // Catch: java.lang.Throwable -> La2
            r2.append(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = " with size ["
            r2.append(r3)     // Catch: java.lang.Throwable -> La2
            int r3 = r8.f4692z     // Catch: java.lang.Throwable -> La2
            r2.append(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch: java.lang.Throwable -> La2
            int r3 = r8.f4664A     // Catch: java.lang.Throwable -> La2
            r2.append(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "]"
            r2.append(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> La2
            android.util.Log.w(r10, r2, r9)     // Catch: java.lang.Throwable -> La2
            r10 = 4
            if (r1 > r10) goto L4a
            java.lang.String r10 = "Glide"
            r9.m9727e(r10)     // Catch: java.lang.Throwable -> La2
        L4a:
            r10 = 0
            r8.f4685s = r10     // Catch: java.lang.Throwable -> La2
            r10 = 5
            r8.f4688v = r10     // Catch: java.lang.Throwable -> La2
            r10 = 1
            r8.f4665B = r10     // Catch: java.lang.Throwable -> La2
            r1 = 0
            java.util.List<c3.g<R>> r2 = r8.f4681o     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L77
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L9e
            r3 = 0
        L5d:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L9e
            if (r4 == 0) goto L78
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L9e
            c3.g r4 = (p033c3.InterfaceC0861g) r4     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r5 = r8.f4674h     // Catch: java.lang.Throwable -> L9e
            d3.g<R> r6 = r8.f4680n     // Catch: java.lang.Throwable -> L9e
            boolean r7 = r8.m2584l()     // Catch: java.lang.Throwable -> L9e
            boolean r4 = r4.mo2564a(r9, r5, r6, r7)     // Catch: java.lang.Throwable -> L9e
            r3 = r3 | r4
            goto L5d
        L77:
            r3 = 0
        L78:
            c3.g<R> r2 = r8.f4670d     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L8b
            java.lang.Object r4 = r8.f4674h     // Catch: java.lang.Throwable -> L9e
            d3.g<R> r5 = r8.f4680n     // Catch: java.lang.Throwable -> L9e
            boolean r6 = r8.m2584l()     // Catch: java.lang.Throwable -> L9e
            boolean r9 = r2.mo2564a(r9, r4, r5, r6)     // Catch: java.lang.Throwable -> L9e
            if (r9 == 0) goto L8b
            goto L8c
        L8b:
            r10 = 0
        L8c:
            r9 = r3 | r10
            if (r9 != 0) goto L93
            r8.m2590r()     // Catch: java.lang.Throwable -> L9e
        L93:
            r8.f4665B = r1     // Catch: java.lang.Throwable -> La2
            c3.e r9 = r8.f4671e     // Catch: java.lang.Throwable -> La2
            if (r9 == 0) goto L9c
            r9.mo2562l(r8)     // Catch: java.lang.Throwable -> La2
        L9c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La2
            return
        L9e:
            r9 = move-exception
            r8.f4665B = r1     // Catch: java.lang.Throwable -> La2
            throw r9     // Catch: java.lang.Throwable -> La2
        La2:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La2
            throw r9
    }

    /* renamed from: p */
    public void m2588p(p214m2.InterfaceC4345w<?> r7, com.bumptech.glide.load.EnumC1008a r8, boolean r9) {
            r6 = this;
            h3.d r9 = r6.f4668b
            r9.mo6233a()
            r9 = 0
            java.lang.Object r0 = r6.f4669c     // Catch: java.lang.Throwable -> Lc4
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Lc4
            r6.f4685s = r9     // Catch: java.lang.Throwable -> Lb6
            r1 = 5
            if (r7 != 0) goto L30
            m2.s r7 = new m2.s     // Catch: java.lang.Throwable -> Lb6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
            r8.<init>()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r2 = "Expected to receive a Resource<R> with an object of "
            r8.append(r2)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class<R> r2 = r6.f4675i     // Catch: java.lang.Throwable -> Lb6
            r8.append(r2)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r2 = " inside, but instead got null."
            r8.append(r2)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lb6
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lb6
            r6.m2587o(r7, r1)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            return
        L30:
            java.lang.Object r2 = r7.get()     // Catch: java.lang.Throwable -> Lb6
            if (r2 == 0) goto L64
            java.lang.Class<R> r3 = r6.f4675i     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> Lb6
            boolean r3 = r3.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> Lb6
            if (r3 != 0) goto L43
            goto L64
        L43:
            c3.e r1 = r6.f4671e     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto L50
            boolean r1 = r1.mo2558h(r6)     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto L4e
            goto L50
        L4e:
            r1 = 0
            goto L51
        L50:
            r1 = 1
        L51:
            if (r1 != 0) goto L5f
            r6.f4684r = r9     // Catch: java.lang.Throwable -> Lb2
            r8 = 4
            r6.f4688v = r8     // Catch: java.lang.Throwable -> Lb2
        L58:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb2
            m2.l r8 = r6.f4687u
            r8.m9689f(r7)
            return
        L5f:
            r6.m2589q(r7, r2, r8)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            return
        L64:
            r6.f4684r = r9     // Catch: java.lang.Throwable -> Lb2
            m2.s r8 = new m2.s     // Catch: java.lang.Throwable -> Lb2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r9.<init>()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = "Expected to receive an object of "
            r9.append(r3)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Class<R> r3 = r6.f4675i     // Catch: java.lang.Throwable -> Lb2
            r9.append(r3)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = " but instead got "
            r9.append(r3)     // Catch: java.lang.Throwable -> Lb2
            if (r2 == 0) goto L83
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Throwable -> Lb2
            goto L85
        L83:
            java.lang.String r3 = ""
        L85:
            r9.append(r3)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = "{"
            r9.append(r3)     // Catch: java.lang.Throwable -> Lb2
            r9.append(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = "} inside Resource{"
            r9.append(r3)     // Catch: java.lang.Throwable -> Lb2
            r9.append(r7)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = "}."
            r9.append(r3)     // Catch: java.lang.Throwable -> Lb2
            if (r2 == 0) goto La2
            java.lang.String r2 = ""
            goto La4
        La2:
            java.lang.String r2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        La4:
            r9.append(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lb2
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb2
            r6.m2587o(r8, r1)     // Catch: java.lang.Throwable -> Lb2
            goto L58
        Lb2:
            r8 = move-exception
            r9 = r7
            r7 = r6
            goto Lbb
        Lb6:
            r7 = move-exception
            r8 = r6
        Lb8:
            r5 = r8
            r8 = r7
            r7 = r5
        Lbb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
            throw r8     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r8 = move-exception
            goto Lc6
        Lbf:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
            goto Lb8
        Lc4:
            r8 = move-exception
            r7 = r6
        Lc6:
            if (r9 == 0) goto Lcd
            m2.l r7 = r7.f4687u
            r7.m9689f(r9)
        Lcd:
            throw r8
    }

    /* renamed from: q */
    public final void m2589q(p214m2.InterfaceC4345w r11, java.lang.Object r12, com.bumptech.glide.load.EnumC1008a r13) {
            r10 = this;
            boolean r6 = r10.m2584l()
            r0 = 4
            r10.f4688v = r0
            r10.f4684r = r11
            com.bumptech.glide.e r11 = r10.f4673g
            int r11 = r11.f5131i
            r0 = 3
            if (r11 > r0) goto L63
            java.lang.String r11 = "Finished loading "
            java.lang.StringBuilder r11 = android.support.v4.media.C0144c.m256a(r11)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            java.lang.String r0 = " from "
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = " for "
            r11.append(r0)
            java.lang.Object r0 = r10.f4674h
            r11.append(r0)
            java.lang.String r0 = " with size ["
            r11.append(r0)
            int r0 = r10.f4692z
            r11.append(r0)
            java.lang.String r0 = "x"
            r11.append(r0)
            int r0 = r10.f4664A
            r11.append(r0)
            java.lang.String r0 = "] in "
            r11.append(r0)
            long r0 = r10.f4686t
            double r0 = p106g3.C2234f.m5833a(r0)
            r11.append(r0)
            java.lang.String r0 = " ms"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r11)
        L63:
            r11 = 1
            r10.f4665B = r11
            r7 = 0
            java.util.List<c3.g<R>> r0 = r10.f4681o     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto L8a
            java.util.Iterator r8 = r0.iterator()     // Catch: java.lang.Throwable -> Lb7
            r0 = 0
            r9 = 0
        L71:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> Lb7
            c3.g r0 = (p033c3.InterfaceC0861g) r0     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r2 = r10.f4674h     // Catch: java.lang.Throwable -> Lb7
            d3.g<R> r3 = r10.f4680n     // Catch: java.lang.Throwable -> Lb7
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.mo2571h(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lb7
            r9 = r9 | r0
            goto L71
        L8a:
            r9 = 0
        L8b:
            c3.g<R> r0 = r10.f4670d     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto L9d
            java.lang.Object r2 = r10.f4674h     // Catch: java.lang.Throwable -> Lb7
            d3.g<R> r3 = r10.f4680n     // Catch: java.lang.Throwable -> Lb7
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r13 = r0.mo2571h(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lb7
            if (r13 == 0) goto L9d
            goto L9e
        L9d:
            r11 = 0
        L9e:
            r11 = r11 | r9
            if (r11 != 0) goto Lad
            e3.c<? super R> r11 = r10.f4682p     // Catch: java.lang.Throwable -> Lb7
            java.util.Objects.requireNonNull(r11)     // Catch: java.lang.Throwable -> Lb7
            e3.a<?> r11 = p068e3.C1512a.f7360a     // Catch: java.lang.Throwable -> Lb7
            d3.g<R> r13 = r10.f4680n     // Catch: java.lang.Throwable -> Lb7
            r13.mo2565b(r12, r11)     // Catch: java.lang.Throwable -> Lb7
        Lad:
            r10.f4665B = r7
            c3.e r11 = r10.f4671e
            if (r11 == 0) goto Lb6
            r11.mo2561k(r10)
        Lb6:
            return
        Lb7:
            r11 = move-exception
            r10.f4665B = r7
            throw r11
    }

    /* renamed from: r */
    public final void m2590r() {
            r2 = this;
            c3.e r0 = r2.f4671e
            if (r0 == 0) goto Ld
            boolean r0 = r0.mo2554d(r2)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            if (r0 != 0) goto L11
            return
        L11:
            r0 = 0
            java.lang.Object r1 = r2.f4674h
            if (r1 != 0) goto L1a
            android.graphics.drawable.Drawable r0 = r2.m2582h()
        L1a:
            if (r0 != 0) goto L34
            android.graphics.drawable.Drawable r0 = r2.f4689w
            if (r0 != 0) goto L32
            c3.a<?> r0 = r2.f4676j
            android.graphics.drawable.Drawable r1 = r0.f4625c0
            r2.f4689w = r1
            if (r1 != 0) goto L32
            int r0 = r0.f4626d0
            if (r0 <= 0) goto L32
            android.graphics.drawable.Drawable r0 = r2.m2585m(r0)
            r2.f4689w = r0
        L32:
            android.graphics.drawable.Drawable r0 = r2.f4689w
        L34:
            if (r0 != 0) goto L3a
            android.graphics.drawable.Drawable r0 = r2.m2583k()
        L3a:
            d3.g<R> r1 = r2.f4680n
            r1.mo2566c(r0)
            return
    }
}
