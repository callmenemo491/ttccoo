package p385w3;

/* renamed from: w3.h */
/* loaded from: classes.dex */
public class ExecutorC6786h implements java.util.concurrent.Executor {

    /* renamed from: Y */
    public final java.util.concurrent.Executor f26332Y;

    /* renamed from: w3.h$a */
    public static class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final java.lang.Runnable f26333Y;

        public a(java.lang.Runnable r1) {
                r0 = this;
                r0.<init>()
                r0.f26333Y = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.lang.Runnable r0 = r3.f26333Y     // Catch: java.lang.Exception -> L6
                r0.run()     // Catch: java.lang.Exception -> L6
                goto Le
            L6:
                r0 = move-exception
                java.lang.String r1 = "Executor"
                java.lang.String r2 = "Background execution failure."
                p064e.C1494h.m4054e(r1, r2, r0)
            Le:
                return
        }
    }

    public ExecutorC6786h(java.util.concurrent.Executor r1) {
            r0 = this;
            r0.<init>()
            r0.f26332Y = r1
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.f26332Y
            w3.h$a r1 = new w3.h$a
            r1.<init>(r3)
            r0.execute(r1)
            return
    }
}
