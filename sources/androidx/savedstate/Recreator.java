package androidx.savedstate;

@android.annotation.SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
final class Recreator implements androidx.lifecycle.InterfaceC0468t {

    /* renamed from: Y */
    public final androidx.savedstate.InterfaceC0622c f3675Y;

    /* renamed from: androidx.savedstate.Recreator$a */
    public static final class C0619a implements androidx.savedstate.C0620a.b {

        /* renamed from: a */
        public final java.util.Set<java.lang.String> f3676a;

        public C0619a(androidx.savedstate.C0620a r2) {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.f3676a = r0
                java.lang.String r0 = "androidx.savedstate.Restarter"
                r2.m2154b(r0, r1)
                return
        }

        @Override // androidx.savedstate.C0620a.b
        /* renamed from: a */
        public android.os.Bundle mo1350a() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.Set<java.lang.String> r2 = r3.f3676a
                r1.<init>(r2)
                java.lang.String r2 = "classes_to_restore"
                r0.putStringArrayList(r2, r1)
                return r0
        }
    }

    public Recreator(androidx.savedstate.InterfaceC0622c r1) {
            r0 = this;
            r0.<init>()
            r0.f3675Y = r1
            return
    }

    @Override // androidx.lifecycle.InterfaceC0468t
    /* renamed from: d */
    public void mo435d(androidx.lifecycle.InterfaceC0471v r4, androidx.lifecycle.AbstractC0458o.b r5) {
            r3 = this;
            androidx.lifecycle.o$b r0 = androidx.lifecycle.AbstractC0458o.b.ON_CREATE
            if (r5 != r0) goto La6
            androidx.lifecycle.o r4 = r4.mo428b()
            androidx.lifecycle.w r4 = (androidx.lifecycle.C0472w) r4
            java.lang.String r5 = "removeObserver"
            r4.m1461d(r5)
            n.a<androidx.lifecycle.u, androidx.lifecycle.w$a> r4 = r4.f2563b
            r4.mo10456l(r3)
            androidx.savedstate.c r4 = r3.f3675Y
            androidx.savedstate.a r4 = r4.mo430f()
            java.lang.String r5 = "androidx.savedstate.Restarter"
            android.os.Bundle r4 = r4.m2153a(r5)
            if (r4 != 0) goto L23
            return
        L23:
            java.lang.String r5 = "classes_to_restore"
            java.util.ArrayList r4 = r4.getStringArrayList(r5)
            if (r4 == 0) goto L9e
            java.util.Iterator r4 = r4.iterator()
        L2f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9d
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Class<androidx.savedstate.Recreator> r0 = androidx.savedstate.Recreator.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L8e
            r1 = 0
            java.lang.Class r0 = java.lang.Class.forName(r5, r1, r0)     // Catch: java.lang.ClassNotFoundException -> L8e
            java.lang.Class<androidx.savedstate.a$a> r2 = androidx.savedstate.C0620a.a.class
            java.lang.Class r0 = r0.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L8e
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L71
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L71
            r2 = 1
            r0.setAccessible(r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L64
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L64
            androidx.savedstate.a$a r0 = (androidx.savedstate.C0620a.a) r0     // Catch: java.lang.Exception -> L64
            androidx.savedstate.c r5 = r3.f3675Y
            r0.mo1424a(r5)
            goto L2f
        L64:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Failed to instantiate "
            java.lang.String r5 = p064e.C1493g.m4049a(r1, r5)
            r0.<init>(r5, r4)
            throw r0
        L71:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r1 = "Class"
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " must have default constructor in order to be automatically recreated"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0, r4)
            throw r5
        L8e:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Class "
            java.lang.String r2 = " wasn't found"
            java.lang.String r5 = android.support.v4.media.C0145d.m257a(r1, r5, r2)
            r0.<init>(r5, r4)
            throw r0
        L9d:
            return
        L9e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""
            r4.<init>(r5)
            throw r4
        La6:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = "Next event must be ON_CREATE"
            r4.<init>(r5)
            throw r4
    }
}
