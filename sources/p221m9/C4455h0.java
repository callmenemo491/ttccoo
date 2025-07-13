package p221m9;

/* renamed from: m9.h0 */
/* loaded from: classes.dex */
public final class C4455h0 extends p221m9.AbstractC4439c<java.lang.Long> implements java.util.RandomAccess, p221m9.InterfaceC4506z0 {

    /* renamed from: Z */
    public long[] f18145Z;

    /* renamed from: a0 */
    public int f18146a0;

    static {
            m9.h0 r0 = new m9.h0
            r1 = 0
            long[] r2 = new long[r1]
            r0.<init>(r2, r1)
            r0.f18111Y = r1
            return
    }

    public C4455h0() {
            r1 = this;
            r0 = 10
            long[] r0 = new long[r0]
            r1.<init>()
            r1.f18145Z = r0
            r0 = 0
            r1.f18146a0 = r0
            return
    }

    public C4455h0(long[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f18145Z = r1
            r0.f18146a0 = r2
            return
    }

    @Override // p221m9.C4505z.c
    /* renamed from: B */
    public p221m9.C4505z.c mo9905B(int r3) {
            r2 = this;
            int r0 = r2.f18146a0
            if (r3 < r0) goto L12
            m9.h0 r0 = new m9.h0
            long[] r1 = r2.f18145Z
            long[] r3 = java.util.Arrays.copyOf(r1, r3)
            int r1 = r2.f18146a0
            r0.<init>(r3, r1)
            return r0
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int r7, java.lang.Object r8) {
            r6 = this;
            java.lang.Long r8 = (java.lang.Long) r8
            long r0 = r8.longValue()
            r6.m9909a()
            if (r7 < 0) goto L45
            int r8 = r6.f18146a0
            if (r7 > r8) goto L45
            long[] r2 = r6.f18145Z
            int r3 = r2.length
            if (r8 >= r3) goto L1b
            int r3 = r7 + 1
            int r8 = r8 - r7
            java.lang.System.arraycopy(r2, r7, r2, r3, r8)
            goto L34
        L1b:
            r3 = 3
            r4 = 2
            r5 = 1
            int r8 = p121h4.C2484y.m6352a(r8, r3, r4, r5)
            long[] r8 = new long[r8]
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r8, r3, r7)
            long[] r2 = r6.f18145Z
            int r3 = r7 + 1
            int r4 = r6.f18146a0
            int r4 = r4 - r7
            java.lang.System.arraycopy(r2, r7, r8, r3, r4)
            r6.f18145Z = r8
        L34:
            long[] r8 = r6.f18145Z
            r8[r7] = r0
            int r7 = r6.f18146a0
            int r7 = r7 + 1
            r6.f18146a0 = r7
            int r7 = r6.modCount
            int r7 = r7 + 1
            r6.modCount = r7
            return
        L45:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            java.lang.String r7 = r6.m10070l(r7)
            r8.<init>(r7)
            throw r8
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object r3) {
            r2 = this;
            java.lang.Long r3 = (java.lang.Long) r3
            long r0 = r3.longValue()
            r2.m10067e(r0)
            r3 = 1
            return r3
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.Long> r6) {
            r5 = this;
            r5.m9909a()
            java.nio.charset.Charset r0 = p221m9.C4505z.f18308a
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof p221m9.C4455h0
            if (r0 != 0) goto L11
            boolean r6 = super.addAll(r6)
            return r6
        L11:
            m9.h0 r6 = (p221m9.C4455h0) r6
            int r0 = r6.f18146a0
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r5.f18146a0
            int r2 = r2 - r3
            if (r2 < r0) goto L41
            int r3 = r3 + r0
            long[] r0 = r5.f18145Z
            int r2 = r0.length
            if (r3 <= r2) goto L2d
            long[] r0 = java.util.Arrays.copyOf(r0, r3)
            r5.f18145Z = r0
        L2d:
            long[] r0 = r6.f18145Z
            long[] r2 = r5.f18145Z
            int r4 = r5.f18146a0
            int r6 = r6.f18146a0
            java.lang.System.arraycopy(r0, r1, r2, r4, r6)
            r5.f18146a0 = r3
            int r6 = r5.modCount
            r0 = 1
            int r6 = r6 + r0
            r5.modCount = r6
            return r0
        L41:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            r6.<init>()
            throw r6
    }

    /* renamed from: e */
    public void m10067e(long r6) {
            r5 = this;
            r5.m9909a()
            int r0 = r5.f18146a0
            long[] r1 = r5.f18145Z
            int r2 = r1.length
            if (r0 != r2) goto L19
            r2 = 3
            r3 = 2
            r4 = 1
            int r2 = p121h4.C2484y.m6352a(r0, r2, r3, r4)
            long[] r2 = new long[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r5.f18145Z = r2
        L19:
            long[] r0 = r5.f18145Z
            int r1 = r5.f18146a0
            int r2 = r1 + 1
            r5.f18146a0 = r2
            r0[r1] = r6
            return
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof p221m9.C4455h0
            if (r1 != 0) goto Ld
            boolean r9 = super.equals(r9)
            return r9
        Ld:
            m9.h0 r9 = (p221m9.C4455h0) r9
            int r1 = r8.f18146a0
            int r2 = r9.f18146a0
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            long[] r9 = r9.f18145Z
            r1 = 0
        L1a:
            int r2 = r8.f18146a0
            if (r1 >= r2) goto L2c
            long[] r2 = r8.f18145Z
            r4 = r2[r1]
            r6 = r9[r1]
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L29
            return r3
        L29:
            int r1 = r1 + 1
            goto L1a
        L2c:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int r4) {
            r3 = this;
            r3.m10068h(r4)
            long[] r0 = r3.f18145Z
            r1 = r0[r4]
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            return r4
    }

    /* renamed from: h */
    public final void m10068h(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.f18146a0
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.m10070l(r2)
            r0.<init>(r2)
            throw r0
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
            r5 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r5.f18146a0
            if (r1 >= r2) goto L14
            int r0 = r0 * 31
            long[] r2 = r5.f18145Z
            r3 = r2[r1]
            int r2 = p221m9.C4505z.m10386b(r3)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L14:
            return r0
    }

    /* renamed from: i */
    public long m10069i(int r4) {
            r3 = this;
            r3.m10068h(r4)
            long[] r0 = r3.f18145Z
            r1 = r0[r4]
            return r1
    }

    /* renamed from: l */
    public final java.lang.String m10070l(int r3) {
            r2 = this;
            java.lang.String r0 = "Index:"
            java.lang.String r1 = ", Size:"
            java.lang.StringBuilder r3 = androidx.appcompat.widget.C0300r0.m777a(r0, r3, r1)
            int r0 = r2.f18146a0
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int r6) {
            r5 = this;
            r5.m9909a()
            r5.m10068h(r6)
            long[] r0 = r5.f18145Z
            r1 = r0[r6]
            int r3 = r5.f18146a0
            int r4 = r3 + (-1)
            if (r6 >= r4) goto L18
            int r4 = r6 + 1
            int r3 = r3 - r6
            int r3 = r3 + (-1)
            java.lang.System.arraycopy(r0, r4, r0, r6, r3)
        L18:
            int r6 = r5.f18146a0
            int r6 = r6 + (-1)
            r5.f18146a0 = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            return r6
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object r6) {
            r5 = this;
            r5.m9909a()
            r0 = 0
            r1 = 0
        L5:
            int r2 = r5.f18146a0
            if (r1 >= r2) goto L31
            long[] r2 = r5.f18145Z
            r3 = r2[r1]
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L2e
            long[] r6 = r5.f18145Z
            int r0 = r1 + 1
            int r2 = r5.f18146a0
            int r2 = r2 - r1
            r3 = 1
            int r2 = r2 - r3
            java.lang.System.arraycopy(r6, r0, r6, r1, r2)
            int r6 = r5.f18146a0
            int r6 = r6 - r3
            r5.f18146a0 = r6
            int r6 = r5.modCount
            int r6 = r6 + r3
            r5.modCount = r6
            return r3
        L2e:
            int r1 = r1 + 1
            goto L5
        L31:
            return r0
    }

    @Override // java.util.AbstractList
    public void removeRange(int r3, int r4) {
            r2 = this;
            r2.m9909a()
            if (r4 < r3) goto L1a
            long[] r0 = r2.f18145Z
            int r1 = r2.f18146a0
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r0 = r2.f18146a0
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.f18146a0 = r0
            int r3 = r2.modCount
            int r3 = r3 + 1
            r2.modCount = r3
            return
        L1a:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "toIndex < fromIndex"
            r3.<init>(r4)
            throw r3
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int r5, java.lang.Object r6) {
            r4 = this;
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            r4.m9909a()
            r4.m10068h(r5)
            long[] r6 = r4.f18145Z
            r2 = r6[r5]
            r6[r5] = r0
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            int r0 = r1.f18146a0
            return r0
    }
}
