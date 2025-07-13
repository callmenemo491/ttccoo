package md;

/* renamed from: md.y0 */
/* loaded from: classes.dex */
public final class C4590y0 {
    private final md.C4588x0 payload;

    public C4590y0(md.C4588x0 r1) {
            r0 = this;
            r0.<init>()
            r0.payload = r1
            return
    }

    public static /* synthetic */ md.C4590y0 copy$default(md.C4590y0 r0, md.C4588x0 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            md.x0 r1 = r0.payload
        L6:
            md.y0 r0 = r0.copy(r1)
            return r0
    }

    public final md.C4588x0 component1() {
            r1 = this;
            md.x0 r0 = r1.payload
            return r0
    }

    public final md.C4590y0 copy(md.C4588x0 r2) {
            r1 = this;
            md.y0 r0 = new md.y0
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof md.C4590y0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.y0 r4 = (md.C4590y0) r4
            md.x0 r1 = r3.payload
            md.x0 r4 = r4.payload
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final md.C4588x0 getPayload() {
            r1 = this;
            md.x0 r0 = r1.payload
            return r0
    }

    public int hashCode() {
            r1 = this;
            md.x0 r0 = r1.payload
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
            java.lang.String r0 = "UpliftAuthResponse(payload="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            md.x0 r1 = r2.payload
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
