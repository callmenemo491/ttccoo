package com.eclipsesource.p043v8;

/* renamed from: com.eclipsesource.v8.V8 */
/* loaded from: classes.dex */
public class C1032V8 extends com.eclipsesource.p043v8.V8Object {
    private static boolean initialized = false;
    private static java.lang.Object invalid = null;
    private static java.lang.Object lock = null;
    private static boolean nativeLibraryLoaded = false;
    private static java.lang.Error nativeLoadError;
    private static java.lang.Exception nativeLoadException;
    private static volatile int runtimeCounter;
    private static com.eclipsesource.p043v8.V8Value undefined;
    private static java.lang.String v8Flags;
    private java.util.Map<java.lang.String, java.lang.Object> data;
    private com.eclipsesource.p043v8.utils.V8Map<com.eclipsesource.p043v8.utils.V8Executor> executors;
    private boolean forceTerminateExecutors;
    private java.util.Map<java.lang.Long, com.eclipsesource.p043v8.C1032V8.MethodDescriptor> functionRegistry;
    private final com.eclipsesource.p043v8.V8Locker locker;
    private long objectReferences;
    private java.util.LinkedList<com.eclipsesource.p043v8.ReferenceHandler> referenceHandlers;
    private java.util.LinkedList<com.eclipsesource.p043v8.utils.V8Runnable> releaseHandlers;
    private java.util.List<com.eclipsesource.p043v8.Releasable> resources;
    private long v8RuntimePtr;
    public java.util.Map<java.lang.Long, com.eclipsesource.p043v8.V8Value> v8WeakReferences;

    /* renamed from: com.eclipsesource.v8.V8$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* renamed from: com.eclipsesource.v8.V8$MethodDescriptor */
    public class MethodDescriptor {
        public com.eclipsesource.p043v8.JavaCallback callback;
        public boolean includeReceiver;
        public java.lang.reflect.Method method;
        public java.lang.Object object;
        public final /* synthetic */ com.eclipsesource.p043v8.C1032V8 this$0;
        public com.eclipsesource.p043v8.JavaVoidCallback voidCallback;

        private MethodDescriptor(com.eclipsesource.p043v8.C1032V8 r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ MethodDescriptor(com.eclipsesource.p043v8.C1032V8 r1, com.eclipsesource.p043v8.C1032V8.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.eclipsesource.p043v8.C1032V8.lock = r0
            com.eclipsesource.v8.V8Object$Undefined r0 = new com.eclipsesource.v8.V8Object$Undefined
            r0.<init>()
            com.eclipsesource.p043v8.C1032V8.undefined = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.eclipsesource.p043v8.C1032V8.invalid = r0
            return
    }

    public C1032V8() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public C1032V8(java.lang.String r4) {
            r3 = this;
            r0 = 0
            r3.<init>(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.v8WeakReferences = r1
            r3.data = r0
            r1 = 0
            r3.objectReferences = r1
            r3.v8RuntimePtr = r1
            r3.resources = r0
            r3.executors = r0
            r0 = 0
            r3.forceTerminateExecutors = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.functionRegistry = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r3.referenceHandlers = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r3.releaseHandlers = r1
            r3.released = r0
            long r0 = r3._createIsolate(r4)
            r3.v8RuntimePtr = r0
            com.eclipsesource.v8.V8Locker r4 = new com.eclipsesource.v8.V8Locker
            r4.<init>(r3)
            r3.locker = r4
            r3.checkThread()
            long r0 = r3.v8RuntimePtr
            long r0 = r3._getGlobalObject(r0)
            r3.objectHandle = r0
            return
    }

    private native void _acquireLock(long r1);

    private native void _add(long r1, long r3, java.lang.String r5, double r6);

    private native void _add(long r1, long r3, java.lang.String r5, int r6);

    private native void _add(long r1, long r3, java.lang.String r5, java.lang.String r6);

    private native void _add(long r1, long r3, java.lang.String r5, boolean r6);

    private native void _addArrayBooleanItem(long r1, long r3, boolean r5);

    private native void _addArrayDoubleItem(long r1, long r3, double r5);

    private native void _addArrayIntItem(long r1, long r3, int r5);

    private native void _addArrayNullItem(long r1, long r3);

    private native void _addArrayObjectItem(long r1, long r3, long r5);

    private native void _addArrayStringItem(long r1, long r3, java.lang.String r5);

    private native void _addArrayUndefinedItem(long r1, long r3);

    private native void _addNull(long r1, long r3, java.lang.String r5);

    private native void _addObject(long r1, long r3, java.lang.String r5, long r6);

    private native void _addUndefined(long r1, long r3, java.lang.String r5);

    private native java.lang.Object _arrayGet(long r1, int r3, long r4, int r6);

    private native boolean _arrayGetBoolean(long r1, long r3, int r5);

    private native int _arrayGetBooleans(long r1, long r3, int r5, int r6, boolean[] r7);

    private native boolean[] _arrayGetBooleans(long r1, long r3, int r5, int r6);

    private native byte _arrayGetByte(long r1, long r3, int r5);

    private native int _arrayGetBytes(long r1, long r3, int r5, int r6, byte[] r7);

    private native byte[] _arrayGetBytes(long r1, long r3, int r5, int r6);

    private native double _arrayGetDouble(long r1, long r3, int r5);

    private native int _arrayGetDoubles(long r1, long r3, int r5, int r6, double[] r7);

    private native double[] _arrayGetDoubles(long r1, long r3, int r5, int r6);

    private native int _arrayGetInteger(long r1, long r3, int r5);

    private native int _arrayGetIntegers(long r1, long r3, int r5, int r6, int[] r7);

    private native int[] _arrayGetIntegers(long r1, long r3, int r5, int r6);

    private native int _arrayGetSize(long r1, long r3);

    private native java.lang.String _arrayGetString(long r1, long r3, int r5);

    private native int _arrayGetStrings(long r1, long r3, int r5, int r6, java.lang.String[] r7);

    private native java.lang.String[] _arrayGetStrings(long r1, long r3, int r5, int r6);

    private native void _clearWeak(long r1, long r3);

    private native boolean _contains(long r1, long r3, java.lang.String r5);

    private native long _createInspector(long r1, com.eclipsesource.p043v8.inspector.V8InspectorDelegate r3, java.lang.String r4);

    private native long _createIsolate(java.lang.String r1);

    private native void _createTwin(long r1, long r3, long r5);

    private native java.nio.ByteBuffer _createV8ArrayBufferBackingStore(long r1, long r3, int r5);

    private native void _dispatchProtocolMessage(long r1, long r3, java.lang.String r5);

    private native boolean _equals(long r1, long r3, long r5);

    private native boolean _executeBooleanFunction(long r1, long r3, java.lang.String r5, long r6);

    private native boolean _executeBooleanScript(long r1, java.lang.String r3, java.lang.String r4, int r5);

    private native double _executeDoubleFunction(long r1, long r3, java.lang.String r5, long r6);

    private native double _executeDoubleScript(long r1, java.lang.String r3, java.lang.String r4, int r5);

    private native java.lang.Object _executeFunction(long r1, int r3, long r4, java.lang.String r6, long r7);

    private native java.lang.Object _executeFunction(long r1, long r3, long r5, long r7);

    private native int _executeIntegerFunction(long r1, long r3, java.lang.String r5, long r6);

    private native int _executeIntegerScript(long r1, java.lang.String r3, java.lang.String r4, int r5);

    private native java.lang.Object _executeScript(long r1, int r3, java.lang.String r4, java.lang.String r5, int r6);

    private native java.lang.String _executeStringFunction(long r1, long r3, java.lang.String r5, long r6);

    private native java.lang.String _executeStringScript(long r1, java.lang.String r3, java.lang.String r4, int r5);

    private native void _executeVoidFunction(long r1, long r3, java.lang.String r5, long r6);

    private native void _executeVoidScript(long r1, java.lang.String r3, java.lang.String r4, int r5);

    private native java.lang.Object _get(long r1, int r3, long r4, java.lang.String r6);

    private native int _getArrayType(long r1, long r3);

    private native boolean _getBoolean(long r1, long r3, java.lang.String r5);

    private native long _getBuildID();

    private native java.lang.String _getConstructorName(long r1, long r3);

    private native double _getDouble(long r1, long r3, java.lang.String r5);

    private native long _getGlobalObject(long r1);

    private native int _getInteger(long r1, long r3, java.lang.String r5);

    private native java.lang.String[] _getKeys(long r1, long r3);

    private native java.lang.String _getString(long r1, long r3, java.lang.String r5);

    private native int _getType(long r1, long r3);

    private native int _getType(long r1, long r3, int r5);

    private native int _getType(long r1, long r3, int r5, int r6);

    private native int _getType(long r1, long r3, java.lang.String r5);

    private static native java.lang.String _getVersion();

    private native int _identityHash(long r1, long r3);

    private native long _initEmptyContainer(long r1);

    private native long _initNewV8Array(long r1);

    private native long _initNewV8ArrayBuffer(long r1, int r3);

    private native long _initNewV8ArrayBuffer(long r1, java.nio.ByteBuffer r3, int r4);

    private native long _initNewV8Float32Array(long r1, long r3, int r5, int r6);

    private native long _initNewV8Float64Array(long r1, long r3, int r5, int r6);

    private native long[] _initNewV8Function(long r1);

    private native long _initNewV8Int16Array(long r1, long r3, int r5, int r6);

    private native long _initNewV8Int32Array(long r1, long r3, int r5, int r6);

    private native long _initNewV8Int8Array(long r1, long r3, int r5, int r6);

    private native long _initNewV8Object(long r1);

    private native long _initNewV8UInt16Array(long r1, long r3, int r5, int r6);

    private native long _initNewV8UInt32Array(long r1, long r3, int r5, int r6);

    private native long _initNewV8UInt8Array(long r1, long r3, int r5, int r6);

    private native long _initNewV8UInt8ClampedArray(long r1, long r3, int r5, int r6);

    private static native boolean _isNodeCompatible();

    private static native boolean _isRunning(long r0);

    private native boolean _isWeak(long r1, long r3);

    private native void _lowMemoryNotification(long r1);

    private static native boolean _pumpMessageLoop(long r0);

    private native long _registerJavaMethod(long r1, long r3, java.lang.String r5, boolean r6);

    private native void _release(long r1, long r3);

    private native void _releaseLock(long r1);

    private native void _releaseMethodDescriptor(long r1, long r3);

    private native void _releaseRuntime(long r1);

    private native boolean _sameValue(long r1, long r3, long r5);

    private native void _schedulePauseOnNextStatement(long r1, long r3, java.lang.String r5);

    private static native void _setFlags(java.lang.String r0);

    private native void _setPrototype(long r1, long r3, long r5);

    private native void _setWeak(long r1, long r3);

    private static native void _startNodeJS(long r0, java.lang.String r2);

    private native boolean _strictEquals(long r1, long r3, long r5);

    private native void _terminateExecution(long r1);

    private native java.lang.String _toString(long r1, long r3);

    private void checkArgs(java.lang.Object[] r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L15
            r2 = r5[r1]
            java.lang.Object r3 = com.eclipsesource.p043v8.C1032V8.invalid
            if (r2 == r3) goto Ld
            int r1 = r1 + 1
            goto L2
        Ld:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "argument type mismatch"
            r5.<init>(r0)
            throw r5
        L15:
            return
    }

    private static void checkNativeLibraryLoaded() {
            boolean r0 = com.eclipsesource.p043v8.C1032V8.nativeLibraryLoaded
            if (r0 != 0) goto L4a
            r0 = 1
            java.lang.String r0 = com.eclipsesource.p043v8.LibraryLoader.computeLibraryShortName(r0)
            r1 = 0
            java.lang.String r1 = com.eclipsesource.p043v8.LibraryLoader.computeLibraryShortName(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "J2V8 native library not loaded ("
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "/"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.Error r1 = com.eclipsesource.p043v8.C1032V8.nativeLoadError
            if (r1 != 0) goto L42
            java.lang.Exception r1 = com.eclipsesource.p043v8.C1032V8.nativeLoadException
            if (r1 == 0) goto L3c
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Exception r2 = com.eclipsesource.p043v8.C1032V8.nativeLoadException
            r1.<init>(r0, r2)
            throw r1
        L3c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L42:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Error r2 = com.eclipsesource.p043v8.C1032V8.nativeLoadError
            r1.<init>(r0, r2)
            throw r1
        L4a:
            return
    }

    private java.lang.Object checkResult(java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return r3
        L3:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L12
            java.lang.Float r3 = (java.lang.Float) r3
            double r0 = r3.doubleValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
        L12:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L50
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 != 0) goto L50
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 != 0) goto L50
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L23
            goto L50
        L23:
            boolean r0 = r3 instanceof com.eclipsesource.p043v8.V8Value
            if (r0 == 0) goto L39
            r0 = r3
            com.eclipsesource.v8.V8Value r0 = (com.eclipsesource.p043v8.V8Value) r0
            boolean r0 = r0.isReleased()
            if (r0 != 0) goto L31
            return r3
        L31:
            com.eclipsesource.v8.V8RuntimeException r3 = new com.eclipsesource.v8.V8RuntimeException
            java.lang.String r0 = "V8Value already released"
            r3.<init>(r0)
            throw r3
        L39:
            com.eclipsesource.v8.V8RuntimeException r0 = new com.eclipsesource.v8.V8RuntimeException
            java.lang.String r1 = "Unknown return type: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.Class r3 = r3.getClass()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L50:
            return r3
    }

    public static void checkScript(java.lang.String r1) {
            java.lang.String r0 = "Script is null"
            java.util.Objects.requireNonNull(r1, r0)
            return
    }

    public static com.eclipsesource.p043v8.C1032V8 createV8Runtime() {
            r0 = 0
            com.eclipsesource.v8.V8 r0 = createV8Runtime(r0, r0)
            return r0
    }

    public static com.eclipsesource.p043v8.C1032V8 createV8Runtime(java.lang.String r1) {
            r0 = 0
            com.eclipsesource.v8.V8 r1 = createV8Runtime(r1, r0)
            return r1
    }

    public static com.eclipsesource.p043v8.C1032V8 createV8Runtime(java.lang.String r2, java.lang.String r3) {
            boolean r0 = com.eclipsesource.p043v8.C1032V8.nativeLibraryLoaded
            if (r0 != 0) goto L13
            java.lang.Object r0 = com.eclipsesource.p043v8.C1032V8.lock
            monitor-enter(r0)
            boolean r1 = com.eclipsesource.p043v8.C1032V8.nativeLibraryLoaded     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto Le
            load(r3)     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
        L13:
            checkNativeLibraryLoaded()
            boolean r3 = com.eclipsesource.p043v8.C1032V8.initialized
            r0 = 1
            if (r3 != 0) goto L22
            java.lang.String r3 = com.eclipsesource.p043v8.C1032V8.v8Flags
            _setFlags(r3)
            com.eclipsesource.p043v8.C1032V8.initialized = r0
        L22:
            com.eclipsesource.v8.V8 r3 = new com.eclipsesource.v8.V8
            r3.<init>(r2)
            java.lang.Object r2 = com.eclipsesource.p043v8.C1032V8.lock
            monitor-enter(r2)
            int r1 = com.eclipsesource.p043v8.C1032V8.runtimeCounter     // Catch: java.lang.Throwable -> L31
            int r1 = r1 + r0
            com.eclipsesource.p043v8.C1032V8.runtimeCounter = r1     // Catch: java.lang.Throwable -> L31
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            return r3
        L31:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            throw r3
    }

    public static int getActiveRuntimes() {
            int r0 = com.eclipsesource.p043v8.C1032V8.runtimeCounter
            return r0
    }

    private java.lang.Object[] getArgs(com.eclipsesource.p043v8.V8Object r9, com.eclipsesource.p043v8.C1032V8.MethodDescriptor r10, com.eclipsesource.p043v8.V8Array r11, boolean r12) {
            r8 = this;
            java.lang.reflect.Method r0 = r10.method
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r0 = r0.length
            if (r12 == 0) goto Lc
            int r1 = r0 + (-1)
            goto Ld
        Lc:
            r1 = r0
        Ld:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.reflect.Method r2 = r10.method
            java.lang.Class[] r2 = r2.getParameterTypes()
            boolean r3 = r10.includeReceiver
            java.lang.Object[] r9 = r8.setDefaultValues(r0, r2, r9, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r7 = r10.includeReceiver
            r2 = r8
            r3 = r11
            r4 = r1
            r5 = r9
            r6 = r0
            r2.populateParamters(r3, r4, r5, r6, r7)
            if (r12 == 0) goto L48
            java.lang.reflect.Method r10 = r10.method
            java.lang.Class[] r10 = r10.getParameterTypes()
            int r11 = r0.size()
            java.lang.Object r10 = r8.getVarArgContainer(r10, r11)
            java.lang.Object[] r11 = r0.toArray()
            int r12 = r0.size()
            r0 = 0
            java.lang.System.arraycopy(r11, r0, r10, r0, r12)
            r9[r1] = r10
        L48:
            return r9
    }

    private java.lang.Object getArrayItem(com.eclipsesource.p043v8.V8Array r3, int r4) {
            r2 = this;
            int r0 = r3.getType(r4)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L49
            r1 = 10
            if (r0 == r1) goto L44
            r1 = 99
            if (r0 == r1) goto L3f
            switch(r0) {
                case 1: goto L36;
                case 2: goto L2d;
                case 3: goto L24;
                case 4: goto L1f;
                case 5: goto L1a;
                case 6: goto L15;
                case 7: goto L10;
                case 8: goto L1a;
                default: goto Lf;
            }     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L49
        Lf:
            goto L49
        L10:
            com.eclipsesource.v8.V8Object r3 = r3.getObject(r4)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L49
            return r3
        L15:
            com.eclipsesource.v8.V8Object r3 = r3.getObject(r4)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L49
            return r3
        L1a:
            com.eclipsesource.v8.V8Array r3 = r3.getArray(r4)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L49
            return r3
        L1f:
            java.lang.String r3 = r3.getString(r4)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L49
            return r3
        L24:
            boolean r3 = r3.getBoolean(r4)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L49
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L49
            return r3
        L2d:
            double r3 = r3.getDouble(r4)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L49
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L49
            return r3
        L36:
            int r3 = r3.getInteger(r4)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L49
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L49
            return r3
        L3f:
            com.eclipsesource.v8.V8Value r3 = getUndefined()     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L49
            return r3
        L44:
            java.lang.Object r3 = r3.get(r4)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L49
            return r3
        L49:
            r3 = 0
            return r3
    }

    private java.lang.Object getDefaultValue(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<com.eclipsesource.v8.V8Object> r0 = com.eclipsesource.p043v8.V8Object.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Le
            com.eclipsesource.v8.V8Object$Undefined r2 = new com.eclipsesource.v8.V8Object$Undefined
            r2.<init>()
            return r2
        Le:
            java.lang.Class<com.eclipsesource.v8.V8Array> r0 = com.eclipsesource.p043v8.V8Array.class
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1c
            com.eclipsesource.v8.V8Array$Undefined r2 = new com.eclipsesource.v8.V8Array$Undefined
            r2.<init>()
            return r2
        L1c:
            java.lang.Object r2 = com.eclipsesource.p043v8.C1032V8.invalid
            return r2
    }

    public static java.lang.String getSCMRevision() {
            java.lang.String r0 = "Unknown revision ID"
            return r0
    }

    public static com.eclipsesource.p043v8.V8Value getUndefined() {
            com.eclipsesource.v8.V8Value r0 = com.eclipsesource.p043v8.C1032V8.undefined
            return r0
    }

    public static java.lang.String getV8Version() {
            java.lang.String r0 = _getVersion()
            return r0
    }

    private java.lang.Object getVarArgContainer(java.lang.Class<?>[] r2, int r3) {
            r1 = this;
            int r0 = r2.length
            int r0 = r0 + (-1)
            r2 = r2[r0]
            boolean r0 = r2.isArray()
            if (r0 == 0) goto Lf
            java.lang.Class r2 = r2.getComponentType()
        Lf:
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r3)
            return r2
    }

    public static boolean isLoaded() {
            boolean r0 = com.eclipsesource.p043v8.C1032V8.nativeLibraryLoaded
            return r0
    }

    public static boolean isNodeCompatible() {
            boolean r0 = com.eclipsesource.p043v8.C1032V8.nativeLibraryLoaded
            if (r0 != 0) goto L14
            java.lang.Object r0 = com.eclipsesource.p043v8.C1032V8.lock
            monitor-enter(r0)
            boolean r1 = com.eclipsesource.p043v8.C1032V8.nativeLibraryLoaded     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto Lf
            r1 = 0
            load(r1)     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
        L14:
            boolean r0 = _isNodeCompatible()
            return r0
    }

    private boolean isVoidMethod(java.lang.reflect.Method r2) {
            r1 = this;
            java.lang.Class r2 = r2.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    private static synchronized void load(java.lang.String r1) {
            java.lang.Class<com.eclipsesource.v8.V8> r0 = com.eclipsesource.p043v8.C1032V8.class
            monitor-enter(r0)
            com.eclipsesource.p043v8.LibraryLoader.loadLibrary(r1)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Lc java.lang.Error -> L10
            r1 = 1
            com.eclipsesource.p043v8.C1032V8.nativeLibraryLoaded = r1     // Catch: java.lang.Throwable -> La java.lang.Exception -> Lc java.lang.Error -> L10
            goto L13
        La:
            r1 = move-exception
            goto L15
        Lc:
            r1 = move-exception
            com.eclipsesource.p043v8.C1032V8.nativeLoadException = r1     // Catch: java.lang.Throwable -> La
            goto L13
        L10:
            r1 = move-exception
            com.eclipsesource.p043v8.C1032V8.nativeLoadError = r1     // Catch: java.lang.Throwable -> La
        L13:
            monitor-exit(r0)
            return
        L15:
            monitor-exit(r0)
            throw r1
    }

    private void notifyReferenceCreated(com.eclipsesource.p043v8.V8Value r3) {
            r2 = this;
            java.util.LinkedList<com.eclipsesource.v8.ReferenceHandler> r0 = r2.referenceHandlers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.eclipsesource.v8.ReferenceHandler r1 = (com.eclipsesource.p043v8.ReferenceHandler) r1
            r1.v8HandleCreated(r3)
            goto L6
        L16:
            return
    }

    private void notifyReferenceDisposed(com.eclipsesource.p043v8.V8Value r3) {
            r2 = this;
            java.util.LinkedList<com.eclipsesource.v8.ReferenceHandler> r0 = r2.referenceHandlers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.eclipsesource.v8.ReferenceHandler r1 = (com.eclipsesource.p043v8.ReferenceHandler) r1
            r1.v8HandleDisposed(r3)
            goto L6
        L16:
            return
    }

    private void notifyReleaseHandlers(com.eclipsesource.p043v8.C1032V8 r3) {
            r2 = this;
            java.util.LinkedList<com.eclipsesource.v8.utils.V8Runnable> r0 = r2.releaseHandlers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.eclipsesource.v8.utils.V8Runnable r1 = (com.eclipsesource.p043v8.utils.V8Runnable) r1
            r1.run(r3)
            goto L6
        L16:
            return
    }

    private void populateParamters(com.eclipsesource.p043v8.V8Array r3, int r4, java.lang.Object[] r5, java.util.List<java.lang.Object> r6, boolean r7) {
            r2 = this;
            r0 = r7
        L1:
            int r1 = r3.length()
            int r1 = r1 + r7
            if (r0 >= r1) goto L19
            int r1 = r0 - r7
            java.lang.Object r1 = r2.getArrayItem(r3, r1)
            if (r0 < r4) goto L14
            r6.add(r1)
            goto L16
        L14:
            r5[r0] = r1
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            return
    }

    private void releaseArguments(java.lang.Object[] r6, boolean r7) {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L28
            int r7 = r6.length
            if (r7 <= 0) goto L28
            int r7 = r6.length
            int r7 = r7 + (-1)
            r7 = r6[r7]
            boolean r7 = r7 instanceof java.lang.Object[]
            if (r7 == 0) goto L28
            int r7 = r6.length
            int r7 = r7 + (-1)
            r7 = r6[r7]
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            int r1 = r7.length
            r2 = 0
        L18:
            if (r2 >= r1) goto L28
            r3 = r7[r2]
            boolean r4 = r3 instanceof com.eclipsesource.p043v8.V8Value
            if (r4 == 0) goto L25
            com.eclipsesource.v8.V8Value r3 = (com.eclipsesource.p043v8.V8Value) r3
            r3.close()
        L25:
            int r2 = r2 + 1
            goto L18
        L28:
            int r7 = r6.length
        L29:
            if (r0 >= r7) goto L39
            r1 = r6[r0]
            boolean r2 = r1 instanceof com.eclipsesource.p043v8.V8Value
            if (r2 == 0) goto L36
            com.eclipsesource.v8.V8Value r1 = (com.eclipsesource.p043v8.V8Value) r1
            r1.close()
        L36:
            int r0 = r0 + 1
            goto L29
        L39:
            return
    }

    private void releaseNativeMethodDescriptors() {
            r6 = this;
            java.util.Map<java.lang.Long, com.eclipsesource.v8.V8$MethodDescriptor> r0 = r6.functionRegistry
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r2 = r6.v8RuntimePtr
            long r4 = r1.longValue()
            r6.releaseMethodDescriptor(r2, r4)
            goto La
        L20:
            return
    }

    private void releaseResources() {
            r2 = this;
            java.util.List<com.eclipsesource.v8.Releasable> r0 = r2.resources
            if (r0 == 0) goto L20
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.eclipsesource.v8.Releasable r1 = (com.eclipsesource.p043v8.Releasable) r1
            r1.release()
            goto L8
        L18:
            java.util.List<com.eclipsesource.v8.Releasable> r0 = r2.resources
            r0.clear()
            r0 = 0
            r2.resources = r0
        L20:
            return
    }

    private java.lang.Object[] setDefaultValues(java.lang.Object[] r2, java.lang.Class<?>[] r3, com.eclipsesource.p043v8.V8Object r4, boolean r5) {
            r1 = this;
            r0 = 0
            if (r5 == 0) goto L6
            r2[r0] = r4
            r0 = 1
        L6:
            int r4 = r2.length
            if (r0 >= r4) goto L14
            r4 = r3[r0]
            java.lang.Object r4 = r1.getDefaultValue(r4)
            r2[r0] = r4
            int r0 = r0 + 1
            goto L6
        L14:
            return r2
    }

    public static void setFlags(java.lang.String r0) {
            com.eclipsesource.p043v8.C1032V8.v8Flags = r0
            r0 = 0
            com.eclipsesource.p043v8.C1032V8.initialized = r0
            return
    }

    public void acquireLock(long r1) {
            r0 = this;
            r0._acquireLock(r1)
            return
    }

    public void add(long r1, long r3, java.lang.String r5, double r6) {
            r0 = this;
            r0._add(r1, r3, r5, r6)
            return
    }

    public void add(long r1, long r3, java.lang.String r5, int r6) {
            r0 = this;
            r0._add(r1, r3, r5, r6)
            return
    }

    public void add(long r1, long r3, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r0._add(r1, r3, r5, r6)
            return
    }

    public void add(long r1, long r3, java.lang.String r5, boolean r6) {
            r0 = this;
            r0._add(r1, r3, r5, r6)
            return
    }

    public void addArrayBooleanItem(long r1, long r3, boolean r5) {
            r0 = this;
            r0._addArrayBooleanItem(r1, r3, r5)
            return
    }

    public void addArrayDoubleItem(long r1, long r3, double r5) {
            r0 = this;
            r0._addArrayDoubleItem(r1, r3, r5)
            return
    }

    public void addArrayIntItem(long r1, long r3, int r5) {
            r0 = this;
            r0._addArrayIntItem(r1, r3, r5)
            return
    }

    public void addArrayNullItem(long r1, long r3) {
            r0 = this;
            r0._addArrayNullItem(r1, r3)
            return
    }

    public void addArrayObjectItem(long r1, long r3, long r5) {
            r0 = this;
            r0._addArrayObjectItem(r1, r3, r5)
            return
    }

    public void addArrayStringItem(long r1, long r3, java.lang.String r5) {
            r0 = this;
            r0._addArrayStringItem(r1, r3, r5)
            return
    }

    public void addArrayUndefinedItem(long r1, long r3) {
            r0 = this;
            r0._addArrayUndefinedItem(r1, r3)
            return
    }

    public void addNull(long r1, long r3, java.lang.String r5) {
            r0 = this;
            r0._addNull(r1, r3, r5)
            return
    }

    public void addObjRef(com.eclipsesource.p043v8.V8Value r5) {
            r4 = this;
            long r0 = r4.objectReferences
            r2 = 1
            long r0 = r0 + r2
            r4.objectReferences = r0
            java.util.LinkedList<com.eclipsesource.v8.ReferenceHandler> r0 = r4.referenceHandlers
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            r4.notifyReferenceCreated(r5)
        L12:
            return
    }

    public void addObject(long r1, long r3, java.lang.String r5, long r6) {
            r0 = this;
            r0._addObject(r1, r3, r5, r6)
            return
    }

    public void addReferenceHandler(com.eclipsesource.p043v8.ReferenceHandler r3) {
            r2 = this;
            java.util.LinkedList<com.eclipsesource.v8.ReferenceHandler> r0 = r2.referenceHandlers
            r1 = 0
            r0.add(r1, r3)
            return
    }

    public void addReleaseHandler(com.eclipsesource.p043v8.utils.V8Runnable r2) {
            r1 = this;
            java.util.LinkedList<com.eclipsesource.v8.utils.V8Runnable> r0 = r1.releaseHandlers
            r0.add(r2)
            return
    }

    public void addUndefined(long r1, long r3, java.lang.String r5) {
            r0 = this;
            r0._addUndefined(r1, r3, r5)
            return
    }

    public java.lang.Object arrayGet(long r1, int r3, long r4, int r6) {
            r0 = this;
            java.lang.Object r1 = r0._arrayGet(r1, r3, r4, r6)
            return r1
    }

    public boolean arrayGetBoolean(long r1, long r3, int r5) {
            r0 = this;
            boolean r1 = r0._arrayGetBoolean(r1, r3, r5)
            return r1
    }

    public int arrayGetBooleans(long r1, long r3, int r5, int r6, boolean[] r7) {
            r0 = this;
            int r1 = r0._arrayGetBooleans(r1, r3, r5, r6, r7)
            return r1
    }

    public boolean[] arrayGetBooleans(long r1, long r3, int r5, int r6) {
            r0 = this;
            boolean[] r1 = r0._arrayGetBooleans(r1, r3, r5, r6)
            return r1
    }

    public byte arrayGetByte(long r1, long r3, int r5) {
            r0 = this;
            byte r1 = r0._arrayGetByte(r1, r3, r5)
            return r1
    }

    public int arrayGetBytes(long r1, long r3, int r5, int r6, byte[] r7) {
            r0 = this;
            int r1 = r0._arrayGetBytes(r1, r3, r5, r6, r7)
            return r1
    }

    public byte[] arrayGetBytes(long r1, long r3, int r5, int r6) {
            r0 = this;
            byte[] r1 = r0._arrayGetBytes(r1, r3, r5, r6)
            return r1
    }

    public double arrayGetDouble(long r1, long r3, int r5) {
            r0 = this;
            double r1 = r0._arrayGetDouble(r1, r3, r5)
            return r1
    }

    public int arrayGetDoubles(long r1, long r3, int r5, int r6, double[] r7) {
            r0 = this;
            int r1 = r0._arrayGetDoubles(r1, r3, r5, r6, r7)
            return r1
    }

    public double[] arrayGetDoubles(long r1, long r3, int r5, int r6) {
            r0 = this;
            double[] r1 = r0._arrayGetDoubles(r1, r3, r5, r6)
            return r1
    }

    public int arrayGetInteger(long r1, long r3, int r5) {
            r0 = this;
            int r1 = r0._arrayGetInteger(r1, r3, r5)
            return r1
    }

    public int arrayGetIntegers(long r1, long r3, int r5, int r6, int[] r7) {
            r0 = this;
            int r1 = r0._arrayGetIntegers(r1, r3, r5, r6, r7)
            return r1
    }

    public int[] arrayGetIntegers(long r1, long r3, int r5, int r6) {
            r0 = this;
            int[] r1 = r0._arrayGetIntegers(r1, r3, r5, r6)
            return r1
    }

    public int arrayGetSize(long r1, long r3) {
            r0 = this;
            int r1 = r0._arrayGetSize(r1, r3)
            return r1
    }

    public java.lang.String arrayGetString(long r1, long r3, int r5) {
            r0 = this;
            java.lang.String r1 = r0._arrayGetString(r1, r3, r5)
            return r1
    }

    public int arrayGetStrings(long r1, long r3, int r5, int r6, java.lang.String[] r7) {
            r0 = this;
            int r1 = r0._arrayGetStrings(r1, r3, r5, r6, r7)
            return r1
    }

    public java.lang.String[] arrayGetStrings(long r1, long r3, int r5, int r6) {
            r0 = this;
            java.lang.String[] r1 = r0._arrayGetStrings(r1, r3, r5, r6)
            return r1
    }

    public java.lang.Object callObjectJavaMethod(long r2, com.eclipsesource.p043v8.V8Object r4, com.eclipsesource.p043v8.V8Array r5) {
            r1 = this;
            java.util.Map<java.lang.Long, com.eclipsesource.v8.V8$MethodDescriptor> r0 = r1.functionRegistry
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.eclipsesource.v8.V8$MethodDescriptor r2 = (com.eclipsesource.p043v8.C1032V8.MethodDescriptor) r2
            com.eclipsesource.v8.JavaCallback r3 = r2.callback
            if (r3 == 0) goto L19
            java.lang.Object r2 = r3.invoke(r4, r5)
            java.lang.Object r2 = r1.checkResult(r2)
            return r2
        L19:
            java.lang.reflect.Method r3 = r2.method
            boolean r3 = r3.isVarArgs()
            java.lang.Object[] r4 = r1.getArgs(r4, r2, r5, r3)
            r1.checkArgs(r4)
            java.lang.reflect.Method r5 = r2.method     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3a java.lang.reflect.InvocationTargetException -> L3c
            java.lang.Object r2 = r2.object     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3a java.lang.reflect.InvocationTargetException -> L3c
            java.lang.Object r2 = r5.invoke(r2, r4)     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3a java.lang.reflect.InvocationTargetException -> L3c
            java.lang.Object r2 = r1.checkResult(r2)     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L38 java.lang.IllegalAccessException -> L3a java.lang.reflect.InvocationTargetException -> L3c
            r1.releaseArguments(r4, r3)
            return r2
        L36:
            r2 = move-exception
            goto L42
        L38:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L36
        L3a:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L36
        L3c:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getTargetException()     // Catch: java.lang.Throwable -> L36
            throw r2     // Catch: java.lang.Throwable -> L36
        L42:
            r1.releaseArguments(r4, r3)
            throw r2
    }

    public void callVoidJavaMethod(long r2, com.eclipsesource.p043v8.V8Object r4, com.eclipsesource.p043v8.V8Array r5) {
            r1 = this;
            java.util.Map<java.lang.Long, com.eclipsesource.v8.V8$MethodDescriptor> r0 = r1.functionRegistry
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.eclipsesource.v8.V8$MethodDescriptor r2 = (com.eclipsesource.p043v8.C1032V8.MethodDescriptor) r2
            com.eclipsesource.v8.JavaVoidCallback r3 = r2.voidCallback
            if (r3 == 0) goto L14
            r3.invoke(r4, r5)
            return
        L14:
            java.lang.reflect.Method r3 = r2.method
            boolean r3 = r3.isVarArgs()
            java.lang.Object[] r4 = r1.getArgs(r4, r2, r5, r3)
            r1.checkArgs(r4)
            java.lang.reflect.Method r5 = r2.method     // Catch: java.lang.Throwable -> L2c java.lang.IllegalArgumentException -> L2e java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L32
            java.lang.Object r2 = r2.object     // Catch: java.lang.Throwable -> L2c java.lang.IllegalArgumentException -> L2e java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L32
            r5.invoke(r2, r4)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalArgumentException -> L2e java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L32
            r1.releaseArguments(r4, r3)
            return
        L2c:
            r2 = move-exception
            goto L38
        L2e:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L2c
        L30:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L2c
        L32:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getTargetException()     // Catch: java.lang.Throwable -> L2c
            throw r2     // Catch: java.lang.Throwable -> L2c
        L38:
            r1.releaseArguments(r4, r3)
            throw r2
    }

    public void checkRuntime(com.eclipsesource.p043v8.V8Value r2) {
            r1 = this;
            if (r2 == 0) goto L20
            boolean r0 = r2.isUndefined()
            if (r0 == 0) goto L9
            goto L20
        L9:
            com.eclipsesource.v8.V8 r2 = r2.getRuntime()
            if (r2 == 0) goto L18
            boolean r0 = r2.isReleased()
            if (r0 != 0) goto L18
            if (r2 != r1) goto L18
            return
        L18:
            java.lang.Error r2 = new java.lang.Error
            java.lang.String r0 = "Invalid target runtime"
            r2.<init>(r0)
            throw r2
        L20:
            return
    }

    public void checkThread() {
            r2 = this;
            com.eclipsesource.v8.V8Locker r0 = r2.locker
            r0.checkThread()
            boolean r0 = r2.isReleased()
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "Runtime disposed error"
            r0.<init>(r1)
            throw r0
    }

    public void clearWeak(long r1, long r3) {
            r0 = this;
            r0._clearWeak(r1, r3)
            return
    }

    @Override // com.eclipsesource.p043v8.V8Value, com.eclipsesource.p043v8.Releasable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            r0 = 1
            r1.release(r0)
            return
    }

    public boolean contains(long r1, long r3, java.lang.String r5) {
            r0 = this;
            boolean r1 = r0._contains(r1, r3, r5)
            return r1
    }

    /* renamed from: createAndRegisterMethodDescriptor */
    public void m2799xdc233a4e(com.eclipsesource.p043v8.JavaCallback r3, long r4) {
            r2 = this;
            com.eclipsesource.v8.V8$MethodDescriptor r0 = new com.eclipsesource.v8.V8$MethodDescriptor
            r1 = 0
            r0.<init>(r2, r1)
            r0.callback = r3
            java.util.Map<java.lang.Long, com.eclipsesource.v8.V8$MethodDescriptor> r3 = r2.functionRegistry
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.put(r4, r0)
            return
    }

    public long createInspector(com.eclipsesource.p043v8.inspector.V8InspectorDelegate r3, java.lang.String r4) {
            r2 = this;
            long r0 = r2.v8RuntimePtr
            long r3 = r2._createInspector(r0, r3, r4)
            return r3
    }

    public void createNodeRuntime(java.lang.String r3) {
            r2 = this;
            long r0 = r2.v8RuntimePtr
            _startNodeJS(r0, r3)
            return
    }

    public void createTwin(long r1, long r3, long r5) {
            r0 = this;
            r0._createTwin(r1, r3, r5)
            return
    }

    public void createTwin(com.eclipsesource.p043v8.V8Value r8, com.eclipsesource.p043v8.V8Value r9) {
            r7 = this;
            r7.checkThread()
            long r1 = r7.v8RuntimePtr
            long r3 = r8.getHandle()
            long r5 = r9.getHandle()
            r0 = r7
            r0.createTwin(r1, r3, r5)
            return
    }

    public java.nio.ByteBuffer createV8ArrayBufferBackingStore(long r1, long r3, int r5) {
            r0 = this;
            java.nio.ByteBuffer r1 = r0._createV8ArrayBufferBackingStore(r1, r3, r5)
            return r1
    }

    public void dispatchProtocolMessage(long r7, java.lang.String r9) {
            r6 = this;
            r6.checkThread()
            long r1 = r6.v8RuntimePtr
            r0 = r6
            r3 = r7
            r5 = r9
            r0._dispatchProtocolMessage(r1, r3, r5)
            return
    }

    public void disposeMethodID(long r2) {
            r1 = this;
            java.util.Map<java.lang.Long, com.eclipsesource.v8.V8$MethodDescriptor> r0 = r1.functionRegistry
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.remove(r2)
            return
    }

    public boolean equals(long r1, long r3, long r5) {
            r0 = this;
            boolean r1 = r0._equals(r1, r3, r5)
            return r1
    }

    public com.eclipsesource.p043v8.V8Array executeArrayScript(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            com.eclipsesource.v8.V8Array r3 = r2.executeArrayScript(r3, r0, r1)
            return r3
    }

    public com.eclipsesource.p043v8.V8Array executeArrayScript(java.lang.String r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.checkThread()
            java.lang.Object r1 = r0.executeScript(r1, r2, r3)
            boolean r2 = r1 instanceof com.eclipsesource.p043v8.V8Array
            if (r2 == 0) goto Le
            com.eclipsesource.v8.V8Array r1 = (com.eclipsesource.p043v8.V8Array) r1
            return r1
        Le:
            com.eclipsesource.v8.V8ResultUndefined r1 = new com.eclipsesource.v8.V8ResultUndefined
            r1.<init>()
            throw r1
    }

    public boolean executeBooleanFunction(long r1, long r3, java.lang.String r5, long r6) {
            r0 = this;
            boolean r1 = r0._executeBooleanFunction(r1, r3, r5, r6)
            return r1
    }

    public boolean executeBooleanScript(long r1, java.lang.String r3, java.lang.String r4, int r5) {
            r0 = this;
            boolean r1 = r0._executeBooleanScript(r1, r3, r4, r5)
            return r1
    }

    public boolean executeBooleanScript(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            boolean r3 = r2.executeBooleanScript(r3, r0, r1)
            return r3
    }

    public boolean executeBooleanScript(java.lang.String r7, java.lang.String r8, int r9) {
            r6 = this;
            r6.checkThread()
            checkScript(r7)
            long r1 = r6.v8RuntimePtr
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            boolean r7 = r0.executeBooleanScript(r1, r3, r4, r5)
            return r7
    }

    public double executeDoubleFunction(long r1, long r3, java.lang.String r5, long r6) {
            r0 = this;
            double r1 = r0._executeDoubleFunction(r1, r3, r5, r6)
            return r1
    }

    public double executeDoubleScript(long r1, java.lang.String r3, java.lang.String r4, int r5) {
            r0 = this;
            double r1 = r0._executeDoubleScript(r1, r3, r4, r5)
            return r1
    }

    public double executeDoubleScript(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            double r0 = r2.executeDoubleScript(r3, r0, r1)
            return r0
    }

    public double executeDoubleScript(java.lang.String r7, java.lang.String r8, int r9) {
            r6 = this;
            r6.checkThread()
            checkScript(r7)
            long r1 = r6.v8RuntimePtr
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            double r7 = r0.executeDoubleScript(r1, r3, r4, r5)
            return r7
    }

    public java.lang.Object executeFunction(long r1, int r3, long r4, java.lang.String r6, long r7) {
            r0 = this;
            java.lang.Object r1 = r0._executeFunction(r1, r3, r4, r6, r7)
            return r1
    }

    public java.lang.Object executeFunction(long r1, long r3, long r5, long r7) {
            r0 = this;
            java.lang.Object r1 = r0._executeFunction(r1, r3, r5, r7)
            return r1
    }

    public int executeIntegerFunction(long r1, long r3, java.lang.String r5, long r6) {
            r0 = this;
            int r1 = r0._executeIntegerFunction(r1, r3, r5, r6)
            return r1
    }

    public int executeIntegerScript(long r1, java.lang.String r3, java.lang.String r4, int r5) {
            r0 = this;
            int r1 = r0._executeIntegerScript(r1, r3, r4, r5)
            return r1
    }

    public int executeIntegerScript(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            int r3 = r2.executeIntegerScript(r3, r0, r1)
            return r3
    }

    public int executeIntegerScript(java.lang.String r7, java.lang.String r8, int r9) {
            r6 = this;
            r6.checkThread()
            checkScript(r7)
            long r1 = r6.v8RuntimePtr
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            int r7 = r0.executeIntegerScript(r1, r3, r4, r5)
            return r7
    }

    public com.eclipsesource.p043v8.V8Object executeObjectScript(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            com.eclipsesource.v8.V8Object r3 = r2.executeObjectScript(r3, r0, r1)
            return r3
    }

    public com.eclipsesource.p043v8.V8Object executeObjectScript(java.lang.String r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.checkThread()
            java.lang.Object r1 = r0.executeScript(r1, r2, r3)
            boolean r2 = r1 instanceof com.eclipsesource.p043v8.V8Object
            if (r2 == 0) goto Le
            com.eclipsesource.v8.V8Object r1 = (com.eclipsesource.p043v8.V8Object) r1
            return r1
        Le:
            com.eclipsesource.v8.V8ResultUndefined r1 = new com.eclipsesource.v8.V8ResultUndefined
            r1.<init>()
            throw r1
    }

    public java.lang.Object executeScript(long r1, int r3, java.lang.String r4, java.lang.String r5, int r6) {
            r0 = this;
            java.lang.Object r1 = r0._executeScript(r1, r3, r4, r5, r6)
            return r1
    }

    public java.lang.Object executeScript(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            java.lang.Object r3 = r2.executeScript(r3, r0, r1)
            return r3
    }

    public java.lang.Object executeScript(java.lang.String r8, java.lang.String r9, int r10) {
            r7 = this;
            r7.checkThread()
            checkScript(r8)
            long r1 = r7.getV8RuntimePtr()
            r3 = 0
            r0 = r7
            r4 = r8
            r5 = r9
            r6 = r10
            java.lang.Object r8 = r0.executeScript(r1, r3, r4, r5, r6)
            return r8
    }

    public java.lang.String executeStringFunction(long r1, long r3, java.lang.String r5, long r6) {
            r0 = this;
            java.lang.String r1 = r0._executeStringFunction(r1, r3, r5, r6)
            return r1
    }

    public java.lang.String executeStringScript(long r1, java.lang.String r3, java.lang.String r4, int r5) {
            r0 = this;
            java.lang.String r1 = r0._executeStringScript(r1, r3, r4, r5)
            return r1
    }

    public java.lang.String executeStringScript(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            java.lang.String r3 = r2.executeStringScript(r3, r0, r1)
            return r3
    }

    public java.lang.String executeStringScript(java.lang.String r7, java.lang.String r8, int r9) {
            r6 = this;
            r6.checkThread()
            checkScript(r7)
            long r1 = r6.v8RuntimePtr
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            java.lang.String r7 = r0.executeStringScript(r1, r3, r4, r5)
            return r7
    }

    public void executeVoidFunction(long r1, long r3, java.lang.String r5, long r6) {
            r0 = this;
            r0._executeVoidFunction(r1, r3, r5, r6)
            return
    }

    public void executeVoidScript(long r1, java.lang.String r3, java.lang.String r4, int r5) {
            r0 = this;
            r0._executeVoidScript(r1, r3, r4, r5)
            return
    }

    public void executeVoidScript(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.executeVoidScript(r3, r0, r1)
            return
    }

    public void executeVoidScript(java.lang.String r7, java.lang.String r8, int r9) {
            r6 = this;
            r6.checkThread()
            checkScript(r7)
            long r1 = r6.v8RuntimePtr
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.executeVoidScript(r1, r3, r4, r5)
            return
    }

    public java.lang.Object get(long r1, int r3, long r4, java.lang.String r6) {
            r0 = this;
            java.lang.Object r1 = r0._get(r1, r3, r4, r6)
            return r1
    }

    public int getArrayType(long r1, long r3) {
            r0 = this;
            int r1 = r0._getArrayType(r1, r3)
            return r1
    }

    public boolean getBoolean(long r1, long r3, java.lang.String r5) {
            r0 = this;
            boolean r1 = r0._getBoolean(r1, r3, r5)
            return r1
    }

    public long getBuildID() {
            r2 = this;
            long r0 = r2._getBuildID()
            return r0
    }

    public java.lang.String getConstructorName(long r1, long r3) {
            r0 = this;
            java.lang.String r1 = r0._getConstructorName(r1, r3)
            return r1
    }

    public java.lang.Object getData(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.data
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public double getDouble(long r1, long r3, java.lang.String r5) {
            r0 = this;
            double r1 = r0._getDouble(r1, r3, r5)
            return r1
    }

    public com.eclipsesource.p043v8.utils.V8Executor getExecutor(com.eclipsesource.p043v8.V8Object r2) {
            r1 = this;
            r1.checkThread()
            com.eclipsesource.v8.utils.V8Map<com.eclipsesource.v8.utils.V8Executor> r0 = r1.executors
            if (r0 != 0) goto L9
            r2 = 0
            return r2
        L9:
            java.lang.Object r2 = r0.get(r2)
            com.eclipsesource.v8.utils.V8Executor r2 = (com.eclipsesource.p043v8.utils.V8Executor) r2
            return r2
    }

    public int getInteger(long r1, long r3, java.lang.String r5) {
            r0 = this;
            int r1 = r0._getInteger(r1, r3, r5)
            return r1
    }

    public java.lang.String[] getKeys(long r1, long r3) {
            r0 = this;
            java.lang.String[] r1 = r0._getKeys(r1, r3)
            return r1
    }

    public com.eclipsesource.p043v8.V8Locker getLocker() {
            r1 = this;
            com.eclipsesource.v8.V8Locker r0 = r1.locker
            return r0
    }

    public long getObjectReferenceCount() {
            r4 = this;
            long r0 = r4.objectReferences
            java.util.Map<java.lang.Long, com.eclipsesource.v8.V8Value> r2 = r4.v8WeakReferences
            int r2 = r2.size()
            long r2 = (long) r2
            long r0 = r0 - r2
            return r0
    }

    public java.lang.String getString(long r1, long r3, java.lang.String r5) {
            r0 = this;
            java.lang.String r1 = r0._getString(r1, r3, r5)
            return r1
    }

    public int getType(long r1, long r3) {
            r0 = this;
            int r1 = r0._getType(r1, r3)
            return r1
    }

    public int getType(long r1, long r3, int r5) {
            r0 = this;
            int r1 = r0._getType(r1, r3, r5)
            return r1
    }

    public int getType(long r1, long r3, int r5, int r6) {
            r0 = this;
            int r1 = r0._getType(r1, r3, r5, r6)
            return r1
    }

    public int getType(long r1, long r3, java.lang.String r5) {
            r0 = this;
            int r1 = r0._getType(r1, r3, r5)
            return r1
    }

    public long getV8RuntimePtr() {
            r2 = this;
            long r0 = r2.v8RuntimePtr
            return r0
    }

    public int identityHash(long r1, long r3) {
            r0 = this;
            int r1 = r0._identityHash(r1, r3)
            return r1
    }

    public long initEmptyContainer(long r1) {
            r0 = this;
            long r1 = r0._initEmptyContainer(r1)
            return r1
    }

    public long initNewV8Array(long r1) {
            r0 = this;
            long r1 = r0._initNewV8Array(r1)
            return r1
    }

    public long initNewV8ArrayBuffer(long r1, int r3) {
            r0 = this;
            long r1 = r0._initNewV8ArrayBuffer(r1, r3)
            return r1
    }

    public long initNewV8ArrayBuffer(long r1, java.nio.ByteBuffer r3, int r4) {
            r0 = this;
            long r1 = r0._initNewV8ArrayBuffer(r1, r3, r4)
            return r1
    }

    public long initNewV8Float32Array(long r1, long r3, int r5, int r6) {
            r0 = this;
            long r1 = r0._initNewV8Float32Array(r1, r3, r5, r6)
            return r1
    }

    public long initNewV8Float64Array(long r1, long r3, int r5, int r6) {
            r0 = this;
            long r1 = r0._initNewV8Float64Array(r1, r3, r5, r6)
            return r1
    }

    public long[] initNewV8Function(long r1) {
            r0 = this;
            r0.checkThread()
            long[] r1 = r0._initNewV8Function(r1)
            return r1
    }

    public long initNewV8Int16Array(long r1, long r3, int r5, int r6) {
            r0 = this;
            long r1 = r0._initNewV8Int16Array(r1, r3, r5, r6)
            return r1
    }

    public long initNewV8Int32Array(long r1, long r3, int r5, int r6) {
            r0 = this;
            long r1 = r0._initNewV8Int32Array(r1, r3, r5, r6)
            return r1
    }

    public long initNewV8Int8Array(long r1, long r3, int r5, int r6) {
            r0 = this;
            long r1 = r0._initNewV8Int8Array(r1, r3, r5, r6)
            return r1
    }

    public long initNewV8Object(long r1) {
            r0 = this;
            long r1 = r0._initNewV8Object(r1)
            return r1
    }

    public long initNewV8UInt16Array(long r1, long r3, int r5, int r6) {
            r0 = this;
            long r1 = r0._initNewV8UInt16Array(r1, r3, r5, r6)
            return r1
    }

    public long initNewV8UInt32Array(long r1, long r3, int r5, int r6) {
            r0 = this;
            long r1 = r0._initNewV8UInt32Array(r1, r3, r5, r6)
            return r1
    }

    public long initNewV8UInt8Array(long r1, long r3, int r5, int r6) {
            r0 = this;
            long r1 = r0._initNewV8UInt8Array(r1, r3, r5, r6)
            return r1
    }

    public long initNewV8UInt8ClampedArray(long r1, long r3, int r5, int r6) {
            r0 = this;
            long r1 = r0._initNewV8UInt8ClampedArray(r1, r3, r5, r6)
            return r1
    }

    public boolean isRunning() {
            r2 = this;
            long r0 = r2.v8RuntimePtr
            boolean r0 = _isRunning(r0)
            return r0
    }

    public boolean isWeak(long r1, long r3) {
            r0 = this;
            boolean r1 = r0._isWeak(r1, r3)
            return r1
    }

    public void lowMemoryNotification() {
            r2 = this;
            r2.checkThread()
            long r0 = r2.getV8RuntimePtr()
            r2.lowMemoryNotification(r0)
            return
    }

    public void lowMemoryNotification(long r1) {
            r0 = this;
            r0._lowMemoryNotification(r1)
            return
    }

    public boolean pumpMessageLoop() {
            r2 = this;
            long r0 = r2.v8RuntimePtr
            boolean r0 = _pumpMessageLoop(r0)
            return r0
    }

    public void registerCallback(com.eclipsesource.p043v8.JavaCallback r8, long r9, java.lang.String r11) {
            r7 = this;
            long r1 = r7.getV8RuntimePtr()
            r6 = 0
            r0 = r7
            r3 = r9
            r5 = r11
            long r9 = r0.registerJavaMethod(r1, r3, r5, r6)
            r7.m2799xdc233a4e(r8, r9)
            return
    }

    public void registerCallback(java.lang.Object r10, java.lang.reflect.Method r11, long r12, java.lang.String r14, boolean r15) {
            r9 = this;
            com.eclipsesource.v8.V8$MethodDescriptor r0 = new com.eclipsesource.v8.V8$MethodDescriptor
            r1 = 0
            r0.<init>(r9, r1)
            r0.object = r10
            r0.method = r11
            r0.includeReceiver = r15
            long r3 = r9.getV8RuntimePtr()
            boolean r8 = r9.isVoidMethod(r11)
            r2 = r9
            r5 = r12
            r7 = r14
            long r10 = r2.registerJavaMethod(r3, r5, r7, r8)
            java.util.Map<java.lang.Long, com.eclipsesource.v8.V8$MethodDescriptor> r12 = r9.functionRegistry
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r12.put(r10, r0)
            return
    }

    public long registerJavaMethod(long r1, long r3, java.lang.String r5, boolean r6) {
            r0 = this;
            long r1 = r0._registerJavaMethod(r1, r3, r5, r6)
            return r1
    }

    public void registerResource(com.eclipsesource.p043v8.Releasable r2) {
            r1 = this;
            r1.checkThread()
            java.util.List<com.eclipsesource.v8.Releasable> r0 = r1.resources
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.resources = r0
        Le:
            java.util.List<com.eclipsesource.v8.Releasable> r0 = r1.resources
            r0.add(r2)
            return
    }

    public void registerV8Executor(com.eclipsesource.p043v8.V8Object r2, com.eclipsesource.p043v8.utils.V8Executor r3) {
            r1 = this;
            r1.checkThread()
            com.eclipsesource.v8.utils.V8Map<com.eclipsesource.v8.utils.V8Executor> r0 = r1.executors
            if (r0 != 0) goto Le
            com.eclipsesource.v8.utils.V8Map r0 = new com.eclipsesource.v8.utils.V8Map
            r0.<init>()
            r1.executors = r0
        Le:
            com.eclipsesource.v8.utils.V8Map<com.eclipsesource.v8.utils.V8Executor> r0 = r1.executors
            r0.put2(r2, r3)
            return
    }

    public void registerVoidCallback(com.eclipsesource.p043v8.JavaVoidCallback r10, long r11, java.lang.String r13) {
            r9 = this;
            com.eclipsesource.v8.V8$MethodDescriptor r0 = new com.eclipsesource.v8.V8$MethodDescriptor
            r1 = 0
            r0.<init>(r9, r1)
            r0.voidCallback = r10
            long r3 = r9.getV8RuntimePtr()
            r8 = 1
            r2 = r9
            r5 = r11
            r7 = r13
            long r10 = r2.registerJavaMethod(r3, r5, r7, r8)
            java.util.Map<java.lang.Long, com.eclipsesource.v8.V8$MethodDescriptor> r12 = r9.functionRegistry
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r12.put(r10, r0)
            return
    }

    @Override // com.eclipsesource.p043v8.V8Value, com.eclipsesource.p043v8.Releasable
    @java.lang.Deprecated
    public void release() {
            r1 = this;
            r0 = 1
            r1.release(r0)
            return
    }

    public void release(long r1, long r3) {
            r0 = this;
            r0._release(r1, r3)
            return
    }

    public void release(boolean r7) {
            r6 = this;
            boolean r0 = r6.isReleased()
            if (r0 == 0) goto L7
            return
        L7:
            r6.checkThread()
            r0 = 0
            r2 = 1
            r6.notifyReleaseHandlers(r6)     // Catch: java.lang.Throwable -> L5e
            r6.releaseResources()
            boolean r3 = r6.forceTerminateExecutors
            r6.shutdownExecutors(r3)
            com.eclipsesource.v8.utils.V8Map<com.eclipsesource.v8.utils.V8Executor> r3 = r6.executors
            if (r3 == 0) goto L1f
            r3.clear()
        L1f:
            r6.releaseNativeMethodDescriptors()
            java.lang.Object r3 = com.eclipsesource.p043v8.C1032V8.lock
            monitor-enter(r3)
            int r4 = com.eclipsesource.p043v8.C1032V8.runtimeCounter     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 - r2
            com.eclipsesource.p043v8.C1032V8.runtimeCounter = r4     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5b
            long r3 = r6.v8RuntimePtr
            r6._releaseRuntime(r3)
            r6.v8RuntimePtr = r0
            r6.released = r2
            if (r7 == 0) goto L5a
            long r2 = r6.getObjectReferenceCount()
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 > 0) goto L3f
            goto L5a
        L3f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r6.getObjectReferenceCount()
            r0.append(r1)
            java.lang.String r1 = " Object(s) still exist in runtime"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L5a:
            return
        L5b:
            r7 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5b
            throw r7
        L5e:
            r3 = move-exception
            r6.releaseResources()
            boolean r4 = r6.forceTerminateExecutors
            r6.shutdownExecutors(r4)
            com.eclipsesource.v8.utils.V8Map<com.eclipsesource.v8.utils.V8Executor> r4 = r6.executors
            if (r4 == 0) goto L70
            com.eclipsesource.v8.utils.V8Map<com.eclipsesource.v8.utils.V8Executor> r4 = r6.executors
            r4.clear()
        L70:
            r6.releaseNativeMethodDescriptors()
            java.lang.Object r4 = com.eclipsesource.p043v8.C1032V8.lock
            monitor-enter(r4)
            int r5 = com.eclipsesource.p043v8.C1032V8.runtimeCounter     // Catch: java.lang.Throwable -> Lab
            int r5 = r5 - r2
            com.eclipsesource.p043v8.C1032V8.runtimeCounter = r5     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lab
            long r4 = r6.v8RuntimePtr
            r6._releaseRuntime(r4)
            r6.v8RuntimePtr = r0
            r6.released = r2
            if (r7 == 0) goto Laa
            long r4 = r6.getObjectReferenceCount()
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto Laa
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r6.getObjectReferenceCount()
            r0.append(r1)
            java.lang.String r1 = " Object(s) still exist in runtime"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        Laa:
            throw r3
        Lab:
            r7 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lab
            throw r7
    }

    public void releaseLock(long r1) {
            r0 = this;
            r0._releaseLock(r1)
            return
    }

    public void releaseMethodDescriptor(long r1, long r3) {
            r0 = this;
            r0._releaseMethodDescriptor(r1, r3)
            return
    }

    public void releaseObjRef(com.eclipsesource.p043v8.V8Value r5) {
            r4 = this;
            java.util.LinkedList<com.eclipsesource.v8.ReferenceHandler> r0 = r4.referenceHandlers
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb
            r4.notifyReferenceDisposed(r5)
        Lb:
            long r0 = r4.objectReferences
            r2 = 1
            long r0 = r0 - r2
            r4.objectReferences = r0
            return
    }

    public com.eclipsesource.p043v8.utils.V8Executor removeExecutor(com.eclipsesource.p043v8.V8Object r2) {
            r1 = this;
            r1.checkThread()
            com.eclipsesource.v8.utils.V8Map<com.eclipsesource.v8.utils.V8Executor> r0 = r1.executors
            if (r0 != 0) goto L9
            r2 = 0
            return r2
        L9:
            java.lang.Object r2 = r0.remove(r2)
            com.eclipsesource.v8.utils.V8Executor r2 = (com.eclipsesource.p043v8.utils.V8Executor) r2
            return r2
    }

    public void removeReferenceHandler(com.eclipsesource.p043v8.ReferenceHandler r2) {
            r1 = this;
            java.util.LinkedList<com.eclipsesource.v8.ReferenceHandler> r0 = r1.referenceHandlers
            r0.remove(r2)
            return
    }

    public void removeReleaseHandler(com.eclipsesource.p043v8.utils.V8Runnable r2) {
            r1 = this;
            java.util.LinkedList<com.eclipsesource.v8.utils.V8Runnable> r0 = r1.releaseHandlers
            r0.remove(r2)
            return
    }

    public boolean sameValue(long r1, long r3, long r5) {
            r0 = this;
            boolean r1 = r0._sameValue(r1, r3, r5)
            return r1
    }

    public void schedulePauseOnNextStatement(long r7, java.lang.String r9) {
            r6 = this;
            r6.checkThread()
            long r1 = r6.v8RuntimePtr
            r0 = r6
            r3 = r7
            r5 = r9
            r0._schedulePauseOnNextStatement(r1, r3, r5)
            return
    }

    public synchronized void setData(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.data     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Lc
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> L13
            r1.data = r0     // Catch: java.lang.Throwable -> L13
        Lc:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.data     // Catch: java.lang.Throwable -> L13
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        L13:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public void setPrototype(long r1, long r3, long r5) {
            r0 = this;
            r0._setPrototype(r1, r3, r5)
            return
    }

    public void setWeak(long r1, long r3) {
            r0 = this;
            r0._setWeak(r1, r3)
            return
    }

    public void shutdownExecutors(boolean r3) {
            r2 = this;
            r2.checkThread()
            com.eclipsesource.v8.utils.V8Map<com.eclipsesource.v8.utils.V8Executor> r0 = r2.executors
            if (r0 != 0) goto L8
            return
        L8:
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            com.eclipsesource.v8.utils.V8Executor r1 = (com.eclipsesource.p043v8.utils.V8Executor) r1
            if (r3 == 0) goto L22
            r1.forceTermination()
            goto L10
        L22:
            r1.shutdown()
            goto L10
        L26:
            return
    }

    public boolean strictEquals(long r1, long r3, long r5) {
            r0 = this;
            boolean r1 = r0._strictEquals(r1, r3, r5)
            return r1
    }

    public void terminateExecution() {
            r2 = this;
            r0 = 1
            r2.forceTerminateExecutors = r0
            long r0 = r2.v8RuntimePtr
            r2.terminateExecution(r0)
            return
    }

    public void terminateExecution(long r1) {
            r0 = this;
            r0._terminateExecution(r1)
            return
    }

    public java.lang.String toString(long r1, long r3) {
            r0 = this;
            java.lang.String r1 = r0._toString(r1, r3)
            return r1
    }

    public void weakReferenceReleased(long r3) {
            r2 = this;
            java.util.Map<java.lang.Long, com.eclipsesource.v8.V8Value> r0 = r2.v8WeakReferences
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            com.eclipsesource.v8.V8Value r0 = (com.eclipsesource.p043v8.V8Value) r0
            if (r0 == 0) goto L1a
            java.util.Map<java.lang.Long, com.eclipsesource.v8.V8Value> r1 = r2.v8WeakReferences
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.remove(r3)
            r0.close()     // Catch: java.lang.Exception -> L1a
        L1a:
            return
    }
}
