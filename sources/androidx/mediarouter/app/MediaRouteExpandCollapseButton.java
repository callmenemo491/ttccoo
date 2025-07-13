package androidx.mediarouter.app;

/* loaded from: classes.dex */
class MediaRouteExpandCollapseButton extends androidx.appcompat.widget.C0289m {

    /* renamed from: c0 */
    public final android.graphics.drawable.AnimationDrawable f2592c0;

    /* renamed from: d0 */
    public final android.graphics.drawable.AnimationDrawable f2593d0;

    /* renamed from: e0 */
    public final java.lang.String f2594e0;

    /* renamed from: f0 */
    public final java.lang.String f2595f0;

    /* renamed from: g0 */
    public boolean f2596g0;

    /* renamed from: h0 */
    public android.view.View.OnClickListener f2597h0;

    public MediaRouteExpandCollapseButton(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            r0 = 0
            r5.<init>(r6, r7, r0)
            java.lang.Object r7 = p046d0.C1259a.f6733a
            r7 = 2131231316(0x7f080254, float:1.807871E38)
            android.graphics.drawable.Drawable r7 = p046d0.C1259a.b.m3710b(r6, r7)
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            r5.f2592c0 = r7
            r1 = 2131231315(0x7f080253, float:1.8078708E38)
            android.graphics.drawable.Drawable r1 = p046d0.C1259a.b.m3710b(r6, r1)
            android.graphics.drawable.AnimationDrawable r1 = (android.graphics.drawable.AnimationDrawable) r1
            r5.f2593d0 = r1
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            int r3 = androidx.mediarouter.app.C0498r.m1551c(r6, r0)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r4)
            r7.setColorFilter(r2)
            r1.setColorFilter(r2)
            r1 = 2131951890(0x7f130112, float:1.9540207E38)
            java.lang.String r1 = r6.getString(r1)
            r5.f2594e0 = r1
            r2 = 2131951888(0x7f130110, float:1.9540203E38)
            java.lang.String r6 = r6.getString(r2)
            r5.f2595f0 = r6
            android.graphics.drawable.Drawable r6 = r7.getFrame(r0)
            r5.setImageDrawable(r6)
            r5.setContentDescription(r1)
            androidx.mediarouter.app.q r6 = new androidx.mediarouter.app.q
            r6.<init>(r5)
            super.setOnClickListener(r6)
            return
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.f2597h0 = r1
            return
    }
}
