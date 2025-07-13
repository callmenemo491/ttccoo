package com.eclipsesource.p043v8.debug.mirror;

/* loaded from: classes.dex */
public class UndefinedMirror extends com.eclipsesource.p043v8.debug.mirror.ValueMirror {
    public UndefinedMirror(com.eclipsesource.p043v8.V8Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.eclipsesource.p043v8.debug.mirror.Mirror
    public boolean isUndefined() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.eclipsesource.p043v8.debug.mirror.Mirror
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "undefined"
            return r0
    }
}
