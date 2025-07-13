package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class SwitchCompat extends android.widget.CompoundButton {

    /* renamed from: M0 */
    public static final android.util.Property<androidx.appcompat.widget.SwitchCompat, java.lang.Float> f1084M0 = null;

    /* renamed from: N0 */
    public static final int[] f1085N0 = null;

    /* renamed from: A0 */
    public int f1086A0;

    /* renamed from: B0 */
    public int f1087B0;

    /* renamed from: C0 */
    public int f1088C0;

    /* renamed from: D0 */
    public int f1089D0;

    /* renamed from: E0 */
    public int f1090E0;

    /* renamed from: F0 */
    public final android.text.TextPaint f1091F0;

    /* renamed from: G0 */
    public android.content.res.ColorStateList f1092G0;

    /* renamed from: H0 */
    public android.text.Layout f1093H0;

    /* renamed from: I0 */
    public android.text.Layout f1094I0;

    /* renamed from: J0 */
    public android.text.method.TransformationMethod f1095J0;

    /* renamed from: K0 */
    public android.animation.ObjectAnimator f1096K0;

    /* renamed from: L0 */
    public final android.graphics.Rect f1097L0;

    /* renamed from: a0 */
    public android.graphics.drawable.Drawable f1098a0;

    /* renamed from: b0 */
    public android.content.res.ColorStateList f1099b0;

    /* renamed from: c0 */
    public android.graphics.PorterDuff.Mode f1100c0;

    /* renamed from: d0 */
    public boolean f1101d0;

    /* renamed from: e0 */
    public boolean f1102e0;

    /* renamed from: f0 */
    public android.graphics.drawable.Drawable f1103f0;

    /* renamed from: g0 */
    public android.content.res.ColorStateList f1104g0;

    /* renamed from: h0 */
    public android.graphics.PorterDuff.Mode f1105h0;

    /* renamed from: i0 */
    public boolean f1106i0;

    /* renamed from: j0 */
    public boolean f1107j0;

    /* renamed from: k0 */
    public int f1108k0;

    /* renamed from: l0 */
    public int f1109l0;

    /* renamed from: m0 */
    public int f1110m0;

    /* renamed from: n0 */
    public boolean f1111n0;

    /* renamed from: o0 */
    public java.lang.CharSequence f1112o0;

    /* renamed from: p0 */
    public java.lang.CharSequence f1113p0;

    /* renamed from: q0 */
    public boolean f1114q0;

    /* renamed from: r0 */
    public int f1115r0;

    /* renamed from: s0 */
    public int f1116s0;

    /* renamed from: t0 */
    public float f1117t0;

    /* renamed from: u0 */
    public float f1118u0;

    /* renamed from: v0 */
    public android.view.VelocityTracker f1119v0;

    /* renamed from: w0 */
    public int f1120w0;

    /* renamed from: x0 */
    public float f1121x0;

    /* renamed from: y0 */
    public int f1122y0;

    /* renamed from: z0 */
    public int f1123z0;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    public class C0249a extends android.util.Property<androidx.appcompat.widget.SwitchCompat, java.lang.Float> {
        public C0249a(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public java.lang.Float get(androidx.appcompat.widget.SwitchCompat r1) {
                r0 = this;
                androidx.appcompat.widget.SwitchCompat r1 = (androidx.appcompat.widget.SwitchCompat) r1
                float r1 = r1.f1121x0
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }

        @Override // android.util.Property
        public void set(androidx.appcompat.widget.SwitchCompat r1, java.lang.Float r2) {
                r0 = this;
                androidx.appcompat.widget.SwitchCompat r1 = (androidx.appcompat.widget.SwitchCompat) r1
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                r1.setThumbPosition(r2)
                return
        }
    }

    static {
            androidx.appcompat.widget.SwitchCompat$a r0 = new androidx.appcompat.widget.SwitchCompat$a
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "thumbPos"
            r0.<init>(r1, r2)
            androidx.appcompat.widget.SwitchCompat.f1084M0 = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r0[r1] = r2
            androidx.appcompat.widget.SwitchCompat.f1085N0 = r0
            return
    }

    public SwitchCompat(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130969508(0x7f0403a4, float:1.75477E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public SwitchCompat(android.content.Context r19, android.util.AttributeSet r20, int r21) {
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r18.<init>(r19, r20, r21)
            r11 = 0
            r7.f1099b0 = r11
            r7.f1100c0 = r11
            r12 = 0
            r7.f1101d0 = r12
            r7.f1102e0 = r12
            r7.f1104g0 = r11
            r7.f1105h0 = r11
            r7.f1106i0 = r12
            r7.f1107j0 = r12
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.f1119v0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f1097L0 = r0
            android.content.Context r0 = r18.getContext()
            androidx.appcompat.widget.C0304t0.m787a(r7, r0)
            android.text.TextPaint r13 = new android.text.TextPaint
            r14 = 1
            r13.<init>(r14)
            r7.f1091F0 = r13
            android.content.res.Resources r0 = r18.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r13.density = r0
            int[] r2 = p064e.C1495i.f7279v
            androidx.appcompat.widget.y0 r15 = new androidx.appcompat.widget.y0
            android.content.res.TypedArray r6 = r8.obtainStyledAttributes(r9, r2, r10, r12)
            r15.<init>(r8, r6)
            r16 = 0
            r0 = r18
            r1 = r19
            r3 = r20
            r4 = r6
            r5 = r21
            r17 = r6
            r6 = r16
            p227n0.C4661t.m10545u(r0, r1, r2, r3, r4, r5, r6)
            r0 = 2
            android.graphics.drawable.Drawable r1 = r15.m855g(r0)
            r7.f1098a0 = r1
            if (r1 == 0) goto L6e
            r1.setCallback(r7)
        L6e:
            r1 = 11
            android.graphics.drawable.Drawable r1 = r15.m855g(r1)
            r7.f1103f0 = r1
            if (r1 == 0) goto L7b
            r1.setCallback(r7)
        L7b:
            java.lang.CharSequence r1 = r15.m863o(r12)
            r7.f1112o0 = r1
            java.lang.CharSequence r1 = r15.m863o(r14)
            r7.f1113p0 = r1
            r1 = 3
            boolean r2 = r15.m849a(r1, r14)
            r7.f1114q0 = r2
            r2 = 8
            int r2 = r15.m854f(r2, r12)
            r7.f1108k0 = r2
            r2 = 5
            int r2 = r15.m854f(r2, r12)
            r7.f1109l0 = r2
            r2 = 6
            int r2 = r15.m854f(r2, r12)
            r7.f1110m0 = r2
            r2 = 4
            boolean r2 = r15.m849a(r2, r12)
            r7.f1111n0 = r2
            r2 = 9
            android.content.res.ColorStateList r2 = r15.m851c(r2)
            if (r2 == 0) goto Lb7
            r7.f1099b0 = r2
            r7.f1101d0 = r14
        Lb7:
            r2 = 10
            r3 = -1
            int r2 = r15.m858j(r2, r3)
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.C0271e0.m710d(r2, r11)
            android.graphics.PorterDuff$Mode r4 = r7.f1100c0
            if (r4 == r2) goto Lca
            r7.f1100c0 = r2
            r7.f1102e0 = r14
        Lca:
            boolean r2 = r7.f1101d0
            if (r2 != 0) goto Ld2
            boolean r2 = r7.f1102e0
            if (r2 == 0) goto Ld5
        Ld2:
            r18.m617a()
        Ld5:
            r2 = 12
            android.content.res.ColorStateList r2 = r15.m851c(r2)
            if (r2 == 0) goto Le1
            r7.f1104g0 = r2
            r7.f1106i0 = r14
        Le1:
            r2 = 13
            int r2 = r15.m858j(r2, r3)
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.C0271e0.m710d(r2, r11)
            android.graphics.PorterDuff$Mode r4 = r7.f1105h0
            if (r4 == r2) goto Lf3
            r7.f1105h0 = r2
            r7.f1107j0 = r14
        Lf3:
            boolean r2 = r7.f1106i0
            if (r2 != 0) goto Lfb
            boolean r2 = r7.f1107j0
            if (r2 == 0) goto Lfe
        Lfb:
            r18.m618b()
        Lfe:
            r2 = 7
            int r2 = r15.m861m(r2, r12)
            if (r2 == 0) goto L1a7
            int[] r4 = p064e.C1495i.f7280w
            android.content.res.TypedArray r2 = r8.obtainStyledAttributes(r2, r4)
            boolean r4 = r2.hasValue(r1)
            if (r4 == 0) goto L11e
            int r4 = r2.getResourceId(r1, r12)
            if (r4 == 0) goto L11e
            android.content.res.ColorStateList r4 = p102g.C2199a.m5783a(r8, r4)
            if (r4 == 0) goto L11e
            goto L122
        L11e:
            android.content.res.ColorStateList r4 = r2.getColorStateList(r1)
        L122:
            if (r4 == 0) goto L125
            goto L129
        L125:
            android.content.res.ColorStateList r4 = r18.getTextColors()
        L129:
            r7.f1092G0 = r4
            int r4 = r2.getDimensionPixelSize(r12, r12)
            if (r4 == 0) goto L140
            float r4 = (float) r4
            float r5 = r13.getTextSize()
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L140
            r13.setTextSize(r4)
            r18.requestLayout()
        L140:
            int r4 = r2.getInt(r14, r3)
            int r3 = r2.getInt(r0, r3)
            if (r4 == r14) goto L156
            if (r4 == r0) goto L153
            if (r4 == r1) goto L150
            r1 = r11
            goto L158
        L150:
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE
            goto L158
        L153:
            android.graphics.Typeface r1 = android.graphics.Typeface.SERIF
            goto L158
        L156:
            android.graphics.Typeface r1 = android.graphics.Typeface.SANS_SERIF
        L158:
            r4 = 0
            if (r3 <= 0) goto L185
            if (r1 != 0) goto L162
            android.graphics.Typeface r1 = android.graphics.Typeface.defaultFromStyle(r3)
            goto L166
        L162:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r3)
        L166:
            r7.setSwitchTypeface(r1)
            if (r1 == 0) goto L170
            int r1 = r1.getStyle()
            goto L171
        L170:
            r1 = 0
        L171:
            int r1 = ~r1
            r1 = r1 & r3
            r3 = r1 & 1
            if (r3 == 0) goto L178
            goto L179
        L178:
            r14 = 0
        L179:
            r13.setFakeBoldText(r14)
            r0 = r0 & r1
            if (r0 == 0) goto L181
            r4 = -1098907648(0xffffffffbe800000, float:-0.25)
        L181:
            r13.setTextSkewX(r4)
            goto L18e
        L185:
            r13.setFakeBoldText(r12)
            r13.setTextSkewX(r4)
            r7.setSwitchTypeface(r1)
        L18e:
            r0 = 14
            boolean r0 = r2.getBoolean(r0, r12)
            if (r0 == 0) goto L1a2
            j.a r0 = new j.a
            android.content.Context r1 = r18.getContext()
            r0.<init>(r1)
            r7.f1095J0 = r0
            goto L1a4
        L1a2:
            r7.f1095J0 = r11
        L1a4:
            r2.recycle()
        L1a7:
            androidx.appcompat.widget.y r0 = new androidx.appcompat.widget.y
            r0.<init>(r7)
            r0.m836e(r9, r10)
            r17.recycle()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r19)
            int r1 = r0.getScaledTouchSlop()
            r7.f1116s0 = r1
            int r0 = r0.getScaledMinimumFlingVelocity()
            r7.f1120w0 = r0
            r18.refreshDrawableState()
            boolean r0 = r18.isChecked()
            r7.setChecked(r0)
            return
    }

    private boolean getTargetCheckedState() {
            r2 = this;
            float r0 = r2.f1121x0
            r1 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private int getThumbOffset() {
            r2 = this;
            boolean r0 = androidx.appcompat.widget.C0275f1.m724b(r2)
            if (r0 == 0) goto Lc
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r2.f1121x0
            float r0 = r0 - r1
            goto Le
        Lc:
            float r0 = r2.f1121x0
        Le:
            int r1 = r2.getThumbScrollRange()
            float r1 = (float) r1
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            return r0
    }

    private int getThumbScrollRange() {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f1103f0
            if (r0 == 0) goto L26
            android.graphics.Rect r1 = r4.f1097L0
            r0.getPadding(r1)
            android.graphics.drawable.Drawable r0 = r4.f1098a0
            if (r0 == 0) goto L12
            android.graphics.Rect r0 = androidx.appcompat.widget.C0271e0.m709c(r0)
            goto L14
        L12:
            android.graphics.Rect r0 = androidx.appcompat.widget.C0271e0.f1274c
        L14:
            int r2 = r4.f1122y0
            int r3 = r4.f1086A0
            int r2 = r2 - r3
            int r3 = r1.left
            int r2 = r2 - r3
            int r1 = r1.right
            int r2 = r2 - r1
            int r1 = r0.left
            int r2 = r2 - r1
            int r0 = r0.right
            int r2 = r2 - r0
            return r2
        L26:
            r0 = 0
            return r0
    }

    /* renamed from: a */
    public final void m617a() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1098a0
            if (r0 == 0) goto L3b
            boolean r1 = r2.f1101d0
            if (r1 != 0) goto Lc
            boolean r1 = r2.f1102e0
            if (r1 == 0) goto L3b
        Lc:
            android.graphics.drawable.Drawable r0 = p103g0.C2200a.m5792h(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.f1098a0 = r0
            boolean r1 = r2.f1101d0
            if (r1 == 0) goto L1f
            android.content.res.ColorStateList r1 = r2.f1099b0
            r0.setTintList(r1)
        L1f:
            boolean r0 = r2.f1102e0
            if (r0 == 0) goto L2a
            android.graphics.drawable.Drawable r0 = r2.f1098a0
            android.graphics.PorterDuff$Mode r1 = r2.f1100c0
            r0.setTintMode(r1)
        L2a:
            android.graphics.drawable.Drawable r0 = r2.f1098a0
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3b
            android.graphics.drawable.Drawable r0 = r2.f1098a0
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L3b:
            return
    }

    /* renamed from: b */
    public final void m618b() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1103f0
            if (r0 == 0) goto L3b
            boolean r1 = r2.f1106i0
            if (r1 != 0) goto Lc
            boolean r1 = r2.f1107j0
            if (r1 == 0) goto L3b
        Lc:
            android.graphics.drawable.Drawable r0 = p103g0.C2200a.m5792h(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.f1103f0 = r0
            boolean r1 = r2.f1106i0
            if (r1 == 0) goto L1f
            android.content.res.ColorStateList r1 = r2.f1104g0
            r0.setTintList(r1)
        L1f:
            boolean r0 = r2.f1107j0
            if (r0 == 0) goto L2a
            android.graphics.drawable.Drawable r0 = r2.f1103f0
            android.graphics.PorterDuff$Mode r1 = r2.f1105h0
            r0.setTintMode(r1)
        L2a:
            android.graphics.drawable.Drawable r0 = r2.f1103f0
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3b
            android.graphics.drawable.Drawable r0 = r2.f1103f0
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L3b:
            return
    }

    /* renamed from: c */
    public final android.text.Layout m619c(java.lang.CharSequence r9) {
            r8 = this;
            android.text.method.TransformationMethod r0 = r8.f1095J0
            if (r0 == 0) goto L8
            java.lang.CharSequence r9 = r0.getTransformation(r9, r8)
        L8:
            r1 = r9
            android.text.StaticLayout r9 = new android.text.StaticLayout
            android.text.TextPaint r2 = r8.f1091F0
            if (r1 == 0) goto L1b
            float r0 = android.text.Layout.getDesiredWidth(r1, r2)
            double r3 = (double) r0
            double r3 = java.lang.Math.ceil(r3)
            int r0 = (int) r3
            r3 = r0
            goto L1d
        L1b:
            r0 = 0
            r3 = 0
        L1d:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r7 = 1
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    /* renamed from: d */
    public final void m620d() {
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L26
            java.lang.CharSequence r0 = r6.f1113p0
            if (r0 != 0) goto L15
            android.content.res.Resources r0 = r6.getResources()
            r2 = 2131951622(0x7f130006, float:1.9539664E38)
            java.lang.String r0 = r0.getString(r2)
        L15:
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            n0.r r2 = new n0.r
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r4 = 2131362661(0x7f0a0365, float:1.8345109E38)
            r5 = 64
            r2.<init>(r4, r3, r5, r1)
            r2.m10551e(r6, r0)
        L26:
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r11) {
            r10 = this;
            android.graphics.Rect r0 = r10.f1097L0
            int r1 = r10.f1087B0
            int r2 = r10.f1088C0
            int r3 = r10.f1089D0
            int r4 = r10.f1090E0
            int r5 = r10.getThumbOffset()
            int r5 = r5 + r1
            android.graphics.drawable.Drawable r6 = r10.f1098a0
            if (r6 == 0) goto L18
            android.graphics.Rect r6 = androidx.appcompat.widget.C0271e0.m709c(r6)
            goto L1a
        L18:
            android.graphics.Rect r6 = androidx.appcompat.widget.C0271e0.f1274c
        L1a:
            android.graphics.drawable.Drawable r7 = r10.f1103f0
            if (r7 == 0) goto L4f
            r7.getPadding(r0)
            int r7 = r0.left
            int r5 = r5 + r7
            if (r6 == 0) goto L48
            int r8 = r6.left
            if (r8 <= r7) goto L2c
            int r8 = r8 - r7
            int r1 = r1 + r8
        L2c:
            int r7 = r6.top
            int r8 = r0.top
            if (r7 <= r8) goto L35
            int r7 = r7 - r8
            int r7 = r7 + r2
            goto L36
        L35:
            r7 = r2
        L36:
            int r8 = r6.right
            int r9 = r0.right
            if (r8 <= r9) goto L3e
            int r8 = r8 - r9
            int r3 = r3 - r8
        L3e:
            int r6 = r6.bottom
            int r8 = r0.bottom
            if (r6 <= r8) goto L49
            int r6 = r6 - r8
            int r6 = r4 - r6
            goto L4a
        L48:
            r7 = r2
        L49:
            r6 = r4
        L4a:
            android.graphics.drawable.Drawable r8 = r10.f1103f0
            r8.setBounds(r1, r7, r3, r6)
        L4f:
            android.graphics.drawable.Drawable r1 = r10.f1098a0
            if (r1 == 0) goto L6e
            r1.getPadding(r0)
            int r1 = r0.left
            int r1 = r5 - r1
            int r3 = r10.f1086A0
            int r5 = r5 + r3
            int r0 = r0.right
            int r5 = r5 + r0
            android.graphics.drawable.Drawable r0 = r10.f1098a0
            r0.setBounds(r1, r2, r5, r4)
            android.graphics.drawable.Drawable r0 = r10.getBackground()
            if (r0 == 0) goto L6e
            r0.setHotspotBounds(r1, r2, r5, r4)
        L6e:
            super.draw(r11)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float r2, float r3) {
            r1 = this;
            super.drawableHotspotChanged(r2, r3)
            android.graphics.drawable.Drawable r0 = r1.f1098a0
            if (r0 == 0) goto La
            r0.setHotspot(r2, r3)
        La:
            android.graphics.drawable.Drawable r0 = r1.f1103f0
            if (r0 == 0) goto L11
            r0.setHotspot(r2, r3)
        L11:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
            r4 = this;
            super.drawableStateChanged()
            int[] r0 = r4.getDrawableState()
            android.graphics.drawable.Drawable r1 = r4.f1098a0
            r2 = 0
            if (r1 == 0) goto L17
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L17
            boolean r1 = r1.setState(r0)
            r2 = r2 | r1
        L17:
            android.graphics.drawable.Drawable r1 = r4.f1103f0
            if (r1 == 0) goto L26
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L26
            boolean r0 = r1.setState(r0)
            r2 = r2 | r0
        L26:
            if (r2 == 0) goto L2b
            r4.invalidate()
        L2b:
            return
    }

    /* renamed from: e */
    public final void m621e() {
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L26
            java.lang.CharSequence r0 = r6.f1112o0
            if (r0 != 0) goto L15
            android.content.res.Resources r0 = r6.getResources()
            r2 = 2131951623(0x7f130007, float:1.9539666E38)
            java.lang.String r0 = r0.getString(r2)
        L15:
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            n0.r r2 = new n0.r
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r4 = 2131362661(0x7f0a0365, float:1.8345109E38)
            r5 = 64
            r2.<init>(r4, r3, r5, r1)
            r2.m10551e(r6, r0)
        L26:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
            r2 = this;
            boolean r0 = androidx.appcompat.widget.C0275f1.m724b(r2)
            if (r0 != 0) goto Lb
            int r0 = super.getCompoundPaddingLeft()
            return r0
        Lb:
            int r0 = super.getCompoundPaddingLeft()
            int r1 = r2.f1122y0
            int r0 = r0 + r1
            java.lang.CharSequence r1 = r2.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1f
            int r1 = r2.f1110m0
            int r0 = r0 + r1
        L1f:
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
            r2 = this;
            boolean r0 = androidx.appcompat.widget.C0275f1.m724b(r2)
            if (r0 == 0) goto Lb
            int r0 = super.getCompoundPaddingRight()
            return r0
        Lb:
            int r0 = super.getCompoundPaddingRight()
            int r1 = r2.f1122y0
            int r0 = r0 + r1
            java.lang.CharSequence r1 = r2.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1f
            int r1 = r2.f1110m0
            int r0 = r0 + r1
        L1f:
            return r0
    }

    public boolean getShowText() {
            r1 = this;
            boolean r0 = r1.f1114q0
            return r0
    }

    public boolean getSplitTrack() {
            r1 = this;
            boolean r0 = r1.f1111n0
            return r0
    }

    public int getSwitchMinWidth() {
            r1 = this;
            int r0 = r1.f1109l0
            return r0
    }

    public int getSwitchPadding() {
            r1 = this;
            int r0 = r1.f1110m0
            return r0
    }

    public java.lang.CharSequence getTextOff() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f1113p0
            return r0
    }

    public java.lang.CharSequence getTextOn() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f1112o0
            return r0
    }

    public android.graphics.drawable.Drawable getThumbDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1098a0
            return r0
    }

    public int getThumbTextPadding() {
            r1 = this;
            int r0 = r1.f1108k0
            return r0
    }

    public android.content.res.ColorStateList getThumbTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f1099b0
            return r0
    }

    public android.graphics.PorterDuff.Mode getThumbTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f1100c0
            return r0
    }

    public android.graphics.drawable.Drawable getTrackDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f1103f0
            return r0
    }

    public android.content.res.ColorStateList getTrackTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f1104g0
            return r0
    }

    public android.graphics.PorterDuff.Mode getTrackTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f1105h0
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.f1098a0
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            android.graphics.drawable.Drawable r0 = r1.f1103f0
            if (r0 == 0) goto L11
            r0.jumpToCurrentState()
        L11:
            android.animation.ObjectAnimator r0 = r1.f1096K0
            if (r0 == 0) goto L23
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L23
            android.animation.ObjectAnimator r0 = r1.f1096K0
            r0.end()
            r0 = 0
            r1.f1096K0 = r0
        L23:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int[] r2 = super.onCreateDrawableState(r2)
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L11
            int[] r0 = androidx.appcompat.widget.SwitchCompat.f1085N0
            android.widget.CompoundButton.mergeDrawableStates(r2, r0)
        L11:
            return r2
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            super.onDraw(r10)
            android.graphics.Rect r0 = r9.f1097L0
            android.graphics.drawable.Drawable r1 = r9.f1103f0
            if (r1 == 0) goto Ld
            r1.getPadding(r0)
            goto L10
        Ld:
            r0.setEmpty()
        L10:
            int r2 = r9.f1088C0
            int r3 = r9.f1090E0
            int r4 = r0.top
            int r2 = r2 + r4
            int r4 = r0.bottom
            int r3 = r3 - r4
            android.graphics.drawable.Drawable r4 = r9.f1098a0
            if (r1 == 0) goto L4c
            boolean r5 = r9.f1111n0
            if (r5 == 0) goto L49
            if (r4 == 0) goto L49
            android.graphics.Rect r5 = androidx.appcompat.widget.C0271e0.m709c(r4)
            r4.copyBounds(r0)
            int r6 = r0.left
            int r7 = r5.left
            int r6 = r6 + r7
            r0.left = r6
            int r6 = r0.right
            int r5 = r5.right
            int r6 = r6 - r5
            r0.right = r6
            int r5 = r10.save()
            android.graphics.Region$Op r6 = android.graphics.Region.Op.DIFFERENCE
            r10.clipRect(r0, r6)
            r1.draw(r10)
            r10.restoreToCount(r5)
            goto L4c
        L49:
            r1.draw(r10)
        L4c:
            int r0 = r10.save()
            if (r4 == 0) goto L55
            r4.draw(r10)
        L55:
            boolean r1 = r9.getTargetCheckedState()
            if (r1 == 0) goto L5e
            android.text.Layout r1 = r9.f1093H0
            goto L60
        L5e:
            android.text.Layout r1 = r9.f1094I0
        L60:
            if (r1 == 0) goto La3
            int[] r5 = r9.getDrawableState()
            android.content.res.ColorStateList r6 = r9.f1092G0
            if (r6 == 0) goto L74
            android.text.TextPaint r7 = r9.f1091F0
            r8 = 0
            int r6 = r6.getColorForState(r5, r8)
            r7.setColor(r6)
        L74:
            android.text.TextPaint r6 = r9.f1091F0
            r6.drawableState = r5
            if (r4 == 0) goto L84
            android.graphics.Rect r4 = r4.getBounds()
            int r5 = r4.left
            int r4 = r4.right
            int r5 = r5 + r4
            goto L88
        L84:
            int r5 = r9.getWidth()
        L88:
            int r5 = r5 / 2
            int r4 = r1.getWidth()
            int r4 = r4 / 2
            int r5 = r5 - r4
            int r2 = r2 + r3
            int r2 = r2 / 2
            int r3 = r1.getHeight()
            int r3 = r3 / 2
            int r2 = r2 - r3
            float r3 = (float) r5
            float r2 = (float) r2
            r10.translate(r3, r2)
            r1.draw(r10)
        La3:
            r10.restoreToCount(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = "android.widget.Switch"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            super.onInitializeAccessibilityNodeInfo(r4)
            java.lang.String r0 = "android.widget.Switch"
            r4.setClassName(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto L40
            boolean r0 = r3.isChecked()
            if (r0 == 0) goto L17
            java.lang.CharSequence r0 = r3.f1112o0
            goto L19
        L17:
            java.lang.CharSequence r0 = r3.f1113p0
        L19:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L40
            java.lang.CharSequence r1 = r4.getText()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L2d
            r4.setText(r0)
            goto L40
        L2d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r1 = 32
            r2.append(r1)
            r2.append(r0)
            r4.setText(r2)
        L40:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            android.graphics.drawable.Drawable r2 = r1.f1098a0
            r3 = 0
            if (r2 == 0) goto L2e
            android.graphics.Rect r2 = r1.f1097L0
            android.graphics.drawable.Drawable r4 = r1.f1103f0
            if (r4 == 0) goto L12
            r4.getPadding(r2)
            goto L15
        L12:
            r2.setEmpty()
        L15:
            android.graphics.drawable.Drawable r4 = r1.f1098a0
            android.graphics.Rect r4 = androidx.appcompat.widget.C0271e0.m709c(r4)
            int r5 = r4.left
            int r6 = r2.left
            int r5 = r5 - r6
            int r5 = java.lang.Math.max(r3, r5)
            int r4 = r4.right
            int r2 = r2.right
            int r4 = r4 - r2
            int r3 = java.lang.Math.max(r3, r4)
            goto L2f
        L2e:
            r5 = 0
        L2f:
            boolean r2 = androidx.appcompat.widget.C0275f1.m724b(r1)
            if (r2 == 0) goto L40
            int r2 = r1.getPaddingLeft()
            int r2 = r2 + r5
            int r4 = r1.f1122y0
            int r4 = r4 + r2
            int r4 = r4 - r5
            int r4 = r4 - r3
            goto L51
        L40:
            int r2 = r1.getWidth()
            int r4 = r1.getPaddingRight()
            int r2 = r2 - r4
            int r4 = r2 - r3
            int r2 = r1.f1122y0
            int r2 = r4 - r2
            int r2 = r2 + r5
            int r2 = r2 + r3
        L51:
            int r3 = r1.getGravity()
            r3 = r3 & 112(0x70, float:1.57E-43)
            r5 = 16
            if (r3 == r5) goto L76
            r5 = 80
            if (r3 == r5) goto L67
            int r3 = r1.getPaddingTop()
            int r5 = r1.f1123z0
            int r5 = r5 + r3
            goto L8f
        L67:
            int r3 = r1.getHeight()
            int r5 = r1.getPaddingBottom()
            int r5 = r3 - r5
            int r3 = r1.f1123z0
            int r3 = r5 - r3
            goto L8f
        L76:
            int r3 = r1.getPaddingTop()
            int r5 = r1.getHeight()
            int r5 = r5 + r3
            int r3 = r1.getPaddingBottom()
            int r5 = r5 - r3
            int r5 = r5 / 2
            int r3 = r1.f1123z0
            int r6 = r3 / 2
            int r5 = r5 - r6
            int r3 = r3 + r5
            r0 = r5
            r5 = r3
            r3 = r0
        L8f:
            r1.f1087B0 = r2
            r1.f1088C0 = r3
            r1.f1090E0 = r5
            r1.f1089D0 = r4
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r7, int r8) {
            r6 = this;
            boolean r0 = r6.f1114q0
            if (r0 == 0) goto L1c
            android.text.Layout r0 = r6.f1093H0
            if (r0 != 0) goto L10
            java.lang.CharSequence r0 = r6.f1112o0
            android.text.Layout r0 = r6.m619c(r0)
            r6.f1093H0 = r0
        L10:
            android.text.Layout r0 = r6.f1094I0
            if (r0 != 0) goto L1c
            java.lang.CharSequence r0 = r6.f1113p0
            android.text.Layout r0 = r6.m619c(r0)
            r6.f1094I0 = r0
        L1c:
            android.graphics.Rect r0 = r6.f1097L0
            android.graphics.drawable.Drawable r1 = r6.f1098a0
            r2 = 0
            if (r1 == 0) goto L39
            r1.getPadding(r0)
            android.graphics.drawable.Drawable r1 = r6.f1098a0
            int r1 = r1.getIntrinsicWidth()
            int r3 = r0.left
            int r1 = r1 - r3
            int r3 = r0.right
            int r1 = r1 - r3
            android.graphics.drawable.Drawable r3 = r6.f1098a0
            int r3 = r3.getIntrinsicHeight()
            goto L3b
        L39:
            r1 = 0
            r3 = 0
        L3b:
            boolean r4 = r6.f1114q0
            if (r4 == 0) goto L55
            android.text.Layout r4 = r6.f1093H0
            int r4 = r4.getWidth()
            android.text.Layout r5 = r6.f1094I0
            int r5 = r5.getWidth()
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = r6.f1108k0
            int r5 = r5 * 2
            int r5 = r5 + r4
            goto L56
        L55:
            r5 = 0
        L56:
            int r1 = java.lang.Math.max(r5, r1)
            r6.f1086A0 = r1
            android.graphics.drawable.Drawable r1 = r6.f1103f0
            if (r1 == 0) goto L6a
            r1.getPadding(r0)
            android.graphics.drawable.Drawable r1 = r6.f1103f0
            int r2 = r1.getIntrinsicHeight()
            goto L6d
        L6a:
            r0.setEmpty()
        L6d:
            int r1 = r0.left
            int r0 = r0.right
            android.graphics.drawable.Drawable r4 = r6.f1098a0
            if (r4 == 0) goto L85
            android.graphics.Rect r4 = androidx.appcompat.widget.C0271e0.m709c(r4)
            int r5 = r4.left
            int r1 = java.lang.Math.max(r1, r5)
            int r4 = r4.right
            int r0 = java.lang.Math.max(r0, r4)
        L85:
            int r4 = r6.f1109l0
            int r5 = r6.f1086A0
            int r5 = r5 * 2
            int r5 = r5 + r1
            int r5 = r5 + r0
            int r0 = java.lang.Math.max(r4, r5)
            int r1 = java.lang.Math.max(r2, r3)
            r6.f1122y0 = r0
            r6.f1123z0 = r1
            super.onMeasure(r7, r8)
            int r7 = r6.getMeasuredHeight()
            if (r7 >= r1) goto La9
            int r7 = r6.getMeasuredWidthAndState()
            r6.setMeasuredDimension(r7, r1)
        La9:
            return
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onPopulateAccessibilityEvent(r2)
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto Lc
            java.lang.CharSequence r0 = r1.f1112o0
            goto Le
        Lc:
            java.lang.CharSequence r0 = r1.f1113p0
        Le:
            if (r0 == 0) goto L17
            java.util.List r2 = r2.getText()
            r2.add(r0)
        L17:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r11) {
            r10 = this;
            android.view.VelocityTracker r0 = r10.f1119v0
            r0.addMovement(r11)
            int r0 = r11.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L100
            r3 = 3
            r4 = 0
            r5 = 2
            if (r0 == r2) goto L93
            if (r0 == r5) goto L18
            if (r0 == r3) goto L93
            goto L153
        L18:
            int r0 = r10.f1115r0
            if (r0 == r2) goto L5f
            if (r0 == r5) goto L20
            goto L153
        L20:
            float r11 = r11.getX()
            int r0 = r10.getThumbScrollRange()
            float r1 = r10.f1117t0
            float r1 = r11 - r1
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L33
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L3e
        L33:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L3a
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L3e
        L3a:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3e:
            boolean r0 = androidx.appcompat.widget.C0275f1.m724b(r10)
            if (r0 == 0) goto L45
            float r1 = -r1
        L45:
            float r0 = r10.f1121x0
            float r1 = r1 + r0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 >= 0) goto L4d
            goto L55
        L4d:
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L54
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L55
        L54:
            r4 = r1
        L55:
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L5e
            r10.f1117t0 = r11
            r10.setThumbPosition(r4)
        L5e:
            return r2
        L5f:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r3 = r10.f1117t0
            float r3 = r0 - r3
            float r3 = java.lang.Math.abs(r3)
            int r4 = r10.f1116s0
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L85
            float r3 = r10.f1118u0
            float r3 = r1 - r3
            float r3 = java.lang.Math.abs(r3)
            int r4 = r10.f1116s0
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L153
        L85:
            r10.f1115r0 = r5
            android.view.ViewParent r11 = r10.getParent()
            r11.requestDisallowInterceptTouchEvent(r2)
            r10.f1117t0 = r0
            r10.f1118u0 = r1
            return r2
        L93:
            int r0 = r10.f1115r0
            if (r0 != r5) goto Lf8
            r10.f1115r0 = r1
            int r0 = r11.getAction()
            if (r0 != r2) goto La7
            boolean r0 = r10.isEnabled()
            if (r0 == 0) goto La7
            r0 = 1
            goto La8
        La7:
            r0 = 0
        La8:
            boolean r5 = r10.isChecked()
            if (r0 == 0) goto Lde
            android.view.VelocityTracker r0 = r10.f1119v0
            r6 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r6)
            android.view.VelocityTracker r0 = r10.f1119v0
            float r0 = r0.getXVelocity()
            float r6 = java.lang.Math.abs(r0)
            int r7 = r10.f1120w0
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto Ld9
            boolean r6 = androidx.appcompat.widget.C0275f1.m724b(r10)
            if (r6 == 0) goto Ld1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto Ld7
            goto Ld5
        Ld1:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto Ld7
        Ld5:
            r0 = 1
            goto Ldf
        Ld7:
            r0 = 0
            goto Ldf
        Ld9:
            boolean r0 = r10.getTargetCheckedState()
            goto Ldf
        Lde:
            r0 = r5
        Ldf:
            if (r0 == r5) goto Le4
            r10.playSoundEffect(r1)
        Le4:
            r10.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r11)
            r0.setAction(r3)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r11)
            return r2
        Lf8:
            r10.f1115r0 = r1
            android.view.VelocityTracker r0 = r10.f1119v0
            r0.clear()
            goto L153
        L100:
            float r0 = r11.getX()
            float r3 = r11.getY()
            boolean r4 = r10.isEnabled()
            if (r4 == 0) goto L153
            android.graphics.drawable.Drawable r4 = r10.f1098a0
            if (r4 != 0) goto L113
            goto L14b
        L113:
            int r4 = r10.getThumbOffset()
            android.graphics.drawable.Drawable r5 = r10.f1098a0
            android.graphics.Rect r6 = r10.f1097L0
            r5.getPadding(r6)
            int r5 = r10.f1088C0
            int r6 = r10.f1116s0
            int r5 = r5 - r6
            int r7 = r10.f1087B0
            int r7 = r7 + r4
            int r7 = r7 - r6
            int r4 = r10.f1086A0
            int r4 = r4 + r7
            android.graphics.Rect r8 = r10.f1097L0
            int r9 = r8.left
            int r4 = r4 + r9
            int r8 = r8.right
            int r4 = r4 + r8
            int r4 = r4 + r6
            int r8 = r10.f1090E0
            int r8 = r8 + r6
            float r6 = (float) r7
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L14b
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L14b
            float r4 = (float) r5
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L14b
            float r4 = (float) r8
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L14b
            r1 = 1
        L14b:
            if (r1 == 0) goto L153
            r10.f1115r0 = r2
            r10.f1117t0 = r0
            r10.f1118u0 = r3
        L153:
            boolean r11 = super.onTouchEvent(r11)
            return r11
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r5) {
            r4 = this;
            super.setChecked(r5)
            boolean r5 = r4.isChecked()
            if (r5 == 0) goto Ld
            r4.m621e()
            goto L10
        Ld:
            r4.m620d()
        L10:
            android.os.IBinder r0 = r4.getWindowToken()
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            if (r0 == 0) goto L43
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.f.m10588c(r4)
            if (r0 == 0) goto L43
            if (r5 == 0) goto L24
            goto L25
        L24:
            r1 = 0
        L25:
            android.util.Property<androidx.appcompat.widget.SwitchCompat, java.lang.Float> r5 = androidx.appcompat.widget.SwitchCompat.f1084M0
            r0 = 1
            float[] r2 = new float[r0]
            r3 = 0
            r2[r3] = r1
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r4, r5, r2)
            r4.f1096K0 = r5
            r1 = 250(0xfa, double:1.235E-321)
            r5.setDuration(r1)
            android.animation.ObjectAnimator r5 = r4.f1096K0
            r5.setAutoCancel(r0)
            android.animation.ObjectAnimator r5 = r4.f1096K0
            r5.start()
            goto L51
        L43:
            android.animation.ObjectAnimator r0 = r4.f1096K0
            if (r0 == 0) goto L4a
            r0.cancel()
        L4a:
            if (r5 == 0) goto L4d
            goto L4e
        L4d:
            r1 = 0
        L4e:
            r4.setThumbPosition(r1)
        L51:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = p280q0.C5540g.m11823g(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setShowText(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1114q0
            if (r0 == r2) goto L9
            r1.f1114q0 = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setSplitTrack(boolean r1) {
            r0 = this;
            r0.f1111n0 = r1
            r0.invalidate()
            return
    }

    public void setSwitchMinWidth(int r1) {
            r0 = this;
            r0.f1109l0 = r1
            r0.requestLayout()
            return
    }

    public void setSwitchPadding(int r1) {
            r0 = this;
            r0.f1110m0 = r1
            r0.requestLayout()
            return
    }

    public void setSwitchTypeface(android.graphics.Typeface r2) {
            r1 = this;
            android.text.TextPaint r0 = r1.f1091F0
            android.graphics.Typeface r0 = r0.getTypeface()
            if (r0 == 0) goto L14
            android.text.TextPaint r0 = r1.f1091F0
            android.graphics.Typeface r0 = r0.getTypeface()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
        L14:
            android.text.TextPaint r0 = r1.f1091F0
            android.graphics.Typeface r0 = r0.getTypeface()
            if (r0 != 0) goto L29
            if (r2 == 0) goto L29
        L1e:
            android.text.TextPaint r0 = r1.f1091F0
            r0.setTypeface(r2)
            r1.requestLayout()
            r1.invalidate()
        L29:
            return
    }

    public void setTextOff(java.lang.CharSequence r1) {
            r0 = this;
            r0.f1113p0 = r1
            r0.requestLayout()
            boolean r1 = r0.isChecked()
            if (r1 != 0) goto Le
            r0.m620d()
        Le:
            return
    }

    public void setTextOn(java.lang.CharSequence r1) {
            r0 = this;
            r0.f1112o0 = r1
            r0.requestLayout()
            boolean r1 = r0.isChecked()
            if (r1 == 0) goto Le
            r0.m621e()
        Le:
            return
    }

    public void setThumbDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1098a0
            if (r0 == 0) goto L8
            r1 = 0
            r0.setCallback(r1)
        L8:
            r2.f1098a0 = r3
            if (r3 == 0) goto Lf
            r3.setCallback(r2)
        Lf:
            r2.requestLayout()
            return
    }

    public void setThumbPosition(float r1) {
            r0 = this;
            r0.f1121x0 = r1
            r0.invalidate()
            return
    }

    public void setThumbResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r0, r2)
            r1.setThumbDrawable(r2)
            return
    }

    public void setThumbTextPadding(int r1) {
            r0 = this;
            r0.f1108k0 = r1
            r0.requestLayout()
            return
    }

    public void setThumbTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f1099b0 = r1
            r1 = 1
            r0.f1101d0 = r1
            r0.m617a()
            return
    }

    public void setThumbTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.f1100c0 = r1
            r1 = 1
            r0.f1102e0 = r1
            r0.m617a()
            return
    }

    public void setTrackDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1103f0
            if (r0 == 0) goto L8
            r1 = 0
            r0.setCallback(r1)
        L8:
            r2.f1103f0 = r3
            if (r3 == 0) goto Lf
            r3.setCallback(r2)
        Lf:
            r2.requestLayout()
            return
    }

    public void setTrackResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r0, r2)
            r1.setTrackDrawable(r2)
            return
    }

    public void setTrackTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f1104g0 = r1
            r1 = 1
            r0.f1106i0 = r1
            r0.m618b()
            return
    }

    public void setTrackTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.f1105h0 = r1
            r1 = 1
            r0.f1107j0 = r1
            r0.m618b()
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
            r1 = this;
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.f1098a0
            if (r2 == r0) goto L11
            android.graphics.drawable.Drawable r0 = r1.f1103f0
            if (r2 != r0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }
}
