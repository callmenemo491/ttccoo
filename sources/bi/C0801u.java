package bi;

/* renamed from: bi.u */
/* loaded from: classes.dex */
public final class C0801u {

    /* renamed from: a */
    public final ch.InterfaceC0977d f4334a;

    /* renamed from: b */
    public final bi.EnumC0791k0 f4335b;

    /* renamed from: c */
    public final bi.C0788j f4336c;

    /* renamed from: d */
    public final java.util.List<java.security.cert.Certificate> f4337d;

    /* renamed from: bi.u$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<java.util.List<? extends java.security.cert.Certificate>> {

        /* renamed from: Z */
        public final /* synthetic */ java.util.List f4338Z;

        public a(java.util.List r1) {
                r0 = this;
                r0.f4338Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public java.util.List<? extends java.security.cert.Certificate> mo15e() {
                r1 = this;
                java.util.List r0 = r1.f4338Z
                return r0
        }
    }

    /* renamed from: bi.u$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<java.util.List<? extends java.security.cert.Certificate>> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f4339Z;

        public b(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f4339Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public java.util.List<? extends java.security.cert.Certificate> mo15e() {
                r1 = this;
                mh.a r0 = r1.f4339Z     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L9
                java.lang.Object r0 = r0.mo15e()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L9
                java.util.List r0 = (java.util.List) r0     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L9
                goto Lb
            L9:
                dh.k r0 = p062dh.C1475k.f7237Y
            Lb:
                return r0
        }
    }

    public C0801u(bi.EnumC0791k0 r2, bi.C0788j r3, java.util.List<? extends java.security.cert.Certificate> r4, mh.InterfaceC4609a<? extends java.util.List<? extends java.security.cert.Certificate>> r5) {
            r1 = this;
            java.lang.String r0 = "tlsVersion"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "cipherSuite"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "localCertificates"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.f4335b = r2
            r1.f4336c = r3
            r1.f4337d = r4
            bi.u$b r2 = new bi.u$b
            r2.<init>(r5)
            ch.d r2 = p185k7.C4038x4.m9096i(r2)
            r1.f4334a = r2
            return
    }

    /* renamed from: a */
    public static final bi.C0801u m2425a(javax.net.ssl.SSLSession r5) {
            java.lang.String r0 = r5.getCipherSuite()
            if (r0 == 0) goto L96
            int r1 = r0.hashCode()
            r2 = 1019404634(0x3cc2e15a, float:0.023789097)
            if (r1 == r2) goto L1e
            r2 = 1208658923(0x480aabeb, float:141999.67)
            if (r1 == r2) goto L15
            goto L26
        L15:
            java.lang.String r1 = "SSL_NULL_WITH_NULL_NULL"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L8a
            goto L26
        L1e:
            java.lang.String r1 = "TLS_NULL_WITH_NULL_NULL"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L8a
        L26:
            bi.j$b r1 = bi.C0788j.f4284t
            bi.j r0 = r1.m2399b(r0)
            java.lang.String r1 = r5.getProtocol()
            if (r1 == 0) goto L7e
            java.lang.String r2 = "NONE"
            boolean r2 = p214m2.C4339q.m9702c(r2, r1)
            if (r2 != 0) goto L76
            bi.k0$a r2 = bi.EnumC0791k0.f4295f0
            bi.k0 r1 = r2.m2402a(r1)
            java.security.cert.Certificate[] r2 = r5.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L55
            if (r2 == 0) goto L52
            int r3 = r2.length     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L55
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L55
            java.security.cert.Certificate[] r2 = (java.security.cert.Certificate[]) r2     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L55
            java.util.List r2 = ci.C0988c.m2706k(r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L55
            goto L57
        L52:
            dh.k r2 = p062dh.C1475k.f7237Y     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L55
            goto L57
        L55:
            dh.k r2 = p062dh.C1475k.f7237Y
        L57:
            bi.u r3 = new bi.u
            java.security.cert.Certificate[] r5 = r5.getLocalCertificates()
            if (r5 == 0) goto L6b
            int r4 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r4)
            java.security.cert.Certificate[] r5 = (java.security.cert.Certificate[]) r5
            java.util.List r5 = ci.C0988c.m2706k(r5)
            goto L6d
        L6b:
            dh.k r5 = p062dh.C1475k.f7237Y
        L6d:
            bi.u$a r4 = new bi.u$a
            r4.<init>(r2)
            r3.<init>(r1, r0, r5, r4)
            return r3
        L76:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "tlsVersion == NONE"
            r5.<init>(r0)
            throw r5
        L7e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "tlsVersion == null"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L8a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r1 = "cipherSuite == "
            java.lang.String r0 = p064e.C1493g.m4049a(r1, r0)
            r5.<init>(r0)
            throw r5
        L96:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    /* renamed from: b */
    public final java.lang.String m2426b(java.security.cert.Certificate r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.security.cert.X509Certificate
            if (r0 == 0) goto Lf
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.security.Principal r2 = r2.getSubjectDN()
            java.lang.String r2 = r2.toString()
            goto L18
        Lf:
            java.lang.String r2 = r2.getType()
            java.lang.String r0 = "type"
            p214m2.C4339q.m9705j(r2, r0)
        L18:
            return r2
    }

    /* renamed from: c */
    public final java.util.List<java.security.cert.Certificate> m2427c() {
            r1 = this;
            ch.d r0 = r1.f4334a
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof bi.C0801u
            if (r0 == 0) goto L30
            bi.u r3 = (bi.C0801u) r3
            bi.k0 r0 = r3.f4335b
            bi.k0 r1 = r2.f4335b
            if (r0 != r1) goto L30
            bi.j r0 = r3.f4336c
            bi.j r1 = r2.f4336c
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L30
            java.util.List r0 = r3.m2427c()
            java.util.List r1 = r2.m2427c()
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L30
            java.util.List<java.security.cert.Certificate> r3 = r3.f4337d
            java.util.List<java.security.cert.Certificate> r0 = r2.f4337d
            boolean r3 = p214m2.C4339q.m9702c(r3, r0)
            if (r3 == 0) goto L30
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            return r3
    }

    public int hashCode() {
            r2 = this;
            bi.k0 r0 = r2.f4335b
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            bi.j r1 = r2.f4336c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List r0 = r2.m2427c()
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<java.security.cert.Certificate> r1 = r2.f4337d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r5 = this;
            java.util.List r0 = r5.m2427c()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = p062dh.C1469e.m3992D(r0, r2)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r3 = r0.next()
            java.security.cert.Certificate r3 = (java.security.cert.Certificate) r3
            java.lang.String r3 = r5.m2426b(r3)
            r1.add(r3)
            goto L13
        L27:
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Handshake{"
            java.lang.String r3 = "tlsVersion="
            java.lang.StringBuilder r1 = android.support.v4.media.C0143b.m255a(r1, r3)
            bi.k0 r3 = r5.f4335b
            r1.append(r3)
            r3 = 32
            r1.append(r3)
            java.lang.String r4 = "cipherSuite="
            r1.append(r4)
            bi.j r4 = r5.f4336c
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = "peerCertificates="
            r1.append(r4)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "localCertificates="
            r1.append(r0)
            java.util.List<java.security.cert.Certificate> r0 = r5.f4337d
            java.util.ArrayList r3 = new java.util.ArrayList
            int r2 = p062dh.C1469e.m3992D(r0, r2)
            r3.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L69:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7d
            java.lang.Object r2 = r0.next()
            java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
            java.lang.String r2 = r5.m2426b(r2)
            r3.add(r2)
            goto L69
        L7d:
            r1.append(r3)
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
