package p185k7;

/* renamed from: k7.f */
/* loaded from: classes.dex */
public final class C3794f implements p185k7.InterfaceC3916o {

    /* renamed from: Y */
    public final p185k7.InterfaceC3916o f16621Y;

    /* renamed from: Z */
    public final java.lang.String f16622Z;

    public C3794f() {
            r1 = this;
            r1.<init>()
            r0 = 0
            throw r0
    }

    public C3794f(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            k7.o r0 = p185k7.InterfaceC3916o.f16782G
            r1.f16621Y = r0
            r1.f16622Z = r2
            return
    }

    public C3794f(java.lang.String r1, p185k7.InterfaceC3916o r2) {
            r0 = this;
            r0.<init>()
            r0.f16621Y = r2
            r0.f16622Z = r1
            return
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: e */
    public final java.lang.Boolean mo8353e() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Control is not a boolean"
            r0.<init>(r1)
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p185k7.C3794f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.String r1 = r4.f16622Z
            k7.f r5 = (p185k7.C3794f) r5
            java.lang.String r3 = r5.f16622Z
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L21
            k7.o r1 = r4.f16621Y
            k7.o r5 = r5.f16621Y
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: f */
    public final p185k7.InterfaceC3916o mo8354f() {
            r3 = this;
            k7.f r0 = new k7.f
            java.lang.String r1 = r3.f16622Z
            k7.o r2 = r3.f16621Y
            k7.o r2 = r2.mo8354f()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: g */
    public final java.lang.Double mo8355g() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Control is not a double"
            r0.<init>(r1)
            throw r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f16622Z
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            k7.o r1 = r2.f16621Y
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: i */
    public final java.lang.String mo8357i() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Control is not a String"
            r0.<init>(r1)
            throw r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: n */
    public final java.util.Iterator<p185k7.InterfaceC3916o> mo8360n() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: p */
    public final p185k7.InterfaceC3916o mo8361p(java.lang.String r1, p365v.C6476c r2, java.util.List<p185k7.InterfaceC3916o> r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Control does not have functions"
            r1.<init>(r2)
            throw r1
    }
}
