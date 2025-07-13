package p042cj;

/* renamed from: cj.a */
/* loaded from: classes.dex */
public class C0989a extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p317ri.C5897n f5072Y;

    /* renamed from: Z */
    public p317ri.InterfaceC5870e f5073Z;

    public C0989a(p317ri.AbstractC5915t r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            ri.e r0 = r2.mo12277F(r0)
            ri.n r0 = (p317ri.C5897n) r0
            r1.f5072Y = r0
            r0 = 1
            ri.e r2 = r2.mo12277F(r0)
            r1.f5073Z = r2
            return
    }

    /* renamed from: n */
    public static p042cj.C0989a m2721n(java.lang.Object r1) {
            boolean r0 = r1 instanceof p042cj.C0989a
            if (r0 == 0) goto L7
            cj.a r1 = (p042cj.C0989a) r1
            return r1
        L7:
            if (r1 == 0) goto L13
            cj.a r0 = new cj.a
            ri.t r1 = p317ri.AbstractC5915t.m12274C(r1)
            r0.<init>(r1)
            return r0
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "null value in getInstance()"
            r1.<init>(r0)
            throw r1
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r2 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ri.n r1 = r2.f5072Y
            r0.m7087h(r1)
            ri.e r1 = r2.f5073Z
            r0.m7087h(r1)
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}
