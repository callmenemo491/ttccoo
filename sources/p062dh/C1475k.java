package p062dh;

/* renamed from: dh.k */
/* loaded from: classes.dex */
public final class C1475k implements java.util.List, java.io.Serializable, java.util.RandomAccess, p259oh.InterfaceC5277a {

    /* renamed from: Y */
    public static final p062dh.C1475k f7237Y = null;

    static {
            dh.k r0 = new dh.k
            r0.<init>()
            p062dh.C1475k.f7237Y = r0
            return
    }

    public C1475k() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Void
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Void r3 = (java.lang.Void) r3
            java.lang.String r0 = "element"
            p214m2.C4339q.m9706k(r3, r0)
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            p214m2.C4339q.m9706k(r2, r0)
            boolean r2 = r2.isEmpty()
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto Le
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Override // java.util.List
    public java.lang.Object get(int r4) {
            r3 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Empty list doesn't contain element at index "
            r1.append(r2)
            r1.append(r4)
            r4 = 46
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Void
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Void r3 = (java.lang.Void) r3
            java.lang.String r0 = "element"
            p214m2.C4339q.m9706k(r3, r0)
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
            r1 = this;
            dh.j r0 = p062dh.C1474j.f7236Y
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Void
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Void r3 = (java.lang.Void) r3
            java.lang.String r0 = "element"
            p214m2.C4339q.m9706k(r3, r0)
            return r1
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
            r1 = this;
            dh.j r0 = p062dh.C1474j.f7236Y
            return r0
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int r3) {
            r2 = this;
            if (r3 != 0) goto L5
            dh.j r3 = p062dh.C1474j.f7236Y
            return r3
        L5:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "Index: "
            java.lang.String r3 = android.support.v4.media.C0142a.m254a(r1, r3)
            r0.<init>(r3)
            throw r0
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object remove(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.List
    public java.util.List subList(int r4, int r5) {
            r3 = this;
            if (r4 != 0) goto L5
            if (r5 != 0) goto L5
            return r3
        L5:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "fromIndex: "
            java.lang.String r2 = ", toIndex: "
            java.lang.String r4 = p243o1.C4872b.m11020a(r1, r4, r2, r5)
            r0.<init>(r4)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = p239nh.C4825e.m10851a(r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.Object[] r2 = p239nh.C4825e.m10852b(r1, r2)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "[]"
            return r0
    }
}
