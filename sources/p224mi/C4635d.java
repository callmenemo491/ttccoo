package p224mi;

/* renamed from: mi.d */
/* loaded from: classes.dex */
public final class C4635d implements javax.net.ssl.HostnameVerifier {

    /* renamed from: a */
    public static final p224mi.C4635d f18484a = null;

    static {
            mi.d r0 = new mi.d
            r0.<init>()
            p224mi.C4635d.f18484a = r0
            return
    }

    public C4635d() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final java.util.List<java.lang.String> m10452a(java.security.cert.X509Certificate r5, int r6) {
            r4 = this;
            java.util.Collection r5 = r5.getSubjectAlternativeNames()     // Catch: java.security.cert.CertificateParsingException -> L47
            if (r5 == 0) goto L44
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.security.cert.CertificateParsingException -> L47
            r0.<init>()     // Catch: java.security.cert.CertificateParsingException -> L47
            java.util.Iterator r5 = r5.iterator()     // Catch: java.security.cert.CertificateParsingException -> L47
        Lf:
            boolean r1 = r5.hasNext()     // Catch: java.security.cert.CertificateParsingException -> L47
            if (r1 == 0) goto L43
            java.lang.Object r1 = r5.next()     // Catch: java.security.cert.CertificateParsingException -> L47
            java.util.List r1 = (java.util.List) r1     // Catch: java.security.cert.CertificateParsingException -> L47
            if (r1 == 0) goto Lf
            int r2 = r1.size()     // Catch: java.security.cert.CertificateParsingException -> L47
            r3 = 2
            if (r2 >= r3) goto L25
            goto Lf
        L25:
            r2 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch: java.security.cert.CertificateParsingException -> L47
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.security.cert.CertificateParsingException -> L47
            boolean r2 = p214m2.C4339q.m9702c(r2, r3)     // Catch: java.security.cert.CertificateParsingException -> L47
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L37
            goto Lf
        L37:
            java.lang.Object r1 = r1.get(r3)     // Catch: java.security.cert.CertificateParsingException -> L47
            if (r1 == 0) goto Lf
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.security.cert.CertificateParsingException -> L47
            r0.add(r1)     // Catch: java.security.cert.CertificateParsingException -> L47
            goto Lf
        L43:
            return r0
        L44:
            dh.k r5 = p062dh.C1475k.f7237Y     // Catch: java.security.cert.CertificateParsingException -> L47
            return r5
        L47:
            dh.k r5 = p062dh.C1475k.f7237Y
            return r5
    }

    /* renamed from: b */
    public final boolean m10453b(java.lang.String r13, java.security.cert.X509Certificate r14) {
            r12 = this;
            java.lang.String r0 = "host"
            p214m2.C4339q.m9706k(r13, r0)
            byte[] r0 = ci.C0988c.f5065a
            uh.c r0 = ci.C0988c.f5070f
            boolean r0 = r0.m13043a(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3e
            java.lang.String r13 = gh.C2390b.m6135y(r13)
            r0 = 7
            java.util.List r14 = r12.m10452a(r14, r0)
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L22
            goto L129
        L22:
            java.util.Iterator r14 = r14.iterator()
        L26:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L129
            java.lang.Object r0 = r14.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = gh.C2390b.m6135y(r0)
            boolean r0 = p214m2.C4339q.m9702c(r13, r0)
            if (r0 == 0) goto L26
            goto L12a
        L3e:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = "Locale.US"
            p214m2.C4339q.m9705j(r0, r3)
            java.lang.String r13 = r13.toLowerCase(r0)
            java.lang.String r0 = "(this as java.lang.String).toLowerCase(locale)"
            p214m2.C4339q.m9705j(r13, r0)
            r4 = 2
            java.util.List r14 = r12.m10452a(r14, r4)
            boolean r5 = r14.isEmpty()
            if (r5 == 0) goto L5b
            goto L129
        L5b:
            java.util.Iterator r14 = r14.iterator()
        L5f:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L129
            java.lang.Object r5 = r14.next()
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r13.length()
            if (r6 != 0) goto L73
            r6 = 1
            goto L74
        L73:
            r6 = 0
        L74:
            if (r6 != 0) goto L125
            java.lang.String r6 = "."
            boolean r7 = p362uh.C6463i.m13061R(r13, r6, r2, r4)
            if (r7 != 0) goto L125
            java.lang.String r7 = ".."
            boolean r8 = p362uh.C6463i.m13052I(r13, r7, r2, r4)
            if (r8 == 0) goto L88
            goto L125
        L88:
            if (r5 == 0) goto L93
            int r8 = r5.length()
            if (r8 != 0) goto L91
            goto L93
        L91:
            r8 = 0
            goto L94
        L93:
            r8 = 1
        L94:
            if (r8 != 0) goto L125
            boolean r8 = p362uh.C6463i.m13061R(r5, r6, r2, r4)
            if (r8 != 0) goto L125
            boolean r7 = p362uh.C6463i.m13052I(r5, r7, r2, r4)
            if (r7 == 0) goto La4
            goto L125
        La4:
            boolean r7 = p362uh.C6463i.m13052I(r13, r6, r2, r4)
            if (r7 != 0) goto Laf
            java.lang.String r7 = p064e.C1493g.m4049a(r13, r6)
            goto Lb0
        Laf:
            r7 = r13
        Lb0:
            boolean r8 = p362uh.C6463i.m13052I(r5, r6, r2, r4)
            if (r8 != 0) goto Lba
            java.lang.String r5 = p064e.C1493g.m4049a(r5, r6)
        Lba:
            java.util.Locale r6 = java.util.Locale.US
            p214m2.C4339q.m9705j(r6, r3)
            java.lang.String r8 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r5, r8)
            java.lang.String r5 = r5.toLowerCase(r6)
            p214m2.C4339q.m9705j(r5, r0)
            java.lang.String r6 = "*"
            boolean r6 = p362uh.C6467m.m13064U(r5, r6, r2, r4)
            if (r6 != 0) goto Ld8
            boolean r5 = p214m2.C4339q.m9702c(r7, r5)
            goto L126
        Ld8:
            java.lang.String r6 = "*."
            boolean r8 = p362uh.C6463i.m13061R(r5, r6, r2, r4)
            if (r8 == 0) goto L125
            r8 = 42
            r9 = 4
            int r8 = p362uh.C6467m.m13069Z(r5, r8, r1, r2, r9)
            r10 = -1
            if (r8 == r10) goto Leb
            goto L125
        Leb:
            int r8 = r7.length()
            int r11 = r5.length()
            if (r8 >= r11) goto Lf6
            goto L125
        Lf6:
            boolean r6 = p214m2.C4339q.m9702c(r6, r5)
            if (r6 == 0) goto Lfd
            goto L125
        Lfd:
            java.lang.String r5 = r5.substring(r1)
            java.lang.String r6 = "(this as java.lang.String).substring(startIndex)"
            p214m2.C4339q.m9705j(r5, r6)
            boolean r6 = p362uh.C6463i.m13052I(r7, r5, r2, r4)
            if (r6 != 0) goto L10d
            goto L125
        L10d:
            int r6 = r7.length()
            int r5 = r5.length()
            int r6 = r6 - r5
            if (r6 <= 0) goto L123
            r5 = 46
            int r6 = r6 + (-1)
            int r5 = p362uh.C6467m.m13072c0(r7, r5, r6, r2, r9)
            if (r5 == r10) goto L123
            goto L125
        L123:
            r5 = 1
            goto L126
        L125:
            r5 = 0
        L126:
            if (r5 == 0) goto L5f
            goto L12a
        L129:
            r1 = 0
        L12a:
            return r1
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(java.lang.String r2, javax.net.ssl.SSLSession r3) {
            r1 = this;
            java.lang.String r0 = "host"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "session"
            p214m2.C4339q.m9706k(r3, r0)
            r0 = 0
            java.security.cert.Certificate[] r3 = r3.getPeerCertificates()     // Catch: javax.net.ssl.SSLException -> L22
            r3 = r3[r0]     // Catch: javax.net.ssl.SSLException -> L22
            if (r3 == 0) goto L1a
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch: javax.net.ssl.SSLException -> L22
            boolean r0 = r1.m10453b(r2, r3)     // Catch: javax.net.ssl.SSLException -> L22
            goto L22
        L1a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch: javax.net.ssl.SSLException -> L22
            java.lang.String r3 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r2.<init>(r3)     // Catch: javax.net.ssl.SSLException -> L22
            throw r2     // Catch: javax.net.ssl.SSLException -> L22
        L22:
            return r0
    }
}
