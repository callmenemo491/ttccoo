package p085f1;

/* renamed from: f1.k */
/* loaded from: classes.dex */
public final class C1970k {

    /* renamed from: a */
    public final java.util.List<p085f1.C1962g> f8664a;

    /* renamed from: b */
    public final boolean f8665b;

    public C1970k(java.util.List<p085f1.C1962g> r1, boolean r2) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L9
            java.util.List r1 = java.util.Collections.emptyList()
        L9:
            r0.f8664a = r1
            r0.f8665b = r2
            return
    }

    /* renamed from: a */
    public static p085f1.C1970k m4963a(android.os.Bundle r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "routes"
            java.util.ArrayList r1 = r6.getParcelableArrayList(r1)
            r2 = 0
            if (r1 == 0) goto L30
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L30
            int r0 = r1.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            r4 = 0
        L1d:
            if (r4 >= r0) goto L2f
            java.lang.Object r5 = r1.get(r4)
            android.os.Bundle r5 = (android.os.Bundle) r5
            f1.g r5 = p085f1.C1962g.m4902b(r5)
            r3.add(r5)
            int r4 = r4 + 1
            goto L1d
        L2f:
            r0 = r3
        L30:
            java.lang.String r1 = "supportsDynamicGroupRoute"
            boolean r6 = r6.getBoolean(r1, r2)
            f1.k r1 = new f1.k
            r1.<init>(r0, r6)
            return r1
    }

    /* renamed from: b */
    public boolean m4964b() {
            r4 = this;
            java.util.List<f1.g> r0 = r4.f8664a
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L1f
            java.util.List<f1.g> r3 = r4.f8664a
            java.lang.Object r3 = r3.get(r2)
            f1.g r3 = (p085f1.C1962g) r3
            if (r3 == 0) goto L1e
            boolean r3 = r3.m4919r()
            if (r3 != 0) goto L1b
            goto L1e
        L1b:
            int r2 = r2 + 1
            goto L8
        L1e:
            return r1
        L1f:
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "MediaRouteProviderDescriptor{ "
            java.lang.String r1 = "routes="
            java.lang.StringBuilder r0 = android.support.v4.media.C0143b.m255a(r0, r1)
            java.util.List<f1.g> r1 = r2.f8664a
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ", isValid="
            r0.append(r1)
            boolean r1 = r2.m4964b()
            r0.append(r1)
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
