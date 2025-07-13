package p154ii;

/* renamed from: ii.m */
/* loaded from: classes.dex */
public final class C3186m implements gi.InterfaceC2394d {

    /* renamed from: g */
    public static final java.util.List<java.lang.String> f12792g = null;

    /* renamed from: h */
    public static final java.util.List<java.lang.String> f12793h = null;

    /* renamed from: a */
    public volatile p154ii.C3188o f12794a;

    /* renamed from: b */
    public final bi.EnumC0773b0 f12795b;

    /* renamed from: c */
    public volatile boolean f12796c;

    /* renamed from: d */
    public final fi.C2185g f12797d;

    /* renamed from: e */
    public final gi.C2397g f12798e;

    /* renamed from: f */
    public final p154ii.C3179f f12799f;

    static {
            java.lang.String r0 = "connection"
            java.lang.String r1 = "host"
            java.lang.String r2 = "keep-alive"
            java.lang.String r3 = "proxy-connection"
            java.lang.String r4 = "te"
            java.lang.String r5 = "transfer-encoding"
            java.lang.String r6 = "encoding"
            java.lang.String r7 = "upgrade"
            java.lang.String r8 = ":method"
            java.lang.String r9 = ":path"
            java.lang.String r10 = ":scheme"
            java.lang.String r11 = ":authority"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.util.List r0 = ci.C0988c.m2706k(r0)
            p154ii.C3186m.f12792g = r0
            java.lang.String r1 = "connection"
            java.lang.String r2 = "host"
            java.lang.String r3 = "keep-alive"
            java.lang.String r4 = "proxy-connection"
            java.lang.String r5 = "te"
            java.lang.String r6 = "transfer-encoding"
            java.lang.String r7 = "encoding"
            java.lang.String r8 = "upgrade"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.List r0 = ci.C0988c.m2706k(r0)
            p154ii.C3186m.f12793h = r0
            return
    }

    public C3186m(bi.C0771a0 r1, fi.C2185g r2, gi.C2397g r3, p154ii.C3179f r4) {
            r0 = this;
            r0.<init>()
            r0.f12797d = r2
            r0.f12798e = r3
            r0.f12799f = r4
            java.util.List<bi.b0> r1 = r1.f4155p0
            bi.b0 r2 = bi.EnumC0773b0.f4188d0
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L14
            goto L16
        L14:
            bi.b0 r2 = bi.EnumC0773b0.f4187c0
        L16:
            r0.f12795b = r2
            return
    }

    @Override // gi.InterfaceC2394d
    /* renamed from: a */
    public long mo6137a(bi.C0783g0 r3) {
            r2 = this;
            boolean r0 = gi.C2395e.m6145a(r3)
            if (r0 != 0) goto L9
            r0 = 0
            goto Ld
        L9:
            long r0 = ci.C0988c.m2705j(r3)
        Ld:
            return r0
    }

    @Override // gi.InterfaceC2394d
    /* renamed from: b */
    public p260oi.InterfaceC5302x mo6138b(bi.C0775c0 r1, long r2) {
            r0 = this;
            ii.o r1 = r0.f12794a
            p214m2.C4339q.m9704i(r1)
            oi.x r1 = r1.m7659g()
            return r1
    }

    @Override // gi.InterfaceC2394d
    /* renamed from: c */
    public void mo6139c() {
            r1 = this;
            ii.o r0 = r1.f12794a
            p214m2.C4339q.m9704i(r0)
            oi.x r0 = r0.m7659g()
            ii.o$a r0 = (p154ii.C3188o.a) r0
            r0.close()
            return
    }

    @Override // gi.InterfaceC2394d
    public void cancel() {
            r2 = this;
            r0 = 1
            r2.f12796c = r0
            ii.o r0 = r2.f12794a
            if (r0 == 0) goto Lc
            ii.b r1 = p154ii.EnumC3175b.f12678e0
            r0.m7657e(r1)
        Lc:
            return
    }

    @Override // gi.InterfaceC2394d
    /* renamed from: d */
    public void mo6140d() {
            r1 = this;
            ii.f r0 = r1.f12799f
            ii.p r0 = r0.f12742x0
            r0.flush()
            return
    }

    @Override // gi.InterfaceC2394d
    /* renamed from: e */
    public void mo6141e(bi.C0775c0 r15) {
            r14 = this;
            ii.o r0 = r14.f12794a
            if (r0 == 0) goto L5
            return
        L5:
            bi.f0 r0 = r15.f4197e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            bi.v r3 = r15.f4196d
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r3.size()
            int r5 = r5 + 4
            r4.<init>(r5)
            ii.c r5 = new ii.c
            oi.i r6 = p154ii.C3176c.f12683f
            java.lang.String r7 = r15.f4195c
            r5.<init>(r6, r7)
            r4.add(r5)
            ii.c r5 = new ii.c
            oi.i r6 = p154ii.C3176c.f12684g
            bi.w r7 = r15.f4194b
            java.lang.String r8 = "url"
            p214m2.C4339q.m9706k(r7, r8)
            java.lang.String r8 = r7.m2440b()
            java.lang.String r7 = r7.m2442d()
            if (r7 == 0) goto L50
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r8 = 63
            r9.append(r8)
            r9.append(r7)
            java.lang.String r8 = r9.toString()
        L50:
            r5.<init>(r6, r8)
            r4.add(r5)
            java.lang.String r5 = "Host"
            java.lang.String r5 = r15.m2364b(r5)
            if (r5 == 0) goto L68
            ii.c r6 = new ii.c
            oi.i r7 = p154ii.C3176c.f12686i
            r6.<init>(r7, r5)
            r4.add(r6)
        L68:
            ii.c r5 = new ii.c
            oi.i r6 = p154ii.C3176c.f12685h
            bi.w r15 = r15.f4194b
            java.lang.String r15 = r15.f4346b
            r5.<init>(r6, r15)
            r4.add(r5)
            int r15 = r3.size()
            r5 = 0
        L7b:
            if (r5 >= r15) goto Lc1
            java.lang.String r6 = r3.m2429e(r5)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r8 = "Locale.US"
            p214m2.C4339q.m9705j(r7, r8)
            java.lang.String r8 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r6, r8)
            java.lang.String r6 = r6.toLowerCase(r7)
            java.lang.String r7 = "(this as java.lang.String).toLowerCase(locale)"
            p214m2.C4339q.m9705j(r6, r7)
            java.util.List<java.lang.String> r7 = p154ii.C3186m.f12792g
            boolean r7 = r7.contains(r6)
            if (r7 == 0) goto Lb2
            java.lang.String r7 = "te"
            boolean r7 = p214m2.C4339q.m9702c(r6, r7)
            if (r7 == 0) goto Lbe
            java.lang.String r7 = r3.m2431i(r5)
            java.lang.String r8 = "trailers"
            boolean r7 = p214m2.C4339q.m9702c(r7, r8)
            if (r7 == 0) goto Lbe
        Lb2:
            ii.c r7 = new ii.c
            java.lang.String r8 = r3.m2431i(r5)
            r7.<init>(r6, r8)
            r4.add(r7)
        Lbe:
            int r5 = r5 + 1
            goto L7b
        Lc1:
            ii.f r15 = r14.f12799f
            java.util.Objects.requireNonNull(r15)
            r3 = r0 ^ 1
            r10 = 0
            ii.p r5 = r15.f12742x0
            monitor-enter(r5)
            monitor-enter(r15)     // Catch: java.lang.Throwable -> L15f
            int r6 = r15.f12722d0     // Catch: java.lang.Throwable -> L15c
            r7 = 1073741823(0x3fffffff, float:1.9999999)
            if (r6 <= r7) goto Ld9
            ii.b r6 = p154ii.EnumC3175b.f12677d0     // Catch: java.lang.Throwable -> L15c
            r15.m7637n(r6)     // Catch: java.lang.Throwable -> L15c
        Ld9:
            boolean r6 = r15.f12723e0     // Catch: java.lang.Throwable -> L15c
            if (r6 != 0) goto L156
            int r12 = r15.f12722d0     // Catch: java.lang.Throwable -> L15c
            int r6 = r12 + 2
            r15.f12722d0 = r6     // Catch: java.lang.Throwable -> L15c
            ii.o r13 = new ii.o     // Catch: java.lang.Throwable -> L15c
            r11 = 0
            r6 = r13
            r7 = r12
            r8 = r15
            r9 = r3
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L15c
            if (r0 == 0) goto Lff
            long r6 = r15.f12739u0     // Catch: java.lang.Throwable -> L15c
            long r8 = r15.f12740v0     // Catch: java.lang.Throwable -> L15c
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto Lff
            long r6 = r13.f12814c     // Catch: java.lang.Throwable -> L15c
            long r8 = r13.f12815d     // Catch: java.lang.Throwable -> L15c
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L100
        Lff:
            r1 = 1
        L100:
            boolean r0 = r13.m7661i()     // Catch: java.lang.Throwable -> L15c
            if (r0 == 0) goto L10f
            java.util.Map<java.lang.Integer, ii.o> r0 = r15.f12719a0     // Catch: java.lang.Throwable -> L15c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L15c
            r0.put(r2, r13)     // Catch: java.lang.Throwable -> L15c
        L10f:
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L15f
            ii.p r0 = r15.f12742x0     // Catch: java.lang.Throwable -> L15f
            r0.m7677n(r3, r12, r4)     // Catch: java.lang.Throwable -> L15f
            monitor-exit(r5)
            if (r1 == 0) goto L11d
            ii.p r15 = r15.f12742x0
            r15.flush()
        L11d:
            r14.f12794a = r13
            boolean r15 = r14.f12796c
            if (r15 != 0) goto L144
            ii.o r15 = r14.f12794a
            p214m2.C4339q.m9704i(r15)
            ii.o$c r15 = r15.f12820i
            gi.g r0 = r14.f12798e
            int r0 = r0.f10788h
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r15.mo11530g(r0, r2)
            ii.o r15 = r14.f12794a
            p214m2.C4339q.m9704i(r15)
            ii.o$c r15 = r15.f12821j
            gi.g r0 = r14.f12798e
            int r0 = r0.f10789i
            long r0 = (long) r0
            r15.mo11530g(r0, r2)
            return
        L144:
            ii.o r15 = r14.f12794a
            p214m2.C4339q.m9704i(r15)
            ii.b r0 = p154ii.EnumC3175b.f12678e0
            r15.m7657e(r0)
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r15.<init>(r0)
            throw r15
        L156:
            ii.a r0 = new ii.a     // Catch: java.lang.Throwable -> L15c
            r0.<init>()     // Catch: java.lang.Throwable -> L15c
            throw r0     // Catch: java.lang.Throwable -> L15c
        L15c:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L15f
            throw r0     // Catch: java.lang.Throwable -> L15f
        L15f:
            r15 = move-exception
            monitor-exit(r5)
            throw r15
    }

    @Override // gi.InterfaceC2394d
    /* renamed from: f */
    public p260oi.InterfaceC5304z mo6142f(bi.C0783g0 r1) {
            r0 = this;
            ii.o r1 = r0.f12794a
            p214m2.C4339q.m9704i(r1)
            ii.o$b r1 = r1.f12818g
            return r1
    }

    @Override // gi.InterfaceC2394d
    /* renamed from: g */
    public bi.C0783g0.a mo6143g(boolean r12) {
            r11 = this;
            ii.o r0 = r11.f12794a
            p214m2.C4339q.m9704i(r0)
            monitor-enter(r0)
            ii.o$c r1 = r0.f12820i     // Catch: java.lang.Throwable -> Lf0
            r1.m11531h()     // Catch: java.lang.Throwable -> Lf0
        Lb:
            java.util.ArrayDeque<bi.v> r1 = r0.f12816e     // Catch: java.lang.Throwable -> Le9
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Le9
            if (r1 == 0) goto L1b
            ii.b r1 = r0.f12822k     // Catch: java.lang.Throwable -> Le9
            if (r1 != 0) goto L1b
            r0.m7664l()     // Catch: java.lang.Throwable -> Le9
            goto Lb
        L1b:
            ii.o$c r1 = r0.f12820i     // Catch: java.lang.Throwable -> Lf0
            r1.m7668l()     // Catch: java.lang.Throwable -> Lf0
            java.util.ArrayDeque<bi.v> r1 = r0.f12816e     // Catch: java.lang.Throwable -> Lf0
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lf0
            r1 = r1 ^ 1
            if (r1 == 0) goto Ld9
            java.util.ArrayDeque<bi.v> r1 = r0.f12816e     // Catch: java.lang.Throwable -> Lf0
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r2 = "headersQueue.removeFirst()"
            p214m2.C4339q.m9705j(r1, r2)     // Catch: java.lang.Throwable -> Lf0
            bi.v r1 = (bi.C0802v) r1     // Catch: java.lang.Throwable -> Lf0
            monitor-exit(r0)
            bi.b0 r0 = r11.f12795b
            java.lang.String r2 = "headerBlock"
            p214m2.C4339q.m9706k(r1, r2)
            java.lang.String r2 = "protocol"
            p214m2.C4339q.m9706k(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            int r3 = r1.size()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = r4
        L53:
            if (r6 >= r3) goto L9e
            java.lang.String r8 = r1.m2429e(r6)
            java.lang.String r9 = r1.m2431i(r6)
            java.lang.String r10 = ":status"
            boolean r10 = p214m2.C4339q.m9702c(r8, r10)
            if (r10 == 0) goto L7b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "HTTP/1.1 "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            gi.j r7 = gi.C2400j.m6154a(r7)
            goto L9b
        L7b:
            java.util.List<java.lang.String> r10 = p154ii.C3186m.f12793h
            boolean r10 = r10.contains(r8)
            if (r10 != 0) goto L9b
            java.lang.String r10 = "name"
            p214m2.C4339q.m9706k(r8, r10)
            java.lang.String r10 = "value"
            p214m2.C4339q.m9706k(r9, r10)
            r2.add(r8)
            java.lang.CharSequence r8 = p362uh.C6467m.m13083n0(r9)
            java.lang.String r8 = r8.toString()
            r2.add(r8)
        L9b:
            int r6 = r6 + 1
            goto L53
        L9e:
            if (r7 == 0) goto Ld1
            bi.g0$a r1 = new bi.g0$a
            r1.<init>()
            r1.m2387f(r0)
            int r0 = r7.f10795b
            r1.f4240c = r0
            java.lang.String r0 = r7.f10796c
            r1.m2386e(r0)
            bi.v r0 = new bi.v
            java.lang.String[] r3 = new java.lang.String[r5]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.<init>(r2, r4)
            r1.m2385d(r0)
            if (r12 == 0) goto Lcf
            int r12 = r1.f4240c
            r0 = 100
            if (r12 != r0) goto Lcf
            goto Ld0
        Lcf:
            r4 = r1
        Ld0:
            return r4
        Ld1:
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r12.<init>(r0)
            throw r12
        Ld9:
            java.io.IOException r12 = r0.f12823l     // Catch: java.lang.Throwable -> Lf0
            if (r12 == 0) goto Lde
            goto Le8
        Lde:
            ii.u r12 = new ii.u     // Catch: java.lang.Throwable -> Lf0
            ii.b r1 = r0.f12822k     // Catch: java.lang.Throwable -> Lf0
            p214m2.C4339q.m9704i(r1)     // Catch: java.lang.Throwable -> Lf0
            r12.<init>(r1)     // Catch: java.lang.Throwable -> Lf0
        Le8:
            throw r12     // Catch: java.lang.Throwable -> Lf0
        Le9:
            r12 = move-exception
            ii.o$c r1 = r0.f12820i     // Catch: java.lang.Throwable -> Lf0
            r1.m7668l()     // Catch: java.lang.Throwable -> Lf0
            throw r12     // Catch: java.lang.Throwable -> Lf0
        Lf0:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
    }

    @Override // gi.InterfaceC2394d
    /* renamed from: h */
    public fi.C2185g mo6144h() {
            r1 = this;
            fi.g r0 = r1.f12797d
            return r0
    }
}
