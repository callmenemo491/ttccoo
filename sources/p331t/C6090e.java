package p331t;

/* renamed from: t.e */
/* loaded from: classes.dex */
public class C6090e extends p331t.AbstractC6087b {

    /* renamed from: a */
    public double[] f23482a;

    /* renamed from: b */
    public double[][] f23483b;

    /* renamed from: c */
    public double[][] f23484c;

    public C6090e(double[] r23, double[][] r24) {
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.Class<double> r3 = double.class
            r22.<init>()
            int r4 = r1.length
            r5 = 0
            r6 = r2[r5]
            int r6 = r6.length
            int r7 = r4 + (-1)
            r8 = 2
            int[] r9 = new int[r8]
            r10 = 1
            r9[r10] = r6
            r9[r5] = r7
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r3, r9)
            double[][] r9 = (double[][]) r9
            int[] r8 = new int[r8]
            r8[r10] = r6
            r8[r5] = r4
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r8)
            double[][] r3 = (double[][]) r3
            r8 = 0
        L2d:
            if (r8 >= r6) goto L77
            r10 = 0
        L30:
            if (r10 >= r7) goto L6a
            int r11 = r10 + 1
            r12 = r1[r11]
            r14 = r1[r10]
            double r12 = r12 - r14
            r14 = r9[r10]
            r15 = r2[r11]
            r16 = r15[r8]
            r15 = r2[r10]
            r18 = r15[r8]
            double r16 = r16 - r18
            double r16 = r16 / r12
            r14[r8] = r16
            if (r10 != 0) goto L54
            r12 = r3[r10]
            r10 = r9[r10]
            r13 = r10[r8]
            r12[r8] = r13
            goto L68
        L54:
            r12 = r3[r10]
            int r13 = r10 + (-1)
            r13 = r9[r13]
            r14 = r13[r8]
            r10 = r9[r10]
            r16 = r10[r8]
            double r14 = r14 + r16
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r14 = r14 * r16
            r12[r8] = r14
        L68:
            r10 = r11
            goto L30
        L6a:
            r10 = r3[r7]
            int r11 = r4 + (-2)
            r11 = r9[r11]
            r12 = r11[r8]
            r10[r8] = r12
            int r8 = r8 + 1
            goto L2d
        L77:
            r4 = 0
        L78:
            if (r4 >= r7) goto Ld3
            r8 = 0
        L7b:
            if (r8 >= r6) goto Ld0
            r10 = r9[r4]
            r11 = r10[r8]
            r13 = 0
            int r10 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r10 != 0) goto L92
            r10 = r3[r4]
            r10[r8] = r13
            int r10 = r4 + 1
            r10 = r3[r10]
            r10[r8] = r13
            goto Lcd
        L92:
            r10 = r3[r4]
            r11 = r10[r8]
            r10 = r9[r4]
            r13 = r10[r8]
            double r11 = r11 / r13
            int r10 = r4 + 1
            r13 = r3[r10]
            r14 = r13[r8]
            r13 = r9[r4]
            r16 = r13[r8]
            double r14 = r14 / r16
            double r16 = java.lang.Math.hypot(r11, r14)
            r18 = 4621256167635550208(0x4022000000000000, double:9.0)
            int r13 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r13 <= 0) goto Lcd
            r18 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r18 = r18 / r16
            r13 = r3[r4]
            double r11 = r11 * r18
            r16 = r9[r4]
            r20 = r16[r8]
            double r11 = r11 * r20
            r13[r8] = r11
            r10 = r3[r10]
            double r18 = r18 * r14
            r11 = r9[r4]
            r12 = r11[r8]
            double r18 = r18 * r12
            r10[r8] = r18
        Lcd:
            int r8 = r8 + 1
            goto L7b
        Ld0:
            int r4 = r4 + 1
            goto L78
        Ld3:
            r0.f23482a = r1
            r0.f23483b = r2
            r0.f23484c = r3
            return
    }

    /* renamed from: g */
    public static double m12547g(double r12, double r14, double r16, double r18, double r20, double r22) {
            double r0 = r14 * r14
            double r2 = r0 * r14
            r4 = -4611686018427387904(0xc000000000000000, double:-2.0)
            double r4 = r4 * r2
            double r4 = r4 * r18
            r6 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r6 = r6 * r0
            double r8 = r6 * r18
            double r8 = r8 + r4
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r2 * r4
            double r10 = r10 * r16
            double r10 = r10 + r8
            double r6 = r6 * r16
            double r10 = r10 - r6
            double r10 = r10 + r16
            double r6 = r12 * r22
            double r8 = r6 * r2
            double r8 = r8 + r10
            double r10 = r12 * r20
            double r2 = r2 * r10
            double r2 = r2 + r8
            double r6 = r6 * r0
            double r2 = r2 - r6
            double r4 = r4 * r12
            double r4 = r4 * r20
            double r4 = r4 * r0
            double r2 = r2 - r4
            double r10 = r10 * r14
            double r10 = r10 + r2
            return r10
    }

    @Override // p331t.AbstractC6087b
    /* renamed from: b */
    public double mo12531b(double r22, int r24) {
            r21 = this;
            r0 = r21
            double[] r1 = r0.f23482a
            int r2 = r1.length
            r3 = 0
            r4 = r1[r3]
            int r6 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r6 > 0) goto L13
            double[][] r1 = r0.f23483b
            r1 = r1[r3]
            r2 = r1[r24]
            return r2
        L13:
            int r2 = r2 + (-1)
            r4 = r1[r2]
            int r1 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r1 < 0) goto L22
            double[][] r1 = r0.f23483b
            r1 = r1[r2]
            r2 = r1[r24]
            return r2
        L22:
            if (r3 >= r2) goto L62
            double[] r1 = r0.f23482a
            r4 = r1[r3]
            int r6 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r6 != 0) goto L33
            double[][] r1 = r0.f23483b
            r1 = r1[r3]
            r2 = r1[r24]
            return r2
        L33:
            int r4 = r3 + 1
            r5 = r1[r4]
            int r7 = (r22 > r5 ? 1 : (r22 == r5 ? 0 : -1))
            if (r7 >= 0) goto L60
            r5 = r1[r4]
            r7 = r1[r3]
            double r9 = r5 - r7
            r5 = r1[r3]
            double r1 = r22 - r5
            double r11 = r1 / r9
            double[][] r1 = r0.f23483b
            r2 = r1[r3]
            r13 = r2[r24]
            r1 = r1[r4]
            r15 = r1[r24]
            double[][] r1 = r0.f23484c
            r2 = r1[r3]
            r17 = r2[r24]
            r1 = r1[r4]
            r19 = r1[r24]
            double r1 = m12547g(r9, r11, r13, r15, r17, r19)
            return r1
        L60:
            r3 = r4
            goto L22
        L62:
            r1 = 0
            return r1
    }

    @Override // p331t.AbstractC6087b
    /* renamed from: c */
    public void mo12532c(double r24, double[] r26) {
            r23 = this;
            r0 = r23
            double[] r1 = r0.f23482a
            int r2 = r1.length
            double[][] r3 = r0.f23483b
            r4 = 0
            r3 = r3[r4]
            int r3 = r3.length
            r5 = r1[r4]
            int r7 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r7 > 0) goto L20
            r1 = 0
        L12:
            if (r1 >= r3) goto L1f
            double[][] r2 = r0.f23483b
            r2 = r2[r4]
            r5 = r2[r1]
            r26[r1] = r5
            int r1 = r1 + 1
            goto L12
        L1f:
            return
        L20:
            int r2 = r2 + (-1)
            r5 = r1[r2]
            int r1 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r1 < 0) goto L36
        L28:
            if (r4 >= r3) goto L35
            double[][] r1 = r0.f23483b
            r1 = r1[r2]
            r5 = r1[r4]
            r26[r4] = r5
            int r4 = r4 + 1
            goto L28
        L35:
            return
        L36:
            r1 = 0
        L37:
            if (r1 >= r2) goto L87
            double[] r5 = r0.f23482a
            r6 = r5[r1]
            int r5 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r5 != 0) goto L4f
            r5 = 0
        L42:
            if (r5 >= r3) goto L4f
            double[][] r6 = r0.f23483b
            r6 = r6[r1]
            r7 = r6[r5]
            r26[r5] = r7
            int r5 = r5 + 1
            goto L42
        L4f:
            double[] r5 = r0.f23482a
            int r6 = r1 + 1
            r7 = r5[r6]
            int r9 = (r24 > r7 ? 1 : (r24 == r7 ? 0 : -1))
            if (r9 >= 0) goto L85
            r7 = r5[r6]
            r9 = r5[r1]
            double r7 = r7 - r9
            r9 = r5[r1]
            double r9 = r24 - r9
            double r9 = r9 / r7
        L63:
            if (r4 >= r3) goto L84
            double[][] r2 = r0.f23483b
            r5 = r2[r1]
            r15 = r5[r4]
            r2 = r2[r6]
            r17 = r2[r4]
            double[][] r2 = r0.f23484c
            r5 = r2[r1]
            r19 = r5[r4]
            r2 = r2[r6]
            r21 = r2[r4]
            r11 = r7
            r13 = r9
            double r11 = m12547g(r11, r13, r15, r17, r19, r21)
            r26[r4] = r11
            int r4 = r4 + 1
            goto L63
        L84:
            return
        L85:
            r1 = r6
            goto L37
        L87:
            return
    }

    @Override // p331t.AbstractC6087b
    /* renamed from: d */
    public void mo12533d(double r24, float[] r26) {
            r23 = this;
            r0 = r23
            double[] r1 = r0.f23482a
            int r2 = r1.length
            double[][] r3 = r0.f23483b
            r4 = 0
            r3 = r3[r4]
            int r3 = r3.length
            r5 = r1[r4]
            int r7 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r7 > 0) goto L21
            r1 = 0
        L12:
            if (r1 >= r3) goto L20
            double[][] r2 = r0.f23483b
            r2 = r2[r4]
            r5 = r2[r1]
            float r2 = (float) r5
            r26[r1] = r2
            int r1 = r1 + 1
            goto L12
        L20:
            return
        L21:
            int r2 = r2 + (-1)
            r5 = r1[r2]
            int r1 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r1 < 0) goto L38
        L29:
            if (r4 >= r3) goto L37
            double[][] r1 = r0.f23483b
            r1 = r1[r2]
            r5 = r1[r4]
            float r1 = (float) r5
            r26[r4] = r1
            int r4 = r4 + 1
            goto L29
        L37:
            return
        L38:
            r1 = 0
        L39:
            if (r1 >= r2) goto L8b
            double[] r5 = r0.f23482a
            r6 = r5[r1]
            int r5 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r5 != 0) goto L52
            r5 = 0
        L44:
            if (r5 >= r3) goto L52
            double[][] r6 = r0.f23483b
            r6 = r6[r1]
            r7 = r6[r5]
            float r6 = (float) r7
            r26[r5] = r6
            int r5 = r5 + 1
            goto L44
        L52:
            double[] r5 = r0.f23482a
            int r6 = r1 + 1
            r7 = r5[r6]
            int r9 = (r24 > r7 ? 1 : (r24 == r7 ? 0 : -1))
            if (r9 >= 0) goto L89
            r7 = r5[r6]
            r9 = r5[r1]
            double r7 = r7 - r9
            r9 = r5[r1]
            double r9 = r24 - r9
            double r9 = r9 / r7
        L66:
            if (r4 >= r3) goto L88
            double[][] r2 = r0.f23483b
            r5 = r2[r1]
            r15 = r5[r4]
            r2 = r2[r6]
            r17 = r2[r4]
            double[][] r2 = r0.f23484c
            r5 = r2[r1]
            r19 = r5[r4]
            r2 = r2[r6]
            r21 = r2[r4]
            r11 = r7
            r13 = r9
            double r11 = m12547g(r11, r13, r15, r17, r19, r21)
            float r2 = (float) r11
            r26[r4] = r2
            int r4 = r4 + 1
            goto L66
        L88:
            return
        L89:
            r1 = r6
            goto L39
        L8b:
            return
    }

    @Override // p331t.AbstractC6087b
    /* renamed from: e */
    public void mo12534e(double r28, double[] r30) {
            r27 = this;
            r0 = r27
            double[] r1 = r0.f23482a
            int r2 = r1.length
            double[][] r3 = r0.f23483b
            r4 = 0
            r3 = r3[r4]
            int r3 = r3.length
            r5 = r1[r4]
            int r7 = (r28 > r5 ? 1 : (r28 == r5 ? 0 : -1))
            if (r7 > 0) goto L14
            r5 = r1[r4]
            goto L21
        L14:
            int r5 = r2 + (-1)
            r6 = r1[r5]
            int r8 = (r28 > r6 ? 1 : (r28 == r6 ? 0 : -1))
            if (r8 < 0) goto L1f
            r5 = r1[r5]
            goto L21
        L1f:
            r5 = r28
        L21:
            r1 = 0
        L22:
            int r7 = r2 + (-1)
            if (r1 >= r7) goto L95
            double[] r7 = r0.f23482a
            int r8 = r1 + 1
            r9 = r7[r8]
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 > 0) goto L93
            r9 = r7[r8]
            r11 = r7[r1]
            double r9 = r9 - r11
            r11 = r7[r1]
            double r5 = r5 - r11
            double r5 = r5 / r9
        L39:
            if (r4 >= r3) goto L95
            double[][] r2 = r0.f23483b
            r7 = r2[r1]
            r11 = r7[r4]
            r2 = r2[r8]
            r13 = r2[r4]
            double[][] r2 = r0.f23484c
            r7 = r2[r1]
            r15 = r7[r4]
            r2 = r2[r8]
            r17 = r2[r4]
            double r19 = r5 * r5
            r21 = -4604930618986332160(0xc018000000000000, double:-6.0)
            double r21 = r21 * r19
            double r21 = r21 * r13
            r23 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r25 = r5 * r23
            double r13 = r13 * r25
            double r13 = r13 + r21
            double r23 = r23 * r19
            double r23 = r23 * r11
            double r23 = r23 + r13
            double r25 = r25 * r11
            double r23 = r23 - r25
            r11 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r11 = r11 * r9
            double r13 = r11 * r17
            double r13 = r13 * r19
            double r13 = r13 + r23
            double r11 = r11 * r15
            double r11 = r11 * r19
            double r11 = r11 + r13
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = r13 * r9
            double r13 = r13 * r17
            double r13 = r13 * r5
            double r11 = r11 - r13
            r13 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r13 = r13 * r9
            double r13 = r13 * r15
            double r13 = r13 * r5
            double r11 = r11 - r13
            double r15 = r15 * r9
            double r15 = r15 + r11
            double r15 = r15 / r9
            r30[r4] = r15
            int r4 = r4 + 1
            goto L39
        L93:
            r1 = r8
            goto L22
        L95:
            return
    }

    @Override // p331t.AbstractC6087b
    /* renamed from: f */
    public double[] mo12535f() {
            r1 = this;
            double[] r0 = r1.f23482a
            return r0
    }
}
