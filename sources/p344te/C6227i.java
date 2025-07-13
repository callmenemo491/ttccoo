package p344te;

/* renamed from: te.i */
/* loaded from: classes.dex */
public final class C6227i {
    private final java.util.List<p344te.C6222d> data;

    public C6227i(java.util.List<p344te.C6222d> r2) {
            r1 = this;
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.data = r2
            return
    }

    public static /* synthetic */ p344te.C6227i copy$default(p344te.C6227i r0, java.util.List r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.util.List<te.d> r1 = r0.data
        L6:
            te.i r0 = r0.copy(r1)
            return r0
    }

    public final java.util.List<p344te.C6222d> component1() {
            r1 = this;
            java.util.List<te.d> r0 = r1.data
            return r0
    }

    public final p344te.C6227i copy(java.util.List<p344te.C6222d> r2) {
            r1 = this;
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r2, r0)
            te.i r0 = new te.i
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p344te.C6227i
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            te.i r4 = (p344te.C6227i) r4
            java.util.List<te.d> r1 = r3.data
            java.util.List<te.d> r4 = r4.data
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final java.util.List<p344te.C6222d> getData() {
            r1 = this;
            java.util.List<te.d> r0 = r1.data
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.List<te.d> r0 = r1.data
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "SalesResponse(data="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.List<te.d> r1 = r3.data
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
