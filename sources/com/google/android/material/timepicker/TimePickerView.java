package com.google.android.material.timepicker;

/* loaded from: classes.dex */
class TimePickerView extends androidx.constraintlayout.widget.ConstraintLayout {

    /* renamed from: v0 */
    public static final /* synthetic */ int f6535v0 = 0;

    /* renamed from: r0 */
    public final com.google.android.material.chip.Chip f6536r0;

    /* renamed from: s0 */
    public final com.google.android.material.chip.Chip f6537s0;

    /* renamed from: t0 */
    public final com.google.android.material.button.MaterialButtonToggleGroup f6538t0;

    /* renamed from: u0 */
    public final android.view.View.OnClickListener f6539u0;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    public class ViewOnClickListenerC1225a implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ com.google.android.material.timepicker.TimePickerView f6540Y;

        public ViewOnClickListenerC1225a(com.google.android.material.timepicker.TimePickerView r1) {
                r0 = this;
                r0.f6540Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.google.android.material.timepicker.TimePickerView r2 = r1.f6540Y
                int r0 = com.google.android.material.timepicker.TimePickerView.f6535v0
                java.util.Objects.requireNonNull(r2)
                return
        }
    }

    public TimePickerView(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r0 = 0
            r4.<init>(r5, r6, r0)
            com.google.android.material.timepicker.TimePickerView$a r6 = new com.google.android.material.timepicker.TimePickerView$a
            r6.<init>(r4)
            r4.f6539u0 = r6
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r0 = 2131558503(0x7f0d0067, float:1.8742324E38)
            r5.inflate(r0, r4)
            r5 = 2131362321(0x7f0a0211, float:1.834442E38)
            android.view.View r5 = r4.findViewById(r5)
            com.google.android.material.timepicker.ClockFaceView r5 = (com.google.android.material.timepicker.ClockFaceView) r5
            r5 = 2131362325(0x7f0a0215, float:1.8344427E38)
            android.view.View r5 = r4.findViewById(r5)
            com.google.android.material.button.MaterialButtonToggleGroup r5 = (com.google.android.material.button.MaterialButtonToggleGroup) r5
            r4.f6538t0 = r5
            com.google.android.material.timepicker.d r0 = new com.google.android.material.timepicker.d
            r0.<init>(r4)
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButtonToggleGroup$e> r5 = r5.f5919d0
            r5.add(r0)
            r5 = 2131362330(0x7f0a021a, float:1.8344438E38)
            android.view.View r5 = r4.findViewById(r5)
            com.google.android.material.chip.Chip r5 = (com.google.android.material.chip.Chip) r5
            r4.f6536r0 = r5
            r0 = 2131362327(0x7f0a0217, float:1.8344431E38)
            android.view.View r0 = r4.findViewById(r0)
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
            r4.f6537s0 = r0
            r1 = 2131362322(0x7f0a0212, float:1.8344421E38)
            android.view.View r1 = r4.findViewById(r1)
            com.google.android.material.timepicker.ClockHandView r1 = (com.google.android.material.timepicker.ClockHandView) r1
            android.view.GestureDetector r1 = new android.view.GestureDetector
            android.content.Context r2 = r4.getContext()
            com.google.android.material.timepicker.e r3 = new com.google.android.material.timepicker.e
            r3.<init>(r4)
            r1.<init>(r2, r3)
            com.google.android.material.timepicker.f r2 = new com.google.android.material.timepicker.f
            r2.<init>(r4, r1)
            r5.setOnTouchListener(r2)
            r0.setOnTouchListener(r2)
            r1 = 12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2131362580(0x7f0a0314, float:1.8344945E38)
            r5.setTag(r2, r1)
            r1 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setTag(r2, r1)
            r5.setOnClickListener(r6)
            r0.setOnClickListener(r6)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.m3613s()
            return
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View r1, int r2) {
            r0 = this;
            super.onVisibilityChanged(r1, r2)
            if (r1 != r0) goto La
            if (r2 != 0) goto La
            r0.m3613s()
        La:
            return
    }

    /* renamed from: s */
    public final void m3613s() {
            r4 = this;
            com.google.android.material.button.MaterialButtonToggleGroup r0 = r4.f6538t0
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L31
            androidx.constraintlayout.widget.b r0 = new androidx.constraintlayout.widget.b
            r0.<init>()
            r0.m946e(r4)
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            int r1 = p227n0.C4661t.d.m10575d(r4)
            r2 = 1
            if (r1 != 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r1 == 0) goto L20
            r1 = 2
            goto L21
        L20:
            r1 = 1
        L21:
            r3 = 2131362320(0x7f0a0210, float:1.8344417E38)
            r0.m945d(r3, r1)
            r0.m944c(r4, r2)
            r0 = 0
            r4.setConstraintSet(r0)
            r4.requestLayout()
        L31:
            return
    }
}
