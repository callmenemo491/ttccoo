package p056da;

/* renamed from: da.f */
/* loaded from: classes.dex */
public class C1356f {

    /* renamed from: a */
    public final java.util.concurrent.Executor f6899a;

    /* renamed from: b */
    public p327s7.AbstractC5985i<java.lang.Void> f6900b;

    /* renamed from: c */
    public final java.lang.Object f6901c;

    /* renamed from: d */
    public final java.lang.ThreadLocal<java.lang.Boolean> f6902d;

    /* renamed from: da.f$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ p056da.C1356f f6903Y;

        public a(p056da.C1356f r1) {
                r0 = this;
                r0.f6903Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                da.f r0 = r2.f6903Y
                java.lang.ThreadLocal<java.lang.Boolean> r0 = r0.f6902d
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.set(r1)
                return
        }
    }

    public C1356f(java.util.concurrent.Executor r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            s7.i r0 = p327s7.C5988l.m12464e(r0)
            r1.f6900b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f6901c = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r1.f6902d = r0
            r1.f6899a = r2
            da.f$a r0 = new da.f$a
            r0.<init>(r1)
            r2.execute(r0)
            return
    }

    /* renamed from: a */
    public void m3871a() {
            r2 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.ThreadLocal<java.lang.Boolean> r1 = r2.f6902d
            java.lang.Object r1 = r1.get()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            return
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not running on background worker thread as intended."
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: b */
    public <T> p327s7.AbstractC5985i<T> m3872b(java.util.concurrent.Callable<T> r5) {
            r4 = this;
            java.lang.Object r0 = r4.f6901c
            monitor-enter(r0)
            s7.i<java.lang.Void> r1 = r4.f6900b     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.Executor r2 = r4.f6899a     // Catch: java.lang.Throwable -> L1f
            da.h r3 = new da.h     // Catch: java.lang.Throwable -> L1f
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L1f
            s7.i r5 = r1.mo12447e(r2, r3)     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.Executor r1 = r4.f6899a     // Catch: java.lang.Throwable -> L1f
            da.i r2 = new da.i     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L1f
            s7.i r1 = r5.mo12447e(r1, r2)     // Catch: java.lang.Throwable -> L1f
            r4.f6900b = r1     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return r5
        L1f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r5
    }

    /* renamed from: c */
    public <T> p327s7.AbstractC5985i<T> m3873c(java.util.concurrent.Callable<p327s7.AbstractC5985i<T>> r5) {
            r4 = this;
            java.lang.Object r0 = r4.f6901c
            monitor-enter(r0)
            s7.i<java.lang.Void> r1 = r4.f6900b     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.Executor r2 = r4.f6899a     // Catch: java.lang.Throwable -> L1f
            da.h r3 = new da.h     // Catch: java.lang.Throwable -> L1f
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L1f
            s7.i r5 = r1.mo12449g(r2, r3)     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.Executor r1 = r4.f6899a     // Catch: java.lang.Throwable -> L1f
            da.i r2 = new da.i     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L1f
            s7.i r1 = r5.mo12447e(r1, r2)     // Catch: java.lang.Throwable -> L1f
            r4.f6900b = r1     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return r5
        L1f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r5
    }
}
