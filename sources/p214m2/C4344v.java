package p214m2;

/* renamed from: m2.v */
/* loaded from: classes.dex */
public final class C4344v<Z> implements p214m2.InterfaceC4345w<Z>, p120h3.C2451a.d {

    /* renamed from: c0 */
    public static final p212m0.InterfaceC4313c<p214m2.C4344v<?>> f17810c0 = null;

    /* renamed from: Y */
    public final p120h3.AbstractC2454d f17811Y;

    /* renamed from: Z */
    public p214m2.InterfaceC4345w<Z> f17812Z;

    /* renamed from: a0 */
    public boolean f17813a0;

    /* renamed from: b0 */
    public boolean f17814b0;

    /* renamed from: m2.v$a */
    public class a implements p120h3.C2451a.b<p214m2.C4344v<?>> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p120h3.C2451a.b
        /* renamed from: a */
        public p214m2.C4344v<?> mo6229a() {
                r1 = this;
                m2.v r0 = new m2.v
                r0.<init>()
                return r0
        }
    }

    static {
            m2.v$a r0 = new m2.v$a
            r0.<init>()
            r1 = 20
            m0.c r0 = p120h3.C2451a.m6227a(r1, r0)
            p214m2.C4344v.f17810c0 = r0
            return
    }

    public C4344v() {
            r1 = this;
            r1.<init>()
            h3.d$b r0 = new h3.d$b
            r0.<init>()
            r1.f17811Y = r0
            return
    }

    /* renamed from: b */
    public static <Z> p214m2.C4344v<Z> m9731b(p214m2.InterfaceC4345w<Z> r2) {
            m0.c<m2.v<?>> r0 = p214m2.C4344v.f17810c0
            h3.a$c r0 = (p120h3.C2451a.c) r0
            java.lang.Object r0 = r0.mo6231b()
            m2.v r0 = (p214m2.C4344v) r0
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r0, r1)
            r1 = 0
            r0.f17814b0 = r1
            r1 = 1
            r0.f17813a0 = r1
            r0.f17812Z = r2
            return r0
    }

    @Override // p214m2.InterfaceC4345w
    /* renamed from: a */
    public int mo9718a() {
            r1 = this;
            m2.w<Z> r0 = r1.f17812Z
            int r0 = r0.mo9718a()
            return r0
    }

    @Override // p214m2.InterfaceC4345w
    /* renamed from: c */
    public java.lang.Class<Z> mo9720c() {
            r1 = this;
            m2.w<Z> r0 = r1.f17812Z
            java.lang.Class r0 = r0.mo9720c()
            return r0
    }

    @Override // p214m2.InterfaceC4345w
    /* renamed from: d */
    public synchronized void mo9721d() {
            r1 = this;
            monitor-enter(r1)
            h3.d r0 = r1.f17811Y     // Catch: java.lang.Throwable -> L1e
            r0.mo6233a()     // Catch: java.lang.Throwable -> L1e
            r0 = 1
            r1.f17814b0 = r0     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r1.f17813a0     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L1c
            m2.w<Z> r0 = r1.f17812Z     // Catch: java.lang.Throwable -> L1e
            r0.mo9721d()     // Catch: java.lang.Throwable -> L1e
            r0 = 0
            r1.f17812Z = r0     // Catch: java.lang.Throwable -> L1e
            m0.c<m2.v<?>> r0 = p214m2.C4344v.f17810c0     // Catch: java.lang.Throwable -> L1e
            h3.a$c r0 = (p120h3.C2451a.c) r0     // Catch: java.lang.Throwable -> L1e
            r0.mo6230a(r1)     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r1)
            return
        L1e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* renamed from: e */
    public synchronized void m9732e() {
            r2 = this;
            monitor-enter(r2)
            h3.d r0 = r2.f17811Y     // Catch: java.lang.Throwable -> L1e
            r0.mo6233a()     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r2.f17813a0     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L16
            r0 = 0
            r2.f17813a0 = r0     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r2.f17814b0     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L14
            r2.mo9721d()     // Catch: java.lang.Throwable -> L1e
        L14:
            monitor-exit(r2)
            return
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "Already unlocked"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            throw r0     // Catch: java.lang.Throwable -> L1e
        L1e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // p214m2.InterfaceC4345w
    public Z get() {
            r1 = this;
            m2.w<Z> r0 = r1.f17812Z
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // p120h3.C2451a.d
    /* renamed from: k */
    public p120h3.AbstractC2454d mo6232k() {
            r1 = this;
            h3.d r0 = r1.f17811Y
            return r0
    }
}
