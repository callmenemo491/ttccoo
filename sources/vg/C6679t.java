package vg;

/* renamed from: vg.t */
/* loaded from: classes.dex */
public final class C6679t extends androidx.recyclerview.widget.RecyclerView.AbstractC0556l {

    /* renamed from: a */
    public final boolean f25949a;

    /* renamed from: b */
    public final android.graphics.drawable.Drawable f25950b;

    public C6679t(android.content.Context r1, int r2, boolean r3, int r4) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 1
        L5:
            r0.<init>()
            r0.f25949a = r3
            java.lang.Object r3 = p046d0.C1259a.f6733a
            android.graphics.drawable.Drawable r1 = p046d0.C1259a.b.m3710b(r1, r2)
            p214m2.C4339q.m9704i(r1)
            r0.f25950b = r1
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0556l
    /* renamed from: h */
    public void mo1841h(android.graphics.Canvas r7, androidx.recyclerview.widget.RecyclerView r8, androidx.recyclerview.widget.RecyclerView.C0569y r9) {
            r6 = this;
            java.lang.String r0 = "c"
            p214m2.C4339q.m9706k(r7, r0)
            java.lang.String r0 = "state"
            p214m2.C4339q.m9706k(r9, r0)
            int r9 = r8.getPaddingLeft()
            int r0 = r8.getWidth()
            int r1 = r8.getPaddingRight()
            int r0 = r0 - r1
            int r1 = r8.getChildCount()
            boolean r2 = r6.f25949a
            r3 = 0
            if (r2 == 0) goto L22
            r2 = -1
            goto L23
        L22:
            r2 = 0
        L23:
            int r1 = r1 + r2
        L24:
            if (r3 >= r1) goto L55
            android.view.View r2 = r8.getChildAt(r3)
            java.lang.String r4 = "parent.getChildAt(i)"
            p214m2.C4339q.m9705j(r2, r4)
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            java.lang.String r5 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams"
            java.util.Objects.requireNonNull(r4, r5)
            androidx.recyclerview.widget.RecyclerView$n r4 = (androidx.recyclerview.widget.RecyclerView.C0558n) r4
            int r2 = r2.getBottom()
            int r4 = r4.bottomMargin
            int r2 = r2 + r4
            android.graphics.drawable.Drawable r4 = r6.f25950b
            int r4 = r4.getIntrinsicHeight()
            int r4 = r4 + r2
            android.graphics.drawable.Drawable r5 = r6.f25950b
            r5.setBounds(r9, r2, r0, r4)
            android.graphics.drawable.Drawable r2 = r6.f25950b
            r2.draw(r7)
            int r3 = r3 + 1
            goto L24
        L55:
            return
    }
}
