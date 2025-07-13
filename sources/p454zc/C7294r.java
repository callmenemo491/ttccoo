package p454zc;

/* renamed from: zc.r */
/* loaded from: classes.dex */
public class C7294r implements java.lang.Comparable<p454zc.C7294r> {

    /* renamed from: Y */
    public final int f27963Y;

    /* renamed from: Z */
    public final int f27964Z;

    public C7294r(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f27963Y = r1
            r0.f27964Z = r2
            return
    }

    @Override // java.lang.Comparable
    public int compareTo(p454zc.C7294r r3) {
            r2 = this;
            zc.r r3 = (p454zc.C7294r) r3
            int r0 = r2.f27964Z
            int r1 = r2.f27963Y
            int r0 = r0 * r1
            int r1 = r3.f27964Z
            int r3 = r3.f27963Y
            int r1 = r1 * r3
            if (r1 >= r0) goto L12
            r3 = 1
            goto L17
        L12:
            if (r1 <= r0) goto L16
            r3 = -1
            goto L17
        L16:
            r3 = 0
        L17:
            return r3
    }

    /* renamed from: e */
    public p454zc.C7294r m14394e(p454zc.C7294r r6) {
            r5 = this;
            int r0 = r5.f27963Y
            int r1 = r6.f27964Z
            int r2 = r0 * r1
            int r6 = r6.f27963Y
            int r3 = r5.f27964Z
            int r4 = r6 * r3
            if (r2 > r4) goto L17
            zc.r r1 = new zc.r
            int r3 = r3 * r6
            int r3 = r3 / r0
            r1.<init>(r6, r3)
            return r1
        L17:
            zc.r r6 = new zc.r
            int r0 = r0 * r1
            int r0 = r0 / r3
            r6.<init>(r0, r1)
            return r6
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L21
            java.lang.Class<zc.r> r2 = p454zc.C7294r.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L21
        L10:
            zc.r r5 = (p454zc.C7294r) r5
            int r2 = r4.f27963Y
            int r3 = r5.f27963Y
            if (r2 != r3) goto L1f
            int r2 = r4.f27964Z
            int r5 = r5.f27964Z
            if (r2 != r5) goto L1f
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
        L21:
            return r1
    }

    /* renamed from: g */
    public p454zc.C7294r m14395g(p454zc.C7294r r6) {
            r5 = this;
            int r0 = r5.f27963Y
            int r1 = r6.f27964Z
            int r2 = r0 * r1
            int r6 = r6.f27963Y
            int r3 = r5.f27964Z
            int r4 = r6 * r3
            if (r2 < r4) goto L17
            zc.r r1 = new zc.r
            int r3 = r3 * r6
            int r3 = r3 / r0
            r1.<init>(r6, r3)
            return r1
        L17:
            zc.r r6 = new zc.r
            int r0 = r0 * r1
            int r0 = r0 / r3
            r6.<init>(r0, r1)
            return r6
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f27963Y
            int r0 = r0 * 31
            int r1 = r2.f27964Z
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.f27963Y
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            int r1 = r2.f27964Z
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
