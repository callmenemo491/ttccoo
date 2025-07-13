package ki;

/* renamed from: ki.j */
/* loaded from: classes.dex */
public final class C4137j implements ki.InterfaceC4138k {

    /* renamed from: a */
    public ki.InterfaceC4138k f17161a;

    /* renamed from: b */
    public final ki.C4137j.a f17162b;

    /* renamed from: ki.j$a */
    public interface a {
        /* renamed from: a */
        boolean mo9193a(javax.net.ssl.SSLSocket r1);

        /* renamed from: b */
        ki.InterfaceC4138k mo9194b(javax.net.ssl.SSLSocket r1);
    }

    public C4137j(ki.C4137j.a r2) {
            r1 = this;
            java.lang.String r0 = "socketAdapterFactory"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f17162b = r2
            return
    }

    @Override // ki.InterfaceC4138k
    /* renamed from: a */
    public boolean mo9187a(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            ki.j$a r0 = r1.f17162b
            boolean r2 = r0.mo9193a(r2)
            return r2
    }

    @Override // ki.InterfaceC4138k
    /* renamed from: b */
    public java.lang.String mo9188b(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            ki.k r0 = r1.m9195e(r2)
            if (r0 == 0) goto Lb
            java.lang.String r2 = r0.mo9188b(r2)
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
            r0 = 1
            return r0
    }

    @Override // ki.InterfaceC4138k
    /* renamed from: d */
    public void mo9190d(javax.net.ssl.SSLSocket r2, java.lang.String r3, java.util.List<? extends bi.EnumC0773b0> r4) {
            r1 = this;
            ki.k r0 = r1.m9195e(r2)
            if (r0 == 0) goto L9
            r0.mo9190d(r2, r3, r4)
        L9:
            return
    }

    /* renamed from: e */
    public final synchronized ki.InterfaceC4138k m9195e(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            monitor-enter(r1)
            ki.k r0 = r1.f17161a     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L15
            ki.j$a r0 = r1.f17162b     // Catch: java.lang.Throwable -> L19
            boolean r0 = r0.mo9193a(r2)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L15
            ki.j$a r0 = r1.f17162b     // Catch: java.lang.Throwable -> L19
            ki.k r2 = r0.mo9194b(r2)     // Catch: java.lang.Throwable -> L19
            r1.f17161a = r2     // Catch: java.lang.Throwable -> L19
        L15:
            ki.k r2 = r1.f17161a     // Catch: java.lang.Throwable -> L19
            monitor-exit(r1)
            return r2
        L19:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
