package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public final class C0213g implements p138i0.InterfaceMenuItemC3056b {

    /* renamed from: A */
    public p227n0.AbstractC4643b f835A;

    /* renamed from: B */
    public android.view.MenuItem.OnActionExpandListener f836B;

    /* renamed from: C */
    public boolean f837C;

    /* renamed from: D */
    public android.view.ContextMenu.ContextMenuInfo f838D;

    /* renamed from: a */
    public final int f839a;

    /* renamed from: b */
    public final int f840b;

    /* renamed from: c */
    public final int f841c;

    /* renamed from: d */
    public final int f842d;

    /* renamed from: e */
    public java.lang.CharSequence f843e;

    /* renamed from: f */
    public java.lang.CharSequence f844f;

    /* renamed from: g */
    public android.content.Intent f845g;

    /* renamed from: h */
    public char f846h;

    /* renamed from: i */
    public int f847i;

    /* renamed from: j */
    public char f848j;

    /* renamed from: k */
    public int f849k;

    /* renamed from: l */
    public android.graphics.drawable.Drawable f850l;

    /* renamed from: m */
    public int f851m;

    /* renamed from: n */
    public androidx.appcompat.view.menu.C0211e f852n;

    /* renamed from: o */
    public androidx.appcompat.view.menu.SubMenuC0218l f853o;

    /* renamed from: p */
    public android.view.MenuItem.OnMenuItemClickListener f854p;

    /* renamed from: q */
    public java.lang.CharSequence f855q;

    /* renamed from: r */
    public java.lang.CharSequence f856r;

    /* renamed from: s */
    public android.content.res.ColorStateList f857s;

    /* renamed from: t */
    public android.graphics.PorterDuff.Mode f858t;

    /* renamed from: u */
    public boolean f859u;

    /* renamed from: v */
    public boolean f860v;

    /* renamed from: w */
    public boolean f861w;

    /* renamed from: x */
    public int f862x;

    /* renamed from: y */
    public int f863y;

    /* renamed from: z */
    public android.view.View f864z;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    public class a implements p227n0.AbstractC4643b.a {

        /* renamed from: a */
        public final /* synthetic */ androidx.appcompat.view.menu.C0213g f865a;

        public a(androidx.appcompat.view.menu.C0213g r1) {
                r0 = this;
                r0.f865a = r1
                r0.<init>()
                return
        }
    }

    public C0213g(androidx.appcompat.view.menu.C0211e r3, int r4, int r5, int r6, int r7, java.lang.CharSequence r8, int r9) {
            r2 = this;
            r2.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            r2.f847i = r0
            r2.f849k = r0
            r0 = 0
            r2.f851m = r0
            r1 = 0
            r2.f857s = r1
            r2.f858t = r1
            r2.f859u = r0
            r2.f860v = r0
            r2.f861w = r0
            r1 = 16
            r2.f862x = r1
            r2.f863y = r0
            r2.f837C = r0
            r2.f852n = r3
            r2.f839a = r5
            r2.f840b = r4
            r2.f841c = r6
            r2.f842d = r7
            r2.f843e = r8
            r2.f863y = r9
            return
    }

    /* renamed from: c */
    public static void m527c(java.lang.StringBuilder r0, int r1, int r2, java.lang.String r3) {
            r1 = r1 & r2
            if (r1 != r2) goto L6
            r0.append(r3)
        L6:
            return
    }

    @Override // p138i0.InterfaceMenuItemC3056b
    /* renamed from: a */
    public p227n0.AbstractC4643b mo528a() {
            r1 = this;
            n0.b r0 = r1.f835A
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b
    /* renamed from: b */
    public p138i0.InterfaceMenuItemC3056b mo529b(p227n0.AbstractC4643b r3) {
            r2 = this;
            n0.b r0 = r2.f835A
            r1 = 0
            if (r0 == 0) goto L7
            r0.f18537b = r1
        L7:
            r2.f864z = r1
            r2.f835A = r3
            androidx.appcompat.view.menu.e r3 = r2.f852n
            r0 = 1
            r3.m513p(r0)
            n0.b r3 = r2.f835A
            if (r3 == 0) goto L1d
            androidx.appcompat.view.menu.g$a r0 = new androidx.appcompat.view.menu.g$a
            r0.<init>(r2)
            r3.mo9210h(r0)
        L1d:
            return r2
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public boolean collapseActionView() {
            r2 = this;
            int r0 = r2.f863y
            r0 = r0 & 8
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.View r0 = r2.f864z
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            android.view.MenuItem$OnActionExpandListener r0 = r2.f836B
            if (r0 == 0) goto L1a
            boolean r0 = r0.onMenuItemActionCollapse(r2)
            if (r0 == 0) goto L19
            goto L1a
        L19:
            return r1
        L1a:
            androidx.appcompat.view.menu.e r0 = r2.f852n
            boolean r0 = r0.mo501d(r2)
            return r0
    }

    /* renamed from: d */
    public final android.graphics.drawable.Drawable m530d(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L2b
            boolean r0 = r1.f861w
            if (r0 == 0) goto L2b
            boolean r0 = r1.f859u
            if (r0 != 0) goto Le
            boolean r0 = r1.f860v
            if (r0 == 0) goto L2b
        Le:
            android.graphics.drawable.Drawable r2 = p103g0.C2200a.m5792h(r2)
            android.graphics.drawable.Drawable r2 = r2.mutate()
            boolean r0 = r1.f859u
            if (r0 == 0) goto L1f
            android.content.res.ColorStateList r0 = r1.f857s
            r2.setTintList(r0)
        L1f:
            boolean r0 = r1.f860v
            if (r0 == 0) goto L28
            android.graphics.PorterDuff$Mode r0 = r1.f858t
            r2.setTintMode(r0)
        L28:
            r0 = 0
            r1.f861w = r0
        L2b:
            return r2
    }

    /* renamed from: e */
    public char m531e() {
            r1 = this;
            androidx.appcompat.view.menu.e r0 = r1.f852n
            boolean r0 = r0.mo511n()
            if (r0 == 0) goto Lb
            char r0 = r1.f848j
            goto Ld
        Lb:
            char r0 = r1.f846h
        Ld:
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public boolean expandActionView() {
            r2 = this;
            boolean r0 = r2.m532f()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.MenuItem$OnActionExpandListener r0 = r2.f836B
            if (r0 == 0) goto L14
            boolean r0 = r0.onMenuItemActionExpand(r2)
            if (r0 == 0) goto L13
            goto L14
        L13:
            return r1
        L14:
            androidx.appcompat.view.menu.e r0 = r2.f852n
            boolean r0 = r0.mo503f(r2)
            return r0
    }

    /* renamed from: f */
    public boolean m532f() {
            r2 = this;
            int r0 = r2.f863y
            r0 = r0 & 8
            r1 = 0
            if (r0 == 0) goto L1a
            android.view.View r0 = r2.f864z
            if (r0 != 0) goto L15
            n0.b r0 = r2.f835A
            if (r0 == 0) goto L15
            android.view.View r0 = r0.mo9208d(r2)
            r2.f864z = r0
        L15:
            android.view.View r0 = r2.f864z
            if (r0 == 0) goto L1a
            r1 = 1
        L1a:
            return r1
    }

    /* renamed from: g */
    public boolean m533g() {
            r2 = this;
            int r0 = r2.f862x
            r1 = 32
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This is not supported, use MenuItemCompat.getActionProvider()"
            r0.<init>(r1)
            throw r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.view.View getActionView() {
            r1 = this;
            android.view.View r0 = r1.f864z
            if (r0 == 0) goto L5
            return r0
        L5:
            n0.b r0 = r1.f835A
            if (r0 == 0) goto L10
            android.view.View r0 = r0.mo9208d(r1)
            r1.f864z = r0
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public int getAlphabeticModifiers() {
            r1 = this;
            int r0 = r1.f849k
            return r0
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
            r1 = this;
            char r0 = r1.f848j
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f855q
            return r0
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
            r1 = this;
            int r0 = r1.f840b
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f850l
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r2.m530d(r0)
            return r0
        L9:
            int r0 = r2.f851m
            if (r0 == 0) goto L1f
            androidx.appcompat.view.menu.e r1 = r2.f852n
            android.content.Context r1 = r1.f808a
            android.graphics.drawable.Drawable r0 = p102g.C2199a.m5784b(r1, r0)
            r1 = 0
            r2.f851m = r1
            r2.f850l = r0
            android.graphics.drawable.Drawable r0 = r2.m530d(r0)
            return r0
        L1f:
            r0 = 0
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f857s
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f858t
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
            r1 = this;
            android.content.Intent r0 = r1.f845g
            return r0
    }

    @Override // android.view.MenuItem
    @android.view.ViewDebug.CapturedViewProperty
    public int getItemId() {
            r1 = this;
            int r0 = r1.f839a
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r1 = this;
            android.view.ContextMenu$ContextMenuInfo r0 = r1.f838D
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public int getNumericModifiers() {
            r1 = this;
            int r0 = r1.f847i
            return r0
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
            r1 = this;
            char r0 = r1.f846h
            return r0
    }

    @Override // android.view.MenuItem
    public int getOrder() {
            r1 = this;
            int r0 = r1.f841c
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
            r1 = this;
            androidx.appcompat.view.menu.l r0 = r1.f853o
            return r0
    }

    @Override // android.view.MenuItem
    @android.view.ViewDebug.CapturedViewProperty
    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f843e
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f844f
            if (r0 == 0) goto L5
            goto L7
        L5:
            java.lang.CharSequence r0 = r1.f843e
        L7:
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f856r
            return r0
    }

    /* renamed from: h */
    public boolean m534h() {
            r1 = this;
            int r0 = r1.f862x
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
            r1 = this;
            androidx.appcompat.view.menu.l r0 = r1.f853o
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: i */
    public p138i0.InterfaceMenuItemC3056b m535i(android.view.View r3) {
            r2 = this;
            r2.f864z = r3
            r0 = 0
            r2.f835A = r0
            if (r3 == 0) goto L15
            int r0 = r3.getId()
            r1 = -1
            if (r0 != r1) goto L15
            int r0 = r2.f839a
            if (r0 <= 0) goto L15
            r3.setId(r0)
        L15:
            androidx.appcompat.view.menu.e r3 = r2.f852n
            r0 = 1
            r3.f818k = r0
            r3.m513p(r0)
            return r2
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public boolean isActionViewExpanded() {
            r1 = this;
            boolean r0 = r1.f837C
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
            r2 = this;
            int r0 = r2.f862x
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
            r2 = this;
            int r0 = r2.f862x
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L8
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
            int r0 = r1.f862x
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
            r3 = this;
            n0.b r0 = r3.f835A
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            boolean r0 = r0.mo9209g()
            if (r0 == 0) goto L1d
            int r0 = r3.f862x
            r0 = r0 & 8
            if (r0 != 0) goto L1b
            n0.b r0 = r3.f835A
            boolean r0 = r0.mo1473b()
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            return r1
        L1d:
            int r0 = r3.f862x
            r0 = r0 & 8
            if (r0 != 0) goto L24
            goto L25
        L24:
            r1 = 0
        L25:
            return r1
    }

    /* renamed from: j */
    public void m536j(boolean r4) {
            r3 = this;
            int r0 = r3.f862x
            r1 = r0 & (-3)
            r2 = 0
            if (r4 == 0) goto L9
            r4 = 2
            goto La
        L9:
            r4 = 0
        La:
            r4 = r4 | r1
            r3.f862x = r4
            if (r0 == r4) goto L14
            androidx.appcompat.view.menu.e r4 = r3.f852n
            r4.m513p(r2)
        L14:
            return
    }

    /* renamed from: k */
    public void m537k(boolean r2) {
            r1 = this;
            int r0 = r1.f862x
            r0 = r0 & (-5)
            if (r2 == 0) goto L8
            r2 = 4
            goto L9
        L8:
            r2 = 0
        L9:
            r2 = r2 | r0
            r1.f862x = r2
            return
    }

    /* renamed from: l */
    public void m538l(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L7
            int r1 = r0.f862x
            r1 = r1 | 32
            goto Lb
        L7:
            int r1 = r0.f862x
            r1 = r1 & (-33)
        Lb:
            r0.f862x = r1
            return
    }

    /* renamed from: m */
    public boolean m539m(boolean r4) {
            r3 = this;
            int r0 = r3.f862x
            r1 = r0 & (-9)
            r2 = 0
            if (r4 == 0) goto L9
            r4 = 0
            goto Lb
        L9:
            r4 = 8
        Lb:
            r4 = r4 | r1
            r3.f862x = r4
            if (r0 == r4) goto L11
            r2 = 1
        L11:
            return r2
    }

    /* renamed from: n */
    public boolean m540n() {
            r1 = this;
            androidx.appcompat.view.menu.e r0 = r1.f852n
            boolean r0 = r0.mo512o()
            if (r0 == 0) goto L10
            char r0 = r1.m531e()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This is not supported, use MenuItemCompat.setActionProvider()"
            r2.<init>(r0)
            throw r2
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.view.MenuItem setActionView(int r4) {
            r3 = this;
            androidx.appcompat.view.menu.e r0 = r3.f852n
            android.content.Context r0 = r0.f808a
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r0 = 0
            android.view.View r4 = r1.inflate(r4, r2, r0)
            r3.m535i(r4)
            return r3
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setActionView(android.view.View r1) {
            r0 = this;
            r0.m535i(r1)
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2) {
            r1 = this;
            char r0 = r1.f848j
            if (r0 != r2) goto L5
            return r1
        L5:
            char r2 = java.lang.Character.toLowerCase(r2)
            r1.f848j = r2
            androidx.appcompat.view.menu.e r2 = r1.f852n
            r0 = 0
            r2.m513p(r0)
            return r1
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2, int r3) {
            r1 = this;
            char r0 = r1.f848j
            if (r0 != r2) goto L9
            int r0 = r1.f849k
            if (r0 != r3) goto L9
            return r1
        L9:
            char r2 = java.lang.Character.toLowerCase(r2)
            r1.f848j = r2
            int r2 = android.view.KeyEvent.normalizeMetaState(r3)
            r1.f849k = r2
            androidx.appcompat.view.menu.e r2 = r1.f852n
            r3 = 0
            r2.m513p(r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean r3) {
            r2 = this;
            int r0 = r2.f862x
            r1 = r0 & (-2)
            r3 = r3 | r1
            r2.f862x = r3
            if (r0 == r3) goto Lf
            androidx.appcompat.view.menu.e r3 = r2.f852n
            r0 = 0
            r3.m513p(r0)
        Lf:
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean r7) {
            r6 = this;
            int r0 = r6.f862x
            r0 = r0 & 4
            if (r0 == 0) goto L45
            androidx.appcompat.view.menu.e r7 = r6.f852n
            java.util.Objects.requireNonNull(r7)
            int r0 = r6.getGroupId()
            java.util.ArrayList<androidx.appcompat.view.menu.g> r1 = r7.f813f
            int r1 = r1.size()
            r7.m522y()
            r2 = 0
            r3 = 0
        L1a:
            if (r3 >= r1) goto L41
            java.util.ArrayList<androidx.appcompat.view.menu.g> r4 = r7.f813f
            java.lang.Object r4 = r4.get(r3)
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.C0213g) r4
            int r5 = r4.f840b
            if (r5 != r0) goto L3e
            boolean r5 = r4.m534h()
            if (r5 != 0) goto L2f
            goto L3e
        L2f:
            boolean r5 = r4.isCheckable()
            if (r5 != 0) goto L36
            goto L3e
        L36:
            if (r4 != r6) goto L3a
            r5 = 1
            goto L3b
        L3a:
            r5 = 0
        L3b:
            r4.m536j(r5)
        L3e:
            int r3 = r3 + 1
            goto L1a
        L41:
            r7.m521x()
            goto L48
        L45:
            r6.m536j(r7)
        L48:
            return r6
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            r1.f855q = r2
            androidx.appcompat.view.menu.e r2 = r1.f852n
            r0 = 0
            r2.m513p(r0)
            return r1
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public p138i0.InterfaceMenuItemC3056b setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            r1.f855q = r2
            androidx.appcompat.view.menu.e r2 = r1.f852n
            r0 = 0
            r2.m513p(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L7
            int r2 = r1.f862x
            r2 = r2 | 16
            goto Lb
        L7:
            int r2 = r1.f862x
            r2 = r2 & (-17)
        Lb:
            r1.f862x = r2
            androidx.appcompat.view.menu.e r2 = r1.f852n
            r0 = 0
            r2.m513p(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int r2) {
            r1 = this;
            r0 = 0
            r1.f850l = r0
            r1.f851m = r2
            r2 = 1
            r1.f861w = r2
            androidx.appcompat.view.menu.e r2 = r1.f852n
            r0 = 0
            r2.m513p(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.f851m = r0
            r1.f850l = r2
            r2 = 1
            r1.f861w = r2
            androidx.appcompat.view.menu.e r2 = r1.f852n
            r2.m513p(r0)
            return r1
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.f857s = r2
            r2 = 1
            r1.f859u = r2
            r1.f861w = r2
            androidx.appcompat.view.menu.e r2 = r1.f852n
            r0 = 0
            r2.m513p(r0)
            return r1
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.f858t = r2
            r2 = 1
            r1.f860v = r2
            r1.f861w = r2
            androidx.appcompat.view.menu.e r2 = r1.f852n
            r0 = 0
            r2.m513p(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent r1) {
            r0 = this;
            r0.f845g = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2) {
            r1 = this;
            char r0 = r1.f846h
            if (r0 != r2) goto L5
            return r1
        L5:
            r1.f846h = r2
            androidx.appcompat.view.menu.e r2 = r1.f852n
            r0 = 0
            r2.m513p(r0)
            return r1
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2, int r3) {
            r1 = this;
            char r0 = r1.f846h
            if (r0 != r2) goto L9
            int r0 = r1.f847i
            if (r0 != r3) goto L9
            return r1
        L9:
            r1.f846h = r2
            int r2 = android.view.KeyEvent.normalizeMetaState(r3)
            r1.f847i = r2
            androidx.appcompat.view.menu.e r2 = r1.f852n
            r3 = 0
            r2.m513p(r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r1) {
            r0 = this;
            r0.f836B = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r1) {
            r0 = this;
            r0.f854p = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r1, char r2) {
            r0 = this;
            r0.f846h = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f848j = r1
            androidx.appcompat.view.menu.e r1 = r0.f852n
            r2 = 0
            r1.m513p(r2)
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4) {
            r0 = this;
            r0.f846h = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r3)
            r0.f847i = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f848j = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r4)
            r0.f849k = r1
            androidx.appcompat.view.menu.e r1 = r0.f852n
            r2 = 0
            r1.m513p(r2)
            return r0
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public void setShowAsAction(int r4) {
            r3 = this;
            r0 = r4 & 3
            r1 = 1
            if (r0 == 0) goto L13
            if (r0 == r1) goto L13
            r2 = 2
            if (r0 != r2) goto Lb
            goto L13
        Lb:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive."
            r4.<init>(r0)
            throw r4
        L13:
            r3.f863y = r4
            androidx.appcompat.view.menu.e r4 = r3.f852n
            r4.f818k = r1
            r4.m513p(r1)
            return
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public android.view.MenuItem setShowAsActionFlags(int r1) {
            r0 = this;
            r0.setShowAsAction(r1)
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int r2) {
            r1 = this;
            androidx.appcompat.view.menu.e r0 = r1.f852n
            android.content.Context r0 = r0.f808a
            java.lang.String r2 = r0.getString(r2)
            r1.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence r3) {
            r2 = this;
            r2.f843e = r3
            androidx.appcompat.view.menu.e r0 = r2.f852n
            r1 = 0
            r0.m513p(r1)
            androidx.appcompat.view.menu.l r0 = r2.f853o
            if (r0 == 0) goto Lf
            r0.setHeaderTitle(r3)
        Lf:
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence r2) {
            r1 = this;
            r1.f844f = r2
            androidx.appcompat.view.menu.e r2 = r1.f852n
            r0 = 0
            r2.m513p(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTooltipText(java.lang.CharSequence r2) {
            r1 = this;
            r1.f856r = r2
            androidx.appcompat.view.menu.e r2 = r1.f852n
            r0 = 0
            r2.m513p(r0)
            return r1
    }

    @Override // p138i0.InterfaceMenuItemC3056b, android.view.MenuItem
    public p138i0.InterfaceMenuItemC3056b setTooltipText(java.lang.CharSequence r2) {
            r1 = this;
            r1.f856r = r2
            androidx.appcompat.view.menu.e r2 = r1.f852n
            r0 = 0
            r2.m513p(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean r2) {
            r1 = this;
            boolean r2 = r1.m539m(r2)
            if (r2 == 0) goto Le
            androidx.appcompat.view.menu.e r2 = r1.f852n
            r0 = 1
            r2.f815h = r0
            r2.m513p(r0)
        Le:
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f843e
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }
}
