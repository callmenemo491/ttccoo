package com.google.android.material.textfield;

/* loaded from: classes.dex */
public class TextInputEditText extends androidx.appcompat.widget.C0287l {

    /* renamed from: e0 */
    public final android.graphics.Rect f6358e0;

    /* renamed from: f0 */
    public boolean f6359f0;

    public TextInputEditText(android.content.Context r11, android.util.AttributeSet r12) {
            r10 = this;
            r0 = 0
            r1 = 2130968949(0x7f040175, float:1.7546566E38)
            android.content.Context r2 = p431y8.C7133a.m14245a(r11, r12, r1, r0)
            r10.<init>(r2, r12, r1)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r10.f6358e0 = r2
            int[] r2 = p339t7.C6183a.f24001N
            int[] r8 = new int[r0]
            r9 = 2132017896(0x7f1402e8, float:1.9674083E38)
            p220m8.C4429m.m9878a(r11, r12, r1, r9)
            r7 = 2132017896(0x7f1402e8, float:1.9674083E38)
            r6 = 2130968949(0x7f040175, float:1.7546566E38)
            r3 = r11
            r4 = r12
            r5 = r2
            p220m8.C4429m.m9879b(r3, r4, r5, r6, r7, r8)
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r2, r1, r9)
            boolean r12 = r11.getBoolean(r0, r0)
            r10.m3543xcfadc90b(r12)
            r11.recycle()
            return
    }

    private java.lang.CharSequence getHintFromLayout() {
            r1 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r1.getTextInputLayout()
            if (r0 == 0) goto Lb
            java.lang.CharSequence r0 = r0.getHint()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    private com.google.android.material.textfield.TextInputLayout getTextInputLayout() {
            r2 = this;
            android.view.ViewParent r0 = r2.getParent()
        L4:
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            boolean r1 = r0 instanceof com.google.android.material.textfield.TextInputLayout
            if (r1 == 0) goto Lf
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            return r0
        Lf:
            android.view.ViewParent r0 = r0.getParent()
            goto L4
        L14:
            r0 = 0
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(android.graphics.Rect r3) {
            r2 = this;
            super.getFocusedRect(r3)
            com.google.android.material.textfield.TextInputLayout r0 = r2.getTextInputLayout()
            if (r0 == 0) goto L1a
            boolean r1 = r2.f6359f0
            if (r1 == 0) goto L1a
            if (r3 == 0) goto L1a
            android.graphics.Rect r1 = r2.f6358e0
            r0.getFocusedRect(r1)
            android.graphics.Rect r0 = r2.f6358e0
            int r0 = r0.bottom
            r3.bottom = r0
        L1a:
            return
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(android.graphics.Rect r4, android.graphics.Point r5) {
            r3 = this;
            boolean r0 = super.getGlobalVisibleRect(r4, r5)
            com.google.android.material.textfield.TextInputLayout r1 = r3.getTextInputLayout()
            if (r1 == 0) goto L1b
            boolean r2 = r3.f6359f0
            if (r2 == 0) goto L1b
            if (r4 == 0) goto L1b
            android.graphics.Rect r2 = r3.f6358e0
            r1.getGlobalVisibleRect(r2, r5)
            android.graphics.Rect r5 = r3.f6358e0
            int r5 = r5.bottom
            r4.bottom = r5
        L1b:
            return r0
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getHint() {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.getTextInputLayout()
            if (r0 == 0) goto Lf
            boolean r1 = r0.f6364C0
            if (r1 == 0) goto Lf
            java.lang.CharSequence r0 = r0.getHint()
            return r0
        Lf:
            java.lang.CharSequence r0 = super.getHint()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            com.google.android.material.textfield.TextInputLayout r0 = r2.getTextInputLayout()
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

    @Override // androidx.appcompat.widget.C0287l, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            if (r0 == 0) goto L10
            java.lang.CharSequence r1 = r3.hintText
            if (r1 != 0) goto L10
            java.lang.CharSequence r1 = r2.getHintFromLayout()
            r3.hintText = r1
        L10:
            return r0
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r6) {
            r5 = this;
            super.onInitializeAccessibilityNodeInfo(r6)
            com.google.android.material.textfield.TextInputLayout r0 = r5.getTextInputLayout()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 >= r2) goto L5b
            if (r0 == 0) goto L5b
            android.text.Editable r1 = r5.getText()
            java.lang.CharSequence r0 = r0.getHint()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r2 = r2 ^ 1
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r3 = r3 ^ 1
            r4 = 2131362697(0x7f0a0389, float:1.8345182E38)
            r5.setLabelFor(r4)
            java.lang.String r4 = ""
            if (r3 == 0) goto L32
            java.lang.String r0 = r0.toString()
            goto L33
        L32:
            r0 = r4
        L33:
            if (r2 == 0) goto L51
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L49
            java.lang.String r1 = ", "
            java.lang.String r4 = p064e.C1493g.m4049a(r1, r0)
        L49:
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            goto L58
        L51:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L58
            r4 = r0
        L58:
            r6.setText(r4)
        L5b:
            return
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(android.graphics.Rect r7) {
            r6 = this;
            boolean r7 = super.requestRectangleOnScreen(r7)
            com.google.android.material.textfield.TextInputLayout r0 = r6.getTextInputLayout()
            if (r0 == 0) goto L32
            boolean r1 = r6.f6359f0
            if (r1 == 0) goto L32
            android.graphics.Rect r1 = r6.f6358e0
            r2 = 0
            int r3 = r0.getHeight()
            android.content.res.Resources r4 = r6.getResources()
            r5 = 2131165559(0x7f070177, float:1.7945339E38)
            int r4 = r4.getDimensionPixelOffset(r5)
            int r3 = r3 - r4
            int r4 = r0.getWidth()
            int r5 = r0.getHeight()
            r1.set(r2, r3, r4, r5)
            android.graphics.Rect r1 = r6.f6358e0
            r2 = 1
            r0.requestRectangleOnScreen(r1, r2)
        L32:
            return r7
    }

    /* renamed from: setTextInputLayoutFocusedRectEnabled */
    public void m3543xcfadc90b(boolean r1) {
            r0 = this;
            r0.f6359f0 = r1
            return
    }
}
