package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.a0 */
/* loaded from: classes.dex */
public class C0259a0 {

    /* renamed from: l */
    public static final android.graphics.RectF f1188l = null;

    /* renamed from: m */
    @android.annotation.SuppressLint({"BanConcurrentHashMap"})
    public static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> f1189m;

    /* renamed from: n */
    @android.annotation.SuppressLint({"BanConcurrentHashMap"})
    public static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Field> f1190n;

    /* renamed from: a */
    public int f1191a;

    /* renamed from: b */
    public boolean f1192b;

    /* renamed from: c */
    public float f1193c;

    /* renamed from: d */
    public float f1194d;

    /* renamed from: e */
    public float f1195e;

    /* renamed from: f */
    public int[] f1196f;

    /* renamed from: g */
    public boolean f1197g;

    /* renamed from: h */
    public android.text.TextPaint f1198h;

    /* renamed from: i */
    public final android.widget.TextView f1199i;

    /* renamed from: j */
    public final android.content.Context f1200j;

    /* renamed from: k */
    public final androidx.appcompat.widget.C0259a0.c f1201k;

    /* renamed from: androidx.appcompat.widget.a0$a */
    public static class a extends androidx.appcompat.widget.C0259a0.c {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.C0259a0.c
        /* renamed from: a */
        public void mo666a(android.text.StaticLayout.Builder r3, android.widget.TextView r4) {
                r2 = this;
                android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
                java.lang.String r1 = "getTextDirectionHeuristic"
                java.lang.Object r4 = androidx.appcompat.widget.C0259a0.m657e(r4, r1, r0)
                android.text.TextDirectionHeuristic r4 = (android.text.TextDirectionHeuristic) r4
                r3.setTextDirection(r4)
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$b */
    public static class b extends androidx.appcompat.widget.C0259a0.a {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.C0259a0.a, androidx.appcompat.widget.C0259a0.c
        /* renamed from: a */
        public void mo666a(android.text.StaticLayout.Builder r1, android.widget.TextView r2) {
                r0 = this;
                android.text.TextDirectionHeuristic r2 = r2.getTextDirectionHeuristic()
                r1.setTextDirection(r2)
                return
        }

        @Override // androidx.appcompat.widget.C0259a0.c
        /* renamed from: b */
        public boolean mo667b(android.widget.TextView r1) {
                r0 = this;
                boolean r1 = r1.isHorizontallyScrollable()
                return r1
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$c */
    public static class c {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void mo666a(android.text.StaticLayout.Builder r1, android.widget.TextView r2) {
                r0 = this;
                return
        }

        /* renamed from: b */
        public boolean mo667b(android.widget.TextView r3) {
                r2 = this;
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                java.lang.String r1 = "getHorizontallyScrolling"
                java.lang.Object r3 = androidx.appcompat.widget.C0259a0.m657e(r3, r1, r0)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                return r3
        }
    }

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            androidx.appcompat.widget.C0259a0.f1188l = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            androidx.appcompat.widget.C0259a0.f1189m = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            androidx.appcompat.widget.C0259a0.f1190n = r0
            return
    }

    public C0259a0(android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1191a = r0
            r2.f1192b = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.f1193c = r1
            r2.f1194d = r1
            r2.f1195e = r1
            int[] r1 = new int[r0]
            r2.f1196f = r1
            r2.f1197g = r0
            r2.f1199i = r3
            android.content.Context r3 = r3.getContext()
            r2.f1200j = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r3 < r0) goto L2c
            androidx.appcompat.widget.a0$b r3 = new androidx.appcompat.widget.a0$b
            r3.<init>()
        L29:
            r2.f1201k = r3
            goto L3c
        L2c:
            r0 = 23
            if (r3 < r0) goto L36
            androidx.appcompat.widget.a0$a r3 = new androidx.appcompat.widget.a0$a
            r3.<init>()
            goto L29
        L36:
            androidx.appcompat.widget.a0$c r3 = new androidx.appcompat.widget.a0$c
            r3.<init>()
            goto L29
        L3c:
            return
    }

    /* renamed from: d */
    public static java.lang.reflect.Method m656d(java.lang.String r3) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> r0 = androidx.appcompat.widget.C0259a0.f1189m     // Catch: java.lang.Exception -> L1f
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Exception -> L1f
            if (r0 != 0) goto L1e
            java.lang.Class<android.widget.TextView> r0 = android.widget.TextView.class
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r1)     // Catch: java.lang.Exception -> L1f
            if (r0 == 0) goto L1e
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L1f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> r1 = androidx.appcompat.widget.C0259a0.f1189m     // Catch: java.lang.Exception -> L1f
            r1.put(r3, r0)     // Catch: java.lang.Exception -> L1f
        L1e:
            return r0
        L1f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to retrieve TextView#"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "() method"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "ACTVAutoSizeHelper"
            android.util.Log.w(r1, r3, r0)
            r3 = 0
            return r3
    }

    /* renamed from: e */
    public static <T> T m657e(java.lang.Object r3, java.lang.String r4, T r5) {
            java.lang.reflect.Method r0 = m656d(r4)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            java.lang.Object r5 = r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            goto L2a
        Lc:
            r3 = move-exception
            goto L2b
        Le:
            r3 = move-exception
            java.lang.String r0 = "ACTVAutoSizeHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc
            r1.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = "Failed to invoke TextView#"
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc
            r1.append(r4)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r4 = "() method"
            r1.append(r4)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> Lc
            android.util.Log.w(r0, r4, r3)     // Catch: java.lang.Throwable -> Lc
        L2a:
            return r5
        L2b:
            throw r3
    }

    /* renamed from: a */
    public void m658a() {
            r5 = this;
            boolean r0 = r5.m664i()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            int r0 = r5.f1191a
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L12
            return
        L12:
            boolean r0 = r5.f1192b
            if (r0 == 0) goto L85
            android.widget.TextView r0 = r5.f1199i
            int r0 = r0.getMeasuredHeight()
            if (r0 <= 0) goto L84
            android.widget.TextView r0 = r5.f1199i
            int r0 = r0.getMeasuredWidth()
            if (r0 > 0) goto L27
            goto L84
        L27:
            androidx.appcompat.widget.a0$c r0 = r5.f1201k
            android.widget.TextView r3 = r5.f1199i
            boolean r0 = r0.mo667b(r3)
            if (r0 == 0) goto L34
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L48
        L34:
            android.widget.TextView r0 = r5.f1199i
            int r0 = r0.getMeasuredWidth()
            android.widget.TextView r3 = r5.f1199i
            int r3 = r3.getTotalPaddingLeft()
            int r0 = r0 - r3
            android.widget.TextView r3 = r5.f1199i
            int r3 = r3.getTotalPaddingRight()
            int r0 = r0 - r3
        L48:
            android.widget.TextView r3 = r5.f1199i
            int r3 = r3.getHeight()
            android.widget.TextView r4 = r5.f1199i
            int r4 = r4.getCompoundPaddingBottom()
            int r3 = r3 - r4
            android.widget.TextView r4 = r5.f1199i
            int r4 = r4.getCompoundPaddingTop()
            int r3 = r3 - r4
            if (r0 <= 0) goto L84
            if (r3 > 0) goto L61
            goto L84
        L61:
            android.graphics.RectF r4 = androidx.appcompat.widget.C0259a0.f1188l
            monitor-enter(r4)
            r4.setEmpty()     // Catch: java.lang.Throwable -> L81
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L81
            r4.right = r0     // Catch: java.lang.Throwable -> L81
            float r0 = (float) r3     // Catch: java.lang.Throwable -> L81
            r4.bottom = r0     // Catch: java.lang.Throwable -> L81
            int r0 = r5.m660c(r4)     // Catch: java.lang.Throwable -> L81
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L81
            android.widget.TextView r3 = r5.f1199i     // Catch: java.lang.Throwable -> L81
            float r3 = r3.getTextSize()     // Catch: java.lang.Throwable -> L81
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L7f
            r5.m661f(r1, r0)     // Catch: java.lang.Throwable -> L81
        L7f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L81
            goto L85
        L81:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L81
            throw r0
        L84:
            return
        L85:
            r5.f1192b = r2
            return
    }

    /* renamed from: b */
    public final int[] m659b(int[] r7) {
            r6 = this;
            int r0 = r7.length
            if (r0 != 0) goto L4
            return r7
        L4:
            java.util.Arrays.sort(r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r0) goto L28
            r4 = r7[r3]
            if (r4 <= 0) goto L25
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            int r5 = java.util.Collections.binarySearch(r1, r5)
            if (r5 >= 0) goto L25
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        L25:
            int r3 = r3 + 1
            goto Le
        L28:
            int r3 = r1.size()
            if (r0 != r3) goto L2f
            return r7
        L2f:
            int r7 = r1.size()
            int[] r0 = new int[r7]
        L35:
            if (r2 >= r7) goto L46
            java.lang.Object r3 = r1.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0[r2] = r3
            int r2 = r2 + 1
            goto L35
        L46:
            return r0
    }

    /* renamed from: c */
    public final int m660c(android.graphics.RectF r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            int[] r2 = r0.f1196f
            int r2 = r2.length
            if (r2 == 0) goto L131
            r3 = 1
            int r2 = r2 - r3
            r4 = 0
            r5 = 1
            r6 = 0
        Le:
            if (r5 > r2) goto L12c
            int r6 = r5 + r2
            int r6 = r6 / 2
            int[] r7 = r0.f1196f
            r7 = r7[r6]
            android.widget.TextView r8 = r0.f1199i
            java.lang.CharSequence r8 = r8.getText()
            android.widget.TextView r9 = r0.f1199i
            android.text.method.TransformationMethod r9 = r9.getTransformationMethod()
            if (r9 == 0) goto L2f
            android.widget.TextView r10 = r0.f1199i
            java.lang.CharSequence r9 = r9.getTransformation(r8, r10)
            if (r9 == 0) goto L2f
            r8 = r9
        L2f:
            int r9 = android.os.Build.VERSION.SDK_INT
            android.widget.TextView r10 = r0.f1199i
            int r15 = r10.getMaxLines()
            android.text.TextPaint r10 = r0.f1198h
            if (r10 != 0) goto L43
            android.text.TextPaint r10 = new android.text.TextPaint
            r10.<init>()
            r0.f1198h = r10
            goto L46
        L43:
            r10.reset()
        L46:
            android.text.TextPaint r10 = r0.f1198h
            android.widget.TextView r11 = r0.f1199i
            android.text.TextPaint r11 = r11.getPaint()
            r10.set(r11)
            android.text.TextPaint r10 = r0.f1198h
            float r7 = (float) r7
            r10.setTextSize(r7)
            android.widget.TextView r7 = r0.f1199i
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_NORMAL
            java.lang.String r11 = "getLayoutAlignment"
            java.lang.Object r7 = m657e(r7, r11, r10)
            r14 = r7
            android.text.Layout$Alignment r14 = (android.text.Layout.Alignment) r14
            float r7 = r1.right
            int r13 = java.lang.Math.round(r7)
            r7 = 23
            r12 = -1
            if (r9 < r7) goto Lcb
            int r7 = r8.length()
            android.text.TextPaint r9 = r0.f1198h
            android.text.StaticLayout$Builder r7 = android.text.StaticLayout.Builder.obtain(r8, r4, r7, r9, r13)
            android.text.StaticLayout$Builder r9 = r7.setAlignment(r14)
            android.widget.TextView r10 = r0.f1199i
            float r10 = r10.getLineSpacingExtra()
            android.widget.TextView r11 = r0.f1199i
            float r11 = r11.getLineSpacingMultiplier()
            android.text.StaticLayout$Builder r9 = r9.setLineSpacing(r10, r11)
            android.widget.TextView r10 = r0.f1199i
            boolean r10 = r10.getIncludeFontPadding()
            android.text.StaticLayout$Builder r9 = r9.setIncludePad(r10)
            android.widget.TextView r10 = r0.f1199i
            int r10 = r10.getBreakStrategy()
            android.text.StaticLayout$Builder r9 = r9.setBreakStrategy(r10)
            android.widget.TextView r10 = r0.f1199i
            int r10 = r10.getHyphenationFrequency()
            android.text.StaticLayout$Builder r9 = r9.setHyphenationFrequency(r10)
            if (r15 != r12) goto Lb1
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto Lb2
        Lb1:
            r10 = r15
        Lb2:
            r9.setMaxLines(r10)
            androidx.appcompat.widget.a0$c r9 = r0.f1201k     // Catch: java.lang.ClassCastException -> Lbd
            android.widget.TextView r10 = r0.f1199i     // Catch: java.lang.ClassCastException -> Lbd
            r9.mo666a(r7, r10)     // Catch: java.lang.ClassCastException -> Lbd
            goto Lc4
        Lbd:
            java.lang.String r9 = "ACTVAutoSizeHelper"
            java.lang.String r10 = "Failed to obtain TextDirectionHeuristic, auto size may be incorrect"
            android.util.Log.w(r9, r10)
        Lc4:
            android.text.StaticLayout r7 = r7.build()
            r3 = r15
            r4 = -1
            goto Lee
        Lcb:
            android.widget.TextView r7 = r0.f1199i
            float r7 = r7.getLineSpacingMultiplier()
            android.widget.TextView r9 = r0.f1199i
            float r16 = r9.getLineSpacingExtra()
            android.widget.TextView r9 = r0.f1199i
            boolean r17 = r9.getIncludeFontPadding()
            android.text.StaticLayout r9 = new android.text.StaticLayout
            android.text.TextPaint r11 = r0.f1198h
            r10 = r9
            r18 = r11
            r11 = r8
            r4 = -1
            r12 = r18
            r3 = r15
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r7 = r9
        Lee:
            if (r3 == r4) goto L109
            int r4 = r7.getLineCount()
            if (r4 > r3) goto L107
            int r3 = r7.getLineCount()
            r4 = 1
            int r3 = r3 - r4
            int r3 = r7.getLineEnd(r3)
            int r8 = r8.length()
            if (r3 == r8) goto L10a
            goto L115
        L107:
            r4 = 1
            goto L115
        L109:
            r4 = 1
        L10a:
            int r3 = r7.getHeight()
            float r3 = (float) r3
            float r7 = r1.bottom
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L117
        L115:
            r3 = 0
            goto L118
        L117:
            r3 = 1
        L118:
            if (r3 == 0) goto L125
            int r6 = r6 + 1
            r3 = 1
            r4 = 0
            r19 = r6
            r6 = r5
            r5 = r19
            goto Le
        L125:
            int r6 = r6 + (-1)
            r2 = r6
            r3 = 1
            r4 = 0
            goto Le
        L12c:
            int[] r1 = r0.f1196f
            r1 = r1[r6]
            return r1
        L131:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No available text sizes to choose from."
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: f */
    public void m661f(int r3, float r4) {
            r2 = this;
            android.content.Context r0 = r2.f1200j
            if (r0 != 0) goto L9
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            goto Ld
        L9:
            android.content.res.Resources r0 = r0.getResources()
        Ld:
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r3, r4, r0)
            android.widget.TextView r4 = r2.f1199i
            android.text.TextPaint r4 = r4.getPaint()
            float r4 = r4.getTextSize()
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L67
            android.widget.TextView r4 = r2.f1199i
            android.text.TextPaint r4 = r4.getPaint()
            r4.setTextSize(r3)
            android.widget.TextView r3 = r2.f1199i
            boolean r3 = r3.isInLayout()
            android.widget.TextView r4 = r2.f1199i
            android.text.Layout r4 = r4.getLayout()
            if (r4 == 0) goto L67
            r4 = 0
            r2.f1192b = r4
            java.lang.String r0 = "nullLayouts"
            java.lang.reflect.Method r0 = m656d(r0)     // Catch: java.lang.Exception -> L4d
            if (r0 == 0) goto L55
            android.widget.TextView r1 = r2.f1199i     // Catch: java.lang.Exception -> L4d
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L4d
            r0.invoke(r1, r4)     // Catch: java.lang.Exception -> L4d
            goto L55
        L4d:
            r4 = move-exception
            java.lang.String r0 = "ACTVAutoSizeHelper"
            java.lang.String r1 = "Failed to invoke TextView#nullLayouts() method"
            android.util.Log.w(r0, r1, r4)
        L55:
            if (r3 != 0) goto L5d
            android.widget.TextView r3 = r2.f1199i
            r3.requestLayout()
            goto L62
        L5d:
            android.widget.TextView r3 = r2.f1199i
            r3.forceLayout()
        L62:
            android.widget.TextView r3 = r2.f1199i
            r3.invalidate()
        L67:
            return
    }

    /* renamed from: g */
    public final boolean m662g() {
            r7 = this;
            boolean r0 = r7.m664i()
            r1 = 0
            if (r0 == 0) goto L42
            int r0 = r7.f1191a
            r2 = 1
            if (r0 != r2) goto L42
            boolean r0 = r7.f1197g
            if (r0 == 0) goto L15
            int[] r0 = r7.f1196f
            int r0 = r0.length
            if (r0 != 0) goto L3f
        L15:
            float r0 = r7.f1195e
            float r3 = r7.f1194d
            float r0 = r0 - r3
            float r3 = r7.f1193c
            float r0 = r0 / r3
            double r3 = (double) r0
            double r3 = java.lang.Math.floor(r3)
            int r0 = (int) r3
            int r0 = r0 + r2
            int[] r3 = new int[r0]
        L26:
            if (r1 >= r0) goto L39
            float r4 = r7.f1194d
            float r5 = (float) r1
            float r6 = r7.f1193c
            float r5 = r5 * r6
            float r5 = r5 + r4
            int r4 = java.lang.Math.round(r5)
            r3[r1] = r4
            int r1 = r1 + 1
            goto L26
        L39:
            int[] r0 = r7.m659b(r3)
            r7.f1196f = r0
        L3f:
            r7.f1192b = r2
            goto L44
        L42:
            r7.f1192b = r1
        L44:
            boolean r0 = r7.f1192b
            return r0
    }

    /* renamed from: h */
    public final boolean m663h() {
            r5 = this;
            int[] r0 = r5.f1196f
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L9
            r4 = 1
            goto La
        L9:
            r4 = 0
        La:
            r5.f1197g = r4
            if (r4 == 0) goto L1f
            r5.f1191a = r3
            r2 = r0[r2]
            float r2 = (float) r2
            r5.f1194d = r2
            int r1 = r1 - r3
            r0 = r0[r1]
            float r0 = (float) r0
            r5.f1195e = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.f1193c = r0
        L1f:
            return r4
    }

    /* renamed from: i */
    public final boolean m664i() {
            r1 = this;
            android.widget.TextView r0 = r1.f1199i
            boolean r0 = r0 instanceof androidx.appcompat.widget.C0287l
            r0 = r0 ^ 1
            return r0
    }

    /* renamed from: j */
    public final void m665j(float r4, float r5, float r6) {
            r3 = this;
            java.lang.String r0 = "px) is less or equal to (0px)"
            r1 = 0
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 <= 0) goto L5a
            int r2 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r2 <= 0) goto L36
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1c
            r0 = 1
            r3.f1191a = r0
            r3.f1194d = r4
            r3.f1195e = r5
            r3.f1193c = r6
            r4 = 0
            r3.f1197g = r4
            return
        L1c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "The auto-size step granularity ("
            r5.append(r1)
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L36:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Maximum auto-size text size ("
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = "px) is less or equal to minimum auto-size text size ("
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = "px)"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r6.<init>(r4)
            throw r6
        L5a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Minimum auto-size text size ("
            r6.append(r1)
            r6.append(r4)
            r6.append(r0)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
    }
}
