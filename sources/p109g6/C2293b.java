package p109g6;

/* renamed from: g6.b */
/* loaded from: classes.dex */
public final class C2293b {

    /* renamed from: a */
    public int f10514a;

    public C2293b() {
            r0 = this;
            r0.<init>()
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p109g6.C2293b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            g6.b r4 = (p109g6.C2293b) r4
            java.util.Objects.requireNonNull(r4)
            int r1 = r3.f10514a
            int r4 = r4.f10514a
            if (r1 != r4) goto L16
            return r0
        L16:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0[r1] = r2
            int r1 = r4.f10514a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 1
            r0[r3] = r1
            r1 = 2
            r0[r1] = r2
            r1 = 3
            r0[r1] = r2
            r1 = 4
            r0[r1] = r2
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2 = 5
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
