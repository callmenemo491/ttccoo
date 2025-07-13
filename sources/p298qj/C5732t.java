package p298qj;

/* renamed from: qj.t */
/* loaded from: classes.dex */
public class C5732t {

    /* renamed from: a */
    public static final int[] f22116a = null;

    /* renamed from: b */
    public static final int[] f22117b = null;

    /* renamed from: c */
    public static final int[] f22118c = null;

    static {
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [-1, -1, -2, -1, -1, -1} // fill-array
            p298qj.C5732t.f22116a = r0
            r0 = 12
            int[] r0 = new int[r0]
            r0 = {x002c: FILL_ARRAY_DATA , data: [1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1} // fill-array
            p298qj.C5732t.f22117b = r0
            r0 = 9
            int[] r0 = new int[r0]
            r0 = {x0048: FILL_ARRAY_DATA , data: [-1, -1, -3, -1, -2, -1, 1, 0, 2} // fill-array
            p298qj.C5732t.f22118c = r0
            return
    }

    /* renamed from: a */
    public static void m12044a(int[] r0, int[] r1, int[] r2) {
            int r0 = p085f1.AbstractC1972m.m4994b(r0, r1, r2)
            if (r0 != 0) goto L14
            r0 = 5
            r0 = r2[r0]
            r1 = -1
            if (r0 != r1) goto L17
            int[] r0 = p298qj.C5732t.f22116a
            boolean r0 = p085f1.AbstractC1972m.m5020y(r2, r0)
            if (r0 == 0) goto L17
        L14:
            m12045b(r2)
        L17:
            return
    }

    /* renamed from: b */
    public static void m12045b(int[] r12) {
            r0 = 0
            r1 = r12[r0]
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 1
            long r1 = r1 + r5
            int r7 = (int) r1
            r12[r0] = r7
            r0 = 32
            long r1 = r1 >> r0
            r7 = 0
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 == 0) goto L23
            r9 = 1
            r10 = r12[r9]
            long r10 = (long) r10
            long r10 = r10 & r3
            long r1 = r1 + r10
            int r10 = (int) r1
            r12[r9] = r10
            long r1 = r1 >> r0
        L23:
            r9 = 2
            r10 = r12[r9]
            long r10 = (long) r10
            long r3 = r3 & r10
            long r3 = r3 + r5
            long r3 = r3 + r1
            int r1 = (int) r3
            r12[r9] = r1
            long r0 = r3 >> r0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L38
            r0 = 6
            r1 = 3
            p085f1.AbstractC1972m.m4967B(r0, r12, r1)
        L38:
            return
    }

    /* renamed from: c */
    public static void m12046c(int[] r1, int[] r2, int[] r3) {
            r0 = 12
            int[] r0 = new int[r0]
            p085f1.AbstractC1972m.m4975J(r1, r2, r0)
            m12047d(r0, r3)
            return
    }

    /* renamed from: d */
    public static void m12047d(int[] r26, int[] r27) {
            r0 = r27
            r1 = 6
            r2 = r26[r1]
            long r2 = (long) r2
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            r6 = 7
            r6 = r26[r6]
            long r6 = (long) r6
            long r6 = r6 & r4
            r8 = 8
            r8 = r26[r8]
            long r8 = (long) r8
            long r8 = r8 & r4
            r10 = 9
            r10 = r26[r10]
            long r10 = (long) r10
            long r10 = r10 & r4
            r12 = 10
            r12 = r26[r12]
            long r12 = (long) r12
            long r12 = r12 & r4
            r14 = 11
            r14 = r26[r14]
            long r14 = (long) r14
            long r14 = r14 & r4
            long r12 = r12 + r2
            long r14 = r14 + r6
            r16 = 0
            r1 = r26[r16]
            r17 = r6
            long r6 = (long) r1
            long r6 = r6 & r4
            long r6 = r6 + r12
            r19 = 0
            long r6 = r6 + r19
            int r1 = (int) r6
            r21 = 32
            long r6 = r6 >> r21
            r22 = 1
            r23 = r1
            r1 = r26[r22]
            r24 = r2
            long r1 = (long) r1
            long r1 = r1 & r4
            long r1 = r1 + r14
            long r1 = r1 + r6
            int r3 = (int) r1
            r0[r22] = r3
            long r1 = r1 >> r21
            long r12 = r12 + r8
            long r14 = r14 + r10
            r3 = 2
            r6 = r26[r3]
            long r6 = (long) r6
            long r6 = r6 & r4
            long r6 = r6 + r12
            long r6 = r6 + r1
            long r1 = r6 & r4
            long r6 = r6 >> r21
            r8 = 3
            r9 = r26[r8]
            long r9 = (long) r9
            long r9 = r9 & r4
            long r9 = r9 + r14
            long r9 = r9 + r6
            int r6 = (int) r9
            r0[r8] = r6
            long r6 = r9 >> r21
            long r12 = r12 - r24
            long r14 = r14 - r17
            r9 = 4
            r10 = r26[r9]
            long r10 = (long) r10
            long r10 = r10 & r4
            long r10 = r10 + r12
            long r10 = r10 + r6
            int r6 = (int) r10
            r0[r9] = r6
            long r6 = r10 >> r21
            r9 = 5
            r10 = r26[r9]
            long r10 = (long) r10
            long r10 = r10 & r4
            long r10 = r10 + r14
            long r10 = r10 + r6
            int r6 = (int) r10
            r0[r9] = r6
            long r6 = r10 >> r21
            long r1 = r1 + r6
            r10 = r23
            long r10 = (long) r10
            long r10 = r10 & r4
            long r6 = r6 + r10
            int r10 = (int) r6
            r0[r16] = r10
            long r6 = r6 >> r21
            int r10 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r10 == 0) goto L9d
            r10 = r0[r22]
            long r10 = (long) r10
            long r4 = r4 & r10
            long r6 = r6 + r4
            int r4 = (int) r6
            r0[r22] = r4
            long r4 = r6 >> r21
            long r1 = r1 + r4
        L9d:
            int r4 = (int) r1
            r0[r3] = r4
            long r1 = r1 >> r21
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 == 0) goto Lad
            r1 = 6
            int r1 = p085f1.AbstractC1972m.m4967B(r1, r0, r8)
            if (r1 != 0) goto Lba
        Lad:
            r1 = r0[r9]
            r2 = -1
            if (r1 != r2) goto Lbd
            int[] r1 = p298qj.C5732t.f22116a
            boolean r1 = p085f1.AbstractC1972m.m5020y(r0, r1)
            if (r1 == 0) goto Lbd
        Lba:
            m12045b(r27)
        Lbd:
            return
    }

    /* renamed from: e */
    public static void m12048e(int r11, int[] r12) {
            r0 = 0
            if (r11 == 0) goto L33
            long r2 = (long) r11
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            r11 = 0
            r6 = r12[r11]
            long r6 = (long) r6
            long r6 = r6 & r4
            long r6 = r6 + r2
            long r6 = r6 + r0
            int r8 = (int) r6
            r12[r11] = r8
            r11 = 32
            long r6 = r6 >> r11
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 == 0) goto L26
            r8 = 1
            r9 = r12[r8]
            long r9 = (long) r9
            long r9 = r9 & r4
            long r6 = r6 + r9
            int r9 = (int) r6
            r12[r8] = r9
            long r6 = r6 >> r11
        L26:
            r8 = 2
            r9 = r12[r8]
            long r9 = (long) r9
            long r4 = r4 & r9
            long r4 = r4 + r2
            long r4 = r4 + r6
            int r2 = (int) r4
            r12[r8] = r2
            long r2 = r4 >> r11
            goto L34
        L33:
            r2 = r0
        L34:
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 == 0) goto L40
            r11 = 6
            r0 = 3
            int r11 = p085f1.AbstractC1972m.m4967B(r11, r12, r0)
            if (r11 != 0) goto L4e
        L40:
            r11 = 5
            r11 = r12[r11]
            r0 = -1
            if (r11 != r0) goto L51
            int[] r11 = p298qj.C5732t.f22116a
            boolean r11 = p085f1.AbstractC1972m.m5020y(r12, r11)
            if (r11 == 0) goto L51
        L4e:
            m12045b(r12)
        L51:
            return
    }

    /* renamed from: f */
    public static void m12049f(int[] r1, int[] r2) {
            r0 = 12
            int[] r0 = new int[r0]
            p085f1.AbstractC1972m.m4982Q(r1, r0)
            m12047d(r0, r2)
            return
    }

    /* renamed from: g */
    public static void m12050g(int[] r1, int r2, int[] r3) {
            r0 = 12
            int[] r0 = new int[r0]
            p085f1.AbstractC1972m.m4982Q(r1, r0)
        L7:
            m12047d(r0, r3)
            int r2 = r2 + (-1)
            if (r2 <= 0) goto L12
            p085f1.AbstractC1972m.m4982Q(r3, r0)
            goto L7
        L12:
            return
    }

    /* renamed from: h */
    public static void m12051h(int[] r10, int[] r11, int[] r12) {
            int r10 = p085f1.AbstractC1972m.m4986U(r10, r11, r12)
            if (r10 == 0) goto L3e
            r10 = 0
            r11 = r12[r10]
            long r0 = (long) r11
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r4 = 1
            long r0 = r0 - r4
            int r11 = (int) r0
            r12[r10] = r11
            r10 = 32
            long r0 = r0 >> r10
            r6 = 0
            int r11 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r11 == 0) goto L29
            r11 = 1
            r8 = r12[r11]
            long r8 = (long) r8
            long r8 = r8 & r2
            long r0 = r0 + r8
            int r8 = (int) r0
            r12[r11] = r8
            long r0 = r0 >> r10
        L29:
            r11 = 2
            r8 = r12[r11]
            long r8 = (long) r8
            long r2 = r2 & r8
            long r2 = r2 - r4
            long r2 = r2 + r0
            int r0 = (int) r2
            r12[r11] = r0
            long r10 = r2 >> r10
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L3e
            r10 = 6
            r11 = 3
            p085f1.AbstractC1972m.m5009n(r10, r12, r11)
        L3e:
            return
    }
}
