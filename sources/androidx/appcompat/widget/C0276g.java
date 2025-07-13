package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.g */
/* loaded from: classes.dex */
public class C0276g extends android.widget.Button implements p280q0.InterfaceC5535b, p280q0.InterfaceC5542i {

    /* renamed from: a0 */
    public final androidx.appcompat.widget.C0273f f1299a0;

    /* renamed from: b0 */
    public final androidx.appcompat.widget.C0313y f1300b0;

    public C0276g(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130968706(0x7f040082, float:1.7546073E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public C0276g(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            androidx.appcompat.widget.C0308v0.m793a(r1)
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            androidx.appcompat.widget.C0304t0.m787a(r0, r1)
            androidx.appcompat.widget.f r1 = new androidx.appcompat.widget.f
            r1.<init>(r0)
            r0.f1299a0 = r1
            r1.m714d(r2, r3)
            androidx.appcompat.widget.y r1 = new androidx.appcompat.widget.y
            r1.<init>(r0)
            r0.f1300b0 = r1
            r1.m836e(r2, r3)
            r1.m834b()
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.f r0 = r1.f1299a0
            if (r0 == 0) goto La
            r0.m711a()
        La:
            androidx.appcompat.widget.y r0 = r1.f1300b0
            if (r0 == 0) goto L11
            r0.m834b()
        L11:
            return
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
            r1 = this;
            boolean r0 = p280q0.InterfaceC5535b.f21568W
            if (r0 == 0) goto L9
            int r0 = super.getAutoSizeMaxTextSize()
            return r0
        L9:
            androidx.appcompat.widget.y r0 = r1.f1300b0
            if (r0 == 0) goto L16
            androidx.appcompat.widget.a0 r0 = r0.f1491i
            float r0 = r0.f1195e
            int r0 = java.lang.Math.round(r0)
            return r0
        L16:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
            r1 = this;
            boolean r0 = p280q0.InterfaceC5535b.f21568W
            if (r0 == 0) goto L9
            int r0 = super.getAutoSizeMinTextSize()
            return r0
        L9:
            androidx.appcompat.widget.y r0 = r1.f1300b0
            if (r0 == 0) goto L16
            androidx.appcompat.widget.a0 r0 = r0.f1491i
            float r0 = r0.f1194d
            int r0 = java.lang.Math.round(r0)
            return r0
        L16:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
            r1 = this;
            boolean r0 = p280q0.InterfaceC5535b.f21568W
            if (r0 == 0) goto L9
            int r0 = super.getAutoSizeStepGranularity()
            return r0
        L9:
            androidx.appcompat.widget.y r0 = r1.f1300b0
            if (r0 == 0) goto L16
            androidx.appcompat.widget.a0 r0 = r0.f1491i
            float r0 = r0.f1193c
            int r0 = java.lang.Math.round(r0)
            return r0
        L16:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            boolean r0 = p280q0.InterfaceC5535b.f21568W
            if (r0 == 0) goto L9
            int[] r0 = super.getAutoSizeTextAvailableSizes()
            return r0
        L9:
            androidx.appcompat.widget.y r0 = r1.f1300b0
            if (r0 == 0) goto L12
            androidx.appcompat.widget.a0 r0 = r0.f1491i
            int[] r0 = r0.f1196f
            return r0
        L12:
            r0 = 0
            int[] r0 = new int[r0]
            return r0
    }

    @Override // android.widget.TextView
    @android.annotation.SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
            r3 = this;
            boolean r0 = p280q0.InterfaceC5535b.f21568W
            r1 = 0
            if (r0 == 0) goto Le
            int r0 = super.getAutoSizeTextType()
            r2 = 1
            if (r0 != r2) goto Ld
            r1 = 1
        Ld:
            return r1
        Le:
            androidx.appcompat.widget.y r0 = r3.f1300b0
            if (r0 == 0) goto L17
            androidx.appcompat.widget.a0 r0 = r0.f1491i
            int r0 = r0.f1191a
            return r0
        L17:
            return r1
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1299a0
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m712b()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1299a0
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m713c()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    /* renamed from: getSupportCompoundDrawablesTintList */
    public android.content.res.ColorStateList m725xbd5e68ea() {
            r1 = this;
            androidx.appcompat.widget.y r0 = r1.f1300b0
            androidx.appcompat.widget.w0 r0 = r0.f1490h
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.f1475a
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    /* renamed from: getSupportCompoundDrawablesTintMode */
    public android.graphics.PorterDuff.Mode m726xbd5ef1ef() {
            r1 = this;
            androidx.appcompat.widget.y r0 = r1.f1300b0
            androidx.appcompat.widget.w0 r0 = r0.f1490h
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.f1476b
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            r2.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            r2.setClassName(r0)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.y r1 = r0.f1300b0
            if (r1 == 0) goto L10
            boolean r2 = p280q0.InterfaceC5535b.f21568W
            if (r2 != 0) goto L10
            androidx.appcompat.widget.a0 r1 = r1.f1491i
            r1.m658a()
        L10:
            return
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            androidx.appcompat.widget.y r1 = r0.f1300b0
            if (r1 == 0) goto L18
            boolean r2 = p280q0.InterfaceC5535b.f21568W
            if (r2 != 0) goto L18
            boolean r1 = r1.m835d()
            if (r1 == 0) goto L18
            androidx.appcompat.widget.y r1 = r0.f1300b0
            androidx.appcompat.widget.a0 r1 = r1.f1491i
            r1.m658a()
        L18:
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = p280q0.InterfaceC5535b.f21568W
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto Lf
        L8:
            androidx.appcompat.widget.y r0 = r1.f1300b0
            if (r0 == 0) goto Lf
            r0.m839h(r2, r3, r4, r5)
        Lf:
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
            r1 = this;
            boolean r0 = p280q0.InterfaceC5535b.f21568W
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            goto Lf
        L8:
            androidx.appcompat.widget.y r0 = r1.f1300b0
            if (r0 == 0) goto Lf
            r0.m840i(r2, r3)
        Lf:
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            boolean r0 = p280q0.InterfaceC5535b.f21568W
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeWithDefaults(r2)
            goto Lf
        L8:
            androidx.appcompat.widget.y r0 = r1.f1300b0
            if (r0 == 0) goto Lf
            r0.m841j(r2)
        Lf:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            androidx.appcompat.widget.f r1 = r0.f1299a0
            if (r1 == 0) goto La
            r1.m715e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.f r0 = r1.f1299a0
            if (r0 == 0) goto La
            r0.m716f(r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = p280q0.C5540g.m11823g(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setSupportAllCaps(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.y r0 = r1.f1300b0
            if (r0 == 0) goto L9
            android.widget.TextView r0 = r0.f1483a
            r0.setAllCaps(r2)
        L9:
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1299a0
            if (r0 == 0) goto L7
            r0.m718h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1299a0
            if (r0 == 0) goto L7
            r0.m719i(r2)
        L7:
            return
    }

    @Override // p280q0.InterfaceC5542i
    /* renamed from: setSupportCompoundDrawablesTintList */
    public void mo581x8f8765f6(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.y r0 = r1.f1300b0
            r0.m842k(r2)
            androidx.appcompat.widget.y r2 = r1.f1300b0
            r2.m834b()
            return
    }

    @Override // p280q0.InterfaceC5542i
    /* renamed from: setSupportCompoundDrawablesTintMode */
    public void mo582x8f87eefb(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.y r0 = r1.f1300b0
            r0.m843l(r2)
            androidx.appcompat.widget.y r2 = r1.f1300b0
            r2.m834b()
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            androidx.appcompat.widget.y r0 = r1.f1300b0
            if (r0 == 0) goto La
            r0.m837f(r2, r3)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setTextSize(int r3, float r4) {
            r2 = this;
            boolean r0 = p280q0.InterfaceC5535b.f21568W
            if (r0 == 0) goto L8
            super.setTextSize(r3, r4)
            goto L19
        L8:
            androidx.appcompat.widget.y r1 = r2.f1300b0
            if (r1 == 0) goto L19
            if (r0 != 0) goto L19
            boolean r0 = r1.m835d()
            if (r0 != 0) goto L19
            androidx.appcompat.widget.a0 r0 = r1.f1491i
            r0.m661f(r3, r4)
        L19:
            return
    }
}
