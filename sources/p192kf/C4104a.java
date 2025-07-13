package p192kf;

/* renamed from: kf.a */
/* loaded from: classes.dex */
public final class C4104a {
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p192kf.C4104a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kf.a r4 = (p192kf.C4104a) r4
            java.util.Objects.requireNonNull(r4)
            r4 = 0
            boolean r1 = p214m2.C4339q.m9702c(r4, r4)
            if (r1 != 0) goto L17
            return r2
        L17:
            boolean r1 = p214m2.C4339q.m9702c(r4, r4)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            boolean r4 = p214m2.C4339q.m9702c(r4, r4)
            if (r4 != 0) goto L25
            return r2
        L25:
            return r0
    }

    public int hashCode() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "BuildingNotStaked(assets_id=null, name=null, imageURL=null)"
            return r0
    }
}
