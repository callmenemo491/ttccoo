package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ButtonBarLayout extends android.widget.LinearLayout {

    /* renamed from: a0 */
    public boolean f985a0;

    /* renamed from: b0 */
    public int f986b0;

    public ButtonBarLayout(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            r8.<init>(r9, r10)
            r0 = -1
            r8.f986b0 = r0
            int[] r3 = p064e.C1495i.f7268k
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r3)
            r6 = 0
            r7 = 0
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r0
            p227n0.C4661t.m10545u(r1, r2, r3, r4, r5, r6, r7)
            r9 = 0
            r10 = 1
            boolean r9 = r0.getBoolean(r9, r10)
            r8.f985a0 = r9
            r0.recycle()
            return
    }

    private void setStacked(boolean r2) {
            r1 = this;
            r1.setOrientation(r2)
            if (r2 == 0) goto L9
            r0 = 8388613(0x800005, float:1.175495E-38)
            goto Lb
        L9:
            r0 = 80
        Lb:
            r1.setGravity(r0)
            r0 = 2131362606(0x7f0a032e, float:1.8344997E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L20
            if (r2 == 0) goto L1c
            r2 = 8
            goto L1d
        L1c:
            r2 = 4
        L1d:
            r0.setVisibility(r2)
        L20:
            int r2 = r1.getChildCount()
            int r2 = r2 + (-2)
        L26:
            if (r2 < 0) goto L32
            android.view.View r0 = r1.getChildAt(r2)
            r1.bringChildToFront(r0)
            int r2 = r2 + (-1)
            goto L26
        L32:
            return
    }

    /* renamed from: a */
    public final int m583a(int r3) {
            r2 = this;
            int r0 = r2.getChildCount()
        L4:
            if (r3 >= r0) goto L14
            android.view.View r1 = r2.getChildAt(r3)
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L11
            return r3
        L11:
            int r3 = r3 + 1
            goto L4
        L14:
            r3 = -1
            return r3
    }

    /* renamed from: b */
    public final boolean m584b() {
            r2 = this;
            int r0 = r2.getOrientation()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // android.view.View
    public int getMinimumHeight() {
            r2 = this;
            int r0 = super.getMinimumHeight()
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int r6, int r7) {
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            boolean r1 = r5.f985a0
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r5.f986b0
            if (r0 <= r1) goto L16
            boolean r1 = r5.m584b()
            if (r1 == 0) goto L16
            r5.setStacked(r2)
        L16:
            r5.f986b0 = r0
        L18:
            boolean r1 = r5.m584b()
            r3 = 1
            if (r1 != 0) goto L2f
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L2f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 1
            goto L31
        L2f:
            r0 = r6
            r1 = 0
        L31:
            super.onMeasure(r0, r7)
            boolean r0 = r5.f985a0
            if (r0 == 0) goto L52
            boolean r0 = r5.m584b()
            if (r0 != 0) goto L52
            int r0 = r5.getMeasuredWidthAndState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r4) goto L4b
            r0 = 1
            goto L4c
        L4b:
            r0 = 0
        L4c:
            if (r0 == 0) goto L52
            r5.setStacked(r3)
            r1 = 1
        L52:
            if (r1 == 0) goto L57
            super.onMeasure(r6, r7)
        L57:
            int r6 = r5.m583a(r2)
            if (r6 < 0) goto La7
            android.view.View r7 = r5.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r5.getPaddingTop()
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r1
            int r1 = r0.topMargin
            int r7 = r7 + r1
            int r0 = r0.bottomMargin
            int r7 = r7 + r0
            int r7 = r7 + r2
            boolean r0 = r5.m584b()
            if (r0 == 0) goto La1
            int r6 = r6 + r3
            int r6 = r5.m583a(r6)
            if (r6 < 0) goto L9f
            android.view.View r6 = r5.getChildAt(r6)
            int r6 = r6.getPaddingTop()
            r0 = 1098907648(0x41800000, float:16.0)
            android.content.res.Resources r1 = r5.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r0
            int r0 = (int) r1
            int r6 = r6 + r0
            int r6 = r6 + r7
            r2 = r6
            goto La7
        L9f:
            r2 = r7
            goto La7
        La1:
            int r6 = r5.getPaddingBottom()
            int r2 = r6 + r7
        La7:
            java.util.WeakHashMap<android.view.View, n0.w> r6 = p227n0.C4661t.f18570a
            int r6 = p227n0.C4661t.c.m10556d(r5)
            if (r6 == r2) goto Lb2
            r5.setMinimumHeight(r2)
        Lb2:
            return
    }

    public void setAllowStacking(boolean r2) {
            r1 = this;
            boolean r0 = r1.f985a0
            if (r0 == r2) goto L16
            r1.f985a0 = r2
            if (r2 != 0) goto L13
            int r2 = r1.getOrientation()
            r0 = 1
            if (r2 != r0) goto L13
            r2 = 0
            r1.setStacked(r2)
        L13:
            r1.requestLayout()
        L16:
            return
    }
}
