package p072e7;

/* renamed from: e7.b5 */
/* loaded from: classes.dex */
public abstract class AbstractC1568b5<E> extends java.util.AbstractList<E> implements p072e7.InterfaceC1609f6<E> {

    /* renamed from: Y */
    public boolean f7494Y;

    public AbstractC1568b5() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f7494Y = r0
            return
    }

    /* renamed from: a */
    public final void m4127a() {
            r1 = this;
            boolean r0 = r1.f7494Y
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r1) {
            r0 = this;
            r0.m4127a()
            boolean r1 = super.add(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r1, java.util.Collection<? extends E> r2) {
            r0 = this;
            r0.m4127a()
            boolean r1 = super.addAll(r1, r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends E> r1) {
            r0 = this;
            r0.m4127a()
            boolean r1 = super.addAll(r1)
            return r1
    }

    @Override // p072e7.InterfaceC1609f6
    /* renamed from: b */
    public final void mo4128b() {
            r1 = this;
            r0 = 0
            r1.f7494Y = r0
            return
    }

    @Override // p072e7.InterfaceC1609f6
    /* renamed from: c */
    public final boolean mo4129c() {
            r1 = this;
            boolean r0 = r1.f7494Y
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r0 = this;
            r0.m4127a()
            super.clear()
            return
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof java.util.List
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            boolean r1 = r7 instanceof java.util.RandomAccess
            if (r1 != 0) goto L13
            boolean r7 = super.equals(r7)
            return r7
        L13:
            java.util.List r7 = (java.util.List) r7
            int r1 = r6.size()
            int r3 = r7.size()
            if (r1 != r3) goto L35
            r3 = 0
        L20:
            if (r3 >= r1) goto L34
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L31
            return r2
        L31:
            int r3 = r3 + 1
            goto L20
        L34:
            return r0
        L35:
            return r2
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
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

    @Override // java.util.AbstractList, java.util.List
    public abstract E remove(int r1);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            r1.m4127a()
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 != r0) goto Lc
            r2 = 0
            return r2
        Lc:
            r1.remove(r2)
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection<?> r1) {
            r0 = this;
            r0.m4127a()
            boolean r1 = super.removeAll(r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection<?> r1) {
            r0 = this;
            r0.m4127a()
            boolean r1 = super.retainAll(r1)
            return r1
    }
}
