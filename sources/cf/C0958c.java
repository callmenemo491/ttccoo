package cf;

/* renamed from: cf.c */
/* loaded from: classes.dex */
public final class C0958c {
    private final java.lang.String factor;
    private final java.lang.String type;

    public C0958c(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "factor"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "type"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.factor = r2
            r1.type = r3
            return
    }

    public static /* synthetic */ cf.C0958c copy$default(cf.C0958c r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.factor
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = r0.type
        Lc:
            cf.c r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.factor
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public final cf.C0958c copy(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "factor"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "type"
            p214m2.C4339q.m9706k(r3, r0)
            cf.c r0 = new cf.c
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof cf.C0958c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            cf.c r5 = (cf.C0958c) r5
            java.lang.String r1 = r4.factor
            java.lang.String r3 = r5.factor
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.type
            java.lang.String r5 = r5.type
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.lang.String getFactor() {
            r1 = this;
            java.lang.String r0 = r1.factor
            return r0
    }

    public final java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.factor
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.type
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Factor(factor="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.factor
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            java.lang.String r1 = r3.type
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
