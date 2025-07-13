package p088f4;

/* renamed from: f4.k1 */
/* loaded from: classes.dex */
public final class C2022k1 extends p088f4.AbstractC1998c1 {

    /* renamed from: b0 */
    public static final p088f4.InterfaceC2014i.a<p088f4.C2022k1> f9161b0 = null;

    /* renamed from: Z */
    public final int f9162Z;

    /* renamed from: a0 */
    public final float f9163a0;

    static {
            k1.b r0 = p179k1.C3642b.f16057f0
            p088f4.C2022k1.f9161b0 = r0
            return
    }

    public C2022k1(int r3) {
            r2 = this;
            r2.<init>()
            if (r3 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r1 = "maxStars must be a positive integer"
            p371v5.C6549a.m13289c(r0, r1)
            r2.f9162Z = r3
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.f9163a0 = r3
            return
    }

    public C2022k1(int r5, float r6) {
            r4 = this;
            r4.<init>()
            r0 = 1
            r1 = 0
            if (r5 <= 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            java.lang.String r3 = "maxStars must be a positive integer"
            p371v5.C6549a.m13289c(r2, r3)
            r2 = 0
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L1a
            float r2 = (float) r5
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 > 0) goto L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            java.lang.String r1 = "starRating is out of range [0, maxStars]"
            p371v5.C6549a.m13289c(r0, r1)
            r4.f9162Z = r5
            r4.f9163a0 = r6
            return
    }

    /* renamed from: a */
    public static java.lang.String m5314a(int r1) {
            r0 = 36
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p088f4.C2022k1
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            f4.k1 r4 = (p088f4.C2022k1) r4
            int r0 = r3.f9162Z
            int r2 = r4.f9162Z
            if (r0 != r2) goto L17
            float r0 = r3.f9163a0
            float r4 = r4.f9163a0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L17
            r1 = 1
        L17:
            return r1
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.f9162Z
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            float r1 = r3.f9163a0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
