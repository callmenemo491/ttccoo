package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes.dex */
public class C0597k extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 f3453a;

    /* renamed from: b */
    public final /* synthetic */ android.view.View f3454b;

    /* renamed from: c */
    public final /* synthetic */ android.view.ViewPropertyAnimator f3455c;

    /* renamed from: d */
    public final /* synthetic */ androidx.recyclerview.widget.C0593i f3456d;

    public C0597k(androidx.recyclerview.widget.C0593i r1, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r2, android.view.View r3, android.view.ViewPropertyAnimator r4) {
            r0 = this;
            r0.f3456d = r1
            r0.f3453a = r2
            r0.f3454b = r3
            r0.f3455c = r4
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator r2) {
            r1 = this;
            android.view.View r2 = r1.f3454b
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            android.view.ViewPropertyAnimator r2 = r1.f3455c
            r0 = 0
            r2.setListener(r0)
            androidx.recyclerview.widget.i r2 = r1.f3456d
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r1.f3453a
            r2.m1831d(r0)
            androidx.recyclerview.widget.i r2 = r1.f3456d
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r2 = r2.f3427o
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r1.f3453a
            r2.remove(r0)
            androidx.recyclerview.widget.i r2 = r1.f3456d
            r2.m2074p()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            androidx.recyclerview.widget.i r1 = r0.f3456d
            java.util.Objects.requireNonNull(r1)
            return
    }
}
