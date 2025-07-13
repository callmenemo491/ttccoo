package p305r5;

/* renamed from: r5.e */
/* loaded from: classes.dex */
public final class C5792e {

    /* renamed from: a */
    public static final java.util.regex.Pattern f22447a = null;

    /* renamed from: b */
    public static final java.util.regex.Pattern f22448b = null;

    /* renamed from: c */
    public static final java.util.Map<java.lang.String, java.lang.Integer> f22449c = null;

    /* renamed from: d */
    public static final java.util.Map<java.lang.String, java.lang.Integer> f22450d = null;

    /* renamed from: r5.e$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: r5.e$b */
    public static class b {

        /* renamed from: c */
        public static final /* synthetic */ int f22451c = 0;

        /* renamed from: a */
        public final p305r5.C5792e.c f22452a;

        /* renamed from: b */
        public final int f22453b;

        public b(p305r5.C5792e.c r1, int r2, p305r5.C5792e.a r3) {
                r0 = this;
                r0.<init>()
                r0.f22452a = r1
                r0.f22453b = r2
                return
        }
    }

    /* renamed from: r5.e$c */
    public static final class c {

        /* renamed from: a */
        public final java.lang.String f22454a;

        /* renamed from: b */
        public final int f22455b;

        /* renamed from: c */
        public final java.lang.String f22456c;

        /* renamed from: d */
        public final java.util.Set<java.lang.String> f22457d;

        public c(java.lang.String r1, int r2, java.lang.String r3, java.util.Set<java.lang.String> r4) {
                r0 = this;
                r0.<init>()
                r0.f22455b = r2
                r0.f22454a = r1
                r0.f22456c = r3
                r0.f22457d = r4
                return
        }
    }

    /* renamed from: r5.e$d */
    public static final class d implements java.lang.Comparable<p305r5.C5792e.d> {

        /* renamed from: Y */
        public final int f22458Y;

        /* renamed from: Z */
        public final p305r5.C5790c f22459Z;

        public d(int r1, p305r5.C5790c r2) {
                r0 = this;
                r0.<init>()
                r0.f22458Y = r1
                r0.f22459Z = r2
                return
        }

        @Override // java.lang.Comparable
        public int compareTo(p305r5.C5792e.d r2) {
                r1 = this;
                r5.e$d r2 = (p305r5.C5792e.d) r2
                int r0 = r1.f22458Y
                int r2 = r2.f22458Y
                int r2 = java.lang.Integer.compare(r0, r2)
                return r2
        }
    }

    /* renamed from: r5.e$e */
    public static final class e {

        /* renamed from: a */
        public long f22460a;

        /* renamed from: b */
        public long f22461b;

        /* renamed from: c */
        public java.lang.CharSequence f22462c;

        /* renamed from: d */
        public int f22463d;

        /* renamed from: e */
        public float f22464e;

        /* renamed from: f */
        public int f22465f;

        /* renamed from: g */
        public int f22466g;

        /* renamed from: h */
        public float f22467h;

        /* renamed from: i */
        public int f22468i;

        /* renamed from: j */
        public float f22469j;

        /* renamed from: k */
        public int f22470k;

        public e() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f22460a = r0
                r2.f22461b = r0
                r0 = 2
                r2.f22463d = r0
                r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                r2.f22464e = r0
                r1 = 1
                r2.f22465f = r1
                r1 = 0
                r2.f22466g = r1
                r2.f22467h = r0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2.f22468i = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r2.f22469j = r1
                r2.f22470k = r0
                return
        }

        /* renamed from: a */
        public p143i5.C3077a.b m12156a() {
                r13 = this;
                float r0 = r13.f22467h
                r1 = 1056964608(0x3f000000, float:0.5)
                r2 = 0
                r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                r4 = 1065353216(0x3f800000, float:1.0)
                r5 = 5
                r6 = 4
                int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r7 == 0) goto L11
                goto L1e
            L11:
                int r0 = r13.f22463d
                if (r0 == r6) goto L1d
                if (r0 == r5) goto L1a
                r0 = 1056964608(0x3f000000, float:0.5)
                goto L1e
            L1a:
                r0 = 1065353216(0x3f800000, float:1.0)
                goto L1e
            L1d:
                r0 = 0
            L1e:
                int r7 = r13.f22468i
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 3
                r10 = 2
                r11 = 1
                if (r7 == r8) goto L28
                goto L37
            L28:
                int r7 = r13.f22463d
                if (r7 == r11) goto L36
                if (r7 == r9) goto L34
                if (r7 == r6) goto L36
                if (r7 == r5) goto L34
                r7 = 1
                goto L37
            L34:
                r7 = 2
                goto L37
            L36:
                r7 = 0
            L37:
                i5.a$b r8 = new i5.a$b
                r8.<init>()
                int r12 = r13.f22463d
                if (r12 == r11) goto L59
                if (r12 == r10) goto L56
                if (r12 == r9) goto L53
                if (r12 == r6) goto L59
                if (r12 == r5) goto L53
                r5 = 34
                java.lang.String r6 = "Unknown textAlignment: "
                java.lang.String r9 = "WebvttCueParser"
                p088f4.C1999d.m5182a(r5, r6, r12, r9)
                r5 = 0
                goto L5b
            L53:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L5b
            L56:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L5b
            L59:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            L5b:
                r8.f12405c = r5
                float r5 = r13.f22464e
                int r6 = r13.f22465f
                int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r9 == 0) goto L70
                if (r6 != 0) goto L70
                int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r2 < 0) goto L76
                int r2 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r2 <= 0) goto L70
                goto L76
            L70:
                if (r9 == 0) goto L74
                r3 = r5
                goto L78
            L74:
                if (r6 != 0) goto L78
            L76:
                r3 = 1065353216(0x3f800000, float:1.0)
            L78:
                r8.f12407e = r3
                r8.f12408f = r6
                int r2 = r13.f22466g
                r8.f12409g = r2
                r8.f12410h = r0
                r8.f12411i = r7
                float r2 = r13.f22469j
                if (r7 == 0) goto La4
                if (r7 == r11) goto L97
                if (r7 != r10) goto L8d
                goto La6
            L8d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = java.lang.String.valueOf(r7)
                r0.<init>(r1)
                throw r0
            L97:
                r3 = 1073741824(0x40000000, float:2.0)
                int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r1 > 0) goto La0
                float r0 = r0 * r3
                goto La6
            La0:
                float r4 = r4 - r0
                float r0 = r4 * r3
                goto La6
            La4:
                float r0 = r4 - r0
            La6:
                float r0 = java.lang.Math.min(r2, r0)
                r8.f12414l = r0
                int r0 = r13.f22470k
                r8.f12418p = r0
                java.lang.CharSequence r0 = r13.f22462c
                if (r0 == 0) goto Lb6
                r8.f12403a = r0
            Lb6:
                return r8
        }
    }

    static {
            java.lang.String r0 = "^(\\S+)\\s+-->\\s+(\\S+)(.*)?$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p305r5.C5792e.f22447a = r0
            java.lang.String r0 = "(\\S+?):(\\S+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p305r5.C5792e.f22448b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 255(0xff, float:3.57E-43)
            int r2 = android.graphics.Color.rgb(r1, r1, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "white"
            r0.put(r3, r2)
            r2 = 0
            int r3 = android.graphics.Color.rgb(r2, r1, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "lime"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r2, r1, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "cyan"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r2, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "red"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r1, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "yellow"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r2, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "magenta"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r2, r2, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "blue"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r2, r2, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "black"
            r0.put(r4, r3)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            p305r5.C5792e.f22449c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r3 = android.graphics.Color.rgb(r1, r1, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_white"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r2, r1, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_lime"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r2, r1, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_cyan"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r2, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_red"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r1, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_yellow"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r2, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_magenta"
            r0.put(r4, r3)
            int r1 = android.graphics.Color.rgb(r2, r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "bg_blue"
            r0.put(r3, r1)
            int r1 = android.graphics.Color.rgb(r2, r2, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "bg_black"
            r0.put(r2, r1)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            p305r5.C5792e.f22450d = r0
            return
    }

    /* renamed from: a */
    public static void m12148a(java.lang.String r19, p305r5.C5792e.c r20, java.util.List<p305r5.C5792e.b> r21, android.text.SpannableStringBuilder r22, java.util.List<p305r5.C5790c> r23) {
            r0 = r19
            r1 = r20
            r2 = r22
            r3 = r23
            int r4 = r1.f22455b
            int r5 = r22.length()
            java.lang.String r6 = r1.f22454a
            java.util.Objects.requireNonNull(r6)
            int r7 = r6.hashCode()
            r9 = 2
            r10 = -1
            if (r7 == 0) goto L87
            r13 = 105(0x69, float:1.47E-43)
            if (r7 == r13) goto L7c
            r13 = 3314158(0x3291ee, float:4.644125E-39)
            if (r7 == r13) goto L71
            r13 = 3511770(0x3595da, float:4.921038E-39)
            if (r7 == r13) goto L66
            r13 = 98
            if (r7 == r13) goto L5b
            r13 = 99
            if (r7 == r13) goto L50
            r13 = 117(0x75, float:1.64E-43)
            if (r7 == r13) goto L45
            r13 = 118(0x76, float:1.65E-43)
            if (r7 == r13) goto L3a
            goto L8f
        L3a:
            java.lang.String r7 = "v"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L43
            goto L8f
        L43:
            r6 = 5
            goto L92
        L45:
            java.lang.String r7 = "u"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L4e
            goto L8f
        L4e:
            r6 = 4
            goto L92
        L50:
            java.lang.String r7 = "c"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L59
            goto L8f
        L59:
            r6 = 2
            goto L92
        L5b:
            java.lang.String r7 = "b"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L64
            goto L8f
        L64:
            r6 = 1
            goto L92
        L66:
            java.lang.String r7 = "ruby"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L6f
            goto L8f
        L6f:
            r6 = 7
            goto L92
        L71:
            java.lang.String r7 = "lang"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L7a
            goto L8f
        L7a:
            r6 = 6
            goto L92
        L7c:
            java.lang.String r7 = "i"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L85
            goto L8f
        L85:
            r6 = 3
            goto L92
        L87:
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L91
        L8f:
            r6 = -1
            goto L92
        L91:
            r6 = 0
        L92:
            r7 = 33
            switch(r6) {
                case 0: goto L165;
                case 1: goto L15c;
                case 2: goto L117;
                case 3: goto L111;
                case 4: goto L10b;
                case 5: goto L165;
                case 6: goto L165;
                case 7: goto L98;
                default: goto L97;
            }
        L97:
            return
        L98:
            int r6 = m12150c(r3, r0, r1)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r21.size()
            r13.<init>(r14)
            r14 = r21
            r13.addAll(r14)
            int r14 = p305r5.C5792e.b.f22451c
            r5.f r14 = p305r5.C5793f.f22471Z
            java.util.Collections.sort(r13, r14)
            int r14 = r1.f22455b
            r15 = 0
            r16 = 0
        Lb6:
            int r11 = r13.size()
            if (r15 >= r11) goto L165
            java.lang.Object r11 = r13.get(r15)
            r5.e$b r11 = (p305r5.C5792e.b) r11
            r5.e$c r11 = r11.f22452a
            java.lang.String r11 = r11.f22454a
            java.lang.String r8 = "rt"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto Lcf
            goto L107
        Lcf:
            java.lang.Object r8 = r13.get(r15)
            r5.e$b r8 = (p305r5.C5792e.b) r8
            r5.e$c r11 = r8.f22452a
            int r11 = m12150c(r3, r0, r11)
            if (r11 == r10) goto Lde
            goto Le3
        Lde:
            if (r6 == r10) goto Le2
            r11 = r6
            goto Le3
        Le2:
            r11 = 1
        Le3:
            r5.e$c r10 = r8.f22452a
            int r10 = r10.f22455b
            int r10 = r10 - r16
            int r8 = r8.f22453b
            int r8 = r8 - r16
            java.lang.CharSequence r17 = r2.subSequence(r10, r8)
            r2.delete(r10, r8)
            m5.c r8 = new m5.c
            java.lang.String r12 = r17.toString()
            r8.<init>(r12, r11)
            r2.setSpan(r8, r14, r10, r7)
            int r8 = r17.length()
            int r16 = r8 + r16
            r14 = r10
        L107:
            int r15 = r15 + 1
            r10 = -1
            goto Lb6
        L10b:
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            goto L162
        L111:
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r9)
            goto L162
        L117:
            java.util.Set<java.lang.String> r6 = r1.f22457d
            java.util.Iterator r6 = r6.iterator()
        L11d:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L165
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map<java.lang.String, java.lang.Integer> r10 = p305r5.C5792e.f22449c
            boolean r11 = r10.containsKey(r8)
            if (r11 == 0) goto L141
            java.lang.Object r8 = r10.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            android.text.style.ForegroundColorSpan r10 = new android.text.style.ForegroundColorSpan
            r10.<init>(r8)
            goto L158
        L141:
            java.util.Map<java.lang.String, java.lang.Integer> r10 = p305r5.C5792e.f22450d
            boolean r11 = r10.containsKey(r8)
            if (r11 == 0) goto L11d
            java.lang.Object r8 = r10.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            android.text.style.BackgroundColorSpan r10 = new android.text.style.BackgroundColorSpan
            r10.<init>(r8)
        L158:
            r2.setSpan(r10, r4, r5, r7)
            goto L11d
        L15c:
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r8 = 1
            r6.<init>(r8)
        L162:
            r2.setSpan(r6, r4, r5, r7)
        L165:
            java.util.List r0 = m12149b(r3, r0, r1)
            r1 = 0
        L16a:
            r3 = r0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r6 = r3.size()
            if (r1 >= r6) goto L23c
            java.lang.Object r3 = r3.get(r1)
            r5.e$d r3 = (p305r5.C5792e.d) r3
            r5.c r3 = r3.f22459Z
            if (r3 != 0) goto L182
            r8 = -1
            r10 = 3
            r12 = 1
            goto L238
        L182:
            int r6 = r3.m12147a()
            r8 = -1
            if (r6 == r8) goto L195
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            int r10 = r3.m12147a()
            r6.<init>(r10)
            p064e.C1487a.m4023a(r2, r6, r4, r5, r7)
        L195:
            int r6 = r3.f22436j
            r10 = 1
            if (r6 != r10) goto L19d
            r18 = 1
            goto L19f
        L19d:
            r18 = 0
        L19f:
            if (r18 == 0) goto L1a9
            android.text.style.StrikethroughSpan r6 = new android.text.style.StrikethroughSpan
            r6.<init>()
            r2.setSpan(r6, r4, r5, r7)
        L1a9:
            int r6 = r3.f22437k
            if (r6 != r10) goto L1af
            r6 = 1
            goto L1b0
        L1af:
            r6 = 0
        L1b0:
            if (r6 == 0) goto L1ba
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r2.setSpan(r6, r4, r5, r7)
        L1ba:
            boolean r6 = r3.f22433g
            if (r6 == 0) goto L1d5
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            boolean r10 = r3.f22433g
            if (r10 == 0) goto L1cd
            int r10 = r3.f22432f
            r6.<init>(r10)
            p064e.C1487a.m4023a(r2, r6, r4, r5, r7)
            goto L1d5
        L1cd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Font color not defined"
            r0.<init>(r1)
            throw r0
        L1d5:
            boolean r6 = r3.f22435i
            if (r6 == 0) goto L1f0
            android.text.style.BackgroundColorSpan r6 = new android.text.style.BackgroundColorSpan
            boolean r10 = r3.f22435i
            if (r10 == 0) goto L1e8
            int r10 = r3.f22434h
            r6.<init>(r10)
            p064e.C1487a.m4023a(r2, r6, r4, r5, r7)
            goto L1f0
        L1e8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Background color not defined."
            r0.<init>(r1)
            throw r0
        L1f0:
            java.lang.String r6 = r3.f22431e
            if (r6 == 0) goto L1fe
            android.text.style.TypefaceSpan r6 = new android.text.style.TypefaceSpan
            java.lang.String r10 = r3.f22431e
            r6.<init>(r10)
            p064e.C1487a.m4023a(r2, r6, r4, r5, r7)
        L1fe:
            int r6 = r3.f22440n
            r10 = 1
            if (r6 == r10) goto L21f
            if (r6 == r9) goto L215
            r10 = 3
            if (r6 == r10) goto L20a
            r12 = 1
            goto L22c
        L20a:
            android.text.style.RelativeSizeSpan r6 = new android.text.style.RelativeSizeSpan
            float r11 = r3.f22441o
            r12 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 / r12
            r6.<init>(r11)
            goto L21d
        L215:
            r10 = 3
            android.text.style.RelativeSizeSpan r6 = new android.text.style.RelativeSizeSpan
            float r11 = r3.f22441o
            r6.<init>(r11)
        L21d:
            r12 = 1
            goto L229
        L21f:
            r10 = 3
            android.text.style.AbsoluteSizeSpan r6 = new android.text.style.AbsoluteSizeSpan
            float r11 = r3.f22441o
            int r11 = (int) r11
            r12 = 1
            r6.<init>(r11, r12)
        L229:
            p064e.C1487a.m4023a(r2, r6, r4, r5, r7)
        L22c:
            boolean r3 = r3.f22443q
            if (r3 == 0) goto L238
            m5.a r3 = new m5.a
            r3.<init>()
            r2.setSpan(r3, r4, r5, r7)
        L238:
            int r1 = r1 + 1
            goto L16a
        L23c:
            return
    }

    /* renamed from: b */
    public static java.util.List<p305r5.C5792e.d> m12149b(java.util.List<p305r5.C5790c> r10, java.lang.String r11, p305r5.C5792e.c r12) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r10.size()
            if (r2 >= r3) goto L78
            java.lang.Object r3 = r10.get(r2)
            r5.c r3 = (p305r5.C5790c) r3
            java.lang.String r4 = r12.f22454a
            java.util.Set<java.lang.String> r5 = r12.f22457d
            java.lang.String r6 = r12.f22456c
            java.lang.String r7 = r3.f22427a
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L3e
            java.lang.String r7 = r3.f22428b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L3e
            java.util.Set<java.lang.String> r7 = r3.f22429c
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L3e
            java.lang.String r7 = r3.f22430d
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L3e
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            goto L6b
        L3e:
            java.lang.String r7 = r3.f22427a
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = p305r5.C5790c.m12146b(r1, r7, r11, r8)
            java.lang.String r8 = r3.f22428b
            r9 = 2
            int r4 = p305r5.C5790c.m12146b(r7, r8, r4, r9)
            java.lang.String r7 = r3.f22430d
            r8 = 4
            int r4 = p305r5.C5790c.m12146b(r4, r7, r6, r8)
            r6 = -1
            if (r4 == r6) goto L6a
            java.util.Set<java.lang.String> r6 = r3.f22429c
            boolean r5 = r5.containsAll(r6)
            if (r5 != 0) goto L60
            goto L6a
        L60:
            java.util.Set<java.lang.String> r5 = r3.f22429c
            int r5 = r5.size()
            int r5 = r5 * 4
            int r4 = r4 + r5
            goto L6b
        L6a:
            r4 = 0
        L6b:
            if (r4 <= 0) goto L75
            r5.e$d r5 = new r5.e$d
            r5.<init>(r4, r3)
            r0.add(r5)
        L75:
            int r2 = r2 + 1
            goto L7
        L78:
            java.util.Collections.sort(r0)
            return r0
    }

    /* renamed from: c */
    public static int m12150c(java.util.List<p305r5.C5790c> r2, java.lang.String r3, p305r5.C5792e.c r4) {
            java.util.List r2 = m12149b(r2, r3, r4)
            r3 = 0
        L5:
            r4 = r2
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r0 = r4.size()
            r1 = -1
            if (r3 >= r0) goto L1f
            java.lang.Object r4 = r4.get(r3)
            r5.e$d r4 = (p305r5.C5792e.d) r4
            r5.c r4 = r4.f22459Z
            int r4 = r4.f22442p
            if (r4 == r1) goto L1c
            return r4
        L1c:
            int r3 = r3 + 1
            goto L5
        L1f:
            return r1
    }

    /* renamed from: d */
    public static p305r5.C5791d m12151d(java.lang.String r7, java.util.regex.Matcher r8, p371v5.C6571u r9, java.util.List<p305r5.C5790c> r10) {
            r5.e$e r0 = new r5.e$e
            r0.<init>()
            r1 = 1
            java.lang.String r1 = r8.group(r1)     // Catch: java.lang.NumberFormatException -> L6b
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.NumberFormatException -> L6b
            long r1 = p305r5.C5795h.m12158b(r1)     // Catch: java.lang.NumberFormatException -> L6b
            r0.f22460a = r1     // Catch: java.lang.NumberFormatException -> L6b
            r1 = 2
            java.lang.String r1 = r8.group(r1)     // Catch: java.lang.NumberFormatException -> L6b
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.NumberFormatException -> L6b
            long r1 = p305r5.C5795h.m12158b(r1)     // Catch: java.lang.NumberFormatException -> L6b
            r0.f22461b = r1     // Catch: java.lang.NumberFormatException -> L6b
            r1 = 3
            java.lang.String r8 = r8.group(r1)
            java.util.Objects.requireNonNull(r8)
            m12152e(r8, r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
        L31:
            java.lang.String r1 = r9.m13404g()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L4e
            int r2 = r8.length()
            if (r2 <= 0) goto L46
            java.lang.String r2 = "\n"
            r8.append(r2)
        L46:
            java.lang.String r1 = r1.trim()
            r8.append(r1)
            goto L31
        L4e:
            java.lang.String r8 = r8.toString()
            android.text.SpannedString r7 = m12153f(r7, r8, r10)
            r0.f22462c = r7
            r5.d r7 = new r5.d
            i5.a$b r8 = r0.m12156a()
            i5.a r2 = r8.m7535a()
            long r3 = r0.f22460a
            long r5 = r0.f22461b
            r1 = r7
            r1.<init>(r2, r3, r5)
            return r7
        L6b:
            java.lang.String r7 = "Skipping cue with bad header: "
            java.lang.String r8 = r8.group()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r8.length()
            if (r9 == 0) goto L81
            java.lang.String r7 = r7.concat(r8)
            goto L87
        L81:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r7)
            r7 = r8
        L87:
            java.lang.String r8 = "WebvttCueParser"
            android.util.Log.w(r8, r7)
            r7 = 0
            return r7
    }

    /* renamed from: e */
    public static void m12152e(java.lang.String r9, p305r5.C5792e.e r10) {
            java.lang.String r0 = "WebvttCueParser"
            java.util.regex.Pattern r1 = p305r5.C5792e.f22448b
            java.util.regex.Matcher r9 = r1.matcher(r9)
        L8:
            boolean r1 = r9.find()
            if (r1 == 0) goto L141
            r1 = 1
            java.lang.String r2 = r9.group(r1)
            java.util.Objects.requireNonNull(r2)
            r3 = 2
            java.lang.String r4 = r9.group(r3)
            java.util.Objects.requireNonNull(r4)
            java.lang.String r5 = "line"
            boolean r5 = r5.equals(r2)     // Catch: java.lang.NumberFormatException -> L120
            if (r5 == 0) goto L2a
            m12154g(r4, r10)     // Catch: java.lang.NumberFormatException -> L120
            goto L8
        L2a:
            java.lang.String r5 = "align"
            boolean r5 = r5.equals(r2)     // Catch: java.lang.NumberFormatException -> L120
            if (r5 == 0) goto La4
            r2 = -1
            int r5 = r4.hashCode()
            r6 = 5
            r7 = 4
            r8 = 3
            switch(r5) {
                case -1364013995: goto L75;
                case -1074341483: goto L6a;
                case 100571: goto L5f;
                case 3317767: goto L54;
                case 108511772: goto L49;
                case 109757538: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L7f
        L3e:
            java.lang.String r5 = "start"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L47
            goto L7f
        L47:
            r2 = 5
            goto L7f
        L49:
            java.lang.String r5 = "right"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L52
            goto L7f
        L52:
            r2 = 4
            goto L7f
        L54:
            java.lang.String r5 = "left"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L5d
            goto L7f
        L5d:
            r2 = 3
            goto L7f
        L5f:
            java.lang.String r5 = "end"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L68
            goto L7f
        L68:
            r2 = 2
            goto L7f
        L6a:
            java.lang.String r5 = "middle"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L73
            goto L7f
        L73:
            r2 = 1
            goto L7f
        L75:
            java.lang.String r5 = "center"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L7e
            goto L7f
        L7e:
            r2 = 0
        L7f:
            switch(r2) {
                case 0: goto L9f;
                case 1: goto L9f;
                case 2: goto L9d;
                case 3: goto L9b;
                case 4: goto L99;
                case 5: goto La0;
                default: goto L82;
            }
        L82:
            java.lang.String r1 = "Invalid alignment value: "
            int r2 = r4.length()     // Catch: java.lang.NumberFormatException -> L120
            if (r2 == 0) goto L8f
            java.lang.String r1 = r1.concat(r4)     // Catch: java.lang.NumberFormatException -> L120
            goto L95
        L8f:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.NumberFormatException -> L120
            r2.<init>(r1)     // Catch: java.lang.NumberFormatException -> L120
            r1 = r2
        L95:
            android.util.Log.w(r0, r1)     // Catch: java.lang.NumberFormatException -> L120
            goto L9f
        L99:
            r1 = 5
            goto La0
        L9b:
            r1 = 4
            goto La0
        L9d:
            r1 = 3
            goto La0
        L9f:
            r1 = 2
        La0:
            r10.f22463d = r1     // Catch: java.lang.NumberFormatException -> L120
            goto L8
        La4:
            java.lang.String r5 = "position"
            boolean r5 = r5.equals(r2)     // Catch: java.lang.NumberFormatException -> L120
            if (r5 == 0) goto Lb1
            m12155h(r4, r10)     // Catch: java.lang.NumberFormatException -> L120
            goto L8
        Lb1:
            java.lang.String r5 = "size"
            boolean r5 = r5.equals(r2)     // Catch: java.lang.NumberFormatException -> L120
            if (r5 == 0) goto Lc1
            float r1 = p305r5.C5795h.m12157a(r4)     // Catch: java.lang.NumberFormatException -> L120
            r10.f22469j = r1     // Catch: java.lang.NumberFormatException -> L120
            goto L8
        Lc1:
            java.lang.String r5 = "vertical"
            boolean r5 = r5.equals(r2)     // Catch: java.lang.NumberFormatException -> L120
            if (r5 == 0) goto Lf7
            java.lang.String r2 = "lr"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.NumberFormatException -> L120
            if (r2 != 0) goto Lf2
            java.lang.String r2 = "rl"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.NumberFormatException -> L120
            if (r2 != 0) goto Lf3
            java.lang.String r1 = "Invalid 'vertical' value: "
            int r2 = r4.length()     // Catch: java.lang.NumberFormatException -> L120
            if (r2 == 0) goto Le6
            java.lang.String r1 = r1.concat(r4)     // Catch: java.lang.NumberFormatException -> L120
            goto Lec
        Le6:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.NumberFormatException -> L120
            r2.<init>(r1)     // Catch: java.lang.NumberFormatException -> L120
            r1 = r2
        Lec:
            android.util.Log.w(r0, r1)     // Catch: java.lang.NumberFormatException -> L120
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            goto Lf3
        Lf2:
            r1 = 2
        Lf3:
            r10.f22470k = r1     // Catch: java.lang.NumberFormatException -> L120
            goto L8
        Lf7:
            int r1 = r2.length()     // Catch: java.lang.NumberFormatException -> L120
            int r1 = r1 + 21
            int r3 = r4.length()     // Catch: java.lang.NumberFormatException -> L120
            int r1 = r1 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L120
            r3.<init>(r1)     // Catch: java.lang.NumberFormatException -> L120
            java.lang.String r1 = "Unknown cue setting "
            r3.append(r1)     // Catch: java.lang.NumberFormatException -> L120
            r3.append(r2)     // Catch: java.lang.NumberFormatException -> L120
            java.lang.String r1 = ":"
            r3.append(r1)     // Catch: java.lang.NumberFormatException -> L120
            r3.append(r4)     // Catch: java.lang.NumberFormatException -> L120
            java.lang.String r1 = r3.toString()     // Catch: java.lang.NumberFormatException -> L120
            android.util.Log.w(r0, r1)     // Catch: java.lang.NumberFormatException -> L120
            goto L8
        L120:
            java.lang.String r1 = "Skipping bad cue setting: "
            java.lang.String r2 = r9.group()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L136
            java.lang.String r1 = r1.concat(r2)
            goto L13c
        L136:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L13c:
            android.util.Log.w(r0, r1)
            goto L8
        L141:
            return
    }

    /* renamed from: f */
    public static android.text.SpannedString m12153f(java.lang.String r17, java.lang.String r18, java.util.List<p305r5.C5790c> r19) {
            r0 = r17
            r1 = r18
            r2 = r19
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r7 = 0
        L17:
            int r8 = r18.length()
            java.lang.String r9 = ""
            if (r7 >= r8) goto L217
            char r8 = r1.charAt(r7)
            java.lang.String r10 = " "
            r11 = 62
            r13 = 60
            r14 = 38
            r15 = 2
            r12 = -1
            r16 = 1
            if (r8 == r14) goto L182
            if (r8 == r13) goto L39
            r3.append(r8)
            int r7 = r7 + 1
            goto L17
        L39:
            int r8 = r7 + 1
            int r13 = r18.length()
            if (r8 < r13) goto L43
            goto L104
        L43:
            char r13 = r1.charAt(r8)
            r14 = 47
            if (r13 != r14) goto L4d
            r13 = 1
            goto L4e
        L4d:
            r13 = 0
        L4e:
            int r8 = r1.indexOf(r11, r8)
            if (r8 != r12) goto L59
            int r8 = r18.length()
            goto L5b
        L59:
            int r8 = r8 + 1
        L5b:
            int r11 = r8 + (-2)
            char r12 = r1.charAt(r11)
            if (r12 != r14) goto L65
            r12 = 1
            goto L66
        L65:
            r12 = 0
        L66:
            if (r13 == 0) goto L6a
            r14 = 2
            goto L6b
        L6a:
            r14 = 1
        L6b:
            int r7 = r7 + r14
            if (r12 == 0) goto L6f
            goto L71
        L6f:
            int r11 = r8 + (-1)
        L71:
            java.lang.String r7 = r1.substring(r7, r11)
            java.lang.String r11 = r7.trim()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L81
            goto L104
        L81:
            java.lang.String r11 = r7.trim()
            boolean r14 = r11.isEmpty()
            r14 = r14 ^ 1
            p371v5.C6549a.m13288b(r14)
            int r14 = p371v5.C6552b0.f25624a
            java.lang.String r14 = "[ \\.]"
            java.lang.String[] r11 = r11.split(r14, r15)
            r11 = r11[r6]
            java.util.Objects.requireNonNull(r11)
            int r14 = r11.hashCode()
            switch(r14) {
                case 98: goto Lf2;
                case 99: goto Le7;
                case 105: goto Ldc;
                case 117: goto Ld1;
                case 118: goto Lc6;
                case 3650: goto Lbb;
                case 3314158: goto Lb0;
                case 3511770: goto La5;
                default: goto La2;
            }
        La2:
            r14 = -1
            goto Lfc
        La5:
            java.lang.String r14 = "ruby"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto Lae
            goto La2
        Lae:
            r14 = 7
            goto Lfc
        Lb0:
            java.lang.String r14 = "lang"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto Lb9
            goto La2
        Lb9:
            r14 = 6
            goto Lfc
        Lbb:
            java.lang.String r14 = "rt"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto Lc4
            goto La2
        Lc4:
            r14 = 5
            goto Lfc
        Lc6:
            java.lang.String r14 = "v"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto Lcf
            goto La2
        Lcf:
            r14 = 4
            goto Lfc
        Ld1:
            java.lang.String r14 = "u"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto Lda
            goto La2
        Lda:
            r14 = 3
            goto Lfc
        Ldc:
            java.lang.String r14 = "i"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto Le5
            goto La2
        Le5:
            r14 = 2
            goto Lfc
        Le7:
            java.lang.String r14 = "c"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto Lf0
            goto La2
        Lf0:
            r14 = 1
            goto Lfc
        Lf2:
            java.lang.String r14 = "b"
            boolean r14 = r11.equals(r14)
            if (r14 != 0) goto Lfb
            goto La2
        Lfb:
            r14 = 0
        Lfc:
            switch(r14) {
                case 0: goto L101;
                case 1: goto L101;
                case 2: goto L101;
                case 3: goto L101;
                case 4: goto L101;
                case 5: goto L101;
                case 6: goto L101;
                case 7: goto L101;
                default: goto Lff;
            }
        Lff:
            r14 = 0
            goto L102
        L101:
            r14 = 1
        L102:
            if (r14 != 0) goto L107
        L104:
            r7 = r8
            goto L17
        L107:
            if (r13 == 0) goto L139
        L109:
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L110
            goto L104
        L110:
            java.lang.Object r7 = r4.pop()
            r5.e$c r7 = (p305r5.C5792e.c) r7
            m12148a(r0, r7, r5, r3, r2)
            boolean r9 = r4.isEmpty()
            if (r9 != 0) goto L12d
            r5.e$b r9 = new r5.e$b
            int r10 = r3.length()
            r12 = 0
            r9.<init>(r7, r10, r12)
            r5.add(r9)
            goto L130
        L12d:
            r5.clear()
        L130:
            java.lang.String r7 = r7.f22454a
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L109
            goto L104
        L139:
            if (r12 != 0) goto L104
            int r11 = r3.length()
            java.lang.String r7 = r7.trim()
            boolean r12 = r7.isEmpty()
            r12 = r12 ^ 1
            p371v5.C6549a.m13288b(r12)
            int r10 = r7.indexOf(r10)
            r12 = -1
            if (r10 != r12) goto L154
            goto L160
        L154:
            java.lang.String r9 = r7.substring(r10)
            java.lang.String r9 = r9.trim()
            java.lang.String r7 = r7.substring(r6, r10)
        L160:
            java.lang.String r10 = "\\."
            java.lang.String[] r7 = p371v5.C6552b0.m13303G(r7, r10)
            r10 = r7[r6]
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            r13 = 1
        L16e:
            int r14 = r7.length
            if (r13 >= r14) goto L179
            r14 = r7[r13]
            r12.add(r14)
            int r13 = r13 + 1
            goto L16e
        L179:
            r5.e$c r7 = new r5.e$c
            r7.<init>(r10, r11, r9, r12)
            r4.push(r7)
            goto L104
        L182:
            r9 = 59
            int r7 = r7 + 1
            int r9 = r1.indexOf(r9, r7)
            r12 = 32
            int r11 = r1.indexOf(r12, r7)
            r12 = -1
            if (r9 != r12) goto L195
            r9 = r11
            goto L19c
        L195:
            if (r11 != r12) goto L198
            goto L19c
        L198:
            int r9 = java.lang.Math.min(r9, r11)
        L19c:
            if (r9 == r12) goto L212
            java.lang.String r7 = r1.substring(r7, r9)
            java.util.Objects.requireNonNull(r7)
            int r8 = r7.hashCode()
            switch(r8) {
                case 3309: goto L1ce;
                case 3464: goto L1c3;
                case 96708: goto L1b8;
                case 3374865: goto L1ad;
                default: goto L1ac;
            }
        L1ac:
            goto L1d8
        L1ad:
            java.lang.String r8 = "nbsp"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L1b6
            goto L1d8
        L1b6:
            r12 = 3
            goto L1d8
        L1b8:
            java.lang.String r8 = "amp"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L1c1
            goto L1d8
        L1c1:
            r12 = 2
            goto L1d8
        L1c3:
            java.lang.String r8 = "lt"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L1cc
            goto L1d8
        L1cc:
            r12 = 1
            goto L1d8
        L1ce:
            java.lang.String r8 = "gt"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L1d7
            goto L1d8
        L1d7:
            r12 = 0
        L1d8:
            switch(r12) {
                case 0: goto L203;
                case 1: goto L205;
                case 2: goto L200;
                case 3: goto L1fd;
                default: goto L1db;
            }
        L1db:
            int r8 = r7.length()
            int r8 = r8 + 33
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r8)
            java.lang.String r8 = "ignoring unsupported entity: '&"
            r12.append(r8)
            r12.append(r7)
            java.lang.String r7 = ";'"
            r12.append(r7)
            java.lang.String r7 = r12.toString()
            java.lang.String r8 = "WebvttCueParser"
            android.util.Log.w(r8, r7)
            goto L208
        L1fd:
            r13 = 32
            goto L205
        L200:
            r13 = 38
            goto L205
        L203:
            r13 = 62
        L205:
            r3.append(r13)
        L208:
            if (r9 != r11) goto L20d
            r3.append(r10)
        L20d:
            int r9 = r9 + 1
            r7 = r9
            goto L17
        L212:
            r3.append(r8)
            goto L17
        L217:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L227
            java.lang.Object r1 = r4.pop()
            r5.e$c r1 = (p305r5.C5792e.c) r1
            m12148a(r0, r1, r5, r3, r2)
            goto L217
        L227:
            r5.e$c r1 = new r5.e$c
            java.util.Set r4 = java.util.Collections.emptySet()
            r1.<init>(r9, r6, r9, r4)
            java.util.List r4 = java.util.Collections.emptyList()
            m12148a(r0, r1, r4, r3, r2)
            android.text.SpannedString r0 = android.text.SpannedString.valueOf(r3)
            return r0
    }

    /* renamed from: g */
    public static void m12154g(java.lang.String r7, p305r5.C5792e.e r8) {
            r0 = 44
            int r0 = r7.indexOf(r0)
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L6f
            int r4 = r0 + 1
            java.lang.String r4 = r7.substring(r4)
            java.util.Objects.requireNonNull(r4)
            int r5 = r4.hashCode()
            r6 = 2
            switch(r5) {
                case -1364013995: goto L3e;
                case -1074341483: goto L33;
                case 100571: goto L28;
                case 109757538: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L48
        L1d:
            java.lang.String r5 = "start"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L26
            goto L48
        L26:
            r1 = 3
            goto L48
        L28:
            java.lang.String r5 = "end"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L31
            goto L48
        L31:
            r1 = 2
            goto L48
        L33:
            java.lang.String r5 = "middle"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L3c
            goto L48
        L3c:
            r1 = 1
            goto L48
        L3e:
            java.lang.String r5 = "center"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L47
            goto L48
        L47:
            r1 = 0
        L48:
            switch(r1) {
                case 0: goto L68;
                case 1: goto L68;
                case 2: goto L69;
                case 3: goto L66;
                default: goto L4b;
            }
        L4b:
            java.lang.String r1 = "Invalid anchor value: "
            int r5 = r4.length()
            if (r5 == 0) goto L58
            java.lang.String r1 = r1.concat(r4)
            goto L5e
        L58:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
            r1 = r4
        L5e:
            java.lang.String r4 = "WebvttCueParser"
            android.util.Log.w(r4, r1)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L69
        L66:
            r6 = 0
            goto L69
        L68:
            r6 = 1
        L69:
            r8.f22466g = r6
            java.lang.String r7 = r7.substring(r2, r0)
        L6f:
            java.lang.String r0 = "%"
            boolean r0 = r7.endsWith(r0)
            if (r0 == 0) goto L80
            float r7 = p305r5.C5795h.m12157a(r7)
            r8.f22464e = r7
            r8.f22465f = r2
            goto L89
        L80:
            int r7 = java.lang.Integer.parseInt(r7)
            float r7 = (float) r7
            r8.f22464e = r7
            r8.f22465f = r3
        L89:
            return
    }

    /* renamed from: h */
    public static void m12155h(java.lang.String r7, p305r5.C5792e.e r8) {
            r0 = 44
            int r0 = r7.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto L85
            int r2 = r0 + 1
            java.lang.String r2 = r7.substring(r2)
            java.util.Objects.requireNonNull(r2)
            int r3 = r2.hashCode()
            r4 = 2
            r5 = 0
            r6 = 1
            switch(r3) {
                case -1842484672: goto L54;
                case -1364013995: goto L49;
                case -1276788989: goto L3e;
                case -1074341483: goto L33;
                case 100571: goto L28;
                case 109757538: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L5e
        L1d:
            java.lang.String r3 = "start"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L26
            goto L5e
        L26:
            r1 = 5
            goto L5e
        L28:
            java.lang.String r3 = "end"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L31
            goto L5e
        L31:
            r1 = 4
            goto L5e
        L33:
            java.lang.String r3 = "middle"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3c
            goto L5e
        L3c:
            r1 = 3
            goto L5e
        L3e:
            java.lang.String r3 = "line-right"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L47
            goto L5e
        L47:
            r1 = 2
            goto L5e
        L49:
            java.lang.String r3 = "center"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L52
            goto L5e
        L52:
            r1 = 1
            goto L5e
        L54:
            java.lang.String r3 = "line-left"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L5d
            goto L5e
        L5d:
            r1 = 0
        L5e:
            switch(r1) {
                case 0: goto L7e;
                case 1: goto L7c;
                case 2: goto L7f;
                case 3: goto L7c;
                case 4: goto L7f;
                case 5: goto L7e;
                default: goto L61;
            }
        L61:
            java.lang.String r1 = "Invalid anchor value: "
            int r3 = r2.length()
            if (r3 == 0) goto L6e
            java.lang.String r1 = r1.concat(r2)
            goto L74
        L6e:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L74:
            java.lang.String r2 = "WebvttCueParser"
            android.util.Log.w(r2, r1)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L7f
        L7c:
            r4 = 1
            goto L7f
        L7e:
            r4 = 0
        L7f:
            r8.f22468i = r4
            java.lang.String r7 = r7.substring(r5, r0)
        L85:
            float r7 = p305r5.C5795h.m12157a(r7)
            r8.f22467h = r7
            return
    }
}
