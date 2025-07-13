package androidx.lifecycle;

/* renamed from: androidx.lifecycle.j0 */
/* loaded from: classes.dex */
public class C0449j0 extends androidx.lifecycle.C0450k {
    public final /* synthetic */ androidx.lifecycle.C0447i0 this$0;

    /* renamed from: androidx.lifecycle.j0$a */
    public class a extends androidx.lifecycle.C0450k {
        public final /* synthetic */ androidx.lifecycle.C0449j0 this$1;

        public a(androidx.lifecycle.C0449j0 r1) {
                r0 = this;
                r0.this$1 = r1
                r0.<init>()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity r1) {
                r0 = this;
                androidx.lifecycle.j0 r1 = r0.this$1
                androidx.lifecycle.i0 r1 = r1.this$0
                r1.m1435a()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity r1) {
                r0 = this;
                androidx.lifecycle.j0 r1 = r0.this$1
                androidx.lifecycle.i0 r1 = r1.this$0
                r1.m1436c()
                return
        }
    }

    public C0449j0(androidx.lifecycle.C0447i0 r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    @Override // androidx.lifecycle.C0450k, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r3 >= r0) goto L1a
            int r3 = androidx.lifecycle.FragmentC0451k0.f2527Z
            android.app.FragmentManager r2 = r2.getFragmentManager()
            java.lang.String r3 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
            android.app.Fragment r2 = r2.findFragmentByTag(r3)
            androidx.lifecycle.k0 r2 = (androidx.lifecycle.FragmentC0451k0) r2
            androidx.lifecycle.i0 r3 = r1.this$0
            androidx.lifecycle.k0$a r3 = r3.f2520f0
            r2.f2528Y = r3
        L1a:
            return
    }

    @Override // androidx.lifecycle.C0450k, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity r4) {
            r3 = this;
            androidx.lifecycle.i0 r4 = r3.this$0
            int r0 = r4.f2514Z
            int r0 = r0 + (-1)
            r4.f2514Z = r0
            if (r0 != 0) goto L13
            android.os.Handler r0 = r4.f2517c0
            java.lang.Runnable r4 = r4.f2519e0
            r1 = 700(0x2bc, double:3.46E-321)
            r0.postDelayed(r4, r1)
        L13:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            androidx.lifecycle.j0$a r2 = new androidx.lifecycle.j0$a
            r2.<init>(r0)
            r1.registerActivityLifecycleCallbacks(r2)
            return
    }

    @Override // androidx.lifecycle.C0450k, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity r4) {
            r3 = this;
            androidx.lifecycle.i0 r4 = r3.this$0
            int r0 = r4.f2513Y
            r1 = 1
            int r0 = r0 - r1
            r4.f2513Y = r0
            if (r0 != 0) goto L17
            boolean r0 = r4.f2515a0
            if (r0 == 0) goto L17
            androidx.lifecycle.w r0 = r4.f2518d0
            androidx.lifecycle.o$b r2 = androidx.lifecycle.AbstractC0458o.b.ON_STOP
            r0.m1462e(r2)
            r4.f2516b0 = r1
        L17:
            return
    }
}
