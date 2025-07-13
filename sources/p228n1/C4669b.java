package p228n1;

/* renamed from: n1.b */
/* loaded from: classes.dex */
public final class C4669b {

    /* renamed from: a */
    public final java.lang.String f18609a;

    public C4669b(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            r1.<init>()
            r1.f18609a = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r2 < r0) goto Ld
            android.security.keystore.KeyGenParameterSpec r3 = (android.security.keystore.KeyGenParameterSpec) r3
        Ld:
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "MasterKey{keyAlias="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r4.f18609a
            r0.append(r1)
            java.lang.String r1 = ", isKeyStoreBacked="
            r0.append(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 23
            if (r1 >= r3) goto L18
            goto L28
        L18:
            java.lang.String r1 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch: java.lang.Throwable -> L28
            r3 = 0
            r1.load(r3)     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = r4.f18609a     // Catch: java.lang.Throwable -> L28
            boolean r2 = r1.containsAlias(r3)     // Catch: java.lang.Throwable -> L28
        L28:
            r0.append(r2)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
