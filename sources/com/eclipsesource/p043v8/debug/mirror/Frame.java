package com.eclipsesource.p043v8.debug.mirror;

/* loaded from: classes.dex */
public class Frame extends com.eclipsesource.p043v8.debug.mirror.Mirror {
    private static final java.lang.String ARGUMENT_COUNT = "argumentCount";
    private static final java.lang.String ARGUMENT_NAME = "argumentName";
    private static final java.lang.String ARGUMENT_VALUE = "argumentValue";
    private static final java.lang.String COLUMN = "column";
    private static final java.lang.String FUNC = "func";
    private static final java.lang.String LINE = "line";
    private static final java.lang.String LOCAL_COUNT = "localCount";
    private static final java.lang.String LOCAL_NAME = "localName";
    private static final java.lang.String LOCAL_VALUE = "localValue";
    private static final java.lang.String NAME = "name";
    private static final java.lang.String POSITION = "position";
    private static final java.lang.String SCOPE = "scope";
    private static final java.lang.String SCOPE_COUNT = "scopeCount";
    private static final java.lang.String SCRIPT = "script";
    private static final java.lang.String SOURCE_LOCATION = "sourceLocation";
    private static final java.lang.String SOURCE_TEXT = "sourceText";

    public Frame(com.eclipsesource.p043v8.V8Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public int getArgumentCount() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.v8Object
            java.lang.String r1 = "argumentCount"
            r2 = 0
            int r0 = r0.executeIntegerFunction(r1, r2)
            return r0
    }

    public java.lang.String getArgumentName(int r3) {
            r2 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8Object r1 = r2.v8Object
            com.eclipsesource.v8.V8 r1 = r1.getRuntime()
            r0.<init>(r1)
            r0.push(r3)
            com.eclipsesource.v8.V8Object r3 = r2.v8Object     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "argumentName"
            java.lang.String r3 = r3.executeStringFunction(r1, r0)     // Catch: java.lang.Throwable -> L1a
            r0.close()
            return r3
        L1a:
            r3 = move-exception
            r0.close()
            throw r3
    }

    public com.eclipsesource.p043v8.debug.mirror.ValueMirror getArgumentValue(int r4) {
            r3 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8Object r1 = r3.v8Object
            com.eclipsesource.v8.V8 r1 = r1.getRuntime()
            r0.<init>(r1)
            r0.push(r4)
            r4 = 0
            com.eclipsesource.v8.V8Object r1 = r3.v8Object     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "argumentValue"
            com.eclipsesource.v8.V8Object r4 = r1.executeObjectFunction(r2, r0)     // Catch: java.lang.Throwable -> L33
            boolean r1 = com.eclipsesource.p043v8.debug.mirror.Mirror.isValue(r4)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L2b
            com.eclipsesource.v8.debug.mirror.ValueMirror r1 = new com.eclipsesource.v8.debug.mirror.ValueMirror     // Catch: java.lang.Throwable -> L33
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L33
            r0.close()
            if (r4 == 0) goto L2a
            r4.close()
        L2a:
            return r1
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "Argument value is not a ValueMirror"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L33
            throw r1     // Catch: java.lang.Throwable -> L33
        L33:
            r1 = move-exception
            r0.close()
            if (r4 == 0) goto L3c
            r4.close()
        L3c:
            throw r1
    }

    public com.eclipsesource.p043v8.debug.mirror.FunctionMirror getFunction() {
            r3 = this;
            r0 = 0
            com.eclipsesource.v8.V8Object r1 = r3.v8Object     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "func"
            com.eclipsesource.v8.V8Object r0 = r1.executeObjectFunction(r2, r0)     // Catch: java.lang.Throwable -> L14
            com.eclipsesource.v8.debug.mirror.FunctionMirror r1 = new com.eclipsesource.v8.debug.mirror.FunctionMirror     // Catch: java.lang.Throwable -> L14
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L13
            r0.close()
        L13:
            return r1
        L14:
            r1 = move-exception
            if (r0 == 0) goto L1a
            r0.close()
        L1a:
            throw r1
    }

    public int getLocalCount() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.v8Object
            java.lang.String r1 = "localCount"
            r2 = 0
            int r0 = r0.executeIntegerFunction(r1, r2)
            return r0
    }

    public java.lang.String getLocalName(int r3) {
            r2 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8Object r1 = r2.v8Object
            com.eclipsesource.v8.V8 r1 = r1.getRuntime()
            r0.<init>(r1)
            r0.push(r3)
            com.eclipsesource.v8.V8Object r3 = r2.v8Object     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "localName"
            java.lang.String r3 = r3.executeStringFunction(r1, r0)     // Catch: java.lang.Throwable -> L1a
            r0.close()
            return r3
        L1a:
            r3 = move-exception
            r0.close()
            throw r3
    }

    public com.eclipsesource.p043v8.debug.mirror.ValueMirror getLocalValue(int r4) {
            r3 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8Object r1 = r3.v8Object
            com.eclipsesource.v8.V8 r1 = r1.getRuntime()
            r0.<init>(r1)
            r0.push(r4)
            r4 = 0
            com.eclipsesource.v8.V8Object r1 = r3.v8Object     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "localValue"
            com.eclipsesource.v8.V8Object r4 = r1.executeObjectFunction(r2, r0)     // Catch: java.lang.Throwable -> L32
            boolean r1 = com.eclipsesource.p043v8.debug.mirror.Mirror.isValue(r4)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L2a
            com.eclipsesource.v8.debug.mirror.ValueMirror r1 = com.eclipsesource.p043v8.debug.mirror.Mirror.createMirror(r4)     // Catch: java.lang.Throwable -> L32
            r0.close()
            if (r4 == 0) goto L29
            r4.close()
        L29:
            return r1
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "Local value is not a ValueMirror"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L32
            throw r1     // Catch: java.lang.Throwable -> L32
        L32:
            r1 = move-exception
            r0.close()
            if (r4 == 0) goto L3b
            r4.close()
        L3b:
            throw r1
    }

    public com.eclipsesource.p043v8.debug.mirror.Scope getScope(int r4) {
            r3 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8Object r1 = r3.v8Object
            com.eclipsesource.v8.V8 r1 = r1.getRuntime()
            r0.<init>(r1)
            r0.push(r4)
            r4 = 0
            com.eclipsesource.v8.V8Object r1 = r3.v8Object     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "scope"
            com.eclipsesource.v8.V8Object r4 = r1.executeObjectFunction(r2, r0)     // Catch: java.lang.Throwable -> L25
            com.eclipsesource.v8.debug.mirror.Scope r1 = new com.eclipsesource.v8.debug.mirror.Scope     // Catch: java.lang.Throwable -> L25
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

    public int getScopeCount() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.v8Object
            java.lang.String r1 = "scopeCount"
            r2 = 0
            int r0 = r0.executeIntegerFunction(r1, r2)
            return r0
    }

    public com.eclipsesource.p043v8.debug.mirror.SourceLocation getSourceLocation() {
            r10 = this;
            com.eclipsesource.v8.V8Object r0 = r10.v8Object
            java.lang.String r1 = "sourceLocation"
            r2 = 0
            com.eclipsesource.v8.V8Object r0 = r0.executeObjectFunction(r1, r2)
            com.eclipsesource.v8.debug.mirror.FunctionMirror r1 = r10.getFunction()
            java.lang.String r3 = r1.getScriptName()
            java.lang.String r4 = "script"
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L51
            com.eclipsesource.v8.V8Object r4 = (com.eclipsesource.p043v8.V8Object) r4     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L24
            java.lang.String r2 = "name"
            java.lang.String r2 = r4.getString(r2)     // Catch: java.lang.Throwable -> L51
            r4.close()     // Catch: java.lang.Throwable -> L51
        L24:
            if (r2 != 0) goto L29
            if (r3 == 0) goto L29
            goto L2b
        L29:
            java.lang.String r3 = "undefined"
        L2b:
            r5 = r3
            com.eclipsesource.v8.debug.mirror.SourceLocation r2 = new com.eclipsesource.v8.debug.mirror.SourceLocation     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = "position"
            int r6 = r0.getInteger(r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = "line"
            int r7 = r0.getInteger(r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = "column"
            int r8 = r0.getInteger(r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = "sourceText"
            java.lang.String r9 = r0.getString(r3)     // Catch: java.lang.Throwable -> L51
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L51
            r1.close()
            r0.close()
            return r2
        L51:
            r2 = move-exception
            r1.close()
            r0.close()
            throw r2
    }

    @Override // com.eclipsesource.p043v8.debug.mirror.Mirror
    public boolean isFrame() {
            r1 = this;
            r0 = 1
            return r0
    }
}
