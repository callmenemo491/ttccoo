package p124h7;

/* renamed from: h7.o7 */
/* loaded from: classes.dex */
public final class C2781o7 implements p124h7.InterfaceC2703k1 {

    /* renamed from: b */
    public static final java.lang.ThreadLocal<javax.crypto.Cipher> f11799b = null;

    /* renamed from: a */
    public final javax.crypto.SecretKey f11800a;

    static {
            h7.n7 r0 = new h7.n7
            r0.<init>()
            p124h7.C2781o7.f11799b = r0
            return
    }

    public C2781o7(byte[] r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            p124h7.C2584d8.m6593b(r0)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            r2.f11800a = r0
            return
    }

    @Override // p124h7.InterfaceC2703k1
    /* renamed from: a */
    public final byte[] mo6933a(byte[] r8, byte[] r9) {
            r7 = this;
            int r0 = r8.length
            r1 = 28
            if (r0 < r1) goto L59
            boolean r1 = p036c6.C0906q0.m2622j()
            r2 = 0
            r3 = 12
            if (r1 == 0) goto L2b
            java.lang.String r1 = "android.os.Build$VERSION"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = "SDK_INT"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L20
            r4 = 0
            int r1 = r1.getInt(r4)     // Catch: java.lang.Throwable -> L20
            goto L21
        L20:
            r1 = -1
        L21:
            r4 = 19
            if (r1 > r4) goto L2b
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec
            r1.<init>(r8, r2, r3)
            goto L32
        L2b:
            javax.crypto.spec.GCMParameterSpec r1 = new javax.crypto.spec.GCMParameterSpec
            r4 = 128(0x80, float:1.8E-43)
            r1.<init>(r4, r8, r2, r3)
        L32:
            java.lang.ThreadLocal<javax.crypto.Cipher> r2 = p124h7.C2781o7.f11799b
            java.lang.Object r4 = r2.get()
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            r5 = 2
            javax.crypto.SecretKey r6 = r7.f11800a
            r4.init(r5, r6, r1)
            int r1 = r9.length
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r2.get()
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            r1.updateAAD(r9)
        L4c:
            java.lang.Object r9 = r2.get()
            javax.crypto.Cipher r9 = (javax.crypto.Cipher) r9
            int r0 = r0 + (-12)
            byte[] r8 = r9.doFinal(r8, r3, r0)
            return r8
        L59:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "ciphertext too short"
            r8.<init>(r9)
            throw r8
    }

    @Override // p124h7.InterfaceC2703k1
    /* renamed from: b */
    public final byte[] mo6934b(byte[] r1, byte[] r2) {
            r0 = this;
            r1 = 0
            throw r1
    }
}
