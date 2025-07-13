package p185k7;

/* renamed from: k7.g2 */
/* loaded from: classes.dex */
public final class C3811g2 {

    /* renamed from: a */
    public final androidx.appcompat.widget.C0311x f16646a;

    /* renamed from: b */
    public final p365v.C6476c f16647b;

    /* renamed from: c */
    public final p365v.C6476c f16648c;

    /* renamed from: d */
    public final androidx.lifecycle.C0435c0 f16649d;

    public C3811g2() {
            r4 = this;
            r4.<init>()
            androidx.appcompat.widget.x r0 = new androidx.appcompat.widget.x
            r1 = 15
            r0.<init>(r1)
            r4.f16646a = r0
            v.c r1 = new v.c
            r2 = 0
            r1.<init>(r2, r0)
            r4.f16648c = r1
            v.c r0 = r1.m13116h()
            r4.f16647b = r0
            androidx.lifecycle.c0 r0 = new androidx.lifecycle.c0
            r2 = 1
            r0.<init>(r2)
            r4.f16649d = r0
            k7.hc r2 = new k7.hc
            r2.<init>(r0)
            java.lang.String r3 = "require"
            r1.m13121m(r3, r2)
            k7.m1 r2 = p185k7.CallableC3892m1.f16741a
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.f2478a
            java.lang.String r3 = "internal.platform"
            r0.put(r3, r2)
            k7.g r0 = new k7.g
            r2 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0.<init>(r2)
            java.lang.String r2 = "runtime.counter"
            r1.m13121m(r2, r0)
            return
    }

    /* renamed from: a */
    public final p185k7.InterfaceC3916o m8549a(p365v.C6476c r5, p185k7.C3972s3... r6) {
            r4 = this;
            k7.o r0 = p185k7.InterfaceC3916o.f16782G
            int r1 = r6.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L22
            r0 = r6[r2]
            k7.o r0 = p052d6.C1306f0.m3777f(r0)
            v.c r3 = r4.f16648c
            p124h7.C2939x3.m7251A(r3)
            boolean r3 = r0 instanceof p185k7.C3929p
            if (r3 != 0) goto L19
            boolean r3 = r0 instanceof p185k7.C3903n
            if (r3 == 0) goto L1f
        L19:
            androidx.appcompat.widget.x r3 = r4.f16646a
            k7.o r0 = r3.m826r(r5, r0)
        L1f:
            int r2 = r2 + 1
            goto L4
        L22:
            return r0
    }
}
