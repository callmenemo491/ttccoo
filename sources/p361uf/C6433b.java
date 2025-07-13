package p361uf;

/* renamed from: uf.b */
/* loaded from: classes.dex */
public final class C6433b extends p361uf.AbstractC6432a {

    /* renamed from: a */
    public final java.lang.String f24976a;

    /* renamed from: b */
    public final java.lang.String f24977b;

    /* renamed from: c */
    public java.lang.Integer f24978c;

    public C6433b(java.lang.String r2, java.lang.String r3, java.lang.Integer r4) {
            r1 = this;
            java.lang.String r0 = "label"
            p214m2.C4339q.m9706k(r3, r0)
            r0 = 0
            r1.<init>(r0)
            r1.f24976a = r2
            r1.f24977b = r3
            r1.f24978c = r4
            return
    }

    @Override // p361uf.AbstractC6432a
    /* renamed from: a */
    public java.lang.String mo13036a() {
            r1 = this;
            java.lang.String r0 = r1.f24976a
            return r0
    }

    @Override // p361uf.AbstractC6432a
    /* renamed from: b */
    public java.lang.String mo13037b() {
            r1 = this;
            java.lang.String r0 = r1.f24977b
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p361uf.C6433b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            uf.b r5 = (p361uf.C6433b) r5
            java.lang.String r1 = r4.f24976a
            java.lang.String r3 = r5.f24976a
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f24977b
            java.lang.String r3 = r5.f24977b
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Integer r1 = r4.f24978c
            java.lang.Integer r5 = r5.f24978c
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f24976a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.f24977b
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.Integer r1 = r3.f24978c
            if (r1 != 0) goto L16
            r1 = 0
            goto L1a
        L16:
            int r1 = r1.hashCode()
        L1a:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "AssetDataCollection(key="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.f24976a
            r0.append(r1)
            java.lang.String r1 = ", label="
            r0.append(r1)
            java.lang.String r1 = r2.f24977b
            r0.append(r1)
            java.lang.String r1 = ", collection_verify="
            r0.append(r1)
            java.lang.Integer r1 = r2.f24978c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
