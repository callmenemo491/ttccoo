package mg;

/* renamed from: mg.d */
/* loaded from: classes.dex */
public final class C4606d {
    private final java.util.List<mg.C4607e> actions;

    public C4606d(java.util.List<mg.C4607e> r2) {
            r1 = this;
            java.lang.String r0 = "actions"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.actions = r2
            return
    }

    public static /* synthetic */ mg.C4606d copy$default(mg.C4606d r0, java.util.List r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.util.List<mg.e> r1 = r0.actions
        L6:
            mg.d r0 = r0.copy(r1)
            return r0
    }

    public final java.util.List<mg.C4607e> component1() {
            r1 = this;
            java.util.List<mg.e> r0 = r1.actions
            return r0
    }

    public final mg.C4606d copy(java.util.List<mg.C4607e> r2) {
            r1 = this;
            java.lang.String r0 = "actions"
            p214m2.C4339q.m9706k(r2, r0)
            mg.d r0 = new mg.d
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof mg.C4606d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            mg.d r4 = (mg.C4606d) r4
            java.util.List<mg.e> r1 = r3.actions
            java.util.List<mg.e> r4 = r4.actions
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final java.util.List<mg.C4607e> getActions() {
            r1 = this;
            java.util.List<mg.e> r0 = r1.actions
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.List<mg.e> r0 = r1.actions
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "BloksResponse(actions="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.List<mg.e> r1 = r3.actions
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
