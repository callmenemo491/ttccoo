package p081ej;

/* renamed from: ej.f */
/* loaded from: classes.dex */
public class C1863f extends p317ri.AbstractC5894m {

    /* renamed from: Y */
    public p317ri.AbstractC5915t f8078Y;

    /* renamed from: Z */
    public p081ej.C1878u f8079Z;

    public C1863f(p317ri.AbstractC5915t r3) {
            r2 = this;
            r2.<init>()
            r2.f8078Y = r3
            int r0 = r3.size()
            r1 = 3
            if (r0 != r1) goto L39
            r0 = 0
            ri.e r0 = r3.mo12277F(r0)
            boolean r1 = r0 instanceof p081ej.C1878u
            if (r1 == 0) goto L18
            ej.u r0 = (p081ej.C1878u) r0
            goto L26
        L18:
            if (r0 == 0) goto L25
            ej.u r1 = new ej.u
            ri.t r0 = p317ri.AbstractC5915t.m12274C(r0)
            r1.<init>(r0)
            r0 = r1
            goto L26
        L25:
            r0 = 0
        L26:
            r2.f8079Z = r0
            r0 = 1
            ri.e r0 = r3.mo12277F(r0)
            p081ej.C1858a.m4628n(r0)
            r0 = 2
            ri.e r3 = r3.mo12277F(r0)
            p317ri.C5898n0.m12256E(r3)
            return
        L39:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "sequence wrong size for a certificate"
            r3.<init>(r0)
            throw r3
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r1 = this;
            ri.t r0 = r1.f8078Y
            return r0
    }
}
