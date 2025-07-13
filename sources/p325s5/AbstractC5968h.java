package p325s5;

/* renamed from: s5.h */
/* loaded from: classes.dex */
public abstract class AbstractC5968h extends p325s5.AbstractC5973m {

    /* renamed from: s5.h$a */
    public static final class a {

        /* renamed from: a */
        public final int f23004a;

        /* renamed from: b */
        public final int[] f23005b;

        /* renamed from: c */
        public final p108g5.C2273i0[] f23006c;

        /* renamed from: d */
        public final int[] f23007d;

        /* renamed from: e */
        public final int[][][] f23008e;

        /* renamed from: f */
        public final p108g5.C2273i0 f23009f;

        public a(java.lang.String[] r1, int[] r2, p108g5.C2273i0[] r3, int[] r4, int[][][] r5, p108g5.C2273i0 r6) {
                r0 = this;
                r0.<init>()
                r0.f23005b = r2
                r0.f23006c = r3
                r0.f23008e = r5
                r0.f23007d = r4
                r0.f23009f = r6
                int r1 = r2.length
                r0.f23004a = r1
                return
        }

        /* renamed from: a */
        public int m12438a(int r2, int r3, int r4) {
                r1 = this;
                int[][][] r0 = r1.f23008e
                r2 = r0[r2]
                r2 = r2[r3]
                r2 = r2[r4]
                r2 = r2 & 7
                return r2
        }
    }

    public AbstractC5968h() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: c */
    public static int[] m12435c(p088f4.InterfaceC2007f1 r3, p108g5.C2271h0 r4) {
            int r0 = r4.f10372Y
            int[] r0 = new int[r0]
            r1 = 0
        L5:
            int r2 = r4.f10372Y
            if (r1 >= r2) goto L16
            f4.e0[] r2 = r4.f10373Z
            r2 = r2[r1]
            int r2 = r3.mo5239f(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L5
        L16:
            return r0
    }

    @Override // p325s5.AbstractC5973m
    /* renamed from: a */
    public final void mo12436a(java.lang.Object r1) {
            r0 = this;
            s5.h$a r1 = (p325s5.AbstractC5968h.a) r1
            return
    }

    @Override // p325s5.AbstractC5973m
    /* renamed from: b */
    public final p325s5.C5974n mo12437b(p088f4.InterfaceC2007f1[] r54, p108g5.C2273i0 r55, p108g5.InterfaceC2283r.a r56, p088f4.AbstractC2031n1 r57) {
            r53 = this;
            r0 = r54
            r1 = r55
            int r2 = r0.length
            r3 = 1
            int r2 = r2 + r3
            int[] r2 = new int[r2]
            int r4 = r0.length
            int r4 = r4 + r3
            g5.h0[][] r5 = new p108g5.C2271h0[r4][]
            int r6 = r0.length
            int r6 = r6 + r3
            int[][][] r6 = new int[r6][][]
            r14 = 0
            r7 = 0
        L13:
            if (r7 >= r4) goto L22
            int r8 = r1.f10378Y
            g5.h0[] r9 = new p108g5.C2271h0[r8]
            r5[r7] = r9
            int[][] r8 = new int[r8][]
            r6[r7] = r8
            int r7 = r7 + 1
            goto L13
        L22:
            int r4 = r0.length
            int[] r15 = new int[r4]
            r7 = 0
        L26:
            if (r7 >= r4) goto L33
            r8 = r0[r7]
            int r8 = r8.mo5240l()
            r15[r7] = r8
            int r7 = r7 + 1
            goto L26
        L33:
            r4 = 0
        L34:
            int r7 = r1.f10378Y
            if (r4 >= r7) goto Lab
            g5.h0[] r7 = r1.f10379Z
            r7 = r7[r4]
            f4.e0[] r8 = r7.f10373Z
            r8 = r8[r14]
            java.lang.String r8 = r8.f8896j0
            int r8 = p371v5.C6567q.m13377g(r8)
            r9 = 5
            if (r8 != r9) goto L4b
            r8 = 1
            goto L4c
        L4b:
            r8 = 0
        L4c:
            int r9 = r0.length
            r10 = 0
            r11 = 0
            r12 = 1
        L50:
            int r13 = r0.length
            if (r10 >= r13) goto L86
            r13 = r0[r10]
            r3 = 0
        L56:
            int r1 = r7.f10372Y
            if (r14 >= r1) goto L6b
            f4.e0[] r1 = r7.f10373Z
            r1 = r1[r14]
            int r1 = r13.mo5239f(r1)
            r1 = r1 & 7
            int r3 = java.lang.Math.max(r3, r1)
            int r14 = r14 + 1
            goto L56
        L6b:
            r1 = r2[r10]
            if (r1 != 0) goto L71
            r1 = 1
            goto L72
        L71:
            r1 = 0
        L72:
            if (r3 > r11) goto L7c
            if (r3 != r11) goto L7f
            if (r8 == 0) goto L7f
            if (r12 != 0) goto L7f
            if (r1 == 0) goto L7f
        L7c:
            r12 = r1
            r11 = r3
            r9 = r10
        L7f:
            int r10 = r10 + 1
            r1 = r55
            r3 = 1
            r14 = 0
            goto L50
        L86:
            int r1 = r0.length
            if (r9 != r1) goto L8e
            int r1 = r7.f10372Y
            int[] r1 = new int[r1]
            goto L94
        L8e:
            r1 = r0[r9]
            int[] r1 = m12435c(r1, r7)
        L94:
            r3 = r2[r9]
            r8 = r5[r9]
            r8[r3] = r7
            r7 = r6[r9]
            r7[r3] = r1
            r1 = r2[r9]
            r3 = 1
            int r1 = r1 + r3
            r2[r9] = r1
            int r4 = r4 + 1
            r1 = r55
            r3 = 1
            r14 = 0
            goto L34
        Lab:
            int r1 = r0.length
            g5.i0[] r10 = new p108g5.C2273i0[r1]
            int r1 = r0.length
            java.lang.String[] r8 = new java.lang.String[r1]
            int r1 = r0.length
            int[] r9 = new int[r1]
            r1 = 0
        Lb5:
            int r3 = r0.length
            if (r1 >= r3) goto Le6
            r3 = r2[r1]
            g5.i0 r4 = new g5.i0
            r7 = r5[r1]
            java.lang.Object[] r7 = p371v5.C6552b0.m13299C(r7, r3)
            g5.h0[] r7 = (p108g5.C2271h0[]) r7
            r4.<init>(r7)
            r10[r1] = r4
            r4 = r6[r1]
            java.lang.Object[] r3 = p371v5.C6552b0.m13299C(r4, r3)
            int[][] r3 = (int[][]) r3
            r6[r1] = r3
            r3 = r0[r1]
            java.lang.String r3 = r3.mo5195a()
            r8[r1] = r3
            r3 = r0[r1]
            f4.g r3 = (p088f4.AbstractC2008g) r3
            int r3 = r3.f8947Y
            r9[r1] = r3
            int r1 = r1 + 1
            goto Lb5
        Le6:
            int r1 = r0.length
            r1 = r2[r1]
            g5.i0 r13 = new g5.i0
            int r0 = r0.length
            r0 = r5[r0]
            java.lang.Object[] r0 = p371v5.C6552b0.m13299C(r0, r1)
            g5.h0[] r0 = (p108g5.C2271h0[]) r0
            r13.<init>(r0)
            s5.h$a r0 = new s5.h$a
            r7 = r0
            r11 = r15
            r12 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r1 = r53
            s5.d r1 = (p325s5.C5964d) r1
            java.util.concurrent.atomic.AtomicReference<s5.d$d> r2 = r1.f22937c
            java.lang.Object r2 = r2.get()
            s5.d$d r2 = (p325s5.C5964d.d) r2
            int r3 = r0.f23004a
            s5.f$a[] r4 = new p325s5.InterfaceC5966f.a[r3]
            r9 = r0
            r10 = r2
            r5 = 0
            r7 = 0
            r8 = 0
        L114:
            r11 = 2
            if (r5 >= r3) goto L376
            int[] r14 = r9.f23005b
            r14 = r14[r5]
            if (r11 != r14) goto L357
            if (r8 != 0) goto L338
            g5.i0[] r8 = r9.f23006c
            r8 = r8[r5]
            r9 = r6[r5]
            r14 = r15[r5]
            boolean r13 = r10.f23040t0
            if (r13 != 0) goto L294
            boolean r13 = r10.f23039s0
            if (r13 != 0) goto L294
            boolean r13 = r10.f22955A0
            if (r13 == 0) goto L136
            r13 = 24
            goto L138
        L136:
            r13 = 16
        L138:
            boolean r12 = r10.f22967z0
            if (r12 == 0) goto L142
            r12 = r14 & r13
            if (r12 == 0) goto L142
            r12 = 1
            goto L143
        L142:
            r12 = 0
        L143:
            r14 = r10
            r10 = 0
        L145:
            int r11 = r8.f10378Y
            if (r10 >= r11) goto L294
            g5.h0[] r11 = r8.f10379Z
            r11 = r11[r10]
            r28 = r9[r10]
            r29 = r1
            int r1 = r14.f23019Y
            r30 = r15
            int r15 = r14.f23020Z
            r31 = r6
            int r6 = r14.f23021a0
            r32 = r3
            int r3 = r14.f23022b0
            r33 = r7
            int r7 = r14.f23023c0
            r34 = r0
            int r0 = r14.f23024d0
            r35 = r4
            int r4 = r14.f23025e0
            r36 = r5
            int r5 = r14.f23026f0
            r37 = r9
            int r9 = r14.f23027g0
            r38 = r2
            int r2 = r14.f23028h0
            boolean r14 = r14.f23029i0
            r39 = r8
            int r8 = r11.f10372Y
            r40 = r10
            r10 = 2
            if (r8 >= r10) goto L183
            goto L190
        L183:
            java.util.List r2 = p325s5.C5964d.m12416e(r11, r9, r2, r14)
            r8 = r2
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r9 = r8.size()
            if (r9 >= r10) goto L196
        L190:
            int[] r0 = p325s5.C5964d.f22933d
            r42 = r12
            goto L26e
        L196:
            if (r12 != 0) goto L21c
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            r42 = r12
            r10 = 0
            r14 = 0
            r41 = 0
        L1a3:
            int r12 = r8.size()
            if (r14 >= r12) goto L217
            java.lang.Object r12 = r8.get(r14)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r43 = r2
            f4.e0[] r2 = r11.f10373Z
            r2 = r2[r12]
            java.lang.String r2 = r2.f8896j0
            boolean r12 = r9.add(r2)
            if (r12 == 0) goto L208
            r44 = r9
            r45 = r14
            r9 = 0
            r12 = 0
        L1c7:
            int r14 = r8.size()
            if (r12 >= r14) goto L200
            java.lang.Object r14 = r8.get(r12)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r46 = r8
            f4.e0[] r8 = r11.f10373Z
            r16 = r8[r14]
            r18 = r28[r14]
            r17 = r2
            r19 = r13
            r20 = r1
            r21 = r15
            r22 = r6
            r23 = r3
            r24 = r7
            r25 = r0
            r26 = r4
            r27 = r5
            boolean r8 = p325s5.C5964d.m12418g(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r8 == 0) goto L1fb
            int r9 = r9 + 1
        L1fb:
            int r12 = r12 + 1
            r8 = r46
            goto L1c7
        L200:
            r46 = r8
            if (r9 <= r10) goto L20e
            r41 = r2
            r10 = r9
            goto L20e
        L208:
            r46 = r8
            r44 = r9
            r45 = r14
        L20e:
            int r14 = r45 + 1
            r2 = r43
            r9 = r44
            r8 = r46
            goto L1a3
        L217:
            r43 = r2
            r46 = r8
            goto L224
        L21c:
            r43 = r2
            r46 = r8
            r42 = r12
            r41 = 0
        L224:
            int r2 = r46.size()
        L228:
            r8 = -1
            int r2 = r2 + r8
            if (r2 < 0) goto L25e
            r8 = r46
            java.lang.Object r9 = r8.get(r2)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            f4.e0[] r10 = r11.f10373Z
            r16 = r10[r9]
            r18 = r28[r9]
            r17 = r41
            r19 = r13
            r20 = r1
            r21 = r15
            r22 = r6
            r23 = r3
            r24 = r7
            r25 = r0
            r26 = r4
            r27 = r5
            boolean r9 = p325s5.C5964d.m12418g(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r9 != 0) goto L25b
            r8.remove(r2)
        L25b:
            r46 = r8
            goto L228
        L25e:
            r8 = r46
            int r0 = r8.size()
            r1 = 2
            if (r0 >= r1) goto L26a
            int[] r0 = p325s5.C5964d.f22933d
            goto L26e
        L26a:
            int[] r0 = p074e9.C1806b.m4544w(r43)
        L26e:
            int r1 = r0.length
            if (r1 <= 0) goto L277
            s5.f$a r1 = new s5.f$a
            r1.<init>(r11, r0)
            goto L2ab
        L277:
            int r10 = r40 + 1
            r1 = r29
            r15 = r30
            r6 = r31
            r3 = r32
            r7 = r33
            r0 = r34
            r4 = r35
            r5 = r36
            r9 = r37
            r2 = r38
            r14 = r2
            r8 = r39
            r12 = r42
            goto L145
        L294:
            r34 = r0
            r29 = r1
            r38 = r2
            r32 = r3
            r35 = r4
            r36 = r5
            r31 = r6
            r33 = r7
            r39 = r8
            r37 = r9
            r30 = r15
            r1 = 0
        L2ab:
            if (r1 != 0) goto L328
            r3 = r39
            r0 = 0
            r1 = 0
            r2 = 0
            r12 = -1
        L2b3:
            int r4 = r3.f10378Y
            if (r2 >= r4) goto L315
            g5.h0[] r4 = r3.f10379Z
            r4 = r4[r2]
            r5 = r38
            int r6 = r5.f23027g0
            int r7 = r5.f23028h0
            boolean r8 = r5.f23029i0
            java.util.List r6 = p325s5.C5964d.m12416e(r4, r6, r7, r8)
            r7 = r37[r2]
            r8 = r1
            r1 = r0
            r0 = 0
        L2cc:
            int r9 = r4.f10372Y
            if (r0 >= r9) goto L30e
            f4.e0[] r9 = r4.f10373Z
            r9 = r9[r0]
            int r10 = r9.f8889c0
            r10 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L2db
            goto L30b
        L2db:
            r10 = r7[r0]
            boolean r11 = r5.f22960F0
            boolean r10 = p325s5.C5964d.m12417f(r10, r11)
            if (r10 == 0) goto L30b
            s5.d$h r10 = new s5.d$h
            r11 = r7[r0]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r14 = r6
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            boolean r13 = r14.contains(r13)
            r10.<init>(r9, r5, r11, r13)
            boolean r9 = r10.f22994Y
            if (r9 != 0) goto L300
            boolean r9 = r5.f22966y0
            if (r9 != 0) goto L300
            goto L30b
        L300:
            if (r8 == 0) goto L308
            int r9 = r10.m12431e(r8)
            if (r9 <= 0) goto L30b
        L308:
            r12 = r0
            r1 = r4
            r8 = r10
        L30b:
            int r0 = r0 + 1
            goto L2cc
        L30e:
            int r2 = r2 + 1
            r0 = r1
            r38 = r5
            r1 = r8
            goto L2b3
        L315:
            r5 = r38
            if (r0 != 0) goto L31b
            r13 = 0
            goto L326
        L31b:
            s5.f$a r13 = new s5.f$a
            r1 = 1
            int[] r2 = new int[r1]
            r1 = 0
            r2[r1] = r12
            r13.<init>(r0, r2)
        L326:
            r1 = r13
            goto L32a
        L328:
            r5 = r38
        L32a:
            r35[r36] = r1
            r0 = r35[r36]
            if (r0 == 0) goto L332
            r0 = 1
            goto L333
        L332:
            r0 = 0
        L333:
            r8 = r0
            r10 = r5
            r0 = r34
            goto L347
        L338:
            r29 = r1
            r32 = r3
            r35 = r4
            r36 = r5
            r31 = r6
            r33 = r7
            r30 = r15
            r5 = r2
        L347:
            g5.i0[] r1 = r0.f23006c
            r1 = r1[r36]
            int r1 = r1.f10378Y
            if (r1 <= 0) goto L351
            r1 = 1
            goto L352
        L351:
            r1 = 0
        L352:
            r1 = r33 | r1
            r9 = r0
            r7 = r1
            goto L366
        L357:
            r29 = r1
            r32 = r3
            r35 = r4
            r36 = r5
            r31 = r6
            r33 = r7
            r30 = r15
            r5 = r2
        L366:
            int r1 = r36 + 1
            r2 = r5
            r15 = r30
            r6 = r31
            r3 = r32
            r4 = r35
            r5 = r1
            r1 = r29
            goto L114
        L376:
            r29 = r1
            r5 = r2
            r35 = r4
            r31 = r6
            r33 = r7
            r30 = r15
            r6 = r3
            r1 = 0
            r2 = 0
            r3 = -1
            r4 = 0
        L386:
            if (r4 >= r6) goto L4ff
            int[] r7 = r9.f23005b
            r7 = r7[r4]
            r8 = 1
            if (r8 != r7) goto L4e7
            boolean r7 = r10.f22962H0
            if (r7 != 0) goto L398
            if (r33 != 0) goto L396
            goto L398
        L396:
            r7 = 0
            goto L399
        L398:
            r7 = 1
        L399:
            g5.i0[] r8 = r9.f23006c
            r8 = r8[r4]
            r9 = r31[r4]
            r11 = r30[r4]
            r11 = 0
            r12 = -1
            r13 = -1
            r14 = 0
        L3a5:
            int r15 = r8.f10378Y
            if (r14 >= r15) goto L3fc
            g5.h0[] r15 = r8.f10379Z
            r15 = r15[r14]
            r16 = r9[r14]
            r18 = r12
            r17 = r13
            r12 = r11
            r11 = 0
        L3b5:
            int r13 = r15.f10372Y
            if (r11 >= r13) goto L3f2
            r13 = r16[r11]
            r19 = r1
            boolean r1 = r10.f22960F0
            boolean r1 = p325s5.C5964d.m12417f(r13, r1)
            if (r1 == 0) goto L3e9
            f4.e0[] r1 = r15.f10373Z
            r1 = r1[r11]
            s5.d$b r13 = new s5.d$b
            r20 = r15
            r15 = r16[r11]
            r13.<init>(r1, r10, r15)
            boolean r1 = r13.f22938Y
            if (r1 != 0) goto L3db
            boolean r1 = r10.f22956B0
            if (r1 != 0) goto L3db
            goto L3eb
        L3db:
            if (r12 == 0) goto L3e3
            int r1 = r13.m12421e(r12)
            if (r1 <= 0) goto L3eb
        L3e3:
            r17 = r11
            r12 = r13
            r18 = r14
            goto L3eb
        L3e9:
            r20 = r15
        L3eb:
            int r11 = r11 + 1
            r1 = r19
            r15 = r20
            goto L3b5
        L3f2:
            r19 = r1
            int r14 = r14 + 1
            r11 = r12
            r13 = r17
            r12 = r18
            goto L3a5
        L3fc:
            r19 = r1
            r1 = -1
            if (r12 != r1) goto L40c
            r34 = r0
            r16 = r4
            r38 = r5
            r32 = r6
            r0 = 0
            goto L4b8
        L40c:
            g5.h0[] r1 = r8.f10379Z
            r1 = r1[r12]
            boolean r8 = r10.f23040t0
            if (r8 != 0) goto L49b
            boolean r8 = r10.f23039s0
            if (r8 != 0) goto L49b
            if (r7 == 0) goto L49b
            r7 = r9[r12]
            int r8 = r10.f23034n0
            boolean r9 = r10.f22957C0
            boolean r12 = r10.f22958D0
            boolean r10 = r10.f22959E0
            f4.e0[] r14 = r1.f10373Z
            r14 = r14[r13]
            int r15 = r1.f10372Y
            int[] r15 = new int[r15]
            r34 = r0
            r38 = r5
            r32 = r6
            r0 = 0
            r5 = 0
        L434:
            int r6 = r1.f10372Y
            if (r5 >= r6) goto L48b
            if (r5 == r13) goto L47b
            f4.e0[] r6 = r1.f10373Z
            r6 = r6[r5]
            r16 = r4
            r4 = r7[r5]
            r17 = r7
            r7 = 0
            boolean r4 = p325s5.C5964d.m12417f(r4, r7)
            if (r4 == 0) goto L477
            int r4 = r6.f8892f0
            r7 = -1
            if (r4 == r7) goto L477
            if (r4 > r8) goto L477
            if (r10 != 0) goto L45c
            int r4 = r6.f8909w0
            if (r4 == r7) goto L477
            int r7 = r14.f8909w0
            if (r4 != r7) goto L477
        L45c:
            if (r9 != 0) goto L46a
            java.lang.String r4 = r6.f8896j0
            if (r4 == 0) goto L477
            java.lang.String r7 = r14.f8896j0
            boolean r4 = android.text.TextUtils.equals(r4, r7)
            if (r4 == 0) goto L477
        L46a:
            if (r12 != 0) goto L475
            int r4 = r6.f8910x0
            r6 = -1
            if (r4 == r6) goto L477
            int r6 = r14.f8910x0
            if (r4 != r6) goto L477
        L475:
            r4 = 1
            goto L478
        L477:
            r4 = 0
        L478:
            if (r4 == 0) goto L484
            goto L47f
        L47b:
            r16 = r4
            r17 = r7
        L47f:
            int r4 = r0 + 1
            r15[r0] = r5
            r0 = r4
        L484:
            int r5 = r5 + 1
            r4 = r16
            r7 = r17
            goto L434
        L48b:
            r16 = r4
            int[] r0 = java.util.Arrays.copyOf(r15, r0)
            int r4 = r0.length
            r5 = 1
            if (r4 <= r5) goto L4a3
            s5.f$a r4 = new s5.f$a
            r4.<init>(r1, r0)
            goto L4a4
        L49b:
            r34 = r0
            r16 = r4
            r38 = r5
            r32 = r6
        L4a3:
            r4 = 0
        L4a4:
            if (r4 != 0) goto L4b1
            s5.f$a r4 = new s5.f$a
            r0 = 1
            int[] r5 = new int[r0]
            r0 = 0
            r5[r0] = r13
            r4.<init>(r1, r5)
        L4b1:
            java.util.Objects.requireNonNull(r11)
            android.util.Pair r0 = android.util.Pair.create(r4, r11)
        L4b8:
            if (r0 == 0) goto L4f1
            if (r2 == 0) goto L4c6
            java.lang.Object r1 = r0.second
            s5.d$b r1 = (p325s5.C5964d.b) r1
            int r1 = r1.m12421e(r2)
            if (r1 <= 0) goto L4f1
        L4c6:
            r1 = -1
            if (r3 == r1) goto L4cc
            r1 = 0
            r35[r3] = r1
        L4cc:
            java.lang.Object r1 = r0.first
            s5.f$a r1 = (p325s5.InterfaceC5966f.a) r1
            r35[r16] = r1
            g5.h0 r2 = r1.f23001a
            int[] r1 = r1.f23002b
            r3 = 0
            r1 = r1[r3]
            f4.e0[] r2 = r2.f10373Z
            r1 = r2[r1]
            java.lang.String r1 = r1.f8887a0
            java.lang.Object r0 = r0.second
            s5.d$b r0 = (p325s5.C5964d.b) r0
            r2 = r0
            r3 = r16
            goto L4f3
        L4e7:
            r34 = r0
            r19 = r1
            r16 = r4
            r38 = r5
            r32 = r6
        L4f1:
            r1 = r19
        L4f3:
            int r4 = r16 + 1
            r6 = r32
            r0 = r34
            r9 = r0
            r5 = r38
            r10 = r5
            goto L386
        L4ff:
            r34 = r0
            r19 = r1
            r38 = r5
            r3 = r6
            r0 = 0
            r1 = -1
            r2 = 0
        L509:
            if (r2 >= r3) goto L63a
            r4 = r34
            int[] r5 = r4.f23005b
            r5 = r5[r2]
            r6 = 1
            if (r5 == r6) goto L62c
            r6 = 2
            if (r5 == r6) goto L62c
            r6 = 3
            if (r5 == r6) goto L58b
            g5.i0[] r5 = r4.f23006c
            r5 = r5[r2]
            r6 = r31[r2]
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L524:
            int r11 = r5.f10378Y
            if (r9 >= r11) goto L574
            g5.h0[] r11 = r5.f10379Z
            r11 = r11[r9]
            r12 = r6[r9]
            r13 = r10
            r10 = r8
            r8 = r7
            r7 = 0
        L532:
            int r14 = r11.f10372Y
            if (r7 >= r14) goto L568
            r14 = r12[r7]
            r16 = r5
            r15 = r38
            boolean r5 = r15.f22960F0
            boolean r5 = p325s5.C5964d.m12417f(r14, r5)
            if (r5 == 0) goto L55d
            f4.e0[] r5 = r11.f10373Z
            r5 = r5[r7]
            s5.d$c r14 = new s5.d$c
            r17 = r6
            r6 = r12[r7]
            r14.<init>(r5, r6)
            if (r10 == 0) goto L559
            int r5 = r14.m12422e(r10)
            if (r5 <= 0) goto L55f
        L559:
            r13 = r7
            r8 = r11
            r10 = r14
            goto L55f
        L55d:
            r17 = r6
        L55f:
            int r7 = r7 + 1
            r38 = r15
            r5 = r16
            r6 = r17
            goto L532
        L568:
            r16 = r5
            r17 = r6
            r15 = r38
            int r9 = r9 + 1
            r7 = r8
            r8 = r10
            r10 = r13
            goto L524
        L574:
            r15 = r38
            if (r7 != 0) goto L57a
            r5 = 0
            goto L585
        L57a:
            s5.f$a r5 = new s5.f$a
            r6 = 1
            int[] r8 = new int[r6]
            r6 = 0
            r8[r6] = r10
            r5.<init>(r7, r8)
        L585:
            r35[r2] = r5
            r11 = r19
            goto L630
        L58b:
            r15 = r38
            g5.i0[] r5 = r4.f23006c
            r5 = r5[r2]
            r6 = r31[r2]
            r7 = 0
            r8 = 0
            r9 = -1
            r10 = 0
        L597:
            int r11 = r5.f10378Y
            if (r10 >= r11) goto L5f4
            g5.h0[] r11 = r5.f10379Z
            r11 = r11[r10]
            r12 = r6[r10]
            r13 = r9
            r9 = r8
            r8 = r7
            r7 = 0
        L5a5:
            int r14 = r11.f10372Y
            if (r7 >= r14) goto L5e8
            r14 = r12[r7]
            r16 = r5
            boolean r5 = r15.f22960F0
            boolean r5 = p325s5.C5964d.m12417f(r14, r5)
            if (r5 == 0) goto L5d7
            f4.e0[] r5 = r11.f10373Z
            r5 = r5[r7]
            s5.d$g r14 = new s5.d$g
            r17 = r6
            r6 = r12[r7]
            r18 = r11
            r11 = r19
            r14.<init>(r5, r15, r6, r11)
            boolean r5 = r14.f22985Y
            if (r5 == 0) goto L5dd
            if (r9 == 0) goto L5d2
            int r5 = r14.m12430e(r9)
            if (r5 <= 0) goto L5dd
        L5d2:
            r13 = r7
            r9 = r14
            r8 = r18
            goto L5dd
        L5d7:
            r17 = r6
            r18 = r11
            r11 = r19
        L5dd:
            int r7 = r7 + 1
            r19 = r11
            r5 = r16
            r6 = r17
            r11 = r18
            goto L5a5
        L5e8:
            r16 = r5
            r17 = r6
            r11 = r19
            int r10 = r10 + 1
            r7 = r8
            r8 = r9
            r9 = r13
            goto L597
        L5f4:
            r11 = r19
            if (r7 != 0) goto L5fa
            r5 = 0
            goto L60c
        L5fa:
            s5.f$a r5 = new s5.f$a
            r6 = 1
            int[] r10 = new int[r6]
            r6 = 0
            r10[r6] = r9
            r5.<init>(r7, r10)
            java.util.Objects.requireNonNull(r8)
            android.util.Pair r5 = android.util.Pair.create(r5, r8)
        L60c:
            if (r5 == 0) goto L630
            if (r0 == 0) goto L61a
            java.lang.Object r6 = r5.second
            s5.d$g r6 = (p325s5.C5964d.g) r6
            int r6 = r6.m12430e(r0)
            if (r6 <= 0) goto L630
        L61a:
            r0 = -1
            if (r1 == r0) goto L620
            r0 = 0
            r35[r1] = r0
        L620:
            java.lang.Object r0 = r5.first
            s5.f$a r0 = (p325s5.InterfaceC5966f.a) r0
            r35[r2] = r0
            java.lang.Object r0 = r5.second
            s5.d$g r0 = (p325s5.C5964d.g) r0
            r1 = r2
            goto L630
        L62c:
            r11 = r19
            r15 = r38
        L630:
            int r2 = r2 + 1
            r34 = r4
            r19 = r11
            r38 = r15
            goto L509
        L63a:
            r4 = r34
            r15 = r38
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            int r1 = r4.f23004a
            r2 = 0
        L646:
            if (r2 >= r1) goto L66c
            g5.i0[] r5 = r4.f23006c
            r5 = r5[r2]
            r6 = 0
        L64d:
            int r7 = r5.f10378Y
            if (r6 >= r7) goto L667
            s5.k r7 = r15.f23041u0
            g5.h0[] r8 = r5.f10379Z
            r8 = r8[r6]
            b9.o<g5.h0, s5.k$a> r7 = r7.f23014Y
            java.lang.Object r7 = r7.get(r8)
            s5.k$a r7 = (p325s5.C5971k.a) r7
            r8 = r29
            r8.m12420h(r0, r7, r2)
            int r6 = r6 + 1
            goto L64d
        L667:
            r8 = r29
            int r2 = r2 + 1
            goto L646
        L66c:
            r8 = r29
            g5.i0 r1 = r4.f23009f
            r2 = 0
        L671:
            int r5 = r1.f10378Y
            if (r2 >= r5) goto L68a
            s5.k r5 = r15.f23041u0
            g5.h0[] r6 = r1.f10379Z
            r6 = r6[r2]
            b9.o<g5.h0, s5.k$a> r5 = r5.f23014Y
            java.lang.Object r5 = r5.get(r6)
            s5.k$a r5 = (p325s5.C5971k.a) r5
            r6 = -1
            r8.m12420h(r0, r5, r6)
            int r2 = r2 + 1
            goto L671
        L68a:
            r1 = 0
        L68b:
            int r2 = r0.size()
            if (r1 >= r2) goto L6cb
            java.lang.Object r2 = r0.valueAt(r1)
            android.util.Pair r2 = (android.util.Pair) r2
            int r5 = r0.keyAt(r1)
            java.lang.Object r6 = r2.first
            s5.k$a r6 = (p325s5.C5971k.a) r6
            java.lang.Object r2 = r2.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r7 = 0
        L6a8:
            if (r7 >= r3) goto L6c8
            if (r2 != r7) goto L6bc
            s5.f$a r9 = new s5.f$a
            g5.h0 r10 = r6.f23016Y
            b9.n<java.lang.Integer> r11 = r6.f23017Z
            int[] r11 = p074e9.C1806b.m4544w(r11)
            r9.<init>(r10, r11)
            r35[r7] = r9
            goto L6c5
        L6bc:
            int[] r9 = r4.f23005b
            r9 = r9[r7]
            if (r9 != r5) goto L6c5
            r9 = 0
            r35[r7] = r9
        L6c5:
            int r7 = r7 + 1
            goto L6a8
        L6c8:
            int r1 = r1 + 1
            goto L68b
        L6cb:
            r0 = 0
        L6cc:
            if (r0 >= r3) goto L716
            g5.i0[] r1 = r4.f23006c
            r1 = r1[r0]
            android.util.SparseArray<java.util.Map<g5.i0, s5.d$f>> r2 = r15.f22963I0
            java.lang.Object r2 = r2.get(r0)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L6e4
            boolean r1 = r2.containsKey(r1)
            if (r1 == 0) goto L6e4
            r1 = 1
            goto L6e5
        L6e4:
            r1 = 0
        L6e5:
            if (r1 == 0) goto L713
            g5.i0[] r1 = r4.f23006c
            r1 = r1[r0]
            android.util.SparseArray<java.util.Map<g5.i0, s5.d$f>> r2 = r15.f22963I0
            java.lang.Object r2 = r2.get(r0)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L6fc
            java.lang.Object r2 = r2.get(r1)
            s5.d$f r2 = (p325s5.C5964d.f) r2
            goto L6fd
        L6fc:
            r2 = 0
        L6fd:
            if (r2 != 0) goto L701
            r1 = 0
            goto L711
        L701:
            s5.f$a r5 = new s5.f$a
            int r6 = r2.f22982Y
            g5.h0[] r1 = r1.f10379Z
            r1 = r1[r6]
            int[] r6 = r2.f22983Z
            int r2 = r2.f22984a0
            r5.<init>(r1, r6, r2)
            r1 = r5
        L711:
            r35[r0] = r1
        L713:
            int r0 = r0 + 1
            goto L6cc
        L716:
            r0 = 0
        L717:
            if (r0 >= r3) goto L73f
            int[] r1 = r4.f23005b
            r1 = r1[r0]
            android.util.SparseBooleanArray r2 = r15.f22964J0
            boolean r2 = r2.get(r0)
            if (r2 != 0) goto L734
            b9.p<java.lang.Integer> r2 = r15.f23042v0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L732
            goto L734
        L732:
            r1 = 0
            goto L735
        L734:
            r1 = 1
        L735:
            if (r1 == 0) goto L73b
            r1 = 0
            r35[r0] = r1
            goto L73c
        L73b:
            r1 = 0
        L73c:
            int r0 = r0 + 1
            goto L717
        L73f:
            r1 = 0
            s5.f$b r0 = r8.f22936b
            u5.c r2 = r8.f23067a
            java.util.Objects.requireNonNull(r2)
            s5.a$b r0 = (p325s5.C5961a.b) r0
            java.util.Objects.requireNonNull(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5 = 0
        L752:
            r6 = 0
            if (r5 >= r3) goto L779
            r8 = r35[r5]
            if (r8 == 0) goto L772
            r8 = r35[r5]
            int[] r8 = r8.f23002b
            int r8 = r8.length
            r9 = 1
            if (r8 <= r9) goto L772
            b9.a<java.lang.Object> r8 = p026b9.AbstractC0714n.f3979Z
            b9.n$a r8 = new b9.n$a
            r8.<init>()
            s5.a$a r9 = new s5.a$a
            r9.<init>(r6, r6)
            r8.m2316b(r9)
            goto L773
        L772:
            r8 = r1
        L773:
            r0.add(r8)
            int r5 = r5 + 1
            goto L752
        L779:
            long[][] r5 = new long[r3][]
            r8 = 0
        L77c:
            if (r8 >= r3) goto L7af
            r9 = r35[r8]
            if (r9 != 0) goto L788
            r10 = 0
            long[] r9 = new long[r10]
            r5[r8] = r9
            goto L7ac
        L788:
            int[] r10 = r9.f23002b
            int r10 = r10.length
            long[] r10 = new long[r10]
            r5[r8] = r10
            r10 = 0
        L790:
            int[] r11 = r9.f23002b
            int r12 = r11.length
            if (r10 >= r12) goto L7a7
            r12 = r5[r8]
            g5.h0 r13 = r9.f23001a
            r11 = r11[r10]
            f4.e0[] r13 = r13.f10373Z
            r11 = r13[r11]
            int r11 = r11.f8892f0
            long r13 = (long) r11
            r12[r10] = r13
            int r10 = r10 + 1
            goto L790
        L7a7:
            r9 = r5[r8]
            java.util.Arrays.sort(r9)
        L7ac:
            int r8 = r8 + 1
            goto L77c
        L7af:
            int[] r8 = new int[r3]
            long[] r9 = new long[r3]
            r10 = 0
        L7b4:
            if (r10 >= r3) goto L7c7
            r11 = r5[r10]
            int r11 = r11.length
            if (r11 != 0) goto L7bd
            r13 = r6
            goto L7c2
        L7bd:
            r11 = r5[r10]
            r12 = 0
            r13 = r11[r12]
        L7c2:
            r9[r10] = r13
            int r10 = r10 + 1
            goto L7b4
        L7c7:
            p325s5.C5961a.m12404m(r0, r9)
            b9.a0 r6 = p026b9.C0689a0.f3895Y
            java.lang.String r7 = "expectedValuesPerKey"
            r10 = 2
            p026b9.C0720t.m2328b(r10, r7)
            java.util.TreeMap r7 = new java.util.TreeMap
            r7.<init>(r6)
            b9.x r6 = new b9.x
            r6.<init>(r10)
            b9.y r10 = new b9.y
            r10.<init>(r7, r6)
            r6 = 0
        L7e2:
            if (r6 >= r3) goto L887
            r7 = r5[r6]
            int r7 = r7.length
            r11 = 1
            if (r7 > r11) goto L7ed
            r14 = r2
            goto L881
        L7ed:
            r7 = r5[r6]
            int r7 = r7.length
            double[] r11 = new double[r7]
            r12 = 0
        L7f3:
            r13 = r5[r6]
            int r13 = r13.length
            r16 = 0
            if (r12 >= r13) goto L817
            r13 = r5[r6]
            r18 = r13[r12]
            r13 = -1
            int r20 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r20 != 0) goto L806
            r14 = r2
            goto L810
        L806:
            r13 = r5[r6]
            r14 = r2
            r1 = r13[r12]
            double r1 = (double) r1
            double r16 = java.lang.Math.log(r1)
        L810:
            r11[r12] = r16
            int r12 = r12 + 1
            r2 = r14
            r1 = 0
            goto L7f3
        L817:
            r14 = r2
            int r7 = r7 + (-1)
            r1 = r11[r7]
            r12 = 0
            r18 = r11[r12]
            double r1 = r1 - r18
            r12 = 0
        L822:
            if (r12 >= r7) goto L881
            r18 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r20 = r11[r12]
            int r12 = r12 + 1
            r22 = r11[r12]
            double r20 = r20 + r22
            double r20 = r20 * r18
            int r13 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r13 != 0) goto L837
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L83e
        L837:
            r13 = 0
            r18 = r11[r13]
            double r20 = r20 - r18
            double r18 = r20 / r1
        L83e:
            java.lang.Double r13 = java.lang.Double.valueOf(r18)
            r18 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.util.Map<K, java.util.Collection<V>> r2 = r10.f3915b0
            java.lang.Object r2 = r2.get(r13)
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 != 0) goto L872
            java.util.Collection r2 = r10.mo2276e()
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L86a
            int r1 = r10.f3916c0
            r20 = 1
            int r1 = r1 + 1
            r10.f3916c0 = r1
            java.util.Map<K, java.util.Collection<V>> r1 = r10.f3915b0
            r1.put(r13, r2)
            goto L87e
        L86a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "New Collection violated the Collection spec"
            r0.<init>(r1)
            throw r0
        L872:
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L87e
            int r1 = r10.f3916c0
            r2 = 1
            int r1 = r1 + r2
            r10.f3916c0 = r1
        L87e:
            r1 = r18
            goto L822
        L881:
            int r6 = r6 + 1
            r2 = r14
            r1 = 0
            goto L7e2
        L887:
            r14 = r2
            java.util.Collection<V> r1 = r10.f3955Z
            if (r1 != 0) goto L893
            b9.g$a r1 = new b9.g$a
            r1.<init>(r10)
            r10.f3955Z = r1
        L893:
            b9.n r1 = p026b9.AbstractC0714n.m2311w(r1)
            r2 = 0
        L898:
            int r6 = r1.size()
            if (r2 >= r6) goto L8ba
            java.lang.Object r6 = r1.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = r8[r6]
            r10 = 1
            int r7 = r7 + r10
            r8[r6] = r7
            r10 = r5[r6]
            r11 = r10[r7]
            r9[r6] = r11
            p325s5.C5961a.m12404m(r0, r9)
            int r2 = r2 + 1
            goto L898
        L8ba:
            r1 = 0
        L8bb:
            if (r1 >= r3) goto L8ce
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L8cb
            r5 = r9[r1]
            r7 = 2
            long r5 = r5 * r7
            r9[r1] = r5
        L8cb:
            int r1 = r1 + 1
            goto L8bb
        L8ce:
            p325s5.C5961a.m12404m(r0, r9)
            r1 = 4
            java.lang.String r2 = "initialCapacity"
            p026b9.C0720t.m2328b(r1, r2)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r7 = r5
            r5 = 0
            r6 = 0
        L8dc:
            int r8 = r0.size()
            if (r5 >= r8) goto L908
            java.lang.Object r8 = r0.get(r5)
            b9.n$a r8 = (p026b9.AbstractC0714n.a) r8
            if (r8 != 0) goto L8ed
            b9.n<java.lang.Object> r8 = p026b9.C0693c0.f3898c0
            goto L8f1
        L8ed:
            b9.n r8 = r8.m2317c()
        L8f1:
            java.util.Objects.requireNonNull(r8)
            int r9 = r6 + 1
            int r10 = r7.length
            if (r10 >= r9) goto L902
            int r10 = r7.length
            int r10 = p026b9.AbstractC0710l.b.m2305a(r10, r9)
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r10)
        L902:
            r7[r6] = r8
            int r5 = r5 + 1
            r6 = r9
            goto L8dc
        L908:
            b9.n r0 = p026b9.AbstractC0714n.m2309q(r7, r6)
            s5.f[] r5 = new p325s5.InterfaceC5966f[r3]
            r6 = 0
        L90f:
            if (r6 >= r3) goto L966
            r7 = r35[r6]
            if (r7 == 0) goto L963
            int[] r8 = r7.f23002b
            int r9 = r8.length
            if (r9 != 0) goto L91b
            goto L963
        L91b:
            int r9 = r8.length
            r10 = 1
            if (r9 != r10) goto L92c
            s5.g r9 = new s5.g
            g5.h0 r10 = r7.f23001a
            r11 = 0
            r8 = r8[r11]
            int r7 = r7.f23003c
            r9.<init>(r10, r8, r7)
            goto L961
        L92c:
            g5.h0 r9 = r7.f23001a
            r37 = r9
            int r7 = r7.f23003c
            r39 = r7
            r7 = r0
            b9.c0 r7 = (p026b9.C0693c0) r7
            java.lang.Object r7 = r7.get(r6)
            r51 = r7
            b9.n r51 = (p026b9.AbstractC0714n) r51
            s5.a r9 = new s5.a
            r36 = r9
            r7 = 10000(0x2710, float:1.4013E-41)
            long r10 = (long) r7
            r41 = r10
            r7 = 25000(0x61a8, float:3.5032E-41)
            long r10 = (long) r7
            r43 = r10
            r45 = r10
            v5.c r52 = p371v5.InterfaceC6553c.f25635a
            r47 = 1279(0x4ff, float:1.792E-42)
            r48 = 719(0x2cf, float:1.008E-42)
            r49 = 1060320051(0x3f333333, float:0.7)
            r50 = 1061158912(0x3f400000, float:0.75)
            r38 = r8
            r40 = r14
            r36.<init>(r37, r38, r39, r40, r41, r43, r45, r47, r48, r49, r50, r51, r52)
        L961:
            r5[r6] = r9
        L963:
            int r6 = r6 + 1
            goto L90f
        L966:
            f4.g1[] r0 = new p088f4.C2010g1[r3]
            r6 = 0
        L969:
            if (r6 >= r3) goto L9a2
            int[] r7 = r4.f23005b
            r7 = r7[r6]
            android.util.SparseBooleanArray r8 = r15.f22964J0
            boolean r8 = r8.get(r6)
            if (r8 != 0) goto L986
            b9.p<java.lang.Integer> r8 = r15.f23042v0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L984
            goto L986
        L984:
            r7 = 0
            goto L987
        L986:
            r7 = 1
        L987:
            if (r7 != 0) goto L996
            int[] r7 = r4.f23005b
            r7 = r7[r6]
            r8 = -2
            if (r7 == r8) goto L994
            r7 = r5[r6]
            if (r7 == 0) goto L996
        L994:
            r7 = 1
            goto L997
        L996:
            r7 = 0
        L997:
            if (r7 == 0) goto L99c
            f4.g1 r7 = p088f4.C2010g1.f8958b
            goto L99d
        L99c:
            r7 = 0
        L99d:
            r0[r6] = r7
            int r6 = r6 + 1
            goto L969
        L9a2:
            boolean r3 = r15.f22961G0
            if (r3 == 0) goto La12
            r3 = 0
            r6 = -1
            r8 = -1
        L9a9:
            int r7 = r4.f23004a
            if (r3 >= r7) goto L9fb
            int[] r7 = r4.f23005b
            r7 = r7[r3]
            r9 = r5[r3]
            r10 = 1
            if (r7 == r10) goto L9bc
            r10 = 2
            if (r7 != r10) goto L9ba
            goto L9bd
        L9ba:
            r7 = -1
            goto L9f8
        L9bc:
            r10 = 2
        L9bd:
            if (r9 == 0) goto L9ba
            r11 = r31[r3]
            g5.i0[] r12 = r4.f23006c
            r12 = r12[r3]
            g5.h0 r13 = r9.mo8144e()
            int r12 = r12.m6019a(r13)
            r13 = 0
        L9ce:
            int r14 = r9.length()
            if (r13 >= r14) goto L9e6
            r14 = r11[r12]
            int r15 = r9.mo12411d(r13)
            r14 = r14[r15]
            r15 = 32
            r14 = r14 & r15
            if (r14 == r15) goto L9e3
            r9 = 0
            goto L9e7
        L9e3:
            int r13 = r13 + 1
            goto L9ce
        L9e6:
            r9 = 1
        L9e7:
            if (r9 == 0) goto L9ba
            r9 = 1
            if (r7 != r9) goto L9f2
            r7 = -1
            if (r6 == r7) goto L9f0
            goto L9f5
        L9f0:
            r6 = r3
            goto L9f8
        L9f2:
            r7 = -1
            if (r8 == r7) goto L9f7
        L9f5:
            r3 = 0
            goto L9fd
        L9f7:
            r8 = r3
        L9f8:
            int r3 = r3 + 1
            goto L9a9
        L9fb:
            r7 = -1
            r3 = 1
        L9fd:
            if (r6 == r7) goto La03
            if (r8 == r7) goto La03
            r7 = 1
            goto La04
        La03:
            r7 = 0
        La04:
            r3 = r3 & r7
            if (r3 == 0) goto La12
            f4.g1 r3 = new f4.g1
            r7 = 1
            r3.<init>(r7)
            r0[r6] = r3
            r0[r8] = r3
            goto La13
        La12:
            r7 = 1
        La13:
            android.util.Pair r0 = android.util.Pair.create(r0, r5)
            java.lang.Object r3 = r0.second
            s5.i[] r3 = (p325s5.InterfaceC5969i[]) r3
            p026b9.C0720t.m2328b(r1, r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r1 = 0
            r5 = 0
        La23:
            int r6 = r4.f23004a
            if (r1 >= r6) goto La85
            g5.i0[] r6 = r4.f23006c
            r6 = r6[r1]
            r8 = r3[r1]
            r9 = r5
            r5 = r2
            r2 = 0
        La30:
            int r10 = r6.f10378Y
            if (r2 >= r10) goto La7f
            g5.h0[] r10 = r6.f10379Z
            r10 = r10[r2]
            int r11 = r10.f10372Y
            int[] r12 = new int[r11]
            boolean[] r11 = new boolean[r11]
            r13 = 0
        La3f:
            int r14 = r10.f10372Y
            if (r13 >= r14) goto La61
            int r14 = r4.m12438a(r1, r2, r13)
            r12[r13] = r14
            if (r8 == 0) goto La5a
            g5.h0 r14 = r8.mo8144e()
            if (r14 != r10) goto La5a
            int r14 = r8.mo8145l(r13)
            r15 = -1
            if (r14 == r15) goto La5b
            r14 = 1
            goto La5c
        La5a:
            r15 = -1
        La5b:
            r14 = 0
        La5c:
            r11[r13] = r14
            int r13 = r13 + 1
            goto La3f
        La61:
            r15 = -1
            int[] r13 = r4.f23005b
            r13 = r13[r1]
            f4.o1$a r14 = new f4.o1$a
            r14.<init>(r10, r12, r13, r11)
            int r10 = r9 + 1
            int r11 = r5.length
            if (r11 >= r10) goto La79
            int r11 = r5.length
            int r11 = p026b9.AbstractC0710l.b.m2305a(r11, r10)
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r11)
        La79:
            r5[r9] = r14
            int r2 = r2 + 1
            r9 = r10
            goto La30
        La7f:
            r15 = -1
            int r1 = r1 + 1
            r2 = r5
            r5 = r9
            goto La23
        La85:
            g5.i0 r1 = r4.f23009f
            r3 = r2
            r2 = 0
        La89:
            int r6 = r1.f10378Y
            if (r2 >= r6) goto Lac0
            g5.h0[] r6 = r1.f10379Z
            r6 = r6[r2]
            int r7 = r6.f10372Y
            int[] r7 = new int[r7]
            r8 = 0
            java.util.Arrays.fill(r7, r8)
            f4.e0[] r9 = r6.f10373Z
            r9 = r9[r8]
            java.lang.String r9 = r9.f8896j0
            int r9 = p371v5.C6567q.m13377g(r9)
            int r10 = r6.f10372Y
            boolean[] r10 = new boolean[r10]
            f4.o1$a r11 = new f4.o1$a
            r11.<init>(r6, r7, r9, r10)
            int r6 = r5 + 1
            int r7 = r3.length
            if (r7 >= r6) goto Laba
            int r7 = r3.length
            int r7 = p026b9.AbstractC0710l.b.m2305a(r7, r6)
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r7)
        Laba:
            r3[r5] = r11
            int r2 = r2 + 1
            r5 = r6
            goto La89
        Lac0:
            f4.o1 r1 = new f4.o1
            b9.n r2 = p026b9.AbstractC0714n.m2309q(r3, r5)
            r1.<init>(r2)
            s5.n r2 = new s5.n
            java.lang.Object r3 = r0.first
            f4.g1[] r3 = (p088f4.C2010g1[]) r3
            java.lang.Object r0 = r0.second
            s5.f[] r0 = (p325s5.InterfaceC5966f[]) r0
            r2.<init>(r3, r0, r1, r4)
            return r2
    }
}
