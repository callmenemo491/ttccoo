package com.eclipsesource.p043v8.debug.mirror;

/* loaded from: classes.dex */
public class FunctionMirror extends com.eclipsesource.p043v8.debug.mirror.ObjectMirror {
    private static final java.lang.String NAME = "name";
    private static final java.lang.String SCRIPT = "script";

    public FunctionMirror(com.eclipsesource.p043v8.V8Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.lang.String getName() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.v8Object
            java.lang.String r1 = "name"
            r2 = 0
            java.lang.String r0 = r0.executeStringFunction(r1, r2)
            return r0
    }

    public java.lang.String getScriptName() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.v8Object
            java.lang.String r1 = "script"
            r2 = 0
            com.eclipsesource.v8.V8Object r0 = r0.executeObjectFunction(r1, r2)
            java.lang.String r1 = "name"
            java.lang.String r1 = r0.executeStringFunction(r1, r2)     // Catch: java.lang.Throwable -> L13
            r0.close()
            return r1
        L13:
            r1 = move-exception
            r0.close()
            throw r1
    }

    @Override // com.eclipsesource.p043v8.debug.mirror.Mirror
    public boolean isFunction() {
            r1 = this;
            r0 = 1
            return r0
    }
}
