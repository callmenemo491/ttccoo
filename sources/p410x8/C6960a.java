package p410x8;

/* renamed from: x8.a */
/* loaded from: classes.dex */
public class C6960a extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.textfield.C1217a f27204a;

    public C6960a(com.google.android.material.textfield.C1217a r1) {
            r0 = this;
            r0.f27204a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            com.google.android.material.textfield.a r2 = r1.f27204a
            com.google.android.material.textfield.TextInputLayout r2 = r2.f27216a
            r0 = 1
            r2.setEndIconVisible(r0)
            return
    }
}
