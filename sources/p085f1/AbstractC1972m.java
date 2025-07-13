package p085f1;

/* renamed from: f1.m */
/* loaded from: classes.dex */
public abstract class AbstractC1972m {
    /* renamed from: A */
    public static int m4966A(int r4, int[] r5, int[] r6) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 1
            if (r1 >= r4) goto L18
            r3 = r5[r1]
            int r3 = r3 + r2
            r6[r1] = r3
            int r1 = r1 + 1
            if (r3 == 0) goto L2
        Le:
            if (r1 >= r4) goto L17
            r2 = r5[r1]
            r6[r1] = r2
            int r1 = r1 + 1
            goto Le
        L17:
            return r0
        L18:
            return r2
    }

    /* renamed from: B */
    public static int m4967B(int r2, int[] r3, int r4) {
        L0:
            r0 = 1
            if (r4 >= r2) goto Lf
            r1 = r3[r4]
            int r1 = r1 + r0
            r3[r4] = r1
            if (r1 == 0) goto Lc
            r2 = 0
            return r2
        Lc:
            int r4 = r4 + 1
            goto L0
        Lf:
            return r0
    }

    /* renamed from: C */
    public static int m4968C(int r3, int[] r4, int r5, int r6) {
        L0:
            r0 = 1
            if (r6 >= r3) goto L11
            int r1 = r5 + r6
            r2 = r4[r1]
            int r2 = r2 + r0
            r4[r1] = r2
            if (r2 == 0) goto Le
            r3 = 0
            return r3
        Le:
            int r6 = r6 + 1
            goto L0
        L11:
            return r0
    }

    /* renamed from: D */
    public static boolean m4969D(int r4, int[] r5) {
            r0 = 0
            r1 = r5[r0]
            r2 = 1
            if (r1 == r2) goto L7
            return r0
        L7:
            r1 = 1
        L8:
            if (r1 >= r4) goto L12
            r3 = r5[r1]
            if (r3 == 0) goto Lf
            return r0
        Lf:
            int r1 = r1 + 1
            goto L8
        L12:
            return r2
    }

    /* renamed from: E */
    public static boolean m4970E(int[] r4) {
            r0 = 0
            r1 = r4[r0]
            r2 = 1
            if (r1 == r2) goto L7
            return r0
        L7:
            r1 = 1
        L8:
            r3 = 6
            if (r1 >= r3) goto L13
            r3 = r4[r1]
            if (r3 == 0) goto L10
            return r0
        L10:
            int r1 = r1 + 1
            goto L8
        L13:
            return r2
    }

    /* renamed from: F */
    public static boolean m4971F(long[] r8) {
            r0 = 0
            r1 = r8[r0]
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto La
            return r0
        La:
            r1 = 1
            r2 = 1
        Lc:
            r3 = 3
            if (r2 >= r3) goto L1b
            r3 = r8[r2]
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L18
            return r0
        L18:
            int r2 = r2 + 1
            goto Lc
        L1b:
            return r1
    }

    /* renamed from: G */
    public static boolean m4972G(int r3, int[] r4) {
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r3) goto Lc
            r2 = r4[r1]
            if (r2 == 0) goto L9
            return r0
        L9:
            int r1 = r1 + 1
            goto L2
        Lc:
            r3 = 1
            return r3
    }

    /* renamed from: H */
    public static boolean m4973H(int[] r3) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 6
            if (r1 >= r2) goto Ld
            r2 = r3[r1]
            if (r2 == 0) goto La
            return r0
        La:
            int r1 = r1 + 1
            goto L2
        Ld:
            r3 = 1
            return r3
    }

    /* renamed from: I */
    public static boolean m4974I(long[] r7) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 3
            if (r1 >= r2) goto L11
            r2 = r7[r1]
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto Le
            return r0
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            r7 = 1
            return r7
    }

    /* renamed from: J */
    public static void m4975J(int[] r30, int[] r31, int[] r32) {
            r0 = 0
            r1 = r31[r0]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 1
            r6 = r31[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = 2
            r9 = r31[r8]
            long r9 = (long) r9
            long r9 = r9 & r3
            r11 = 3
            r12 = r31[r11]
            long r12 = (long) r12
            long r12 = r12 & r3
            r14 = 4
            r15 = r31[r14]
            long r14 = (long) r15
            long r14 = r14 & r3
            r17 = 5
            r11 = r31[r17]
            r20 = r9
            long r8 = (long) r11
            long r8 = r8 & r3
            r10 = r30[r0]
            long r10 = (long) r10
            long r10 = r10 & r3
            long r22 = r10 * r1
            r24 = 0
            long r3 = r22 + r24
            int r5 = (int) r3
            r32[r0] = r5
            r0 = 32
            long r3 = r3 >>> r0
            long r28 = r10 * r6
            long r3 = r28 + r3
            int r5 = (int) r3
            r22 = 1
            r32[r22] = r5
            long r3 = r3 >>> r0
            long r28 = r10 * r20
            long r3 = r28 + r3
            int r5 = (int) r3
            r19 = 2
            r32[r19] = r5
            long r3 = r3 >>> r0
            long r28 = r10 * r12
            long r3 = r28 + r3
            int r5 = (int) r3
            r18 = 3
            r32[r18] = r5
            long r3 = r3 >>> r0
            long r18 = r10 * r14
            long r3 = r18 + r3
            int r5 = (int) r3
            r16 = 4
            r32[r16] = r5
            long r3 = r3 >>> r0
            long r10 = r10 * r8
            long r10 = r10 + r3
            int r3 = (int) r10
            r32[r17] = r3
            long r3 = r10 >>> r0
            int r4 = (int) r3
            r3 = 6
            r32[r3] = r4
            r5 = 1
        L6b:
            if (r5 >= r3) goto Lfd
            r4 = r30[r5]
            long r10 = (long) r4
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r16
            long r18 = r10 * r1
            int r4 = r5 + 0
            r3 = r32[r4]
            r22 = r1
            long r0 = (long) r3
            long r0 = r0 & r16
            long r18 = r18 + r0
            long r0 = r18 + r24
            int r3 = (int) r0
            r32[r4] = r3
            r2 = 32
            long r0 = r0 >>> r2
            long r3 = r10 * r6
            int r18 = r5 + 1
            r2 = r32[r18]
            r26 = r6
            long r6 = (long) r2
            long r6 = r6 & r16
            long r3 = r3 + r6
            long r3 = r3 + r0
            int r0 = (int) r3
            r32[r18] = r0
            r0 = 32
            long r1 = r3 >>> r0
            long r3 = r10 * r20
            int r6 = r5 + 2
            r7 = r32[r6]
            r28 = r1
            long r0 = (long) r7
            long r0 = r0 & r16
            long r3 = r3 + r0
            long r3 = r3 + r28
            int r0 = (int) r3
            r32[r6] = r0
            r0 = 32
            long r1 = r3 >>> r0
            long r3 = r10 * r12
            int r6 = r5 + 3
            r7 = r32[r6]
            r28 = r1
            long r0 = (long) r7
            long r0 = r0 & r16
            long r3 = r3 + r0
            long r3 = r3 + r28
            int r0 = (int) r3
            r32[r6] = r0
            r0 = 32
            long r1 = r3 >>> r0
            long r3 = r10 * r14
            int r6 = r5 + 4
            r7 = r32[r6]
            r28 = r1
            long r0 = (long) r7
            long r0 = r0 & r16
            long r3 = r3 + r0
            long r3 = r3 + r28
            int r0 = (int) r3
            r32[r6] = r0
            r0 = 32
            long r1 = r3 >>> r0
            long r10 = r10 * r8
            int r3 = r5 + 5
            r4 = r32[r3]
            long r6 = (long) r4
            long r6 = r6 & r16
            long r10 = r10 + r6
            long r10 = r10 + r1
            int r1 = (int) r10
            r32[r3] = r1
            long r1 = r10 >>> r0
            int r5 = r5 + 6
            int r2 = (int) r1
            r32[r5] = r2
            r5 = r18
            r1 = r22
            r6 = r26
            r3 = 6
            goto L6b
        Lfd:
            return
    }

    /* renamed from: K */
    public static void m4976K(int[] r31, int[] r32, int[] r33) {
            r6 = r33
            m4975J(r31, r32, r33)
            r7 = 6
            r0 = r32[r7]
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r4 = 7
            r4 = r32[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r8 = 8
            r8 = r32[r8]
            long r8 = (long) r8
            long r8 = r8 & r2
            r10 = 9
            r10 = r32[r10]
            long r10 = (long) r10
            long r10 = r10 & r2
            r12 = 10
            r12 = r32[r12]
            long r12 = (long) r12
            long r12 = r12 & r2
            r14 = 11
            r14 = r32[r14]
            long r14 = (long) r14
            long r14 = r14 & r2
            r16 = r14
            r14 = r31[r7]
            long r14 = (long) r14
            long r14 = r14 & r2
            long r18 = r14 * r0
            r20 = 0
            long r2 = r18 + r20
            int r7 = (int) r2
            r24 = r0
            r0 = 12
            r6[r0] = r7
            r1 = 32
            long r2 = r2 >>> r1
            long r26 = r14 * r4
            long r2 = r26 + r2
            int r7 = (int) r2
            r19 = 13
            r6[r19] = r7
            long r2 = r2 >>> r1
            long r26 = r14 * r8
            long r2 = r26 + r2
            int r7 = (int) r2
            r19 = 14
            r6[r19] = r7
            long r2 = r2 >>> r1
            long r26 = r14 * r10
            long r2 = r26 + r2
            int r7 = (int) r2
            r19 = 15
            r6[r19] = r7
            long r2 = r2 >>> r1
            long r26 = r14 * r12
            long r2 = r26 + r2
            int r7 = (int) r2
            r19 = 16
            r6[r19] = r7
            long r2 = r2 >>> r1
            long r14 = r14 * r16
            long r14 = r14 + r2
            int r2 = (int) r14
            r3 = 17
            r6[r3] = r2
            long r2 = r14 >>> r1
            int r3 = (int) r2
            r7 = 18
            r6[r7] = r3
            r14 = 1
            r2 = 1
            r3 = 12
        L7d:
            r15 = 6
            if (r2 >= r15) goto L11a
            int r3 = r3 + r14
            int r19 = r15 + r2
            r15 = r31[r19]
            long r14 = (long) r15
            r22 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r14 & r22
            long r26 = r14 * r24
            int r28 = r3 + 0
            r7 = r6[r28]
            long r0 = (long) r7
            long r0 = r0 & r22
            long r26 = r26 + r0
            long r0 = r26 + r20
            int r7 = (int) r0
            r6[r28] = r7
            r7 = 32
            long r0 = r0 >>> r7
            long r26 = r14 * r4
            int r28 = r3 + 1
            r7 = r6[r28]
            r29 = r4
            long r4 = (long) r7
            long r4 = r4 & r22
            long r26 = r26 + r4
            long r0 = r26 + r0
            int r4 = (int) r0
            r6[r28] = r4
            r4 = 32
            long r0 = r0 >>> r4
            long r26 = r14 * r8
            int r5 = r3 + 2
            r7 = r6[r5]
            r28 = r5
            long r4 = (long) r7
            long r4 = r4 & r22
            long r26 = r26 + r4
            long r0 = r26 + r0
            int r4 = (int) r0
            r6[r28] = r4
            r4 = 32
            long r0 = r0 >>> r4
            long r26 = r14 * r10
            int r5 = r3 + 3
            r7 = r6[r5]
            r28 = r5
            long r4 = (long) r7
            long r4 = r4 & r22
            long r26 = r26 + r4
            long r0 = r26 + r0
            int r4 = (int) r0
            r6[r28] = r4
            r4 = 32
            long r0 = r0 >>> r4
            long r26 = r14 * r12
            int r5 = r3 + 4
            r7 = r6[r5]
            r28 = r5
            long r4 = (long) r7
            long r4 = r4 & r22
            long r26 = r26 + r4
            long r0 = r26 + r0
            int r4 = (int) r0
            r6[r28] = r4
            r4 = 32
            long r0 = r0 >>> r4
            long r14 = r14 * r16
            int r5 = r3 + 5
            r7 = r6[r5]
            r26 = r5
            long r4 = (long) r7
            long r4 = r4 & r22
            long r14 = r14 + r4
            long r14 = r14 + r0
            int r0 = (int) r14
            r6[r26] = r0
            r0 = 32
            long r4 = r14 >>> r0
            int r1 = r3 + 6
            int r5 = (int) r4
            r6[r1] = r5
            int r2 = r2 + 1
            r4 = r29
            r0 = 12
            r1 = 32
            r7 = 18
            r14 = 1
            goto L7d
        L11a:
            r1 = 12
            r2 = 6
            int r0 = m5004i(r6, r2, r6, r1)
            r7 = 0
            int r3 = m5003h(r6, r7, r6, r2, r7)
            int r3 = r3 + r0
            r4 = 18
            int r3 = m5003h(r6, r4, r6, r1, r3)
            int r8 = r3 + r0
            int[] r9 = new int[r2]
            int[] r10 = new int[r2]
            r11 = 6
            r12 = 0
            r13 = 0
            r2 = 6
            r3 = 0
            r5 = 0
            r14 = 12
            r0 = r31
            r1 = r2
            r2 = r31
            r4 = r9
            boolean r15 = m5010o(r0, r1, r2, r3, r4, r5)
            r0 = r32
            r1 = r11
            r2 = r32
            r3 = r12
            r4 = r10
            r5 = r13
            boolean r0 = m5010o(r0, r1, r2, r3, r4, r5)
            if (r15 == r0) goto L156
            r19 = 1
            goto L158
        L156:
            r19 = 0
        L158:
            int[] r0 = new int[r14]
            m4975J(r9, r10, r0)
            r1 = 6
            if (r19 == 0) goto L165
            int r0 = m5001f(r14, r0, r7, r6, r1)
            goto L169
        L165:
            int r0 = m4988W(r14, r0, r7, r6, r1)
        L169:
            int r8 = r8 + r0
            r0 = 24
            r1 = 18
            m5005j(r0, r8, r6, r1)
            return
    }

    /* renamed from: L */
    public static int m4977L(int[] r30, int[] r31, int[] r32) {
            r0 = 0
            r1 = r31[r0]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 1
            r5 = r31[r5]
            long r5 = (long) r5
            long r5 = r5 & r3
            r7 = 2
            r7 = r31[r7]
            long r7 = (long) r7
            long r7 = r7 & r3
            r9 = 3
            r9 = r31[r9]
            long r9 = (long) r9
            long r9 = r9 & r3
            r11 = 4
            r11 = r31[r11]
            long r11 = (long) r11
            long r11 = r11 & r3
            r13 = 5
            r13 = r31[r13]
            long r13 = (long) r13
            long r13 = r13 & r3
            r17 = 0
        L25:
            r15 = 6
            if (r0 >= r15) goto Lc5
            r15 = r30[r0]
            r21 = r13
            long r13 = (long) r15
            long r13 = r13 & r3
            long r15 = r13 * r1
            int r23 = r0 + 0
            r24 = r1
            r1 = r32[r23]
            long r1 = (long) r1
            long r1 = r1 & r3
            long r15 = r15 + r1
            r1 = 0
            long r3 = r15 + r1
            int r15 = (int) r3
            r32[r23] = r15
            r15 = 32
            long r3 = r3 >>> r15
            long r26 = r13 * r5
            int r16 = r0 + 1
            r1 = r32[r16]
            long r1 = (long) r1
            r19 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r19
            long r26 = r26 + r1
            long r1 = r26 + r3
            int r3 = (int) r1
            r32[r16] = r3
            long r1 = r1 >>> r15
            long r3 = r13 * r7
            int r23 = r0 + 2
            r15 = r32[r23]
            r26 = r5
            long r5 = (long) r15
            long r5 = r5 & r19
            long r3 = r3 + r5
            long r3 = r3 + r1
            int r1 = (int) r3
            r32[r23] = r1
            r1 = 32
            long r2 = r3 >>> r1
            long r4 = r13 * r9
            int r6 = r0 + 3
            r15 = r32[r6]
            r28 = r2
            long r1 = (long) r15
            long r1 = r1 & r19
            long r4 = r4 + r1
            long r4 = r4 + r28
            int r1 = (int) r4
            r32[r6] = r1
            r1 = 32
            long r2 = r4 >>> r1
            long r4 = r13 * r11
            int r6 = r0 + 4
            r15 = r32[r6]
            r28 = r2
            long r1 = (long) r15
            long r1 = r1 & r19
            long r4 = r4 + r1
            long r4 = r4 + r28
            int r1 = (int) r4
            r32[r6] = r1
            r1 = 32
            long r2 = r4 >>> r1
            long r13 = r13 * r21
            int r4 = r0 + 5
            r5 = r32[r4]
            long r5 = (long) r5
            long r5 = r5 & r19
            long r13 = r13 + r5
            long r13 = r13 + r2
            int r2 = (int) r13
            r32[r4] = r2
            long r2 = r13 >>> r1
            int r0 = r0 + 6
            r4 = r32[r0]
            long r4 = (long) r4
            long r4 = r4 & r19
            r13 = r17
            long r17 = r13 + r4
            long r2 = r17 + r2
            int r4 = (int) r2
            r32[r0] = r4
            long r17 = r2 >>> r1
            r0 = r16
            r3 = r19
            r13 = r21
            r1 = r24
            r5 = r26
            goto L25
        Lc5:
            r13 = r17
            int r0 = (int) r13
            return r0
    }

    /* renamed from: M */
    public static int m4978M(int r3, int[] r4, int r5, int[] r6) {
            r0 = 0
        L1:
            if (r0 >= r3) goto L10
            r1 = r4[r0]
            int r2 = r1 << 1
            int r5 = r5 >>> 31
            r5 = r5 | r2
            r6[r0] = r5
            int r0 = r0 + 1
            r5 = r1
            goto L1
        L10:
            int r3 = r5 >>> 31
            return r3
    }

    /* renamed from: N */
    public static int m4979N(int r4, int[] r5, int r6, int r7) {
            r0 = 0
        L1:
            if (r0 >= r4) goto L10
            r1 = r5[r0]
            int r2 = r1 << r6
            int r3 = -r6
            int r7 = r7 >>> r3
            r7 = r7 | r2
            r5[r0] = r7
            int r0 = r0 + 1
            r7 = r1
            goto L1
        L10:
            int r4 = -r6
            int r4 = r7 >>> r4
            return r4
    }

    /* renamed from: O */
    public static int m4980O(int r4, int[] r5, int r6, int r7, int[] r8) {
            r0 = 0
        L1:
            if (r0 >= r4) goto L10
            r1 = r5[r0]
            int r2 = r1 << r6
            int r3 = -r6
            int r7 = r7 >>> r3
            r7 = r7 | r2
            r8[r0] = r7
            int r0 = r0 + 1
            r7 = r1
            goto L1
        L10:
            int r4 = -r6
            int r4 = r7 >>> r4
            return r4
    }

    /* renamed from: P */
    public static long m4981P(int r7, long[] r8, int r9, int r10, long r11) {
            r0 = 0
        L1:
            if (r0 >= r7) goto L12
            int r1 = r9 + r0
            r2 = r8[r1]
            long r4 = r2 << r10
            int r6 = -r10
            long r11 = r11 >>> r6
            long r11 = r11 | r4
            r8[r1] = r11
            int r0 = r0 + 1
            r11 = r2
            goto L1
        L12:
            int r7 = -r10
            long r7 = r11 >>> r7
            return r7
    }

    /* renamed from: Q */
    public static void m4982Q(int[] r38, int[] r39) {
            r0 = 0
            r1 = r38[r0]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 12
            r6 = 5
            r7 = 0
        Le:
            int r8 = r6 + (-1)
            r6 = r38[r6]
            long r9 = (long) r6
            long r9 = r9 & r3
            long r9 = r9 * r9
            int r5 = r5 + (-1)
            int r6 = r7 << 31
            r7 = 33
            long r11 = r9 >>> r7
            int r12 = (int) r11
            r6 = r6 | r12
            r39[r5] = r6
            int r5 = r5 + (-1)
            r6 = 1
            long r11 = r9 >>> r6
            int r12 = (int) r11
            r39[r5] = r12
            int r10 = (int) r9
            if (r8 > 0) goto L1a0
            long r8 = r1 * r1
            int r5 = r10 << 31
            long r10 = (long) r5
            long r10 = r10 & r3
            long r12 = r8 >>> r7
            long r10 = r10 | r12
            int r5 = (int) r8
            r39[r0] = r5
            r0 = 32
            long r7 = r8 >>> r0
            int r5 = (int) r7
            r5 = r5 & r6
            r7 = r38[r6]
            long r7 = (long) r7
            long r7 = r7 & r3
            r9 = 2
            r12 = r39[r9]
            long r12 = (long) r12
            long r12 = r12 & r3
            long r14 = r7 * r1
            long r14 = r14 + r10
            int r10 = (int) r14
            int r11 = r10 << 1
            r5 = r5 | r11
            r39[r6] = r5
            int r5 = r10 >>> 31
            long r10 = r14 >>> r0
            long r12 = r12 + r10
            r6 = r38[r9]
            long r10 = (long) r6
            long r10 = r10 & r3
            r6 = 3
            r6 = r39[r6]
            long r14 = (long) r6
            long r18 = r14 & r3
            r6 = 4
            r6 = r39[r6]
            long r14 = (long) r6
            long r20 = r14 & r3
            long r14 = r10 * r1
            long r14 = r14 + r12
            int r6 = (int) r14
            int r12 = r6 << 1
            r5 = r5 | r12
            r39[r9] = r5
            int r5 = r6 >>> 31
            long r16 = r14 >>> r0
            r12 = r10
            r14 = r7
            long r12 = p085f1.C1971l.m4965a(r12, r14, r16, r18)
            long r14 = r12 >>> r0
            long r20 = r20 + r14
            long r12 = r12 & r3
            r6 = 3
            r6 = r38[r6]
            long r14 = (long) r6
            long r30 = r14 & r3
            r6 = 5
            r6 = r39[r6]
            long r14 = (long) r6
            long r14 = r14 & r3
            long r16 = r20 >>> r0
            long r14 = r14 + r16
            long r18 = r20 & r3
            r6 = 6
            r6 = r39[r6]
            r32 = r10
            long r9 = (long) r6
            long r9 = r9 & r3
            long r16 = r14 >>> r0
            long r9 = r9 + r16
            long r20 = r14 & r3
            long r14 = r30 * r1
            long r14 = r14 + r12
            int r6 = (int) r14
            int r11 = r6 << 1
            r5 = r5 | r11
            r11 = 3
            r39[r11] = r5
            int r5 = r6 >>> 31
            long r16 = r14 >>> r0
            r12 = r30
            r14 = r7
            long r11 = p085f1.C1971l.m4965a(r12, r14, r16, r18)
            long r18 = r11 >>> r0
            r14 = r30
            r16 = r32
            long r13 = p085f1.C1971l.m4965a(r14, r16, r18, r20)
            long r11 = r11 & r3
            long r15 = r13 >>> r0
            long r9 = r9 + r15
            long r18 = r13 & r3
            r0 = 4
            r0 = r38[r0]
            long r13 = (long) r0
            long r34 = r13 & r3
            r0 = 7
            r0 = r39[r0]
            long r13 = (long) r0
            long r13 = r13 & r3
            r0 = 32
            long r15 = r9 >>> r0
            long r13 = r13 + r15
            long r20 = r9 & r3
            r6 = 8
            r9 = r39[r6]
            long r9 = (long) r9
            long r9 = r9 & r3
            long r15 = r13 >>> r0
            long r9 = r9 + r15
            long r28 = r13 & r3
            long r13 = r34 * r1
            long r13 = r13 + r11
            int r11 = (int) r13
            int r12 = r11 << 1
            r5 = r5 | r12
            r12 = 4
            r39[r12] = r5
            int r5 = r11 >>> 31
            long r16 = r13 >>> r0
            r12 = r34
            r14 = r7
            long r11 = p085f1.C1971l.m4965a(r12, r14, r16, r18)
            long r18 = r11 >>> r0
            r14 = r34
            r16 = r32
            long r13 = p085f1.C1971l.m4965a(r14, r16, r18, r20)
            long r11 = r11 & r3
            long r26 = r13 >>> r0
            r22 = r34
            r24 = r30
            long r15 = p085f1.C1971l.m4965a(r22, r24, r26, r28)
            long r18 = r13 & r3
            long r13 = r15 >>> r0
            long r9 = r9 + r13
            long r20 = r15 & r3
            r0 = 5
            r0 = r38[r0]
            long r13 = (long) r0
            long r36 = r13 & r3
            r0 = 9
            r0 = r39[r0]
            long r13 = (long) r0
            long r13 = r13 & r3
            r0 = 32
            long r15 = r9 >>> r0
            long r13 = r13 + r15
            long r28 = r9 & r3
            r9 = 10
            r10 = r39[r9]
            long r9 = (long) r10
            long r9 = r9 & r3
            long r15 = r13 >>> r0
            long r9 = r9 + r15
            long r3 = r3 & r13
            long r1 = r1 * r36
            long r1 = r1 + r11
            int r11 = (int) r1
            int r12 = r11 << 1
            r5 = r5 | r12
            r12 = 5
            r39[r12] = r5
            int r5 = r11 >>> 31
            long r16 = r1 >>> r0
            r12 = r36
            r14 = r7
            long r1 = p085f1.C1971l.m4965a(r12, r14, r16, r18)
            long r18 = r1 >>> r0
            r14 = r36
            r16 = r32
            long r7 = p085f1.C1971l.m4965a(r14, r16, r18, r20)
            long r26 = r7 >>> r0
            r22 = r36
            long r11 = p085f1.C1971l.m4965a(r22, r24, r26, r28)
            long r24 = r11 >>> r0
            r20 = r36
            r22 = r34
            r26 = r3
            long r3 = p085f1.C1971l.m4965a(r20, r22, r24, r26)
            long r13 = r3 >>> r0
            long r9 = r9 + r13
            int r0 = (int) r1
            int r1 = r0 << 1
            r1 = r1 | r5
            r2 = 6
            r39[r2] = r1
            int r0 = r0 >>> 31
            int r1 = (int) r7
            int r2 = r1 << 1
            r0 = r0 | r2
            r2 = 7
            r39[r2] = r0
            int r0 = r1 >>> 31
            int r1 = (int) r11
            int r2 = r1 << 1
            r0 = r0 | r2
            r39[r6] = r0
            int r0 = r1 >>> 31
            int r1 = (int) r3
            int r2 = r1 << 1
            r0 = r0 | r2
            r2 = 9
            r39[r2] = r0
            int r0 = r1 >>> 31
            int r1 = (int) r9
            int r2 = r1 << 1
            r0 = r0 | r2
            r2 = 10
            r39[r2] = r0
            int r0 = r1 >>> 31
            r1 = 11
            r2 = r39[r1]
            r3 = 32
            long r3 = r9 >>> r3
            int r4 = (int) r3
            int r2 = r2 + r4
            int r2 = r2 << 1
            r0 = r0 | r2
            r39[r1] = r0
            return
        L1a0:
            r6 = r8
            r7 = r10
            goto Le
    }

    /* renamed from: R */
    public static void m4983R(int[] r38, int[] r39) {
            r6 = r39
            m4982Q(r38, r39)
            r0 = 6
            r1 = r38[r0]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 12
            r7 = 5
            r8 = 12
            r9 = 0
        L15:
            int r10 = r7 + (-1)
            int r7 = r7 + r0
            r0 = r38[r7]
            long r11 = (long) r0
            long r11 = r11 & r3
            long r11 = r11 * r11
            int r8 = r8 + (-1)
            int r0 = r5 + r8
            int r7 = r9 << 31
            r9 = 33
            long r13 = r11 >>> r9
            int r14 = (int) r13
            r7 = r7 | r14
            r6[r0] = r7
            int r8 = r8 + (-1)
            int r5 = r5 + r8
            r0 = 1
            long r13 = r11 >>> r0
            int r0 = (int) r13
            r6[r5] = r0
            int r0 = (int) r11
            if (r10 > 0) goto L218
            long r7 = r1 * r1
            int r0 = r0 << 31
            long r10 = (long) r0
            long r10 = r10 & r3
            long r12 = r7 >>> r9
            long r9 = r10 | r12
            int r0 = (int) r7
            r5 = 12
            r6[r5] = r0
            r0 = 32
            long r7 = r7 >>> r0
            int r5 = (int) r7
            r5 = r5 & 1
            r7 = 7
            r7 = r38[r7]
            long r7 = (long) r7
            long r7 = r7 & r3
            r11 = 14
            r11 = r6[r11]
            long r11 = (long) r11
            long r11 = r11 & r3
            long r13 = r7 * r1
            long r13 = r13 + r9
            int r9 = (int) r13
            r10 = 13
            int r15 = r9 << 1
            r5 = r5 | r15
            r6[r10] = r5
            int r5 = r9 >>> 31
            long r9 = r13 >>> r0
            long r11 = r11 + r9
            r0 = 8
            r0 = r38[r0]
            long r9 = (long) r0
            long r9 = r9 & r3
            r0 = 15
            r0 = r6[r0]
            long r13 = (long) r0
            long r17 = r13 & r3
            r0 = 16
            r13 = r6[r0]
            long r13 = (long) r13
            long r3 = r3 & r13
            long r13 = r9 * r1
            long r13 = r13 + r11
            int r11 = (int) r13
            int r12 = r11 << 1
            r5 = r5 | r12
            r12 = 14
            r6[r12] = r5
            int r5 = r11 >>> 31
            r19 = 32
            long r15 = r13 >>> r19
            r11 = r9
            r13 = r7
            long r11 = p085f1.C1971l.m4965a(r11, r13, r15, r17)
            long r13 = r11 >>> r19
            long r3 = r3 + r13
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r13
            r15 = 9
            r15 = r38[r15]
            r21 = r1
            long r0 = (long) r15
            long r0 = r0 & r13
            r15 = 17
            r15 = r6[r15]
            r16 = r3
            long r2 = (long) r15
            long r2 = r2 & r13
            r15 = 32
            long r18 = r16 >>> r15
            long r2 = r2 + r18
            long r17 = r16 & r13
            r15 = 18
            r15 = r6[r15]
            r16 = r5
            long r4 = (long) r15
            long r4 = r4 & r13
            r24 = 32
            long r19 = r2 >>> r24
            long r4 = r4 + r19
            long r19 = r2 & r13
            long r2 = r0 * r21
            long r2 = r2 + r11
            int r11 = (int) r2
            int r12 = r11 << 1
            r12 = r16 | r12
            r13 = 15
            r6[r13] = r12
            int r25 = r11 >>> 31
            long r15 = r2 >>> r24
            r11 = r0
            r13 = r7
            long r2 = p085f1.C1971l.m4965a(r11, r13, r15, r17)
            long r17 = r2 >>> r24
            r13 = r0
            r15 = r9
            long r11 = p085f1.C1971l.m4965a(r13, r15, r17, r19)
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r13
            long r15 = r11 >>> r24
            long r4 = r4 + r15
            long r17 = r11 & r13
            r11 = 10
            r11 = r38[r11]
            long r11 = (long) r11
            long r31 = r11 & r13
            r11 = 19
            r11 = r6[r11]
            long r11 = (long) r11
            long r11 = r11 & r13
            r33 = 32
            long r15 = r4 >>> r33
            long r11 = r11 + r15
            long r19 = r4 & r13
            r4 = 20
            r5 = r6[r4]
            long r4 = (long) r5
            long r4 = r4 & r13
            long r15 = r11 >>> r33
            long r4 = r4 + r15
            long r29 = r11 & r13
            long r11 = r31 * r21
            long r11 = r11 + r2
            int r2 = (int) r11
            int r3 = r2 << 1
            r3 = r25 | r3
            r13 = 16
            r6[r13] = r3
            int r2 = r2 >>> 31
            long r15 = r11 >>> r33
            r11 = r31
            r13 = r7
            long r11 = p085f1.C1971l.m4965a(r11, r13, r15, r17)
            long r17 = r11 >>> r33
            r13 = r31
            r15 = r9
            long r13 = p085f1.C1971l.m4965a(r13, r15, r17, r19)
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r15
            long r27 = r13 >>> r33
            r23 = r31
            r25 = r0
            long r17 = p085f1.C1971l.m4965a(r23, r25, r27, r29)
            long r19 = r13 & r15
            long r13 = r17 >>> r33
            long r4 = r4 + r13
            long r23 = r17 & r15
            r3 = 11
            r3 = r38[r3]
            long r13 = (long) r3
            long r34 = r13 & r15
            r3 = 21
            r3 = r6[r3]
            long r13 = (long) r3
            long r13 = r13 & r15
            r3 = 32
            long r17 = r4 >>> r3
            long r13 = r13 + r17
            long r29 = r4 & r15
            r4 = 22
            r5 = r6[r4]
            long r4 = (long) r5
            long r4 = r4 & r15
            long r17 = r13 >>> r3
            long r4 = r4 + r17
            long r36 = r13 & r15
            long r13 = r21 * r34
            long r13 = r13 + r11
            int r11 = (int) r13
            int r12 = r11 << 1
            r2 = r2 | r12
            r12 = 17
            r6[r12] = r2
            int r2 = r11 >>> 31
            long r15 = r13 >>> r3
            r11 = r34
            r13 = r7
            r17 = r19
            long r7 = p085f1.C1971l.m4965a(r11, r13, r15, r17)
            long r17 = r7 >>> r3
            r13 = r34
            r15 = r9
            r19 = r23
            long r9 = p085f1.C1971l.m4965a(r13, r15, r17, r19)
            long r27 = r9 >>> r3
            r23 = r34
            long r0 = p085f1.C1971l.m4965a(r23, r25, r27, r29)
            long r11 = r0 >>> r3
            r26 = r34
            r28 = r31
            r30 = r11
            r32 = r36
            long r11 = p085f1.C1971l.m4965a(r26, r28, r30, r32)
            long r13 = r11 >>> r3
            long r4 = r4 + r13
            int r3 = (int) r7
            int r7 = r3 << 1
            r2 = r2 | r7
            r7 = 18
            r6[r7] = r2
            int r2 = r3 >>> 31
            int r3 = (int) r9
            int r7 = r3 << 1
            r2 = r2 | r7
            r7 = 19
            r6[r7] = r2
            int r2 = r3 >>> 31
            int r1 = (int) r0
            int r0 = r1 << 1
            r0 = r0 | r2
            r2 = 20
            r6[r2] = r0
            int r0 = r1 >>> 31
            int r1 = (int) r11
            int r2 = r1 << 1
            r0 = r0 | r2
            r2 = 21
            r6[r2] = r0
            int r0 = r1 >>> 31
            int r1 = (int) r4
            int r2 = r1 << 1
            r0 = r0 | r2
            r2 = 22
            r6[r2] = r0
            int r0 = r1 >>> 31
            r1 = 23
            r2 = r6[r1]
            r3 = 32
            long r3 = r4 >>> r3
            int r4 = (int) r3
            int r2 = r2 + r4
            int r2 = r2 << 1
            r0 = r0 | r2
            r6[r1] = r0
            r0 = 6
            r1 = 12
            int r2 = m5004i(r6, r0, r6, r1)
            r3 = 0
            int r3 = m5003h(r6, r3, r6, r0, r3)
            int r3 = r3 + r2
            r4 = 18
            int r1 = m5003h(r6, r4, r6, r1, r3)
            int r7 = r1 + r2
            int[] r8 = new int[r0]
            r1 = 6
            r3 = 0
            r5 = 0
            r0 = r38
            r2 = r38
            r4 = r8
            m5010o(r0, r1, r2, r3, r4, r5)
            r0 = 12
            int[] r1 = new int[r0]
            m4982Q(r8, r1)
            r2 = 0
            r3 = 6
            int r0 = m4988W(r0, r1, r2, r6, r3)
            int r0 = r0 + r7
            r1 = 24
            r2 = 18
            m5005j(r1, r0, r6, r2)
            return
        L218:
            r21 = r1
            r1 = 6
            r5 = 12
            r9 = r0
            r7 = r10
            r1 = r21
            r0 = 6
            goto L15
    }

    /* renamed from: S */
    public static int m4984S(int r9, int[] r10, int[] r11, int[] r12) {
            r0 = 0
            r2 = 0
        L3:
            if (r2 >= r9) goto L1e
            r3 = r10[r2]
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            r7 = r11[r2]
            long r7 = (long) r7
            long r5 = r5 & r7
            long r3 = r3 - r5
            long r3 = r3 + r0
            int r0 = (int) r3
            r12[r2] = r0
            r0 = 32
            long r0 = r3 >> r0
            int r2 = r2 + 1
            goto L3
        L1e:
            int r9 = (int) r0
            return r9
    }

    /* renamed from: T */
    public static int m4985T(int[] r9, int r10, int[] r11, int r12, int[] r13, int r14) {
            int r0 = r10 + 0
            r0 = r9[r0]
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r4 = r12 + 0
            r4 = r11[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            long r0 = r0 - r4
            r4 = 0
            long r0 = r0 + r4
            int r4 = r14 + 0
            int r5 = (int) r0
            r13[r4] = r5
            r4 = 32
            long r0 = r0 >> r4
            int r5 = r10 + 1
            r5 = r9[r5]
            long r5 = (long) r5
            long r5 = r5 & r2
            int r7 = r12 + 1
            r7 = r11[r7]
            long r7 = (long) r7
            long r7 = r7 & r2
            long r5 = r5 - r7
            long r5 = r5 + r0
            int r0 = r14 + 1
            int r1 = (int) r5
            r13[r0] = r1
            long r0 = r5 >> r4
            int r5 = r10 + 2
            r5 = r9[r5]
            long r5 = (long) r5
            long r5 = r5 & r2
            int r7 = r12 + 2
            r7 = r11[r7]
            long r7 = (long) r7
            long r7 = r7 & r2
            long r5 = r5 - r7
            long r5 = r5 + r0
            int r0 = r14 + 2
            int r1 = (int) r5
            r13[r0] = r1
            long r0 = r5 >> r4
            int r5 = r10 + 3
            r5 = r9[r5]
            long r5 = (long) r5
            long r5 = r5 & r2
            int r7 = r12 + 3
            r7 = r11[r7]
            long r7 = (long) r7
            long r7 = r7 & r2
            long r5 = r5 - r7
            long r5 = r5 + r0
            int r0 = r14 + 3
            int r1 = (int) r5
            r13[r0] = r1
            long r0 = r5 >> r4
            int r5 = r10 + 4
            r5 = r9[r5]
            long r5 = (long) r5
            long r5 = r5 & r2
            int r7 = r12 + 4
            r7 = r11[r7]
            long r7 = (long) r7
            long r7 = r7 & r2
            long r5 = r5 - r7
            long r5 = r5 + r0
            int r0 = r14 + 4
            int r1 = (int) r5
            r13[r0] = r1
            long r0 = r5 >> r4
            int r10 = r10 + 5
            r9 = r9[r10]
            long r9 = (long) r9
            long r9 = r9 & r2
            int r12 = r12 + 5
            r11 = r11[r12]
            long r11 = (long) r11
            long r11 = r11 & r2
            long r9 = r9 - r11
            long r9 = r9 + r0
            int r14 = r14 + 5
            int r11 = (int) r9
            r13[r14] = r11
            long r9 = r9 >> r4
            int r10 = (int) r9
            return r10
    }

    /* renamed from: U */
    public static int m4986U(int[] r10, int[] r11, int[] r12) {
            r0 = 0
            r1 = r10[r0]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = r11[r0]
            long r5 = (long) r5
            long r5 = r5 & r3
            long r1 = r1 - r5
            r5 = 0
            long r1 = r1 + r5
            int r5 = (int) r1
            r12[r0] = r5
            r0 = 32
            long r1 = r1 >> r0
            r5 = 1
            r6 = r10[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = r11[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 - r8
            long r6 = r6 + r1
            int r1 = (int) r6
            r12[r5] = r1
            long r1 = r6 >> r0
            r5 = 2
            r6 = r10[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = r11[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 - r8
            long r6 = r6 + r1
            int r1 = (int) r6
            r12[r5] = r1
            long r1 = r6 >> r0
            r5 = 3
            r6 = r10[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = r11[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 - r8
            long r6 = r6 + r1
            int r1 = (int) r6
            r12[r5] = r1
            long r1 = r6 >> r0
            r5 = 4
            r6 = r10[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = r11[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 - r8
            long r6 = r6 + r1
            int r1 = (int) r6
            r12[r5] = r1
            long r1 = r6 >> r0
            r5 = 5
            r10 = r10[r5]
            long r6 = (long) r10
            long r6 = r6 & r3
            r10 = r11[r5]
            long r10 = (long) r10
            long r10 = r10 & r3
            long r6 = r6 - r10
            long r6 = r6 + r1
            int r10 = (int) r6
            r12[r5] = r10
            long r10 = r6 >> r0
            int r11 = (int) r10
            return r11
    }

    /* renamed from: V */
    public static int m4987V(int r8, int r9, int[] r10) {
            r0 = 0
            r1 = r10[r0]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            long r5 = (long) r9
            long r5 = r5 & r3
            long r1 = r1 - r5
            int r9 = (int) r1
            r10[r0] = r9
            r9 = 32
            long r1 = r1 >> r9
            r5 = 1
            r6 = r10[r5]
            long r6 = (long) r6
            long r3 = r3 & r6
            r6 = 1
            long r3 = r3 - r6
            long r3 = r3 + r1
            int r1 = (int) r3
            r10[r5] = r1
            long r1 = r3 >> r9
            r3 = 0
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 != 0) goto L28
            goto L2d
        L28:
            r9 = 2
            int r0 = m5009n(r8, r10, r9)
        L2d:
            return r0
    }

    /* renamed from: W */
    public static int m4988W(int r10, int[] r11, int r12, int[] r13, int r14) {
            r0 = 0
            r2 = 0
        L3:
            if (r2 >= r10) goto L22
            int r3 = r14 + r2
            r4 = r13[r3]
            long r4 = (long) r4
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r8 = r12 + r2
            r8 = r11[r8]
            long r8 = (long) r8
            long r6 = r6 & r8
            long r4 = r4 - r6
            long r4 = r4 + r0
            int r0 = (int) r4
            r13[r3] = r0
            r0 = 32
            long r0 = r4 >> r0
            int r2 = r2 + 1
            goto L3
        L22:
            int r10 = (int) r0
            return r10
    }

    /* renamed from: X */
    public static int m4989X(int r9, int[] r10, int[] r11) {
            r0 = 0
            r2 = 0
        L3:
            if (r2 >= r9) goto L1e
            r3 = r11[r2]
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            r7 = r10[r2]
            long r7 = (long) r7
            long r5 = r5 & r7
            long r3 = r3 - r5
            long r3 = r3 + r0
            int r0 = (int) r3
            r11[r2] = r0
            r0 = 32
            long r0 = r3 >> r0
            int r2 = r2 + 1
            goto L3
        L1e:
            int r9 = (int) r0
            return r9
    }

    /* renamed from: Y */
    public static int m4990Y(int[] r10, int[] r11) {
            r0 = 0
            r1 = r11[r0]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = r10[r0]
            long r5 = (long) r5
            long r5 = r5 & r3
            long r1 = r1 - r5
            r5 = 0
            long r1 = r1 + r5
            int r5 = (int) r1
            r11[r0] = r5
            r0 = 32
            long r1 = r1 >> r0
            r5 = 1
            r6 = r11[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = r10[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 - r8
            long r6 = r6 + r1
            int r1 = (int) r6
            r11[r5] = r1
            long r1 = r6 >> r0
            r5 = 2
            r6 = r11[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = r10[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 - r8
            long r6 = r6 + r1
            int r1 = (int) r6
            r11[r5] = r1
            long r1 = r6 >> r0
            r5 = 3
            r6 = r11[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = r10[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 - r8
            long r6 = r6 + r1
            int r1 = (int) r6
            r11[r5] = r1
            long r1 = r6 >> r0
            r5 = 4
            r6 = r11[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = r10[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 - r8
            long r6 = r6 + r1
            int r1 = (int) r6
            r11[r5] = r1
            long r1 = r6 >> r0
            r5 = 5
            r6 = r11[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r10 = r10[r5]
            long r8 = (long) r10
            long r3 = r3 & r8
            long r6 = r6 - r3
            long r6 = r6 + r1
            int r10 = (int) r6
            r11[r5] = r10
            long r10 = r6 >> r0
            int r11 = (int) r10
            return r11
    }

    /* renamed from: Z */
    public static java.math.BigInteger m4991Z(int r4, int[] r5) {
            int r0 = r4 << 2
            byte[] r0 = new byte[r0]
            r1 = 0
        L5:
            if (r1 >= r4) goto L16
            r2 = r5[r1]
            if (r2 == 0) goto L13
            int r3 = r4 + (-1)
            int r3 = r3 - r1
            int r3 = r3 << 2
            p446z3.AbstractC7246d.m14324j(r2, r0, r3)
        L13:
            int r1 = r1 + 1
            goto L5
        L16:
            java.math.BigInteger r4 = new java.math.BigInteger
            r5 = 1
            r4.<init>(r5, r0)
            return r4
    }

    /* renamed from: a */
    public static int m4992a(int r9, int[] r10, int[] r11, int[] r12) {
            r0 = 0
            r2 = 0
        L3:
            if (r2 >= r9) goto L1e
            r3 = r10[r2]
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            r7 = r11[r2]
            long r7 = (long) r7
            long r5 = r5 & r7
            long r3 = r3 + r5
            long r3 = r3 + r0
            int r0 = (int) r3
            r12[r2] = r0
            r0 = 32
            long r0 = r3 >>> r0
            int r2 = r2 + 1
            goto L3
        L1e:
            int r9 = (int) r0
            return r9
    }

    /* renamed from: a0 */
    public static java.math.BigInteger m4993a0(int[] r4) {
            r0 = 24
            byte[] r0 = new byte[r0]
            r1 = 0
        L5:
            r2 = 6
            if (r1 >= r2) goto L16
            r2 = r4[r1]
            if (r2 == 0) goto L13
            int r3 = 5 - r1
            int r3 = r3 << 2
            p446z3.AbstractC7246d.m14324j(r2, r0, r3)
        L13:
            int r1 = r1 + 1
            goto L5
        L16:
            java.math.BigInteger r4 = new java.math.BigInteger
            r1 = 1
            r4.<init>(r1, r0)
            return r4
    }

    /* renamed from: b */
    public static int m4994b(int[] r10, int[] r11, int[] r12) {
            r0 = 0
            r1 = r10[r0]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = r11[r0]
            long r5 = (long) r5
            long r5 = r5 & r3
            long r1 = r1 + r5
            r5 = 0
            long r1 = r1 + r5
            int r5 = (int) r1
            r12[r0] = r5
            r0 = 32
            long r1 = r1 >>> r0
            r5 = 1
            r6 = r10[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = r11[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 + r8
            long r6 = r6 + r1
            int r1 = (int) r6
            r12[r5] = r1
            long r1 = r6 >>> r0
            r5 = 2
            r6 = r10[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = r11[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 + r8
            long r6 = r6 + r1
            int r1 = (int) r6
            r12[r5] = r1
            long r1 = r6 >>> r0
            r5 = 3
            r6 = r10[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = r11[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 + r8
            long r6 = r6 + r1
            int r1 = (int) r6
            r12[r5] = r1
            long r1 = r6 >>> r0
            r5 = 4
            r6 = r10[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = r11[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 + r8
            long r6 = r6 + r1
            int r1 = (int) r6
            r12[r5] = r1
            long r1 = r6 >>> r0
            r5 = 5
            r10 = r10[r5]
            long r6 = (long) r10
            long r6 = r6 & r3
            r10 = r11[r5]
            long r10 = (long) r10
            long r10 = r10 & r3
            long r6 = r6 + r10
            long r6 = r6 + r1
            int r10 = (int) r6
            r12[r5] = r10
            long r10 = r6 >>> r0
            int r11 = (int) r10
            return r11
    }

    /* renamed from: b0 */
    public static java.math.BigInteger m4995b0(long[] r8) {
            r0 = 24
            byte[] r0 = new byte[r0]
            r1 = 0
        L5:
            r2 = 3
            if (r1 >= r2) goto L1a
            r3 = r8[r1]
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L17
            int r5 = 2 - r1
            int r2 = r5 << 3
            p446z3.AbstractC7246d.m14331q(r3, r0, r2)
        L17:
            int r1 = r1 + 1
            goto L5
        L1a:
            java.math.BigInteger r8 = new java.math.BigInteger
            r1 = 1
            r8.<init>(r1, r0)
            return r8
    }

    /* renamed from: c */
    public static int m4996c(int r8, int r9, int[] r10) {
            r0 = 0
            r1 = r10[r0]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            long r5 = (long) r9
            long r5 = r5 & r3
            long r1 = r1 + r5
            int r9 = (int) r1
            r10[r0] = r9
            r9 = 32
            long r1 = r1 >>> r9
            r5 = 1
            r6 = r10[r5]
            long r6 = (long) r6
            long r3 = r3 & r6
            r6 = 1
            long r3 = r3 + r6
            long r3 = r3 + r1
            int r1 = (int) r3
            r10[r5] = r1
            long r1 = r3 >>> r9
            r3 = 0
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 != 0) goto L28
            goto L2d
        L28:
            r9 = 2
            int r0 = m4967B(r8, r10, r9)
        L2d:
            return r0
    }

    /* renamed from: c0 */
    public static void m4997c0(int r2, int[] r3) {
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r2) goto L9
            r3[r1] = r0
            int r1 = r1 + 1
            goto L2
        L9:
            return
    }

    /* renamed from: d */
    public static int m4998d(int r9, int[] r10, int[] r11, int[] r12) {
            r0 = 0
            r2 = 0
        L3:
            if (r2 >= r9) goto L23
            r3 = r10[r2]
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            r7 = r11[r2]
            long r7 = (long) r7
            long r7 = r7 & r5
            long r3 = r3 + r7
            r7 = r12[r2]
            long r7 = (long) r7
            long r5 = r5 & r7
            long r3 = r3 + r5
            long r3 = r3 + r0
            int r0 = (int) r3
            r12[r2] = r0
            r0 = 32
            long r0 = r3 >>> r0
            int r2 = r2 + 1
            goto L3
        L23:
            int r9 = (int) r0
            return r9
    }

    /* renamed from: d0 */
    public static void m4999d0(int[] r2) {
            r0 = 0
            r2[r0] = r0
            r1 = 1
            r2[r1] = r0
            r1 = 2
            r2[r1] = r0
            r1 = 3
            r2[r1] = r0
            r1 = 4
            r2[r1] = r0
            r1 = 5
            r2[r1] = r0
            return
    }

    /* renamed from: e */
    public static int m5000e(int[] r10, int[] r11, int[] r12) {
            r0 = 0
            r1 = r10[r0]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = r11[r0]
            long r5 = (long) r5
            long r5 = r5 & r3
            long r1 = r1 + r5
            r5 = r12[r0]
            long r5 = (long) r5
            long r5 = r5 & r3
            long r1 = r1 + r5
            r5 = 0
            long r1 = r1 + r5
            int r5 = (int) r1
            r12[r0] = r5
            r0 = 32
            long r1 = r1 >>> r0
            r5 = 1
            r6 = r10[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = r11[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 + r8
            r8 = r12[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 + r8
            long r6 = r6 + r1
            int r1 = (int) r6
            r12[r5] = r1
            long r1 = r6 >>> r0
            r5 = 2
            r6 = r10[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = r11[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 + r8
            r8 = r12[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 + r8
            long r6 = r6 + r1
            int r1 = (int) r6
            r12[r5] = r1
            long r1 = r6 >>> r0
            r5 = 3
            r6 = r10[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = r11[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 + r8
            r8 = r12[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 + r8
            long r6 = r6 + r1
            int r1 = (int) r6
            r12[r5] = r1
            long r1 = r6 >>> r0
            r5 = 4
            r6 = r10[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = r11[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 + r8
            r8 = r12[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 + r8
            long r6 = r6 + r1
            int r1 = (int) r6
            r12[r5] = r1
            long r1 = r6 >>> r0
            r5 = 5
            r10 = r10[r5]
            long r6 = (long) r10
            long r6 = r6 & r3
            r10 = r11[r5]
            long r10 = (long) r10
            long r10 = r10 & r3
            long r6 = r6 + r10
            r10 = r12[r5]
            long r10 = (long) r10
            long r10 = r10 & r3
            long r6 = r6 + r10
            long r6 = r6 + r1
            int r10 = (int) r6
            r12[r5] = r10
            long r10 = r6 >>> r0
            int r11 = (int) r10
            return r11
    }

    /* renamed from: f */
    public static int m5001f(int r10, int[] r11, int r12, int[] r13, int r14) {
            r0 = 0
            r2 = 0
        L3:
            if (r2 >= r10) goto L22
            int r3 = r12 + r2
            r3 = r11[r3]
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r7 = r14 + r2
            r8 = r13[r7]
            long r8 = (long) r8
            long r5 = r5 & r8
            long r3 = r3 + r5
            long r3 = r3 + r0
            int r0 = (int) r3
            r13[r7] = r0
            r0 = 32
            long r0 = r3 >>> r0
            int r2 = r2 + 1
            goto L3
        L22:
            int r10 = (int) r0
            return r10
    }

    /* renamed from: g */
    public static int m5002g(int r9, int[] r10, int[] r11) {
            r0 = 0
            r2 = 0
        L3:
            if (r2 >= r9) goto L1e
            r3 = r10[r2]
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            r7 = r11[r2]
            long r7 = (long) r7
            long r5 = r5 & r7
            long r3 = r3 + r5
            long r3 = r3 + r0
            int r0 = (int) r3
            r11[r2] = r0
            r0 = 32
            long r0 = r3 >>> r0
            int r2 = r2 + 1
            goto L3
        L1e:
            int r9 = (int) r0
            return r9
    }

    /* renamed from: h */
    public static int m5003h(int[] r9, int r10, int[] r11, int r12, int r13) {
            long r0 = (long) r13
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r13 = r10 + 0
            r13 = r9[r13]
            long r4 = (long) r13
            long r4 = r4 & r2
            int r13 = r12 + 0
            r6 = r11[r13]
            long r6 = (long) r6
            long r6 = r6 & r2
            long r4 = r4 + r6
            long r4 = r4 + r0
            int r0 = (int) r4
            r11[r13] = r0
            r13 = 32
            long r0 = r4 >>> r13
            int r4 = r10 + 1
            r4 = r9[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            int r6 = r12 + 1
            r7 = r11[r6]
            long r7 = (long) r7
            long r7 = r7 & r2
            long r4 = r4 + r7
            long r4 = r4 + r0
            int r0 = (int) r4
            r11[r6] = r0
            long r0 = r4 >>> r13
            int r4 = r10 + 2
            r4 = r9[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            int r6 = r12 + 2
            r7 = r11[r6]
            long r7 = (long) r7
            long r7 = r7 & r2
            long r4 = r4 + r7
            long r4 = r4 + r0
            int r0 = (int) r4
            r11[r6] = r0
            long r0 = r4 >>> r13
            int r4 = r10 + 3
            r4 = r9[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            int r6 = r12 + 3
            r7 = r11[r6]
            long r7 = (long) r7
            long r7 = r7 & r2
            long r4 = r4 + r7
            long r4 = r4 + r0
            int r0 = (int) r4
            r11[r6] = r0
            long r0 = r4 >>> r13
            int r4 = r10 + 4
            r4 = r9[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            int r6 = r12 + 4
            r7 = r11[r6]
            long r7 = (long) r7
            long r7 = r7 & r2
            long r4 = r4 + r7
            long r4 = r4 + r0
            int r0 = (int) r4
            r11[r6] = r0
            long r0 = r4 >>> r13
            int r10 = r10 + 5
            r9 = r9[r10]
            long r9 = (long) r9
            long r9 = r9 & r2
            int r12 = r12 + 5
            r4 = r11[r12]
            long r4 = (long) r4
            long r2 = r2 & r4
            long r9 = r9 + r2
            long r9 = r9 + r0
            int r0 = (int) r9
            r11[r12] = r0
            long r9 = r9 >>> r13
            int r10 = (int) r9
            return r10
    }

    /* renamed from: i */
    public static int m5004i(int[] r11, int r12, int[] r13, int r14) {
            int r0 = r12 + 0
            r1 = r11[r0]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r5 = r14 + 0
            r6 = r13[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            long r1 = r1 + r6
            r6 = 0
            long r1 = r1 + r6
            int r6 = (int) r1
            r11[r0] = r6
            r13[r5] = r6
            r0 = 32
            long r1 = r1 >>> r0
            int r5 = r12 + 1
            r6 = r11[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            int r8 = r14 + 1
            r9 = r13[r8]
            long r9 = (long) r9
            long r9 = r9 & r3
            long r6 = r6 + r9
            long r6 = r6 + r1
            int r1 = (int) r6
            r11[r5] = r1
            r13[r8] = r1
            long r1 = r6 >>> r0
            int r5 = r12 + 2
            r6 = r11[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            int r8 = r14 + 2
            r9 = r13[r8]
            long r9 = (long) r9
            long r9 = r9 & r3
            long r6 = r6 + r9
            long r6 = r6 + r1
            int r1 = (int) r6
            r11[r5] = r1
            r13[r8] = r1
            long r1 = r6 >>> r0
            int r5 = r12 + 3
            r6 = r11[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            int r8 = r14 + 3
            r9 = r13[r8]
            long r9 = (long) r9
            long r9 = r9 & r3
            long r6 = r6 + r9
            long r6 = r6 + r1
            int r1 = (int) r6
            r11[r5] = r1
            r13[r8] = r1
            long r1 = r6 >>> r0
            int r5 = r12 + 4
            r6 = r11[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            int r8 = r14 + 4
            r9 = r13[r8]
            long r9 = (long) r9
            long r9 = r9 & r3
            long r6 = r6 + r9
            long r6 = r6 + r1
            int r1 = (int) r6
            r11[r5] = r1
            r13[r8] = r1
            long r1 = r6 >>> r0
            int r12 = r12 + 5
            r5 = r11[r12]
            long r5 = (long) r5
            long r5 = r5 & r3
            int r14 = r14 + 5
            r7 = r13[r14]
            long r7 = (long) r7
            long r3 = r3 & r7
            long r5 = r5 + r3
            long r5 = r5 + r1
            int r1 = (int) r5
            r11[r12] = r1
            r13[r14] = r1
            long r11 = r5 >>> r0
            int r12 = (int) r11
            return r12
    }

    /* renamed from: j */
    public static int m5005j(int r6, int r7, int[] r8, int r9) {
            long r0 = (long) r7
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r7 = r8[r9]
            long r4 = (long) r7
            long r2 = r2 & r4
            long r0 = r0 + r2
            int r7 = (int) r0
            r8[r9] = r7
            r7 = 32
            long r0 = r0 >>> r7
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L1a
            r6 = 0
            goto L20
        L1a:
            int r9 = r9 + 1
            int r6 = m4967B(r6, r8, r9)
        L20:
            return r6
    }

    /* renamed from: k */
    public static int m5006k(int r6, int r7, int[] r8) {
            long r0 = (long) r7
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r7 = 0
            r4 = r8[r7]
            long r4 = (long) r4
            long r2 = r2 & r4
            long r0 = r0 + r2
            int r2 = (int) r0
            r8[r7] = r2
            r2 = 32
            long r0 = r0 >>> r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1a
            goto L1f
        L1a:
            r7 = 1
            int r7 = m4967B(r6, r8, r7)
        L1f:
            return r7
    }

    /* renamed from: l */
    public static void m5007l(int[] r2, int r3, int[] r4, int r5) {
            int r0 = r5 + 0
            int r1 = r3 + 0
            r1 = r2[r1]
            r4[r0] = r1
            int r0 = r5 + 1
            int r1 = r3 + 1
            r1 = r2[r1]
            r4[r0] = r1
            int r0 = r5 + 2
            int r1 = r3 + 2
            r1 = r2[r1]
            r4[r0] = r1
            int r0 = r5 + 3
            int r1 = r3 + 3
            r1 = r2[r1]
            r4[r0] = r1
            int r0 = r5 + 4
            int r1 = r3 + 4
            r1 = r2[r1]
            r4[r0] = r1
            int r5 = r5 + 5
            int r3 = r3 + 5
            r2 = r2[r3]
            r4[r5] = r2
            return
    }

    /* renamed from: m */
    public static void m5008m(long[] r3, int r4, long[] r5, int r6) {
            int r0 = r6 + 0
            int r1 = r4 + 0
            r1 = r3[r1]
            r5[r0] = r1
            int r0 = r6 + 1
            int r1 = r4 + 1
            r1 = r3[r1]
            r5[r0] = r1
            int r6 = r6 + 2
            int r4 = r4 + 2
            r0 = r3[r4]
            r5[r6] = r0
            return
    }

    /* renamed from: n */
    public static int m5009n(int r2, int[] r3, int r4) {
        L0:
            r0 = -1
            if (r4 >= r2) goto Lf
            r1 = r3[r4]
            int r1 = r1 + r0
            r3[r4] = r1
            if (r1 == r0) goto Lc
            r2 = 0
            return r2
        Lc:
            int r4 = r4 + 1
            goto L0
        Lf:
            return r0
    }

    /* renamed from: o */
    public static boolean m5010o(int[] r8, int r9, int[] r10, int r11, int[] r12, int r13) {
            r0 = 5
        L1:
            r1 = 1
            if (r0 < 0) goto L1a
            int r2 = r9 + r0
            r2 = r8[r2]
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 ^ r3
            int r4 = r11 + r0
            r4 = r10[r4]
            r3 = r3 ^ r4
            if (r2 >= r3) goto L14
            r1 = 0
            goto L1a
        L14:
            if (r2 <= r3) goto L17
            goto L1a
        L17:
            int r0 = r0 + (-1)
            goto L1
        L1a:
            if (r1 == 0) goto L20
            m4985T(r8, r9, r10, r11, r12, r13)
            goto L29
        L20:
            r2 = r10
            r3 = r11
            r4 = r8
            r5 = r9
            r6 = r12
            r7 = r13
            m4985T(r2, r3, r4, r5, r6, r7)
        L29:
            return r1
    }

    /* renamed from: p */
    public static boolean m5011p(int r3, int[] r4, int[] r5) {
            r0 = 1
            int r3 = r3 - r0
        L2:
            if (r3 < 0) goto Lf
            r1 = r4[r3]
            r2 = r5[r3]
            if (r1 == r2) goto Lc
            r3 = 0
            return r3
        Lc:
            int r3 = r3 + (-1)
            goto L2
        Lf:
            return r0
    }

    /* renamed from: q */
    public static boolean m5012q(int[] r3, int[] r4) {
            r0 = 5
        L1:
            if (r0 < 0) goto Le
            r1 = r3[r0]
            r2 = r4[r0]
            if (r1 == r2) goto Lb
            r3 = 0
            return r3
        Lb:
            int r0 = r0 + (-1)
            goto L1
        Le:
            r3 = 1
            return r3
    }

    /* renamed from: r */
    public static boolean m5013r(long[] r6, long[] r7) {
            r0 = 2
        L1:
            if (r0 < 0) goto L10
            r1 = r6[r0]
            r3 = r7[r0]
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Ld
            r6 = 0
            return r6
        Ld:
            int r0 = r0 + (-1)
            goto L1
        L10:
            r6 = 1
            return r6
    }

    /* renamed from: s */
    public static int[] m5014s(int r3, java.math.BigInteger r4) {
            int r0 = r4.signum()
            if (r0 < 0) goto L2a
            int r0 = r4.bitLength()
            if (r0 > r3) goto L2a
            int r3 = r3 + 31
            int r3 = r3 >> 5
            int[] r3 = new int[r3]
            r0 = 0
        L13:
            int r1 = r4.signum()
            if (r1 == 0) goto L29
            int r1 = r0 + 1
            int r2 = r4.intValue()
            r3[r0] = r2
            r0 = 32
            java.math.BigInteger r4 = r4.shiftRight(r0)
            r0 = r1
            goto L13
        L29:
            return r3
        L2a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    /* renamed from: t */
    public static int[] m5015t(java.math.BigInteger r4) {
            int r0 = r4.signum()
            if (r0 < 0) goto L29
            int r0 = r4.bitLength()
            r1 = 192(0xc0, float:2.69E-43)
            if (r0 > r1) goto L29
            r0 = 6
            int[] r0 = new int[r0]
            r1 = 0
        L12:
            int r2 = r4.signum()
            if (r2 == 0) goto L28
            int r2 = r1 + 1
            int r3 = r4.intValue()
            r0[r1] = r3
            r1 = 32
            java.math.BigInteger r4 = r4.shiftRight(r1)
            r1 = r2
            goto L12
        L28:
            return r0
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
    }

    /* renamed from: u */
    public static long[] m5016u(java.math.BigInteger r5) {
            int r0 = r5.signum()
            if (r0 < 0) goto L29
            int r0 = r5.bitLength()
            r1 = 192(0xc0, float:2.69E-43)
            if (r0 > r1) goto L29
            r0 = 3
            long[] r0 = new long[r0]
            r1 = 0
        L12:
            int r2 = r5.signum()
            if (r2 == 0) goto L28
            int r2 = r1 + 1
            long r3 = r5.longValue()
            r0[r1] = r3
            r1 = 64
            java.math.BigInteger r5 = r5.shiftRight(r1)
            r1 = r2
            goto L12
        L28:
            return r0
        L29:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
    }

    /* renamed from: v */
    public static int m5017v(int[] r3, int r4) {
            r0 = 0
            if (r4 != 0) goto L8
            r3 = r3[r0]
        L5:
            r3 = r3 & 1
            return r3
        L8:
            int r1 = r4 >> 5
            if (r1 < 0) goto L16
            r2 = 6
            if (r1 < r2) goto L10
            goto L16
        L10:
            r4 = r4 & 31
            r3 = r3[r1]
            int r3 = r3 >>> r4
            goto L5
        L16:
            return r0
    }

    /* renamed from: w */
    public static int m5018w(int[] r3, int r4) {
            r0 = 0
            if (r4 != 0) goto L8
            r3 = r3[r0]
        L5:
            r3 = r3 & 1
            return r3
        L8:
            int r1 = r4 >> 5
            if (r1 < 0) goto L16
            int r2 = r3.length
            if (r1 < r2) goto L10
            goto L16
        L10:
            r4 = r4 & 31
            r3 = r3[r1]
            int r3 = r3 >>> r4
            goto L5
        L16:
            return r0
    }

    /* renamed from: x */
    public static boolean m5019x(int r4, int[] r5, int[] r6) {
            r0 = 1
            int r4 = r4 - r0
        L2:
            if (r4 < 0) goto L16
            r1 = r5[r4]
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 ^ r2
            r3 = r6[r4]
            r2 = r2 ^ r3
            if (r1 >= r2) goto L10
            r4 = 0
            return r4
        L10:
            if (r1 <= r2) goto L13
            return r0
        L13:
            int r4 = r4 + (-1)
            goto L2
        L16:
            return r0
    }

    /* renamed from: y */
    public static boolean m5020y(int[] r5, int[] r6) {
            r0 = 5
        L1:
            r1 = 1
            if (r0 < 0) goto L16
            r2 = r5[r0]
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 ^ r3
            r4 = r6[r0]
            r3 = r3 ^ r4
            if (r2 >= r3) goto L10
            r5 = 0
            return r5
        L10:
            if (r2 <= r3) goto L13
            return r1
        L13:
            int r0 = r0 + (-1)
            goto L1
        L16:
            return r1
    }

    /* renamed from: z */
    public static int m5021z(int r4, int[] r5) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 1
            if (r1 >= r4) goto L10
            r3 = r5[r1]
            int r3 = r3 + r2
            r5[r1] = r3
            if (r3 == 0) goto Ld
            return r0
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            return r2
    }
}
