package p331t;

/* renamed from: t.d */
/* loaded from: classes.dex */
public class C6089d extends p331t.AbstractC6087b {

    /* renamed from: a */
    public double[] f23480a;

    /* renamed from: b */
    public double[][] f23481b;

    public C6089d(double[] r12, double[][] r13) {
            r11 = this;
            r11.<init>()
            r0 = 0
            r1 = r13[r0]
            int r1 = r1.length
            r11.f23480a = r12
            r11.f23481b = r13
            r2 = 2
            if (r1 <= r2) goto L2b
            r1 = 0
            r3 = r1
            r5 = 0
        L12:
            int r6 = r12.length
            if (r5 >= r6) goto L2b
            r6 = r13[r5]
            r7 = r6[r0]
            r6 = r13[r5]
            r9 = r6[r0]
            if (r5 <= 0) goto L26
            double r1 = r7 - r1
            double r3 = r9 - r3
            java.lang.Math.hypot(r1, r3)
        L26:
            int r5 = r5 + 1
            r1 = r7
            r3 = r9
            goto L12
        L2b:
            return
    }

    @Override // p331t.AbstractC6087b
    /* renamed from: b */
    public double mo12531b(double r9, int r11) {
            r8 = this;
            double[] r0 = r8.f23480a
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 > 0) goto L11
            double[][] r9 = r8.f23481b
            r9 = r9[r2]
            r10 = r9[r11]
            return r10
        L11:
            int r1 = r1 + (-1)
            r3 = r0[r1]
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L20
            double[][] r9 = r8.f23481b
            r9 = r9[r1]
            r10 = r9[r11]
            return r10
        L20:
            if (r2 >= r1) goto L57
            double[] r0 = r8.f23480a
            r3 = r0[r2]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 != 0) goto L31
            double[][] r9 = r8.f23481b
            r9 = r9[r2]
            r10 = r9[r11]
            return r10
        L31:
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 >= 0) goto L55
            r4 = r0[r3]
            r6 = r0[r2]
            double r4 = r4 - r6
            r6 = r0[r2]
            double r9 = r9 - r6
            double r9 = r9 / r4
            double[][] r0 = r8.f23481b
            r1 = r0[r2]
            r4 = r1[r11]
            r0 = r0[r3]
            r1 = r0[r11]
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r6 - r9
            double r6 = r6 * r4
            double r1 = r1 * r9
            double r1 = r1 + r6
            return r1
        L55:
            r2 = r3
            goto L20
        L57:
            r9 = 0
            return r9
    }

    @Override // p331t.AbstractC6087b
    /* renamed from: c */
    public void mo12532c(double r13, double[] r15) {
            r12 = this;
            double[] r0 = r12.f23480a
            int r1 = r0.length
            double[][] r2 = r12.f23481b
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L1e
            r13 = 0
        L10:
            if (r13 >= r2) goto L1d
            double[][] r14 = r12.f23481b
            r14 = r14[r3]
            r0 = r14[r13]
            r15[r13] = r0
            int r13 = r13 + 1
            goto L10
        L1d:
            return
        L1e:
            int r1 = r1 + (-1)
            r4 = r0[r1]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L34
        L26:
            if (r3 >= r2) goto L33
            double[][] r13 = r12.f23481b
            r13 = r13[r1]
            r4 = r13[r3]
            r15[r3] = r4
            int r3 = r3 + 1
            goto L26
        L33:
            return
        L34:
            r0 = 0
        L35:
            if (r0 >= r1) goto L7c
            double[] r4 = r12.f23480a
            r5 = r4[r0]
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 != 0) goto L4d
            r4 = 0
        L40:
            if (r4 >= r2) goto L4d
            double[][] r5 = r12.f23481b
            r5 = r5[r0]
            r6 = r5[r4]
            r15[r4] = r6
            int r4 = r4 + 1
            goto L40
        L4d:
            double[] r4 = r12.f23480a
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 >= 0) goto L7a
            r6 = r4[r5]
            r8 = r4[r0]
            double r6 = r6 - r8
            r8 = r4[r0]
            double r13 = r13 - r8
            double r13 = r13 / r6
        L60:
            if (r3 >= r2) goto L79
            double[][] r1 = r12.f23481b
            r4 = r1[r0]
            r6 = r4[r3]
            r1 = r1[r5]
            r8 = r1[r3]
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 - r13
            double r10 = r10 * r6
            double r8 = r8 * r13
            double r8 = r8 + r10
            r15[r3] = r8
            int r3 = r3 + 1
            goto L60
        L79:
            return
        L7a:
            r0 = r5
            goto L35
        L7c:
            return
    }

    @Override // p331t.AbstractC6087b
    /* renamed from: d */
    public void mo12533d(double r13, float[] r15) {
            r12 = this;
            double[] r0 = r12.f23480a
            int r1 = r0.length
            double[][] r2 = r12.f23481b
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L1f
            r13 = 0
        L10:
            if (r13 >= r2) goto L1e
            double[][] r14 = r12.f23481b
            r14 = r14[r3]
            r0 = r14[r13]
            float r14 = (float) r0
            r15[r13] = r14
            int r13 = r13 + 1
            goto L10
        L1e:
            return
        L1f:
            int r1 = r1 + (-1)
            r4 = r0[r1]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L36
        L27:
            if (r3 >= r2) goto L35
            double[][] r13 = r12.f23481b
            r13 = r13[r1]
            r4 = r13[r3]
            float r13 = (float) r4
            r15[r3] = r13
            int r3 = r3 + 1
            goto L27
        L35:
            return
        L36:
            r0 = 0
        L37:
            if (r0 >= r1) goto L80
            double[] r4 = r12.f23480a
            r5 = r4[r0]
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 != 0) goto L50
            r4 = 0
        L42:
            if (r4 >= r2) goto L50
            double[][] r5 = r12.f23481b
            r5 = r5[r0]
            r6 = r5[r4]
            float r5 = (float) r6
            r15[r4] = r5
            int r4 = r4 + 1
            goto L42
        L50:
            double[] r4 = r12.f23480a
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 >= 0) goto L7e
            r6 = r4[r5]
            r8 = r4[r0]
            double r6 = r6 - r8
            r8 = r4[r0]
            double r13 = r13 - r8
            double r13 = r13 / r6
        L63:
            if (r3 >= r2) goto L7d
            double[][] r1 = r12.f23481b
            r4 = r1[r0]
            r6 = r4[r3]
            r1 = r1[r5]
            r8 = r1[r3]
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 - r13
            double r10 = r10 * r6
            double r8 = r8 * r13
            double r8 = r8 + r10
            float r1 = (float) r8
            r15[r3] = r1
            int r3 = r3 + 1
            goto L63
        L7d:
            return
        L7e:
            r0 = r5
            goto L37
        L80:
            return
    }

    @Override // p331t.AbstractC6087b
    /* renamed from: e */
    public void mo12534e(double r11, double[] r13) {
            r10 = this;
            double[] r0 = r10.f23480a
            int r1 = r0.length
            double[][] r2 = r10.f23481b
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 > 0) goto L12
            r11 = r0[r3]
            goto L1c
        L12:
            int r4 = r1 + (-1)
            r5 = r0[r4]
            int r7 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r7 < 0) goto L1c
            r11 = r0[r4]
        L1c:
            r0 = 0
        L1d:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto L47
            double[] r4 = r10.f23480a
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 > 0) goto L45
            r11 = r4[r5]
            r6 = r4[r0]
            double r11 = r11 - r6
            r6 = r4[r0]
        L32:
            if (r3 >= r2) goto L47
            double[][] r1 = r10.f23481b
            r4 = r1[r0]
            r6 = r4[r3]
            r1 = r1[r5]
            r8 = r1[r3]
            double r8 = r8 - r6
            double r8 = r8 / r11
            r13[r3] = r8
            int r3 = r3 + 1
            goto L32
        L45:
            r0 = r5
            goto L1d
        L47:
            return
    }

    @Override // p331t.AbstractC6087b
    /* renamed from: f */
    public double[] mo12535f() {
            r1 = this;
            double[] r0 = r1.f23480a
            return r0
    }
}
