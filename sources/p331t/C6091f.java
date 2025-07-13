package p331t;

/* renamed from: t.f */
/* loaded from: classes.dex */
public class C6091f {

    /* renamed from: a */
    public float[] f23485a;

    /* renamed from: b */
    public double[] f23486b;

    /* renamed from: c */
    public double[] f23487c;

    /* renamed from: d */
    public int f23488d;

    public C6091f() {
            r2 = this;
            r2.<init>()
            r0 = 0
            float[] r1 = new float[r0]
            r2.f23485a = r1
            double[] r0 = new double[r0]
            r2.f23486b = r0
            return
    }

    /* renamed from: a */
    public void m12548a(double r5, float r7) {
            r4 = this;
            float[] r0 = r4.f23485a
            int r0 = r0.length
            int r0 = r0 + 1
            double[] r1 = r4.f23486b
            int r1 = java.util.Arrays.binarySearch(r1, r5)
            if (r1 >= 0) goto L10
            int r1 = -r1
            int r1 = r1 + (-1)
        L10:
            double[] r2 = r4.f23486b
            double[] r2 = java.util.Arrays.copyOf(r2, r0)
            r4.f23486b = r2
            float[] r2 = r4.f23485a
            float[] r2 = java.util.Arrays.copyOf(r2, r0)
            r4.f23485a = r2
            double[] r2 = new double[r0]
            r4.f23487c = r2
            double[] r2 = r4.f23486b
            int r3 = r1 + 1
            int r0 = r0 - r1
            int r0 = r0 + (-1)
            java.lang.System.arraycopy(r2, r1, r2, r3, r0)
            double[] r0 = r4.f23486b
            r0[r1] = r5
            float[] r5 = r4.f23485a
            r5[r1] = r7
            return
    }

    /* renamed from: b */
    public double m12549b(double r11) {
            r10 = this;
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2 = 0
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 >= 0) goto La
            r11 = r2
            goto Lf
        La:
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 <= 0) goto Lf
            r11 = r0
        Lf:
            double[] r4 = r10.f23486b
            int r4 = java.util.Arrays.binarySearch(r4, r11)
            if (r4 <= 0) goto L18
            goto L54
        L18:
            if (r4 == 0) goto L53
            int r0 = -r4
            int r0 = r0 + (-1)
            float[] r1 = r10.f23485a
            r2 = r1[r0]
            int r3 = r0 + (-1)
            r4 = r1[r3]
            float r2 = r2 - r4
            double r4 = (double) r2
            double[] r2 = r10.f23486b
            r6 = r2[r0]
            r8 = r2[r3]
            double r6 = r6 - r8
            double r4 = r4 / r6
            double[] r0 = r10.f23487c
            r6 = r0[r3]
            r0 = r1[r3]
            double r0 = (double) r0
            r8 = r2[r3]
            double r8 = r8 * r4
            double r0 = r0 - r8
            r8 = r2[r3]
            double r8 = r11 - r8
            double r8 = r8 * r0
            double r8 = r8 + r6
            double r11 = r11 * r11
            r0 = r2[r3]
            r6 = r2[r3]
            double r0 = r0 * r6
            double r11 = r11 - r0
            double r11 = r11 * r4
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r11 = r11 / r0
            double r0 = r11 + r8
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "pos ="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            double[] r1 = r2.f23486b
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = " period="
            r0.append(r1)
            float[] r1 = r2.f23485a
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
