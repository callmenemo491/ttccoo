package p321s1;

/* renamed from: s1.a */
/* loaded from: classes.dex */
public final class C5944a {

    /* renamed from: a */
    public static long f22820a;

    /* renamed from: b */
    public static java.lang.reflect.Method f22821b;

    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: a */
    public static boolean m12354a() {
            java.lang.reflect.Method r0 = p321s1.C5944a.f22821b     // Catch: java.lang.Throwable -> L9
            if (r0 != 0) goto L9
            boolean r0 = android.os.Trace.isEnabled()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = 0
            java.lang.reflect.Method r1 = p321s1.C5944a.f22821b     // Catch: java.lang.Exception -> L45
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L2e
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.String r4 = "TRACE_TAG_APP"
            java.lang.reflect.Field r1 = r1.getField(r4)     // Catch: java.lang.Exception -> L45
            long r4 = r1.getLong(r3)     // Catch: java.lang.Exception -> L45
            p321s1.C5944a.f22820a = r4     // Catch: java.lang.Exception -> L45
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.String r4 = "isTagEnabled"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L45
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L45
            r5[r0] = r6     // Catch: java.lang.Exception -> L45
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.Exception -> L45
            p321s1.C5944a.f22821b = r1     // Catch: java.lang.Exception -> L45
        L2e:
            java.lang.reflect.Method r1 = p321s1.C5944a.f22821b     // Catch: java.lang.Exception -> L45
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L45
            long r4 = p321s1.C5944a.f22820a     // Catch: java.lang.Exception -> L45
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L45
            r2[r0] = r4     // Catch: java.lang.Exception -> L45
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L45
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L45
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Exception -> L45
            goto L62
        L45:
            r1 = move-exception
            boolean r2 = r1 instanceof java.lang.reflect.InvocationTargetException
            if (r2 == 0) goto L5b
            java.lang.Throwable r0 = r1.getCause()
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L55
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L55:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L5b:
            java.lang.String r2 = "Trace"
            java.lang.String r3 = "Unable to call isTagEnabled via reflection"
            android.util.Log.v(r2, r3, r1)
        L62:
            return r0
    }
}
