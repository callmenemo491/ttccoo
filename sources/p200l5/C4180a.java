package p200l5;

/* renamed from: l5.a */
/* loaded from: classes.dex */
public final class C4180a extends p143i5.AbstractC3081e {

    /* renamed from: n */
    public final p371v5.C6571u f17329n;

    /* renamed from: o */
    public final p371v5.C6571u f17330o;

    /* renamed from: p */
    public final p200l5.C4180a.a f17331p;

    /* renamed from: q */
    public java.util.zip.Inflater f17332q;

    /* renamed from: l5.a$a */
    public static final class a {

        /* renamed from: a */
        public final p371v5.C6571u f17333a;

        /* renamed from: b */
        public final int[] f17334b;

        /* renamed from: c */
        public boolean f17335c;

        /* renamed from: d */
        public int f17336d;

        /* renamed from: e */
        public int f17337e;

        /* renamed from: f */
        public int f17338f;

        /* renamed from: g */
        public int f17339g;

        /* renamed from: h */
        public int f17340h;

        /* renamed from: i */
        public int f17341i;

        public a() {
                r1 = this;
                r1.<init>()
                v5.u r0 = new v5.u
                r0.<init>()
                r1.f17333a = r0
                r0 = 256(0x100, float:3.59E-43)
                int[] r0 = new int[r0]
                r1.f17334b = r0
                return
        }

        /* renamed from: a */
        public void m9311a() {
                r2 = this;
                r0 = 0
                r2.f17336d = r0
                r2.f17337e = r0
                r2.f17338f = r0
                r2.f17339g = r0
                r2.f17340h = r0
                r2.f17341i = r0
                v5.u r1 = r2.f17333a
                r1.m13392B(r0)
                r2.f17335c = r0
                return
        }
    }

    public C4180a() {
            r1 = this;
            java.lang.String r0 = "PgsDecoder"
            r1.<init>(r0)
            v5.u r0 = new v5.u
            r0.<init>()
            r1.f17329n = r0
            v5.u r0 = new v5.u
            r0.<init>()
            r1.f17330o = r0
            l5.a$a r0 = new l5.a$a
            r0.<init>()
            r1.f17331p = r0
            return
    }

    @Override // p143i5.AbstractC3081e
    /* renamed from: j */
    public p143i5.InterfaceC3082f mo7541j(byte[] r38, int r39, boolean r40) {
            r37 = this;
            r0 = r37
            v5.u r1 = r0.f17329n
            r2 = r38
            r1.f25710a = r2
            r2 = r39
            r1.f25712c = r2
            r2 = 0
            r1.f25711b = r2
            int r3 = r1.m13398a()
            if (r3 <= 0) goto L3b
            int r3 = r1.m13400c()
            r4 = 120(0x78, float:1.68E-43)
            if (r3 != r4) goto L3b
            java.util.zip.Inflater r3 = r0.f17332q
            if (r3 != 0) goto L28
            java.util.zip.Inflater r3 = new java.util.zip.Inflater
            r3.<init>()
            r0.f17332q = r3
        L28:
            v5.u r3 = r0.f17330o
            java.util.zip.Inflater r4 = r0.f17332q
            boolean r3 = p371v5.C6552b0.m13330w(r1, r3, r4)
            if (r3 == 0) goto L3b
            v5.u r3 = r0.f17330o
            byte[] r4 = r3.f25710a
            int r3 = r3.f25712c
            r1.m13394D(r4, r3)
        L3b:
            l5.a$a r1 = r0.f17331p
            r1.m9311a()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L45:
            v5.u r3 = r0.f17329n
            int r3 = r3.m13398a()
            r4 = 2
            r5 = 3
            if (r3 < r5) goto L24b
            v5.u r3 = r0.f17329n
            l5.a$a r6 = r0.f17331p
            int r7 = r3.f25712c
            int r8 = r3.m13418u()
            int r9 = r3.m13423z()
            int r10 = r3.f25711b
            int r10 = r10 + r9
            if (r10 <= r7) goto L6a
            r3.m13396F(r7)
            r3 = r1
            r11 = 0
            r12 = 0
            goto L240
        L6a:
            r7 = 128(0x80, float:1.8E-43)
            if (r8 == r7) goto L17c
            switch(r8) {
                case 20: goto Lf1;
                case 21: goto L9c;
                case 22: goto L76;
                default: goto L71;
            }
        L71:
            r17 = r3
            r3 = r1
            goto L176
        L76:
            java.util.Objects.requireNonNull(r6)
            r4 = 19
            if (r9 >= r4) goto L7e
            goto L71
        L7e:
            int r4 = r3.m13423z()
            r6.f17336d = r4
            int r4 = r3.m13423z()
            r6.f17337e = r4
            r4 = 11
            r3.m13397G(r4)
            int r4 = r3.m13423z()
            r6.f17338f = r4
            int r4 = r3.m13423z()
            r6.f17339g = r4
            goto L71
        L9c:
            java.util.Objects.requireNonNull(r6)
            r4 = 4
            if (r9 >= r4) goto La3
            goto L71
        La3:
            r3.m13397G(r5)
            int r5 = r3.m13418u()
            r5 = r5 & r7
            if (r5 == 0) goto Laf
            r12 = 1
            goto Lb0
        Laf:
            r12 = 0
        Lb0:
            int r9 = r9 + (-4)
            if (r12 == 0) goto Ld4
            r5 = 7
            if (r9 >= r5) goto Lb8
            goto L71
        Lb8:
            int r5 = r3.m13420w()
            if (r5 >= r4) goto Lbf
            goto L71
        Lbf:
            int r4 = r3.m13423z()
            r6.f17340h = r4
            int r4 = r3.m13423z()
            r6.f17341i = r4
            v5.u r4 = r6.f17333a
            int r5 = r5 + (-4)
            r4.m13392B(r5)
            int r9 = r9 + (-7)
        Ld4:
            v5.u r4 = r6.f17333a
            int r5 = r4.f25711b
            int r4 = r4.f25712c
            if (r5 >= r4) goto L71
            if (r9 <= 0) goto L71
            int r4 = r4 - r5
            int r4 = java.lang.Math.min(r9, r4)
            v5.u r7 = r6.f17333a
            byte[] r7 = r7.f25710a
            r3.m13402e(r7, r5, r4)
            v5.u r6 = r6.f17333a
            int r5 = r5 + r4
            r6.m13396F(r5)
            goto L71
        Lf1:
            java.util.Objects.requireNonNull(r6)
            int r5 = r9 % 5
            if (r5 == r4) goto Lfa
            goto L71
        Lfa:
            r3.m13397G(r4)
            int[] r4 = r6.f17334b
            java.util.Arrays.fill(r4, r2)
            int r9 = r9 / 5
            r4 = 0
        L105:
            if (r4 >= r9) goto L170
            int r5 = r3.m13418u()
            int r7 = r3.m13418u()
            int r8 = r3.m13418u()
            int r13 = r3.m13418u()
            int r14 = r3.m13418u()
            double r11 = (double) r7
            r15 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            int r8 = r8 + (-128)
            double r7 = (double) r8
            double r15 = r15 * r7
            r17 = r3
            double r2 = r15 + r11
            int r2 = (int) r2
            r15 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            int r13 = r13 + (-128)
            r3 = r1
            double r0 = (double) r13
            double r15 = r15 * r0
            double r15 = r11 - r15
            r18 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            double r7 = r7 * r18
            double r7 = r15 - r7
            int r7 = (int) r7
            r15 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            double r0 = r0 * r15
            double r0 = r0 + r11
            int r0 = (int) r0
            int[] r1 = r6.f17334b
            int r8 = r14 << 24
            r11 = 255(0xff, float:3.57E-43)
            r12 = 0
            int r2 = p371v5.C6552b0.m13315h(r2, r12, r11)
            int r2 = r2 << 16
            r2 = r2 | r8
            int r7 = p371v5.C6552b0.m13315h(r7, r12, r11)
            int r7 = r7 << 8
            r2 = r2 | r7
            int r0 = p371v5.C6552b0.m13315h(r0, r12, r11)
            r0 = r0 | r2
            r1[r5] = r0
            int r4 = r4 + 1
            r0 = r37
            r1 = r3
            r3 = r17
            r2 = 0
            goto L105
        L170:
            r17 = r3
            r0 = 1
            r3 = r1
            r6.f17335c = r0
        L176:
            r0 = r17
            r11 = 0
            r12 = 0
            goto L23d
        L17c:
            r17 = r3
            r3 = r1
            int r0 = r6.f17336d
            if (r0 == 0) goto L236
            int r0 = r6.f17337e
            if (r0 == 0) goto L236
            int r0 = r6.f17340h
            if (r0 == 0) goto L236
            int r0 = r6.f17341i
            if (r0 == 0) goto L236
            v5.u r0 = r6.f17333a
            int r1 = r0.f25712c
            if (r1 == 0) goto L236
            int r2 = r0.f25711b
            if (r2 != r1) goto L236
            boolean r1 = r6.f17335c
            if (r1 != 0) goto L19f
            goto L236
        L19f:
            r12 = 0
            r0.m13396F(r12)
            int r0 = r6.f17340h
            int r1 = r6.f17341i
            int r0 = r0 * r1
            int[] r1 = new int[r0]
            r2 = 0
        L1ac:
            if (r2 >= r0) goto L1ef
            v5.u r4 = r6.f17333a
            int r4 = r4.m13418u()
            if (r4 == 0) goto L1c0
            int r5 = r2 + 1
            int[] r7 = r6.f17334b
            r4 = r7[r4]
            r1[r2] = r4
        L1be:
            r2 = r5
            goto L1ac
        L1c0:
            v5.u r4 = r6.f17333a
            int r4 = r4.m13418u()
            if (r4 == 0) goto L1ac
            r5 = r4 & 64
            if (r5 != 0) goto L1cf
            r5 = r4 & 63
            goto L1da
        L1cf:
            r5 = r4 & 63
            int r5 = r5 << 8
            v5.u r7 = r6.f17333a
            int r7 = r7.m13418u()
            r5 = r5 | r7
        L1da:
            r4 = r4 & 128(0x80, float:1.8E-43)
            if (r4 != 0) goto L1e0
            r4 = 0
            goto L1ea
        L1e0:
            int[] r4 = r6.f17334b
            v5.u r7 = r6.f17333a
            int r7 = r7.m13418u()
            r4 = r4[r7]
        L1ea:
            int r5 = r5 + r2
            java.util.Arrays.fill(r1, r2, r5, r4)
            goto L1be
        L1ef:
            int r0 = r6.f17340h
            int r2 = r6.f17341i
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r22 = android.graphics.Bitmap.createBitmap(r1, r0, r2, r4)
            r35 = 0
            r20 = 0
            r19 = r20
            r21 = r20
            r29 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r28 = -2147483648(0xffffffff80000000, float:-0.0)
            r34 = r28
            r32 = 0
            r33 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r6.f17338f
            float r0 = (float) r0
            int r1 = r6.f17336d
            float r1 = (float) r1
            float r26 = r0 / r1
            r27 = 0
            int r0 = r6.f17339g
            float r0 = (float) r0
            int r2 = r6.f17337e
            float r2 = (float) r2
            float r23 = r0 / r2
            r24 = 0
            r25 = 0
            int r0 = r6.f17340h
            float r0 = (float) r0
            float r30 = r0 / r1
            int r0 = r6.f17341i
            float r0 = (float) r0
            float r31 = r0 / r2
            i5.a r11 = new i5.a
            r18 = r11
            r36 = 0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L238
        L236:
            r12 = 0
            r11 = 0
        L238:
            r6.m9311a()
            r0 = r17
        L23d:
            r0.m13396F(r10)
        L240:
            if (r11 == 0) goto L245
            r3.add(r11)
        L245:
            r0 = r37
            r1 = r3
            r2 = 0
            goto L45
        L24b:
            r3 = r1
            j5.e r0 = new j5.e
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            r0.<init>(r1, r4)
            return r0
    }
}
