package androidx.fragment.app;

/* renamed from: androidx.fragment.app.u */
/* loaded from: classes.dex */
public class AnimationAnimationListenerC0409u implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ android.view.ViewGroup f2382a;

    /* renamed from: b */
    public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f2383b;

    /* renamed from: c */
    public final /* synthetic */ androidx.fragment.app.C0408t0.a f2384c;

    /* renamed from: d */
    public final /* synthetic */ p158j0.C3380b f2385d;

    /* renamed from: androidx.fragment.app.u$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.fragment.app.AnimationAnimationListenerC0409u f2386Y;

        public a(androidx.fragment.app.AnimationAnimationListenerC0409u r1) {
                r0 = this;
                r0.f2386Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.fragment.app.u r0 = r3.f2386Y
                androidx.fragment.app.n r0 = r0.f2383b
                android.view.View r0 = r0.m1335t()
                if (r0 == 0) goto L1f
                androidx.fragment.app.u r0 = r3.f2386Y
                androidx.fragment.app.n r0 = r0.f2383b
                r1 = 0
                r0.m1338u0(r1)
                androidx.fragment.app.u r0 = r3.f2386Y
                androidx.fragment.app.t0$a r1 = r0.f2384c
                androidx.fragment.app.n r2 = r0.f2383b
                j0.b r0 = r0.f2385d
                androidx.fragment.app.d0$d r1 = (androidx.fragment.app.AbstractC0375d0.d) r1
                r1.m1194a(r2, r0)
            L1f:
                return
        }
    }

    public AnimationAnimationListenerC0409u(android.view.ViewGroup r1, androidx.fragment.app.ComponentCallbacksC0395n r2, androidx.fragment.app.C0408t0.a r3, p158j0.C3380b r4) {
            r0 = this;
            r0.f2382a = r1
            r0.f2383b = r2
            r0.f2384c = r3
            r0.f2385d = r4
            r0.<init>()
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation r2) {
            r1 = this;
            android.view.ViewGroup r2 = r1.f2382a
            androidx.fragment.app.u$a r0 = new androidx.fragment.app.u$a
            r0.<init>(r1)
            r2.post(r0)
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation r1) {
            r0 = this;
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation r1) {
            r0 = this;
            return
    }
}
