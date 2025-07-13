package p221m9;

/* renamed from: m9.g1 */
/* loaded from: classes.dex */
public final class C4453g1 {

    /* renamed from: a */
    public static final java.lang.Class<?> f18135a = null;

    /* renamed from: b */
    public static final p221m9.AbstractC4471m1<?, ?> f18136b = null;

    /* renamed from: c */
    public static final p221m9.AbstractC4471m1<?, ?> f18137c = null;

    /* renamed from: d */
    public static final p221m9.AbstractC4471m1<?, ?> f18138d = null;

    static {
            java.lang.String r0 = "com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            p221m9.C4453g1.f18135a = r0
            r0 = 0
            m9.m1 r0 = m10051z(r0)
            p221m9.C4453g1.f18136b = r0
            r0 = 1
            m9.m1 r0 = m10051z(r0)
            p221m9.C4453g1.f18137c = r0
            m9.o1 r0 = new m9.o1
            r0.<init>()
            p221m9.C4453g1.f18138d = r0
            return
    }

    /* renamed from: A */
    public static <T, FT extends p221m9.C4490t.a<FT>> void m10005A(p221m9.AbstractC4481q<FT> r1, T r2, T r3) {
            m9.t r3 = r1.mo10225c(r3)
            boolean r0 = r3.m10306h()
            if (r0 != 0) goto L40
            m9.t r1 = r1.mo10226d(r2)
            java.util.Objects.requireNonNull(r1)
            r2 = 0
        L12:
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r0 = r3.f18225a
            int r0 = r0.m10112d()
            if (r2 >= r0) goto L26
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r0 = r3.f18225a
            java.util.Map$Entry r0 = r0.m10111c(r2)
            r1.m10310m(r0)
            int r2 = r2 + 1
            goto L12
        L26:
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r2 = r3.f18225a
            java.lang.Iterable r2 = r2.m10113e()
            java.util.Iterator r2 = r2.iterator()
        L30:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r1.m10310m(r3)
            goto L30
        L40:
            return
    }

    /* renamed from: B */
    public static boolean m10006B(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    /* renamed from: C */
    public static <UT, UB> UB m10007C(int r2, int r3, UB r4, p221m9.AbstractC4471m1<UT, UB> r5) {
            if (r4 != 0) goto L6
            java.lang.Object r4 = r5.mo10210m()
        L6:
            long r0 = (long) r3
            r5.mo10202e(r4, r2, r0)
            return r4
    }

    /* renamed from: D */
    public static void m10008D(int r2, java.util.List<java.lang.Boolean> r3, p221m9.InterfaceC4498v1 r4, boolean r5) {
            if (r3 == 0) goto L64
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L64
            m9.l r4 = (p221m9.C4466l) r4
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L4c
            m9.k r5 = r4.f18190a
            r1 = 2
            r5.mo10169a0(r2, r1)
            r2 = 0
            r5 = 0
        L18:
            int r1 = r3.size()
            if (r2 >= r1) goto L2e
            java.lang.Object r1 = r3.get(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            java.util.logging.Logger r1 = p221m9.AbstractC4463k.f18182b
            int r5 = r5 + 1
            int r2 = r2 + 1
            goto L18
        L2e:
            m9.k r2 = r4.f18190a
            r2.mo10171c0(r5)
        L33:
            int r2 = r3.size()
            if (r0 >= r2) goto L64
            m9.k r2 = r4.f18190a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            byte r5 = (byte) r5
            r2.mo10156N(r5)
            int r0 = r0 + 1
            goto L33
        L4c:
            int r5 = r3.size()
            if (r0 >= r5) goto L64
            m9.k r5 = r4.f18190a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r5.mo10157O(r2, r1)
            int r0 = r0 + 1
            goto L4c
        L64:
            return
    }

    /* renamed from: E */
    public static void m10009E(int r3, java.util.List<p221m9.AbstractC4454h> r4, p221m9.InterfaceC4498v1 r5) {
            if (r4 == 0) goto L22
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L22
            m9.l r5 = (p221m9.C4466l) r5
            java.util.Objects.requireNonNull(r5)
            r0 = 0
        Le:
            int r1 = r4.size()
            if (r0 >= r1) goto L22
            m9.k r1 = r5.f18190a
            java.lang.Object r2 = r4.get(r0)
            m9.h r2 = (p221m9.AbstractC4454h) r2
            r1.mo10158P(r3, r2)
            int r0 = r0 + 1
            goto Le
        L22:
            return
    }

    /* renamed from: F */
    public static void m10010F(int r3, java.util.List<java.lang.Double> r4, p221m9.InterfaceC4498v1 r5, boolean r6) {
            if (r4 == 0) goto L71
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L71
            m9.l r5 = (p221m9.C4466l) r5
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L52
            m9.k r6 = r5.f18190a
            r1 = 2
            r6.mo10169a0(r3, r1)
            r3 = 0
            r6 = 0
        L18:
            int r1 = r4.size()
            if (r3 >= r1) goto L2e
            java.lang.Object r1 = r4.get(r3)
            java.lang.Double r1 = (java.lang.Double) r1
            r1.doubleValue()
            java.util.logging.Logger r1 = p221m9.AbstractC4463k.f18182b
            int r6 = r6 + 8
            int r3 = r3 + 1
            goto L18
        L2e:
            m9.k r3 = r5.f18190a
            r3.mo10171c0(r6)
        L33:
            int r3 = r4.size()
            if (r0 >= r3) goto L71
            m9.k r3 = r5.f18190a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Double r6 = (java.lang.Double) r6
            double r1 = r6.doubleValue()
            java.util.Objects.requireNonNull(r3)
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r3.mo10162T(r1)
            int r0 = r0 + 1
            goto L33
        L52:
            int r6 = r4.size()
            if (r0 >= r6) goto L71
            m9.k r6 = r5.f18190a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            java.util.Objects.requireNonNull(r6)
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r6.mo10161S(r3, r1)
            int r0 = r0 + 1
            goto L52
        L71:
            return
    }

    /* renamed from: G */
    public static void m10011G(int r2, java.util.List<java.lang.Integer> r3, p221m9.InterfaceC4498v1 r4, boolean r5) {
            if (r3 == 0) goto L65
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L65
            m9.l r4 = (p221m9.C4466l) r4
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L4d
            m9.k r5 = r4.f18190a
            r1 = 2
            r5.mo10169a0(r2, r1)
            r2 = 0
            r5 = 0
        L18:
            int r1 = r3.size()
            if (r2 >= r1) goto L30
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = p221m9.AbstractC4463k.m10148t(r1)
            int r5 = r5 + r1
            int r2 = r2 + 1
            goto L18
        L30:
            m9.k r2 = r4.f18190a
            r2.mo10171c0(r5)
        L35:
            int r2 = r3.size()
            if (r0 >= r2) goto L65
            m9.k r2 = r4.f18190a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.mo10164V(r5)
            int r0 = r0 + 1
            goto L35
        L4d:
            int r5 = r3.size()
            if (r0 >= r5) goto L65
            m9.k r5 = r4.f18190a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.mo10163U(r2, r1)
            int r0 = r0 + 1
            goto L4d
        L65:
            return
    }

    /* renamed from: H */
    public static void m10012H(int r2, java.util.List<java.lang.Integer> r3, p221m9.InterfaceC4498v1 r4, boolean r5) {
            if (r3 == 0) goto L63
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L63
            m9.l r4 = (p221m9.C4466l) r4
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L4b
            m9.k r5 = r4.f18190a
            r1 = 2
            r5.mo10169a0(r2, r1)
            r2 = 0
            r5 = 0
        L18:
            int r1 = r3.size()
            if (r2 >= r1) goto L2e
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.intValue()
            java.util.logging.Logger r1 = p221m9.AbstractC4463k.f18182b
            int r5 = r5 + 4
            int r2 = r2 + 1
            goto L18
        L2e:
            m9.k r2 = r4.f18190a
            r2.mo10171c0(r5)
        L33:
            int r2 = r3.size()
            if (r0 >= r2) goto L63
            m9.k r2 = r4.f18190a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.mo10160R(r5)
            int r0 = r0 + 1
            goto L33
        L4b:
            int r5 = r3.size()
            if (r0 >= r5) goto L63
            m9.k r5 = r4.f18190a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.mo10159Q(r2, r1)
            int r0 = r0 + 1
            goto L4b
        L63:
            return
    }

    /* renamed from: I */
    public static void m10013I(int r3, java.util.List<java.lang.Long> r4, p221m9.InterfaceC4498v1 r5, boolean r6) {
            if (r4 == 0) goto L63
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L63
            m9.l r5 = (p221m9.C4466l) r5
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L4b
            m9.k r6 = r5.f18190a
            r1 = 2
            r6.mo10169a0(r3, r1)
            r3 = 0
            r6 = 0
        L18:
            int r1 = r4.size()
            if (r3 >= r1) goto L2e
            java.lang.Object r1 = r4.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            r1.longValue()
            java.util.logging.Logger r1 = p221m9.AbstractC4463k.f18182b
            int r6 = r6 + 8
            int r3 = r3 + 1
            goto L18
        L2e:
            m9.k r3 = r5.f18190a
            r3.mo10171c0(r6)
        L33:
            int r3 = r4.size()
            if (r0 >= r3) goto L63
            m9.k r3 = r5.f18190a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r3.mo10162T(r1)
            int r0 = r0 + 1
            goto L33
        L4b:
            int r6 = r4.size()
            if (r0 >= r6) goto L63
            m9.k r6 = r5.f18190a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.mo10161S(r3, r1)
            int r0 = r0 + 1
            goto L4b
        L63:
            return
    }

    /* renamed from: J */
    public static void m10014J(int r2, java.util.List<java.lang.Float> r3, p221m9.InterfaceC4498v1 r4, boolean r5) {
            if (r3 == 0) goto L71
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L71
            m9.l r4 = (p221m9.C4466l) r4
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L52
            m9.k r5 = r4.f18190a
            r1 = 2
            r5.mo10169a0(r2, r1)
            r2 = 0
            r5 = 0
        L18:
            int r1 = r3.size()
            if (r2 >= r1) goto L2e
            java.lang.Object r1 = r3.get(r2)
            java.lang.Float r1 = (java.lang.Float) r1
            r1.floatValue()
            java.util.logging.Logger r1 = p221m9.AbstractC4463k.f18182b
            int r5 = r5 + 4
            int r2 = r2 + 1
            goto L18
        L2e:
            m9.k r2 = r4.f18190a
            r2.mo10171c0(r5)
        L33:
            int r2 = r3.size()
            if (r0 >= r2) goto L71
            m9.k r2 = r4.f18190a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            java.util.Objects.requireNonNull(r2)
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            r2.mo10160R(r5)
            int r0 = r0 + 1
            goto L33
        L52:
            int r5 = r3.size()
            if (r0 >= r5) goto L71
            m9.k r5 = r4.f18190a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            java.util.Objects.requireNonNull(r5)
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r5.mo10159Q(r2, r1)
            int r0 = r0 + 1
            goto L52
        L71:
            return
    }

    /* renamed from: K */
    public static void m10015K(int r2, java.util.List<?> r3, p221m9.InterfaceC4498v1 r4, p221m9.InterfaceC4447e1 r5) {
            if (r3 == 0) goto L1e
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L1e
            m9.l r4 = (p221m9.C4466l) r4
            java.util.Objects.requireNonNull(r4)
            r0 = 0
        Le:
            int r1 = r3.size()
            if (r0 >= r1) goto L1e
            java.lang.Object r1 = r3.get(r0)
            r4.m10182c(r2, r1, r5)
            int r0 = r0 + 1
            goto Le
        L1e:
            return
    }

    /* renamed from: L */
    public static void m10016L(int r2, java.util.List<java.lang.Integer> r3, p221m9.InterfaceC4498v1 r4, boolean r5) {
            if (r3 == 0) goto L65
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L65
            m9.l r4 = (p221m9.C4466l) r4
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L4d
            m9.k r5 = r4.f18190a
            r1 = 2
            r5.mo10169a0(r2, r1)
            r2 = 0
            r5 = 0
        L18:
            int r1 = r3.size()
            if (r2 >= r1) goto L30
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = p221m9.AbstractC4463k.m10148t(r1)
            int r5 = r5 + r1
            int r2 = r2 + 1
            goto L18
        L30:
            m9.k r2 = r4.f18190a
            r2.mo10171c0(r5)
        L35:
            int r2 = r3.size()
            if (r0 >= r2) goto L65
            m9.k r2 = r4.f18190a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.mo10164V(r5)
            int r0 = r0 + 1
            goto L35
        L4d:
            int r5 = r3.size()
            if (r0 >= r5) goto L65
            m9.k r5 = r4.f18190a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.mo10163U(r2, r1)
            int r0 = r0 + 1
            goto L4d
        L65:
            return
    }

    /* renamed from: M */
    public static void m10017M(int r3, java.util.List<java.lang.Long> r4, p221m9.InterfaceC4498v1 r5, boolean r6) {
            if (r4 == 0) goto L65
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L65
            m9.l r5 = (p221m9.C4466l) r5
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L4d
            m9.k r6 = r5.f18190a
            r1 = 2
            r6.mo10169a0(r3, r1)
            r3 = 0
            r6 = 0
        L18:
            int r1 = r4.size()
            if (r3 >= r1) goto L30
            java.lang.Object r1 = r4.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = p221m9.AbstractC4463k.m10135J(r1)
            int r6 = r6 + r1
            int r3 = r3 + 1
            goto L18
        L30:
            m9.k r3 = r5.f18190a
            r3.mo10171c0(r6)
        L35:
            int r3 = r4.size()
            if (r0 >= r3) goto L65
            m9.k r3 = r5.f18190a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r3.mo10173e0(r1)
            int r0 = r0 + 1
            goto L35
        L4d:
            int r6 = r4.size()
            if (r0 >= r6) goto L65
            m9.k r6 = r5.f18190a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.mo10172d0(r3, r1)
            int r0 = r0 + 1
            goto L4d
        L65:
            return
    }

    /* renamed from: N */
    public static void m10018N(int r3, java.util.List<?> r4, p221m9.InterfaceC4498v1 r5, p221m9.InterfaceC4447e1 r6) {
            if (r4 == 0) goto L22
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L22
            m9.l r5 = (p221m9.C4466l) r5
            java.util.Objects.requireNonNull(r5)
            r0 = 0
        Le:
            int r1 = r4.size()
            if (r0 >= r1) goto L22
            java.lang.Object r1 = r4.get(r0)
            m9.k r2 = r5.f18190a
            m9.q0 r1 = (p221m9.InterfaceC4482q0) r1
            r2.mo10165W(r3, r1, r6)
            int r0 = r0 + 1
            goto Le
        L22:
            return
    }

    /* renamed from: O */
    public static void m10019O(int r2, java.util.List<java.lang.Integer> r3, p221m9.InterfaceC4498v1 r4, boolean r5) {
            if (r3 == 0) goto L63
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L63
            m9.l r4 = (p221m9.C4466l) r4
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L4b
            m9.k r5 = r4.f18190a
            r1 = 2
            r5.mo10169a0(r2, r1)
            r2 = 0
            r5 = 0
        L18:
            int r1 = r3.size()
            if (r2 >= r1) goto L2e
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.intValue()
            java.util.logging.Logger r1 = p221m9.AbstractC4463k.f18182b
            int r5 = r5 + 4
            int r2 = r2 + 1
            goto L18
        L2e:
            m9.k r2 = r4.f18190a
            r2.mo10171c0(r5)
        L33:
            int r2 = r3.size()
            if (r0 >= r2) goto L63
            m9.k r2 = r4.f18190a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.mo10160R(r5)
            int r0 = r0 + 1
            goto L33
        L4b:
            int r5 = r3.size()
            if (r0 >= r5) goto L63
            m9.k r5 = r4.f18190a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.mo10159Q(r2, r1)
            int r0 = r0 + 1
            goto L4b
        L63:
            return
    }

    /* renamed from: P */
    public static void m10020P(int r3, java.util.List<java.lang.Long> r4, p221m9.InterfaceC4498v1 r5, boolean r6) {
            if (r4 == 0) goto L63
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L63
            m9.l r5 = (p221m9.C4466l) r5
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L4b
            m9.k r6 = r5.f18190a
            r1 = 2
            r6.mo10169a0(r3, r1)
            r3 = 0
            r6 = 0
        L18:
            int r1 = r4.size()
            if (r3 >= r1) goto L2e
            java.lang.Object r1 = r4.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            r1.longValue()
            java.util.logging.Logger r1 = p221m9.AbstractC4463k.f18182b
            int r6 = r6 + 8
            int r3 = r3 + 1
            goto L18
        L2e:
            m9.k r3 = r5.f18190a
            r3.mo10171c0(r6)
        L33:
            int r3 = r4.size()
            if (r0 >= r3) goto L63
            m9.k r3 = r5.f18190a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r3.mo10162T(r1)
            int r0 = r0 + 1
            goto L33
        L4b:
            int r6 = r4.size()
            if (r0 >= r6) goto L63
            m9.k r6 = r5.f18190a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.mo10161S(r3, r1)
            int r0 = r0 + 1
            goto L4b
        L63:
            return
    }

    /* renamed from: Q */
    public static void m10021Q(int r2, java.util.List<java.lang.Integer> r3, p221m9.InterfaceC4498v1 r4, boolean r5) {
            if (r3 == 0) goto L6d
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L6d
            m9.l r4 = (p221m9.C4466l) r4
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L51
            m9.k r5 = r4.f18190a
            r1 = 2
            r5.mo10169a0(r2, r1)
            r2 = 0
            r5 = 0
        L18:
            int r1 = r3.size()
            if (r2 >= r1) goto L30
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = p221m9.AbstractC4463k.m10126A(r1)
            int r5 = r5 + r1
            int r2 = r2 + 1
            goto L18
        L30:
            m9.k r2 = r4.f18190a
            r2.mo10171c0(r5)
        L35:
            int r2 = r3.size()
            if (r0 >= r2) goto L6d
            m9.k r2 = r4.f18190a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r5 = p221m9.AbstractC4463k.m10136K(r5)
            r2.mo10171c0(r5)
            int r0 = r0 + 1
            goto L35
        L51:
            int r5 = r3.size()
            if (r0 >= r5) goto L6d
            m9.k r5 = r4.f18190a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = p221m9.AbstractC4463k.m10136K(r1)
            r5.mo10170b0(r2, r1)
            int r0 = r0 + 1
            goto L51
        L6d:
            return
    }

    /* renamed from: R */
    public static void m10022R(int r3, java.util.List<java.lang.Long> r4, p221m9.InterfaceC4498v1 r5, boolean r6) {
            if (r4 == 0) goto L6d
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L6d
            m9.l r5 = (p221m9.C4466l) r5
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L51
            m9.k r6 = r5.f18190a
            r1 = 2
            r6.mo10169a0(r3, r1)
            r3 = 0
            r6 = 0
        L18:
            int r1 = r4.size()
            if (r3 >= r1) goto L30
            java.lang.Object r1 = r4.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = p221m9.AbstractC4463k.m10128C(r1)
            int r6 = r6 + r1
            int r3 = r3 + 1
            goto L18
        L30:
            m9.k r3 = r5.f18190a
            r3.mo10171c0(r6)
        L35:
            int r3 = r4.size()
            if (r0 >= r3) goto L6d
            m9.k r3 = r5.f18190a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            long r1 = p221m9.AbstractC4463k.m10137L(r1)
            r3.mo10173e0(r1)
            int r0 = r0 + 1
            goto L35
        L51:
            int r6 = r4.size()
            if (r0 >= r6) goto L6d
            m9.k r6 = r5.f18190a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r1 = p221m9.AbstractC4463k.m10137L(r1)
            r6.mo10172d0(r3, r1)
            int r0 = r0 + 1
            goto L51
        L6d:
            return
    }

    /* renamed from: S */
    public static void m10023S(int r4, java.util.List<java.lang.String> r5, p221m9.InterfaceC4498v1 r6) {
            if (r5 == 0) goto L49
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L49
            m9.l r6 = (p221m9.C4466l) r6
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r5 instanceof p221m9.InterfaceC4449f0
            r1 = 0
            if (r0 == 0) goto L35
            r0 = r5
            m9.f0 r0 = (p221m9.InterfaceC4449f0) r0
        L15:
            int r2 = r5.size()
            if (r1 >= r2) goto L49
            java.lang.Object r2 = r0.mo9984M(r1)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L2b
            m9.k r3 = r6.f18190a
            java.lang.String r2 = (java.lang.String) r2
            r3.mo10168Z(r4, r2)
            goto L32
        L2b:
            m9.k r3 = r6.f18190a
            m9.h r2 = (p221m9.AbstractC4454h) r2
            r3.mo10158P(r4, r2)
        L32:
            int r1 = r1 + 1
            goto L15
        L35:
            int r0 = r5.size()
            if (r1 >= r0) goto L49
            m9.k r0 = r6.f18190a
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.mo10168Z(r4, r2)
            int r1 = r1 + 1
            goto L35
        L49:
            return
    }

    /* renamed from: T */
    public static void m10024T(int r2, java.util.List<java.lang.Integer> r3, p221m9.InterfaceC4498v1 r4, boolean r5) {
            if (r3 == 0) goto L65
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L65
            m9.l r4 = (p221m9.C4466l) r4
            java.util.Objects.requireNonNull(r4)
            r0 = 0
            if (r5 == 0) goto L4d
            m9.k r5 = r4.f18190a
            r1 = 2
            r5.mo10169a0(r2, r1)
            r2 = 0
            r5 = 0
        L18:
            int r1 = r3.size()
            if (r2 >= r1) goto L30
            java.lang.Object r1 = r3.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = p221m9.AbstractC4463k.m10133H(r1)
            int r5 = r5 + r1
            int r2 = r2 + 1
            goto L18
        L30:
            m9.k r2 = r4.f18190a
            r2.mo10171c0(r5)
        L35:
            int r2 = r3.size()
            if (r0 >= r2) goto L65
            m9.k r2 = r4.f18190a
            java.lang.Object r5 = r3.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.mo10171c0(r5)
            int r0 = r0 + 1
            goto L35
        L4d:
            int r5 = r3.size()
            if (r0 >= r5) goto L65
            m9.k r5 = r4.f18190a
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.mo10170b0(r2, r1)
            int r0 = r0 + 1
            goto L4d
        L65:
            return
    }

    /* renamed from: U */
    public static void m10025U(int r3, java.util.List<java.lang.Long> r4, p221m9.InterfaceC4498v1 r5, boolean r6) {
            if (r4 == 0) goto L65
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L65
            m9.l r5 = (p221m9.C4466l) r5
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r6 == 0) goto L4d
            m9.k r6 = r5.f18190a
            r1 = 2
            r6.mo10169a0(r3, r1)
            r3 = 0
            r6 = 0
        L18:
            int r1 = r4.size()
            if (r3 >= r1) goto L30
            java.lang.Object r1 = r4.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = p221m9.AbstractC4463k.m10135J(r1)
            int r6 = r6 + r1
            int r3 = r3 + 1
            goto L18
        L30:
            m9.k r3 = r5.f18190a
            r3.mo10171c0(r6)
        L35:
            int r3 = r4.size()
            if (r0 >= r3) goto L65
            m9.k r3 = r5.f18190a
            java.lang.Object r6 = r4.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r3.mo10173e0(r1)
            int r0 = r0 + 1
            goto L35
        L4d:
            int r6 = r4.size()
            if (r0 >= r6) goto L65
            m9.k r6 = r5.f18190a
            java.lang.Object r1 = r4.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.mo10172d0(r3, r1)
            int r0 = r0 + 1
            goto L4d
        L65:
            return
    }

    /* renamed from: a */
    public static int m10026a(int r0, java.util.List<?> r1, boolean r2) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            if (r2 == 0) goto L14
            int r0 = p221m9.AbstractC4463k.m10131F(r0)
            int r1 = p221m9.AbstractC4463k.m10151w(r1)
            int r1 = r1 + r0
            return r1
        L14:
            r2 = 1
            int r0 = p221m9.AbstractC4463k.m10138j(r0, r2)
            int r0 = r0 * r1
            return r0
    }

    /* renamed from: b */
    public static int m10027b(int r2, java.util.List<p221m9.AbstractC4454h> r3) {
            int r0 = r3.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = p221m9.AbstractC4463k.m10131F(r2)
            int r2 = r2 * r0
        Le:
            int r0 = r3.size()
            if (r1 >= r0) goto L22
            java.lang.Object r0 = r3.get(r1)
            m9.h r0 = (p221m9.AbstractC4454h) r0
            int r0 = p221m9.AbstractC4463k.m10140l(r0)
            int r2 = r2 + r0
            int r1 = r1 + 1
            goto Le
        L22:
            return r2
    }

    /* renamed from: c */
    public static int m10028c(int r1, java.util.List<java.lang.Integer> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = m10029d(r2)
            int r1 = p221m9.AbstractC4463k.m10131F(r1)
            if (r3 == 0) goto L18
            int r2 = p221m9.AbstractC4463k.m10151w(r2)
            int r2 = r2 + r1
            return r2
        L18:
            int r1 = r1 * r0
            int r1 = r1 + r2
            return r1
    }

    /* renamed from: d */
    public static int m10029d(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof p221m9.C4503y
            if (r2 == 0) goto L1d
            m9.y r4 = (p221m9.C4503y) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.m10383i(r1)
            int r3 = p221m9.AbstractC4463k.m10148t(r3)
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
            int r3 = p221m9.AbstractC4463k.m10148t(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    /* renamed from: e */
    public static int m10030e(int r1, java.util.List<?> r2, boolean r3) {
            int r2 = r2.size()
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            if (r3 == 0) goto L16
            int r2 = r2 * 4
            int r1 = p221m9.AbstractC4463k.m10131F(r1)
            int r2 = p221m9.AbstractC4463k.m10151w(r2)
            int r2 = r2 + r1
            return r2
        L16:
            int r1 = p221m9.AbstractC4463k.m10143o(r1, r0)
            int r1 = r1 * r2
            return r1
    }

    /* renamed from: f */
    public static int m10031f(java.util.List<?> r0) {
            int r0 = r0.size()
            int r0 = r0 * 4
            return r0
    }

    /* renamed from: g */
    public static int m10032g(int r2, java.util.List<?> r3, boolean r4) {
            int r3 = r3.size()
            if (r3 != 0) goto L8
            r2 = 0
            return r2
        L8:
            if (r4 == 0) goto L16
            int r3 = r3 * 8
            int r2 = p221m9.AbstractC4463k.m10131F(r2)
            int r3 = p221m9.AbstractC4463k.m10151w(r3)
            int r3 = r3 + r2
            return r3
        L16:
            r0 = 0
            int r2 = p221m9.AbstractC4463k.m10144p(r2, r0)
            int r2 = r2 * r3
            return r2
    }

    /* renamed from: h */
    public static int m10033h(java.util.List<?> r0) {
            int r0 = r0.size()
            int r0 = r0 * 8
            return r0
    }

    /* renamed from: i */
    public static int m10034i(int r4, java.util.List<p221m9.InterfaceC4482q0> r5, p221m9.InterfaceC4447e1 r6) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r2 = 0
        L9:
            if (r1 >= r0) goto L19
            java.lang.Object r3 = r5.get(r1)
            m9.q0 r3 = (p221m9.InterfaceC4482q0) r3
            int r3 = p221m9.AbstractC4463k.m10146r(r4, r3, r6)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L9
        L19:
            return r2
    }

    /* renamed from: j */
    public static int m10035j(int r1, java.util.List<java.lang.Integer> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = m10036k(r2)
            int r1 = p221m9.AbstractC4463k.m10131F(r1)
            if (r3 == 0) goto L18
            int r2 = p221m9.AbstractC4463k.m10151w(r2)
            int r2 = r2 + r1
            return r2
        L18:
            int r1 = r1 * r0
            int r1 = r1 + r2
            return r1
    }

    /* renamed from: k */
    public static int m10036k(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof p221m9.C4503y
            if (r2 == 0) goto L1d
            m9.y r4 = (p221m9.C4503y) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.m10383i(r1)
            int r3 = p221m9.AbstractC4463k.m10148t(r3)
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
            int r3 = p221m9.AbstractC4463k.m10148t(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    /* renamed from: l */
    public static int m10037l(int r1, java.util.List<java.lang.Long> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = m10038m(r2)
            if (r3 == 0) goto L18
            int r1 = p221m9.AbstractC4463k.m10131F(r1)
            int r2 = p221m9.AbstractC4463k.m10151w(r0)
            int r2 = r2 + r1
            return r2
        L18:
            int r2 = r2.size()
            int r1 = p221m9.AbstractC4463k.m10131F(r1)
            int r1 = r1 * r2
            int r1 = r1 + r0
            return r1
    }

    /* renamed from: m */
    public static int m10038m(java.util.List<java.lang.Long> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof p221m9.C4455h0
            if (r2 == 0) goto L1d
            m9.h0 r5 = (p221m9.C4455h0) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.m10069i(r1)
            int r3 = p221m9.AbstractC4463k.m10135J(r3)
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
            int r3 = p221m9.AbstractC4463k.m10135J(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    /* renamed from: n */
    public static int m10039n(int r1, java.lang.Object r2, p221m9.InterfaceC4447e1 r3) {
            boolean r0 = r2 instanceof p221m9.C4443d0
            if (r0 == 0) goto L10
            m9.d0 r2 = (p221m9.C4443d0) r2
            int r1 = p221m9.AbstractC4463k.m10131F(r1)
            int r2 = p221m9.AbstractC4463k.m10150v(r2)
        Le:
            int r2 = r2 + r1
            return r2
        L10:
            m9.q0 r2 = (p221m9.InterfaceC4482q0) r2
            int r1 = p221m9.AbstractC4463k.m10131F(r1)
            m9.a r2 = (p221m9.AbstractC4433a) r2
            int r2 = r2.m9892i(r3)
            int r2 = p221m9.AbstractC4463k.m10151w(r2)
            goto Le
    }

    /* renamed from: o */
    public static int m10040o(int r4, java.util.List<?> r5, p221m9.InterfaceC4447e1 r6) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r4 = p221m9.AbstractC4463k.m10131F(r4)
            int r4 = r4 * r0
        Le:
            if (r1 >= r0) goto L31
            java.lang.Object r2 = r5.get(r1)
            boolean r3 = r2 instanceof p221m9.C4443d0
            if (r3 == 0) goto L21
            m9.d0 r2 = (p221m9.C4443d0) r2
            int r2 = p221m9.AbstractC4463k.m10150v(r2)
            int r2 = r2 + r4
            r4 = r2
            goto L2e
        L21:
            m9.q0 r2 = (p221m9.InterfaceC4482q0) r2
            m9.a r2 = (p221m9.AbstractC4433a) r2
            int r2 = r2.m9892i(r6)
            int r2 = p221m9.AbstractC4463k.m10151w(r2)
            int r4 = r4 + r2
        L2e:
            int r1 = r1 + 1
            goto Le
        L31:
            return r4
    }

    /* renamed from: p */
    public static int m10041p(int r1, java.util.List<java.lang.Integer> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = m10042q(r2)
            int r1 = p221m9.AbstractC4463k.m10131F(r1)
            if (r3 == 0) goto L18
            int r2 = p221m9.AbstractC4463k.m10151w(r2)
            int r2 = r2 + r1
            return r2
        L18:
            int r1 = r1 * r0
            int r1 = r1 + r2
            return r1
    }

    /* renamed from: q */
    public static int m10042q(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof p221m9.C4503y
            if (r2 == 0) goto L1d
            m9.y r4 = (p221m9.C4503y) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.m10383i(r1)
            int r3 = p221m9.AbstractC4463k.m10126A(r3)
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
            int r3 = p221m9.AbstractC4463k.m10126A(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    /* renamed from: r */
    public static int m10043r(int r1, java.util.List<java.lang.Long> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = m10044s(r2)
            int r1 = p221m9.AbstractC4463k.m10131F(r1)
            if (r3 == 0) goto L18
            int r2 = p221m9.AbstractC4463k.m10151w(r2)
            int r2 = r2 + r1
            return r2
        L18:
            int r1 = r1 * r0
            int r1 = r1 + r2
            return r1
    }

    /* renamed from: s */
    public static int m10044s(java.util.List<java.lang.Long> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof p221m9.C4455h0
            if (r2 == 0) goto L1d
            m9.h0 r5 = (p221m9.C4455h0) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.m10069i(r1)
            int r3 = p221m9.AbstractC4463k.m10128C(r3)
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
            int r3 = p221m9.AbstractC4463k.m10128C(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    /* renamed from: t */
    public static int m10045t(int r4, java.util.List<?> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r4 = p221m9.AbstractC4463k.m10131F(r4)
            int r4 = r4 * r0
            boolean r2 = r5 instanceof p221m9.InterfaceC4449f0
            if (r2 == 0) goto L30
            m9.f0 r5 = (p221m9.InterfaceC4449f0) r5
        L14:
            if (r1 >= r0) goto L4c
            java.lang.Object r2 = r5.mo9984M(r1)
            boolean r3 = r2 instanceof p221m9.AbstractC4454h
            if (r3 == 0) goto L25
            m9.h r2 = (p221m9.AbstractC4454h) r2
            int r2 = p221m9.AbstractC4463k.m10140l(r2)
            goto L2b
        L25:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = p221m9.AbstractC4463k.m10130E(r2)
        L2b:
            int r2 = r2 + r4
            r4 = r2
            int r1 = r1 + 1
            goto L14
        L30:
            if (r1 >= r0) goto L4c
            java.lang.Object r2 = r5.get(r1)
            boolean r3 = r2 instanceof p221m9.AbstractC4454h
            if (r3 == 0) goto L41
            m9.h r2 = (p221m9.AbstractC4454h) r2
            int r2 = p221m9.AbstractC4463k.m10140l(r2)
            goto L47
        L41:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = p221m9.AbstractC4463k.m10130E(r2)
        L47:
            int r2 = r2 + r4
            r4 = r2
            int r1 = r1 + 1
            goto L30
        L4c:
            return r4
    }

    /* renamed from: u */
    public static int m10046u(int r1, java.util.List<java.lang.Integer> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = m10047v(r2)
            int r1 = p221m9.AbstractC4463k.m10131F(r1)
            if (r3 == 0) goto L18
            int r2 = p221m9.AbstractC4463k.m10151w(r2)
            int r2 = r2 + r1
            return r2
        L18:
            int r1 = r1 * r0
            int r1 = r1 + r2
            return r1
    }

    /* renamed from: v */
    public static int m10047v(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof p221m9.C4503y
            if (r2 == 0) goto L1d
            m9.y r4 = (p221m9.C4503y) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.m10383i(r1)
            int r3 = p221m9.AbstractC4463k.m10133H(r3)
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
            int r3 = p221m9.AbstractC4463k.m10133H(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    /* renamed from: w */
    public static int m10048w(int r1, java.util.List<java.lang.Long> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = m10049x(r2)
            int r1 = p221m9.AbstractC4463k.m10131F(r1)
            if (r3 == 0) goto L18
            int r2 = p221m9.AbstractC4463k.m10151w(r2)
            int r2 = r2 + r1
            return r2
        L18:
            int r1 = r1 * r0
            int r1 = r1 + r2
            return r1
    }

    /* renamed from: x */
    public static int m10049x(java.util.List<java.lang.Long> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof p221m9.C4455h0
            if (r2 == 0) goto L1d
            m9.h0 r5 = (p221m9.C4455h0) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.m10069i(r1)
            int r3 = p221m9.AbstractC4463k.m10135J(r3)
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
            int r3 = p221m9.AbstractC4463k.m10135J(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    /* renamed from: y */
    public static <UT, UB> UB m10050y(int r5, java.util.List<java.lang.Integer> r6, p221m9.C4505z.b r7, UB r8, p221m9.AbstractC4471m1<UT, UB> r9) {
            if (r7 != 0) goto L3
            return r8
        L3:
            boolean r0 = r6 instanceof java.util.RandomAccess
            if (r0 == 0) goto L42
            int r0 = r6.size()
            r1 = 0
            r2 = 0
        Ld:
            if (r1 >= r0) goto L38
            java.lang.Object r3 = r6.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            boolean r4 = r7.m10388a(r3)
            if (r4 == 0) goto L2b
            if (r1 == r2) goto L28
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.set(r2, r3)
        L28:
            int r2 = r2 + 1
            goto L35
        L2b:
            if (r8 != 0) goto L31
            java.lang.Object r8 = r9.mo10210m()
        L31:
            long r3 = (long) r3
            r9.mo10202e(r8, r5, r3)
        L35:
            int r1 = r1 + 1
            goto Ld
        L38:
            if (r2 == r0) goto L6a
            java.util.List r5 = r6.subList(r2, r0)
            r5.clear()
            goto L6a
        L42:
            java.util.Iterator r6 = r6.iterator()
        L46:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r6.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r1 = r7.m10388a(r0)
            if (r1 != 0) goto L46
            if (r8 != 0) goto L62
            java.lang.Object r8 = r9.mo10210m()
        L62:
            long r0 = (long) r0
            r9.mo10202e(r8, r5, r0)
            r6.remove()
            goto L46
        L6a:
            return r8
    }

    /* renamed from: z */
    public static p221m9.AbstractC4471m1<?, ?> m10051z(boolean r6) {
            r0 = 0
            java.lang.String r1 = "com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema"
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
            m9.m1 r6 = (p221m9.AbstractC4471m1) r6     // Catch: java.lang.Throwable -> L27
            return r6
        L27:
            return r0
    }
}
