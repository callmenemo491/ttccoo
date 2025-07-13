package androidx.browser.browseractions;

@java.lang.Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends android.widget.LinearLayout {

    /* renamed from: a0 */
    public final int f1508a0;

    /* renamed from: b0 */
    public final int f1509b0;

    public BrowserActionsFallbackMenuView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131165269(0x7f070055, float:1.794475E38)
            int r1 = r1.getDimensionPixelOffset(r2)
            r0.f1508a0 = r1
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131165268(0x7f070054, float:1.7944748E38)
            int r1 = r1.getDimensionPixelOffset(r2)
            r0.f1509b0 = r1
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int r2, int r3) {
            r1 = this;
            android.content.res.Resources r2 = r1.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            int r0 = r1.f1508a0
            int r0 = r0 * 2
            int r2 = r2 - r0
            int r0 = r1.f1509b0
            int r2 = java.lang.Math.min(r2, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            super.onMeasure(r2, r3)
            return
    }
}
