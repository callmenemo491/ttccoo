package fi;

/* renamed from: fi.b */
/* loaded from: classes.dex */
public final class C2180b {

    /* renamed from: a */
    public boolean f9922a;

    /* renamed from: b */
    public final fi.C2185g f9923b;

    /* renamed from: c */
    public final fi.C2181c f9924c;

    /* renamed from: d */
    public final bi.AbstractC0799s f9925d;

    /* renamed from: e */
    public final p453zb.C7273e f9926e;

    /* renamed from: f */
    public final gi.InterfaceC2394d f9927f;

    /* renamed from: fi.b$a */
    public final class a extends p260oi.AbstractC5288j {

        /* renamed from: Z */
        public boolean f9928Z;

        /* renamed from: a0 */
        public long f9929a0;

        /* renamed from: b0 */
        public boolean f9930b0;

        /* renamed from: c0 */
        public final long f9931c0;

        /* renamed from: d0 */
        public final /* synthetic */ fi.C2180b f9932d0;

        public a(fi.C2180b r2, p260oi.InterfaceC5302x r3, long r4) {
                r1 = this;
                java.lang.String r0 = "delegate"
                p214m2.C4339q.m9706k(r3, r0)
                r1.f9932d0 = r2
                r1.<init>(r3)
                r1.f9931c0 = r4
                return
        }

        /* renamed from: a */
        public final <E extends java.io.IOException> E m5748a(E r8) {
                r7 = this;
                boolean r0 = r7.f9928Z
                if (r0 == 0) goto L5
                return r8
            L5:
                r0 = 1
                r7.f9928Z = r0
                fi.b r1 = r7.f9932d0
                long r2 = r7.f9929a0
                r4 = 0
                r5 = 1
                r6 = r8
                java.io.IOException r8 = r1.m5743a(r2, r4, r5, r6)
                return r8
        }

        @Override // p260oi.InterfaceC5302x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r5 = this;
                boolean r0 = r5.f9930b0
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r5.f9930b0 = r0
                long r0 = r5.f9931c0
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L1f
                long r2 = r5.f9929a0
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L17
                goto L1f
            L17:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r1 = "unexpected end of stream"
                r0.<init>(r1)
                throw r0
            L1f:
                oi.x r0 = r5.f20509Y     // Catch: java.io.IOException -> L29
                r0.close()     // Catch: java.io.IOException -> L29
                r0 = 0
                r5.m5748a(r0)     // Catch: java.io.IOException -> L29
                return
            L29:
                r0 = move-exception
                java.io.IOException r0 = r5.m5748a(r0)
                throw r0
        }

        @Override // p260oi.InterfaceC5302x, java.io.Flushable
        public void flush() {
                r1 = this;
                oi.x r0 = r1.f20509Y     // Catch: java.io.IOException -> L6
                r0.flush()     // Catch: java.io.IOException -> L6
                return
            L6:
                r0 = move-exception
                java.io.IOException r0 = r1.m5748a(r0)
                throw r0
        }

        @Override // p260oi.InterfaceC5302x
        /* renamed from: p0 */
        public void mo5749p0(p260oi.C5283e r7, long r8) {
                r6 = this;
                java.lang.String r0 = "source"
                p214m2.C4339q.m9706k(r7, r0)
                boolean r1 = r6.f9930b0
                r1 = r1 ^ 1
                if (r1 == 0) goto L4f
                long r1 = r6.f9931c0
                r3 = -1
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L3b
                long r3 = r6.f9929a0
                long r3 = r3 + r8
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 > 0) goto L1b
                goto L3b
            L1b:
                java.net.ProtocolException r7 = new java.net.ProtocolException
                java.lang.String r0 = "expected "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                long r1 = r6.f9931c0
                r0.append(r1)
                java.lang.String r1 = " bytes but received "
                r0.append(r1)
                long r1 = r6.f9929a0
                long r1 = r1 + r8
                r0.append(r1)
                java.lang.String r8 = r0.toString()
                r7.<init>(r8)
                throw r7
            L3b:
                p214m2.C4339q.m9706k(r7, r0)     // Catch: java.io.IOException -> L49
                oi.x r0 = r6.f20509Y     // Catch: java.io.IOException -> L49
                r0.mo5749p0(r7, r8)     // Catch: java.io.IOException -> L49
                long r0 = r6.f9929a0     // Catch: java.io.IOException -> L49
                long r0 = r0 + r8
                r6.f9929a0 = r0     // Catch: java.io.IOException -> L49
                return
            L49:
                r7 = move-exception
                java.io.IOException r7 = r6.m5748a(r7)
                throw r7
            L4f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "closed"
                java.lang.String r8 = r8.toString()
                r7.<init>(r8)
                throw r7
        }
    }

    /* renamed from: fi.b$b */
    public final class b extends p260oi.AbstractC5289k {

        /* renamed from: Z */
        public long f9933Z;

        /* renamed from: a0 */
        public boolean f9934a0;

        /* renamed from: b0 */
        public boolean f9935b0;

        /* renamed from: c0 */
        public boolean f9936c0;

        /* renamed from: d0 */
        public final long f9937d0;

        /* renamed from: e0 */
        public final /* synthetic */ fi.C2180b f9938e0;

        public b(fi.C2180b r2, p260oi.InterfaceC5304z r3, long r4) {
                r1 = this;
                java.lang.String r0 = "delegate"
                p214m2.C4339q.m9706k(r3, r0)
                r1.f9938e0 = r2
                r1.<init>(r3)
                r1.f9937d0 = r4
                r2 = 1
                r1.f9934a0 = r2
                r2 = 0
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 != 0) goto L19
                r2 = 0
                r1.m5750a(r2)
            L19:
                return
        }

        /* renamed from: a */
        public final <E extends java.io.IOException> E m5750a(E r9) {
                r8 = this;
                boolean r0 = r8.f9935b0
                if (r0 == 0) goto L5
                return r9
            L5:
                r0 = 1
                r8.f9935b0 = r0
                if (r9 != 0) goto L1f
                boolean r0 = r8.f9934a0
                if (r0 == 0) goto L1f
                r0 = 0
                r8.f9934a0 = r0
                fi.b r0 = r8.f9938e0
                bi.s r1 = r0.f9925d
                fi.c r0 = r0.f9924c
                java.util.Objects.requireNonNull(r1)
                java.lang.String r1 = "call"
                p214m2.C4339q.m9706k(r0, r1)
            L1f:
                fi.b r2 = r8.f9938e0
                long r3 = r8.f9933Z
                r5 = 1
                r6 = 0
                r7 = r9
                java.io.IOException r9 = r2.m5743a(r3, r5, r6, r7)
                return r9
        }

        @Override // p260oi.AbstractC5289k, p260oi.InterfaceC5304z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                boolean r0 = r1.f9936c0
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.f9936c0 = r0
                oi.z r0 = r1.f20510Y     // Catch: java.io.IOException -> L12
                r0.close()     // Catch: java.io.IOException -> L12
                r0 = 0
                r1.m5750a(r0)     // Catch: java.io.IOException -> L12
                return
            L12:
                r0 = move-exception
                java.io.IOException r0 = r1.m5750a(r0)
                throw r0
        }

        @Override // p260oi.InterfaceC5304z
        /* renamed from: j0 */
        public long mo4683j0(p260oi.C5283e r8, long r9) {
                r7 = this;
                java.lang.String r0 = "sink"
                p214m2.C4339q.m9706k(r8, r0)
                boolean r0 = r7.f9936c0
                r0 = r0 ^ 1
                if (r0 == 0) goto L70
                oi.z r0 = r7.f20510Y     // Catch: java.io.IOException -> L6a
                long r8 = r0.mo4683j0(r8, r9)     // Catch: java.io.IOException -> L6a
                boolean r10 = r7.f9934a0     // Catch: java.io.IOException -> L6a
                if (r10 == 0) goto L26
                r10 = 0
                r7.f9934a0 = r10     // Catch: java.io.IOException -> L6a
                fi.b r10 = r7.f9938e0     // Catch: java.io.IOException -> L6a
                bi.s r0 = r10.f9925d     // Catch: java.io.IOException -> L6a
                fi.c r10 = r10.f9924c     // Catch: java.io.IOException -> L6a
                java.util.Objects.requireNonNull(r0)     // Catch: java.io.IOException -> L6a
                java.lang.String r0 = "call"
                p214m2.C4339q.m9706k(r10, r0)     // Catch: java.io.IOException -> L6a
            L26:
                r10 = 0
                r0 = -1
                int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r2 != 0) goto L31
                r7.m5750a(r10)     // Catch: java.io.IOException -> L6a
                return r0
            L31:
                long r2 = r7.f9933Z     // Catch: java.io.IOException -> L6a
                long r2 = r2 + r8
                long r4 = r7.f9937d0     // Catch: java.io.IOException -> L6a
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 == 0) goto L60
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L3f
                goto L60
            L3f:
                java.net.ProtocolException r8 = new java.net.ProtocolException     // Catch: java.io.IOException -> L6a
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L6a
                r9.<init>()     // Catch: java.io.IOException -> L6a
                java.lang.String r10 = "expected "
                r9.append(r10)     // Catch: java.io.IOException -> L6a
                long r0 = r7.f9937d0     // Catch: java.io.IOException -> L6a
                r9.append(r0)     // Catch: java.io.IOException -> L6a
                java.lang.String r10 = " bytes but received "
                r9.append(r10)     // Catch: java.io.IOException -> L6a
                r9.append(r2)     // Catch: java.io.IOException -> L6a
                java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> L6a
                r8.<init>(r9)     // Catch: java.io.IOException -> L6a
                throw r8     // Catch: java.io.IOException -> L6a
            L60:
                r7.f9933Z = r2     // Catch: java.io.IOException -> L6a
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L69
                r7.m5750a(r10)     // Catch: java.io.IOException -> L6a
            L69:
                return r8
            L6a:
                r8 = move-exception
                java.io.IOException r8 = r7.m5750a(r8)
                throw r8
            L70:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
        }
    }

    public C2180b(fi.C2181c r2, bi.AbstractC0799s r3, p453zb.C7273e r4, gi.InterfaceC2394d r5) {
            r1 = this;
            java.lang.String r0 = "eventListener"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f9924c = r2
            r1.f9925d = r3
            r1.f9926e = r4
            r1.f9927f = r5
            fi.g r2 = r5.mo6144h()
            r1.f9923b = r2
            return
    }

    /* renamed from: a */
    public final <E extends java.io.IOException> E m5743a(long r2, boolean r4, boolean r5, E r6) {
            r1 = this;
            if (r6 == 0) goto L5
            r1.m5747e(r6)
        L5:
            java.lang.String r2 = "call"
            if (r5 == 0) goto L19
            bi.s r3 = r1.f9925d
            fi.c r0 = r1.f9924c
            if (r6 == 0) goto L13
            r3.m2421a(r0, r6)
            goto L19
        L13:
            java.util.Objects.requireNonNull(r3)
            p214m2.C4339q.m9706k(r0, r2)
        L19:
            if (r4 == 0) goto L2f
            if (r6 == 0) goto L25
            bi.s r2 = r1.f9925d
            fi.c r3 = r1.f9924c
            r2.m2422b(r3, r6)
            goto L2f
        L25:
            bi.s r3 = r1.f9925d
            fi.c r0 = r1.f9924c
            java.util.Objects.requireNonNull(r3)
            p214m2.C4339q.m9706k(r0, r2)
        L2f:
            fi.c r2 = r1.f9924c
            java.io.IOException r2 = r2.m5757g(r1, r5, r4, r6)
            return r2
    }

    /* renamed from: b */
    public final p260oi.InterfaceC5302x m5744b(bi.C0775c0 r4, boolean r5) {
            r3 = this;
            r3.f9922a = r5
            bi.f0 r5 = r4.f4197e
            p214m2.C4339q.m9704i(r5)
            long r0 = r5.mo2371a()
            bi.s r5 = r3.f9925d
            fi.c r2 = r3.f9924c
            java.util.Objects.requireNonNull(r5)
            java.lang.String r5 = "call"
            p214m2.C4339q.m9706k(r2, r5)
            gi.d r5 = r3.f9927f
            oi.x r4 = r5.mo6138b(r4, r0)
            fi.b$a r5 = new fi.b$a
            r5.<init>(r3, r4, r0)
            return r5
    }

    /* renamed from: c */
    public final bi.C0783g0.a m5745c(boolean r3) {
            r2 = this;
            gi.d r0 = r2.f9927f     // Catch: java.io.IOException -> L10
            bi.g0$a r3 = r0.mo6143g(r3)     // Catch: java.io.IOException -> L10
            if (r3 == 0) goto Lf
            java.lang.String r0 = "deferredTrailers"
            p214m2.C4339q.m9706k(r2, r0)     // Catch: java.io.IOException -> L10
            r3.f4250m = r2     // Catch: java.io.IOException -> L10
        Lf:
            return r3
        L10:
            r3 = move-exception
            bi.s r0 = r2.f9925d
            fi.c r1 = r2.f9924c
            r0.m2422b(r1, r3)
            r2.m5747e(r3)
            throw r3
    }

    /* renamed from: d */
    public final void m5746d() {
            r2 = this;
            bi.s r0 = r2.f9925d
            fi.c r1 = r2.f9924c
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = "call"
            p214m2.C4339q.m9706k(r1, r0)
            return
    }

    /* renamed from: e */
    public final void m5747e(java.io.IOException r6) {
            r5 = this;
            zb.e r0 = r5.f9926e
            r0.m14385e(r6)
            gi.d r0 = r5.f9927f
            fi.g r0 = r0.mo6144h()
            fi.c r1 = r5.f9924c
            monitor-enter(r0)
            java.lang.String r2 = "call"
            p214m2.C4339q.m9706k(r1, r2)     // Catch: java.lang.Throwable -> L56
            boolean r2 = r6 instanceof p154ii.C3194u     // Catch: java.lang.Throwable -> L56
            r3 = 1
            if (r2 == 0) goto L38
            r2 = r6
            ii.u r2 = (p154ii.C3194u) r2     // Catch: java.lang.Throwable -> L56
            ii.b r2 = r2.f12854Y     // Catch: java.lang.Throwable -> L56
            ii.b r4 = p154ii.EnumC3175b.f12677d0     // Catch: java.lang.Throwable -> L56
            if (r2 != r4) goto L2b
            int r6 = r0.f9978m     // Catch: java.lang.Throwable -> L56
            int r6 = r6 + r3
            r0.f9978m = r6     // Catch: java.lang.Throwable -> L56
            if (r6 <= r3) goto L54
        L28:
            r0.f9974i = r3     // Catch: java.lang.Throwable -> L56
            goto L4f
        L2b:
            ii.u r6 = (p154ii.C3194u) r6     // Catch: java.lang.Throwable -> L56
            ii.b r6 = r6.f12854Y     // Catch: java.lang.Throwable -> L56
            ii.b r2 = p154ii.EnumC3175b.f12678e0     // Catch: java.lang.Throwable -> L56
            if (r6 != r2) goto L28
            boolean r6 = r1.f9951k0     // Catch: java.lang.Throwable -> L56
            if (r6 == 0) goto L28
            goto L54
        L38:
            boolean r2 = r0.m5770i()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L42
            boolean r2 = r6 instanceof p154ii.C3174a     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L54
        L42:
            r0.f9974i = r3     // Catch: java.lang.Throwable -> L56
            int r2 = r0.f9977l     // Catch: java.lang.Throwable -> L56
            if (r2 != 0) goto L54
            bi.a0 r1 = r1.f9954n0     // Catch: java.lang.Throwable -> L56
            bi.j0 r2 = r0.f9982q     // Catch: java.lang.Throwable -> L56
            r0.m5765d(r1, r2, r6)     // Catch: java.lang.Throwable -> L56
        L4f:
            int r6 = r0.f9976k     // Catch: java.lang.Throwable -> L56
            int r6 = r6 + r3
            r0.f9976k = r6     // Catch: java.lang.Throwable -> L56
        L54:
            monitor-exit(r0)
            return
        L56:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }
}
