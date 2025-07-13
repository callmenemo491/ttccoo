package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements androidx.appcompat.view.menu.InterfaceC0216j.a, android.widget.AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a0 */
    public androidx.appcompat.view.menu.C0213g f731a0;

    /* renamed from: b0 */
    public android.widget.ImageView f732b0;

    /* renamed from: c0 */
    public android.widget.RadioButton f733c0;

    /* renamed from: d0 */
    public android.widget.TextView f734d0;

    /* renamed from: e0 */
    public android.widget.CheckBox f735e0;

    /* renamed from: f0 */
    public android.widget.TextView f736f0;

    /* renamed from: g0 */
    public android.widget.ImageView f737g0;

    /* renamed from: h0 */
    public android.widget.ImageView f738h0;

    /* renamed from: i0 */
    public android.widget.LinearLayout f739i0;

    /* renamed from: j0 */
    public android.graphics.drawable.Drawable f740j0;

    /* renamed from: k0 */
    public int f741k0;

    /* renamed from: l0 */
    public android.content.Context f742l0;

    /* renamed from: m0 */
    public boolean f743m0;

    /* renamed from: n0 */
    public android.graphics.drawable.Drawable f744n0;

    /* renamed from: o0 */
    public boolean f745o0;

    /* renamed from: p0 */
    public android.view.LayoutInflater f746p0;

    /* renamed from: q0 */
    public boolean f747q0;

    public ListMenuItemView(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r4.<init>(r5, r6)
            android.content.Context r0 = r4.getContext()
            int[] r1 = p064e.C1495i.f7274q
            r2 = 0
            r3 = 2130969204(0x7f040274, float:1.7547083E38)
            androidx.appcompat.widget.y0 r6 = androidx.appcompat.widget.C0314y0.m848r(r0, r6, r1, r3, r2)
            r0 = 5
            android.graphics.drawable.Drawable r0 = r6.m855g(r0)
            r4.f740j0 = r0
            r0 = 1
            r1 = -1
            int r1 = r6.m861m(r0, r1)
            r4.f741k0 = r1
            r1 = 7
            boolean r1 = r6.m849a(r1, r2)
            r4.f743m0 = r1
            r4.f742l0 = r5
            r1 = 8
            android.graphics.drawable.Drawable r1 = r6.m855g(r1)
            r4.f744n0 = r1
            android.content.res.Resources$Theme r5 = r5.getTheme()
            int[] r0 = new int[r0]
            r1 = 16843049(0x1010129, float:2.369439E-38)
            r0[r2] = r1
            r1 = 0
            r3 = 2130968942(0x7f04016e, float:1.7546552E38)
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r1, r0, r3, r2)
            boolean r0 = r5.hasValue(r2)
            r4.f745o0 = r0
            android.content.res.TypedArray r6 = r6.f1501b
            r6.recycle()
            r5.recycle()
            return
    }

    private android.view.LayoutInflater getInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.f746p0
            if (r0 != 0) goto Le
            android.content.Context r0 = r1.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1.f746p0 = r0
        Le:
            android.view.LayoutInflater r0 = r1.f746p0
            return r0
    }

    private void setSubMenuArrowVisible(boolean r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.f737g0
            if (r0 == 0) goto Ld
            if (r2 == 0) goto L8
            r2 = 0
            goto La
        L8:
            r2 = 8
        La:
            r0.setVisibility(r2)
        Ld:
            return
    }

    /* renamed from: a */
    public final void m466a() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getInflater()
            r1 = 2131558414(0x7f0d000e, float:1.8742143E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r3.f735e0 = r0
            android.widget.LinearLayout r1 = r3.f739i0
            r2 = -1
            if (r1 == 0) goto L19
            r1.addView(r0, r2)
            goto L1c
        L19:
            r3.addView(r0, r2)
        L1c:
            return
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(android.graphics.Rect r5) {
            r4 = this;
            android.widget.ImageView r0 = r4.f738h0
            if (r0 == 0) goto L23
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L23
            android.widget.ImageView r0 = r4.f738h0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r5.top
            android.widget.ImageView r2 = r4.f738h0
            int r2 = r2.getHeight()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r0 = r0.bottomMargin
            int r2 = r2 + r0
            int r2 = r2 + r1
            r5.top = r2
        L23:
            return
    }

    /* renamed from: b */
    public final void m467b() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getInflater()
            r1 = 2131558417(0x7f0d0011, float:1.874215E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r3.f733c0 = r0
            android.widget.LinearLayout r1 = r3.f739i0
            r2 = -1
            if (r1 == 0) goto L19
            r1.addView(r0, r2)
            goto L1c
        L19:
            r3.addView(r0, r2)
        L1c:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0216j.a
    /* renamed from: d */
    public void mo459d(androidx.appcompat.view.menu.C0213g r9, int r10) {
            r8 = this;
            r8.f731a0 = r9
            boolean r10 = r9.isVisible()
            r0 = 0
            r1 = 8
            if (r10 == 0) goto Ld
            r10 = 0
            goto Lf
        Ld:
            r10 = 8
        Lf:
            r8.setVisibility(r10)
            java.lang.CharSequence r10 = r9.f843e
            r8.setTitle(r10)
            boolean r10 = r9.isCheckable()
            r8.setCheckable(r10)
            boolean r10 = r9.m540n()
            r9.m531e()
            if (r10 == 0) goto L30
            androidx.appcompat.view.menu.g r10 = r8.f731a0
            boolean r10 = r10.m540n()
            if (r10 == 0) goto L30
            goto L32
        L30:
            r0 = 8
        L32:
            if (r0 != 0) goto Lde
            android.widget.TextView r10 = r8.f736f0
            androidx.appcompat.view.menu.g r2 = r8.f731a0
            char r3 = r2.m531e()
            if (r3 != 0) goto L42
            java.lang.String r1 = ""
            goto Ldb
        L42:
            androidx.appcompat.view.menu.e r4 = r2.f852n
            android.content.Context r4 = r4.f808a
            android.content.res.Resources r4 = r4.getResources()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            androidx.appcompat.view.menu.e r6 = r2.f852n
            android.content.Context r6 = r6.f808a
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L67
            r6 = 2131951633(0x7f130011, float:1.9539686E38)
            java.lang.String r6 = r4.getString(r6)
            r5.append(r6)
        L67:
            androidx.appcompat.view.menu.e r6 = r2.f852n
            boolean r6 = r6.mo511n()
            if (r6 == 0) goto L72
            int r2 = r2.f849k
            goto L74
        L72:
            int r2 = r2.f847i
        L74:
            r6 = 65536(0x10000, float:9.1835E-41)
            r7 = 2131951629(0x7f13000d, float:1.9539678E38)
            java.lang.String r7 = r4.getString(r7)
            androidx.appcompat.view.menu.C0213g.m527c(r5, r2, r6, r7)
            r6 = 4096(0x1000, float:5.74E-42)
            r7 = 2131951625(0x7f130009, float:1.953967E38)
            java.lang.String r7 = r4.getString(r7)
            androidx.appcompat.view.menu.C0213g.m527c(r5, r2, r6, r7)
            r6 = 2
            r7 = 2131951624(0x7f130008, float:1.9539668E38)
            java.lang.String r7 = r4.getString(r7)
            androidx.appcompat.view.menu.C0213g.m527c(r5, r2, r6, r7)
            r6 = 1
            r7 = 2131951630(0x7f13000e, float:1.953968E38)
            java.lang.String r7 = r4.getString(r7)
            androidx.appcompat.view.menu.C0213g.m527c(r5, r2, r6, r7)
            r6 = 4
            r7 = 2131951632(0x7f130010, float:1.9539684E38)
            java.lang.String r7 = r4.getString(r7)
            androidx.appcompat.view.menu.C0213g.m527c(r5, r2, r6, r7)
            r6 = 2131951628(0x7f13000c, float:1.9539676E38)
            java.lang.String r6 = r4.getString(r6)
            androidx.appcompat.view.menu.C0213g.m527c(r5, r2, r1, r6)
            if (r3 == r1) goto Lcd
            r1 = 10
            if (r3 == r1) goto Lc9
            r1 = 32
            if (r3 == r1) goto Lc5
            r5.append(r3)
            goto Ld7
        Lc5:
            r1 = 2131951631(0x7f13000f, float:1.9539682E38)
            goto Ld0
        Lc9:
            r1 = 2131951627(0x7f13000b, float:1.9539674E38)
            goto Ld0
        Lcd:
            r1 = 2131951626(0x7f13000a, float:1.9539672E38)
        Ld0:
            java.lang.String r1 = r4.getString(r1)
            r5.append(r1)
        Ld7:
            java.lang.String r1 = r5.toString()
        Ldb:
            r10.setText(r1)
        Lde:
            android.widget.TextView r10 = r8.f736f0
            int r10 = r10.getVisibility()
            if (r10 == r0) goto Leb
            android.widget.TextView r10 = r8.f736f0
            r10.setVisibility(r0)
        Leb:
            android.graphics.drawable.Drawable r10 = r9.getIcon()
            r8.setIcon(r10)
            boolean r10 = r9.isEnabled()
            r8.setEnabled(r10)
            boolean r10 = r9.hasSubMenu()
            r8.setSubMenuArrowVisible(r10)
            java.lang.CharSequence r9 = r9.f855q
            r8.setContentDescription(r9)
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0216j.a
    public androidx.appcompat.view.menu.C0213g getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.g r0 = r1.f731a0
            return r0
    }

    @Override // android.view.View
    public void onFinishInflate() {
            r3 = this;
            super.onFinishInflate()
            android.graphics.drawable.Drawable r0 = r3.f740j0
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10569q(r3, r0)
            r0 = 2131362703(0x7f0a038f, float:1.8345194E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f734d0 = r0
            int r1 = r3.f741k0
            r2 = -1
            if (r1 == r2) goto L1f
            android.content.Context r2 = r3.f742l0
            r0.setTextAppearance(r2, r1)
        L1f:
            r0 = 2131362586(0x7f0a031a, float:1.8344957E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f736f0 = r0
            r0 = 2131362634(0x7f0a034a, float:1.8345054E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f737g0 = r0
            if (r0 == 0) goto L3c
            android.graphics.drawable.Drawable r1 = r3.f744n0
            r0.setImageDrawable(r1)
        L3c:
            r0 = 2131362219(0x7f0a01ab, float:1.8344212E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f738h0 = r0
            r0 = 2131362063(0x7f0a010f, float:1.8343896E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.f739i0 = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int r4, int r5) {
            r3 = this;
            android.widget.ImageView r0 = r3.f732b0
            if (r0 == 0) goto L1e
            boolean r0 = r3.f743m0
            if (r0 == 0) goto L1e
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.ImageView r1 = r3.f732b0
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r0 = r0.height
            if (r0 <= 0) goto L1e
            int r2 = r1.width
            if (r2 > 0) goto L1e
            r1.width = r0
        L1e:
            super.onMeasure(r4, r5)
            return
    }

    public void setCheckable(boolean r4) {
            r3 = this;
            if (r4 != 0) goto Lb
            android.widget.RadioButton r0 = r3.f733c0
            if (r0 != 0) goto Lb
            android.widget.CheckBox r0 = r3.f735e0
            if (r0 != 0) goto Lb
            return
        Lb:
            androidx.appcompat.view.menu.g r0 = r3.f731a0
            boolean r0 = r0.m534h()
            if (r0 == 0) goto L1f
            android.widget.RadioButton r0 = r3.f733c0
            if (r0 != 0) goto L1a
            r3.m467b()
        L1a:
            android.widget.RadioButton r0 = r3.f733c0
            android.widget.CheckBox r1 = r3.f735e0
            goto L2a
        L1f:
            android.widget.CheckBox r0 = r3.f735e0
            if (r0 != 0) goto L26
            r3.m466a()
        L26:
            android.widget.CheckBox r0 = r3.f735e0
            android.widget.RadioButton r1 = r3.f733c0
        L2a:
            r2 = 8
            if (r4 == 0) goto L4d
            androidx.appcompat.view.menu.g r4 = r3.f731a0
            boolean r4 = r4.isChecked()
            r0.setChecked(r4)
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L41
            r4 = 0
            r0.setVisibility(r4)
        L41:
            if (r1 == 0) goto L5b
            int r4 = r1.getVisibility()
            if (r4 == r2) goto L5b
            r1.setVisibility(r2)
            goto L5b
        L4d:
            android.widget.CheckBox r4 = r3.f735e0
            if (r4 == 0) goto L54
            r4.setVisibility(r2)
        L54:
            android.widget.RadioButton r4 = r3.f733c0
            if (r4 == 0) goto L5b
            r4.setVisibility(r2)
        L5b:
            return
    }

    public void setChecked(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.g r0 = r1.f731a0
            boolean r0 = r0.m534h()
            if (r0 == 0) goto L12
            android.widget.RadioButton r0 = r1.f733c0
            if (r0 != 0) goto Lf
            r1.m467b()
        Lf:
            android.widget.RadioButton r0 = r1.f733c0
            goto L1b
        L12:
            android.widget.CheckBox r0 = r1.f735e0
            if (r0 != 0) goto L19
            r1.m466a()
        L19:
            android.widget.CheckBox r0 = r1.f735e0
        L1b:
            r0.setChecked(r2)
            return
    }

    public void setForceShowIcon(boolean r1) {
            r0 = this;
            r0.f747q0 = r1
            r0.f743m0 = r1
            return
    }

    public void setGroupDividerEnabled(boolean r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.f738h0
            if (r0 == 0) goto L11
            boolean r1 = r2.f745o0
            if (r1 != 0) goto Lc
            if (r3 == 0) goto Lc
            r3 = 0
            goto Le
        Lc:
            r3 = 8
        Le:
            r0.setVisibility(r3)
        L11:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            androidx.appcompat.view.menu.g r0 = r4.f731a0
            androidx.appcompat.view.menu.e r0 = r0.f852n
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r4.f747q0
            r1 = 0
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L16
            boolean r2 = r4.f743m0
            if (r2 != 0) goto L16
            return
        L16:
            android.widget.ImageView r2 = r4.f732b0
            if (r2 != 0) goto L21
            if (r5 != 0) goto L21
            boolean r3 = r4.f743m0
            if (r3 != 0) goto L21
            return
        L21:
            if (r2 != 0) goto L3d
            android.view.LayoutInflater r2 = r4.getInflater()
            r3 = 2131558415(0x7f0d000f, float:1.8742145E38)
            android.view.View r2 = r2.inflate(r3, r4, r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r4.f732b0 = r2
            android.widget.LinearLayout r3 = r4.f739i0
            if (r3 == 0) goto L3a
            r3.addView(r2, r1)
            goto L3d
        L3a:
            r4.addView(r2, r1)
        L3d:
            if (r5 != 0) goto L4c
            boolean r2 = r4.f743m0
            if (r2 == 0) goto L44
            goto L4c
        L44:
            android.widget.ImageView r5 = r4.f732b0
            r0 = 8
            r5.setVisibility(r0)
            goto L62
        L4c:
            android.widget.ImageView r2 = r4.f732b0
            if (r0 == 0) goto L51
            goto L52
        L51:
            r5 = 0
        L52:
            r2.setImageDrawable(r5)
            android.widget.ImageView r5 = r4.f732b0
            int r5 = r5.getVisibility()
            if (r5 == 0) goto L62
            android.widget.ImageView r5 = r4.f732b0
            r5.setVisibility(r1)
        L62:
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            if (r2 == 0) goto L13
            android.widget.TextView r0 = r1.f734d0
            r0.setText(r2)
            android.widget.TextView r2 = r1.f734d0
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L22
            android.widget.TextView r2 = r1.f734d0
            r0 = 0
            goto L1f
        L13:
            android.widget.TextView r2 = r1.f734d0
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 == r0) goto L22
            android.widget.TextView r2 = r1.f734d0
        L1f:
            r2.setVisibility(r0)
        L22:
            return
    }
}
