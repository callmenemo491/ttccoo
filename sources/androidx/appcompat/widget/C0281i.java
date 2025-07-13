package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.i */
/* loaded from: classes.dex */
public class C0281i extends android.widget.CheckedTextView {

    /* renamed from: b0 */
    public static final int[] f1315b0 = null;

    /* renamed from: a0 */
    public final androidx.appcompat.widget.C0313y f1316a0;

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843016(0x1010108, float:2.3694298E-38)
            r0[r1] = r2
            androidx.appcompat.widget.C0281i.f1315b0 = r0
            return
    }

    public C0281i(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            androidx.appcompat.widget.C0308v0.m793a(r4)
            r0 = 16843720(0x10103c8, float:2.369627E-38)
            r3.<init>(r4, r5, r0)
            android.content.Context r4 = r3.getContext()
            androidx.appcompat.widget.C0304t0.m787a(r3, r4)
            androidx.appcompat.widget.y r4 = new androidx.appcompat.widget.y
            r4.<init>(r3)
            r3.f1316a0 = r4
            r4.m836e(r5, r0)
            r4.m834b()
            android.content.Context r4 = r3.getContext()
            int[] r1 = androidx.appcompat.widget.C0281i.f1315b0
            r2 = 0
            androidx.appcompat.widget.y0 r4 = androidx.appcompat.widget.C0314y0.m848r(r4, r5, r1, r0, r2)
            android.graphics.drawable.Drawable r5 = r4.m855g(r2)
            r3.setCheckMarkDrawable(r5)
            android.content.res.TypedArray r4 = r4.f1501b
            r4.recycle()
            return
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.y r0 = r1.f1316a0
            if (r0 == 0) goto La
            r0.m834b()
        La:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r2)
            p064e.C1487a.m4030h(r0, r2, r1)
            return r0
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r0, r2)
            r1.setCheckMarkDrawable(r2)
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = p280q0.C5540g.m11823g(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            androidx.appcompat.widget.y r0 = r1.f1316a0
            if (r0 == 0) goto La
            r0.m837f(r2, r3)
        La:
            return
    }
}
