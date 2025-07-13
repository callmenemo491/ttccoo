package p080ei;

/* renamed from: ei.b */
/* loaded from: classes.dex */
public class C1854b {
    /* renamed from: a */
    public static final void m4599a(p080ei.AbstractC1853a r4, p080ei.C1856d r5, java.lang.String r6) {
            ei.e$b r0 = p080ei.C1857e.f8050j
            java.util.logging.Logger r0 = p080ei.C1857e.f8049i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = r5.f8047f
            r1.append(r5)
            r5 = 32
            r1.append(r5)
            r5 = 1
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r3 = 0
            r2[r3] = r6
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r2, r5)
            java.lang.String r6 = "%-22s"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.String r6 = "java.lang.String.format(format, *args)"
            p214m2.C4339q.m9705j(r5, r6)
            r1.append(r5)
            java.lang.String r5 = ": "
            r1.append(r5)
            java.lang.String r4 = r4.f8039c
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.fine(r4)
            return
    }

    /* renamed from: b */
    public static void m4600b(long[] r5, long[] r6, long[] r7) {
            r0 = 0
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 1
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 2
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 3
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 4
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 5
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 6
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 7
            r1 = r5[r0]
            r5 = r6[r0]
            long r5 = r5 ^ r1
            r7[r0] = r5
            return
    }

    /* renamed from: c */
    public static final boolean m4601c(byte[] r4, int r5, byte[] r6, int r7, int r8) {
            java.lang.String r0 = "a"
            p214m2.C4339q.m9706k(r4, r0)
            r0 = 0
            r1 = 0
        L7:
            if (r1 >= r8) goto L17
            int r2 = r1 + r5
            r2 = r4[r2]
            int r3 = r1 + r7
            r3 = r6[r3]
            if (r2 == r3) goto L14
            return r0
        L14:
            int r1 = r1 + 1
            goto L7
        L17:
            r4 = 1
            return r4
    }

    /* renamed from: d */
    public static final void m4602d(long r5, long r7, long r9) {
            long r0 = r7 | r9
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L13
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L13
            long r0 = r5 - r7
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 < 0) goto L13
            return
        L13:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "size="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " offset="
            r1.append(r5)
            r1.append(r7)
            java.lang.String r5 = " byteCount="
            r1.append(r5)
            r1.append(r9)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    /* renamed from: e */
    public static final java.lang.String m4603e(long r12) {
            r0 = -999500000(0xffffffffc46cd720, float:-947.3613)
            long r0 = (long) r0
            java.lang.String r2 = " s "
            r3 = 1000000000(0x3b9aca00, float:0.0047237873)
            r4 = 500000000(0x1dcd6500, float:5.436748E-21)
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 > 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r4 = (long) r4
            long r12 = r12 - r4
        L17:
            long r3 = (long) r3
            long r12 = r12 / r3
            r0.append(r12)
            r0.append(r2)
        L1f:
            java.lang.String r12 = r0.toString()
            goto L86
        L24:
            r0 = -999500(0xfffffffffff0bfb4, float:NaN)
            long r0 = (long) r0
            java.lang.String r5 = " ms"
            r6 = 1000000(0xf4240, float:1.401298E-39)
            r7 = 500000(0x7a120, float:7.00649E-40)
            int r8 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r8 > 0) goto L44
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r7
            long r12 = r12 - r1
        L3b:
            long r1 = (long) r6
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r5)
            goto L1f
        L44:
            r0 = 0
            java.lang.String r8 = " \u00b5s"
            r9 = 1000(0x3e8, float:1.401E-42)
            r10 = 500(0x1f4, float:7.0E-43)
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 > 0) goto L60
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r10
            long r12 = r12 - r1
        L57:
            long r1 = (long) r9
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r8)
            goto L1f
        L60:
            r0 = 999500(0xf404c, float:1.400598E-39)
            long r0 = (long) r0
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 >= 0) goto L70
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r10
            long r12 = r12 + r1
            goto L57
        L70:
            r0 = 999500000(0x3b9328e0, float:0.0044909567)
            long r0 = (long) r0
            int r8 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r8 >= 0) goto L80
            r0.<init>()
            long r1 = (long) r7
            long r12 = r12 + r1
            goto L3b
        L80:
            r0.<init>()
            long r4 = (long) r4
            long r12 = r12 + r4
            goto L17
        L86:
            r13 = 1
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r1 = 0
            r0[r1] = r12
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r0, r13)
            java.lang.String r13 = "%6s"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            java.lang.String r13 = "java.lang.String.format(format, *args)"
            p214m2.C4339q.m9705j(r12, r13)
            return r12
    }

    /* renamed from: f */
    public static void m4604f(long[] r16, long[] r17) {
            r0 = 0
            r1 = r16[r0]
            r3 = 1
            r4 = r16[r3]
            r6 = 2
            r7 = r16[r6]
            r9 = 3
            r10 = r16[r9]
            r12 = 576460752303423487(0x7ffffffffffffff, double:3.7857669957336787E-270)
            long r14 = r1 & r12
            r17[r0] = r14
            r0 = 59
            long r0 = r1 >>> r0
            r2 = 5
            long r14 = r4 << r2
            long r0 = r0 ^ r14
            long r0 = r0 & r12
            r17[r3] = r0
            r0 = 54
            long r0 = r4 >>> r0
            r2 = 10
            long r2 = r7 << r2
            long r0 = r0 ^ r2
            long r0 = r0 & r12
            r17[r6] = r0
            r0 = 49
            long r0 = r7 >>> r0
            r2 = 15
            long r2 = r10 << r2
            long r0 = r0 ^ r2
            r17[r9] = r0
            return
    }

    /* renamed from: g */
    public static void m4605g(long[] r26, long[] r27, long[] r28) {
            r6 = 4
            long[] r7 = new long[r6]
            long[] r8 = new long[r6]
            r0 = r26
            m4604f(r0, r7)
            r0 = r27
            m4604f(r0, r8)
            r9 = 0
            r0 = r7[r9]
            r2 = r8[r9]
            r5 = 0
            r4 = r28
            m4606h(r0, r2, r4, r5)
            r10 = 1
            r0 = r7[r10]
            r2 = r8[r10]
            r5 = 1
            m4606h(r0, r2, r4, r5)
            r11 = 2
            r0 = r7[r11]
            r2 = r8[r11]
            r5 = 2
            m4606h(r0, r2, r4, r5)
            r12 = 3
            r0 = r7[r12]
            r2 = r8[r12]
            r5 = 3
            m4606h(r0, r2, r4, r5)
            r13 = 5
            r0 = 5
        L37:
            if (r0 <= 0) goto L44
            r1 = r28[r0]
            int r3 = r0 + (-1)
            r4 = r28[r3]
            long r1 = r1 ^ r4
            r28[r0] = r1
            r0 = r3
            goto L37
        L44:
            r0 = r7[r9]
            r2 = r7[r10]
            long r0 = r0 ^ r2
            r2 = r8[r9]
            r4 = r8[r10]
            long r2 = r2 ^ r4
            r5 = 1
            r4 = r28
            m4606h(r0, r2, r4, r5)
            r0 = r7[r11]
            r2 = r7[r12]
            long r0 = r0 ^ r2
            r2 = r8[r11]
            r4 = r8[r12]
            long r2 = r2 ^ r4
            r5 = 3
            r4 = r28
            m4606h(r0, r2, r4, r5)
            r14 = 7
            r0 = 7
        L66:
            if (r0 <= r10) goto L74
            r1 = r28[r0]
            int r3 = r0 + (-2)
            r3 = r28[r3]
            long r1 = r1 ^ r3
            r28[r0] = r1
            int r0 = r0 + (-1)
            goto L66
        L74:
            r0 = r7[r9]
            r2 = r7[r11]
            long r15 = r0 ^ r2
            r0 = r7[r10]
            r2 = r7[r12]
            long r21 = r0 ^ r2
            r0 = r8[r9]
            r2 = r8[r11]
            long r17 = r0 ^ r2
            r0 = r8[r10]
            r2 = r8[r12]
            long r7 = r0 ^ r2
            long r0 = r15 ^ r21
            long r2 = r17 ^ r7
            r5 = 3
            r4 = r28
            m4606h(r0, r2, r4, r5)
            long[] r0 = new long[r12]
            r20 = 0
            r19 = r0
            m4606h(r15, r17, r19, r20)
            r1 = 1
            r17 = r21
            r19 = r7
            r21 = r0
            r22 = r1
            m4606h(r17, r19, r21, r22)
            r1 = r0[r9]
            r3 = r0[r10]
            r7 = r0[r11]
            r15 = r28[r11]
            long r15 = r15 ^ r1
            r28[r11] = r15
            r15 = r28[r12]
            long r0 = r1 ^ r3
            long r0 = r0 ^ r15
            r28[r12] = r0
            r0 = r28[r6]
            long r2 = r7 ^ r3
            long r0 = r0 ^ r2
            r28[r6] = r0
            r0 = r28[r13]
            long r0 = r0 ^ r7
            r28[r13] = r0
            r0 = r28[r9]
            r2 = r28[r10]
            r4 = r28[r11]
            r7 = r28[r12]
            r15 = r28[r6]
            r17 = r28[r13]
            r19 = 6
            r20 = r28[r19]
            r22 = r28[r14]
            r24 = 59
            long r24 = r2 << r24
            long r0 = r0 ^ r24
            r28[r9] = r0
            long r0 = r2 >>> r13
            r2 = 54
            long r2 = r4 << r2
            long r0 = r0 ^ r2
            r28[r10] = r0
            r0 = 10
            long r0 = r4 >>> r0
            r2 = 49
            long r2 = r7 << r2
            long r0 = r0 ^ r2
            r28[r11] = r0
            r0 = 15
            long r0 = r7 >>> r0
            r2 = 44
            long r2 = r15 << r2
            long r0 = r0 ^ r2
            r28[r12] = r0
            r0 = 20
            long r0 = r15 >>> r0
            r2 = 39
            long r2 = r17 << r2
            long r0 = r0 ^ r2
            r28[r6] = r0
            r0 = 25
            long r0 = r17 >>> r0
            r2 = 34
            long r2 = r20 << r2
            long r0 = r0 ^ r2
            r28[r13] = r0
            r0 = 30
            long r0 = r20 >>> r0
            r2 = 29
            long r2 = r22 << r2
            long r0 = r0 ^ r2
            r28[r19] = r0
            r0 = 35
            long r0 = r22 >>> r0
            r28[r14] = r0
            return
    }

    /* renamed from: h */
    public static void m4606h(long r16, long r18, long[] r20, int r21) {
            r0 = r16
            r2 = 8
            long[] r2 = new long[r2]
            r3 = 1
            r2[r3] = r18
            r4 = r2[r3]
            long r4 = r4 << r3
            r6 = 2
            r2[r6] = r4
            r4 = r2[r6]
            long r4 = r4 ^ r18
            r7 = 3
            r2[r7] = r4
            r4 = r2[r6]
            long r4 = r4 << r3
            r6 = 4
            r2[r6] = r4
            r4 = r2[r6]
            long r4 = r4 ^ r18
            r6 = 5
            r2[r6] = r4
            r4 = r2[r7]
            long r4 = r4 << r3
            r8 = 6
            r2[r8] = r4
            r4 = r2[r8]
            long r4 = r4 ^ r18
            r8 = 7
            r2[r8] = r4
            int r4 = (int) r0
            r5 = r4 & 7
            r9 = r2[r5]
            int r4 = r4 >>> r7
            r4 = r4 & r8
            r4 = r2[r4]
            long r4 = r4 << r7
            long r4 = r4 ^ r9
            r9 = 0
            r11 = 54
        L3f:
            long r12 = r0 >>> r11
            int r13 = (int) r12
            r12 = r13 & 7
            r14 = r2[r12]
            int r12 = r13 >>> 3
            r12 = r12 & r8
            r12 = r2[r12]
            long r12 = r12 << r7
            long r12 = r12 ^ r14
            long r14 = r12 << r11
            long r4 = r4 ^ r14
            int r14 = -r11
            long r12 = r12 >>> r14
            long r9 = r9 ^ r12
            int r11 = r11 + (-6)
            if (r11 > 0) goto L3f
            r0 = r20[r21]
            r7 = 576460752303423487(0x7ffffffffffffff, double:3.7857669957336787E-270)
            long r7 = r7 & r4
            long r0 = r0 ^ r7
            r20[r21] = r0
            int r0 = r21 + 1
            r1 = r20[r0]
            r3 = 59
            long r3 = r4 >>> r3
            long r5 = r9 << r6
            long r3 = r3 ^ r5
            long r1 = r1 ^ r3
            r20[r0] = r1
            return
    }

    /* renamed from: i */
    public static void m4607i(long[] r4, long[] r5) {
            r0 = 0
            r1 = r4[r0]
            gh.C2390b.m6118h(r1, r5, r0)
            r0 = 1
            r0 = r4[r0]
            r2 = 2
            gh.C2390b.m6118h(r0, r5, r2)
            r0 = r4[r2]
            r2 = 4
            gh.C2390b.m6118h(r0, r5, r2)
            r0 = 3
            r0 = r4[r0]
            int r4 = (int) r0
            long r2 = gh.C2390b.m6117g(r4)
            r4 = 6
            r5[r4] = r2
            r4 = 32
            long r0 = r0 >>> r4
            int r4 = (int) r0
            int r4 = gh.C2390b.m6116f(r4)
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r4 = 7
            r5[r4] = r0
            return
    }

    /* renamed from: j */
    public static void m4608j(long[] r1, long[] r2, long[] r3) {
            r0 = 8
            long[] r0 = new long[r0]
            m4605g(r1, r2, r0)
            m4610l(r0, r3)
            return
    }

    /* renamed from: k */
    public static void m4609k(long[] r1, long[] r2, long[] r3) {
            r0 = 8
            long[] r0 = new long[r0]
            m4605g(r1, r2, r0)
            m4600b(r3, r0, r3)
            return
    }

    /* renamed from: l */
    public static void m4610l(long[] r27, long[] r28) {
            r0 = 0
            r1 = r27[r0]
            r3 = 1
            r4 = r27[r3]
            r6 = 2
            r7 = r27[r6]
            r9 = 3
            r10 = r27[r9]
            r12 = 4
            r12 = r27[r12]
            r14 = 5
            r14 = r27[r14]
            r16 = 6
            r16 = r27[r16]
            r18 = 7
            r18 = r27[r18]
            r20 = 23
            long r21 = r18 << r20
            long r10 = r10 ^ r21
            r21 = 41
            long r22 = r18 >>> r21
            r24 = 33
            long r25 = r18 << r24
            long r22 = r22 ^ r25
            long r12 = r12 ^ r22
            r22 = 31
            long r18 = r18 >>> r22
            long r14 = r14 ^ r18
            long r18 = r16 << r20
            long r7 = r7 ^ r18
            long r18 = r16 >>> r21
            long r25 = r16 << r24
            long r18 = r18 ^ r25
            long r10 = r10 ^ r18
            long r16 = r16 >>> r22
            long r12 = r12 ^ r16
            long r16 = r14 << r20
            long r4 = r4 ^ r16
            long r16 = r14 >>> r21
            long r18 = r14 << r24
            long r16 = r16 ^ r18
            long r7 = r7 ^ r16
            long r14 = r14 >>> r22
            long r10 = r10 ^ r14
            long r14 = r12 << r20
            long r1 = r1 ^ r14
            long r14 = r12 >>> r21
            long r16 = r12 << r24
            long r14 = r14 ^ r16
            long r4 = r4 ^ r14
            long r12 = r12 >>> r22
            long r7 = r7 ^ r12
            long r12 = r10 >>> r21
            long r1 = r1 ^ r12
            r28[r0] = r1
            r0 = 10
            long r0 = r12 << r0
            long r0 = r0 ^ r4
            r28[r3] = r0
            r28[r6] = r7
            r0 = 2199023255551(0x1ffffffffff, double:1.0864618449737E-311)
            long r0 = r0 & r10
            r28[r9] = r0
            return
    }

    /* renamed from: m */
    public static void m4611m(long[] r1, long[] r2) {
            r0 = 8
            long[] r0 = new long[r0]
            m4607i(r1, r0)
            m4610l(r0, r2)
            return
    }

    /* renamed from: n */
    public static void m4612n(long[] r1, int r2, long[] r3) {
            r0 = 8
            long[] r0 = new long[r0]
            m4607i(r1, r0)
        L7:
            m4610l(r0, r3)
            int r2 = r2 + (-1)
            if (r2 <= 0) goto L12
            m4607i(r3, r0)
            goto L7
        L12:
            return
    }

    /* renamed from: o */
    public static final java.lang.String m4613o(byte r4) {
            r0 = 2
            char[] r0 = new char[r0]
            char[] r1 = p277pi.C5528b.f21528a
            int r2 = r4 >> 4
            r2 = r2 & 15
            char r2 = r1[r2]
            r3 = 0
            r0[r3] = r2
            r4 = r4 & 15
            char r4 = r1[r4]
            r1 = 1
            r0[r1] = r4
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
            return r4
    }
}
