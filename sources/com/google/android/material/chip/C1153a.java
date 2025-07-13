package com.google.android.material.chip;

/* renamed from: com.google.android.material.chip.a */
/* loaded from: classes.dex */
public class C1153a extends p340t8.C6189f implements android.graphics.drawable.Drawable.Callback, p220m8.C4426j.b {

    /* renamed from: F1 */
    public static final int[] f5976F1 = null;

    /* renamed from: G1 */
    public static final android.graphics.drawable.ShapeDrawable f5977G1 = null;

    /* renamed from: A0 */
    public android.content.res.ColorStateList f5978A0;

    /* renamed from: A1 */
    public java.lang.ref.WeakReference<com.google.android.material.chip.C1153a.a> f5979A1;

    /* renamed from: B0 */
    public float f5980B0;

    /* renamed from: B1 */
    public android.text.TextUtils.TruncateAt f5981B1;

    /* renamed from: C0 */
    public android.content.res.ColorStateList f5982C0;

    /* renamed from: C1 */
    public boolean f5983C1;

    /* renamed from: D0 */
    public java.lang.CharSequence f5984D0;

    /* renamed from: D1 */
    public int f5985D1;

    /* renamed from: E0 */
    public boolean f5986E0;

    /* renamed from: E1 */
    public boolean f5987E1;

    /* renamed from: F0 */
    public android.graphics.drawable.Drawable f5988F0;

    /* renamed from: G0 */
    public android.content.res.ColorStateList f5989G0;

    /* renamed from: H0 */
    public float f5990H0;

    /* renamed from: I0 */
    public boolean f5991I0;

    /* renamed from: J0 */
    public boolean f5992J0;

    /* renamed from: K0 */
    public android.graphics.drawable.Drawable f5993K0;

    /* renamed from: L0 */
    public android.graphics.drawable.Drawable f5994L0;

    /* renamed from: M0 */
    public android.content.res.ColorStateList f5995M0;

    /* renamed from: N0 */
    public float f5996N0;

    /* renamed from: O0 */
    public java.lang.CharSequence f5997O0;

    /* renamed from: P0 */
    public boolean f5998P0;

    /* renamed from: Q0 */
    public boolean f5999Q0;

    /* renamed from: R0 */
    public android.graphics.drawable.Drawable f6000R0;

    /* renamed from: S0 */
    public android.content.res.ColorStateList f6001S0;

    /* renamed from: T0 */
    public p354u7.C6356g f6002T0;

    /* renamed from: U0 */
    public p354u7.C6356g f6003U0;

    /* renamed from: V0 */
    public float f6004V0;

    /* renamed from: W0 */
    public float f6005W0;

    /* renamed from: X0 */
    public float f6006X0;

    /* renamed from: Y0 */
    public float f6007Y0;

    /* renamed from: Z0 */
    public float f6008Z0;

    /* renamed from: a1 */
    public float f6009a1;

    /* renamed from: b1 */
    public float f6010b1;

    /* renamed from: c1 */
    public float f6011c1;

    /* renamed from: d1 */
    public final android.content.Context f6012d1;

    /* renamed from: e1 */
    public final android.graphics.Paint f6013e1;

    /* renamed from: f1 */
    public final android.graphics.Paint.FontMetrics f6014f1;

    /* renamed from: g1 */
    public final android.graphics.RectF f6015g1;

    /* renamed from: h1 */
    public final android.graphics.PointF f6016h1;

    /* renamed from: i1 */
    public final android.graphics.Path f6017i1;

    /* renamed from: j1 */
    public final p220m8.C4426j f6018j1;

    /* renamed from: k1 */
    public int f6019k1;

    /* renamed from: l1 */
    public int f6020l1;

    /* renamed from: m1 */
    public int f6021m1;

    /* renamed from: n1 */
    public int f6022n1;

    /* renamed from: o1 */
    public int f6023o1;

    /* renamed from: p1 */
    public int f6024p1;

    /* renamed from: q1 */
    public boolean f6025q1;

    /* renamed from: r1 */
    public int f6026r1;

    /* renamed from: s1 */
    public int f6027s1;

    /* renamed from: t1 */
    public android.graphics.ColorFilter f6028t1;

    /* renamed from: u1 */
    public android.graphics.PorterDuffColorFilter f6029u1;

    /* renamed from: v1 */
    public android.content.res.ColorStateList f6030v1;

    /* renamed from: w0 */
    public android.content.res.ColorStateList f6031w0;

    /* renamed from: w1 */
    public android.graphics.PorterDuff.Mode f6032w1;

    /* renamed from: x0 */
    public android.content.res.ColorStateList f6033x0;

    /* renamed from: x1 */
    public int[] f6034x1;

    /* renamed from: y0 */
    public float f6035y0;

    /* renamed from: y1 */
    public boolean f6036y1;

    /* renamed from: z0 */
    public float f6037z0;

    /* renamed from: z1 */
    public android.content.res.ColorStateList f6038z1;

    /* renamed from: com.google.android.material.chip.a$a */
    public interface a {
        /* renamed from: a */
        void mo3329a();
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842910(0x101009e, float:2.3694E-38)
            r0[r1] = r2
            com.google.android.material.chip.C1153a.f5976F1 = r0
            android.graphics.drawable.ShapeDrawable r0 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.OvalShape r1 = new android.graphics.drawable.shapes.OvalShape
            r1.<init>()
            r0.<init>(r1)
            com.google.android.material.chip.C1153a.f5977G1 = r0
            return
    }

    public C1153a(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            t8.i$b r2 = p340t8.C6192i.m12783b(r1, r2, r3, r4)
            t8.i r2 = r2.m12788a()
            r0.<init>(r2)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.f6037z0 = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r3 = 1
            r2.<init>(r3)
            r0.f6013e1 = r2
            android.graphics.Paint$FontMetrics r2 = new android.graphics.Paint$FontMetrics
            r2.<init>()
            r0.f6014f1 = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r0.f6015g1 = r2
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>()
            r0.f6016h1 = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r0.f6017i1 = r2
            r2 = 255(0xff, float:3.57E-43)
            r0.f6027s1 = r2
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.f6032w1 = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r4 = 0
            r2.<init>(r4)
            r0.f5979A1 = r2
            t8.f$b r2 = r0.f24036Y
            j8.a r4 = new j8.a
            r4.<init>(r1)
            r2.f24060b = r4
            r0.m12781y()
            r0.f6012d1 = r1
            m8.j r2 = new m8.j
            r2.<init>(r0)
            r0.f6018j1 = r2
            java.lang.String r4 = ""
            r0.f5984D0 = r4
            android.text.TextPaint r2 = r2.f18075a
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2.density = r1
            int[] r1 = com.google.android.material.chip.C1153a.f5976F1
            r0.setState(r1)
            r0.m3384f0(r1)
            r0.f5983C1 = r3
            int[] r1 = p308r8.C5799a.f22492a
            android.graphics.drawable.ShapeDrawable r1 = com.google.android.material.chip.C1153a.f5977G1
            r2 = -1
            r1.setTint(r2)
            return
    }

    /* renamed from: I */
    public static boolean m3352I(android.content.res.ColorStateList r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* renamed from: J */
    public static boolean m3353J(android.graphics.drawable.Drawable r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* renamed from: A */
    public final void m3354A(android.graphics.Rect r4, android.graphics.RectF r5) {
            r3 = this;
            r5.setEmpty()
            boolean r0 = r3.m3395q0()
            if (r0 != 0) goto Lf
            boolean r0 = r3.m3394p0()
            if (r0 == 0) goto L6f
        Lf:
            float r0 = r3.f6004V0
            float r1 = r3.f6005W0
            float r0 = r0 + r1
            float r1 = r3.m3361H()
            int r2 = p103g0.C2200a.m5786b(r3)
            if (r2 != 0) goto L28
            int r2 = r4.left
            float r2 = (float) r2
            float r2 = r2 + r0
            r5.left = r2
            float r2 = r2 + r1
            r5.right = r2
            goto L31
        L28:
            int r2 = r4.right
            float r2 = (float) r2
            float r2 = r2 - r0
            r5.right = r2
            float r2 = r2 - r1
            r5.left = r2
        L31:
            boolean r0 = r3.f6025q1
            if (r0 == 0) goto L38
            android.graphics.drawable.Drawable r0 = r3.f6000R0
            goto L3a
        L38:
            android.graphics.drawable.Drawable r0 = r3.f5988F0
        L3a:
            float r1 = r3.f5990H0
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L60
            if (r0 == 0) goto L60
            android.content.Context r1 = r3.f6012d1
            r2 = 24
            float r1 = p220m8.C4430n.m9884b(r1, r2)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r2 = r0.getIntrinsicHeight()
            float r2 = (float) r2
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 > 0) goto L60
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            goto L61
        L60:
            r0 = r1
        L61:
            float r4 = r4.exactCenterY()
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r0 / r1
            float r4 = r4 - r1
            r5.top = r4
            float r4 = r4 + r0
            r5.bottom = r4
        L6f:
            return
    }

    /* renamed from: B */
    public float m3355B() {
            r2 = this;
            boolean r0 = r2.m3395q0()
            if (r0 != 0) goto Lf
            boolean r0 = r2.m3394p0()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            float r0 = r2.f6005W0
            float r1 = r2.m3361H()
            float r1 = r1 + r0
            float r0 = r2.f6006X0
            float r1 = r1 + r0
            return r1
    }

    /* renamed from: C */
    public final void m3356C(android.graphics.Rect r3, android.graphics.RectF r4) {
            r2 = this;
            r4.setEmpty()
            boolean r0 = r2.m3396r0()
            if (r0 == 0) goto L3b
            float r0 = r2.f6011c1
            float r1 = r2.f6010b1
            float r0 = r0 + r1
            int r1 = p103g0.C2200a.m5786b(r2)
            if (r1 != 0) goto L20
            int r1 = r3.right
            float r1 = (float) r1
            float r1 = r1 - r0
            r4.right = r1
            float r0 = r2.f5996N0
            float r1 = r1 - r0
            r4.left = r1
            goto L2b
        L20:
            int r1 = r3.left
            float r1 = (float) r1
            float r1 = r1 + r0
            r4.left = r1
            float r0 = r2.f5996N0
            float r1 = r1 + r0
            r4.right = r1
        L2b:
            float r3 = r3.exactCenterY()
            float r0 = r2.f5996N0
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r0 / r1
            float r3 = r3 - r1
            r4.top = r3
            float r3 = r3 + r0
            r4.bottom = r3
        L3b:
            return
    }

    /* renamed from: D */
    public final void m3357D(android.graphics.Rect r4, android.graphics.RectF r5) {
            r3 = this;
            r5.setEmpty()
            boolean r0 = r3.m3396r0()
            if (r0 == 0) goto L39
            float r0 = r3.f6011c1
            float r1 = r3.f6010b1
            float r0 = r0 + r1
            float r1 = r3.f5996N0
            float r0 = r0 + r1
            float r1 = r3.f6009a1
            float r0 = r0 + r1
            float r1 = r3.f6008Z0
            float r0 = r0 + r1
            int r1 = p103g0.C2200a.m5786b(r3)
            if (r1 != 0) goto L26
            int r1 = r4.right
            float r1 = (float) r1
            r5.right = r1
            float r1 = r1 - r0
            r5.left = r1
            goto L2f
        L26:
            int r1 = r4.left
            float r2 = (float) r1
            r5.left = r2
            float r1 = (float) r1
            float r1 = r1 + r0
            r5.right = r1
        L2f:
            int r0 = r4.top
            float r0 = (float) r0
            r5.top = r0
            int r4 = r4.bottom
            float r4 = (float) r4
            r5.bottom = r4
        L39:
            return
    }

    /* renamed from: E */
    public float m3358E() {
            r2 = this;
            boolean r0 = r2.m3396r0()
            if (r0 == 0) goto Lf
            float r0 = r2.f6009a1
            float r1 = r2.f5996N0
            float r0 = r0 + r1
            float r1 = r2.f6010b1
            float r0 = r0 + r1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    /* renamed from: F */
    public float m3359F() {
            r1 = this;
            boolean r0 = r1.f5987E1
            if (r0 == 0) goto L9
            float r0 = r1.m12768l()
            goto Lb
        L9:
            float r0 = r1.f6037z0
        Lb:
            return r0
    }

    /* renamed from: G */
    public android.graphics.drawable.Drawable m3360G() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f5993K0
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = p103g0.C2200a.m5791g(r0)
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    /* renamed from: H */
    public final float m3361H() {
            r3 = this;
            boolean r0 = r3.f6025q1
            if (r0 == 0) goto L7
            android.graphics.drawable.Drawable r0 = r3.f6000R0
            goto L9
        L7:
            android.graphics.drawable.Drawable r0 = r3.f5988F0
        L9:
            float r1 = r3.f5990H0
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L18
            if (r0 == 0) goto L18
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            return r0
        L18:
            return r1
    }

    /* renamed from: K */
    public void m3362K() {
            r1 = this;
            java.lang.ref.WeakReference<com.google.android.material.chip.a$a> r0 = r1.f5979A1
            java.lang.Object r0 = r0.get()
            com.google.android.material.chip.a$a r0 = (com.google.android.material.chip.C1153a.a) r0
            if (r0 == 0) goto Ld
            r0.mo3329a()
        Ld:
            return
    }

    /* renamed from: L */
    public final boolean m3363L(int[] r9, int[] r10) {
            r8 = this;
            boolean r0 = super.onStateChange(r9)
            android.content.res.ColorStateList r1 = r8.f6031w0
            r2 = 0
            if (r1 == 0) goto L10
            int r3 = r8.f6019k1
            int r1 = r1.getColorForState(r9, r3)
            goto L11
        L10:
            r1 = 0
        L11:
            int r1 = r8.m12761e(r1)
            int r3 = r8.f6019k1
            r4 = 1
            if (r3 == r1) goto L1d
            r8.f6019k1 = r1
            r0 = 1
        L1d:
            android.content.res.ColorStateList r3 = r8.f6033x0
            if (r3 == 0) goto L28
            int r5 = r8.f6020l1
            int r3 = r3.getColorForState(r9, r5)
            goto L29
        L28:
            r3 = 0
        L29:
            int r3 = r8.m12761e(r3)
            int r5 = r8.f6020l1
            if (r5 == r3) goto L34
            r8.f6020l1 = r3
            r0 = 1
        L34:
            int r1 = p084f0.C1938a.m4821f(r3, r1)
            int r3 = r8.f6021m1
            if (r3 == r1) goto L3e
            r3 = 1
            goto L3f
        L3e:
            r3 = 0
        L3f:
            t8.f$b r5 = r8.f24036Y
            android.content.res.ColorStateList r5 = r5.f24062d
            if (r5 != 0) goto L47
            r5 = 1
            goto L48
        L47:
            r5 = 0
        L48:
            r3 = r3 | r5
            if (r3 == 0) goto L55
            r8.f6021m1 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r8.m12773q(r0)
            r0 = 1
        L55:
            android.content.res.ColorStateList r1 = r8.f5978A0
            if (r1 == 0) goto L60
            int r3 = r8.f6022n1
            int r1 = r1.getColorForState(r9, r3)
            goto L61
        L60:
            r1 = 0
        L61:
            int r3 = r8.f6022n1
            if (r3 == r1) goto L68
            r8.f6022n1 = r1
            r0 = 1
        L68:
            android.content.res.ColorStateList r1 = r8.f6038z1
            if (r1 == 0) goto L7b
            boolean r1 = p308r8.C5799a.m12172d(r9)
            if (r1 == 0) goto L7b
            android.content.res.ColorStateList r1 = r8.f6038z1
            int r3 = r8.f6023o1
            int r1 = r1.getColorForState(r9, r3)
            goto L7c
        L7b:
            r1 = 0
        L7c:
            int r3 = r8.f6023o1
            if (r3 == r1) goto L87
            r8.f6023o1 = r1
            boolean r1 = r8.f6036y1
            if (r1 == 0) goto L87
            r0 = 1
        L87:
            m8.j r1 = r8.f6018j1
            q8.d r1 = r1.f18080f
            if (r1 == 0) goto L98
            android.content.res.ColorStateList r1 = r1.f21746a
            if (r1 == 0) goto L98
            int r3 = r8.f6024p1
            int r1 = r1.getColorForState(r9, r3)
            goto L99
        L98:
            r1 = 0
        L99:
            int r3 = r8.f6024p1
            if (r3 == r1) goto La0
            r8.f6024p1 = r1
            r0 = 1
        La0:
            int[] r1 = r8.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r1 != 0) goto Lab
        La9:
            r1 = 0
            goto Lb8
        Lab:
            int r5 = r1.length
            r6 = 0
        Lad:
            if (r6 >= r5) goto La9
            r7 = r1[r6]
            if (r7 != r3) goto Lb5
            r1 = 1
            goto Lb8
        Lb5:
            int r6 = r6 + 1
            goto Lad
        Lb8:
            if (r1 == 0) goto Lc0
            boolean r1 = r8.f5998P0
            if (r1 == 0) goto Lc0
            r1 = 1
            goto Lc1
        Lc0:
            r1 = 0
        Lc1:
            boolean r3 = r8.f6025q1
            if (r3 == r1) goto Ldb
            android.graphics.drawable.Drawable r3 = r8.f6000R0
            if (r3 == 0) goto Ldb
            float r0 = r8.m3355B()
            r8.f6025q1 = r1
            float r1 = r8.m3355B()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lda
            r0 = 1
            r1 = 1
            goto Ldc
        Lda:
            r0 = 1
        Ldb:
            r1 = 0
        Ldc:
            android.content.res.ColorStateList r3 = r8.f6030v1
            if (r3 == 0) goto Le7
            int r5 = r8.f6026r1
            int r3 = r3.getColorForState(r9, r5)
            goto Le8
        Le7:
            r3 = 0
        Le8:
            int r5 = r8.f6026r1
            if (r5 == r3) goto Lf9
            r8.f6026r1 = r3
            android.content.res.ColorStateList r0 = r8.f6030v1
            android.graphics.PorterDuff$Mode r3 = r8.f6032w1
            android.graphics.PorterDuffColorFilter r0 = p146i8.C3114a.m7572a(r8, r0, r3)
            r8.f6029u1 = r0
            goto Lfa
        Lf9:
            r4 = r0
        Lfa:
            android.graphics.drawable.Drawable r0 = r8.f5988F0
            boolean r0 = m3353J(r0)
            if (r0 == 0) goto L109
            android.graphics.drawable.Drawable r0 = r8.f5988F0
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L109:
            android.graphics.drawable.Drawable r0 = r8.f6000R0
            boolean r0 = m3353J(r0)
            if (r0 == 0) goto L118
            android.graphics.drawable.Drawable r0 = r8.f6000R0
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L118:
            android.graphics.drawable.Drawable r0 = r8.f5993K0
            boolean r0 = m3353J(r0)
            if (r0 == 0) goto L135
            int r0 = r9.length
            int r3 = r10.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r9.length
            java.lang.System.arraycopy(r9, r2, r0, r2, r3)
            int r9 = r9.length
            int r3 = r10.length
            java.lang.System.arraycopy(r10, r2, r0, r9, r3)
            android.graphics.drawable.Drawable r9 = r8.f5993K0
            boolean r9 = r9.setState(r0)
            r4 = r4 | r9
        L135:
            int[] r9 = p308r8.C5799a.f22492a
            android.graphics.drawable.Drawable r9 = r8.f5994L0
            boolean r9 = m3353J(r9)
            if (r9 == 0) goto L146
            android.graphics.drawable.Drawable r9 = r8.f5994L0
            boolean r9 = r9.setState(r10)
            r4 = r4 | r9
        L146:
            if (r4 == 0) goto L14b
            r8.invalidateSelf()
        L14b:
            if (r1 == 0) goto L150
            r8.m3362K()
        L150:
            return r4
    }

    /* renamed from: M */
    public void m3364M(boolean r2) {
            r1 = this;
            boolean r0 = r1.f5998P0
            if (r0 == r2) goto L21
            r1.f5998P0 = r2
            float r0 = r1.m3355B()
            if (r2 != 0) goto L13
            boolean r2 = r1.f6025q1
            if (r2 == 0) goto L13
            r2 = 0
            r1.f6025q1 = r2
        L13:
            float r2 = r1.m3355B()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            r1.m3362K()
        L21:
            return
    }

    /* renamed from: N */
    public void m3365N(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f6000R0
            if (r0 == r3) goto L22
            float r0 = r2.m3355B()
            r2.f6000R0 = r3
            float r3 = r2.m3355B()
            android.graphics.drawable.Drawable r1 = r2.f6000R0
            r2.m3397s0(r1)
            android.graphics.drawable.Drawable r1 = r2.f6000R0
            r2.m3398z(r1)
            r2.invalidateSelf()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L22
            r2.m3362K()
        L22:
            return
    }

    /* renamed from: O */
    public void m3366O(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f6001S0
            if (r0 == r2) goto L23
            r1.f6001S0 = r2
            boolean r0 = r1.f5999Q0
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r1.f6000R0
            if (r0 == 0) goto L14
            boolean r0 = r1.f5998P0
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1c
            android.graphics.drawable.Drawable r0 = r1.f6000R0
            r0.setTintList(r2)
        L1c:
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L23:
            return
    }

    /* renamed from: P */
    public void m3367P(boolean r2) {
            r1 = this;
            boolean r0 = r1.f5999Q0
            if (r0 == r2) goto L28
            boolean r0 = r1.m3394p0()
            r1.f5999Q0 = r2
            boolean r2 = r1.m3394p0()
            if (r0 == r2) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L28
            if (r2 == 0) goto L1d
            android.graphics.drawable.Drawable r2 = r1.f6000R0
            r1.m3398z(r2)
            goto L22
        L1d:
            android.graphics.drawable.Drawable r2 = r1.f6000R0
            r1.m3397s0(r2)
        L22:
            r1.invalidateSelf()
            r1.m3362K()
        L28:
            return
    }

    /* renamed from: Q */
    public void m3368Q(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f6033x0
            if (r0 == r2) goto Ld
            r1.f6033x0 = r2
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        Ld:
            return
    }

    @java.lang.Deprecated
    /* renamed from: R */
    public void m3369R(float r2) {
            r1 = this;
            float r0 = r1.f6037z0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L17
            r1.f6037z0 = r2
            t8.f$b r0 = r1.f24036Y
            t8.i r0 = r0.f24059a
            t8.i r2 = r0.m12786e(r2)
            t8.f$b r0 = r1.f24036Y
            r0.f24059a = r2
            r1.invalidateSelf()
        L17:
            return
    }

    /* renamed from: S */
    public void m3370S(float r2) {
            r1 = this;
            float r0 = r1.f6011c1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.f6011c1 = r2
            r1.invalidateSelf()
            r1.m3362K()
        Le:
            return
    }

    /* renamed from: T */
    public void m3371T(android.graphics.drawable.Drawable r4) {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.f5988F0
            r1 = 0
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = p103g0.C2200a.m5791g(r0)
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 == r4) goto L39
            float r2 = r3.m3355B()
            if (r4 == 0) goto L1b
            android.graphics.drawable.Drawable r4 = p103g0.C2200a.m5792h(r4)
            android.graphics.drawable.Drawable r1 = r4.mutate()
        L1b:
            r3.f5988F0 = r1
            float r4 = r3.m3355B()
            r3.m3397s0(r0)
            boolean r0 = r3.m3395q0()
            if (r0 == 0) goto L2f
            android.graphics.drawable.Drawable r0 = r3.f5988F0
            r3.m3398z(r0)
        L2f:
            r3.invalidateSelf()
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L39
            r3.m3362K()
        L39:
            return
    }

    /* renamed from: U */
    public void m3372U(float r2) {
            r1 = this;
            float r0 = r1.f5990H0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            float r0 = r1.m3355B()
            r1.f5990H0 = r2
            float r2 = r1.m3355B()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            r1.m3362K()
        L1a:
            return
    }

    /* renamed from: V */
    public void m3373V(android.content.res.ColorStateList r2) {
            r1 = this;
            r0 = 1
            r1.f5991I0 = r0
            android.content.res.ColorStateList r0 = r1.f5989G0
            if (r0 == r2) goto L1b
            r1.f5989G0 = r2
            boolean r0 = r1.m3395q0()
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r1.f5988F0
            r0.setTintList(r2)
        L14:
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L1b:
            return
    }

    /* renamed from: W */
    public void m3374W(boolean r2) {
            r1 = this;
            boolean r0 = r1.f5986E0
            if (r0 == r2) goto L28
            boolean r0 = r1.m3395q0()
            r1.f5986E0 = r2
            boolean r2 = r1.m3395q0()
            if (r0 == r2) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L28
            if (r2 == 0) goto L1d
            android.graphics.drawable.Drawable r2 = r1.f5988F0
            r1.m3398z(r2)
            goto L22
        L1d:
            android.graphics.drawable.Drawable r2 = r1.f5988F0
            r1.m3397s0(r2)
        L22:
            r1.invalidateSelf()
            r1.m3362K()
        L28:
            return
    }

    /* renamed from: X */
    public void m3375X(float r2) {
            r1 = this;
            float r0 = r1.f6035y0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.f6035y0 = r2
            r1.invalidateSelf()
            r1.m3362K()
        Le:
            return
    }

    /* renamed from: Y */
    public void m3376Y(float r2) {
            r1 = this;
            float r0 = r1.f6004V0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.f6004V0 = r2
            r1.invalidateSelf()
            r1.m3362K()
        Le:
            return
    }

    /* renamed from: Z */
    public void m3377Z(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f5978A0
            if (r0 == r2) goto L14
            r1.f5978A0 = r2
            boolean r0 = r1.f5987E1
            if (r0 == 0) goto Ld
            r1.m12778v(r2)
        Ld:
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L14:
            return
    }

    @Override // p220m8.C4426j.b
    /* renamed from: a */
    public void mo3378a() {
            r0 = this;
            r0.m3362K()
            r0.invalidateSelf()
            return
    }

    /* renamed from: a0 */
    public void m3379a0(float r2) {
            r1 = this;
            float r0 = r1.f5980B0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1b
            r1.f5980B0 = r2
            android.graphics.Paint r0 = r1.f6013e1
            r0.setStrokeWidth(r2)
            boolean r0 = r1.f5987E1
            if (r0 == 0) goto L18
            t8.f$b r0 = r1.f24036Y
            r0.f24070l = r2
            r1.invalidateSelf()
        L18:
            r1.invalidateSelf()
        L1b:
            return
    }

    /* renamed from: b0 */
    public void m3380b0(android.graphics.drawable.Drawable r6) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.m3360G()
            if (r0 == r6) goto L47
            float r1 = r5.m3358E()
            if (r6 == 0) goto L15
            android.graphics.drawable.Drawable r6 = p103g0.C2200a.m5792h(r6)
            android.graphics.drawable.Drawable r6 = r6.mutate()
            goto L16
        L15:
            r6 = 0
        L16:
            r5.f5993K0 = r6
            int[] r6 = p308r8.C5799a.f22492a
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r2 = r5.f5982C0
            android.content.res.ColorStateList r2 = p308r8.C5799a.m12171c(r2)
            android.graphics.drawable.Drawable r3 = r5.f5993K0
            android.graphics.drawable.ShapeDrawable r4 = com.google.android.material.chip.C1153a.f5977G1
            r6.<init>(r2, r3, r4)
            r5.f5994L0 = r6
            float r6 = r5.m3358E()
            r5.m3397s0(r0)
            boolean r0 = r5.m3396r0()
            if (r0 == 0) goto L3d
            android.graphics.drawable.Drawable r0 = r5.f5993K0
            r5.m3398z(r0)
        L3d:
            r5.invalidateSelf()
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 == 0) goto L47
            r5.m3362K()
        L47:
            return
    }

    /* renamed from: c0 */
    public void m3381c0(float r2) {
            r1 = this;
            float r0 = r1.f6010b1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L14
            r1.f6010b1 = r2
            r1.invalidateSelf()
            boolean r2 = r1.m3396r0()
            if (r2 == 0) goto L14
            r1.m3362K()
        L14:
            return
    }

    /* renamed from: d0 */
    public void m3382d0(float r2) {
            r1 = this;
            float r0 = r1.f5996N0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L14
            r1.f5996N0 = r2
            r1.invalidateSelf()
            boolean r2 = r1.m3396r0()
            if (r2 == 0) goto L14
            r1.m3362K()
        L14:
            return
    }

    @Override // p340t8.C6189f, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r17) {
            r16 = this;
            r6 = r16
            r14 = r17
            android.graphics.Rect r15 = r16.getBounds()
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L312
            int r12 = r6.f6027s1
            if (r12 != 0) goto L14
            goto L312
        L14:
            r13 = 255(0xff, float:3.57E-43)
            r11 = 0
            if (r12 >= r13) goto L4a
            int r0 = r15.left
            float r8 = (float) r0
            int r0 = r15.top
            float r9 = (float) r0
            int r0 = r15.right
            float r10 = (float) r0
            int r0 = r15.bottom
            float r4 = (float) r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 <= r1) goto L3a
            r0 = r17
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            int r0 = r0.saveLayerAlpha(r1, r2, r3, r4, r5)
            r11 = r0
            r4 = 255(0xff, float:3.57E-43)
            r5 = 0
            goto L48
        L3a:
            r0 = 31
            r7 = r17
            r5 = 0
            r11 = r4
            r4 = 255(0xff, float:3.57E-43)
            r13 = r0
            int r0 = r7.saveLayerAlpha(r8, r9, r10, r11, r12, r13)
            r11 = r0
        L48:
            r13 = r11
            goto L4e
        L4a:
            r4 = 255(0xff, float:3.57E-43)
            r5 = 0
            r13 = 0
        L4e:
            boolean r0 = r6.f5987E1
            if (r0 != 0) goto L74
            android.graphics.Paint r0 = r6.f6013e1
            int r1 = r6.f6019k1
            r0.setColor(r1)
            android.graphics.Paint r0 = r6.f6013e1
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.RectF r0 = r6.f6015g1
            r0.set(r15)
            android.graphics.RectF r0 = r6.f6015g1
            float r1 = r16.m3359F()
            float r2 = r16.m3359F()
            android.graphics.Paint r3 = r6.f6013e1
            r14.drawRoundRect(r0, r1, r2, r3)
        L74:
            boolean r0 = r6.f5987E1
            if (r0 != 0) goto La6
            android.graphics.Paint r0 = r6.f6013e1
            int r1 = r6.f6020l1
            r0.setColor(r1)
            android.graphics.Paint r0 = r6.f6013e1
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r6.f6013e1
            android.graphics.ColorFilter r1 = r6.f6028t1
            if (r1 == 0) goto L8d
            goto L8f
        L8d:
            android.graphics.PorterDuffColorFilter r1 = r6.f6029u1
        L8f:
            r0.setColorFilter(r1)
            android.graphics.RectF r0 = r6.f6015g1
            r0.set(r15)
            android.graphics.RectF r0 = r6.f6015g1
            float r1 = r16.m3359F()
            float r2 = r16.m3359F()
            android.graphics.Paint r3 = r6.f6013e1
            r14.drawRoundRect(r0, r1, r2, r3)
        La6:
            boolean r0 = r6.f5987E1
            if (r0 == 0) goto Lad
            super.draw(r17)
        Lad:
            float r0 = r6.f5980B0
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = 0
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto Lfd
            boolean r0 = r6.f5987E1
            if (r0 != 0) goto Lfd
            android.graphics.Paint r0 = r6.f6013e1
            int r1 = r6.f6022n1
            r0.setColor(r1)
            android.graphics.Paint r0 = r6.f6013e1
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            boolean r0 = r6.f5987E1
            if (r0 != 0) goto Ld8
            android.graphics.Paint r0 = r6.f6013e1
            android.graphics.ColorFilter r1 = r6.f6028t1
            if (r1 == 0) goto Ld3
            goto Ld5
        Ld3:
            android.graphics.PorterDuffColorFilter r1 = r6.f6029u1
        Ld5:
            r0.setColorFilter(r1)
        Ld8:
            android.graphics.RectF r0 = r6.f6015g1
            int r1 = r15.left
            float r1 = (float) r1
            float r2 = r6.f5980B0
            float r2 = r2 / r7
            float r1 = r1 + r2
            int r3 = r15.top
            float r3 = (float) r3
            float r3 = r3 + r2
            int r9 = r15.right
            float r9 = (float) r9
            float r9 = r9 - r2
            int r10 = r15.bottom
            float r10 = (float) r10
            float r10 = r10 - r2
            r0.set(r1, r3, r9, r10)
            float r0 = r6.f6037z0
            float r1 = r6.f5980B0
            float r1 = r1 / r7
            float r0 = r0 - r1
            android.graphics.RectF r1 = r6.f6015g1
            android.graphics.Paint r2 = r6.f6013e1
            r14.drawRoundRect(r1, r0, r0, r2)
        Lfd:
            android.graphics.Paint r0 = r6.f6013e1
            int r1 = r6.f6023o1
            r0.setColor(r1)
            android.graphics.Paint r0 = r6.f6013e1
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.RectF r0 = r6.f6015g1
            r0.set(r15)
            boolean r0 = r6.f5987E1
            if (r0 != 0) goto L127
            android.graphics.RectF r0 = r6.f6015g1
            float r1 = r16.m3359F()
            float r2 = r16.m3359F()
            android.graphics.Paint r3 = r6.f6013e1
            r14.drawRoundRect(r0, r1, r2, r3)
            r11 = 0
            r12 = 255(0xff, float:3.57E-43)
            goto L149
        L127:
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r15)
            android.graphics.Path r1 = r6.f6017i1
            r6.m12759c(r0, r1)
            android.graphics.Paint r2 = r6.f6013e1
            android.graphics.Path r3 = r6.f6017i1
            android.graphics.RectF r9 = r16.m12764h()
            t8.f$b r0 = r6.f24036Y
            t8.i r10 = r0.f24059a
            r0 = r16
            r1 = r17
            r12 = 255(0xff, float:3.57E-43)
            r4 = r10
            r11 = 0
            r5 = r9
            r0.m12763g(r1, r2, r3, r4, r5)
        L149:
            boolean r0 = r16.m3395q0()
            if (r0 == 0) goto L17a
            android.graphics.RectF r0 = r6.f6015g1
            r6.m3354A(r15, r0)
            android.graphics.RectF r0 = r6.f6015g1
            float r1 = r0.left
            float r0 = r0.top
            r14.translate(r1, r0)
            android.graphics.drawable.Drawable r2 = r6.f5988F0
            android.graphics.RectF r3 = r6.f6015g1
            float r3 = r3.width()
            int r3 = (int) r3
            android.graphics.RectF r4 = r6.f6015g1
            float r4 = r4.height()
            int r4 = (int) r4
            r2.setBounds(r11, r11, r3, r4)
            android.graphics.drawable.Drawable r2 = r6.f5988F0
            r2.draw(r14)
            float r1 = -r1
            float r0 = -r0
            r14.translate(r1, r0)
        L17a:
            boolean r0 = r16.m3394p0()
            if (r0 == 0) goto L1ab
            android.graphics.RectF r0 = r6.f6015g1
            r6.m3354A(r15, r0)
            android.graphics.RectF r0 = r6.f6015g1
            float r1 = r0.left
            float r0 = r0.top
            r14.translate(r1, r0)
            android.graphics.drawable.Drawable r2 = r6.f6000R0
            android.graphics.RectF r3 = r6.f6015g1
            float r3 = r3.width()
            int r3 = (int) r3
            android.graphics.RectF r4 = r6.f6015g1
            float r4 = r4.height()
            int r4 = (int) r4
            r2.setBounds(r11, r11, r3, r4)
            android.graphics.drawable.Drawable r2 = r6.f6000R0
            r2.draw(r14)
            float r1 = -r1
            float r0 = -r0
            r14.translate(r1, r0)
        L1ab:
            boolean r0 = r6.f5983C1
            if (r0 == 0) goto L2c4
            java.lang.CharSequence r0 = r6.f5984D0
            if (r0 == 0) goto L2c4
            android.graphics.PointF r0 = r6.f6016h1
            r0.set(r8, r8)
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.LEFT
            java.lang.CharSequence r2 = r6.f5984D0
            if (r2 == 0) goto L1f8
            float r1 = r6.f6004V0
            float r2 = r16.m3355B()
            float r2 = r2 + r1
            float r1 = r6.f6007Y0
            float r2 = r2 + r1
            int r1 = p103g0.C2200a.m5786b(r16)
            if (r1 != 0) goto L1d7
            int r1 = r15.left
            float r1 = (float) r1
            float r1 = r1 + r2
            r0.x = r1
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.LEFT
            goto L1df
        L1d7:
            int r1 = r15.right
            float r1 = (float) r1
            float r1 = r1 - r2
            r0.x = r1
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.RIGHT
        L1df:
            int r2 = r15.centerY()
            float r2 = (float) r2
            m8.j r3 = r6.f6018j1
            android.text.TextPaint r3 = r3.f18075a
            android.graphics.Paint$FontMetrics r4 = r6.f6014f1
            r3.getFontMetrics(r4)
            android.graphics.Paint$FontMetrics r3 = r6.f6014f1
            float r4 = r3.descent
            float r3 = r3.ascent
            float r4 = r4 + r3
            float r4 = r4 / r7
            float r2 = r2 - r4
            r0.y = r2
        L1f8:
            android.graphics.RectF r0 = r6.f6015g1
            r0.setEmpty()
            java.lang.CharSequence r2 = r6.f5984D0
            if (r2 == 0) goto L23c
            float r2 = r6.f6004V0
            float r3 = r16.m3355B()
            float r3 = r3 + r2
            float r2 = r6.f6007Y0
            float r3 = r3 + r2
            float r2 = r6.f6011c1
            float r4 = r16.m3358E()
            float r4 = r4 + r2
            float r2 = r6.f6008Z0
            float r4 = r4 + r2
            int r2 = p103g0.C2200a.m5786b(r16)
            if (r2 != 0) goto L226
            int r2 = r15.left
            float r2 = (float) r2
            float r2 = r2 + r3
            r0.left = r2
            int r2 = r15.right
            float r2 = (float) r2
            float r2 = r2 - r4
            goto L230
        L226:
            int r2 = r15.left
            float r2 = (float) r2
            float r2 = r2 + r4
            r0.left = r2
            int r2 = r15.right
            float r2 = (float) r2
            float r2 = r2 - r3
        L230:
            r0.right = r2
            int r2 = r15.top
            float r2 = (float) r2
            r0.top = r2
            int r2 = r15.bottom
            float r2 = (float) r2
            r0.bottom = r2
        L23c:
            m8.j r0 = r6.f6018j1
            q8.d r2 = r0.f18080f
            if (r2 == 0) goto L257
            android.text.TextPaint r0 = r0.f18075a
            int[] r2 = r16.getState()
            r0.drawableState = r2
            m8.j r0 = r6.f6018j1
            android.content.Context r2 = r6.f6012d1
            q8.d r3 = r0.f18080f
            android.text.TextPaint r4 = r0.f18075a
            h7.xf r0 = r0.f18076b
            r3.m11885e(r2, r4, r0)
        L257:
            m8.j r0 = r6.f6018j1
            android.text.TextPaint r0 = r0.f18075a
            r0.setTextAlign(r1)
            m8.j r0 = r6.f6018j1
            java.lang.CharSequence r1 = r6.f5984D0
            java.lang.String r1 = r1.toString()
            float r0 = r0.m9872a(r1)
            int r0 = java.lang.Math.round(r0)
            android.graphics.RectF r1 = r6.f6015g1
            float r1 = r1.width()
            int r1 = java.lang.Math.round(r1)
            if (r0 <= r1) goto L27c
            r0 = 1
            goto L27d
        L27c:
            r0 = 0
        L27d:
            if (r0 == 0) goto L289
            int r1 = r17.save()
            android.graphics.RectF r2 = r6.f6015g1
            r14.clipRect(r2)
            goto L28a
        L289:
            r1 = 0
        L28a:
            java.lang.CharSequence r2 = r6.f5984D0
            if (r0 == 0) goto L2a2
            android.text.TextUtils$TruncateAt r3 = r6.f5981B1
            if (r3 == 0) goto L2a2
            m8.j r3 = r6.f6018j1
            android.text.TextPaint r3 = r3.f18075a
            android.graphics.RectF r4 = r6.f6015g1
            float r4 = r4.width()
            android.text.TextUtils$TruncateAt r5 = r6.f5981B1
            java.lang.CharSequence r2 = android.text.TextUtils.ellipsize(r2, r3, r4, r5)
        L2a2:
            r8 = r2
            r9 = 0
            int r10 = r8.length()
            android.graphics.PointF r2 = r6.f6016h1
            float r3 = r2.x
            float r2 = r2.y
            m8.j r4 = r6.f6018j1
            android.text.TextPaint r4 = r4.f18075a
            r7 = r17
            r5 = 0
            r11 = r3
            r3 = 255(0xff, float:3.57E-43)
            r12 = r2
            r2 = r13
            r13 = r4
            r7.drawText(r8, r9, r10, r11, r12, r13)
            if (r0 == 0) goto L2c8
            r14.restoreToCount(r1)
            goto L2c8
        L2c4:
            r2 = r13
            r3 = 255(0xff, float:3.57E-43)
            r5 = 0
        L2c8:
            boolean r0 = r16.m3396r0()
            if (r0 == 0) goto L30b
            android.graphics.RectF r0 = r6.f6015g1
            r6.m3356C(r15, r0)
            android.graphics.RectF r0 = r6.f6015g1
            float r1 = r0.left
            float r0 = r0.top
            r14.translate(r1, r0)
            android.graphics.drawable.Drawable r4 = r6.f5993K0
            android.graphics.RectF r7 = r6.f6015g1
            float r7 = r7.width()
            int r7 = (int) r7
            android.graphics.RectF r8 = r6.f6015g1
            float r8 = r8.height()
            int r8 = (int) r8
            r4.setBounds(r5, r5, r7, r8)
            int[] r4 = p308r8.C5799a.f22492a
            android.graphics.drawable.Drawable r4 = r6.f5994L0
            android.graphics.drawable.Drawable r5 = r6.f5993K0
            android.graphics.Rect r5 = r5.getBounds()
            r4.setBounds(r5)
            android.graphics.drawable.Drawable r4 = r6.f5994L0
            r4.jumpToCurrentState()
            android.graphics.drawable.Drawable r4 = r6.f5994L0
            r4.draw(r14)
            float r1 = -r1
            float r0 = -r0
            r14.translate(r1, r0)
        L30b:
            int r0 = r6.f6027s1
            if (r0 >= r3) goto L312
            r14.restoreToCount(r2)
        L312:
            return
    }

    /* renamed from: e0 */
    public void m3383e0(float r2) {
            r1 = this;
            float r0 = r1.f6009a1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L14
            r1.f6009a1 = r2
            r1.invalidateSelf()
            boolean r2 = r1.m3396r0()
            if (r2 == 0) goto L14
            r1.m3362K()
        L14:
            return
    }

    /* renamed from: f0 */
    public boolean m3384f0(int[] r2) {
            r1 = this;
            int[] r0 = r1.f6034x1
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 != 0) goto L19
            r1.f6034x1 = r2
            boolean r0 = r1.m3396r0()
            if (r0 == 0) goto L19
            int[] r0 = r1.getState()
            boolean r2 = r1.m3363L(r0, r2)
            return r2
        L19:
            r2 = 0
            return r2
    }

    /* renamed from: g0 */
    public void m3385g0(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f5995M0
            if (r0 == r2) goto L18
            r1.f5995M0 = r2
            boolean r0 = r1.m3396r0()
            if (r0 == 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.f5993K0
            r0.setTintList(r2)
        L11:
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L18:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            int r0 = r1.f6027s1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.ColorFilter r0 = r1.f6028t1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            float r0 = r1.f6035y0
            int r0 = (int) r0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r3 = this;
            float r0 = r3.f6004V0
            float r1 = r3.m3355B()
            float r1 = r1 + r0
            float r0 = r3.f6007Y0
            float r1 = r1 + r0
            m8.j r0 = r3.f6018j1
            java.lang.CharSequence r2 = r3.f5984D0
            java.lang.String r2 = r2.toString()
            float r0 = r0.m9872a(r2)
            float r0 = r0 + r1
            float r1 = r3.f6008Z0
            float r0 = r0 + r1
            float r1 = r3.m3358E()
            float r1 = r1 + r0
            float r0 = r3.f6011c1
            float r1 = r1 + r0
            int r0 = java.lang.Math.round(r1)
            int r1 = r3.f5985D1
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @Override // p340t8.C6189f, android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // p340t8.C6189f, android.graphics.drawable.Drawable
    @android.annotation.TargetApi(21)
    public void getOutline(android.graphics.Outline r9) {
            r8 = this;
            boolean r0 = r8.f5987E1
            if (r0 == 0) goto L8
            super.getOutline(r9)
            return
        L8:
            android.graphics.Rect r0 = r8.getBounds()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L18
            float r1 = r8.f6037z0
            r9.setRoundRect(r0, r1)
            goto L27
        L18:
            r3 = 0
            r4 = 0
            int r5 = r8.getIntrinsicWidth()
            float r0 = r8.f6035y0
            int r6 = (int) r0
            float r7 = r8.f6037z0
            r2 = r9
            r2.setRoundRect(r3, r4, r5, r6, r7)
        L27:
            int r0 = r8.f6027s1
            float r0 = (float) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r1
            r9.setAlpha(r0)
            return
    }

    /* renamed from: h0 */
    public void m3386h0(boolean r2) {
            r1 = this;
            boolean r0 = r1.f5992J0
            if (r0 == r2) goto L28
            boolean r0 = r1.m3396r0()
            r1.f5992J0 = r2
            boolean r2 = r1.m3396r0()
            if (r0 == r2) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L28
            if (r2 == 0) goto L1d
            android.graphics.drawable.Drawable r2 = r1.f5993K0
            r1.m3398z(r2)
            goto L22
        L1d:
            android.graphics.drawable.Drawable r2 = r1.f5993K0
            r1.m3397s0(r2)
        L22:
            r1.invalidateSelf()
            r1.m3362K()
        L28:
            return
    }

    /* renamed from: i0 */
    public void m3387i0(float r2) {
            r1 = this;
            float r0 = r1.f6006X0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            float r0 = r1.m3355B()
            r1.f6006X0 = r2
            float r2 = r1.m3355B()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            r1.m3362K()
        L1a:
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.invalidateDrawable(r0)
        L9:
            return
    }

    @Override // p340t8.C6189f, android.graphics.drawable.Drawable
    public boolean isStateful() {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.f6031w0
            boolean r0 = m3352I(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L66
            android.content.res.ColorStateList r0 = r3.f6033x0
            boolean r0 = m3352I(r0)
            if (r0 != 0) goto L66
            android.content.res.ColorStateList r0 = r3.f5978A0
            boolean r0 = m3352I(r0)
            if (r0 != 0) goto L66
            boolean r0 = r3.f6036y1
            if (r0 == 0) goto L26
            android.content.res.ColorStateList r0 = r3.f6038z1
            boolean r0 = m3352I(r0)
            if (r0 != 0) goto L66
        L26:
            m8.j r0 = r3.f6018j1
            q8.d r0 = r0.f18080f
            if (r0 == 0) goto L38
            android.content.res.ColorStateList r0 = r0.f21746a
            if (r0 == 0) goto L38
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L38
            r0 = 1
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 != 0) goto L66
            boolean r0 = r3.f5999Q0
            if (r0 == 0) goto L49
            android.graphics.drawable.Drawable r0 = r3.f6000R0
            if (r0 == 0) goto L49
            boolean r0 = r3.f5998P0
            if (r0 == 0) goto L49
            r0 = 1
            goto L4a
        L49:
            r0 = 0
        L4a:
            if (r0 != 0) goto L66
            android.graphics.drawable.Drawable r0 = r3.f5988F0
            boolean r0 = m3353J(r0)
            if (r0 != 0) goto L66
            android.graphics.drawable.Drawable r0 = r3.f6000R0
            boolean r0 = m3353J(r0)
            if (r0 != 0) goto L66
            android.content.res.ColorStateList r0 = r3.f6030v1
            boolean r0 = m3352I(r0)
            if (r0 == 0) goto L65
            goto L66
        L65:
            r1 = 0
        L66:
            return r1
    }

    /* renamed from: j0 */
    public void m3388j0(float r2) {
            r1 = this;
            float r0 = r1.f6005W0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            float r0 = r1.m3355B()
            r1.f6005W0 = r2
            float r2 = r1.m3355B()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            r1.m3362K()
        L1a:
            return
    }

    /* renamed from: k0 */
    public void m3389k0(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f5982C0
            if (r0 == r2) goto L19
            r1.f5982C0 = r2
            boolean r0 = r1.f6036y1
            if (r0 == 0) goto Lf
            android.content.res.ColorStateList r2 = p308r8.C5799a.m12171c(r2)
            goto L10
        Lf:
            r2 = 0
        L10:
            r1.f6038z1 = r2
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L19:
            return
    }

    /* renamed from: l0 */
    public void m3390l0(java.lang.CharSequence r2) {
            r1 = this;
            if (r2 != 0) goto L4
            java.lang.String r2 = ""
        L4:
            java.lang.CharSequence r0 = r1.f5984D0
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L19
            r1.f5984D0 = r2
            m8.j r2 = r1.f6018j1
            r0 = 1
            r2.f18078d = r0
            r1.invalidateSelf()
            r1.m3362K()
        L19:
            return
    }

    /* renamed from: m0 */
    public void m3391m0(float r2) {
            r1 = this;
            float r0 = r1.f6008Z0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.f6008Z0 = r2
            r1.invalidateSelf()
            r1.m3362K()
        Le:
            return
    }

    /* renamed from: n0 */
    public void m3392n0(float r2) {
            r1 = this;
            float r0 = r1.f6007Y0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            r1.f6007Y0 = r2
            r1.invalidateSelf()
            r1.m3362K()
        Le:
            return
    }

    /* renamed from: o0 */
    public void m3393o0(boolean r2) {
            r1 = this;
            boolean r0 = r1.f6036y1
            if (r0 == r2) goto L19
            r1.f6036y1 = r2
            if (r2 == 0) goto Lf
            android.content.res.ColorStateList r2 = r1.f5982C0
            android.content.res.ColorStateList r2 = p308r8.C5799a.m12171c(r2)
            goto L10
        Lf:
            r2 = 0
        L10:
            r1.f6038z1 = r2
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L19:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int r3) {
            r2 = this;
            boolean r0 = super.onLayoutDirectionChanged(r3)
            boolean r1 = r2.m3395q0()
            if (r1 == 0) goto L11
            android.graphics.drawable.Drawable r1 = r2.f5988F0
            boolean r1 = p103g0.C2200a.m5787c(r1, r3)
            r0 = r0 | r1
        L11:
            boolean r1 = r2.m3394p0()
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.f6000R0
            boolean r1 = p103g0.C2200a.m5787c(r1, r3)
            r0 = r0 | r1
        L1e:
            boolean r1 = r2.m3396r0()
            if (r1 == 0) goto L2b
            android.graphics.drawable.Drawable r1 = r2.f5993K0
            boolean r3 = p103g0.C2200a.m5787c(r1, r3)
            r0 = r0 | r3
        L2b:
            if (r0 == 0) goto L30
            r2.invalidateSelf()
        L30:
            r3 = 1
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int r3) {
            r2 = this;
            boolean r0 = super.onLevelChange(r3)
            boolean r1 = r2.m3395q0()
            if (r1 == 0) goto L11
            android.graphics.drawable.Drawable r1 = r2.f5988F0
            boolean r1 = r1.setLevel(r3)
            r0 = r0 | r1
        L11:
            boolean r1 = r2.m3394p0()
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.f6000R0
            boolean r1 = r1.setLevel(r3)
            r0 = r0 | r1
        L1e:
            boolean r1 = r2.m3396r0()
            if (r1 == 0) goto L2b
            android.graphics.drawable.Drawable r1 = r2.f5993K0
            boolean r3 = r1.setLevel(r3)
            r0 = r0 | r3
        L2b:
            if (r0 == 0) goto L30
            r2.invalidateSelf()
        L30:
            return r0
    }

    @Override // p340t8.C6189f, android.graphics.drawable.Drawable, p220m8.C4426j.b
    public boolean onStateChange(int[] r2) {
            r1 = this;
            boolean r0 = r1.f5987E1
            if (r0 == 0) goto L7
            super.onStateChange(r2)
        L7:
            int[] r0 = r1.f6034x1
            boolean r2 = r1.m3363L(r2, r0)
            return r2
    }

    /* renamed from: p0 */
    public final boolean m3394p0() {
            r1 = this;
            boolean r0 = r1.f5999Q0
            if (r0 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r1.f6000R0
            if (r0 == 0) goto Le
            boolean r0 = r1.f6025q1
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    /* renamed from: q0 */
    public final boolean m3395q0() {
            r1 = this;
            boolean r0 = r1.f5986E0
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.f5988F0
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* renamed from: r0 */
    public final boolean m3396r0() {
            r1 = this;
            boolean r0 = r1.f5992J0
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.f5993K0
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* renamed from: s0 */
    public final void m3397s0(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L6
            r0 = 0
            r2.setCallback(r0)
        L6:
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.scheduleDrawable(r0, r2, r3)
        L9:
            return
    }

    @Override // p340t8.C6189f, android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            int r0 = r1.f6027s1
            if (r0 == r2) goto L9
            r1.f6027s1 = r2
            r1.invalidateSelf()
        L9:
            return
    }

    @Override // p340t8.C6189f, android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.ColorFilter r0 = r1.f6028t1
            if (r0 == r2) goto L9
            r1.f6028t1 = r2
            r1.invalidateSelf()
        L9:
            return
    }

    @Override // p340t8.C6189f, android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f6030v1
            if (r0 == r2) goto Ld
            r1.f6030v1 = r2
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        Ld:
            return
    }

    @Override // p340t8.C6189f, android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f6032w1
            if (r0 == r2) goto L11
            r1.f6032w1 = r2
            android.content.res.ColorStateList r0 = r1.f6030v1
            android.graphics.PorterDuffColorFilter r2 = p146i8.C3114a.m7572a(r1, r0, r2)
            r1.f6029u1 = r2
            r1.invalidateSelf()
        L11:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            boolean r1 = r2.m3395q0()
            if (r1 == 0) goto L11
            android.graphics.drawable.Drawable r1 = r2.f5988F0
            boolean r1 = r1.setVisible(r3, r4)
            r0 = r0 | r1
        L11:
            boolean r1 = r2.m3394p0()
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.f6000R0
            boolean r1 = r1.setVisible(r3, r4)
            r0 = r0 | r1
        L1e:
            boolean r1 = r2.m3396r0()
            if (r1 == 0) goto L2b
            android.graphics.drawable.Drawable r1 = r2.f5993K0
            boolean r3 = r1.setVisible(r3, r4)
            r0 = r0 | r3
        L2b:
            if (r0 == 0) goto L30
            r2.invalidateSelf()
        L30:
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.unscheduleDrawable(r0, r2)
        L9:
            return
    }

    /* renamed from: z */
    public final void m3398z(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            r3.setCallback(r2)
            int r0 = p103g0.C2200a.m5786b(r2)
            p103g0.C2200a.m5787c(r3, r0)
            int r0 = r2.getLevel()
            r3.setLevel(r0)
            boolean r0 = r2.isVisible()
            r1 = 0
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r0 = r2.f5993K0
            if (r3 != r0) goto L31
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L2b
            int[] r0 = r2.f6034x1
            r3.setState(r0)
        L2b:
            android.content.res.ColorStateList r0 = r2.f5995M0
            r3.setTintList(r0)
            return
        L31:
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L3e
            int[] r0 = r2.getState()
            r3.setState(r0)
        L3e:
            android.graphics.drawable.Drawable r0 = r2.f5988F0
            if (r3 != r0) goto L4b
            boolean r3 = r2.f5991I0
            if (r3 == 0) goto L4b
            android.content.res.ColorStateList r3 = r2.f5989G0
            r0.setTintList(r3)
        L4b:
            return
    }
}
