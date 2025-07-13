package p088f4;

/* renamed from: f4.g */
/* loaded from: classes.dex */
public abstract class AbstractC2008g implements p088f4.InterfaceC2004e1, p088f4.InterfaceC2007f1 {

    /* renamed from: Y */
    public final int f8947Y;

    /* renamed from: Z */
    public final androidx.appcompat.widget.C0311x f8948Z;

    /* renamed from: a0 */
    public p088f4.C2010g1 f8949a0;

    /* renamed from: b0 */
    public int f8950b0;

    /* renamed from: c0 */
    public int f8951c0;

    /* renamed from: d0 */
    public p108g5.InterfaceC2261c0 f8952d0;

    /* renamed from: e0 */
    public p088f4.C2003e0[] f8953e0;

    /* renamed from: f0 */
    public long f8954f0;

    /* renamed from: g0 */
    public long f8955g0;

    /* renamed from: h0 */
    public boolean f8956h0;

    /* renamed from: i0 */
    public boolean f8957i0;

    public AbstractC2008g(int r3) {
            r2 = this;
            r2.<init>()
            r2.f8947Y = r3
            androidx.appcompat.widget.x r3 = new androidx.appcompat.widget.x
            r0 = 7
            r3.<init>(r0)
            r2.f8948Z = r3
            r0 = -9223372036854775808
            r2.f8955g0 = r0
            return
    }

    /* renamed from: A */
    public final p088f4.C2038q m5241A(java.lang.Throwable r2, p088f4.C2003e0 r3, int r4) {
            r1 = this;
            r0 = 0
            f4.q r2 = r1.m5242B(r2, r3, r0, r4)
            return r2
    }

    /* renamed from: B */
    public final p088f4.C2038q m5242B(java.lang.Throwable r14, p088f4.C2003e0 r15, boolean r16, int r17) {
            r13 = this;
            r1 = r13
            r0 = r15
            r2 = 4
            if (r0 == 0) goto L1d
            boolean r3 = r1.f8957i0
            if (r3 != 0) goto L1d
            r3 = 1
            r1.f8957i0 = r3
            r3 = 0
            int r4 = r13.mo5239f(r15)     // Catch: java.lang.Throwable -> L16 p088f4.C2038q -> L1b
            r4 = r4 & 7
            r1.f8957i0 = r3
            goto L1e
        L16:
            r0 = move-exception
            r2 = r0
            r1.f8957i0 = r3
            throw r2
        L1b:
            r1.f8957i0 = r3
        L1d:
            r4 = 4
        L1e:
            java.lang.String r7 = r13.mo5195a()
            int r8 = r1.f8950b0
            f4.q r12 = new f4.q
            if (r0 != 0) goto L2a
            r10 = 4
            goto L2b
        L2a:
            r10 = r4
        L2b:
            r3 = 1
            r5 = 0
            r2 = r12
            r4 = r14
            r6 = r17
            r9 = r15
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
    }

    /* renamed from: C */
    public final androidx.appcompat.widget.C0311x m5243C() {
            r1 = this;
            androidx.appcompat.widget.x r0 = r1.f8948Z
            r0.m819j()
            androidx.appcompat.widget.x r0 = r1.f8948Z
            return r0
    }

    /* renamed from: D */
    public abstract void mo5244D();

    /* renamed from: E */
    public void mo5245E(boolean r1, boolean r2) {
            r0 = this;
            return
    }

    /* renamed from: F */
    public abstract void mo5246F(long r1, boolean r3);

    /* renamed from: G */
    public void mo5247G() {
            r0 = this;
            return
    }

    /* renamed from: H */
    public void mo5248H() {
            r0 = this;
            return
    }

    /* renamed from: I */
    public void mo5249I() {
            r0 = this;
            return
    }

    /* renamed from: J */
    public abstract void mo5250J(p088f4.C2003e0[] r1, long r2, long r4);

    /* renamed from: K */
    public final int m5251K(androidx.appcompat.widget.C0311x r6, p142i4.C3073g r7, int r8) {
            r5 = this;
            g5.c0 r0 = r5.f8952d0
            java.util.Objects.requireNonNull(r0)
            int r8 = r0.mo5965a(r6, r7, r8)
            r0 = -4
            if (r8 != r0) goto L2d
            boolean r6 = r7.m7517r()
            if (r6 == 0) goto L1d
            r6 = -9223372036854775808
            r5.f8955g0 = r6
            boolean r6 = r5.f8956h0
            if (r6 == 0) goto L1b
            goto L1c
        L1b:
            r0 = -3
        L1c:
            return r0
        L1d:
            long r0 = r7.f12360c0
            long r2 = r5.f8954f0
            long r0 = r0 + r2
            r7.f12360c0 = r0
            long r6 = r5.f8955g0
            long r6 = java.lang.Math.max(r6, r0)
            r5.f8955g0 = r6
            goto L53
        L2d:
            r7 = -5
            if (r8 != r7) goto L53
            java.lang.Object r7 = r6.f1482a0
            f4.e0 r7 = (p088f4.C2003e0) r7
            java.util.Objects.requireNonNull(r7)
            long r0 = r7.f8900n0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L53
            f4.e0$b r0 = r7.m5191a()
            long r1 = r7.f8900n0
            long r3 = r5.f8954f0
            long r1 = r1 + r3
            r0.f8931o = r1
            f4.e0 r7 = r0.m5193a()
            r6.f1482a0 = r7
        L53:
            return r8
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: b */
    public final void mo5196b() {
            r1 = this;
            int r0 = r1.f8951c0
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            p371v5.C6549a.m13291e(r0)
            androidx.appcompat.widget.x r0 = r1.f8948Z
            r0.m819j()
            r1.mo5247G()
            return
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: g */
    public final void mo5198g(int r1) {
            r0 = this;
            r0.f8950b0 = r1
            return
    }

    @Override // p088f4.InterfaceC2004e1
    public final int getState() {
            r1 = this;
            int r0 = r1.f8951c0
            return r0
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: h */
    public final void mo5199h() {
            r3 = this;
            int r0 = r3.f8951c0
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            p371v5.C6549a.m13291e(r1)
            androidx.appcompat.widget.x r0 = r3.f8948Z
            r0.m819j()
            r3.f8951c0 = r2
            r0 = 0
            r3.f8952d0 = r0
            r3.f8953e0 = r0
            r3.f8956h0 = r2
            r3.mo5244D()
            return
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: j */
    public final boolean mo5201j() {
            r5 = this;
            long r0 = r5.f8955g0
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: k */
    public final void mo5202k(p088f4.C2010g1 r10, p088f4.C2003e0[] r11, p108g5.InterfaceC2261c0 r12, long r13, boolean r15, boolean r16, long r17, long r19) {
            r9 = this;
            r7 = r9
            r8 = r15
            int r0 = r7.f8951c0
            r1 = 1
            if (r0 != 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            p371v5.C6549a.m13291e(r0)
            r0 = r10
            r7.f8949a0 = r0
            r7.f8951c0 = r1
            r0 = r16
            r9.mo5245E(r15, r0)
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r17
            r5 = r19
            r0.mo5204o(r1, r2, r3, r5)
            r0 = r13
            r9.mo5246F(r13, r15)
            return
    }

    @Override // p088f4.InterfaceC2007f1
    /* renamed from: l */
    public int mo5240l() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p088f4.C1992a1.b
    /* renamed from: n */
    public void mo5108n(int r1, java.lang.Object r2) {
            r0 = this;
            return
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: o */
    public final void mo5204o(p088f4.C2003e0[] r7, p108g5.InterfaceC2261c0 r8, long r9, long r11) {
            r6 = this;
            boolean r0 = r6.f8956h0
            r0 = r0 ^ 1
            p371v5.C6549a.m13291e(r0)
            r6.f8952d0 = r8
            long r0 = r6.f8955g0
            r2 = -9223372036854775808
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L13
            r6.f8955g0 = r9
        L13:
            r6.f8953e0 = r7
            r6.f8954f0 = r11
            r0 = r6
            r1 = r7
            r2 = r9
            r4 = r11
            r0.mo5250J(r1, r2, r4)
            return
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: p */
    public final p108g5.InterfaceC2261c0 mo5205p() {
            r1 = this;
            g5.c0 r0 = r1.f8952d0
            return r0
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: q */
    public final void mo5206q() {
            r1 = this;
            r0 = 1
            r1.f8956h0 = r0
            return
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: r */
    public final void mo5207r() {
            r1 = this;
            g5.c0 r0 = r1.f8952d0
            java.util.Objects.requireNonNull(r0)
            r0.mo5966b()
            return
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: s */
    public final long mo5208s() {
            r2 = this;
            long r0 = r2.f8955g0
            return r0
    }

    @Override // p088f4.InterfaceC2004e1
    public final void start() {
            r2 = this;
            int r0 = r2.f8951c0
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            p371v5.C6549a.m13291e(r1)
            r0 = 2
            r2.f8951c0 = r0
            r2.mo5248H()
            return
    }

    @Override // p088f4.InterfaceC2004e1
    public final void stop() {
            r3 = this;
            int r0 = r3.f8951c0
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            p371v5.C6549a.m13291e(r0)
            r3.f8951c0 = r1
            r3.mo5249I()
            return
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: t */
    public final void mo5209t(long r2) {
            r1 = this;
            r0 = 0
            r1.f8956h0 = r0
            r1.f8955g0 = r2
            r1.mo5246F(r2, r0)
            return
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: u */
    public final boolean mo5210u() {
            r1 = this;
            boolean r0 = r1.f8956h0
            return r0
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: v */
    public p371v5.InterfaceC6566p mo5211v() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: w */
    public final int mo5212w() {
            r1 = this;
            int r0 = r1.f8947Y
            return r0
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: x */
    public final p088f4.InterfaceC2007f1 mo5213x() {
            r0 = this;
            return r0
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: z */
    public /* synthetic */ void mo5214z(float r1, float r2) {
            r0 = this;
            p088f4.C2001d1.m5183a(r0, r1, r2)
            return
    }
}
