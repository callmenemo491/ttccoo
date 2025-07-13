package p088f4;

/* renamed from: f4.o1 */
/* loaded from: classes.dex */
public final class C2034o1 implements p088f4.InterfaceC2014i {

    /* renamed from: Z */
    public static final p088f4.C2034o1 f9273Z = null;

    /* renamed from: Y */
    public final p026b9.AbstractC0714n<p088f4.C2034o1.a> f9274Y;

    /* renamed from: f4.o1$a */
    public static final class a implements p088f4.InterfaceC2014i {

        /* renamed from: c0 */
        public static final p088f4.InterfaceC2014i.a<p088f4.C2034o1.a> f9275c0 = null;

        /* renamed from: Y */
        public final p108g5.C2271h0 f9276Y;

        /* renamed from: Z */
        public final int[] f9277Z;

        /* renamed from: a0 */
        public final int f9278a0;

        /* renamed from: b0 */
        public final boolean[] f9279b0;

        static {
                k1.d r0 = p179k1.C3646d.f16119h0
                p088f4.C2034o1.a.f9275c0 = r0
                return
        }

        public a(p108g5.C2271h0 r3, int[] r4, int r5, boolean[] r6) {
                r2 = this;
                r2.<init>()
                int r0 = r3.f10372Y
                int r1 = r4.length
                if (r0 != r1) goto Ld
                int r1 = r6.length
                if (r0 != r1) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                p371v5.C6549a.m13288b(r0)
                r2.f9276Y = r3
                java.lang.Object r3 = r4.clone()
                int[] r3 = (int[]) r3
                r2.f9277Z = r3
                r2.f9278a0 = r5
                java.lang.Object r3 = r6.clone()
                boolean[] r3 = (boolean[]) r3
                r2.f9279b0 = r3
                return
        }

        /* renamed from: a */
        public static java.lang.String m5376a(int r1) {
                r0 = 36
                java.lang.String r1 = java.lang.Integer.toString(r1, r0)
                return r1
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L39
                java.lang.Class<f4.o1$a> r2 = p088f4.C2034o1.a.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L39
            L10:
                f4.o1$a r5 = (p088f4.C2034o1.a) r5
                int r2 = r4.f9278a0
                int r3 = r5.f9278a0
                if (r2 != r3) goto L37
                g5.h0 r2 = r4.f9276Y
                g5.h0 r3 = r5.f9276Y
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L37
                int[] r2 = r4.f9277Z
                int[] r3 = r5.f9277Z
                boolean r2 = java.util.Arrays.equals(r2, r3)
                if (r2 == 0) goto L37
                boolean[] r2 = r4.f9279b0
                boolean[] r5 = r5.f9279b0
                boolean r5 = java.util.Arrays.equals(r2, r5)
                if (r5 == 0) goto L37
                goto L38
            L37:
                r0 = 0
            L38:
                return r0
            L39:
                return r1
        }

        public int hashCode() {
                r2 = this;
                g5.h0 r0 = r2.f9276Y
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int[] r1 = r2.f9277Z
                int r1 = java.util.Arrays.hashCode(r1)
                int r1 = r1 + r0
                int r1 = r1 * 31
                int r0 = r2.f9278a0
                int r1 = r1 + r0
                int r1 = r1 * 31
                boolean[] r0 = r2.f9279b0
                int r0 = java.util.Arrays.hashCode(r0)
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            f4.o1 r0 = new f4.o1
            b9.a<java.lang.Object> r1 = p026b9.AbstractC0714n.f3979Z
            b9.n<java.lang.Object> r1 = p026b9.C0693c0.f3898c0
            r0.<init>(r1)
            p088f4.C2034o1.f9273Z = r0
            return
    }

    public C2034o1(java.util.List<p088f4.C2034o1.a> r1) {
            r0 = this;
            r0.<init>()
            b9.n r1 = p026b9.AbstractC0714n.m2311w(r1)
            r0.f9274Y = r1
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<f4.o1> r0 = p088f4.C2034o1.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            f4.o1 r3 = (p088f4.C2034o1) r3
            b9.n<f4.o1$a> r0 = r2.f9274Y
            b9.n<f4.o1$a> r3 = r3.f9274Y
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r1 = this;
            b9.n<f4.o1$a> r0 = r1.f9274Y
            int r0 = r0.hashCode()
            return r0
    }
}
