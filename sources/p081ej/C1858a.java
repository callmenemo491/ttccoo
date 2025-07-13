package p081ej;

/* renamed from: ej.a */
/* loaded from: classes.dex */
public class C1858a extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p317ri.C5897n f8060Y;

    /* renamed from: Z */
    public p317ri.InterfaceC5870e f8061Z;

    public C1858a(p317ri.C5897n r1, p317ri.InterfaceC5870e r2) {
            r0 = this;
            r0.<init>()
            r0.f8060Y = r1
            r0.f8061Z = r2
            return
    }

    public C1858a(p317ri.AbstractC5915t r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.size()
            r1 = 1
            if (r0 < r1) goto L2b
            int r0 = r4.size()
            r2 = 2
            if (r0 > r2) goto L2b
            r0 = 0
            ri.e r0 = r4.mo12277F(r0)
            ri.n r0 = p317ri.C5897n.m12249F(r0)
            r3.f8060Y = r0
            int r0 = r4.size()
            if (r0 != r2) goto L27
            ri.e r4 = r4.mo12277F(r1)
            goto L28
        L27:
            r4 = 0
        L28:
            r3.f8061Z = r4
            return
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Bad sequence size: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r4 = r4.size()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: n */
    public static p081ej.C1858a m4628n(java.lang.Object r1) {
            boolean r0 = r1 instanceof p081ej.C1858a
            if (r0 == 0) goto L7
            ej.a r1 = (p081ej.C1858a) r1
            return r1
        L7:
            if (r1 == 0) goto L13
            ej.a r0 = new ej.a
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
            ri.n r1 = r2.f8060Y
            r0.m7087h(r1)
            ri.e r1 = r2.f8061Z
            if (r1 == 0) goto L13
            r0.m7087h(r1)
        L13:
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}
