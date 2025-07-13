package ki;

/* renamed from: ki.i */
/* loaded from: classes.dex */
public final class C4136i implements ki.InterfaceC4138k {

    /* renamed from: a */
    public static final ki.C4137j.a f17160a = null;

    /* renamed from: ki.i$a */
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
                okhttp3.internal.platform.b$a r0 = okhttp3.internal.platform.C5310b.f20564f
                boolean r0 = okhttp3.internal.platform.C5310b.f20563e
                if (r0 == 0) goto L13
                boolean r2 = org.conscrypt.Conscrypt.isConscrypt(r2)
                if (r2 == 0) goto L13
                r2 = 1
                goto L14
            L13:
                r2 = 0
            L14:
                return r2
        }

        @Override // ki.C4137j.a
        /* renamed from: b */
        public ki.InterfaceC4138k mo9194b(javax.net.ssl.SSLSocket r2) {
                r1 = this;
                java.lang.String r0 = "sslSocket"
                p214m2.C4339q.m9706k(r2, r0)
                ki.i r2 = new ki.i
                r2.<init>()
                return r2
        }
    }

    static {
            ki.i$a r0 = new ki.i$a
            r0.<init>()
            ki.C4136i.f17160a = r0
            return
    }

    public C4136i() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ki.InterfaceC4138k
    /* renamed from: a */
    public boolean mo9187a(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            boolean r1 = org.conscrypt.Conscrypt.isConscrypt(r1)
            return r1
    }

    @Override // ki.InterfaceC4138k
    /* renamed from: b */
    public java.lang.String mo9188b(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            boolean r0 = r1.mo9187a(r2)
            if (r0 == 0) goto Lb
            java.lang.String r2 = org.conscrypt.Conscrypt.getApplicationProtocol(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            return r2
    }

    @Override // ki.InterfaceC4138k
    /* renamed from: c */
    public boolean mo9189c() {
            r1 = this;
            okhttp3.internal.platform.b$a r0 = okhttp3.internal.platform.C5310b.f20564f
            boolean r0 = okhttp3.internal.platform.C5310b.f20563e
            return r0
    }

    @Override // ki.InterfaceC4138k
    /* renamed from: d */
    public void mo9190d(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List<? extends bi.EnumC0773b0> r3) {
            r0 = this;
            boolean r2 = r0.mo9187a(r1)
            if (r2 == 0) goto L23
            r2 = 1
            org.conscrypt.Conscrypt.setUseSessionTickets(r1, r2)
            ji.e$a r2 = p175ji.C3615e.f15897c
            java.util.List r2 = r2.m8053a(r3)
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            org.conscrypt.Conscrypt.setApplicationProtocols(r1, r2)
        L23:
            return
    }
}
