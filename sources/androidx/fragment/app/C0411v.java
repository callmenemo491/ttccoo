package androidx.fragment.app;

/* renamed from: androidx.fragment.app.v */
/* loaded from: classes.dex */
public class C0411v extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ android.view.ViewGroup f2399a;

    /* renamed from: b */
    public final /* synthetic */ android.view.View f2400b;

    /* renamed from: c */
    public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f2401c;

    /* renamed from: d */
    public final /* synthetic */ androidx.fragment.app.C0408t0.a f2402d;

    /* renamed from: e */
    public final /* synthetic */ p158j0.C3380b f2403e;

    public C0411v(android.view.ViewGroup r1, android.view.View r2, androidx.fragment.app.ComponentCallbacksC0395n r3, androidx.fragment.app.C0408t0.a r4, p158j0.C3380b r5) {
            r0 = this;
            r0.f2399a = r1
            r0.f2400b = r2
            r0.f2401c = r3
            r0.f2402d = r4
            r0.f2403e = r5
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r3) {
            r2 = this;
            android.view.ViewGroup r3 = r2.f2399a
            android.view.View r0 = r2.f2400b
            r3.endViewTransition(r0)
            androidx.fragment.app.n r3 = r2.f2401c
            androidx.fragment.app.n$d r0 = r3.f2263F0
            r1 = 0
            if (r0 != 0) goto L10
            r0 = r1
            goto L12
        L10:
            android.animation.Animator r0 = r0.f2308b
        L12:
            r3.m1342w0(r1)
            if (r0 == 0) goto L2c
            android.view.ViewGroup r3 = r2.f2399a
            android.view.View r0 = r2.f2400b
            int r3 = r3.indexOfChild(r0)
            if (r3 >= 0) goto L2c
            androidx.fragment.app.t0$a r3 = r2.f2402d
            androidx.fragment.app.n r0 = r2.f2401c
            j0.b r1 = r2.f2403e
            androidx.fragment.app.d0$d r3 = (androidx.fragment.app.AbstractC0375d0.d) r3
            r3.m1194a(r0, r1)
        L2c:
            return
    }
}
