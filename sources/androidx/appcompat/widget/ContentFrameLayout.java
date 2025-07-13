package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ContentFrameLayout extends android.widget.FrameLayout {

    /* renamed from: a0 */
    public android.util.TypedValue f987a0;

    /* renamed from: b0 */
    public android.util.TypedValue f988b0;

    /* renamed from: c0 */
    public android.util.TypedValue f989c0;

    /* renamed from: d0 */
    public android.util.TypedValue f990d0;

    /* renamed from: e0 */
    public android.util.TypedValue f991e0;

    /* renamed from: f0 */
    public android.util.TypedValue f992f0;

    /* renamed from: g0 */
    public final android.graphics.Rect f993g0;

    /* renamed from: h0 */
    public androidx.appcompat.widget.ContentFrameLayout.InterfaceC0230a f994h0;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface InterfaceC0230a {
    }

    public ContentFrameLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.f993g0 = r2
            return
    }

    public android.util.TypedValue getFixedHeightMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f991e0
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f991e0 = r0
        Lb:
            android.util.TypedValue r0 = r1.f991e0
            return r0
    }

    public android.util.TypedValue getFixedHeightMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f992f0
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f992f0 = r0
        Lb:
            android.util.TypedValue r0 = r1.f992f0
            return r0
    }

    public android.util.TypedValue getFixedWidthMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f989c0
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f989c0 = r0
        Lb:
            android.util.TypedValue r0 = r1.f989c0
            return r0
    }

    public android.util.TypedValue getFixedWidthMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f990d0
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f990d0 = r0
        Lb:
            android.util.TypedValue r0 = r1.f990d0
            return r0
    }

    public android.util.TypedValue getMinWidthMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f987a0
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f987a0 = r0
        Lb:
            android.util.TypedValue r0 = r1.f987a0
            return r0
    }

    public android.util.TypedValue getMinWidthMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f988b0
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f988b0 = r0
        Lb:
            android.util.TypedValue r0 = r1.f988b0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            androidx.appcompat.widget.ContentFrameLayout$a r0 = r1.f994h0
            if (r0 == 0) goto La
            java.util.Objects.requireNonNull(r0)
        La:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.ContentFrameLayout$a r0 = r3.f994h0
            if (r0 == 0) goto L41
            f.m r0 = (p083f.C1926m) r0
            f.k r0 = r0.f8408a
            androidx.appcompat.widget.c0 r1 = r0.f8358i0
            if (r1 == 0) goto L12
            r1.mo563l()
        L12:
            android.widget.PopupWindow r1 = r0.f8363n0
            if (r1 == 0) goto L31
            android.view.Window r1 = r0.f8352c0
            android.view.View r1 = r1.getDecorView()
            java.lang.Runnable r2 = r0.f8364o0
            r1.removeCallbacks(r2)
            android.widget.PopupWindow r1 = r0.f8363n0
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L2e
            android.widget.PopupWindow r1 = r0.f8363n0     // Catch: java.lang.IllegalArgumentException -> L2e
            r1.dismiss()     // Catch: java.lang.IllegalArgumentException -> L2e
        L2e:
            r1 = 0
            r0.f8363n0 = r1
        L31:
            r0.m4741I()
            r1 = 0
            f.k$i r0 = r0.m4746N(r1)
            androidx.appcompat.view.menu.e r0 = r0.f8397h
            if (r0 == 0) goto L41
            r1 = 1
            r0.m500c(r1)
        L41:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r14, int r15) {
            r13 = this;
            android.content.Context r0 = r13.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.widthPixels
            int r2 = r0.heightPixels
            r3 = 1
            r4 = 0
            if (r1 >= r2) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            int r2 = android.view.View.MeasureSpec.getMode(r14)
            int r5 = android.view.View.MeasureSpec.getMode(r15)
            r6 = 6
            r7 = 5
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1073741824(0x40000000, float:2.0)
            if (r2 != r8) goto L60
            if (r1 == 0) goto L2c
            android.util.TypedValue r10 = r13.f990d0
            goto L2e
        L2c:
            android.util.TypedValue r10 = r13.f989c0
        L2e:
            if (r10 == 0) goto L60
            int r11 = r10.type
            if (r11 == 0) goto L60
            if (r11 != r7) goto L3c
            float r10 = r10.getDimension(r0)
        L3a:
            int r10 = (int) r10
            goto L48
        L3c:
            if (r11 != r6) goto L47
            int r11 = r0.widthPixels
            float r12 = (float) r11
            float r11 = (float) r11
            float r10 = r10.getFraction(r12, r11)
            goto L3a
        L47:
            r10 = 0
        L48:
            if (r10 <= 0) goto L60
            android.graphics.Rect r11 = r13.f993g0
            int r12 = r11.left
            int r11 = r11.right
            int r12 = r12 + r11
            int r10 = r10 - r12
            int r14 = android.view.View.MeasureSpec.getSize(r14)
            int r14 = java.lang.Math.min(r10, r14)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            r10 = 1
            goto L61
        L60:
            r10 = 0
        L61:
            if (r5 != r8) goto L9a
            if (r1 == 0) goto L68
            android.util.TypedValue r5 = r13.f991e0
            goto L6a
        L68:
            android.util.TypedValue r5 = r13.f992f0
        L6a:
            if (r5 == 0) goto L9a
            int r11 = r5.type
            if (r11 == 0) goto L9a
            if (r11 != r7) goto L78
            float r5 = r5.getDimension(r0)
        L76:
            int r5 = (int) r5
            goto L84
        L78:
            if (r11 != r6) goto L83
            int r11 = r0.heightPixels
            float r12 = (float) r11
            float r11 = (float) r11
            float r5 = r5.getFraction(r12, r11)
            goto L76
        L83:
            r5 = 0
        L84:
            if (r5 <= 0) goto L9a
            android.graphics.Rect r11 = r13.f993g0
            int r12 = r11.top
            int r11 = r11.bottom
            int r12 = r12 + r11
            int r5 = r5 - r12
            int r15 = android.view.View.MeasureSpec.getSize(r15)
            int r15 = java.lang.Math.min(r5, r15)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r9)
        L9a:
            super.onMeasure(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            if (r10 != 0) goto Ldb
            if (r2 != r8) goto Ldb
            if (r1 == 0) goto Lae
            android.util.TypedValue r1 = r13.f988b0
            goto Lb0
        Lae:
            android.util.TypedValue r1 = r13.f987a0
        Lb0:
            if (r1 == 0) goto Ldb
            int r2 = r1.type
            if (r2 == 0) goto Ldb
            if (r2 != r7) goto Lbe
            float r0 = r1.getDimension(r0)
        Lbc:
            int r0 = (int) r0
            goto Lca
        Lbe:
            if (r2 != r6) goto Lc9
            int r0 = r0.widthPixels
            float r2 = (float) r0
            float r0 = (float) r0
            float r0 = r1.getFraction(r2, r0)
            goto Lbc
        Lc9:
            r0 = 0
        Lca:
            if (r0 <= 0) goto Ld4
            android.graphics.Rect r1 = r13.f993g0
            int r2 = r1.left
            int r1 = r1.right
            int r2 = r2 + r1
            int r0 = r0 - r2
        Ld4:
            if (r14 >= r0) goto Ldb
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            goto Ldc
        Ldb:
            r3 = 0
        Ldc:
            if (r3 == 0) goto Le1
            super.onMeasure(r5, r15)
        Le1:
            return
    }

    public void setAttachListener(androidx.appcompat.widget.ContentFrameLayout.InterfaceC0230a r1) {
            r0 = this;
            r0.f994h0 = r1
            return
    }
}
