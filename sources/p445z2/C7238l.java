package p445z2;

/* renamed from: z2.l */
/* loaded from: classes.dex */
public class C7238l implements android.os.Handler.Callback {

    /* renamed from: h0 */
    public static final p445z2.C7238l.b f27815h0 = null;

    /* renamed from: Y */
    public volatile com.bumptech.glide.ComponentCallbacks2C1006j f27816Y;

    /* renamed from: Z */
    public final java.util.Map<android.app.FragmentManager, p445z2.FragmentC7237k> f27817Z;

    /* renamed from: a0 */
    public final java.util.Map<androidx.fragment.app.AbstractC0375d0, p445z2.C7241o> f27818a0;

    /* renamed from: b0 */
    public final android.os.Handler f27819b0;

    /* renamed from: c0 */
    public final p445z2.C7238l.b f27820c0;

    /* renamed from: d0 */
    public final p319s.C5934a<android.view.View, androidx.fragment.app.ComponentCallbacksC0395n> f27821d0;

    /* renamed from: e0 */
    public final p319s.C5934a<android.view.View, android.app.Fragment> f27822e0;

    /* renamed from: f0 */
    public final android.os.Bundle f27823f0;

    /* renamed from: g0 */
    public final p445z2.InterfaceC7233g f27824g0;

    /* renamed from: z2.l$a */
    public class a implements p445z2.C7238l.b {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p445z2.C7238l.b
        /* renamed from: a */
        public com.bumptech.glide.ComponentCallbacks2C1006j mo2732a(com.bumptech.glide.ComponentCallbacks2C0999c r2, p445z2.InterfaceC7234h r3, p445z2.InterfaceC7239m r4, android.content.Context r5) {
                r1 = this;
                com.bumptech.glide.j r0 = new com.bumptech.glide.j
                r0.<init>(r2, r3, r4, r5)
                return r0
        }
    }

    /* renamed from: z2.l$b */
    public interface b {
        /* renamed from: a */
        com.bumptech.glide.ComponentCallbacks2C1006j mo2732a(com.bumptech.glide.ComponentCallbacks2C0999c r1, p445z2.InterfaceC7234h r2, p445z2.InterfaceC7239m r3, android.content.Context r4);
    }

    static {
            z2.l$a r0 = new z2.l$a
            r0.<init>()
            p445z2.C7238l.f27815h0 = r0
            return
    }

    public C7238l(p445z2.C7238l.b r2, com.bumptech.glide.C1002f r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f27817Z = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f27818a0 = r0
            s.a r0 = new s.a
            r0.<init>()
            r1.f27821d0 = r0
            s.a r0 = new s.a
            r0.<init>()
            r1.f27822e0 = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.f27823f0 = r0
            if (r2 == 0) goto L29
            goto L2b
        L29:
            z2.l$b r2 = p445z2.C7238l.f27815h0
        L2b:
            r1.f27820c0 = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0, r1)
            r1.f27819b0 = r2
            boolean r2 = p334t2.C6139q.f23699h
            if (r2 == 0) goto L58
            boolean r2 = p334t2.C6139q.f23698g
            if (r2 != 0) goto L41
            goto L58
        L41:
            java.lang.Class<com.bumptech.glide.d$d> r2 = com.bumptech.glide.C1000d.d.class
            java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = r3.f5133a
            boolean r2 = r3.containsKey(r2)
            if (r2 == 0) goto L51
            z2.f r2 = new z2.f
            r2.<init>()
            goto L5e
        L51:
            v1.b r2 = new v1.b
            r3 = 3
            r2.<init>(r3)
            goto L5e
        L58:
            m2.q r2 = new m2.q
            r3 = 2
            r2.<init>(r3)
        L5e:
            r1.f27824g0 = r2
            return
    }

    /* renamed from: a */
    public static android.app.Activity m14294a(android.content.Context r1) {
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L7
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
        L7:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L16
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            android.app.Activity r1 = m14294a(r1)
            return r1
        L16:
            r1 = 0
            return r1
    }

    /* renamed from: c */
    public static void m14295c(java.util.Collection<androidx.fragment.app.ComponentCallbacksC0395n> r2, java.util.Map<android.view.View, androidx.fragment.app.ComponentCallbacksC0395n> r3) {
            if (r2 != 0) goto L3
            return
        L3:
            java.util.Iterator r2 = r2.iterator()
        L7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r2.next()
            androidx.fragment.app.n r0 = (androidx.fragment.app.ComponentCallbacksC0395n) r0
            if (r0 == 0) goto L7
            android.view.View r1 = r0.f2260C0
            if (r1 != 0) goto L1a
            goto L7
        L1a:
            r3.put(r1, r0)
            androidx.fragment.app.d0 r0 = r0.m1337u()
            java.util.List r0 = r0.m1143L()
            m14295c(r0, r3)
            goto L7
        L29:
            return
    }

    /* renamed from: j */
    public static boolean m14296j(android.content.Context r0) {
            android.app.Activity r0 = m14294a(r0)
            if (r0 == 0) goto Lf
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    @android.annotation.TargetApi(26)
    @java.lang.Deprecated
    /* renamed from: b */
    public final void m14297b(android.app.FragmentManager r5, p319s.C5934a<android.view.View, android.app.Fragment> r6) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L2f
            java.util.List r5 = r5.getFragments()
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r5.next()
            android.app.Fragment r0 = (android.app.Fragment) r0
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto Le
            android.view.View r1 = r0.getView()
            r6.put(r1, r0)
            android.app.FragmentManager r0 = r0.getChildFragmentManager()
            r4.m14297b(r0, r6)
            goto Le
        L2f:
            r0 = 0
        L30:
            android.os.Bundle r1 = r4.f27823f0
            int r2 = r0 + 1
            java.lang.String r3 = "key"
            r1.putInt(r3, r0)
            r0 = 0
            android.os.Bundle r1 = r4.f27823f0     // Catch: java.lang.Exception -> L41
            android.app.Fragment r0 = r5.getFragment(r1, r3)     // Catch: java.lang.Exception -> L41
            goto L42
        L41:
        L42:
            if (r0 != 0) goto L45
        L44:
            return
        L45:
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto L59
            android.view.View r1 = r0.getView()
            r6.put(r1, r0)
            android.app.FragmentManager r0 = r0.getChildFragmentManager()
            r4.m14297b(r0, r6)
        L59:
            r0 = r2
            goto L30
    }

    @java.lang.Deprecated
    /* renamed from: d */
    public final com.bumptech.glide.ComponentCallbacks2C1006j m14298d(android.content.Context r4, android.app.FragmentManager r5, android.app.Fragment r6, boolean r7) {
            r3 = this;
            z2.k r5 = r3.m14302h(r5, r6)
            com.bumptech.glide.j r6 = r5.f27811b0
            if (r6 != 0) goto L1d
            com.bumptech.glide.c r6 = com.bumptech.glide.ComponentCallbacks2C0999c.m2734b(r4)
            z2.l$b r0 = r3.f27820c0
            z2.a r1 = r5.f27808Y
            z2.m r2 = r5.f27809Z
            com.bumptech.glide.j r6 = r0.mo2732a(r6, r1, r2, r4)
            if (r7 == 0) goto L1b
            r6.mo2575l()
        L1b:
            r5.f27811b0 = r6
        L1d:
            return r6
    }

    /* renamed from: e */
    public com.bumptech.glide.ComponentCallbacks2C1006j m14299e(android.app.Activity r4) {
            r3 = this;
            boolean r0 = p106g3.C2238j.m5848h()
            if (r0 == 0) goto Lf
            android.content.Context r4 = r4.getApplicationContext()
            com.bumptech.glide.j r4 = r3.m14300f(r4)
            return r4
        Lf:
            boolean r0 = r4 instanceof androidx.fragment.app.ActivityC0405s
            if (r0 == 0) goto L1a
            androidx.fragment.app.s r4 = (androidx.fragment.app.ActivityC0405s) r4
            com.bumptech.glide.j r4 = r3.m14301g(r4)
            return r4
        L1a:
            boolean r0 = r4.isDestroyed()
            if (r0 != 0) goto L33
            z2.g r0 = r3.f27824g0
            r0.mo9716g(r4)
            android.app.FragmentManager r0 = r4.getFragmentManager()
            r1 = 0
            boolean r2 = m14296j(r4)
            com.bumptech.glide.j r4 = r3.m14298d(r4, r0, r1, r2)
            return r4
        L33:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You cannot start a load for a destroyed activity"
            r4.<init>(r0)
            throw r4
    }

    /* renamed from: f */
    public com.bumptech.glide.ComponentCallbacks2C1006j m14300f(android.content.Context r6) {
            r5 = this;
            if (r6 == 0) goto L6d
            boolean r0 = p106g3.C2238j.m5849i()
            if (r0 == 0) goto L3c
            boolean r0 = r6 instanceof android.app.Application
            if (r0 != 0) goto L3c
            boolean r0 = r6 instanceof androidx.fragment.app.ActivityC0405s
            if (r0 == 0) goto L17
            androidx.fragment.app.s r6 = (androidx.fragment.app.ActivityC0405s) r6
            com.bumptech.glide.j r6 = r5.m14301g(r6)
            return r6
        L17:
            boolean r0 = r6 instanceof android.app.Activity
            if (r0 == 0) goto L22
            android.app.Activity r6 = (android.app.Activity) r6
            com.bumptech.glide.j r6 = r5.m14299e(r6)
            return r6
        L22:
            boolean r0 = r6 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L3c
            r0 = r6
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r1 = r0.getBaseContext()
            android.content.Context r1 = r1.getApplicationContext()
            if (r1 == 0) goto L3c
            android.content.Context r6 = r0.getBaseContext()
            com.bumptech.glide.j r6 = r5.m14300f(r6)
            return r6
        L3c:
            com.bumptech.glide.j r0 = r5.f27816Y
            if (r0 != 0) goto L6a
            monitor-enter(r5)
            com.bumptech.glide.j r0 = r5.f27816Y     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L65
            android.content.Context r0 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L67
            com.bumptech.glide.c r0 = com.bumptech.glide.ComponentCallbacks2C0999c.m2734b(r0)     // Catch: java.lang.Throwable -> L67
            z2.l$b r1 = r5.f27820c0     // Catch: java.lang.Throwable -> L67
            v1.b r2 = new v1.b     // Catch: java.lang.Throwable -> L67
            r3 = 2
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L67
            y.e r3 = new y.e     // Catch: java.lang.Throwable -> L67
            r4 = 1
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L67
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L67
            com.bumptech.glide.j r6 = r1.mo2732a(r0, r2, r3, r6)     // Catch: java.lang.Throwable -> L67
            r5.f27816Y = r6     // Catch: java.lang.Throwable -> L67
        L65:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L67
            goto L6a
        L67:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L67
            throw r6
        L6a:
            com.bumptech.glide.j r6 = r5.f27816Y
            return r6
        L6d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You cannot start a load on a null Context"
            r6.<init>(r0)
            throw r6
    }

    /* renamed from: g */
    public com.bumptech.glide.ComponentCallbacks2C1006j m14301g(androidx.fragment.app.ActivityC0405s r4) {
            r3 = this;
            boolean r0 = p106g3.C2238j.m5848h()
            if (r0 == 0) goto Lf
            android.content.Context r4 = r4.getApplicationContext()
            com.bumptech.glide.j r4 = r3.m14300f(r4)
            return r4
        Lf:
            boolean r0 = r4.isDestroyed()
            if (r0 != 0) goto L28
            z2.g r0 = r3.f27824g0
            r0.mo9716g(r4)
            androidx.fragment.app.d0 r0 = r4.m1354t()
            r1 = 0
            boolean r2 = m14296j(r4)
            com.bumptech.glide.j r4 = r3.m14304k(r4, r0, r1, r2)
            return r4
        L28:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You cannot start a load for a destroyed activity"
            r4.<init>(r0)
            throw r4
    }

    /* renamed from: h */
    public final p445z2.FragmentC7237k m14302h(android.app.FragmentManager r4, android.app.Fragment r5) {
            r3 = this;
            java.lang.String r0 = "com.bumptech.glide.manager"
            android.app.Fragment r1 = r4.findFragmentByTag(r0)
            z2.k r1 = (p445z2.FragmentC7237k) r1
            if (r1 != 0) goto L44
            java.util.Map<android.app.FragmentManager, z2.k> r1 = r3.f27817Z
            java.lang.Object r1 = r1.get(r4)
            z2.k r1 = (p445z2.FragmentC7237k) r1
            if (r1 != 0) goto L44
            z2.k r1 = new z2.k
            r1.<init>()
            r1.f27813d0 = r5
            if (r5 == 0) goto L2a
            android.app.Activity r2 = r5.getActivity()
            if (r2 == 0) goto L2a
            android.app.Activity r5 = r5.getActivity()
            r1.m14292a(r5)
        L2a:
            java.util.Map<android.app.FragmentManager, z2.k> r5 = r3.f27817Z
            r5.put(r4, r1)
            android.app.FragmentTransaction r5 = r4.beginTransaction()
            android.app.FragmentTransaction r5 = r5.add(r1, r0)
            r5.commitAllowingStateLoss()
            android.os.Handler r5 = r3.f27819b0
            r0 = 1
            android.os.Message r4 = r5.obtainMessage(r0, r4)
            r4.sendToTarget()
        L44:
            return r1
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message r6) {
            r5 = this;
            int r0 = r6.what
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L14
            r3 = 2
            if (r0 == r3) goto Lc
            r2 = 0
            r6 = r1
            goto L22
        Lc:
            java.lang.Object r6 = r6.obj
            r1 = r6
            androidx.fragment.app.d0 r1 = (androidx.fragment.app.AbstractC0375d0) r1
            java.util.Map<androidx.fragment.app.d0, z2.o> r6 = r5.f27818a0
            goto L1b
        L14:
            java.lang.Object r6 = r6.obj
            r1 = r6
            android.app.FragmentManager r1 = (android.app.FragmentManager) r1
            java.util.Map<android.app.FragmentManager, z2.k> r6 = r5.f27817Z
        L1b:
            java.lang.Object r6 = r6.remove(r1)
            r4 = r1
            r1 = r6
            r6 = r4
        L22:
            if (r2 == 0) goto L43
            if (r1 != 0) goto L43
            r0 = 5
            java.lang.String r1 = "RMRetriever"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Failed to remove expected request manager fragment, manager: "
            r0.append(r3)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.w(r1, r6)
        L43:
            return r2
    }

    /* renamed from: i */
    public final p445z2.C7241o m14303i(androidx.fragment.app.AbstractC0375d0 r5, androidx.fragment.app.ComponentCallbacksC0395n r6) {
            r4 = this;
            java.lang.String r0 = "com.bumptech.glide.manager"
            androidx.fragment.app.n r1 = r5.m1140I(r0)
            z2.o r1 = (p445z2.C7241o) r1
            if (r1 != 0) goto L53
            java.util.Map<androidx.fragment.app.d0, z2.o> r1 = r4.f27818a0
            java.lang.Object r1 = r1.get(r5)
            z2.o r1 = (p445z2.C7241o) r1
            if (r1 != 0) goto L53
            z2.o r1 = new z2.o
            r1.<init>()
            r1.f27834Z0 = r6
            if (r6 == 0) goto L37
            android.content.Context r2 = r6.m1339v()
            if (r2 != 0) goto L24
            goto L37
        L24:
            r2 = r6
        L25:
            androidx.fragment.app.n r3 = r2.f2297s0
            if (r3 == 0) goto L2b
            r2 = r3
            goto L25
        L2b:
            androidx.fragment.app.d0 r2 = r2.f2294p0
            if (r2 != 0) goto L30
            goto L37
        L30:
            android.content.Context r6 = r6.m1339v()
            r1.m14312E0(r6, r2)
        L37:
            java.util.Map<androidx.fragment.app.d0, z2.o> r6 = r4.f27818a0
            r6.put(r5, r1)
            androidx.fragment.app.a r6 = new androidx.fragment.app.a
            r6.<init>(r5)
            r2 = 0
            r3 = 1
            r6.m1081k(r2, r1, r0, r3)
            r6.m1077g()
            android.os.Handler r6 = r4.f27819b0
            r0 = 2
            android.os.Message r5 = r6.obtainMessage(r0, r5)
            r5.sendToTarget()
        L53:
            return r1
    }

    /* renamed from: k */
    public final com.bumptech.glide.ComponentCallbacks2C1006j m14304k(android.content.Context r4, androidx.fragment.app.AbstractC0375d0 r5, androidx.fragment.app.ComponentCallbacksC0395n r6, boolean r7) {
            r3 = this;
            z2.o r5 = r3.m14303i(r5, r6)
            com.bumptech.glide.j r6 = r5.f27833Y0
            if (r6 != 0) goto L1d
            com.bumptech.glide.c r6 = com.bumptech.glide.ComponentCallbacks2C0999c.m2734b(r4)
            z2.l$b r0 = r3.f27820c0
            z2.a r1 = r5.f27829U0
            z2.m r2 = r5.f27830V0
            com.bumptech.glide.j r6 = r0.mo2732a(r6, r1, r2, r4)
            if (r7 == 0) goto L1b
            r6.mo2575l()
        L1b:
            r5.f27833Y0 = r6
        L1d:
            return r6
    }
}
