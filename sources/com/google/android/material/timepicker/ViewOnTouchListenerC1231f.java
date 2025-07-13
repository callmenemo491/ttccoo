package com.google.android.material.timepicker;

/* renamed from: com.google.android.material.timepicker.f */
/* loaded from: classes.dex */
public class ViewOnTouchListenerC1231f implements android.view.View.OnTouchListener {

    /* renamed from: Y */
    public final /* synthetic */ android.view.GestureDetector f6549Y;

    public ViewOnTouchListenerC1231f(com.google.android.material.timepicker.TimePickerView r1, android.view.GestureDetector r2) {
            r0 = this;
            r0.f6549Y = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r1, android.view.MotionEvent r2) {
            r0 = this;
            android.widget.Checkable r1 = (android.widget.Checkable) r1
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto Lf
            android.view.GestureDetector r1 = r0.f6549Y
            boolean r1 = r1.onTouchEvent(r2)
            return r1
        Lf:
            r1 = 0
            return r1
    }
}
