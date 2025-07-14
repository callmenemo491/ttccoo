package p038c8;

/* renamed from: c8.a */
/* loaded from: classes.dex */
public class C0935a {

    /* renamed from: t */
    public static final int[] f4881t = null;

    /* renamed from: u */
    public static final double f4882u = 0.0d;

    /* renamed from: a */
    public final com.google.android.material.card.MaterialCardView f4883a;

    /* renamed from: b */
    public final android.graphics.Rect f4884b;

    /* renamed from: c */
    public final p340t8.C6189f f4885c;

    /* renamed from: d */
    public final p340t8.C6189f f4886d;

    /* renamed from: e */
    public int f4887e;

    /* renamed from: f */
    public int f4888f;

    /* renamed from: g */
    public int f4889g;

    /* renamed from: h */
    public android.graphics.drawable.Drawable f4890h;

    /* renamed from: i */
    public android.graphics.drawable.Drawable f4891i;

    /* renamed from: j */
    public android.content.res.ColorStateList f4892j;

    /* renamed from: k */
    public android.content.res.ColorStateList f4893k;

    /* renamed from: l */
    public p340t8.C6192i f4894l;

    /* renamed from: m */
    public android.content.res.ColorStateList f4895m;

    /* renamed from: n */
    public android.graphics.drawable.Drawable f4896n;

    /* renamed from: o */
    public android.graphics.drawable.LayerDrawable f4897o;

    /* renamed from: p */
    public p340t8.C6189f f4898p;

    /* renamed from: q */
    public p340t8.C6189f f4899q;

    /* renamed from: r */
    public boolean f4900r;

    /* renamed from: s */
    public boolean f4901s;

    /* renamed from: c8.a$a */
    public class a extends android.graphics.drawable.InsetDrawable {
        public a(p038c8.C0935a r7, android.graphics.drawable.Drawable r8, int r9, int r10, int r11, int r12) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
                r1 = this;
                r0 = -1
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
                r1 = this;
                r0 = -1
                return r0
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(android.graphics.Rect r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r0[r1] = r2
            p038c8.C0935a.f4881t = r0
            r0 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.cos(r0)
            p038c8.C0935a.f4882u = r0
            return
    }

    public C0935a(com.google.android.material.card.MaterialCardView r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.f4884b = r0
            r0 = 0
            r2.f4900r = r0
            r2.f4883a = r3
            t8.f r0 = new t8.f
            android.content.Context r1 = r3.getContext()
            t8.i$b r6 = p340t8.C6192i.m12783b(r1, r4, r5, r6)
            t8.i r6 = r6.m12788a()
            r0.<init>(r6)
            r2.f4885c = r0
            android.content.Context r6 = r3.getContext()
            r0.m12770n(r6)
            r6 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r0.m12775s(r6)
            t8.f$b r6 = r0.f24036Y
            t8.i r6 = r6.f24059a
            java.util.Objects.requireNonNull(r6)
            t8.i$b r0 = new t8.i$b
            r0.<init>(r6)
            android.content.Context r3 = r3.getContext()
            int[] r6 = p339t7.C6183a.f24010g
            r1 = 2132017397(0x7f1400f5, float:1.9673071E38)
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r6, r5, r1)
            r4 = 3
            boolean r5 = r3.hasValue(r4)
            if (r5 == 0) goto L57
            r5 = 0
            float r4 = r3.getDimension(r4, r5)
            r0.m12789c(r4)
        L57:
            t8.f r4 = new t8.f
            r4.<init>()
            r2.f4886d = r4
            t8.i r4 = r0.m12788a()
            r2.m2647h(r4)
            r3.recycle()
            return
    }

    /* renamed from: a */
    public final float m2640a() {
            r5 = this;
            t8.i r0 = r5.f4894l
            y.e r0 = r0.f24082a
            t8.f r1 = r5.f4885c
            float r1 = r1.m12768l()
            float r0 = r5.m2641b(r0, r1)
            t8.i r1 = r5.f4894l
            y.e r1 = r1.f24083b
            t8.f r2 = r5.f4885c
            t8.f$b r3 = r2.f24036Y
            t8.i r3 = r3.f24059a
            t8.c r3 = r3.f24087f
            android.graphics.RectF r2 = r2.m12764h()
            float r2 = r3.mo12753a(r2)
            float r1 = r5.m2641b(r1, r2)
            float r0 = java.lang.Math.max(r0, r1)
            t8.i r1 = r5.f4894l
            y.e r1 = r1.f24084c
            t8.f r2 = r5.f4885c
            t8.f$b r3 = r2.f24036Y
            t8.i r3 = r3.f24059a
            t8.c r3 = r3.f24088g
            android.graphics.RectF r2 = r2.m12764h()
            float r2 = r3.mo12753a(r2)
            float r1 = r5.m2641b(r1, r2)
            t8.i r2 = r5.f4894l
            y.e r2 = r2.f24085d
            t8.f r3 = r5.f4885c
            t8.f$b r4 = r3.f24036Y
            t8.i r4 = r4.f24059a
            t8.c r4 = r4.f24089h
            android.graphics.RectF r3 = r3.m12764h()
            float r3 = r4.mo12753a(r3)
            float r2 = r5.m2641b(r2, r3)
            float r1 = java.lang.Math.max(r1, r2)
            float r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    /* renamed from: b */
    public final float m2641b(p422y.C7095e r5, float r6) {
            r4 = this;
            boolean r0 = r5 instanceof p340t8.C6191h
            if (r0 == 0) goto Le
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = p038c8.C0935a.f4882u
            double r0 = r0 - r2
            double r5 = (double) r6
            double r0 = r0 * r5
            float r5 = (float) r0
            return r5
        Le:
            boolean r5 = r5 instanceof p340t8.C6187d
            if (r5 == 0) goto L16
            r5 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r5
            return r6
        L16:
            r5 = 0
            return r5
    }

    /* renamed from: c */
    public final float m2642c() {
            r2 = this;
            com.google.android.material.card.MaterialCardView r0 = r2.f4883a
            float r0 = r0.getMaxCardElevation()
            boolean r1 = r2.m2649j()
            if (r1 == 0) goto L11
            float r1 = r2.m2640a()
            goto L12
        L11:
            r1 = 0
        L12:
            float r0 = r0 + r1
            return r0
    }

    /* renamed from: d */
    public final float m2643d() {
            r2 = this;
            com.google.android.material.card.MaterialCardView r0 = r2.f4883a
            float r0 = r0.getMaxCardElevation()
            r1 = 1069547520(0x3fc00000, float:1.5)
            float r0 = r0 * r1
            boolean r1 = r2.m2649j()
            if (r1 == 0) goto L15
            float r1 = r2.m2640a()
            goto L16
        L15:
            r1 = 0
        L16:
            float r0 = r0 + r1
            return r0
    }

    /* renamed from: e */
    public final android.graphics.drawable.Drawable m2644e() {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.f4896n
            if (r0 != 0) goto L1b
            int[] r0 = p308r8.C5799a.f22492a
            t8.f r0 = new t8.f
            t8.i r1 = r5.f4894l
            r0.<init>(r1)
            r5.f4899q = r0
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r1 = r5.f4892j
            r2 = 0
            t8.f r3 = r5.f4899q
            r0.<init>(r1, r2, r3)
            r5.f4896n = r0
        L1b:
            android.graphics.drawable.LayerDrawable r0 = r5.f4897o
            if (r0 != 0) goto L4a
            android.graphics.drawable.StateListDrawable r0 = new android.graphics.drawable.StateListDrawable
            r0.<init>()
            android.graphics.drawable.Drawable r1 = r5.f4891i
            if (r1 == 0) goto L2d
            int[] r2 = p038c8.C0935a.f4881t
            r0.addState(r2, r1)
        L2d:
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r2 = 3
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]
            r3 = 0
            android.graphics.drawable.Drawable r4 = r5.f4896n
            r2[r3] = r4
            r3 = 1
            t8.f r4 = r5.f4886d
            r2[r3] = r4
            r3 = 2
            r2[r3] = r0
            r1.<init>(r2)
            r5.f4897o = r1
            r0 = 2131362423(0x7f0a0277, float:1.8344626E38)
            r1.setId(r3, r0)
        L4a:
            android.graphics.drawable.LayerDrawable r0 = r5.f4897o
            return r0
    }

    /* renamed from: f */
    public final android.graphics.drawable.Drawable m2645f(android.graphics.drawable.Drawable r10) {
            r9 = this;
            com.google.android.material.card.MaterialCardView r0 = r9.f4883a
            boolean r0 = r0.getUseCompatPadding()
            r1 = 0
            if (r0 == 0) goto L20
            float r0 = r9.m2643d()
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r1 = (int) r0
            float r0 = r9.m2642c()
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            int r0 = (int) r2
            r7 = r0
            r8 = r1
            goto L22
        L20:
            r7 = 0
            r8 = 0
        L22:
            c8.a$a r0 = new c8.a$a
            r2 = r0
            r3 = r9
            r4 = r10
            r5 = r7
            r6 = r8
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
    }

    /* renamed from: g */
    public void m2646g(android.graphics.drawable.Drawable r3) {
            r2 = this;
            r2.f4891i = r3
            if (r3 == 0) goto L13
            android.graphics.drawable.Drawable r3 = r3.mutate()
            android.graphics.drawable.Drawable r3 = p103g0.C2200a.m5792h(r3)
            r2.f4891i = r3
            android.content.res.ColorStateList r0 = r2.f4893k
            r3.setTintList(r0)
        L13:
            android.graphics.drawable.LayerDrawable r3 = r2.f4897o
            if (r3 == 0) goto L2d
            android.graphics.drawable.StateListDrawable r3 = new android.graphics.drawable.StateListDrawable
            r3.<init>()
            android.graphics.drawable.Drawable r0 = r2.f4891i
            if (r0 == 0) goto L25
            int[] r1 = p038c8.C0935a.f4881t
            r3.addState(r1, r0)
        L25:
            android.graphics.drawable.LayerDrawable r0 = r2.f4897o
            r1 = 2131362423(0x7f0a0277, float:1.8344626E38)
            r0.setDrawableByLayerId(r1, r3)
        L2d:
            return
    }

    /* renamed from: h */
    public void m2647h(p340t8.C6192i r3) {
            r2 = this;
            r2.f4894l = r3
            t8.f r0 = r2.f4885c
            t8.f$b r1 = r0.f24036Y
            r1.f24059a = r3
            r0.invalidateSelf()
            t8.f r0 = r2.f4885c
            boolean r1 = r0.m12771o()
            r1 = r1 ^ 1
            r0.f24057t0 = r1
            t8.f r0 = r2.f4886d
            if (r0 == 0) goto L20
            t8.f$b r1 = r0.f24036Y
            r1.f24059a = r3
            r0.invalidateSelf()
        L20:
            t8.f r0 = r2.f4899q
            if (r0 == 0) goto L2b
            t8.f$b r1 = r0.f24036Y
            r1.f24059a = r3
            r0.invalidateSelf()
        L2b:
            t8.f r0 = r2.f4898p
            if (r0 == 0) goto L36
            t8.f$b r1 = r0.f24036Y
            r1.f24059a = r3
            r0.invalidateSelf()
        L36:
            return
    }

    /* renamed from: i */
    public final boolean m2648i() {
            r1 = this;
            com.google.android.material.card.MaterialCardView r0 = r1.f4883a
            boolean r0 = r0.getPreventCornerOverlap()
            if (r0 == 0) goto L12
            t8.f r0 = r1.f4885c
            boolean r0 = r0.m12771o()
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    /* renamed from: j */
    public final boolean m2649j() {
            r1 = this;
            com.google.android.material.card.MaterialCardView r0 = r1.f4883a
            boolean r0 = r0.getPreventCornerOverlap()
            if (r0 == 0) goto L1a
            t8.f r0 = r1.f4885c
            boolean r0 = r0.m12771o()
            if (r0 == 0) goto L1a
            com.google.android.material.card.MaterialCardView r0 = r1.f4883a
            boolean r0 = r0.getUseCompatPadding()
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    /* renamed from: k */
    public void m2650k() {
            r7 = this;
            boolean r0 = r7.m2648i()
            r1 = 0
            if (r0 != 0) goto L10
            boolean r0 = r7.m2649j()
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            r2 = 0
            if (r0 == 0) goto L19
            float r0 = r7.m2640a()
            goto L1a
        L19:
            r0 = 0
        L1a:
            com.google.android.material.card.MaterialCardView r3 = r7.f4883a
            boolean r3 = r3.getPreventCornerOverlap()
            if (r3 == 0) goto L39
            com.google.android.material.card.MaterialCardView r3 = r7.f4883a
            boolean r3 = r3.getUseCompatPadding()
            if (r3 == 0) goto L39
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = p038c8.C0935a.f4882u
            double r2 = r2 - r4
            com.google.android.material.card.MaterialCardView r4 = r7.f4883a
            float r4 = r4.getCardViewRadius()
            double r4 = (double) r4
            double r2 = r2 * r4
            float r2 = (float) r2
        L39:
            float r0 = r0 - r2
            int r0 = (int) r0
            com.google.android.material.card.MaterialCardView r2 = r7.f4883a
            android.graphics.Rect r3 = r7.f4884b
            int r4 = r3.left
            int r4 = r4 + r0
            int r5 = r3.top
            int r5 = r5 + r0
            int r6 = r3.right
            int r6 = r6 + r0
            int r3 = r3.bottom
            int r3 = r3 + r0
            android.graphics.Rect r0 = r2.f1516e0
            r0.set(r4, r5, r6, r3)
            r.b r0 = r2.f1518g0
            androidx.cardview.widget.CardView$a r0 = (androidx.cardview.widget.CardView.C0317a) r0
            androidx.cardview.widget.CardView r2 = r0.f1520b
            boolean r2 = r2.getUseCompatPadding()
            if (r2 != 0) goto L60
            r0.m867b(r1, r1, r1, r1)
            goto L8a
        L60:
            android.graphics.drawable.Drawable r1 = r0.f1519a
            r2 = r1
            r.d r2 = (p299r.C5756d) r2
            float r2 = r2.f22159e
            r.d r1 = (p299r.C5756d) r1
            float r1 = r1.f22155a
            boolean r3 = r0.m866a()
            float r3 = p299r.C5757e.m12075a(r2, r1, r3)
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            boolean r4 = r0.m866a()
            float r1 = p299r.C5757e.m12076b(r2, r1, r4)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            r0.m867b(r3, r1, r3, r1)
        L8a:
            return
    }

    /* renamed from: l */
    public void m2651l() {
            r2 = this;
            boolean r0 = r2.f4900r
            if (r0 != 0) goto Lf
            com.google.android.material.card.MaterialCardView r0 = r2.f4883a
            t8.f r1 = r2.f4885c
            android.graphics.drawable.Drawable r1 = r2.m2645f(r1)
            r0.setBackgroundInternal(r1)
        Lf:
            com.google.android.material.card.MaterialCardView r0 = r2.f4883a
            android.graphics.drawable.Drawable r1 = r2.f4890h
            android.graphics.drawable.Drawable r1 = r2.m2645f(r1)
            r0.setForeground(r1)
            return
    }

    /* renamed from: m */
    public final void m2652m() {
            r2 = this;
            int[] r0 = p308r8.C5799a.f22492a
            android.graphics.drawable.Drawable r0 = r2.f4896n
            if (r0 == 0) goto Le
            android.graphics.drawable.RippleDrawable r0 = (android.graphics.drawable.RippleDrawable) r0
            android.content.res.ColorStateList r1 = r2.f4892j
            r0.setColor(r1)
            goto L17
        Le:
            t8.f r0 = r2.f4898p
            if (r0 == 0) goto L17
            android.content.res.ColorStateList r1 = r2.f4892j
            r0.m12773q(r1)
        L17:
            return
    }

    /* renamed from: n */
    public void m2653n() {
            r3 = this;
            t8.f r0 = r3.f4886d
            int r1 = r3.f4889g
            float r1 = (float) r1
            android.content.res.ColorStateList r2 = r3.f4895m
            r0.m12777u(r1, r2)
            return
    }
}
