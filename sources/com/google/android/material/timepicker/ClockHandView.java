package com.google.android.material.timepicker;

/* loaded from: classes.dex */
class ClockHandView extends android.view.View {

    /* renamed from: o0 */
    public static final /* synthetic */ int f6519o0 = 0;

    /* renamed from: a0 */
    public android.animation.ValueAnimator f6520a0;

    /* renamed from: b0 */
    public float f6521b0;

    /* renamed from: c0 */
    public float f6522c0;

    /* renamed from: d0 */
    public int f6523d0;

    /* renamed from: e0 */
    public final java.util.List<com.google.android.material.timepicker.ClockHandView.InterfaceC1224c> f6524e0;

    /* renamed from: f0 */
    public final int f6525f0;

    /* renamed from: g0 */
    public final float f6526g0;

    /* renamed from: h0 */
    public final android.graphics.Paint f6527h0;

    /* renamed from: i0 */
    public final android.graphics.RectF f6528i0;

    /* renamed from: j0 */
    public final int f6529j0;

    /* renamed from: k0 */
    public float f6530k0;

    /* renamed from: l0 */
    public boolean f6531l0;

    /* renamed from: m0 */
    public double f6532m0;

    /* renamed from: n0 */
    public int f6533n0;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    public class C1222a implements android.animation.ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.timepicker.ClockHandView f6534a;

        public C1222a(com.google.android.material.timepicker.ClockHandView r1) {
                r0 = this;
                r0.f6534a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r3) {
                r2 = this;
                java.lang.Object r3 = r3.getAnimatedValue()
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                com.google.android.material.timepicker.ClockHandView r0 = r2.f6534a
                int r1 = com.google.android.material.timepicker.ClockHandView.f6519o0
                r1 = 1
                r0.m3612c(r3, r1)
                return
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    public class C1223b extends android.animation.AnimatorListenerAdapter {
        public C1223b(com.google.android.material.timepicker.ClockHandView r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1.end()
                return
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    public interface InterfaceC1224c {
        /* renamed from: a */
        void mo3608a(float r1, boolean r2);
    }

    public ClockHandView(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r0 = 2130969239(0x7f040297, float:1.7547154E38)
            r6.<init>(r7, r8, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.f6524e0 = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r6.f6527h0 = r1
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f6528i0 = r2
            int[] r2 = p339t7.C6183a.f24015l
            r3 = 2132018007(0x7f140357, float:1.9674308E38)
            android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r2, r0, r3)
            r0 = 1
            r2 = 0
            int r3 = r8.getDimensionPixelSize(r0, r2)
            r6.f6533n0 = r3
            r3 = 2
            int r4 = r8.getDimensionPixelSize(r3, r2)
            r6.f6525f0 = r4
            android.content.res.Resources r4 = r6.getResources()
            r5 = 2131165421(0x7f0700ed, float:1.7945059E38)
            int r5 = r4.getDimensionPixelSize(r5)
            r6.f6529j0 = r5
            r5 = 2131165419(0x7f0700eb, float:1.7945055E38)
            int r4 = r4.getDimensionPixelSize(r5)
            float r4 = (float) r4
            r6.f6526g0 = r4
            int r4 = r8.getColor(r2, r2)
            r1.setAntiAlias(r0)
            r1.setColor(r4)
            r0 = 0
            r6.m3611b(r0, r2)
            android.view.ViewConfiguration r7 = android.view.ViewConfiguration.get(r7)
            int r7 = r7.getScaledTouchSlop()
            r6.f6523d0 = r7
            java.util.WeakHashMap<android.view.View, n0.w> r7 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10571s(r6, r3)
            r8.recycle()
            return
    }

    /* renamed from: a */
    public final int m3610a(float r5, float r6) {
            r4 = this;
            int r0 = r4.getWidth()
            int r0 = r0 / 2
            int r1 = r4.getHeight()
            int r1 = r1 / 2
            float r0 = (float) r0
            float r5 = r5 - r0
            double r2 = (double) r5
            float r5 = (float) r1
            float r6 = r6 - r5
            double r5 = (double) r6
            double r5 = java.lang.Math.atan2(r5, r2)
            double r5 = java.lang.Math.toDegrees(r5)
            int r5 = (int) r5
            int r5 = r5 + 90
            if (r5 >= 0) goto L21
            int r5 = r5 + 360
        L21:
            return r5
    }

    /* renamed from: b */
    public void m3611b(float r5, boolean r6) {
            r4 = this;
            android.animation.ValueAnimator r0 = r4.f6520a0
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            r0 = 0
            if (r6 != 0) goto Le
            r4.m3612c(r5, r0)
            return
        Le:
            float r6 = r4.f6530k0
            float r1 = r6 - r5
            float r1 = java.lang.Math.abs(r1)
            r2 = 1127481344(0x43340000, float:180.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L30
            r1 = 1135869952(0x43b40000, float:360.0)
            int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r3 <= 0) goto L27
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 >= 0) goto L27
            float r5 = r5 + r1
        L27:
            int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r3 >= 0) goto L30
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L30
            float r6 = r6 + r1
        L30:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r1.<init>(r6, r5)
            r5 = 2
            float[] r5 = new float[r5]
            java.lang.Object r6 = r1.first
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r5[r0] = r6
            r6 = 1
            java.lang.Object r0 = r1.second
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r5[r6] = r0
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r5)
            r4.f6520a0 = r5
            r0 = 200(0xc8, double:9.9E-322)
            r5.setDuration(r0)
            android.animation.ValueAnimator r5 = r4.f6520a0
            com.google.android.material.timepicker.ClockHandView$a r6 = new com.google.android.material.timepicker.ClockHandView$a
            r6.<init>(r4)
            r5.addUpdateListener(r6)
            android.animation.ValueAnimator r5 = r4.f6520a0
            com.google.android.material.timepicker.ClockHandView$b r6 = new com.google.android.material.timepicker.ClockHandView$b
            r6.<init>(r4)
            r5.addListener(r6)
            android.animation.ValueAnimator r5 = r4.f6520a0
            r5.start()
            return
    }

    /* renamed from: c */
    public final void m3612c(float r8, boolean r9) {
            r7 = this;
            r0 = 1135869952(0x43b40000, float:360.0)
            float r8 = r8 % r0
            r7.f6530k0 = r8
            r0 = 1119092736(0x42b40000, float:90.0)
            float r0 = r8 - r0
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            r7.f6532m0 = r0
            int r0 = r7.getHeight()
            int r0 = r0 / 2
            int r1 = r7.getWidth()
            int r1 = r1 / 2
            float r1 = (float) r1
            int r2 = r7.f6533n0
            float r2 = (float) r2
            double r3 = r7.f6532m0
            double r3 = java.lang.Math.cos(r3)
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r1
            float r0 = (float) r0
            int r1 = r7.f6533n0
            float r1 = (float) r1
            double r3 = r7.f6532m0
            double r3 = java.lang.Math.sin(r3)
            float r3 = (float) r3
            float r1 = r1 * r3
            float r1 = r1 + r0
            android.graphics.RectF r0 = r7.f6528i0
            int r3 = r7.f6525f0
            float r4 = (float) r3
            float r4 = r2 - r4
            float r5 = (float) r3
            float r5 = r1 - r5
            float r6 = (float) r3
            float r2 = r2 + r6
            float r3 = (float) r3
            float r1 = r1 + r3
            r0.set(r4, r5, r2, r1)
            java.util.List<com.google.android.material.timepicker.ClockHandView$c> r0 = r7.f6524e0
            java.util.Iterator r0 = r0.iterator()
        L4f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r0.next()
            com.google.android.material.timepicker.ClockHandView$c r1 = (com.google.android.material.timepicker.ClockHandView.InterfaceC1224c) r1
            r1.mo3608a(r8, r9)
            goto L4f
        L5f:
            r7.invalidate()
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r11) {
            r10 = this;
            super.onDraw(r11)
            int r0 = r10.getHeight()
            int r0 = r0 / 2
            int r1 = r10.getWidth()
            int r1 = r1 / 2
            float r8 = (float) r1
            int r2 = r10.f6533n0
            float r2 = (float) r2
            double r3 = r10.f6532m0
            double r3 = java.lang.Math.cos(r3)
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r8
            float r9 = (float) r0
            int r3 = r10.f6533n0
            float r3 = (float) r3
            double r4 = r10.f6532m0
            double r4 = java.lang.Math.sin(r4)
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r9
            android.graphics.Paint r4 = r10.f6527h0
            r5 = 0
            r4.setStrokeWidth(r5)
            int r4 = r10.f6525f0
            float r4 = (float) r4
            android.graphics.Paint r5 = r10.f6527h0
            r11.drawCircle(r2, r3, r4, r5)
            double r2 = r10.f6532m0
            double r2 = java.lang.Math.sin(r2)
            double r4 = r10.f6532m0
            double r4 = java.lang.Math.cos(r4)
            int r6 = r10.f6533n0
            int r7 = r10.f6525f0
            int r6 = r6 - r7
            float r6 = (float) r6
            double r6 = (double) r6
            double r4 = r4 * r6
            int r4 = (int) r4
            int r1 = r1 + r4
            float r5 = (float) r1
            double r6 = r6 * r2
            int r1 = (int) r6
            int r0 = r0 + r1
            float r6 = (float) r0
            android.graphics.Paint r0 = r10.f6527h0
            int r1 = r10.f6529j0
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            android.graphics.Paint r7 = r10.f6527h0
            r2 = r11
            r3 = r8
            r4 = r9
            r2.drawLine(r3, r4, r5, r6, r7)
            float r0 = r10.f6526g0
            android.graphics.Paint r1 = r10.f6527h0
            r11.drawCircle(r8, r9, r0, r1)
            return
    }

    @Override // android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            float r1 = r0.f6530k0
            r2 = 0
            r0.m3611b(r1, r2)
            return
    }

    @Override // android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getActionMasked()
            float r1 = r7.getX()
            float r7 = r7.getY()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r4 = 2
            if (r0 == r4) goto L17
            r0 = 0
            goto L19
        L17:
            boolean r0 = r6.f6531l0
        L19:
            r4 = 0
            goto L23
        L1b:
            r6.f6521b0 = r1
            r6.f6522c0 = r7
            r6.f6531l0 = r3
            r0 = 0
            r4 = 1
        L23:
            boolean r5 = r6.f6531l0
            int r7 = r6.m3610a(r1, r7)
            float r1 = r6.f6530k0
            float r7 = (float) r7
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L32
            r1 = 1
            goto L33
        L32:
            r1 = 0
        L33:
            if (r4 == 0) goto L38
            if (r1 == 0) goto L38
            goto L3f
        L38:
            if (r1 != 0) goto L3c
            if (r0 == 0) goto L40
        L3c:
            r6.m3611b(r7, r3)
        L3f:
            r3 = 1
        L40:
            r7 = r5 | r3
            r6.f6531l0 = r7
            return r2
    }
}
