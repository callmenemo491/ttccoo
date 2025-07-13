package okhttp3.internal.platform;

/* renamed from: okhttp3.internal.platform.b */
/* loaded from: classes.dex */
public final class C5310b extends p175ji.C3615e {

    /* renamed from: e */
    public static final boolean f20563e = false;

    /* renamed from: f */
    public static final okhttp3.internal.platform.C5310b.a f20564f = null;

    /* renamed from: d */
    public final java.security.Provider f20565d;

    /* renamed from: okhttp3.internal.platform.b$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public final boolean m11624a(int r5, int r6, int r7) {
                r4 = this;
                org.conscrypt.Conscrypt$Version r0 = org.conscrypt.Conscrypt.version()
                int r1 = r0.major()
                r2 = 1
                r3 = 0
                if (r1 == r5) goto L15
                int r6 = r0.major()
                if (r6 <= r5) goto L13
                goto L14
            L13:
                r2 = 0
            L14:
                return r2
            L15:
                int r5 = r0.minor()
                if (r5 == r6) goto L24
                int r5 = r0.minor()
                if (r5 <= r6) goto L22
                goto L23
            L22:
                r2 = 0
            L23:
                return r2
            L24:
                int r5 = r0.patch()
                if (r5 < r7) goto L2b
                goto L2c
            L2b:
                r2 = 0
            L2c:
                return r2
        }
    }

    /* renamed from: okhttp3.internal.platform.b$b */
    public static final class b implements org.conscrypt.ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final okhttp3.internal.platform.C5310b.b f20566a = null;

        static {
                okhttp3.internal.platform.b$b r0 = new okhttp3.internal.platform.b$b
                r0.<init>()
                okhttp3.internal.platform.C5310b.b.f20566a = r0
                return
        }

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.internal.platform.b$a r0 = new okhttp3.internal.platform.b$a
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.C5310b.f20564f = r0
            r1 = 0
            java.lang.String r2 = "org.conscrypt.Conscrypt$Version"
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Throwable -> L25
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L25
            java.lang.Class.forName(r2, r1, r3)     // Catch: java.lang.Throwable -> L25
            boolean r2 = org.conscrypt.Conscrypt.isAvailable()     // Catch: java.lang.Throwable -> L25
            r3 = 1
            if (r2 == 0) goto L25
            r2 = 2
            boolean r0 = r0.m11624a(r2, r3, r1)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L25
            r1 = 1
        L25:
            okhttp3.internal.platform.C5310b.f20563e = r1
            return
    }

    public C5310b() {
            r2 = this;
            r2.<init>()
            java.security.Provider r0 = org.conscrypt.Conscrypt.newProvider()
            java.lang.String r1 = "Conscrypt.newProvider()"
            p214m2.C4339q.m9705j(r0, r1)
            r2.f20565d = r0
            return
    }

    @Override // p175ji.C3615e
    /* renamed from: d */
    public void mo8039d(javax.net.ssl.SSLSocket r6, java.lang.String r7, java.util.List<bi.EnumC0773b0> r8) {
            r5 = this;
            java.lang.String r7 = "protocols"
            p214m2.C4339q.m9706k(r8, r7)
            boolean r0 = org.conscrypt.Conscrypt.isConscrypt(r6)
            if (r0 == 0) goto L63
            r7 = 1
            org.conscrypt.Conscrypt.setUseSessionTickets(r6, r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L18:
            boolean r1 = r8.hasNext()
            r2 = 0
            if (r1 == 0) goto L31
            java.lang.Object r1 = r8.next()
            r3 = r1
            bi.b0 r3 = (bi.EnumC0773b0) r3
            bi.b0 r4 = bi.EnumC0773b0.f4184Z
            if (r3 == r4) goto L2b
            r2 = 1
        L2b:
            if (r2 == 0) goto L18
            r0.add(r1)
            goto L18
        L31:
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = p062dh.C1469e.m3992D(r0, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
        L40:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r0 = r8.next()
            bi.b0 r0 = (bi.EnumC0773b0) r0
            java.lang.String r0 = r0.f4191Y
            r7.add(r0)
            goto L40
        L52:
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.Object[] r7 = r7.toArray(r8)
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r7, r8)
            java.lang.String[] r7 = (java.lang.String[]) r7
            org.conscrypt.Conscrypt.setApplicationProtocols(r6, r7)
            goto L66
        L63:
            p214m2.C4339q.m9706k(r8, r7)
        L66:
            return
    }

    @Override // p175ji.C3615e
    /* renamed from: f */
    public java.lang.String mo8040f(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            boolean r0 = org.conscrypt.Conscrypt.isConscrypt(r2)
            if (r0 == 0) goto Lb
            java.lang.String r2 = org.conscrypt.Conscrypt.getApplicationProtocol(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            return r2
    }

    @Override // p175ji.C3615e
    /* renamed from: l */
    public javax.net.ssl.SSLContext mo8050l() {
            r2 = this;
            java.security.Provider r0 = r2.f20565d
            java.lang.String r1 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r1, r0)
            java.lang.String r1 = "SSLContext.getInstance(\"TLS\", provider)"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }

    @Override // p175ji.C3615e
    /* renamed from: m */
    public javax.net.ssl.SSLSocketFactory mo8051m(javax.net.ssl.X509TrustManager r4) {
            r3 = this;
            java.security.Provider r0 = r3.f20565d
            java.lang.String r1 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r1, r0)
            java.lang.String r1 = "SSLContext.getInstance(\"TLS\", provider)"
            p214m2.C4339q.m9705j(r0, r1)
            r1 = 1
            javax.net.ssl.TrustManager[] r1 = new javax.net.ssl.TrustManager[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 0
            r0.init(r4, r1, r4)
            javax.net.ssl.SSLSocketFactory r4 = r0.getSocketFactory()
            java.lang.String r0 = "newSSLContext().apply {\n\u2026null)\n    }.socketFactory"
            p214m2.C4339q.m9705j(r4, r0)
            return r4
    }

    @Override // p175ji.C3615e
    /* renamed from: n */
    public javax.net.ssl.X509TrustManager mo8052n() {
            r4 = this;
            java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0)
            r1 = 0
            r0.init(r1)
            javax.net.ssl.TrustManager[] r0 = r0.getTrustManagers()
            p214m2.C4339q.m9704i(r0)
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L1f
            r1 = r0[r3]
            boolean r1 = r1 instanceof javax.net.ssl.X509TrustManager
            if (r1 == 0) goto L1f
            goto L20
        L1f:
            r2 = 0
        L20:
            if (r2 == 0) goto L33
            r0 = r0[r3]
            java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"
            java.util.Objects.requireNonNull(r0, r1)
            javax.net.ssl.X509TrustManager r0 = (javax.net.ssl.X509TrustManager) r0
            okhttp3.internal.platform.b$b r1 = okhttp3.internal.platform.C5310b.b.f20566a
            org.conscrypt.ConscryptHostnameVerifier r1 = (org.conscrypt.ConscryptHostnameVerifier) r1
            org.conscrypt.Conscrypt.setHostnameVerifier(r0, r1)
            return r0
        L33:
            java.lang.String r1 = "Unexpected default trust managers: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.String r2 = "java.util.Arrays.toString(this)"
            p214m2.C4339q.m9705j(r0, r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }
}
