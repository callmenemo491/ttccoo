package com.eclipsesource.p043v8.utils;

/* loaded from: classes.dex */
public class ArrayBuffer {
    private com.eclipsesource.p043v8.V8ArrayBuffer arrayBuffer;

    public ArrayBuffer(com.eclipsesource.p043v8.C1032V8 r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r1.<init>()
            com.eclipsesource.v8.V8ArrayBuffer r0 = new com.eclipsesource.v8.V8ArrayBuffer
            r0.<init>(r2, r3)
            com.eclipsesource.v8.V8ArrayBuffer r2 = r0.twin()     // Catch: java.lang.Throwable -> L18
            com.eclipsesource.v8.V8Value r2 = r2.setWeak()     // Catch: java.lang.Throwable -> L18
            com.eclipsesource.v8.V8ArrayBuffer r2 = (com.eclipsesource.p043v8.V8ArrayBuffer) r2     // Catch: java.lang.Throwable -> L18
            r1.arrayBuffer = r2     // Catch: java.lang.Throwable -> L18
            r0.close()
            return
        L18:
            r2 = move-exception
            r0.close()
            throw r2
    }

    public ArrayBuffer(com.eclipsesource.p043v8.V8ArrayBuffer r1) {
            r0 = this;
            r0.<init>()
            com.eclipsesource.v8.V8ArrayBuffer r1 = r1.twin()
            com.eclipsesource.v8.V8Value r1 = r1.setWeak()
            com.eclipsesource.v8.V8ArrayBuffer r1 = (com.eclipsesource.p043v8.V8ArrayBuffer) r1
            r0.arrayBuffer = r1
            return
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer getV8ArrayBuffer() {
            r1 = this;
            com.eclipsesource.v8.V8ArrayBuffer r0 = r1.arrayBuffer
            com.eclipsesource.v8.V8ArrayBuffer r0 = r0.twin()
            return r0
    }

    public boolean isAvailable() {
            r1 = this;
            com.eclipsesource.v8.V8ArrayBuffer r0 = r1.arrayBuffer
            boolean r0 = r0.isReleased()
            r0 = r0 ^ 1
            return r0
    }
}
