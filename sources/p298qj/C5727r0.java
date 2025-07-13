package p298qj;

/* renamed from: qj.r0 */
/* loaded from: classes.dex */
public class C5727r0 {

    /* renamed from: a */
    public static final int[] f22107a = null;

    static {
            r0 = 17
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511} // fill-array
            p298qj.C5727r0.f22107a = r0
            return
    }

    /* renamed from: a */
    public static void m12037a(int[] r2, int[] r3, int[] r4) {
            r0 = 16
            int r1 = p085f1.AbstractC1972m.m4992a(r0, r2, r3, r4)
            r2 = r2[r0]
            int r1 = r1 + r2
            r2 = r3[r0]
            int r1 = r1 + r2
            r2 = 511(0x1ff, float:7.16E-43)
            if (r1 > r2) goto L1a
            if (r1 != r2) goto L21
            int[] r3 = p298qj.C5727r0.f22107a
            boolean r3 = p085f1.AbstractC1972m.m5011p(r0, r4, r3)
            if (r3 == 0) goto L21
        L1a:
            int r3 = p085f1.AbstractC1972m.m5021z(r0, r4)
            int r3 = r3 + r1
            r1 = r3 & 511(0x1ff, float:7.16E-43)
        L21:
            r4[r0] = r1
            return
    }

    /* renamed from: b */
    public static void m12038b(int[] r55, int[] r56) {
            r6 = r56
            tj.AbstractC6255a.m12836D(r55, r56)
            r0 = 8
            r1 = r55[r0]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 16
            r7 = 7
            r8 = 16
            r9 = 0
        L16:
            int r10 = r7 + (-1)
            int r7 = r7 + r0
            r0 = r55[r7]
            long r11 = (long) r0
            long r3 = r3 & r11
            long r3 = r3 * r3
            int r8 = r8 + (-1)
            int r0 = r5 + r8
            int r7 = r9 << 31
            r9 = 33
            long r11 = r3 >>> r9
            int r12 = (int) r11
            r7 = r7 | r12
            r6[r0] = r7
            int r8 = r8 + (-1)
            int r0 = r5 + r8
            r7 = 1
            long r11 = r3 >>> r7
            int r7 = (int) r11
            r6[r0] = r7
            int r0 = (int) r3
            if (r10 > 0) goto L34e
            long r3 = r1 * r1
            int r0 = r0 << 31
            long r7 = (long) r0
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r10
            long r9 = r3 >>> r9
            long r7 = r7 | r9
            int r0 = (int) r3
            r6[r5] = r0
            r0 = 32
            long r3 = r3 >>> r0
            int r4 = (int) r3
            r3 = r4 & 1
            r4 = 9
            r4 = r55[r4]
            long r4 = (long) r4
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r9
            r11 = 18
            r12 = r6[r11]
            long r12 = (long) r12
            long r9 = r9 & r12
            long r12 = r4 * r1
            long r12 = r12 + r7
            int r7 = (int) r12
            r8 = 17
            int r14 = r7 << 1
            r3 = r3 | r14
            r6[r8] = r3
            int r3 = r7 >>> 31
            long r7 = r12 >>> r0
            long r9 = r9 + r7
            r0 = 10
            r0 = r55[r0]
            long r7 = (long) r0
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r12
            r0 = 19
            r0 = r6[r0]
            long r14 = (long) r0
            long r17 = r14 & r12
            r0 = 20
            r0 = r6[r0]
            long r14 = (long) r0
            long r19 = r14 & r12
            long r12 = r7 * r1
            long r12 = r12 + r9
            int r0 = (int) r12
            int r9 = r0 << 1
            r3 = r3 | r9
            r6[r11] = r3
            int r0 = r0 >>> 31
            r3 = 32
            long r15 = r12 >>> r3
            r11 = r7
            r13 = r4
            long r9 = p085f1.C1971l.m4965a(r11, r13, r15, r17)
            long r11 = r9 >>> r3
            long r19 = r19 + r11
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r11
            r3 = 11
            r3 = r55[r3]
            long r13 = (long) r3
            long r29 = r13 & r11
            r3 = 21
            r3 = r6[r3]
            long r13 = (long) r3
            long r13 = r13 & r11
            r3 = 32
            long r15 = r19 >>> r3
            long r13 = r13 + r15
            long r17 = r19 & r11
            r31 = 22
            r15 = r6[r31]
            r32 = r7
            long r7 = (long) r15
            long r7 = r7 & r11
            long r15 = r13 >>> r3
            long r7 = r7 + r15
            long r20 = r13 & r11
            long r11 = r29 * r1
            long r11 = r11 + r9
            int r9 = (int) r11
            int r10 = r9 << 1
            r0 = r0 | r10
            r10 = 19
            r6[r10] = r0
            int r0 = r9 >>> 31
            long r15 = r11 >>> r3
            r11 = r29
            r13 = r4
            long r9 = p085f1.C1971l.m4965a(r11, r13, r15, r17)
            long r18 = r9 >>> r3
            r14 = r29
            r16 = r32
            long r11 = p085f1.C1971l.m4965a(r14, r16, r18, r20)
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r13
            long r15 = r11 >>> r3
            long r7 = r7 + r15
            long r17 = r11 & r13
            r3 = 12
            r3 = r55[r3]
            long r11 = (long) r3
            long r34 = r11 & r13
            r3 = 23
            r3 = r6[r3]
            long r11 = (long) r3
            long r11 = r11 & r13
            r3 = 32
            long r15 = r7 >>> r3
            long r11 = r11 + r15
            long r20 = r7 & r13
            r3 = 24
            r3 = r6[r3]
            long r7 = (long) r3
            long r7 = r7 & r13
            r3 = 32
            long r15 = r11 >>> r3
            long r7 = r7 + r15
            long r27 = r11 & r13
            long r11 = r34 * r1
            long r11 = r11 + r9
            int r9 = (int) r11
            int r10 = r9 << 1
            r0 = r0 | r10
            r10 = 20
            r6[r10] = r0
            int r0 = r9 >>> 31
            long r15 = r11 >>> r3
            r11 = r34
            r13 = r4
            long r9 = p085f1.C1971l.m4965a(r11, r13, r15, r17)
            long r18 = r9 >>> r3
            r14 = r34
            r16 = r32
            long r11 = p085f1.C1971l.m4965a(r14, r16, r18, r20)
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r13
            long r25 = r11 >>> r3
            r21 = r34
            r23 = r29
            long r15 = p085f1.C1971l.m4965a(r21, r23, r25, r27)
            long r17 = r11 & r13
            long r11 = r15 >>> r3
            long r7 = r7 + r11
            long r20 = r15 & r13
            r3 = 13
            r3 = r55[r3]
            long r11 = (long) r3
            long r44 = r11 & r13
            r3 = 25
            r11 = r6[r3]
            long r11 = (long) r11
            long r11 = r11 & r13
            r46 = 32
            long r15 = r7 >>> r46
            long r11 = r11 + r15
            long r27 = r7 & r13
            r7 = 26
            r8 = r6[r7]
            long r7 = (long) r8
            long r7 = r7 & r13
            long r15 = r11 >>> r46
            long r7 = r7 + r15
            long r36 = r11 & r13
            long r11 = r44 * r1
            long r11 = r11 + r9
            int r9 = (int) r11
            int r10 = r9 << 1
            r0 = r0 | r10
            r10 = 21
            r6[r10] = r0
            int r0 = r9 >>> 31
            long r15 = r11 >>> r46
            r11 = r44
            r13 = r4
            long r9 = p085f1.C1971l.m4965a(r11, r13, r15, r17)
            long r18 = r9 >>> r46
            r14 = r44
            r16 = r32
            long r11 = p085f1.C1971l.m4965a(r14, r16, r18, r20)
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r13
            long r25 = r11 >>> r46
            r21 = r44
            long r15 = p085f1.C1971l.m4965a(r21, r23, r25, r27)
            long r17 = r11 & r13
            long r23 = r15 >>> r46
            r19 = r44
            r21 = r34
            r25 = r36
            long r11 = p085f1.C1971l.m4965a(r19, r21, r23, r25)
            long r20 = r15 & r13
            long r15 = r11 >>> r46
            long r7 = r7 + r15
            long r27 = r11 & r13
            r11 = 14
            r11 = r55[r11]
            long r11 = (long) r11
            long r47 = r11 & r13
            r11 = 27
            r11 = r6[r11]
            long r11 = (long) r11
            long r11 = r11 & r13
            long r15 = r7 >>> r46
            long r11 = r11 + r15
            long r7 = r7 & r13
            r15 = 28
            r15 = r6[r15]
            r49 = r4
            long r3 = (long) r15
            long r3 = r3 & r13
            long r15 = r11 >>> r46
            long r3 = r3 + r15
            long r42 = r11 & r13
            long r11 = r47 * r1
            long r11 = r11 + r9
            int r9 = (int) r11
            int r10 = r9 << 1
            r0 = r0 | r10
            r6[r31] = r0
            int r0 = r9 >>> 31
            long r15 = r11 >>> r46
            r11 = r47
            r13 = r49
            long r9 = p085f1.C1971l.m4965a(r11, r13, r15, r17)
            long r18 = r9 >>> r46
            r14 = r47
            r16 = r32
            long r11 = p085f1.C1971l.m4965a(r14, r16, r18, r20)
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r13
            long r25 = r11 >>> r46
            r21 = r47
            r23 = r29
            long r15 = p085f1.C1971l.m4965a(r21, r23, r25, r27)
            long r17 = r11 & r13
            long r23 = r15 >>> r46
            r19 = r47
            r21 = r34
            r25 = r7
            long r7 = p085f1.C1971l.m4965a(r19, r21, r23, r25)
            long r20 = r15 & r13
            long r40 = r7 >>> r46
            r36 = r47
            r38 = r44
            long r11 = p085f1.C1971l.m4965a(r36, r38, r40, r42)
            long r27 = r7 & r13
            long r7 = r11 >>> r46
            long r3 = r3 + r7
            long r7 = r11 & r13
            r11 = 15
            r11 = r55[r11]
            long r11 = (long) r11
            long r51 = r11 & r13
            r31 = 29
            r11 = r6[r31]
            long r11 = (long) r11
            long r11 = r11 & r13
            long r15 = r3 >>> r46
            long r11 = r11 + r15
            long r42 = r3 & r13
            r3 = 30
            r4 = r6[r3]
            long r3 = (long) r4
            long r3 = r3 & r13
            long r15 = r11 >>> r46
            long r3 = r3 + r15
            long r53 = r11 & r13
            long r1 = r1 * r51
            long r1 = r1 + r9
            int r9 = (int) r1
            int r10 = r9 << 1
            r0 = r0 | r10
            r10 = 23
            r6[r10] = r0
            int r0 = r9 >>> 31
            long r15 = r1 >>> r46
            r11 = r51
            r13 = r49
            long r1 = p085f1.C1971l.m4965a(r11, r13, r15, r17)
            long r18 = r1 >>> r46
            r14 = r51
            r16 = r32
            long r9 = p085f1.C1971l.m4965a(r14, r16, r18, r20)
            long r25 = r9 >>> r46
            r21 = r51
            r23 = r29
            long r11 = p085f1.C1971l.m4965a(r21, r23, r25, r27)
            long r23 = r11 >>> r46
            r19 = r51
            r21 = r34
            r25 = r7
            long r7 = p085f1.C1971l.m4965a(r19, r21, r23, r25)
            long r40 = r7 >>> r46
            r36 = r51
            long r13 = p085f1.C1971l.m4965a(r36, r38, r40, r42)
            long r40 = r13 >>> r46
            r38 = r47
            r42 = r53
            long r5 = p085f1.C1971l.m4965a(r36, r38, r40, r42)
            long r16 = r5 >>> r46
            long r3 = r3 + r16
            int r2 = (int) r1
            int r1 = r2 << 1
            r0 = r0 | r1
            r1 = 24
            r16 = r3
            r3 = r5
            r6 = r56
            r6[r1] = r0
            r0 = 31
            int r1 = r2 >>> 31
            int r2 = (int) r9
            int r5 = r2 << 1
            r1 = r1 | r5
            r5 = 25
            r6[r5] = r1
            int r1 = r2 >>> 31
            int r2 = (int) r11
            int r5 = r2 << 1
            r1 = r1 | r5
            r5 = 26
            r6[r5] = r1
            int r1 = r2 >>> 31
            int r2 = (int) r7
            int r5 = r2 << 1
            r1 = r1 | r5
            r5 = 27
            r6[r5] = r1
            int r1 = r2 >>> 31
            int r2 = (int) r13
            int r5 = r2 << 1
            r1 = r1 | r5
            r5 = 28
            r6[r5] = r1
            int r1 = r2 >>> 31
            int r2 = (int) r3
            int r3 = r2 << 1
            r1 = r1 | r3
            r6[r31] = r1
            int r1 = r2 >>> 31
            r3 = r16
            int r2 = (int) r3
            int r5 = r2 << 1
            r1 = r1 | r5
            r5 = 30
            r6[r5] = r1
            int r1 = r2 >>> 31
            r2 = r6[r0]
            r5 = 32
            long r3 = r3 >>> r5
            int r4 = (int) r3
            int r2 = r2 + r4
            int r2 = r2 << 1
            r1 = r1 | r2
            r6[r0] = r1
            r0 = 8
            r1 = 16
            int r2 = tj.AbstractC6255a.m12848e(r6, r0, r6, r1)
            r3 = 0
            int r3 = tj.AbstractC6255a.m12847d(r6, r3, r6, r0, r3)
            int r3 = r3 + r2
            r4 = 24
            int r1 = tj.AbstractC6255a.m12847d(r6, r4, r6, r1, r3)
            int r7 = r1 + r2
            int[] r8 = new int[r0]
            r1 = 8
            r3 = 0
            r5 = 0
            r0 = r55
            r2 = r55
            r4 = r8
            tj.AbstractC6255a.m12853j(r0, r1, r2, r3, r4, r5)
            r0 = 16
            int[] r1 = new int[r0]
            tj.AbstractC6255a.m12836D(r8, r1)
            r2 = 8
            int r1 = p085f1.AbstractC1972m.m4988W(r0, r1, r3, r6, r2)
            int r1 = r1 + r7
            r2 = 24
            r4 = 32
            p085f1.AbstractC1972m.m5005j(r4, r1, r6, r2)
            r4 = r55[r0]
            int r0 = r4 << 1
            long r0 = (long) r0
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r0 & r11
            r0 = 0
            r2 = 0
        L329:
            int r5 = r3 + r2
            r5 = r55[r5]
            long r7 = (long) r5
            long r7 = r7 & r11
            long r7 = r7 * r13
            int r5 = r2 + 16
            r9 = r6[r5]
            long r9 = (long) r9
            long r9 = r9 & r11
            long r7 = r7 + r9
            long r7 = r7 + r0
            int r0 = (int) r7
            r6[r5] = r0
            r0 = 32
            long r7 = r7 >>> r0
            int r2 = r2 + 1
            r1 = 16
            if (r2 < r1) goto L34c
            int r1 = (int) r7
            int r4 = r4 * r4
            int r4 = r4 + r1
            r6[r0] = r4
            return
        L34c:
            r0 = r7
            goto L329
        L34e:
            r3 = 8
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = 16
            r9 = r0
            r3 = r4
            r7 = r10
            r0 = 8
            r5 = 16
            goto L16
    }

    /* renamed from: c */
    public static void m12039c(int[] r34, int[] r35, int[] r36) {
            r6 = r34
            r7 = r35
            r0 = 33
            int[] r8 = new int[r0]
            tj.AbstractC6255a.m12833A(r6, r7, r8)
            r9 = 8
            r0 = r7[r9]
            long r0 = (long) r0
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r10
            r2 = 9
            r2 = r7[r2]
            long r2 = (long) r2
            long r2 = r2 & r10
            r4 = 10
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r10
            r12 = 11
            r12 = r7[r12]
            long r12 = (long) r12
            long r12 = r12 & r10
            r14 = 12
            r14 = r7[r14]
            long r14 = (long) r14
            long r14 = r14 & r10
            r16 = 13
            r9 = r7[r16]
            r17 = r14
            long r14 = (long) r9
            long r14 = r14 & r10
            r9 = 14
            r9 = r7[r9]
            r19 = r14
            long r14 = (long) r9
            long r14 = r14 & r10
            r9 = 15
            r9 = r7[r9]
            r21 = r14
            long r14 = (long) r9
            long r14 = r14 & r10
            r9 = 8
            r7 = r6[r9]
            long r6 = (long) r7
            long r6 = r6 & r10
            long r23 = r6 * r0
            r25 = 0
            long r10 = r23 + r25
            int r9 = (int) r10
            r23 = r0
            r0 = 16
            r8[r0] = r9
            r9 = 32
            long r10 = r10 >>> r9
            long r29 = r6 * r2
            long r10 = r29 + r10
            r1 = 17
            int r0 = (int) r10
            r8[r1] = r0
            long r0 = r10 >>> r9
            long r10 = r6 * r4
            long r10 = r10 + r0
            r0 = 18
            int r1 = (int) r10
            r8[r0] = r1
            long r0 = r10 >>> r9
            long r10 = r6 * r12
            long r10 = r10 + r0
            r0 = 19
            int r1 = (int) r10
            r8[r0] = r1
            long r0 = r10 >>> r9
            long r10 = r6 * r17
            long r10 = r10 + r0
            r0 = 20
            int r1 = (int) r10
            r8[r0] = r1
            long r0 = r10 >>> r9
            long r10 = r6 * r19
            long r10 = r10 + r0
            r0 = 21
            int r1 = (int) r10
            r8[r0] = r1
            long r0 = r10 >>> r9
            long r10 = r6 * r21
            long r10 = r10 + r0
            r0 = 22
            int r1 = (int) r10
            r8[r0] = r1
            long r0 = r10 >>> r9
            long r6 = r6 * r14
            long r6 = r6 + r0
            r0 = 23
            int r1 = (int) r6
            r8[r0] = r1
            long r0 = r6 >>> r9
            int r1 = (int) r0
            r6 = 24
            r8[r6] = r1
            r7 = 1
            r0 = 1
            r1 = 16
        Lac:
            r10 = 8
            if (r0 >= r10) goto L15f
            int r1 = r1 + r7
            int r10 = r0 + 8
            r10 = r34[r10]
            long r10 = (long) r10
            r27 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r27
            long r29 = r10 * r23
            int r31 = r1 + 0
            r7 = r8[r31]
            long r6 = (long) r7
            long r6 = r6 & r27
            long r29 = r29 + r6
            long r6 = r29 + r25
            r29 = r0
            int r0 = (int) r6
            r8[r31] = r0
            long r6 = r6 >>> r9
            long r30 = r10 * r2
            int r0 = r1 + 1
            r9 = r8[r0]
            r32 = r2
            long r2 = (long) r9
            long r2 = r2 & r27
            long r30 = r30 + r2
            long r2 = r30 + r6
            int r6 = (int) r2
            r8[r0] = r6
            r0 = 32
            long r2 = r2 >>> r0
            long r6 = r10 * r4
            int r9 = r1 + 2
            r0 = r8[r9]
            r30 = r4
            long r4 = (long) r0
            long r4 = r4 & r27
            long r6 = r6 + r4
            long r6 = r6 + r2
            int r0 = (int) r6
            r8[r9] = r0
            r0 = 32
            long r2 = r6 >>> r0
            long r4 = r10 * r12
            int r6 = r1 + 3
            r7 = r8[r6]
            r9 = r1
            long r0 = (long) r7
            long r0 = r0 & r27
            long r4 = r4 + r0
            long r4 = r4 + r2
            int r0 = (int) r4
            r8[r6] = r0
            r0 = 32
            long r1 = r4 >>> r0
            long r3 = r10 * r17
            int r5 = r9 + 4
            r6 = r8[r5]
            long r6 = (long) r6
            long r6 = r6 & r27
            long r3 = r3 + r6
            long r3 = r3 + r1
            int r1 = (int) r3
            r8[r5] = r1
            long r1 = r3 >>> r0
            long r3 = r10 * r19
            int r5 = r9 + 5
            r6 = r8[r5]
            long r6 = (long) r6
            long r6 = r6 & r27
            long r3 = r3 + r6
            long r3 = r3 + r1
            int r1 = (int) r3
            r8[r5] = r1
            long r1 = r3 >>> r0
            long r3 = r10 * r21
            int r5 = r9 + 6
            r6 = r8[r5]
            long r6 = (long) r6
            long r6 = r6 & r27
            long r3 = r3 + r6
            long r3 = r3 + r1
            int r1 = (int) r3
            r8[r5] = r1
            long r1 = r3 >>> r0
            long r10 = r10 * r14
            int r3 = r9 + 7
            r4 = r8[r3]
            long r4 = (long) r4
            long r4 = r4 & r27
            long r10 = r10 + r4
            long r10 = r10 + r1
            int r1 = (int) r10
            r8[r3] = r1
            long r1 = r10 >>> r0
            int r0 = r9 + 8
            int r2 = (int) r1
            r8[r0] = r2
            int r0 = r29 + 1
            r1 = r9
            r4 = r30
            r2 = r32
            r6 = 24
            r7 = 1
            r9 = 32
            goto Lac
        L15f:
            r0 = 16
            r1 = 8
            int r2 = tj.AbstractC6255a.m12848e(r8, r1, r8, r0)
            r6 = 0
            int r3 = tj.AbstractC6255a.m12847d(r8, r6, r8, r1, r6)
            int r3 = r3 + r2
            r4 = 24
            int r3 = tj.AbstractC6255a.m12847d(r8, r4, r8, r0, r3)
            int r7 = r3 + r2
            int[] r9 = new int[r1]
            int[] r10 = new int[r1]
            r11 = 8
            r12 = 0
            r13 = 0
            r1 = 8
            r3 = 0
            r5 = 0
            r14 = 16
            r0 = r34
            r2 = r34
            r4 = r9
            boolean r15 = tj.AbstractC6255a.m12853j(r0, r1, r2, r3, r4, r5)
            r0 = r35
            r1 = r11
            r2 = r35
            r3 = r12
            r4 = r10
            r5 = r13
            boolean r0 = tj.AbstractC6255a.m12853j(r0, r1, r2, r3, r4, r5)
            if (r15 == r0) goto L19c
            r0 = 1
            goto L19d
        L19c:
            r0 = 0
        L19d:
            int[] r1 = new int[r14]
            tj.AbstractC6255a.m12833A(r9, r10, r1)
            if (r0 == 0) goto L1ab
            r0 = 8
            int r0 = p085f1.AbstractC1972m.m5001f(r14, r1, r6, r8, r0)
            goto L1b1
        L1ab:
            r0 = 8
            int r0 = p085f1.AbstractC1972m.m4988W(r14, r1, r6, r8, r0)
        L1b1:
            int r7 = r7 + r0
            r0 = 24
            r1 = 32
            p085f1.AbstractC1972m.m5005j(r1, r7, r8, r0)
            r0 = r34[r14]
            r1 = r35[r14]
            long r2 = (long) r0
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r9 = (long) r1
            long r9 = r9 & r4
        L1c6:
            r7 = r35[r6]
            long r11 = (long) r7
            long r11 = r11 & r4
            long r11 = r11 * r2
            r7 = r34[r6]
            long r14 = (long) r7
            long r13 = r14 & r4
            long r13 = r13 * r9
            long r13 = r13 + r11
            r7 = 16
            int r11 = r7 + r6
            r12 = r8[r11]
            r15 = r8
            long r7 = (long) r12
            long r7 = r7 & r4
            long r13 = r13 + r7
            long r13 = r13 + r25
            int r7 = (int) r13
            r15[r11] = r7
            r7 = 32
            long r11 = r13 >>> r7
            r8 = 1
            int r6 = r6 + r8
            r13 = 16
            if (r6 < r13) goto L1f9
            int r2 = (int) r11
            int r0 = r0 * r1
            int r0 = r0 + r2
            r15[r7] = r0
            r14 = r36
            m12040d(r15, r14)
            return
        L1f9:
            r14 = r36
            r25 = r11
            r8 = r15
            r14 = 16
            goto L1c6
    }

    /* renamed from: d */
    public static void m12040d(int[] r7, int[] r8) {
            r0 = 32
            r0 = r7[r0]
            r1 = 16
            r3 = r0
            r2 = 16
        L9:
            int r2 = r2 + (-1)
            if (r2 < 0) goto L1c
            int r4 = r1 + r2
            r4 = r7[r4]
            int r5 = r2 + 0
            int r6 = r4 >>> 9
            int r3 = r3 << (-9)
            r3 = r3 | r6
            r8[r5] = r3
            r3 = r4
            goto L9
        L1c:
            int r2 = r3 << (-9)
            int r2 = r2 >>> 23
            int r0 = r0 >>> 9
            int r2 = r2 + r0
            int r7 = p085f1.AbstractC1972m.m5002g(r1, r7, r8)
            int r7 = r7 + r2
            r0 = 511(0x1ff, float:7.16E-43)
            if (r7 > r0) goto L36
            if (r7 != r0) goto L3d
            int[] r2 = p298qj.C5727r0.f22107a
            boolean r2 = p085f1.AbstractC1972m.m5011p(r1, r8, r2)
            if (r2 == 0) goto L3d
        L36:
            int r2 = p085f1.AbstractC1972m.m5021z(r1, r8)
            int r2 = r2 + r7
            r7 = r2 & 511(0x1ff, float:7.16E-43)
        L3d:
            r8[r1] = r7
            return
    }

    /* renamed from: e */
    public static void m12041e(int[] r4) {
            r0 = 16
            r1 = r4[r0]
            int r2 = r1 >>> 9
            int r2 = p085f1.AbstractC1972m.m5006k(r0, r2, r4)
            r3 = 511(0x1ff, float:7.16E-43)
            r1 = r1 & r3
            int r2 = r2 + r1
            if (r2 > r3) goto L1a
            if (r2 != r3) goto L21
            int[] r1 = p298qj.C5727r0.f22107a
            boolean r1 = p085f1.AbstractC1972m.m5011p(r0, r4, r1)
            if (r1 == 0) goto L21
        L1a:
            int r1 = p085f1.AbstractC1972m.m5021z(r0, r4)
            int r1 = r1 + r2
            r2 = r1 & 511(0x1ff, float:7.16E-43)
        L21:
            r4[r0] = r2
            return
    }

    /* renamed from: f */
    public static void m12042f(int[] r1, int[] r2) {
            r0 = 33
            int[] r0 = new int[r0]
            m12038b(r1, r0)
            m12040d(r0, r2)
            return
    }

    /* renamed from: g */
    public static void m12043g(int[] r4, int[] r5, int[] r6) {
            r0 = 16
            int r1 = p085f1.AbstractC1972m.m4984S(r0, r4, r5, r6)
            r4 = r4[r0]
            int r1 = r1 + r4
            r4 = r5[r0]
            int r1 = r1 - r4
            if (r1 >= 0) goto L22
            r4 = 0
            r5 = 0
        L10:
            r2 = -1
            if (r5 >= r0) goto L1e
            r3 = r6[r5]
            int r3 = r3 + r2
            r6[r5] = r3
            if (r3 == r2) goto L1b
            goto L1f
        L1b:
            int r5 = r5 + 1
            goto L10
        L1e:
            r4 = -1
        L1f:
            int r1 = r1 + r4
            r1 = r1 & 511(0x1ff, float:7.16E-43)
        L22:
            r6[r0] = r1
            return
    }
}
