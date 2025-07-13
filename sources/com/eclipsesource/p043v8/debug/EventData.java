package com.eclipsesource.p043v8.debug;

/* loaded from: classes.dex */
public class EventData implements com.eclipsesource.p043v8.Releasable {
    public com.eclipsesource.p043v8.V8Object v8Object;

    public EventData(com.eclipsesource.p043v8.V8Object r1) {
            r0 = this;
            r0.<init>()
            com.eclipsesource.v8.V8Object r1 = r1.twin()
            r0.v8Object = r1
            return
    }

    @Override // com.eclipsesource.p043v8.Releasable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            com.eclipsesource.v8.V8Object r0 = r1.v8Object
            boolean r0 = r0.isReleased()
            if (r0 != 0) goto Ld
            com.eclipsesource.v8.V8Object r0 = r1.v8Object
            r0.close()
        Ld:
            return
    }

    @Override // com.eclipsesource.p043v8.Releasable
    @java.lang.Deprecated
    public void release() {
            r0 = this;
            r0.close()
            return
    }
}
