package p088f4;

/* renamed from: f4.m1 */
/* loaded from: classes.dex */
public final class C2028m1 extends p088f4.AbstractC1998c1 {

    /* renamed from: b0 */
    public static final p088f4.InterfaceC2014i.a<p088f4.C2028m1> f9213b0 = null;

    /* renamed from: Z */
    public final boolean f9214Z;

    /* renamed from: a0 */
    public final boolean f9215a0;

    static {
            androidx.room.a r0 = androidx.room.C0618a.f3656f0
            p088f4.C2028m1.f9213b0 = r0
            return
    }

    public C2028m1() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f9214Z = r0
            r1.f9215a0 = r0
            return
    }

    public C2028m1(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f9214Z = r0
            r1.f9215a0 = r2
            return
    }

    /* renamed from: a */
    public static java.lang.String m5336a(int r1) {
            r0 = 36
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p088f4.C2028m1
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            f4.m1 r4 = (p088f4.C2028m1) r4
            boolean r0 = r3.f9215a0
            boolean r2 = r4.f9215a0
            if (r0 != r2) goto L15
            boolean r0 = r3.f9214Z
            boolean r4 = r4.f9214Z
            if (r0 != r4) goto L15
            r1 = 1
        L15:
            return r1
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            boolean r1 = r3.f9214Z
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            boolean r1 = r3.f9215a0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
