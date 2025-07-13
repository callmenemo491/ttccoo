package com.google.android.material.button;

/* loaded from: classes.dex */
public class MaterialButton extends androidx.appcompat.widget.C0276g implements android.widget.Checkable, p340t8.InterfaceC6196m {

    /* renamed from: p0 */
    public static final int[] f5899p0 = null;

    /* renamed from: q0 */
    public static final int[] f5900q0 = null;

    /* renamed from: c0 */
    public final p025b8.C0687a f5901c0;

    /* renamed from: d0 */
    public final java.util.LinkedHashSet<com.google.android.material.button.MaterialButton.InterfaceC1136a> f5902d0;

    /* renamed from: e0 */
    public com.google.android.material.button.MaterialButton.InterfaceC1137b f5903e0;

    /* renamed from: f0 */
    public android.graphics.PorterDuff.Mode f5904f0;

    /* renamed from: g0 */
    public android.content.res.ColorStateList f5905g0;

    /* renamed from: h0 */
    public android.graphics.drawable.Drawable f5906h0;

    /* renamed from: i0 */
    public int f5907i0;

    /* renamed from: j0 */
    public int f5908j0;

    /* renamed from: k0 */
    public int f5909k0;

    /* renamed from: l0 */
    public int f5910l0;

    /* renamed from: m0 */
    public boolean f5911m0;

    /* renamed from: n0 */
    public boolean f5912n0;

    /* renamed from: o0 */
    public int f5913o0;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface InterfaceC1136a {
        /* renamed from: a */
        void mo3315a(com.google.android.material.button.MaterialButton r1, boolean r2);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    public interface InterfaceC1137b {
    }

    /* renamed from: com.google.android.material.button.MaterialButton$c */
    public static class C1138c extends p320s0.AbstractC5943a {
        public static final android.os.Parcelable.Creator<com.google.android.material.button.MaterialButton.C1138c> CREATOR = null;

        /* renamed from: a0 */
        public boolean f5914a0;

        /* renamed from: com.google.android.material.button.MaterialButton$c$a */
        public static class a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.button.MaterialButton.C1138c> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    com.google.android.material.button.MaterialButton$c r0 = new com.google.android.material.button.MaterialButton$c
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.button.MaterialButton.C1138c createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    com.google.android.material.button.MaterialButton$c r0 = new com.google.android.material.button.MaterialButton$c
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.button.MaterialButton$c[] r1 = new com.google.android.material.button.MaterialButton.C1138c[r1]
                    return r1
            }
        }

        static {
                com.google.android.material.button.MaterialButton$c$a r0 = new com.google.android.material.button.MaterialButton$c$a
                r0.<init>()
                com.google.android.material.button.MaterialButton.C1138c.CREATOR = r0
                return
        }

        public C1138c(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                if (r2 != 0) goto La
                java.lang.Class<com.google.android.material.button.MaterialButton$c> r2 = com.google.android.material.button.MaterialButton.C1138c.class
                r2.getClassLoader()
            La:
                int r1 = r1.readInt()
                r2 = 1
                if (r1 != r2) goto L12
                goto L13
            L12:
                r2 = 0
            L13:
                r0.f5914a0 = r2
                return
        }

        public C1138c(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p320s0.AbstractC5943a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                android.os.Parcelable r0 = r1.f22819Y
                r2.writeParcelable(r0, r3)
                boolean r3 = r1.f5914a0
                r2.writeInt(r3)
                return
        }
    }

    static {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16842911(0x101009f, float:2.3694004E-38)
            r3 = 0
            r1[r3] = r2
            com.google.android.material.button.MaterialButton.f5899p0 = r1
            int[] r0 = new int[r0]
            r1 = 16842912(0x10100a0, float:2.3694006E-38)
            r0[r3] = r1
            com.google.android.material.button.MaterialButton.f5900q0 = r0
            return
    }

    public MaterialButton(android.content.Context r10, android.util.AttributeSet r11) {
            r9 = this;
            r0 = 2132017918(0x7f1402fe, float:1.9674128E38)
            r1 = 2130969221(0x7f040285, float:1.7547118E38)
            android.content.Context r10 = p431y8.C7133a.m14245a(r10, r11, r1, r0)
            r9.<init>(r10, r11, r1)
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            r9.f5902d0 = r10
            r10 = 0
            r9.f5911m0 = r10
            r9.f5912n0 = r10
            android.content.Context r8 = r9.getContext()
            int[] r4 = p339t7.C6183a.f24023t
            int[] r7 = new int[r10]
            r6 = 2132017918(0x7f1402fe, float:1.9674128E38)
            r5 = 2130969221(0x7f040285, float:1.7547118E38)
            r2 = r8
            r3 = r11
            android.content.res.TypedArray r2 = p220m8.C4429m.m9881d(r2, r3, r4, r5, r6, r7)
            r3 = 12
            int r3 = r2.getDimensionPixelSize(r3, r10)
            r9.f5910l0 = r3
            r3 = 15
            r4 = -1
            int r3 = r2.getInt(r3, r4)
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r3 = p220m8.C4430n.m9887e(r3, r5)
            r9.f5904f0 = r3
            android.content.Context r3 = r9.getContext()
            r5 = 14
            android.content.res.ColorStateList r3 = p288q8.C5599c.m11875a(r3, r2, r5)
            r9.f5905g0 = r3
            android.content.Context r3 = r9.getContext()
            r5 = 10
            android.graphics.drawable.Drawable r3 = p288q8.C5599c.m11878d(r3, r2, r5)
            r9.f5906h0 = r3
            r3 = 11
            r5 = 1
            int r3 = r2.getInteger(r3, r5)
            r9.f5913o0 = r3
            r3 = 13
            int r3 = r2.getDimensionPixelSize(r3, r10)
            r9.f5907i0 = r3
            t8.i$b r11 = p340t8.C6192i.m12783b(r8, r11, r1, r0)
            t8.i r11 = r11.m12788a()
            b8.a r0 = new b8.a
            r0.<init>(r9, r11)
            r9.f5901c0 = r0
            int r11 = r2.getDimensionPixelOffset(r5, r10)
            r0.f3876c = r11
            r11 = 2
            int r11 = r2.getDimensionPixelOffset(r11, r10)
            r0.f3877d = r11
            r11 = 3
            int r11 = r2.getDimensionPixelOffset(r11, r10)
            r0.f3878e = r11
            r11 = 4
            int r11 = r2.getDimensionPixelOffset(r11, r10)
            r0.f3879f = r11
            r11 = 8
            boolean r1 = r2.hasValue(r11)
            if (r1 == 0) goto Lb1
            int r11 = r2.getDimensionPixelSize(r11, r4)
            r0.f3880g = r11
            t8.i r1 = r0.f3875b
            float r11 = (float) r11
            t8.i r11 = r1.m12786e(r11)
            r0.m2252e(r11)
            r0.f3889p = r5
        Lb1:
            r11 = 20
            int r11 = r2.getDimensionPixelSize(r11, r10)
            r0.f3881h = r11
            r11 = 7
            int r11 = r2.getInt(r11, r4)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r11 = p220m8.C4430n.m9887e(r11, r1)
            r0.f3882i = r11
            android.content.Context r11 = r9.getContext()
            r1 = 6
            android.content.res.ColorStateList r11 = p288q8.C5599c.m11875a(r11, r2, r1)
            r0.f3883j = r11
            android.content.Context r11 = r9.getContext()
            r1 = 19
            android.content.res.ColorStateList r11 = p288q8.C5599c.m11875a(r11, r2, r1)
            r0.f3884k = r11
            android.content.Context r11 = r9.getContext()
            r1 = 16
            android.content.res.ColorStateList r11 = p288q8.C5599c.m11875a(r11, r2, r1)
            r0.f3885l = r11
            r11 = 5
            boolean r11 = r2.getBoolean(r11, r10)
            r0.f3890q = r11
            r11 = 9
            int r11 = r2.getDimensionPixelSize(r11, r10)
            r0.f3892s = r11
            java.util.WeakHashMap<android.view.View, n0.w> r11 = p227n0.C4661t.f18570a
            int r11 = p227n0.C4661t.d.m10577f(r9)
            int r1 = r9.getPaddingTop()
            int r3 = p227n0.C4661t.d.m10576e(r9)
            int r4 = r9.getPaddingBottom()
            boolean r6 = r2.hasValue(r10)
            if (r6 == 0) goto L11d
            r0.f3888o = r5
            android.content.res.ColorStateList r6 = r0.f3883j
            r9.setSupportBackgroundTintList(r6)
            android.graphics.PorterDuff$Mode r6 = r0.f3882i
            r9.setSupportBackgroundTintMode(r6)
            goto L120
        L11d:
            r0.m2254g()
        L120:
            int r6 = r0.f3876c
            int r11 = r11 + r6
            int r6 = r0.f3878e
            int r1 = r1 + r6
            int r6 = r0.f3877d
            int r3 = r3 + r6
            int r0 = r0.f3879f
            int r4 = r4 + r0
            p227n0.C4661t.d.m10582k(r9, r11, r1, r3, r4)
            r2.recycle()
            int r11 = r9.f5910l0
            r9.setCompoundDrawablePadding(r11)
            android.graphics.drawable.Drawable r11 = r9.f5906h0
            if (r11 == 0) goto L13c
            r10 = 1
        L13c:
            r9.m3312g(r10)
            return
    }

    private java.lang.String getA11yClassName() {
            r1 = this;
            boolean r0 = r1.m3306a()
            if (r0 == 0) goto L9
            java.lang.Class<android.widget.CompoundButton> r0 = android.widget.CompoundButton.class
            goto Lb
        L9:
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
        Lb:
            java.lang.String r0 = r0.getName()
            return r0
    }

    private int getTextHeight() {
            r5 = this;
            android.text.TextPaint r0 = r5.getPaint()
            java.lang.CharSequence r1 = r5.getText()
            java.lang.String r1 = r1.toString()
            android.text.method.TransformationMethod r2 = r5.getTransformationMethod()
            if (r2 == 0) goto L1e
            android.text.method.TransformationMethod r2 = r5.getTransformationMethod()
            java.lang.CharSequence r1 = r2.getTransformation(r1, r5)
            java.lang.String r1 = r1.toString()
        L1e:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r3 = 0
            int r4 = r1.length()
            r0.getTextBounds(r1, r3, r4, r2)
            int r0 = r2.height()
            android.text.Layout r1 = r5.getLayout()
            int r1 = r1.getHeight()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    private int getTextWidth() {
            r3 = this;
            android.text.TextPaint r0 = r3.getPaint()
            java.lang.CharSequence r1 = r3.getText()
            java.lang.String r1 = r1.toString()
            android.text.method.TransformationMethod r2 = r3.getTransformationMethod()
            if (r2 == 0) goto L1e
            android.text.method.TransformationMethod r2 = r3.getTransformationMethod()
            java.lang.CharSequence r1 = r2.getTransformation(r1, r3)
            java.lang.String r1 = r1.toString()
        L1e:
            float r0 = r0.measureText(r1)
            int r0 = (int) r0
            android.text.Layout r1 = r3.getLayout()
            int r1 = r1.getEllipsizedWidth()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    /* renamed from: a */
    public boolean m3306a() {
            r1 = this;
            b8.a r0 = r1.f5901c0
            if (r0 == 0) goto La
            boolean r0 = r0.f3890q
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* renamed from: b */
    public final boolean m3307b() {
            r2 = this;
            int r0 = r2.f5913o0
            r1 = 3
            if (r0 == r1) goto Lb
            r1 = 4
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    /* renamed from: c */
    public final boolean m3308c() {
            r3 = this;
            int r0 = r3.f5913o0
            r1 = 1
            if (r0 == r1) goto La
            r2 = 2
            if (r0 != r2) goto L9
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    /* renamed from: d */
    public final boolean m3309d() {
            r2 = this;
            int r0 = r2.f5913o0
            r1 = 16
            if (r0 == r1) goto Ld
            r1 = 32
            if (r0 != r1) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    /* renamed from: e */
    public final boolean m3310e() {
            r1 = this;
            b8.a r0 = r1.f5901c0
            if (r0 == 0) goto La
            boolean r0 = r0.f3888o
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* renamed from: f */
    public final void m3311f() {
            r2 = this;
            boolean r0 = r2.m3308c()
            r1 = 0
            if (r0 == 0) goto Ld
            android.graphics.drawable.Drawable r0 = r2.f5906h0
            r2.setCompoundDrawablesRelative(r0, r1, r1, r1)
            goto L24
        Ld:
            boolean r0 = r2.m3307b()
            if (r0 == 0) goto L19
            android.graphics.drawable.Drawable r0 = r2.f5906h0
            r2.setCompoundDrawablesRelative(r1, r1, r0, r1)
            goto L24
        L19:
            boolean r0 = r2.m3309d()
            if (r0 == 0) goto L24
            android.graphics.drawable.Drawable r0 = r2.f5906h0
            r2.setCompoundDrawablesRelative(r1, r0, r1, r1)
        L24:
            return
    }

    /* renamed from: g */
    public final void m3312g(boolean r6) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.f5906h0
            if (r0 == 0) goto L3d
            android.graphics.drawable.Drawable r0 = p103g0.C2200a.m5792h(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r5.f5906h0 = r0
            android.content.res.ColorStateList r1 = r5.f5905g0
            r0.setTintList(r1)
            android.graphics.PorterDuff$Mode r0 = r5.f5904f0
            if (r0 == 0) goto L1c
            android.graphics.drawable.Drawable r1 = r5.f5906h0
            r1.setTintMode(r0)
        L1c:
            int r0 = r5.f5907i0
            if (r0 == 0) goto L21
            goto L27
        L21:
            android.graphics.drawable.Drawable r0 = r5.f5906h0
            int r0 = r0.getIntrinsicWidth()
        L27:
            int r1 = r5.f5907i0
            if (r1 == 0) goto L2c
            goto L32
        L2c:
            android.graphics.drawable.Drawable r1 = r5.f5906h0
            int r1 = r1.getIntrinsicHeight()
        L32:
            android.graphics.drawable.Drawable r2 = r5.f5906h0
            int r3 = r5.f5908j0
            int r4 = r5.f5909k0
            int r0 = r0 + r3
            int r1 = r1 + r4
            r2.setBounds(r3, r4, r0, r1)
        L3d:
            if (r6 == 0) goto L43
            r5.m3311f()
            return
        L43:
            android.graphics.drawable.Drawable[] r6 = r5.getCompoundDrawablesRelative()
            r0 = 0
            r1 = r6[r0]
            r2 = 1
            r3 = r6[r2]
            r4 = 2
            r6 = r6[r4]
            boolean r4 = r5.m3308c()
            if (r4 == 0) goto L5a
            android.graphics.drawable.Drawable r4 = r5.f5906h0
            if (r1 != r4) goto L6e
        L5a:
            boolean r1 = r5.m3307b()
            if (r1 == 0) goto L64
            android.graphics.drawable.Drawable r1 = r5.f5906h0
            if (r6 != r1) goto L6e
        L64:
            boolean r6 = r5.m3309d()
            if (r6 == 0) goto L6f
            android.graphics.drawable.Drawable r6 = r5.f5906h0
            if (r3 == r6) goto L6f
        L6e:
            r0 = 1
        L6f:
            if (r0 == 0) goto L74
            r5.m3311f()
        L74:
            return
    }

    @Override // android.view.View
    public android.content.res.ColorStateList getBackgroundTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.getSupportBackgroundTintList()
            return r0
    }

    @Override // android.view.View
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.getSupportBackgroundTintMode()
            return r0
    }

    public int getCornerRadius() {
            r1 = this;
            boolean r0 = r1.m3310e()
            if (r0 == 0) goto Lb
            b8.a r0 = r1.f5901c0
            int r0 = r0.f3880g
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public android.graphics.drawable.Drawable getIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f5906h0
            return r0
    }

    public int getIconGravity() {
            r1 = this;
            int r0 = r1.f5913o0
            return r0
    }

    public int getIconPadding() {
            r1 = this;
            int r0 = r1.f5910l0
            return r0
    }

    public int getIconSize() {
            r1 = this;
            int r0 = r1.f5907i0
            return r0
    }

    public android.content.res.ColorStateList getIconTint() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f5905g0
            return r0
    }

    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f5904f0
            return r0
    }

    public int getInsetBottom() {
            r1 = this;
            b8.a r0 = r1.f5901c0
            int r0 = r0.f3879f
            return r0
    }

    public int getInsetTop() {
            r1 = this;
            b8.a r0 = r1.f5901c0
            int r0 = r0.f3878e
            return r0
    }

    public android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            boolean r0 = r1.m3310e()
            if (r0 == 0) goto Lb
            b8.a r0 = r1.f5901c0
            android.content.res.ColorStateList r0 = r0.f3885l
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public p340t8.C6192i getShapeAppearanceModel() {
            r2 = this;
            boolean r0 = r2.m3310e()
            if (r0 == 0) goto Lb
            b8.a r0 = r2.f5901c0
            t8.i r0 = r0.f3875b
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background."
            r0.<init>(r1)
            throw r0
    }

    public android.content.res.ColorStateList getStrokeColor() {
            r1 = this;
            boolean r0 = r1.m3310e()
            if (r0 == 0) goto Lb
            b8.a r0 = r1.f5901c0
            android.content.res.ColorStateList r0 = r0.f3884k
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public int getStrokeWidth() {
            r1 = this;
            boolean r0 = r1.m3310e()
            if (r0 == 0) goto Lb
            b8.a r0 = r1.f5901c0
            int r0 = r0.f3881h
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // androidx.appcompat.widget.C0276g
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            boolean r0 = r1.m3310e()
            if (r0 == 0) goto Lb
            b8.a r0 = r1.f5901c0
            android.content.res.ColorStateList r0 = r0.f3883j
            return r0
        Lb:
            android.content.res.ColorStateList r0 = super.getSupportBackgroundTintList()
            return r0
    }

    @Override // androidx.appcompat.widget.C0276g
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            boolean r0 = r1.m3310e()
            if (r0 == 0) goto Lb
            b8.a r0 = r1.f5901c0
            android.graphics.PorterDuff$Mode r0 = r0.f3882i
            return r0
        Lb:
            android.graphics.PorterDuff$Mode r0 = super.getSupportBackgroundTintMode()
            return r0
    }

    /* renamed from: h */
    public final void m3313h(int r5, int r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f5906h0
            if (r0 == 0) goto La1
            android.text.Layout r0 = r4.getLayout()
            if (r0 != 0) goto Lc
            goto La1
        Lc:
            boolean r0 = r4.m3308c()
            r1 = 0
            if (r0 != 0) goto L57
            boolean r0 = r4.m3307b()
            if (r0 == 0) goto L1a
            goto L57
        L1a:
            boolean r5 = r4.m3309d()
            if (r5 == 0) goto L9d
            r4.f5908j0 = r1
            int r5 = r4.f5913o0
            r0 = 16
            if (r5 != r0) goto L2e
            r4.f5909k0 = r1
        L2a:
            r4.m3312g(r1)
            return
        L2e:
            int r5 = r4.f5907i0
            if (r5 != 0) goto L38
            android.graphics.drawable.Drawable r5 = r4.f5906h0
            int r5 = r5.getIntrinsicHeight()
        L38:
            int r0 = r4.getTextHeight()
            int r6 = r6 - r0
            int r0 = r4.getPaddingTop()
            int r6 = r6 - r0
            int r6 = r6 - r5
            int r5 = r4.f5910l0
            int r6 = r6 - r5
            int r5 = r4.getPaddingBottom()
            int r6 = r6 - r5
            int r6 = r6 / 2
            int r5 = r4.f5909k0
            if (r5 == r6) goto L9d
            r4.f5909k0 = r6
        L53:
            r4.m3312g(r1)
            goto L9d
        L57:
            r4.f5909k0 = r1
            int r6 = r4.f5913o0
            r0 = 1
            if (r6 == r0) goto L9e
            r2 = 3
            if (r6 != r2) goto L62
            goto L9e
        L62:
            int r6 = r4.f5907i0
            if (r6 != 0) goto L6c
            android.graphics.drawable.Drawable r6 = r4.f5906h0
            int r6 = r6.getIntrinsicWidth()
        L6c:
            int r2 = r4.getTextWidth()
            int r5 = r5 - r2
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            int r2 = p227n0.C4661t.d.m10576e(r4)
            int r5 = r5 - r2
            int r5 = r5 - r6
            int r6 = r4.f5910l0
            int r5 = r5 - r6
            int r6 = p227n0.C4661t.d.m10577f(r4)
            int r5 = r5 - r6
            int r5 = r5 / 2
            int r6 = p227n0.C4661t.d.m10575d(r4)
            if (r6 != r0) goto L8b
            r6 = 1
            goto L8c
        L8b:
            r6 = 0
        L8c:
            int r2 = r4.f5913o0
            r3 = 4
            if (r2 != r3) goto L92
            goto L93
        L92:
            r0 = 0
        L93:
            if (r6 == r0) goto L96
            int r5 = -r5
        L96:
            int r6 = r4.f5908j0
            if (r6 == r5) goto L9d
            r4.f5908j0 = r5
            goto L53
        L9d:
            return
        L9e:
            r4.f5908j0 = r1
            goto L2a
        La1:
            return
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
            r1 = this;
            boolean r0 = r1.f5911m0
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.m3310e()
            if (r0 == 0) goto L12
            b8.a r0 = r1.f5901c0
            t8.f r0 = r0.m2249b()
            p185k7.C3828h5.m8575D(r1, r0)
        L12:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 2
            int[] r2 = super.onCreateDrawableState(r2)
            boolean r0 = r1.m3306a()
            if (r0 == 0) goto L11
            int[] r0 = com.google.android.material.button.MaterialButton.f5899p0
            android.widget.Button.mergeDrawableStates(r2, r0)
        L11:
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L1c
            int[] r0 = com.google.android.material.button.MaterialButton.f5900q0
            android.widget.Button.mergeDrawableStates(r2, r0)
        L1c:
            return r2
    }

    @Override // androidx.appcompat.widget.C0276g, android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = r1.getA11yClassName()
            r2.setClassName(r0)
            boolean r0 = r1.isChecked()
            r2.setChecked(r0)
            return
    }

    @Override // androidx.appcompat.widget.C0276g, android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.String r0 = r1.getA11yClassName()
            r2.setClassName(r0)
            boolean r0 = r1.m3306a()
            r2.setCheckable(r0)
            boolean r0 = r1.isChecked()
            r2.setChecked(r0)
            boolean r0 = r1.isClickable()
            r2.setClickable(r0)
            return
    }

    @Override // androidx.appcompat.widget.C0276g, android.widget.TextView, android.view.View
    public void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            super.onLayout(r3, r4, r5, r6, r7)
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r3 != r0) goto L20
            b8.a r3 = r2.f5901c0
            if (r3 == 0) goto L20
            int r7 = r7 - r5
            int r6 = r6 - r4
            android.graphics.drawable.Drawable r4 = r3.f3886m
            if (r4 == 0) goto L20
            int r5 = r3.f3876c
            int r0 = r3.f3878e
            int r1 = r3.f3877d
            int r6 = r6 - r1
            int r3 = r3.f3879f
            int r7 = r7 - r3
            r4.setBounds(r5, r0, r6, r7)
        L20:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.button.MaterialButton.C1138c
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.button.MaterialButton$c r2 = (com.google.android.material.button.MaterialButton.C1138c) r2
            android.os.Parcelable r0 = r2.f22819Y
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.f5914a0
            r1.setChecked(r2)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.button.MaterialButton$c r1 = new com.google.android.material.button.MaterialButton$c
            r1.<init>(r0)
            boolean r0 = r2.f5911m0
            r1.f5914a0 = r0
            return r1
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r0.m3313h(r1, r2)
            return
    }

    @Override // androidx.appcompat.widget.C0276g, android.widget.TextView
    public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            int r1 = r0.getMeasuredWidth()
            int r2 = r0.getMeasuredHeight()
            r0.m3313h(r1, r2)
            return
    }

    @Override // android.view.View
    public boolean performClick() {
            r1 = this;
            r1.toggle()
            boolean r0 = super.performClick()
            return r0
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.setBackgroundDrawable(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r3) {
            r2 = this;
            boolean r0 = r2.m3310e()
            if (r0 == 0) goto L16
            b8.a r0 = r2.f5901c0
            t8.f r1 = r0.m2249b()
            if (r1 == 0) goto L19
            t8.f r0 = r0.m2249b()
            r0.setTint(r3)
            goto L19
        L16:
            super.setBackgroundColor(r3)
        L19:
            return
    }

    @Override // androidx.appcompat.widget.C0276g, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r4) {
            r3 = this;
            boolean r0 = r3.m3310e()
            if (r0 == 0) goto L33
            android.graphics.drawable.Drawable r0 = r3.getBackground()
            if (r4 == r0) goto L27
            java.lang.String r0 = "MaterialButton"
            java.lang.String r1 = "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled"
            android.util.Log.w(r0, r1)
            b8.a r0 = r3.f5901c0
            r1 = 1
            r0.f3888o = r1
            com.google.android.material.button.MaterialButton r1 = r0.f3874a
            android.content.res.ColorStateList r2 = r0.f3883j
            r1.setSupportBackgroundTintList(r2)
            com.google.android.material.button.MaterialButton r1 = r0.f3874a
            android.graphics.PorterDuff$Mode r0 = r0.f3882i
            r1.setSupportBackgroundTintMode(r0)
            goto L33
        L27:
            android.graphics.drawable.Drawable r0 = r3.getBackground()
            int[] r4 = r4.getState()
            r0.setState(r4)
            goto L36
        L33:
            super.setBackgroundDrawable(r4)
        L36:
            return
    }

    @Override // androidx.appcompat.widget.C0276g, android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setBackgroundDrawable(r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.setSupportBackgroundTintList(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.setSupportBackgroundTintMode(r1)
            return
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            boolean r0 = r1.m3310e()
            if (r0 == 0) goto La
            b8.a r0 = r1.f5901c0
            r0.f3890q = r2
        La:
            return
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r3) {
            r2 = this;
            boolean r0 = r2.m3306a()
            if (r0 == 0) goto L38
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L38
            boolean r0 = r2.f5911m0
            if (r0 == r3) goto L38
            r2.f5911m0 = r3
            r2.refreshDrawableState()
            boolean r3 = r2.f5912n0
            if (r3 == 0) goto L1a
            return
        L1a:
            r3 = 1
            r2.f5912n0 = r3
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButton$a> r3 = r2.f5902d0
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r3.next()
            com.google.android.material.button.MaterialButton$a r0 = (com.google.android.material.button.MaterialButton.InterfaceC1136a) r0
            boolean r1 = r2.f5911m0
            r0.mo3315a(r2, r1)
            goto L23
        L35:
            r3 = 0
            r2.f5912n0 = r3
        L38:
            return
    }

    public void setCornerRadius(int r3) {
            r2 = this;
            boolean r0 = r2.m3310e()
            if (r0 == 0) goto L1f
            b8.a r0 = r2.f5901c0
            boolean r1 = r0.f3889p
            if (r1 == 0) goto L10
            int r1 = r0.f3880g
            if (r1 == r3) goto L1f
        L10:
            r0.f3880g = r3
            r1 = 1
            r0.f3889p = r1
            t8.i r1 = r0.f3875b
            float r3 = (float) r3
            t8.i r3 = r1.m12786e(r3)
            r0.m2252e(r3)
        L1f:
            return
    }

    public void setCornerRadiusResource(int r2) {
            r1 = this;
            boolean r0 = r1.m3310e()
            if (r0 == 0) goto L11
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setCornerRadius(r2)
        L11:
            return
    }

    @Override // android.view.View
    public void setElevation(float r4) {
            r3 = this;
            super.setElevation(r4)
            boolean r0 = r3.m3310e()
            if (r0 == 0) goto L1c
            b8.a r0 = r3.f5901c0
            t8.f r0 = r0.m2249b()
            t8.f$b r1 = r0.f24036Y
            float r2 = r1.f24073o
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L1c
            r1.f24073o = r4
            r0.m12781y()
        L1c:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f5906h0
            if (r0 == r2) goto L15
            r1.f5906h0 = r2
            r2 = 1
            r1.m3312g(r2)
            int r2 = r1.getMeasuredWidth()
            int r0 = r1.getMeasuredHeight()
            r1.m3313h(r2, r0)
        L15:
            return
    }

    public void setIconGravity(int r2) {
            r1 = this;
            int r0 = r1.f5913o0
            if (r0 == r2) goto L11
            r1.f5913o0 = r2
            int r2 = r1.getMeasuredWidth()
            int r0 = r1.getMeasuredHeight()
            r1.m3313h(r2, r0)
        L11:
            return
    }

    public void setIconPadding(int r2) {
            r1 = this;
            int r0 = r1.f5910l0
            if (r0 == r2) goto L9
            r1.f5910l0 = r2
            r1.setCompoundDrawablePadding(r2)
        L9:
            return
    }

    public void setIconResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setIcon(r2)
            return
    }

    public void setIconSize(int r2) {
            r1 = this;
            if (r2 < 0) goto Ld
            int r0 = r1.f5907i0
            if (r0 == r2) goto Lc
            r1.f5907i0 = r2
            r2 = 1
            r1.m3312g(r2)
        Lc:
            return
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "iconSize cannot be less than 0"
            r2.<init>(r0)
            throw r2
    }

    public void setIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f5905g0
            if (r0 == r2) goto La
            r1.f5905g0 = r2
            r2 = 0
            r1.m3312g(r2)
        La:
            return
    }

    public void setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f5904f0
            if (r0 == r2) goto La
            r1.f5904f0 = r2
            r2 = 0
            r1.m3312g(r2)
        La:
            return
    }

    public void setIconTintResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = p102g.C2199a.m5783a(r0, r2)
            r1.setIconTint(r2)
            return
    }

    public void setInsetBottom(int r3) {
            r2 = this;
            b8.a r0 = r2.f5901c0
            int r1 = r0.f3878e
            r0.m2253f(r1, r3)
            return
    }

    public void setInsetTop(int r3) {
            r2 = this;
            b8.a r0 = r2.f5901c0
            int r1 = r0.f3879f
            r0.m2253f(r3, r1)
            return
    }

    public void setInternalBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            return
    }

    /* renamed from: setOnPressedChangeListenerInternal */
    public void m3314x3df6d7c2(com.google.android.material.button.MaterialButton.InterfaceC1137b r1) {
            r0 = this;
            r0.f5903e0 = r1
            return
    }

    @Override // android.view.View
    public void setPressed(boolean r2) {
            r1 = this;
            com.google.android.material.button.MaterialButton$b r0 = r1.f5903e0
            if (r0 == 0) goto Lb
            com.google.android.material.button.MaterialButtonToggleGroup$f r0 = (com.google.android.material.button.MaterialButtonToggleGroup.C1144f) r0
            com.google.android.material.button.MaterialButtonToggleGroup r0 = r0.f5934a
            r0.invalidate()
        Lb:
            super.setPressed(r2)
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r3) {
            r2 = this;
            boolean r0 = r2.m3310e()
            if (r0 == 0) goto L27
            b8.a r0 = r2.f5901c0
            android.content.res.ColorStateList r1 = r0.f3885l
            if (r1 == r3) goto L27
            r0.f3885l = r3
            com.google.android.material.button.MaterialButton r1 = r0.f3874a
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            boolean r1 = r1 instanceof android.graphics.drawable.RippleDrawable
            if (r1 == 0) goto L27
            com.google.android.material.button.MaterialButton r0 = r0.f3874a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.RippleDrawable r0 = (android.graphics.drawable.RippleDrawable) r0
            android.content.res.ColorStateList r3 = p308r8.C5799a.m12171c(r3)
            r0.setColor(r3)
        L27:
            return
    }

    public void setRippleColorResource(int r2) {
            r1 = this;
            boolean r0 = r1.m3310e()
            if (r0 == 0) goto L11
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = p102g.C2199a.m5783a(r0, r2)
            r1.setRippleColor(r2)
        L11:
            return
    }

    @Override // p340t8.InterfaceC6196m
    public void setShapeAppearanceModel(p340t8.C6192i r2) {
            r1 = this;
            boolean r0 = r1.m3310e()
            if (r0 == 0) goto Lc
            b8.a r0 = r1.f5901c0
            r0.m2252e(r2)
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background."
            r2.<init>(r0)
            throw r2
    }

    public void setShouldDrawSurfaceColorStroke(boolean r2) {
            r1 = this;
            boolean r0 = r1.m3310e()
            if (r0 == 0) goto Ld
            b8.a r0 = r1.f5901c0
            r0.f3887n = r2
            r0.m2255h()
        Ld:
            return
    }

    public void setStrokeColor(android.content.res.ColorStateList r3) {
            r2 = this;
            boolean r0 = r2.m3310e()
            if (r0 == 0) goto L11
            b8.a r0 = r2.f5901c0
            android.content.res.ColorStateList r1 = r0.f3884k
            if (r1 == r3) goto L11
            r0.f3884k = r3
            r0.m2255h()
        L11:
            return
    }

    public void setStrokeColorResource(int r2) {
            r1 = this;
            boolean r0 = r1.m3310e()
            if (r0 == 0) goto L11
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = p102g.C2199a.m5783a(r0, r2)
            r1.setStrokeColor(r2)
        L11:
            return
    }

    public void setStrokeWidth(int r3) {
            r2 = this;
            boolean r0 = r2.m3310e()
            if (r0 == 0) goto L11
            b8.a r0 = r2.f5901c0
            int r1 = r0.f3881h
            if (r1 == r3) goto L11
            r0.f3881h = r3
            r0.m2255h()
        L11:
            return
    }

    public void setStrokeWidthResource(int r2) {
            r1 = this;
            boolean r0 = r1.m3310e()
            if (r0 == 0) goto L11
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setStrokeWidth(r2)
        L11:
            return
    }

    @Override // androidx.appcompat.widget.C0276g
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            boolean r0 = r2.m3310e()
            if (r0 == 0) goto L1e
            b8.a r0 = r2.f5901c0
            android.content.res.ColorStateList r1 = r0.f3883j
            if (r1 == r3) goto L21
            r0.f3883j = r3
            t8.f r3 = r0.m2249b()
            if (r3 == 0) goto L21
            t8.f r3 = r0.m2249b()
            android.content.res.ColorStateList r0 = r0.f3883j
            r3.setTintList(r0)
            goto L21
        L1e:
            super.setSupportBackgroundTintList(r3)
        L21:
            return
    }

    @Override // androidx.appcompat.widget.C0276g
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            boolean r0 = r2.m3310e()
            if (r0 == 0) goto L22
            b8.a r0 = r2.f5901c0
            android.graphics.PorterDuff$Mode r1 = r0.f3882i
            if (r1 == r3) goto L25
            r0.f3882i = r3
            t8.f r3 = r0.m2249b()
            if (r3 == 0) goto L25
            android.graphics.PorterDuff$Mode r3 = r0.f3882i
            if (r3 == 0) goto L25
            t8.f r3 = r0.m2249b()
            android.graphics.PorterDuff$Mode r0 = r0.f3882i
            r3.setTintMode(r0)
            goto L25
        L22:
            super.setSupportBackgroundTintMode(r3)
        L25:
            return
    }

    @Override // android.widget.Checkable
    public void toggle() {
            r1 = this;
            boolean r0 = r1.f5911m0
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }
}
