package p124h7;

/* JADX WARN: Unexpected interfaces in signature: [h7.e0] */
/* renamed from: h7.kg */
/* loaded from: classes.dex */
public final class C2718kg extends p124h7.AbstractC2879tf<java.lang.Double> implements java.util.RandomAccess, p124h7.InterfaceC2557c {

    /* renamed from: Z */
    public double[] f11725Z;

    /* renamed from: a0 */
    public int f11726a0;

    static {
            h7.kg r0 = new h7.kg
            r1 = 0
            double[] r2 = new double[r1]
            r0.<init>(r2, r1)
            r0.f11928Y = r1
            return
    }

    public C2718kg() {
            r1 = this;
            r0 = 10
            double[] r0 = new double[r0]
            r1.<init>()
            r1.f11725Z = r0
            r0 = 0
            r1.f11726a0 = r0
            return
    }

    public C2718kg(double[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f11725Z = r1
            r0.f11726a0 = r2
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int r7, java.lang.Object r8) {
            r6 = this;
            java.lang.Double r8 = (java.lang.Double) r8
            double r0 = r8.doubleValue()
            r6.m7174a()
            if (r7 < 0) goto L45
            int r8 = r6.f11726a0
            if (r7 > r8) goto L45
            double[] r2 = r6.f11725Z
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
            double[] r2 = r6.f11725Z
            int r3 = r7 + 1
            int r4 = r6.f11726a0
            int r4 = r4 - r7
            java.lang.System.arraycopy(r2, r7, r8, r3, r4)
            r6.f11725Z = r8
        L34:
            double[] r8 = r6.f11725Z
            r8[r7] = r0
            int r7 = r6.f11726a0
            int r7 = r7 + 1
            r6.f11726a0 = r7
            int r7 = r6.modCount
            int r7 = r7 + 1
            r6.modCount = r7
            return
        L45:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            java.lang.String r7 = r6.m6951h(r7)
            r8.<init>(r7)
            throw r8
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r3) {
            r2 = this;
            java.lang.Double r3 = (java.lang.Double) r3
            double r0 = r3.doubleValue()
            r2.m6950e(r0)
            r3 = 1
            return r3
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Double> r6) {
            r5 = this;
            r5.m7174a()
            java.nio.charset.Charset r0 = p124h7.C2575d.f11429a
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof p124h7.C2718kg
            if (r0 != 0) goto L11
            boolean r6 = super.addAll(r6)
            return r6
        L11:
            h7.kg r6 = (p124h7.C2718kg) r6
            int r0 = r6.f11726a0
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            int r2 = r5.f11726a0
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r3 - r2
            if (r3 < r0) goto L41
            int r2 = r2 + r0
            double[] r0 = r5.f11725Z
            int r3 = r0.length
            if (r2 <= r3) goto L2d
            double[] r0 = java.util.Arrays.copyOf(r0, r2)
            r5.f11725Z = r0
        L2d:
            double[] r0 = r6.f11725Z
            double[] r3 = r5.f11725Z
            int r4 = r5.f11726a0
            int r6 = r6.f11726a0
            java.lang.System.arraycopy(r0, r1, r3, r4, r6)
            r5.f11726a0 = r2
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }

    /* renamed from: e */
    public final void m6950e(double r6) {
            r5 = this;
            r5.m7174a()
            int r0 = r5.f11726a0
            double[] r1 = r5.f11725Z
            int r2 = r1.length
            if (r0 != r2) goto L19
            r2 = 3
            r3 = 2
            r4 = 1
            int r2 = p121h4.C2484y.m6352a(r0, r2, r3, r4)
            double[] r2 = new double[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r5.f11725Z = r2
        L19:
            double[] r0 = r5.f11725Z
            int r1 = r5.f11726a0
            int r2 = r1 + 1
            r5.f11726a0 = r2
            r0[r1] = r6
            return
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof p124h7.C2718kg
            if (r1 != 0) goto Ld
            boolean r9 = super.equals(r9)
            return r9
        Ld:
            h7.kg r9 = (p124h7.C2718kg) r9
            int r1 = r8.f11726a0
            int r2 = r9.f11726a0
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            double[] r9 = r9.f11725Z
            r1 = 0
        L1a:
            int r2 = r8.f11726a0
            if (r1 >= r2) goto L34
            double[] r2 = r8.f11725Z
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
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r4) {
            r3 = this;
            r3.m6952i(r4)
            double[] r0 = r3.f11725Z
            r1 = r0[r4]
            java.lang.Double r4 = java.lang.Double.valueOf(r1)
            return r4
    }

    /* renamed from: h */
    public final java.lang.String m6951h(int r5) {
            r4 = this;
            int r0 = r4.f11726a0
            r1 = 35
            java.lang.String r2 = "Index:"
            java.lang.String r3 = ", Size:"
            java.lang.String r5 = p304r4.C5785f.m12134a(r1, r2, r5, r3, r0)
            return r5
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r5 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r5.f11726a0
            if (r1 >= r2) goto L18
            int r0 = r0 * 31
            double[] r2 = r5.f11725Z
            r3 = r2[r1]
            long r2 = java.lang.Double.doubleToLongBits(r3)
            int r2 = p124h7.C2575d.m6539b(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L18:
            return r0
    }

    /* renamed from: i */
    public final void m6952i(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.f11726a0
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.m6951h(r2)
            r0.<init>(r2)
            throw r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r8) {
            r7 = this;
            boolean r0 = r8 instanceof java.lang.Double
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Double r8 = (java.lang.Double) r8
            double r2 = r8.doubleValue()
            int r8 = r7.f11726a0
            r0 = 0
        Lf:
            if (r0 >= r8) goto L1d
            double[] r4 = r7.f11725Z
            r5 = r4[r0]
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 != 0) goto L1a
            return r0
        L1a:
            int r0 = r0 + 1
            goto Lf
        L1d:
            return r1
    }

    @Override // p124h7.InterfaceC2557c
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2557c mo6521k(int r3) {
            r2 = this;
            int r0 = r2.f11726a0
            if (r3 < r0) goto L12
            h7.kg r0 = new h7.kg
            double[] r1 = r2.f11725Z
            double[] r3 = java.util.Arrays.copyOf(r1, r3)
            int r1 = r2.f11726a0
            r0.<init>(r3, r1)
            return r0
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r6) {
            r5 = this;
            r5.m7174a()
            r5.m6952i(r6)
            double[] r0 = r5.f11725Z
            r1 = r0[r6]
            int r3 = r5.f11726a0
            int r4 = r3 + (-1)
            if (r6 >= r4) goto L18
            int r4 = r6 + 1
            int r3 = r3 - r6
            int r3 = r3 + (-1)
            java.lang.System.arraycopy(r0, r4, r0, r6, r3)
        L18:
            int r6 = r5.f11726a0
            int r6 = r6 + (-1)
            r5.f11726a0 = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            java.lang.Double r6 = java.lang.Double.valueOf(r1)
            return r6
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r3, int r4) {
            r2 = this;
            r2.m7174a()
            if (r4 < r3) goto L1a
            double[] r0 = r2.f11725Z
            int r1 = r2.f11726a0
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r0 = r2.f11726a0
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.f11726a0 = r0
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
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r5, java.lang.Object r6) {
            r4 = this;
            java.lang.Double r6 = (java.lang.Double) r6
            double r0 = r6.doubleValue()
            r4.m7174a()
            r4.m6952i(r5)
            double[] r6 = r4.f11725Z
            r2 = r6[r5]
            r6[r5] = r0
            java.lang.Double r5 = java.lang.Double.valueOf(r2)
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.f11726a0
            return r0
    }
}
