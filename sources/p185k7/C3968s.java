package p185k7;

/* renamed from: k7.s */
/* loaded from: classes.dex */
public final class C3968s implements p185k7.InterfaceC3916o {
    public C3968s() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: e */
    public final java.lang.Boolean mo8353e() {
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L4
            r1 = 1
            return r1
        L4:
            boolean r1 = r1 instanceof p185k7.C3968s
            return r1
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: f */
    public final p185k7.InterfaceC3916o mo8354f() {
            r1 = this;
            k7.o r0 = p185k7.InterfaceC3916o.f16782G
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: g */
    public final java.lang.Double mo8355g() {
            r2 = this;
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: i */
    public final java.lang.String mo8357i() {
            r1 = this;
            java.lang.String r0 = "undefined"
            return r0
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
    public final p185k7.InterfaceC3916o mo8361p(java.lang.String r2, p365v.C6476c r3, java.util.List<p185k7.InterfaceC3916o> r4) {
            r1 = this;
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            r4[r0] = r2
            java.lang.String r2 = "Undefined has no function %s"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            r3.<init>(r2)
            throw r3
    }
}
