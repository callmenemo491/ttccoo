package com.eclipsesource.p043v8.utils;

/* loaded from: classes.dex */
public class V8Thread extends java.lang.Thread {
    private com.eclipsesource.p043v8.C1032V8 runtime;
    private final com.eclipsesource.p043v8.utils.V8Runnable target;

    public V8Thread(com.eclipsesource.p043v8.utils.V8Runnable r1) {
            r0 = this;
            r0.<init>()
            r0.target = r1
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r3 = this;
            com.eclipsesource.v8.V8 r0 = com.eclipsesource.p043v8.C1032V8.createV8Runtime()
            r3.runtime = r0
            r1 = 0
            com.eclipsesource.v8.utils.V8Runnable r2 = r3.target     // Catch: java.lang.Throwable -> L25
            r2.run(r0)     // Catch: java.lang.Throwable -> L25
            monitor-enter(r3)
            com.eclipsesource.v8.V8 r0 = r3.runtime     // Catch: java.lang.Throwable -> L22
            com.eclipsesource.v8.V8Locker r0 = r0.getLocker()     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.hasLock()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L20
            com.eclipsesource.v8.V8 r0 = r3.runtime     // Catch: java.lang.Throwable -> L22
            r0.close()     // Catch: java.lang.Throwable -> L22
            r3.runtime = r1     // Catch: java.lang.Throwable -> L22
        L20:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r0
        L25:
            r0 = move-exception
            monitor-enter(r3)
            com.eclipsesource.v8.V8 r2 = r3.runtime     // Catch: java.lang.Throwable -> L3c
            com.eclipsesource.v8.V8Locker r2 = r2.getLocker()     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r2.hasLock()     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L3a
            com.eclipsesource.v8.V8 r2 = r3.runtime     // Catch: java.lang.Throwable -> L3c
            r2.close()     // Catch: java.lang.Throwable -> L3c
            r3.runtime = r1     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            throw r0
        L3c:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            throw r0
    }
}
