package p085f1;

/* renamed from: f1.h */
/* loaded from: classes.dex */
public final class C1964h {

    /* renamed from: a */
    public final android.os.Bundle f8600a;

    /* renamed from: b */
    public p085f1.C1973n f8601b;

    public C1964h(p085f1.C1973n r3, boolean r4) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L1b
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2.f8600a = r0
            r2.f8601b = r3
            android.os.Bundle r3 = r3.f8667a
            java.lang.String r1 = "selector"
            r0.putBundle(r1, r3)
            java.lang.String r3 = "activeScan"
            r0.putBoolean(r3, r4)
            return
        L1b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "selector must not be null"
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: a */
    public final void m4928a() {
            r2 = this;
            f1.n r0 = r2.f8601b
            if (r0 != 0) goto L18
            android.os.Bundle r0 = r2.f8600a
            java.lang.String r1 = "selector"
            android.os.Bundle r0 = r0.getBundle(r1)
            f1.n r0 = p085f1.C1973n.m5022b(r0)
            r2.f8601b = r0
            if (r0 != 0) goto L18
            f1.n r0 = p085f1.C1973n.f8666c
            r2.f8601b = r0
        L18:
            return
    }

    /* renamed from: b */
    public boolean m4929b() {
            r2 = this;
            android.os.Bundle r0 = r2.f8600a
            java.lang.String r1 = "activeScan"
            boolean r0 = r0.getBoolean(r1)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p085f1.C1964h
            r1 = 0
            if (r0 == 0) goto L22
            f1.h r4 = (p085f1.C1964h) r4
            r3.m4928a()
            f1.n r0 = r3.f8601b
            r4.m4928a()
            f1.n r2 = r4.f8601b
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L22
            boolean r0 = r3.m4929b()
            boolean r4 = r4.m4929b()
            if (r0 != r4) goto L22
            r1 = 1
        L22:
            return r1
    }

    public int hashCode() {
            r2 = this;
            r2.m4928a()
            f1.n r0 = r2.f8601b
            int r0 = r0.hashCode()
            boolean r1 = r2.m4929b()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DiscoveryRequest{ selector="
            r0.append(r1)
            r3.m4928a()
            f1.n r1 = r3.f8601b
            r0.append(r1)
            java.lang.String r1 = ", activeScan="
            r0.append(r1)
            boolean r1 = r3.m4929b()
            r0.append(r1)
            java.lang.String r1 = ", isValid="
            r0.append(r1)
            r3.m4928a()
            f1.n r1 = r3.f8601b
            r1.m5023a()
            java.util.List<java.lang.String> r1 = r1.f8668b
            r2 = 0
            boolean r1 = r1.contains(r2)
            r1 = r1 ^ 1
            r0.append(r1)
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
