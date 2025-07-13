package p081ej;

/* renamed from: ej.e */
/* loaded from: classes.dex */
public class C1862e extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p317ri.C5888k f8069Y;

    /* renamed from: Z */
    public p081ej.C1871n f8070Z;

    /* renamed from: a0 */
    public p081ej.C1859b f8071a0;

    /* renamed from: b0 */
    public p081ej.C1858a f8072b0;

    /* renamed from: c0 */
    public p317ri.C5888k f8073c0;

    /* renamed from: d0 */
    public p081ej.C1860c f8074d0;

    /* renamed from: e0 */
    public p317ri.AbstractC5915t f8075e0;

    /* renamed from: f0 */
    public p317ri.C5898n0 f8076f0;

    /* renamed from: g0 */
    public p081ej.C1868k f8077g0;

    public C1862e(p317ri.AbstractC5915t r7) {
            r6 = this;
            r6.<init>()
            int r0 = r7.size()
            r1 = 6
            if (r0 < r1) goto L134
            int r0 = r7.size()
            r2 = 9
            if (r0 > r2) goto L134
            r0 = 0
            ri.e r2 = r7.mo12277F(r0)
            boolean r2 = r2 instanceof p317ri.C5888k
            if (r2 == 0) goto L27
            ri.e r2 = r7.mo12277F(r0)
            ri.k r2 = p317ri.C5888k.m12240C(r2)
            r6.f8069Y = r2
            r2 = 1
            goto L31
        L27:
            ri.k r2 = new ri.k
            r3 = 0
            r2.<init>(r3)
            r6.f8069Y = r2
            r2 = 0
        L31:
            ri.e r3 = r7.mo12277F(r2)
            boolean r4 = r3 instanceof p081ej.C1871n
            r5 = 0
            if (r4 == 0) goto L3d
            ej.n r3 = (p081ej.C1871n) r3
            goto L59
        L3d:
            boolean r4 = r3 instanceof p317ri.AbstractC5928y
            if (r4 == 0) goto L4c
            ej.n r4 = new ej.n
            ri.y r3 = p317ri.AbstractC5928y.m12293C(r3)
            r4.<init>(r3)
        L4a:
            r3 = r4
            goto L59
        L4c:
            if (r3 == 0) goto L58
            ej.n r4 = new ej.n
            ri.t r3 = p317ri.AbstractC5915t.m12274C(r3)
            r4.<init>(r3)
            goto L4a
        L58:
            r3 = r5
        L59:
            r6.f8070Z = r3
            int r3 = r2 + 1
            ri.e r3 = r7.mo12277F(r3)
            if (r3 == 0) goto Lc0
            boolean r4 = r3 instanceof p081ej.C1859b
            if (r4 == 0) goto L68
            goto Lc0
        L68:
            boolean r4 = r3 instanceof p081ej.C1880w
            if (r4 == 0) goto L76
            ej.b r0 = new ej.b
            ej.w r3 = p081ej.C1880w.m4639n(r3)
            r0.<init>(r3)
            goto Lc3
        L76:
            boolean r4 = r3 instanceof p081ej.C1870m
            if (r4 == 0) goto L82
            ej.b r0 = new ej.b
            ej.m r3 = (p081ej.C1870m) r3
            r0.<init>(r3)
            goto Lc3
        L82:
            boolean r4 = r3 instanceof p317ri.AbstractC5928y
            if (r4 == 0) goto L97
            ej.b r4 = new ej.b
            ri.y r3 = (p317ri.AbstractC5928y) r3
            ri.t r0 = p317ri.AbstractC5915t.m12275D(r3, r0)
            ej.w r0 = p081ej.C1880w.m4639n(r0)
            r4.<init>(r0)
            r0 = r4
            goto Lc3
        L97:
            boolean r0 = r3 instanceof p317ri.AbstractC5915t
            if (r0 == 0) goto La5
            ej.b r0 = new ej.b
            ej.m r3 = p081ej.C1870m.m4632n(r3)
            r0.<init>(r3)
            goto Lc3
        La5:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unknown object in factory: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        Lc0:
            r0 = r3
            ej.b r0 = (p081ej.C1859b) r0
        Lc3:
            r6.f8071a0 = r0
            int r0 = r2 + 2
            ri.e r0 = r7.mo12277F(r0)
            ej.a r0 = p081ej.C1858a.m4628n(r0)
            r6.f8072b0 = r0
            int r0 = r2 + 3
            ri.e r0 = r7.mo12277F(r0)
            ri.k r0 = p317ri.C5888k.m12240C(r0)
            r6.f8073c0 = r0
            int r0 = r2 + 4
            ri.e r0 = r7.mo12277F(r0)
            boolean r3 = r0 instanceof p081ej.C1860c
            if (r3 == 0) goto Leb
            r5 = r0
            ej.c r5 = (p081ej.C1860c) r5
            goto Lf6
        Leb:
            if (r0 == 0) goto Lf6
            ej.c r5 = new ej.c
            ri.t r0 = p317ri.AbstractC5915t.m12274C(r0)
            r5.<init>(r0)
        Lf6:
            r6.f8074d0 = r5
            int r0 = r2 + 5
            ri.e r0 = r7.mo12277F(r0)
            ri.t r0 = p317ri.AbstractC5915t.m12274C(r0)
            r6.f8075e0 = r0
            int r2 = r2 + r1
        L105:
            int r0 = r7.size()
            if (r2 >= r0) goto L133
            ri.e r0 = r7.mo12277F(r2)
            boolean r1 = r0 instanceof p317ri.C5898n0
            if (r1 == 0) goto L11e
            ri.e r0 = r7.mo12277F(r2)
            ri.n0 r0 = p317ri.C5898n0.m12256E(r0)
            r6.f8076f0 = r0
            goto L130
        L11e:
            boolean r1 = r0 instanceof p317ri.AbstractC5915t
            if (r1 != 0) goto L126
            boolean r0 = r0 instanceof p081ej.C1868k
            if (r0 == 0) goto L130
        L126:
            ri.e r0 = r7.mo12277F(r2)
            ej.k r0 = p081ej.C1868k.m4630n(r0)
            r6.f8077g0 = r0
        L130:
            int r2 = r2 + 1
            goto L105
        L133:
            return
        L134:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Bad sequence size: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r7 = r7.size()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r2 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ri.k r1 = r2.f8069Y
            java.math.BigInteger r1 = r1.m12243E()
            int r1 = r1.intValue()
            if (r1 == 0) goto L18
            ri.k r1 = r2.f8069Y
            r0.m7087h(r1)
        L18:
            ej.n r1 = r2.f8070Z
            r0.m7087h(r1)
            ej.b r1 = r2.f8071a0
            r0.m7087h(r1)
            ej.a r1 = r2.f8072b0
            r0.m7087h(r1)
            ri.k r1 = r2.f8073c0
            r0.m7087h(r1)
            ej.c r1 = r2.f8074d0
            r0.m7087h(r1)
            ri.t r1 = r2.f8075e0
            r0.m7087h(r1)
            ri.n0 r1 = r2.f8076f0
            if (r1 == 0) goto L3d
            r0.m7087h(r1)
        L3d:
            ej.k r1 = r2.f8077g0
            if (r1 == 0) goto L44
            r0.m7087h(r1)
        L44:
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}
