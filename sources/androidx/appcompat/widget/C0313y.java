package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.y */
/* loaded from: classes.dex */
public class C0313y {

    /* renamed from: a */
    public final android.widget.TextView f1483a;

    /* renamed from: b */
    public androidx.appcompat.widget.C0310w0 f1484b;

    /* renamed from: c */
    public androidx.appcompat.widget.C0310w0 f1485c;

    /* renamed from: d */
    public androidx.appcompat.widget.C0310w0 f1486d;

    /* renamed from: e */
    public androidx.appcompat.widget.C0310w0 f1487e;

    /* renamed from: f */
    public androidx.appcompat.widget.C0310w0 f1488f;

    /* renamed from: g */
    public androidx.appcompat.widget.C0310w0 f1489g;

    /* renamed from: h */
    public androidx.appcompat.widget.C0310w0 f1490h;

    /* renamed from: i */
    public final androidx.appcompat.widget.C0259a0 f1491i;

    /* renamed from: j */
    public int f1492j;

    /* renamed from: k */
    public int f1493k;

    /* renamed from: l */
    public android.graphics.Typeface f1494l;

    /* renamed from: m */
    public boolean f1495m;

    /* renamed from: androidx.appcompat.widget.y$a */
    public class a extends p065e0.C1503h.c {

        /* renamed from: a */
        public final /* synthetic */ int f1496a;

        /* renamed from: b */
        public final /* synthetic */ int f1497b;

        /* renamed from: c */
        public final /* synthetic */ java.lang.ref.WeakReference f1498c;

        /* renamed from: d */
        public final /* synthetic */ androidx.appcompat.widget.C0313y f1499d;

        public a(androidx.appcompat.widget.C0313y r1, int r2, int r3, java.lang.ref.WeakReference r4) {
                r0 = this;
                r0.f1499d = r1
                r0.f1496a = r2
                r0.f1497b = r3
                r0.f1498c = r4
                r0.<init>()
                return
        }

        @Override // p065e0.C1503h.c
        /* renamed from: d */
        public void mo845d(int r1) {
                r0 = this;
                return
        }

        @Override // p065e0.C1503h.c
        /* renamed from: e */
        public void mo846e(android.graphics.Typeface r5) {
                r4 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L18
                int r0 = r4.f1496a
                r1 = -1
                if (r0 == r1) goto L18
                int r1 = r4.f1497b
                r1 = r1 & 2
                if (r1 == 0) goto L13
                r1 = 1
                goto L14
            L13:
                r1 = 0
            L14:
                android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r0, r1)
            L18:
                androidx.appcompat.widget.y r0 = r4.f1499d
                java.lang.ref.WeakReference r1 = r4.f1498c
                boolean r2 = r0.f1495m
                if (r2 == 0) goto L42
                r0.f1494l = r5
                java.lang.Object r1 = r1.get()
                android.widget.TextView r1 = (android.widget.TextView) r1
                if (r1 == 0) goto L42
                java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
                boolean r2 = p227n0.C4661t.f.m10587b(r1)
                if (r2 == 0) goto L3d
                int r2 = r0.f1492j
                androidx.appcompat.widget.z r3 = new androidx.appcompat.widget.z
                r3.<init>(r0, r1, r5, r2)
                r1.post(r3)
                goto L42
            L3d:
                int r0 = r0.f1492j
                r1.setTypeface(r5, r0)
            L42:
                return
        }
    }

    public C0313y(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1492j = r0
            r0 = -1
            r1.f1493k = r0
            r1.f1483a = r2
            androidx.appcompat.widget.a0 r0 = new androidx.appcompat.widget.a0
            r0.<init>(r2)
            r1.f1491i = r0
            return
    }

    /* renamed from: c */
    public static androidx.appcompat.widget.C0310w0 m832c(android.content.Context r0, androidx.appcompat.widget.C0285k r1, int r2) {
            android.content.res.ColorStateList r0 = r1.m747d(r0, r2)
            if (r0 == 0) goto L11
            androidx.appcompat.widget.w0 r1 = new androidx.appcompat.widget.w0
            r1.<init>()
            r2 = 1
            r1.f1478d = r2
            r1.f1475a = r0
            return r1
        L11:
            r0 = 0
            return r0
    }

    /* renamed from: a */
    public final void m833a(android.graphics.drawable.Drawable r2, androidx.appcompat.widget.C0310w0 r3) {
            r1 = this;
            if (r2 == 0) goto Ld
            if (r3 == 0) goto Ld
            android.widget.TextView r0 = r1.f1483a
            int[] r0 = r0.getDrawableState()
            androidx.appcompat.widget.C0285k.m745f(r2, r3, r0)
        Ld:
            return
    }

    /* renamed from: b */
    public void m834b() {
            r5 = this;
            androidx.appcompat.widget.w0 r0 = r5.f1484b
            r1 = 2
            r2 = 0
            if (r0 != 0) goto L12
            androidx.appcompat.widget.w0 r0 = r5.f1485c
            if (r0 != 0) goto L12
            androidx.appcompat.widget.w0 r0 = r5.f1486d
            if (r0 != 0) goto L12
            androidx.appcompat.widget.w0 r0 = r5.f1487e
            if (r0 == 0) goto L36
        L12:
            android.widget.TextView r0 = r5.f1483a
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawables()
            r3 = r0[r2]
            androidx.appcompat.widget.w0 r4 = r5.f1484b
            r5.m833a(r3, r4)
            r3 = 1
            r3 = r0[r3]
            androidx.appcompat.widget.w0 r4 = r5.f1485c
            r5.m833a(r3, r4)
            r3 = r0[r1]
            androidx.appcompat.widget.w0 r4 = r5.f1486d
            r5.m833a(r3, r4)
            r3 = 3
            r0 = r0[r3]
            androidx.appcompat.widget.w0 r3 = r5.f1487e
            r5.m833a(r0, r3)
        L36:
            androidx.appcompat.widget.w0 r0 = r5.f1488f
            if (r0 != 0) goto L3e
            androidx.appcompat.widget.w0 r0 = r5.f1489g
            if (r0 == 0) goto L52
        L3e:
            android.widget.TextView r0 = r5.f1483a
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r2 = r0[r2]
            androidx.appcompat.widget.w0 r3 = r5.f1488f
            r5.m833a(r2, r3)
            r0 = r0[r1]
            androidx.appcompat.widget.w0 r1 = r5.f1489g
            r5.m833a(r0, r1)
        L52:
            return
    }

    /* renamed from: d */
    public boolean m835d() {
            r2 = this;
            androidx.appcompat.widget.a0 r0 = r2.f1491i
            boolean r1 = r0.m664i()
            if (r1 == 0) goto Le
            int r0 = r0.f1191a
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: e */
    public void m836e(android.util.AttributeSet r29, int r30) {
            r28 = this;
            r0 = r28
            r8 = r29
            r9 = r30
            android.widget.TextView r1 = r0.f1483a
            android.content.Context r10 = r1.getContext()
            androidx.appcompat.widget.k r11 = androidx.appcompat.widget.C0285k.m742a()
            int[] r3 = p064e.C1495i.f7265h
            r12 = 0
            androidx.appcompat.widget.y0 r13 = androidx.appcompat.widget.C0314y0.m848r(r10, r8, r3, r9, r12)
            android.widget.TextView r1 = r0.f1483a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r13.f1501b
            r7 = 0
            r4 = r29
            r6 = r30
            p227n0.C4661t.m10545u(r1, r2, r3, r4, r5, r6, r7)
            r14 = -1
            int r1 = r13.m861m(r12, r14)
            r15 = 3
            boolean r2 = r13.m864p(r15)
            if (r2 == 0) goto L3d
            int r2 = r13.m861m(r15, r12)
            androidx.appcompat.widget.w0 r2 = m832c(r10, r11, r2)
            r0.f1484b = r2
        L3d:
            r7 = 1
            boolean r2 = r13.m864p(r7)
            if (r2 == 0) goto L4e
            int r2 = r13.m861m(r7, r12)
            androidx.appcompat.widget.w0 r2 = m832c(r10, r11, r2)
            r0.f1485c = r2
        L4e:
            r6 = 4
            boolean r2 = r13.m864p(r6)
            if (r2 == 0) goto L5f
            int r2 = r13.m861m(r6, r12)
            androidx.appcompat.widget.w0 r2 = m832c(r10, r11, r2)
            r0.f1486d = r2
        L5f:
            r5 = 2
            boolean r2 = r13.m864p(r5)
            if (r2 == 0) goto L70
            int r2 = r13.m861m(r5, r12)
            androidx.appcompat.widget.w0 r2 = m832c(r10, r11, r2)
            r0.f1487e = r2
        L70:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 5
            boolean r3 = r13.m864p(r4)
            if (r3 == 0) goto L83
            int r3 = r13.m861m(r4, r12)
            androidx.appcompat.widget.w0 r3 = m832c(r10, r11, r3)
            r0.f1488f = r3
        L83:
            r3 = 6
            boolean r16 = r13.m864p(r3)
            if (r16 == 0) goto L94
            int r5 = r13.m861m(r3, r12)
            androidx.appcompat.widget.w0 r5 = m832c(r10, r11, r5)
            r0.f1489g = r5
        L94:
            android.content.res.TypedArray r5 = r13.f1501b
            r5.recycle()
            android.widget.TextView r5 = r0.f1483a
            android.text.method.TransformationMethod r5 = r5.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            r13 = 23
            r3 = 14
            if (r1 == r14) goto L11d
            int[] r7 = p064e.C1495i.f7280w
            androidx.appcompat.widget.y0 r14 = new androidx.appcompat.widget.y0
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r1, r7)
            r14.<init>(r10, r1)
            if (r5 != 0) goto Lc1
            boolean r7 = r14.m864p(r3)
            if (r7 == 0) goto Lc1
            boolean r7 = r14.m849a(r3, r12)
            r21 = 1
            goto Lc4
        Lc1:
            r7 = 0
            r21 = 0
        Lc4:
            r0.m844m(r10, r14)
            if (r2 >= r13) goto Lf0
            boolean r22 = r14.m864p(r15)
            if (r22 == 0) goto Ld4
            android.content.res.ColorStateList r22 = r14.m851c(r15)
            goto Ld6
        Ld4:
            r22 = 0
        Ld6:
            boolean r23 = r14.m864p(r6)
            if (r23 == 0) goto Le1
            android.content.res.ColorStateList r23 = r14.m851c(r6)
            goto Le3
        Le1:
            r23 = 0
        Le3:
            boolean r24 = r14.m864p(r4)
            if (r24 == 0) goto Lf4
            android.content.res.ColorStateList r24 = r14.m851c(r4)
            r4 = 15
            goto Lf8
        Lf0:
            r22 = 0
            r23 = 0
        Lf4:
            r4 = 15
            r24 = 0
        Lf8:
            boolean r19 = r14.m864p(r4)
            if (r19 == 0) goto L105
            java.lang.String r26 = r14.m862n(r4)
            r4 = 26
            goto L109
        L105:
            r4 = 26
            r26 = 0
        L109:
            if (r2 < r4) goto L118
            r4 = 13
            boolean r20 = r14.m864p(r4)
            if (r20 == 0) goto L118
            java.lang.String r14 = r14.m862n(r4)
            goto L119
        L118:
            r14 = 0
        L119:
            r1.recycle()
            goto L129
        L11d:
            r7 = 0
            r14 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
        L129:
            int[] r1 = p064e.C1495i.f7280w
            androidx.appcompat.widget.y0 r4 = new androidx.appcompat.widget.y0
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r8, r1, r9, r12)
            r4.<init>(r10, r1)
            if (r5 != 0) goto L142
            boolean r27 = r4.m864p(r3)
            if (r27 == 0) goto L142
            boolean r7 = r4.m849a(r3, r12)
            r21 = 1
        L142:
            if (r2 >= r13) goto L163
            boolean r13 = r4.m864p(r15)
            if (r13 == 0) goto L14e
            android.content.res.ColorStateList r22 = r4.m851c(r15)
        L14e:
            boolean r13 = r4.m864p(r6)
            if (r13 == 0) goto L158
            android.content.res.ColorStateList r23 = r4.m851c(r6)
        L158:
            r13 = 5
            boolean r25 = r4.m864p(r13)
            if (r25 == 0) goto L163
            android.content.res.ColorStateList r24 = r4.m851c(r13)
        L163:
            r3 = r22
            r6 = r23
            r13 = r24
            r15 = 15
            boolean r24 = r4.m864p(r15)
            if (r24 == 0) goto L175
            java.lang.String r26 = r4.m862n(r15)
        L175:
            r15 = r26
            r12 = 26
            if (r2 < r12) goto L188
            r12 = 13
            boolean r20 = r4.m864p(r12)
            if (r20 == 0) goto L18a
            java.lang.String r14 = r4.m862n(r12)
            goto L18a
        L188:
            r12 = 13
        L18a:
            r12 = 28
            if (r2 < r12) goto L1a5
            r12 = 0
            boolean r18 = r4.m864p(r12)
            if (r18 == 0) goto L1a5
            r24 = r11
            r11 = -1
            int r18 = r4.m854f(r12, r11)
            if (r18 != 0) goto L1a7
            android.widget.TextView r11 = r0.f1483a
            r8 = 0
            r11.setTextSize(r12, r8)
            goto L1a7
        L1a5:
            r24 = r11
        L1a7:
            r0.m844m(r10, r4)
            r1.recycle()
            if (r3 == 0) goto L1b4
            android.widget.TextView r1 = r0.f1483a
            r1.setTextColor(r3)
        L1b4:
            if (r6 == 0) goto L1bb
            android.widget.TextView r1 = r0.f1483a
            r1.setHintTextColor(r6)
        L1bb:
            if (r13 == 0) goto L1c2
            android.widget.TextView r1 = r0.f1483a
            r1.setLinkTextColor(r13)
        L1c2:
            if (r5 != 0) goto L1cb
            if (r21 == 0) goto L1cb
            android.widget.TextView r1 = r0.f1483a
            r1.setAllCaps(r7)
        L1cb:
            android.graphics.Typeface r1 = r0.f1494l
            if (r1 == 0) goto L1e1
            int r3 = r0.f1493k
            r4 = -1
            if (r3 != r4) goto L1dc
            android.widget.TextView r3 = r0.f1483a
            int r4 = r0.f1492j
            r3.setTypeface(r1, r4)
            goto L1e1
        L1dc:
            android.widget.TextView r3 = r0.f1483a
            r3.setTypeface(r1)
        L1e1:
            if (r14 == 0) goto L1e8
            android.widget.TextView r1 = r0.f1483a
            r1.setFontVariationSettings(r14)
        L1e8:
            r8 = 24
            if (r15 == 0) goto L20d
            if (r2 < r8) goto L1f8
            android.widget.TextView r1 = r0.f1483a
            android.os.LocaleList r2 = android.os.LocaleList.forLanguageTags(r15)
            r1.setTextLocales(r2)
            goto L20d
        L1f8:
            r1 = 44
            int r1 = r15.indexOf(r1)
            r2 = 0
            java.lang.String r1 = r15.substring(r2, r1)
            android.widget.TextView r3 = r0.f1483a
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r1)
            r3.setTextLocale(r1)
            goto L20e
        L20d:
            r2 = 0
        L20e:
            androidx.appcompat.widget.a0 r11 = r0.f1491i
            android.content.Context r1 = r11.f1200j
            int[] r3 = p064e.C1495i.f7266i
            r12 = r29
            android.content.res.TypedArray r13 = r1.obtainStyledAttributes(r12, r3, r9, r2)
            android.widget.TextView r1 = r11.f1199i
            android.content.Context r2 = r1.getContext()
            r7 = 0
            r14 = 14
            r15 = 6
            r6 = 5
            r4 = r29
            r14 = 2
            r5 = r13
            r8 = 4
            r15 = 5
            r6 = r30
            r9 = 1
            p227n0.C4661t.m10545u(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r13.hasValue(r15)
            if (r1 == 0) goto L23e
            r1 = 0
            int r2 = r13.getInt(r15, r1)
            r11.f1191a = r2
        L23e:
            boolean r1 = r13.hasValue(r8)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L24b
            float r1 = r13.getDimension(r8, r2)
            goto L24d
        L24b:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L24d:
            boolean r3 = r13.hasValue(r14)
            if (r3 == 0) goto L258
            float r3 = r13.getDimension(r14, r2)
            goto L25a
        L258:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        L25a:
            boolean r4 = r13.hasValue(r9)
            if (r4 == 0) goto L265
            float r4 = r13.getDimension(r9, r2)
            goto L267
        L265:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L267:
            r5 = 3
            boolean r6 = r13.hasValue(r5)
            if (r6 == 0) goto L29e
            r6 = 0
            int r7 = r13.getResourceId(r5, r6)
            if (r7 <= 0) goto L29e
            android.content.res.Resources r5 = r13.getResources()
            android.content.res.TypedArray r5 = r5.obtainTypedArray(r7)
            int r6 = r5.length()
            int[] r7 = new int[r6]
            if (r6 <= 0) goto L29b
            r8 = 0
        L286:
            if (r8 >= r6) goto L292
            r15 = -1
            int r17 = r5.getDimensionPixelSize(r8, r15)
            r7[r8] = r17
            int r8 = r8 + 1
            goto L286
        L292:
            int[] r6 = r11.m659b(r7)
            r11.f1196f = r6
            r11.m663h()
        L29b:
            r5.recycle()
        L29e:
            r13.recycle()
            boolean r5 = r11.m664i()
            if (r5 == 0) goto L2da
            int r5 = r11.f1191a
            if (r5 != r9) goto L2dd
            boolean r5 = r11.f1197g
            if (r5 != 0) goto L2d6
            android.content.Context r5 = r11.f1200j
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r6 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r6 != 0) goto L2c3
            r3 = 1094713344(0x41400000, float:12.0)
            float r3 = android.util.TypedValue.applyDimension(r14, r3, r5)
        L2c3:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L2cd
            r4 = 1121976320(0x42e00000, float:112.0)
            float r4 = android.util.TypedValue.applyDimension(r14, r4, r5)
        L2cd:
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L2d3
            r1 = 1065353216(0x3f800000, float:1.0)
        L2d3:
            r11.m665j(r3, r4, r1)
        L2d6:
            r11.m662g()
            goto L2dd
        L2da:
            r1 = 0
            r11.f1191a = r1
        L2dd:
            boolean r1 = p280q0.InterfaceC5535b.f21568W
            if (r1 == 0) goto L31c
            androidx.appcompat.widget.a0 r1 = r0.f1491i
            int r3 = r1.f1191a
            if (r3 == 0) goto L31c
            int[] r1 = r1.f1196f
            int r3 = r1.length
            if (r3 <= 0) goto L31c
            android.widget.TextView r3 = r0.f1483a
            int r3 = r3.getAutoSizeStepGranularity()
            float r3 = (float) r3
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L316
            android.widget.TextView r1 = r0.f1483a
            androidx.appcompat.widget.a0 r2 = r0.f1491i
            float r2 = r2.f1194d
            int r2 = java.lang.Math.round(r2)
            androidx.appcompat.widget.a0 r3 = r0.f1491i
            float r3 = r3.f1195e
            int r3 = java.lang.Math.round(r3)
            androidx.appcompat.widget.a0 r4 = r0.f1491i
            float r4 = r4.f1193c
            int r4 = java.lang.Math.round(r4)
            r5 = 0
            r1.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto L31c
        L316:
            r5 = 0
            android.widget.TextView r2 = r0.f1483a
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r1, r5)
        L31c:
            int[] r1 = p064e.C1495i.f7266i
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r12, r1)
            r2 = 8
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            if (r2 == r3) goto L334
            r4 = r24
            android.graphics.drawable.Drawable r7 = r4.m746b(r10, r2)
            r2 = 13
            goto L339
        L334:
            r4 = r24
            r2 = 13
            r7 = 0
        L339:
            int r2 = r1.getResourceId(r2, r3)
            if (r2 == r3) goto L344
            android.graphics.drawable.Drawable r2 = r4.m746b(r10, r2)
            goto L345
        L344:
            r2 = 0
        L345:
            r5 = 9
            int r5 = r1.getResourceId(r5, r3)
            if (r5 == r3) goto L352
            android.graphics.drawable.Drawable r5 = r4.m746b(r10, r5)
            goto L353
        L352:
            r5 = 0
        L353:
            r6 = 6
            int r6 = r1.getResourceId(r6, r3)
            if (r6 == r3) goto L35f
            android.graphics.drawable.Drawable r6 = r4.m746b(r10, r6)
            goto L360
        L35f:
            r6 = 0
        L360:
            r8 = 10
            int r8 = r1.getResourceId(r8, r3)
            if (r8 == r3) goto L36d
            android.graphics.drawable.Drawable r8 = r4.m746b(r10, r8)
            goto L36e
        L36d:
            r8 = 0
        L36e:
            r11 = 7
            int r11 = r1.getResourceId(r11, r3)
            if (r11 == r3) goto L37a
            android.graphics.drawable.Drawable r3 = r4.m746b(r10, r11)
            goto L37b
        L37a:
            r3 = 0
        L37b:
            if (r8 != 0) goto L3cf
            if (r3 == 0) goto L380
            goto L3cf
        L380:
            if (r7 != 0) goto L388
            if (r2 != 0) goto L388
            if (r5 != 0) goto L388
            if (r6 == 0) goto L3f0
        L388:
            android.widget.TextView r3 = r0.f1483a
            android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawablesRelative()
            r4 = 0
            r8 = r3[r4]
            if (r8 != 0) goto L3b9
            r8 = r3[r14]
            if (r8 == 0) goto L398
            goto L3b9
        L398:
            android.widget.TextView r3 = r0.f1483a
            android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawables()
            android.widget.TextView r8 = r0.f1483a
            if (r7 == 0) goto L3a3
            goto L3a5
        L3a3:
            r7 = r3[r4]
        L3a5:
            if (r2 == 0) goto L3a8
            goto L3aa
        L3a8:
            r2 = r3[r9]
        L3aa:
            if (r5 == 0) goto L3ad
            goto L3af
        L3ad:
            r5 = r3[r14]
        L3af:
            if (r6 == 0) goto L3b2
            goto L3b5
        L3b2:
            r4 = 3
            r6 = r3[r4]
        L3b5:
            r8.setCompoundDrawablesWithIntrinsicBounds(r7, r2, r5, r6)
            goto L3f0
        L3b9:
            android.widget.TextView r4 = r0.f1483a
            r5 = 0
            r7 = r3[r5]
            if (r2 == 0) goto L3c1
            goto L3c3
        L3c1:
            r2 = r3[r9]
        L3c3:
            r5 = r3[r14]
            if (r6 == 0) goto L3c8
            goto L3cb
        L3c8:
            r6 = 3
            r6 = r3[r6]
        L3cb:
            r4.setCompoundDrawablesRelativeWithIntrinsicBounds(r7, r2, r5, r6)
            goto L3f0
        L3cf:
            android.widget.TextView r4 = r0.f1483a
            android.graphics.drawable.Drawable[] r4 = r4.getCompoundDrawablesRelative()
            android.widget.TextView r5 = r0.f1483a
            if (r8 == 0) goto L3da
            goto L3dd
        L3da:
            r7 = 0
            r8 = r4[r7]
        L3dd:
            if (r2 == 0) goto L3e0
            goto L3e2
        L3e0:
            r2 = r4[r9]
        L3e2:
            if (r3 == 0) goto L3e5
            goto L3e7
        L3e5:
            r3 = r4[r14]
        L3e7:
            if (r6 == 0) goto L3ea
            goto L3ed
        L3ea:
            r6 = 3
            r6 = r4[r6]
        L3ed:
            r5.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r2, r3, r6)
        L3f0:
            r2 = 11
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L428
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L40c
            r3 = 0
            int r3 = r1.getResourceId(r2, r3)
            if (r3 == 0) goto L40c
            android.content.res.ColorStateList r3 = p102g.C2199a.m5783a(r10, r3)
            if (r3 == 0) goto L40c
            goto L410
        L40c:
            android.content.res.ColorStateList r3 = r1.getColorStateList(r2)
        L410:
            android.widget.TextView r2 = r0.f1483a
            java.util.Objects.requireNonNull(r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L41f
            r2.setCompoundDrawableTintList(r3)
            goto L428
        L41f:
            boolean r4 = r2 instanceof p280q0.InterfaceC5542i
            if (r4 == 0) goto L428
            q0.i r2 = (p280q0.InterfaceC5542i) r2
            r2.mo581x8f8765f6(r3)
        L428:
            r2 = 12
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L452
            r3 = -1
            int r2 = r1.getInt(r2, r3)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.C0271e0.m710d(r2, r3)
            android.widget.TextView r3 = r0.f1483a
            java.util.Objects.requireNonNull(r3)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L449
            r3.setCompoundDrawableTintMode(r2)
            goto L452
        L449:
            boolean r4 = r3 instanceof p280q0.InterfaceC5542i
            if (r4 == 0) goto L452
            q0.i r3 = (p280q0.InterfaceC5542i) r3
            r3.mo582x8f87eefb(r2)
        L452:
            r2 = 14
            r3 = -1
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r4 = 17
            int r4 = r1.getDimensionPixelSize(r4, r3)
            r5 = 18
            int r5 = r1.getDimensionPixelSize(r5, r3)
            r1.recycle()
            if (r2 == r3) goto L46f
            android.widget.TextView r1 = r0.f1483a
            p280q0.C5540g.m11818b(r1, r2)
        L46f:
            if (r4 == r3) goto L476
            android.widget.TextView r1 = r0.f1483a
            p280q0.C5540g.m11819c(r1, r4)
        L476:
            if (r5 == r3) goto L47d
            android.widget.TextView r1 = r0.f1483a
            p280q0.C5540g.m11820d(r1, r5)
        L47d:
            return
    }

    /* renamed from: f */
    public void m837f(android.content.Context r6, int r7) {
            r5 = this;
            int[] r0 = p064e.C1495i.f7280w
            androidx.appcompat.widget.y0 r1 = new androidx.appcompat.widget.y0
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r0)
            r1.<init>(r6, r7)
            r0 = 14
            boolean r2 = r1.m864p(r0)
            r3 = 0
            if (r2 == 0) goto L1d
            boolean r0 = r1.m849a(r0, r3)
            android.widget.TextView r2 = r5.f1483a
            r2.setAllCaps(r0)
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 >= r2) goto L59
            r2 = 3
            boolean r4 = r1.m864p(r2)
            if (r4 == 0) goto L35
            android.content.res.ColorStateList r2 = r1.m851c(r2)
            if (r2 == 0) goto L35
            android.widget.TextView r4 = r5.f1483a
            r4.setTextColor(r2)
        L35:
            r2 = 5
            boolean r4 = r1.m864p(r2)
            if (r4 == 0) goto L47
            android.content.res.ColorStateList r2 = r1.m851c(r2)
            if (r2 == 0) goto L47
            android.widget.TextView r4 = r5.f1483a
            r4.setLinkTextColor(r2)
        L47:
            r2 = 4
            boolean r4 = r1.m864p(r2)
            if (r4 == 0) goto L59
            android.content.res.ColorStateList r2 = r1.m851c(r2)
            if (r2 == 0) goto L59
            android.widget.TextView r4 = r5.f1483a
            r4.setHintTextColor(r2)
        L59:
            boolean r2 = r1.m864p(r3)
            if (r2 == 0) goto L6c
            r2 = -1
            int r2 = r1.m854f(r3, r2)
            if (r2 != 0) goto L6c
            android.widget.TextView r2 = r5.f1483a
            r4 = 0
            r2.setTextSize(r3, r4)
        L6c:
            r5.m844m(r6, r1)
            r6 = 26
            if (r0 < r6) goto L86
            r6 = 13
            boolean r0 = r1.m864p(r6)
            if (r0 == 0) goto L86
            java.lang.String r6 = r1.m862n(r6)
            if (r6 == 0) goto L86
            android.widget.TextView r0 = r5.f1483a
            r0.setFontVariationSettings(r6)
        L86:
            r7.recycle()
            android.graphics.Typeface r6 = r5.f1494l
            if (r6 == 0) goto L94
            android.widget.TextView r7 = r5.f1483a
            int r0 = r5.f1492j
            r7.setTypeface(r6, r0)
        L94:
            return
    }

    /* renamed from: g */
    public void m838g(android.widget.TextView r12, android.view.inputmethod.InputConnection r13, android.view.inputmethod.EditorInfo r14) {
            r11 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto Lc2
            if (r13 == 0) goto Lc2
            java.lang.CharSequence r12 = r12.getText()
            r13 = 0
            if (r0 < r1) goto L14
            r14.setInitialSurroundingSubText(r12, r13)
            goto Lc2
        L14:
            java.util.Objects.requireNonNull(r12)
            if (r0 < r1) goto L1e
            r14.setInitialSurroundingSubText(r12, r13)
            goto Lc2
        L1e:
            int r0 = r14.initialSelStart
            int r1 = r14.initialSelEnd
            if (r0 <= r1) goto L27
            int r2 = r1 + 0
            goto L29
        L27:
            int r2 = r0 + 0
        L29:
            if (r0 <= r1) goto L2d
            int r0 = r0 - r13
            goto L2f
        L2d:
            int r0 = r1 + 0
        L2f:
            int r1 = r12.length()
            r3 = 0
            if (r2 < 0) goto Lbf
            if (r0 <= r1) goto L3a
            goto Lbf
        L3a:
            int r4 = r14.inputType
            r4 = r4 & 4095(0xfff, float:5.738E-42)
            r5 = 129(0x81, float:1.81E-43)
            r6 = 1
            if (r4 == r5) goto L4e
            r5 = 225(0xe1, float:3.15E-43)
            if (r4 == r5) goto L4e
            r5 = 18
            if (r4 != r5) goto L4c
            goto L4e
        L4c:
            r4 = 0
            goto L4f
        L4e:
            r4 = 1
        L4f:
            if (r4 == 0) goto L52
            goto Lbf
        L52:
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 > r3) goto L5a
            p264p0.C5337a.m11643b(r14, r12, r2, r0)
            goto Lc2
        L5a:
            int r1 = r0 - r2
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 <= r3) goto L62
            r3 = 0
            goto L63
        L62:
            r3 = r1
        L63:
            int r4 = r12.length()
            int r4 = r4 - r0
            int r5 = 2048 - r3
            r7 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r9 = (double) r5
            double r9 = r9 * r7
            int r7 = (int) r9
            int r7 = java.lang.Math.min(r2, r7)
            int r7 = r5 - r7
            int r4 = java.lang.Math.min(r4, r7)
            int r5 = r5 - r4
            int r5 = java.lang.Math.min(r2, r5)
            int r2 = r2 - r5
            boolean r7 = p264p0.C5337a.m11642a(r12, r2, r13)
            if (r7 == 0) goto L8d
            int r2 = r2 + 1
            int r5 = r5 + (-1)
        L8d:
            int r7 = r0 + r4
            int r7 = r7 - r6
            boolean r7 = p264p0.C5337a.m11642a(r12, r7, r6)
            if (r7 == 0) goto L98
            int r4 = r4 + (-1)
        L98:
            int r7 = r5 + r3
            int r7 = r7 + r4
            if (r3 == r1) goto Lb4
            int r1 = r2 + r5
            java.lang.CharSequence r1 = r12.subSequence(r2, r1)
            int r4 = r4 + r0
            java.lang.CharSequence r12 = r12.subSequence(r0, r4)
            r0 = 2
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
            r0[r13] = r1
            r0[r6] = r12
            java.lang.CharSequence r12 = android.text.TextUtils.concat(r0)
            goto Lb9
        Lb4:
            int r7 = r7 + r2
            java.lang.CharSequence r12 = r12.subSequence(r2, r7)
        Lb9:
            int r5 = r5 + r13
            int r3 = r3 + r5
            p264p0.C5337a.m11643b(r14, r12, r5, r3)
            goto Lc2
        Lbf:
            p264p0.C5337a.m11643b(r14, r3, r13, r13)
        Lc2:
            return
    }

    /* renamed from: h */
    public void m839h(int r3, int r4, int r5, int r6) {
            r2 = this;
            androidx.appcompat.widget.a0 r0 = r2.f1491i
            boolean r1 = r0.m664i()
            if (r1 == 0) goto L2d
            android.content.Context r1 = r0.f1200j
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r3 = (float) r3
            float r3 = android.util.TypedValue.applyDimension(r6, r3, r1)
            float r4 = (float) r4
            float r4 = android.util.TypedValue.applyDimension(r6, r4, r1)
            float r5 = (float) r5
            float r5 = android.util.TypedValue.applyDimension(r6, r5, r1)
            r0.m665j(r3, r4, r5)
            boolean r3 = r0.m662g()
            if (r3 == 0) goto L2d
            r0.m658a()
        L2d:
            return
    }

    /* renamed from: i */
    public void m840i(int[] r7, int r8) {
            r6 = this;
            androidx.appcompat.widget.a0 r0 = r6.f1491i
            boolean r1 = r0.m664i()
            if (r1 == 0) goto L60
            int r1 = r7.length
            r2 = 0
            if (r1 <= 0) goto L55
            int[] r3 = new int[r1]
            if (r8 != 0) goto L15
            int[] r3 = java.util.Arrays.copyOf(r7, r1)
            goto L31
        L15:
            android.content.Context r4 = r0.f1200j
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
        L1f:
            if (r2 >= r1) goto L31
            r5 = r7[r2]
            float r5 = (float) r5
            float r5 = android.util.TypedValue.applyDimension(r8, r5, r4)
            int r5 = java.lang.Math.round(r5)
            r3[r2] = r5
            int r2 = r2 + 1
            goto L1f
        L31:
            int[] r8 = r0.m659b(r3)
            r0.f1196f = r8
            boolean r8 = r0.m663h()
            if (r8 == 0) goto L3e
            goto L57
        L3e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "None of the preset sizes is valid: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L55:
            r0.f1197g = r2
        L57:
            boolean r7 = r0.m662g()
            if (r7 == 0) goto L60
            r0.m658a()
        L60:
            return
    }

    /* renamed from: j */
    public void m841j(int r5) {
            r4 = this;
            androidx.appcompat.widget.a0 r0 = r4.f1491i
            boolean r1 = r0.m664i()
            if (r1 == 0) goto L50
            if (r5 == 0) goto L3f
            r1 = 1
            if (r5 != r1) goto L33
            android.content.Context r5 = r0.f1200j
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            r1 = 1094713344(0x41400000, float:12.0)
            r2 = 2
            float r1 = android.util.TypedValue.applyDimension(r2, r1, r5)
            r3 = 1121976320(0x42e00000, float:112.0)
            float r5 = android.util.TypedValue.applyDimension(r2, r3, r5)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.m665j(r1, r5, r2)
            boolean r5 = r0.m662g()
            if (r5 == 0) goto L50
            r0.m658a()
            goto L50
        L33:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown auto-size text type: "
            java.lang.String r5 = android.support.v4.media.C0142a.m254a(r1, r5)
            r0.<init>(r5)
            throw r0
        L3f:
            r5 = 0
            r0.f1191a = r5
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.f1194d = r1
            r0.f1195e = r1
            r0.f1193c = r1
            int[] r1 = new int[r5]
            r0.f1196f = r1
            r0.f1192b = r5
        L50:
            return
    }

    /* renamed from: k */
    public void m842k(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.w0 r0 = r1.f1490h
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.w0 r0 = new androidx.appcompat.widget.w0
            r0.<init>()
            r1.f1490h = r0
        Lb:
            androidx.appcompat.widget.w0 r0 = r1.f1490h
            r0.f1475a = r2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            r0.f1478d = r2
            r1.f1484b = r0
            r1.f1485c = r0
            r1.f1486d = r0
            r1.f1487e = r0
            r1.f1488f = r0
            r1.f1489g = r0
            return
    }

    /* renamed from: l */
    public void m843l(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.w0 r0 = r1.f1490h
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.w0 r0 = new androidx.appcompat.widget.w0
            r0.<init>()
            r1.f1490h = r0
        Lb:
            androidx.appcompat.widget.w0 r0 = r1.f1490h
            r0.f1476b = r2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            r0.f1477c = r2
            r1.f1484b = r0
            r1.f1485c = r0
            r1.f1486d = r0
            r1.f1487e = r0
            r1.f1488f = r0
            r1.f1489g = r0
            return
    }

    /* renamed from: m */
    public final void m844m(android.content.Context r11, androidx.appcompat.widget.C0314y0 r12) {
            r10 = this;
            int r0 = r10.f1492j
            r1 = 2
            int r0 = r12.m858j(r1, r0)
            r10.f1492j = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 28
            r4 = -1
            if (r0 < r3) goto L21
            r5 = 11
            int r5 = r12.m858j(r5, r4)
            r10.f1493k = r5
            if (r5 == r4) goto L21
            int r5 = r10.f1492j
            r5 = r5 & r1
            r5 = r5 | r2
            r10.f1492j = r5
        L21:
            r5 = 10
            boolean r6 = r12.m864p(r5)
            r7 = 12
            r8 = 1
            if (r6 != 0) goto L52
            boolean r6 = r12.m864p(r7)
            if (r6 == 0) goto L33
            goto L52
        L33:
            boolean r11 = r12.m864p(r8)
            if (r11 == 0) goto L51
            r10.f1495m = r2
            int r11 = r12.m858j(r8, r8)
            if (r11 == r8) goto L4d
            if (r11 == r1) goto L4a
            r12 = 3
            if (r11 == r12) goto L47
            goto L51
        L47:
            android.graphics.Typeface r11 = android.graphics.Typeface.MONOSPACE
            goto L4f
        L4a:
            android.graphics.Typeface r11 = android.graphics.Typeface.SERIF
            goto L4f
        L4d:
            android.graphics.Typeface r11 = android.graphics.Typeface.SANS_SERIF
        L4f:
            r10.f1494l = r11
        L51:
            return
        L52:
            r6 = 0
            r10.f1494l = r6
            boolean r6 = r12.m864p(r7)
            if (r6 == 0) goto L5d
            r5 = 12
        L5d:
            int r6 = r10.f1493k
            int r7 = r10.f1492j
            boolean r11 = r11.isRestricted()
            if (r11 != 0) goto La0
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference
            android.widget.TextView r9 = r10.f1483a
            r11.<init>(r9)
            androidx.appcompat.widget.y$a r9 = new androidx.appcompat.widget.y$a
            r9.<init>(r10, r6, r7, r11)
            int r11 = r10.f1492j     // Catch: java.lang.Throwable -> L9f
            android.graphics.Typeface r11 = r12.m857i(r5, r11, r9)     // Catch: java.lang.Throwable -> L9f
            if (r11 == 0) goto L95
            if (r0 < r3) goto L93
            int r0 = r10.f1493k     // Catch: java.lang.Throwable -> L9f
            if (r0 == r4) goto L93
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r2)     // Catch: java.lang.Throwable -> L9f
            int r0 = r10.f1493k     // Catch: java.lang.Throwable -> L9f
            int r6 = r10.f1492j     // Catch: java.lang.Throwable -> L9f
            r6 = r6 & r1
            if (r6 == 0) goto L8e
            r6 = 1
            goto L8f
        L8e:
            r6 = 0
        L8f:
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r0, r6)     // Catch: java.lang.Throwable -> L9f
        L93:
            r10.f1494l = r11     // Catch: java.lang.Throwable -> L9f
        L95:
            android.graphics.Typeface r11 = r10.f1494l     // Catch: java.lang.Throwable -> L9f
            if (r11 != 0) goto L9b
            r11 = 1
            goto L9c
        L9b:
            r11 = 0
        L9c:
            r10.f1495m = r11     // Catch: java.lang.Throwable -> L9f
            goto La0
        L9f:
        La0:
            android.graphics.Typeface r11 = r10.f1494l
            if (r11 != 0) goto Lcb
            java.lang.String r11 = r12.m862n(r5)
            if (r11 == 0) goto Lcb
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r3) goto Lc3
            int r12 = r10.f1493k
            if (r12 == r4) goto Lc3
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r2)
            int r12 = r10.f1493k
            int r0 = r10.f1492j
            r0 = r0 & r1
            if (r0 == 0) goto Lbe
            r2 = 1
        Lbe:
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r12, r2)
            goto Lc9
        Lc3:
            int r12 = r10.f1492j
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r12)
        Lc9:
            r10.f1494l = r11
        Lcb:
            return
    }
}
