package com.google.android.material.internal;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends p220m8.C4422f implements androidx.appcompat.view.menu.InterfaceC0216j.a {

    /* renamed from: F0 */
    public static final int[] f6240F0 = null;

    /* renamed from: A0 */
    public androidx.appcompat.view.menu.C0213g f6241A0;

    /* renamed from: B0 */
    public android.content.res.ColorStateList f6242B0;

    /* renamed from: C0 */
    public boolean f6243C0;

    /* renamed from: D0 */
    public android.graphics.drawable.Drawable f6244D0;

    /* renamed from: E0 */
    public final p227n0.C4641a f6245E0;

    /* renamed from: v0 */
    public int f6246v0;

    /* renamed from: w0 */
    public boolean f6247w0;

    /* renamed from: x0 */
    public boolean f6248x0;

    /* renamed from: y0 */
    public final android.widget.CheckedTextView f6249y0;

    /* renamed from: z0 */
    public android.widget.FrameLayout f6250z0;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C1196a extends p227n0.C4641a {

        /* renamed from: d */
        public final /* synthetic */ com.google.android.material.internal.NavigationMenuItemView f6251d;

        public C1196a(com.google.android.material.internal.NavigationMenuItemView r1) {
                r0 = this;
                r0.f6251d = r1
                r0.<init>()
                return
        }

        @Override // p227n0.C4641a
        /* renamed from: d */
        public void mo1040d(android.view.View r3, p242o0.C4868b r4) {
                r2 = this;
                android.view.View$AccessibilityDelegate r0 = r2.f18502a
                android.view.accessibility.AccessibilityNodeInfo r1 = r4.f19337a
                r0.onInitializeAccessibilityNodeInfo(r3, r1)
                com.google.android.material.internal.NavigationMenuItemView r3 = r2.f6251d
                boolean r3 = r3.f6248x0
                android.view.accessibility.AccessibilityNodeInfo r4 = r4.f19337a
                r4.setCheckable(r3)
                return
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r0[r1] = r2
            com.google.android.material.internal.NavigationMenuItemView.f6240F0 = r0
            return
    }

    public NavigationMenuItemView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r5, r0)
            com.google.android.material.internal.NavigationMenuItemView$a r5 = new com.google.android.material.internal.NavigationMenuItemView$a
            r5.<init>(r3)
            r3.f6245E0 = r5
            r3.setOrientation(r0)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r4)
            r1 = 2131558460(0x7f0d003c, float:1.8742236E38)
            r2 = 1
            r0.inflate(r1, r3, r2)
            android.content.res.Resources r4 = r4.getResources()
            r0 = 2131165344(0x7f0700a0, float:1.7944902E38)
            int r4 = r4.getDimensionPixelSize(r0)
            r3.setIconSize(r4)
            r4 = 2131362099(0x7f0a0133, float:1.834397E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.CheckedTextView r4 = (android.widget.CheckedTextView) r4
            r3.f6249y0 = r4
            r4.setDuplicateParentStateEnabled(r2)
            p227n0.C4661t.m10546v(r4, r5)
            return
    }

    private void setActionView(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto L21
            android.widget.FrameLayout r0 = r1.f6250z0
            if (r0 != 0) goto L17
            r0 = 2131362098(0x7f0a0132, float:1.8343967E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.f6250z0 = r0
        L17:
            android.widget.FrameLayout r0 = r1.f6250z0
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r1.f6250z0
            r0.addView(r2)
        L21:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0216j.a
    /* renamed from: d */
    public void mo459d(androidx.appcompat.view.menu.C0213g r7, int r8) {
            r6 = this;
            r6.f6241A0 = r7
            int r8 = r7.f839a
            if (r8 <= 0) goto L9
            r6.setId(r8)
        L9:
            boolean r8 = r7.isVisible()
            r0 = 8
            r1 = 0
            if (r8 == 0) goto L14
            r8 = 0
            goto L16
        L14:
            r8 = 8
        L16:
            r6.setVisibility(r8)
            android.graphics.drawable.Drawable r8 = r6.getBackground()
            r2 = 1
            if (r8 != 0) goto L58
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            android.content.Context r3 = r6.getContext()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r4 = 2130968822(0x7f0400f6, float:1.7546308E38)
            boolean r3 = r3.resolveAttribute(r4, r8, r2)
            if (r3 == 0) goto L52
            android.graphics.drawable.StateListDrawable r3 = new android.graphics.drawable.StateListDrawable
            r3.<init>()
            int[] r4 = com.google.android.material.internal.NavigationMenuItemView.f6240F0
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            int r8 = r8.data
            r5.<init>(r8)
            r3.addState(r4, r5)
            int[] r8 = android.view.ViewGroup.EMPTY_STATE_SET
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            r4.<init>(r1)
            r3.addState(r8, r4)
            goto L53
        L52:
            r3 = 0
        L53:
            java.util.WeakHashMap<android.view.View, n0.w> r8 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10569q(r6, r3)
        L58:
            boolean r8 = r7.isCheckable()
            r6.setCheckable(r8)
            boolean r8 = r7.isChecked()
            r6.setChecked(r8)
            boolean r8 = r7.isEnabled()
            r6.setEnabled(r8)
            java.lang.CharSequence r8 = r7.f843e
            r6.setTitle(r8)
            android.graphics.drawable.Drawable r8 = r7.getIcon()
            r6.setIcon(r8)
            android.view.View r8 = r7.getActionView()
            r6.setActionView(r8)
            java.lang.CharSequence r8 = r7.f855q
            r6.setContentDescription(r8)
            java.lang.CharSequence r7 = r7.f856r
            androidx.appcompat.widget.C0263b1.m693a(r6, r7)
            androidx.appcompat.view.menu.g r7 = r6.f6241A0
            java.lang.CharSequence r8 = r7.f843e
            if (r8 != 0) goto L9f
            android.graphics.drawable.Drawable r7 = r7.getIcon()
            if (r7 != 0) goto L9f
            androidx.appcompat.view.menu.g r7 = r6.f6241A0
            android.view.View r7 = r7.getActionView()
            if (r7 == 0) goto L9f
            goto La0
        L9f:
            r2 = 0
        La0:
            if (r2 == 0) goto Lb3
            android.widget.CheckedTextView r7 = r6.f6249y0
            r7.setVisibility(r0)
            android.widget.FrameLayout r7 = r6.f6250z0
            if (r7 == 0) goto Lca
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r7 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r7
            r8 = -1
            goto Lc3
        Lb3:
            android.widget.CheckedTextView r7 = r6.f6249y0
            r7.setVisibility(r1)
            android.widget.FrameLayout r7 = r6.f6250z0
            if (r7 == 0) goto Lca
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r7 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r7
            r8 = -2
        Lc3:
            r7.width = r8
            android.widget.FrameLayout r8 = r6.f6250z0
            r8.setLayoutParams(r7)
        Lca:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0216j.a
    public androidx.appcompat.view.menu.C0213g getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.g r0 = r1.f6241A0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int[] r2 = super.onCreateDrawableState(r2)
            androidx.appcompat.view.menu.g r0 = r1.f6241A0
            if (r0 == 0) goto L1d
            boolean r0 = r0.isCheckable()
            if (r0 == 0) goto L1d
            androidx.appcompat.view.menu.g r0 = r1.f6241A0
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L1d
            int[] r0 = com.google.android.material.internal.NavigationMenuItemView.f6240F0
            android.view.ViewGroup.mergeDrawableStates(r2, r0)
        L1d:
            return r2
    }

    public void setCheckable(boolean r3) {
            r2 = this;
            r2.refreshDrawableState()
            boolean r0 = r2.f6248x0
            if (r0 == r3) goto L12
            r2.f6248x0 = r3
            n0.a r3 = r2.f6245E0
            android.widget.CheckedTextView r0 = r2.f6249y0
            r1 = 2048(0x800, float:2.87E-42)
            r3.mo2067h(r0, r1)
        L12:
            return
    }

    public void setChecked(boolean r2) {
            r1 = this;
            r1.refreshDrawableState()
            android.widget.CheckedTextView r0 = r1.f6249y0
            r0.setChecked(r2)
            return
    }

    public void setHorizontalPadding(int r2) {
            r1 = this;
            r0 = 0
            r1.setPadding(r2, r0, r2, r0)
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L25
            boolean r1 = r4.f6243C0
            if (r1 == 0) goto L1f
            android.graphics.drawable.Drawable$ConstantState r1 = r5.getConstantState()
            if (r1 != 0) goto Le
            goto L12
        Le:
            android.graphics.drawable.Drawable r5 = r1.newDrawable()
        L12:
            android.graphics.drawable.Drawable r5 = p103g0.C2200a.m5792h(r5)
            android.graphics.drawable.Drawable r5 = r5.mutate()
            android.content.res.ColorStateList r1 = r4.f6242B0
            r5.setTintList(r1)
        L1f:
            int r1 = r4.f6246v0
            r5.setBounds(r0, r0, r1, r1)
            goto L4d
        L25:
            boolean r1 = r4.f6247w0
            if (r1 == 0) goto L4d
            android.graphics.drawable.Drawable r5 = r4.f6244D0
            if (r5 != 0) goto L4b
            android.content.res.Resources r5 = r4.getResources()
            r1 = 2131231335(0x7f080267, float:1.8078748E38)
            android.content.Context r2 = r4.getContext()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            java.lang.ThreadLocal<android.util.TypedValue> r3 = p065e0.C1503h.f7314a
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r1, r2)
            r4.f6244D0 = r5
            if (r5 == 0) goto L4b
            int r1 = r4.f6246v0
            r5.setBounds(r0, r0, r1, r1)
        L4b:
            android.graphics.drawable.Drawable r5 = r4.f6244D0
        L4d:
            android.widget.CheckedTextView r0 = r4.f6249y0
            r1 = 0
            r0.setCompoundDrawablesRelative(r5, r1, r1, r1)
            return
    }

    public void setIconPadding(int r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.f6249y0
            r0.setCompoundDrawablePadding(r2)
            return
    }

    public void setIconSize(int r1) {
            r0 = this;
            r0.f6246v0 = r1
            return
    }

    public void setIconTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f6242B0 = r1
            if (r1 == 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            r0.f6243C0 = r1
            androidx.appcompat.view.menu.g r1 = r0.f6241A0
            if (r1 == 0) goto L14
            android.graphics.drawable.Drawable r1 = r1.getIcon()
            r0.setIcon(r1)
        L14:
            return
    }

    public void setMaxLines(int r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.f6249y0
            r0.setMaxLines(r2)
            return
    }

    public void setNeedsEmptyIcon(boolean r1) {
            r0 = this;
            r0.f6247w0 = r1
            return
    }

    public void setTextAppearance(int r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.f6249y0
            p280q0.C5540g.m11822f(r0, r2)
            return
    }

    public void setTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.f6249y0
            r0.setTextColor(r2)
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.f6249y0
            r0.setText(r2)
            return
    }
}
