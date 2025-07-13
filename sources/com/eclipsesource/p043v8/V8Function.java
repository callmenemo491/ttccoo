package com.eclipsesource.p043v8;

/* loaded from: classes.dex */
public class V8Function extends com.eclipsesource.p043v8.V8Object {
    public V8Function(com.eclipsesource.p043v8.C1032V8 r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public V8Function(com.eclipsesource.p043v8.C1032V8 r1, com.eclipsesource.p043v8.JavaCallback r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public java.lang.Object call(com.eclipsesource.p043v8.V8Object r12, com.eclipsesource.p043v8.V8Array r13) {
            r11 = this;
            com.eclipsesource.v8.V8 r0 = r11.f5225v8
            r0.checkThread()
            r11.checkReleased()
            com.eclipsesource.v8.V8 r0 = r11.f5225v8
            r0.checkRuntime(r12)
            com.eclipsesource.v8.V8 r0 = r11.f5225v8
            r0.checkRuntime(r13)
            if (r12 == 0) goto L15
            goto L17
        L15:
            com.eclipsesource.v8.V8 r12 = r11.f5225v8
        L17:
            if (r13 != 0) goto L1c
            r0 = 0
            goto L20
        L1c:
            long r0 = r13.getHandle()
        L20:
            r9 = r0
            boolean r13 = r12.isUndefined()
            if (r13 == 0) goto L29
            com.eclipsesource.v8.V8 r12 = r11.f5225v8
        L29:
            long r12 = r12.getHandle()
            r5 = r12
            com.eclipsesource.v8.V8 r2 = r11.f5225v8
            long r3 = r2.getV8RuntimePtr()
            long r7 = r11.objectHandle
            java.lang.Object r12 = r2.executeFunction(r3, r5, r7, r9)
            return r12
    }

    @Override // com.eclipsesource.p043v8.V8Object, com.eclipsesource.p043v8.V8Value
    public com.eclipsesource.p043v8.V8Value createTwin() {
            r2 = this;
            com.eclipsesource.v8.V8Function r0 = new com.eclipsesource.v8.V8Function
            com.eclipsesource.v8.V8 r1 = r2.f5225v8
            r0.<init>(r1)
            return r0
    }

    @Override // com.eclipsesource.p043v8.V8Value
    public void initialize(long r3, java.lang.Object r5) {
            r2 = this;
            if (r5 != 0) goto L7
            r5 = 0
            super.initialize(r3, r5)
            return
        L7:
            com.eclipsesource.v8.JavaCallback r5 = (com.eclipsesource.p043v8.JavaCallback) r5
            com.eclipsesource.v8.V8 r0 = r2.f5225v8
            long[] r3 = r0.initNewV8Function(r3)
            com.eclipsesource.v8.V8 r4 = r2.f5225v8
            r0 = 1
            r0 = r3[r0]
            r4.m2799xdc233a4e(r5, r0)
            r4 = 0
            r2.released = r4
            r4 = r3[r4]
            r2.addObjectReference(r4)
            return
    }

    @Override // com.eclipsesource.p043v8.V8Object
    public java.lang.String toString() {
            r1 = this;
            boolean r0 = r1.released
            if (r0 != 0) goto L12
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            boolean r0 = r0.isReleased()
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            java.lang.String r0 = super.toString()
            return r0
        L12:
            java.lang.String r0 = "[Function released]"
            return r0
    }

    @Override // com.eclipsesource.p043v8.V8Object, com.eclipsesource.p043v8.V8Value
    public com.eclipsesource.p043v8.V8Function twin() {
            r1 = this;
            com.eclipsesource.v8.V8Object r0 = super.twin()
            com.eclipsesource.v8.V8Function r0 = (com.eclipsesource.p043v8.V8Function) r0
            return r0
    }

    @Override // com.eclipsesource.p043v8.V8Object, com.eclipsesource.p043v8.V8Value
    public /* bridge */ /* synthetic */ com.eclipsesource.p043v8.V8Object twin() {
            r1 = this;
            com.eclipsesource.v8.V8Function r0 = r1.twin()
            return r0
    }

    @Override // com.eclipsesource.p043v8.V8Object, com.eclipsesource.p043v8.V8Value
    public /* bridge */ /* synthetic */ com.eclipsesource.p043v8.V8Value twin() {
            r1 = this;
            com.eclipsesource.v8.V8Function r0 = r1.twin()
            return r0
    }
}
