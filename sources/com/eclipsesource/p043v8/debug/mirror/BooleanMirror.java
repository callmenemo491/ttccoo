package com.eclipsesource.p043v8.debug.mirror;

/* loaded from: classes.dex */
public class BooleanMirror extends com.eclipsesource.p043v8.debug.mirror.ValueMirror {
    public BooleanMirror(com.eclipsesource.p043v8.V8Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.eclipsesource.p043v8.debug.mirror.Mirror
    public boolean isBoolean() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.eclipsesource.p043v8.debug.mirror.Mirror
    public java.lang.String toString() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.v8Object
            java.lang.String r1 = "toText"
            r2 = 0
            java.lang.String r0 = r0.executeStringFunction(r1, r2)
            return r0
    }
}
