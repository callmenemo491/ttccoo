package p220m8;

/* renamed from: m8.f */
/* loaded from: classes.dex */
public class C4422f extends androidx.appcompat.widget.LinearLayoutCompat {

    /* renamed from: p0 */
    public android.graphics.drawable.Drawable f18046p0;

    /* renamed from: q0 */
    public final android.graphics.Rect f18047q0;

    /* renamed from: r0 */
    public final android.graphics.Rect f18048r0;

    /* renamed from: s0 */
    public int f18049s0;

    /* renamed from: t0 */
    public boolean f18050t0;

    /* renamed from: u0 */
    public boolean f18051u0;

    public C4422f(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public C4422f(android.content.Context r10, android.util.AttributeSet r11, int r12) {
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f18047q0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f18048r0 = r0
            r0 = 119(0x77, float:1.67E-43)
            r9.f18049s0 = r0
            r0 = 1
            r9.f18050t0 = r0
            r1 = 0
            r9.f18051u0 = r1
            int[] r8 = p339t7.C6183a.f24019p
            int[] r7 = new int[r1]
            p220m8.C4429m.m9878a(r10, r11, r12, r1)
            r6 = 0
            r2 = r10
            r3 = r11
            r4 = r8
            r5 = r12
            p220m8.C4429m.m9879b(r2, r3, r4, r5, r6, r7)
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r8, r12, r1)
            int r11 = r9.f18049s0
            int r11 = r10.getInt(r0, r11)
            r9.f18049s0 = r11
            android.graphics.drawable.Drawable r11 = r10.getDrawable(r1)
            if (r11 == 0) goto L3f
            r9.setForeground(r11)
        L3f:
            r11 = 2
            boolean r11 = r10.getBoolean(r11, r0)
            r9.f18050t0 = r11
            r10.recycle()
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r9) {
            r8 = this;
            super.draw(r9)
            android.graphics.drawable.Drawable r0 = r8.f18046p0
            if (r0 == 0) goto L54
            boolean r1 = r8.f18051u0
            if (r1 == 0) goto L51
            r1 = 0
            r8.f18051u0 = r1
            android.graphics.Rect r2 = r8.f18047q0
            android.graphics.Rect r3 = r8.f18048r0
            int r4 = r8.getRight()
            int r5 = r8.getLeft()
            int r4 = r4 - r5
            int r5 = r8.getBottom()
            int r6 = r8.getTop()
            int r5 = r5 - r6
            boolean r6 = r8.f18050t0
            if (r6 == 0) goto L2c
            r2.set(r1, r1, r4, r5)
            goto L41
        L2c:
            int r1 = r8.getPaddingLeft()
            int r6 = r8.getPaddingTop()
            int r7 = r8.getPaddingRight()
            int r4 = r4 - r7
            int r7 = r8.getPaddingBottom()
            int r5 = r5 - r7
            r2.set(r1, r6, r4, r5)
        L41:
            int r1 = r8.f18049s0
            int r4 = r0.getIntrinsicWidth()
            int r5 = r0.getIntrinsicHeight()
            android.view.Gravity.apply(r1, r4, r5, r2, r3)
            r0.setBounds(r3)
        L51:
            r0.draw(r9)
        L54:
            return
    }

    @Override // android.view.View
    @android.annotation.TargetApi(21)
    public void drawableHotspotChanged(float r2, float r3) {
            r1 = this;
            super.drawableHotspotChanged(r2, r3)
            android.graphics.drawable.Drawable r0 = r1.f18046p0
            if (r0 == 0) goto La
            r0.setHotspot(r2, r3)
        La:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            android.graphics.drawable.Drawable r0 = r2.f18046p0
            if (r0 == 0) goto L16
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L16
            android.graphics.drawable.Drawable r0 = r2.f18046p0
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L16:
            return
    }

    @Override // android.view.View
    public android.graphics.drawable.Drawable getForeground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f18046p0
            return r0
    }

    @Override // android.view.View
    public int getForegroundGravity() {
            r1 = this;
            int r0 = r1.f18049s0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.f18046p0
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            boolean r2 = r0.f18051u0
            r1 = r1 | r2
            r0.f18051u0 = r1
            return
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r1 = 1
            r0.f18051u0 = r1
            return
    }

    @Override // android.view.View
    public void setForeground(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f18046p0
            if (r0 == r3) goto L40
            if (r0 == 0) goto Lf
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r2.f18046p0
            r2.unscheduleDrawable(r0)
        Lf:
            r2.f18046p0 = r3
            if (r3 == 0) goto L36
            r0 = 0
            r2.setWillNotDraw(r0)
            r3.setCallback(r2)
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L27
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L27:
            int r0 = r2.f18049s0
            r1 = 119(0x77, float:1.67E-43)
            if (r0 != r1) goto L3a
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.getPadding(r0)
            goto L3a
        L36:
            r3 = 1
            r2.setWillNotDraw(r3)
        L3a:
            r2.requestLayout()
            r2.invalidate()
        L40:
            return
    }

    @Override // android.view.View
    public void setForegroundGravity(int r2) {
            r1 = this;
            int r0 = r1.f18049s0
            if (r0 == r2) goto L2b
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r2
            if (r0 != 0) goto Le
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r2 = r2 | r0
        Le:
            r0 = r2 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L14
            r2 = r2 | 48
        L14:
            r1.f18049s0 = r2
            r0 = 119(0x77, float:1.67E-43)
            if (r2 != r0) goto L28
            android.graphics.drawable.Drawable r2 = r1.f18046p0
            if (r2 == 0) goto L28
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.drawable.Drawable r0 = r1.f18046p0
            r0.getPadding(r2)
        L28:
            r1.requestLayout()
        L2b:
            return
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.f18046p0
            if (r2 != r0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }
}
