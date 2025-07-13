package com.eclipsesource.p043v8.debug;

/* loaded from: classes.dex */
public class ExecutionState implements com.eclipsesource.p043v8.Releasable {
    private static final java.lang.String FRAME = "frame";
    private static final java.lang.String FRAME_COUNT = "frameCount";
    private static final java.lang.String PREPARE_STEP = "prepareStep";
    private com.eclipsesource.p043v8.V8Object v8Object;

    public ExecutionState(com.eclipsesource.p043v8.V8Object r1) {
            r0 = this;
            r0.<init>()
            com.eclipsesource.v8.V8Object r1 = r1.twin()
            r0.v8Object = r1
            return
    }

    @Override // com.eclipsesource.p043v8.Releasable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            com.eclipsesource.v8.V8Object r0 = r1.v8Object
            if (r0 == 0) goto L12
            boolean r0 = r0.isReleased()
            if (r0 != 0) goto L12
            com.eclipsesource.v8.V8Object r0 = r1.v8Object
            r0.close()
            r0 = 0
            r1.v8Object = r0
        L12:
            return
    }

    public com.eclipsesource.p043v8.debug.mirror.Frame getFrame(int r4) {
            r3 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8Object r1 = r3.v8Object
            com.eclipsesource.v8.V8 r1 = r1.getRuntime()
            r0.<init>(r1)
            r0.push(r4)
            r4 = 0
            com.eclipsesource.v8.V8Object r1 = r3.v8Object     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "frame"
            com.eclipsesource.v8.V8Object r4 = r1.executeObjectFunction(r2, r0)     // Catch: java.lang.Throwable -> L25
            com.eclipsesource.v8.debug.mirror.Frame r1 = new com.eclipsesource.v8.debug.mirror.Frame     // Catch: java.lang.Throwable -> L25
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L25
            r0.close()
            if (r4 == 0) goto L24
            r4.close()
        L24:
            return r1
        L25:
            r1 = move-exception
            r0.close()
            if (r4 == 0) goto L2e
            r4.close()
        L2e:
            throw r1
    }

    public int getFrameCount() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.v8Object
            java.lang.String r1 = "frameCount"
            r2 = 0
            int r0 = r0.executeIntegerFunction(r1, r2)
            return r0
    }

    public void prepareStep(com.eclipsesource.p043v8.debug.StepAction r3) {
            r2 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8Object r1 = r2.v8Object
            com.eclipsesource.v8.V8 r1 = r1.getRuntime()
            r0.<init>(r1)
            int r3 = r3.index
            r0.push(r3)
            com.eclipsesource.v8.V8Object r3 = r2.v8Object     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "prepareStep"
            r3.executeVoidFunction(r1, r0)     // Catch: java.lang.Throwable -> L1b
            r0.close()
            return
        L1b:
            r3 = move-exception
            r0.close()
            throw r3
    }

    @Override // com.eclipsesource.p043v8.Releasable
    @java.lang.Deprecated
    public void release() {
            r0 = this;
            r0.close()
            return
    }
}
