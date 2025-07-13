package md;

/* renamed from: md.j */
/* loaded from: classes.dex */
public final class C4559j<T> {
    private final java.lang.String next_key;
    private final java.util.List<T> rows;

    public C4559j(java.util.List<? extends T> r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "rows"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.rows = r2
            r1.next_key = r3
            return
    }

    public static /* synthetic */ md.C4559j copy$default(md.C4559j r0, java.util.List r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.util.List<T> r1 = r0.rows
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = r0.next_key
        Lc:
            md.j r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.util.List<T> component1() {
            r1 = this;
            java.util.List<T> r0 = r1.rows
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.next_key
            return r0
    }

    public final md.C4559j<T> copy(java.util.List<? extends T> r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "rows"
            p214m2.C4339q.m9706k(r2, r0)
            md.j r0 = new md.j
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof md.C4559j
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.j r5 = (md.C4559j) r5
            java.util.List<T> r1 = r4.rows
            java.util.List<T> r3 = r5.rows
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.next_key
            java.lang.String r5 = r5.next_key
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.lang.String getNext_key() {
            r1 = this;
            java.lang.String r0 = r1.next_key
            return r0
    }

    public final java.util.List<T> getRows() {
            r1 = this;
            java.util.List<T> r0 = r1.rows
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.util.List<T> r0 = r2.rows
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.next_key
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "BaseRowsResponse(rows="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.List<T> r1 = r3.rows
            r0.append(r1)
            java.lang.String r1 = ", next_key="
            r0.append(r1)
            java.lang.String r1 = r3.next_key
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
