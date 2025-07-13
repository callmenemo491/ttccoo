package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.b */
/* loaded from: classes.dex */
public class C0261b extends android.graphics.drawable.Drawable {

    /* renamed from: a */
    public final androidx.appcompat.widget.ActionBarContainer f1221a;

    public C0261b(androidx.appcompat.widget.ActionBarContainer r1) {
            r0 = this;
            r0.<init>()
            r0.f1221a = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r3) {
            r2 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f1221a
            boolean r1 = r0.f910h0
            if (r1 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r0.f909g0
            if (r0 == 0) goto L22
            r0.draw(r3)
            goto L22
        Le:
            android.graphics.drawable.Drawable r0 = r0.f907e0
            if (r0 == 0) goto L15
            r0.draw(r3)
        L15:
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f1221a
            android.graphics.drawable.Drawable r1 = r0.f908f0
            if (r1 == 0) goto L22
            boolean r0 = r0.f911i0
            if (r0 == 0) goto L22
            r1.draw(r3)
        L22:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r3) {
            r2 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f1221a
            boolean r1 = r0.f910h0
            if (r1 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r0.f909g0
            if (r0 == 0) goto L12
            goto Lf
        Lb:
            android.graphics.drawable.Drawable r0 = r0.f907e0
            if (r0 == 0) goto L12
        Lf:
            r0.getOutline(r3)
        L12:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r1) {
            r0 = this;
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            return
    }
}
