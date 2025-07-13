package fi;

/* renamed from: fi.f */
/* loaded from: classes.dex */
public final class C2184f extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<java.util.List<? extends java.security.cert.X509Certificate>> {

    /* renamed from: Z */
    public final /* synthetic */ fi.C2185g f9966Z;

    public C2184f(fi.C2185g r1) {
            r0 = this;
            r0.f9966Z = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4609a
    /* renamed from: e */
    public java.util.List<? extends java.security.cert.X509Certificate> mo15e() {
            r4 = this;
            fi.g r0 = r4.f9966Z
            bi.u r0 = r0.f9969d
            p214m2.C4339q.m9704i(r0)
            java.util.List r0 = r0.m2427c()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p062dh.C1469e.m3992D(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r0.next()
            java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
            java.lang.String r3 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            java.util.Objects.requireNonNull(r2, r3)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            r1.add(r2)
            goto L1a
        L31:
            return r1
    }
}
