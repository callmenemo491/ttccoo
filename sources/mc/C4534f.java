package mc;

/* renamed from: mc.f */
/* loaded from: classes.dex */
public final class C4534f {

    /* renamed from: a */
    public static final float[][] f18438a = null;

    static {
            int[] r0 = lc.C4262a.f17464b
            int r0 = r0.length
            r1 = 2
            int[] r1 = new int[r1]
            r2 = 1
            r3 = 8
            r1[r2] = r3
            r4 = 0
            r1[r4] = r0
            java.lang.Class<float> r0 = float.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            float[][] r0 = (float[][]) r0
            mc.C4534f.f18438a = r0
            r0 = 0
        L19:
            int[] r1 = lc.C4262a.f17464b
            int r5 = r1.length
            if (r0 >= r5) goto L43
            r1 = r1[r0]
            r5 = r1 & 1
            r6 = 0
        L23:
            if (r6 >= r3) goto L40
            r7 = 0
        L26:
            r8 = r1 & 1
            if (r8 != r5) goto L30
            r8 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 + r8
            int r1 = r1 >> 1
            goto L26
        L30:
            float[][] r5 = mc.C4534f.f18438a
            r5 = r5[r0]
            int r9 = 8 - r6
            int r9 = r9 - r2
            r10 = 1099431936(0x41880000, float:17.0)
            float r7 = r7 / r10
            r5[r9] = r7
            int r6 = r6 + 1
            r5 = r8
            goto L23
        L40:
            int r0 = r0 + 1
            goto L19
        L43:
            return
    }
}
