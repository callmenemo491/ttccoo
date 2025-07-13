package p298qj;

/* renamed from: qj.l */
/* loaded from: classes.dex */
public class C5702l {

    /* renamed from: a */
    public static final int[] f22052a = null;

    /* renamed from: b */
    public static final int[] f22053b = null;

    /* renamed from: c */
    public static final int[] f22054c = null;

    static {
            r0 = 5
            int[] r0 = new int[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [-21389, -2, -1, -1, -1} // fill-array
            p298qj.C5702l.f22052a = r0
            r0 = 10
            int[] r0 = new int[r0]
            r0 = {x0028: FILL_ARRAY_DATA , data: [457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1} // fill-array
            p298qj.C5702l.f22053b = r0
            r0 = 7
            int[] r0 = new int[r0]
            r0 = {x0040: FILL_ARRAY_DATA , data: [-457489321, -42779, -2, -1, -1, 42777, 2} // fill-array
            p298qj.C5702l.f22054c = r0
            return
    }

    /* renamed from: a */
    public static void m11997a(int[] r0, int[] r1, int[] r2) {
            int r0 = p139i1.AbstractC3061d.m7471a(r0, r1, r2)
            if (r0 != 0) goto L14
            r0 = 4
            r0 = r2[r0]
            r1 = -1
            if (r0 != r1) goto L1a
            int[] r0 = p298qj.C5702l.f22052a
            boolean r0 = p139i1.AbstractC3061d.m7479i(r2, r0)
            if (r0 == 0) goto L1a
        L14:
            r0 = 5
            r1 = 21389(0x538d, float:2.9972E-41)
            p085f1.AbstractC1972m.m4996c(r0, r1, r2)
        L1a:
            return
    }

    /* renamed from: b */
    public static void m11998b(int[] r1, int[] r2, int[] r3) {
            r0 = 10
            int[] r0 = new int[r0]
            p139i1.AbstractC3061d.m7484n(r1, r2, r0)
            m12001e(r0, r3)
            return
    }

    /* renamed from: c */
    public static void m11999c(int[] r1, int[] r2, int[] r3) {
            int r1 = p139i1.AbstractC3061d.m7485o(r1, r2, r3)
            r2 = 10
            if (r1 != 0) goto L17
            r1 = 9
            r1 = r3[r1]
            r0 = -1
            if (r1 != r0) goto L24
            int[] r1 = p298qj.C5702l.f22053b
            boolean r1 = p085f1.AbstractC1972m.m5019x(r2, r3, r1)
            if (r1 == 0) goto L24
        L17:
            int[] r1 = p298qj.C5702l.f22054c
            int r0 = r1.length
            int r0 = p085f1.AbstractC1972m.m5002g(r0, r1, r3)
            if (r0 == 0) goto L24
            int r1 = r1.length
            p085f1.AbstractC1972m.m4967B(r2, r3, r1)
        L24:
            return
    }

    /* renamed from: d */
    public static void m12000d(int[] r1, int[] r2) {
            boolean r0 = p139i1.AbstractC3061d.m7481k(r1)
            if (r0 == 0) goto La
            p139i1.AbstractC3061d.m7490t(r2)
            goto Lf
        La:
            int[] r0 = p298qj.C5702l.f22052a
            p139i1.AbstractC3061d.m7487q(r0, r1, r2)
        Lf:
            return
    }

    /* renamed from: e */
    public static void m12001e(int[] r22, int[] r23) {
            r0 = r23
            r1 = 21389(0x538d, float:2.9972E-41)
            long r2 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            r6 = 5
            r7 = r22[r6]
            long r7 = (long) r7
            long r7 = r7 & r4
            long r9 = r2 * r7
            r11 = 0
            r12 = r22[r11]
            long r12 = (long) r12
            long r12 = r12 & r4
            long r9 = r9 + r12
            r12 = 0
            long r9 = r9 + r12
            int r14 = (int) r9
            r0[r11] = r14
            r14 = 32
            long r9 = r9 >>> r14
            r15 = 6
            r15 = r22[r15]
            long r12 = (long) r15
            long r12 = r12 & r4
            long r16 = r2 * r12
            long r16 = r16 + r7
            r7 = 1
            r8 = r22[r7]
            r18 = r12
            long r11 = (long) r8
            long r11 = r11 & r4
            long r16 = r16 + r11
            long r8 = r16 + r9
            int r10 = (int) r8
            r0[r7] = r10
            long r8 = r8 >>> r14
            r10 = 7
            r10 = r22[r10]
            long r10 = (long) r10
            long r10 = r10 & r4
            long r12 = r2 * r10
            long r12 = r12 + r18
            r16 = 2
            r15 = r22[r16]
            long r6 = (long) r15
            long r6 = r6 & r4
            long r12 = r12 + r6
            long r12 = r12 + r8
            int r6 = (int) r12
            r0[r16] = r6
            long r6 = r12 >>> r14
            r8 = 8
            r8 = r22[r8]
            long r8 = (long) r8
            long r8 = r8 & r4
            long r12 = r2 * r8
            long r12 = r12 + r10
            r10 = 3
            r11 = r22[r10]
            r20 = r2
            long r1 = (long) r11
            long r1 = r1 & r4
            long r12 = r12 + r1
            long r12 = r12 + r6
            int r1 = (int) r12
            r0[r10] = r1
            long r1 = r12 >>> r14
            r3 = 9
            r3 = r22[r3]
            long r6 = (long) r3
            long r6 = r6 & r4
            long r11 = r20 * r6
            long r11 = r11 + r8
            r3 = 4
            r8 = r22[r3]
            long r8 = (long) r8
            long r8 = r8 & r4
            long r11 = r11 + r8
            long r11 = r11 + r1
            int r1 = (int) r11
            r0[r3] = r1
            long r1 = r11 >>> r14
            long r1 = r1 + r6
            long r6 = r1 & r4
            long r8 = r20 * r6
            r11 = 0
            r12 = r0[r11]
            long r12 = (long) r12
            long r12 = r12 & r4
            long r8 = r8 + r12
            r12 = 0
            long r8 = r8 + r12
            int r12 = (int) r8
            r0[r11] = r12
            long r8 = r8 >>> r14
            long r1 = r1 >>> r14
            long r11 = r20 * r1
            long r11 = r11 + r6
            r6 = 1
            r7 = r0[r6]
            long r14 = (long) r7
            long r14 = r14 & r4
            long r11 = r11 + r14
            long r11 = r11 + r8
            int r7 = (int) r11
            r0[r6] = r7
            r6 = 32
            long r7 = r11 >>> r6
            r9 = r0[r16]
            long r11 = (long) r9
            long r11 = r11 & r4
            long r1 = r1 + r11
            long r1 = r1 + r7
            int r7 = (int) r1
            r0[r16] = r7
            long r1 = r1 >>> r6
            r7 = r0[r10]
            long r7 = (long) r7
            long r4 = r4 & r7
            long r1 = r1 + r4
            int r4 = (int) r1
            r0[r10] = r4
            long r1 = r1 >>> r6
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto Lba
            r11 = 0
            goto Lc0
        Lba:
            r1 = 5
            r2 = 0
            int r11 = p085f1.AbstractC1972m.m4968C(r1, r0, r2, r3)
        Lc0:
            if (r11 != 0) goto Lcf
            r1 = r0[r3]
            r2 = -1
            if (r1 != r2) goto Ld5
            int[] r1 = p298qj.C5702l.f22052a
            boolean r1 = p139i1.AbstractC3061d.m7479i(r0, r1)
            if (r1 == 0) goto Ld5
        Lcf:
            r1 = 21389(0x538d, float:2.9972E-41)
            r2 = 5
            p085f1.AbstractC1972m.m4996c(r2, r1, r0)
        Ld5:
            return
    }

    /* renamed from: f */
    public static void m12002f(int r14, int[] r15) {
            r0 = 5
            r1 = 21389(0x538d, float:2.9972E-41)
            if (r14 == 0) goto L41
            long r2 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r6 = (long) r14
            long r6 = r6 & r4
            long r2 = r2 * r6
            r14 = 0
            r8 = r15[r14]
            long r8 = (long) r8
            long r8 = r8 & r4
            long r2 = r2 + r8
            r8 = 0
            long r2 = r2 + r8
            int r10 = (int) r2
            r15[r14] = r10
            r10 = 32
            long r2 = r2 >>> r10
            r11 = 1
            r12 = r15[r11]
            long r12 = (long) r12
            long r12 = r12 & r4
            long r6 = r6 + r12
            long r6 = r6 + r2
            int r2 = (int) r6
            r15[r11] = r2
            long r2 = r6 >>> r10
            r6 = 2
            r7 = r15[r6]
            long r11 = (long) r7
            long r4 = r4 & r11
            long r2 = r2 + r4
            int r4 = (int) r2
            r15[r6] = r4
            long r2 = r2 >>> r10
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 != 0) goto L3a
            goto L3f
        L3a:
            r2 = 3
            int r14 = p085f1.AbstractC1972m.m4968C(r0, r15, r14, r2)
        L3f:
            if (r14 != 0) goto L4f
        L41:
            r14 = 4
            r14 = r15[r14]
            r2 = -1
            if (r14 != r2) goto L52
            int[] r14 = p298qj.C5702l.f22052a
            boolean r14 = p139i1.AbstractC3061d.m7479i(r15, r14)
            if (r14 == 0) goto L52
        L4f:
            p085f1.AbstractC1972m.m4996c(r0, r1, r15)
        L52:
            return
    }

    /* renamed from: g */
    public static void m12003g(int[] r1, int[] r2) {
            r0 = 10
            int[] r0 = new int[r0]
            p139i1.AbstractC3061d.m7486p(r1, r0)
            m12001e(r0, r2)
            return
    }

    /* renamed from: h */
    public static void m12004h(int[] r1, int r2, int[] r3) {
            r0 = 10
            int[] r0 = new int[r0]
            p139i1.AbstractC3061d.m7486p(r1, r0)
        L7:
            m12001e(r0, r3)
            int r2 = r2 + (-1)
            if (r2 <= 0) goto L12
            p139i1.AbstractC3061d.m7486p(r3, r0)
            goto L7
        L12:
            return
    }

    /* renamed from: i */
    public static void m12005i(int[] r0, int[] r1, int[] r2) {
            int r0 = p139i1.AbstractC3061d.m7487q(r0, r1, r2)
            if (r0 == 0) goto Lc
            r0 = 5
            r1 = 21389(0x538d, float:2.9972E-41)
            p085f1.AbstractC1972m.m4987V(r0, r1, r2)
        Lc:
            return
    }

    /* renamed from: j */
    public static void m12006j(int[] r2, int[] r3) {
            r0 = 5
            r1 = 0
            int r2 = p085f1.AbstractC1972m.m4978M(r0, r2, r1, r3)
            if (r2 != 0) goto L16
            r2 = 4
            r2 = r3[r2]
            r1 = -1
            if (r2 != r1) goto L1b
            int[] r2 = p298qj.C5702l.f22052a
            boolean r2 = p139i1.AbstractC3061d.m7479i(r3, r2)
            if (r2 == 0) goto L1b
        L16:
            r2 = 21389(0x538d, float:2.9972E-41)
            p085f1.AbstractC1972m.m4996c(r0, r2, r3)
        L1b:
            return
    }
}
