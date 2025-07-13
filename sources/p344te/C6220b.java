package p344te;

/* renamed from: te.b */
/* loaded from: classes.dex */
public final class C6220b implements java.io.Serializable {

    @p189kb.InterfaceC4079b("suggested_median")
    private final java.lang.String suggestedMedian;

    public C6220b(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "suggestedMedian"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.suggestedMedian = r2
            return
    }

    public static /* synthetic */ p344te.C6220b copy$default(p344te.C6220b r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = r0.suggestedMedian
        L6:
            te.b r0 = r0.copy(r1)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.suggestedMedian
            return r0
    }

    public final p344te.C6220b copy(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "suggestedMedian"
            p214m2.C4339q.m9706k(r2, r0)
            te.b r0 = new te.b
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p344te.C6220b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            te.b r4 = (p344te.C6220b) r4
            java.lang.String r1 = r3.suggestedMedian
            java.lang.String r4 = r4.suggestedMedian
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final java.lang.String getSuggestedMedian() {
            r1 = this;
            java.lang.String r0 = r1.suggestedMedian
            return r0
    }

    public final double getSuggestedMedianDouble() {
            r4 = this;
            java.lang.String r0 = r4.suggestedMedian
            java.lang.Double r0 = p362uh.C6462h.m13048E(r0)
            if (r0 == 0) goto L12
            double r0 = r0.doubleValue()
            r2 = 100000000(0x5f5e100, float:2.3122341E-35)
            double r2 = (double) r2
            double r0 = r0 / r2
            goto L14
        L12:
            r0 = 0
        L14:
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.suggestedMedian
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "AtomicPrice(suggestedMedian="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.suggestedMedian
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
