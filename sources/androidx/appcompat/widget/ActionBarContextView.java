package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.AbstractC0258a {

    /* renamed from: i0 */
    public java.lang.CharSequence f913i0;

    /* renamed from: j0 */
    public java.lang.CharSequence f914j0;

    /* renamed from: k0 */
    public android.view.View f915k0;

    /* renamed from: l0 */
    public android.view.View f916l0;

    /* renamed from: m0 */
    public android.view.View f917m0;

    /* renamed from: n0 */
    public android.widget.LinearLayout f918n0;

    /* renamed from: o0 */
    public android.widget.TextView f919o0;

    /* renamed from: p0 */
    public android.widget.TextView f920p0;

    /* renamed from: q0 */
    public int f921q0;

    /* renamed from: r0 */
    public int f922r0;

    /* renamed from: s0 */
    public boolean f923s0;

    /* renamed from: t0 */
    public int f924t0;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class ViewOnClickListenerC0219a implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ p177k.AbstractC3617a f925Y;

        public ViewOnClickListenerC0219a(androidx.appcompat.widget.ActionBarContextView r1, p177k.AbstractC3617a r2) {
                r0 = this;
                r0.f925Y = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                k.a r1 = r0.f925Y
                r1.mo4802c()
                return
        }
    }

    public ActionBarContextView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 2130968605(0x7f04001d, float:1.7545868E38)
            r3.<init>(r4, r5, r0)
            int[] r1 = p064e.C1495i.f7261d
            r2 = 0
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r0 = r5.hasValue(r2)
            if (r0 == 0) goto L1e
            int r0 = r5.getResourceId(r2, r2)
            if (r0 == 0) goto L1e
            android.graphics.drawable.Drawable r4 = p102g.C2199a.m5784b(r4, r0)
            goto L22
        L1e:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r2)
        L22:
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10569q(r3, r4)
            r4 = 5
            int r4 = r5.getResourceId(r4, r2)
            r3.f921q0 = r4
            r4 = 4
            int r4 = r5.getResourceId(r4, r2)
            r3.f922r0 = r4
            r4 = 3
            int r4 = r5.getLayoutDimension(r4, r2)
            r3.f1181e0 = r4
            r4 = 2
            r0 = 2131558405(0x7f0d0005, float:1.8742125E38)
            int r4 = r5.getResourceId(r4, r0)
            r3.f924t0 = r4
            r5.recycle()
            return
    }

    /* renamed from: f */
    public void m549f(p177k.AbstractC3617a r7) {
            r6 = this;
            android.view.View r0 = r6.f915k0
            r1 = 0
            if (r0 != 0) goto L16
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.f924t0
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.f915k0 = r0
            goto L1e
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L21
            android.view.View r0 = r6.f915k0
        L1e:
            r6.addView(r0)
        L21:
            android.view.View r0 = r6.f915k0
            r2 = 2131361865(0x7f0a0049, float:1.8343494E38)
            android.view.View r0 = r0.findViewById(r2)
            r6.f916l0 = r0
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6, r7)
            r0.setOnClickListener(r2)
            android.view.Menu r7 = r7.mo4804e()
            androidx.appcompat.view.menu.e r7 = (androidx.appcompat.view.menu.C0211e) r7
            androidx.appcompat.widget.c r0 = r6.f1180d0
            if (r0 == 0) goto L41
            r0.m694b()
        L41:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.f1180d0 = r0
            r2 = 1
            r0.f1227k0 = r2
            r0.f1228l0 = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            androidx.appcompat.widget.c r3 = r6.f1180d0
            android.content.Context r4 = r6.f1178b0
            r7.m499b(r3, r4)
            androidx.appcompat.widget.c r7 = r6.f1180d0
            androidx.appcompat.view.menu.j r3 = r7.f755f0
            if (r3 != 0) goto L79
            android.view.LayoutInflater r4 = r7.f751b0
            int r5 = r7.f753d0
            android.view.View r1 = r4.inflate(r5, r6, r1)
            androidx.appcompat.view.menu.j r1 = (androidx.appcompat.view.menu.InterfaceC0216j) r1
            r7.f755f0 = r1
            androidx.appcompat.view.menu.e r4 = r7.f750a0
            r1.mo465b(r4)
            r7.mo487v(r2)
        L79:
            androidx.appcompat.view.menu.j r1 = r7.f755f0
            if (r3 == r1) goto L83
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r7)
        L83:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.f1179c0 = r1
            r7 = 0
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10569q(r1, r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.f1179c0
            r6.addView(r7, r0)
            return
    }

    /* renamed from: g */
    public final void m550g() {
            r6 = this;
            android.widget.LinearLayout r0 = r6.f918n0
            if (r0 != 0) goto L55
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131558400(0x7f0d0000, float:1.8742115E38)
            r0.inflate(r1, r6)
            int r0 = r6.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r0 = r6.getChildAt(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.f918n0 = r0
            r1 = 2131361856(0x7f0a0040, float:1.8343476E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f919o0 = r0
            android.widget.LinearLayout r0 = r6.f918n0
            r1 = 2131361855(0x7f0a003f, float:1.8343474E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f920p0 = r0
            int r0 = r6.f921q0
            if (r0 == 0) goto L46
            android.widget.TextView r0 = r6.f919o0
            android.content.Context r1 = r6.getContext()
            int r2 = r6.f921q0
            r0.setTextAppearance(r1, r2)
        L46:
            int r0 = r6.f922r0
            if (r0 == 0) goto L55
            android.widget.TextView r0 = r6.f920p0
            android.content.Context r1 = r6.getContext()
            int r2 = r6.f922r0
            r0.setTextAppearance(r1, r2)
        L55:
            android.widget.TextView r0 = r6.f919o0
            java.lang.CharSequence r1 = r6.f913i0
            r0.setText(r1)
            android.widget.TextView r0 = r6.f920p0
            java.lang.CharSequence r1 = r6.f914j0
            r0.setText(r1)
            java.lang.CharSequence r0 = r6.f913i0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.CharSequence r1 = r6.f914j0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r1 = r1 ^ 1
            android.widget.TextView r2 = r6.f920p0
            r3 = 0
            r4 = 8
            if (r1 == 0) goto L7c
            r5 = 0
            goto L7e
        L7c:
            r5 = 8
        L7e:
            r2.setVisibility(r5)
            android.widget.LinearLayout r2 = r6.f918n0
            if (r0 != 0) goto L8a
            if (r1 == 0) goto L88
            goto L8a
        L88:
            r3 = 8
        L8a:
            r2.setVisibility(r3)
            android.widget.LinearLayout r0 = r6.f918n0
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L9a
            android.widget.LinearLayout r0 = r6.f918n0
            r6.addView(r0)
        L9a:
            return
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0258a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
            r1 = this;
            int r0 = super.getAnimatedVisibility()
            return r0
    }

    @Override // androidx.appcompat.widget.AbstractC0258a
    public /* bridge */ /* synthetic */ int getContentHeight() {
            r1 = this;
            int r0 = super.getContentHeight()
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f914j0
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f913i0
            return r0
    }

    /* renamed from: h */
    public void m551h() {
            r2 = this;
            r2.removeAllViews()
            r0 = 0
            r2.f917m0 = r0
            r2.f1179c0 = r0
            r2.f1180d0 = r0
            android.view.View r1 = r2.f916l0
            if (r1 == 0) goto L11
            r1.setOnClickListener(r0)
        L11:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.c r0 = r1.f1180d0
            if (r0 == 0) goto Lf
            r0.m696d()
            androidx.appcompat.widget.c r0 = r1.f1180d0
            r0.m697e()
        Lf:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            int r0 = r3.getEventType()
            r1 = 32
            if (r0 != r1) goto L27
            r3.setSource(r2)
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r3.setClassName(r0)
            android.content.Context r0 = r2.getContext()
            java.lang.String r0 = r0.getPackageName()
            r3.setPackageName(r0)
            java.lang.CharSequence r0 = r2.f913i0
            r3.setContentDescription(r0)
            goto L2a
        L27:
            super.onInitializeAccessibilityEvent(r3)
        L2a:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            boolean r10 = androidx.appcompat.widget.C0275f1.m724b(r9)
            if (r10 == 0) goto Le
            int r0 = r13 - r11
            int r1 = r9.getPaddingRight()
            int r0 = r0 - r1
            goto L12
        Le:
            int r0 = r9.getPaddingLeft()
        L12:
            int r6 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r12 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r12 = r9.getPaddingBottom()
            int r12 = r14 - r12
            android.view.View r14 = r9.f915k0
            r7 = 8
            if (r14 == 0) goto L5c
            int r14 = r14.getVisibility()
            if (r14 == r7) goto L5c
            android.view.View r14 = r9.f915k0
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            if (r10 == 0) goto L3b
            int r1 = r14.rightMargin
            goto L3d
        L3b:
            int r1 = r14.leftMargin
        L3d:
            if (r10 == 0) goto L42
            int r14 = r14.leftMargin
            goto L44
        L42:
            int r14 = r14.rightMargin
        L44:
            if (r10 == 0) goto L48
            int r0 = r0 - r1
            goto L49
        L48:
            int r0 = r0 + r1
        L49:
            r8 = r0
            android.view.View r1 = r9.f915k0
            r0 = r9
            r2 = r8
            r3 = r6
            r4 = r12
            r5 = r10
            int r0 = r0.m651d(r1, r2, r3, r4, r5)
            int r8 = r8 + r0
            if (r10 == 0) goto L5a
            int r8 = r8 - r14
            goto L5b
        L5a:
            int r8 = r8 + r14
        L5b:
            r0 = r8
        L5c:
            r14 = r0
            android.widget.LinearLayout r0 = r9.f918n0
            if (r0 == 0) goto L77
            android.view.View r1 = r9.f917m0
            if (r1 != 0) goto L77
            int r0 = r0.getVisibility()
            if (r0 == r7) goto L77
            android.widget.LinearLayout r1 = r9.f918n0
            r0 = r9
            r2 = r14
            r3 = r6
            r4 = r12
            r5 = r10
            int r0 = r0.m651d(r1, r2, r3, r4, r5)
            int r14 = r14 + r0
        L77:
            r2 = r14
            android.view.View r1 = r9.f917m0
            if (r1 == 0) goto L83
            r0 = r9
            r3 = r6
            r4 = r12
            r5 = r10
            r0.m651d(r1, r2, r3, r4, r5)
        L83:
            if (r10 == 0) goto L8b
            int r11 = r9.getPaddingLeft()
            r3 = r11
            goto L92
        L8b:
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r13 = r13 - r11
            r3 = r13
        L92:
            androidx.appcompat.widget.ActionMenuView r2 = r9.f1179c0
            if (r2 == 0) goto L9f
            r10 = r10 ^ 1
            r1 = r9
            r4 = r6
            r5 = r12
            r6 = r10
            r1.m651d(r2, r3, r4, r5, r6)
        L9f:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r11, int r12) {
            r10 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L100
            int r0 = android.view.View.MeasureSpec.getMode(r12)
            if (r0 == 0) goto Le1
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            int r0 = r10.f1181e0
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            int r0 = android.view.View.MeasureSpec.getSize(r12)
        L1b:
            int r12 = r10.getPaddingTop()
            int r2 = r10.getPaddingBottom()
            int r2 = r2 + r12
            int r12 = r10.getPaddingLeft()
            int r12 = r11 - r12
            int r3 = r10.getPaddingRight()
            int r12 = r12 - r3
            int r3 = r0 - r2
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            android.view.View r6 = r10.f915k0
            r7 = 0
            if (r6 == 0) goto L4e
            int r12 = r10.m650c(r6, r12, r5, r7)
            android.view.View r6 = r10.f915k0
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r8 = r6.leftMargin
            int r6 = r6.rightMargin
            int r8 = r8 + r6
            int r12 = r12 - r8
        L4e:
            androidx.appcompat.widget.ActionMenuView r6 = r10.f1179c0
            if (r6 == 0) goto L5e
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != r10) goto L5e
            androidx.appcompat.widget.ActionMenuView r6 = r10.f1179c0
            int r12 = r10.m650c(r6, r12, r5, r7)
        L5e:
            android.widget.LinearLayout r6 = r10.f918n0
            if (r6 == 0) goto L91
            android.view.View r8 = r10.f917m0
            if (r8 != 0) goto L91
            boolean r8 = r10.f923s0
            if (r8 == 0) goto L8d
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r7)
            android.widget.LinearLayout r8 = r10.f918n0
            r8.measure(r6, r5)
            android.widget.LinearLayout r5 = r10.f918n0
            int r5 = r5.getMeasuredWidth()
            if (r5 > r12) goto L7d
            r6 = 1
            goto L7e
        L7d:
            r6 = 0
        L7e:
            if (r6 == 0) goto L81
            int r12 = r12 - r5
        L81:
            android.widget.LinearLayout r5 = r10.f918n0
            if (r6 == 0) goto L87
            r6 = 0
            goto L89
        L87:
            r6 = 8
        L89:
            r5.setVisibility(r6)
            goto L91
        L8d:
            int r12 = r10.m650c(r6, r12, r5, r7)
        L91:
            android.view.View r5 = r10.f917m0
            if (r5 == 0) goto Lc3
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            int r6 = r5.width
            r8 = -2
            if (r6 == r8) goto La1
            r9 = 1073741824(0x40000000, float:2.0)
            goto La3
        La1:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        La3:
            if (r6 < 0) goto La9
            int r12 = java.lang.Math.min(r6, r12)
        La9:
            int r5 = r5.height
            if (r5 == r8) goto Lae
            goto Lb0
        Lae:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        Lb0:
            if (r5 < 0) goto Lb6
            int r3 = java.lang.Math.min(r5, r3)
        Lb6:
            android.view.View r4 = r10.f917m0
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r9)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            r4.measure(r12, r1)
        Lc3:
            int r12 = r10.f1181e0
            if (r12 > 0) goto Ldd
            int r12 = r10.getChildCount()
            r0 = 0
        Lcc:
            if (r7 >= r12) goto Ldd
            android.view.View r1 = r10.getChildAt(r7)
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r2
            if (r1 <= r0) goto Lda
            r0 = r1
        Lda:
            int r7 = r7 + 1
            goto Lcc
        Ldd:
            r10.setMeasuredDimension(r11, r0)
            return
        Le1:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r12.append(r0)
            java.lang.String r0 = " can only be used with android:layout_height=\"wrap_content\""
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L100:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r12.append(r0)
            java.lang.String r0 = " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    @Override // androidx.appcompat.widget.AbstractC0258a
    public void setContentHeight(int r1) {
            r0 = this;
            r0.f1181e0 = r1
            return
    }

    public void setCustomView(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.f917m0
            if (r0 == 0) goto L7
            r1.removeView(r0)
        L7:
            r1.f917m0 = r2
            if (r2 == 0) goto L15
            android.widget.LinearLayout r0 = r1.f918n0
            if (r0 == 0) goto L15
            r1.removeView(r0)
            r0 = 0
            r1.f918n0 = r0
        L15:
            if (r2 == 0) goto L1a
            r1.addView(r2)
        L1a:
            r1.requestLayout()
            return
    }

    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f914j0 = r1
            r0.m550g()
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f913i0 = r1
            r0.m550g()
            return
    }

    public void setTitleOptional(boolean r2) {
            r1 = this;
            boolean r0 = r1.f923s0
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.f923s0 = r2
            return
    }

    @Override // androidx.appcompat.widget.AbstractC0258a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
