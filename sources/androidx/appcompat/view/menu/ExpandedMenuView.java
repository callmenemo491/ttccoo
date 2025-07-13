package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends android.widget.ListView implements androidx.appcompat.view.menu.C0211e.b, androidx.appcompat.view.menu.InterfaceC0216j, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: b0 */
    public static final int[] f729b0 = null;

    /* renamed from: a0 */
    public androidx.appcompat.view.menu.C0211e f730a0;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [16842964, 16843049} // fill-array
            androidx.appcompat.view.menu.ExpandedMenuView.f729b0 = r0
            return
    }

    public ExpandedMenuView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            r3.setOnItemClickListener(r3)
            int[] r0 = androidx.appcompat.view.menu.ExpandedMenuView.f729b0
            r1 = 0
            r2 = 16842868(0x1010074, float:2.3693883E-38)
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r0, r2, r1)
            boolean r0 = r5.hasValue(r1)
            if (r0 == 0) goto L2e
            boolean r0 = r5.hasValue(r1)
            if (r0 == 0) goto L27
            int r0 = r5.getResourceId(r1, r1)
            if (r0 == 0) goto L27
            android.graphics.drawable.Drawable r0 = p102g.C2199a.m5784b(r4, r0)
            goto L2b
        L27:
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r1)
        L2b:
            r3.setBackgroundDrawable(r0)
        L2e:
            r0 = 1
            boolean r2 = r5.hasValue(r0)
            if (r2 == 0) goto L4d
            boolean r2 = r5.hasValue(r0)
            if (r2 == 0) goto L46
            int r1 = r5.getResourceId(r0, r1)
            if (r1 == 0) goto L46
            android.graphics.drawable.Drawable r4 = p102g.C2199a.m5784b(r4, r1)
            goto L4a
        L46:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r0)
        L4a:
            r3.setDivider(r4)
        L4d:
            r5.recycle()
            return
    }

    @Override // androidx.appcompat.view.menu.C0211e.b
    /* renamed from: a */
    public boolean mo464a(androidx.appcompat.view.menu.C0213g r4) {
            r3 = this;
            androidx.appcompat.view.menu.e r0 = r3.f730a0
            r1 = 0
            r2 = 0
            boolean r4 = r0.m515r(r4, r1, r2)
            return r4
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0216j
    /* renamed from: b */
    public void mo465b(androidx.appcompat.view.menu.C0211e r1) {
            r0 = this;
            r0.f730a0 = r1
            return
    }

    public int getWindowAnimations() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r1.setChildrenDrawingCacheEnabled(r0)
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            android.widget.ListAdapter r1 = r0.getAdapter()
            java.lang.Object r1 = r1.getItem(r3)
            androidx.appcompat.view.menu.g r1 = (androidx.appcompat.view.menu.C0213g) r1
            r0.mo464a(r1)
            return
    }
}
