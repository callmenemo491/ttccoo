package com.eclipsesource.p043v8.debug;

/* loaded from: classes.dex */
public class BreakEvent extends com.eclipsesource.p043v8.debug.EventData {
    private static final java.lang.String SOURCE_COLUMN = "sourceColumn";
    private static final java.lang.String SOURCE_LINE = "sourceLine";
    private static final java.lang.String SOURCE_LINE_TEXT = "sourceLineText";

    public BreakEvent(com.eclipsesource.p043v8.V8Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public int getSourceColumn() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.v8Object
            java.lang.String r1 = "sourceColumn"
            r2 = 0
            int r0 = r0.executeIntegerFunction(r1, r2)
            return r0
    }

    public int getSourceLine() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.v8Object
            java.lang.String r1 = "sourceLine"
            r2 = 0
            int r0 = r0.executeIntegerFunction(r1, r2)
            return r0
    }

    public java.lang.String getSourceLineText() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.v8Object
            java.lang.String r1 = "sourceLineText"
            r2 = 0
            java.lang.String r0 = r0.executeStringFunction(r1, r2)
            return r0
    }
}
