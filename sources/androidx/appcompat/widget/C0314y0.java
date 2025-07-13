package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.y0 */
/* loaded from: classes.dex */
public class C0314y0 {

    /* renamed from: a */
    public final android.content.Context f1500a;

    /* renamed from: b */
    public final android.content.res.TypedArray f1501b;

    /* renamed from: c */
    public android.util.TypedValue f1502c;

    public C0314y0(android.content.Context r1, android.content.res.TypedArray r2) {
            r0 = this;
            r0.<init>()
            r0.f1500a = r1
            r0.f1501b = r2
            return
    }

    /* renamed from: q */
    public static androidx.appcompat.widget.C0314y0 m847q(android.content.Context r1, android.util.AttributeSet r2, int[] r3) {
            androidx.appcompat.widget.y0 r0 = new androidx.appcompat.widget.y0
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r3)
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: r */
    public static androidx.appcompat.widget.C0314y0 m848r(android.content.Context r1, android.util.AttributeSet r2, int[] r3, int r4, int r5) {
            androidx.appcompat.widget.y0 r0 = new androidx.appcompat.widget.y0
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: a */
    public boolean m849a(int r2, boolean r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f1501b
            boolean r2 = r0.getBoolean(r2, r3)
            return r2
    }

    /* renamed from: b */
    public int m850b(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f1501b
            int r2 = r0.getColor(r2, r3)
            return r2
    }

    /* renamed from: c */
    public android.content.res.ColorStateList m851c(int r3) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1501b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L1a
            android.content.res.TypedArray r0 = r2.f1501b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L1a
            android.content.Context r1 = r2.f1500a
            android.content.res.ColorStateList r0 = p102g.C2199a.m5783a(r1, r0)
            if (r0 == 0) goto L1a
            return r0
        L1a:
            android.content.res.TypedArray r0 = r2.f1501b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
    }

    /* renamed from: d */
    public float m852d(int r2, float r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f1501b
            float r2 = r0.getDimension(r2, r3)
            return r2
    }

    /* renamed from: e */
    public int m853e(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f1501b
            int r2 = r0.getDimensionPixelOffset(r2, r3)
            return r2
    }

    /* renamed from: f */
    public int m854f(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f1501b
            int r2 = r0.getDimensionPixelSize(r2, r3)
            return r2
    }

    /* renamed from: g */
    public android.graphics.drawable.Drawable m855g(int r3) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1501b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L18
            android.content.res.TypedArray r0 = r2.f1501b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L18
            android.content.Context r3 = r2.f1500a
            android.graphics.drawable.Drawable r3 = p102g.C2199a.m5784b(r3, r0)
            return r3
        L18:
            android.content.res.TypedArray r0 = r2.f1501b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
    }

    /* renamed from: h */
    public android.graphics.drawable.Drawable m856h(int r5) {
            r4 = this;
            android.content.res.TypedArray r0 = r4.f1501b
            boolean r0 = r0.hasValue(r5)
            if (r0 == 0) goto L24
            android.content.res.TypedArray r0 = r4.f1501b
            r1 = 0
            int r5 = r0.getResourceId(r5, r1)
            if (r5 == 0) goto L24
            androidx.appcompat.widget.k r0 = androidx.appcompat.widget.C0285k.m742a()
            android.content.Context r1 = r4.f1500a
            r2 = 1
            monitor-enter(r0)
            androidx.appcompat.widget.m0 r3 = r0.f1359a     // Catch: java.lang.Throwable -> L21
            android.graphics.drawable.Drawable r5 = r3.m762g(r1, r5, r2)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)
            return r5
        L21:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L24:
            r5 = 0
            return r5
    }

    /* renamed from: i */
    public android.graphics.Typeface m857i(int r11, int r12, p065e0.C1503h.c r13) {
            r10 = this;
            android.content.res.TypedArray r0 = r10.f1501b
            r1 = 0
            int r3 = r0.getResourceId(r11, r1)
            r11 = 0
            if (r3 != 0) goto Lb
            return r11
        Lb:
            android.util.TypedValue r0 = r10.f1502c
            if (r0 != 0) goto L16
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1502c = r0
        L16:
            android.content.Context r2 = r10.f1500a
            android.util.TypedValue r4 = r10.f1502c
            java.lang.ThreadLocal<android.util.TypedValue> r0 = p065e0.C1503h.f7314a
            boolean r0 = r2.isRestricted()
            if (r0 == 0) goto L23
            goto L2c
        L23:
            r7 = 0
            r8 = 1
            r9 = 0
            r5 = r12
            r6 = r13
            android.graphics.Typeface r11 = p065e0.C1503h.m4083b(r2, r3, r4, r5, r6, r7, r8, r9)
        L2c:
            return r11
    }

    /* renamed from: j */
    public int m858j(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f1501b
            int r2 = r0.getInt(r2, r3)
            return r2
    }

    /* renamed from: k */
    public int m859k(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f1501b
            int r2 = r0.getInteger(r2, r3)
            return r2
    }

    /* renamed from: l */
    public int m860l(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f1501b
            int r2 = r0.getLayoutDimension(r2, r3)
            return r2
    }

    /* renamed from: m */
    public int m861m(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f1501b
            int r2 = r0.getResourceId(r2, r3)
            return r2
    }

    /* renamed from: n */
    public java.lang.String m862n(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f1501b
            java.lang.String r2 = r0.getString(r2)
            return r2
    }

    /* renamed from: o */
    public java.lang.CharSequence m863o(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f1501b
            java.lang.CharSequence r2 = r0.getText(r2)
            return r2
    }

    /* renamed from: p */
    public boolean m864p(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f1501b
            boolean r2 = r0.hasValue(r2)
            return r2
    }
}
