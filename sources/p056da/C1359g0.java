package p056da;

/* renamed from: da.g0 */
/* loaded from: classes.dex */
public final class C1359g0 {
    /* renamed from: a */
    public static java.util.concurrent.ExecutorService m3874a(java.lang.String r16) {
            r6 = r16
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 1
            r0.<init>(r1)
            da.e0 r14 = new da.e0
            r14.<init>(r6, r0)
            java.util.concurrent.ThreadPoolExecutor$DiscardPolicy r15 = new java.util.concurrent.ThreadPoolExecutor$DiscardPolicy
            r15.<init>()
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r13 = new java.util.concurrent.LinkedBlockingQueue
            r13.<init>()
            r8 = 1
            r9 = 1
            r10 = 0
            r7 = r0
            r7.<init>(r8, r9, r10, r12, r13, r14, r15)
            java.util.concurrent.ExecutorService r7 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.Runtime r8 = java.lang.Runtime.getRuntime()
            java.lang.Thread r9 = new java.lang.Thread
            da.f0 r10 = new da.f0
            r3 = 2
            r0 = r10
            r1 = r16
            r2 = r7
            r0.<init>(r1, r2, r3, r5)
            java.lang.String r0 = "Crashlytics Shutdown Hook for "
            java.lang.String r0 = p064e.C1493g.m4049a(r0, r6)
            r9.<init>(r10, r0)
            r8.addShutdownHook(r9)
            return r7
    }
}
