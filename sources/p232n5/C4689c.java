package p232n5;

/* renamed from: n5.c */
/* loaded from: classes.dex */
public final class C4689c {

    /* renamed from: a */
    public final java.lang.String f18692a;

    /* renamed from: b */
    public final int f18693b;

    /* renamed from: c */
    public final java.lang.Integer f18694c;

    /* renamed from: d */
    public final float f18695d;

    /* renamed from: e */
    public final boolean f18696e;

    /* renamed from: f */
    public final boolean f18697f;

    /* renamed from: g */
    public final boolean f18698g;

    /* renamed from: h */
    public final boolean f18699h;

    /* renamed from: n5.c$a */
    public static final class a {

        /* renamed from: a */
        public final int f18700a;

        /* renamed from: b */
        public final int f18701b;

        /* renamed from: c */
        public final int f18702c;

        /* renamed from: d */
        public final int f18703d;

        /* renamed from: e */
        public final int f18704e;

        /* renamed from: f */
        public final int f18705f;

        /* renamed from: g */
        public final int f18706g;

        /* renamed from: h */
        public final int f18707h;

        /* renamed from: i */
        public final int f18708i;

        public a(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
                r0 = this;
                r0.<init>()
                r0.f18700a = r1
                r0.f18701b = r2
                r0.f18702c = r3
                r0.f18703d = r4
                r0.f18704e = r5
                r0.f18705f = r6
                r0.f18706g = r7
                r0.f18707h = r8
                r0.f18708i = r9
                return
        }
    }

    /* renamed from: n5.c$b */
    public static final class b {

        /* renamed from: a */
        public static final java.util.regex.Pattern f18709a = null;

        /* renamed from: b */
        public static final java.util.regex.Pattern f18710b = null;

        /* renamed from: c */
        public static final java.util.regex.Pattern f18711c = null;

        /* renamed from: d */
        public static final java.util.regex.Pattern f18712d = null;

        static {
                java.lang.String r0 = "\\{([^}]*)\\}"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                p232n5.C4689c.b.f18709a = r0
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 0
                java.lang.String r3 = "\\s*\\d+(?:\\.\\d+)?\\s*"
                r1[r2] = r3
                java.lang.String r4 = "\\\\pos\\((%1$s),(%1$s)\\)"
                java.lang.String r1 = p371v5.C6552b0.m13318k(r4, r1)
                java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
                p232n5.C4689c.b.f18710b = r1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r0[r2] = r3
                java.lang.String r1 = "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)"
                java.lang.String r0 = p371v5.C6552b0.m13318k(r1, r0)
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                p232n5.C4689c.b.f18711c = r0
                java.lang.String r0 = "\\\\an(\\d+)"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                p232n5.C4689c.b.f18712d = r0
                return
        }

        /* renamed from: a */
        public static android.graphics.PointF m10735a(java.lang.String r6) {
                java.util.regex.Pattern r0 = p232n5.C4689c.b.f18710b
                java.util.regex.Matcher r0 = r0.matcher(r6)
                java.util.regex.Pattern r1 = p232n5.C4689c.b.f18711c
                java.util.regex.Matcher r1 = r1.matcher(r6)
                boolean r2 = r0.find()
                boolean r3 = r1.find()
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L44
                if (r3 == 0) goto L3b
                int r1 = r6.length()
                int r1 = r1 + 82
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='"
                r2.append(r1)
                r2.append(r6)
                java.lang.String r6 = "'"
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                java.lang.String r1 = "SsaStyle.Overrides"
                android.util.Log.i(r1, r6)
            L3b:
                java.lang.String r6 = r0.group(r5)
                java.lang.String r0 = r0.group(r4)
                goto L4e
            L44:
                if (r3 == 0) goto L6a
                java.lang.String r6 = r1.group(r5)
                java.lang.String r0 = r1.group(r4)
            L4e:
                android.graphics.PointF r1 = new android.graphics.PointF
                java.util.Objects.requireNonNull(r6)
                java.lang.String r6 = r6.trim()
                float r6 = java.lang.Float.parseFloat(r6)
                java.util.Objects.requireNonNull(r0)
                java.lang.String r0 = r0.trim()
                float r0 = java.lang.Float.parseFloat(r0)
                r1.<init>(r6, r0)
                return r1
            L6a:
                r6 = 0
                return r6
        }
    }

    public C4689c(java.lang.String r1, int r2, java.lang.Integer r3, float r4, boolean r5, boolean r6, boolean r7, boolean r8) {
            r0 = this;
            r0.<init>()
            r0.f18692a = r1
            r0.f18693b = r2
            r0.f18694c = r3
            r0.f18695d = r4
            r0.f18696e = r5
            r0.f18697f = r6
            r0.f18698g = r7
            r0.f18699h = r8
            return
    }

    /* renamed from: a */
    public static int m10732a(java.lang.String r2) {
            java.lang.String r0 = r2.trim()     // Catch: java.lang.NumberFormatException -> L11
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L11
            switch(r0) {
                case 1: goto Ld;
                case 2: goto Ld;
                case 3: goto Ld;
                case 4: goto Ld;
                case 5: goto Ld;
                case 6: goto Ld;
                case 7: goto Ld;
                case 8: goto Ld;
                case 9: goto Ld;
                default: goto Lb;
            }
        Lb:
            r1 = 0
            goto Le
        Ld:
            r1 = 1
        Le:
            if (r1 == 0) goto L12
            return r0
        L11:
        L12:
            java.lang.String r0 = "Ignoring unknown alignment: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r1 = r2.length()
            if (r1 == 0) goto L23
            java.lang.String r2 = r0.concat(r2)
            goto L28
        L23:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
        L28:
            java.lang.String r0 = "SsaStyle"
            android.util.Log.w(r0, r2)
            r2 = -1
            return r2
    }

    /* renamed from: b */
    public static boolean m10733b(java.lang.String r5) {
            r0 = 0
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> Ld
            r1 = 1
            if (r5 == r1) goto Lb
            r1 = -1
            if (r5 != r1) goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
        Ld:
            r1 = move-exception
            r2 = 33
            int r2 = p064e.C1489c.m4038a(r5, r2)
            java.lang.String r3 = "Failed to parse boolean value: '"
            java.lang.String r4 = "'"
            java.lang.String r5 = p088f4.C2035p.m5377a(r2, r3, r5, r4)
            java.lang.String r2 = "SsaStyle"
            p371v5.C6565o.m13370c(r2, r5, r1)
            return r0
    }

    /* renamed from: c */
    public static java.lang.Integer m10734c(java.lang.String r8) {
            java.lang.String r0 = "&H"
            boolean r0 = r8.startsWith(r0)     // Catch: java.lang.IllegalArgumentException -> L51
            r1 = 16
            if (r0 == 0) goto L14
            r0 = 2
            java.lang.String r0 = r8.substring(r0)     // Catch: java.lang.IllegalArgumentException -> L51
            long r2 = java.lang.Long.parseLong(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L51
            goto L18
        L14:
            long r2 = java.lang.Long.parseLong(r8)     // Catch: java.lang.IllegalArgumentException -> L51
        L18:
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            p371v5.C6549a.m13288b(r0)     // Catch: java.lang.IllegalArgumentException -> L51
            r8 = 24
            long r4 = r2 >> r8
            r6 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r6
            long r4 = r4 ^ r6
            int r8 = p074e9.C1806b.m4542u(r4)
            long r0 = r2 >> r1
            long r0 = r0 & r6
            int r0 = p074e9.C1806b.m4542u(r0)
            r1 = 8
            long r4 = r2 >> r1
            long r4 = r4 & r6
            int r1 = p074e9.C1806b.m4542u(r4)
            long r2 = r2 & r6
            int r2 = p074e9.C1806b.m4542u(r2)
            int r8 = android.graphics.Color.argb(r8, r2, r1, r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L51:
            r0 = move-exception
            r1 = 36
            int r1 = p064e.C1489c.m4038a(r8, r1)
            java.lang.String r2 = "Failed to parse color expression: '"
            java.lang.String r3 = "'"
            java.lang.String r8 = p088f4.C2035p.m5377a(r1, r2, r8, r3)
            java.lang.String r1 = "SsaStyle"
            p371v5.C6565o.m13370c(r1, r8, r0)
            r8 = 0
            return r8
    }
}
