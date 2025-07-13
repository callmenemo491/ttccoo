package p026b9;

/* renamed from: b9.d0 */
/* loaded from: classes.dex */
public final class C0695d0<K, V> extends p026b9.AbstractC0715o<K, V> {

    /* renamed from: e0 */
    public static final p026b9.AbstractC0715o<java.lang.Object, java.lang.Object> f3901e0 = null;

    /* renamed from: b0 */
    public final transient java.lang.Object f3902b0;

    /* renamed from: c0 */
    public final transient java.lang.Object[] f3903c0;

    /* renamed from: d0 */
    public final transient int f3904d0;

    /* renamed from: b9.d0$a */
    public static class a<K, V> extends p026b9.AbstractC0716p<java.util.Map.Entry<K, V>> {

        /* renamed from: b0 */
        public final transient p026b9.AbstractC0715o<K, V> f3905b0;

        /* renamed from: c0 */
        public final transient java.lang.Object[] f3906c0;

        /* renamed from: d0 */
        public final transient int f3907d0;

        /* renamed from: e0 */
        public final transient int f3908e0;

        /* renamed from: b9.d0$a$a, reason: collision with other inner class name */
        public class C7367a extends p026b9.AbstractC0714n<java.util.Map.Entry<K, V>> {

            /* renamed from: a0 */
            public final /* synthetic */ p026b9.C0695d0.a f3909a0;

            public C7367a(p026b9.C0695d0.a r1) {
                    r0 = this;
                    r0.f3909a0 = r1
                    r0.<init>()
                    return
            }

            @Override // java.util.List
            public java.lang.Object get(int r4) {
                    r3 = this;
                    b9.d0$a r0 = r3.f3909a0
                    int r0 = r0.f3908e0
                    p124h7.C2939x3.m7280f(r4, r0)
                    b9.d0$a r0 = r3.f3909a0
                    java.lang.Object[] r1 = r0.f3906c0
                    int r4 = r4 * 2
                    int r0 = r0.f3907d0
                    int r2 = r4 + r0
                    r2 = r1[r2]
                    r0 = r0 ^ 1
                    int r4 = r4 + r0
                    r4 = r1[r4]
                    java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                    r0.<init>(r2, r4)
                    return r0
            }

            @Override // p026b9.AbstractC0710l
            /* renamed from: m */
            public boolean mo2264m() {
                    r1 = this;
                    r0 = 1
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                    r1 = this;
                    b9.d0$a r0 = r1.f3909a0
                    int r0 = r0.f3908e0
                    return r0
            }
        }

        public a(p026b9.AbstractC0715o<K, V> r1, java.lang.Object[] r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.f3905b0 = r1
                r0.f3906c0 = r2
                r0.f3907d0 = r3
                r0.f3908e0 = r4
                return
        }

        @Override // p026b9.AbstractC0710l, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L1e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                java.lang.Object r4 = r4.getValue()
                if (r4 == 0) goto L1e
                b9.o<K, V> r2 = r3.f3905b0
                java.lang.Object r0 = r2.get(r0)
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L1e
                r1 = 1
            L1e:
                return r1
        }

        @Override // p026b9.AbstractC0710l
        /* renamed from: e */
        public int mo2260e(java.lang.Object[] r2, int r3) {
                r1 = this;
                b9.n r0 = r1.mo2272a()
                int r2 = r0.mo2260e(r2, r3)
                return r2
        }

        @Override // p026b9.AbstractC0716p, p026b9.AbstractC0710l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                b9.m0 r0 = r1.mo2270n()
                return r0
        }

        @Override // p026b9.AbstractC0710l
        /* renamed from: m */
        public boolean mo2264m() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // p026b9.AbstractC0710l
        /* renamed from: n */
        public p026b9.AbstractC0713m0<java.util.Map.Entry<K, V>> mo2270n() {
                r1 = this;
                b9.n r0 = r1.mo2272a()
                b9.a r0 = r0.m2313A()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                int r0 = r1.f3908e0
                return r0
        }

        @Override // p026b9.AbstractC0716p
        /* renamed from: w */
        public p026b9.AbstractC0714n<java.util.Map.Entry<K, V>> mo2271w() {
                r1 = this;
                b9.d0$a$a r0 = new b9.d0$a$a
                r0.<init>(r1)
                return r0
        }
    }

    /* renamed from: b9.d0$b */
    public static final class b<K> extends p026b9.AbstractC0716p<K> {

        /* renamed from: b0 */
        public final transient p026b9.AbstractC0715o<K, ?> f3910b0;

        /* renamed from: c0 */
        public final transient p026b9.AbstractC0714n<K> f3911c0;

        public b(p026b9.AbstractC0715o<K, ?> r1, p026b9.AbstractC0714n<K> r2) {
                r0 = this;
                r0.<init>()
                r0.f3910b0 = r1
                r0.f3911c0 = r2
                return
        }

        @Override // p026b9.AbstractC0716p, p026b9.AbstractC0710l
        /* renamed from: a */
        public p026b9.AbstractC0714n<K> mo2272a() {
                r1 = this;
                b9.n<K> r0 = r1.f3911c0
                return r0
        }

        @Override // p026b9.AbstractC0710l, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                b9.o<K, ?> r0 = r1.f3910b0
                java.lang.Object r2 = r0.get(r2)
                if (r2 == 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @Override // p026b9.AbstractC0710l
        /* renamed from: e */
        public int mo2260e(java.lang.Object[] r2, int r3) {
                r1 = this;
                b9.n<K> r0 = r1.f3911c0
                int r2 = r0.mo2260e(r2, r3)
                return r2
        }

        @Override // p026b9.AbstractC0716p, p026b9.AbstractC0710l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                r1 = this;
                b9.m0 r0 = r1.mo2270n()
                return r0
        }

        @Override // p026b9.AbstractC0710l
        /* renamed from: m */
        public boolean mo2264m() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // p026b9.AbstractC0710l
        /* renamed from: n */
        public p026b9.AbstractC0713m0<K> mo2270n() {
                r1 = this;
                b9.n<K> r0 = r1.f3911c0
                b9.a r0 = r0.m2313A()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                b9.o<K, ?> r0 = r1.f3910b0
                int r0 = r0.size()
                return r0
        }
    }

    /* renamed from: b9.d0$c */
    public static final class c extends p026b9.AbstractC0714n<java.lang.Object> {

        /* renamed from: a0 */
        public final transient java.lang.Object[] f3912a0;

        /* renamed from: b0 */
        public final transient int f3913b0;

        /* renamed from: c0 */
        public final transient int f3914c0;

        public c(java.lang.Object[] r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f3912a0 = r1
                r0.f3913b0 = r2
                r0.f3914c0 = r3
                return
        }

        @Override // java.util.List
        public java.lang.Object get(int r3) {
                r2 = this;
                int r0 = r2.f3914c0
                p124h7.C2939x3.m7280f(r3, r0)
                java.lang.Object[] r0 = r2.f3912a0
                int r3 = r3 * 2
                int r1 = r2.f3913b0
                int r3 = r3 + r1
                r3 = r0[r3]
                return r3
        }

        @Override // p026b9.AbstractC0710l
        /* renamed from: m */
        public boolean mo2264m() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                int r0 = r1.f3914c0
                return r0
        }
    }

    static {
            b9.d0 r0 = new b9.d0
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r0.<init>(r3, r2, r1)
            p026b9.C0695d0.f3901e0 = r0
            return
    }

    public C0695d0(java.lang.Object r1, java.lang.Object[] r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f3902b0 = r1
            r0.f3903c0 = r2
            r0.f3904d0 = r3
            return
    }

    /* renamed from: g */
    public static java.lang.IllegalArgumentException m2265g(java.lang.Object r3, java.lang.Object r4, java.lang.Object[] r5, int r6) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Multiple entries with same key: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "="
            r1.append(r3)
            r1.append(r4)
            java.lang.String r4 = " and "
            r1.append(r4)
            r4 = r5[r6]
            r1.append(r4)
            r1.append(r3)
            r3 = r6 ^ 1
            r3 = r5[r3]
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            return r0
    }

    @Override // p026b9.AbstractC0715o
    /* renamed from: b */
    public p026b9.AbstractC0716p<java.util.Map.Entry<K, V>> mo2266b() {
            r4 = this;
            b9.d0$a r0 = new b9.d0$a
            java.lang.Object[] r1 = r4.f3903c0
            int r2 = r4.f3904d0
            r3 = 0
            r0.<init>(r4, r1, r3, r2)
            return r0
    }

    @Override // p026b9.AbstractC0715o
    /* renamed from: c */
    public p026b9.AbstractC0716p<K> mo2267c() {
            r4 = this;
            b9.d0$c r0 = new b9.d0$c
            java.lang.Object[] r1 = r4.f3903c0
            int r2 = r4.f3904d0
            r3 = 0
            r0.<init>(r1, r3, r2)
            b9.d0$b r1 = new b9.d0$b
            r1.<init>(r4, r0)
            return r1
    }

    @Override // p026b9.AbstractC0715o
    /* renamed from: d */
    public p026b9.AbstractC0710l<V> mo2268d() {
            r4 = this;
            b9.d0$c r0 = new b9.d0$c
            java.lang.Object[] r1 = r4.f3903c0
            int r2 = r4.f3904d0
            r3 = 1
            r0.<init>(r1, r3, r2)
            return r0
    }

    @Override // p026b9.AbstractC0715o
    /* renamed from: f */
    public boolean mo2269f() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p026b9.AbstractC0715o, java.util.Map
    public V get(java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = r9.f3902b0
            java.lang.Object[] r1 = r9.f3903c0
            int r2 = r9.f3904d0
            r3 = 0
            if (r10 != 0) goto Lb
            goto L95
        Lb:
            r4 = 1
            if (r2 != r4) goto L1b
            r0 = 0
            r0 = r1[r0]
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L95
            r3 = r1[r4]
            goto L95
        L1b:
            if (r0 != 0) goto L1f
            goto L95
        L1f:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L4b
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = p124h7.C2939x3.m7289o(r0)
        L32:
            r0 = r0 & r6
            r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L3b
            goto L95
        L3b:
            r7 = r1[r5]
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L48
            r10 = r5 ^ 1
            r3 = r1[r10]
            goto L95
        L48:
            int r0 = r0 + 1
            goto L32
        L4b:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L77
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = p124h7.C2939x3.m7289o(r0)
        L5d:
            r0 = r0 & r6
            short r5 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r7
            if (r5 != r7) goto L67
            goto L95
        L67:
            r7 = r1[r5]
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L74
            r10 = r5 ^ 1
            r3 = r1[r10]
            goto L95
        L74:
            int r0 = r0 + 1
            goto L5d
        L77:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r6 = r10.hashCode()
            int r6 = p124h7.C2939x3.m7289o(r6)
        L83:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L89
            goto L95
        L89:
            r8 = r1[r7]
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L96
            r10 = r7 ^ 1
            r3 = r1[r10]
        L95:
            return r3
        L96:
            int r6 = r6 + 1
            goto L83
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            int r0 = r1.f3904d0
            return r0
    }
}
