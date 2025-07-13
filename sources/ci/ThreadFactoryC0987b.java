package ci;

/* renamed from: ci.b */
/* loaded from: classes.dex */
public final class ThreadFactoryC0987b implements java.util.concurrent.ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ java.lang.String f5063a;

    /* renamed from: b */
    public final /* synthetic */ boolean f5064b;

    public ThreadFactoryC0987b(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.f5063a = r1
            r0.f5064b = r2
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.String r1 = r2.f5063a
            r0.<init>(r3, r1)
            boolean r3 = r2.f5064b
            r0.setDaemon(r3)
            return r0
    }
}
