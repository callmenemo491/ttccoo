package p147i9;

/* renamed from: i9.c */
/* loaded from: classes.dex */
public final class C3117c implements p093f9.InterfaceC2093k {

    /* renamed from: a */
    public final java.security.KeyStore f12513a;

    /* renamed from: i9.c$a */
    public static final class a {

        /* renamed from: a */
        public java.security.KeyStore f12514a;

        public a() {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.f12514a = r0
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 23
                if (r1 < r2) goto Le
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                if (r1 == 0) goto L26
                java.lang.String r1 = "AndroidKeyStore"
                java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch: java.io.IOException -> L1d java.security.GeneralSecurityException -> L1f
                r3.f12514a = r1     // Catch: java.io.IOException -> L1d java.security.GeneralSecurityException -> L1f
                r1.load(r0)     // Catch: java.io.IOException -> L1d java.security.GeneralSecurityException -> L1f
                return
            L1d:
                r0 = move-exception
                goto L20
            L1f:
                r0 = move-exception
            L20:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
            L26:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "need Android Keystore on Android M or newer"
                r0.<init>(r1)
                throw r0
        }
    }

    public C3117c() {
            r1 = this;
            i9.c$a r0 = new i9.c$a
            r0.<init>()
            r1.<init>()
            java.security.KeyStore r0 = r0.f12514a
            r1.f12513a = r0
            return
    }

    /* renamed from: c */
    public static void m7577c(java.lang.String r3) {
            i9.c r0 = new i9.c
            r0.<init>()
            java.lang.String r1 = "android-keystore://"
            java.lang.String r2 = p236n9.C4717r.m10775b(r1, r3)
            java.security.KeyStore r0 = r0.f12513a
            boolean r0 = r0.containsAlias(r2)
            if (r0 != 0) goto L4a
            java.lang.String r3 = p236n9.C4717r.m10775b(r1, r3)
            java.lang.String r0 = "AES"
            java.lang.String r1 = "AndroidKeyStore"
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r0, r1)
            android.security.keystore.KeyGenParameterSpec$Builder r1 = new android.security.keystore.KeyGenParameterSpec$Builder
            r2 = 3
            r1.<init>(r3, r2)
            r3 = 256(0x100, float:3.59E-43)
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r1.setKeySize(r3)
            java.lang.String r1 = "GCM"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setBlockModes(r1)
            java.lang.String r1 = "NoPadding"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setEncryptionPaddings(r1)
            android.security.keystore.KeyGenParameterSpec r3 = r3.build()
            r0.init(r3)
            r0.generateKey()
            return
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    @Override // p093f9.InterfaceC2093k
    /* renamed from: a */
    public p093f9.InterfaceC2083a mo5533a(java.lang.String r4) {
            r3 = this;
            i9.b r0 = new i9.b
            java.lang.String r1 = "android-keystore://"
            java.lang.String r4 = p236n9.C4717r.m10775b(r1, r4)
            java.security.KeyStore r1 = r3.f12513a
            r0.<init>(r4, r1)
            r4 = 10
            byte[] r4 = p236n9.C4716q.m10773a(r4)
            r1 = 0
            byte[] r1 = new byte[r1]
            byte[] r2 = r0.mo5506a(r4, r1)
            byte[] r1 = r0.mo5507b(r2, r1)
            boolean r4 = java.util.Arrays.equals(r4, r1)
            if (r4 == 0) goto L25
            return r0
        L25:
            java.security.KeyStoreException r4 = new java.security.KeyStoreException
            java.lang.String r0 = "cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result"
            r4.<init>(r0)
            throw r4
    }

    @Override // p093f9.InterfaceC2093k
    /* renamed from: b */
    public boolean mo5534b(java.lang.String r2) {
            r1 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "android-keystore://"
            boolean r2 = r2.startsWith(r0)
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }
}
