package p062dh;

/* renamed from: dh.j */
/* loaded from: classes.dex */
public final class C1474j implements java.util.ListIterator, p259oh.InterfaceC5277a {

    /* renamed from: Y */
    public static final p062dh.C1474j f7236Y = null;

    static {
            dh.j r0 = new dh.j
            r0.<init>()
            p062dh.C1474j.f7236Y = r0
            return
    }

    public C1474j() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }
}
