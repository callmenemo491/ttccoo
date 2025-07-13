package p194l;

/* renamed from: l.a */
/* loaded from: classes.dex */
public class C4150a implements p138i0.InterfaceMenuItemC3056b {

    /* renamed from: a */
    public java.lang.CharSequence f17184a;

    /* renamed from: b */
    public java.lang.CharSequence f17185b;

    /* renamed from: c */
    public android.content.Intent f17186c;

    /* renamed from: d */
    public char f17187d;

    /* renamed from: e */
    public int f17188e;

    /* renamed from: f */
    public char f17189f;

    /* renamed from: g */
    public int f17190g;

    /* renamed from: h */
    public android.graphics.drawable.Drawable f17191h;

    /* renamed from: i */
    public android.content.Context f17192i;

    /* renamed from: j */
    public java.lang.CharSequence f17193j;

    /* renamed from: k */
    public java.lang.CharSequence f17194k;

    /* renamed from: l */
    public android.content.res.ColorStateList f17195l;

    /* renamed from: m */
    public android.graphics.PorterDuff.Mode f17196m;

    /* renamed from: n */
    public boolean f17197n;

    /* renamed from: o */
    public boolean f17198o;

    /* renamed from: p */
    public int f17199p;

    public C4150a(android.content.Context r1, int r2, int r3, int r4, java.lang.CharSequence r5) {
            r0 = this;
            r0.<init>()
            r2 = 4096(0x1000, float:5.74E-42)
            r0.f17188e = r2
            r0.f17190g = r2
            r2 = 0
            r0.f17195l = r2
            r0.f17196m = r2
            r2 = 0
            r0.f17197n = r2
            r0.f17198o = r2
            r2 = 16
            r0.f17199p = r2
            r0.f17192i = r1
            r0.f17184a = r5
            return
    }

    @Override // p138i0.InterfaceMenuItemC3056b
    /* renamed from: a */
    public p227n0.AbstractC4643b mo528a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b
    /* renamed from: b */
    public p138i0.InterfaceMenuItemC3056b mo529b(p227n0.AbstractC4643b r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    /* renamed from: c */
    public final void m9196c() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f17191h
            if (r0 == 0) goto L2c
            boolean r1 = r2.f17197n
            if (r1 != 0) goto Lc
            boolean r1 = r2.f17198o
            if (r1 == 0) goto L2c
        Lc:
            android.graphics.drawable.Drawable r0 = p103g0.C2200a.m5792h(r0)
            r2.f17191h = r0
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.f17191h = r0
            boolean r1 = r2.f17197n
            if (r1 == 0) goto L21
            android.content.res.ColorStateList r1 = r2.f17195l
            r0.setTintList(r1)
        L21:
            boolean r0 = r2.f17198o
            if (r0 == 0) goto L2c
            android.graphics.drawable.Drawable r0 = r2.f17191h
            android.graphics.PorterDuff$Mode r1 = r2.f17196m
            r0.setTintMode(r1)
        L2c:
            return
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public boolean collapseActionView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public boolean expandActionView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.view.View getActionView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public int getAlphabeticModifiers() {
            r1 = this;
            int r0 = r1.f17190g
            return r0
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
            r1 = this;
            char r0 = r1.f17189f
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f17193j
            return r0
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f17191h
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f17195l
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f17196m
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
            r1 = this;
            android.content.Intent r0 = r1.f17186c
            return r0
    }

    @Override // android.view.MenuItem
    public int getItemId() {
            r1 = this;
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public int getNumericModifiers() {
            r1 = this;
            int r0 = r1.f17188e
            return r0
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
            r1 = this;
            char r0 = r1.f17187d
            return r0
    }

    @Override // android.view.MenuItem
    public int getOrder() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f17184a
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f17185b
            if (r0 == 0) goto L5
            goto L7
        L5:
            java.lang.CharSequence r0 = r1.f17184a
        L7:
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f17194k
            return r0
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public boolean isActionViewExpanded() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
            r2 = this;
            int r0 = r2.f17199p
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
            r1 = this;
            int r0 = r1.f17199p
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
            r1 = this;
            int r0 = r1.f17199p
            r0 = r0 & 16
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
            r1 = this;
            int r0 = r1.f17199p
            r0 = r0 & 8
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.view.MenuItem setActionView(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.view.MenuItem setActionView(android.view.View r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r1) {
            r0 = this;
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.f17189f = r1
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r1, int r2) {
            r0 = this;
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.f17189f = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r2)
            r0.f17190g = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean r2) {
            r1 = this;
            int r0 = r1.f17199p
            r0 = r0 & (-2)
            r2 = r2 | r0
            r1.f17199p = r2
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            int r0 = r1.f17199p
            r0 = r0 & (-3)
            if (r2 == 0) goto L8
            r2 = 2
            goto L9
        L8:
            r2 = 0
        L9:
            r2 = r2 | r0
            r1.f17199p = r2
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.f17193j = r1
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public p138i0.InterfaceMenuItemC3056b setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.f17193j = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            int r0 = r1.f17199p
            r0 = r0 & (-17)
            if (r2 == 0) goto L9
            r2 = 16
            goto La
        L9:
            r2 = 0
        La:
            r2 = r2 | r0
            r1.f17199p = r2
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int r3) {
            r2 = this;
            android.content.Context r0 = r2.f17192i
            java.lang.Object r1 = p046d0.C1259a.f6733a
            android.graphics.drawable.Drawable r3 = p046d0.C1259a.b.m3710b(r0, r3)
            r2.f17191h = r3
            r2.m9196c()
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f17191h = r1
            r0.m9196c()
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f17195l = r1
            r1 = 1
            r0.f17197n = r1
            r0.m9196c()
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.f17196m = r1
            r1 = 1
            r0.f17198o = r1
            r0.m9196c()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent r1) {
            r0 = this;
            r0.f17186c = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r1) {
            r0 = this;
            r0.f17187d = r1
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r1, int r2) {
            r0 = this;
            r0.f17187d = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r2)
            r0.f17188e = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r1) {
            r0 = this;
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r1, char r2) {
            r0 = this;
            r0.f17187d = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f17189f = r1
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4) {
            r0 = this;
            r0.f17187d = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r3)
            r0.f17188e = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f17189f = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r4)
            r0.f17190g = r1
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public void setShowAsAction(int r1) {
            r0 = this;
            return
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.view.MenuItem setShowAsActionFlags(int r1) {
            r0 = this;
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f17192i
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.f17184a = r2
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f17184a = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence r1) {
            r0 = this;
            r0.f17185b = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.f17194k = r1
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public p138i0.InterfaceMenuItemC3056b setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.f17194k = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean r3) {
            r2 = this;
            int r0 = r2.f17199p
            r1 = 8
            r0 = r0 & r1
            if (r3 == 0) goto L8
            r1 = 0
        L8:
            r3 = r0 | r1
            r2.f17199p = r3
            return r2
    }
}
