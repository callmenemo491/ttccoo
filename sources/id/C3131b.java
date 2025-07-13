package id;

/* renamed from: id.b */
/* loaded from: classes.dex */
public final class C3131b {

    /* renamed from: a */
    public final java.lang.String f12559a;

    /* renamed from: b */
    public final p255od.EnumC5234v0 f12560b;

    public C3131b(java.lang.String r2, p255od.EnumC5234v0 r3) {
            r1 = this;
            java.lang.String r0 = "username"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "type"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f12559a = r2
            r1.f12560b = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof id.C3131b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            id.b r5 = (id.C3131b) r5
            java.lang.String r1 = r4.f12559a
            java.lang.String r3 = r5.f12559a
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            od.v0 r1 = r4.f12560b
            od.v0 r5 = r5.f12560b
            if (r1 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f12559a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            od.v0 r1 = r2.f12560b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Wallet(username="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.f12559a
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            od.v0 r1 = r2.f12560b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
