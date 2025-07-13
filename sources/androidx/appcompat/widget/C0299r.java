package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.r */
/* loaded from: classes.dex */
public class C0299r extends android.widget.RadioButton {

    /* renamed from: a0 */
    public final androidx.appcompat.widget.C0283j f1409a0;

    /* renamed from: b0 */
    public final androidx.appcompat.widget.C0273f f1410b0;

    /* renamed from: c0 */
    public final androidx.appcompat.widget.C0313y f1411c0;

    public C0299r(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            androidx.appcompat.widget.C0308v0.m793a(r1)
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            androidx.appcompat.widget.C0304t0.m787a(r0, r1)
            androidx.appcompat.widget.j r1 = new androidx.appcompat.widget.j
            r1.<init>(r0)
            r0.f1409a0 = r1
            r1.m731b(r2, r3)
            androidx.appcompat.widget.f r1 = new androidx.appcompat.widget.f
            r1.<init>(r0)
            r0.f1410b0 = r1
            r1.m714d(r2, r3)
            androidx.appcompat.widget.y r1 = new androidx.appcompat.widget.y
            r1.<init>(r0)
            r0.f1411c0 = r1
            r1.m836e(r2, r3)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.f r0 = r1.f1410b0
            if (r0 == 0) goto La
            r0.m711a()
        La:
            androidx.appcompat.widget.y r0 = r1.f1411c0
            if (r0 == 0) goto L11
            r0.m834b()
        L11:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
            r1 = this;
            int r0 = super.getCompoundPaddingLeft()
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1410b0
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
            androidx.appcompat.widget.f r0 = r1.f1410b0
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m713c()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.content.res.ColorStateList getSupportButtonTintList() {
            r1 = this;
            androidx.appcompat.widget.j r0 = r1.f1409a0
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.f1319b
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
            r1 = this;
            androidx.appcompat.widget.j r0 = r1.f1409a0
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.f1320c
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            androidx.appcompat.widget.f r1 = r0.f1410b0
            if (r1 == 0) goto La
            r1.m715e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.f r0 = r1.f1410b0
            if (r0 == 0) goto La
            r0.m716f(r2)
        La:
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r0, r2)
            r1.setButtonDrawable(r2)
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setButtonDrawable(r2)
            androidx.appcompat.widget.j r2 = r1.f1409a0
            if (r2 == 0) goto L15
            boolean r0 = r2.f1323f
            if (r0 == 0) goto Lf
            r0 = 0
            r2.f1323f = r0
            goto L15
        Lf:
            r0 = 1
            r2.f1323f = r0
            r2.m730a()
        L15:
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1410b0
            if (r0 == 0) goto L7
            r0.m718h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1410b0
            if (r0 == 0) goto L7
            r0.m719i(r2)
        L7:
            return
    }

    public void setSupportButtonTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.j r0 = r1.f1409a0
            if (r0 == 0) goto Lc
            r0.f1319b = r2
            r2 = 1
            r0.f1321d = r2
            r0.m730a()
        Lc:
            return
    }

    public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.j r0 = r1.f1409a0
            if (r0 == 0) goto Lc
            r0.f1320c = r2
            r2 = 1
            r0.f1322e = r2
            r0.m730a()
        Lc:
            return
    }
}
