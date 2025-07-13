package p236n9;

/* renamed from: n9.d */
/* loaded from: classes.dex */
public final class C4703d implements p093f9.InterfaceC2083a {

    /* renamed from: b */
    public static final java.lang.ThreadLocal<javax.crypto.Cipher> f18791b = null;

    /* renamed from: a */
    public final javax.crypto.SecretKey f18792a;

    /* renamed from: n9.d$a */
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
                java.lang.String r1 = "AES/GCM/NoPadding"
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
            n9.d$a r0 = new n9.d$a
            r0.<init>()
            p236n9.C4703d.f18791b = r0
            return
    }

    public C4703d(byte[] r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            p236n9.C4717r.m10774a(r0)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            r2.f18792a = r0
            return
    }

    /* renamed from: c */
    public static java.security.spec.AlgorithmParameterSpec m10752c(byte[] r2, int r3, int r4) {
            java.lang.String r0 = "javax.crypto.spec.GCMParameterSpec"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> Ld
            javax.crypto.spec.GCMParameterSpec r0 = new javax.crypto.spec.GCMParameterSpec     // Catch: java.lang.ClassNotFoundException -> Ld
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1, r2, r3, r4)     // Catch: java.lang.ClassNotFoundException -> Ld
            return r0
        Ld:
            boolean r0 = p185k7.C4038x4.m9095h()
            if (r0 == 0) goto L1a
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec
            r0.<init>(r2, r3, r4)
            return r0
        L1a:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found"
            r2.<init>(r3)
            throw r2
    }

    @Override // p093f9.InterfaceC2083a
    /* renamed from: a */
    public byte[] mo5506a(byte[] r12, byte[] r13) {
            r11 = this;
            int r0 = r12.length
            r1 = 2147483619(0x7fffffe3, float:NaN)
            if (r0 > r1) goto L6b
            int r0 = r12.length
            r1 = 12
            int r0 = r0 + r1
            r2 = 16
            int r0 = r0 + r2
            byte[] r0 = new byte[r0]
            byte[] r3 = p236n9.C4716q.m10773a(r1)
            r9 = 0
            java.lang.System.arraycopy(r3, r9, r0, r9, r1)
            int r1 = r3.length
            java.security.spec.AlgorithmParameterSpec r1 = m10752c(r3, r9, r1)
            java.lang.ThreadLocal<javax.crypto.Cipher> r3 = p236n9.C4703d.f18791b
            java.lang.Object r4 = r3.get()
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            javax.crypto.SecretKey r5 = r11.f18792a
            r10 = 1
            r4.init(r10, r5, r1)
            if (r13 == 0) goto L38
            int r1 = r13.length
            if (r1 == 0) goto L38
            java.lang.Object r1 = r3.get()
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            r1.updateAAD(r13)
        L38:
            java.lang.Object r13 = r3.get()
            r3 = r13
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            r5 = 0
            int r6 = r12.length
            r8 = 12
            r4 = r12
            r7 = r0
            int r13 = r3.doFinal(r4, r5, r6, r7, r8)
            int r1 = r12.length
            int r1 = r1 + r2
            if (r13 != r1) goto L4e
            return r0
        L4e:
            int r12 = r12.length
            int r13 = r13 - r12
            java.security.GeneralSecurityException r12 = new java.security.GeneralSecurityException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0[r9] = r1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0[r10] = r13
            java.lang.String r13 = "encryption failed; GCM tag must be %s bytes, but got only %s bytes"
            java.lang.String r13 = java.lang.String.format(r13, r0)
            r12.<init>(r13)
            throw r12
        L6b:
            java.security.GeneralSecurityException r12 = new java.security.GeneralSecurityException
            java.lang.String r13 = "plaintext too long"
            r12.<init>(r13)
            throw r12
    }

    @Override // p093f9.InterfaceC2083a
    /* renamed from: b */
    public byte[] mo5507b(byte[] r7, byte[] r8) {
            r6 = this;
            int r0 = r7.length
            r1 = 28
            if (r0 < r1) goto L35
            r0 = 0
            r1 = 12
            java.security.spec.AlgorithmParameterSpec r0 = m10752c(r7, r0, r1)
            java.lang.ThreadLocal<javax.crypto.Cipher> r2 = p236n9.C4703d.f18791b
            java.lang.Object r3 = r2.get()
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            r4 = 2
            javax.crypto.SecretKey r5 = r6.f18792a
            r3.init(r4, r5, r0)
            if (r8 == 0) goto L28
            int r0 = r8.length
            if (r0 == 0) goto L28
            java.lang.Object r0 = r2.get()
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            r0.updateAAD(r8)
        L28:
            java.lang.Object r8 = r2.get()
            javax.crypto.Cipher r8 = (javax.crypto.Cipher) r8
            int r0 = r7.length
            int r0 = r0 - r1
            byte[] r7 = r8.doFinal(r7, r1, r0)
            return r7
        L35:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r8 = "ciphertext too short"
            r7.<init>(r8)
            throw r7
    }
}
