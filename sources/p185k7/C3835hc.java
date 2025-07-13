package p185k7;

/* renamed from: k7.hc */
/* loaded from: classes.dex */
public final class C3835hc extends p185k7.AbstractC3822h {

    /* renamed from: a0 */
    public final androidx.lifecycle.C0435c0 f16666a0;

    /* renamed from: b0 */
    public final java.util.Map<java.lang.String, p185k7.AbstractC3822h> f16667b0;

    public C3835hc(androidx.lifecycle.C0435c0 r2) {
            r1 = this;
            java.lang.String r0 = "require"
            r1.<init>(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f16667b0 = r0
            r1.f16666a0 = r2
            return
    }

    @Override // p185k7.AbstractC3822h
    /* renamed from: b */
    public final p185k7.InterfaceC3916o mo8522b(p365v.C6476c r3, java.util.List<p185k7.InterfaceC3916o> r4) {
            r2 = this;
            java.lang.String r0 = "require"
            r1 = 1
            p124h7.C2939x3.m7264N(r0, r1, r4)
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            k7.o r4 = (p185k7.InterfaceC3916o) r4
            k7.o r3 = r3.m13117i(r4)
            java.lang.String r3 = r3.mo8357i()
            java.util.Map<java.lang.String, k7.h> r4 = r2.f16667b0
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L26
            java.util.Map<java.lang.String, k7.h> r4 = r2.f16667b0
            java.lang.Object r3 = r4.get(r3)
            k7.o r3 = (p185k7.InterfaceC3916o) r3
            return r3
        L26:
            androidx.lifecycle.c0 r4 = r2.f16666a0
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r4.f2478a
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L5c
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r4.f2478a
            java.lang.Object r4 = r4.get(r3)
            java.util.concurrent.Callable r4 = (java.util.concurrent.Callable) r4
            java.lang.Object r4 = r4.call()     // Catch: java.lang.Exception -> L3f
            k7.o r4 = (p185k7.InterfaceC3916o) r4     // Catch: java.lang.Exception -> L3f
            goto L5e
        L3f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "Failed to create API implementation: "
            int r1 = r3.length()
            if (r1 == 0) goto L53
            java.lang.String r3 = r0.concat(r3)
            goto L58
        L53:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
        L58:
            r4.<init>(r3)
            throw r4
        L5c:
            k7.o r4 = p185k7.InterfaceC3916o.f16782G
        L5e:
            boolean r0 = r4 instanceof p185k7.AbstractC3822h
            if (r0 == 0) goto L6a
            java.util.Map<java.lang.String, k7.h> r0 = r2.f16667b0
            r1 = r4
            k7.h r1 = (p185k7.AbstractC3822h) r1
            r0.put(r3, r1)
        L6a:
            return r4
    }
}
