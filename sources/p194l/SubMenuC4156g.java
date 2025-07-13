package p194l;

/* renamed from: l.g */
/* loaded from: classes.dex */
public class SubMenuC4156g extends p194l.MenuC4154e implements android.view.SubMenu {

    /* renamed from: e */
    public final p138i0.InterfaceSubMenuC3057c f17215e;

    public SubMenuC4156g(android.content.Context r1, p138i0.InterfaceSubMenuC3057c r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f17215e = r2
            return
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
            r1 = this;
            i0.c r0 = r1.f17215e
            r0.clearHeader()
            return
    }

    @Override // android.view.SubMenu
    public android.view.MenuItem getItem() {
            r1 = this;
            i0.c r0 = r1.f17215e
            android.view.MenuItem r0 = r0.getItem()
            android.view.MenuItem r0 = r1.m9199e(r0)
            return r0
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(int r2) {
            r1 = this;
            i0.c r0 = r1.f17215e
            r0.setHeaderIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            i0.c r0 = r1.f17215e
            r0.setHeaderIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(int r2) {
            r1 = this;
            i0.c r0 = r1.f17215e
            r0.setHeaderTitle(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(java.lang.CharSequence r2) {
            r1 = this;
            i0.c r0 = r1.f17215e
            r0.setHeaderTitle(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderView(android.view.View r2) {
            r1 = this;
            i0.c r0 = r1.f17215e
            r0.setHeaderView(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(int r2) {
            r1 = this;
            i0.c r0 = r1.f17215e
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            i0.c r0 = r1.f17215e
            r0.setIcon(r2)
            return r1
    }
}
