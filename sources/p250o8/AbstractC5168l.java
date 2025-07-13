package p250o8;

/* renamed from: o8.l */
/* loaded from: classes.dex */
public abstract class AbstractC5168l extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {

    /* renamed from: i0 */
    public static final android.util.Property<p250o8.AbstractC5168l, java.lang.Float> f20265i0 = null;

    /* renamed from: Y */
    public final android.content.Context f20266Y;

    /* renamed from: Z */
    public final p250o8.AbstractC5159c f20267Z;

    /* renamed from: a0 */
    public p250o8.C5157a f20268a0;

    /* renamed from: b0 */
    public android.animation.ValueAnimator f20269b0;

    /* renamed from: c0 */
    public android.animation.ValueAnimator f20270c0;

    /* renamed from: d0 */
    public java.util.List<p348u1.AbstractC6284b> f20271d0;

    /* renamed from: e0 */
    public boolean f20272e0;

    /* renamed from: f0 */
    public float f20273f0;

    /* renamed from: g0 */
    public final android.graphics.Paint f20274g0;

    /* renamed from: h0 */
    public int f20275h0;

    /* renamed from: o8.l$a */
    public static class a extends android.util.Property<p250o8.AbstractC5168l, java.lang.Float> {
        public a(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public java.lang.Float get(p250o8.AbstractC5168l r1) {
                r0 = this;
                o8.l r1 = (p250o8.AbstractC5168l) r1
                float r1 = r1.m11483c()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }

        @Override // android.util.Property
        public void set(p250o8.AbstractC5168l r2, java.lang.Float r3) {
                r1 = this;
                o8.l r2 = (p250o8.AbstractC5168l) r2
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                float r0 = r2.f20273f0
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 == 0) goto L13
                r2.f20273f0 = r3
                r2.invalidateSelf()
            L13:
                return
        }
    }

    static {
            o8.l$a r0 = new o8.l$a
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "growFraction"
            r0.<init>(r1, r2)
            p250o8.AbstractC5168l.f20265i0 = r0
            return
    }

    public AbstractC5168l(android.content.Context r2, p250o8.AbstractC5159c r3) {
            r1 = this;
            r1.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.f20274g0 = r0
            r1.f20266Y = r2
            r1.f20267Z = r3
            o8.a r2 = new o8.a
            r2.<init>()
            r1.f20268a0 = r2
            r2 = 255(0xff, float:3.57E-43)
            r1.f20275h0 = r2
            r1.invalidateSelf()
            return
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m11481a(p250o8.AbstractC5168l r0, boolean r1, boolean r2) {
            boolean r0 = super.setVisible(r1, r2)
            return r0
    }

    /* renamed from: b */
    public final void m11482b(android.animation.ValueAnimator... r5) {
            r4 = this;
            boolean r0 = r4.f20272e0
            r1 = 1
            r4.f20272e0 = r1
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L11
            r3 = r5[r2]
            r3.end()
            int r2 = r2 + 1
            goto L7
        L11:
            r4.f20272e0 = r0
            return
    }

    /* renamed from: c */
    public float m11483c() {
            r4 = this;
            o8.c r0 = r4.f20267Z
            int r1 = r0.f20233e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 != 0) goto L17
            int r0 = r0.f20234f
            if (r0 == 0) goto L12
            r2 = 1
        L12:
            if (r2 != 0) goto L17
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        L17:
            float r0 = r4.f20273f0
            return r0
    }

    /* renamed from: d */
    public boolean m11484d() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.m11488h(r0, r0, r0)
            return r0
    }

    /* renamed from: e */
    public boolean m11485e() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.f20270c0
            if (r0 == 0) goto Ld
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto Lb
            goto Ld
        Lb:
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    /* renamed from: f */
    public boolean m11486f() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.f20269b0
            if (r0 == 0) goto Ld
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto Lb
            goto Ld
        Lb:
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    /* renamed from: g */
    public void m11487g(p348u1.AbstractC6284b r2) {
            r1 = this;
            java.util.List<u1.b> r0 = r1.f20271d0
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f20271d0 = r0
        Lb:
            java.util.List<u1.b> r0 = r1.f20271d0
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L18
            java.util.List<u1.b> r0 = r1.f20271d0
            r0.add(r2)
        L18:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            int r0 = r1.f20275h0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    /* renamed from: h */
    public boolean m11488h(boolean r3, boolean r4, boolean r5) {
            r2 = this;
            o8.a r0 = r2.f20268a0
            android.content.Context r1 = r2.f20266Y
            android.content.ContentResolver r1 = r1.getContentResolver()
            float r0 = r0.m11466a(r1)
            if (r5 == 0) goto L15
            r5 = 0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            boolean r3 = r2.mo11478i(r3, r4, r5)
            return r3
    }

    /* renamed from: i */
    public boolean mo11478i(boolean r6, boolean r7, boolean r8) {
            r5 = this;
            android.animation.ValueAnimator r0 = r5.f20269b0
            r1 = 500(0x1f4, double:2.47E-321)
            r3 = 2
            if (r0 != 0) goto L3b
            android.util.Property<o8.l, java.lang.Float> r0 = p250o8.AbstractC5168l.f20265i0
            float[] r4 = new float[r3]
            r4 = {x00e0: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r5, r0, r4)
            r5.f20269b0 = r0
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r5.f20269b0
            android.animation.TimeInterpolator r4 = p354u7.C6350a.f24804b
            r0.setInterpolator(r4)
            android.animation.ValueAnimator r0 = r5.f20269b0
            if (r0 == 0) goto L31
            boolean r4 = r0.isRunning()
            if (r4 != 0) goto L29
            goto L31
        L29:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Cannot set showAnimator while the current showAnimator is running."
            r6.<init>(r7)
            throw r6
        L31:
            r5.f20269b0 = r0
            o8.j r4 = new o8.j
            r4.<init>(r5)
            r0.addListener(r4)
        L3b:
            android.animation.ValueAnimator r0 = r5.f20270c0
            if (r0 != 0) goto L73
            android.util.Property<o8.l, java.lang.Float> r0 = p250o8.AbstractC5168l.f20265i0
            float[] r3 = new float[r3]
            r3 = {x00e8: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r5, r0, r3)
            r5.f20270c0 = r0
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r5.f20270c0
            android.animation.TimeInterpolator r1 = p354u7.C6350a.f24804b
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r5.f20270c0
            if (r0 == 0) goto L69
            boolean r1 = r0.isRunning()
            if (r1 != 0) goto L61
            goto L69
        L61:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Cannot set hideAnimator while the current hideAnimator is running."
            r6.<init>(r7)
            throw r6
        L69:
            r5.f20270c0 = r0
            o8.k r1 = new o8.k
            r1.<init>(r5)
            r0.addListener(r1)
        L73:
            boolean r0 = r5.isVisible()
            r1 = 0
            if (r0 != 0) goto L7d
            if (r6 != 0) goto L7d
            return r1
        L7d:
            if (r6 == 0) goto L82
            android.animation.ValueAnimator r0 = r5.f20269b0
            goto L84
        L82:
            android.animation.ValueAnimator r0 = r5.f20270c0
        L84:
            r2 = 1
            if (r8 != 0) goto L9d
            boolean r7 = r0.isRunning()
            if (r7 == 0) goto L91
            r0.end()
            goto L98
        L91:
            android.animation.ValueAnimator[] r7 = new android.animation.ValueAnimator[r2]
            r7[r1] = r0
            r5.m11482b(r7)
        L98:
            boolean r6 = super.setVisible(r6, r1)
            return r6
        L9d:
            if (r8 == 0) goto La6
            boolean r8 = r0.isRunning()
            if (r8 == 0) goto La6
            return r1
        La6:
            if (r6 == 0) goto Lb1
            boolean r8 = super.setVisible(r6, r1)
            if (r8 == 0) goto Laf
            goto Lb1
        Laf:
            r8 = 0
            goto Lb2
        Lb1:
            r8 = 1
        Lb2:
            if (r6 == 0) goto Lbb
            o8.c r6 = r5.f20267Z
            int r6 = r6.f20233e
            if (r6 == 0) goto Lc3
            goto Lc1
        Lbb:
            o8.c r6 = r5.f20267Z
            int r6 = r6.f20234f
            if (r6 == 0) goto Lc3
        Lc1:
            r6 = 1
            goto Lc4
        Lc3:
            r6 = 0
        Lc4:
            if (r6 != 0) goto Lce
            android.animation.ValueAnimator[] r6 = new android.animation.ValueAnimator[r2]
            r6[r1] = r0
            r5.m11482b(r6)
            return r8
        Lce:
            if (r7 != 0) goto Ldb
            boolean r6 = r0.isPaused()
            if (r6 != 0) goto Ld7
            goto Ldb
        Ld7:
            r0.resume()
            goto Lde
        Ldb:
            r0.start()
        Lde:
            return r8
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r1 = this;
            boolean r0 = r1.m11486f()
            if (r0 != 0) goto Lf
            boolean r0 = r1.m11485e()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    /* renamed from: j */
    public boolean m11489j(p348u1.AbstractC6284b r2) {
            r1 = this;
            java.util.List<u1.b> r0 = r1.f20271d0
            if (r0 == 0) goto L1c
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L1c
            java.util.List<u1.b> r0 = r1.f20271d0
            r0.remove(r2)
            java.util.List<u1.b> r2 = r1.f20271d0
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1a
            r2 = 0
            r1.f20271d0 = r2
        L1a:
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r1) {
            r0 = this;
            r0.f20275h0 = r1
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f20274g0
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            r0 = 1
            boolean r2 = r1.m11488h(r2, r3, r0)
            return r2
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.mo11478i(r0, r0, r1)
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.mo11478i(r0, r1, r0)
            return
    }
}
