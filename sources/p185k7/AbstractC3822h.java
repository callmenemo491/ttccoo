package p185k7;

/* renamed from: k7.h */
/* loaded from: classes.dex */
public abstract class AbstractC3822h implements p185k7.InterfaceC3916o, p185k7.InterfaceC3864k {

    /* renamed from: Y */
    public final java.lang.String f16656Y;

    /* renamed from: Z */
    public final java.util.Map<java.lang.String, p185k7.InterfaceC3916o> f16657Z;

    public AbstractC3822h(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f16657Z = r0
            r1.f16656Y = r2
            return
    }

    @Override // p185k7.InterfaceC3864k
    /* renamed from: a */
    public final boolean mo8352a(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, k7.o> r0 = r1.f16657Z
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    /* renamed from: b */
    public abstract p185k7.InterfaceC3916o mo8522b(p365v.C6476c r1, java.util.List<p185k7.InterfaceC3916o> r2);

    @Override // p185k7.InterfaceC3916o
    /* renamed from: e */
    public final java.lang.Boolean mo8353e() {
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof p185k7.AbstractC3822h
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            k7.h r3 = (p185k7.AbstractC3822h) r3
            java.lang.String r0 = r2.f16656Y
            if (r0 == 0) goto L17
            java.lang.String r3 = r3.f16656Y
            boolean r3 = r0.equals(r3)
            return r3
        L17:
            return r1
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: f */
    public p185k7.InterfaceC3916o mo8354f() {
            r0 = this;
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

    @Override // p185k7.InterfaceC3864k
    /* renamed from: h */
    public final void mo8356h(java.lang.String r2, p185k7.InterfaceC3916o r3) {
            r1 = this;
            if (r3 != 0) goto L8
            java.util.Map<java.lang.String, k7.o> r3 = r1.f16657Z
            r3.remove(r2)
            return
        L8:
            java.util.Map<java.lang.String, k7.o> r0 = r1.f16657Z
            r0.put(r2, r3)
            return
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f16656Y
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: i */
    public final java.lang.String mo8357i() {
            r1 = this;
            java.lang.String r0 = r1.f16656Y
            return r0
    }

    @Override // p185k7.InterfaceC3864k
    /* renamed from: l */
    public final p185k7.InterfaceC3916o mo8358l(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, k7.o> r0 = r1.f16657Z
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L11
            java.util.Map<java.lang.String, k7.o> r0 = r1.f16657Z
            java.lang.Object r2 = r0.get(r2)
            k7.o r2 = (p185k7.InterfaceC3916o) r2
            return r2
        L11:
            k7.o r2 = p185k7.InterfaceC3916o.f16782G
            return r2
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: n */
    public final java.util.Iterator<p185k7.InterfaceC3916o> mo8360n() {
            r2 = this;
            java.util.Map<java.lang.String, k7.o> r0 = r2.f16657Z
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            k7.j r1 = new k7.j
            r1.<init>(r0)
            return r1
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: p */
    public final p185k7.InterfaceC3916o mo8361p(java.lang.String r2, p365v.C6476c r3, java.util.List<p185k7.InterfaceC3916o> r4) {
            r1 = this;
            java.lang.String r0 = "toString"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L10
            k7.r r2 = new k7.r
            java.lang.String r3 = r1.f16656Y
            r2.<init>(r3)
            return r2
        L10:
            k7.r r0 = new k7.r
            r0.<init>(r2)
            k7.o r2 = p185k7.C3836i.m8632q(r1, r0, r3, r4)
            return r2
    }
}
