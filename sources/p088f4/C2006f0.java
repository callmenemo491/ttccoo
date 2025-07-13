package p088f4;

/* renamed from: f4.f0 */
/* loaded from: classes.dex */
public final class C2006f0 extends p088f4.AbstractC1998c1 {

    /* renamed from: b0 */
    public static final p088f4.InterfaceC2014i.a<p088f4.C2006f0> f8944b0 = null;

    /* renamed from: Z */
    public final boolean f8945Z;

    /* renamed from: a0 */
    public final boolean f8946a0;

    static {
            androidx.room.a r0 = androidx.room.C0618a.f3654d0
            p088f4.C2006f0.f8944b0 = r0
            return
    }

    public C2006f0() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f8945Z = r0
            r1.f8946a0 = r0
            return
    }

    public C2006f0(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f8945Z = r0
            r1.f8946a0 = r2
            return
    }

    /* renamed from: a */
    public static java.lang.String m5238a(int r1) {
            r0 = 36
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p088f4.C2006f0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            f4.f0 r4 = (p088f4.C2006f0) r4
            boolean r0 = r3.f8946a0
            boolean r2 = r4.f8946a0
            if (r0 != r2) goto L15
            boolean r0 = r3.f8945Z
            boolean r4 = r4.f8945Z
            if (r0 != r4) goto L15
            r1 = 1
        L15:
            return r1
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            boolean r1 = r3.f8945Z
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            boolean r1 = r3.f8946a0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
