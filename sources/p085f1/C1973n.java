package p085f1;

/* renamed from: f1.n */
/* loaded from: classes.dex */
public final class C1973n {

    /* renamed from: c */
    public static final p085f1.C1973n f8666c = null;

    /* renamed from: a */
    public final android.os.Bundle f8667a;

    /* renamed from: b */
    public java.util.List<java.lang.String> f8668b;

    static {
            f1.n r0 = new f1.n
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r2 = 0
            r0.<init>(r1, r2)
            p085f1.C1973n.f8666c = r0
            return
    }

    public C1973n(android.os.Bundle r1, java.util.List<java.lang.String> r2) {
            r0 = this;
            r0.<init>()
            r0.f8667a = r1
            r0.f8668b = r2
            return
    }

    /* renamed from: b */
    public static p085f1.C1973n m5022b(android.os.Bundle r2) {
            r0 = 0
            if (r2 == 0) goto L9
            f1.n r1 = new f1.n
            r1.<init>(r2, r0)
            r0 = r1
        L9:
            return r0
    }

    /* renamed from: a */
    public void m5023a() {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.f8668b
            if (r0 != 0) goto L1c
            android.os.Bundle r0 = r2.f8667a
            java.lang.String r1 = "controlCategories"
            java.util.ArrayList r0 = r0.getStringArrayList(r1)
            r2.f8668b = r0
            if (r0 == 0) goto L16
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1c
        L16:
            java.util.List r0 = java.util.Collections.emptyList()
            r2.f8668b = r0
        L1c:
            return
    }

    /* renamed from: c */
    public boolean m5024c() {
            r1 = this;
            r1.m5023a()
            java.util.List<java.lang.String> r0 = r1.f8668b
            boolean r0 = r0.isEmpty()
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p085f1.C1973n
            if (r0 == 0) goto L15
            f1.n r2 = (p085f1.C1973n) r2
            r1.m5023a()
            r2.m5023a()
            java.util.List<java.lang.String> r0 = r1.f8668b
            java.util.List<java.lang.String> r2 = r2.f8668b
            boolean r2 = r0.equals(r2)
            return r2
        L15:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            r1.m5023a()
            java.util.List<java.lang.String> r0 = r1.f8668b
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MediaRouteSelector{ "
            r0.append(r1)
            java.lang.String r1 = "controlCategories="
            r0.append(r1)
            r2.m5023a()
            java.util.List<java.lang.String> r1 = r2.f8668b
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
