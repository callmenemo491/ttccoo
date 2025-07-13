package com.google.android.gms.cast.framework.internal.featurehighlight;

/* loaded from: classes.dex */
class InnerZoneDrawable extends android.graphics.drawable.Drawable {

    /* renamed from: a */
    public float f5451a;

    /* renamed from: b */
    public float f5452b;

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r4) {
            r3 = this;
            float r0 = r3.f5452b
            r1 = 0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L10
            float r0 = r3.f5451a
            float r0 = r0 * r2
            r4.drawCircle(r2, r2, r0, r1)
            return
        L10:
            throw r1
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @androidx.annotation.Keep
    public void setPulseAlpha(float r1) {
            r0 = this;
            r0.f5452b = r1
            r0.invalidateSelf()
            return
    }

    @androidx.annotation.Keep
    public void setPulseScale(float r1) {
            r0 = this;
            r0.invalidateSelf()
            return
    }

    @androidx.annotation.Keep
    public void setScale(float r1) {
            r0 = this;
            r0.f5451a = r1
            r0.invalidateSelf()
            return
    }
}
