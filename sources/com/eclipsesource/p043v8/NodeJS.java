package com.eclipsesource.p043v8;

/* loaded from: classes.dex */
public class NodeJS {
    private static final java.lang.String GLOBAL = "global";
    private static final java.lang.String NEXT_TICK = "nextTick";
    private static final java.lang.String NODE = "node";
    private static final java.lang.String PROCESS = "process";
    private static final java.lang.String STARTUP_CALLBACK = "__run";
    private static final java.lang.String STARTUP_SCRIPT = "global.__run(require, exports, module, __filename, __dirname);";
    private static final java.lang.String STARTUP_SCRIPT_NAME = "startup";
    private static final java.lang.String TMP_JS_EXT = ".js.tmp";
    private static final java.lang.String VERSIONS = "versions";
    private java.lang.String nodeVersion;
    private com.eclipsesource.p043v8.V8Function require;

    /* renamed from: v8 */
    private com.eclipsesource.p043v8.C1032V8 f5224v8;



    private NodeJS(com.eclipsesource.p043v8.C1032V8 r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.nodeVersion = r0
            r1.f5224v8 = r2
            return
    }

    public static /* synthetic */ void access$000(com.eclipsesource.p043v8.NodeJS r0, com.eclipsesource.p043v8.V8Function r1) {
            r0.init(r1)
            return
    }

    public static /* synthetic */ com.eclipsesource.p043v8.C1032V8 access$100(com.eclipsesource.p043v8.NodeJS r0) {
            com.eclipsesource.v8.V8 r0 = r0.f5224v8
            return r0
    }

    public static /* synthetic */ com.eclipsesource.p043v8.V8Function access$200(com.eclipsesource.p043v8.NodeJS r0) {
            com.eclipsesource.v8.V8Function r0 = r0.require
            return r0
    }

    public static com.eclipsesource.p043v8.NodeJS createNodeJS() {
            r0 = 0
            com.eclipsesource.v8.NodeJS r0 = createNodeJS(r0)
            return r0
    }

    public static com.eclipsesource.p043v8.NodeJS createNodeJS(java.io.File r4) {
            java.lang.String r0 = "global"
            com.eclipsesource.v8.V8 r0 = com.eclipsesource.p043v8.C1032V8.createV8Runtime(r0)
            com.eclipsesource.v8.NodeJS r1 = new com.eclipsesource.v8.NodeJS
            r1.<init>(r0)
            com.eclipsesource.v8.NodeJS$1 r2 = new com.eclipsesource.v8.NodeJS$1
            r2.<init>(r1)
            java.lang.String r3 = "__run"
            r0.registerJavaMethod(r2, r3)
            java.lang.String r2 = "global.__run(require, exports, module, __filename, __dirname);"
            java.lang.String r3 = "startup"
            java.io.File r2 = createTemporaryScriptFile(r2, r3)     // Catch: java.io.IOException -> L32
            java.lang.String r3 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L2d
            r0.createNodeRuntime(r3)     // Catch: java.lang.Throwable -> L2d
            r2.delete()     // Catch: java.io.IOException -> L32
            if (r4 == 0) goto L2c
            r1.exec(r4)
        L2c:
            return r1
        L2d:
            r4 = move-exception
            r2.delete()     // Catch: java.io.IOException -> L32
            throw r4     // Catch: java.io.IOException -> L32
        L32:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
    }

    private com.eclipsesource.p043v8.V8Function createScriptExecutionCallback(java.io.File r4) {
            r3 = this;
            com.eclipsesource.v8.V8Function r0 = new com.eclipsesource.v8.V8Function
            com.eclipsesource.v8.V8 r1 = r3.f5224v8
            com.eclipsesource.v8.NodeJS$2 r2 = new com.eclipsesource.v8.NodeJS$2
            r2.<init>(r3, r4)
            r0.<init>(r1, r2)
            return r0
    }

    private static java.io.File createTemporaryScriptFile(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = ".js.tmp"
            java.io.File r3 = java.io.File.createTempFile(r3, r0)
            java.io.PrintWriter r0 = new java.io.PrintWriter
            java.lang.String r1 = "UTF-8"
            r0.<init>(r3, r1)
            r0.print(r2)     // Catch: java.lang.Throwable -> L14
            r0.close()
            return r3
        L14:
            r2 = move-exception
            r0.close()
            throw r2
    }

    private void init(com.eclipsesource.p043v8.V8Function r1) {
            r0 = this;
            r0.require = r1
            return
    }

    private void safeRelease(com.eclipsesource.p043v8.Releasable r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.release()
        L5:
            return
    }

    public void exec(java.io.File r6) {
            r5 = this;
            com.eclipsesource.v8.V8Function r6 = r5.createScriptExecutionCallback(r6)
            r0 = 0
            com.eclipsesource.v8.V8 r1 = r5.f5224v8     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "process"
            com.eclipsesource.v8.V8Object r1 = r1.getObject(r2)     // Catch: java.lang.Throwable -> L2d
            com.eclipsesource.v8.V8Array r2 = new com.eclipsesource.v8.V8Array     // Catch: java.lang.Throwable -> L28
            com.eclipsesource.v8.V8 r3 = r5.f5224v8     // Catch: java.lang.Throwable -> L28
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L28
            r2.push(r6)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = "nextTick"
            r1.executeObjectFunction(r0, r2)     // Catch: java.lang.Throwable -> L26
            r5.safeRelease(r1)
            r5.safeRelease(r2)
            r5.safeRelease(r6)
            return
        L26:
            r0 = move-exception
            goto L31
        L28:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L31
        L2d:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
        L31:
            r5.safeRelease(r1)
            r5.safeRelease(r2)
            r5.safeRelease(r6)
            throw r0
    }

    public java.lang.String getNodeVersion() {
            r4 = this;
            java.lang.String r0 = r4.nodeVersion
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            com.eclipsesource.v8.V8 r1 = r4.f5224v8     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "process"
            com.eclipsesource.v8.V8Object r1 = r1.getObject(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "versions"
            com.eclipsesource.v8.V8Object r0 = r1.getObject(r2)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "node"
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L25
            r4.nodeVersion = r2     // Catch: java.lang.Throwable -> L25
            r4.safeRelease(r1)
            r4.safeRelease(r0)
            java.lang.String r0 = r4.nodeVersion
            return r0
        L25:
            r2 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L2c
        L2a:
            r2 = move-exception
            r1 = r0
        L2c:
            r4.safeRelease(r0)
            r4.safeRelease(r1)
            throw r2
    }

    public com.eclipsesource.p043v8.C1032V8 getRuntime() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5224v8
            return r0
    }

    public boolean handleMessage() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5224v8
            r0.checkThread()
            com.eclipsesource.v8.V8 r0 = r1.f5224v8
            boolean r0 = r0.pumpMessageLoop()
            return r0
    }

    public boolean isRunning() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5224v8
            r0.checkThread()
            com.eclipsesource.v8.V8 r0 = r1.f5224v8
            boolean r0 = r0.isRunning()
            return r0
    }

    public void release() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5224v8
            r0.checkThread()
            com.eclipsesource.v8.V8Function r0 = r1.require
            boolean r0 = r0.isReleased()
            if (r0 != 0) goto L12
            com.eclipsesource.v8.V8Function r0 = r1.require
            r0.close()
        L12:
            com.eclipsesource.v8.V8 r0 = r1.f5224v8
            boolean r0 = r0.isReleased()
            if (r0 != 0) goto L1f
            com.eclipsesource.v8.V8 r0 = r1.f5224v8
            r0.close()
        L1f:
            return
    }

    public com.eclipsesource.p043v8.V8Object require(java.io.File r3) {
            r2 = this;
            com.eclipsesource.v8.V8 r0 = r2.f5224v8
            r0.checkThread()
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8 r1 = r2.f5224v8
            r0.<init>(r1)
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L20
            r0.push(r3)     // Catch: java.lang.Throwable -> L20
            com.eclipsesource.v8.V8Function r3 = r2.require     // Catch: java.lang.Throwable -> L20
            r1 = 0
            java.lang.Object r3 = r3.call(r1, r0)     // Catch: java.lang.Throwable -> L20
            com.eclipsesource.v8.V8Object r3 = (com.eclipsesource.p043v8.V8Object) r3     // Catch: java.lang.Throwable -> L20
            r0.close()
            return r3
        L20:
            r3 = move-exception
            r0.close()
            throw r3
    }
}
