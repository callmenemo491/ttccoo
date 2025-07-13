package com.eclipsesource.p043v8.utils;

/* loaded from: classes.dex */
public class V8ObjectUtils {
    private static final com.eclipsesource.p043v8.utils.TypeAdapter DEFAULT_TYPE_ADAPTER = null;
    private static final java.lang.Object IGNORE = null;

    public static class DefaultTypeAdapter implements com.eclipsesource.p043v8.utils.TypeAdapter {
        public DefaultTypeAdapter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.eclipsesource.p043v8.utils.TypeAdapter
        public java.lang.Object adapt(int r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Object r1 = com.eclipsesource.p043v8.utils.TypeAdapter.DEFAULT
                return r1
        }
    }

    public static class ListWrapper {
        private java.util.List<? extends java.lang.Object> list;

        public ListWrapper(java.util.List<? extends java.lang.Object> r1) {
                r0 = this;
                r0.<init>()
                r0.list = r1
                return
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof com.eclipsesource.v8.utils.V8ObjectUtils.ListWrapper
                r1 = 0
                if (r0 == 0) goto Le
                com.eclipsesource.v8.utils.V8ObjectUtils$ListWrapper r3 = (com.eclipsesource.v8.utils.V8ObjectUtils.ListWrapper) r3
                java.util.List<? extends java.lang.Object> r3 = r3.list
                java.util.List<? extends java.lang.Object> r0 = r2.list
                if (r3 != r0) goto Le
                r1 = 1
            Le:
                return r1
        }

        public int hashCode() {
                r1 = this;
                java.util.List<? extends java.lang.Object> r0 = r1.list
                int r0 = java.lang.System.identityHashCode(r0)
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.eclipsesource.p043v8.utils.V8ObjectUtils.IGNORE = r0
            com.eclipsesource.v8.utils.V8ObjectUtils$DefaultTypeAdapter r0 = new com.eclipsesource.v8.utils.V8ObjectUtils$DefaultTypeAdapter
            r0.<init>()
            com.eclipsesource.p043v8.utils.V8ObjectUtils.DEFAULT_TYPE_ADAPTER = r0
            return
    }

    private V8ObjectUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object getTypedArray(com.eclipsesource.p043v8.V8Array r3, int r4) {
            int r0 = r3.length()
            r1 = 0
            r2 = 1
            if (r4 != r2) goto Ld
            int[] r3 = r3.getIntegers(r1, r0)
            return r3
        Ld:
            r2 = 2
            if (r4 != r2) goto L15
            double[] r3 = r3.getDoubles(r1, r0)
            return r3
        L15:
            r2 = 3
            if (r4 != r2) goto L1d
            boolean[] r3 = r3.getBooleans(r1, r0)
            return r3
        L1d:
            r2 = 4
            if (r4 != r2) goto L25
            java.lang.String[] r3 = r3.getStrings(r1, r0)
            return r3
        L25:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "Unsupported bulk load type: "
            java.lang.String r4 = android.support.v4.media.C0142a.m254a(r0, r4)
            r3.<init>(r4)
            throw r3
    }

    public static java.lang.Object getTypedArray(com.eclipsesource.p043v8.V8Array r3, int r4, java.lang.Object r5) {
            int r0 = r3.length()
            r1 = 0
            r2 = 1
            if (r4 != r2) goto L15
            int[] r5 = (int[]) r5
            if (r5 == 0) goto Lf
            int r4 = r5.length
            if (r4 >= r0) goto L11
        Lf:
            int[] r5 = new int[r0]
        L11:
            r3.getIntegers(r1, r0, r5)
            return r5
        L15:
            r2 = 2
            if (r4 != r2) goto L25
            double[] r5 = (double[]) r5
            if (r5 == 0) goto L1f
            int r4 = r5.length
            if (r4 >= r0) goto L21
        L1f:
            double[] r5 = new double[r0]
        L21:
            r3.getDoubles(r1, r0, r5)
            return r5
        L25:
            r2 = 3
            if (r4 != r2) goto L35
            boolean[] r5 = (boolean[]) r5
            if (r5 == 0) goto L2f
            int r4 = r5.length
            if (r4 >= r0) goto L31
        L2f:
            boolean[] r5 = new boolean[r0]
        L31:
            r3.getBooleans(r1, r0, r5)
            return r5
        L35:
            r2 = 4
            if (r4 != r2) goto L45
            java.lang.String[] r5 = (java.lang.String[]) r5
            if (r5 == 0) goto L3f
            int r4 = r5.length
            if (r4 >= r0) goto L41
        L3f:
            java.lang.String[] r5 = new java.lang.String[r0]
        L41:
            r3.getStrings(r1, r0, r5)
            return r5
        L45:
            r2 = 9
            if (r4 != r2) goto L56
            byte[] r5 = (byte[]) r5
            if (r5 == 0) goto L50
            int r4 = r5.length
            if (r4 >= r0) goto L52
        L50:
            byte[] r5 = new byte[r0]
        L52:
            r3.getBytes(r1, r0, r5)
            return r5
        L56:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r5 = "Unsupported bulk load type: "
            java.lang.String r4 = android.support.v4.media.C0142a.m254a(r5, r4)
            r3.<init>(r4)
            throw r3
    }

    public static java.lang.Object getV8Result(com.eclipsesource.p043v8.C1032V8 r1, java.lang.Object r2) {
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            java.lang.Object r1 = getV8Result(r1, r2, r0)     // Catch: java.lang.Throwable -> L49
            boolean r2 = r1 instanceof com.eclipsesource.p043v8.V8Value     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L30
            com.eclipsesource.v8.V8Value r1 = (com.eclipsesource.p043v8.V8Value) r1     // Catch: java.lang.Throwable -> L49
            com.eclipsesource.v8.V8Value r1 = r1.twin()     // Catch: java.lang.Throwable -> L49
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()
            com.eclipsesource.v8.V8Value r0 = (com.eclipsesource.p043v8.V8Value) r0
            r0.close()
            goto L1f
        L2f:
            return r1
        L30:
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L38:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r2.next()
            com.eclipsesource.v8.V8Value r0 = (com.eclipsesource.p043v8.V8Value) r0
            r0.close()
            goto L38
        L48:
            return r1
        L49:
            r1 = move-exception
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L52:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r2.next()
            com.eclipsesource.v8.V8Value r0 = (com.eclipsesource.p043v8.V8Value) r0
            r0.close()
            goto L52
        L62:
            throw r1
    }

    private static java.lang.Object getV8Result(com.eclipsesource.p043v8.C1032V8 r1, java.lang.Object r2, java.util.Map<java.lang.Object, com.eclipsesource.p043v8.V8Value> r3) {
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r3.get(r2)
            return r1
        Lb:
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L16
            java.util.Map r2 = (java.util.Map) r2
            com.eclipsesource.v8.V8Object r1 = toV8Object(r1, r2, r3)
            return r1
        L16:
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L21
            java.util.List r2 = (java.util.List) r2
            com.eclipsesource.v8.V8Array r1 = toV8Array(r1, r2, r3)
            return r1
        L21:
            boolean r0 = r2 instanceof com.eclipsesource.p043v8.utils.TypedArray
            if (r0 == 0) goto L2c
            com.eclipsesource.v8.utils.TypedArray r2 = (com.eclipsesource.p043v8.utils.TypedArray) r2
            com.eclipsesource.v8.V8TypedArray r1 = toV8TypedArray(r1, r2, r3)
            return r1
        L2c:
            boolean r0 = r2 instanceof com.eclipsesource.p043v8.utils.ArrayBuffer
            if (r0 == 0) goto L37
            com.eclipsesource.v8.utils.ArrayBuffer r2 = (com.eclipsesource.p043v8.utils.ArrayBuffer) r2
            com.eclipsesource.v8.V8ArrayBuffer r1 = toV8ArrayBuffer(r1, r2, r3)
            return r1
        L37:
            return r2
    }

    public static java.lang.Object getValue(com.eclipsesource.p043v8.V8Array r2, int r3) {
            com.eclipsesource.v8.utils.V8Map r0 = new com.eclipsesource.v8.utils.V8Map
            r0.<init>()
            java.lang.Object r1 = r2.get(r3)     // Catch: java.lang.Throwable -> L3b
            int r2 = r2.getType(r3)     // Catch: java.lang.Throwable -> L39
            com.eclipsesource.v8.utils.TypeAdapter r3 = com.eclipsesource.p043v8.utils.V8ObjectUtils.DEFAULT_TYPE_ADAPTER     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = getValue(r1, r2, r0, r3)     // Catch: java.lang.Throwable -> L39
            if (r2 != r1) goto L2c
            boolean r3 = r2 instanceof com.eclipsesource.p043v8.V8Value     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L2c
            com.eclipsesource.v8.V8Value r2 = (com.eclipsesource.p043v8.V8Value) r2     // Catch: java.lang.Throwable -> L39
            com.eclipsesource.v8.V8Value r2 = r2.twin()     // Catch: java.lang.Throwable -> L39
            boolean r3 = r1 instanceof com.eclipsesource.p043v8.Releasable
            if (r3 == 0) goto L28
            com.eclipsesource.v8.Releasable r1 = (com.eclipsesource.p043v8.Releasable) r1
            r1.release()
        L28:
            r0.close()
            return r2
        L2c:
            boolean r3 = r1 instanceof com.eclipsesource.p043v8.Releasable
            if (r3 == 0) goto L35
            com.eclipsesource.v8.Releasable r1 = (com.eclipsesource.p043v8.Releasable) r1
            r1.release()
        L35:
            r0.close()
            return r2
        L39:
            r2 = move-exception
            goto L3d
        L3b:
            r2 = move-exception
            r1 = 0
        L3d:
            boolean r3 = r1 instanceof com.eclipsesource.p043v8.Releasable
            if (r3 == 0) goto L46
            com.eclipsesource.v8.Releasable r1 = (com.eclipsesource.p043v8.Releasable) r1
            r1.release()
        L46:
            r0.close()
            throw r2
    }

    public static java.lang.Object getValue(com.eclipsesource.p043v8.V8Array r2, int r3, com.eclipsesource.p043v8.utils.TypeAdapter r4) {
            com.eclipsesource.v8.utils.V8Map r0 = new com.eclipsesource.v8.utils.V8Map
            r0.<init>()
            java.lang.Object r1 = r2.get(r3)     // Catch: java.lang.Throwable -> L39
            int r2 = r2.getType(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.Object r2 = getValue(r1, r2, r0, r4)     // Catch: java.lang.Throwable -> L37
            if (r2 != r1) goto L2a
            boolean r3 = r2 instanceof com.eclipsesource.p043v8.V8Value     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L2a
            com.eclipsesource.v8.V8Value r2 = (com.eclipsesource.p043v8.V8Value) r2     // Catch: java.lang.Throwable -> L37
            com.eclipsesource.v8.V8Value r2 = r2.twin()     // Catch: java.lang.Throwable -> L37
            boolean r3 = r1 instanceof com.eclipsesource.p043v8.Releasable
            if (r3 == 0) goto L26
            com.eclipsesource.v8.Releasable r1 = (com.eclipsesource.p043v8.Releasable) r1
            r1.release()
        L26:
            r0.close()
            return r2
        L2a:
            boolean r3 = r1 instanceof com.eclipsesource.p043v8.Releasable
            if (r3 == 0) goto L33
            com.eclipsesource.v8.Releasable r1 = (com.eclipsesource.p043v8.Releasable) r1
            r1.release()
        L33:
            r0.close()
            return r2
        L37:
            r2 = move-exception
            goto L3b
        L39:
            r2 = move-exception
            r1 = 0
        L3b:
            boolean r3 = r1 instanceof com.eclipsesource.p043v8.Releasable
            if (r3 == 0) goto L44
            com.eclipsesource.v8.Releasable r1 = (com.eclipsesource.p043v8.Releasable) r1
            r1.release()
        L44:
            r0.close()
            throw r2
    }

    public static java.lang.Object getValue(com.eclipsesource.p043v8.V8Object r1, java.lang.String r2) {
            com.eclipsesource.v8.utils.TypeAdapter r0 = com.eclipsesource.p043v8.utils.V8ObjectUtils.DEFAULT_TYPE_ADAPTER
            java.lang.Object r1 = getValue(r1, r2, r0)
            return r1
    }

    public static java.lang.Object getValue(com.eclipsesource.p043v8.V8Object r2, java.lang.String r3, com.eclipsesource.p043v8.utils.TypeAdapter r4) {
            com.eclipsesource.v8.utils.V8Map r0 = new com.eclipsesource.v8.utils.V8Map
            r0.<init>()
            java.lang.Object r1 = r2.get(r3)     // Catch: java.lang.Throwable -> L39
            int r2 = r2.getType(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.Object r2 = getValue(r1, r2, r0, r4)     // Catch: java.lang.Throwable -> L37
            if (r2 != r1) goto L2a
            boolean r3 = r2 instanceof com.eclipsesource.p043v8.V8Value     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L2a
            com.eclipsesource.v8.V8Value r2 = (com.eclipsesource.p043v8.V8Value) r2     // Catch: java.lang.Throwable -> L37
            com.eclipsesource.v8.V8Value r2 = r2.twin()     // Catch: java.lang.Throwable -> L37
            boolean r3 = r1 instanceof com.eclipsesource.p043v8.Releasable
            if (r3 == 0) goto L26
            com.eclipsesource.v8.Releasable r1 = (com.eclipsesource.p043v8.Releasable) r1
            r1.release()
        L26:
            r0.close()
            return r2
        L2a:
            boolean r3 = r1 instanceof com.eclipsesource.p043v8.Releasable
            if (r3 == 0) goto L33
            com.eclipsesource.v8.Releasable r1 = (com.eclipsesource.p043v8.Releasable) r1
            r1.release()
        L33:
            r0.close()
            return r2
        L37:
            r2 = move-exception
            goto L3b
        L39:
            r2 = move-exception
            r1 = 0
        L3b:
            boolean r3 = r1 instanceof com.eclipsesource.p043v8.Releasable
            if (r3 == 0) goto L44
            com.eclipsesource.v8.Releasable r1 = (com.eclipsesource.p043v8.Releasable) r1
            r1.release()
        L44:
            r0.close()
            throw r2
    }

    public static java.lang.Object getValue(java.lang.Object r1) {
            com.eclipsesource.v8.utils.TypeAdapter r0 = com.eclipsesource.p043v8.utils.V8ObjectUtils.DEFAULT_TYPE_ADAPTER
            java.lang.Object r1 = getValue(r1, r0)
            return r1
    }

    private static java.lang.Object getValue(java.lang.Object r2, int r3, com.eclipsesource.p043v8.utils.V8Map<java.lang.Object> r4, com.eclipsesource.p043v8.utils.TypeAdapter r5) {
            java.lang.Object r0 = r5.adapt(r3, r2)
            java.lang.Object r1 = com.eclipsesource.p043v8.utils.TypeAdapter.DEFAULT
            if (r1 == r0) goto L9
            return r0
        L9:
            r0 = 10
            if (r3 == r0) goto L4b
            r0 = 99
            if (r3 == r0) goto L46
            switch(r3) {
                case 0: goto L44;
                case 1: goto L43;
                case 2: goto L43;
                case 3: goto L43;
                case 4: goto L43;
                case 5: goto L3d;
                case 6: goto L36;
                case 7: goto L33;
                case 8: goto L2b;
                default: goto L14;
            }
        L14:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r4 = "Cannot convert type "
            java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
            java.lang.String r3 = com.eclipsesource.p043v8.V8Value.getStringRepresentation(r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L2b:
            com.eclipsesource.v8.utils.TypedArray r3 = new com.eclipsesource.v8.utils.TypedArray
            com.eclipsesource.v8.V8TypedArray r2 = (com.eclipsesource.p043v8.V8TypedArray) r2
            r3.<init>(r2)
            return r3
        L33:
            java.lang.Object r2 = com.eclipsesource.p043v8.utils.V8ObjectUtils.IGNORE
            return r2
        L36:
            com.eclipsesource.v8.V8Object r2 = (com.eclipsesource.p043v8.V8Object) r2
            java.util.Map r2 = toMap(r2, r4, r5)
            return r2
        L3d:
            com.eclipsesource.v8.V8Array r2 = (com.eclipsesource.p043v8.V8Array) r2
            java.util.List r2 = toList(r2, r4, r5)
        L43:
            return r2
        L44:
            r2 = 0
            return r2
        L46:
            com.eclipsesource.v8.V8Value r2 = com.eclipsesource.p043v8.C1032V8.getUndefined()
            return r2
        L4b:
            com.eclipsesource.v8.utils.ArrayBuffer r3 = new com.eclipsesource.v8.utils.ArrayBuffer
            com.eclipsesource.v8.V8ArrayBuffer r2 = (com.eclipsesource.p043v8.V8ArrayBuffer) r2
            r3.<init>(r2)
            return r3
    }

    public static java.lang.Object getValue(java.lang.Object r2, com.eclipsesource.p043v8.utils.TypeAdapter r3) {
            com.eclipsesource.v8.utils.V8Map r0 = new com.eclipsesource.v8.utils.V8Map
            r0.<init>()
            boolean r1 = r2 instanceof com.eclipsesource.p043v8.V8Value     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L18
            r1 = r2
            com.eclipsesource.v8.V8Value r1 = (com.eclipsesource.p043v8.V8Value) r1     // Catch: java.lang.Throwable -> L1c
            int r1 = r1.getV8Type()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = getValue(r2, r1, r0, r3)     // Catch: java.lang.Throwable -> L1c
            r0.close()
            return r2
        L18:
            r0.close()
            return r2
        L1c:
            r2 = move-exception
            r0.close()
            throw r2
    }

    public static void pushValue(com.eclipsesource.p043v8.C1032V8 r1, com.eclipsesource.p043v8.V8Array r2, java.lang.Object r3) {
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            pushValue(r1, r2, r3, r0)     // Catch: java.lang.Throwable -> L21
            java.util.Collection r1 = r0.values()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            com.eclipsesource.v8.V8Value r2 = (com.eclipsesource.p043v8.V8Value) r2
            r2.close()
            goto L10
        L20:
            return
        L21:
            r1 = move-exception
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r2.next()
            com.eclipsesource.v8.V8Value r3 = (com.eclipsesource.p043v8.V8Value) r3
            r3.close()
            goto L2a
        L3a:
            throw r1
    }

    private static void pushValue(com.eclipsesource.p043v8.C1032V8 r1, com.eclipsesource.p043v8.V8Array r2, java.lang.Object r3, java.util.Map<java.lang.Object, com.eclipsesource.p043v8.V8Value> r4) {
            if (r3 != 0) goto L7
            r2.pushUndefined()
            goto L74
        L7:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto Lc
            goto L38
        Lc:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L20
            java.lang.Double r1 = new java.lang.Double
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            double r3 = (double) r3
            r1.<init>(r3)
            r2.push(r1)
            goto L74
        L20:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L25
            goto L38
        L25:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L2a
            goto L38
        L2a:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L34
            java.lang.String r3 = (java.lang.String) r3
            r2.push(r3)
            goto L74
        L34:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L3c
        L38:
            r2.push(r3)
            goto L74
        L3c:
            boolean r0 = r3 instanceof com.eclipsesource.p043v8.utils.TypedArray
            if (r0 == 0) goto L47
            com.eclipsesource.v8.utils.TypedArray r3 = (com.eclipsesource.p043v8.utils.TypedArray) r3
            com.eclipsesource.v8.V8TypedArray r1 = toV8TypedArray(r1, r3, r4)
            goto L71
        L47:
            boolean r0 = r3 instanceof com.eclipsesource.p043v8.utils.ArrayBuffer
            if (r0 == 0) goto L52
            com.eclipsesource.v8.utils.ArrayBuffer r3 = (com.eclipsesource.p043v8.utils.ArrayBuffer) r3
            com.eclipsesource.v8.V8ArrayBuffer r1 = toV8ArrayBuffer(r1, r3, r4)
            goto L71
        L52:
            boolean r0 = r3 instanceof com.eclipsesource.p043v8.V8Value
            if (r0 == 0) goto L5c
            com.eclipsesource.v8.V8Value r3 = (com.eclipsesource.p043v8.V8Value) r3
            r2.push(r3)
            goto L74
        L5c:
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L67
            java.util.Map r3 = (java.util.Map) r3
            com.eclipsesource.v8.V8Object r1 = toV8Object(r1, r3, r4)
            goto L71
        L67:
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L75
            java.util.List r3 = (java.util.List) r3
            com.eclipsesource.v8.V8Array r1 = toV8Array(r1, r3, r4)
        L71:
            r2.push(r1)
        L74:
            return
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unsupported Object of type: "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.Class r3 = r3.getClass()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private static void setValue(com.eclipsesource.p043v8.C1032V8 r1, com.eclipsesource.p043v8.V8Object r2, java.lang.String r3, java.lang.Object r4, java.util.Map<java.lang.Object, com.eclipsesource.p043v8.V8Value> r5) {
            if (r4 != 0) goto L7
            r2.addUndefined(r3)
            goto L8c
        L7:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L16
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r1 = r4.intValue()
            r2.add(r3, r1)
            goto L8c
        L16:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L22
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            double r4 = (double) r4
            goto L38
        L22:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L2d
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            goto L38
        L2d:
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 == 0) goto L3c
            java.lang.Float r4 = (java.lang.Float) r4
            float r1 = r4.floatValue()
            double r4 = (double) r1
        L38:
            r2.add(r3, r4)
            goto L8c
        L3c:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L46
            java.lang.String r4 = (java.lang.String) r4
            r2.add(r3, r4)
            goto L8c
        L46:
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 == 0) goto L54
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r1 = r4.booleanValue()
            r2.add(r3, r1)
            goto L8c
        L54:
            boolean r0 = r4 instanceof com.eclipsesource.p043v8.utils.TypedArray
            if (r0 == 0) goto L5f
            com.eclipsesource.v8.utils.TypedArray r4 = (com.eclipsesource.p043v8.utils.TypedArray) r4
            com.eclipsesource.v8.V8TypedArray r1 = toV8TypedArray(r1, r4, r5)
            goto L89
        L5f:
            boolean r0 = r4 instanceof com.eclipsesource.p043v8.utils.ArrayBuffer
            if (r0 == 0) goto L6a
            com.eclipsesource.v8.utils.ArrayBuffer r4 = (com.eclipsesource.p043v8.utils.ArrayBuffer) r4
            com.eclipsesource.v8.V8ArrayBuffer r1 = toV8ArrayBuffer(r1, r4, r5)
            goto L89
        L6a:
            boolean r0 = r4 instanceof com.eclipsesource.p043v8.V8Value
            if (r0 == 0) goto L74
            com.eclipsesource.v8.V8Value r4 = (com.eclipsesource.p043v8.V8Value) r4
            r2.add(r3, r4)
            goto L8c
        L74:
            boolean r0 = r4 instanceof java.util.Map
            if (r0 == 0) goto L7f
            java.util.Map r4 = (java.util.Map) r4
            com.eclipsesource.v8.V8Object r1 = toV8Object(r1, r4, r5)
            goto L89
        L7f:
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto L8d
            java.util.List r4 = (java.util.List) r4
            com.eclipsesource.v8.V8Array r1 = toV8Array(r1, r4, r5)
        L89:
            r2.add(r3, r1)
        L8c:
            return
        L8d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unsupported Object of type: "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.Class r3 = r4.getClass()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static java.util.List<? super java.lang.Object> toList(com.eclipsesource.p043v8.V8Array r1) {
            com.eclipsesource.v8.utils.TypeAdapter r0 = com.eclipsesource.p043v8.utils.V8ObjectUtils.DEFAULT_TYPE_ADAPTER
            java.util.List r1 = toList(r1, r0)
            return r1
    }

    public static java.util.List<? super java.lang.Object> toList(com.eclipsesource.p043v8.V8Array r1, com.eclipsesource.p043v8.utils.TypeAdapter r2) {
            com.eclipsesource.v8.utils.V8Map r0 = new com.eclipsesource.v8.utils.V8Map
            r0.<init>()
            java.util.List r1 = toList(r1, r0, r2)     // Catch: java.lang.Throwable -> Ld
            r0.close()
            return r1
        Ld:
            r1 = move-exception
            r0.close()
            throw r1
    }

    private static java.util.List<? super java.lang.Object> toList(com.eclipsesource.p043v8.V8Array r5, com.eclipsesource.p043v8.utils.V8Map<java.lang.Object> r6, com.eclipsesource.p043v8.utils.TypeAdapter r7) {
            if (r5 != 0) goto L7
            java.util.List r5 = java.util.Collections.emptyList()
            return r5
        L7:
            boolean r0 = r6.containsKey(r5)
            if (r0 == 0) goto L14
            java.lang.Object r5 = r6.get(r5)
            java.util.List r5 = (java.util.List) r5
            return r5
        L14:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.put2(r5, r0)
            r1 = 0
        L1d:
            int r2 = r5.length()
            if (r1 >= r2) goto L4e
            r2 = 0
            java.lang.Object r2 = r5.get(r1)     // Catch: java.lang.Throwable -> L43
            int r3 = r5.getType(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.Object r3 = getValue(r2, r3, r6, r7)     // Catch: java.lang.Throwable -> L43
            java.lang.Object r4 = com.eclipsesource.p043v8.utils.V8ObjectUtils.IGNORE     // Catch: java.lang.Throwable -> L43
            if (r3 == r4) goto L37
            r0.add(r3)     // Catch: java.lang.Throwable -> L43
        L37:
            boolean r3 = r2 instanceof com.eclipsesource.p043v8.Releasable
            if (r3 == 0) goto L40
            com.eclipsesource.v8.Releasable r2 = (com.eclipsesource.p043v8.Releasable) r2
            r2.release()
        L40:
            int r1 = r1 + 1
            goto L1d
        L43:
            r5 = move-exception
            boolean r6 = r2 instanceof com.eclipsesource.p043v8.Releasable
            if (r6 == 0) goto L4d
            com.eclipsesource.v8.Releasable r2 = (com.eclipsesource.p043v8.Releasable) r2
            r2.release()
        L4d:
            throw r5
        L4e:
            return r0
    }

    public static java.util.Map<java.lang.String, ? super java.lang.Object> toMap(com.eclipsesource.p043v8.V8Object r1) {
            com.eclipsesource.v8.utils.TypeAdapter r0 = com.eclipsesource.p043v8.utils.V8ObjectUtils.DEFAULT_TYPE_ADAPTER
            java.util.Map r1 = toMap(r1, r0)
            return r1
    }

    public static java.util.Map<java.lang.String, ? super java.lang.Object> toMap(com.eclipsesource.p043v8.V8Object r1, com.eclipsesource.p043v8.utils.TypeAdapter r2) {
            com.eclipsesource.v8.utils.V8Map r0 = new com.eclipsesource.v8.utils.V8Map
            r0.<init>()
            java.util.Map r1 = toMap(r1, r0, r2)     // Catch: java.lang.Throwable -> Ld
            r0.close()
            return r1
        Ld:
            r1 = move-exception
            r0.close()
            throw r1
    }

    private static java.util.Map<java.lang.String, ? super java.lang.Object> toMap(com.eclipsesource.p043v8.V8Object r8, com.eclipsesource.p043v8.utils.V8Map<java.lang.Object> r9, com.eclipsesource.p043v8.utils.TypeAdapter r10) {
            if (r8 != 0) goto L7
            java.util.Map r8 = java.util.Collections.emptyMap()
            return r8
        L7:
            boolean r0 = r9.containsKey(r8)
            if (r0 == 0) goto L14
            java.lang.Object r8 = r9.get(r8)
            java.util.Map r8 = (java.util.Map) r8
            return r8
        L14:
            com.eclipsesource.v8.utils.V8PropertyMap r0 = new com.eclipsesource.v8.utils.V8PropertyMap
            r0.<init>()
            r9.put2(r8, r0)
            java.lang.String[] r1 = r8.getKeys()
            int r2 = r1.length
            r3 = 0
        L22:
            if (r3 >= r2) goto L51
            r4 = r1[r3]
            r5 = 0
            java.lang.Object r5 = r8.get(r4)     // Catch: java.lang.Throwable -> L46
            int r6 = r8.getType(r4)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r6 = getValue(r5, r6, r9, r10)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r7 = com.eclipsesource.p043v8.utils.V8ObjectUtils.IGNORE     // Catch: java.lang.Throwable -> L46
            if (r6 == r7) goto L3a
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L46
        L3a:
            boolean r4 = r5 instanceof com.eclipsesource.p043v8.Releasable
            if (r4 == 0) goto L43
            com.eclipsesource.v8.Releasable r5 = (com.eclipsesource.p043v8.Releasable) r5
            r5.release()
        L43:
            int r3 = r3 + 1
            goto L22
        L46:
            r8 = move-exception
            boolean r9 = r5 instanceof com.eclipsesource.p043v8.Releasable
            if (r9 == 0) goto L50
            com.eclipsesource.v8.Releasable r5 = (com.eclipsesource.p043v8.Releasable) r5
            r5.release()
        L50:
            throw r8
        L51:
            return r0
    }

    public static com.eclipsesource.p043v8.V8Array toV8Array(com.eclipsesource.p043v8.C1032V8 r1, java.util.List<? extends java.lang.Object> r2) {
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            com.eclipsesource.v8.V8Array r1 = toV8Array(r1, r2, r0)     // Catch: java.lang.Throwable -> L26
            com.eclipsesource.v8.V8Array r1 = r1.twin()     // Catch: java.lang.Throwable -> L26
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            com.eclipsesource.v8.V8Value r0 = (com.eclipsesource.p043v8.V8Value) r0
            r0.close()
            goto L15
        L25:
            return r1
        L26:
            r1 = move-exception
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L2f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r2.next()
            com.eclipsesource.v8.V8Value r0 = (com.eclipsesource.p043v8.V8Value) r0
            r0.close()
            goto L2f
        L3f:
            throw r1
    }

    private static com.eclipsesource.p043v8.V8Array toV8Array(com.eclipsesource.p043v8.C1032V8 r3, java.util.List<? extends java.lang.Object> r4, java.util.Map<java.lang.Object, com.eclipsesource.p043v8.V8Value> r5) {
            com.eclipsesource.v8.utils.V8ObjectUtils$ListWrapper r0 = new com.eclipsesource.v8.utils.V8ObjectUtils$ListWrapper
            r0.<init>(r4)
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L17
            com.eclipsesource.v8.utils.V8ObjectUtils$ListWrapper r3 = new com.eclipsesource.v8.utils.V8ObjectUtils$ListWrapper
            r3.<init>(r4)
            java.lang.Object r3 = r5.get(r3)
            com.eclipsesource.v8.V8Array r3 = (com.eclipsesource.p043v8.V8Array) r3
            return r3
        L17:
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            r0.<init>(r3)
            com.eclipsesource.v8.utils.V8ObjectUtils$ListWrapper r1 = new com.eclipsesource.v8.utils.V8ObjectUtils$ListWrapper
            r1.<init>(r4)
            r5.put(r1, r0)
            r1 = 0
        L25:
            int r2 = r4.size()     // Catch: java.lang.IllegalStateException -> L36
            if (r1 >= r2) goto L35
            java.lang.Object r2 = r4.get(r1)     // Catch: java.lang.IllegalStateException -> L36
            pushValue(r3, r0, r2, r5)     // Catch: java.lang.IllegalStateException -> L36
            int r1 = r1 + 1
            goto L25
        L35:
            return r0
        L36:
            r3 = move-exception
            r0.close()
            throw r3
    }

    private static com.eclipsesource.p043v8.V8ArrayBuffer toV8ArrayBuffer(com.eclipsesource.p043v8.C1032V8 r0, com.eclipsesource.p043v8.utils.ArrayBuffer r1, java.util.Map<java.lang.Object, com.eclipsesource.p043v8.V8Value> r2) {
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r2.get(r1)
            com.eclipsesource.v8.V8ArrayBuffer r0 = (com.eclipsesource.p043v8.V8ArrayBuffer) r0
            return r0
        Ld:
            com.eclipsesource.v8.V8ArrayBuffer r0 = r1.getV8ArrayBuffer()
            r2.put(r1, r0)
            return r0
    }

    public static com.eclipsesource.p043v8.V8Object toV8Object(com.eclipsesource.p043v8.C1032V8 r1, java.util.Map<java.lang.String, ? extends java.lang.Object> r2) {
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            com.eclipsesource.v8.V8Object r1 = toV8Object(r1, r2, r0)     // Catch: java.lang.Throwable -> L26
            com.eclipsesource.v8.V8Object r1 = r1.twin()     // Catch: java.lang.Throwable -> L26
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            com.eclipsesource.v8.V8Value r0 = (com.eclipsesource.p043v8.V8Value) r0
            r0.close()
            goto L15
        L25:
            return r1
        L26:
            r1 = move-exception
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L2f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r2.next()
            com.eclipsesource.v8.V8Value r0 = (com.eclipsesource.p043v8.V8Value) r0
            r0.close()
            goto L2f
        L3f:
            throw r1
    }

    private static com.eclipsesource.p043v8.V8Object toV8Object(com.eclipsesource.p043v8.C1032V8 r3, java.util.Map<java.lang.String, ? extends java.lang.Object> r4, java.util.Map<java.lang.Object, com.eclipsesource.p043v8.V8Value> r5) {
            boolean r0 = r5.containsKey(r4)
            if (r0 == 0) goto Ld
            java.lang.Object r3 = r5.get(r4)
            com.eclipsesource.v8.V8Object r3 = (com.eclipsesource.p043v8.V8Object) r3
            return r3
        Ld:
            com.eclipsesource.v8.V8Object r0 = new com.eclipsesource.v8.V8Object
            r0.<init>(r3)
            r5.put(r4, r0)
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.IllegalStateException -> L38
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.IllegalStateException -> L38
        L1d:
            boolean r1 = r4.hasNext()     // Catch: java.lang.IllegalStateException -> L38
            if (r1 == 0) goto L37
            java.lang.Object r1 = r4.next()     // Catch: java.lang.IllegalStateException -> L38
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.IllegalStateException -> L38
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.IllegalStateException -> L38
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.IllegalStateException -> L38
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.IllegalStateException -> L38
            setValue(r3, r0, r2, r1, r5)     // Catch: java.lang.IllegalStateException -> L38
            goto L1d
        L37:
            return r0
        L38:
            r3 = move-exception
            r0.close()
            throw r3
    }

    private static com.eclipsesource.p043v8.V8TypedArray toV8TypedArray(com.eclipsesource.p043v8.C1032V8 r0, com.eclipsesource.p043v8.utils.TypedArray r1, java.util.Map<java.lang.Object, com.eclipsesource.p043v8.V8Value> r2) {
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r2.get(r1)
            com.eclipsesource.v8.V8TypedArray r0 = (com.eclipsesource.p043v8.V8TypedArray) r0
            return r0
        Ld:
            com.eclipsesource.v8.V8TypedArray r0 = r1.getV8TypedArray()
            r2.put(r1, r0)
            return r0
    }
}
