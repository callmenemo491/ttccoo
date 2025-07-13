package p056da;

/* renamed from: da.o0 */
/* loaded from: classes.dex */
public final class C1375o0 {

    /* renamed from: a */
    public static final java.util.concurrent.ExecutorService f6943a = null;

    static {
            java.lang.String r0 = "awaitEvenIfOnMainThread task continuation executor"
            java.util.concurrent.ExecutorService r0 = p056da.C1359g0.m3874a(r0)
            p056da.C1375o0.f6943a = r0
            return
    }

    /* renamed from: a */
    public static <T> T m3893a(p327s7.AbstractC5985i<T> r4) {
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r1 = p056da.C1375o0.f6943a
            u3.b r2 = new u3.b
            r2.<init>(r0)
            r4.mo12447e(r1, r2)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r1 != r2) goto L22
            r1 = 4
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r0.await(r1, r3)
            goto L25
        L22:
            r0.await()
        L25:
            boolean r0 = r4.mo12455m()
            if (r0 == 0) goto L30
            java.lang.Object r4 = r4.mo12451i()
            return r4
        L30:
            boolean r0 = r4.mo12453k()
            if (r0 != 0) goto L4c
            boolean r0 = r4.mo12454l()
            if (r0 == 0) goto L46
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Exception r4 = r4.mo12450h()
            r0.<init>(r4)
            throw r0
        L46:
            java.util.concurrent.TimeoutException r4 = new java.util.concurrent.TimeoutException
            r4.<init>()
            throw r4
        L4c:
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Task is already canceled"
            r4.<init>(r0)
            throw r4
    }
}
