package p026b9;

/* renamed from: b9.a */
/* loaded from: classes.dex */
public abstract class AbstractC0688a<E> implements java.util.ListIterator {

    /* renamed from: Y */
    public final int f3893Y;

    /* renamed from: Z */
    public int f3894Z;

    public AbstractC0688a(int r1, int r2) {
            r0 = this;
            r0.<init>()
            p124h7.C2939x3.m7282h(r2, r1)
            r0.f3893Y = r1
            r0.f3894Z = r2
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f3894Z
            int r1 = r2.f3893Y
            if (r0 >= r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.f3894Z
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            int r0 = r2.f3894Z
            int r1 = r0 + 1
            r2.f3894Z = r1
            r1 = r2
            b9.n$b r1 = (p026b9.AbstractC0714n.b) r1
            b9.n<E> r1 = r1.f3980a0
            java.lang.Object r0 = r1.get(r0)
            return r0
        L16:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.f3894Z
            return r0
    }

    @Override // java.util.ListIterator
    public final E previous() {
            r2 = this;
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L16
            int r0 = r2.f3894Z
            int r0 = r0 + (-1)
            r2.f3894Z = r0
            r1 = r2
            b9.n$b r1 = (p026b9.AbstractC0714n.b) r1
            b9.n<E> r1 = r1.f3980a0
            java.lang.Object r0 = r1.get(r0)
            return r0
        L16:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.f3894Z
            int r0 = r0 + (-1)
            return r0
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
