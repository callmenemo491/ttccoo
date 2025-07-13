package p317ri;

/* renamed from: ri.k0 */
/* loaded from: classes.dex */
public class C5889k0 implements p317ri.InterfaceC5870e, p317ri.InterfaceC5908q1 {

    /* renamed from: Y */
    public boolean f22710Y;

    /* renamed from: Z */
    public int f22711Z;

    /* renamed from: a0 */
    public ma.C4507a f22712a0;

    public C5889k0(boolean r1, int r2, ma.C4507a r3) {
            r0 = this;
            r0.<init>()
            r0.f22710Y = r1
            r0.f22711Z = r2
            r0.f22712a0 = r3
            return
    }

    @Override // p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r2 = this;
            ri.s r0 = r2.mo12213i()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            ri.r r1 = new ri.r
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
    }

    @Override // p317ri.InterfaceC5908q1
    /* renamed from: i */
    public p317ri.AbstractC5912s mo12213i() {
            r3 = this;
            ma.a r0 = r3.f22712a0
            boolean r1 = r3.f22710Y
            int r2 = r3.f22711Z
            ri.s r0 = r0.m10391c(r1, r2)
            return r0
    }
}
