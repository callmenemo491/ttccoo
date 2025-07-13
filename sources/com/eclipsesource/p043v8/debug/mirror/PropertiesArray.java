package com.eclipsesource.p043v8.debug.mirror;

/* loaded from: classes.dex */
public class PropertiesArray implements com.eclipsesource.p043v8.Releasable {
    private com.eclipsesource.p043v8.V8Array v8Array;

    public PropertiesArray(com.eclipsesource.p043v8.V8Array r1) {
            r0 = this;
            r0.<init>()
            com.eclipsesource.v8.V8Array r1 = r1.twin()
            r0.v8Array = r1
            return
    }

    @Override // com.eclipsesource.p043v8.Releasable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            com.eclipsesource.v8.V8Array r0 = r1.v8Array
            boolean r0 = r0.isReleased()
            if (r0 != 0) goto Ld
            com.eclipsesource.v8.V8Array r0 = r1.v8Array
            r0.close()
        Ld:
            return
    }

    public com.eclipsesource.p043v8.debug.mirror.PropertyMirror getProperty(int r2) {
            r1 = this;
            com.eclipsesource.v8.V8Array r0 = r1.v8Array
            com.eclipsesource.v8.V8Object r2 = r0.getObject(r2)
            com.eclipsesource.v8.debug.mirror.PropertyMirror r0 = new com.eclipsesource.v8.debug.mirror.PropertyMirror     // Catch: java.lang.Throwable -> Lf
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            r2.close()
            return r0
        Lf:
            r0 = move-exception
            r2.close()
            throw r0
    }

    public int length() {
            r1 = this;
            com.eclipsesource.v8.V8Array r0 = r1.v8Array
            int r0 = r0.length()
            return r0
    }

    @Override // com.eclipsesource.p043v8.Releasable
    @java.lang.Deprecated
    public void release() {
            r0 = this;
            r0.close()
            return
    }
}
