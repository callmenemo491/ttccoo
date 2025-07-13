package p195l0;

/* renamed from: l0.b */
/* loaded from: classes.dex */
public class C4158b implements android.text.Spannable {

    /* renamed from: l0.b$a */
    public static final class a {

        /* renamed from: a */
        public final android.text.TextPaint f17229a;

        /* renamed from: b */
        public final android.text.TextDirectionHeuristic f17230b;

        /* renamed from: c */
        public final int f17231c;

        /* renamed from: d */
        public final int f17232d;

        public a(android.text.PrecomputedText.Params r2) {
                r1 = this;
                r1.<init>()
                android.text.TextPaint r0 = r2.getTextPaint()
                r1.f17229a = r0
                android.text.TextDirectionHeuristic r0 = r2.getTextDirection()
                r1.f17230b = r0
                int r0 = r2.getBreakStrategy()
                r1.f17231c = r0
                int r2 = r2.getHyphenationFrequency()
                r1.f17232d = r2
                return
        }

        public a(android.text.TextPaint r3, android.text.TextDirectionHeuristic r4, int r5, int r6) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L1d
                android.text.PrecomputedText$Params$Builder r0 = new android.text.PrecomputedText$Params$Builder
                r0.<init>(r3)
                android.text.PrecomputedText$Params$Builder r0 = r0.setBreakStrategy(r5)
                android.text.PrecomputedText$Params$Builder r0 = r0.setHyphenationFrequency(r6)
                android.text.PrecomputedText$Params$Builder r0 = r0.setTextDirection(r4)
                r0.build()
            L1d:
                r2.f17229a = r3
                r2.f17230b = r4
                r2.f17231c = r5
                r2.f17232d = r6
                return
        }

        /* renamed from: a */
        public boolean m9218a(p195l0.C4158b.a r5) {
                r4 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 0
                r2 = 23
                if (r0 < r2) goto L15
                int r2 = r4.f17231c
                int r3 = r5.f17231c
                if (r2 == r3) goto Le
                return r1
            Le:
                int r2 = r4.f17232d
                int r3 = r5.f17232d
                if (r2 == r3) goto L15
                return r1
            L15:
                android.text.TextPaint r2 = r4.f17229a
                float r2 = r2.getTextSize()
                android.text.TextPaint r3 = r5.f17229a
                float r3 = r3.getTextSize()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L26
                return r1
            L26:
                android.text.TextPaint r2 = r4.f17229a
                float r2 = r2.getTextScaleX()
                android.text.TextPaint r3 = r5.f17229a
                float r3 = r3.getTextScaleX()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L37
                return r1
            L37:
                android.text.TextPaint r2 = r4.f17229a
                float r2 = r2.getTextSkewX()
                android.text.TextPaint r3 = r5.f17229a
                float r3 = r3.getTextSkewX()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L48
                return r1
            L48:
                android.text.TextPaint r2 = r4.f17229a
                float r2 = r2.getLetterSpacing()
                android.text.TextPaint r3 = r5.f17229a
                float r3 = r3.getLetterSpacing()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L59
                return r1
            L59:
                android.text.TextPaint r2 = r4.f17229a
                java.lang.String r2 = r2.getFontFeatureSettings()
                android.text.TextPaint r3 = r5.f17229a
                java.lang.String r3 = r3.getFontFeatureSettings()
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 != 0) goto L6c
                return r1
            L6c:
                android.text.TextPaint r2 = r4.f17229a
                int r2 = r2.getFlags()
                android.text.TextPaint r3 = r5.f17229a
                int r3 = r3.getFlags()
                if (r2 == r3) goto L7b
                return r1
            L7b:
                r2 = 24
                if (r0 < r2) goto L92
                android.text.TextPaint r0 = r4.f17229a
                android.os.LocaleList r0 = r0.getTextLocales()
                android.text.TextPaint r2 = r5.f17229a
                android.os.LocaleList r2 = r2.getTextLocales()
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto La5
                return r1
            L92:
                android.text.TextPaint r0 = r4.f17229a
                java.util.Locale r0 = r0.getTextLocale()
                android.text.TextPaint r2 = r5.f17229a
                java.util.Locale r2 = r2.getTextLocale()
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto La5
                return r1
            La5:
                android.text.TextPaint r0 = r4.f17229a
                android.graphics.Typeface r0 = r0.getTypeface()
                if (r0 != 0) goto Lb6
                android.text.TextPaint r5 = r5.f17229a
                android.graphics.Typeface r5 = r5.getTypeface()
                if (r5 == 0) goto Lc9
                return r1
            Lb6:
                android.text.TextPaint r0 = r4.f17229a
                android.graphics.Typeface r0 = r0.getTypeface()
                android.text.TextPaint r5 = r5.f17229a
                android.graphics.Typeface r5 = r5.getTypeface()
                boolean r5 = r0.equals(r5)
                if (r5 != 0) goto Lc9
                return r1
            Lc9:
                r5 = 1
                return r5
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r4 != r3) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof p195l0.C4158b.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                l0.b$a r4 = (p195l0.C4158b.a) r4
                boolean r1 = r3.m9218a(r4)
                if (r1 != 0) goto L13
                return r2
            L13:
                android.text.TextDirectionHeuristic r1 = r3.f17230b
                android.text.TextDirectionHeuristic r4 = r4.f17230b
                if (r1 == r4) goto L1a
                return r2
            L1a:
                return r0
        }

        public int hashCode() {
                r14 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 10
                r2 = 9
                r3 = 8
                r4 = 7
                r5 = 6
                r6 = 5
                r7 = 4
                r8 = 3
                r9 = 2
                r10 = 1
                r11 = 0
                r12 = 11
                r13 = 24
                if (r0 < r13) goto L89
                java.lang.Object[] r0 = new java.lang.Object[r12]
                android.text.TextPaint r12 = r14.f17229a
                float r12 = r12.getTextSize()
                java.lang.Float r12 = java.lang.Float.valueOf(r12)
                r0[r11] = r12
                android.text.TextPaint r11 = r14.f17229a
                float r11 = r11.getTextScaleX()
                java.lang.Float r11 = java.lang.Float.valueOf(r11)
                r0[r10] = r11
                android.text.TextPaint r10 = r14.f17229a
                float r10 = r10.getTextSkewX()
                java.lang.Float r10 = java.lang.Float.valueOf(r10)
                r0[r9] = r10
                android.text.TextPaint r9 = r14.f17229a
                float r9 = r9.getLetterSpacing()
                java.lang.Float r9 = java.lang.Float.valueOf(r9)
                r0[r8] = r9
                android.text.TextPaint r8 = r14.f17229a
                int r8 = r8.getFlags()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r0[r7] = r8
                android.text.TextPaint r7 = r14.f17229a
                android.os.LocaleList r7 = r7.getTextLocales()
                r0[r6] = r7
                android.text.TextPaint r6 = r14.f17229a
                android.graphics.Typeface r6 = r6.getTypeface()
                r0[r5] = r6
                android.text.TextPaint r5 = r14.f17229a
                boolean r5 = r5.isElegantTextHeight()
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r0[r4] = r5
                android.text.TextDirectionHeuristic r4 = r14.f17230b
                r0[r3] = r4
                int r3 = r14.f17231c
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0[r2] = r3
                int r2 = r14.f17232d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                int r0 = java.util.Objects.hash(r0)
                return r0
            L89:
                java.lang.Object[] r0 = new java.lang.Object[r12]
                android.text.TextPaint r12 = r14.f17229a
                float r12 = r12.getTextSize()
                java.lang.Float r12 = java.lang.Float.valueOf(r12)
                r0[r11] = r12
                android.text.TextPaint r11 = r14.f17229a
                float r11 = r11.getTextScaleX()
                java.lang.Float r11 = java.lang.Float.valueOf(r11)
                r0[r10] = r11
                android.text.TextPaint r10 = r14.f17229a
                float r10 = r10.getTextSkewX()
                java.lang.Float r10 = java.lang.Float.valueOf(r10)
                r0[r9] = r10
                android.text.TextPaint r9 = r14.f17229a
                float r9 = r9.getLetterSpacing()
                java.lang.Float r9 = java.lang.Float.valueOf(r9)
                r0[r8] = r9
                android.text.TextPaint r8 = r14.f17229a
                int r8 = r8.getFlags()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r0[r7] = r8
                android.text.TextPaint r7 = r14.f17229a
                java.util.Locale r7 = r7.getTextLocale()
                r0[r6] = r7
                android.text.TextPaint r6 = r14.f17229a
                android.graphics.Typeface r6 = r6.getTypeface()
                r0[r5] = r6
                android.text.TextPaint r5 = r14.f17229a
                boolean r5 = r5.isElegantTextHeight()
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r0[r4] = r5
                android.text.TextDirectionHeuristic r4 = r14.f17230b
                r0[r3] = r4
                int r3 = r14.f17231c
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0[r2] = r3
                int r2 = r14.f17232d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                int r0 = java.util.Objects.hash(r0)
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{"
                r0.<init>(r1)
                java.lang.String r1 = "textSize="
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                android.text.TextPaint r2 = r4.f17229a
                float r2 = r2.getTextSize()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textScaleX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f17229a
                float r2 = r2.getTextScaleX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textSkewX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f17229a
                float r2 = r2.getTextSkewX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                java.lang.String r2 = ", letterSpacing="
                java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
                android.text.TextPaint r3 = r4.f17229a
                float r3 = r3.getLetterSpacing()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = ", elegantTextHeight="
                r2.append(r3)
                android.text.TextPaint r3 = r4.f17229a
                boolean r3 = r3.isElegantTextHeight()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                r2 = 24
                java.lang.String r3 = ", textLocale="
                if (r1 < r2) goto L94
                java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r3)
                android.text.TextPaint r3 = r4.f17229a
                android.os.LocaleList r3 = r3.getTextLocales()
                goto L9e
            L94:
                java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r3)
                android.text.TextPaint r3 = r4.f17229a
                java.util.Locale r3 = r3.getTextLocale()
            L9e:
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                java.lang.String r2 = ", typeface="
                java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
                android.text.TextPaint r3 = r4.f17229a
                android.graphics.Typeface r3 = r3.getTypeface()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                r2 = 26
                if (r1 < r2) goto Ld8
                java.lang.String r1 = ", variationSettings="
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                android.text.TextPaint r2 = r4.f17229a
                java.lang.String r2 = r2.getFontVariationSettings()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            Ld8:
                java.lang.String r1 = ", textDir="
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                android.text.TextDirectionHeuristic r2 = r4.f17230b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", breakStrategy="
                r1.append(r2)
                int r2 = r4.f17231c
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", hyphenationFrequency="
                r1.append(r2)
                int r2 = r4.f17232d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // android.text.Spanned
    public int getSpanEnd(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // android.text.Spanned
    public int getSpanFlags(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // android.text.Spanned
    public int getSpanStart(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int r1, int r2, java.lang.Class<T> r3) {
            r0 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 29
            throw r2
    }

    @Override // java.lang.CharSequence
    public int length() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int r1, int r2, java.lang.Class r3) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // android.text.Spannable
    public void removeSpan(java.lang.Object r3) {
            r2 = this;
            boolean r3 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r3 != 0) goto La
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r1 = 0
            throw r1
        La:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "MetricAffectingSpan can not be removed from PrecomputedText."
            r3.<init>(r0)
            throw r3
    }

    @Override // android.text.Spannable
    public void setSpan(java.lang.Object r1, int r2, int r3, int r4) {
            r0 = this;
            boolean r1 = r1 instanceof android.text.style.MetricAffectingSpan
            if (r1 != 0) goto La
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r3 = 0
            throw r3
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "MetricAffectingSpan can not be set to PrecomputedText."
            r1.<init>(r2)
            throw r1
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int r1, int r2) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
            r1 = this;
            r0 = 0
            throw r0
    }
}
