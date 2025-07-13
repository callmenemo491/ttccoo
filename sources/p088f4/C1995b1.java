package p088f4;

/* renamed from: f4.b1 */
/* loaded from: classes.dex */
public final class C1995b1 extends p088f4.AbstractC1990a {

    /* renamed from: c0 */
    public final int f8857c0;

    /* renamed from: d0 */
    public final int f8858d0;

    /* renamed from: e0 */
    public final int[] f8859e0;

    /* renamed from: f0 */
    public final int[] f8860f0;

    /* renamed from: g0 */
    public final p088f4.AbstractC2031n1[] f8861g0;

    /* renamed from: h0 */
    public final java.lang.Object[] f8862h0;

    /* renamed from: i0 */
    public final java.util.HashMap<java.lang.Object, java.lang.Integer> f8863i0;

    public C1995b1(java.util.Collection<? extends p088f4.InterfaceC2036p0> r6, p108g5.InterfaceC2265e0 r7) {
            r5 = this;
            r0 = 0
            r5.<init>(r0, r7)
            int r7 = r6.size()
            int[] r1 = new int[r7]
            r5.f8859e0 = r1
            int[] r1 = new int[r7]
            r5.f8860f0 = r1
            f4.n1[] r1 = new p088f4.AbstractC2031n1[r7]
            r5.f8861g0 = r1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r5.f8862h0 = r7
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r5.f8863i0 = r7
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
            r1 = 0
        L25:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r6.next()
            f4.p0 r2 = (p088f4.InterfaceC2036p0) r2
            f4.n1[] r3 = r5.f8861g0
            f4.n1 r4 = r2.mo5379b()
            r3[r1] = r4
            int[] r3 = r5.f8860f0
            r3[r1] = r0
            int[] r3 = r5.f8859e0
            r3[r1] = r7
            f4.n1[] r3 = r5.f8861g0
            r3 = r3[r1]
            int r3 = r3.mo5180q()
            int r0 = r0 + r3
            f4.n1[] r3 = r5.f8861g0
            r3 = r3[r1]
            int r3 = r3.mo5179j()
            int r7 = r7 + r3
            java.lang.Object[] r3 = r5.f8862h0
            java.lang.Object r2 = r2.mo5378a()
            r3[r1] = r2
            java.util.HashMap<java.lang.Object, java.lang.Integer> r2 = r5.f8863i0
            java.lang.Object[] r3 = r5.f8862h0
            r3 = r3[r1]
            int r4 = r1 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.put(r3, r1)
            r1 = r4
            goto L25
        L6c:
            r5.f8857c0 = r0
            r5.f8858d0 = r7
            return
    }

    @Override // p088f4.AbstractC1990a
    /* renamed from: B */
    public p088f4.AbstractC2031n1 mo5084B(int r2) {
            r1 = this;
            f4.n1[] r0 = r1.f8861g0
            r2 = r0[r2]
            return r2
    }

    @Override // p088f4.AbstractC2031n1
    /* renamed from: j */
    public int mo5179j() {
            r1 = this;
            int r0 = r1.f8858d0
            return r0
    }

    @Override // p088f4.AbstractC2031n1
    /* renamed from: q */
    public int mo5180q() {
            r1 = this;
            int r0 = r1.f8857c0
            return r0
    }

    @Override // p088f4.AbstractC1990a
    /* renamed from: t */
    public int mo5094t(java.lang.Object r2) {
            r1 = this;
            java.util.HashMap<java.lang.Object, java.lang.Integer> r0 = r1.f8863i0
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto Lc
            r2 = -1
            goto L10
        Lc:
            int r2 = r2.intValue()
        L10:
            return r2
    }

    @Override // p088f4.AbstractC1990a
    /* renamed from: u */
    public int mo5095u(int r3) {
            r2 = this;
            int[] r0 = r2.f8859e0
            int r3 = r3 + 1
            r1 = 0
            int r3 = p371v5.C6552b0.m13311d(r0, r3, r1, r1)
            return r3
    }

    @Override // p088f4.AbstractC1990a
    /* renamed from: v */
    public int mo5096v(int r3) {
            r2 = this;
            int[] r0 = r2.f8860f0
            int r3 = r3 + 1
            r1 = 0
            int r3 = p371v5.C6552b0.m13311d(r0, r3, r1, r1)
            return r3
    }

    @Override // p088f4.AbstractC1990a
    /* renamed from: w */
    public java.lang.Object mo5097w(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f8862h0
            r2 = r0[r2]
            return r2
    }

    @Override // p088f4.AbstractC1990a
    /* renamed from: x */
    public int mo5098x(int r2) {
            r1 = this;
            int[] r0 = r1.f8859e0
            r2 = r0[r2]
            return r2
    }

    @Override // p088f4.AbstractC1990a
    /* renamed from: y */
    public int mo5099y(int r2) {
            r1 = this;
            int[] r0 = r1.f8860f0
            r2 = r0[r2]
            return r2
    }
}
