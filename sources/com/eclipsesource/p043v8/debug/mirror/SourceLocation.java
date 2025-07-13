package com.eclipsesource.p043v8.debug.mirror;

/* loaded from: classes.dex */
public class SourceLocation {
    private final int column;
    private final int line;
    private final int position;
    private final java.lang.String scriptName;
    private java.lang.String sourceText;

    public SourceLocation(java.lang.String r1, int r2, int r3, int r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.scriptName = r1
            r0.position = r2
            r0.line = r3
            r0.column = r4
            r0.sourceText = r5
            return
    }

    public int getColumn() {
            r1 = this;
            int r0 = r1.column
            return r0
    }

    public int getLine() {
            r1 = this;
            int r0 = r1.line
            return r0
    }

    public int getPosition() {
            r1 = this;
            int r0 = r1.position
            return r0
    }

    public java.lang.String getScriptName() {
            r1 = this;
            java.lang.String r0 = r1.scriptName
            return r0
    }

    public java.lang.String getSourceText() {
            r1 = this;
            java.lang.String r0 = r1.sourceText
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.scriptName
            r0.append(r1)
            java.lang.String r1 = " : "
            r0.append(r1)
            int r2 = r3.position
            r0.append(r2)
            r0.append(r1)
            int r2 = r3.line
            r0.append(r2)
            r0.append(r1)
            int r2 = r3.column
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r3.sourceText
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
