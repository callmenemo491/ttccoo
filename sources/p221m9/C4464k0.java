package p221m9;

/* renamed from: m9.k0 */
/* loaded from: classes.dex */
public final class C4464k0<K, V> extends java.util.LinkedHashMap<K, V> {

    /* renamed from: Z */
    public static final p221m9.C4464k0 f18188Z = null;

    /* renamed from: Y */
    public boolean f18189Y;

    static {
            m9.k0 r0 = new m9.k0
            r0.<init>()
            p221m9.C4464k0.f18188Z = r0
            r1 = 0
            r0.f18189Y = r1
            return
    }

    public C4464k0() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f18189Y = r0
            return
    }

    public C4464k0(java.util.Map<K, V> r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.f18189Y = r1
            return
    }

    /* renamed from: a */
    public static int m10177a(java.lang.Object r5) {
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L1c
            byte[] r5 = (byte[]) r5
            java.nio.charset.Charset r0 = p221m9.C4505z.f18308a
            int r0 = r5.length
            r1 = 0
            r3 = r0
            r2 = 0
        Lc:
            int r4 = r1 + r0
            if (r2 >= r4) goto L18
            int r3 = r3 * 31
            r4 = r5[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto Lc
        L18:
            if (r3 != 0) goto L1b
            r3 = 1
        L1b:
            return r3
        L1c:
            boolean r0 = r5 instanceof p221m9.C4505z.a
            if (r0 != 0) goto L25
            int r5 = r5.hashCode()
            return r5
        L25:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            r5.<init>()
            throw r5
    }

    /* renamed from: b */
    public final void m10178b() {
            r1 = this;
            boolean r0 = r1.f18189Y
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
            r0 = this;
            r0.m10178b()
            super.clear()
            return
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            java.util.Set r0 = java.util.Collections.emptySet()
            goto Lf
        Lb:
            java.util.Set r0 = super.entrySet()
        Lf:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L5e
            java.util.Map r7 = (java.util.Map) r7
            if (r6 != r7) goto Lc
        La:
            r7 = 1
            goto L5b
        Lc:
            int r0 = r6.size()
            int r3 = r7.size()
            if (r0 == r3) goto L18
        L16:
            r7 = 0
            goto L5b
        L18:
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L37
            goto L16
        L37:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L54
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L54
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L58
        L54:
            boolean r3 = r4.equals(r3)
        L58:
            if (r3 != 0) goto L20
            goto L16
        L5b:
            if (r7 == 0) goto L5e
            goto L5f
        L5e:
            r1 = 0
        L5f:
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
            r4 = this;
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            int r3 = m10177a(r3)
            java.lang.Object r2 = r2.getValue()
            int r2 = m10177a(r2)
            r2 = r2 ^ r3
            int r1 = r1 + r2
            goto L9
        L28:
            return r1
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K r2, V r3) {
            r1 = this;
            r1.m10178b()
            java.nio.charset.Charset r0 = p221m9.C4505z.f18308a
            java.util.Objects.requireNonNull(r2)
            java.util.Objects.requireNonNull(r3)
            java.lang.Object r2 = super.put(r2, r3)
            return r2
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r4) {
            r3 = this;
            r3.m10178b()
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.nio.charset.Charset r2 = p221m9.C4505z.f18308a
            java.util.Objects.requireNonNull(r1)
            java.lang.Object r1 = r4.get(r1)
            java.util.Objects.requireNonNull(r1)
            goto Lb
        L22:
            super.putAll(r4)
            return
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object r1) {
            r0 = this;
            r0.m10178b()
            java.lang.Object r1 = super.remove(r1)
            return r1
    }
}
