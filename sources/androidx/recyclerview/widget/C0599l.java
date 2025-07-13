package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes.dex */
public class C0599l extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 f3461a;

    /* renamed from: b */
    public final /* synthetic */ int f3462b;

    /* renamed from: c */
    public final /* synthetic */ android.view.View f3463c;

    /* renamed from: d */
    public final /* synthetic */ int f3464d;

    /* renamed from: e */
    public final /* synthetic */ android.view.ViewPropertyAnimator f3465e;

    /* renamed from: f */
    public final /* synthetic */ androidx.recyclerview.widget.C0593i f3466f;

    public C0599l(androidx.recyclerview.widget.C0593i r1, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r2, int r3, android.view.View r4, int r5, android.view.ViewPropertyAnimator r6) {
            r0 = this;
            r0.f3466f = r1
            r0.f3461a = r2
            r0.f3462b = r3
            r0.f3463c = r4
            r0.f3464d = r5
            r0.f3465e = r6
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator r2) {
            r1 = this;
            int r2 = r1.f3462b
            r0 = 0
            if (r2 == 0) goto La
            android.view.View r2 = r1.f3463c
            r2.setTranslationX(r0)
        La:
            int r2 = r1.f3464d
            if (r2 == 0) goto L13
            android.view.View r2 = r1.f3463c
            r2.setTranslationY(r0)
        L13:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            android.view.ViewPropertyAnimator r2 = r1.f3465e
            r0 = 0
            r2.setListener(r0)
            androidx.recyclerview.widget.i r2 = r1.f3466f
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r1.f3461a
            r2.m1831d(r0)
            androidx.recyclerview.widget.i r2 = r1.f3466f
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r2 = r2.f3428p
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r1.f3461a
            r2.remove(r0)
            androidx.recyclerview.widget.i r2 = r1.f3466f
            r2.m2074p()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            androidx.recyclerview.widget.i r1 = r0.f3466f
            java.util.Objects.requireNonNull(r1)
            return
    }
}
