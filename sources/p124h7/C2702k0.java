package p124h7;

/* renamed from: h7.k0 */
/* loaded from: classes.dex */
public final class C2702k0 {

    /* renamed from: a */
    public static final java.lang.Class<?> f11686a = null;

    /* renamed from: b */
    public static final p124h7.AbstractC2900v0<?, ?> f11687b = null;

    /* renamed from: c */
    public static final p124h7.AbstractC2900v0<?, ?> f11688c = null;

    /* renamed from: d */
    public static final p124h7.AbstractC2900v0<?, ?> f11689d = null;

    static {
            java.lang.String r0 = "rb.c"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            p124h7.C2702k0.f11686a = r0
            r0 = 0
            h7.v0 r0 = m6929w(r0)
            p124h7.C2702k0.f11687b = r0
            r0 = 1
            h7.v0 r0 = m6929w(r0)
            p124h7.C2702k0.f11688c = r0
            h7.y0 r0 = new h7.y0
            r0.<init>()
            p124h7.C2702k0.f11689d = r0
            return
    }

    /* renamed from: A */
    public static int m6887A(int r0, java.util.List r1) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 << 3
            int r0 = p124h7.AbstractC2682ig.m6841h(r0)
            int r0 = r0 + 4
            int r0 = r0 * r1
            return r0
    }

    /* renamed from: B */
    public static int m6888B(java.util.List<?> r0) {
            int r0 = r0.size()
            int r0 = r0 * 4
            return r0
    }

    /* renamed from: C */
    public static int m6889C(int r0, java.util.List r1) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 << 3
            int r0 = p124h7.AbstractC2682ig.m6841h(r0)
            int r0 = r0 + 8
            int r0 = r0 * r1
            return r0
    }

    /* renamed from: D */
    public static int m6890D(java.util.List<?> r0) {
            int r0 = r0.size()
            int r0 = r0 * 8
            return r0
    }

    /* renamed from: E */
    public static int m6891E(int r4, java.util.List<p124h7.InterfaceC2935x> r5, p124h7.InterfaceC2666i0 r6) {
            int r0 = r5.size()
            r1 = 0
            if (r0 == 0) goto L19
            r2 = 0
        L8:
            if (r1 >= r0) goto L18
            java.lang.Object r3 = r5.get(r1)
            h7.x r3 = (p124h7.InterfaceC2935x) r3
            int r3 = p124h7.AbstractC2682ig.m6836B(r4, r3, r6)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L8
        L18:
            return r2
        L19:
            return r1
    }

    /* renamed from: F */
    public static int m6892F(int r0, java.util.List<java.lang.Integer> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = m6893G(r1)
            int r0 = p124h7.AbstractC2682ig.m6840g(r0)
            int r0 = r0 * r2
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: G */
    public static int m6893G(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof p124h7.C2988zg
            if (r2 == 0) goto L1d
            h7.zg r4 = (p124h7.C2988zg) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.m7359e(r1)
            int r3 = p124h7.AbstractC2682ig.m6837C(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = p124h7.AbstractC2682ig.m6837C(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    /* renamed from: H */
    public static int m6894H(int r1, java.util.List r2) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = m6895I(r2)
            int r2 = r2.size()
            int r1 = p124h7.AbstractC2682ig.m6840g(r1)
            int r1 = r1 * r2
            int r1 = r1 + r0
            return r1
    }

    /* renamed from: I */
    public static int m6895I(java.util.List<java.lang.Long> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof p124h7.C2755n
            if (r2 == 0) goto L1d
            h7.n r5 = (p124h7.C2755n) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.m6989e(r1)
            int r3 = p124h7.AbstractC2682ig.m6842i(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r5.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = p124h7.AbstractC2682ig.m6842i(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    /* renamed from: J */
    public static int m6896J(int r1, java.lang.Object r2, p124h7.InterfaceC2666i0 r3) {
            boolean r0 = r2 instanceof p124h7.C2647h
            if (r0 == 0) goto L17
            h7.h r2 = (p124h7.C2647h) r2
            int r1 = r1 << 3
            int r1 = p124h7.AbstractC2682ig.m6841h(r1)
            int r2 = r2.m6764a()
            int r3 = p124h7.AbstractC2682ig.m6841h(r2)
            int r3 = r3 + r2
            int r3 = r3 + r1
            return r3
        L17:
            h7.x r2 = (p124h7.InterfaceC2935x) r2
            int r1 = r1 << 3
            int r1 = p124h7.AbstractC2682ig.m6841h(r1)
            int r2 = p124h7.AbstractC2682ig.m6838e(r2, r3)
            int r2 = r2 + r1
            return r2
    }

    /* renamed from: K */
    public static int m6897K(int r4, java.util.List<?> r5, p124h7.InterfaceC2666i0 r6) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r4 = p124h7.AbstractC2682ig.m6840g(r4)
            int r4 = r4 * r0
        Le:
            if (r1 >= r0) goto L30
            java.lang.Object r2 = r5.get(r1)
            boolean r3 = r2 instanceof p124h7.C2647h
            if (r3 == 0) goto L25
            h7.h r2 = (p124h7.C2647h) r2
            int r2 = r2.m6764a()
            int r3 = p124h7.AbstractC2682ig.m6841h(r2)
            int r3 = r3 + r2
            int r4 = r4 + r3
            goto L2d
        L25:
            h7.x r2 = (p124h7.InterfaceC2935x) r2
            int r2 = p124h7.AbstractC2682ig.m6838e(r2, r6)
            int r2 = r2 + r4
            r4 = r2
        L2d:
            int r1 = r1 + 1
            goto Le
        L30:
            return r4
    }

    /* renamed from: L */
    public static int m6898L(int r0, java.util.List<java.lang.Integer> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = m6899M(r1)
            int r0 = p124h7.AbstractC2682ig.m6840g(r0)
            int r0 = r0 * r2
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: M */
    public static int m6899M(java.util.List<java.lang.Integer> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof p124h7.C2988zg
            if (r2 == 0) goto L22
            h7.zg r5 = (p124h7.C2988zg) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L3c
            int r3 = r5.m7359e(r1)
            int r4 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r4
            int r3 = p124h7.AbstractC2682ig.m6841h(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L22:
            r2 = 0
        L23:
            if (r1 >= r0) goto L3c
            java.lang.Object r3 = r5.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r4 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r4
            int r3 = p124h7.AbstractC2682ig.m6841h(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L23
        L3c:
            return r2
    }

    /* renamed from: N */
    public static int m6900N(int r0, java.util.List<java.lang.Long> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = m6901O(r1)
            int r0 = p124h7.AbstractC2682ig.m6840g(r0)
            int r0 = r0 * r2
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: O */
    public static int m6901O(java.util.List<java.lang.Long> r8) {
            int r0 = r8.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r8 instanceof p124h7.C2755n
            r3 = 63
            if (r2 == 0) goto L23
            h7.n r8 = (p124h7.C2755n) r8
            r2 = 0
        L11:
            if (r1 >= r0) goto L3c
            long r4 = r8.m6989e(r1)
            long r6 = r4 + r4
            long r4 = r4 >> r3
            long r4 = r4 ^ r6
            int r4 = p124h7.AbstractC2682ig.m6842i(r4)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L11
        L23:
            r2 = 0
        L24:
            if (r1 >= r0) goto L3c
            java.lang.Object r4 = r8.get(r1)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r6 = r4 + r4
            long r4 = r4 >> r3
            long r4 = r4 ^ r6
            int r4 = p124h7.AbstractC2682ig.m6842i(r4)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L24
        L3c:
            return r2
    }

    /* renamed from: P */
    public static int m6902P(int r4, java.util.List<?> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r4 = p124h7.AbstractC2682ig.m6840g(r4)
            int r4 = r4 * r0
            boolean r2 = r5 instanceof p124h7.InterfaceC2683j
            if (r2 == 0) goto L30
            h7.j r5 = (p124h7.InterfaceC2683j) r5
        L14:
            if (r1 >= r0) goto L4c
            java.lang.Object r2 = r5.mo6824j(r1)
            boolean r3 = r2 instanceof p124h7.AbstractC2574cg
            if (r3 == 0) goto L25
            h7.cg r2 = (p124h7.AbstractC2574cg) r2
            int r2 = p124h7.AbstractC2682ig.m6835A(r2)
            goto L2b
        L25:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = p124h7.AbstractC2682ig.m6839f(r2)
        L2b:
            int r2 = r2 + r4
            r4 = r2
            int r1 = r1 + 1
            goto L14
        L30:
            if (r1 >= r0) goto L4c
            java.lang.Object r2 = r5.get(r1)
            boolean r3 = r2 instanceof p124h7.AbstractC2574cg
            if (r3 == 0) goto L41
            h7.cg r2 = (p124h7.AbstractC2574cg) r2
            int r2 = p124h7.AbstractC2682ig.m6835A(r2)
            goto L47
        L41:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = p124h7.AbstractC2682ig.m6839f(r2)
        L47:
            int r2 = r2 + r4
            r4 = r2
            int r1 = r1 + 1
            goto L30
        L4c:
            return r4
    }

    /* renamed from: Q */
    public static int m6903Q(int r0, java.util.List<java.lang.Integer> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = m6904R(r1)
            int r0 = p124h7.AbstractC2682ig.m6840g(r0)
            int r0 = r0 * r2
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: R */
    public static int m6904R(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof p124h7.C2988zg
            if (r2 == 0) goto L1d
            h7.zg r4 = (p124h7.C2988zg) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.m7359e(r1)
            int r3 = p124h7.AbstractC2682ig.m6841h(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = p124h7.AbstractC2682ig.m6841h(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    /* renamed from: S */
    public static int m6905S(int r0, java.util.List<java.lang.Long> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = m6906T(r1)
            int r0 = p124h7.AbstractC2682ig.m6840g(r0)
            int r0 = r0 * r2
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: T */
    public static int m6906T(java.util.List<java.lang.Long> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof p124h7.C2755n
            if (r2 == 0) goto L1d
            h7.n r5 = (p124h7.C2755n) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.m6989e(r1)
            int r3 = p124h7.AbstractC2682ig.m6842i(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r5.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = p124h7.AbstractC2682ig.m6842i(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    /* renamed from: a */
    public static <UT, UB> UB m6907a(int r5, java.util.List<java.lang.Integer> r6, p124h7.InterfaceC2539b r7, UB r8, p124h7.AbstractC2900v0<UT, UB> r9) {
            if (r7 != 0) goto L3
            return r8
        L3:
            boolean r0 = r6 instanceof java.util.RandomAccess
            if (r0 == 0) goto L43
            int r0 = r6.size()
            r1 = 0
            r2 = 0
        Ld:
            if (r1 >= r0) goto L38
            java.lang.Object r3 = r6.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            boolean r4 = r7.m6476a()
            if (r4 == 0) goto L2b
            if (r1 == r2) goto L28
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.set(r2, r3)
        L28:
            int r2 = r2 + 1
            goto L35
        L2b:
            if (r8 != 0) goto L31
            java.lang.Object r8 = r9.mo7185f()
        L31:
            long r3 = (long) r3
            r9.mo7191l(r8, r5, r3)
        L35:
            int r1 = r1 + 1
            goto Ld
        L38:
            if (r2 != r0) goto L3b
            goto L6b
        L3b:
            java.util.List r5 = r6.subList(r2, r0)
            r5.clear()
            return r8
        L43:
            java.util.Iterator r6 = r6.iterator()
        L47:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r6.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r1 = r7.m6476a()
            if (r1 != 0) goto L47
            if (r8 != 0) goto L63
            java.lang.Object r8 = r9.mo7185f()
        L63:
            long r0 = (long) r0
            r9.mo7191l(r8, r5, r0)
            r6.remove()
            goto L47
        L6b:
            return r8
    }

    /* renamed from: b */
    public static <UT, UB> UB m6908b(int r2, int r3, UB r4, p124h7.AbstractC2900v0<UT, UB> r5) {
            if (r4 != 0) goto L6
            java.lang.Object r4 = r5.mo7185f()
        L6:
            long r0 = (long) r3
            r5.mo7191l(r4, r2, r0)
            return r4
    }

    /* renamed from: c */
    public static boolean m6909c(java.lang.Object r2, java.lang.Object r3) {
            r0 = 0
            r1 = 1
            if (r2 == r3) goto Le
            if (r2 == 0) goto Lf
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Ld
            goto Le
        Ld:
            return r0
        Le:
            r0 = 1
        Lf:
            return r0
    }

    /* renamed from: d */
    public static void m6910d(int r2, java.util.List<java.lang.Boolean> r3, p124h7.C2700jg r4, boolean r5) {
            if (r3 == 0) goto L5f
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L5f
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L47
            h7.ig r5 = r4.f11684a
            r1 = 2
            r5.mo6735v(r2, r1)
            r2 = 0
            r5 = 0
        L16:
            int r1 = r3.size()
            if (r2 >= r1) goto L2a
            java.lang.Object r1 = r3.get(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            int r5 = r5 + 1
            int r2 = r2 + 1
            goto L16
        L2a:
            h7.ig r2 = r4.f11684a
            r2.mo6737x(r5)
        L2f:
            int r2 = r3.size()
            if (r0 >= r2) goto L5f
            h7.ig r2 = r4.f11684a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r2.mo6724k(r5)
            int r0 = r0 + 1
            goto L2f
        L47:
            int r5 = r3.size()
            if (r0 >= r5) goto L5f
            h7.ig r5 = r4.f11684a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r5.mo6725l(r2, r1)
            int r0 = r0 + 1
            goto L47
        L5f:
            return
    }

    /* renamed from: e */
    public static void m6911e(int r3, java.util.List<p124h7.AbstractC2574cg> r4, p124h7.C2700jg r5) {
            if (r4 == 0) goto L20
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L20
            java.util.Objects.requireNonNull(r5)
            r0 = 0
        Lc:
            int r1 = r4.size()
            if (r0 >= r1) goto L20
            h7.ig r1 = r5.f11684a
            java.lang.Object r2 = r4.get(r0)
            h7.cg r2 = (p124h7.AbstractC2574cg) r2
            r1.mo6726m(r3, r2)
            int r0 = r0 + 1
            goto Lc
        L20:
            return
    }

    /* renamed from: f */
    public static void m6912f(int r3, java.util.List<java.lang.Double> r4, p124h7.C2700jg r5, boolean r6) {
            if (r4 == 0) goto L67
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L67
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L4b
            h7.ig r6 = r5.f11684a
            r1 = 2
            r6.mo6735v(r3, r1)
            r3 = 0
            r6 = 0
        L16:
            int r1 = r4.size()
            if (r3 >= r1) goto L2a
            java.lang.Object r1 = r4.get(r3)
            java.lang.Double r1 = (java.lang.Double) r1
            r1.doubleValue()
            int r6 = r6 + 8
            int r3 = r3 + 1
            goto L16
        L2a:
            h7.ig r3 = r5.f11684a
            r3.mo6737x(r6)
        L2f:
            int r3 = r4.size()
            if (r0 >= r3) goto L67
            h7.ig r3 = r5.f11684a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Double r6 = (java.lang.Double) r6
            double r1 = r6.doubleValue()
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r3.mo6730q(r1)
            int r0 = r0 + 1
            goto L2f
        L4b:
            int r6 = r4.size()
            if (r0 >= r6) goto L67
            h7.ig r6 = r5.f11684a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r6.mo6729p(r3, r1)
            int r0 = r0 + 1
            goto L4b
        L67:
            return
    }

    /* renamed from: g */
    public static void m6913g(int r2, java.util.List<java.lang.Integer> r3, p124h7.C2700jg r4, boolean r5) {
            if (r3 == 0) goto L63
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L63
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L4b
            h7.ig r5 = r4.f11684a
            r1 = 2
            r5.mo6735v(r2, r1)
            r2 = 0
            r5 = 0
        L16:
            int r1 = r3.size()
            if (r2 >= r1) goto L2e
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = p124h7.AbstractC2682ig.m6837C(r1)
            int r5 = r5 + r1
            int r2 = r2 + 1
            goto L16
        L2e:
            h7.ig r2 = r4.f11684a
            r2.mo6737x(r5)
        L33:
            int r2 = r3.size()
            if (r0 >= r2) goto L63
            h7.ig r2 = r4.f11684a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.mo6732s(r5)
            int r0 = r0 + 1
            goto L33
        L4b:
            int r5 = r3.size()
            if (r0 >= r5) goto L63
            h7.ig r5 = r4.f11684a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.mo6731r(r2, r1)
            int r0 = r0 + 1
            goto L4b
        L63:
            return
    }

    /* renamed from: h */
    public static void m6914h(int r2, java.util.List<java.lang.Integer> r3, p124h7.C2700jg r4, boolean r5) {
            if (r3 == 0) goto L5f
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L5f
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L47
            h7.ig r5 = r4.f11684a
            r1 = 2
            r5.mo6735v(r2, r1)
            r2 = 0
            r5 = 0
        L16:
            int r1 = r3.size()
            if (r2 >= r1) goto L2a
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.intValue()
            int r5 = r5 + 4
            int r2 = r2 + 1
            goto L16
        L2a:
            h7.ig r2 = r4.f11684a
            r2.mo6737x(r5)
        L2f:
            int r2 = r3.size()
            if (r0 >= r2) goto L5f
            h7.ig r2 = r4.f11684a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.mo6728o(r5)
            int r0 = r0 + 1
            goto L2f
        L47:
            int r5 = r3.size()
            if (r0 >= r5) goto L5f
            h7.ig r5 = r4.f11684a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.mo6727n(r2, r1)
            int r0 = r0 + 1
            goto L47
        L5f:
            return
    }

    /* renamed from: i */
    public static void m6915i(int r3, java.util.List<java.lang.Long> r4, p124h7.C2700jg r5, boolean r6) {
            if (r4 == 0) goto L5f
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L5f
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L47
            h7.ig r6 = r5.f11684a
            r1 = 2
            r6.mo6735v(r3, r1)
            r3 = 0
            r6 = 0
        L16:
            int r1 = r4.size()
            if (r3 >= r1) goto L2a
            java.lang.Object r1 = r4.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            r1.longValue()
            int r6 = r6 + 8
            int r3 = r3 + 1
            goto L16
        L2a:
            h7.ig r3 = r5.f11684a
            r3.mo6737x(r6)
        L2f:
            int r3 = r4.size()
            if (r0 >= r3) goto L5f
            h7.ig r3 = r5.f11684a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r3.mo6730q(r1)
            int r0 = r0 + 1
            goto L2f
        L47:
            int r6 = r4.size()
            if (r0 >= r6) goto L5f
            h7.ig r6 = r5.f11684a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.mo6729p(r3, r1)
            int r0 = r0 + 1
            goto L47
        L5f:
            return
    }

    /* renamed from: j */
    public static void m6916j(int r2, java.util.List<java.lang.Float> r3, p124h7.C2700jg r4, boolean r5) {
            if (r3 == 0) goto L67
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L67
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L4b
            h7.ig r5 = r4.f11684a
            r1 = 2
            r5.mo6735v(r2, r1)
            r2 = 0
            r5 = 0
        L16:
            int r1 = r3.size()
            if (r2 >= r1) goto L2a
            java.lang.Object r1 = r3.get(r2)
            java.lang.Float r1 = (java.lang.Float) r1
            r1.floatValue()
            int r5 = r5 + 4
            int r2 = r2 + 1
            goto L16
        L2a:
            h7.ig r2 = r4.f11684a
            r2.mo6737x(r5)
        L2f:
            int r2 = r3.size()
            if (r0 >= r2) goto L67
            h7.ig r2 = r4.f11684a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            r2.mo6728o(r5)
            int r0 = r0 + 1
            goto L2f
        L4b:
            int r5 = r3.size()
            if (r0 >= r5) goto L67
            h7.ig r5 = r4.f11684a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r5.mo6727n(r2, r1)
            int r0 = r0 + 1
            goto L4b
        L67:
            return
    }

    /* renamed from: k */
    public static void m6917k(int r2, java.util.List<?> r3, p124h7.C2700jg r4, p124h7.InterfaceC2666i0 r5) {
            if (r3 == 0) goto L19
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L19
            r0 = 0
        L9:
            int r1 = r3.size()
            if (r0 >= r1) goto L19
            java.lang.Object r1 = r3.get(r0)
            r4.m6881e(r2, r1, r5)
            int r0 = r0 + 1
            goto L9
        L19:
            return
    }

    /* renamed from: l */
    public static void m6918l(int r2, java.util.List<java.lang.Integer> r3, p124h7.C2700jg r4, boolean r5) {
            if (r3 == 0) goto L63
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L63
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L4b
            h7.ig r5 = r4.f11684a
            r1 = 2
            r5.mo6735v(r2, r1)
            r2 = 0
            r5 = 0
        L16:
            int r1 = r3.size()
            if (r2 >= r1) goto L2e
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = p124h7.AbstractC2682ig.m6837C(r1)
            int r5 = r5 + r1
            int r2 = r2 + 1
            goto L16
        L2e:
            h7.ig r2 = r4.f11684a
            r2.mo6737x(r5)
        L33:
            int r2 = r3.size()
            if (r0 >= r2) goto L63
            h7.ig r2 = r4.f11684a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.mo6732s(r5)
            int r0 = r0 + 1
            goto L33
        L4b:
            int r5 = r3.size()
            if (r0 >= r5) goto L63
            h7.ig r5 = r4.f11684a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.mo6731r(r2, r1)
            int r0 = r0 + 1
            goto L4b
        L63:
            return
    }

    /* renamed from: m */
    public static void m6919m(int r3, java.util.List<java.lang.Long> r4, p124h7.C2700jg r5, boolean r6) {
            if (r4 == 0) goto L63
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L63
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L4b
            h7.ig r6 = r5.f11684a
            r1 = 2
            r6.mo6735v(r3, r1)
            r3 = 0
            r6 = 0
        L16:
            int r1 = r4.size()
            if (r3 >= r1) goto L2e
            java.lang.Object r1 = r4.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = p124h7.AbstractC2682ig.m6842i(r1)
            int r6 = r6 + r1
            int r3 = r3 + 1
            goto L16
        L2e:
            h7.ig r3 = r5.f11684a
            r3.mo6737x(r6)
        L33:
            int r3 = r4.size()
            if (r0 >= r3) goto L63
            h7.ig r3 = r5.f11684a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r3.mo6739z(r1)
            int r0 = r0 + 1
            goto L33
        L4b:
            int r6 = r4.size()
            if (r0 >= r6) goto L63
            h7.ig r6 = r5.f11684a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.mo6738y(r3, r1)
            int r0 = r0 + 1
            goto L4b
        L63:
            return
    }

    /* renamed from: n */
    public static void m6920n(int r3, java.util.List<?> r4, p124h7.C2700jg r5, p124h7.InterfaceC2666i0 r6) {
            if (r4 == 0) goto L1d
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L1d
            r0 = 0
        L9:
            int r1 = r4.size()
            if (r0 >= r1) goto L1d
            java.lang.Object r1 = r4.get(r0)
            h7.ig r2 = r5.f11684a
            h7.x r1 = (p124h7.InterfaceC2935x) r1
            r2.mo6733t(r3, r1, r6)
            int r0 = r0 + 1
            goto L9
        L1d:
            return
    }

    /* renamed from: o */
    public static void m6921o(int r2, java.util.List<java.lang.Integer> r3, p124h7.C2700jg r4, boolean r5) {
            if (r3 == 0) goto L5f
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L5f
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L47
            h7.ig r5 = r4.f11684a
            r1 = 2
            r5.mo6735v(r2, r1)
            r2 = 0
            r5 = 0
        L16:
            int r1 = r3.size()
            if (r2 >= r1) goto L2a
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.intValue()
            int r5 = r5 + 4
            int r2 = r2 + 1
            goto L16
        L2a:
            h7.ig r2 = r4.f11684a
            r2.mo6737x(r5)
        L2f:
            int r2 = r3.size()
            if (r0 >= r2) goto L5f
            h7.ig r2 = r4.f11684a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.mo6728o(r5)
            int r0 = r0 + 1
            goto L2f
        L47:
            int r5 = r3.size()
            if (r0 >= r5) goto L5f
            h7.ig r5 = r4.f11684a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.mo6727n(r2, r1)
            int r0 = r0 + 1
            goto L47
        L5f:
            return
    }

    /* renamed from: p */
    public static void m6922p(int r3, java.util.List<java.lang.Long> r4, p124h7.C2700jg r5, boolean r6) {
            if (r4 == 0) goto L5f
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L5f
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L47
            h7.ig r6 = r5.f11684a
            r1 = 2
            r6.mo6735v(r3, r1)
            r3 = 0
            r6 = 0
        L16:
            int r1 = r4.size()
            if (r3 >= r1) goto L2a
            java.lang.Object r1 = r4.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            r1.longValue()
            int r6 = r6 + 8
            int r3 = r3 + 1
            goto L16
        L2a:
            h7.ig r3 = r5.f11684a
            r3.mo6737x(r6)
        L2f:
            int r3 = r4.size()
            if (r0 >= r3) goto L5f
            h7.ig r3 = r5.f11684a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r3.mo6730q(r1)
            int r0 = r0 + 1
            goto L2f
        L47:
            int r6 = r4.size()
            if (r0 >= r6) goto L5f
            h7.ig r6 = r5.f11684a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.mo6729p(r3, r1)
            int r0 = r0 + 1
            goto L47
        L5f:
            return
    }

    /* renamed from: q */
    public static void m6923q(int r3, java.util.List<java.lang.Integer> r4, p124h7.C2700jg r5, boolean r6) {
            if (r4 == 0) goto L72
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L72
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L55
            h7.ig r6 = r5.f11684a
            r1 = 2
            r6.mo6735v(r3, r1)
            r3 = 0
            r6 = 0
        L16:
            int r1 = r4.size()
            if (r3 >= r1) goto L33
            java.lang.Object r1 = r4.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r2 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r2
            int r1 = p124h7.AbstractC2682ig.m6841h(r1)
            int r6 = r6 + r1
            int r3 = r3 + 1
            goto L16
        L33:
            h7.ig r3 = r5.f11684a
            r3.mo6737x(r6)
        L38:
            int r3 = r4.size()
            if (r0 >= r3) goto L72
            h7.ig r3 = r5.f11684a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r1 = r6 + r6
            int r6 = r6 >> 31
            r6 = r6 ^ r1
            r3.mo6737x(r6)
            int r0 = r0 + 1
            goto L38
        L55:
            int r6 = r4.size()
            if (r0 >= r6) goto L72
            h7.ig r6 = r5.f11684a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r2 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r2
            r6.mo6736w(r3, r1)
            int r0 = r0 + 1
            goto L55
        L72:
            return
    }

    /* renamed from: r */
    public static void m6924r(int r6, java.util.List<java.lang.Long> r7, p124h7.C2700jg r8, boolean r9) {
            if (r7 == 0) goto L71
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L71
            java.util.Objects.requireNonNull(r8)
            r0 = 63
            r1 = 0
            if (r9 == 0) goto L55
            h7.ig r9 = r8.f11684a
            r2 = 2
            r9.mo6735v(r6, r2)
            r6 = 0
            r9 = 0
        L18:
            int r2 = r7.size()
            if (r6 >= r2) goto L34
            java.lang.Object r2 = r7.get(r6)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r4 = r2 + r2
            long r2 = r2 >> r0
            long r2 = r2 ^ r4
            int r2 = p124h7.AbstractC2682ig.m6842i(r2)
            int r9 = r9 + r2
            int r6 = r6 + 1
            goto L18
        L34:
            h7.ig r6 = r8.f11684a
            r6.mo6737x(r9)
        L39:
            int r6 = r7.size()
            if (r1 >= r6) goto L71
            h7.ig r6 = r8.f11684a
            java.lang.Object r9 = r7.get(r1)
            java.lang.Long r9 = (java.lang.Long) r9
            long r2 = r9.longValue()
            long r4 = r2 + r2
            long r2 = r2 >> r0
            long r2 = r2 ^ r4
            r6.mo6739z(r2)
            int r1 = r1 + 1
            goto L39
        L55:
            int r9 = r7.size()
            if (r1 >= r9) goto L71
            h7.ig r9 = r8.f11684a
            java.lang.Object r2 = r7.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r4 = r2 + r2
            long r2 = r2 >> r0
            long r2 = r2 ^ r4
            r9.mo6738y(r6, r2)
            int r1 = r1 + 1
            goto L55
        L71:
            return
    }

    /* renamed from: s */
    public static void m6925s(int r4, java.util.List<java.lang.String> r5, p124h7.C2700jg r6) {
            if (r5 == 0) goto L47
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L47
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r5 instanceof p124h7.InterfaceC2683j
            r1 = 0
            if (r0 == 0) goto L33
            r0 = r5
            h7.j r0 = (p124h7.InterfaceC2683j) r0
        L13:
            int r2 = r5.size()
            if (r1 >= r2) goto L47
            java.lang.Object r2 = r0.mo6824j(r1)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L29
            h7.ig r3 = r6.f11684a
            java.lang.String r2 = (java.lang.String) r2
            r3.mo6734u(r4, r2)
            goto L30
        L29:
            h7.ig r3 = r6.f11684a
            h7.cg r2 = (p124h7.AbstractC2574cg) r2
            r3.mo6726m(r4, r2)
        L30:
            int r1 = r1 + 1
            goto L13
        L33:
            int r0 = r5.size()
            if (r1 >= r0) goto L47
            h7.ig r0 = r6.f11684a
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.mo6734u(r4, r2)
            int r1 = r1 + 1
            goto L33
        L47:
            return
    }

    /* renamed from: t */
    public static void m6926t(int r2, java.util.List<java.lang.Integer> r3, p124h7.C2700jg r4, boolean r5) {
            if (r3 == 0) goto L63
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L63
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L4b
            h7.ig r5 = r4.f11684a
            r1 = 2
            r5.mo6735v(r2, r1)
            r2 = 0
            r5 = 0
        L16:
            int r1 = r3.size()
            if (r2 >= r1) goto L2e
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = p124h7.AbstractC2682ig.m6841h(r1)
            int r5 = r5 + r1
            int r2 = r2 + 1
            goto L16
        L2e:
            h7.ig r2 = r4.f11684a
            r2.mo6737x(r5)
        L33:
            int r2 = r3.size()
            if (r0 >= r2) goto L63
            h7.ig r2 = r4.f11684a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.mo6737x(r5)
            int r0 = r0 + 1
            goto L33
        L4b:
            int r5 = r3.size()
            if (r0 >= r5) goto L63
            h7.ig r5 = r4.f11684a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.mo6736w(r2, r1)
            int r0 = r0 + 1
            goto L4b
        L63:
            return
    }

    /* renamed from: u */
    public static int m6927u(int r0, java.util.List r1) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 << 3
            int r0 = p124h7.AbstractC2682ig.m6841h(r0)
            int r0 = r0 + 1
            int r0 = r0 * r1
            return r0
    }

    /* renamed from: v */
    public static void m6928v(int r3, java.util.List<java.lang.Long> r4, p124h7.C2700jg r5, boolean r6) {
            if (r4 == 0) goto L63
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L63
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L4b
            h7.ig r6 = r5.f11684a
            r1 = 2
            r6.mo6735v(r3, r1)
            r3 = 0
            r6 = 0
        L16:
            int r1 = r4.size()
            if (r3 >= r1) goto L2e
            java.lang.Object r1 = r4.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = p124h7.AbstractC2682ig.m6842i(r1)
            int r6 = r6 + r1
            int r3 = r3 + 1
            goto L16
        L2e:
            h7.ig r3 = r5.f11684a
            r3.mo6737x(r6)
        L33:
            int r3 = r4.size()
            if (r0 >= r3) goto L63
            h7.ig r3 = r5.f11684a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r3.mo6739z(r1)
            int r0 = r0 + 1
            goto L33
        L4b:
            int r6 = r4.size()
            if (r0 >= r6) goto L63
            h7.ig r6 = r5.f11684a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.mo6738y(r3, r1)
            int r0 = r0 + 1
            goto L4b
        L63:
            return
    }

    /* renamed from: w */
    public static p124h7.AbstractC2900v0<?, ?> m6929w(boolean r6) {
            r0 = 0
            java.lang.String r1 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L8
            goto L9
        L8:
            r1 = r0
        L9:
            if (r1 != 0) goto Lc
            return r0
        Lc:
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L27
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L27
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L27
            r2[r5] = r6     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L27
            h7.v0 r6 = (p124h7.AbstractC2900v0) r6     // Catch: java.lang.Throwable -> L27
            return r6
        L27:
            return r0
    }

    /* renamed from: x */
    public static int m6930x(int r2, java.util.List<p124h7.AbstractC2574cg> r3) {
            int r0 = r3.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = p124h7.AbstractC2682ig.m6840g(r2)
            int r2 = r2 * r0
        Le:
            int r0 = r3.size()
            if (r1 >= r0) goto L22
            java.lang.Object r0 = r3.get(r1)
            h7.cg r0 = (p124h7.AbstractC2574cg) r0
            int r0 = p124h7.AbstractC2682ig.m6835A(r0)
            int r2 = r2 + r0
            int r1 = r1 + 1
            goto Le
        L22:
            return r2
    }

    /* renamed from: y */
    public static int m6931y(int r0, java.util.List<java.lang.Integer> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = m6932z(r1)
            int r0 = p124h7.AbstractC2682ig.m6840g(r0)
            int r0 = r0 * r2
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: z */
    public static int m6932z(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof p124h7.C2988zg
            if (r2 == 0) goto L1d
            h7.zg r4 = (p124h7.C2988zg) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.m7359e(r1)
            int r3 = p124h7.AbstractC2682ig.m6837C(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = p124h7.AbstractC2682ig.m6837C(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }
}
