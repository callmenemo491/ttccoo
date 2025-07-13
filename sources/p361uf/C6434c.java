package p361uf;

/* renamed from: uf.c */
/* loaded from: classes.dex */
public final class C6434c extends p361uf.AbstractC6432a {

    /* renamed from: a */
    public final java.lang.String f24979a;

    /* renamed from: b */
    public final java.lang.String f24980b;

    /* renamed from: c */
    public final java.lang.String f24981c;

    public C6434c(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "key"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "label"
            p214m2.C4339q.m9706k(r3, r0)
            r0 = 0
            r1.<init>(r0)
            r1.f24979a = r2
            r1.f24980b = r3
            r1.f24981c = r4
            return
    }

    @Override // p361uf.AbstractC6432a
    /* renamed from: a */
    public java.lang.String mo13036a() {
            r1 = this;
            java.lang.String r0 = r1.f24979a
            return r0
    }

    @Override // p361uf.AbstractC6432a
    /* renamed from: b */
    public java.lang.String mo13037b() {
            r1 = this;
            java.lang.String r0 = r1.f24980b
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p361uf.C6434c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            uf.c r5 = (p361uf.C6434c) r5
            java.lang.String r1 = r4.f24979a
            java.lang.String r3 = r5.f24979a
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f24980b
            java.lang.String r3 = r5.f24980b
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f24981c
            java.lang.String r5 = r5.f24981c
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f24979a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.f24980b
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.f24981c
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
            r3 = this;
            java.lang.String r0 = "AssetDataNormal(key="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f24979a
            r0.append(r1)
            java.lang.String r1 = ", label="
            r0.append(r1)
            java.lang.String r1 = r3.f24980b
            r0.append(r1)
            java.lang.String r1 = ", link="
            r0.append(r1)
            java.lang.String r1 = r3.f24981c
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
