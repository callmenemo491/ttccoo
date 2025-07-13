package com.google.android.material.transformation;

@java.lang.Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends com.google.android.material.transformation.FabTransformationBehavior {

    /* renamed from: i */
    public java.util.Map<android.view.View, java.lang.Integer> f6572i;

    public FabTransformationSheetBehavior() {
            r0 = this;
            r0.<init>()
            return
    }

    public FabTransformationSheetBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: A */
    public com.google.android.material.transformation.FabTransformationBehavior.C1235b mo3618A(android.content.Context r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto L6
            r4 = 2130837529(0x7f020019, float:1.7280015E38)
            goto L9
        L6:
            r4 = 2130837528(0x7f020018, float:1.7280013E38)
        L9:
            com.google.android.material.transformation.FabTransformationBehavior$b r0 = new com.google.android.material.transformation.FabTransformationBehavior$b
            r0.<init>()
            u7.g r3 = p354u7.C6356g.m13007b(r3, r4)
            r0.f6566a = r3
            u7.i r3 = new u7.i
            r4 = 17
            r1 = 0
            r3.<init>(r4, r1, r1)
            r0.f6567b = r3
            return r0
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: t */
    public boolean mo3616t(android.view.View r9, android.view.View r10, boolean r11, boolean r12) {
            r8 = this;
            android.view.ViewParent r0 = r10.getParent()
            boolean r1 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r2 = 1
            if (r1 != 0) goto La
            goto L6f
        La:
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            int r1 = r0.getChildCount()
            if (r11 == 0) goto L19
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>(r1)
            r8.f6572i = r3
        L19:
            r3 = 0
            r4 = 0
        L1b:
            if (r4 >= r1) goto L6a
            android.view.View r5 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            boolean r6 = r6 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f
            if (r6 == 0) goto L37
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f1930a
            boolean r6 = r6 instanceof com.google.android.material.transformation.FabTransformationScrimBehavior
            if (r6 == 0) goto L37
            r6 = 1
            goto L38
        L37:
            r6 = 0
        L38:
            if (r5 == r10) goto L67
            if (r6 == 0) goto L3d
            goto L67
        L3d:
            java.util.Map<android.view.View, java.lang.Integer> r6 = r8.f6572i
            if (r11 != 0) goto L56
            if (r6 == 0) goto L67
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L67
            java.util.Map<android.view.View, java.lang.Integer> r6 = r8.f6572i
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L62
        L56:
            int r7 = r5.getImportantForAccessibility()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.put(r5, r7)
            r6 = 4
        L62:
            java.util.WeakHashMap<android.view.View, n0.w> r7 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10571s(r5, r6)
        L67:
            int r4 = r4 + 1
            goto L1b
        L6a:
            if (r11 != 0) goto L6f
            r0 = 0
            r8.f6572i = r0
        L6f:
            super.mo3616t(r9, r10, r11, r12)
            return r2
    }
}
