package p185k7;

/* renamed from: k7.p */
/* loaded from: classes.dex */
public final class C3929p implements p185k7.InterfaceC3916o {

    /* renamed from: Y */
    public final java.lang.String f16825Y;

    /* renamed from: Z */
    public final java.util.ArrayList<p185k7.InterfaceC3916o> f16826Z;

    public C3929p(java.lang.String r1, java.util.List<p185k7.InterfaceC3916o> r2) {
            r0 = this;
            r0.<init>()
            r0.f16825Y = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f16826Z = r1
            r1.addAll(r2)
            return
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: e */
    public final java.lang.Boolean mo8353e() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Statement cannot be cast as Boolean"
            r0.<init>(r1)
            throw r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            boolean r0 = r4 instanceof p185k7.C3929p
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            k7.p r4 = (p185k7.C3929p) r4
            java.lang.String r0 = r3.f16825Y
            if (r0 == 0) goto L19
            java.lang.String r2 = r4.f16825Y
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1e
            goto L1d
        L19:
            java.lang.String r0 = r4.f16825Y
            if (r0 == 0) goto L1e
        L1d:
            return r1
        L1e:
            java.util.ArrayList<k7.o> r0 = r3.f16826Z
            java.util.ArrayList<k7.o> r4 = r4.f16826Z
            boolean r4 = r0.equals(r4)
            return r4
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: f */
    public final p185k7.InterfaceC3916o mo8354f() {
            r0 = this;
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: g */
    public final java.lang.Double mo8355g() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Statement cannot be cast as Double"
            r0.<init>(r1)
            throw r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f16825Y
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            int r0 = r0 * 31
            java.util.ArrayList<k7.o> r1 = r2.f16826Z
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: i */
    public final java.lang.String mo8357i() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Statement cannot be cast as String"
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
            java.lang.String r2 = "Statement is not an evaluated entity"
            r1.<init>(r2)
            throw r1
    }
}
