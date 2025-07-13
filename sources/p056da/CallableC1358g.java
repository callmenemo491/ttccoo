package p056da;

/* renamed from: da.g */
/* loaded from: classes.dex */
public class CallableC1358g implements java.util.concurrent.Callable<java.lang.Void> {

    /* renamed from: a */
    public final /* synthetic */ java.lang.Runnable f6908a;

    public CallableC1358g(p056da.C1356f r1, java.lang.Runnable r2) {
            r0 = this;
            r0.f6908a = r2
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Void call() {
            r1 = this;
            java.lang.Runnable r0 = r1.f6908a
            r0.run()
            r0 = 0
            return r0
    }
}
