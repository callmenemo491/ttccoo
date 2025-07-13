package com.eclipsesource.p043v8.utils;

/* loaded from: classes.dex */
public class V8Executor extends java.lang.Thread {
    private java.lang.Exception exception;
    private volatile boolean forceTerminating;
    private boolean longRunning;
    private java.lang.String messageHandler;
    private java.util.LinkedList<java.lang.String[]> messageQueue;
    private java.lang.String result;
    private com.eclipsesource.p043v8.C1032V8 runtime;
    private final java.lang.String script;
    private volatile boolean shuttingDown;
    private volatile boolean terminated;

    public class ExecutorTermination implements com.eclipsesource.p043v8.JavaVoidCallback {
        public final /* synthetic */ com.eclipsesource.p043v8.utils.V8Executor this$0;

        public ExecutorTermination(com.eclipsesource.p043v8.utils.V8Executor r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.eclipsesource.p043v8.JavaVoidCallback
        public void invoke(com.eclipsesource.p043v8.V8Object r1, com.eclipsesource.p043v8.V8Array r2) {
                r0 = this;
                com.eclipsesource.v8.utils.V8Executor r1 = r0.this$0
                boolean r1 = com.eclipsesource.p043v8.utils.V8Executor.access$000(r1)
                if (r1 != 0) goto L9
                return
            L9:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "V8Thread Termination"
                r1.<init>(r2)
                throw r1
        }
    }

    public V8Executor(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public V8Executor(java.lang.String r2, boolean r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.terminated = r0
            r1.shuttingDown = r0
            r1.forceTerminating = r0
            r0 = 0
            r1.exception = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.messageQueue = r0
            r1.script = r2
            r1.longRunning = r3
            r1.messageHandler = r4
            return
    }

    public static /* synthetic */ boolean access$000(com.eclipsesource.p043v8.utils.V8Executor r0) {
            boolean r0 = r0.forceTerminating
            return r0
    }

    public void forceTermination() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.forceTerminating = r0     // Catch: java.lang.Throwable -> L12
            r1.shuttingDown = r0     // Catch: java.lang.Throwable -> L12
            com.eclipsesource.v8.V8 r0 = r1.runtime     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Ld
            r0.terminateExecution()     // Catch: java.lang.Throwable -> L12
        Ld:
            r1.notify()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    public java.lang.Exception getException() {
            r1 = this;
            java.lang.Exception r0 = r1.exception
            return r0
    }

    public java.lang.String getResult() {
            r1 = this;
            java.lang.String r0 = r1.result
            return r0
    }

    public boolean hasException() {
            r1 = this;
            java.lang.Exception r0 = r1.exception
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean hasTerminated() {
            r1 = this;
            boolean r0 = r1.terminated
            return r0
    }

    public boolean isShuttingDown() {
            r1 = this;
            boolean r0 = r1.shuttingDown
            return r0
    }

    public boolean isTerminating() {
            r1 = this;
            boolean r0 = r1.forceTerminating
            return r0
    }

    public void postMessage(java.lang.String... r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedList<java.lang.String[]> r0 = r1.messageQueue     // Catch: java.lang.Throwable -> Lb
            r0.add(r2)     // Catch: java.lang.Throwable -> Lb
            r1.notify()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r8 = this;
            monitor-enter(r8)
            com.eclipsesource.v8.V8 r0 = com.eclipsesource.p043v8.C1032V8.createV8Runtime()     // Catch: java.lang.Throwable -> L12d
            r8.runtime = r0     // Catch: java.lang.Throwable -> L12d
            com.eclipsesource.v8.utils.V8Executor$ExecutorTermination r1 = new com.eclipsesource.v8.utils.V8Executor$ExecutorTermination     // Catch: java.lang.Throwable -> L12d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L12d
            java.lang.String r2 = "__j2v8__checkThreadTerminate"
            r0.registerJavaMethod(r1, r2)     // Catch: java.lang.Throwable -> L12d
            com.eclipsesource.v8.V8 r0 = r8.runtime     // Catch: java.lang.Throwable -> L12d
            r8.setup(r0)     // Catch: java.lang.Throwable -> L12d
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12d
            r0 = 0
            r1 = 1
            boolean r2 = r8.forceTerminating     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            if (r2 != 0) goto L4c
            com.eclipsesource.v8.V8 r2 = r8.runtime     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            r3.<init>()     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            java.lang.String r4 = "__j2v8__checkThreadTerminate();\n"
            r3.append(r4)     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            java.lang.String r4 = r8.script     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            r3.append(r4)     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            java.lang.String r4 = r8.getName()     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            r5 = -1
            java.lang.Object r2 = r2.executeScript(r3, r4, r5)     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            if (r2 == 0) goto L43
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            r8.result = r3     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
        L43:
            boolean r3 = r2 instanceof com.eclipsesource.p043v8.Releasable     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            if (r3 == 0) goto L4c
            com.eclipsesource.v8.Releasable r2 = (com.eclipsesource.p043v8.Releasable) r2     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            r2.release()     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
        L4c:
            boolean r2 = r8.forceTerminating     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            if (r2 != 0) goto Ld7
            boolean r2 = r8.longRunning     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            if (r2 == 0) goto Ld7
            monitor-enter(r8)     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            java.util.LinkedList<java.lang.String[]> r2 = r8.messageQueue     // Catch: java.lang.Throwable -> Ld4
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Ld4
            if (r2 == 0) goto L64
            boolean r2 = r8.shuttingDown     // Catch: java.lang.Throwable -> Ld4
            if (r2 != 0) goto L64
            r8.wait()     // Catch: java.lang.Throwable -> Ld4
        L64:
            java.util.LinkedList<java.lang.String[]> r2 = r8.messageQueue     // Catch: java.lang.Throwable -> Ld4
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Ld4
            if (r2 == 0) goto L70
            boolean r2 = r8.shuttingDown     // Catch: java.lang.Throwable -> Ld4
            if (r2 != 0) goto L74
        L70:
            boolean r2 = r8.forceTerminating     // Catch: java.lang.Throwable -> Ld4
            if (r2 == 0) goto L90
        L74:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld4
            monitor-enter(r8)
            com.eclipsesource.v8.V8 r2 = r8.runtime     // Catch: java.lang.Throwable -> L8d
            com.eclipsesource.v8.V8Locker r2 = r2.getLocker()     // Catch: java.lang.Throwable -> L8d
            boolean r2 = r2.hasLock()     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L89
            com.eclipsesource.v8.V8 r2 = r8.runtime     // Catch: java.lang.Throwable -> L8d
            r2.close()     // Catch: java.lang.Throwable -> L8d
            r8.runtime = r0     // Catch: java.lang.Throwable -> L8d
        L89:
            r8.terminated = r1     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L8d
            return
        L8d:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L8d
            throw r0
        L90:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld4
            java.util.LinkedList<java.lang.String[]> r2 = r8.messageQueue     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            if (r2 != 0) goto L4c
            java.util.LinkedList<java.lang.String[]> r2 = r8.messageQueue     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            r3 = 0
            java.lang.Object r2 = r2.remove(r3)     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            com.eclipsesource.v8.V8Array r4 = new com.eclipsesource.v8.V8Array     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            com.eclipsesource.v8.V8 r5 = r8.runtime     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            com.eclipsesource.v8.V8Array r5 = new com.eclipsesource.v8.V8Array     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            com.eclipsesource.v8.V8 r6 = r8.runtime     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            int r6 = r2.length     // Catch: java.lang.Throwable -> Lcc
        Lb1:
            if (r3 >= r6) goto Lbb
            r7 = r2[r3]     // Catch: java.lang.Throwable -> Lcc
            r5.push(r7)     // Catch: java.lang.Throwable -> Lcc
            int r3 = r3 + 1
            goto Lb1
        Lbb:
            r4.push(r5)     // Catch: java.lang.Throwable -> Lcc
            com.eclipsesource.v8.V8 r2 = r8.runtime     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r3 = r8.messageHandler     // Catch: java.lang.Throwable -> Lcc
            r2.executeVoidFunction(r3, r4)     // Catch: java.lang.Throwable -> Lcc
            r5.close()     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            r4.close()     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            goto L4c
        Lcc:
            r2 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            r4.close()     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
            throw r2     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
        Ld4:
            r2 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld4
            throw r2     // Catch: java.lang.Throwable -> Lf2 java.lang.Exception -> Lf4
        Ld7:
            monitor-enter(r8)
            com.eclipsesource.v8.V8 r2 = r8.runtime     // Catch: java.lang.Throwable -> Lef
            com.eclipsesource.v8.V8Locker r2 = r2.getLocker()     // Catch: java.lang.Throwable -> Lef
            boolean r2 = r2.hasLock()     // Catch: java.lang.Throwable -> Lef
            if (r2 == 0) goto Leb
            com.eclipsesource.v8.V8 r2 = r8.runtime     // Catch: java.lang.Throwable -> Lef
            r2.close()     // Catch: java.lang.Throwable -> Lef
            r8.runtime = r0     // Catch: java.lang.Throwable -> Lef
        Leb:
            r8.terminated = r1     // Catch: java.lang.Throwable -> Lef
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lef
            goto L10e
        Lef:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lef
            throw r0
        Lf2:
            r2 = move-exception
            goto L112
        Lf4:
            r2 = move-exception
            r8.exception = r2     // Catch: java.lang.Throwable -> Lf2
            monitor-enter(r8)
            com.eclipsesource.v8.V8 r2 = r8.runtime     // Catch: java.lang.Throwable -> L10f
            com.eclipsesource.v8.V8Locker r2 = r2.getLocker()     // Catch: java.lang.Throwable -> L10f
            boolean r2 = r2.hasLock()     // Catch: java.lang.Throwable -> L10f
            if (r2 == 0) goto L10b
            com.eclipsesource.v8.V8 r2 = r8.runtime     // Catch: java.lang.Throwable -> L10f
            r2.close()     // Catch: java.lang.Throwable -> L10f
            r8.runtime = r0     // Catch: java.lang.Throwable -> L10f
        L10b:
            r8.terminated = r1     // Catch: java.lang.Throwable -> L10f
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L10f
        L10e:
            return
        L10f:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L10f
            throw r0
        L112:
            monitor-enter(r8)
            com.eclipsesource.v8.V8 r3 = r8.runtime     // Catch: java.lang.Throwable -> L12a
            com.eclipsesource.v8.V8Locker r3 = r3.getLocker()     // Catch: java.lang.Throwable -> L12a
            boolean r3 = r3.hasLock()     // Catch: java.lang.Throwable -> L12a
            if (r3 == 0) goto L126
            com.eclipsesource.v8.V8 r3 = r8.runtime     // Catch: java.lang.Throwable -> L12a
            r3.close()     // Catch: java.lang.Throwable -> L12a
            r8.runtime = r0     // Catch: java.lang.Throwable -> L12a
        L126:
            r8.terminated = r1     // Catch: java.lang.Throwable -> L12a
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12a
            throw r2
        L12a:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12a
            throw r0
        L12d:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12d
            throw r0
    }

    public void setup(com.eclipsesource.p043v8.C1032V8 r1) {
            r0 = this;
            return
    }

    public void shutdown() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.shuttingDown = r0     // Catch: java.lang.Throwable -> L9
            r1.notify()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }
}
