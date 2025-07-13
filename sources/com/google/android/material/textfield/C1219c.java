package com.google.android.material.textfield;

/* renamed from: com.google.android.material.textfield.c */
/* loaded from: classes.dex */
public class C1219c extends p410x8.AbstractC6970k {

    /* renamed from: d */
    public final android.text.TextWatcher f6493d;

    /* renamed from: e */
    public final com.google.android.material.textfield.TextInputLayout.InterfaceC1214f f6494e;

    /* renamed from: f */
    public final com.google.android.material.textfield.TextInputLayout.InterfaceC1215g f6495f;

    /* renamed from: com.google.android.material.textfield.c$a */
    public class a extends p220m8.C4428l {

        /* renamed from: Y */
        public final /* synthetic */ com.google.android.material.textfield.C1219c f6496Y;

        public a(com.google.android.material.textfield.C1219c r1) {
                r0 = this;
                r0.f6496Y = r1
                r0.<init>()
                return
        }

        @Override // p220m8.C4428l, android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                com.google.android.material.textfield.c r1 = r0.f6496Y
                com.google.android.material.internal.CheckableImageButton r2 = r1.f27218c
                boolean r1 = com.google.android.material.textfield.C1219c.m3598d(r1)
                r1 = r1 ^ 1
                r2.setChecked(r1)
                return
        }
    }

    /* renamed from: com.google.android.material.textfield.c$b */
    public class b implements com.google.android.material.textfield.TextInputLayout.InterfaceC1214f {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.textfield.C1219c f6497a;

        public b(com.google.android.material.textfield.C1219c r1) {
                r0 = this;
                r0.f6497a = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC1214f
        /* renamed from: a */
        public void mo3586a(com.google.android.material.textfield.TextInputLayout r4) {
                r3 = this;
                android.widget.EditText r0 = r4.getEditText()
                r1 = 1
                r4.setEndIconVisible(r1)
                r4.setEndIconCheckable(r1)
                com.google.android.material.textfield.c r4 = r3.f6497a
                com.google.android.material.internal.CheckableImageButton r2 = r4.f27218c
                boolean r4 = com.google.android.material.textfield.C1219c.m3598d(r4)
                r4 = r4 ^ r1
                r2.setChecked(r4)
                com.google.android.material.textfield.c r4 = r3.f6497a
                android.text.TextWatcher r4 = r4.f6493d
                r0.removeTextChangedListener(r4)
                com.google.android.material.textfield.c r4 = r3.f6497a
                android.text.TextWatcher r4 = r4.f6493d
                r0.addTextChangedListener(r4)
                return
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c */
    public class c implements com.google.android.material.textfield.TextInputLayout.InterfaceC1215g {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.textfield.C1219c f6498a;

        /* renamed from: com.google.android.material.textfield.c$c$a */
        public class a implements java.lang.Runnable {

            /* renamed from: Y */
            public final /* synthetic */ android.widget.EditText f6499Y;

            /* renamed from: Z */
            public final /* synthetic */ com.google.android.material.textfield.C1219c.c f6500Z;

            public a(com.google.android.material.textfield.C1219c.c r1, android.widget.EditText r2) {
                    r0 = this;
                    r0.f6500Z = r1
                    r0.f6499Y = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    android.widget.EditText r0 = r2.f6499Y
                    com.google.android.material.textfield.c$c r1 = r2.f6500Z
                    com.google.android.material.textfield.c r1 = r1.f6498a
                    android.text.TextWatcher r1 = r1.f6493d
                    r0.removeTextChangedListener(r1)
                    return
            }
        }

        public c(com.google.android.material.textfield.C1219c r1) {
                r0 = this;
                r0.f6498a = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC1215g
        /* renamed from: a */
        public void mo3587a(com.google.android.material.textfield.TextInputLayout r2, int r3) {
                r1 = this;
                android.widget.EditText r2 = r2.getEditText()
                if (r2 == 0) goto L18
                r0 = 1
                if (r3 != r0) goto L18
                android.text.method.PasswordTransformationMethod r3 = android.text.method.PasswordTransformationMethod.getInstance()
                r2.setTransformationMethod(r3)
                com.google.android.material.textfield.c$c$a r3 = new com.google.android.material.textfield.c$c$a
                r3.<init>(r1, r2)
                r2.post(r3)
            L18:
                return
        }
    }

    /* renamed from: com.google.android.material.textfield.c$d */
    public class d implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ com.google.android.material.textfield.C1219c f6501Y;

        public d(com.google.android.material.textfield.C1219c r1) {
                r0 = this;
                r0.f6501Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.google.android.material.textfield.c r3 = r2.f6501Y
                com.google.android.material.textfield.TextInputLayout r3 = r3.f27216a
                android.widget.EditText r3 = r3.getEditText()
                if (r3 != 0) goto Lb
                return
            Lb:
                int r0 = r3.getSelectionEnd()
                com.google.android.material.textfield.c r1 = r2.f6501Y
                boolean r1 = com.google.android.material.textfield.C1219c.m3598d(r1)
                if (r1 == 0) goto L19
                r1 = 0
                goto L1d
            L19:
                android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            L1d:
                r3.setTransformationMethod(r1)
                if (r0 < 0) goto L25
                r3.setSelection(r0)
            L25:
                com.google.android.material.textfield.c r3 = r2.f6501Y
                com.google.android.material.textfield.TextInputLayout r3 = r3.f27216a
                r3.m3567o()
                return
        }
    }

    public C1219c(com.google.android.material.textfield.TextInputLayout r1) {
            r0 = this;
            r0.<init>(r1)
            com.google.android.material.textfield.c$a r1 = new com.google.android.material.textfield.c$a
            r1.<init>(r0)
            r0.f6493d = r1
            com.google.android.material.textfield.c$b r1 = new com.google.android.material.textfield.c$b
            r1.<init>(r0)
            r0.f6494e = r1
            com.google.android.material.textfield.c$c r1 = new com.google.android.material.textfield.c$c
            r1.<init>(r0)
            r0.f6495f = r1
            return
    }

    /* renamed from: d */
    public static boolean m3598d(com.google.android.material.textfield.C1219c r0) {
            com.google.android.material.textfield.TextInputLayout r0 = r0.f27216a
            android.widget.EditText r0 = r0.getEditText()
            if (r0 == 0) goto L12
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // p410x8.AbstractC6970k
    /* renamed from: a */
    public void mo3588a() {
            r3 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r3.f27216a
            android.content.Context r1 = r3.f27217b
            r2 = 2131230911(0x7f0800bf, float:1.8077888E38)
            android.graphics.drawable.Drawable r1 = p102g.C2199a.m5784b(r1, r2)
            r0.setEndIconDrawable(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.f27216a
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131951956(0x7f130154, float:1.9540341E38)
            java.lang.CharSequence r1 = r1.getText(r2)
            r0.setEndIconContentDescription(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.f27216a
            com.google.android.material.textfield.c$d r1 = new com.google.android.material.textfield.c$d
            r1.<init>(r3)
            r0.setEndIconOnClickListener(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.f27216a
            com.google.android.material.textfield.TextInputLayout$f r1 = r3.f6494e
            r0.m3552a(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.f27216a
            com.google.android.material.textfield.TextInputLayout$g r1 = r3.f6495f
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$g> r0 = r0.f6406f1
            r0.add(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.f27216a
            android.widget.EditText r0 = r0.getEditText()
            if (r0 == 0) goto L62
            int r1 = r0.getInputType()
            r2 = 16
            if (r1 == r2) goto L60
            int r1 = r0.getInputType()
            r2 = 128(0x80, float:1.8E-43)
            if (r1 == r2) goto L60
            int r1 = r0.getInputType()
            r2 = 144(0x90, float:2.02E-43)
            if (r1 == r2) goto L60
            int r1 = r0.getInputType()
            r2 = 224(0xe0, float:3.14E-43)
            if (r1 != r2) goto L62
        L60:
            r1 = 1
            goto L63
        L62:
            r1 = 0
        L63:
            if (r1 == 0) goto L6c
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            r0.setTransformationMethod(r1)
        L6c:
            return
    }
}
