package com.google.android.material.chip;

/* loaded from: classes.dex */
public class ChipGroup extends p220m8.C4421e {

    /* renamed from: e0 */
    public int f5964e0;

    /* renamed from: f0 */
    public int f5965f0;

    /* renamed from: g0 */
    public boolean f5966g0;

    /* renamed from: h0 */
    public boolean f5967h0;

    /* renamed from: i0 */
    public com.google.android.material.chip.ChipGroup.InterfaceC1151d f5968i0;

    /* renamed from: j0 */
    public final com.google.android.material.chip.ChipGroup.C1149b f5969j0;

    /* renamed from: k0 */
    public com.google.android.material.chip.ChipGroup.ViewGroupOnHierarchyChangeListenerC1152e f5970k0;

    /* renamed from: l0 */
    public int f5971l0;

    /* renamed from: m0 */
    public boolean f5972m0;

    /* renamed from: com.google.android.material.chip.ChipGroup$a */
    public static /* synthetic */ class C1148a {
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    public class C1149b implements android.widget.CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.chip.ChipGroup f5973a;

        public C1149b(com.google.android.material.chip.ChipGroup r1, com.google.android.material.chip.ChipGroup.C1148a r2) {
                r0 = this;
                r0.f5973a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton r3, boolean r4) {
                r2 = this;
                com.google.android.material.chip.ChipGroup r0 = r2.f5973a
                boolean r1 = r0.f5972m0
                if (r1 == 0) goto L7
                return
            L7:
                java.util.List r0 = r0.getCheckedChipIds()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L28
                com.google.android.material.chip.ChipGroup r0 = r2.f5973a
                boolean r1 = r0.f5967h0
                if (r1 == 0) goto L28
                int r4 = r3.getId()
                r1 = 1
                r0.m3350d(r4, r1)
                com.google.android.material.chip.ChipGroup r4 = r2.f5973a
                int r3 = r3.getId()
                r4.f5971l0 = r3
                return
            L28:
                int r3 = r3.getId()
                r0 = -1
                if (r4 == 0) goto L45
                com.google.android.material.chip.ChipGroup r4 = r2.f5973a
                int r1 = r4.f5971l0
                if (r1 == r0) goto L3f
                if (r1 == r3) goto L3f
                boolean r0 = r4.f5966g0
                if (r0 == 0) goto L3f
                r0 = 0
                r4.m3350d(r1, r0)
            L3f:
                com.google.android.material.chip.ChipGroup r4 = r2.f5973a
                com.google.android.material.chip.ChipGroup.m3347b(r4, r3)
                goto L4e
            L45:
                com.google.android.material.chip.ChipGroup r4 = r2.f5973a
                int r1 = r4.f5971l0
                if (r1 != r3) goto L4e
                com.google.android.material.chip.ChipGroup.m3347b(r4, r0)
            L4e:
                return
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C1150c extends android.view.ViewGroup.MarginLayoutParams {
        public C1150c(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C1150c(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C1150c(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface InterfaceC1151d {
        /* renamed from: a */
        void m3351a(com.google.android.material.chip.ChipGroup r1, int r2);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    public class ViewGroupOnHierarchyChangeListenerC1152e implements android.view.ViewGroup.OnHierarchyChangeListener {

        /* renamed from: Y */
        public android.view.ViewGroup.OnHierarchyChangeListener f5974Y;

        /* renamed from: Z */
        public final /* synthetic */ com.google.android.material.chip.ChipGroup f5975Z;

        public ViewGroupOnHierarchyChangeListenerC1152e(com.google.android.material.chip.ChipGroup r1, com.google.android.material.chip.ChipGroup.C1148a r2) {
                r0 = this;
                r0.f5975Z = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(android.view.View r4, android.view.View r5) {
                r3 = this;
                com.google.android.material.chip.ChipGroup r0 = r3.f5975Z
                if (r4 != r0) goto L32
                boolean r0 = r5 instanceof com.google.android.material.chip.Chip
                if (r0 == 0) goto L32
                int r0 = r5.getId()
                r1 = -1
                if (r0 != r1) goto L18
                java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
                int r0 = p227n0.C4661t.d.m10572a()
                r5.setId(r0)
            L18:
                r0 = r5
                com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
                boolean r1 = r0.isChecked()
                if (r1 == 0) goto L2b
                r1 = r4
                com.google.android.material.chip.ChipGroup r1 = (com.google.android.material.chip.ChipGroup) r1
                int r2 = r0.getId()
                r1.m3349c(r2)
            L2b:
                com.google.android.material.chip.ChipGroup r1 = r3.f5975Z
                com.google.android.material.chip.ChipGroup$b r1 = r1.f5969j0
                r0.m3338x7da65987(r1)
            L32:
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r3.f5974Y
                if (r0 == 0) goto L39
                r0.onChildViewAdded(r4, r5)
            L39:
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(android.view.View r3, android.view.View r4) {
                r2 = this;
                com.google.android.material.chip.ChipGroup r0 = r2.f5975Z
                if (r3 != r0) goto Lf
                boolean r0 = r4 instanceof com.google.android.material.chip.Chip
                if (r0 == 0) goto Lf
                r0 = r4
                com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
                r1 = 0
                r0.m3338x7da65987(r1)
            Lf:
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r2.f5974Y
                if (r0 == 0) goto L16
                r0.onChildViewRemoved(r3, r4)
            L16:
                return
        }
    }

    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r0 = 2132017936(0x7f140310, float:1.9674164E38)
            r1 = 2130968778(0x7f0400ca, float:1.754622E38)
            android.content.Context r8 = p431y8.C7133a.m14245a(r8, r9, r1, r0)
            r7.<init>(r8, r9, r1)
            com.google.android.material.chip.ChipGroup$b r8 = new com.google.android.material.chip.ChipGroup$b
            r0 = 0
            r8.<init>(r7, r0)
            r7.f5969j0 = r8
            com.google.android.material.chip.ChipGroup$e r8 = new com.google.android.material.chip.ChipGroup$e
            r8.<init>(r7, r0)
            r7.f5970k0 = r8
            r8 = -1
            r7.f5971l0 = r8
            r0 = 0
            r7.f5972m0 = r0
            android.content.Context r1 = r7.getContext()
            int[] r3 = p339t7.C6183a.f24012i
            int[] r6 = new int[r0]
            r5 = 2132017936(0x7f140310, float:1.9674164E38)
            r4 = 2130968778(0x7f0400ca, float:1.754622E38)
            r2 = r9
            android.content.res.TypedArray r9 = p220m8.C4429m.m9881d(r1, r2, r3, r4, r5, r6)
            r1 = 1
            int r2 = r9.getDimensionPixelOffset(r1, r0)
            r3 = 2
            int r3 = r9.getDimensionPixelOffset(r3, r2)
            r7.setChipSpacingHorizontal(r3)
            r3 = 3
            int r2 = r9.getDimensionPixelOffset(r3, r2)
            r7.setChipSpacingVertical(r2)
            r2 = 5
            boolean r2 = r9.getBoolean(r2, r0)
            r7.setSingleLine(r2)
            r2 = 6
            boolean r2 = r9.getBoolean(r2, r0)
            r7.setSingleSelection(r2)
            r2 = 4
            boolean r2 = r9.getBoolean(r2, r0)
            r7.setSelectionRequired(r2)
            int r0 = r9.getResourceId(r0, r8)
            if (r0 == r8) goto L6a
            r7.f5971l0 = r0
        L6a:
            r9.recycle()
            com.google.android.material.chip.ChipGroup$e r8 = r7.f5970k0
            super.setOnHierarchyChangeListener(r8)
            java.util.WeakHashMap<android.view.View, n0.w> r8 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10571s(r7, r1)
            return
    }

    /* renamed from: b */
    public static /* synthetic */ void m3347b(com.google.android.material.chip.ChipGroup r0, int r1) {
            r0.setCheckedId(r1)
            return
    }

    private int getChipCount() {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3.getChildCount()
            if (r0 >= r2) goto L15
            android.view.View r2 = r3.getChildAt(r0)
            boolean r2 = r2 instanceof com.google.android.material.chip.Chip
            if (r2 == 0) goto L12
            int r1 = r1 + 1
        L12:
            int r0 = r0 + 1
            goto L2
        L15:
            return r1
    }

    private void setCheckedId(int r3) {
            r2 = this;
            r2.f5971l0 = r3
            com.google.android.material.chip.ChipGroup$d r0 = r2.f5968i0
            if (r0 == 0) goto Ld
            boolean r1 = r2.f5966g0
            if (r1 == 0) goto Ld
            r0.m3351a(r2, r3)
        Ld:
            return
    }

    @Override // p220m8.C4421e
    /* renamed from: a */
    public boolean mo3348a() {
            r1 = this;
            boolean r0 = r1.f18044c0
            return r0
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r4, int r5, android.view.ViewGroup.LayoutParams r6) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.material.chip.Chip
            if (r0 == 0) goto L21
            r0 = r4
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
            boolean r1 = r0.isChecked()
            if (r1 == 0) goto L21
            int r1 = r3.f5971l0
            r2 = -1
            if (r1 == r2) goto L1a
            boolean r2 = r3.f5966g0
            if (r2 == 0) goto L1a
            r2 = 0
            r3.m3350d(r1, r2)
        L1a:
            int r0 = r0.getId()
            r3.setCheckedId(r0)
        L21:
            super.addView(r4, r5, r6)
            return
    }

    /* renamed from: c */
    public void m3349c(int r4) {
            r3 = this;
            int r0 = r3.f5971l0
            if (r4 != r0) goto L5
            return
        L5:
            r1 = -1
            if (r0 == r1) goto L10
            boolean r2 = r3.f5966g0
            if (r2 == 0) goto L10
            r2 = 0
            r3.m3350d(r0, r2)
        L10:
            if (r4 == r1) goto L16
            r0 = 1
            r3.m3350d(r4, r0)
        L16:
            r3.setCheckedId(r4)
            return
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = super.checkLayoutParams(r2)
            if (r0 == 0) goto Lc
            boolean r2 = r2 instanceof com.google.android.material.chip.ChipGroup.C1150c
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    /* renamed from: d */
    public final void m3350d(int r2, boolean r3) {
            r1 = this;
            android.view.View r2 = r1.findViewById(r2)
            boolean r0 = r2 instanceof com.google.android.material.chip.Chip
            if (r0 == 0) goto L13
            r0 = 1
            r1.f5972m0 = r0
            com.google.android.material.chip.Chip r2 = (com.google.android.material.chip.Chip) r2
            r2.setChecked(r3)
            r2 = 0
            r1.f5972m0 = r2
        L13:
            return
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            com.google.android.material.chip.ChipGroup$c r0 = new com.google.android.material.chip.ChipGroup$c
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            com.google.android.material.chip.ChipGroup$c r0 = new com.google.android.material.chip.ChipGroup$c
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            com.google.android.material.chip.ChipGroup$c r0 = new com.google.android.material.chip.ChipGroup$c
            r0.<init>(r2)
            return r0
    }

    public int getCheckedChipId() {
            r1 = this;
            boolean r0 = r1.f5966g0
            if (r0 == 0) goto L7
            int r0 = r1.f5971l0
            goto L8
        L7:
            r0 = -1
        L8:
            return r0
    }

    public java.util.List<java.lang.Integer> getCheckedChipIds() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L30
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = r2 instanceof com.google.android.material.chip.Chip
            if (r3 == 0) goto L2d
            r3 = r2
            com.google.android.material.chip.Chip r3 = (com.google.android.material.chip.Chip) r3
            boolean r3 = r3.isChecked()
            if (r3 == 0) goto L2d
            int r2 = r2.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            boolean r2 = r4.f5966g0
            if (r2 == 0) goto L2d
            return r0
        L2d:
            int r1 = r1 + 1
            goto L6
        L30:
            return r0
    }

    public int getChipSpacingHorizontal() {
            r1 = this;
            int r0 = r1.f5964e0
            return r0
    }

    public int getChipSpacingVertical() {
            r1 = this;
            int r0 = r1.f5965f0
            return r0
    }

    @Override // android.view.View
    public void onFinishInflate() {
            r2 = this;
            super.onFinishInflate()
            int r0 = r2.f5971l0
            r1 = -1
            if (r0 == r1) goto L11
            r1 = 1
            r2.m3350d(r0, r1)
            int r0 = r2.f5971l0
            r2.setCheckedId(r0)
        L11:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r5) {
            r4 = this;
            super.onInitializeAccessibilityNodeInfo(r5)
            boolean r0 = r4.f18044c0
            if (r0 == 0) goto Lc
            int r0 = r4.getChipCount()
            goto Ld
        Lc:
            r0 = -1
        Ld:
            int r1 = r4.getRowCount()
            r2 = 0
            boolean r3 = r4.f5966g0
            if (r3 == 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 2
        L19:
            o0.b$b r0 = p242o0.C4868b.b.m11001a(r1, r0, r2, r3)
            java.lang.Object r0 = r0.f19352a
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r0
            r5.setCollectionInfo(r0)
            return
    }

    public void setChipSpacing(int r1) {
            r0 = this;
            r0.setChipSpacingHorizontal(r1)
            r0.setChipSpacingVertical(r1)
            return
    }

    public void setChipSpacingHorizontal(int r2) {
            r1 = this;
            int r0 = r1.f5964e0
            if (r0 == r2) goto Lc
            r1.f5964e0 = r2
            r1.setItemSpacing(r2)
            r1.requestLayout()
        Lc:
            return
    }

    public void setChipSpacingHorizontalResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelOffset(r2)
            r1.setChipSpacingHorizontal(r2)
            return
    }

    public void setChipSpacingResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelOffset(r2)
            r1.setChipSpacing(r2)
            return
    }

    public void setChipSpacingVertical(int r2) {
            r1 = this;
            int r0 = r1.f5965f0
            if (r0 == r2) goto Lc
            r1.f5965f0 = r2
            r1.setLineSpacing(r2)
            r1.requestLayout()
        Lc:
            return
    }

    public void setChipSpacingVerticalResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelOffset(r2)
            r1.setChipSpacingVertical(r2)
            return
    }

    @java.lang.Deprecated
    public void setDividerDrawableHorizontal(android.graphics.drawable.Drawable r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing."
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public void setDividerDrawableVertical(android.graphics.drawable.Drawable r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing."
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public void setFlexWrap(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead."
            r2.<init>(r0)
            throw r2
    }

    public void setOnCheckedChangeListener(com.google.android.material.chip.ChipGroup.InterfaceC1151d r1) {
            r0 = this;
            r0.f5968i0 = r1
            return
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener r2) {
            r1 = this;
            com.google.android.material.chip.ChipGroup$e r0 = r1.f5970k0
            r0.f5974Y = r2
            return
    }

    public void setSelectionRequired(boolean r1) {
            r0 = this;
            r0.f5967h0 = r1
            return
    }

    @java.lang.Deprecated
    public void setShowDividerHorizontal(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing."
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public void setShowDividerVertical(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing."
            r2.<init>(r0)
            throw r2
    }

    public void setSingleLine(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setSingleLine(r2)
            return
    }

    @Override // p220m8.C4421e
    public void setSingleLine(boolean r1) {
            r0 = this;
            super.setSingleLine(r1)
            return
    }

    public void setSingleSelection(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setSingleSelection(r2)
            return
    }

    public void setSingleSelection(boolean r4) {
            r3 = this;
            boolean r0 = r3.f5966g0
            if (r0 == r4) goto L27
            r3.f5966g0 = r4
            r4 = 1
            r3.f5972m0 = r4
            r4 = 0
            r0 = 0
        Lb:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L21
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof com.google.android.material.chip.Chip
            if (r2 == 0) goto L1e
            com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
            r1.setChecked(r4)
        L1e:
            int r0 = r0 + 1
            goto Lb
        L21:
            r3.f5972m0 = r4
            r4 = -1
            r3.setCheckedId(r4)
        L27:
            return
    }
}
