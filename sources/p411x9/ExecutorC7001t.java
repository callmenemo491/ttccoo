package p411x9;

/* renamed from: x9.t */
/* loaded from: classes.dex */
public final class ExecutorC7001t implements java.util.concurrent.Executor {

    /* renamed from: Z */
    public static final p411x9.ExecutorC7001t f27296Z = null;

    /* renamed from: Y */
    public final android.os.Handler f27297Y;

    static {
            x9.t r0 = new x9.t
            r0.<init>()
            p411x9.ExecutorC7001t.f27296Z = r0
            return
    }

    public ExecutorC7001t() {
            r2 = this;
            r2.<init>()
            h7.g6 r0 = new h7.g6
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.f27297Y = r0
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.f27297Y
            r0.post(r2)
            return
    }
}
