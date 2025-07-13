package p124h7;

/* renamed from: h7.a2 */
/* loaded from: classes.dex */
public final class C2523a2 implements java.lang.Comparable<p124h7.C2523a2> {

    /* renamed from: Y */
    public final byte[] f11366Y;

    public /* synthetic */ C2523a2(byte[] r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.length
            byte[] r2 = java.util.Arrays.copyOf(r2, r0)
            r1.f11366Y = r2
            return
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(p124h7.C2523a2 r5) {
            r4 = this;
            h7.a2 r5 = (p124h7.C2523a2) r5
            byte[] r0 = r4.f11366Y
            int r0 = r0.length
            byte[] r1 = r5.f11366Y
            int r1 = r1.length
            r2 = 0
            if (r0 == r1) goto Le
            int r2 = r0 - r1
            goto L22
        Le:
            r0 = 0
        Lf:
            byte[] r1 = r4.f11366Y
            int r3 = r1.length
            if (r0 >= r3) goto L22
            r1 = r1[r0]
            byte[] r3 = r5.f11366Y
            r3 = r3[r0]
            if (r1 == r3) goto L1f
            int r2 = r1 - r3
            goto L22
        L1f:
            int r0 = r0 + 1
            goto Lf
        L22:
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p124h7.C2523a2
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            h7.a2 r2 = (p124h7.C2523a2) r2
            byte[] r0 = r1.f11366Y
            byte[] r2 = r2.f11366Y
            boolean r2 = java.util.Arrays.equals(r0, r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            byte[] r0 = r1.f11366Y
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            byte[] r0 = r1.f11366Y
            java.lang.String r0 = p036c6.C0906q0.m2616d(r0)
            return r0
    }
}
