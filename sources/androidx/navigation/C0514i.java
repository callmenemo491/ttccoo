package androidx.navigation;

/* renamed from: androidx.navigation.i */
/* loaded from: classes.dex */
public final class C0514i implements androidx.lifecycle.InterfaceC0471v, androidx.lifecycle.InterfaceC0469t0, androidx.savedstate.InterfaceC0622c {

    /* renamed from: Y */
    public final androidx.navigation.C0518m f2943Y;

    /* renamed from: Z */
    public android.os.Bundle f2944Z;

    /* renamed from: a0 */
    public final androidx.lifecycle.C0472w f2945a0;

    /* renamed from: b0 */
    public final androidx.savedstate.C0621b f2946b0;

    /* renamed from: c0 */
    public final java.util.UUID f2947c0;

    /* renamed from: d0 */
    public androidx.lifecycle.AbstractC0458o.c f2948d0;

    /* renamed from: e0 */
    public androidx.lifecycle.AbstractC0458o.c f2949e0;

    /* renamed from: f0 */
    public androidx.navigation.C0516k f2950f0;

    /* renamed from: androidx.navigation.i$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2951a = null;

        static {
                androidx.lifecycle.o$b[] r0 = androidx.lifecycle.AbstractC0458o.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.navigation.C0514i.a.f2951a = r0
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_CREATE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.navigation.C0514i.a.f2951a     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.navigation.C0514i.a.f2951a     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_START     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.navigation.C0514i.a.f2951a     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_PAUSE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.navigation.C0514i.a.f2951a     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.navigation.C0514i.a.f2951a     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_DESTROY     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.navigation.C0514i.a.f2951a     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_ANY     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public C0514i(android.content.Context r9, androidx.navigation.C0518m r10, android.os.Bundle r11, androidx.lifecycle.InterfaceC0471v r12, androidx.navigation.C0516k r13) {
            r8 = this;
            java.util.UUID r6 = java.util.UUID.randomUUID()
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public C0514i(android.content.Context r2, androidx.navigation.C0518m r3, android.os.Bundle r4, androidx.lifecycle.InterfaceC0471v r5, androidx.navigation.C0516k r6, java.util.UUID r7, android.os.Bundle r8) {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.w r2 = new androidx.lifecycle.w
            r2.<init>(r1)
            r1.f2945a0 = r2
            androidx.savedstate.b r2 = new androidx.savedstate.b
            r2.<init>(r1)
            r1.f2946b0 = r2
            androidx.lifecycle.o$c r0 = androidx.lifecycle.AbstractC0458o.c.f2548a0
            r1.f2948d0 = r0
            androidx.lifecycle.o$c r0 = androidx.lifecycle.AbstractC0458o.c.f2550c0
            r1.f2949e0 = r0
            r1.f2947c0 = r7
            r1.f2943Y = r3
            r1.f2944Z = r4
            r1.f2950f0 = r6
            r2.m2156a(r8)
            if (r5 == 0) goto L30
            androidx.lifecycle.o r2 = r5.mo428b()
            androidx.lifecycle.w r2 = (androidx.lifecycle.C0472w) r2
            androidx.lifecycle.o$c r2 = r2.f2564c
            r1.f2948d0 = r2
        L30:
            return
    }

    /* renamed from: a */
    public void m1586a() {
            r2 = this;
            androidx.lifecycle.o$c r0 = r2.f2948d0
            int r0 = r0.ordinal()
            androidx.lifecycle.o$c r1 = r2.f2949e0
            int r1 = r1.ordinal()
            if (r0 >= r1) goto L13
            androidx.lifecycle.w r0 = r2.f2945a0
            androidx.lifecycle.o$c r1 = r2.f2948d0
            goto L17
        L13:
            androidx.lifecycle.w r0 = r2.f2945a0
            androidx.lifecycle.o$c r1 = r2.f2949e0
        L17:
            r0.m1465i(r1)
            return
    }

    @Override // androidx.lifecycle.InterfaceC0471v
    /* renamed from: b */
    public androidx.lifecycle.AbstractC0458o mo428b() {
            r1 = this;
            androidx.lifecycle.w r0 = r1.f2945a0
            return r0
    }

    @Override // androidx.savedstate.InterfaceC0622c
    /* renamed from: f */
    public androidx.savedstate.C0620a mo430f() {
            r1 = this;
            androidx.savedstate.b r0 = r1.f2946b0
            androidx.savedstate.a r0 = r0.f3684b
            return r0
    }

    @Override // androidx.lifecycle.InterfaceC0469t0
    /* renamed from: o */
    public androidx.lifecycle.C0467s0 mo432o() {
            r3 = this;
            androidx.navigation.k r0 = r3.f2950f0
            if (r0 == 0) goto L1b
            java.util.UUID r1 = r3.f2947c0
            java.util.HashMap<java.util.UUID, androidx.lifecycle.s0> r2 = r0.f2957c
            java.lang.Object r2 = r2.get(r1)
            androidx.lifecycle.s0 r2 = (androidx.lifecycle.C0467s0) r2
            if (r2 != 0) goto L1a
            androidx.lifecycle.s0 r2 = new androidx.lifecycle.s0
            r2.<init>()
            java.util.HashMap<java.util.UUID, androidx.lifecycle.s0> r0 = r0.f2957c
            r0.put(r1, r2)
        L1a:
            return r2
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph."
            r0.<init>(r1)
            throw r0
    }
}
