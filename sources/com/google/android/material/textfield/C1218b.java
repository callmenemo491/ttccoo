package com.google.android.material.textfield;

/* renamed from: com.google.android.material.textfield.b */
/* loaded from: classes.dex */
public class C1218b extends p410x8.AbstractC6970k {

    /* renamed from: d */
    public final android.text.TextWatcher f6470d;

    /* renamed from: e */
    public final android.view.View.OnFocusChangeListener f6471e;

    /* renamed from: f */
    public final com.google.android.material.textfield.TextInputLayout.C1213e f6472f;

    /* renamed from: g */
    public final com.google.android.material.textfield.TextInputLayout.InterfaceC1214f f6473g;

    /* renamed from: h */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public final com.google.android.material.textfield.TextInputLayout.InterfaceC1215g f6474h;

    /* renamed from: i */
    public boolean f6475i;

    /* renamed from: j */
    public boolean f6476j;

    /* renamed from: k */
    public long f6477k;

    /* renamed from: l */
    public android.graphics.drawable.StateListDrawable f6478l;

    /* renamed from: m */
    public p340t8.C6189f f6479m;

    /* renamed from: n */
    public android.view.accessibility.AccessibilityManager f6480n;

    /* renamed from: o */
    public android.animation.ValueAnimator f6481o;

    /* renamed from: p */
    public android.animation.ValueAnimator f6482p;

    /* renamed from: com.google.android.material.textfield.b$a */
    public class a extends p220m8.C4428l {

        /* renamed from: Y */
        public final /* synthetic */ com.google.android.material.textfield.C1218b f6483Y;

        /* renamed from: com.google.android.material.textfield.b$a$a, reason: collision with other inner class name */
        public class RunnableC7372a implements java.lang.Runnable {

            /* renamed from: Y */
            public final /* synthetic */ android.widget.AutoCompleteTextView f6484Y;

            /* renamed from: Z */
            public final /* synthetic */ com.google.android.material.textfield.C1218b.a f6485Z;

            public RunnableC7372a(com.google.android.material.textfield.C1218b.a r1, android.widget.AutoCompleteTextView r2) {
                    r0 = this;
                    r0.f6485Z = r1
                    r0.f6484Y = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    android.widget.AutoCompleteTextView r0 = r2.f6484Y
                    boolean r0 = r0.isPopupShowing()
                    com.google.android.material.textfield.b$a r1 = r2.f6485Z
                    com.google.android.material.textfield.b r1 = r1.f6483Y
                    com.google.android.material.textfield.C1218b.m3593f(r1, r0)
                    com.google.android.material.textfield.b$a r1 = r2.f6485Z
                    com.google.android.material.textfield.b r1 = r1.f6483Y
                    r1.f6475i = r0
                    return
            }
        }

        public a(com.google.android.material.textfield.C1218b r1) {
                r0 = this;
                r0.f6483Y = r1
                r0.<init>()
                return
        }

        @Override // p220m8.C4428l, android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r2) {
                r1 = this;
                com.google.android.material.textfield.b r2 = r1.f6483Y
                com.google.android.material.textfield.TextInputLayout r2 = r2.f27216a
                android.widget.EditText r2 = r2.getEditText()
                android.widget.AutoCompleteTextView r2 = com.google.android.material.textfield.C1218b.m3591d(r2)
                com.google.android.material.textfield.b r0 = r1.f6483Y
                android.view.accessibility.AccessibilityManager r0 = r0.f6480n
                boolean r0 = r0.isTouchExplorationEnabled()
                if (r0 == 0) goto L29
                boolean r0 = com.google.android.material.textfield.C1218b.m3592e(r2)
                if (r0 == 0) goto L29
                com.google.android.material.textfield.b r0 = r1.f6483Y
                com.google.android.material.internal.CheckableImageButton r0 = r0.f27218c
                boolean r0 = r0.hasFocus()
                if (r0 != 0) goto L29
                r2.dismissDropDown()
            L29:
                com.google.android.material.textfield.b$a$a r0 = new com.google.android.material.textfield.b$a$a
                r0.<init>(r1, r2)
                r2.post(r0)
                return
        }
    }

    /* renamed from: com.google.android.material.textfield.b$b */
    public class b implements android.view.View.OnFocusChangeListener {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.textfield.C1218b f6486a;

        public b(com.google.android.material.textfield.C1218b r1) {
                r0 = this;
                r0.f6486a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View r1, boolean r2) {
                r0 = this;
                com.google.android.material.textfield.b r1 = r0.f6486a
                com.google.android.material.textfield.TextInputLayout r1 = r1.f27216a
                r1.setEndIconActivated(r2)
                if (r2 != 0) goto L13
                com.google.android.material.textfield.b r1 = r0.f6486a
                r2 = 0
                com.google.android.material.textfield.C1218b.m3593f(r1, r2)
                com.google.android.material.textfield.b r1 = r0.f6486a
                r1.f6475i = r2
            L13:
                return
        }
    }

    /* renamed from: com.google.android.material.textfield.b$c */
    public class c extends com.google.android.material.textfield.TextInputLayout.C1213e {

        /* renamed from: e */
        public final /* synthetic */ com.google.android.material.textfield.C1218b f6487e;

        public c(com.google.android.material.textfield.C1218b r1, com.google.android.material.textfield.TextInputLayout r2) {
                r0 = this;
                r0.f6487e = r1
                r0.<init>(r2)
                return
        }

        @Override // com.google.android.material.textfield.TextInputLayout.C1213e, p227n0.C4641a
        /* renamed from: d */
        public void mo1040d(android.view.View r4, p242o0.C4868b r5) {
                r3 = this;
                super.mo1040d(r4, r5)
                com.google.android.material.textfield.b r4 = r3.f6487e
                com.google.android.material.textfield.TextInputLayout r4 = r4.f27216a
                android.widget.EditText r4 = r4.getEditText()
                boolean r4 = com.google.android.material.textfield.C1218b.m3592e(r4)
                if (r4 != 0) goto L1c
                java.lang.Class<android.widget.Spinner> r4 = android.widget.Spinner.class
                java.lang.String r4 = r4.getName()
                android.view.accessibility.AccessibilityNodeInfo r0 = r5.f19337a
                r0.setClassName(r4)
            L1c:
                int r4 = android.os.Build.VERSION.SDK_INT
                r0 = 26
                if (r4 < r0) goto L29
                android.view.accessibility.AccessibilityNodeInfo r4 = r5.f19337a
                boolean r4 = r4.isShowingHintText()
                goto L3e
            L29:
                r4 = 4
                android.os.Bundle r0 = r5.m10993f()
                r1 = 0
                if (r0 != 0) goto L32
                goto L3d
            L32:
                java.lang.String r2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"
                int r0 = r0.getInt(r2, r1)
                r0 = r0 & r4
                if (r0 != r4) goto L3d
                r4 = 1
                goto L3e
            L3d:
                r4 = 0
            L3e:
                if (r4 == 0) goto L44
                r4 = 0
                r5.m10998k(r4)
            L44:
                return
        }

        @Override // p227n0.C4641a
        /* renamed from: e */
        public void mo2065e(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                android.view.View$AccessibilityDelegate r0 = r1.f18502a
                r0.onPopulateAccessibilityEvent(r2, r3)
                com.google.android.material.textfield.b r2 = r1.f6487e
                com.google.android.material.textfield.TextInputLayout r2 = r2.f27216a
                android.widget.EditText r2 = r2.getEditText()
                android.widget.AutoCompleteTextView r2 = com.google.android.material.textfield.C1218b.m3591d(r2)
                int r3 = r3.getEventType()
                r0 = 1
                if (r3 != r0) goto L35
                com.google.android.material.textfield.b r3 = r1.f6487e
                android.view.accessibility.AccessibilityManager r3 = r3.f6480n
                boolean r3 = r3.isTouchExplorationEnabled()
                if (r3 == 0) goto L35
                com.google.android.material.textfield.b r3 = r1.f6487e
                com.google.android.material.textfield.TextInputLayout r3 = r3.f27216a
                android.widget.EditText r3 = r3.getEditText()
                boolean r3 = com.google.android.material.textfield.C1218b.m3592e(r3)
                if (r3 != 0) goto L35
                com.google.android.material.textfield.b r3 = r1.f6487e
                com.google.android.material.textfield.C1218b.m3594g(r3, r2)
            L35:
                return
        }
    }

    /* renamed from: com.google.android.material.textfield.b$d */
    public class d implements com.google.android.material.textfield.TextInputLayout.InterfaceC1214f {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.textfield.C1218b f6488a;

        public d(com.google.android.material.textfield.C1218b r1) {
                r0 = this;
                r0.f6488a = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC1214f
        /* renamed from: a */
        public void mo3586a(com.google.android.material.textfield.TextInputLayout r12) {
                r11 = this;
                android.widget.EditText r0 = r12.getEditText()
                android.widget.AutoCompleteTextView r0 = com.google.android.material.textfield.C1218b.m3591d(r0)
                com.google.android.material.textfield.b r1 = r11.f6488a
                com.google.android.material.textfield.TextInputLayout r2 = r1.f27216a
                int r2 = r2.getBoxBackgroundMode()
                r3 = 1
                r4 = 2
                if (r2 != r4) goto L17
                t8.f r1 = r1.f6479m
                goto L1b
            L17:
                if (r2 != r3) goto L1e
                android.graphics.drawable.StateListDrawable r1 = r1.f6478l
            L1b:
                r0.setDropDownBackgroundDrawable(r1)
            L1e:
                com.google.android.material.textfield.b r1 = r11.f6488a
                java.util.Objects.requireNonNull(r1)
                android.text.method.KeyListener r2 = r0.getKeyListener()
                r5 = 0
                if (r2 == 0) goto L2c
                r2 = 1
                goto L2d
            L2c:
                r2 = 0
            L2d:
                if (r2 == 0) goto L31
                goto Lcc
            L31:
                com.google.android.material.textfield.TextInputLayout r2 = r1.f27216a
                int r2 = r2.getBoxBackgroundMode()
                com.google.android.material.textfield.TextInputLayout r6 = r1.f27216a
                t8.f r6 = r6.getBoxBackground()
                r7 = 2130968822(0x7f0400f6, float:1.7546308E38)
                int r7 = p124h7.C2939x3.m7286l(r0, r7)
                int[][] r8 = new int[r4][]
                int[] r9 = new int[r3]
                r10 = 16842919(0x10100a7, float:2.3694026E-38)
                r9[r5] = r10
                r8[r5] = r9
                int[] r9 = new int[r5]
                r8[r3] = r9
                r9 = 1036831949(0x3dcccccd, float:0.1)
                if (r2 != r4) goto Lab
                r1 = 2130968838(0x7f040106, float:1.754634E38)
                int r1 = p124h7.C2939x3.m7286l(r0, r1)
                t8.f r2 = new t8.f
                t8.f$b r10 = r6.f24036Y
                t8.i r10 = r10.f24059a
                r2.<init>(r10)
                int r7 = p124h7.C2939x3.m7288n(r7, r1, r9)
                int[] r9 = new int[r4]
                r9[r5] = r7
                r9[r3] = r5
                android.content.res.ColorStateList r10 = new android.content.res.ColorStateList
                r10.<init>(r8, r9)
                r2.m12773q(r10)
                r2.setTint(r1)
                int[] r9 = new int[r4]
                r9[r5] = r7
                r9[r3] = r1
                android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
                r1.<init>(r8, r9)
                t8.f r7 = new t8.f
                t8.f$b r8 = r6.f24036Y
                t8.i r8 = r8.f24059a
                r7.<init>(r8)
                r8 = -1
                r7.setTint(r8)
                android.graphics.drawable.RippleDrawable r8 = new android.graphics.drawable.RippleDrawable
                r8.<init>(r1, r2, r7)
                android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r4]
                r1[r5] = r8
                r1[r3] = r6
                android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
                r2.<init>(r1)
                java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
                p227n0.C4661t.c.m10569q(r0, r2)
                goto Lcc
            Lab:
                if (r2 != r3) goto Lcc
                com.google.android.material.textfield.TextInputLayout r1 = r1.f27216a
                int r1 = r1.getBoxBackgroundColor()
                int r2 = p124h7.C2939x3.m7288n(r7, r1, r9)
                int[] r7 = new int[r4]
                r7[r5] = r2
                r7[r3] = r1
                android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
                r1.<init>(r8, r7)
                android.graphics.drawable.RippleDrawable r2 = new android.graphics.drawable.RippleDrawable
                r2.<init>(r1, r6, r6)
                java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
                p227n0.C4661t.c.m10569q(r0, r2)
            Lcc:
                com.google.android.material.textfield.b r1 = r11.f6488a
                java.util.Objects.requireNonNull(r1)
                x8.h r2 = new x8.h
                r2.<init>(r1, r0)
                r0.setOnTouchListener(r2)
                android.view.View$OnFocusChangeListener r2 = r1.f6471e
                r0.setOnFocusChangeListener(r2)
                x8.i r2 = new x8.i
                r2.<init>(r1)
                r0.setOnDismissListener(r2)
                r0.setThreshold(r5)
                com.google.android.material.textfield.b r1 = r11.f6488a
                android.text.TextWatcher r1 = r1.f6470d
                r0.removeTextChangedListener(r1)
                com.google.android.material.textfield.b r1 = r11.f6488a
                android.text.TextWatcher r1 = r1.f6470d
                r0.addTextChangedListener(r1)
                r12.setEndIconCheckable(r3)
                r1 = 0
                r12.setErrorIconDrawable(r1)
                android.text.method.KeyListener r0 = r0.getKeyListener()
                if (r0 == 0) goto L105
                r5 = 1
            L105:
                if (r5 != 0) goto L110
                com.google.android.material.textfield.b r0 = r11.f6488a
                com.google.android.material.internal.CheckableImageButton r0 = r0.f27218c
                java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
                p227n0.C4661t.c.m10571s(r0, r4)
            L110:
                com.google.android.material.textfield.b r0 = r11.f6488a
                com.google.android.material.textfield.TextInputLayout$e r0 = r0.f6472f
                r12.m3578x6c63f358(r0)
                r12.setEndIconVisible(r3)
                return
        }
    }

    /* renamed from: com.google.android.material.textfield.b$e */
    public class e implements com.google.android.material.textfield.TextInputLayout.InterfaceC1215g {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.textfield.C1218b f6489a;

        /* renamed from: com.google.android.material.textfield.b$e$a */
        public class a implements java.lang.Runnable {

            /* renamed from: Y */
            public final /* synthetic */ android.widget.AutoCompleteTextView f6490Y;

            /* renamed from: Z */
            public final /* synthetic */ com.google.android.material.textfield.C1218b.e f6491Z;

            public a(com.google.android.material.textfield.C1218b.e r1, android.widget.AutoCompleteTextView r2) {
                    r0 = this;
                    r0.f6491Z = r1
                    r0.f6490Y = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    android.widget.AutoCompleteTextView r0 = r2.f6490Y
                    com.google.android.material.textfield.b$e r1 = r2.f6491Z
                    com.google.android.material.textfield.b r1 = r1.f6489a
                    android.text.TextWatcher r1 = r1.f6470d
                    r0.removeTextChangedListener(r1)
                    return
            }
        }

        public e(com.google.android.material.textfield.C1218b r1) {
                r0 = this;
                r0.f6489a = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC1215g
        /* renamed from: a */
        public void mo3587a(com.google.android.material.textfield.TextInputLayout r3, int r4) {
                r2 = this;
                android.widget.EditText r3 = r3.getEditText()
                android.widget.AutoCompleteTextView r3 = (android.widget.AutoCompleteTextView) r3
                if (r3 == 0) goto L27
                r0 = 3
                if (r4 != r0) goto L27
                com.google.android.material.textfield.b$e$a r4 = new com.google.android.material.textfield.b$e$a
                r4.<init>(r2, r3)
                r3.post(r4)
                android.view.View$OnFocusChangeListener r4 = r3.getOnFocusChangeListener()
                com.google.android.material.textfield.b r0 = r2.f6489a
                android.view.View$OnFocusChangeListener r0 = r0.f6471e
                r1 = 0
                if (r4 != r0) goto L21
                r3.setOnFocusChangeListener(r1)
            L21:
                r3.setOnTouchListener(r1)
                r3.setOnDismissListener(r1)
            L27:
                return
        }
    }

    /* renamed from: com.google.android.material.textfield.b$f */
    public class f implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ com.google.android.material.textfield.C1218b f6492Y;

        public f(com.google.android.material.textfield.C1218b r1) {
                r0 = this;
                r0.f6492Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.google.android.material.textfield.b r2 = r1.f6492Y
                com.google.android.material.textfield.TextInputLayout r2 = r2.f27216a
                android.widget.EditText r2 = r2.getEditText()
                android.widget.AutoCompleteTextView r2 = (android.widget.AutoCompleteTextView) r2
                com.google.android.material.textfield.b r0 = r1.f6492Y
                com.google.android.material.textfield.C1218b.m3594g(r0, r2)
                return
        }
    }

    public C1218b(com.google.android.material.textfield.TextInputLayout r3) {
            r2 = this;
            r2.<init>(r3)
            com.google.android.material.textfield.b$a r3 = new com.google.android.material.textfield.b$a
            r3.<init>(r2)
            r2.f6470d = r3
            com.google.android.material.textfield.b$b r3 = new com.google.android.material.textfield.b$b
            r3.<init>(r2)
            r2.f6471e = r3
            com.google.android.material.textfield.b$c r3 = new com.google.android.material.textfield.b$c
            com.google.android.material.textfield.TextInputLayout r0 = r2.f27216a
            r3.<init>(r2, r0)
            r2.f6472f = r3
            com.google.android.material.textfield.b$d r3 = new com.google.android.material.textfield.b$d
            r3.<init>(r2)
            r2.f6473g = r3
            com.google.android.material.textfield.b$e r3 = new com.google.android.material.textfield.b$e
            r3.<init>(r2)
            r2.f6474h = r3
            r3 = 0
            r2.f6475i = r3
            r2.f6476j = r3
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.f6477k = r0
            return
    }

    /* renamed from: d */
    public static android.widget.AutoCompleteTextView m3591d(android.widget.EditText r1) {
            boolean r0 = r1 instanceof android.widget.AutoCompleteTextView
            if (r0 == 0) goto L7
            android.widget.AutoCompleteTextView r1 = (android.widget.AutoCompleteTextView) r1
            return r1
        L7:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used."
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: e */
    public static boolean m3592e(android.widget.EditText r0) {
            android.text.method.KeyListener r0 = r0.getKeyListener()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* renamed from: f */
    public static void m3593f(com.google.android.material.textfield.C1218b r1, boolean r2) {
            boolean r0 = r1.f6476j
            if (r0 == r2) goto L10
            r1.f6476j = r2
            android.animation.ValueAnimator r2 = r1.f6482p
            r2.cancel()
            android.animation.ValueAnimator r1 = r1.f6481o
            r1.start()
        L10:
            return
    }

    /* renamed from: g */
    public static void m3594g(com.google.android.material.textfield.C1218b r2, android.widget.AutoCompleteTextView r3) {
            java.util.Objects.requireNonNull(r2)
            if (r3 != 0) goto L6
            goto L36
        L6:
            boolean r0 = r2.m3597i()
            r1 = 0
            if (r0 == 0) goto Lf
            r2.f6475i = r1
        Lf:
            boolean r0 = r2.f6475i
            if (r0 != 0) goto L34
            boolean r0 = r2.f6476j
            r1 = r0 ^ 1
            if (r0 == r1) goto L25
            r2.f6476j = r1
            android.animation.ValueAnimator r0 = r2.f6482p
            r0.cancel()
            android.animation.ValueAnimator r0 = r2.f6481o
            r0.start()
        L25:
            boolean r2 = r2.f6476j
            if (r2 == 0) goto L30
            r3.requestFocus()
            r3.showDropDown()
            goto L36
        L30:
            r3.dismissDropDown()
            goto L36
        L34:
            r2.f6475i = r1
        L36:
            return
    }

    @Override // p410x8.AbstractC6970k
    /* renamed from: a */
    public void mo3588a() {
            r6 = this;
            android.content.Context r0 = r6.f27217b
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165627(0x7f0701bb, float:1.7945476E38)
            int r0 = r0.getDimensionPixelOffset(r1)
            float r0 = (float) r0
            android.content.Context r1 = r6.f27217b
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165560(0x7f070178, float:1.794534E38)
            int r1 = r1.getDimensionPixelOffset(r2)
            float r1 = (float) r1
            android.content.Context r2 = r6.f27217b
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131165562(0x7f07017a, float:1.7945345E38)
            int r2 = r2.getDimensionPixelOffset(r3)
            t8.f r3 = r6.m3596h(r0, r0, r1, r2)
            r4 = 0
            t8.f r0 = r6.m3596h(r4, r0, r1, r2)
            r6.f6479m = r3
            android.graphics.drawable.StateListDrawable r1 = new android.graphics.drawable.StateListDrawable
            r1.<init>()
            r6.f6478l = r1
            r2 = 1
            int[] r2 = new int[r2]
            r4 = 16842922(0x10100aa, float:2.3694034E-38)
            r5 = 0
            r2[r5] = r4
            r1.addState(r2, r3)
            android.graphics.drawable.StateListDrawable r1 = r6.f6478l
            int[] r2 = new int[r5]
            r1.addState(r2, r0)
            r0 = 2131231326(0x7f08025e, float:1.807873E38)
            com.google.android.material.textfield.TextInputLayout r1 = r6.f27216a
            android.content.Context r2 = r6.f27217b
            android.graphics.drawable.Drawable r0 = p102g.C2199a.m5784b(r2, r0)
            r1.setEndIconDrawable(r0)
            com.google.android.material.textfield.TextInputLayout r0 = r6.f27216a
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131951817(0x7f1300c9, float:1.954006E38)
            java.lang.CharSequence r1 = r1.getText(r2)
            r0.setEndIconContentDescription(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r6.f27216a
            com.google.android.material.textfield.b$f r1 = new com.google.android.material.textfield.b$f
            r1.<init>(r6)
            r0.setEndIconOnClickListener(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r6.f27216a
            com.google.android.material.textfield.TextInputLayout$f r1 = r6.f6473g
            r0.m3552a(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r6.f27216a
            com.google.android.material.textfield.TextInputLayout$g r1 = r6.f6474h
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$g> r0 = r0.f6406f1
            r0.add(r1)
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x00d6: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            android.animation.TimeInterpolator r2 = p354u7.C6350a.f24803a
            r1.setInterpolator(r2)
            r3 = 67
            long r3 = (long) r3
            r1.setDuration(r3)
            x8.g r3 = new x8.g
            r3.<init>(r6)
            r1.addUpdateListener(r3)
            r6.f6482p = r1
            r1 = 50
            float[] r0 = new float[r0]
            r0 = {x00de: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r0.setInterpolator(r2)
            long r1 = (long) r1
            r0.setDuration(r1)
            x8.g r1 = new x8.g
            r1.<init>(r6)
            r0.addUpdateListener(r1)
            r6.f6481o = r0
            x8.j r1 = new x8.j
            r1.<init>(r6)
            r0.addListener(r1)
            android.content.Context r0 = r6.f27217b
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r6.f6480n = r0
            return
    }

    @Override // p410x8.AbstractC6970k
    /* renamed from: b */
    public boolean mo3595b(int r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }

    /* renamed from: h */
    public final p340t8.C6189f m3596h(float r5, float r6, float r7, int r8) {
            r4 = this;
            t8.i$b r0 = new t8.i$b
            r0.<init>()
            t8.a r1 = new t8.a
            r1.<init>(r5)
            r0.f24098e = r1
            t8.a r1 = new t8.a
            r1.<init>(r5)
            r0.f24099f = r1
            t8.a r5 = new t8.a
            r5.<init>(r6)
            r0.f24101h = r5
            t8.a r5 = new t8.a
            r5.<init>(r6)
            r0.f24100g = r5
            t8.i r5 = r0.m12788a()
            android.content.Context r6 = r4.f27217b
            java.lang.String r0 = p340t8.C6189f.f24034u0
            java.lang.Class<t8.f> r0 = p340t8.C6189f.class
            java.lang.String r0 = r0.getSimpleName()
            r1 = 2130968838(0x7f040106, float:1.754634E38)
            int r0 = p288q8.C5598b.m11874c(r6, r1, r0)
            t8.f r1 = new t8.f
            r1.<init>()
            t8.f$b r2 = r1.f24036Y
            j8.a r3 = new j8.a
            r3.<init>(r6)
            r2.f24060b = r3
            r1.m12781y()
            android.content.res.ColorStateList r6 = android.content.res.ColorStateList.valueOf(r0)
            r1.m12773q(r6)
            t8.f$b r6 = r1.f24036Y
            float r0 = r6.f24073o
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L5b
            r6.f24073o = r7
            r1.m12781y()
        L5b:
            t8.f$b r6 = r1.f24036Y
            r6.f24059a = r5
            r1.invalidateSelf()
            t8.f$b r5 = r1.f24036Y
            android.graphics.Rect r6 = r5.f24067i
            if (r6 != 0) goto L6f
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r5.f24067i = r6
        L6f:
            t8.f$b r5 = r1.f24036Y
            android.graphics.Rect r5 = r5.f24067i
            r6 = 0
            r5.set(r6, r8, r6, r8)
            r1.invalidateSelf()
            return r1
    }

    /* renamed from: i */
    public final boolean m3597i() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.f6477k
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L16
            r2 = 300(0x12c, double:1.48E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L14
            goto L16
        L14:
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            return r0
    }
}
