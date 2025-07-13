package com.eclipsesource.p043v8.debug.mirror;

/* loaded from: classes.dex */
public class PropertyMirror extends com.eclipsesource.p043v8.debug.mirror.Mirror {
    public PropertyMirror(com.eclipsesource.p043v8.V8Object r1) {
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

    public com.eclipsesource.p043v8.debug.mirror.Mirror getValue() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.v8Object
            java.lang.String r1 = "value"
            r2 = 0
            com.eclipsesource.v8.V8Object r0 = r0.executeObjectFunction(r1, r2)
            com.eclipsesource.v8.debug.mirror.ValueMirror r1 = com.eclipsesource.p043v8.debug.mirror.Mirror.createMirror(r0)     // Catch: java.lang.Throwable -> L11
            r0.close()
            return r1
        L11:
            r1 = move-exception
            r0.close()
            throw r1
    }

    @Override // com.eclipsesource.p043v8.debug.mirror.Mirror
    public boolean isProperty() {
            r1 = this;
            r0 = 1
            return r0
    }
}
