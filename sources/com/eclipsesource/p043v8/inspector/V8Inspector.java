package com.eclipsesource.p043v8.inspector;

/* loaded from: classes.dex */
public class V8Inspector {
    private java.util.List<com.eclipsesource.p043v8.inspector.DebuggerConnectionListener> debuggerConnectionListeners;
    private long inspectorPtr;
    private com.eclipsesource.p043v8.C1032V8 runtime;
    private boolean waitingForConnection;

    public V8Inspector(com.eclipsesource.p043v8.C1032V8 r3, com.eclipsesource.p043v8.inspector.V8InspectorDelegate r4, java.lang.String r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.inspectorPtr = r0
            r0 = 1
            r2.waitingForConnection = r0
            r2.runtime = r3
            long r3 = r3.createInspector(r4, r5)
            r2.inspectorPtr = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.debuggerConnectionListeners = r3
            return
    }

    public static com.eclipsesource.p043v8.inspector.V8Inspector createV8Inspector(com.eclipsesource.p043v8.C1032V8 r2, com.eclipsesource.p043v8.inspector.V8InspectorDelegate r3) {
            com.eclipsesource.v8.inspector.V8Inspector r0 = new com.eclipsesource.v8.inspector.V8Inspector
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static com.eclipsesource.p043v8.inspector.V8Inspector createV8Inspector(com.eclipsesource.p043v8.C1032V8 r1, com.eclipsesource.p043v8.inspector.V8InspectorDelegate r2, java.lang.String r3) {
            com.eclipsesource.v8.inspector.V8Inspector r0 = new com.eclipsesource.v8.inspector.V8Inspector
            r0.<init>(r1, r2, r3)
            return r0
    }

    private void verifyDebuggerConnection(java.lang.String r5) {
            r4 = this;
            r0 = 0
            com.eclipsesource.v8.V8 r1 = r4.runtime     // Catch: java.lang.Throwable -> L51
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r2.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = "JSON.parse(JSON.stringify("
            r2.append(r3)     // Catch: java.lang.Throwable -> L51
            r2.append(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = "))"
            r2.append(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L51
            com.eclipsesource.v8.V8Object r0 = r1.executeObjectScript(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = "method"
            java.lang.String r5 = r0.getString(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = "Runtime.runIfWaitingForDebugger"
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L4d
            r5 = 0
            r4.waitingForConnection = r5     // Catch: java.lang.Throwable -> L51
            com.eclipsesource.v8.V8 r5 = r4.runtime     // Catch: java.lang.Throwable -> L51
            long r1 = r4.inspectorPtr     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = ""
            r5.schedulePauseOnNextStatement(r1, r3)     // Catch: java.lang.Throwable -> L51
            java.util.List<com.eclipsesource.v8.inspector.DebuggerConnectionListener> r5 = r4.debuggerConnectionListeners     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L51
        L3d:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L51
            com.eclipsesource.v8.inspector.DebuggerConnectionListener r1 = (com.eclipsesource.p043v8.inspector.DebuggerConnectionListener) r1     // Catch: java.lang.Throwable -> L51
            r1.onDebuggerConnected()     // Catch: java.lang.Throwable -> L51
            goto L3d
        L4d:
            r0.close()
            return
        L51:
            r5 = move-exception
            if (r0 == 0) goto L57
            r0.close()
        L57:
            throw r5
    }

    public void addDebuggerConnectionListener(com.eclipsesource.p043v8.inspector.DebuggerConnectionListener r2) {
            r1 = this;
            java.util.List<com.eclipsesource.v8.inspector.DebuggerConnectionListener> r0 = r1.debuggerConnectionListeners
            r0.add(r2)
            return
    }

    public void dispatchProtocolMessage(java.lang.String r4) {
            r3 = this;
            com.eclipsesource.v8.V8 r0 = r3.runtime     // Catch: java.lang.Exception -> Lf
            long r1 = r3.inspectorPtr     // Catch: java.lang.Exception -> Lf
            r0.dispatchProtocolMessage(r1, r4)     // Catch: java.lang.Exception -> Lf
            boolean r0 = r3.waitingForConnection     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto L13
            r3.verifyDebuggerConnection(r4)     // Catch: java.lang.Exception -> Lf
            goto L13
        Lf:
            r4 = move-exception
            r4.printStackTrace()
        L13:
            return
    }

    public void removeDebuggerConnectionListener(com.eclipsesource.p043v8.inspector.DebuggerConnectionListener r2) {
            r1 = this;
            java.util.List<com.eclipsesource.v8.inspector.DebuggerConnectionListener> r0 = r1.debuggerConnectionListeners
            r0.remove(r2)
            return
    }
}
