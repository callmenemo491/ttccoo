package bi;

/* renamed from: bi.m */
/* loaded from: classes.dex */
public final class C0793m {

    /* renamed from: j */
    public static final java.util.regex.Pattern f4307j = null;

    /* renamed from: k */
    public static final java.util.regex.Pattern f4308k = null;

    /* renamed from: l */
    public static final java.util.regex.Pattern f4309l = null;

    /* renamed from: m */
    public static final java.util.regex.Pattern f4310m = null;

    /* renamed from: n */
    public static final bi.C0793m f4311n = null;

    /* renamed from: a */
    public final java.lang.String f4312a;

    /* renamed from: b */
    public final java.lang.String f4313b;

    /* renamed from: c */
    public final long f4314c;

    /* renamed from: d */
    public final java.lang.String f4315d;

    /* renamed from: e */
    public final java.lang.String f4316e;

    /* renamed from: f */
    public final boolean f4317f;

    /* renamed from: g */
    public final boolean f4318g;

    /* renamed from: h */
    public final boolean f4319h;

    /* renamed from: i */
    public final boolean f4320i;

    static {
            java.lang.String r0 = "(\\d{2,4})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            bi.C0793m.f4307j = r0
            java.lang.String r0 = "(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            bi.C0793m.f4308k = r0
            java.lang.String r0 = "(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            bi.C0793m.f4309l = r0
            java.lang.String r0 = "(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            bi.C0793m.f4310m = r0
            return
    }

    public C0793m(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, boolean r9, boolean r10, p239nh.C4826f r11) {
            r0 = this;
            r0.<init>()
            r0.f4312a = r1
            r0.f4313b = r2
            r0.f4314c = r3
            r0.f4315d = r5
            r0.f4316e = r6
            r0.f4317f = r7
            r0.f4318g = r8
            r0.f4319h = r9
            r0.f4320i = r10
            return
    }

    /* renamed from: a */
    public static final int m2412a(java.lang.String r3, int r4, int r5, boolean r6) {
        L0:
            if (r4 >= r5) goto L3a
            char r0 = r3.charAt(r4)
            r1 = 32
            if (r0 >= r1) goto Le
            r1 = 9
            if (r0 != r1) goto L31
        Le:
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 >= r1) goto L31
            r1 = 57
            r2 = 48
            if (r2 > r0) goto L1a
            if (r1 >= r0) goto L31
        L1a:
            r1 = 122(0x7a, float:1.71E-43)
            r2 = 97
            if (r2 > r0) goto L22
            if (r1 >= r0) goto L31
        L22:
            r1 = 90
            r2 = 65
            if (r2 > r0) goto L2a
            if (r1 >= r0) goto L31
        L2a:
            r1 = 58
            if (r0 != r1) goto L2f
            goto L31
        L2f:
            r0 = 0
            goto L32
        L31:
            r0 = 1
        L32:
            r1 = r6 ^ 1
            if (r0 != r1) goto L37
            return r4
        L37:
            int r4 = r4 + 1
            goto L0
        L3a:
            return r5
    }

    /* renamed from: b */
    public static final long m2413b(java.lang.String r12, int r13, int r14) {
            r0 = 0
            int r13 = m2412a(r12, r13, r14, r0)
            java.util.regex.Pattern r0 = bi.C0793m.f4310m
            java.util.regex.Matcher r0 = r0.matcher(r12)
            r1 = -1
            r2 = -1
            r3 = -1
            r4 = -1
            r5 = -1
            r6 = -1
            r7 = -1
        L12:
            r8 = 2
            r9 = 1
            if (r13 >= r14) goto Ld0
            int r10 = r13 + 1
            int r10 = m2412a(r12, r10, r14, r9)
            r0.region(r13, r10)
            java.lang.String r13 = "matcher.group(1)"
            if (r3 != r1) goto L5a
            java.util.regex.Pattern r11 = bi.C0793m.f4310m
            java.util.regex.Matcher r11 = r0.usePattern(r11)
            boolean r11 = r11.matches()
            if (r11 == 0) goto L5a
            java.lang.String r3 = r0.group(r9)
            p214m2.C4339q.m9705j(r3, r13)
            int r13 = java.lang.Integer.parseInt(r3)
            java.lang.String r3 = r0.group(r8)
            java.lang.String r6 = "matcher.group(2)"
            p214m2.C4339q.m9705j(r3, r6)
            int r3 = java.lang.Integer.parseInt(r3)
            r6 = 3
            java.lang.String r6 = r0.group(r6)
            java.lang.String r7 = "matcher.group(3)"
            p214m2.C4339q.m9705j(r6, r7)
            int r6 = java.lang.Integer.parseInt(r6)
            r7 = r6
            r6 = r3
            r3 = r13
            goto Lc7
        L5a:
            if (r4 != r1) goto L75
            java.util.regex.Pattern r8 = bi.C0793m.f4309l
            java.util.regex.Matcher r8 = r0.usePattern(r8)
            boolean r8 = r8.matches()
            if (r8 == 0) goto L75
            java.lang.String r4 = r0.group(r9)
            p214m2.C4339q.m9705j(r4, r13)
            int r13 = java.lang.Integer.parseInt(r4)
            r4 = r13
            goto Lc7
        L75:
            if (r5 != r1) goto Lad
            java.util.regex.Pattern r8 = bi.C0793m.f4308k
            java.util.regex.Matcher r11 = r0.usePattern(r8)
            boolean r11 = r11.matches()
            if (r11 == 0) goto Lad
            java.lang.String r5 = r0.group(r9)
            p214m2.C4339q.m9705j(r5, r13)
            java.util.Locale r13 = java.util.Locale.US
            java.lang.String r9 = "Locale.US"
            p214m2.C4339q.m9705j(r13, r9)
            java.lang.String r13 = r5.toLowerCase(r13)
            java.lang.String r5 = "(this as java.lang.String).toLowerCase(locale)"
            p214m2.C4339q.m9705j(r13, r5)
            java.lang.String r5 = r8.pattern()
            java.lang.String r8 = "MONTH_PATTERN.pattern()"
            p214m2.C4339q.m9705j(r5, r8)
            r8 = 6
            r9 = 0
            int r13 = p362uh.C6467m.m13070a0(r5, r13, r9, r9, r8)
            int r13 = r13 / 4
            r5 = r13
            goto Lc7
        Lad:
            if (r2 != r1) goto Lc7
            java.util.regex.Pattern r8 = bi.C0793m.f4307j
            java.util.regex.Matcher r8 = r0.usePattern(r8)
            boolean r8 = r8.matches()
            if (r8 == 0) goto Lc7
            java.lang.String r2 = r0.group(r9)
            p214m2.C4339q.m9705j(r2, r13)
            int r13 = java.lang.Integer.parseInt(r2)
            r2 = r13
        Lc7:
            int r10 = r10 + 1
            r13 = 0
            int r13 = m2412a(r12, r10, r14, r13)
            goto L12
        Ld0:
            r12 = 99
            r13 = 70
            if (r13 <= r2) goto Ld7
            goto Ldb
        Ld7:
            if (r12 < r2) goto Ldb
            int r2 = r2 + 1900
        Ldb:
            r12 = 69
            if (r2 >= 0) goto Le0
            goto Le4
        Le0:
            if (r12 < r2) goto Le4
            int r2 = r2 + 2000
        Le4:
            r12 = 1601(0x641, float:2.243E-42)
            if (r2 < r12) goto Lea
            r12 = 1
            goto Leb
        Lea:
            r12 = 0
        Leb:
            java.lang.String r13 = "Failed requirement."
            if (r12 == 0) goto L186
            if (r5 == r1) goto Lf3
            r12 = 1
            goto Lf4
        Lf3:
            r12 = 0
        Lf4:
            if (r12 == 0) goto L17c
            r12 = 31
            if (r9 <= r4) goto Lfb
            goto Lff
        Lfb:
            if (r12 < r4) goto Lff
            r12 = 1
            goto L100
        Lff:
            r12 = 0
        L100:
            if (r12 == 0) goto L172
            r12 = 23
            if (r3 >= 0) goto L107
            goto L10b
        L107:
            if (r12 < r3) goto L10b
            r12 = 1
            goto L10c
        L10b:
            r12 = 0
        L10c:
            if (r12 == 0) goto L168
            r12 = 59
            if (r6 >= 0) goto L113
            goto L117
        L113:
            if (r12 < r6) goto L117
            r14 = 1
            goto L118
        L117:
            r14 = 0
        L118:
            if (r14 == 0) goto L15e
            if (r7 >= 0) goto L11d
            goto L121
        L11d:
            if (r12 < r7) goto L121
            r12 = 1
            goto L122
        L121:
            r12 = 0
        L122:
            if (r12 == 0) goto L154
            java.util.GregorianCalendar r12 = new java.util.GregorianCalendar
            java.util.TimeZone r13 = ci.C0988c.f5069e
            r12.<init>(r13)
            r13 = 0
            r12.setLenient(r13)
            r12.set(r9, r2)
            int r5 = r5 - r9
            r12.set(r8, r5)
            r13 = 5
            r12.set(r13, r4)
            r13 = 11
            r12.set(r13, r3)
            r13 = 12
            r12.set(r13, r6)
            r13 = 13
            r12.set(r13, r7)
            r13 = 14
            r14 = 0
            r12.set(r13, r14)
            long r12 = r12.getTimeInMillis()
            return r12
        L154:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L15e:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L168:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L172:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L17c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L186:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
    }

    /* renamed from: c */
    public static final long m2414c(java.lang.String r6) {
            r0 = -9223372036854775808
            long r2 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> Lf
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto Ld
            goto Le
        Ld:
            r0 = r2
        Le:
            return r0
        Lf:
            r2 = move-exception
            java.lang.String r3 = "-?\\d+"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.lang.String r4 = "compile(pattern)"
            p214m2.C4339q.m9705j(r3, r4)
            java.util.regex.Matcher r3 = r3.matcher(r6)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L36
            r2 = 0
            r3 = 2
            java.lang.String r4 = "-"
            boolean r6 = p362uh.C6463i.m13061R(r6, r4, r2, r3)
            if (r6 == 0) goto L30
            goto L35
        L30:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L35:
            return r0
        L36:
            throw r2
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof bi.C0793m
            if (r0 == 0) goto L50
            bi.m r6 = (bi.C0793m) r6
            java.lang.String r0 = r6.f4312a
            java.lang.String r1 = r5.f4312a
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L50
            java.lang.String r0 = r6.f4313b
            java.lang.String r1 = r5.f4313b
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L50
            long r0 = r6.f4314c
            long r2 = r5.f4314c
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L50
            java.lang.String r0 = r6.f4315d
            java.lang.String r1 = r5.f4315d
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L50
            java.lang.String r0 = r6.f4316e
            java.lang.String r1 = r5.f4316e
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L50
            boolean r0 = r6.f4317f
            boolean r1 = r5.f4317f
            if (r0 != r1) goto L50
            boolean r0 = r6.f4318g
            boolean r1 = r5.f4318g
            if (r0 != r1) goto L50
            boolean r0 = r6.f4319h
            boolean r1 = r5.f4319h
            if (r0 != r1) goto L50
            boolean r6 = r6.f4320i
            boolean r0 = r5.f4320i
            if (r6 != r0) goto L50
            r6 = 1
            goto L51
        L50:
            r6 = 0
        L51:
            return r6
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.f4312a
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r0, r1, r2)
            java.lang.String r1 = r5.f4313b
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            long r1 = r5.f4314c
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r1 = r5.f4315d
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r5.f4316e
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            boolean r1 = r5.f4317f
            r2 = 1231(0x4cf, float:1.725E-42)
            if (r1 == 0) goto L32
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L34
        L32:
            r1 = 1237(0x4d5, float:1.733E-42)
        L34:
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r5.f4318g
            if (r1 == 0) goto L3e
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L40
        L3e:
            r1 = 1237(0x4d5, float:1.733E-42)
        L40:
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r5.f4319h
            if (r1 == 0) goto L4a
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L4c
        L4a:
            r1 = 1237(0x4d5, float:1.733E-42)
        L4c:
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r5.f4320i
            if (r1 == 0) goto L54
            goto L56
        L54:
            r2 = 1237(0x4d5, float:1.733E-42)
        L56:
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.f4312a
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.String r1 = r6.f4313b
            r0.append(r1)
            boolean r1 = r6.f4319h
            if (r1 == 0) goto L4a
            long r1 = r6.f4314c
            r3 = -9223372036854775808
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L23
            java.lang.String r1 = "; max-age=0"
            goto L47
        L23:
            java.lang.String r1 = "; expires="
            r0.append(r1)
            java.util.Date r1 = new java.util.Date
            long r2 = r6.f4314c
            r1.<init>(r2)
            gi.c$a r2 = gi.C2393c.f10776a
            java.lang.String r2 = "$this$toHttpDateString"
            p214m2.C4339q.m9706k(r1, r2)
            gi.c$a r2 = gi.C2393c.f10776a
            java.lang.Object r2 = r2.get()
            java.text.DateFormat r2 = (java.text.DateFormat) r2
            java.lang.String r1 = r2.format(r1)
            java.lang.String r2 = "STANDARD_DATE_FORMAT.get().format(this)"
            p214m2.C4339q.m9705j(r1, r2)
        L47:
            r0.append(r1)
        L4a:
            boolean r1 = r6.f4320i
            if (r1 != 0) goto L58
            java.lang.String r1 = "; domain="
            r0.append(r1)
            java.lang.String r1 = r6.f4315d
            r0.append(r1)
        L58:
            java.lang.String r1 = "; path="
            r0.append(r1)
            java.lang.String r1 = r6.f4316e
            r0.append(r1)
            boolean r1 = r6.f4317f
            if (r1 == 0) goto L6b
            java.lang.String r1 = "; secure"
            r0.append(r1)
        L6b:
            boolean r1 = r6.f4318g
            if (r1 == 0) goto L74
            java.lang.String r1 = "; httponly"
            r0.append(r1)
        L74:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString()"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }
}
