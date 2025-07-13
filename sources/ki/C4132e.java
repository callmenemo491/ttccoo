package ki;

/* renamed from: ki.e */
/* loaded from: classes.dex */
public final class C4132e implements ki.C4137j.a {

    /* renamed from: a */
    public final /* synthetic */ java.lang.String f17148a;

    public C4132e(java.lang.String r1) {
            r0 = this;
            r0.f17148a = r1
            r0.<init>()
            return
    }

    @Override // ki.C4137j.a
    /* renamed from: a */
    public boolean mo9193a(javax.net.ssl.SSLSocket r4) {
            r3 = this;
            java.lang.String r0 = "sslSocket"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.f17148a
            r2 = 46
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            r1 = 0
            r2 = 2
            boolean r4 = p362uh.C6463i.m13061R(r4, r0, r1, r2)
            return r4
    }

    @Override // ki.C4137j.a
    /* renamed from: b */
    public ki.InterfaceC4138k mo9194b(javax.net.ssl.SSLSocket r4) {
            r3 = this;
            java.lang.String r0 = "sslSocket"
            p214m2.C4339q.m9706k(r4, r0)
            ki.f$a r0 = ki.C4133f.f17150g
            java.lang.Class r4 = r4.getClass()
            r0 = r4
        Lc:
            java.lang.String r1 = r0.getSimpleName()
            java.lang.String r2 = "OpenSSLSocketImpl"
            boolean r1 = p214m2.C4339q.m9702c(r1, r2)
            r1 = r1 ^ 1
            if (r1 == 0) goto L38
            java.lang.Class r0 = r0.getSuperclass()
            if (r0 == 0) goto L21
            goto Lc
        L21:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No OpenSSLSocketImpl superclass of socket of type "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L38:
            ki.f r4 = new ki.f
            p214m2.C4339q.m9704i(r0)
            r4.<init>(r0)
            return r4
    }
}
