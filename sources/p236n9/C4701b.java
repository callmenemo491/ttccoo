package p236n9;

/* renamed from: n9.b */
/* loaded from: classes.dex */
public final class C4701b implements p236n9.InterfaceC4713n {

    /* renamed from: d */
    public static final java.lang.ThreadLocal<javax.crypto.Cipher> f18781d = null;

    /* renamed from: a */
    public final javax.crypto.spec.SecretKeySpec f18782a;

    /* renamed from: b */
    public final int f18783b;

    /* renamed from: c */
    public final int f18784c;

    /* renamed from: n9.b$a */
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
                java.lang.String r1 = "AES/CTR/NoPadding"
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
            n9.b$a r0 = new n9.b$a
            r0.<init>()
            p236n9.C4701b.f18781d = r0
            return
    }

    public C4701b(byte[] r3, int r4) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            p236n9.C4717r.m10774a(r0)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            r2.f18782a = r0
            java.lang.ThreadLocal<javax.crypto.Cipher> r3 = p236n9.C4701b.f18781d
            java.lang.Object r3 = r3.get()
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            int r3 = r3.getBlockSize()
            r2.f18784c = r3
            r0 = 12
            if (r4 < r0) goto L27
            if (r4 > r3) goto L27
            r2.f18783b = r4
            return
        L27:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "invalid IV size"
            r3.<init>(r4)
            throw r3
    }

    @Override // p236n9.InterfaceC4713n
    /* renamed from: a */
    public byte[] mo10746a(byte[] r11) {
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f18783b
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r2 - r1
            if (r0 > r3) goto L24
            int r0 = r11.length
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            byte[] r8 = p236n9.C4716q.m10773a(r1)
            int r1 = r10.f18783b
            r2 = 0
            java.lang.System.arraycopy(r8, r2, r0, r2, r1)
            r4 = 0
            int r5 = r11.length
            int r7 = r10.f18783b
            r9 = 1
            r2 = r10
            r3 = r11
            r6 = r0
            r2.m10748c(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L24:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r0 = "plaintext length can not exceed "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r10.f18783b
            int r2 = r2 - r1
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
    }

    @Override // p236n9.InterfaceC4713n
    /* renamed from: b */
    public byte[] mo10747b(byte[] r11) {
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f18783b
            if (r0 < r1) goto L1d
            byte[] r8 = new byte[r1]
            r0 = 0
            java.lang.System.arraycopy(r11, r0, r8, r0, r1)
            int r0 = r11.length
            int r4 = r10.f18783b
            int r0 = r0 - r4
            byte[] r0 = new byte[r0]
            int r1 = r11.length
            int r5 = r1 - r4
            r7 = 0
            r9 = 0
            r2 = r10
            r3 = r11
            r6 = r0
            r2.m10748c(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L1d:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r0 = "ciphertext too short"
            r11.<init>(r0)
            throw r11
    }

    /* renamed from: c */
    public final void m10748c(byte[] r8, int r9, int r10, byte[] r11, int r12, byte[] r13, boolean r14) {
            r7 = this;
            java.lang.ThreadLocal<javax.crypto.Cipher> r0 = p236n9.C4701b.f18781d
            java.lang.Object r0 = r0.get()
            r1 = r0
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            int r0 = r7.f18784c
            byte[] r0 = new byte[r0]
            int r2 = r7.f18783b
            r3 = 0
            java.lang.System.arraycopy(r13, r3, r0, r3, r2)
            javax.crypto.spec.IvParameterSpec r13 = new javax.crypto.spec.IvParameterSpec
            r13.<init>(r0)
            if (r14 == 0) goto L1c
            r14 = 1
            goto L1d
        L1c:
            r14 = 2
        L1d:
            javax.crypto.spec.SecretKeySpec r0 = r7.f18782a
            r1.init(r14, r0, r13)
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            int r8 = r1.doFinal(r2, r3, r4, r5, r6)
            if (r8 != r10) goto L2e
            return
        L2e:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "stored output's length does not match input's length"
            r8.<init>(r9)
            throw r8
    }
}
