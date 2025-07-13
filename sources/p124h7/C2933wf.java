package p124h7;

/* JADX WARN: Unexpected interfaces in signature: [h7.e0] */
/* renamed from: h7.wf */
/* loaded from: classes.dex */
public final class C2933wf extends p124h7.AbstractC2879tf<java.lang.Boolean> implements java.util.RandomAccess, p124h7.InterfaceC2557c {

    /* renamed from: Z */
    public boolean[] f12009Z;

    /* renamed from: a0 */
    public int f12010a0;

    static {
            h7.wf r0 = new h7.wf
            r1 = 0
            boolean[] r2 = new boolean[r1]
            r0.<init>(r2, r1)
            r0.f11928Y = r1
            return
    }

    public C2933wf() {
            r1 = this;
            r0 = 10
            boolean[] r0 = new boolean[r0]
            r1.<init>()
            r1.f12009Z = r0
            r0 = 0
            r1.f12010a0 = r0
            return
    }

    public C2933wf(boolean[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f12009Z = r1
            r0.f12010a0 = r2
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int r6, java.lang.Object r7) {
            r5 = this;
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r5.m7174a()
            if (r6 < 0) goto L45
            int r0 = r5.f12010a0
            if (r6 > r0) goto L45
            boolean[] r1 = r5.f12009Z
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
            boolean[] r1 = r5.f12009Z
            int r2 = r6 + 1
            int r3 = r5.f12010a0
            int r3 = r3 - r6
            java.lang.System.arraycopy(r1, r6, r0, r2, r3)
            r5.f12009Z = r0
        L34:
            boolean[] r0 = r5.f12009Z
            r0[r6] = r7
            int r6 = r5.f12010a0
            int r6 = r6 + 1
            r5.f12010a0 = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            return
        L45:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = r5.m7241h(r6)
            r7.<init>(r6)
            throw r7
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.m7240e(r1)
            r1 = 1
            return r1
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Boolean> r6) {
            r5 = this;
            r5.m7174a()
            java.nio.charset.Charset r0 = p124h7.C2575d.f11429a
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof p124h7.C2933wf
            if (r0 != 0) goto L11
            boolean r6 = super.addAll(r6)
            return r6
        L11:
            h7.wf r6 = (p124h7.C2933wf) r6
            int r0 = r6.f12010a0
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            int r2 = r5.f12010a0
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r3 - r2
            if (r3 < r0) goto L41
            int r2 = r2 + r0
            boolean[] r0 = r5.f12009Z
            int r3 = r0.length
            if (r2 <= r3) goto L2d
            boolean[] r0 = java.util.Arrays.copyOf(r0, r2)
            r5.f12009Z = r0
        L2d:
            boolean[] r0 = r6.f12009Z
            boolean[] r3 = r5.f12009Z
            int r4 = r5.f12010a0
            int r6 = r6.f12010a0
            java.lang.System.arraycopy(r0, r1, r3, r4, r6)
            r5.f12010a0 = r2
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
    public final void m7240e(boolean r6) {
            r5 = this;
            r5.m7174a()
            int r0 = r5.f12010a0
            boolean[] r1 = r5.f12009Z
            int r2 = r1.length
            if (r0 != r2) goto L19
            r2 = 3
            r3 = 2
            r4 = 1
            int r2 = p121h4.C2484y.m6352a(r0, r2, r3, r4)
            boolean[] r2 = new boolean[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r5.f12009Z = r2
        L19:
            boolean[] r0 = r5.f12009Z
            int r1 = r5.f12010a0
            int r2 = r1 + 1
            r5.f12010a0 = r2
            r0[r1] = r6
            return
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p124h7.C2933wf
            if (r1 != 0) goto Ld
            boolean r6 = super.equals(r6)
            return r6
        Ld:
            h7.wf r6 = (p124h7.C2933wf) r6
            int r1 = r5.f12010a0
            int r2 = r6.f12010a0
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            boolean[] r6 = r6.f12009Z
            r1 = 0
        L1a:
            int r2 = r5.f12010a0
            if (r1 >= r2) goto L2a
            boolean[] r2 = r5.f12009Z
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
            r1.m7242i(r2)
            boolean[] r0 = r1.f12009Z
            boolean r2 = r0[r2]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    /* renamed from: h */
    public final java.lang.String m7241h(int r5) {
            r4 = this;
            int r0 = r4.f12010a0
            r1 = 35
            java.lang.String r2 = "Index:"
            java.lang.String r3 = ", Size:"
            java.lang.String r5 = p304r4.C5785f.m12134a(r1, r2, r5, r3, r0)
            return r5
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r3 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r3.f12010a0
            if (r1 >= r2) goto L14
            int r0 = r0 * 31
            boolean[] r2 = r3.f12009Z
            boolean r2 = r2[r1]
            int r2 = p124h7.C2575d.m6538a(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L14:
            return r0
    }

    /* renamed from: i */
    public final void m7242i(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.f12010a0
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.m7241h(r2)
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
            int r0 = r4.f12010a0
            r2 = 0
        Lf:
            if (r2 >= r0) goto L1b
            boolean[] r3 = r4.f12009Z
            boolean r3 = r3[r2]
            if (r3 != r5) goto L18
            return r2
        L18:
            int r2 = r2 + 1
            goto Lf
        L1b:
            return r1
    }

    @Override // p124h7.InterfaceC2557c
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2557c mo6521k(int r3) {
            r2 = this;
            int r0 = r2.f12010a0
            if (r3 < r0) goto L12
            h7.wf r0 = new h7.wf
            boolean[] r1 = r2.f12009Z
            boolean[] r3 = java.util.Arrays.copyOf(r1, r3)
            int r1 = r2.f12010a0
            r0.<init>(r3, r1)
            return r0
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r5) {
            r4 = this;
            r4.m7174a()
            r4.m7242i(r5)
            boolean[] r0 = r4.f12009Z
            boolean r1 = r0[r5]
            int r2 = r4.f12010a0
            int r3 = r2 + (-1)
            if (r5 >= r3) goto L18
            int r3 = r5 + 1
            int r2 = r2 - r5
            int r2 = r2 + (-1)
            java.lang.System.arraycopy(r0, r3, r0, r5, r2)
        L18:
            int r5 = r4.f12010a0
            int r5 = r5 + (-1)
            r4.f12010a0 = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r3, int r4) {
            r2 = this;
            r2.m7174a()
            if (r4 < r3) goto L1a
            boolean[] r0 = r2.f12009Z
            int r1 = r2.f12010a0
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r0 = r2.f12010a0
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.f12010a0 = r0
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
            r2.m7174a()
            r2.m7242i(r3)
            boolean[] r0 = r2.f12009Z
            boolean r1 = r0[r3]
            r0[r3] = r4
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.f12010a0
            return r0
    }
}
