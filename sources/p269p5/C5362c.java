package p269p5;

/* renamed from: p5.c */
/* loaded from: classes.dex */
public final class C5362c extends p143i5.AbstractC3081e {

    /* renamed from: o */
    public static final java.util.regex.Pattern f21302o = null;

    /* renamed from: p */
    public static final java.util.regex.Pattern f21303p = null;

    /* renamed from: q */
    public static final java.util.regex.Pattern f21304q = null;

    /* renamed from: r */
    public static final java.util.regex.Pattern f21305r = null;

    /* renamed from: s */
    public static final java.util.regex.Pattern f21306s = null;

    /* renamed from: t */
    public static final java.util.regex.Pattern f21307t = null;

    /* renamed from: u */
    public static final java.util.regex.Pattern f21308u = null;

    /* renamed from: v */
    public static final p269p5.C5362c.b f21309v = null;

    /* renamed from: w */
    public static final p269p5.C5362c.a f21310w = null;

    /* renamed from: n */
    public final org.xmlpull.v1.XmlPullParserFactory f21311n;

    /* renamed from: p5.c$a */
    public static final class a {

        /* renamed from: a */
        public final int f21312a;

        public a(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f21312a = r2
                return
        }
    }

    /* renamed from: p5.c$b */
    public static final class b {

        /* renamed from: a */
        public final float f21313a;

        /* renamed from: b */
        public final int f21314b;

        /* renamed from: c */
        public final int f21315c;

        public b(float r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f21313a = r1
                r0.f21314b = r2
                r0.f21315c = r3
                return
        }
    }

    /* renamed from: p5.c$c */
    public static final class c {

        /* renamed from: a */
        public final int f21316a;

        /* renamed from: b */
        public final int f21317b;

        public c(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f21316a = r1
                r0.f21317b = r2
                return
        }
    }

    static {
            java.lang.String r0 = "^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p269p5.C5362c.f21302o = r0
            java.lang.String r0 = "^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p269p5.C5362c.f21303p = r0
            java.lang.String r0 = "^(([0-9]*.)?[0-9]+)(px|em|%)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p269p5.C5362c.f21304q = r0
            java.lang.String r0 = "^([-+]?\\d+\\.?\\d*?)%$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p269p5.C5362c.f21305r = r0
            java.lang.String r0 = "^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p269p5.C5362c.f21306s = r0
            java.lang.String r0 = "^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p269p5.C5362c.f21307t = r0
            java.lang.String r0 = "^(\\d+) (\\d+)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p269p5.C5362c.f21308u = r0
            p5.c$b r0 = new p5.c$b
            r1 = 1106247680(0x41f00000, float:30.0)
            r2 = 1
            r0.<init>(r1, r2, r2)
            p269p5.C5362c.f21309v = r0
            p5.c$a r0 = new p5.c$a
            r1 = 32
            r2 = 15
            r0.<init>(r1, r2)
            p269p5.C5362c.f21310w = r0
            return
    }

    public C5362c() {
            r3 = this;
            java.lang.String r0 = "TtmlDecoder"
            r3.<init>(r0)
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch: org.xmlpull.v1.XmlPullParserException -> L10
            r3.f21311n = r0     // Catch: org.xmlpull.v1.XmlPullParserException -> L10
            r1 = 1
            r0.setNamespaceAware(r1)     // Catch: org.xmlpull.v1.XmlPullParserException -> L10
            return
        L10:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't create XmlPullParserFactory instance"
            r1.<init>(r2, r0)
            throw r1
    }

    /* renamed from: k */
    public static p269p5.C5365f m11667k(p269p5.C5365f r0) {
            if (r0 != 0) goto L7
            p5.f r0 = new p5.f
            r0.<init>()
        L7:
            return r0
    }

    /* renamed from: l */
    public static boolean m11668l(java.lang.String r1) {
            java.lang.String r0 = "tt"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "head"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "body"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "div"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "p"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "span"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "br"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "style"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "styling"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "layout"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "region"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "metadata"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "image"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "data"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "information"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L79
            goto L7b
        L79:
            r1 = 0
            goto L7c
        L7b:
            r1 = 1
        L7c:
            return r1
    }

    /* renamed from: m */
    public static android.text.Layout.Alignment m11669m(java.lang.String r2) {
            java.lang.String r2 = p185k7.C3836i.m8629n(r2)
            java.util.Objects.requireNonNull(r2)
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1364013995: goto L3c;
                case 100571: goto L31;
                case 3317767: goto L26;
                case 108511772: goto L1b;
                case 109757538: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L46
        L10:
            java.lang.String r0 = "start"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L19
            goto L46
        L19:
            r1 = 4
            goto L46
        L1b:
            java.lang.String r0 = "right"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L24
            goto L46
        L24:
            r1 = 3
            goto L46
        L26:
            java.lang.String r0 = "left"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2f
            goto L46
        L2f:
            r1 = 2
            goto L46
        L31:
            java.lang.String r0 = "end"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L3a
            goto L46
        L3a:
            r1 = 1
            goto L46
        L3c:
            java.lang.String r0 = "center"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L45
            goto L46
        L45:
            r1 = 0
        L46:
            switch(r1) {
                case 0: goto L51;
                case 1: goto L4e;
                case 2: goto L4b;
                case 3: goto L4e;
                case 4: goto L4b;
                default: goto L49;
            }
        L49:
            r2 = 0
            return r2
        L4b:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r2
        L4e:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r2
        L51:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_CENTER
            return r2
    }

    /* renamed from: n */
    public static p269p5.C5362c.a m11670n(org.xmlpull.v1.XmlPullParser r7, p269p5.C5362c.a r8) {
            java.lang.String r0 = "http://www.w3.org/ns/ttml#parameter"
            java.lang.String r1 = "cellResolution"
            java.lang.String r7 = r7.getAttributeValue(r0, r1)
            if (r7 != 0) goto Lb
            return r8
        Lb:
            java.util.regex.Pattern r0 = p269p5.C5362c.f21308u
            java.util.regex.Matcher r0 = r0.matcher(r7)
            boolean r1 = r0.matches()
            java.lang.String r2 = "Ignoring malformed cell resolution: "
            java.lang.String r3 = "TtmlDecoder"
            if (r1 != 0) goto L2f
            int r0 = r7.length()
            if (r0 == 0) goto L26
            java.lang.String r7 = r2.concat(r7)
            goto L2b
        L26:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r2)
        L2b:
            android.util.Log.w(r3, r7)
            return r8
        L2f:
            r1 = 1
            java.lang.String r1 = r0.group(r1)     // Catch: java.lang.NumberFormatException -> L72
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.NumberFormatException -> L72
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L72
            r4 = 2
            java.lang.String r0 = r0.group(r4)     // Catch: java.lang.NumberFormatException -> L72
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.NumberFormatException -> L72
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L72
            if (r1 == 0) goto L51
            if (r0 == 0) goto L51
            p5.c$a r4 = new p5.c$a     // Catch: java.lang.NumberFormatException -> L72
            r4.<init>(r1, r0)     // Catch: java.lang.NumberFormatException -> L72
            return r4
        L51:
            i5.h r4 = new i5.h     // Catch: java.lang.NumberFormatException -> L72
            r5 = 47
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L72
            r6.<init>(r5)     // Catch: java.lang.NumberFormatException -> L72
            java.lang.String r5 = "Invalid cell resolution "
            r6.append(r5)     // Catch: java.lang.NumberFormatException -> L72
            r6.append(r1)     // Catch: java.lang.NumberFormatException -> L72
            java.lang.String r1 = " "
            r6.append(r1)     // Catch: java.lang.NumberFormatException -> L72
            r6.append(r0)     // Catch: java.lang.NumberFormatException -> L72
            java.lang.String r0 = r6.toString()     // Catch: java.lang.NumberFormatException -> L72
            r4.<init>(r0)     // Catch: java.lang.NumberFormatException -> L72
            throw r4     // Catch: java.lang.NumberFormatException -> L72
        L72:
            int r0 = r7.length()
            if (r0 == 0) goto L7e
            java.lang.String r7 = r2.concat(r7)
            goto L83
        L7e:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r2)
        L83:
            android.util.Log.w(r3, r7)
            return r8
    }

    /* renamed from: o */
    public static void m11671o(java.lang.String r7, p269p5.C5365f r8) {
            int r0 = p371v5.C6552b0.f25624a
            java.lang.String r0 = "\\s+"
            r1 = -1
            java.lang.String[] r0 = r7.split(r0, r1)
            int r1 = r0.length
            r2 = 1
            r3 = 2
            if (r1 != r2) goto L15
            java.util.regex.Pattern r0 = p269p5.C5362c.f21304q
            java.util.regex.Matcher r0 = r0.matcher(r7)
            goto L27
        L15:
            int r1 = r0.length
            if (r1 != r3) goto La0
            java.util.regex.Pattern r1 = p269p5.C5362c.f21304q
            r0 = r0[r2]
            java.util.regex.Matcher r0 = r1.matcher(r0)
            java.lang.String r1 = "TtmlDecoder"
            java.lang.String r4 = "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first."
            android.util.Log.w(r1, r4)
        L27:
            boolean r1 = r0.matches()
            java.lang.String r4 = "'."
            if (r1 == 0) goto L8e
            r7 = 3
            java.lang.String r1 = r0.group(r7)
            java.util.Objects.requireNonNull(r1)
            r1.hashCode()
            r5 = -1
            int r6 = r1.hashCode()
            switch(r6) {
                case 37: goto L59;
                case 3240: goto L4e;
                case 3592: goto L43;
                default: goto L42;
            }
        L42:
            goto L63
        L43:
            java.lang.String r6 = "px"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L4c
            goto L63
        L4c:
            r5 = 2
            goto L63
        L4e:
            java.lang.String r6 = "em"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L57
            goto L63
        L57:
            r5 = 1
            goto L63
        L59:
            java.lang.String r6 = "%"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L62
            goto L63
        L62:
            r5 = 0
        L63:
            switch(r5) {
                case 0: goto L7e;
                case 1: goto L7b;
                case 2: goto L78;
                default: goto L66;
            }
        L66:
            i5.h r7 = new i5.h
            int r8 = r1.length()
            int r8 = r8 + 30
            java.lang.String r0 = "Invalid unit for fontSize: '"
            java.lang.String r8 = p088f4.C2035p.m5377a(r8, r0, r1, r4)
            r7.<init>(r8)
            throw r7
        L78:
            r8.f21350j = r2
            goto L80
        L7b:
            r8.f21350j = r3
            goto L80
        L7e:
            r8.f21350j = r7
        L80:
            java.lang.String r7 = r0.group(r2)
            java.util.Objects.requireNonNull(r7)
            float r7 = java.lang.Float.parseFloat(r7)
            r8.f21351k = r7
            return
        L8e:
            i5.h r8 = new i5.h
            int r0 = r7.length()
            int r0 = r0 + 36
            java.lang.String r1 = "Invalid expression for fontSize: '"
            java.lang.String r7 = p088f4.C2035p.m5377a(r0, r1, r7, r4)
            r8.<init>(r7)
            throw r8
        La0:
            i5.h r7 = new i5.h
            int r8 = r0.length
            r0 = 52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Invalid number of entries for fontSize: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = "."
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r7.<init>(r8)
            throw r7
    }

    /* renamed from: p */
    public static p269p5.C5362c.b m11672p(org.xmlpull.v1.XmlPullParser r6) {
            java.lang.String r0 = "http://www.w3.org/ns/ttml#parameter"
            java.lang.String r1 = "frameRate"
            java.lang.String r1 = r6.getAttributeValue(r0, r1)
            if (r1 == 0) goto Lf
            int r1 = java.lang.Integer.parseInt(r1)
            goto L11
        Lf:
            r1 = 30
        L11:
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r3 = "frameRateMultiplier"
            java.lang.String r3 = r6.getAttributeValue(r0, r3)
            if (r3 == 0) goto L43
            int r2 = p371v5.C6552b0.f25624a
            r2 = -1
            java.lang.String r4 = " "
            java.lang.String[] r2 = r3.split(r4, r2)
            int r3 = r2.length
            r4 = 2
            if (r3 != r4) goto L3b
            r3 = 0
            r3 = r2[r3]
            int r3 = java.lang.Integer.parseInt(r3)
            float r3 = (float) r3
            r4 = 1
            r2 = r2[r4]
            int r2 = java.lang.Integer.parseInt(r2)
            float r2 = (float) r2
            float r2 = r3 / r2
            goto L43
        L3b:
            i5.h r6 = new i5.h
            java.lang.String r0 = "frameRateMultiplier doesn't have 2 parts"
            r6.<init>(r0)
            throw r6
        L43:
            p5.c$b r3 = p269p5.C5362c.f21309v
            int r4 = r3.f21314b
            java.lang.String r5 = "subFrameRate"
            java.lang.String r5 = r6.getAttributeValue(r0, r5)
            if (r5 == 0) goto L53
            int r4 = java.lang.Integer.parseInt(r5)
        L53:
            int r3 = r3.f21315c
            java.lang.String r5 = "tickRate"
            java.lang.String r6 = r6.getAttributeValue(r0, r5)
            if (r6 == 0) goto L61
            int r3 = java.lang.Integer.parseInt(r6)
        L61:
            p5.c$b r6 = new p5.c$b
            float r0 = (float) r1
            float r0 = r0 * r2
            r6.<init>(r0, r4, r3)
            return r6
    }

    /* renamed from: q */
    public static java.util.Map<java.lang.String, p269p5.C5365f> m11673q(org.xmlpull.v1.XmlPullParser r18, java.util.Map<java.lang.String, p269p5.C5365f> r19, p269p5.C5362c.a r20, p269p5.C5362c.c r21, java.util.Map<java.lang.String, p269p5.C5364e> r22, java.util.Map<java.lang.String, java.lang.String> r23) {
            r0 = r18
            r1 = r19
            r2 = r21
        L6:
            r18.next()
            java.lang.String r3 = "style"
            boolean r4 = p064e.C1494h.m4061l(r0, r3)
            if (r4 == 0) goto L41
            java.lang.String r3 = p064e.C1494h.m4056g(r0, r3)
            p5.f r4 = new p5.f
            r4.<init>()
            p5.f r4 = m11675s(r0, r4)
            if (r3 == 0) goto L36
            java.lang.String[] r3 = m11676t(r3)
            int r6 = r3.length
            r5 = 0
        L26:
            if (r5 >= r6) goto L36
            r7 = r3[r5]
            java.lang.Object r7 = r1.get(r7)
            p5.f r7 = (p269p5.C5365f) r7
            r4.m11689a(r7)
            int r5 = r5 + 1
            goto L26
        L36:
            java.lang.String r3 = r4.f21352l
            if (r3 == 0) goto L3d
            r1.put(r3, r4)
        L3d:
            r6 = r22
            goto L276
        L41:
            java.lang.String r3 = "region"
            boolean r3 = p064e.C1494h.m4061l(r0, r3)
            java.lang.String r4 = "id"
            if (r3 == 0) goto L248
            java.lang.String r7 = p064e.C1494h.m4056g(r0, r4)
            if (r7 != 0) goto L53
            goto L23d
        L53:
            java.lang.String r3 = "origin"
            java.lang.String r3 = p064e.C1494h.m4056g(r0, r3)
            if (r3 == 0) goto L236
            java.util.regex.Pattern r4 = p269p5.C5362c.f21306s
            java.util.regex.Matcher r6 = r4.matcher(r3)
            java.util.regex.Pattern r8 = p269p5.C5362c.f21307t
            java.util.regex.Matcher r9 = r8.matcher(r3)
            boolean r10 = r6.matches()
            java.lang.String r11 = "Ignoring region with malformed origin: "
            java.lang.String r12 = "Ignoring region with missing tts:extent: "
            r13 = 1120403456(0x42c80000, float:100.0)
            r14 = 2
            r15 = 1
            if (r10 == 0) goto L9e
            java.lang.String r9 = r6.group(r15)     // Catch: java.lang.NumberFormatException -> L8e
            java.util.Objects.requireNonNull(r9)     // Catch: java.lang.NumberFormatException -> L8e
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L8e
            float r9 = r9 / r13
            java.lang.String r6 = r6.group(r14)     // Catch: java.lang.NumberFormatException -> L8e
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.NumberFormatException -> L8e
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.NumberFormatException -> L8e
            float r6 = r6 / r13
            goto Lda
        L8e:
            int r4 = r3.length()
            if (r4 == 0) goto L97
            goto L218
        L97:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r11)
            goto L238
        L9e:
            boolean r6 = r9.matches()
            if (r6 == 0) goto L223
            if (r2 != 0) goto Lb5
            int r4 = r3.length()
            if (r4 == 0) goto Lae
            goto L12b
        Lae:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r12)
            goto L238
        Lb5:
            java.lang.String r6 = r9.group(r15)     // Catch: java.lang.NumberFormatException -> L211
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.NumberFormatException -> L211
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L211
            java.lang.String r9 = r9.group(r14)     // Catch: java.lang.NumberFormatException -> L211
            java.util.Objects.requireNonNull(r9)     // Catch: java.lang.NumberFormatException -> L211
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L211
            float r6 = (float) r6     // Catch: java.lang.NumberFormatException -> L211
            int r10 = r2.f21316a     // Catch: java.lang.NumberFormatException -> L211
            float r10 = (float) r10     // Catch: java.lang.NumberFormatException -> L211
            float r6 = r6 / r10
            float r9 = (float) r9     // Catch: java.lang.NumberFormatException -> L211
            int r10 = r2.f21317b     // Catch: java.lang.NumberFormatException -> L211
            float r10 = (float) r10
            float r9 = r9 / r10
            r17 = r9
            r9 = r6
            r6 = r17
        Lda:
            java.lang.String r10 = "extent"
            java.lang.String r10 = p064e.C1494h.m4056g(r0, r10)
            if (r10 == 0) goto L20e
            java.util.regex.Matcher r4 = r4.matcher(r10)
            java.util.regex.Matcher r8 = r8.matcher(r10)
            boolean r10 = r4.matches()
            java.lang.String r11 = "Ignoring region with malformed extent: "
            if (r10 == 0) goto L11d
            java.lang.String r8 = r4.group(r15)     // Catch: java.lang.NumberFormatException -> L10d
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.NumberFormatException -> L10d
            float r8 = java.lang.Float.parseFloat(r8)     // Catch: java.lang.NumberFormatException -> L10d
            float r8 = r8 / r13
            java.lang.String r4 = r4.group(r14)     // Catch: java.lang.NumberFormatException -> L10d
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.NumberFormatException -> L10d
            float r3 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.NumberFormatException -> L10d
            float r3 = r3 / r13
            r13 = r3
            r12 = r8
            goto L15a
        L10d:
            int r4 = r3.length()
            if (r4 == 0) goto L116
            goto L218
        L116:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r11)
            goto L238
        L11d:
            boolean r4 = r8.matches()
            if (r4 == 0) goto L1ff
            if (r2 != 0) goto L138
            int r4 = r3.length()
            if (r4 == 0) goto L131
        L12b:
            java.lang.String r3 = r12.concat(r3)
            goto L238
        L131:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r12)
            goto L238
        L138:
            java.lang.String r4 = r8.group(r15)     // Catch: java.lang.NumberFormatException -> L1f1
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.NumberFormatException -> L1f1
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L1f1
            java.lang.String r8 = r8.group(r14)     // Catch: java.lang.NumberFormatException -> L1f1
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.NumberFormatException -> L1f1
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L1f1
            float r4 = (float) r4     // Catch: java.lang.NumberFormatException -> L1f1
            int r10 = r2.f21316a     // Catch: java.lang.NumberFormatException -> L1f1
            float r10 = (float) r10     // Catch: java.lang.NumberFormatException -> L1f1
            float r4 = r4 / r10
            float r8 = (float) r8     // Catch: java.lang.NumberFormatException -> L1f1
            int r3 = r2.f21317b     // Catch: java.lang.NumberFormatException -> L1f1
            float r3 = (float) r3
            float r8 = r8 / r3
            r12 = r4
            r13 = r8
        L15a:
            java.lang.String r3 = "displayAlign"
            java.lang.String r3 = p064e.C1494h.m4056g(r0, r3)
            if (r3 == 0) goto L185
            java.lang.String r3 = p185k7.C3836i.m8629n(r3)
            java.util.Objects.requireNonNull(r3)
            java.lang.String r4 = "center"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L17e
            java.lang.String r4 = "after"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L17a
            goto L185
        L17a:
            float r6 = r6 + r13
            r3 = r6
            r11 = 2
            goto L187
        L17e:
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r13 / r3
            float r3 = r3 + r6
            r11 = 1
            goto L187
        L185:
            r3 = r6
            r11 = 0
        L187:
            r4 = 1065353216(0x3f800000, float:1.0)
            r10 = r20
            int r6 = r10.f21312a
            float r6 = (float) r6
            float r4 = r4 / r6
            java.lang.String r6 = "writingMode"
            java.lang.String r6 = p064e.C1494h.m4056g(r0, r6)
            if (r6 == 0) goto L1df
            java.lang.String r6 = p185k7.C3836i.m8629n(r6)
            java.util.Objects.requireNonNull(r6)
            int r8 = r6.hashCode()
            r5 = 3694(0xe6e, float:5.176E-42)
            if (r8 == r5) goto L1c7
            r5 = 3553396(0x363874, float:4.979368E-39)
            if (r8 == r5) goto L1bc
            r5 = 3553576(0x363928, float:4.97962E-39)
            if (r8 == r5) goto L1b1
            goto L1cf
        L1b1:
            java.lang.String r5 = "tbrl"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L1ba
            goto L1cf
        L1ba:
            r5 = 2
            goto L1d2
        L1bc:
            java.lang.String r5 = "tblr"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L1c5
            goto L1cf
        L1c5:
            r5 = 1
            goto L1d2
        L1c7:
            java.lang.String r5 = "tb"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L1d1
        L1cf:
            r5 = -1
            goto L1d2
        L1d1:
            r5 = 0
        L1d2:
            if (r5 == 0) goto L1dc
            if (r5 == r15) goto L1dc
            if (r5 == r14) goto L1d9
            goto L1df
        L1d9:
            r16 = 1
            goto L1e3
        L1dc:
            r16 = 2
            goto L1e3
        L1df:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
        L1e3:
            p5.e r5 = new p5.e
            r14 = 0
            r15 = 1
            r6 = r5
            r8 = r9
            r9 = r3
            r10 = r14
            r14 = r15
            r15 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L23e
        L1f1:
            int r4 = r3.length()
            if (r4 == 0) goto L1f9
            goto L218
        L1f9:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r11)
            goto L238
        L1ff:
            java.lang.String r4 = "Ignoring region with unsupported extent: "
            int r5 = r3.length()
            if (r5 == 0) goto L208
            goto L22b
        L208:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
            goto L238
        L20e:
            java.lang.String r3 = "Ignoring region without an extent"
            goto L238
        L211:
            int r4 = r3.length()
            if (r4 == 0) goto L21d
        L218:
            java.lang.String r3 = r11.concat(r3)
            goto L238
        L21d:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r11)
            goto L238
        L223:
            java.lang.String r4 = "Ignoring region with unsupported origin: "
            int r5 = r3.length()
            if (r5 == 0) goto L230
        L22b:
            java.lang.String r3 = r4.concat(r3)
            goto L238
        L230:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
            goto L238
        L236:
            java.lang.String r3 = "Ignoring region without an origin"
        L238:
            java.lang.String r4 = "TtmlDecoder"
            android.util.Log.w(r4, r3)
        L23d:
            r5 = 0
        L23e:
            if (r5 == 0) goto L3d
            java.lang.String r3 = r5.f21331a
            r6 = r22
            r6.put(r3, r5)
            goto L276
        L248:
            r6 = r22
            java.lang.String r3 = "metadata"
            boolean r5 = p064e.C1494h.m4061l(r0, r3)
            if (r5 == 0) goto L276
        L252:
            r18.next()
            java.lang.String r5 = "image"
            boolean r5 = p064e.C1494h.m4061l(r0, r5)
            if (r5 == 0) goto L26d
            java.lang.String r5 = p064e.C1494h.m4056g(r0, r4)
            if (r5 == 0) goto L26d
            java.lang.String r7 = r18.nextText()
            r8 = r23
            r8.put(r5, r7)
            goto L26f
        L26d:
            r8 = r23
        L26f:
            boolean r5 = p064e.C1494h.m4060k(r0, r3)
            if (r5 == 0) goto L252
            goto L278
        L276:
            r8 = r23
        L278:
            java.lang.String r3 = "head"
            boolean r3 = p064e.C1494h.m4060k(r0, r3)
            if (r3 == 0) goto L6
            return r1
    }

    /* renamed from: r */
    public static p269p5.C5363d m11674r(org.xmlpull.v1.XmlPullParser r18, p269p5.C5363d r19, java.util.Map<java.lang.String, p269p5.C5364e> r20, p269p5.C5362c.b r21) {
            r0 = r18
            r11 = r19
            r1 = r21
            int r2 = r18.getAttributeCount()
            r3 = 0
            p5.f r7 = m11675s(r0, r3)
            java.lang.String r8 = ""
            r10 = r3
            r9 = r8
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r10
            r3 = 0
        L24:
            if (r3 >= r2) goto Lc8
            java.lang.String r4 = r0.getAttributeName(r3)
            java.lang.String r5 = r0.getAttributeValue(r3)
            java.util.Objects.requireNonNull(r4)
            int r6 = r4.hashCode()
            r0 = 1
            switch(r6) {
                case -934795532: goto L71;
                case 99841: goto L66;
                case 100571: goto L5b;
                case 93616297: goto L50;
                case 109780401: goto L45;
                case 1292595405: goto L3a;
                default: goto L39;
            }
        L39:
            goto L7c
        L3a:
            java.lang.String r6 = "backgroundImage"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L43
            goto L7c
        L43:
            r4 = 5
            goto L7d
        L45:
            java.lang.String r6 = "style"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L4e
            goto L7c
        L4e:
            r4 = 4
            goto L7d
        L50:
            java.lang.String r6 = "begin"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L59
            goto L7c
        L59:
            r4 = 3
            goto L7d
        L5b:
            java.lang.String r6 = "end"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L64
            goto L7c
        L64:
            r4 = 2
            goto L7d
        L66:
            java.lang.String r6 = "dur"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L6f
            goto L7c
        L6f:
            r4 = 1
            goto L7d
        L71:
            java.lang.String r6 = "region"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L7a
            goto L7c
        L7a:
            r4 = 0
            goto L7d
        L7c:
            r4 = -1
        L7d:
            if (r4 == 0) goto Lb9
            if (r4 == r0) goto Lb0
            r6 = 2
            if (r4 == r6) goto Laa
            r6 = 3
            if (r4 == r6) goto La4
            r6 = 4
            if (r4 == r6) goto L9b
            r6 = 5
            if (r4 == r6) goto L8e
            goto Lb6
        L8e:
            java.lang.String r4 = "#"
            boolean r4 = r5.startsWith(r4)
            if (r4 == 0) goto Lb6
            java.lang.String r10 = r5.substring(r0)
            goto Lb6
        L9b:
            java.lang.String[] r0 = m11676t(r5)
            int r4 = r0.length
            if (r4 <= 0) goto Lb6
            r8 = r0
            goto Lb6
        La4:
            long r4 = m11677u(r5, r1)
            r12 = r4
            goto Lb6
        Laa:
            long r4 = m11677u(r5, r1)
            r14 = r4
            goto Lb6
        Lb0:
            long r4 = m11677u(r5, r1)
            r16 = r4
        Lb6:
            r0 = r20
            goto Lc2
        Lb9:
            r0 = r20
            boolean r4 = r0.containsKey(r5)
            if (r4 == 0) goto Lc2
            r9 = r5
        Lc2:
            int r3 = r3 + 1
            r0 = r18
            goto L24
        Lc8:
            if (r11 == 0) goto Le0
            long r0 = r11.f21321d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Le5
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto Lda
            long r12 = r12 + r0
        Lda:
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 == 0) goto Le5
            long r14 = r14 + r0
            goto Le5
        Le0:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        Le5:
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 != 0) goto Lfc
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 == 0) goto Lf2
            long r16 = r12 + r16
            r5 = r16
            goto Lfd
        Lf2:
            if (r11 == 0) goto Lfc
            long r0 = r11.f21322e
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lfc
            r5 = r0
            goto Lfd
        Lfc:
            r5 = r14
        Lfd:
            java.lang.String r1 = r18.getName()
            p5.d r14 = new p5.d
            r2 = 0
            r0 = r14
            r3 = r12
            r11 = r19
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            return r14
    }

    /* renamed from: s */
    public static p269p5.C5365f m11675s(org.xmlpull.v1.XmlPullParser r16, p269p5.C5365f r17) {
            r1 = r16
            int r2 = r16.getAttributeCount()
            r3 = 0
            r0 = r17
            r4 = 0
        La:
            if (r4 >= r2) goto L49e
            java.lang.String r5 = r1.getAttributeValue(r4)
            java.lang.String r6 = r1.getAttributeName(r4)
            java.util.Objects.requireNonNull(r6)
            int r7 = r6.hashCode()
            r9 = 4
            r11 = -1
            r12 = 2
            r13 = 1
            switch(r7) {
                case -1550943582: goto Ld3;
                case -1224696685: goto Lc8;
                case -1065511464: goto Lbd;
                case -879295043: goto Lb2;
                case -734428249: goto La7;
                case 3355: goto L9c;
                case 3511770: goto L91;
                case 94842723: goto L86;
                case 109403361: goto L78;
                case 110138194: goto L6a;
                case 365601008: goto L5c;
                case 921125321: goto L4e;
                case 1115953443: goto L40;
                case 1287124693: goto L32;
                case 1754920356: goto L24;
                default: goto L22;
            }
        L22:
            goto Lde
        L24:
            java.lang.String r7 = "multiRowAlign"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L2e
            goto Lde
        L2e:
            r6 = 14
            goto Ldf
        L32:
            java.lang.String r7 = "backgroundColor"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L3c
            goto Lde
        L3c:
            r6 = 13
            goto Ldf
        L40:
            java.lang.String r7 = "rubyPosition"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L4a
            goto Lde
        L4a:
            r6 = 12
            goto Ldf
        L4e:
            java.lang.String r7 = "textEmphasis"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L58
            goto Lde
        L58:
            r6 = 11
            goto Ldf
        L5c:
            java.lang.String r7 = "fontSize"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L66
            goto Lde
        L66:
            r6 = 10
            goto Ldf
        L6a:
            java.lang.String r7 = "textCombine"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L74
            goto Lde
        L74:
            r6 = 9
            goto Ldf
        L78:
            java.lang.String r7 = "shear"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L82
            goto Lde
        L82:
            r6 = 8
            goto Ldf
        L86:
            java.lang.String r7 = "color"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L8f
            goto Lde
        L8f:
            r6 = 7
            goto Ldf
        L91:
            java.lang.String r7 = "ruby"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L9a
            goto Lde
        L9a:
            r6 = 6
            goto Ldf
        L9c:
            java.lang.String r7 = "id"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto La5
            goto Lde
        La5:
            r6 = 5
            goto Ldf
        La7:
            java.lang.String r7 = "fontWeight"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto Lb0
            goto Lde
        Lb0:
            r6 = 4
            goto Ldf
        Lb2:
            java.lang.String r7 = "textDecoration"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto Lbb
            goto Lde
        Lbb:
            r6 = 3
            goto Ldf
        Lbd:
            java.lang.String r7 = "textAlign"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto Lc6
            goto Lde
        Lc6:
            r6 = 2
            goto Ldf
        Lc8:
            java.lang.String r7 = "fontFamily"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto Ld1
            goto Lde
        Ld1:
            r6 = 1
            goto Ldf
        Ld3:
            java.lang.String r7 = "fontStyle"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto Ldc
            goto Lde
        Ldc:
            r6 = 0
            goto Ldf
        Lde:
            r6 = -1
        Ldf:
            java.lang.String r7 = "after"
            java.lang.String r14 = "before"
            java.lang.String r15 = "none"
            java.lang.String r8 = "TtmlDecoder"
            switch(r6) {
                case 0: goto L48e;
                case 1: goto L487;
                case 2: goto L47c;
                case 3: goto L41c;
                case 4: goto L40e;
                case 5: goto L3fa;
                case 6: goto L37a;
                case 7: goto L350;
                case 8: goto L2eb;
                case 9: goto L2c4;
                case 10: goto L2a5;
                case 11: goto L141;
                case 12: goto L11c;
                case 13: goto Lf8;
                case 14: goto Lec;
                default: goto Lea;
            }
        Lea:
            goto L49a
        Lec:
            p5.f r0 = m11667k(r0)
            android.text.Layout$Alignment r5 = m11669m(r5)
            r0.f21356p = r5
            goto L49a
        Lf8:
            p5.f r0 = m11667k(r0)
            int r6 = p371v5.C6556f.m13341a(r5, r3)     // Catch: java.lang.IllegalArgumentException -> L106
            r0.f21344d = r6     // Catch: java.lang.IllegalArgumentException -> L106
            r0.f21345e = r13     // Catch: java.lang.IllegalArgumentException -> L106
            goto L49a
        L106:
            java.lang.String r6 = "Failed parsing background value: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r7 = r5.length()
            if (r7 == 0) goto L115
            goto L36b
        L115:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
            goto L375
        L11c:
            java.lang.String r5 = p185k7.C3836i.m8629n(r5)
            java.util.Objects.requireNonNull(r5)
            boolean r6 = r5.equals(r14)
            if (r6 != 0) goto L139
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L131
            goto L49a
        L131:
            p5.f r0 = m11667k(r0)
            r0.f21354n = r12
            goto L49a
        L139:
            p5.f r0 = m11667k(r0)
            r0.f21354n = r13
            goto L49a
        L141:
            p5.f r0 = m11667k(r0)
            java.util.regex.Pattern r6 = p269p5.C5361b.f21294d
            r6 = 0
            if (r5 != 0) goto L14c
            goto L2a1
        L14c:
            java.lang.String r5 = r5.trim()
            java.lang.String r5 = p185k7.C3836i.m8629n(r5)
            boolean r8 = r5.isEmpty()
            if (r8 == 0) goto L15c
            goto L2a1
        L15c:
            java.util.regex.Pattern r6 = p269p5.C5361b.f21294d
            java.lang.String[] r5 = android.text.TextUtils.split(r5, r6)
            int r6 = r5.length
            if (r6 == 0) goto L17c
            if (r6 == r13) goto L173
            int r6 = r5.length
            java.lang.Object r5 = r5.clone()
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            b9.p r5 = p026b9.AbstractC0716p.m2325q(r6, r5)
            goto L17e
        L173:
            r5 = r5[r3]
            b9.k0 r6 = new b9.k0
            r6.<init>(r5)
            r5 = r6
            goto L17e
        L17c:
            b9.e0<java.lang.Object> r5 = p026b9.C0697e0.f3947g0
        L17e:
            b9.p<java.lang.String> r6 = p269p5.C5361b.f21298h
            b9.j0$e r6 = p026b9.C0707j0.m2301d(r6, r5)
            java.lang.String r8 = "outside"
            java.lang.Object r6 = p185k7.C3828h5.m8598m(r6, r8)
            java.lang.String r6 = (java.lang.String) r6
            int r9 = r6.hashCode()
            r10 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            if (r9 == r10) goto L1b0
            r10 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            if (r9 == r10) goto L1a8
            r8 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r9 == r8) goto L1a0
            goto L1b8
        L1a0:
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L1b8
            r6 = 0
            goto L1b9
        L1a8:
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L1b8
            r6 = 1
            goto L1b9
        L1b0:
            boolean r6 = r6.equals(r14)
            if (r6 == 0) goto L1b8
            r6 = 2
            goto L1b9
        L1b8:
            r6 = -1
        L1b9:
            if (r6 == 0) goto L1c1
            if (r6 == r13) goto L1bf
            r6 = 1
            goto L1c2
        L1bf:
            r6 = -2
            goto L1c2
        L1c1:
            r6 = 2
        L1c2:
            b9.p<java.lang.String> r7 = p269p5.C5361b.f21295e
            b9.j0$e r7 = p026b9.C0707j0.m2301d(r7, r5)
            b9.j0$a r7 = (p026b9.C0707j0.a) r7
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L206
            b9.i0 r5 = new b9.i0
            r5.<init>(r7)
            java.lang.Object r5 = r5.next()
            java.lang.String r5 = (java.lang.String) r5
            int r7 = r5.hashCode()
            r8 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r7 == r8) goto L1f2
            r8 = 3387192(0x33af38, float:4.746467E-39)
            if (r7 == r8) goto L1ea
            goto L1fb
        L1ea:
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L1fb
            r13 = 0
            goto L1fc
        L1f2:
            java.lang.String r7 = "auto"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L1fb
            goto L1fc
        L1fb:
            r13 = -1
        L1fc:
            if (r13 == 0) goto L1ff
            goto L200
        L1ff:
            r11 = 0
        L200:
            p5.b r5 = new p5.b
            r5.<init>(r11, r3, r6)
            goto L229
        L206:
            b9.p<java.lang.String> r7 = p269p5.C5361b.f21297g
            b9.j0$e r7 = p026b9.C0707j0.m2301d(r7, r5)
            b9.p<java.lang.String> r8 = p269p5.C5361b.f21296f
            b9.j0$e r5 = p026b9.C0707j0.m2301d(r8, r5)
            r8 = r7
            b9.j0$a r8 = (p026b9.C0707j0.a) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L22c
            r8 = r5
            b9.j0$a r8 = (p026b9.C0707j0.a) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L22c
            p5.b r5 = new p5.b
            r5.<init>(r11, r3, r6)
        L229:
            r6 = r5
            goto L2a1
        L22c:
            java.lang.String r8 = "filled"
            java.lang.Object r7 = p185k7.C3828h5.m8598m(r7, r8)
            java.lang.String r7 = (java.lang.String) r7
            int r9 = r7.hashCode()
            r10 = -1274499742(0xffffffffb408ad62, float:-1.2729063E-7)
            if (r9 == r10) goto L24d
            r8 = 3417674(0x34264a, float:4.789181E-39)
            if (r9 == r8) goto L243
            goto L255
        L243:
            java.lang.String r8 = "open"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L255
            r7 = 0
            goto L256
        L24d:
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L255
            r7 = 1
            goto L256
        L255:
            r7 = -1
        L256:
            if (r7 == 0) goto L25a
            r7 = 1
            goto L25b
        L25a:
            r7 = 2
        L25b:
            java.lang.String r8 = "circle"
            java.lang.Object r5 = p185k7.C3828h5.m8598m(r5, r8)
            java.lang.String r5 = (java.lang.String) r5
            int r9 = r5.hashCode()
            r10 = -1360216880(0xffffffffaeecbcd0, float:-1.0765577E-10)
            if (r9 == r10) goto L28b
            r8 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r9 == r8) goto L281
            r8 = 99657(0x18549, float:1.39649E-40)
            if (r9 == r8) goto L277
            goto L292
        L277:
            java.lang.String r8 = "dot"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L292
            r11 = 0
            goto L292
        L281:
            java.lang.String r8 = "sesame"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L292
            r11 = 1
            goto L292
        L28b:
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L292
            r11 = 2
        L292:
            if (r11 == 0) goto L29a
            if (r11 == r13) goto L298
            r10 = 1
            goto L29b
        L298:
            r10 = 3
            goto L29b
        L29a:
            r10 = 2
        L29b:
            p5.b r5 = new p5.b
            r5.<init>(r10, r7, r6)
            goto L229
        L2a1:
            r0.f21358r = r6
            goto L49a
        L2a5:
            p5.f r0 = m11667k(r0)     // Catch: p143i5.C3084h -> L2ae
            m11671o(r5, r0)     // Catch: p143i5.C3084h -> L2ae
            goto L49a
        L2ae:
            java.lang.String r6 = "Failed parsing fontSize value: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r7 = r5.length()
            if (r7 == 0) goto L2bd
            goto L36b
        L2bd:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
            goto L375
        L2c4:
            java.lang.String r5 = p185k7.C3836i.m8629n(r5)
            java.util.Objects.requireNonNull(r5)
            java.lang.String r6 = "all"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L2e3
            boolean r5 = r5.equals(r15)
            if (r5 != 0) goto L2db
            goto L49a
        L2db:
            p5.f r0 = m11667k(r0)
            r0.f21357q = r3
            goto L49a
        L2e3:
            p5.f r0 = m11667k(r0)
            r0.f21357q = r13
            goto L49a
        L2eb:
            p5.f r6 = m11667k(r0)
            java.util.regex.Pattern r0 = p269p5.C5362c.f21305r
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r7 = r0.matches()
            r9 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r7 != 0) goto L319
            java.lang.String r0 = "Invalid value for shear: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r7 = r5.length()
            if (r7 == 0) goto L30f
            java.lang.String r0 = r0.concat(r5)
            goto L315
        L30f:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
            r0 = r5
        L315:
            android.util.Log.w(r8, r0)
            goto L34b
        L319:
            java.lang.String r0 = r0.group(r13)     // Catch: java.lang.NumberFormatException -> L331
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.NumberFormatException -> L331
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L331
            r7 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r0 = java.lang.Math.max(r7, r0)     // Catch: java.lang.NumberFormatException -> L331
            r7 = 1120403456(0x42c80000, float:100.0)
            float r9 = java.lang.Math.min(r7, r0)     // Catch: java.lang.NumberFormatException -> L331
            goto L34b
        L331:
            r0 = move-exception
            java.lang.String r7 = "Failed to parse shear: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r10 = r5.length()
            if (r10 == 0) goto L343
            java.lang.String r5 = r7.concat(r5)
            goto L348
        L343:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r7)
        L348:
            p371v5.C6565o.m13370c(r8, r5, r0)
        L34b:
            r6.f21359s = r9
            r0 = r6
            goto L49a
        L350:
            p5.f r0 = m11667k(r0)
            int r6 = p371v5.C6556f.m13341a(r5, r3)     // Catch: java.lang.IllegalArgumentException -> L35e
            r0.f21342b = r6     // Catch: java.lang.IllegalArgumentException -> L35e
            r0.f21343c = r13     // Catch: java.lang.IllegalArgumentException -> L35e
            goto L49a
        L35e:
            java.lang.String r6 = "Failed parsing color value: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r7 = r5.length()
            if (r7 == 0) goto L370
        L36b:
            java.lang.String r5 = r6.concat(r5)
            goto L375
        L370:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
        L375:
            android.util.Log.w(r8, r5)
            goto L49a
        L37a:
            java.lang.String r5 = p185k7.C3836i.m8629n(r5)
            java.util.Objects.requireNonNull(r5)
            int r6 = r5.hashCode()
            switch(r6) {
                case -618561360: goto L3c0;
                case -410956671: goto L3b5;
                case -250518009: goto L3aa;
                case -136074796: goto L39f;
                case 3016401: goto L394;
                case 3556653: goto L389;
                default: goto L388;
            }
        L388:
            goto L3ca
        L389:
            java.lang.String r6 = "text"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L392
            goto L3ca
        L392:
            r11 = 5
            goto L3ca
        L394:
            java.lang.String r6 = "base"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L39d
            goto L3ca
        L39d:
            r11 = 4
            goto L3ca
        L39f:
            java.lang.String r6 = "textContainer"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3a8
            goto L3ca
        L3a8:
            r11 = 3
            goto L3ca
        L3aa:
            java.lang.String r6 = "delimiter"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3b3
            goto L3ca
        L3b3:
            r11 = 2
            goto L3ca
        L3b5:
            java.lang.String r6 = "container"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3be
            goto L3ca
        L3be:
            r11 = 1
            goto L3ca
        L3c0:
            java.lang.String r6 = "baseContainer"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3c9
            goto L3ca
        L3c9:
            r11 = 0
        L3ca:
            if (r11 == 0) goto L3f2
            if (r11 == r13) goto L3ea
            if (r11 == r12) goto L3e2
            r5 = 3
            if (r11 == r5) goto L3da
            if (r11 == r9) goto L3f2
            r6 = 5
            if (r11 == r6) goto L3da
            goto L49a
        L3da:
            p5.f r0 = m11667k(r0)
            r0.f21353m = r5
            goto L49a
        L3e2:
            p5.f r0 = m11667k(r0)
            r0.f21353m = r9
            goto L49a
        L3ea:
            p5.f r0 = m11667k(r0)
            r0.f21353m = r13
            goto L49a
        L3f2:
            p5.f r0 = m11667k(r0)
            r0.f21353m = r12
            goto L49a
        L3fa:
            java.lang.String r6 = r16.getName()
            java.lang.String r7 = "style"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L49a
            p5.f r0 = m11667k(r0)
            r0.f21352l = r5
            goto L49a
        L40e:
            p5.f r0 = m11667k(r0)
            java.lang.String r6 = "bold"
            boolean r5 = r6.equalsIgnoreCase(r5)
            r0.f21348h = r5
            goto L49a
        L41c:
            java.lang.String r5 = p185k7.C3836i.m8629n(r5)
            java.util.Objects.requireNonNull(r5)
            int r6 = r5.hashCode()
            switch(r6) {
                case -1461280213: goto L44c;
                case -1026963764: goto L441;
                case 913457136: goto L436;
                case 1679736913: goto L42b;
                default: goto L42a;
            }
        L42a:
            goto L456
        L42b:
            java.lang.String r6 = "linethrough"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L434
            goto L456
        L434:
            r11 = 3
            goto L456
        L436:
            java.lang.String r6 = "nolinethrough"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L43f
            goto L456
        L43f:
            r11 = 2
            goto L456
        L441:
            java.lang.String r6 = "underline"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L44a
            goto L456
        L44a:
            r11 = 1
            goto L456
        L44c:
            java.lang.String r6 = "nounderline"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L455
            goto L456
        L455:
            r11 = 0
        L456:
            if (r11 == 0) goto L475
            if (r11 == r13) goto L46e
            if (r11 == r12) goto L467
            r5 = 3
            if (r11 == r5) goto L460
            goto L49a
        L460:
            p5.f r0 = m11667k(r0)
            r0.f21346f = r13
            goto L49a
        L467:
            p5.f r0 = m11667k(r0)
            r0.f21346f = r3
            goto L49a
        L46e:
            p5.f r0 = m11667k(r0)
            r0.f21347g = r13
            goto L49a
        L475:
            p5.f r0 = m11667k(r0)
            r0.f21347g = r3
            goto L49a
        L47c:
            p5.f r0 = m11667k(r0)
            android.text.Layout$Alignment r5 = m11669m(r5)
            r0.f21355o = r5
            goto L49a
        L487:
            p5.f r0 = m11667k(r0)
            r0.f21341a = r5
            goto L49a
        L48e:
            p5.f r0 = m11667k(r0)
            java.lang.String r6 = "italic"
            boolean r5 = r6.equalsIgnoreCase(r5)
            r0.f21349i = r5
        L49a:
            int r4 = r4 + 1
            goto La
        L49e:
            return r0
    }

    /* renamed from: t */
    public static java.lang.String[] m11676t(java.lang.String r2) {
            java.lang.String r2 = r2.trim()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Le
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            goto L17
        Le:
            int r0 = p371v5.C6552b0.f25624a
            r0 = -1
            java.lang.String r1 = "\\s+"
            java.lang.String[] r2 = r2.split(r1, r0)
        L17:
            return r2
    }

    /* renamed from: u */
    public static long m11677u(java.lang.String r13, p269p5.C5362c.b r14) {
            java.util.regex.Pattern r0 = p269p5.C5362c.f21302o
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L7f
            java.lang.String r13 = r0.group(r7)
            java.util.Objects.requireNonNull(r13)
            long r7 = java.lang.Long.parseLong(r13)
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            double r7 = (double) r7
            java.lang.String r13 = r0.group(r6)
            java.util.Objects.requireNonNull(r13)
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            double r9 = (double) r9
            double r7 = r7 + r9
            java.lang.String r13 = r0.group(r5)
            java.util.Objects.requireNonNull(r13)
            long r5 = java.lang.Long.parseLong(r13)
            double r5 = (double) r5
            double r7 = r7 + r5
            java.lang.String r13 = r0.group(r4)
            r4 = 0
            if (r13 == 0) goto L50
            double r9 = java.lang.Double.parseDouble(r13)
            goto L51
        L50:
            r9 = r4
        L51:
            double r7 = r7 + r9
            r13 = 5
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L63
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r1 = r14.f21313a
            float r13 = r13 / r1
            double r9 = (double) r13
            goto L64
        L63:
            r9 = r4
        L64:
            double r7 = r7 + r9
            r13 = 6
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L7a
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.f21314b
            double r4 = (double) r13
            double r0 = r0 / r4
            float r13 = r14.f21313a
            double r13 = (double) r13
            double r4 = r0 / r13
        L7a:
            double r7 = r7 + r4
            double r7 = r7 * r2
            long r13 = (long) r7
            return r13
        L7f:
            java.util.regex.Pattern r0 = p269p5.C5362c.f21303p
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            if (r1 == 0) goto Lfd
            java.lang.String r13 = r0.group(r7)
            java.util.Objects.requireNonNull(r13)
            double r8 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r0.group(r6)
            java.util.Objects.requireNonNull(r13)
            r0 = -1
            int r1 = r13.hashCode()
            switch(r1) {
                case 102: goto Ld1;
                case 104: goto Lc6;
                case 109: goto Lbb;
                case 116: goto Lb0;
                case 3494: goto La7;
                default: goto La5;
            }
        La5:
            r4 = -1
            goto Ldb
        La7:
            java.lang.String r1 = "ms"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto Ldb
            goto La5
        Lb0:
            java.lang.String r1 = "t"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto Lb9
            goto La5
        Lb9:
            r4 = 3
            goto Ldb
        Lbb:
            java.lang.String r1 = "m"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto Lc4
            goto La5
        Lc4:
            r4 = 2
            goto Ldb
        Lc6:
            java.lang.String r1 = "h"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto Lcf
            goto La5
        Lcf:
            r4 = 1
            goto Ldb
        Ld1:
            java.lang.String r1 = "f"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto Lda
            goto La5
        Lda:
            r4 = 0
        Ldb:
            switch(r4) {
                case 0: goto Lf5;
                case 1: goto Led;
                case 2: goto Lea;
                case 3: goto Le6;
                case 4: goto Ldf;
                default: goto Lde;
            }
        Lde:
            goto Lf9
        Ldf:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
        Le4:
            double r8 = r8 / r13
            goto Lf9
        Le6:
            int r13 = r14.f21315c
            double r13 = (double) r13
            goto Le4
        Lea:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto Lf2
        Led:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        Lf2:
            double r8 = r8 * r13
            goto Lf9
        Lf5:
            float r13 = r14.f21313a
            double r13 = (double) r13
            goto Le4
        Lf9:
            double r8 = r8 * r2
            long r13 = (long) r8
            return r13
        Lfd:
            i5.h r14 = new i5.h
            java.lang.String r0 = "Malformed time expression: "
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r1 = r13.length()
            if (r1 == 0) goto L110
            java.lang.String r13 = r0.concat(r13)
            goto L115
        L110:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r0)
        L115:
            r14.<init>(r13)
            throw r14
    }

    /* renamed from: v */
    public static p269p5.C5362c.c m11678v(org.xmlpull.v1.XmlPullParser r5) {
            java.lang.String r0 = "extent"
            java.lang.String r5 = p064e.C1494h.m4056g(r5, r0)
            r0 = 0
            if (r5 != 0) goto La
            return r0
        La:
            java.util.regex.Pattern r1 = p269p5.C5362c.f21307t
            java.util.regex.Matcher r1 = r1.matcher(r5)
            boolean r2 = r1.matches()
            java.lang.String r3 = "TtmlDecoder"
            if (r2 != 0) goto L2e
            java.lang.String r1 = "Ignoring non-pixel tts extent: "
            int r2 = r5.length()
            if (r2 == 0) goto L25
            java.lang.String r5 = r1.concat(r5)
            goto L2a
        L25:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L2a:
            android.util.Log.w(r3, r5)
            return r0
        L2e:
            r2 = 1
            java.lang.String r2 = r1.group(r2)     // Catch: java.lang.NumberFormatException -> L4c
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.NumberFormatException -> L4c
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L4c
            r4 = 2
            java.lang.String r1 = r1.group(r4)     // Catch: java.lang.NumberFormatException -> L4c
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.NumberFormatException -> L4c
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L4c
            p5.c$c r4 = new p5.c$c     // Catch: java.lang.NumberFormatException -> L4c
            r4.<init>(r2, r1)     // Catch: java.lang.NumberFormatException -> L4c
            return r4
        L4c:
            java.lang.String r1 = "Ignoring malformed tts extent: "
            int r2 = r5.length()
            if (r2 == 0) goto L5a
            java.lang.String r5 = r1.concat(r5)
            goto L5f
        L5a:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L5f:
            android.util.Log.w(r3, r5)
            return r0
    }

    @Override // p143i5.AbstractC3081e
    /* renamed from: j */
    public p143i5.InterfaceC3082f mo7541j(byte[] r24, int r25, boolean r26) {
            r23 = this;
            r1 = r23
            org.xmlpull.v1.XmlPullParserFactory r0 = r1.f21311n     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            org.xmlpull.v1.XmlPullParser r8 = r0.newPullParser()     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            java.util.HashMap r9 = new java.util.HashMap     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            r9.<init>()     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            java.util.HashMap r10 = new java.util.HashMap     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            r10.<init>()     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            java.util.HashMap r11 = new java.util.HashMap     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            r11.<init>()     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            java.lang.String r0 = ""
            p5.e r2 = new p5.e     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            java.lang.String r13 = ""
            r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r15 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
            r18 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r19 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r20 = -2147483648(0xffffffff80000000, float:-0.0)
            r21 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r22 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            r10.put(r0, r2)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            r2 = 0
            r3 = r24
            r4 = r25
            r0.<init>(r3, r2, r4)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            r3 = 0
            r8.setInput(r0, r3)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            java.util.ArrayDeque r12 = new java.util.ArrayDeque     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            r12.<init>()     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            int r0 = r8.getEventType()     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            p5.c$b r4 = p269p5.C5362c.f21309v     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            p5.c$a r5 = p269p5.C5362c.f21310w     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            r14 = r3
            r13 = 0
        L58:
            r2 = 1
            if (r0 == r2) goto L131
            java.lang.Object r2 = r12.peek()     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            p5.d r2 = (p269p5.C5363d) r2     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            r6 = 2
            if (r13 != 0) goto L11e
            java.lang.String r15 = r8.getName()     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            java.lang.String r7 = "tt"
            if (r0 != r6) goto Le0
            boolean r0 = r7.equals(r15)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            if (r0 == 0) goto L80
            p5.c$b r4 = m11672p(r8)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            p5.c$a r0 = p269p5.C5362c.f21310w     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            p5.c$a r5 = m11670n(r8, r0)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            p5.c$c r3 = m11678v(r8)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
        L80:
            r16 = r3
            r7 = r4
            r17 = r5
            boolean r0 = m11668l(r15)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            java.lang.String r3 = "TtmlDecoder"
            if (r0 != 0) goto Laf
            java.lang.String r0 = "Ignoring unsupported tag: "
            java.lang.String r2 = r8.getName()     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            int r4 = r2.length()     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            if (r4 == 0) goto La2
            java.lang.String r0 = r0.concat(r2)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            goto La8
        La2:
            java.lang.String r2 = new java.lang.String     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            r2.<init>(r0)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            r0 = r2
        La8:
            android.util.Log.i(r3, r0)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            int r13 = r13 + 1
            r15 = r7
            goto Lda
        Laf:
            java.lang.String r0 = "head"
            boolean r0 = r0.equals(r15)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            if (r0 == 0) goto Lc4
            r2 = r8
            r3 = r9
            r4 = r17
            r5 = r16
            r6 = r10
            r15 = r7
            r7 = r11
            m11673q(r2, r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            goto Lda
        Lc4:
            r15 = r7
            p5.d r0 = m11674r(r8, r2, r10, r15)     // Catch: p143i5.C3084h -> Ld2 java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            r12.push(r0)     // Catch: p143i5.C3084h -> Ld2 java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            if (r2 == 0) goto Lda
            r2.m11681a(r0)     // Catch: p143i5.C3084h -> Ld2 java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            goto Lda
        Ld2:
            r0 = move-exception
            java.lang.String r2 = "Suppressing parser error"
            p371v5.C6565o.m13370c(r3, r2, r0)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            int r13 = r13 + 1
        Lda:
            r4 = r15
            r3 = r16
            r5 = r17
            goto L128
        Le0:
            r6 = 4
            if (r0 != r6) goto Lff
            java.util.Objects.requireNonNull(r2)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            java.lang.String r0 = r8.getText()     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            p5.d r0 = p269p5.C5363d.m11679b(r0)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            java.util.List<p5.d> r6 = r2.f21330m     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            if (r6 != 0) goto Lf9
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            r6.<init>()     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            r2.f21330m = r6     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
        Lf9:
            java.util.List<p5.d> r2 = r2.f21330m     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            r2.add(r0)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            goto L128
        Lff:
            r2 = 3
            if (r0 != r2) goto L128
            java.lang.String r0 = r8.getName()     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            boolean r0 = r0.equals(r7)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            if (r0 == 0) goto L11a
            p5.g r14 = new p5.g     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            java.lang.Object r0 = r12.peek()     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            p5.d r0 = (p269p5.C5363d) r0     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            java.util.Objects.requireNonNull(r0)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            r14.<init>(r0, r9, r10, r11)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
        L11a:
            r12.pop()     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            goto L128
        L11e:
            if (r0 != r6) goto L123
            int r13 = r13 + 1
            goto L128
        L123:
            r2 = 3
            if (r0 != r2) goto L128
            int r13 = r13 + (-1)
        L128:
            r8.next()     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            int r0 = r8.getEventType()     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            goto L58
        L131:
            if (r14 == 0) goto L134
            return r14
        L134:
            i5.h r0 = new i5.h     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            java.lang.String r2 = "No TTML subtitles found"
            r0.<init>(r2)     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
            throw r0     // Catch: java.io.IOException -> L13c org.xmlpull.v1.XmlPullParserException -> L145
        L13c:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unexpected error when reading input."
            r2.<init>(r3, r0)
            throw r2
        L145:
            r0 = move-exception
            i5.h r2 = new i5.h
            java.lang.String r3 = "Unable to decode source"
            r2.<init>(r3, r0)
            throw r2
    }
}
