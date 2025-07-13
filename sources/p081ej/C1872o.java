package p081ej;

/* renamed from: ej.o */
/* loaded from: classes.dex */
public class C1872o extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p081ej.C1870m f8103Y;

    /* renamed from: Z */
    public p317ri.C5888k f8104Z;

    /* renamed from: a0 */
    public p317ri.C5898n0 f8105a0;

    public C1872o(p317ri.AbstractC5915t r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.size()
            r1 = 3
            r2 = 2
            if (r0 == r2) goto L29
            int r0 = r4.size()
            if (r0 != r1) goto L12
            goto L29
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Bad sequence size: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r4 = r4.size()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L29:
            r0 = 0
            ri.e r0 = r4.mo12277F(r0)
            ej.m r0 = p081ej.C1870m.m4632n(r0)
            r3.f8103Y = r0
            r0 = 1
            ri.e r0 = r4.mo12277F(r0)
            ri.k r0 = p317ri.C5888k.m12240C(r0)
            r3.f8104Z = r0
            int r0 = r4.size()
            if (r0 != r1) goto L4f
            ri.e r4 = r4.mo12277F(r2)
            ri.n0 r4 = p317ri.C5898n0.m12256E(r4)
            r3.f8105a0 = r4
        L4f:
            return
    }

    /* renamed from: n */
    public static p081ej.C1872o m4633n(p317ri.AbstractC5928y r0, boolean r1) {
            ri.t r0 = p317ri.AbstractC5915t.m12275D(r0, r1)
            boolean r1 = r0 instanceof p081ej.C1872o
            if (r1 == 0) goto Lb
            ej.o r0 = (p081ej.C1872o) r0
            goto L19
        Lb:
            if (r0 == 0) goto L18
            ej.o r1 = new ej.o
            ri.t r0 = p317ri.AbstractC5915t.m12274C(r0)
            r1.<init>(r0)
            r0 = r1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r2 = this;
            h7.rb r0 = new h7.rb
            r1 = 25
            r0.<init>(r1)
            ej.m r1 = r2.f8103Y
            r0.m7087h(r1)
            ri.k r1 = r2.f8104Z
            r0.m7087h(r1)
            ri.n0 r1 = r2.f8105a0
            if (r1 == 0) goto L18
            r0.m7087h(r1)
        L18:
            ri.a1 r1 = new ri.a1
            r1.<init>(r0)
            return r1
    }
}
