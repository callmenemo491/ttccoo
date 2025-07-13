package p185k7;

/* renamed from: k7.gc */
/* loaded from: classes.dex */
public final class C3821gc extends p185k7.AbstractC3822h {

    /* renamed from: a0 */
    public final boolean f16653a0;

    /* renamed from: b0 */
    public final boolean f16654b0;

    /* renamed from: c0 */
    public final /* synthetic */ p185k7.C3787e6 f16655c0;

    public C3821gc(p185k7.C3787e6 r1, boolean r2, boolean r3) {
            r0 = this;
            r0.f16655c0 = r1
            java.lang.String r1 = "log"
            r0.<init>(r1)
            r0.f16653a0 = r2
            r0.f16654b0 = r3
            return
    }

    @Override // p185k7.AbstractC3822h
    /* renamed from: b */
    public final p185k7.InterfaceC3916o mo8522b(p365v.C6476c r12, java.util.List<p185k7.InterfaceC3916o> r13) {
            r11 = this;
            java.lang.String r0 = "log"
            r1 = 1
            p124h7.C2939x3.m7266P(r0, r1, r13)
            int r0 = r13.size()
            r2 = 0
            if (r0 != r1) goto L31
            k7.e6 r0 = r11.f16655c0
            java.lang.Object r0 = r0.f16615b0
            r3 = r0
            o7.z3 r3 = (p249o7.C5153z3) r3
            r4 = 3
            java.lang.Object r13 = r13.get(r2)
            k7.o r13 = (p185k7.InterfaceC3916o) r13
            k7.o r12 = r12.m13117i(r13)
            java.lang.String r5 = r12.mo8357i()
            java.util.List r6 = java.util.Collections.emptyList()
            boolean r7 = r11.f16653a0
            boolean r8 = r11.f16654b0
            r3.m11456b(r4, r5, r6, r7, r8)
        L2e:
            k7.o r12 = p185k7.InterfaceC3916o.f16782G
            return r12
        L31:
            java.lang.Object r0 = r13.get(r2)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r12.m13117i(r0)
            java.lang.Double r0 = r0.mo8355g()
            double r2 = r0.doubleValue()
            int r0 = p124h7.C2939x3.m7296v(r2)
            r2 = 3
            r3 = 5
            r4 = 2
            if (r0 == r4) goto L5b
            if (r0 == r2) goto L59
            if (r0 == r3) goto L57
            r5 = 6
            if (r0 == r5) goto L55
            r6 = 3
            goto L5d
        L55:
            r6 = 2
            goto L5d
        L57:
            r6 = 5
            goto L5d
        L59:
            r6 = 1
            goto L5d
        L5b:
            r2 = 4
            r6 = 4
        L5d:
            java.lang.Object r0 = r13.get(r1)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r12.m13117i(r0)
            java.lang.String r7 = r0.mo8357i()
            int r0 = r13.size()
            if (r0 != r4) goto L84
            k7.e6 r12 = r11.f16655c0
            java.lang.Object r12 = r12.f16615b0
            r5 = r12
            o7.z3 r5 = (p249o7.C5153z3) r5
            java.util.List r8 = java.util.Collections.emptyList()
        L7c:
            boolean r9 = r11.f16653a0
            boolean r10 = r11.f16654b0
            r5.m11456b(r6, r7, r8, r9, r10)
            goto L2e
        L84:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L89:
            int r0 = r13.size()
            int r0 = java.lang.Math.min(r0, r3)
            if (r4 >= r0) goto La7
            java.lang.Object r0 = r13.get(r4)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r12.m13117i(r0)
            java.lang.String r0 = r0.mo8357i()
            r8.add(r0)
            int r4 = r4 + 1
            goto L89
        La7:
            k7.e6 r12 = r11.f16655c0
            java.lang.Object r12 = r12.f16615b0
            r5 = r12
            o7.z3 r5 = (p249o7.C5153z3) r5
            goto L7c
    }
}
