package p371v5;

/* renamed from: v5.r */
/* loaded from: classes.dex */
public final class C6568r {

    /* renamed from: a */
    public static final byte[] f25674a = null;

    /* renamed from: b */
    public static final float[] f25675b = null;

    /* renamed from: c */
    public static final java.lang.Object f25676c = null;

    /* renamed from: d */
    public static int[] f25677d;

    /* renamed from: v5.r$a */
    public static final class a {

        /* renamed from: a */
        public final int f25678a;

        /* renamed from: b */
        public final boolean f25679b;

        /* renamed from: c */
        public final int f25680c;

        /* renamed from: d */
        public final int f25681d;

        /* renamed from: e */
        public final int[] f25682e;

        /* renamed from: f */
        public final int f25683f;

        /* renamed from: g */
        public final int f25684g;

        /* renamed from: h */
        public final int f25685h;

        /* renamed from: i */
        public final float f25686i;

        public a(int r1, boolean r2, int r3, int r4, int[] r5, int r6, int r7, int r8, int r9, float r10) {
                r0 = this;
                r0.<init>()
                r0.f25678a = r1
                r0.f25679b = r2
                r0.f25680c = r3
                r0.f25681d = r4
                r0.f25682e = r5
                r0.f25683f = r6
                r0.f25684g = r8
                r0.f25685h = r9
                r0.f25686i = r10
                return
        }
    }

    /* renamed from: v5.r$b */
    public static final class b {

        /* renamed from: a */
        public final int f25687a;

        /* renamed from: b */
        public final int f25688b;

        /* renamed from: c */
        public final boolean f25689c;

        public b(int r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.f25687a = r1
                r0.f25688b = r2
                r0.f25689c = r3
                return
        }
    }

    /* renamed from: v5.r$c */
    public static final class c {

        /* renamed from: a */
        public final int f25690a;

        /* renamed from: b */
        public final int f25691b;

        /* renamed from: c */
        public final int f25692c;

        /* renamed from: d */
        public final int f25693d;

        /* renamed from: e */
        public final int f25694e;

        /* renamed from: f */
        public final int f25695f;

        /* renamed from: g */
        public final float f25696g;

        /* renamed from: h */
        public final boolean f25697h;

        /* renamed from: i */
        public final boolean f25698i;

        /* renamed from: j */
        public final int f25699j;

        /* renamed from: k */
        public final int f25700k;

        /* renamed from: l */
        public final int f25701l;

        /* renamed from: m */
        public final boolean f25702m;

        public c(int r1, int r2, int r3, int r4, int r5, int r6, float r7, boolean r8, boolean r9, int r10, int r11, int r12, boolean r13) {
                r0 = this;
                r0.<init>()
                r0.f25690a = r1
                r0.f25691b = r2
                r0.f25692c = r3
                r0.f25693d = r4
                r0.f25694e = r5
                r0.f25695f = r6
                r0.f25696g = r7
                r0.f25697h = r8
                r0.f25698i = r9
                r0.f25699j = r10
                r0.f25700k = r11
                r0.f25701l = r12
                r0.f25702m = r13
                return
        }
    }

    static {
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [0, 0, 0, 1} // fill-array
            p371v5.C6568r.f25674a = r0
            r0 = 17
            float[] r0 = new float[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [1065353216, 1065353216, 1066115817, 1063828015, 1069166220, 1067132618, 1074504425, 1072216623, 1077554828, 1075521226, 1070691421, 1068403619, 1073233424, 1070521954, 1068149419, 1069547520, 1073741824} // fill-array
            p371v5.C6568r.f25675b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p371v5.C6568r.f25676c = r0
            r0 = 10
            int[] r0 = new int[r0]
            p371v5.C6568r.f25677d = r0
            return
    }

    /* renamed from: a */
    public static void m13382a(boolean[] r2) {
            r0 = 0
            r2[r0] = r0
            r1 = 1
            r2[r1] = r0
            r1 = 2
            r2[r1] = r0
            return
    }

    /* renamed from: b */
    public static int m13383b(byte[] r7, int r8, int r9, boolean[] r10) {
            int r0 = r9 - r8
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            p371v5.C6549a.m13291e(r3)
            if (r0 != 0) goto Lf
            return r9
        Lf:
            boolean r3 = r10[r1]
            r4 = 2
            if (r3 == 0) goto L1d
            r10[r1] = r1
            r10[r2] = r1
            r10[r4] = r1
            int r8 = r8 + (-3)
            return r8
        L1d:
            if (r0 <= r2) goto L2f
            boolean r3 = r10[r2]
            if (r3 == 0) goto L2f
            r3 = r7[r8]
            if (r3 != r2) goto L2f
            r10[r1] = r1
            r10[r2] = r1
            r10[r4] = r1
            int r8 = r8 - r4
            return r8
        L2f:
            if (r0 <= r4) goto L47
            boolean r3 = r10[r4]
            if (r3 == 0) goto L47
            r3 = r7[r8]
            if (r3 != 0) goto L47
            int r3 = r8 + 1
            r3 = r7[r3]
            if (r3 != r2) goto L47
            r10[r1] = r1
            r10[r2] = r1
            r10[r4] = r1
            int r8 = r8 - r2
            return r8
        L47:
            int r3 = r9 + (-1)
            int r8 = r8 + r4
        L4a:
            if (r8 >= r3) goto L6f
            r5 = r7[r8]
            r5 = r5 & 254(0xfe, float:3.56E-43)
            if (r5 == 0) goto L53
            goto L6c
        L53:
            int r5 = r8 + (-2)
            r6 = r7[r5]
            if (r6 != 0) goto L6a
            int r6 = r8 + (-1)
            r6 = r7[r6]
            if (r6 != 0) goto L6a
            r6 = r7[r8]
            if (r6 != r2) goto L6a
            r10[r1] = r1
            r10[r2] = r1
            r10[r4] = r1
            return r5
        L6a:
            int r8 = r8 + (-2)
        L6c:
            int r8 = r8 + 3
            goto L4a
        L6f:
            if (r0 <= r4) goto L84
            int r8 = r9 + (-3)
            r8 = r7[r8]
            if (r8 != 0) goto L82
            int r8 = r9 + (-2)
            r8 = r7[r8]
            if (r8 != 0) goto L82
            r8 = r7[r3]
            if (r8 != r2) goto L82
            goto L9d
        L82:
            r8 = 0
            goto L9e
        L84:
            if (r0 != r4) goto L95
            boolean r8 = r10[r4]
            if (r8 == 0) goto L82
            int r8 = r9 + (-2)
            r8 = r7[r8]
            if (r8 != 0) goto L82
            r8 = r7[r3]
            if (r8 != r2) goto L82
            goto L9d
        L95:
            boolean r8 = r10[r2]
            if (r8 == 0) goto L82
            r8 = r7[r3]
            if (r8 != r2) goto L82
        L9d:
            r8 = 1
        L9e:
            r10[r1] = r8
            if (r0 <= r2) goto Lad
            int r8 = r9 + (-2)
            r8 = r7[r8]
            if (r8 != 0) goto Lb7
            r8 = r7[r3]
            if (r8 != 0) goto Lb7
            goto Lb5
        Lad:
            boolean r8 = r10[r4]
            if (r8 == 0) goto Lb7
            r8 = r7[r3]
            if (r8 != 0) goto Lb7
        Lb5:
            r8 = 1
            goto Lb8
        Lb7:
            r8 = 0
        Lb8:
            r10[r2] = r8
            r7 = r7[r3]
            if (r7 != 0) goto Lbf
            r1 = 1
        Lbf:
            r10[r4] = r1
            return r9
    }

    /* renamed from: c */
    public static p371v5.C6568r.a m13384c(byte[] r22, int r23, int r24) {
            r0 = 2
            int r1 = r23 + 2
            m4.b0 r2 = new m4.b0
            r3 = r22
            r4 = r24
            r2.<init>(r3, r1, r4)
            r1 = 4
            r2.m9775t(r1)
            r3 = 3
            int r4 = r2.m9766k(r3)
            r2.m9774s()
            int r6 = r2.m9766k(r0)
            boolean r7 = r2.m9765j()
            r5 = 5
            int r8 = r2.m9766k(r5)
            r5 = 0
            r9 = 0
            r10 = 0
        L28:
            r5 = 32
            r11 = 1
            if (r9 >= r5) goto L39
            boolean r5 = r2.m9765j()
            if (r5 == 0) goto L36
            int r5 = r11 << r9
            r10 = r10 | r5
        L36:
            int r9 = r9 + 1
            goto L28
        L39:
            r5 = 6
            int[] r12 = new int[r5]
            r9 = 0
        L3d:
            r13 = 8
            int r13 = r2.m9766k(r13)
            if (r9 >= r5) goto L4a
            r12[r9] = r13
            int r9 = r9 + 1
            goto L3d
        L4a:
            r9 = 0
            r14 = 0
        L4c:
            if (r14 >= r4) goto L61
            boolean r15 = r2.m9765j()
            if (r15 == 0) goto L56
            int r9 = r9 + 89
        L56:
            boolean r15 = r2.m9765j()
            if (r15 == 0) goto L5e
            int r9 = r9 + 8
        L5e:
            int r14 = r14 + 1
            goto L4c
        L61:
            r2.m9775t(r9)
            if (r4 <= 0) goto L6d
            int r9 = 8 - r4
            int r9 = r9 * 2
            r2.m9775t(r9)
        L6d:
            int r14 = r2.m9769n()
            int r9 = r2.m9769n()
            if (r9 != r3) goto L7a
            r2.m9774s()
        L7a:
            int r15 = r2.m9769n()
            int r16 = r2.m9769n()
            boolean r17 = r2.m9765j()
            if (r17 == 0) goto Lb3
            int r17 = r2.m9769n()
            int r18 = r2.m9769n()
            int r19 = r2.m9769n()
            int r20 = r2.m9769n()
            if (r9 == r11) goto La0
            if (r9 != r0) goto L9d
            goto La0
        L9d:
            r21 = 1
            goto La2
        La0:
            r21 = 2
        La2:
            if (r9 != r11) goto La6
            r9 = 2
            goto La7
        La6:
            r9 = 1
        La7:
            int r17 = r17 + r18
            int r17 = r17 * r21
            int r15 = r15 - r17
            int r19 = r19 + r20
            int r19 = r19 * r9
            int r16 = r16 - r19
        Lb3:
            r2.m9769n()
            r2.m9769n()
            int r9 = r2.m9769n()
            boolean r17 = r2.m9765j()
            if (r17 == 0) goto Lc6
            r17 = 0
            goto Lc8
        Lc6:
            r17 = r4
        Lc8:
            r1 = r17
        Lca:
            if (r1 > r4) goto Ld8
            r2.m9769n()
            r2.m9769n()
            r2.m9769n()
            int r1 = r1 + 1
            goto Lca
        Ld8:
            r2.m9769n()
            r2.m9769n()
            r2.m9769n()
            r2.m9769n()
            r2.m9769n()
            r2.m9769n()
            boolean r1 = r2.m9765j()
            if (r1 == 0) goto L130
            boolean r1 = r2.m9765j()
            if (r1 == 0) goto L130
            r1 = 0
            r4 = 4
        Lf8:
            if (r1 >= r4) goto L130
            r4 = 0
        Lfb:
            if (r4 >= r5) goto L12a
            boolean r5 = r2.m9765j()
            if (r5 != 0) goto L107
            r2.m9769n()
            goto L121
        L107:
            r5 = 64
            int r17 = r1 << 1
            int r17 = r17 + 4
            int r0 = r11 << r17
            int r0 = java.lang.Math.min(r5, r0)
            if (r1 <= r11) goto L118
            r2.m9770o()
        L118:
            r5 = 0
        L119:
            if (r5 >= r0) goto L121
            r2.m9770o()
            int r5 = r5 + 1
            goto L119
        L121:
            if (r1 != r3) goto L125
            r0 = 3
            goto L126
        L125:
            r0 = 1
        L126:
            int r4 = r4 + r0
            r5 = 6
            r0 = 2
            goto Lfb
        L12a:
            int r1 = r1 + 1
            r4 = 4
            r5 = 6
            r0 = 2
            goto Lf8
        L130:
            r2.m9775t(r0)
            boolean r0 = r2.m9765j()
            if (r0 == 0) goto L147
            r0 = 8
            r2.m9775t(r0)
            r2.m9769n()
            r2.m9769n()
            r2.m9774s()
        L147:
            int r0 = r2.m9769n()
            r1 = 0
            r3 = 0
            r4 = 0
        L14e:
            if (r1 >= r0) goto L197
            if (r1 == 0) goto L156
            boolean r3 = r2.m9765j()
        L156:
            if (r3 == 0) goto L16d
            r2.m9774s()
            r2.m9769n()
            r5 = 0
        L15f:
            if (r5 > r4) goto L193
            boolean r17 = r2.m9765j()
            if (r17 == 0) goto L16a
            r2.m9774s()
        L16a:
            int r5 = r5 + 1
            goto L15f
        L16d:
            int r4 = r2.m9769n()
            int r5 = r2.m9769n()
            int r17 = r4 + r5
            r18 = 0
            r11 = 0
        L17a:
            if (r11 >= r4) goto L185
            r2.m9769n()
            r2.m9774s()
            int r11 = r11 + 1
            goto L17a
        L185:
            r4 = 0
        L186:
            if (r4 >= r5) goto L191
            r2.m9769n()
            r2.m9774s()
            int r4 = r4 + 1
            goto L186
        L191:
            r4 = r17
        L193:
            int r1 = r1 + 1
            r11 = 1
            goto L14e
        L197:
            boolean r0 = r2.m9765j()
            if (r0 == 0) goto L1ae
            r0 = 0
        L19e:
            int r1 = r2.m9769n()
            if (r0 >= r1) goto L1ae
            int r1 = r9 + 4
            r3 = 1
            int r1 = r1 + r3
            r2.m9775t(r1)
            int r0 = r0 + 1
            goto L19e
        L1ae:
            r0 = 2
            r2.m9775t(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            boolean r1 = r2.m9765j()
            if (r1 == 0) goto L222
            boolean r1 = r2.m9765j()
            if (r1 == 0) goto L1ed
            r1 = 8
            int r1 = r2.m9766k(r1)
            r3 = 255(0xff, float:3.57E-43)
            if (r1 != r3) goto L1dc
            r1 = 16
            int r3 = r2.m9766k(r1)
            int r1 = r2.m9766k(r1)
            if (r3 == 0) goto L1ed
            if (r1 == 0) goto L1ed
            float r0 = (float) r3
            float r1 = (float) r1
            float r0 = r0 / r1
            goto L1ed
        L1dc:
            float[] r3 = p371v5.C6568r.f25675b
            int r4 = r3.length
            if (r1 >= r4) goto L1e4
            r0 = r3[r1]
            goto L1ed
        L1e4:
            r3 = 46
            java.lang.String r4 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r5 = "NalUnitUtil"
            p088f4.C1999d.m5182a(r3, r4, r1, r5)
        L1ed:
            boolean r1 = r2.m9765j()
            if (r1 == 0) goto L1f6
            r2.m9774s()
        L1f6:
            boolean r1 = r2.m9765j()
            if (r1 == 0) goto L20b
            r1 = 4
            r2.m9775t(r1)
            boolean r1 = r2.m9765j()
            if (r1 == 0) goto L20b
            r1 = 24
            r2.m9775t(r1)
        L20b:
            boolean r1 = r2.m9765j()
            if (r1 == 0) goto L217
            r2.m9769n()
            r2.m9769n()
        L217:
            r2.m9774s()
            boolean r1 = r2.m9765j()
            if (r1 == 0) goto L222
            int r16 = r16 * 2
        L222:
            v5.r$a r1 = new v5.r$a
            r5 = r1
            r9 = r10
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r16
            r15 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r1
    }

    /* renamed from: d */
    public static p371v5.C6568r.b m13385d(byte[] r1, int r2, int r3) {
            int r2 = r2 + 1
            m4.b0 r0 = new m4.b0
            r0.<init>(r1, r2, r3)
            int r1 = r0.m9769n()
            int r2 = r0.m9769n()
            r0.m9774s()
            boolean r3 = r0.m9765j()
            v5.r$b r0 = new v5.r$b
            r0.<init>(r1, r2, r3)
            return r0
    }

    /* renamed from: e */
    public static p371v5.C6568r.c m13386e(byte[] r18, int r19, int r20) {
            r0 = 1
            int r1 = r19 + 1
            m4.b0 r2 = new m4.b0
            r3 = r18
            r4 = r20
            r2.<init>(r3, r1, r4)
            r1 = 8
            int r4 = r2.m9766k(r1)
            int r5 = r2.m9766k(r1)
            int r6 = r2.m9766k(r1)
            int r7 = r2.m9769n()
            r1 = 100
            r3 = 3
            if (r4 == r1) goto L4c
            r1 = 110(0x6e, float:1.54E-43)
            if (r4 == r1) goto L4c
            r1 = 122(0x7a, float:1.71E-43)
            if (r4 == r1) goto L4c
            r1 = 244(0xf4, float:3.42E-43)
            if (r4 == r1) goto L4c
            r1 = 44
            if (r4 == r1) goto L4c
            r1 = 83
            if (r4 == r1) goto L4c
            r1 = 86
            if (r4 == r1) goto L4c
            r1 = 118(0x76, float:1.65E-43)
            if (r4 == r1) goto L4c
            r1 = 128(0x80, float:1.8E-43)
            if (r4 == r1) goto L4c
            r1 = 138(0x8a, float:1.93E-43)
            if (r4 != r1) goto L48
            goto L4c
        L48:
            r1 = 1
            r3 = 0
            r11 = 0
            goto L9c
        L4c:
            int r1 = r2.m9769n()
            if (r1 != r3) goto L57
            boolean r8 = r2.m9765j()
            goto L58
        L57:
            r8 = 0
        L58:
            r2.m9769n()
            r2.m9769n()
            r2.m9774s()
            boolean r9 = r2.m9765j()
            if (r9 == 0) goto L9b
            if (r1 == r3) goto L6c
            r3 = 8
            goto L6e
        L6c:
            r3 = 12
        L6e:
            r9 = 0
        L6f:
            if (r9 >= r3) goto L9b
            boolean r10 = r2.m9765j()
            if (r10 == 0) goto L98
            r10 = 6
            if (r9 >= r10) goto L7d
            r10 = 16
            goto L7f
        L7d:
            r10 = 64
        L7f:
            r11 = 0
            r12 = 8
            r13 = 8
        L84:
            if (r11 >= r10) goto L98
            if (r12 == 0) goto L91
            int r12 = r2.m9770o()
            int r12 = r12 + r13
            int r12 = r12 + 256
            int r12 = r12 % 256
        L91:
            if (r12 != 0) goto L94
            goto L95
        L94:
            r13 = r12
        L95:
            int r11 = r11 + 1
            goto L84
        L98:
            int r9 = r9 + 1
            goto L6f
        L9b:
            r11 = r8
        L9c:
            int r3 = r2.m9769n()
            int r13 = r3 + 4
            int r14 = r2.m9769n()
            if (r14 != 0) goto Lb1
            int r0 = r2.m9769n()
            int r0 = r0 + 4
            r18 = r14
            goto Ld8
        Lb1:
            if (r14 != r0) goto Ld5
            boolean r0 = r2.m9765j()
            r2.m9770o()
            r2.m9770o()
            int r3 = r2.m9769n()
            long r8 = (long) r3
            r3 = 0
            r18 = r14
        Lc5:
            long r14 = (long) r3
            int r10 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r10 >= 0) goto Ld0
            r2.m9769n()
            int r3 = r3 + 1
            goto Lc5
        Ld0:
            r3 = 0
            r16 = r0
            r15 = 0
            goto Ldc
        Ld5:
            r18 = r14
            r0 = 0
        Ld8:
            r3 = 0
            r15 = r0
            r16 = 0
        Ldc:
            r2.m9769n()
            r2.m9774s()
            int r0 = r2.m9769n()
            int r0 = r0 + 1
            int r3 = r2.m9769n()
            int r3 = r3 + 1
            boolean r12 = r2.m9765j()
            int r8 = 2 - r12
            int r3 = r3 * r8
            if (r12 != 0) goto Lfb
            r2.m9774s()
        Lfb:
            r2.m9774s()
            int r0 = r0 * 16
            int r3 = r3 * 16
            boolean r9 = r2.m9765j()
            if (r9 == 0) goto L13c
            int r9 = r2.m9769n()
            int r10 = r2.m9769n()
            int r14 = r2.m9769n()
            int r17 = r2.m9769n()
            if (r1 != 0) goto L11e
            r1 = 1
            r19 = r15
            goto L132
        L11e:
            r19 = r15
            r15 = 3
            if (r1 != r15) goto L127
            r15 = 1
            r20 = 1
            goto L12a
        L127:
            r15 = 2
            r20 = 2
        L12a:
            r15 = 1
            if (r1 != r15) goto L12e
            r15 = 2
        L12e:
            int r8 = r8 * r15
            r1 = r20
        L132:
            int r9 = r9 + r10
            int r9 = r9 * r1
            int r0 = r0 - r9
            int r14 = r14 + r17
            int r14 = r14 * r8
            int r3 = r3 - r14
            goto L13e
        L13c:
            r19 = r15
        L13e:
            r8 = r0
            r9 = r3
            boolean r0 = r2.m9765j()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L17d
            boolean r0 = r2.m9765j()
            if (r0 == 0) goto L17d
            r0 = 8
            int r0 = r2.m9766k(r0)
            r3 = 255(0xff, float:3.57E-43)
            if (r0 != r3) goto L16b
            r0 = 16
            int r3 = r2.m9766k(r0)
            int r0 = r2.m9766k(r0)
            if (r3 == 0) goto L17d
            if (r0 == 0) goto L17d
            float r1 = (float) r3
            float r0 = (float) r0
            float r1 = r1 / r0
            r10 = r1
            goto L17f
        L16b:
            float[] r2 = p371v5.C6568r.f25675b
            int r3 = r2.length
            if (r0 >= r3) goto L174
            r0 = r2[r0]
            r10 = r0
            goto L17f
        L174:
            r2 = 46
            java.lang.String r3 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r10 = "NalUnitUtil"
            p088f4.C1999d.m5182a(r2, r3, r0, r10)
        L17d:
            r10 = 1065353216(0x3f800000, float:1.0)
        L17f:
            v5.r$c r0 = new v5.r$c
            r3 = r0
            r14 = r18
            r15 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
    }

    /* renamed from: f */
    public static int m13387f(byte[] r8, int r9) {
            java.lang.Object r0 = p371v5.C6568r.f25676c
            monitor-enter(r0)
            r1 = 0
            r2 = 0
            r3 = 0
        L6:
            if (r2 >= r9) goto L3c
        L8:
            int r4 = r9 + (-2)
            if (r2 >= r4) goto L21
            r4 = r8[r2]     // Catch: java.lang.Throwable -> L60
            if (r4 != 0) goto L1e
            int r4 = r2 + 1
            r4 = r8[r4]     // Catch: java.lang.Throwable -> L60
            if (r4 != 0) goto L1e
            int r4 = r2 + 2
            r4 = r8[r4]     // Catch: java.lang.Throwable -> L60
            r5 = 3
            if (r4 != r5) goto L1e
            goto L22
        L1e:
            int r2 = r2 + 1
            goto L8
        L21:
            r2 = r9
        L22:
            if (r2 >= r9) goto L6
            int[] r4 = p371v5.C6568r.f25677d     // Catch: java.lang.Throwable -> L60
            int r5 = r4.length     // Catch: java.lang.Throwable -> L60
            if (r5 > r3) goto L32
            int r5 = r4.length     // Catch: java.lang.Throwable -> L60
            int r5 = r5 * 2
            int[] r4 = java.util.Arrays.copyOf(r4, r5)     // Catch: java.lang.Throwable -> L60
            p371v5.C6568r.f25677d = r4     // Catch: java.lang.Throwable -> L60
        L32:
            int[] r4 = p371v5.C6568r.f25677d     // Catch: java.lang.Throwable -> L60
            int r5 = r3 + 1
            r4[r3] = r2     // Catch: java.lang.Throwable -> L60
            int r2 = r2 + 3
            r3 = r5
            goto L6
        L3c:
            int r9 = r9 - r3
            r2 = 0
            r4 = 0
            r5 = 0
        L40:
            if (r2 >= r3) goto L59
            int[] r6 = p371v5.C6568r.f25677d     // Catch: java.lang.Throwable -> L60
            r6 = r6[r2]     // Catch: java.lang.Throwable -> L60
            int r6 = r6 - r5
            java.lang.System.arraycopy(r8, r5, r8, r4, r6)     // Catch: java.lang.Throwable -> L60
            int r4 = r4 + r6
            int r7 = r4 + 1
            r8[r4] = r1     // Catch: java.lang.Throwable -> L60
            int r4 = r7 + 1
            r8[r7] = r1     // Catch: java.lang.Throwable -> L60
            int r6 = r6 + 3
            int r5 = r5 + r6
            int r2 = r2 + 1
            goto L40
        L59:
            int r1 = r9 - r4
            java.lang.System.arraycopy(r8, r5, r8, r4, r1)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            return r9
        L60:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            throw r8
    }
}
