package p124h7;

/* renamed from: h7.v2 */
/* loaded from: classes.dex */
public final class C2902v2 implements p124h7.InterfaceC2703k1 {

    /* renamed from: b */
    public static final java.lang.ThreadLocal<javax.crypto.Cipher> f11949b = null;

    /* renamed from: a */
    public final javax.crypto.SecretKey f11950a;

    static {
            m6.y r0 = new m6.y
            r1 = 1
            r0.<init>(r1)
            p124h7.C2902v2.f11949b = r0
            return
    }

    public C2902v2(byte[] r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            p124h7.C2584d8.m6593b(r0)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            r2.f11950a = r0
            return
    }

    @Override // p124h7.InterfaceC2703k1
    /* renamed from: a */
    public final byte[] mo6933a(byte[] r7, byte[] r8) {
            r6 = this;
            int r0 = r7.length
            r1 = 28
            if (r0 < r1) goto L51
            r0 = 0
            r1 = 12
            java.lang.String r2 = "javax.crypto.spec.GCMParameterSpec"
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L15
            javax.crypto.spec.GCMParameterSpec r2 = new javax.crypto.spec.GCMParameterSpec     // Catch: java.lang.ClassNotFoundException -> L15
            r3 = 128(0x80, float:1.8E-43)
            r2.<init>(r3, r7, r0, r1)     // Catch: java.lang.ClassNotFoundException -> L15
            goto L21
        L15:
            boolean r2 = p036c6.C0906q0.m2622j()
            if (r2 == 0) goto L49
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec
            r2.<init>(r7, r0, r1)
        L21:
            java.lang.ThreadLocal<javax.crypto.Cipher> r0 = p124h7.C2902v2.f11949b
            java.lang.Object r3 = r0.get()
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            r4 = 2
            javax.crypto.SecretKey r5 = r6.f11950a
            r3.init(r4, r5, r2)
            int r2 = r8.length
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r0.get()
            javax.crypto.Cipher r2 = (javax.crypto.Cipher) r2
            r2.updateAAD(r8)
        L3b:
            java.lang.Object r8 = r0.get()
            javax.crypto.Cipher r8 = (javax.crypto.Cipher) r8
            int r0 = r7.length
            int r0 = r0 + (-12)
            byte[] r7 = r8.doFinal(r7, r1, r0)
            return r7
        L49:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r8 = "cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found"
            r7.<init>(r8)
            throw r7
        L51:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r8 = "ciphertext too short"
            r7.<init>(r8)
            throw r7
    }

    @Override // p124h7.InterfaceC2703k1
    /* renamed from: b */
    public final byte[] mo6934b(byte[] r1, byte[] r2) {
            r0 = this;
            r1 = 0
            throw r1
    }
}
