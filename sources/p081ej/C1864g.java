package p081ej;

/* renamed from: ej.g */
/* loaded from: classes.dex */
public class C1864g extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p081ej.C1877t f8080Y;

    /* renamed from: Z */
    public p081ej.C1858a f8081Z;

    /* renamed from: a0 */
    public p317ri.C5898n0 f8082a0;

    /* renamed from: b0 */
    public boolean f8083b0;

    /* renamed from: c0 */
    public int f8084c0;

    public C1864g(p317ri.AbstractC5915t r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f8083b0 = r0
            int r1 = r4.size()
            r2 = 3
            if (r1 != r2) goto L3f
            ri.e r0 = r4.mo12277F(r0)
            boolean r1 = r0 instanceof p081ej.C1877t
            if (r1 == 0) goto L18
            ej.t r0 = (p081ej.C1877t) r0
            goto L26
        L18:
            if (r0 == 0) goto L25
            ej.t r1 = new ej.t
            ri.t r0 = p317ri.AbstractC5915t.m12274C(r0)
            r1.<init>(r0)
            r0 = r1
            goto L26
        L25:
            r0 = 0
        L26:
            r3.f8080Y = r0
            r0 = 1
            ri.e r0 = r4.mo12277F(r0)
            ej.a r0 = p081ej.C1858a.m4628n(r0)
            r3.f8081Z = r0
            r0 = 2
            ri.e r4 = r4.mo12277F(r0)
            ri.n0 r4 = p317ri.C5898n0.m12256E(r4)
            r3.f8082a0 = r4
            return
        L3f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "sequence wrong size for CertificateList"
            r4.<init>(r0)
            throw r4
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r2 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ej.t r1 = r2.f8080Y
            r0.m7087h(r1)
            ej.a r1 = r2.f8081Z
            r0.m7087h(r1)
            ri.n0 r1 = r2.f8082a0
            r0.m7087h(r1)
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r1 = this;
            boolean r0 = r1.f8083b0
            if (r0 != 0) goto Ld
            int r0 = super.hashCode()
            r1.f8084c0 = r0
            r0 = 1
            r1.f8083b0 = r0
        Ld:
            int r0 = r1.f8084c0
            return r0
    }
}
