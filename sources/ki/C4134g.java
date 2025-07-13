package ki;

/* renamed from: ki.g */
/* loaded from: classes.dex */
public final class C4134g implements ki.InterfaceC4138k {

    /* renamed from: a */
    public static final ki.C4137j.a f17156a = null;

    /* renamed from: ki.g$a */
    public static final class a implements ki.C4137j.a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // ki.C4137j.a
        /* renamed from: a */
        public boolean mo9193a(javax.net.ssl.SSLSocket r2) {
                r1 = this;
                java.lang.String r0 = "sslSocket"
                p214m2.C4339q.m9706k(r2, r0)
                okhttp3.internal.platform.a$a r0 = okhttp3.internal.platform.C5309a.f20561f
                boolean r0 = okhttp3.internal.platform.C5309a.f20560e
                if (r0 == 0) goto L11
                boolean r2 = r2 instanceof org.bouncycastle.jsse.BCSSLSocket
                if (r2 == 0) goto L11
                r2 = 1
                goto L12
            L11:
                r2 = 0
            L12:
                return r2
        }

        @Override // ki.C4137j.a
        /* renamed from: b */
        public ki.InterfaceC4138k mo9194b(javax.net.ssl.SSLSocket r2) {
                r1 = this;
                java.lang.String r0 = "sslSocket"
                p214m2.C4339q.m9706k(r2, r0)
                ki.g r2 = new ki.g
                r2.<init>()
                return r2
        }
    }

    static {
            ki.g$a r0 = new ki.g$a
            r0.<init>()
            ki.C4134g.f17156a = r0
            return
    }

    public C4134g() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ki.InterfaceC4138k
    /* renamed from: a */
    public boolean mo9187a(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r1 = r1 instanceof org.bouncycastle.jsse.BCSSLSocket
            return r1
    }

    @Override // ki.InterfaceC4138k
    /* renamed from: b */
    public java.lang.String mo9188b(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            org.bouncycastle.jsse.BCSSLSocket r2 = (org.bouncycastle.jsse.BCSSLSocket) r2
            java.lang.String r2 = r2.getApplicationProtocol()
            if (r2 != 0) goto L9
            goto L18
        L9:
            int r0 = r2.hashCode()
            if (r0 == 0) goto L10
            goto L19
        L10:
            java.lang.String r0 = ""
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L19
        L18:
            r2 = 0
        L19:
            return r2
    }

    @Override // ki.InterfaceC4138k
    /* renamed from: c */
    public boolean mo9189c() {
            r1 = this;
            okhttp3.internal.platform.a$a r0 = okhttp3.internal.platform.C5309a.f20561f
            boolean r0 = okhttp3.internal.platform.C5309a.f20560e
            return r0
    }

    @Override // ki.InterfaceC4138k
    /* renamed from: d */
    public void mo9190d(javax.net.ssl.SSLSocket r2, java.lang.String r3, java.util.List<? extends bi.EnumC0773b0> r4) {
            r1 = this;
            boolean r3 = r1.mo9187a(r2)
            if (r3 == 0) goto L2d
            org.bouncycastle.jsse.BCSSLSocket r2 = (org.bouncycastle.jsse.BCSSLSocket) r2
            org.bouncycastle.jsse.BCSSLParameters r3 = r2.getParameters()
            java.lang.String r0 = "sslParameters"
            p214m2.C4339q.m9705j(r3, r0)
            ji.e$a r0 = p175ji.C3615e.f15897c
            java.util.List r4 = r0.m8053a(r4)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object[] r4 = r4.toArray(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r3.setApplicationProtocols(r4)
            r2.setParameters(r3)
        L2d:
            return
    }
}
