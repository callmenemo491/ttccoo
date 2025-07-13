package p005a4;

/* renamed from: a4.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C0018g implements p034c4.InterfaceC0867b.a, p392wa.InterfaceC6822a.a {

    /* renamed from: Y */
    public final /* synthetic */ java.lang.Object f29Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f30Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.Object f31a0;

    /* renamed from: b0 */
    public final /* synthetic */ long f32b0;

    public /* synthetic */ C0018g(p005a4.C0020i r1, java.lang.Iterable r2, p385w3.AbstractC6787i r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.f29Y = r1
            r0.f30Z = r2
            r0.f31a0 = r3
            r0.f32b0 = r4
            return
    }

    public /* synthetic */ C0018g(java.lang.String r1, java.lang.String r2, long r3, p094fa.AbstractC2107c0 r5) {
            r0 = this;
            r0.<init>()
            r0.f29Y = r1
            r0.f30Z = r2
            r0.f32b0 = r3
            r0.f31a0 = r5
            return
    }

    @Override // p392wa.InterfaceC6822a.a
    /* renamed from: c */
    public void mo25c(p392wa.InterfaceC6823b r8) {
            r7 = this;
            java.lang.Object r0 = r7.f29Y
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r7.f30Z
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            long r4 = r7.f32b0
            java.lang.Object r0 = r7.f31a0
            r6 = r0
            fa.c0 r6 = (p094fa.AbstractC2107c0) r6
            java.lang.Object r8 = r8.get()
            r1 = r8
            aa.a r1 = (p011aa.InterfaceC0045a) r1
            r1.mo48d(r2, r3, r4, r6)
            return
    }

    @Override // p034c4.InterfaceC0867b.a
    /* renamed from: h */
    public java.lang.Object mo23h() {
            r7 = this;
            java.lang.Object r0 = r7.f29Y
            a4.i r0 = (p005a4.C0020i) r0
            java.lang.Object r1 = r7.f30Z
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r2 = r7.f31a0
            w3.i r2 = (p385w3.AbstractC6787i) r2
            long r3 = r7.f32b0
            b4.c r5 = r0.f39c
            r5.mo2228h0(r1)
            b4.c r1 = r0.f39c
            d4.a r0 = r0.f43g
            long r5 = r0.mo3736a()
            long r5 = r5 + r3
            r1.mo2231o(r2, r5)
            r0 = 0
            return r0
    }
}
