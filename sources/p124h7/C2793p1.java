package p124h7;

/* renamed from: h7.p1 */
/* loaded from: classes.dex */
public final class C2793p1 {

    /* renamed from: a */
    public final p124h7.C2744m6 f11821a;

    public C2793p1(p124h7.C2744m6 r1) {
            r0 = this;
            r0.<init>()
            r0.f11821a = r1
            return
    }

    /* renamed from: a */
    public static p124h7.C2793p1 m7027a(java.lang.String r3, byte[] r4, int r5) {
            h7.p1 r0 = new h7.p1
            h7.l6 r1 = p124h7.C2744m6.m6974r()
            r1.m6960f(r3)
            int r3 = r4.length
            r2 = 0
            h7.cg r3 = p124h7.AbstractC2574cg.m6534A(r4, r2, r3)
            r1.m6961g(r3)
            int r5 = r5 + (-1)
            if (r5 == 0) goto L25
            r3 = 1
            if (r5 == r3) goto L22
            r3 = 2
            if (r5 == r3) goto L1f
            h7.d7 r3 = p124h7.EnumC2583d7.f11445d0
            goto L27
        L1f:
            h7.d7 r3 = p124h7.EnumC2583d7.f11444c0
            goto L27
        L22:
            h7.d7 r3 = p124h7.EnumC2583d7.f11443b0
            goto L27
        L25:
            h7.d7 r3 = p124h7.EnumC2583d7.f11442a0
        L27:
            r1.m6959e(r3)
            h7.yg r3 = r1.m7220b()
            h7.m6 r3 = (p124h7.C2744m6) r3
            r0.<init>(r3)
            return r0
    }
}
