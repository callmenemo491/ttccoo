package p370v4;

/* renamed from: v4.l */
/* loaded from: classes.dex */
public final class C6534l implements p370v4.InterfaceC6532j {

    /* renamed from: l */
    public static final float[] f25425l = null;

    /* renamed from: a */
    public final p370v4.C6527e0 f25426a;

    /* renamed from: b */
    public final p371v5.C6571u f25427b;

    /* renamed from: c */
    public final boolean[] f25428c;

    /* renamed from: d */
    public final p370v4.C6534l.a f25429d;

    /* renamed from: e */
    public final p370v4.C6540r f25430e;

    /* renamed from: f */
    public p370v4.C6534l.b f25431f;

    /* renamed from: g */
    public long f25432g;

    /* renamed from: h */
    public java.lang.String f25433h;

    /* renamed from: i */
    public p216m4.InterfaceC4381z f25434i;

    /* renamed from: j */
    public boolean f25435j;

    /* renamed from: k */
    public long f25436k;

    /* renamed from: v4.l$a */
    public static final class a {

        /* renamed from: f */
        public static final byte[] f25437f = null;

        /* renamed from: a */
        public boolean f25438a;

        /* renamed from: b */
        public int f25439b;

        /* renamed from: c */
        public int f25440c;

        /* renamed from: d */
        public int f25441d;

        /* renamed from: e */
        public byte[] f25442e;

        static {
                r0 = 3
                byte[] r0 = new byte[r0]
                r0 = {x000a: FILL_ARRAY_DATA , data: [0, 0, 1} // fill-array
                p370v4.C6534l.a.f25437f = r0
                return
        }

        public a(int r1) {
                r0 = this;
                r0.<init>()
                byte[] r1 = new byte[r1]
                r0.f25442e = r1
                return
        }

        /* renamed from: a */
        public void m13268a(byte[] r5, int r6, int r7) {
                r4 = this;
                boolean r0 = r4.f25438a
                if (r0 != 0) goto L5
                return
            L5:
                int r7 = r7 - r6
                byte[] r0 = r4.f25442e
                int r1 = r0.length
                int r2 = r4.f25440c
                int r3 = r2 + r7
                if (r1 >= r3) goto L18
                int r2 = r2 + r7
                int r2 = r2 * 2
                byte[] r0 = java.util.Arrays.copyOf(r0, r2)
                r4.f25442e = r0
            L18:
                byte[] r0 = r4.f25442e
                int r1 = r4.f25440c
                java.lang.System.arraycopy(r5, r6, r0, r1, r7)
                int r5 = r4.f25440c
                int r5 = r5 + r7
                r4.f25440c = r5
                return
        }

        /* renamed from: b */
        public void m13269b() {
                r1 = this;
                r0 = 0
                r1.f25438a = r0
                r1.f25440c = r0
                r1.f25439b = r0
                return
        }
    }

    /* renamed from: v4.l$b */
    public static final class b {

        /* renamed from: a */
        public final p216m4.InterfaceC4381z f25443a;

        /* renamed from: b */
        public boolean f25444b;

        /* renamed from: c */
        public boolean f25445c;

        /* renamed from: d */
        public boolean f25446d;

        /* renamed from: e */
        public int f25447e;

        /* renamed from: f */
        public int f25448f;

        /* renamed from: g */
        public long f25449g;

        /* renamed from: h */
        public long f25450h;

        public b(p216m4.InterfaceC4381z r1) {
                r0 = this;
                r0.<init>()
                r0.f25443a = r1
                return
        }

        /* renamed from: a */
        public void m13270a(byte[] r3, int r4, int r5) {
                r2 = this;
                boolean r0 = r2.f25445c
                if (r0 == 0) goto L20
                int r0 = r4 + 1
                int r1 = r2.f25448f
                int r0 = r0 - r1
                if (r0 >= r5) goto L1c
                r3 = r3[r0]
                r3 = r3 & 192(0xc0, float:2.69E-43)
                int r3 = r3 >> 6
                r4 = 0
                if (r3 != 0) goto L16
                r3 = 1
                goto L17
            L16:
                r3 = 0
            L17:
                r2.f25446d = r3
                r2.f25445c = r4
                goto L20
            L1c:
                int r5 = r5 - r4
                int r5 = r5 + r1
                r2.f25448f = r5
            L20:
                return
        }
    }

    static {
            r0 = 7
            float[] r0 = new float[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1065353216, 1065353216, 1066115817, 1063828015, 1069166220, 1067132618, 1065353216} // fill-array
            p370v4.C6534l.f25425l = r0
            return
    }

    public C6534l(p370v4.C6527e0 r4) {
            r3 = this;
            r3.<init>()
            r3.f25426a = r4
            r4 = 4
            boolean[] r4 = new boolean[r4]
            r3.f25428c = r4
            v4.l$a r4 = new v4.l$a
            r0 = 128(0x80, float:1.8E-43)
            r4.<init>(r0)
            r3.f25429d = r4
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f25436k = r1
            v4.r r4 = new v4.r
            r1 = 178(0xb2, float:2.5E-43)
            r4.<init>(r1, r0)
            r3.f25430e = r4
            v5.u r4 = new v5.u
            r4.<init>()
            r3.f25427b = r4
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: a */
    public void mo13241a() {
            r2 = this;
            boolean[] r0 = r2.f25428c
            p371v5.C6568r.m13382a(r0)
            v4.l$a r0 = r2.f25429d
            r0.m13269b()
            v4.l$b r0 = r2.f25431f
            if (r0 == 0) goto L18
            r1 = 0
            r0.f25444b = r1
            r0.f25445c = r1
            r0.f25446d = r1
            r1 = -1
            r0.f25447e = r1
        L18:
            v4.r r0 = r2.f25430e
            if (r0 == 0) goto L1f
            r0.m13278c()
        L1f:
            r0 = 0
            r2.f25432g = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f25436k = r0
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: c */
    public void mo13242c(p371v5.C6571u r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            v4.l$b r2 = r0.f25431f
            p371v5.C6549a.m13292f(r2)
            m4.z r2 = r0.f25434i
            p371v5.C6549a.m13292f(r2)
            int r2 = r1.f25711b
            int r3 = r1.f25712c
            byte[] r4 = r1.f25710a
            long r5 = r0.f25432g
            int r7 = r20.m13398a()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f25432g = r5
            m4.z r5 = r0.f25434i
            int r6 = r20.m13398a()
            r5.mo5972d(r1, r6)
        L27:
            boolean[] r5 = r0.f25428c
            int r5 = p371v5.C6568r.m13383b(r4, r2, r3, r5)
            if (r5 != r3) goto L45
            boolean r1 = r0.f25435j
            if (r1 != 0) goto L38
            v4.l$a r1 = r0.f25429d
            r1.m13268a(r4, r2, r3)
        L38:
            v4.l$b r1 = r0.f25431f
            r1.m13270a(r4, r2, r3)
            v4.r r1 = r0.f25430e
            if (r1 == 0) goto L44
            r1.m13276a(r4, r2, r3)
        L44:
            return
        L45:
            byte[] r6 = r1.f25710a
            int r7 = r5 + 3
            r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r8 = r5 - r2
            boolean r9 = r0.f25435j
            r12 = 1
            if (r9 != 0) goto L1c3
            if (r8 <= 0) goto L5b
            v4.l$a r9 = r0.f25429d
            r9.m13268a(r4, r2, r5)
        L5b:
            if (r8 >= 0) goto L5f
            int r9 = -r8
            goto L60
        L5f:
            r9 = 0
        L60:
            v4.l$a r13 = r0.f25429d
            int r14 = r13.f25439b
            java.lang.String r11 = "H263Reader"
            r10 = 2
            if (r14 == 0) goto Lae
            r15 = 181(0xb5, float:2.54E-43)
            if (r14 == r12) goto L9f
            if (r14 == r10) goto L98
            r10 = 3
            if (r14 == r10) goto L8b
            r10 = 4
            if (r14 != r10) goto L85
            r10 = 179(0xb3, float:2.51E-43)
            if (r6 == r10) goto L7b
            if (r6 != r15) goto Lb6
        L7b:
            int r10 = r13.f25440c
            int r10 = r10 - r9
            r13.f25440c = r10
            r9 = 0
            r13.f25438a = r9
            r9 = 1
            goto Lbe
        L85:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L8b:
            r9 = r6 & 240(0xf0, float:3.36E-43)
            r10 = 32
            if (r9 == r10) goto L92
            goto La1
        L92:
            int r9 = r13.f25440c
            r13.f25441d = r9
            r9 = 4
            goto Lab
        L98:
            r9 = 31
            if (r6 <= r9) goto L9d
            goto La1
        L9d:
            r9 = 3
            goto Lab
        L9f:
            if (r6 == r15) goto Laa
        La1:
            java.lang.String r9 = "Unexpected start code value"
            android.util.Log.w(r11, r9)
            r13.m13269b()
            goto Lb6
        Laa:
            r9 = 2
        Lab:
            r13.f25439b = r9
            goto Lb6
        Lae:
            r9 = 176(0xb0, float:2.47E-43)
            if (r6 != r9) goto Lb6
            r13.f25439b = r12
            r13.f25438a = r12
        Lb6:
            byte[] r9 = p370v4.C6534l.a.f25437f
            int r10 = r9.length
            r14 = 0
            r13.m13268a(r9, r14, r10)
            r9 = 0
        Lbe:
            if (r9 == 0) goto L1c3
            m4.z r9 = r0.f25434i
            v4.l$a r10 = r0.f25429d
            int r13 = r10.f25441d
            java.lang.String r14 = r0.f25433h
            java.util.Objects.requireNonNull(r14)
            byte[] r15 = r10.f25442e
            int r10 = r10.f25440c
            byte[] r10 = java.util.Arrays.copyOf(r15, r10)
            m4.b0 r15 = new m4.b0
            r18 = r7
            r7 = 0
            r15.<init>(r10, r12, r7)
            r15.m9776u(r13)
            r7 = 4
            r15.m9776u(r7)
            r15.m9774s()
            r13 = 8
            r15.m9775t(r13)
            boolean r16 = r15.m9765j()
            if (r16 == 0) goto Lf7
            r15.m9775t(r7)
            r12 = 3
            r15.m9775t(r12)
        Lf7:
            int r7 = r15.m9766k(r7)
            r12 = 15
            if (r7 != r12) goto L10f
            int r7 = r15.m9766k(r13)
            int r13 = r15.m9766k(r13)
            if (r13 != 0) goto L10a
            goto L117
        L10a:
            float r7 = (float) r7
            float r13 = (float) r13
            float r7 = r7 / r13
            r12 = r7
            goto L11e
        L10f:
            float[] r13 = p370v4.C6534l.f25425l
            int r12 = r13.length
            if (r7 >= r12) goto L117
            r12 = r13[r7]
            goto L11e
        L117:
            java.lang.String r7 = "Invalid aspect ratio"
            android.util.Log.w(r11, r7)
            r12 = 1065353216(0x3f800000, float:1.0)
        L11e:
            boolean r7 = r15.m9765j()
            if (r7 == 0) goto L158
            r7 = 2
            r15.m9775t(r7)
            r7 = 1
            r15.m9775t(r7)
            boolean r7 = r15.m9765j()
            if (r7 == 0) goto L158
            r7 = 15
            r15.m9775t(r7)
            r15.m9774s()
            r15.m9775t(r7)
            r15.m9774s()
            r15.m9775t(r7)
            r15.m9774s()
            r13 = 3
            r15.m9775t(r13)
            r13 = 11
            r15.m9775t(r13)
            r15.m9774s()
            r15.m9775t(r7)
            r15.m9774s()
        L158:
            r7 = 2
            int r7 = r15.m9766k(r7)
            if (r7 == 0) goto L164
            java.lang.String r7 = "Unhandled video object layer shape"
            android.util.Log.w(r11, r7)
        L164:
            r15.m9774s()
            r7 = 16
            int r7 = r15.m9766k(r7)
            r15.m9774s()
            boolean r13 = r15.m9765j()
            if (r13 == 0) goto L18b
            if (r7 != 0) goto L17e
            java.lang.String r7 = "Invalid vop_increment_time_resolution"
            android.util.Log.w(r11, r7)
            goto L18b
        L17e:
            int r7 = r7 + (-1)
            r11 = 0
        L181:
            if (r7 <= 0) goto L188
            int r11 = r11 + 1
            int r7 = r7 >> 1
            goto L181
        L188:
            r15.m9775t(r11)
        L18b:
            r15.m9774s()
            r7 = 13
            int r11 = r15.m9766k(r7)
            r15.m9774s()
            int r7 = r15.m9766k(r7)
            r15.m9774s()
            r15.m9774s()
            f4.e0$b r13 = new f4.e0$b
            r13.<init>()
            r13.f8917a = r14
            java.lang.String r14 = "video/mp4v-es"
            r13.f8927k = r14
            r13.f8932p = r11
            r13.f8933q = r7
            r13.f8936t = r12
            java.util.List r7 = java.util.Collections.singletonList(r10)
            r13.f8929m = r7
            f4.e0 r7 = r13.m5193a()
            r9.mo5973e(r7)
            r7 = 1
            r0.f25435j = r7
            goto L1c5
        L1c3:
            r18 = r7
        L1c5:
            v4.l$b r7 = r0.f25431f
            r7.m13270a(r4, r2, r5)
            v4.r r7 = r0.f25430e
            if (r7 == 0) goto L20f
            if (r8 <= 0) goto L1d5
            r7.m13276a(r4, r2, r5)
            r2 = 0
            goto L1d6
        L1d5:
            int r2 = -r8
        L1d6:
            v4.r r7 = r0.f25430e
            boolean r2 = r7.m13277b(r2)
            if (r2 == 0) goto L1fc
            v4.r r2 = r0.f25430e
            byte[] r7 = r2.f25569d
            int r2 = r2.f25570e
            int r2 = p371v5.C6568r.m13387f(r7, r2)
            v5.u r7 = r0.f25427b
            int r8 = p371v5.C6552b0.f25624a
            v4.r r8 = r0.f25430e
            byte[] r8 = r8.f25569d
            r7.m13394D(r8, r2)
            v4.e0 r2 = r0.f25426a
            long r7 = r0.f25436k
            v5.u r9 = r0.f25427b
            r2.m13257a(r7, r9)
        L1fc:
            r2 = 178(0xb2, float:2.5E-43)
            if (r6 != r2) goto L20f
            byte[] r2 = r1.f25710a
            int r7 = r5 + 2
            r2 = r2[r7]
            r7 = 1
            if (r2 != r7) goto L210
            v4.r r2 = r0.f25430e
            r2.m13279d(r6)
            goto L210
        L20f:
            r7 = 1
        L210:
            int r13 = r3 - r5
            long r8 = r0.f25432g
            long r10 = (long) r13
            long r14 = r8 - r10
            v4.l$b r2 = r0.f25431f
            boolean r5 = r0.f25435j
            int r8 = r2.f25447e
            r12 = 182(0xb6, float:2.55E-43)
            if (r8 != r12) goto L246
            if (r5 == 0) goto L246
            boolean r5 = r2.f25444b
            if (r5 == 0) goto L246
            long r9 = r2.f25450h
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r5 == 0) goto L246
            long r7 = r2.f25449g
            long r7 = r14 - r7
            int r5 = (int) r7
            boolean r11 = r2.f25446d
            m4.z r8 = r2.f25443a
            r7 = 0
            r12 = r5
            r5 = r3
            r17 = r4
            r3 = r14
            r14 = r7
            r8.mo5971c(r9, r11, r12, r13, r14)
            goto L24a
        L246:
            r5 = r3
            r17 = r4
            r3 = r14
        L24a:
            int r7 = r2.f25447e
            r8 = 179(0xb3, float:2.51E-43)
            if (r7 == r8) goto L252
            r2.f25449g = r3
        L252:
            v4.l$b r2 = r0.f25431f
            long r3 = r0.f25436k
            r2.f25447e = r6
            r7 = 0
            r2.f25446d = r7
            r7 = 182(0xb6, float:2.55E-43)
            if (r6 == r7) goto L266
            r8 = 179(0xb3, float:2.51E-43)
            if (r6 != r8) goto L264
            goto L266
        L264:
            r9 = 0
            goto L267
        L266:
            r9 = 1
        L267:
            r2.f25444b = r9
            if (r6 != r7) goto L26d
            r12 = 1
            goto L26e
        L26d:
            r12 = 0
        L26e:
            r2.f25445c = r12
            r6 = 0
            r2.f25448f = r6
            r2.f25450h = r3
            r3 = r5
            r4 = r17
            r2 = r18
            goto L27
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: d */
    public void mo13243d(p216m4.InterfaceC4366k r3, p370v4.InterfaceC6525d0.d r4) {
            r2 = this;
            r4.m13253a()
            java.lang.String r0 = r4.m13254b()
            r2.f25433h = r0
            int r0 = r4.m13255c()
            r1 = 2
            m4.z r0 = r3.mo6048l(r0, r1)
            r2.f25434i = r0
            v4.l$b r1 = new v4.l$b
            r1.<init>(r0)
            r2.f25431f = r1
            v4.e0 r0 = r2.f25426a
            if (r0 == 0) goto L22
            r0.m13258b(r3, r4)
        L22:
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
    public void mo13245f(long r3, int r5) {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto Lb
            r2.f25436k = r3
        Lb:
            return
    }
}
