package p236n9;

/* renamed from: n9.c */
/* loaded from: classes.dex */
public final class C4702c implements p093f9.InterfaceC2083a {

    /* renamed from: e */
    public static final java.lang.ThreadLocal<javax.crypto.Cipher> f18785e = null;

    /* renamed from: f */
    public static final java.lang.ThreadLocal<javax.crypto.Cipher> f18786f = null;

    /* renamed from: a */
    public final byte[] f18787a;

    /* renamed from: b */
    public final byte[] f18788b;

    /* renamed from: c */
    public final javax.crypto.spec.SecretKeySpec f18789c;

    /* renamed from: d */
    public final int f18790d;

    /* renamed from: n9.c$a */
    public class a extends java.lang.ThreadLocal<javax.crypto.Cipher> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.ThreadLocal
        public javax.crypto.Cipher initialValue() {
                r2 = this;
                n9.l<n9.m$a, javax.crypto.Cipher> r0 = p236n9.C4711l.f18821e     // Catch: java.security.GeneralSecurityException -> Lb
                java.lang.String r1 = "AES/ECB/NOPADDING"
                java.lang.Object r0 = r0.m10770a(r1)     // Catch: java.security.GeneralSecurityException -> Lb
                javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0     // Catch: java.security.GeneralSecurityException -> Lb
                return r0
            Lb:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }
    }

    /* renamed from: n9.c$b */
    public class b extends java.lang.ThreadLocal<javax.crypto.Cipher> {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.ThreadLocal
        public javax.crypto.Cipher initialValue() {
                r2 = this;
                n9.l<n9.m$a, javax.crypto.Cipher> r0 = p236n9.C4711l.f18821e     // Catch: java.security.GeneralSecurityException -> Lb
                java.lang.String r1 = "AES/CTR/NOPADDING"
                java.lang.Object r0 = r0.m10770a(r1)     // Catch: java.security.GeneralSecurityException -> Lb
                javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0     // Catch: java.security.GeneralSecurityException -> Lb
                return r0
            Lb:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }
    }

    static {
            n9.c$a r0 = new n9.c$a
            r0.<init>()
            p236n9.C4702c.f18785e = r0
            n9.c$b r0 = new n9.c$b
            r0.<init>()
            p236n9.C4702c.f18786f = r0
            return
    }

    public C4702c(byte[] r3, int r4) {
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
            r2.f18790d = r4
            int r4 = r3.length
            p236n9.C4717r.m10774a(r4)
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r4.<init>(r3, r1)
            r2.f18789c = r4
            java.lang.ThreadLocal<javax.crypto.Cipher> r3 = p236n9.C4702c.f18785e
            java.lang.Object r3 = r3.get()
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            r1 = 1
            r3.init(r1, r4)
            byte[] r4 = new byte[r0]
            byte[] r3 = r3.doFinal(r4)
            byte[] r3 = m10749c(r3)
            r2.f18787a = r3
            byte[] r3 = m10749c(r3)
            r2.f18788b = r3
            return
    }

    /* renamed from: c */
    public static byte[] m10749c(byte[] r6) {
            r0 = 16
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = 0
        L6:
            r3 = 15
            if (r2 >= r3) goto L1e
            r3 = r6[r2]
            int r3 = r3 << 1
            int r4 = r2 + 1
            r5 = r6[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 >>> 7
            r3 = r3 ^ r5
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r0[r2] = r3
            r2 = r4
            goto L6
        L1e:
            r2 = r6[r3]
            int r2 = r2 << 1
            r6 = r6[r1]
            r6 = r6 & 128(0x80, float:1.8E-43)
            if (r6 != 0) goto L29
            goto L2b
        L29:
            r1 = 135(0x87, float:1.89E-43)
        L2b:
            r6 = r2 ^ r1
            byte r6 = (byte) r6
            r0[r3] = r6
            return r0
    }

    /* renamed from: e */
    public static byte[] m10750e(byte[] r5, byte[] r6) {
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

    @Override // p093f9.InterfaceC2083a
    /* renamed from: a */
    public byte[] mo5506a(byte[] r16, byte[] r17) {
            r15 = this;
            r6 = r15
            r7 = r16
            int r0 = r7.length
            int r1 = r6.f18790d
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r2 - r1
            r8 = 16
            int r2 = r2 - r8
            if (r0 > r2) goto L85
            int r0 = r7.length
            int r0 = r0 + r1
            int r0 = r0 + r8
            byte[] r9 = new byte[r0]
            byte[] r3 = p236n9.C4716q.m10773a(r1)
            int r0 = r6.f18790d
            r10 = 0
            java.lang.System.arraycopy(r3, r10, r9, r10, r0)
            java.lang.ThreadLocal<javax.crypto.Cipher> r0 = p236n9.C4702c.f18785e
            java.lang.Object r0 = r0.get()
            r11 = r0
            javax.crypto.Cipher r11 = (javax.crypto.Cipher) r11
            javax.crypto.spec.SecretKeySpec r0 = r6.f18789c
            r12 = 1
            r11.init(r12, r0)
            r2 = 0
            r4 = 0
            int r5 = r3.length
            r0 = r15
            r1 = r11
            byte[] r13 = r0.m10751d(r1, r2, r3, r4, r5)
            if (r17 != 0) goto L3c
            byte[] r0 = new byte[r10]
            r3 = r0
            goto L3e
        L3c:
            r3 = r17
        L3e:
            r2 = 1
            r4 = 0
            int r5 = r3.length
            r0 = r15
            r1 = r11
            byte[] r14 = r0.m10751d(r1, r2, r3, r4, r5)
            java.lang.ThreadLocal<javax.crypto.Cipher> r0 = p236n9.C4702c.f18786f
            java.lang.Object r0 = r0.get()
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            javax.crypto.spec.SecretKeySpec r1 = r6.f18789c
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec
            r2.<init>(r13)
            r0.init(r12, r1, r2)
            r2 = 0
            int r3 = r7.length
            int r5 = r6.f18790d
            r1 = r16
            r4 = r9
            r0.doFinal(r1, r2, r3, r4, r5)
            r2 = 2
            int r4 = r6.f18790d
            int r5 = r7.length
            r0 = r15
            r1 = r11
            r3 = r9
            byte[] r0 = r0.m10751d(r1, r2, r3, r4, r5)
            int r1 = r7.length
            int r2 = r6.f18790d
            int r1 = r1 + r2
        L72:
            if (r10 >= r8) goto L84
            int r2 = r1 + r10
            r3 = r14[r10]
            r4 = r13[r10]
            r3 = r3 ^ r4
            r4 = r0[r10]
            r3 = r3 ^ r4
            byte r3 = (byte) r3
            r9[r2] = r3
            int r10 = r10 + 1
            goto L72
        L84:
            return r9
        L85:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "plaintext too long"
            r0.<init>(r1)
            throw r0
    }

    @Override // p093f9.InterfaceC2083a
    /* renamed from: b */
    public byte[] mo5507b(byte[] r14, byte[] r15) {
            r13 = this;
            int r0 = r14.length
            int r1 = r13.f18790d
            int r0 = r0 - r1
            r1 = 16
            int r0 = r0 - r1
            if (r0 < 0) goto L77
            java.lang.ThreadLocal<javax.crypto.Cipher> r2 = p236n9.C4702c.f18785e
            java.lang.Object r2 = r2.get()
            r9 = r2
            javax.crypto.Cipher r9 = (javax.crypto.Cipher) r9
            javax.crypto.spec.SecretKeySpec r2 = r13.f18789c
            r10 = 1
            r9.init(r10, r2)
            r5 = 0
            r7 = 0
            int r8 = r13.f18790d
            r3 = r13
            r4 = r9
            r6 = r14
            byte[] r11 = r3.m10751d(r4, r5, r6, r7, r8)
            r12 = 0
            if (r15 != 0) goto L28
            byte[] r15 = new byte[r12]
        L28:
            r6 = r15
            r5 = 1
            r7 = 0
            int r8 = r6.length
            r3 = r13
            r4 = r9
            byte[] r15 = r3.m10751d(r4, r5, r6, r7, r8)
            r4 = 2
            int r6 = r13.f18790d
            r2 = r13
            r3 = r9
            r5 = r14
            r7 = r0
            byte[] r2 = r2.m10751d(r3, r4, r5, r6, r7)
            int r3 = r14.length
            int r3 = r3 - r1
            r4 = 0
        L40:
            if (r12 >= r1) goto L54
            int r5 = r3 + r12
            r5 = r14[r5]
            r6 = r15[r12]
            r5 = r5 ^ r6
            r6 = r11[r12]
            r5 = r5 ^ r6
            r6 = r2[r12]
            r5 = r5 ^ r6
            r4 = r4 | r5
            byte r4 = (byte) r4
            int r12 = r12 + 1
            goto L40
        L54:
            if (r4 != 0) goto L6f
            java.lang.ThreadLocal<javax.crypto.Cipher> r15 = p236n9.C4702c.f18786f
            java.lang.Object r15 = r15.get()
            javax.crypto.Cipher r15 = (javax.crypto.Cipher) r15
            javax.crypto.spec.SecretKeySpec r1 = r13.f18789c
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec
            r2.<init>(r11)
            r15.init(r10, r1, r2)
            int r1 = r13.f18790d
            byte[] r14 = r15.doFinal(r14, r1, r0)
            return r14
        L6f:
            javax.crypto.AEADBadTagException r14 = new javax.crypto.AEADBadTagException
            java.lang.String r15 = "tag mismatch"
            r14.<init>(r15)
            throw r14
        L77:
            java.security.GeneralSecurityException r14 = new java.security.GeneralSecurityException
            java.lang.String r15 = "ciphertext too short"
            r14.<init>(r15)
            throw r14
    }

    /* renamed from: d */
    public final byte[] m10751d(javax.crypto.Cipher r7, int r8, byte[] r9, int r10, int r11) {
            r6 = this;
            r0 = 16
            byte[] r1 = new byte[r0]
            byte r8 = (byte) r8
            r2 = 15
            r1[r2] = r8
            if (r11 != 0) goto L16
            byte[] r8 = r6.f18787a
            byte[] r8 = m10750e(r1, r8)
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
            byte[] r10 = r6.f18787a
            byte[] r9 = m10750e(r9, r10)
            goto L66
        L48:
            byte[] r10 = r6.f18788b
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
            int r11 = r9.length
            int r9 = r9.length
            r9 = r10[r9]
            r9 = r9 ^ 128(0x80, float:1.8E-43)
            byte r9 = (byte) r9
            r10[r11] = r9
            r9 = r10
        L66:
            byte[] r8 = m10750e(r8, r9)
            byte[] r7 = r7.doFinal(r8)
            return r7
    }
}
