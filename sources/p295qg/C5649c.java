package p295qg;

/* renamed from: qg.c */
/* loaded from: classes.dex */
public final class C5649c {
    private final java.util.List<p295qg.C5648b> levels;
    private final java.lang.String pool;

    public C5649c(java.lang.String r2, java.util.List<p295qg.C5648b> r3) {
            r1 = this;
            java.lang.String r0 = "pool"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "levels"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.pool = r2
            r1.levels = r3
            return
    }

    public static /* synthetic */ p295qg.C5649c copy$default(p295qg.C5649c r0, java.lang.String r1, java.util.List r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.pool
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.util.List<qg.b> r2 = r0.levels
        Lc:
            qg.c r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.pool
            return r0
    }

    public final java.util.List<p295qg.C5648b> component2() {
            r1 = this;
            java.util.List<qg.b> r0 = r1.levels
            return r0
    }

    public final p295qg.C5649c copy(java.lang.String r2, java.util.List<p295qg.C5648b> r3) {
            r1 = this;
            java.lang.String r0 = "pool"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "levels"
            p214m2.C4339q.m9706k(r3, r0)
            qg.c r0 = new qg.c
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p295qg.C5649c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qg.c r5 = (p295qg.C5649c) r5
            java.lang.String r1 = r4.pool
            java.lang.String r3 = r5.pool
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<qg.b> r1 = r4.levels
            java.util.List<qg.b> r5 = r5.levels
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.util.List<p295qg.C5648b> getLevels() {
            r1 = this;
            java.util.List<qg.b> r0 = r1.levels
            return r0
    }

    public final java.lang.String getPool() {
            r1 = this;
            java.lang.String r0 = r1.pool
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.pool
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List<qg.b> r1 = r2.levels
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Row(pool="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.pool
            r0.append(r1)
            java.lang.String r1 = ", levels="
            r0.append(r1)
            java.util.List<qg.b> r1 = r3.levels
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
