package p065e0;

/* renamed from: e0.g */
/* loaded from: classes.dex */
public final class C1502g {

    /* renamed from: a */
    public final int[] f7312a;

    /* renamed from: b */
    public final float[] f7313b;

    public C1502g(int r4, int r5) {
            r3 = this;
            r3.<init>()
            r0 = 2
            int[] r1 = new int[r0]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r3.f7312a = r1
            float[] r4 = new float[r0]
            r4 = {x0016: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            r3.f7313b = r4
            return
    }

    public C1502g(int r4, int r5, int r6) {
            r3 = this;
            r3.<init>()
            r0 = 3
            int[] r1 = new int[r0]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r4 = 2
            r1[r4] = r6
            r3.f7312a = r1
            float[] r4 = new float[r0]
            r4 = {x001a: FILL_ARRAY_DATA , data: [0, 1056964608, 1065353216} // fill-array
            r3.f7313b = r4
            return
    }

    public C1502g(java.util.List<java.lang.Integer> r5, java.util.List<java.lang.Float> r6) {
            r4 = this;
            r4.<init>()
            int r0 = r5.size()
            int[] r1 = new int[r0]
            r4.f7312a = r1
            float[] r1 = new float[r0]
            r4.f7313b = r1
            r1 = 0
        L10:
            if (r1 >= r0) goto L31
            int[] r2 = r4.f7312a
            java.lang.Object r3 = r5.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2[r1] = r3
            float[] r2 = r4.f7313b
            java.lang.Object r3 = r6.get(r1)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L10
        L31:
            return
    }
}
