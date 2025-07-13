package gi;

/* renamed from: gi.h */
/* loaded from: classes.dex */
public final class C2398h extends bi.AbstractC0785h0 {

    /* renamed from: Z */
    public final java.lang.String f10790Z;

    /* renamed from: a0 */
    public final long f10791a0;

    /* renamed from: b0 */
    public final p260oi.InterfaceC5286h f10792b0;

    public C2398h(java.lang.String r1, long r2, p260oi.InterfaceC5286h r4) {
            r0 = this;
            r0.<init>()
            r0.f10790Z = r1
            r0.f10791a0 = r2
            r0.f10792b0 = r4
            return
    }

    @Override // bi.AbstractC0785h0
    /* renamed from: h */
    public long mo2394h() {
            r2 = this;
            long r0 = r2.f10791a0
            return r0
    }

    @Override // bi.AbstractC0785h0
    /* renamed from: i */
    public bi.C0805y mo2395i() {
            r2 = this;
            java.lang.String r0 = r2.f10790Z
            if (r0 == 0) goto Lb
            bi.y$a r1 = bi.C0805y.f4365f
            bi.y r0 = bi.C0805y.a.m2460b(r0)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // bi.AbstractC0785h0
    /* renamed from: l */
    public p260oi.InterfaceC5286h mo2396l() {
            r1 = this;
            oi.h r0 = r1.f10792b0
            return r0
    }
}
