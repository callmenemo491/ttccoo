package p063di;

/* renamed from: di.a */
/* loaded from: classes.dex */
public final class C1481a implements bi.InterfaceC0804x {

    /* renamed from: a */
    public static final p063di.C1481a.a f7240a = null;

    /* renamed from: di.a$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public static final bi.C0783g0 m4018a(p063di.C1481a.a r19, bi.C0783g0 r20) {
                r0 = r20
                if (r0 == 0) goto L7
                bi.h0 r1 = r0.f4231e0
                goto L8
            L7:
                r1 = 0
            L8:
                if (r1 == 0) goto L81
                java.util.Objects.requireNonNull(r20)
                bi.c0 r3 = r0.f4225Y
                bi.b0 r4 = r0.f4226Z
                int r6 = r0.f4228b0
                java.lang.String r5 = r0.f4227a0
                bi.u r7 = r0.f4229c0
                bi.v r1 = r0.f4230d0
                bi.v$a r1 = r1.m2430h()
                bi.g0 r10 = r0.f4232f0
                bi.g0 r11 = r0.f4233g0
                bi.g0 r12 = r0.f4234h0
                long r13 = r0.f4235i0
                long r8 = r0.f4236j0
                fi.b r0 = r0.f4237k0
                r15 = 0
                if (r6 < 0) goto L2e
                r2 = 1
                goto L2f
            L2e:
                r2 = 0
            L2f:
                if (r2 == 0) goto L71
                if (r3 == 0) goto L65
                if (r4 == 0) goto L59
                if (r5 == 0) goto L4d
                bi.v r1 = r1.m2434c()
                bi.g0 r18 = new bi.g0
                r2 = r18
                r16 = r8
                r8 = r1
                r9 = r15
                r15 = r16
                r17 = r0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17)
                r0 = r18
                goto L81
            L4d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "message == null"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L59:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "protocol == null"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L65:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "request == null"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L71:
                java.lang.String r0 = "code < 0: "
                java.lang.String r0 = android.support.v4.media.C0142a.m254a(r0, r6)
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L81:
                return r0
        }

        /* renamed from: b */
        public final boolean m4019b(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "Content-Length"
                r1 = 1
                boolean r0 = p362uh.C6463i.m13053J(r0, r3, r1)
                if (r0 != 0) goto L1b
                java.lang.String r0 = "Content-Encoding"
                boolean r0 = p362uh.C6463i.m13053J(r0, r3, r1)
                if (r0 != 0) goto L1b
                java.lang.String r0 = "Content-Type"
                boolean r3 = p362uh.C6463i.m13053J(r0, r3, r1)
                if (r3 == 0) goto L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                return r1
        }

        /* renamed from: c */
        public final boolean m4020c(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "Connection"
                r1 = 1
                boolean r0 = p362uh.C6463i.m13053J(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Keep-Alive"
                boolean r0 = p362uh.C6463i.m13053J(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Proxy-Authenticate"
                boolean r0 = p362uh.C6463i.m13053J(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Proxy-Authorization"
                boolean r0 = p362uh.C6463i.m13053J(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "TE"
                boolean r0 = p362uh.C6463i.m13053J(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Trailers"
                boolean r0 = p362uh.C6463i.m13053J(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Transfer-Encoding"
                boolean r0 = p362uh.C6463i.m13053J(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Upgrade"
                boolean r3 = p362uh.C6463i.m13053J(r0, r3, r1)
                if (r3 != 0) goto L42
                goto L43
            L42:
                r1 = 0
            L43:
                return r1
        }
    }

    static {
            di.a$a r0 = new di.a$a
            r1 = 0
            r0.<init>(r1)
            p063di.C1481a.f7240a = r0
            return
    }

    public C1481a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // bi.InterfaceC0804x
    /* renamed from: a */
    public bi.C0783g0 mo2456a(bi.InterfaceC0804x.a r18) {
            r17 = this;
            r0 = r18
            gi.g r0 = (gi.C2397g) r0
            fi.c r1 = r0.f10782b
            java.lang.System.currentTimeMillis()
            bi.c0 r2 = r0.f10786f
            java.lang.String r3 = "request"
            p214m2.C4339q.m9706k(r2, r3)
            di.b r3 = new di.b
            r4 = 0
            r3.<init>(r2, r4)
            bi.e r2 = r2.m2363a()
            boolean r2 = r2.f4216j
            if (r2 == 0) goto L23
            di.b r3 = new di.b
            r3.<init>(r4, r4)
        L23:
            bi.c0 r2 = r3.f7241a
            bi.g0 r3 = r3.f7242b
            boolean r5 = r1 instanceof fi.C2181c
            java.lang.String r5 = "call"
            if (r2 != 0) goto L5d
            if (r3 != 0) goto L5d
            bi.g0$a r2 = new bi.g0$a
            r2.<init>()
            bi.c0 r0 = r0.f10786f
            r2.m2388g(r0)
            bi.b0 r0 = bi.EnumC0773b0.f4185a0
            r2.m2387f(r0)
            r0 = 504(0x1f8, float:7.06E-43)
            r2.f4240c = r0
            java.lang.String r0 = "Unsatisfiable Request (only-if-cached)"
            r2.m2386e(r0)
            bi.h0 r0 = ci.C0988c.f5067c
            r2.f4244g = r0
            r3 = -1
            r2.f4248k = r3
            long r3 = java.lang.System.currentTimeMillis()
            r2.f4249l = r3
            bi.g0 r0 = r2.m2382a()
            p214m2.C4339q.m9706k(r1, r5)
            return r0
        L5d:
            if (r2 != 0) goto L78
            p214m2.C4339q.m9704i(r3)
            bi.g0$a r0 = new bi.g0$a
            r0.<init>(r3)
            di.a$a r2 = p063di.C1481a.f7240a
            bi.g0 r2 = p063di.C1481a.a.m4018a(r2, r3)
            r0.m2383b(r2)
            bi.g0 r0 = r0.m2382a()
            p214m2.C4339q.m9706k(r1, r5)
            return r0
        L78:
            if (r3 == 0) goto L7d
            p214m2.C4339q.m9706k(r1, r5)
        L7d:
            r0 = r18
            gi.g r0 = (gi.C2397g) r0     // Catch: java.lang.Throwable -> L191
            bi.g0 r0 = r0.m6150c(r2)     // Catch: java.lang.Throwable -> L191
            java.lang.String r1 = "networkResponse"
            if (r3 == 0) goto L175
            int r2 = r0.f4228b0
            r5 = 304(0x130, float:4.26E-43)
            if (r2 != r5) goto L16e
            bi.g0$a r2 = new bi.g0$a
            r2.<init>(r3)
            di.a$a r5 = p063di.C1481a.f7240a
            bi.v r6 = r3.f4230d0
            bi.v r7 = r0.f4230d0
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 20
            r8.<init>(r9)
            int r9 = r6.size()
            r11 = 0
        La6:
            java.lang.String r12 = "value"
            java.lang.String r13 = "name"
            if (r11 >= r9) goto Lf8
            java.lang.String r14 = r6.m2429e(r11)
            java.lang.String r15 = r6.m2431i(r11)
            java.lang.String r4 = "Warning"
            r10 = 1
            boolean r4 = p362uh.C6463i.m13053J(r4, r14, r10)
            if (r4 == 0) goto Lca
            r4 = 2
            java.lang.String r10 = "1"
            r16 = r6
            r6 = 0
            boolean r4 = p362uh.C6463i.m13061R(r15, r10, r6, r4)
            if (r4 == 0) goto Lcc
            goto Lf2
        Lca:
            r16 = r6
        Lcc:
            boolean r4 = r5.m4019b(r14)
            if (r4 != 0) goto Lde
            boolean r4 = r5.m4020c(r14)
            if (r4 == 0) goto Lde
            java.lang.String r4 = r7.m2428a(r14)
            if (r4 != 0) goto Lf2
        Lde:
            p214m2.C4339q.m9706k(r14, r13)
            p214m2.C4339q.m9706k(r15, r12)
            r8.add(r14)
            java.lang.CharSequence r4 = p362uh.C6467m.m13083n0(r15)
            java.lang.String r4 = r4.toString()
            r8.add(r4)
        Lf2:
            int r11 = r11 + 1
            r6 = r16
            r4 = 0
            goto La6
        Lf8:
            int r4 = r7.size()
            r6 = 0
        Lfd:
            if (r6 >= r4) goto L12a
            java.lang.String r9 = r7.m2429e(r6)
            boolean r10 = r5.m4019b(r9)
            if (r10 != 0) goto L127
            boolean r10 = r5.m4020c(r9)
            if (r10 == 0) goto L127
            java.lang.String r10 = r7.m2431i(r6)
            p214m2.C4339q.m9706k(r9, r13)
            p214m2.C4339q.m9706k(r10, r12)
            r8.add(r9)
            java.lang.CharSequence r9 = p362uh.C6467m.m13083n0(r10)
            java.lang.String r9 = r9.toString()
            r8.add(r9)
        L127:
            int r6 = r6 + 1
            goto Lfd
        L12a:
            bi.v r4 = new bi.v
            r5 = 0
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r5 = r8.toArray(r5)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r5, r6)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r6 = 0
            r4.<init>(r5, r6)
            r2.m2385d(r4)
            long r4 = r0.f4235i0
            r2.f4248k = r4
            long r4 = r0.f4236j0
            r2.f4249l = r4
            di.a$a r4 = p063di.C1481a.f7240a
            bi.g0 r3 = p063di.C1481a.a.m4018a(r4, r3)
            r2.m2383b(r3)
            bi.g0 r3 = p063di.C1481a.a.m4018a(r4, r0)
            r2.m2384c(r1, r3)
            r2.f4245h = r3
            r2.m2382a()
            bi.h0 r0 = r0.f4231e0
            p214m2.C4339q.m9704i(r0)
            r0.close()
            r0 = 0
            p214m2.C4339q.m9704i(r0)
            r0.m2370a()
            throw r0
        L16e:
            bi.h0 r2 = r3.f4231e0
            if (r2 == 0) goto L175
            ci.C0988c.m2698c(r2)
        L175:
            bi.g0$a r2 = new bi.g0$a
            r2.<init>(r0)
            di.a$a r4 = p063di.C1481a.f7240a
            bi.g0 r3 = p063di.C1481a.a.m4018a(r4, r3)
            r2.m2383b(r3)
            bi.g0 r0 = p063di.C1481a.a.m4018a(r4, r0)
            r2.m2384c(r1, r0)
            r2.f4245h = r0
            bi.g0 r0 = r2.m2382a()
            return r0
        L191:
            r0 = move-exception
            throw r0
    }
}
