package p175ji;

/* renamed from: ji.a */
/* loaded from: classes.dex */
public final class C3611a extends p175ji.C3615e {

    /* renamed from: e */
    public static final boolean f15876e = false;

    /* renamed from: f */
    public static final p175ji.C3611a f15877f = null;

    /* renamed from: d */
    public final java.util.List<ki.InterfaceC4138k> f15878d;

    static {
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
            p175ji.C3611a.f15876e = r0
            return
    }

    public C3611a() {
            r5 = this;
            r5.<init>()
            r0 = 4
            ki.k[] r0 = new ki.InterfaceC4138k[r0]
            java.lang.String r1 = "java.vm.name"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r2 = "Dalvik"
            boolean r1 = p214m2.C4339q.m9702c(r2, r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r1 < r4) goto L1e
            r1 = 1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 == 0) goto L27
            ki.a r1 = new ki.a
            r1.<init>()
            goto L28
        L27:
            r1 = 0
        L28:
            r0[r2] = r1
            ki.j r1 = new ki.j
            ki.f$a r2 = ki.C4133f.f17150g
            ki.j$a r2 = ki.C4133f.f17149f
            r1.<init>(r2)
            r0[r3] = r1
            r1 = 2
            ki.j r2 = new ki.j
            ki.j$a r3 = ki.C4136i.f17160a
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 3
            ki.j r2 = new ki.j
            ki.j$a r3 = ki.C4134g.f17156a
            r2.<init>(r3)
            r0[r1] = r2
            java.util.List r0 = p074e9.C1805a.m4530o(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r0.next()
            r3 = r2
            ki.k r3 = (ki.InterfaceC4138k) r3
            boolean r3 = r3.mo9189c()
            if (r3 == 0) goto L58
            r1.add(r2)
            goto L58
        L6f:
            r5.f15878d = r1
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
    /* renamed from: d */
    public void mo8039d(javax.net.ssl.SSLSocket r4, java.lang.String r5, java.util.List<? extends bi.EnumC0773b0> r6) {
            r3 = this;
            java.lang.String r0 = "protocols"
            p214m2.C4339q.m9706k(r6, r0)
            java.util.List<ki.k> r0 = r3.f15878d
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
    /* renamed from: f */
    public java.lang.String mo8040f(javax.net.ssl.SSLSocket r5) {
            r4 = this;
            java.util.List<ki.k> r0 = r4.f15878d
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
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: h */
    public boolean mo8041h(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "hostname"
            p214m2.C4339q.m9706k(r2, r0)
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r2 = r0.isCleartextTrafficPermitted(r2)
            return r2
    }
}
