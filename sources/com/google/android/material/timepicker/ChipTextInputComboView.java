package com.google.android.material.timepicker;

/* loaded from: classes.dex */
class ChipTextInputComboView extends android.widget.FrameLayout implements android.widget.Checkable {

    /* renamed from: a0 */
    public final com.google.android.material.chip.Chip f6502a0;

    /* renamed from: b0 */
    public final android.widget.EditText f6503b0;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$a */
    public static /* synthetic */ class C1220a {
    }

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    public class C1221b extends p220m8.C4428l {

        /* renamed from: Y */
        public final /* synthetic */ com.google.android.material.timepicker.ChipTextInputComboView f6504Y;

        public C1221b(com.google.android.material.timepicker.ChipTextInputComboView r1, com.google.android.material.timepicker.ChipTextInputComboView.C1220a r2) {
                r0 = this;
                r0.f6504Y = r1
                r0.<init>()
                return
        }

        @Override // p220m8.C4428l, android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r3) {
                r2 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 == 0) goto L14
                com.google.android.material.timepicker.ChipTextInputComboView r3 = r2.f6504Y
                com.google.android.material.chip.Chip r0 = r3.f6502a0
                java.lang.String r1 = "00"
                java.lang.String r3 = com.google.android.material.timepicker.ChipTextInputComboView.m3606a(r3, r1)
                r0.setText(r3)
                return
            L14:
                com.google.android.material.timepicker.ChipTextInputComboView r0 = r2.f6504Y
                com.google.android.material.chip.Chip r1 = r0.f6502a0
                java.lang.String r3 = com.google.android.material.timepicker.ChipTextInputComboView.m3606a(r0, r3)
                r1.setText(r3)
                return
        }
    }

    public ChipTextInputComboView(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r0 = 0
            r4.<init>(r5, r6, r0)
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r6 = 2131558501(0x7f0d0065, float:1.874232E38)
            android.view.View r6 = r5.inflate(r6, r4, r0)
            com.google.android.material.chip.Chip r6 = (com.google.android.material.chip.Chip) r6
            r4.f6502a0 = r6
            r1 = 2131558502(0x7f0d0066, float:1.8742322E38)
            android.view.View r5 = r5.inflate(r1, r4, r0)
            com.google.android.material.textfield.TextInputLayout r5 = (com.google.android.material.textfield.TextInputLayout) r5
            android.widget.EditText r1 = r5.getEditText()
            r4.f6503b0 = r1
            r2 = 4
            r1.setVisibility(r2)
            com.google.android.material.timepicker.ChipTextInputComboView$b r2 = new com.google.android.material.timepicker.ChipTextInputComboView$b
            r3 = 0
            r2.<init>(r4, r3)
            r1.addTextChangedListener(r2)
            r4.m3607b()
            r4.addView(r6)
            r4.addView(r5)
            r5 = 2131362328(0x7f0a0218, float:1.8344433E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1.setSaveEnabled(r0)
            return
    }

    /* renamed from: a */
    public static java.lang.String m3606a(com.google.android.material.timepicker.ChipTextInputComboView r2, java.lang.CharSequence r3) {
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.util.Locale r2 = r2.locale
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "%02d"
            java.lang.String r2 = java.lang.String.format(r2, r3, r0)
            return r2
    }

    /* renamed from: b */
    public final void m3607b() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L1b
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.os.LocaleList r0 = r0.getLocales()
            android.widget.EditText r1 = r2.f6503b0
            r1.setImeHintLocales(r0)
        L1b:
            return
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.f6502a0
            boolean r0 = r0.isChecked()
            return r0
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            r0.m3607b()
            return
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r4) {
            r3 = this;
            com.google.android.material.chip.Chip r0 = r3.f6502a0
            r0.setChecked(r4)
            android.widget.EditText r0 = r3.f6503b0
            r1 = 0
            if (r4 == 0) goto Lc
            r2 = 0
            goto Ld
        Lc:
            r2 = 4
        Ld:
            r0.setVisibility(r2)
            com.google.android.material.chip.Chip r0 = r3.f6502a0
            if (r4 == 0) goto L16
            r1 = 8
        L16:
            r0.setVisibility(r1)
            boolean r4 = r3.isChecked()
            if (r4 == 0) goto L3d
            android.widget.EditText r4 = r3.f6503b0
            r4.requestFocus()
            android.widget.EditText r4 = r3.f6503b0
            android.text.Editable r4 = r4.getText()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L3d
            android.widget.EditText r4 = r3.f6503b0
            android.text.Editable r0 = r4.getText()
            int r0 = r0.length()
            r4.setSelection(r0)
        L3d:
            return
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.f6502a0
            r0.setOnClickListener(r2)
            return
    }

    @Override // android.view.View
    public void setTag(int r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.f6502a0
            r0.setTag(r2, r3)
            return
    }

    @Override // android.widget.Checkable
    public void toggle() {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.f6502a0
            r0.toggle()
            return
    }
}
