package p317ri;

/* renamed from: ri.s */
/* loaded from: classes.dex */
public abstract class AbstractC5912s extends p317ri.AbstractC5894m {
    public AbstractC5912s() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: u */
    public static p317ri.AbstractC5912s m12271u(byte[] r1) {
            ri.j r0 = new ri.j
            r0.<init>(r1)
            ri.s r1 = r0.m12237A()     // Catch: java.lang.ClassCastException -> L18
            int r0 = r0.available()     // Catch: java.lang.ClassCastException -> L18
            if (r0 != 0) goto L10
            return r1
        L10:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.ClassCastException -> L18
            java.lang.String r0 = "Extra data detected in stream"
            r1.<init>(r0)     // Catch: java.lang.ClassCastException -> L18
            throw r1     // Catch: java.lang.ClassCastException -> L18
        L18:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "cannot recognise object in stream"
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: A */
    public p317ri.AbstractC5912s mo12209A() {
            r0 = this;
            return r0
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r0 = this;
            return r0
    }

    @Override // p317ri.AbstractC5894m
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof p317ri.InterfaceC5870e
            if (r1 == 0) goto L15
            ri.e r3 = (p317ri.InterfaceC5870e) r3
            ri.s r3 = r3.mo168e()
            boolean r3 = r2.mo12203n(r3)
            if (r3 == 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    /* renamed from: n */
    public abstract boolean mo12203n(p317ri.AbstractC5912s r1);

    /* renamed from: p */
    public abstract void mo12204p(p317ri.C5906q r1);

    /* renamed from: q */
    public abstract int mo12205q();

    /* renamed from: w */
    public abstract boolean mo12206w();

    /* renamed from: z */
    public p317ri.AbstractC5912s mo12212z() {
            r0 = this;
            return r0
    }
}
