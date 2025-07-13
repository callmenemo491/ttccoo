package p009a8;

/* renamed from: a8.a */
/* loaded from: classes.dex */
public class C0030a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior f70a;

    public C0030a(com.google.android.material.bottomsheet.BottomSheetBehavior r1) {
            r0 = this;
            r0.f70a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator r2) {
            r1 = this;
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r1.f70a
            t8.f r0 = r0.f5849i
            if (r0 == 0) goto L13
            r0.m12774r(r2)
        L13:
            return
    }
}
