package p072e7;

/* renamed from: e7.y5 */
/* loaded from: classes.dex */
public final class C1792y5 extends p072e7.AbstractC1568b5<java.lang.Integer> implements java.util.RandomAccess, p072e7.InterfaceC1579c6, p072e7.InterfaceC1630h7 {

    /* renamed from: b0 */
    public static final p072e7.C1792y5 f7844b0 = null;

    /* renamed from: Z */
    public int[] f7845Z;

    /* renamed from: a0 */
    public int f7846a0;

    static {
            e7.y5 r0 = new e7.y5
            r1 = 0
            int[] r2 = new int[r1]
            r0.<init>(r2, r1)
            p072e7.C1792y5.f7844b0 = r0
            r0.f7494Y = r1
            return
    }

    public C1792y5() {
            r1 = this;
            r0 = 10
            int[] r0 = new int[r0]
            r1.<init>()
            r1.f7845Z = r0
            r0 = 0
            r1.f7846a0 = r0
            return
    }

    public C1792y5(int[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f7845Z = r1
            r0.f7846a0 = r2
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r6, java.lang.Object r7) {
            r5 = this;
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.m4127a()
            if (r6 < 0) goto L45
            int r0 = r5.f7846a0
            if (r6 > r0) goto L45
            int[] r1 = r5.f7845Z
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
            int[] r0 = new int[r0]
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r6)
            int[] r1 = r5.f7845Z
            int r2 = r6 + 1
            int r3 = r5.f7846a0
            int r3 = r3 - r6
            java.lang.System.arraycopy(r1, r6, r0, r2, r3)
            r5.f7845Z = r0
        L34:
            int[] r0 = r5.f7845Z
            r0[r6] = r7
            int r6 = r5.f7846a0
            int r6 = r6 + 1
            r5.f7846a0 = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            return
        L45:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = r5.m4498l(r6)
            r7.<init>(r6)
            throw r7
    }

    @Override // p072e7.AbstractC1568b5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.m4497i(r1)
            r1 = 1
            return r1
    }

    @Override // p072e7.AbstractC1568b5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Integer> r6) {
            r5 = this;
            r5.m4127a()
            java.nio.charset.Charset r0 = p072e7.C1619g6.f7568a
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof p072e7.C1792y5
            if (r0 != 0) goto L11
            boolean r6 = super.addAll(r6)
            return r6
        L11:
            e7.y5 r6 = (p072e7.C1792y5) r6
            int r0 = r6.f7846a0
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            int r2 = r5.f7846a0
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r3 - r2
            if (r3 < r0) goto L41
            int r2 = r2 + r0
            int[] r0 = r5.f7845Z
            int r3 = r0.length
            if (r2 <= r3) goto L2d
            int[] r0 = java.util.Arrays.copyOf(r0, r2)
            r5.f7845Z = r0
        L2d:
            int[] r0 = r6.f7845Z
            int[] r3 = r5.f7845Z
            int r4 = r5.f7846a0
            int r6 = r6.f7846a0
            java.lang.System.arraycopy(r0, r1, r3, r4, r6)
            r5.f7846a0 = r2
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
    public final int m4495e(int r2) {
            r1 = this;
            r1.m4499m(r2)
            int[] r0 = r1.f7845Z
            r2 = r0[r2]
            return r2
    }

    @Override // p072e7.AbstractC1568b5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p072e7.C1792y5
            if (r1 != 0) goto Ld
            boolean r6 = super.equals(r6)
            return r6
        Ld:
            e7.y5 r6 = (p072e7.C1792y5) r6
            int r1 = r5.f7846a0
            int r2 = r6.f7846a0
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            int[] r6 = r6.f7845Z
            r1 = 0
        L1a:
            int r2 = r5.f7846a0
            if (r1 >= r2) goto L2a
            int[] r2 = r5.f7845Z
            r2 = r2[r1]
            r4 = r6[r1]
            if (r2 == r4) goto L27
            return r3
        L27:
            int r1 = r1 + 1
            goto L1a
        L2a:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int r2) {
            r1 = this;
            r1.m4499m(r2)
            int[] r0 = r1.f7845Z
            r2 = r0[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    /* renamed from: h */
    public final p072e7.InterfaceC1579c6 m4496h(int r3) {
            r2 = this;
            int r0 = r2.f7846a0
            if (r3 < r0) goto L12
            e7.y5 r0 = new e7.y5
            int[] r1 = r2.f7845Z
            int[] r3 = java.util.Arrays.copyOf(r1, r3)
            int r1 = r2.f7846a0
            r0.<init>(r3, r1)
            return r0
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    @Override // p072e7.AbstractC1568b5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r3 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r3.f7846a0
            if (r1 >= r2) goto L10
            int r0 = r0 * 31
            int[] r2 = r3.f7845Z
            r2 = r2[r1]
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L10:
            return r0
    }

    /* renamed from: i */
    public final void m4497i(int r6) {
            r5 = this;
            r5.m4127a()
            int r0 = r5.f7846a0
            int[] r1 = r5.f7845Z
            int r2 = r1.length
            if (r0 != r2) goto L19
            r2 = 3
            r3 = 2
            r4 = 1
            int r2 = p121h4.C2484y.m6352a(r0, r2, r3, r4)
            int[] r2 = new int[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r5.f7845Z = r2
        L19:
            int[] r0 = r5.f7845Z
            int r1 = r5.f7846a0
            int r2 = r1 + 1
            r5.f7846a0 = r2
            r0[r1] = r6
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Integer
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r0 = r4.f7846a0
            r2 = 0
        Lf:
            if (r2 >= r0) goto L1b
            int[] r3 = r4.f7845Z
            r3 = r3[r2]
            if (r3 != r5) goto L18
            return r2
        L18:
            int r2 = r2 + 1
            goto Lf
        L1b:
            return r1
    }

    /* renamed from: l */
    public final java.lang.String m4498l(int r5) {
            r4 = this;
            int r0 = r4.f7846a0
            r1 = 35
            java.lang.String r2 = "Index:"
            java.lang.String r3 = ", Size:"
            java.lang.String r5 = p304r4.C5785f.m12134a(r1, r2, r5, r3, r0)
            return r5
    }

    /* renamed from: m */
    public final void m4499m(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.f7846a0
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.m4498l(r2)
            r0.<init>(r2)
            throw r0
    }

    @Override // p072e7.AbstractC1568b5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r5) {
            r4 = this;
            r4.m4127a()
            r4.m4499m(r5)
            int[] r0 = r4.f7845Z
            r1 = r0[r5]
            int r2 = r4.f7846a0
            int r3 = r2 + (-1)
            if (r5 >= r3) goto L18
            int r3 = r5 + 1
            int r2 = r2 - r5
            int r2 = r2 + (-1)
            java.lang.System.arraycopy(r0, r3, r0, r5, r2)
        L18:
            int r5 = r4.f7846a0
            int r5 = r5 + (-1)
            r4.f7846a0 = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            return r5
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r3, int r4) {
            r2 = this;
            r2.m4127a()
            if (r4 < r3) goto L1a
            int[] r0 = r2.f7845Z
            int r1 = r2.f7846a0
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r0 = r2.f7846a0
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.f7846a0 = r0
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
    public final /* bridge */ /* synthetic */ p072e7.InterfaceC1609f6<java.lang.Integer> mo4197s(int r1) {
            r0 = this;
            e7.c6 r1 = r0.m4496h(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.m4127a()
            r2.m4499m(r3)
            int[] r0 = r2.f7845Z
            r1 = r0[r3]
            r0[r3] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.f7846a0
            return r0
    }
}
