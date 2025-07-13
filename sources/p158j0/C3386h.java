package p158j0;

@java.lang.Deprecated
/* renamed from: j0.h */
/* loaded from: classes.dex */
public final class C3386h {

    /* renamed from: a */
    public static final /* synthetic */ int f14543a = 0;

    static {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 >= r2) goto L5d
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.String r2 = "TRACE_TAG_APP"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Exception -> L55
            r2 = 0
            r1.getLong(r2)     // Catch: java.lang.Exception -> L55
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.String r2 = "isTagEnabled"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L55
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L55
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Exception -> L55
            r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L55
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.String r2 = "asyncTraceBegin"
            r4 = 3
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L55
            r7[r6] = r5     // Catch: java.lang.Exception -> L55
            r7[r3] = r0     // Catch: java.lang.Exception -> L55
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L55
            r9 = 2
            r7[r9] = r8     // Catch: java.lang.Exception -> L55
            r1.getMethod(r2, r7)     // Catch: java.lang.Exception -> L55
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.String r2 = "asyncTraceEnd"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L55
            r7[r6] = r5     // Catch: java.lang.Exception -> L55
            r7[r3] = r0     // Catch: java.lang.Exception -> L55
            r7[r9] = r8     // Catch: java.lang.Exception -> L55
            r1.getMethod(r2, r7)     // Catch: java.lang.Exception -> L55
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.String r2 = "traceCounter"
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L55
            r4[r6] = r5     // Catch: java.lang.Exception -> L55
            r4[r3] = r0     // Catch: java.lang.Exception -> L55
            r4[r9] = r8     // Catch: java.lang.Exception -> L55
            r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L55
            goto L5d
        L55:
            r0 = move-exception
            java.lang.String r1 = "TraceCompat"
            java.lang.String r2 = "Unable to initialize via reflection."
            android.util.Log.i(r1, r2, r0)
        L5d:
            return
    }
}
