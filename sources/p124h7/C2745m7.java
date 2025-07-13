package p124h7;

/* renamed from: h7.m7 */
/* loaded from: classes.dex */
public final class C2745m7 implements p124h7.InterfaceC2703k1 {

    /* renamed from: e */
    public static final java.lang.ThreadLocal<javax.crypto.Cipher> f11761e = null;

    /* renamed from: f */
    public static final java.lang.ThreadLocal<javax.crypto.Cipher> f11762f = null;

    /* renamed from: a */
    public final byte[] f11763a;

    /* renamed from: b */
    public final byte[] f11764b;

    /* renamed from: c */
    public final javax.crypto.spec.SecretKeySpec f11765c;

    /* renamed from: d */
    public final int f11766d;

    static {
            y6.a r0 = new y6.a
            r1 = 1
            r0.<init>(r1)
            p124h7.C2745m7.f11761e = r0
            m6.y r0 = new m6.y
            r1 = 2
            r0.<init>(r1)
            p124h7.C2745m7.f11762f = r0
            return
    }

    public C2745m7(byte[] r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = 16
            r1 = 12
            if (r4 == r1) goto L14
            if (r4 != r0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "IV size should be either 12 or 16 bytes"
            r3.<init>(r4)
            throw r3
        L14:
            r2.f11766d = r4
            int r4 = r3.length
            p124h7.C2584d8.m6593b(r4)
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r4.<init>(r3, r1)
            r2.f11765c = r4
            java.lang.ThreadLocal<javax.crypto.Cipher> r3 = p124h7.C2745m7.f11761e
            java.lang.Object r3 = r3.get()
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            r1 = 1
            r3.init(r1, r4)
            byte[] r4 = new byte[r0]
            byte[] r3 = r3.doFinal(r4)
            byte[] r3 = m6982c(r3)
            r2.f11763a = r3
            byte[] r3 = m6982c(r3)
            r2.f11764b = r3
            return
    }

    /* renamed from: c */
    public static byte[] m6982c(byte[] r6) {
            r0 = 16
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = 0
        L6:
            r3 = 15
            if (r2 >= r3) goto L1d
            r3 = r6[r2]
            int r4 = r2 + 1
            int r3 = r3 + r3
            r5 = r6[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 >>> 7
            r3 = r3 ^ r5
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r0[r2] = r3
            r2 = r4
            goto L6
        L1d:
            r2 = r6[r3]
            int r2 = r2 + r2
            r6 = r6[r1]
            int r6 = r6 >> 7
            r6 = r6 & 135(0x87, float:1.89E-43)
            r6 = r6 ^ r2
            byte r6 = (byte) r6
            r0[r3] = r6
            return r0
    }

    /* renamed from: e */
    public static byte[] m6983e(byte[] r5, byte[] r6) {
            int r0 = r5.length
            byte[] r1 = new byte[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L11
            r3 = r5[r2]
            r4 = r6[r2]
            r3 = r3 ^ r4
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        L11:
            return r1
    }

    @Override // p124h7.InterfaceC2703k1
    /* renamed from: a */
    public final byte[] mo6933a(byte[] r13, byte[] r14) {
            r12 = this;
            int r0 = r13.length
            int r1 = r12.f11766d
            int r1 = r0 - r1
            int r1 = r1 + (-16)
            if (r1 < 0) goto L72
            java.lang.ThreadLocal<javax.crypto.Cipher> r2 = p124h7.C2745m7.f11761e
            java.lang.Object r2 = r2.get()
            r9 = r2
            javax.crypto.Cipher r9 = (javax.crypto.Cipher) r9
            javax.crypto.spec.SecretKeySpec r2 = r12.f11765c
            r10 = 1
            r9.init(r10, r2)
            r5 = 0
            r7 = 0
            int r8 = r12.f11766d
            r3 = r12
            r4 = r9
            r6 = r13
            byte[] r11 = r3.m6984d(r4, r5, r6, r7, r8)
            r5 = 1
            int r8 = r14.length
            r6 = r14
            byte[] r14 = r3.m6984d(r4, r5, r6, r7, r8)
            r4 = 2
            int r6 = r12.f11766d
            r2 = r12
            r3 = r9
            r5 = r13
            r7 = r1
            byte[] r2 = r2.m6984d(r3, r4, r5, r6, r7)
            int r0 = r0 + (-16)
            r3 = 0
            r4 = 0
        L39:
            r5 = 16
            if (r3 >= r5) goto L4f
            int r5 = r0 + r3
            r5 = r13[r5]
            r6 = r14[r3]
            r5 = r5 ^ r6
            r6 = r11[r3]
            r5 = r5 ^ r6
            r6 = r2[r3]
            r5 = r5 ^ r6
            r4 = r4 | r5
            byte r4 = (byte) r4
            int r3 = r3 + 1
            goto L39
        L4f:
            if (r4 != 0) goto L6a
            java.lang.ThreadLocal<javax.crypto.Cipher> r14 = p124h7.C2745m7.f11762f
            java.lang.Object r14 = r14.get()
            javax.crypto.Cipher r14 = (javax.crypto.Cipher) r14
            javax.crypto.spec.SecretKeySpec r0 = r12.f11765c
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec
            r2.<init>(r11)
            r14.init(r10, r0, r2)
            int r0 = r12.f11766d
            byte[] r13 = r14.doFinal(r13, r0, r1)
            return r13
        L6a:
            javax.crypto.AEADBadTagException r13 = new javax.crypto.AEADBadTagException
            java.lang.String r14 = "tag mismatch"
            r13.<init>(r14)
            throw r13
        L72:
            java.security.GeneralSecurityException r13 = new java.security.GeneralSecurityException
            java.lang.String r14 = "ciphertext too short"
            r13.<init>(r14)
            throw r13
    }

    @Override // p124h7.InterfaceC2703k1
    /* renamed from: b */
    public final byte[] mo6934b(byte[] r1, byte[] r2) {
            r0 = this;
            r1 = 0
            throw r1
    }

    /* renamed from: d */
    public final byte[] m6984d(javax.crypto.Cipher r7, int r8, byte[] r9, int r10, int r11) {
            r6 = this;
            r0 = 16
            byte[] r1 = new byte[r0]
            byte r8 = (byte) r8
            r2 = 15
            r1[r2] = r8
            if (r11 != 0) goto L16
            byte[] r8 = r6.f11763a
            byte[] r8 = m6983e(r1, r8)
            byte[] r7 = r7.doFinal(r8)
            return r7
        L16:
            byte[] r8 = r7.doFinal(r1)
            r1 = 0
            r2 = 0
        L1c:
            int r3 = r11 - r2
            if (r3 <= r0) goto L38
            r3 = 0
        L21:
            if (r3 >= r0) goto L31
            r4 = r8[r3]
            int r5 = r10 + r2
            int r5 = r5 + r3
            r5 = r9[r5]
            r4 = r4 ^ r5
            byte r4 = (byte) r4
            r8[r3] = r4
            int r3 = r3 + 1
            goto L21
        L31:
            byte[] r8 = r7.doFinal(r8)
            int r2 = r2 + 16
            goto L1c
        L38:
            int r2 = r2 + r10
            int r10 = r10 + r11
            byte[] r9 = java.util.Arrays.copyOfRange(r9, r2, r10)
            int r10 = r9.length
            if (r10 != r0) goto L48
            byte[] r10 = r6.f11763a
            byte[] r9 = m6983e(r9, r10)
            goto L64
        L48:
            byte[] r10 = r6.f11764b
            byte[] r10 = java.util.Arrays.copyOf(r10, r0)
        L4e:
            int r11 = r9.length
            if (r1 >= r11) goto L5c
            r11 = r10[r1]
            r0 = r9[r1]
            r11 = r11 ^ r0
            byte r11 = (byte) r11
            r10[r1] = r11
            int r1 = r1 + 1
            goto L4e
        L5c:
            r9 = r10[r11]
            r9 = r9 ^ 128(0x80, float:1.8E-43)
            byte r9 = (byte) r9
            r10[r11] = r9
            r9 = r10
        L64:
            byte[] r8 = m6983e(r8, r9)
            byte[] r7 = r7.doFinal(r8)
            return r7
    }
}
