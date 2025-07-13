package p239nh;

/* renamed from: nh.k */
/* loaded from: classes.dex */
public final class C4831k implements p239nh.InterfaceC4823c {

    /* renamed from: a */
    public final java.lang.Class<?> f19228a;

    public C4831k(java.lang.Class<?> r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "jClass"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "moduleName"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f19228a = r2
            return
    }

    @Override // p239nh.InterfaceC4823c
    /* renamed from: a */
    public java.lang.Class<?> mo10850a() {
            r1 = this;
            java.lang.Class<?> r0 = r1.f19228a
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p239nh.C4831k
            if (r0 == 0) goto L12
            java.lang.Class<?> r0 = r1.f19228a
            nh.k r2 = (p239nh.C4831k) r2
            java.lang.Class<?> r2 = r2.f19228a
            boolean r2 = p214m2.C4339q.m9702c(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.Class<?> r0 = r1.f19228a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<?> r1 = r2.f19228a
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
