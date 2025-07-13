package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.e */
/* loaded from: classes.dex */
public class C0270e extends android.widget.AutoCompleteTextView {

    /* renamed from: c0 */
    public static final int[] f1269c0 = null;

    /* renamed from: a0 */
    public final androidx.appcompat.widget.C0273f f1270a0;

    /* renamed from: b0 */
    public final androidx.appcompat.widget.C0313y f1271b0;

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843126(0x1010176, float:2.3694606E-38)
            r0[r1] = r2
            androidx.appcompat.widget.C0270e.f1269c0 = r0
            return
    }

    public C0270e(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130968638(0x7f04003e, float:1.7545935E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public C0270e(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            androidx.appcompat.widget.C0308v0.m793a(r3)
            r2.<init>(r3, r4, r5)
            android.content.Context r3 = r2.getContext()
            androidx.appcompat.widget.C0304t0.m787a(r2, r3)
            android.content.Context r3 = r2.getContext()
            int[] r0 = androidx.appcompat.widget.C0270e.f1269c0
            r1 = 0
            androidx.appcompat.widget.y0 r3 = androidx.appcompat.widget.C0314y0.m848r(r3, r4, r0, r5, r1)
            boolean r0 = r3.m864p(r1)
            if (r0 == 0) goto L25
            android.graphics.drawable.Drawable r0 = r3.m855g(r1)
            r2.setDropDownBackgroundDrawable(r0)
        L25:
            android.content.res.TypedArray r3 = r3.f1501b
            r3.recycle()
            androidx.appcompat.widget.f r3 = new androidx.appcompat.widget.f
            r3.<init>(r2)
            r2.f1270a0 = r3
            r3.m714d(r4, r5)
            androidx.appcompat.widget.y r3 = new androidx.appcompat.widget.y
            r3.<init>(r2)
            r2.f1271b0 = r3
            r3.m836e(r4, r5)
            r3.m834b()
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.f r0 = r1.f1270a0
            if (r0 == 0) goto La
            r0.m711a()
        La:
            androidx.appcompat.widget.y r0 = r1.f1271b0
            if (r0 == 0) goto L11
            r0.m834b()
        L11:
            return
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1270a0
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
            androidx.appcompat.widget.f r0 = r1.f1270a0
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
            androidx.appcompat.widget.f r1 = r0.f1270a0
            if (r1 == 0) goto La
            r1.m715e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.f r0 = r1.f1270a0
            if (r0 == 0) goto La
            r0.m716f(r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = p280q0.C5540g.m11823g(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
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
            androidx.appcompat.widget.f r0 = r1.f1270a0
            if (r0 == 0) goto L7
            r0.m718h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.f r0 = r1.f1270a0
            if (r0 == 0) goto L7
            r0.m719i(r2)
        L7:
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            androidx.appcompat.widget.y r0 = r1.f1271b0
            if (r0 == 0) goto La
            r0.m837f(r2, r3)
        La:
            return
    }
}
