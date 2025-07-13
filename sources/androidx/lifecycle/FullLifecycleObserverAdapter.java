package androidx.lifecycle;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements androidx.lifecycle.InterfaceC0468t {

    /* renamed from: Y */
    public final androidx.lifecycle.InterfaceC0454m f2426Y;

    /* renamed from: Z */
    public final androidx.lifecycle.InterfaceC0468t f2427Z;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    public static /* synthetic */ class C0422a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2428a = null;

        static {
                androidx.lifecycle.o$b[] r0 = androidx.lifecycle.AbstractC0458o.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.FullLifecycleObserverAdapter.C0422a.f2428a = r0
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_CREATE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0422a.f2428a     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_START     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0422a.f2428a     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0422a.f2428a     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_PAUSE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0422a.f2428a     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0422a.f2428a     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_DESTROY     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0422a.f2428a     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_ANY     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public FullLifecycleObserverAdapter(androidx.lifecycle.InterfaceC0454m r1, androidx.lifecycle.InterfaceC0468t r2) {
            r0 = this;
            r0.<init>()
            r0.f2426Y = r1
            r0.f2427Z = r2
            return
    }

    @Override // androidx.lifecycle.InterfaceC0468t
    /* renamed from: d */
    public void mo435d(androidx.lifecycle.InterfaceC0471v r3, androidx.lifecycle.AbstractC0458o.b r4) {
            r2 = this;
            int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.C0422a.f2428a
            int r1 = r4.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L32;
                case 2: goto L2c;
                case 3: goto L26;
                case 4: goto L20;
                case 5: goto L1a;
                case 6: goto L14;
                case 7: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L37
        Lc:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "ON_ANY must not been send by anybody"
            r3.<init>(r4)
            throw r3
        L14:
            androidx.lifecycle.m r0 = r2.f2426Y
            r0.m1445b(r3)
            goto L37
        L1a:
            androidx.lifecycle.m r0 = r2.f2426Y
            r0.m1449g(r3)
            goto L37
        L20:
            androidx.lifecycle.m r0 = r2.f2426Y
            r0.m1447e(r3)
            goto L37
        L26:
            androidx.lifecycle.m r0 = r2.f2426Y
            r0.m1444a(r3)
            goto L37
        L2c:
            androidx.lifecycle.m r0 = r2.f2426Y
            r0.m1448f(r3)
            goto L37
        L32:
            androidx.lifecycle.m r0 = r2.f2426Y
            r0.m1446c(r3)
        L37:
            androidx.lifecycle.t r0 = r2.f2427Z
            if (r0 == 0) goto L3e
            r0.mo435d(r3, r4)
        L3e:
            return
    }
}
