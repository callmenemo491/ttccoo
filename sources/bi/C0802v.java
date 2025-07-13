package bi;

/* renamed from: bi.v */
/* loaded from: classes.dex */
public final class C0802v implements java.lang.Iterable<ch.C0978e<? extends java.lang.String, ? extends java.lang.String>>, p259oh.InterfaceC5277a {

    /* renamed from: Z */
    public static final bi.C0802v.b f4340Z = null;

    /* renamed from: Y */
    public final java.lang.String[] f4341Y;

    /* renamed from: bi.v$a */
    public static final class a {

        /* renamed from: a */
        public final java.util.List<java.lang.String> f4342a;

        public a() {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 20
                r0.<init>(r1)
                r2.f4342a = r0
                return
        }

        /* renamed from: a */
        public final bi.C0802v.a m2432a(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "value"
                p214m2.C4339q.m9706k(r3, r0)
                bi.v$b r0 = bi.C0802v.f4340Z
                r0.m2436a(r2)
                r0.m2437b(r3, r2)
                r1.m2433b(r2, r3)
                return r1
        }

        /* renamed from: b */
        public final bi.C0802v.a m2433b(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "value"
                p214m2.C4339q.m9706k(r3, r0)
                java.util.List<java.lang.String> r0 = r1.f4342a
                r0.add(r2)
                java.util.List<java.lang.String> r2 = r1.f4342a
                java.lang.CharSequence r3 = p362uh.C6467m.m13083n0(r3)
                java.lang.String r3 = r3.toString()
                r2.add(r3)
                return r1
        }

        /* renamed from: c */
        public final bi.C0802v m2434c() {
                r3 = this;
                bi.v r0 = new bi.v
                java.util.List<java.lang.String> r1 = r3.f4342a
                r2 = 0
                java.lang.String[] r2 = new java.lang.String[r2]
                java.lang.Object[] r1 = r1.toArray(r2)
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r1, r2)
                java.lang.String[] r1 = (java.lang.String[]) r1
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        /* renamed from: d */
        public final bi.C0802v.a m2435d(java.lang.String r4) {
                r3 = this;
                r0 = 0
            L1:
                java.util.List<java.lang.String> r1 = r3.f4342a
                int r1 = r1.size()
                if (r0 >= r1) goto L27
                java.util.List<java.lang.String> r1 = r3.f4342a
                java.lang.Object r1 = r1.get(r0)
                java.lang.String r1 = (java.lang.String) r1
                r2 = 1
                boolean r1 = p362uh.C6463i.m13053J(r4, r1, r2)
                if (r1 == 0) goto L24
                java.util.List<java.lang.String> r1 = r3.f4342a
                r1.remove(r0)
                java.util.List<java.lang.String> r1 = r3.f4342a
                r1.remove(r0)
                int r0 = r0 + (-2)
            L24:
                int r0 = r0 + 2
                goto L1
            L27:
                return r3
        }
    }

    /* renamed from: bi.v$b */
    public static final class b {
        public b(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public final void m2436a(java.lang.String r8) {
                r7 = this;
                int r0 = r8.length()
                r1 = 1
                r2 = 0
                if (r0 <= 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L4c
                int r0 = r8.length()
                r3 = 0
            L12:
                if (r3 >= r0) goto L4b
                char r4 = r8.charAt(r3)
                r5 = 126(0x7e, float:1.77E-43)
                r6 = 33
                if (r6 <= r4) goto L1f
                goto L23
            L1f:
                if (r5 < r4) goto L23
                r5 = 1
                goto L24
            L23:
                r5 = 0
            L24:
                if (r5 == 0) goto L29
                int r3 = r3 + 1
                goto L12
            L29:
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r0[r2] = r4
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                r0[r1] = r2
                r1 = 2
                r0[r1] = r8
                java.lang.String r8 = "Unexpected char %#04x at %d in header name: %s"
                java.lang.String r8 = ci.C0988c.m2703h(r8, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r0.<init>(r8)
                throw r0
            L4b:
                return
            L4c:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "name is empty"
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
        }

        /* renamed from: b */
        public final void m2437b(java.lang.String r8, java.lang.String r9) {
                r7 = this;
                int r0 = r8.length()
                r1 = 0
                r2 = 0
            L6:
                if (r2 >= r0) goto L48
                char r3 = r8.charAt(r2)
                r4 = 9
                r5 = 1
                if (r3 == r4) goto L1d
                r4 = 126(0x7e, float:1.77E-43)
                r6 = 32
                if (r6 <= r3) goto L18
                goto L1b
            L18:
                if (r4 < r3) goto L1b
                goto L1d
            L1b:
                r4 = 0
                goto L1e
            L1d:
                r4 = 1
            L1e:
                if (r4 == 0) goto L23
                int r2 = r2 + 1
                goto L6
            L23:
                r0 = 4
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0[r5] = r1
                r1 = 2
                r0[r1] = r9
                r9 = 3
                r0[r9] = r8
                java.lang.String r8 = "Unexpected char %#04x at %d in %s value: %s"
                java.lang.String r8 = ci.C0988c.m2703h(r8, r0)
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
            L48:
                return
        }

        /* renamed from: c */
        public final bi.C0802v m2438c(java.lang.String... r8) {
                r7 = this;
                java.lang.String r0 = "namesAndValues"
                p214m2.C4339q.m9706k(r8, r0)
                int r0 = r8.length
                r1 = 2
                int r0 = r0 % r1
                r2 = 1
                r3 = 0
                if (r0 != 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r0 == 0) goto L76
                java.lang.Object r8 = r8.clone()
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.String>"
                java.util.Objects.requireNonNull(r8, r0)
                java.lang.String[] r8 = (java.lang.String[]) r8
                int r0 = r8.length
                r4 = 0
            L1e:
                if (r4 >= r0) goto L49
                r5 = r8[r4]
                if (r5 == 0) goto L26
                r5 = 1
                goto L27
            L26:
                r5 = 0
            L27:
                if (r5 == 0) goto L3d
                r5 = r8[r4]
                java.lang.String r6 = "null cannot be cast to non-null type kotlin.CharSequence"
                java.util.Objects.requireNonNull(r5, r6)
                java.lang.CharSequence r5 = p362uh.C6467m.m13083n0(r5)
                java.lang.String r5 = r5.toString()
                r8[r4] = r5
                int r4 = r4 + 1
                goto L1e
            L3d:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Headers cannot be null"
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L49:
                int r0 = r8.length
                rh.c r0 = p209lh.C4304a.m9605K(r3, r0)
                rh.a r0 = p209lh.C4304a.m9603I(r0, r1)
                int r1 = r0.f22647Y
                int r2 = r0.f22648Z
                int r0 = r0.f22649a0
                if (r0 < 0) goto L5d
                if (r1 > r2) goto L6f
                goto L5f
            L5d:
                if (r1 < r2) goto L6f
            L5f:
                r3 = r8[r1]
                int r4 = r1 + 1
                r4 = r8[r4]
                r7.m2436a(r3)
                r7.m2437b(r4, r3)
                if (r1 == r2) goto L6f
                int r1 = r1 + r0
                goto L5f
            L6f:
                bi.v r0 = new bi.v
                r1 = 0
                r0.<init>(r8, r1)
                return r0
            L76:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Expected alternating header names and values"
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
        }
    }

    static {
            bi.v$b r0 = new bi.v$b
            r1 = 0
            r0.<init>(r1)
            bi.C0802v.f4340Z = r0
            return
    }

    public C0802v(java.lang.String[] r1, p239nh.C4826f r2) {
            r0 = this;
            r0.<init>()
            r0.f4341Y = r1
            return
    }

    /* renamed from: a */
    public final java.lang.String m2428a(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r7, r0)
            java.lang.String[] r0 = r6.f4341Y
            int r1 = r0.length
            r2 = 2
            int r1 = r1 - r2
            r3 = 0
            rh.a r1 = p209lh.C4304a.m9618l(r1, r3)
            rh.a r1 = p209lh.C4304a.m9603I(r1, r2)
            int r2 = r1.f22647Y
            int r3 = r1.f22648Z
            int r1 = r1.f22649a0
            if (r1 < 0) goto L1e
            if (r2 > r3) goto L31
            goto L20
        L1e:
            if (r2 < r3) goto L31
        L20:
            r4 = r0[r2]
            r5 = 1
            boolean r4 = p362uh.C6463i.m13053J(r7, r4, r5)
            if (r4 == 0) goto L2d
            int r2 = r2 + r5
            r7 = r0[r2]
            goto L32
        L2d:
            if (r2 == r3) goto L31
            int r2 = r2 + r1
            goto L20
        L31:
            r7 = 0
        L32:
            return r7
    }

    /* renamed from: e */
    public final java.lang.String m2429e(int r2) {
            r1 = this;
            java.lang.String[] r0 = r1.f4341Y
            int r2 = r2 * 2
            r2 = r0[r2]
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof bi.C0802v
            if (r0 == 0) goto L12
            java.lang.String[] r0 = r1.f4341Y
            bi.v r2 = (bi.C0802v) r2
            java.lang.String[] r2 = r2.f4341Y
            boolean r2 = java.util.Arrays.equals(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    /* renamed from: h */
    public final bi.C0802v.a m2430h() {
            r4 = this;
            bi.v$a r0 = new bi.v$a
            r0.<init>()
            java.util.List<java.lang.String> r1 = r0.f4342a
            java.lang.String[] r2 = r4.f4341Y
            java.lang.String r3 = "<this>"
            p214m2.C4339q.m9706k(r1, r3)
            java.lang.String r3 = "elements"
            p214m2.C4339q.m9706k(r2, r3)
            java.util.List r2 = p062dh.C1468d.m3982D(r2)
            r1.addAll(r2)
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String[] r0 = r1.f4341Y
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    /* renamed from: i */
    public final java.lang.String m2431i(int r2) {
            r1 = this;
            java.lang.String[] r0 = r1.f4341Y
            int r2 = r2 * 2
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<ch.C0978e<? extends java.lang.String, ? extends java.lang.String>> iterator() {
            r6 = this;
            int r0 = r6.size()
            ch.e[] r1 = new ch.C0978e[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L1b
            java.lang.String r3 = r6.m2429e(r2)
            java.lang.String r4 = r6.m2431i(r2)
            ch.e r5 = new ch.e
            r5.<init>(r3, r4)
            r1[r2] = r5
            int r2 = r2 + 1
            goto L7
        L1b:
            nh.a r0 = new nh.a
            r0.<init>(r1)
            return r0
    }

    public final int size() {
            r1 = this;
            java.lang.String[] r0 = r1.f4341Y
            int r0 = r0.length
            int r0 = r0 / 2
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L27
            java.lang.String r3 = r4.m2429e(r2)
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            java.lang.String r3 = r4.m2431i(r2)
            r0.append(r3)
            java.lang.String r3 = "\n"
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L27:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }
}
