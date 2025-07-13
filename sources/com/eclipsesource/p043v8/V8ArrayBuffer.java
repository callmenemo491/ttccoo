package com.eclipsesource.p043v8;

/* loaded from: classes.dex */
public class V8ArrayBuffer extends com.eclipsesource.p043v8.V8Value {
    public java.nio.ByteBuffer byteBuffer;

    public V8ArrayBuffer(com.eclipsesource.p043v8.C1032V8 r10, int r11) {
            r9 = this;
            r9.<init>(r10)
            long r0 = r10.getV8RuntimePtr()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r9.initialize(r0, r2)
            long r4 = r10.getV8RuntimePtr()
            long r6 = r9.objectHandle
            r3 = r10
            r8 = r11
            java.nio.ByteBuffer r10 = r3.createV8ArrayBufferBackingStore(r4, r6, r8)
            r9.byteBuffer = r10
            java.nio.ByteOrder r11 = java.nio.ByteOrder.nativeOrder()
            r10.order(r11)
            return
    }

    public V8ArrayBuffer(com.eclipsesource.p043v8.C1032V8 r3, java.nio.ByteBuffer r4) {
            r2 = this;
            r2.<init>(r3)
            if (r4 != 0) goto La
            r4 = 0
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r4)
        La:
            boolean r0 = r4.isDirect()
            if (r0 == 0) goto L21
            long r0 = r3.getV8RuntimePtr()
            r2.initialize(r0, r4)
            r2.byteBuffer = r4
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            r4.order(r3)
            return
        L21:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "ByteBuffer must be a allocated as a direct ByteBuffer"
            r3.<init>(r4)
            throw r3
    }

    public final byte[] array() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            byte[] r0 = r0.array()
            return r0
    }

    public final int arrayOffset() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            int r0 = r0.arrayOffset()
            return r0
    }

    public final int capacity() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            int r0 = r0.capacity()
            return r0
    }

    public final com.eclipsesource.p043v8.V8ArrayBuffer clear() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.clear()
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer compact() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.compact()
            return r1
    }

    @Override // com.eclipsesource.p043v8.V8Value
    public com.eclipsesource.p043v8.V8Value createTwin() {
            r3 = this;
            com.eclipsesource.v8.V8ArrayBuffer r0 = new com.eclipsesource.v8.V8ArrayBuffer
            com.eclipsesource.v8.V8 r1 = r3.f5225v8
            java.nio.ByteBuffer r2 = r3.byteBuffer
            r0.<init>(r1, r2)
            return r0
    }

    public int doubleLimit() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            java.nio.DoubleBuffer r0 = r0.asDoubleBuffer()
            int r0 = r0.limit()
            return r0
    }

    public final com.eclipsesource.p043v8.V8ArrayBuffer flip() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.flip()
            return r1
    }

    public int floatLimit() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            java.nio.FloatBuffer r0 = r0.asFloatBuffer()
            int r0 = r0.limit()
            return r0
    }

    public byte get() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            byte r0 = r0.get()
            return r0
    }

    public byte get(int r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            byte r2 = r0.get(r2)
            return r2
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer get(byte[] r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.get(r2)
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer get(byte[] r2, int r3, int r4) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.get(r2, r3, r4)
            return r1
    }

    public char getChar() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            char r0 = r0.getChar()
            return r0
    }

    public char getChar(int r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            char r2 = r0.getChar(r2)
            return r2
    }

    public double getDouble() {
            r2 = this;
            com.eclipsesource.v8.V8 r0 = r2.f5225v8
            r0.checkThread()
            r2.checkReleased()
            java.nio.ByteBuffer r0 = r2.byteBuffer
            double r0 = r0.getDouble()
            return r0
    }

    public double getDouble(int r3) {
            r2 = this;
            com.eclipsesource.v8.V8 r0 = r2.f5225v8
            r0.checkThread()
            r2.checkReleased()
            java.nio.ByteBuffer r0 = r2.byteBuffer
            double r0 = r0.getDouble(r3)
            return r0
    }

    public float getFloat() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            float r0 = r0.getFloat()
            return r0
    }

    public float getFloat(int r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            float r2 = r0.getFloat(r2)
            return r2
    }

    public int getInt() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            int r0 = r0.getInt()
            return r0
    }

    public int getInt(int r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            int r2 = r0.getInt(r2)
            return r2
    }

    public long getLong() {
            r2 = this;
            com.eclipsesource.v8.V8 r0 = r2.f5225v8
            r0.checkThread()
            r2.checkReleased()
            java.nio.ByteBuffer r0 = r2.byteBuffer
            long r0 = r0.getLong()
            return r0
    }

    public long getLong(int r3) {
            r2 = this;
            com.eclipsesource.v8.V8 r0 = r2.f5225v8
            r0.checkThread()
            r2.checkReleased()
            java.nio.ByteBuffer r0 = r2.byteBuffer
            long r0 = r0.getLong(r3)
            return r0
    }

    public short getShort() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            short r0 = r0.getShort()
            return r0
    }

    public short getShort(int r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            short r2 = r0.getShort(r2)
            return r2
    }

    public final boolean hasArray() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            boolean r0 = r0.hasArray()
            return r0
    }

    public final boolean hasRemaining() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            boolean r0 = r0.hasRemaining()
            return r0
    }

    @Override // com.eclipsesource.p043v8.V8Value
    public void initialize(long r3, java.lang.Object r5) {
            r2 = this;
            com.eclipsesource.v8.V8 r3 = r2.f5225v8
            r3.checkThread()
            boolean r3 = r5 instanceof java.nio.ByteBuffer
            if (r3 == 0) goto L1a
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r3 = r5.limit()
            com.eclipsesource.v8.V8 r4 = r2.f5225v8
            long r0 = r4.getV8RuntimePtr()
            long r3 = r4.initNewV8ArrayBuffer(r0, r5, r3)
            goto L2a
        L1a:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r3 = r5.intValue()
            com.eclipsesource.v8.V8 r4 = r2.f5225v8
            long r0 = r4.getV8RuntimePtr()
            long r3 = r4.initNewV8ArrayBuffer(r0, r3)
        L2a:
            r2.objectHandle = r3
            r3 = 0
            r2.released = r3
            long r3 = r2.objectHandle
            r2.addObjectReference(r3)
            return
    }

    public int intLimit() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            java.nio.IntBuffer r0 = r0.asIntBuffer()
            int r0 = r0.limit()
            return r0
    }

    public boolean isDirect() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            boolean r0 = r0.isDirect()
            return r0
    }

    public boolean isReadOnly() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            boolean r0 = r0.isReadOnly()
            return r0
    }

    public int limit() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            int r0 = r0.limit()
            return r0
    }

    public final com.eclipsesource.p043v8.V8ArrayBuffer limit(int r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.limit(r2)
            return r1
    }

    public final com.eclipsesource.p043v8.V8ArrayBuffer mark() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.mark()
            return r1
    }

    public final com.eclipsesource.p043v8.V8ArrayBuffer order(java.nio.ByteOrder r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.order(r2)
            return r1
    }

    public final java.nio.ByteOrder order() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            java.nio.ByteOrder r0 = r0.order()
            return r0
    }

    public final int position() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            int r0 = r0.position()
            return r0
    }

    public final com.eclipsesource.p043v8.V8ArrayBuffer position(int r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.position(r2)
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer put(byte r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.put(r2)
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer put(int r2, byte r3) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.put(r2, r3)
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer put(java.nio.ByteBuffer r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.put(r2)
            return r1
    }

    public final com.eclipsesource.p043v8.V8ArrayBuffer put(byte[] r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.put(r2)
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer put(byte[] r2, int r3, int r4) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.put(r2, r3, r4)
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer putChar(char r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.putChar(r2)
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer putChar(int r2, char r3) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.putChar(r2, r3)
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer putDouble(double r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.putDouble(r2)
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer putDouble(int r2, double r3) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.putDouble(r2, r3)
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer putFloat(float r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.putFloat(r2)
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer putFloat(int r2, float r3) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.putFloat(r2, r3)
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer putInt(int r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.putInt(r2)
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer putInt(int r2, int r3) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            java.nio.IntBuffer r0 = r0.asIntBuffer()
            r0.put(r2, r3)
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer putLong(int r2, long r3) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.putLong(r2, r3)
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer putLong(long r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.putLong(r2)
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer putShort(int r2, short r3) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.putShort(r2, r3)
            return r1
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer putShort(short r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.putShort(r2)
            return r1
    }

    public final int remaining() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            int r0 = r0.remaining()
            return r0
    }

    public final com.eclipsesource.p043v8.V8ArrayBuffer reset() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.reset()
            return r1
    }

    public final com.eclipsesource.p043v8.V8ArrayBuffer rewind() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            r0.rewind()
            return r1
    }

    public int shortLimit() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            java.nio.ByteBuffer r0 = r1.byteBuffer
            java.nio.ShortBuffer r0 = r0.asShortBuffer()
            int r0 = r0.limit()
            return r0
    }

    @Override // com.eclipsesource.p043v8.V8Value
    public com.eclipsesource.p043v8.V8ArrayBuffer twin() {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            r1.checkReleased()
            com.eclipsesource.v8.V8Value r0 = super.twin()
            com.eclipsesource.v8.V8ArrayBuffer r0 = (com.eclipsesource.p043v8.V8ArrayBuffer) r0
            return r0
    }

    @Override // com.eclipsesource.p043v8.V8Value
    public /* bridge */ /* synthetic */ com.eclipsesource.p043v8.V8Value twin() {
            r1 = this;
            com.eclipsesource.v8.V8ArrayBuffer r0 = r1.twin()
            return r0
    }
}
