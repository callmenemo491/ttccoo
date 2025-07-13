package p170jc;

/* renamed from: jc.b */
/* loaded from: classes.dex */
public final class C3485b {

    /* renamed from: a */
    public final java.util.List<p170jc.C3484a> f14976a;

    /* renamed from: b */
    public final int f14977b;

    /* renamed from: c */
    public final boolean f14978c;

    public C3485b(java.util.List<p170jc.C3484a> r2, int r3, boolean r4) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.f14976a = r0
            r1.f14977b = r3
            r1.f14978c = r4
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p170jc.C3485b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            jc.b r4 = (p170jc.C3485b) r4
            java.util.List<jc.a> r0 = r3.f14976a
            java.util.List<jc.a> r2 = r4.f14976a
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1a
            boolean r0 = r3.f14978c
            boolean r4 = r4.f14978c
            if (r0 != r4) goto L1a
            r4 = 1
            return r4
        L1a:
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.util.List<jc.a> r0 = r2.f14976a
            int r0 = r0.hashCode()
            boolean r1 = r2.f14978c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{ "
            r0.<init>(r1)
            java.util.List<jc.a> r1 = r2.f14976a
            r0.append(r1)
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
