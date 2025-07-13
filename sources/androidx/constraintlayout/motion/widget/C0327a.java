package androidx.constraintlayout.motion.widget;

/* renamed from: androidx.constraintlayout.motion.widget.a */
/* loaded from: classes.dex */
public class C0327a extends androidx.constraintlayout.widget.AbstractC0332a implements androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0325h {

    /* renamed from: i0 */
    public boolean f1618i0;

    /* renamed from: j0 */
    public boolean f1619j0;

    /* renamed from: k0 */
    public float f1620k0;

    /* renamed from: l0 */
    public android.view.View[] f1621l0;

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0325h
    /* renamed from: a */
    public void mo896a(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, int r3, float r4) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0325h
    /* renamed from: b */
    public void mo897b(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0325h
    /* renamed from: c */
    public void mo898c(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, boolean r3, float r4) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0325h
    /* renamed from: d */
    public void mo899d(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2) {
            r0 = this;
            return
    }

    public float getProgress() {
            r1 = this;
            float r0 = r1.f1620k0
            return r0
    }

    @Override // androidx.constraintlayout.widget.AbstractC0332a
    /* renamed from: k */
    public void mo900k(android.util.AttributeSet r5) {
            r4 = this;
            super.mo900k(r5)
            if (r5 == 0) goto L36
            android.content.Context r0 = r4.getContext()
            int[] r1 = p422y.C7096f.f27466l
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r1)
            int r0 = r5.getIndexCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L33
            int r2 = r5.getIndex(r1)
            r3 = 1
            if (r2 != r3) goto L26
            boolean r3 = r4.f1618i0
            boolean r2 = r5.getBoolean(r2, r3)
            r4.f1618i0 = r2
            goto L30
        L26:
            if (r2 != 0) goto L30
            boolean r3 = r4.f1619j0
            boolean r2 = r5.getBoolean(r2, r3)
            r4.f1619j0 = r2
        L30:
            int r1 = r1 + 1
            goto L14
        L33:
            r5.recycle()
        L36:
            return
    }

    public void setProgress(float r5) {
            r4 = this;
            r4.f1620k0 = r5
            int r5 = r4.f1779b0
            r0 = 0
            if (r5 <= 0) goto L3f
            android.view.ViewParent r5 = r4.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            android.view.View[] r1 = r4.f1784g0
            if (r1 == 0) goto L16
            int r1 = r1.length
            int r2 = r4.f1779b0
            if (r1 == r2) goto L1c
        L16:
            int r1 = r4.f1779b0
            android.view.View[] r1 = new android.view.View[r1]
            r4.f1784g0 = r1
        L1c:
            r1 = 0
        L1d:
            int r2 = r4.f1779b0
            if (r1 >= r2) goto L30
            int[] r2 = r4.f1778a0
            r2 = r2[r1]
            android.view.View[] r3 = r4.f1784g0
            android.view.View r2 = r5.m925f(r2)
            r3[r1] = r2
            int r1 = r1 + 1
            goto L1d
        L30:
            android.view.View[] r5 = r4.f1784g0
            r4.f1621l0 = r5
        L34:
            int r5 = r4.f1779b0
            if (r0 >= r5) goto L54
            android.view.View[] r5 = r4.f1621l0
            r5 = r5[r0]
            int r0 = r0 + 1
            goto L34
        L3f:
            android.view.ViewParent r5 = r4.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r1 = r5.getChildCount()
        L49:
            if (r0 >= r1) goto L54
            android.view.View r2 = r5.getChildAt(r0)
            boolean r2 = r2 instanceof androidx.constraintlayout.motion.widget.C0327a
            int r0 = r0 + 1
            goto L49
        L54:
            return
    }
}
