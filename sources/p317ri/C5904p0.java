package p317ri;

/* renamed from: ri.p0 */
/* loaded from: classes.dex */
public class C5904p0 implements p317ri.InterfaceC5870e, p317ri.InterfaceC5908q1 {

    /* renamed from: Y */
    public ma.C4507a f22726Y;

    public C5904p0(ma.C4507a r1) {
            r0 = this;
            r0.<init>()
            r0.f22726Y = r1
            return
    }

    @Override // p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r4 = this;
            java.lang.String r0 = "unable to get DER object"
            r1 = 0
            ri.s r0 = r4.mo12213i()     // Catch: java.lang.IllegalArgumentException -> L8 java.io.IOException -> Lf
            return r0
        L8:
            r2 = move-exception
            ri.r r3 = new ri.r
            r3.<init>(r0, r2, r1)
            throw r3
        Lf:
            r2 = move-exception
            ri.r r3 = new ri.r
            r3.<init>(r0, r2, r1)
            throw r3
    }

    @Override // p317ri.InterfaceC5908q1
    /* renamed from: i */
    public p317ri.AbstractC5912s mo12213i() {
            r4 = this;
            ri.k1 r0 = new ri.k1     // Catch: java.lang.IllegalArgumentException -> Lc
            ma.a r1 = r4.f22726Y     // Catch: java.lang.IllegalArgumentException -> Lc
            h7.rb r1 = r1.m10392d()     // Catch: java.lang.IllegalArgumentException -> Lc
            r0.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> Lc
            return r0
        Lc:
            r0 = move-exception
            ri.g r1 = new ri.g
            java.lang.String r2 = r0.getMessage()
            r3 = 0
            r1.<init>(r2, r0, r3)
            throw r1
    }
}
