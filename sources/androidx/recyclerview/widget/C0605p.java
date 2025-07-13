package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.p */
/* loaded from: classes.dex */
public class C0605p extends androidx.recyclerview.widget.RecyclerView.AbstractC0556l {

    /* renamed from: d */
    public static final int[] f3511d = null;

    /* renamed from: a */
    public android.graphics.drawable.Drawable f3512a;

    /* renamed from: b */
    public int f3513b;

    /* renamed from: c */
    public final android.graphics.Rect f3514c;

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843284(0x1010214, float:2.369505E-38)
            r0[r1] = r2
            androidx.recyclerview.widget.C0605p.f3511d = r0
            return
    }

    public C0605p(android.content.Context r3, int r4) {
            r2 = this;
            r2.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.f3514c = r0
            int[] r0 = androidx.recyclerview.widget.C0605p.f3511d
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r0)
            r0 = 0
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r2.f3512a = r0
            if (r0 != 0) goto L20
            java.lang.String r0 = "DividerItem"
            java.lang.String r1 = "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()"
            android.util.Log.w(r0, r1)
        L20:
            r3.recycle()
            if (r4 == 0) goto L31
            r3 = 1
            if (r4 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Invalid orientation. It should be either HORIZONTAL or VERTICAL"
            r3.<init>(r4)
            throw r3
        L31:
            r2.f3513b = r4
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0556l
    /* renamed from: f */
    public void mo1839f(android.graphics.Rect r2, android.view.View r3, androidx.recyclerview.widget.RecyclerView r4, androidx.recyclerview.widget.RecyclerView.C0569y r5) {
            r1 = this;
            android.graphics.drawable.Drawable r3 = r1.f3512a
            r4 = 0
            if (r3 != 0) goto L9
            r2.set(r4, r4, r4, r4)
            return
        L9:
            int r5 = r1.f3513b
            r0 = 1
            if (r5 != r0) goto L16
            int r3 = r3.getIntrinsicHeight()
            r2.set(r4, r4, r4, r3)
            goto L1d
        L16:
            int r3 = r3.getIntrinsicWidth()
            r2.set(r4, r4, r3, r4)
        L1d:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0556l
    /* renamed from: g */
    public void mo1840g(android.graphics.Canvas r7, androidx.recyclerview.widget.RecyclerView r8, androidx.recyclerview.widget.RecyclerView.C0569y r9) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView$m r9 = r8.getLayoutManager()
            if (r9 == 0) goto Lda
            android.graphics.drawable.Drawable r9 = r6.f3512a
            if (r9 != 0) goto Lc
            goto Lda
        Lc:
            int r9 = r6.f3513b
            r0 = 0
            r1 = 1
            if (r9 != r1) goto L73
            r7.save()
            boolean r9 = r8.getClipToPadding()
            if (r9 == 0) goto L39
            int r9 = r8.getPaddingLeft()
            int r1 = r8.getWidth()
            int r2 = r8.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r8.getPaddingTop()
            int r3 = r8.getHeight()
            int r4 = r8.getPaddingBottom()
            int r3 = r3 - r4
            r7.clipRect(r9, r2, r1, r3)
            goto L3e
        L39:
            int r1 = r8.getWidth()
            r9 = 0
        L3e:
            int r2 = r8.getChildCount()
        L42:
            if (r0 >= r2) goto L6f
            android.view.View r3 = r8.getChildAt(r0)
            android.graphics.Rect r4 = r6.f3514c
            androidx.recyclerview.widget.RecyclerView.m1717L(r3, r4)
            android.graphics.Rect r4 = r6.f3514c
            int r4 = r4.bottom
            float r3 = r3.getTranslationY()
            int r3 = java.lang.Math.round(r3)
            int r3 = r3 + r4
            android.graphics.drawable.Drawable r4 = r6.f3512a
            int r4 = r4.getIntrinsicHeight()
            int r4 = r3 - r4
            android.graphics.drawable.Drawable r5 = r6.f3512a
            r5.setBounds(r9, r4, r1, r3)
            android.graphics.drawable.Drawable r3 = r6.f3512a
            r3.draw(r7)
            int r0 = r0 + 1
            goto L42
        L6f:
            r7.restore()
            goto Lda
        L73:
            r7.save()
            boolean r9 = r8.getClipToPadding()
            if (r9 == 0) goto L9a
            int r9 = r8.getPaddingTop()
            int r1 = r8.getHeight()
            int r2 = r8.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r8.getPaddingLeft()
            int r3 = r8.getWidth()
            int r4 = r8.getPaddingRight()
            int r3 = r3 - r4
            r7.clipRect(r2, r9, r3, r1)
            goto L9f
        L9a:
            int r1 = r8.getHeight()
            r9 = 0
        L9f:
            int r2 = r8.getChildCount()
        La3:
            if (r0 >= r2) goto Ld7
            android.view.View r3 = r8.getChildAt(r0)
            androidx.recyclerview.widget.RecyclerView$m r4 = r8.getLayoutManager()
            android.graphics.Rect r5 = r6.f3514c
            java.util.Objects.requireNonNull(r4)
            androidx.recyclerview.widget.RecyclerView.m1717L(r3, r5)
            android.graphics.Rect r4 = r6.f3514c
            int r4 = r4.right
            float r3 = r3.getTranslationX()
            int r3 = java.lang.Math.round(r3)
            int r3 = r3 + r4
            android.graphics.drawable.Drawable r4 = r6.f3512a
            int r4 = r4.getIntrinsicWidth()
            int r4 = r3 - r4
            android.graphics.drawable.Drawable r5 = r6.f3512a
            r5.setBounds(r4, r9, r3, r1)
            android.graphics.drawable.Drawable r3 = r6.f3512a
            r3.draw(r7)
            int r0 = r0 + 1
            goto La3
        Ld7:
            r7.restore()
        Lda:
            return
    }
}
