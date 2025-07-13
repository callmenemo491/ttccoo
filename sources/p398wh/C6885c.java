package p398wh;

/* renamed from: wh.c */
/* loaded from: classes.dex */
public final class C6885c {
    private static volatile android.view.Choreographer choreographer;

    static {
            r0 = 0
            wh.a r1 = new wh.a     // Catch: java.lang.Throwable -> L11
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L11
            r3 = 1
            android.os.Handler r2 = m13947a(r2, r3)     // Catch: java.lang.Throwable -> L11
            r3 = 0
            r1.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L11
            goto L16
        L11:
            r1 = move-exception
            java.lang.Object r1 = p074e9.C1805a.m4520e(r1)
        L16:
            boolean r2 = r1 instanceof ch.C0979f.a
            if (r2 == 0) goto L1b
            goto L1c
        L1b:
            r0 = r1
        L1c:
            wh.b r0 = (p398wh.AbstractC6884b) r0
            return
    }

    /* renamed from: a */
    public static final android.os.Handler m13947a(android.os.Looper r7, boolean r8) {
            if (r8 == 0) goto L56
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            r1 = 0
            r2 = 0
            r3 = 1
            if (r8 < r0) goto L29
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            java.lang.String r0 = "createAsync"
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<android.os.Looper> r5 = android.os.Looper.class
            r4[r2] = r5
            java.lang.reflect.Method r8 = r8.getDeclaredMethod(r0, r4)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r7
            java.lang.Object r7 = r8.invoke(r1, r0)
            java.lang.String r8 = "null cannot be cast to non-null type android.os.Handler"
            java.util.Objects.requireNonNull(r7, r8)
            android.os.Handler r7 = (android.os.Handler) r7
            return r7
        L29:
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r0 = 3
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.Class<android.os.Looper> r5 = android.os.Looper.class
            r4[r2] = r5     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.Class<android.os.Handler$Callback> r5 = android.os.Handler.Callback.class
            r4[r3] = r5     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L50
            r6 = 2
            r4[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.reflect.Constructor r8 = r8.getDeclaredConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r7
            r0[r3] = r1
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r0[r6] = r7
            java.lang.Object r7 = r8.newInstance(r0)
            android.os.Handler r7 = (android.os.Handler) r7
            return r7
        L50:
            android.os.Handler r8 = new android.os.Handler
            r8.<init>(r7)
            return r8
        L56:
            android.os.Handler r8 = new android.os.Handler
            r8.<init>(r7)
            return r8
    }
}
