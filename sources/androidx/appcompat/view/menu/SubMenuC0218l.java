package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public class SubMenuC0218l extends androidx.appcompat.view.menu.C0211e implements android.view.SubMenu {

    /* renamed from: A */
    public androidx.appcompat.view.menu.C0213g f901A;

    /* renamed from: z */
    public androidx.appcompat.view.menu.C0211e f902z;

    public SubMenuC0218l(android.content.Context r1, androidx.appcompat.view.menu.C0211e r2, androidx.appcompat.view.menu.C0213g r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f902z = r2
            r0.f901A = r3
            return
    }

    @Override // androidx.appcompat.view.menu.C0211e
    /* renamed from: d */
    public boolean mo501d(androidx.appcompat.view.menu.C0213g r2) {
            r1 = this;
            androidx.appcompat.view.menu.e r0 = r1.f902z
            boolean r2 = r0.mo501d(r2)
            return r2
    }

    @Override // androidx.appcompat.view.menu.C0211e
    /* renamed from: e */
    public boolean mo502e(androidx.appcompat.view.menu.C0211e r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.mo502e(r2, r3)
            if (r0 != 0) goto L11
            androidx.appcompat.view.menu.e r0 = r1.f902z
            boolean r2 = r0.mo502e(r2, r3)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    @Override // androidx.appcompat.view.menu.C0211e
    /* renamed from: f */
    public boolean mo503f(androidx.appcompat.view.menu.C0213g r2) {
            r1 = this;
            androidx.appcompat.view.menu.e r0 = r1.f902z
            boolean r2 = r0.mo503f(r2)
            return r2
    }

    @Override // android.view.SubMenu
    public android.view.MenuItem getItem() {
            r1 = this;
            androidx.appcompat.view.menu.g r0 = r1.f901A
            return r0
    }

    @Override // androidx.appcompat.view.menu.C0211e
    /* renamed from: j */
    public java.lang.String mo507j() {
            r3 = this;
            androidx.appcompat.view.menu.g r0 = r3.f901A
            if (r0 == 0) goto L7
            int r0 = r0.f839a
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "android:menu:actionviewstates"
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // androidx.appcompat.view.menu.C0211e
    /* renamed from: k */
    public androidx.appcompat.view.menu.C0211e mo508k() {
            r1 = this;
            androidx.appcompat.view.menu.e r0 = r1.f902z
            androidx.appcompat.view.menu.e r0 = r0.mo508k()
            return r0
    }

    @Override // androidx.appcompat.view.menu.C0211e
    /* renamed from: m */
    public boolean mo510m() {
            r1 = this;
            androidx.appcompat.view.menu.e r0 = r1.f902z
            boolean r0 = r0.mo510m()
            return r0
    }

    @Override // androidx.appcompat.view.menu.C0211e
    /* renamed from: n */
    public boolean mo511n() {
            r1 = this;
            androidx.appcompat.view.menu.e r0 = r1.f902z
            boolean r0 = r0.mo511n()
            return r0
    }

    @Override // androidx.appcompat.view.menu.C0211e
    /* renamed from: o */
    public boolean mo512o() {
            r1 = this;
            androidx.appcompat.view.menu.e r0 = r1.f902z
            boolean r0 = r0.mo512o()
            return r0
    }

    @Override // androidx.appcompat.view.menu.C0211e, android.view.Menu
    public void setGroupDividerEnabled(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.e r0 = r1.f902z
            r0.setGroupDividerEnabled(r2)
            return
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(int r7) {
            r6 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r3 = r7
            r0.m520w(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable r7) {
            r6 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r0 = r6
            r4 = r7
            r0.m520w(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(int r7) {
            r6 = this;
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.m520w(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(java.lang.CharSequence r7) {
            r6 = this;
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            r0.m520w(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderView(android.view.View r7) {
            r6 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r6
            r5 = r7
            r0.m520w(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(int r2) {
            r1 = this;
            androidx.appcompat.view.menu.g r0 = r1.f901A
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.view.menu.g r0 = r1.f901A
            r0.setIcon(r2)
            return r1
    }

    @Override // androidx.appcompat.view.menu.C0211e, android.view.Menu
    public void setQwertyMode(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.e r0 = r1.f902z
            r0.setQwertyMode(r2)
            return
    }
}
