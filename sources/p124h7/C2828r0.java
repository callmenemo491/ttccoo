package p124h7;

/* renamed from: h7.r0 */
/* loaded from: classes.dex */
public final class C2828r0 extends java.util.AbstractSet<java.util.Map.Entry> {

    /* renamed from: Y */
    public final /* synthetic */ p124h7.C2846s0 f11873Y;

    public /* synthetic */ C2828r0(p124h7.C2846s0 r1) {
            r0 = this;
            r0.f11873Y = r1
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r3) {
            r2 = this;
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            boolean r0 = r2.contains(r3)
            if (r0 != 0) goto L19
            h7.s0 r0 = r2.f11873Y
            java.lang.Object r1 = r3.getKey()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Object r3 = r3.getValue()
            r0.m7114c(r1, r3)
            r3 = 1
            return r3
        L19:
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r1 = this;
            h7.s0 r0 = r1.f11873Y
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r4) {
            r3 = this;
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            h7.s0 r0 = r3.f11873Y
            java.lang.Object r1 = r4.getKey()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object r4 = r4.getValue()
            r1 = 0
            r2 = 1
            if (r0 == r4) goto L1e
            if (r0 == 0) goto L1f
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L1d
            goto L1e
        L1d:
            return r1
        L1e:
            r1 = 1
        L1f:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<java.util.Map.Entry> iterator() {
            r2 = this;
            h7.q0 r0 = new h7.q0
            h7.s0 r1 = r2.f11873Y
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L13
            h7.s0 r0 = r1.f11873Y
            java.lang.Object r2 = r2.getKey()
            r0.remove(r2)
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            h7.s0 r0 = r1.f11873Y
            int r0 = r0.size()
            return r0
    }
}
