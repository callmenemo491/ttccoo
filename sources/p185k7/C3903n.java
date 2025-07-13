package p185k7;

/* renamed from: k7.n */
/* loaded from: classes.dex */
public final class C3903n extends p185k7.AbstractC3822h {

    /* renamed from: a0 */
    public final java.util.List<java.lang.String> f16752a0;

    /* renamed from: b0 */
    public final java.util.List<p185k7.InterfaceC3916o> f16753b0;

    /* renamed from: c0 */
    public p365v.C6476c f16754c0;

    public C3903n(java.lang.String r1, java.util.List<p185k7.InterfaceC3916o> r2, java.util.List<p185k7.InterfaceC3916o> r3, p365v.C6476c r4) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f16752a0 = r1
            r0.f16754c0 = r4
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L2c
            java.util.Iterator r1 = r2.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            k7.o r2 = (p185k7.InterfaceC3916o) r2
            java.util.List<java.lang.String> r4 = r0.f16752a0
            java.lang.String r2 = r2.mo8357i()
            r4.add(r2)
            goto L16
        L2c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            r0.f16753b0 = r1
            return
    }

    public C3903n(p185k7.C3903n r3) {
            r2 = this;
            java.lang.String r0 = r3.f16656Y
            r2.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<java.lang.String> r1 = r3.f16752a0
            int r1 = r1.size()
            r0.<init>(r1)
            r2.f16752a0 = r0
            java.util.List<java.lang.String> r1 = r3.f16752a0
            r0.addAll(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<k7.o> r1 = r3.f16753b0
            int r1 = r1.size()
            r0.<init>(r1)
            r2.f16753b0 = r0
            java.util.List<k7.o> r1 = r3.f16753b0
            r0.addAll(r1)
            v.c r3 = r3.f16754c0
            r2.f16754c0 = r3
            return
    }

    @Override // p185k7.AbstractC3822h
    /* renamed from: b */
    public final p185k7.InterfaceC3916o mo8522b(p365v.C6476c r5, java.util.List<p185k7.InterfaceC3916o> r6) {
            r4 = this;
            v.c r0 = r4.f16754c0
            v.c r0 = r0.m13116h()
            r1 = 0
        L7:
            java.util.List<java.lang.String> r2 = r4.f16752a0
            int r2 = r2.size()
            if (r1 >= r2) goto L38
            int r2 = r6.size()
            if (r1 >= r2) goto L28
            java.util.List<java.lang.String> r2 = r4.f16752a0
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r6.get(r1)
            k7.o r3 = (p185k7.InterfaceC3916o) r3
            k7.o r3 = r5.m13117i(r3)
            goto L32
        L28:
            java.util.List<java.lang.String> r2 = r4.f16752a0
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            k7.o r3 = p185k7.InterfaceC3916o.f16782G
        L32:
            r0.m13120l(r2, r3)
            int r1 = r1 + 1
            goto L7
        L38:
            java.util.List<k7.o> r5 = r4.f16753b0
            java.util.Iterator r5 = r5.iterator()
        L3e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L5f
            java.lang.Object r6 = r5.next()
            k7.o r6 = (p185k7.InterfaceC3916o) r6
            k7.o r1 = r0.m13117i(r6)
            boolean r2 = r1 instanceof p185k7.C3929p
            if (r2 == 0) goto L56
            k7.o r1 = r0.m13117i(r6)
        L56:
            boolean r6 = r1 instanceof p185k7.C3794f
            if (r6 == 0) goto L3e
            k7.f r1 = (p185k7.C3794f) r1
            k7.o r5 = r1.f16621Y
            return r5
        L5f:
            k7.o r5 = p185k7.InterfaceC3916o.f16782G
            return r5
    }

    @Override // p185k7.AbstractC3822h, p185k7.InterfaceC3916o
    /* renamed from: f */
    public final p185k7.InterfaceC3916o mo8354f() {
            r1 = this;
            k7.n r0 = new k7.n
            r0.<init>(r1)
            return r0
    }
}
