package p088f4;

/* renamed from: f4.w0 */
/* loaded from: classes.dex */
public final class C2052w0 implements p088f4.InterfaceC2014i {

    /* renamed from: b0 */
    public static final p088f4.C2052w0 f9371b0 = null;

    /* renamed from: Y */
    public final float f9372Y;

    /* renamed from: Z */
    public final float f9373Z;

    /* renamed from: a0 */
    public final int f9374a0;

    static {
            f4.w0 r0 = new f4.w0
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1)
            p088f4.C2052w0.f9371b0 = r0
            return
    }

    public C2052w0(float r5, float r6) {
            r4 = this;
            r4.<init>()
            r0 = 1
            r1 = 0
            r2 = 0
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 <= 0) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            p371v5.C6549a.m13288b(r3)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            p371v5.C6549a.m13288b(r0)
            r4.f9372Y = r5
            r4.f9373Z = r6
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            r4.f9374a0 = r5
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            java.lang.Class<f4.w0> r2 = p088f4.C2052w0.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            f4.w0 r5 = (p088f4.C2052w0) r5
            float r2 = r4.f9372Y
            float r3 = r5.f9372Y
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L23
            float r2 = r4.f9373Z
            float r5 = r5.f9373Z
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
        L25:
            return r1
    }

    public int hashCode() {
            r2 = this;
            float r0 = r2.f9372Y
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            int r0 = r0 + 527
            int r0 = r0 * 31
            float r1 = r2.f9373Z
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            float r1 = r3.f9372Y
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            float r1 = r3.f9373Z
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "PlaybackParameters(speed=%.2f, pitch=%.2f)"
            java.lang.String r0 = p371v5.C6552b0.m13318k(r1, r0)
            return r0
    }
}
