package bi;

/* renamed from: bi.l */
/* loaded from: classes.dex */
public final class C0792l {

    /* renamed from: e */
    public static final bi.C0792l f4297e = null;

    /* renamed from: f */
    public static final bi.C0792l f4298f = null;

    /* renamed from: a */
    public final boolean f4299a;

    /* renamed from: b */
    public final boolean f4300b;

    /* renamed from: c */
    public final java.lang.String[] f4301c;

    /* renamed from: d */
    public final java.lang.String[] f4302d;

    /* renamed from: bi.l$a */
    public static final class a {

        /* renamed from: a */
        public boolean f4303a;

        /* renamed from: b */
        public java.lang.String[] f4304b;

        /* renamed from: c */
        public java.lang.String[] f4305c;

        /* renamed from: d */
        public boolean f4306d;

        public a(bi.C0792l r2) {
                r1 = this;
                r1.<init>()
                boolean r0 = r2.f4299a
                r1.f4303a = r0
                java.lang.String[] r0 = r2.f4301c
                r1.f4304b = r0
                java.lang.String[] r0 = r2.f4302d
                r1.f4305c = r0
                boolean r2 = r2.f4300b
                r1.f4306d = r2
                return
        }

        public a(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.f4303a = r1
                return
        }

        /* renamed from: a */
        public final bi.C0792l m2406a() {
                r5 = this;
                bi.l r0 = new bi.l
                boolean r1 = r5.f4303a
                boolean r2 = r5.f4306d
                java.lang.String[] r3 = r5.f4304b
                java.lang.String[] r4 = r5.f4305c
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        /* renamed from: b */
        public final bi.C0792l.a m2407b(bi.C0788j... r6) {
                r5 = this;
                java.lang.String r0 = "cipherSuites"
                p214m2.C4339q.m9706k(r6, r0)
                boolean r0 = r5.f4303a
                if (r0 == 0) goto L36
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.length
                r0.<init>(r1)
                int r1 = r6.length
                r2 = 0
                r3 = 0
            L12:
                if (r3 >= r1) goto L1e
                r4 = r6[r3]
                java.lang.String r4 = r4.f4285a
                r0.add(r4)
                int r3 = r3 + 1
                goto L12
            L1e:
                java.lang.String[] r6 = new java.lang.String[r2]
                java.lang.Object[] r6 = r0.toArray(r6)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r6, r0)
                java.lang.String[] r6 = (java.lang.String[]) r6
                int r0 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
                java.lang.String[] r6 = (java.lang.String[]) r6
                r5.m2408c(r6)
                return r5
            L36:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no cipher suites for cleartext connections"
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
        }

        /* renamed from: c */
        public final bi.C0792l.a m2408c(java.lang.String... r3) {
                r2 = this;
                java.lang.String r0 = "cipherSuites"
                p214m2.C4339q.m9706k(r3, r0)
                boolean r0 = r2.f4303a
                if (r0 == 0) goto L2d
                int r0 = r3.length
                r1 = 1
                if (r0 != 0) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                r0 = r0 ^ r1
                if (r0 == 0) goto L21
                java.lang.Object r3 = r3.clone()
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.String>"
                java.util.Objects.requireNonNull(r3, r0)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r2.f4304b = r3
                return r2
            L21:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "At least one cipher suite is required"
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
            L2d:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no cipher suites for cleartext connections"
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        /* renamed from: d */
        public final bi.C0792l.a m2409d(boolean r2) {
                r1 = this;
                boolean r0 = r1.f4303a
                if (r0 == 0) goto L7
                r1.f4306d = r2
                return r1
            L7:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no TLS extensions for cleartext connections"
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }

        /* renamed from: e */
        public final bi.C0792l.a m2410e(bi.EnumC0791k0... r6) {
                r5 = this;
                boolean r0 = r5.f4303a
                if (r0 == 0) goto L31
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.length
                r0.<init>(r1)
                int r1 = r6.length
                r2 = 0
                r3 = 0
            Ld:
                if (r3 >= r1) goto L19
                r4 = r6[r3]
                java.lang.String r4 = r4.f4296Y
                r0.add(r4)
                int r3 = r3 + 1
                goto Ld
            L19:
                java.lang.String[] r6 = new java.lang.String[r2]
                java.lang.Object[] r6 = r0.toArray(r6)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r6, r0)
                java.lang.String[] r6 = (java.lang.String[]) r6
                int r0 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
                java.lang.String[] r6 = (java.lang.String[]) r6
                r5.m2411f(r6)
                return r5
            L31:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no TLS versions for cleartext connections"
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
        }

        /* renamed from: f */
        public final bi.C0792l.a m2411f(java.lang.String... r3) {
                r2 = this;
                java.lang.String r0 = "tlsVersions"
                p214m2.C4339q.m9706k(r3, r0)
                boolean r0 = r2.f4303a
                if (r0 == 0) goto L2d
                int r0 = r3.length
                r1 = 1
                if (r0 != 0) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                r0 = r0 ^ r1
                if (r0 == 0) goto L21
                java.lang.Object r3 = r3.clone()
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.String>"
                java.util.Objects.requireNonNull(r3, r0)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r2.f4305c = r3
                return r2
            L21:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "At least one TLS version is required"
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
            L2d:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no TLS versions for cleartext connections"
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }
    }

    static {
            r0 = 9
            bi.j[] r1 = new bi.C0788j[r0]
            bi.j r2 = bi.C0788j.f4281q
            r3 = 0
            r1[r3] = r2
            bi.j r4 = bi.C0788j.f4282r
            r5 = 1
            r1[r5] = r4
            bi.j r6 = bi.C0788j.f4283s
            r7 = 2
            r1[r7] = r6
            bi.j r8 = bi.C0788j.f4275k
            r9 = 3
            r1[r9] = r8
            bi.j r10 = bi.C0788j.f4277m
            r11 = 4
            r1[r11] = r10
            bi.j r12 = bi.C0788j.f4276l
            r13 = 5
            r1[r13] = r12
            bi.j r14 = bi.C0788j.f4278n
            r15 = 6
            r1[r15] = r14
            bi.j r16 = bi.C0788j.f4280p
            r17 = 7
            r1[r17] = r16
            bi.j r18 = bi.C0788j.f4279o
            r19 = 8
            r1[r19] = r18
            r0 = 16
            bi.j[] r15 = new bi.C0788j[r0]
            r15[r3] = r2
            r15[r5] = r4
            r15[r7] = r6
            r15[r9] = r8
            r15[r11] = r10
            r15[r13] = r12
            r2 = 6
            r15[r2] = r14
            r15[r17] = r16
            r15[r19] = r18
            bi.j r2 = bi.C0788j.f4273i
            r4 = 9
            r15[r4] = r2
            bi.j r2 = bi.C0788j.f4274j
            r4 = 10
            r15[r4] = r2
            bi.j r2 = bi.C0788j.f4271g
            r4 = 11
            r15[r4] = r2
            bi.j r2 = bi.C0788j.f4272h
            r4 = 12
            r15[r4] = r2
            bi.j r2 = bi.C0788j.f4269e
            r4 = 13
            r15[r4] = r2
            bi.j r2 = bi.C0788j.f4270f
            r4 = 14
            r15[r4] = r2
            bi.j r2 = bi.C0788j.f4268d
            r4 = 15
            r15[r4] = r2
            bi.l$a r2 = new bi.l$a
            r2.<init>(r5)
            r4 = 9
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
            bi.j[] r1 = (bi.C0788j[]) r1
            r2.m2407b(r1)
            bi.k0[] r1 = new bi.EnumC0791k0[r7]
            bi.k0 r4 = bi.EnumC0791k0.f4289Z
            r1[r3] = r4
            bi.k0 r6 = bi.EnumC0791k0.f4290a0
            r1[r5] = r6
            r2.m2410e(r1)
            r2.m2409d(r5)
            r2.m2406a()
            bi.l$a r1 = new bi.l$a
            r1.<init>(r5)
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r15, r0)
            bi.j[] r2 = (bi.C0788j[]) r2
            r1.m2407b(r2)
            bi.k0[] r2 = new bi.EnumC0791k0[r7]
            r2[r3] = r4
            r2[r5] = r6
            r1.m2410e(r2)
            r1.m2409d(r5)
            bi.l r1 = r1.m2406a()
            bi.C0792l.f4297e = r1
            bi.l$a r1 = new bi.l$a
            r1.<init>(r5)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r15, r0)
            bi.j[] r0 = (bi.C0788j[]) r0
            r1.m2407b(r0)
            bi.k0[] r0 = new bi.EnumC0791k0[r11]
            r0[r3] = r4
            r0[r5] = r6
            bi.k0 r2 = bi.EnumC0791k0.f4291b0
            r0[r7] = r2
            bi.k0 r2 = bi.EnumC0791k0.f4292c0
            r0[r9] = r2
            r1.m2410e(r0)
            r1.m2409d(r5)
            r1.m2406a()
            bi.l r0 = new bi.l
            r1 = 0
            r0.<init>(r3, r3, r1, r1)
            bi.C0792l.f4298f = r0
            return
    }

    public C0792l(boolean r1, boolean r2, java.lang.String[] r3, java.lang.String[] r4) {
            r0 = this;
            r0.<init>()
            r0.f4299a = r1
            r0.f4300b = r2
            r0.f4301c = r3
            r0.f4302d = r4
            return
    }

    /* renamed from: a */
    public final java.util.List<bi.C0788j> m2403a() {
            r6 = this;
            java.lang.String[] r0 = r6.f4301c
            if (r0 == 0) goto L21
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1c
            r4 = r0[r3]
            bi.j$b r5 = bi.C0788j.f4284t
            bi.j r4 = r5.m2399b(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto Lc
        L1c:
            java.util.List r0 = p062dh.C1473i.m4007S(r1)
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }

    /* renamed from: b */
    public final boolean m2404b(javax.net.ssl.SSLSocket r5) {
            r4 = this;
            java.lang.String r0 = "socket"
            p214m2.C4339q.m9706k(r5, r0)
            boolean r0 = r4.f4299a
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.lang.String[] r0 = r4.f4302d
            if (r0 == 0) goto L1c
            java.lang.String[] r2 = r5.getEnabledProtocols()
            eh.b r3 = p079eh.C1851b.f8035Y
            boolean r0 = ci.C0988c.m2704i(r0, r2, r3)
            if (r0 != 0) goto L1c
            return r1
        L1c:
            java.lang.String[] r0 = r4.f4301c
            if (r0 == 0) goto L31
            java.lang.String[] r5 = r5.getEnabledCipherSuites()
            bi.j$b r2 = bi.C0788j.f4284t
            java.util.Comparator<java.lang.String> r2 = bi.C0788j.f4266b
            java.util.Comparator<java.lang.String> r2 = bi.C0788j.f4266b
            boolean r5 = ci.C0988c.m2704i(r0, r5, r2)
            if (r5 != 0) goto L31
            return r1
        L31:
            r5 = 1
            return r5
    }

    /* renamed from: c */
    public final java.util.List<bi.EnumC0791k0> m2405c() {
            r6 = this;
            java.lang.String[] r0 = r6.f4302d
            if (r0 == 0) goto L21
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1c
            r4 = r0[r3]
            bi.k0$a r5 = bi.EnumC0791k0.f4295f0
            bi.k0 r4 = r5.m2402a(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto Lc
        L1c:
            java.util.List r0 = p062dh.C1473i.m4007S(r1)
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof bi.C0792l
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r4) goto La
            return r0
        La:
            boolean r2 = r4.f4299a
            bi.l r5 = (bi.C0792l) r5
            boolean r3 = r5.f4299a
            if (r2 == r3) goto L13
            return r1
        L13:
            if (r2 == 0) goto L32
            java.lang.String[] r2 = r4.f4301c
            java.lang.String[] r3 = r5.f4301c
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            java.lang.String[] r2 = r4.f4302d
            java.lang.String[] r3 = r5.f4302d
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            boolean r2 = r4.f4300b
            boolean r5 = r5.f4300b
            if (r2 == r5) goto L32
            return r1
        L32:
            return r0
    }

    public int hashCode() {
            r3 = this;
            boolean r0 = r3.f4299a
            if (r0 == 0) goto L25
            r0 = 527(0x20f, float:7.38E-43)
            java.lang.String[] r1 = r3.f4301c
            r2 = 0
            if (r1 == 0) goto L10
            int r1 = java.util.Arrays.hashCode(r1)
            goto L11
        L10:
            r1 = 0
        L11:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String[] r1 = r3.f4302d
            if (r1 == 0) goto L1c
            int r2 = java.util.Arrays.hashCode(r1)
        L1c:
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r1 = r3.f4300b
            r1 = r1 ^ 1
            int r0 = r0 + r1
            goto L27
        L25:
            r0 = 17
        L27:
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            boolean r0 = r4.f4299a
            if (r0 != 0) goto L7
            java.lang.String r0 = "ConnectionSpec()"
            return r0
        L7:
            java.lang.String r0 = "ConnectionSpec("
            java.lang.String r1 = "cipherSuites="
            java.lang.StringBuilder r0 = android.support.v4.media.C0143b.m255a(r0, r1)
            java.util.List r1 = r4.m2403a()
            java.lang.String r2 = "[all enabled]"
            java.lang.String r1 = java.util.Objects.toString(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r3 = "tlsVersions="
            r0.append(r3)
            java.util.List r3 = r4.m2405c()
            java.lang.String r2 = java.util.Objects.toString(r3, r2)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "supportsTlsExtensions="
            r0.append(r1)
            boolean r1 = r4.f4300b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
