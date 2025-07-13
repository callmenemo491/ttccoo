package bi;

/* renamed from: bi.a */
/* loaded from: classes.dex */
public final class C0770a {

    /* renamed from: a */
    public final bi.C0803w f4124a;

    /* renamed from: b */
    public final java.util.List<bi.EnumC0773b0> f4125b;

    /* renamed from: c */
    public final java.util.List<bi.C0792l> f4126c;

    /* renamed from: d */
    public final bi.InterfaceC0798r f4127d;

    /* renamed from: e */
    public final javax.net.SocketFactory f4128e;

    /* renamed from: f */
    public final javax.net.ssl.SSLSocketFactory f4129f;

    /* renamed from: g */
    public final javax.net.ssl.HostnameVerifier f4130g;

    /* renamed from: h */
    public final bi.C0784h f4131h;

    /* renamed from: i */
    public final bi.InterfaceC0774c f4132i;

    /* renamed from: j */
    public final java.net.Proxy f4133j;

    /* renamed from: k */
    public final java.net.ProxySelector f4134k;

    public C0770a(java.lang.String r13, int r14, bi.InterfaceC0798r r15, javax.net.SocketFactory r16, javax.net.ssl.SSLSocketFactory r17, javax.net.ssl.HostnameVerifier r18, bi.C0784h r19, bi.InterfaceC0774c r20, java.net.Proxy r21, java.util.List<? extends bi.EnumC0773b0> r22, java.util.List<bi.C0792l> r23, java.net.ProxySelector r24) {
            r12 = this;
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r20
            r7 = r24
            java.lang.String r8 = "uriHost"
            p214m2.C4339q.m9706k(r13, r8)
            java.lang.String r8 = "dns"
            p214m2.C4339q.m9706k(r15, r8)
            java.lang.String r8 = "socketFactory"
            p214m2.C4339q.m9706k(r4, r8)
            java.lang.String r8 = "proxyAuthenticator"
            p214m2.C4339q.m9706k(r6, r8)
            java.lang.String r8 = "protocols"
            r9 = r22
            p214m2.C4339q.m9706k(r9, r8)
            java.lang.String r8 = "connectionSpecs"
            r10 = r23
            p214m2.C4339q.m9706k(r10, r8)
            java.lang.String r8 = "proxySelector"
            p214m2.C4339q.m9706k(r7, r8)
            r12.<init>()
            r0.f4127d = r3
            r0.f4128e = r4
            r0.f4129f = r5
            r3 = r18
            r0.f4130g = r3
            r3 = r19
            r0.f4131h = r3
            r0.f4132i = r6
            r3 = 0
            r0.f4133j = r3
            r0.f4134k = r7
            bi.w$a r3 = new bi.w$a
            r3.<init>()
            java.lang.String r4 = "https"
            java.lang.String r6 = "http"
            if (r5 == 0) goto L58
            r5 = r4
            goto L59
        L58:
            r5 = r6
        L59:
            r7 = 1
            boolean r8 = p362uh.C6463i.m13053J(r5, r6, r7)
            if (r8 == 0) goto L62
            r4 = r6
            goto L68
        L62:
            boolean r6 = p362uh.C6463i.m13053J(r5, r4, r7)
            if (r6 == 0) goto Lc4
        L68:
            r3.f4355a = r4
            bi.w$b r4 = bi.C0803w.f4344l
            r5 = 0
            r6 = 0
            r8 = 0
            r11 = 7
            r15 = r4
            r16 = r13
            r17 = r5
            r18 = r6
            r19 = r8
            r20 = r11
            java.lang.String r4 = bi.C0803w.b.m2452d(r15, r16, r17, r18, r19, r20)
            java.lang.String r4 = gh.C2390b.m6135y(r4)
            if (r4 == 0) goto Lb8
            r3.f4358d = r4
            if (r7 <= r2) goto L8a
            goto L90
        L8a:
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r1 < r2) goto L90
            goto L91
        L90:
            r7 = 0
        L91:
            if (r7 == 0) goto La8
            r3.f4359e = r2
            bi.w r1 = r3.m2447a()
            r0.f4124a = r1
            java.util.List r1 = ci.C0988c.m2717v(r22)
            r0.f4125b = r1
            java.util.List r1 = ci.C0988c.m2717v(r23)
            r0.f4126c = r1
            return
        La8:
            java.lang.String r1 = "unexpected port: "
            java.lang.String r1 = android.support.v4.media.C0142a.m254a(r1, r14)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        Lb8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "unexpected host: "
            java.lang.String r1 = p064e.C1493g.m4049a(r3, r13)
            r2.<init>(r1)
            throw r2
        Lc4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "unexpected scheme: "
            java.lang.String r2 = p064e.C1493g.m4049a(r2, r5)
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: a */
    public final boolean m2360a(bi.C0770a r3) {
            r2 = this;
            java.lang.String r0 = "that"
            p214m2.C4339q.m9706k(r3, r0)
            bi.r r0 = r2.f4127d
            bi.r r1 = r3.f4127d
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L6b
            bi.c r0 = r2.f4132i
            bi.c r1 = r3.f4132i
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L6b
            java.util.List<bi.b0> r0 = r2.f4125b
            java.util.List<bi.b0> r1 = r3.f4125b
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L6b
            java.util.List<bi.l> r0 = r2.f4126c
            java.util.List<bi.l> r1 = r3.f4126c
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L6b
            java.net.ProxySelector r0 = r2.f4134k
            java.net.ProxySelector r1 = r3.f4134k
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L6b
            java.net.Proxy r0 = r2.f4133j
            java.net.Proxy r1 = r3.f4133j
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L6b
            javax.net.ssl.SSLSocketFactory r0 = r2.f4129f
            javax.net.ssl.SSLSocketFactory r1 = r3.f4129f
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L6b
            javax.net.ssl.HostnameVerifier r0 = r2.f4130g
            javax.net.ssl.HostnameVerifier r1 = r3.f4130g
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L6b
            bi.h r0 = r2.f4131h
            bi.h r1 = r3.f4131h
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L6b
            bi.w r0 = r2.f4124a
            int r0 = r0.f4350f
            bi.w r3 = r3.f4124a
            int r3 = r3.f4350f
            if (r0 != r3) goto L6b
            r3 = 1
            goto L6c
        L6b:
            r3 = 0
        L6c:
            return r3
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof bi.C0770a
            if (r0 == 0) goto L18
            bi.w r0 = r2.f4124a
            bi.a r3 = (bi.C0770a) r3
            bi.w r1 = r3.f4124a
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L18
            boolean r3 = r2.m2360a(r3)
            if (r3 == 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            return r3
    }

    public int hashCode() {
            r3 = this;
            bi.w r0 = r3.f4124a
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            bi.r r1 = r3.f4127d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            bi.c r0 = r3.f4132i
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<bi.b0> r1 = r3.f4125b
            r2 = 31
            int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
            java.util.List<bi.l> r1 = r3.f4126c
            int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
            java.net.ProxySelector r1 = r3.f4134k
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.Proxy r0 = r3.f4133j
            int r0 = java.util.Objects.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * 31
            javax.net.ssl.SSLSocketFactory r1 = r3.f4129f
            int r1 = java.util.Objects.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            javax.net.ssl.HostnameVerifier r0 = r3.f4130g
            int r0 = java.util.Objects.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * 31
            bi.h r1 = r3.f4131h
            int r1 = java.util.Objects.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Address{"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            bi.w r1 = r3.f4124a
            java.lang.String r1 = r1.f4349e
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            bi.w r1 = r3.f4124a
            int r1 = r1.f4350f
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.net.Proxy r1 = r3.f4133j
            if (r1 == 0) goto L2b
            java.lang.String r1 = "proxy="
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.net.Proxy r2 = r3.f4133j
            goto L33
        L2b:
            java.lang.String r1 = "proxySelector="
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.net.ProxySelector r2 = r3.f4134k
        L33:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
