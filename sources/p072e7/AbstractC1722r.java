package p072e7;

/* renamed from: e7.r */
/* loaded from: classes.dex */
public abstract class AbstractC1722r<E> extends p072e7.AbstractC1692o<E> implements java.util.List<E>, java.util.RandomAccess {

    /* renamed from: Z */
    public static final p072e7.AbstractC1553a0<java.lang.Object> f7762Z = null;

    static {
            e7.p r0 = new e7.p
            e7.r<java.lang.Object> r1 = p072e7.C1750u.f7795c0
            r2 = 0
            r0.<init>(r1, r2)
            p072e7.AbstractC1722r.f7762Z = r0
            return
    }

    public AbstractC1722r() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p072e7.AbstractC1692o
    /* renamed from: a */
    public int mo4401a(java.lang.Object[] r3, int r4) {
            r2 = this;
            int r4 = r2.size()
            r0 = 0
        L5:
            if (r0 >= r4) goto L10
            java.lang.Object r1 = r2.get(r0)
            r3[r0] = r1
            int r0 = r0 + 1
            goto L5
        L10:
            return r4
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int r1, java.util.Collection<? extends E> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // p072e7.AbstractC1692o, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 != r6) goto L5
            goto L5b
        L5:
            boolean r2 = r7 instanceof java.util.List
            if (r2 != 0) goto Lb
        L9:
            r0 = 0
            goto L5b
        Lb:
            java.util.List r7 = (java.util.List) r7
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L18
            goto L9
        L18:
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L31
            r3 = 0
        L1d:
            if (r3 >= r2) goto L5b
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = p052d6.C1310h0.m3803e(r4, r5)
            if (r4 != 0) goto L2e
            goto L9
        L2e:
            int r3 = r3 + 1
            goto L1d
        L31:
            java.util.Iterator r2 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L39:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L55
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L46
            goto L9
        L46:
            java.lang.Object r3 = r2.next()
            java.lang.Object r4 = r7.next()
            boolean r3 = p052d6.C1310h0.m3803e(r3, r4)
            if (r3 != 0) goto L39
            goto L9
        L55:
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L9
        L5b:
            return r0
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
            r4 = this;
            int r0 = r4.size()
            r1 = 1
            r2 = 0
        L6:
            if (r2 >= r0) goto L16
            int r1 = r1 * 31
            java.lang.Object r3 = r4.get(r2)
            int r3 = r3.hashCode()
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L6
        L16:
            return r1
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            r0 = -1
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r4.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L1a
            java.lang.Object r3 = r4.get(r2)
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L17
            r0 = r2
            goto L1a
        L17:
            int r2 = r2 + 1
            goto L9
        L1a:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            e7.a0 r0 = r1.m4425m(r0)
            return r0
    }

    /* renamed from: l */
    public p072e7.AbstractC1722r<E> mo4416l(int r2, int r3) {
            r1 = this;
            int r0 = r1.size()
            p052d6.C1310h0.m3805g(r2, r3, r0)
            int r3 = r3 - r2
            int r0 = r1.size()
            if (r3 != r0) goto Lf
            return r1
        Lf:
            if (r3 != 0) goto L14
            e7.r<java.lang.Object> r2 = p072e7.C1750u.f7795c0
            return r2
        L14:
            e7.q r0 = new e7.q
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            r0 = -1
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r3.size()
            int r1 = r1 + r0
        L9:
            if (r1 < 0) goto L1a
            java.lang.Object r2 = r3.get(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L17
            r0 = r1
            goto L1a
        L17:
            int r1 = r1 + (-1)
            goto L9
        L1a:
            return r0
    }

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            e7.a0 r0 = r1.m4425m(r0)
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            e7.a0 r1 = r0.m4425m(r1)
            return r1
    }

    /* renamed from: m */
    public final p072e7.AbstractC1553a0<E> m4425m(int r4) {
            r3 = this;
            int r0 = r3.size()
            if (r4 < 0) goto L17
            if (r4 > r0) goto L17
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L11
            e7.a0<java.lang.Object> r4 = p072e7.AbstractC1722r.f7762Z
            return r4
        L11:
            e7.p r0 = new e7.p
            r0.<init>(r3, r4)
            return r0
        L17:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "index"
            java.lang.String r4 = p052d6.C1310h0.m3806h(r4, r0, r2)
            r1.<init>(r4)
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E set(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            e7.r r1 = r0.mo4416l(r1, r2)
            return r1
    }
}
