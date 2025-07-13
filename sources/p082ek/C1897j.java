package p082ek;

/* renamed from: ek.j */
/* loaded from: classes.dex */
public final class C1897j {

    /* renamed from: a */
    public final java.lang.reflect.Method f8180a;

    /* renamed from: b */
    public final java.util.List<?> f8181b;

    public C1897j(java.lang.reflect.Method r1, java.util.List<?> r2) {
            r0 = this;
            r0.<init>()
            r0.f8180a = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            r0.f8181b = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.reflect.Method r1 = r3.f8180a
            java.lang.Class r1 = r1.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r2 = 0
            r0[r2] = r1
            java.lang.reflect.Method r1 = r3.f8180a
            java.lang.String r1 = r1.getName()
            r2 = 1
            r0[r2] = r1
            java.util.List<?> r1 = r3.f8181b
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "%s.%s() %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
