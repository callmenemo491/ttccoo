package p005a4;

/* renamed from: a4.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0016e implements p034c4.InterfaceC0867b.a, p371v5.C6564n.a {

    /* renamed from: Y */
    public final /* synthetic */ int f22Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f23Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.Object f24a0;

    /* renamed from: b0 */
    public final /* synthetic */ int f25b0;

    public /* synthetic */ C0016e(int r2, p088f4.InterfaceC2054x0.f r3, p088f4.InterfaceC2054x0.f r4) {
            r1 = this;
            r0 = 1
            r1.f22Y = r0
            r1.<init>()
            r1.f25b0 = r2
            r1.f23Z = r3
            r1.f24a0 = r4
            return
    }

    public /* synthetic */ C0016e(p005a4.C0020i r2, p385w3.AbstractC6787i r3, int r4) {
            r1 = this;
            r0 = 0
            r1.f22Y = r0
            r1.<init>()
            r1.f23Z = r2
            r1.f24a0 = r3
            r1.f25b0 = r4
            return
    }

    public /* synthetic */ C0016e(p107g4.InterfaceC2255q.a r2, p088f4.C2018j0 r3, int r4) {
            r1 = this;
            r0 = 2
            r1.f22Y = r0
            r1.<init>()
            r1.f23Z = r2
            r1.f24a0 = r3
            r1.f25b0 = r4
            return
    }

    @Override // p371v5.C6564n.a
    /* renamed from: b */
    public void mo24b(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f22Y
            switch(r0) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L1b
        L6:
            int r0 = r4.f25b0
            java.lang.Object r1 = r4.f23Z
            f4.x0$f r1 = (p088f4.InterfaceC2054x0.f) r1
            java.lang.Object r2 = r4.f24a0
            f4.x0$f r2 = (p088f4.InterfaceC2054x0.f) r2
            f4.x0$c r5 = (p088f4.InterfaceC2054x0.c) r5
            int r3 = p088f4.C2057z.f9393H
            r5.mo2911k(r0)
            r5.mo2889Q(r1, r2, r0)
            return
        L1b:
            java.lang.Object r0 = r4.f23Z
            g4.q$a r0 = (p107g4.InterfaceC2255q.a) r0
            java.lang.Object r0 = r4.f24a0
            f4.j0 r0 = (p088f4.C2018j0) r0
            g4.q r5 = (p107g4.InterfaceC2255q) r5
            r5.m5866F()
            return
    }

    @Override // p034c4.InterfaceC0867b.a
    /* renamed from: h */
    public java.lang.Object mo23h() {
            r3 = this;
            java.lang.Object r0 = r3.f23Z
            a4.i r0 = (p005a4.C0020i) r0
            java.lang.Object r1 = r3.f24a0
            w3.i r1 = (p385w3.AbstractC6787i) r1
            int r2 = r3.f25b0
            a4.l r0 = r0.f40d
            int r2 = r2 + 1
            r0.mo22b(r1, r2)
            r0 = 0
            return r0
    }
}
