package p410x8;

/* renamed from: x8.b */
/* loaded from: classes.dex */
public class C6961b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.textfield.C1217a f27205a;

    public C6961b(com.google.android.material.textfield.C1217a r1) {
            r0 = this;
            r0.f27205a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            com.google.android.material.textfield.a r2 = r1.f27205a
            com.google.android.material.textfield.TextInputLayout r2 = r2.f27216a
            r0 = 0
            r2.setEndIconVisible(r0)
            return
    }
}
