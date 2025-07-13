package p370v4;

/* renamed from: v4.n */
/* loaded from: classes.dex */
public final class C6536n implements p370v4.InterfaceC6532j {

    /* renamed from: a */
    public final p370v4.C6548z f25500a;

    /* renamed from: b */
    public java.lang.String f25501b;

    /* renamed from: c */
    public p216m4.InterfaceC4381z f25502c;

    /* renamed from: d */
    public p370v4.C6536n.a f25503d;

    /* renamed from: e */
    public boolean f25504e;

    /* renamed from: f */
    public final boolean[] f25505f;

    /* renamed from: g */
    public final p370v4.C6540r f25506g;

    /* renamed from: h */
    public final p370v4.C6540r f25507h;

    /* renamed from: i */
    public final p370v4.C6540r f25508i;

    /* renamed from: j */
    public final p370v4.C6540r f25509j;

    /* renamed from: k */
    public final p370v4.C6540r f25510k;

    /* renamed from: l */
    public long f25511l;

    /* renamed from: m */
    public long f25512m;

    /* renamed from: n */
    public final p371v5.C6571u f25513n;

    /* renamed from: v4.n$a */
    public static final class a {

        /* renamed from: a */
        public final p216m4.InterfaceC4381z f25514a;

        /* renamed from: b */
        public long f25515b;

        /* renamed from: c */
        public boolean f25516c;

        /* renamed from: d */
        public int f25517d;

        /* renamed from: e */
        public long f25518e;

        /* renamed from: f */
        public boolean f25519f;

        /* renamed from: g */
        public boolean f25520g;

        /* renamed from: h */
        public boolean f25521h;

        /* renamed from: i */
        public boolean f25522i;

        /* renamed from: j */
        public boolean f25523j;

        /* renamed from: k */
        public long f25524k;

        /* renamed from: l */
        public long f25525l;

        /* renamed from: m */
        public boolean f25526m;

        public a(p216m4.InterfaceC4381z r1) {
                r0 = this;
                r0.<init>()
                r0.f25514a = r1
                return
        }

        /* renamed from: a */
        public final void m13273a(int r9) {
                r8 = this;
                long r1 = r8.f25525l
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r0 != 0) goto Lc
                return
            Lc:
                boolean r3 = r8.f25526m
                long r4 = r8.f25515b
                long r6 = r8.f25524k
                long r4 = r4 - r6
                int r4 = (int) r4
                m4.z r0 = r8.f25514a
                r6 = 0
                r5 = r9
                r0.mo5971c(r1, r3, r4, r5, r6)
                return
        }
    }

    public C6536n(p370v4.C6548z r3) {
            r2 = this;
            r2.<init>()
            r2.f25500a = r3
            r3 = 3
            boolean[] r3 = new boolean[r3]
            r2.f25505f = r3
            v4.r r3 = new v4.r
            r0 = 32
            r1 = 128(0x80, float:1.8E-43)
            r3.<init>(r0, r1)
            r2.f25506g = r3
            v4.r r3 = new v4.r
            r0 = 33
            r3.<init>(r0, r1)
            r2.f25507h = r3
            v4.r r3 = new v4.r
            r0 = 34
            r3.<init>(r0, r1)
            r2.f25508i = r3
            v4.r r3 = new v4.r
            r0 = 39
            r3.<init>(r0, r1)
            r2.f25509j = r3
            v4.r r3 = new v4.r
            r0 = 40
            r3.<init>(r0, r1)
            r2.f25510k = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f25512m = r0
            v5.u r3 = new v5.u
            r3.<init>()
            r2.f25513n = r3
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: a */
    public void mo13241a() {
            r2 = this;
            r0 = 0
            r2.f25511l = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f25512m = r0
            boolean[] r0 = r2.f25505f
            p371v5.C6568r.m13382a(r0)
            v4.r r0 = r2.f25506g
            r0.m13278c()
            v4.r r0 = r2.f25507h
            r0.m13278c()
            v4.r r0 = r2.f25508i
            r0.m13278c()
            v4.r r0 = r2.f25509j
            r0.m13278c()
            v4.r r0 = r2.f25510k
            r0.m13278c()
            v4.n$a r0 = r2.f25503d
            if (r0 == 0) goto L38
            r1 = 0
            r0.f25519f = r1
            r0.f25520g = r1
            r0.f25521h = r1
            r0.f25522i = r1
            r0.f25523j = r1
        L38:
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleReader"})
    /* renamed from: b */
    public final void m13272b(byte[] r4, int r5, int r6) {
            r3 = this;
            v4.n$a r0 = r3.f25503d
            boolean r1 = r0.f25519f
            if (r1 == 0) goto L21
            int r1 = r5 + 2
            int r2 = r0.f25517d
            int r1 = r1 - r2
            if (r1 >= r6) goto L1c
            r1 = r4[r1]
            r1 = r1 & 128(0x80, float:1.8E-43)
            r2 = 0
            if (r1 == 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            r0.f25520g = r1
            r0.f25519f = r2
            goto L21
        L1c:
            int r1 = r6 - r5
            int r1 = r1 + r2
            r0.f25517d = r1
        L21:
            boolean r0 = r3.f25504e
            if (r0 != 0) goto L34
            v4.r r0 = r3.f25506g
            r0.m13276a(r4, r5, r6)
            v4.r r0 = r3.f25507h
            r0.m13276a(r4, r5, r6)
            v4.r r0 = r3.f25508i
            r0.m13276a(r4, r5, r6)
        L34:
            v4.r r0 = r3.f25509j
            r0.m13276a(r4, r5, r6)
            v4.r r0 = r3.f25510k
            r0.m13276a(r4, r5, r6)
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: c */
    public void mo13242c(p371v5.C6571u r33) {
            r32 = this;
            r0 = r32
            r1 = r33
            m4.z r2 = r0.f25502c
            p371v5.C6549a.m13292f(r2)
            int r2 = p371v5.C6552b0.f25624a
        Lb:
            int r2 = r33.m13398a()
            if (r2 <= 0) goto L440
            int r2 = r1.f25711b
            int r3 = r1.f25712c
            byte[] r4 = r1.f25710a
            long r5 = r0.f25511l
            int r7 = r33.m13398a()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f25511l = r5
            m4.z r5 = r0.f25502c
            int r6 = r33.m13398a()
            r5.mo5972d(r1, r6)
        L2a:
            if (r2 >= r3) goto L43c
            boolean[] r5 = r0.f25505f
            int r5 = p371v5.C6568r.m13383b(r4, r2, r3, r5)
            if (r5 != r3) goto L38
            r0.m13272b(r4, r2, r3)
            return
        L38:
            int r6 = r5 + 3
            r7 = r4[r6]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            int r7 = r7 >> 1
            int r8 = r5 - r2
            if (r8 <= 0) goto L47
            r0.m13272b(r4, r2, r5)
        L47:
            int r2 = r3 - r5
            long r9 = r0.f25511l
            long r11 = (long) r2
            long r9 = r9 - r11
            r5 = 0
            if (r8 >= 0) goto L52
            int r8 = -r8
            goto L53
        L52:
            r8 = 0
        L53:
            long r11 = r0.f25512m
            v4.n$a r13 = r0.f25503d
            boolean r14 = r0.f25504e
            boolean r15 = r13.f25523j
            if (r15 == 0) goto L68
            boolean r15 = r13.f25520g
            if (r15 == 0) goto L68
            boolean r14 = r13.f25516c
            r13.f25526m = r14
            r13.f25523j = r5
            goto L8e
        L68:
            boolean r5 = r13.f25521h
            if (r5 != 0) goto L70
            boolean r5 = r13.f25520g
            if (r5 == 0) goto L8e
        L70:
            if (r14 == 0) goto L7f
            boolean r5 = r13.f25522i
            if (r5 == 0) goto L7f
            long r14 = r13.f25515b
            long r14 = r9 - r14
            int r5 = (int) r14
            int r5 = r5 + r2
            r13.m13273a(r5)
        L7f:
            long r14 = r13.f25515b
            r13.f25524k = r14
            long r14 = r13.f25518e
            r13.f25525l = r14
            boolean r5 = r13.f25516c
            r13.f25526m = r5
            r5 = 1
            r13.f25522i = r5
        L8e:
            boolean r5 = r0.f25504e
            if (r5 != 0) goto L347
            v4.r r5 = r0.f25506g
            r5.m13277b(r8)
            v4.r r5 = r0.f25507h
            r5.m13277b(r8)
            v4.r r5 = r0.f25508i
            r5.m13277b(r8)
            v4.r r5 = r0.f25506g
            boolean r13 = r5.f25568c
            if (r13 == 0) goto L347
            v4.r r13 = r0.f25507h
            boolean r14 = r13.f25568c
            if (r14 == 0) goto L347
            v4.r r14 = r0.f25508i
            boolean r15 = r14.f25568c
            if (r15 == 0) goto L347
            m4.z r15 = r0.f25502c
            java.lang.String r1 = r0.f25501b
            r16 = r3
            int r3 = r5.f25570e
            r17 = r4
            int r4 = r13.f25570e
            int r4 = r4 + r3
            r18 = r6
            int r6 = r14.f25570e
            int r4 = r4 + r6
            byte[] r4 = new byte[r4]
            byte[] r6 = r5.f25569d
            r19 = r2
            r2 = 0
            java.lang.System.arraycopy(r6, r2, r4, r2, r3)
            byte[] r3 = r13.f25569d
            int r6 = r5.f25570e
            r20 = r7
            int r7 = r13.f25570e
            java.lang.System.arraycopy(r3, r2, r4, r6, r7)
            byte[] r3 = r14.f25569d
            int r5 = r5.f25570e
            int r6 = r13.f25570e
            int r5 = r5 + r6
            int r6 = r14.f25570e
            java.lang.System.arraycopy(r3, r2, r4, r5, r6)
            m4.b0 r3 = new m4.b0
            byte[] r5 = r13.f25569d
            int r6 = r13.f25570e
            r3.<init>(r5, r2, r6)
            r2 = 44
            r3.m9775t(r2)
            r2 = 3
            int r2 = r3.m9766k(r2)
            r3.m9774s()
            r5 = 2
            int r21 = r3.m9766k(r5)
            boolean r22 = r3.m9765j()
            r6 = 5
            int r23 = r3.m9766k(r6)
            r6 = 0
            r7 = 32
            r13 = 0
            r24 = 0
        L110:
            if (r6 >= r7) goto L121
            boolean r7 = r3.m9765j()
            if (r7 == 0) goto L11c
            r7 = 1
            int r7 = r7 << r6
            r24 = r24 | r7
        L11c:
            int r6 = r6 + 1
            r7 = 32
            goto L110
        L121:
            r6 = 6
            int[] r7 = new int[r6]
            r13 = 0
        L125:
            r14 = 8
            if (r13 >= r6) goto L132
            int r14 = r3.m9766k(r14)
            r7[r13] = r14
            int r13 = r13 + 1
            goto L125
        L132:
            int r26 = r3.m9766k(r14)
            r6 = 0
            r13 = 0
        L138:
            if (r6 >= r2) goto L14d
            boolean r14 = r3.m9765j()
            if (r14 == 0) goto L142
            int r13 = r13 + 89
        L142:
            boolean r14 = r3.m9765j()
            if (r14 == 0) goto L14a
            int r13 = r13 + 8
        L14a:
            int r6 = r6 + 1
            goto L138
        L14d:
            r3.m9775t(r13)
            if (r2 <= 0) goto L159
            int r6 = 8 - r2
            int r6 = r6 * 2
            r3.m9775t(r6)
        L159:
            r3.m9769n()
            int r6 = r3.m9769n()
            r13 = 3
            if (r6 != r13) goto L166
            r3.m9774s()
        L166:
            int r13 = r3.m9769n()
            int r14 = r3.m9769n()
            boolean r25 = r3.m9765j()
            if (r25 == 0) goto L1a1
            int r25 = r3.m9769n()
            int r27 = r3.m9769n()
            int r28 = r3.m9769n()
            int r29 = r3.m9769n()
            r30 = r9
            r9 = 1
            if (r6 == r9) goto L18e
            if (r6 != r5) goto L18c
            goto L18e
        L18c:
            r5 = 1
            goto L18f
        L18e:
            r5 = 2
        L18f:
            if (r6 != r9) goto L193
            r6 = 2
            goto L194
        L193:
            r6 = 1
        L194:
            int r25 = r25 + r27
            int r25 = r25 * r5
            int r13 = r13 - r25
            int r28 = r28 + r29
            int r28 = r28 * r6
            int r14 = r14 - r28
            goto L1a3
        L1a1:
            r30 = r9
        L1a3:
            r3.m9769n()
            r3.m9769n()
            int r5 = r3.m9769n()
            boolean r6 = r3.m9765j()
            if (r6 == 0) goto L1b5
            r6 = 0
            goto L1b6
        L1b5:
            r6 = r2
        L1b6:
            if (r6 > r2) goto L1c4
            r3.m9769n()
            r3.m9769n()
            r3.m9769n()
            int r6 = r6 + 1
            goto L1b6
        L1c4:
            r3.m9769n()
            r3.m9769n()
            r3.m9769n()
            r3.m9769n()
            r3.m9769n()
            r3.m9769n()
            boolean r2 = r3.m9765j()
            r6 = 4
            if (r2 == 0) goto L223
            boolean r2 = r3.m9765j()
            if (r2 == 0) goto L223
            r2 = 0
        L1e4:
            if (r2 >= r6) goto L223
            r6 = 0
        L1e7:
            r9 = 6
            if (r6 >= r9) goto L21d
            boolean r9 = r3.m9765j()
            if (r9 != 0) goto L1f6
            r3.m9769n()
            r27 = r11
            goto L213
        L1f6:
            r9 = 64
            int r10 = r2 << 1
            int r10 = r10 + 4
            r27 = r11
            r11 = 1
            int r10 = r11 << r10
            int r9 = java.lang.Math.min(r9, r10)
            if (r2 <= r11) goto L20a
            r3.m9770o()
        L20a:
            r10 = 0
        L20b:
            if (r10 >= r9) goto L213
            r3.m9770o()
            int r10 = r10 + 1
            goto L20b
        L213:
            r9 = 3
            if (r2 != r9) goto L218
            r9 = 3
            goto L219
        L218:
            r9 = 1
        L219:
            int r6 = r6 + r9
            r11 = r27
            goto L1e7
        L21d:
            r27 = r11
            int r2 = r2 + 1
            r6 = 4
            goto L1e4
        L223:
            r27 = r11
            r2 = 2
            r3.m9775t(r2)
            boolean r2 = r3.m9765j()
            if (r2 == 0) goto L23d
            r2 = 8
            r3.m9775t(r2)
            r3.m9769n()
            r3.m9769n()
            r3.m9774s()
        L23d:
            int r2 = r3.m9769n()
            r6 = 0
            r9 = 0
            r10 = 0
        L244:
            if (r6 >= r2) goto L292
            if (r6 == 0) goto L24c
            boolean r9 = r3.m9765j()
        L24c:
            if (r9 == 0) goto L266
            r3.m9774s()
            r3.m9769n()
            r11 = 0
        L255:
            if (r11 > r10) goto L263
            boolean r12 = r3.m9765j()
            if (r12 == 0) goto L260
            r3.m9774s()
        L260:
            int r11 = r11 + 1
            goto L255
        L263:
            r29 = r2
            goto L28d
        L266:
            int r10 = r3.m9769n()
            int r11 = r3.m9769n()
            int r12 = r10 + r11
            r25 = 0
            r29 = r2
            r2 = 0
        L275:
            if (r2 >= r10) goto L280
            r3.m9769n()
            r3.m9774s()
            int r2 = r2 + 1
            goto L275
        L280:
            r2 = 0
        L281:
            if (r2 >= r11) goto L28c
            r3.m9769n()
            r3.m9774s()
            int r2 = r2 + 1
            goto L281
        L28c:
            r10 = r12
        L28d:
            int r6 = r6 + 1
            r2 = r29
            goto L244
        L292:
            boolean r2 = r3.m9765j()
            if (r2 == 0) goto L2a9
            r2 = 0
        L299:
            int r6 = r3.m9769n()
            if (r2 >= r6) goto L2a9
            int r6 = r5 + 4
            int r6 = r6 + 1
            r3.m9775t(r6)
            int r2 = r2 + 1
            goto L299
        L2a9:
            r2 = 2
            r3.m9775t(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            boolean r5 = r3.m9765j()
            if (r5 == 0) goto L31d
            boolean r5 = r3.m9765j()
            if (r5 == 0) goto L2e8
            r5 = 8
            int r5 = r3.m9766k(r5)
            r6 = 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L2d7
            r5 = 16
            int r6 = r3.m9766k(r5)
            int r5 = r3.m9766k(r5)
            if (r6 == 0) goto L2e8
            if (r5 == 0) goto L2e8
            float r2 = (float) r6
            float r5 = (float) r5
            float r2 = r2 / r5
            goto L2e8
        L2d7:
            float[] r6 = p371v5.C6568r.f25675b
            int r9 = r6.length
            if (r5 >= r9) goto L2df
            r2 = r6[r5]
            goto L2e8
        L2df:
            r6 = 46
            java.lang.String r9 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r10 = "H265Reader"
            p088f4.C1999d.m5182a(r6, r9, r5, r10)
        L2e8:
            boolean r5 = r3.m9765j()
            if (r5 == 0) goto L2f1
            r3.m9774s()
        L2f1:
            boolean r5 = r3.m9765j()
            if (r5 == 0) goto L306
            r5 = 4
            r3.m9775t(r5)
            boolean r5 = r3.m9765j()
            if (r5 == 0) goto L306
            r5 = 24
            r3.m9775t(r5)
        L306:
            boolean r5 = r3.m9765j()
            if (r5 == 0) goto L312
            r3.m9769n()
            r3.m9769n()
        L312:
            r3.m9774s()
            boolean r3 = r3.m9765j()
            if (r3 == 0) goto L31d
            int r14 = r14 * 2
        L31d:
            r25 = r7
            java.lang.String r3 = p371v5.C6554d.m13339b(r21, r22, r23, r24, r25, r26)
            f4.e0$b r5 = new f4.e0$b
            r5.<init>()
            r5.f8917a = r1
            java.lang.String r1 = "video/hevc"
            r5.f8927k = r1
            r5.f8924h = r3
            r5.f8932p = r13
            r5.f8933q = r14
            r5.f8936t = r2
            java.util.List r1 = java.util.Collections.singletonList(r4)
            r5.f8929m = r1
            f4.e0 r1 = r5.m5193a()
            r15.mo5973e(r1)
            r1 = 1
            r0.f25504e = r1
            goto L355
        L347:
            r19 = r2
            r16 = r3
            r17 = r4
            r18 = r6
            r20 = r7
            r30 = r9
            r27 = r11
        L355:
            v4.r r1 = r0.f25509j
            boolean r1 = r1.m13277b(r8)
            if (r1 == 0) goto L382
            v4.r r1 = r0.f25509j
            byte[] r2 = r1.f25569d
            int r1 = r1.f25570e
            int r1 = p371v5.C6568r.m13387f(r2, r1)
            v5.u r2 = r0.f25513n
            v4.r r3 = r0.f25509j
            byte[] r3 = r3.f25569d
            r2.m13394D(r3, r1)
            v5.u r1 = r0.f25513n
            r2 = 5
            r1.m13397G(r2)
            v4.z r1 = r0.f25500a
            v5.u r2 = r0.f25513n
            m4.z[] r1 = r1.f25621b
            r3 = r27
            p216m4.C4356c.m9777a(r3, r2, r1)
            goto L384
        L382:
            r3 = r27
        L384:
            v4.r r1 = r0.f25510k
            boolean r1 = r1.m13277b(r8)
            if (r1 == 0) goto L3ae
            v4.r r1 = r0.f25510k
            byte[] r2 = r1.f25569d
            int r1 = r1.f25570e
            int r1 = p371v5.C6568r.m13387f(r2, r1)
            v5.u r2 = r0.f25513n
            v4.r r5 = r0.f25510k
            byte[] r5 = r5.f25569d
            r2.m13394D(r5, r1)
            v5.u r1 = r0.f25513n
            r2 = 5
            r1.m13397G(r2)
            v4.z r1 = r0.f25500a
            v5.u r2 = r0.f25513n
            m4.z[] r1 = r1.f25621b
            p216m4.C4356c.m9777a(r3, r2, r1)
        L3ae:
            long r1 = r0.f25512m
            v4.n$a r3 = r0.f25503d
            boolean r4 = r0.f25504e
            r5 = 0
            r3.f25520g = r5
            r3.f25521h = r5
            r3.f25518e = r1
            r3.f25517d = r5
            r9 = r30
            r3.f25515b = r9
            r1 = 32
            r2 = r20
            if (r2 < r1) goto L3ce
            r1 = 40
            if (r2 != r1) goto L3cc
            goto L3ce
        L3cc:
            r1 = 0
            goto L3cf
        L3ce:
            r1 = 1
        L3cf:
            if (r1 != 0) goto L3fc
            boolean r1 = r3.f25522i
            if (r1 == 0) goto L3e3
            boolean r1 = r3.f25523j
            if (r1 != 0) goto L3e3
            if (r4 == 0) goto L3e0
            r1 = r19
            r3.m13273a(r1)
        L3e0:
            r1 = 0
            r3.f25522i = r1
        L3e3:
            r1 = 32
            if (r1 > r2) goto L3eb
            r1 = 35
            if (r2 <= r1) goto L3ef
        L3eb:
            r1 = 39
            if (r2 != r1) goto L3f1
        L3ef:
            r1 = 1
            goto L3f2
        L3f1:
            r1 = 0
        L3f2:
            if (r1 == 0) goto L3fc
            boolean r1 = r3.f25523j
            r4 = 1
            r1 = r1 ^ r4
            r3.f25521h = r1
            r3.f25523j = r4
        L3fc:
            r1 = 16
            if (r2 < r1) goto L406
            r1 = 21
            if (r2 > r1) goto L406
            r1 = 1
            goto L407
        L406:
            r1 = 0
        L407:
            r3.f25516c = r1
            if (r1 != 0) goto L412
            r1 = 9
            if (r2 > r1) goto L410
            goto L412
        L410:
            r1 = 0
            goto L413
        L412:
            r1 = 1
        L413:
            r3.f25519f = r1
            boolean r1 = r0.f25504e
            if (r1 != 0) goto L428
            v4.r r1 = r0.f25506g
            r1.m13279d(r2)
            v4.r r1 = r0.f25507h
            r1.m13279d(r2)
            v4.r r1 = r0.f25508i
            r1.m13279d(r2)
        L428:
            v4.r r1 = r0.f25509j
            r1.m13279d(r2)
            v4.r r1 = r0.f25510k
            r1.m13279d(r2)
            r1 = r33
            r3 = r16
            r4 = r17
            r2 = r18
            goto L2a
        L43c:
            r1 = r33
            goto Lb
        L440:
            return
    }

    @Override // p370v4.InterfaceC6532j
    /* renamed from: d */
    public void mo13243d(p216m4.InterfaceC4366k r3, p370v4.InterfaceC6525d0.d r4) {
            r2 = this;
            r4.m13253a()
            java.lang.String r0 = r4.m13254b()
            r2.f25501b = r0
            int r0 = r4.m13255c()
            r1 = 2
            m4.z r0 = r3.mo6048l(r0, r1)
            r2.f25502c = r0
            v4.n$a r1 = new v4.n$a
            r1.<init>(r0)
            r2.f25503d = r1
            v4.z r0 = r2.f25500a
            r0.m13286a(r3, r4)
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
            r2.f25512m = r3
        Lb:
            return
    }
}
