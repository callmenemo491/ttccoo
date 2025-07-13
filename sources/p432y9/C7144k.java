package p432y9;

/* renamed from: y9.k */
/* loaded from: classes.dex */
public final class C7144k {

    /* renamed from: a */
    public final java.lang.Class<?> f27588a;

    /* renamed from: b */
    public final int f27589b;

    /* renamed from: c */
    public final int f27590c;

    public C7144k(java.lang.Class<?> r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null dependency anInterface."
            java.util.Objects.requireNonNull(r2, r0)
            r1.f27588a = r2
            r1.f27589b = r3
            r1.f27590c = r4
            return
    }

    /* renamed from: a */
    public boolean m14264a() {
            r2 = this;
            int r0 = r2.f27589b
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p432y9.C7144k
            r1 = 0
            if (r0 == 0) goto L1a
            y9.k r4 = (p432y9.C7144k) r4
            java.lang.Class<?> r0 = r3.f27588a
            java.lang.Class<?> r2 = r4.f27588a
            if (r0 != r2) goto L1a
            int r0 = r3.f27589b
            int r2 = r4.f27589b
            if (r0 != r2) goto L1a
            int r0 = r3.f27590c
            int r4 = r4.f27590c
            if (r0 != r4) goto L1a
            r1 = 1
        L1a:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.Class<?> r0 = r3.f27588a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.f27589b
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r1 = r3.f27590c
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Dependency{anInterface="
            r0.<init>(r1)
            java.lang.Class<?> r1 = r3.f27588a
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            int r1 = r3.f27589b
            r2 = 1
            if (r1 != r2) goto L19
            java.lang.String r1 = "required"
            goto L20
        L19:
            if (r1 != 0) goto L1e
            java.lang.String r1 = "optional"
            goto L20
        L1e:
            java.lang.String r1 = "set"
        L20:
            r0.append(r1)
            java.lang.String r1 = ", injection="
            r0.append(r1)
            int r1 = r3.f27590c
            if (r1 == 0) goto L43
            if (r1 == r2) goto L40
            r2 = 2
            if (r1 != r2) goto L34
            java.lang.String r1 = "deferred"
            goto L45
        L34:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r2 = "Unsupported injection: "
            java.lang.String r1 = android.support.v4.media.C0142a.m254a(r2, r1)
            r0.<init>(r1)
            throw r0
        L40:
            java.lang.String r1 = "provider"
            goto L45
        L43:
            java.lang.String r1 = "direct"
        L45:
            java.lang.String r2 = "}"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
