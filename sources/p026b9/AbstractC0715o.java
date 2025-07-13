package p026b9;

/* renamed from: b9.o */
/* loaded from: classes.dex */
public abstract class AbstractC0715o<K, V> implements java.util.Map<K, V>, java.io.Serializable {

    /* renamed from: Y */
    public transient p026b9.AbstractC0716p<java.util.Map.Entry<K, V>> f3984Y;

    /* renamed from: Z */
    public transient p026b9.AbstractC0716p<K> f3985Z;

    /* renamed from: a0 */
    public transient p026b9.AbstractC0710l<V> f3986a0;

    /* renamed from: b9.o$a */
    public static class a<K, V> {

        /* renamed from: a */
        public java.lang.Object[] f3987a;

        /* renamed from: b */
        public int f3988b;

        public a() {
                r1 = this;
                r1.<init>()
                r0 = 8
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1.f3987a = r0
                r0 = 0
                r1.f3988b = r0
                return
        }

        public a(int r1) {
                r0 = this;
                r0.<init>()
                int r1 = r1 * 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r0.f3987a = r1
                r1 = 0
                r0.f3988b = r1
                return
        }

        /* renamed from: a */
        public p026b9.AbstractC0715o<K, V> m2320a() {
                r13 = this;
                int r0 = r13.f3988b
                java.lang.Object[] r1 = r13.f3987a
                if (r0 != 0) goto Lc
                b9.o<java.lang.Object, java.lang.Object> r0 = p026b9.C0695d0.f3901e0
                b9.d0 r0 = (p026b9.C0695d0) r0
                goto Lf3
            Lc:
                r2 = 0
                r3 = 0
                r4 = 1
                if (r0 != r4) goto L1f
                r0 = r1[r3]
                r3 = r1[r4]
                p026b9.C0720t.m2327a(r0, r3)
                b9.d0 r0 = new b9.d0
                r0.<init>(r2, r1, r4)
                goto Lf3
            L1f:
                int r5 = r1.length
                int r5 = r5 >> r4
                p124h7.C2939x3.m7282h(r0, r5)
                int r5 = p026b9.AbstractC0716p.m2324p(r0)
                if (r0 != r4) goto L33
                r3 = r1[r3]
                r4 = r1[r4]
                p026b9.C0720t.m2327a(r3, r4)
                goto Led
            L33:
                int r2 = r5 + (-1)
                r4 = 128(0x80, float:1.8E-43)
                r6 = -1
                if (r5 > r4) goto L77
                byte[] r4 = new byte[r5]
                java.util.Arrays.fill(r4, r6)
                r5 = 0
            L40:
                if (r5 >= r0) goto L74
                int r6 = r5 * 2
                int r6 = r6 + r3
                r7 = r1[r6]
                r8 = r6 ^ 1
                r8 = r1[r8]
                p026b9.C0720t.m2327a(r7, r8)
                int r9 = r7.hashCode()
                int r9 = p124h7.C2939x3.m7289o(r9)
            L56:
                r9 = r9 & r2
                r10 = r4[r9]
                r11 = 255(0xff, float:3.57E-43)
                r10 = r10 & r11
                if (r10 != r11) goto L64
                byte r6 = (byte) r6
                r4[r9] = r6
                int r5 = r5 + 1
                goto L40
            L64:
                r11 = r1[r10]
                boolean r11 = r11.equals(r7)
                if (r11 != 0) goto L6f
                int r9 = r9 + 1
                goto L56
            L6f:
                java.lang.IllegalArgumentException r0 = p026b9.C0695d0.m2265g(r7, r8, r1, r10)
                throw r0
            L74:
                r2 = r4
                goto Led
            L77:
                r4 = 32768(0x8000, float:4.5918E-41)
                if (r5 > r4) goto Lb7
                short[] r4 = new short[r5]
                java.util.Arrays.fill(r4, r6)
                r5 = 0
            L82:
                if (r5 >= r0) goto L74
                int r6 = r5 * 2
                int r6 = r6 + r3
                r7 = r1[r6]
                r8 = r6 ^ 1
                r8 = r1[r8]
                p026b9.C0720t.m2327a(r7, r8)
                int r9 = r7.hashCode()
                int r9 = p124h7.C2939x3.m7289o(r9)
            L98:
                r9 = r9 & r2
                short r10 = r4[r9]
                r11 = 65535(0xffff, float:9.1834E-41)
                r10 = r10 & r11
                if (r10 != r11) goto La7
                short r6 = (short) r6
                r4[r9] = r6
                int r5 = r5 + 1
                goto L82
            La7:
                r11 = r1[r10]
                boolean r11 = r11.equals(r7)
                if (r11 != 0) goto Lb2
                int r9 = r9 + 1
                goto L98
            Lb2:
                java.lang.IllegalArgumentException r0 = p026b9.C0695d0.m2265g(r7, r8, r1, r10)
                throw r0
            Lb7:
                int[] r4 = new int[r5]
                java.util.Arrays.fill(r4, r6)
                r5 = 0
            Lbd:
                if (r5 >= r0) goto L74
                int r7 = r5 * 2
                int r7 = r7 + r3
                r8 = r1[r7]
                r9 = r7 ^ 1
                r9 = r1[r9]
                p026b9.C0720t.m2327a(r8, r9)
                int r10 = r8.hashCode()
                int r10 = p124h7.C2939x3.m7289o(r10)
            Ld3:
                r10 = r10 & r2
                r11 = r4[r10]
                if (r11 != r6) goto Ldd
                r4[r10] = r7
                int r5 = r5 + 1
                goto Lbd
            Ldd:
                r12 = r1[r11]
                boolean r12 = r12.equals(r8)
                if (r12 != 0) goto Le8
                int r10 = r10 + 1
                goto Ld3
            Le8:
                java.lang.IllegalArgumentException r0 = p026b9.C0695d0.m2265g(r8, r9, r1, r11)
                throw r0
            Led:
                b9.d0 r3 = new b9.d0
                r3.<init>(r2, r1, r0)
                r0 = r3
            Lf3:
                return r0
        }

        /* renamed from: b */
        public final void m2321b(int r3) {
                r2 = this;
                int r3 = r3 * 2
                java.lang.Object[] r0 = r2.f3987a
                int r1 = r0.length
                if (r3 <= r1) goto L12
                int r1 = r0.length
                int r3 = p026b9.AbstractC0710l.b.m2305a(r1, r3)
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
                r2.f3987a = r3
            L12:
                return
        }

        /* renamed from: c */
        public p026b9.AbstractC0715o.a<K, V> m2322c(K r4, V r5) {
                r3 = this;
                int r0 = r3.f3988b
                int r0 = r0 + 1
                r3.m2321b(r0)
                p026b9.C0720t.m2327a(r4, r5)
                java.lang.Object[] r0 = r3.f3987a
                int r1 = r3.f3988b
                int r2 = r1 * 2
                r0[r2] = r4
                int r4 = r1 * 2
                int r4 = r4 + 1
                r0[r4] = r5
                int r1 = r1 + 1
                r3.f3988b = r1
                return r3
        }
    }

    public AbstractC0715o() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static <K, V> p026b9.AbstractC0715o<K, V> m2318a(java.util.Map<? extends K, ? extends V> r3) {
            boolean r0 = r3 instanceof p026b9.AbstractC0715o
            if (r0 == 0) goto L12
            boolean r0 = r3 instanceof java.util.SortedMap
            if (r0 != 0) goto L12
            r0 = r3
            b9.o r0 = (p026b9.AbstractC0715o) r0
            boolean r1 = r0.mo2269f()
            if (r1 != 0) goto L12
            return r0
        L12:
            java.util.Set r3 = r3.entrySet()
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L1f
            int r1 = r3.size()
            goto L20
        L1f:
            r1 = 4
        L20:
            b9.o$a r2 = new b9.o$a
            r2.<init>(r1)
            if (r0 == 0) goto L31
            int r0 = r2.f3988b
            int r1 = r3.size()
            int r1 = r1 + r0
            r2.m2321b(r1)
        L31:
            java.util.Iterator r3 = r3.iterator()
        L35:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.m2322c(r1, r0)
            goto L35
        L4d:
            b9.o r3 = r2.m2320a()
            return r3
    }

    /* renamed from: b */
    public abstract p026b9.AbstractC0716p<java.util.Map.Entry<K, V>> mo2266b();

    /* renamed from: c */
    public abstract p026b9.AbstractC0716p<K> mo2267c();

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            b9.l<V> r0 = r1.f3986a0
            if (r0 != 0) goto La
            b9.l r0 = r1.mo2268d()
            r1.f3986a0 = r0
        La:
            boolean r2 = r0.contains(r2)
            return r2
    }

    /* renamed from: d */
    public abstract p026b9.AbstractC0710l<V> mo2268d();

    /* renamed from: e */
    public p026b9.AbstractC0716p<java.util.Map.Entry<K, V>> m2319e() {
            r1 = this;
            b9.p<java.util.Map$Entry<K, V>> r0 = r1.f3984Y
            if (r0 != 0) goto La
            b9.p r0 = r1.mo2266b()
            r1.f3984Y = r0
        La:
            return r0
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
            r1 = this;
            b9.p r0 = r1.m2319e()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = p026b9.C0722v.m2331a(r0, r1)
            return r1
    }

    /* renamed from: f */
    public abstract boolean mo2269f();

    @Override // java.util.Map
    public abstract V get(java.lang.Object r1);

    @Override // java.util.Map
    public final V getOrDefault(java.lang.Object r1, V r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L7
            r2 = r1
        L7:
            return r2
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            b9.p r0 = r1.m2319e()
            int r0 = p026b9.C0707j0.m2300c(r0)
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.Map
    public java.util.Set keySet() {
            r1 = this;
            b9.p<K> r0 = r1.f3985Z
            if (r0 != 0) goto La
            b9.p r0 = r1.mo2267c()
            r1.f3985Z = r0
        La:
            return r0
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final V put(K r1, V r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final V remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public java.lang.String toString() {
            r6 = this;
            int r0 = r6.size()
            java.lang.String r1 = "size"
            p026b9.C0720t.m2328b(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            long r2 = (long) r0
            r4 = 8
            long r2 = r2 * r4
            r4 = 1073741824(0x40000000, double:5.304989477E-315)
            long r2 = java.lang.Math.min(r2, r4)
            int r0 = (int) r2
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            r0 = 1
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L29:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r0 != 0) goto L3c
            java.lang.String r0 = ", "
            r1.append(r0)
        L3c:
            r0 = 0
            java.lang.Object r4 = r3.getKey()
            r1.append(r4)
            r4 = 61
            r1.append(r4)
            java.lang.Object r3 = r3.getValue()
            r1.append(r3)
            goto L29
        L51:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // java.util.Map
    public java.util.Collection values() {
            r1 = this;
            b9.l<V> r0 = r1.f3986a0
            if (r0 != 0) goto La
            b9.l r0 = r1.mo2268d()
            r1.f3986a0 = r0
        La:
            return r0
    }
}
