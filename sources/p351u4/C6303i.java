package p351u4;

/* renamed from: u4.i */
/* loaded from: classes.dex */
public final class C6303i extends p351u4.AbstractC6302h {

    /* renamed from: n */
    public p351u4.C6303i.a f24610n;

    /* renamed from: o */
    public int f24611o;

    /* renamed from: p */
    public boolean f24612p;

    /* renamed from: q */
    public p216m4.C4359d0.c f24613q;

    /* renamed from: r */
    public p216m4.C4359d0.a f24614r;

    /* renamed from: u4.i$a */
    public static final class a {

        /* renamed from: a */
        public final p216m4.C4359d0.c f24615a;

        /* renamed from: b */
        public final byte[] f24616b;

        /* renamed from: c */
        public final p216m4.C4359d0.b[] f24617c;

        /* renamed from: d */
        public final int f24618d;

        public a(p216m4.C4359d0.c r1, p216m4.C4359d0.a r2, byte[] r3, p216m4.C4359d0.b[] r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.f24615a = r1
                r0.f24616b = r3
                r0.f24617c = r4
                r0.f24618d = r5
                return
        }
    }

    public C6303i() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p351u4.AbstractC6302h
    /* renamed from: b */
    public void mo12943b(long r5) {
            r4 = this;
            r4.f24601g = r5
            r0 = 0
            r2 = 0
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 == 0) goto Lb
            r5 = 1
            goto Lc
        Lb:
            r5 = 0
        Lc:
            r4.f24612p = r5
            m4.d0$c r5 = r4.f24613q
            if (r5 == 0) goto L14
            int r2 = r5.f17886e
        L14:
            r4.f24611o = r2
            return
    }

    @Override // p351u4.AbstractC6302h
    /* renamed from: c */
    public long mo12933c(p371v5.C6571u r12) {
            r11 = this;
            byte[] r0 = r12.f25710a
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto Lc
            r0 = -1
            return r0
        Lc:
            r0 = r0[r1]
            u4.i$a r2 = r11.f24610n
            p371v5.C6549a.m13292f(r2)
            u4.i$a r2 = (p351u4.C6303i.a) r2
            int r4 = r2.f24618d
            int r0 = r0 >> r3
            r5 = 8
            int r4 = 8 - r4
            r6 = 255(0xff, float:3.57E-43)
            int r4 = r6 >>> r4
            r0 = r0 & r4
            m4.d0$b[] r4 = r2.f24617c
            r0 = r4[r0]
            boolean r0 = r0.f17881a
            if (r0 != 0) goto L2e
            m4.d0$c r0 = r2.f24615a
            int r0 = r0.f17886e
            goto L32
        L2e:
            m4.d0$c r0 = r2.f24615a
            int r0 = r0.f17887f
        L32:
            boolean r2 = r11.f24612p
            if (r2 == 0) goto L3b
            int r1 = r11.f24611o
            int r1 = r1 + r0
            int r1 = r1 / 4
        L3b:
            long r1 = (long) r1
            byte[] r4 = r12.f25710a
            int r6 = r4.length
            int r7 = r12.f25712c
            int r7 = r7 + 4
            if (r6 >= r7) goto L4d
            byte[] r4 = java.util.Arrays.copyOf(r4, r7)
            r12.m13393C(r4)
            goto L50
        L4d:
            r12.m13395E(r7)
        L50:
            byte[] r4 = r12.f25710a
            int r12 = r12.f25712c
            int r6 = r12 + (-4)
            r7 = 255(0xff, double:1.26E-321)
            long r9 = r1 & r7
            int r10 = (int) r9
            byte r9 = (byte) r10
            r4[r6] = r9
            int r6 = r12 + (-3)
            long r9 = r1 >>> r5
            long r9 = r9 & r7
            int r5 = (int) r9
            byte r5 = (byte) r5
            r4[r6] = r5
            int r5 = r12 + (-2)
            r6 = 16
            long r9 = r1 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r4[r5] = r6
            int r12 = r12 + (-1)
            r5 = 24
            long r5 = r1 >>> r5
            long r5 = r5 & r7
            int r6 = (int) r5
            byte r5 = (byte) r6
            r4[r12] = r5
            r11.f24612p = r3
            r11.f24611o = r0
            return r1
    }

    @Override // p351u4.AbstractC6302h
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: d */
    public boolean mo12934d(p371v5.C6571u r19, long r20, p351u4.AbstractC6302h.b r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r22
            u4.i$a r3 = r0.f24610n
            r4 = 0
            if (r3 == 0) goto L11
            f4.e0 r1 = r2.f24608a
            java.util.Objects.requireNonNull(r1)
            return r4
        L11:
            m4.d0$c r6 = r0.f24613q
            r3 = 0
            r5 = 1
            if (r6 != 0) goto L7e
            p216m4.C4359d0.m9783c(r5, r1, r4)
            int r8 = r19.m13409l()
            int r9 = r19.m13418u()
            int r10 = r19.m13409l()
            int r4 = r19.m13405h()
            if (r4 > 0) goto L2f
            r4 = -1
            r11 = -1
            goto L30
        L2f:
            r11 = r4
        L30:
            int r4 = r19.m13405h()
            if (r4 > 0) goto L39
            r4 = -1
            r12 = -1
            goto L3a
        L39:
            r12 = r4
        L3a:
            int r4 = r19.m13405h()
            if (r4 > 0) goto L43
            r4 = -1
            r13 = -1
            goto L44
        L43:
            r13 = r4
        L44:
            int r4 = r19.m13418u()
            r5 = r4 & 15
            double r5 = (double) r5
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = java.lang.Math.pow(r14, r5)
            int r5 = (int) r5
            r4 = r4 & 240(0xf0, float:3.36E-43)
            int r4 = r4 >> 4
            double r6 = (double) r4
            double r6 = java.lang.Math.pow(r14, r6)
            int r15 = (int) r6
            int r4 = r19.m13418u()
            r4 = r4 & 1
            if (r4 <= 0) goto L68
            r4 = 1
            r16 = 1
            goto L6b
        L68:
            r4 = 0
            r16 = 0
        L6b:
            byte[] r4 = r1.f25710a
            int r1 = r1.f25712c
            byte[] r17 = java.util.Arrays.copyOf(r4, r1)
            m4.d0$c r1 = new m4.d0$c
            r7 = r1
            r14 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.f24613q = r1
            goto L3b3
        L7e:
            m4.d0$a r7 = r0.f24614r
            if (r7 != 0) goto L8b
            r4 = 1
            m4.d0$a r1 = p216m4.C4359d0.m9782b(r1, r4, r4)
            r0.f24614r = r1
            goto L3b3
        L8b:
            int r5 = r1.f25712c
            byte[] r8 = new byte[r5]
            byte[] r9 = r1.f25710a
            java.lang.System.arraycopy(r9, r4, r8, r4, r5)
            int r5 = r6.f17882a
            r9 = 5
            p216m4.C4359d0.m9783c(r9, r1, r4)
            int r10 = r19.m13418u()
            int r10 = r10 + 1
            m4.b0 r11 = new m4.b0
            byte[] r12 = r1.f25710a
            r11.<init>(r12, r4, r3)
            int r1 = r1.f25711b
            int r1 = r1 * 8
            r11.m9775t(r1)
            r1 = 0
        Laf:
            r3 = 16
            r4 = 24
            if (r1 >= r10) goto L1a2
            int r12 = r11.m9766k(r4)
            r13 = 5653314(0x564342, float:7.92198E-39)
            if (r12 != r13) goto L194
            int r3 = r11.m9766k(r3)
            int r4 = r11.m9766k(r4)
            long[] r12 = new long[r4]
            boolean r13 = r11.m9765j()
            if (r13 != 0) goto L10b
            boolean r13 = r11.m9765j()
            r16 = 0
            r14 = 0
        Ld5:
            if (r14 >= r4) goto L108
            if (r13 == 0) goto Lf4
            boolean r15 = r11.m9765j()
            if (r15 == 0) goto Led
            int r9 = r11.m9766k(r9)
            int r9 = r9 + 1
            r21 = r10
            long r9 = (long) r9
            r12[r14] = r9
            r9 = 0
            goto L102
        Led:
            r21 = r10
            r9 = 0
            r12[r14] = r9
            goto L102
        Lf4:
            r21 = r10
            r9 = 0
            r15 = 5
            int r15 = r11.m9766k(r15)
            int r15 = r15 + 1
            long r9 = (long) r15
            r12[r14] = r9
        L102:
            int r14 = r14 + 1
            r9 = 5
            r10 = r21
            goto Ld5
        L108:
            r21 = r10
            goto L13d
        L10b:
            r21 = r10
            r9 = 5
            int r9 = r11.m9766k(r9)
            int r9 = r9 + 1
            r10 = 0
        L115:
            if (r10 >= r4) goto L13d
            int r13 = r4 - r10
            int r13 = p216m4.C4359d0.m9781a(r13)
            int r13 = r11.m9766k(r13)
            r14 = 0
        L122:
            if (r14 >= r13) goto L134
            if (r10 >= r4) goto L134
            r15 = r7
            r16 = r8
            long r7 = (long) r9
            r12[r10] = r7
            int r10 = r10 + 1
            int r14 = r14 + 1
            r7 = r15
            r8 = r16
            goto L122
        L134:
            r15 = r7
            r16 = r8
            int r9 = r9 + 1
            r7 = r15
            r8 = r16
            goto L115
        L13d:
            r15 = r7
            r16 = r8
            r7 = 4
            int r8 = r11.m9766k(r7)
            r9 = 2
            if (r8 > r9) goto L18a
            r10 = 1
            if (r8 == r10) goto L14d
            if (r8 != r9) goto L180
        L14d:
            r9 = 32
            r11.m9775t(r9)
            r11.m9775t(r9)
            int r7 = r11.m9766k(r7)
            int r7 = r7 + r10
            r11.m9775t(r10)
            if (r8 != r10) goto L175
            if (r3 == 0) goto L172
            long r8 = (long) r4
            long r3 = (long) r3
            double r8 = (double) r8
            double r3 = (double) r3
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 / r3
            double r3 = java.lang.Math.pow(r8, r12)
            double r3 = java.lang.Math.floor(r3)
            long r3 = (long) r3
            goto L179
        L172:
            r3 = 0
            goto L179
        L175:
            long r8 = (long) r4
            long r3 = (long) r3
            long r3 = r3 * r8
        L179:
            long r7 = (long) r7
            long r7 = r7 * r3
            int r3 = (int) r7
            r11.m9775t(r3)
        L180:
            int r1 = r1 + 1
            r9 = 5
            r10 = r21
            r7 = r15
            r8 = r16
            goto Laf
        L18a:
            r1 = 53
            java.lang.String r2 = "lookup type greater than 2 not decodable: "
            r3 = 0
            f4.s0 r1 = p216m4.C4357c0.m9780a(r1, r2, r8, r3)
            throw r1
        L194:
            r1 = 0
            int r2 = r11.m9763h()
            r3 = 66
            java.lang.String r4 = "expected code book to start with [0x56, 0x43, 0x42] at "
            f4.s0 r1 = p216m4.C4357c0.m9780a(r3, r4, r2, r1)
            throw r1
        L1a2:
            r15 = r7
            r16 = r8
            r1 = 6
            int r4 = r11.m9766k(r1)
            int r4 = r4 + 1
            r7 = 0
        L1ad:
            if (r7 >= r4) goto L1c0
            int r8 = r11.m9766k(r3)
            if (r8 != 0) goto L1b8
            int r7 = r7 + 1
            goto L1ad
        L1b8:
            java.lang.String r1 = "placeholder of time domain transforms not zeroed out"
            r2 = 0
            f4.s0 r1 = p088f4.C2044s0.m5407a(r1, r2)
            throw r1
        L1c0:
            int r4 = r11.m9766k(r1)
            r7 = 1
            int r4 = r4 + r7
            r8 = 0
        L1c7:
            r9 = 52
            r10 = 3
            if (r8 >= r4) goto L27c
            int r1 = r11.m9766k(r3)
            if (r1 == 0) goto L24a
            if (r1 != r7) goto L242
            r1 = 5
            int r1 = r11.m9766k(r1)
            int[] r3 = new int[r1]
            r7 = 0
            r9 = -1
        L1dd:
            if (r7 >= r1) goto L1ef
            r12 = 4
            int r12 = r11.m9766k(r12)
            r3[r7] = r12
            r12 = r3[r7]
            if (r12 <= r9) goto L1ec
            r9 = r3[r7]
        L1ec:
            int r7 = r7 + 1
            goto L1dd
        L1ef:
            int r9 = r9 + 1
            int[] r7 = new int[r9]
            r12 = 0
        L1f4:
            if (r12 >= r9) goto L222
            int r10 = r11.m9766k(r10)
            r13 = 1
            int r10 = r10 + 1
            r7[r12] = r10
            r10 = 2
            int r10 = r11.m9766k(r10)
            r14 = 8
            if (r10 <= 0) goto L20b
            r11.m9775t(r14)
        L20b:
            r17 = 0
            r19 = r4
            r4 = 0
        L210:
            int r13 = r13 << r10
            if (r4 >= r13) goto L21c
            r11.m9775t(r14)
            int r4 = r4 + 1
            r14 = 8
            r13 = 1
            goto L210
        L21c:
            int r12 = r12 + 1
            r10 = 3
            r4 = r19
            goto L1f4
        L222:
            r19 = r4
            r4 = 2
            r11.m9775t(r4)
            r4 = 4
            int r4 = r11.m9766k(r4)
            r9 = 0
            r10 = 0
            r12 = 0
        L230:
            if (r9 >= r1) goto L272
            r13 = r3[r9]
            r13 = r7[r13]
            int r10 = r10 + r13
        L237:
            if (r12 >= r10) goto L23f
            r11.m9775t(r4)
            int r12 = r12 + 1
            goto L237
        L23f:
            int r9 = r9 + 1
            goto L230
        L242:
            java.lang.String r2 = "floor type greater than 1 not decodable: "
            r3 = 0
            f4.s0 r1 = p216m4.C4357c0.m9780a(r9, r2, r1, r3)
            throw r1
        L24a:
            r19 = r4
            r1 = 8
            r11.m9775t(r1)
            r3 = 16
            r11.m9775t(r3)
            r11.m9775t(r3)
            r3 = 6
            r11.m9775t(r3)
            r11.m9775t(r1)
            r3 = 4
            int r3 = r11.m9766k(r3)
            int r3 = r3 + 1
            r4 = 0
        L268:
            if (r4 >= r3) goto L272
            r11.m9775t(r1)
            int r4 = r4 + 1
            r1 = 8
            goto L268
        L272:
            int r8 = r8 + 1
            r1 = 6
            r7 = 1
            r3 = 16
            r4 = r19
            goto L1c7
        L27c:
            int r3 = r11.m9766k(r1)
            r4 = 1
            int r3 = r3 + r4
            r7 = 0
        L283:
            if (r7 >= r3) goto L2e9
            r8 = 16
            int r8 = r11.m9766k(r8)
            r10 = 2
            if (r8 > r10) goto L2e1
            r8 = 24
            r11.m9775t(r8)
            r11.m9775t(r8)
            r11.m9775t(r8)
            int r1 = r11.m9766k(r1)
            int r1 = r1 + r4
            r4 = 8
            r11.m9775t(r4)
            int[] r8 = new int[r1]
            r10 = 0
        L2a6:
            if (r10 >= r1) goto L2c2
            r12 = 3
            int r12 = r11.m9766k(r12)
            boolean r13 = r11.m9765j()
            r14 = 5
            if (r13 == 0) goto L2b9
            int r13 = r11.m9766k(r14)
            goto L2ba
        L2b9:
            r13 = 0
        L2ba:
            int r13 = r13 * 8
            int r13 = r13 + r12
            r8[r10] = r13
            int r10 = r10 + 1
            goto L2a6
        L2c2:
            r10 = 0
        L2c3:
            if (r10 >= r1) goto L2dc
            r12 = 0
        L2c6:
            if (r12 >= r4) goto L2d7
            r13 = r8[r10]
            r14 = 1
            int r14 = r14 << r12
            r13 = r13 & r14
            if (r13 == 0) goto L2d2
            r11.m9775t(r4)
        L2d2:
            int r12 = r12 + 1
            r4 = 8
            goto L2c6
        L2d7:
            int r10 = r10 + 1
            r4 = 8
            goto L2c3
        L2dc:
            int r7 = r7 + 1
            r1 = 6
            r4 = 1
            goto L283
        L2e1:
            java.lang.String r1 = "residueType greater than 2 is not decodable"
            r2 = 0
            f4.s0 r1 = p088f4.C2044s0.m5407a(r1, r2)
            throw r1
        L2e9:
            int r1 = r11.m9766k(r1)
            int r1 = r1 + 1
            r3 = 0
        L2f0:
            if (r3 >= r1) goto L374
            r4 = 16
            int r4 = r11.m9766k(r4)
            if (r4 == 0) goto L311
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r9)
            java.lang.String r8 = "mapping type other than 0 not supported: "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.String r7 = "VorbisUtil"
            android.util.Log.e(r7, r4)
            goto L369
        L311:
            boolean r4 = r11.m9765j()
            if (r4 == 0) goto L31f
            r4 = 4
            int r4 = r11.m9766k(r4)
            r7 = 1
            int r4 = r4 + r7
            goto L321
        L31f:
            r7 = 1
            r4 = 1
        L321:
            boolean r8 = r11.m9765j()
            if (r8 == 0) goto L344
            r8 = 8
            int r8 = r11.m9766k(r8)
            int r8 = r8 + r7
            r7 = 0
        L32f:
            if (r7 >= r8) goto L344
            int r10 = r5 + (-1)
            int r12 = p216m4.C4359d0.m9781a(r10)
            r11.m9775t(r12)
            int r10 = p216m4.C4359d0.m9781a(r10)
            r11.m9775t(r10)
            int r7 = r7 + 1
            goto L32f
        L344:
            r7 = 2
            int r7 = r11.m9766k(r7)
            if (r7 != 0) goto L36c
            r7 = 1
            if (r4 <= r7) goto L358
            r7 = 0
        L34f:
            if (r7 >= r5) goto L358
            r8 = 4
            r11.m9775t(r8)
            int r7 = r7 + 1
            goto L34f
        L358:
            r7 = 0
        L359:
            if (r7 >= r4) goto L369
            r8 = 8
            r11.m9775t(r8)
            r11.m9775t(r8)
            r11.m9775t(r8)
            int r7 = r7 + 1
            goto L359
        L369:
            int r3 = r3 + 1
            goto L2f0
        L36c:
            java.lang.String r1 = "to reserved bits must be zero after mapping coupling steps"
            r2 = 0
            f4.s0 r1 = p088f4.C2044s0.m5407a(r1, r2)
            throw r1
        L374:
            r1 = 6
            int r1 = r11.m9766k(r1)
            int r1 = r1 + 1
            m4.d0$b[] r9 = new p216m4.C4359d0.b[r1]
            r3 = 0
        L37e:
            if (r3 >= r1) goto L39e
            boolean r4 = r11.m9765j()
            r5 = 16
            int r7 = r11.m9766k(r5)
            int r5 = r11.m9766k(r5)
            r8 = 8
            int r8 = r11.m9766k(r8)
            m4.d0$b r10 = new m4.d0$b
            r10.<init>(r4, r7, r5, r8)
            r9[r3] = r10
            int r3 = r3 + 1
            goto L37e
        L39e:
            boolean r3 = r11.m9765j()
            if (r3 == 0) goto L3ed
            int r1 = r1 + (-1)
            int r10 = p216m4.C4359d0.m9781a(r1)
            u4.i$a r3 = new u4.i$a
            r5 = r3
            r7 = r15
            r8 = r16
            r5.<init>(r6, r7, r8, r9, r10)
        L3b3:
            r0.f24610n = r3
            if (r3 != 0) goto L3b9
            r1 = 1
            return r1
        L3b9:
            m4.d0$c r1 = r3.f24615a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            byte[] r5 = r1.f17888g
            r4.add(r5)
            byte[] r3 = r3.f24616b
            r4.add(r3)
            f4.e0$b r3 = new f4.e0$b
            r3.<init>()
            java.lang.String r5 = "audio/vorbis"
            r3.f8927k = r5
            int r5 = r1.f17885d
            r3.f8922f = r5
            int r5 = r1.f17884c
            r3.f8923g = r5
            int r5 = r1.f17882a
            r3.f8940x = r5
            int r1 = r1.f17883b
            r3.f8941y = r1
            r3.f8929m = r4
            f4.e0 r1 = r3.m5193a()
            r2.f24608a = r1
            r1 = 1
            return r1
        L3ed:
            java.lang.String r1 = "framing bit after modes not set as expected"
            r2 = 0
            f4.s0 r1 = p088f4.C2044s0.m5407a(r1, r2)
            throw r1
    }

    @Override // p351u4.AbstractC6302h
    /* renamed from: e */
    public void mo12935e(boolean r1) {
            r0 = this;
            super.mo12935e(r1)
            if (r1 == 0) goto Lc
            r1 = 0
            r0.f24610n = r1
            r0.f24613q = r1
            r0.f24614r = r1
        Lc:
            r1 = 0
            r0.f24611o = r1
            r0.f24612p = r1
            return
    }
}
