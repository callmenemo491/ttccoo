package p185k7;

/* renamed from: k7.e */
/* loaded from: classes.dex */
public final class C3780e implements p185k7.InterfaceC3916o {

    /* renamed from: Y */
    public final boolean f16608Y;

    public C3780e(java.lang.Boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L9
            r1 = 0
        L6:
            r0.f16608Y = r1
            return
        L9:
            boolean r1 = r1.booleanValue()
            goto L6
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: e */
    public final java.lang.Boolean mo8353e() {
            r1 = this;
            boolean r0 = r1.f16608Y
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p185k7.C3780e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k7.e r4 = (p185k7.C3780e) r4
            boolean r1 = r3.f16608Y
            boolean r4 = r4.f16608Y
            if (r1 != r4) goto L13
            return r0
        L13:
            return r2
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: f */
    public final p185k7.InterfaceC3916o mo8354f() {
            r2 = this;
            k7.e r0 = new k7.e
            boolean r1 = r2.f16608Y
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.<init>(r1)
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: g */
    public final java.lang.Double mo8355g() {
            r2 = this;
            boolean r0 = r2.f16608Y
            r1 = 1
            if (r1 == r0) goto L8
            r0 = 0
            goto La
        L8:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        La:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.f16608Y
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            int r0 = r0.hashCode()
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: i */
    public final java.lang.String mo8357i() {
            r1 = this;
            boolean r0 = r1.f16608Y
            java.lang.String r0 = java.lang.Boolean.toString(r0)
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
    public final p185k7.InterfaceC3916o mo8361p(java.lang.String r3, p365v.C6476c r4, java.util.List<p185k7.InterfaceC3916o> r5) {
            r2 = this;
            java.lang.String r4 = "toString"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L14
            k7.r r3 = new k7.r
            boolean r4 = r2.f16608Y
            java.lang.String r4 = java.lang.Boolean.toString(r4)
            r3.<init>(r4)
            return r3
        L14:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 0
            boolean r1 = r2.f16608Y
            java.lang.String r1 = java.lang.Boolean.toString(r1)
            r5[r0] = r1
            r0 = 1
            r5[r0] = r3
            java.lang.String r3 = "%s.%s is not a function."
            java.lang.String r3 = java.lang.String.format(r3, r5)
            r4.<init>(r3)
            throw r4
    }

    public final java.lang.String toString() {
            r1 = this;
            boolean r0 = r1.f16608Y
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
