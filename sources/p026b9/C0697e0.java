package p026b9;

/* renamed from: b9.e0 */
/* loaded from: classes.dex */
public final class C0697e0<E> extends p026b9.AbstractC0716p<E> {

    /* renamed from: g0 */
    public static final p026b9.C0697e0<java.lang.Object> f3947g0 = null;

    /* renamed from: b0 */
    public final transient java.lang.Object[] f3948b0;

    /* renamed from: c0 */
    public final transient java.lang.Object[] f3949c0;

    /* renamed from: d0 */
    public final transient int f3950d0;

    /* renamed from: e0 */
    public final transient int f3951e0;

    /* renamed from: f0 */
    public final transient int f3952f0;

    static {
            b9.e0 r6 = new b9.e0
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            p026b9.C0697e0.f3947g0 = r6
            return
    }

    public C0697e0(java.lang.Object[] r1, int r2, java.lang.Object[] r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.f3948b0 = r1
            r0.f3949c0 = r3
            r0.f3950d0 = r4
            r0.f3951e0 = r2
            r0.f3952f0 = r5
            return
    }

    @Override // p026b9.AbstractC0710l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.f3949c0
            r1 = 0
            if (r5 == 0) goto L23
            if (r0 != 0) goto L8
            goto L23
        L8:
            int r2 = r5.hashCode()
            int r2 = p124h7.C2939x3.m7289o(r2)
        L10:
            int r3 = r4.f3950d0
            r2 = r2 & r3
            r3 = r0[r2]
            if (r3 != 0) goto L18
            return r1
        L18:
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L20
            r5 = 1
            return r5
        L20:
            int r2 = r2 + 1
            goto L10
        L23:
            return r1
    }

    @Override // p026b9.AbstractC0710l
    /* renamed from: e */
    public int mo2260e(java.lang.Object[] r4, int r5) {
            r3 = this;
            java.lang.Object[] r0 = r3.f3948b0
            int r1 = r3.f3952f0
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r5, r1)
            int r4 = r3.f3952f0
            int r5 = r5 + r4
            return r5
    }

    @Override // p026b9.AbstractC0710l
    /* renamed from: h */
    public java.lang.Object[] mo2261h() {
            r1 = this;
            java.lang.Object[] r0 = r1.f3948b0
            return r0
    }

    @Override // p026b9.AbstractC0716p, java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            int r0 = r1.f3951e0
            return r0
    }

    @Override // p026b9.AbstractC0710l
    /* renamed from: i */
    public int mo2262i() {
            r1 = this;
            int r0 = r1.f3952f0
            return r0
    }

    @Override // p026b9.AbstractC0716p, p026b9.AbstractC0710l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            b9.m0 r0 = r1.mo2270n()
            return r0
    }

    @Override // p026b9.AbstractC0710l
    /* renamed from: l */
    public int mo2263l() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p026b9.AbstractC0710l
    /* renamed from: m */
    public boolean mo2264m() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p026b9.AbstractC0710l
    /* renamed from: n */
    public p026b9.AbstractC0713m0<E> mo2270n() {
            r1 = this;
            b9.n r0 = r1.mo2272a()
            b9.a r0 = r0.m2313A()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            int r0 = r1.f3952f0
            return r0
    }

    @Override // p026b9.AbstractC0716p
    /* renamed from: w */
    public p026b9.AbstractC0714n<E> mo2271w() {
            r2 = this;
            java.lang.Object[] r0 = r2.f3948b0
            int r1 = r2.f3952f0
            b9.n r0 = p026b9.AbstractC0714n.m2309q(r0, r1)
            return r0
    }
}
