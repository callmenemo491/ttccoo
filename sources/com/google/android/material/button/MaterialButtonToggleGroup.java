package com.google.android.material.button;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends android.widget.LinearLayout {

    /* renamed from: k0 */
    public static final /* synthetic */ int f5915k0 = 0;

    /* renamed from: a0 */
    public final java.util.List<com.google.android.material.button.MaterialButtonToggleGroup.C1142d> f5916a0;

    /* renamed from: b0 */
    public final com.google.android.material.button.MaterialButtonToggleGroup.C1141c f5917b0;

    /* renamed from: c0 */
    public final com.google.android.material.button.MaterialButtonToggleGroup.C1144f f5918c0;

    /* renamed from: d0 */
    public final java.util.LinkedHashSet<com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC1143e> f5919d0;

    /* renamed from: e0 */
    public final java.util.Comparator<com.google.android.material.button.MaterialButton> f5920e0;

    /* renamed from: f0 */
    public java.lang.Integer[] f5921f0;

    /* renamed from: g0 */
    public boolean f5922g0;

    /* renamed from: h0 */
    public boolean f5923h0;

    /* renamed from: i0 */
    public boolean f5924i0;

    /* renamed from: j0 */
    public int f5925j0;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    public class C1139a implements java.util.Comparator<com.google.android.material.button.MaterialButton> {

        /* renamed from: Y */
        public final /* synthetic */ com.google.android.material.button.MaterialButtonToggleGroup f5926Y;

        public C1139a(com.google.android.material.button.MaterialButtonToggleGroup r1) {
                r0 = this;
                r0.f5926Y = r1
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(com.google.android.material.button.MaterialButton r3, com.google.android.material.button.MaterialButton r4) {
                r2 = this;
                com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
                com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
                boolean r0 = r3.isChecked()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                boolean r1 = r4.isChecked()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                int r0 = r0.compareTo(r1)
                if (r0 == 0) goto L1b
                goto L4a
            L1b:
                boolean r0 = r3.isPressed()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                boolean r1 = r4.isPressed()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                int r0 = r0.compareTo(r1)
                if (r0 == 0) goto L32
                goto L4a
            L32:
                com.google.android.material.button.MaterialButtonToggleGroup r0 = r2.f5926Y
                int r3 = r0.indexOfChild(r3)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.google.android.material.button.MaterialButtonToggleGroup r0 = r2.f5926Y
                int r4 = r0.indexOfChild(r4)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                int r0 = r3.compareTo(r4)
            L4a:
                return r0
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    public class C1140b extends p227n0.C4641a {

        /* renamed from: d */
        public final /* synthetic */ com.google.android.material.button.MaterialButtonToggleGroup f5927d;

        public C1140b(com.google.android.material.button.MaterialButtonToggleGroup r1) {
                r0 = this;
                r0.f5927d = r1
                r0.<init>()
                return
        }

        @Override // p227n0.C4641a
        /* renamed from: d */
        public void mo1040d(android.view.View r9, p242o0.C4868b r10) {
                r8 = this;
                android.view.View$AccessibilityDelegate r0 = r8.f18502a
                android.view.accessibility.AccessibilityNodeInfo r1 = r10.f19337a
                r0.onInitializeAccessibilityNodeInfo(r9, r1)
                r2 = 0
                r3 = 1
                com.google.android.material.button.MaterialButtonToggleGroup r0 = r8.f5927d
                int r1 = com.google.android.material.button.MaterialButtonToggleGroup.f5915k0
                java.util.Objects.requireNonNull(r0)
                boolean r1 = r9 instanceof com.google.android.material.button.MaterialButton
                r4 = -1
                if (r1 != 0) goto L16
                goto L39
            L16:
                r1 = 0
                r5 = 0
            L18:
                int r6 = r0.getChildCount()
                if (r1 >= r6) goto L39
                android.view.View r6 = r0.getChildAt(r1)
                if (r6 != r9) goto L26
                r4 = r5
                goto L39
            L26:
                android.view.View r6 = r0.getChildAt(r1)
                boolean r6 = r6 instanceof com.google.android.material.button.MaterialButton
                if (r6 == 0) goto L36
                boolean r6 = r0.m3319d(r1)
                if (r6 == 0) goto L36
                int r5 = r5 + 1
            L36:
                int r1 = r1 + 1
                goto L18
            L39:
                r5 = 1
                r6 = 0
                com.google.android.material.button.MaterialButton r9 = (com.google.android.material.button.MaterialButton) r9
                boolean r7 = r9.isChecked()
                o0.b$c r9 = p242o0.C4868b.c.m11002a(r2, r3, r4, r5, r6, r7)
                r10.m10997j(r9)
                return
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    public class C1141c implements com.google.android.material.button.MaterialButton.InterfaceC1136a {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.button.MaterialButtonToggleGroup f5928a;

        public C1141c(com.google.android.material.button.MaterialButtonToggleGroup r1, com.google.android.material.button.MaterialButtonToggleGroup.C1139a r2) {
                r0 = this;
                r0.f5928a = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC1136a
        /* renamed from: a */
        public void mo3315a(com.google.android.material.button.MaterialButton r3, boolean r4) {
                r2 = this;
                com.google.android.material.button.MaterialButtonToggleGroup r0 = r2.f5928a
                boolean r1 = r0.f5922g0
                if (r1 == 0) goto L7
                return
            L7:
                boolean r1 = r0.f5923h0
                if (r1 == 0) goto L15
                if (r4 == 0) goto L12
                int r1 = r3.getId()
                goto L13
            L12:
                r1 = -1
            L13:
                r0.f5925j0 = r1
            L15:
                com.google.android.material.button.MaterialButtonToggleGroup r0 = r2.f5928a
                int r1 = r3.getId()
                boolean r4 = r0.m3321f(r1, r4)
                if (r4 == 0) goto L2e
                com.google.android.material.button.MaterialButtonToggleGroup r4 = r2.f5928a
                int r0 = r3.getId()
                boolean r3 = r3.isChecked()
                r4.m3317b(r0, r3)
            L2e:
                com.google.android.material.button.MaterialButtonToggleGroup r3 = r2.f5928a
                r3.invalidate()
                return
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    public static class C1142d {

        /* renamed from: e */
        public static final p340t8.InterfaceC6186c f5929e = null;

        /* renamed from: a */
        public p340t8.InterfaceC6186c f5930a;

        /* renamed from: b */
        public p340t8.InterfaceC6186c f5931b;

        /* renamed from: c */
        public p340t8.InterfaceC6186c f5932c;

        /* renamed from: d */
        public p340t8.InterfaceC6186c f5933d;

        static {
                t8.a r0 = new t8.a
                r1 = 0
                r0.<init>(r1)
                com.google.android.material.button.MaterialButtonToggleGroup.C1142d.f5929e = r0
                return
        }

        public C1142d(p340t8.InterfaceC6186c r1, p340t8.InterfaceC6186c r2, p340t8.InterfaceC6186c r3, p340t8.InterfaceC6186c r4) {
                r0 = this;
                r0.<init>()
                r0.f5930a = r1
                r0.f5931b = r3
                r0.f5932c = r4
                r0.f5933d = r2
                return
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    public interface InterfaceC1143e {
        /* renamed from: a */
        void mo3323a(com.google.android.material.button.MaterialButtonToggleGroup r1, int r2, boolean r3);
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$f */
    public class C1144f implements com.google.android.material.button.MaterialButton.InterfaceC1137b {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.button.MaterialButtonToggleGroup f5934a;

        public C1144f(com.google.android.material.button.MaterialButtonToggleGroup r1, com.google.android.material.button.MaterialButtonToggleGroup.C1139a r2) {
                r0 = this;
                r0.f5934a = r1
                r0.<init>()
                return
        }
    }

    static {
            java.lang.Class<com.google.android.material.button.MaterialButtonToggleGroup> r0 = com.google.android.material.button.MaterialButtonToggleGroup.class
            return
    }

    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r0 = 2132017950(0x7f14031e, float:1.9674193E38)
            r1 = 2130969222(0x7f040286, float:1.754712E38)
            android.content.Context r7 = p431y8.C7133a.m14245a(r7, r8, r1, r0)
            r6.<init>(r7, r8, r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f5916a0 = r7
            com.google.android.material.button.MaterialButtonToggleGroup$c r7 = new com.google.android.material.button.MaterialButtonToggleGroup$c
            r0 = 0
            r7.<init>(r6, r0)
            r6.f5917b0 = r7
            com.google.android.material.button.MaterialButtonToggleGroup$f r7 = new com.google.android.material.button.MaterialButtonToggleGroup$f
            r7.<init>(r6, r0)
            r6.f5918c0 = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f5919d0 = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>(r6)
            r6.f5920e0 = r7
            r7 = 0
            r6.f5922g0 = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = p339t7.C6183a.f24024u
            int[] r5 = new int[r7]
            r4 = 2132017950(0x7f14031e, float:1.9674193E38)
            r3 = 2130969222(0x7f040286, float:1.754712E38)
            r1 = r8
            android.content.res.TypedArray r8 = p220m8.C4429m.m9881d(r0, r1, r2, r3, r4, r5)
            r0 = 2
            boolean r0 = r8.getBoolean(r0, r7)
            r6.setSingleSelection(r0)
            r0 = -1
            int r0 = r8.getResourceId(r7, r0)
            r6.f5925j0 = r0
            r0 = 1
            boolean r7 = r8.getBoolean(r0, r7)
            r6.f5924i0 = r7
            r6.setChildrenDrawingOrderEnabled(r0)
            r8.recycle()
            java.util.WeakHashMap<android.view.View, n0.w> r7 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10571s(r6, r0)
            return
    }

    private int getFirstVisibleChildIndex() {
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            boolean r2 = r3.m3319d(r1)
            if (r2 == 0) goto Le
            return r1
        Le:
            int r1 = r1 + 1
            goto L5
        L11:
            r0 = -1
            return r0
    }

    private int getLastVisibleChildIndex() {
            r2 = this;
            int r0 = r2.getChildCount()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L12
            boolean r1 = r2.m3319d(r0)
            if (r1 == 0) goto Lf
            return r0
        Lf:
            int r0 = r0 + (-1)
            goto L6
        L12:
            r0 = -1
            return r0
    }

    private int getVisibleButtonCount() {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3.getChildCount()
            if (r0 >= r2) goto L1b
            android.view.View r2 = r3.getChildAt(r0)
            boolean r2 = r2 instanceof com.google.android.material.button.MaterialButton
            if (r2 == 0) goto L18
            boolean r2 = r3.m3319d(r0)
            if (r2 == 0) goto L18
            int r1 = r1 + 1
        L18:
            int r0 = r0 + 1
            goto L2
        L1b:
            return r1
    }

    private void setCheckedId(int r2) {
            r1 = this;
            r1.f5925j0 = r2
            r0 = 1
            r1.m3317b(r2, r0)
            return
    }

    private void setGeneratedIdIfNeeded(com.google.android.material.button.MaterialButton r3) {
            r2 = this;
            int r0 = r3.getId()
            r1 = -1
            if (r0 != r1) goto L10
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            int r0 = p227n0.C4661t.d.m10572a()
            r3.setId(r0)
        L10:
            return
    }

    private void setupButtonChild(com.google.android.material.button.MaterialButton r4) {
            r3 = this;
            r0 = 1
            r4.setMaxLines(r0)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r1)
            r4.setCheckable(r0)
            com.google.android.material.button.MaterialButtonToggleGroup$c r1 = r3.f5917b0
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButton$a> r2 = r4.f5902d0
            r2.add(r1)
            com.google.android.material.button.MaterialButtonToggleGroup$f r1 = r3.f5918c0
            r4.m3314x3df6d7c2(r1)
            r4.setShouldDrawSurfaceColorStroke(r0)
            return
    }

    /* renamed from: a */
    public final void m3316a() {
            r9 = this;
            int r0 = r9.getFirstVisibleChildIndex()
            r1 = -1
            if (r0 != r1) goto L8
            return
        L8:
            int r2 = r0 + 1
        La:
            int r3 = r9.getChildCount()
            r4 = 0
            if (r2 >= r3) goto L5a
            com.google.android.material.button.MaterialButton r3 = r9.m3318c(r2)
            int r5 = r2 + (-1)
            com.google.android.material.button.MaterialButton r5 = r9.m3318c(r5)
            int r6 = r3.getStrokeWidth()
            int r5 = r5.getStrokeWidth()
            int r5 = java.lang.Math.min(r6, r5)
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            boolean r7 = r6 instanceof android.widget.LinearLayout.LayoutParams
            if (r7 == 0) goto L32
            android.widget.LinearLayout$LayoutParams r6 = (android.widget.LinearLayout.LayoutParams) r6
            goto L3c
        L32:
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            int r8 = r6.width
            int r6 = r6.height
            r7.<init>(r8, r6)
            r6 = r7
        L3c:
            int r7 = r9.getOrientation()
            if (r7 != 0) goto L4c
            r6.setMarginEnd(r4)
            int r5 = -r5
            r6.setMarginStart(r5)
            r6.topMargin = r4
            goto L54
        L4c:
            r6.bottomMargin = r4
            int r5 = -r5
            r6.topMargin = r5
            r6.setMarginStart(r4)
        L54:
            r3.setLayoutParams(r6)
            int r2 = r2 + 1
            goto La
        L5a:
            int r2 = r9.getChildCount()
            if (r2 == 0) goto L85
            if (r0 != r1) goto L63
            goto L85
        L63:
            android.view.View r0 = r9.getChildAt(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r9.getOrientation()
            r2 = 1
            if (r1 != r2) goto L7b
            r0.topMargin = r4
            r0.bottomMargin = r4
            goto L85
        L7b:
            r0.setMarginEnd(r4)
            r0.setMarginStart(r4)
            r0.leftMargin = r4
            r0.rightMargin = r4
        L85:
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r5, int r6, android.view.ViewGroup.LayoutParams r7) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.material.button.MaterialButton
            if (r0 != 0) goto Lc
            java.lang.String r5 = "MaterialButtonToggleGroup"
            java.lang.String r6 = "Child views must be of type MaterialButton."
            android.util.Log.e(r5, r6)
            return
        Lc:
            super.addView(r5, r6, r7)
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r4.setGeneratedIdIfNeeded(r5)
            r4.setupButtonChild(r5)
            boolean r6 = r5.isChecked()
            if (r6 == 0) goto L2c
            int r6 = r5.getId()
            r7 = 1
            r4.m3321f(r6, r7)
            int r6 = r5.getId()
            r4.setCheckedId(r6)
        L2c:
            t8.i r6 = r5.getShapeAppearanceModel()
            java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$d> r7 = r4.f5916a0
            com.google.android.material.button.MaterialButtonToggleGroup$d r0 = new com.google.android.material.button.MaterialButtonToggleGroup$d
            t8.c r1 = r6.f24086e
            t8.c r2 = r6.f24089h
            t8.c r3 = r6.f24087f
            t8.c r6 = r6.f24088g
            r0.<init>(r1, r2, r3, r6)
            r7.add(r0)
            com.google.android.material.button.MaterialButtonToggleGroup$b r6 = new com.google.android.material.button.MaterialButtonToggleGroup$b
            r6.<init>(r4)
            p227n0.C4661t.m10546v(r5, r6)
            return
    }

    /* renamed from: b */
    public final void m3317b(int r3, boolean r4) {
            r2 = this;
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButtonToggleGroup$e> r0 = r2.f5919d0
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.material.button.MaterialButtonToggleGroup$e r1 = (com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC1143e) r1
            r1.mo3323a(r2, r3, r4)
            goto L6
        L16:
            return
    }

    /* renamed from: c */
    public final com.google.android.material.button.MaterialButton m3318c(int r1) {
            r0 = this;
            android.view.View r1 = r0.getChildAt(r1)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            return r1
    }

    /* renamed from: d */
    public final boolean m3319d(int r2) {
            r1 = this;
            android.view.View r2 = r1.getChildAt(r2)
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 == r0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas r7) {
            r6 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator<com.google.android.material.button.MaterialButton> r1 = r6.f5920e0
            r0.<init>(r1)
            int r1 = r6.getChildCount()
            r2 = 0
            r3 = 0
        Ld:
            if (r3 >= r1) goto L1d
            com.google.android.material.button.MaterialButton r4 = r6.m3318c(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r0.put(r4, r5)
            int r3 = r3 + 1
            goto Ld
        L1d:
            java.util.Collection r0 = r0.values()
            java.lang.Integer[] r1 = new java.lang.Integer[r2]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0
            r6.f5921f0 = r0
            super.dispatchDraw(r7)
            return
    }

    /* renamed from: e */
    public final void m3320e(int r2, boolean r3) {
            r1 = this;
            android.view.View r2 = r1.findViewById(r2)
            boolean r0 = r2 instanceof com.google.android.material.button.MaterialButton
            if (r0 == 0) goto L13
            r0 = 1
            r1.f5922g0 = r0
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            r2.setChecked(r3)
            r2 = 0
            r1.f5922g0 = r2
        L13:
            return
    }

    /* renamed from: f */
    public final boolean m3321f(int r5, boolean r6) {
            r4 = this;
            java.util.List r0 = r4.getCheckedButtonIds()
            boolean r1 = r4.f5924i0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L16
            r4.m3320e(r5, r2)
            r4.f5925j0 = r5
            return r3
        L16:
            if (r6 == 0) goto L3e
            boolean r6 = r4.f5923h0
            if (r6 == 0) goto L3e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.remove(r5)
            java.util.Iterator r5 = r0.iterator()
        L27:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L3e
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.m3320e(r6, r3)
            r4.m3317b(r6, r3)
            goto L27
        L3e:
            return r2
    }

    /* renamed from: g */
    public void m3322g() {
            r11 = this;
            int r0 = r11.getChildCount()
            int r1 = r11.getFirstVisibleChildIndex()
            int r2 = r11.getLastVisibleChildIndex()
            r3 = 0
            r4 = 0
        Le:
            if (r4 >= r0) goto Lbf
            com.google.android.material.button.MaterialButton r5 = r11.m3318c(r4)
            int r6 = r5.getVisibility()
            r7 = 8
            if (r6 != r7) goto L1e
            goto Lbb
        L1e:
            t8.i r6 = r5.getShapeAppearanceModel()
            java.util.Objects.requireNonNull(r6)
            t8.i$b r7 = new t8.i$b
            r7.<init>(r6)
            java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$d> r6 = r11.f5916a0
            java.lang.Object r6 = r6.get(r4)
            com.google.android.material.button.MaterialButtonToggleGroup$d r6 = (com.google.android.material.button.MaterialButtonToggleGroup.C1142d) r6
            if (r1 != r2) goto L36
            goto L9d
        L36:
            int r8 = r11.getOrientation()
            if (r8 != 0) goto L3e
            r8 = 1
            goto L3f
        L3e:
            r8 = 0
        L3f:
            if (r4 != r1) goto L6e
            if (r8 == 0) goto L61
            boolean r8 = p220m8.C4430n.m9886d(r11)
            if (r8 == 0) goto L55
            com.google.android.material.button.MaterialButtonToggleGroup$d r8 = new com.google.android.material.button.MaterialButtonToggleGroup$d
            t8.c r9 = com.google.android.material.button.MaterialButtonToggleGroup.C1142d.f5929e
            t8.c r10 = r6.f5931b
            t8.c r6 = r6.f5932c
            r8.<init>(r9, r9, r10, r6)
            goto L6c
        L55:
            com.google.android.material.button.MaterialButtonToggleGroup$d r8 = new com.google.android.material.button.MaterialButtonToggleGroup$d
            t8.c r9 = r6.f5930a
            t8.c r6 = r6.f5933d
            t8.c r10 = com.google.android.material.button.MaterialButtonToggleGroup.C1142d.f5929e
            r8.<init>(r9, r6, r10, r10)
            goto L6c
        L61:
            com.google.android.material.button.MaterialButtonToggleGroup$d r8 = new com.google.android.material.button.MaterialButtonToggleGroup$d
            t8.c r9 = r6.f5930a
            t8.c r10 = com.google.android.material.button.MaterialButtonToggleGroup.C1142d.f5929e
            t8.c r6 = r6.f5931b
            r8.<init>(r9, r10, r6, r10)
        L6c:
            r6 = r8
            goto L9d
        L6e:
            if (r4 != r2) goto L9c
            if (r8 == 0) goto L90
            boolean r8 = p220m8.C4430n.m9886d(r11)
            if (r8 == 0) goto L84
            com.google.android.material.button.MaterialButtonToggleGroup$d r8 = new com.google.android.material.button.MaterialButtonToggleGroup$d
            t8.c r9 = r6.f5930a
            t8.c r6 = r6.f5933d
            t8.c r10 = com.google.android.material.button.MaterialButtonToggleGroup.C1142d.f5929e
            r8.<init>(r9, r6, r10, r10)
            goto L6c
        L84:
            com.google.android.material.button.MaterialButtonToggleGroup$d r8 = new com.google.android.material.button.MaterialButtonToggleGroup$d
            t8.c r9 = com.google.android.material.button.MaterialButtonToggleGroup.C1142d.f5929e
            t8.c r10 = r6.f5931b
            t8.c r6 = r6.f5932c
            r8.<init>(r9, r9, r10, r6)
            goto L6c
        L90:
            com.google.android.material.button.MaterialButtonToggleGroup$d r8 = new com.google.android.material.button.MaterialButtonToggleGroup$d
            t8.c r9 = com.google.android.material.button.MaterialButtonToggleGroup.C1142d.f5929e
            t8.c r10 = r6.f5933d
            t8.c r6 = r6.f5932c
            r8.<init>(r9, r10, r9, r6)
            goto L6c
        L9c:
            r6 = 0
        L9d:
            if (r6 != 0) goto La4
            r6 = 0
            r7.m12789c(r6)
            goto Lb4
        La4:
            t8.c r8 = r6.f5930a
            r7.f24098e = r8
            t8.c r8 = r6.f5933d
            r7.f24101h = r8
            t8.c r8 = r6.f5931b
            r7.f24099f = r8
            t8.c r6 = r6.f5932c
            r7.f24100g = r6
        Lb4:
            t8.i r6 = r7.m12788a()
            r5.setShapeAppearanceModel(r6)
        Lbb:
            int r4 = r4 + 1
            goto Le
        Lbf:
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            java.lang.Class<com.google.android.material.button.MaterialButtonToggleGroup> r0 = com.google.android.material.button.MaterialButtonToggleGroup.class
            java.lang.String r0 = r0.getName()
            return r0
    }

    public int getCheckedButtonId() {
            r1 = this;
            boolean r0 = r1.f5923h0
            if (r0 == 0) goto L7
            int r0 = r1.f5925j0
            goto L8
        L7:
            r0 = -1
        L8:
            return r0
    }

    public java.util.List<java.lang.Integer> getCheckedButtonIds() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L24
            com.google.android.material.button.MaterialButton r2 = r4.m3318c(r1)
            boolean r3 = r2.isChecked()
            if (r3 == 0) goto L21
            int r2 = r2.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
        L21:
            int r1 = r1 + 1
            goto L6
        L24:
            return r0
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int r2, int r3) {
            r1 = this;
            java.lang.Integer[] r2 = r1.f5921f0
            if (r2 == 0) goto Lf
            int r0 = r2.length
            if (r3 < r0) goto L8
            goto Lf
        L8:
            r2 = r2[r3]
            int r2 = r2.intValue()
            return r2
        Lf:
            java.lang.String r2 = "MaterialButtonToggleGroup"
            java.lang.String r0 = "Child order wasn't updated"
            android.util.Log.w(r2, r0)
            return r3
    }

    @Override // android.view.View
    public void onFinishInflate() {
            r2 = this;
            super.onFinishInflate()
            int r0 = r2.f5925j0
            r1 = -1
            if (r0 == r1) goto L14
            r1 = 1
            android.view.View r0 = r2.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            if (r0 == 0) goto L14
            r0.setChecked(r1)
        L14:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r5) {
            r4 = this;
            super.onInitializeAccessibilityNodeInfo(r5)
            int r0 = r4.getVisibleButtonCount()
            r1 = 0
            boolean r2 = r4.f5923h0
            r3 = 1
            if (r2 == 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 2
        L10:
            o0.b$b r0 = p242o0.C4868b.b.m11001a(r3, r0, r1, r2)
            java.lang.Object r0 = r0.f19352a
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r0
            r5.setCollectionInfo(r0)
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int r1, int r2) {
            r0 = this;
            r0.m3322g()
            r0.m3316a()
            super.onMeasure(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View r4) {
            r3 = this;
            super.onViewRemoved(r4)
            boolean r0 = r4 instanceof com.google.android.material.button.MaterialButton
            if (r0 == 0) goto L15
            r0 = r4
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            com.google.android.material.button.MaterialButtonToggleGroup$c r1 = r3.f5917b0
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButton$a> r2 = r0.f5902d0
            r2.remove(r1)
            r1 = 0
            r0.m3314x3df6d7c2(r1)
        L15:
            int r4 = r3.indexOfChild(r4)
            if (r4 < 0) goto L20
            java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$d> r0 = r3.f5916a0
            r0.remove(r4)
        L20:
            r3.m3322g()
            r3.m3316a()
            return
    }

    public void setSelectionRequired(boolean r1) {
            r0 = this;
            r0.f5924i0 = r1
            return
    }

    public void setSingleSelection(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setSingleSelection(r2)
            return
    }

    public void setSingleSelection(boolean r3) {
            r2 = this;
            boolean r0 = r2.f5923h0
            if (r0 == r3) goto L28
            r2.f5923h0 = r3
            r3 = 1
            r2.f5922g0 = r3
            r3 = 0
            r0 = 0
        Lb:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L22
            com.google.android.material.button.MaterialButton r1 = r2.m3318c(r0)
            r1.setChecked(r3)
            int r1 = r1.getId()
            r2.m3317b(r1, r3)
            int r0 = r0 + 1
            goto Lb
        L22:
            r2.f5922g0 = r3
            r3 = -1
            r2.setCheckedId(r3)
        L28:
            return
    }
}
