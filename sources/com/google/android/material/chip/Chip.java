package com.google.android.material.chip;

/* loaded from: classes.dex */
public class Chip extends androidx.appcompat.widget.C0279h implements com.google.android.material.chip.C1153a.a, p340t8.InterfaceC6196m {

    /* renamed from: t0 */
    public static final android.graphics.Rect f5943t0 = null;

    /* renamed from: u0 */
    public static final int[] f5944u0 = null;

    /* renamed from: v0 */
    public static final int[] f5945v0 = null;

    /* renamed from: d0 */
    public com.google.android.material.chip.C1153a f5946d0;

    /* renamed from: e0 */
    public android.graphics.drawable.InsetDrawable f5947e0;

    /* renamed from: f0 */
    public android.graphics.drawable.RippleDrawable f5948f0;

    /* renamed from: g0 */
    public android.view.View.OnClickListener f5949g0;

    /* renamed from: h0 */
    public android.widget.CompoundButton.OnCheckedChangeListener f5950h0;

    /* renamed from: i0 */
    public boolean f5951i0;

    /* renamed from: j0 */
    public boolean f5952j0;

    /* renamed from: k0 */
    public boolean f5953k0;

    /* renamed from: l0 */
    public boolean f5954l0;

    /* renamed from: m0 */
    public boolean f5955m0;

    /* renamed from: n0 */
    public int f5956n0;

    /* renamed from: o0 */
    public int f5957o0;

    /* renamed from: p0 */
    public final com.google.android.material.chip.Chip.C1147b f5958p0;

    /* renamed from: q0 */
    public final android.graphics.Rect f5959q0;

    /* renamed from: r0 */
    public final android.graphics.RectF f5960r0;

    /* renamed from: s0 */
    public final p124h7.AbstractC2951xf f5961s0;

    /* renamed from: com.google.android.material.chip.Chip$a */
    public class C1146a extends p124h7.AbstractC2951xf {

        /* renamed from: b */
        public final /* synthetic */ com.google.android.material.chip.Chip f5962b;

        public C1146a(com.google.android.material.chip.Chip r1) {
                r0 = this;
                r0.f5962b = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // p124h7.AbstractC2951xf
        /* renamed from: a */
        public void mo3339a(int r1) {
                r0 = this;
                return
        }

        @Override // p124h7.AbstractC2951xf
        /* renamed from: b */
        public void mo3340b(android.graphics.Typeface r2, boolean r3) {
                r1 = this;
                com.google.android.material.chip.Chip r2 = r1.f5962b
                com.google.android.material.chip.a r3 = r2.f5946d0
                boolean r0 = r3.f5983C1
                if (r0 == 0) goto Lb
                java.lang.CharSequence r3 = r3.f5984D0
                goto Lf
            Lb:
                java.lang.CharSequence r3 = r2.getText()
            Lf:
                r2.setText(r3)
                com.google.android.material.chip.Chip r2 = r1.f5962b
                r2.requestLayout()
                com.google.android.material.chip.Chip r2 = r1.f5962b
                r2.invalidate()
                return
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    public class C1147b extends p332t0.AbstractC6093a {

        /* renamed from: q */
        public final /* synthetic */ com.google.android.material.chip.Chip f5963q;

        public C1147b(com.google.android.material.chip.Chip r1, com.google.android.material.chip.Chip r2) {
                r0 = this;
                r0.f5963q = r1
                r0.<init>(r2)
                return
        }

        @Override // p332t0.AbstractC6093a
        /* renamed from: m */
        public void mo3341m(java.util.List<java.lang.Integer> r5) {
                r4 = this;
                r0 = 0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                r5.add(r1)
                com.google.android.material.chip.Chip r1 = r4.f5963q
                android.graphics.Rect r2 = com.google.android.material.chip.Chip.f5943t0
                boolean r1 = r1.m3331e()
                if (r1 == 0) goto L2b
                com.google.android.material.chip.Chip r1 = r4.f5963q
                com.google.android.material.chip.a r2 = r1.f5946d0
                r3 = 1
                if (r2 == 0) goto L1e
                boolean r2 = r2.f5992J0
                if (r2 == 0) goto L1e
                r0 = 1
            L1e:
                if (r0 == 0) goto L2b
                android.view.View$OnClickListener r0 = r1.f5949g0
                if (r0 == 0) goto L2b
                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
                r5.add(r0)
            L2b:
                return
        }

        @Override // p332t0.AbstractC6093a
        /* renamed from: p */
        public boolean mo3342p(int r2, int r3, android.os.Bundle r4) {
                r1 = this;
                r4 = 0
                r0 = 16
                if (r3 != r0) goto L23
                if (r2 != 0) goto Le
                com.google.android.material.chip.Chip r2 = r1.f5963q
                boolean r2 = r2.performClick()
                return r2
            Le:
                r3 = 1
                if (r2 != r3) goto L23
                com.google.android.material.chip.Chip r2 = r1.f5963q
                r2.playSoundEffect(r4)
                android.view.View$OnClickListener r0 = r2.f5949g0
                if (r0 == 0) goto L1e
                r0.onClick(r2)
                r4 = 1
            L1e:
                com.google.android.material.chip.Chip$b r2 = r2.f5958p0
                r2.m12559u(r3, r3)
            L23:
                return r4
        }

        @Override // p332t0.AbstractC6093a
        /* renamed from: q */
        public void mo3343q(p242o0.C4868b r4) {
                r3 = this;
                com.google.android.material.chip.Chip r0 = r3.f5963q
                boolean r0 = r0.m3332f()
                android.view.accessibility.AccessibilityNodeInfo r1 = r4.f19337a
                r1.setCheckable(r0)
                com.google.android.material.chip.Chip r0 = r3.f5963q
                boolean r0 = r0.isClickable()
                android.view.accessibility.AccessibilityNodeInfo r1 = r4.f19337a
                r1.setClickable(r0)
                com.google.android.material.chip.Chip r0 = r3.f5963q
                boolean r0 = r0.m3332f()
                if (r0 != 0) goto L2f
                com.google.android.material.chip.Chip r0 = r3.f5963q
                boolean r0 = r0.isClickable()
                if (r0 == 0) goto L27
                goto L2f
            L27:
                android.view.accessibility.AccessibilityNodeInfo r0 = r4.f19337a
                java.lang.String r1 = "android.view.View"
                r0.setClassName(r1)
                goto L41
            L2f:
                com.google.android.material.chip.Chip r0 = r3.f5963q
                boolean r0 = r0.m3332f()
                if (r0 == 0) goto L3a
                java.lang.String r0 = "android.widget.CompoundButton"
                goto L3c
            L3a:
                java.lang.String r0 = "android.widget.Button"
            L3c:
                android.view.accessibility.AccessibilityNodeInfo r1 = r4.f19337a
                r1.setClassName(r0)
            L41:
                com.google.android.material.chip.Chip r0 = r3.f5963q
                java.lang.CharSequence r0 = r0.getText()
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 23
                if (r1 < r2) goto L53
                android.view.accessibility.AccessibilityNodeInfo r4 = r4.f19337a
                r4.setText(r0)
                goto L58
            L53:
                android.view.accessibility.AccessibilityNodeInfo r4 = r4.f19337a
                r4.setContentDescription(r0)
            L58:
                return
        }

        @Override // p332t0.AbstractC6093a
        /* renamed from: r */
        public void mo3344r(int r7, p242o0.C4868b r8) {
                r6 = this;
                java.lang.String r0 = ""
                r1 = 1
                if (r7 != r1) goto L52
                com.google.android.material.chip.Chip r7 = r6.f5963q
                java.lang.CharSequence r7 = r7.getCloseIconContentDescription()
                if (r7 == 0) goto Le
                goto L31
            Le:
                com.google.android.material.chip.Chip r7 = r6.f5963q
                java.lang.CharSequence r7 = r7.getText()
                com.google.android.material.chip.Chip r2 = r6.f5963q
                android.content.Context r2 = r2.getContext()
                r3 = 2131951904(0x7f130120, float:1.9540236E38)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r4 = 0
                boolean r5 = android.text.TextUtils.isEmpty(r7)
                if (r5 != 0) goto L27
                r0 = r7
            L27:
                r1[r4] = r0
                java.lang.String r7 = r2.getString(r3, r1)
                java.lang.String r7 = r7.trim()
            L31:
                android.view.accessibility.AccessibilityNodeInfo r0 = r8.f19337a
                r0.setContentDescription(r7)
                com.google.android.material.chip.Chip r7 = r6.f5963q
                android.graphics.Rect r7 = com.google.android.material.chip.Chip.m3328c(r7)
                android.view.accessibility.AccessibilityNodeInfo r0 = r8.f19337a
                r0.setBoundsInParent(r7)
                o0.b$a r7 = p242o0.C4868b.a.f19340e
                r8.m10990a(r7)
                com.google.android.material.chip.Chip r7 = r6.f5963q
                boolean r7 = r7.isEnabled()
                android.view.accessibility.AccessibilityNodeInfo r8 = r8.f19337a
                r8.setEnabled(r7)
                goto L5e
            L52:
                android.view.accessibility.AccessibilityNodeInfo r7 = r8.f19337a
                r7.setContentDescription(r0)
                android.graphics.Rect r7 = com.google.android.material.chip.Chip.f5943t0
                android.view.accessibility.AccessibilityNodeInfo r8 = r8.f19337a
                r8.setBoundsInParent(r7)
            L5e:
                return
        }

        @Override // p332t0.AbstractC6093a
        /* renamed from: s */
        public void mo3345s(int r2, boolean r3) {
                r1 = this;
                r0 = 1
                if (r2 != r0) goto La
                com.google.android.material.chip.Chip r2 = r1.f5963q
                r2.f5954l0 = r3
                r2.refreshDrawableState()
            La:
                return
        }

        /* renamed from: w */
        public int m3346w(float r3, float r4) {
                r2 = this;
                com.google.android.material.chip.Chip r0 = r2.f5963q
                android.graphics.Rect r1 = com.google.android.material.chip.Chip.f5943t0
                boolean r0 = r0.m3331e()
                if (r0 == 0) goto L18
                com.google.android.material.chip.Chip r0 = r2.f5963q
                android.graphics.RectF r0 = com.google.android.material.chip.Chip.m3327b(r0)
                boolean r3 = r0.contains(r3, r4)
                if (r3 == 0) goto L18
                r3 = 1
                goto L19
            L18:
                r3 = 0
            L19:
                return r3
        }
    }

    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.google.android.material.chip.Chip.f5943t0 = r0
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16842913(0x10100a1, float:2.369401E-38)
            r3 = 0
            r1[r3] = r2
            com.google.android.material.chip.Chip.f5944u0 = r1
            int[] r0 = new int[r0]
            r1 = 16842911(0x101009f, float:2.3694004E-38)
            r0[r3] = r1
            com.google.android.material.chip.Chip.f5945v0 = r0
            return
    }

    public Chip(android.content.Context r19, android.util.AttributeSet r20) {
            r18 = this;
            r0 = r18
            r7 = r20
            r8 = 2132017932(0x7f14030c, float:1.9674156E38)
            r9 = 2130968793(0x7f0400d9, float:1.754625E38)
            r1 = r19
            android.content.Context r1 = p431y8.C7133a.m14245a(r1, r7, r9, r8)
            r0.<init>(r1, r7, r9)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f5959q0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f5960r0 = r1
            com.google.android.material.chip.Chip$a r1 = new com.google.android.material.chip.Chip$a
            r1.<init>(r0)
            r0.f5961s0 = r1
            android.content.Context r10 = r18.getContext()
            r11 = 1
            r12 = 8388627(0x800013, float:1.175497E-38)
            if (r7 != 0) goto L33
            goto L93
        L33:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Chip"
            if (r2 == 0) goto L44
            java.lang.String r2 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r3, r2)
        L44:
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L370
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L368
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r4 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L362
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L35c
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r11)
            if (r2 == 0) goto L354
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L354
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L354
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L354
            java.lang.String r2 = "gravity"
            int r1 = r7.getAttributeIntValue(r1, r2, r12)
            if (r1 == r12) goto L93
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r3, r1)
        L93:
            com.google.android.material.chip.a r13 = new com.google.android.material.chip.a
            r13.<init>(r10, r7, r9, r8)
            android.content.Context r1 = r13.f6012d1
            int[] r14 = p339t7.C6183a.f24011h
            r15 = 0
            int[] r6 = new int[r15]
            r5 = 2132017932(0x7f14030c, float:1.9674156E38)
            r4 = 2130968793(0x7f0400d9, float:1.754625E38)
            r2 = r20
            r3 = r14
            android.content.res.TypedArray r1 = p220m8.C4429m.m9881d(r1, r2, r3, r4, r5, r6)
            r6 = 37
            boolean r2 = r1.hasValue(r6)
            r13.f5987E1 = r2
            android.content.Context r2 = r13.f6012d1
            r3 = 24
            android.content.res.ColorStateList r2 = p288q8.C5599c.m11875a(r2, r1, r3)
            android.content.res.ColorStateList r3 = r13.f6031w0
            if (r3 == r2) goto Lc9
            r13.f6031w0 = r2
            int[] r2 = r13.getState()
            r13.onStateChange(r2)
        Lc9:
            android.content.Context r2 = r13.f6012d1
            r3 = 11
            android.content.res.ColorStateList r2 = p288q8.C5599c.m11875a(r2, r1, r3)
            r13.m3368Q(r2)
            r2 = 19
            r3 = 0
            float r2 = r1.getDimension(r2, r3)
            r13.m3375X(r2)
            r2 = 12
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto Led
            float r2 = r1.getDimension(r2, r3)
            r13.m3369R(r2)
        Led:
            android.content.Context r2 = r13.f6012d1
            r4 = 22
            android.content.res.ColorStateList r2 = p288q8.C5599c.m11875a(r2, r1, r4)
            r13.m3377Z(r2)
            r5 = 23
            float r2 = r1.getDimension(r5, r3)
            r13.m3379a0(r2)
            android.content.Context r2 = r13.f6012d1
            r4 = 36
            android.content.res.ColorStateList r2 = p288q8.C5599c.m11875a(r2, r1, r4)
            r13.m3389k0(r2)
            r2 = 5
            java.lang.CharSequence r2 = r1.getText(r2)
            r13.m3390l0(r2)
            android.content.Context r2 = r13.f6012d1
            boolean r4 = r1.hasValue(r15)
            if (r4 == 0) goto L128
            int r4 = r1.getResourceId(r15, r15)
            if (r4 == 0) goto L128
            q8.d r5 = new q8.d
            r5.<init>(r2, r4)
            goto L129
        L128:
            r5 = 0
        L129:
            float r2 = r5.f21756k
            float r2 = r1.getDimension(r11, r2)
            r5.f21756k = r2
            m8.j r2 = r13.f6018j1
            android.content.Context r4 = r13.f6012d1
            r2.m9873b(r5, r4)
            r2 = 3
            int r4 = r1.getInt(r2, r15)
            r5 = 2
            if (r4 == r11) goto L14b
            if (r4 == r5) goto L148
            if (r4 == r2) goto L145
            goto L14f
        L145:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            goto L14d
        L148:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L14d
        L14b:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
        L14d:
            r13.f5981B1 = r2
        L14f:
            r2 = 18
            boolean r2 = r1.getBoolean(r2, r15)
            r13.m3374W(r2)
            java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L175
            java.lang.String r4 = "chipIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L175
            java.lang.String r4 = "chipIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L175
            r4 = 15
            boolean r4 = r1.getBoolean(r4, r15)
            r13.m3374W(r4)
        L175:
            android.content.Context r4 = r13.f6012d1
            r5 = 14
            android.graphics.drawable.Drawable r4 = p288q8.C5599c.m11878d(r4, r1, r5)
            r13.m3371T(r4)
            r4 = 17
            boolean r5 = r1.hasValue(r4)
            if (r5 == 0) goto L191
            android.content.Context r5 = r13.f6012d1
            android.content.res.ColorStateList r4 = p288q8.C5599c.m11875a(r5, r1, r4)
            r13.m3373V(r4)
        L191:
            r4 = 16
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r1.getDimension(r4, r5)
            r13.m3372U(r4)
            r4 = 31
            boolean r4 = r1.getBoolean(r4, r15)
            r13.m3386h0(r4)
            if (r7 == 0) goto L1c0
            java.lang.String r4 = "closeIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L1c0
            java.lang.String r4 = "closeIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L1c0
            r4 = 26
            boolean r4 = r1.getBoolean(r4, r15)
            r13.m3386h0(r4)
        L1c0:
            android.content.Context r4 = r13.f6012d1
            r5 = 25
            android.graphics.drawable.Drawable r4 = p288q8.C5599c.m11878d(r4, r1, r5)
            r13.m3380b0(r4)
            android.content.Context r4 = r13.f6012d1
            r5 = 30
            android.content.res.ColorStateList r4 = p288q8.C5599c.m11875a(r4, r1, r5)
            r13.m3385g0(r4)
            r4 = 28
            float r4 = r1.getDimension(r4, r3)
            r13.m3382d0(r4)
            r4 = 6
            boolean r4 = r1.getBoolean(r4, r15)
            r13.m3364M(r4)
            r4 = 10
            boolean r4 = r1.getBoolean(r4, r15)
            r13.m3367P(r4)
            if (r7 == 0) goto L20b
            java.lang.String r4 = "checkedIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L20b
            java.lang.String r4 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r2, r4)
            if (r2 != 0) goto L20b
            r2 = 8
            boolean r2 = r1.getBoolean(r2, r15)
            r13.m3367P(r2)
        L20b:
            android.content.Context r2 = r13.f6012d1
            r4 = 7
            android.graphics.drawable.Drawable r2 = p288q8.C5599c.m11878d(r2, r1, r4)
            r13.m3365N(r2)
            r2 = 9
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L226
            android.content.Context r4 = r13.f6012d1
            android.content.res.ColorStateList r2 = p288q8.C5599c.m11875a(r4, r1, r2)
            r13.m3366O(r2)
        L226:
            android.content.Context r2 = r13.f6012d1
            r4 = 39
            u7.g r2 = p354u7.C6356g.m13006a(r2, r1, r4)
            r13.f6002T0 = r2
            android.content.Context r2 = r13.f6012d1
            r4 = 33
            u7.g r2 = p354u7.C6356g.m13006a(r2, r1, r4)
            r13.f6003U0 = r2
            r2 = 21
            float r2 = r1.getDimension(r2, r3)
            r13.m3376Y(r2)
            r2 = 35
            float r2 = r1.getDimension(r2, r3)
            r13.m3388j0(r2)
            r2 = 34
            float r2 = r1.getDimension(r2, r3)
            r13.m3387i0(r2)
            r2 = 41
            float r2 = r1.getDimension(r2, r3)
            r13.m3392n0(r2)
            r2 = 40
            float r2 = r1.getDimension(r2, r3)
            r13.m3391m0(r2)
            r2 = 29
            float r2 = r1.getDimension(r2, r3)
            r13.m3383e0(r2)
            r2 = 27
            float r2 = r1.getDimension(r2, r3)
            r13.m3381c0(r2)
            r2 = 13
            float r2 = r1.getDimension(r2, r3)
            r13.m3370S(r2)
            r2 = 4
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r13.f5985D1 = r2
            r1.recycle()
            int[] r5 = new int[r15]
            p220m8.C4429m.m9878a(r10, r7, r9, r8)
            r17 = 2132017932(0x7f14030c, float:1.9674156E38)
            r4 = 2130968793(0x7f0400d9, float:1.754625E38)
            r1 = r10
            r2 = r20
            r3 = r14
            r16 = r5
            r11 = 23
            r12 = 2
            r5 = r17
            r6 = r16
            p220m8.C4429m.m9879b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r7, r14, r9, r8)
            r2 = 32
            boolean r2 = r1.getBoolean(r2, r15)
            r0.f5955m0 = r2
            android.content.Context r2 = r18.getContext()
            r3 = 48
            float r2 = p220m8.C4430n.m9884b(r2, r3)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            r3 = 20
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.f5957o0 = r2
            r1.recycle()
            r0.setChipDrawable(r13)
            float r1 = p227n0.C4661t.h.m10604i(r18)
            r13.m12772p(r1)
            int[] r6 = new int[r15]
            p220m8.C4429m.m9878a(r10, r7, r9, r8)
            r5 = 2132017932(0x7f14030c, float:1.9674156E38)
            r1 = r10
            r2 = r20
            r3 = r14
            p220m8.C4429m.m9879b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r7, r14, r9, r8)
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 >= r11) goto L2ff
            android.content.res.ColorStateList r2 = p288q8.C5599c.m11875a(r10, r1, r12)
            r0.setTextColor(r2)
        L2ff:
            r2 = 37
            boolean r2 = r1.hasValue(r2)
            r1.recycle()
            com.google.android.material.chip.Chip$b r1 = new com.google.android.material.chip.Chip$b
            r1.<init>(r0, r0)
            r0.f5958p0 = r1
            r18.m3334h()
            if (r2 != 0) goto L31c
            e8.a r1 = new e8.a
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L31c:
            boolean r1 = r0.f5951i0
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r13.f5984D0
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r13.f5981B1
            r0.setEllipsize(r1)
            r18.m3337k()
            com.google.android.material.chip.a r1 = r0.f5946d0
            boolean r1 = r1.f5983C1
            if (r1 != 0) goto L33b
            r1 = 1
            r0.setLines(r1)
            r0.setHorizontallyScrolling(r1)
        L33b:
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.setGravity(r1)
            r18.m3336j()
            boolean r1 = r0.f5955m0
            if (r1 == 0) goto L34d
            int r1 = r0.f5957o0
            r0.setMinHeight(r1)
        L34d:
            int r1 = p227n0.C4661t.d.m10575d(r18)
            r0.f5956n0 = r1
            return
        L354:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L35c:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L362:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L368:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L370:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: b */
    public static /* synthetic */ android.graphics.RectF m3327b(com.google.android.material.chip.Chip r0) {
            android.graphics.RectF r0 = r0.getCloseIconTouchBounds()
            return r0
    }

    /* renamed from: c */
    public static /* synthetic */ android.graphics.Rect m3328c(com.google.android.material.chip.Chip r0) {
            android.graphics.Rect r0 = r0.getCloseIconTouchBoundsInt()
            return r0
    }

    private android.graphics.RectF getCloseIconTouchBounds() {
            r3 = this;
            android.graphics.RectF r0 = r3.f5960r0
            r0.setEmpty()
            boolean r0 = r3.m3331e()
            if (r0 == 0) goto L1a
            android.view.View$OnClickListener r0 = r3.f5949g0
            if (r0 == 0) goto L1a
            com.google.android.material.chip.a r0 = r3.f5946d0
            android.graphics.RectF r1 = r3.f5960r0
            android.graphics.Rect r2 = r0.getBounds()
            r0.m3357D(r2, r1)
        L1a:
            android.graphics.RectF r0 = r3.f5960r0
            return r0
    }

    private android.graphics.Rect getCloseIconTouchBoundsInt() {
            r5 = this;
            android.graphics.RectF r0 = r5.getCloseIconTouchBounds()
            android.graphics.Rect r1 = r5.f5959q0
            float r2 = r0.left
            int r2 = (int) r2
            float r3 = r0.top
            int r3 = (int) r3
            float r4 = r0.right
            int r4 = (int) r4
            float r0 = r0.bottom
            int r0 = (int) r0
            r1.set(r2, r3, r4, r0)
            android.graphics.Rect r0 = r5.f5959q0
            return r0
    }

    private p288q8.C5600d getTextAppearance() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L9
            m8.j r0 = r0.f6018j1
            q8.d r0 = r0.f18080f
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    private void setCloseIconHovered(boolean r2) {
            r1 = this;
            boolean r0 = r1.f5953k0
            if (r0 == r2) goto L9
            r1.f5953k0 = r2
            r1.refreshDrawableState()
        L9:
            return
    }

    private void setCloseIconPressed(boolean r2) {
            r1 = this;
            boolean r0 = r1.f5952j0
            if (r0 == r2) goto L9
            r1.f5952j0 = r2
            r1.refreshDrawableState()
        L9:
            return
    }

    @Override // com.google.android.material.chip.C1153a.a
    /* renamed from: a */
    public void mo3329a() {
            r1 = this;
            int r0 = r1.f5957o0
            r1.m3330d(r0)
            r1.requestLayout()
            r1.invalidateOutline()
            return
    }

    /* renamed from: d */
    public boolean m3330d(int r10) {
            r9 = this;
            r9.f5957o0 = r10
            boolean r0 = r9.f5955m0
            r1 = 0
            if (r0 != 0) goto L15
            android.graphics.drawable.InsetDrawable r10 = r9.f5947e0
            if (r10 == 0) goto Lf
            r9.m3333g()
            goto L14
        Lf:
            int[] r10 = p308r8.C5799a.f22492a
            r9.m3335i()
        L14:
            return r1
        L15:
            com.google.android.material.chip.a r0 = r9.f5946d0
            float r0 = r0.f6035y0
            int r0 = (int) r0
            int r0 = r10 - r0
            int r0 = java.lang.Math.max(r1, r0)
            com.google.android.material.chip.a r2 = r9.f5946d0
            int r2 = r2.getIntrinsicWidth()
            int r2 = r10 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L3e
            if (r0 > 0) goto L3e
            android.graphics.drawable.InsetDrawable r10 = r9.f5947e0
            if (r10 == 0) goto L38
            r9.m3333g()
            goto L3d
        L38:
            int[] r10 = p308r8.C5799a.f22492a
            r9.m3335i()
        L3d:
            return r1
        L3e:
            if (r2 <= 0) goto L44
            int r2 = r2 / 2
            r7 = r2
            goto L45
        L44:
            r7 = 0
        L45:
            if (r0 <= 0) goto L4b
            int r1 = r0 / 2
            r8 = r1
            goto L4c
        L4b:
            r8 = 0
        L4c:
            android.graphics.drawable.InsetDrawable r0 = r9.f5947e0
            r1 = 1
            if (r0 == 0) goto L71
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r2 = r9.f5947e0
            r2.getPadding(r0)
            int r2 = r0.top
            if (r2 != r8) goto L71
            int r2 = r0.bottom
            if (r2 != r8) goto L71
            int r2 = r0.left
            if (r2 != r7) goto L71
            int r0 = r0.right
            if (r0 != r7) goto L71
        L6b:
            int[] r10 = p308r8.C5799a.f22492a
            r9.m3335i()
            return r1
        L71:
            int r0 = r9.getMinHeight()
            if (r0 == r10) goto L7a
            r9.setMinHeight(r10)
        L7a:
            int r0 = r9.getMinWidth()
            if (r0 == r10) goto L83
            r9.setMinWidth(r10)
        L83:
            android.graphics.drawable.InsetDrawable r10 = new android.graphics.drawable.InsetDrawable
            com.google.android.material.chip.a r4 = r9.f5946d0
            r3 = r10
            r5 = r7
            r6 = r8
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f5947e0 = r10
            goto L6b
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(android.view.MotionEvent r10) {
            r9 = this;
            java.lang.Class<t0.a> r0 = p332t0.AbstractC6093a.class
            int r1 = r10.getAction()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 10
            r4 = 0
            r5 = 1
            if (r1 != r3) goto L51
            java.lang.String r1 = "m"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            r1.setAccessible(r5)     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            com.google.android.material.chip.Chip$b r6 = r9.f5958p0     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            int r1 = r1.intValue()     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            if (r1 == r2) goto L51
            java.lang.String r1 = "v"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            r6[r4] = r7     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r6)     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            r0.setAccessible(r5)     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            com.google.android.material.chip.Chip$b r1 = r9.f5958p0     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            r6[r4] = r7     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            r0.invoke(r1, r6)     // Catch: java.lang.NoSuchFieldException -> L43 java.lang.reflect.InvocationTargetException -> L45 java.lang.IllegalAccessException -> L47 java.lang.NoSuchMethodException -> L49
            r0 = 1
            goto L52
        L43:
            r0 = move-exception
            goto L4a
        L45:
            r0 = move-exception
            goto L4a
        L47:
            r0 = move-exception
            goto L4a
        L49:
            r0 = move-exception
        L4a:
            java.lang.String r1 = "Chip"
            java.lang.String r6 = "Unable to send Accessibility Exit event"
            android.util.Log.e(r1, r6, r0)
        L51:
            r0 = 0
        L52:
            if (r0 != 0) goto Laf
            com.google.android.material.chip.Chip$b r0 = r9.f5958p0
            android.view.accessibility.AccessibilityManager r1 = r0.f23509h
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto La6
            android.view.accessibility.AccessibilityManager r1 = r0.f23509h
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L67
            goto La6
        L67:
            int r1 = r10.getAction()
            r6 = 7
            r7 = 256(0x100, float:3.59E-43)
            r8 = 128(0x80, float:1.8E-43)
            if (r1 == r6) goto L89
            r6 = 9
            if (r1 == r6) goto L89
            if (r1 == r3) goto L79
            goto La6
        L79:
            int r1 = r0.f23514m
            if (r1 == r2) goto La6
            if (r1 != r2) goto L80
            goto La4
        L80:
            r0.f23514m = r2
            r0.m12559u(r2, r8)
            r0.m12559u(r1, r7)
            goto La4
        L89:
            float r1 = r10.getX()
            float r3 = r10.getY()
            int r1 = r0.m3346w(r1, r3)
            int r3 = r0.f23514m
            if (r3 != r1) goto L9a
            goto La2
        L9a:
            r0.f23514m = r1
            r0.m12559u(r1, r8)
            r0.m12559u(r3, r7)
        La2:
            if (r1 == r2) goto La6
        La4:
            r0 = 1
            goto La7
        La6:
            r0 = 0
        La7:
            if (r0 != 0) goto Laf
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto Lb0
        Laf:
            r4 = 1
        Lb0:
            return r4
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r10) {
            r9 = this;
            com.google.android.material.chip.Chip$b r0 = r9.f5958p0
            java.util.Objects.requireNonNull(r0)
            int r1 = r10.getAction()
            r2 = 0
            r3 = 1
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r3) goto L7b
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L65
            r5 = 66
            if (r1 == r5) goto L4e
            switch(r1) {
                case 19: goto L20;
                case 20: goto L20;
                case 21: goto L20;
                case 22: goto L20;
                case 23: goto L4e;
                default: goto L1f;
            }
        L1f:
            goto L7b
        L20:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L7b
            r7 = 19
            if (r1 == r7) goto L38
            r7 = 21
            if (r1 == r7) goto L35
            r7 = 22
            if (r1 == r7) goto L3a
            r5 = 130(0x82, float:1.82E-43)
            goto L3a
        L35:
            r5 = 17
            goto L3a
        L38:
            r5 = 33
        L3a:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r3
            r7 = 0
        L40:
            if (r2 >= r1) goto L4c
            boolean r8 = r0.m12556n(r5, r6)
            if (r8 == 0) goto L4c
            int r2 = r2 + 1
            r7 = 1
            goto L40
        L4c:
            r2 = r7
            goto L7b
        L4e:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L7b
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L7b
            int r1 = r0.f23513l
            if (r1 == r4) goto L63
            r2 = 16
            r0.mo3342p(r1, r2, r6)
        L63:
            r2 = 1
            goto L7b
        L65:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L71
            r1 = 2
            boolean r2 = r0.m12556n(r1, r6)
            goto L7b
        L71:
            boolean r1 = r10.hasModifiers(r3)
            if (r1 == 0) goto L7b
            boolean r2 = r0.m12556n(r3, r6)
        L7b:
            if (r2 == 0) goto L84
            com.google.android.material.chip.Chip$b r0 = r9.f5958p0
            int r0 = r0.f23513l
            if (r0 == r4) goto L84
            return r3
        L84:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
    }

    @Override // androidx.appcompat.widget.C0279h, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
            r4 = this;
            super.drawableStateChanged()
            com.google.android.material.chip.a r0 = r4.f5946d0
            r1 = 0
            if (r0 == 0) goto L6e
            android.graphics.drawable.Drawable r0 = r0.f5993K0
            boolean r0 = com.google.android.material.chip.C1153a.m3353J(r0)
            if (r0 == 0) goto L6e
            com.google.android.material.chip.a r0 = r4.f5946d0
            boolean r2 = r4.isEnabled()
            boolean r3 = r4.f5954l0
            if (r3 == 0) goto L1c
            int r2 = r2 + 1
        L1c:
            boolean r3 = r4.f5953k0
            if (r3 == 0) goto L22
            int r2 = r2 + 1
        L22:
            boolean r3 = r4.f5952j0
            if (r3 == 0) goto L28
            int r2 = r2 + 1
        L28:
            boolean r3 = r4.isChecked()
            if (r3 == 0) goto L30
            int r2 = r2 + 1
        L30:
            int[] r2 = new int[r2]
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L3e
            r3 = 16842910(0x101009e, float:2.3694E-38)
            r2[r1] = r3
            r1 = 1
        L3e:
            boolean r3 = r4.f5954l0
            if (r3 == 0) goto L49
            r3 = 16842908(0x101009c, float:2.3693995E-38)
            r2[r1] = r3
            int r1 = r1 + 1
        L49:
            boolean r3 = r4.f5953k0
            if (r3 == 0) goto L54
            r3 = 16843623(0x1010367, float:2.3696E-38)
            r2[r1] = r3
            int r1 = r1 + 1
        L54:
            boolean r3 = r4.f5952j0
            if (r3 == 0) goto L5f
            r3 = 16842919(0x10100a7, float:2.3694026E-38)
            r2[r1] = r3
            int r1 = r1 + 1
        L5f:
            boolean r3 = r4.isChecked()
            if (r3 == 0) goto L6a
            r3 = 16842913(0x10100a1, float:2.369401E-38)
            r2[r1] = r3
        L6a:
            boolean r1 = r0.m3384f0(r2)
        L6e:
            if (r1 == 0) goto L73
            r4.invalidate()
        L73:
            return
    }

    /* renamed from: e */
    public final boolean m3331e() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto Lc
            android.graphics.drawable.Drawable r0 = r0.m3360G()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    /* renamed from: f */
    public boolean m3332f() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto La
            boolean r0 = r0.f5998P0
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* renamed from: g */
    public final void m3333g() {
            r1 = this;
            android.graphics.drawable.InsetDrawable r0 = r1.f5947e0
            if (r0 == 0) goto L18
            r0 = 0
            r1.f5947e0 = r0
            r0 = 0
            r1.setMinWidth(r0)
            float r0 = r1.getChipMinHeight()
            int r0 = (int) r0
            r1.setMinHeight(r0)
            int[] r0 = p308r8.C5799a.f22492a
            r1.m3335i()
        L18:
            return
    }

    public android.graphics.drawable.Drawable getBackgroundDrawable() {
            r1 = this;
            android.graphics.drawable.InsetDrawable r0 = r1.f5947e0
            if (r0 != 0) goto L6
            com.google.android.material.chip.a r0 = r1.f5946d0
        L6:
            return r0
    }

    public android.graphics.drawable.Drawable getCheckedIcon() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            android.graphics.drawable.Drawable r0 = r0.f6000R0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public android.content.res.ColorStateList getCheckedIconTint() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.f6001S0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public android.content.res.ColorStateList getChipBackgroundColor() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.f6033x0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public float getChipCornerRadius() {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            r1 = 0
            if (r0 == 0) goto Ld
            float r0 = r0.m3359F()
            float r1 = java.lang.Math.max(r1, r0)
        Ld:
            return r1
    }

    public android.graphics.drawable.Drawable getChipDrawable() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            return r0
    }

    public float getChipEndPadding() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            float r0 = r0.f6011c1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public android.graphics.drawable.Drawable getChipIcon() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto Ld
            android.graphics.drawable.Drawable r0 = r0.f5988F0
            if (r0 == 0) goto Ld
            android.graphics.drawable.Drawable r0 = p103g0.C2200a.m5791g(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public float getChipIconSize() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            float r0 = r0.f5990H0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public android.content.res.ColorStateList getChipIconTint() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.f5989G0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public float getChipMinHeight() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            float r0 = r0.f6035y0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public float getChipStartPadding() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            float r0 = r0.f6004V0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public android.content.res.ColorStateList getChipStrokeColor() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.f5978A0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public float getChipStrokeWidth() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            float r0 = r0.f5980B0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getChipText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getText()
            return r0
    }

    public android.graphics.drawable.Drawable getCloseIcon() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.m3360G()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public java.lang.CharSequence getCloseIconContentDescription() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            java.lang.CharSequence r0 = r0.f5997O0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public float getCloseIconEndPadding() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            float r0 = r0.f6010b1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public float getCloseIconSize() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            float r0 = r0.f5996N0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public float getCloseIconStartPadding() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            float r0 = r0.f6009a1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public android.content.res.ColorStateList getCloseIconTint() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.f5995M0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // android.widget.TextView
    public android.text.TextUtils.TruncateAt getEllipsize() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            android.text.TextUtils$TruncateAt r0 = r0.f5981B1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(android.graphics.Rect r4) {
            r3 = this;
            com.google.android.material.chip.Chip$b r0 = r3.f5958p0
            int r1 = r0.f23513l
            r2 = 1
            if (r1 == r2) goto L10
            int r0 = r0.f23512k
            if (r0 != r2) goto Lc
            goto L10
        Lc:
            super.getFocusedRect(r4)
            goto L17
        L10:
            android.graphics.Rect r0 = r3.getCloseIconTouchBoundsInt()
            r4.set(r0)
        L17:
            return
    }

    public p354u7.C6356g getHideMotionSpec() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            u7.g r0 = r0.f6003U0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public float getIconEndPadding() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            float r0 = r0.f6006X0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public float getIconStartPadding() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            float r0 = r0.f6005W0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.f5982C0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public p340t8.C6192i getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            t8.f$b r0 = r0.f24036Y
            t8.i r0 = r0.f24059a
            return r0
    }

    public p354u7.C6356g getShowMotionSpec() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            u7.g r0 = r0.f6002T0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public float getTextEndPadding() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            float r0 = r0.f6008Z0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public float getTextStartPadding() {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            float r0 = r0.f6007Y0
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    /* renamed from: h */
    public final void m3334h() {
            r1 = this;
            boolean r0 = r1.m3331e()
            if (r0 == 0) goto L1a
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L10
            boolean r0 = r0.f5992J0
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L1a
            android.view.View$OnClickListener r0 = r1.f5949g0
            if (r0 == 0) goto L1a
            com.google.android.material.chip.Chip$b r0 = r1.f5958p0
            goto L1b
        L1a:
            r0 = 0
        L1b:
            p227n0.C4661t.m10546v(r1, r0)
            return
    }

    /* renamed from: i */
    public final void m3335i() {
            r4 = this;
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            com.google.android.material.chip.a r1 = r4.f5946d0
            android.content.res.ColorStateList r1 = r1.f5982C0
            android.content.res.ColorStateList r1 = p308r8.C5799a.m12171c(r1)
            android.graphics.drawable.Drawable r2 = r4.getBackgroundDrawable()
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.f5948f0 = r0
            com.google.android.material.chip.a r0 = r4.f5946d0
            r1 = 0
            r0.m3393o0(r1)
            android.graphics.drawable.RippleDrawable r0 = r4.f5948f0
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10569q(r4, r0)
            r4.m3336j()
            return
    }

    /* renamed from: j */
    public final void m3336j() {
            r5 = this;
            java.lang.CharSequence r0 = r5.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L48
            com.google.android.material.chip.a r0 = r5.f5946d0
            if (r0 != 0) goto Lf
            goto L48
        Lf:
            float r1 = r0.f6011c1
            float r2 = r0.f6008Z0
            float r1 = r1 + r2
            float r0 = r0.m3358E()
            float r0 = r0 + r1
            int r0 = (int) r0
            com.google.android.material.chip.a r1 = r5.f5946d0
            float r2 = r1.f6004V0
            float r3 = r1.f6007Y0
            float r2 = r2 + r3
            float r1 = r1.m3355B()
            float r1 = r1 + r2
            int r1 = (int) r1
            android.graphics.drawable.InsetDrawable r2 = r5.f5947e0
            if (r2 == 0) goto L3b
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.drawable.InsetDrawable r3 = r5.f5947e0
            r3.getPadding(r2)
            int r3 = r2.left
            int r1 = r1 + r3
            int r2 = r2.right
            int r0 = r0 + r2
        L3b:
            int r2 = r5.getPaddingTop()
            int r3 = r5.getPaddingBottom()
            java.util.WeakHashMap<android.view.View, n0.w> r4 = p227n0.C4661t.f18570a
            p227n0.C4661t.d.m10582k(r5, r1, r2, r0, r3)
        L48:
            return
    }

    /* renamed from: k */
    public final void m3337k() {
            r4 = this;
            android.text.TextPaint r0 = r4.getPaint()
            com.google.android.material.chip.a r1 = r4.f5946d0
            if (r1 == 0) goto Le
            int[] r1 = r1.getState()
            r0.drawableState = r1
        Le:
            q8.d r1 = r4.getTextAppearance()
            if (r1 == 0) goto L1d
            android.content.Context r2 = r4.getContext()
            h7.xf r3 = r4.f5961s0
            r1.m11885e(r2, r0, r3)
        L1d:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.chip.a r0 = r1.f5946d0
            p185k7.C3828h5.m8575D(r1, r0)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 2
            int[] r2 = super.onCreateDrawableState(r2)
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L11
            int[] r0 = com.google.android.material.chip.Chip.f5944u0
            android.widget.CheckBox.mergeDrawableStates(r2, r0)
        L11:
            boolean r0 = r1.m3332f()
            if (r0 == 0) goto L1c
            int[] r0 = com.google.android.material.chip.Chip.f5945v0
            android.widget.CheckBox.mergeDrawableStates(r2, r0)
        L1c:
            return r2
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean r4, int r5, android.graphics.Rect r6) {
            r3 = this;
            super.onFocusChanged(r4, r5, r6)
            com.google.android.material.chip.Chip$b r0 = r3.f5958p0
            int r1 = r0.f23513l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto Le
            r0.m12554k(r1)
        Le:
            if (r4 == 0) goto L13
            r0.m12556n(r5, r6)
        L13:
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionMasked()
            r1 = 7
            if (r0 == r1) goto Le
            r1 = 10
            if (r0 == r1) goto Lc
            goto L21
        Lc:
            r0 = 0
            goto L1e
        Le:
            android.graphics.RectF r0 = r3.getCloseIconTouchBounds()
            float r1 = r4.getX()
            float r2 = r4.getY()
            boolean r0 = r0.contains(r1, r2)
        L1e:
            r3.setCloseIconHovered(r0)
        L21:
            boolean r4 = super.onHoverEvent(r4)
            return r4
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r11) {
            r10 = this;
            super.onInitializeAccessibilityNodeInfo(r11)
            boolean r0 = r10.m3332f()
            if (r0 != 0) goto L16
            boolean r0 = r10.isClickable()
            if (r0 == 0) goto L10
            goto L16
        L10:
            java.lang.String r0 = "android.view.View"
        L12:
            r11.setClassName(r0)
            goto L22
        L16:
            boolean r0 = r10.m3332f()
            if (r0 == 0) goto L1f
            java.lang.String r0 = "android.widget.CompoundButton"
            goto L12
        L1f:
            java.lang.String r0 = "android.widget.Button"
            goto L12
        L22:
            boolean r0 = r10.m3332f()
            r11.setCheckable(r0)
            boolean r0 = r10.isClickable()
            r11.setClickable(r0)
            android.view.ViewParent r0 = r10.getParent()
            boolean r0 = r0 instanceof com.google.android.material.chip.ChipGroup
            if (r0 == 0) goto L8b
            android.view.ViewParent r0 = r10.getParent()
            com.google.android.material.chip.ChipGroup r0 = (com.google.android.material.chip.ChipGroup) r0
            boolean r1 = r0.f18044c0
            r2 = -1
            if (r1 == 0) goto L64
            r1 = 0
            r3 = 0
        L45:
            int r4 = r0.getChildCount()
            if (r1 >= r4) goto L61
            android.view.View r4 = r0.getChildAt(r1)
            boolean r4 = r4 instanceof com.google.android.material.chip.Chip
            if (r4 == 0) goto L5e
            android.view.View r4 = r0.getChildAt(r1)
            com.google.android.material.chip.Chip r4 = (com.google.android.material.chip.Chip) r4
            if (r4 != r10) goto L5c
            goto L62
        L5c:
            int r3 = r3 + 1
        L5e:
            int r1 = r1 + 1
            goto L45
        L61:
            r3 = -1
        L62:
            r6 = r3
            goto L65
        L64:
            r6 = -1
        L65:
            r0 = 2131362542(0x7f0a02ee, float:1.8344868E38)
            java.lang.Object r0 = r10.getTag(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 != 0) goto L72
            r4 = -1
            goto L79
        L72:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r2 = r0.intValue()
            r4 = r2
        L79:
            r5 = 1
            r7 = 1
            r8 = 0
            boolean r9 = r10.isChecked()
            o0.b$c r0 = p242o0.C4868b.c.m11002a(r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r0.f19353a
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
            r11.setCollectionItemInfo(r0)
        L8b:
            return
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @android.annotation.TargetApi(24)
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent r2, int r3) {
            r1 = this;
            android.graphics.RectF r3 = r1.getCloseIconTouchBounds()
            float r0 = r2.getX()
            float r2 = r2.getY()
            boolean r2 = r3.contains(r0, r2)
            if (r2 == 0) goto L23
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L23
            android.content.Context r2 = r1.getContext()
            r3 = 1002(0x3ea, float:1.404E-42)
            android.view.PointerIcon r2 = android.view.PointerIcon.getSystemIcon(r2, r3)
            return r2
        L23:
            r2 = 0
            return r2
    }

    @Override // android.widget.TextView, android.view.View
    @android.annotation.TargetApi(17)
    public void onRtlPropertiesChanged(int r2) {
            r1 = this;
            super.onRtlPropertiesChanged(r2)
            int r0 = r1.f5956n0
            if (r0 == r2) goto Lc
            r1.f5956n0 = r2
            r1.m3336j()
        Lc:
            return
    }

    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L45
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L40
            goto L4c
        L21:
            boolean r0 = r5.f5952j0
            if (r0 == 0) goto L4c
            if (r1 != 0) goto L4a
            r5.setCloseIconPressed(r2)
            goto L4a
        L2b:
            boolean r0 = r5.f5952j0
            if (r0 == 0) goto L40
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f5949g0
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            com.google.android.material.chip.Chip$b r0 = r5.f5958p0
            r0.m12559u(r3, r3)
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            r5.setCloseIconPressed(r2)
            goto L4d
        L45:
            if (r1 == 0) goto L4c
            r5.setCloseIconPressed(r3)
        L4a:
            r0 = 1
            goto L4d
        L4c:
            r0 = 0
        L4d:
            if (r0 != 0) goto L55
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L56
        L55:
            r2 = 1
        L56:
            return r2
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getBackgroundDrawable()
            if (r2 == r0) goto L12
            android.graphics.drawable.RippleDrawable r0 = r1.f5948f0
            if (r2 == r0) goto L12
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            goto L15
        L12:
            super.setBackground(r2)
        L15:
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background color; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            return
    }

    @Override // androidx.appcompat.widget.C0279h, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getBackgroundDrawable()
            if (r2 == r0) goto L12
            android.graphics.drawable.RippleDrawable r0 = r1.f5948f0
            if (r2 == r0) goto L12
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background drawable; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            goto L15
        L12:
            super.setBackgroundDrawable(r2)
        L15:
            return
    }

    @Override // androidx.appcompat.widget.C0279h, android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background resource; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background tint list; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Do not set the background tint mode; Chip manages its own background drawable."
            android.util.Log.w(r2, r0)
            return
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3364M(r2)
        L7:
            return
    }

    public void setCheckableResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f6012d1
            android.content.res.Resources r1 = r1.getResources()
            boolean r3 = r1.getBoolean(r3)
            r0.m3364M(r3)
        L11:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 != 0) goto L7
            r1.f5951i0 = r2
            goto L1b
        L7:
            boolean r0 = r0.f5998P0
            if (r0 == 0) goto L1b
            boolean r0 = r1.isChecked()
            super.setChecked(r2)
            if (r0 == r2) goto L1b
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r1.f5950h0
            if (r0 == 0) goto L1b
            r0.onCheckedChanged(r1, r2)
        L1b:
            return
    }

    public void setCheckedIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3365N(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setCheckedIconEnabled(boolean r1) {
            r0 = this;
            r0.setCheckedIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setCheckedIconEnabledResource(int r1) {
            r0 = this;
            r0.setCheckedIconVisible(r1)
            return
    }

    public void setCheckedIconResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.f6012d1
            android.graphics.drawable.Drawable r3 = p102g.C2199a.m5784b(r1, r3)
            r0.m3365N(r3)
        Ld:
            return
    }

    public void setCheckedIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3366O(r2)
        L7:
            return
    }

    public void setCheckedIconTintResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.f6012d1
            android.content.res.ColorStateList r3 = p102g.C2199a.m5783a(r1, r3)
            r0.m3366O(r3)
        Ld:
            return
    }

    public void setCheckedIconVisible(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f6012d1
            android.content.res.Resources r1 = r1.getResources()
            boolean r3 = r1.getBoolean(r3)
            r0.m3367P(r3)
        L11:
            return
    }

    public void setCheckedIconVisible(boolean r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3367P(r2)
        L7:
            return
    }

    public void setChipBackgroundColor(android.content.res.ColorStateList r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L11
            android.content.res.ColorStateList r1 = r0.f6033x0
            if (r1 == r3) goto L11
            r0.f6033x0 = r3
            int[] r3 = r0.getState()
            r0.onStateChange(r3)
        L11:
            return
    }

    public void setChipBackgroundColorResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.f6012d1
            android.content.res.ColorStateList r3 = p102g.C2199a.m5783a(r1, r3)
            r0.m3368Q(r3)
        Ld:
            return
    }

    @java.lang.Deprecated
    public void setChipCornerRadius(float r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3369R(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setChipCornerRadiusResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f6012d1
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.m3369R(r3)
        L11:
            return
    }

    public void setChipDrawable(com.google.android.material.chip.C1153a r4) {
            r3 = this;
            com.google.android.material.chip.a r0 = r3.f5946d0
            if (r0 == r4) goto L22
            if (r0 == 0) goto Le
            r1 = 0
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.f5979A1 = r2
        Le:
            r3.f5946d0 = r4
            r0 = 0
            r4.f5983C1 = r0
            java.util.Objects.requireNonNull(r4)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r4.f5979A1 = r0
            int r4 = r3.f5957o0
            r3.m3330d(r4)
        L22:
            return
    }

    public void setChipEndPadding(float r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L12
            float r1 = r0.f6011c1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L12
            r0.f6011c1 = r3
            r0.invalidateSelf()
            r0.m3362K()
        L12:
            return
    }

    public void setChipEndPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f6012d1
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.m3370S(r3)
        L11:
            return
    }

    public void setChipIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3371T(r2)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setChipIconEnabled(boolean r1) {
            r0 = this;
            r0.setChipIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setChipIconEnabledResource(int r1) {
            r0 = this;
            r0.setChipIconVisible(r1)
            return
    }

    public void setChipIconResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.f6012d1
            android.graphics.drawable.Drawable r3 = p102g.C2199a.m5784b(r1, r3)
            r0.m3371T(r3)
        Ld:
            return
    }

    public void setChipIconSize(float r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3372U(r2)
        L7:
            return
    }

    public void setChipIconSizeResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f6012d1
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.m3372U(r3)
        L11:
            return
    }

    public void setChipIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3373V(r2)
        L7:
            return
    }

    public void setChipIconTintResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.f6012d1
            android.content.res.ColorStateList r3 = p102g.C2199a.m5783a(r1, r3)
            r0.m3373V(r3)
        Ld:
            return
    }

    public void setChipIconVisible(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f6012d1
            android.content.res.Resources r1 = r1.getResources()
            boolean r3 = r1.getBoolean(r3)
            r0.m3374W(r3)
        L11:
            return
    }

    public void setChipIconVisible(boolean r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3374W(r2)
        L7:
            return
    }

    public void setChipMinHeight(float r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L12
            float r1 = r0.f6035y0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L12
            r0.f6035y0 = r3
            r0.invalidateSelf()
            r0.m3362K()
        L12:
            return
    }

    public void setChipMinHeightResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f6012d1
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.m3375X(r3)
        L11:
            return
    }

    public void setChipStartPadding(float r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L12
            float r1 = r0.f6004V0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L12
            r0.f6004V0 = r3
            r0.invalidateSelf()
            r0.m3362K()
        L12:
            return
    }

    public void setChipStartPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f6012d1
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.m3376Y(r3)
        L11:
            return
    }

    public void setChipStrokeColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3377Z(r2)
        L7:
            return
    }

    public void setChipStrokeColorResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.f6012d1
            android.content.res.ColorStateList r3 = p102g.C2199a.m5783a(r1, r3)
            r0.m3377Z(r3)
        Ld:
            return
    }

    public void setChipStrokeWidth(float r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3379a0(r2)
        L7:
            return
    }

    public void setChipStrokeWidthResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f6012d1
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.m3379a0(r3)
        L11:
            return
    }

    @java.lang.Deprecated
    public void setChipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.setText(r1)
            return
    }

    @java.lang.Deprecated
    public void setChipTextResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.setText(r2)
            return
    }

    public void setCloseIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3380b0(r2)
        L7:
            r1.m3334h()
            return
    }

    public void setCloseIconContentDescription(java.lang.CharSequence r5) {
            r4 = this;
            com.google.android.material.chip.a r0 = r4.f5946d0
            if (r0 == 0) goto L18
            java.lang.CharSequence r1 = r0.f5997O0
            if (r1 == r5) goto L18
            l0.a r1 = p195l0.C4157a.m9215c()
            l0.c r2 = r1.f17223c
            r3 = 1
            java.lang.CharSequence r5 = r1.m9216d(r5, r2, r3)
            r0.f5997O0 = r5
            r0.invalidateSelf()
        L18:
            return
    }

    @java.lang.Deprecated
    public void setCloseIconEnabled(boolean r1) {
            r0 = this;
            r0.setCloseIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setCloseIconEnabledResource(int r1) {
            r0 = this;
            r0.setCloseIconVisible(r1)
            return
    }

    public void setCloseIconEndPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3381c0(r2)
        L7:
            return
    }

    public void setCloseIconEndPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f6012d1
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.m3381c0(r3)
        L11:
            return
    }

    public void setCloseIconResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.f6012d1
            android.graphics.drawable.Drawable r3 = p102g.C2199a.m5784b(r1, r3)
            r0.m3380b0(r3)
        Ld:
            r2.m3334h()
            return
    }

    public void setCloseIconSize(float r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3382d0(r2)
        L7:
            return
    }

    public void setCloseIconSizeResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f6012d1
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.m3382d0(r3)
        L11:
            return
    }

    public void setCloseIconStartPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3383e0(r2)
        L7:
            return
    }

    public void setCloseIconStartPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f6012d1
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.m3383e0(r3)
        L11:
            return
    }

    public void setCloseIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3385g0(r2)
        L7:
            return
    }

    public void setCloseIconTintResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.f6012d1
            android.content.res.ColorStateList r3 = p102g.C2199a.m5783a(r1, r3)
            r0.m3385g0(r3)
        Ld:
            return
    }

    public void setCloseIconVisible(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setCloseIconVisible(r2)
            return
    }

    public void setCloseIconVisible(boolean r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3386h0(r2)
        L7:
            r1.m3334h()
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawables(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set end drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto L10
            if (r3 != 0) goto L8
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set right drawable using R.attr#closeIcon."
            r1.<init>(r2)
            throw r1
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.View
    public void setElevation(float r4) {
            r3 = this;
            super.setElevation(r4)
            com.google.android.material.chip.a r0 = r3.f5946d0
            if (r0 == 0) goto L14
            t8.f$b r1 = r0.f24036Y
            float r2 = r1.f24073o
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L14
            r1.f24073o = r4
            r0.m12781y()
        L14:
            return
    }

    @Override // android.widget.TextView
    public void setEllipsize(android.text.TextUtils.TruncateAt r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 != 0) goto L5
            return
        L5:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MARQUEE
            if (r2 == r0) goto L13
            super.setEllipsize(r2)
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L12
            r0.f5981B1 = r2
        L12:
            return
        L13:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Text within a chip are not allowed to scroll."
            r2.<init>(r0)
            throw r2
    }

    public void setEnsureMinTouchTargetSize(boolean r1) {
            r0 = this;
            r0.f5955m0 = r1
            int r1 = r0.f5957o0
            r0.m3330d(r1)
            return
    }

    @Override // android.widget.TextView
    public void setGravity(int r2) {
            r1 = this;
            r0 = 8388627(0x800013, float:1.175497E-38)
            if (r2 == r0) goto Ld
            java.lang.String r2 = "Chip"
            java.lang.String r0 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r2, r0)
            goto L10
        Ld:
            super.setGravity(r2)
        L10:
            return
    }

    public void setHideMotionSpec(p354u7.C6356g r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L6
            r0.f6003U0 = r2
        L6:
            return
    }

    public void setHideMotionSpecResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto Lc
            android.content.Context r1 = r0.f6012d1
            u7.g r3 = p354u7.C6356g.m13007b(r1, r3)
            r0.f6003U0 = r3
        Lc:
            return
    }

    public void setIconEndPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3387i0(r2)
        L7:
            return
    }

    public void setIconEndPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f6012d1
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.m3387i0(r3)
        L11:
            return
    }

    public void setIconStartPadding(float r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3388j0(r2)
        L7:
            return
    }

    public void setIconStartPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f6012d1
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.m3388j0(r3)
        L11:
            return
    }

    @Override // android.view.View
    public void setLayoutDirection(int r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 != 0) goto L5
            return
        L5:
            super.setLayoutDirection(r2)
            return
    }

    @Override // android.widget.TextView
    public void setLines(int r2) {
            r1 = this;
            r0 = 1
            if (r2 > r0) goto L7
            super.setLines(r2)
            return
        L7:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.widget.TextView
    public void setMaxLines(int r2) {
            r1 = this;
            r0 = 1
            if (r2 > r0) goto L7
            super.setMaxLines(r2)
            return
        L7:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int r2) {
            r1 = this;
            super.setMaxWidth(r2)
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L9
            r0.f5985D1 = r2
        L9:
            return
    }

    @Override // android.widget.TextView
    public void setMinLines(int r2) {
            r1 = this;
            r0 = 1
            if (r2 > r0) goto L7
            super.setMinLines(r2)
            return
        L7:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: setOnCheckedChangeListenerInternal */
    public void m3338x7da65987(android.widget.CompoundButton.OnCheckedChangeListener r1) {
            r0 = this;
            r0.f5950h0 = r1
            return
    }

    public void setOnCloseIconClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.f5949g0 = r1
            r0.m3334h()
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L7
            r0.m3389k0(r2)
        L7:
            com.google.android.material.chip.a r2 = r1.f5946d0
            boolean r2 = r2.f6036y1
            if (r2 != 0) goto L10
            r1.m3335i()
        L10:
            return
    }

    public void setRippleColorResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L16
            android.content.Context r1 = r0.f6012d1
            android.content.res.ColorStateList r3 = p102g.C2199a.m5783a(r1, r3)
            r0.m3389k0(r3)
            com.google.android.material.chip.a r3 = r2.f5946d0
            boolean r3 = r3.f6036y1
            if (r3 != 0) goto L16
            r2.m3335i()
        L16:
            return
    }

    @Override // p340t8.InterfaceC6196m
    public void setShapeAppearanceModel(p340t8.C6192i r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            t8.f$b r1 = r0.f24036Y
            r1.f24059a = r3
            r0.invalidateSelf()
            return
    }

    public void setShowMotionSpec(p354u7.C6356g r2) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 == 0) goto L6
            r0.f6002T0 = r2
        L6:
            return
    }

    public void setShowMotionSpecResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto Lc
            android.content.Context r1 = r0.f6012d1
            u7.g r3 = p354u7.C6356g.m13007b(r1, r3)
            r0.f6002T0 = r3
        Lc:
            return
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L6
            super.setSingleLine(r2)
            return
        L6:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Chip does not support multi-line text"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence r2, android.widget.TextView.BufferType r3) {
            r1 = this;
            com.google.android.material.chip.a r0 = r1.f5946d0
            if (r0 != 0) goto L5
            return
        L5:
            if (r2 != 0) goto L9
            java.lang.String r2 = ""
        L9:
            boolean r0 = r0.f5983C1
            if (r0 == 0) goto Lf
            r0 = 0
            goto L10
        Lf:
            r0 = r2
        L10:
            super.setText(r0, r3)
            com.google.android.material.chip.a r3 = r1.f5946d0
            if (r3 == 0) goto L1a
            r3.m3390l0(r2)
        L1a:
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int r4) {
            r3 = this;
            super.setTextAppearance(r4)
            com.google.android.material.chip.a r0 = r3.f5946d0
            if (r0 == 0) goto L15
            q8.d r1 = new q8.d
            android.content.Context r2 = r0.f6012d1
            r1.<init>(r2, r4)
            m8.j r4 = r0.f6018j1
            android.content.Context r0 = r0.f6012d1
            r4.m9873b(r1, r0)
        L15:
            r3.m3337k()
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r3, int r4) {
            r2 = this;
            super.setTextAppearance(r3, r4)
            com.google.android.material.chip.a r3 = r2.f5946d0
            if (r3 == 0) goto L15
            q8.d r0 = new q8.d
            android.content.Context r1 = r3.f6012d1
            r0.<init>(r1, r4)
            m8.j r4 = r3.f6018j1
            android.content.Context r3 = r3.f6012d1
            r4.m9873b(r0, r3)
        L15:
            r2.m3337k()
            return
    }

    public void setTextAppearance(p288q8.C5600d r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto Lb
            m8.j r1 = r0.f6018j1
            android.content.Context r0 = r0.f6012d1
            r1.m9873b(r3, r0)
        Lb:
            r2.m3337k()
            return
    }

    public void setTextAppearanceResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            r1.setTextAppearance(r0, r2)
            return
    }

    public void setTextEndPadding(float r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L12
            float r1 = r0.f6008Z0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L12
            r0.f6008Z0 = r3
            r0.invalidateSelf()
            r0.m3362K()
        L12:
            return
    }

    public void setTextEndPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f6012d1
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.m3391m0(r3)
        L11:
            return
    }

    public void setTextStartPadding(float r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L12
            float r1 = r0.f6007Y0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L12
            r0.f6007Y0 = r3
            r0.invalidateSelf()
            r0.m3362K()
        L12:
            return
    }

    public void setTextStartPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.chip.a r0 = r2.f5946d0
            if (r0 == 0) goto L11
            android.content.Context r1 = r0.f6012d1
            android.content.res.Resources r1 = r1.getResources()
            float r3 = r1.getDimension(r3)
            r0.m3392n0(r3)
        L11:
            return
    }
}
