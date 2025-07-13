package p083f;

/* renamed from: f.h */
/* loaded from: classes.dex */
public class ActivityC1921h extends androidx.fragment.app.ActivityC0405s implements p083f.InterfaceC1922i {

    /* renamed from: k0 */
    public p083f.AbstractC1923j f8321k0;

    public ActivityC1921h() {
            r3 = this;
            r3.<init>()
            androidx.savedstate.b r0 = r3.f587b0
            androidx.savedstate.a r0 = r0.f3684b
            f.f r1 = new f.f
            r1.<init>(r3)
            java.lang.String r2 = "androidx:appcompat"
            r0.m2154b(r2, r1)
            f.g r0 = new f.g
            r0.<init>(r3)
            c.a r1 = r3.f585Z
            android.content.Context r2 = r1.f4420b
            if (r2 == 0) goto L21
            android.content.Context r2 = r1.f4420b
            r0.mo1351a(r2)
        L21:
            java.util.Set<c.b> r1 = r1.f4419a
            r1.add(r0)
            return
    }

    /* renamed from: s */
    private void m4703s() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 2131362755(0x7f0a03c3, float:1.83453E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 2131362757(0x7f0a03c5, float:1.8345304E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 2131362756(0x7f0a03c4, float:1.8345302E38)
            r0.setTag(r1, r2)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r1.m4703s()
            f.j r0 = r1.m4707w()
            r0.mo4711c(r2, r3)
            return
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context r2) {
            r1 = this;
            f.j r0 = r1.m4707w()
            android.content.Context r2 = r0.mo4712d(r2)
            super.attachBaseContext(r2)
            return
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
            r3 = this;
            f.a r0 = r3.m4708x()
            android.view.Window r1 = r3.getWindow()
            r2 = 0
            boolean r1 = r1.hasFeature(r2)
            if (r1 == 0) goto L12
            super.closeOptionsMenu()
        L12:
            return
    }

    @Override // p030c0.ActivityC0820g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            int r0 = r4.getKeyCode()
            f.a r1 = r3.m4708x()
            r2 = 82
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
    }

    @Override // android.app.Activity
    public <T extends android.view.View> T findViewById(int r2) {
            r1 = this;
            f.j r0 = r1.m4707w()
            android.view.View r2 = r0.mo4713e(r2)
            return r2
    }

    @Override // android.app.Activity
    public android.view.MenuInflater getMenuInflater() {
            r1 = this;
            f.j r0 = r1.m4707w()
            android.view.MenuInflater r0 = r0.mo4715g()
            return r0
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r1 = this;
            int r0 = androidx.appcompat.widget.C0272e1.f1276a
            android.content.res.Resources r0 = super.getResources()
            return r0
    }

    @Override // p083f.InterfaceC1922i
    /* renamed from: h */
    public void mo4704h(p177k.AbstractC3617a r1) {
            r0 = this;
            return
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
            r1 = this;
            f.j r0 = r1.m4707w()
            r0.mo4718j()
            return
    }

    @Override // p083f.InterfaceC1922i
    /* renamed from: l */
    public p177k.AbstractC3617a mo4705l(p177k.AbstractC3617a.a r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // p083f.InterfaceC1922i
    /* renamed from: n */
    public void mo4706n(p177k.AbstractC3617a r1) {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.ActivityC0405s, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            f.j r0 = r1.m4707w()
            r0.mo4719k(r2)
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.ActivityC0405s, android.app.Activity
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            f.j r0 = r1.m4707w()
            r0.mo4721m()
            return
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 1
            if (r0 >= r1) goto L3f
            boolean r0 = r5.isCtrlPressed()
            if (r0 != 0) goto L3f
            int r0 = r5.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L3f
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L3f
            int r0 = r5.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L3f
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L3f
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L3f
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r0.dispatchKeyShortcutEvent(r5)
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            if (r0 == 0) goto L43
            return r2
        L43:
            boolean r4 = super.onKeyDown(r4, r5)
            return r4
    }

    @Override // androidx.fragment.app.ActivityC0405s, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int r5, android.view.MenuItem r6) {
            r4 = this;
            boolean r5 = super.onMenuItemSelected(r5, r6)
            r0 = 1
            if (r5 == 0) goto L8
            return r0
        L8:
            f.a r5 = r4.m4708x()
            int r6 = r6.getItemId()
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            r2 = 0
            if (r6 != r1) goto Lb3
            if (r5 == 0) goto Lb3
            f.x r5 = (p083f.C1937x) r5
            androidx.appcompat.widget.d0 r5 = r5.f8450e
            int r5 = r5.mo683p()
            r5 = r5 & 4
            if (r5 == 0) goto Lb3
            android.content.Intent r5 = p030c0.C0821h.m2471a(r4)
            if (r5 == 0) goto Lb1
            boolean r6 = r4.shouldUpRecreateTask(r5)
            if (r6 == 0) goto Lad
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            android.content.Intent r6 = r4.m4709y()
            if (r6 != 0) goto L3f
            android.content.Intent r6 = p030c0.C0821h.m2471a(r4)
        L3f:
            if (r6 == 0) goto L73
            android.content.ComponentName r1 = r6.getComponent()
            if (r1 != 0) goto L4f
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            android.content.ComponentName r1 = r6.resolveActivity(r1)
        L4f:
            int r3 = r5.size()
        L53:
            android.content.Intent r1 = p030c0.C0821h.m2472b(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            if (r1 == 0) goto L61
            r5.add(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            android.content.ComponentName r1 = r1.getComponent()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            goto L53
        L61:
            r5.add(r6)
            goto L73
        L65:
            r5 = move-exception
            java.lang.String r6 = "TaskStackBuilder"
            java.lang.String r0 = "Bad ComponentName while traversing activity parent metadata"
            android.util.Log.e(r6, r0)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r5)
            throw r6
        L73:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto La5
            int r6 = r5.size()
            android.content.Intent[] r6 = new android.content.Intent[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            android.content.Intent[] r5 = (android.content.Intent[]) r5
            android.content.Intent r6 = new android.content.Intent
            r1 = r5[r2]
            r6.<init>(r1)
            r1 = 268484608(0x1000c000, float:2.539146E-29)
            android.content.Intent r6 = r6.addFlags(r1)
            r5[r2] = r6
            java.lang.Object r6 = p046d0.C1259a.f6733a
            r6 = 0
            p046d0.C1259a.a.m3707a(r4, r5, r6)
            int r5 = p030c0.C0814a.f4421c     // Catch: java.lang.IllegalStateException -> La1
            r4.finishAffinity()     // Catch: java.lang.IllegalStateException -> La1
            goto Lb2
        La1:
            r4.finish()
            goto Lb2
        La5:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "No intents added to TaskStackBuilder; cannot startActivities"
            r5.<init>(r6)
            throw r5
        Lad:
            r4.navigateUpTo(r5)
            goto Lb2
        Lb1:
            r0 = 0
        Lb2:
            return r0
        Lb3:
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int r1, android.view.Menu r2) {
            r0 = this;
            boolean r1 = super.onMenuOpened(r1, r2)
            return r1
    }

    @Override // androidx.fragment.app.ActivityC0405s, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r1, android.view.Menu r2) {
            r0 = this;
            super.onPanelClosed(r1, r2)
            return
    }

    @Override // android.app.Activity
    public void onPostCreate(android.os.Bundle r2) {
            r1 = this;
            super.onPostCreate(r2)
            f.j r0 = r1.m4707w()
            r0.mo4722n(r2)
            return
    }

    @Override // androidx.fragment.app.ActivityC0405s, android.app.Activity
    public void onPostResume() {
            r1 = this;
            super.onPostResume()
            f.j r0 = r1.m4707w()
            r0.mo4723o()
            return
    }

    @Override // androidx.fragment.app.ActivityC0405s, android.app.Activity
    public void onStart() {
            r1 = this;
            super.onStart()
            f.j r0 = r1.m4707w()
            r0.mo4725q()
            return
    }

    @Override // androidx.fragment.app.ActivityC0405s, android.app.Activity
    public void onStop() {
            r1 = this;
            super.onStop()
            f.j r0 = r1.m4707w()
            r0.mo4726r()
            return
    }

    @Override // android.app.Activity
    public void onTitleChanged(java.lang.CharSequence r1, int r2) {
            r0 = this;
            super.onTitleChanged(r1, r2)
            f.j r2 = r0.m4707w()
            r2.mo4732y(r1)
            return
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
            r3 = this;
            f.a r0 = r3.m4708x()
            android.view.Window r1 = r3.getWindow()
            r2 = 0
            boolean r1 = r1.hasFeature(r2)
            if (r1 == 0) goto L12
            super.openOptionsMenu()
        L12:
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int r2) {
            r1 = this;
            r1.m4703s()
            f.j r0 = r1.m4707w()
            r0.mo4728u(r2)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View r2) {
            r1 = this;
            r1.m4703s()
            f.j r0 = r1.m4707w()
            r0.mo4729v(r2)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r1.m4703s()
            f.j r0 = r1.m4707w()
            r0.mo4730w(r2, r3)
            return
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int r2) {
            r1 = this;
            super.setTheme(r2)
            f.j r0 = r1.m4707w()
            r0.mo4731x(r2)
            return
    }

    @Override // androidx.fragment.app.ActivityC0405s
    /* renamed from: v */
    public void mo1355v() {
            r1 = this;
            f.j r0 = r1.m4707w()
            r0.mo4718j()
            return
    }

    /* renamed from: w */
    public p083f.AbstractC1923j m4707w() {
            r2 = this;
            f.j r0 = r2.f8321k0
            if (r0 != 0) goto Le
            s.c<java.lang.ref.WeakReference<f.j>> r0 = p083f.AbstractC1923j.f8322Y
            f.k r0 = new f.k
            r1 = 0
            r0.<init>(r2, r1, r2, r2)
            r2.f8321k0 = r0
        Le:
            f.j r0 = r2.f8321k0
            return r0
    }

    /* renamed from: x */
    public p083f.AbstractC1914a m4708x() {
            r1 = this;
            f.j r0 = r1.m4707w()
            f.a r0 = r0.mo4716h()
            return r0
    }

    /* renamed from: y */
    public android.content.Intent m4709y() {
            r1 = this;
            android.content.Intent r0 = p030c0.C0821h.m2471a(r1)
            return r0
    }
}
