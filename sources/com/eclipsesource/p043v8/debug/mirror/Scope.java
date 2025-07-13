package com.eclipsesource.p043v8.debug.mirror;

/* loaded from: classes.dex */
public class Scope extends com.eclipsesource.p043v8.debug.mirror.Mirror {
    private static final java.lang.String SCOPE_OBJECT = "scopeObject";
    private static final java.lang.String SCOPE_TYPE = "scopeType";
    private static final java.lang.String SET_VARIABLE_VALUE = "setVariableValue";

    public enum ScopeType extends java.lang.Enum<com.eclipsesource.v8.debug.mirror.Scope.ScopeType> {
        private static final /* synthetic */ com.eclipsesource.v8.debug.mirror.Scope.ScopeType[] $VALUES = null;
        public static final com.eclipsesource.v8.debug.mirror.Scope.ScopeType Block = null;
        public static final com.eclipsesource.v8.debug.mirror.Scope.ScopeType Catch = null;
        public static final com.eclipsesource.v8.debug.mirror.Scope.ScopeType Closure = null;
        public static final com.eclipsesource.v8.debug.mirror.Scope.ScopeType Global = null;
        public static final com.eclipsesource.v8.debug.mirror.Scope.ScopeType Local = null;
        public static final com.eclipsesource.v8.debug.mirror.Scope.ScopeType Script = null;
        public static final com.eclipsesource.v8.debug.mirror.Scope.ScopeType With = null;
        public int index;

        static {
                com.eclipsesource.v8.debug.mirror.Scope$ScopeType r0 = new com.eclipsesource.v8.debug.mirror.Scope$ScopeType
                java.lang.String r1 = "Global"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.eclipsesource.v8.debug.mirror.Scope.ScopeType.Global = r0
                com.eclipsesource.v8.debug.mirror.Scope$ScopeType r1 = new com.eclipsesource.v8.debug.mirror.Scope$ScopeType
                java.lang.String r3 = "Local"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.eclipsesource.v8.debug.mirror.Scope.ScopeType.Local = r1
                com.eclipsesource.v8.debug.mirror.Scope$ScopeType r3 = new com.eclipsesource.v8.debug.mirror.Scope$ScopeType
                java.lang.String r5 = "With"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.eclipsesource.v8.debug.mirror.Scope.ScopeType.With = r3
                com.eclipsesource.v8.debug.mirror.Scope$ScopeType r5 = new com.eclipsesource.v8.debug.mirror.Scope$ScopeType
                java.lang.String r7 = "Closure"
                r8 = 3
                r5.<init>(r7, r8, r8)
                com.eclipsesource.v8.debug.mirror.Scope.ScopeType.Closure = r5
                com.eclipsesource.v8.debug.mirror.Scope$ScopeType r7 = new com.eclipsesource.v8.debug.mirror.Scope$ScopeType
                java.lang.String r9 = "Catch"
                r10 = 4
                r7.<init>(r9, r10, r10)
                com.eclipsesource.v8.debug.mirror.Scope.ScopeType.Catch = r7
                com.eclipsesource.v8.debug.mirror.Scope$ScopeType r9 = new com.eclipsesource.v8.debug.mirror.Scope$ScopeType
                java.lang.String r11 = "Block"
                r12 = 5
                r9.<init>(r11, r12, r12)
                com.eclipsesource.v8.debug.mirror.Scope.ScopeType.Block = r9
                com.eclipsesource.v8.debug.mirror.Scope$ScopeType r11 = new com.eclipsesource.v8.debug.mirror.Scope$ScopeType
                java.lang.String r13 = "Script"
                r14 = 6
                r11.<init>(r13, r14, r14)
                com.eclipsesource.v8.debug.mirror.Scope.ScopeType.Script = r11
                r13 = 7
                com.eclipsesource.v8.debug.mirror.Scope$ScopeType[] r13 = new com.eclipsesource.v8.debug.mirror.Scope.ScopeType[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                com.eclipsesource.v8.debug.mirror.Scope.ScopeType.$VALUES = r13
                return
        }

        ScopeType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.index = r3
                return
        }

        public static com.eclipsesource.v8.debug.mirror.Scope.ScopeType valueOf(java.lang.String r1) {
                java.lang.Class<com.eclipsesource.v8.debug.mirror.Scope$ScopeType> r0 = com.eclipsesource.v8.debug.mirror.Scope.ScopeType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.eclipsesource.v8.debug.mirror.Scope$ScopeType r1 = (com.eclipsesource.v8.debug.mirror.Scope.ScopeType) r1
                return r1
        }

        public static com.eclipsesource.v8.debug.mirror.Scope.ScopeType[] values() {
                com.eclipsesource.v8.debug.mirror.Scope$ScopeType[] r0 = com.eclipsesource.v8.debug.mirror.Scope.ScopeType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.eclipsesource.v8.debug.mirror.Scope$ScopeType[] r0 = (com.eclipsesource.v8.debug.mirror.Scope.ScopeType[]) r0
                return r0
        }
    }

    public Scope(com.eclipsesource.p043v8.V8Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public com.eclipsesource.p043v8.debug.mirror.ObjectMirror getScopeObject() {
            r3 = this;
            r0 = 0
            com.eclipsesource.v8.V8Object r1 = r3.v8Object     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "scopeObject"
            com.eclipsesource.v8.V8Object r0 = r1.executeObjectFunction(r2, r0)     // Catch: java.lang.Throwable -> L15
            com.eclipsesource.v8.debug.mirror.ValueMirror r1 = com.eclipsesource.p043v8.debug.mirror.Mirror.createMirror(r0)     // Catch: java.lang.Throwable -> L15
            com.eclipsesource.v8.debug.mirror.ObjectMirror r1 = (com.eclipsesource.p043v8.debug.mirror.ObjectMirror) r1     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L14
            r0.close()
        L14:
            return r1
        L15:
            r1 = move-exception
            if (r0 == 0) goto L1b
            r0.close()
        L1b:
            throw r1
    }

    public com.eclipsesource.v8.debug.mirror.Scope.ScopeType getType() {
            r4 = this;
            com.eclipsesource.v8.debug.mirror.Scope$ScopeType[] r0 = com.eclipsesource.v8.debug.mirror.Scope.ScopeType.values()
            com.eclipsesource.v8.V8Object r1 = r4.v8Object
            java.lang.String r2 = "scopeType"
            r3 = 0
            int r1 = r1.executeIntegerFunction(r2, r3)
            r0 = r0[r1]
            return r0
    }

    public void setVariableValue(java.lang.String r3, double r4) {
            r2 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8Object r1 = r2.v8Object
            com.eclipsesource.v8.V8 r1 = r1.getRuntime()
            r0.<init>(r1)
            r0.push(r3)
            r0.push(r4)
            com.eclipsesource.v8.V8Object r3 = r2.v8Object     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "setVariableValue"
            r3.executeVoidFunction(r4, r0)     // Catch: java.lang.Throwable -> L1c
            r0.close()
            return
        L1c:
            r3 = move-exception
            r0.close()
            throw r3
    }

    public void setVariableValue(java.lang.String r3, int r4) {
            r2 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8Object r1 = r2.v8Object
            com.eclipsesource.v8.V8 r1 = r1.getRuntime()
            r0.<init>(r1)
            r0.push(r3)
            r0.push(r4)
            com.eclipsesource.v8.V8Object r3 = r2.v8Object     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "setVariableValue"
            r3.executeVoidFunction(r4, r0)     // Catch: java.lang.Throwable -> L1c
            r0.close()
            return
        L1c:
            r3 = move-exception
            r0.close()
            throw r3
    }

    public void setVariableValue(java.lang.String r3, com.eclipsesource.p043v8.V8Value r4) {
            r2 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8Object r1 = r2.v8Object
            com.eclipsesource.v8.V8 r1 = r1.getRuntime()
            r0.<init>(r1)
            r0.push(r3)
            r0.push(r4)
            com.eclipsesource.v8.V8Object r3 = r2.v8Object     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "setVariableValue"
            r3.executeVoidFunction(r4, r0)     // Catch: java.lang.Throwable -> L1c
            r0.close()
            return
        L1c:
            r3 = move-exception
            r0.close()
            throw r3
    }

    public void setVariableValue(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8Object r1 = r2.v8Object
            com.eclipsesource.v8.V8 r1 = r1.getRuntime()
            r0.<init>(r1)
            r0.push(r3)
            r0.push(r4)
            com.eclipsesource.v8.V8Object r3 = r2.v8Object     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "setVariableValue"
            r3.executeVoidFunction(r4, r0)     // Catch: java.lang.Throwable -> L1c
            r0.close()
            return
        L1c:
            r3 = move-exception
            r0.close()
            throw r3
    }

    public void setVariableValue(java.lang.String r3, boolean r4) {
            r2 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8Object r1 = r2.v8Object
            com.eclipsesource.v8.V8 r1 = r1.getRuntime()
            r0.<init>(r1)
            r0.push(r3)
            r0.push(r4)
            com.eclipsesource.v8.V8Object r3 = r2.v8Object     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "setVariableValue"
            r3.executeVoidFunction(r4, r0)     // Catch: java.lang.Throwable -> L1c
            r0.close()
            return
        L1c:
            r3 = move-exception
            r0.close()
            throw r3
    }
}
