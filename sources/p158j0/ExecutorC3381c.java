package p158j0;

/* renamed from: j0.c */
/* loaded from: classes.dex */
public class ExecutorC3381c implements java.util.concurrent.Executor {

    /* renamed from: Y */
    public final android.os.Handler f14537Y;

    public ExecutorC3381c(android.os.Handler r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.f14537Y = r1
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r3) {
            r2 = this;
            android.os.Handler r0 = r2.f14537Y
            java.util.Objects.requireNonNull(r3)
            boolean r3 = r0.post(r3)
            if (r3 == 0) goto Lc
            return
        Lc:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.os.Handler r1 = r2.f14537Y
            r0.append(r1)
            java.lang.String r1 = " is shutting down"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }
}
