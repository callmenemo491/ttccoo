package p404x2;

/* renamed from: x2.c */
/* loaded from: classes.dex */
public class C6914c extends android.graphics.drawable.Drawable implements p404x2.C6916e.b, android.graphics.drawable.Animatable {

    /* renamed from: Y */
    public final p404x2.C6914c.a f26903Y;

    /* renamed from: Z */
    public boolean f26904Z;

    /* renamed from: a0 */
    public boolean f26905a0;

    /* renamed from: b0 */
    public boolean f26906b0;

    /* renamed from: c0 */
    public boolean f26907c0;

    /* renamed from: d0 */
    public int f26908d0;

    /* renamed from: e0 */
    public int f26909e0;

    /* renamed from: f0 */
    public boolean f26910f0;

    /* renamed from: g0 */
    public android.graphics.Paint f26911g0;

    /* renamed from: h0 */
    public android.graphics.Rect f26912h0;

    /* renamed from: x2.c$a */
    public static final class a extends android.graphics.drawable.Drawable.ConstantState {

        /* renamed from: a */
        public final p404x2.C6916e f26913a;

        public a(p404x2.C6916e r1) {
                r0 = this;
                r0.<init>()
                r0.f26913a = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                x2.c r0 = new x2.c
                r0.<init>(r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r1) {
                r0 = this;
                x2.c r1 = new x2.c
                r1.<init>(r0)
                return r1
        }
    }

    public C6914c(android.content.Context r10, p160j2.InterfaceC3388a r11, p180k2.InterfaceC3676h<android.graphics.Bitmap> r12, int r13, int r14, android.graphics.Bitmap r15) {
            r9 = this;
            x2.c$a r0 = new x2.c$a
            x2.e r8 = new x2.e
            com.bumptech.glide.c r2 = com.bumptech.glide.ComponentCallbacks2C0999c.m2734b(r10)
            r1 = r8
            r3 = r11
            r4 = r13
            r5 = r14
            r6 = r12
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r8)
            r9.<init>()
            r10 = 1
            r9.f26907c0 = r10
            r10 = -1
            r9.f26909e0 = r10
            r9.f26903Y = r0
            return
    }

    public C6914c(p404x2.C6914c.a r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f26907c0 = r0
            r0 = -1
            r1.f26909e0 = r0
            r1.f26903Y = r2
            return
    }

    @Override // p404x2.C6916e.b
    /* renamed from: a */
    public void mo14019a() {
            r3 = this;
            android.graphics.drawable.Drawable$Callback r0 = r3.getCallback()
        L4:
            boolean r1 = r0 instanceof android.graphics.drawable.Drawable
            if (r1 == 0) goto Lf
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            android.graphics.drawable.Drawable$Callback r0 = r0.getCallback()
            goto L4
        Lf:
            if (r0 != 0) goto L18
            r3.stop()
            r3.invalidateSelf()
            return
        L18:
            r3.invalidateSelf()
            x2.c$a r0 = r3.f26903Y
            x2.e r0 = r0.f26913a
            x2.e$a r1 = r0.f26923i
            r2 = -1
            if (r1 == 0) goto L27
            int r1 = r1.f26933c0
            goto L28
        L27:
            r1 = -1
        L28:
            j2.a r0 = r0.f26915a
            int r0 = r0.mo7762d()
            int r0 = r0 + (-1)
            if (r1 != r0) goto L38
            int r0 = r3.f26908d0
            int r0 = r0 + 1
            r3.f26908d0 = r0
        L38:
            int r0 = r3.f26909e0
            if (r0 == r2) goto L43
            int r1 = r3.f26908d0
            if (r1 < r0) goto L43
            r3.stop()
        L43:
            return
    }

    /* renamed from: b */
    public android.graphics.Bitmap m14020b() {
            r1 = this;
            x2.c$a r0 = r1.f26903Y
            x2.e r0 = r0.f26913a
            android.graphics.Bitmap r0 = r0.f26926l
            return r0
    }

    /* renamed from: c */
    public final android.graphics.Paint m14021c() {
            r2 = this;
            android.graphics.Paint r0 = r2.f26911g0
            if (r0 != 0) goto Lc
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 2
            r0.<init>(r1)
            r2.f26911g0 = r0
        Lc:
            android.graphics.Paint r0 = r2.f26911g0
            return r0
    }

    /* renamed from: d */
    public final void m14022d() {
            r4 = this;
            boolean r0 = r4.f26906b0
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request."
            p064e.C1494h.m4050a(r0, r2)
            x2.c$a r0 = r4.f26903Y
            x2.e r0 = r0.f26913a
            j2.a r0 = r0.f26915a
            int r0 = r0.mo7762d()
            if (r0 != r1) goto L16
            goto L46
        L16:
            boolean r0 = r4.f26904Z
            if (r0 != 0) goto L5a
            r4.f26904Z = r1
            x2.c$a r0 = r4.f26903Y
            x2.e r0 = r0.f26913a
            boolean r2 = r0.f26924j
            if (r2 != 0) goto L52
            java.util.List<x2.e$b> r2 = r0.f26917c
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L4a
            java.util.List<x2.e$b> r2 = r0.f26917c
            boolean r2 = r2.isEmpty()
            java.util.List<x2.e$b> r3 = r0.f26917c
            r3.add(r4)
            if (r2 == 0) goto L46
            boolean r2 = r0.f26920f
            if (r2 == 0) goto L3e
            goto L46
        L3e:
            r0.f26920f = r1
            r1 = 0
            r0.f26924j = r1
            r0.m14024a()
        L46:
            r4.invalidateSelf()
            goto L5a
        L4a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot subscribe twice in a row"
            r0.<init>(r1)
            throw r0
        L52:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot subscribe to a cleared frame loader"
            r0.<init>(r1)
            throw r0
        L5a:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r6) {
            r5 = this;
            boolean r0 = r5.f26906b0
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r5.f26910f0
            if (r0 == 0) goto L2a
            r0 = 119(0x77, float:1.67E-43)
            int r1 = r5.getIntrinsicWidth()
            int r2 = r5.getIntrinsicHeight()
            android.graphics.Rect r3 = r5.getBounds()
            android.graphics.Rect r4 = r5.f26912h0
            if (r4 != 0) goto L22
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r5.f26912h0 = r4
        L22:
            android.graphics.Rect r4 = r5.f26912h0
            android.view.Gravity.apply(r0, r1, r2, r3, r4)
            r0 = 0
            r5.f26910f0 = r0
        L2a:
            x2.c$a r0 = r5.f26903Y
            x2.e r0 = r0.f26913a
            x2.e$a r1 = r0.f26923i
            if (r1 == 0) goto L35
            android.graphics.Bitmap r0 = r1.f26935e0
            goto L37
        L35:
            android.graphics.Bitmap r0 = r0.f26926l
        L37:
            r1 = 0
            android.graphics.Rect r2 = r5.f26912h0
            if (r2 != 0) goto L43
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r5.f26912h0 = r2
        L43:
            android.graphics.Rect r2 = r5.f26912h0
            android.graphics.Paint r3 = r5.m14021c()
            r6.drawBitmap(r0, r1, r2, r3)
            return
    }

    /* renamed from: e */
    public final void m14023e() {
            r3 = this;
            r0 = 0
            r3.f26904Z = r0
            x2.c$a r1 = r3.f26903Y
            x2.e r1 = r1.f26913a
            java.util.List<x2.e$b> r2 = r1.f26917c
            r2.remove(r3)
            java.util.List<x2.e$b> r2 = r1.f26917c
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L16
            r1.f26920f = r0
        L16:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r1 = this;
            x2.c$a r0 = r1.f26903Y
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            x2.c$a r0 = r1.f26903Y
            x2.e r0 = r0.f26913a
            int r0 = r0.f26931q
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            x2.c$a r0 = r1.f26903Y
            x2.e r0 = r0.f26913a
            int r0 = r0.f26930p
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -2
            return r0
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r1 = this;
            boolean r0 = r1.f26904Z
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            super.onBoundsChange(r1)
            r1 = 1
            r0.f26910f0 = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.m14021c()
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.m14021c()
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.f26906b0
            r0 = r0 ^ 1
            java.lang.String r1 = "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility."
            p064e.C1494h.m4050a(r0, r1)
            r2.f26907c0 = r3
            if (r3 != 0) goto L11
            r2.m14023e()
            goto L18
        L11:
            boolean r0 = r2.f26905a0
            if (r0 == 0) goto L18
            r2.m14022d()
        L18:
            boolean r3 = super.setVisible(r3, r4)
            return r3
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
            r1 = this;
            r0 = 1
            r1.f26905a0 = r0
            r0 = 0
            r1.f26908d0 = r0
            boolean r0 = r1.f26907c0
            if (r0 == 0) goto Ld
            r1.m14022d()
        Ld:
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
            r1 = this;
            r0 = 0
            r1.f26905a0 = r0
            r1.m14023e()
            return
    }
}
