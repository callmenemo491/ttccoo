package p109g6;

/* renamed from: g6.c */
/* loaded from: classes.dex */
public final class C2294c extends android.view.View.AccessibilityDelegate {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.gms.cast.framework.media.widget.CastSeekBar f10515a;

    public /* synthetic */ C2294c(com.google.android.gms.cast.framework.media.widget.CastSeekBar r1) {
            r0 = this;
            r0.f10515a = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            super.onInitializeAccessibilityEvent(r1, r2)
            java.lang.Class<android.widget.SeekBar> r1 = android.widget.SeekBar.class
            java.lang.String r1 = r1.getName()
            r2.setClassName(r1)
            com.google.android.gms.cast.framework.media.widget.CastSeekBar r1 = r0.f10515a
            g6.b r1 = r1.f5514a0
            int r1 = r1.f10514a
            r2.setItemCount(r1)
            com.google.android.gms.cast.framework.media.widget.CastSeekBar r1 = r0.f10515a
            int r1 = r1.getProgress()
            r2.setCurrentItemIndex(r1)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    @android.annotation.TargetApi(16)
    public final void onInitializeAccessibilityNodeInfo(android.view.View r2, android.view.accessibility.AccessibilityNodeInfo r3) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2, r3)
            java.lang.Class<android.widget.SeekBar> r0 = android.widget.SeekBar.class
            java.lang.String r0 = r0.getName()
            r3.setClassName(r0)
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L1c
            r2 = 4096(0x1000, float:5.74E-42)
            r3.addAction(r2)
            r2 = 8192(0x2000, float:1.148E-41)
            r3.addAction(r2)
        L1c:
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    @android.annotation.TargetApi(16)
    public final boolean performAccessibilityAction(android.view.View r3, int r4, android.os.Bundle r5) {
            r2 = this;
            boolean r0 = r3.isEnabled()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r3 = super.performAccessibilityAction(r3, r4, r5)
            if (r3 == 0) goto L10
            r3 = 1
            return r3
        L10:
            r3 = 4096(0x1000, float:5.74E-42)
            if (r4 == r3) goto L19
            r3 = 8192(0x2000, float:1.148E-41)
            if (r4 == r3) goto L19
            goto L35
        L19:
            com.google.android.gms.cast.framework.media.widget.CastSeekBar r3 = r2.f10515a
            int r4 = com.google.android.gms.cast.framework.media.widget.CastSeekBar.f5513k0
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.cast.framework.media.widget.CastSeekBar r3 = r2.f10515a
            g6.b r4 = r3.f5514a0
            int r4 = r4.f10514a
            int r4 = r4 / 20
            r3.getProgress()
            g6.b r3 = r3.f5514a0
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.cast.framework.media.widget.CastSeekBar r3 = r2.f10515a
            java.util.Objects.requireNonNull(r3)
        L35:
            return r1
    }
}
