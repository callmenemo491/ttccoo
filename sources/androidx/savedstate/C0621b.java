package androidx.savedstate;

/* renamed from: androidx.savedstate.b */
/* loaded from: classes.dex */
public final class C0621b {

    /* renamed from: a */
    public final androidx.savedstate.InterfaceC0622c f3683a;

    /* renamed from: b */
    public final androidx.savedstate.C0620a f3684b;

    public C0621b(androidx.savedstate.InterfaceC0622c r1) {
            r0 = this;
            r0.<init>()
            r0.f3683a = r1
            androidx.savedstate.a r1 = new androidx.savedstate.a
            r1.<init>()
            r0.f3684b = r1
            return
    }

    /* renamed from: a */
    public void m2156a(android.os.Bundle r4) {
            r3 = this;
            androidx.savedstate.c r0 = r3.f3683a
            androidx.lifecycle.o r0 = r0.mo428b()
            r1 = r0
            androidx.lifecycle.w r1 = (androidx.lifecycle.C0472w) r1
            androidx.lifecycle.o$c r1 = r1.f2564c
            androidx.lifecycle.o$c r2 = androidx.lifecycle.AbstractC0458o.c.f2547Z
            if (r1 != r2) goto L3d
            androidx.savedstate.Recreator r1 = new androidx.savedstate.Recreator
            androidx.savedstate.c r2 = r3.f3683a
            r1.<init>(r2)
            r0.mo1454a(r1)
            androidx.savedstate.a r1 = r3.f3684b
            boolean r2 = r1.f3680c
            if (r2 != 0) goto L35
            if (r4 == 0) goto L29
            java.lang.String r2 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            android.os.Bundle r4 = r4.getBundle(r2)
            r1.f3679b = r4
        L29:
            androidx.savedstate.SavedStateRegistry$1 r4 = new androidx.savedstate.SavedStateRegistry$1
            r4.<init>(r1)
            r0.mo1454a(r4)
            r4 = 1
            r1.f3680c = r4
            return
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "SavedStateRegistry was already restored."
            r4.<init>(r0)
            throw r4
        L3d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Restarter must be created only during owner's initialization stage"
            r4.<init>(r0)
            throw r4
    }

    /* renamed from: b */
    public void m2157b(android.os.Bundle r5) {
            r4 = this;
            androidx.savedstate.a r0 = r4.f3684b
            java.util.Objects.requireNonNull(r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            android.os.Bundle r2 = r0.f3679b
            if (r2 == 0) goto L11
            r1.putAll(r2)
        L11:
            n.b<java.lang.String, androidx.savedstate.a$b> r0 = r0.f3678a
            n.b$d r0 = r0.m10457e()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            androidx.savedstate.a$b r2 = (androidx.savedstate.C0620a.b) r2
            android.os.Bundle r2 = r2.mo1350a()
            r1.putBundle(r3, r2)
            goto L17
        L37:
            java.lang.String r0 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            r5.putBundle(r0, r1)
            return
    }
}
