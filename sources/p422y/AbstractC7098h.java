package p422y;

/* renamed from: y.h */
/* loaded from: classes.dex */
public abstract class AbstractC7098h extends androidx.constraintlayout.widget.AbstractC0332a {

    /* renamed from: i0 */
    public boolean f27487i0;

    /* renamed from: j0 */
    public boolean f27488j0;

    @Override // androidx.constraintlayout.widget.AbstractC0332a
    /* renamed from: k */
    public void mo900k(android.util.AttributeSet r6) {
            r5 = this;
            super.mo900k(r6)
            if (r6 == 0) goto L2d
            android.content.Context r0 = r5.getContext()
            int[] r1 = p422y.C7096f.f27456b
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r1)
            int r0 = r6.getIndexCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L2a
            int r2 = r6.getIndex(r1)
            r3 = 6
            r4 = 1
            if (r2 != r3) goto L21
            r5.f27487i0 = r4
            goto L27
        L21:
            r3 = 13
            if (r2 != r3) goto L27
            r5.f27488j0 = r4
        L27:
            int r1 = r1 + 1
            goto L14
        L2a:
            r6.recycle()
        L2d:
            return
    }

    @Override // androidx.constraintlayout.widget.AbstractC0332a, android.view.View
    public void onAttachedToWindow() {
            r6 = this;
            super.onAttachedToWindow()
            boolean r0 = r6.f27487i0
            if (r0 != 0) goto Lb
            boolean r0 = r6.f27488j0
            if (r0 == 0) goto L49
        Lb:
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L49
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L49
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            int r1 = r6.getVisibility()
            float r2 = r6.getElevation()
            r3 = 0
        L20:
            int r4 = r6.f1779b0
            if (r3 >= r4) goto L49
            int[] r4 = r6.f1778a0
            r4 = r4[r3]
            android.view.View r4 = r0.m925f(r4)
            if (r4 == 0) goto L46
            boolean r5 = r6.f27487i0
            if (r5 == 0) goto L35
            r4.setVisibility(r1)
        L35:
            boolean r5 = r6.f27488j0
            if (r5 == 0) goto L46
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L46
            float r5 = r4.getTranslationZ()
            float r5 = r5 + r2
            r4.setTranslationZ(r5)
        L46:
            int r3 = r3 + 1
            goto L20
        L49:
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            r0.m938h()
            return
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            r0.m938h()
            return
    }
}
