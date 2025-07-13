package p175ji;

/* renamed from: ji.e */
/* loaded from: classes.dex */
public class C3615e {

    /* renamed from: a */
    public static volatile p175ji.C3615e f15895a;

    /* renamed from: b */
    public static final java.util.logging.Logger f15896b = null;

    /* renamed from: c */
    public static final p175ji.C3615e.a f15897c = null;

    /* renamed from: ji.e$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public final java.util.List<java.lang.String> m8053a(java.util.List<? extends bi.EnumC0773b0> r5) {
                r4 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r5 = r5.iterator()
            L9:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L23
                java.lang.Object r1 = r5.next()
                r2 = r1
                bi.b0 r2 = (bi.EnumC0773b0) r2
                bi.b0 r3 = bi.EnumC0773b0.f4184Z
                if (r2 == r3) goto L1c
                r2 = 1
                goto L1d
            L1c:
                r2 = 0
            L1d:
                if (r2 == 0) goto L9
                r0.add(r1)
                goto L9
            L23:
                java.util.ArrayList r5 = new java.util.ArrayList
                r1 = 10
                int r1 = p062dh.C1469e.m3992D(r0, r1)
                r5.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L32:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L44
                java.lang.Object r1 = r0.next()
                bi.b0 r1 = (bi.EnumC0773b0) r1
                java.lang.String r1 = r1.f4191Y
                r5.add(r1)
                goto L32
            L44:
                return r5
        }

        /* renamed from: b */
        public final byte[] m8054b(java.util.List<? extends bi.EnumC0773b0> r4) {
                r3 = this;
                oi.e r0 = new oi.e
                r0.<init>()
                java.util.List r4 = r3.m8053a(r4)
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                java.util.Iterator r4 = r4.iterator()
            Lf:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L26
                java.lang.Object r1 = r4.next()
                java.lang.String r1 = (java.lang.String) r1
                int r2 = r1.length()
                r0.m11539D0(r2)
                r0.m11547I0(r1)
                goto Lf
            L26:
                long r1 = r0.f20501Z
                byte[] r4 = r0.mo11549K(r1)
                return r4
        }

        /* renamed from: c */
        public final boolean m8055c() {
                r2 = this;
                java.lang.String r0 = "java.vm.name"
                java.lang.String r0 = java.lang.System.getProperty(r0)
                java.lang.String r1 = "Dalvik"
                boolean r0 = p214m2.C4339q.m9702c(r1, r0)
                return r0
        }
    }

    static {
            ji.e$a r0 = new ji.e$a
            r1 = 0
            r0.<init>(r1)
            p175ji.C3615e.f15897c = r0
            boolean r0 = r0.m8055c()
            r2 = 0
            if (r0 == 0) goto L88
            ki.c r0 = ki.C4130c.f17146c
            java.util.Map<java.lang.String, java.lang.String> r0 = ki.C4130c.f17145b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L66
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> r5 = ki.C4130c.f17144a
            boolean r5 = r5.add(r4)
            if (r5 == 0) goto L1b
            java.lang.String r5 = "logger"
            p214m2.C4339q.m9705j(r4, r5)
            r4.setUseParentHandlers(r2)
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r3, r5)
            if (r5 == 0) goto L51
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            goto L5d
        L51:
            r5 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r5)
            if (r3 == 0) goto L5b
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            goto L5d
        L5b:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
        L5d:
            r4.setLevel(r3)
            ki.d r3 = ki.C4131d.f17147a
            r4.addHandler(r3)
            goto L1b
        L66:
            ji.a r0 = p175ji.C3611a.f15877f
            boolean r0 = p175ji.C3611a.f15876e
            if (r0 == 0) goto L72
            ji.a r0 = new ji.a
            r0.<init>()
            goto L73
        L72:
            r0 = r1
        L73:
            if (r0 == 0) goto L77
            goto L18e
        L77:
            ji.b$a r0 = p175ji.C3612b.f15880g
            boolean r0 = p175ji.C3612b.f15879f
            if (r0 == 0) goto L82
            ji.b r1 = new ji.b
            r1.<init>()
        L82:
            p214m2.C4339q.m9704i(r1)
        L85:
            r0 = r1
            goto L18e
        L88:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r3 = "Security.getProviders()[0]"
            p214m2.C4339q.m9705j(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "Conscrypt"
            boolean r0 = p214m2.C4339q.m9702c(r4, r0)
            if (r0 == 0) goto Lb0
            okhttp3.internal.platform.b$a r0 = okhttp3.internal.platform.C5310b.f20564f
            boolean r0 = okhttp3.internal.platform.C5310b.f20563e
            if (r0 == 0) goto Lab
            okhttp3.internal.platform.b r0 = new okhttp3.internal.platform.b
            r0.<init>()
            goto Lac
        Lab:
            r0 = r1
        Lac:
            if (r0 == 0) goto Lb0
            goto L18e
        Lb0:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            p214m2.C4339q.m9705j(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "BC"
            boolean r0 = p214m2.C4339q.m9702c(r4, r0)
            if (r0 == 0) goto Ld6
            okhttp3.internal.platform.a$a r0 = okhttp3.internal.platform.C5309a.f20561f
            boolean r0 = okhttp3.internal.platform.C5309a.f20560e
            if (r0 == 0) goto Ld1
            okhttp3.internal.platform.a r0 = new okhttp3.internal.platform.a
            r0.<init>()
            goto Ld2
        Ld1:
            r0 = r1
        Ld2:
            if (r0 == 0) goto Ld6
            goto L18e
        Ld6:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            p214m2.C4339q.m9705j(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "OpenJSSE"
            boolean r0 = p214m2.C4339q.m9702c(r3, r0)
            if (r0 == 0) goto Lfc
            okhttp3.internal.platform.c$a r0 = okhttp3.internal.platform.C5311c.f20568f
            boolean r0 = okhttp3.internal.platform.C5311c.f20567e
            if (r0 == 0) goto Lf7
            okhttp3.internal.platform.c r0 = new okhttp3.internal.platform.c
            r0.<init>()
            goto Lf8
        Lf7:
            r0 = r1
        Lf8:
            if (r0 == 0) goto Lfc
            goto L18e
        Lfc:
            ji.d$a r0 = p175ji.C3614d.f15894e
            boolean r0 = p175ji.C3614d.f15893d
            if (r0 == 0) goto L108
            ji.d r0 = new ji.d
            r0.<init>()
            goto L109
        L108:
            r0 = r1
        L109:
            if (r0 == 0) goto L10d
            goto L18e
        L10d:
            java.lang.String r0 = "java.specification.version"
            java.lang.String r3 = "unknown"
            java.lang.String r0 = java.lang.System.getProperty(r0, r3)
            java.lang.String r3 = "jvmVersion"
            p214m2.C4339q.m9705j(r0, r3)     // Catch: java.lang.NumberFormatException -> L123
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L123
            r3 = 9
            if (r0 < r3) goto L123
            goto L185
        L123:
            java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
            r3 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r1)     // Catch: java.lang.Throwable -> L184
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4, r3, r1)     // Catch: java.lang.Throwable -> L184
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r10 = java.lang.Class.forName(r5, r3, r1)     // Catch: java.lang.Throwable -> L184
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r11 = java.lang.Class.forName(r5, r3, r1)     // Catch: java.lang.Throwable -> L184
            java.lang.String r5 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L184
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r2] = r7     // Catch: java.lang.Throwable -> L184
            r6[r3] = r4     // Catch: java.lang.Throwable -> L184
            java.lang.reflect.Method r7 = r0.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L184
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L184
            java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
            r5[r2] = r6     // Catch: java.lang.Throwable -> L184
            java.lang.reflect.Method r8 = r0.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L184
            java.lang.String r4 = "remove"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L184
            java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
            r3[r2] = r5     // Catch: java.lang.Throwable -> L184
            java.lang.reflect.Method r9 = r0.getMethod(r4, r3)     // Catch: java.lang.Throwable -> L184
            ji.c r0 = new ji.c     // Catch: java.lang.Throwable -> L184
            java.lang.String r2 = "putMethod"
            p214m2.C4339q.m9705j(r7, r2)     // Catch: java.lang.Throwable -> L184
            java.lang.String r2 = "getMethod"
            p214m2.C4339q.m9705j(r8, r2)     // Catch: java.lang.Throwable -> L184
            java.lang.String r2 = "removeMethod"
            p214m2.C4339q.m9705j(r9, r2)     // Catch: java.lang.Throwable -> L184
            java.lang.String r2 = "clientProviderClass"
            p214m2.C4339q.m9705j(r10, r2)     // Catch: java.lang.Throwable -> L184
            java.lang.String r2 = "serverProviderClass"
            p214m2.C4339q.m9705j(r11, r2)     // Catch: java.lang.Throwable -> L184
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L184
            r1 = r0
            goto L185
        L184:
        L185:
            if (r1 == 0) goto L189
            goto L85
        L189:
            ji.e r0 = new ji.e
            r0.<init>()
        L18e:
            p175ji.C3615e.f15895a = r0
            java.lang.Class<bi.a0> r0 = bi.C0771a0.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p175ji.C3615e.f15896b = r0
            return
    }

    public C3615e() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: j */
    public static /* synthetic */ void m8048j(p175ji.C3615e r0, java.lang.String r1, int r2, java.lang.Throwable r3, int r4, java.lang.Object r5) {
            r3 = r4 & 2
            if (r3 == 0) goto L5
            r2 = 4
        L5:
            r3 = 0
            r0.m8049i(r1, r2, r3)
            return
    }

    /* renamed from: a */
    public void mo8047a(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            return
    }

    /* renamed from: b */
    public p224mi.AbstractC4634c mo8038b(javax.net.ssl.X509TrustManager r2) {
            r1 = this;
            mi.a r0 = new mi.a
            mi.e r2 = r1.mo8042c(r2)
            r0.<init>(r2)
            return r0
    }

    /* renamed from: c */
    public p224mi.InterfaceC4636e mo8042c(javax.net.ssl.X509TrustManager r3) {
            r2 = this;
            mi.b r0 = new mi.b
            java.security.cert.X509Certificate[] r3 = r3.getAcceptedIssuers()
            java.lang.String r1 = "trustManager.acceptedIssuers"
            p214m2.C4339q.m9705j(r3, r1)
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.security.cert.X509Certificate[] r3 = (java.security.cert.X509Certificate[]) r3
            r0.<init>(r3)
            return r0
    }

    /* renamed from: d */
    public void mo8039d(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List<bi.EnumC0773b0> r3) {
            r0 = this;
            java.lang.String r1 = "protocols"
            p214m2.C4339q.m9706k(r3, r1)
            return
    }

    /* renamed from: e */
    public void mo8043e(java.net.Socket r2, java.net.InetSocketAddress r3, int r4) {
            r1 = this;
            java.lang.String r0 = "address"
            p214m2.C4339q.m9706k(r3, r0)
            r2.connect(r3, r4)
            return
    }

    /* renamed from: f */
    public java.lang.String mo8040f(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: g */
    public java.lang.Object mo8044g(java.lang.String r3) {
            r2 = this;
            java.util.logging.Logger r0 = p175ji.C3615e.f15896b
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L10
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r3)
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    /* renamed from: h */
    public boolean mo8041h(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "hostname"
            p214m2.C4339q.m9706k(r2, r0)
            r2 = 1
            return r2
    }

    /* renamed from: i */
    public void m8049i(java.lang.String r2, int r3, java.lang.Throwable r4) {
            r1 = this;
            java.lang.String r0 = "message"
            p214m2.C4339q.m9706k(r2, r0)
            r0 = 5
            if (r3 != r0) goto Lb
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            goto Ld
        Lb:
            java.util.logging.Level r3 = java.util.logging.Level.INFO
        Ld:
            java.util.logging.Logger r0 = p175ji.C3615e.f15896b
            r0.log(r3, r2, r4)
            return
    }

    /* renamed from: k */
    public void mo8045k(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r0 = "message"
            p214m2.C4339q.m9706k(r2, r0)
            if (r3 != 0) goto Ld
            java.lang.String r0 = " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);"
            java.lang.String r2 = p064e.C1493g.m4049a(r2, r0)
        Ld:
            r0 = 5
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r1.m8049i(r2, r0, r3)
            return
    }

    /* renamed from: l */
    public javax.net.ssl.SSLContext mo8050l() {
            r2 = this;
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)
            java.lang.String r1 = "SSLContext.getInstance(\"TLS\")"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }

    /* renamed from: m */
    public javax.net.ssl.SSLSocketFactory mo8051m(javax.net.ssl.X509TrustManager r4) {
            r3 = this;
            javax.net.ssl.SSLContext r0 = r3.mo8050l()     // Catch: java.security.GeneralSecurityException -> L18
            r1 = 1
            javax.net.ssl.TrustManager[] r1 = new javax.net.ssl.TrustManager[r1]     // Catch: java.security.GeneralSecurityException -> L18
            r2 = 0
            r1[r2] = r4     // Catch: java.security.GeneralSecurityException -> L18
            r4 = 0
            r0.init(r4, r1, r4)     // Catch: java.security.GeneralSecurityException -> L18
            javax.net.ssl.SSLSocketFactory r4 = r0.getSocketFactory()     // Catch: java.security.GeneralSecurityException -> L18
            java.lang.String r0 = "newSSLContext().apply {\n\u2026ll)\n      }.socketFactory"
            p214m2.C4339q.m9705j(r4, r0)     // Catch: java.security.GeneralSecurityException -> L18
            return r4
        L18:
            r4 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No System TLS: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

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
            if (r2 == 0) goto L2c
            r0 = r0[r3]
            java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"
            java.util.Objects.requireNonNull(r0, r1)
            javax.net.ssl.X509TrustManager r0 = (javax.net.ssl.X509TrustManager) r0
            return r0
        L2c:
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

    public java.lang.String toString() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }
}
