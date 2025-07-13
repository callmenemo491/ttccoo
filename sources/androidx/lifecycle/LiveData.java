package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k */
    public static final java.lang.Object f2437k = null;

    /* renamed from: a */
    public final java.lang.Object f2438a;

    /* renamed from: b */
    public p226n.C4640b<androidx.lifecycle.InterfaceC0439e0<? super T>, androidx.lifecycle.LiveData<T>.AbstractC0425c> f2439b;

    /* renamed from: c */
    public int f2440c;

    /* renamed from: d */
    public boolean f2441d;

    /* renamed from: e */
    public volatile java.lang.Object f2442e;

    /* renamed from: f */
    public volatile java.lang.Object f2443f;

    /* renamed from: g */
    public int f2444g;

    /* renamed from: h */
    public boolean f2445h;

    /* renamed from: i */
    public boolean f2446i;

    /* renamed from: j */
    public final java.lang.Runnable f2447j;

    public class LifecycleBoundObserver extends androidx.lifecycle.LiveData<T>.AbstractC0425c implements androidx.lifecycle.InterfaceC0468t {

        /* renamed from: c0 */
        public final androidx.lifecycle.InterfaceC0471v f2448c0;

        /* renamed from: d0 */
        public final /* synthetic */ androidx.lifecycle.LiveData f2449d0;

        public LifecycleBoundObserver(androidx.lifecycle.LiveData r1, androidx.lifecycle.InterfaceC0471v r2, androidx.lifecycle.InterfaceC0439e0<? super T> r3) {
                r0 = this;
                r0.f2449d0 = r1
                r0.<init>(r1, r3)
                r0.f2448c0 = r2
                return
        }

        @Override // androidx.lifecycle.InterfaceC0468t
        /* renamed from: d */
        public void mo435d(androidx.lifecycle.InterfaceC0471v r2, androidx.lifecycle.AbstractC0458o.b r3) {
                r1 = this;
                androidx.lifecycle.v r2 = r1.f2448c0
                androidx.lifecycle.o r2 = r2.mo428b()
                androidx.lifecycle.w r2 = (androidx.lifecycle.C0472w) r2
                androidx.lifecycle.o$c r2 = r2.f2564c
                androidx.lifecycle.o$c r3 = androidx.lifecycle.AbstractC0458o.c.f2546Y
                if (r2 != r3) goto L16
                androidx.lifecycle.LiveData r2 = r1.f2449d0
                androidx.lifecycle.e0<? super T> r3 = r1.f2451Y
                r2.mo6k(r3)
                return
            L16:
                r3 = 0
            L17:
                if (r3 == r2) goto L2e
                boolean r3 = r1.mo1418k()
                r1.m1419h(r3)
                androidx.lifecycle.v r3 = r1.f2448c0
                androidx.lifecycle.o r3 = r3.mo428b()
                androidx.lifecycle.w r3 = (androidx.lifecycle.C0472w) r3
                androidx.lifecycle.o$c r3 = r3.f2564c
                r0 = r3
                r3 = r2
                r2 = r0
                goto L17
            L2e:
                return
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0425c
        /* renamed from: i */
        public void mo1416i() {
                r2 = this;
                androidx.lifecycle.v r0 = r2.f2448c0
                androidx.lifecycle.o r0 = r0.mo428b()
                androidx.lifecycle.w r0 = (androidx.lifecycle.C0472w) r0
                java.lang.String r1 = "removeObserver"
                r0.m1461d(r1)
                n.a<androidx.lifecycle.u, androidx.lifecycle.w$a> r0 = r0.f2563b
                r0.mo10456l(r2)
                return
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0425c
        /* renamed from: j */
        public boolean mo1417j(androidx.lifecycle.InterfaceC0471v r2) {
                r1 = this;
                androidx.lifecycle.v r0 = r1.f2448c0
                if (r0 != r2) goto L6
                r2 = 1
                goto L7
            L6:
                r2 = 0
            L7:
                return r2
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0425c
        /* renamed from: k */
        public boolean mo1418k() {
                r2 = this;
                androidx.lifecycle.v r0 = r2.f2448c0
                androidx.lifecycle.o r0 = r0.mo428b()
                androidx.lifecycle.w r0 = (androidx.lifecycle.C0472w) r0
                androidx.lifecycle.o$c r0 = r0.f2564c
                androidx.lifecycle.o$c r1 = androidx.lifecycle.AbstractC0458o.c.f2549b0
                int r0 = r0.compareTo(r1)
                if (r0 < 0) goto L14
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                return r0
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    public class RunnableC0423a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.lifecycle.LiveData f2450Y;

        public RunnableC0423a(androidx.lifecycle.LiveData r1) {
                r0 = this;
                r0.f2450Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                androidx.lifecycle.LiveData r0 = r4.f2450Y
                java.lang.Object r0 = r0.f2438a
                monitor-enter(r0)
                androidx.lifecycle.LiveData r1 = r4.f2450Y     // Catch: java.lang.Throwable -> L16
                java.lang.Object r1 = r1.f2443f     // Catch: java.lang.Throwable -> L16
                androidx.lifecycle.LiveData r2 = r4.f2450Y     // Catch: java.lang.Throwable -> L16
                java.lang.Object r3 = androidx.lifecycle.LiveData.f2437k     // Catch: java.lang.Throwable -> L16
                r2.f2443f = r3     // Catch: java.lang.Throwable -> L16
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                androidx.lifecycle.LiveData r0 = r4.f2450Y
                r0.mo7l(r1)
                return
            L16:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                throw r1
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    public class C0424b extends androidx.lifecycle.LiveData<T>.AbstractC0425c {
        public C0424b(androidx.lifecycle.LiveData r1, androidx.lifecycle.InterfaceC0439e0<? super T> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0425c
        /* renamed from: k */
        public boolean mo1418k() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    public abstract class AbstractC0425c {

        /* renamed from: Y */
        public final androidx.lifecycle.InterfaceC0439e0<? super T> f2451Y;

        /* renamed from: Z */
        public boolean f2452Z;

        /* renamed from: a0 */
        public int f2453a0;

        /* renamed from: b0 */
        public final /* synthetic */ androidx.lifecycle.LiveData f2454b0;

        public AbstractC0425c(androidx.lifecycle.LiveData r1, androidx.lifecycle.InterfaceC0439e0<? super T> r2) {
                r0 = this;
                r0.f2454b0 = r1
                r0.<init>()
                r1 = -1
                r0.f2453a0 = r1
                r0.f2451Y = r2
                return
        }

        /* renamed from: h */
        public void m1419h(boolean r6) {
                r5 = this;
                boolean r0 = r5.f2452Z
                if (r6 != r0) goto L5
                return
            L5:
                r5.f2452Z = r6
                androidx.lifecycle.LiveData r0 = r5.f2454b0
                r1 = 1
                if (r6 == 0) goto Le
                r6 = 1
                goto Lf
            Le:
                r6 = -1
            Lf:
                int r2 = r0.f2440c
                int r6 = r6 + r2
                r0.f2440c = r6
                boolean r6 = r0.f2441d
                if (r6 == 0) goto L19
                goto L3d
            L19:
                r0.f2441d = r1
            L1b:
                r6 = 0
                int r3 = r0.f2440c     // Catch: java.lang.Throwable -> L47
                if (r2 == r3) goto L3b
                if (r2 != 0) goto L26
                if (r3 <= 0) goto L26
                r4 = 1
                goto L27
            L26:
                r4 = 0
            L27:
                if (r2 <= 0) goto L2d
                if (r3 != 0) goto L2d
                r2 = 1
                goto L2e
            L2d:
                r2 = 0
            L2e:
                if (r4 == 0) goto L34
                r0.mo4h()     // Catch: java.lang.Throwable -> L47
                goto L39
            L34:
                if (r2 == 0) goto L39
                r0.mo5i()     // Catch: java.lang.Throwable -> L47
            L39:
                r2 = r3
                goto L1b
            L3b:
                r0.f2441d = r6
            L3d:
                boolean r6 = r5.f2452Z
                if (r6 == 0) goto L46
                androidx.lifecycle.LiveData r6 = r5.f2454b0
                r6.m1410c(r5)
            L46:
                return
            L47:
                r1 = move-exception
                r0.f2441d = r6
                throw r1
        }

        /* renamed from: i */
        public void mo1416i() {
                r0 = this;
                return
        }

        /* renamed from: j */
        public boolean mo1417j(androidx.lifecycle.InterfaceC0471v r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: k */
        public abstract boolean mo1418k();
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.lifecycle.LiveData.f2437k = r0
            return
    }

    public LiveData() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f2438a = r0
            n.b r0 = new n.b
            r0.<init>()
            r2.f2439b = r0
            r0 = 0
            r2.f2440c = r0
            java.lang.Object r0 = androidx.lifecycle.LiveData.f2437k
            r2.f2443f = r0
            androidx.lifecycle.LiveData$a r1 = new androidx.lifecycle.LiveData$a
            r1.<init>(r2)
            r2.f2447j = r1
            r2.f2442e = r0
            r0 = -1
            r2.f2444g = r0
            return
    }

    public LiveData(T r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f2438a = r0
            n.b r0 = new n.b
            r0.<init>()
            r2.f2439b = r0
            r0 = 0
            r2.f2440c = r0
            java.lang.Object r1 = androidx.lifecycle.LiveData.f2437k
            r2.f2443f = r1
            androidx.lifecycle.LiveData$a r1 = new androidx.lifecycle.LiveData$a
            r1.<init>(r2)
            r2.f2447j = r1
            r2.f2442e = r3
            r2.f2444g = r0
            return
    }

    /* renamed from: a */
    public static void m1408a(java.lang.String r3) {
            m.a r0 = p211m.C4308a.m9633j()
            boolean r0 = r0.mo9635f()
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot invoke "
            java.lang.String r2 = " on a background thread"
            java.lang.String r3 = android.support.v4.media.C0145d.m257a(r1, r3, r2)
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: b */
    public final void m1409b(androidx.lifecycle.LiveData<T>.AbstractC0425c r3) {
            r2 = this;
            boolean r0 = r3.f2452Z
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r3.mo1418k()
            if (r0 != 0) goto L10
            r0 = 0
            r3.m1419h(r0)
            return
        L10:
            int r0 = r3.f2453a0
            int r1 = r2.f2444g
            if (r0 < r1) goto L17
            return
        L17:
            r3.f2453a0 = r1
            androidx.lifecycle.e0<? super T> r3 = r3.f2451Y
            java.lang.Object r0 = r2.f2442e
            r3.mo124d(r0)
            return
    }

    /* renamed from: c */
    public void m1410c(androidx.lifecycle.LiveData<T>.AbstractC0425c r4) {
            r3 = this;
            boolean r0 = r3.f2445h
            r1 = 1
            if (r0 == 0) goto L8
            r3.f2446i = r1
            return
        L8:
            r3.f2445h = r1
        La:
            r0 = 0
            r3.f2446i = r0
            if (r4 == 0) goto L14
            r3.m1409b(r4)
            r4 = 0
            goto L33
        L14:
            n.b<androidx.lifecycle.e0<? super T>, androidx.lifecycle.LiveData<T>$c> r1 = r3.f2439b
            n.b$d r1 = r1.m10457e()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.LiveData$c r2 = (androidx.lifecycle.LiveData.AbstractC0425c) r2
            r3.m1409b(r2)
            boolean r2 = r3.f2446i
            if (r2 == 0) goto L1a
        L33:
            boolean r1 = r3.f2446i
            if (r1 != 0) goto La
            r3.f2445h = r0
            return
    }

    /* renamed from: d */
    public T m1411d() {
            r2 = this;
            java.lang.Object r0 = r2.f2442e
            java.lang.Object r1 = androidx.lifecycle.LiveData.f2437k
            if (r0 == r1) goto L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    /* renamed from: e */
    public boolean m1412e() {
            r1 = this;
            int r0 = r1.f2440c
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: f */
    public void m1413f(androidx.lifecycle.InterfaceC0471v r3, androidx.lifecycle.InterfaceC0439e0<? super T> r4) {
            r2 = this;
            java.lang.String r0 = "observe"
            m1408a(r0)
            androidx.lifecycle.o r0 = r3.mo428b()
            androidx.lifecycle.w r0 = (androidx.lifecycle.C0472w) r0
            androidx.lifecycle.o$c r0 = r0.f2564c
            androidx.lifecycle.o$c r1 = androidx.lifecycle.AbstractC0458o.c.f2546Y
            if (r0 != r1) goto L12
            return
        L12:
            androidx.lifecycle.LiveData$LifecycleBoundObserver r0 = new androidx.lifecycle.LiveData$LifecycleBoundObserver
            r0.<init>(r2, r3, r4)
            n.b<androidx.lifecycle.e0<? super T>, androidx.lifecycle.LiveData<T>$c> r1 = r2.f2439b
            java.lang.Object r4 = r1.mo10455i(r4, r0)
            androidx.lifecycle.LiveData$c r4 = (androidx.lifecycle.LiveData.AbstractC0425c) r4
            if (r4 == 0) goto L30
            boolean r1 = r4.mo1417j(r3)
            if (r1 == 0) goto L28
            goto L30
        L28:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Cannot add the same observer with different lifecycles"
            r3.<init>(r4)
            throw r3
        L30:
            if (r4 == 0) goto L33
            return
        L33:
            androidx.lifecycle.o r3 = r3.mo428b()
            r3.mo1454a(r0)
            return
    }

    /* renamed from: g */
    public void m1414g(androidx.lifecycle.InterfaceC0439e0<? super T> r3) {
            r2 = this;
            java.lang.String r0 = "observeForever"
            m1408a(r0)
            androidx.lifecycle.LiveData$b r0 = new androidx.lifecycle.LiveData$b
            r0.<init>(r2, r3)
            n.b<androidx.lifecycle.e0<? super T>, androidx.lifecycle.LiveData<T>$c> r1 = r2.f2439b
            java.lang.Object r3 = r1.mo10455i(r3, r0)
            androidx.lifecycle.LiveData$c r3 = (androidx.lifecycle.LiveData.AbstractC0425c) r3
            boolean r1 = r3 instanceof androidx.lifecycle.LiveData.LifecycleBoundObserver
            if (r1 != 0) goto L1e
            if (r3 == 0) goto L19
            return
        L19:
            r3 = 1
            r0.m1419h(r3)
            return
        L1e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot add the same observer with different lifecycles"
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: h */
    public void mo4h() {
            r0 = this;
            return
    }

    /* renamed from: i */
    public void mo5i() {
            r0 = this;
            return
    }

    /* renamed from: j */
    public void mo1415j(T r4) {
            r3 = this;
            java.lang.Object r0 = r3.f2438a
            monitor-enter(r0)
            java.lang.Object r1 = r3.f2443f     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = androidx.lifecycle.LiveData.f2437k     // Catch: java.lang.Throwable -> L1e
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r3.f2443f = r4     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L12
            return
        L12:
            m.a r4 = p211m.C4308a.m9633j()
            java.lang.Runnable r0 = r3.f2447j
            m.c r4 = r4.f17577a
            r4.mo9636g(r0)
            return
        L1e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r4
    }

    /* renamed from: k */
    public void mo6k(androidx.lifecycle.InterfaceC0439e0<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "removeObserver"
            m1408a(r0)
            n.b<androidx.lifecycle.e0<? super T>, androidx.lifecycle.LiveData<T>$c> r0 = r1.f2439b
            java.lang.Object r2 = r0.mo10456l(r2)
            androidx.lifecycle.LiveData$c r2 = (androidx.lifecycle.LiveData.AbstractC0425c) r2
            if (r2 != 0) goto L10
            return
        L10:
            r2.mo1416i()
            r0 = 0
            r2.m1419h(r0)
            return
    }

    /* renamed from: l */
    public void mo7l(T r2) {
            r1 = this;
            java.lang.String r0 = "setValue"
            m1408a(r0)
            int r0 = r1.f2444g
            int r0 = r0 + 1
            r1.f2444g = r0
            r1.f2442e = r2
            r2 = 0
            r1.m1410c(r2)
            return
    }
}
