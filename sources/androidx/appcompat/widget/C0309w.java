package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.w */
/* loaded from: classes.dex */
public class C0309w extends android.widget.Spinner {

    /* renamed from: i0 */
    public static final int[] f1449i0 = null;

    /* renamed from: a0 */
    public final androidx.appcompat.widget.C0273f f1450a0;

    /* renamed from: b0 */
    public final android.content.Context f1451b0;

    /* renamed from: c0 */
    public androidx.appcompat.widget.AbstractViewOnTouchListenerC0280h0 f1452c0;

    /* renamed from: d0 */
    public android.widget.SpinnerAdapter f1453d0;

    /* renamed from: e0 */
    public final boolean f1454e0;

    /* renamed from: f0 */
    public androidx.appcompat.widget.C0309w.f f1455f0;

    /* renamed from: g0 */
    public int f1456g0;

    /* renamed from: h0 */
    public final android.graphics.Rect f1457h0;

    /* renamed from: androidx.appcompat.widget.w$a */
    public class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.C0309w f1458Y;

        public a(androidx.appcompat.widget.C0309w r1) {
                r0 = this;
                r0.f1458Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r1 = this;
                androidx.appcompat.widget.w r0 = r1.f1458Y
                androidx.appcompat.widget.w$f r0 = r0.getInternalPopup()
                boolean r0 = r0.mo796b()
                if (r0 != 0) goto L11
                androidx.appcompat.widget.w r0 = r1.f1458Y
                r0.m795b()
            L11:
                androidx.appcompat.widget.w r0 = r1.f1458Y
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                if (r0 == 0) goto L1c
                r0.removeOnGlobalLayoutListener(r1)
            L1c:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.w$b */
    public class b implements androidx.appcompat.widget.C0309w.f, android.content.DialogInterface.OnClickListener {

        /* renamed from: Y */
        public androidx.appcompat.app.DialogC0204b f1459Y;

        /* renamed from: Z */
        public android.widget.ListAdapter f1460Z;

        /* renamed from: a0 */
        public java.lang.CharSequence f1461a0;

        /* renamed from: b0 */
        public final /* synthetic */ androidx.appcompat.widget.C0309w f1462b0;

        public b(androidx.appcompat.widget.C0309w r1) {
                r0 = this;
                r0.f1462b0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.C0309w.f
        /* renamed from: b */
        public boolean mo796b() {
                r1 = this;
                androidx.appcompat.app.b r0 = r1.f1459Y
                if (r0 == 0) goto L9
                boolean r0 = r0.isShowing()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // androidx.appcompat.widget.C0309w.f
        /* renamed from: c */
        public int mo797c() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.C0309w.f
        public void dismiss() {
                r1 = this;
                androidx.appcompat.app.b r0 = r1.f1459Y
                if (r0 == 0) goto La
                r0.dismiss()
                r0 = 0
                r1.f1459Y = r0
            La:
                return
        }

        @Override // androidx.appcompat.widget.C0309w.f
        /* renamed from: f */
        public android.graphics.drawable.Drawable mo798f() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.C0309w.f
        /* renamed from: h */
        public void mo799h(java.lang.CharSequence r1) {
                r0 = this;
                r0.f1461a0 = r1
                return
        }

        @Override // androidx.appcompat.widget.C0309w.f
        /* renamed from: i */
        public void mo800i(android.graphics.drawable.Drawable r2) {
                r1 = this;
                java.lang.String r2 = "AppCompatSpinner"
                java.lang.String r0 = "Cannot set popup background for MODE_DIALOG, ignoring"
                android.util.Log.e(r2, r0)
                return
        }

        @Override // androidx.appcompat.widget.C0309w.f
        /* renamed from: j */
        public void mo801j(int r2) {
                r1 = this;
                java.lang.String r2 = "AppCompatSpinner"
                java.lang.String r0 = "Cannot set vertical offset for MODE_DIALOG, ignoring"
                android.util.Log.e(r2, r0)
                return
        }

        @Override // androidx.appcompat.widget.C0309w.f
        /* renamed from: k */
        public void mo802k(int r2) {
                r1 = this;
                java.lang.String r2 = "AppCompatSpinner"
                java.lang.String r0 = "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring"
                android.util.Log.e(r2, r0)
                return
        }

        @Override // androidx.appcompat.widget.C0309w.f
        /* renamed from: l */
        public void mo803l(int r2) {
                r1 = this;
                java.lang.String r2 = "AppCompatSpinner"
                java.lang.String r0 = "Cannot set horizontal offset for MODE_DIALOG, ignoring"
                android.util.Log.e(r2, r0)
                return
        }

        @Override // androidx.appcompat.widget.C0309w.f
        /* renamed from: m */
        public void mo804m(int r5, int r6) {
                r4 = this;
                android.widget.ListAdapter r0 = r4.f1460Z
                if (r0 != 0) goto L5
                return
            L5:
                androidx.appcompat.app.b$a r0 = new androidx.appcompat.app.b$a
                androidx.appcompat.widget.w r1 = r4.f1462b0
                android.content.Context r1 = r1.getPopupContext()
                r2 = 0
                int r2 = androidx.appcompat.app.DialogC0204b.m455d(r1, r2)
                r0.<init>(r1, r2)
                java.lang.CharSequence r1 = r4.f1461a0
                if (r1 == 0) goto L1c
                r0.setTitle(r1)
            L1c:
                android.widget.ListAdapter r1 = r4.f1460Z
                androidx.appcompat.widget.w r2 = r4.f1462b0
                int r2 = r2.getSelectedItemPosition()
                androidx.appcompat.app.AlertController$b r3 = r0.f715a
                r3.f706l = r1
                r3.f707m = r4
                r3.f710p = r2
                r1 = 1
                r3.f709o = r1
                androidx.appcompat.app.b r0 = r0.create()
                r4.f1459Y = r0
                androidx.appcompat.app.AlertController r0 = r0.f714a0
                android.widget.ListView r0 = r0.f672g
                r0.setTextDirection(r5)
                r0.setTextAlignment(r6)
                androidx.appcompat.app.b r5 = r4.f1459Y
                r5.show()
                return
        }

        @Override // androidx.appcompat.widget.C0309w.f
        /* renamed from: n */
        public int mo805n() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.C0309w.f
        /* renamed from: o */
        public java.lang.CharSequence mo806o() {
                r1 = this;
                java.lang.CharSequence r0 = r1.f1461a0
                return r0
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r4, int r5) {
                r3 = this;
                androidx.appcompat.widget.w r4 = r3.f1462b0
                r4.setSelection(r5)
                androidx.appcompat.widget.w r4 = r3.f1462b0
                android.widget.AdapterView$OnItemClickListener r4 = r4.getOnItemClickListener()
                r0 = 0
                if (r4 == 0) goto L19
                androidx.appcompat.widget.w r4 = r3.f1462b0
                android.widget.ListAdapter r1 = r3.f1460Z
                long r1 = r1.getItemId(r5)
                r4.performItemClick(r0, r5, r1)
            L19:
                androidx.appcompat.app.b r4 = r3.f1459Y
                if (r4 == 0) goto L22
                r4.dismiss()
                r3.f1459Y = r0
            L22:
                return
        }

        @Override // androidx.appcompat.widget.C0309w.f
        /* renamed from: p */
        public void mo738p(android.widget.ListAdapter r1) {
                r0 = this;
                r0.f1460Z = r1
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.w$c */
    public static class c implements android.widget.ListAdapter, android.widget.SpinnerAdapter {

        /* renamed from: Y */
        public android.widget.SpinnerAdapter f1463Y;

        /* renamed from: Z */
        public android.widget.ListAdapter f1464Z;

        public c(android.widget.SpinnerAdapter r3, android.content.res.Resources.Theme r4) {
                r2 = this;
                r2.<init>()
                r2.f1463Y = r3
                boolean r0 = r3 instanceof android.widget.ListAdapter
                if (r0 == 0) goto Le
                r0 = r3
                android.widget.ListAdapter r0 = (android.widget.ListAdapter) r0
                r2.f1464Z = r0
            Le:
                if (r4 == 0) goto L35
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto L26
                boolean r0 = r3 instanceof android.widget.ThemedSpinnerAdapter
                if (r0 == 0) goto L26
                android.widget.ThemedSpinnerAdapter r3 = (android.widget.ThemedSpinnerAdapter) r3
                android.content.res.Resources$Theme r0 = r3.getDropDownViewTheme()
                if (r0 == r4) goto L35
                r3.setDropDownViewTheme(r4)
                goto L35
            L26:
                boolean r0 = r3 instanceof androidx.appcompat.widget.InterfaceC0306u0
                if (r0 == 0) goto L35
                androidx.appcompat.widget.u0 r3 = (androidx.appcompat.widget.InterfaceC0306u0) r3
                android.content.res.Resources$Theme r0 = r3.getDropDownViewTheme()
                if (r0 != 0) goto L35
                r3.setDropDownViewTheme(r4)
            L35:
                return
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
                r1 = this;
                android.widget.ListAdapter r0 = r1.f1464Z
                if (r0 == 0) goto L9
                boolean r0 = r0.areAllItemsEnabled()
                return r0
            L9:
                r0 = 1
                return r0
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f1463Y
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.getCount()
            La:
                return r0
        }

        @Override // android.widget.SpinnerAdapter
        public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f1463Y
                if (r0 != 0) goto L6
                r2 = 0
                goto La
            L6:
                android.view.View r2 = r0.getDropDownView(r2, r3, r4)
            La:
                return r2
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f1463Y
                if (r0 != 0) goto L6
                r2 = 0
                goto La
            L6:
                java.lang.Object r2 = r0.getItem(r2)
            La:
                return r2
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                android.widget.SpinnerAdapter r0 = r2.f1463Y
                if (r0 != 0) goto L7
                r0 = -1
                goto Lb
            L7:
                long r0 = r0.getItemId(r3)
            Lb:
                return r0
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f1463Y
                if (r0 != 0) goto L6
                r2 = 0
                goto La
            L6:
                android.view.View r2 = r0.getDropDownView(r2, r3, r4)
            La:
                return r2
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f1463Y
                if (r0 == 0) goto Lc
                boolean r0 = r0.hasStableIds()
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
                r1 = this;
                int r0 = r1.getCount()
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int r2) {
                r1 = this;
                android.widget.ListAdapter r0 = r1.f1464Z
                if (r0 == 0) goto L9
                boolean r2 = r0.isEnabled(r2)
                return r2
            L9:
                r2 = 1
                return r2
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(android.database.DataSetObserver r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f1463Y
                if (r0 == 0) goto L7
                r0.registerDataSetObserver(r2)
            L7:
                return
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(android.database.DataSetObserver r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f1463Y
                if (r0 == 0) goto L7
                r0.unregisterDataSetObserver(r2)
            L7:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.w$d */
    public class d extends androidx.appcompat.widget.C0284j0 implements androidx.appcompat.widget.C0309w.f {

        /* renamed from: A0 */
        public java.lang.CharSequence f1465A0;

        /* renamed from: B0 */
        public android.widget.ListAdapter f1466B0;

        /* renamed from: C0 */
        public final android.graphics.Rect f1467C0;

        /* renamed from: D0 */
        public int f1468D0;

        /* renamed from: E0 */
        public final /* synthetic */ androidx.appcompat.widget.C0309w f1469E0;

        /* renamed from: androidx.appcompat.widget.w$d$a */
        public class a implements android.widget.AdapterView.OnItemClickListener {

            /* renamed from: Y */
            public final /* synthetic */ androidx.appcompat.widget.C0309w.d f1470Y;

            public a(androidx.appcompat.widget.C0309w.d r1, androidx.appcompat.widget.C0309w r2) {
                    r0 = this;
                    r0.f1470Y = r1
                    r0.<init>()
                    return
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(android.widget.AdapterView<?> r3, android.view.View r4, int r5, long r6) {
                    r2 = this;
                    androidx.appcompat.widget.w$d r3 = r2.f1470Y
                    androidx.appcompat.widget.w r3 = r3.f1469E0
                    r3.setSelection(r5)
                    androidx.appcompat.widget.w$d r3 = r2.f1470Y
                    androidx.appcompat.widget.w r3 = r3.f1469E0
                    android.widget.AdapterView$OnItemClickListener r3 = r3.getOnItemClickListener()
                    if (r3 == 0) goto L1e
                    androidx.appcompat.widget.w$d r3 = r2.f1470Y
                    androidx.appcompat.widget.w r6 = r3.f1469E0
                    android.widget.ListAdapter r3 = r3.f1466B0
                    long r0 = r3.getItemId(r5)
                    r6.performItemClick(r4, r5, r0)
                L1e:
                    androidx.appcompat.widget.w$d r3 = r2.f1470Y
                    r3.dismiss()
                    return
            }
        }

        /* renamed from: androidx.appcompat.widget.w$d$b */
        public class b implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: Y */
            public final /* synthetic */ androidx.appcompat.widget.C0309w.d f1471Y;

            public b(androidx.appcompat.widget.C0309w.d r1) {
                    r0 = this;
                    r0.f1471Y = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                    r3 = this;
                    androidx.appcompat.widget.w$d r0 = r3.f1471Y
                    androidx.appcompat.widget.w r1 = r0.f1469E0
                    java.util.Objects.requireNonNull(r0)
                    java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
                    boolean r2 = p227n0.C4661t.f.m10587b(r1)
                    if (r2 == 0) goto L19
                    android.graphics.Rect r0 = r0.f1467C0
                    boolean r0 = r1.getGlobalVisibleRect(r0)
                    if (r0 == 0) goto L19
                    r0 = 1
                    goto L1a
                L19:
                    r0 = 0
                L1a:
                    if (r0 != 0) goto L22
                    androidx.appcompat.widget.w$d r0 = r3.f1471Y
                    r0.dismiss()
                    goto L2c
                L22:
                    androidx.appcompat.widget.w$d r0 = r3.f1471Y
                    r0.m807t()
                    androidx.appcompat.widget.w$d r0 = r3.f1471Y
                    r0.mo475d()
                L2c:
                    return
            }
        }

        /* renamed from: androidx.appcompat.widget.w$d$c */
        public class c implements android.widget.PopupWindow.OnDismissListener {

            /* renamed from: Y */
            public final /* synthetic */ android.view.ViewTreeObserver.OnGlobalLayoutListener f1472Y;

            /* renamed from: Z */
            public final /* synthetic */ androidx.appcompat.widget.C0309w.d f1473Z;

            public c(androidx.appcompat.widget.C0309w.d r1, android.view.ViewTreeObserver.OnGlobalLayoutListener r2) {
                    r0 = this;
                    r0.f1473Z = r1
                    r0.f1472Y = r2
                    r0.<init>()
                    return
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                    r2 = this;
                    androidx.appcompat.widget.w$d r0 = r2.f1473Z
                    androidx.appcompat.widget.w r0 = r0.f1469E0
                    android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                    if (r0 == 0) goto Lf
                    android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.f1472Y
                    r0.removeGlobalOnLayoutListener(r1)
                Lf:
                    return
            }
        }

        public d(androidx.appcompat.widget.C0309w r2, android.content.Context r3, android.util.AttributeSet r4, int r5) {
                r1 = this;
                r1.f1469E0 = r2
                r0 = 0
                r1.<init>(r3, r4, r5, r0)
                android.graphics.Rect r3 = new android.graphics.Rect
                r3.<init>()
                r1.f1467C0 = r3
                r1.f1341m0 = r2
                r3 = 1
                r1.m741s(r3)
                androidx.appcompat.widget.w$d$a r3 = new androidx.appcompat.widget.w$d$a
                r3.<init>(r1, r2)
                r1.f1342n0 = r3
                return
        }

        @Override // androidx.appcompat.widget.C0309w.f
        /* renamed from: h */
        public void mo799h(java.lang.CharSequence r1) {
                r0 = this;
                r0.f1465A0 = r1
                return
        }

        @Override // androidx.appcompat.widget.C0309w.f
        /* renamed from: k */
        public void mo802k(int r1) {
                r0 = this;
                r0.f1468D0 = r1
                return
        }

        @Override // androidx.appcompat.widget.C0309w.f
        /* renamed from: m */
        public void mo804m(int r4, int r5) {
                r3 = this;
                boolean r0 = r3.mo473b()
                r3.m807t()
                android.widget.PopupWindow r1 = r3.f1351w0
                r2 = 2
                r1.setInputMethodMode(r2)
                r3.mo475d()
                androidx.appcompat.widget.f0 r1 = r3.f1329a0
                r2 = 1
                r1.setChoiceMode(r2)
                r1.setTextDirection(r4)
                r1.setTextAlignment(r5)
                androidx.appcompat.widget.w r4 = r3.f1469E0
                int r4 = r4.getSelectedItemPosition()
                androidx.appcompat.widget.f0 r5 = r3.f1329a0
                boolean r1 = r3.mo473b()
                if (r1 == 0) goto L3c
                if (r5 == 0) goto L3c
                r1 = 0
                r5.setListSelectionHidden(r1)
                r5.setSelection(r4)
                int r1 = r5.getChoiceMode()
                if (r1 == 0) goto L3c
                r5.setItemChecked(r4, r2)
            L3c:
                if (r0 == 0) goto L3f
                return
            L3f:
                androidx.appcompat.widget.w r4 = r3.f1469E0
                android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()
                if (r4 == 0) goto L59
                androidx.appcompat.widget.w$d$b r5 = new androidx.appcompat.widget.w$d$b
                r5.<init>(r3)
                r4.addOnGlobalLayoutListener(r5)
                androidx.appcompat.widget.w$d$c r4 = new androidx.appcompat.widget.w$d$c
                r4.<init>(r3, r5)
                android.widget.PopupWindow r5 = r3.f1351w0
                r5.setOnDismissListener(r4)
            L59:
                return
        }

        @Override // androidx.appcompat.widget.C0309w.f
        /* renamed from: o */
        public java.lang.CharSequence mo806o() {
                r1 = this;
                java.lang.CharSequence r0 = r1.f1465A0
                return r0
        }

        @Override // androidx.appcompat.widget.C0284j0, androidx.appcompat.widget.C0309w.f
        /* renamed from: p */
        public void mo738p(android.widget.ListAdapter r1) {
                r0 = this;
                super.mo738p(r1)
                r0.f1466B0 = r1
                return
        }

        /* renamed from: t */
        public void m807t() {
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.m733f()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.w r1 = r8.f1469E0
                android.graphics.Rect r1 = r1.f1457h0
                r0.getPadding(r1)
                androidx.appcompat.widget.w r0 = r8.f1469E0
                boolean r0 = androidx.appcompat.widget.C0275f1.m724b(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.w r0 = r8.f1469E0
                android.graphics.Rect r0 = r0.f1457h0
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.w r0 = r8.f1469E0
                android.graphics.Rect r0 = r0.f1457h0
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.w r0 = r8.f1469E0
                android.graphics.Rect r0 = r0.f1457h0
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.w r0 = r8.f1469E0
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.w r2 = r8.f1469E0
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.w r3 = r8.f1469E0
                int r3 = r3.getWidth()
                androidx.appcompat.widget.w r4 = r8.f1469E0
                int r5 = r4.f1456g0
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.f1466B0
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.m733f()
                int r4 = r4.m794a(r5, r6)
                androidx.appcompat.widget.w r5 = r8.f1469E0
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.w r6 = r8.f1469E0
                android.graphics.Rect r6 = r6.f1457h0
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.m740r(r4)
                goto L85
            L82:
                r8.m740r(r5)
            L85:
                androidx.appcompat.widget.w r4 = r8.f1469E0
                boolean r4 = androidx.appcompat.widget.C0275f1.m724b(r4)
                if (r4 == 0) goto L96
                int r3 = r3 - r2
                int r0 = r8.f1331c0
                int r3 = r3 - r0
                int r0 = r8.f1468D0
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto L9b
            L96:
                int r2 = r8.f1468D0
                int r0 = r0 + r2
                int r3 = r0 + r1
            L9b:
                r8.f1332d0 = r3
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.w$e */
    public static class e extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.C0309w.e> CREATOR = null;

        /* renamed from: Y */
        public boolean f1474Y;

        /* renamed from: androidx.appcompat.widget.w$e$a */
        public class a implements android.os.Parcelable.Creator<androidx.appcompat.widget.C0309w.e> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.C0309w.e createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    androidx.appcompat.widget.w$e r0 = new androidx.appcompat.widget.w$e
                    r0.<init>(r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.C0309w.e[] newArray(int r1) {
                    r0 = this;
                    androidx.appcompat.widget.w$e[] r1 = new androidx.appcompat.widget.C0309w.e[r1]
                    return r1
            }
        }

        static {
                androidx.appcompat.widget.w$e$a r0 = new androidx.appcompat.widget.w$e$a
                r0.<init>()
                androidx.appcompat.widget.C0309w.e.CREATOR = r0
                return
        }

        public e(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                byte r1 = r1.readByte()
                if (r1 == 0) goto Lb
                r1 = 1
                goto Lc
            Lb:
                r1 = 0
            Lc:
                r0.f1474Y = r1
                return
        }

        public e(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r2 = r0.f1474Y
                byte r2 = (byte) r2
                r1.writeByte(r2)
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.w$f */
    public interface f {
        /* renamed from: b */
        boolean mo796b();

        /* renamed from: c */
        int mo797c();

        void dismiss();

        /* renamed from: f */
        android.graphics.drawable.Drawable mo798f();

        /* renamed from: h */
        void mo799h(java.lang.CharSequence r1);

        /* renamed from: i */
        void mo800i(android.graphics.drawable.Drawable r1);

        /* renamed from: j */
        void mo801j(int r1);

        /* renamed from: k */
        void mo802k(int r1);

        /* renamed from: l */
        void mo803l(int r1);

        /* renamed from: m */
        void mo804m(int r1, int r2);

        /* renamed from: n */
        int mo805n();

        /* renamed from: o */
        java.lang.CharSequence mo806o();

        /* renamed from: p */
        void mo738p(android.widget.ListAdapter r1);
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843505(0x10102f1, float:2.3695668E-38)
            r0[r1] = r2
            androidx.appcompat.widget.C0309w.f1449i0 = r0
            return
    }

    public C0309w(android.content.Context r10, android.util.AttributeSet r11, int r12) {
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f1457h0 = r0
            android.content.Context r0 = r9.getContext()
            androidx.appcompat.widget.C0304t0.m787a(r9, r0)
            int[] r0 = p064e.C1495i.f7278u
            r1 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            androidx.appcompat.widget.f r2 = new androidx.appcompat.widget.f
            r2.<init>(r9)
            r9.f1450a0 = r2
            r2 = 4
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L2e
            k.c r3 = new k.c
            r3.<init>(r10, r2)
            r9.f1451b0 = r3
            goto L30
        L2e:
            r9.f1451b0 = r10
        L30:
            r2 = 0
            r3 = -1
            int[] r4 = androidx.appcompat.widget.C0309w.f1449i0     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            android.content.res.TypedArray r4 = r10.obtainStyledAttributes(r11, r4, r12, r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            boolean r5 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            if (r5 == 0) goto L58
            int r3 = r4.getInt(r1, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            goto L58
        L43:
            r10 = move-exception
            r2 = r4
            goto Ld0
        L47:
            r5 = move-exception
            goto L4f
        L49:
            r10 = move-exception
            goto Ld0
        L4c:
            r4 = move-exception
            r5 = r4
            r4 = r2
        L4f:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L5b
        L58:
            r4.recycle()
        L5b:
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L97
            if (r3 == r5) goto L62
            goto La5
        L62:
            androidx.appcompat.widget.w$d r3 = new androidx.appcompat.widget.w$d
            android.content.Context r6 = r9.f1451b0
            r3.<init>(r9, r6, r11, r12)
            android.content.Context r6 = r9.f1451b0
            int[] r7 = p064e.C1495i.f7278u
            androidx.appcompat.widget.y0 r6 = androidx.appcompat.widget.C0314y0.m848r(r6, r11, r7, r12, r1)
            r7 = 3
            r8 = -2
            int r7 = r6.m860l(r7, r8)
            r9.f1456g0 = r7
            android.graphics.drawable.Drawable r7 = r6.m855g(r5)
            android.widget.PopupWindow r8 = r3.f1351w0
            r8.setBackgroundDrawable(r7)
            java.lang.String r4 = r0.getString(r4)
            r3.f1465A0 = r4
            android.content.res.TypedArray r4 = r6.f1501b
            r4.recycle()
            r9.f1455f0 = r3
            androidx.appcompat.widget.v r4 = new androidx.appcompat.widget.v
            r4.<init>(r9, r9, r3)
            r9.f1452c0 = r4
            goto La5
        L97:
            androidx.appcompat.widget.w$b r3 = new androidx.appcompat.widget.w$b
            r3.<init>(r9)
            r9.f1455f0 = r3
            java.lang.String r4 = r0.getString(r4)
            r3.mo799h(r4)
        La5:
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto Lbc
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r10, r4, r1)
            r10 = 2131558635(0x7f0d00eb, float:1.8742591E38)
            r3.setDropDownViewResource(r10)
            r9.setAdapter(r3)
        Lbc:
            r0.recycle()
            r9.f1454e0 = r5
            android.widget.SpinnerAdapter r10 = r9.f1453d0
            if (r10 == 0) goto Lca
            r9.setAdapter(r10)
            r9.f1453d0 = r2
        Lca:
            androidx.appcompat.widget.f r10 = r9.f1450a0
            r10.m714d(r11, r12)
            return
        Ld0:
            if (r2 == 0) goto Ld5
            r2.recycle()
        Ld5:
            throw r10
    }

    /* renamed from: a */
    public int m794a(android.widget.SpinnerAdapter r11, android.graphics.drawable.Drawable r12) {
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r1 = r10.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r2 = r10.getMeasuredHeight()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            int r3 = r10.getSelectedItemPosition()
            int r3 = java.lang.Math.max(r0, r3)
            int r4 = r11.getCount()
            int r5 = r3 + 15
            int r4 = java.lang.Math.min(r4, r5)
            int r5 = r4 - r3
            int r5 = 15 - r5
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r0, r3)
            r5 = 0
            r6 = r3
            r7 = r5
            r3 = 0
        L33:
            if (r6 >= r4) goto L5e
            int r8 = r11.getItemViewType(r6)
            if (r8 == r0) goto L3d
            r7 = r5
            r0 = r8
        L3d:
            android.view.View r7 = r11.getView(r6, r7, r10)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            if (r8 != 0) goto L50
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r9 = -2
            r8.<init>(r9, r9)
            r7.setLayoutParams(r8)
        L50:
            r7.measure(r1, r2)
            int r8 = r7.getMeasuredWidth()
            int r3 = java.lang.Math.max(r3, r8)
            int r6 = r6 + 1
            goto L33
        L5e:
            if (r12 == 0) goto L6d
            android.graphics.Rect r11 = r10.f1457h0
            r12.getPadding(r11)
            android.graphics.Rect r11 = r10.f1457h0
            int r12 = r11.left
            int r11 = r11.right
            int r12 = r12 + r11
            int r3 = r3 + r12
        L6d:
            return r3
    }

    /* renamed from: b */
    public void m795b() {
            r3 = this;
            androidx.appcompat.widget.w$f r0 = r3.f1455f0
            int r1 = r3.getTextDirection()
            int r2 = r3.getTextAlignment()
            r0.mo804m(r1, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.f r0 = r1.f1450a0
            if (r0 == 0) goto La
            r0.m711a()
        La:
            return
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
            r1 = this;
            androidx.appcompat.widget.w$f r0 = r1.f1455f0
            if (r0 == 0) goto L9
            int r0 = r0.mo797c()
            return r0
        L9:
            int r0 = super.getDropDownHorizontalOffset()
            return r0
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
            r1 = this;
            androidx.appcompat.widget.w$f r0 = r1.f1455f0
            if (r0 == 0) goto L9
            int r0 = r0.mo805n()
            return r0
        L9:
            int r0 = super.getDropDownVerticalOffset()
            return r0
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
            r1 = this;
            androidx.appcompat.widget.w$f r0 = r1.f1455f0
            if (r0 == 0) goto L7
            int r0 = r1.f1456g0
            return r0
        L7:
            int r0 = super.getDropDownWidth()
            return r0
    }

    public final androidx.appcompat.widget.C0309w.f getInternalPopup() {
            r1 = this;
            androidx.appcompat.widget.w$f r0 = r1.f1455f0
            return r0
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
            r1 = this;
            androidx.appcompat.widget.w$f r0 = r1.f1455f0
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.mo798f()
            return r0
        L9:
            android.graphics.drawable.Drawable r0 = super.getPopupBackground()
            return r0
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
            r1 = this;
            android.content.Context r0 = r1.f1451b0
            return r0
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
            r1 = this;
            androidx.appcompat.widget.w$f r0 = r1.f1455f0
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.mo806o()
            goto Ld
        L9:
            java.lang.CharSequence r0 = super.getPrompt()
        Ld:
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1450a0
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m712b()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1450a0
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m713c()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.w$f r0 = r1.f1455f0
            if (r0 == 0) goto L12
            boolean r0 = r0.mo796b()
            if (r0 == 0) goto L12
            androidx.appcompat.widget.w$f r0 = r1.f1455f0
            r0.dismiss()
        L12:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            androidx.appcompat.widget.w$f r4 = r2.f1455f0
            if (r4 == 0) goto L32
            int r4 = android.view.View.MeasureSpec.getMode(r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r0) goto L32
            int r4 = r2.getMeasuredWidth()
            android.widget.SpinnerAdapter r0 = r2.getAdapter()
            android.graphics.drawable.Drawable r1 = r2.getBackground()
            int r0 = r2.m794a(r0, r1)
            int r4 = java.lang.Math.max(r4, r0)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = java.lang.Math.min(r4, r3)
            int r4 = r2.getMeasuredHeight()
            r2.setMeasuredDimension(r3, r4)
        L32:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            androidx.appcompat.widget.w$e r2 = (androidx.appcompat.widget.C0309w.e) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.f1474Y
            if (r2 == 0) goto L1b
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            if (r2 == 0) goto L1b
            androidx.appcompat.widget.w$a r0 = new androidx.appcompat.widget.w$a
            r0.<init>(r1)
            r2.addOnGlobalLayoutListener(r0)
        L1b:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.appcompat.widget.w$e r0 = new androidx.appcompat.widget.w$e
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            androidx.appcompat.widget.w$f r1 = r2.f1455f0
            if (r1 == 0) goto L15
            boolean r1 = r1.mo796b()
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            r0.f1474Y = r1
            return r0
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.appcompat.widget.h0 r0 = r1.f1452c0
            if (r0 == 0) goto Lc
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
            r1 = this;
            androidx.appcompat.widget.w$f r0 = r1.f1455f0
            if (r0 == 0) goto Lf
            boolean r0 = r0.mo796b()
            if (r0 != 0) goto Ld
            r1.m795b()
        Ld:
            r0 = 1
            return r0
        Lf:
            boolean r0 = super.performClick()
            return r0
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.Adapter r1) {
            r0 = this;
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            r0.setAdapter(r1)
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(android.widget.SpinnerAdapter r4) {
            r3 = this;
            boolean r0 = r3.f1454e0
            if (r0 != 0) goto L7
            r3.f1453d0 = r4
            return
        L7:
            super.setAdapter(r4)
            androidx.appcompat.widget.w$f r0 = r3.f1455f0
            if (r0 == 0) goto L24
            android.content.Context r0 = r3.f1451b0
            if (r0 != 0) goto L16
            android.content.Context r0 = r3.getContext()
        L16:
            androidx.appcompat.widget.w$f r1 = r3.f1455f0
            androidx.appcompat.widget.w$c r2 = new androidx.appcompat.widget.w$c
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r2.<init>(r4, r0)
            r1.mo738p(r2)
        L24:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            androidx.appcompat.widget.f r1 = r0.f1450a0
            if (r1 == 0) goto La
            r1.m715e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.f r0 = r1.f1450a0
            if (r0 == 0) goto La
            r0.m716f(r2)
        La:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int r2) {
            r1 = this;
            androidx.appcompat.widget.w$f r0 = r1.f1455f0
            if (r0 == 0) goto Ld
            r0.mo802k(r2)
            androidx.appcompat.widget.w$f r0 = r1.f1455f0
            r0.mo803l(r2)
            goto L10
        Ld:
            super.setDropDownHorizontalOffset(r2)
        L10:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int r2) {
            r1 = this;
            androidx.appcompat.widget.w$f r0 = r1.f1455f0
            if (r0 == 0) goto L8
            r0.mo801j(r2)
            goto Lb
        L8:
            super.setDropDownVerticalOffset(r2)
        Lb:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int r2) {
            r1 = this;
            androidx.appcompat.widget.w$f r0 = r1.f1455f0
            if (r0 == 0) goto L7
            r1.f1456g0 = r2
            goto La
        L7:
            super.setDropDownWidth(r2)
        La:
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.w$f r0 = r1.f1455f0
            if (r0 == 0) goto L8
            r0.mo800i(r2)
            goto Lb
        L8:
            super.setPopupBackgroundDrawable(r2)
        Lb:
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getPopupContext()
            android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r0, r2)
            r1.setPopupBackgroundDrawable(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.w$f r0 = r1.f1455f0
            if (r0 == 0) goto L8
            r0.mo799h(r2)
            goto Lb
        L8:
            super.setPrompt(r2)
        Lb:
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1450a0
            if (r0 == 0) goto L7
            r0.m718h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1450a0
            if (r0 == 0) goto L7
            r0.m719i(r2)
        L7:
            return
    }
}
