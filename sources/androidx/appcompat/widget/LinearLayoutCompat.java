package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends android.view.ViewGroup {

    /* renamed from: a0 */
    public boolean f997a0;

    /* renamed from: b0 */
    public int f998b0;

    /* renamed from: c0 */
    public int f999c0;

    /* renamed from: d0 */
    public int f1000d0;

    /* renamed from: e0 */
    public int f1001e0;

    /* renamed from: f0 */
    public int f1002f0;

    /* renamed from: g0 */
    public float f1003g0;

    /* renamed from: h0 */
    public boolean f1004h0;

    /* renamed from: i0 */
    public int[] f1005i0;

    /* renamed from: j0 */
    public int[] f1006j0;

    /* renamed from: k0 */
    public android.graphics.drawable.Drawable f1007k0;

    /* renamed from: l0 */
    public int f1008l0;

    /* renamed from: m0 */
    public int f1009m0;

    /* renamed from: n0 */
    public int f1010n0;

    /* renamed from: o0 */
    public int f1011o0;

    /* renamed from: androidx.appcompat.widget.LinearLayoutCompat$a */
    public static class C0231a extends android.widget.LinearLayout.LayoutParams {
        public C0231a(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C0231a(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C0231a(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public LinearLayoutCompat(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public LinearLayoutCompat(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public LinearLayoutCompat(android.content.Context r12, android.util.AttributeSet r13, int r14) {
            r11 = this;
            r11.<init>(r12, r13, r14)
            r0 = 1
            r11.f997a0 = r0
            r1 = -1
            r11.f998b0 = r1
            r2 = 0
            r11.f999c0 = r2
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r11.f1001e0 = r3
            int[] r6 = p064e.C1495i.f7270m
            android.content.res.TypedArray r3 = r12.obtainStyledAttributes(r13, r6, r14, r2)
            r10 = 0
            r4 = r11
            r5 = r12
            r7 = r13
            r8 = r3
            r9 = r14
            p227n0.C4661t.m10545u(r4, r5, r6, r7, r8, r9, r10)
            int r13 = r3.getInt(r0, r1)
            if (r13 < 0) goto L29
            r11.setOrientation(r13)
        L29:
            int r13 = r3.getInt(r2, r1)
            if (r13 < 0) goto L32
            r11.setGravity(r13)
        L32:
            r13 = 2
            boolean r13 = r3.getBoolean(r13, r0)
            if (r13 != 0) goto L3c
            r11.setBaselineAligned(r13)
        L3c:
            r13 = 4
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r13 = r3.getFloat(r13, r14)
            r11.f1003g0 = r13
            r13 = 3
            int r13 = r3.getInt(r13, r1)
            r11.f998b0 = r13
            r13 = 7
            boolean r13 = r3.getBoolean(r13, r2)
            r11.f1004h0 = r13
            r13 = 5
            boolean r14 = r3.hasValue(r13)
            if (r14 == 0) goto L65
            int r14 = r3.getResourceId(r13, r2)
            if (r14 == 0) goto L65
            android.graphics.drawable.Drawable r12 = p102g.C2199a.m5784b(r12, r14)
            goto L69
        L65:
            android.graphics.drawable.Drawable r12 = r3.getDrawable(r13)
        L69:
            r11.setDividerDrawable(r12)
            r12 = 8
            int r12 = r3.getInt(r12, r2)
            r11.f1010n0 = r12
            r12 = 6
            int r12 = r3.getDimensionPixelSize(r12, r2)
            r11.f1011o0 = r12
            r3.recycle()
            return
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.appcompat.widget.LinearLayoutCompat.C0231a
            return r1
    }

    /* renamed from: f */
    public void m585f(android.graphics.Canvas r5, int r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f1007k0
            int r1 = r4.getPaddingLeft()
            int r2 = r4.f1011o0
            int r1 = r1 + r2
            int r2 = r4.getWidth()
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r4.f1011o0
            int r2 = r2 - r3
            int r3 = r4.f1009m0
            int r3 = r3 + r6
            r0.setBounds(r1, r6, r2, r3)
            android.graphics.drawable.Drawable r6 = r4.f1007k0
            r6.draw(r5)
            return
    }

    /* renamed from: g */
    public void m586g(android.graphics.Canvas r6, int r7) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.f1007k0
            int r1 = r5.getPaddingTop()
            int r2 = r5.f1011o0
            int r1 = r1 + r2
            int r2 = r5.f1008l0
            int r2 = r2 + r7
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.f1011o0
            int r3 = r3 - r4
            r0.setBounds(r7, r1, r2, r3)
            android.graphics.drawable.Drawable r7 = r5.f1007k0
            r7.draw(r6)
            return
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat$a r0 = r1.mo572h()
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.LinearLayoutCompat$a r1 = r0.mo573i(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.LinearLayoutCompat$a r1 = r0.mo574j(r1)
            return r1
    }

    @Override // android.view.View
    public int getBaseline() {
            r5 = this;
            int r0 = r5.f998b0
            if (r0 >= 0) goto L9
            int r0 = super.getBaseline()
            return r0
        L9:
            int r0 = r5.getChildCount()
            int r1 = r5.f998b0
            if (r0 <= r1) goto L77
            android.view.View r0 = r5.getChildAt(r1)
            int r1 = r0.getBaseline()
            r2 = -1
            if (r1 != r2) goto L29
            int r0 = r5.f998b0
            if (r0 != 0) goto L21
            return r2
        L21:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline."
            r0.<init>(r1)
            throw r0
        L29:
            int r2 = r5.f999c0
            int r3 = r5.f1000d0
            r4 = 1
            if (r3 != r4) goto L6c
            int r3 = r5.f1001e0
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 48
            if (r3 == r4) goto L6c
            r4 = 16
            if (r3 == r4) goto L53
            r4 = 80
            if (r3 == r4) goto L41
            goto L6c
        L41:
            int r2 = r5.getBottom()
            int r3 = r5.getTop()
            int r2 = r2 - r3
            int r3 = r5.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r5.f1002f0
            int r2 = r2 - r3
            goto L6c
        L53:
            int r3 = r5.getBottom()
            int r4 = r5.getTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.f1002f0
            int r3 = r3 - r4
            int r3 = r3 / 2
            int r2 = r2 + r3
        L6c:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r0 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r0
            int r0 = r0.topMargin
            int r2 = r2 + r0
            int r2 = r2 + r1
            return r2
        L77:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."
            r0.<init>(r1)
            throw r0
    }

    public int getBaselineAlignedChildIndex() {
            r1 = this;
            int r0 = r1.f998b0
            return r0
    }

    public android.graphics.drawable.Drawable getDividerDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1007k0
            return r0
    }

    public int getDividerPadding() {
            r1 = this;
            int r0 = r1.f1011o0
            return r0
    }

    public int getDividerWidth() {
            r1 = this;
            int r0 = r1.f1008l0
            return r0
    }

    public int getGravity() {
            r1 = this;
            int r0 = r1.f1001e0
            return r0
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.f1000d0
            return r0
    }

    public int getShowDividers() {
            r1 = this;
            int r0 = r1.f1010n0
            return r0
    }

    public int getVirtualChildCount() {
            r1 = this;
            int r0 = r1.getChildCount()
            return r0
    }

    public float getWeightSum() {
            r1 = this;
            float r0 = r1.f1003g0
            return r0
    }

    /* renamed from: h */
    public androidx.appcompat.widget.LinearLayoutCompat.C0231a mo572h() {
            r3 = this;
            int r0 = r3.f1000d0
            r1 = -2
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.LinearLayoutCompat$a r0 = new androidx.appcompat.widget.LinearLayoutCompat$a
            r0.<init>(r1, r1)
            return r0
        Lb:
            r2 = 1
            if (r0 != r2) goto L15
            androidx.appcompat.widget.LinearLayoutCompat$a r0 = new androidx.appcompat.widget.LinearLayoutCompat$a
            r2 = -1
            r0.<init>(r2, r1)
            return r0
        L15:
            r0 = 0
            return r0
    }

    /* renamed from: i */
    public androidx.appcompat.widget.LinearLayoutCompat.C0231a mo573i(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.LinearLayoutCompat$a r0 = new androidx.appcompat.widget.LinearLayoutCompat$a
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    /* renamed from: j */
    public androidx.appcompat.widget.LinearLayoutCompat.C0231a mo574j(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat$a r0 = new androidx.appcompat.widget.LinearLayoutCompat$a
            r0.<init>(r2)
            return r0
    }

    /* renamed from: k */
    public boolean m587k(int r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 != 0) goto Lb
            int r5 = r4.f1010n0
            r5 = r5 & r1
            if (r5 == 0) goto La
            r0 = 1
        La:
            return r0
        Lb:
            int r2 = r4.getChildCount()
            if (r5 != r2) goto L19
            int r5 = r4.f1010n0
            r5 = r5 & 4
            if (r5 == 0) goto L18
            r0 = 1
        L18:
            return r0
        L19:
            int r2 = r4.f1010n0
            r2 = r2 & 2
            if (r2 == 0) goto L33
            int r5 = r5 - r1
        L20:
            if (r5 < 0) goto L33
            android.view.View r2 = r4.getChildAt(r5)
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L30
            r0 = 1
            goto L33
        L30:
            int r5 = r5 + (-1)
            goto L20
        L33:
            return r0
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r7) {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.f1007k0
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r6.f1000d0
            r1 = 8
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L68
            int r0 = r6.getVirtualChildCount()
        L11:
            if (r2 >= r0) goto L3b
            android.view.View r3 = r6.getChildAt(r2)
            if (r3 == 0) goto L38
            int r4 = r3.getVisibility()
            if (r4 == r1) goto L38
            boolean r4 = r6.m587k(r2)
            if (r4 == 0) goto L38
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r4 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r4
            int r3 = r3.getTop()
            int r4 = r4.topMargin
            int r3 = r3 - r4
            int r4 = r6.f1009m0
            int r3 = r3 - r4
            r6.m585f(r7, r3)
        L38:
            int r2 = r2 + 1
            goto L11
        L3b:
            boolean r1 = r6.m587k(r0)
            if (r1 == 0) goto Ldf
            int r0 = r0 + (-1)
            android.view.View r0 = r6.getChildAt(r0)
            if (r0 != 0) goto L56
            int r0 = r6.getHeight()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 - r1
            int r1 = r6.f1009m0
            int r0 = r0 - r1
            goto L63
        L56:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r1 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
        L63:
            r6.m585f(r7, r0)
            goto Ldf
        L68:
            int r0 = r6.getVirtualChildCount()
            boolean r3 = androidx.appcompat.widget.C0275f1.m724b(r6)
        L70:
            if (r2 >= r0) goto La4
            android.view.View r4 = r6.getChildAt(r2)
            if (r4 == 0) goto La1
            int r5 = r4.getVisibility()
            if (r5 == r1) goto La1
            boolean r5 = r6.m587k(r2)
            if (r5 == 0) goto La1
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r5 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r5
            if (r3 == 0) goto L94
            int r4 = r4.getRight()
            int r5 = r5.rightMargin
            int r4 = r4 + r5
            goto L9e
        L94:
            int r4 = r4.getLeft()
            int r5 = r5.leftMargin
            int r4 = r4 - r5
            int r5 = r6.f1008l0
            int r4 = r4 - r5
        L9e:
            r6.m586g(r7, r4)
        La1:
            int r2 = r2 + 1
            goto L70
        La4:
            boolean r1 = r6.m587k(r0)
            if (r1 == 0) goto Ldf
            int r0 = r0 + (-1)
            android.view.View r0 = r6.getChildAt(r0)
            if (r0 != 0) goto Lc2
            if (r3 == 0) goto Lb9
            int r0 = r6.getPaddingLeft()
            goto Ldc
        Lb9:
            int r0 = r6.getWidth()
            int r1 = r6.getPaddingRight()
            goto Ld0
        Lc2:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r1 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r1
            if (r3 == 0) goto Ld5
            int r0 = r0.getLeft()
            int r1 = r1.leftMargin
        Ld0:
            int r0 = r0 - r1
            int r1 = r6.f1008l0
            int r0 = r0 - r1
            goto Ldc
        Ld5:
            int r0 = r0.getRight()
            int r1 = r1.rightMargin
            int r0 = r0 + r1
        Ldc:
            r6.m586g(r7, r0)
        Ldf:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
            r17 = this;
            r0 = r17
            int r1 = r0.f1000d0
            r2 = 80
            r3 = 16
            r4 = 8
            r5 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r7 = 1
            if (r1 != r7) goto Lb6
            int r1 = r17.getPaddingLeft()
            int r8 = r21 - r19
            int r9 = r17.getPaddingRight()
            int r9 = r8 - r9
            int r8 = r8 - r1
            int r10 = r17.getPaddingRight()
            int r8 = r8 - r10
            int r10 = r17.getVirtualChildCount()
            int r11 = r0.f1001e0
            r12 = r11 & 112(0x70, float:1.57E-43)
            r6 = r6 & r11
            if (r12 == r3) goto L41
            if (r12 == r2) goto L35
            int r2 = r17.getPaddingTop()
            goto L4d
        L35:
            int r2 = r17.getPaddingTop()
            int r2 = r2 + r22
            int r2 = r2 - r20
            int r3 = r0.f1002f0
            int r2 = r2 - r3
            goto L4d
        L41:
            int r2 = r17.getPaddingTop()
            int r3 = r22 - r20
            int r11 = r0.f1002f0
            int r3 = r3 - r11
            int r3 = r3 / 2
            int r2 = r2 + r3
        L4d:
            r3 = 0
        L4e:
            if (r3 >= r10) goto L1ca
            android.view.View r11 = r0.getChildAt(r3)
            if (r11 != 0) goto L59
            int r2 = r2 + 0
            goto Lb1
        L59:
            int r12 = r11.getVisibility()
            if (r12 == r4) goto Lb1
            int r4 = r11.getMeasuredWidth()
            int r12 = r11.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r13 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r13
            int r14 = r13.gravity
            if (r14 >= 0) goto L72
            r14 = r6
        L72:
            java.util.WeakHashMap<android.view.View, n0.w> r15 = p227n0.C4661t.f18570a
            int r15 = p227n0.C4661t.d.m10575d(r17)
            int r14 = android.view.Gravity.getAbsoluteGravity(r14, r15)
            r14 = r14 & 7
            if (r14 == r7) goto L89
            if (r14 == r5) goto L86
            int r5 = r13.leftMargin
            int r5 = r5 + r1
            goto L94
        L86:
            int r5 = r9 - r4
            goto L91
        L89:
            int r5 = r8 - r4
            int r5 = r5 / 2
            int r5 = r5 + r1
            int r14 = r13.leftMargin
            int r5 = r5 + r14
        L91:
            int r14 = r13.rightMargin
            int r5 = r5 - r14
        L94:
            boolean r14 = r0.m587k(r3)
            if (r14 == 0) goto L9d
            int r14 = r0.f1009m0
            int r2 = r2 + r14
        L9d:
            int r14 = r13.topMargin
            int r2 = r2 + r14
            int r14 = r2 + 0
            int r4 = r4 + r5
            int r15 = r12 + r14
            r11.layout(r5, r14, r4, r15)
            int r4 = r13.bottomMargin
            r5 = 0
            int r2 = androidx.appcompat.widget.C0267d.m705a(r12, r4, r5, r2)
            int r3 = r3 + 0
        Lb1:
            int r3 = r3 + r7
            r4 = 8
            r5 = 5
            goto L4e
        Lb6:
            boolean r1 = androidx.appcompat.widget.C0275f1.m724b(r17)
            int r2 = r17.getPaddingTop()
            int r3 = r22 - r20
            int r4 = r17.getPaddingBottom()
            int r4 = r3 - r4
            int r3 = r3 - r2
            int r5 = r17.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r17.getVirtualChildCount()
            int r8 = r0.f1001e0
            r6 = r6 & r8
            r8 = r8 & 112(0x70, float:1.57E-43)
            boolean r9 = r0.f997a0
            int[] r10 = r0.f1005i0
            int[] r11 = r0.f1006j0
            java.util.WeakHashMap<android.view.View, n0.w> r12 = p227n0.C4661t.f18570a
            int r12 = p227n0.C4661t.d.m10575d(r17)
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r12)
            if (r6 == r7) goto Lfb
            r7 = 5
            if (r6 == r7) goto Lef
            int r6 = r17.getPaddingLeft()
            goto L107
        Lef:
            int r6 = r17.getPaddingLeft()
            int r6 = r6 + r21
            int r6 = r6 - r19
            int r7 = r0.f1002f0
            int r6 = r6 - r7
            goto L107
        Lfb:
            int r6 = r17.getPaddingLeft()
            int r7 = r21 - r19
            int r12 = r0.f1002f0
            int r7 = r7 - r12
            int r7 = r7 / 2
            int r6 = r6 + r7
        L107:
            if (r1 == 0) goto L10d
            int r1 = r5 + (-1)
            r7 = -1
            goto L10f
        L10d:
            r1 = 0
            r7 = 1
        L10f:
            r12 = 0
        L110:
            if (r12 >= r5) goto L1ca
            int r13 = r7 * r12
            int r13 = r13 + r1
            android.view.View r14 = r0.getChildAt(r13)
            if (r14 != 0) goto L121
            int r6 = r6 + 0
            r18 = r1
            goto L1b4
        L121:
            int r15 = r14.getVisibility()
            r18 = r1
            r1 = 8
            if (r15 == r1) goto L1b4
            int r1 = r14.getMeasuredWidth()
            int r15 = r14.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r14.getLayoutParams()
            r20 = r5
            r5 = r16
            androidx.appcompat.widget.LinearLayoutCompat$a r5 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r5
            r19 = r7
            if (r9 == 0) goto L14d
            int r7 = r5.height
            r22 = r8
            r8 = -1
            if (r7 == r8) goto L14f
            int r7 = r14.getBaseline()
            goto L150
        L14d:
            r22 = r8
        L14f:
            r7 = -1
        L150:
            int r8 = r5.gravity
            if (r8 >= 0) goto L156
            r8 = r22
        L156:
            r8 = r8 & 112(0x70, float:1.57E-43)
            r16 = r9
            r9 = 16
            if (r8 == r9) goto L189
            r9 = 48
            if (r8 == r9) goto L17b
            r9 = 80
            if (r8 == r9) goto L168
            r8 = r2
            goto L195
        L168:
            int r8 = r4 - r15
            int r9 = r5.bottomMargin
            int r8 = r8 - r9
            r9 = -1
            if (r7 == r9) goto L195
            int r9 = r14.getMeasuredHeight()
            int r9 = r9 - r7
            r7 = 2
            r7 = r11[r7]
            int r7 = r7 - r9
            int r8 = r8 - r7
            goto L195
        L17b:
            r8 = -1
            int r9 = r5.topMargin
            int r9 = r9 + r2
            if (r7 == r8) goto L187
            r8 = 1
            r8 = r10[r8]
            int r8 = r8 - r7
            int r8 = r8 + r9
            goto L195
        L187:
            r8 = r9
            goto L195
        L189:
            int r7 = r3 - r15
            int r7 = r7 / 2
            int r7 = r7 + r2
            int r8 = r5.topMargin
            int r7 = r7 + r8
            int r8 = r5.bottomMargin
            int r8 = r7 - r8
        L195:
            boolean r7 = r0.m587k(r13)
            if (r7 == 0) goto L19e
            int r7 = r0.f1008l0
            int r6 = r6 + r7
        L19e:
            int r7 = r5.leftMargin
            int r6 = r6 + r7
            int r7 = r6 + 0
            int r9 = r1 + r7
            int r15 = r15 + r8
            r14.layout(r7, r8, r9, r15)
            int r5 = r5.rightMargin
            r7 = 0
            int r1 = androidx.appcompat.widget.C0267d.m705a(r1, r5, r7, r6)
            int r12 = r12 + 0
            r6 = r1
            goto L1bc
        L1b4:
            r20 = r5
            r19 = r7
            r22 = r8
            r16 = r9
        L1bc:
            int r12 = r12 + 1
            r1 = r18
            r7 = r19
            r5 = r20
            r8 = r22
            r9 = r16
            goto L110
        L1ca:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r34, int r35) {
            r33 = this;
            r6 = r33
            r7 = r34
            r8 = r35
            int r0 = r6.f1000d0
            r1 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 8
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r9 = 1
            r10 = 0
            if (r0 != r9) goto L389
            r6.f1002f0 = r10
            int r9 = r33.getVirtualChildCount()
            int r11 = android.view.View.MeasureSpec.getMode(r34)
            int r12 = android.view.View.MeasureSpec.getMode(r35)
            int r13 = r6.f998b0
            boolean r14 = r6.f1004h0
            r0 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 1
            r22 = 0
            r23 = 0
            r0 = 0
            r2 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r16 = 0
            r17 = 0
        L43:
            if (r10 >= r9) goto L178
            android.view.View r18 = r6.getChildAt(r10)
            if (r18 != 0) goto L51
            int r1 = r6.f1002f0
            int r1 = r1 + r0
            r6.f1002f0 = r1
            goto L59
        L51:
            int r0 = r18.getVisibility()
            if (r0 != r3) goto L5f
            int r10 = r10 + 0
        L59:
            r23 = r9
            r25 = r12
            goto L167
        L5f:
            boolean r0 = r6.m587k(r10)
            if (r0 == 0) goto L6c
            int r0 = r6.f1002f0
            int r3 = r6.f1009m0
            int r0 = r0 + r3
            r6.f1002f0 = r0
        L6c:
            android.view.ViewGroup$LayoutParams r0 = r18.getLayoutParams()
            r3 = r0
            androidx.appcompat.widget.LinearLayoutCompat$a r3 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r3
            float r0 = r3.weight
            float r19 = r19 + r0
            if (r12 != r5) goto L99
            int r5 = r3.height
            if (r5 != 0) goto L99
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 <= 0) goto L99
            int r0 = r6.f1002f0
            int r1 = r3.topMargin
            int r1 = r1 + r0
            int r4 = r3.bottomMargin
            int r1 = r1 + r4
            int r0 = java.lang.Math.max(r0, r1)
            r6.f1002f0 = r0
            r20 = 1
            r26 = r2
            r23 = r9
            r25 = r12
            r12 = r3
            goto Lf0
        L99:
            int r5 = r3.height
            if (r5 != 0) goto La6
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto La6
            r3.height = r1
            r0 = 0
            r5 = 0
            goto Laa
        La6:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        Laa:
            r23 = 0
            int r0 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r0 != 0) goto Lb5
            int r0 = r6.f1002f0
            r24 = r0
            goto Lb8
        Lb5:
            r0 = 0
            r24 = 0
        Lb8:
            r0 = r33
            r1 = r18
            r4 = r2
            r2 = r34
            r25 = r12
            r12 = r3
            r3 = r23
            r26 = r4
            r4 = r35
            r23 = r9
            r9 = r5
            r5 = r24
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r9 == r15) goto Ld4
            r12.height = r9
        Ld4:
            int r0 = r18.getMeasuredHeight()
            int r1 = r6.f1002f0
            int r2 = r1 + r0
            int r3 = r12.topMargin
            int r2 = r2 + r3
            int r3 = r12.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 + 0
            int r1 = java.lang.Math.max(r1, r2)
            r6.f1002f0 = r1
            if (r14 == 0) goto Lf0
            int r7 = java.lang.Math.max(r0, r7)
        Lf0:
            if (r13 < 0) goto Lfa
            int r0 = r10 + 1
            if (r13 != r0) goto Lfa
            int r0 = r6.f1002f0
            r6.f999c0 = r0
        Lfa:
            if (r10 >= r13) goto L10c
            float r0 = r12.weight
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L104
            goto L10c
        L104:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L10c:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r11 == r0) goto L119
            int r0 = r12.width
            r1 = -1
            if (r0 != r1) goto L119
            r0 = 1
            r22 = 1
            goto L11a
        L119:
            r0 = 0
        L11a:
            int r1 = r12.leftMargin
            int r2 = r12.rightMargin
            int r1 = r1 + r2
            int r2 = r18.getMeasuredWidth()
            int r2 = r2 + r1
            r15 = r26
            int r3 = java.lang.Math.max(r15, r2)
            int r4 = r18.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r8, r4)
            if (r21 == 0) goto L13b
            int r5 = r12.width
            r8 = -1
            if (r5 != r8) goto L13b
            r5 = 1
            goto L13c
        L13b:
            r5 = 0
        L13c:
            float r8 = r12.weight
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L151
            if (r0 == 0) goto L146
            goto L147
        L146:
            r1 = r2
        L147:
            r9 = r17
            int r8 = java.lang.Math.max(r9, r1)
            r9 = r8
            r8 = r16
            goto L15d
        L151:
            r9 = r17
            if (r0 == 0) goto L156
            goto L157
        L156:
            r1 = r2
        L157:
            r0 = r16
            int r8 = java.lang.Math.max(r0, r1)
        L15d:
            int r10 = r10 + 0
            r2 = r3
            r21 = r5
            r16 = r8
            r17 = r9
            r8 = r4
        L167:
            int r10 = r10 + 1
            r0 = 0
            r1 = -2
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 8
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r9 = r23
            r12 = r25
            goto L43
        L178:
            r15 = r2
            r23 = r9
            r25 = r12
            r0 = r16
            r9 = r17
            int r1 = r6.f1002f0
            r10 = r23
            if (r1 <= 0) goto L194
            boolean r1 = r6.m587k(r10)
            if (r1 == 0) goto L194
            int r1 = r6.f1002f0
            int r2 = r6.f1009m0
            int r1 = r1 + r2
            r6.f1002f0 = r1
        L194:
            if (r14 == 0) goto L1d7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r25
            if (r2 == r1) goto L19e
            if (r2 != 0) goto L1d9
        L19e:
            r1 = 0
            r6.f1002f0 = r1
            r3 = 0
        L1a2:
            if (r3 >= r10) goto L1d9
            android.view.View r4 = r6.getChildAt(r3)
            if (r4 != 0) goto L1b0
            int r4 = r6.f1002f0
            int r4 = r4 + r1
            r6.f1002f0 = r4
            goto L1d3
        L1b0:
            int r1 = r4.getVisibility()
            r5 = 8
            if (r1 != r5) goto L1bb
            int r3 = r3 + 0
            goto L1d3
        L1bb:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r1 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r1
            int r4 = r6.f1002f0
            int r5 = r4 + r7
            int r12 = r1.topMargin
            int r5 = r5 + r12
            int r1 = r1.bottomMargin
            int r5 = r5 + r1
            int r5 = r5 + 0
            int r1 = java.lang.Math.max(r4, r5)
            r6.f1002f0 = r1
        L1d3:
            int r3 = r3 + 1
            r1 = 0
            goto L1a2
        L1d7:
            r2 = r25
        L1d9:
            int r1 = r6.f1002f0
            int r3 = r33.getPaddingTop()
            int r4 = r33.getPaddingBottom()
            int r4 = r4 + r3
            int r4 = r4 + r1
            r6.f1002f0 = r4
            int r1 = r33.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r4, r1)
            r3 = 0
            r12 = r35
            int r1 = android.view.View.resolveSizeAndState(r1, r12, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r1
            int r4 = r6.f1002f0
            int r3 = r3 - r4
            if (r20 != 0) goto L249
            if (r3 == 0) goto L207
            r4 = 0
            int r4 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r4 <= 0) goto L207
            goto L249
        L207:
            int r0 = java.lang.Math.max(r0, r9)
            if (r14 == 0) goto L244
            r3 = 1073741824(0x40000000, float:2.0)
            if (r2 == r3) goto L244
            r2 = 0
        L212:
            if (r2 >= r10) goto L244
            android.view.View r3 = r6.getChildAt(r2)
            if (r3 == 0) goto L241
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L223
            goto L241
        L223:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r4 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r4
            float r4 = r4.weight
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L241
            int r4 = r3.getMeasuredWidth()
            r5 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            r3.measure(r4, r5)
        L241:
            int r2 = r2 + 1
            goto L212
        L244:
            r12 = r34
            r2 = r15
            goto L329
        L249:
            float r4 = r6.f1003g0
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L252
            r19 = r4
        L252:
            r4 = 0
            r6.f1002f0 = r4
            r32 = r8
            r8 = r0
            r0 = r32
        L25a:
            if (r4 >= r10) goto L313
            android.view.View r5 = r6.getChildAt(r4)
            int r7 = r5.getVisibility()
            r9 = 8
            if (r7 != r9) goto L26c
            r12 = r34
            goto L30d
        L26c:
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r7 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r7
            float r9 = r7.weight
            r13 = 0
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 <= 0) goto L2c1
            float r13 = (float) r3
            float r13 = r13 * r9
            float r13 = r13 / r19
            int r13 = (int) r13
            float r19 = r19 - r9
            int r3 = r3 - r13
            int r9 = r33.getPaddingLeft()
            int r14 = r33.getPaddingRight()
            int r14 = r14 + r9
            int r9 = r7.leftMargin
            int r14 = r14 + r9
            int r9 = r7.rightMargin
            int r14 = r14 + r9
            int r9 = r7.width
            r12 = r34
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r12, r14, r9)
            int r14 = r7.height
            if (r14 != 0) goto L2a5
            r14 = 1073741824(0x40000000, float:2.0)
            if (r2 == r14) goto L2a2
            goto L2a5
        L2a2:
            if (r13 <= 0) goto L2ac
            goto L2ad
        L2a5:
            int r14 = r5.getMeasuredHeight()
            int r13 = r13 + r14
            if (r13 >= 0) goto L2ad
        L2ac:
            r13 = 0
        L2ad:
            r14 = 1073741824(0x40000000, float:2.0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r14)
            r5.measure(r9, r13)
            int r9 = r5.getMeasuredState()
            r9 = r9 & (-256(0xffffffffffffff00, float:NaN))
            int r0 = android.view.View.combineMeasuredStates(r0, r9)
            goto L2c3
        L2c1:
            r12 = r34
        L2c3:
            int r9 = r7.leftMargin
            int r13 = r7.rightMargin
            int r9 = r9 + r13
            int r13 = r5.getMeasuredWidth()
            int r13 = r13 + r9
            int r14 = java.lang.Math.max(r15, r13)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r11 == r15) goto L2de
            int r15 = r7.width
            r16 = r0
            r0 = -1
            if (r15 != r0) goto L2e1
            r15 = 1
            goto L2e2
        L2de:
            r16 = r0
            r0 = -1
        L2e1:
            r15 = 0
        L2e2:
            if (r15 == 0) goto L2e5
            goto L2e6
        L2e5:
            r9 = r13
        L2e6:
            int r8 = java.lang.Math.max(r8, r9)
            if (r21 == 0) goto L2f2
            int r9 = r7.width
            if (r9 != r0) goto L2f2
            r0 = 1
            goto L2f3
        L2f2:
            r0 = 0
        L2f3:
            int r9 = r6.f1002f0
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r9
            int r13 = r7.topMargin
            int r5 = r5 + r13
            int r7 = r7.bottomMargin
            int r5 = r5 + r7
            int r5 = r5 + 0
            int r5 = java.lang.Math.max(r9, r5)
            r6.f1002f0 = r5
            r21 = r0
            r15 = r14
            r0 = r16
        L30d:
            int r4 = r4 + 1
            r12 = r35
            goto L25a
        L313:
            r12 = r34
            int r2 = r6.f1002f0
            int r3 = r33.getPaddingTop()
            int r4 = r33.getPaddingBottom()
            int r4 = r4 + r3
            int r4 = r4 + r2
            r6.f1002f0 = r4
            r2 = r15
            r32 = r8
            r8 = r0
            r0 = r32
        L329:
            if (r21 != 0) goto L330
            r3 = 1073741824(0x40000000, float:2.0)
            if (r11 == r3) goto L330
            goto L331
        L330:
            r0 = r2
        L331:
            int r2 = r33.getPaddingLeft()
            int r3 = r33.getPaddingRight()
            int r3 = r3 + r2
            int r3 = r3 + r0
            int r0 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r3, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r12, r8)
            r6.setMeasuredDimension(r0, r1)
            if (r22 == 0) goto L8d6
            int r0 = r33.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
            r8 = 0
        L358:
            if (r8 >= r10) goto L8d6
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L386
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r9 = r0
            androidx.appcompat.widget.LinearLayoutCompat$a r9 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r9
            int r0 = r9.width
            r2 = -1
            if (r0 != r2) goto L386
            int r11 = r9.height
            int r0 = r1.getMeasuredHeight()
            r9.height = r0
            r3 = 0
            r5 = 0
            r0 = r33
            r2 = r7
            r4 = r35
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r9.height = r11
        L386:
            int r8 = r8 + 1
            goto L358
        L389:
            r12 = r7
            r7 = 1
            r0 = 0
            r6.f1002f0 = r0
            int r8 = r33.getVirtualChildCount()
            int r9 = android.view.View.MeasureSpec.getMode(r34)
            int r10 = android.view.View.MeasureSpec.getMode(r35)
            int[] r0 = r6.f1005i0
            r1 = 4
            if (r0 == 0) goto L3a3
            int[] r0 = r6.f1006j0
            if (r0 != 0) goto L3ab
        L3a3:
            int[] r0 = new int[r1]
            r6.f1005i0 = r0
            int[] r0 = new int[r1]
            r6.f1006j0 = r0
        L3ab:
            int[] r11 = r6.f1005i0
            int[] r13 = r6.f1006j0
            r0 = 3
            r1 = -1
            r11[r0] = r1
            r14 = 2
            r11[r14] = r1
            r11[r7] = r1
            r2 = 0
            r11[r2] = r1
            r13[r0] = r1
            r13[r14] = r1
            r13[r7] = r1
            r13[r2] = r1
            boolean r15 = r6.f997a0
            boolean r5 = r6.f1004h0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r9 != r0) goto L3cf
            r0 = 1
            r16 = 1
            goto L3d2
        L3cf:
            r0 = 0
            r16 = 0
        L3d2:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 1
            r21 = 0
            r0 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r14 = 0
        L3e7:
            if (r2 >= r8) goto L58b
            r22 = r5
            android.view.View r5 = r6.getChildAt(r2)
            if (r5 != 0) goto L3fc
            int r5 = r6.f1002f0
            int r5 = r5 + 0
            r6.f1002f0 = r5
            r23 = r0
            r24 = r3
            goto L40a
        L3fc:
            r23 = r0
            int r0 = r5.getVisibility()
            r24 = r3
            r3 = 8
            if (r0 != r3) goto L412
            int r2 = r2 + 0
        L40a:
            r0 = r23
            r3 = r24
            r24 = r9
            goto L581
        L412:
            boolean r0 = r6.m587k(r2)
            if (r0 == 0) goto L41f
            int r0 = r6.f1002f0
            int r3 = r6.f1008l0
            int r0 = r0 + r3
            r6.f1002f0 = r0
        L41f:
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            r3 = r0
            androidx.appcompat.widget.LinearLayoutCompat$a r3 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r3
            float r0 = r3.weight
            float r25 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r9 != r1) goto L482
            int r1 = r3.width
            if (r1 != 0) goto L482
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L482
            if (r16 == 0) goto L446
            int r0 = r6.f1002f0
            int r1 = r3.leftMargin
            r26 = r2
            int r2 = r3.rightMargin
            int r1 = r1 + r2
            int r1 = r1 + r0
            r6.f1002f0 = r1
            goto L456
        L446:
            r26 = r2
            int r0 = r6.f1002f0
            int r1 = r3.leftMargin
            int r1 = r1 + r0
            int r2 = r3.rightMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r6.f1002f0 = r0
        L456:
            if (r15 == 0) goto L46e
            r0 = 0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r5.measure(r0, r0)
            r0 = r3
            r12 = r23
            r30 = r24
            r23 = r26
            r26 = r5
            r24 = r9
            r9 = r4
            goto L4fd
        L46e:
            r0 = 1073741824(0x40000000, float:2.0)
            r19 = 1
            r0 = r3
            r1 = r23
            r30 = r24
            r23 = r26
            r2 = 1073741824(0x40000000, float:2.0)
            r26 = r5
            r24 = r9
            r9 = r4
            goto L500
        L482:
            r26 = r2
            int r1 = r3.width
            if (r1 != 0) goto L493
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L494
            r0 = -2
            r3.width = r0
            r0 = 0
            r2 = 0
            goto L498
        L493:
            r1 = 0
        L494:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L498:
            int r0 = (r25 > r1 ? 1 : (r25 == r1 ? 0 : -1))
            if (r0 != 0) goto L4a1
            int r0 = r6.f1002f0
            r27 = r0
            goto L4a4
        L4a1:
            r0 = 0
            r27 = 0
        L4a4:
            r28 = 0
            r1 = r23
            r0 = r33
            r12 = r1
            r1 = r5
            r29 = r2
            r23 = r26
            r2 = r34
            r31 = r3
            r30 = r24
            r3 = r27
            r24 = r9
            r9 = r4
            r4 = r35
            r26 = r5
            r5 = r28
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r29
            if (r1 == r0) goto L4cf
            r0 = r31
            r0.width = r1
            goto L4d1
        L4cf:
            r0 = r31
        L4d1:
            int r1 = r26.getMeasuredWidth()
            if (r16 == 0) goto L4e4
            int r2 = r6.f1002f0
            int r3 = r0.leftMargin
            int r3 = r3 + r1
            int r4 = r0.rightMargin
            r5 = 0
            int r2 = androidx.appcompat.widget.C0267d.m705a(r3, r4, r5, r2)
            goto L4f4
        L4e4:
            int r2 = r6.f1002f0
            int r3 = r2 + r1
            int r4 = r0.leftMargin
            int r3 = r3 + r4
            int r4 = r0.rightMargin
            int r3 = r3 + r4
            int r3 = r3 + 0
            int r2 = java.lang.Math.max(r2, r3)
        L4f4:
            r6.f1002f0 = r2
            if (r22 == 0) goto L4fd
            int r1 = java.lang.Math.max(r1, r12)
            goto L4fe
        L4fd:
            r1 = r12
        L4fe:
            r2 = 1073741824(0x40000000, float:2.0)
        L500:
            if (r10 == r2) goto L50b
            int r2 = r0.height
            r3 = -1
            if (r2 != r3) goto L50b
            r2 = 1
            r21 = 1
            goto L50c
        L50b:
            r2 = 0
        L50c:
            int r3 = r0.topMargin
            int r4 = r0.bottomMargin
            int r3 = r3 + r4
            int r4 = r26.getMeasuredHeight()
            int r4 = r4 + r3
            int r5 = r26.getMeasuredState()
            int r5 = android.view.View.combineMeasuredStates(r14, r5)
            if (r15 == 0) goto L54a
            int r12 = r26.getBaseline()
            r14 = -1
            if (r12 == r14) goto L54a
            int r14 = r0.gravity
            if (r14 >= 0) goto L52d
            int r14 = r6.f1001e0
        L52d:
            r14 = r14 & 112(0x70, float:1.57E-43)
            int r14 = r14 >> 4
            r14 = r14 & (-2)
            int r14 = r14 >> 1
            r26 = r1
            r1 = r11[r14]
            int r1 = java.lang.Math.max(r1, r12)
            r11[r14] = r1
            r1 = r13[r14]
            int r12 = r4 - r12
            int r1 = java.lang.Math.max(r1, r12)
            r13[r14] = r1
            goto L54c
        L54a:
            r26 = r1
        L54c:
            int r1 = java.lang.Math.max(r7, r4)
            if (r20 == 0) goto L559
            int r7 = r0.height
            r12 = -1
            if (r7 != r12) goto L559
            r7 = 1
            goto L55a
        L559:
            r7 = 0
        L55a:
            float r0 = r0.weight
            r12 = 0
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 <= 0) goto L56c
            if (r2 == 0) goto L564
            goto L565
        L564:
            r3 = r4
        L565:
            int r4 = java.lang.Math.max(r9, r3)
            r3 = r30
            goto L577
        L56c:
            if (r2 == 0) goto L56f
            goto L570
        L56f:
            r3 = r4
        L570:
            r2 = r30
            int r3 = java.lang.Math.max(r2, r3)
            r4 = r9
        L577:
            int r2 = r23 + 0
            r14 = r5
            r20 = r7
            r0 = r26
            r7 = r1
            r1 = r25
        L581:
            int r2 = r2 + 1
            r12 = r34
            r5 = r22
            r9 = r24
            goto L3e7
        L58b:
            r12 = r0
            r2 = r3
            r22 = r5
            r24 = r9
            r9 = r4
            int r0 = r6.f1002f0
            if (r0 <= 0) goto L5a3
            boolean r0 = r6.m587k(r8)
            if (r0 == 0) goto L5a3
            int r0 = r6.f1002f0
            int r3 = r6.f1008l0
            int r0 = r0 + r3
            r6.f1002f0 = r0
        L5a3:
            r0 = 1
            r3 = r11[r0]
            r0 = -1
            if (r3 != r0) goto L5bc
            r3 = 0
            r3 = r11[r3]
            if (r3 != r0) goto L5bc
            r3 = 2
            r4 = r11[r3]
            if (r4 != r0) goto L5bc
            r3 = 3
            r4 = r11[r3]
            if (r4 == r0) goto L5b9
            goto L5bd
        L5b9:
            r23 = r14
            goto L5f3
        L5bc:
            r3 = 3
        L5bd:
            r0 = r11[r3]
            r3 = 0
            r3 = r11[r3]
            r4 = 1
            r5 = r11[r4]
            r17 = 2
            r4 = r11[r17]
            int r4 = java.lang.Math.max(r5, r4)
            int r3 = java.lang.Math.max(r3, r4)
            int r0 = java.lang.Math.max(r0, r3)
            r3 = 3
            r3 = r13[r3]
            r4 = 0
            r4 = r13[r4]
            r23 = r14
            r5 = 1
            r14 = r13[r5]
            r5 = r13[r17]
            int r5 = java.lang.Math.max(r14, r5)
            int r4 = java.lang.Math.max(r4, r5)
            int r3 = java.lang.Math.max(r3, r4)
            int r3 = r3 + r0
            int r7 = java.lang.Math.max(r7, r3)
        L5f3:
            if (r22 == 0) goto L64d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r24
            if (r3 == r0) goto L5fd
            if (r3 != 0) goto L64f
        L5fd:
            r0 = 0
            r6.f1002f0 = r0
            r4 = 0
        L601:
            if (r4 >= r8) goto L64f
            android.view.View r5 = r6.getChildAt(r4)
            if (r5 != 0) goto L611
            int r5 = r6.f1002f0
            int r5 = r5 + r0
            r6.f1002f0 = r5
            r24 = r4
            goto L647
        L611:
            int r0 = r5.getVisibility()
            r14 = 8
            if (r0 != r14) goto L61c
            int r4 = r4 + 0
            goto L649
        L61c:
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r0 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r0
            if (r16 == 0) goto L633
            int r5 = r6.f1002f0
            int r14 = r0.leftMargin
            int r14 = r14 + r12
            int r0 = r0.rightMargin
            r24 = r4
            r4 = 0
            int r0 = androidx.appcompat.widget.C0267d.m705a(r14, r0, r4, r5)
            goto L645
        L633:
            r24 = r4
            int r4 = r6.f1002f0
            int r5 = r4 + r12
            int r14 = r0.leftMargin
            int r5 = r5 + r14
            int r0 = r0.rightMargin
            int r5 = r5 + r0
            int r5 = r5 + 0
            int r0 = java.lang.Math.max(r4, r5)
        L645:
            r6.f1002f0 = r0
        L647:
            r4 = r24
        L649:
            int r4 = r4 + 1
            r0 = 0
            goto L601
        L64d:
            r3 = r24
        L64f:
            int r0 = r6.f1002f0
            int r4 = r33.getPaddingLeft()
            int r5 = r33.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r0
            r6.f1002f0 = r5
            int r0 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r5, r0)
            r4 = 0
            r5 = r34
            int r0 = android.view.View.resolveSizeAndState(r0, r5, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r0
            int r14 = r6.f1002f0
            int r4 = r4 - r14
            if (r19 != 0) goto L6c4
            if (r4 == 0) goto L67d
            r14 = 0
            int r14 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r14 <= 0) goto L67d
            goto L6c4
        L67d:
            int r1 = java.lang.Math.max(r2, r9)
            if (r22 == 0) goto L6ba
            r2 = 1073741824(0x40000000, float:2.0)
            if (r3 == r2) goto L6ba
            r2 = 0
        L688:
            if (r2 >= r8) goto L6ba
            android.view.View r3 = r6.getChildAt(r2)
            if (r3 == 0) goto L6b7
            int r4 = r3.getVisibility()
            r9 = 8
            if (r4 != r9) goto L699
            goto L6b7
        L699:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r4 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r4
            float r4 = r4.weight
            r9 = 0
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 <= 0) goto L6b7
            r4 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r4)
            int r11 = r3.getMeasuredHeight()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r4)
            r3.measure(r9, r4)
        L6b7:
            int r2 = r2 + 1
            goto L688
        L6ba:
            r4 = r35
            r22 = r0
            r19 = r8
            r14 = r23
            goto L83a
        L6c4:
            float r7 = r6.f1003g0
            r9 = 0
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 <= 0) goto L6cc
            r1 = r7
        L6cc:
            r7 = 3
            r9 = -1
            r11[r7] = r9
            r12 = 2
            r11[r12] = r9
            r14 = 1
            r11[r14] = r9
            r14 = 0
            r11[r14] = r9
            r13[r7] = r9
            r13[r12] = r9
            r7 = 1
            r13[r7] = r9
            r13[r14] = r9
            r6.f1002f0 = r14
            r7 = -1
            r9 = 0
            r14 = r23
        L6e8:
            if (r9 >= r8) goto L80f
            android.view.View r12 = r6.getChildAt(r9)
            if (r12 == 0) goto L7f9
            int r5 = r12.getVisibility()
            r19 = r8
            r8 = 8
            if (r5 != r8) goto L701
            r22 = r0
            r25 = r3
            r0 = r4
            goto L800
        L701:
            android.view.ViewGroup$LayoutParams r5 = r12.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r5 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r5
            float r8 = r5.weight
            r22 = 0
            int r22 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r22 <= 0) goto L763
            r22 = r0
            float r0 = (float) r4
            float r0 = r0 * r8
            float r0 = r0 / r1
            int r0 = (int) r0
            float r1 = r1 - r8
            int r4 = r4 - r0
            int r8 = r33.getPaddingTop()
            int r23 = r33.getPaddingBottom()
            int r23 = r23 + r8
            int r8 = r5.topMargin
            int r23 = r23 + r8
            int r8 = r5.bottomMargin
            int r8 = r23 + r8
            r23 = r1
            int r1 = r5.height
            r24 = r4
            r4 = r35
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r4, r8, r1)
            int r8 = r5.width
            if (r8 != 0) goto L742
            r8 = 1073741824(0x40000000, float:2.0)
            if (r3 == r8) goto L73f
            goto L742
        L73f:
            if (r0 <= 0) goto L749
            goto L74a
        L742:
            int r8 = r12.getMeasuredWidth()
            int r0 = r0 + r8
            if (r0 >= 0) goto L74a
        L749:
            r0 = 0
        L74a:
            r8 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r8)
            r12.measure(r0, r1)
            int r0 = r12.getMeasuredState()
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r1
            int r14 = android.view.View.combineMeasuredStates(r14, r0)
            r1 = r23
            r0 = r24
            goto L768
        L763:
            r22 = r0
            r0 = r4
            r4 = r35
        L768:
            if (r16 == 0) goto L782
            int r8 = r6.f1002f0
            int r23 = r12.getMeasuredWidth()
            r24 = r0
            int r0 = r5.leftMargin
            int r0 = r23 + r0
            r23 = r1
            int r1 = r5.rightMargin
            r25 = r3
            r3 = 0
            int r0 = androidx.appcompat.widget.C0267d.m705a(r0, r1, r3, r8)
            goto L79b
        L782:
            r24 = r0
            r23 = r1
            r25 = r3
            int r0 = r6.f1002f0
            int r1 = r12.getMeasuredWidth()
            int r1 = r1 + r0
            int r3 = r5.leftMargin
            int r1 = r1 + r3
            int r3 = r5.rightMargin
            int r1 = r1 + r3
            int r1 = r1 + 0
            int r0 = java.lang.Math.max(r0, r1)
        L79b:
            r6.f1002f0 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 == r0) goto L7a8
            int r0 = r5.height
            r1 = -1
            if (r0 != r1) goto L7a8
            r0 = 1
            goto L7a9
        L7a8:
            r0 = 0
        L7a9:
            int r1 = r5.topMargin
            int r3 = r5.bottomMargin
            int r1 = r1 + r3
            int r3 = r12.getMeasuredHeight()
            int r3 = r3 + r1
            int r7 = java.lang.Math.max(r7, r3)
            if (r0 == 0) goto L7ba
            goto L7bb
        L7ba:
            r1 = r3
        L7bb:
            int r0 = java.lang.Math.max(r2, r1)
            if (r20 == 0) goto L7c8
            int r1 = r5.height
            r2 = -1
            if (r1 != r2) goto L7c9
            r1 = 1
            goto L7ca
        L7c8:
            r2 = -1
        L7c9:
            r1 = 0
        L7ca:
            if (r15 == 0) goto L7f1
            int r8 = r12.getBaseline()
            if (r8 == r2) goto L7f1
            int r2 = r5.gravity
            if (r2 >= 0) goto L7d8
            int r2 = r6.f1001e0
        L7d8:
            r2 = r2 & 112(0x70, float:1.57E-43)
            int r2 = r2 >> 4
            r2 = r2 & (-2)
            int r2 = r2 >> 1
            r5 = r11[r2]
            int r5 = java.lang.Math.max(r5, r8)
            r11[r2] = r5
            r5 = r13[r2]
            int r3 = r3 - r8
            int r3 = java.lang.Math.max(r5, r3)
            r13[r2] = r3
        L7f1:
            r2 = r0
            r20 = r1
            r1 = r23
            r0 = r24
            goto L802
        L7f9:
            r22 = r0
            r25 = r3
            r0 = r4
            r19 = r8
        L800:
            r4 = r35
        L802:
            int r9 = r9 + 1
            r5 = r34
            r4 = r0
            r8 = r19
            r0 = r22
            r3 = r25
            goto L6e8
        L80f:
            r4 = r35
            r22 = r0
            r19 = r8
            int r0 = r6.f1002f0
            int r1 = r33.getPaddingLeft()
            int r3 = r33.getPaddingRight()
            int r3 = r3 + r1
            int r3 = r3 + r0
            r6.f1002f0 = r3
            r0 = 1
            r1 = r11[r0]
            r0 = -1
            if (r1 != r0) goto L83c
            r1 = 0
            r1 = r11[r1]
            if (r1 != r0) goto L83c
            r1 = 2
            r3 = r11[r1]
            if (r3 != r0) goto L83c
            r1 = 3
            r3 = r11[r1]
            if (r3 == r0) goto L839
            goto L83d
        L839:
            r1 = r2
        L83a:
            r2 = r1
            goto L86d
        L83c:
            r1 = 3
        L83d:
            r0 = r11[r1]
            r3 = 0
            r5 = r11[r3]
            r8 = 1
            r9 = r11[r8]
            r12 = 2
            r11 = r11[r12]
            int r9 = java.lang.Math.max(r9, r11)
            int r5 = java.lang.Math.max(r5, r9)
            int r0 = java.lang.Math.max(r0, r5)
            r1 = r13[r1]
            r3 = r13[r3]
            r5 = r13[r8]
            r8 = r13[r12]
            int r5 = java.lang.Math.max(r5, r8)
            int r3 = java.lang.Math.max(r3, r5)
            int r1 = java.lang.Math.max(r1, r3)
            int r1 = r1 + r0
            int r7 = java.lang.Math.max(r7, r1)
        L86d:
            if (r20 != 0) goto L874
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 == r0) goto L874
            goto L875
        L874:
            r2 = r7
        L875:
            int r0 = r33.getPaddingTop()
            int r1 = r33.getPaddingBottom()
            int r1 = r1 + r0
            int r1 = r1 + r2
            int r0 = r33.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r1, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r14
            r1 = r1 | r22
            int r2 = r14 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r4, r2)
            r6.setMeasuredDimension(r1, r0)
            if (r21 == 0) goto L8d6
            int r0 = r33.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
            r9 = r19
            r8 = 0
        L8a5:
            if (r8 >= r9) goto L8d6
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L8d3
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r10 = r0
            androidx.appcompat.widget.LinearLayoutCompat$a r10 = (androidx.appcompat.widget.LinearLayoutCompat.C0231a) r10
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L8d3
            int r11 = r10.width
            int r0 = r1.getMeasuredWidth()
            r10.width = r0
            r3 = 0
            r5 = 0
            r0 = r33
            r2 = r34
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r10.width = r11
        L8d3:
            int r8 = r8 + 1
            goto L8a5
        L8d6:
            return
    }

    public void setBaselineAligned(boolean r1) {
            r0 = this;
            r0.f997a0 = r1
            return
    }

    public void setBaselineAlignedChildIndex(int r3) {
            r2 = this;
            if (r3 < 0) goto Lb
            int r0 = r2.getChildCount()
            if (r3 >= r0) goto Lb
            r2.f998b0 = r3
            return
        Lb:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "base aligned child index out of range (0, "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r2.getChildCount()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1007k0
            if (r3 != r0) goto L5
            return
        L5:
            r2.f1007k0 = r3
            r0 = 0
            if (r3 == 0) goto L17
            int r1 = r3.getIntrinsicWidth()
            r2.f1008l0 = r1
            int r1 = r3.getIntrinsicHeight()
            r2.f1009m0 = r1
            goto L1b
        L17:
            r2.f1008l0 = r0
            r2.f1009m0 = r0
        L1b:
            if (r3 != 0) goto L1e
            r0 = 1
        L1e:
            r2.setWillNotDraw(r0)
            r2.requestLayout()
            return
    }

    public void setDividerPadding(int r1) {
            r0 = this;
            r0.f1011o0 = r1
            return
    }

    public void setGravity(int r2) {
            r1 = this;
            int r0 = r1.f1001e0
            if (r0 == r2) goto L19
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r2
            if (r0 != 0) goto Le
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r2 = r2 | r0
        Le:
            r0 = r2 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L14
            r2 = r2 | 48
        L14:
            r1.f1001e0 = r2
            r1.requestLayout()
        L19:
            return
    }

    public void setHorizontalGravity(int r3) {
            r2 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r0
            int r1 = r2.f1001e0
            r0 = r0 & r1
            if (r0 == r3) goto L13
            r0 = -8388616(0xffffffffff7ffff8, float:-3.402822E38)
            r0 = r0 & r1
            r3 = r3 | r0
            r2.f1001e0 = r3
            r2.requestLayout()
        L13:
            return
    }

    /* renamed from: setMeasureWithLargestChildEnabled */
    public void m588x9c1b269f(boolean r1) {
            r0 = this;
            r0.f1004h0 = r1
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            int r0 = r1.f1000d0
            if (r0 == r2) goto L9
            r1.f1000d0 = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setShowDividers(int r2) {
            r1 = this;
            int r0 = r1.f1010n0
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.f1010n0 = r2
            return
    }

    public void setVerticalGravity(int r3) {
            r2 = this;
            r3 = r3 & 112(0x70, float:1.57E-43)
            int r0 = r2.f1001e0
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 == r3) goto L10
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            r3 = r3 | r0
            r2.f1001e0 = r3
            r2.requestLayout()
        L10:
            return
    }

    public void setWeightSum(float r2) {
            r1 = this;
            r0 = 0
            float r2 = java.lang.Math.max(r0, r2)
            r1.f1003g0 = r2
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
