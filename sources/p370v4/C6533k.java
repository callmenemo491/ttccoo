package p370v4;

/* renamed from: v4.k */
/* loaded from: classes.dex */
public final class C6533k implements p370v4.InterfaceC6532j {

    /* renamed from: q */
    public static final double[] f25403q = null;

    /* renamed from: a */
    public java.lang.String f25404a;

    /* renamed from: b */
    public p216m4.InterfaceC4381z f25405b;

    /* renamed from: c */
    public final p370v4.C6527e0 f25406c;

    /* renamed from: d */
    public final p371v5.C6571u f25407d;

    /* renamed from: e */
    public final p370v4.C6540r f25408e;

    /* renamed from: f */
    public final boolean[] f25409f;

    /* renamed from: g */
    public final p370v4.C6533k.a f25410g;

    /* renamed from: h */
    public long f25411h;

    /* renamed from: i */
    public boolean f25412i;

    /* renamed from: j */
    public boolean f25413j;

    /* renamed from: k */
    public long f25414k;

    /* renamed from: l */
    public long f25415l;

    /* renamed from: m */
    public long f25416m;

    /* renamed from: n */
    public long f25417n;

    /* renamed from: o */
    public boolean f25418o;

    /* renamed from: p */
    public boolean f25419p;

    /* renamed from: v4.k$a */
    public static final class a {

        /* renamed from: e */
        public static final byte[] f25420e = null;

        /* renamed from: a */
        public boolean f25421a;

        /* renamed from: b */
        public int f25422b;

        /* renamed from: c */
        public int f25423c;

        /* renamed from: d */
        public byte[] f25424d;

        static {
                r0 = 3
                byte[] r0 = new byte[r0]
                r0 = {x000a: FILL_ARRAY_DATA , data: [0, 0, 1} // fill-array
                p370v4.C6533k.a.f25420e = r0
                return
        }

        public a(int r1) {
                r0 = this;
                r0.<init>()
                byte[] r1 = new byte[r1]
                r0.f25424d = r1
                return
        }

        /* renamed from: a */
        public void m13267a(byte[] r5, int r6, int r7) {
                r4 = this;
                boolean r0 = r4.f25421a
                if (r0 != 0) goto L5
                return
            L5:
                int r7 = r7 - r6
                byte[] r0 = r4.f25424d
                int r1 = r0.length
                int r2 = r4.f25422b
                int r3 = r2 + r7
                if (r1 >= r3) goto L18
                int r2 = r2 + r7
                int r2 = r2 * 2
                byte[] r0 = java.util.Arrays.copyOf(r0, r2)
                r4.f25424d = r0
            L18:
                byte[] r0 = r4.f25424d
                int r1 = r4.f25422b
                java.lang.System.arraycopy(r5, r6, r0, r1, r7)
                int r5 = r4.f25422b
                int r5 = r5 + r7
                r4.f25422b = r5
                return
        }
    }

    static {
            r0 = 8
            double[] r0 = new double[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [4627441868472394375, 4627448617123184640, 4627730092099895296, 4629129031169960744, 4629137466983448576, 4632233691727265792, 4633632630797331240, 4633641066610819072} // fill-array
            p370v4.C6533k.f25403q = r0
            return
    }

    public C6533k(p370v4.C6527e0 r3) {
            r2 = this;
            r2.<init>()
            r2.f25406c = r3
            r0 = 4
            boolean[] r0 = new boolean[r0]
            r2.f25409f = r0
            v4.k$a r0 = new v4.k$a
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.f25410g = r0
            if (r3 == 0) goto L24
            v4.r r3 = new v4.r
            r0 = 178(0xb2, float:2.5E-43)
            r3.<init>(r0, r1)
            r2.f25408e = r3
            v5.u r3 = new v5.u
            r3.<init>()
            goto L27
        L24:
            r3 = 0
            r2.f25408e = r3
        L27:
            r2.f25407d = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f25415l = r0
            r2.f25417n = r0
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: a */
    public void mo13241a() {
            r4 = this;
            boolean[] r0 = r4.f25409f
            p371v5.C6568r.m13382a(r0)
            v4.k$a r0 = r4.f25410g
            r1 = 0
            r0.f25421a = r1
            r0.f25422b = r1
            r0.f25423c = r1
            v4.r r0 = r4.f25408e
            if (r0 == 0) goto L15
            r0.m13278c()
        L15:
            r2 = 0
            r4.f25411h = r2
            r4.f25412i = r1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.f25415l = r0
            r4.f25417n = r0
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: c */
    public void mo13242c(p371v5.C6571u r23) {
            r22 = this;
            r0 = r22
            r1 = r23
            m4.z r2 = r0.f25405b
            p371v5.C6549a.m13292f(r2)
            int r2 = r1.f25711b
            int r3 = r1.f25712c
            byte[] r4 = r1.f25710a
            long r5 = r0.f25411h
            int r7 = r23.m13398a()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f25411h = r5
            m4.z r5 = r0.f25405b
            int r6 = r23.m13398a()
            r5.mo5972d(r1, r6)
        L22:
            boolean[] r5 = r0.f25409f
            int r5 = p371v5.C6568r.m13383b(r4, r2, r3, r5)
            if (r5 != r3) goto L3b
            boolean r1 = r0.f25413j
            if (r1 != 0) goto L33
            v4.k$a r1 = r0.f25410g
            r1.m13267a(r4, r2, r3)
        L33:
            v4.r r1 = r0.f25408e
            if (r1 == 0) goto L3a
            r1.m13276a(r4, r2, r3)
        L3a:
            return
        L3b:
            byte[] r6 = r1.f25710a
            int r7 = r5 + 3
            r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r8 = r5 - r2
            boolean r9 = r0.f25413j
            r10 = 179(0xb3, float:2.51E-43)
            r11 = 0
            r12 = 1
            if (r9 != 0) goto L149
            if (r8 <= 0) goto L54
            v4.k$a r9 = r0.f25410g
            r9.m13267a(r4, r2, r5)
        L54:
            if (r8 >= 0) goto L58
            int r9 = -r8
            goto L59
        L58:
            r9 = 0
        L59:
            v4.k$a r13 = r0.f25410g
            boolean r14 = r13.f25421a
            if (r14 == 0) goto L73
            int r14 = r13.f25422b
            int r14 = r14 - r9
            r13.f25422b = r14
            int r9 = r13.f25423c
            if (r9 != 0) goto L6f
            r9 = 181(0xb5, float:2.54E-43)
            if (r6 != r9) goto L6f
            r13.f25423c = r14
            goto L77
        L6f:
            r13.f25421a = r11
            r9 = 1
            goto L7e
        L73:
            if (r6 != r10) goto L77
            r13.f25421a = r12
        L77:
            byte[] r9 = p370v4.C6533k.a.f25420e
            int r14 = r9.length
            r13.m13267a(r9, r11, r14)
            r9 = 0
        L7e:
            if (r9 == 0) goto L149
            v4.k$a r9 = r0.f25410g
            java.lang.String r13 = r0.f25404a
            java.util.Objects.requireNonNull(r13)
            byte[] r14 = r9.f25424d
            int r15 = r9.f25422b
            byte[] r14 = java.util.Arrays.copyOf(r14, r15)
            r15 = 4
            r11 = r14[r15]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r16 = 5
            r10 = r14[r16]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r17 = 6
            r12 = r14[r17]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r11 = r11 << r15
            int r17 = r10 >> 4
            r11 = r11 | r17
            r10 = r10 & 15
            int r10 = r10 << 8
            r10 = r10 | r12
            r12 = 7
            r15 = r14[r12]
            r15 = r15 & 240(0xf0, float:3.36E-43)
            r12 = 4
            int r15 = r15 >> r12
            r12 = 2
            if (r15 == r12) goto Lc9
            r12 = 3
            if (r15 == r12) goto Lc3
            r12 = 4
            if (r15 == r12) goto Lbd
            r12 = 1065353216(0x3f800000, float:1.0)
            goto Ld0
        Lbd:
            int r12 = r10 * 121
            float r12 = (float) r12
            int r15 = r11 * 100
            goto Lce
        Lc3:
            int r12 = r10 * 16
            float r12 = (float) r12
            int r15 = r11 * 9
            goto Lce
        Lc9:
            int r12 = r10 * 4
            float r12 = (float) r12
            int r15 = r11 * 3
        Lce:
            float r15 = (float) r15
            float r12 = r12 / r15
        Ld0:
            f4.e0$b r15 = new f4.e0$b
            r15.<init>()
            r15.f8917a = r13
            java.lang.String r13 = "video/mpeg2"
            r15.f8927k = r13
            r15.f8932p = r11
            r15.f8933q = r10
            r15.f8936t = r12
            java.util.List r10 = java.util.Collections.singletonList(r14)
            r15.f8929m = r10
            f4.e0 r10 = r15.m5193a()
            r13 = 7
            r13 = r14[r13]
            r13 = r13 & 15
            int r13 = r13 + (-1)
            if (r13 < 0) goto L125
            double[] r15 = p370v4.C6533k.f25403q
            int r11 = r15.length
            if (r13 >= r11) goto L125
            r11 = r15[r13]
            int r9 = r9.f25423c
            int r9 = r9 + 9
            r13 = r14[r9]
            r13 = r13 & 96
            int r13 = r13 >> 5
            r9 = r14[r9]
            r9 = r9 & 31
            if (r13 == r9) goto L11a
            double r13 = (double) r13
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r13 + r18
            int r9 = r9 + 1
            r16 = r6
            r15 = r7
            double r6 = (double) r9
            double r13 = r13 / r6
            double r11 = r11 * r13
            goto L11d
        L11a:
            r16 = r6
            r15 = r7
        L11d:
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r6 = r6 / r11
            long r11 = (long) r6
            goto L12a
        L125:
            r16 = r6
            r15 = r7
            r11 = 0
        L12a:
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            android.util.Pair r6 = android.util.Pair.create(r10, r6)
            m4.z r7 = r0.f25405b
            java.lang.Object r9 = r6.first
            f4.e0 r9 = (p088f4.C2003e0) r9
            r7.mo5973e(r9)
            java.lang.Object r6 = r6.second
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r0.f25414k = r6
            r6 = 1
            r0.f25413j = r6
            goto L14c
        L149:
            r16 = r6
            r15 = r7
        L14c:
            v4.r r6 = r0.f25408e
            if (r6 == 0) goto L193
            if (r8 <= 0) goto L157
            r6.m13276a(r4, r2, r5)
            r2 = 0
            goto L158
        L157:
            int r2 = -r8
        L158:
            v4.r r6 = r0.f25408e
            boolean r2 = r6.m13277b(r2)
            if (r2 == 0) goto L17e
            v4.r r2 = r0.f25408e
            byte[] r6 = r2.f25569d
            int r2 = r2.f25570e
            int r2 = p371v5.C6568r.m13387f(r6, r2)
            v5.u r6 = r0.f25407d
            int r7 = p371v5.C6552b0.f25624a
            v4.r r7 = r0.f25408e
            byte[] r7 = r7.f25569d
            r6.m13394D(r7, r2)
            v4.e0 r2 = r0.f25406c
            long r6 = r0.f25417n
            v5.u r8 = r0.f25407d
            r2.m13257a(r6, r8)
        L17e:
            r2 = 178(0xb2, float:2.5E-43)
            r6 = r16
            if (r6 != r2) goto L195
            byte[] r2 = r1.f25710a
            int r7 = r5 + 2
            r2 = r2[r7]
            r7 = 1
            if (r2 != r7) goto L195
            v4.r r2 = r0.f25408e
            r2.m13279d(r6)
            goto L195
        L193:
            r6 = r16
        L195:
            if (r6 == 0) goto L1a7
            r2 = 179(0xb3, float:2.51E-43)
            if (r6 != r2) goto L19c
            goto L1a7
        L19c:
            r2 = 184(0xb8, float:2.58E-43)
            if (r6 != r2) goto L1a3
            r2 = 1
            r0.f25418o = r2
        L1a3:
            r5 = r3
            r14 = r4
            goto L210
        L1a7:
            int r2 = r3 - r5
            boolean r5 = r0.f25419p
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == 0) goto L1d5
            boolean r5 = r0.f25413j
            if (r5 == 0) goto L1d5
            long r8 = r0.f25417n
            int r5 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r5 == 0) goto L1d5
            boolean r10 = r0.f25418o
            long r11 = r0.f25411h
            long r13 = r0.f25416m
            long r11 = r11 - r13
            int r5 = (int) r11
            int r11 = r5 - r2
            m4.z r7 = r0.f25405b
            r13 = 0
            r12 = r2
            r5 = r3
            r14 = r4
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.mo5971c(r8, r10, r11, r12, r13)
            goto L1db
        L1d5:
            r5 = r3
            r20 = r13
            r14 = r4
            r3 = r20
        L1db:
            boolean r7 = r0.f25412i
            if (r7 == 0) goto L1e7
            boolean r7 = r0.f25419p
            if (r7 == 0) goto L1e4
            goto L1e7
        L1e4:
            r2 = 0
            r3 = 1
            goto L209
        L1e7:
            long r7 = r0.f25411h
            long r9 = (long) r2
            long r7 = r7 - r9
            r0.f25416m = r7
            long r7 = r0.f25415l
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L1f4
            goto L1ff
        L1f4:
            long r7 = r0.f25417n
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L1fe
            long r9 = r0.f25414k
            long r7 = r7 + r9
            goto L1ff
        L1fe:
            r7 = r3
        L1ff:
            r0.f25417n = r7
            r2 = 0
            r0.f25418o = r2
            r0.f25415l = r3
            r3 = 1
            r0.f25412i = r3
        L209:
            if (r6 != 0) goto L20d
            r11 = 1
            goto L20e
        L20d:
            r11 = 0
        L20e:
            r0.f25419p = r11
        L210:
            r3 = r5
            r4 = r14
            r2 = r15
            goto L22
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: d */
    public void mo13243d(p216m4.InterfaceC4366k r3, p370v4.InterfaceC6525d0.d r4) {
            r2 = this;
            r4.m13253a()
            java.lang.String r0 = r4.m13254b()
            r2.f25404a = r0
            int r0 = r4.m13255c()
            r1 = 2
            m4.z r0 = r3.mo6048l(r0, r1)
            r2.f25405b = r0
            v4.e0 r0 = r2.f25406c
            if (r0 == 0) goto L1b
            r0.m13258b(r3, r4)
        L1b:
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: e */
    public void mo13244e() {
            r0 = this;
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: f */
    public void mo13245f(long r1, int r3) {
            r0 = this;
            r0.f25415l = r1
            return
    }
}
