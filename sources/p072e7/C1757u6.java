package p072e7;

/* renamed from: e7.u6 */
/* loaded from: classes.dex */
public final class C1757u6<K, V> extends java.util.LinkedHashMap<K, V> {

    /* renamed from: Y */
    public boolean f7807Y;

    static {
            e7.u6 r0 = new e7.u6
            r0.<init>()
            r1 = 0
            r0.f7807Y = r1
            return
    }

    public C1757u6() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f7807Y = r0
            return
    }

    public C1757u6(java.util.Map<K, V> r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.f7807Y = r1
            return
    }

    /* renamed from: a */
    public static int m4454a(java.lang.Object r4) {
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L19
            byte[] r4 = (byte[]) r4
            java.nio.charset.Charset r0 = p072e7.C1619g6.f7568a
            int r0 = r4.length
            r1 = 0
            r2 = r0
        Lb:
            if (r1 >= r0) goto L15
            int r2 = r2 * 31
            r3 = r4[r1]
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lb
        L15:
            if (r2 != 0) goto L18
            r2 = 1
        L18:
            return r2
        L19:
            boolean r0 = r4 instanceof p072e7.InterfaceC1559a6
            if (r0 != 0) goto L22
            int r4 = r4.hashCode()
            return r4
        L22:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>()
            throw r4
    }

    /* renamed from: b */
    public final void m4455b() {
            r1 = this;
            boolean r0 = r1.f7807Y
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
            r0 = this;
            r0.m4455b()
            super.clear()
            return
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
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
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.util.Map
            if (r0 == 0) goto L58
            java.util.Map r5 = (java.util.Map) r5
            if (r4 != r5) goto L9
            goto L56
        L9:
            int r0 = r4.size()
            int r1 = r5.size()
            if (r0 == r1) goto L14
            goto L58
        L14:
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 == 0) goto L58
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r3 = r2 instanceof byte[]
            if (r3 == 0) goto L4f
            boolean r3 = r1 instanceof byte[]
            if (r3 == 0) goto L4f
            byte[] r2 = (byte[]) r2
            byte[] r1 = (byte[]) r1
            boolean r1 = java.util.Arrays.equals(r2, r1)
            goto L53
        L4f:
            boolean r1 = r2.equals(r1)
        L53:
            if (r1 != 0) goto L1c
            goto L58
        L56:
            r5 = 1
            return r5
        L58:
            r5 = 0
            return r5
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
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
            int r3 = m4454a(r3)
            java.lang.Object r2 = r2.getValue()
            int r2 = m4454a(r2)
            r2 = r2 ^ r3
            int r1 = r1 + r2
            goto L9
        L28:
            return r1
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K r2, V r3) {
            r1 = this;
            r1.m4455b()
            java.nio.charset.Charset r0 = p072e7.C1619g6.f7568a
            java.util.Objects.requireNonNull(r2)
            java.util.Objects.requireNonNull(r3)
            java.lang.Object r2 = super.put(r2, r3)
            return r2
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> r4) {
            r3 = this;
            r3.m4455b()
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.nio.charset.Charset r2 = p072e7.C1619g6.f7568a
            java.util.Objects.requireNonNull(r1)
            java.lang.Object r1 = r4.get(r1)
            java.util.Objects.requireNonNull(r1)
            goto Lb
        L22:
            super.putAll(r4)
            return
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object r1) {
            r0 = this;
            r0.m4455b()
            java.lang.Object r1 = super.remove(r1)
            return r1
    }
}
