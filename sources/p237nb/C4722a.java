package p237nb;

/* renamed from: nb.a */
/* loaded from: classes.dex */
public class C4722a {

    /* renamed from: a */
    public static final java.util.TimeZone f18836a = null;

    static {
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            p237nb.C4722a.f18836a = r0
            return
    }

    /* renamed from: a */
    public static boolean m10778a(java.lang.String r1, int r2, char r3) {
            int r0 = r1.length()
            if (r2 >= r0) goto Le
            char r1 = r1.charAt(r2)
            if (r1 != r3) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    /* renamed from: b */
    public static java.util.Date m10779b(java.lang.String r17, java.text.ParsePosition r18) {
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            int r3 = r0 + 4
            int r0 = m10780c(r1, r0, r3)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r4 = 45
            boolean r5 = m10778a(r1, r3, r4)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            if (r5 == 0) goto L18
            int r3 = r3 + 1
        L18:
            int r5 = r3 + 2
            int r3 = m10780c(r1, r3, r5)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            boolean r6 = m10778a(r1, r5, r4)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            if (r6 == 0) goto L26
            int r5 = r5 + 1
        L26:
            int r6 = r5 + 2
            int r5 = m10780c(r1, r5, r6)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r7 = 84
            boolean r7 = m10778a(r1, r6, r7)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r8 = 1
            if (r7 != 0) goto L49
            int r9 = r17.length()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            if (r9 > r6) goto L49
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            int r3 = r3 - r8
            r4.<init>(r0, r3, r5)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r2.setIndex(r6)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.util.Date r0 = r4.getTime()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            return r0
        L49:
            r9 = 43
            r10 = 90
            r11 = 2
            if (r7 == 0) goto Ld2
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = m10780c(r1, r6, r7)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r12 = 58
            boolean r13 = m10778a(r1, r7, r12)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            if (r13 == 0) goto L62
            int r7 = r7 + 1
        L62:
            int r13 = r7 + 2
            int r7 = m10780c(r1, r7, r13)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            boolean r12 = m10778a(r1, r13, r12)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            if (r12 == 0) goto L70
            int r13 = r13 + 1
        L70:
            int r12 = r17.length()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            if (r12 <= r13) goto Lcf
            char r12 = r1.charAt(r13)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            if (r12 == r10) goto Lcf
            if (r12 == r9) goto Lcf
            if (r12 == r4) goto Lcf
            int r4 = r13 + 2
            int r12 = m10780c(r1, r13, r4)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r13 = 59
            if (r12 <= r13) goto L90
            r13 = 63
            if (r12 >= r13) goto L90
            r12 = 59
        L90:
            r13 = 46
            boolean r13 = m10778a(r1, r4, r13)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            if (r13 == 0) goto Lcd
            int r4 = r4 + 1
            int r13 = r4 + 1
        L9c:
            int r14 = r17.length()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            if (r13 >= r14) goto Lb2
            char r14 = r1.charAt(r13)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r15 = 48
            if (r14 < r15) goto Lb6
            r15 = 57
            if (r14 <= r15) goto Laf
            goto Lb6
        Laf:
            int r13 = r13 + 1
            goto L9c
        Lb2:
            int r13 = r17.length()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
        Lb6:
            int r14 = r4 + 3
            int r14 = java.lang.Math.min(r13, r14)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            int r15 = m10780c(r1, r4, r14)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            int r14 = r14 - r4
            if (r14 == r8) goto Lc9
            if (r14 == r11) goto Lc6
            goto Lcb
        Lc6:
            int r15 = r15 * 10
            goto Lcb
        Lc9:
            int r15 = r15 * 100
        Lcb:
            r4 = r13
            goto Ldb
        Lcd:
            r15 = 0
            goto Ldb
        Lcf:
            r4 = r6
            r6 = r13
            goto Ld4
        Ld2:
            r4 = 0
            r7 = 0
        Ld4:
            r15 = 0
            r12 = 0
            r16 = r6
            r6 = r4
            r4 = r16
        Ldb:
            int r11 = r17.length()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            if (r11 <= r4) goto L1c8
            char r11 = r1.charAt(r4)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r13 = 5
            if (r11 != r10) goto Led
            java.util.TimeZone r9 = p237nb.C4722a.f18836a     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            int r4 = r4 + r8
            goto L197
        Led:
            if (r11 == r9) goto L110
            r9 = 45
            if (r11 != r9) goto Lf4
            goto L110
        Lf4:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r3.<init>()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r3.append(r11)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            throw r0     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
        L110:
            java.lang.String r9 = r1.substring(r4)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            int r10 = r9.length()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            if (r10 < r13) goto L11b
            goto L12c
        L11b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r10.<init>()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r10.append(r9)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.lang.String r9 = "00"
            r10.append(r9)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.lang.String r9 = r10.toString()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
        L12c:
            int r10 = r9.length()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            int r4 = r4 + r10
            java.lang.String r10 = "+0000"
            boolean r10 = r10.equals(r9)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            if (r10 != 0) goto L195
            java.lang.String r10 = "+00:00"
            boolean r10 = r10.equals(r9)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            if (r10 == 0) goto L142
            goto L195
        L142:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r10.<init>()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.lang.String r11 = "GMT"
            r10.append(r11)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r10.append(r9)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.lang.String r9 = r10.toString()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.util.TimeZone r10 = java.util.TimeZone.getTimeZone(r9)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.lang.String r11 = r10.getID()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            boolean r13 = r11.equals(r9)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            if (r13 != 0) goto L193
            java.lang.String r13 = ":"
            java.lang.String r14 = ""
            java.lang.String r11 = r11.replace(r13, r14)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            boolean r11 = r11.equals(r9)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            if (r11 == 0) goto L170
            goto L193
        L170:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r3.<init>()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.lang.String r4 = "Mismatching time zone indicator: "
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r3.append(r9)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.lang.String r4 = r10.getID()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            throw r0     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
        L193:
            r9 = r10
            goto L197
        L195:
            java.util.TimeZone r9 = p237nb.C4722a.f18836a     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
        L197:
            java.util.GregorianCalendar r10 = new java.util.GregorianCalendar     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r10.<init>(r9)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r9 = 0
            r10.setLenient(r9)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r10.set(r8, r0)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            int r3 = r3 - r8
            r0 = 2
            r10.set(r0, r3)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r0 = 5
            r10.set(r0, r5)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r0 = 11
            r10.set(r0, r6)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r0 = 12
            r10.set(r0, r7)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r0 = 13
            r10.set(r0, r12)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r0 = 14
            r10.set(r0, r15)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            r2.setIndex(r4)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.util.Date r0 = r10.getTime()     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            return r0
        L1c8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
            throw r0     // Catch: java.lang.IllegalArgumentException -> L1d0 java.lang.NumberFormatException -> L1d2 java.lang.IndexOutOfBoundsException -> L1d4
        L1d0:
            r0 = move-exception
            goto L1d5
        L1d2:
            r0 = move-exception
            goto L1d5
        L1d4:
            r0 = move-exception
        L1d5:
            if (r1 != 0) goto L1d9
            r1 = 0
            goto L1ed
        L1d9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 34
            r3.append(r4)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L1ed:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L1f9
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L213
        L1f9:
            java.lang.String r3 = "("
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L213:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to parse date ["
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
    }

    /* renamed from: c */
    public static int m10780c(java.lang.String r5, int r6, int r7) {
            if (r6 < 0) goto L5f
            int r0 = r5.length()
            if (r7 > r0) goto L5f
            if (r6 > r7) goto L5f
            java.lang.String r0 = "Invalid number: "
            r1 = 10
            if (r6 >= r7) goto L33
            int r2 = r6 + 1
            char r3 = r5.charAt(r6)
            int r3 = java.lang.Character.digit(r3, r1)
            if (r3 < 0) goto L1e
            int r3 = -r3
            goto L35
        L1e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r5 = r5.substring(r6, r7)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r1.<init>(r5)
            throw r1
        L33:
            r3 = 0
            r2 = r6
        L35:
            if (r2 >= r7) goto L5d
            int r4 = r2 + 1
            char r2 = r5.charAt(r2)
            int r2 = java.lang.Character.digit(r2, r1)
            if (r2 < 0) goto L48
            int r3 = r3 * 10
            int r3 = r3 - r2
            r2 = r4
            goto L35
        L48:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r5 = r5.substring(r6, r7)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r1.<init>(r5)
            throw r1
        L5d:
            int r5 = -r3
            return r5
        L5f:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            r6.<init>(r5)
            throw r6
    }
}
