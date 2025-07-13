package p098fe;

/* renamed from: fe.a */
/* loaded from: classes.dex */
public class C2140a extends androidx.recyclerview.widget.RecyclerView.AbstractC0556l {

    /* renamed from: a */
    public final float f9836a;

    /* renamed from: b */
    public final android.graphics.RectF f9837b;

    public C2140a(android.content.Context r4, int r5) {
            r3 = this;
            r3.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = 0
            r0.<init>(r1, r1, r2, r2)
            r3.f9837b = r0
            if (r5 == 0) goto L18
            android.content.res.Resources r4 = r4.getResources()
            float r2 = r4.getDimension(r5)
        L18:
            r3.f9836a = r2
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0556l
    /* renamed from: g */
    public void mo1840g(android.graphics.Canvas r6, androidx.recyclerview.widget.RecyclerView r7, androidx.recyclerview.widget.RecyclerView.C0569y r8) {
            r5 = this;
            android.graphics.RectF r8 = new android.graphics.RectF
            android.graphics.RectF r0 = r5.f9837b
            r8.<init>(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1 = 0
            r2 = 0
        Le:
            int r3 = r7.getChildCount()
            if (r2 >= r3) goto L51
            android.view.View r3 = r7.getChildAt(r2)
            androidx.recyclerview.widget.RecyclerView.m1717L(r3, r0)
            int r3 = r0.bottom
            float r3 = (float) r3
            float r1 = java.lang.Math.max(r1, r3)
            float r3 = r8.left
            int r4 = r0.left
            float r4 = (float) r4
            float r3 = java.lang.Math.min(r3, r4)
            r8.left = r3
            float r3 = r8.top
            int r4 = r0.top
            float r4 = (float) r4
            float r3 = java.lang.Math.min(r3, r4)
            r8.top = r3
            float r3 = r8.right
            int r4 = r0.right
            float r4 = (float) r4
            float r3 = java.lang.Math.max(r3, r4)
            r8.right = r3
            float r3 = r8.bottom
            int r4 = r0.bottom
            float r4 = (float) r4
            float r3 = java.lang.Math.max(r3, r4)
            r8.bottom = r3
            int r2 = r2 + 1
            goto Le
        L51:
            android.graphics.RectF r7 = r5.f9837b
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L5a
            return
        L5a:
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>(r8)
            float r0 = r7.bottom
            r7.top = r0
            r7.bottom = r1
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            float r1 = r5.f9836a
            android.graphics.Path$Direction r2 = android.graphics.Path.Direction.CW
            r0.addRoundRect(r8, r1, r1, r2)
            android.graphics.Path$Direction r8 = android.graphics.Path.Direction.CW
            r0.addRect(r7, r8)
            r6.clipPath(r0)
            return
    }
}
