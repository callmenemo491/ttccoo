package com.eclipsesource.p043v8.debug.mirror;

/* loaded from: classes.dex */
public class Mirror implements com.eclipsesource.p043v8.Releasable {
    private static final java.lang.String IS_ARRAY = "isArray";
    private static final java.lang.String IS_BOOLEAN = "isBoolean";
    private static final java.lang.String IS_FUNCTION = "isFunction";
    private static final java.lang.String IS_NULL = "isNull";
    private static final java.lang.String IS_NUMBER = "isNumber";
    private static final java.lang.String IS_OBJECT = "isObject";
    private static final java.lang.String IS_STRING = "isString";
    private static final java.lang.String IS_UNDEFINED = "isUndefined";
    private static final java.lang.String IS_VALUE = "isValue";
    public com.eclipsesource.p043v8.V8Object v8Object;

    public Mirror(com.eclipsesource.p043v8.V8Object r1) {
            r0 = this;
            r0.<init>()
            com.eclipsesource.v8.V8Object r1 = r1.twin()
            r0.v8Object = r1
            return
    }

    public static com.eclipsesource.p043v8.debug.mirror.ValueMirror createMirror(com.eclipsesource.p043v8.V8Object r1) {
            boolean r0 = isNull(r1)
            if (r0 == 0) goto Lc
            com.eclipsesource.v8.debug.mirror.NullMirror r0 = new com.eclipsesource.v8.debug.mirror.NullMirror
            r0.<init>(r1)
            return r0
        Lc:
            boolean r0 = isUndefined(r1)
            if (r0 == 0) goto L18
            com.eclipsesource.v8.debug.mirror.UndefinedMirror r0 = new com.eclipsesource.v8.debug.mirror.UndefinedMirror
            r0.<init>(r1)
            return r0
        L18:
            boolean r0 = isFunction(r1)
            if (r0 == 0) goto L24
            com.eclipsesource.v8.debug.mirror.FunctionMirror r0 = new com.eclipsesource.v8.debug.mirror.FunctionMirror
            r0.<init>(r1)
            return r0
        L24:
            boolean r0 = isArray(r1)
            if (r0 == 0) goto L30
            com.eclipsesource.v8.debug.mirror.ArrayMirror r0 = new com.eclipsesource.v8.debug.mirror.ArrayMirror
            r0.<init>(r1)
            return r0
        L30:
            boolean r0 = isObject(r1)
            if (r0 == 0) goto L3c
            com.eclipsesource.v8.debug.mirror.ObjectMirror r0 = new com.eclipsesource.v8.debug.mirror.ObjectMirror
            r0.<init>(r1)
            return r0
        L3c:
            boolean r0 = isString(r1)
            if (r0 == 0) goto L48
            com.eclipsesource.v8.debug.mirror.StringMirror r0 = new com.eclipsesource.v8.debug.mirror.StringMirror
            r0.<init>(r1)
            return r0
        L48:
            boolean r0 = isNumber(r1)
            if (r0 == 0) goto L54
            com.eclipsesource.v8.debug.mirror.NumberMirror r0 = new com.eclipsesource.v8.debug.mirror.NumberMirror
            r0.<init>(r1)
            return r0
        L54:
            boolean r0 = isBoolean(r1)
            if (r0 == 0) goto L60
            com.eclipsesource.v8.debug.mirror.BooleanMirror r0 = new com.eclipsesource.v8.debug.mirror.BooleanMirror
            r0.<init>(r1)
            return r0
        L60:
            com.eclipsesource.v8.debug.mirror.ValueMirror r0 = new com.eclipsesource.v8.debug.mirror.ValueMirror
            r0.<init>(r1)
            return r0
    }

    private static boolean isArray(com.eclipsesource.p043v8.V8Object r2) {
            java.lang.String r0 = "isArray"
            r1 = 0
            boolean r2 = r2.executeBooleanFunction(r0, r1)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L8
            return r2
        L8:
            r2 = 0
            return r2
    }

    private static boolean isBoolean(com.eclipsesource.p043v8.V8Object r2) {
            java.lang.String r0 = "isBoolean"
            r1 = 0
            boolean r2 = r2.executeBooleanFunction(r0, r1)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L8
            return r2
        L8:
            r2 = 0
            return r2
    }

    private static boolean isFunction(com.eclipsesource.p043v8.V8Object r2) {
            java.lang.String r0 = "isFunction"
            r1 = 0
            boolean r2 = r2.executeBooleanFunction(r0, r1)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L8
            return r2
        L8:
            r2 = 0
            return r2
    }

    private static boolean isNull(com.eclipsesource.p043v8.V8Object r2) {
            java.lang.String r0 = "isNull"
            r1 = 0
            boolean r2 = r2.executeBooleanFunction(r0, r1)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L8
            return r2
        L8:
            r2 = 0
            return r2
    }

    private static boolean isNumber(com.eclipsesource.p043v8.V8Object r2) {
            java.lang.String r0 = "isNumber"
            r1 = 0
            boolean r2 = r2.executeBooleanFunction(r0, r1)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L8
            return r2
        L8:
            r2 = 0
            return r2
    }

    private static boolean isObject(com.eclipsesource.p043v8.V8Object r2) {
            java.lang.String r0 = "isObject"
            r1 = 0
            boolean r2 = r2.executeBooleanFunction(r0, r1)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L8
            return r2
        L8:
            r2 = 0
            return r2
    }

    private static boolean isString(com.eclipsesource.p043v8.V8Object r2) {
            java.lang.String r0 = "isString"
            r1 = 0
            boolean r2 = r2.executeBooleanFunction(r0, r1)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L8
            return r2
        L8:
            r2 = 0
            return r2
    }

    private static boolean isUndefined(com.eclipsesource.p043v8.V8Object r2) {
            java.lang.String r0 = "isUndefined"
            r1 = 0
            boolean r2 = r2.executeBooleanFunction(r0, r1)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L8
            return r2
        L8:
            r2 = 0
            return r2
    }

    public static boolean isValue(com.eclipsesource.p043v8.V8Object r2) {
            java.lang.String r0 = "isValue"
            r1 = 0
            boolean r2 = r2.executeBooleanFunction(r0, r1)     // Catch: com.eclipsesource.p043v8.V8ResultUndefined -> L8
            return r2
        L8:
            r2 = 0
            return r2
    }

    @Override // com.eclipsesource.p043v8.Releasable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            com.eclipsesource.v8.V8Object r0 = r1.v8Object
            if (r0 == 0) goto L12
            boolean r0 = r0.isReleased()
            if (r0 != 0) goto L12
            com.eclipsesource.v8.V8Object r0 = r1.v8Object
            r0.close()
            r0 = 0
            r1.v8Object = r0
        L12:
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof com.eclipsesource.p043v8.debug.mirror.Mirror
            if (r1 != 0) goto L9
            return r0
        L9:
            com.eclipsesource.v8.V8Object r0 = r2.v8Object
            com.eclipsesource.v8.debug.mirror.Mirror r3 = (com.eclipsesource.p043v8.debug.mirror.Mirror) r3
            com.eclipsesource.v8.V8Object r3 = r3.v8Object
            boolean r3 = r0.equals(r3)
            return r3
    }

    public int hashCode() {
            r1 = this;
            com.eclipsesource.v8.V8Object r0 = r1.v8Object
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isArray() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isBoolean() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isFrame() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isFunction() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isNull() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isNumber() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isObject() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isProperty() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isString() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isUndefined() {
            r3 = this;
            com.eclipsesource.v8.V8Object r0 = r3.v8Object
            java.lang.String r1 = "isUndefined"
            r2 = 0
            boolean r0 = r0.executeBooleanFunction(r1, r2)
            return r0
    }

    public boolean isValue() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.eclipsesource.p043v8.Releasable
    @java.lang.Deprecated
    public void release() {
            r0 = this;
            r0.close()
            return
    }

    public java.lang.String toString() {
            r1 = this;
            com.eclipsesource.v8.V8Object r0 = r1.v8Object
            java.lang.String r0 = r0.toString()
            return r0
    }
}
