package okhttp3.internal.platform;

/* renamed from: okhttp3.internal.platform.a */
/* loaded from: classes.dex */
public final class C5309a extends p175ji.C3615e {

    /* renamed from: e */
    public static final boolean f20560e = false;

    /* renamed from: f */
    public static final okhttp3.internal.platform.C5309a.a f20561f = null;

    /* renamed from: d */
    public final java.security.Provider f20562d;

    /* renamed from: okhttp3.internal.platform.a$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.internal.platform.a$a r0 = new okhttp3.internal.platform.a$a
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.C5309a.f20561f = r0
            r1 = 0
            java.lang.String r2 = "org.bouncycastle.jsse.provider.BouncyCastleJsseProvider"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L17
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L17
            java.lang.Class.forName(r2, r1, r0)     // Catch: java.lang.ClassNotFoundException -> L17
            r1 = 1
        L17:
            okhttp3.internal.platform.C5309a.f20560e = r1
            return
    }

    public C5309a() {
            r1 = this;
            r1.<init>()
            org.bouncycastle.jsse.provider.BouncyCastleJsseProvider r0 = new org.bouncycastle.jsse.provider.BouncyCastleJsseProvider
            r0.<init>()
            java.security.Provider r0 = (java.security.Provider) r0
            r1.f20562d = r0
            return
    }

    @Override // p175ji.C3615e
    /* renamed from: d */
    public void mo8039d(javax.net.ssl.SSLSocket r6, java.lang.String r7, java.util.List<bi.EnumC0773b0> r8) {
            r5 = this;
            java.lang.String r7 = "protocols"
            p214m2.C4339q.m9706k(r8, r7)
            boolean r0 = r6 instanceof org.bouncycastle.jsse.BCSSLSocket
            if (r0 == 0) goto L6b
            org.bouncycastle.jsse.BCSSLSocket r6 = (org.bouncycastle.jsse.BCSSLSocket) r6
            org.bouncycastle.jsse.BCSSLParameters r7 = r6.getParameters()
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
            java.util.ArrayList r8 = new java.util.ArrayList
            r1 = 10
            int r1 = p062dh.C1469e.m3992D(r0, r1)
            r8.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L40:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r0.next()
            bi.b0 r1 = (bi.EnumC0773b0) r1
            java.lang.String r1 = r1.f4191Y
            r8.add(r1)
            goto L40
        L52:
            java.lang.String r0 = "sslParameters"
            p214m2.C4339q.m9705j(r7, r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r8 = r8.toArray(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r8, r0)
            java.lang.String[] r8 = (java.lang.String[]) r8
            r7.setApplicationProtocols(r8)
            r6.setParameters(r7)
            goto L6e
        L6b:
            p214m2.C4339q.m9706k(r8, r7)
        L6e:
            return
    }

    @Override // p175ji.C3615e
    /* renamed from: f */
    public java.lang.String mo8040f(javax.net.ssl.SSLSocket r3) {
            r2 = this;
            boolean r0 = r3 instanceof org.bouncycastle.jsse.BCSSLSocket
            r1 = 0
            if (r0 == 0) goto L1f
            org.bouncycastle.jsse.BCSSLSocket r3 = (org.bouncycastle.jsse.BCSSLSocket) r3
            java.lang.String r3 = r3.getApplicationProtocol()
            if (r3 != 0) goto Le
            goto L1f
        Le:
            int r0 = r3.hashCode()
            if (r0 == 0) goto L15
            goto L1e
        L15:
            java.lang.String r0 = ""
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1e
            goto L1f
        L1e:
            r1 = r3
        L1f:
            return r1
    }

    @Override // p175ji.C3615e
    /* renamed from: l */
    public javax.net.ssl.SSLContext mo8050l() {
            r2 = this;
            java.security.Provider r0 = r2.f20562d
            java.lang.String r1 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r1, r0)
            java.lang.String r1 = "SSLContext.getInstance(\"TLS\", provider)"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }

    @Override // p175ji.C3615e
    /* renamed from: n */
    public javax.net.ssl.X509TrustManager mo8052n() {
            r4 = this;
            java.lang.String r0 = "PKIX"
            java.lang.String r1 = "BCJSSE"
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0, r1)
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
}
