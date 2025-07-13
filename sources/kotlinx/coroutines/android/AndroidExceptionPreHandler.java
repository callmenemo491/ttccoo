package kotlinx.coroutines.android;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public final class AndroidExceptionPreHandler extends p101fh.AbstractC2169a implements kotlinx.coroutines.CoroutineExceptionHandler {
    private volatile java.lang.Object _preHandler;

    public AndroidExceptionPreHandler() {
            r1 = this;
            kotlinx.coroutines.CoroutineExceptionHandler$a r0 = kotlinx.coroutines.CoroutineExceptionHandler.C4149a.f17183Y
            r1.<init>(r0)
            r1._preHandler = r1
            return
    }

    private final java.lang.reflect.Method preHandler() {
            r5 = this;
            java.lang.Object r0 = r5._preHandler
            if (r0 == r5) goto L7
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
        L7:
            r0 = 0
            java.lang.Class<java.lang.Thread> r1 = java.lang.Thread.class
            java.lang.String r2 = "getUncaughtExceptionPreHandler"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L2b
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L2b
            int r2 = r1.getModifiers()     // Catch: java.lang.Throwable -> L2b
            boolean r2 = java.lang.reflect.Modifier.isPublic(r2)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L28
            int r2 = r1.getModifiers()     // Catch: java.lang.Throwable -> L2b
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L28
            r3 = 1
        L28:
            if (r3 == 0) goto L2b
            r0 = r1
        L2b:
            r5._preHandler = r0
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(p101fh.InterfaceC2175g r4, java.lang.Throwable r5) {
            r3 = this;
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L12
            java.lang.Thread$UncaughtExceptionHandler r0 = r4.getUncaughtExceptionHandler()
            r0.uncaughtException(r4, r5)
            goto L2f
        L12:
            java.lang.reflect.Method r0 = r3.preHandler()
            r1 = 0
            if (r0 != 0) goto L1b
            r0 = r1
            goto L22
        L1b:
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r1, r2)
        L22:
            boolean r2 = r0 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r2 == 0) goto L29
            r1 = r0
            java.lang.Thread$UncaughtExceptionHandler r1 = (java.lang.Thread.UncaughtExceptionHandler) r1
        L29:
            if (r1 != 0) goto L2c
            goto L2f
        L2c:
            r1.uncaughtException(r4, r5)
        L2f:
            return
    }
}
