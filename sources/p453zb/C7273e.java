package p453zb;

/* renamed from: zb.e */
/* loaded from: classes.dex */
public final class C7273e {

    /* renamed from: a */
    public java.lang.Object f27914a;

    /* renamed from: b */
    public int f27915b;

    /* renamed from: c */
    public java.lang.Object f27916c;

    /* renamed from: d */
    public final java.util.List<byte[]> f27917d;

    /* renamed from: e */
    public java.lang.Object f27918e;

    /* renamed from: f */
    public java.lang.Object f27919f;

    /* renamed from: g */
    public java.lang.Object f27920g;

    /* renamed from: h */
    public java.lang.Object f27921h;

    /* renamed from: i */
    public int f27922i;

    /* renamed from: j */
    public int f27923j;

    public C7273e(fi.C2186h r2, bi.C0770a r3, fi.C2181c r4, bi.AbstractC0799s r5) {
            r1 = this;
            java.lang.String r0 = "connectionPool"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eventListener"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.f27917d = r2
            r1.f27919f = r3
            r1.f27920g = r4
            r1.f27921h = r5
            return
    }

    public C7273e(byte[] r8, java.lang.String r9, java.util.List r10, java.lang.String r11) {
            r7 = this;
            r5 = -1
            r6 = -1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public C7273e(byte[] r1, java.lang.String r2, java.util.List r3, java.lang.String r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.f27914a = r1
            if (r1 != 0) goto L9
            r1 = 0
            goto Lc
        L9:
            int r1 = r1.length
            int r1 = r1 * 8
        Lc:
            r0.f27915b = r1
            r0.f27916c = r2
            r0.f27917d = r3
            r0.f27918e = r4
            r0.f27922i = r6
            r0.f27923j = r5
            return
    }

    /* renamed from: a */
    public fi.C2185g m14381a(int r16, int r17, int r18, int r19, boolean r20) {
            r15 = this;
            r1 = r15
            java.lang.Object r0 = r1.f27920g
            fi.c r0 = (fi.C2181c) r0
            boolean r0 = r0.f9951k0
            if (r0 != 0) goto L34b
            java.lang.Object r0 = r1.f27920g
            fi.c r0 = (fi.C2181c) r0
            fi.g r2 = r0.f9945e0
            r3 = 0
            r0 = 0
            r4 = 1
            if (r2 == 0) goto L64
            monitor-enter(r2)
            boolean r5 = r2.f9974i     // Catch: java.lang.Throwable -> L61
            if (r5 != 0) goto L28
            bi.j0 r5 = r2.f9982q     // Catch: java.lang.Throwable -> L61
            bi.a r5 = r5.f4286a     // Catch: java.lang.Throwable -> L61
            bi.w r5 = r5.f4124a     // Catch: java.lang.Throwable -> L61
            boolean r5 = r15.m14384d(r5)     // Catch: java.lang.Throwable -> L61
            if (r5 != 0) goto L26
            goto L28
        L26:
            r5 = r3
            goto L30
        L28:
            java.lang.Object r5 = r1.f27920g     // Catch: java.lang.Throwable -> L61
            fi.c r5 = (fi.C2181c) r5     // Catch: java.lang.Throwable -> L61
            java.net.Socket r5 = r5.m5759k()     // Catch: java.lang.Throwable -> L61
        L30:
            monitor-exit(r2)
            java.lang.Object r6 = r1.f27920g
            fi.c r6 = (fi.C2181c) r6
            fi.g r6 = r6.f9945e0
            if (r6 == 0) goto L4b
            if (r5 != 0) goto L3c
            r0 = 1
        L3c:
            if (r0 == 0) goto L3f
            return r2
        L3f:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L4b:
            if (r5 == 0) goto L50
            ci.C0988c.m2699d(r5)
        L50:
            java.lang.Object r2 = r1.f27921h
            bi.s r2 = (bi.AbstractC0799s) r2
            java.lang.Object r5 = r1.f27920g
            fi.c r5 = (fi.C2181c) r5
            java.util.Objects.requireNonNull(r2)
            java.lang.String r2 = "call"
            p214m2.C4339q.m9706k(r5, r2)
            goto L64
        L61:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L64:
            r1.f27915b = r0
            r1.f27922i = r0
            r1.f27923j = r0
            java.util.List<byte[]> r2 = r1.f27917d
            fi.h r2 = (fi.C2186h) r2
            java.lang.Object r5 = r1.f27919f
            bi.a r5 = (bi.C0770a) r5
            java.lang.Object r6 = r1.f27920g
            fi.c r6 = (fi.C2181c) r6
            boolean r2 = r2.m5774a(r5, r6, r3, r0)
            if (r2 == 0) goto L7e
            goto L277
        L7e:
            java.lang.Object r2 = r1.f27918e
            bi.j0 r2 = (bi.C0789j0) r2
            if (r2 == 0) goto L8a
            p214m2.C4339q.m9704i(r2)
            r1.f27918e = r3
            goto La4
        L8a:
            java.lang.Object r2 = r1.f27914a
            fi.j$a r2 = (fi.C2188j.a) r2
            if (r2 == 0) goto La7
            p214m2.C4339q.m9704i(r2)
            boolean r2 = r2.m5778a()
            if (r2 == 0) goto La7
            java.lang.Object r0 = r1.f27914a
            fi.j$a r0 = (fi.C2188j.a) r0
            p214m2.C4339q.m9704i(r0)
            bi.j0 r2 = r0.m5779b()
        La4:
            r5 = r3
            goto L285
        La7:
            java.lang.Object r2 = r1.f27916c
            fi.j r2 = (fi.C2188j) r2
            if (r2 != 0) goto Lc4
            fi.j r2 = new fi.j
            java.lang.Object r5 = r1.f27919f
            bi.a r5 = (bi.C0770a) r5
            java.lang.Object r6 = r1.f27920g
            fi.c r6 = (fi.C2181c) r6
            bi.a0 r7 = r6.f9954n0
            fb.c r7 = r7.f4162w0
            java.lang.Object r8 = r1.f27921h
            bi.s r8 = (bi.AbstractC0799s) r8
            r2.<init>(r5, r7, r6, r8)
            r1.f27916c = r2
        Lc4:
            boolean r5 = r2.m5776a()
            if (r5 == 0) goto L345
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        Lcf:
            boolean r6 = r2.m5777b()
            if (r6 == 0) goto L244
            boolean r6 = r2.m5777b()
            java.lang.String r7 = "No route to "
            if (r6 == 0) goto L223
            java.util.List<? extends java.net.Proxy> r6 = r2.f9991a
            int r8 = r2.f9992b
            int r9 = r8 + 1
            r2.f9992b = r9
            java.lang.Object r6 = r6.get(r8)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r2.f9993c = r8
            java.net.Proxy$Type r9 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.DIRECT
            if (r9 == r10) goto L148
            java.net.Proxy$Type r9 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.SOCKS
            if (r9 != r10) goto L103
            goto L148
        L103:
            java.net.SocketAddress r9 = r6.address()
            boolean r10 = r9 instanceof java.net.InetSocketAddress
            if (r10 == 0) goto L12d
            java.net.InetSocketAddress r9 = (java.net.InetSocketAddress) r9
            java.lang.String r10 = "$this$socketHost"
            p214m2.C4339q.m9706k(r9, r10)
            java.net.InetAddress r10 = r9.getAddress()
            if (r10 == 0) goto L11f
            java.lang.String r10 = r10.getHostAddress()
            java.lang.String r11 = "address.hostAddress"
            goto L125
        L11f:
            java.lang.String r10 = r9.getHostName()
            java.lang.String r11 = "hostName"
        L125:
            p214m2.C4339q.m9705j(r10, r11)
            int r9 = r9.getPort()
            goto L150
        L12d:
            java.lang.String r0 = "Proxy.address() is not an InetSocketAddress: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Class r2 = r9.getClass()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L148:
            bi.a r9 = r2.f9995e
            bi.w r9 = r9.f4124a
            java.lang.String r10 = r9.f4349e
            int r9 = r9.f4350f
        L150:
            r11 = 65535(0xffff, float:9.1834E-41)
            if (r4 > r9) goto L201
            if (r11 < r9) goto L201
            java.net.Proxy$Type r7 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.SOCKS
            if (r7 != r11) goto L167
            java.net.InetSocketAddress r7 = java.net.InetSocketAddress.createUnresolved(r10, r9)
            r8.add(r7)
            goto L1a9
        L167:
            bi.s r7 = r2.f9998h
            bi.f r11 = r2.f9997g
            java.util.Objects.requireNonNull(r7)
            java.lang.String r7 = "call"
            p214m2.C4339q.m9706k(r11, r7)
            java.lang.String r11 = "domainName"
            p214m2.C4339q.m9706k(r10, r11)
            bi.a r11 = r2.f9995e
            bi.r r11 = r11.f4127d
            java.util.List r11 = r11.mo2420a(r10)
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L1e3
            bi.s r10 = r2.f9998h
            bi.f r12 = r2.f9997g
            java.util.Objects.requireNonNull(r10)
            p214m2.C4339q.m9706k(r12, r7)
            java.util.Iterator r7 = r11.iterator()
        L194:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L1a9
            java.lang.Object r10 = r7.next()
            java.net.InetAddress r10 = (java.net.InetAddress) r10
            java.net.InetSocketAddress r11 = new java.net.InetSocketAddress
            r11.<init>(r10, r9)
            r8.add(r11)
            goto L194
        L1a9:
            java.util.List<? extends java.net.InetSocketAddress> r7 = r2.f9993c
            java.util.Iterator r7 = r7.iterator()
        L1af:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L1db
            java.lang.Object r8 = r7.next()
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8
            bi.j0 r9 = new bi.j0
            bi.a r10 = r2.f9995e
            r9.<init>(r10, r6, r8)
            fb.c r8 = r2.f9996f
            monitor-enter(r8)
            java.util.Set<fb.d> r10 = r8.f9830a     // Catch: java.lang.Throwable -> L1d8
            boolean r10 = r10.contains(r9)     // Catch: java.lang.Throwable -> L1d8
            monitor-exit(r8)
            if (r10 == 0) goto L1d4
            java.util.List<bi.j0> r8 = r2.f9994d
            r8.add(r9)
            goto L1af
        L1d4:
            r5.add(r9)
            goto L1af
        L1d8:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L1db:
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r4
            if (r6 == 0) goto Lcf
            goto L244
        L1e3:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            bi.a r2 = r2.f9995e
            bi.r r2 = r2.f4127d
            r3.append(r2)
            java.lang.String r2 = " returned no addresses for "
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L201:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r10)
            r3 = 58
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = "; port is out of range"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L223:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r7)
            bi.a r4 = r2.f9995e
            bi.w r4 = r4.f4124a
            java.lang.String r4 = r4.f4349e
            r3.append(r4)
            java.lang.String r4 = "; exhausted proxy configurations: "
            r3.append(r4)
            java.util.List<? extends java.net.Proxy> r2 = r2.f9991a
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L244:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L254
            java.util.List<bi.j0> r6 = r2.f9994d
            p062dh.C1471g.m3994F(r5, r6)
            java.util.List<bi.j0> r2 = r2.f9994d
            r2.clear()
        L254:
            fi.j$a r2 = new fi.j$a
            r2.<init>(r5)
            r1.f27914a = r2
            java.util.List<bi.j0> r5 = r2.f10000b
            java.lang.Object r6 = r1.f27920g
            fi.c r6 = (fi.C2181c) r6
            boolean r6 = r6.f9951k0
            if (r6 != 0) goto L33d
            java.util.List<byte[]> r6 = r1.f27917d
            fi.h r6 = (fi.C2186h) r6
            java.lang.Object r7 = r1.f27919f
            bi.a r7 = (bi.C0770a) r7
            java.lang.Object r8 = r1.f27920g
            fi.c r8 = (fi.C2181c) r8
            boolean r0 = r6.m5774a(r7, r8, r5, r0)
            if (r0 == 0) goto L281
        L277:
            java.lang.Object r0 = r1.f27920g
            fi.c r0 = (fi.C2181c) r0
            fi.g r0 = r0.f9945e0
            p214m2.C4339q.m9704i(r0)
            goto L2ed
        L281:
            bi.j0 r2 = r2.m5779b()
        L285:
            fi.g r14 = new fi.g
            java.util.List<byte[]> r0 = r1.f27917d
            fi.h r0 = (fi.C2186h) r0
            r14.<init>(r0, r2)
            java.lang.Object r0 = r1.f27920g
            fi.c r0 = (fi.C2181c) r0
            r0.f9953m0 = r14
            java.lang.Object r0 = r1.f27920g     // Catch: java.lang.Throwable -> L335
            r12 = r0
            fi.c r12 = (fi.C2181c) r12     // Catch: java.lang.Throwable -> L335
            java.lang.Object r0 = r1.f27921h     // Catch: java.lang.Throwable -> L335
            r13 = r0
            bi.s r13 = (bi.AbstractC0799s) r13     // Catch: java.lang.Throwable -> L335
            r6 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r6.m5764c(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L335
            java.lang.Object r0 = r1.f27920g
            fi.c r0 = (fi.C2181c) r0
            r0.f9953m0 = r3
            java.lang.Object r0 = r1.f27920g
            fi.c r0 = (fi.C2181c) r0
            bi.a0 r0 = r0.f9954n0
            fb.c r3 = r0.f4162w0
            bi.j0 r0 = r14.f9982q
            monitor-enter(r3)
            java.lang.String r6 = "route"
            p214m2.C4339q.m9706k(r0, r6)     // Catch: java.lang.Throwable -> L332
            java.util.Set<fb.d> r6 = r3.f9830a     // Catch: java.lang.Throwable -> L332
            r6.remove(r0)     // Catch: java.lang.Throwable -> L332
            monitor-exit(r3)
            java.util.List<byte[]> r0 = r1.f27917d
            fi.h r0 = (fi.C2186h) r0
            java.lang.Object r3 = r1.f27919f
            bi.a r3 = (bi.C0770a) r3
            java.lang.Object r6 = r1.f27920g
            fi.c r6 = (fi.C2181c) r6
            boolean r0 = r0.m5774a(r3, r6, r5, r4)
            if (r0 == 0) goto L2fe
            java.lang.Object r0 = r1.f27920g
            fi.c r0 = (fi.C2181c) r0
            fi.g r0 = r0.f9945e0
            p214m2.C4339q.m9704i(r0)
            r1.f27918e = r2
            java.net.Socket r2 = r14.f9968c
            p214m2.C4339q.m9704i(r2)
            ci.C0988c.m2699d(r2)
        L2ed:
            java.lang.Object r2 = r1.f27921h
            bi.s r2 = (bi.AbstractC0799s) r2
            java.lang.Object r3 = r1.f27920g
            fi.c r3 = (fi.C2181c) r3
            java.util.Objects.requireNonNull(r2)
            java.lang.String r2 = "call"
            p214m2.C4339q.m9706k(r3, r2)
            return r0
        L2fe:
            monitor-enter(r14)
            java.util.List<byte[]> r0 = r1.f27917d     // Catch: java.lang.Throwable -> L32f
            fi.h r0 = (fi.C2186h) r0     // Catch: java.lang.Throwable -> L32f
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L32f
            byte[] r2 = ci.C0988c.f5065a     // Catch: java.lang.Throwable -> L32f
            java.util.concurrent.ConcurrentLinkedQueue<fi.g> r2 = r0.f9986d     // Catch: java.lang.Throwable -> L32f
            r2.add(r14)     // Catch: java.lang.Throwable -> L32f
            ei.d r2 = r0.f9984b     // Catch: java.lang.Throwable -> L32f
            fi.h$a r0 = r0.f9985c     // Catch: java.lang.Throwable -> L32f
            r3 = 0
            r2.m4616c(r0, r3)     // Catch: java.lang.Throwable -> L32f
            java.lang.Object r0 = r1.f27920g     // Catch: java.lang.Throwable -> L32f
            fi.c r0 = (fi.C2181c) r0     // Catch: java.lang.Throwable -> L32f
            r0.m5752b(r14)     // Catch: java.lang.Throwable -> L32f
            monitor-exit(r14)
            java.lang.Object r0 = r1.f27921h
            bi.s r0 = (bi.AbstractC0799s) r0
            java.lang.Object r2 = r1.f27920g
            fi.c r2 = (fi.C2181c) r2
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = "call"
            p214m2.C4339q.m9706k(r2, r0)
            return r14
        L32f:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L332:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L335:
            r0 = move-exception
            java.lang.Object r2 = r1.f27920g
            fi.c r2 = (fi.C2181c) r2
            r2.f9953m0 = r3
            throw r0
        L33d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L345:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L34b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
    }

    /* renamed from: b */
    public fi.C2185g m14382b(int r13, int r14, int r15, int r16, boolean r17, boolean r18) {
            r12 = this;
            r1 = r12
        L1:
            fi.g r2 = r12.m14381a(r13, r14, r15, r16, r17)
            java.util.Objects.requireNonNull(r2)
            byte[] r0 = ci.C0988c.f5065a
            long r3 = java.lang.System.nanoTime()
            java.net.Socket r0 = r2.f9967b
            p214m2.C4339q.m9704i(r0)
            java.net.Socket r5 = r2.f9968c
            p214m2.C4339q.m9704i(r5)
            oi.h r6 = r2.f9972g
            p214m2.C4339q.m9704i(r6)
            boolean r0 = r0.isClosed()
            r7 = 0
            r8 = 1
            if (r0 != 0) goto L8c
            boolean r0 = r5.isClosed()
            if (r0 != 0) goto L8c
            boolean r0 = r5.isInputShutdown()
            if (r0 != 0) goto L8c
            boolean r0 = r5.isOutputShutdown()
            if (r0 == 0) goto L38
            goto L8c
        L38:
            ii.f r9 = r2.f9971f
            if (r9 == 0) goto L58
            monitor-enter(r9)
            boolean r0 = r9.f12723e0     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L42
            goto L50
        L42:
            long r5 = r9.f12732n0     // Catch: java.lang.Throwable -> L55
            long r10 = r9.f12731m0     // Catch: java.lang.Throwable -> L55
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r0 >= 0) goto L52
            long r5 = r9.f12734p0     // Catch: java.lang.Throwable -> L55
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L52
        L50:
            monitor-exit(r9)
            goto L8c
        L52:
            monitor-exit(r9)
        L53:
            r7 = 1
            goto L8c
        L55:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L58:
            monitor-enter(r2)
            long r9 = r2.f9981p     // Catch: java.lang.Throwable -> L88
            long r3 = r3 - r9
            monitor-exit(r2)
            r9 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 < 0) goto L53
            if (r18 == 0) goto L53
            java.lang.String r0 = "$this$isHealthy"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "source"
            p214m2.C4339q.m9706k(r6, r0)
            int r3 = r5.getSoTimeout()     // Catch: java.net.SocketTimeoutException -> L53 java.io.IOException -> L8c
            r5.setSoTimeout(r8)     // Catch: java.lang.Throwable -> L83
            boolean r0 = r6.mo11541F()     // Catch: java.lang.Throwable -> L83
            r0 = r0 ^ r8
            r5.setSoTimeout(r3)     // Catch: java.net.SocketTimeoutException -> L53 java.io.IOException -> L8c
            r7 = r0
            goto L8c
        L83:
            r0 = move-exception
            r5.setSoTimeout(r3)     // Catch: java.net.SocketTimeoutException -> L53 java.io.IOException -> L8c
            throw r0     // Catch: java.net.SocketTimeoutException -> L53 java.io.IOException -> L8c
        L88:
            r0 = move-exception
            r3 = r0
            monitor-exit(r2)
            throw r3
        L8c:
            if (r7 == 0) goto L8f
            return r2
        L8f:
            r2.m5772k()
            java.lang.Object r0 = r1.f27918e
            bi.j0 r0 = (bi.C0789j0) r0
            if (r0 == 0) goto L9a
            goto L1
        L9a:
            java.lang.Object r0 = r1.f27914a
            fi.j$a r0 = (fi.C2188j.a) r0
            if (r0 == 0) goto La5
            boolean r0 = r0.m5778a()
            goto La6
        La5:
            r0 = 1
        La6:
            if (r0 == 0) goto Laa
            goto L1
        Laa:
            java.lang.Object r0 = r1.f27916c
            fi.j r0 = (fi.C2188j) r0
            if (r0 == 0) goto Lb4
            boolean r8 = r0.m5776a()
        Lb4:
            if (r8 == 0) goto Lb8
            goto L1
        Lb8:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "exhausted all routes"
            r0.<init>(r2)
            throw r0
    }

    /* renamed from: c */
    public bi.C0789j0 m14383c() {
            r4 = this;
            int r0 = r4.f27915b
            r1 = 1
            r2 = 0
            if (r0 > r1) goto L39
            int r0 = r4.f27922i
            if (r0 > r1) goto L39
            int r0 = r4.f27923j
            if (r0 <= 0) goto Lf
            goto L39
        Lf:
            java.lang.Object r0 = r4.f27920g
            fi.c r0 = (fi.C2181c) r0
            fi.g r0 = r0.f9945e0
            if (r0 == 0) goto L39
            monitor-enter(r0)
            int r1 = r0.f9976k     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L1e
            monitor-exit(r0)
            return r2
        L1e:
            bi.j0 r1 = r0.f9982q     // Catch: java.lang.Throwable -> L36
            bi.a r1 = r1.f4286a     // Catch: java.lang.Throwable -> L36
            bi.w r1 = r1.f4124a     // Catch: java.lang.Throwable -> L36
            java.lang.Object r3 = r4.f27919f     // Catch: java.lang.Throwable -> L36
            bi.a r3 = (bi.C0770a) r3     // Catch: java.lang.Throwable -> L36
            bi.w r3 = r3.f4124a     // Catch: java.lang.Throwable -> L36
            boolean r1 = ci.C0988c.m2696a(r1, r3)     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L32
            monitor-exit(r0)
            return r2
        L32:
            bi.j0 r1 = r0.f9982q     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)
            return r1
        L36:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L39:
            return r2
    }

    /* renamed from: d */
    public boolean m14384d(bi.C0803w r4) {
            r3 = this;
            java.lang.String r0 = "url"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.Object r0 = r3.f27919f
            bi.a r0 = (bi.C0770a) r0
            bi.w r0 = r0.f4124a
            int r1 = r4.f4350f
            int r2 = r0.f4350f
            if (r1 != r2) goto L1d
            java.lang.String r4 = r4.f4349e
            java.lang.String r0 = r0.f4349e
            boolean r4 = p214m2.C4339q.m9702c(r4, r0)
            if (r4 == 0) goto L1d
            r4 = 1
            goto L1e
        L1d:
            r4 = 0
        L1e:
            return r4
    }

    /* renamed from: e */
    public void m14385e(java.io.IOException r3) {
            r2 = this;
            java.lang.String r0 = "e"
            p214m2.C4339q.m9706k(r3, r0)
            r0 = 0
            r2.f27918e = r0
            boolean r0 = r3 instanceof p154ii.C3194u
            if (r0 == 0) goto L1c
            r0 = r3
            ii.u r0 = (p154ii.C3194u) r0
            ii.b r0 = r0.f12854Y
            ii.b r1 = p154ii.EnumC3175b.f12677d0
            if (r0 != r1) goto L1c
            int r3 = r2.f27915b
            int r3 = r3 + 1
            r2.f27915b = r3
            goto L2d
        L1c:
            boolean r3 = r3 instanceof p154ii.C3174a
            if (r3 == 0) goto L27
            int r3 = r2.f27922i
            int r3 = r3 + 1
            r2.f27922i = r3
            goto L2d
        L27:
            int r3 = r2.f27923j
            int r3 = r3 + 1
            r2.f27923j = r3
        L2d:
            return
    }
}
