package p301r1;

/* renamed from: r1.a */
/* loaded from: classes.dex */
public class C5761a extends android.widget.ImageView {

    /* renamed from: a0 */
    public android.view.animation.Animation.AnimationListener f22181a0;

    /* renamed from: b0 */
    public int f22182b0;

    public C5761a(android.content.Context r4) {
            r3 = this;
            r3.<init>(r4)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            android.content.Context r0 = r3.getContext()
            int[] r1 = p281q1.C5543a.f21582a
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            r2 = -328966(0xfffffffffffafafa, float:NaN)
            int r1 = r0.getColor(r1, r2)
            r3.f22182b0 = r1
            r0.recycle()
            android.graphics.drawable.ShapeDrawable r0 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.OvalShape r1 = new android.graphics.drawable.shapes.OvalShape
            r1.<init>()
            r0.<init>(r1)
            r1 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 * r1
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            p227n0.C4661t.h.m10614s(r3, r4)
            android.graphics.Paint r4 = r0.getPaint()
            int r1 = r3.f22182b0
            r4.setColor(r1)
            p227n0.C4661t.c.m10569q(r3, r0)
            return
    }

    @Override // android.view.View
    public void onAnimationEnd() {
            r2 = this;
            super.onAnimationEnd()
            android.view.animation.Animation$AnimationListener r0 = r2.f22181a0
            if (r0 == 0) goto Le
            android.view.animation.Animation r1 = r2.getAnimation()
            r0.onAnimationEnd(r1)
        Le:
            return
    }

    @Override // android.view.View
    public void onAnimationStart() {
            r2 = this;
            super.onAnimationStart()
            android.view.animation.Animation$AnimationListener r0 = r2.f22181a0
            if (r0 == 0) goto Le
            android.view.animation.Animation r1 = r2.getAnimation()
            r0.onAnimationStart(r1)
        Le:
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ShapeDrawable
            if (r0 == 0) goto L17
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            android.graphics.drawable.ShapeDrawable r0 = (android.graphics.drawable.ShapeDrawable) r0
            android.graphics.Paint r0 = r0.getPaint()
            r0.setColor(r2)
            r1.f22182b0 = r2
        L17:
            return
    }
}
