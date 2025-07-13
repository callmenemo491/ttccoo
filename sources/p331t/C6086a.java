package p331t;

/* renamed from: t.a */
/* loaded from: classes.dex */
public class C6086a extends p331t.AbstractC6087b {

    /* renamed from: a */
    public final double[] f23450a;

    /* renamed from: b */
    public p331t.C6086a.a[] f23451b;

    /* renamed from: t.a$a */
    public static class a {

        /* renamed from: s */
        public static double[] f23452s;

        /* renamed from: a */
        public double[] f23453a;

        /* renamed from: b */
        public double f23454b;

        /* renamed from: c */
        public double f23455c;

        /* renamed from: d */
        public double f23456d;

        /* renamed from: e */
        public double f23457e;

        /* renamed from: f */
        public double f23458f;

        /* renamed from: g */
        public double f23459g;

        /* renamed from: h */
        public double f23460h;

        /* renamed from: i */
        public double f23461i;

        /* renamed from: j */
        public double f23462j;

        /* renamed from: k */
        public double f23463k;

        /* renamed from: l */
        public double f23464l;

        /* renamed from: m */
        public double f23465m;

        /* renamed from: n */
        public double f23466n;

        /* renamed from: o */
        public double f23467o;

        /* renamed from: p */
        public double f23468p;

        /* renamed from: q */
        public boolean f23469q;

        /* renamed from: r */
        public boolean f23470r;

        static {
                r0 = 91
                double[] r0 = new double[r0]
                p331t.C6086a.a.f23452s = r0
                return
        }

        public a(int r22, double r23, double r25, double r27, double r29, double r31, double r33) {
                r21 = this;
                r0 = r21
                r1 = r22
                r2 = r23
                r4 = r25
                r6 = r27
                r8 = r29
                r10 = r31
                r12 = r33
                r21.<init>()
                r14 = 0
                r0.f23470r = r14
                r15 = 1
                if (r1 != r15) goto L1a
                r14 = 1
            L1a:
                r0.f23469q = r14
                r0.f23455c = r2
                r0.f23456d = r4
                r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r2 = r4 - r2
                double r2 = r17 / r2
                r0.f23461i = r2
                r2 = 3
                if (r2 != r1) goto L2d
                r0.f23470r = r15
            L2d:
                double r1 = r10 - r6
                double r3 = r12 - r8
                boolean r5 = r0.f23470r
                if (r5 != 0) goto L110
                double r17 = java.lang.Math.abs(r1)
                r19 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                int r5 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
                if (r5 < 0) goto L110
                double r17 = java.lang.Math.abs(r3)
                int r5 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
                if (r5 >= 0) goto L4c
                goto L110
            L4c:
                r5 = 101(0x65, float:1.42E-43)
                double[] r5 = new double[r5]
                r0.f23453a = r5
                boolean r5 = r0.f23469q
                if (r5 == 0) goto L57
                r15 = -1
            L57:
                double r14 = (double) r15
                double r14 = r14 * r1
                r0.f23462j = r14
                if (r5 == 0) goto L60
                r15 = 1
                goto L61
            L60:
                r15 = -1
            L61:
                double r14 = (double) r15
                double r3 = r3 * r14
                r0.f23463k = r3
                if (r5 == 0) goto L69
                r6 = r10
            L69:
                r0.f23464l = r6
                if (r5 == 0) goto L6f
                r3 = r8
                goto L70
            L6f:
                r3 = r12
            L70:
                r0.f23465m = r3
                double r3 = r8 - r12
                r7 = 0
                r8 = 0
                r10 = 0
                r12 = 0
            L7b:
                double[] r14 = p331t.C6086a.a.f23452s
                int r15 = r14.length
                if (r7 >= r15) goto Lb3
                r17 = 4636033603912859648(0x4056800000000000, double:90.0)
                double r5 = (double) r7
                double r5 = r5 * r17
                int r15 = r14.length
                r17 = -1
                int r15 = r15 + (-1)
                r25 = r14
                double r14 = (double) r15
                double r5 = r5 / r14
                double r5 = java.lang.Math.toRadians(r5)
                double r14 = java.lang.Math.sin(r5)
                double r5 = java.lang.Math.cos(r5)
                double r14 = r14 * r1
                double r5 = r5 * r3
                if (r7 <= 0) goto Lae
                double r10 = r14 - r10
                double r12 = r5 - r12
                double r10 = java.lang.Math.hypot(r10, r12)
                double r8 = r8 + r10
                r25[r7] = r8
            Lae:
                int r7 = r7 + 1
                r12 = r5
                r10 = r14
                goto L7b
            Lb3:
                r0.f23454b = r8
                r1 = 0
            Lb6:
                double[] r2 = p331t.C6086a.a.f23452s
                int r3 = r2.length
                if (r1 >= r3) goto Lc3
                r3 = r2[r1]
                double r3 = r3 / r8
                r2[r1] = r3
                int r1 = r1 + 1
                goto Lb6
            Lc3:
                r14 = 0
            Lc4:
                double[] r1 = r0.f23453a
                int r2 = r1.length
                if (r14 >= r2) goto L107
                double r2 = (double) r14
                int r1 = r1.length
                r4 = -1
                int r1 = r1 + r4
                double r5 = (double) r1
                double r2 = r2 / r5
                double[] r1 = p331t.C6086a.a.f23452s
                int r5 = java.util.Arrays.binarySearch(r1, r2)
                if (r5 < 0) goto Le2
                double[] r2 = r0.f23453a
                int r1 = r1.length
                int r1 = r1 + r4
                int r5 = r5 / r1
                double r5 = (double) r5
                r2[r14] = r5
                r6 = 0
                goto L104
            Le2:
                if (r5 != r4) goto Leb
                double[] r1 = r0.f23453a
                r6 = 0
                r1[r14] = r6
                goto L104
            Leb:
                r6 = 0
                int r5 = -r5
                int r8 = r5 + (-2)
                int r5 = r5 + r4
                double r9 = (double) r8
                r11 = r1[r8]
                double r2 = r2 - r11
                r11 = r1[r5]
                r15 = r1[r8]
                double r11 = r11 - r15
                double r2 = r2 / r11
                double r2 = r2 + r9
                int r1 = r1.length
                int r1 = r1 + r4
                double r8 = (double) r1
                double r2 = r2 / r8
                double[] r1 = r0.f23453a
                r1[r14] = r2
            L104:
                int r14 = r14 + 1
                goto Lc4
            L107:
                double r1 = r0.f23454b
                double r3 = r0.f23461i
                double r1 = r1 * r3
                r0.f23466n = r1
                return
            L110:
                r5 = 1
                r0.f23470r = r5
                r0.f23457e = r6
                r0.f23458f = r10
                r0.f23459g = r8
                r0.f23460h = r12
                double r5 = java.lang.Math.hypot(r3, r1)
                r0.f23454b = r5
                double r7 = r0.f23461i
                double r5 = r5 * r7
                r0.f23466n = r5
                double r5 = r0.f23456d
                double r7 = r0.f23455c
                double r9 = r5 - r7
                double r1 = r1 / r9
                r0.f23464l = r1
                double r5 = r5 - r7
                double r3 = r3 / r5
                r0.f23465m = r3
                return
        }

        /* renamed from: a */
        public double m12536a(double r5) {
                r4 = this;
                double r0 = r4.f23455c
                double r5 = r5 - r0
                double r0 = r4.f23461i
                double r5 = r5 * r0
                double r0 = r4.f23457e
                double r2 = r4.f23458f
                double r2 = r2 - r0
                double r2 = r2 * r5
                double r2 = r2 + r0
                return r2
        }

        /* renamed from: b */
        public double m12537b(double r5) {
                r4 = this;
                double r0 = r4.f23455c
                double r5 = r5 - r0
                double r0 = r4.f23461i
                double r5 = r5 * r0
                double r0 = r4.f23459g
                double r2 = r4.f23460h
                double r2 = r2 - r0
                double r2 = r2 * r5
                double r2 = r2 + r0
                return r2
        }

        /* renamed from: c */
        public double m12538c() {
                r6 = this;
                double r0 = r6.f23464l
                double r2 = r6.f23462j
                double r4 = r6.f23467o
                double r2 = r2 * r4
                double r2 = r2 + r0
                return r2
        }

        /* renamed from: d */
        public double m12539d() {
                r6 = this;
                double r0 = r6.f23465m
                double r2 = r6.f23463k
                double r4 = r6.f23468p
                double r2 = r2 * r4
                double r2 = r2 + r0
                return r2
        }

        /* renamed from: e */
        public void m12540e(double r11) {
                r10 = this;
                boolean r0 = r10.f23469q
                if (r0 == 0) goto L8
                double r0 = r10.f23456d
                double r0 = r0 - r11
                goto Lc
            L8:
                double r0 = r10.f23455c
                double r0 = r11 - r0
            Lc:
                double r11 = r10.f23461i
                double r0 = r0 * r11
                r11 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 > 0) goto L1c
                goto L3b
            L1c:
                r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L23
                goto L3b
            L23:
                double[] r2 = r10.f23453a
                int r3 = r2.length
                int r3 = r3 + (-1)
                double r3 = (double) r3
                double r0 = r0 * r3
                int r3 = (int) r0
                double r4 = (double) r3
                double r0 = r0 - r4
                r4 = r2[r3]
                int r6 = r3 + 1
                r6 = r2[r6]
                r8 = r2[r3]
                double r6 = r6 - r8
                double r6 = r6 * r0
                double r2 = r6 + r4
            L3b:
                double r2 = r2 * r11
                double r11 = java.lang.Math.sin(r2)
                r10.f23467o = r11
                double r11 = java.lang.Math.cos(r2)
                r10.f23468p = r11
                return
        }
    }

    public C6086a(int[] r25, double[] r26, double[][] r27) {
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r0.f23450a = r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            t.a$a[] r2 = new p331t.C6086a.a[r2]
            r0.f23451b = r2
            r2 = 0
            r4 = 0
            r5 = 1
            r6 = 1
        L14:
            t.a$a[] r7 = r0.f23451b
            int r8 = r7.length
            if (r4 >= r8) goto L57
            r8 = r25[r4]
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L33
            if (r8 == r3) goto L30
            if (r8 == r10) goto L2d
            if (r8 == r9) goto L26
            goto L34
        L26:
            if (r5 != r3) goto L2a
            r5 = 2
            goto L2b
        L2a:
            r5 = 1
        L2b:
            r6 = r5
            goto L34
        L2d:
            r5 = 2
            r6 = 2
            goto L34
        L30:
            r5 = 1
            r6 = 1
            goto L34
        L33:
            r6 = 3
        L34:
            t.a$a r22 = new t.a$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r2]
            r8 = r27[r4]
            r16 = r8[r3]
            r8 = r27[r23]
            r18 = r8[r2]
            r8 = r27[r23]
            r20 = r8[r3]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L14
        L57:
            return
    }

    @Override // p331t.AbstractC6087b
    /* renamed from: b */
    public double mo12531b(double r6, int r8) {
            r5 = this;
            t.a$a[] r0 = r5.f23451b
            r1 = 0
            r2 = r0[r1]
            double r2 = r2.f23455c
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 >= 0) goto L10
            r6 = r0[r1]
            double r6 = r6.f23455c
            goto L22
        L10:
            int r2 = r0.length
            int r2 = r2 + (-1)
            r2 = r0[r2]
            double r2 = r2.f23456d
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 <= 0) goto L22
            int r6 = r0.length
            int r6 = r6 + (-1)
            r6 = r0[r6]
            double r6 = r6.f23456d
        L22:
            t.a$a[] r0 = r5.f23451b
            int r2 = r0.length
            if (r1 >= r2) goto L5f
            r2 = r0[r1]
            double r2 = r2.f23456d
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 > 0) goto L5c
            r2 = r0[r1]
            boolean r2 = r2.f23470r
            if (r2 == 0) goto L45
            if (r8 != 0) goto L3e
            r8 = r0[r1]
            double r6 = r8.m12536a(r6)
            return r6
        L3e:
            r8 = r0[r1]
            double r6 = r8.m12537b(r6)
            return r6
        L45:
            r0 = r0[r1]
            r0.m12540e(r6)
            t.a$a[] r6 = r5.f23451b
            if (r8 != 0) goto L55
            r6 = r6[r1]
            double r6 = r6.m12538c()
            return r6
        L55:
            r6 = r6[r1]
            double r6 = r6.m12539d()
            return r6
        L5c:
            int r1 = r1 + 1
            goto L22
        L5f:
            r6 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r6
    }

    @Override // p331t.AbstractC6087b
    /* renamed from: c */
    public void mo12532c(double r8, double[] r10) {
            r7 = this;
            t.a$a[] r0 = r7.f23451b
            r1 = 0
            r2 = r0[r1]
            double r2 = r2.f23455c
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lf
            r8 = r0[r1]
            double r8 = r8.f23455c
        Lf:
            int r2 = r0.length
            r3 = 1
            int r2 = r2 - r3
            r2 = r0[r2]
            double r4 = r2.f23456d
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto L20
            int r8 = r0.length
            int r8 = r8 - r3
            r8 = r0[r8]
            double r8 = r8.f23456d
        L20:
            r0 = 0
        L21:
            t.a$a[] r2 = r7.f23451b
            int r4 = r2.length
            if (r0 >= r4) goto L64
            r4 = r2[r0]
            double r4 = r4.f23456d
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L61
            r4 = r2[r0]
            boolean r4 = r4.f23470r
            if (r4 == 0) goto L47
            r2 = r2[r0]
            double r4 = r2.m12536a(r8)
            r10[r1] = r4
            t.a$a[] r1 = r7.f23451b
            r0 = r1[r0]
            double r8 = r0.m12537b(r8)
            r10[r3] = r8
            return
        L47:
            r2 = r2[r0]
            r2.m12540e(r8)
            t.a$a[] r8 = r7.f23451b
            r8 = r8[r0]
            double r8 = r8.m12538c()
            r10[r1] = r8
            t.a$a[] r8 = r7.f23451b
            r8 = r8[r0]
            double r8 = r8.m12539d()
            r10[r3] = r8
            return
        L61:
            int r0 = r0 + 1
            goto L21
        L64:
            return
    }

    @Override // p331t.AbstractC6087b
    /* renamed from: d */
    public void mo12533d(double r8, float[] r10) {
            r7 = this;
            t.a$a[] r0 = r7.f23451b
            r1 = 0
            r2 = r0[r1]
            double r2 = r2.f23455c
            r4 = 1
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 >= 0) goto L11
            r8 = r0[r1]
            double r8 = r8.f23455c
            goto L21
        L11:
            int r2 = r0.length
            int r2 = r2 - r4
            r2 = r0[r2]
            double r2 = r2.f23456d
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 <= 0) goto L21
            int r8 = r0.length
            int r8 = r8 - r4
            r8 = r0[r8]
            double r8 = r8.f23456d
        L21:
            r0 = 0
        L22:
            t.a$a[] r2 = r7.f23451b
            int r3 = r2.length
            if (r0 >= r3) goto L69
            r3 = r2[r0]
            double r5 = r3.f23456d
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 > 0) goto L66
            r3 = r2[r0]
            boolean r3 = r3.f23470r
            if (r3 == 0) goto L4a
            r2 = r2[r0]
            double r2 = r2.m12536a(r8)
            float r2 = (float) r2
            r10[r1] = r2
            t.a$a[] r1 = r7.f23451b
            r0 = r1[r0]
            double r8 = r0.m12537b(r8)
            float r8 = (float) r8
            r10[r4] = r8
            return
        L4a:
            r2 = r2[r0]
            r2.m12540e(r8)
            t.a$a[] r8 = r7.f23451b
            r8 = r8[r0]
            double r8 = r8.m12538c()
            float r8 = (float) r8
            r10[r1] = r8
            t.a$a[] r8 = r7.f23451b
            r8 = r8[r0]
            double r8 = r8.m12539d()
            float r8 = (float) r8
            r10[r4] = r8
            return
        L66:
            int r0 = r0 + 1
            goto L22
        L69:
            return
    }

    @Override // p331t.AbstractC6087b
    /* renamed from: e */
    public void mo12534e(double r10, double[] r12) {
            r9 = this;
            t.a$a[] r0 = r9.f23451b
            r1 = 0
            r2 = r0[r1]
            double r2 = r2.f23455c
            r4 = 1
            int r5 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r5 >= 0) goto L11
            r10 = r0[r1]
            double r10 = r10.f23455c
            goto L21
        L11:
            int r2 = r0.length
            int r2 = r2 - r4
            r2 = r0[r2]
            double r2 = r2.f23456d
            int r5 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r5 <= 0) goto L21
            int r10 = r0.length
            int r10 = r10 - r4
            r10 = r0[r10]
            double r10 = r10.f23456d
        L21:
            r0 = 0
        L22:
            t.a$a[] r2 = r9.f23451b
            int r3 = r2.length
            if (r0 >= r3) goto L90
            r3 = r2[r0]
            double r5 = r3.f23456d
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 > 0) goto L8d
            r3 = r2[r0]
            boolean r3 = r3.f23470r
            if (r3 == 0) goto L42
            r10 = r2[r0]
            double r10 = r10.f23464l
            r12[r1] = r10
            r10 = r2[r0]
            double r10 = r10.f23465m
            r12[r4] = r10
            return
        L42:
            r2 = r2[r0]
            r2.m12540e(r10)
            t.a$a[] r10 = r9.f23451b
            r10 = r10[r0]
            double r2 = r10.f23462j
            double r5 = r10.f23468p
            double r2 = r2 * r5
            double r5 = r10.f23463k
            double r5 = -r5
            double r7 = r10.f23467o
            double r5 = r5 * r7
            double r7 = r10.f23466n
            double r5 = java.lang.Math.hypot(r2, r5)
            double r7 = r7 / r5
            boolean r10 = r10.f23469q
            if (r10 == 0) goto L64
            double r2 = -r2
        L64:
            double r2 = r2 * r7
            r12[r1] = r2
            t.a$a[] r10 = r9.f23451b
            r10 = r10[r0]
            double r0 = r10.f23462j
            double r2 = r10.f23468p
            double r0 = r0 * r2
            double r2 = r10.f23463k
            double r2 = -r2
            double r5 = r10.f23467o
            double r2 = r2 * r5
            double r5 = r10.f23466n
            double r0 = java.lang.Math.hypot(r0, r2)
            double r5 = r5 / r0
            boolean r10 = r10.f23469q
            if (r10 == 0) goto L88
            double r10 = -r2
            double r10 = r10 * r5
            goto L8a
        L88:
            double r10 = r2 * r5
        L8a:
            r12[r4] = r10
            return
        L8d:
            int r0 = r0 + 1
            goto L22
        L90:
            return
    }

    @Override // p331t.AbstractC6087b
    /* renamed from: f */
    public double[] mo12535f() {
            r1 = this;
            double[] r0 = r1.f23450a
            return r0
    }
}
