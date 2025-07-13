package androidx.lifecycle;

/* renamed from: androidx.lifecycle.j */
/* loaded from: classes.dex */
public final class C0448j {

    /* renamed from: a */
    public boolean f2523a;

    /* renamed from: b */
    public boolean f2524b;

    /* renamed from: c */
    public boolean f2525c;

    /* renamed from: d */
    public final java.util.Queue<java.lang.Runnable> f2526d;

    public C0448j() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f2523a = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f2526d = r0
            return
    }

    /* renamed from: a */
    public final boolean m1437a() {
            r1 = this;
            boolean r0 = r1.f2524b
            if (r0 != 0) goto Lb
            boolean r0 = r1.f2523a
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    /* renamed from: b */
    public final void m1438b() {
            r3 = this;
            boolean r0 = r3.f2525c
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            r1 = 1
            r3.f2525c = r1     // Catch: java.lang.Throwable -> L2a
        L9:
            java.util.Queue<java.lang.Runnable> r2 = r3.f2526d     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2a
            r2 = r2 ^ r1
            if (r2 == 0) goto L27
            boolean r2 = r3.m1437a()     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto L19
            goto L27
        L19:
            java.util.Queue<java.lang.Runnable> r2 = r3.f2526d     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L2a
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L9
            r2.run()     // Catch: java.lang.Throwable -> L2a
            goto L9
        L27:
            r3.f2525c = r0
            return
        L2a:
            r1 = move-exception
            r3.f2525c = r0
            throw r1
    }

    /* renamed from: c */
    public final void m1439c(java.lang.Runnable r2) {
            r1 = this;
            java.util.Queue<java.lang.Runnable> r0 = r1.f2526d
            boolean r2 = r0.offer(r2)
            if (r2 == 0) goto Lc
            r1.m1438b()
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "cannot enqueue any more runnables"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }
}
