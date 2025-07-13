package p255od;

/* renamed from: od.v */
/* loaded from: classes.dex */
public final class C5233v {
    private final java.util.List<p255od.C5231u> data;
    private final long query_time;
    private final boolean success;

    public C5233v(java.util.List<p255od.C5231u> r2, long r3, boolean r5) {
            r1 = this;
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.data = r2
            r1.query_time = r3
            r1.success = r5
            return
    }

    public static /* synthetic */ p255od.C5233v copy$default(p255od.C5233v r0, java.util.List r1, long r2, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.util.List<od.u> r1 = r0.data
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            long r2 = r0.query_time
        Lc:
            r5 = r5 & 4
            if (r5 == 0) goto L12
            boolean r4 = r0.success
        L12:
            od.v r0 = r0.copy(r1, r2, r4)
            return r0
    }

    public final java.util.List<p255od.C5231u> component1() {
            r1 = this;
            java.util.List<od.u> r0 = r1.data
            return r0
    }

    public final long component2() {
            r2 = this;
            long r0 = r2.query_time
            return r0
    }

    public final boolean component3() {
            r1 = this;
            boolean r0 = r1.success
            return r0
    }

    public final p255od.C5233v copy(java.util.List<p255od.C5231u> r2, long r3, boolean r5) {
            r1 = this;
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r2, r0)
            od.v r0 = new od.v
            r0.<init>(r2, r3, r5)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p255od.C5233v
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.v r8 = (p255od.C5233v) r8
            java.util.List<od.u> r1 = r7.data
            java.util.List<od.u> r3 = r8.data
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.query_time
            long r5 = r8.query_time
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L20
            return r2
        L20:
            boolean r1 = r7.success
            boolean r8 = r8.success
            if (r1 == r8) goto L27
            return r2
        L27:
            return r0
    }

    public final java.util.List<p255od.C5231u> getData() {
            r1 = this;
            java.util.List<od.u> r0 = r1.data
            return r0
    }

    public final long getQuery_time() {
            r2 = this;
            long r0 = r2.query_time
            return r0
    }

    public final boolean getSuccess() {
            r1 = this;
            boolean r0 = r1.success
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.util.List<od.u> r0 = r5.data
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r5.query_time
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r1 = r5.success
            if (r1 == 0) goto L18
            r1 = 1
        L18:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "IngredientResponse(data="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.List<od.u> r1 = r3.data
            r0.append(r1)
            java.lang.String r1 = ", query_time="
            r0.append(r1)
            long r1 = r3.query_time
            r0.append(r1)
            java.lang.String r1 = ", success="
            r0.append(r1)
            boolean r1 = r3.success
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
