package p239nh;

/* renamed from: nh.a */
/* loaded from: classes.dex */
public final class C4821a<T> implements java.util.Iterator<T>, p259oh.InterfaceC5277a {

    /* renamed from: Y */
    public final T[] f19213Y;

    /* renamed from: Z */
    public int f19214Z;

    public C4821a(T[] r1) {
            r0 = this;
            r0.<init>()
            r0.f19213Y = r1
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            int r0 = r2.f19214Z
            T[] r1 = r2.f19213Y
            int r1 = r1.length
            if (r0 >= r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // java.util.Iterator
    public T next() {
            r3 = this;
            T[] r0 = r3.f19213Y     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            int r1 = r3.f19214Z     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            int r2 = r1 + 1
            r3.f19214Z = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            r0 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            return r0
        Lb:
            r0 = move-exception
            int r1 = r3.f19214Z
            int r1 = r1 + (-1)
            r3.f19214Z = r1
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
