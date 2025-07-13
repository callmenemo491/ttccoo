package p100fg;

/* renamed from: fg.c */
/* loaded from: classes.dex */
public final class C2164c {
    private final p100fg.C2163b data;

    public C2164c(p100fg.C2163b r2) {
            r1 = this;
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.data = r2
            return
    }

    public static /* synthetic */ p100fg.C2164c copy$default(p100fg.C2164c r0, p100fg.C2163b r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            fg.b r1 = r0.data
        L6:
            fg.c r0 = r0.copy(r1)
            return r0
    }

    public final p100fg.C2163b component1() {
            r1 = this;
            fg.b r0 = r1.data
            return r0
    }

    public final p100fg.C2164c copy(p100fg.C2163b r2) {
            r1 = this;
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r2, r0)
            fg.c r0 = new fg.c
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p100fg.C2164c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fg.c r4 = (p100fg.C2164c) r4
            fg.b r1 = r3.data
            fg.b r4 = r4.data
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final p100fg.C2163b getData() {
            r1 = this;
            fg.b r0 = r1.data
            return r0
    }

    public int hashCode() {
            r1 = this;
            fg.b r0 = r1.data
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ReptileResponse(data="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            fg.b r1 = r2.data
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
