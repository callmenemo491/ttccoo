package p103g0;

/* renamed from: g0.e */
/* loaded from: classes.dex */
public class C2204e extends p103g0.C2203d {

    /* renamed from: f0 */
    public static java.lang.reflect.Method f10094f0;

    public C2204e(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.<init>(r1)
            r0.m5797e()
            return
    }

    public C2204e(p103g0.C2205f r1, android.content.res.Resources r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.m5797e()
            return
    }

    @Override // p103g0.C2203d
    /* renamed from: c */
    public boolean mo5795c() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 21
            if (r0 != r2) goto L1a
            android.graphics.drawable.Drawable r0 = r3.f10093d0
            boolean r2 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r2 != 0) goto L19
            boolean r2 = r0 instanceof android.graphics.drawable.DrawableContainer
            if (r2 != 0) goto L19
            boolean r2 = r0 instanceof android.graphics.drawable.InsetDrawable
            if (r2 != 0) goto L19
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 == 0) goto L1a
        L19:
            r1 = 1
        L1a:
            return r1
    }

    /* renamed from: e */
    public final void m5797e() {
            r3 = this;
            java.lang.reflect.Method r0 = p103g0.C2204e.f10094f0
            if (r0 != 0) goto L1a
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.String r1 = "isProjected"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L12
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L12
            p103g0.C2204e.f10094f0 = r0     // Catch: java.lang.Exception -> L12
            goto L1a
        L12:
            r0 = move-exception
            java.lang.String r1 = "WrappedDrawableApi21"
            java.lang.String r2 = "Failed to retrieve Drawable#isProjected() method"
            android.util.Log.w(r1, r2, r0)
        L1a:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Rect getDirtyBounds() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            android.graphics.Rect r0 = r0.getDirtyBounds()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            r0.getOutline(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f10093d0
            r1 = 0
            if (r0 == 0) goto L1e
            java.lang.reflect.Method r2 = p103g0.C2204e.f10094f0
            if (r2 == 0) goto L1e
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L16
            java.lang.Object r0 = r2.invoke(r0, r3)     // Catch: java.lang.Exception -> L16
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L16
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L16
            return r0
        L16:
            r0 = move-exception
            java.lang.String r2 = "WrappedDrawableApi21"
            java.lang.String r3 = "Error calling Drawable#isProjected() method"
            android.util.Log.w(r2, r3, r0)
        L1e:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r2, float r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            r0.setHotspot(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            r0.setHotspotBounds(r2, r3, r4, r5)
            return
    }

    @Override // p103g0.C2203d, android.graphics.drawable.Drawable
    public boolean setState(int[] r1) {
            r0 = this;
            boolean r1 = super.setState(r1)
            if (r1 == 0) goto Lb
            r0.invalidateSelf()
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // p103g0.C2203d, android.graphics.drawable.Drawable
    public void setTint(int r2) {
            r1 = this;
            boolean r0 = r1.mo5795c()
            if (r0 == 0) goto La
            super.setTint(r2)
            goto Lf
        La:
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            r0.setTint(r2)
        Lf:
            return
    }

    @Override // p103g0.C2203d, android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            boolean r0 = r1.mo5795c()
            if (r0 == 0) goto L12
            g0.f r0 = r1.f10091b0
            r0.f10097c = r2
            int[] r2 = r1.getState()
            r1.m5796d(r2)
            goto L17
        L12:
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            r0.setTintList(r2)
        L17:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            boolean r0 = r1.mo5795c()
            if (r0 == 0) goto L12
            g0.f r0 = r1.f10091b0
            r0.f10098d = r2
            int[] r2 = r1.getState()
            r1.m5796d(r2)
            goto L17
        L12:
            android.graphics.drawable.Drawable r0 = r1.f10093d0
            r0.setTintMode(r2)
        L17:
            return
    }
}
