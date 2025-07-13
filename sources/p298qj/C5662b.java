package p298qj;

/* renamed from: qj.b */
/* loaded from: classes.dex */
public class C5662b {

    /* renamed from: a */
    public static final int[] f21967a = null;

    /* renamed from: b */
    public static final int[] f21968b = null;

    /* renamed from: c */
    public static final int[] f21969c = null;

    static {
            r0 = 4
            int[] r0 = new int[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [-1, -1, -1, -3} // fill-array
            p298qj.C5662b.f21967a = r0
            r0 = 8
            int[] r1 = new int[r0]
            r1 = {x0026: FILL_ARRAY_DATA , data: [1, 0, 0, 4, -2, -1, 3, -4} // fill-array
            p298qj.C5662b.f21968b = r1
            int[] r0 = new int[r0]
            r0 = {x003a: FILL_ARRAY_DATA , data: [-1, -1, -1, -5, 1, 0, -4, 3} // fill-array
            p298qj.C5662b.f21969c = r0
            return
    }

    /* renamed from: a */
    public static void m11948a(int[] r11, int[] r12, int[] r13) {
            r0 = 0
            r1 = r11[r0]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = r12[r0]
            long r5 = (long) r5
            long r5 = r5 & r3
            long r1 = r1 + r5
            r5 = 0
            long r1 = r1 + r5
            int r5 = (int) r1
            r13[r0] = r5
            r0 = 32
            long r1 = r1 >>> r0
            r5 = 1
            r6 = r11[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            r8 = r12[r5]
            long r8 = (long) r8
            long r8 = r8 & r3
            long r6 = r6 + r8
            long r6 = r6 + r1
            int r1 = (int) r6
            r13[r5] = r1
            long r1 = r6 >>> r0
            r6 = 2
            r7 = r11[r6]
            long r7 = (long) r7
            long r7 = r7 & r3
            r9 = r12[r6]
            long r9 = (long) r9
            long r9 = r9 & r3
            long r7 = r7 + r9
            long r7 = r7 + r1
            int r1 = (int) r7
            r13[r6] = r1
            long r1 = r7 >>> r0
            r6 = 3
            r11 = r11[r6]
            long r7 = (long) r11
            long r7 = r7 & r3
            r11 = r12[r6]
            long r11 = (long) r11
            long r11 = r11 & r3
            long r7 = r7 + r11
            long r7 = r7 + r1
            int r11 = (int) r7
            r13[r6] = r11
            long r11 = r7 >>> r0
            int r12 = (int) r11
            if (r12 != 0) goto L5b
            r11 = r13[r6]
            int r11 = r11 >>> r5
            r12 = 2147483646(0x7ffffffe, float:NaN)
            if (r11 < r12) goto L5e
            int[] r11 = p298qj.C5662b.f21967a
            boolean r11 = tj.AbstractC6255a.m12860q(r13, r11)
            if (r11 == 0) goto L5e
        L5b:
            m11949b(r13)
        L5e:
            return
    }

    /* renamed from: b */
    public static void m11949b(int[] r8) {
            r0 = 0
            r1 = r8[r0]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 1
            long r1 = r1 + r5
            int r5 = (int) r1
            r8[r0] = r5
            r0 = 32
            long r1 = r1 >> r0
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L2d
            r5 = 1
            r6 = r8[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            long r1 = r1 + r6
            int r6 = (int) r1
            r8[r5] = r6
            long r1 = r1 >> r0
            r5 = 2
            r6 = r8[r5]
            long r6 = (long) r6
            long r6 = r6 & r3
            long r1 = r1 + r6
            int r6 = (int) r1
            r8[r5] = r6
            long r1 = r1 >> r0
        L2d:
            r0 = 3
            r5 = r8[r0]
            long r5 = (long) r5
            long r3 = r3 & r5
            r5 = 2
            long r3 = r3 + r5
            long r3 = r3 + r1
            int r1 = (int) r3
            r8[r0] = r1
            return
    }

    /* renamed from: c */
    public static void m11950c(int[] r1, int[] r2, int[] r3) {
            r0 = 8
            int[] r0 = new int[r0]
            tj.AbstractC6255a.m12869z(r1, r2, r0)
            m11952e(r0, r3)
            return
    }

    /* renamed from: d */
    public static void m11951d(int[] r1, int[] r2) {
            boolean r0 = tj.AbstractC6255a.m12865v(r1)
            if (r0 == 0) goto L13
            r1 = 0
            r2[r1] = r1
            r0 = 1
            r2[r0] = r1
            r0 = 2
            r2[r0] = r1
            r0 = 3
            r2[r0] = r1
            goto L18
        L13:
            int[] r0 = p298qj.C5662b.f21967a
            tj.AbstractC6255a.m12838F(r0, r1, r2)
        L18:
            return
    }

    /* renamed from: e */
    public static void m11952e(int[] r22, int[] r23) {
            r0 = r23
            r1 = 0
            r2 = r22[r1]
            long r2 = (long) r2
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            r6 = 1
            r7 = r22[r6]
            long r7 = (long) r7
            long r7 = r7 & r4
            r9 = 2
            r10 = r22[r9]
            long r10 = (long) r10
            long r10 = r10 & r4
            r12 = 3
            r13 = r22[r12]
            long r13 = (long) r13
            long r13 = r13 & r4
            r15 = 4
            r15 = r22[r15]
            r16 = r2
            long r1 = (long) r15
            long r1 = r1 & r4
            r3 = 5
            r3 = r22[r3]
            r18 = r10
            long r9 = (long) r3
            long r9 = r9 & r4
            r3 = 6
            r3 = r22[r3]
            r20 = r7
            long r6 = (long) r3
            long r6 = r6 & r4
            r3 = 7
            r3 = r22[r3]
            long r11 = (long) r3
            long r3 = r11 & r4
            long r13 = r13 + r3
            r5 = 1
            long r3 = r3 << r5
            long r6 = r6 + r3
            long r3 = r18 + r6
            long r6 = r6 << r5
            long r9 = r9 + r6
            long r6 = r20 + r9
            long r9 = r9 << r5
            long r1 = r1 + r9
            long r9 = r16 + r1
            long r1 = r1 << r5
            long r13 = r13 + r1
            int r1 = (int) r9
            r2 = 0
            r0[r2] = r1
            r1 = 32
            long r9 = r9 >>> r1
            long r6 = r6 + r9
            int r2 = (int) r6
            r0[r5] = r2
            long r5 = r6 >>> r1
            long r3 = r3 + r5
            int r2 = (int) r3
            r5 = 2
            r0[r5] = r2
            long r2 = r3 >>> r1
            long r13 = r13 + r2
            int r2 = (int) r13
            r3 = 3
            r0[r3] = r2
            long r1 = r13 >>> r1
            int r2 = (int) r1
            m11953f(r2, r0)
            return
    }

    /* renamed from: f */
    public static void m11953f(int r11, int[] r12) {
        L0:
            if (r11 == 0) goto L3e
            long r0 = (long) r11
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r11 = 0
            r4 = r12[r11]
            long r4 = (long) r4
            long r4 = r4 & r2
            long r4 = r4 + r0
            int r6 = (int) r4
            r12[r11] = r6
            r11 = 32
            long r4 = r4 >> r11
            r6 = 0
            r8 = 1
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L2f
            r6 = r12[r8]
            long r6 = (long) r6
            long r6 = r6 & r2
            long r4 = r4 + r6
            int r6 = (int) r4
            r12[r8] = r6
            long r4 = r4 >> r11
            r6 = 2
            r7 = r12[r6]
            long r9 = (long) r7
            long r9 = r9 & r2
            long r4 = r4 + r9
            int r7 = (int) r4
            r12[r6] = r7
            long r4 = r4 >> r11
        L2f:
            r6 = 3
            r7 = r12[r6]
            long r9 = (long) r7
            long r2 = r2 & r9
            long r0 = r0 << r8
            long r2 = r2 + r0
            long r2 = r2 + r4
            int r0 = (int) r2
            r12[r6] = r0
            long r0 = r2 >> r11
            int r11 = (int) r0
            goto L0
        L3e:
            return
    }

    /* renamed from: g */
    public static void m11954g(int[] r1, int[] r2) {
            r0 = 8
            int[] r0 = new int[r0]
            tj.AbstractC6255a.m12835C(r1, r0)
            m11952e(r0, r2)
            return
    }

    /* renamed from: h */
    public static void m11955h(int[] r1, int r2, int[] r3) {
            r0 = 8
            int[] r0 = new int[r0]
            tj.AbstractC6255a.m12835C(r1, r0)
        L7:
            m11952e(r0, r3)
            int r2 = r2 + (-1)
            if (r2 <= 0) goto L12
            tj.AbstractC6255a.m12835C(r3, r0)
            goto L7
        L12:
            return
    }

    /* renamed from: i */
    public static void m11956i(int[] r6, int[] r7, int[] r8) {
            int r6 = tj.AbstractC6255a.m12838F(r6, r7, r8)
            if (r6 == 0) goto L3f
            r6 = 0
            r7 = r8[r6]
            long r0 = (long) r7
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r4 = 1
            long r0 = r0 - r4
            int r7 = (int) r0
            r8[r6] = r7
            r6 = 32
            long r0 = r0 >> r6
            r4 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 == 0) goto L33
            r7 = 1
            r4 = r8[r7]
            long r4 = (long) r4
            long r4 = r4 & r2
            long r0 = r0 + r4
            int r4 = (int) r0
            r8[r7] = r4
            long r0 = r0 >> r6
            r7 = 2
            r4 = r8[r7]
            long r4 = (long) r4
            long r4 = r4 & r2
            long r0 = r0 + r4
            int r4 = (int) r0
            r8[r7] = r4
            long r0 = r0 >> r6
        L33:
            r6 = 3
            r7 = r8[r6]
            long r4 = (long) r7
            long r2 = r2 & r4
            r4 = 2
            long r2 = r2 - r4
            long r2 = r2 + r0
            int r7 = (int) r2
            r8[r6] = r7
        L3f:
            return
    }
}
