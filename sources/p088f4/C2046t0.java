package p088f4;

/* renamed from: f4.t0 */
/* loaded from: classes.dex */
public final class C2046t0 extends p088f4.AbstractC1998c1 {

    /* renamed from: a0 */
    public static final p088f4.InterfaceC2014i.a<p088f4.C2046t0> f9341a0 = null;

    /* renamed from: Z */
    public final float f9342Z;

    static {
            k1.d r0 = p179k1.C3646d.f16117f0
            p088f4.C2046t0.f9341a0 = r0
            return
    }

    public C2046t0() {
            r1 = this;
            r1.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.f9342Z = r0
            return
    }

    public C2046t0(float r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L10
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            java.lang.String r1 = "percent must be in the range of [0, 100]"
            p371v5.C6549a.m13289c(r0, r1)
            r2.f9342Z = r3
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p088f4.C2046t0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            float r0 = r2.f9342Z
            f4.t0 r3 = (p088f4.C2046t0) r3
            float r3 = r3.f9342Z
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L11
            r1 = 1
        L11:
            return r1
    }

    public int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            float r1 = r3.f9342Z
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
