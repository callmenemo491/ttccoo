package androidx.lifecycle;

/* renamed from: androidx.lifecycle.i0 */
/* loaded from: classes.dex */
public class C0447i0 implements androidx.lifecycle.InterfaceC0471v {

    /* renamed from: g0 */
    public static final androidx.lifecycle.C0447i0 f2512g0 = null;

    /* renamed from: Y */
    public int f2513Y;

    /* renamed from: Z */
    public int f2514Z;

    /* renamed from: a0 */
    public boolean f2515a0;

    /* renamed from: b0 */
    public boolean f2516b0;

    /* renamed from: c0 */
    public android.os.Handler f2517c0;

    /* renamed from: d0 */
    public final androidx.lifecycle.C0472w f2518d0;

    /* renamed from: e0 */
    public java.lang.Runnable f2519e0;

    /* renamed from: f0 */
    public androidx.lifecycle.FragmentC0451k0.a f2520f0;

    /* renamed from: androidx.lifecycle.i0$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.lifecycle.C0447i0 f2521Y;

        public a(androidx.lifecycle.C0447i0 r1) {
                r0 = this;
                r0.f2521Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                androidx.lifecycle.i0 r0 = r4.f2521Y
                int r1 = r0.f2514Z
                r2 = 1
                if (r1 != 0) goto L10
                r0.f2515a0 = r2
                androidx.lifecycle.w r0 = r0.f2518d0
                androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_PAUSE
                r0.m1462e(r1)
            L10:
                androidx.lifecycle.i0 r0 = r4.f2521Y
                int r1 = r0.f2513Y
                if (r1 != 0) goto L23
                boolean r1 = r0.f2515a0
                if (r1 == 0) goto L23
                androidx.lifecycle.w r1 = r0.f2518d0
                androidx.lifecycle.o$b r3 = androidx.lifecycle.AbstractC0458o.b.ON_STOP
                r1.m1462e(r3)
                r0.f2516b0 = r2
            L23:
                return
        }
    }

    /* renamed from: androidx.lifecycle.i0$b */
    public class b implements androidx.lifecycle.FragmentC0451k0.a {

        /* renamed from: a */
        public final /* synthetic */ androidx.lifecycle.C0447i0 f2522a;

        public b(androidx.lifecycle.C0447i0 r1) {
                r0 = this;
                r0.f2522a = r1
                r0.<init>()
                return
        }
    }

    static {
            androidx.lifecycle.i0 r0 = new androidx.lifecycle.i0
            r0.<init>()
            androidx.lifecycle.C0447i0.f2512g0 = r0
            return
    }

    public C0447i0() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2513Y = r0
            r1.f2514Z = r0
            r0 = 1
            r1.f2515a0 = r0
            r1.f2516b0 = r0
            androidx.lifecycle.w r0 = new androidx.lifecycle.w
            r0.<init>(r1)
            r1.f2518d0 = r0
            androidx.lifecycle.i0$a r0 = new androidx.lifecycle.i0$a
            r0.<init>(r1)
            r1.f2519e0 = r0
            androidx.lifecycle.i0$b r0 = new androidx.lifecycle.i0$b
            r0.<init>(r1)
            r1.f2520f0 = r0
            return
    }

    /* renamed from: a */
    public void m1435a() {
            r2 = this;
            int r0 = r2.f2514Z
            r1 = 1
            int r0 = r0 + r1
            r2.f2514Z = r0
            if (r0 != r1) goto L1e
            boolean r0 = r2.f2515a0
            if (r0 == 0) goto L17
            androidx.lifecycle.w r0 = r2.f2518d0
            androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_RESUME
            r0.m1462e(r1)
            r0 = 0
            r2.f2515a0 = r0
            goto L1e
        L17:
            android.os.Handler r0 = r2.f2517c0
            java.lang.Runnable r1 = r2.f2519e0
            r0.removeCallbacks(r1)
        L1e:
            return
    }

    @Override // androidx.lifecycle.InterfaceC0471v
    /* renamed from: b */
    public androidx.lifecycle.AbstractC0458o mo428b() {
            r1 = this;
            androidx.lifecycle.w r0 = r1.f2518d0
            return r0
    }

    /* renamed from: c */
    public void m1436c() {
            r2 = this;
            int r0 = r2.f2513Y
            r1 = 1
            int r0 = r0 + r1
            r2.f2513Y = r0
            if (r0 != r1) goto L16
            boolean r0 = r2.f2516b0
            if (r0 == 0) goto L16
            androidx.lifecycle.w r0 = r2.f2518d0
            androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_START
            r0.m1462e(r1)
            r0 = 0
            r2.f2516b0 = r0
        L16:
            return
    }
}
