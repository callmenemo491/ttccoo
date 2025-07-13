package p056da;

/* renamed from: da.e0 */
/* loaded from: classes.dex */
public class ThreadFactoryC1355e0 implements java.util.concurrent.ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ java.lang.String f6896a;

    /* renamed from: b */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f6897b;

    /* renamed from: da.e0$a */
    public class a extends p056da.AbstractRunnableC1350c {

        /* renamed from: Y */
        public final /* synthetic */ java.lang.Runnable f6898Y;

        public a(p056da.ThreadFactoryC1355e0 r1, java.lang.Runnable r2) {
                r0 = this;
                r0.f6898Y = r2
                r0.<init>()
                return
        }

        @Override // p056da.AbstractRunnableC1350c
        /* renamed from: a */
        public void mo3852a() {
                r1 = this;
                java.lang.Runnable r0 = r1.f6898Y
                r0.run()
                return
        }
    }

    public ThreadFactoryC1355e0(java.lang.String r1, java.util.concurrent.atomic.AtomicLong r2) {
            r0 = this;
            r0.f6896a = r1
            r0.f6897b = r2
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r4) {
            r3 = this;
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            da.e0$a r1 = new da.e0$a
            r1.<init>(r3, r4)
            java.lang.Thread r4 = r0.newThread(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.f6896a
            r0.append(r1)
            java.util.concurrent.atomic.AtomicLong r1 = r3.f6897b
            long r1 = r1.getAndIncrement()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.setName(r0)
            return r4
    }
}
