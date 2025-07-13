package p138i0;

/* renamed from: i0.b */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC3056b extends android.view.MenuItem {
    /* renamed from: a */
    p227n0.AbstractC4643b mo528a();

    /* renamed from: b */
    p138i0.InterfaceMenuItemC3056b mo529b(p227n0.AbstractC4643b r1);

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    android.view.View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    java.lang.CharSequence getContentDescription();

    @Override // android.view.MenuItem
    android.content.res.ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    android.graphics.PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    java.lang.CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    android.view.MenuItem setActionView(int r1);

    @Override // android.view.MenuItem
    android.view.MenuItem setActionView(android.view.View r1);

    @Override // android.view.MenuItem
    android.view.MenuItem setAlphabeticShortcut(char r1, int r2);

    @Override // android.view.MenuItem
    p138i0.InterfaceMenuItemC3056b setContentDescription(java.lang.CharSequence r1);

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintList(android.content.res.ColorStateList r1);

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r1);

    @Override // android.view.MenuItem
    android.view.MenuItem setNumericShortcut(char r1, int r2);

    @Override // android.view.MenuItem
    android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4);

    @Override // android.view.MenuItem
    void setShowAsAction(int r1);

    @Override // android.view.MenuItem
    android.view.MenuItem setShowAsActionFlags(int r1);

    @Override // android.view.MenuItem
    p138i0.InterfaceMenuItemC3056b setTooltipText(java.lang.CharSequence r1);
}
