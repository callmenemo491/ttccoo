package com.eclipsesource.p043v8.debug;

/* loaded from: classes.dex */
public class DebugHandler implements com.eclipsesource.p043v8.Releasable {
    private static final java.lang.String CHANGE_BREAK_POINT_CONDITION = "changeBreakPointCondition";
    private static final java.lang.String CLEAR_BREAK_POINT = "clearBreakPoint";
    private static final java.lang.String DEBUG_BREAK_HANDLER = "__j2v8_debug_handler";
    public static java.lang.String DEBUG_OBJECT_NAME = "__j2v8_Debug";
    private static final java.lang.String DISABLE_ALL_BREAK_POINTS = "disableAllBreakPoints";
    private static final java.lang.String DISABLE_SCRIPT_BREAK_POINT = "disableScriptBreakPoint";
    private static final java.lang.String ENABLE_SCRIPT_BREAK_POINT = "enableScriptBreakPoint";
    private static final java.lang.String FIND_SCRIPT_BREAK_POINT = "findScriptBreakPoint";
    private static final java.lang.String NUMBER = "number";
    private static final java.lang.String SCRIPT_BREAK_POINTS = "scriptBreakPoints";
    private static final java.lang.String SET_BREAK_POINT = "setBreakPoint";
    private static final java.lang.String SET_LISTENER = "setListener";
    private static final java.lang.String SET_SCRIPT_BREAK_POINT_BY_NAME = "setScriptBreakPointByName";
    private static final java.lang.String V8_DEBUG_OBJECT = "Debug";
    private java.util.List<com.eclipsesource.p043v8.debug.BreakHandler> breakHandlers;
    private com.eclipsesource.p043v8.V8Object debugObject;
    private com.eclipsesource.p043v8.C1032V8 runtime;

    /* renamed from: com.eclipsesource.v8.debug.DebugHandler$1 */
    public static /* synthetic */ class C10331 {

        /* renamed from: $SwitchMap$com$eclipsesource$v8$debug$DebugHandler$DebugEvent */
        public static final /* synthetic */ int[] f5226xa54f706 = null;

        static {
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent[] r0 = com.eclipsesource.v8.debug.DebugHandler.DebugEvent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.eclipsesource.p043v8.debug.DebugHandler.C10331.f5226xa54f706 = r0
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent r1 = com.eclipsesource.v8.debug.DebugHandler.DebugEvent.Break     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.eclipsesource.p043v8.debug.DebugHandler.C10331.f5226xa54f706     // Catch: java.lang.NoSuchFieldError -> L1d
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent r1 = com.eclipsesource.v8.debug.DebugHandler.DebugEvent.BeforeCompile     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.eclipsesource.p043v8.debug.DebugHandler.C10331.f5226xa54f706     // Catch: java.lang.NoSuchFieldError -> L28
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent r1 = com.eclipsesource.v8.debug.DebugHandler.DebugEvent.AfterCompile     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.eclipsesource.p043v8.debug.DebugHandler.C10331.f5226xa54f706     // Catch: java.lang.NoSuchFieldError -> L33
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent r1 = com.eclipsesource.v8.debug.DebugHandler.DebugEvent.Exception     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public class BreakpointHandler implements com.eclipsesource.p043v8.JavaVoidCallback {
        public final /* synthetic */ com.eclipsesource.p043v8.debug.DebugHandler this$0;

        private BreakpointHandler(com.eclipsesource.p043v8.debug.DebugHandler r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ BreakpointHandler(com.eclipsesource.p043v8.debug.DebugHandler r1, com.eclipsesource.p043v8.debug.DebugHandler.C10331 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private com.eclipsesource.p043v8.debug.EventData createDebugEvent(com.eclipsesource.v8.debug.DebugHandler.DebugEvent r2, com.eclipsesource.p043v8.V8Object r3) {
                r1 = this;
                int[] r0 = com.eclipsesource.p043v8.debug.DebugHandler.C10331.f5226xa54f706
                int r2 = r2.ordinal()
                r2 = r0[r2]
                r0 = 1
                if (r2 == r0) goto L2c
                r0 = 2
                if (r2 == r0) goto L26
                r0 = 3
                if (r2 == r0) goto L20
                r0 = 4
                if (r2 == r0) goto L1a
                com.eclipsesource.v8.debug.EventData r2 = new com.eclipsesource.v8.debug.EventData
                r2.<init>(r3)
                return r2
            L1a:
                com.eclipsesource.v8.debug.ExceptionEvent r2 = new com.eclipsesource.v8.debug.ExceptionEvent
                r2.<init>(r3)
                return r2
            L20:
                com.eclipsesource.v8.debug.CompileEvent r2 = new com.eclipsesource.v8.debug.CompileEvent
                r2.<init>(r3)
                return r2
            L26:
                com.eclipsesource.v8.debug.CompileEvent r2 = new com.eclipsesource.v8.debug.CompileEvent
                r2.<init>(r3)
                return r2
            L2c:
                com.eclipsesource.v8.debug.BreakEvent r2 = new com.eclipsesource.v8.debug.BreakEvent
                r2.<init>(r3)
                return r2
        }

        private void invokeHandler(com.eclipsesource.p043v8.V8Array r6, int r7, com.eclipsesource.p043v8.debug.BreakHandler r8) {
                r5 = this;
                r0 = 1
                r1 = 0
                com.eclipsesource.v8.V8Object r0 = r6.getObject(r0)     // Catch: java.lang.Throwable -> L44
                r2 = 2
                com.eclipsesource.v8.V8Object r2 = r6.getObject(r2)     // Catch: java.lang.Throwable -> L3d
                r3 = 3
                com.eclipsesource.v8.V8Object r6 = r6.getObject(r3)     // Catch: java.lang.Throwable -> L38
                com.eclipsesource.v8.debug.ExecutionState r3 = new com.eclipsesource.v8.debug.ExecutionState     // Catch: java.lang.Throwable -> L35
                r3.<init>(r0)     // Catch: java.lang.Throwable -> L35
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent[] r4 = com.eclipsesource.v8.debug.DebugHandler.DebugEvent.values()     // Catch: java.lang.Throwable -> L32
                r7 = r4[r7]     // Catch: java.lang.Throwable -> L32
                com.eclipsesource.v8.debug.EventData r1 = r5.createDebugEvent(r7, r2)     // Catch: java.lang.Throwable -> L32
                r8.onBreak(r7, r3, r1, r6)     // Catch: java.lang.Throwable -> L32
                r5.safeRelease(r0)
                r5.safeRelease(r2)
                r5.safeRelease(r6)
                r5.safeRelease(r3)
                r5.safeRelease(r1)
                return
            L32:
                r7 = move-exception
                r8 = r1
                goto L42
            L35:
                r7 = move-exception
                r8 = r1
                goto L3b
            L38:
                r7 = move-exception
                r6 = r1
                r8 = r6
            L3b:
                r3 = r8
                goto L42
            L3d:
                r7 = move-exception
                r6 = r1
                r8 = r6
                r2 = r8
                r3 = r2
            L42:
                r1 = r0
                goto L49
            L44:
                r7 = move-exception
                r6 = r1
                r8 = r6
                r2 = r8
                r3 = r2
            L49:
                r5.safeRelease(r1)
                r5.safeRelease(r2)
                r5.safeRelease(r6)
                r5.safeRelease(r3)
                r5.safeRelease(r8)
                throw r7
        }

        private void safeRelease(com.eclipsesource.p043v8.Releasable r1) {
                r0 = this;
                if (r1 == 0) goto L5
                r1.release()
            L5:
                return
        }

        @Override // com.eclipsesource.p043v8.JavaVoidCallback
        public void invoke(com.eclipsesource.p043v8.V8Object r3, com.eclipsesource.p043v8.V8Array r4) {
                r2 = this;
                if (r4 == 0) goto L28
                boolean r3 = r4.isUndefined()
                if (r3 == 0) goto L9
                goto L28
            L9:
                r3 = 0
                int r3 = r4.getInteger(r3)
                com.eclipsesource.v8.debug.DebugHandler r0 = r2.this$0
                java.util.List r0 = com.eclipsesource.p043v8.debug.DebugHandler.access$100(r0)
                java.util.Iterator r0 = r0.iterator()
            L18:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L28
                java.lang.Object r1 = r0.next()
                com.eclipsesource.v8.debug.BreakHandler r1 = (com.eclipsesource.p043v8.debug.BreakHandler) r1
                r2.invokeHandler(r4, r3, r1)
                goto L18
            L28:
                return
        }
    }

    public enum DebugEvent extends java.lang.Enum<com.eclipsesource.v8.debug.DebugHandler.DebugEvent> {
        private static final /* synthetic */ com.eclipsesource.v8.debug.DebugHandler.DebugEvent[] $VALUES = null;
        public static final com.eclipsesource.v8.debug.DebugHandler.DebugEvent AfterCompile = null;
        public static final com.eclipsesource.v8.debug.DebugHandler.DebugEvent AsyncTaskEvent = null;
        public static final com.eclipsesource.v8.debug.DebugHandler.DebugEvent BeforeCompile = null;
        public static final com.eclipsesource.v8.debug.DebugHandler.DebugEvent Break = null;
        public static final com.eclipsesource.v8.debug.DebugHandler.DebugEvent CompileError = null;
        public static final com.eclipsesource.v8.debug.DebugHandler.DebugEvent Exception = null;
        public static final com.eclipsesource.v8.debug.DebugHandler.DebugEvent NewFunction = null;
        public static final com.eclipsesource.v8.debug.DebugHandler.DebugEvent PromiseError = null;
        public static final com.eclipsesource.v8.debug.DebugHandler.DebugEvent Undefined = null;
        public int index;

        static {
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent r0 = new com.eclipsesource.v8.debug.DebugHandler$DebugEvent
                java.lang.String r1 = "Undefined"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.eclipsesource.v8.debug.DebugHandler.DebugEvent.Undefined = r0
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent r1 = new com.eclipsesource.v8.debug.DebugHandler$DebugEvent
                java.lang.String r3 = "Break"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.eclipsesource.v8.debug.DebugHandler.DebugEvent.Break = r1
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent r3 = new com.eclipsesource.v8.debug.DebugHandler$DebugEvent
                java.lang.String r5 = "Exception"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.eclipsesource.v8.debug.DebugHandler.DebugEvent.Exception = r3
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent r5 = new com.eclipsesource.v8.debug.DebugHandler$DebugEvent
                java.lang.String r7 = "NewFunction"
                r8 = 3
                r5.<init>(r7, r8, r8)
                com.eclipsesource.v8.debug.DebugHandler.DebugEvent.NewFunction = r5
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent r7 = new com.eclipsesource.v8.debug.DebugHandler$DebugEvent
                java.lang.String r9 = "BeforeCompile"
                r10 = 4
                r7.<init>(r9, r10, r10)
                com.eclipsesource.v8.debug.DebugHandler.DebugEvent.BeforeCompile = r7
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent r9 = new com.eclipsesource.v8.debug.DebugHandler$DebugEvent
                java.lang.String r11 = "AfterCompile"
                r12 = 5
                r9.<init>(r11, r12, r12)
                com.eclipsesource.v8.debug.DebugHandler.DebugEvent.AfterCompile = r9
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent r11 = new com.eclipsesource.v8.debug.DebugHandler$DebugEvent
                java.lang.String r13 = "CompileError"
                r14 = 6
                r11.<init>(r13, r14, r14)
                com.eclipsesource.v8.debug.DebugHandler.DebugEvent.CompileError = r11
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent r13 = new com.eclipsesource.v8.debug.DebugHandler$DebugEvent
                java.lang.String r15 = "PromiseError"
                r14 = 7
                r13.<init>(r15, r14, r14)
                com.eclipsesource.v8.debug.DebugHandler.DebugEvent.PromiseError = r13
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent r15 = new com.eclipsesource.v8.debug.DebugHandler$DebugEvent
                java.lang.String r14 = "AsyncTaskEvent"
                r12 = 8
                r15.<init>(r14, r12, r12)
                com.eclipsesource.v8.debug.DebugHandler.DebugEvent.AsyncTaskEvent = r15
                r14 = 9
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent[] r14 = new com.eclipsesource.v8.debug.DebugHandler.DebugEvent[r14]
                r14[r2] = r0
                r14[r4] = r1
                r14[r6] = r3
                r14[r8] = r5
                r14[r10] = r7
                r0 = 5
                r14[r0] = r9
                r0 = 6
                r14[r0] = r11
                r0 = 7
                r14[r0] = r13
                r14[r12] = r15
                com.eclipsesource.v8.debug.DebugHandler.DebugEvent.$VALUES = r14
                return
        }

        DebugEvent(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.index = r3
                return
        }

        public static com.eclipsesource.v8.debug.DebugHandler.DebugEvent valueOf(java.lang.String r1) {
                java.lang.Class<com.eclipsesource.v8.debug.DebugHandler$DebugEvent> r0 = com.eclipsesource.v8.debug.DebugHandler.DebugEvent.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent r1 = (com.eclipsesource.v8.debug.DebugHandler.DebugEvent) r1
                return r1
        }

        public static com.eclipsesource.v8.debug.DebugHandler.DebugEvent[] values() {
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent[] r0 = com.eclipsesource.v8.debug.DebugHandler.DebugEvent.$VALUES
                java.lang.Object r0 = r0.clone()
                com.eclipsesource.v8.debug.DebugHandler$DebugEvent[] r0 = (com.eclipsesource.v8.debug.DebugHandler.DebugEvent[]) r0
                return r0
        }
    }

    public DebugHandler(com.eclipsesource.p043v8.C1032V8 r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.breakHandlers = r0
            r1.runtime = r2
            r1.setupDebugObject(r2)
            r1.setupBreakpointHandler()
            return
    }

    public static /* synthetic */ java.util.List access$100(com.eclipsesource.p043v8.debug.DebugHandler r0) {
            java.util.List<com.eclipsesource.v8.debug.BreakHandler> r0 = r0.breakHandlers
            return r0
    }

    private void setupBreakpointHandler() {
            r5 = this;
            com.eclipsesource.v8.debug.DebugHandler$BreakpointHandler r0 = new com.eclipsesource.v8.debug.DebugHandler$BreakpointHandler
            r1 = 0
            r0.<init>(r5, r1)
            com.eclipsesource.v8.V8Object r2 = r5.debugObject
            java.lang.String r3 = "__j2v8_debug_handler"
            r2.registerJavaMethod(r0, r3)
            com.eclipsesource.v8.V8Object r0 = r5.debugObject     // Catch: java.lang.Throwable -> L42
            com.eclipsesource.v8.V8Object r0 = r0.getObject(r3)     // Catch: java.lang.Throwable -> L42
            com.eclipsesource.v8.V8Function r0 = (com.eclipsesource.p043v8.V8Function) r0     // Catch: java.lang.Throwable -> L42
            com.eclipsesource.v8.V8Array r2 = new com.eclipsesource.v8.V8Array     // Catch: java.lang.Throwable -> L3d
            com.eclipsesource.v8.V8 r3 = r5.runtime     // Catch: java.lang.Throwable -> L3d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3d
            r2.push(r0)     // Catch: java.lang.Throwable -> L3b
            com.eclipsesource.v8.V8Object r1 = r5.debugObject     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "setListener"
            r1.executeFunction(r3, r2)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L31
            boolean r1 = r0.isReleased()
            if (r1 != 0) goto L31
            r0.close()
        L31:
            boolean r0 = r2.isReleased()
            if (r0 != 0) goto L3a
            r2.close()
        L3a:
            return
        L3b:
            r1 = move-exception
            goto L46
        L3d:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
            goto L46
        L42:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
        L46:
            if (r0 == 0) goto L51
            boolean r3 = r0.isReleased()
            if (r3 != 0) goto L51
            r0.close()
        L51:
            if (r2 == 0) goto L5c
            boolean r0 = r2.isReleased()
            if (r0 != 0) goto L5c
            r2.close()
        L5c:
            throw r1
    }

    private void setupDebugObject(com.eclipsesource.p043v8.C1032V8 r2) {
            r1 = this;
            java.lang.String r0 = com.eclipsesource.p043v8.debug.DebugHandler.DEBUG_OBJECT_NAME
            com.eclipsesource.v8.V8Object r2 = r2.getObject(r0)
            java.lang.String r0 = "Debug"
            com.eclipsesource.v8.V8Object r0 = r2.getObject(r0)     // Catch: java.lang.Throwable -> L12
            r1.debugObject = r0     // Catch: java.lang.Throwable -> L12
            r2.close()
            return
        L12:
            r0 = move-exception
            r2.close()
            throw r0
    }

    public void addBreakHandler(com.eclipsesource.p043v8.debug.BreakHandler r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.runtime
            com.eclipsesource.v8.V8Locker r0 = r0.getLocker()
            r0.checkThread()
            java.util.List<com.eclipsesource.v8.debug.BreakHandler> r0 = r1.breakHandlers
            r0.add(r2)
            return
    }

    public void changeBreakPointCondition(int r3, java.lang.String r4) {
            r2 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8 r1 = r2.runtime
            r0.<init>(r1)
            r0.push(r3)
            r0.push(r4)
            com.eclipsesource.v8.V8Object r3 = r2.debugObject     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "changeBreakPointCondition"
            r3.executeVoidFunction(r4, r0)     // Catch: java.lang.Throwable -> L18
            r0.close()
            return
        L18:
            r3 = move-exception
            r0.close()
            throw r3
    }

    public void clearBreakPoint(int r3) {
            r2 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8 r1 = r2.runtime
            r0.<init>(r1)
            r0.push(r3)
            com.eclipsesource.v8.V8Object r3 = r2.debugObject     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "clearBreakPoint"
            r3.executeVoidFunction(r1, r0)     // Catch: java.lang.Throwable -> L15
            r0.close()
            return
        L15:
            r3 = move-exception
            r0.close()
            throw r3
    }

    @Override // com.eclipsesource.p043v8.Releasable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            com.eclipsesource.v8.V8Object r0 = r1.debugObject
            r0.close()
            return
    }

    public void disableAllBreakPoints() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.debugObject
            java.lang.String r1 = "disableAllBreakPoints"
            r2 = 0
            r0.executeVoidFunction(r1, r2)
            return
    }

    public void disableScriptBreakPoint(int r3) {
            r2 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8 r1 = r2.runtime
            r0.<init>(r1)
            r0.push(r3)
            com.eclipsesource.v8.V8Object r3 = r2.debugObject     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "disableScriptBreakPoint"
            r3.executeVoidFunction(r1, r0)     // Catch: java.lang.Throwable -> L15
            r0.close()
            return
        L15:
            r3 = move-exception
            r0.close()
            throw r3
    }

    public void enableScriptBreakPoint(int r3) {
            r2 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8 r1 = r2.runtime
            r0.<init>(r1)
            r0.push(r3)
            com.eclipsesource.v8.V8Object r3 = r2.debugObject     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "enableScriptBreakPoint"
            r3.executeVoidFunction(r1, r0)     // Catch: java.lang.Throwable -> L15
            r0.close()
            return
        L15:
            r3 = move-exception
            r0.close()
            throw r3
    }

    public com.eclipsesource.p043v8.debug.ScriptBreakPoint getScriptBreakPoint(int r4) {
            r3 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8 r1 = r3.runtime
            r0.<init>(r1)
            r0.push(r4)
            r4 = 0
            r0.push(r4)
            r4 = 0
            com.eclipsesource.v8.V8Object r1 = r3.debugObject     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "findScriptBreakPoint"
            com.eclipsesource.v8.V8Object r4 = r1.executeObjectFunction(r2, r0)     // Catch: java.lang.Throwable -> L25
            com.eclipsesource.v8.debug.ScriptBreakPoint r1 = new com.eclipsesource.v8.debug.ScriptBreakPoint     // Catch: java.lang.Throwable -> L25
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L25
            r0.close()
            if (r4 == 0) goto L24
            r4.close()
        L24:
            return r1
        L25:
            r1 = move-exception
            r0.close()
            if (r4 == 0) goto L2e
            r4.close()
        L2e:
            throw r1
    }

    public int getScriptBreakPointCount() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.debugObject
            java.lang.String r1 = "scriptBreakPoints"
            r2 = 0
            com.eclipsesource.v8.V8Array r0 = r0.executeArrayFunction(r1, r2)
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L11
            r0.close()
            return r1
        L11:
            r1 = move-exception
            r0.close()
            throw r1
    }

    public int[] getScriptBreakPointIDs() {
            r6 = this;
            com.eclipsesource.v8.V8Object r0 = r6.debugObject
            java.lang.String r1 = "scriptBreakPoints"
            r2 = 0
            com.eclipsesource.v8.V8Array r0 = r0.executeArrayFunction(r1, r2)
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L31
            int[] r1 = new int[r1]     // Catch: java.lang.Throwable -> L31
            r3 = 0
        L10:
            int r4 = r0.length()     // Catch: java.lang.Throwable -> L31
            if (r3 >= r4) goto L2d
            com.eclipsesource.v8.V8Object r4 = r0.getObject(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = "number"
            int r5 = r4.executeIntegerFunction(r5, r2)     // Catch: java.lang.Throwable -> L28
            r1[r3] = r5     // Catch: java.lang.Throwable -> L28
            r4.close()     // Catch: java.lang.Throwable -> L31
            int r3 = r3 + 1
            goto L10
        L28:
            r1 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L31
            throw r1     // Catch: java.lang.Throwable -> L31
        L2d:
            r0.close()
            return r1
        L31:
            r1 = move-exception
            r0.close()
            throw r1
    }

    @Override // com.eclipsesource.p043v8.Releasable
    @java.lang.Deprecated
    public void release() {
            r0 = this;
            r0.close()
            return
    }

    public void removeBreakHandler(com.eclipsesource.p043v8.debug.BreakHandler r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.runtime
            com.eclipsesource.v8.V8Locker r0 = r0.getLocker()
            r0.checkThread()
            java.util.List<com.eclipsesource.v8.debug.BreakHandler> r0 = r1.breakHandlers
            r0.remove(r2)
            return
    }

    public int setBreakpoint(com.eclipsesource.p043v8.V8Function r3) {
            r2 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8 r1 = r2.runtime
            r0.<init>(r1)
            r0.push(r3)
            com.eclipsesource.v8.V8Object r3 = r2.debugObject     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "setBreakPoint"
            int r3 = r3.executeIntegerFunction(r1, r0)     // Catch: java.lang.Throwable -> L16
            r0.close()
            return r3
        L16:
            r3 = move-exception
            r0.close()
            throw r3
    }

    public int setScriptBreakpoint(java.lang.String r3, int r4) {
            r2 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8 r1 = r2.runtime
            r0.<init>(r1)
            r0.push(r3)
            r0.push(r4)
            com.eclipsesource.v8.V8Object r3 = r2.debugObject     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = "setScriptBreakPointByName"
            int r3 = r3.executeIntegerFunction(r4, r0)     // Catch: java.lang.Throwable -> L19
            r0.close()
            return r3
        L19:
            r3 = move-exception
            r0.close()
            throw r3
    }
}
