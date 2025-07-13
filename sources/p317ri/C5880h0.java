package p317ri;

/* renamed from: ri.h0 */
/* loaded from: classes.dex */
public class C5880h0 extends p317ri.AbstractC5921v {
    public C5880h0(p124h7.C2839rb r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C5880h0(p317ri.InterfaceC5870e r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public C5880h0(p317ri.InterfaceC5870e[] r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r3) {
            r2 = this;
            r0 = 49
            r3.mo12264c(r0)
            r0 = 128(0x80, float:1.8E-43)
            r3.mo12264c(r0)
            java.util.Enumeration r0 = r2.m12288H()
        Le:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.nextElement()
            ri.e r1 = (p317ri.InterfaceC5870e) r1
            r3.mo12244h(r1)
            goto Le
        L1e:
            r0 = 0
            r3.mo12264c(r0)
            r3.mo12264c(r0)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r3 = this;
            java.util.Enumeration r0 = r3.m12288H()
            r1 = 0
        L5:
            boolean r2 = r0.hasMoreElements()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r0.nextElement()
            ri.e r2 = (p317ri.InterfaceC5870e) r2
            ri.s r2 = r2.mo168e()
            int r2 = r2.mo12205q()
            int r1 = r1 + r2
            goto L5
        L1b:
            int r1 = r1 + 2
            int r1 = r1 + 2
            return r1
    }
}
