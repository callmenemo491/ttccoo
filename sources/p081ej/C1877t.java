package p081ej;

/* renamed from: ej.t */
/* loaded from: classes.dex */
public class C1877t extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p317ri.C5888k f8119Y;

    /* renamed from: Z */
    public p081ej.C1858a f8120Z;

    /* renamed from: a0 */
    public p042cj.C0991c f8121a0;

    /* renamed from: b0 */
    public p081ej.C1879v f8122b0;

    /* renamed from: c0 */
    public p081ej.C1879v f8123c0;

    /* renamed from: d0 */
    public p317ri.AbstractC5915t f8124d0;

    /* renamed from: e0 */
    public p081ej.C1868k f8125e0;

    public C1877t(p317ri.AbstractC5915t r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.size()
            r1 = 3
            if (r0 < r1) goto Lb3
            int r0 = r4.size()
            r1 = 7
            if (r0 > r1) goto Lb3
            r0 = 0
            ri.e r1 = r4.mo12277F(r0)
            boolean r1 = r1 instanceof p317ri.C5888k
            r2 = 1
            if (r1 == 0) goto L27
            ri.e r0 = r4.mo12277F(r0)
            ri.k r0 = p317ri.C5888k.m12240C(r0)
            r3.f8119Y = r0
            r0 = 1
            goto L2a
        L27:
            r1 = 0
            r3.f8119Y = r1
        L2a:
            int r1 = r0 + 1
            ri.e r0 = r4.mo12277F(r0)
            ej.a r0 = p081ej.C1858a.m4628n(r0)
            r3.f8120Z = r0
            int r0 = r1 + 1
            ri.e r1 = r4.mo12277F(r1)
            cj.c r1 = p042cj.C0991c.m2725n(r1)
            r3.f8121a0 = r1
            int r1 = r0 + 1
            ri.e r0 = r4.mo12277F(r0)
            ej.v r0 = p081ej.C1879v.m4638n(r0)
            r3.f8122b0 = r0
            int r0 = r4.size()
            if (r1 >= r0) goto L79
            ri.e r0 = r4.mo12277F(r1)
            boolean r0 = r0 instanceof p317ri.C5930z
            if (r0 != 0) goto L6c
            ri.e r0 = r4.mo12277F(r1)
            boolean r0 = r0 instanceof p317ri.C5882i
            if (r0 != 0) goto L6c
            ri.e r0 = r4.mo12277F(r1)
            boolean r0 = r0 instanceof p081ej.C1879v
            if (r0 == 0) goto L79
        L6c:
            int r0 = r1 + 1
            ri.e r1 = r4.mo12277F(r1)
            ej.v r1 = p081ej.C1879v.m4638n(r1)
            r3.f8123c0 = r1
            r1 = r0
        L79:
            int r0 = r4.size()
            if (r1 >= r0) goto L94
            ri.e r0 = r4.mo12277F(r1)
            boolean r0 = r0 instanceof p317ri.AbstractC5928y
            if (r0 != 0) goto L94
            int r0 = r1 + 1
            ri.e r1 = r4.mo12277F(r1)
            ri.t r1 = p317ri.AbstractC5915t.m12274C(r1)
            r3.f8124d0 = r1
            r1 = r0
        L94:
            int r0 = r4.size()
            if (r1 >= r0) goto Lb2
            ri.e r0 = r4.mo12277F(r1)
            boolean r0 = r0 instanceof p317ri.AbstractC5928y
            if (r0 == 0) goto Lb2
            ri.e r4 = r4.mo12277F(r1)
            ri.y r4 = (p317ri.AbstractC5928y) r4
            ri.t r4 = p317ri.AbstractC5915t.m12275D(r4, r2)
            ej.k r4 = p081ej.C1868k.m4630n(r4)
            r3.f8125e0 = r4
        Lb2:
            return
        Lb3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Bad sequence size: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r4 = r4.size()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r4 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ri.k r1 = r4.f8119Y
            if (r1 == 0) goto Le
            r0.m7087h(r1)
        Le:
            ej.a r1 = r4.f8120Z
            r0.m7087h(r1)
            cj.c r1 = r4.f8121a0
            r0.m7087h(r1)
            ej.v r1 = r4.f8122b0
            r0.m7087h(r1)
            ej.v r1 = r4.f8123c0
            if (r1 == 0) goto L24
            r0.m7087h(r1)
        L24:
            ri.t r1 = r4.f8124d0
            if (r1 == 0) goto L2b
            r0.m7087h(r1)
        L2b:
            ej.k r1 = r4.f8125e0
            if (r1 == 0) goto L3c
            ri.d1 r2 = new ri.d1
            r3 = 0
            r2.<init>(r3, r1)
            java.lang.Object r1 = r0.f11884Z
            java.util.Vector r1 = (java.util.Vector) r1
            r1.addElement(r2)
        L3c:
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}
