package com.eclipsesource.p043v8.debug.mirror;

/* loaded from: classes.dex */
public class ValueMirror extends com.eclipsesource.p043v8.debug.mirror.Mirror {
    private static final java.lang.String VALUE = "value";

    public ValueMirror(com.eclipsesource.p043v8.V8Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.lang.Object getValue() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.v8Object
            java.lang.String r1 = "value"
            r2 = 0
            java.lang.Object r0 = r0.executeFunction(r1, r2)
            return r0
    }

    @Override // com.eclipsesource.p043v8.debug.mirror.Mirror
    public boolean isValue() {
            r1 = this;
            r0 = 1
            return r0
    }
}
