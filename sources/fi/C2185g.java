package fi;

/* renamed from: fi.g */
/* loaded from: classes.dex */
public final class C2185g extends p154ii.C3179f.c implements bi.InterfaceC0790k {

    /* renamed from: b */
    public java.net.Socket f9967b;

    /* renamed from: c */
    public java.net.Socket f9968c;

    /* renamed from: d */
    public bi.C0801u f9969d;

    /* renamed from: e */
    public bi.EnumC0773b0 f9970e;

    /* renamed from: f */
    public p154ii.C3179f f9971f;

    /* renamed from: g */
    public p260oi.InterfaceC5286h f9972g;

    /* renamed from: h */
    public p260oi.InterfaceC5285g f9973h;

    /* renamed from: i */
    public boolean f9974i;

    /* renamed from: j */
    public boolean f9975j;

    /* renamed from: k */
    public int f9976k;

    /* renamed from: l */
    public int f9977l;

    /* renamed from: m */
    public int f9978m;

    /* renamed from: n */
    public int f9979n;

    /* renamed from: o */
    public final java.util.List<java.lang.ref.Reference<fi.C2181c>> f9980o;

    /* renamed from: p */
    public long f9981p;

    /* renamed from: q */
    public final bi.C0789j0 f9982q;

    public C2185g(fi.C2186h r2, bi.C0789j0 r3) {
            r1 = this;
            java.lang.String r0 = "connectionPool"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r2 = "route"
            p214m2.C4339q.m9706k(r3, r2)
            r1.<init>()
            r1.f9982q = r3
            r2 = 1
            r1.f9979n = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9980o = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1.f9981p = r2
            return
    }

    @Override // p154ii.C3179f.c
    /* renamed from: a */
    public synchronized void mo5762a(p154ii.C3179f r2, p154ii.C3193t r3) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "connection"
            p214m2.C4339q.m9706k(r2, r0)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "settings"
            p214m2.C4339q.m9706k(r3, r2)     // Catch: java.lang.Throwable -> L1e
            int r2 = r3.f12852a     // Catch: java.lang.Throwable -> L1e
            r2 = r2 & 16
            if (r2 == 0) goto L17
            int[] r2 = r3.f12853b     // Catch: java.lang.Throwable -> L1e
            r3 = 4
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L1e
            goto L1a
        L17:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L1a:
            r1.f9979n = r2     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r1)
            return
        L1e:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // p154ii.C3179f.c
    /* renamed from: b */
    public void mo5763b(p154ii.C3188o r3) {
            r2 = this;
            java.lang.String r0 = "stream"
            p214m2.C4339q.m9706k(r3, r0)
            ii.b r0 = p154ii.EnumC3175b.f12677d0
            r1 = 0
            r3.m7655c(r0, r1)
            return
    }

    /* renamed from: c */
    public final void m5764c(int r17, int r18, int r19, int r20, boolean r21, bi.InterfaceC0780f r22, bi.AbstractC0799s r23) {
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r10 = "proxy"
            java.lang.String r11 = "inetSocketAddress"
            java.lang.String r0 = "call"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "eventListener"
            p214m2.C4339q.m9706k(r9, r0)
            bi.b0 r0 = r7.f9970e
            r12 = 1
            if (r0 != 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L156
            bi.j0 r0 = r7.f9982q
            bi.a r0 = r0.f4286a
            java.util.List<bi.l> r0 = r0.f4126c
            o7.f3 r13 = new o7.f3
            r13.<init>(r0)
            bi.j0 r1 = r7.f9982q
            bi.a r1 = r1.f4286a
            javax.net.ssl.SSLSocketFactory r2 = r1.f4129f
            if (r2 != 0) goto L6c
            bi.l r1 = bi.C0792l.f4298f
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L5f
            bi.j0 r0 = r7.f9982q
            bi.a r0 = r0.f4286a
            bi.w r0 = r0.f4124a
            java.lang.String r0 = r0.f4349e
            ji.e$a r1 = p175ji.C3615e.f15897c
            ji.e r1 = p175ji.C3615e.f15895a
            boolean r1 = r1.mo8041h(r0)
            if (r1 == 0) goto L4c
            goto L76
        L4c:
            fi.i r1 = new fi.i
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication to "
            java.lang.String r4 = " not permitted by network security policy"
            java.lang.String r0 = android.support.v4.media.C0145d.m257a(r3, r0, r4)
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L5f:
            fi.i r0 = new fi.i
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L6c:
            java.util.List<bi.b0> r0 = r1.f4125b
            bi.b0 r1 = bi.EnumC0773b0.f4188d0
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L149
        L76:
            r14 = 0
            r15 = r14
        L78:
            bi.j0 r0 = r7.f9982q     // Catch: java.io.IOException -> Ldd
            boolean r0 = r0.m2401a()     // Catch: java.io.IOException -> Ldd
            if (r0 == 0) goto L9e
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.m5767f(r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> Ldd
            java.net.Socket r0 = r7.f9967b     // Catch: java.io.IOException -> Ldd
            if (r0 != 0) goto L94
            goto Lb6
        L94:
            r1 = r17
            r2 = r18
            goto La5
        L99:
            r1 = r17
            r2 = r18
            goto Lda
        L9e:
            r1 = r17
            r2 = r18
            r7.m5766e(r1, r2, r8, r9)     // Catch: java.io.IOException -> Ld9
        La5:
            r3 = r20
            r7.m5768g(r13, r3, r8, r9)     // Catch: java.io.IOException -> Ld7
            bi.j0 r0 = r7.f9982q     // Catch: java.io.IOException -> Ld7
            java.net.InetSocketAddress r4 = r0.f4288c     // Catch: java.io.IOException -> Ld7
            java.net.Proxy r0 = r0.f4287b     // Catch: java.io.IOException -> Ld7
            p214m2.C4339q.m9706k(r4, r11)     // Catch: java.io.IOException -> Ld7
            p214m2.C4339q.m9706k(r0, r10)     // Catch: java.io.IOException -> Ld7
        Lb6:
            bi.j0 r0 = r7.f9982q
            boolean r0 = r0.m2401a()
            if (r0 == 0) goto Ld0
            java.net.Socket r0 = r7.f9967b
            if (r0 == 0) goto Lc3
            goto Ld0
        Lc3:
            fi.i r0 = new fi.i
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        Ld0:
            long r0 = java.lang.System.nanoTime()
            r7.f9981p = r0
            return
        Ld7:
            r0 = move-exception
            goto Ldf
        Ld9:
            r0 = move-exception
        Lda:
            r3 = r20
            goto Ldf
        Ldd:
            r0 = move-exception
            goto L99
        Ldf:
            java.net.Socket r4 = r7.f9968c
            if (r4 == 0) goto Le6
            ci.C0988c.m2699d(r4)
        Le6:
            java.net.Socket r4 = r7.f9967b
            if (r4 == 0) goto Led
            ci.C0988c.m2699d(r4)
        Led:
            r7.f9968c = r14
            r7.f9967b = r14
            r7.f9972g = r14
            r7.f9973h = r14
            r7.f9969d = r14
            r7.f9970e = r14
            r7.f9971f = r14
            r7.f9979n = r12
            bi.j0 r4 = r7.f9982q
            java.net.InetSocketAddress r5 = r4.f4288c
            java.net.Proxy r4 = r4.f4287b
            p214m2.C4339q.m9706k(r5, r11)
            p214m2.C4339q.m9706k(r4, r10)
            if (r15 != 0) goto L111
            fi.i r15 = new fi.i
            r15.<init>(r0)
            goto L118
        L111:
            java.io.IOException r4 = r15.f9990Z
            p185k7.C3836i.m8616a(r4, r0)
            r15.f9989Y = r0
        L118:
            if (r21 == 0) goto L148
            r13.f19673c = r12
            boolean r4 = r13.f19672b
            if (r4 != 0) goto L121
            goto L143
        L121:
            boolean r4 = r0 instanceof java.net.ProtocolException
            if (r4 == 0) goto L126
            goto L143
        L126:
            boolean r4 = r0 instanceof java.io.InterruptedIOException
            if (r4 == 0) goto L12b
            goto L143
        L12b:
            boolean r4 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r4 == 0) goto L138
            java.lang.Throwable r4 = r0.getCause()
            boolean r4 = r4 instanceof java.security.cert.CertificateException
            if (r4 == 0) goto L138
            goto L143
        L138:
            boolean r4 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L13d
            goto L143
        L13d:
            boolean r0 = r0 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L143
            r0 = 1
            goto L144
        L143:
            r0 = 0
        L144:
            if (r0 == 0) goto L148
            goto L78
        L148:
            throw r15
        L149:
            fi.i r0 = new fi.i
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L156:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: d */
    public final void m5765d(bi.C0771a0 r4, bi.C0789j0 r5, java.io.IOException r6) {
            r3 = this;
            java.lang.String r0 = "client"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "failedRoute"
            p214m2.C4339q.m9706k(r5, r0)
            java.net.Proxy r0 = r5.f4287b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
            if (r0 == r1) goto L27
            bi.a r0 = r5.f4286a
            java.net.ProxySelector r1 = r0.f4134k
            bi.w r0 = r0.f4124a
            java.net.URI r0 = r0.m2446h()
            java.net.Proxy r2 = r5.f4287b
            java.net.SocketAddress r2 = r2.address()
            r1.connectFailed(r0, r2, r6)
        L27:
            fb.c r4 = r4.f4162w0
            monitor-enter(r4)
            java.util.Set<fb.d> r6 = r4.f9830a     // Catch: java.lang.Throwable -> L31
            r6.add(r5)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r4)
            return
        L31:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    /* renamed from: e */
    public final void m5766e(int r5, int r6, bi.InterfaceC0780f r7, bi.AbstractC0799s r8) {
            r4 = this;
            bi.j0 r0 = r4.f9982q
            java.net.Proxy r1 = r0.f4287b
            bi.a r0 = r0.f4286a
            java.net.Proxy$Type r2 = r1.type()
            if (r2 != 0) goto Ld
            goto L1b
        Ld:
            int[] r3 = fi.C2182d.f9962a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r3 = 1
            if (r2 == r3) goto L21
            r3 = 2
            if (r2 == r3) goto L21
        L1b:
            java.net.Socket r0 = new java.net.Socket
            r0.<init>(r1)
            goto L2a
        L21:
            javax.net.SocketFactory r0 = r0.f4128e
            java.net.Socket r0 = r0.createSocket()
            p214m2.C4339q.m9704i(r0)
        L2a:
            r4.f9967b = r0
            bi.j0 r2 = r4.f9982q
            java.net.InetSocketAddress r2 = r2.f4288c
            java.util.Objects.requireNonNull(r8)
            java.lang.String r8 = "call"
            p214m2.C4339q.m9706k(r7, r8)
            java.lang.String r7 = "inetSocketAddress"
            p214m2.C4339q.m9706k(r2, r7)
            java.lang.String r7 = "proxy"
            p214m2.C4339q.m9706k(r1, r7)
            r0.setSoTimeout(r6)
            ji.e$a r6 = p175ji.C3615e.f15897c     // Catch: java.net.ConnectException -> L79
            ji.e r6 = p175ji.C3615e.f15895a     // Catch: java.net.ConnectException -> L79
            bi.j0 r7 = r4.f9982q     // Catch: java.net.ConnectException -> L79
            java.net.InetSocketAddress r7 = r7.f4288c     // Catch: java.net.ConnectException -> L79
            r6.mo8043e(r0, r7, r5)     // Catch: java.net.ConnectException -> L79
            oi.z r5 = p101fh.C2174f.m5734x(r0)     // Catch: java.lang.NullPointerException -> L65
            oi.h r5 = p101fh.C2174f.m5716f(r5)     // Catch: java.lang.NullPointerException -> L65
            r4.f9972g = r5     // Catch: java.lang.NullPointerException -> L65
            oi.x r5 = p101fh.C2174f.m5733w(r0)     // Catch: java.lang.NullPointerException -> L65
            oi.g r5 = p101fh.C2174f.m5715e(r5)     // Catch: java.lang.NullPointerException -> L65
            r4.f9973h = r5     // Catch: java.lang.NullPointerException -> L65
            goto L72
        L65:
            r5 = move-exception
            java.lang.String r6 = r5.getMessage()
            java.lang.String r7 = "throw with null exception"
            boolean r6 = p214m2.C4339q.m9702c(r6, r7)
            if (r6 != 0) goto L73
        L72:
            return
        L73:
            java.io.IOException r6 = new java.io.IOException
            r6.<init>(r5)
            throw r6
        L79:
            r5 = move-exception
            java.net.ConnectException r6 = new java.net.ConnectException
            java.lang.String r7 = "Failed to connect to "
            java.lang.StringBuilder r7 = android.support.v4.media.C0144c.m256a(r7)
            bi.j0 r8 = r4.f9982q
            java.net.InetSocketAddress r8 = r8.f4288c
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            r6.initCause(r5)
            throw r6
    }

    /* renamed from: f */
    public final void m5767f(int r20, int r21, int r22, bi.InterfaceC0780f r23, bi.AbstractC0799s r24) {
            r19 = this;
            r0 = r19
            r1 = r21
            bi.c0$a r2 = new bi.c0$a
            r2.<init>()
            bi.j0 r3 = r0.f9982q
            bi.a r3 = r3.f4286a
            bi.w r3 = r3.f4124a
            r2.m2369e(r3)
            java.lang.String r3 = "CONNECT"
            r4 = 0
            r2.m2367c(r3, r4)
            bi.j0 r3 = r0.f9982q
            bi.a r3 = r3.f4286a
            bi.w r3 = r3.f4124a
            r5 = 1
            java.lang.String r3 = ci.C0988c.m2716u(r3, r5)
            java.lang.String r6 = "Host"
            r2.m2366b(r6, r3)
            java.lang.String r3 = "Proxy-Connection"
            java.lang.String r6 = "Keep-Alive"
            r2.m2366b(r3, r6)
            java.lang.String r3 = "User-Agent"
            java.lang.String r6 = "okhttp/4.9.0"
            r2.m2366b(r3, r6)
            bi.c0 r2 = r2.m2365a()
            bi.g0$a r3 = new bi.g0$a
            r3.<init>()
            r3.m2388g(r2)
            bi.b0 r6 = bi.EnumC0773b0.f4185a0
            r3.m2387f(r6)
            r6 = 407(0x197, float:5.7E-43)
            r3.f4240c = r6
            java.lang.String r6 = "Preemptive Authenticate"
            r3.m2386e(r6)
            bi.h0 r6 = ci.C0988c.f5067c
            r3.f4244g = r6
            r6 = -1
            r3.f4248k = r6
            r3.f4249l = r6
            bi.v$a r6 = r3.f4243f
            java.util.Objects.requireNonNull(r6)
            bi.v$b r7 = bi.C0802v.f4340Z
            java.lang.String r8 = "Proxy-Authenticate"
            r7.m2436a(r8)
            java.lang.String r9 = "OkHttp-Preemptive"
            r7.m2437b(r9, r8)
            r6.m2435d(r8)
            r6.m2433b(r8, r9)
            bi.g0 r3 = r3.m2382a()
            bi.j0 r6 = r0.f9982q
            bi.a r7 = r6.f4286a
            bi.c r7 = r7.f4132i
            bi.c0 r3 = r7.mo2362a(r6, r3)
            if (r3 == 0) goto L82
            r2 = r3
        L82:
            bi.w r3 = r2.f4194b
            r6 = 0
        L85:
            r7 = 21
            if (r6 >= r7) goto L196
            r7 = r20
            r8 = r23
            r9 = r24
            r0.m5766e(r7, r1, r8, r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "CONNECT "
            r10.append(r11)
            java.lang.String r5 = ci.C0988c.m2716u(r3, r5)
            r10.append(r5)
            java.lang.String r5 = " HTTP/1.1"
            r10.append(r5)
            java.lang.String r5 = r10.toString()
        Lac:
            oi.h r10 = r0.f9972g
            p214m2.C4339q.m9704i(r10)
            oi.g r11 = r0.f9973h
            p214m2.C4339q.m9704i(r11)
            hi.b r12 = new hi.b
            r12.<init>(r4, r0, r10, r11)
            oi.a0 r4 = r10.mo7463d()
            long r13 = (long) r1
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.mo11530g(r13, r15)
            oi.a0 r4 = r11.mo7464d()
            r13 = r22
            long r7 = (long) r13
            r4.mo11530g(r7, r15)
            bi.v r4 = r2.f4196d
            r12.m7461k(r4, r5)
            oi.g r4 = r12.f12261g
            r4.flush()
            r4 = 0
            bi.g0$a r4 = r12.mo6143g(r4)
            p214m2.C4339q.m9704i(r4)
            r4.m2388g(r2)
            bi.g0 r2 = r4.m2382a()
            long r7 = ci.C0988c.m2705j(r2)
            r16 = -1
            int r4 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r4 != 0) goto Lf3
            goto L102
        Lf3:
            oi.z r4 = r12.m7460j(r7)
            r7 = 2147483647(0x7fffffff, float:NaN)
            ci.C0988c.m2714s(r4, r7, r15)
            hi.b$d r4 = (p135hi.C3050b.d) r4
            r4.close()
        L102:
            int r4 = r2.f4228b0
            r7 = 200(0xc8, float:2.8E-43)
            if (r4 == r7) goto L154
            r7 = 407(0x197, float:5.7E-43)
            if (r4 != r7) goto L13f
            bi.j0 r4 = r0.f9982q
            bi.a r7 = r4.f4286a
            bi.c r7 = r7.f4132i
            bi.c0 r4 = r7.mo2362a(r4, r2)
            if (r4 == 0) goto L137
            r7 = 2
            java.lang.String r8 = "Connection"
            r10 = 0
            java.lang.String r2 = bi.C0783g0.m2380a(r2, r8, r10, r7)
            java.lang.String r7 = "close"
            r8 = 1
            boolean r2 = p362uh.C6463i.m13053J(r7, r2, r8)
            if (r2 == 0) goto L12b
            r2 = r4
            goto L169
        L12b:
            r2 = 0
            r7 = r20
            r8 = r23
            r18 = r4
            r4 = r2
            r2 = r18
            goto Lac
        L137:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Failed to authenticate with proxy"
            r1.<init>(r2)
            throw r1
        L13f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r3 = "Unexpected response code for CONNECT: "
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            int r2 = r2.f4228b0
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L154:
            oi.e r2 = r10.mo11561c()
            boolean r2 = r2.mo11541F()
            if (r2 == 0) goto L18e
            oi.e r2 = r11.mo11561c()
            boolean r2 = r2.mo11541F()
            if (r2 == 0) goto L18e
            r2 = 0
        L169:
            if (r2 == 0) goto L196
            java.net.Socket r4 = r0.f9967b
            if (r4 == 0) goto L172
            ci.C0988c.m2699d(r4)
        L172:
            r4 = 0
            r0.f9967b = r4
            r0.f9973h = r4
            r0.f9972g = r4
            bi.j0 r5 = r0.f9982q
            java.net.InetSocketAddress r7 = r5.f4288c
            java.net.Proxy r5 = r5.f4287b
            java.lang.String r8 = "inetSocketAddress"
            p214m2.C4339q.m9706k(r7, r8)
            java.lang.String r7 = "proxy"
            p214m2.C4339q.m9706k(r5, r7)
            int r6 = r6 + 1
            r5 = 1
            goto L85
        L18e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TLS tunnel buffered too many bytes!"
            r1.<init>(r2)
            throw r1
        L196:
            return
    }

    /* renamed from: g */
    public final void m5768g(p249o7.C4993f3 r12, int r13, bi.InterfaceC0780f r14, bi.AbstractC0799s r15) {
            r11 = this;
            bi.b0 r14 = bi.EnumC0773b0.f4187c0
            bi.b0 r15 = bi.EnumC0773b0.f4188d0
            bi.b0 r0 = bi.EnumC0773b0.f4185a0
            bi.j0 r1 = r11.f9982q
            bi.a r1 = r1.f4286a
            javax.net.ssl.SSLSocketFactory r2 = r1.f4129f
            if (r2 != 0) goto L27
            java.util.List<bi.b0> r12 = r1.f4125b
            boolean r12 = r12.contains(r15)
            if (r12 == 0) goto L20
            java.net.Socket r12 = r11.f9967b
            r11.f9968c = r12
            r11.f9970e = r15
            r11.m5773l(r13)
            return
        L20:
            java.net.Socket r12 = r11.f9967b
            r11.f9968c = r12
            r11.f9970e = r0
            return
        L27:
            r3 = 0
            p214m2.C4339q.m9704i(r2)     // Catch: java.lang.Throwable -> L1d5
            java.net.Socket r4 = r11.f9967b     // Catch: java.lang.Throwable -> L1d5
            bi.w r5 = r1.f4124a     // Catch: java.lang.Throwable -> L1d5
            java.lang.String r6 = r5.f4349e     // Catch: java.lang.Throwable -> L1d5
            int r5 = r5.f4350f     // Catch: java.lang.Throwable -> L1d5
            r7 = 1
            java.net.Socket r2 = r2.createSocket(r4, r6, r5, r7)     // Catch: java.lang.Throwable -> L1d5
            if (r2 == 0) goto L1cd
            javax.net.ssl.SSLSocket r2 = (javax.net.ssl.SSLSocket) r2     // Catch: java.lang.Throwable -> L1d5
            bi.l r12 = r12.m11167a(r2)     // Catch: java.lang.Throwable -> L1ca
            boolean r4 = r12.f4300b     // Catch: java.lang.Throwable -> L1ca
            if (r4 == 0) goto L51
            ji.e$a r4 = p175ji.C3615e.f15897c     // Catch: java.lang.Throwable -> L1ca
            ji.e r4 = p175ji.C3615e.f15895a     // Catch: java.lang.Throwable -> L1ca
            bi.w r5 = r1.f4124a     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r5 = r5.f4349e     // Catch: java.lang.Throwable -> L1ca
            java.util.List<bi.b0> r6 = r1.f4125b     // Catch: java.lang.Throwable -> L1ca
            r4.mo8039d(r2, r5, r6)     // Catch: java.lang.Throwable -> L1ca
        L51:
            r2.startHandshake()     // Catch: java.lang.Throwable -> L1ca
            javax.net.ssl.SSLSession r4 = r2.getSession()     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r5 = "sslSocketSession"
            p214m2.C4339q.m9705j(r4, r5)     // Catch: java.lang.Throwable -> L1ca
            bi.u r5 = bi.C0801u.m2425a(r4)     // Catch: java.lang.Throwable -> L1ca
            javax.net.ssl.HostnameVerifier r6 = r1.f4130g     // Catch: java.lang.Throwable -> L1ca
            p214m2.C4339q.m9704i(r6)     // Catch: java.lang.Throwable -> L1ca
            bi.w r8 = r1.f4124a     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r8 = r8.f4349e     // Catch: java.lang.Throwable -> L1ca
            boolean r4 = r6.verify(r8, r4)     // Catch: java.lang.Throwable -> L1ca
            if (r4 != 0) goto L11b
            java.util.List r12 = r5.m2427c()     // Catch: java.lang.Throwable -> L1ca
            boolean r13 = r12.isEmpty()     // Catch: java.lang.Throwable -> L1ca
            r13 = r13 ^ r7
            if (r13 == 0) goto Lfb
            r13 = 0
            java.lang.Object r12 = r12.get(r13)     // Catch: java.lang.Throwable -> L1ca
            if (r12 == 0) goto Lf3
            java.security.cert.X509Certificate r12 = (java.security.cert.X509Certificate) r12     // Catch: java.lang.Throwable -> L1ca
            javax.net.ssl.SSLPeerUnverifiedException r13 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L1ca
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ca
            r14.<init>()     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r15 = "\n              |Hostname "
            r14.append(r15)     // Catch: java.lang.Throwable -> L1ca
            bi.w r15 = r1.f4124a     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r15 = r15.f4349e     // Catch: java.lang.Throwable -> L1ca
            r14.append(r15)     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r15 = " not verified:\n              |    certificate: "
            r14.append(r15)     // Catch: java.lang.Throwable -> L1ca
            bi.h$a r15 = bi.C0784h.f4252d     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r15 = r15.m2391a(r12)     // Catch: java.lang.Throwable -> L1ca
            r14.append(r15)     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r15 = "\n              |    DN: "
            r14.append(r15)     // Catch: java.lang.Throwable -> L1ca
            java.security.Principal r15 = r12.getSubjectDN()     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r0 = "cert.subjectDN"
            p214m2.C4339q.m9705j(r15, r0)     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r15 = r15.getName()     // Catch: java.lang.Throwable -> L1ca
            r14.append(r15)     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r15 = "\n              |    subjectAltNames: "
            r14.append(r15)     // Catch: java.lang.Throwable -> L1ca
            mi.d r15 = p224mi.C4635d.f18484a     // Catch: java.lang.Throwable -> L1ca
            r0 = 7
            java.util.List r0 = r15.m10452a(r12, r0)     // Catch: java.lang.Throwable -> L1ca
            r1 = 2
            java.util.List r12 = r15.m10452a(r12, r1)     // Catch: java.lang.Throwable -> L1ca
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1ca
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L1ca
            int r4 = r12.size()     // Catch: java.lang.Throwable -> L1ca
            int r4 = r4 + r1
            r15.<init>(r4)     // Catch: java.lang.Throwable -> L1ca
            r15.addAll(r0)     // Catch: java.lang.Throwable -> L1ca
            r15.addAll(r12)     // Catch: java.lang.Throwable -> L1ca
            r14.append(r15)     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r12 = "\n              "
            r14.append(r12)     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r12 = r14.toString()     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r12 = p362uh.C6459e.m13047D(r12, r3, r7)     // Catch: java.lang.Throwable -> L1ca
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L1ca
            throw r13     // Catch: java.lang.Throwable -> L1ca
        Lf3:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r13 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L1ca
            throw r12     // Catch: java.lang.Throwable -> L1ca
        Lfb:
            javax.net.ssl.SSLPeerUnverifiedException r12 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L1ca
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ca
            r13.<init>()     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r14 = "Hostname "
            r13.append(r14)     // Catch: java.lang.Throwable -> L1ca
            bi.w r14 = r1.f4124a     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r14 = r14.f4349e     // Catch: java.lang.Throwable -> L1ca
            r13.append(r14)     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r14 = " not verified (no certificates)"
            r13.append(r14)     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L1ca
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L1ca
            throw r12     // Catch: java.lang.Throwable -> L1ca
        L11b:
            bi.h r4 = r1.f4131h     // Catch: java.lang.Throwable -> L1ca
            p214m2.C4339q.m9704i(r4)     // Catch: java.lang.Throwable -> L1ca
            bi.u r6 = new bi.u     // Catch: java.lang.Throwable -> L1ca
            bi.k0 r7 = r5.f4335b     // Catch: java.lang.Throwable -> L1ca
            bi.j r8 = r5.f4336c     // Catch: java.lang.Throwable -> L1ca
            java.util.List<java.security.cert.Certificate> r9 = r5.f4337d     // Catch: java.lang.Throwable -> L1ca
            fi.e r10 = new fi.e     // Catch: java.lang.Throwable -> L1ca
            r10.<init>(r4, r5, r1)     // Catch: java.lang.Throwable -> L1ca
            r6.<init>(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1ca
            r11.f9969d = r6     // Catch: java.lang.Throwable -> L1ca
            bi.w r1 = r1.f4124a     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r1 = r1.f4349e     // Catch: java.lang.Throwable -> L1ca
            fi.f r5 = new fi.f     // Catch: java.lang.Throwable -> L1ca
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L1ca
            r4.m2389a(r1, r5)     // Catch: java.lang.Throwable -> L1ca
            boolean r12 = r12.f4300b     // Catch: java.lang.Throwable -> L1ca
            if (r12 == 0) goto L14a
            ji.e$a r12 = p175ji.C3615e.f15897c     // Catch: java.lang.Throwable -> L1ca
            ji.e r12 = p175ji.C3615e.f15895a     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r3 = r12.mo8040f(r2)     // Catch: java.lang.Throwable -> L1ca
        L14a:
            r11.f9968c = r2     // Catch: java.lang.Throwable -> L1ca
            oi.z r12 = p101fh.C2174f.m5734x(r2)     // Catch: java.lang.Throwable -> L1ca
            oi.t r1 = new oi.t     // Catch: java.lang.Throwable -> L1ca
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L1ca
            r11.f9972g = r1     // Catch: java.lang.Throwable -> L1ca
            oi.x r12 = p101fh.C2174f.m5733w(r2)     // Catch: java.lang.Throwable -> L1ca
            oi.g r12 = p101fh.C2174f.m5715e(r12)     // Catch: java.lang.Throwable -> L1ca
            r11.f9973h = r12     // Catch: java.lang.Throwable -> L1ca
            if (r3 == 0) goto L1b9
            bi.b0 r12 = bi.EnumC0773b0.f4184Z     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r1 = "http/1.0"
            boolean r1 = p214m2.C4339q.m9702c(r3, r1)     // Catch: java.lang.Throwable -> L1ca
            if (r1 == 0) goto L16f
            r15 = r12
            goto L1a0
        L16f:
            java.lang.String r12 = "http/1.1"
            boolean r12 = p214m2.C4339q.m9702c(r3, r12)     // Catch: java.lang.Throwable -> L1ca
            if (r12 == 0) goto L178
            goto L1b9
        L178:
            java.lang.String r12 = "h2_prior_knowledge"
            boolean r12 = p214m2.C4339q.m9702c(r3, r12)     // Catch: java.lang.Throwable -> L1ca
            if (r12 == 0) goto L181
            goto L1a0
        L181:
            java.lang.String r12 = "h2"
            boolean r12 = p214m2.C4339q.m9702c(r3, r12)     // Catch: java.lang.Throwable -> L1ca
            if (r12 == 0) goto L18b
            r15 = r14
            goto L1a0
        L18b:
            bi.b0 r15 = bi.EnumC0773b0.f4186b0     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r12 = "spdy/3.1"
            boolean r12 = p214m2.C4339q.m9702c(r3, r12)     // Catch: java.lang.Throwable -> L1ca
            if (r12 == 0) goto L196
            goto L1a0
        L196:
            bi.b0 r15 = bi.EnumC0773b0.f4189e0     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r12 = "quic"
            boolean r12 = p214m2.C4339q.m9702c(r3, r12)     // Catch: java.lang.Throwable -> L1ca
            if (r12 == 0) goto L1a2
        L1a0:
            r0 = r15
            goto L1b9
        L1a2:
            java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> L1ca
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ca
            r13.<init>()     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r14 = "Unexpected protocol: "
            r13.append(r14)     // Catch: java.lang.Throwable -> L1ca
            r13.append(r3)     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L1ca
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L1ca
            throw r12     // Catch: java.lang.Throwable -> L1ca
        L1b9:
            r11.f9970e = r0     // Catch: java.lang.Throwable -> L1ca
            ji.e$a r12 = p175ji.C3615e.f15897c
            ji.e r12 = p175ji.C3615e.f15895a
            r12.mo8047a(r2)
            bi.b0 r12 = r11.f9970e
            if (r12 != r14) goto L1c9
            r11.m5773l(r13)
        L1c9:
            return
        L1ca:
            r12 = move-exception
            r3 = r2
            goto L1d6
        L1cd:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1d5
            java.lang.String r13 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L1d5
            throw r12     // Catch: java.lang.Throwable -> L1d5
        L1d5:
            r12 = move-exception
        L1d6:
            if (r3 == 0) goto L1df
            ji.e$a r13 = p175ji.C3615e.f15897c
            ji.e r13 = p175ji.C3615e.f15895a
            r13.mo8047a(r3)
        L1df:
            if (r3 == 0) goto L1e4
            ci.C0988c.m2699d(r3)
        L1e4:
            throw r12
    }

    /* renamed from: h */
    public final boolean m5769h(bi.C0770a r7, java.util.List<bi.C0789j0> r8) {
            r6 = this;
            byte[] r0 = ci.C0988c.f5065a
            java.util.List<java.lang.ref.Reference<fi.c>> r0 = r6.f9980o
            int r0 = r0.size()
            int r1 = r6.f9979n
            r2 = 0
            if (r0 >= r1) goto Lf7
            boolean r0 = r6.f9974i
            if (r0 == 0) goto L13
            goto Lf7
        L13:
            bi.j0 r0 = r6.f9982q
            bi.a r0 = r0.f4286a
            boolean r0 = r0.m2360a(r7)
            if (r0 != 0) goto L1e
            return r2
        L1e:
            bi.w r0 = r7.f4124a
            java.lang.String r0 = r0.f4349e
            bi.j0 r1 = r6.f9982q
            bi.a r1 = r1.f4286a
            bi.w r1 = r1.f4124a
            java.lang.String r1 = r1.f4349e
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            r1 = 1
            if (r0 == 0) goto L32
            return r1
        L32:
            ii.f r0 = r6.f9971f
            if (r0 != 0) goto L37
            return r2
        L37:
            if (r8 == 0) goto Lf7
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L40
            goto L79
        L40:
            java.util.Iterator r8 = r8.iterator()
        L44:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r8.next()
            bi.j0 r0 = (bi.C0789j0) r0
            java.net.Proxy r3 = r0.f4287b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L74
            bi.j0 r3 = r6.f9982q
            java.net.Proxy r3 = r3.f4287b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L74
            bi.j0 r3 = r6.f9982q
            java.net.InetSocketAddress r3 = r3.f4288c
            java.net.InetSocketAddress r0 = r0.f4288c
            boolean r0 = p214m2.C4339q.m9702c(r3, r0)
            if (r0 == 0) goto L74
            r0 = 1
            goto L75
        L74:
            r0 = 0
        L75:
            if (r0 == 0) goto L44
            r8 = 1
            goto L7a
        L79:
            r8 = 0
        L7a:
            if (r8 != 0) goto L7e
            goto Lf7
        L7e:
            javax.net.ssl.HostnameVerifier r8 = r7.f4130g
            mi.d r0 = p224mi.C4635d.f18484a
            if (r8 == r0) goto L85
            return r2
        L85:
            bi.w r8 = r7.f4124a
            byte[] r3 = ci.C0988c.f5065a
            bi.j0 r3 = r6.f9982q
            bi.a r3 = r3.f4286a
            bi.w r3 = r3.f4124a
            int r4 = r8.f4350f
            int r5 = r3.f4350f
            if (r4 == r5) goto L96
            goto Lce
        L96:
            java.lang.String r4 = r8.f4349e
            java.lang.String r3 = r3.f4349e
            boolean r3 = p214m2.C4339q.m9702c(r4, r3)
            if (r3 == 0) goto La1
            goto Lcc
        La1:
            boolean r3 = r6.f9975j
            if (r3 != 0) goto Lce
            bi.u r3 = r6.f9969d
            if (r3 == 0) goto Lce
            java.util.List r3 = r3.m2427c()
            boolean r4 = r3.isEmpty()
            r4 = r4 ^ r1
            if (r4 == 0) goto Lc9
            java.lang.String r8 = r8.f4349e
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r4 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            java.util.Objects.requireNonNull(r3, r4)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            boolean r8 = r0.m10453b(r8, r3)
            if (r8 == 0) goto Lc9
            r8 = 1
            goto Lca
        Lc9:
            r8 = 0
        Lca:
            if (r8 == 0) goto Lce
        Lcc:
            r8 = 1
            goto Lcf
        Lce:
            r8 = 0
        Lcf:
            if (r8 != 0) goto Ld2
            return r2
        Ld2:
            bi.h r8 = r7.f4131h     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lf7
            p214m2.C4339q.m9704i(r8)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lf7
            bi.w r7 = r7.f4124a     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lf7
            java.lang.String r7 = r7.f4349e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lf7
            bi.u r0 = r6.f9969d     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lf7
            p214m2.C4339q.m9704i(r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lf7
            java.util.List r0 = r0.m2427c()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lf7
            java.lang.String r3 = "hostname"
            p214m2.C4339q.m9706k(r7, r3)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lf7
            java.lang.String r3 = "peerCertificates"
            p214m2.C4339q.m9706k(r0, r3)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lf7
            bi.i r3 = new bi.i     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lf7
            r3.<init>(r8, r0, r7)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lf7
            r8.m2389a(r7, r3)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lf7
            return r1
        Lf7:
            return r2
    }

    /* renamed from: i */
    public final boolean m5770i() {
            r1 = this;
            ii.f r0 = r1.f9971f
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: j */
    public final gi.InterfaceC2394d m5771j(bi.C0771a0 r7, gi.C2397g r8) {
            r6 = this;
            java.net.Socket r0 = r6.f9968c
            p214m2.C4339q.m9704i(r0)
            oi.h r1 = r6.f9972g
            p214m2.C4339q.m9704i(r1)
            oi.g r2 = r6.f9973h
            p214m2.C4339q.m9704i(r2)
            ii.f r3 = r6.f9971f
            if (r3 == 0) goto L19
            ii.m r0 = new ii.m
            r0.<init>(r7, r6, r8, r3)
            goto L39
        L19:
            int r3 = r8.f10788h
            r0.setSoTimeout(r3)
            oi.a0 r0 = r1.mo7463d()
            int r3 = r8.f10788h
            long r3 = (long) r3
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.mo11530g(r3, r5)
            oi.a0 r0 = r2.mo7464d()
            int r8 = r8.f10789i
            long r3 = (long) r8
            r0.mo11530g(r3, r5)
            hi.b r0 = new hi.b
            r0.<init>(r7, r6, r1, r2)
        L39:
            return r0
    }

    /* renamed from: k */
    public final synchronized void m5772k() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.f9974i = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* renamed from: l */
    public final void m5773l(int r11) {
            r10 = this;
            java.net.Socket r0 = r10.f9968c
            p214m2.C4339q.m9704i(r0)
            oi.h r1 = r10.f9972g
            p214m2.C4339q.m9704i(r1)
            oi.g r2 = r10.f9973h
            p214m2.C4339q.m9704i(r2)
            r3 = 0
            r0.setSoTimeout(r3)
            ii.f$b r4 = new ii.f$b
            ei.e r5 = p080ei.C1857e.f8048h
            r6 = 1
            r4.<init>(r6, r5)
            bi.j0 r7 = r10.f9982q
            bi.a r7 = r7.f4286a
            bi.w r7 = r7.f4124a
            java.lang.String r7 = r7.f4349e
            java.lang.String r8 = "peerName"
            p214m2.C4339q.m9706k(r7, r8)
            r4.f12747a = r0
            boolean r0 = r4.f12754h
            if (r0 == 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = ci.C0988c.f5071g
            r0.append(r8)
            r8 = 32
            r0.append(r8)
            goto L44
        L3e:
            java.lang.String r0 = "MockWebServer "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
        L44:
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r4.f12748b = r0
            r4.f12749c = r1
            r4.f12750d = r2
            r4.f12751e = r10
            r4.f12753g = r11
            ii.f r11 = new ii.f
            r11.<init>(r4)
            r10.f9971f = r11
            ii.f r0 = p154ii.C3179f.f12716B0
            ii.t r0 = p154ii.C3179f.f12715A0
            int r1 = r0.f12852a
            r1 = r1 & 16
            r2 = 4
            if (r1 == 0) goto L6c
            int[] r0 = r0.f12853b
            r0 = r0[r2]
            goto L6f
        L6c:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L6f:
            r10.f9979n = r0
            ii.p r0 = r11.f12742x0
            monitor-enter(r0)
            boolean r1 = r0.f12840a0     // Catch: java.lang.Throwable -> L13c
            if (r1 != 0) goto L134
            boolean r1 = r0.f12843d0     // Catch: java.lang.Throwable -> L13c
            if (r1 != 0) goto L7d
            goto Lb3
        L7d:
            java.util.logging.Logger r1 = p154ii.C3189p.f12837e0     // Catch: java.lang.Throwable -> L13c
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L13c
            boolean r4 = r1.isLoggable(r4)     // Catch: java.lang.Throwable -> L13c
            if (r4 == 0) goto La7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13c
            r4.<init>()     // Catch: java.lang.Throwable -> L13c
            java.lang.String r7 = ">> CONNECTION "
            r4.append(r7)     // Catch: java.lang.Throwable -> L13c
            oi.i r7 = p154ii.C3178e.f12710a     // Catch: java.lang.Throwable -> L13c
            java.lang.String r7 = r7.mo11586k()     // Catch: java.lang.Throwable -> L13c
            r4.append(r7)     // Catch: java.lang.Throwable -> L13c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L13c
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L13c
            java.lang.String r4 = ci.C0988c.m2703h(r4, r7)     // Catch: java.lang.Throwable -> L13c
            r1.fine(r4)     // Catch: java.lang.Throwable -> L13c
        La7:
            oi.g r1 = r0.f12842c0     // Catch: java.lang.Throwable -> L13c
            oi.i r4 = p154ii.C3178e.f12710a     // Catch: java.lang.Throwable -> L13c
            r1.mo11546I(r4)     // Catch: java.lang.Throwable -> L13c
            oi.g r1 = r0.f12842c0     // Catch: java.lang.Throwable -> L13c
            r1.flush()     // Catch: java.lang.Throwable -> L13c
        Lb3:
            monitor-exit(r0)
            ii.p r0 = r11.f12742x0
            ii.t r1 = r11.f12735q0
            monitor-enter(r0)
            java.lang.String r4 = "settings"
            p214m2.C4339q.m9706k(r1, r4)     // Catch: java.lang.Throwable -> L131
            boolean r4 = r0.f12840a0     // Catch: java.lang.Throwable -> L131
            if (r4 != 0) goto L129
            int r4 = r1.f12852a     // Catch: java.lang.Throwable -> L131
            int r4 = java.lang.Integer.bitCount(r4)     // Catch: java.lang.Throwable -> L131
            int r4 = r4 * 6
            r0.m7675i(r3, r4, r2, r3)     // Catch: java.lang.Throwable -> L131
            r4 = 10
            r7 = 0
        Ld0:
            if (r7 >= r4) goto Lfa
            int r8 = r6 << r7
            int r9 = r1.f12852a     // Catch: java.lang.Throwable -> L131
            r8 = r8 & r9
            if (r8 == 0) goto Ldb
            r8 = 1
            goto Ldc
        Ldb:
            r8 = 0
        Ldc:
            if (r8 != 0) goto Ldf
            goto Lf7
        Ldf:
            if (r7 == r2) goto Le8
            r8 = 7
            if (r7 == r8) goto Le6
            r8 = r7
            goto Le9
        Le6:
            r8 = 4
            goto Le9
        Le8:
            r8 = 3
        Le9:
            oi.g r9 = r0.f12842c0     // Catch: java.lang.Throwable -> L131
            r9.mo11576v(r8)     // Catch: java.lang.Throwable -> L131
            oi.g r8 = r0.f12842c0     // Catch: java.lang.Throwable -> L131
            int[] r9 = r1.f12853b     // Catch: java.lang.Throwable -> L131
            r9 = r9[r7]     // Catch: java.lang.Throwable -> L131
            r8.mo11581z(r9)     // Catch: java.lang.Throwable -> L131
        Lf7:
            int r7 = r7 + 1
            goto Ld0
        Lfa:
            oi.g r1 = r0.f12842c0     // Catch: java.lang.Throwable -> L131
            r1.flush()     // Catch: java.lang.Throwable -> L131
            monitor-exit(r0)
            ii.t r0 = r11.f12735q0
            int r0 = r0.m7683a()
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 == r1) goto L112
            ii.p r2 = r11.f12742x0
            int r0 = r0 - r1
            long r0 = (long) r0
            r2.m7671Q(r3, r0)
        L112:
            ei.d r0 = r5.m4624f()
            java.lang.String r5 = r11.f12720b0
            ii.f$d r2 = r11.f12743y0
            r7 = 0
            r6 = 1
            ei.c r11 = new ei.c
            r1 = r11
            r3 = r5
            r4 = r6
            r1.<init>(r2, r3, r4, r5, r6)
            r0.m4616c(r11, r7)
            return
        L129:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L131
            java.lang.String r1 = "closed"
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L131
            throw r11     // Catch: java.lang.Throwable -> L131
        L131:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        L134:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L13c
            java.lang.String r1 = "closed"
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L13c
            throw r11     // Catch: java.lang.Throwable -> L13c
        L13c:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Connection{"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            bi.j0 r1 = r2.f9982q
            bi.a r1 = r1.f4286a
            bi.w r1 = r1.f4124a
            java.lang.String r1 = r1.f4349e
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            bi.j0 r1 = r2.f9982q
            bi.a r1 = r1.f4286a
            bi.w r1 = r1.f4124a
            int r1 = r1.f4350f
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            java.lang.String r1 = " proxy="
            r0.append(r1)
            bi.j0 r1 = r2.f9982q
            java.net.Proxy r1 = r1.f4287b
            r0.append(r1)
            java.lang.String r1 = " hostAddress="
            r0.append(r1)
            bi.j0 r1 = r2.f9982q
            java.net.InetSocketAddress r1 = r1.f4288c
            r0.append(r1)
            java.lang.String r1 = " cipherSuite="
            r0.append(r1)
            bi.u r1 = r2.f9969d
            if (r1 == 0) goto L4c
            bi.j r1 = r1.f4336c
            if (r1 == 0) goto L4c
            goto L4e
        L4c:
            java.lang.String r1 = "none"
        L4e:
            r0.append(r1)
            java.lang.String r1 = " protocol="
            r0.append(r1)
            bi.b0 r1 = r2.f9970e
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
