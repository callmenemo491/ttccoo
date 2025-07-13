package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.m */
/* loaded from: classes.dex */
public class C0289m extends android.widget.ImageButton {

    /* renamed from: a0 */
    public final androidx.appcompat.widget.C0273f f1376a0;

    /* renamed from: b0 */
    public final androidx.appcompat.widget.C0291n f1377b0;

    public C0289m(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130969078(0x7f0401f6, float:1.7546828E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public C0289m(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            androidx.appcompat.widget.C0308v0.m793a(r1)
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            androidx.appcompat.widget.C0304t0.m787a(r0, r1)
            androidx.appcompat.widget.f r1 = new androidx.appcompat.widget.f
            r1.<init>(r0)
            r0.f1376a0 = r1
            r1.m714d(r2, r3)
            androidx.appcompat.widget.n r1 = new androidx.appcompat.widget.n
            r1.<init>(r0)
            r0.f1377b0 = r1
            r1.m769b(r2, r3)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.f r0 = r1.f1376a0
            if (r0 == 0) goto La
            r0.m711a()
        La:
            androidx.appcompat.widget.n r0 = r1.f1377b0
            if (r0 == 0) goto L11
            r0.m768a()
        L11:
            return
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1376a0
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m712b()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1376a0
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m713c()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.content.res.ColorStateList getSupportImageTintList() {
            r1 = this;
            androidx.appcompat.widget.n r0 = r1.f1377b0
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.w0 r0 = r0.f1389b
            if (r0 == 0) goto Lb
            android.content.res.ColorStateList r0 = r0.f1475a
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r1 = this;
            androidx.appcompat.widget.n r0 = r1.f1377b0
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.w0 r0 = r0.f1389b
            if (r0 == 0) goto Lb
            android.graphics.PorterDuff$Mode r0 = r0.f1476b
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
            r2 = this;
            androidx.appcompat.widget.n r0 = r2.f1377b0
            android.widget.ImageView r0 = r0.f1388a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L15
            boolean r0 = super.hasOverlappingRendering()
            if (r0 == 0) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            androidx.appcompat.widget.f r1 = r0.f1376a0
            if (r1 == 0) goto La
            r1.m715e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.f r0 = r1.f1376a0
            if (r0 == 0) goto La
            r0.m716f(r2)
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            super.setImageBitmap(r1)
            androidx.appcompat.widget.n r1 = r0.f1377b0
            if (r1 == 0) goto La
            r1.m768a()
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setImageDrawable(r1)
            androidx.appcompat.widget.n r1 = r0.f1377b0
            if (r1 == 0) goto La
            r1.m768a()
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r2) {
            r1 = this;
            androidx.appcompat.widget.n r0 = r1.f1377b0
            r0.m770c(r2)
            return
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri r1) {
            r0 = this;
            super.setImageURI(r1)
            androidx.appcompat.widget.n r1 = r0.f1377b0
            if (r1 == 0) goto La
            r1.m768a()
        La:
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1376a0
            if (r0 == 0) goto L7
            r0.m718h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1376a0
            if (r0 == 0) goto L7
            r0.m719i(r2)
        L7:
            return
    }

    public void setSupportImageTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.n r0 = r1.f1377b0
            if (r0 == 0) goto L7
            r0.m771d(r2)
        L7:
            return
    }

    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.n r0 = r1.f1377b0
            if (r0 == 0) goto L7
            r0.m772e(r2)
        L7:
            return
    }
}
