package com.google.android.material.timepicker;

/* renamed from: com.google.android.material.timepicker.a */
/* loaded from: classes.dex */
public class ViewTreeObserverOnPreDrawListenerC1226a implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: Y */
    public final /* synthetic */ com.google.android.material.timepicker.ClockFaceView f6541Y;

    public ViewTreeObserverOnPreDrawListenerC1226a(com.google.android.material.timepicker.ClockFaceView r1) {
            r0 = this;
            r0.f6541Y = r1
            r0.<init>()
            return
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
            r4 = this;
            com.google.android.material.timepicker.ClockFaceView r0 = r4.f6541Y
            boolean r0 = r0.isShown()
            r1 = 1
            if (r0 != 0) goto La
            return r1
        La:
            com.google.android.material.timepicker.ClockFaceView r0 = r4.f6541Y
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnPreDrawListener(r4)
            com.google.android.material.timepicker.ClockFaceView r0 = r4.f6541Y
            int r0 = r0.getHeight()
            int r0 = r0 / 2
            com.google.android.material.timepicker.ClockFaceView r2 = r4.f6541Y
            com.google.android.material.timepicker.ClockHandView r3 = r2.f6513u0
            int r3 = r3.f6525f0
            int r0 = r0 - r3
            int r3 = r2.f6506B0
            int r0 = r0 - r3
            int r3 = r2.f6544s0
            if (r0 == r3) goto L37
            r2.f6544s0 = r0
            r2.m3614s()
            com.google.android.material.timepicker.ClockHandView r0 = r2.f6513u0
            int r2 = r2.f6544s0
            r0.f6533n0 = r2
            r0.invalidate()
        L37:
            return r1
    }
}
