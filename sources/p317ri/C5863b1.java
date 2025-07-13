package p317ri;

/* renamed from: ri.b1 */
/* loaded from: classes.dex */
public class C5863b1 extends p317ri.AbstractC5921v {

    /* renamed from: a0 */
    public final /* synthetic */ int f22672a0;

    /* renamed from: b0 */
    public int f22673b0;

    public C5863b1(int r3) {
            r2 = this;
            r2.f22672a0 = r3
            r0 = -1
            r1 = 1
            if (r3 == r1) goto Lc
            r2.<init>()
            r2.f22673b0 = r0
            return
        Lc:
            r2.<init>()
            r2.f22673b0 = r0
            return
    }

    public C5863b1(p124h7.C2839rb r2) {
            r1 = this;
            r0 = 1
            r1.f22672a0 = r0
            r0 = 0
            r1.<init>(r2, r0)
            r2 = -1
            r1.f22673b0 = r2
            return
    }

    public C5863b1(p124h7.C2839rb r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.f22672a0 = r0
            r1.<init>(r2, r3)
            r2 = -1
            r1.f22673b0 = r2
            return
    }

    public C5863b1(p317ri.InterfaceC5870e r2) {
            r1 = this;
            r0 = 1
            r1.f22672a0 = r0
            r1.<init>(r2)
            r2 = -1
            r1.f22673b0 = r2
            return
    }

    public C5863b1(p317ri.InterfaceC5870e[] r2) {
            r1 = this;
            r0 = 1
            r1.f22672a0 = r0
            r0 = 0
            r1.<init>(r2, r0)
            r2 = -1
            r1.f22673b0 = r2
            return
    }

    /* renamed from: K */
    public final int m12214K() {
            r3 = this;
            int r0 = r3.f22672a0
            r1 = 0
            switch(r0) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            goto L2e
        L7:
            int r0 = r3.f22673b0
            if (r0 >= 0) goto L2b
            java.util.Enumeration r0 = r3.m12288H()
        Lf:
            boolean r2 = r0.hasMoreElements()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.nextElement()
            ri.e r2 = (p317ri.InterfaceC5870e) r2
            ri.s r2 = r2.mo168e()
            ri.s r2 = r2.mo12212z()
            int r2 = r2.mo12205q()
            int r1 = r1 + r2
            goto Lf
        L29:
            r3.f22673b0 = r1
        L2b:
            int r0 = r3.f22673b0
            return r0
        L2e:
            int r0 = r3.f22673b0
            if (r0 >= 0) goto L52
            java.util.Enumeration r0 = r3.m12288H()
        L36:
            boolean r2 = r0.hasMoreElements()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r0.nextElement()
            ri.e r2 = (p317ri.InterfaceC5870e) r2
            ri.s r2 = r2.mo168e()
            ri.s r2 = r2.mo12209A()
            int r2 = r2.mo12205q()
            int r1 = r1 + r2
            goto L36
        L50:
            r3.f22673b0 = r1
        L52:
            int r0 = r3.f22673b0
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r4) {
            r3 = this;
            int r0 = r3.f22672a0
            r1 = 49
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L2b
        L8:
            ri.q r0 = r4.mo12262a()
            int r2 = r3.m12214K()
            r4.mo12264c(r1)
            r4.m12268g(r2)
            java.util.Enumeration r4 = r3.m12288H()
        L1a:
            boolean r1 = r4.hasMoreElements()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r4.nextElement()
            ri.e r1 = (p317ri.InterfaceC5870e) r1
            r0.mo12244h(r1)
            goto L1a
        L2a:
            return
        L2b:
            ri.q r0 = r4.mo12263b()
            int r2 = r3.m12214K()
            r4.mo12264c(r1)
            r4.m12268g(r2)
            java.util.Enumeration r4 = r3.m12288H()
        L3d:
            boolean r1 = r4.hasMoreElements()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r4.nextElement()
            ri.e r1 = (p317ri.InterfaceC5870e) r1
            r0.mo12244h(r1)
            goto L3d
        L4d:
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r2 = this;
            int r0 = r2.f22672a0
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            int r0 = r2.m12214K()
            int r1 = p317ri.C5923v1.m12290a(r0)
        Le:
            int r1 = r1 + 1
            int r1 = r1 + r0
            return r1
        L12:
            int r0 = r2.m12214K()
            int r1 = p317ri.C5923v1.m12290a(r0)
            goto Le
    }
}
