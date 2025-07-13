package p108g5;

/* renamed from: g5.z */
/* loaded from: classes.dex */
public final class C2291z extends p108g5.AbstractC2256a implements p108g5.C2290y.b {

    /* renamed from: g */
    public final p088f4.C2018j0 f10502g;

    /* renamed from: h */
    public final p088f4.C2018j0.h f10503h;

    /* renamed from: i */
    public final p352u5.InterfaceC6320i.a f10504i;

    /* renamed from: j */
    public final p108g5.InterfaceC2288w.a f10505j;

    /* renamed from: k */
    public final p162j4.InterfaceC3405j f10506k;

    /* renamed from: l */
    public final p352u5.InterfaceC6307b0 f10507l;

    /* renamed from: m */
    public final int f10508m;

    /* renamed from: n */
    public boolean f10509n;

    /* renamed from: o */
    public long f10510o;

    /* renamed from: p */
    public boolean f10511p;

    /* renamed from: q */
    public boolean f10512q;

    /* renamed from: r */
    public p352u5.InterfaceC6317g0 f10513r;

    /* renamed from: g5.z$a */
    public class a extends p108g5.AbstractC2272i {
        public a(p088f4.AbstractC2031n1 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: h */
        public p088f4.AbstractC2031n1.b mo5089h(int r2, p088f4.AbstractC2031n1.b r3, boolean r4) {
                r1 = this;
                f4.n1 r0 = r1.f10375Z
                r0.mo5089h(r2, r3, r4)
                r2 = 1
                r3.f9230d0 = r2
                return r3
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: p */
        public p088f4.AbstractC2031n1.d mo5093p(int r2, p088f4.AbstractC2031n1.d r3, long r4) {
                r1 = this;
                f4.n1 r0 = r1.f10375Z
                r0.mo5093p(r2, r3, r4)
                r2 = 1
                r3.f9251j0 = r2
                return r3
        }
    }

    public C2291z(p088f4.C2018j0 r1, p352u5.InterfaceC6320i.a r2, p108g5.InterfaceC2288w.a r3, p162j4.InterfaceC3405j r4, p352u5.InterfaceC6307b0 r5, int r6, p108g5.C2291z.a r7) {
            r0 = this;
            r0.<init>()
            f4.j0$h r7 = r1.f8971Z
            java.util.Objects.requireNonNull(r7)
            r0.f10503h = r7
            r0.f10502g = r1
            r0.f10504i = r2
            r0.f10505j = r3
            r0.f10506k = r4
            r0.f10507l = r5
            r0.f10508m = r6
            r1 = 1
            r0.f10509n = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f10510o = r1
            return
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: a */
    public p088f4.C2018j0 mo6009a() {
            r1 = this;
            f4.j0 r0 = r1.f10502g
            return r0
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: c */
    public p108g5.InterfaceC2280o mo6010c(p108g5.InterfaceC2283r.a r15, p352u5.C6324m r16, long r17) {
            r14 = this;
            r12 = r14
            r0 = r15
            u5.i$a r1 = r12.f10504i
            u5.i r2 = r1.mo12964a()
            u5.g0 r1 = r12.f10513r
            if (r1 == 0) goto Lf
            r2.mo6023j(r1)
        Lf:
            g5.y r13 = new g5.y
            f4.j0$h r1 = r12.f10503h
            android.net.Uri r1 = r1.f9026a
            g5.w$a r3 = r12.f10505j
            u3.b r3 = (p350u3.C6293b) r3
            java.lang.Object r3 = r3.f24545Z
            m4.n r3 = (p216m4.InterfaceC4369n) r3
            androidx.fragment.app.l0 r4 = new androidx.fragment.app.l0
            r4.<init>(r3)
            j4.j r5 = r12.f10506k
            j4.h$a r3 = r12.f10258d
            r6 = 0
            j4.h$a r7 = r3.m7829g(r6, r15)
            u5.b0 r8 = r12.f10507l
            g5.u$a r3 = r12.f10257c
            r9 = 0
            g5.u$a r9 = r3.m6038g(r6, r15, r9)
            f4.j0$h r0 = r12.f10503h
            java.lang.String r10 = r0.f9030e
            int r11 = r12.f10508m
            r0 = r13
            r3 = r4
            r4 = r5
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r14
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: d */
    public void mo5989d() {
            r0 = this;
            return
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: n */
    public void mo6011n(p108g5.InterfaceC2280o r8) {
            r7 = this;
            g5.y r8 = (p108g5.C2290y) r8
            boolean r0 = r8.f10472t0
            r1 = 0
            if (r0 == 0) goto L22
            g5.b0[] r0 = r8.f10469q0
            int r2 = r0.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L22
            r4 = r0[r3]
            r4.m5976h()
            j4.e r5 = r4.f10293i
            if (r5 == 0) goto L1f
            j4.h$a r6 = r4.f10289e
            r5.mo7791c(r6)
            r4.f10293i = r1
            r4.f10292h = r1
        L1f:
            int r3 = r3 + 1
            goto Lb
        L22:
            u5.c0 r0 = r8.f10461i0
            u5.c0$d<? extends u5.c0$e> r2 = r0.f24635b
            r3 = 1
            if (r2 == 0) goto L2c
            r2.m12950a(r3)
        L2c:
            java.util.concurrent.ExecutorService r2 = r0.f24634a
            u5.c0$g r4 = new u5.c0$g
            r4.<init>(r8)
            r2.execute(r4)
            java.util.concurrent.ExecutorService r0 = r0.f24634a
            r0.shutdown()
            android.os.Handler r0 = r8.f10466n0
            r0.removeCallbacksAndMessages(r1)
            r8.f10467o0 = r1
            r8.f10450J0 = r3
            return
    }

    @Override // p108g5.AbstractC2256a
    /* renamed from: q */
    public void mo5941q(p352u5.InterfaceC6317g0 r1) {
            r0 = this;
            r0.f10513r = r1
            j4.j r1 = r0.f10506k
            r1.mo7818o()
            r0.m6058t()
            return
    }

    @Override // p108g5.AbstractC2256a
    /* renamed from: s */
    public void mo5943s() {
            r1 = this;
            j4.j r0 = r1.f10506k
            r0.release()
            return
    }

    /* renamed from: t */
    public final void m6058t() {
            r9 = this;
            g5.f0 r8 = new g5.f0
            long r1 = r9.f10510o
            boolean r3 = r9.f10511p
            boolean r5 = r9.f10512q
            f4.j0 r7 = r9.f10502g
            r4 = 0
            r6 = 0
            r0 = r8
            r0.<init>(r1, r3, r4, r5, r6, r7)
            boolean r0 = r9.f10509n
            if (r0 == 0) goto L1a
            g5.z$a r0 = new g5.z$a
            r0.<init>(r8)
            r8 = r0
        L1a:
            r9.m5942r(r8)
            return
    }

    /* renamed from: u */
    public void m6059u(long r4, boolean r6, boolean r7) {
            r3 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto Lb
            long r4 = r3.f10510o
        Lb:
            boolean r0 = r3.f10509n
            if (r0 != 0) goto L1e
            long r0 = r3.f10510o
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L1e
            boolean r0 = r3.f10511p
            if (r0 != r6) goto L1e
            boolean r0 = r3.f10512q
            if (r0 != r7) goto L1e
            return
        L1e:
            r3.f10510o = r4
            r3.f10511p = r6
            r3.f10512q = r7
            r4 = 0
            r3.f10509n = r4
            r3.m6058t()
            return
    }
}
