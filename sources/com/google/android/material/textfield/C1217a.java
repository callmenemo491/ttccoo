package com.google.android.material.textfield;

/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes.dex */
public class C1217a extends p410x8.AbstractC6970k {

    /* renamed from: d */
    public final android.text.TextWatcher f6457d;

    /* renamed from: e */
    public final android.view.View.OnFocusChangeListener f6458e;

    /* renamed from: f */
    public final com.google.android.material.textfield.TextInputLayout.InterfaceC1214f f6459f;

    /* renamed from: g */
    public final com.google.android.material.textfield.TextInputLayout.InterfaceC1215g f6460g;

    /* renamed from: h */
    public android.animation.AnimatorSet f6461h;

    /* renamed from: i */
    public android.animation.ValueAnimator f6462i;

    /* renamed from: com.google.android.material.textfield.a$a */
    public class a implements android.text.TextWatcher {

        /* renamed from: Y */
        public final /* synthetic */ com.google.android.material.textfield.C1217a f6463Y;

        public a(com.google.android.material.textfield.C1217a r1) {
                r0 = this;
                r0.f6463Y = r1
                r0.<init>()
                return
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r5) {
                r4 = this;
                com.google.android.material.textfield.a r0 = r4.f6463Y
                com.google.android.material.textfield.TextInputLayout r0 = r0.f27216a
                java.lang.CharSequence r0 = r0.getSuffixText()
                if (r0 == 0) goto Lb
                return
            Lb:
                com.google.android.material.textfield.a r0 = r4.f6463Y
                com.google.android.material.textfield.TextInputLayout r1 = r0.f27216a
                boolean r1 = r1.hasFocus()
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L23
                int r5 = r5.length()
                if (r5 <= 0) goto L1f
                r5 = 1
                goto L20
            L1f:
                r5 = 0
            L20:
                if (r5 == 0) goto L23
                r2 = 1
            L23:
                r0.m3590d(r2)
                return
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    public class b implements android.view.View.OnFocusChangeListener {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.textfield.C1217a f6464a;

        public b(com.google.android.material.textfield.C1217a r1) {
                r0 = this;
                r0.f6464a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View r3, boolean r4) {
                r2 = this;
                android.widget.EditText r3 = (android.widget.EditText) r3
                android.text.Editable r3 = r3.getText()
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                r0 = 1
                r3 = r3 ^ r0
                com.google.android.material.textfield.a r1 = r2.f6464a
                if (r3 == 0) goto L13
                if (r4 == 0) goto L13
                goto L14
            L13:
                r0 = 0
            L14:
                r1.m3590d(r0)
                return
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    public class c implements com.google.android.material.textfield.TextInputLayout.InterfaceC1214f {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.textfield.C1217a f6465a;

        public c(com.google.android.material.textfield.C1217a r1) {
                r0 = this;
                r0.f6465a = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC1214f
        /* renamed from: a */
        public void mo3586a(com.google.android.material.textfield.TextInputLayout r5) {
                r4 = this;
                android.widget.EditText r0 = r5.getEditText()
                boolean r1 = r0.hasFocus()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1c
                android.text.Editable r1 = r0.getText()
                int r1 = r1.length()
                if (r1 <= 0) goto L18
                r1 = 1
                goto L19
            L18:
                r1 = 0
            L19:
                if (r1 == 0) goto L1c
                goto L1d
            L1c:
                r2 = 0
            L1d:
                r5.setEndIconVisible(r2)
                r5.setEndIconCheckable(r3)
                com.google.android.material.textfield.a r5 = r4.f6465a
                android.view.View$OnFocusChangeListener r5 = r5.f6458e
                r0.setOnFocusChangeListener(r5)
                com.google.android.material.textfield.a r5 = r4.f6465a
                android.text.TextWatcher r5 = r5.f6457d
                r0.removeTextChangedListener(r5)
                com.google.android.material.textfield.a r5 = r4.f6465a
                android.text.TextWatcher r5 = r5.f6457d
                r0.addTextChangedListener(r5)
                return
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    public class d implements com.google.android.material.textfield.TextInputLayout.InterfaceC1215g {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.textfield.C1217a f6466a;

        /* renamed from: com.google.android.material.textfield.a$d$a */
        public class a implements java.lang.Runnable {

            /* renamed from: Y */
            public final /* synthetic */ android.widget.EditText f6467Y;

            /* renamed from: Z */
            public final /* synthetic */ com.google.android.material.textfield.C1217a.d f6468Z;

            public a(com.google.android.material.textfield.C1217a.d r1, android.widget.EditText r2) {
                    r0 = this;
                    r0.f6468Z = r1
                    r0.f6467Y = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    android.widget.EditText r0 = r2.f6467Y
                    com.google.android.material.textfield.a$d r1 = r2.f6468Z
                    com.google.android.material.textfield.a r1 = r1.f6466a
                    android.text.TextWatcher r1 = r1.f6457d
                    r0.removeTextChangedListener(r1)
                    return
            }
        }

        public d(com.google.android.material.textfield.C1217a r1) {
                r0 = this;
                r0.f6466a = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC1215g
        /* renamed from: a */
        public void mo3587a(com.google.android.material.textfield.TextInputLayout r2, int r3) {
                r1 = this;
                android.widget.EditText r2 = r2.getEditText()
                if (r2 == 0) goto L1f
                r0 = 2
                if (r3 != r0) goto L1f
                com.google.android.material.textfield.a$d$a r3 = new com.google.android.material.textfield.a$d$a
                r3.<init>(r1, r2)
                r2.post(r3)
                android.view.View$OnFocusChangeListener r3 = r2.getOnFocusChangeListener()
                com.google.android.material.textfield.a r0 = r1.f6466a
                android.view.View$OnFocusChangeListener r0 = r0.f6458e
                if (r3 != r0) goto L1f
                r3 = 0
                r2.setOnFocusChangeListener(r3)
            L1f:
                return
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    public class e implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ com.google.android.material.textfield.C1217a f6469Y;

        public e(com.google.android.material.textfield.C1217a r1) {
                r0 = this;
                r0.f6469Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.google.android.material.textfield.a r1 = r0.f6469Y
                com.google.android.material.textfield.TextInputLayout r1 = r1.f27216a
                android.widget.EditText r1 = r1.getEditText()
                android.text.Editable r1 = r1.getText()
                if (r1 == 0) goto L11
                r1.clear()
            L11:
                com.google.android.material.textfield.a r1 = r0.f6469Y
                com.google.android.material.textfield.TextInputLayout r1 = r1.f27216a
                r1.m3567o()
                return
        }
    }

    public C1217a(com.google.android.material.textfield.TextInputLayout r1) {
            r0 = this;
            r0.<init>(r1)
            com.google.android.material.textfield.a$a r1 = new com.google.android.material.textfield.a$a
            r1.<init>(r0)
            r0.f6457d = r1
            com.google.android.material.textfield.a$b r1 = new com.google.android.material.textfield.a$b
            r1.<init>(r0)
            r0.f6458e = r1
            com.google.android.material.textfield.a$c r1 = new com.google.android.material.textfield.a$c
            r1.<init>(r0)
            r0.f6459f = r1
            com.google.android.material.textfield.a$d r1 = new com.google.android.material.textfield.a$d
            r1.<init>(r0)
            r0.f6460g = r1
            return
    }

    @Override // p410x8.AbstractC6970k
    /* renamed from: a */
    public void mo3588a() {
            r9 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r9.f27216a
            android.content.Context r1 = r9.f27217b
            r2 = 2131231329(0x7f080261, float:1.8078736E38)
            android.graphics.drawable.Drawable r1 = p102g.C2199a.m5784b(r1, r2)
            r0.setEndIconDrawable(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r9.f27216a
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131951720(0x7f130068, float:1.9539862E38)
            java.lang.CharSequence r1 = r1.getText(r2)
            r0.setEndIconContentDescription(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r9.f27216a
            com.google.android.material.textfield.a$e r1 = new com.google.android.material.textfield.a$e
            r1.<init>(r9)
            r0.setEndIconOnClickListener(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r9.f27216a
            com.google.android.material.textfield.TextInputLayout$f r1 = r9.f6459f
            r0.m3552a(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r9.f27216a
            com.google.android.material.textfield.TextInputLayout$g r1 = r9.f6460g
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$g> r0 = r0.f6406f1
            r0.add(r1)
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x00ae: FILL_ARRAY_DATA , data: [1061997773, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            android.animation.TimeInterpolator r2 = p354u7.C6350a.f24806d
            r1.setInterpolator(r2)
            r2 = 150(0x96, double:7.4E-322)
            r1.setDuration(r2)
            x8.d r2 = new x8.d
            r2.<init>(r9)
            r1.addUpdateListener(r2)
            float[] r2 = new float[r0]
            r2 = {x00b6: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            android.animation.TimeInterpolator r3 = p354u7.C6350a.f24803a
            r2.setInterpolator(r3)
            r4 = 100
            r2.setDuration(r4)
            x8.c r6 = new x8.c
            r6.<init>(r9)
            r2.addUpdateListener(r6)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            r9.f6461h = r6
            android.animation.Animator[] r7 = new android.animation.Animator[r0]
            r8 = 0
            r7[r8] = r1
            r1 = 1
            r7[r1] = r2
            r6.playTogether(r7)
            android.animation.AnimatorSet r1 = r9.f6461h
            x8.a r2 = new x8.a
            r2.<init>(r9)
            r1.addListener(r2)
            float[] r0 = new float[r0]
            r0 = {x00be: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r0.setInterpolator(r3)
            r0.setDuration(r4)
            x8.c r1 = new x8.c
            r1.<init>(r9)
            r0.addUpdateListener(r1)
            r9.f6462i = r0
            x8.b r1 = new x8.b
            r1.<init>(r9)
            r0.addListener(r1)
            return
    }

    @Override // p410x8.AbstractC6970k
    /* renamed from: c */
    public void mo3589c(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r1.f27216a
            java.lang.CharSequence r0 = r0.getSuffixText()
            if (r0 != 0) goto L9
            return
        L9:
            r1.m3590d(r2)
            return
    }

    /* renamed from: d */
    public final void m3590d(boolean r3) {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.f27216a
            boolean r0 = r0.m3564k()
            if (r0 != r3) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r3 == 0) goto L27
            android.animation.AnimatorSet r1 = r2.f6461h
            boolean r1 = r1.isRunning()
            if (r1 != 0) goto L27
            android.animation.ValueAnimator r3 = r2.f6462i
            r3.cancel()
            android.animation.AnimatorSet r3 = r2.f6461h
            r3.start()
            if (r0 == 0) goto L3a
            android.animation.AnimatorSet r3 = r2.f6461h
            r3.end()
            goto L3a
        L27:
            if (r3 != 0) goto L3a
            android.animation.AnimatorSet r3 = r2.f6461h
            r3.cancel()
            android.animation.ValueAnimator r3 = r2.f6462i
            r3.start()
            if (r0 == 0) goto L3a
            android.animation.ValueAnimator r3 = r2.f6462i
            r3.end()
        L3a:
            return
    }
}
