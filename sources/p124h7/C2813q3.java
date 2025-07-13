package p124h7;

/* renamed from: h7.q3 */
/* loaded from: classes.dex */
public final class C2813q3 extends p366v0.AbstractC6484c {
    public C2813q3(java.lang.Class r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // p366v0.AbstractC6484c
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2935x mo7013i(p124h7.AbstractC2574cg r2) {
            r1 = this;
            h7.mg r0 = p124h7.C2754mg.m6988a()
            h7.z3 r2 = p124h7.C2975z3.m7342v(r2, r0)
            return r2
    }

    @Override // p366v0.AbstractC6484c
    /* renamed from: j */
    public final java.lang.Object mo7014j(p124h7.InterfaceC2935x r5) {
            r4 = this;
            h7.z3 r5 = (p124h7.C2975z3) r5
            h7.v3 r0 = p124h7.C2921w3.m7225s()
            boolean r1 = r0.f11974a0
            r2 = 0
            if (r1 == 0) goto L10
            r0.m7222d()
            r0.f11974a0 = r2
        L10:
            MessageType extends h7.yg<MessageType, BuilderType> r1 = r0.f11973Z
            h7.w3 r1 = (p124h7.C2921w3) r1
            p124h7.C2921w3.m7228y(r1)
            int r1 = r5.m7345r()
            byte[] r1 = p124h7.C2566c8.m6531a(r1)
            int r3 = r1.length
            h7.cg r1 = p124h7.AbstractC2574cg.m6534A(r1, r2, r3)
            boolean r3 = r0.f11974a0
            if (r3 == 0) goto L2d
            r0.m7222d()
            r0.f11974a0 = r2
        L2d:
            MessageType extends h7.yg<MessageType, BuilderType> r3 = r0.f11973Z
            h7.w3 r3 = (p124h7.C2921w3) r3
            p124h7.C2921w3.m7229z(r3, r1)
            h7.b4 r5 = r5.m7346w()
            boolean r1 = r0.f11974a0
            if (r1 == 0) goto L41
            r0.m7222d()
            r0.f11974a0 = r2
        L41:
            MessageType extends h7.yg<MessageType, BuilderType> r1 = r0.f11973Z
            h7.w3 r1 = (p124h7.C2921w3) r1
            p124h7.C2921w3.m7224A(r1, r5)
            h7.yg r5 = r0.m7220b()
            h7.w3 r5 = (p124h7.C2921w3) r5
            return r5
    }

    @Override // p366v0.AbstractC6484c
    /* renamed from: k */
    public final java.util.Map<java.lang.String, p124h7.C2811q1<p124h7.C2975z3>> mo7015k() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            h7.q1 r1 = new h7.q1
            h7.y3 r2 = p124h7.C2975z3.m7340s()
            r2.m7312e()
            h7.a4 r3 = p124h7.C2544b4.m6480s()
            r3.m6464e()
            h7.yg r3 = r3.m7220b()
            h7.b4 r3 = (p124h7.C2544b4) r3
            r2.m7313f(r3)
            h7.yg r2 = r2.m7220b()
            h7.z3 r2 = (p124h7.C2975z3) r2
            r3 = 1
            r1.<init>(r2, r3)
            java.lang.String r2 = "AES_CMAC"
            r0.put(r2, r1)
            h7.q1 r1 = new h7.q1
            h7.y3 r2 = p124h7.C2975z3.m7340s()
            r2.m7312e()
            h7.a4 r4 = p124h7.C2544b4.m6480s()
            r4.m6464e()
            h7.yg r4 = r4.m7220b()
            h7.b4 r4 = (p124h7.C2544b4) r4
            r2.m7313f(r4)
            h7.yg r2 = r2.m7220b()
            h7.z3 r2 = (p124h7.C2975z3) r2
            r1.<init>(r2, r3)
            java.lang.String r2 = "AES256_CMAC"
            r0.put(r2, r1)
            h7.q1 r1 = new h7.q1
            h7.y3 r2 = p124h7.C2975z3.m7340s()
            r2.m7312e()
            h7.a4 r3 = p124h7.C2544b4.m6480s()
            r3.m6464e()
            h7.yg r3 = r3.m7220b()
            h7.b4 r3 = (p124h7.C2544b4) r3
            r2.m7313f(r3)
            h7.yg r2 = r2.m7220b()
            h7.z3 r2 = (p124h7.C2975z3) r2
            r3 = 3
            r1.<init>(r2, r3)
            java.lang.String r2 = "AES256_CMAC_RAW"
            r0.put(r2, r1)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }

    @Override // p366v0.AbstractC6484c
    /* renamed from: l */
    public final void mo7016l(p124h7.InterfaceC2935x r2) {
            r1 = this;
            h7.z3 r2 = (p124h7.C2975z3) r2
            h7.b4 r0 = r2.m7346w()
            p124h7.C2794p2.m7031k(r0)
            int r2 = r2.m7345r()
            r0 = 32
            if (r2 != r0) goto L12
            return
        L12:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = "AesCmacKey size wrong, must be 32 bytes"
            r2.<init>(r0)
            throw r2
    }
}
