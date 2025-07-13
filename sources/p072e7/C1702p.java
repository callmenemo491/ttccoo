package p072e7;

/* renamed from: e7.p */
/* loaded from: classes.dex */
public final class C1702p<E> {

    /* renamed from: Y */
    public final int f7727Y;

    /* renamed from: Z */
    public int f7728Z;

    /* renamed from: a0 */
    public final p072e7.AbstractC1722r<E> f7729a0;

    public C1702p(p072e7.AbstractC1722r<E> r3, int r4) {
            r2 = this;
            int r0 = r3.size()
            r2.<init>()
            if (r4 < 0) goto L12
            if (r4 > r0) goto L12
            r2.f7727Y = r0
            r2.f7728Z = r4
            r2.f7729a0 = r3
            return
        L12:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index"
            java.lang.String r4 = p052d6.C1310h0.m3806h(r4, r0, r1)
            r3.<init>(r4)
            throw r3
    }

    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f7728Z
            int r1 = r2.f7727Y
            if (r0 >= r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.f7728Z
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L13
            int r0 = r2.f7728Z
            int r1 = r0 + 1
            r2.f7728Z = r1
            e7.r<E> r1 = r2.f7729a0
            java.lang.Object r0 = r1.get(r0)
            return r0
        L13:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    public final int nextIndex() {
            r1 = this;
            int r0 = r1.f7728Z
            return r0
    }

    public final java.lang.Object previous() {
            r2 = this;
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L13
            int r0 = r2.f7728Z
            int r0 = r0 + (-1)
            r2.f7728Z = r0
            e7.r<E> r1 = r2.f7729a0
            java.lang.Object r0 = r1.get(r0)
            return r0
        L13:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    public final int previousIndex() {
            r1 = this;
            int r0 = r1.f7728Z
            int r0 = r0 + (-1)
            return r0
    }
}
