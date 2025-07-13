package p062dh;

/* renamed from: dh.c */
/* loaded from: classes.dex */
public final class C1467c<T> implements java.util.Collection<T>, p259oh.InterfaceC5277a {

    /* renamed from: Y */
    public final T[] f7233Y;

    /* renamed from: Z */
    public final boolean f7234Z;

    public C1467c(T[] r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f7233Y = r1
            r0.f7234Z = r2
            return
    }

    @Override // java.util.Collection
    public boolean add(T r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends T> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object r3) {
            r2 = this;
            T[] r0 = r2.f7233Y
            java.lang.String r1 = "<this>"
            p214m2.C4339q.m9706k(r0, r1)
            int r3 = p062dh.C1468d.m3988J(r0, r3)
            if (r3 < 0) goto Lf
            r3 = 1
            goto L10
        Lf:
            r3 = 0
        L10:
            return r3
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            p214m2.C4339q.m9706k(r3, r0)
            boolean r0 = r3.isEmpty()
            r1 = 1
            if (r0 == 0) goto Ld
            goto L22
        Ld:
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L11
            r1 = 0
        L22:
            return r1
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            T[] r0 = r1.f7233Y
            int r0 = r0.length
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r2 = this;
            T[] r0 = r2.f7233Y
            java.lang.String r1 = "array"
            p214m2.C4339q.m9706k(r0, r1)
            nh.a r1 = new nh.a
            r1.<init>(r0)
            return r1
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final int size() {
            r1 = this;
            T[] r0 = r1.f7233Y
            int r0 = r0.length
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
            r4 = this;
            T[] r0 = r4.f7233Y
            boolean r1 = r4.f7234Z
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            java.lang.String r3 = "<this>"
            p214m2.C4339q.m9706k(r0, r3)
            if (r1 == 0) goto L18
            java.lang.Class r1 = r0.getClass()
            boolean r1 = p214m2.C4339q.m9702c(r1, r2)
            if (r1 == 0) goto L18
            goto L22
        L18:
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1, r2)
            java.lang.String r1 = "copyOf(this, this.size, Array<Any?>::class.java)"
            p214m2.C4339q.m9705j(r0, r1)
        L22:
            return r0
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.Object[] r2 = p239nh.C4825e.m10852b(r1, r2)
            return r2
    }
}
