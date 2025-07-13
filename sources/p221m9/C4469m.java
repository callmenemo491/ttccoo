package p221m9;

/* renamed from: m9.m */
/* loaded from: classes.dex */
public final class C4469m extends p221m9.AbstractC4439c<java.lang.Double> implements java.util.RandomAccess, p221m9.InterfaceC4506z0 {

    /* renamed from: Z */
    public double[] f18191Z;

    /* renamed from: a0 */
    public int f18192a0;

    static {
            m9.m r0 = new m9.m
            r1 = 0
            double[] r2 = new double[r1]
            r0.<init>(r2, r1)
            r0.f18111Y = r1
            return
    }

    public C4469m() {
            r1 = this;
            r0 = 10
            double[] r0 = new double[r0]
            r1.<init>()
            r1.f18191Z = r0
            r0 = 0
            r1.f18192a0 = r0
            return
    }

    public C4469m(double[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f18191Z = r1
            r0.f18192a0 = r2
            return
    }

    @Override // p221m9.C4505z.c
    /* renamed from: B */
    public p221m9.C4505z.c mo9905B(int r3) {
            r2 = this;
            int r0 = r2.f18192a0
            if (r3 < r0) goto L12
            m9.m r0 = new m9.m
            double[] r1 = r2.f18191Z
            double[] r3 = java.util.Arrays.copyOf(r1, r3)
            int r1 = r2.f18192a0
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
            java.lang.Double r8 = (java.lang.Double) r8
            double r0 = r8.doubleValue()
            r6.m9909a()
            if (r7 < 0) goto L45
            int r8 = r6.f18192a0
            if (r7 > r8) goto L45
            double[] r2 = r6.f18191Z
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
            double[] r8 = new double[r8]
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r8, r3, r7)
            double[] r2 = r6.f18191Z
            int r3 = r7 + 1
            int r4 = r6.f18192a0
            int r4 = r4 - r7
            java.lang.System.arraycopy(r2, r7, r8, r3, r4)
            r6.f18191Z = r8
        L34:
            double[] r8 = r6.f18191Z
            r8[r7] = r0
            int r7 = r6.f18192a0
            int r7 = r7 + 1
            r6.f18192a0 = r7
            int r7 = r6.modCount
            int r7 = r7 + 1
            r6.modCount = r7
            return
        L45:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            java.lang.String r7 = r6.m10197i(r7)
            r8.<init>(r7)
            throw r8
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object r3) {
            r2 = this;
            java.lang.Double r3 = (java.lang.Double) r3
            double r0 = r3.doubleValue()
            r2.m10195e(r0)
            r3 = 1
            return r3
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.Double> r6) {
            r5 = this;
            r5.m9909a()
            java.nio.charset.Charset r0 = p221m9.C4505z.f18308a
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof p221m9.C4469m
            if (r0 != 0) goto L11
            boolean r6 = super.addAll(r6)
            return r6
        L11:
            m9.m r6 = (p221m9.C4469m) r6
            int r0 = r6.f18192a0
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r5.f18192a0
            int r2 = r2 - r3
            if (r2 < r0) goto L41
            int r3 = r3 + r0
            double[] r0 = r5.f18191Z
            int r2 = r0.length
            if (r3 <= r2) goto L2d
            double[] r0 = java.util.Arrays.copyOf(r0, r3)
            r5.f18191Z = r0
        L2d:
            double[] r0 = r6.f18191Z
            double[] r2 = r5.f18191Z
            int r4 = r5.f18192a0
            int r6 = r6.f18192a0
            java.lang.System.arraycopy(r0, r1, r2, r4, r6)
            r5.f18192a0 = r3
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
    public void m10195e(double r6) {
            r5 = this;
            r5.m9909a()
            int r0 = r5.f18192a0
            double[] r1 = r5.f18191Z
            int r2 = r1.length
            if (r0 != r2) goto L19
            r2 = 3
            r3 = 2
            r4 = 1
            int r2 = p121h4.C2484y.m6352a(r0, r2, r3, r4)
            double[] r2 = new double[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r5.f18191Z = r2
        L19:
            double[] r0 = r5.f18191Z
            int r1 = r5.f18192a0
            int r2 = r1 + 1
            r5.f18192a0 = r2
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
            boolean r1 = r9 instanceof p221m9.C4469m
            if (r1 != 0) goto Ld
            boolean r9 = super.equals(r9)
            return r9
        Ld:
            m9.m r9 = (p221m9.C4469m) r9
            int r1 = r8.f18192a0
            int r2 = r9.f18192a0
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            double[] r9 = r9.f18191Z
            r1 = 0
        L1a:
            int r2 = r8.f18192a0
            if (r1 >= r2) goto L34
            double[] r2 = r8.f18191Z
            r4 = r2[r1]
            long r4 = java.lang.Double.doubleToLongBits(r4)
            r6 = r9[r1]
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L31
            return r3
        L31:
            int r1 = r1 + 1
            goto L1a
        L34:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int r4) {
            r3 = this;
            r3.m10196h(r4)
            double[] r0 = r3.f18191Z
            r1 = r0[r4]
            java.lang.Double r4 = java.lang.Double.valueOf(r1)
            return r4
    }

    /* renamed from: h */
    public final void m10196h(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.f18192a0
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.m10197i(r2)
            r0.<init>(r2)
            throw r0
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
            r5 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r5.f18192a0
            if (r1 >= r2) goto L18
            double[] r2 = r5.f18191Z
            r3 = r2[r1]
            long r2 = java.lang.Double.doubleToLongBits(r3)
            int r0 = r0 * 31
            int r2 = p221m9.C4505z.m10386b(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L18:
            return r0
    }

    /* renamed from: i */
    public final java.lang.String m10197i(int r3) {
            r2 = this;
            java.lang.String r0 = "Index:"
            java.lang.String r1 = ", Size:"
            java.lang.StringBuilder r3 = androidx.appcompat.widget.C0300r0.m777a(r0, r3, r1)
            int r0 = r2.f18192a0
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int r6) {
            r5 = this;
            r5.m9909a()
            r5.m10196h(r6)
            double[] r0 = r5.f18191Z
            r1 = r0[r6]
            int r3 = r5.f18192a0
            int r4 = r3 + (-1)
            if (r6 >= r4) goto L18
            int r4 = r6 + 1
            int r3 = r3 - r6
            int r3 = r3 + (-1)
            java.lang.System.arraycopy(r0, r4, r0, r6, r3)
        L18:
            int r6 = r5.f18192a0
            int r6 = r6 + (-1)
            r5.f18192a0 = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            java.lang.Double r6 = java.lang.Double.valueOf(r1)
            return r6
    }

    @Override // p221m9.AbstractC4439c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object r6) {
            r5 = this;
            r5.m9909a()
            r0 = 0
            r1 = 0
        L5:
            int r2 = r5.f18192a0
            if (r1 >= r2) goto L31
            double[] r2 = r5.f18191Z
            r3 = r2[r1]
            java.lang.Double r2 = java.lang.Double.valueOf(r3)
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L2e
            double[] r6 = r5.f18191Z
            int r0 = r1 + 1
            int r2 = r5.f18192a0
            int r2 = r2 - r1
            r3 = 1
            int r2 = r2 - r3
            java.lang.System.arraycopy(r6, r0, r6, r1, r2)
            int r6 = r5.f18192a0
            int r6 = r6 - r3
            r5.f18192a0 = r6
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
            double[] r0 = r2.f18191Z
            int r1 = r2.f18192a0
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r0 = r2.f18192a0
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.f18192a0 = r0
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
            java.lang.Double r6 = (java.lang.Double) r6
            double r0 = r6.doubleValue()
            r4.m9909a()
            r4.m10196h(r5)
            double[] r6 = r4.f18191Z
            r2 = r6[r5]
            r6[r5] = r0
            java.lang.Double r5 = java.lang.Double.valueOf(r2)
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            int r0 = r1.f18192a0
            return r0
    }
}
