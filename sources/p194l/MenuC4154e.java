package p194l;

/* renamed from: l.e */
/* loaded from: classes.dex */
public class MenuC4154e extends p194l.AbstractC4151b implements android.view.Menu {

    /* renamed from: d */
    public final p138i0.InterfaceMenuC3055a f17214d;

    public MenuC4154e(android.content.Context r1, p138i0.InterfaceMenuC3055a r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto L8
            r0.f17214d = r2
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrapped Object can not be null."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2) {
            r1 = this;
            i0.a r0 = r1.f17214d
            android.view.MenuItem r2 = r0.add(r2)
            android.view.MenuItem r2 = r1.m9199e(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2, int r3, int r4, int r5) {
            r1 = this;
            i0.a r0 = r1.f17214d
            android.view.MenuItem r2 = r0.add(r2, r3, r4, r5)
            android.view.MenuItem r2 = r1.m9199e(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2, int r3, int r4, java.lang.CharSequence r5) {
            r1 = this;
            i0.a r0 = r1.f17214d
            android.view.MenuItem r2 = r0.add(r2, r3, r4, r5)
            android.view.MenuItem r2 = r1.m9199e(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence r2) {
            r1 = this;
            i0.a r0 = r1.f17214d
            android.view.MenuItem r2 = r0.add(r2)
            android.view.MenuItem r2 = r1.m9199e(r2)
            return r2
    }

    @Override // android.view.Menu
    public int addIntentOptions(int r13, int r14, int r15, android.content.ComponentName r16, android.content.Intent[] r17, android.content.Intent r18, int r19, android.view.MenuItem[] r20) {
            r12 = this;
            r0 = r12
            r1 = r20
            if (r1 == 0) goto L9
            int r2 = r1.length
            android.view.MenuItem[] r2 = new android.view.MenuItem[r2]
            goto La
        L9:
            r2 = 0
        La:
            i0.a r3 = r0.f17214d
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r2
            int r3 = r3.addIntentOptions(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto L2d
            r4 = 0
            int r5 = r2.length
        L20:
            if (r4 >= r5) goto L2d
            r6 = r2[r4]
            android.view.MenuItem r6 = r12.m9199e(r6)
            r1[r4] = r6
            int r4 = r4 + 1
            goto L20
        L2d:
            return r3
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2) {
            r1 = this;
            i0.a r0 = r1.f17214d
            android.view.SubMenu r2 = r0.addSubMenu(r2)
            android.view.SubMenu r2 = r1.m9200f(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
            r1 = this;
            i0.a r0 = r1.f17214d
            android.view.SubMenu r2 = r0.addSubMenu(r2, r3, r4, r5)
            android.view.SubMenu r2 = r1.m9200f(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2, int r3, int r4, java.lang.CharSequence r5) {
            r1 = this;
            i0.a r0 = r1.f17214d
            android.view.SubMenu r2 = r0.addSubMenu(r2, r3, r4, r5)
            android.view.SubMenu r2 = r1.m9200f(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence r2) {
            r1 = this;
            i0.a r0 = r1.f17214d
            android.view.SubMenu r2 = r0.addSubMenu(r2)
            android.view.SubMenu r2 = r1.m9200f(r2)
            return r2
    }

    @Override // android.view.Menu
    public void clear() {
            r1 = this;
            s.h<i0.b, android.view.MenuItem> r0 = r1.f17201b
            s.h r0 = (p319s.C5941h) r0
            if (r0 == 0) goto L9
            r0.clear()
        L9:
            s.h<i0.c, android.view.SubMenu> r0 = r1.f17202c
            s.h r0 = (p319s.C5941h) r0
            if (r0 == 0) goto L12
            r0.clear()
        L12:
            i0.a r0 = r1.f17214d
            r0.clear()
            return
    }

    @Override // android.view.Menu
    public void close() {
            r1 = this;
            i0.a r0 = r1.f17214d
            r0.close()
            return
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int r2) {
            r1 = this;
            i0.a r0 = r1.f17214d
            android.view.MenuItem r2 = r0.findItem(r2)
            android.view.MenuItem r2 = r1.m9199e(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int r2) {
            r1 = this;
            i0.a r0 = r1.f17214d
            android.view.MenuItem r2 = r0.getItem(r2)
            android.view.MenuItem r2 = r1.m9199e(r2)
            return r2
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
            r1 = this;
            i0.a r0 = r1.f17214d
            boolean r0 = r0.hasVisibleItems()
            return r0
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int r2, android.view.KeyEvent r3) {
            r1 = this;
            i0.a r0 = r1.f17214d
            boolean r2 = r0.isShortcutKey(r2, r3)
            return r2
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int r2, int r3) {
            r1 = this;
            i0.a r0 = r1.f17214d
            boolean r2 = r0.performIdentifierAction(r2, r3)
            return r2
    }

    @Override // android.view.Menu
    public boolean performShortcut(int r2, android.view.KeyEvent r3, int r4) {
            r1 = this;
            i0.a r0 = r1.f17214d
            boolean r2 = r0.performShortcut(r2, r3, r4)
            return r2
    }

    @Override // android.view.Menu
    public void removeGroup(int r4) {
            r3 = this;
            s.h<i0.b, android.view.MenuItem> r0 = r3.f17201b
            s.h r0 = (p319s.C5941h) r0
            if (r0 != 0) goto L7
            goto L28
        L7:
            r0 = 0
        L8:
            s.h<i0.b, android.view.MenuItem> r1 = r3.f17201b
            s.h r1 = (p319s.C5941h) r1
            int r2 = r1.f22812a0
            if (r0 >= r2) goto L28
            java.lang.Object r1 = r1.m12343h(r0)
            i0.b r1 = (p138i0.InterfaceMenuItemC3056b) r1
            int r1 = r1.getGroupId()
            if (r1 != r4) goto L25
            s.h<i0.b, android.view.MenuItem> r1 = r3.f17201b
            s.h r1 = (p319s.C5941h) r1
            r1.mo5830j(r0)
            int r0 = r0 + (-1)
        L25:
            int r0 = r0 + 1
            goto L8
        L28:
            i0.a r0 = r3.f17214d
            r0.removeGroup(r4)
            return
    }

    @Override // android.view.Menu
    public void removeItem(int r4) {
            r3 = this;
            s.h<i0.b, android.view.MenuItem> r0 = r3.f17201b
            s.h r0 = (p319s.C5941h) r0
            if (r0 != 0) goto L7
            goto L27
        L7:
            r0 = 0
        L8:
            s.h<i0.b, android.view.MenuItem> r1 = r3.f17201b
            s.h r1 = (p319s.C5941h) r1
            int r2 = r1.f22812a0
            if (r0 >= r2) goto L27
            java.lang.Object r1 = r1.m12343h(r0)
            i0.b r1 = (p138i0.InterfaceMenuItemC3056b) r1
            int r1 = r1.getItemId()
            if (r1 != r4) goto L24
            s.h<i0.b, android.view.MenuItem> r1 = r3.f17201b
            s.h r1 = (p319s.C5941h) r1
            r1.mo5830j(r0)
            goto L27
        L24:
            int r0 = r0 + 1
            goto L8
        L27:
            i0.a r0 = r3.f17214d
            r0.removeItem(r4)
            return
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int r2, boolean r3, boolean r4) {
            r1 = this;
            i0.a r0 = r1.f17214d
            r0.setGroupCheckable(r2, r3, r4)
            return
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int r2, boolean r3) {
            r1 = this;
            i0.a r0 = r1.f17214d
            r0.setGroupEnabled(r2, r3)
            return
    }

    @Override // android.view.Menu
    public void setGroupVisible(int r2, boolean r3) {
            r1 = this;
            i0.a r0 = r1.f17214d
            r0.setGroupVisible(r2, r3)
            return
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r2) {
            r1 = this;
            i0.a r0 = r1.f17214d
            r0.setQwertyMode(r2)
            return
    }

    @Override // android.view.Menu
    public int size() {
            r1 = this;
            i0.a r0 = r1.f17214d
            int r0 = r0.size()
            return r0
    }
}
