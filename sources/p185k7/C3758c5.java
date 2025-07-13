package p185k7;

/* JADX WARN: Unexpected interfaces in signature: [k7.m7] */
/* renamed from: k7.c5 */
/* loaded from: classes.dex */
public final class C3758c5 extends p185k7.AbstractC3730a5<java.lang.Boolean> implements java.util.RandomAccess, p185k7.InterfaceC3857j6 {

    /* renamed from: Z */
    public boolean[] f16544Z;

    /* renamed from: a0 */
    public int f16545a0;

    static {
            k7.c5 r0 = new k7.c5
            r1 = 0
            boolean[] r2 = new boolean[r1]
            r0.<init>(r2, r1)
            r0.f16451Y = r1
            return
    }

    public C3758c5() {
            r1 = this;
            r0 = 10
            boolean[] r0 = new boolean[r0]
            r1.<init>()
            r1.f16544Z = r0
            r0 = 0
            r1.f16545a0 = r0
            return
    }

    public C3758c5(boolean[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f16544Z = r1
            r0.f16545a0 = r2
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int r6, java.lang.Object r7) {
            r5 = this;
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r5.m8197a()
            if (r6 < 0) goto L45
            int r0 = r5.f16545a0
            if (r6 > r0) goto L45
            boolean[] r1 = r5.f16544Z
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
            boolean[] r1 = r5.f16544Z
            int r2 = r6 + 1
            int r3 = r5.f16545a0
            int r3 = r3 - r6
            java.lang.System.arraycopy(r1, r6, r0, r2, r3)
            r5.f16544Z = r0
        L34:
            boolean[] r0 = r5.f16544Z
            r0[r6] = r7
            int r6 = r5.f16545a0
            int r6 = r6 + 1
            r5.f16545a0 = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            return
        L45:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = r5.m8297h(r6)
            r7.<init>(r6)
            throw r7
    }

    @Override // p185k7.AbstractC3730a5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.m8296e(r1)
            r1 = 1
            return r1
    }

    @Override // p185k7.AbstractC3730a5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Boolean> r6) {
            r5 = this;
            r5.m8197a()
            java.nio.charset.Charset r0 = p185k7.C3871k6.f16722a
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof p185k7.C3758c5
            if (r0 != 0) goto L11
            boolean r6 = super.addAll(r6)
            return r6
        L11:
            k7.c5 r6 = (p185k7.C3758c5) r6
            int r0 = r6.f16545a0
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            int r2 = r5.f16545a0
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r3 - r2
            if (r3 < r0) goto L41
            int r2 = r2 + r0
            boolean[] r0 = r5.f16544Z
            int r3 = r0.length
            if (r2 <= r3) goto L2d
            boolean[] r0 = java.util.Arrays.copyOf(r0, r2)
            r5.f16544Z = r0
        L2d:
            boolean[] r0 = r6.f16544Z
            boolean[] r3 = r5.f16544Z
            int r4 = r5.f16545a0
            int r6 = r6.f16545a0
            java.lang.System.arraycopy(r0, r1, r3, r4, r6)
            r5.f16545a0 = r2
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
    public final void m8296e(boolean r6) {
            r5 = this;
            r5.m8197a()
            int r0 = r5.f16545a0
            boolean[] r1 = r5.f16544Z
            int r2 = r1.length
            if (r0 != r2) goto L19
            r2 = 3
            r3 = 2
            r4 = 1
            int r2 = p121h4.C2484y.m6352a(r0, r2, r3, r4)
            boolean[] r2 = new boolean[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r5.f16544Z = r2
        L19:
            boolean[] r0 = r5.f16544Z
            int r1 = r5.f16545a0
            int r2 = r1 + 1
            r5.f16545a0 = r2
            r0[r1] = r6
            return
    }

    @Override // p185k7.AbstractC3730a5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p185k7.C3758c5
            if (r1 != 0) goto Ld
            boolean r6 = super.equals(r6)
            return r6
        Ld:
            k7.c5 r6 = (p185k7.C3758c5) r6
            int r1 = r5.f16545a0
            int r2 = r6.f16545a0
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            boolean[] r6 = r6.f16544Z
            r1 = 0
        L1a:
            int r2 = r5.f16545a0
            if (r1 >= r2) goto L2a
            boolean[] r2 = r5.f16544Z
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
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r2) {
            r1 = this;
            r1.m8298i(r2)
            boolean[] r0 = r1.f16544Z
            boolean r2 = r0[r2]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    /* renamed from: h */
    public final java.lang.String m8297h(int r5) {
            r4 = this;
            int r0 = r4.f16545a0
            r1 = 35
            java.lang.String r2 = "Index:"
            java.lang.String r3 = ", Size:"
            java.lang.String r5 = p304r4.C5785f.m12134a(r1, r2, r5, r3, r0)
            return r5
    }

    @Override // p185k7.AbstractC3730a5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r3 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r3.f16545a0
            if (r1 >= r2) goto L14
            int r0 = r0 * 31
            boolean[] r2 = r3.f16544Z
            boolean r2 = r2[r1]
            int r2 = p185k7.C3871k6.m8781a(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L14:
            return r0
    }

    /* renamed from: i */
    public final void m8298i(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.f16545a0
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.m8297h(r2)
            r0.<init>(r2)
            throw r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Boolean
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            int r0 = r4.f16545a0
            r2 = 0
        Lf:
            if (r2 >= r0) goto L1b
            boolean[] r3 = r4.f16544Z
            boolean r3 = r3[r2]
            if (r3 != r5) goto L18
            return r2
        L18:
            int r2 = r2 + 1
            goto Lf
        L1b:
            return r1
    }

    @Override // p185k7.InterfaceC3857j6
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ p185k7.InterfaceC3857j6 mo8299k(int r3) {
            r2 = this;
            int r0 = r2.f16545a0
            if (r3 < r0) goto L12
            k7.c5 r0 = new k7.c5
            boolean[] r1 = r2.f16544Z
            boolean[] r3 = java.util.Arrays.copyOf(r1, r3)
            int r1 = r2.f16545a0
            r0.<init>(r3, r1)
            return r0
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    @Override // p185k7.AbstractC3730a5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r5) {
            r4 = this;
            r4.m8197a()
            r4.m8298i(r5)
            boolean[] r0 = r4.f16544Z
            boolean r1 = r0[r5]
            int r2 = r4.f16545a0
            int r3 = r2 + (-1)
            if (r5 >= r3) goto L18
            int r3 = r5 + 1
            int r2 = r2 - r5
            int r2 = r2 + (-1)
            java.lang.System.arraycopy(r0, r3, r0, r5, r2)
        L18:
            int r5 = r4.f16545a0
            int r5 = r5 + (-1)
            r4.f16545a0 = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r3, int r4) {
            r2 = this;
            r2.m8197a()
            if (r4 < r3) goto L1a
            boolean[] r0 = r2.f16544Z
            int r1 = r2.f16545a0
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r0 = r2.f16545a0
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.f16545a0 = r0
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
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.m8197a()
            r2.m8298i(r3)
            boolean[] r0 = r2.f16544Z
            boolean r1 = r0[r3]
            r0[r3] = r4
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.f16545a0
            return r0
    }
}
