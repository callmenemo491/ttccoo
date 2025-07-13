package p220m8;

/* renamed from: m8.e */
/* loaded from: classes.dex */
public class C4421e extends android.view.ViewGroup {

    /* renamed from: a0 */
    public int f18042a0;

    /* renamed from: b0 */
    public int f18043b0;

    /* renamed from: c0 */
    public boolean f18044c0;

    /* renamed from: d0 */
    public int f18045d0;

    public C4421e(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public C4421e(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r4 = 0
            r1.f18044c0 = r4
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int[] r0 = p339t7.C6183a.f24018o
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0, r4, r4)
            r3 = 1
            int r3 = r2.getDimensionPixelSize(r3, r4)
            r1.f18042a0 = r3
            int r3 = r2.getDimensionPixelSize(r4, r4)
            r1.f18043b0 = r3
            r2.recycle()
            return
    }

    /* renamed from: a */
    public boolean mo3348a() {
            r1 = this;
            boolean r0 = r1.f18044c0
            return r0
    }

    public int getItemSpacing() {
            r1 = this;
            int r0 = r1.f18043b0
            return r0
    }

    public int getLineSpacing() {
            r1 = this;
            int r0 = r1.f18042a0
            return r0
    }

    public int getRowCount() {
            r1 = this;
            int r0 = r1.f18045d0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
            r10 = this;
            int r11 = r10.getChildCount()
            r13 = 0
            if (r11 != 0) goto La
            r10.f18045d0 = r13
            return
        La:
            r11 = 1
            r10.f18045d0 = r11
            java.util.WeakHashMap<android.view.View, n0.w> r15 = p227n0.C4661t.f18570a
            int r15 = p227n0.C4661t.d.m10575d(r10)
            if (r15 != r11) goto L17
            r15 = 1
            goto L18
        L17:
            r15 = 0
        L18:
            if (r15 == 0) goto L1f
            int r0 = r10.getPaddingRight()
            goto L23
        L1f:
            int r0 = r10.getPaddingLeft()
        L23:
            if (r15 == 0) goto L2a
            int r1 = r10.getPaddingLeft()
            goto L2e
        L2a:
            int r1 = r10.getPaddingRight()
        L2e:
            int r2 = r10.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r1
            r3 = r0
            r12 = r2
            r1 = 0
        L37:
            int r4 = r10.getChildCount()
            if (r1 >= r4) goto Lae
            android.view.View r4 = r10.getChildAt(r1)
            int r5 = r4.getVisibility()
            r6 = 8
            r7 = 2131362542(0x7f0a02ee, float:1.8344868E38)
            if (r5 != r6) goto L55
            r5 = -1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.setTag(r7, r5)
            goto Lab
        L55:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L68
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r6 = r5.getMarginStart()
            int r5 = r5.getMarginEnd()
            goto L6a
        L68:
            r5 = 0
            r6 = 0
        L6a:
            int r8 = r3 + r6
            int r9 = r4.getMeasuredWidth()
            int r9 = r9 + r8
            boolean r8 = r10.f18044c0
            if (r8 != 0) goto L80
            if (r9 <= r14) goto L80
            int r12 = r10.f18042a0
            int r12 = r12 + r2
            int r2 = r10.f18045d0
            int r2 = r2 + r11
            r10.f18045d0 = r2
            r3 = r0
        L80:
            int r2 = r10.f18045d0
            int r2 = r2 - r11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setTag(r7, r2)
            int r2 = r3 + r6
            int r7 = r4.getMeasuredWidth()
            int r7 = r7 + r2
            int r8 = r4.getMeasuredHeight()
            int r8 = r8 + r12
            if (r15 == 0) goto L9d
            int r2 = r14 - r7
            int r7 = r14 - r3
            int r7 = r7 - r6
        L9d:
            r4.layout(r2, r12, r7, r8)
            int r6 = r6 + r5
            int r2 = r4.getMeasuredWidth()
            int r2 = r2 + r6
            int r4 = r10.f18043b0
            int r2 = r2 + r4
            int r3 = r3 + r2
            r2 = r8
        Lab:
            int r1 = r1 + 1
            goto L37
        Lae:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r20, int r21) {
            r19 = this;
            r0 = r19
            int r1 = android.view.View.MeasureSpec.getSize(r20)
            int r2 = android.view.View.MeasureSpec.getMode(r20)
            int r3 = android.view.View.MeasureSpec.getSize(r21)
            int r4 = android.view.View.MeasureSpec.getMode(r21)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r2 == r5) goto L1f
            if (r2 != r6) goto L1b
            goto L1f
        L1b:
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L20
        L1f:
            r7 = r1
        L20:
            int r8 = r19.getPaddingLeft()
            int r9 = r19.getPaddingTop()
            int r10 = r19.getPaddingRight()
            int r7 = r7 - r10
            r11 = r9
            r12 = 0
            r13 = 0
        L30:
            int r14 = r19.getChildCount()
            if (r12 >= r14) goto Laa
            android.view.View r14 = r0.getChildAt(r12)
            int r15 = r14.getVisibility()
            r6 = 8
            if (r15 != r6) goto L47
            r15 = r21
            r16 = 0
            goto La3
        L47:
            r6 = r20
            r15 = r21
            r0.measureChild(r14, r6, r15)
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            boolean r10 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r10 == 0) goto L63
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r10 = r5.leftMargin
            r16 = 0
            int r10 = r10 + 0
            int r5 = r5.rightMargin
            int r5 = r5 + 0
            goto L67
        L63:
            r16 = 0
            r5 = 0
            r10 = 0
        L67:
            int r17 = r8 + r10
            int r18 = r14.getMeasuredWidth()
            int r6 = r18 + r17
            if (r6 <= r7) goto L7f
            boolean r6 = r19.mo3348a()
            if (r6 != 0) goto L7f
            int r8 = r19.getPaddingLeft()
            int r6 = r0.f18042a0
            int r11 = r9 + r6
        L7f:
            int r6 = r8 + r10
            int r9 = r14.getMeasuredWidth()
            int r9 = r9 + r6
            int r6 = r14.getMeasuredHeight()
            int r6 = r6 + r11
            if (r9 <= r13) goto L8e
            r13 = r9
        L8e:
            int r10 = r10 + r5
            int r9 = r14.getMeasuredWidth()
            int r9 = r9 + r10
            int r10 = r0.f18043b0
            int r9 = r9 + r10
            int r9 = r9 + r8
            int r8 = r19.getChildCount()
            int r8 = r8 + (-1)
            if (r12 != r8) goto La1
            int r13 = r13 + r5
        La1:
            r8 = r9
            r9 = r6
        La3:
            int r12 = r12 + 1
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 1073741824(0x40000000, float:2.0)
            goto L30
        Laa:
            int r5 = r19.getPaddingRight()
            int r5 = r5 + r13
            int r6 = r19.getPaddingBottom()
            int r6 = r6 + r9
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r7) goto Lbe
            r8 = 1073741824(0x40000000, float:2.0)
            if (r2 == r8) goto Lc4
            r1 = r5
            goto Lc4
        Lbe:
            r8 = 1073741824(0x40000000, float:2.0)
            int r1 = java.lang.Math.min(r5, r1)
        Lc4:
            if (r4 == r7) goto Lca
            if (r4 == r8) goto Lce
            r3 = r6
            goto Lce
        Lca:
            int r3 = java.lang.Math.min(r6, r3)
        Lce:
            r0.setMeasuredDimension(r1, r3)
            return
    }

    public void setItemSpacing(int r1) {
            r0 = this;
            r0.f18043b0 = r1
            return
    }

    public void setLineSpacing(int r1) {
            r0 = this;
            r0.f18042a0 = r1
            return
    }

    public void setSingleLine(boolean r1) {
            r0 = this;
            r0.f18044c0 = r1
            return
    }
}
