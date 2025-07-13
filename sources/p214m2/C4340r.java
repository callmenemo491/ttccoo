package p214m2;

/* renamed from: m2.r */
/* loaded from: classes.dex */
public class C4340r<Z> implements p214m2.InterfaceC4345w<Z> {

    /* renamed from: Y */
    public final boolean f17792Y;

    /* renamed from: Z */
    public final boolean f17793Z;

    /* renamed from: a0 */
    public final p214m2.InterfaceC4345w<Z> f17794a0;

    /* renamed from: b0 */
    public final p214m2.C4340r.a f17795b0;

    /* renamed from: c0 */
    public final p180k2.InterfaceC3671c f17796c0;

    /* renamed from: d0 */
    public int f17797d0;

    /* renamed from: e0 */
    public boolean f17798e0;

    /* renamed from: m2.r$a */
    public interface a {
        /* renamed from: a */
        void mo9685a(p180k2.InterfaceC3671c r1, p214m2.C4340r<?> r2);
    }

    public C4340r(p214m2.InterfaceC4345w<Z> r2, boolean r3, boolean r4, p180k2.InterfaceC3671c r5, p214m2.C4340r.a r6) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f17794a0 = r2
            r1.f17792Y = r3
            r1.f17793Z = r4
            r1.f17796c0 = r5
            java.util.Objects.requireNonNull(r6, r0)
            r1.f17795b0 = r6
            return
    }

    @Override // p214m2.InterfaceC4345w
    /* renamed from: a */
    public int mo9718a() {
            r1 = this;
            m2.w<Z> r0 = r1.f17794a0
            int r0 = r0.mo9718a()
            return r0
    }

    /* renamed from: b */
    public synchronized void m9719b() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f17798e0     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto Ld
            int r0 = r2.f17797d0     // Catch: java.lang.Throwable -> L15
            int r0 = r0 + 1
            r2.f17797d0 = r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "Cannot acquire a recycled resource"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L15:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // p214m2.InterfaceC4345w
    /* renamed from: c */
    public java.lang.Class<Z> mo9720c() {
            r1 = this;
            m2.w<Z> r0 = r1.f17794a0
            java.lang.Class r0 = r0.mo9720c()
            return r0
    }

    @Override // p214m2.InterfaceC4345w
    /* renamed from: d */
    public synchronized void mo9721d() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f17797d0     // Catch: java.lang.Throwable -> L27
            if (r0 > 0) goto L1f
            boolean r0 = r2.f17798e0     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L17
            r0 = 1
            r2.f17798e0 = r0     // Catch: java.lang.Throwable -> L27
            boolean r0 = r2.f17793Z     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L15
            m2.w<Z> r0 = r2.f17794a0     // Catch: java.lang.Throwable -> L27
            r0.mo9721d()     // Catch: java.lang.Throwable -> L27
        L15:
            monitor-exit(r2)
            return
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "Cannot recycle a resource that has already been recycled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "Cannot recycle a resource while it is still acquired"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        L27:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    /* renamed from: e */
    public void m9722e() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f17797d0     // Catch: java.lang.Throwable -> L20
            if (r0 <= 0) goto L18
            r1 = 1
            int r0 = r0 - r1
            r2.f17797d0 = r0     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L17
            m2.r$a r0 = r2.f17795b0
            k2.c r1 = r2.f17796c0
            r0.mo9685a(r1, r2)
        L17:
            return
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "Cannot release a recycled or not yet acquired resource"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L20
        L20:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0
    }

    @Override // p214m2.InterfaceC4345w
    public Z get() {
            r1 = this;
            m2.w<Z> r0 = r1.f17794a0
            java.lang.Object r0 = r0.get()
            return r0
    }

    public synchronized java.lang.String toString() {
            r2 = this;
            monitor-enter(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r0.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "EngineResource{isMemoryCacheable="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            boolean r1 = r2.f17792Y     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = ", listener="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            m2.r$a r1 = r2.f17795b0     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = ", key="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            k2.c r1 = r2.f17796c0     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = ", acquired="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            int r1 = r2.f17797d0     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = ", isRecycled="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            boolean r1 = r2.f17798e0     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = ", resource="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            m2.w<Z> r1 = r2.f17794a0     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)
            return r0
        L4d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
