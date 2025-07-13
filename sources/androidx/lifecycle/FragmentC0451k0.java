package androidx.lifecycle;

/* renamed from: androidx.lifecycle.k0 */
/* loaded from: classes.dex */
public class FragmentC0451k0 extends android.app.Fragment {

    /* renamed from: Z */
    public static final /* synthetic */ int f2527Z = 0;

    /* renamed from: Y */
    public androidx.lifecycle.FragmentC0451k0.a f2528Y;

    /* renamed from: androidx.lifecycle.k0$a */
    public interface a {
    }

    /* renamed from: androidx.lifecycle.k0$b */
    public static class b implements android.app.Application.ActivityLifecycleCallbacks {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void registerIn(android.app.Activity r1) {
                androidx.lifecycle.k0$b r0 = new androidx.lifecycle.k0$b
                r0.<init>()
                r1.registerActivityLifecycleCallbacks(r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                androidx.lifecycle.o$b r2 = androidx.lifecycle.AbstractC0458o.b.ON_CREATE
                androidx.lifecycle.FragmentC0451k0.m1440a(r1, r2)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity r2) {
                r1 = this;
                androidx.lifecycle.o$b r0 = androidx.lifecycle.AbstractC0458o.b.ON_RESUME
                androidx.lifecycle.FragmentC0451k0.m1440a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity r2) {
                r1 = this;
                androidx.lifecycle.o$b r0 = androidx.lifecycle.AbstractC0458o.b.ON_START
                androidx.lifecycle.FragmentC0451k0.m1440a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(android.app.Activity r2) {
                r1 = this;
                androidx.lifecycle.o$b r0 = androidx.lifecycle.AbstractC0458o.b.ON_DESTROY
                androidx.lifecycle.FragmentC0451k0.m1440a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(android.app.Activity r2) {
                r1 = this;
                androidx.lifecycle.o$b r0 = androidx.lifecycle.AbstractC0458o.b.ON_PAUSE
                androidx.lifecycle.FragmentC0451k0.m1440a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(android.app.Activity r2) {
                r1 = this;
                androidx.lifecycle.o$b r0 = androidx.lifecycle.AbstractC0458o.b.ON_STOP
                androidx.lifecycle.FragmentC0451k0.m1440a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r1) {
                r0 = this;
                return
        }
    }

    public FragmentC0451k0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static void m1440a(android.app.Activity r2, androidx.lifecycle.AbstractC0458o.b r3) {
            boolean r0 = r2 instanceof androidx.lifecycle.InterfaceC0473x
            java.lang.String r1 = "handleLifecycleEvent"
            if (r0 == 0) goto L17
            androidx.lifecycle.x r2 = (androidx.lifecycle.InterfaceC0473x) r2
            androidx.lifecycle.w r2 = r2.mo428b()
            r2.m1461d(r1)
            androidx.lifecycle.o$c r3 = r3.m1457e()
            r2.m1463g(r3)
            return
        L17:
            boolean r0 = r2 instanceof androidx.lifecycle.InterfaceC0471v
            if (r0 == 0) goto L31
            androidx.lifecycle.v r2 = (androidx.lifecycle.InterfaceC0471v) r2
            androidx.lifecycle.o r2 = r2.mo428b()
            boolean r0 = r2 instanceof androidx.lifecycle.C0472w
            if (r0 == 0) goto L31
            androidx.lifecycle.w r2 = (androidx.lifecycle.C0472w) r2
            r2.m1461d(r1)
            androidx.lifecycle.o$c r3 = r3.m1457e()
            r2.m1463g(r3)
        L31:
            return
    }

    /* renamed from: c */
    public static void m1441c(android.app.Activity r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L9
            androidx.lifecycle.FragmentC0451k0.b.registerIn(r3)
        L9:
            android.app.FragmentManager r3 = r3.getFragmentManager()
            java.lang.String r0 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
            android.app.Fragment r1 = r3.findFragmentByTag(r0)
            if (r1 != 0) goto L28
            android.app.FragmentTransaction r1 = r3.beginTransaction()
            androidx.lifecycle.k0 r2 = new androidx.lifecycle.k0
            r2.<init>()
            android.app.FragmentTransaction r0 = r1.add(r2, r0)
            r0.commit()
            r3.executePendingTransactions()
        L28:
            return
    }

    /* renamed from: b */
    public final void m1442b(androidx.lifecycle.AbstractC0458o.b r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto Ld
            android.app.Activity r0 = r2.getActivity()
            m1440a(r0, r3)
        Ld:
            return
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle r1) {
            r0 = this;
            super.onActivityCreated(r1)
            androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_CREATE
            r0.m1442b(r1)
            return
    }

    @Override // android.app.Fragment
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            androidx.lifecycle.o$b r0 = androidx.lifecycle.AbstractC0458o.b.ON_DESTROY
            r1.m1442b(r0)
            r0 = 0
            r1.f2528Y = r0
            return
    }

    @Override // android.app.Fragment
    public void onPause() {
            r1 = this;
            super.onPause()
            androidx.lifecycle.o$b r0 = androidx.lifecycle.AbstractC0458o.b.ON_PAUSE
            r1.m1442b(r0)
            return
    }

    @Override // android.app.Fragment
    public void onResume() {
            r1 = this;
            super.onResume()
            androidx.lifecycle.k0$a r0 = r1.f2528Y
            if (r0 == 0) goto Le
            androidx.lifecycle.i0$b r0 = (androidx.lifecycle.C0447i0.b) r0
            androidx.lifecycle.i0 r0 = r0.f2522a
            r0.m1435a()
        Le:
            androidx.lifecycle.o$b r0 = androidx.lifecycle.AbstractC0458o.b.ON_RESUME
            r1.m1442b(r0)
            return
    }

    @Override // android.app.Fragment
    public void onStart() {
            r1 = this;
            super.onStart()
            androidx.lifecycle.k0$a r0 = r1.f2528Y
            if (r0 == 0) goto Le
            androidx.lifecycle.i0$b r0 = (androidx.lifecycle.C0447i0.b) r0
            androidx.lifecycle.i0 r0 = r0.f2522a
            r0.m1436c()
        Le:
            androidx.lifecycle.o$b r0 = androidx.lifecycle.AbstractC0458o.b.ON_START
            r1.m1442b(r0)
            return
    }

    @Override // android.app.Fragment
    public void onStop() {
            r1 = this;
            super.onStop()
            androidx.lifecycle.o$b r0 = androidx.lifecycle.AbstractC0458o.b.ON_STOP
            r1.m1442b(r0)
            return
    }
}
