package androidx.lifecycle;

/* renamed from: androidx.lifecycle.ReflectiveGenericLifecycleObserver */
/* loaded from: classes.dex */
class C0426x20fbdf84 implements androidx.lifecycle.InterfaceC0468t {

    /* renamed from: Y */
    public final java.lang.Object f2455Y;

    /* renamed from: Z */
    public final androidx.lifecycle.C0440f.a f2456Z;

    public C0426x20fbdf84(java.lang.Object r2) {
            r1 = this;
            r1.<init>()
            r1.f2455Y = r2
            androidx.lifecycle.f r0 = androidx.lifecycle.C0440f.f2489c
            java.lang.Class r2 = r2.getClass()
            androidx.lifecycle.f$a r2 = r0.m1430b(r2)
            r1.f2456Z = r2
            return
    }

    @Override // androidx.lifecycle.InterfaceC0468t
    /* renamed from: d */
    public void mo435d(androidx.lifecycle.InterfaceC0471v r4, androidx.lifecycle.AbstractC0458o.b r5) {
            r3 = this;
            androidx.lifecycle.f$a r0 = r3.f2456Z
            java.lang.Object r1 = r3.f2455Y
            java.util.Map<androidx.lifecycle.o$b, java.util.List<androidx.lifecycle.f$b>> r2 = r0.f2492a
            java.lang.Object r2 = r2.get(r5)
            java.util.List r2 = (java.util.List) r2
            androidx.lifecycle.C0440f.a.m1432a(r2, r4, r5, r1)
            java.util.Map<androidx.lifecycle.o$b, java.util.List<androidx.lifecycle.f$b>> r0 = r0.f2492a
            androidx.lifecycle.o$b r2 = androidx.lifecycle.AbstractC0458o.b.ON_ANY
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            androidx.lifecycle.C0440f.a.m1432a(r0, r4, r5, r1)
            return
    }
}
