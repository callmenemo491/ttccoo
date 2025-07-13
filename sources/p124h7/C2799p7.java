package p124h7;

/* renamed from: h7.p7 */
/* loaded from: classes.dex */
public final class C2799p7 implements p124h7.InterfaceC2739m1 {

    /* renamed from: c */
    public static final java.util.Collection<java.lang.Integer> f11824c = null;

    /* renamed from: d */
    public static final byte[] f11825d = null;

    /* renamed from: a */
    public final androidx.fragment.app.C0392l0 f11826a;

    /* renamed from: b */
    public final byte[] f11827b;

    static {
            r0 = 1
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r1 = 64
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            p124h7.C2799p7.f11824c = r0
            r0 = 16
            byte[] r0 = new byte[r0]
            p124h7.C2799p7.f11825d = r0
            return
    }

    public C2799p7(byte[] r4) {
            r3 = this;
            r3.<init>()
            java.util.Collection<java.lang.Integer> r0 = p124h7.C2799p7.f11824c
            int r1 = r4.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L27
            int r0 = r1 >> 1
            r2 = 0
            byte[] r2 = java.util.Arrays.copyOfRange(r4, r2, r0)
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r0, r1)
            r3.f11827b = r4
            androidx.fragment.app.l0 r4 = new androidx.fragment.app.l0
            r0 = 8
            r4.<init>(r2, r0)
            r3.f11826a = r4
            return
        L27:
            java.security.InvalidKeyException r4 = new java.security.InvalidKeyException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 59
            r0.<init>(r2)
            java.lang.String r2 = "invalid key size: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " bytes; key must have 64 bytes"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @Override // p124h7.InterfaceC2739m1
    /* renamed from: a */
    public final byte[] mo6463a(byte[] r10, byte[] r11) {
            r9 = this;
            int r0 = r10.length
            r1 = 16
            if (r0 < r1) goto Lc2
            h7.w7<h7.z7, javax.crypto.Cipher> r2 = p124h7.C2925w7.f11992e
            java.lang.String r3 = "AES/CTR/NoPadding"
            java.lang.Object r2 = r2.m7238a(r3)
            javax.crypto.Cipher r2 = (javax.crypto.Cipher) r2
            r3 = 0
            byte[] r4 = java.util.Arrays.copyOfRange(r10, r3, r1)
            java.lang.Object r5 = r4.clone()
            byte[] r5 = (byte[]) r5
            r6 = 8
            r7 = r5[r6]
            r7 = r7 & 127(0x7f, float:1.78E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            r6 = 12
            r7 = r5[r6]
            r7 = r7 & 127(0x7f, float:1.78E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec
            byte[] r7 = r9.f11827b
            java.lang.String r8 = "AES"
            r6.<init>(r7, r8)
            javax.crypto.spec.IvParameterSpec r7 = new javax.crypto.spec.IvParameterSpec
            r7.<init>(r5)
            r5 = 2
            r2.init(r5, r6, r7)
            byte[] r10 = java.util.Arrays.copyOfRange(r10, r1, r0)
            byte[] r0 = r2.doFinal(r10)
            int r10 = r10.length
            if (r10 != 0) goto L53
            if (r0 != 0) goto L53
            boolean r10 = p036c6.C0906q0.m2622j()
            if (r10 == 0) goto L53
            byte[] r0 = new byte[r3]
        L53:
            byte[][] r10 = new byte[r5][]
            r10[r3] = r11
            r11 = 1
            r10[r11] = r0
            androidx.fragment.app.l0 r2 = r9.f11826a
            byte[] r5 = p124h7.C2799p7.f11825d
            byte[] r2 = r2.mo1269a(r5, r1)
            r5 = 0
        L63:
            if (r5 > 0) goto L7b
            r5 = r10[r3]
            if (r5 != 0) goto L6b
            byte[] r5 = new byte[r3]
        L6b:
            byte[] r2 = p036c6.C0906q0.m2623k(r2)
            androidx.fragment.app.l0 r6 = r9.f11826a
            byte[] r5 = r6.mo1269a(r5, r1)
            byte[] r2 = p124h7.C2939x3.m7255E(r2, r5)
            r5 = 1
            goto L63
        L7b:
            r10 = r10[r11]
            int r11 = r10.length
            if (r11 < r1) goto La1
            int r5 = r2.length
            if (r11 < r5) goto L99
            int r5 = r11 - r5
            byte[] r10 = java.util.Arrays.copyOf(r10, r11)
        L89:
            int r11 = r2.length
            if (r3 >= r11) goto Lad
            int r11 = r5 + r3
            r6 = r10[r11]
            r7 = r2[r3]
            r6 = r6 ^ r7
            byte r6 = (byte) r6
            r10[r11] = r6
            int r3 = r3 + 1
            goto L89
        L99:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "xorEnd requires a.length >= b.length"
            r10.<init>(r11)
            throw r10
        La1:
            byte[] r10 = p036c6.C0906q0.m2617e(r10)
            byte[] r11 = p036c6.C0906q0.m2623k(r2)
            byte[] r10 = p124h7.C2939x3.m7255E(r10, r11)
        Lad:
            androidx.fragment.app.l0 r11 = r9.f11826a
            byte[] r10 = r11.mo1269a(r10, r1)
            boolean r10 = p124h7.C2939x3.m7299y(r4, r10)
            if (r10 == 0) goto Lba
            return r0
        Lba:
            javax.crypto.AEADBadTagException r10 = new javax.crypto.AEADBadTagException
            java.lang.String r11 = "Integrity check failed."
            r10.<init>(r11)
            throw r10
        Lc2:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "Ciphertext too short."
            r10.<init>(r11)
            throw r10
    }
}
