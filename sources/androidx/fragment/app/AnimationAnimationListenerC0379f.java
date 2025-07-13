package androidx.fragment.app;

/* renamed from: androidx.fragment.app.f */
/* loaded from: classes.dex */
public class AnimationAnimationListenerC0379f implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ android.view.ViewGroup f2157a;

    /* renamed from: b */
    public final /* synthetic */ android.view.View f2158b;

    /* renamed from: c */
    public final /* synthetic */ androidx.fragment.app.C0371c.b f2159c;

    /* renamed from: androidx.fragment.app.f$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.fragment.app.AnimationAnimationListenerC0379f f2160Y;

        public a(androidx.fragment.app.AnimationAnimationListenerC0379f r1) {
                r0 = this;
                r0.f2160Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.fragment.app.f r0 = r2.f2160Y
                android.view.ViewGroup r1 = r0.f2157a
                android.view.View r0 = r0.f2158b
                r1.endViewTransition(r0)
                androidx.fragment.app.f r0 = r2.f2160Y
                androidx.fragment.app.c$b r0 = r0.f2159c
                r0.m1114a()
                return
        }
    }

    public AnimationAnimationListenerC0379f(androidx.fragment.app.C0371c r1, android.view.ViewGroup r2, android.view.View r3, androidx.fragment.app.C0371c.b r4) {
            r0 = this;
            r0.f2157a = r2
            r0.f2158b = r3
            r0.f2159c = r4
            r0.<init>()
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation r2) {
            r1 = this;
            android.view.ViewGroup r2 = r1.f2157a
            androidx.fragment.app.f$a r0 = new androidx.fragment.app.f$a
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
