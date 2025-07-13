package p261oj;

/* renamed from: oj.b */
/* loaded from: classes.dex */
public class C5306b {

    /* renamed from: a */
    public static final int[] f20555a = null;

    /* renamed from: b */
    public static final int[] f20556b = null;

    static {
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [-19, -1, -1, -1, -1, -1, -1, 2147483647} // fill-array
            p261oj.C5306b.f20555a = r0
            r0 = 16
            int[] r0 = new int[r0]
            r0 = {x0028: FILL_ARRAY_DATA , data: [361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823} // fill-array
            p261oj.C5306b.f20556b = r0
            return
    }

    /* renamed from: a */
    public static void m11613a(int[] r1, int[] r2, int[] r3) {
            r0 = 16
            int[] r0 = new int[r0]
            tj.AbstractC6255a.m12833A(r1, r2, r0)
            m11614b(r0, r3)
            return
    }

    /* renamed from: b */
    public static void m11614b(int[] r17, int[] r18) {
            r0 = r18
            r1 = 7
            r2 = r17[r1]
            r3 = 0
            r5 = r2
            r4 = 0
        L8:
            r6 = 8
            if (r4 >= r6) goto L1d
            int r6 = r4 + 8
            r6 = r17[r6]
            int r7 = r3 + r4
            int r8 = r6 << 1
            int r5 = r5 >>> 31
            r5 = r5 | r8
            r0[r7] = r5
            int r4 = r4 + 1
            r5 = r6
            goto L8
        L1d:
            r4 = 19
            long r5 = (long) r4
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            r9 = r0[r3]
            long r9 = (long) r9
            long r9 = r9 & r7
            long r9 = r9 * r5
            r11 = r17[r3]
            long r11 = (long) r11
            long r11 = r11 & r7
            long r9 = r9 + r11
            r11 = 0
            long r9 = r9 + r11
            int r11 = (int) r9
            r0[r3] = r11
            r3 = 32
            long r9 = r9 >>> r3
            r11 = 1
            r12 = r0[r11]
            long r12 = (long) r12
            long r12 = r12 & r7
            long r12 = r12 * r5
            r14 = r17[r11]
            long r14 = (long) r14
            long r14 = r14 & r7
            long r12 = r12 + r14
            long r12 = r12 + r9
            int r9 = (int) r12
            r0[r11] = r9
            long r9 = r12 >>> r3
            r12 = 2
            r13 = r0[r12]
            long r13 = (long) r13
            long r13 = r13 & r7
            long r13 = r13 * r5
            r15 = r17[r12]
            r16 = r2
            long r1 = (long) r15
            long r1 = r1 & r7
            long r13 = r13 + r1
            long r13 = r13 + r9
            int r1 = (int) r13
            r0[r12] = r1
            long r1 = r13 >>> r3
            r9 = 3
            r10 = r0[r9]
            long r12 = (long) r10
            long r12 = r12 & r7
            long r12 = r12 * r5
            r10 = r17[r9]
            long r14 = (long) r10
            long r14 = r14 & r7
            long r12 = r12 + r14
            long r12 = r12 + r1
            int r1 = (int) r12
            r0[r9] = r1
            long r1 = r12 >>> r3
            r9 = 4
            r10 = r0[r9]
            long r12 = (long) r10
            long r12 = r12 & r7
            long r12 = r12 * r5
            r10 = r17[r9]
            long r14 = (long) r10
            long r14 = r14 & r7
            long r12 = r12 + r14
            long r12 = r12 + r1
            int r1 = (int) r12
            r0[r9] = r1
            long r1 = r12 >>> r3
            r9 = 5
            r10 = r0[r9]
            long r12 = (long) r10
            long r12 = r12 & r7
            long r12 = r12 * r5
            r10 = r17[r9]
            long r14 = (long) r10
            long r14 = r14 & r7
            long r12 = r12 + r14
            long r12 = r12 + r1
            int r1 = (int) r12
            r0[r9] = r1
            long r1 = r12 >>> r3
            r9 = 6
            r10 = r0[r9]
            long r12 = (long) r10
            long r12 = r12 & r7
            long r12 = r12 * r5
            r10 = r17[r9]
            long r14 = (long) r10
            long r14 = r14 & r7
            long r12 = r12 + r14
            long r12 = r12 + r1
            int r1 = (int) r12
            r0[r9] = r1
            long r1 = r12 >>> r3
            r9 = 7
            r10 = r0[r9]
            long r12 = (long) r10
            long r12 = r12 & r7
            long r5 = r5 * r12
            r10 = r17[r9]
            long r12 = (long) r10
            long r7 = r7 & r12
            long r5 = r5 + r7
            long r5 = r5 + r1
            int r1 = (int) r5
            r0[r9] = r1
            long r1 = r5 >>> r3
            int r2 = (int) r1
            int r1 = r2 << 1
            r2 = r0[r9]
            int r3 = r2 >>> 31
            int r5 = r16 >>> 31
            int r3 = r3 - r5
            int r3 = r3 + r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r2
            int r3 = r3 * 19
            int r2 = p085f1.AbstractC1972m.m5006k(r9, r3, r0)
            int r2 = r2 + r1
            r0[r9] = r2
            int[] r1 = p261oj.C5306b.f20555a
            boolean r1 = tj.AbstractC6255a.m12861r(r0, r1)
            if (r1 == 0) goto Ldd
            m11618f(r18)
        Ldd:
            return
    }

    /* renamed from: c */
    public static void m11615c(int r3, int[] r4) {
            r0 = 7
            r1 = r4[r0]
            int r3 = r3 << 1
            int r2 = r1 >>> 31
            r3 = r3 | r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r2
            int r3 = r3 * 19
            int r3 = p085f1.AbstractC1972m.m5006k(r0, r3, r4)
            int r3 = r3 + r1
            r4[r0] = r3
            int[] r3 = p261oj.C5306b.f20555a
            boolean r3 = tj.AbstractC6255a.m12861r(r4, r3)
            if (r3 == 0) goto L20
            m11618f(r4)
        L20:
            return
    }

    /* renamed from: d */
    public static void m11616d(int[] r1, int[] r2) {
            r0 = 16
            int[] r0 = new int[r0]
            tj.AbstractC6255a.m12836D(r1, r0)
            m11614b(r0, r2)
            return
    }

    /* renamed from: e */
    public static void m11617e(int[] r1, int r2, int[] r3) {
            r0 = 16
            int[] r0 = new int[r0]
            tj.AbstractC6255a.m12836D(r1, r0)
        L7:
            m11614b(r0, r3)
            int r2 = r2 + (-1)
            if (r2 <= 0) goto L12
            tj.AbstractC6255a.m12836D(r3, r0)
            goto L7
        L12:
            return
    }

    /* renamed from: f */
    public static int m11618f(int[] r9) {
            r0 = 0
            r1 = r9[r0]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 19
            long r1 = r1 + r5
            int r5 = (int) r1
            r9[r0] = r5
            r0 = 32
            long r1 = r1 >> r0
            r5 = 7
            r6 = 0
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 == 0) goto L20
            r1 = 1
            int r1 = p085f1.AbstractC1972m.m4967B(r5, r9, r1)
            long r1 = (long) r1
        L20:
            r6 = r9[r5]
            long r6 = (long) r6
            long r3 = r3 & r6
            r6 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r3 = r3 - r6
            long r3 = r3 + r1
            int r1 = (int) r3
            r9[r5] = r1
            long r0 = r3 >> r0
            int r9 = (int) r0
            return r9
    }

    /* renamed from: g */
    public static void m11619g(int[] r6, int[] r7, int[] r8) {
            int r6 = tj.AbstractC6255a.m12839G(r6, r7, r8)
            if (r6 == 0) goto L36
            r6 = 0
            r7 = r8[r6]
            long r0 = (long) r7
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r4 = 19
            long r0 = r0 - r4
            int r7 = (int) r0
            r8[r6] = r7
            r6 = 32
            long r6 = r0 >> r6
            r0 = 7
            r4 = 0
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L27
            r6 = 1
            int r6 = p085f1.AbstractC1972m.m5009n(r0, r8, r6)
            long r6 = (long) r6
        L27:
            r1 = r8[r0]
            long r4 = (long) r1
            long r1 = r2 & r4
            r3 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r1 = r1 + r3
            long r1 = r1 + r6
            int r6 = (int) r1
            r8[r0] = r6
        L36:
            return
    }

    /* renamed from: h */
    public static void m11620h(int[] r2, int[] r3) {
            r0 = 8
            r1 = 0
            p085f1.AbstractC1972m.m4978M(r0, r2, r1, r3)
            int[] r2 = p261oj.C5306b.f20555a
            boolean r2 = tj.AbstractC6255a.m12861r(r3, r2)
            if (r2 == 0) goto L11
            m11618f(r3)
        L11:
            return
    }
}
