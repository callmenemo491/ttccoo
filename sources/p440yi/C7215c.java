package p440yi;

/* renamed from: yi.c */
/* loaded from: classes.dex */
public class C7215c extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p317ri.C5888k f27765Y;

    /* renamed from: Z */
    public p042cj.C0991c f27766Z;

    /* renamed from: a0 */
    public p081ej.C1876s f27767a0;

    /* renamed from: b0 */
    public p317ri.AbstractC5921v f27768b0;

    public C7215c(p317ri.AbstractC5915t r5) {
            r4 = this;
            r4.<init>()
            ri.k r0 = new ri.k
            r1 = 0
            r0.<init>(r1)
            r4.f27765Y = r0
            r0 = 0
            r4.f27768b0 = r0
            r0 = 0
            ri.e r1 = r5.mo12277F(r0)
            ri.k r1 = (p317ri.C5888k) r1
            r4.f27765Y = r1
            r1 = 1
            ri.e r2 = r5.mo12277F(r1)
            cj.c r2 = p042cj.C0991c.m2725n(r2)
            r4.f27766Z = r2
            r2 = 2
            ri.e r2 = r5.mo12277F(r2)
            ej.s r2 = p081ej.C1876s.m4637n(r2)
            r4.f27767a0 = r2
            int r2 = r5.size()
            r3 = 3
            if (r2 <= r3) goto L41
            ri.e r5 = r5.mo12277F(r3)
            ri.y r5 = (p317ri.AbstractC5928y) r5
            ri.v r5 = p317ri.AbstractC5921v.m12285D(r5, r0)
            r4.f27768b0 = r5
        L41:
            ri.v r5 = r4.f27768b0
            if (r5 != 0) goto L46
            goto La0
        L46:
            java.util.Enumeration r5 = r5.m12288H()
        L4a:
            boolean r0 = r5.hasMoreElements()
            if (r0 == 0) goto La0
            java.lang.Object r0 = r5.nextElement()
            if (r0 == 0) goto L82
            boolean r2 = r0 instanceof p440yi.C7213a
            if (r2 == 0) goto L5b
            goto L82
        L5b:
            boolean r2 = r0 instanceof p317ri.AbstractC5915t
            if (r2 == 0) goto L67
            yi.a r2 = new yi.a
            ri.t r0 = (p317ri.AbstractC5915t) r0
            r2.<init>(r0)
            goto L85
        L67:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unknown object in factory: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        L82:
            r2 = r0
            yi.a r2 = (p440yi.C7213a) r2
        L85:
            ri.n r0 = r2.f27760Y
            ri.n r3 = p440yi.InterfaceC7217e.f27774d
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L4a
            ri.v r0 = r2.f27761Z
            int r0 = r0.size()
            if (r0 != r1) goto L98
            goto L4a
        L98:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "challengePassword attribute must have one value"
            r5.<init>(r0)
            throw r5
        La0:
            cj.c r5 = r4.f27766Z
            if (r5 == 0) goto Lad
            ri.k r5 = r4.f27765Y
            if (r5 == 0) goto Lad
            ej.s r5 = r4.f27767a0
            if (r5 == 0) goto Lad
            return
        Lad:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Not all mandatory fields set in CertificationRequestInfo generator."
            r5.<init>(r0)
            throw r5
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r4 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ri.k r1 = r4.f27765Y
            r0.m7087h(r1)
            cj.c r1 = r4.f27766Z
            r0.m7087h(r1)
            ej.s r1 = r4.f27767a0
            r0.m7087h(r1)
            ri.v r1 = r4.f27768b0
            if (r1 == 0) goto L27
            ri.d1 r2 = new ri.d1
            r3 = 0
            r2.<init>(r3, r3, r1)
            java.lang.Object r1 = r0.f11884Z
            java.util.Vector r1 = (java.util.Vector) r1
            r1.addElement(r2)
        L27:
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}
