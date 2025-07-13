package p450z7;

/* renamed from: z7.b */
/* loaded from: classes.dex */
public class C7256b extends p235n8.AbstractC4696c {

    /* renamed from: A0 */
    public boolean f27856A0;

    /* renamed from: B0 */
    public int[] f27857B0;

    /* renamed from: v0 */
    public final int f27858v0;

    /* renamed from: w0 */
    public final int f27859w0;

    /* renamed from: x0 */
    public final int f27860x0;

    /* renamed from: y0 */
    public final int f27861y0;

    /* renamed from: z0 */
    public final int f27862z0;

    public C7256b(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r0 = -2
            r2.<init>(r0, r0)
            r0 = 17
            r2.gravity = r0
            r1.setLayoutParams(r2)
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131165326(0x7f07008e, float:1.7944866E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r1.f27858v0 = r0
            r0 = 2131165327(0x7f07008f, float:1.7944868E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r1.f27859w0 = r0
            r0 = 2131165320(0x7f070088, float:1.7944854E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r1.f27860x0 = r0
            r0 = 2131165321(0x7f070089, float:1.7944856E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r1.f27861y0 = r0
            r0 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r2 = r2.getDimensionPixelSize(r0)
            r1.f27862z0 = r2
            r2 = 5
            int[] r2 = new int[r2]
            r1.f27857B0 = r2
            return
    }

    @Override // p235n8.AbstractC4696c
    /* renamed from: d */
    public p235n8.AbstractC4694a mo10744d(android.content.Context r2) {
            r1 = this;
            z7.a r0 = new z7.a
            r0.<init>(r2)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            int r5 = r4.getChildCount()
            int r8 = r8 - r6
            int r9 = r9 - r7
            r6 = 0
            r7 = 0
            r0 = 0
        L9:
            if (r7 >= r5) goto L3d
            android.view.View r1 = r4.getChildAt(r7)
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 != r3) goto L18
            goto L3a
        L18:
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            int r2 = p227n0.C4661t.d.m10575d(r4)
            r3 = 1
            if (r2 != r3) goto L2d
            int r2 = r8 - r0
            int r3 = r1.getMeasuredWidth()
            int r3 = r2 - r3
            r1.layout(r3, r6, r2, r9)
            goto L35
        L2d:
            int r2 = r1.getMeasuredWidth()
            int r2 = r2 + r0
            r1.layout(r0, r6, r2, r9)
        L35:
            int r1 = r1.getMeasuredWidth()
            int r0 = r0 + r1
        L3a:
            int r7 = r7 + 1
            goto L9
        L3d:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r11, int r12) {
            r10 = this;
            androidx.appcompat.view.menu.e r12 = r10.getMenu()
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            java.util.ArrayList r12 = r12.m509l()
            int r12 = r12.size()
            int r0 = r10.getChildCount()
            int r1 = r10.f27862z0
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            int r3 = r10.getLabelVisibilityMode()
            boolean r3 = r10.m10745e(r3, r12)
            r4 = 0
            r5 = 1
            r6 = 8
            if (r3 == 0) goto La9
            boolean r3 = r10.f27856A0
            if (r3 == 0) goto La9
            int r3 = r10.getSelectedItemPosition()
            android.view.View r3 = r10.getChildAt(r3)
            int r7 = r10.f27861y0
            int r8 = r3.getVisibility()
            if (r8 == r6) goto L51
            int r8 = r10.f27860x0
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            r3.measure(r8, r1)
            int r8 = r3.getMeasuredWidth()
            int r7 = java.lang.Math.max(r7, r8)
        L51:
            int r3 = r3.getVisibility()
            if (r3 == r6) goto L59
            r3 = 1
            goto L5a
        L59:
            r3 = 0
        L5a:
            int r12 = r12 - r3
            int r3 = r10.f27859w0
            int r3 = r3 * r12
            int r3 = r11 - r3
            int r8 = r10.f27860x0
            int r7 = java.lang.Math.min(r7, r8)
            int r3 = java.lang.Math.min(r3, r7)
            int r11 = r11 - r3
            if (r12 != 0) goto L70
            r7 = 1
            goto L71
        L70:
            r7 = r12
        L71:
            int r7 = r11 / r7
            int r8 = r10.f27858v0
            int r7 = java.lang.Math.min(r7, r8)
            int r12 = r12 * r7
            int r11 = r11 - r12
            r12 = 0
        L7d:
            if (r12 >= r0) goto Ldb
            android.view.View r8 = r10.getChildAt(r12)
            int r8 = r8.getVisibility()
            if (r8 == r6) goto La2
            int[] r8 = r10.f27857B0
            int r9 = r10.getSelectedItemPosition()
            if (r12 != r9) goto L93
            r9 = r3
            goto L94
        L93:
            r9 = r7
        L94:
            r8[r12] = r9
            if (r11 <= 0) goto La6
            int[] r8 = r10.f27857B0
            r9 = r8[r12]
            int r9 = r9 + r5
            r8[r12] = r9
            int r11 = r11 + (-1)
            goto La6
        La2:
            int[] r8 = r10.f27857B0
            r8[r12] = r4
        La6:
            int r12 = r12 + 1
            goto L7d
        La9:
            if (r12 != 0) goto Lad
            r3 = 1
            goto Lae
        Lad:
            r3 = r12
        Lae:
            int r3 = r11 / r3
            int r7 = r10.f27860x0
            int r3 = java.lang.Math.min(r3, r7)
            int r12 = r12 * r3
            int r11 = r11 - r12
            r12 = 0
        Lba:
            if (r12 >= r0) goto Ldb
            android.view.View r7 = r10.getChildAt(r12)
            int r7 = r7.getVisibility()
            if (r7 == r6) goto Ld4
            int[] r7 = r10.f27857B0
            r7[r12] = r3
            if (r11 <= 0) goto Ld8
            r8 = r7[r12]
            int r8 = r8 + r5
            r7[r12] = r8
            int r11 = r11 + (-1)
            goto Ld8
        Ld4:
            int[] r7 = r10.f27857B0
            r7[r12] = r4
        Ld8:
            int r12 = r12 + 1
            goto Lba
        Ldb:
            r11 = 0
            r12 = 0
        Ldd:
            if (r11 >= r0) goto L107
            android.view.View r3 = r10.getChildAt(r11)
            int r5 = r3.getVisibility()
            if (r5 != r6) goto Lea
            goto L104
        Lea:
            int[] r5 = r10.f27857B0
            r5 = r5[r11]
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            r3.measure(r5, r1)
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            int r7 = r3.getMeasuredWidth()
            r5.width = r7
            int r3 = r3.getMeasuredWidth()
            int r12 = r12 + r3
        L104:
            int r11 = r11 + 1
            goto Ldd
        L107:
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r2)
            int r11 = android.view.View.resolveSizeAndState(r12, r11, r4)
            int r12 = r10.f27862z0
            int r12 = android.view.View.resolveSizeAndState(r12, r1, r4)
            r10.setMeasuredDimension(r11, r12)
            return
    }

    /* renamed from: setItemHorizontalTranslationEnabled */
    public void m14338x8985bbc9(boolean r1) {
            r0 = this;
            r0.f27856A0 = r1
            return
    }
}
