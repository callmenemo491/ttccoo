package com.eclipsesource.p043v8;

/* loaded from: classes.dex */
public class V8Locker {
    private boolean released;
    private com.eclipsesource.p043v8.C1032V8 runtime;
    private java.lang.Thread thread;

    public V8Locker(com.eclipsesource.p043v8.C1032V8 r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.thread = r0
            r0 = 0
            r1.released = r0
            r1.runtime = r2
            r1.acquire()
            return
    }

    public synchronized void acquire() {
            r3 = this;
            monitor-enter(r3)
            java.lang.Thread r0 = r3.thread     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L31
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L4f
            if (r0 != r1) goto Lc
            goto L31
        Lc:
            java.lang.Error r0 = new java.lang.Error     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r1.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "Invalid V8 thread access: current thread is "
            r1.append(r2)     // Catch: java.lang.Throwable -> L4f
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L4f
            r1.append(r2)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = " while the locker has thread "
            r1.append(r2)     // Catch: java.lang.Throwable -> L4f
            java.lang.Thread r2 = r3.thread     // Catch: java.lang.Throwable -> L4f
            r1.append(r2)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4f
            throw r0     // Catch: java.lang.Throwable -> L4f
        L31:
            java.lang.Thread r0 = r3.thread     // Catch: java.lang.Throwable -> L4f
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L4f
            if (r0 != r1) goto L3b
            monitor-exit(r3)
            return
        L3b:
            com.eclipsesource.v8.V8 r0 = r3.runtime     // Catch: java.lang.Throwable -> L4f
            long r1 = r0.getV8RuntimePtr()     // Catch: java.lang.Throwable -> L4f
            r0.acquireLock(r1)     // Catch: java.lang.Throwable -> L4f
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L4f
            r3.thread = r0     // Catch: java.lang.Throwable -> L4f
            r0 = 0
            r3.released = r0     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r3)
            return
        L4f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public void checkThread() {
            r3 = this;
            boolean r0 = r3.released
            if (r0 == 0) goto L11
            java.lang.Thread r0 = r3.thread
            if (r0 == 0) goto L9
            goto L11
        L9:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "Invalid V8 thread access: the locker has been released!"
            r0.<init>(r1)
            throw r0
        L11:
            java.lang.Thread r0 = r3.thread
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L1a
            return
        L1a:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "Invalid V8 thread access: current thread is "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r1.append(r2)
            java.lang.String r2 = " while the locker has thread "
            r1.append(r2)
            java.lang.Thread r2 = r3.thread
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public java.lang.Thread getThread() {
            r1 = this;
            java.lang.Thread r0 = r1.thread
            return r0
    }

    public boolean hasLock() {
            r2 = this;
            java.lang.Thread r0 = r2.thread
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public synchronized void release() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.released     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L9
            java.lang.Thread r0 = r3.thread     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L11
        L9:
            com.eclipsesource.v8.V8 r0 = r3.runtime     // Catch: java.lang.Throwable -> L27
            boolean r0 = r0.isReleased()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L13
        L11:
            monitor-exit(r3)
            return
        L13:
            r3.checkThread()     // Catch: java.lang.Throwable -> L27
            com.eclipsesource.v8.V8 r0 = r3.runtime     // Catch: java.lang.Throwable -> L27
            long r1 = r0.getV8RuntimePtr()     // Catch: java.lang.Throwable -> L27
            r0.releaseLock(r1)     // Catch: java.lang.Throwable -> L27
            r0 = 0
            r3.thread = r0     // Catch: java.lang.Throwable -> L27
            r0 = 1
            r3.released = r0     // Catch: java.lang.Throwable -> L27
            monitor-exit(r3)
            return
        L27:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public synchronized boolean tryAcquire() {
            r6 = this;
            monitor-enter(r6)
            java.lang.Thread r0 = r6.thread     // Catch: java.lang.Throwable -> L2c
            r1 = 0
            if (r0 == 0) goto Le
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2c
            if (r0 == r2) goto Le
            monitor-exit(r6)
            return r1
        Le:
            java.lang.Thread r0 = r6.thread     // Catch: java.lang.Throwable -> L2c
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2c
            r3 = 1
            if (r0 != r2) goto L19
            monitor-exit(r6)
            return r3
        L19:
            com.eclipsesource.v8.V8 r0 = r6.runtime     // Catch: java.lang.Throwable -> L2c
            long r4 = r0.getV8RuntimePtr()     // Catch: java.lang.Throwable -> L2c
            r0.acquireLock(r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2c
            r6.thread = r0     // Catch: java.lang.Throwable -> L2c
            r6.released = r1     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r6)
            return r3
        L2c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }
}
