package p325s5;

/* renamed from: s5.k */
/* loaded from: classes.dex */
public final class C5971k implements p088f4.InterfaceC2014i {

    /* renamed from: Z */
    public static final p325s5.C5971k f23012Z = null;

    /* renamed from: a0 */
    public static final p088f4.InterfaceC2014i.a<p325s5.C5971k> f23013a0 = null;

    /* renamed from: Y */
    public final p026b9.AbstractC0715o<p108g5.C2271h0, p325s5.C5971k.a> f23014Y;

    /* renamed from: s5.k$a */
    public static final class a implements p088f4.InterfaceC2014i {

        /* renamed from: a0 */
        public static final p088f4.InterfaceC2014i.a<p325s5.C5971k.a> f23015a0 = null;

        /* renamed from: Y */
        public final p108g5.C2271h0 f23016Y;

        /* renamed from: Z */
        public final p026b9.AbstractC0714n<java.lang.Integer> f23017Z;

        static {
                k1.c r0 = p179k1.C3644c.f16094p0
                p325s5.C5971k.a.f23015a0 = r0
                return
        }

        public a(p108g5.C2271h0 r9) {
                r8 = this;
                r8.<init>()
                r8.f23016Y = r9
                r0 = 4
                java.lang.String r1 = "initialCapacity"
                p026b9.C0720t.m2328b(r0, r1)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
            L11:
                int r5 = r9.f10372Y
                if (r2 >= r5) goto L3c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
                java.util.Objects.requireNonNull(r5)
                int r6 = r3 + 1
                int r7 = r0.length
                if (r7 >= r6) goto L2b
                int r4 = r0.length
                int r4 = p026b9.AbstractC0710l.b.m2305a(r4, r6)
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
                goto L33
            L2b:
                if (r4 == 0) goto L34
                java.lang.Object r0 = r0.clone()
                java.lang.Object[] r0 = (java.lang.Object[]) r0
            L33:
                r4 = 0
            L34:
                int r6 = r3 + 1
                r0[r3] = r5
                int r2 = r2 + 1
                r3 = r6
                goto L11
            L3c:
                b9.n r9 = p026b9.AbstractC0714n.m2309q(r0, r3)
                r8.f23017Z = r9
                return
        }

        public a(p108g5.C2271h0 r3, java.util.List<java.lang.Integer> r4) {
                r2 = this;
                r2.<init>()
                boolean r0 = r4.isEmpty()
                if (r0 != 0) goto L2a
                java.lang.Object r0 = java.util.Collections.min(r4)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                if (r0 < 0) goto L24
                java.lang.Object r0 = java.util.Collections.max(r4)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                int r1 = r3.f10372Y
                if (r0 >= r1) goto L24
                goto L2a
            L24:
                java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
                r3.<init>()
                throw r3
            L2a:
                r2.f23016Y = r3
                b9.n r3 = p026b9.AbstractC0714n.m2311w(r4)
                r2.f23017Z = r3
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L29
                java.lang.Class<s5.k$a> r2 = p325s5.C5971k.a.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L29
            L10:
                s5.k$a r5 = (p325s5.C5971k.a) r5
                g5.h0 r2 = r4.f23016Y
                g5.h0 r3 = r5.f23016Y
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L27
                b9.n<java.lang.Integer> r2 = r4.f23017Z
                b9.n<java.lang.Integer> r5 = r5.f23017Z
                boolean r5 = r2.equals(r5)
                if (r5 == 0) goto L27
                goto L28
            L27:
                r0 = 0
            L28:
                return r0
            L29:
                return r1
        }

        public int hashCode() {
                r2 = this;
                g5.h0 r0 = r2.f23016Y
                int r0 = r0.hashCode()
                b9.n<java.lang.Integer> r1 = r2.f23017Z
                int r1 = r1.hashCode()
                int r1 = r1 * 31
                int r1 = r1 + r0
                return r1
        }
    }

    static {
            s5.k r0 = new s5.k
            b9.o<java.lang.Object, java.lang.Object> r1 = p026b9.C0695d0.f3901e0
            r0.<init>(r1)
            p325s5.C5971k.f23012Z = r0
            k1.d r0 = p179k1.C3646d.f16125n0
            p325s5.C5971k.f23013a0 = r0
            return
    }

    public C5971k(java.util.Map<p108g5.C2271h0, p325s5.C5971k.a> r1) {
            r0 = this;
            r0.<init>()
            b9.o r1 = p026b9.AbstractC0715o.m2318a(r1)
            r0.f23014Y = r1
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1d
            java.lang.Class<s5.k> r0 = p325s5.C5971k.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1d
        Lf:
            s5.k r3 = (p325s5.C5971k) r3
            b9.o<g5.h0, s5.k$a> r0 = r2.f23014Y
            b9.o<g5.h0, s5.k$a> r3 = r3.f23014Y
            java.util.Objects.requireNonNull(r0)
            boolean r3 = p026b9.C0722v.m2331a(r0, r3)
            return r3
        L1d:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r1 = this;
            b9.o<g5.h0, s5.k$a> r0 = r1.f23014Y
            int r0 = r0.hashCode()
            return r0
    }
}
