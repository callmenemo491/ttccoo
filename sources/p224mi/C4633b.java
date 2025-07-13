package p224mi;

/* renamed from: mi.b */
/* loaded from: classes.dex */
public final class C4633b implements p224mi.InterfaceC4636e {

    /* renamed from: a */
    public final java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> f18483a;

    public C4633b(java.security.cert.X509Certificate... r7) {
            r6 = this;
            java.lang.String r0 = "caCerts"
            p214m2.C4339q.m9706k(r7, r0)
            r6.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            int r1 = r7.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L32
            r3 = r7[r2]
            javax.security.auth.x500.X500Principal r4 = r3.getSubjectX500Principal()
            java.lang.String r5 = "caCert.subjectX500Principal"
            p214m2.C4339q.m9705j(r4, r5)
            java.lang.Object r5 = r0.get(r4)
            if (r5 != 0) goto L2a
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            r0.put(r4, r5)
        L2a:
            java.util.Set r5 = (java.util.Set) r5
            r5.add(r3)
            int r2 = r2 + 1
            goto Lf
        L32:
            r6.f18483a = r0
            return
    }

    @Override // p224mi.InterfaceC4636e
    /* renamed from: a */
    public java.security.cert.X509Certificate mo8046a(java.security.cert.X509Certificate r5) {
            r4 = this;
            javax.security.auth.x500.X500Principal r0 = r5.getIssuerX500Principal()
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r1 = r4.f18483a
            java.lang.Object r0 = r1.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            r1 = 0
            if (r0 == 0) goto L2f
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            java.security.PublicKey r3 = r3.getPublicKey()     // Catch: java.lang.Exception -> L29
            r5.verify(r3)     // Catch: java.lang.Exception -> L29
            r3 = 1
            goto L2a
        L29:
            r3 = 0
        L2a:
            if (r3 == 0) goto L13
            r1 = r2
        L2d:
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
        L2f:
            return r1
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L15
            boolean r0 = r2 instanceof p224mi.C4633b
            if (r0 == 0) goto L13
            mi.b r2 = (p224mi.C4633b) r2
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r2 = r2.f18483a
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r0 = r1.f18483a
            boolean r2 = p214m2.C4339q.m9702c(r2, r0)
            if (r2 == 0) goto L13
            goto L15
        L13:
            r2 = 0
            goto L16
        L15:
            r2 = 1
        L16:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r0 = r1.f18483a
            int r0 = r0.hashCode()
            return r0
    }
}
