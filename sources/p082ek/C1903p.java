package p082ek;

/* renamed from: ek.p */
/* loaded from: classes.dex */
public final class C1903p<T> implements p082ek.InterfaceC1884b<T> {

    /* renamed from: Y */
    public final p082ek.C1912y f8191Y;

    /* renamed from: Z */
    public final java.lang.Object[] f8192Z;

    /* renamed from: a0 */
    public final bi.InterfaceC0780f.a f8193a0;

    /* renamed from: b0 */
    public final p082ek.InterfaceC1892f<bi.AbstractC0785h0, T> f8194b0;

    /* renamed from: c0 */
    public volatile boolean f8195c0;

    /* renamed from: d0 */
    public bi.InterfaceC0780f f8196d0;

    /* renamed from: e0 */
    public java.lang.Throwable f8197e0;

    /* renamed from: f0 */
    public boolean f8198f0;

    /* renamed from: ek.p$a */
    public class a implements bi.InterfaceC0782g {

        /* renamed from: a */
        public final /* synthetic */ p082ek.InterfaceC1888d f8199a;

        /* renamed from: b */
        public final /* synthetic */ p082ek.C1903p f8200b;

        public a(p082ek.C1903p r1, p082ek.InterfaceC1888d r2) {
                r0 = this;
                r0.f8200b = r1
                r0.f8199a = r2
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void m4681a(bi.InterfaceC0780f r2, java.io.IOException r3) {
                r1 = this;
                ek.d r2 = r1.f8199a     // Catch: java.lang.Throwable -> L8
                ek.p r0 = r1.f8200b     // Catch: java.lang.Throwable -> L8
                r2.mo4658a(r0, r3)     // Catch: java.lang.Throwable -> L8
                goto Lf
            L8:
                r2 = move-exception
                p082ek.C1893f0.m4674o(r2)
                r2.printStackTrace()
            Lf:
                return
        }

        /* renamed from: b */
        public void m4682b(bi.InterfaceC0780f r2, bi.C0783g0 r3) {
                r1 = this;
                ek.p r2 = r1.f8200b     // Catch: java.lang.Throwable -> L16
                ek.z r2 = r2.m4680c(r3)     // Catch: java.lang.Throwable -> L16
                ek.d r3 = r1.f8199a     // Catch: java.lang.Throwable -> Le
                ek.p r0 = r1.f8200b     // Catch: java.lang.Throwable -> Le
                r3.mo4659b(r0, r2)     // Catch: java.lang.Throwable -> Le
                goto L15
            Le:
                r2 = move-exception
                p082ek.C1893f0.m4674o(r2)
                r2.printStackTrace()
            L15:
                return
            L16:
                r2 = move-exception
                p082ek.C1893f0.m4674o(r2)
                ek.d r3 = r1.f8199a     // Catch: java.lang.Throwable -> L22
                ek.p r0 = r1.f8200b     // Catch: java.lang.Throwable -> L22
                r3.mo4658a(r0, r2)     // Catch: java.lang.Throwable -> L22
                goto L29
            L22:
                r2 = move-exception
                p082ek.C1893f0.m4674o(r2)
                r2.printStackTrace()
            L29:
                return
        }
    }

    /* renamed from: ek.p$b */
    public static final class b extends bi.AbstractC0785h0 {

        /* renamed from: Z */
        public final bi.AbstractC0785h0 f8201Z;

        /* renamed from: a0 */
        public final p260oi.InterfaceC5286h f8202a0;

        /* renamed from: b0 */
        public java.io.IOException f8203b0;

        /* renamed from: ek.p$b$a */
        public class a extends p260oi.AbstractC5289k {

            /* renamed from: Z */
            public final /* synthetic */ p082ek.C1903p.b f8204Z;

            public a(p082ek.C1903p.b r1, p260oi.InterfaceC5304z r2) {
                    r0 = this;
                    r0.f8204Z = r1
                    r0.<init>(r2)
                    return
            }

            @Override // p260oi.InterfaceC5304z
            /* renamed from: j0 */
            public long mo4683j0(p260oi.C5283e r2, long r3) {
                    r1 = this;
                    java.lang.String r0 = "sink"
                    p214m2.C4339q.m9706k(r2, r0)     // Catch: java.io.IOException -> Lc
                    oi.z r0 = r1.f20510Y     // Catch: java.io.IOException -> Lc
                    long r2 = r0.mo4683j0(r2, r3)     // Catch: java.io.IOException -> Lc
                    return r2
                Lc:
                    r2 = move-exception
                    ek.p$b r3 = r1.f8204Z
                    r3.f8203b0 = r2
                    throw r2
            }
        }

        public b(bi.AbstractC0785h0 r2) {
                r1 = this;
                r1.<init>()
                r1.f8201Z = r2
                ek.p$b$a r0 = new ek.p$b$a
                oi.h r2 = r2.mo2396l()
                r0.<init>(r1, r2)
                oi.t r2 = new oi.t
                r2.<init>(r0)
                r1.f8202a0 = r2
                return
        }

        @Override // bi.AbstractC0785h0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                bi.h0 r0 = r1.f8201Z
                r0.close()
                return
        }

        @Override // bi.AbstractC0785h0
        /* renamed from: h */
        public long mo2394h() {
                r2 = this;
                bi.h0 r0 = r2.f8201Z
                long r0 = r0.mo2394h()
                return r0
        }

        @Override // bi.AbstractC0785h0
        /* renamed from: i */
        public bi.C0805y mo2395i() {
                r1 = this;
                bi.h0 r0 = r1.f8201Z
                bi.y r0 = r0.mo2395i()
                return r0
        }

        @Override // bi.AbstractC0785h0
        /* renamed from: l */
        public p260oi.InterfaceC5286h mo2396l() {
                r1 = this;
                oi.h r0 = r1.f8202a0
                return r0
        }
    }

    /* renamed from: ek.p$c */
    public static final class c extends bi.AbstractC0785h0 {

        /* renamed from: Z */
        public final bi.C0805y f8205Z;

        /* renamed from: a0 */
        public final long f8206a0;

        public c(bi.C0805y r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.f8205Z = r1
                r0.f8206a0 = r2
                return
        }

        @Override // bi.AbstractC0785h0
        /* renamed from: h */
        public long mo2394h() {
                r2 = this;
                long r0 = r2.f8206a0
                return r0
        }

        @Override // bi.AbstractC0785h0
        /* renamed from: i */
        public bi.C0805y mo2395i() {
                r1 = this;
                bi.y r0 = r1.f8205Z
                return r0
        }

        @Override // bi.AbstractC0785h0
        /* renamed from: l */
        public p260oi.InterfaceC5286h mo2396l() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Cannot read raw response body of a converted body."
                r0.<init>(r1)
                throw r0
        }
    }

    public C1903p(p082ek.C1912y r1, java.lang.Object[] r2, bi.InterfaceC0780f.a r3, p082ek.InterfaceC1892f<bi.AbstractC0785h0, T> r4) {
            r0 = this;
            r0.<init>()
            r0.f8191Y = r1
            r0.f8192Z = r2
            r0.f8193a0 = r3
            r0.f8194b0 = r4
            return
    }

    @Override // p082ek.InterfaceC1884b
    /* renamed from: L */
    public void mo4643L(p082ek.InterfaceC1888d<T> r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f8198f0     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L35
            r0 = 1
            r3.f8198f0 = r0     // Catch: java.lang.Throwable -> L3d
            bi.f r0 = r3.f8196d0     // Catch: java.lang.Throwable -> L3d
            java.lang.Throwable r1 = r3.f8197e0     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L1e
            if (r1 != 0) goto L1e
            bi.f r2 = r3.m4678a()     // Catch: java.lang.Throwable -> L18
            r3.f8196d0 = r2     // Catch: java.lang.Throwable -> L18
            r0 = r2
            goto L1e
        L18:
            r1 = move-exception
            p082ek.C1893f0.m4674o(r1)     // Catch: java.lang.Throwable -> L3d
            r3.f8197e0 = r1     // Catch: java.lang.Throwable -> L3d
        L1e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L25
            r4.mo4658a(r3, r1)
            return
        L25:
            boolean r1 = r3.f8195c0
            if (r1 == 0) goto L2c
            r0.cancel()
        L2c:
            ek.p$a r1 = new ek.p$a
            r1.<init>(r3, r4)
            r0.mo2376Q(r1)
            return
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = "Already executed."
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L3d
            throw r4     // Catch: java.lang.Throwable -> L3d
        L3d:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3d
            throw r4
    }

    /* renamed from: a */
    public final bi.InterfaceC0780f m4678a() {
            r15 = this;
            bi.f$a r0 = r15.f8193a0
            ek.y r1 = r15.f8191Y
            java.lang.Object[] r2 = r15.f8192Z
            retrofit2.ParameterHandler<?>[] r3 = r1.f8278j
            int r4 = r2.length
            int r5 = r3.length
            if (r4 != r5) goto L126
            ek.v r5 = new ek.v
            java.lang.String r7 = r1.f8271c
            bi.w r8 = r1.f8270b
            java.lang.String r9 = r1.f8272d
            bi.v r10 = r1.f8273e
            bi.y r11 = r1.f8274f
            boolean r12 = r1.f8275g
            boolean r13 = r1.f8276h
            boolean r14 = r1.f8277i
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r6 = r1.f8279k
            if (r6 == 0) goto L28
            int r4 = r4 + (-1)
        L28:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            r7 = 0
            r8 = 0
        L2f:
            if (r8 >= r4) goto L40
            r9 = r2[r8]
            r6.add(r9)
            r9 = r3[r8]
            r10 = r2[r8]
            r9.mo4684a(r5, r10)
            int r8 = r8 + 1
            goto L2f
        L40:
            bi.w$a r2 = r5.f8259d
            r3 = 0
            if (r2 == 0) goto L4a
            bi.w r2 = r2.m2447a()
            goto L64
        L4a:
            bi.w r2 = r5.f8257b
            java.lang.String r4 = r5.f8258c
            java.util.Objects.requireNonNull(r2)
            java.lang.String r8 = "link"
            p214m2.C4339q.m9706k(r4, r8)
            bi.w$a r2 = r2.m2444f(r4)
            if (r2 == 0) goto L61
            bi.w r2 = r2.m2447a()
            goto L62
        L61:
            r2 = r3
        L62:
            if (r2 == 0) goto L107
        L64:
            bi.f0 r4 = r5.f8266k
            if (r4 != 0) goto Lbc
            bi.t$a r8 = r5.f8265j
            if (r8 == 0) goto L76
            bi.t r4 = new bi.t
            java.util.List<java.lang.String> r3 = r8.f4331a
            java.util.List<java.lang.String> r7 = r8.f4332b
            r4.<init>(r3, r7)
            goto Lbc
        L76:
            bi.z$a r8 = r5.f8264i
            if (r8 == 0) goto La0
            java.util.List<bi.z$b> r3 = r8.f4380c
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L94
            bi.z r4 = new bi.z
            oi.i r3 = r8.f4378a
            bi.y r7 = r8.f4379b
            java.util.List<bi.z$b> r8 = r8.f4380c
            java.util.List r8 = ci.C0988c.m2717v(r8)
            r4.<init>(r3, r7, r8)
            goto Lbc
        L94:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Multipart body must have at least one part."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La0:
            boolean r8 = r5.f8263h
            if (r8 == 0) goto Lbc
            byte[] r4 = new byte[r7]
            java.lang.String r8 = "content"
            p214m2.C4339q.m9706k(r4, r8)
            java.lang.String r8 = "$this$toRequestBody"
            p214m2.C4339q.m9706k(r4, r8)
            long r13 = (long) r7
            r9 = r13
            r11 = r13
            ci.C0988c.m2697b(r9, r11, r13)
            bi.e0 r8 = new bi.e0
            r8.<init>(r4, r3, r7, r7)
            r4 = r8
        Lbc:
            bi.y r3 = r5.f8262g
            if (r3 == 0) goto Ld2
            if (r4 == 0) goto Lc9
            ek.v$a r7 = new ek.v$a
            r7.<init>(r4, r3)
            r4 = r7
            goto Ld2
        Lc9:
            bi.v$a r7 = r5.f8261f
            java.lang.String r3 = r3.f4366a
            java.lang.String r8 = "Content-Type"
            r7.m2432a(r8, r3)
        Ld2:
            bi.c0$a r3 = r5.f8260e
            r3.m2369e(r2)
            bi.v$a r2 = r5.f8261f
            bi.v r2 = r2.m2434c()
            java.lang.String r7 = "headers"
            p214m2.C4339q.m9706k(r2, r7)
            bi.v$a r2 = r2.m2430h()
            r3.f4201c = r2
            java.lang.String r2 = r5.f8256a
            r3.m2367c(r2, r4)
            java.lang.Class<ek.j> r2 = p082ek.C1897j.class
            ek.j r4 = new ek.j
            java.lang.reflect.Method r1 = r1.f8269a
            r4.<init>(r1, r6)
            r3.m2368d(r2, r4)
            bi.c0 r1 = r3.m2365a()
            bi.f r0 = r0.mo2361a(r1)
            java.lang.String r1 = "Call.Factory returned null."
            java.util.Objects.requireNonNull(r0, r1)
            return r0
        L107:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Malformed URL. Base: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            bi.w r2 = r5.f8257b
            r1.append(r2)
            java.lang.String r2 = ", Relative: "
            r1.append(r2)
            java.lang.String r2 = r5.f8258c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L126:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Argument count ("
            java.lang.String r2 = ") doesn't match expected count ("
            java.lang.StringBuilder r1 = androidx.appcompat.widget.C0300r0.m777a(r1, r4, r2)
            int r2 = r3.length
            java.lang.String r3 = ")"
            java.lang.String r1 = p381w.C6764e.m13690a(r1, r2, r3)
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: b */
    public final bi.InterfaceC0780f m4679b() {
            r2 = this;
            bi.f r0 = r2.f8196d0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Throwable r0 = r2.f8197e0
            if (r0 == 0) goto L1a
            boolean r1 = r0 instanceof java.io.IOException
            if (r1 != 0) goto L17
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L14
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L14:
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L17:
            java.io.IOException r0 = (java.io.IOException) r0
            throw r0
        L1a:
            bi.f r0 = r2.m4678a()     // Catch: java.io.IOException -> L21 java.lang.Error -> L23 java.lang.RuntimeException -> L25
            r2.f8196d0 = r0     // Catch: java.io.IOException -> L21 java.lang.Error -> L23 java.lang.RuntimeException -> L25
            return r0
        L21:
            r0 = move-exception
            goto L26
        L23:
            r0 = move-exception
            goto L26
        L25:
            r0 = move-exception
        L26:
            p082ek.C1893f0.m4674o(r0)
            r2.f8197e0 = r0
            throw r0
    }

    /* renamed from: c */
    public p082ek.C1913z<T> m4680c(bi.C0783g0 r22) {
            r21 = this;
            r0 = r22
            bi.h0 r1 = r0.f4231e0
            java.lang.String r2 = "response"
            p214m2.C4339q.m9706k(r0, r2)
            bi.c0 r4 = r0.f4225Y
            bi.b0 r5 = r0.f4226Z
            int r7 = r0.f4228b0
            java.lang.String r6 = r0.f4227a0
            bi.u r8 = r0.f4229c0
            bi.v r2 = r0.f4230d0
            bi.v$a r2 = r2.m2430h()
            bi.g0 r11 = r0.f4232f0
            bi.g0 r12 = r0.f4233g0
            bi.g0 r13 = r0.f4234h0
            long r14 = r0.f4235i0
            long r9 = r0.f4236j0
            fi.b r0 = r0.f4237k0
            ek.p$c r3 = new ek.p$c
            r16 = r9
            bi.y r9 = r1.mo2395i()
            r19 = r14
            long r14 = r1.mo2394h()
            r3.<init>(r9, r14)
            if (r7 < 0) goto L3a
            r9 = 1
            goto L3b
        L3a:
            r9 = 0
        L3b:
            if (r9 == 0) goto Ld6
            if (r4 == 0) goto Lc8
            if (r5 == 0) goto Lba
            if (r6 == 0) goto Lac
            bi.v r9 = r2.m2434c()
            bi.g0 r2 = new bi.g0
            r10 = r3
            r3 = r2
            r14 = r19
            r18 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18)
            int r0 = r2.f4228b0
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 0
            if (r0 < r3) goto L8a
            r3 = 300(0x12c, float:4.2E-43)
            if (r0 < r3) goto L5e
            goto L8a
        L5e:
            r3 = 204(0xcc, float:2.86E-43)
            if (r0 == r3) goto L80
            r3 = 205(0xcd, float:2.87E-43)
            if (r0 != r3) goto L67
            goto L80
        L67:
            ek.p$b r3 = new ek.p$b
            r3.<init>(r1)
            r5 = r21
            ek.f<bi.h0, T> r0 = r5.f8194b0     // Catch: java.lang.RuntimeException -> L79
            java.lang.Object r0 = r0.mo4642a(r3)     // Catch: java.lang.RuntimeException -> L79
            ek.z r0 = p082ek.C1913z.m4696b(r0, r2)     // Catch: java.lang.RuntimeException -> L79
            return r0
        L79:
            r0 = move-exception
            java.io.IOException r1 = r3.f8203b0
            if (r1 != 0) goto L7f
            throw r0
        L7f:
            throw r1
        L80:
            r5 = r21
            r1.close()
            ek.z r0 = p082ek.C1913z.m4696b(r4, r2)
            return r0
        L8a:
            r5 = r21
            bi.h0 r0 = p082ek.C1893f0.m4660a(r1)     // Catch: java.lang.Throwable -> La7
            boolean r3 = r2.m2381h()     // Catch: java.lang.Throwable -> La7
            if (r3 != 0) goto L9f
            ek.z r3 = new ek.z     // Catch: java.lang.Throwable -> La7
            r3.<init>(r2, r4, r0)     // Catch: java.lang.Throwable -> La7
            r1.close()
            return r3
        L9f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = "rawResponse should not be successful response"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> La7
            throw r0     // Catch: java.lang.Throwable -> La7
        La7:
            r0 = move-exception
            r1.close()
            throw r0
        Lac:
            r5 = r21
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "message == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lba:
            r5 = r21
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "protocol == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lc8:
            r5 = r21
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "request == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Ld6:
            r5 = r21
            java.lang.String r0 = "code < 0: "
            java.lang.String r0 = android.support.v4.media.C0142a.m254a(r0, r7)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // p082ek.InterfaceC1884b
    public void cancel() {
            r1 = this;
            r0 = 1
            r1.f8195c0 = r0
            monitor-enter(r1)
            bi.f r0 = r1.f8196d0     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lc
            r0.cancel()
        Lc:
            return
        Ld:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    public java.lang.Object clone() {
            r5 = this;
            ek.p r0 = new ek.p
            ek.y r1 = r5.f8191Y
            java.lang.Object[] r2 = r5.f8192Z
            bi.f$a r3 = r5.f8193a0
            ek.f<bi.h0, T> r4 = r5.f8194b0
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // p082ek.InterfaceC1884b
    /* renamed from: h */
    public p082ek.C1913z<T> mo4644h() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f8198f0     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L1d
            r0 = 1
            r2.f8198f0 = r0     // Catch: java.lang.Throwable -> L25
            bi.f r0 = r2.m4679b()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            boolean r1 = r2.f8195c0
            if (r1 == 0) goto L14
            r0.cancel()
        L14:
            bi.g0 r0 = r0.mo2377h()
            ek.z r0 = r2.m4680c(r0)
            return r0
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "Already executed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L25
            throw r0     // Catch: java.lang.Throwable -> L25
        L25:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            throw r0
    }

    @Override // p082ek.InterfaceC1884b
    /* renamed from: i */
    public synchronized bi.C0775c0 mo4645i() {
            r3 = this;
            monitor-enter(r3)
            bi.f r0 = r3.m4679b()     // Catch: java.lang.Throwable -> Lb java.io.IOException -> Ld
            bi.c0 r0 = r0.mo2378i()     // Catch: java.lang.Throwable -> Lb java.io.IOException -> Ld
            monitor-exit(r3)
            return r0
        Lb:
            r0 = move-exception
            goto L16
        Ld:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = "Unable to create request."
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> Lb
            throw r1     // Catch: java.lang.Throwable -> Lb
        L16:
            monitor-exit(r3)
            throw r0
    }

    @Override // p082ek.InterfaceC1884b
    /* renamed from: l */
    public boolean mo4646l() {
            r2 = this;
            boolean r0 = r2.f8195c0
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            monitor-enter(r2)
            bi.f r0 = r2.f8196d0     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L12
            boolean r0 = r0.mo2379l()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            return r1
        L15:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    @Override // p082ek.InterfaceC1884b
    /* renamed from: n */
    public p082ek.InterfaceC1884b mo4647n() {
            r5 = this;
            ek.p r0 = new ek.p
            ek.y r1 = r5.f8191Y
            java.lang.Object[] r2 = r5.f8192Z
            bi.f$a r3 = r5.f8193a0
            ek.f<bi.h0, T> r4 = r5.f8194b0
            r0.<init>(r1, r2, r3, r4)
            return r0
    }
}
