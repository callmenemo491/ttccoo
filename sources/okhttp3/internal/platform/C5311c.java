package okhttp3.internal.platform;

/* renamed from: okhttp3.internal.platform.c */
/* loaded from: classes.dex */
public final class C5311c extends p175ji.C3615e {

    /* renamed from: e */
    public static final boolean f20567e = false;

    /* renamed from: f */
    public static final okhttp3.internal.platform.C5311c.a f20568f = null;

    /* renamed from: d */
    public final java.security.Provider f20569d;

    /* renamed from: okhttp3.internal.platform.c$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.internal.platform.c$a r0 = new okhttp3.internal.platform.c$a
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.C5311c.f20568f = r0
            r1 = 0
            java.lang.String r2 = "org.openjsse.net.ssl.OpenJSSE"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L17
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L17
            java.lang.Class.forName(r2, r1, r0)     // Catch: java.lang.ClassNotFoundException -> L17
            r1 = 1
        L17:
            okhttp3.internal.platform.C5311c.f20567e = r1
            return
    }

    public C5311c() {
            r1 = this;
            r1.<init>()
            org.openjsse.net.ssl.OpenJSSE r0 = new org.openjsse.net.ssl.OpenJSSE
            r0.<init>()
            java.security.Provider r0 = (java.security.Provider) r0
            r1.f20569d = r0
            return
    }

    @Override // p175ji.C3615e
    /* renamed from: d */
    public void mo8039d(javax.net.ssl.SSLSocket r6, java.lang.String r7, java.util.List<bi.EnumC0773b0> r8) {
            r5 = this;
            java.lang.String r7 = "protocols"
            p214m2.C4339q.m9706k(r8, r7)
            boolean r0 = r6 instanceof org.openjsse.javax.net.ssl.SSLSocket
            if (r0 == 0) goto L6d
            org.openjsse.javax.net.ssl.SSLSocket r6 = (org.openjsse.javax.net.ssl.SSLSocket) r6
            javax.net.ssl.SSLParameters r7 = r6.getSSLParameters()
            boolean r0 = r7 instanceof org.openjsse.javax.net.ssl.SSLParameters
            if (r0 == 0) goto L70
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1c:
            boolean r1 = r8.hasNext()
            r2 = 0
            if (r1 == 0) goto L35
            java.lang.Object r1 = r8.next()
            r3 = r1
            bi.b0 r3 = (bi.EnumC0773b0) r3
            bi.b0 r4 = bi.EnumC0773b0.f4184Z
            if (r3 == r4) goto L2f
            r2 = 1
        L2f:
            if (r2 == 0) goto L1c
            r0.add(r1)
            goto L1c
        L35:
            java.util.ArrayList r8 = new java.util.ArrayList
            r1 = 10
            int r1 = p062dh.C1469e.m3992D(r0, r1)
            r8.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L44:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            bi.b0 r1 = (bi.EnumC0773b0) r1
            java.lang.String r1 = r1.f4191Y
            r8.add(r1)
            goto L44
        L56:
            r0 = r7
            org.openjsse.javax.net.ssl.SSLParameters r0 = (org.openjsse.javax.net.ssl.SSLParameters) r0
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.Object[] r8 = r8.toArray(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r8, r1)
            java.lang.String[] r8 = (java.lang.String[]) r8
            r0.setApplicationProtocols(r8)
            r6.setSSLParameters(r7)
            goto L70
        L6d:
            p214m2.C4339q.m9706k(r8, r7)
        L70:
            return
    }

    @Override // p175ji.C3615e
    /* renamed from: f */
    public java.lang.String mo8040f(javax.net.ssl.SSLSocket r3) {
            r2 = this;
            boolean r0 = r3 instanceof org.openjsse.javax.net.ssl.SSLSocket
            r1 = 0
            if (r0 == 0) goto L1f
            org.openjsse.javax.net.ssl.SSLSocket r3 = (org.openjsse.javax.net.ssl.SSLSocket) r3
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
            java.security.Provider r0 = r2.f20569d
            java.lang.String r1 = "TLSv1.3"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r1, r0)
            java.lang.String r1 = "SSLContext.getInstance(\"TLSv1.3\", provider)"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }

    @Override // p175ji.C3615e
    /* renamed from: n */
    public javax.net.ssl.X509TrustManager mo8052n() {
            r4 = this;
            java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
            java.security.Provider r1 = r4.f20569d
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0, r1)
            r1 = 0
            r0.init(r1)
            javax.net.ssl.TrustManager[] r0 = r0.getTrustManagers()
            p214m2.C4339q.m9704i(r0)
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L21
            r1 = r0[r3]
            boolean r1 = r1 instanceof javax.net.ssl.X509TrustManager
            if (r1 == 0) goto L21
            goto L22
        L21:
            r2 = 0
        L22:
            if (r2 == 0) goto L2e
            r0 = r0[r3]
            java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"
            java.util.Objects.requireNonNull(r0, r1)
            javax.net.ssl.X509TrustManager r0 = (javax.net.ssl.X509TrustManager) r0
            return r0
        L2e:
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
