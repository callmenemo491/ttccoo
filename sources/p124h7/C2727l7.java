package p124h7;

/* renamed from: h7.l7 */
/* loaded from: classes.dex */
public final class C2727l7 implements p124h7.InterfaceC2961y7 {

    /* renamed from: d */
    public static final java.lang.ThreadLocal<javax.crypto.Cipher> f11732d = null;

    /* renamed from: a */
    public final javax.crypto.spec.SecretKeySpec f11733a;

    /* renamed from: b */
    public final int f11734b;

    /* renamed from: c */
    public final int f11735c;

    static {
            h7.k7 r0 = new h7.k7
            r1 = 0
            r0.<init>(r1)
            p124h7.C2727l7.f11732d = r0
            return
    }

    public C2727l7(byte[] r3, int r4) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            p124h7.C2584d8.m6593b(r0)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            r2.f11733a = r0
            java.lang.ThreadLocal<javax.crypto.Cipher> r3 = p124h7.C2727l7.f11732d
            java.lang.Object r3 = r3.get()
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            int r3 = r3.getBlockSize()
            r2.f11735c = r3
            r0 = 12
            if (r4 < r0) goto L27
            if (r4 > r3) goto L27
            r2.f11734b = r4
            return
        L27:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "invalid IV size"
            r3.<init>(r4)
            throw r3
    }

    @Override // p124h7.InterfaceC2961y7
    /* renamed from: a */
    public final byte[] mo6962a(byte[] r11) {
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f11734b
            if (r0 < r1) goto L3f
            byte[] r2 = new byte[r1]
            r3 = 0
            java.lang.System.arraycopy(r11, r3, r2, r3, r1)
            int r6 = r10.f11734b
            int r0 = r0 - r6
            byte[] r1 = new byte[r0]
            java.lang.ThreadLocal<javax.crypto.Cipher> r4 = p124h7.C2727l7.f11732d
            java.lang.Object r4 = r4.get()
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            int r5 = r10.f11735c
            byte[] r5 = new byte[r5]
            int r7 = r10.f11734b
            java.lang.System.arraycopy(r2, r3, r5, r3, r7)
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec
            r2.<init>(r5)
            r3 = 2
            javax.crypto.spec.SecretKeySpec r5 = r10.f11733a
            r4.init(r3, r5, r2)
            r9 = 0
            r5 = r11
            r7 = r0
            r8 = r1
            int r11 = r4.doFinal(r5, r6, r7, r8, r9)
            if (r11 != r0) goto L37
            return r1
        L37:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r0 = "stored output's length does not match input's length"
            r11.<init>(r0)
            throw r11
        L3f:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r0 = "ciphertext too short"
            r11.<init>(r0)
            throw r11
    }
}
