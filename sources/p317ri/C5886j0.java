package p317ri;

/* renamed from: ri.j0 */
/* loaded from: classes.dex */
public class C5886j0 extends p317ri.AbstractC5928y {
    public C5886j0(int r2, p317ri.InterfaceC5870e r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2, r3)
            return
    }

    public C5886j0(boolean r1, int r2, p317ri.InterfaceC5870e r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r4) {
            r3 = this;
            int r0 = r3.f22755Y
            r1 = 160(0xa0, float:2.24E-43)
            r4.m12269i(r1, r0)
            r0 = 128(0x80, float:1.8E-43)
            r4.mo12264c(r0)
            boolean r0 = r3.f22756Z
            r1 = 0
            if (r0 != 0) goto L74
            ri.e r0 = r3.f22757a0
            boolean r2 = r0 instanceof p317ri.AbstractC5900o
            if (r2 == 0) goto L32
            boolean r2 = r0 instanceof p317ri.C5868d0
            if (r2 == 0) goto L22
            ri.d0 r0 = (p317ri.C5868d0) r0
            java.util.Enumeration r0 = r0.m12220F()
            goto L47
        L22:
            ri.o r0 = (p317ri.AbstractC5900o) r0
            ri.d0 r2 = new ri.d0
            byte[] r0 = r0.mo12219E()
            r2.<init>(r0)
            java.util.Enumeration r0 = r2.m12220F()
            goto L47
        L32:
            boolean r2 = r0 instanceof p317ri.AbstractC5915t
            if (r2 == 0) goto L3d
            ri.t r0 = (p317ri.AbstractC5915t) r0
            java.util.Enumeration r0 = r0.mo12278H()
            goto L47
        L3d:
            boolean r2 = r0 instanceof p317ri.AbstractC5921v
            if (r2 == 0) goto L57
            ri.v r0 = (p317ri.AbstractC5921v) r0
            java.util.Enumeration r0 = r0.m12288H()
        L47:
            boolean r2 = r0.hasMoreElements()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r0.nextElement()
            ri.e r2 = (p317ri.InterfaceC5870e) r2
            r4.mo12244h(r2)
            goto L47
        L57:
            ri.g r4 = new ri.g
            java.lang.String r0 = "not implemented: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            ri.e r2 = r3.f22757a0
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0, r1)
            throw r4
        L74:
            ri.e r0 = r3.f22757a0
            r4.mo12244h(r0)
        L79:
            r4.mo12264c(r1)
            r4.mo12264c(r1)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r3 = this;
            ri.e r0 = r3.f22757a0
            ri.s r0 = r0.mo168e()
            int r0 = r0.mo12205q()
            boolean r1 = r3.f22756Z
            if (r1 == 0) goto L1b
            int r1 = r3.f22755Y
            int r1 = p317ri.C5923v1.m12291b(r1)
            int r2 = p317ri.C5923v1.m12290a(r0)
            int r2 = r2 + r1
            int r2 = r2 + r0
            return r2
        L1b:
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
            ri.s r0 = r0.mo12212z()
            boolean r0 = r0.mo12206w()
            return r0
    }
}
