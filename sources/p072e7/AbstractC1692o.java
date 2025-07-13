package p072e7;

/* renamed from: e7.o */
/* loaded from: classes.dex */
public abstract class AbstractC1692o<E> extends java.util.AbstractCollection<E> implements java.io.Serializable {

    /* renamed from: Y */
    public static final java.lang.Object[] f7710Y = null;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            p072e7.AbstractC1692o.f7710Y = r0
            return
    }

    public AbstractC1692o() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract int mo4401a(java.lang.Object[] r1, int r2);

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean add(E r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection<? extends E> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(java.lang.Object r1);

    /* renamed from: e */
    int mo4402e() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* renamed from: h */
    int mo4403h() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* renamed from: i */
    public java.lang.Object[] mo4404i() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = p072e7.AbstractC1692o.f7710Y
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] r4) {
            r3 = this;
            java.util.Objects.requireNonNull(r4)
            int r0 = r3.size()
            int r1 = r4.length
            if (r1 >= r0) goto L30
            java.lang.Object[] r1 = r3.mo4404i()
            if (r1 != 0) goto L1f
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            goto L35
        L1f:
            int r0 = r3.mo4403h()
            int r2 = r3.mo4402e()
            java.lang.Class r4 = r4.getClass()
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r1, r0, r2, r4)
            return r4
        L30:
            if (r1 <= r0) goto L35
            r1 = 0
            r4[r0] = r1
        L35:
            r0 = 0
            r3.mo4401a(r4, r0)
            return r4
    }
}
