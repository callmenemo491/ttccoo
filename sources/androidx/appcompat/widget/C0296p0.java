package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.p0 */
/* loaded from: classes.dex */
public class C0296p0 extends android.widget.HorizontalScrollView implements android.widget.AdapterView.OnItemSelectedListener {

    /* renamed from: a0 */
    public int f1402a0;

    /* renamed from: b0 */
    public int f1403b0;

    /* renamed from: androidx.appcompat.widget.p0$a */
    public class a extends android.widget.LinearLayout {

        /* renamed from: a0 */
        public p083f.AbstractC1914a.c f1404a0;

        /* renamed from: b0 */
        public final /* synthetic */ androidx.appcompat.widget.C0296p0 f1405b0;

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
                r1 = this;
                super.onInitializeAccessibilityEvent(r2)
                java.lang.String r0 = "androidx.appcompat.app.ActionBar$Tab"
                r2.setClassName(r0)
                return
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
                r1 = this;
                super.onInitializeAccessibilityNodeInfo(r2)
                java.lang.String r0 = "androidx.appcompat.app.ActionBar$Tab"
                r2.setClassName(r0)
                return
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int r1, int r2) {
                r0 = this;
                super.onMeasure(r1, r2)
                androidx.appcompat.widget.p0 r1 = r0.f1405b0
                java.util.Objects.requireNonNull(r1)
                return
        }

        @Override // android.view.View
        public void setSelected(boolean r2) {
                r1 = this;
                boolean r0 = r1.isSelected()
                if (r0 == r2) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                super.setSelected(r2)
                if (r0 == 0) goto L14
                if (r2 == 0) goto L14
                r2 = 4
                r1.sendAccessibilityEvent(r2)
            L14:
                return
        }
    }

    static {
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            return
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r6) {
            r5 = this;
            super.onConfigurationChanged(r6)
            android.content.Context r6 = r5.getContext()
            int[] r0 = p064e.C1495i.f7258a
            r1 = 0
            r2 = 2130968582(0x7f040006, float:1.7545822E38)
            r3 = 0
            android.content.res.TypedArray r0 = r6.obtainStyledAttributes(r1, r0, r2, r3)
            r1 = 13
            int r1 = r0.getLayoutDimension(r1, r3)
            android.content.res.Resources r2 = r6.getResources()
            android.content.res.Resources r3 = r6.getResources()
            r4 = 2131034112(0x7f050000, float:1.7678732E38)
            boolean r3 = r3.getBoolean(r4)
            if (r3 != 0) goto L33
            r3 = 2131165193(0x7f070009, float:1.7944596E38)
            int r2 = r2.getDimensionPixelSize(r3)
            int r1 = java.lang.Math.min(r1, r2)
        L33:
            r0.recycle()
            r5.setContentHeight(r1)
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131165194(0x7f07000a, float:1.7944598E38)
            r6.getDimensionPixelSize(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            androidx.appcompat.widget.p0$a r2 = (androidx.appcompat.widget.C0296p0.a) r2
            f.a$c r1 = r2.f1404a0
            r1.m4702a()
            return
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int r1, int r2) {
            r0 = this;
            int r1 = android.view.View.MeasureSpec.getMode(r1)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            r0.setFillViewport(r1)
            r1 = 0
            throw r1
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView<?> r1) {
            r0 = this;
            return
    }

    public void setAllowCollapse(boolean r1) {
            r0 = this;
            return
    }

    public void setContentHeight(int r1) {
            r0 = this;
            r0.f1402a0 = r1
            r0.requestLayout()
            return
    }

    public void setTabSelected(int r1) {
            r0 = this;
            r0.f1403b0 = r1
            r1 = 0
            throw r1
    }
}
