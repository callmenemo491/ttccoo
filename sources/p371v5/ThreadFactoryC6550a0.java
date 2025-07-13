package p371v5;

/* renamed from: v5.a0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC6550a0 implements java.util.concurrent.ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ int f25622a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f25623b;

    public /* synthetic */ ThreadFactoryC6550a0(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.f25622a = r0
            r1.<init>()
            r1.f25623b = r2
            return
    }

    public /* synthetic */ ThreadFactoryC6550a0(java.util.concurrent.atomic.AtomicInteger r2) {
            r1 = this;
            r0 = 1
            r1.f25622a = r0
            r1.<init>()
            r1.f25623b = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r4) {
            r3 = this;
            int r0 = r3.f25622a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            java.lang.Object r0 = r3.f25623b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Thread r1 = new java.lang.Thread
            r1.<init>(r4, r0)
            return r1
        L10:
            java.lang.Object r0 = r3.f25623b
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            vh.q r1 = p379vh.C6730q.f26024Z
            java.lang.Thread r1 = new java.lang.Thread
            int r0 = r0.incrementAndGet()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "CommonPool-worker-"
            java.lang.String r0 = p214m2.C4339q.m9711u(r2, r0)
            r1.<init>(r4, r0)
            r4 = 1
            r1.setDaemon(r4)
            return r1
    }
}
