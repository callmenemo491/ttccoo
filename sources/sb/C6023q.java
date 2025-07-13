package sb;

/* renamed from: sb.q */
/* loaded from: classes.dex */
public class C6023q {

    /* renamed from: a */
    public final float f23222a;

    /* renamed from: b */
    public final float f23223b;

    public C6023q(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f23222a = r1
            r0.f23223b = r2
            return
    }

    /* renamed from: a */
    public static float m12501a(sb.C6023q r2, sb.C6023q r3) {
            float r0 = r2.f23222a
            float r2 = r2.f23223b
            float r1 = r3.f23222a
            float r3 = r3.f23223b
            float r2 = p185k7.C4038x4.m9091d(r0, r2, r1, r3)
            return r2
    }

    /* renamed from: b */
    public static void m12502b(sb.C6023q[] r11) {
            r0 = 0
            r1 = r11[r0]
            r2 = 1
            r3 = r11[r2]
            float r1 = m12501a(r1, r3)
            r3 = r11[r2]
            r4 = 2
            r5 = r11[r4]
            float r3 = m12501a(r3, r5)
            r5 = r11[r0]
            r6 = r11[r4]
            float r5 = m12501a(r5, r6)
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 < 0) goto L2a
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 < 0) goto L2a
            r1 = r11[r0]
            r3 = r11[r2]
            r5 = r11[r4]
            goto L3f
        L2a:
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 < 0) goto L39
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L39
            r1 = r11[r2]
            r3 = r11[r0]
            r5 = r11[r4]
            goto L3f
        L39:
            r1 = r11[r4]
            r3 = r11[r0]
            r5 = r11[r2]
        L3f:
            float r6 = r1.f23222a
            float r7 = r1.f23223b
            float r8 = r5.f23222a
            float r8 = r8 - r6
            float r9 = r3.f23223b
            float r9 = r9 - r7
            float r9 = r9 * r8
            float r8 = r5.f23223b
            float r8 = r8 - r7
            float r7 = r3.f23222a
            float r7 = r7 - r6
            float r7 = r7 * r8
            float r9 = r9 - r7
            r6 = 0
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 >= 0) goto L5c
            r10 = r5
            r5 = r3
            r3 = r10
        L5c:
            r11[r0] = r3
            r11[r2] = r1
            r11[r4] = r5
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof sb.C6023q
            r1 = 0
            if (r0 == 0) goto L19
            sb.q r4 = (sb.C6023q) r4
            float r0 = r3.f23222a
            float r2 = r4.f23222a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L19
            float r0 = r3.f23223b
            float r4 = r4.f23223b
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L19
            r4 = 1
            return r4
        L19:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.f23222a
            int r0 = java.lang.Float.floatToIntBits(r0)
            int r0 = r0 * 31
            float r1 = r2.f23223b
            int r1 = java.lang.Float.floatToIntBits(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            float r1 = r2.f23222a
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            float r1 = r2.f23223b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
