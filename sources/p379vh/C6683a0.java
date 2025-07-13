package p379vh;

/* renamed from: vh.a0 */
/* loaded from: classes.dex */
public final class C6683a0 {

    /* renamed from: a */
    public static final java.util.List<kotlinx.coroutines.CoroutineExceptionHandler> f25953a = null;

    static {
            java.lang.Class<kotlinx.coroutines.CoroutineExceptionHandler> r0 = kotlinx.coroutines.CoroutineExceptionHandler.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            th.d r0 = th.C6251i.m12832D(r0)
            java.util.List r0 = th.C6249g.m12831E(r0)
            p379vh.C6683a0.f25953a = r0
            return
    }

    /* renamed from: a */
    public static final void m13548a(p101fh.InterfaceC2175g r6, java.lang.Throwable r7) {
            java.util.List<kotlinx.coroutines.CoroutineExceptionHandler> r0 = p379vh.C6683a0.f25953a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            kotlinx.coroutines.CoroutineExceptionHandler r1 = (kotlinx.coroutines.CoroutineExceptionHandler) r1
            r1.handleException(r6, r7)     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r1 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r3 = r2.getUncaughtExceptionHandler()
            if (r7 != r1) goto L23
            r4 = r7
            goto L2d
        L23:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Exception while trying to handle coroutine exception"
            r4.<init>(r5, r1)
            p185k7.C3836i.m8616a(r4, r7)
        L2d:
            r3.uncaughtException(r2, r4)
            goto L6
        L31:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r0 = r6.getUncaughtExceptionHandler()
            r0.uncaughtException(r6, r7)
            return
    }
}
