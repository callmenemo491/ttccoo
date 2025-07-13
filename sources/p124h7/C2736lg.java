package p124h7;

/* renamed from: h7.lg */
/* loaded from: classes.dex */
public final class C2736lg {

    /* renamed from: a */
    public final java.lang.Object f11755a;

    /* renamed from: b */
    public final int f11756b;

    public C2736lg(java.lang.Object r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f11755a = r1
            r0.f11756b = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p124h7.C2736lg
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            h7.lg r4 = (p124h7.C2736lg) r4
            java.lang.Object r0 = r3.f11755a
            java.lang.Object r2 = r4.f11755a
            if (r0 != r2) goto L16
            int r0 = r3.f11756b
            int r4 = r4.f11756b
            if (r0 != r4) goto L16
            r4 = 1
            return r4
        L16:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.f11755a
            int r0 = java.lang.System.identityHashCode(r0)
            r1 = 65535(0xffff, float:9.1834E-41)
            int r0 = r0 * r1
            int r1 = r2.f11756b
            int r0 = r0 + r1
            return r0
    }
}
