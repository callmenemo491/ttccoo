package p072e7;

/* renamed from: e7.w */
/* loaded from: classes.dex */
public final class C1768w<K, V> extends p072e7.AbstractC1741t<java.util.Map.Entry<K, V>> {

    /* renamed from: a0 */
    public final transient java.lang.Object[] f7825a0;

    public C1768w(p072e7.AbstractC1732s r1, java.lang.Object[] r2) {
            r0 = this;
            r0.<init>()
            r0.f7825a0 = r2
            return
    }

    @Override // p072e7.AbstractC1692o
    /* renamed from: a */
    public final int mo4401a(java.lang.Object[] r2, int r3) {
            r1 = this;
            e7.r<E> r3 = r1.f7783Z
            if (r3 != 0) goto Lb
            e7.v r3 = new e7.v
            r3.<init>(r1)
            r1.f7783Z = r3
        Lb:
            r0 = 0
            int r2 = r3.mo4401a(r2, r0)
            return r2
    }

    @Override // p072e7.AbstractC1692o, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L19
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r3.getKey()
            java.lang.Object r3 = r3.getValue()
            if (r3 == 0) goto L19
            r0 = 0
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L19
            r3 = 1
            return r3
        L19:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            e7.r<E> r0 = r2.f7783Z
            if (r0 != 0) goto Lb
            e7.v r0 = new e7.v
            r0.<init>(r2)
            r2.f7783Z = r0
        Lb:
            r1 = 0
            e7.a0 r0 = r0.m4425m(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            r0 = 0
            return r0
    }
}
