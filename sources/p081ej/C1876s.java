package p081ej;

/* renamed from: ej.s */
/* loaded from: classes.dex */
public class C1876s extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p081ej.C1858a f8117Y;

    /* renamed from: Z */
    public p317ri.C5898n0 f8118Z;

    public C1876s(p081ej.C1858a r2, p317ri.InterfaceC5870e r3) {
            r1 = this;
            r1.<init>()
            ri.n0 r0 = new ri.n0
            r0.<init>(r3)
            r1.f8118Z = r0
            r1.f8117Y = r2
            return
    }

    public C1876s(p081ej.C1858a r2, byte[] r3) {
            r1 = this;
            r1.<init>()
            ri.n0 r0 = new ri.n0
            r0.<init>(r3)
            r1.f8118Z = r0
            r1.f8117Y = r2
            return
    }

    public C1876s(p317ri.AbstractC5915t r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.size()
            r1 = 2
            if (r0 != r1) goto L23
            java.util.Enumeration r3 = r3.mo12278H()
            java.lang.Object r0 = r3.nextElement()
            ej.a r0 = p081ej.C1858a.m4628n(r0)
            r2.f8117Y = r0
            java.lang.Object r3 = r3.nextElement()
            ri.n0 r3 = p317ri.C5898n0.m12256E(r3)
            r2.f8118Z = r3
            return
        L23:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Bad sequence size: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r3 = r3.size()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: n */
    public static p081ej.C1876s m4637n(java.lang.Object r1) {
            boolean r0 = r1 instanceof p081ej.C1876s
            if (r0 == 0) goto L7
            ej.s r1 = (p081ej.C1876s) r1
            return r1
        L7:
            if (r1 == 0) goto L13
            ej.s r0 = new ej.s
            ri.t r1 = p317ri.AbstractC5915t.m12274C(r1)
            r0.<init>(r1)
            return r0
        L13:
            r1 = 0
            return r1
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r2 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ej.a r1 = r2.f8117Y
            r0.m7087h(r1)
            ri.n0 r1 = r2.f8118Z
            r0.m7087h(r1)
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}
