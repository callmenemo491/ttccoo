package p072e7;

/* renamed from: e7.p6 */
/* loaded from: classes.dex */
public final class C1709p6 extends p072e7.AbstractC1568b5<java.lang.Long> implements java.util.RandomAccess, p072e7.InterfaceC1599e6, p072e7.InterfaceC1630h7 {

    /* renamed from: b0 */
    public static final p072e7.C1709p6 f7736b0 = null;

    /* renamed from: Z */
    public long[] f7737Z;

    /* renamed from: a0 */
    public int f7738a0;

    static {
            e7.p6 r0 = new e7.p6
            r1 = 0
            long[] r2 = new long[r1]
            r0.<init>(r2, r1)
            p072e7.C1709p6.f7736b0 = r0
            r0.f7494Y = r1
            return
    }

    public C1709p6() {
            r1 = this;
            r0 = 10
            long[] r0 = new long[r0]
            r1.<init>()
            r1.f7737Z = r0
            r0 = 0
            r1.f7738a0 = r0
            return
    }

    public C1709p6(long[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f7737Z = r1
            r0.f7738a0 = r2
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r7, java.lang.Object r8) {
            r6 = this;
            java.lang.Long r8 = (java.lang.Long) r8
            long r0 = r8.longValue()
            r6.m4127a()
            if (r7 < 0) goto L45
            int r8 = r6.f7738a0
            if (r7 > r8) goto L45
            long[] r2 = r6.f7737Z
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
            long[] r2 = r6.f7737Z
            int r3 = r7 + 1
            int r4 = r6.f7738a0
            int r4 = r4 - r7
            java.lang.System.arraycopy(r2, r7, r8, r3, r4)
            r6.f7737Z = r8
        L34:
            long[] r8 = r6.f7737Z
            r8[r7] = r0
            int r7 = r6.f7738a0
            int r7 = r7 + 1
            r6.f7738a0 = r7
            int r7 = r6.modCount
            int r7 = r7 + 1
            r6.modCount = r7
            return
        L45:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            java.lang.String r7 = r6.m4414h(r7)
            r8.<init>(r7)
            throw r8
    }

    @Override // p072e7.AbstractC1568b5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r7) {
            r6 = this;
            java.lang.Long r7 = (java.lang.Long) r7
            long r0 = r7.longValue()
            r6.m4127a()
            int r7 = r6.f7738a0
            long[] r2 = r6.f7737Z
            int r3 = r2.length
            r4 = 1
            if (r7 != r3) goto L1f
            r3 = 3
            r5 = 2
            int r3 = p121h4.C2484y.m6352a(r7, r3, r5, r4)
            long[] r3 = new long[r3]
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r3, r5, r7)
            r6.f7737Z = r3
        L1f:
            long[] r7 = r6.f7737Z
            int r2 = r6.f7738a0
            int r3 = r2 + 1
            r6.f7738a0 = r3
            r7[r2] = r0
            return r4
    }

    @Override // p072e7.AbstractC1568b5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Long> r6) {
            r5 = this;
            r5.m4127a()
            java.nio.charset.Charset r0 = p072e7.C1619g6.f7568a
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof p072e7.C1709p6
            if (r0 != 0) goto L11
            boolean r6 = super.addAll(r6)
            return r6
        L11:
            e7.p6 r6 = (p072e7.C1709p6) r6
            int r0 = r6.f7738a0
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            int r2 = r5.f7738a0
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r3 - r2
            if (r3 < r0) goto L41
            int r2 = r2 + r0
            long[] r0 = r5.f7737Z
            int r3 = r0.length
            if (r2 <= r3) goto L2d
            long[] r0 = java.util.Arrays.copyOf(r0, r2)
            r5.f7737Z = r0
        L2d:
            long[] r0 = r6.f7737Z
            long[] r3 = r5.f7737Z
            int r4 = r5.f7738a0
            int r6 = r6.f7738a0
            java.lang.System.arraycopy(r0, r1, r3, r4, r6)
            r5.f7738a0 = r2
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
    public final long m4413e(int r4) {
            r3 = this;
            r3.m4415i(r4)
            long[] r0 = r3.f7737Z
            r1 = r0[r4]
            return r1
    }

    @Override // p072e7.AbstractC1568b5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof p072e7.C1709p6
            if (r1 != 0) goto Ld
            boolean r9 = super.equals(r9)
            return r9
        Ld:
            e7.p6 r9 = (p072e7.C1709p6) r9
            int r1 = r8.f7738a0
            int r2 = r9.f7738a0
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            long[] r9 = r9.f7737Z
            r1 = 0
        L1a:
            int r2 = r8.f7738a0
            if (r1 >= r2) goto L2c
            long[] r2 = r8.f7737Z
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
    public final /* synthetic */ java.lang.Object get(int r4) {
            r3 = this;
            r3.m4415i(r4)
            long[] r0 = r3.f7737Z
            r1 = r0[r4]
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            return r4
    }

    /* renamed from: h */
    public final java.lang.String m4414h(int r5) {
            r4 = this;
            int r0 = r4.f7738a0
            r1 = 35
            java.lang.String r2 = "Index:"
            java.lang.String r3 = ", Size:"
            java.lang.String r5 = p304r4.C5785f.m12134a(r1, r2, r5, r3, r0)
            return r5
    }

    @Override // p072e7.AbstractC1568b5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r5 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r5.f7738a0
            if (r1 >= r2) goto L14
            int r0 = r0 * 31
            long[] r2 = r5.f7737Z
            r3 = r2[r1]
            int r2 = p072e7.C1619g6.m4201a(r3)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L14:
            return r0
    }

    /* renamed from: i */
    public final void m4415i(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.f7738a0
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.m4414h(r2)
            r0.<init>(r2)
            throw r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r8) {
            r7 = this;
            boolean r0 = r8 instanceof java.lang.Long
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Long r8 = (java.lang.Long) r8
            long r2 = r8.longValue()
            int r8 = r7.f7738a0
            r0 = 0
        Lf:
            if (r0 >= r8) goto L1d
            long[] r4 = r7.f7737Z
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

    @Override // p072e7.AbstractC1568b5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r6) {
            r5 = this;
            r5.m4127a()
            r5.m4415i(r6)
            long[] r0 = r5.f7737Z
            r1 = r0[r6]
            int r3 = r5.f7738a0
            int r4 = r3 + (-1)
            if (r6 >= r4) goto L18
            int r4 = r6 + 1
            int r3 = r3 - r6
            int r3 = r3 + (-1)
            java.lang.System.arraycopy(r0, r4, r0, r6, r3)
        L18:
            int r6 = r5.f7738a0
            int r6 = r6 + (-1)
            r5.f7738a0 = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            return r6
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r3, int r4) {
            r2 = this;
            r2.m4127a()
            if (r4 < r3) goto L1a
            long[] r0 = r2.f7737Z
            int r1 = r2.f7738a0
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r0 = r2.f7738a0
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.f7738a0 = r0
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

    @Override // p072e7.InterfaceC1609f6
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ p072e7.InterfaceC1609f6<java.lang.Long> mo4197s(int r3) {
            r2 = this;
            int r0 = r2.f7738a0
            if (r3 < r0) goto L12
            e7.p6 r0 = new e7.p6
            long[] r1 = r2.f7737Z
            long[] r3 = java.util.Arrays.copyOf(r1, r3)
            int r1 = r2.f7738a0
            r0.<init>(r3, r1)
            return r0
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r5, java.lang.Object r6) {
            r4 = this;
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            r4.m4127a()
            r4.m4415i(r5)
            long[] r6 = r4.f7737Z
            r2 = r6[r5]
            r6[r5] = r0
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.f7738a0
            return r0
    }
}
