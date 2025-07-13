package p152ig;

/* renamed from: ig.a */
/* loaded from: classes.dex */
public final class C3142a {

    /* renamed from: a */
    public final java.util.List<p173jg.C3609a> f12581a;

    /* renamed from: b */
    public final java.util.List<p173jg.C3609a> f12582b;

    /* renamed from: c */
    public final double f12583c;

    /* renamed from: d */
    public final double f12584d;

    public C3142a(java.util.List<p173jg.C3609a> r1, java.util.List<p173jg.C3609a> r2, double r3, double r5) {
            r0 = this;
            r0.<init>()
            r0.f12581a = r1
            r0.f12582b = r2
            r0.f12583c = r3
            r0.f12584d = r5
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p152ig.C3142a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ig.a r6 = (p152ig.C3142a) r6
            java.util.List<jg.a> r1 = r5.f12581a
            java.util.List<jg.a> r3 = r6.f12581a
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<jg.a> r1 = r5.f12582b
            java.util.List<jg.a> r3 = r6.f12582b
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            double r3 = r5.f12583c
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.f12583c
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L35
            return r2
        L35:
            double r3 = r5.f12584d
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.f12584d
            java.lang.Double r6 = java.lang.Double.valueOf(r3)
            boolean r6 = p214m2.C4339q.m9702c(r1, r6)
            if (r6 != 0) goto L48
            return r2
        L48:
            return r0
    }

    public int hashCode() {
            r6 = this;
            java.util.List<jg.a> r0 = r6.f12581a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List<jg.a> r1 = r6.f12582b
            r2 = 31
            int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
            double r1 = r6.f12583c
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            double r1 = r6.f12584d
            long r1 = java.lang.Double.doubleToLongBits(r1)
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "TUDataUI(extractors="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.List<jg.a> r1 = r3.f12581a
            r0.append(r1)
            java.lang.String r1 = ", bonuses="
            r0.append(r1)
            java.util.List<jg.a> r1 = r3.f12582b
            r0.append(r1)
            java.lang.String r1 = ", extractorsTotal="
            r0.append(r1)
            double r1 = r3.f12583c
            r0.append(r1)
            java.lang.String r1 = ", bonusTotal="
            r0.append(r1)
            double r1 = r3.f12584d
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
