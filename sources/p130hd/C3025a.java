package p130hd;

/* renamed from: hd.a */
/* loaded from: classes.dex */
public final class C3025a {

    /* renamed from: b */
    public static final p130hd.C3025a f12173b = null;

    /* renamed from: c */
    public static final java.lang.Object f12174c = null;

    /* renamed from: d */
    public static p130hd.C3025a f12175d;

    /* renamed from: a */
    public final java.util.concurrent.Executor f12176a;

    /* renamed from: hd.a$a */
    public static final class a implements java.util.concurrent.Executor {

        /* renamed from: Y */
        public final android.os.Handler f12177Y;

        public a() {
                r2 = this;
                r2.<init>()
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                r2.f12177Y = r0
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                java.lang.String r0 = "command"
                p214m2.C4339q.m9706k(r2, r0)
                android.os.Handler r0 = r1.f12177Y
                r0.post(r2)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p130hd.C3025a.f12174c = r0
            return
    }

    public C3025a(java.util.concurrent.Executor r1, java.util.concurrent.Executor r2, java.util.concurrent.Executor r3, p239nh.C4826f r4) {
            r0 = this;
            r0.<init>()
            r0.f12176a = r1
            return
    }

    /* renamed from: a */
    public static final p130hd.C3025a m7433a() {
            hd.a r0 = p130hd.C3025a.f12175d
            if (r0 != 0) goto L2c
            java.lang.Object r0 = p130hd.C3025a.f12174c
            monitor-enter(r0)
            hd.a r1 = new hd.a     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "newSingleThreadExecutor()"
            p214m2.C4339q.m9705j(r2, r3)     // Catch: java.lang.Throwable -> L29
            r3 = 3
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newFixedThreadPool(r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = "newFixedThreadPool(3)"
            p214m2.C4339q.m9705j(r3, r4)     // Catch: java.lang.Throwable -> L29
            hd.a$a r4 = new hd.a$a     // Catch: java.lang.Throwable -> L29
            r4.<init>()     // Catch: java.lang.Throwable -> L29
            r5 = 0
            r1.<init>(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L29
            p130hd.C3025a.f12175d = r1     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)
            goto L2c
        L29:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L2c:
            hd.a r0 = p130hd.C3025a.f12175d
            p214m2.C4339q.m9704i(r0)
            return r0
    }
}
