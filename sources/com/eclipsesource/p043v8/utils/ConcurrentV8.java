package com.eclipsesource.p043v8.utils;

/* loaded from: classes.dex */
public final class ConcurrentV8 {

    /* renamed from: v8 */
    private com.eclipsesource.p043v8.C1032V8 f5227v8;


    public ConcurrentV8() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f5227v8 = r0
            com.eclipsesource.v8.V8 r0 = com.eclipsesource.p043v8.C1032V8.createV8Runtime()
            r1.f5227v8 = r0
            com.eclipsesource.v8.V8Locker r0 = r0.getLocker()
            r0.release()
            return
    }

    public com.eclipsesource.p043v8.C1032V8 getV8() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5227v8
            return r0
    }

    public void release() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5227v8
            if (r0 == 0) goto L12
            boolean r0 = r0.isReleased()
            if (r0 != 0) goto L12
            com.eclipsesource.v8.utils.ConcurrentV8$1 r0 = new com.eclipsesource.v8.utils.ConcurrentV8$1
            r0.<init>(r1)
            r1.run(r0)
        L12:
            return
    }

    public synchronized void run(com.eclipsesource.p043v8.utils.V8Runnable r2) {
            r1 = this;
            monitor-enter(r1)
            com.eclipsesource.v8.V8 r0 = r1.f5227v8     // Catch: java.lang.Throwable -> L30
            com.eclipsesource.v8.V8Locker r0 = r0.getLocker()     // Catch: java.lang.Throwable -> L30
            r0.acquire()     // Catch: java.lang.Throwable -> L30
            com.eclipsesource.v8.V8 r0 = r1.f5227v8     // Catch: java.lang.Throwable -> L30
            r2.run(r0)     // Catch: java.lang.Throwable -> L30
            com.eclipsesource.v8.V8 r2 = r1.f5227v8     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L2e
            com.eclipsesource.v8.V8Locker r2 = r2.getLocker()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L2e
            com.eclipsesource.v8.V8 r2 = r1.f5227v8     // Catch: java.lang.Throwable -> L51
            com.eclipsesource.v8.V8Locker r2 = r2.getLocker()     // Catch: java.lang.Throwable -> L51
            boolean r2 = r2.hasLock()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L2e
            com.eclipsesource.v8.V8 r2 = r1.f5227v8     // Catch: java.lang.Throwable -> L51
            com.eclipsesource.v8.V8Locker r2 = r2.getLocker()     // Catch: java.lang.Throwable -> L51
            r2.release()     // Catch: java.lang.Throwable -> L51
        L2e:
            monitor-exit(r1)
            return
        L30:
            r2 = move-exception
            com.eclipsesource.v8.V8 r0 = r1.f5227v8     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L50
            com.eclipsesource.v8.V8Locker r0 = r0.getLocker()     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L50
            com.eclipsesource.v8.V8 r0 = r1.f5227v8     // Catch: java.lang.Throwable -> L51
            com.eclipsesource.v8.V8Locker r0 = r0.getLocker()     // Catch: java.lang.Throwable -> L51
            boolean r0 = r0.hasLock()     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L50
            com.eclipsesource.v8.V8 r0 = r1.f5227v8     // Catch: java.lang.Throwable -> L51
            com.eclipsesource.v8.V8Locker r0 = r0.getLocker()     // Catch: java.lang.Throwable -> L51
            r0.release()     // Catch: java.lang.Throwable -> L51
        L50:
            throw r2     // Catch: java.lang.Throwable -> L51
        L51:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
