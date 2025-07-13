package p056da;

/* renamed from: da.c */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1350c implements java.lang.Runnable {
    public AbstractRunnableC1350c() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract void mo3852a();

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            r1.mo3852a()
            return
    }
}
