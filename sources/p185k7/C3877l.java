package p185k7;

/* renamed from: k7.l */
/* loaded from: classes.dex */
public class C3877l implements p185k7.InterfaceC3916o, p185k7.InterfaceC3864k {

    /* renamed from: Y */
    public final java.util.Map<java.lang.String, p185k7.InterfaceC3916o> f16729Y;

    public C3877l() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f16729Y = r0
            return
    }

    @Override // p185k7.InterfaceC3864k
    /* renamed from: a */
    public final boolean mo8352a(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, k7.o> r0 = r1.f16729Y
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: e */
    public final java.lang.Boolean mo8353e() {
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p185k7.C3877l
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            k7.l r2 = (p185k7.C3877l) r2
            java.util.Map<java.lang.String, k7.o> r0 = r1.f16729Y
            java.util.Map<java.lang.String, k7.o> r2 = r2.f16729Y
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: f */
    public final p185k7.InterfaceC3916o mo8354f() {
            r5 = this;
            k7.l r0 = new k7.l
            r0.<init>()
            java.util.Map<java.lang.String, k7.o> r1 = r5.f16729Y
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r3 instanceof p185k7.InterfaceC3864k
            if (r3 == 0) goto L32
            java.util.Map<java.lang.String, k7.o> r3 = r0.f16729Y
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getValue()
            k7.o r2 = (p185k7.InterfaceC3916o) r2
            goto L44
        L32:
            java.util.Map<java.lang.String, k7.o> r3 = r0.f16729Y
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getValue()
            k7.o r2 = (p185k7.InterfaceC3916o) r2
            k7.o r2 = r2.mo8354f()
        L44:
            r3.put(r4, r2)
            goto Lf
        L48:
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
            java.util.Map<java.lang.String, k7.o> r3 = r1.f16729Y
            r3.remove(r2)
            return
        L8:
            java.util.Map<java.lang.String, k7.o> r0 = r1.f16729Y
            r0.put(r2, r3)
            return
    }

    public final int hashCode() {
            r1 = this;
            java.util.Map<java.lang.String, k7.o> r0 = r1.f16729Y
            int r0 = r0.hashCode()
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: i */
    public final java.lang.String mo8357i() {
            r1 = this;
            java.lang.String r0 = "[object Object]"
            return r0
    }

    @Override // p185k7.InterfaceC3864k
    /* renamed from: l */
    public final p185k7.InterfaceC3916o mo8358l(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, k7.o> r0 = r1.f16729Y
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L11
            java.util.Map<java.lang.String, k7.o> r0 = r1.f16729Y
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
            java.util.Map<java.lang.String, k7.o> r0 = r2.f16729Y
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            k7.j r1 = new k7.j
            r1.<init>(r0)
            return r1
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: p */
    public p185k7.InterfaceC3916o mo8361p(java.lang.String r2, p365v.C6476c r3, java.util.List<p185k7.InterfaceC3916o> r4) {
            r1 = this;
            java.lang.String r0 = "toString"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L12
            k7.r r2 = new k7.r
            java.lang.String r3 = r1.toString()
            r2.<init>(r3)
            return r2
        L12:
            k7.r r0 = new k7.r
            r0.<init>(r2)
            k7.o r2 = p185k7.C3836i.m8632q(r1, r0, r3, r4)
            return r2
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{"
            r0.<init>(r1)
            java.util.Map<java.lang.String, k7.o> r1 = r6.f16729Y
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L47
            java.util.Map<java.lang.String, k7.o> r1 = r6.f16729Y
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            r4 = 1
            java.util.Map<java.lang.String, k7.o> r5 = r6.f16729Y
            java.lang.Object r2 = r5.get(r2)
            r3[r4] = r2
            java.lang.String r2 = "%s: %s,"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r0.append(r2)
            goto L19
        L3e:
            java.lang.String r1 = ","
            int r1 = r0.lastIndexOf(r1)
            r0.deleteCharAt(r1)
        L47:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
