package p255od;

/* renamed from: od.l */
/* loaded from: classes.dex */
public final class C5213l {

    /* renamed from: p1 */
    private final java.lang.String f20345p1;

    /* renamed from: p2 */
    private final java.lang.String f20346p2;

    /* renamed from: s */
    private final java.lang.String f20347s;

    /* renamed from: t */
    private final int f20348t;

    public C5213l(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5) {
            r1 = this;
            java.lang.String r0 = "p1"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "p2"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "s"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.f20345p1 = r2
            r1.f20346p2 = r3
            r1.f20347s = r4
            r1.f20348t = r5
            return
    }

    public static /* synthetic */ p255od.C5213l copy$default(p255od.C5213l r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.lang.String r1 = r0.f20345p1
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.lang.String r2 = r0.f20346p2
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            java.lang.String r3 = r0.f20347s
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            int r4 = r0.f20348t
        L18:
            od.l r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.f20345p1
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.f20346p2
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.f20347s
            return r0
    }

    public final int component4() {
            r1 = this;
            int r0 = r1.f20348t
            return r0
    }

    public final p255od.C5213l copy(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5) {
            r1 = this;
            java.lang.String r0 = "p1"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "p2"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "s"
            p214m2.C4339q.m9706k(r4, r0)
            od.l r0 = new od.l
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5213l
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.l r5 = (p255od.C5213l) r5
            java.lang.String r1 = r4.f20345p1
            java.lang.String r3 = r5.f20345p1
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f20346p2
            java.lang.String r3 = r5.f20346p2
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f20347s
            java.lang.String r3 = r5.f20347s
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            int r1 = r4.f20348t
            int r5 = r5.f20348t
            if (r1 == r5) goto L34
            return r2
        L34:
            return r0
    }

    public final java.lang.String getP1() {
            r1 = this;
            java.lang.String r0 = r1.f20345p1
            return r0
    }

    public final java.lang.String getP2() {
            r1 = this;
            java.lang.String r0 = r1.f20346p2
            return r0
    }

    public final java.lang.String getS() {
            r1 = this;
            java.lang.String r0 = r1.f20347s
            return r0
    }

    public final int getT() {
            r1 = this;
            int r0 = r1.f20348t
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f20345p1
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.f20346p2
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.f20347s
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r3.f20348t
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ChartItem(p1="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f20345p1
            r0.append(r1)
            java.lang.String r1 = ", p2="
            r0.append(r1)
            java.lang.String r1 = r3.f20346p2
            r0.append(r1)
            java.lang.String r1 = ", s="
            r0.append(r1)
            java.lang.String r1 = r3.f20347s
            r0.append(r1)
            java.lang.String r1 = ", t="
            r0.append(r1)
            int r1 = r3.f20348t
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
