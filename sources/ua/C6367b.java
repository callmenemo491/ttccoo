package ua;

/* renamed from: ua.b */
/* loaded from: classes.dex */
public class C6367b implements ua.InterfaceC6369d {

    /* renamed from: b */
    public static final /* synthetic */ int f24835b = 0;

    /* renamed from: a */
    public p392wa.InterfaceC6823b<ua.C6370e> f24836a;

    public C6367b(android.content.Context r10, java.util.Set<ua.InterfaceC6368c> r11) {
            r9 = this;
            y9.o r11 = new y9.o
            y9.e r0 = new y9.e
            r0.<init>(r10)
            r11.<init>(r0)
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue
            r7.<init>()
            ua.a r8 = ua.ThreadFactoryC6366a.f24834a
            r2 = 0
            r3 = 1
            r4 = 30
            r1.<init>(r2, r3, r4, r6, r7, r8)
            r9.<init>()
            r9.f24836a = r11
            return
    }

    @Override // ua.InterfaceC6369d
    /* renamed from: a */
    public int mo13015a(java.lang.String r5) {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            wa.b<ua.e> r2 = r4.f24836a
            java.lang.Object r2 = r2.get()
            ua.e r2 = (ua.C6370e) r2
            boolean r5 = r2.m13016a(r5, r0)
            wa.b<ua.e> r2 = r4.f24836a
            java.lang.Object r2 = r2.get()
            ua.e r2 = (ua.C6370e) r2
            monitor-enter(r2)
            java.lang.String r3 = "fire-global"
            boolean r0 = r2.m13016a(r3, r0)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r2)
            if (r5 == 0) goto L26
            if (r0 == 0) goto L26
            r5 = 4
            return r5
        L26:
            if (r0 == 0) goto L2a
            r5 = 3
            return r5
        L2a:
            if (r5 == 0) goto L2e
            r5 = 2
            return r5
        L2e:
            r5 = 1
            return r5
        L30:
            r5 = move-exception
            monitor-exit(r2)
            throw r5
    }
}
