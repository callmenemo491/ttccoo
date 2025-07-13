package com.eclipsesource.p043v8;

/* loaded from: classes.dex */
public class V8TypedArray extends com.eclipsesource.p043v8.V8Array {

    public static class V8ArrayData {
        private com.eclipsesource.p043v8.V8ArrayBuffer buffer;
        private int offset;
        private int size;
        private int type;

        public V8ArrayData(com.eclipsesource.p043v8.V8ArrayBuffer r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.buffer = r1
                r0.offset = r2
                r0.size = r3
                r0.type = r4
                return
        }

        public static /* synthetic */ int access$000(com.eclipsesource.v8.V8TypedArray.V8ArrayData r0) {
                int r0 = r0.type
                return r0
        }

        public static /* synthetic */ com.eclipsesource.p043v8.V8ArrayBuffer access$100(com.eclipsesource.v8.V8TypedArray.V8ArrayData r0) {
                com.eclipsesource.v8.V8ArrayBuffer r0 = r0.buffer
                return r0
        }

        public static /* synthetic */ int access$200(com.eclipsesource.v8.V8TypedArray.V8ArrayData r0) {
                int r0 = r0.offset
                return r0
        }

        public static /* synthetic */ int access$300(com.eclipsesource.v8.V8TypedArray.V8ArrayData r0) {
                int r0 = r0.size
                return r0
        }
    }

    private V8TypedArray(com.eclipsesource.p043v8.C1032V8 r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public V8TypedArray(com.eclipsesource.p043v8.C1032V8 r2, com.eclipsesource.p043v8.V8ArrayBuffer r3, int r4, int r5, int r6) {
            r1 = this;
            com.eclipsesource.v8.V8TypedArray$V8ArrayData r0 = new com.eclipsesource.v8.V8TypedArray$V8ArrayData
            r0.<init>(r3, r5, r6, r4)
            r1.<init>(r2, r0)
            return
    }

    private void checkArrayProperties(com.eclipsesource.v8.V8TypedArray.V8ArrayData r1) {
            r0 = this;
            r0.checkOffset(r1)
            r0.checkSize(r1)
            return
    }

    private void checkOffset(com.eclipsesource.v8.V8TypedArray.V8ArrayData r3) {
            r2 = this;
            int r0 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$200(r3)
            int r1 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$000(r3)
            int r1 = getStructureSize(r1)
            int r0 = r0 % r1
            if (r0 != 0) goto L10
            return
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RangeError: Start offset of Int32Array must be a multiple of "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r3 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$000(r3)
            int r3 = getStructureSize(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private void checkSize(com.eclipsesource.v8.V8TypedArray.V8ArrayData r4) {
            r3 = this;
            int r0 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$300(r4)
            java.lang.String r1 = "RangeError: Invalid typed array length"
            if (r0 < 0) goto L2c
            int r0 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$300(r4)
            int r2 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$000(r4)
            int r2 = getStructureSize(r2)
            int r2 = r2 * r0
            int r0 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$200(r4)
            int r2 = r2 + r0
            com.eclipsesource.v8.V8ArrayBuffer r4 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$100(r4)
            int r4 = r4.limit()
            if (r2 > r4) goto L26
            return
        L26:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
    }

    private long createTypedArray(long r10, com.eclipsesource.v8.V8TypedArray.V8ArrayData r12) {
            r9 = this;
            int r0 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$000(r12)
            r1 = 1
            if (r0 == r1) goto Ldc
            r1 = 2
            if (r0 == r1) goto Lc6
            r1 = 9
            if (r0 == r1) goto Lb0
            switch(r0) {
                case 11: goto L9a;
                case 12: goto L84;
                case 13: goto L6e;
                case 14: goto L58;
                case 15: goto L42;
                case 16: goto L2c;
                default: goto L11;
            }
        L11:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Cannot create a typed array of type "
            java.lang.StringBuilder r11 = android.support.v4.media.C0144c.m256a(r11)
            int r12 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$000(r12)
            java.lang.String r12 = com.eclipsesource.p043v8.V8Value.getStringRepresentation(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L2c:
            com.eclipsesource.v8.V8 r2 = r9.f5225v8
            com.eclipsesource.v8.V8ArrayBuffer r0 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$100(r12)
            long r5 = r0.objectHandle
            int r7 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$200(r12)
            int r8 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$300(r12)
            r3 = r10
            long r10 = r2.initNewV8Float32Array(r3, r5, r7, r8)
            return r10
        L42:
            com.eclipsesource.v8.V8 r0 = r9.f5225v8
            com.eclipsesource.v8.V8ArrayBuffer r1 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$100(r12)
            long r3 = r1.objectHandle
            int r5 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$200(r12)
            int r6 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$300(r12)
            r1 = r10
            long r10 = r0.initNewV8UInt32Array(r1, r3, r5, r6)
            return r10
        L58:
            com.eclipsesource.v8.V8 r0 = r9.f5225v8
            com.eclipsesource.v8.V8ArrayBuffer r1 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$100(r12)
            long r3 = r1.objectHandle
            int r5 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$200(r12)
            int r6 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$300(r12)
            r1 = r10
            long r10 = r0.initNewV8UInt16Array(r1, r3, r5, r6)
            return r10
        L6e:
            com.eclipsesource.v8.V8 r0 = r9.f5225v8
            com.eclipsesource.v8.V8ArrayBuffer r1 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$100(r12)
            long r3 = r1.objectHandle
            int r5 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$200(r12)
            int r6 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$300(r12)
            r1 = r10
            long r10 = r0.initNewV8Int16Array(r1, r3, r5, r6)
            return r10
        L84:
            com.eclipsesource.v8.V8 r0 = r9.f5225v8
            com.eclipsesource.v8.V8ArrayBuffer r1 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$100(r12)
            long r3 = r1.objectHandle
            int r5 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$200(r12)
            int r6 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$300(r12)
            r1 = r10
            long r10 = r0.initNewV8UInt8ClampedArray(r1, r3, r5, r6)
            return r10
        L9a:
            com.eclipsesource.v8.V8 r0 = r9.f5225v8
            com.eclipsesource.v8.V8ArrayBuffer r1 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$100(r12)
            long r3 = r1.objectHandle
            int r5 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$200(r12)
            int r6 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$300(r12)
            r1 = r10
            long r10 = r0.initNewV8UInt8Array(r1, r3, r5, r6)
            return r10
        Lb0:
            com.eclipsesource.v8.V8 r0 = r9.f5225v8
            com.eclipsesource.v8.V8ArrayBuffer r1 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$100(r12)
            long r3 = r1.objectHandle
            int r5 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$200(r12)
            int r6 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$300(r12)
            r1 = r10
            long r10 = r0.initNewV8Int8Array(r1, r3, r5, r6)
            return r10
        Lc6:
            com.eclipsesource.v8.V8 r0 = r9.f5225v8
            com.eclipsesource.v8.V8ArrayBuffer r1 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$100(r12)
            long r3 = r1.objectHandle
            int r5 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$200(r12)
            int r6 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$300(r12)
            r1 = r10
            long r10 = r0.initNewV8Float64Array(r1, r3, r5, r6)
            return r10
        Ldc:
            com.eclipsesource.v8.V8 r0 = r9.f5225v8
            com.eclipsesource.v8.V8ArrayBuffer r1 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$100(r12)
            long r3 = r1.objectHandle
            int r5 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$200(r12)
            int r6 = com.eclipsesource.v8.V8TypedArray.V8ArrayData.access$300(r12)
            r1 = r10
            long r10 = r0.initNewV8Int32Array(r1, r3, r5, r6)
            return r10
    }

    public static int getStructureSize(int r3) {
            r0 = 1
            if (r3 == r0) goto L29
            r1 = 2
            if (r3 == r1) goto L26
            r2 = 9
            if (r3 == r2) goto L25
            switch(r3) {
                case 11: goto L25;
                case 12: goto L25;
                case 13: goto L24;
                case 14: goto L24;
                case 15: goto L29;
                case 16: goto L29;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot create a typed array of type "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r3 = com.eclipsesource.p043v8.V8Value.getStringRepresentation(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L24:
            return r1
        L25:
            return r0
        L26:
            r3 = 8
            return r3
        L29:
            r3 = 4
            return r3
    }

    @Override // com.eclipsesource.p043v8.V8Array, com.eclipsesource.p043v8.V8Object, com.eclipsesource.p043v8.V8Value
    public com.eclipsesource.p043v8.V8Value createTwin() {
            r2 = this;
            com.eclipsesource.v8.V8 r0 = r2.f5225v8
            r0.checkThread()
            r2.checkReleased()
            com.eclipsesource.v8.V8TypedArray r0 = new com.eclipsesource.v8.V8TypedArray
            com.eclipsesource.v8.V8 r1 = r2.f5225v8
            r0.<init>(r1)
            return r0
    }

    @Override // com.eclipsesource.p043v8.V8Array
    public java.lang.Object get(int r5) {
            r4 = this;
            com.eclipsesource.v8.V8 r0 = r4.f5225v8
            r0.checkThread()
            r4.checkReleased()
            int r0 = r4.getType()
            r1 = 1
            if (r0 == r1) goto L96
            r1 = 2
            if (r0 == r1) goto L91
            r1 = 9
            if (r0 == r1) goto L82
            switch(r0) {
                case 11: goto L70;
                case 12: goto L5e;
                case 13: goto L4f;
                case 14: goto L3c;
                case 15: goto L2a;
                case 16: goto L1b;
                default: goto L19;
            }
        L19:
            r5 = 0
            return r5
        L1b:
            java.lang.Object r5 = super.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            return r5
        L2a:
            r0 = -1
            java.lang.Object r5 = super.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            long r2 = r5.longValue()
            long r0 = r0 & r2
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            return r5
        L3c:
            r0 = 65535(0xffff, float:9.1834E-41)
            java.lang.Object r5 = super.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r5 = r5 & r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L4f:
            java.lang.Object r5 = super.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            short r5 = r5.shortValue()
            java.lang.Short r5 = java.lang.Short.valueOf(r5)
            return r5
        L5e:
            java.lang.Object r5 = super.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            byte r5 = r5.byteValue()
            r5 = r5 & 255(0xff, float:3.57E-43)
            short r5 = (short) r5
            java.lang.Short r5 = java.lang.Short.valueOf(r5)
            return r5
        L70:
            java.lang.Object r5 = super.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            short r5 = r5.shortValue()
            r5 = r5 & 255(0xff, float:3.57E-43)
            short r5 = (short) r5
            java.lang.Short r5 = java.lang.Short.valueOf(r5)
            return r5
        L82:
            java.lang.Object r5 = super.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            byte r5 = r5.byteValue()
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            return r5
        L91:
            java.lang.Object r5 = super.get(r5)
            return r5
        L96:
            java.lang.Object r5 = super.get(r5)
            return r5
    }

    public com.eclipsesource.p043v8.V8ArrayBuffer getBuffer() {
            r1 = this;
            java.lang.String r0 = "buffer"
            java.lang.Object r0 = r1.get(r0)
            com.eclipsesource.v8.V8ArrayBuffer r0 = (com.eclipsesource.p043v8.V8ArrayBuffer) r0
            return r0
    }

    @Override // com.eclipsesource.p043v8.V8Array, com.eclipsesource.p043v8.V8Value
    public void initialize(long r2, java.lang.Object r4) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5225v8
            r0.checkThread()
            if (r4 != 0) goto Lb
            super.initialize(r2, r4)
            return
        Lb:
            com.eclipsesource.v8.V8TypedArray$V8ArrayData r4 = (com.eclipsesource.v8.V8TypedArray.V8ArrayData) r4
            r1.checkArrayProperties(r4)
            long r2 = r1.createTypedArray(r2, r4)
            r4 = 0
            r1.released = r4
            r1.addObjectReference(r2)
            return
    }
}
