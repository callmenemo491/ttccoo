package p317ri;

/* renamed from: ri.b0 */
/* loaded from: classes.dex */
public class C5862b0 implements p317ri.InterfaceC5870e, p317ri.InterfaceC5908q1 {

    /* renamed from: Y */
    public final int f22670Y;

    /* renamed from: Z */
    public final ma.C4507a f22671Z;

    public C5862b0(int r1, ma.C4507a r2) {
            r0 = this;
            r0.<init>()
            r0.f22670Y = r1
            r0.f22671Z = r2
            return
    }

    @Override // p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r4 = this;
            ri.s r0 = r4.mo12213i()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            ri.r r1 = new ri.r
            java.lang.String r2 = r0.getMessage()
            r3 = 0
            r1.<init>(r2, r0, r3)
            throw r1
    }

    @Override // p317ri.InterfaceC5908q1
    /* renamed from: i */
    public p317ri.AbstractC5912s mo12213i() {
            r3 = this;
            ri.a0 r0 = new ri.a0
            int r1 = r3.f22670Y
            ma.a r2 = r3.f22671Z
            h7.rb r2 = r2.m10392d()
            r0.<init>(r1, r2)
            return r0
    }
}
