package p124h7;

/* JADX WARN: Unexpected interfaces in signature: [h7.e0] */
/* renamed from: h7.tg */
/* loaded from: classes.dex */
public final class C2880tg extends p124h7.AbstractC2879tf<java.lang.Float> implements java.util.RandomAccess, p124h7.InterfaceC2557c {

    /* renamed from: Z */
    public float[] f11929Z;

    /* renamed from: a0 */
    public int f11930a0;

    static {
            h7.tg r0 = new h7.tg
            r1 = 0
            float[] r2 = new float[r1]
            r0.<init>(r2, r1)
            r0.f11928Y = r1
            return
    }

    public C2880tg() {
            r1 = this;
            r0 = 10
            float[] r0 = new float[r0]
            r1.<init>()
            r1.f11929Z = r0
            r0 = 0
            r1.f11930a0 = r0
            return
    }

    public C2880tg(float[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f11929Z = r1
            r0.f11930a0 = r2
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int r6, java.lang.Object r7) {
            r5 = this;
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r5.m7174a()
            if (r6 < 0) goto L45
            int r0 = r5.f11930a0
            if (r6 > r0) goto L45
            float[] r1 = r5.f11929Z
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
            float[] r0 = new float[r0]
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r6)
            float[] r1 = r5.f11929Z
            int r2 = r6 + 1
            int r3 = r5.f11930a0
            int r3 = r3 - r6
            java.lang.System.arraycopy(r1, r6, r0, r2, r3)
            r5.f11929Z = r0
        L34:
            float[] r0 = r5.f11929Z
            r0[r6] = r7
            int r6 = r5.f11930a0
            int r6 = r6 + 1
            r5.f11930a0 = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            return
        L45:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = r5.m7176h(r6)
            r7.<init>(r6)
            throw r7
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r0.m7175e(r1)
            r1 = 1
            return r1
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Float> r6) {
            r5 = this;
            r5.m7174a()
            java.nio.charset.Charset r0 = p124h7.C2575d.f11429a
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof p124h7.C2880tg
            if (r0 != 0) goto L11
            boolean r6 = super.addAll(r6)
            return r6
        L11:
            h7.tg r6 = (p124h7.C2880tg) r6
            int r0 = r6.f11930a0
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            int r2 = r5.f11930a0
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r3 - r2
            if (r3 < r0) goto L41
            int r2 = r2 + r0
            float[] r0 = r5.f11929Z
            int r3 = r0.length
            if (r2 <= r3) goto L2d
            float[] r0 = java.util.Arrays.copyOf(r0, r2)
            r5.f11929Z = r0
        L2d:
            float[] r0 = r6.f11929Z
            float[] r3 = r5.f11929Z
            int r4 = r5.f11930a0
            int r6 = r6.f11930a0
            java.lang.System.arraycopy(r0, r1, r3, r4, r6)
            r5.f11930a0 = r2
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
    public final void m7175e(float r6) {
            r5 = this;
            r5.m7174a()
            int r0 = r5.f11930a0
            float[] r1 = r5.f11929Z
            int r2 = r1.length
            if (r0 != r2) goto L19
            r2 = 3
            r3 = 2
            r4 = 1
            int r2 = p121h4.C2484y.m6352a(r0, r2, r3, r4)
            float[] r2 = new float[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r5.f11929Z = r2
        L19:
            float[] r0 = r5.f11929Z
            int r1 = r5.f11930a0
            int r2 = r1 + 1
            r5.f11930a0 = r2
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
            boolean r1 = r6 instanceof p124h7.C2880tg
            if (r1 != 0) goto Ld
            boolean r6 = super.equals(r6)
            return r6
        Ld:
            h7.tg r6 = (p124h7.C2880tg) r6
            int r1 = r5.f11930a0
            int r2 = r6.f11930a0
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            float[] r6 = r6.f11929Z
            r1 = 0
        L1a:
            int r2 = r5.f11930a0
            if (r1 >= r2) goto L32
            float[] r2 = r5.f11929Z
            r2 = r2[r1]
            int r2 = java.lang.Float.floatToIntBits(r2)
            r4 = r6[r1]
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r2 == r4) goto L2f
            return r3
        L2f:
            int r1 = r1 + 1
            goto L1a
        L32:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r2) {
            r1 = this;
            r1.m7177i(r2)
            float[] r0 = r1.f11929Z
            r2 = r0[r2]
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
    }

    /* renamed from: h */
    public final java.lang.String m7176h(int r5) {
            r4 = this;
            int r0 = r4.f11930a0
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
            int r2 = r3.f11930a0
            if (r1 >= r2) goto L14
            int r0 = r0 * 31
            float[] r2 = r3.f11929Z
            r2 = r2[r1]
            int r2 = java.lang.Float.floatToIntBits(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L14:
            return r0
    }

    /* renamed from: i */
    public final void m7177i(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.f11930a0
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.m7176h(r2)
            r0.<init>(r2)
            throw r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Float
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            int r0 = r4.f11930a0
            r2 = 0
        Lf:
            if (r2 >= r0) goto L1d
            float[] r3 = r4.f11929Z
            r3 = r3[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L1a
            return r2
        L1a:
            int r2 = r2 + 1
            goto Lf
        L1d:
            return r1
    }

    @Override // p124h7.InterfaceC2557c
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2557c mo6521k(int r3) {
            r2 = this;
            int r0 = r2.f11930a0
            if (r3 < r0) goto L12
            h7.tg r0 = new h7.tg
            float[] r1 = r2.f11929Z
            float[] r3 = java.util.Arrays.copyOf(r1, r3)
            int r1 = r2.f11930a0
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
            r4.m7177i(r5)
            float[] r0 = r4.f11929Z
            r1 = r0[r5]
            int r2 = r4.f11930a0
            int r3 = r2 + (-1)
            if (r5 >= r3) goto L18
            int r3 = r5 + 1
            int r2 = r2 - r5
            int r2 = r2 + (-1)
            java.lang.System.arraycopy(r0, r3, r0, r5, r2)
        L18:
            int r5 = r4.f11930a0
            int r5 = r5 + (-1)
            r4.f11930a0 = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            return r5
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r3, int r4) {
            r2 = this;
            r2.m7174a()
            if (r4 < r3) goto L1a
            float[] r0 = r2.f11929Z
            int r1 = r2.f11930a0
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r0 = r2.f11930a0
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.f11930a0 = r0
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
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r2.m7174a()
            r2.m7177i(r3)
            float[] r0 = r2.f11929Z
            r1 = r0[r3]
            r0[r3] = r4
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.f11930a0
            return r0
    }
}
