package p298qj;

/* renamed from: qj.l2 */
/* loaded from: classes.dex */
public class C5705l2 {

    /* renamed from: a */
    public static final long[] f22059a = null;

    static {
            r0 = 9
            long[] r0 = new long[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [3161836309350906777, -7642453882179322845, -3821226941089661423, 7312758566309945096, -556661012383879292, 8945041530681231562, -4750851271514160027, 6847946401097695794, 541669439031730457} // fill-array
            p298qj.C5705l2.f22059a = r0
            return
    }

    /* renamed from: a */
    public static void m12007a(long[] r5, long[] r6, long[] r7) {
            r0 = 0
        L1:
            r1 = 9
            if (r0 >= r1) goto Lf
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            int r0 = r0 + 1
            goto L1
        Lf:
            return
    }

    /* renamed from: b */
    public static void m12008b(long[] r8, int r9, long[] r10, int r11, long[] r12, int r13) {
            r0 = 0
        L1:
            r1 = 9
            if (r0 >= r1) goto L18
            int r1 = r13 + r0
            r2 = r12[r1]
            int r4 = r9 + r0
            r4 = r8[r4]
            int r6 = r11 + r0
            r6 = r10[r6]
            long r4 = r4 ^ r6
            long r2 = r2 ^ r4
            r12[r1] = r2
            int r0 = r0 + 1
            goto L1
        L18:
            return
    }

    /* renamed from: c */
    public static void m12009c(long[] r7, long[] r8, long[] r9) {
            r0 = 0
        L1:
            r1 = 9
            if (r0 >= r1) goto L12
            r1 = r9[r0]
            r3 = r7[r0]
            r5 = r8[r0]
            long r3 = r3 ^ r5
            long r1 = r1 ^ r3
            r9[r0] = r1
            int r0 = r0 + 1
            goto L1
        L12:
            return
    }

    /* renamed from: d */
    public static void m12010d(long[] r5, long[] r6, long[] r7) {
            r0 = 0
        L1:
            r1 = 18
            if (r0 >= r1) goto Lf
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            int r0 = r0 + 1
            goto L1
        Lf:
            return
    }

    /* renamed from: e */
    public static void m12011e(long[] r5, long[] r6) {
            r0 = 0
            r1 = r5[r0]
            r3 = 1
            long r1 = r1 ^ r3
            r6[r0] = r1
            r0 = 1
        L9:
            r1 = 9
            if (r0 >= r1) goto L14
            r1 = r5[r0]
            r6[r0] = r1
            int r0 = r0 + 1
            goto L9
        L14:
            return
    }

    /* renamed from: f */
    public static void m12012f(long[] r12, long[] r13, long[] r14) {
            r0 = 56
            r1 = 56
        L4:
            r2 = 9
            if (r1 < 0) goto L34
            r3 = 1
        L9:
            if (r3 >= r2) goto L26
            r4 = r12[r3]
            long r4 = r4 >>> r1
            int r5 = (int) r4
            r4 = r5 & 15
            int r5 = r5 >>> 4
            r5 = r5 & 15
            int r7 = r4 * 9
            int r5 = r5 + 16
            int r9 = r5 * 9
            int r11 = r3 + (-1)
            r6 = r13
            r8 = r13
            r10 = r14
            m12008b(r6, r7, r8, r9, r10, r11)
            int r3 = r3 + 2
            goto L9
        L26:
            r4 = 16
            r6 = 0
            r7 = 8
            r8 = 0
            r5 = r14
            p085f1.AbstractC1972m.m4981P(r4, r5, r6, r7, r8)
            int r1 = r1 + (-8)
            goto L4
        L34:
            if (r0 < 0) goto L64
            r1 = 0
        L37:
            if (r1 >= r2) goto L54
            r3 = r12[r1]
            long r3 = r3 >>> r0
            int r4 = (int) r3
            r3 = r4 & 15
            int r4 = r4 >>> 4
            r4 = r4 & 15
            int r5 = r3 * 9
            int r4 = r4 + 16
            int r6 = r4 * 9
            r3 = r13
            r4 = r5
            r5 = r13
            r7 = r14
            r8 = r1
            m12008b(r3, r4, r5, r6, r7, r8)
            int r1 = r1 + 2
            goto L37
        L54:
            if (r0 <= 0) goto L61
            r3 = 18
            r5 = 0
            r6 = 8
            r7 = 0
            r4 = r14
            p085f1.AbstractC1972m.m4981P(r3, r4, r5, r6, r7)
        L61:
            int r0 = r0 + (-8)
            goto L34
        L64:
            return
    }

    /* renamed from: g */
    public static void m12013g(long[] r4, long[] r5) {
            r0 = 0
        L1:
            r1 = 9
            if (r0 >= r1) goto Lf
            r1 = r4[r0]
            int r3 = r0 << 1
            gh.C2390b.m6118h(r1, r5, r3)
            int r0 = r0 + 1
            goto L1
        Lf:
            return
    }

    /* renamed from: h */
    public static void m12014h(long[] r1, long[] r2, long[] r3) {
            r0 = 18
            long[] r0 = new long[r0]
            long[] r2 = m12017k(r2)
            m12012f(r1, r2, r0)
            m12018l(r0, r3)
            return
    }

    /* renamed from: i */
    public static void m12015i(long[] r1, long[] r2, long[] r3) {
            r0 = 18
            long[] r0 = new long[r0]
            long[] r2 = m12017k(r2)
            m12012f(r1, r2, r0)
            m12010d(r3, r0, r3)
            return
    }

    /* renamed from: j */
    public static void m12016j(long[] r1, long[] r2, long[] r3) {
            r0 = 18
            long[] r0 = new long[r0]
            m12012f(r1, r2, r0)
            m12018l(r0, r3)
            return
    }

    /* renamed from: k */
    public static long[] m12017k(long[] r14) {
            r0 = 288(0x120, float:4.04E-43)
            long[] r0 = new long[r0]
            r1 = 0
            r2 = 9
            java.lang.System.arraycopy(r14, r1, r0, r2, r2)
            r14 = 7
            r3 = 0
        Lc:
            r4 = 0
            if (r14 <= 0) goto L45
            int r3 = r3 + 18
            int r6 = r3 >>> 1
            r7 = 0
        L15:
            r8 = 63
            if (r7 >= r2) goto L2a
            int r9 = r6 + r7
            r9 = r0[r9]
            int r11 = r3 + r7
            r12 = 1
            long r12 = r9 << r12
            long r4 = r4 >>> r8
            long r4 = r4 | r12
            r0[r11] = r4
            int r7 = r7 + 1
            r4 = r9
            goto L15
        L2a:
            m12019m(r0, r3)
            int r4 = r3 + 9
            r5 = 0
        L30:
            if (r5 >= r2) goto L42
            int r6 = r4 + r5
            int r7 = r2 + r5
            r7 = r0[r7]
            int r9 = r3 + r5
            r9 = r0[r9]
            long r7 = r7 ^ r9
            r0[r6] = r7
            int r5 = r5 + 1
            goto L30
        L42:
            int r14 = r14 + (-1)
            goto Lc
        L45:
            r14 = 4
            r2 = 0
        L47:
            r3 = 144(0x90, float:2.02E-43)
            if (r2 >= r3) goto L5b
            int r6 = r1 + r2
            r6 = r0[r6]
            int r3 = r3 + r2
            long r8 = r6 << r14
            r10 = -4
            long r4 = r4 >>> r10
            long r4 = r4 | r8
            r0[r3] = r4
            int r2 = r2 + 1
            r4 = r6
            goto L47
        L5b:
            return r0
    }

    /* renamed from: l */
    public static void m12018l(long[] r19, long[] r20) {
            r0 = 9
            r0 = r19[r0]
            r2 = 17
            r2 = r19[r2]
            r4 = 59
            long r5 = r2 >>> r4
            long r0 = r0 ^ r5
            r5 = 57
            long r6 = r2 >>> r5
            long r0 = r0 ^ r6
            r6 = 54
            long r7 = r2 >>> r6
            long r0 = r0 ^ r7
            r7 = 49
            long r8 = r2 >>> r7
            long r0 = r0 ^ r8
            r8 = 8
            r9 = r19[r8]
            r11 = 5
            long r12 = r2 << r11
            long r9 = r9 ^ r12
            r12 = 7
            long r13 = r2 << r12
            long r9 = r9 ^ r13
            r13 = 10
            long r14 = r2 << r13
            long r9 = r9 ^ r14
            r14 = 15
            long r2 = r2 << r14
            long r2 = r2 ^ r9
            r9 = 16
        L33:
            if (r9 < r13) goto L60
            r15 = r19[r9]
            int r10 = r9 + (-8)
            long r17 = r15 >>> r4
            long r2 = r2 ^ r17
            long r17 = r15 >>> r5
            long r2 = r2 ^ r17
            long r17 = r15 >>> r6
            long r2 = r2 ^ r17
            long r17 = r15 >>> r7
            long r2 = r2 ^ r17
            r20[r10] = r2
            int r2 = r9 + (-9)
            r2 = r19[r2]
            long r17 = r15 << r11
            long r2 = r2 ^ r17
            long r17 = r15 << r12
            long r2 = r2 ^ r17
            long r17 = r15 << r13
            long r2 = r2 ^ r17
            long r15 = r15 << r14
            long r2 = r2 ^ r15
            int r9 = r9 + (-1)
            goto L33
        L60:
            r9 = 1
            long r15 = r0 >>> r4
            long r2 = r2 ^ r15
            long r15 = r0 >>> r5
            long r2 = r2 ^ r15
            long r5 = r0 >>> r6
            long r2 = r2 ^ r5
            long r5 = r0 >>> r7
            long r2 = r2 ^ r5
            r20[r9] = r2
            r2 = 0
            r5 = r19[r2]
            long r9 = r0 << r11
            long r5 = r5 ^ r9
            long r9 = r0 << r12
            long r5 = r5 ^ r9
            long r9 = r0 << r13
            long r5 = r5 ^ r9
            long r0 = r0 << r14
            long r0 = r0 ^ r5
            r5 = r20[r8]
            long r3 = r5 >>> r4
            long r0 = r0 ^ r3
            r7 = 2
            long r9 = r3 << r7
            long r0 = r0 ^ r9
            long r9 = r3 << r11
            long r0 = r0 ^ r9
            long r3 = r3 << r13
            long r0 = r0 ^ r3
            r20[r2] = r0
            r0 = 576460752303423487(0x7ffffffffffffff, double:3.7857669957336787E-270)
            long r0 = r0 & r5
            r20[r8] = r0
            return
    }

    /* renamed from: m */
    public static void m12019m(long[] r11, int r12) {
            int r0 = r12 + 8
            r1 = r11[r0]
            r3 = 59
            long r3 = r1 >>> r3
            r5 = r11[r12]
            r7 = 2
            long r7 = r3 << r7
            long r7 = r7 ^ r3
            r9 = 5
            long r9 = r3 << r9
            long r7 = r7 ^ r9
            r9 = 10
            long r3 = r3 << r9
            long r3 = r3 ^ r7
            long r3 = r3 ^ r5
            r11[r12] = r3
            r3 = 576460752303423487(0x7ffffffffffffff, double:3.7857669957336787E-270)
            long r1 = r1 & r3
            r11[r0] = r1
            return
    }

    /* renamed from: n */
    public static void m12020n(long[] r1, long[] r2) {
            r0 = 18
            long[] r0 = new long[r0]
            m12013g(r1, r0)
            m12018l(r0, r2)
            return
    }

    /* renamed from: o */
    public static void m12021o(long[] r1, long[] r2) {
            r0 = 18
            long[] r0 = new long[r0]
            m12013g(r1, r0)
            m12010d(r2, r0, r2)
            return
    }

    /* renamed from: p */
    public static void m12022p(long[] r1, int r2, long[] r3) {
            r0 = 18
            long[] r0 = new long[r0]
            m12013g(r1, r0)
        L7:
            m12018l(r0, r3)
            int r2 = r2 + (-1)
            if (r2 <= 0) goto L12
            m12013g(r3, r0)
            goto L7
        L12:
            return
    }
}
