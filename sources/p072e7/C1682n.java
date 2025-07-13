package p072e7;

/* renamed from: e7.n */
/* loaded from: classes.dex */
public final class C1682n {

    /* renamed from: a */
    public static final java.lang.Object f7693a = null;

    static {
            r0 = 0
            r1 = 0
            java.lang.String r2 = "sun.misc.SharedSecrets"
            java.lang.Class r2 = java.lang.Class.forName(r2, r1, r0)     // Catch: java.lang.Throwable -> L16 java.lang.ThreadDeath -> L4b
            java.lang.String r3 = "getJavaLangAccess"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L16 java.lang.ThreadDeath -> L4b
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L16 java.lang.ThreadDeath -> L4b
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L16 java.lang.ThreadDeath -> L4b
            java.lang.Object r0 = r2.invoke(r0, r3)     // Catch: java.lang.Throwable -> L16 java.lang.ThreadDeath -> L4b
        L16:
            p072e7.C1682n.f7693a = r0
            r2 = 1
            if (r0 != 0) goto L1c
            goto L2c
        L1c:
            r3 = 2
            java.lang.Class[] r3 = new java.lang.Class[r3]
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r3[r1] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r2] = r4
            java.lang.String r4 = "getStackTraceElement"
            m4351a(r4, r3)
        L2c:
            if (r0 != 0) goto L2f
            goto L4a
        L2f:
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L4a
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r3[r1] = r4     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = "getStackTraceDepth"
            java.lang.reflect.Method r3 = m4351a(r4, r3)     // Catch: java.lang.Throwable -> L4a
            if (r3 != 0) goto L3e
            goto L4a
        L3e:
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L4a
            java.lang.Throwable r4 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L4a
            r4.<init>()     // Catch: java.lang.Throwable -> L4a
            r2[r1] = r4     // Catch: java.lang.Throwable -> L4a
            r3.invoke(r0, r2)     // Catch: java.lang.Throwable -> L4a
        L4a:
            return
        L4b:
            r0 = move-exception
            throw r0
    }

    /* renamed from: a */
    public static java.lang.reflect.Method m4351a(java.lang.String r3, java.lang.Class<?>... r4) {
            r0 = 0
            java.lang.String r1 = "sun.misc.JavaLangAccess"
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r2, r0)     // Catch: java.lang.Throwable -> Ld java.lang.ThreadDeath -> Le
            java.lang.reflect.Method r3 = r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> Ld java.lang.ThreadDeath -> Le
            return r3
        Ld:
            return r0
        Le:
            r3 = move-exception
            throw r3
    }
}
