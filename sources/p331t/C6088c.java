package p331t;

/* renamed from: t.c */
/* loaded from: classes.dex */
public class C6088c {

    /* renamed from: b */
    public static p331t.C6088c f23473b;

    /* renamed from: c */
    public static java.lang.String[] f23474c;

    /* renamed from: a */
    public java.lang.String f23475a;

    /* renamed from: t.c$a */
    public static class a extends p331t.C6088c {

        /* renamed from: d */
        public double f23476d;

        /* renamed from: e */
        public double f23477e;

        /* renamed from: f */
        public double f23478f;

        /* renamed from: g */
        public double f23479g;

        public a(java.lang.String r6) {
                r5 = this;
                r5.<init>()
                r5.f23475a = r6
                r0 = 40
                int r0 = r6.indexOf(r0)
                r1 = 44
                int r2 = r6.indexOf(r1, r0)
                int r0 = r0 + 1
                java.lang.String r0 = r6.substring(r0, r2)
                java.lang.String r0 = r0.trim()
                double r3 = java.lang.Double.parseDouble(r0)
                r5.f23476d = r3
                int r2 = r2 + 1
                int r0 = r6.indexOf(r1, r2)
                java.lang.String r2 = r6.substring(r2, r0)
                java.lang.String r2 = r2.trim()
                double r2 = java.lang.Double.parseDouble(r2)
                r5.f23477e = r2
                int r0 = r0 + 1
                int r1 = r6.indexOf(r1, r0)
                java.lang.String r0 = r6.substring(r0, r1)
                java.lang.String r0 = r0.trim()
                double r2 = java.lang.Double.parseDouble(r0)
                r5.f23478f = r2
                int r1 = r1 + 1
                r0 = 41
                int r0 = r6.indexOf(r0, r1)
                java.lang.String r6 = r6.substring(r1, r0)
                java.lang.String r6 = r6.trim()
                double r0 = java.lang.Double.parseDouble(r6)
                r5.f23479g = r0
                return
        }

        @Override // p331t.C6088c
        /* renamed from: a */
        public double mo12543a(double r10) {
                r9 = this;
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 > 0) goto L7
                return r0
            L7:
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 < 0) goto Le
                return r0
            Le:
                r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                r2 = r0
                r4 = r2
            L12:
                r6 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 <= 0) goto L29
                double r6 = r9.m12545d(r4)
                double r2 = r2 * r0
                int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r8 >= 0) goto L27
                double r4 = r4 + r2
                goto L12
            L27:
                double r4 = r4 - r2
                goto L12
            L29:
                double r0 = r4 - r2
                double r6 = r9.m12545d(r0)
                double r4 = r4 + r2
                double r2 = r9.m12545d(r4)
                double r0 = r9.m12546e(r0)
                double r4 = r9.m12546e(r4)
                double r4 = r4 - r0
                double r10 = r10 - r6
                double r10 = r10 * r4
                double r2 = r2 - r6
                double r10 = r10 / r2
                double r10 = r10 + r0
                return r10
        }

        @Override // p331t.C6088c
        /* renamed from: b */
        public double mo12544b(double r10) {
                r9 = this;
                r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                r2 = r0
                r4 = r2
            L4:
                r6 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 <= 0) goto L1b
                double r6 = r9.m12545d(r4)
                double r2 = r2 * r0
                int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r8 >= 0) goto L19
                double r4 = r4 + r2
                goto L4
            L19:
                double r4 = r4 - r2
                goto L4
            L1b:
                double r10 = r4 - r2
                double r0 = r9.m12545d(r10)
                double r4 = r4 + r2
                double r2 = r9.m12545d(r4)
                double r10 = r9.m12546e(r10)
                double r4 = r9.m12546e(r4)
                double r4 = r4 - r10
                double r2 = r2 - r0
                double r4 = r4 / r2
                return r4
        }

        /* renamed from: d */
        public final double m12545d(double r7) {
                r6 = this;
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r0 = r0 - r7
                r2 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r2 = r2 * r0
                double r0 = r0 * r2
                double r0 = r0 * r7
                double r2 = r2 * r7
                double r2 = r2 * r7
                double r4 = r7 * r7
                double r4 = r4 * r7
                double r7 = r6.f23476d
                double r7 = r7 * r0
                double r0 = r6.f23478f
                double r0 = r0 * r2
                double r0 = r0 + r7
                double r0 = r0 + r4
                return r0
        }

        /* renamed from: e */
        public final double m12546e(double r7) {
                r6 = this;
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r0 = r0 - r7
                r2 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r2 = r2 * r0
                double r0 = r0 * r2
                double r0 = r0 * r7
                double r2 = r2 * r7
                double r2 = r2 * r7
                double r4 = r7 * r7
                double r4 = r4 * r7
                double r7 = r6.f23477e
                double r7 = r7 * r0
                double r0 = r6.f23479g
                double r0 = r0 * r2
                double r0 = r0 + r7
                double r0 = r0 + r4
                return r0
        }
    }

    static {
            t.c r0 = new t.c
            r0.<init>()
            p331t.C6088c.f23473b = r0
            java.lang.String r0 = "standard"
            java.lang.String r1 = "accelerate"
            java.lang.String r2 = "decelerate"
            java.lang.String r3 = "linear"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            p331t.C6088c.f23474c = r0
            return
    }

    public C6088c() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "identity"
            r1.f23475a = r0
            return
    }

    /* renamed from: c */
    public static p331t.C6088c m12542c(java.lang.String r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "cubic"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L12
            t.c$a r0 = new t.c$a
            r0.<init>(r2)
            return r0
        L12:
            r2.hashCode()
            r0 = -1
            int r1 = r2.hashCode()
            switch(r1) {
                case -1354466595: goto L3f;
                case -1263948740: goto L34;
                case -1102672091: goto L29;
                case 1312628413: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L49
        L1e:
            java.lang.String r1 = "standard"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L27
            goto L49
        L27:
            r0 = 3
            goto L49
        L29:
            java.lang.String r1 = "linear"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L32
            goto L49
        L32:
            r0 = 2
            goto L49
        L34:
            java.lang.String r1 = "decelerate"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L3d
            goto L49
        L3d:
            r0 = 1
            goto L49
        L3f:
            java.lang.String r1 = "accelerate"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L48
            goto L49
        L48:
            r0 = 0
        L49:
            switch(r0) {
                case 0: goto L7f;
                case 1: goto L77;
                case 2: goto L6f;
                case 3: goto L67;
                default: goto L4c;
            }
        L4c:
            java.lang.String r2 = "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String[] r0 = p331t.C6088c.f23474c
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "ConstraintSet"
            android.util.Log.e(r0, r2)
            t.c r2 = p331t.C6088c.f23473b
            return r2
        L67:
            t.c$a r2 = new t.c$a
            java.lang.String r0 = "cubic(0.4, 0.0, 0.2, 1)"
            r2.<init>(r0)
            return r2
        L6f:
            t.c$a r2 = new t.c$a
            java.lang.String r0 = "cubic(1, 1, 0, 0)"
            r2.<init>(r0)
            return r2
        L77:
            t.c$a r2 = new t.c$a
            java.lang.String r0 = "cubic(0.0, 0.0, 0.2, 0.95)"
            r2.<init>(r0)
            return r2
        L7f:
            t.c$a r2 = new t.c$a
            java.lang.String r0 = "cubic(0.4, 0.05, 0.8, 0.7)"
            r2.<init>(r0)
            return r2
    }

    /* renamed from: a */
    public double mo12543a(double r1) {
            r0 = this;
            return r1
    }

    /* renamed from: b */
    public double mo12544b(double r1) {
            r0 = this;
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f23475a
            return r0
    }
}
