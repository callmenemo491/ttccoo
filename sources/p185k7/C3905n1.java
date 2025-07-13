package p185k7;

/* renamed from: k7.n1 */
/* loaded from: classes.dex */
public final class C3905n1 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: Y */
    public final /* synthetic */ p185k7.C3918o1 f16755Y;

    public C3905n1(p185k7.C3918o1 r1) {
            r0 = this;
            r0.f16755Y = r1
            r0.<init>()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r3, android.os.Bundle r4) {
            r2 = this;
            k7.o1 r0 = r2.f16755Y
            k7.g1 r1 = new k7.g1
            r1.<init>(r2, r4, r3)
            java.util.concurrent.ExecutorService r3 = r0.f16791a
            r3.execute(r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r4) {
            r3 = this;
            k7.o1 r0 = r3.f16755Y
            k7.l1 r1 = new k7.l1
            r2 = 4
            r1.<init>(r3, r4, r2)
            java.util.concurrent.ExecutorService r4 = r0.f16791a
            r4.execute(r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r4) {
            r3 = this;
            k7.o1 r0 = r3.f16755Y
            k7.l1 r1 = new k7.l1
            r2 = 2
            r1.<init>(r3, r4, r2)
            java.util.concurrent.ExecutorService r4 = r0.f16791a
            r4.execute(r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r4) {
            r3 = this;
            k7.o1 r0 = r3.f16755Y
            k7.l1 r1 = new k7.l1
            r2 = 1
            r1.<init>(r3, r4, r2)
            java.util.concurrent.ExecutorService r4 = r0.f16791a
            r4.execute(r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r4, android.os.Bundle r5) {
            r3 = this;
            k7.k0 r0 = new k7.k0
            r0.<init>()
            k7.o1 r1 = r3.f16755Y
            k7.g1 r2 = new k7.g1
            r2.<init>(r3, r4, r0)
            java.util.concurrent.ExecutorService r4 = r1.f16791a
            r4.execute(r2)
            r1 = 50
            android.os.Bundle r4 = r0.m8751x(r1)
            if (r4 == 0) goto L1c
            r5.putAll(r4)
        L1c:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r4) {
            r3 = this;
            k7.o1 r0 = r3.f16755Y
            k7.l1 r1 = new k7.l1
            r2 = 0
            r1.<init>(r3, r4, r2)
            java.util.concurrent.ExecutorService r4 = r0.f16791a
            r4.execute(r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r4) {
            r3 = this;
            k7.o1 r0 = r3.f16755Y
            k7.l1 r1 = new k7.l1
            r2 = 3
            r1.<init>(r3, r4, r2)
            java.util.concurrent.ExecutorService r4 = r0.f16791a
            r4.execute(r1)
            return
    }
}
