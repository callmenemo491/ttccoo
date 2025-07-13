package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.o */
/* loaded from: classes.dex */
public class C0293o extends android.widget.MultiAutoCompleteTextView {

    /* renamed from: c0 */
    public static final int[] f1391c0 = null;

    /* renamed from: a0 */
    public final androidx.appcompat.widget.C0273f f1392a0;

    /* renamed from: b0 */
    public final androidx.appcompat.widget.C0313y f1393b0;

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843126(0x1010176, float:2.3694606E-38)
            r0[r1] = r2
            androidx.appcompat.widget.C0293o.f1391c0 = r0
            return
    }

    public C0293o(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            androidx.appcompat.widget.C0308v0.m793a(r4)
            r0 = 2130968638(0x7f04003e, float:1.7545935E38)
            r3.<init>(r4, r5, r0)
            android.content.Context r4 = r3.getContext()
            androidx.appcompat.widget.C0304t0.m787a(r3, r4)
            android.content.Context r4 = r3.getContext()
            int[] r1 = androidx.appcompat.widget.C0293o.f1391c0
            r2 = 0
            androidx.appcompat.widget.y0 r4 = androidx.appcompat.widget.C0314y0.m848r(r4, r5, r1, r0, r2)
            boolean r1 = r4.m864p(r2)
            if (r1 == 0) goto L28
            android.graphics.drawable.Drawable r1 = r4.m855g(r2)
            r3.setDropDownBackgroundDrawable(r1)
        L28:
            android.content.res.TypedArray r4 = r4.f1501b
            r4.recycle()
            androidx.appcompat.widget.f r4 = new androidx.appcompat.widget.f
            r4.<init>(r3)
            r3.f1392a0 = r4
            r4.m714d(r5, r0)
            androidx.appcompat.widget.y r4 = new androidx.appcompat.widget.y
            r4.<init>(r3)
            r3.f1393b0 = r4
            r4.m836e(r5, r0)
            r4.m834b()
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.f r0 = r1.f1392a0
            if (r0 == 0) goto La
            r0.m711a()
        La:
            androidx.appcompat.widget.y r0 = r1.f1393b0
            if (r0 == 0) goto L11
            r0.m834b()
        L11:
            return
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1392a0
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
            androidx.appcompat.widget.f r0 = r1.f1392a0
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m713c()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r2)
            p064e.C1487a.m4030h(r0, r2, r1)
            return r0
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            androidx.appcompat.widget.f r1 = r0.f1392a0
            if (r1 == 0) goto La
            r1.m715e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.f r0 = r1.f1392a0
            if (r0 == 0) goto La
            r0.m716f(r2)
        La:
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r0, r2)
            r1.setDropDownBackgroundDrawable(r2)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1392a0
            if (r0 == 0) goto L7
            r0.m718h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1392a0
            if (r0 == 0) goto L7
            r0.m719i(r2)
        L7:
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            androidx.appcompat.widget.y r0 = r1.f1393b0
            if (r0 == 0) goto La
            r0.m837f(r2, r3)
        La:
            return
    }
}
