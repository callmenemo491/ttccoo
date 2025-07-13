package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
public class DialogInterfaceOnKeyListenerC0212f implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, androidx.appcompat.view.menu.InterfaceC0215i.a {

    /* renamed from: Y */
    public androidx.appcompat.view.menu.C0211e f832Y;

    /* renamed from: Z */
    public androidx.appcompat.app.DialogC0204b f833Z;

    /* renamed from: a0 */
    public androidx.appcompat.view.menu.C0209c f834a0;

    public DialogInterfaceOnKeyListenerC0212f(androidx.appcompat.view.menu.C0211e r1) {
            r0 = this;
            r0.<init>()
            r0.f832Y = r1
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i.a
    /* renamed from: a */
    public void mo525a(androidx.appcompat.view.menu.C0211e r1, boolean r2) {
            r0 = this;
            if (r2 != 0) goto L6
            androidx.appcompat.view.menu.e r2 = r0.f832Y
            if (r1 != r2) goto Ld
        L6:
            androidx.appcompat.app.b r1 = r0.f833Z
            if (r1 == 0) goto Ld
            r1.dismiss()
        Ld:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i.a
    /* renamed from: b */
    public boolean mo526b(androidx.appcompat.view.menu.C0211e r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r2, int r3) {
            r1 = this;
            androidx.appcompat.view.menu.e r2 = r1.f832Y
            androidx.appcompat.view.menu.c r0 = r1.f834a0
            android.widget.ListAdapter r0 = r0.m492b()
            androidx.appcompat.view.menu.c$a r0 = (androidx.appcompat.view.menu.C0209c.a) r0
            androidx.appcompat.view.menu.g r3 = r0.m495b(r3)
            r0 = 0
            r2.m514q(r3, r0)
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r3) {
            r2 = this;
            androidx.appcompat.view.menu.c r3 = r2.f834a0
            androidx.appcompat.view.menu.e r0 = r2.f832Y
            androidx.appcompat.view.menu.i$a r3 = r3.f797c0
            if (r3 == 0) goto Lc
            r1 = 1
            r3.mo525a(r0, r1)
        Lc:
            return
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface r3, int r4, android.view.KeyEvent r5) {
            r2 = this;
            r0 = 82
            if (r4 == r0) goto L7
            r0 = 4
            if (r4 != r0) goto L5b
        L7:
            int r0 = r5.getAction()
            r1 = 1
            if (r0 != 0) goto L2c
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L2c
            androidx.appcompat.app.b r3 = r2.f833Z
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L5b
            android.view.View r3 = r3.getDecorView()
            if (r3 == 0) goto L5b
            android.view.KeyEvent$DispatcherState r3 = r3.getKeyDispatcherState()
            if (r3 == 0) goto L5b
            r3.startTracking(r5, r2)
            return r1
        L2c:
            int r0 = r5.getAction()
            if (r0 != r1) goto L5b
            boolean r0 = r5.isCanceled()
            if (r0 != 0) goto L5b
            androidx.appcompat.app.b r0 = r2.f833Z
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L5b
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L5b
            android.view.KeyEvent$DispatcherState r0 = r0.getKeyDispatcherState()
            if (r0 == 0) goto L5b
            boolean r0 = r0.isTracking(r5)
            if (r0 == 0) goto L5b
            androidx.appcompat.view.menu.e r4 = r2.f832Y
            r4.m500c(r1)
            r3.dismiss()
            return r1
        L5b:
            androidx.appcompat.view.menu.e r3 = r2.f832Y
            r0 = 0
            boolean r3 = r3.performShortcut(r4, r5, r0)
            return r3
    }
}
