package p179k1;

/* renamed from: k1.y */
/* loaded from: classes.dex */
public class C3667y<T> extends androidx.lifecycle.LiveData<T> {

    /* renamed from: l */
    public final p179k1.AbstractC3664v f16223l;

    /* renamed from: m */
    public final boolean f16224m;

    /* renamed from: n */
    public final java.util.concurrent.Callable<T> f16225n;

    /* renamed from: o */
    public final androidx.appcompat.widget.C0311x f16226o;

    /* renamed from: p */
    public final p179k1.C3662t.c f16227p;

    /* renamed from: q */
    public final java.util.concurrent.atomic.AtomicBoolean f16228q;

    /* renamed from: r */
    public final java.util.concurrent.atomic.AtomicBoolean f16229r;

    /* renamed from: s */
    public final java.util.concurrent.atomic.AtomicBoolean f16230s;

    /* renamed from: t */
    public final java.lang.Runnable f16231t;

    /* renamed from: u */
    public final java.lang.Runnable f16232u;

    /* renamed from: k1.y$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ p179k1.C3667y f16233Y;

        public a(p179k1.C3667y r1) {
                r0 = this;
                r0.f16233Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                k1.y r0 = r5.f16233Y
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f16230s
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L1f
                k1.y r0 = r5.f16233Y
                k1.v r3 = r0.f16223l
                k1.t r3 = r3.f16191e
                k1.t$c r0 = r0.f16227p
                java.util.Objects.requireNonNull(r3)
                k1.t$e r4 = new k1.t$e
                r4.<init>(r3, r0)
                r3.m8091a(r4)
            L1f:
                k1.y r0 = r5.f16233Y
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f16229r
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L60
                r0 = 0
                r3 = 0
            L2b:
                k1.y r4 = r5.f16233Y     // Catch: java.lang.Throwable -> L57
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f16228q     // Catch: java.lang.Throwable -> L57
                boolean r4 = r4.compareAndSet(r2, r1)     // Catch: java.lang.Throwable -> L57
                if (r4 == 0) goto L48
                k1.y r0 = r5.f16233Y     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L57
                java.util.concurrent.Callable<T> r0 = r0.f16225n     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L57
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L57
                r3 = 1
                goto L2b
            L3f:
                r0 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L57
                java.lang.String r3 = "Exception while computing database live data."
                r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L57
                throw r2     // Catch: java.lang.Throwable -> L57
            L48:
                if (r3 == 0) goto L4f
                k1.y r4 = r5.f16233Y     // Catch: java.lang.Throwable -> L57
                r4.mo1415j(r0)     // Catch: java.lang.Throwable -> L57
            L4f:
                k1.y r0 = r5.f16233Y
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f16229r
                r0.set(r1)
                goto L61
            L57:
                r0 = move-exception
                k1.y r2 = r5.f16233Y
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f16229r
                r2.set(r1)
                throw r0
            L60:
                r3 = 0
            L61:
                if (r3 == 0) goto L6d
                k1.y r0 = r5.f16233Y
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f16228q
                boolean r0 = r0.get()
                if (r0 != 0) goto L1f
            L6d:
                return
        }
    }

    /* renamed from: k1.y$b */
    public class b implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ p179k1.C3667y f16234Y;

        public b(p179k1.C3667y r1) {
                r0 = this;
                r0.f16234Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                k1.y r0 = r4.f16234Y
                boolean r0 = r0.m1412e()
                k1.y r1 = r4.f16234Y
                java.util.concurrent.atomic.AtomicBoolean r1 = r1.f16228q
                r2 = 0
                r3 = 1
                boolean r1 = r1.compareAndSet(r2, r3)
                if (r1 == 0) goto L28
                if (r0 == 0) goto L28
                k1.y r0 = r4.f16234Y
                boolean r1 = r0.f16224m
                if (r1 == 0) goto L1f
                k1.v r1 = r0.f16223l
                java.util.concurrent.Executor r1 = r1.f16189c
                goto L23
            L1f:
                k1.v r1 = r0.f16223l
                java.util.concurrent.Executor r1 = r1.f16188b
            L23:
                java.lang.Runnable r0 = r0.f16231t
                r1.execute(r0)
            L28:
                return
        }
    }

    /* renamed from: k1.y$c */
    public class c extends p179k1.C3662t.c {

        /* renamed from: b */
        public final /* synthetic */ p179k1.C3667y f16235b;

        public c(p179k1.C3667y r1, java.lang.String[] r2) {
                r0 = this;
                r0.f16235b = r1
                r0.<init>(r2)
                return
        }

        @Override // p179k1.C3662t.c
        /* renamed from: a */
        public void mo8102a(java.util.Set<java.lang.String> r3) {
                r2 = this;
                m.a r3 = p211m.C4308a.m9633j()
                k1.y r0 = r2.f16235b
                java.lang.Runnable r0 = r0.f16232u
                boolean r1 = r3.mo9635f()
                if (r1 == 0) goto L12
                r0.run()
                goto L15
            L12:
                r3.mo9636g(r0)
            L15:
                return
        }
    }

    @android.annotation.SuppressLint({"RestrictedApi"})
    public C3667y(p179k1.AbstractC3664v r3, androidx.appcompat.widget.C0311x r4, boolean r5, java.util.concurrent.Callable<T> r6, java.lang.String[] r7) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            r2.f16228q = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f16229r = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r2.f16230s = r0
            k1.y$a r0 = new k1.y$a
            r0.<init>(r2)
            r2.f16231t = r0
            k1.y$b r0 = new k1.y$b
            r0.<init>(r2)
            r2.f16232u = r0
            r2.f16223l = r3
            r2.f16224m = r5
            r2.f16225n = r6
            r2.f16226o = r4
            k1.y$c r3 = new k1.y$c
            r3.<init>(r2, r7)
            r2.f16227p = r3
            return
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: h */
    public void mo4h() {
            r2 = this;
            androidx.appcompat.widget.x r0 = r2.f16226o
            java.lang.Object r0 = r0.f1481Z
            java.util.Set r0 = (java.util.Set) r0
            r0.add(r2)
            boolean r0 = r2.f16224m
            if (r0 == 0) goto L12
            k1.v r0 = r2.f16223l
            java.util.concurrent.Executor r0 = r0.f16189c
            goto L16
        L12:
            k1.v r0 = r2.f16223l
            java.util.concurrent.Executor r0 = r0.f16188b
        L16:
            java.lang.Runnable r1 = r2.f16231t
            r0.execute(r1)
            return
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: i */
    public void mo5i() {
            r1 = this;
            androidx.appcompat.widget.x r0 = r1.f16226o
            java.lang.Object r0 = r0.f1481Z
            java.util.Set r0 = (java.util.Set) r0
            r0.remove(r1)
            return
    }
}
