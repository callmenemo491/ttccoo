package ki;

/* renamed from: ki.b */
/* loaded from: classes.dex */
public final class C4129b extends p224mi.AbstractC4634c {

    /* renamed from: a */
    public final javax.net.ssl.X509TrustManager f17142a;

    /* renamed from: b */
    public final android.net.http.X509TrustManagerExtensions f17143b;

    public C4129b(javax.net.ssl.X509TrustManager r1, android.net.http.X509TrustManagerExtensions r2) {
            r0 = this;
            r0.<init>()
            r0.f17142a = r1
            r0.f17143b = r2
            return
    }

    @Override // p224mi.AbstractC4634c
    /* renamed from: a */
    public java.util.List<java.security.cert.Certificate> mo9192a(java.util.List<? extends java.security.cert.Certificate> r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "chain"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "hostname"
            p214m2.C4339q.m9706k(r4, r0)
            r0 = 0
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r3, r0)
            java.security.cert.X509Certificate[] r3 = (java.security.cert.X509Certificate[]) r3
            android.net.http.X509TrustManagerExtensions r0 = r2.f17143b     // Catch: java.security.cert.CertificateException -> L26
            java.lang.String r1 = "RSA"
            java.util.List r3 = r0.checkServerTrusted(r3, r1, r4)     // Catch: java.security.cert.CertificateException -> L26
            java.lang.String r4 = "x509TrustManagerExtensio\u2026ficates, \"RSA\", hostname)"
            p214m2.C4339q.m9705j(r3, r4)     // Catch: java.security.cert.CertificateException -> L26
            return r3
        L26:
            r3 = move-exception
            javax.net.ssl.SSLPeerUnverifiedException r4 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r0 = r3.getMessage()
            r4.<init>(r0)
            r4.initCause(r3)
            throw r4
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof ki.C4129b
            if (r0 == 0) goto Le
            ki.b r2 = (ki.C4129b) r2
            javax.net.ssl.X509TrustManager r2 = r2.f17142a
            javax.net.ssl.X509TrustManager r0 = r1.f17142a
            if (r2 != r0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    public int hashCode() {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = r1.f17142a
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }
}
