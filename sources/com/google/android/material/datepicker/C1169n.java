package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: classes.dex */
public final class C1169n<S> extends androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l {

    /* renamed from: B1 */
    public static final /* synthetic */ int f6096B1 = 0;

    /* renamed from: A1 */
    public android.widget.Button f6097A1;

    /* renamed from: k1 */
    public final java.util.LinkedHashSet<com.google.android.material.datepicker.InterfaceC1171p<? super S>> f6098k1;

    /* renamed from: l1 */
    public final java.util.LinkedHashSet<android.view.View.OnClickListener> f6099l1;

    /* renamed from: m1 */
    public final java.util.LinkedHashSet<android.content.DialogInterface.OnCancelListener> f6100m1;

    /* renamed from: n1 */
    public final java.util.LinkedHashSet<android.content.DialogInterface.OnDismissListener> f6101n1;

    /* renamed from: o1 */
    public int f6102o1;

    /* renamed from: p1 */
    public com.google.android.material.datepicker.InterfaceC1158c<S> f6103p1;

    /* renamed from: q1 */
    public com.google.android.material.datepicker.AbstractC1178w<S> f6104q1;

    /* renamed from: r1 */
    public com.google.android.material.datepicker.C1154a f6105r1;

    /* renamed from: s1 */
    public com.google.android.material.datepicker.C1161f<S> f6106s1;

    /* renamed from: t1 */
    public int f6107t1;

    /* renamed from: u1 */
    public java.lang.CharSequence f6108u1;

    /* renamed from: v1 */
    public boolean f6109v1;

    /* renamed from: w1 */
    public int f6110w1;

    /* renamed from: x1 */
    public android.widget.TextView f6111x1;

    /* renamed from: y1 */
    public com.google.android.material.internal.CheckableImageButton f6112y1;

    /* renamed from: z1 */
    public p340t8.C6189f f6113z1;

    /* renamed from: com.google.android.material.datepicker.n$a */
    public class a implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ com.google.android.material.datepicker.C1169n f6114Y;

        public a(com.google.android.material.datepicker.C1169n r1) {
                r0 = this;
                r0.f6114Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.google.android.material.datepicker.n r3 = r2.f6114Y
                java.util.LinkedHashSet<com.google.android.material.datepicker.p<? super S>> r3 = r3.f6098k1
                java.util.Iterator r3 = r3.iterator()
            L8:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L20
                java.lang.Object r0 = r3.next()
                com.google.android.material.datepicker.p r0 = (com.google.android.material.datepicker.InterfaceC1171p) r0
                com.google.android.material.datepicker.n r1 = r2.f6114Y
                com.google.android.material.datepicker.c<S> r1 = r1.f6103p1
                java.lang.Object r1 = r1.m3406I()
                r0.m3424a(r1)
                goto L8
            L20:
                com.google.android.material.datepicker.n r3 = r2.f6114Y
                r0 = 0
                r3.m1223E0(r0, r0)
                return
        }
    }

    /* renamed from: com.google.android.material.datepicker.n$b */
    public class b implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ com.google.android.material.datepicker.C1169n f6115Y;

        public b(com.google.android.material.datepicker.C1169n r1) {
                r0 = this;
                r0.f6115Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.google.android.material.datepicker.n r0 = r2.f6115Y
                java.util.LinkedHashSet<android.view.View$OnClickListener> r0 = r0.f6099l1
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
                r1.onClick(r3)
                goto L8
            L18:
                com.google.android.material.datepicker.n r3 = r2.f6115Y
                r0 = 0
                r3.m1223E0(r0, r0)
                return
        }
    }

    /* renamed from: com.google.android.material.datepicker.n$c */
    public class c extends com.google.android.material.datepicker.AbstractC1177v<S> {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.datepicker.C1169n f6116a;

        public c(com.google.android.material.datepicker.C1169n r1) {
                r0 = this;
                r0.f6116a = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.material.datepicker.AbstractC1177v
        /* renamed from: a */
        public void mo3423a(S r2) {
                r1 = this;
                com.google.android.material.datepicker.n r2 = r1.f6116a
                int r0 = com.google.android.material.datepicker.C1169n.f6096B1
                r2.m3421P0()
                com.google.android.material.datepicker.n r2 = r1.f6116a
                android.widget.Button r0 = r2.f6097A1
                com.google.android.material.datepicker.c<S> r2 = r2.f6103p1
                boolean r2 = r2.m3404C()
                r0.setEnabled(r2)
                return
        }
    }

    public C1169n() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f6098k1 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f6099l1 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f6100m1 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f6101n1 = r0
            return
    }

    /* renamed from: L0 */
    public static int m3417L0(android.content.Context r6) {
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131165513(0x7f070149, float:1.7945245E38)
            int r0 = r6.getDimensionPixelOffset(r0)
            java.util.Calendar r1 = com.google.android.material.datepicker.C1181z.m3443d()
            r2 = 5
            r3 = 1
            r1.set(r2, r3)
            java.util.Calendar r1 = com.google.android.material.datepicker.C1181z.m3441b(r1)
            r4 = 2
            r1.get(r4)
            r1.get(r3)
            r5 = 7
            int r5 = r1.getMaximum(r5)
            r1.getActualMaximum(r2)
            r1.getTimeInMillis()
            r1 = 2131165519(0x7f07014f, float:1.7945257E38)
            int r1 = r6.getDimensionPixelSize(r1)
            r2 = 2131165533(0x7f07015d, float:1.7945286E38)
            int r6 = r6.getDimensionPixelOffset(r2)
            int r0 = r0 * 2
            int r1 = r1 * r5
            int r1 = r1 + r0
            int r5 = r5 - r3
            int r5 = r5 * r6
            int r5 = r5 + r1
            return r5
    }

    /* renamed from: M0 */
    public static boolean m3418M0(android.content.Context r1) {
            r0 = 16843277(0x101020d, float:2.369503E-38)
            boolean r1 = m3419N0(r1, r0)
            return r1
    }

    /* renamed from: N0 */
    public static boolean m3419N0(android.content.Context r3, int r4) {
            java.lang.Class<com.google.android.material.datepicker.f> r0 = com.google.android.material.datepicker.C1161f.class
            java.lang.String r0 = r0.getCanonicalName()
            r1 = 2130969234(0x7f040292, float:1.7547144E38)
            int r0 = p288q8.C5598b.m11874c(r3, r1, r0)
            r1 = 1
            int[] r1 = new int[r1]
            r2 = 0
            r1[r2] = r4
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r0, r1)
            boolean r4 = r3.getBoolean(r2, r2)
            r3.recycle()
            return r4
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l
    /* renamed from: G0 */
    public final android.app.Dialog mo1225G0(android.os.Bundle r7) {
            r6 = this;
            android.app.Dialog r7 = new android.app.Dialog
            android.content.Context r0 = r6.m1334s0()
            android.content.Context r1 = r6.m1334s0()
            int r2 = r6.f6102o1
            if (r2 == 0) goto Lf
            goto L15
        Lf:
            com.google.android.material.datepicker.c<S> r2 = r6.f6103p1
            int r2 = r2.m3410u(r1)
        L15:
            r7.<init>(r0, r2)
            android.content.Context r0 = r7.getContext()
            boolean r1 = m3418M0(r0)
            r6.f6109v1 = r1
            r1 = 2130968838(0x7f040106, float:1.754634E38)
            java.lang.Class<com.google.android.material.datepicker.n> r2 = com.google.android.material.datepicker.C1169n.class
            java.lang.String r2 = r2.getCanonicalName()
            int r1 = p288q8.C5598b.m11874c(r0, r1, r2)
            t8.f r2 = new t8.f
            r3 = 0
            r4 = 2130969234(0x7f040292, float:1.7547144E38)
            r5 = 2132017951(0x7f14031f, float:1.9674195E38)
            r2.<init>(r0, r3, r4, r5)
            r6.f6113z1 = r2
            t8.f$b r3 = r2.f24036Y
            j8.a r4 = new j8.a
            r4.<init>(r0)
            r3.f24060b = r4
            r2.m12781y()
            t8.f r0 = r6.f6113z1
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.m12773q(r1)
            t8.f r0 = r6.f6113z1
            android.view.Window r1 = r7.getWindow()
            android.view.View r1 = r1.getDecorView()
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            float r1 = p227n0.C4661t.h.m10604i(r1)
            r0.m12772p(r1)
            return r7
    }

    /* renamed from: O0 */
    public final void m3420O0() {
            r7 = this;
            android.content.Context r0 = r7.m1334s0()
            int r1 = r7.f6102o1
            if (r1 == 0) goto L9
            goto Lf
        L9:
            com.google.android.material.datepicker.c<S> r1 = r7.f6103p1
            int r1 = r1.m3410u(r0)
        Lf:
            com.google.android.material.datepicker.c<S> r0 = r7.f6103p1
            com.google.android.material.datepicker.a r2 = r7.f6105r1
            com.google.android.material.datepicker.f r3 = new com.google.android.material.datepicker.f
            r3.<init>()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "THEME_RES_ID_KEY"
            r4.putInt(r5, r1)
            java.lang.String r6 = "GRID_SELECTOR_KEY"
            r4.putParcelable(r6, r0)
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            r4.putParcelable(r0, r2)
            com.google.android.material.datepicker.r r2 = r2.f6044b0
            java.lang.String r6 = "CURRENT_MONTH_KEY"
            r4.putParcelable(r6, r2)
            r3.m1344x0(r4)
            r7.f6106s1 = r3
            com.google.android.material.internal.CheckableImageButton r2 = r7.f6112y1
            boolean r2 = r2.isChecked()
            if (r2 == 0) goto L5d
            com.google.android.material.datepicker.c<S> r2 = r7.f6103p1
            com.google.android.material.datepicker.a r3 = r7.f6105r1
            com.google.android.material.datepicker.q r4 = new com.google.android.material.datepicker.q
            r4.<init>()
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r6.putInt(r5, r1)
            java.lang.String r1 = "DATE_SELECTOR_KEY"
            r6.putParcelable(r1, r2)
            r6.putParcelable(r0, r3)
            r4.m1344x0(r6)
            goto L5f
        L5d:
            com.google.android.material.datepicker.f<S> r4 = r7.f6106s1
        L5f:
            r7.f6104q1 = r4
            r7.m3421P0()
            androidx.fragment.app.d0 r0 = r7.m1337u()
            androidx.fragment.app.a r1 = new androidx.fragment.app.a
            r1.<init>(r0)
            r0 = 2131362417(0x7f0a0271, float:1.8344614E38)
            com.google.android.material.datepicker.w<S> r2 = r7.f6104q1
            r3 = 2
            r4 = 0
            r1.m1081k(r0, r2, r4, r3)
            r1.m1079i()
            com.google.android.material.datepicker.w<S> r0 = r7.f6104q1
            com.google.android.material.datepicker.n$c r1 = new com.google.android.material.datepicker.n$c
            r1.<init>(r7)
            r0.mo3412D0(r1)
            return
    }

    /* renamed from: P0 */
    public final void m3421P0() {
            r5 = this;
            com.google.android.material.datepicker.c<S> r0 = r5.f6103p1
            android.content.Context r1 = r5.m1339v()
            java.lang.String r0 = r0.m3409q(r1)
            android.widget.TextView r1 = r5.f6111x1
            r2 = 2131951909(0x7f130125, float:1.9540246E38)
            java.lang.String r2 = r5.m1309M(r2)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.setContentDescription(r2)
            android.widget.TextView r1 = r5.f6111x1
            r1.setText(r0)
            return
    }

    /* renamed from: Q0 */
    public final void m3422Q0(com.google.android.material.internal.CheckableImageButton r2) {
            r1 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r1.f6112y1
            boolean r0 = r0.isChecked()
            android.content.Context r2 = r2.getContext()
            if (r0 == 0) goto L10
            r0 = 2131951934(0x7f13013e, float:1.9540297E38)
            goto L13
        L10:
            r0 = 2131951936(0x7f130140, float:1.95403E38)
        L13:
            java.lang.String r2 = r2.getString(r0)
            com.google.android.material.internal.CheckableImageButton r0 = r1.f6112y1
            r0.setContentDescription(r2)
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public final void mo114V(android.os.Bundle r2) {
            r1 = this;
            super.mo114V(r2)
            if (r2 != 0) goto L7
            android.os.Bundle r2 = r1.f2282d0
        L7:
            java.lang.String r0 = "OVERRIDE_THEME_RES_ID"
            int r0 = r2.getInt(r0)
            r1.f6102o1 = r0
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.google.android.material.datepicker.c r0 = (com.google.android.material.datepicker.InterfaceC1158c) r0
            r1.f6103p1 = r0
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.google.android.material.datepicker.a r0 = (com.google.android.material.datepicker.C1154a) r0
            r1.f6105r1 = r0
            java.lang.String r0 = "TITLE_TEXT_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.f6107t1 = r0
            java.lang.String r0 = "TITLE_TEXT_KEY"
            java.lang.CharSequence r0 = r2.getCharSequence(r0)
            r1.f6108u1 = r0
            java.lang.String r0 = "INPUT_MODE_KEY"
            int r2 = r2.getInt(r0)
            r1.f6110w1 = r2
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: W */
    public final android.view.View mo1317W(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
            r6 = this;
            boolean r9 = r6.f6109v1
            if (r9 == 0) goto L8
            r9 = 2131558542(0x7f0d008e, float:1.8742403E38)
            goto Lb
        L8:
            r9 = 2131558541(0x7f0d008d, float:1.87424E38)
        Lb:
            android.view.View r7 = r7.inflate(r9, r8)
            android.content.Context r8 = r7.getContext()
            boolean r9 = r6.f6109v1
            r0 = 2131362417(0x7f0a0271, float:1.8344614E38)
            if (r9 == 0) goto L2c
            android.view.View r9 = r7.findViewById(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            int r1 = m3417L0(r8)
            r2 = -2
            r0.<init>(r1, r2)
            r9.setLayoutParams(r0)
            goto L8d
        L2c:
            r9 = 2131362418(0x7f0a0272, float:1.8344616E38)
            android.view.View r9 = r7.findViewById(r9)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            int r2 = m3417L0(r8)
            r3 = -1
            r1.<init>(r2, r3)
            r9.setLayoutParams(r1)
            android.content.Context r9 = r6.m1334s0()
            android.content.res.Resources r9 = r9.getResources()
            r1 = 2131165536(0x7f070160, float:1.7945292E38)
            int r1 = r9.getDimensionPixelSize(r1)
            r2 = 2131165537(0x7f070161, float:1.7945294E38)
            int r2 = r9.getDimensionPixelOffset(r2)
            int r2 = r2 + r1
            r1 = 2131165535(0x7f07015f, float:1.794529E38)
            int r1 = r9.getDimensionPixelOffset(r1)
            int r1 = r1 + r2
            r2 = 2131165520(0x7f070150, float:1.794526E38)
            int r2 = r9.getDimensionPixelSize(r2)
            int r4 = com.google.android.material.datepicker.C1174s.f6129d0
            r5 = 2131165515(0x7f07014b, float:1.794525E38)
            int r5 = r9.getDimensionPixelSize(r5)
            int r5 = r5 * r4
            int r4 = r4 + r3
            r3 = 2131165534(0x7f07015e, float:1.7945288E38)
            int r3 = r9.getDimensionPixelOffset(r3)
            int r3 = r3 * r4
            int r3 = r3 + r5
            r4 = 2131165512(0x7f070148, float:1.7945243E38)
            int r9 = r9.getDimensionPixelOffset(r4)
            int r1 = r1 + r2
            int r1 = r1 + r3
            int r1 = r1 + r9
            r0.setMinimumHeight(r1)
        L8d:
            r9 = 2131362429(0x7f0a027d, float:1.8344638E38)
            android.view.View r9 = r7.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r6.f6111x1 = r9
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            r0 = 1
            p227n0.C4661t.f.m10591f(r9, r0)
            r9 = 2131362431(0x7f0a027f, float:1.8344642E38)
            android.view.View r9 = r7.findViewById(r9)
            com.google.android.material.internal.CheckableImageButton r9 = (com.google.android.material.internal.CheckableImageButton) r9
            r6.f6112y1 = r9
            r9 = 2131362435(0x7f0a0283, float:1.834465E38)
            android.view.View r9 = r7.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.CharSequence r1 = r6.f6108u1
            if (r1 == 0) goto Lba
            r9.setText(r1)
            goto Lbf
        Lba:
            int r1 = r6.f6107t1
            r9.setText(r1)
        Lbf:
            com.google.android.material.internal.CheckableImageButton r9 = r6.f6112y1
            java.lang.String r1 = "TOGGLE_BUTTON_TAG"
            r9.setTag(r1)
            com.google.android.material.internal.CheckableImageButton r9 = r6.f6112y1
            android.graphics.drawable.StateListDrawable r1 = new android.graphics.drawable.StateListDrawable
            r1.<init>()
            int[] r2 = new int[r0]
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            r4 = 0
            r2[r4] = r3
            r3 = 2131231288(0x7f080238, float:1.8078653E38)
            android.graphics.drawable.Drawable r3 = p102g.C2199a.m5784b(r8, r3)
            r1.addState(r2, r3)
            int[] r2 = new int[r4]
            r3 = 2131231290(0x7f08023a, float:1.8078657E38)
            android.graphics.drawable.Drawable r8 = p102g.C2199a.m5784b(r8, r3)
            r1.addState(r2, r8)
            r9.setImageDrawable(r1)
            com.google.android.material.internal.CheckableImageButton r8 = r6.f6112y1
            int r9 = r6.f6110w1
            if (r9 == 0) goto Lf6
            r9 = 1
            goto Lf7
        Lf6:
            r9 = 0
        Lf7:
            r8.setChecked(r9)
            com.google.android.material.internal.CheckableImageButton r8 = r6.f6112y1
            r9 = 0
            p227n0.C4661t.m10546v(r8, r9)
            com.google.android.material.internal.CheckableImageButton r8 = r6.f6112y1
            r6.m3422Q0(r8)
            com.google.android.material.internal.CheckableImageButton r8 = r6.f6112y1
            com.google.android.material.datepicker.o r9 = new com.google.android.material.datepicker.o
            r9.<init>(r6)
            r8.setOnClickListener(r9)
            r8 = 2131362045(0x7f0a00fd, float:1.834386E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.Button r8 = (android.widget.Button) r8
            r6.f6097A1 = r8
            com.google.android.material.datepicker.c<S> r8 = r6.f6103p1
            boolean r8 = r8.m3404C()
            if (r8 == 0) goto L128
            android.widget.Button r8 = r6.f6097A1
            r8.setEnabled(r0)
            goto L12d
        L128:
            android.widget.Button r8 = r6.f6097A1
            r8.setEnabled(r4)
        L12d:
            android.widget.Button r8 = r6.f6097A1
            java.lang.String r9 = "CONFIRM_BUTTON_TAG"
            r8.setTag(r9)
            android.widget.Button r8 = r6.f6097A1
            com.google.android.material.datepicker.n$a r9 = new com.google.android.material.datepicker.n$a
            r9.<init>(r6)
            r8.setOnClickListener(r9)
            r8 = 2131361984(0x7f0a00c0, float:1.8343736E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.Button r8 = (android.widget.Button) r8
            java.lang.String r9 = "CANCEL_BUTTON_TAG"
            r8.setTag(r9)
            com.google.android.material.datepicker.n$b r9 = new com.google.android.material.datepicker.n$b
            r9.<init>(r6)
            r8.setOnClickListener(r9)
            return r7
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: f0 */
    public final void mo1234f0(android.os.Bundle r11) {
            r10 = this;
            super.mo1234f0(r11)
            int r0 = r10.f6102o1
            java.lang.String r1 = "OVERRIDE_THEME_RES_ID"
            r11.putInt(r1, r0)
            com.google.android.material.datepicker.c<S> r0 = r10.f6103p1
            java.lang.String r1 = "DATE_SELECTOR_KEY"
            r11.putParcelable(r1, r0)
            com.google.android.material.datepicker.a$b r0 = new com.google.android.material.datepicker.a$b
            com.google.android.material.datepicker.a r1 = r10.f6105r1
            r0.<init>(r1)
            com.google.android.material.datepicker.f<S> r1 = r10.f6106s1
            com.google.android.material.datepicker.r r1 = r1.f6072Y0
            if (r1 == 0) goto L26
            long r1 = r1.f6127d0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.f6051c = r1
        L26:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.material.datepicker.a$c r2 = r0.f6052d
            java.lang.String r3 = "DEEP_COPY_VALIDATOR_KEY"
            r1.putParcelable(r3, r2)
            com.google.android.material.datepicker.a r2 = new com.google.android.material.datepicker.a
            long r4 = r0.f6049a
            com.google.android.material.datepicker.r r5 = com.google.android.material.datepicker.C1173r.m3426h(r4)
            long r6 = r0.f6050b
            com.google.android.material.datepicker.r r6 = com.google.android.material.datepicker.C1173r.m3426h(r6)
            android.os.Parcelable r1 = r1.getParcelable(r3)
            r7 = r1
            com.google.android.material.datepicker.a$c r7 = (com.google.android.material.datepicker.C1154a.c) r7
            java.lang.Long r0 = r0.f6051c
            if (r0 != 0) goto L4d
            r0 = 0
            goto L55
        L4d:
            long r0 = r0.longValue()
            com.google.android.material.datepicker.r r0 = com.google.android.material.datepicker.C1173r.m3426h(r0)
        L55:
            r8 = r0
            r9 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            r11.putParcelable(r0, r2)
            int r0 = r10.f6107t1
            java.lang.String r1 = "TITLE_TEXT_RES_ID_KEY"
            r11.putInt(r1, r0)
            java.lang.CharSequence r0 = r10.f6108u1
            java.lang.String r1 = "TITLE_TEXT_KEY"
            r11.putCharSequence(r1, r0)
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: g0 */
    public void mo1235g0() {
            r9 = this;
            super.mo1235g0()
            android.app.Dialog r0 = r9.m1226H0()
            android.view.Window r0 = r0.getWindow()
            boolean r1 = r9.f6109v1
            if (r1 == 0) goto L19
            r1 = -1
            r0.setLayout(r1, r1)
            t8.f r1 = r9.f6113z1
            r0.setBackgroundDrawable(r1)
            goto L4b
        L19:
            r1 = -2
            r0.setLayout(r1, r1)
            android.content.res.Resources r1 = r9.m1305I()
            r2 = 2131165521(0x7f070151, float:1.7945261E38)
            int r8 = r1.getDimensionPixelOffset(r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r8, r8, r8, r8)
            android.graphics.drawable.InsetDrawable r2 = new android.graphics.drawable.InsetDrawable
            t8.f r4 = r9.f6113z1
            r3 = r2
            r5 = r8
            r6 = r8
            r7 = r8
            r3.<init>(r4, r5, r6, r7, r8)
            r0.setBackgroundDrawable(r2)
            android.view.View r0 = r0.getDecorView()
            h8.a r2 = new h8.a
            android.app.Dialog r3 = r9.m1226H0()
            r2.<init>(r3, r1)
            r0.setOnTouchListener(r2)
        L4b:
            r9.m3420O0()
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: h0 */
    public void mo1236h0() {
            r1 = this;
            com.google.android.material.datepicker.w<S> r0 = r1.f6104q1
            java.util.LinkedHashSet<com.google.android.material.datepicker.v<S>> r0 = r0.f6144U0
            r0.clear()
            super.mo1236h0()
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface r3) {
            r2 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnCancelListener> r0 = r2.f6100m1
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.content.DialogInterface$OnCancelListener r1 = (android.content.DialogInterface.OnCancelListener) r1
            r1.onCancel(r3)
            goto L6
        L16:
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r3) {
            r2 = this;
            java.util.LinkedHashSet<android.content.DialogInterface$OnDismissListener> r0 = r2.f6101n1
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.content.DialogInterface$OnDismissListener r1 = (android.content.DialogInterface.OnDismissListener) r1
            r1.onDismiss(r3)
            goto L6
        L16:
            android.view.View r0 = r2.f2260C0
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L1f
            r0.removeAllViews()
        L1f:
            super.onDismiss(r3)
            return
    }
}
