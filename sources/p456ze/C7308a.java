package p456ze;

/* renamed from: ze.a */
/* loaded from: classes.dex */
public final class C7308a {
    private final java.util.List<java.lang.Object> rows;

    public C7308a(java.util.List<java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "rows"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.rows = r2
            return
    }

    public static /* synthetic */ p456ze.C7308a copy$default(p456ze.C7308a r0, java.util.List r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.util.List<java.lang.Object> r1 = r0.rows
        L6:
            ze.a r0 = r0.copy(r1)
            return r0
    }

    public final java.util.List<java.lang.Object> component1() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.rows
            return r0
    }

    public final p456ze.C7308a copy(java.util.List<java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "rows"
            p214m2.C4339q.m9706k(r2, r0)
            ze.a r0 = new ze.a
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p456ze.C7308a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ze.a r4 = (p456ze.C7308a) r4
            java.util.List<java.lang.Object> r1 = r3.rows
            java.util.List<java.lang.Object> r4 = r4.rows
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final java.util.List<java.lang.Object> getRows() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.rows
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.rows
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "BluDACAuthResponse(rows="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.List<java.lang.Object> r1 = r3.rows
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
