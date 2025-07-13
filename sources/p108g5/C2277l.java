package p108g5;

/* renamed from: g5.l */
/* loaded from: classes.dex */
public final class C2277l implements p108g5.InterfaceC2280o, p108g5.InterfaceC2280o.a {

    /* renamed from: Y */
    public final p108g5.InterfaceC2283r.a f10388Y;

    /* renamed from: Z */
    public final long f10389Z;

    /* renamed from: a0 */
    public final p352u5.C6324m f10390a0;

    /* renamed from: b0 */
    public p108g5.InterfaceC2283r f10391b0;

    /* renamed from: c0 */
    public p108g5.InterfaceC2280o f10392c0;

    /* renamed from: d0 */
    public p108g5.InterfaceC2280o.a f10393d0;

    /* renamed from: e0 */
    public long f10394e0;

    public C2277l(p108g5.InterfaceC2283r.a r1, p352u5.C6324m r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.f10388Y = r1
            r0.f10390a0 = r2
            r0.f10389Z = r3
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f10394e0 = r1
            return
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: a */
    public boolean mo5951a() {
            r1 = this;
            g5.o r0 = r1.f10392c0
            if (r0 == 0) goto Lc
            boolean r0 = r0.mo5951a()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // p108g5.InterfaceC2280o.a
    /* renamed from: b */
    public void mo5141b(p108g5.InterfaceC2280o r2) {
            r1 = this;
            g5.o$a r2 = r1.f10393d0
            int r0 = p371v5.C6552b0.f25624a
            r2.mo5141b(r1)
            return
    }

    @Override // p108g5.InterfaceC2263d0.a
    /* renamed from: c */
    public void mo5143c(p108g5.InterfaceC2263d0 r2) {
            r1 = this;
            g5.o$a r2 = r1.f10393d0
            int r0 = p371v5.C6552b0.f25624a
            r2.mo5143c(r1)
            return
    }

    /* renamed from: d */
    public void m6025d(p108g5.InterfaceC2283r.a r8) {
            r7 = this;
            long r0 = r7.f10389Z
            long r2 = r7.f10394e0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto Le
            r0 = r2
        Le:
            g5.r r2 = r7.f10391b0
            java.util.Objects.requireNonNull(r2)
            u5.m r3 = r7.f10390a0
            g5.o r8 = r2.mo6010c(r8, r3, r0)
            r7.f10392c0 = r8
            g5.o$a r2 = r7.f10393d0
            if (r2 == 0) goto L22
            r8.mo5956j(r7, r0)
        L22:
            return
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: e */
    public long mo5953e() {
            r2 = this;
            g5.o r0 = r2.f10392c0
            int r1 = p371v5.C6552b0.f25624a
            long r0 = r0.mo5953e()
            return r0
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: f */
    public long mo5954f() {
            r2 = this;
            g5.o r0 = r2.f10392c0
            int r1 = p371v5.C6552b0.f25624a
            long r0 = r0.mo5954f()
            return r0
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: i */
    public p108g5.C2273i0 mo5955i() {
            r2 = this;
            g5.o r0 = r2.f10392c0
            int r1 = p371v5.C6552b0.f25624a
            g5.i0 r0 = r0.mo5955i()
            return r0
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: j */
    public void mo5956j(p108g5.InterfaceC2280o.a r6, long r7) {
            r5 = this;
            r5.f10393d0 = r6
            g5.o r6 = r5.f10392c0
            if (r6 == 0) goto L17
            long r7 = r5.f10389Z
            long r0 = r5.f10394e0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L14
            r7 = r0
        L14:
            r6.mo5956j(r5, r7)
        L17:
            return
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: k */
    public long mo5957k(long r3, p088f4.C2016i1 r5) {
            r2 = this;
            g5.o r0 = r2.f10392c0
            int r1 = p371v5.C6552b0.f25624a
            long r3 = r0.mo5957k(r3, r5)
            return r3
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: m */
    public long mo5958m() {
            r2 = this;
            g5.o r0 = r2.f10392c0
            int r1 = p371v5.C6552b0.f25624a
            long r0 = r0.mo5958m()
            return r0
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: n */
    public void mo5959n() {
            r1 = this;
            g5.o r0 = r1.f10392c0     // Catch: java.io.IOException -> L10
            if (r0 == 0) goto L8
            r0.mo5959n()     // Catch: java.io.IOException -> L10
            goto Lf
        L8:
            g5.r r0 = r1.f10391b0     // Catch: java.io.IOException -> L10
            if (r0 == 0) goto Lf
            r0.mo5989d()     // Catch: java.io.IOException -> L10
        Lf:
            return
        L10:
            r0 = move-exception
            throw r0
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: o */
    public void mo5960o(long r3, boolean r5) {
            r2 = this;
            g5.o r0 = r2.f10392c0
            int r1 = p371v5.C6552b0.f25624a
            r0.mo5960o(r3, r5)
            return
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: p */
    public long mo5961p(long r3) {
            r2 = this;
            g5.o r0 = r2.f10392c0
            int r1 = p371v5.C6552b0.f25624a
            long r3 = r0.mo5961p(r3)
            return r3
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: q */
    public boolean mo5962q(long r2) {
            r1 = this;
            g5.o r0 = r1.f10392c0
            if (r0 == 0) goto Lc
            boolean r2 = r0.mo5962q(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: r */
    public long mo5963r(p325s5.InterfaceC5966f[] r16, boolean[] r17, p108g5.InterfaceC2261c0[] r18, boolean[] r19, long r20) {
            r15 = this;
            r0 = r15
            long r1 = r0.f10394e0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L16
            long r5 = r0.f10389Z
            int r7 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r7 != 0) goto L16
            r0.f10394e0 = r3
            r13 = r1
            goto L18
        L16:
            r13 = r20
        L18:
            g5.o r8 = r0.f10392c0
            int r1 = p371v5.C6552b0.f25624a
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r19
            long r1 = r8.mo5963r(r9, r10, r11, r12, r13)
            return r1
    }

    @Override // p108g5.InterfaceC2280o
    /* renamed from: s */
    public void mo5964s(long r3) {
            r2 = this;
            g5.o r0 = r2.f10392c0
            int r1 = p371v5.C6552b0.f25624a
            r0.mo5964s(r3)
            return
    }
}
