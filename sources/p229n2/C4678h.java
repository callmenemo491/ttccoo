package p229n2;

/* renamed from: n2.h */
/* loaded from: classes.dex */
public final class C4678h implements p229n2.InterfaceC4672b {

    /* renamed from: a */
    public final p229n2.C4676f<p229n2.C4678h.a, java.lang.Object> f18617a;

    /* renamed from: b */
    public final p229n2.C4678h.b f18618b;

    /* renamed from: c */
    public final java.util.Map<java.lang.Class<?>, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> f18619c;

    /* renamed from: d */
    public final java.util.Map<java.lang.Class<?>, p229n2.InterfaceC4671a<?>> f18620d;

    /* renamed from: e */
    public final int f18621e;

    /* renamed from: f */
    public int f18622f;

    /* renamed from: n2.h$a */
    public static final class a implements p229n2.InterfaceC4681k {

        /* renamed from: a */
        public final p229n2.C4678h.b f18623a;

        /* renamed from: b */
        public int f18624b;

        /* renamed from: c */
        public java.lang.Class<?> f18625c;

        public a(p229n2.C4678h.b r1) {
                r0 = this;
                r0.<init>()
                r0.f18623a = r1
                return
        }

        @Override // p229n2.InterfaceC4681k
        /* renamed from: a */
        public void mo10704a() {
                r1 = this;
                n2.h$b r0 = r1.f18623a
                r0.m13173g(r1)
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof p229n2.C4678h.a
                r1 = 0
                if (r0 == 0) goto L14
                n2.h$a r4 = (p229n2.C4678h.a) r4
                int r0 = r3.f18624b
                int r2 = r4.f18624b
                if (r0 != r2) goto L14
                java.lang.Class<?> r0 = r3.f18625c
                java.lang.Class<?> r4 = r4.f18625c
                if (r0 != r4) goto L14
                r1 = 1
            L14:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.f18624b
                int r0 = r0 * 31
                java.lang.Class<?> r1 = r2.f18625c
                if (r1 == 0) goto Ld
                int r1 = r1.hashCode()
                goto Le
            Ld:
                r1 = 0
            Le:
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "Key{size="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                int r1 = r2.f18624b
                r0.append(r1)
                java.lang.String r1 = "array="
                r0.append(r1)
                java.lang.Class<?> r1 = r2.f18625c
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: n2.h$b */
    public static final class b extends p366v0.AbstractC6484c {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p366v0.AbstractC6484c
        /* renamed from: a */
        public p229n2.InterfaceC4681k mo10705a() {
                r1 = this;
                n2.h$a r0 = new n2.h$a
                r0.<init>(r1)
                return r0
        }

        /* renamed from: m */
        public p229n2.C4678h.a m10706m(int r2, java.lang.Class<?> r3) {
                r1 = this;
                n2.k r0 = r1.m13170c()
                n2.h$a r0 = (p229n2.C4678h.a) r0
                r0.f18624b = r2
                r0.f18625c = r3
                return r0
        }
    }

    public C4678h(int r2) {
            r1 = this;
            r1.<init>()
            n2.f r0 = new n2.f
            r0.<init>()
            r1.f18617a = r0
            n2.h$b r0 = new n2.h$b
            r0.<init>()
            r1.f18618b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f18619c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f18620d = r0
            r1.f18621e = r2
            return
    }

    @Override // p229n2.InterfaceC4672b
    /* renamed from: a */
    public synchronized void mo10684a(int r2) {
            r1 = this;
            monitor-enter(r1)
            r0 = 40
            if (r2 < r0) goto Lf
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L20
            r2 = 0
            r1.m10700g(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            goto L1e
        Lc:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        Lf:
            r0 = 20
            if (r2 >= r0) goto L17
            r0 = 15
            if (r2 != r0) goto L1e
        L17:
            int r2 = r1.f18621e     // Catch: java.lang.Throwable -> L20
            int r2 = r2 / 2
            r1.m10700g(r2)     // Catch: java.lang.Throwable -> L20
        L1e:
            monitor-exit(r1)
            return
        L20:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // p229n2.InterfaceC4672b
    /* renamed from: b */
    public synchronized void mo10685b() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.m10700g(r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // p229n2.InterfaceC4672b
    /* renamed from: c */
    public synchronized <T> T mo10686c(int r2, java.lang.Class<T> r3) {
            r1 = this;
            monitor-enter(r1)
            n2.h$b r0 = r1.f18618b     // Catch: java.lang.Throwable -> L13
            n2.k r0 = r0.m13170c()     // Catch: java.lang.Throwable -> L13
            n2.h$a r0 = (p229n2.C4678h.a) r0     // Catch: java.lang.Throwable -> L13
            r0.f18624b = r2     // Catch: java.lang.Throwable -> L13
            r0.f18625c = r3     // Catch: java.lang.Throwable -> L13
            java.lang.Object r2 = r1.m10702i(r0, r3)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return r2
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // p229n2.InterfaceC4672b
    /* renamed from: d */
    public synchronized <T> void mo10687d(T r6) {
            r5 = this;
            monitor-enter(r5)
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.Throwable -> L5d
            n2.a r1 = r5.m10701h(r0)     // Catch: java.lang.Throwable -> L5d
            int r2 = r1.mo10681a(r6)     // Catch: java.lang.Throwable -> L5d
            int r1 = r1.mo10682b()     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 * r2
            int r3 = r5.f18621e     // Catch: java.lang.Throwable -> L5d
            int r3 = r3 / 2
            r4 = 1
            if (r1 > r3) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 != 0) goto L21
            monitor-exit(r5)
            return
        L21:
            n2.h$b r3 = r5.f18618b     // Catch: java.lang.Throwable -> L5d
            n2.h$a r2 = r3.m10706m(r2, r0)     // Catch: java.lang.Throwable -> L5d
            n2.f<n2.h$a, java.lang.Object> r3 = r5.f18617a     // Catch: java.lang.Throwable -> L5d
            r3.m10696b(r2, r6)     // Catch: java.lang.Throwable -> L5d
            java.util.NavigableMap r6 = r5.m10703j(r0)     // Catch: java.lang.Throwable -> L5d
            int r0 = r2.f18624b     // Catch: java.lang.Throwable -> L5d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = r6.get(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L5d
            int r2 = r2.f18624b     // Catch: java.lang.Throwable -> L5d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L45
            goto L4a
        L45:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L5d
            int r4 = r4 + r0
        L4a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L5d
            r6.put(r2, r0)     // Catch: java.lang.Throwable -> L5d
            int r6 = r5.f18622f     // Catch: java.lang.Throwable -> L5d
            int r6 = r6 + r1
            r5.f18622f = r6     // Catch: java.lang.Throwable -> L5d
            int r6 = r5.f18621e     // Catch: java.lang.Throwable -> L5d
            r5.m10700g(r6)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r5)
            return
        L5d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @Override // p229n2.InterfaceC4672b
    /* renamed from: e */
    public synchronized <T> T mo10688e(int r6, java.lang.Class<T> r7) {
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.m10703j(r7)     // Catch: java.lang.Throwable -> L4d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L4d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2c
            int r3 = r5.f18622f     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L20
            int r4 = r5.f18621e     // Catch: java.lang.Throwable -> L4d
            int r4 = r4 / r3
            r3 = 2
            if (r4 < r3) goto L1e
            goto L20
        L1e:
            r3 = 0
            goto L21
        L20:
            r3 = 1
        L21:
            if (r3 != 0) goto L2d
            int r3 = r0.intValue()     // Catch: java.lang.Throwable -> L4d
            int r4 = r6 * 8
            if (r3 > r4) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            if (r1 == 0) goto L3a
            n2.h$b r6 = r5.f18618b     // Catch: java.lang.Throwable -> L4d
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L4d
            n2.h$a r6 = r6.m10706m(r0, r7)     // Catch: java.lang.Throwable -> L4d
            goto L47
        L3a:
            n2.h$b r0 = r5.f18618b     // Catch: java.lang.Throwable -> L4d
            n2.k r0 = r0.m13170c()     // Catch: java.lang.Throwable -> L4d
            n2.h$a r0 = (p229n2.C4678h.a) r0     // Catch: java.lang.Throwable -> L4d
            r0.f18624b = r6     // Catch: java.lang.Throwable -> L4d
            r0.f18625c = r7     // Catch: java.lang.Throwable -> L4d
            r6 = r0
        L47:
            java.lang.Object r6 = r5.m10702i(r6, r7)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r5)
            return r6
        L4d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    /* renamed from: f */
    public final void m10699f(int r4, java.lang.Class<?> r5) {
            r3 = this;
            java.util.NavigableMap r5 = r3.m10703j(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r5.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L2c
            int r1 = r0.intValue()
            r2 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            if (r1 != r2) goto L1f
            r5.remove(r4)
            goto L2b
        L1f:
            int r0 = r0.intValue()
            int r0 = r0 - r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.put(r4, r0)
        L2b:
            return
        L2c:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Tried to decrement empty size, size: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ", this: "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
    }

    /* renamed from: g */
    public final void m10700g(int r6) {
            r5 = this;
        L0:
            int r0 = r5.f18622f
            if (r0 <= r6) goto L55
            n2.f<n2.h$a, java.lang.Object> r0 = r5.f18617a
            java.lang.Object r0 = r0.m10697c()
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.Class r1 = r0.getClass()
            n2.a r1 = r5.m10701h(r1)
            int r2 = r5.f18622f
            int r3 = r1.mo10681a(r0)
            int r4 = r1.mo10682b()
            int r4 = r4 * r3
            int r2 = r2 - r4
            r5.f18622f = r2
            int r2 = r1.mo10681a(r0)
            java.lang.Class r3 = r0.getClass()
            r5.m10699f(r2, r3)
            java.lang.String r2 = r1.mo10683m()
            r3 = 2
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L0
            java.lang.String r2 = r1.mo10683m()
            java.lang.String r3 = "evicted: "
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            int r0 = r1.mo10681a(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.v(r2, r0)
            goto L0
        L55:
            return
    }

    /* renamed from: h */
    public final <T> p229n2.InterfaceC4671a<T> m10701h(java.lang.Class<T> r3) {
            r2 = this;
            java.util.Map<java.lang.Class<?>, n2.a<?>> r0 = r2.f18620d
            java.lang.Object r0 = r0.get(r3)
            n2.a r0 = (p229n2.InterfaceC4671a) r0
            if (r0 != 0) goto L42
            java.lang.Class<int[]> r0 = int[].class
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L18
            n2.g r0 = new n2.g
            r0.<init>()
            goto L25
        L18:
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L2b
            n2.e r0 = new n2.e
            r0.<init>()
        L25:
            java.util.Map<java.lang.Class<?>, n2.a<?>> r1 = r2.f18620d
            r1.put(r3, r0)
            goto L42
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No array pool found for: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L42:
            return r0
    }

    /* renamed from: i */
    public final <T> T m10702i(p229n2.C4678h.a r6, java.lang.Class<T> r7) {
            r5 = this;
            n2.a r0 = r5.m10701h(r7)
            n2.f<n2.h$a, java.lang.Object> r1 = r5.f18617a
            java.lang.Object r1 = r1.m10695a(r6)
            if (r1 == 0) goto L22
            int r2 = r5.f18622f
            int r3 = r0.mo10681a(r1)
            int r4 = r0.mo10682b()
            int r4 = r4 * r3
            int r2 = r2 - r4
            r5.f18622f = r2
            int r2 = r0.mo10681a(r1)
            r5.m10699f(r2, r7)
        L22:
            if (r1 != 0) goto L50
            java.lang.String r7 = r0.mo10683m()
            r1 = 2
            boolean r7 = android.util.Log.isLoggable(r7, r1)
            if (r7 == 0) goto L4a
            java.lang.String r7 = r0.mo10683m()
            java.lang.String r1 = "Allocated "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r2 = r6.f18624b
            r1.append(r2)
            java.lang.String r2 = " bytes"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r7, r1)
        L4a:
            int r6 = r6.f18624b
            java.lang.Object r1 = r0.newArray(r6)
        L50:
            return r1
    }

    /* renamed from: j */
    public final java.util.NavigableMap<java.lang.Integer, java.lang.Integer> m10703j(java.lang.Class<?> r3) {
            r2 = this;
            java.util.Map<java.lang.Class<?>, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r0 = r2.f18619c
            java.lang.Object r0 = r0.get(r3)
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            if (r0 != 0) goto L14
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.util.Map<java.lang.Class<?>, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>> r1 = r2.f18619c
            r1.put(r3, r0)
        L14:
            return r0
    }
}
