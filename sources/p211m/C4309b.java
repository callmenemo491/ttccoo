package p211m;

/* renamed from: m.b */
/* loaded from: classes.dex */
public class C4309b extends p211m.AbstractC4310c {

    /* renamed from: a */
    public final java.lang.Object f17578a;

    /* renamed from: b */
    public final java.util.concurrent.ExecutorService f17579b;

    /* renamed from: c */
    public volatile android.os.Handler f17580c;

    /* renamed from: m.b$a */
    public class a implements java.util.concurrent.ThreadFactory {

        /* renamed from: a */
        public final java.util.concurrent.atomic.AtomicInteger f17581a;

        public a(p211m.C4309b r2) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r0 = 0
                r2.<init>(r0)
                r1.f17581a = r2
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r4) {
                r3 = this;
                java.lang.Thread r0 = new java.lang.Thread
                r0.<init>(r4)
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.util.concurrent.atomic.AtomicInteger r1 = r3.f17581a
                int r1 = r1.getAndIncrement()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 0
                r4[r2] = r1
                java.lang.String r1 = "arch_disk_io_%d"
                java.lang.String r4 = java.lang.String.format(r1, r4)
                r0.setName(r4)
                return r0
        }
    }

    public C4309b() {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f17578a = r0
            m.b$a r0 = new m.b$a
            r0.<init>(r2)
            r1 = 4
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)
            r2.f17579b = r0
            return
    }

    /* renamed from: j */
    public static android.os.Handler m9637j(android.os.Looper r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r7 = android.os.Handler.createAsync(r7)
            return r7
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Class<android.os.Looper> r3 = android.os.Looper.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Class<android.os.Handler$Callback> r3 = android.os.Handler.Callback.class
            r5 = 1
            r2[r5] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            r6 = 2
            r2[r6] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            r1[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            r2 = 0
            r1[r5] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            r1[r6] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            return r0
        L35:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r7)
            return r0
        L3b:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r7)
            return r0
    }

    @Override // p211m.AbstractC4310c
    /* renamed from: d */
    public void mo9634d(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f17579b
            r0.execute(r2)
            return
    }

    @Override // p211m.AbstractC4310c
    /* renamed from: f */
    public boolean mo9635f() {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // p211m.AbstractC4310c
    /* renamed from: g */
    public void mo9636g(java.lang.Runnable r3) {
            r2 = this;
            android.os.Handler r0 = r2.f17580c
            if (r0 != 0) goto L1a
            java.lang.Object r0 = r2.f17578a
            monitor-enter(r0)
            android.os.Handler r1 = r2.f17580c     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L15
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L17
            android.os.Handler r1 = m9637j(r1)     // Catch: java.lang.Throwable -> L17
            r2.f17580c = r1     // Catch: java.lang.Throwable -> L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
        L1a:
            android.os.Handler r0 = r2.f17580c
            r0.post(r3)
            return
    }
}
