package p203l8;

/* renamed from: l8.a */
/* loaded from: classes.dex */
public class C4194a implements android.animation.TypeEvaluator<java.lang.Float> {

    /* renamed from: a */
    public android.animation.FloatEvaluator f17359a;

    public C4194a(com.google.android.material.floatingactionbutton.C1193d r1) {
            r0 = this;
            r0.<init>()
            android.animation.FloatEvaluator r1 = new android.animation.FloatEvaluator
            r1.<init>()
            r0.f17359a = r1
            return
    }

    @Override // android.animation.TypeEvaluator
    public java.lang.Float evaluate(float r2, java.lang.Float r3, java.lang.Float r4) {
            r1 = this;
            java.lang.Float r3 = (java.lang.Float) r3
            java.lang.Float r4 = (java.lang.Float) r4
            android.animation.FloatEvaluator r0 = r1.f17359a
            java.lang.Float r2 = r0.evaluate(r2, r3, r4)
            float r2 = r2.floatValue()
            r3 = 1036831949(0x3dcccccd, float:0.1)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L16
            r2 = 0
        L16:
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
    }
}
