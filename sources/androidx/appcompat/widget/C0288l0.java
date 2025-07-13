package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.l0 */
/* loaded from: classes.dex */
public class C0288l0 extends androidx.appcompat.widget.C0284j0 implements androidx.appcompat.widget.InterfaceC0286k0 {

    /* renamed from: B0 */
    public static java.lang.reflect.Method f1370B0;

    /* renamed from: A0 */
    public androidx.appcompat.widget.InterfaceC0286k0 f1371A0;

    /* renamed from: androidx.appcompat.widget.l0$a */
    public static class a extends androidx.appcompat.widget.C0274f0 {

        /* renamed from: n0 */
        public final int f1372n0;

        /* renamed from: o0 */
        public final int f1373o0;

        /* renamed from: p0 */
        public androidx.appcompat.widget.InterfaceC0286k0 f1374p0;

        /* renamed from: q0 */
        public android.view.MenuItem f1375q0;

        public a(android.content.Context r3, boolean r4) {
                r2 = this;
                r2.<init>(r3, r4)
                android.content.res.Resources r3 = r3.getResources()
                android.content.res.Configuration r3 = r3.getConfiguration()
                r4 = 1
                int r3 = r3.getLayoutDirection()
                r0 = 21
                r1 = 22
                if (r4 != r3) goto L1b
                r2.f1372n0 = r0
                r2.f1373o0 = r1
                goto L1f
            L1b:
                r2.f1372n0 = r1
                r2.f1373o0 = r0
            L1f:
                return
        }

        @Override // androidx.appcompat.widget.C0274f0, android.view.View
        public boolean onHoverEvent(android.view.MotionEvent r6) {
                r5 = this;
                androidx.appcompat.widget.k0 r0 = r5.f1374p0
                if (r0 == 0) goto L57
                android.widget.ListAdapter r0 = r5.getAdapter()
                boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
                if (r1 == 0) goto L17
                android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
                int r1 = r0.getHeadersCount()
                android.widget.ListAdapter r0 = r0.getWrappedAdapter()
                goto L18
            L17:
                r1 = 0
            L18:
                androidx.appcompat.view.menu.d r0 = (androidx.appcompat.view.menu.C0210d) r0
                r2 = 0
                int r3 = r6.getAction()
                r4 = 10
                if (r3 == r4) goto L41
                float r3 = r6.getX()
                int r3 = (int) r3
                float r4 = r6.getY()
                int r4 = (int) r4
                int r3 = r5.pointToPosition(r3, r4)
                r4 = -1
                if (r3 == r4) goto L41
                int r3 = r3 - r1
                if (r3 < 0) goto L41
                int r1 = r0.getCount()
                if (r3 >= r1) goto L41
                androidx.appcompat.view.menu.g r2 = r0.m497b(r3)
            L41:
                android.view.MenuItem r1 = r5.f1375q0
                if (r1 == r2) goto L57
                androidx.appcompat.view.menu.e r0 = r0.f801Y
                if (r1 == 0) goto L4e
                androidx.appcompat.widget.k0 r3 = r5.f1374p0
                r3.mo491e(r0, r1)
            L4e:
                r5.f1375q0 = r2
                if (r2 == 0) goto L57
                androidx.appcompat.widget.k0 r1 = r5.f1374p0
                r1.mo490a(r0, r2)
            L57:
                boolean r6 = super.onHoverEvent(r6)
                return r6
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
                r4 = this;
                android.view.View r0 = r4.getSelectedView()
                androidx.appcompat.view.menu.ListMenuItemView r0 = (androidx.appcompat.view.menu.ListMenuItemView) r0
                r1 = 1
                if (r0 == 0) goto L29
                int r2 = r4.f1372n0
                if (r5 != r2) goto L29
                boolean r5 = r0.isEnabled()
                if (r5 == 0) goto L28
                androidx.appcompat.view.menu.g r5 = r0.getItemData()
                boolean r5 = r5.hasSubMenu()
                if (r5 == 0) goto L28
                int r5 = r4.getSelectedItemPosition()
                long r2 = r4.getSelectedItemId()
                r4.performItemClick(r0, r5, r2)
            L28:
                return r1
            L29:
                if (r0 == 0) goto L4a
                int r0 = r4.f1373o0
                if (r5 != r0) goto L4a
                r5 = -1
                r4.setSelection(r5)
                android.widget.ListAdapter r5 = r4.getAdapter()
                boolean r6 = r5 instanceof android.widget.HeaderViewListAdapter
                if (r6 == 0) goto L41
                android.widget.HeaderViewListAdapter r5 = (android.widget.HeaderViewListAdapter) r5
                android.widget.ListAdapter r5 = r5.getWrappedAdapter()
            L41:
                androidx.appcompat.view.menu.d r5 = (androidx.appcompat.view.menu.C0210d) r5
                androidx.appcompat.view.menu.e r5 = r5.f801Y
                r6 = 0
                r5.m500c(r6)
                return r1
            L4a:
                boolean r5 = super.onKeyDown(r5, r6)
                return r5
        }

        public void setHoverListener(androidx.appcompat.widget.InterfaceC0286k0 r1) {
                r0 = this;
                r0.f1374p0 = r1
                return
        }

        @Override // androidx.appcompat.widget.C0274f0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable r1) {
                r0 = this;
                super.setSelector(r1)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoSuchMethodException -> L19
            r1 = 28
            if (r0 > r1) goto L20
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r1 = "setTouchModal"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L19
            r3 = 0
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L19
            r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L19
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L19
            androidx.appcompat.widget.C0288l0.f1370B0 = r0     // Catch: java.lang.NoSuchMethodException -> L19
            goto L20
        L19:
            java.lang.String r0 = "MenuPopupWindow"
            java.lang.String r1 = "Could not find method setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r0, r1)
        L20:
            return
    }

    public C0288l0(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r2 = 0
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0286k0
    /* renamed from: a */
    public void mo490a(androidx.appcompat.view.menu.C0211e r2, android.view.MenuItem r3) {
            r1 = this;
            androidx.appcompat.widget.k0 r0 = r1.f1371A0
            if (r0 == 0) goto L7
            r0.mo490a(r2, r3)
        L7:
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0286k0
    /* renamed from: e */
    public void mo491e(androidx.appcompat.view.menu.C0211e r2, android.view.MenuItem r3) {
            r1 = this;
            androidx.appcompat.widget.k0 r0 = r1.f1371A0
            if (r0 == 0) goto L7
            r0.mo491e(r2, r3)
        L7:
            return
    }

    @Override // androidx.appcompat.widget.C0284j0
    /* renamed from: q */
    public androidx.appcompat.widget.C0274f0 mo739q(android.content.Context r2, boolean r3) {
            r1 = this;
            androidx.appcompat.widget.l0$a r0 = new androidx.appcompat.widget.l0$a
            r0.<init>(r2, r3)
            r0.setHoverListener(r1)
            return r0
    }
}
