package p081ej;

/* renamed from: ej.d */
/* loaded from: classes.dex */
public class C1861d extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p081ej.C1862e f8066Y;

    /* renamed from: Z */
    public p081ej.C1858a f8067Z;

    /* renamed from: a0 */
    public p317ri.C5898n0 f8068a0;

    public C1861d(p317ri.AbstractC5915t r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.size()
            r1 = 3
            if (r0 != r1) goto L3d
            r0 = 0
            ri.e r0 = r3.mo12277F(r0)
            boolean r1 = r0 instanceof p081ej.C1862e
            if (r1 == 0) goto L16
            ej.e r0 = (p081ej.C1862e) r0
            goto L24
        L16:
            if (r0 == 0) goto L23
            ej.e r1 = new ej.e
            ri.t r0 = p317ri.AbstractC5915t.m12274C(r0)
            r1.<init>(r0)
            r0 = r1
            goto L24
        L23:
            r0 = 0
        L24:
            r2.f8066Y = r0
            r0 = 1
            ri.e r0 = r3.mo12277F(r0)
            ej.a r0 = p081ej.C1858a.m4628n(r0)
            r2.f8067Z = r0
            r0 = 2
            ri.e r3 = r3.mo12277F(r0)
            ri.n0 r3 = p317ri.C5898n0.m12256E(r3)
            r2.f8068a0 = r3
            return
        L3d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Bad sequence size: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r3 = r3.size()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r2 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ej.e r1 = r2.f8066Y
            r0.m7087h(r1)
            ej.a r1 = r2.f8067Z
            r0.m7087h(r1)
            ri.n0 r1 = r2.f8068a0
            r0.m7087h(r1)
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}
