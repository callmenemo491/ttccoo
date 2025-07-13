package androidx.lifecycle;

/* renamed from: androidx.lifecycle.w */
/* loaded from: classes.dex */
public class C0472w extends androidx.lifecycle.AbstractC0458o {

    /* renamed from: b */
    public p226n.C4639a<androidx.lifecycle.InterfaceC0470u, androidx.lifecycle.C0472w.a> f2563b;

    /* renamed from: c */
    public androidx.lifecycle.AbstractC0458o.c f2564c;

    /* renamed from: d */
    public final java.lang.ref.WeakReference<androidx.lifecycle.InterfaceC0471v> f2565d;

    /* renamed from: e */
    public int f2566e;

    /* renamed from: f */
    public boolean f2567f;

    /* renamed from: g */
    public boolean f2568g;

    /* renamed from: h */
    public java.util.ArrayList<androidx.lifecycle.AbstractC0458o.c> f2569h;

    /* renamed from: i */
    public final boolean f2570i;

    /* renamed from: androidx.lifecycle.w$a */
    public static class a {

        /* renamed from: a */
        public androidx.lifecycle.AbstractC0458o.c f2571a;

        /* renamed from: b */
        public androidx.lifecycle.InterfaceC0468t f2572b;

        public a(androidx.lifecycle.InterfaceC0470u r5, androidx.lifecycle.AbstractC0458o.c r6) {
                r4 = this;
                r4.<init>()
                java.util.Map<java.lang.Class<?>, java.lang.Integer> r0 = androidx.lifecycle.C0474y.f2573a
                boolean r0 = r5 instanceof androidx.lifecycle.InterfaceC0468t
                boolean r1 = r5 instanceof androidx.lifecycle.InterfaceC0454m
                if (r0 == 0) goto L18
                if (r1 == 0) goto L18
                androidx.lifecycle.FullLifecycleObserverAdapter r0 = new androidx.lifecycle.FullLifecycleObserverAdapter
                r1 = r5
                androidx.lifecycle.m r1 = (androidx.lifecycle.InterfaceC0454m) r1
                androidx.lifecycle.t r5 = (androidx.lifecycle.InterfaceC0468t) r5
                r0.<init>(r1, r5)
                goto L7c
            L18:
                if (r1 == 0) goto L23
                androidx.lifecycle.FullLifecycleObserverAdapter r0 = new androidx.lifecycle.FullLifecycleObserverAdapter
                androidx.lifecycle.m r5 = (androidx.lifecycle.InterfaceC0454m) r5
                r1 = 0
                r0.<init>(r5, r1)
                goto L7c
            L23:
                if (r0 == 0) goto L29
                r0 = r5
                androidx.lifecycle.t r0 = (androidx.lifecycle.InterfaceC0468t) r0
                goto L7c
            L29:
                java.lang.Class r0 = r5.getClass()
                int r1 = androidx.lifecycle.C0474y.m1470c(r0)
                r2 = 2
                if (r1 != r2) goto L77
                java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.n>>> r1 = androidx.lifecycle.C0474y.f2574b
                java.util.HashMap r1 = (java.util.HashMap) r1
                java.lang.Object r0 = r1.get(r0)
                java.util.List r0 = (java.util.List) r0
                int r1 = r0.size()
                r2 = 0
                r3 = 1
                if (r1 != r3) goto L56
                java.lang.Object r0 = r0.get(r2)
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                androidx.lifecycle.n r5 = androidx.lifecycle.C0474y.m1468a(r0, r5)
                androidx.lifecycle.SingleGeneratedAdapterObserver r0 = new androidx.lifecycle.SingleGeneratedAdapterObserver
                r0.<init>(r5)
                goto L7c
            L56:
                int r1 = r0.size()
                androidx.lifecycle.n[] r1 = new androidx.lifecycle.InterfaceC0456n[r1]
            L5c:
                int r3 = r0.size()
                if (r2 >= r3) goto L71
                java.lang.Object r3 = r0.get(r2)
                java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3
                androidx.lifecycle.n r3 = androidx.lifecycle.C0474y.m1468a(r3, r5)
                r1[r2] = r3
                int r2 = r2 + 1
                goto L5c
            L71:
                androidx.lifecycle.CompositeGeneratedAdaptersObserver r0 = new androidx.lifecycle.CompositeGeneratedAdaptersObserver
                r0.<init>(r1)
                goto L7c
            L77:
                androidx.lifecycle.ReflectiveGenericLifecycleObserver r0 = new androidx.lifecycle.ReflectiveGenericLifecycleObserver
                r0.<init>(r5)
            L7c:
                r4.f2572b = r0
                r4.f2571a = r6
                return
        }

        /* renamed from: a */
        public void m1467a(androidx.lifecycle.InterfaceC0471v r3, androidx.lifecycle.AbstractC0458o.b r4) {
                r2 = this;
                androidx.lifecycle.o$c r0 = r4.m1457e()
                androidx.lifecycle.o$c r1 = r2.f2571a
                androidx.lifecycle.o$c r1 = androidx.lifecycle.C0472w.m1459f(r1, r0)
                r2.f2571a = r1
                androidx.lifecycle.t r1 = r2.f2572b
                r1.mo435d(r3, r4)
                r2.f2571a = r0
                return
        }
    }

    public C0472w(androidx.lifecycle.InterfaceC0471v r2) {
            r1 = this;
            r1.<init>()
            n.a r0 = new n.a
            r0.<init>()
            r1.f2563b = r0
            r0 = 0
            r1.f2566e = r0
            r1.f2567f = r0
            r1.f2568g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2569h = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f2565d = r0
            androidx.lifecycle.o$c r2 = androidx.lifecycle.AbstractC0458o.c.f2547Z
            r1.f2564c = r2
            r2 = 1
            r1.f2570i = r2
            return
    }

    /* renamed from: f */
    public static androidx.lifecycle.AbstractC0458o.c m1459f(androidx.lifecycle.AbstractC0458o.c r1, androidx.lifecycle.AbstractC0458o.c r2) {
            if (r2 == 0) goto L9
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L9
            r1 = r2
        L9:
            return r1
    }

    @Override // androidx.lifecycle.AbstractC0458o
    /* renamed from: a */
    public void mo1454a(androidx.lifecycle.InterfaceC0470u r6) {
            r5 = this;
            java.lang.String r0 = "addObserver"
            r5.m1461d(r0)
            androidx.lifecycle.o$c r0 = r5.f2564c
            androidx.lifecycle.o$c r1 = androidx.lifecycle.AbstractC0458o.c.f2546Y
            if (r0 != r1) goto Lc
            goto Le
        Lc:
            androidx.lifecycle.o$c r1 = androidx.lifecycle.AbstractC0458o.c.f2547Z
        Le:
            androidx.lifecycle.w$a r0 = new androidx.lifecycle.w$a
            r0.<init>(r6, r1)
            n.a<androidx.lifecycle.u, androidx.lifecycle.w$a> r1 = r5.f2563b
            java.lang.Object r1 = r1.mo10455i(r6, r0)
            androidx.lifecycle.w$a r1 = (androidx.lifecycle.C0472w.a) r1
            if (r1 == 0) goto L1e
            return
        L1e:
            java.lang.ref.WeakReference<androidx.lifecycle.v> r1 = r5.f2565d
            java.lang.Object r1 = r1.get()
            androidx.lifecycle.v r1 = (androidx.lifecycle.InterfaceC0471v) r1
            if (r1 != 0) goto L29
            return
        L29:
            int r2 = r5.f2566e
            if (r2 != 0) goto L34
            boolean r2 = r5.f2567f
            if (r2 == 0) goto L32
            goto L34
        L32:
            r2 = 0
            goto L35
        L34:
            r2 = 1
        L35:
            androidx.lifecycle.o$c r3 = r5.m1460c(r6)
            int r4 = r5.f2566e
            int r4 = r4 + 1
            r5.f2566e = r4
        L3f:
            androidx.lifecycle.o$c r4 = r0.f2571a
            int r3 = r4.compareTo(r3)
            if (r3 >= 0) goto L80
            n.a<androidx.lifecycle.u, androidx.lifecycle.w$a> r3 = r5.f2563b
            java.util.HashMap<K, n.b$c<K, V>> r3 = r3.f18487c0
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L80
            androidx.lifecycle.o$c r3 = r0.f2571a
            java.util.ArrayList<androidx.lifecycle.o$c> r4 = r5.f2569h
            r4.add(r3)
            androidx.lifecycle.o$c r3 = r0.f2571a
            androidx.lifecycle.o$b r3 = androidx.lifecycle.AbstractC0458o.b.m1456g(r3)
            if (r3 == 0) goto L6b
            r0.m1467a(r1, r3)
            r5.m1464h()
            androidx.lifecycle.o$c r3 = r5.m1460c(r6)
            goto L3f
        L6b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r1 = "no event up from "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            androidx.lifecycle.o$c r0 = r0.f2571a
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
        L80:
            if (r2 != 0) goto L85
            r5.m1466j()
        L85:
            int r6 = r5.f2566e
            int r6 = r6 + (-1)
            r5.f2566e = r6
            return
    }

    @Override // androidx.lifecycle.AbstractC0458o
    /* renamed from: b */
    public void mo1455b(androidx.lifecycle.InterfaceC0470u r2) {
            r1 = this;
            java.lang.String r0 = "removeObserver"
            r1.m1461d(r0)
            n.a<androidx.lifecycle.u, androidx.lifecycle.w$a> r0 = r1.f2563b
            r0.mo10456l(r2)
            return
    }

    /* renamed from: c */
    public final androidx.lifecycle.AbstractC0458o.c m1460c(androidx.lifecycle.InterfaceC0470u r4) {
            r3 = this;
            n.a<androidx.lifecycle.u, androidx.lifecycle.w$a> r0 = r3.f2563b
            java.util.HashMap<K, n.b$c<K, V>> r1 = r0.f18487c0
            boolean r1 = r1.containsKey(r4)
            r2 = 0
            if (r1 == 0) goto L16
            java.util.HashMap<K, n.b$c<K, V>> r0 = r0.f18487c0
            java.lang.Object r4 = r0.get(r4)
            n.b$c r4 = (p226n.C4640b.c) r4
            n.b$c<K, V> r4 = r4.f18495b0
            goto L17
        L16:
            r4 = r2
        L17:
            if (r4 == 0) goto L20
            V r4 = r4.f18493Z
            androidx.lifecycle.w$a r4 = (androidx.lifecycle.C0472w.a) r4
            androidx.lifecycle.o$c r4 = r4.f2571a
            goto L21
        L20:
            r4 = r2
        L21:
            java.util.ArrayList<androidx.lifecycle.o$c> r0 = r3.f2569h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L38
            java.util.ArrayList<androidx.lifecycle.o$c> r0 = r3.f2569h
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            androidx.lifecycle.o$c r2 = (androidx.lifecycle.AbstractC0458o.c) r2
        L38:
            androidx.lifecycle.o$c r0 = r3.f2564c
            androidx.lifecycle.o$c r4 = m1459f(r0, r4)
            androidx.lifecycle.o$c r4 = m1459f(r4, r2)
            return r4
    }

    @android.annotation.SuppressLint({"RestrictedApi"})
    /* renamed from: d */
    public final void m1461d(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.f2570i
            if (r0 == 0) goto L1d
            m.a r0 = p211m.C4308a.m9633j()
            boolean r0 = r0.mo9635f()
            if (r0 == 0) goto Lf
            goto L1d
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Method "
            java.lang.String r2 = " must be called on the main thread"
            java.lang.String r4 = android.support.v4.media.C0145d.m257a(r1, r4, r2)
            r0.<init>(r4)
            throw r0
        L1d:
            return
    }

    /* renamed from: e */
    public void m1462e(androidx.lifecycle.AbstractC0458o.b r2) {
            r1 = this;
            java.lang.String r0 = "handleLifecycleEvent"
            r1.m1461d(r0)
            androidx.lifecycle.o$c r2 = r2.m1457e()
            r1.m1463g(r2)
            return
    }

    /* renamed from: g */
    public final void m1463g(androidx.lifecycle.AbstractC0458o.c r2) {
            r1 = this;
            androidx.lifecycle.o$c r0 = r1.f2564c
            if (r0 != r2) goto L5
            return
        L5:
            r1.f2564c = r2
            boolean r2 = r1.f2567f
            r0 = 1
            if (r2 != 0) goto L1a
            int r2 = r1.f2566e
            if (r2 == 0) goto L11
            goto L1a
        L11:
            r1.f2567f = r0
            r1.m1466j()
            r2 = 0
            r1.f2567f = r2
            return
        L1a:
            r1.f2568g = r0
            return
    }

    /* renamed from: h */
    public final void m1464h() {
            r2 = this;
            java.util.ArrayList<androidx.lifecycle.o$c> r0 = r2.f2569h
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            return
    }

    /* renamed from: i */
    public void m1465i(androidx.lifecycle.AbstractC0458o.c r2) {
            r1 = this;
            java.lang.String r0 = "setCurrentState"
            r1.m1461d(r0)
            r1.m1463g(r2)
            return
    }

    /* renamed from: j */
    public final void m1466j() {
            r7 = this;
            java.lang.ref.WeakReference<androidx.lifecycle.v> r0 = r7.f2565d
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.v r0 = (androidx.lifecycle.InterfaceC0471v) r0
            if (r0 == 0) goto L13b
        La:
            n.a<androidx.lifecycle.u, androidx.lifecycle.w$a> r1 = r7.f2563b
            int r2 = r1.f18491b0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L13
            goto L2b
        L13:
            n.b$c<K, V> r2 = r1.f18488Y
            V r2 = r2.f18493Z
            androidx.lifecycle.w$a r2 = (androidx.lifecycle.C0472w.a) r2
            androidx.lifecycle.o$c r2 = r2.f2571a
            n.b$c<K, V> r5 = r1.f18489Z
            V r5 = r5.f18493Z
            androidx.lifecycle.w$a r5 = (androidx.lifecycle.C0472w.a) r5
            androidx.lifecycle.o$c r5 = r5.f2571a
            if (r2 != r5) goto L2a
            androidx.lifecycle.o$c r2 = r7.f2564c
            if (r2 != r5) goto L2a
            goto L2b
        L2a:
            r3 = 0
        L2b:
            r7.f2568g = r4
            if (r3 != 0) goto L13a
            androidx.lifecycle.o$c r2 = r7.f2564c
            n.b$c<K, V> r1 = r1.f18488Y
            V r1 = r1.f18493Z
            androidx.lifecycle.w$a r1 = (androidx.lifecycle.C0472w.a) r1
            androidx.lifecycle.o$c r1 = r1.f2571a
            int r1 = r2.compareTo(r1)
            if (r1 >= 0) goto Lc1
            n.a<androidx.lifecycle.u, androidx.lifecycle.w$a> r1 = r7.f2563b
            n.b$b r2 = new n.b$b
            n.b$c<K, V> r3 = r1.f18489Z
            n.b$c<K, V> r4 = r1.f18488Y
            r2.<init>(r3, r4)
            java.util.WeakHashMap<n.b$f<K, V>, java.lang.Boolean> r1 = r1.f18490a0
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.put(r2, r3)
        L51:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto Lc1
            boolean r1 = r7.f2568g
            if (r1 != 0) goto Lc1
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getValue()
            androidx.lifecycle.w$a r3 = (androidx.lifecycle.C0472w.a) r3
        L67:
            androidx.lifecycle.o$c r4 = r3.f2571a
            androidx.lifecycle.o$c r5 = r7.f2564c
            int r4 = r4.compareTo(r5)
            if (r4 <= 0) goto L51
            boolean r4 = r7.f2568g
            if (r4 != 0) goto L51
            n.a<androidx.lifecycle.u, androidx.lifecycle.w$a> r4 = r7.f2563b
            java.lang.Object r5 = r1.getKey()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L51
            androidx.lifecycle.o$c r4 = r3.f2571a
            int r4 = r4.ordinal()
            r5 = 2
            if (r4 == r5) goto L98
            r5 = 3
            if (r4 == r5) goto L95
            r5 = 4
            if (r4 == r5) goto L92
            r4 = 0
            goto L9a
        L92:
            androidx.lifecycle.o$b r4 = androidx.lifecycle.AbstractC0458o.b.ON_PAUSE
            goto L9a
        L95:
            androidx.lifecycle.o$b r4 = androidx.lifecycle.AbstractC0458o.b.ON_STOP
            goto L9a
        L98:
            androidx.lifecycle.o$b r4 = androidx.lifecycle.AbstractC0458o.b.ON_DESTROY
        L9a:
            if (r4 == 0) goto Lac
            androidx.lifecycle.o$c r5 = r4.m1457e()
            java.util.ArrayList<androidx.lifecycle.o$c> r6 = r7.f2569h
            r6.add(r5)
            r3.m1467a(r0, r4)
            r7.m1464h()
            goto L67
        Lac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "no event down from "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            androidx.lifecycle.o$c r2 = r3.f2571a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lc1:
            n.a<androidx.lifecycle.u, androidx.lifecycle.w$a> r1 = r7.f2563b
            n.b$c<K, V> r1 = r1.f18489Z
            boolean r2 = r7.f2568g
            if (r2 != 0) goto La
            if (r1 == 0) goto La
            androidx.lifecycle.o$c r2 = r7.f2564c
            V r1 = r1.f18493Z
            androidx.lifecycle.w$a r1 = (androidx.lifecycle.C0472w.a) r1
            androidx.lifecycle.o$c r1 = r1.f2571a
            int r1 = r2.compareTo(r1)
            if (r1 <= 0) goto La
            n.a<androidx.lifecycle.u, androidx.lifecycle.w$a> r1 = r7.f2563b
            n.b$d r1 = r1.m10457e()
        Ldf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La
            boolean r2 = r7.f2568g
            if (r2 != 0) goto La
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            androidx.lifecycle.w$a r3 = (androidx.lifecycle.C0472w.a) r3
        Lf5:
            androidx.lifecycle.o$c r4 = r3.f2571a
            androidx.lifecycle.o$c r5 = r7.f2564c
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto Ldf
            boolean r4 = r7.f2568g
            if (r4 != 0) goto Ldf
            n.a<androidx.lifecycle.u, androidx.lifecycle.w$a> r4 = r7.f2563b
            java.lang.Object r5 = r2.getKey()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto Ldf
            androidx.lifecycle.o$c r4 = r3.f2571a
            java.util.ArrayList<androidx.lifecycle.o$c> r5 = r7.f2569h
            r5.add(r4)
            androidx.lifecycle.o$c r4 = r3.f2571a
            androidx.lifecycle.o$b r4 = androidx.lifecycle.AbstractC0458o.b.m1456g(r4)
            if (r4 == 0) goto L125
            r3.m1467a(r0, r4)
            r7.m1464h()
            goto Lf5
        L125:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "no event up from "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            androidx.lifecycle.o$c r2 = r3.f2571a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L13a:
            return
        L13b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state."
            r0.<init>(r1)
            throw r0
    }
}
