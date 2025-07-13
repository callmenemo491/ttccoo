package p417xf;

/* renamed from: xf.i */
/* loaded from: classes.dex */
public final class C7055i {
    private final java.util.List<java.lang.String> list;
    private final java.lang.String list_name;

    public C7055i(java.lang.String r2, java.util.List<java.lang.String> r3) {
            r1 = this;
            java.lang.String r0 = "list_name"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "list"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.list_name = r2
            r1.list = r3
            return
    }

    public static /* synthetic */ p417xf.C7055i copy$default(p417xf.C7055i r0, java.lang.String r1, java.util.List r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.list_name
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.util.List<java.lang.String> r2 = r0.list
        Lc:
            xf.i r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.list_name
            return r0
    }

    public final java.util.List<java.lang.String> component2() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.list
            return r0
    }

    public final p417xf.C7055i copy(java.lang.String r2, java.util.List<java.lang.String> r3) {
            r1 = this;
            java.lang.String r0 = "list_name"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "list"
            p214m2.C4339q.m9706k(r3, r0)
            xf.i r0 = new xf.i
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p417xf.C7055i
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xf.i r5 = (p417xf.C7055i) r5
            java.lang.String r1 = r4.list_name
            java.lang.String r3 = r5.list_name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<java.lang.String> r1 = r4.list
            java.util.List<java.lang.String> r5 = r5.list
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.util.List<java.lang.String> getList() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.list
            return r0
    }

    public final java.lang.String getList_name() {
            r1 = this;
            java.lang.String r0 = r1.list_name
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.list_name
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List<java.lang.String> r1 = r2.list
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "CollectionStatusRow(list_name="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.list_name
            r0.append(r1)
            java.lang.String r1 = ", list="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r3.list
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
