package com.eclipsesource.p043v8.debug.mirror;

/* loaded from: classes.dex */
public class ArrayMirror extends com.eclipsesource.p043v8.debug.mirror.ObjectMirror {
    private static final java.lang.String LENGTH = "length";

    public ArrayMirror(com.eclipsesource.p043v8.V8Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.eclipsesource.p043v8.debug.mirror.Mirror
    public boolean isArray() {
            r1 = this;
            r0 = 1
            return r0
    }

    public int length() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.v8Object
            java.lang.String r1 = "length"
            r2 = 0
            int r0 = r0.executeIntegerFunction(r1, r2)
            return r0
    }
}
