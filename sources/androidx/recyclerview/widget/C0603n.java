package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.n */
/* loaded from: classes.dex */
public class C0603n extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ androidx.recyclerview.widget.C0593i.d f3484a;

    /* renamed from: b */
    public final /* synthetic */ android.view.ViewPropertyAnimator f3485b;

    /* renamed from: c */
    public final /* synthetic */ android.view.View f3486c;

    /* renamed from: d */
    public final /* synthetic */ androidx.recyclerview.widget.C0593i f3487d;

    public C0603n(androidx.recyclerview.widget.C0593i r1, androidx.recyclerview.widget.C0593i.d r2, android.view.ViewPropertyAnimator r3, android.view.View r4) {
            r0 = this;
            r0.f3487d = r1
            r0.f3484a = r2
            r0.f3485b = r3
            r0.f3486c = r4
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            android.view.ViewPropertyAnimator r2 = r1.f3485b
            r0 = 0
            r2.setListener(r0)
            android.view.View r2 = r1.f3486c
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            android.view.View r2 = r1.f3486c
            r0 = 0
            r2.setTranslationX(r0)
            android.view.View r2 = r1.f3486c
            r2.setTranslationY(r0)
            androidx.recyclerview.widget.i r2 = r1.f3487d
            androidx.recyclerview.widget.i$d r0 = r1.f3484a
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.f3438b
            r2.m1831d(r0)
            androidx.recyclerview.widget.i r2 = r1.f3487d
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r2 = r2.f3430r
            androidx.recyclerview.widget.i$d r0 = r1.f3484a
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.f3438b
            r2.remove(r0)
            androidx.recyclerview.widget.i r2 = r1.f3487d
            r2.m2074p()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            androidx.recyclerview.widget.i r2 = r1.f3487d
            androidx.recyclerview.widget.i$d r0 = r1.f3484a
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.f3438b
            java.util.Objects.requireNonNull(r2)
            return
    }
}
