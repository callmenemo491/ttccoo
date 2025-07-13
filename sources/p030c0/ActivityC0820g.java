package p030c0;

/* renamed from: c0.g */
/* loaded from: classes.dex */
public class ActivityC0820g extends android.app.Activity implements androidx.lifecycle.InterfaceC0471v, p227n0.C4647f.a {

    /* renamed from: Y */
    public androidx.lifecycle.C0472w f4445Y;

    public ActivityC0820g() {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.w r0 = new androidx.lifecycle.w
            r0.<init>(r1)
            r1.f4445Y = r0
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L12
            boolean r1 = p227n0.C4647f.m10501a(r0, r3)
            if (r1 == 0) goto L12
            r3 = 1
            return r3
        L12:
            boolean r3 = p227n0.C4647f.m10502b(r2, r0, r2, r3)
            return r3
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L12
            boolean r0 = p227n0.C4647f.m10501a(r0, r2)
            if (r0 == 0) goto L12
            r2 = 1
            return r2
        L12:
            boolean r2 = super.dispatchKeyShortcutEvent(r2)
            return r2
    }

    @Override // p227n0.C4647f.a
    /* renamed from: i */
    public boolean mo2470i(android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchKeyEvent(r1)
            return r1
    }

    @Override // android.app.Activity
    @android.annotation.SuppressLint({"RestrictedApi"})
    public void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            androidx.lifecycle.FragmentC0451k0.m1441c(r0)
            return
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle r4) {
            r3 = this;
            androidx.lifecycle.w r0 = r3.f4445Y
            androidx.lifecycle.o$c r1 = androidx.lifecycle.AbstractC0458o.c.f2548a0
            java.lang.String r2 = "markState"
            r0.m1461d(r2)
            java.lang.String r2 = "setCurrentState"
            r0.m1461d(r2)
            r0.m1463g(r1)
            super.onSaveInstanceState(r4)
            return
    }
}
