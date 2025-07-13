package p220m8;

/* renamed from: m8.k */
/* loaded from: classes.dex */
public class C4427k extends p333t1.AbstractC6104h {

    /* renamed from: m8.k$a */
    public class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ android.widget.TextView f18082a;

        public a(p220m8.C4427k r1, android.widget.TextView r2) {
                r0 = this;
                r0.f18082a = r2
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                android.widget.TextView r0 = r1.f18082a
                r0.setScaleX(r2)
                android.widget.TextView r0 = r1.f18082a
                r0.setScaleY(r2)
                return
        }
    }

    public C4427k() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: M */
    public final void m9874M(p333t1.C6111o r3) {
            r2 = this;
            android.view.View r0 = r3.f23622b
            boolean r1 = r0 instanceof android.widget.TextView
            if (r1 == 0) goto L17
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f23621a
            float r0 = r0.getScaleX()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.String r1 = "android:textscale:scale"
            r3.put(r1, r0)
        L17:
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: d */
    public void mo9875d(p333t1.C6111o r1) {
            r0 = this;
            r0.m9874M(r1)
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: g */
    public void mo9876g(p333t1.C6111o r1) {
            r0 = this;
            r0.m9874M(r1)
            return
    }

    @Override // p333t1.AbstractC6104h
    /* renamed from: o */
    public android.animation.Animator mo9877o(android.view.ViewGroup r5, p333t1.C6111o r6, p333t1.C6111o r7) {
            r4 = this;
            r5 = 0
            if (r6 == 0) goto L59
            if (r7 == 0) goto L59
            android.view.View r0 = r6.f23622b
            boolean r0 = r0 instanceof android.widget.TextView
            if (r0 == 0) goto L59
            android.view.View r0 = r7.f23622b
            boolean r1 = r0 instanceof android.widget.TextView
            if (r1 != 0) goto L12
            goto L59
        L12:
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.util.Map<java.lang.String, java.lang.Object> r6 = r6.f23621a
            java.util.Map<java.lang.String, java.lang.Object> r7 = r7.f23621a
            java.lang.String r1 = "android:textscale:scale"
            java.lang.Object r2 = r6.get(r1)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L2d
            java.lang.Object r6 = r6.get(r1)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            goto L2f
        L2d:
            r6 = 1065353216(0x3f800000, float:1.0)
        L2f:
            java.lang.Object r2 = r7.get(r1)
            if (r2 == 0) goto L3f
            java.lang.Object r7 = r7.get(r1)
            java.lang.Float r7 = (java.lang.Float) r7
            float r3 = r7.floatValue()
        L3f:
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 != 0) goto L44
            return r5
        L44:
            r5 = 2
            float[] r5 = new float[r5]
            r7 = 0
            r5[r7] = r6
            r6 = 1
            r5[r6] = r3
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r5)
            m8.k$a r6 = new m8.k$a
            r6.<init>(r4, r0)
            r5.addUpdateListener(r6)
        L59:
            return r5
    }
}
