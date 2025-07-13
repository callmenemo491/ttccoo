package p249o7;

/* renamed from: o7.z6 */
/* loaded from: classes.dex */
public abstract class AbstractC5156z6 {

    /* renamed from: a */
    public final java.lang.String f20207a;

    /* renamed from: b */
    public final int f20208b;

    /* renamed from: c */
    public java.lang.Boolean f20209c;

    /* renamed from: d */
    public java.lang.Boolean f20210d;

    /* renamed from: e */
    public java.lang.Long f20211e;

    /* renamed from: f */
    public java.lang.Long f20212f;

    public AbstractC5156z6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f20207a = r1
            r0.f20208b = r2
            return
    }

    /* renamed from: a */
    public static java.lang.Boolean m11461a(java.math.BigDecimal r8, p185k7.C4048y1 r9, double r10) {
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r9, r0)
            boolean r0 = r9.m9124y()
            r1 = 0
            if (r0 == 0) goto L10b
            int r0 = r9.m9119D()
            r2 = 1
            if (r0 != r2) goto L15
            goto L10b
        L15:
            int r0 = r9.m9119D()
            r3 = 5
            if (r0 != r3) goto L2a
            boolean r0 = r9.m9118C()
            if (r0 == 0) goto L29
            boolean r0 = r9.m9117B()
            if (r0 == 0) goto L29
            goto L31
        L29:
            return r1
        L2a:
            boolean r0 = r9.m9125z()
            if (r0 != 0) goto L31
            return r1
        L31:
            int r0 = r9.m9119D()
            int r4 = r9.m9119D()
            if (r4 != r3) goto L66
            java.lang.String r4 = r9.m9122w()
            boolean r4 = p249o7.C5068o6.m11384O(r4)
            if (r4 == 0) goto L65
            java.lang.String r4 = r9.m9121v()
            boolean r4 = p249o7.C5068o6.m11384O(r4)
            if (r4 != 0) goto L50
            goto L65
        L50:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L65
            java.lang.String r5 = r9.m9122w()     // Catch: java.lang.NumberFormatException -> L65
            r4.<init>(r5)     // Catch: java.lang.NumberFormatException -> L65
            java.math.BigDecimal r5 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L65
            java.lang.String r9 = r9.m9121v()     // Catch: java.lang.NumberFormatException -> L65
            r5.<init>(r9)     // Catch: java.lang.NumberFormatException -> L65
            r9 = r4
            r4 = r1
            goto L7c
        L65:
            return r1
        L66:
            java.lang.String r4 = r9.m9120u()
            boolean r4 = p249o7.C5068o6.m11384O(r4)
            if (r4 != 0) goto L71
            return r1
        L71:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L10b
            java.lang.String r9 = r9.m9120u()     // Catch: java.lang.NumberFormatException -> L10b
            r4.<init>(r9)     // Catch: java.lang.NumberFormatException -> L10b
            r9 = r1
            r5 = r9
        L7c:
            if (r0 != r3) goto L81
            if (r9 == 0) goto Lfd
            goto L85
        L81:
            if (r4 != 0) goto L85
            goto Lfd
        L85:
            int r0 = r0 + (-1)
            r3 = 0
            if (r0 == r2) goto Lfb
            r6 = 2
            if (r0 == r6) goto Leb
            r7 = 3
            if (r0 == r7) goto La4
            r10 = 4
            if (r0 == r10) goto L95
            goto Lfd
        L95:
            if (r9 == 0) goto Lfd
            int r9 = r8.compareTo(r9)
            if (r9 < 0) goto Le5
            int r8 = r8.compareTo(r5)
            if (r8 > 0) goto Le5
            goto Le6
        La4:
            if (r4 != 0) goto La7
            goto Lfd
        La7:
            r0 = 0
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 == 0) goto Lde
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r0)
            java.math.BigDecimal r9 = r4.subtract(r9)
            int r9 = r8.compareTo(r9)
            if (r9 <= 0) goto Le5
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r10)
            java.math.BigDecimal r9 = r4.add(r9)
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto Le5
            goto Le6
        Lde:
            int r8 = r8.compareTo(r4)
            if (r8 != 0) goto Le5
            goto Le6
        Le5:
            r2 = 0
        Le6:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto Lfd
        Leb:
            if (r4 != 0) goto Lee
            goto Lfd
        Lee:
            int r8 = r8.compareTo(r4)
            if (r8 <= 0) goto Lf5
            goto Lf6
        Lf5:
            r2 = 0
        Lf6:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        Lfb:
            if (r4 != 0) goto Lfe
        Lfd:
            return r1
        Lfe:
            int r8 = r8.compareTo(r4)
            if (r8 >= 0) goto L105
            goto L106
        L105:
            r2 = 0
        L106:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L10b:
            return r1
    }

    /* renamed from: b */
    public static java.lang.Boolean m11462b(java.lang.String r10, p185k7.C3783e2 r11, com.google.android.gms.measurement.internal.C1111b r12) {
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r11, r0)
            r0 = 0
            if (r10 != 0) goto L9
            return r0
        L9:
            boolean r1 = r11.m8510A()
            if (r1 == 0) goto Le9
            int r1 = r11.m8511B()
            r2 = 1
            if (r1 != r2) goto L18
            goto Le9
        L18:
            int r1 = r11.m8511B()
            r3 = 7
            if (r1 != r3) goto L27
            int r1 = r11.m8512s()
            if (r1 == 0) goto L26
            goto L2e
        L26:
            return r0
        L27:
            boolean r1 = r11.m8517z()
            if (r1 != 0) goto L2e
            return r0
        L2e:
            int r1 = r11.m8511B()
            boolean r4 = r11.m8515x()
            r5 = 2
            if (r4 != 0) goto L49
            if (r1 == r5) goto L49
            if (r1 != r3) goto L3e
            goto L49
        L3e:
            java.lang.String r6 = r11.m8513v()
            java.util.Locale r7 = java.util.Locale.ENGLISH
            java.lang.String r6 = r6.toUpperCase(r7)
            goto L4d
        L49:
            java.lang.String r6 = r11.m8513v()
        L4d:
            int r7 = r11.m8512s()
            if (r7 != 0) goto L55
            r11 = r0
            goto L82
        L55:
            java.util.List r11 = r11.m8514w()
            if (r4 != 0) goto L82
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = r11.size()
            r7.<init>(r8)
            java.util.Iterator r11 = r11.iterator()
        L68:
            boolean r8 = r11.hasNext()
            if (r8 == 0) goto L7e
            java.lang.Object r8 = r11.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.Locale r9 = java.util.Locale.ENGLISH
            java.lang.String r8 = r8.toUpperCase(r9)
            r7.add(r8)
            goto L68
        L7e:
            java.util.List r11 = java.util.Collections.unmodifiableList(r7)
        L82:
            if (r1 != r5) goto L86
            r7 = r6
            goto L87
        L86:
            r7 = r0
        L87:
            if (r1 != r3) goto L92
            if (r11 == 0) goto Le9
            int r3 = r11.size()
            if (r3 == 0) goto Le9
            goto L95
        L92:
            if (r6 != 0) goto L95
            goto Le9
        L95:
            if (r4 != 0) goto L9f
            if (r1 == r5) goto L9f
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r10 = r10.toUpperCase(r3)
        L9f:
            int r1 = r1 + (-1)
            switch(r1) {
                case 1: goto Lc5;
                case 2: goto Lbc;
                case 3: goto Lb7;
                case 4: goto Lb2;
                case 5: goto Lad;
                case 6: goto La5;
                default: goto La4;
            }
        La4:
            goto Le9
        La5:
            if (r11 != 0) goto La8
            goto Le9
        La8:
            boolean r10 = r11.contains(r10)
            goto Lc0
        Lad:
            boolean r10 = r10.equals(r6)
            goto Lc0
        Lb2:
            boolean r10 = r10.contains(r6)
            goto Lc0
        Lb7:
            boolean r10 = r10.endsWith(r6)
            goto Lc0
        Lbc:
            boolean r10 = r10.startsWith(r6)
        Lc0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            goto Le9
        Lc5:
            if (r7 != 0) goto Lc8
            goto Le9
        Lc8:
            if (r2 == r4) goto Lcd
            r11 = 66
            goto Lce
        Lcd:
            r11 = 0
        Lce:
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r7, r11)     // Catch: java.util.regex.PatternSyntaxException -> Ldf
            java.util.regex.Matcher r10 = r11.matcher(r10)     // Catch: java.util.regex.PatternSyntaxException -> Ldf
            boolean r10 = r10.matches()     // Catch: java.util.regex.PatternSyntaxException -> Ldf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch: java.util.regex.PatternSyntaxException -> Ldf
            goto Le9
        Ldf:
            if (r12 == 0) goto Le9
            o7.f3 r10 = r12.f5675i
            java.lang.String r11 = "Invalid regular expression in REGEXP audience filter. expression"
            r10.m11170d(r11, r7)
        Le9:
            return r0
    }

    /* renamed from: c */
    public static java.lang.Boolean m11463c(long r1, p185k7.C4048y1 r3) {
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> Lc
            r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> Lc
            r1 = 0
            java.lang.Boolean r1 = m11461a(r0, r3, r1)     // Catch: java.lang.NumberFormatException -> Lc
            return r1
        Lc:
            r1 = 0
            return r1
    }

    /* renamed from: d */
    public static java.lang.Boolean m11464d(java.lang.String r4, p185k7.C4048y1 r5) {
            boolean r0 = p249o7.C5068o6.m11384O(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L14
            r0.<init>(r4)     // Catch: java.lang.NumberFormatException -> L14
            r2 = 0
            java.lang.Boolean r4 = m11461a(r0, r5, r2)     // Catch: java.lang.NumberFormatException -> L14
            return r4
        L14:
            return r1
    }

    /* renamed from: e */
    public static java.lang.Boolean m11465e(java.lang.Boolean r0, boolean r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            boolean r0 = r0.booleanValue()
            if (r0 == r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }
}
