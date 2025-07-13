package p194l;

/* renamed from: l.c */
/* loaded from: classes.dex */
public class MenuItemC4152c extends p194l.AbstractC4151b implements android.view.MenuItem {

    /* renamed from: d */
    public final p138i0.InterfaceMenuItemC3056b f17203d;

    /* renamed from: e */
    public java.lang.reflect.Method f17204e;

    /* renamed from: l.c$a */
    public class a extends p227n0.AbstractC4643b {

        /* renamed from: c */
        public final android.view.ActionProvider f17205c;

        /* renamed from: d */
        public final /* synthetic */ p194l.MenuItemC4152c f17206d;

        public a(p194l.MenuItemC4152c r1, android.content.Context r2, android.view.ActionProvider r3) {
                r0 = this;
                r0.f17206d = r1
                r0.<init>(r2)
                r0.f17205c = r3
                return
        }

        @Override // p227n0.AbstractC4643b
        /* renamed from: a */
        public boolean mo9206a() {
                r1 = this;
                android.view.ActionProvider r0 = r1.f17205c
                boolean r0 = r0.hasSubMenu()
                return r0
        }

        @Override // p227n0.AbstractC4643b
        /* renamed from: c */
        public android.view.View mo1474c() {
                r1 = this;
                android.view.ActionProvider r0 = r1.f17205c
                android.view.View r0 = r0.onCreateActionView()
                return r0
        }

        @Override // p227n0.AbstractC4643b
        /* renamed from: e */
        public boolean mo1475e() {
                r1 = this;
                android.view.ActionProvider r0 = r1.f17205c
                boolean r0 = r0.onPerformDefaultAction()
                return r0
        }

        @Override // p227n0.AbstractC4643b
        /* renamed from: f */
        public void mo9207f(android.view.SubMenu r3) {
                r2 = this;
                android.view.ActionProvider r0 = r2.f17205c
                l.c r1 = r2.f17206d
                android.view.SubMenu r3 = r1.m9200f(r3)
                r0.onPrepareSubMenu(r3)
                return
        }
    }

    /* renamed from: l.c$b */
    public class b extends p194l.MenuItemC4152c.a implements android.view.ActionProvider.VisibilityListener {

        /* renamed from: e */
        public p227n0.AbstractC4643b.a f17207e;

        public b(p194l.MenuItemC4152c r1, android.content.Context r2, android.view.ActionProvider r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // p227n0.AbstractC4643b
        /* renamed from: b */
        public boolean mo1473b() {
                r1 = this;
                android.view.ActionProvider r0 = r1.f17205c
                boolean r0 = r0.isVisible()
                return r0
        }

        @Override // p227n0.AbstractC4643b
        /* renamed from: d */
        public android.view.View mo9208d(android.view.MenuItem r2) {
                r1 = this;
                android.view.ActionProvider r0 = r1.f17205c
                android.view.View r2 = r0.onCreateActionView(r2)
                return r2
        }

        @Override // p227n0.AbstractC4643b
        /* renamed from: g */
        public boolean mo9209g() {
                r1 = this;
                android.view.ActionProvider r0 = r1.f17205c
                boolean r0 = r0.overridesItemVisibility()
                return r0
        }

        @Override // p227n0.AbstractC4643b
        /* renamed from: h */
        public void mo9210h(p227n0.AbstractC4643b.a r1) {
                r0 = this;
                r0.f17207e = r1
                android.view.ActionProvider r1 = r0.f17205c
                r1.setVisibilityListener(r0)
                return
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean r2) {
                r1 = this;
                n0.b$a r2 = r1.f17207e
                if (r2 == 0) goto L10
                androidx.appcompat.view.menu.g$a r2 = (androidx.appcompat.view.menu.C0213g.a) r2
                androidx.appcompat.view.menu.g r2 = r2.f865a
                androidx.appcompat.view.menu.e r2 = r2.f852n
                r0 = 1
                r2.f815h = r0
                r2.m513p(r0)
            L10:
                return
        }
    }

    /* renamed from: l.c$c */
    public static class c extends android.widget.FrameLayout implements p177k.InterfaceC3618b {

        /* renamed from: a0 */
        public final android.view.CollapsibleActionView f17208a0;

        public c(android.view.View r2) {
                r1 = this;
                android.content.Context r0 = r2.getContext()
                r1.<init>(r0)
                r0 = r2
                android.view.CollapsibleActionView r0 = (android.view.CollapsibleActionView) r0
                r1.f17208a0 = r0
                r1.addView(r2)
                return
        }

        @Override // p177k.InterfaceC3618b
        /* renamed from: c */
        public void mo591c() {
                r1 = this;
                android.view.CollapsibleActionView r0 = r1.f17208a0
                r0.onActionViewExpanded()
                return
        }

        @Override // p177k.InterfaceC3618b
        /* renamed from: e */
        public void mo592e() {
                r1 = this;
                android.view.CollapsibleActionView r0 = r1.f17208a0
                r0.onActionViewCollapsed()
                return
        }
    }

    /* renamed from: l.c$d */
    public class d implements android.view.MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final android.view.MenuItem.OnActionExpandListener f17209a;

        /* renamed from: b */
        public final /* synthetic */ p194l.MenuItemC4152c f17210b;

        public d(p194l.MenuItemC4152c r1, android.view.MenuItem.OnActionExpandListener r2) {
                r0 = this;
                r0.f17210b = r1
                r0.<init>()
                r0.f17209a = r2
                return
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(android.view.MenuItem r3) {
                r2 = this;
                android.view.MenuItem$OnActionExpandListener r0 = r2.f17209a
                l.c r1 = r2.f17210b
                android.view.MenuItem r3 = r1.m9199e(r3)
                boolean r3 = r0.onMenuItemActionCollapse(r3)
                return r3
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(android.view.MenuItem r3) {
                r2 = this;
                android.view.MenuItem$OnActionExpandListener r0 = r2.f17209a
                l.c r1 = r2.f17210b
                android.view.MenuItem r3 = r1.m9199e(r3)
                boolean r3 = r0.onMenuItemActionExpand(r3)
                return r3
        }
    }

    /* renamed from: l.c$e */
    public class e implements android.view.MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public final android.view.MenuItem.OnMenuItemClickListener f17211a;

        /* renamed from: b */
        public final /* synthetic */ p194l.MenuItemC4152c f17212b;

        public e(p194l.MenuItemC4152c r1, android.view.MenuItem.OnMenuItemClickListener r2) {
                r0 = this;
                r0.f17212b = r1
                r0.<init>()
                r0.f17211a = r2
                return
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem r3) {
                r2 = this;
                android.view.MenuItem$OnMenuItemClickListener r0 = r2.f17211a
                l.c r1 = r2.f17212b
                android.view.MenuItem r3 = r1.m9199e(r3)
                boolean r3 = r0.onMenuItemClick(r3)
                return r3
        }
    }

    public MenuItemC4152c(android.content.Context r1, p138i0.InterfaceMenuItemC3056b r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto L8
            r0.f17203d = r2
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrapped Object can not be null."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
            r1 = this;
            i0.b r0 = r1.f17203d
            boolean r0 = r0.collapseActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
            r1 = this;
            i0.b r0 = r1.f17203d
            boolean r0 = r0.expandActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
            r2 = this;
            i0.b r0 = r2.f17203d
            n0.b r0 = r0.mo528a()
            boolean r1 = r0 instanceof p194l.MenuItemC4152c.a
            if (r1 == 0) goto Lf
            l.c$a r0 = (p194l.MenuItemC4152c.a) r0
            android.view.ActionProvider r0 = r0.f17205c
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.View getActionView() {
            r2 = this;
            i0.b r0 = r2.f17203d
            android.view.View r0 = r0.getActionView()
            boolean r1 = r0 instanceof p194l.MenuItemC4152c.c
            if (r1 == 0) goto L10
            l.c$c r0 = (p194l.MenuItemC4152c.c) r0
            android.view.CollapsibleActionView r0 = r0.f17208a0
            android.view.View r0 = (android.view.View) r0
        L10:
            return r0
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
            r1 = this;
            i0.b r0 = r1.f17203d
            int r0 = r0.getAlphabeticModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
            r1 = this;
            i0.b r0 = r1.f17203d
            char r0 = r0.getAlphabeticShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
            r1 = this;
            i0.b r0 = r1.f17203d
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
            r1 = this;
            i0.b r0 = r1.f17203d
            int r0 = r0.getGroupId()
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
            r1 = this;
            i0.b r0 = r1.f17203d
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
            r1 = this;
            i0.b r0 = r1.f17203d
            android.content.res.ColorStateList r0 = r0.getIconTintList()
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            i0.b r0 = r1.f17203d
            android.graphics.PorterDuff$Mode r0 = r0.getIconTintMode()
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
            r1 = this;
            i0.b r0 = r1.f17203d
            android.content.Intent r0 = r0.getIntent()
            return r0
    }

    @Override // android.view.MenuItem
    public int getItemId() {
            r1 = this;
            i0.b r0 = r1.f17203d
            int r0 = r0.getItemId()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r1 = this;
            i0.b r0 = r1.f17203d
            android.view.ContextMenu$ContextMenuInfo r0 = r0.getMenuInfo()
            return r0
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
            r1 = this;
            i0.b r0 = r1.f17203d
            int r0 = r0.getNumericModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
            r1 = this;
            i0.b r0 = r1.f17203d
            char r0 = r0.getNumericShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public int getOrder() {
            r1 = this;
            i0.b r0 = r1.f17203d
            int r0 = r0.getOrder()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
            r1 = this;
            i0.b r0 = r1.f17203d
            android.view.SubMenu r0 = r0.getSubMenu()
            android.view.SubMenu r0 = r1.m9200f(r0)
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
            r1 = this;
            i0.b r0 = r1.f17203d
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
            r1 = this;
            i0.b r0 = r1.f17203d
            java.lang.CharSequence r0 = r0.getTitleCondensed()
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
            r1 = this;
            i0.b r0 = r1.f17203d
            java.lang.CharSequence r0 = r0.getTooltipText()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
            r1 = this;
            i0.b r0 = r1.f17203d
            boolean r0 = r0.hasSubMenu()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
            r1 = this;
            i0.b r0 = r1.f17203d
            boolean r0 = r0.isActionViewExpanded()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
            r1 = this;
            i0.b r0 = r1.f17203d
            boolean r0 = r0.isCheckable()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
            r1 = this;
            i0.b r0 = r1.f17203d
            boolean r0 = r0.isChecked()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
            r1 = this;
            i0.b r0 = r1.f17203d
            boolean r0 = r0.isEnabled()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
            r1 = this;
            i0.b r0 = r1.f17203d
            boolean r0 = r0.isVisible()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider r3) {
            r2 = this;
            l.c$b r0 = new l.c$b
            java.lang.Object r1 = r2.f17200a
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r2, r1, r3)
            i0.b r1 = r2.f17203d
            if (r3 == 0) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            r1.mo529b(r0)
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(int r3) {
            r2 = this;
            i0.b r0 = r2.f17203d
            r0.setActionView(r3)
            i0.b r3 = r2.f17203d
            android.view.View r3 = r3.getActionView()
            boolean r0 = r3 instanceof android.view.CollapsibleActionView
            if (r0 == 0) goto L19
            i0.b r0 = r2.f17203d
            l.c$c r1 = new l.c$c
            r1.<init>(r3)
            r0.setActionView(r1)
        L19:
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(android.view.View r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.CollapsibleActionView
            if (r0 == 0) goto La
            l.c$c r0 = new l.c$c
            r0.<init>(r2)
            r2 = r0
        La:
            i0.b r0 = r1.f17203d
            r0.setActionView(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setAlphabeticShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2, int r3) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setAlphabeticShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setCheckable(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setChecked(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setContentDescription(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setEnabled(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setIconTintList(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setIconTintMode(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setIntent(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setNumericShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2, int r3) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setNumericShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r3) {
            r2 = this;
            i0.b r0 = r2.f17203d
            if (r3 == 0) goto La
            l.c$d r1 = new l.c$d
            r1.<init>(r2, r3)
            goto Lb
        La:
            r1 = 0
        Lb:
            r0.setOnActionExpandListener(r1)
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r3) {
            r2 = this;
            i0.b r0 = r2.f17203d
            if (r3 == 0) goto La
            l.c$e r1 = new l.c$e
            r1.<init>(r2, r3)
            goto Lb
        La:
            r1 = 0
        Lb:
            r0.setOnMenuItemClickListener(r1)
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r2, char r3) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r2, char r3, int r4, int r5) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setShortcut(r2, r3, r4, r5)
            return r1
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setShowAsAction(r2)
            return
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShowAsActionFlags(int r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setShowAsActionFlags(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setTitleCondensed(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTooltipText(java.lang.CharSequence r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            r0.setTooltipText(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean r2) {
            r1 = this;
            i0.b r0 = r1.f17203d
            android.view.MenuItem r2 = r0.setVisible(r2)
            return r2
    }
}
