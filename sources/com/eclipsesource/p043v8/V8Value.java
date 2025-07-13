package com.eclipsesource.p043v8;

/* loaded from: classes.dex */
public abstract class V8Value implements com.eclipsesource.p043v8.Releasable {
    public static final int BOOLEAN = 3;
    public static final int BYTE = 9;
    public static final int DOUBLE = 2;
    public static final int FLOAT_32_ARRAY = 16;
    public static final int FLOAT_64_ARRAY = 2;
    public static final int INTEGER = 1;
    public static final int INT_16_ARRAY = 13;
    public static final int INT_32_ARRAY = 1;
    public static final int INT_8_ARRAY = 9;
    public static final int NULL = 0;
    public static final int STRING = 4;
    public static final int UNDEFINED = 99;
    public static final int UNKNOWN = 0;
    public static final int UNSIGNED_INT_16_ARRAY = 14;
    public static final int UNSIGNED_INT_32_ARRAY = 15;
    public static final int UNSIGNED_INT_8_ARRAY = 11;
    public static final int UNSIGNED_INT_8_CLAMPED_ARRAY = 12;
    public static final int V8_ARRAY = 5;
    public static final int V8_ARRAY_BUFFER = 10;
    public static final int V8_FUNCTION = 7;
    public static final int V8_OBJECT = 6;
    public static final int V8_TYPED_ARRAY = 8;
    public long objectHandle;
    public boolean released;

    /* renamed from: v8 */
    public com.eclipsesource.p043v8.C1032V8 f5225v8;

    public V8Value() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.released = r0
            return
    }

    public V8Value(com.eclipsesource.p043v8.C1032V8 r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.released = r0
            if (r2 != 0) goto Lb
            r2 = r1
            com.eclipsesource.v8.V8 r2 = (com.eclipsesource.p043v8.C1032V8) r2
        Lb:
            r1.f5225v8 = r2
            return
    }

    @java.lang.Deprecated
    public static java.lang.String getStringRepresentaion(int r0) {
            java.lang.String r0 = getStringRepresentation(r0)
            return r0
    }

    public static java.lang.String getStringRepresentation(int r2) {
            r0 = 99
            if (r2 == r0) goto L46
            switch(r2) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L31;
                case 7: goto L2e;
                case 8: goto L2b;
                case 9: goto L28;
                case 10: goto L25;
                case 11: goto L22;
                case 12: goto L1f;
                case 13: goto L1c;
                case 14: goto L19;
                case 15: goto L16;
                case 16: goto L13;
                default: goto L7;
            }
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid V8 type: "
            java.lang.String r2 = android.support.v4.media.C0142a.m254a(r1, r2)
            r0.<init>(r2)
            throw r0
        L13:
            java.lang.String r2 = "Float32Array"
            return r2
        L16:
            java.lang.String r2 = "UInt32Array"
            return r2
        L19:
            java.lang.String r2 = "UInt16Array"
            return r2
        L1c:
            java.lang.String r2 = "Int16Array"
            return r2
        L1f:
            java.lang.String r2 = "UInt8ClampedArray"
            return r2
        L22:
            java.lang.String r2 = "UInt8Array"
            return r2
        L25:
            java.lang.String r2 = "V8ArrayBuffer"
            return r2
        L28:
            java.lang.String r2 = "Byte"
            return r2
        L2b:
            java.lang.String r2 = "V8TypedArray"
            return r2
        L2e:
            java.lang.String r2 = "V8Function"
            return r2
        L31:
            java.lang.String r2 = "V8Object"
            return r2
        L34:
            java.lang.String r2 = "V8Array"
            return r2
        L37:
            java.lang.String r2 = "String"
            return r2
        L3a:
            java.lang.String r2 = "Boolean"
            return r2
        L3d:
            java.lang.String r2 = "Double"
            return r2
        L40:
            java.lang.String r2 = "Integer"
            return r2
        L43:
            java.lang.String r2 = "Null"
            return r2
        L46:
            java.lang.String r2 = "Undefined"
            return r2
    }

    public void addObjectReference(long r1) {
            r0 = this;
            r0.objectHandle = r1
            com.eclipsesource.v8.V8 r1 = r0.f5225v8     // Catch: java.lang.RuntimeException -> L8 java.lang.Error -> Ld
            r1.addObjRef(r0)     // Catch: java.lang.RuntimeException -> L8 java.lang.Error -> Ld
            return
        L8:
            r1 = move-exception
            r0.release()
            throw r1
        Ld:
            r1 = move-exception
            r0.release()
            throw r1
    }

    public void checkReleased() {
            r2 = this;
            boolean r0 = r2.released
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Object released"
            r0.<init>(r1)
            throw r0
    }

    public com.eclipsesource.p043v8.V8Value clearWeak() {
            r5 = this;
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            r0.checkThread()
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            r0.checkReleased()
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            java.util.Map<java.lang.Long, com.eclipsesource.v8.V8Value> r0 = r0.v8WeakReferences
            long r1 = r5.getHandle()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.remove(r1)
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            long r1 = r0.getV8RuntimePtr()
            long r3 = r5.getHandle()
            r0.clearWeak(r1, r3)
            return r5
    }

    @Override // com.eclipsesource.p043v8.Releasable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r6 = this;
            com.eclipsesource.v8.V8 r0 = r6.f5225v8
            r0.checkThread()
            boolean r0 = r6.released
            if (r0 != 0) goto L2c
            r0 = 1
            com.eclipsesource.v8.V8 r1 = r6.f5225v8     // Catch: java.lang.Throwable -> L1d
            r1.releaseObjRef(r6)     // Catch: java.lang.Throwable -> L1d
            r6.released = r0
            com.eclipsesource.v8.V8 r0 = r6.f5225v8
            long r1 = r0.getV8RuntimePtr()
            long r3 = r6.objectHandle
            r0.release(r1, r3)
            goto L2c
        L1d:
            r1 = move-exception
            r6.released = r0
            com.eclipsesource.v8.V8 r0 = r6.f5225v8
            long r2 = r0.getV8RuntimePtr()
            long r4 = r6.objectHandle
            r0.release(r2, r4)
            throw r1
        L2c:
            return
    }

    public abstract com.eclipsesource.p043v8.V8Value createTwin();

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r0.strictEquals(r1)
            return r1
    }

    public java.lang.String getConstructorName() {
            r5 = this;
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            r0.checkThread()
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            r0.checkReleased()
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            long r1 = r0.getV8RuntimePtr()
            long r3 = r5.objectHandle
            java.lang.String r0 = r0.getConstructorName(r1, r3)
            return r0
    }

    public long getHandle() {
            r2 = this;
            r2.checkReleased()
            long r0 = r2.objectHandle
            return r0
    }

    public com.eclipsesource.p043v8.C1032V8 getRuntime() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            return r0
    }

    public int getV8Type() {
            r5 = this;
            boolean r0 = r5.isUndefined()
            if (r0 == 0) goto L9
            r0 = 99
            return r0
        L9:
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            r0.checkThread()
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            r0.checkReleased()
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            long r1 = r0.getV8RuntimePtr()
            long r3 = r5.objectHandle
            int r0 = r0.getType(r1, r3)
            return r0
    }

    public int hashCode() {
            r5 = this;
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            r0.checkThread()
            r5.checkReleased()
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            long r1 = r0.getV8RuntimePtr()
            long r3 = r5.getHandle()
            int r0 = r0.identityHash(r1, r3)
            return r0
    }

    public void initialize(long r1, java.lang.Object r3) {
            r0 = this;
            com.eclipsesource.v8.V8 r3 = r0.f5225v8
            long r1 = r3.initNewV8Object(r1)
            r3 = 0
            r0.released = r3
            r0.addObjectReference(r1)
            return
    }

    public boolean isReleased() {
            r1 = this;
            boolean r0 = r1.released
            return r0
    }

    public boolean isUndefined() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isWeak() {
            r5 = this;
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            r0.checkThread()
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            r0.checkReleased()
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            long r1 = r0.getV8RuntimePtr()
            long r3 = r5.getHandle()
            boolean r0 = r0.isWeak(r1, r3)
            return r0
    }

    public boolean jsEquals(java.lang.Object r10) {
            r9 = this;
            com.eclipsesource.v8.V8 r0 = r9.f5225v8
            r0.checkThread()
            r9.checkReleased()
            r0 = 1
            if (r10 != r9) goto Lc
            return r0
        Lc:
            r1 = 0
            if (r10 != 0) goto L10
            return r1
        L10:
            boolean r2 = r10 instanceof com.eclipsesource.p043v8.V8Value
            if (r2 != 0) goto L15
            return r1
        L15:
            boolean r2 = r9.isUndefined()
            if (r2 == 0) goto L25
            r2 = r10
            com.eclipsesource.v8.V8Value r2 = (com.eclipsesource.p043v8.V8Value) r2
            boolean r2 = r2.isUndefined()
            if (r2 == 0) goto L25
            return r0
        L25:
            com.eclipsesource.v8.V8Value r10 = (com.eclipsesource.p043v8.V8Value) r10
            boolean r0 = r10.isUndefined()
            if (r0 == 0) goto L2e
            return r1
        L2e:
            com.eclipsesource.v8.V8 r2 = r9.f5225v8
            long r3 = r2.getV8RuntimePtr()
            long r5 = r9.getHandle()
            long r7 = r10.getHandle()
            boolean r10 = r2.equals(r3, r5, r7)
            return r10
    }

    @Override // com.eclipsesource.p043v8.Releasable
    @java.lang.Deprecated
    public void release() {
            r0 = this;
            r0.close()
            return
    }

    public com.eclipsesource.p043v8.V8Value setWeak() {
            r5 = this;
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            r0.checkThread()
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            r0.checkReleased()
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            java.util.Map<java.lang.Long, com.eclipsesource.v8.V8Value> r0 = r0.v8WeakReferences
            long r1 = r5.getHandle()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.put(r1, r5)
            com.eclipsesource.v8.V8 r0 = r5.f5225v8
            long r1 = r0.getV8RuntimePtr()
            long r3 = r5.getHandle()
            r0.setWeak(r1, r3)
            return r5
    }

    public boolean strictEquals(java.lang.Object r10) {
            r9 = this;
            com.eclipsesource.v8.V8 r0 = r9.f5225v8
            r0.checkThread()
            r9.checkReleased()
            r0 = 1
            if (r10 != r9) goto Lc
            return r0
        Lc:
            r1 = 0
            if (r10 != 0) goto L10
            return r1
        L10:
            boolean r2 = r10 instanceof com.eclipsesource.p043v8.V8Value
            if (r2 != 0) goto L15
            return r1
        L15:
            boolean r2 = r9.isUndefined()
            if (r2 == 0) goto L25
            r2 = r10
            com.eclipsesource.v8.V8Value r2 = (com.eclipsesource.p043v8.V8Value) r2
            boolean r2 = r2.isUndefined()
            if (r2 == 0) goto L25
            return r0
        L25:
            com.eclipsesource.v8.V8Value r10 = (com.eclipsesource.p043v8.V8Value) r10
            boolean r0 = r10.isUndefined()
            if (r0 == 0) goto L2e
            return r1
        L2e:
            com.eclipsesource.v8.V8 r2 = r9.f5225v8
            long r3 = r2.getV8RuntimePtr()
            long r5 = r9.getHandle()
            long r7 = r10.getHandle()
            boolean r10 = r2.strictEquals(r3, r5, r7)
            return r10
    }

    public com.eclipsesource.p043v8.V8Value twin() {
            r2 = this;
            boolean r0 = r2.isUndefined()
            if (r0 == 0) goto L7
            return r2
        L7:
            com.eclipsesource.v8.V8 r0 = r2.f5225v8
            r0.checkThread()
            com.eclipsesource.v8.V8 r0 = r2.f5225v8
            r0.checkReleased()
            com.eclipsesource.v8.V8Value r0 = r2.createTwin()
            com.eclipsesource.v8.V8 r1 = r2.f5225v8
            r1.createTwin(r2, r0)
            return r0
    }
}
