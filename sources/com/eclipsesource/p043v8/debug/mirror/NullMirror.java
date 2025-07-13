package com.eclipsesource.p043v8.debug.mirror;

/* loaded from: classes.dex */
public class NullMirror extends com.eclipsesource.p043v8.debug.mirror.ValueMirror {
    public NullMirror(com.eclipsesource.p043v8.V8Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.eclipsesource.p043v8.debug.mirror.Mirror
    public boolean isNull() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.eclipsesource.p043v8.debug.mirror.Mirror
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "null"
            return r0
    }
}
