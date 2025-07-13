package p124h7;

/* renamed from: h7.q2 */
/* loaded from: classes.dex */
public final class C2812q2 extends p124h7.AbstractC2829r1<p124h7.InterfaceC2961y7, p124h7.C2652h4> {

    /* renamed from: b */
    public final /* synthetic */ int f11852b;

    public C2812q2(java.lang.Class r2, int r3) {
            r1 = this;
            r1.f11852b = r3
            r0 = 1
            if (r3 == r0) goto L25
            r0 = 2
            if (r3 == r0) goto L21
            r0 = 3
            if (r3 == r0) goto L1d
            r0 = 4
            if (r3 == r0) goto L19
            r0 = 5
            if (r3 == r0) goto L15
            r1.<init>(r2)
            return
        L15:
            r1.<init>(r2)
            return
        L19:
            r1.<init>(r2)
            return
        L1d:
            r1.<init>(r2)
            return
        L21:
            r1.<init>(r2)
            return
        L25:
            r1.<init>(r2)
            return
    }

    @Override // p124h7.AbstractC2829r1
    /* renamed from: a */
    public final p124h7.InterfaceC2961y7 mo6522a(p124h7.C2652h4 r10) {
            r9 = this;
            int r0 = r9.f11852b
            r1 = 1
            switch(r0) {
                case 0: goto Lc6;
                case 1: goto Lb6;
                case 2: goto La6;
                case 3: goto L86;
                case 4: goto L8;
                default: goto L6;
            }
        L6:
            goto Lde
        L8:
            h7.t5 r10 = (p124h7.C2869t5) r10
            h7.p5 r0 = r10.m7170s()
            h7.v5 r2 = r0.m7047x()
            h7.w5 r3 = r2.m7209v()
            int r3 = p036c6.C0906q0.m2625m(r3)
            h7.cg r4 = r10.m7171y()
            byte[] r4 = r4.m6537C()
            h7.cg r10 = r10.m7172z()
            byte[] r10 = r10.m6537C()
            java.security.spec.ECParameterSpec r3 = p036c6.C0906q0.m2630r(r3)
            java.math.BigInteger r5 = new java.math.BigInteger
            r5.<init>(r1, r4)
            java.math.BigInteger r4 = new java.math.BigInteger
            r4.<init>(r1, r10)
            java.security.spec.ECPoint r10 = new java.security.spec.ECPoint
            r10.<init>(r5, r4)
            java.security.spec.EllipticCurve r1 = r3.getCurve()
            p036c6.C0906q0.m2628p(r10, r1)
            java.security.spec.ECPublicKeySpec r1 = new java.security.spec.ECPublicKeySpec
            r1.<init>(r10, r3)
            h7.w7<h7.e1, java.security.KeyFactory> r10 = p124h7.C2925w7.f11996i
            java.lang.String r3 = "EC"
            java.lang.Object r10 = r10.m7238a(r3)
            java.security.KeyFactory r10 = (java.security.KeyFactory) r10
            java.security.PublicKey r10 = r10.generatePublic(r1)
            r4 = r10
            java.security.interfaces.ECPublicKey r4 = (java.security.interfaces.ECPublicKey) r4
            h7.j3 r8 = new h7.j3
            h7.k5 r10 = r0.m7046s()
            h7.m6 r10 = r10.m6947v()
            r8.<init>(r10)
            v.c r10 = new v.c
            h7.cg r1 = r2.m7211x()
            byte[] r5 = r1.m6537C()
            h7.z5 r1 = r2.m7210w()
            java.lang.String r6 = p036c6.C0906q0.m2614b(r1)
            h7.i5 r0 = r0.m7045r()
            int r7 = p036c6.C0906q0.m2627o(r0)
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        L86:
            h7.b7 r10 = (p124h7.C2547b7) r10
            h7.c7 r0 = r10.m6509w()
            java.lang.String r0 = r0.m6529w()
            h7.v1 r1 = p124h7.C2937x1.m7250a(r0)
            h7.k1 r0 = r1.mo7018e(r0)
            h7.u2 r1 = new h7.u2
            h7.c7 r10 = r10.m6509w()
            h7.m6 r10 = r10.m6528r()
            r1.<init>(r10, r0)
            return r1
        La6:
            h7.f5 r10 = (p124h7.C2617f5) r10
            h7.s7 r0 = new h7.s7
            h7.cg r10 = r10.m6703w()
            byte[] r10 = r10.m6537C()
            r0.<init>(r10)
            return r0
        Lb6:
            h7.t4 r10 = (p124h7.C2868t4) r10
            h7.o7 r0 = new h7.o7
            h7.cg r10 = r10.m7160w()
            byte[] r10 = r10.m6537C()
            r0.<init>(r10)
            return r0
        Lc6:
            h7.h4 r10 = (p124h7.C2652h4) r10
            h7.l7 r0 = new h7.l7
            h7.cg r1 = r10.m6790y()
            byte[] r1 = r1.m6537C()
            h7.l4 r10 = r10.m6789x()
            int r10 = r10.m6958r()
            r0.<init>(r1, r10)
            return r0
        Lde:
            h7.b6 r10 = (p124h7.C2546b6) r10
            h7.f6 r0 = r10.m6501x()
            h7.z5 r0 = r0.m6710s()
            h7.cg r2 = r10.m6502y()
            byte[] r2 = r2.m6537C()
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r4 = "HMAC"
            r3.<init>(r2, r4)
            h7.f6 r10 = r10.m6501x()
            int r10 = r10.m6709r()
            int r0 = r0.ordinal()
            if (r0 == r1) goto L14d
            r1 = 2
            if (r0 == r1) goto L140
            r1 = 3
            if (r0 == r1) goto L133
            r1 = 4
            if (r0 == r1) goto L126
            r1 = 5
            if (r0 != r1) goto L11e
            h7.b8 r0 = new h7.b8
            j6.h r1 = new j6.h
            java.lang.String r2 = "HMACSHA224"
            r1.<init>(r2, r3)
            r0.<init>(r1, r10)
            goto L159
        L11e:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown hash"
            r10.<init>(r0)
            throw r10
        L126:
            h7.b8 r0 = new h7.b8
            j6.h r1 = new j6.h
            java.lang.String r2 = "HMACSHA512"
            r1.<init>(r2, r3)
            r0.<init>(r1, r10)
            goto L159
        L133:
            h7.b8 r0 = new h7.b8
            j6.h r1 = new j6.h
            java.lang.String r2 = "HMACSHA256"
            r1.<init>(r2, r3)
            r0.<init>(r1, r10)
            goto L159
        L140:
            h7.b8 r0 = new h7.b8
            j6.h r1 = new j6.h
            java.lang.String r2 = "HMACSHA384"
            r1.<init>(r2, r3)
            r0.<init>(r1, r10)
            goto L159
        L14d:
            h7.b8 r0 = new h7.b8
            j6.h r1 = new j6.h
            java.lang.String r2 = "HMACSHA1"
            r1.<init>(r2, r3)
            r0.<init>(r1, r10)
        L159:
            return r0
    }
}
