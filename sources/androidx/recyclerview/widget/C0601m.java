package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes.dex */
public class C0601m extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ androidx.recyclerview.widget.C0593i.d f3474a;

    /* renamed from: b */
    public final /* synthetic */ android.view.ViewPropertyAnimator f3475b;

    /* renamed from: c */
    public final /* synthetic */ android.view.View f3476c;

    /* renamed from: d */
    public final /* synthetic */ androidx.recyclerview.widget.C0593i f3477d;

    public C0601m(androidx.recyclerview.widget.C0593i r1, androidx.recyclerview.widget.C0593i.d r2, android.view.ViewPropertyAnimator r3, android.view.View r4) {
            r0 = this;
            r0.f3477d = r1
            r0.f3474a = r2
            r0.f3475b = r3
            r0.f3476c = r4
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            android.view.ViewPropertyAnimator r2 = r1.f3475b
            r0 = 0
            r2.setListener(r0)
            android.view.View r2 = r1.f3476c
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            android.view.View r2 = r1.f3476c
            r0 = 0
            r2.setTranslationX(r0)
            android.view.View r2 = r1.f3476c
            r2.setTranslationY(r0)
            androidx.recyclerview.widget.i r2 = r1.f3477d
            androidx.recyclerview.widget.i$d r0 = r1.f3474a
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.f3437a
            r2.m1831d(r0)
            androidx.recyclerview.widget.i r2 = r1.f3477d
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r2 = r2.f3430r
            androidx.recyclerview.widget.i$d r0 = r1.f3474a
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.f3437a
            r2.remove(r0)
            androidx.recyclerview.widget.i r2 = r1.f3477d
            r2.m2074p()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            androidx.recyclerview.widget.i r2 = r1.f3477d
            androidx.recyclerview.widget.i$d r0 = r1.f3474a
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.f3437a
            java.util.Objects.requireNonNull(r2)
            return
    }
}
