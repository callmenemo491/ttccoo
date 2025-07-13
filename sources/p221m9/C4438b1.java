package p221m9;

/* renamed from: m9.b1 */
/* loaded from: classes.dex */
public final class C4438b1<E> extends p221m9.AbstractC4439c<E> implements java.util.RandomAccess {

    /* renamed from: b0 */
    public static final p221m9.C4438b1<java.lang.Object> f18108b0 = null;

    /* renamed from: Z */
    public E[] f18109Z;

    /* renamed from: a0 */
    public int f18110a0;

    static {
            m9.b1 r0 = new m9.b1
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2, r1)
            p221m9.C4438b1.f18108b0 = r0
            r0.f18111Y = r1
            return
    }

    public C4438b1(E[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f18109Z = r1
            r0.f18110a0 = r2
            return
    }

    @Override // p221m9.C4505z.c
    /* renamed from: B */
    public p221m9.C4505z.c mo9905B(int r3) {
            r2 = this;
            int r0 = r2.f18110a0
            if (r3 < r0) goto L12
            E[] r0 = r2.f18109Z
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
            m9.b1 r0 = new m9.b1
            int r1 = r2.f18110a0
            r0.<init>(r3, r1)
            return r0
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int r6, E r7) {
            r5 = this;
            r5.m9909a()
            if (r6 < 0) goto L3f
            int r0 = r5.f18110a0
            if (r6 > r0) goto L3f
            E[] r1 = r5.f18109Z
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r6 + 1
            int r0 = r0 - r6
            java.lang.System.arraycopy(r1, r6, r1, r2, r0)
            goto L2e
        L15:
            r2 = 3
            r3 = 2
            r4 = 1
            int r0 = p121h4.C2484y.m6352a(r0, r2, r3, r4)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r6)
            E[] r1 = r5.f18109Z
            int r2 = r6 + 1
            int r3 = r5.f18110a0
            int r3 = r3 - r6
            java.lang.System.arraycopy(r1, r6, r0, r2, r3)
            r5.f18109Z = r0
        L2e:
            E[] r0 = r5.f18109Z
            r0[r6] = r7
            int r6 = r5.f18110a0
            int r6 = r6 + 1
            r5.f18110a0 = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            return
        L3f:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = r5.m9907h(r6)
            r7.<init>(r6)
            throw r7
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r5) {
            r4 = this;
            r4.m9909a()
            int r0 = r4.f18110a0
            E[] r1 = r4.f18109Z
            int r2 = r1.length
            r3 = 1
            if (r0 != r2) goto L16
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r4.f18109Z = r0
        L16:
            E[] r0 = r4.f18109Z
            int r1 = r4.f18110a0
            int r2 = r1 + 1
            r4.f18110a0 = r2
            r0[r1] = r5
            int r5 = r4.modCount
            int r5 = r5 + r3
            r4.modCount = r5
            return r3
    }

    /* renamed from: e */
    public final void m9906e(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.f18110a0
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.m9907h(r2)
            r0.<init>(r2)
            throw r0
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r2) {
            r1 = this;
            r1.m9906e(r2)
            E[] r0 = r1.f18109Z
            r2 = r0[r2]
            return r2
    }

    /* renamed from: h */
    public final java.lang.String m9907h(int r3) {
            r2 = this;
            java.lang.String r0 = "Index:"
            java.lang.String r1 = ", Size:"
            java.lang.StringBuilder r3 = androidx.appcompat.widget.C0300r0.m777a(r0, r3, r1)
            int r0 = r2.f18110a0
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int r5) {
            r4 = this;
            r4.m9909a()
            r4.m9906e(r5)
            E[] r0 = r4.f18109Z
            r1 = r0[r5]
            int r2 = r4.f18110a0
            int r3 = r2 + (-1)
            if (r5 >= r3) goto L18
            int r3 = r5 + 1
            int r2 = r2 - r5
            int r2 = r2 + (-1)
            java.lang.System.arraycopy(r0, r3, r0, r5, r2)
        L18:
            int r5 = r4.f18110a0
            int r5 = r5 + (-1)
            r4.f18110a0 = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int r3, E r4) {
            r2 = this;
            r2.m9909a()
            r2.m9906e(r3)
            E[] r0 = r2.f18109Z
            r1 = r0[r3]
            r0[r3] = r4
            int r3 = r2.modCount
            int r3 = r3 + 1
            r2.modCount = r3
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            int r0 = r1.f18110a0
            return r0
    }
}
