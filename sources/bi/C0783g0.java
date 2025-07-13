package bi;

/* renamed from: bi.g0 */
/* loaded from: classes.dex */
public final class C0783g0 implements java.io.Closeable {

    /* renamed from: Y */
    public final bi.C0775c0 f4225Y;

    /* renamed from: Z */
    public final bi.EnumC0773b0 f4226Z;

    /* renamed from: a0 */
    public final java.lang.String f4227a0;

    /* renamed from: b0 */
    public final int f4228b0;

    /* renamed from: c0 */
    public final bi.C0801u f4229c0;

    /* renamed from: d0 */
    public final bi.C0802v f4230d0;

    /* renamed from: e0 */
    public final bi.AbstractC0785h0 f4231e0;

    /* renamed from: f0 */
    public final bi.C0783g0 f4232f0;

    /* renamed from: g0 */
    public final bi.C0783g0 f4233g0;

    /* renamed from: h0 */
    public final bi.C0783g0 f4234h0;

    /* renamed from: i0 */
    public final long f4235i0;

    /* renamed from: j0 */
    public final long f4236j0;

    /* renamed from: k0 */
    public final fi.C2180b f4237k0;

    /* renamed from: bi.g0$a */
    public static class a {

        /* renamed from: a */
        public bi.C0775c0 f4238a;

        /* renamed from: b */
        public bi.EnumC0773b0 f4239b;

        /* renamed from: c */
        public int f4240c;

        /* renamed from: d */
        public java.lang.String f4241d;

        /* renamed from: e */
        public bi.C0801u f4242e;

        /* renamed from: f */
        public bi.C0802v.a f4243f;

        /* renamed from: g */
        public bi.AbstractC0785h0 f4244g;

        /* renamed from: h */
        public bi.C0783g0 f4245h;

        /* renamed from: i */
        public bi.C0783g0 f4246i;

        /* renamed from: j */
        public bi.C0783g0 f4247j;

        /* renamed from: k */
        public long f4248k;

        /* renamed from: l */
        public long f4249l;

        /* renamed from: m */
        public fi.C2180b f4250m;

        public a() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.f4240c = r0
                bi.v$a r0 = new bi.v$a
                r0.<init>()
                r1.f4243f = r0
                return
        }

        public a(bi.C0783g0 r3) {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.f4240c = r0
                bi.c0 r0 = r3.f4225Y
                r2.f4238a = r0
                bi.b0 r0 = r3.f4226Z
                r2.f4239b = r0
                int r0 = r3.f4228b0
                r2.f4240c = r0
                java.lang.String r0 = r3.f4227a0
                r2.f4241d = r0
                bi.u r0 = r3.f4229c0
                r2.f4242e = r0
                bi.v r0 = r3.f4230d0
                bi.v$a r0 = r0.m2430h()
                r2.f4243f = r0
                bi.h0 r0 = r3.f4231e0
                r2.f4244g = r0
                bi.g0 r0 = r3.f4232f0
                r2.f4245h = r0
                bi.g0 r0 = r3.f4233g0
                r2.f4246i = r0
                bi.g0 r0 = r3.f4234h0
                r2.f4247j = r0
                long r0 = r3.f4235i0
                r2.f4248k = r0
                long r0 = r3.f4236j0
                r2.f4249l = r0
                fi.b r3 = r3.f4237k0
                r2.f4250m = r3
                return
        }

        /* renamed from: a */
        public bi.C0783g0 m2382a() {
                r18 = this;
                r0 = r18
                int r5 = r0.f4240c
                if (r5 < 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                if (r1 == 0) goto L5b
                bi.c0 r2 = r0.f4238a
                if (r2 == 0) goto L4f
                bi.b0 r3 = r0.f4239b
                if (r3 == 0) goto L43
                java.lang.String r4 = r0.f4241d
                if (r4 == 0) goto L37
                bi.u r6 = r0.f4242e
                bi.v$a r1 = r0.f4243f
                bi.v r7 = r1.m2434c()
                bi.h0 r8 = r0.f4244g
                bi.g0 r9 = r0.f4245h
                bi.g0 r10 = r0.f4246i
                bi.g0 r11 = r0.f4247j
                long r12 = r0.f4248k
                long r14 = r0.f4249l
                fi.b r1 = r0.f4250m
                bi.g0 r17 = new bi.g0
                r16 = r1
                r1 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16)
                return r17
            L37:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "message == null"
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L43:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "protocol == null"
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L4f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "request == null"
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L5b:
                java.lang.String r1 = "code < 0: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                int r2 = r0.f4240c
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        /* renamed from: b */
        public bi.C0783g0.a m2383b(bi.C0783g0 r2) {
                r1 = this;
                java.lang.String r0 = "cacheResponse"
                r1.m2384c(r0, r2)
                r1.f4246i = r2
                return r1
        }

        /* renamed from: c */
        public final void m2384c(java.lang.String r3, bi.C0783g0 r4) {
                r2 = this;
                if (r4 == 0) goto L66
                bi.h0 r0 = r4.f4231e0
                r1 = 0
                if (r0 != 0) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                if (r0 == 0) goto L56
                bi.g0 r0 = r4.f4232f0
                if (r0 != 0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                if (r0 == 0) goto L46
                bi.g0 r0 = r4.f4233g0
                if (r0 != 0) goto L1b
                r0 = 1
                goto L1c
            L1b:
                r0 = 0
            L1c:
                if (r0 == 0) goto L36
                bi.g0 r4 = r4.f4234h0
                if (r4 != 0) goto L23
                r1 = 1
            L23:
                if (r1 == 0) goto L26
                goto L66
            L26:
                java.lang.String r4 = ".priorResponse != null"
                java.lang.String r3 = p064e.C1493g.m4049a(r3, r4)
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
            L36:
                java.lang.String r4 = ".cacheResponse != null"
                java.lang.String r3 = p064e.C1493g.m4049a(r3, r4)
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
            L46:
                java.lang.String r4 = ".networkResponse != null"
                java.lang.String r3 = p064e.C1493g.m4049a(r3, r4)
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
            L56:
                java.lang.String r4 = ".body != null"
                java.lang.String r3 = p064e.C1493g.m4049a(r3, r4)
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
            L66:
                return
        }

        /* renamed from: d */
        public bi.C0783g0.a m2385d(bi.C0802v r1) {
                r0 = this;
                bi.v$a r1 = r1.m2430h()
                r0.f4243f = r1
                return r0
        }

        /* renamed from: e */
        public bi.C0783g0.a m2386e(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "message"
                p214m2.C4339q.m9706k(r2, r0)
                r1.f4241d = r2
                return r1
        }

        /* renamed from: f */
        public bi.C0783g0.a m2387f(bi.EnumC0773b0 r2) {
                r1 = this;
                java.lang.String r0 = "protocol"
                p214m2.C4339q.m9706k(r2, r0)
                r1.f4239b = r2
                return r1
        }

        /* renamed from: g */
        public bi.C0783g0.a m2388g(bi.C0775c0 r2) {
                r1 = this;
                java.lang.String r0 = "request"
                p214m2.C4339q.m9706k(r2, r0)
                r1.f4238a = r2
                return r1
        }
    }

    public C0783g0(bi.C0775c0 r7, bi.EnumC0773b0 r8, java.lang.String r9, int r10, bi.C0801u r11, bi.C0802v r12, bi.AbstractC0785h0 r13, bi.C0783g0 r14, bi.C0783g0 r15, bi.C0783g0 r16, long r17, long r19, fi.C2180b r21) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r12
            java.lang.String r5 = "request"
            p214m2.C4339q.m9706k(r7, r5)
            java.lang.String r5 = "protocol"
            p214m2.C4339q.m9706k(r8, r5)
            java.lang.String r5 = "message"
            p214m2.C4339q.m9706k(r9, r5)
            java.lang.String r5 = "headers"
            p214m2.C4339q.m9706k(r12, r5)
            r6.<init>()
            r0.f4225Y = r1
            r0.f4226Z = r2
            r0.f4227a0 = r3
            r1 = r10
            r0.f4228b0 = r1
            r1 = r11
            r0.f4229c0 = r1
            r0.f4230d0 = r4
            r1 = r13
            r0.f4231e0 = r1
            r1 = r14
            r0.f4232f0 = r1
            r1 = r15
            r0.f4233g0 = r1
            r1 = r16
            r0.f4234h0 = r1
            r1 = r17
            r0.f4235i0 = r1
            r1 = r19
            r0.f4236j0 = r1
            r1 = r21
            r0.f4237k0 = r1
            return
    }

    /* renamed from: a */
    public static java.lang.String m2380a(bi.C0783g0 r0, java.lang.String r1, java.lang.String r2, int r3) {
            r2 = 0
            java.util.Objects.requireNonNull(r0)
            bi.v r0 = r0.f4230d0
            java.lang.String r0 = r0.m2428a(r1)
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            return r2
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            bi.h0 r0 = r2.f4231e0
            if (r0 == 0) goto L8
            r0.close()
            return
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "response is not eligible for a body and must not be closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: h */
    public final boolean m2381h() {
            r2 = this;
            int r0 = r2.f4228b0
            r1 = 200(0xc8, float:2.8E-43)
            if (r1 <= r0) goto L7
            goto Ld
        L7:
            r1 = 299(0x12b, float:4.19E-43)
            if (r1 < r0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Response{protocol="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            bi.b0 r1 = r2.f4226Z
            r0.append(r1)
            java.lang.String r1 = ", code="
            r0.append(r1)
            int r1 = r2.f4228b0
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = r2.f4227a0
            r0.append(r1)
            java.lang.String r1 = ", url="
            r0.append(r1)
            bi.c0 r1 = r2.f4225Y
            bi.w r1 = r1.f4194b
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
