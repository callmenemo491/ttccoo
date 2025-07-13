package p178k0;

/* renamed from: k0.n */
/* loaded from: classes.dex */
public class ThreadFactoryC3638n implements java.util.concurrent.ThreadFactory {

    /* renamed from: a */
    public java.lang.String f16039a;

    /* renamed from: b */
    public int f16040b;

    /* renamed from: k0.n$a */
    public static class a extends java.lang.Thread {

        /* renamed from: Y */
        public final int f16041Y;

        public a(java.lang.Runnable r1, java.lang.String r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f16041Y = r3
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r1 = this;
                int r0 = r1.f16041Y
                android.os.Process.setThreadPriority(r0)
                super.run()
                return
        }
    }

    public ThreadFactoryC3638n(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f16039a = r1
            r0.f16040b = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r4) {
            r3 = this;
            k0.n$a r0 = new k0.n$a
            java.lang.String r1 = r3.f16039a
            int r2 = r3.f16040b
            r0.<init>(r4, r1, r2)
            return r0
    }
}
