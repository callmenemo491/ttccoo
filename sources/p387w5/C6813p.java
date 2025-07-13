package p387w5;

/* renamed from: w5.p */
/* loaded from: classes.dex */
public final class C6813p implements p088f4.InterfaceC2014i {

    /* renamed from: Y */
    public final int f26519Y;

    /* renamed from: Z */
    public final int f26520Z;

    /* renamed from: a0 */
    public final int f26521a0;

    /* renamed from: b0 */
    public final float f26522b0;

    public C6813p(int r1, int r2, int r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.f26519Y = r1
            r0.f26520Z = r2
            r0.f26521a0 = r3
            r0.f26522b0 = r4
            return
    }

    /* renamed from: a */
    public static java.lang.String m13882a(int r1) {
            r0 = 36
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p387w5.C6813p
            r2 = 0
            if (r1 == 0) goto L28
            w5.p r5 = (p387w5.C6813p) r5
            int r1 = r4.f26519Y
            int r3 = r5.f26519Y
            if (r1 != r3) goto L26
            int r1 = r4.f26520Z
            int r3 = r5.f26520Z
            if (r1 != r3) goto L26
            int r1 = r4.f26521a0
            int r3 = r5.f26521a0
            if (r1 != r3) goto L26
            float r1 = r4.f26522b0
            float r5 = r5.f26522b0
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L26
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
        L28:
            return r2
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f26519Y
            r1 = 217(0xd9, float:3.04E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f26520Z
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f26521a0
            int r1 = r1 + r0
            int r1 = r1 * 31
            float r0 = r2.f26522b0
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            int r0 = r0 + r1
            return r0
    }
}
