package p317ri;

/* renamed from: ri.n1 */
/* loaded from: classes.dex */
public class C5899n1 extends p317ri.AbstractC5928y {
    public C5899n1(boolean r1, int r2, p317ri.InterfaceC5870e r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r4) {
            r3 = this;
            ri.e r0 = r3.f22757a0
            ri.s r0 = r0.mo168e()
            ri.s r0 = r0.mo12209A()
            boolean r1 = r3.f22756Z
            r2 = 160(0xa0, float:2.24E-43)
            if (r1 == 0) goto L20
            int r1 = r3.f22755Y
            r4.m12269i(r2, r1)
            int r1 = r0.mo12205q()
            r4.m12268g(r1)
            r4.mo12244h(r0)
            goto L31
        L20:
            boolean r1 = r0.mo12206w()
            if (r1 == 0) goto L27
            goto L29
        L27:
            r2 = 128(0x80, float:1.8E-43)
        L29:
            int r1 = r3.f22755Y
            r4.m12269i(r2, r1)
            r4.m12267f(r0)
        L31:
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r3 = this;
            ri.e r0 = r3.f22757a0
            ri.s r0 = r0.mo168e()
            ri.s r0 = r0.mo12209A()
            int r0 = r0.mo12205q()
            boolean r1 = r3.f22756Z
            if (r1 == 0) goto L1f
            int r1 = r3.f22755Y
            int r1 = p317ri.C5923v1.m12291b(r1)
            int r2 = p317ri.C5923v1.m12290a(r0)
            int r2 = r2 + r1
            int r2 = r2 + r0
            return r2
        L1f:
            int r0 = r0 + (-1)
            int r1 = r3.f22755Y
            int r1 = p317ri.C5923v1.m12291b(r1)
            int r1 = r1 + r0
            return r1
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: w */
    public boolean mo12206w() {
            r1 = this;
            boolean r0 = r1.f22756Z
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            ri.e r0 = r1.f22757a0
            ri.s r0 = r0.mo168e()
            ri.s r0 = r0.mo12209A()
            boolean r0 = r0.mo12206w()
            return r0
    }
}
