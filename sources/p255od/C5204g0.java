package p255od;

/* renamed from: od.g0 */
/* loaded from: classes.dex */
public final class C5204g0 {
    private final java.lang.Long unixtime;

    public C5204g0(java.lang.Long r1) {
            r0 = this;
            r0.<init>()
            r0.unixtime = r1
            return
    }

    public static /* synthetic */ p255od.C5204g0 copy$default(p255od.C5204g0 r0, java.lang.Long r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.Long r1 = r0.unixtime
        L6:
            od.g0 r0 = r0.copy(r1)
            return r0
    }

    public final java.lang.Long component1() {
            r1 = this;
            java.lang.Long r0 = r1.unixtime
            return r0
    }

    public final p255od.C5204g0 copy(java.lang.Long r2) {
            r1 = this;
            od.g0 r0 = new od.g0
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p255od.C5204g0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.g0 r4 = (p255od.C5204g0) r4
            java.lang.Long r1 = r3.unixtime
            java.lang.Long r4 = r4.unixtime
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final java.lang.Long getUnixtime() {
            r1 = this;
            java.lang.Long r0 = r1.unixtime
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.Long r0 = r1.unixtime
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ResponseDate(unixtime="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Long r1 = r2.unixtime
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
