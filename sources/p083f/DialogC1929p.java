package p083f;

/* renamed from: f.p */
/* loaded from: classes.dex */
public class DialogC1929p extends android.app.Dialog implements p083f.InterfaceC1922i {

    /* renamed from: Y */
    public p083f.AbstractC1923j f8412Y;

    /* renamed from: Z */
    public final p227n0.C4647f.a f8413Z;

    /* renamed from: f.p$a */
    public class a implements p227n0.C4647f.a {

        /* renamed from: Y */
        public final /* synthetic */ p083f.DialogC1929p f8414Y;

        public a(p083f.DialogC1929p r1) {
                r0 = this;
                r0.f8414Y = r1
                r0.<init>()
                return
        }

        @Override // p227n0.C4647f.a
        /* renamed from: i */
        public boolean mo2470i(android.view.KeyEvent r2) {
                r1 = this;
                f.p r0 = r1.f8414Y
                boolean r2 = r0.m4770b(r2)
                return r2
        }
    }

    public DialogC1929p(android.content.Context r5, int r6) {
            r4 = this;
            r0 = 1
            r1 = 2130968919(0x7f040157, float:1.7546505E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            f.p$a r2 = new f.p$a
            r2.<init>(r4)
            r4.f8413Z = r2
            f.j r2 = r4.m4769a()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r2.mo4731x(r6)
            r5 = 0
            r2.mo4720l(r5)
            return
    }

    /* renamed from: a */
    public p083f.AbstractC1923j m4769a() {
            r3 = this;
            f.j r0 = r3.f8412Y
            if (r0 != 0) goto L15
            s.c<java.lang.ref.WeakReference<f.j>> r0 = p083f.AbstractC1923j.f8322Y
            f.k r0 = new f.k
            android.content.Context r1 = r3.getContext()
            android.view.Window r2 = r3.getWindow()
            r0.<init>(r1, r2, r3, r3)
            r3.f8412Y = r0
        L15:
            f.j r0 = r3.f8412Y
            return r0
    }

    @Override // android.app.Dialog
    public void addContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            f.j r0 = r1.m4769a()
            r0.mo4711c(r2, r3)
            return
    }

    /* renamed from: b */
    public boolean m4770b(android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchKeyEvent(r1)
            return r1
    }

    /* renamed from: c */
    public boolean m4771c(int r2) {
            r1 = this;
            f.j r0 = r1.m4769a()
            boolean r2 = r0.mo4727t(r2)
            return r2
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
            r1 = this;
            super.dismiss()
            f.j r0 = r1.m4769a()
            r0.mo4721m()
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            n0.f$a r1 = r2.f8413Z
            boolean r3 = p227n0.C4647f.m10502b(r1, r0, r2, r3)
            return r3
    }

    @Override // android.app.Dialog
    public <T extends android.view.View> T findViewById(int r2) {
            r1 = this;
            f.j r0 = r1.m4769a()
            android.view.View r2 = r0.mo4713e(r2)
            return r2
    }

    @Override // p083f.InterfaceC1922i
    /* renamed from: h */
    public void mo4704h(p177k.AbstractC3617a r1) {
            r0 = this;
            return
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
            r1 = this;
            f.j r0 = r1.m4769a()
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

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            f.j r0 = r1.m4769a()
            r0.mo4717i()
            super.onCreate(r2)
            f.j r0 = r1.m4769a()
            r0.mo4720l(r2)
            return
    }

    @Override // android.app.Dialog
    public void onStop() {
            r1 = this;
            super.onStop()
            f.j r0 = r1.m4769a()
            r0.mo4726r()
            return
    }

    @Override // android.app.Dialog
    public void setContentView(int r2) {
            r1 = this;
            f.j r0 = r1.m4769a()
            r0.mo4728u(r2)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r2) {
            r1 = this;
            f.j r0 = r1.m4769a()
            r0.mo4729v(r2)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            f.j r0 = r1.m4769a()
            r0.mo4730w(r2, r3)
            return
    }

    @Override // android.app.Dialog
    public void setTitle(int r3) {
            r2 = this;
            super.setTitle(r3)
            f.j r0 = r2.m4769a()
            android.content.Context r1 = r2.getContext()
            java.lang.String r3 = r1.getString(r3)
            r0.mo4732y(r3)
            return
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            super.setTitle(r2)
            f.j r0 = r1.m4769a()
            r0.mo4732y(r2)
            return
    }
}
