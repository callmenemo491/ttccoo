package p410x8;

/* renamed from: x8.g */
/* loaded from: classes.dex */
public class C6966g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.textfield.C1218b f27211a;

    public C6966g(com.google.android.material.textfield.C1218b r1) {
            r0 = this;
            r0.f27211a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator r2) {
            r1 = this;
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            com.google.android.material.textfield.b r0 = r1.f27211a
            com.google.android.material.internal.CheckableImageButton r0 = r0.f27218c
            r0.setAlpha(r2)
            return
    }
}
