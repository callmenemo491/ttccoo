package p056da;

/* renamed from: da.f0 */
/* loaded from: classes.dex */
public class C1357f0 extends p056da.AbstractRunnableC1350c {

    /* renamed from: Y */
    public final /* synthetic */ java.lang.String f6904Y;

    /* renamed from: Z */
    public final /* synthetic */ java.util.concurrent.ExecutorService f6905Z;

    /* renamed from: a0 */
    public final /* synthetic */ long f6906a0;

    /* renamed from: b0 */
    public final /* synthetic */ java.util.concurrent.TimeUnit f6907b0;

    public C1357f0(java.lang.String r1, java.util.concurrent.ExecutorService r2, long r3, java.util.concurrent.TimeUnit r5) {
            r0 = this;
            r0.f6904Y = r1
            r0.f6905Z = r2
            r0.f6906a0 = r3
            r0.f6907b0 = r5
            r0.<init>()
            return
    }

    @Override // p056da.AbstractRunnableC1350c
    /* renamed from: a */
    public void mo3852a() {
            r9 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            r1 = 0
            r2 = 3
            r3 = 0
            r4 = 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.InterruptedException -> L5f
            r5.<init>()     // Catch: java.lang.InterruptedException -> L5f
            java.lang.String r6 = "Executing shutdown hook for "
            r5.append(r6)     // Catch: java.lang.InterruptedException -> L5f
            java.lang.String r6 = r9.f6904Y     // Catch: java.lang.InterruptedException -> L5f
            r5.append(r6)     // Catch: java.lang.InterruptedException -> L5f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.InterruptedException -> L5f
            boolean r6 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.InterruptedException -> L5f
            if (r6 == 0) goto L21
            r6 = 1
            goto L22
        L21:
            r6 = 0
        L22:
            if (r6 == 0) goto L27
            android.util.Log.d(r0, r5, r1)     // Catch: java.lang.InterruptedException -> L5f
        L27:
            java.util.concurrent.ExecutorService r5 = r9.f6905Z     // Catch: java.lang.InterruptedException -> L5f
            r5.shutdown()     // Catch: java.lang.InterruptedException -> L5f
            java.util.concurrent.ExecutorService r5 = r9.f6905Z     // Catch: java.lang.InterruptedException -> L5f
            long r6 = r9.f6906a0     // Catch: java.lang.InterruptedException -> L5f
            java.util.concurrent.TimeUnit r8 = r9.f6907b0     // Catch: java.lang.InterruptedException -> L5f
            boolean r5 = r5.awaitTermination(r6, r8)     // Catch: java.lang.InterruptedException -> L5f
            if (r5 != 0) goto L7e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.InterruptedException -> L5f
            r5.<init>()     // Catch: java.lang.InterruptedException -> L5f
            java.lang.String r6 = r9.f6904Y     // Catch: java.lang.InterruptedException -> L5f
            r5.append(r6)     // Catch: java.lang.InterruptedException -> L5f
            java.lang.String r6 = " did not shut down in the allocated time. Requesting immediate shutdown."
            r5.append(r6)     // Catch: java.lang.InterruptedException -> L5f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.InterruptedException -> L5f
            boolean r6 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.InterruptedException -> L5f
            if (r6 == 0) goto L53
            r6 = 1
            goto L54
        L53:
            r6 = 0
        L54:
            if (r6 == 0) goto L59
            android.util.Log.d(r0, r5, r1)     // Catch: java.lang.InterruptedException -> L5f
        L59:
            java.util.concurrent.ExecutorService r5 = r9.f6905Z     // Catch: java.lang.InterruptedException -> L5f
            r5.shutdownNow()     // Catch: java.lang.InterruptedException -> L5f
            goto L7e
        L5f:
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r7 = r9.f6904Y
            r6[r3] = r7
            java.lang.String r7 = "Interrupted while waiting for %s to shut down. Requesting immediate shutdown."
            java.lang.String r5 = java.lang.String.format(r5, r7, r6)
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L74
            r3 = 1
        L74:
            if (r3 == 0) goto L79
            android.util.Log.d(r0, r5, r1)
        L79:
            java.util.concurrent.ExecutorService r0 = r9.f6905Z
            r0.shutdownNow()
        L7e:
            return
    }
}
