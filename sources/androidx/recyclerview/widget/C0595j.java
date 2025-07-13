package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
public class C0595j extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 f3448a;

    /* renamed from: b */
    public final /* synthetic */ android.view.ViewPropertyAnimator f3449b;

    /* renamed from: c */
    public final /* synthetic */ android.view.View f3450c;

    /* renamed from: d */
    public final /* synthetic */ androidx.recyclerview.widget.C0593i f3451d;

    public C0595j(androidx.recyclerview.widget.C0593i r1, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r2, android.view.ViewPropertyAnimator r3, android.view.View r4) {
            r0 = this;
            r0.f3451d = r1
            r0.f3448a = r2
            r0.f3449b = r3
            r0.f3450c = r4
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            android.view.ViewPropertyAnimator r2 = r1.f3449b
            r0 = 0
            r2.setListener(r0)
            android.view.View r2 = r1.f3450c
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            androidx.recyclerview.widget.i r2 = r1.f3451d
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r1.f3448a
            r2.m1831d(r0)
            androidx.recyclerview.widget.i r2 = r1.f3451d
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r2 = r2.f3429q
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r1.f3448a
            r2.remove(r0)
            androidx.recyclerview.widget.i r2 = r1.f3451d
            r2.m2074p()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            androidx.recyclerview.widget.i r1 = r0.f3451d
            java.util.Objects.requireNonNull(r1)
            return
    }
}
