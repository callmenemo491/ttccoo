package p088f4;

/* renamed from: f4.f */
/* loaded from: classes.dex */
public abstract class AbstractC2005f implements p088f4.InterfaceC2054x0 {

    /* renamed from: a */
    public final p088f4.AbstractC2031n1.d f8943a;

    public AbstractC2005f() {
            r1 = this;
            r1.<init>()
            f4.n1$d r0 = new f4.n1$d
            r0.<init>()
            r1.f8943a = r0
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: B */
    public final boolean mo5215B() {
            r2 = this;
            int r0 = r2.mo2850n()
            r1 = 3
            if (r0 != r1) goto L15
            boolean r0 = r2.mo2862u()
            if (r0 == 0) goto L15
            int r0 = r2.mo2827K()
            if (r0 != 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: D */
    public final void mo5216D() {
            r3 = this;
            int r0 = r3.mo2824F()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.mo2857r(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: G */
    public final boolean mo5217G(int r2) {
            r1 = this;
            f4.x0$b r0 = r1.mo2859s()
            v5.k r0 = r0.f9379Y
            android.util.SparseBooleanArray r0 = r0.f25655a
            boolean r2 = r0.get(r2)
            return r2
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: J */
    public final boolean mo5218J() {
            r3 = this;
            f4.n1 r0 = r3.mo2829M()
            boolean r1 = r0.m5344r()
            if (r1 != 0) goto L1a
            int r1 = r3.mo2824F()
            f4.n1$d r2 = r3.f8943a
            f4.n1$d r0 = r0.m5343o(r1, r2)
            boolean r0 = r0.f9248g0
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    @java.lang.Deprecated
    /* renamed from: R */
    public final int mo5219R() {
            r1 = this;
            int r0 = r1.mo2824F()
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: S */
    public final void mo5220S() {
            r4 = this;
            f4.n1 r0 = r4.mo2829M()
            boolean r0 = r0.m5344r()
            if (r0 != 0) goto L3a
            boolean r0 = r4.mo2840h()
            if (r0 == 0) goto L11
            goto L3a
        L11:
            boolean r0 = r4.m5227b0()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L27
            int r0 = r4.m5225Z()
            r3 = -1
            if (r0 == r3) goto L3a
            r4.mo2857r(r0, r1)
            goto L3a
        L27:
            boolean r0 = r4.m5230d0()
            if (r0 == 0) goto L3a
            boolean r0 = r4.mo5218J()
            if (r0 == 0) goto L3a
            int r0 = r4.mo2824F()
            r4.mo2857r(r0, r1)
        L3a:
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: T */
    public final void mo5221T() {
            r2 = this;
            long r0 = r2.mo2844k()
            r2.m5232f0(r0)
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: U */
    public final void mo5222U() {
            r2 = this;
            long r0 = r2.mo2835X()
            long r0 = -r0
            r2.m5232f0(r0)
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: V */
    public final void mo5223V() {
            r8 = this;
            f4.n1 r0 = r8.mo2829M()
            boolean r0 = r0.m5344r()
            if (r0 != 0) goto L51
            boolean r0 = r8.mo2840h()
            if (r0 == 0) goto L11
            goto L51
        L11:
            boolean r0 = r8.m5228c0()
            boolean r1 = r8.m5230d0()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = -1
            if (r1 == 0) goto L30
            boolean r1 = r8.m5231e0()
            if (r1 != 0) goto L30
            if (r0 == 0) goto L51
            int r0 = r8.m5226a0()
            if (r0 == r4) goto L51
            goto L44
        L30:
            if (r0 == 0) goto L48
            long r0 = r8.mo2834W()
            long r5 = r8.mo2865z()
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 > 0) goto L48
            int r0 = r8.m5226a0()
            if (r0 == r4) goto L51
        L44:
            r8.mo2857r(r0, r2)
            goto L51
        L48:
            r0 = 0
            int r2 = r8.mo2824F()
            r8.mo2857r(r2, r0)
        L51:
            return
    }

    /* renamed from: Y */
    public final long m5224Y() {
            r3 = this;
            f4.n1 r0 = r3.mo2829M()
            boolean r1 = r0.m5344r()
            if (r1 == 0) goto L10
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L1e
        L10:
            int r1 = r3.mo2824F()
            f4.n1$d r2 = r3.f8943a
            f4.n1$d r0 = r0.m5343o(r1, r2)
            long r0 = r0.m5354b()
        L1e:
            return r0
    }

    /* renamed from: Z */
    public final int m5225Z() {
            r4 = this;
            f4.n1 r0 = r4.mo2829M()
            boolean r1 = r0.m5344r()
            if (r1 == 0) goto Lc
            r0 = -1
            goto L20
        Lc:
            int r1 = r4.mo2824F()
            int r2 = r4.mo2821A()
            r3 = 1
            if (r2 != r3) goto L18
            r2 = 0
        L18:
            boolean r3 = r4.mo2831O()
            int r0 = r0.mo5088f(r1, r2, r3)
        L20:
            return r0
    }

    /* renamed from: a0 */
    public final int m5226a0() {
            r4 = this;
            f4.n1 r0 = r4.mo2829M()
            boolean r1 = r0.m5344r()
            if (r1 == 0) goto Lc
            r0 = -1
            goto L20
        Lc:
            int r1 = r4.mo2824F()
            int r2 = r4.mo2821A()
            r3 = 1
            if (r2 != r3) goto L18
            r2 = 0
        L18:
            boolean r3 = r4.mo2831O()
            int r0 = r0.mo5091m(r1, r2, r3)
        L20:
            return r0
    }

    /* renamed from: b0 */
    public final boolean m5227b0() {
            r2 = this;
            int r0 = r2.m5225Z()
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    /* renamed from: c0 */
    public final boolean m5228c0() {
            r2 = this;
            int r0 = r2.m5226a0()
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    /* renamed from: d */
    public p088f4.InterfaceC2054x0.b m5229d(p088f4.InterfaceC2054x0.b r5) {
            r4 = this;
            f4.x0$b$a r0 = new f4.x0$b$a
            r0.<init>()
            r0.m5419a(r5)
            boolean r5 = r4.mo2840h()
            r1 = 1
            r5 = r5 ^ r1
            r2 = 4
            r0.m5420b(r2, r5)
            r5 = 5
            boolean r2 = r4.m5231e0()
            r3 = 0
            if (r2 == 0) goto L22
            boolean r2 = r4.mo2840h()
            if (r2 != 0) goto L22
            r2 = 1
            goto L23
        L22:
            r2 = 0
        L23:
            r0.m5420b(r5, r2)
            r5 = 6
            boolean r2 = r4.m5228c0()
            if (r2 == 0) goto L35
            boolean r2 = r4.mo2840h()
            if (r2 != 0) goto L35
            r2 = 1
            goto L36
        L35:
            r2 = 0
        L36:
            r0.m5420b(r5, r2)
            r5 = 7
            f4.n1 r2 = r4.mo2829M()
            boolean r2 = r2.m5344r()
            if (r2 != 0) goto L5e
            boolean r2 = r4.m5228c0()
            if (r2 != 0) goto L56
            boolean r2 = r4.m5230d0()
            if (r2 == 0) goto L56
            boolean r2 = r4.m5231e0()
            if (r2 == 0) goto L5e
        L56:
            boolean r2 = r4.mo2840h()
            if (r2 != 0) goto L5e
            r2 = 1
            goto L5f
        L5e:
            r2 = 0
        L5f:
            r0.m5420b(r5, r2)
            r5 = 8
            boolean r2 = r4.m5227b0()
            if (r2 == 0) goto L72
            boolean r2 = r4.mo2840h()
            if (r2 != 0) goto L72
            r2 = 1
            goto L73
        L72:
            r2 = 0
        L73:
            r0.m5420b(r5, r2)
            r5 = 9
            f4.n1 r2 = r4.mo2829M()
            boolean r2 = r2.m5344r()
            if (r2 != 0) goto L9c
            boolean r2 = r4.m5227b0()
            if (r2 != 0) goto L94
            boolean r2 = r4.m5230d0()
            if (r2 == 0) goto L9c
            boolean r2 = r4.mo5218J()
            if (r2 == 0) goto L9c
        L94:
            boolean r2 = r4.mo2840h()
            if (r2 != 0) goto L9c
            r2 = 1
            goto L9d
        L9c:
            r2 = 0
        L9d:
            r0.m5420b(r5, r2)
            r5 = 10
            boolean r2 = r4.mo2840h()
            r2 = r2 ^ r1
            r0.m5420b(r5, r2)
            r5 = 11
            boolean r2 = r4.m5231e0()
            if (r2 == 0) goto Lba
            boolean r2 = r4.mo2840h()
            if (r2 != 0) goto Lba
            r2 = 1
            goto Lbb
        Lba:
            r2 = 0
        Lbb:
            r0.m5420b(r5, r2)
            r5 = 12
            boolean r2 = r4.m5231e0()
            if (r2 == 0) goto Lcd
            boolean r2 = r4.mo2840h()
            if (r2 != 0) goto Lcd
            goto Lce
        Lcd:
            r1 = 0
        Lce:
            r0.m5420b(r5, r1)
            f4.x0$b r5 = r0.m5421c()
            return r5
    }

    /* renamed from: d0 */
    public final boolean m5230d0() {
            r3 = this;
            f4.n1 r0 = r3.mo2829M()
            boolean r1 = r0.m5344r()
            if (r1 != 0) goto L1c
            int r1 = r3.mo2824F()
            f4.n1$d r2 = r3.f8943a
            f4.n1$d r0 = r0.m5343o(r1, r2)
            boolean r0 = r0.m5355c()
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    /* renamed from: e0 */
    public final boolean m5231e0() {
            r3 = this;
            f4.n1 r0 = r3.mo2829M()
            boolean r1 = r0.m5344r()
            if (r1 != 0) goto L1a
            int r1 = r3.mo2824F()
            f4.n1$d r2 = r3.f8943a
            f4.n1$d r0 = r0.m5343o(r1, r2)
            boolean r0 = r0.f9247f0
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    /* renamed from: f0 */
    public final void m5232f0(long r6) {
            r5 = this;
            long r0 = r5.mo2834W()
            long r0 = r0 + r6
            long r6 = r5.mo2828L()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L16
            long r0 = java.lang.Math.min(r0, r6)
        L16:
            r6 = 0
            long r6 = java.lang.Math.max(r0, r6)
            int r0 = r5.mo2824F()
            r5.mo2857r(r0, r6)
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: i */
    public final void mo5233i(int r3) {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.mo2857r(r3, r0)
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: j */
    public final void mo5234j() {
            r1 = this;
            r0 = 0
            r1.mo2839g(r0)
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: p */
    public final void mo5235p() {
            r1 = this;
            r0 = 1
            r1.mo2839g(r0)
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: v */
    public final void mo5236v() {
            r2 = this;
            r0 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2.mo2832P(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: w */
    public final p088f4.C2018j0 mo5237w() {
            r3 = this;
            f4.n1 r0 = r3.mo2829M()
            boolean r1 = r0.m5344r()
            if (r1 == 0) goto Lc
            r0 = 0
            goto L18
        Lc:
            int r1 = r3.mo2824F()
            f4.n1$d r2 = r3.f8943a
            f4.n1$d r0 = r0.m5343o(r1, r2)
            f4.j0 r0 = r0.f9242a0
        L18:
            return r0
    }
}
