package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
public class C0214h {

    /* renamed from: a */
    public final android.content.Context f866a;

    /* renamed from: b */
    public final androidx.appcompat.view.menu.C0211e f867b;

    /* renamed from: c */
    public final boolean f868c;

    /* renamed from: d */
    public final int f869d;

    /* renamed from: e */
    public final int f870e;

    /* renamed from: f */
    public android.view.View f871f;

    /* renamed from: g */
    public int f872g;

    /* renamed from: h */
    public boolean f873h;

    /* renamed from: i */
    public androidx.appcompat.view.menu.InterfaceC0215i.a f874i;

    /* renamed from: j */
    public p194l.AbstractC4153d f875j;

    /* renamed from: k */
    public android.widget.PopupWindow.OnDismissListener f876k;

    /* renamed from: l */
    public final android.widget.PopupWindow.OnDismissListener f877l;

    /* renamed from: androidx.appcompat.view.menu.h$a */
    public class a implements android.widget.PopupWindow.OnDismissListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.view.menu.C0214h f878Y;

        public a(androidx.appcompat.view.menu.C0214h r1) {
                r0 = this;
                r0.f878Y = r1
                r0.<init>()
                return
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
                r1 = this;
                androidx.appcompat.view.menu.h r0 = r1.f878Y
                r0.mo543c()
                return
        }
    }

    public C0214h(android.content.Context r2, androidx.appcompat.view.menu.C0211e r3, android.view.View r4, boolean r5, int r6, int r7) {
            r1 = this;
            r1.<init>()
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1.f872g = r0
            androidx.appcompat.view.menu.h$a r0 = new androidx.appcompat.view.menu.h$a
            r0.<init>(r1)
            r1.f877l = r0
            r1.f866a = r2
            r1.f867b = r3
            r1.f871f = r4
            r1.f868c = r5
            r1.f869d = r6
            r1.f870e = r7
            return
    }

    /* renamed from: a */
    public p194l.AbstractC4153d m541a() {
            r14 = this;
            l.d r0 = r14.f875j
            if (r0 != 0) goto L79
            android.content.Context r0 = r14.f866a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f866a
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165206(0x7f070016, float:1.7944623E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L33
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            if (r0 == 0) goto L47
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f866a
            android.view.View r3 = r14.f871f
            int r4 = r14.f869d
            int r5 = r14.f870e
            boolean r6 = r14.f868c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L59
        L47:
            androidx.appcompat.view.menu.k r0 = new androidx.appcompat.view.menu.k
            android.content.Context r8 = r14.f866a
            androidx.appcompat.view.menu.e r9 = r14.f867b
            android.view.View r10 = r14.f871f
            int r11 = r14.f869d
            int r12 = r14.f870e
            boolean r13 = r14.f868c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L59:
            androidx.appcompat.view.menu.e r1 = r14.f867b
            r0.mo474c(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f877l
            r0.mo481k(r1)
            android.view.View r1 = r14.f871f
            r0.mo476f(r1)
            androidx.appcompat.view.menu.i$a r1 = r14.f874i
            r0.mo468A(r1)
            boolean r1 = r14.f873h
            r0.mo478h(r1)
            int r1 = r14.f872g
            r0.mo479i(r1)
            r14.f875j = r0
        L79:
            l.d r0 = r14.f875j
            return r0
    }

    /* renamed from: b */
    public boolean m542b() {
            r1 = this;
            l.d r0 = r1.f875j
            if (r0 == 0) goto Lc
            boolean r0 = r0.mo473b()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    /* renamed from: c */
    public void mo543c() {
            r1 = this;
            r0 = 0
            r1.f875j = r0
            android.widget.PopupWindow$OnDismissListener r0 = r1.f876k
            if (r0 == 0) goto La
            r0.onDismiss()
        La:
            return
    }

    /* renamed from: d */
    public void m544d(androidx.appcompat.view.menu.InterfaceC0215i.a r2) {
            r1 = this;
            r1.f874i = r2
            l.d r0 = r1.f875j
            if (r0 == 0) goto L9
            r0.mo468A(r2)
        L9:
            return
    }

    /* renamed from: e */
    public final void m545e(int r4, int r5, boolean r6, boolean r7) {
            r3 = this;
            l.d r0 = r3.m541a()
            r0.mo482l(r7)
            if (r6 == 0) goto L4a
            int r6 = r3.f872g
            android.view.View r7 = r3.f871f
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            int r7 = p227n0.C4661t.d.m10575d(r7)
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r7)
            r6 = r6 & 7
            r7 = 5
            if (r6 != r7) goto L23
            android.view.View r6 = r3.f871f
            int r6 = r6.getWidth()
            int r4 = r4 - r6
        L23:
            r0.mo480j(r4)
            r0.mo483m(r5)
            android.content.Context r6 = r3.f866a
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            r7 = 1111490560(0x42400000, float:48.0)
            float r6 = r6 * r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            int r6 = (int) r6
            android.graphics.Rect r7 = new android.graphics.Rect
            int r1 = r4 - r6
            int r2 = r5 - r6
            int r4 = r4 + r6
            int r5 = r5 + r6
            r7.<init>(r1, r2, r4, r5)
            r0.f17213Y = r7
        L4a:
            r0.mo475d()
            return
    }

    /* renamed from: f */
    public boolean m546f() {
            r3 = this;
            boolean r0 = r3.m542b()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            android.view.View r0 = r3.f871f
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            r3.m545e(r2, r2, r2, r2)
            return r1
    }
}
