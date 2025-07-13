package p337t5;

/* renamed from: t5.f */
/* loaded from: classes.dex */
public final class C6176f {

    /* renamed from: A */
    public int f23947A;

    /* renamed from: B */
    public int f23948B;

    /* renamed from: C */
    public int f23949C;

    /* renamed from: D */
    public int f23950D;

    /* renamed from: E */
    public android.text.StaticLayout f23951E;

    /* renamed from: F */
    public android.text.StaticLayout f23952F;

    /* renamed from: G */
    public int f23953G;

    /* renamed from: H */
    public int f23954H;

    /* renamed from: I */
    public int f23955I;

    /* renamed from: J */
    public android.graphics.Rect f23956J;

    /* renamed from: a */
    public final float f23957a;

    /* renamed from: b */
    public final float f23958b;

    /* renamed from: c */
    public final float f23959c;

    /* renamed from: d */
    public final float f23960d;

    /* renamed from: e */
    public final float f23961e;

    /* renamed from: f */
    public final android.text.TextPaint f23962f;

    /* renamed from: g */
    public final android.graphics.Paint f23963g;

    /* renamed from: h */
    public final android.graphics.Paint f23964h;

    /* renamed from: i */
    public java.lang.CharSequence f23965i;

    /* renamed from: j */
    public android.text.Layout.Alignment f23966j;

    /* renamed from: k */
    public android.graphics.Bitmap f23967k;

    /* renamed from: l */
    public float f23968l;

    /* renamed from: m */
    public int f23969m;

    /* renamed from: n */
    public int f23970n;

    /* renamed from: o */
    public float f23971o;

    /* renamed from: p */
    public int f23972p;

    /* renamed from: q */
    public float f23973q;

    /* renamed from: r */
    public float f23974r;

    /* renamed from: s */
    public int f23975s;

    /* renamed from: t */
    public int f23976t;

    /* renamed from: u */
    public int f23977u;

    /* renamed from: v */
    public int f23978v;

    /* renamed from: w */
    public int f23979w;

    /* renamed from: x */
    public float f23980x;

    /* renamed from: y */
    public float f23981y;

    /* renamed from: z */
    public float f23982z;

    public C6176f(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x006a: FILL_ARRAY_DATA , data: [16843287, 16843288} // fill-array
            r1 = 0
            r2 = 0
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r1, r0, r2, r2)
            int r1 = r0.getDimensionPixelSize(r2, r2)
            float r1 = (float) r1
            r3.f23961e = r1
            r1 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r0.getFloat(r1, r2)
            r3.f23960d = r2
            r0.recycle()
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.densityDpi
            float r4 = (float) r4
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r0
            r0 = 1126170624(0x43200000, float:160.0)
            float r4 = r4 / r0
            int r4 = java.lang.Math.round(r4)
            float r4 = (float) r4
            r3.f23957a = r4
            r3.f23958b = r4
            r3.f23959c = r4
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>()
            r3.f23962f = r4
            r4.setAntiAlias(r1)
            r4.setSubpixelText(r1)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.f23963g = r4
            r4.setAntiAlias(r1)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r4.setStyle(r0)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.f23964h = r4
            r4.setAntiAlias(r1)
            r4.setFilterBitmap(r1)
            return
    }

    /* renamed from: a */
    public final void m12745a(android.graphics.Canvas r10, boolean r11) {
            r9 = this;
            if (r11 == 0) goto Lca
            android.text.StaticLayout r11 = r9.f23951E
            android.text.StaticLayout r0 = r9.f23952F
            if (r11 == 0) goto Lde
            if (r0 != 0) goto Lc
            goto Lde
        Lc:
            int r1 = r10.save()
            int r2 = r9.f23953G
            float r2 = (float) r2
            int r3 = r9.f23954H
            float r3 = (float) r3
            r10.translate(r2, r3)
            int r2 = r9.f23977u
            int r2 = android.graphics.Color.alpha(r2)
            if (r2 <= 0) goto L40
            android.graphics.Paint r2 = r9.f23963g
            int r3 = r9.f23977u
            r2.setColor(r3)
            int r2 = r9.f23955I
            int r2 = -r2
            float r4 = (float) r2
            r5 = 0
            int r2 = r11.getWidth()
            int r3 = r9.f23955I
            int r2 = r2 + r3
            float r6 = (float) r2
            int r2 = r11.getHeight()
            float r7 = (float) r2
            android.graphics.Paint r8 = r9.f23963g
            r3 = r10
            r3.drawRect(r4, r5, r6, r7, r8)
        L40:
            int r2 = r9.f23979w
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L66
            android.text.TextPaint r2 = r9.f23962f
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.ROUND
            r2.setStrokeJoin(r3)
            android.text.TextPaint r2 = r9.f23962f
            float r3 = r9.f23957a
            r2.setStrokeWidth(r3)
            android.text.TextPaint r2 = r9.f23962f
            int r3 = r9.f23978v
            r2.setColor(r3)
            android.text.TextPaint r2 = r9.f23962f
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL_AND_STROKE
            r2.setStyle(r3)
            r0.draw(r10)
            goto Laf
        L66:
            r5 = 2
            if (r2 != r5) goto L75
            android.text.TextPaint r0 = r9.f23962f
            float r2 = r9.f23958b
            float r3 = r9.f23959c
            int r5 = r9.f23978v
            r0.setShadowLayer(r2, r3, r3, r5)
            goto Laf
        L75:
            r5 = 3
            if (r2 == r5) goto L7b
            r6 = 4
            if (r2 != r6) goto Laf
        L7b:
            if (r2 != r5) goto L7e
            goto L7f
        L7e:
            r3 = 0
        L7f:
            r2 = -1
            if (r3 == 0) goto L84
            r5 = -1
            goto L86
        L84:
            int r5 = r9.f23978v
        L86:
            if (r3 == 0) goto L8a
            int r2 = r9.f23978v
        L8a:
            float r3 = r9.f23958b
            r6 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r6
            android.text.TextPaint r6 = r9.f23962f
            int r7 = r9.f23975s
            r6.setColor(r7)
            android.text.TextPaint r6 = r9.f23962f
            android.graphics.Paint$Style r7 = android.graphics.Paint.Style.FILL
            r6.setStyle(r7)
            android.text.TextPaint r6 = r9.f23962f
            float r7 = r9.f23958b
            float r8 = -r3
            r6.setShadowLayer(r7, r8, r8, r5)
            r0.draw(r10)
            android.text.TextPaint r0 = r9.f23962f
            float r5 = r9.f23958b
            r0.setShadowLayer(r5, r3, r3, r2)
        Laf:
            android.text.TextPaint r0 = r9.f23962f
            int r2 = r9.f23975s
            r0.setColor(r2)
            android.text.TextPaint r0 = r9.f23962f
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r0.setStyle(r2)
            r11.draw(r10)
            android.text.TextPaint r11 = r9.f23962f
            r0 = 0
            r11.setShadowLayer(r0, r0, r0, r4)
            r10.restoreToCount(r1)
            goto Lde
        Lca:
            android.graphics.Rect r11 = r9.f23956J
            java.util.Objects.requireNonNull(r11)
            android.graphics.Bitmap r11 = r9.f23967k
            java.util.Objects.requireNonNull(r11)
            android.graphics.Bitmap r11 = r9.f23967k
            android.graphics.Rect r0 = r9.f23956J
            android.graphics.Paint r1 = r9.f23964h
            r2 = 0
            r10.drawBitmap(r11, r2, r0, r1)
        Lde:
            return
    }
}
