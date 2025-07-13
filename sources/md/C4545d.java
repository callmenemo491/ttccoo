package md;

/* renamed from: md.d */
/* loaded from: classes.dex */
public final class C4545d {
    private final java.lang.String color;
    private final java.lang.String title;

    public C4545d(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "color"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.title = r2
            r1.color = r3
            return
    }

    public static /* synthetic */ md.C4545d copy$default(md.C4545d r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.title
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = r0.color
        Lc:
            md.d r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.color
            return r0
    }

    public final md.C4545d copy(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "color"
            p214m2.C4339q.m9706k(r3, r0)
            md.d r0 = new md.d
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof md.C4545d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.d r5 = (md.C4545d) r5
            java.lang.String r1 = r4.title
            java.lang.String r3 = r5.title
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.color
            java.lang.String r5 = r5.color
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.lang.String getColor() {
            r1 = this;
            java.lang.String r0 = r1.color
            return r0
    }

    public final java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.title
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 31
            java.lang.String r1 = r2.color
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "AlertRemoteConfig(title="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.title
            r0.append(r1)
            java.lang.String r1 = ", color="
            r0.append(r1)
            java.lang.String r1 = r3.color
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
