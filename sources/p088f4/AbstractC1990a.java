package p088f4;

/* renamed from: f4.a */
/* loaded from: classes.dex */
public abstract class AbstractC1990a extends p088f4.AbstractC2031n1 {

    /* renamed from: Z */
    public final int f8771Z;

    /* renamed from: a0 */
    public final p108g5.InterfaceC2265e0 f8772a0;

    /* renamed from: b0 */
    public final boolean f8773b0;

    public AbstractC1990a(boolean r1, p108g5.InterfaceC2265e0 r2) {
            r0 = this;
            r0.<init>()
            r0.f8773b0 = r1
            r0.f8772a0 = r2
            int r1 = r2.mo5996a()
            r0.f8771Z = r1
            return
    }

    /* renamed from: A */
    public final int m5083A(int r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L9
            g5.e0 r2 = r0.f8772a0
            int r1 = r2.mo6001f(r1)
            goto Lf
        L9:
            if (r1 <= 0) goto Le
            int r1 = r1 + (-1)
            goto Lf
        Le:
            r1 = -1
        Lf:
            return r1
    }

    /* renamed from: B */
    public abstract p088f4.AbstractC2031n1 mo5084B(int r1);

    @Override // p088f4.AbstractC2031n1
    /* renamed from: b */
    public int mo5085b(boolean r4) {
            r3 = this;
            int r0 = r3.f8771Z
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r3.f8773b0
            r2 = 0
            if (r0 == 0) goto Lc
            r4 = 0
        Lc:
            if (r4 == 0) goto L14
            g5.e0 r0 = r3.f8772a0
            int r2 = r0.mo6000e()
        L14:
            f4.n1 r0 = r3.mo5084B(r2)
            boolean r0 = r0.m5344r()
            if (r0 == 0) goto L25
            int r2 = r3.m5100z(r2, r4)
            if (r2 != r1) goto L14
            return r1
        L25:
            int r0 = r3.mo5099y(r2)
            f4.n1 r1 = r3.mo5084B(r2)
            int r4 = r1.mo5085b(r4)
            int r4 = r4 + r0
            return r4
    }

    @Override // p088f4.AbstractC2031n1
    /* renamed from: c */
    public final int mo5086c(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof android.util.Pair
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r0 = r4.first
            java.lang.Object r4 = r4.second
            int r0 = r3.mo5094t(r0)
            if (r0 != r1) goto L13
            return r1
        L13:
            f4.n1 r2 = r3.mo5084B(r0)
            int r4 = r2.mo5086c(r4)
            if (r4 != r1) goto L1e
            goto L24
        L1e:
            int r0 = r3.mo5098x(r0)
            int r1 = r0 + r4
        L24:
            return r1
    }

    @Override // p088f4.AbstractC2031n1
    /* renamed from: d */
    public int mo5087d(boolean r4) {
            r3 = this;
            int r0 = r3.f8771Z
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r3.f8773b0
            if (r2 == 0) goto Lb
            r4 = 0
        Lb:
            if (r4 == 0) goto L14
            g5.e0 r0 = r3.f8772a0
            int r0 = r0.mo6002g()
            goto L16
        L14:
            int r0 = r0 + (-1)
        L16:
            f4.n1 r2 = r3.mo5084B(r0)
            boolean r2 = r2.m5344r()
            if (r2 == 0) goto L27
            int r0 = r3.m5083A(r0, r4)
            if (r0 != r1) goto L16
            return r1
        L27:
            int r1 = r3.mo5099y(r0)
            f4.n1 r0 = r3.mo5084B(r0)
            int r4 = r0.mo5087d(r4)
            int r4 = r4 + r1
            return r4
    }

    @Override // p088f4.AbstractC2031n1
    /* renamed from: f */
    public int mo5088f(int r6, int r7, boolean r8) {
            r5 = this;
            boolean r0 = r5.f8773b0
            r1 = 0
            r2 = 2
            if (r0 == 0) goto Lb
            r8 = 1
            if (r7 != r8) goto La
            r7 = 2
        La:
            r8 = 0
        Lb:
            int r0 = r5.mo5096v(r6)
            int r3 = r5.mo5099y(r0)
            f4.n1 r4 = r5.mo5084B(r0)
            int r6 = r6 - r3
            if (r7 != r2) goto L1b
            goto L1c
        L1b:
            r1 = r7
        L1c:
            int r6 = r4.mo5088f(r6, r1, r8)
            r1 = -1
            if (r6 == r1) goto L25
            int r3 = r3 + r6
            return r3
        L25:
            int r6 = r5.m5100z(r0, r8)
        L29:
            if (r6 == r1) goto L3a
            f4.n1 r0 = r5.mo5084B(r6)
            boolean r0 = r0.m5344r()
            if (r0 == 0) goto L3a
            int r6 = r5.m5100z(r6, r8)
            goto L29
        L3a:
            if (r6 == r1) goto L4a
            int r7 = r5.mo5099y(r6)
            f4.n1 r6 = r5.mo5084B(r6)
            int r6 = r6.mo5085b(r8)
            int r6 = r6 + r7
            return r6
        L4a:
            if (r7 != r2) goto L51
            int r6 = r5.mo5085b(r8)
            return r6
        L51:
            return r1
    }

    @Override // p088f4.AbstractC2031n1
    /* renamed from: h */
    public final p088f4.AbstractC2031n1.b mo5089h(int r5, p088f4.AbstractC2031n1.b r6, boolean r7) {
            r4 = this;
            int r0 = r4.mo5095u(r5)
            int r1 = r4.mo5099y(r0)
            int r2 = r4.mo5098x(r0)
            f4.n1 r3 = r4.mo5084B(r0)
            int r5 = r5 - r2
            r3.mo5089h(r5, r6, r7)
            int r5 = r6.f9227a0
            int r5 = r5 + r1
            r6.f9227a0 = r5
            if (r7 == 0) goto L2a
            java.lang.Object r5 = r4.mo5097w(r0)
            java.lang.Object r7 = r6.f9226Z
            java.util.Objects.requireNonNull(r7)
            android.util.Pair r5 = android.util.Pair.create(r5, r7)
            r6.f9226Z = r5
        L2a:
            return r6
    }

    @Override // p088f4.AbstractC2031n1
    /* renamed from: i */
    public final p088f4.AbstractC2031n1.b mo5090i(java.lang.Object r4, p088f4.AbstractC2031n1.b r5) {
            r3 = this;
            r0 = r4
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            int r1 = r3.mo5094t(r1)
            int r2 = r3.mo5099y(r1)
            f4.n1 r1 = r3.mo5084B(r1)
            r1.mo5090i(r0, r5)
            int r0 = r5.f9227a0
            int r0 = r0 + r2
            r5.f9227a0 = r0
            r5.f9226Z = r4
            return r5
    }

    @Override // p088f4.AbstractC2031n1
    /* renamed from: m */
    public int mo5091m(int r6, int r7, boolean r8) {
            r5 = this;
            boolean r0 = r5.f8773b0
            r1 = 0
            r2 = 2
            if (r0 == 0) goto Lb
            r8 = 1
            if (r7 != r8) goto La
            r7 = 2
        La:
            r8 = 0
        Lb:
            int r0 = r5.mo5096v(r6)
            int r3 = r5.mo5099y(r0)
            f4.n1 r4 = r5.mo5084B(r0)
            int r6 = r6 - r3
            if (r7 != r2) goto L1b
            goto L1c
        L1b:
            r1 = r7
        L1c:
            int r6 = r4.mo5091m(r6, r1, r8)
            r1 = -1
            if (r6 == r1) goto L25
            int r3 = r3 + r6
            return r3
        L25:
            int r6 = r5.m5083A(r0, r8)
        L29:
            if (r6 == r1) goto L3a
            f4.n1 r0 = r5.mo5084B(r6)
            boolean r0 = r0.m5344r()
            if (r0 == 0) goto L3a
            int r6 = r5.m5083A(r6, r8)
            goto L29
        L3a:
            if (r6 == r1) goto L4a
            int r7 = r5.mo5099y(r6)
            f4.n1 r6 = r5.mo5084B(r6)
            int r6 = r6.mo5087d(r8)
            int r6 = r6 + r7
            return r6
        L4a:
            if (r7 != r2) goto L51
            int r6 = r5.mo5087d(r8)
            return r6
        L51:
            return r1
    }

    @Override // p088f4.AbstractC2031n1
    /* renamed from: n */
    public final java.lang.Object mo5092n(int r4) {
            r3 = this;
            int r0 = r3.mo5095u(r4)
            int r1 = r3.mo5098x(r0)
            f4.n1 r2 = r3.mo5084B(r0)
            int r4 = r4 - r1
            java.lang.Object r4 = r2.mo5092n(r4)
            java.lang.Object r0 = r3.mo5097w(r0)
            android.util.Pair r4 = android.util.Pair.create(r0, r4)
            return r4
    }

    @Override // p088f4.AbstractC2031n1
    /* renamed from: p */
    public final p088f4.AbstractC2031n1.d mo5093p(int r5, p088f4.AbstractC2031n1.d r6, long r7) {
            r4 = this;
            int r0 = r4.mo5096v(r5)
            int r1 = r4.mo5099y(r0)
            int r2 = r4.mo5098x(r0)
            f4.n1 r3 = r4.mo5084B(r0)
            int r5 = r5 - r1
            r3.mo5093p(r5, r6, r7)
            java.lang.Object r5 = r4.mo5097w(r0)
            java.lang.Object r7 = p088f4.AbstractC2031n1.d.f9236p0
            java.lang.Object r8 = r6.f9240Y
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L23
            goto L29
        L23:
            java.lang.Object r7 = r6.f9240Y
            android.util.Pair r5 = android.util.Pair.create(r5, r7)
        L29:
            r6.f9240Y = r5
            int r5 = r6.f9254m0
            int r5 = r5 + r2
            r6.f9254m0 = r5
            int r5 = r6.f9255n0
            int r5 = r5 + r2
            r6.f9255n0 = r5
            return r6
    }

    /* renamed from: t */
    public abstract int mo5094t(java.lang.Object r1);

    /* renamed from: u */
    public abstract int mo5095u(int r1);

    /* renamed from: v */
    public abstract int mo5096v(int r1);

    /* renamed from: w */
    public abstract java.lang.Object mo5097w(int r1);

    /* renamed from: x */
    public abstract int mo5098x(int r1);

    /* renamed from: y */
    public abstract int mo5099y(int r1);

    /* renamed from: z */
    public final int m5100z(int r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L9
            g5.e0 r2 = r0.f8772a0
            int r1 = r2.mo5998c(r1)
            goto L13
        L9:
            int r2 = r0.f8771Z
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L12
            int r1 = r1 + 1
            goto L13
        L12:
            r1 = -1
        L13:
            return r1
    }
}
