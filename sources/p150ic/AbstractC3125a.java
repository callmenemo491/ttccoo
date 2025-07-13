package p150ic;

/* renamed from: ic.a */
/* loaded from: classes.dex */
public abstract class AbstractC3125a extends p129hc.AbstractC3019p {

    /* renamed from: a */
    public final int[] f12534a;

    /* renamed from: b */
    public final int[] f12535b;

    /* renamed from: c */
    public final float[] f12536c;

    /* renamed from: d */
    public final float[] f12537d;

    /* renamed from: e */
    public final int[] f12538e;

    /* renamed from: f */
    public final int[] f12539f;

    public AbstractC3125a() {
            r3 = this;
            r3.<init>()
            r0 = 4
            int[] r1 = new int[r0]
            r3.f12534a = r1
            r1 = 8
            int[] r1 = new int[r1]
            r3.f12535b = r1
            float[] r2 = new float[r0]
            r3.f12536c = r2
            float[] r0 = new float[r0]
            r3.f12537d = r0
            int r0 = r1.length
            int r0 = r0 / 2
            int[] r0 = new int[r0]
            r3.f12538e = r0
            int r0 = r1.length
            int r0 = r0 / 2
            int[] r0 = new int[r0]
            r3.f12539f = r0
            return
    }

    /* renamed from: i */
    public static void m7589i(int[] r5, float[] r6) {
            r0 = 0
            r1 = r6[r0]
            r2 = 1
            r3 = 1
        L5:
            int r4 = r5.length
            if (r3 >= r4) goto L15
            r4 = r6[r3]
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 >= 0) goto L12
            r0 = r6[r3]
            r1 = r0
            r0 = r3
        L12:
            int r3 = r3 + 1
            goto L5
        L15:
            r6 = r5[r0]
            int r6 = r6 - r2
            r5[r0] = r6
            return
    }

    /* renamed from: j */
    public static void m7590j(int[] r5, float[] r6) {
            r0 = 0
            r1 = r6[r0]
            r2 = 1
            r3 = 1
        L5:
            int r4 = r5.length
            if (r3 >= r4) goto L15
            r4 = r6[r3]
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L12
            r0 = r6[r3]
            r1 = r0
            r0 = r3
        L12:
            int r3 = r3 + 1
            goto L5
        L15:
            r6 = r5[r0]
            int r6 = r6 + r2
            r5[r0] = r6
            return
    }

    /* renamed from: k */
    public static boolean m7591k(int[] r7) {
            r0 = 0
            r1 = r7[r0]
            r2 = 1
            r3 = r7[r2]
            int r1 = r1 + r3
            r3 = 2
            r3 = r7[r3]
            int r3 = r3 + r1
            r4 = 3
            r4 = r7[r4]
            int r3 = r3 + r4
            float r1 = (float) r1
            float r3 = (float) r3
            float r1 = r1 / r3
            r3 = 1061857963(0x3f4aaaab, float:0.7916667)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L39
            r3 = 1063555657(0x3f649249, float:0.89285713)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L39
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = r7.length
            r5 = 0
        L27:
            if (r5 >= r4) goto L34
            r6 = r7[r5]
            if (r6 <= r3) goto L2e
            r3 = r6
        L2e:
            if (r6 >= r1) goto L31
            r1 = r6
        L31:
            int r5 = r5 + 1
            goto L27
        L34:
            int r1 = r1 * 10
            if (r3 >= r1) goto L39
            return r2
        L39:
            return r0
    }

    /* renamed from: l */
    public static int m7592l(int[] r3, int[][] r4) {
            r0 = 0
        L1:
            int r1 = r4.length
            if (r0 >= r1) goto L18
            r1 = r4[r0]
            r2 = 1055286886(0x3ee66666, float:0.45)
            float r1 = p129hc.AbstractC3019p.m7420f(r3, r1, r2)
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L15
            return r0
        L15:
            int r0 = r0 + 1
            goto L1
        L18:
            sb.k r3 = sb.C6017k.f23200a0
            throw r3
    }
}
