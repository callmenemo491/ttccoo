package p346u;

/* renamed from: u.q */
/* loaded from: classes.dex */
public class C6272q implements java.lang.Comparable<p346u.C6272q> {

    /* renamed from: m0 */
    public static java.lang.String[] f24394m0;

    /* renamed from: Y */
    public p331t.C6088c f24395Y;

    /* renamed from: Z */
    public int f24396Z;

    /* renamed from: a0 */
    public float f24397a0;

    /* renamed from: b0 */
    public float f24398b0;

    /* renamed from: c0 */
    public float f24399c0;

    /* renamed from: d0 */
    public float f24400d0;

    /* renamed from: e0 */
    public float f24401e0;

    /* renamed from: f0 */
    public float f24402f0;

    /* renamed from: g0 */
    public float f24403g0;

    /* renamed from: h0 */
    public int f24404h0;

    /* renamed from: i0 */
    public java.util.LinkedHashMap<java.lang.String, p422y.C7091a> f24405i0;

    /* renamed from: j0 */
    public int f24406j0;

    /* renamed from: k0 */
    public double[] f24407k0;

    /* renamed from: l0 */
    public double[] f24408l0;

    static {
            java.lang.String r0 = "position"
            java.lang.String r1 = "x"
            java.lang.String r2 = "y"
            java.lang.String r3 = "width"
            java.lang.String r4 = "height"
            java.lang.String r5 = "pathRotate"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            p346u.C6272q.f24394m0 = r0
            return
    }

    public C6272q() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f24396Z = r0
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2.f24403g0 = r1
            r1 = -1
            r2.f24404h0 = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2.f24405i0 = r1
            r2.f24406j0 = r0
            r0 = 18
            double[] r1 = new double[r0]
            r2.f24407k0 = r1
            double[] r0 = new double[r0]
            r2.f24408l0 = r0
            return
    }

    public C6272q(int r21, int r22, p346u.C6263h r23, p346u.C6272q r24, p346u.C6272q r25) {
            r20 = this;
            r0 = r20
            r1 = r23
            r2 = r24
            r3 = r25
            r20.<init>()
            r4 = 0
            r0.f24396Z = r4
            r5 = 2143289344(0x7fc00000, float:NaN)
            r0.f24403g0 = r5
            r6 = -1
            r0.f24404h0 = r6
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            r0.f24405i0 = r6
            r0.f24406j0 = r4
            r4 = 18
            double[] r6 = new double[r4]
            r0.f24407k0 = r6
            double[] r4 = new double[r4]
            r0.f24408l0 = r4
            int r4 = r1.f24311m
            r6 = 1
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 1120403456(0x42c80000, float:100.0)
            if (r4 == r6) goto L1a7
            r6 = 2
            if (r4 == r6) goto Lfb
            int r4 = r1.f24245a
            float r4 = (float) r4
            float r4 = r4 / r9
            r0.f24397a0 = r4
            int r9 = r1.f24306h
            r0.f24396Z = r9
            float r9 = r1.f24307i
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 == 0) goto L48
            r9 = r4
            goto L4a
        L48:
            float r9 = r1.f24307i
        L4a:
            float r10 = r1.f24308j
            boolean r10 = java.lang.Float.isNaN(r10)
            if (r10 == 0) goto L54
            r10 = r4
            goto L56
        L54:
            float r10 = r1.f24308j
        L56:
            float r11 = r3.f24401e0
            float r12 = r2.f24401e0
            float r13 = r11 - r12
            float r14 = r3.f24402f0
            float r15 = r2.f24402f0
            float r16 = r14 - r15
            float r7 = r0.f24397a0
            r0.f24398b0 = r7
            float r7 = r2.f24399c0
            float r18 = r12 / r8
            float r18 = r18 + r7
            float r6 = r2.f24400d0
            float r19 = r15 / r8
            float r19 = r19 + r6
            float r5 = r3.f24399c0
            float r11 = r11 / r8
            float r11 = r11 + r5
            float r3 = r3.f24400d0
            float r14 = r14 / r8
            float r14 = r14 + r3
            float r11 = r11 - r18
            float r14 = r14 - r19
            float r3 = r11 * r4
            float r3 = r3 + r7
            float r13 = r13 * r9
            float r5 = r13 / r8
            float r3 = r3 - r5
            int r3 = (int) r3
            float r3 = (float) r3
            r0.f24399c0 = r3
            float r3 = r14 * r4
            float r3 = r3 + r6
            float r16 = r16 * r10
            float r6 = r16 / r8
            float r3 = r3 - r6
            int r3 = (int) r3
            float r3 = (float) r3
            r0.f24400d0 = r3
            float r12 = r12 + r13
            int r3 = (int) r12
            float r3 = (float) r3
            r0.f24401e0 = r3
            float r15 = r15 + r16
            int r3 = (int) r15
            float r3 = (float) r3
            r0.f24402f0 = r3
            float r3 = r1.f24309k
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto Lab
            r3 = r4
            goto Lad
        Lab:
            float r3 = r1.f24309k
        Lad:
            r7 = 2143289344(0x7fc00000, float:NaN)
            boolean r8 = java.lang.Float.isNaN(r7)
            if (r8 == 0) goto Lb7
            r8 = 0
            goto Lb9
        Lb7:
            r8 = 2143289344(0x7fc00000, float:NaN)
        Lb9:
            float r9 = r1.f24310l
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 == 0) goto Lc2
            goto Lc4
        Lc2:
            float r4 = r1.f24310l
        Lc4:
            boolean r9 = java.lang.Float.isNaN(r7)
            r7 = 2
            if (r9 == 0) goto Lce
            r17 = 0
            goto Ld0
        Lce:
            r17 = 2143289344(0x7fc00000, float:NaN)
        Ld0:
            r0.f24406j0 = r7
            float r7 = r2.f24399c0
            float r3 = r3 * r11
            float r3 = r3 + r7
            float r17 = r17 * r14
            float r17 = r17 + r3
            float r3 = r17 - r5
            int r3 = (int) r3
            float r3 = (float) r3
            r0.f24399c0 = r3
            float r2 = r2.f24400d0
            float r11 = r11 * r8
            float r11 = r11 + r2
            float r14 = r14 * r4
            float r14 = r14 + r11
            float r14 = r14 - r6
            int r2 = (int) r14
            float r2 = (float) r2
            r0.f24400d0 = r2
            java.lang.String r2 = r1.f24304f
            t.c r2 = p331t.C6088c.m12542c(r2)
            r0.f24395Y = r2
            int r1 = r1.f24305g
            r0.f24404h0 = r1
            return
        Lfb:
            int r4 = r1.f24245a
            float r4 = (float) r4
            float r4 = r4 / r9
            r0.f24397a0 = r4
            int r5 = r1.f24306h
            r0.f24396Z = r5
            float r5 = r1.f24307i
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L10f
            r5 = r4
            goto L111
        L10f:
            float r5 = r1.f24307i
        L111:
            float r6 = r1.f24308j
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto L11b
            r6 = r4
            goto L11d
        L11b:
            float r6 = r1.f24308j
        L11d:
            float r7 = r3.f24401e0
            float r9 = r2.f24401e0
            float r10 = r7 - r9
            float r11 = r3.f24402f0
            float r12 = r2.f24402f0
            float r13 = r11 - r12
            float r14 = r0.f24397a0
            r0.f24398b0 = r14
            float r14 = r2.f24399c0
            float r15 = r9 / r8
            float r15 = r15 + r14
            float r2 = r2.f24400d0
            float r16 = r12 / r8
            float r16 = r16 + r2
            float r1 = r3.f24399c0
            float r7 = r7 / r8
            float r7 = r7 + r1
            float r1 = r3.f24400d0
            float r11 = r11 / r8
            float r11 = r11 + r1
            float r7 = r7 - r15
            float r11 = r11 - r16
            float r7 = r7 * r4
            float r7 = r7 + r14
            float r10 = r10 * r5
            float r1 = r10 / r8
            float r7 = r7 - r1
            int r1 = (int) r7
            float r1 = (float) r1
            r0.f24399c0 = r1
            float r11 = r11 * r4
            float r11 = r11 + r2
            float r13 = r13 * r6
            float r1 = r13 / r8
            float r11 = r11 - r1
            int r1 = (int) r11
            float r1 = (float) r1
            r0.f24400d0 = r1
            float r9 = r9 + r10
            int r1 = (int) r9
            float r1 = (float) r1
            r0.f24401e0 = r1
            float r12 = r12 + r13
            int r1 = (int) r12
            float r1 = (float) r1
            r0.f24402f0 = r1
            r1 = 3
            r0.f24406j0 = r1
            r1 = r23
            float r2 = r1.f24309k
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L182
            r2 = r21
            float r2 = (float) r2
            float r3 = r0.f24401e0
            float r2 = r2 - r3
            int r2 = (int) r2
            float r3 = r1.f24309k
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = (int) r3
            float r2 = (float) r2
            r0.f24399c0 = r2
        L182:
            float r2 = r1.f24310l
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L19a
            r2 = r22
            float r2 = (float) r2
            float r3 = r0.f24402f0
            float r2 = r2 - r3
            int r2 = (int) r2
            float r3 = r1.f24310l
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = (int) r3
            float r2 = (float) r2
            r0.f24400d0 = r2
        L19a:
            java.lang.String r2 = r1.f24304f
            t.c r2 = p331t.C6088c.m12542c(r2)
            r0.f24395Y = r2
            int r1 = r1.f24305g
            r0.f24404h0 = r1
            return
        L1a7:
            int r4 = r1.f24245a
            float r4 = (float) r4
            float r4 = r4 / r9
            r0.f24397a0 = r4
            int r5 = r1.f24306h
            r0.f24396Z = r5
            float r5 = r1.f24307i
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L1bb
            r5 = r4
            goto L1bd
        L1bb:
            float r5 = r1.f24307i
        L1bd:
            float r7 = r1.f24308j
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 == 0) goto L1c7
            r7 = r4
            goto L1c9
        L1c7:
            float r7 = r1.f24308j
        L1c9:
            float r9 = r3.f24401e0
            float r10 = r2.f24401e0
            float r9 = r9 - r10
            float r10 = r3.f24402f0
            float r11 = r2.f24402f0
            float r10 = r10 - r11
            float r11 = r0.f24397a0
            r0.f24398b0 = r11
            float r11 = r1.f24309k
            boolean r11 = java.lang.Float.isNaN(r11)
            if (r11 == 0) goto L1e0
            goto L1e2
        L1e0:
            float r4 = r1.f24309k
        L1e2:
            float r11 = r2.f24399c0
            float r12 = r2.f24401e0
            float r13 = r12 / r8
            float r13 = r13 + r11
            float r14 = r2.f24400d0
            float r15 = r2.f24402f0
            float r16 = r15 / r8
            float r16 = r16 + r14
            float r6 = r3.f24399c0
            float r2 = r3.f24401e0
            float r2 = r2 / r8
            float r2 = r2 + r6
            float r6 = r3.f24400d0
            float r3 = r3.f24402f0
            float r3 = r3 / r8
            float r3 = r3 + r6
            float r2 = r2 - r13
            float r3 = r3 - r16
            float r6 = r2 * r4
            float r11 = r11 + r6
            float r9 = r9 * r5
            float r5 = r9 / r8
            float r11 = r11 - r5
            int r11 = (int) r11
            float r11 = (float) r11
            r0.f24399c0 = r11
            float r4 = r4 * r3
            float r14 = r14 + r4
            float r10 = r10 * r7
            float r7 = r10 / r8
            float r14 = r14 - r7
            int r8 = (int) r14
            float r8 = (float) r8
            r0.f24400d0 = r8
            float r12 = r12 + r9
            int r8 = (int) r12
            float r8 = (float) r8
            r0.f24401e0 = r8
            float r15 = r15 + r10
            int r8 = (int) r15
            float r8 = (float) r8
            r0.f24402f0 = r8
            float r8 = r1.f24310l
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L22d
            r17 = 0
            goto L231
        L22d:
            float r8 = r1.f24310l
            r17 = r8
        L231:
            float r3 = -r3
            float r3 = r3 * r17
            float r2 = r2 * r17
            r8 = 1
            r0.f24406j0 = r8
            r8 = r24
            float r9 = r8.f24399c0
            float r9 = r9 + r6
            float r9 = r9 - r5
            int r5 = (int) r9
            float r5 = (float) r5
            r0.f24399c0 = r5
            float r6 = r8.f24400d0
            float r6 = r6 + r4
            float r6 = r6 - r7
            int r4 = (int) r6
            float r4 = (float) r4
            r0.f24400d0 = r4
            float r5 = r5 + r3
            r0.f24399c0 = r5
            float r4 = r4 + r2
            r0.f24400d0 = r4
            java.lang.String r2 = r1.f24304f
            t.c r2 = p331t.C6088c.m12542c(r2)
            r0.f24395Y = r2
            int r1 = r1.f24305g
            r0.f24404h0 = r1
            return
    }

    @Override // java.lang.Comparable
    public int compareTo(p346u.C6272q r2) {
            r1 = this;
            u.q r2 = (p346u.C6272q) r2
            float r0 = r1.f24398b0
            float r2 = r2.f24398b0
            int r2 = java.lang.Float.compare(r0, r2)
            return r2
    }

    /* renamed from: e */
    public void m12894e(androidx.constraintlayout.widget.C0333b.a r6) {
            r5 = this;
            androidx.constraintlayout.widget.b$c r0 = r6.f1793c
            java.lang.String r0 = r0.f1863c
            t.c r0 = p331t.C6088c.m12542c(r0)
            r5.f24395Y = r0
            androidx.constraintlayout.widget.b$c r0 = r6.f1793c
            int r1 = r0.f1864d
            r5.f24404h0 = r1
            float r1 = r0.f1867g
            r5.f24403g0 = r1
            int r0 = r0.f1865e
            r5.f24396Z = r0
            androidx.constraintlayout.widget.b$d r0 = r6.f1792b
            float r0 = r0.f1872e
            java.util.HashMap<java.lang.String, y.a> r0 = r6.f1796f
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap<java.lang.String, y.a> r2 = r6.f1796f
            java.lang.Object r2 = r2.get(r1)
            y.a r2 = (p422y.C7091a) r2
            int r3 = r2.f27433b
            r4 = 5
            if (r3 == r4) goto L26
            java.util.LinkedHashMap<java.lang.String, y.a> r3 = r5.f24405i0
            r3.put(r1, r2)
            goto L26
        L45:
            return
    }

    /* renamed from: g */
    public final boolean m12895g(float r4, float r5) {
            r3 = this;
            boolean r0 = java.lang.Float.isNaN(r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1e
            boolean r0 = java.lang.Float.isNaN(r5)
            if (r0 == 0) goto Lf
            goto L1e
        Lf:
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            r5 = 897988541(0x358637bd, float:1.0E-6)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
        L1e:
            boolean r4 = java.lang.Float.isNaN(r4)
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r4 == r5) goto L29
            goto L2a
        L29:
            r1 = 0
        L2a:
            return r1
    }

    /* renamed from: h */
    public void m12896h(int[] r10, double[] r11, float[] r12, int r13) {
            r9 = this;
            float r0 = r9.f24399c0
            float r1 = r9.f24400d0
            float r2 = r9.f24401e0
            float r3 = r9.f24402f0
            r4 = 0
        L9:
            int r5 = r10.length
            r6 = 1
            if (r4 >= r5) goto L28
            r7 = r11[r4]
            float r5 = (float) r7
            r7 = r10[r4]
            if (r7 == r6) goto L24
            r6 = 2
            if (r7 == r6) goto L22
            r6 = 3
            if (r7 == r6) goto L20
            r6 = 4
            if (r7 == r6) goto L1e
            goto L25
        L1e:
            r3 = r5
            goto L25
        L20:
            r2 = r5
            goto L25
        L22:
            r1 = r5
            goto L25
        L24:
            r0 = r5
        L25:
            int r4 = r4 + 1
            goto L9
        L28:
            r10 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r10
            float r2 = r2 + r0
            r11 = 0
            float r2 = r2 + r11
            r12[r13] = r2
            int r13 = r13 + r6
            float r3 = r3 / r10
            float r3 = r3 + r1
            float r3 = r3 + r11
            r12[r13] = r3
            return
    }

    /* renamed from: k */
    public void m12897k(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.f24399c0 = r1
            r0.f24400d0 = r2
            r0.f24401e0 = r3
            r0.f24402f0 = r4
            return
    }

    /* renamed from: l */
    public void m12898l(float r13, float r14, float[] r15, int[] r16, double[] r17, double[] r18) {
            r12 = this;
            r0 = r16
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L9:
            int r8 = r0.length
            r9 = 1
            if (r3 >= r8) goto L2a
            r10 = r17[r3]
            float r8 = (float) r10
            r10 = r18[r3]
            r10 = r0[r3]
            if (r10 == r9) goto L26
            r9 = 2
            if (r10 == r9) goto L24
            r9 = 3
            if (r10 == r9) goto L22
            r9 = 4
            if (r10 == r9) goto L20
            goto L27
        L20:
            r7 = r8
            goto L27
        L22:
            r5 = r8
            goto L27
        L24:
            r6 = r8
            goto L27
        L26:
            r4 = r8
        L27:
            int r3 = r3 + 1
            goto L9
        L2a:
            float r0 = r2 * r5
            r3 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r3
            float r4 = r4 - r0
            float r0 = r2 * r7
            float r0 = r0 / r3
            float r6 = r6 - r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r0
            float r7 = r7 * r0
            float r5 = r5 + r4
            float r7 = r7 + r6
            float r3 = r0 - r13
            float r3 = r3 * r4
            float r5 = r5 * r13
            float r5 = r5 + r3
            float r5 = r5 + r2
            r15[r1] = r5
            float r0 = r0 - r14
            float r0 = r0 * r6
            float r7 = r7 * r14
            float r7 = r7 + r0
            float r7 = r7 + r2
            r15[r9] = r7
            return
    }
}
