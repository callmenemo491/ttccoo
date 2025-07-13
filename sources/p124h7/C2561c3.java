package p124h7;

/* renamed from: h7.c3 */
/* loaded from: classes.dex */
public final class C2561c3 extends p124h7.AbstractC2829r1<p124h7.InterfaceC2757n1, p124h7.C2833r5> {
    public C2561c3(java.lang.Class r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // p124h7.AbstractC2829r1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2757n1 mo6522a(p124h7.C2833r5 r9) {
            r8 = this;
            h7.r5 r9 = (p124h7.C2833r5) r9
            h7.t5 r0 = r9.m7066w()
            h7.p5 r0 = r0.m7170s()
            h7.v5 r1 = r0.m7047x()
            h7.w5 r2 = r1.m7209v()
            int r2 = p036c6.C0906q0.m2625m(r2)
            h7.cg r9 = r9.m7067x()
            byte[] r9 = r9.m6537C()
            java.security.spec.ECParameterSpec r2 = p036c6.C0906q0.m2630r(r2)
            java.math.BigInteger r3 = new java.math.BigInteger
            r4 = 1
            r3.<init>(r4, r9)
            java.security.spec.ECPrivateKeySpec r9 = new java.security.spec.ECPrivateKeySpec
            r9.<init>(r3, r2)
            h7.w7<h7.e1, java.security.KeyFactory> r2 = p124h7.C2925w7.f11996i
            java.lang.String r3 = "EC"
            java.lang.Object r2 = r2.m7238a(r3)
            java.security.KeyFactory r2 = (java.security.KeyFactory) r2
            java.security.PrivateKey r9 = r2.generatePrivate(r9)
            r3 = r9
            java.security.interfaces.ECPrivateKey r3 = (java.security.interfaces.ECPrivateKey) r3
            h7.j3 r7 = new h7.j3
            h7.k5 r9 = r0.m7046s()
            h7.m6 r9 = r9.m6947v()
            r7.<init>(r9)
            h7.u7 r9 = new h7.u7
            h7.cg r2 = r1.m7211x()
            byte[] r4 = r2.m6537C()
            h7.z5 r1 = r1.m7210w()
            java.lang.String r5 = p036c6.C0906q0.m2614b(r1)
            h7.i5 r0 = r0.m7045r()
            int r6 = p036c6.C0906q0.m2627o(r0)
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return r9
    }
}
