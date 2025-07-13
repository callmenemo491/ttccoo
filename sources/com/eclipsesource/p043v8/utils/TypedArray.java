package com.eclipsesource.p043v8.utils;

/* loaded from: classes.dex */
public class TypedArray {
    private com.eclipsesource.p043v8.V8TypedArray typedArray;

    public TypedArray(com.eclipsesource.p043v8.C1032V8 r8, com.eclipsesource.p043v8.utils.ArrayBuffer r9, int r10, int r11, int r12) {
            r7 = this;
            r7.<init>()
            com.eclipsesource.v8.V8ArrayBuffer r9 = r9.getV8ArrayBuffer()
            com.eclipsesource.v8.V8TypedArray r6 = new com.eclipsesource.v8.V8TypedArray
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            com.eclipsesource.v8.V8Array r8 = r6.twin()     // Catch: java.lang.Throwable -> L25
            com.eclipsesource.v8.V8Value r8 = r8.setWeak()     // Catch: java.lang.Throwable -> L25
            com.eclipsesource.v8.V8TypedArray r8 = (com.eclipsesource.p043v8.V8TypedArray) r8     // Catch: java.lang.Throwable -> L25
            r7.typedArray = r8     // Catch: java.lang.Throwable -> L25
            r9.close()
            r6.close()
            return
        L25:
            r8 = move-exception
            r9.close()
            r6.close()
            throw r8
    }

    public TypedArray(com.eclipsesource.p043v8.V8TypedArray r1) {
            r0 = this;
            r0.<init>()
            com.eclipsesource.v8.V8Array r1 = r1.twin()
            com.eclipsesource.v8.V8Value r1 = r1.setWeak()
            com.eclipsesource.v8.V8TypedArray r1 = (com.eclipsesource.p043v8.V8TypedArray) r1
            r0.typedArray = r1
            return
    }

    public com.eclipsesource.p043v8.V8TypedArray getV8TypedArray() {
            r1 = this;
            com.eclipsesource.v8.V8TypedArray r0 = r1.typedArray
            com.eclipsesource.v8.V8Array r0 = r0.twin()
            com.eclipsesource.v8.V8TypedArray r0 = (com.eclipsesource.p043v8.V8TypedArray) r0
            return r0
    }

    public boolean isAvailable() {
            r1 = this;
            com.eclipsesource.v8.V8TypedArray r0 = r1.typedArray
            boolean r0 = r0.isReleased()
            r0 = r0 ^ 1
            return r0
    }
}
