package p355u8;

/* renamed from: u8.d */
/* loaded from: classes.dex */
public class C6363d extends android.widget.FrameLayout {

    /* renamed from: h0 */
    public static final android.view.View.OnTouchListener f24822h0 = null;

    /* renamed from: a0 */
    public p355u8.InterfaceC6362c f24823a0;

    /* renamed from: b0 */
    public p355u8.InterfaceC6361b f24824b0;

    /* renamed from: c0 */
    public int f24825c0;

    /* renamed from: d0 */
    public final float f24826d0;

    /* renamed from: e0 */
    public final float f24827e0;

    /* renamed from: f0 */
    public android.content.res.ColorStateList f24828f0;

    /* renamed from: g0 */
    public android.graphics.PorterDuff.Mode f24829g0;

    /* renamed from: u8.d$a */
    public static class a implements android.view.View.OnTouchListener {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        @android.annotation.SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(android.view.View r1, android.view.MotionEvent r2) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    static {
            u8.d$a r0 = new u8.d$a
            r0.<init>()
            p355u8.C6363d.f24822h0 = r0
            return
    }

    public C6363d(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            android.content.Context r4 = p431y8.C7133a.m14245a(r4, r5, r0, r0)
            r3.<init>(r4, r5)
            android.content.Context r4 = r3.getContext()
            int[] r1 = p339t7.C6183a.f23997J
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1)
            r1 = 6
            boolean r2 = r5.hasValue(r1)
            if (r2 == 0) goto L23
            int r1 = r5.getDimensionPixelSize(r1, r0)
            float r1 = (float) r1
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            p227n0.C4661t.h.m10614s(r3, r1)
        L23:
            r1 = 2
            int r1 = r5.getInt(r1, r0)
            r3.f24825c0 = r1
            r1 = 3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r5.getFloat(r1, r2)
            r3.f24826d0 = r1
            r1 = 4
            android.content.res.ColorStateList r4 = p288q8.C5599c.m11875a(r4, r5, r1)
            r3.setBackgroundTintList(r4)
            r4 = 5
            r1 = -1
            int r4 = r5.getInt(r4, r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r4 = p220m8.C4430n.m9887e(r4, r1)
            r3.setBackgroundTintMode(r4)
            r4 = 1
            float r1 = r5.getFloat(r4, r2)
            r3.f24827e0 = r1
            r5.recycle()
            android.view.View$OnTouchListener r5 = p355u8.C6363d.f24822h0
            r3.setOnTouchListener(r5)
            r3.setFocusable(r4)
            android.graphics.drawable.Drawable r4 = r3.getBackground()
            if (r4 != 0) goto La8
            android.content.res.Resources r4 = r3.getResources()
            r5 = 2131165639(0x7f0701c7, float:1.79455E38)
            float r4 = r4.getDimension(r5)
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            r5.setShape(r0)
            r5.setCornerRadius(r4)
            float r4 = r3.getBackgroundOverlayColorAlpha()
            r0 = 2130968838(0x7f040106, float:1.754634E38)
            int r0 = p124h7.C2939x3.m7286l(r3, r0)
            r1 = 2130968830(0x7f0400fe, float:1.7546325E38)
            int r1 = p124h7.C2939x3.m7286l(r3, r1)
            int r4 = p124h7.C2939x3.m7288n(r0, r1, r4)
            r5.setColor(r4)
            android.content.res.ColorStateList r4 = r3.f24828f0
            if (r4 == 0) goto L9f
            android.graphics.drawable.Drawable r4 = p103g0.C2200a.m5792h(r5)
            android.content.res.ColorStateList r5 = r3.f24828f0
            r4.setTintList(r5)
            goto La3
        L9f:
            android.graphics.drawable.Drawable r4 = p103g0.C2200a.m5792h(r5)
        La3:
            java.util.WeakHashMap<android.view.View, n0.w> r5 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10569q(r3, r4)
        La8:
            return
    }

    public float getActionTextColorAlpha() {
            r1 = this;
            float r0 = r1.f24827e0
            return r0
    }

    public int getAnimationMode() {
            r1 = this;
            int r0 = r1.f24825c0
            return r0
    }

    public float getBackgroundOverlayColorAlpha() {
            r1 = this;
            float r0 = r1.f24826d0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            u8.b r0 = r1.f24824b0
            if (r0 == 0) goto La
            r0.onViewAttachedToWindow(r1)
        La:
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            p227n0.C4661t.g.m10595c(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            u8.b r0 = r1.f24824b0
            if (r0 == 0) goto La
            r0.onViewDetachedFromWindow(r1)
        La:
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            u8.c r0 = r6.f24823a0
            if (r0 == 0) goto Lf
            r1 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.m13014a(r1, r2, r3, r4, r5)
        Lf:
            return
    }

    public void setAnimationMode(int r1) {
            r0 = this;
            r0.f24825c0 = r1
            return
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.setBackgroundDrawable(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L18
            android.content.res.ColorStateList r0 = r1.f24828f0
            if (r0 == 0) goto L18
            android.graphics.drawable.Drawable r2 = r2.mutate()
            android.graphics.drawable.Drawable r2 = p103g0.C2200a.m5792h(r2)
            android.content.res.ColorStateList r0 = r1.f24828f0
            r2.setTintList(r0)
            android.graphics.PorterDuff$Mode r0 = r1.f24829g0
            r2.setTintMode(r0)
        L18:
            super.setBackgroundDrawable(r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.f24828f0 = r2
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            if (r0 == 0) goto L25
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.Drawable r0 = p103g0.C2200a.m5792h(r0)
            r0.setTintList(r2)
            android.graphics.PorterDuff$Mode r2 = r1.f24829g0
            r0.setTintMode(r2)
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            if (r0 == r2) goto L25
            super.setBackgroundDrawable(r0)
        L25:
            return
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.f24829g0 = r2
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            if (r0 == 0) goto L20
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.Drawable r0 = p103g0.C2200a.m5792h(r0)
            r0.setTintMode(r2)
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            if (r0 == r2) goto L20
            super.setBackgroundDrawable(r0)
        L20:
            return
    }

    public void setOnAttachStateChangeListener(p355u8.InterfaceC6361b r1) {
            r0 = this;
            r0.f24824b0 = r1
            return
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 0
            goto L6
        L4:
            android.view.View$OnTouchListener r0 = p355u8.C6363d.f24822h0
        L6:
            r1.setOnTouchListener(r0)
            super.setOnClickListener(r2)
            return
    }

    public void setOnLayoutChangeListener(p355u8.InterfaceC6362c r1) {
            r0 = this;
            r0.f24823a0 = r1
            return
    }
}
