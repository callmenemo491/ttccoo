package p085f1;

/* renamed from: f1.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1950a implements java.util.concurrent.Executor {

    /* renamed from: Y */
    public final /* synthetic */ int f8507Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f8508Z;

    public /* synthetic */ ExecutorC1950a(android.os.Handler r1, int r2) {
            r0 = this;
            r0.f8507Y = r2
            r0.<init>()
            r0.f8508Z = r1
            return
    }

    public /* synthetic */ ExecutorC1950a(p085f1.C1974o.e.c r2) {
            r1 = this;
            r0 = 2
            r1.f8507Y = r0
            r1.<init>()
            r1.f8508Z = r2
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            int r0 = r1.f8507Y
            switch(r0) {
                case 0: goto L6;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            java.lang.Object r0 = r1.f8508Z
            android.os.Handler r0 = (android.os.Handler) r0
        La:
            r0.post(r2)
            return
        Le:
            java.lang.Object r0 = r1.f8508Z
            f1.o$e$c r0 = (p085f1.C1974o.e.c) r0
            goto La
    }
}
