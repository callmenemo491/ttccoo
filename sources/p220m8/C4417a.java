package p220m8;

/* renamed from: m8.a */
/* loaded from: classes.dex */
public class C4417a extends p227n0.C4641a {

    /* renamed from: d */
    public final /* synthetic */ com.google.android.material.internal.CheckableImageButton f17993d;

    public C4417a(com.google.android.material.internal.CheckableImageButton r1) {
            r0 = this;
            r0.f17993d = r1
            r0.<init>()
            return
    }

    @Override // p227n0.C4641a
    /* renamed from: c */
    public void mo1039c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = r1.f18502a
            r0.onInitializeAccessibilityEvent(r2, r3)
            com.google.android.material.internal.CheckableImageButton r2 = r1.f17993d
            boolean r2 = r2.isChecked()
            r3.setChecked(r2)
            return
    }

    @Override // p227n0.C4641a
    /* renamed from: d */
    public void mo1040d(android.view.View r3, p242o0.C4868b r4) {
            r2 = this;
            android.view.View$AccessibilityDelegate r0 = r2.f18502a
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.f19337a
            r0.onInitializeAccessibilityNodeInfo(r3, r1)
            com.google.android.material.internal.CheckableImageButton r3 = r2.f17993d
            boolean r3 = r3.f6237d0
            android.view.accessibility.AccessibilityNodeInfo r0 = r4.f19337a
            r0.setCheckable(r3)
            com.google.android.material.internal.CheckableImageButton r3 = r2.f17993d
            boolean r3 = r3.isChecked()
            android.view.accessibility.AccessibilityNodeInfo r4 = r4.f19337a
            r4.setChecked(r3)
            return
    }
}
