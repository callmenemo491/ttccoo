package androidx.fragment.app;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public class C0374d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ android.view.ViewGroup f2096a;

    /* renamed from: b */
    public final /* synthetic */ android.view.View f2097b;

    /* renamed from: c */
    public final /* synthetic */ boolean f2098c;

    /* renamed from: d */
    public final /* synthetic */ androidx.fragment.app.AbstractC0370b1.d f2099d;

    /* renamed from: e */
    public final /* synthetic */ androidx.fragment.app.C0371c.b f2100e;

    public C0374d(androidx.fragment.app.C0371c r1, android.view.ViewGroup r2, android.view.View r3, boolean r4, androidx.fragment.app.AbstractC0370b1.d r5, androidx.fragment.app.C0371c.b r6) {
            r0 = this;
            r0.f2096a = r2
            r0.f2097b = r3
            r0.f2098c = r4
            r0.f2099d = r5
            r0.f2100e = r6
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            android.view.ViewGroup r2 = r1.f2096a
            android.view.View r0 = r1.f2097b
            r2.endViewTransition(r0)
            boolean r2 = r1.f2098c
            if (r2 == 0) goto L14
            androidx.fragment.app.b1$d r2 = r1.f2099d
            androidx.fragment.app.b1$d$c r2 = r2.f2066a
            android.view.View r0 = r1.f2097b
            r2.m1109e(r0)
        L14:
            androidx.fragment.app.c$b r2 = r1.f2100e
            r2.m1114a()
            return
    }
}
