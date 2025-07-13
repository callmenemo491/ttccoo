package androidx.mediarouter.app;

/* loaded from: classes.dex */
class MediaRouteVolumeSlider extends androidx.appcompat.widget.AppCompatSeekBar {

    /* renamed from: b0 */
    public final float f2598b0;

    /* renamed from: c0 */
    public boolean f2599c0;

    /* renamed from: d0 */
    public android.graphics.drawable.Drawable f2600d0;

    /* renamed from: e0 */
    public int f2601e0;

    /* renamed from: f0 */
    public int f2602f0;

    public MediaRouteVolumeSlider(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130969421(0x7f04034d, float:1.7547523E38)
            r1.<init>(r2, r3, r0)
            float r2 = androidx.mediarouter.app.C0498r.m1552d(r2)
            r1.f2598b0 = r2
            return
    }

    /* renamed from: a */
    public void m1476a(int r5, int r6) {
            r4 = this;
            int r0 = r4.f2601e0
            java.lang.String r1 = "MediaRouteVolumeSlider"
            r2 = 255(0xff, float:3.57E-43)
            if (r0 == r5) goto L24
            int r0 = android.graphics.Color.alpha(r5)
            if (r0 == r2) goto L22
            java.lang.String r0 = "Volume slider progress and thumb color cannot be translucent: #"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r3 = java.lang.Integer.toHexString(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
        L22:
            r4.f2601e0 = r5
        L24:
            int r5 = r4.f2602f0
            if (r5 == r6) goto L44
            int r5 = android.graphics.Color.alpha(r6)
            if (r5 == r2) goto L42
            java.lang.String r5 = "Volume slider background color cannot be translucent: #"
            java.lang.StringBuilder r5 = android.support.v4.media.C0144c.m256a(r5)
            java.lang.String r0 = java.lang.Integer.toHexString(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r1, r5)
        L42:
            r4.f2602f0 = r6
        L44:
            return
    }

    /* renamed from: b */
    public void m1477b(boolean r2) {
            r1 = this;
            boolean r0 = r1.f2599c0
            if (r0 != r2) goto L5
            return
        L5:
            r1.f2599c0 = r2
            if (r2 == 0) goto Lb
            r2 = 0
            goto Ld
        Lb:
            android.graphics.drawable.Drawable r2 = r1.f2600d0
        Ld:
            super.setThumb(r2)
            return
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
            r5 = this;
            super.drawableStateChanged()
            boolean r0 = r5.isEnabled()
            if (r0 == 0) goto Lc
            r0 = 255(0xff, float:3.57E-43)
            goto L13
        Lc:
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r5.f2598b0
            float r1 = r1 * r0
            int r0 = (int) r1
        L13:
            android.graphics.drawable.Drawable r1 = r5.f2600d0
            int r2 = r5.f2601e0
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.setColorFilter(r2, r3)
            android.graphics.drawable.Drawable r1 = r5.f2600d0
            r1.setAlpha(r0)
            android.graphics.drawable.Drawable r1 = r5.getProgressDrawable()
            boolean r2 = r1 instanceof android.graphics.drawable.LayerDrawable
            if (r2 == 0) goto L44
            android.graphics.drawable.Drawable r1 = r5.getProgressDrawable()
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1
            r2 = 16908301(0x102000d, float:2.3877265E-38)
            android.graphics.drawable.Drawable r2 = r1.findDrawableByLayerId(r2)
            r3 = 16908288(0x1020000, float:2.387723E-38)
            android.graphics.drawable.Drawable r1 = r1.findDrawableByLayerId(r3)
            int r3 = r5.f2602f0
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.setColorFilter(r3, r4)
            r1 = r2
        L44:
            int r2 = r5.f2601e0
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.setColorFilter(r2, r3)
            r1.setAlpha(r0)
            return
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.f2600d0 = r2
            boolean r0 = r1.f2599c0
            if (r0 == 0) goto L7
            r2 = 0
        L7:
            super.setThumb(r2)
            return
    }
}
