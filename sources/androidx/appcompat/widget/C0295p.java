package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.p */
/* loaded from: classes.dex */
public class C0295p extends android.widget.PopupWindow {
    public C0295p(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            int[] r0 = p064e.C1495i.f7275r
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0, r4, r5)
            r4 = 2
            boolean r5 = r3.hasValue(r4)
            r0 = 0
            if (r5 == 0) goto L18
            boolean r4 = r3.getBoolean(r4, r0)
            p280q0.C5539f.m11810a(r1, r4)
        L18:
            boolean r4 = r3.hasValue(r0)
            if (r4 == 0) goto L29
            int r4 = r3.getResourceId(r0, r0)
            if (r4 == 0) goto L29
            android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r2, r4)
            goto L2d
        L29:
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r0)
        L2d:
            r1.setBackgroundDrawable(r2)
            r3.recycle()
            return
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View r1, int r2, int r3) {
            r0 = this;
            super.showAsDropDown(r1, r2, r3)
            return
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View r1, int r2, int r3, int r4) {
            r0 = this;
            super.showAsDropDown(r1, r2, r3, r4)
            return
    }

    @Override // android.widget.PopupWindow
    public void update(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.update(r1, r2, r3, r4, r5)
            return
    }
}
