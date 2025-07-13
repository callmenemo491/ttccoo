package p192kf;

/* renamed from: kf.b */
/* loaded from: classes.dex */
public final class C4105b {

    /* renamed from: a */
    public final int f17061a;

    /* renamed from: b */
    public final int f17062b;

    /* renamed from: c */
    public final int f17063c;

    /* renamed from: d */
    public final int f17064d;

    public C4105b(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f17061a = r1
            r0.f17062b = r2
            r0.f17063c = r3
            r0.f17064d = r4
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p192kf.C4105b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kf.b r5 = (p192kf.C4105b) r5
            int r1 = r4.f17061a
            int r3 = r5.f17061a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f17062b
            int r3 = r5.f17062b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.f17063c
            int r3 = r5.f17063c
            if (r1 == r3) goto L21
            return r2
        L21:
            int r1 = r4.f17064d
            int r5 = r5.f17064d
            if (r1 == r5) goto L28
            return r2
        L28:
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f17061a
            int r0 = r0 * 31
            int r1 = r2.f17062b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f17063c
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f17064d
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "FTResources(water="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.f17061a
            r0.append(r1)
            java.lang.String r1 = ", water_max="
            r0.append(r1)
            int r1 = r3.f17062b
            r0.append(r1)
            java.lang.String r1 = ", food="
            r0.append(r1)
            int r1 = r3.f17063c
            r0.append(r1)
            java.lang.String r1 = ", food_max="
            r0.append(r1)
            int r1 = r3.f17064d
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
