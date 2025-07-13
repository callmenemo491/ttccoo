package p185k7;

/* renamed from: k7.p5 */
/* loaded from: classes.dex */
public final class C3935p5 {

    /* renamed from: a */
    public final java.lang.Object f16828a;

    /* renamed from: b */
    public final int f16829b;

    public C3935p5(java.lang.Object r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f16828a = r1
            r0.f16829b = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p185k7.C3935p5
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            k7.p5 r4 = (p185k7.C3935p5) r4
            java.lang.Object r0 = r3.f16828a
            java.lang.Object r2 = r4.f16828a
            if (r0 != r2) goto L16
            int r0 = r3.f16829b
            int r4 = r4.f16829b
            if (r0 != r4) goto L16
            r4 = 1
            return r4
        L16:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.f16828a
            int r0 = java.lang.System.identityHashCode(r0)
            r1 = 65535(0xffff, float:9.1834E-41)
            int r0 = r0 * r1
            int r1 = r2.f16829b
            int r0 = r0 + r1
            return r0
    }
}
