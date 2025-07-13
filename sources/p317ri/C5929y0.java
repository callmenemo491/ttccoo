package p317ri;

/* renamed from: ri.y0 */
/* loaded from: classes.dex */
public class C5929y0 extends p317ri.C5906q {
    public C5929y0(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // p317ri.C5906q
    /* renamed from: a */
    public p317ri.C5906q mo12262a() {
            r0 = this;
            return r0
    }

    @Override // p317ri.C5906q
    /* renamed from: b */
    public p317ri.C5906q mo12263b() {
            r0 = this;
            return r0
    }

    @Override // p317ri.C5906q
    /* renamed from: h */
    public void mo12244h(p317ri.InterfaceC5870e r2) {
            r1 = this;
            if (r2 == 0) goto Le
            ri.s r2 = r2.mo168e()
            ri.s r2 = r2.mo12212z()
            r2.mo12204p(r1)
            return
        Le:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r0 = "null object detected"
            r2.<init>(r0)
            throw r2
    }
}
