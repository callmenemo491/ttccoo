package p072e7;

/* renamed from: e7.s */
/* loaded from: classes.dex */
public abstract class AbstractC1732s<K, V> implements java.util.Map<K, V>, java.io.Serializable {

    /* renamed from: Y */
    public transient p072e7.AbstractC1741t<java.util.Map.Entry<K, V>> f7769Y;

    /* renamed from: Z */
    public transient p072e7.AbstractC1741t<K> f7770Z;

    /* renamed from: a0 */
    public transient p072e7.AbstractC1692o<V> f7771a0;

    public AbstractC1732s() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final p072e7.AbstractC1692o<V> m4434a() {
            r3 = this;
            e7.o<V> r0 = r3.f7771a0
            if (r0 != 0) goto L12
            r0 = r3
            e7.z r0 = (p072e7.C1795z) r0
            e7.y r1 = new e7.y
            java.lang.Object[] r0 = r0.f7848b0
            r2 = 1
            r1.<init>(r0, r2)
            r3.f7771a0 = r1
            return r1
        L12:
            return r0
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object r2) {
            r1 = this;
            e7.o r0 = r1.m4434a()
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r3 = this;
            e7.t<java.util.Map$Entry<K, V>> r0 = r3.f7769Y
            if (r0 != 0) goto L11
            r0 = r3
            e7.z r0 = (p072e7.C1795z) r0
            e7.w r1 = new e7.w
            java.lang.Object[] r2 = r0.f7848b0
            r1.<init>(r0, r2)
            r3.f7769Y = r1
            r0 = r1
        L11:
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            goto L9
        L4:
            boolean r0 = r2 instanceof java.util.Map
            if (r0 != 0) goto La
            r2 = 0
        L9:
            return r2
        La:
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r0 = r1.entrySet()
            java.util.Set r2 = r2.entrySet()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // java.util.Map
    public final V getOrDefault(java.lang.Object r1, V r2) {
            r0 = this;
            return r2
    }

    @Override // java.util.Map
    public final int hashCode() {
            r3 = this;
            e7.t<java.util.Map$Entry<K, V>> r0 = r3.f7769Y
            if (r0 != 0) goto L11
            r0 = r3
            e7.z r0 = (p072e7.C1795z) r0
            e7.w r1 = new e7.w
            java.lang.Object[] r2 = r0.f7848b0
            r1.<init>(r0, r2)
            r3.f7769Y = r1
            r0 = r1
        L11:
            int r0 = p052d6.C1306f0.m3772a(r0)
            return r0
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r4 = this;
            e7.t<K> r0 = r4.f7770Z
            if (r0 != 0) goto L17
            r0 = r4
            e7.z r0 = (p072e7.C1795z) r0
            e7.y r1 = new e7.y
            java.lang.Object[] r2 = r0.f7848b0
            r3 = 0
            r1.<init>(r2, r3)
            e7.x r2 = new e7.x
            r2.<init>(r0, r1)
            r4.f7770Z = r2
            return r2
        L17:
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

    public final java.lang.String toString() {
            r6 = this;
            r0 = r6
            e7.z r0 = (p072e7.C1795z) r0
            int r0 = r0.size()
            if (r0 < 0) goto L5b
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
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
        L29:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r2 != 0) goto L3c
            java.lang.String r2 = ", "
            r1.append(r2)
        L3c:
            java.lang.Object r2 = r3.getKey()
            r1.append(r2)
            r2 = 61
            r1.append(r2)
            java.lang.Object r2 = r3.getValue()
            r1.append(r2)
            r2 = 0
            goto L29
        L51:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L5b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r2 = 44
            java.lang.String r3 = "size cannot be negative but was: "
            java.lang.String r0 = p064e.C1490d.m4039a(r2, r3, r0)
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Collection values() {
            r1 = this;
            e7.o r0 = r1.m4434a()
            return r0
    }
}
