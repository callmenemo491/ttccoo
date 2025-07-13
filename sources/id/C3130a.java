package id;

/* renamed from: id.a */
/* loaded from: classes.dex */
public final class C3130a implements java.io.Serializable {

    /* renamed from: Y */
    public final int f12556Y;

    /* renamed from: Z */
    public final java.lang.String f12557Z;

    /* renamed from: a0 */
    public final java.lang.String f12558a0;

    public C3130a(int r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "address"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.f12556Y = r2
            r1.f12557Z = r3
            r1.f12558a0 = r4
            return
    }

    /* renamed from: a */
    public final java.lang.String m7598a() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.f12558a0
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.String r1 = r3.f12557Z
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof id.C3130a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            id.a r5 = (id.C3130a) r5
            int r1 = r4.f12556Y
            int r3 = r5.f12556Y
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.f12557Z
            java.lang.String r3 = r5.f12557Z
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.f12558a0
            java.lang.String r5 = r5.f12558a0
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.f12556Y
            int r0 = r0 * 31
            java.lang.String r1 = r3.f12557Z
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.f12558a0
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Contact(id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.f12556Y
            r0.append(r1)
            java.lang.String r1 = ", address="
            r0.append(r1)
            java.lang.String r1 = r3.f12557Z
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.f12558a0
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
