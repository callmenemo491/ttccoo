package p036c6;

/* renamed from: c6.e */
/* loaded from: classes.dex */
public final class C0881e {
    /* renamed from: a */
    public static java.lang.String m2596a(java.lang.String r6, java.lang.String r7, java.util.Collection<java.lang.String> r8, boolean r9, boolean r10) {
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            java.lang.String r6 = r7.toUpperCase()
            java.lang.String r10 = "[A-F0-9]+"
            boolean r10 = r6.matches(r10)
            if (r10 != 0) goto L29
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Invalid application ID: "
            int r9 = r7.length()
            if (r9 == 0) goto L20
            java.lang.String r7 = r8.concat(r7)
            goto L25
        L20:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r8)
        L25:
            r6.<init>(r7)
            throw r6
        L29:
            java.lang.String r7 = "/"
            r9.append(r7)
            r9.append(r6)
            if (r8 == 0) goto Lcd
            boolean r6 = r8.isEmpty()
            if (r6 != 0) goto Lc5
            r9.append(r7)
            java.util.Iterator r6 = r8.iterator()
            r10 = 1
            r0 = 0
            r1 = 1
        L43:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lcd
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            p123h6.C2487a.m6366e(r2)
            if (r1 != 0) goto L59
            java.lang.String r1 = ","
            r9.append(r1)
        L59:
            java.util.regex.Pattern r1 = p123h6.C2487a.f11248a
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L66
            goto Lbf
        L66:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r3 = r2.length()
            r1.<init>(r3)
            r3 = 0
        L70:
            int r4 = r2.length()
            if (r3 >= r4) goto Lbb
            char r4 = r2.charAt(r3)
            r5 = 65
            if (r4 < r5) goto L82
            r5 = 90
            if (r4 <= r5) goto Lb5
        L82:
            r5 = 97
            if (r4 < r5) goto L8a
            r5 = 122(0x7a, float:1.71E-43)
            if (r4 <= r5) goto Lb5
        L8a:
            r5 = 48
            if (r4 < r5) goto L92
            r5 = 57
            if (r4 <= r5) goto Lb5
        L92:
            r5 = 95
            if (r4 == r5) goto Lb5
            r5 = 45
            if (r4 != r5) goto L9b
            goto Lb5
        L9b:
            r5 = 46
            if (r4 == r5) goto Lb5
            r5 = 58
            if (r4 == r5) goto Lb5
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r0] = r4
            java.lang.String r4 = "%%%04x"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r1.append(r4)
            goto Lb8
        Lb5:
            r1.append(r4)
        Lb8:
            int r3 = r3 + 1
            goto L70
        Lbb:
            java.lang.String r2 = r1.toString()
        Lbf:
            r9.append(r2)
            r1 = 0
            goto L43
        Lc5:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Must specify at least one namespace"
            r6.<init>(r7)
            throw r6
        Lcd:
            if (r8 != 0) goto Ld2
            r9.append(r7)
        Ld2:
            java.lang.String r6 = "//ALLOW_IPV6"
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            return r6
    }
}
