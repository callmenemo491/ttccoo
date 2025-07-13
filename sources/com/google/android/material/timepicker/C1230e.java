package com.google.android.material.timepicker;

/* renamed from: com.google.android.material.timepicker.e */
/* loaded from: classes.dex */
public class C1230e extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: Y */
    public final /* synthetic */ com.google.android.material.timepicker.TimePickerView f6548Y;

    public C1230e(com.google.android.material.timepicker.TimePickerView r1) {
            r0 = this;
            r0.f6548Y = r1
            r0.<init>()
            return
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent r3) {
            r2 = this;
            boolean r3 = super.onDoubleTap(r3)
            com.google.android.material.timepicker.TimePickerView r0 = r2.f6548Y
            int r1 = com.google.android.material.timepicker.TimePickerView.f6535v0
            java.util.Objects.requireNonNull(r0)
            return r3
    }
}
