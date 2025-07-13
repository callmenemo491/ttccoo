package p445z2;

/* renamed from: z2.n */
/* loaded from: classes.dex */
public class C7240n implements p015ak.InterfaceC0117a {

    /* renamed from: Y */
    public final /* synthetic */ int f27825Y;

    /* renamed from: Z */
    public final java.util.Set<p033c3.InterfaceC0858d> f27826Z;

    /* renamed from: a0 */
    public java.util.List<p033c3.InterfaceC0858d> f27827a0;

    /* renamed from: b0 */
    public boolean f27828b0;

    public C7240n(int r2) {
            r1 = this;
            r1.f27825Y = r2
            r0 = 1
            if (r2 == r0) goto L33
            r0 = 2
            if (r2 == r0) goto L1e
            r1.<init>()
            java.util.WeakHashMap r2 = new java.util.WeakHashMap
            r2.<init>()
            java.util.Set r2 = java.util.Collections.newSetFromMap(r2)
            r1.f27826Z = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f27827a0 = r2
            return
        L1e:
            r1.<init>()
            r2 = 0
            r1.f27828b0 = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f27826Z = r2
            java.util.concurrent.LinkedBlockingQueue r2 = new java.util.concurrent.LinkedBlockingQueue
            r2.<init>()
            r1.f27827a0 = r2
            return
        L33:
            r1.<init>()
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f27826Z = r2
            return
    }

    /* renamed from: a */
    public void m14305a() {
            r1 = this;
            java.util.Set<c3.d> r0 = r1.f27826Z
            java.util.Map r0 = (java.util.Map) r0
            r0.clear()
            java.util.List<c3.d> r0 = r1.f27827a0
            java.util.concurrent.LinkedBlockingQueue r0 = (java.util.concurrent.LinkedBlockingQueue) r0
            r0.clear()
            return
    }

    @Override // p015ak.InterfaceC0117a
    /* renamed from: b */
    public synchronized p015ak.InterfaceC0118b mo176b(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.Set<c3.d> r0 = r3.f27826Z     // Catch: java.lang.Throwable -> L21
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L21
            ck.d r0 = (ck.C0995d) r0     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L1f
            ck.d r0 = new ck.d     // Catch: java.lang.Throwable -> L21
            java.util.List<c3.d> r1 = r3.f27827a0     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.LinkedBlockingQueue r1 = (java.util.concurrent.LinkedBlockingQueue) r1     // Catch: java.lang.Throwable -> L21
            boolean r2 = r3.f27828b0     // Catch: java.lang.Throwable -> L21
            r0.<init>(r4, r1, r2)     // Catch: java.lang.Throwable -> L21
            java.util.Set<c3.d> r1 = r3.f27826Z     // Catch: java.lang.Throwable -> L21
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L21
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L21
        L1f:
            monitor-exit(r3)
            return r0
        L21:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    /* renamed from: c */
    public boolean m14306c(p033c3.InterfaceC0858d r4) {
            r3 = this;
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.Set<c3.d> r1 = r3.f27826Z
            java.util.Set r1 = (java.util.Set) r1
            boolean r1 = r1.remove(r4)
            java.util.List<c3.d> r2 = r3.f27827a0
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r2.remove(r4)
            if (r2 != 0) goto L1a
            if (r1 == 0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto L1f
            r4.clear()
        L1f:
            return r0
    }

    /* renamed from: d */
    public void m14307d() {
            r3 = this;
            java.util.Set<c3.d> r0 = r3.f27826Z
            java.util.Set r0 = (java.util.Set) r0
            java.util.List r0 = p106g3.C2238j.m5845e(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()
            c3.d r1 = (p033c3.InterfaceC0858d) r1
            boolean r2 = r1.mo2559i()
            if (r2 != 0) goto Le
            boolean r2 = r1.mo2555e()
            if (r2 != 0) goto Le
            r1.clear()
            boolean r2 = r3.f27828b0
            if (r2 != 0) goto L31
            r1.mo2557g()
            goto Le
        L31:
            java.util.List<c3.d> r2 = r3.f27827a0
            java.util.List r2 = (java.util.List) r2
            r2.add(r1)
            goto Le
        L39:
            return
    }

    /* renamed from: e */
    public void m14308e() {
            r3 = this;
            r0 = 0
            r3.f27828b0 = r0
            java.util.Set<c3.d> r0 = r3.f27826Z
            java.util.Set r0 = (java.util.Set) r0
            java.util.List r0 = p106g3.C2238j.m5845e(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            c3.d r1 = (p033c3.InterfaceC0858d) r1
            boolean r2 = r1.mo2559i()
            if (r2 != 0) goto L11
            boolean r2 = r1.isRunning()
            if (r2 != 0) goto L11
            r1.mo2557g()
            goto L11
        L2d:
            java.util.List<c3.d> r0 = r3.f27827a0
            java.util.List r0 = (java.util.List) r0
            r0.clear()
            return
    }

    /* renamed from: f */
    public void m14309f(p327s7.AbstractC5985i<TResult> r3) {
            r2 = this;
            java.util.Set<c3.d> r0 = r2.f27826Z
            monitor-enter(r0)
            java.util.List<c3.d> r1 = r2.f27827a0     // Catch: java.lang.Throwable -> L30
            java.util.Queue r1 = (java.util.Queue) r1     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L2e
            boolean r1 = r2.f27828b0     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto Le
            goto L2e
        Le:
            r1 = 1
            r2.f27828b0 = r1     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
        L12:
            java.util.Set<c3.d> r1 = r2.f27826Z
            monitor-enter(r1)
            java.util.List<c3.d> r0 = r2.f27827a0     // Catch: java.lang.Throwable -> L2b
            java.util.Queue r0 = (java.util.Queue) r0     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L2b
            s7.o r0 = (p327s7.InterfaceC5991o) r0     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L26
            r3 = 0
            r2.f27828b0 = r3     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            return
        L26:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            r0.mo12470b(r3)
            goto L12
        L2b:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            throw r3
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r3
    }

    /* renamed from: g */
    public void m14310g(p327s7.InterfaceC5991o<TResult> r3) {
            r2 = this;
            java.util.Set<c3.d> r0 = r2.f27826Z
            monitor-enter(r0)
            java.util.List<c3.d> r1 = r2.f27827a0     // Catch: java.lang.Throwable -> L19
            java.util.Queue r1 = (java.util.Queue) r1     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L10
            java.util.ArrayDeque r1 = new java.util.ArrayDeque     // Catch: java.lang.Throwable -> L19
            r1.<init>()     // Catch: java.lang.Throwable -> L19
            r2.f27827a0 = r1     // Catch: java.lang.Throwable -> L19
        L10:
            java.util.List<c3.d> r1 = r2.f27827a0     // Catch: java.lang.Throwable -> L19
            java.util.Queue r1 = (java.util.Queue) r1     // Catch: java.lang.Throwable -> L19
            r1.add(r3)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f27825Y
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "{numRequests="
            r0.append(r1)
            java.util.Set<c3.d> r1 = r2.f27826Z
            java.util.Set r1 = (java.util.Set) r1
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ", isPaused="
            r0.append(r1)
            boolean r1 = r2.f27828b0
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
