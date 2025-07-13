package p124h7;

/* renamed from: h7.o3 */
/* loaded from: classes.dex */
public final class C2777o3 implements p124h7.InterfaceC2901v1 {

    /* renamed from: a */
    public java.security.KeyStore f11797a;

    public C2777o3() {
            r1 = this;
            h7.n3 r0 = new h7.n3
            r0.<init>()
            r1.<init>()
            java.security.KeyStore r0 = r0.f11783a
            r1.f11797a = r0
            return
    }

    /* renamed from: a */
    public final synchronized boolean m7017a(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "android-keystore://"
            java.lang.String r3 = p124h7.C2584d8.m6592a(r0, r3)     // Catch: java.lang.Throwable -> L36
            java.security.KeyStore r0 = r2.f11797a     // Catch: java.lang.NullPointerException -> Lf java.lang.Throwable -> L36
            boolean r3 = r0.containsAlias(r3)     // Catch: java.lang.NullPointerException -> Lf java.lang.Throwable -> L36
            monitor-exit(r2)
            return r3
        Lf:
            java.lang.String r0 = "o3"
            java.lang.String r1 = "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again."
            android.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L36
            r0 = 20
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L27 java.io.IOException -> L2f java.lang.Throwable -> L36
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch: java.lang.InterruptedException -> L27 java.io.IOException -> L2f java.lang.Throwable -> L36
            r2.f11797a = r0     // Catch: java.lang.InterruptedException -> L27 java.io.IOException -> L2f java.lang.Throwable -> L36
            r1 = 0
            r0.load(r1)     // Catch: java.lang.InterruptedException -> L27 java.io.IOException -> L2f java.lang.Throwable -> L36
        L27:
            java.security.KeyStore r0 = r2.f11797a     // Catch: java.lang.Throwable -> L36
            boolean r3 = r0.containsAlias(r3)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r2)
            return r3
        L2f:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L36
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L36
            throw r0     // Catch: java.lang.Throwable -> L36
        L36:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // p124h7.InterfaceC2901v1
    /* renamed from: e */
    public final synchronized p124h7.InterfaceC2703k1 mo7018e(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            h7.m3 r0 = new h7.m3     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "android-keystore://"
            java.lang.String r4 = p124h7.C2584d8.m6592a(r1, r4)     // Catch: java.lang.Throwable -> L2f
            java.security.KeyStore r1 = r3.f11797a     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L2f
            r4 = 10
            byte[] r4 = p124h7.C2566c8.m6531a(r4)     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L2f
            byte[] r2 = r0.mo6934b(r4, r1)     // Catch: java.lang.Throwable -> L2f
            byte[] r1 = r0.mo6933a(r2, r1)     // Catch: java.lang.Throwable -> L2f
            boolean r4 = java.util.Arrays.equals(r4, r1)     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L27
            monitor-exit(r3)
            return r0
        L27:
            java.security.KeyStoreException r4 = new java.security.KeyStoreException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            throw r4     // Catch: java.lang.Throwable -> L2f
        L2f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    @Override // p124h7.InterfaceC2901v1
    /* renamed from: f */
    public final synchronized boolean mo7019f(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r2.toLowerCase(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = "android-keystore://"
            boolean r2 = r2.startsWith(r0)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L12
            r2 = 1
        L10:
            monitor-exit(r1)
            return r2
        L12:
            r2 = 0
            goto L10
        L14:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
