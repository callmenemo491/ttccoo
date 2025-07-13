package p317ri;

/* renamed from: ri.m1 */
/* loaded from: classes.dex */
public class C5896m1 extends p317ri.AbstractC5915t {

    /* renamed from: Z */
    public int f22717Z;

    public C5896m1() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f22717Z = r0
            return
    }

    public C5896m1(p124h7.C2839rb r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1
            r0.f22717Z = r1
            return
    }

    public C5896m1(p317ri.InterfaceC5870e r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1
            r0.f22717Z = r1
            return
    }

    /* renamed from: K */
    public final int m12247K() {
            r3 = this;
            int r0 = r3.f22717Z
            if (r0 >= 0) goto L25
            r0 = 0
            java.util.Enumeration r1 = r3.mo12278H()
        L9:
            boolean r2 = r1.hasMoreElements()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.nextElement()
            ri.e r2 = (p317ri.InterfaceC5870e) r2
            ri.s r2 = r2.mo168e()
            ri.s r2 = r2.mo12209A()
            int r2 = r2.mo12205q()
            int r0 = r0 + r2
            goto L9
        L23:
            r3.f22717Z = r0
        L25:
            int r0 = r3.f22717Z
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r4) {
            r3 = this;
            ri.q r0 = r4.mo12263b()
            int r1 = r3.m12247K()
            r2 = 48
            r4.mo12264c(r2)
            r4.m12268g(r1)
            java.util.Enumeration r4 = r3.mo12278H()
        L14:
            boolean r1 = r4.hasMoreElements()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r4.nextElement()
            ri.e r1 = (p317ri.InterfaceC5870e) r1
            r0.mo12244h(r1)
            goto L14
        L24:
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r2 = this;
            int r0 = r2.m12247K()
            int r1 = p317ri.C5923v1.m12290a(r0)
            int r1 = r1 + 1
            int r1 = r1 + r0
            return r1
    }
}
