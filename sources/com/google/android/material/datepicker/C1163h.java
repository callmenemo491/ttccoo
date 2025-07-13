package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes.dex */
public class C1163h extends p227n0.C4641a {

    /* renamed from: d */
    public final /* synthetic */ com.google.android.material.datepicker.C1161f f6087d;

    public C1163h(com.google.android.material.datepicker.C1161f r1) {
            r0 = this;
            r0.f6087d = r1
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
            com.google.android.material.datepicker.f r3 = r2.f6087d
            android.view.View r3 = r3.f6078e1
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L17
            com.google.android.material.datepicker.f r3 = r2.f6087d
            r0 = 2131951937(0x7f130141, float:1.9540303E38)
            goto L1c
        L17:
            com.google.android.material.datepicker.f r3 = r2.f6087d
            r0 = 2131951935(0x7f13013f, float:1.9540299E38)
        L1c:
            java.lang.String r3 = r3.m1309M(r0)
            r4.m10998k(r3)
            return
    }
}
