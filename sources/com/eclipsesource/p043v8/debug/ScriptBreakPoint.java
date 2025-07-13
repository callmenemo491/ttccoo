package com.eclipsesource.p043v8.debug;

/* loaded from: classes.dex */
public class ScriptBreakPoint implements com.eclipsesource.p043v8.Releasable {
    private static final java.lang.String CONDITION = "condition";
    private static final java.lang.String LINE = "line";
    private static final java.lang.String NUMBER = "number";
    private static final java.lang.String SET_CONDITION = "setCondition";
    private com.eclipsesource.p043v8.V8Object v8Object;

    public ScriptBreakPoint(com.eclipsesource.p043v8.V8Object r1) {
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

    public int getBreakPointNumber() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.v8Object
            java.lang.String r1 = "number"
            r2 = 0
            int r0 = r0.executeIntegerFunction(r1, r2)
            return r0
    }

    public java.lang.String getCondition() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.v8Object     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> La
            java.lang.String r1 = "condition"
            r2 = 0
            java.lang.String r0 = r0.executeStringFunction(r1, r2)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> La
            return r0
        La:
            java.lang.String r0 = "undefined"
            return r0
    }

    public int getLine() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.v8Object
            java.lang.String r1 = "line"
            r2 = 0
            int r0 = r0.executeIntegerFunction(r1, r2)
            return r0
    }

    @Override // com.eclipsesource.p043v8.Releasable
    public void release() {
            r0 = this;
            r0.close()
            return
    }

    public void setCondition(java.lang.String r3) {
            r2 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8Object r1 = r2.v8Object
            com.eclipsesource.v8.V8 r1 = r1.getRuntime()
            r0.<init>(r1)
            r0.push(r3)
            com.eclipsesource.v8.V8Object r3 = r2.v8Object     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "setCondition"
            r3.executeVoidFunction(r1, r0)     // Catch: java.lang.Throwable -> L19
            r0.close()
            return
        L19:
            r3 = move-exception
            r0.close()
            throw r3
    }
}
