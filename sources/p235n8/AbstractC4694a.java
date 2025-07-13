package p235n8;

/* renamed from: n8.a */
/* loaded from: classes.dex */
public abstract class AbstractC4694a extends android.widget.FrameLayout implements androidx.appcompat.view.menu.InterfaceC0216j.a {

    /* renamed from: q0 */
    public static final int[] f18721q0 = null;

    /* renamed from: a0 */
    public final int f18722a0;

    /* renamed from: b0 */
    public float f18723b0;

    /* renamed from: c0 */
    public float f18724c0;

    /* renamed from: d0 */
    public float f18725d0;

    /* renamed from: e0 */
    public int f18726e0;

    /* renamed from: f0 */
    public boolean f18727f0;

    /* renamed from: g0 */
    public android.widget.ImageView f18728g0;

    /* renamed from: h0 */
    public final android.view.ViewGroup f18729h0;

    /* renamed from: i0 */
    public final android.widget.TextView f18730i0;

    /* renamed from: j0 */
    public final android.widget.TextView f18731j0;

    /* renamed from: k0 */
    public int f18732k0;

    /* renamed from: l0 */
    public androidx.appcompat.view.menu.C0213g f18733l0;

    /* renamed from: m0 */
    public android.content.res.ColorStateList f18734m0;

    /* renamed from: n0 */
    public android.graphics.drawable.Drawable f18735n0;

    /* renamed from: o0 */
    public android.graphics.drawable.Drawable f18736o0;

    /* renamed from: p0 */
    public p389w7.C6817a f18737p0;

    /* renamed from: n8.a$a */
    public class a implements android.view.View.OnLayoutChangeListener {

        /* renamed from: a */
        public final /* synthetic */ p235n8.AbstractC4694a f18738a;

        public a(p235n8.AbstractC4694a r1) {
                r0 = this;
                r0.f18738a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
                r0 = this;
                n8.a r1 = r0.f18738a
                android.widget.ImageView r1 = r1.f18728g0
                int r1 = r1.getVisibility()
                if (r1 != 0) goto L1b
                n8.a r1 = r0.f18738a
                android.widget.ImageView r2 = r1.f18728g0
                boolean r3 = r1.m10741b()
                if (r3 != 0) goto L15
                goto L1b
            L15:
                w7.a r1 = r1.f18737p0
                r3 = 0
                p389w7.C6818b.m13902c(r1, r2, r3)
            L1b:
                return
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r0[r1] = r2
            p235n8.AbstractC4694a.f18721q0 = r0
            return
    }

    public AbstractC4694a(android.content.Context r6) {
            r5 = this;
            r5.<init>(r6)
            r0 = -1
            r5.f18732k0 = r0
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r0 = r5.getItemLayoutResId()
            r1 = 1
            r6.inflate(r0, r5, r1)
            r6 = 2131362453(0x7f0a0295, float:1.8344687E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r5.f18728g0 = r6
            r6 = 2131362454(0x7f0a0296, float:1.834469E38)
            android.view.View r6 = r5.findViewById(r6)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r5.f18729h0 = r6
            r0 = 2131362456(0x7f0a0298, float:1.8344693E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.f18730i0 = r0
            r2 = 2131362455(0x7f0a0297, float:1.8344691E38)
            android.view.View r2 = r5.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r5.f18731j0 = r2
            int r3 = r5.getItemBackgroundResId()
            r5.setBackgroundResource(r3)
            android.content.res.Resources r3 = r5.getResources()
            int r4 = r5.getItemDefaultMarginResId()
            int r3 = r3.getDimensionPixelSize(r4)
            r5.f18722a0 = r3
            int r3 = r6.getPaddingBottom()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2131362436(0x7f0a0284, float:1.8344653E38)
            r6.setTag(r4, r3)
            java.util.WeakHashMap<android.view.View, n0.w> r6 = p227n0.C4661t.f18570a
            r6 = 2
            p227n0.C4661t.c.m10571s(r0, r6)
            p227n0.C4661t.c.m10571s(r2, r6)
            r5.setFocusable(r1)
            float r6 = r0.getTextSize()
            float r0 = r2.getTextSize()
            r5.m10740a(r6, r0)
            android.widget.ImageView r6 = r5.f18728g0
            if (r6 == 0) goto L84
            n8.a$a r0 = new n8.a$a
            r0.<init>(r5)
            r6.addOnLayoutChangeListener(r0)
        L84:
            return
    }

    /* renamed from: c */
    public static void m10737c(android.view.View r1, int r2, int r3) {
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.topMargin = r2
            r0.gravity = r3
            r1.setLayoutParams(r0)
            return
    }

    /* renamed from: e */
    public static void m10738e(android.view.View r0, float r1, float r2, int r3) {
            r0.setScaleX(r1)
            r0.setScaleY(r2)
            r0.setVisibility(r3)
            return
    }

    /* renamed from: f */
    public static void m10739f(android.view.View r3, int r4) {
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingRight()
            r3.setPadding(r0, r1, r2, r4)
            return
    }

    private int getItemVisiblePosition() {
            r6 = this;
            android.view.ViewParent r0 = r6.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r0.indexOfChild(r6)
            r2 = 0
            r3 = 0
        Lc:
            if (r2 >= r1) goto L21
            android.view.View r4 = r0.getChildAt(r2)
            boolean r5 = r4 instanceof p235n8.AbstractC4694a
            if (r5 == 0) goto L1e
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L1e
            int r3 = r3 + 1
        L1e:
            int r2 = r2 + 1
            goto Lc
        L21:
            return r3
    }

    private int getSuggestedIconHeight() {
            r3 = this;
            w7.a r0 = r3.f18737p0
            if (r0 == 0) goto Lb
            int r0 = r0.getMinimumHeight()
            int r0 = r0 / 2
            goto Lc
        Lb:
            r0 = 0
        Lc:
            android.widget.ImageView r1 = r3.f18728g0
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r1 = r1.topMargin
            int r1 = java.lang.Math.max(r0, r1)
            android.widget.ImageView r2 = r3.f18728g0
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r1
            int r2 = r2 + r0
            return r2
    }

    private int getSuggestedIconWidth() {
            r4 = this;
            w7.a r0 = r4.f18737p0
            if (r0 != 0) goto L6
            r0 = 0
            goto L11
        L6:
            int r0 = r0.getMinimumWidth()
            w7.a r1 = r4.f18737p0
            w7.a$a r1 = r1.f26535f0
            int r1 = r1.f26554i0
            int r0 = r0 - r1
        L11:
            android.widget.ImageView r1 = r4.f18728g0
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r1.leftMargin
            int r2 = java.lang.Math.max(r0, r2)
            android.widget.ImageView r3 = r4.f18728g0
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            int r1 = r1.rightMargin
            int r0 = java.lang.Math.max(r0, r1)
            int r0 = r0 + r3
            return r0
    }

    /* renamed from: a */
    public final void m10740a(float r3, float r4) {
            r2 = this;
            float r0 = r3 - r4
            r2.f18723b0 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r4 * r0
            float r1 = r1 / r3
            r2.f18724c0 = r1
            float r3 = r3 * r0
            float r3 = r3 / r4
            r2.f18725d0 = r3
            return
    }

    /* renamed from: b */
    public final boolean m10741b() {
            r1 = this;
            w7.a r0 = r1.f18737p0
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0216j.a
    /* renamed from: d */
    public void mo459d(androidx.appcompat.view.menu.C0213g r3, int r4) {
            r2 = this;
            r2.f18733l0 = r3
            boolean r4 = r3.isCheckable()
            r2.setCheckable(r4)
            boolean r4 = r3.isChecked()
            r2.setChecked(r4)
            boolean r4 = r3.isEnabled()
            r2.setEnabled(r4)
            android.graphics.drawable.Drawable r4 = r3.getIcon()
            r2.setIcon(r4)
            java.lang.CharSequence r4 = r3.f843e
            r2.setTitle(r4)
            int r4 = r3.f839a
            r2.setId(r4)
            java.lang.CharSequence r4 = r3.f855q
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L35
            java.lang.CharSequence r4 = r3.f855q
            r2.setContentDescription(r4)
        L35:
            java.lang.CharSequence r4 = r3.f856r
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L40
            java.lang.CharSequence r4 = r3.f856r
            goto L42
        L40:
            java.lang.CharSequence r4 = r3.f843e
        L42:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 <= r1) goto L4b
            androidx.appcompat.widget.C0263b1.m693a(r2, r4)
        L4b:
            boolean r3 = r3.isVisible()
            if (r3 == 0) goto L53
            r3 = 0
            goto L55
        L53:
            r3 = 8
        L55:
            r2.setVisibility(r3)
            return
    }

    public p389w7.C6817a getBadge() {
            r1 = this;
            w7.a r0 = r1.f18737p0
            return r0
    }

    public int getItemBackgroundResId() {
            r1 = this;
            r0 = 2131231331(0x7f080263, float:1.807874E38)
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0216j.a
    public androidx.appcompat.view.menu.C0213g getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.g r0 = r1.f18733l0
            return r0
    }

    public int getItemDefaultMarginResId() {
            r1 = this;
            r0 = 2131165595(0x7f07019b, float:1.7945412E38)
            return r0
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
            r1 = this;
            int r0 = r1.f18732k0
            return r0
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
            r3 = this;
            android.view.ViewGroup r0 = r3.f18729h0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r3.getSuggestedIconHeight()
            int r2 = r0.topMargin
            int r1 = r1 + r2
            android.view.ViewGroup r2 = r3.f18729h0
            int r2 = r2.getMeasuredHeight()
            int r2 = r2 + r1
            int r0 = r0.bottomMargin
            int r2 = r2 + r0
            return r2
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
            r3 = this;
            android.view.ViewGroup r0 = r3.f18729h0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r0.leftMargin
            android.view.ViewGroup r2 = r3.f18729h0
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r1
            int r0 = r0.rightMargin
            int r2 = r2 + r0
            int r0 = r3.getSuggestedIconWidth()
            int r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int[] r2 = super.onCreateDrawableState(r2)
            androidx.appcompat.view.menu.g r0 = r1.f18733l0
            if (r0 == 0) goto L1d
            boolean r0 = r0.isCheckable()
            if (r0 == 0) goto L1d
            androidx.appcompat.view.menu.g r0 = r1.f18733l0
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L1d
            int[] r0 = p235n8.AbstractC4694a.f18721q0
            android.widget.FrameLayout.mergeDrawableStates(r2, r0)
        L1d:
            return r2
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r8) {
            r7 = this;
            super.onInitializeAccessibilityNodeInfo(r8)
            w7.a r0 = r7.f18737p0
            if (r0 == 0) goto L3a
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L3a
            androidx.appcompat.view.menu.g r0 = r7.f18733l0
            java.lang.CharSequence r1 = r0.f843e
            java.lang.CharSequence r0 = r0.f855q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1d
            androidx.appcompat.view.menu.g r0 = r7.f18733l0
            java.lang.CharSequence r1 = r0.f855q
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            w7.a r1 = r7.f18737p0
            java.lang.CharSequence r1 = r1.m13889c()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.setContentDescription(r0)
        L3a:
            r1 = 0
            r2 = 1
            int r3 = r7.getItemVisiblePosition()
            r4 = 1
            r5 = 0
            boolean r6 = r7.isSelected()
            o0.b$c r0 = p242o0.C4868b.c.m11002a(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r0.f19353a
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
            r8.setCollectionItemInfo(r0)
            boolean r0 = r7.isSelected()
            if (r0 == 0) goto L64
            r0 = 0
            r8.setClickable(r0)
            o0.b$a r0 = p242o0.C4868b.a.f19340e
            java.lang.Object r0 = r0.f19348a
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
            r8.removeAction(r0)
        L64:
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131951842(0x7f1300e2, float:1.954011E38)
            java.lang.String r0 = r0.getString(r1)
            android.os.Bundle r8 = r8.getExtras()
            java.lang.String r1 = "AccessibilityNodeInfo.roleDescription"
            r8.putCharSequence(r1, r0)
            return
    }

    public void setBadge(p389w7.C6817a r3) {
            r2 = this;
            r2.f18737p0 = r3
            android.widget.ImageView r3 = r2.f18728g0
            if (r3 == 0) goto L1c
            boolean r0 = r2.m10741b()
            if (r0 != 0) goto Ld
            goto L1c
        Ld:
            if (r3 == 0) goto L1c
            r0 = 0
            r2.setClipChildren(r0)
            r2.setClipToPadding(r0)
            w7.a r0 = r2.f18737p0
            r1 = 0
            p389w7.C6818b.m13900a(r0, r3, r1)
        L1c:
            return
    }

    public void setCheckable(boolean r1) {
            r0 = this;
            r0.refreshDrawableState()
            return
    }

    public void setChecked(boolean r10) {
            r9 = this;
            android.widget.TextView r0 = r9.f18731j0
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.f18731j0
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r0 = r9.f18730i0
            int r1 = r0.getWidth()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.f18730i0
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            int r0 = r9.f18726e0
            r1 = -1
            r3 = 17
            r4 = 2131362436(0x7f0a0284, float:1.8344653E38)
            r5 = 49
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 4
            r8 = 0
            if (r0 == r1) goto Lc8
            if (r0 == 0) goto L97
            r1 = 1
            if (r0 == r1) goto L59
            if (r0 == r2) goto L44
            goto Le5
        L44:
            android.widget.ImageView r0 = r9.f18728g0
            int r1 = r9.f18722a0
            m10737c(r0, r1, r3)
            android.widget.TextView r0 = r9.f18731j0
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r9.f18730i0
            r0.setVisibility(r1)
            goto Le5
        L59:
            android.view.ViewGroup r0 = r9.f18729h0
            java.lang.Object r1 = r0.getTag(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            m10739f(r0, r1)
            if (r10 == 0) goto L83
        L6a:
            android.widget.ImageView r0 = r9.f18728g0
            int r1 = r9.f18722a0
            float r1 = (float) r1
            float r2 = r9.f18723b0
            float r1 = r1 + r2
            int r1 = (int) r1
            m10737c(r0, r1, r5)
            android.widget.TextView r0 = r9.f18731j0
            m10738e(r0, r6, r6, r8)
            android.widget.TextView r0 = r9.f18730i0
            float r1 = r9.f18724c0
            m10738e(r0, r1, r1, r7)
            goto Le5
        L83:
            android.widget.ImageView r0 = r9.f18728g0
            int r1 = r9.f18722a0
            m10737c(r0, r1, r5)
            android.widget.TextView r0 = r9.f18731j0
            float r1 = r9.f18725d0
            m10738e(r0, r1, r1, r7)
            android.widget.TextView r0 = r9.f18730i0
            m10738e(r0, r6, r6, r8)
            goto Le5
        L97:
            android.widget.ImageView r0 = r9.f18728g0
            int r1 = r9.f18722a0
            if (r10 == 0) goto Lb5
        L9d:
            m10737c(r0, r1, r5)
            android.view.ViewGroup r0 = r9.f18729h0
            java.lang.Object r1 = r0.getTag(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            m10739f(r0, r1)
            android.widget.TextView r0 = r9.f18731j0
            r0.setVisibility(r8)
            goto Lc2
        Lb5:
            m10737c(r0, r1, r3)
            android.view.ViewGroup r0 = r9.f18729h0
            m10739f(r0, r8)
            android.widget.TextView r0 = r9.f18731j0
            r0.setVisibility(r7)
        Lc2:
            android.widget.TextView r0 = r9.f18730i0
            r0.setVisibility(r7)
            goto Le5
        Lc8:
            boolean r0 = r9.f18727f0
            if (r0 == 0) goto Ld3
            android.widget.ImageView r0 = r9.f18728g0
            int r1 = r9.f18722a0
            if (r10 == 0) goto Lb5
            goto L9d
        Ld3:
            android.view.ViewGroup r0 = r9.f18729h0
            java.lang.Object r1 = r0.getTag(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            m10739f(r0, r1)
            if (r10 == 0) goto L83
            goto L6a
        Le5:
            r9.refreshDrawableState()
            r9.setSelected(r10)
            return
    }

    @Override // android.view.View
    public void setEnabled(boolean r2) {
            r1 = this;
            super.setEnabled(r2)
            android.widget.TextView r0 = r1.f18730i0
            r0.setEnabled(r2)
            android.widget.TextView r0 = r1.f18731j0
            r0.setEnabled(r2)
            android.widget.ImageView r0 = r1.f18728g0
            r0.setEnabled(r2)
            if (r2 == 0) goto L1f
            android.content.Context r2 = r1.getContext()
            r0 = 1002(0x3ea, float:1.404E-42)
            n0.p r2 = p227n0.C4657p.m10521a(r2, r0)
            goto L20
        L1f:
            r2 = 0
        L20:
            p227n0.C4661t.m10547w(r1, r2)
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f18735n0
            if (r2 != r0) goto L5
            return
        L5:
            r1.f18735n0 = r2
            if (r2 == 0) goto L25
            android.graphics.drawable.Drawable$ConstantState r0 = r2.getConstantState()
            if (r0 != 0) goto L10
            goto L14
        L10:
            android.graphics.drawable.Drawable r2 = r0.newDrawable()
        L14:
            android.graphics.drawable.Drawable r2 = p103g0.C2200a.m5792h(r2)
            android.graphics.drawable.Drawable r2 = r2.mutate()
            r1.f18736o0 = r2
            android.content.res.ColorStateList r0 = r1.f18734m0
            if (r0 == 0) goto L25
            r2.setTintList(r0)
        L25:
            android.widget.ImageView r0 = r1.f18728g0
            r0.setImageDrawable(r2)
            return
    }

    public void setIconSize(int r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.f18728g0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.width = r2
            r0.height = r2
            android.widget.ImageView r2 = r1.f18728g0
            r2.setLayoutParams(r0)
            return
    }

    public void setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.f18734m0 = r2
            androidx.appcompat.view.menu.g r0 = r1.f18733l0
            if (r0 == 0) goto L12
            android.graphics.drawable.Drawable r0 = r1.f18736o0
            if (r0 == 0) goto L12
            r0.setTintList(r2)
            android.graphics.drawable.Drawable r2 = r1.f18736o0
            r2.invalidateSelf()
        L12:
            return
    }

    public void setItemBackground(int r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto Le
        L4:
            android.content.Context r0 = r2.getContext()
            java.lang.Object r1 = p046d0.C1259a.f6733a
            android.graphics.drawable.Drawable r3 = p046d0.C1259a.b.m3710b(r0, r3)
        Le:
            r2.setItemBackground(r3)
            return
    }

    public void setItemBackground(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L14
            android.graphics.drawable.Drawable$ConstantState r0 = r2.getConstantState()
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
            android.graphics.drawable.Drawable r2 = r2.mutate()
        L14:
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10569q(r1, r2)
            return
    }

    public void setItemPosition(int r1) {
            r0 = this;
            r0.f18732k0 = r1
            return
    }

    public void setLabelVisibilityMode(int r2) {
            r1 = this;
            int r0 = r1.f18726e0
            if (r0 == r2) goto L16
            r1.f18726e0 = r2
            androidx.appcompat.view.menu.g r2 = r1.f18733l0
            if (r2 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L16
            boolean r2 = r2.isChecked()
            r1.setChecked(r2)
        L16:
            return
    }

    public void setShifting(boolean r2) {
            r1 = this;
            boolean r0 = r1.f18727f0
            if (r0 == r2) goto L16
            r1.f18727f0 = r2
            androidx.appcompat.view.menu.g r2 = r1.f18733l0
            if (r2 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L16
            boolean r2 = r2.isChecked()
            r1.setChecked(r2)
        L16:
            return
    }

    public void setTextAppearanceActive(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.f18731j0
            p280q0.C5540g.m11822f(r0, r2)
            android.widget.TextView r2 = r1.f18730i0
            float r2 = r2.getTextSize()
            android.widget.TextView r0 = r1.f18731j0
            float r0 = r0.getTextSize()
            r1.m10740a(r2, r0)
            return
    }

    public void setTextAppearanceInactive(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.f18730i0
            p280q0.C5540g.m11822f(r0, r2)
            android.widget.TextView r2 = r1.f18730i0
            float r2 = r2.getTextSize()
            android.widget.TextView r0 = r1.f18731j0
            float r0 = r0.getTextSize()
            r1.m10740a(r2, r0)
            return
    }

    public void setTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            android.widget.TextView r0 = r1.f18730i0
            r0.setTextColor(r2)
            android.widget.TextView r0 = r1.f18731j0
            r0.setTextColor(r2)
        Lc:
            return
    }

    public void setTitle(java.lang.CharSequence r3) {
            r2 = this;
            android.widget.TextView r0 = r2.f18730i0
            r0.setText(r3)
            android.widget.TextView r0 = r2.f18731j0
            r0.setText(r3)
            androidx.appcompat.view.menu.g r0 = r2.f18733l0
            if (r0 == 0) goto L16
            java.lang.CharSequence r0 = r0.f855q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L19
        L16:
            r2.setContentDescription(r3)
        L19:
            androidx.appcompat.view.menu.g r0 = r2.f18733l0
            if (r0 == 0) goto L2a
            java.lang.CharSequence r0 = r0.f856r
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L26
            goto L2a
        L26:
            androidx.appcompat.view.menu.g r3 = r2.f18733l0
            java.lang.CharSequence r3 = r3.f856r
        L2a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 <= r1) goto L33
            androidx.appcompat.widget.C0263b1.m693a(r2, r3)
        L33:
            return
    }
}
