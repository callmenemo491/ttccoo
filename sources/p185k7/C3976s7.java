package p185k7;

/* renamed from: k7.s7 */
/* loaded from: classes.dex */
public final class C3976s7 {

    /* renamed from: a */
    public static final java.lang.Class<?> f16860a = null;

    /* renamed from: b */
    public static final p185k7.AbstractC3761c8<?, ?> f16861b = null;

    /* renamed from: c */
    public static final p185k7.AbstractC3761c8<?, ?> f16862c = null;

    /* renamed from: d */
    public static final p185k7.AbstractC3761c8<?, ?> f16863d = null;

    static {
            java.lang.String r0 = "rb.c"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            p185k7.C3976s7.f16860a = r0
            r0 = 0
            k7.c8 r0 = m8998u(r0)
            p185k7.C3976s7.f16861b = r0
            r0 = 1
            k7.c8 r0 = m8998u(r0)
            p185k7.C3976s7.f16862c = r0
            k7.e8 r0 = new k7.e8
            r0.<init>()
            p185k7.C3976s7.f16863d = r0
            return
    }

    /* renamed from: A */
    public static int m8960A(int r0, java.util.List r1) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 << 3
            int r0 = p185k7.AbstractC3896m5.m8824m(r0)
            int r0 = r0 + 8
            int r0 = r0 * r1
            return r0
    }

    /* renamed from: B */
    public static int m8961B(java.util.List<?> r0) {
            int r0 = r0.size()
            int r0 = r0 * 8
            return r0
    }

    /* renamed from: C */
    public static int m8962C(int r4, java.util.List<p185k7.InterfaceC3802f7> r5, p185k7.InterfaceC3950q7 r6) {
            int r0 = r5.size()
            r1 = 0
            if (r0 == 0) goto L19
            r2 = 0
        L8:
            if (r1 >= r0) goto L18
            java.lang.Object r3 = r5.get(r1)
            k7.f7 r3 = (p185k7.InterfaceC3802f7) r3
            int r3 = p185k7.AbstractC3896m5.m8819F(r4, r3, r6)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L8
        L18:
            return r2
        L19:
            return r1
    }

    /* renamed from: D */
    public static int m8963D(int r0, java.util.List<java.lang.Integer> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = m8964E(r1)
            int r0 = p185k7.AbstractC3896m5.m8823J(r0)
            int r0 = r0 * r2
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: E */
    public static int m8964E(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof p185k7.C3801f6
            if (r2 == 0) goto L1d
            k7.f6 r4 = (p185k7.C3801f6) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.m8536e(r1)
            int r3 = p185k7.AbstractC3896m5.m8820G(r3)
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
            int r3 = p185k7.AbstractC3896m5.m8820G(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    /* renamed from: F */
    public static int m8965F(int r1, java.util.List r2) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = m8966G(r2)
            int r2 = r2.size()
            int r1 = p185k7.AbstractC3896m5.m8823J(r1)
            int r1 = r1 * r2
            int r1 = r1 + r0
            return r1
    }

    /* renamed from: G */
    public static int m8966G(java.util.List<java.lang.Long> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof p185k7.C4001u6
            if (r2 == 0) goto L1d
            k7.u6 r5 = (p185k7.C4001u6) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.m9057e(r1)
            int r3 = p185k7.AbstractC3896m5.m8825n(r3)
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
            int r3 = p185k7.AbstractC3896m5.m8825n(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    /* renamed from: H */
    public static int m8967H(int r1, java.lang.Object r2, p185k7.InterfaceC3950q7 r3) {
            boolean r0 = r2 instanceof p185k7.C3923o6
            if (r0 == 0) goto L17
            k7.o6 r2 = (p185k7.C3923o6) r2
            int r1 = r1 << 3
            int r1 = p185k7.AbstractC3896m5.m8824m(r1)
            int r2 = r2.m8865a()
            int r3 = p185k7.AbstractC3896m5.m8824m(r2)
            int r3 = r3 + r2
            int r3 = r3 + r1
            return r3
        L17:
            k7.f7 r2 = (p185k7.InterfaceC3802f7) r2
            int r1 = r1 << 3
            int r1 = p185k7.AbstractC3896m5.m8824m(r1)
            int r2 = p185k7.AbstractC3896m5.m8821H(r2, r3)
            int r2 = r2 + r1
            return r2
    }

    /* renamed from: I */
    public static int m8968I(int r4, java.util.List<?> r5, p185k7.InterfaceC3950q7 r6) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r4 = p185k7.AbstractC3896m5.m8823J(r4)
            int r4 = r4 * r0
        Le:
            if (r1 >= r0) goto L30
            java.lang.Object r2 = r5.get(r1)
            boolean r3 = r2 instanceof p185k7.C3923o6
            if (r3 == 0) goto L25
            k7.o6 r2 = (p185k7.C3923o6) r2
            int r2 = r2.m8865a()
            int r3 = p185k7.AbstractC3896m5.m8824m(r2)
            int r3 = r3 + r2
            int r4 = r4 + r3
            goto L2d
        L25:
            k7.f7 r2 = (p185k7.InterfaceC3802f7) r2
            int r2 = p185k7.AbstractC3896m5.m8821H(r2, r6)
            int r2 = r2 + r4
            r4 = r2
        L2d:
            int r1 = r1 + 1
            goto Le
        L30:
            return r4
    }

    /* renamed from: J */
    public static int m8969J(int r0, java.util.List<java.lang.Integer> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = m8970K(r1)
            int r0 = p185k7.AbstractC3896m5.m8823J(r0)
            int r0 = r0 * r2
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: K */
    public static int m8970K(java.util.List<java.lang.Integer> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof p185k7.C3801f6
            if (r2 == 0) goto L22
            k7.f6 r5 = (p185k7.C3801f6) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L3c
            int r3 = r5.m8536e(r1)
            int r4 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r4
            int r3 = p185k7.AbstractC3896m5.m8824m(r3)
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
            int r3 = p185k7.AbstractC3896m5.m8824m(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L23
        L3c:
            return r2
    }

    /* renamed from: L */
    public static int m8971L(int r0, java.util.List<java.lang.Long> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = m8972M(r1)
            int r0 = p185k7.AbstractC3896m5.m8823J(r0)
            int r0 = r0 * r2
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: M */
    public static int m8972M(java.util.List<java.lang.Long> r8) {
            int r0 = r8.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r8 instanceof p185k7.C4001u6
            r3 = 63
            if (r2 == 0) goto L23
            k7.u6 r8 = (p185k7.C4001u6) r8
            r2 = 0
        L11:
            if (r1 >= r0) goto L3c
            long r4 = r8.m9057e(r1)
            long r6 = r4 + r4
            long r4 = r4 >> r3
            long r4 = r4 ^ r6
            int r4 = p185k7.AbstractC3896m5.m8825n(r4)
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
            int r4 = p185k7.AbstractC3896m5.m8825n(r4)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L24
        L3c:
            return r2
    }

    /* renamed from: N */
    public static int m8973N(int r4, java.util.List<?> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r4 = p185k7.AbstractC3896m5.m8823J(r4)
            int r4 = r4 * r0
            boolean r2 = r5 instanceof p185k7.InterfaceC3949q6
            if (r2 == 0) goto L30
            k7.q6 r5 = (p185k7.InterfaceC3949q6) r5
        L14:
            if (r1 >= r0) goto L4c
            java.lang.Object r2 = r5.mo8544j(r1)
            boolean r3 = r2 instanceof p185k7.AbstractC3842i5
            if (r3 == 0) goto L25
            k7.i5 r2 = (p185k7.AbstractC3842i5) r2
            int r2 = p185k7.AbstractC3896m5.m8818E(r2)
            goto L2b
        L25:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = p185k7.AbstractC3896m5.m8822I(r2)
        L2b:
            int r2 = r2 + r4
            r4 = r2
            int r1 = r1 + 1
            goto L14
        L30:
            if (r1 >= r0) goto L4c
            java.lang.Object r2 = r5.get(r1)
            boolean r3 = r2 instanceof p185k7.AbstractC3842i5
            if (r3 == 0) goto L41
            k7.i5 r2 = (p185k7.AbstractC3842i5) r2
            int r2 = p185k7.AbstractC3896m5.m8818E(r2)
            goto L47
        L41:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = p185k7.AbstractC3896m5.m8822I(r2)
        L47:
            int r2 = r2 + r4
            r4 = r2
            int r1 = r1 + 1
            goto L30
        L4c:
            return r4
    }

    /* renamed from: O */
    public static int m8974O(int r0, java.util.List<java.lang.Integer> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = m8975P(r1)
            int r0 = p185k7.AbstractC3896m5.m8823J(r0)
            int r0 = r0 * r2
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: P */
    public static int m8975P(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof p185k7.C3801f6
            if (r2 == 0) goto L1d
            k7.f6 r4 = (p185k7.C3801f6) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.m8536e(r1)
            int r3 = p185k7.AbstractC3896m5.m8824m(r3)
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
            int r3 = p185k7.AbstractC3896m5.m8824m(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    /* renamed from: Q */
    public static int m8976Q(int r0, java.util.List<java.lang.Long> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = m8977R(r1)
            int r0 = p185k7.AbstractC3896m5.m8823J(r0)
            int r0 = r0 * r2
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: R */
    public static int m8977R(java.util.List<java.lang.Long> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof p185k7.C4001u6
            if (r2 == 0) goto L1d
            k7.u6 r5 = (p185k7.C4001u6) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.m9057e(r1)
            int r3 = p185k7.AbstractC3896m5.m8825n(r3)
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
            int r3 = p185k7.AbstractC3896m5.m8825n(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    /* renamed from: a */
    public static boolean m8978a(java.lang.Object r2, java.lang.Object r3) {
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

    /* renamed from: b */
    public static void m8979b(int r2, java.util.List<java.lang.Boolean> r3, p185k7.C3909n5 r4, boolean r5) {
            if (r3 == 0) goto L5f
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L5f
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L47
            k7.m5 r5 = r4.f16756a
            r1 = 2
            r5.mo8780z(r2, r1)
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
            k7.m5 r2 = r4.f16756a
            r2.mo8764B(r5)
        L2f:
            int r2 = r3.size()
            if (r0 >= r2) goto L5f
            k7.m5 r2 = r4.f16756a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r2.mo8770o(r5)
            int r0 = r0 + 1
            goto L2f
        L47:
            int r5 = r3.size()
            if (r0 >= r5) goto L5f
            k7.m5 r5 = r4.f16756a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r5.mo8771p(r2, r1)
            int r0 = r0 + 1
            goto L47
        L5f:
            return
    }

    /* renamed from: c */
    public static void m8980c(int r3, java.util.List<p185k7.AbstractC3842i5> r4, p185k7.C3909n5 r5) {
            if (r4 == 0) goto L20
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L20
            java.util.Objects.requireNonNull(r5)
            r0 = 0
        Lc:
            int r1 = r4.size()
            if (r0 >= r1) goto L20
            k7.m5 r1 = r5.f16756a
            java.lang.Object r2 = r4.get(r0)
            k7.i5 r2 = (p185k7.AbstractC3842i5) r2
            r1.mo8772q(r3, r2)
            int r0 = r0 + 1
            goto Lc
        L20:
            return
    }

    /* renamed from: d */
    public static void m8981d(int r3, java.util.List<java.lang.Double> r4, p185k7.C3909n5 r5, boolean r6) {
            if (r4 == 0) goto L67
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L67
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L4b
            k7.m5 r6 = r5.f16756a
            r1 = 2
            r6.mo8780z(r3, r1)
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
            k7.m5 r3 = r5.f16756a
            r3.mo8764B(r6)
        L2f:
            int r3 = r4.size()
            if (r0 >= r3) goto L67
            k7.m5 r3 = r5.f16756a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Double r6 = (java.lang.Double) r6
            double r1 = r6.doubleValue()
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r3.mo8776v(r1)
            int r0 = r0 + 1
            goto L2f
        L4b:
            int r6 = r4.size()
            if (r0 >= r6) goto L67
            k7.m5 r6 = r5.f16756a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r6.mo8775u(r3, r1)
            int r0 = r0 + 1
            goto L4b
        L67:
            return
    }

    /* renamed from: e */
    public static void m8982e(int r2, java.util.List<java.lang.Integer> r3, p185k7.C3909n5 r4, boolean r5) {
            if (r3 == 0) goto L63
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L63
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L4b
            k7.m5 r5 = r4.f16756a
            r1 = 2
            r5.mo8780z(r2, r1)
            r2 = 0
            r5 = 0
        L16:
            int r1 = r3.size()
            if (r2 >= r1) goto L2e
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = p185k7.AbstractC3896m5.m8820G(r1)
            int r5 = r5 + r1
            int r2 = r2 + 1
            goto L16
        L2e:
            k7.m5 r2 = r4.f16756a
            r2.mo8764B(r5)
        L33:
            int r2 = r3.size()
            if (r0 >= r2) goto L63
            k7.m5 r2 = r4.f16756a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.mo8778x(r5)
            int r0 = r0 + 1
            goto L33
        L4b:
            int r5 = r3.size()
            if (r0 >= r5) goto L63
            k7.m5 r5 = r4.f16756a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.mo8777w(r2, r1)
            int r0 = r0 + 1
            goto L4b
        L63:
            return
    }

    /* renamed from: f */
    public static void m8983f(int r2, java.util.List<java.lang.Integer> r3, p185k7.C3909n5 r4, boolean r5) {
            if (r3 == 0) goto L5f
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L5f
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L47
            k7.m5 r5 = r4.f16756a
            r1 = 2
            r5.mo8780z(r2, r1)
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
            k7.m5 r2 = r4.f16756a
            r2.mo8764B(r5)
        L2f:
            int r2 = r3.size()
            if (r0 >= r2) goto L5f
            k7.m5 r2 = r4.f16756a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.mo8774t(r5)
            int r0 = r0 + 1
            goto L2f
        L47:
            int r5 = r3.size()
            if (r0 >= r5) goto L5f
            k7.m5 r5 = r4.f16756a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.mo8773r(r2, r1)
            int r0 = r0 + 1
            goto L47
        L5f:
            return
    }

    /* renamed from: g */
    public static void m8984g(int r3, java.util.List<java.lang.Long> r4, p185k7.C3909n5 r5, boolean r6) {
            if (r4 == 0) goto L5f
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L5f
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L47
            k7.m5 r6 = r5.f16756a
            r1 = 2
            r6.mo8780z(r3, r1)
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
            k7.m5 r3 = r5.f16756a
            r3.mo8764B(r6)
        L2f:
            int r3 = r4.size()
            if (r0 >= r3) goto L5f
            k7.m5 r3 = r5.f16756a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r3.mo8776v(r1)
            int r0 = r0 + 1
            goto L2f
        L47:
            int r6 = r4.size()
            if (r0 >= r6) goto L5f
            k7.m5 r6 = r5.f16756a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.mo8775u(r3, r1)
            int r0 = r0 + 1
            goto L47
        L5f:
            return
    }

    /* renamed from: h */
    public static void m8985h(int r2, java.util.List<java.lang.Float> r3, p185k7.C3909n5 r4, boolean r5) {
            if (r3 == 0) goto L67
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L67
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L4b
            k7.m5 r5 = r4.f16756a
            r1 = 2
            r5.mo8780z(r2, r1)
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
            k7.m5 r2 = r4.f16756a
            r2.mo8764B(r5)
        L2f:
            int r2 = r3.size()
            if (r0 >= r2) goto L67
            k7.m5 r2 = r4.f16756a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            r2.mo8774t(r5)
            int r0 = r0 + 1
            goto L2f
        L4b:
            int r5 = r3.size()
            if (r0 >= r5) goto L67
            k7.m5 r5 = r4.f16756a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r5.mo8773r(r2, r1)
            int r0 = r0 + 1
            goto L4b
        L67:
            return
    }

    /* renamed from: i */
    public static void m8986i(int r2, java.util.List<?> r3, p185k7.C3909n5 r4, p185k7.InterfaceC3950q7 r5) {
            if (r3 == 0) goto L19
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L19
            r0 = 0
        L9:
            int r1 = r3.size()
            if (r0 >= r1) goto L19
            java.lang.Object r1 = r3.get(r0)
            r4.m8846e(r2, r1, r5)
            int r0 = r0 + 1
            goto L9
        L19:
            return
    }

    /* renamed from: j */
    public static void m8987j(int r2, java.util.List<java.lang.Integer> r3, p185k7.C3909n5 r4, boolean r5) {
            if (r3 == 0) goto L63
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L63
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L4b
            k7.m5 r5 = r4.f16756a
            r1 = 2
            r5.mo8780z(r2, r1)
            r2 = 0
            r5 = 0
        L16:
            int r1 = r3.size()
            if (r2 >= r1) goto L2e
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = p185k7.AbstractC3896m5.m8820G(r1)
            int r5 = r5 + r1
            int r2 = r2 + 1
            goto L16
        L2e:
            k7.m5 r2 = r4.f16756a
            r2.mo8764B(r5)
        L33:
            int r2 = r3.size()
            if (r0 >= r2) goto L63
            k7.m5 r2 = r4.f16756a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.mo8778x(r5)
            int r0 = r0 + 1
            goto L33
        L4b:
            int r5 = r3.size()
            if (r0 >= r5) goto L63
            k7.m5 r5 = r4.f16756a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.mo8777w(r2, r1)
            int r0 = r0 + 1
            goto L4b
        L63:
            return
    }

    /* renamed from: k */
    public static void m8988k(int r3, java.util.List<java.lang.Long> r4, p185k7.C3909n5 r5, boolean r6) {
            if (r4 == 0) goto L63
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L63
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L4b
            k7.m5 r6 = r5.f16756a
            r1 = 2
            r6.mo8780z(r3, r1)
            r3 = 0
            r6 = 0
        L16:
            int r1 = r4.size()
            if (r3 >= r1) goto L2e
            java.lang.Object r1 = r4.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = p185k7.AbstractC3896m5.m8825n(r1)
            int r6 = r6 + r1
            int r3 = r3 + 1
            goto L16
        L2e:
            k7.m5 r3 = r5.f16756a
            r3.mo8764B(r6)
        L33:
            int r3 = r4.size()
            if (r0 >= r3) goto L63
            k7.m5 r3 = r5.f16756a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r3.mo8766D(r1)
            int r0 = r0 + 1
            goto L33
        L4b:
            int r6 = r4.size()
            if (r0 >= r6) goto L63
            k7.m5 r6 = r5.f16756a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.mo8765C(r3, r1)
            int r0 = r0 + 1
            goto L4b
        L63:
            return
    }

    /* renamed from: l */
    public static void m8989l(int r2, java.util.List<?> r3, p185k7.C3909n5 r4, p185k7.InterfaceC3950q7 r5) {
            if (r3 == 0) goto L19
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L19
            r0 = 0
        L9:
            int r1 = r3.size()
            if (r0 >= r1) goto L19
            java.lang.Object r1 = r3.get(r0)
            r4.m8847f(r2, r1, r5)
            int r0 = r0 + 1
            goto L9
        L19:
            return
    }

    /* renamed from: m */
    public static void m8990m(int r2, java.util.List<java.lang.Integer> r3, p185k7.C3909n5 r4, boolean r5) {
            if (r3 == 0) goto L5f
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L5f
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L47
            k7.m5 r5 = r4.f16756a
            r1 = 2
            r5.mo8780z(r2, r1)
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
            k7.m5 r2 = r4.f16756a
            r2.mo8764B(r5)
        L2f:
            int r2 = r3.size()
            if (r0 >= r2) goto L5f
            k7.m5 r2 = r4.f16756a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.mo8774t(r5)
            int r0 = r0 + 1
            goto L2f
        L47:
            int r5 = r3.size()
            if (r0 >= r5) goto L5f
            k7.m5 r5 = r4.f16756a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.mo8773r(r2, r1)
            int r0 = r0 + 1
            goto L47
        L5f:
            return
    }

    /* renamed from: n */
    public static void m8991n(int r3, java.util.List<java.lang.Long> r4, p185k7.C3909n5 r5, boolean r6) {
            if (r4 == 0) goto L5f
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L5f
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L47
            k7.m5 r6 = r5.f16756a
            r1 = 2
            r6.mo8780z(r3, r1)
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
            k7.m5 r3 = r5.f16756a
            r3.mo8764B(r6)
        L2f:
            int r3 = r4.size()
            if (r0 >= r3) goto L5f
            k7.m5 r3 = r5.f16756a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r3.mo8776v(r1)
            int r0 = r0 + 1
            goto L2f
        L47:
            int r6 = r4.size()
            if (r0 >= r6) goto L5f
            k7.m5 r6 = r5.f16756a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.mo8775u(r3, r1)
            int r0 = r0 + 1
            goto L47
        L5f:
            return
    }

    /* renamed from: o */
    public static void m8992o(int r3, java.util.List<java.lang.Integer> r4, p185k7.C3909n5 r5, boolean r6) {
            if (r4 == 0) goto L72
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L72
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L55
            k7.m5 r6 = r5.f16756a
            r1 = 2
            r6.mo8780z(r3, r1)
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
            int r1 = p185k7.AbstractC3896m5.m8824m(r1)
            int r6 = r6 + r1
            int r3 = r3 + 1
            goto L16
        L33:
            k7.m5 r3 = r5.f16756a
            r3.mo8764B(r6)
        L38:
            int r3 = r4.size()
            if (r0 >= r3) goto L72
            k7.m5 r3 = r5.f16756a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r1 = r6 + r6
            int r6 = r6 >> 31
            r6 = r6 ^ r1
            r3.mo8764B(r6)
            int r0 = r0 + 1
            goto L38
        L55:
            int r6 = r4.size()
            if (r0 >= r6) goto L72
            k7.m5 r6 = r5.f16756a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r2 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r2
            r6.mo8763A(r3, r1)
            int r0 = r0 + 1
            goto L55
        L72:
            return
    }

    /* renamed from: p */
    public static void m8993p(int r6, java.util.List<java.lang.Long> r7, p185k7.C3909n5 r8, boolean r9) {
            if (r7 == 0) goto L71
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L71
            java.util.Objects.requireNonNull(r8)
            r0 = 63
            r1 = 0
            if (r9 == 0) goto L55
            k7.m5 r9 = r8.f16756a
            r2 = 2
            r9.mo8780z(r6, r2)
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
            int r2 = p185k7.AbstractC3896m5.m8825n(r2)
            int r9 = r9 + r2
            int r6 = r6 + 1
            goto L18
        L34:
            k7.m5 r6 = r8.f16756a
            r6.mo8764B(r9)
        L39:
            int r6 = r7.size()
            if (r1 >= r6) goto L71
            k7.m5 r6 = r8.f16756a
            java.lang.Object r9 = r7.get(r1)
            java.lang.Long r9 = (java.lang.Long) r9
            long r2 = r9.longValue()
            long r4 = r2 + r2
            long r2 = r2 >> r0
            long r2 = r2 ^ r4
            r6.mo8766D(r2)
            int r1 = r1 + 1
            goto L39
        L55:
            int r9 = r7.size()
            if (r1 >= r9) goto L71
            k7.m5 r9 = r8.f16756a
            java.lang.Object r2 = r7.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r4 = r2 + r2
            long r2 = r2 >> r0
            long r2 = r2 ^ r4
            r9.mo8765C(r6, r2)
            int r1 = r1 + 1
            goto L55
        L71:
            return
    }

    /* renamed from: q */
    public static void m8994q(int r4, java.util.List<java.lang.String> r5, p185k7.C3909n5 r6) {
            if (r5 == 0) goto L47
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L47
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r5 instanceof p185k7.InterfaceC3949q6
            r1 = 0
            if (r0 == 0) goto L33
            r0 = r5
            k7.q6 r0 = (p185k7.InterfaceC3949q6) r0
        L13:
            int r2 = r5.size()
            if (r1 >= r2) goto L47
            java.lang.Object r2 = r0.mo8544j(r1)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L29
            k7.m5 r3 = r6.f16756a
            java.lang.String r2 = (java.lang.String) r2
            r3.mo8779y(r4, r2)
            goto L30
        L29:
            k7.m5 r3 = r6.f16756a
            k7.i5 r2 = (p185k7.AbstractC3842i5) r2
            r3.mo8772q(r4, r2)
        L30:
            int r1 = r1 + 1
            goto L13
        L33:
            int r0 = r5.size()
            if (r1 >= r0) goto L47
            k7.m5 r0 = r6.f16756a
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.mo8779y(r4, r2)
            int r1 = r1 + 1
            goto L33
        L47:
            return
    }

    /* renamed from: r */
    public static void m8995r(int r2, java.util.List<java.lang.Integer> r3, p185k7.C3909n5 r4, boolean r5) {
            if (r3 == 0) goto L63
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L63
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L4b
            k7.m5 r5 = r4.f16756a
            r1 = 2
            r5.mo8780z(r2, r1)
            r2 = 0
            r5 = 0
        L16:
            int r1 = r3.size()
            if (r2 >= r1) goto L2e
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = p185k7.AbstractC3896m5.m8824m(r1)
            int r5 = r5 + r1
            int r2 = r2 + 1
            goto L16
        L2e:
            k7.m5 r2 = r4.f16756a
            r2.mo8764B(r5)
        L33:
            int r2 = r3.size()
            if (r0 >= r2) goto L63
            k7.m5 r2 = r4.f16756a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.mo8764B(r5)
            int r0 = r0 + 1
            goto L33
        L4b:
            int r5 = r3.size()
            if (r0 >= r5) goto L63
            k7.m5 r5 = r4.f16756a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.mo8763A(r2, r1)
            int r0 = r0 + 1
            goto L4b
        L63:
            return
    }

    /* renamed from: s */
    public static int m8996s(int r0, java.util.List r1) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 << 3
            int r0 = p185k7.AbstractC3896m5.m8824m(r0)
            int r0 = r0 + 1
            int r0 = r0 * r1
            return r0
    }

    /* renamed from: t */
    public static void m8997t(int r3, java.util.List<java.lang.Long> r4, p185k7.C3909n5 r5, boolean r6) {
            if (r4 == 0) goto L63
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L63
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L4b
            k7.m5 r6 = r5.f16756a
            r1 = 2
            r6.mo8780z(r3, r1)
            r3 = 0
            r6 = 0
        L16:
            int r1 = r4.size()
            if (r3 >= r1) goto L2e
            java.lang.Object r1 = r4.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = p185k7.AbstractC3896m5.m8825n(r1)
            int r6 = r6 + r1
            int r3 = r3 + 1
            goto L16
        L2e:
            k7.m5 r3 = r5.f16756a
            r3.mo8764B(r6)
        L33:
            int r3 = r4.size()
            if (r0 >= r3) goto L63
            k7.m5 r3 = r5.f16756a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r3.mo8766D(r1)
            int r0 = r0 + 1
            goto L33
        L4b:
            int r6 = r4.size()
            if (r0 >= r6) goto L63
            k7.m5 r6 = r5.f16756a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.mo8765C(r3, r1)
            int r0 = r0 + 1
            goto L4b
        L63:
            return
    }

    /* renamed from: u */
    public static p185k7.AbstractC3761c8<?, ?> m8998u(boolean r6) {
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
            k7.c8 r6 = (p185k7.AbstractC3761c8) r6     // Catch: java.lang.Throwable -> L27
            return r6
        L27:
            return r0
    }

    /* renamed from: v */
    public static int m8999v(int r2, java.util.List<p185k7.AbstractC3842i5> r3) {
            int r0 = r3.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = p185k7.AbstractC3896m5.m8823J(r2)
            int r2 = r2 * r0
        Le:
            int r0 = r3.size()
            if (r1 >= r0) goto L22
            java.lang.Object r0 = r3.get(r1)
            k7.i5 r0 = (p185k7.AbstractC3842i5) r0
            int r0 = p185k7.AbstractC3896m5.m8818E(r0)
            int r2 = r2 + r0
            int r1 = r1 + 1
            goto Le
        L22:
            return r2
    }

    /* renamed from: w */
    public static int m9000w(int r0, java.util.List<java.lang.Integer> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = m9001x(r1)
            int r0 = p185k7.AbstractC3896m5.m8823J(r0)
            int r0 = r0 * r2
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: x */
    public static int m9001x(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof p185k7.C3801f6
            if (r2 == 0) goto L1d
            k7.f6 r4 = (p185k7.C3801f6) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.m8536e(r1)
            int r3 = p185k7.AbstractC3896m5.m8820G(r3)
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
            int r3 = p185k7.AbstractC3896m5.m8820G(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    /* renamed from: y */
    public static int m9002y(int r0, java.util.List r1) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 << 3
            int r0 = p185k7.AbstractC3896m5.m8824m(r0)
            int r0 = r0 + 4
            int r0 = r0 * r1
            return r0
    }

    /* renamed from: z */
    public static int m9003z(java.util.List<?> r0) {
            int r0 = r0.size()
            int r0 = r0 * 4
            return r0
    }
}
