package p295qg;

/* renamed from: qg.f */
/* loaded from: classes.dex */
public final class C5652f {
    private final java.lang.String key;
    private final int value;

    public C5652f(java.lang.String r2, int r3) {
            r1 = this;
            java.lang.String r0 = "key"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.key = r2
            r1.value = r3
            return
    }

    public static /* synthetic */ p295qg.C5652f copy$default(p295qg.C5652f r0, java.lang.String r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.key
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            int r2 = r0.value
        Lc:
            qg.f r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.key
            return r0
    }

    public final int component2() {
            r1 = this;
            int r0 = r1.value
            return r0
    }

    public final p295qg.C5652f copy(java.lang.String r2, int r3) {
            r1 = this;
            java.lang.String r0 = "key"
            p214m2.C4339q.m9706k(r2, r0)
            qg.f r0 = new qg.f
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p295qg.C5652f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qg.f r5 = (p295qg.C5652f) r5
            java.lang.String r1 = r4.key
            java.lang.String r3 = r5.key
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.value
            int r5 = r5.value
            if (r1 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.key
            return r0
    }

    public final int getValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.key
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.value
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "VirtualDreamInventory(key="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.key
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            int r1 = r3.value
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
