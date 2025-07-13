package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends android.widget.FrameLayout {

    /* renamed from: a0 */
    public androidx.appcompat.widget.InterfaceC0277g0 f995a0;

    public FitWindowsFrameLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.View
    public boolean fitSystemWindows(android.graphics.Rect r2) {
            r1 = this;
            androidx.appcompat.widget.g0 r0 = r1.f995a0
            if (r0 == 0) goto L7
            r0.m727a(r2)
        L7:
            boolean r2 = super.fitSystemWindows(r2)
            return r2
    }

    public void setOnFitSystemWindowsListener(androidx.appcompat.widget.InterfaceC0277g0 r1) {
            r0 = this;
            r0.f995a0 = r1
            return
    }
}
