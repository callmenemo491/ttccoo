package p109g6;

/* renamed from: g6.a */
/* loaded from: classes.dex */
public final class C2292a {
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof p109g6.C2292a
            if (r1 != 0) goto La
            r3 = 0
            return r3
        La:
            g6.a r3 = (p109g6.C2292a) r3
            java.util.Objects.requireNonNull(r3)
            return r0
    }

    public final int hashCode() {
            r1 = this;
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r0.hashCode()
            return r0
    }
}
