package p030c0;

/* renamed from: c0.e */
/* loaded from: classes.dex */
public class RunnableC0818e implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ java.lang.Object f4443Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f4444Z;

    public RunnableC0818e(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.f4443Y = r1
            r0.f4444Z = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r7 = this;
            java.lang.reflect.Method r0 = p030c0.C0817d.f4429d     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L37
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L1c
            java.lang.Object r4 = r7.f4443Y     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L37
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L37
            java.lang.Object r6 = r7.f4444Z     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L37
            r5[r2] = r6     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L37
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L37
            r5[r1] = r2     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L37
            java.lang.String r1 = "AppCompat recreation"
            r5[r3] = r1     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L37
            r0.invoke(r4, r5)     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L37
            goto L54
        L1c:
            java.lang.reflect.Method r0 = p030c0.C0817d.f4430e     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L37
            java.lang.Object r4 = r7.f4443Y     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L37
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L37
            java.lang.Object r5 = r7.f4444Z     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L37
            r3[r2] = r5     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L37
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L37
            r3[r1] = r2     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L37
            r0.invoke(r4, r3)     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L37
            goto L54
        L2e:
            r0 = move-exception
            java.lang.String r1 = "ActivityRecreator"
            java.lang.String r2 = "Exception while invoking performStopActivity"
            android.util.Log.e(r1, r2, r0)
            goto L54
        L37:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()
            java.lang.Class<java.lang.RuntimeException> r2 = java.lang.RuntimeException.class
            if (r1 != r2) goto L54
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L54
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "Unable to stop"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto L53
            goto L54
        L53:
            throw r0
        L54:
            return
    }
}
