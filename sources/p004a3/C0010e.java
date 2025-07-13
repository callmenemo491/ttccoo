package p004a3;

@java.lang.Deprecated
/* renamed from: a3.e */
/* loaded from: classes.dex */
public final class C0010e {
    /* renamed from: a */
    public static p004a3.InterfaceC0008c m19a(java.lang.String r3) {
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L39
            r0 = 0
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2f java.lang.InstantiationException -> L34
            java.lang.reflect.Constructor r2 = r3.getDeclaredConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2f java.lang.InstantiationException -> L34
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2f java.lang.InstantiationException -> L34
            java.lang.Object r3 = r2.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2f java.lang.InstantiationException -> L34
            boolean r0 = r3 instanceof p004a3.InterfaceC0008c
            if (r0 == 0) goto L19
            a3.c r3 = (p004a3.InterfaceC0008c) r3
            return r3
        L19:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Expected instanceof GlideModule, but found: "
            java.lang.String r3 = p214m2.C4338p.m9700a(r1, r3)
            r0.<init>(r3)
            throw r0
        L25:
            r0 = move-exception
            m20b(r3, r0)
            throw r1
        L2a:
            r0 = move-exception
            m20b(r3, r0)
            throw r1
        L2f:
            r0 = move-exception
            m20b(r3, r0)
            throw r1
        L34:
            r0 = move-exception
            m20b(r3, r0)
            throw r1
        L39:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unable to find GlideModule implementation"
            r0.<init>(r1, r3)
            throw r0
    }

    /* renamed from: b */
    public static void m20b(java.lang.Class<?> r3, java.lang.Exception r4) {
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to instantiate GlideModule implementation for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r4)
            throw r0
    }
}
