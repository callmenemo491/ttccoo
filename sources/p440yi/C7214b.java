package p440yi;

/* renamed from: yi.b */
/* loaded from: classes.dex */
public class C7214b extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p440yi.C7215c f27762Y;

    /* renamed from: Z */
    public p081ej.C1858a f27763Z;

    /* renamed from: a0 */
    public p317ri.C5898n0 f27764a0;

    public C7214b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f27762Y = r0
            r1.f27763Z = r0
            r1.f27764a0 = r0
            return
    }

    public C7214b(p317ri.AbstractC5915t r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f27762Y = r0
            r3.f27763Z = r0
            r3.f27764a0 = r0
            r1 = 0
            ri.e r1 = r4.mo12277F(r1)
            boolean r2 = r1 instanceof p440yi.C7215c
            if (r2 == 0) goto L17
            r0 = r1
            yi.c r0 = (p440yi.C7215c) r0
            goto L22
        L17:
            if (r1 == 0) goto L22
            yi.c r0 = new yi.c
            ri.t r1 = p317ri.AbstractC5915t.m12274C(r1)
            r0.<init>(r1)
        L22:
            r3.f27762Y = r0
            r0 = 1
            ri.e r0 = r4.mo12277F(r0)
            ej.a r0 = p081ej.C1858a.m4628n(r0)
            r3.f27763Z = r0
            r0 = 2
            ri.e r4 = r4.mo12277F(r0)
            ri.n0 r4 = (p317ri.C5898n0) r4
            r3.f27764a0 = r4
            return
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r2 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            yi.c r1 = r2.f27762Y
            r0.m7087h(r1)
            ej.a r1 = r2.f27763Z
            r0.m7087h(r1)
            ri.n0 r1 = r2.f27764a0
            r0.m7087h(r1)
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}
