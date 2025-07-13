package ki;

@android.annotation.SuppressLint({"NewApi"})
/* renamed from: ki.a */
/* loaded from: classes.dex */
public final class C4128a implements ki.InterfaceC4138k {

    /* renamed from: ki.a$a */
    public static final class a {
        /* renamed from: a */
        public static final boolean m9191a() {
                ji.e$a r0 = p175ji.C3615e.f15897c
                boolean r0 = r0.m8055c()
                if (r0 == 0) goto L10
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }
    }

    public C4128a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ki.InterfaceC4138k
    /* renamed from: a */
    public boolean mo9187a(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r1 = android.net.ssl.SSLSockets.isSupportedSocket(r1)
            return r1
    }

    @Override // ki.InterfaceC4138k
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: b */
    public java.lang.String mo9188b(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r2 = r2.getApplicationProtocol()
            if (r2 != 0) goto L7
            goto L16
        L7:
            int r0 = r2.hashCode()
            if (r0 == 0) goto Le
            goto L17
        Le:
            java.lang.String r0 = ""
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @Override // ki.InterfaceC4138k
    /* renamed from: c */
    public boolean mo9189c() {
            r1 = this;
            boolean r0 = ki.C4128a.a.m9191a()
            return r0
    }

    @Override // ki.InterfaceC4138k
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo9190d(javax.net.ssl.SSLSocket r2, java.lang.String r3, java.util.List<? extends bi.EnumC0773b0> r4) {
            r1 = this;
            r3 = 1
            android.net.ssl.SSLSockets.setUseSessionTickets(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L2f
            javax.net.ssl.SSLParameters r3 = r2.getSSLParameters()     // Catch: java.lang.IllegalArgumentException -> L2f
            java.lang.String r0 = "sslParameters"
            p214m2.C4339q.m9705j(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L2f
            ji.e$a r0 = p175ji.C3615e.f15897c     // Catch: java.lang.IllegalArgumentException -> L2f
            java.util.List r4 = r0.m8053a(r4)     // Catch: java.lang.IllegalArgumentException -> L2f
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.IllegalArgumentException -> L2f
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.lang.IllegalArgumentException -> L2f
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch: java.lang.IllegalArgumentException -> L2f
            if (r4 == 0) goto L27
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: java.lang.IllegalArgumentException -> L2f
            r3.setApplicationProtocols(r4)     // Catch: java.lang.IllegalArgumentException -> L2f
            r2.setSSLParameters(r3)     // Catch: java.lang.IllegalArgumentException -> L2f
            return
        L27:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch: java.lang.IllegalArgumentException -> L2f
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T>"
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L2f
            throw r2     // Catch: java.lang.IllegalArgumentException -> L2f
        L2f:
            r2 = move-exception
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Android internal error"
            r3.<init>(r4, r2)
            throw r3
    }
}
