package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
public final class C0577a implements androidx.recyclerview.widget.C0615z.a {

    /* renamed from: a */
    public p212m0.InterfaceC4313c<androidx.recyclerview.widget.C0577a.b> f3363a;

    /* renamed from: b */
    public final java.util.ArrayList<androidx.recyclerview.widget.C0577a.b> f3364b;

    /* renamed from: c */
    public final java.util.ArrayList<androidx.recyclerview.widget.C0577a.b> f3365c;

    /* renamed from: d */
    public final androidx.recyclerview.widget.C0577a.a f3366d;

    /* renamed from: e */
    public final androidx.recyclerview.widget.C0615z f3367e;

    /* renamed from: f */
    public int f3368f;

    /* renamed from: androidx.recyclerview.widget.a$a */
    public interface a {
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    public static final class b {

        /* renamed from: a */
        public int f3369a;

        /* renamed from: b */
        public int f3370b;

        /* renamed from: c */
        public java.lang.Object f3371c;

        /* renamed from: d */
        public int f3372d;

        public b(int r1, int r2, int r3, java.lang.Object r4) {
                r0 = this;
                r0.<init>()
                r0.f3369a = r1
                r0.f3370b = r2
                r0.f3372d = r3
                r0.f3371c = r4
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof androidx.recyclerview.widget.C0577a.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                androidx.recyclerview.widget.a$b r5 = (androidx.recyclerview.widget.C0577a.b) r5
                int r1 = r4.f3369a
                int r3 = r5.f3369a
                if (r1 == r3) goto L13
                return r2
            L13:
                r3 = 8
                if (r1 != r3) goto L2f
                int r1 = r4.f3372d
                int r3 = r4.f3370b
                int r1 = r1 - r3
                int r1 = java.lang.Math.abs(r1)
                if (r1 != r0) goto L2f
                int r1 = r4.f3372d
                int r3 = r5.f3370b
                if (r1 != r3) goto L2f
                int r1 = r4.f3370b
                int r3 = r5.f3372d
                if (r1 != r3) goto L2f
                return r0
            L2f:
                int r1 = r4.f3372d
                int r3 = r5.f3372d
                if (r1 == r3) goto L36
                return r2
            L36:
                int r1 = r4.f3370b
                int r3 = r5.f3370b
                if (r1 == r3) goto L3d
                return r2
            L3d:
                java.lang.Object r1 = r4.f3371c
                java.lang.Object r5 = r5.f3371c
                if (r1 == 0) goto L4a
                boolean r5 = r1.equals(r5)
                if (r5 != 0) goto L4d
                return r2
            L4a:
                if (r5 == 0) goto L4d
                return r2
            L4d:
                return r0
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.f3369a
                int r0 = r0 * 31
                int r1 = r2.f3370b
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.f3372d
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = java.lang.System.identityHashCode(r3)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = "["
                r0.append(r1)
                int r1 = r3.f3369a
                r2 = 1
                if (r1 == r2) goto L30
                r2 = 2
                if (r1 == r2) goto L2d
                r2 = 4
                if (r1 == r2) goto L2a
                r2 = 8
                if (r1 == r2) goto L27
                java.lang.String r1 = "??"
                goto L32
            L27:
                java.lang.String r1 = "mv"
                goto L32
            L2a:
                java.lang.String r1 = "up"
                goto L32
            L2d:
                java.lang.String r1 = "rm"
                goto L32
            L30:
                java.lang.String r1 = "add"
            L32:
                r0.append(r1)
                java.lang.String r1 = ",s:"
                r0.append(r1)
                int r1 = r3.f3370b
                r0.append(r1)
                java.lang.String r1 = "c:"
                r0.append(r1)
                int r1 = r3.f3372d
                r0.append(r1)
                java.lang.String r1 = ",p:"
                r0.append(r1)
                java.lang.Object r1 = r3.f3371c
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public C0577a(androidx.recyclerview.widget.C0577a.a r4) {
            r3 = this;
            r3.<init>()
            v.e r0 = new v.e
            r1 = 30
            r2 = 1
            r0.<init>(r1, r2)
            r3.f3363a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f3364b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f3365c = r0
            r0 = 0
            r3.f3368f = r0
            r3.f3366d = r4
            androidx.recyclerview.widget.z r4 = new androidx.recyclerview.widget.z
            r4.<init>(r3)
            r3.f3367e = r4
            return
    }

    /* renamed from: a */
    public final boolean m1984a(int r8) {
            r7 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r7.f3365c
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3c
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r7.f3365c
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.C0577a.b) r3
            int r4 = r3.f3369a
            r5 = 8
            r6 = 1
            if (r4 != r5) goto L24
            int r3 = r3.f3372d
            int r4 = r2 + 1
            int r3 = r7.m1989f(r3, r4)
            if (r3 != r8) goto L39
            return r6
        L24:
            if (r4 != r6) goto L39
            int r4 = r3.f3370b
            int r3 = r3.f3372d
            int r3 = r3 + r4
        L2b:
            if (r4 >= r3) goto L39
            int r5 = r2 + 1
            int r5 = r7.m1989f(r4, r5)
            if (r5 != r8) goto L36
            return r6
        L36:
            int r4 = r4 + 1
            goto L2b
        L39:
            int r2 = r2 + 1
            goto L8
        L3c:
            return r1
    }

    /* renamed from: b */
    public void m1985b() {
            r5 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r5.f3365c
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L1c
            androidx.recyclerview.widget.a$a r3 = r5.f3366d
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r4 = r5.f3365c
            java.lang.Object r4 = r4.get(r2)
            androidx.recyclerview.widget.a$b r4 = (androidx.recyclerview.widget.C0577a.b) r4
            androidx.recyclerview.widget.g0 r3 = (androidx.recyclerview.widget.C0590g0) r3
            r3.m2037a(r4)
            int r2 = r2 + 1
            goto L8
        L1c:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r5.f3365c
            r5.m1995l(r0)
            r5.f3368f = r1
            return
    }

    /* renamed from: c */
    public void m1986c() {
            r8 = this;
            r8.m1985b()
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r8.f3364b
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r0) goto L82
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r8.f3364b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.C0577a.b) r3
            int r4 = r3.f3369a
            r5 = 1
            if (r4 == r5) goto L6d
            r6 = 2
            if (r4 == r6) goto L4d
            r5 = 4
            if (r4 == r5) goto L38
            r5 = 8
            if (r4 == r5) goto L25
            goto L7f
        L25:
            androidx.recyclerview.widget.a$a r4 = r8.f3366d
            androidx.recyclerview.widget.g0 r4 = (androidx.recyclerview.widget.C0590g0) r4
            r4.m2037a(r3)
            androidx.recyclerview.widget.a$a r4 = r8.f3366d
            int r5 = r3.f3370b
            int r3 = r3.f3372d
            androidx.recyclerview.widget.g0 r4 = (androidx.recyclerview.widget.C0590g0) r4
            r4.m2041e(r5, r3)
            goto L7f
        L38:
            androidx.recyclerview.widget.a$a r4 = r8.f3366d
            androidx.recyclerview.widget.g0 r4 = (androidx.recyclerview.widget.C0590g0) r4
            r4.m2037a(r3)
            androidx.recyclerview.widget.a$a r4 = r8.f3366d
            int r5 = r3.f3370b
            int r6 = r3.f3372d
            java.lang.Object r3 = r3.f3371c
            androidx.recyclerview.widget.g0 r4 = (androidx.recyclerview.widget.C0590g0) r4
            r4.m2039c(r5, r6, r3)
            goto L7f
        L4d:
            androidx.recyclerview.widget.a$a r4 = r8.f3366d
            androidx.recyclerview.widget.g0 r4 = (androidx.recyclerview.widget.C0590g0) r4
            r4.m2037a(r3)
            androidx.recyclerview.widget.a$a r4 = r8.f3366d
            int r6 = r3.f3370b
            int r3 = r3.f3372d
            androidx.recyclerview.widget.g0 r4 = (androidx.recyclerview.widget.C0590g0) r4
            androidx.recyclerview.widget.RecyclerView r7 = r4.f3409a
            r7.m1740S(r6, r3, r5)
            androidx.recyclerview.widget.RecyclerView r4 = r4.f3409a
            r4.f3163h1 = r5
            androidx.recyclerview.widget.RecyclerView$y r4 = r4.f3157e1
            int r5 = r4.f3298c
            int r5 = r5 + r3
            r4.f3298c = r5
            goto L7f
        L6d:
            androidx.recyclerview.widget.a$a r4 = r8.f3366d
            androidx.recyclerview.widget.g0 r4 = (androidx.recyclerview.widget.C0590g0) r4
            r4.m2037a(r3)
            androidx.recyclerview.widget.a$a r4 = r8.f3366d
            int r5 = r3.f3370b
            int r3 = r3.f3372d
            androidx.recyclerview.widget.g0 r4 = (androidx.recyclerview.widget.C0590g0) r4
            r4.m2040d(r5, r3)
        L7f:
            int r2 = r2 + 1
            goto Lb
        L82:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r8.f3364b
            r8.m1995l(r0)
            r8.f3368f = r1
            return
    }

    /* renamed from: d */
    public final void m1987d(androidx.recyclerview.widget.C0577a.b r13) {
            r12 = this;
            int r0 = r13.f3369a
            r1 = 1
            if (r0 == r1) goto L85
            r2 = 8
            if (r0 == r2) goto L85
            int r2 = r13.f3370b
            int r0 = r12.m1996m(r2, r0)
            int r2 = r13.f3370b
            int r3 = r13.f3369a
            r4 = 2
            r5 = 4
            r6 = 0
            if (r3 == r4) goto L33
            if (r3 != r5) goto L1c
            r3 = 1
            goto L34
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "op should be remove or update."
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L33:
            r3 = 0
        L34:
            r7 = 1
            r8 = 1
        L36:
            int r9 = r13.f3372d
            if (r7 >= r9) goto L71
            int r9 = r13.f3370b
            int r10 = r3 * r7
            int r10 = r10 + r9
            int r9 = r13.f3369a
            int r9 = r12.m1996m(r10, r9)
            int r10 = r13.f3369a
            if (r10 == r4) goto L51
            if (r10 == r5) goto L4c
            goto L55
        L4c:
            int r11 = r0 + 1
            if (r9 != r11) goto L55
            goto L53
        L51:
            if (r9 != r0) goto L55
        L53:
            r11 = 1
            goto L56
        L55:
            r11 = 0
        L56:
            if (r11 == 0) goto L5b
            int r8 = r8 + 1
            goto L6e
        L5b:
            java.lang.Object r11 = r13.f3371c
            androidx.recyclerview.widget.a$b r0 = r12.m1991h(r10, r0, r8, r11)
            r12.m1988e(r0, r2)
            r12.m1994k(r0)
            int r0 = r13.f3369a
            if (r0 != r5) goto L6c
            int r2 = r2 + r8
        L6c:
            r0 = r9
            r8 = 1
        L6e:
            int r7 = r7 + 1
            goto L36
        L71:
            java.lang.Object r1 = r13.f3371c
            r12.m1994k(r13)
            if (r8 <= 0) goto L84
            int r13 = r13.f3369a
            androidx.recyclerview.widget.a$b r13 = r12.m1991h(r13, r0, r8, r1)
            r12.m1988e(r13, r2)
            r12.m1994k(r13)
        L84:
            return
        L85:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "should not dispatch add or move for pre layout"
            r13.<init>(r0)
            throw r13
    }

    /* renamed from: e */
    public void m1988e(androidx.recyclerview.widget.C0577a.b r4, int r5) {
            r3 = this;
            androidx.recyclerview.widget.a$a r0 = r3.f3366d
            androidx.recyclerview.widget.g0 r0 = (androidx.recyclerview.widget.C0590g0) r0
            r0.m2037a(r4)
            int r0 = r4.f3369a
            r1 = 2
            if (r0 == r1) goto L23
            r1 = 4
            if (r0 != r1) goto L1b
            androidx.recyclerview.widget.a$a r0 = r3.f3366d
            int r1 = r4.f3372d
            java.lang.Object r4 = r4.f3371c
            androidx.recyclerview.widget.g0 r0 = (androidx.recyclerview.widget.C0590g0) r0
            r0.m2039c(r5, r1, r4)
            goto L3a
        L1b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "only remove and update ops can be dispatched in first pass"
            r4.<init>(r5)
            throw r4
        L23:
            androidx.recyclerview.widget.a$a r0 = r3.f3366d
            int r4 = r4.f3372d
            androidx.recyclerview.widget.g0 r0 = (androidx.recyclerview.widget.C0590g0) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.f3409a
            r2 = 1
            r1.m1740S(r5, r4, r2)
            androidx.recyclerview.widget.RecyclerView r5 = r0.f3409a
            r5.f3163h1 = r2
            androidx.recyclerview.widget.RecyclerView$y r5 = r5.f3157e1
            int r0 = r5.f3298c
            int r0 = r0 + r4
            r5.f3298c = r0
        L3a:
            return
    }

    /* renamed from: f */
    public int m1989f(int r6, int r7) {
            r5 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r5.f3365c
            int r0 = r0.size()
        L6:
            if (r7 >= r0) goto L41
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r5.f3365c
            java.lang.Object r1 = r1.get(r7)
            androidx.recyclerview.widget.a$b r1 = (androidx.recyclerview.widget.C0577a.b) r1
            int r2 = r1.f3369a
            r3 = 8
            if (r2 != r3) goto L28
            int r2 = r1.f3370b
            if (r2 != r6) goto L1d
            int r6 = r1.f3372d
            goto L3e
        L1d:
            if (r2 >= r6) goto L21
            int r6 = r6 + (-1)
        L21:
            int r1 = r1.f3372d
            if (r1 > r6) goto L3e
            int r6 = r6 + 1
            goto L3e
        L28:
            int r3 = r1.f3370b
            if (r3 > r6) goto L3e
            r4 = 2
            if (r2 != r4) goto L38
            int r1 = r1.f3372d
            int r3 = r3 + r1
            if (r6 >= r3) goto L36
            r6 = -1
            return r6
        L36:
            int r6 = r6 - r1
            goto L3e
        L38:
            r3 = 1
            if (r2 != r3) goto L3e
            int r1 = r1.f3372d
            int r6 = r6 + r1
        L3e:
            int r7 = r7 + 1
            goto L6
        L41:
            return r6
    }

    /* renamed from: g */
    public boolean m1990g() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r1.f3364b
            int r0 = r0.size()
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* renamed from: h */
    public androidx.recyclerview.widget.C0577a.b m1991h(int r2, int r3, int r4, java.lang.Object r5) {
            r1 = this;
            m0.c<androidx.recyclerview.widget.a$b> r0 = r1.f3363a
            java.lang.Object r0 = r0.mo6231b()
            androidx.recyclerview.widget.a$b r0 = (androidx.recyclerview.widget.C0577a.b) r0
            if (r0 != 0) goto L10
            androidx.recyclerview.widget.a$b r0 = new androidx.recyclerview.widget.a$b
            r0.<init>(r2, r3, r4, r5)
            goto L18
        L10:
            r0.f3369a = r2
            r0.f3370b = r3
            r0.f3372d = r4
            r0.f3371c = r5
        L18:
            return r0
    }

    /* renamed from: i */
    public final void m1992i(androidx.recyclerview.widget.C0577a.b r6) {
            r5 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r5.f3365c
            r0.add(r6)
            int r0 = r6.f3369a
            r1 = 1
            if (r0 == r1) goto L58
            r2 = 2
            if (r0 == r2) goto L45
            r1 = 4
            if (r0 == r1) goto L37
            r1 = 8
            if (r0 != r1) goto L20
            androidx.recyclerview.widget.a$a r0 = r5.f3366d
            int r1 = r6.f3370b
            int r6 = r6.f3372d
            androidx.recyclerview.widget.g0 r0 = (androidx.recyclerview.widget.C0590g0) r0
            r0.m2041e(r1, r6)
            goto L63
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown update op type for "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L37:
            androidx.recyclerview.widget.a$a r0 = r5.f3366d
            int r1 = r6.f3370b
            int r2 = r6.f3372d
            java.lang.Object r6 = r6.f3371c
            androidx.recyclerview.widget.g0 r0 = (androidx.recyclerview.widget.C0590g0) r0
            r0.m2039c(r1, r2, r6)
            goto L63
        L45:
            androidx.recyclerview.widget.a$a r0 = r5.f3366d
            int r2 = r6.f3370b
            int r6 = r6.f3372d
            androidx.recyclerview.widget.g0 r0 = (androidx.recyclerview.widget.C0590g0) r0
            androidx.recyclerview.widget.RecyclerView r3 = r0.f3409a
            r4 = 0
            r3.m1740S(r2, r6, r4)
            androidx.recyclerview.widget.RecyclerView r6 = r0.f3409a
            r6.f3163h1 = r1
            goto L63
        L58:
            androidx.recyclerview.widget.a$a r0 = r5.f3366d
            int r1 = r6.f3370b
            int r6 = r6.f3372d
            androidx.recyclerview.widget.g0 r0 = (androidx.recyclerview.widget.C0590g0) r0
            r0.m2040d(r1, r6)
        L63:
            return
    }

    /* renamed from: j */
    public void m1993j() {
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.z r1 = r0.f3367e
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f3364b
            java.util.Objects.requireNonNull(r1)
        L9:
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L10:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L26
            java.lang.Object r9 = r2.get(r3)
            androidx.recyclerview.widget.a$b r9 = (androidx.recyclerview.widget.C0577a.b) r9
            int r9 = r9.f3369a
            if (r9 != r7) goto L22
            if (r6 == 0) goto L23
            goto L27
        L22:
            r6 = 1
        L23:
            int r3 = r3 + (-1)
            goto L10
        L26:
            r3 = -1
        L27:
            r6 = 0
            r9 = 4
            r10 = 2
            if (r3 == r8) goto L1be
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            androidx.recyclerview.widget.a$b r11 = (androidx.recyclerview.widget.C0577a.b) r11
            java.lang.Object r12 = r2.get(r7)
            androidx.recyclerview.widget.a$b r12 = (androidx.recyclerview.widget.C0577a.b) r12
            int r13 = r12.f3369a
            if (r13 == r4) goto L194
            if (r13 == r10) goto La8
            if (r13 == r9) goto L43
            goto L9
        L43:
            int r5 = r11.f3372d
            int r8 = r12.f3370b
            if (r5 >= r8) goto L4e
            int r8 = r8 + (-1)
            r12.f3370b = r8
            goto L64
        L4e:
            int r10 = r12.f3372d
            int r8 = r8 + r10
            if (r5 >= r8) goto L64
            int r10 = r10 + (-1)
            r12.f3372d = r10
            androidx.recyclerview.widget.z$a r5 = r1.f3643a
            int r8 = r11.f3370b
            java.lang.Object r10 = r12.f3371c
            androidx.recyclerview.widget.a r5 = (androidx.recyclerview.widget.C0577a) r5
            androidx.recyclerview.widget.a$b r4 = r5.m1991h(r9, r8, r4, r10)
            goto L65
        L64:
            r4 = r6
        L65:
            int r5 = r11.f3370b
            int r8 = r12.f3370b
            if (r5 > r8) goto L70
            int r8 = r8 + 1
            r12.f3370b = r8
            goto L87
        L70:
            int r10 = r12.f3372d
            int r8 = r8 + r10
            if (r5 >= r8) goto L87
            int r8 = r8 - r5
            androidx.recyclerview.widget.z$a r6 = r1.f3643a
            int r5 = r5 + 1
            java.lang.Object r10 = r12.f3371c
            androidx.recyclerview.widget.a r6 = (androidx.recyclerview.widget.C0577a) r6
            androidx.recyclerview.widget.a$b r6 = r6.m1991h(r9, r5, r8, r10)
            int r5 = r12.f3372d
            int r5 = r5 - r8
            r12.f3372d = r5
        L87:
            r2.set(r7, r11)
            int r5 = r12.f3372d
            if (r5 <= 0) goto L92
            r2.set(r3, r12)
            goto L9c
        L92:
            r2.remove(r3)
            androidx.recyclerview.widget.z$a r5 = r1.f3643a
            androidx.recyclerview.widget.a r5 = (androidx.recyclerview.widget.C0577a) r5
            r5.m1994k(r12)
        L9c:
            if (r4 == 0) goto La1
            r2.add(r3, r4)
        La1:
            if (r6 == 0) goto L9
            r2.add(r3, r6)
            goto L9
        La8:
            int r8 = r11.f3370b
            int r9 = r11.f3372d
            int r13 = r12.f3370b
            if (r8 >= r9) goto Lbd
            if (r13 != r8) goto Lba
            int r14 = r12.f3372d
            int r8 = r9 - r8
            if (r14 != r8) goto Lba
            r5 = 0
            goto Lc7
        Lba:
            r5 = 0
            r8 = 0
            goto Lcc
        Lbd:
            int r14 = r9 + 1
            if (r13 != r14) goto Lca
            int r14 = r12.f3372d
            int r8 = r8 - r9
            if (r14 != r8) goto Lca
            r5 = 1
        Lc7:
            r8 = r5
            r5 = 1
            goto Lcc
        Lca:
            r5 = 0
            r8 = 1
        Lcc:
            if (r9 >= r13) goto Ld3
            int r13 = r13 + (-1)
            r12.f3370b = r13
            goto Lf0
        Ld3:
            int r14 = r12.f3372d
            int r13 = r13 + r14
            if (r9 >= r13) goto Lf0
            int r14 = r14 + (-1)
            r12.f3372d = r14
            r11.f3369a = r10
            r11.f3372d = r4
            int r3 = r12.f3372d
            if (r3 != 0) goto L9
            r2.remove(r7)
            androidx.recyclerview.widget.z$a r3 = r1.f3643a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.C0577a) r3
            r3.m1994k(r12)
            goto L9
        Lf0:
            int r4 = r11.f3370b
            int r9 = r12.f3370b
            if (r4 > r9) goto Lfb
            int r9 = r9 + 1
            r12.f3370b = r9
            goto L112
        Lfb:
            int r13 = r12.f3372d
            int r9 = r9 + r13
            if (r4 >= r9) goto L112
            int r9 = r9 - r4
            androidx.recyclerview.widget.z$a r13 = r1.f3643a
            int r4 = r4 + 1
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.C0577a) r13
            androidx.recyclerview.widget.a$b r6 = r13.m1991h(r10, r4, r9, r6)
            int r4 = r11.f3370b
            int r9 = r12.f3370b
            int r4 = r4 - r9
            r12.f3372d = r4
        L112:
            if (r5 == 0) goto L123
            r2.set(r3, r12)
            r2.remove(r7)
            androidx.recyclerview.widget.z$a r3 = r1.f3643a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.C0577a) r3
            r3.m1994k(r11)
            goto L9
        L123:
            if (r8 == 0) goto L14f
            if (r6 == 0) goto L13d
            int r4 = r11.f3370b
            int r5 = r6.f3370b
            if (r4 <= r5) goto L132
            int r5 = r6.f3372d
            int r4 = r4 - r5
            r11.f3370b = r4
        L132:
            int r4 = r11.f3372d
            int r5 = r6.f3370b
            if (r4 <= r5) goto L13d
            int r5 = r6.f3372d
            int r4 = r4 - r5
            r11.f3372d = r4
        L13d:
            int r4 = r11.f3370b
            int r5 = r12.f3370b
            if (r4 <= r5) goto L148
            int r5 = r12.f3372d
            int r4 = r4 - r5
            r11.f3370b = r4
        L148:
            int r4 = r11.f3372d
            int r5 = r12.f3370b
            if (r4 <= r5) goto L17d
            goto L178
        L14f:
            if (r6 == 0) goto L167
            int r4 = r11.f3370b
            int r5 = r6.f3370b
            if (r4 < r5) goto L15c
            int r5 = r6.f3372d
            int r4 = r4 - r5
            r11.f3370b = r4
        L15c:
            int r4 = r11.f3372d
            int r5 = r6.f3370b
            if (r4 < r5) goto L167
            int r5 = r6.f3372d
            int r4 = r4 - r5
            r11.f3372d = r4
        L167:
            int r4 = r11.f3370b
            int r5 = r12.f3370b
            if (r4 < r5) goto L172
            int r5 = r12.f3372d
            int r4 = r4 - r5
            r11.f3370b = r4
        L172:
            int r4 = r11.f3372d
            int r5 = r12.f3370b
            if (r4 < r5) goto L17d
        L178:
            int r5 = r12.f3372d
            int r4 = r4 - r5
            r11.f3372d = r4
        L17d:
            r2.set(r3, r12)
            int r4 = r11.f3370b
            int r5 = r11.f3372d
            if (r4 == r5) goto L18a
            r2.set(r7, r11)
            goto L18d
        L18a:
            r2.remove(r7)
        L18d:
            if (r6 == 0) goto L9
            r2.add(r3, r6)
            goto L9
        L194:
            int r4 = r11.f3372d
            int r6 = r12.f3370b
            if (r4 >= r6) goto L19c
            r5 = -1
            goto L19d
        L19c:
            r5 = 0
        L19d:
            int r8 = r11.f3370b
            if (r8 >= r6) goto L1a3
            int r5 = r5 + 1
        L1a3:
            if (r6 > r8) goto L1aa
            int r6 = r12.f3372d
            int r8 = r8 + r6
            r11.f3370b = r8
        L1aa:
            int r6 = r12.f3370b
            if (r6 > r4) goto L1b3
            int r8 = r12.f3372d
            int r4 = r4 + r8
            r11.f3372d = r4
        L1b3:
            int r6 = r6 + r5
            r12.f3370b = r6
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L9
        L1be:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f3364b
            int r1 = r1.size()
            r2 = 0
        L1c5:
            if (r2 >= r1) goto L290
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f3364b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.C0577a.b) r3
            int r11 = r3.f3369a
            if (r11 == r4) goto L289
            if (r11 == r10) goto L233
            if (r11 == r9) goto L1e0
            if (r11 == r7) goto L1db
            goto L28c
        L1db:
            r0.m1992i(r3)
            goto L28c
        L1e0:
            int r11 = r3.f3370b
            int r12 = r3.f3372d
            int r12 = r12 + r11
            r13 = r11
            r14 = 0
            r15 = -1
        L1e8:
            if (r11 >= r12) goto L21c
            androidx.recyclerview.widget.a$a r5 = r0.f3366d
            androidx.recyclerview.widget.g0 r5 = (androidx.recyclerview.widget.C0590g0) r5
            androidx.recyclerview.widget.RecyclerView$b0 r5 = r5.m2038b(r11)
            if (r5 != 0) goto L20a
            boolean r5 = r0.m1984a(r11)
            if (r5 == 0) goto L1fb
            goto L20a
        L1fb:
            if (r15 != r4) goto L208
            java.lang.Object r5 = r3.f3371c
            androidx.recyclerview.widget.a$b r5 = r0.m1991h(r9, r13, r14, r5)
            r0.m1992i(r5)
            r13 = r11
            r14 = 0
        L208:
            r15 = 0
            goto L218
        L20a:
            if (r15 != 0) goto L217
            java.lang.Object r5 = r3.f3371c
            androidx.recyclerview.widget.a$b r5 = r0.m1991h(r9, r13, r14, r5)
            r0.m1987d(r5)
            r13 = r11
            r14 = 0
        L217:
            r15 = 1
        L218:
            int r14 = r14 + r4
            int r11 = r11 + 1
            goto L1e8
        L21c:
            int r5 = r3.f3372d
            if (r14 == r5) goto L229
            java.lang.Object r5 = r3.f3371c
            r0.m1994k(r3)
            androidx.recyclerview.widget.a$b r3 = r0.m1991h(r9, r13, r14, r5)
        L229:
            if (r15 != 0) goto L22f
            r0.m1987d(r3)
            goto L28c
        L22f:
            r0.m1992i(r3)
            goto L28c
        L233:
            int r5 = r3.f3370b
            int r11 = r3.f3372d
            int r11 = r11 + r5
            r12 = r5
            r13 = 0
            r14 = -1
        L23b:
            if (r12 >= r11) goto L274
            androidx.recyclerview.widget.a$a r15 = r0.f3366d
            androidx.recyclerview.widget.g0 r15 = (androidx.recyclerview.widget.C0590g0) r15
            androidx.recyclerview.widget.RecyclerView$b0 r15 = r15.m2038b(r12)
            if (r15 != 0) goto L25c
            boolean r15 = r0.m1984a(r12)
            if (r15 == 0) goto L24e
            goto L25c
        L24e:
            if (r14 != r4) goto L259
            androidx.recyclerview.widget.a$b r14 = r0.m1991h(r10, r5, r13, r6)
            r0.m1992i(r14)
            r14 = 1
            goto L25a
        L259:
            r14 = 0
        L25a:
            r15 = 0
            goto L269
        L25c:
            if (r14 != 0) goto L267
            androidx.recyclerview.widget.a$b r14 = r0.m1991h(r10, r5, r13, r6)
            r0.m1987d(r14)
            r14 = 1
            goto L268
        L267:
            r14 = 0
        L268:
            r15 = 1
        L269:
            if (r14 == 0) goto L26f
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = 1
            goto L271
        L26f:
            int r13 = r13 + 1
        L271:
            int r12 = r12 + r4
            r14 = r15
            goto L23b
        L274:
            int r11 = r3.f3372d
            if (r13 == r11) goto L27f
            r0.m1994k(r3)
            androidx.recyclerview.widget.a$b r3 = r0.m1991h(r10, r5, r13, r6)
        L27f:
            if (r14 != 0) goto L285
            r0.m1987d(r3)
            goto L28c
        L285:
            r0.m1992i(r3)
            goto L28c
        L289:
            r0.m1992i(r3)
        L28c:
            int r2 = r2 + 1
            goto L1c5
        L290:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f3364b
            r1.clear()
            return
    }

    /* renamed from: k */
    public void m1994k(androidx.recyclerview.widget.C0577a.b r2) {
            r1 = this;
            r0 = 0
            r2.f3371c = r0
            m0.c<androidx.recyclerview.widget.a$b> r0 = r1.f3363a
            r0.mo6230a(r2)
            return
    }

    /* renamed from: l */
    public void m1995l(java.util.List<androidx.recyclerview.widget.C0577a.b> r4) {
            r3 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L13
            java.lang.Object r2 = r4.get(r1)
            androidx.recyclerview.widget.a$b r2 = (androidx.recyclerview.widget.C0577a.b) r2
            r3.m1994k(r2)
            int r1 = r1 + 1
            goto L5
        L13:
            r4.clear()
            return
    }

    /* renamed from: m */
    public final int m1996m(int r9, int r10) {
            r8 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r8.f3365c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            r2 = 8
            if (r0 < 0) goto L7d
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r8.f3365c
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.C0577a.b) r3
            int r4 = r3.f3369a
            r5 = 2
            if (r4 != r2) goto L5e
            int r2 = r3.f3370b
            int r4 = r3.f3372d
            if (r2 >= r4) goto L22
            r6 = r2
            r7 = r4
            goto L24
        L22:
            r7 = r2
            r6 = r4
        L24:
            if (r9 < r6) goto L48
            if (r9 > r7) goto L48
            if (r6 != r2) goto L39
            if (r10 != r1) goto L31
            int r4 = r4 + 1
        L2e:
            r3.f3372d = r4
            goto L36
        L31:
            if (r10 != r5) goto L36
            int r4 = r4 + (-1)
            goto L2e
        L36:
            int r9 = r9 + 1
            goto L7a
        L39:
            if (r10 != r1) goto L40
            int r2 = r2 + 1
        L3d:
            r3.f3370b = r2
            goto L45
        L40:
            if (r10 != r5) goto L45
            int r2 = r2 + (-1)
            goto L3d
        L45:
            int r9 = r9 + (-1)
            goto L7a
        L48:
            if (r9 >= r2) goto L7a
            if (r10 != r1) goto L55
            int r2 = r2 + 1
            r3.f3370b = r2
            int r4 = r4 + 1
        L52:
            r3.f3372d = r4
            goto L7a
        L55:
            if (r10 != r5) goto L7a
            int r2 = r2 + (-1)
            r3.f3370b = r2
            int r4 = r4 + (-1)
            goto L52
        L5e:
            int r2 = r3.f3370b
            if (r2 > r9) goto L6e
            if (r4 != r1) goto L68
            int r2 = r3.f3372d
            int r9 = r9 - r2
            goto L7a
        L68:
            if (r4 != r5) goto L7a
            int r2 = r3.f3372d
            int r9 = r9 + r2
            goto L7a
        L6e:
            if (r10 != r1) goto L75
            int r2 = r2 + 1
        L72:
            r3.f3370b = r2
            goto L7a
        L75:
            if (r10 != r5) goto L7a
            int r2 = r2 + (-1)
            goto L72
        L7a:
            int r0 = r0 + (-1)
            goto L8
        L7d:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r10 = r8.f3365c
            int r10 = r10.size()
            int r10 = r10 - r1
        L84:
            if (r10 < 0) goto Laa
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r8.f3365c
            java.lang.Object r0 = r0.get(r10)
            androidx.recyclerview.widget.a$b r0 = (androidx.recyclerview.widget.C0577a.b) r0
            int r1 = r0.f3369a
            if (r1 != r2) goto L9b
            int r1 = r0.f3372d
            int r3 = r0.f3370b
            if (r1 == r3) goto L9f
            if (r1 >= 0) goto La7
            goto L9f
        L9b:
            int r1 = r0.f3372d
            if (r1 > 0) goto La7
        L9f:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r8.f3365c
            r1.remove(r10)
            r8.m1994k(r0)
        La7:
            int r10 = r10 + (-1)
            goto L84
        Laa:
            return r9
    }
}
