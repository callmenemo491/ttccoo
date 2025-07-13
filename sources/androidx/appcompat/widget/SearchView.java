package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.LinearLayoutCompat implements p177k.InterfaceC3618b {

    /* renamed from: j1 */
    public static final androidx.appcompat.widget.SearchView.C0246n f1012j1 = null;

    /* renamed from: A0 */
    public android.graphics.Rect f1013A0;

    /* renamed from: B0 */
    public int[] f1014B0;

    /* renamed from: C0 */
    public int[] f1015C0;

    /* renamed from: D0 */
    public final android.widget.ImageView f1016D0;

    /* renamed from: E0 */
    public final android.graphics.drawable.Drawable f1017E0;

    /* renamed from: F0 */
    public final int f1018F0;

    /* renamed from: G0 */
    public final int f1019G0;

    /* renamed from: H0 */
    public final android.content.Intent f1020H0;

    /* renamed from: I0 */
    public final android.content.Intent f1021I0;

    /* renamed from: J0 */
    public final java.lang.CharSequence f1022J0;

    /* renamed from: K0 */
    public androidx.appcompat.widget.SearchView.InterfaceC0244l f1023K0;

    /* renamed from: L0 */
    public androidx.appcompat.widget.SearchView.InterfaceC0243k f1024L0;

    /* renamed from: M0 */
    public android.view.View.OnFocusChangeListener f1025M0;

    /* renamed from: N0 */
    public androidx.appcompat.widget.SearchView.InterfaceC0245m f1026N0;

    /* renamed from: O0 */
    public android.view.View.OnClickListener f1027O0;

    /* renamed from: P0 */
    public boolean f1028P0;

    /* renamed from: Q0 */
    public boolean f1029Q0;

    /* renamed from: R0 */
    public p300r0.AbstractC5758a f1030R0;

    /* renamed from: S0 */
    public boolean f1031S0;

    /* renamed from: T0 */
    public java.lang.CharSequence f1032T0;

    /* renamed from: U0 */
    public boolean f1033U0;

    /* renamed from: V0 */
    public boolean f1034V0;

    /* renamed from: W0 */
    public int f1035W0;

    /* renamed from: X0 */
    public boolean f1036X0;

    /* renamed from: Y0 */
    public java.lang.CharSequence f1037Y0;

    /* renamed from: Z0 */
    public java.lang.CharSequence f1038Z0;

    /* renamed from: a1 */
    public boolean f1039a1;

    /* renamed from: b1 */
    public int f1040b1;

    /* renamed from: c1 */
    public android.app.SearchableInfo f1041c1;

    /* renamed from: d1 */
    public android.os.Bundle f1042d1;

    /* renamed from: e1 */
    public final java.lang.Runnable f1043e1;

    /* renamed from: f1 */
    public java.lang.Runnable f1044f1;

    /* renamed from: g1 */
    public final java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> f1045g1;

    /* renamed from: h1 */
    public android.view.View.OnKeyListener f1046h1;

    /* renamed from: i1 */
    public android.text.TextWatcher f1047i1;

    /* renamed from: p0 */
    public final androidx.appcompat.widget.SearchView.SearchAutoComplete f1048p0;

    /* renamed from: q0 */
    public final android.view.View f1049q0;

    /* renamed from: r0 */
    public final android.view.View f1050r0;

    /* renamed from: s0 */
    public final android.view.View f1051s0;

    /* renamed from: t0 */
    public final android.widget.ImageView f1052t0;

    /* renamed from: u0 */
    public final android.widget.ImageView f1053u0;

    /* renamed from: v0 */
    public final android.widget.ImageView f1054v0;

    /* renamed from: w0 */
    public final android.widget.ImageView f1055w0;

    /* renamed from: x0 */
    public final android.view.View f1056x0;

    /* renamed from: y0 */
    public androidx.appcompat.widget.SearchView.C0248p f1057y0;

    /* renamed from: z0 */
    public android.graphics.Rect f1058z0;

    public static class SearchAutoComplete extends androidx.appcompat.widget.C0270e {

        /* renamed from: d0 */
        public int f1059d0;

        /* renamed from: e0 */
        public androidx.appcompat.widget.SearchView f1060e0;

        /* renamed from: f0 */
        public boolean f1061f0;

        /* renamed from: g0 */
        public final java.lang.Runnable f1062g0;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class RunnableC0232a implements java.lang.Runnable {

            /* renamed from: Y */
            public final /* synthetic */ androidx.appcompat.widget.SearchView.SearchAutoComplete f1063Y;

            public RunnableC0232a(androidx.appcompat.widget.SearchView.SearchAutoComplete r1) {
                    r0 = this;
                    r0.f1063Y = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1063Y
                    boolean r1 = r0.f1061f0
                    if (r1 == 0) goto L18
                    android.content.Context r1 = r0.getContext()
                    java.lang.String r2 = "input_method"
                    java.lang.Object r1 = r1.getSystemService(r2)
                    android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
                    r2 = 0
                    r1.showSoftInput(r0, r2)
                    r0.f1061f0 = r2
                L18:
                    return
            }
        }

        public SearchAutoComplete(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r0 = 2130968638(0x7f04003e, float:1.7545935E38)
                r1.<init>(r2, r3, r0)
                androidx.appcompat.widget.SearchView$SearchAutoComplete$a r2 = new androidx.appcompat.widget.SearchView$SearchAutoComplete$a
                r2.<init>(r1)
                r1.f1062g0 = r2
                int r2 = r1.getThreshold()
                r1.f1059d0 = r2
                return
        }

        private int getSearchViewTextMinWidthDp() {
                r4 = this;
                android.content.res.Resources r0 = r4.getResources()
                android.content.res.Configuration r0 = r0.getConfiguration()
                int r1 = r0.screenWidthDp
                int r2 = r0.screenHeightDp
                r3 = 960(0x3c0, float:1.345E-42)
                if (r1 < r3) goto L1c
                r3 = 720(0x2d0, float:1.009E-42)
                if (r2 < r3) goto L1c
                int r0 = r0.orientation
                r3 = 2
                if (r0 != r3) goto L1c
                r0 = 256(0x100, float:3.59E-43)
                return r0
            L1c:
                r0 = 600(0x258, float:8.41E-43)
                if (r1 >= r0) goto L2c
                r0 = 640(0x280, float:8.97E-43)
                if (r1 < r0) goto L29
                r0 = 480(0x1e0, float:6.73E-43)
                if (r2 < r0) goto L29
                goto L2c
            L29:
                r0 = 160(0xa0, float:2.24E-43)
                return r0
            L2c:
                r0 = 192(0xc0, float:2.69E-43)
                return r0
        }

        /* renamed from: a */
        public void m609a() {
                r4 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 1
                r2 = 29
                if (r0 < r2) goto L14
                r4.setInputMethodMode(r1)
                boolean r0 = r4.enoughToFilter()
                if (r0 == 0) goto L2a
                r4.showDropDown()
                goto L2a
            L14:
                androidx.appcompat.widget.SearchView$n r0 = androidx.appcompat.widget.SearchView.f1012j1
                java.util.Objects.requireNonNull(r0)
                androidx.appcompat.widget.SearchView.C0246n.m615a()
                java.lang.reflect.Method r0 = r0.f1076c
                if (r0 == 0) goto L2a
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L2a
                r2 = 0
                java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L2a
                r1[r2] = r3     // Catch: java.lang.Exception -> L2a
                r0.invoke(r4, r1)     // Catch: java.lang.Exception -> L2a
            L2a:
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
                r1 = this;
                int r0 = r1.f1059d0
                if (r0 <= 0) goto Ld
                boolean r0 = super.enoughToFilter()
                if (r0 == 0) goto Lb
                goto Ld
            Lb:
                r0 = 0
                goto Le
            Ld:
                r0 = 1
            Le:
                return r0
        }

        @Override // androidx.appcompat.widget.C0270e, android.widget.TextView, android.view.View
        public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
                r1 = this;
                android.view.inputmethod.InputConnection r2 = super.onCreateInputConnection(r2)
                boolean r0 = r1.f1061f0
                if (r0 == 0) goto L12
                java.lang.Runnable r0 = r1.f1062g0
                r1.removeCallbacks(r0)
                java.lang.Runnable r0 = r1.f1062g0
                r1.post(r0)
            L12:
                return r2
        }

        @Override // android.view.View
        public void onFinishInflate() {
                r3 = this;
                super.onFinishInflate()
                android.content.res.Resources r0 = r3.getResources()
                android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
                int r1 = r3.getSearchViewTextMinWidthDp()
                float r1 = (float) r1
                r2 = 1
                float r0 = android.util.TypedValue.applyDimension(r2, r1, r0)
                int r0 = (int) r0
                r3.setMinWidth(r0)
                return
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
                r0 = this;
                super.onFocusChanged(r1, r2, r3)
                androidx.appcompat.widget.SearchView r1 = r0.f1060e0
                boolean r2 = r1.f1029Q0
                r1.m589A(r2)
                java.lang.Runnable r2 = r1.f1043e1
                r1.post(r2)
                androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.f1048p0
                boolean r2 = r2.hasFocus()
                if (r2 == 0) goto L1a
                r1.m595n()
            L1a:
                return
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int r3, android.view.KeyEvent r4) {
                r2 = this;
                r0 = 4
                if (r3 != r0) goto L3f
                int r0 = r4.getAction()
                r1 = 1
                if (r0 != 0) goto L1a
                int r0 = r4.getRepeatCount()
                if (r0 != 0) goto L1a
                android.view.KeyEvent$DispatcherState r3 = r2.getKeyDispatcherState()
                if (r3 == 0) goto L19
                r3.startTracking(r4, r2)
            L19:
                return r1
            L1a:
                int r0 = r4.getAction()
                if (r0 != r1) goto L3f
                android.view.KeyEvent$DispatcherState r0 = r2.getKeyDispatcherState()
                if (r0 == 0) goto L29
                r0.handleUpEvent(r4)
            L29:
                boolean r0 = r4.isTracking()
                if (r0 == 0) goto L3f
                boolean r0 = r4.isCanceled()
                if (r0 != 0) goto L3f
                androidx.appcompat.widget.SearchView r3 = r2.f1060e0
                r3.clearFocus()
                r3 = 0
                r2.setImeVisibility(r3)
                return r1
            L3f:
                boolean r3 = super.onKeyPreIme(r3, r4)
                return r3
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean r3) {
                r2 = this;
                super.onWindowFocusChanged(r3)
                if (r3 == 0) goto L30
                androidx.appcompat.widget.SearchView r3 = r2.f1060e0
                boolean r3 = r3.hasFocus()
                if (r3 == 0) goto L30
                int r3 = r2.getVisibility()
                if (r3 != 0) goto L30
                r3 = 1
                r2.f1061f0 = r3
                android.content.Context r0 = r2.getContext()
                androidx.appcompat.widget.SearchView$n r1 = androidx.appcompat.widget.SearchView.f1012j1
                android.content.res.Resources r0 = r0.getResources()
                android.content.res.Configuration r0 = r0.getConfiguration()
                int r0 = r0.orientation
                r1 = 2
                if (r0 != r1) goto L2a
                goto L2b
            L2a:
                r3 = 0
            L2b:
                if (r3 == 0) goto L30
                r2.m609a()
            L30:
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
                r0 = this;
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(java.lang.CharSequence r1) {
                r0 = this;
                return
        }

        public void setImeVisibility(boolean r3) {
                r2 = this;
                android.content.Context r0 = r2.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r1 = 0
                if (r3 != 0) goto L1e
                r2.f1061f0 = r1
                java.lang.Runnable r3 = r2.f1062g0
                r2.removeCallbacks(r3)
                android.os.IBinder r3 = r2.getWindowToken()
                r0.hideSoftInputFromWindow(r3, r1)
                return
            L1e:
                boolean r3 = r0.isActive(r2)
                if (r3 == 0) goto L2f
                r2.f1061f0 = r1
                java.lang.Runnable r3 = r2.f1062g0
                r2.removeCallbacks(r3)
                r0.showSoftInput(r2, r1)
                return
            L2f:
                r3 = 1
                r2.f1061f0 = r3
                return
        }

        public void setSearchView(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1060e0 = r1
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int r1) {
                r0 = this;
                super.setThreshold(r1)
                r0.f1059d0 = r1
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    public class C0233a implements android.text.TextWatcher {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.SearchView f1064Y;

        public C0233a(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1064Y = r1
                r0.<init>()
                return
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r1) {
                r0 = this;
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
                androidx.appcompat.widget.SearchView r2 = r0.f1064Y
                androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r2.f1048p0
                android.text.Editable r3 = r3.getText()
                r2.f1038Z0 = r3
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                r3 = r3 ^ 1
                r2.m608z(r3)
                r3 = r3 ^ 1
                r2.m590B(r3)
                r2.m604v()
                r2.m607y()
                androidx.appcompat.widget.SearchView$l r3 = r2.f1023K0
                if (r3 == 0) goto L33
                java.lang.CharSequence r3 = r2.f1037Y0
                boolean r3 = android.text.TextUtils.equals(r1, r3)
                if (r3 != 0) goto L33
                androidx.appcompat.widget.SearchView$l r3 = r2.f1023K0
                java.lang.String r4 = r1.toString()
                r3.m611a(r4)
            L33:
                java.lang.String r1 = r1.toString()
                r2.f1037Y0 = r1
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    public class RunnableC0234b implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.SearchView f1065Y;

        public RunnableC0234b(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1065Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.appcompat.widget.SearchView r0 = r1.f1065Y
                r0.m605w()
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    public class RunnableC0235c implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.SearchView f1066Y;

        public RunnableC0235c(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1066Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.SearchView r0 = r2.f1066Y
                r0.a r0 = r0.f1030R0
                boolean r1 = r0 instanceof androidx.appcompat.widget.ViewOnClickListenerC0302s0
                if (r1 == 0) goto Lc
                r1 = 0
                r0.mo780b(r1)
            Lc:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    public class ViewOnFocusChangeListenerC0236d implements android.view.View.OnFocusChangeListener {

        /* renamed from: a */
        public final /* synthetic */ androidx.appcompat.widget.SearchView f1067a;

        public ViewOnFocusChangeListenerC0236d(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1067a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View r2, boolean r3) {
                r1 = this;
                androidx.appcompat.widget.SearchView r2 = r1.f1067a
                android.view.View$OnFocusChangeListener r0 = r2.f1025M0
                if (r0 == 0) goto L9
                r0.onFocusChange(r2, r3)
            L9:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    public class ViewOnLayoutChangeListenerC0237e implements android.view.View.OnLayoutChangeListener {

        /* renamed from: a */
        public final /* synthetic */ androidx.appcompat.widget.SearchView f1068a;

        public ViewOnLayoutChangeListenerC0237e(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1068a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
                r0 = this;
                androidx.appcompat.widget.SearchView r1 = r0.f1068a
                android.view.View r2 = r1.f1056x0
                int r2 = r2.getWidth()
                r3 = 1
                if (r2 <= r3) goto L63
                android.content.Context r2 = r1.getContext()
                android.content.res.Resources r2 = r2.getResources()
                android.view.View r3 = r1.f1050r0
                int r3 = r3.getPaddingLeft()
                android.graphics.Rect r4 = new android.graphics.Rect
                r4.<init>()
                boolean r5 = androidx.appcompat.widget.C0275f1.m724b(r1)
                boolean r6 = r1.f1028P0
                if (r6 == 0) goto L36
                r6 = 2131165225(0x7f070029, float:1.7944661E38)
                int r6 = r2.getDimensionPixelSize(r6)
                r7 = 2131165226(0x7f07002a, float:1.7944663E38)
                int r2 = r2.getDimensionPixelSize(r7)
                int r2 = r2 + r6
                goto L37
            L36:
                r2 = 0
            L37:
                androidx.appcompat.widget.SearchView$SearchAutoComplete r6 = r1.f1048p0
                android.graphics.drawable.Drawable r6 = r6.getDropDownBackground()
                r6.getPadding(r4)
                if (r5 == 0) goto L46
                int r5 = r4.left
                int r5 = -r5
                goto L4b
            L46:
                int r5 = r4.left
                int r5 = r5 + r2
                int r5 = r3 - r5
            L4b:
                androidx.appcompat.widget.SearchView$SearchAutoComplete r6 = r1.f1048p0
                r6.setDropDownHorizontalOffset(r5)
                android.view.View r5 = r1.f1056x0
                int r5 = r5.getWidth()
                int r6 = r4.left
                int r5 = r5 + r6
                int r4 = r4.right
                int r5 = r5 + r4
                int r5 = r5 + r2
                int r5 = r5 - r3
                androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r1.f1048p0
                r1.setDropDownWidth(r5)
            L63:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    public class ViewOnClickListenerC0238f implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.SearchView f1069Y;

        public ViewOnClickListenerC0238f(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1069Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                androidx.appcompat.widget.SearchView r0 = r3.f1069Y
                android.widget.ImageView r1 = r0.f1052t0
                if (r4 != r1) goto La
                r0.m602t()
                goto L6c
            La:
                android.widget.ImageView r1 = r0.f1054v0
                if (r4 != r1) goto L12
                r0.m597p()
                goto L6c
            L12:
                android.widget.ImageView r1 = r0.f1053u0
                if (r4 != r1) goto L1a
                r0.m603u()
                goto L6c
            L1a:
                android.widget.ImageView r1 = r0.f1055w0
                if (r4 != r1) goto L65
                android.app.SearchableInfo r4 = r0.f1041c1
                if (r4 != 0) goto L23
                goto L6c
            L23:
                boolean r1 = r4.getVoiceSearchLaunchWebSearch()     // Catch: android.content.ActivityNotFoundException -> L5d
                if (r1 == 0) goto L49
                android.content.Intent r1 = r0.f1020H0     // Catch: android.content.ActivityNotFoundException -> L5d
                android.content.Intent r2 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L5d
                r2.<init>(r1)     // Catch: android.content.ActivityNotFoundException -> L5d
                android.content.ComponentName r4 = r4.getSearchActivity()     // Catch: android.content.ActivityNotFoundException -> L5d
                if (r4 != 0) goto L38
                r4 = 0
                goto L3c
            L38:
                java.lang.String r4 = r4.flattenToShortString()     // Catch: android.content.ActivityNotFoundException -> L5d
            L3c:
                java.lang.String r1 = "calling_package"
                r2.putExtra(r1, r4)     // Catch: android.content.ActivityNotFoundException -> L5d
                android.content.Context r4 = r0.getContext()     // Catch: android.content.ActivityNotFoundException -> L5d
                r4.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L5d
                goto L6c
            L49:
                boolean r1 = r4.getVoiceSearchLaunchRecognizer()     // Catch: android.content.ActivityNotFoundException -> L5d
                if (r1 == 0) goto L6c
                android.content.Intent r1 = r0.f1021I0     // Catch: android.content.ActivityNotFoundException -> L5d
                android.content.Intent r4 = r0.m594m(r1, r4)     // Catch: android.content.ActivityNotFoundException -> L5d
                android.content.Context r0 = r0.getContext()     // Catch: android.content.ActivityNotFoundException -> L5d
                r0.startActivity(r4)     // Catch: android.content.ActivityNotFoundException -> L5d
                goto L6c
            L5d:
                java.lang.String r4 = "SearchView"
                java.lang.String r0 = "Could not find voice search activity"
                android.util.Log.w(r4, r0)
                goto L6c
            L65:
                androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r0.f1048p0
                if (r4 != r1) goto L6c
                r0.m595n()
            L6c:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    public class ViewOnKeyListenerC0239g implements android.view.View.OnKeyListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.SearchView f1070Y;

        public ViewOnKeyListenerC0239g(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1070Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(android.view.View r6, int r7, android.view.KeyEvent r8) {
                r5 = this;
                androidx.appcompat.widget.SearchView r0 = r5.f1070Y
                android.app.SearchableInfo r1 = r0.f1041c1
                r2 = 0
                if (r1 != 0) goto L8
                return r2
            L8:
                androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.f1048p0
                boolean r0 = r0.isPopupShowing()
                r1 = 66
                r3 = 1
                if (r0 == 0) goto L7f
                androidx.appcompat.widget.SearchView r0 = r5.f1070Y
                androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.f1048p0
                int r0 = r0.getListSelection()
                r4 = -1
                if (r0 == r4) goto L7f
                androidx.appcompat.widget.SearchView r6 = r5.f1070Y
                android.app.SearchableInfo r0 = r6.f1041c1
                if (r0 != 0) goto L25
                goto L7e
            L25:
                r0.a r0 = r6.f1030R0
                if (r0 != 0) goto L2a
                goto L7e
            L2a:
                int r0 = r8.getAction()
                if (r0 != 0) goto L7e
                boolean r8 = r8.hasNoModifiers()
                if (r8 == 0) goto L7e
                if (r7 == r1) goto L74
                r8 = 84
                if (r7 == r8) goto L74
                r8 = 61
                if (r7 != r8) goto L41
                goto L74
            L41:
                r8 = 21
                if (r7 == r8) goto L54
                r0 = 22
                if (r7 != r0) goto L4a
                goto L54
            L4a:
                r8 = 19
                if (r7 != r8) goto L7e
                androidx.appcompat.widget.SearchView$SearchAutoComplete r6 = r6.f1048p0
                r6.getListSelection()
                goto L7e
            L54:
                if (r7 != r8) goto L58
                r7 = 0
                goto L5e
            L58:
                androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f1048p0
                int r7 = r7.length()
            L5e:
                androidx.appcompat.widget.SearchView$SearchAutoComplete r8 = r6.f1048p0
                r8.setSelection(r7)
                androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f1048p0
                r7.setListSelection(r2)
                androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f1048p0
                r7.clearListSelection()
                androidx.appcompat.widget.SearchView$SearchAutoComplete r6 = r6.f1048p0
                r6.m609a()
                r2 = 1
                goto L7e
            L74:
                androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f1048p0
                int r7 = r7.getListSelection()
                boolean r2 = r6.m598q(r7)
            L7e:
                return r2
            L7f:
                androidx.appcompat.widget.SearchView r0 = r5.f1070Y
                androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.f1048p0
                android.text.Editable r0 = r0.getText()
                int r0 = android.text.TextUtils.getTrimmedLength(r0)
                if (r0 != 0) goto L8f
                r0 = 1
                goto L90
            L8f:
                r0 = 0
            L90:
                if (r0 != 0) goto Lb4
                boolean r0 = r8.hasNoModifiers()
                if (r0 == 0) goto Lb4
                int r8 = r8.getAction()
                if (r8 != r3) goto Lb4
                if (r7 != r1) goto Lb4
                r6.cancelLongPress()
                androidx.appcompat.widget.SearchView r6 = r5.f1070Y
                r7 = 0
                androidx.appcompat.widget.SearchView$SearchAutoComplete r8 = r6.f1048p0
                android.text.Editable r8 = r8.getText()
                java.lang.String r8 = r8.toString()
                r6.m596o(r2, r7, r8)
                return r3
            Lb4:
                return r2
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    public class C0240h implements android.widget.TextView.OnEditorActionListener {

        /* renamed from: a */
        public final /* synthetic */ androidx.appcompat.widget.SearchView f1071a;

        public C0240h(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1071a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
                r0 = this;
                androidx.appcompat.widget.SearchView r1 = r0.f1071a
                r1.m603u()
                r1 = 1
                return r1
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    public class C0241i implements android.widget.AdapterView.OnItemClickListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.SearchView f1072Y;

        public C0241i(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1072Y = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                androidx.appcompat.widget.SearchView r1 = r0.f1072Y
                r1.m598q(r3)
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    public class C0242j implements android.widget.AdapterView.OnItemSelectedListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.SearchView f1073Y;

        public C0242j(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f1073Y = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                androidx.appcompat.widget.SearchView r1 = r0.f1073Y
                r1.m599r(r3)
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(android.widget.AdapterView<?> r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public interface InterfaceC0243k {
        /* renamed from: a */
        boolean m610a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface InterfaceC0244l {
        /* renamed from: a */
        boolean m611a(java.lang.String r1);

        /* renamed from: b */
        boolean m612b(java.lang.String r1);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface InterfaceC0245m {
        /* renamed from: a */
        boolean m613a(int r1);

        /* renamed from: b */
        boolean m614b(int r1);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public static class C0246n {

        /* renamed from: a */
        public java.lang.reflect.Method f1074a;

        /* renamed from: b */
        public java.lang.reflect.Method f1075b;

        /* renamed from: c */
        public java.lang.reflect.Method f1076c;

        @android.annotation.SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C0246n() {
                r6 = this;
                r6.<init>()
                r0 = 0
                r6.f1074a = r0
                r6.f1075b = r0
                r6.f1076c = r0
                m615a()
                r0 = 0
                r1 = 1
                java.lang.Class<android.widget.AutoCompleteTextView> r2 = android.widget.AutoCompleteTextView.class
                java.lang.String r3 = "doBeforeTextChanged"
                java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L1e
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L1e
                r6.f1074a = r2     // Catch: java.lang.NoSuchMethodException -> L1e
                r2.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L1e
            L1e:
                java.lang.Class<android.widget.AutoCompleteTextView> r2 = android.widget.AutoCompleteTextView.class
                java.lang.String r3 = "doAfterTextChanged"
                java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L2d
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L2d
                r6.f1075b = r2     // Catch: java.lang.NoSuchMethodException -> L2d
                r2.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L2d
            L2d:
                java.lang.Class<android.widget.AutoCompleteTextView> r2 = android.widget.AutoCompleteTextView.class
                java.lang.String r3 = "ensureImeVisible"
                java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L40
                java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L40
                r4[r0] = r5     // Catch: java.lang.NoSuchMethodException -> L40
                java.lang.reflect.Method r0 = r2.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L40
                r6.f1076c = r0     // Catch: java.lang.NoSuchMethodException -> L40
                r0.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L40
            L40:
                return
        }

        /* renamed from: a */
        public static void m615a() {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 >= r1) goto L7
                return
            L7:
                java.lang.UnsupportedClassVersionError r0 = new java.lang.UnsupportedClassVersionError
                java.lang.String r1 = "This function can only be used for API Level < 29."
                r0.<init>(r1)
                throw r0
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C0247o extends p320s0.AbstractC5943a {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.SearchView.C0247o> CREATOR = null;

        /* renamed from: a0 */
        public boolean f1077a0;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        public class a implements android.os.Parcelable.ClassLoaderCreator<androidx.appcompat.widget.SearchView.C0247o> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    androidx.appcompat.widget.SearchView$o r0 = new androidx.appcompat.widget.SearchView$o
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public androidx.appcompat.widget.SearchView.C0247o createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    androidx.appcompat.widget.SearchView$o r0 = new androidx.appcompat.widget.SearchView$o
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    androidx.appcompat.widget.SearchView$o[] r1 = new androidx.appcompat.widget.SearchView.C0247o[r1]
                    return r1
            }
        }

        static {
                androidx.appcompat.widget.SearchView$o$a r0 = new androidx.appcompat.widget.SearchView$o$a
                r0.<init>()
                androidx.appcompat.widget.SearchView.C0247o.CREATOR = r0
                return
        }

        public C0247o(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r2 = 0
                java.lang.Object r1 = r1.readValue(r2)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r0.f1077a0 = r1
                return
        }

        public C0247o(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "SearchView.SavedState{"
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " isIconified="
                r0.append(r1)
                boolean r1 = r2.f1077a0
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // p320s0.AbstractC5943a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                android.os.Parcelable r0 = r1.f22819Y
                r2.writeParcelable(r0, r3)
                boolean r3 = r1.f1077a0
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r2.writeValue(r3)
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    public static class C0248p extends android.view.TouchDelegate {

        /* renamed from: a */
        public final android.view.View f1078a;

        /* renamed from: b */
        public final android.graphics.Rect f1079b;

        /* renamed from: c */
        public final android.graphics.Rect f1080c;

        /* renamed from: d */
        public final android.graphics.Rect f1081d;

        /* renamed from: e */
        public final int f1082e;

        /* renamed from: f */
        public boolean f1083f;

        public C0248p(android.graphics.Rect r2, android.graphics.Rect r3, android.view.View r4) {
                r1 = this;
                r1.<init>(r2, r4)
                android.content.Context r0 = r4.getContext()
                android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
                int r0 = r0.getScaledTouchSlop()
                r1.f1082e = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.f1079b = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.f1081d = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.f1080c = r0
                r1.m616a(r2, r3)
                r1.f1078a = r4
                return
        }

        /* renamed from: a */
        public void m616a(android.graphics.Rect r3, android.graphics.Rect r4) {
                r2 = this;
                android.graphics.Rect r0 = r2.f1079b
                r0.set(r3)
                android.graphics.Rect r0 = r2.f1081d
                r0.set(r3)
                android.graphics.Rect r3 = r2.f1081d
                int r0 = r2.f1082e
                int r1 = -r0
                int r0 = -r0
                r3.inset(r1, r0)
                android.graphics.Rect r3 = r2.f1080c
                r3.set(r4)
                return
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(android.view.MotionEvent r8) {
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L32
                if (r2 == r4) goto L20
                if (r2 == r3) goto L20
                r6 = 3
                if (r2 == r6) goto L1b
                goto L3d
            L1b:
                boolean r2 = r7.f1083f
                r7.f1083f = r5
                goto L2f
            L20:
                boolean r2 = r7.f1083f
                if (r2 == 0) goto L2f
                android.graphics.Rect r6 = r7.f1081d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L2f
                r4 = r2
                r2 = 0
                goto L3f
            L2f:
                r4 = r2
            L30:
                r2 = 1
                goto L3f
            L32:
                android.graphics.Rect r2 = r7.f1079b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L3d
                r7.f1083f = r4
                goto L30
            L3d:
                r2 = 1
                r4 = 0
            L3f:
                if (r4 == 0) goto L6e
                if (r2 == 0) goto L5b
                android.graphics.Rect r2 = r7.f1080c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L5b
                android.view.View r0 = r7.f1078a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f1078a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L64
            L5b:
                android.graphics.Rect r2 = r7.f1080c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L64:
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                android.view.View r0 = r7.f1078a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L6e:
                return r5
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto Lc
            androidx.appcompat.widget.SearchView$n r0 = new androidx.appcompat.widget.SearchView$n
            r0.<init>()
            goto Ld
        Lc:
            r0 = 0
        Ld:
            androidx.appcompat.widget.SearchView.f1012j1 = r0
            return
    }

    public SearchView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SearchView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130969418(0x7f04034a, float:1.7547517E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public SearchView(android.content.Context r18, android.util.AttributeSet r19, int r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r17.<init>(r18, r19, r20)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f1058z0 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f1013A0 = r2
            r2 = 2
            int[] r3 = new int[r2]
            r0.f1014B0 = r3
            int[] r3 = new int[r2]
            r0.f1015C0 = r3
            androidx.appcompat.widget.SearchView$b r3 = new androidx.appcompat.widget.SearchView$b
            r3.<init>(r0)
            r0.f1043e1 = r3
            androidx.appcompat.widget.SearchView$c r3 = new androidx.appcompat.widget.SearchView$c
            r3.<init>(r0)
            r0.f1044f1 = r3
            java.util.WeakHashMap r3 = new java.util.WeakHashMap
            r3.<init>()
            r0.f1045g1 = r3
            androidx.appcompat.widget.SearchView$f r3 = new androidx.appcompat.widget.SearchView$f
            r3.<init>(r0)
            androidx.appcompat.widget.SearchView$g r4 = new androidx.appcompat.widget.SearchView$g
            r4.<init>(r0)
            r0.f1046h1 = r4
            androidx.appcompat.widget.SearchView$h r4 = new androidx.appcompat.widget.SearchView$h
            r4.<init>(r0)
            androidx.appcompat.widget.SearchView$i r5 = new androidx.appcompat.widget.SearchView$i
            r5.<init>(r0)
            androidx.appcompat.widget.SearchView$j r6 = new androidx.appcompat.widget.SearchView$j
            r6.<init>(r0)
            androidx.appcompat.widget.SearchView$a r7 = new androidx.appcompat.widget.SearchView$a
            r7.<init>(r0)
            r0.f1047i1 = r7
            int[] r7 = p064e.C1495i.f7277t
            androidx.appcompat.widget.y0 r8 = new androidx.appcompat.widget.y0
            r9 = 0
            r10 = r19
            r11 = r20
            android.content.res.TypedArray r7 = r1.obtainStyledAttributes(r10, r7, r11, r9)
            r8.<init>(r1, r7)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r18)
            r10 = 9
            r11 = 2131558425(0x7f0d0019, float:1.8742165E38)
            int r10 = r8.m861m(r10, r11)
            r11 = 1
            r1.inflate(r10, r0, r11)
            r1 = 2131362566(0x7f0a0306, float:1.8344916E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = (androidx.appcompat.widget.SearchView.SearchAutoComplete) r1
            r0.f1048p0 = r1
            r1.setSearchView(r0)
            r10 = 2131362562(0x7f0a0302, float:1.8344908E38)
            android.view.View r10 = r0.findViewById(r10)
            r0.f1049q0 = r10
            r10 = 2131362565(0x7f0a0305, float:1.8344914E38)
            android.view.View r10 = r0.findViewById(r10)
            r0.f1050r0 = r10
            r12 = 2131362635(0x7f0a034b, float:1.8345056E38)
            android.view.View r12 = r0.findViewById(r12)
            r0.f1051s0 = r12
            r13 = 2131362560(0x7f0a0300, float:1.8344904E38)
            android.view.View r13 = r0.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r0.f1052t0 = r13
            r14 = 2131362563(0x7f0a0303, float:1.834491E38)
            android.view.View r14 = r0.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r0.f1053u0 = r14
            r15 = 2131362561(0x7f0a0301, float:1.8344906E38)
            android.view.View r15 = r0.findViewById(r15)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r0.f1054v0 = r15
            r2 = 2131362567(0x7f0a0307, float:1.8344918E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f1055w0 = r2
            r11 = 2131362564(0x7f0a0304, float:1.8344912E38)
            android.view.View r11 = r0.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r0.f1016D0 = r11
            r9 = 10
            android.graphics.drawable.Drawable r9 = r8.m855g(r9)
            java.util.WeakHashMap<android.view.View, n0.w> r16 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10569q(r10, r9)
            r9 = 14
            android.graphics.drawable.Drawable r9 = r8.m855g(r9)
            p227n0.C4661t.c.m10569q(r12, r9)
            r9 = 13
            android.graphics.drawable.Drawable r10 = r8.m855g(r9)
            r13.setImageDrawable(r10)
            r10 = 7
            android.graphics.drawable.Drawable r10 = r8.m855g(r10)
            r14.setImageDrawable(r10)
            r10 = 4
            android.graphics.drawable.Drawable r10 = r8.m855g(r10)
            r15.setImageDrawable(r10)
            r10 = 16
            android.graphics.drawable.Drawable r10 = r8.m855g(r10)
            r2.setImageDrawable(r10)
            android.graphics.drawable.Drawable r9 = r8.m855g(r9)
            r11.setImageDrawable(r9)
            r9 = 12
            android.graphics.drawable.Drawable r9 = r8.m855g(r9)
            r0.f1017E0 = r9
            android.content.res.Resources r9 = r17.getResources()
            r10 = 2131951637(0x7f130015, float:1.9539694E38)
            java.lang.String r9 = r9.getString(r10)
            androidx.appcompat.widget.C0263b1.m693a(r13, r9)
            r9 = 15
            r10 = 2131558424(0x7f0d0018, float:1.8742163E38)
            int r9 = r8.m861m(r9, r10)
            r0.f1018F0 = r9
            r9 = 5
            r10 = 0
            int r9 = r8.m861m(r9, r10)
            r0.f1019G0 = r9
            r13.setOnClickListener(r3)
            r15.setOnClickListener(r3)
            r14.setOnClickListener(r3)
            r2.setOnClickListener(r3)
            r1.setOnClickListener(r3)
            android.text.TextWatcher r2 = r0.f1047i1
            r1.addTextChangedListener(r2)
            r1.setOnEditorActionListener(r4)
            r1.setOnItemClickListener(r5)
            r1.setOnItemSelectedListener(r6)
            android.view.View$OnKeyListener r2 = r0.f1046h1
            r1.setOnKeyListener(r2)
            androidx.appcompat.widget.SearchView$d r2 = new androidx.appcompat.widget.SearchView$d
            r2.<init>(r0)
            r1.setOnFocusChangeListener(r2)
            r2 = 8
            r3 = 1
            boolean r2 = r8.m849a(r2, r3)
            r0.setIconifiedByDefault(r2)
            r2 = -1
            int r4 = r8.m854f(r3, r2)
            if (r4 == r2) goto L17a
            r0.setMaxWidth(r4)
        L17a:
            r3 = 6
            java.lang.CharSequence r3 = r8.m863o(r3)
            r0.f1022J0 = r3
            r3 = 11
            java.lang.CharSequence r3 = r8.m863o(r3)
            r0.f1032T0 = r3
            r3 = 3
            int r3 = r8.m858j(r3, r2)
            if (r3 == r2) goto L193
            r0.setImeOptions(r3)
        L193:
            r3 = 2
            int r3 = r8.m858j(r3, r2)
            if (r3 == r2) goto L19d
            r0.setInputType(r3)
        L19d:
            r2 = 1
            r3 = 0
            boolean r2 = r8.m849a(r3, r2)
            r0.setFocusable(r2)
            r7.recycle()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.speech.action.WEB_SEARCH"
            r2.<init>(r3)
            r0.f1020H0 = r2
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r3)
            java.lang.String r4 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r5 = "web_search"
            r2.putExtra(r4, r5)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "android.speech.action.RECOGNIZE_SPEECH"
            r2.<init>(r4)
            r0.f1021I0 = r2
            r2.addFlags(r3)
            int r1 = r1.getDropDownAnchor()
            android.view.View r1 = r0.findViewById(r1)
            r0.f1056x0 = r1
            if (r1 == 0) goto L1de
            androidx.appcompat.widget.SearchView$e r2 = new androidx.appcompat.widget.SearchView$e
            r2.<init>(r0)
            r1.addOnLayoutChangeListener(r2)
        L1de:
            boolean r1 = r0.f1028P0
            r0.m589A(r1)
            r17.m606x()
            return
    }

    private int getPreferredHeight() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165238(0x7f070036, float:1.7944687E38)
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
    }

    private int getPreferredWidth() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165239(0x7f070037, float:1.794469E38)
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
    }

    private void setQuery(java.lang.CharSequence r3) {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1048p0
            r0.setText(r3)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1048p0
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto Lf
            r3 = 0
            goto L13
        Lf:
            int r3 = r3.length()
        L13:
            r0.setSelection(r3)
            return
    }

    /* renamed from: A */
    public final void m589A(boolean r6) {
            r5 = this;
            r5.f1029Q0 = r6
            r0 = 0
            r1 = 8
            if (r6 == 0) goto L9
            r2 = 0
            goto Lb
        L9:
            r2 = 8
        Lb:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r5.f1048p0
            android.text.Editable r3 = r3.getText()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r3 = r3 ^ 1
            android.widget.ImageView r4 = r5.f1052t0
            r4.setVisibility(r2)
            r5.m608z(r3)
            android.view.View r2 = r5.f1049q0
            if (r6 == 0) goto L26
            r6 = 8
            goto L27
        L26:
            r6 = 0
        L27:
            r2.setVisibility(r6)
            android.widget.ImageView r6 = r5.f1016D0
            android.graphics.drawable.Drawable r6 = r6.getDrawable()
            if (r6 == 0) goto L36
            boolean r6 = r5.f1028P0
            if (r6 == 0) goto L38
        L36:
            r0 = 8
        L38:
            android.widget.ImageView r6 = r5.f1016D0
            r6.setVisibility(r0)
            r5.m604v()
            r6 = r3 ^ 1
            r5.m590B(r6)
            r5.m607y()
            return
    }

    /* renamed from: B */
    public final void m590B(boolean r3) {
            r2 = this;
            boolean r0 = r2.f1036X0
            r1 = 8
            if (r0 == 0) goto L13
            boolean r0 = r2.f1029Q0
            if (r0 != 0) goto L13
            if (r3 == 0) goto L13
            r3 = 0
            android.widget.ImageView r0 = r2.f1053u0
            r0.setVisibility(r1)
            r1 = 0
        L13:
            android.widget.ImageView r3 = r2.f1055w0
            r3.setVisibility(r1)
            return
    }

    @Override // p177k.InterfaceC3618b
    /* renamed from: c */
    public void mo591c() {
            r3 = this;
            boolean r0 = r3.f1039a1
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.f1039a1 = r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1048p0
            int r0 = r0.getImeOptions()
            r3.f1040b1 = r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r3.f1048p0
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 | r2
            r1.setImeOptions(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1048p0
            java.lang.String r1 = ""
            r0.setText(r1)
            r0 = 0
            r3.setIconified(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
            r2 = this;
            r0 = 1
            r2.f1034V0 = r0
            super.clearFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1048p0
            r0.clearFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1048p0
            r1 = 0
            r0.setImeVisibility(r1)
            r2.f1034V0 = r1
            return
    }

    @Override // p177k.InterfaceC3618b
    /* renamed from: e */
    public void mo592e() {
            r3 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1048p0
            java.lang.String r1 = ""
            r0.setText(r1)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1048p0
            int r2 = r0.length()
            r0.setSelection(r2)
            r3.f1038Z0 = r1
            r3.clearFocus()
            r0 = 1
            r3.m589A(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1048p0
            int r1 = r3.f1040b1
            r0.setImeOptions(r1)
            r0 = 0
            r3.f1039a1 = r0
            return
    }

    public int getImeOptions() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.f1048p0
            int r0 = r0.getImeOptions()
            return r0
    }

    public int getInputType() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.f1048p0
            int r0 = r0.getInputType()
            return r0
    }

    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.f1035W0
            return r0
    }

    public java.lang.CharSequence getQuery() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.f1048p0
            android.text.Editable r0 = r0.getText()
            return r0
    }

    public java.lang.CharSequence getQueryHint() {
            r2 = this;
            java.lang.CharSequence r0 = r2.f1032T0
            if (r0 == 0) goto L5
            goto L20
        L5:
            android.app.SearchableInfo r0 = r2.f1041c1
            if (r0 == 0) goto L1e
            int r0 = r0.getHintId()
            if (r0 == 0) goto L1e
            android.content.Context r0 = r2.getContext()
            android.app.SearchableInfo r1 = r2.f1041c1
            int r1 = r1.getHintId()
            java.lang.CharSequence r0 = r0.getText(r1)
            goto L20
        L1e:
            java.lang.CharSequence r0 = r2.f1022J0
        L20:
            return r0
    }

    public int getSuggestionCommitIconResId() {
            r1 = this;
            int r0 = r1.f1019G0
            return r0
    }

    public int getSuggestionRowLayout() {
            r1 = this;
            int r0 = r1.f1018F0
            return r0
    }

    public p300r0.AbstractC5758a getSuggestionsAdapter() {
            r1 = this;
            r0.a r0 = r1.f1030R0
            return r0
    }

    /* renamed from: l */
    public final android.content.Intent m593l(java.lang.String r2, android.net.Uri r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7) {
            r1 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2)
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r2)
            if (r3 == 0) goto Lf
            r0.setData(r3)
        Lf:
            java.lang.CharSequence r2 = r1.f1038Z0
            java.lang.String r3 = "user_query"
            r0.putExtra(r3, r2)
            if (r5 == 0) goto L1d
            java.lang.String r2 = "query"
            r0.putExtra(r2, r5)
        L1d:
            if (r4 == 0) goto L24
            java.lang.String r2 = "intent_extra_data_key"
            r0.putExtra(r2, r4)
        L24:
            android.os.Bundle r2 = r1.f1042d1
            if (r2 == 0) goto L2d
            java.lang.String r3 = "app_data"
            r0.putExtra(r3, r2)
        L2d:
            if (r6 == 0) goto L39
            java.lang.String r2 = "action_key"
            r0.putExtra(r2, r6)
            java.lang.String r2 = "action_msg"
            r0.putExtra(r2, r7)
        L39:
            android.app.SearchableInfo r2 = r1.f1041c1
            android.content.ComponentName r2 = r2.getSearchActivity()
            r0.setComponent(r2)
            return r0
    }

    /* renamed from: m */
    public final android.content.Intent m594m(android.content.Intent r10, android.app.SearchableInfo r11) {
            r9 = this;
            android.content.ComponentName r0 = r11.getSearchActivity()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.SEARCH"
            r1.<init>(r2)
            r1.setComponent(r0)
            android.content.Context r2 = r9.getContext()
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r2, r3, r1, r4)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.os.Bundle r3 = r9.f1042d1
            if (r3 == 0) goto L27
            java.lang.String r4 = "app_data"
            r2.putParcelable(r4, r3)
        L27:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r10)
            r10 = 1
            android.content.res.Resources r4 = r9.getResources()
            int r5 = r11.getVoiceLanguageModeId()
            if (r5 == 0) goto L40
            int r5 = r11.getVoiceLanguageModeId()
            java.lang.String r5 = r4.getString(r5)
            goto L42
        L40:
            java.lang.String r5 = "free_form"
        L42:
            int r6 = r11.getVoicePromptTextId()
            r7 = 0
            if (r6 == 0) goto L52
            int r6 = r11.getVoicePromptTextId()
            java.lang.String r6 = r4.getString(r6)
            goto L53
        L52:
            r6 = r7
        L53:
            int r8 = r11.getVoiceLanguageId()
            if (r8 == 0) goto L62
            int r8 = r11.getVoiceLanguageId()
            java.lang.String r4 = r4.getString(r8)
            goto L63
        L62:
            r4 = r7
        L63:
            int r8 = r11.getVoiceMaxResults()
            if (r8 == 0) goto L6d
            int r10 = r11.getVoiceMaxResults()
        L6d:
            java.lang.String r11 = "android.speech.extra.LANGUAGE_MODEL"
            r3.putExtra(r11, r5)
            java.lang.String r11 = "android.speech.extra.PROMPT"
            r3.putExtra(r11, r6)
            java.lang.String r11 = "android.speech.extra.LANGUAGE"
            r3.putExtra(r11, r4)
            java.lang.String r11 = "android.speech.extra.MAX_RESULTS"
            r3.putExtra(r11, r10)
            if (r0 != 0) goto L84
            goto L88
        L84:
            java.lang.String r7 = r0.flattenToShortString()
        L88:
            java.lang.String r10 = "calling_package"
            r3.putExtra(r10, r7)
            java.lang.String r10 = "android.speech.extra.RESULTS_PENDINGINTENT"
            r3.putExtra(r10, r1)
            java.lang.String r10 = "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"
            r3.putExtra(r10, r2)
            return r3
    }

    /* renamed from: n */
    public void m595n() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lc
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r4.f1048p0
            r0.refreshAutoCompleteResults()
            goto L33
        Lc:
            androidx.appcompat.widget.SearchView$n r0 = androidx.appcompat.widget.SearchView.f1012j1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r4.f1048p0
            java.util.Objects.requireNonNull(r0)
            androidx.appcompat.widget.SearchView.C0246n.m615a()
            java.lang.reflect.Method r0 = r0.f1074a
            r2 = 0
            if (r0 == 0) goto L20
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L20
            r0.invoke(r1, r3)     // Catch: java.lang.Exception -> L20
        L20:
            androidx.appcompat.widget.SearchView$n r0 = androidx.appcompat.widget.SearchView.f1012j1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r4.f1048p0
            java.util.Objects.requireNonNull(r0)
            androidx.appcompat.widget.SearchView.C0246n.m615a()
            java.lang.reflect.Method r0 = r0.f1075b
            if (r0 == 0) goto L33
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L33
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L33
        L33:
            return
    }

    /* renamed from: o */
    public void m596o(int r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            java.lang.String r1 = "android.intent.action.SEARCH"
            r2 = 0
            r3 = 0
            r6 = 0
            r0 = r7
            r4 = r10
            r5 = r8
            android.content.Intent r8 = r0.m593l(r1, r2, r3, r4, r5, r6)
            android.content.Context r9 = r7.getContext()
            r9.startActivity(r8)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            java.lang.Runnable r0 = r1.f1043e1
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.f1044f1
            r1.post(r0)
            super.onDetachedFromWindow()
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            super.onLayout(r4, r5, r6, r7, r8)
            if (r4 == 0) goto L58
            androidx.appcompat.widget.SearchView$SearchAutoComplete r4 = r3.f1048p0
            android.graphics.Rect r5 = r3.f1058z0
            int[] r7 = r3.f1014B0
            r4.getLocationInWindow(r7)
            int[] r7 = r3.f1015C0
            r3.getLocationInWindow(r7)
            int[] r7 = r3.f1014B0
            r0 = 1
            r1 = r7[r0]
            int[] r2 = r3.f1015C0
            r0 = r2[r0]
            int r1 = r1 - r0
            r0 = 0
            r7 = r7[r0]
            r2 = r2[r0]
            int r7 = r7 - r2
            int r2 = r4.getWidth()
            int r2 = r2 + r7
            int r4 = r4.getHeight()
            int r4 = r4 + r1
            r5.set(r7, r1, r2, r4)
            android.graphics.Rect r4 = r3.f1013A0
            android.graphics.Rect r5 = r3.f1058z0
            int r7 = r5.left
            int r5 = r5.right
            int r8 = r8 - r6
            r4.set(r7, r0, r5, r8)
            androidx.appcompat.widget.SearchView$p r4 = r3.f1057y0
            if (r4 != 0) goto L51
            androidx.appcompat.widget.SearchView$p r4 = new androidx.appcompat.widget.SearchView$p
            android.graphics.Rect r5 = r3.f1013A0
            android.graphics.Rect r6 = r3.f1058z0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r3.f1048p0
            r4.<init>(r5, r6, r7)
            r3.f1057y0 = r4
            r3.setTouchDelegate(r4)
            goto L58
        L51:
            android.graphics.Rect r5 = r3.f1013A0
            android.graphics.Rect r6 = r3.f1058z0
            r4.m616a(r5, r6)
        L58:
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.f1029Q0
            if (r0 == 0) goto L8
            super.onMeasure(r4, r5)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1b
            goto L37
        L1b:
            int r0 = r3.f1035W0
            if (r0 <= 0) goto L37
            goto L2e
        L20:
            int r4 = r3.f1035W0
            if (r4 <= 0) goto L25
            goto L37
        L25:
            int r4 = r3.getPreferredWidth()
            goto L37
        L2a:
            int r0 = r3.f1035W0
            if (r0 <= 0) goto L2f
        L2e:
            goto L33
        L2f:
            int r0 = r3.getPreferredWidth()
        L33:
            int r4 = java.lang.Math.min(r0, r4)
        L37:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L49
            if (r0 == 0) goto L44
            goto L51
        L44:
            int r5 = r3.getPreferredHeight()
            goto L51
        L49:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L51:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.appcompat.widget.SearchView.C0247o
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            androidx.appcompat.widget.SearchView$o r2 = (androidx.appcompat.widget.SearchView.C0247o) r2
            android.os.Parcelable r0 = r2.f22819Y
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.f1077a0
            r1.m589A(r2)
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.appcompat.widget.SearchView$o r1 = new androidx.appcompat.widget.SearchView$o
            r1.<init>(r0)
            boolean r0 = r2.f1029Q0
            r1.f1077a0 = r0
            return r1
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean r1) {
            r0 = this;
            super.onWindowFocusChanged(r1)
            java.lang.Runnable r1 = r0.f1043e1
            r0.post(r1)
            return
    }

    /* renamed from: p */
    public void m597p() {
            r3 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1048p0
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 == 0) goto L22
            boolean r0 = r3.f1028P0
            if (r0 == 0) goto L33
            androidx.appcompat.widget.SearchView$k r0 = r3.f1024L0
            if (r0 == 0) goto L1b
            boolean r0 = r0.m610a()
            if (r0 != 0) goto L33
        L1b:
            r3.clearFocus()
            r3.m589A(r1)
            goto L33
        L22:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1048p0
            java.lang.String r2 = ""
            r0.setText(r2)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1048p0
            r0.requestFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1048p0
            r0.setImeVisibility(r1)
        L33:
            return
    }

    /* renamed from: q */
    public boolean m598q(int r11) {
            r10 = this;
            androidx.appcompat.widget.SearchView$m r0 = r10.f1026N0
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r0 = r0.m614b(r11)
            if (r0 != 0) goto Lc
            goto Ld
        Lc:
            return r1
        Ld:
            r7 = 0
            r8 = 0
            java.lang.String r0 = "SearchView"
            r0.a r2 = r10.f1030R0
            android.database.Cursor r9 = r2.f22169a0
            if (r9 == 0) goto Ld2
            boolean r11 = r9.moveToPosition(r11)
            if (r11 == 0) goto Ld2
            r11 = 0
            java.lang.String r2 = "suggest_intent_action"
            int r3 = androidx.appcompat.widget.ViewOnClickListenerC0302s0.f1413w0     // Catch: java.lang.RuntimeException -> L92
            int r2 = r9.getColumnIndex(r2)     // Catch: java.lang.RuntimeException -> L92
            java.lang.String r2 = androidx.appcompat.widget.ViewOnClickListenerC0302s0.m778h(r9, r2)     // Catch: java.lang.RuntimeException -> L92
            if (r2 != 0) goto L32
            android.app.SearchableInfo r2 = r10.f1041c1     // Catch: java.lang.RuntimeException -> L92
            java.lang.String r2 = r2.getSuggestIntentAction()     // Catch: java.lang.RuntimeException -> L92
        L32:
            if (r2 != 0) goto L36
            java.lang.String r2 = "android.intent.action.SEARCH"
        L36:
            r3 = r2
            java.lang.String r2 = "suggest_intent_data"
            int r2 = r9.getColumnIndex(r2)     // Catch: java.lang.RuntimeException -> L92
            java.lang.String r2 = androidx.appcompat.widget.ViewOnClickListenerC0302s0.m778h(r9, r2)     // Catch: java.lang.RuntimeException -> L92
            if (r2 != 0) goto L49
            android.app.SearchableInfo r2 = r10.f1041c1     // Catch: java.lang.RuntimeException -> L92
            java.lang.String r2 = r2.getSuggestIntentData()     // Catch: java.lang.RuntimeException -> L92
        L49:
            if (r2 == 0) goto L6f
            java.lang.String r4 = "suggest_intent_data_id"
            int r4 = r9.getColumnIndex(r4)     // Catch: java.lang.RuntimeException -> L92
            java.lang.String r4 = androidx.appcompat.widget.ViewOnClickListenerC0302s0.m778h(r9, r4)     // Catch: java.lang.RuntimeException -> L92
            if (r4 == 0) goto L6f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L92
            r5.<init>()     // Catch: java.lang.RuntimeException -> L92
            r5.append(r2)     // Catch: java.lang.RuntimeException -> L92
            java.lang.String r2 = "/"
            r5.append(r2)     // Catch: java.lang.RuntimeException -> L92
            java.lang.String r2 = android.net.Uri.encode(r4)     // Catch: java.lang.RuntimeException -> L92
            r5.append(r2)     // Catch: java.lang.RuntimeException -> L92
            java.lang.String r2 = r5.toString()     // Catch: java.lang.RuntimeException -> L92
        L6f:
            if (r2 != 0) goto L73
            r4 = r11
            goto L78
        L73:
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.RuntimeException -> L92
            r4 = r2
        L78:
            java.lang.String r2 = "suggest_intent_query"
            int r2 = r9.getColumnIndex(r2)     // Catch: java.lang.RuntimeException -> L92
            java.lang.String r6 = androidx.appcompat.widget.ViewOnClickListenerC0302s0.m778h(r9, r2)     // Catch: java.lang.RuntimeException -> L92
            java.lang.String r2 = "suggest_intent_extra_data"
            int r2 = r9.getColumnIndex(r2)     // Catch: java.lang.RuntimeException -> L92
            java.lang.String r5 = androidx.appcompat.widget.ViewOnClickListenerC0302s0.m778h(r9, r2)     // Catch: java.lang.RuntimeException -> L92
            r2 = r10
            android.content.Intent r11 = r2.m593l(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L92
            goto Lb2
        L92:
            r2 = move-exception
            int r3 = r9.getPosition()     // Catch: java.lang.RuntimeException -> L98
            goto L99
        L98:
            r3 = -1
        L99:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Search suggestions cursor at row "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = " returned exception."
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r0, r3, r2)
        Lb2:
            if (r11 != 0) goto Lb5
            goto Ld2
        Lb5:
            android.content.Context r2 = r10.getContext()     // Catch: java.lang.RuntimeException -> Lbd
            r2.startActivity(r11)     // Catch: java.lang.RuntimeException -> Lbd
            goto Ld2
        Lbd:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed launch activity: "
            r3.append(r4)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            android.util.Log.e(r0, r11, r2)
        Ld2:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r11 = r10.f1048p0
            r11.setImeVisibility(r1)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r11 = r10.f1048p0
            r11.dismissDropDown()
            r11 = 1
            return r11
    }

    /* renamed from: r */
    public boolean m599r(int r3) {
            r2 = this;
            androidx.appcompat.widget.SearchView$m r0 = r2.f1026N0
            if (r0 == 0) goto Ld
            boolean r0 = r0.m613a(r3)
            if (r0 != 0) goto Lb
            goto Ld
        Lb:
            r3 = 0
            return r3
        Ld:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1048p0
            android.text.Editable r0 = r0.getText()
            r0.a r1 = r2.f1030R0
            android.database.Cursor r1 = r1.f22169a0
            if (r1 != 0) goto L1a
            goto L2f
        L1a:
            boolean r3 = r1.moveToPosition(r3)
            if (r3 == 0) goto L2c
            r0.a r3 = r2.f1030R0
            java.lang.CharSequence r3 = r3.mo781c(r1)
            if (r3 == 0) goto L2c
            r2.setQuery(r3)
            goto L2f
        L2c:
            r2.setQuery(r0)
        L2f:
            r3 = 1
            return r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int r3, android.graphics.Rect r4) {
            r2 = this;
            boolean r0 = r2.f1034V0
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r2.isFocusable()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            boolean r0 = r2.f1029Q0
            if (r0 != 0) goto L1d
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1048p0
            boolean r3 = r0.requestFocus(r3, r4)
            if (r3 == 0) goto L1c
            r2.m589A(r1)
        L1c:
            return r3
        L1d:
            boolean r3 = super.requestFocus(r3, r4)
            return r3
    }

    /* renamed from: s */
    public void m600s(java.lang.CharSequence r1) {
            r0 = this;
            r0.setQuery(r1)
            return
    }

    public void setAppSearchData(android.os.Bundle r1) {
            r0 = this;
            r0.f1042d1 = r1
            return
    }

    public void setIconified(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L6
            r0.m597p()
            goto L9
        L6:
            r0.m602t()
        L9:
            return
    }

    public void setIconifiedByDefault(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1028P0
            if (r0 != r2) goto L5
            return
        L5:
            r1.f1028P0 = r2
            r1.m589A(r2)
            r1.m606x()
            return
    }

    public void setImeOptions(int r2) {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.f1048p0
            r0.setImeOptions(r2)
            return
    }

    public void setInputType(int r2) {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.f1048p0
            r0.setInputType(r2)
            return
    }

    public void setMaxWidth(int r1) {
            r0 = this;
            r0.f1035W0 = r1
            r0.requestLayout()
            return
    }

    public void setOnCloseListener(androidx.appcompat.widget.SearchView.InterfaceC0243k r1) {
            r0 = this;
            r0.f1024L0 = r1
            return
    }

    /* renamed from: setOnQueryTextFocusChangeListener */
    public void m601x358a61a8(android.view.View.OnFocusChangeListener r1) {
            r0 = this;
            r0.f1025M0 = r1
            return
    }

    public void setOnQueryTextListener(androidx.appcompat.widget.SearchView.InterfaceC0244l r1) {
            r0 = this;
            r0.f1023K0 = r1
            return
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.f1027O0 = r1
            return
    }

    public void setOnSuggestionListener(androidx.appcompat.widget.SearchView.InterfaceC0245m r1) {
            r0 = this;
            r0.f1026N0 = r1
            return
    }

    public void setQueryHint(java.lang.CharSequence r1) {
            r0 = this;
            r0.f1032T0 = r1
            r0.m606x()
            return
    }

    public void setQueryRefinementEnabled(boolean r3) {
            r2 = this;
            r2.f1033U0 = r3
            r0.a r0 = r2.f1030R0
            boolean r1 = r0 instanceof androidx.appcompat.widget.ViewOnClickListenerC0302s0
            if (r1 == 0) goto L11
            androidx.appcompat.widget.s0 r0 = (androidx.appcompat.widget.ViewOnClickListenerC0302s0) r0
            if (r3 == 0) goto Le
            r3 = 2
            goto Lf
        Le:
            r3 = 1
        Lf:
            r0.f1419o0 = r3
        L11:
            return
    }

    public void setSearchableInfo(android.app.SearchableInfo r7) {
            r6 = this;
            r6.f1041c1 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.1835E-41)
            r2 = 0
            if (r7 == 0) goto L6e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f1048p0
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f1048p0
            android.app.SearchableInfo r3 = r6.f1041c1
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f1041c1
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L36
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f1041c1
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L36
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L36:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f1048p0
            r3.setInputType(r7)
            r0.a r7 = r6.f1030R0
            if (r7 == 0) goto L42
            r7.mo780b(r2)
        L42:
            android.app.SearchableInfo r7 = r6.f1041c1
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L6b
            androidx.appcompat.widget.s0 r7 = new androidx.appcompat.widget.s0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f1041c1
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f1045g1
            r7.<init>(r3, r6, r4, r5)
            r6.f1030R0 = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f1048p0
            r3.setAdapter(r7)
            r0.a r7 = r6.f1030R0
            androidx.appcompat.widget.s0 r7 = (androidx.appcompat.widget.ViewOnClickListenerC0302s0) r7
            boolean r3 = r6.f1033U0
            if (r3 == 0) goto L68
            r3 = 2
            goto L69
        L68:
            r3 = 1
        L69:
            r7.f1419o0 = r3
        L6b:
            r6.m606x()
        L6e:
            android.app.SearchableInfo r7 = r6.f1041c1
            r3 = 0
            if (r7 == 0) goto L9f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L9f
            android.app.SearchableInfo r7 = r6.f1041c1
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L84
            android.content.Intent r2 = r6.f1020H0
            goto L8e
        L84:
            android.app.SearchableInfo r7 = r6.f1041c1
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L8e
            android.content.Intent r2 = r6.f1021I0
        L8e:
            if (r2 == 0) goto L9f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L9f
            goto La0
        L9f:
            r0 = 0
        La0:
            r6.f1036X0 = r0
            if (r0 == 0) goto Lab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f1048p0
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        Lab:
            boolean r7 = r6.f1029Q0
            r6.m589A(r7)
            return
    }

    public void setSubmitButtonEnabled(boolean r1) {
            r0 = this;
            r0.f1031S0 = r1
            boolean r1 = r0.f1029Q0
            r0.m589A(r1)
            return
    }

    public void setSuggestionsAdapter(p300r0.AbstractC5758a r2) {
            r1 = this;
            r1.f1030R0 = r2
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.f1048p0
            r0.setAdapter(r2)
            return
    }

    /* renamed from: t */
    public void m602t() {
            r2 = this;
            r0 = 0
            r2.m589A(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1048p0
            r0.requestFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1048p0
            r1 = 1
            r0.setImeVisibility(r1)
            android.view.View$OnClickListener r0 = r2.f1027O0
            if (r0 == 0) goto L16
            r0.onClick(r2)
        L16:
            return
    }

    /* renamed from: u */
    public void m603u() {
            r3 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1048p0
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L33
            int r1 = android.text.TextUtils.getTrimmedLength(r0)
            if (r1 <= 0) goto L33
            androidx.appcompat.widget.SearchView$l r1 = r3.f1023K0
            if (r1 == 0) goto L1c
            java.lang.String r2 = r0.toString()
            boolean r1 = r1.m612b(r2)
            if (r1 != 0) goto L33
        L1c:
            android.app.SearchableInfo r1 = r3.f1041c1
            r2 = 0
            if (r1 == 0) goto L29
            r1 = 0
            java.lang.String r0 = r0.toString()
            r3.m596o(r2, r1, r0)
        L29:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1048p0
            r0.setImeVisibility(r2)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f1048p0
            r0.dismissDropDown()
        L33:
            return
    }

    /* renamed from: v */
    public final void m604v() {
            r4 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r4.f1048p0
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 != 0) goto L19
            boolean r3 = r4.f1028P0
            if (r3 == 0) goto L18
            boolean r3 = r4.f1039a1
            if (r3 != 0) goto L18
            goto L19
        L18:
            r1 = 0
        L19:
            android.widget.ImageView r3 = r4.f1054v0
            if (r1 == 0) goto L1e
            goto L20
        L1e:
            r2 = 8
        L20:
            r3.setVisibility(r2)
            android.widget.ImageView r1 = r4.f1054v0
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            if (r1 == 0) goto L35
            if (r0 == 0) goto L30
            int[] r0 = android.view.ViewGroup.ENABLED_STATE_SET
            goto L32
        L30:
            int[] r0 = android.view.ViewGroup.EMPTY_STATE_SET
        L32:
            r1.setState(r0)
        L35:
            return
    }

    /* renamed from: w */
    public void m605w() {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f1048p0
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lb
            int[] r0 = android.view.ViewGroup.FOCUSED_STATE_SET
            goto Ld
        Lb:
            int[] r0 = android.view.ViewGroup.EMPTY_STATE_SET
        Ld:
            android.view.View r1 = r2.f1050r0
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L18
            r1.setState(r0)
        L18:
            android.view.View r1 = r2.f1051s0
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L23
            r1.setState(r0)
        L23:
            r2.invalidate()
            return
    }

    /* renamed from: x */
    public final void m606x() {
            r7 = this;
            java.lang.CharSequence r0 = r7.getQueryHint()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r7.f1048p0
            if (r0 != 0) goto La
            java.lang.String r0 = ""
        La:
            boolean r2 = r7.f1028P0
            if (r2 == 0) goto L3c
            android.graphics.drawable.Drawable r2 = r7.f1017E0
            if (r2 != 0) goto L13
            goto L3c
        L13:
            float r2 = r1.getTextSize()
            double r2 = (double) r2
            r4 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            double r2 = r2 * r4
            int r2 = (int) r2
            android.graphics.drawable.Drawable r3 = r7.f1017E0
            r4 = 0
            r3.setBounds(r4, r4, r2, r2)
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            java.lang.String r3 = "   "
            r2.<init>(r3)
            android.text.style.ImageSpan r3 = new android.text.style.ImageSpan
            android.graphics.drawable.Drawable r4 = r7.f1017E0
            r3.<init>(r4)
            r4 = 1
            r5 = 2
            r6 = 33
            r2.setSpan(r3, r4, r5, r6)
            r2.append(r0)
            r0 = r2
        L3c:
            r1.setHint(r0)
            return
    }

    /* renamed from: y */
    public final void m607y() {
            r2 = this;
            boolean r0 = r2.f1031S0
            r1 = 0
            if (r0 != 0) goto L9
            boolean r0 = r2.f1036X0
            if (r0 == 0) goto Lf
        L9:
            boolean r0 = r2.f1029Q0
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L23
            android.widget.ImageView r0 = r2.f1053u0
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L25
            android.widget.ImageView r0 = r2.f1055w0
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L23
            goto L25
        L23:
            r1 = 8
        L25:
            android.view.View r0 = r2.f1051s0
            r0.setVisibility(r1)
            return
    }

    /* renamed from: z */
    public final void m608z(boolean r3) {
            r2 = this;
            boolean r0 = r2.f1031S0
            r1 = 0
            if (r0 == 0) goto L21
            if (r0 != 0) goto Lb
            boolean r0 = r2.f1036X0
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.f1029Q0
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.f1036X0
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.f1053u0
            r3.setVisibility(r1)
            return
    }
}
