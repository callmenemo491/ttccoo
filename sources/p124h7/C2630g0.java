package p124h7;

/* renamed from: h7.g0 */
/* loaded from: classes.dex */
public final class C2630g0<E> extends p124h7.AbstractC2879tf<E> implements java.util.RandomAccess {

    /* renamed from: b0 */
    public static final p124h7.C2630g0<java.lang.Object> f11535b0 = null;

    /* renamed from: Z */
    public E[] f11536Z;

    /* renamed from: a0 */
    public int f11537a0;

    static {
            h7.g0 r0 = new h7.g0
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2, r1)
            p124h7.C2630g0.f11535b0 = r0
            r0.f11928Y = r1
            return
    }

    public C2630g0(E[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f11536Z = r1
            r0.f11537a0 = r2
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r6, E r7) {
            r5 = this;
            r5.m7174a()
            if (r6 < 0) goto L3f
            int r0 = r5.f11537a0
            if (r6 > r0) goto L3f
            E[] r1 = r5.f11536Z
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
            E[] r1 = r5.f11536Z
            int r2 = r6 + 1
            int r3 = r5.f11537a0
            int r3 = r3 - r6
            java.lang.System.arraycopy(r1, r6, r0, r2, r3)
            r5.f11536Z = r0
        L2e:
            E[] r0 = r5.f11536Z
            r0[r6] = r7
            int r6 = r5.f11537a0
            int r6 = r6 + 1
            r5.f11537a0 = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            return
        L3f:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = r5.m6740e(r6)
            r7.<init>(r6)
            throw r7
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E r5) {
            r4 = this;
            r4.m7174a()
            int r0 = r4.f11537a0
            E[] r1 = r4.f11536Z
            int r2 = r1.length
            r3 = 1
            if (r0 != r2) goto L16
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r4.f11536Z = r0
        L16:
            E[] r0 = r4.f11536Z
            int r1 = r4.f11537a0
            int r2 = r1 + 1
            r4.f11537a0 = r2
            r0[r1] = r5
            int r5 = r4.modCount
            int r5 = r5 + r3
            r4.modCount = r5
            return r3
    }

    /* renamed from: e */
    public final java.lang.String m6740e(int r5) {
            r4 = this;
            int r0 = r4.f11537a0
            r1 = 35
            java.lang.String r2 = "Index:"
            java.lang.String r3 = ", Size:"
            java.lang.String r5 = p304r4.C5785f.m12134a(r1, r2, r5, r3, r0)
            return r5
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int r2) {
            r1 = this;
            r1.m6741h(r2)
            E[] r0 = r1.f11536Z
            r2 = r0[r2]
            return r2
    }

    /* renamed from: h */
    public final void m6741h(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.f11537a0
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.m6740e(r2)
            r0.<init>(r2)
            throw r0
    }

    @Override // p124h7.InterfaceC2557c
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2557c mo6521k(int r3) {
            r2 = this;
            int r0 = r2.f11537a0
            if (r3 < r0) goto L12
            E[] r0 = r2.f11536Z
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
            h7.g0 r0 = new h7.g0
            int r1 = r2.f11537a0
            r0.<init>(r3, r1)
            return r0
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    @Override // p124h7.AbstractC2879tf, java.util.AbstractList, java.util.List
    public final E remove(int r5) {
            r4 = this;
            r4.m7174a()
            r4.m6741h(r5)
            E[] r0 = r4.f11536Z
            r1 = r0[r5]
            int r2 = r4.f11537a0
            int r3 = r2 + (-1)
            if (r5 >= r3) goto L18
            int r3 = r5 + 1
            int r2 = r2 - r5
            int r2 = r2 + (-1)
            java.lang.System.arraycopy(r0, r3, r0, r5, r2)
        L18:
            int r5 = r4.f11537a0
            int r5 = r5 + (-1)
            r4.f11537a0 = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int r3, E r4) {
            r2 = this;
            r2.m7174a()
            r2.m6741h(r3)
            E[] r0 = r2.f11536Z
            r1 = r0[r3]
            r0[r3] = r4
            int r3 = r2.modCount
            int r3 = r3 + 1
            r2.modCount = r3
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.f11537a0
            return r0
    }
}
