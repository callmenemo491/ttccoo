package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class AppCompatTextView extends android.widget.TextView implements p280q0.InterfaceC5542i, p280q0.InterfaceC5535b {

    /* renamed from: a0 */
    public final androidx.appcompat.widget.C0273f f980a0;

    /* renamed from: b0 */
    public final androidx.appcompat.widget.C0313y f981b0;

    /* renamed from: c0 */
    public final androidx.appcompat.widget.C0311x f982c0;

    /* renamed from: d0 */
    public boolean f983d0;

    /* renamed from: e0 */
    public java.util.concurrent.Future<p195l0.C4158b> f984e0;

    public AppCompatTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842884(0x1010084, float:2.3693928E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatTextView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            androidx.appcompat.widget.C0308v0.m793a(r1)
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.f983d0 = r1
            android.content.Context r1 = r0.getContext()
            androidx.appcompat.widget.C0304t0.m787a(r0, r1)
            androidx.appcompat.widget.f r1 = new androidx.appcompat.widget.f
            r1.<init>(r0)
            r0.f980a0 = r1
            r1.m714d(r2, r3)
            androidx.appcompat.widget.y r1 = new androidx.appcompat.widget.y
            r1.<init>(r0)
            r0.f981b0 = r1
            r1.m836e(r2, r3)
            r1.m834b()
            androidx.appcompat.widget.x r1 = new androidx.appcompat.widget.x
            r1.<init>(r0)
            r0.f982c0 = r1
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.f r0 = r1.f980a0
            if (r0 == 0) goto La
            r0.m711a()
        La:
            androidx.appcompat.widget.y r0 = r1.f981b0
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
            androidx.appcompat.widget.y r0 = r1.f981b0
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
            androidx.appcompat.widget.y r0 = r1.f981b0
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
            androidx.appcompat.widget.y r0 = r1.f981b0
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
            androidx.appcompat.widget.y r0 = r1.f981b0
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
            androidx.appcompat.widget.y r0 = r3.f981b0
            if (r0 == 0) goto L17
            androidx.appcompat.widget.a0 r0 = r0.f1491i
            int r0 = r0.f1191a
            return r0
        L17:
            return r1
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
            r2 = this;
            int r0 = r2.getPaddingTop()
            android.text.TextPaint r1 = r2.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.top
            int r0 = r0 - r1
            return r0
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
            r2 = this;
            int r0 = r2.getPaddingBottom()
            android.text.TextPaint r1 = r2.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.bottom
            int r0 = r0 + r1
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f980a0
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
            androidx.appcompat.widget.f r0 = r1.f980a0
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m713c()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    /* renamed from: getSupportCompoundDrawablesTintList */
    public android.content.res.ColorStateList m579xbd5e68ea() {
            r1 = this;
            androidx.appcompat.widget.y r0 = r1.f981b0
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
    public android.graphics.PorterDuff.Mode m580xbd5ef1ef() {
            r1 = this;
            androidx.appcompat.widget.y r0 = r1.f981b0
            androidx.appcompat.widget.w0 r0 = r0.f1490h
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.f1476b
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
            r2 = this;
            java.util.concurrent.Future<l0.b> r0 = r2.f984e0
            if (r0 == 0) goto L10
            r1 = 0
            r2.f984e0 = r1     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L10
            l0.b r0 = (p195l0.C4158b) r0     // Catch: java.lang.Throwable -> L10
            p280q0.C5540g.m11821e(r2, r0)     // Catch: java.lang.Throwable -> L10
        L10:
            java.lang.CharSequence r0 = super.getText()
            return r0
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L10
            androidx.appcompat.widget.x r0 = r2.f982c0
            if (r0 != 0) goto Lb
            goto L10
        Lb:
            android.view.textclassifier.TextClassifier r0 = r0.m823n()
            return r0
        L10:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    public p195l0.C4158b.a getTextMetricsParamsCompat() {
            r1 = this;
            l0.b$a r0 = p280q0.C5540g.m11817a(r1)
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            androidx.appcompat.widget.y r1 = r2.f981b0
            r1.m838g(r2, r0, r3)
            p064e.C1487a.m4030h(r0, r3, r2)
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.y r1 = r0.f981b0
            if (r1 == 0) goto L10
            boolean r2 = p280q0.InterfaceC5535b.f21568W
            if (r2 != 0) goto L10
            androidx.appcompat.widget.a0 r1 = r1.f1491i
            r1.m658a()
        L10:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r3, int r4) {
            r2 = this;
            java.util.concurrent.Future<l0.b> r0 = r2.f984e0
            if (r0 == 0) goto L10
            r1 = 0
            r2.f984e0 = r1     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L10
            l0.b r0 = (p195l0.C4158b) r0     // Catch: java.lang.Throwable -> L10
            p280q0.C5540g.m11821e(r2, r0)     // Catch: java.lang.Throwable -> L10
        L10:
            super.onMeasure(r3, r4)
            return
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            androidx.appcompat.widget.y r1 = r0.f981b0
            if (r1 == 0) goto L18
            boolean r2 = p280q0.InterfaceC5535b.f21568W
            if (r2 != 0) goto L18
            boolean r1 = r1.m835d()
            if (r1 == 0) goto L18
            androidx.appcompat.widget.y r1 = r0.f981b0
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
            androidx.appcompat.widget.y r0 = r1.f981b0
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
            androidx.appcompat.widget.y r0 = r1.f981b0
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
            androidx.appcompat.widget.y r0 = r1.f981b0
            if (r0 == 0) goto Lf
            r0.m841j(r2)
        Lf:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            androidx.appcompat.widget.f r1 = r0.f980a0
            if (r1 == 0) goto La
            r1.m715e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.f r0 = r1.f980a0
            if (r0 == 0) goto La
            r0.m716f(r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            androidx.appcompat.widget.y r1 = r0.f981b0
            if (r1 == 0) goto La
            r1.m834b()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            androidx.appcompat.widget.y r1 = r0.f981b0
            if (r1 == 0) goto La
            r1.m834b()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = p102g.C2199a.m5784b(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = p102g.C2199a.m5784b(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = p102g.C2199a.m5784b(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = p102g.C2199a.m5784b(r0, r6)
        L23:
            r2.setCompoundDrawablesRelativeWithIntrinsicBounds(r3, r4, r5, r1)
            androidx.appcompat.widget.y r3 = r2.f981b0
            if (r3 == 0) goto L2d
            r3.m834b()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            androidx.appcompat.widget.y r1 = r0.f981b0
            if (r1 == 0) goto La
            r1.m834b()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = p102g.C2199a.m5784b(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = p102g.C2199a.m5784b(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = p102g.C2199a.m5784b(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = p102g.C2199a.m5784b(r0, r6)
        L23:
            r2.setCompoundDrawablesWithIntrinsicBounds(r3, r4, r5, r1)
            androidx.appcompat.widget.y r3 = r2.f981b0
            if (r3 == 0) goto L2d
            r3.m834b()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            androidx.appcompat.widget.y r1 = r0.f981b0
            if (r1 == 0) goto La
            r1.m834b()
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            super.setFirstBaselineToTopHeight(r3)
            goto Ld
        La:
            p280q0.C5540g.m11818b(r2, r3)
        Ld:
            return
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            super.setLastBaselineToBottomHeight(r3)
            goto Ld
        La:
            p280q0.C5540g.m11819c(r2, r3)
        Ld:
            return
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r1) {
            r0 = this;
            p280q0.C5540g.m11820d(r0, r1)
            return
    }

    public void setPrecomputedText(p195l0.C4158b r1) {
            r0 = this;
            p280q0.C5540g.m11821e(r0, r1)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f980a0
            if (r0 == 0) goto L7
            r0.m718h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f980a0
            if (r0 == 0) goto L7
            r0.m719i(r2)
        L7:
            return
    }

    @Override // p280q0.InterfaceC5542i
    /* renamed from: setSupportCompoundDrawablesTintList */
    public void mo581x8f8765f6(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.y r0 = r1.f981b0
            r0.m842k(r2)
            androidx.appcompat.widget.y r2 = r1.f981b0
            r2.m834b()
            return
    }

    @Override // p280q0.InterfaceC5542i
    /* renamed from: setSupportCompoundDrawablesTintMode */
    public void mo582x8f87eefb(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.y r0 = r1.f981b0
            r0.m843l(r2)
            androidx.appcompat.widget.y r2 = r1.f981b0
            r2.m834b()
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            androidx.appcompat.widget.y r0 = r1.f981b0
            if (r0 == 0) goto La
            r0.m837f(r2, r3)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto Le
            androidx.appcompat.widget.x r0 = r2.f982c0
            if (r0 != 0) goto Lb
            goto Le
        Lb:
            r0.f1482a0 = r3
            return
        Le:
            super.setTextClassifier(r3)
            return
    }

    public void setTextFuture(java.util.concurrent.Future<p195l0.C4158b> r1) {
            r0 = this;
            r0.f984e0 = r1
            if (r1 == 0) goto L7
            r0.requestLayout()
        L7:
            return
    }

    public void setTextMetricsParamsCompat(p195l0.C4158b.a r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            android.text.TextDirectionHeuristic r1 = r5.f17230b
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            r3 = 1
            if (r1 != r2) goto La
            goto L32
        La:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r1 != r2) goto Lf
            goto L32
        Lf:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            if (r1 != r2) goto L15
            r3 = 2
            goto L32
        L15:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.LTR
            if (r1 != r2) goto L1b
            r3 = 3
            goto L32
        L1b:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.RTL
            if (r1 != r2) goto L21
            r3 = 4
            goto L32
        L21:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.LOCALE
            if (r1 != r2) goto L27
            r3 = 5
            goto L32
        L27:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r1 != r2) goto L2d
            r3 = 6
            goto L32
        L2d:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r1 != r2) goto L32
            r3 = 7
        L32:
            r4.setTextDirection(r3)
            r1 = 23
            if (r0 >= r1) goto L5e
            android.text.TextPaint r0 = r5.f17229a
            float r0 = r0.getTextScaleX()
            android.text.TextPaint r1 = r4.getPaint()
            android.text.TextPaint r5 = r5.f17229a
            r1.set(r5)
            float r5 = r4.getTextScaleX()
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 != 0) goto L5a
            r5 = 1073741824(0x40000000, float:2.0)
            float r5 = r0 / r5
            r1 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r1
            r4.setTextScaleX(r5)
        L5a:
            r4.setTextScaleX(r0)
            goto L71
        L5e:
            android.text.TextPaint r0 = r4.getPaint()
            android.text.TextPaint r1 = r5.f17229a
            r0.set(r1)
            int r0 = r5.f17231c
            r4.setBreakStrategy(r0)
            int r5 = r5.f17232d
            r4.setHyphenationFrequency(r5)
        L71:
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
            androidx.appcompat.widget.y r1 = r2.f981b0
            if (r1 == 0) goto L19
            if (r0 != 0) goto L19
            boolean r0 = r1.m835d()
            if (r0 != 0) goto L19
            androidx.appcompat.widget.a0 r0 = r1.f1491i
            r0.m661f(r3, r4)
        L19:
            return
    }

    @Override // android.widget.TextView
    public void setTypeface(android.graphics.Typeface r3, int r4) {
            r2 = this;
            boolean r0 = r2.f983d0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            if (r3 == 0) goto L1f
            if (r4 <= 0) goto L1f
            android.content.Context r0 = r2.getContext()
            f0.k r1 = p084f0.C1942e.f8487a
            if (r0 == 0) goto L17
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r3, r4)
            goto L1f
        L17:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Context cannot be null"
            r3.<init>(r4)
            throw r3
        L1f:
            r1 = 1
            r2.f983d0 = r1
            if (r0 == 0) goto L25
            r3 = r0
        L25:
            r0 = 0
            super.setTypeface(r3, r4)     // Catch: java.lang.Throwable -> L2c
            r2.f983d0 = r0
            return
        L2c:
            r3 = move-exception
            r2.f983d0 = r0
            throw r3
    }
}
