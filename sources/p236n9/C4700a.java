package p236n9;

/* renamed from: n9.a */
/* loaded from: classes.dex */
public final class C4700a implements p093f9.InterfaceC2095m {

    /* renamed from: a */
    public final javax.crypto.SecretKey f18777a;

    /* renamed from: b */
    public final int f18778b;

    /* renamed from: c */
    public byte[] f18779c;

    /* renamed from: d */
    public byte[] f18780d;

    public C4700a(byte[] r4, int r5) {
            r3 = this;
            r3.<init>()
            int r0 = r4.length
            p236n9.C4717r.m10774a(r0)
            r0 = 10
            if (r5 < r0) goto L43
            r0 = 16
            if (r5 > r0) goto L3b
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r2 = "AES"
            r1.<init>(r4, r2)
            r3.f18777a = r1
            r3.f18778b = r5
            n9.l<n9.m$a, javax.crypto.Cipher> r4 = p236n9.C4711l.f18821e
            java.lang.String r5 = "AES/ECB/NoPadding"
            java.lang.Object r4 = r4.m10770a(r5)
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            r5 = 1
            r4.init(r5, r1)
            byte[] r5 = new byte[r0]
            byte[] r4 = r4.doFinal(r5)
            byte[] r4 = p074e9.C1805a.m4521f(r4)
            r3.f18779c = r4
            byte[] r4 = p074e9.C1805a.m4521f(r4)
            r3.f18780d = r4
            return
        L3b:
            java.security.InvalidAlgorithmParameterException r4 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r5 = "tag size too large, max is 16 bytes"
            r4.<init>(r5)
            throw r4
        L43:
            java.security.InvalidAlgorithmParameterException r4 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r5 = "tag size too small, min is 10 bytes"
            r4.<init>(r5)
            throw r4
    }

    @Override // p093f9.InterfaceC2095m
    /* renamed from: a */
    public void mo5536a(byte[] r1, byte[] r2) {
            r0 = this;
            byte[] r2 = r0.mo5537b(r2)
            boolean r1 = p185k7.C3828h5.m8594i(r1, r2)
            if (r1 == 0) goto Lb
            return
        Lb:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "invalid MAC"
            r1.<init>(r2)
            throw r1
    }

    @Override // p093f9.InterfaceC2095m
    /* renamed from: b */
    public byte[] mo5537b(byte[] r9) {
            r8 = this;
            n9.l<n9.m$a, javax.crypto.Cipher> r0 = p236n9.C4711l.f18821e
            java.lang.String r1 = "AES/ECB/NoPadding"
            java.lang.Object r0 = r0.m10770a(r1)
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            javax.crypto.SecretKey r1 = r8.f18777a
            r2 = 1
            r0.init(r2, r1)
            int r1 = r9.length
            double r3 = (double) r1
            r5 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r3 = r3 / r5
            double r3 = java.lang.Math.ceil(r3)
            int r1 = (int) r3
            int r1 = java.lang.Math.max(r2, r1)
            int r3 = r1 * 16
            int r4 = r9.length
            r5 = 0
            if (r3 != r4) goto L25
            goto L26
        L25:
            r2 = 0
        L26:
            r3 = 16
            if (r2 == 0) goto L35
            int r2 = r1 + (-1)
            int r2 = r2 * 16
            byte[] r4 = r8.f18779c
            byte[] r2 = p185k7.C3828h5.m8582K(r9, r2, r4, r5, r3)
            goto L48
        L35:
            int r2 = r1 + (-1)
            int r2 = r2 * 16
            int r4 = r9.length
            byte[] r2 = java.util.Arrays.copyOfRange(r9, r2, r4)
            byte[] r2 = p074e9.C1805a.m4518c(r2)
            byte[] r4 = r8.f18780d
            byte[] r2 = p185k7.C3828h5.m8583L(r2, r4)
        L48:
            byte[] r4 = new byte[r3]
            r6 = 0
        L4b:
            int r7 = r1 + (-1)
            if (r6 >= r7) goto L5c
            int r7 = r6 * 16
            byte[] r4 = p185k7.C3828h5.m8582K(r4, r5, r9, r7, r3)
            byte[] r4 = r0.doFinal(r4)
            int r6 = r6 + 1
            goto L4b
        L5c:
            byte[] r9 = p185k7.C3828h5.m8583L(r2, r4)
            int r1 = r8.f18778b
            byte[] r1 = new byte[r1]
            byte[] r9 = r0.doFinal(r9)
            int r0 = r8.f18778b
            java.lang.System.arraycopy(r9, r5, r1, r5, r0)
            return r1
    }
}
