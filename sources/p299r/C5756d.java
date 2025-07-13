package p299r;

/* renamed from: r.d */
/* loaded from: classes.dex */
public class C5756d extends android.graphics.drawable.Drawable {

    /* renamed from: a */
    public float f22155a;

    /* renamed from: b */
    public final android.graphics.Paint f22156b;

    /* renamed from: c */
    public final android.graphics.RectF f22157c;

    /* renamed from: d */
    public final android.graphics.Rect f22158d;

    /* renamed from: e */
    public float f22159e;

    /* renamed from: f */
    public boolean f22160f;

    /* renamed from: g */
    public boolean f22161g;

    /* renamed from: h */
    public android.content.res.ColorStateList f22162h;

    /* renamed from: i */
    public android.graphics.PorterDuffColorFilter f22163i;

    /* renamed from: j */
    public android.content.res.ColorStateList f22164j;

    /* renamed from: k */
    public android.graphics.PorterDuff.Mode f22165k;

    public C5756d(android.content.res.ColorStateList r2, float r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f22160f = r0
            r0 = 1
            r1.f22161g = r0
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.f22165k = r0
            r1.f22155a = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r0 = 5
            r3.<init>(r0)
            r1.f22156b = r3
            r1.m12073b(r2)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r1.f22157c = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.f22158d = r2
            return
    }

    /* renamed from: a */
    public final android.graphics.PorterDuffColorFilter m12072a(android.content.res.ColorStateList r3, android.graphics.PorterDuff.Mode r4) {
            r2 = this;
            if (r3 == 0) goto L14
            if (r4 != 0) goto L5
            goto L14
        L5:
            int[] r0 = r2.getState()
            r1 = 0
            int r3 = r3.getColorForState(r0, r1)
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r3, r4)
            return r0
        L14:
            r3 = 0
            return r3
    }

    /* renamed from: b */
    public final void m12073b(android.content.res.ColorStateList r4) {
            r3 = this;
            if (r4 != 0) goto L7
            r4 = 0
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
        L7:
            r3.f22162h = r4
            android.graphics.Paint r0 = r3.f22156b
            int[] r1 = r3.getState()
            android.content.res.ColorStateList r2 = r3.f22162h
            int r2 = r2.getDefaultColor()
            int r4 = r4.getColorForState(r1, r2)
            r0.setColor(r4)
            return
    }

    /* renamed from: c */
    public final void m12074c(android.graphics.Rect r6) {
            r5 = this;
            if (r6 != 0) goto L6
            android.graphics.Rect r6 = r5.getBounds()
        L6:
            android.graphics.RectF r0 = r5.f22157c
            int r1 = r6.left
            float r1 = (float) r1
            int r2 = r6.top
            float r2 = (float) r2
            int r3 = r6.right
            float r3 = (float) r3
            int r4 = r6.bottom
            float r4 = (float) r4
            r0.set(r1, r2, r3, r4)
            android.graphics.Rect r0 = r5.f22158d
            r0.set(r6)
            boolean r6 = r5.f22160f
            if (r6 == 0) goto L4c
            float r6 = r5.f22159e
            float r0 = r5.f22155a
            boolean r1 = r5.f22161g
            float r6 = p299r.C5757e.m12076b(r6, r0, r1)
            float r0 = r5.f22159e
            float r1 = r5.f22155a
            boolean r2 = r5.f22161g
            float r0 = p299r.C5757e.m12075a(r0, r1, r2)
            android.graphics.Rect r1 = r5.f22158d
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            int r0 = (int) r2
            double r2 = (double) r6
            double r2 = java.lang.Math.ceil(r2)
            int r6 = (int) r2
            r1.inset(r0, r6)
            android.graphics.RectF r6 = r5.f22157c
            android.graphics.Rect r0 = r5.f22158d
            r6.set(r0)
        L4c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r5) {
            r4 = this;
            android.graphics.Paint r0 = r4.f22156b
            android.graphics.PorterDuffColorFilter r1 = r4.f22163i
            if (r1 == 0) goto L13
            android.graphics.ColorFilter r1 = r0.getColorFilter()
            if (r1 != 0) goto L13
            android.graphics.PorterDuffColorFilter r1 = r4.f22163i
            r0.setColorFilter(r1)
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            android.graphics.RectF r2 = r4.f22157c
            float r3 = r4.f22155a
            r5.drawRoundRect(r2, r3, r3, r0)
            if (r1 == 0) goto L21
            r5 = 0
            r0.setColorFilter(r5)
        L21:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r3) {
            r2 = this;
            android.graphics.Rect r0 = r2.f22158d
            float r1 = r2.f22155a
            r3.setRoundRect(r0, r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f22164j
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L1a
        La:
            android.content.res.ColorStateList r0 = r1.f22162h
            if (r0 == 0) goto L14
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L1a
        L14:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L1c
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            super.onBoundsChange(r1)
            r0.m12074c(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.f22162h
            int r1 = r0.getDefaultColor()
            int r4 = r0.getColorForState(r4, r1)
            android.graphics.Paint r0 = r3.f22156b
            int r0 = r0.getColor()
            r1 = 1
            if (r4 == r0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L1d
            android.graphics.Paint r2 = r3.f22156b
            r2.setColor(r4)
        L1d:
            android.content.res.ColorStateList r4 = r3.f22164j
            if (r4 == 0) goto L2c
            android.graphics.PorterDuff$Mode r2 = r3.f22165k
            if (r2 == 0) goto L2c
            android.graphics.PorterDuffColorFilter r4 = r3.m12072a(r4, r2)
            r3.f22163i = r4
            return r1
        L2c:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f22156b
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f22156b
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.f22164j = r2
            android.graphics.PorterDuff$Mode r0 = r1.f22165k
            android.graphics.PorterDuffColorFilter r2 = r1.m12072a(r2, r0)
            r1.f22163i = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.f22165k = r2
            android.content.res.ColorStateList r0 = r1.f22164j
            android.graphics.PorterDuffColorFilter r2 = r1.m12072a(r0, r2)
            r1.f22163i = r2
            r1.invalidateSelf()
            return
    }
}
