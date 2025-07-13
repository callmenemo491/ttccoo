package p220m8;

/* renamed from: m8.c */
/* loaded from: classes.dex */
public final class C4419c {

    /* renamed from: A */
    public android.graphics.Bitmap f17995A;

    /* renamed from: B */
    public float f17996B;

    /* renamed from: C */
    public float f17997C;

    /* renamed from: D */
    public int[] f17998D;

    /* renamed from: E */
    public boolean f17999E;

    /* renamed from: F */
    public final android.text.TextPaint f18000F;

    /* renamed from: G */
    public final android.text.TextPaint f18001G;

    /* renamed from: H */
    public android.animation.TimeInterpolator f18002H;

    /* renamed from: I */
    public android.animation.TimeInterpolator f18003I;

    /* renamed from: J */
    public float f18004J;

    /* renamed from: K */
    public float f18005K;

    /* renamed from: L */
    public float f18006L;

    /* renamed from: M */
    public android.content.res.ColorStateList f18007M;

    /* renamed from: N */
    public float f18008N;

    /* renamed from: O */
    public android.text.StaticLayout f18009O;

    /* renamed from: P */
    public float f18010P;

    /* renamed from: Q */
    public float f18011Q;

    /* renamed from: R */
    public java.lang.CharSequence f18012R;

    /* renamed from: S */
    public int f18013S;

    /* renamed from: a */
    public final android.view.View f18014a;

    /* renamed from: b */
    public boolean f18015b;

    /* renamed from: c */
    public float f18016c;

    /* renamed from: d */
    public float f18017d;

    /* renamed from: e */
    public final android.graphics.Rect f18018e;

    /* renamed from: f */
    public final android.graphics.Rect f18019f;

    /* renamed from: g */
    public final android.graphics.RectF f18020g;

    /* renamed from: h */
    public int f18021h;

    /* renamed from: i */
    public int f18022i;

    /* renamed from: j */
    public float f18023j;

    /* renamed from: k */
    public float f18024k;

    /* renamed from: l */
    public android.content.res.ColorStateList f18025l;

    /* renamed from: m */
    public android.content.res.ColorStateList f18026m;

    /* renamed from: n */
    public float f18027n;

    /* renamed from: o */
    public float f18028o;

    /* renamed from: p */
    public float f18029p;

    /* renamed from: q */
    public float f18030q;

    /* renamed from: r */
    public float f18031r;

    /* renamed from: s */
    public float f18032s;

    /* renamed from: t */
    public android.graphics.Typeface f18033t;

    /* renamed from: u */
    public android.graphics.Typeface f18034u;

    /* renamed from: v */
    public android.graphics.Typeface f18035v;

    /* renamed from: w */
    public p288q8.C5597a f18036w;

    /* renamed from: x */
    public java.lang.CharSequence f18037x;

    /* renamed from: y */
    public java.lang.CharSequence f18038y;

    /* renamed from: z */
    public boolean f18039z;

    public C4419c(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = 16
            r1.f18021h = r0
            r1.f18022i = r0
            r0 = 1097859072(0x41700000, float:15.0)
            r1.f18023j = r0
            r1.f18024k = r0
            int r0 = p220m8.C4425i.f18059m
            r1.f18013S = r0
            r1.f18014a = r2
            android.text.TextPaint r2 = new android.text.TextPaint
            r0 = 129(0x81, float:1.81E-43)
            r2.<init>(r0)
            r1.f18000F = r2
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>(r2)
            r1.f18001G = r0
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.f18019f = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.f18018e = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r1.f18020g = r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.f18017d = r2
            return
    }

    /* renamed from: a */
    public static int m9851a(int r5, int r6, float r7) {
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r7
            int r1 = android.graphics.Color.alpha(r5)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r2 = android.graphics.Color.alpha(r6)
            float r2 = (float) r2
            float r2 = r2 * r7
            float r2 = r2 + r1
            int r1 = android.graphics.Color.red(r5)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r3 = android.graphics.Color.red(r6)
            float r3 = (float) r3
            float r3 = r3 * r7
            float r3 = r3 + r1
            int r1 = android.graphics.Color.green(r5)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r4 = android.graphics.Color.green(r6)
            float r4 = (float) r4
            float r4 = r4 * r7
            float r4 = r4 + r1
            int r5 = android.graphics.Color.blue(r5)
            float r5 = (float) r5
            float r5 = r5 * r0
            int r6 = android.graphics.Color.blue(r6)
            float r6 = (float) r6
            float r6 = r6 * r7
            float r6 = r6 + r5
            int r5 = (int) r2
            int r7 = (int) r3
            int r0 = (int) r4
            int r6 = (int) r6
            int r5 = android.graphics.Color.argb(r5, r7, r0, r6)
            return r5
    }

    /* renamed from: i */
    public static float m9852i(float r0, float r1, float r2, android.animation.TimeInterpolator r3) {
            if (r3 == 0) goto L6
            float r2 = r3.getInterpolation(r2)
        L6:
            float r0 = p354u7.C6350a.m13003a(r0, r1, r2)
            return r0
    }

    /* renamed from: l */
    public static boolean m9853l(android.graphics.Rect r1, int r2, int r3, int r4, int r5) {
            int r0 = r1.left
            if (r0 != r2) goto L12
            int r2 = r1.top
            if (r2 != r3) goto L12
            int r2 = r1.right
            if (r2 != r4) goto L12
            int r1 = r1.bottom
            if (r1 != r5) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    /* renamed from: b */
    public float m9854b() {
            r4 = this;
            java.lang.CharSequence r0 = r4.f18037x
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.text.TextPaint r0 = r4.f18001G
            float r1 = r4.f18024k
            r0.setTextSize(r1)
            android.graphics.Typeface r1 = r4.f18033t
            r0.setTypeface(r1)
            float r1 = r4.f18008N
            r0.setLetterSpacing(r1)
            android.text.TextPaint r0 = r4.f18001G
            java.lang.CharSequence r1 = r4.f18037x
            r2 = 0
            int r3 = r1.length()
            float r0 = r0.measureText(r1, r2, r3)
            return r0
    }

    /* renamed from: c */
    public final boolean m9855c(java.lang.CharSequence r4) {
            r3 = this;
            android.view.View r0 = r3.f18014a
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            int r0 = p227n0.C4661t.d.m10575d(r0)
            r1 = 1
            r2 = 0
            if (r0 != r1) goto Ld
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 == 0) goto L13
            l0.c r0 = p195l0.C4160d.f17236d
            goto L15
        L13:
            l0.c r0 = p195l0.C4160d.f17235c
        L15:
            int r1 = r4.length()
            l0.d$c r0 = (p195l0.C4160d.c) r0
            boolean r4 = r0.m9221b(r4, r2, r1)
            return r4
    }

    /* renamed from: d */
    public final void m9856d(float r7) {
            r6 = this;
            android.graphics.RectF r0 = r6.f18020g
            android.graphics.Rect r1 = r6.f18018e
            int r1 = r1.left
            float r1 = (float) r1
            android.graphics.Rect r2 = r6.f18019f
            int r2 = r2.left
            float r2 = (float) r2
            android.animation.TimeInterpolator r3 = r6.f18002H
            float r1 = m9852i(r1, r2, r7, r3)
            r0.left = r1
            android.graphics.RectF r0 = r6.f18020g
            float r1 = r6.f18027n
            float r2 = r6.f18028o
            android.animation.TimeInterpolator r3 = r6.f18002H
            float r1 = m9852i(r1, r2, r7, r3)
            r0.top = r1
            android.graphics.RectF r0 = r6.f18020g
            android.graphics.Rect r1 = r6.f18018e
            int r1 = r1.right
            float r1 = (float) r1
            android.graphics.Rect r2 = r6.f18019f
            int r2 = r2.right
            float r2 = (float) r2
            android.animation.TimeInterpolator r3 = r6.f18002H
            float r1 = m9852i(r1, r2, r7, r3)
            r0.right = r1
            android.graphics.RectF r0 = r6.f18020g
            android.graphics.Rect r1 = r6.f18018e
            int r1 = r1.bottom
            float r1 = (float) r1
            android.graphics.Rect r2 = r6.f18019f
            int r2 = r2.bottom
            float r2 = (float) r2
            android.animation.TimeInterpolator r3 = r6.f18002H
            float r1 = m9852i(r1, r2, r7, r3)
            r0.bottom = r1
            float r0 = r6.f18029p
            float r1 = r6.f18030q
            android.animation.TimeInterpolator r2 = r6.f18002H
            float r0 = m9852i(r0, r1, r7, r2)
            r6.f18031r = r0
            float r0 = r6.f18027n
            float r1 = r6.f18028o
            android.animation.TimeInterpolator r2 = r6.f18002H
            float r0 = m9852i(r0, r1, r7, r2)
            r6.f18032s = r0
            float r0 = r6.f18023j
            float r1 = r6.f18024k
            android.animation.TimeInterpolator r2 = r6.f18003I
            float r0 = m9852i(r0, r1, r7, r2)
            r6.m9866p(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r0 - r7
            android.animation.TimeInterpolator r2 = p354u7.C6350a.f24804b
            r3 = 0
            float r1 = m9852i(r3, r0, r1, r2)
            float r1 = r0 - r1
            r6.f18010P = r1
            android.view.View r1 = r6.f18014a
            java.util.WeakHashMap<android.view.View, n0.w> r4 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10563k(r1)
            float r0 = m9852i(r0, r3, r7, r2)
            r6.f18011Q = r0
            android.view.View r0 = r6.f18014a
            p227n0.C4661t.c.m10563k(r0)
            android.content.res.ColorStateList r0 = r6.f18026m
            android.content.res.ColorStateList r1 = r6.f18025l
            if (r0 == r1) goto La5
            android.text.TextPaint r0 = r6.f18000F
            int r1 = r6.m9860h(r1)
            int r4 = r6.m9859g()
            int r1 = m9851a(r1, r4, r7)
            goto Lab
        La5:
            android.text.TextPaint r0 = r6.f18000F
            int r1 = r6.m9859g()
        Lab:
            r0.setColor(r1)
            float r0 = r6.f18008N
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r1 == 0) goto Lbb
            android.text.TextPaint r1 = r6.f18000F
            float r0 = m9852i(r3, r0, r7, r2)
            goto Lbd
        Lbb:
            android.text.TextPaint r1 = r6.f18000F
        Lbd:
            r1.setLetterSpacing(r0)
            android.text.TextPaint r0 = r6.f18000F
            float r1 = r6.f18004J
            r2 = 0
            float r1 = m9852i(r3, r1, r7, r2)
            float r4 = r6.f18005K
            float r4 = m9852i(r3, r4, r7, r2)
            float r5 = r6.f18006L
            float r3 = m9852i(r3, r5, r7, r2)
            int r2 = r6.m9860h(r2)
            android.content.res.ColorStateList r5 = r6.f18007M
            int r5 = r6.m9860h(r5)
            int r7 = m9851a(r2, r5, r7)
            r0.setShadowLayer(r1, r4, r3, r7)
            android.view.View r7 = r6.f18014a
            p227n0.C4661t.c.m10563k(r7)
            return
    }

    /* renamed from: e */
    public final void m9857e(float r10, boolean r11) {
            r9 = this;
            java.lang.CharSequence r0 = r9.f18037x
            if (r0 != 0) goto L5
            return
        L5:
            android.graphics.Rect r0 = r9.f18019f
            int r0 = r0.width()
            float r0 = (float) r0
            android.graphics.Rect r1 = r9.f18018e
            int r1 = r1.width()
            float r1 = (float) r1
            float r2 = r9.f18024k
            float r2 = r10 - r2
            float r2 = java.lang.Math.abs(r2)
            r3 = 981668463(0x3a83126f, float:0.001)
            r4 = 0
            r5 = 1
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L26
            r2 = 1
            goto L27
        L26:
            r2 = 0
        L27:
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L3b
            float r10 = r9.f18024k
            r9.f17996B = r6
            android.graphics.Typeface r11 = r9.f18035v
            android.graphics.Typeface r1 = r9.f18033t
            if (r11 == r1) goto L39
            r9.f18035v = r1
            r7 = 1
            goto L76
        L39:
            r7 = 0
            goto L76
        L3b:
            float r2 = r9.f18023j
            android.graphics.Typeface r7 = r9.f18035v
            android.graphics.Typeface r8 = r9.f18034u
            if (r7 == r8) goto L47
            r9.f18035v = r8
            r7 = 1
            goto L48
        L47:
            r7 = 0
        L48:
            float r8 = r10 - r2
            float r8 = java.lang.Math.abs(r8)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L54
            r3 = 1
            goto L55
        L54:
            r3 = 0
        L55:
            if (r3 == 0) goto L5a
            r9.f17996B = r6
            goto L5f
        L5a:
            float r3 = r9.f18023j
            float r10 = r10 / r3
            r9.f17996B = r10
        L5f:
            float r10 = r9.f18024k
            float r3 = r9.f18023j
            float r10 = r10 / r3
            float r3 = r1 * r10
            if (r11 == 0) goto L69
            goto L74
        L69:
            int r11 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r11 <= 0) goto L74
            float r0 = r0 / r10
            float r10 = java.lang.Math.min(r0, r1)
            r0 = r10
            goto L75
        L74:
            r0 = r1
        L75:
            r10 = r2
        L76:
            r11 = 0
            int r1 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r1 <= 0) goto L8f
            float r1 = r9.f17997C
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 != 0) goto L8a
            boolean r1 = r9.f17999E
            if (r1 != 0) goto L8a
            if (r7 == 0) goto L88
            goto L8a
        L88:
            r7 = 0
            goto L8b
        L8a:
            r7 = 1
        L8b:
            r9.f17997C = r10
            r9.f17999E = r4
        L8f:
            java.lang.CharSequence r10 = r9.f18038y
            if (r10 == 0) goto L95
            if (r7 == 0) goto Lf8
        L95:
            android.text.TextPaint r10 = r9.f18000F
            float r1 = r9.f17997C
            r10.setTextSize(r1)
            android.text.TextPaint r10 = r9.f18000F
            android.graphics.Typeface r1 = r9.f18035v
            r10.setTypeface(r1)
            android.text.TextPaint r10 = r9.f18000F
            float r1 = r9.f17996B
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto Lad
            r1 = 1
            goto Lae
        Lad:
            r1 = 0
        Lae:
            r10.setLinearText(r1)
            java.lang.CharSequence r10 = r9.f18037x
            boolean r10 = r9.m9855c(r10)
            r9.f18039z = r10
            java.lang.CharSequence r1 = r9.f18037x     // Catch: p220m8.C4425i.a -> Lde
            android.text.TextPaint r2 = r9.f18000F     // Catch: p220m8.C4425i.a -> Lde
            int r0 = (int) r0     // Catch: p220m8.C4425i.a -> Lde
            m8.i r3 = new m8.i     // Catch: p220m8.C4425i.a -> Lde
            r3.<init>(r1, r2, r0)     // Catch: p220m8.C4425i.a -> Lde
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END     // Catch: p220m8.C4425i.a -> Lde
            r3.f18074l = r0     // Catch: p220m8.C4425i.a -> Lde
            r3.f18073k = r10     // Catch: p220m8.C4425i.a -> Lde
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch: p220m8.C4425i.a -> Lde
            r3.f18067e = r10     // Catch: p220m8.C4425i.a -> Lde
            r3.f18072j = r4     // Catch: p220m8.C4425i.a -> Lde
            r3.f18068f = r5     // Catch: p220m8.C4425i.a -> Lde
            r3.f18069g = r11     // Catch: p220m8.C4425i.a -> Lde
            r3.f18070h = r6     // Catch: p220m8.C4425i.a -> Lde
            int r10 = r9.f18013S     // Catch: p220m8.C4425i.a -> Lde
            r3.f18071i = r10     // Catch: p220m8.C4425i.a -> Lde
            android.text.StaticLayout r10 = r3.m9871a()     // Catch: p220m8.C4425i.a -> Lde
            goto Led
        Lde:
            r10 = move-exception
            java.lang.Throwable r11 = r10.getCause()
            java.lang.String r11 = r11.getMessage()
            java.lang.String r0 = "CollapsingTextHelper"
            android.util.Log.e(r0, r11, r10)
            r10 = 0
        Led:
            java.util.Objects.requireNonNull(r10)
            r9.f18009O = r10
            java.lang.CharSequence r10 = r10.getText()
            r9.f18038y = r10
        Lf8:
            return
    }

    /* renamed from: f */
    public float m9858f() {
            r2 = this;
            android.text.TextPaint r0 = r2.f18001G
            float r1 = r2.f18024k
            r0.setTextSize(r1)
            android.graphics.Typeface r1 = r2.f18033t
            r0.setTypeface(r1)
            float r1 = r2.f18008N
            r0.setLetterSpacing(r1)
            android.text.TextPaint r0 = r2.f18001G
            float r0 = r0.ascent()
            float r0 = -r0
            return r0
    }

    /* renamed from: g */
    public int m9859g() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f18026m
            int r0 = r1.m9860h(r0)
            return r0
    }

    /* renamed from: h */
    public final int m9860h(android.content.res.ColorStateList r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int[] r1 = r2.f17998D
            if (r1 == 0) goto Ld
            int r3 = r3.getColorForState(r1, r0)
            return r3
        Ld:
            int r3 = r3.getDefaultColor()
            return r3
    }

    /* renamed from: j */
    public void m9861j() {
            r1 = this;
            android.graphics.Rect r0 = r1.f18019f
            int r0 = r0.width()
            if (r0 <= 0) goto L22
            android.graphics.Rect r0 = r1.f18019f
            int r0 = r0.height()
            if (r0 <= 0) goto L22
            android.graphics.Rect r0 = r1.f18018e
            int r0 = r0.width()
            if (r0 <= 0) goto L22
            android.graphics.Rect r0 = r1.f18018e
            int r0 = r0.height()
            if (r0 <= 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            r1.f18015b = r0
            return
    }

    /* renamed from: k */
    public void m9862k() {
            r12 = this;
            android.view.View r0 = r12.f18014a
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L129
            android.view.View r0 = r12.f18014a
            int r0 = r0.getWidth()
            if (r0 > 0) goto L12
            goto L129
        L12:
            float r0 = r12.f17997C
            float r1 = r12.f18024k
            r2 = 0
            r12.m9857e(r1, r2)
            java.lang.CharSequence r1 = r12.f18038y
            if (r1 == 0) goto L31
            android.text.StaticLayout r3 = r12.f18009O
            if (r3 == 0) goto L31
            android.text.TextPaint r4 = r12.f18000F
            int r3 = r3.getWidth()
            float r3 = (float) r3
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r1 = android.text.TextUtils.ellipsize(r1, r4, r3, r5)
            r12.f18012R = r1
        L31:
            java.lang.CharSequence r1 = r12.f18012R
            r3 = 0
            if (r1 == 0) goto L41
            android.text.TextPaint r4 = r12.f18000F
            int r5 = r1.length()
            float r1 = r4.measureText(r1, r2, r5)
            goto L42
        L41:
            r1 = 0
        L42:
            int r4 = r12.f18022i
            boolean r5 = r12.f18039z
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r5 = r4 & 112(0x70, float:1.57E-43)
            r6 = 80
            r7 = 48
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L7c
            if (r5 == r6) goto L6d
            android.text.TextPaint r5 = r12.f18000F
            float r5 = r5.descent()
            android.text.TextPaint r9 = r12.f18000F
            float r9 = r9.ascent()
            float r5 = r5 - r9
            float r5 = r5 / r8
            android.graphics.Rect r9 = r12.f18019f
            int r9 = r9.centerY()
            float r9 = (float) r9
            float r9 = r9 - r5
            goto L79
        L6d:
            android.graphics.Rect r5 = r12.f18019f
            int r5 = r5.bottom
            float r5 = (float) r5
            android.text.TextPaint r9 = r12.f18000F
            float r9 = r9.ascent()
            float r9 = r9 + r5
        L79:
            r12.f18028o = r9
            goto L83
        L7c:
            android.graphics.Rect r5 = r12.f18019f
            int r5 = r5.top
            float r5 = (float) r5
            r12.f18028o = r5
        L83:
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r9 = 5
            r10 = 1
            if (r4 == r10) goto L9b
            if (r4 == r9) goto L95
            android.graphics.Rect r1 = r12.f18019f
            int r1 = r1.left
            float r1 = (float) r1
            r12.f18030q = r1
            goto La6
        L95:
            android.graphics.Rect r4 = r12.f18019f
            int r4 = r4.right
            float r4 = (float) r4
            goto La3
        L9b:
            android.graphics.Rect r4 = r12.f18019f
            int r4 = r4.centerX()
            float r4 = (float) r4
            float r1 = r1 / r8
        La3:
            float r4 = r4 - r1
            r12.f18030q = r4
        La6:
            float r1 = r12.f18023j
            r12.m9857e(r1, r2)
            android.text.StaticLayout r1 = r12.f18009O
            if (r1 == 0) goto Lb5
            int r1 = r1.getHeight()
            float r1 = (float) r1
            goto Lb6
        Lb5:
            r1 = 0
        Lb6:
            java.lang.CharSequence r4 = r12.f18038y
            if (r4 == 0) goto Lc4
            android.text.TextPaint r3 = r12.f18000F
            int r11 = r4.length()
            float r3 = r3.measureText(r4, r2, r11)
        Lc4:
            android.text.StaticLayout r4 = r12.f18009O
            if (r4 == 0) goto Lcb
            r4.getLineLeft(r2)
        Lcb:
            int r2 = r12.f18021h
            boolean r4 = r12.f18039z
            int r2 = android.view.Gravity.getAbsoluteGravity(r2, r4)
            r4 = r2 & 112(0x70, float:1.57E-43)
            if (r4 == r7) goto Lf3
            if (r4 == r6) goto Le5
            float r1 = r1 / r8
            android.graphics.Rect r4 = r12.f18018e
            int r4 = r4.centerY()
            float r4 = (float) r4
            float r4 = r4 - r1
            r12.f18027n = r4
            goto Lfa
        Le5:
            android.graphics.Rect r4 = r12.f18018e
            int r4 = r4.bottom
            float r4 = (float) r4
            float r4 = r4 - r1
            android.text.TextPaint r1 = r12.f18000F
            float r1 = r1.descent()
            float r1 = r1 + r4
            goto Lf8
        Lf3:
            android.graphics.Rect r1 = r12.f18018e
            int r1 = r1.top
            float r1 = (float) r1
        Lf8:
            r12.f18027n = r1
        Lfa:
            r1 = r2 & r5
            if (r1 == r10) goto L10c
            if (r1 == r9) goto L106
            android.graphics.Rect r1 = r12.f18018e
            int r1 = r1.left
            float r1 = (float) r1
            goto L115
        L106:
            android.graphics.Rect r1 = r12.f18018e
            int r1 = r1.right
            float r1 = (float) r1
            goto L114
        L10c:
            android.graphics.Rect r1 = r12.f18018e
            int r1 = r1.centerX()
            float r1 = (float) r1
            float r3 = r3 / r8
        L114:
            float r1 = r1 - r3
        L115:
            r12.f18029p = r1
            android.graphics.Bitmap r1 = r12.f17995A
            if (r1 == 0) goto L121
            r1.recycle()
            r1 = 0
            r12.f17995A = r1
        L121:
            r12.m9866p(r0)
            float r0 = r12.f18016c
            r12.m9856d(r0)
        L129:
            return
    }

    /* renamed from: m */
    public void m9863m(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f18026m
            if (r0 == r2) goto L9
            r1.f18026m = r2
            r1.m9862k()
        L9:
            return
    }

    /* renamed from: n */
    public void m9864n(int r2) {
            r1 = this;
            int r0 = r1.f18022i
            if (r0 == r2) goto L9
            r1.f18022i = r2
            r1.m9862k()
        L9:
            return
    }

    /* renamed from: o */
    public void m9865o(float r4) {
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 >= 0) goto L9
            r4 = 0
            goto Lf
        L9:
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lf
            r4 = 1065353216(0x3f800000, float:1.0)
        Lf:
            float r0 = r3.f18016c
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L1a
            r3.f18016c = r4
            r3.m9856d(r4)
        L1a:
            return
    }

    /* renamed from: p */
    public final void m9866p(float r2) {
            r1 = this;
            r0 = 0
            r1.m9857e(r2, r0)
            android.view.View r2 = r1.f18014a
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10563k(r2)
            return
    }

    /* renamed from: q */
    public void m9867q(android.graphics.Typeface r5) {
            r4 = this;
            q8.a r0 = r4.f18036w
            r1 = 1
            if (r0 == 0) goto L7
            r0.f21745d = r1
        L7:
            android.graphics.Typeface r0 = r4.f18033t
            r2 = 0
            if (r0 == r5) goto L10
            r4.f18033t = r5
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            android.graphics.Typeface r3 = r4.f18034u
            if (r3 == r5) goto L18
            r4.f18034u = r5
            goto L19
        L18:
            r1 = 0
        L19:
            if (r0 != 0) goto L1d
            if (r1 == 0) goto L20
        L1d:
            r4.m9862k()
        L20:
            return
    }
}
