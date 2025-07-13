package com.google.android.material.textfield;

/* loaded from: classes.dex */
public class MaterialAutoCompleteTextView extends androidx.appcompat.widget.C0270e {

    /* renamed from: d0 */
    public final androidx.appcompat.widget.C0284j0 f6355d0;

    /* renamed from: e0 */
    public final android.view.accessibility.AccessibilityManager f6356e0;

    /* renamed from: f0 */
    public final android.graphics.Rect f6357f0;

    public MaterialAutoCompleteTextView(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r0 = 0
            r1 = 2130968638(0x7f04003e, float:1.7545935E38)
            android.content.Context r8 = p431y8.C7133a.m14245a(r8, r9, r1, r0)
            r7.<init>(r8, r9, r1)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.f6357f0 = r8
            android.content.Context r8 = r7.getContext()
            int[] r3 = p339t7.C6183a.f24022s
            int[] r6 = new int[r0]
            r5 = 2132017822(0x7f14029e, float:1.9673933E38)
            r4 = 2130968638(0x7f04003e, float:1.7545935E38)
            r1 = r8
            r2 = r9
            android.content.res.TypedArray r9 = p220m8.C4429m.m9881d(r1, r2, r3, r4, r5, r6)
            boolean r1 = r9.hasValue(r0)
            r2 = 0
            if (r1 == 0) goto L36
            int r1 = r9.getInt(r0, r0)
            if (r1 != 0) goto L36
            r7.setKeyListener(r2)
        L36:
            java.lang.String r1 = "accessibility"
            java.lang.Object r1 = r8.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r7.f6356e0 = r1
            androidx.appcompat.widget.j0 r1 = new androidx.appcompat.widget.j0
            r3 = 2130969205(0x7f040275, float:1.7547085E38)
            r1.<init>(r8, r2, r3, r0)
            r7.f6355d0 = r1
            r8 = 1
            r1.m741s(r8)
            r1.f1341m0 = r7
            r8 = 2
            android.widget.PopupWindow r0 = r1.f1351w0
            r0.setInputMethodMode(r8)
            android.widget.ListAdapter r8 = r7.getAdapter()
            r1.mo738p(r8)
            x8.m r8 = new x8.m
            r8.<init>(r7)
            r1.f1342n0 = r8
            r9.recycle()
            return
    }

    /* renamed from: a */
    public static void m3541a(com.google.android.material.textfield.MaterialAutoCompleteTextView r1, java.lang.Object r2) {
            java.lang.CharSequence r2 = r1.convertSelectionToString(r2)
            r0 = 0
            r1.setText(r2, r0)
            return
    }

    /* renamed from: b */
    public final com.google.android.material.textfield.TextInputLayout m3542b() {
            r2 = this;
            android.view.ViewParent r0 = r2.getParent()
        L4:
            if (r0 == 0) goto L12
            boolean r1 = r0 instanceof com.google.android.material.textfield.TextInputLayout
            if (r1 == 0) goto Ld
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            return r0
        Ld:
            android.view.ViewParent r0 = r0.getParent()
            goto L4
        L12:
            r0 = 0
            return r0
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getHint() {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.m3542b()
            if (r0 == 0) goto Lf
            boolean r1 = r0.f6364C0
            if (r1 == 0) goto Lf
            java.lang.CharSequence r0 = r0.getHint()
            return r0
        Lf:
            java.lang.CharSequence r0 = super.getHint()
            return r0
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            com.google.android.material.textfield.TextInputLayout r0 = r2.m3542b()
            if (r0 == 0) goto L28
            boolean r0 = r0.f6364C0
            if (r0 == 0) goto L28
            java.lang.CharSequence r0 = super.getHint()
            if (r0 != 0) goto L28
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "meizu"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L28
            java.lang.String r0 = ""
            r2.setHint(r0)
        L28:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r13, int r14) {
            r12 = this;
            super.onMeasure(r13, r14)
            int r14 = android.view.View.MeasureSpec.getMode(r13)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r14 != r0) goto Lb3
            int r14 = r12.getMeasuredWidth()
            android.widget.ListAdapter r0 = r12.getAdapter()
            com.google.android.material.textfield.TextInputLayout r1 = r12.m3542b()
            r2 = 0
            if (r0 == 0) goto La0
            if (r1 != 0) goto L1e
            goto La0
        L1e:
            int r3 = r12.getMeasuredWidth()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            int r4 = r12.getMeasuredHeight()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            androidx.appcompat.widget.j0 r5 = r12.f6355d0
            boolean r6 = r5.mo473b()
            if (r6 != 0) goto L38
            r5 = -1
            goto L3e
        L38:
            androidx.appcompat.widget.f0 r5 = r5.f1329a0
            int r5 = r5.getSelectedItemPosition()
        L3e:
            int r5 = java.lang.Math.max(r2, r5)
            int r6 = r0.getCount()
            int r5 = r5 + 15
            int r5 = java.lang.Math.min(r6, r5)
            int r6 = r5 + (-15)
            int r6 = java.lang.Math.max(r2, r6)
            r7 = 0
            r8 = r6
            r9 = r7
            r6 = 0
        L56:
            if (r8 >= r5) goto L81
            int r10 = r0.getItemViewType(r8)
            if (r10 == r2) goto L60
            r9 = r7
            r2 = r10
        L60:
            android.view.View r9 = r0.getView(r8, r9, r1)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            if (r10 != 0) goto L73
            android.view.ViewGroup$LayoutParams r10 = new android.view.ViewGroup$LayoutParams
            r11 = -2
            r10.<init>(r11, r11)
            r9.setLayoutParams(r10)
        L73:
            r9.measure(r3, r4)
            int r10 = r9.getMeasuredWidth()
            int r6 = java.lang.Math.max(r6, r10)
            int r8 = r8 + 1
            goto L56
        L81:
            androidx.appcompat.widget.j0 r0 = r12.f6355d0
            android.graphics.drawable.Drawable r0 = r0.m733f()
            if (r0 == 0) goto L96
            android.graphics.Rect r2 = r12.f6357f0
            r0.getPadding(r2)
            android.graphics.Rect r0 = r12.f6357f0
            int r2 = r0.left
            int r0 = r0.right
            int r2 = r2 + r0
            int r6 = r6 + r2
        L96:
            com.google.android.material.internal.CheckableImageButton r0 = r1.getEndIconView()
            int r0 = r0.getMeasuredWidth()
            int r2 = r0 + r6
        La0:
            int r14 = java.lang.Math.max(r14, r2)
            int r13 = android.view.View.MeasureSpec.getSize(r13)
            int r13 = java.lang.Math.min(r14, r13)
            int r14 = r12.getMeasuredHeight()
            r12.setMeasuredDimension(r13, r14)
        Lb3:
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends android.widget.ListAdapter & android.widget.Filterable> void setAdapter(T r2) {
            r1 = this;
            super.setAdapter(r2)
            androidx.appcompat.widget.j0 r2 = r1.f6355d0
            android.widget.ListAdapter r0 = r1.getAdapter()
            r2.mo738p(r0)
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
            r1 = this;
            android.view.accessibility.AccessibilityManager r0 = r1.f6356e0
            if (r0 == 0) goto L10
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L10
            androidx.appcompat.widget.j0 r0 = r1.f6355d0
            r0.mo475d()
            goto L13
        L10:
            super.showDropDown()
        L13:
            return
    }
}
