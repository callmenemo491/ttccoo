package p124h7;

/* renamed from: h7.n3 */
/* loaded from: classes.dex */
public final class C2759n3 {

    /* renamed from: a */
    public java.security.KeyStore f11783a;

    public C2759n3() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f11783a = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L21
            java.lang.String r1 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch: java.io.IOException -> L18 java.security.GeneralSecurityException -> L1a
            r3.f11783a = r1     // Catch: java.io.IOException -> L18 java.security.GeneralSecurityException -> L1a
            r1.load(r0)     // Catch: java.io.IOException -> L18 java.security.GeneralSecurityException -> L1a
            return
        L18:
            r0 = move-exception
            goto L1b
        L1a:
            r0 = move-exception
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "need Android Keystore on Android M or newer"
            r0.<init>(r1)
            throw r0
    }
}
