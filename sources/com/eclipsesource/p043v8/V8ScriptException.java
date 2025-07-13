package com.eclipsesource.p043v8;

/* loaded from: classes.dex */
public abstract class V8ScriptException extends com.eclipsesource.p043v8.V8RuntimeException {
    private final int endColumn;
    private final java.lang.String fileName;
    private final java.lang.String jsMessage;
    private final java.lang.String jsStackTrace;
    private final int lineNumber;
    private final java.lang.String sourceLine;
    private final int startColumn;

    public V8ScriptException(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, int r5, int r6, java.lang.String r7, java.lang.Throwable r8) {
            r0 = this;
            r0.<init>()
            r0.fileName = r1
            r0.lineNumber = r2
            r0.jsMessage = r3
            r0.sourceLine = r4
            r0.startColumn = r5
            r0.endColumn = r6
            r0.jsStackTrace = r7
            if (r8 == 0) goto L16
            r0.initCause(r8)
        L16:
            return
    }

    private char[] createCharSequence(int r3, char r4) {
            r2 = this;
            char[] r0 = new char[r3]
            r1 = 0
        L3:
            if (r1 >= r3) goto La
            r0[r1] = r4
            int r1 = r1 + 1
            goto L3
        La:
            return r0
    }

    private java.lang.String createJSStackDetails() {
            r2 = this;
            java.lang.String r0 = r2.jsStackTrace
            if (r0 == 0) goto L14
            java.lang.String r0 = "\n"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.jsStackTrace
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L14:
            java.lang.String r0 = ""
            return r0
    }

    private java.lang.String createMessageDetails() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.sourceLine
            if (r1 == 0) goto L37
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L37
            r1 = 10
            r0.append(r1)
            java.lang.String r2 = r3.sourceLine
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.startColumn
            if (r1 < 0) goto L37
            r2 = 32
            char[] r1 = r3.createCharSequence(r1, r2)
            r0.append(r1)
            int r1 = r3.endColumn
            int r2 = r3.startColumn
            int r1 = r1 - r2
            r2 = 94
            char[] r1 = r3.createCharSequence(r1, r2)
            r0.append(r1)
        L37:
            java.lang.String r0 = r0.toString()
            return r0
    }

    private java.lang.String createMessageLine() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.fileName
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            int r1 = r2.lineNumber
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r1 = r2.jsMessage
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int getEndColumn() {
            r1 = this;
            int r0 = r1.endColumn
            return r0
    }

    public java.lang.String getFileName() {
            r1 = this;
            java.lang.String r0 = r1.fileName
            return r0
    }

    public java.lang.String getJSMessage() {
            r1 = this;
            java.lang.String r0 = r1.jsMessage
            return r0
    }

    public java.lang.String getJSStackTrace() {
            r1 = this;
            java.lang.String r0 = r1.jsStackTrace
            return r0
    }

    public int getLineNumber() {
            r1 = this;
            int r0 = r1.lineNumber
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.createMessageLine()
            return r0
    }

    public java.lang.String getSourceLine() {
            r1 = this;
            java.lang.String r0 = r1.sourceLine
            return r0
    }

    public int getStartColumn() {
            r1 = this;
            int r0 = r1.startColumn
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.createMessageLine()
            r0.append(r1)
            java.lang.String r1 = r2.createMessageDetails()
            r0.append(r1)
            java.lang.String r1 = r2.createJSStackDetails()
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
