package com.google.android.material.timepicker;

/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: classes.dex */
public class C1227b extends p227n0.C4641a {

    /* renamed from: d */
    public final /* synthetic */ com.google.android.material.timepicker.ClockFaceView f6542d;

    public C1227b(com.google.android.material.timepicker.ClockFaceView r1) {
            r0 = this;
            r0.f6542d = r1
            r0.<init>()
            return
    }

    @Override // p227n0.C4641a
    /* renamed from: d */
    public void mo1040d(android.view.View r8, p242o0.C4868b r9) {
            r7 = this;
            android.view.View$AccessibilityDelegate r0 = r7.f18502a
            android.view.accessibility.AccessibilityNodeInfo r1 = r9.f19337a
            r0.onInitializeAccessibilityNodeInfo(r8, r1)
            r0 = 2131362338(0x7f0a0222, float:1.8344454E38)
            java.lang.Object r0 = r8.getTag(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r3 = r0.intValue()
            if (r3 <= 0) goto L2d
            com.google.android.material.timepicker.ClockFaceView r0 = r7.f6542d
            android.util.SparseArray<android.widget.TextView> r0 = r0.f6516x0
            int r1 = r3 + (-1)
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 22
            if (r1 < r2) goto L2d
            android.view.accessibility.AccessibilityNodeInfo r1 = r9.f19337a
            r1.setTraversalAfter(r0)
        L2d:
            r1 = 0
            r2 = 1
            r4 = 1
            r5 = 0
            boolean r6 = r8.isSelected()
            o0.b$c r8 = p242o0.C4868b.c.m11002a(r1, r2, r3, r4, r5, r6)
            r9.m10997j(r8)
            return
    }
}
