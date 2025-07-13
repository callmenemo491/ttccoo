package md;

/* renamed from: md.c1 */
/* loaded from: classes.dex */
public final class C4544c1 {
    private final java.lang.String minecraftUUID;

    public C4544c1(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.minecraftUUID = r1
            return
    }

    public static /* synthetic */ md.C4544c1 copy$default(md.C4544c1 r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = r0.minecraftUUID
        L6:
            md.c1 r0 = r0.copy(r1)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.minecraftUUID
            return r0
    }

    public final md.C4544c1 copy(java.lang.String r2) {
            r1 = this;
            md.c1 r0 = new md.c1
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof md.C4544c1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.c1 r4 = (md.C4544c1) r4
            java.lang.String r1 = r3.minecraftUUID
            java.lang.String r4 = r4.minecraftUUID
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final java.lang.String getMinecraftUUID() {
            r1 = this;
            java.lang.String r0 = r1.minecraftUUID
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.minecraftUUID
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "UpliftUUIDPayload(minecraftUUID="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.minecraftUUID
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
