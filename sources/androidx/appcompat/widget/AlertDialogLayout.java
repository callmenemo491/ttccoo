package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class AlertDialogLayout extends androidx.appcompat.widget.LinearLayoutCompat {
    public AlertDialogLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* renamed from: l */
    public static int m578l(android.view.View r3) {
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            int r0 = p227n0.C4661t.c.m10556d(r3)
            if (r0 <= 0) goto L9
            return r0
        L9:
            boolean r0 = r3 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L20
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r2 = 1
            if (r0 != r2) goto L20
            android.view.View r3 = r3.getChildAt(r1)
            int r3 = m578l(r3)
            return r3
        L20:
            return r1
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L39
            r4 = 80
            if (r3 == r4) goto L30
            int r12 = r9.getPaddingTop()
            goto L43
        L30:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L43
        L39:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r14 + r3
        L43:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L4c
            r14 = 0
            goto L50
        L4c:
            int r14 = r14.getIntrinsicHeight()
        L50:
            if (r0 >= r1) goto Laf
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto Lac
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto Lac
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r6 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L73
            r7 = r2
        L73:
            java.util.WeakHashMap<android.view.View, n0.w> r8 = p227n0.C4661t.f18570a
            int r8 = p227n0.C4661t.d.m10575d(r9)
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L8c
            r8 = 5
            if (r7 == r8) goto L89
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L97
        L89:
            int r7 = r11 - r4
            goto L94
        L8c:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
        L94:
            int r8 = r6.rightMargin
            int r7 = r7 - r8
        L97:
            boolean r8 = r9.m587k(r0)
            if (r8 == 0) goto L9e
            int r12 = r12 + r14
        L9e:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r5 + r12
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r5 = r5 + r12
            r12 = r5
        Lac:
            int r0 = r0 + 1
            goto L50
        Laf:
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int r17, int r18) {
            r16 = this;
            r6 = r16
            r7 = r17
            int r8 = r16.getChildCount()
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
            r4 = 0
        Ld:
            r9 = 8
            if (r4 >= r8) goto L42
            android.view.View r5 = r6.getChildAt(r4)
            int r10 = r5.getVisibility()
            if (r10 != r9) goto L1c
            goto L3f
        L1c:
            int r9 = r5.getId()
            r10 = 2131362724(0x7f0a03a4, float:1.8345237E38)
            if (r9 != r10) goto L27
            r0 = r5
            goto L3f
        L27:
            r10 = 2131361956(0x7f0a00a4, float:1.8343679E38)
            if (r9 != r10) goto L2e
            r2 = r5
            goto L3f
        L2e:
            r10 = 2131362064(0x7f0a0110, float:1.8343898E38)
            if (r9 == r10) goto L38
            r10 = 2131362080(0x7f0a0120, float:1.834393E38)
            if (r9 != r10) goto L3a
        L38:
            if (r3 == 0) goto L3e
        L3a:
            r11 = r18
            goto L14e
        L3e:
            r3 = r5
        L3f:
            int r4 = r4 + 1
            goto Ld
        L42:
            int r4 = android.view.View.MeasureSpec.getMode(r18)
            int r5 = android.view.View.MeasureSpec.getSize(r18)
            int r10 = android.view.View.MeasureSpec.getMode(r17)
            int r11 = r16.getPaddingTop()
            int r12 = r16.getPaddingBottom()
            int r12 = r12 + r11
            if (r0 == 0) goto L6a
            r0.measure(r7, r1)
            int r11 = r0.getMeasuredHeight()
            int r12 = r12 + r11
            int r0 = r0.getMeasuredState()
            int r0 = android.view.View.combineMeasuredStates(r1, r0)
            goto L6b
        L6a:
            r0 = 0
        L6b:
            if (r2 == 0) goto L83
            r2.measure(r7, r1)
            int r11 = m578l(r2)
            int r13 = r2.getMeasuredHeight()
            int r13 = r13 - r11
            int r12 = r12 + r11
            int r14 = r2.getMeasuredState()
            int r0 = android.view.View.combineMeasuredStates(r0, r14)
            goto L85
        L83:
            r11 = 0
            r13 = 0
        L85:
            if (r3 == 0) goto La6
            if (r4 != 0) goto L8b
            r14 = 0
            goto L95
        L8b:
            int r14 = r5 - r12
            int r14 = java.lang.Math.max(r1, r14)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r4)
        L95:
            r3.measure(r7, r14)
            int r14 = r3.getMeasuredHeight()
            int r12 = r12 + r14
            int r15 = r3.getMeasuredState()
            int r0 = android.view.View.combineMeasuredStates(r0, r15)
            goto La7
        La6:
            r14 = 0
        La7:
            int r5 = r5 - r12
            r15 = 1073741824(0x40000000, float:2.0)
            if (r2 == 0) goto Lc9
            int r12 = r12 - r11
            int r13 = java.lang.Math.min(r5, r13)
            if (r13 <= 0) goto Lb5
            int r5 = r5 - r13
            int r11 = r11 + r13
        Lb5:
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r15)
            r2.measure(r7, r11)
            int r11 = r2.getMeasuredHeight()
            int r12 = r12 + r11
            int r2 = r2.getMeasuredState()
            int r0 = android.view.View.combineMeasuredStates(r0, r2)
        Lc9:
            if (r3 == 0) goto Le3
            if (r5 <= 0) goto Le3
            int r12 = r12 - r14
            int r14 = r14 + r5
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r4)
            r3.measure(r7, r2)
            int r2 = r3.getMeasuredHeight()
            int r12 = r12 + r2
            int r2 = r3.getMeasuredState()
            int r0 = android.view.View.combineMeasuredStates(r0, r2)
        Le3:
            r2 = 0
            r3 = 0
        Le5:
            if (r2 >= r8) goto Lfc
            android.view.View r4 = r6.getChildAt(r2)
            int r5 = r4.getVisibility()
            if (r5 == r9) goto Lf9
            int r4 = r4.getMeasuredWidth()
            int r3 = java.lang.Math.max(r3, r4)
        Lf9:
            int r2 = r2 + 1
            goto Le5
        Lfc:
            int r2 = r16.getPaddingLeft()
            int r4 = r16.getPaddingRight()
            int r4 = r4 + r2
            int r4 = r4 + r3
            int r0 = android.view.View.resolveSizeAndState(r4, r7, r0)
            r11 = r18
            int r2 = android.view.View.resolveSizeAndState(r12, r11, r1)
            r6.setMeasuredDimension(r0, r2)
            if (r10 == r15) goto L14d
            int r0 = r16.getMeasuredWidth()
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r15)
            r12 = 0
        L11e:
            if (r12 >= r8) goto L14d
            android.view.View r1 = r6.getChildAt(r12)
            int r0 = r1.getVisibility()
            if (r0 == r9) goto L14a
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r13 = r0
            androidx.appcompat.widget.LinearLayoutCompat$a r13 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r13
            int r0 = r13.width
            r2 = -1
            if (r0 != r2) goto L14a
            int r14 = r13.height
            int r0 = r1.getMeasuredHeight()
            r13.height = r0
            r3 = 0
            r5 = 0
            r0 = r16
            r2 = r10
            r4 = r18
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r13.height = r14
        L14a:
            int r12 = r12 + 1
            goto L11e
        L14d:
            r1 = 1
        L14e:
            if (r1 != 0) goto L153
            super.onMeasure(r17, r18)
        L153:
            return
    }
}
