package p410x8;

/* renamed from: x8.d */
/* loaded from: classes.dex */
public class C6963d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.textfield.C1217a f27207a;

    public C6963d(com.google.android.material.textfield.C1217a r1) {
            r0 = this;
            r0.f27207a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator r2) {
            r1 = this;
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            com.google.android.material.textfield.a r0 = r1.f27207a
            com.google.android.material.internal.CheckableImageButton r0 = r0.f27218c
            r0.setScaleX(r2)
            com.google.android.material.textfield.a r0 = r1.f27207a
            com.google.android.material.internal.CheckableImageButton r0 = r0.f27218c
            r0.setScaleY(r2)
            return
    }
}
