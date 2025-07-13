package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public class ActionMenuItemView extends androidx.appcompat.widget.AppCompatTextView implements androidx.appcompat.view.menu.InterfaceC0216j.a, android.view.View.OnClickListener, androidx.appcompat.widget.ActionMenuView.InterfaceC0225a {

    /* renamed from: f0 */
    public androidx.appcompat.view.menu.C0213g f717f0;

    /* renamed from: g0 */
    public java.lang.CharSequence f718g0;

    /* renamed from: h0 */
    public android.graphics.drawable.Drawable f719h0;

    /* renamed from: i0 */
    public androidx.appcompat.view.menu.C0211e.b f720i0;

    /* renamed from: j0 */
    public androidx.appcompat.widget.AbstractViewOnTouchListenerC0280h0 f721j0;

    /* renamed from: k0 */
    public androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0206b f722k0;

    /* renamed from: l0 */
    public boolean f723l0;

    /* renamed from: m0 */
    public boolean f724m0;

    /* renamed from: n0 */
    public int f725n0;

    /* renamed from: o0 */
    public int f726o0;

    /* renamed from: p0 */
    public int f727p0;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0205a extends androidx.appcompat.widget.AbstractViewOnTouchListenerC0280h0 {

        /* renamed from: h0 */
        public final /* synthetic */ androidx.appcompat.view.menu.ActionMenuItemView f728h0;

        public C0205a(androidx.appcompat.view.menu.ActionMenuItemView r1) {
                r0 = this;
                r0.f728h0 = r1
                r0.<init>(r1)
                return
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0280h0
        /* renamed from: b */
        public p194l.InterfaceC4155f mo462b() {
                r2 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = r2.f728h0
                androidx.appcompat.view.menu.ActionMenuItemView$b r0 = r0.f722k0
                r1 = 0
                if (r0 == 0) goto L13
                androidx.appcompat.widget.c$b r0 = (androidx.appcompat.widget.C0264c.b) r0
                androidx.appcompat.widget.c r0 = r0.f1241a
                androidx.appcompat.widget.c$a r0 = r0.f1235s0
                if (r0 == 0) goto L13
                l.d r1 = r0.m541a()
            L13:
                return r1
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0280h0
        /* renamed from: c */
        public boolean mo463c() {
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = r3.f728h0
                androidx.appcompat.view.menu.e$b r1 = r0.f720i0
                r2 = 0
                if (r1 == 0) goto L1c
                androidx.appcompat.view.menu.g r0 = r0.f717f0
                boolean r0 = r1.mo464a(r0)
                if (r0 == 0) goto L1c
                l.f r0 = r3.mo462b()
                if (r0 == 0) goto L1c
                boolean r0 = r0.mo473b()
                if (r0 == 0) goto L1c
                r2 = 1
            L1c:
                return r2
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC0206b {
        public AbstractC0206b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ActionMenuItemView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r5, r0)
            android.content.res.Resources r1 = r4.getResources()
            boolean r2 = r3.m460e()
            r3.f723l0 = r2
            int[] r2 = p064e.C1495i.f7260c
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r0)
            int r5 = r4.getDimensionPixelSize(r0, r0)
            r3.f725n0 = r5
            r4.recycle()
            android.util.DisplayMetrics r4 = r1.getDisplayMetrics()
            float r4 = r4.density
            r5 = 1107296256(0x42000000, float:32.0)
            float r4 = r4 * r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            r3.f727p0 = r4
            r3.setOnClickListener(r3)
            r4 = -1
            r3.f726o0 = r4
            r3.setSaveEnabled(r0)
            return
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0225a
    /* renamed from: a */
    public boolean mo456a() {
            r1 = this;
            boolean r0 = r1.m458c()
            return r0
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0225a
    /* renamed from: b */
    public boolean mo457b() {
            r1 = this;
            boolean r0 = r1.m458c()
            if (r0 == 0) goto L10
            androidx.appcompat.view.menu.g r0 = r1.f717f0
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    /* renamed from: c */
    public boolean m458c() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0216j.a
    /* renamed from: d */
    public void mo459d(androidx.appcompat.view.menu.C0213g r1, int r2) {
            r0 = this;
            r0.f717f0 = r1
            android.graphics.drawable.Drawable r2 = r1.getIcon()
            r0.setIcon(r2)
            java.lang.CharSequence r2 = r1.getTitleCondensed()
            r0.setTitle(r2)
            int r2 = r1.f839a
            r0.setId(r2)
            boolean r2 = r1.isVisible()
            if (r2 == 0) goto L1d
            r2 = 0
            goto L1f
        L1d:
            r2 = 8
        L1f:
            r0.setVisibility(r2)
            boolean r2 = r1.isEnabled()
            r0.setEnabled(r2)
            boolean r1 = r1.hasSubMenu()
            if (r1 == 0) goto L3a
            androidx.appcompat.widget.h0 r1 = r0.f721j0
            if (r1 != 0) goto L3a
            androidx.appcompat.view.menu.ActionMenuItemView$a r1 = new androidx.appcompat.view.menu.ActionMenuItemView$a
            r1.<init>(r0)
            r0.f721j0 = r1
        L3a:
            return
    }

    /* renamed from: e */
    public final boolean m460e() {
            r5 = this;
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.screenWidthDp
            int r2 = r0.screenHeightDp
            r3 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r3) goto L22
            r4 = 640(0x280, float:8.97E-43)
            if (r1 < r4) goto L1a
            if (r2 >= r3) goto L22
        L1a:
            int r0 = r0.orientation
            r1 = 2
            if (r0 != r1) goto L20
            goto L22
        L20:
            r0 = 0
            goto L23
        L22:
            r0 = 1
        L23:
            return r0
    }

    /* renamed from: f */
    public final void m461f() {
            r5 = this;
            java.lang.CharSequence r0 = r5.f718g0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            android.graphics.drawable.Drawable r2 = r5.f719h0
            r3 = 0
            if (r2 == 0) goto L24
            androidx.appcompat.view.menu.g r2 = r5.f717f0
            int r2 = r2.f863y
            r4 = 4
            r2 = r2 & r4
            if (r2 != r4) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 == 0) goto L23
            boolean r2 = r5.f723l0
            if (r2 != 0) goto L24
            boolean r2 = r5.f724m0
            if (r2 == 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            r0 = r0 & r1
            r1 = 0
            if (r0 == 0) goto L2b
            java.lang.CharSequence r2 = r5.f718g0
            goto L2c
        L2b:
            r2 = r1
        L2c:
            r5.setText(r2)
            androidx.appcompat.view.menu.g r2 = r5.f717f0
            java.lang.CharSequence r2 = r2.f855q
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L41
            if (r0 == 0) goto L3d
            r2 = r1
            goto L41
        L3d:
            androidx.appcompat.view.menu.g r2 = r5.f717f0
            java.lang.CharSequence r2 = r2.f843e
        L41:
            r5.setContentDescription(r2)
            androidx.appcompat.view.menu.g r2 = r5.f717f0
            java.lang.CharSequence r2 = r2.f856r
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L59
            if (r0 == 0) goto L51
            goto L55
        L51:
            androidx.appcompat.view.menu.g r0 = r5.f717f0
            java.lang.CharSequence r1 = r0.f843e
        L55:
            androidx.appcompat.widget.C0263b1.m693a(r5, r1)
            goto L5c
        L59:
            androidx.appcompat.widget.C0263b1.m693a(r5, r2)
        L5c:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0216j.a
    public androidx.appcompat.view.menu.C0213g getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.g r0 = r1.f717f0
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            androidx.appcompat.view.menu.e$b r2 = r1.f720i0
            if (r2 == 0) goto L9
            androidx.appcompat.view.menu.g r0 = r1.f717f0
            r2.mo464a(r0)
        L9:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            boolean r1 = r0.m460e()
            r0.f723l0 = r1
            r0.m461f()
            return
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int r6, int r7) {
            r5 = this;
            boolean r0 = r5.m458c()
            if (r0 == 0) goto L19
            int r1 = r5.f726o0
            if (r1 < 0) goto L19
            int r2 = r5.getPaddingTop()
            int r3 = r5.getPaddingRight()
            int r4 = r5.getPaddingBottom()
            super.setPadding(r1, r2, r3, r4)
        L19:
            super.onMeasure(r6, r7)
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r2 = r5.getMeasuredWidth()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r3) goto L33
            int r3 = r5.f725n0
            int r6 = java.lang.Math.min(r6, r3)
            goto L35
        L33:
            int r6 = r5.f725n0
        L35:
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L46
            int r1 = r5.f725n0
            if (r1 <= 0) goto L46
            if (r2 >= r6) goto L46
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
            super.onMeasure(r6, r7)
        L46:
            if (r0 != 0) goto L6c
            android.graphics.drawable.Drawable r6 = r5.f719h0
            if (r6 == 0) goto L6c
            int r6 = r5.getMeasuredWidth()
            android.graphics.drawable.Drawable r7 = r5.f719h0
            android.graphics.Rect r7 = r7.getBounds()
            int r7 = r7.width()
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r7 = r5.getPaddingTop()
            int r0 = r5.getPaddingRight()
            int r1 = r5.getPaddingBottom()
            super.setPadding(r6, r7, r0, r1)
        L6c:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r1) {
            r0 = this;
            r1 = 0
            super.onRestoreInstanceState(r1)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.appcompat.view.menu.g r0 = r1.f717f0
            boolean r0 = r0.hasSubMenu()
            if (r0 == 0) goto L14
            androidx.appcompat.widget.h0 r0 = r1.f721j0
            if (r0 == 0) goto L14
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto L14
            r2 = 1
            return r2
        L14:
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }

    public void setCheckable(boolean r1) {
            r0 = this;
            return
    }

    public void setChecked(boolean r1) {
            r0 = this;
            return
    }

    public void setExpandedFormat(boolean r2) {
            r1 = this;
            boolean r0 = r1.f724m0
            if (r0 == r2) goto L12
            r1.f724m0 = r2
            androidx.appcompat.view.menu.g r2 = r1.f717f0
            if (r2 == 0) goto L12
            androidx.appcompat.view.menu.e r2 = r2.f852n
            r0 = 1
            r2.f818k = r0
            r2.m513p(r0)
        L12:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            r4.f719h0 = r5
            if (r5 == 0) goto L27
            int r0 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            int r2 = r4.f727p0
            if (r0 <= r2) goto L18
            float r3 = (float) r2
            float r0 = (float) r0
            float r3 = r3 / r0
            float r0 = (float) r1
            float r0 = r0 * r3
            int r1 = (int) r0
            r0 = r2
        L18:
            if (r1 <= r2) goto L22
            float r3 = (float) r2
            float r1 = (float) r1
            float r3 = r3 / r1
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            goto L23
        L22:
            r2 = r1
        L23:
            r1 = 0
            r5.setBounds(r1, r1, r0, r2)
        L27:
            r0 = 0
            r4.setCompoundDrawables(r5, r0, r0, r0)
            r4.m461f()
            return
    }

    public void setItemInvoker(androidx.appcompat.view.menu.C0211e.b r1) {
            r0 = this;
            r0.f720i0 = r1
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.f726o0 = r1
            super.setPadding(r1, r2, r3, r4)
            return
    }

    public void setPopupCallback(androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0206b r1) {
            r0 = this;
            r0.f722k0 = r1
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f718g0 = r1
            r0.m461f()
            return
    }
}
