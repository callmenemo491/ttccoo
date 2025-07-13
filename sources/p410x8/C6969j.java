package p410x8;

/* renamed from: x8.j */
/* loaded from: classes.dex */
public class C6969j extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.textfield.C1218b f27215a;

    public C6969j(com.google.android.material.textfield.C1218b r1) {
            r0 = this;
            r0.f27215a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            com.google.android.material.textfield.b r2 = r1.f27215a
            com.google.android.material.internal.CheckableImageButton r0 = r2.f27218c
            boolean r2 = r2.f6476j
            r0.setChecked(r2)
            com.google.android.material.textfield.b r2 = r1.f27215a
            android.animation.ValueAnimator r2 = r2.f6482p
            r2.start()
            return
    }
}
