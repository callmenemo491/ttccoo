package androidx.lifecycle;

/* renamed from: androidx.lifecycle.s */
/* loaded from: classes.dex */
public class C0466s {

    /* renamed from: a */
    public static java.util.concurrent.atomic.AtomicBoolean f2561a;

    /* renamed from: androidx.lifecycle.s$a */
    public static class a extends androidx.lifecycle.C0450k {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.lifecycle.C0450k, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                androidx.lifecycle.FragmentC0451k0.m1441c(r1)
                return
        }

        @Override // androidx.lifecycle.C0450k, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // androidx.lifecycle.C0450k, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r1) {
                r0 = this;
                return
        }
    }

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.C0466s.f2561a = r0
            return
    }
}
