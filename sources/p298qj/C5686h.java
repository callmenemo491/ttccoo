package p298qj;

/* renamed from: qj.h */
/* loaded from: classes.dex */
public class C5686h {

    /* renamed from: a */
    public static final int[] f22017a = null;

    /* renamed from: b */
    public static final int[] f22018b = null;

    /* renamed from: c */
    public static final int[] f22019c = null;

    static {
            r0 = 5
            int[] r0 = new int[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [2147483647, -1, -1, -1, -1} // fill-array
            p298qj.C5686h.f22017a = r0
            r0 = 10
            int[] r0 = new int[r0]
            r0 = {x0028: FILL_ARRAY_DATA , data: [1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1} // fill-array
            p298qj.C5686h.f22018b = r0
            r0 = 7
            int[] r0 = new int[r0]
            r0 = {x0040: FILL_ARRAY_DATA , data: [-1, -1073741826, -1, -1, -1, 1, 1} // fill-array
            p298qj.C5686h.f22019c = r0
            return
    }

    /* renamed from: a */
    public static void m11982a(int[] r0, int[] r1, int[] r2) {
            int r0 = p139i1.AbstractC3061d.m7471a(r0, r1, r2)
            if (r0 != 0) goto L14
            r0 = 4
            r0 = r2[r0]
            r1 = -1
            if (r0 != r1) goto L1b
            int[] r0 = p298qj.C5686h.f22017a
            boolean r0 = p139i1.AbstractC3061d.m7479i(r2, r0)
            if (r0 == 0) goto L1b
        L14:
            r0 = 5
            r1 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            p085f1.AbstractC1972m.m5006k(r0, r1, r2)
        L1b:
            return
    }

    /* renamed from: b */
    public static void m11983b(int[] r1, int[] r2, int[] r3) {
            r0 = 10
            int[] r0 = new int[r0]
            p139i1.AbstractC3061d.m7484n(r1, r2, r0)
            m11984c(r0, r3)
            return
    }

    /* renamed from: c */
    public static void m11984c(int[] r17, int[] r18) {
            r0 = r18
            r1 = 5
            r1 = r17[r1]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 6
            r5 = r17[r5]
            long r5 = (long) r5
            long r5 = r5 & r3
            r7 = 7
            r7 = r17[r7]
            long r7 = (long) r7
            long r7 = r7 & r3
            r9 = 8
            r9 = r17[r9]
            long r9 = (long) r9
            long r9 = r9 & r3
            r11 = 9
            r11 = r17[r11]
            long r11 = (long) r11
            long r11 = r11 & r3
            r13 = 0
            r14 = r17[r13]
            long r14 = (long) r14
            long r14 = r14 & r3
            long r14 = r14 + r1
            r16 = 31
            long r1 = r1 << r16
            long r14 = r14 + r1
            r1 = 0
            long r14 = r14 + r1
            int r1 = (int) r14
            r0[r13] = r1
            r1 = 32
            long r13 = r14 >>> r1
            r2 = 1
            r15 = r17[r2]
            long r1 = (long) r15
            long r1 = r1 & r3
            long r1 = r1 + r5
            long r5 = r5 << r16
            long r1 = r1 + r5
            long r1 = r1 + r13
            int r5 = (int) r1
            r6 = 1
            r0[r6] = r5
            r5 = 32
            long r1 = r1 >>> r5
            r6 = 2
            r13 = r17[r6]
            long r13 = (long) r13
            long r13 = r13 & r3
            long r13 = r13 + r7
            long r7 = r7 << r16
            long r13 = r13 + r7
            long r13 = r13 + r1
            int r1 = (int) r13
            r0[r6] = r1
            long r1 = r13 >>> r5
            r6 = 3
            r7 = r17[r6]
            long r7 = (long) r7
            long r7 = r7 & r3
            long r7 = r7 + r9
            long r9 = r9 << r16
            long r7 = r7 + r9
            long r7 = r7 + r1
            int r1 = (int) r7
            r0[r6] = r1
            long r1 = r7 >>> r5
            r6 = 4
            r7 = r17[r6]
            long r7 = (long) r7
            long r3 = r3 & r7
            long r3 = r3 + r11
            long r7 = r11 << r16
            long r3 = r3 + r7
            long r3 = r3 + r1
            int r1 = (int) r3
            r0[r6] = r1
            long r1 = r3 >>> r5
            int r2 = (int) r1
            m11985d(r2, r0)
            return
    }

    /* renamed from: d */
    public static void m11985d(int r12, int[] r13) {
            r0 = 5
            r1 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r12 == 0) goto L37
            long r2 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r6 = (long) r12
            long r6 = r6 & r4
            long r6 = r6 * r2
            r12 = 0
            r2 = r13[r12]
            long r2 = (long) r2
            long r2 = r2 & r4
            long r6 = r6 + r2
            r2 = 0
            long r6 = r6 + r2
            int r8 = (int) r6
            r13[r12] = r8
            r8 = 32
            long r6 = r6 >>> r8
            r9 = 1
            r10 = r13[r9]
            long r10 = (long) r10
            long r4 = r4 & r10
            long r6 = r6 + r4
            int r4 = (int) r6
            r13[r9] = r4
            long r4 = r6 >>> r8
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L30
            goto L35
        L30:
            r2 = 2
            int r12 = p085f1.AbstractC1972m.m4968C(r0, r13, r12, r2)
        L35:
            if (r12 != 0) goto L45
        L37:
            r12 = 4
            r12 = r13[r12]
            r2 = -1
            if (r12 != r2) goto L48
            int[] r12 = p298qj.C5686h.f22017a
            boolean r12 = p139i1.AbstractC3061d.m7479i(r13, r12)
            if (r12 == 0) goto L48
        L45:
            p085f1.AbstractC1972m.m5006k(r0, r1, r13)
        L48:
            return
    }

    /* renamed from: e */
    public static void m11986e(int[] r1, int[] r2) {
            r0 = 10
            int[] r0 = new int[r0]
            p139i1.AbstractC3061d.m7486p(r1, r0)
            m11984c(r0, r2)
            return
    }

    /* renamed from: f */
    public static void m11987f(int[] r1, int r2, int[] r3) {
            r0 = 10
            int[] r0 = new int[r0]
            p139i1.AbstractC3061d.m7486p(r1, r0)
        L7:
            m11984c(r0, r3)
            int r2 = r2 + (-1)
            if (r2 <= 0) goto L12
            p139i1.AbstractC3061d.m7486p(r3, r0)
            goto L7
        L12:
            return
    }

    /* renamed from: g */
    public static void m11988g(int[] r7, int[] r8, int[] r9) {
            int r7 = p139i1.AbstractC3061d.m7487q(r7, r8, r9)
            if (r7 == 0) goto L29
            r7 = 5
            r8 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r0 = 0
            r1 = r9[r0]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            long r5 = (long) r8
            long r3 = r3 & r5
            long r1 = r1 - r3
            int r8 = (int) r1
            r9[r0] = r8
            r8 = 32
            long r0 = r1 >> r8
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L25
            goto L29
        L25:
            r8 = 1
            p085f1.AbstractC1972m.m5009n(r7, r9, r8)
        L29:
            return
    }
}
