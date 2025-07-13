package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.b0 */
/* loaded from: classes.dex */
public class C0262b0 extends android.widget.ToggleButton {

    /* renamed from: a0 */
    public final androidx.appcompat.widget.C0273f f1222a0;

    /* renamed from: b0 */
    public final androidx.appcompat.widget.C0313y f1223b0;

    public C0262b0(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842827(0x101004b, float:2.3693768E-38)
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            androidx.appcompat.widget.C0304t0.m787a(r1, r2)
            androidx.appcompat.widget.f r2 = new androidx.appcompat.widget.f
            r2.<init>(r1)
            r1.f1222a0 = r2
            r2.m714d(r3, r0)
            androidx.appcompat.widget.y r2 = new androidx.appcompat.widget.y
            r2.<init>(r1)
            r1.f1223b0 = r2
            r2.m836e(r3, r0)
            return
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.f r0 = r1.f1222a0
            if (r0 == 0) goto La
            r0.m711a()
        La:
            androidx.appcompat.widget.y r0 = r1.f1223b0
            if (r0 == 0) goto L11
            r0.m834b()
        L11:
            return
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1222a0
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
            androidx.appcompat.widget.f r0 = r1.f1222a0
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m713c()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            androidx.appcompat.widget.f r1 = r0.f1222a0
            if (r1 == 0) goto La
            r1.m715e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.f r0 = r1.f1222a0
            if (r0 == 0) goto La
            r0.m716f(r2)
        La:
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1222a0
            if (r0 == 0) goto L7
            r0.m718h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1222a0
            if (r0 == 0) goto L7
            r0.m719i(r2)
        L7:
            return
    }
}
