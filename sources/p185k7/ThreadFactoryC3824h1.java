package p185k7;

/* renamed from: k7.h1 */
/* loaded from: classes.dex */
public final class ThreadFactoryC3824h1 implements java.util.concurrent.ThreadFactory {

    /* renamed from: a */
    public final java.util.concurrent.ThreadFactory f16659a;

    public ThreadFactoryC3824h1() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r1.f16659a = r0
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ThreadFactory r0 = r1.f16659a
            java.lang.Thread r2 = r0.newThread(r2)
            java.lang.String r0 = "ScionFrontendApi"
            r2.setName(r0)
            return r2
    }
}
