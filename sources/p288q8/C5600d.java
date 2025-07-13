package p288q8;

/* renamed from: q8.d */
/* loaded from: classes.dex */
public class C5600d {

    /* renamed from: a */
    public final android.content.res.ColorStateList f21746a;

    /* renamed from: b */
    public final android.content.res.ColorStateList f21747b;

    /* renamed from: c */
    public final java.lang.String f21748c;

    /* renamed from: d */
    public final int f21749d;

    /* renamed from: e */
    public final int f21750e;

    /* renamed from: f */
    public final float f21751f;

    /* renamed from: g */
    public final float f21752g;

    /* renamed from: h */
    public final float f21753h;

    /* renamed from: i */
    public final boolean f21754i;

    /* renamed from: j */
    public final float f21755j;

    /* renamed from: k */
    public float f21756k;

    /* renamed from: l */
    public final int f21757l;

    /* renamed from: m */
    public boolean f21758m;

    /* renamed from: n */
    public android.graphics.Typeface f21759n;

    /* renamed from: q8.d$a */
    public class a extends p065e0.C1503h.c {

        /* renamed from: a */
        public final /* synthetic */ p124h7.AbstractC2951xf f21760a;

        /* renamed from: b */
        public final /* synthetic */ p288q8.C5600d f21761b;

        public a(p288q8.C5600d r1, p124h7.AbstractC2951xf r2) {
                r0 = this;
                r0.f21761b = r1
                r0.f21760a = r2
                r0.<init>()
                return
        }

        @Override // p065e0.C1503h.c
        /* renamed from: d */
        public void mo845d(int r3) {
                r2 = this;
                q8.d r0 = r2.f21761b
                r1 = 1
                r0.f21758m = r1
                h7.xf r0 = r2.f21760a
                r0.mo3339a(r3)
                return
        }

        @Override // p065e0.C1503h.c
        /* renamed from: e */
        public void mo846e(android.graphics.Typeface r3) {
                r2 = this;
                q8.d r0 = r2.f21761b
                int r1 = r0.f21749d
                android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r1)
                r0.f21759n = r3
                q8.d r3 = r2.f21761b
                r0 = 1
                r3.f21758m = r0
                h7.xf r0 = r2.f21760a
                android.graphics.Typeface r3 = r3.f21759n
                r1 = 0
                r0.mo3340b(r3, r1)
                return
        }
    }

    public C5600d(android.content.Context r6, int r7) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.f21758m = r0
            int[] r1 = p339t7.C6183a.f24000M
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r7, r1)
            r2 = 0
            float r3 = r1.getDimension(r0, r2)
            r5.f21756k = r3
            r3 = 3
            android.content.res.ColorStateList r3 = p288q8.C5599c.m11875a(r6, r1, r3)
            r5.f21746a = r3
            r3 = 4
            p288q8.C5599c.m11875a(r6, r1, r3)
            r3 = 5
            p288q8.C5599c.m11875a(r6, r1, r3)
            r3 = 2
            int r3 = r1.getInt(r3, r0)
            r5.f21749d = r3
            r3 = 1
            int r3 = r1.getInt(r3, r3)
            r5.f21750e = r3
            r3 = 12
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L39
            goto L3b
        L39:
            r3 = 10
        L3b:
            int r4 = r1.getResourceId(r3, r0)
            r5.f21757l = r4
            java.lang.String r3 = r1.getString(r3)
            r5.f21748c = r3
            r3 = 14
            r1.getBoolean(r3, r0)
            r3 = 6
            android.content.res.ColorStateList r3 = p288q8.C5599c.m11875a(r6, r1, r3)
            r5.f21747b = r3
            r3 = 7
            float r3 = r1.getFloat(r3, r2)
            r5.f21751f = r3
            r3 = 8
            float r3 = r1.getFloat(r3, r2)
            r5.f21752g = r3
            r3 = 9
            float r3 = r1.getFloat(r3, r2)
            r5.f21753h = r3
            r1.recycle()
            int[] r1 = p339t7.C6183a.f23989B
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r1)
            boolean r7 = r6.hasValue(r0)
            r5.f21754i = r7
            float r7 = r6.getFloat(r0, r2)
            r5.f21755j = r7
            r6.recycle()
            return
    }

    /* renamed from: a */
    public final void m11881a() {
            r2 = this;
            android.graphics.Typeface r0 = r2.f21759n
            if (r0 != 0) goto L10
            java.lang.String r0 = r2.f21748c
            if (r0 == 0) goto L10
            int r1 = r2.f21749d
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
            r2.f21759n = r0
        L10:
            android.graphics.Typeface r0 = r2.f21759n
            if (r0 != 0) goto L36
            int r0 = r2.f21750e
            r1 = 1
            if (r0 == r1) goto L28
            r1 = 2
            if (r0 == r1) goto L25
            r1 = 3
            if (r0 == r1) goto L22
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            goto L2a
        L22:
            android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE
            goto L2a
        L25:
            android.graphics.Typeface r0 = android.graphics.Typeface.SERIF
            goto L2a
        L28:
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
        L2a:
            r2.f21759n = r0
            android.graphics.Typeface r0 = r2.f21759n
            int r1 = r2.f21749d
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
            r2.f21759n = r0
        L36:
            return
    }

    /* renamed from: b */
    public android.graphics.Typeface m11882b(android.content.Context r3) {
            r2 = this;
            boolean r0 = r2.f21758m
            if (r0 == 0) goto L7
            android.graphics.Typeface r3 = r2.f21759n
            return r3
        L7:
            boolean r0 = r3.isRestricted()
            if (r0 != 0) goto L35
            int r0 = r2.f21757l     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L35
            android.graphics.Typeface r3 = p065e0.C1503h.m4082a(r3, r0)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L35
            r2.f21759n = r3     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L35
            if (r3 == 0) goto L35
            int r0 = r2.f21749d     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L35
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r0)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L35
            r2.f21759n = r3     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L35
            goto L35
        L20:
            r3 = move-exception
            java.lang.String r0 = "Error loading font "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.f21748c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TextAppearance"
            android.util.Log.d(r1, r0, r3)
        L35:
            r2.m11881a()
            r3 = 1
            r2.f21758m = r3
            android.graphics.Typeface r3 = r2.f21759n
            return r3
    }

    /* renamed from: c */
    public void m11883c(android.content.Context r10, p124h7.AbstractC2951xf r11) {
            r9 = this;
            boolean r0 = r9.m11884d(r10)
            if (r0 == 0) goto La
            r9.m11882b(r10)
            goto Ld
        La:
            r9.m11881a()
        Ld:
            int r2 = r9.f21757l
            r0 = 1
            if (r2 != 0) goto L14
            r9.f21758m = r0
        L14:
            boolean r1 = r9.f21758m
            if (r1 == 0) goto L1e
            android.graphics.Typeface r10 = r9.f21759n
            r11.mo3340b(r10, r0)
            return
        L1e:
            q8.d$a r5 = new q8.d$a     // Catch: java.lang.Exception -> L3f android.content.res.Resources.NotFoundException -> L5b
            r5.<init>(r9, r11)     // Catch: java.lang.Exception -> L3f android.content.res.Resources.NotFoundException -> L5b
            r1 = 0
            java.lang.ThreadLocal<android.util.TypedValue> r3 = p065e0.C1503h.f7314a     // Catch: java.lang.Exception -> L3f android.content.res.Resources.NotFoundException -> L5b
            boolean r3 = r10.isRestricted()     // Catch: java.lang.Exception -> L3f android.content.res.Resources.NotFoundException -> L5b
            if (r3 == 0) goto L31
            r10 = -4
            r5.m4085a(r10, r1)     // Catch: java.lang.Exception -> L3f android.content.res.Resources.NotFoundException -> L5b
            goto L60
        L31:
            android.util.TypedValue r3 = new android.util.TypedValue     // Catch: java.lang.Exception -> L3f android.content.res.Resources.NotFoundException -> L5b
            r3.<init>()     // Catch: java.lang.Exception -> L3f android.content.res.Resources.NotFoundException -> L5b
            r4 = 0
            r7 = 0
            r8 = 0
            r6 = 0
            r1 = r10
            p065e0.C1503h.m4083b(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L3f android.content.res.Resources.NotFoundException -> L5b
            goto L60
        L3f:
            r10 = move-exception
            java.lang.String r1 = "Error loading font "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r9.f21748c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextAppearance"
            android.util.Log.d(r2, r1, r10)
            r9.f21758m = r0
            r10 = -3
            r11.mo3339a(r10)
            goto L60
        L5b:
            r9.f21758m = r0
            r11.mo3339a(r0)
        L60:
            return
    }

    /* renamed from: d */
    public final boolean m11884d(android.content.Context r9) {
            r8 = this;
            int r1 = r8.f21757l
            r0 = 0
            if (r1 == 0) goto L1e
            java.lang.ThreadLocal<android.util.TypedValue> r2 = p065e0.C1503h.f7314a
            boolean r2 = r9.isRestricted()
            if (r2 == 0) goto Le
            goto L1e
        Le:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r0 = r9
            android.graphics.Typeface r9 = p065e0.C1503h.m4083b(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = r9
        L1e:
            if (r0 == 0) goto L22
            r9 = 1
            goto L23
        L22:
            r9 = 0
        L23:
            return r9
    }

    /* renamed from: e */
    public void m11885e(android.content.Context r5, android.text.TextPaint r6, p124h7.AbstractC2951xf r7) {
            r4 = this;
            r4.m11886f(r5, r6, r7)
            android.content.res.ColorStateList r5 = r4.f21746a
            if (r5 == 0) goto L12
            int[] r7 = r6.drawableState
            int r0 = r5.getDefaultColor()
            int r5 = r5.getColorForState(r7, r0)
            goto L14
        L12:
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L14:
            r6.setColor(r5)
            float r5 = r4.f21753h
            float r7 = r4.f21751f
            float r0 = r4.f21752g
            android.content.res.ColorStateList r1 = r4.f21747b
            if (r1 == 0) goto L2c
            int[] r2 = r6.drawableState
            int r3 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r2, r3)
            goto L2d
        L2c:
            r1 = 0
        L2d:
            r6.setShadowLayer(r5, r7, r0, r1)
            return
    }

    /* renamed from: f */
    public void m11886f(android.content.Context r2, android.text.TextPaint r3, p124h7.AbstractC2951xf r4) {
            r1 = this;
            boolean r0 = r1.m11884d(r2)
            if (r0 == 0) goto Le
            android.graphics.Typeface r2 = r1.m11882b(r2)
            r1.m11887g(r3, r2)
            goto L1e
        Le:
            r1.m11881a()
            android.graphics.Typeface r0 = r1.f21759n
            r1.m11887g(r3, r0)
            q8.e r0 = new q8.e
            r0.<init>(r1, r3, r4)
            r1.m11883c(r2, r0)
        L1e:
            return
    }

    /* renamed from: g */
    public void m11887g(android.text.TextPaint r2, android.graphics.Typeface r3) {
            r1 = this;
            r2.setTypeface(r3)
            int r0 = r1.f21749d
            int r3 = r3.getStyle()
            int r3 = ~r3
            r3 = r3 & r0
            r0 = r3 & 1
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            r2.setFakeBoldText(r0)
            r3 = r3 & 2
            if (r3 == 0) goto L1c
            r3 = -1098907648(0xffffffffbe800000, float:-0.25)
            goto L1d
        L1c:
            r3 = 0
        L1d:
            r2.setTextSkewX(r3)
            float r3 = r1.f21756k
            r2.setTextSize(r3)
            boolean r3 = r1.f21754i
            if (r3 == 0) goto L2e
            float r3 = r1.f21755j
            r2.setLetterSpacing(r3)
        L2e:
            return
    }
}
