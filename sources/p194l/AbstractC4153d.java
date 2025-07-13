package p194l;

/* renamed from: l.d */
/* loaded from: classes.dex */
public abstract class AbstractC4153d implements p194l.InterfaceC4155f, androidx.appcompat.view.menu.InterfaceC0215i, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: Y */
    public android.graphics.Rect f17213Y;

    public AbstractC4153d() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: e */
    public static int m9211e(android.widget.ListAdapter r9, android.view.ViewGroup r10, android.content.Context r11, int r12) {
            r10 = 0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r10)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r10)
            androidx.appcompat.view.menu.d r9 = (androidx.appcompat.view.menu.C0210d) r9
            int r2 = r9.getCount()
            r3 = 0
            r6 = r3
            r7 = r6
            r4 = 0
            r5 = 0
        L14:
            if (r10 >= r2) goto L39
            int r8 = r9.getItemViewType(r10)
            if (r8 == r5) goto L1e
            r7 = r3
            r5 = r8
        L1e:
            if (r6 != 0) goto L25
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            r6.<init>(r11)
        L25:
            android.view.View r7 = r9.getView(r10, r7, r6)
            r7.measure(r0, r1)
            int r8 = r7.getMeasuredWidth()
            if (r8 < r12) goto L33
            return r12
        L33:
            if (r8 <= r4) goto L36
            r4 = r8
        L36:
            int r10 = r10 + 1
            goto L14
        L39:
            return r4
    }

    /* renamed from: n */
    public static boolean m9212n(androidx.appcompat.view.menu.C0211e r5) {
            int r0 = r5.size()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L1d
            android.view.MenuItem r3 = r5.getItem(r2)
            boolean r4 = r3.isVisible()
            if (r4 == 0) goto L1a
            android.graphics.drawable.Drawable r3 = r3.getIcon()
            if (r3 == 0) goto L1a
            r1 = 1
            goto L1d
        L1a:
            int r2 = r2 + 1
            goto L6
        L1d:
            return r1
    }

    /* renamed from: c */
    public abstract void mo474c(androidx.appcompat.view.menu.C0211e r1);

    /* renamed from: f */
    public abstract void mo476f(android.view.View r1);

    /* renamed from: h */
    public abstract void mo478h(boolean r1);

    /* renamed from: i */
    public abstract void mo479i(int r1);

    /* renamed from: j */
    public abstract void mo480j(int r1);

    /* renamed from: k */
    public abstract void mo481k(android.widget.PopupWindow.OnDismissListener r1);

    /* renamed from: l */
    public abstract void mo482l(boolean r1);

    /* renamed from: m */
    public abstract void mo483m(int r1);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            android.widget.Adapter r1 = r1.getAdapter()
            android.widget.ListAdapter r1 = (android.widget.ListAdapter) r1
            boolean r2 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r2 == 0) goto L14
            r2 = r1
            android.widget.HeaderViewListAdapter r2 = (android.widget.HeaderViewListAdapter) r2
            android.widget.ListAdapter r2 = r2.getWrappedAdapter()
            androidx.appcompat.view.menu.d r2 = (androidx.appcompat.view.menu.C0210d) r2
            goto L17
        L14:
            r2 = r1
            androidx.appcompat.view.menu.d r2 = (androidx.appcompat.view.menu.C0210d) r2
        L17:
            androidx.appcompat.view.menu.e r2 = r2.f801Y
            java.lang.Object r1 = r1.getItem(r3)
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            boolean r3 = r0 instanceof androidx.appcompat.view.menu.ViewOnKeyListenerC0208b
            r3 = r3 ^ 1
            if (r3 == 0) goto L27
            r3 = 0
            goto L28
        L27:
            r3 = 4
        L28:
            r2.m515r(r1, r0, r3)
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: r */
    public int mo469r() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: s */
    public void mo493s(android.content.Context r1, androidx.appcompat.view.menu.C0211e r2) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: y */
    public boolean mo470y(androidx.appcompat.view.menu.C0211e r1, androidx.appcompat.view.menu.C0213g r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: z */
    public boolean mo471z(androidx.appcompat.view.menu.C0211e r1, androidx.appcompat.view.menu.C0213g r2) {
            r0 = this;
            r1 = 0
            return r1
    }
}
