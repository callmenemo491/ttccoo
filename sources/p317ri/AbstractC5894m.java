package p317ri;

/* renamed from: ri.m */
/* loaded from: classes.dex */
public abstract class AbstractC5894m implements p317ri.InterfaceC5870e {
    public AbstractC5894m() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p317ri.InterfaceC5870e
    /* renamed from: e */
    public abstract p317ri.AbstractC5912s mo168e();

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p317ri.InterfaceC5870e
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            ri.e r2 = (p317ri.InterfaceC5870e) r2
            ri.s r0 = r1.mo168e()
            ri.s r2 = r2.mo168e()
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            ri.s r0 = r1.mo168e()
            int r0 = r0.hashCode()
            return r0
    }

    /* renamed from: l */
    public byte[] m12245l() {
            r2 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            ri.q r1 = new ri.q
            r1.<init>(r0)
            r1.mo12244h(r2)
            byte[] r0 = r0.toByteArray()
            return r0
    }

    /* renamed from: m */
    public byte[] m12246m(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "DER"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            ri.y0 r0 = new ri.y0
            r0.<init>(r2)
            r0.mo12244h(r1)
            goto L2b
        L16:
            java.lang.String r0 = "DL"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L30
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            ri.l1 r0 = new ri.l1
            r0.<init>(r2)
            r0.mo12244h(r1)
        L2b:
            byte[] r2 = r2.toByteArray()
            return r2
        L30:
            byte[] r2 = r1.m12245l()
            return r2
    }
}
