package p108g5;

/* renamed from: g5.b */
/* loaded from: classes.dex */
public final class C2258b implements p108g5.InterfaceC2280o, p108g5.InterfaceC2280o.a {

    /* renamed from: Y */
    public final p108g5.InterfaceC2280o f10273Y;

    /* renamed from: Z */
    public p108g5.InterfaceC2280o.a f10274Z;

    /* renamed from: a0 */
    public p108g5.C2258b.a[] f10275a0;

    /* renamed from: b0 */
    public long f10276b0;

    /* renamed from: c0 */
    public long f10277c0;

    /* renamed from: d0 */
    public long f10278d0;

    /* renamed from: g5.b$a */
    public final class a implements p108g5.InterfaceC2261c0 {

        /* renamed from: a */
        public final p108g5.InterfaceC2261c0 f10279a;

        /* renamed from: b */
        public boolean f10280b;

        /* renamed from: c */
        public final /* synthetic */ p108g5.C2258b f10281c;

        public a(p108g5.C2258b r1, p108g5.InterfaceC2261c0 r2) {
                r0 = this;
                r0.f10281c = r1
                r0.<init>()
                r0.f10279a = r2
                return
        }

        @Override // p108g5.InterfaceC2261c0
        /* renamed from: a */
        public int mo5965a(androidx.appcompat.widget.C0311x r11, p142i4.C3073g r12, int r13) {
                r10 = this;
                g5.b r0 = r10.f10281c
                boolean r0 = r0.m5952d()
                r1 = -3
                if (r0 == 0) goto La
                return r1
            La:
                boolean r0 = r10.f10280b
                r2 = 4
                r3 = -4
                if (r0 == 0) goto L13
                r12.f12333Y = r2
                return r3
            L13:
                g5.c0 r0 = r10.f10279a
                int r13 = r0.mo5965a(r11, r12, r13)
                r0 = -5
                r4 = -9223372036854775808
                if (r13 != r0) goto L51
                java.lang.Object r12 = r11.f1482a0
                f4.e0 r12 = (p088f4.C2003e0) r12
                java.util.Objects.requireNonNull(r12)
                int r13 = r12.f8912z0
                if (r13 != 0) goto L2d
                int r1 = r12.f8881A0
                if (r1 == 0) goto L50
            L2d:
                g5.b r1 = r10.f10281c
                long r2 = r1.f10277c0
                r6 = 0
                r8 = 0
                int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r9 == 0) goto L39
                r13 = 0
            L39:
                long r1 = r1.f10278d0
                int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r3 == 0) goto L40
                goto L42
            L40:
                int r8 = r12.f8881A0
            L42:
                f4.e0$b r12 = r12.m5191a()
                r12.f8913A = r13
                r12.f8914B = r8
                f4.e0 r12 = r12.m5193a()
                r11.f1482a0 = r12
            L50:
                return r0
            L51:
                g5.b r11 = r10.f10281c
                long r6 = r11.f10278d0
                int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r0 == 0) goto L78
                if (r13 != r3) goto L61
                long r8 = r12.f12360c0
                int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r0 >= 0) goto L6f
            L61:
                if (r13 != r1) goto L78
                long r0 = r11.mo5958m()
                int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r11 != 0) goto L78
                boolean r11 = r12.f12359b0
                if (r11 != 0) goto L78
            L6f:
                r12.mo7522t()
                r12.f12333Y = r2
                r11 = 1
                r10.f10280b = r11
                return r3
            L78:
                return r13
        }

        @Override // p108g5.InterfaceC2261c0
        /* renamed from: b */
        public void mo5966b() {
                r1 = this;
                g5.c0 r0 = r1.f10279a
                r0.mo5966b()
                return
        }

        @Override // p108g5.InterfaceC2261c0
        /* renamed from: c */
        public int mo5967c(long r2) {
                r1 = this;
                g5.b r0 = r1.f10281c
                boolean r0 = r0.m5952d()
                if (r0 == 0) goto La
                r2 = -3
                return r2
            La:
                g5.c0 r0 = r1.f10279a
                int r2 = r0.mo5967c(r2)
                return r2
        }

        @Override // p108g5.InterfaceC2261c0
        /* renamed from: i */
        public boolean mo5968i() {
                r1 = this;
                g5.b r0 = r1.f10281c
                boolean r0 = r0.m5952d()
                if (r0 != 0) goto L12
                g5.c0 r0 = r1.f10279a
                boolean r0 = r0.mo5968i()
                if (r0 == 0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                return r0
        }
    }

    public C2258b(p108g5.InterfaceC2280o r1, boolean r2, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.f10273Y = r1
            r1 = 0
            g5.b$a[] r1 = new p108g5.C2258b.a[r1]
            r0.f10275a0 = r1
            if (r2 == 0) goto Le
            r1 = r3
            goto L13
        Le:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L13:
            r0.f10276b0 = r1
            r0.f10277c0 = r3
            r0.f10278d0 = r5
            return
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: a */
    public boolean mo5951a() {
            r1 = this;
            g5.o r0 = r1.f10273Y
            boolean r0 = r0.mo5951a()
            return r0
    }

    @Override // p108g5.InterfaceC2280o.a
    /* renamed from: b */
    public void mo5141b(p108g5.InterfaceC2280o r1) {
            r0 = this;
            g5.o$a r1 = r0.f10274Z
            java.util.Objects.requireNonNull(r1)
            r1.mo5141b(r0)
            return
    }

    @Override // p108g5.InterfaceC2263d0.a
    /* renamed from: c */
    public void mo5143c(p108g5.InterfaceC2263d0 r1) {
            r0 = this;
            g5.o$a r1 = r0.f10274Z
            java.util.Objects.requireNonNull(r1)
            r1.mo5143c(r0)
            return
    }

    /* renamed from: d */
    public boolean m5952d() {
            r5 = this;
            long r0 = r5.f10276b0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: e */
    public long mo5953e() {
            r7 = this;
            g5.o r0 = r7.f10273Y
            long r0 = r0.mo5953e()
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L18
            long r4 = r7.f10278d0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L17
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L17
            goto L18
        L17:
            return r0
        L18:
            return r2
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: f */
    public long mo5954f() {
            r9 = this;
            boolean r0 = r9.m5952d()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L19
            long r3 = r9.f10276b0
            r9.f10276b0 = r1
            long r5 = r9.mo5954f()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L18
            r3 = r5
        L18:
            return r3
        L19:
            g5.o r0 = r9.f10273Y
            long r3 = r0.mo5954f()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L24
            return r1
        L24:
            long r0 = r9.f10277c0
            r2 = 1
            r5 = 0
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 < 0) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            p371v5.C6549a.m13291e(r0)
            long r0 = r9.f10278d0
            r6 = -9223372036854775808
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 == 0) goto L40
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 > 0) goto L3f
            goto L40
        L3f:
            r2 = 0
        L40:
            p371v5.C6549a.m13291e(r2)
            return r3
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: i */
    public p108g5.C2273i0 mo5955i() {
            r1 = this;
            g5.o r0 = r1.f10273Y
            g5.i0 r0 = r0.mo5955i()
            return r0
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: j */
    public void mo5956j(p108g5.InterfaceC2280o.a r1, long r2) {
            r0 = this;
            r0.f10274Z = r1
            g5.o r1 = r0.f10273Y
            r1.mo5956j(r0, r2)
            return
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: k */
    public long mo5957k(long r10, p088f4.C2016i1 r12) {
            r9 = this;
            long r0 = r9.f10277c0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            return r0
        L7:
            long r3 = r12.f8962a
            long r7 = r10 - r0
            r5 = 0
            long r0 = p371v5.C6552b0.m13316i(r3, r5, r7)
            long r2 = r12.f8963b
            long r4 = r9.f10278d0
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L21
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L22
        L21:
            long r4 = r4 - r10
        L22:
            r6 = r4
            r4 = 0
            long r2 = p371v5.C6552b0.m13316i(r2, r4, r6)
            long r4 = r12.f8962a
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L36
            long r4 = r12.f8963b
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L36
            goto L3b
        L36:
            f4.i1 r12 = new f4.i1
            r12.<init>(r0, r2)
        L3b:
            g5.o r0 = r9.f10273Y
            long r10 = r0.mo5957k(r10, r12)
            return r10
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: m */
    public long mo5958m() {
            r7 = this;
            g5.o r0 = r7.f10273Y
            long r0 = r0.mo5958m()
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L18
            long r4 = r7.f10278d0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L17
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L17
            goto L18
        L17:
            return r0
        L18:
            return r2
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: n */
    public void mo5959n() {
            r1 = this;
            g5.o r0 = r1.f10273Y
            r0.mo5959n()
            return
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: o */
    public void mo5960o(long r2, boolean r4) {
            r1 = this;
            g5.o r0 = r1.f10273Y
            r0.mo5960o(r2, r4)
            return
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: p */
    public long mo5961p(long r7) {
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f10276b0 = r0
            g5.b$a[] r0 = r6.f10275a0
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f10280b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            g5.o r0 = r6.f10273Y
            long r0 = r0.mo5961p(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L33
            long r7 = r6.f10277c0
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L34
            long r7 = r6.f10278d0
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L33
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L34
        L33:
            r2 = 1
        L34:
            p371v5.C6549a.m13291e(r2)
            return r0
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: q */
    public boolean mo5962q(long r2) {
            r1 = this;
            g5.o r0 = r1.f10273Y
            boolean r2 = r0.mo5962q(r2)
            return r2
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: r */
    public long mo5963r(p325s5.InterfaceC5966f[] r16, boolean[] r17, p108g5.InterfaceC2261c0[] r18, boolean[] r19, long r20) {
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            g5.b$a[] r1 = new p108g5.C2258b.a[r1]
            r0.f10275a0 = r1
            int r1 = r9.length
            g5.c0[] r10 = new p108g5.InterfaceC2261c0[r1]
            r11 = 0
            r1 = 0
        Lf:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L28
            g5.b$a[] r2 = r0.f10275a0
            r3 = r9[r1]
            g5.b$a r3 = (p108g5.C2258b.a) r3
            r2[r1] = r3
            r3 = r2[r1]
            if (r3 == 0) goto L23
            r2 = r2[r1]
            g5.c0 r12 = r2.f10279a
        L23:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Lf
        L28:
            g5.o r1 = r0.f10273Y
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.mo5963r(r2, r3, r4, r5, r6)
            boolean r3 = r15.m5952d()
            r4 = 1
            if (r3 == 0) goto L6a
            long r5 = r0.f10277c0
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L6a
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L65
            int r3 = r8.length
            r5 = 0
        L4c:
            if (r5 >= r3) goto L65
            r6 = r8[r5]
            if (r6 == 0) goto L62
            f4.e0 r6 = r6.mo12412f()
            java.lang.String r7 = r6.f8896j0
            java.lang.String r6 = r6.f8893g0
            boolean r6 = p371v5.C6567q.m13371a(r7, r6)
            if (r6 != 0) goto L62
            r3 = 1
            goto L66
        L62:
            int r5 = r5 + 1
            goto L4c
        L65:
            r3 = 0
        L66:
            if (r3 == 0) goto L6a
            r5 = r1
            goto L6f
        L6a:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L6f:
            r0.f10276b0 = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L89
            long r5 = r0.f10277c0
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L88
            long r5 = r0.f10278d0
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L89
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L88
            goto L89
        L88:
            r4 = 0
        L89:
            p371v5.C6549a.m13291e(r4)
        L8c:
            int r3 = r9.length
            if (r11 >= r3) goto Lb8
            r3 = r10[r11]
            if (r3 != 0) goto L98
            g5.b$a[] r3 = r0.f10275a0
            r3[r11] = r12
            goto Laf
        L98:
            g5.b$a[] r3 = r0.f10275a0
            r4 = r3[r11]
            if (r4 == 0) goto La6
            r4 = r3[r11]
            g5.c0 r4 = r4.f10279a
            r5 = r10[r11]
            if (r4 == r5) goto Laf
        La6:
            g5.b$a r4 = new g5.b$a
            r5 = r10[r11]
            r4.<init>(r15, r5)
            r3[r11] = r4
        Laf:
            g5.b$a[] r3 = r0.f10275a0
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L8c
        Lb8:
            return r1
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: s */
    public void mo5964s(long r2) {
            r1 = this;
            g5.o r0 = r1.f10273Y
            r0.mo5964s(r2)
            return
    }
}
