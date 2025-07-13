package p103g0;

/* renamed from: g0.d */
/* loaded from: classes.dex */
public class C2203d extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback, p103g0.InterfaceC2202c, p103g0.InterfaceC2201b {

    /* renamed from: e0 */
    public static final android.graphics.PorterDuff.Mode f10087e0 = null;

    /* renamed from: Y */
    public int f10088Y;

    /* renamed from: Z */
    public android.graphics.PorterDuff.Mode f10089Z;

    /* renamed from: a0 */
    public boolean f10090a0;

    /* renamed from: b0 */
    public p103g0.C2205f f10091b0;

    /* renamed from: c0 */
    public boolean f10092c0;

    /* renamed from: d0 */
    public android.graphics.drawable.Drawable f10093d0;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            p103g0.C2203d.f10087e0 = r0
            return
    }

    public C2203d(android.graphics.drawable.Drawable r3) {
            r2 = this;
            r2.<init>()
            g0.f r0 = new g0.f
            g0.f r1 = r2.f10091b0
            r0.<init>(r1)
            r2.f10091b0 = r0
            r2.mo5793a(r3)
            return
    }

    public C2203d(p103g0.C2205f r1, android.content.res.Resources r2) {
            r0 = this;
            r0.<init>()
            r0.f10091b0 = r1
            if (r1 == 0) goto L12
            android.graphics.drawable.Drawable$ConstantState r1 = r1.f10096b
            if (r1 == 0) goto L12
            android.graphics.drawable.Drawable r1 = r1.newDrawable(r2)
            r0.mo5793a(r1)
        L12:
            return
    }

    @Override // p103g0.InterfaceC2202c
    /* renamed from: a */
    public final void mo5793a(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f10093d0
            if (r0 == 0) goto L8
            r1 = 0
            r0.setCallback(r1)
        L8:
            r2.f10093d0 = r3
            if (r3 == 0) goto L36
            r3.setCallback(r2)
            boolean r0 = r3.isVisible()
            r1 = 1
            r2.setVisible(r0, r1)
            int[] r0 = r3.getState()
            r2.setState(r0)
            int r0 = r3.getLevel()
            r2.setLevel(r0)
            android.graphics.Rect r0 = r3.getBounds()
            r2.setBounds(r0)
            g0.f r0 = r2.f10091b0
            if (r0 == 0) goto L36
            android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
            r0.f10096b = r3
        L36:
            r2.invalidateSelf()
            return
    }

    @Override // p103g0.InterfaceC2202c
    /* renamed from: b */
    public final android.graphics.drawable.Drawable mo5794b() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            return r0
    }

    /* renamed from: c */
    public boolean mo5795c() {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: d */
    public final boolean m5796d(int[] r5) {
            r4 = this;
            boolean r0 = r4.mo5795c()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            g0.f r0 = r4.f10091b0
            android.content.res.ColorStateList r2 = r0.f10097c
            android.graphics.PorterDuff$Mode r0 = r0.f10098d
            if (r2 == 0) goto L31
            if (r0 == 0) goto L31
            int r3 = r2.getDefaultColor()
            int r5 = r2.getColorForState(r5, r3)
            boolean r2 = r4.f10090a0
            if (r2 == 0) goto L26
            int r2 = r4.f10088Y
            if (r5 != r2) goto L26
            android.graphics.PorterDuff$Mode r2 = r4.f10089Z
            if (r0 == r2) goto L36
        L26:
            r4.setColorFilter(r5, r0)
            r4.f10088Y = r5
            r4.f10089Z = r0
            r5 = 1
            r4.f10090a0 = r5
            return r5
        L31:
            r4.f10090a0 = r1
            r4.clearColorFilter()
        L36:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            r0.draw(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            int r0 = super.getChangingConfigurations()
            g0.f r1 = r2.f10091b0
            if (r1 == 0) goto Ld
            int r1 = r1.getChangingConfigurations()
            goto Le
        Ld:
            r1 = 0
        Le:
            r0 = r0 | r1
            android.graphics.drawable.Drawable r1 = r2.f10093d0
            int r1 = r1.getChangingConfigurations()
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            g0.f r0 = r2.f10091b0
            if (r0 == 0) goto L16
            android.graphics.drawable.Drawable$ConstantState r1 = r0.f10096b
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == 0) goto L16
            int r1 = r2.getChangingConfigurations()
            r0.f10095a = r1
            g0.f r0 = r2.f10091b0
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            android.graphics.drawable.Drawable r0 = r0.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            int r0 = r0.getIntrinsicHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            int r0 = r0.getIntrinsicWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            int r0 = p103g0.C2200a.m5786b(r0)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            int r0 = r0.getMinimumHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            int r0 = r0.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            boolean r2 = r0.getPadding(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            int[] r0 = r0.getState()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            android.graphics.Region r0 = r0.getTransparentRegion()
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            boolean r0 = r0.isAutoMirrored()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            boolean r0 = r1.mo5795c()
            if (r0 == 0) goto Ld
            g0.f r0 = r1.f10091b0
            if (r0 == 0) goto Ld
            android.content.res.ColorStateList r0 = r0.f10097c
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L16
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L1e
        L16:
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L20
        L1e:
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            r0.jumpToCurrentState()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            boolean r0 = r2.f10092c0
            if (r0 != 0) goto L2d
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r2) goto L2d
            g0.f r0 = new g0.f
            g0.f r1 = r2.f10091b0
            r0.<init>(r1)
            r2.f10091b0 = r0
            android.graphics.drawable.Drawable r0 = r2.f10093d0
            if (r0 == 0) goto L1a
            r0.mutate()
        L1a:
            g0.f r0 = r2.f10091b0
            if (r0 == 0) goto L2a
            android.graphics.drawable.Drawable r1 = r2.f10093d0
            if (r1 == 0) goto L27
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            goto L28
        L27:
            r1 = 0
        L28:
            r0.f10096b = r1
        L2a:
            r0 = 1
            r2.f10092c0 = r0
        L2d:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            if (r0 == 0) goto L7
            r0.setBounds(r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            boolean r2 = p103g0.C2200a.m5787c(r0, r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            boolean r2 = r0.setLevel(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
            r0 = this;
            r0.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            r0.setAutoMirrored(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            r0.setChangingConfigurations(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            r0.setDither(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            r0.setFilterBitmap(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            boolean r0 = r0.setState(r2)
            boolean r2 = r1.m5796d(r2)
            if (r2 != 0) goto L11
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setTintList(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = super.setVisible(r2, r3)
            if (r0 != 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            boolean r2 = r0.setVisible(r2, r3)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
            r0 = this;
            r0.unscheduleSelf(r2)
            return
    }
}
