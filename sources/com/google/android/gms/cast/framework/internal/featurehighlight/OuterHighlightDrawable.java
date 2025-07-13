package com.google.android.gms.cast.framework.internal.featurehighlight;

/* loaded from: classes.dex */
class OuterHighlightDrawable extends android.graphics.drawable.Drawable {

    /* renamed from: a */
    public float f5453a;

    /* renamed from: b */
    public float f5454b;

    /* renamed from: c */
    public float f5455c;

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r5) {
            r4 = this;
            float r0 = r4.f5454b
            r1 = 0
            float r0 = r0 + r1
            float r2 = r4.f5455c
            float r2 = r2 + r1
            float r3 = r4.f5453a
            float r1 = r1 * r3
            r3 = 0
            r5.drawCircle(r0, r2, r1, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
            r1 = this;
            r0 = 0
            throw r0
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
    public void setScale(float r1) {
            r0 = this;
            r0.f5453a = r1
            r0.invalidateSelf()
            return
    }

    @androidx.annotation.Keep
    public void setTranslationX(float r1) {
            r0 = this;
            r0.f5454b = r1
            r0.invalidateSelf()
            return
    }

    @androidx.annotation.Keep
    public void setTranslationY(float r1) {
            r0 = this;
            r0.f5455c = r1
            r0.invalidateSelf()
            return
    }
}
