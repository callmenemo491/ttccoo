package p224mi;

/* renamed from: mi.a */
/* loaded from: classes.dex */
public final class C4632a extends p224mi.AbstractC4634c {

    /* renamed from: a */
    public final p224mi.InterfaceC4636e f18482a;

    public C4632a(p224mi.InterfaceC4636e r2) {
            r1 = this;
            java.lang.String r0 = "trustRootIndex"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f18482a = r2
            return
    }

    @Override // p224mi.AbstractC4634c
    /* renamed from: a */
    public java.util.List<java.security.cert.Certificate> mo9192a(java.util.List<? extends java.security.cert.Certificate> r8, java.lang.String r9) {
            r7 = this;
            java.lang.String r0 = "chain"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "hostname"
            p214m2.C4339q.m9706k(r9, r0)
            java.util.ArrayDeque r9 = new java.util.ArrayDeque
            r9.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r0 = r9.removeFirst()
            java.lang.String r1 = "queue.removeFirst()"
            p214m2.C4339q.m9705j(r0, r1)
            r8.add(r0)
            r0 = 0
            r1 = 0
        L22:
            r2 = 9
            if (r0 >= r2) goto L99
            int r2 = r8.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r2 = r8.get(r2)
            java.lang.String r4 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            java.util.Objects.requireNonNull(r2, r4)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            mi.e r5 = r7.f18482a
            java.security.cert.X509Certificate r5 = r5.mo8046a(r2)
            if (r5 == 0) goto L58
            int r1 = r8.size()
            if (r1 > r3) goto L4c
            boolean r1 = p214m2.C4339q.m9702c(r2, r5)
            r1 = r1 ^ r3
            if (r1 == 0) goto L4f
        L4c:
            r8.add(r5)
        L4f:
            boolean r1 = r7.m10451b(r5, r5)
            if (r1 == 0) goto L56
            return r8
        L56:
            r1 = 1
            goto L7c
        L58:
            java.util.Iterator r3 = r9.iterator()
            java.lang.String r5 = "queue.iterator()"
            p214m2.C4339q.m9705j(r3, r5)
        L61:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r3.next()
            java.util.Objects.requireNonNull(r5, r4)
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5
            boolean r6 = r7.m10451b(r2, r5)
            if (r6 == 0) goto L61
            r3.remove()
            r8.add(r5)
        L7c:
            int r0 = r0 + 1
            goto L22
        L7f:
            if (r1 == 0) goto L82
            return r8
        L82:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L99:
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Certificate chain too long: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
    }

    /* renamed from: b */
    public final boolean m10451b(java.security.cert.X509Certificate r4, java.security.cert.X509Certificate r5) {
            r3 = this;
            java.security.Principal r0 = r4.getIssuerDN()
            java.security.Principal r1 = r5.getSubjectDN()
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 == 0) goto L12
            return r2
        L12:
            java.security.PublicKey r5 = r5.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L1a
            r4.verify(r5)     // Catch: java.security.GeneralSecurityException -> L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            return r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r3 != r2) goto L4
            goto L16
        L4:
            boolean r1 = r3 instanceof p224mi.C4632a
            if (r1 == 0) goto L15
            mi.a r3 = (p224mi.C4632a) r3
            mi.e r3 = r3.f18482a
            mi.e r1 = r2.f18482a
            boolean r3 = p214m2.C4339q.m9702c(r3, r1)
            if (r3 == 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    public int hashCode() {
            r1 = this;
            mi.e r0 = r1.f18482a
            int r0 = r0.hashCode()
            return r0
    }
}
