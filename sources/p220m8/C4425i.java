package p220m8;

/* renamed from: m8.i */
/* loaded from: classes.dex */
public final class C4425i {

    /* renamed from: m */
    public static final int f18059m = 0;

    /* renamed from: n */
    public static boolean f18060n;

    /* renamed from: o */
    public static java.lang.reflect.Constructor<android.text.StaticLayout> f18061o;

    /* renamed from: p */
    public static java.lang.Object f18062p;

    /* renamed from: a */
    public java.lang.CharSequence f18063a;

    /* renamed from: b */
    public final android.text.TextPaint f18064b;

    /* renamed from: c */
    public final int f18065c;

    /* renamed from: d */
    public int f18066d;

    /* renamed from: e */
    public android.text.Layout.Alignment f18067e;

    /* renamed from: f */
    public int f18068f;

    /* renamed from: g */
    public float f18069g;

    /* renamed from: h */
    public float f18070h;

    /* renamed from: i */
    public int f18071i;

    /* renamed from: j */
    public boolean f18072j;

    /* renamed from: k */
    public boolean f18073k;

    /* renamed from: l */
    public android.text.TextUtils.TruncateAt f18074l;

    /* renamed from: m8.i$a */
    public static class a extends java.lang.Exception {
        public a(java.lang.Throwable r3) {
                r2 = this;
                java.lang.String r0 = "Error thrown initializing StaticLayout "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            p220m8.C4425i.f18059m = r0
            return
    }

    public C4425i(java.lang.CharSequence r1, android.text.TextPaint r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f18063a = r1
            r0.f18064b = r2
            r0.f18065c = r3
            int r1 = r1.length()
            r0.f18066d = r1
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            r0.f18067e = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.f18068f = r1
            r1 = 0
            r0.f18069g = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.f18070h = r1
            int r1 = p220m8.C4425i.f18059m
            r0.f18071i = r1
            r1 = 1
            r0.f18072j = r1
            r1 = 0
            r0.f18074l = r1
            return
    }

    /* renamed from: a */
    public android.text.StaticLayout m9871a() {
            r22 = this;
            r1 = r22
            java.lang.CharSequence r0 = r1.f18063a
            if (r0 != 0) goto La
            java.lang.String r0 = ""
            r1.f18063a = r0
        La:
            int r0 = r1.f18065c
            r2 = 0
            int r0 = java.lang.Math.max(r2, r0)
            java.lang.CharSequence r3 = r1.f18063a
            int r4 = r1.f18068f
            r5 = 1
            if (r4 != r5) goto L21
            android.text.TextPaint r4 = r1.f18064b
            float r6 = (float) r0
            android.text.TextUtils$TruncateAt r7 = r1.f18074l
            java.lang.CharSequence r3 = android.text.TextUtils.ellipsize(r3, r4, r6, r7)
        L21:
            int r4 = r3.length()
            int r6 = r1.f18066d
            int r4 = java.lang.Math.min(r4, r6)
            r1.f18066d = r4
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r9 = 23
            if (r6 < r9) goto L89
            boolean r6 = r1.f18073k
            if (r6 == 0) goto L42
            int r6 = r1.f18068f
            if (r6 != r5) goto L42
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r1.f18067e = r6
        L42:
            android.text.TextPaint r6 = r1.f18064b
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r3, r2, r4, r6, r0)
            android.text.Layout$Alignment r2 = r1.f18067e
            r0.setAlignment(r2)
            boolean r2 = r1.f18072j
            r0.setIncludePad(r2)
            boolean r2 = r1.f18073k
            if (r2 == 0) goto L59
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.RTL
            goto L5b
        L59:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.LTR
        L5b:
            r0.setTextDirection(r2)
            android.text.TextUtils$TruncateAt r2 = r1.f18074l
            if (r2 == 0) goto L65
            r0.setEllipsize(r2)
        L65:
            int r2 = r1.f18068f
            r0.setMaxLines(r2)
            float r2 = r1.f18069g
            int r3 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r3 != 0) goto L76
            float r3 = r1.f18070h
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 == 0) goto L7b
        L76:
            float r3 = r1.f18070h
            r0.setLineSpacing(r2, r3)
        L7b:
            int r2 = r1.f18068f
            if (r2 <= r5) goto L84
            int r2 = r1.f18071i
            r0.setHyphenationFrequency(r2)
        L84:
            android.text.StaticLayout r0 = r0.build()
            return r0
        L89:
            boolean r4 = p220m8.C4425i.f18060n
            r10 = 12
            r11 = 11
            r12 = 10
            r13 = 9
            r14 = 8
            r15 = 7
            r16 = 6
            r17 = 5
            r18 = 4
            r19 = 3
            r20 = 2
            r8 = 13
            if (r4 == 0) goto La5
            goto Lf0
        La5:
            boolean r4 = r1.f18073k     // Catch: java.lang.Exception -> L150
            if (r4 == 0) goto Lad
            if (r6 < r9) goto Lad
            r4 = 1
            goto Lae
        Lad:
            r4 = 0
        Lae:
            java.lang.Class<android.text.TextDirectionHeuristic> r6 = android.text.TextDirectionHeuristic.class
            if (r4 == 0) goto Lb5
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.RTL     // Catch: java.lang.Exception -> L150
            goto Lb7
        Lb5:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LTR     // Catch: java.lang.Exception -> L150
        Lb7:
            p220m8.C4425i.f18062p = r4     // Catch: java.lang.Exception -> L150
            java.lang.Class[] r4 = new java.lang.Class[r8]     // Catch: java.lang.Exception -> L150
            java.lang.Class<java.lang.CharSequence> r9 = java.lang.CharSequence.class
            r4[r2] = r9     // Catch: java.lang.Exception -> L150
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L150
            r4[r5] = r9     // Catch: java.lang.Exception -> L150
            r4[r20] = r9     // Catch: java.lang.Exception -> L150
            java.lang.Class<android.text.TextPaint> r21 = android.text.TextPaint.class
            r4[r19] = r21     // Catch: java.lang.Exception -> L150
            r4[r18] = r9     // Catch: java.lang.Exception -> L150
            java.lang.Class<android.text.Layout$Alignment> r21 = android.text.Layout.Alignment.class
            r4[r17] = r21     // Catch: java.lang.Exception -> L150
            r4[r16] = r6     // Catch: java.lang.Exception -> L150
            java.lang.Class r6 = java.lang.Float.TYPE     // Catch: java.lang.Exception -> L150
            r4[r15] = r6     // Catch: java.lang.Exception -> L150
            r4[r14] = r6     // Catch: java.lang.Exception -> L150
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L150
            r4[r13] = r6     // Catch: java.lang.Exception -> L150
            java.lang.Class<android.text.TextUtils$TruncateAt> r6 = android.text.TextUtils.TruncateAt.class
            r4[r12] = r6     // Catch: java.lang.Exception -> L150
            r4[r11] = r9     // Catch: java.lang.Exception -> L150
            r4[r10] = r9     // Catch: java.lang.Exception -> L150
            java.lang.Class<android.text.StaticLayout> r6 = android.text.StaticLayout.class
            java.lang.reflect.Constructor r4 = r6.getDeclaredConstructor(r4)     // Catch: java.lang.Exception -> L150
            p220m8.C4425i.f18061o = r4     // Catch: java.lang.Exception -> L150
            r4.setAccessible(r5)     // Catch: java.lang.Exception -> L150
            p220m8.C4425i.f18060n = r5     // Catch: java.lang.Exception -> L150
        Lf0:
            java.lang.reflect.Constructor<android.text.StaticLayout> r4 = p220m8.C4425i.f18061o     // Catch: java.lang.Exception -> L149
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Exception -> L149
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L149
            r6[r2] = r3     // Catch: java.lang.Exception -> L149
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L149
            r6[r5] = r2     // Catch: java.lang.Exception -> L149
            int r2 = r1.f18066d     // Catch: java.lang.Exception -> L149
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L149
            r6[r20] = r2     // Catch: java.lang.Exception -> L149
            android.text.TextPaint r2 = r1.f18064b     // Catch: java.lang.Exception -> L149
            r6[r19] = r2     // Catch: java.lang.Exception -> L149
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L149
            r6[r18] = r2     // Catch: java.lang.Exception -> L149
            android.text.Layout$Alignment r2 = r1.f18067e     // Catch: java.lang.Exception -> L149
            r6[r17] = r2     // Catch: java.lang.Exception -> L149
            java.lang.Object r2 = p220m8.C4425i.f18062p     // Catch: java.lang.Exception -> L149
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Exception -> L149
            r6[r16] = r2     // Catch: java.lang.Exception -> L149
            java.lang.Float r2 = java.lang.Float.valueOf(r7)     // Catch: java.lang.Exception -> L149
            r6[r15] = r2     // Catch: java.lang.Exception -> L149
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch: java.lang.Exception -> L149
            r6[r14] = r2     // Catch: java.lang.Exception -> L149
            boolean r2 = r1.f18072j     // Catch: java.lang.Exception -> L149
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L149
            r6[r13] = r2     // Catch: java.lang.Exception -> L149
            r2 = 0
            r6[r12] = r2     // Catch: java.lang.Exception -> L149
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L149
            r6[r11] = r0     // Catch: java.lang.Exception -> L149
            int r0 = r1.f18068f     // Catch: java.lang.Exception -> L149
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L149
            r6[r10] = r0     // Catch: java.lang.Exception -> L149
            java.lang.Object r0 = r4.newInstance(r6)     // Catch: java.lang.Exception -> L149
            android.text.StaticLayout r0 = (android.text.StaticLayout) r0     // Catch: java.lang.Exception -> L149
            return r0
        L149:
            r0 = move-exception
            m8.i$a r2 = new m8.i$a
            r2.<init>(r0)
            throw r2
        L150:
            r0 = move-exception
            m8.i$a r2 = new m8.i$a
            r2.<init>(r0)
            throw r2
    }
}
