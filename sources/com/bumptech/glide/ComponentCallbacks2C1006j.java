package com.bumptech.glide;

/* renamed from: com.bumptech.glide.j */
/* loaded from: classes.dex */
public class ComponentCallbacks2C1006j implements android.content.ComponentCallbacks2, p445z2.InterfaceC7235i {

    /* renamed from: i0 */
    public static final p033c3.C0862h f5164i0 = null;

    /* renamed from: j0 */
    public static final p033c3.C0862h f5165j0 = null;

    /* renamed from: Y */
    public final com.bumptech.glide.ComponentCallbacks2C0999c f5166Y;

    /* renamed from: Z */
    public final android.content.Context f5167Z;

    /* renamed from: a0 */
    public final p445z2.InterfaceC7234h f5168a0;

    /* renamed from: b0 */
    public final p445z2.C7240n f5169b0;

    /* renamed from: c0 */
    public final p445z2.InterfaceC7239m f5170c0;

    /* renamed from: d0 */
    public final p445z2.C7242p f5171d0;

    /* renamed from: e0 */
    public final java.lang.Runnable f5172e0;

    /* renamed from: f0 */
    public final p445z2.InterfaceC7228b f5173f0;

    /* renamed from: g0 */
    public final java.util.concurrent.CopyOnWriteArrayList<p033c3.InterfaceC0861g<java.lang.Object>> f5174g0;

    /* renamed from: h0 */
    public p033c3.C0862h f5175h0;

    /* renamed from: com.bumptech.glide.j$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ com.bumptech.glide.ComponentCallbacks2C1006j f5176Y;

        public a(com.bumptech.glide.ComponentCallbacks2C1006j r1) {
                r0 = this;
                r0.f5176Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.bumptech.glide.j r0 = r2.f5176Y
                z2.h r1 = r0.f5168a0
                r1.mo13181h(r0)
                return
        }
    }

    /* renamed from: com.bumptech.glide.j$b */
    public class b implements p445z2.InterfaceC7228b.a {

        /* renamed from: a */
        public final p445z2.C7240n f5177a;

        /* renamed from: b */
        public final /* synthetic */ com.bumptech.glide.ComponentCallbacks2C1006j f5178b;

        public b(com.bumptech.glide.ComponentCallbacks2C1006j r1, p445z2.C7240n r2) {
                r0 = this;
                r0.f5178b = r1
                r0.<init>()
                r0.f5177a = r2
                return
        }
    }

    static {
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            c3.h r1 = new c3.h
            r1.<init>()
            c3.a r0 = r1.mo2533d(r0)
            c3.h r0 = (p033c3.C0862h) r0
            c3.a r0 = r0.mo2539o()
            c3.h r0 = (p033c3.C0862h) r0
            com.bumptech.glide.ComponentCallbacks2C1006j.f5164i0 = r0
            java.lang.Class<x2.c> r0 = p404x2.C6914c.class
            c3.h r1 = new c3.h
            r1.<init>()
            c3.a r0 = r1.mo2533d(r0)
            c3.h r0 = (p033c3.C0862h) r0
            c3.a r0 = r0.mo2539o()
            c3.h r0 = (p033c3.C0862h) r0
            com.bumptech.glide.ComponentCallbacks2C1006j.f5165j0 = r0
            m2.k r0 = p214m2.AbstractC4333k.f17721b
            c3.h r0 = p033c3.C0862h.m2578H(r0)
            com.bumptech.glide.g r1 = com.bumptech.glide.EnumC1003g.f5138b0
            c3.a r0 = r0.mo2548x(r1)
            c3.h r0 = (p033c3.C0862h) r0
            r1 = 1
            c3.a r0 = r0.mo2524B(r1)
            c3.h r0 = (p033c3.C0862h) r0
            return
    }

    public ComponentCallbacks2C1006j(com.bumptech.glide.ComponentCallbacks2C0999c r6, p445z2.InterfaceC7234h r7, p445z2.InterfaceC7239m r8, android.content.Context r9) {
            r5 = this;
            z2.n r0 = new z2.n
            r1 = 0
            r0.<init>(r1)
            z2.c r2 = r6.f5103e0
            r5.<init>()
            z2.p r3 = new z2.p
            r3.<init>()
            r5.f5171d0 = r3
            com.bumptech.glide.j$a r3 = new com.bumptech.glide.j$a
            r3.<init>(r5)
            r5.f5172e0 = r3
            r5.f5166Y = r6
            r5.f5168a0 = r7
            r5.f5170c0 = r8
            r5.f5169b0 = r0
            r5.f5167Z = r9
            android.content.Context r8 = r9.getApplicationContext()
            com.bumptech.glide.j$b r9 = new com.bumptech.glide.j$b
            r9.<init>(r5, r0)
            z2.e r2 = (p445z2.C7231e) r2
            java.util.Objects.requireNonNull(r2)
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = p046d0.C1259a.m3705a(r8, r0)
            r2 = 1
            if (r0 != 0) goto L3b
            r1 = 1
        L3b:
            r0 = 3
            java.lang.String r4 = "ConnectivityMonitor"
            boolean r0 = android.util.Log.isLoggable(r4, r0)
            if (r0 == 0) goto L4e
            if (r1 == 0) goto L49
            java.lang.String r0 = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor"
            goto L4b
        L49:
            java.lang.String r0 = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor"
        L4b:
            android.util.Log.d(r4, r0)
        L4e:
            if (r1 == 0) goto L56
            z2.d r0 = new z2.d
            r0.<init>(r8, r9)
            goto L5b
        L56:
            z2.j r0 = new z2.j
            r0.<init>()
        L5b:
            r5.f5173f0 = r0
            boolean r8 = p106g3.C2238j.m5848h()
            if (r8 == 0) goto L6b
            android.os.Handler r8 = p106g3.C2238j.m5846f()
            r8.post(r3)
            goto L6e
        L6b:
            r7.mo13181h(r5)
        L6e:
            r7.mo13181h(r0)
            java.util.concurrent.CopyOnWriteArrayList r7 = new java.util.concurrent.CopyOnWriteArrayList
            com.bumptech.glide.e r8 = r6.f5099a0
            java.util.List<c3.g<java.lang.Object>> r8 = r8.f5127e
            r7.<init>(r8)
            r5.f5174g0 = r7
            com.bumptech.glide.e r7 = r6.f5099a0
            monitor-enter(r7)
            c3.h r8 = r7.f5132j     // Catch: java.lang.Throwable -> Lb6
            if (r8 != 0) goto L93
            com.bumptech.glide.c$a r8 = r7.f5126d     // Catch: java.lang.Throwable -> Lb6
            com.bumptech.glide.d$a r8 = (com.bumptech.glide.C1000d.a) r8     // Catch: java.lang.Throwable -> Lb6
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.Throwable -> Lb6
            c3.h r8 = new c3.h     // Catch: java.lang.Throwable -> Lb6
            r8.<init>()     // Catch: java.lang.Throwable -> Lb6
            r8.f4640r0 = r2     // Catch: java.lang.Throwable -> Lb6
            r7.f5132j = r8     // Catch: java.lang.Throwable -> Lb6
        L93:
            c3.h r8 = r7.f5132j     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r7)
            r5.mo2773v(r8)
            java.util.List<com.bumptech.glide.j> r8 = r6.f5104f0
            monitor-enter(r8)
            java.util.List<com.bumptech.glide.j> r7 = r6.f5104f0     // Catch: java.lang.Throwable -> Lb3
            boolean r7 = r7.contains(r5)     // Catch: java.lang.Throwable -> Lb3
            if (r7 != 0) goto Lab
            java.util.List<com.bumptech.glide.j> r6 = r6.f5104f0     // Catch: java.lang.Throwable -> Lb3
            r6.add(r5)     // Catch: java.lang.Throwable -> Lb3
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lb3
            return
        Lab:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "Cannot register already registered manager"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lb3
            throw r6     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r6 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lb3
            throw r6
        Lb6:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
    }

    /* renamed from: a */
    public synchronized com.bumptech.glide.ComponentCallbacks2C1006j mo2763a(p033c3.C0862h r2) {
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lf
            c3.h r0 = r1.f5175h0     // Catch: java.lang.Throwable -> L11
            c3.a r2 = r0.mo2530a(r2)     // Catch: java.lang.Throwable -> L11
            c3.h r2 = (p033c3.C0862h) r2     // Catch: java.lang.Throwable -> L11
            r1.f5175h0 = r2     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r1
        Lf:
            r2 = move-exception
            goto L14
        L11:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> Lf
        L14:
            monitor-exit(r1)
            throw r2
    }

    @Override // p445z2.InterfaceC7235i
    /* renamed from: d */
    public synchronized void mo2567d() {
            r1 = this;
            monitor-enter(r1)
            r1.m2772u()     // Catch: java.lang.Throwable -> Lb
            z2.p r0 = r1.f5171d0     // Catch: java.lang.Throwable -> Lb
            r0.mo2567d()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* renamed from: h */
    public <ResourceType> com.bumptech.glide.C1005i<ResourceType> mo2764h(java.lang.Class<ResourceType> r4) {
            r3 = this;
            com.bumptech.glide.i r0 = new com.bumptech.glide.i
            com.bumptech.glide.c r1 = r3.f5166Y
            android.content.Context r2 = r3.f5167Z
            r0.<init>(r1, r3, r4, r2)
            return r0
    }

    @Override // p445z2.InterfaceC7235i
    /* renamed from: l */
    public synchronized void mo2575l() {
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lf
            z2.n r0 = r1.f5169b0     // Catch: java.lang.Throwable -> L11
            r0.m14308e()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            z2.p r0 = r1.f5171d0     // Catch: java.lang.Throwable -> Lf
            r0.mo2575l()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        Lf:
            r0 = move-exception
            goto L14
        L11:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0     // Catch: java.lang.Throwable -> Lf
        L14:
            monitor-exit(r1)
            throw r0
    }

    @Override // p445z2.InterfaceC7235i
    /* renamed from: m */
    public synchronized void mo2576m() {
            r3 = this;
            monitor-enter(r3)
            z2.p r0 = r3.f5171d0     // Catch: java.lang.Throwable -> L85
            r0.mo2576m()     // Catch: java.lang.Throwable -> L85
            z2.p r0 = r3.f5171d0     // Catch: java.lang.Throwable -> L85
            java.util.Set<d3.g<?>> r0 = r0.f27836Y     // Catch: java.lang.Throwable -> L85
            java.util.List r0 = p106g3.C2238j.m5845e(r0)     // Catch: java.lang.Throwable -> L85
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L85
        L12:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L85
            d3.g r1 = (p049d3.InterfaceC1275g) r1     // Catch: java.lang.Throwable -> L85
            r3.m2769r(r1)     // Catch: java.lang.Throwable -> L85
            goto L12
        L22:
            z2.p r0 = r3.f5171d0     // Catch: java.lang.Throwable -> L85
            java.util.Set<d3.g<?>> r0 = r0.f27836Y     // Catch: java.lang.Throwable -> L85
            r0.clear()     // Catch: java.lang.Throwable -> L85
            z2.n r0 = r3.f5169b0     // Catch: java.lang.Throwable -> L85
            java.util.Set<c3.d> r1 = r0.f27826Z     // Catch: java.lang.Throwable -> L85
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L85
            java.util.List r1 = p106g3.C2238j.m5845e(r1)     // Catch: java.lang.Throwable -> L85
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L85
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L85
        L39:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L85
            c3.d r2 = (p033c3.InterfaceC0858d) r2     // Catch: java.lang.Throwable -> L85
            r0.m14306c(r2)     // Catch: java.lang.Throwable -> L85
            goto L39
        L49:
            java.util.List<c3.d> r0 = r0.f27827a0     // Catch: java.lang.Throwable -> L85
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L85
            r0.clear()     // Catch: java.lang.Throwable -> L85
            z2.h r0 = r3.f5168a0     // Catch: java.lang.Throwable -> L85
            r0.mo13180c(r3)     // Catch: java.lang.Throwable -> L85
            z2.h r0 = r3.f5168a0     // Catch: java.lang.Throwable -> L85
            z2.b r1 = r3.f5173f0     // Catch: java.lang.Throwable -> L85
            r0.mo13180c(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.Runnable r0 = r3.f5172e0     // Catch: java.lang.Throwable -> L85
            android.os.Handler r1 = p106g3.C2238j.m5846f()     // Catch: java.lang.Throwable -> L85
            r1.removeCallbacks(r0)     // Catch: java.lang.Throwable -> L85
            com.bumptech.glide.c r0 = r3.f5166Y     // Catch: java.lang.Throwable -> L85
            java.util.List<com.bumptech.glide.j> r1 = r0.f5104f0     // Catch: java.lang.Throwable -> L85
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L85
            java.util.List<com.bumptech.glide.j> r2 = r0.f5104f0     // Catch: java.lang.Throwable -> L82
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L82
            if (r2 == 0) goto L7a
            java.util.List<com.bumptech.glide.j> r0 = r0.f5104f0     // Catch: java.lang.Throwable -> L82
            r0.remove(r3)     // Catch: java.lang.Throwable -> L82
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L82
            monitor-exit(r3)
            return
        L7a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = "Cannot unregister not yet registered manager"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L82
            throw r0     // Catch: java.lang.Throwable -> L82
        L82:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L82
            throw r0     // Catch: java.lang.Throwable -> L85
        L85:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    /* renamed from: n */
    public com.bumptech.glide.C1005i<android.graphics.Bitmap> mo2765n() {
            r2 = this;
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            com.bumptech.glide.i r0 = r2.mo2764h(r0)
            c3.h r1 = com.bumptech.glide.ComponentCallbacks2C1006j.f5164i0
            com.bumptech.glide.i r0 = r0.mo2748I(r1)
            return r0
    }

    /* renamed from: o */
    public com.bumptech.glide.C1005i<android.graphics.drawable.Drawable> mo2766o() {
            r1 = this;
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            com.bumptech.glide.i r0 = r1.mo2764h(r0)
            return r0
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int r1) {
            r0 = this;
            return
    }

    /* renamed from: p */
    public com.bumptech.glide.C1005i<java.io.File> mo2767p() {
            r3 = this;
            java.lang.Class<java.io.File> r0 = java.io.File.class
            com.bumptech.glide.i r0 = r3.mo2764h(r0)
            c3.h r1 = p033c3.C0862h.f4662y0
            if (r1 != 0) goto L1e
            c3.h r1 = new c3.h
            r1.<init>()
            r2 = 1
            c3.a r1 = r1.mo2524B(r2)
            c3.h r1 = (p033c3.C0862h) r1
            c3.a r1 = r1.mo2531b()
            c3.h r1 = (p033c3.C0862h) r1
            p033c3.C0862h.f4662y0 = r1
        L1e:
            c3.h r1 = p033c3.C0862h.f4662y0
            com.bumptech.glide.i r0 = r0.mo2748I(r1)
            return r0
    }

    /* renamed from: q */
    public com.bumptech.glide.C1005i<p404x2.C6914c> mo2768q() {
            r2 = this;
            java.lang.Class<x2.c> r0 = p404x2.C6914c.class
            com.bumptech.glide.i r0 = r2.mo2764h(r0)
            c3.h r1 = com.bumptech.glide.ComponentCallbacks2C1006j.f5165j0
            com.bumptech.glide.i r0 = r0.mo2748I(r1)
            return r0
    }

    /* renamed from: r */
    public void m2769r(p049d3.InterfaceC1275g<?> r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            boolean r0 = r4.m2774w(r5)
            c3.d r1 = r5.mo2573j()
            if (r0 != 0) goto L3e
            com.bumptech.glide.c r0 = r4.f5166Y
            java.util.List<com.bumptech.glide.j> r2 = r0.f5104f0
            monitor-enter(r2)
            java.util.List<com.bumptech.glide.j> r0 = r0.f5104f0     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3b
        L18:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L3b
            com.bumptech.glide.j r3 = (com.bumptech.glide.ComponentCallbacks2C1006j) r3     // Catch: java.lang.Throwable -> L3b
            boolean r3 = r3.m2774w(r5)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L18
            r0 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
            goto L2f
        L2d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
            r0 = 0
        L2f:
            if (r0 != 0) goto L3e
            if (r1 == 0) goto L3e
            r0 = 0
            r5.mo2570g(r0)
            r1.clear()
            goto L3e
        L3b:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
            throw r5
        L3e:
            return
    }

    /* renamed from: s */
    public com.bumptech.glide.C1005i<android.graphics.drawable.Drawable> mo2770s(android.net.Uri r2) {
            r1 = this;
            com.bumptech.glide.i r0 = r1.mo2766o()
            com.bumptech.glide.i r2 = r0.mo2756S(r2)
            return r2
    }

    /* renamed from: t */
    public com.bumptech.glide.C1005i<android.graphics.drawable.Drawable> mo2771t(java.lang.String r2) {
            r1 = this;
            com.bumptech.glide.i r0 = r1.mo2766o()
            com.bumptech.glide.i r2 = r0.mo2758U(r2)
            return r2
    }

    public synchronized java.lang.String toString() {
            r2 = this;
            monitor-enter(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = super.toString()     // Catch: java.lang.Throwable -> L2c
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "{tracker="
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            z2.n r1 = r2.f5169b0     // Catch: java.lang.Throwable -> L2c
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = ", treeNode="
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            z2.m r1 = r2.f5170c0     // Catch: java.lang.Throwable -> L2c
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "}"
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)
            return r0
        L2c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    /* renamed from: u */
    public synchronized void m2772u() {
            r4 = this;
            monitor-enter(r4)
            z2.n r0 = r4.f5169b0     // Catch: java.lang.Throwable -> L33
            r1 = 1
            r0.f27828b0 = r1     // Catch: java.lang.Throwable -> L33
            java.util.Set<c3.d> r1 = r0.f27826Z     // Catch: java.lang.Throwable -> L33
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L33
            java.util.List r1 = p106g3.C2238j.m5845e(r1)     // Catch: java.lang.Throwable -> L33
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L33
        L14:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L33
            c3.d r2 = (p033c3.InterfaceC0858d) r2     // Catch: java.lang.Throwable -> L33
            boolean r3 = r2.isRunning()     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L14
            r2.mo2560j()     // Catch: java.lang.Throwable -> L33
            java.util.List<c3.d> r3 = r0.f27827a0     // Catch: java.lang.Throwable -> L33
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L33
            r3.add(r2)     // Catch: java.lang.Throwable -> L33
            goto L14
        L31:
            monitor-exit(r4)
            return
        L33:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    /* renamed from: v */
    public synchronized void mo2773v(p033c3.C0862h r1) {
            r0 = this;
            monitor-enter(r0)
            c3.a r1 = r1.mo2532c()     // Catch: java.lang.Throwable -> L11
            c3.h r1 = (p033c3.C0862h) r1     // Catch: java.lang.Throwable -> L11
            c3.a r1 = r1.mo2531b()     // Catch: java.lang.Throwable -> L11
            c3.h r1 = (p033c3.C0862h) r1     // Catch: java.lang.Throwable -> L11
            r0.f5175h0 = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: w */
    public synchronized boolean m2774w(p049d3.InterfaceC1275g<?> r4) {
            r3 = this;
            monitor-enter(r3)
            c3.d r0 = r4.mo2573j()     // Catch: java.lang.Throwable -> L22
            r1 = 1
            if (r0 != 0) goto La
            monitor-exit(r3)
            return r1
        La:
            z2.n r2 = r3.f5169b0     // Catch: java.lang.Throwable -> L22
            boolean r0 = r2.m14306c(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1f
            z2.p r0 = r3.f5171d0     // Catch: java.lang.Throwable -> L22
            java.util.Set<d3.g<?>> r0 = r0.f27836Y     // Catch: java.lang.Throwable -> L22
            r0.remove(r4)     // Catch: java.lang.Throwable -> L22
            r0 = 0
            r4.mo2570g(r0)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r3)
            return r1
        L1f:
            r4 = 0
            monitor-exit(r3)
            return r4
        L22:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }
}
