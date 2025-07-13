package p211m;

/* renamed from: m.a */
/* loaded from: classes.dex */
public class C4308a extends p211m.AbstractC4310c {

    /* renamed from: b */
    public static volatile p211m.C4308a f17575b;

    /* renamed from: c */
    public static final java.util.concurrent.Executor f17576c = null;

    /* renamed from: a */
    public p211m.AbstractC4310c f17577a;

    /* renamed from: m.a$a */
    public static class a implements java.util.concurrent.Executor {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                m.a r0 = p211m.C4308a.m9633j()
                m.c r0 = r0.f17577a
                r0.mo9634d(r2)
                return
        }
    }

    static {
            m.a$a r0 = new m.a$a
            r0.<init>()
            p211m.C4308a.f17576c = r0
            return
    }

    public C4308a() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            m.b r0 = new m.b
            r0.<init>()
            r1.f17577a = r0
            return
    }

    /* renamed from: j */
    public static p211m.C4308a m9633j() {
            m.a r0 = p211m.C4308a.f17575b
            if (r0 == 0) goto L7
            m.a r0 = p211m.C4308a.f17575b
            return r0
        L7:
            java.lang.Class<m.a> r0 = p211m.C4308a.class
            monitor-enter(r0)
            m.a r1 = p211m.C4308a.f17575b     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L15
            m.a r1 = new m.a     // Catch: java.lang.Throwable -> L19
            r1.<init>()     // Catch: java.lang.Throwable -> L19
            p211m.C4308a.f17575b = r1     // Catch: java.lang.Throwable -> L19
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            m.a r0 = p211m.C4308a.f17575b
            return r0
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    @Override // p211m.AbstractC4310c
    /* renamed from: d */
    public void mo9634d(java.lang.Runnable r2) {
            r1 = this;
            m.c r0 = r1.f17577a
            r0.mo9634d(r2)
            return
    }

    @Override // p211m.AbstractC4310c
    /* renamed from: f */
    public boolean mo9635f() {
            r1 = this;
            m.c r0 = r1.f17577a
            boolean r0 = r0.mo9635f()
            return r0
    }

    @Override // p211m.AbstractC4310c
    /* renamed from: g */
    public void mo9636g(java.lang.Runnable r2) {
            r1 = this;
            m.c r0 = r1.f17577a
            r0.mo9636g(r2)
            return
    }
}
