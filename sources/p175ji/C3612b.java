package p175ji;

/* renamed from: ji.b */
/* loaded from: classes.dex */
public final class C3612b extends p175ji.C3615e {

    /* renamed from: f */
    public static final boolean f15879f = false;

    /* renamed from: g */
    public static final p175ji.C3612b.a f15880g = null;

    /* renamed from: d */
    public final java.util.List<ki.InterfaceC4138k> f15881d;

    /* renamed from: e */
    public final ki.C4135h f15882e;

    /* renamed from: ji.b$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: ji.b$b */
    public static final class b implements p224mi.InterfaceC4636e {

        /* renamed from: a */
        public final javax.net.ssl.X509TrustManager f15883a;

        /* renamed from: b */
        public final java.lang.reflect.Method f15884b;

        public b(javax.net.ssl.X509TrustManager r1, java.lang.reflect.Method r2) {
                r0 = this;
                r0.<init>()
                r0.f15883a = r1
                r0.f15884b = r2
                return
        }

        @Override // p224mi.InterfaceC4636e
        /* renamed from: a */
        public java.security.cert.X509Certificate mo8046a(java.security.cert.X509Certificate r5) {
                r4 = this;
                java.lang.reflect.Method r0 = r4.f15884b     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
                javax.net.ssl.X509TrustManager r1 = r4.f15883a     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
                r3 = 0
                r2[r3] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
                java.lang.Object r5 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
                if (r5 == 0) goto L17
                java.security.cert.TrustAnchor r5 = (java.security.cert.TrustAnchor) r5     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
                java.security.cert.X509Certificate r5 = r5.getTrustedCert()     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
                goto L20
            L17:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
                java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.TrustAnchor"
                r5.<init>(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
                throw r5     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21
            L1f:
                r5 = 0
            L20:
                return r5
            L21:
                r5 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "unable to get issues and signature"
                r0.<init>(r1, r5)
                throw r0
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 == r3) goto L1f
                boolean r0 = r3 instanceof p175ji.C3612b.b
                if (r0 == 0) goto L1d
                ji.b$b r3 = (p175ji.C3612b.b) r3
                javax.net.ssl.X509TrustManager r0 = r2.f15883a
                javax.net.ssl.X509TrustManager r1 = r3.f15883a
                boolean r0 = p214m2.C4339q.m9702c(r0, r1)
                if (r0 == 0) goto L1d
                java.lang.reflect.Method r0 = r2.f15884b
                java.lang.reflect.Method r3 = r3.f15884b
                boolean r3 = p214m2.C4339q.m9702c(r0, r3)
                if (r3 == 0) goto L1d
                goto L1f
            L1d:
                r3 = 0
                return r3
            L1f:
                r3 = 1
                return r3
        }

        public int hashCode() {
                r3 = this;
                javax.net.ssl.X509TrustManager r0 = r3.f15883a
                r1 = 0
                if (r0 == 0) goto La
                int r0 = r0.hashCode()
                goto Lb
            La:
                r0 = 0
            Lb:
                int r0 = r0 * 31
                java.lang.reflect.Method r2 = r3.f15884b
                if (r2 == 0) goto L15
                int r1 = r2.hashCode()
            L15:
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "CustomTrustRootIndex(trustManager="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                javax.net.ssl.X509TrustManager r1 = r2.f15883a
                r0.append(r1)
                java.lang.String r1 = ", findByIssuerAndSignatureMethod="
                r0.append(r1)
                java.lang.reflect.Method r1 = r2.f15884b
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            ji.b$a r0 = new ji.b$a
            r1 = 0
            r0.<init>(r1)
            p175ji.C3612b.f15880g = r0
            ji.e$a r0 = p175ji.C3615e.f15897c
            boolean r0 = r0.m8055c()
            r1 = 0
            if (r0 != 0) goto L12
            goto L1a
        L12:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L19
            goto L1a
        L19:
            r1 = 1
        L1a:
            p175ji.C3612b.f15879f = r1
            return
    }

    public C3612b() {
            r7 = this;
            r7.<init>()
            r0 = 4
            ki.k[] r0 = new ki.InterfaceC4138k[r0]
            ki.l$a r1 = ki.C4139l.f17163h
            r1 = 0
            java.lang.String r2 = "com.android.org.conscrypt.OpenSSLSocketImpl"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L21
            java.lang.String r3 = "com.android.org.conscrypt.OpenSSLSocketFactoryImpl"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L21
            java.lang.String r4 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L21
            ki.l r5 = new ki.l     // Catch: java.lang.Exception -> L21
            r5.<init>(r2, r3, r4)     // Catch: java.lang.Exception -> L21
            goto L2b
        L21:
            r2 = move-exception
            ji.e r3 = p175ji.C3615e.f15895a
            r4 = 5
            java.lang.String r5 = "unable to load android socket classes"
            r3.m8049i(r5, r4, r2)
            r5 = r1
        L2b:
            r2 = 0
            r0[r2] = r5
            ki.j r3 = new ki.j
            ki.f$a r4 = ki.C4133f.f17150g
            ki.j$a r4 = ki.C4133f.f17149f
            r3.<init>(r4)
            r4 = 1
            r0[r4] = r3
            r3 = 2
            ki.j r5 = new ki.j
            ki.j$a r6 = ki.C4136i.f17160a
            r5.<init>(r6)
            r0[r3] = r5
            r3 = 3
            ki.j r5 = new ki.j
            ki.j$a r6 = ki.C4134g.f17156a
            r5.<init>(r6)
            r0[r3] = r5
            java.util.List r0 = p074e9.C1805a.m4530o(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L5d:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L74
            java.lang.Object r5 = r0.next()
            r6 = r5
            ki.k r6 = (ki.InterfaceC4138k) r6
            boolean r6 = r6.mo9189c()
            if (r6 == 0) goto L5d
            r3.add(r5)
            goto L5d
        L74:
            r7.f15881d = r3
            java.lang.String r0 = "dalvik.system.CloseGuard"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L9b
            java.lang.String r3 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L9b
            java.lang.reflect.Method r3 = r0.getMethod(r3, r5)     // Catch: java.lang.Exception -> L9b
            java.lang.String r5 = "open"
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L9b
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r4[r2] = r6     // Catch: java.lang.Exception -> L9b
            java.lang.reflect.Method r4 = r0.getMethod(r5, r4)     // Catch: java.lang.Exception -> L9b
            java.lang.String r5 = "warnIfOpen"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L9b
            java.lang.reflect.Method r1 = r0.getMethod(r5, r2)     // Catch: java.lang.Exception -> L9b
            r0 = r1
            r1 = r3
            goto L9d
        L9b:
            r0 = r1
            r4 = r0
        L9d:
            ki.h r2 = new ki.h
            r2.<init>(r1, r4, r0)
            r7.f15882e = r2
            return
    }

    @Override // p175ji.C3615e
    /* renamed from: b */
    public p224mi.AbstractC4634c mo8038b(javax.net.ssl.X509TrustManager r3) {
            r2 = this;
            r0 = 0
            android.net.http.X509TrustManagerExtensions r1 = new android.net.http.X509TrustManagerExtensions     // Catch: java.lang.IllegalArgumentException -> L7
            r1.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L7
            goto L8
        L7:
            r1 = r0
        L8:
            if (r1 == 0) goto Lf
            ki.b r0 = new ki.b
            r0.<init>(r3, r1)
        Lf:
            if (r0 == 0) goto L12
            goto L16
        L12:
            mi.c r0 = super.mo8038b(r3)
        L16:
            return r0
    }

    @Override // p175ji.C3615e
    /* renamed from: c */
    public p224mi.InterfaceC4636e mo8042c(javax.net.ssl.X509TrustManager r7) {
            r6 = this;
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L20
            java.lang.String r1 = "findTrustAnchorByIssuerAndSignature"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L20
            r4 = 0
            java.lang.Class<java.security.cert.X509Certificate> r5 = java.security.cert.X509Certificate.class
            r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L20
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.NoSuchMethodException -> L20
            java.lang.String r1 = "method"
            p214m2.C4339q.m9705j(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L20
            r0.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L20
            ji.b$b r1 = new ji.b$b     // Catch: java.lang.NoSuchMethodException -> L20
            r1.<init>(r7, r0)     // Catch: java.lang.NoSuchMethodException -> L20
            goto L24
        L20:
            mi.e r1 = super.mo8042c(r7)
        L24:
            return r1
    }

    @Override // p175ji.C3615e
    /* renamed from: d */
    public void mo8039d(javax.net.ssl.SSLSocket r4, java.lang.String r5, java.util.List<bi.EnumC0773b0> r6) {
            r3 = this;
            java.lang.String r0 = "protocols"
            p214m2.C4339q.m9706k(r6, r0)
            java.util.List<ki.k> r0 = r3.f15881d
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            r2 = r1
            ki.k r2 = (ki.InterfaceC4138k) r2
            boolean r2 = r2.mo9187a(r4)
            if (r2 == 0) goto Lb
            goto L20
        L1f:
            r1 = 0
        L20:
            ki.k r1 = (ki.InterfaceC4138k) r1
            if (r1 == 0) goto L27
            r1.mo9190d(r4, r5, r6)
        L27:
            return
    }

    @Override // p175ji.C3615e
    /* renamed from: e */
    public void mo8043e(java.net.Socket r2, java.net.InetSocketAddress r3, int r4) {
            r1 = this;
            java.lang.String r0 = "address"
            p214m2.C4339q.m9706k(r3, r0)
            r2.connect(r3, r4)     // Catch: java.lang.ClassCastException -> L9
            return
        L9:
            r2 = move-exception
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 != r4) goto L18
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Exception in connect"
            r3.<init>(r4, r2)
            throw r3
        L18:
            throw r2
    }

    @Override // p175ji.C3615e
    /* renamed from: f */
    public java.lang.String mo8040f(javax.net.ssl.SSLSocket r5) {
            r4 = this;
            java.util.List<ki.k> r0 = r4.f15881d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            r3 = r1
            ki.k r3 = (ki.InterfaceC4138k) r3
            boolean r3 = r3.mo9187a(r5)
            if (r3 == 0) goto L6
            goto L1c
        L1b:
            r1 = r2
        L1c:
            ki.k r1 = (ki.InterfaceC4138k) r1
            if (r1 == 0) goto L24
            java.lang.String r2 = r1.mo9188b(r5)
        L24:
            return r2
    }

    @Override // p175ji.C3615e
    /* renamed from: g */
    public java.lang.Object mo8044g(java.lang.String r6) {
            r5 = this;
            ki.h r0 = r5.f15882e
            java.util.Objects.requireNonNull(r0)
            java.lang.reflect.Method r1 = r0.f17157a
            r2 = 0
            if (r1 == 0) goto L1f
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L1f
            java.lang.Object r1 = r1.invoke(r2, r4)     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r0 = r0.f17158b     // Catch: java.lang.Exception -> L1f
            p214m2.C4339q.m9704i(r0)     // Catch: java.lang.Exception -> L1f
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L1f
            r4[r3] = r6     // Catch: java.lang.Exception -> L1f
            r0.invoke(r1, r4)     // Catch: java.lang.Exception -> L1f
            r2 = r1
        L1f:
            return r2
    }

    @Override // p175ji.C3615e
    /* renamed from: h */
    public boolean mo8041h(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "hostname"
            p214m2.C4339q.m9706k(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L14
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r3 = r0.isCleartextTrafficPermitted(r3)
            goto L27
        L14:
            r3 = 23
            if (r0 < r3) goto L26
            android.security.NetworkSecurityPolicy r3 = android.security.NetworkSecurityPolicy.getInstance()
            java.lang.String r0 = "NetworkSecurityPolicy.getInstance()"
            p214m2.C4339q.m9705j(r3, r0)
            boolean r3 = r3.isCleartextTrafficPermitted()
            goto L27
        L26:
            r3 = 1
        L27:
            return r3
    }

    @Override // p175ji.C3615e
    /* renamed from: k */
    public void mo8045k(java.lang.String r9, java.lang.Object r10) {
            r8 = this;
            java.lang.String r0 = "message"
            p214m2.C4339q.m9706k(r9, r0)
            ki.h r0 = r8.f15882e
            java.util.Objects.requireNonNull(r0)
            r1 = 0
            if (r10 == 0) goto L18
            java.lang.reflect.Method r0 = r0.f17159c     // Catch: java.lang.Exception -> L18
            p214m2.C4339q.m9704i(r0)     // Catch: java.lang.Exception -> L18
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L18
            r0.invoke(r10, r2)     // Catch: java.lang.Exception -> L18
            r1 = 1
        L18:
            if (r1 != 0) goto L23
            r4 = 5
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            r3 = r9
            p175ji.C3615e.m8048j(r2, r3, r4, r5, r6, r7)
        L23:
            return
    }
}
