package p221m9;

/* renamed from: m9.f */
/* loaded from: classes.dex */
public final class C4448f extends p221m9.AbstractC4439c<java.lang.Boolean> implements java.util.RandomAccess, p221m9.InterfaceC4506z0 {

    /* renamed from: Z */
    public boolean[] f18127Z;

    /* renamed from: a0 */
    public int f18128a0;

    static {
            m9.f r0 = new m9.f
            r1 = 0
            boolean[] r2 = new boolean[r1]
            r0.<init>(r2, r1)
            r0.f18111Y = r1
            return
    }

    public C4448f() {
            r1 = this;
            r0 = 10
            boolean[] r0 = new boolean[r0]
            r1.<init>()
            r1.f18127Z = r0
            r0 = 0
            r1.f18128a0 = r0
            return
    }

    public C4448f(boolean[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f18127Z = r1
            r0.f18128a0 = r2
            return
    }

    @Override // p221m9.C4505z.c
    /* renamed from: B */
    public p221m9.C4505z.c mo9905B(int r3) {
            r2 = this;
            int r0 = r2.f18128a0
            if (r3 < r0) goto L12
            m9.f r0 = new m9.f
            boolean[] r1 = r2.f18127Z
            boolean[] r3 = java.util.Arrays.copyOf(r1, r3)
            int r1 = r2.f18128a0
            r0.<init>(r3, r1)
            return r0
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int r6, java.lang.Object r7) {
            r5 = this;
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r5.m9909a()
            if (r6 < 0) goto L45
            int r0 = r5.f18128a0
            if (r6 > r0) goto L45
            boolean[] r1 = r5.f18127Z
            int r2 = r1.length
            if (r0 >= r2) goto L1b
            int r2 = r6 + 1
            int r0 = r0 - r6
            java.lang.System.arraycopy(r1, r6, r1, r2, r0)
            goto L34
        L1b:
            r2 = 3
            r3 = 2
            r4 = 1
            int r0 = p121h4.C2484y.m6352a(r0, r2, r3, r4)
            boolean[] r0 = new boolean[r0]
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r6)
            boolean[] r1 = r5.f18127Z
            int r2 = r6 + 1
            int r3 = r5.f18128a0
            int r3 = r3 - r6
            java.lang.System.arraycopy(r1, r6, r0, r2, r3)
            r5.f18127Z = r0
        L34:
            boolean[] r0 = r5.f18127Z
            r0[r6] = r7
            int r6 = r5.f18128a0
            int r6 = r6 + 1
            r5.f18128a0 = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            return
        L45:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = r5.m9998i(r6)
            r7.<init>(r6)
            throw r7
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.m9996e(r1)
            r1 = 1
            return r1
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.Boolean> r6) {
            r5 = this;
            r5.m9909a()
            java.nio.charset.Charset r0 = p221m9.C4505z.f18308a
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof p221m9.C4448f
            if (r0 != 0) goto L11
            boolean r6 = super.addAll(r6)
            return r6
        L11:
            m9.f r6 = (p221m9.C4448f) r6
            int r0 = r6.f18128a0
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r5.f18128a0
            int r2 = r2 - r3
            if (r2 < r0) goto L41
            int r3 = r3 + r0
            boolean[] r0 = r5.f18127Z
            int r2 = r0.length
            if (r3 <= r2) goto L2d
            boolean[] r0 = java.util.Arrays.copyOf(r0, r3)
            r5.f18127Z = r0
        L2d:
            boolean[] r0 = r6.f18127Z
            boolean[] r2 = r5.f18127Z
            int r4 = r5.f18128a0
            int r6 = r6.f18128a0
            java.lang.System.arraycopy(r0, r1, r2, r4, r6)
            r5.f18128a0 = r3
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
    public void m9996e(boolean r6) {
            r5 = this;
            r5.m9909a()
            int r0 = r5.f18128a0
            boolean[] r1 = r5.f18127Z
            int r2 = r1.length
            if (r0 != r2) goto L19
            r2 = 3
            r3 = 2
            r4 = 1
            int r2 = p121h4.C2484y.m6352a(r0, r2, r3, r4)
            boolean[] r2 = new boolean[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r5.f18127Z = r2
        L19:
            boolean[] r0 = r5.f18127Z
            int r1 = r5.f18128a0
            int r2 = r1 + 1
            r5.f18128a0 = r2
            r0[r1] = r6
            return
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p221m9.C4448f
            if (r1 != 0) goto Ld
            boolean r6 = super.equals(r6)
            return r6
        Ld:
            m9.f r6 = (p221m9.C4448f) r6
            int r1 = r5.f18128a0
            int r2 = r6.f18128a0
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            boolean[] r6 = r6.f18127Z
            r1 = 0
        L1a:
            int r2 = r5.f18128a0
            if (r1 >= r2) goto L2a
            boolean[] r2 = r5.f18127Z
            boolean r2 = r2[r1]
            boolean r4 = r6[r1]
            if (r2 == r4) goto L27
            return r3
        L27:
            int r1 = r1 + 1
            goto L1a
        L2a:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int r2) {
            r1 = this;
            r1.m9997h(r2)
            boolean[] r0 = r1.f18127Z
            boolean r2 = r0[r2]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    /* renamed from: h */
    public final void m9997h(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.f18128a0
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.m9998i(r2)
            r0.<init>(r2)
            throw r0
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
            r3 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r3.f18128a0
            if (r1 >= r2) goto L14
            int r0 = r0 * 31
            boolean[] r2 = r3.f18127Z
            boolean r2 = r2[r1]
            int r2 = p221m9.C4505z.m10385a(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L14:
            return r0
    }

    /* renamed from: i */
    public final java.lang.String m9998i(int r3) {
            r2 = this;
            java.lang.String r0 = "Index:"
            java.lang.String r1 = ", Size:"
            java.lang.StringBuilder r3 = androidx.appcompat.widget.C0300r0.m777a(r0, r3, r1)
            int r0 = r2.f18128a0
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int r5) {
            r4 = this;
            r4.m9909a()
            r4.m9997h(r5)
            boolean[] r0 = r4.f18127Z
            boolean r1 = r0[r5]
            int r2 = r4.f18128a0
            int r3 = r2 + (-1)
            if (r5 >= r3) goto L18
            int r3 = r5 + 1
            int r2 = r2 - r5
            int r2 = r2 + (-1)
            java.lang.System.arraycopy(r0, r3, r0, r5, r2)
        L18:
            int r5 = r4.f18128a0
            int r5 = r5 + (-1)
            r4.f18128a0 = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object r5) {
            r4 = this;
            r4.m9909a()
            r0 = 0
            r1 = 0
        L5:
            int r2 = r4.f18128a0
            if (r1 >= r2) goto L31
            boolean[] r2 = r4.f18127Z
            boolean r2 = r2[r1]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L2e
            boolean[] r5 = r4.f18127Z
            int r0 = r1 + 1
            int r2 = r4.f18128a0
            int r2 = r2 - r1
            r3 = 1
            int r2 = r2 - r3
            java.lang.System.arraycopy(r5, r0, r5, r1, r2)
            int r5 = r4.f18128a0
            int r5 = r5 - r3
            r4.f18128a0 = r5
            int r5 = r4.modCount
            int r5 = r5 + r3
            r4.modCount = r5
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
            boolean[] r0 = r2.f18127Z
            int r1 = r2.f18128a0
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r0 = r2.f18128a0
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.f18128a0 = r0
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
    public java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.m9909a()
            r2.m9997h(r3)
            boolean[] r0 = r2.f18127Z
            boolean r1 = r0[r3]
            r0[r3] = r4
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            int r0 = r1.f18128a0
            return r0
    }
}
