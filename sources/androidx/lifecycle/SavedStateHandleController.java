package androidx.lifecycle;

/* loaded from: classes.dex */
final class SavedStateHandleController implements androidx.lifecycle.InterfaceC0468t {

    /* renamed from: Y */
    public final java.lang.String f2457Y;

    /* renamed from: Z */
    public boolean f2458Z;

    /* renamed from: a0 */
    public final androidx.lifecycle.C0453l0 f2459a0;


    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    public static final class C0428a implements androidx.savedstate.C0620a.a {
        public C0428a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.savedstate.C0620a.a
        /* renamed from: a */
        public void mo1424a(androidx.savedstate.InterfaceC0622c r6) {
                r5 = this;
                boolean r0 = r6 instanceof androidx.lifecycle.InterfaceC0469t0
                if (r0 == 0) goto L54
                r0 = r6
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                androidx.savedstate.a r1 = r6.mo430f()
                java.util.Objects.requireNonNull(r0)
                java.util.HashSet r2 = new java.util.HashSet
                java.util.HashMap<java.lang.String, androidx.lifecycle.n0> r3 = r0.f2562a
                java.util.Set r3 = r3.keySet()
                r2.<init>(r3)
                java.util.Iterator r2 = r2.iterator()
            L21:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L3d
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                java.util.HashMap<java.lang.String, androidx.lifecycle.n0> r4 = r0.f2562a
                java.lang.Object r3 = r4.get(r3)
                androidx.lifecycle.n0 r3 = (androidx.lifecycle.AbstractC0457n0) r3
                androidx.lifecycle.o r4 = r6.mo428b()
                androidx.lifecycle.SavedStateHandleController.m1420h(r3, r1, r4)
                goto L21
            L3d:
                java.util.HashSet r6 = new java.util.HashSet
                java.util.HashMap<java.lang.String, androidx.lifecycle.n0> r0 = r0.f2562a
                java.util.Set r0 = r0.keySet()
                r6.<init>(r0)
                boolean r6 = r6.isEmpty()
                if (r6 != 0) goto L53
                java.lang.Class<androidx.lifecycle.SavedStateHandleController$a> r6 = androidx.lifecycle.SavedStateHandleController.C0428a.class
                r1.m2155c(r6)
            L53:
                return
            L54:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner"
                r6.<init>(r0)
                throw r6
        }
    }

    public SavedStateHandleController(java.lang.String r2, androidx.lifecycle.C0453l0 r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2458Z = r0
            r1.f2457Y = r2
            r1.f2459a0 = r3
            return
    }

    /* renamed from: h */
    public static void m1420h(androidx.lifecycle.AbstractC0457n0 r1, androidx.savedstate.C0620a r2, androidx.lifecycle.AbstractC0458o r3) {
            java.lang.String r0 = "androidx.lifecycle.savedstate.vm.tag"
            java.lang.Object r1 = r1.m1452a(r0)
            androidx.lifecycle.SavedStateHandleController r1 = (androidx.lifecycle.SavedStateHandleController) r1
            if (r1 == 0) goto L14
            boolean r0 = r1.f2458Z
            if (r0 != 0) goto L14
            r1.m1423i(r2, r3)
            m1422k(r2, r3)
        L14:
            return
    }

    /* renamed from: j */
    public static androidx.lifecycle.SavedStateHandleController m1421j(androidx.savedstate.C0620a r5, androidx.lifecycle.AbstractC0458o r6, java.lang.String r7, android.os.Bundle r8) {
            android.os.Bundle r0 = r5.m2153a(r7)
            java.lang.Class[] r1 = androidx.lifecycle.C0453l0.f2533e
            if (r0 != 0) goto L10
            if (r8 != 0) goto L10
            androidx.lifecycle.l0 r8 = new androidx.lifecycle.l0
            r8.<init>()
            goto L71
        L10:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            if (r8 == 0) goto L33
            java.util.Set r2 = r8.keySet()
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r8.get(r3)
            r1.put(r3, r4)
            goto L1f
        L33:
            if (r0 != 0) goto L3b
            androidx.lifecycle.l0 r8 = new androidx.lifecycle.l0
            r8.<init>(r1)
            goto L71
        L3b:
            java.lang.String r8 = "keys"
            java.util.ArrayList r8 = r0.getParcelableArrayList(r8)
            java.lang.String r2 = "values"
            java.util.ArrayList r0 = r0.getParcelableArrayList(r2)
            if (r8 == 0) goto L7d
            if (r0 == 0) goto L7d
            int r2 = r8.size()
            int r3 = r0.size()
            if (r2 != r3) goto L7d
            r2 = 0
        L56:
            int r3 = r8.size()
            if (r2 >= r3) goto L6c
            java.lang.Object r3 = r8.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.get(r2)
            r1.put(r3, r4)
            int r2 = r2 + 1
            goto L56
        L6c:
            androidx.lifecycle.l0 r8 = new androidx.lifecycle.l0
            r8.<init>(r1)
        L71:
            androidx.lifecycle.SavedStateHandleController r0 = new androidx.lifecycle.SavedStateHandleController
            r0.<init>(r7, r8)
            r0.m1423i(r5, r6)
            m1422k(r5, r6)
            return r0
        L7d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Invalid bundle passed as restored state"
            r5.<init>(r6)
            throw r5
    }

    /* renamed from: k */
    public static void m1422k(androidx.savedstate.C0620a r2, androidx.lifecycle.AbstractC0458o r3) {
            r0 = r3
            androidx.lifecycle.w r0 = (androidx.lifecycle.C0472w) r0
            androidx.lifecycle.o$c r0 = r0.f2564c
            androidx.lifecycle.o$c r1 = androidx.lifecycle.AbstractC0458o.c.f2547Z
            if (r0 == r1) goto L20
            androidx.lifecycle.o$c r1 = androidx.lifecycle.AbstractC0458o.c.f2549b0
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L17
            goto L20
        L17:
            androidx.lifecycle.SavedStateHandleController$1 r0 = new androidx.lifecycle.SavedStateHandleController$1
            r0.<init>(r3, r2)
            r3.mo1454a(r0)
            goto L25
        L20:
            java.lang.Class<androidx.lifecycle.SavedStateHandleController$a> r3 = androidx.lifecycle.SavedStateHandleController.C0428a.class
            r2.m2155c(r3)
        L25:
            return
    }

    @Override // androidx.lifecycle.InterfaceC0468t
    /* renamed from: d */
    public void mo435d(androidx.lifecycle.InterfaceC0471v r2, androidx.lifecycle.AbstractC0458o.b r3) {
            r1 = this;
            androidx.lifecycle.o$b r0 = androidx.lifecycle.AbstractC0458o.b.ON_DESTROY
            if (r3 != r0) goto L17
            r3 = 0
            r1.f2458Z = r3
            androidx.lifecycle.o r2 = r2.mo428b()
            androidx.lifecycle.w r2 = (androidx.lifecycle.C0472w) r2
            java.lang.String r3 = "removeObserver"
            r2.m1461d(r3)
            n.a<androidx.lifecycle.u, androidx.lifecycle.w$a> r2 = r2.f2563b
            r2.mo10456l(r1)
        L17:
            return
    }

    /* renamed from: i */
    public void m1423i(androidx.savedstate.C0620a r2, androidx.lifecycle.AbstractC0458o r3) {
            r1 = this;
            boolean r0 = r1.f2458Z
            if (r0 != 0) goto L14
            r0 = 1
            r1.f2458Z = r0
            r3.mo1454a(r1)
            java.lang.String r3 = r1.f2457Y
            androidx.lifecycle.l0 r0 = r1.f2459a0
            androidx.savedstate.a$b r0 = r0.f2537d
            r2.m2154b(r3, r0)
            return
        L14:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Already attached to lifecycleOwner"
            r2.<init>(r3)
            throw r2
    }
}
