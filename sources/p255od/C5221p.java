package p255od;

/* renamed from: od.p */
/* loaded from: classes.dex */
public final class C5221p {
    private final java.util.List<p255od.C5217n> data;
    private final boolean success;

    public C5221p(boolean r2, java.util.List<p255od.C5217n> r3) {
            r1 = this;
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.success = r2
            r1.data = r3
            return
    }

    public static /* synthetic */ p255od.C5221p copy$default(p255od.C5221p r0, boolean r1, java.util.List r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            boolean r1 = r0.success
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.util.List<od.n> r2 = r0.data
        Lc:
            od.p r0 = r0.copy(r1, r2)
            return r0
    }

    public final boolean component1() {
            r1 = this;
            boolean r0 = r1.success
            return r0
    }

    public final java.util.List<p255od.C5217n> component2() {
            r1 = this;
            java.util.List<od.n> r0 = r1.data
            return r0
    }

    public final p255od.C5221p copy(boolean r2, java.util.List<p255od.C5217n> r3) {
            r1 = this;
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r3, r0)
            od.p r0 = new od.p
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5221p
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.p r5 = (p255od.C5221p) r5
            boolean r1 = r4.success
            boolean r3 = r5.success
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.List<od.n> r1 = r4.data
            java.util.List<od.n> r5 = r5.data
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final java.util.List<p255od.C5217n> getData() {
            r1 = this;
            java.util.List<od.n> r0 = r1.data
            return r0
    }

    public final boolean getSuccess() {
            r1 = this;
            boolean r0 = r1.success
            return r0
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.success
            if (r0 == 0) goto L5
            r0 = 1
        L5:
            int r0 = r0 * 31
            java.util.List<od.n> r1 = r2.data
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ClashdomeLandsResponse(success="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            boolean r1 = r3.success
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            java.util.List<od.n> r1 = r3.data
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
