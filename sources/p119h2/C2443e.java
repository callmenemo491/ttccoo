package p119h2;

/* renamed from: h2.e */
/* loaded from: classes.dex */
public class C2443e {
    /* renamed from: a */
    public static java.util.Map<java.lang.String, java.lang.String> m6213a(p105g2.InterfaceC2208b.a r5) {
            if (r5 != 0) goto L7
            java.util.Map r5 = java.util.Collections.emptyMap()
            return r5
        L7:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = r5.f10105b
            if (r1 == 0) goto L15
            java.lang.String r2 = "If-None-Match"
            r0.put(r2, r1)
        L15:
            long r1 = r5.f10107d
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L3d
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r4 = "EEE, dd MMM yyyy HH:mm:ss 'GMT'"
            r5.<init>(r4, r3)
            java.lang.String r3 = "GMT"
            java.util.TimeZone r3 = java.util.TimeZone.getTimeZone(r3)
            r5.setTimeZone(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r1)
            java.lang.String r5 = r5.format(r3)
            java.lang.String r1 = "If-Modified-Since"
            r0.put(r1, r5)
        L3d:
            return r0
    }

    /* renamed from: b */
    public static java.lang.String m6214b(java.util.Map<java.lang.String, java.lang.String> r7) {
            java.lang.String r0 = "ISO-8859-1"
            if (r7 != 0) goto L5
            goto L3b
        L5:
            java.lang.String r1 = "Content-Type"
            java.lang.Object r7 = r7.get(r1)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L3b
            r1 = 0
            java.lang.String r2 = ";"
            java.lang.String[] r7 = r7.split(r2, r1)
            r2 = 1
            r3 = 1
        L18:
            int r4 = r7.length
            if (r3 >= r4) goto L3b
            r4 = r7[r3]
            java.lang.String r4 = r4.trim()
            java.lang.String r5 = "="
            java.lang.String[] r4 = r4.split(r5, r1)
            int r5 = r4.length
            r6 = 2
            if (r5 != r6) goto L38
            r5 = r4[r1]
            java.lang.String r6 = "charset"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L38
            r0 = r4[r2]
            goto L3b
        L38:
            int r3 = r3 + 1
            goto L18
        L3b:
            return r0
    }

    /* renamed from: c */
    public static long m6215c(java.lang.String r5) {
            java.lang.String r0 = "EEE, dd MMM yyyy HH:mm:ss zzz"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.text.ParseException -> L1b
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.text.ParseException -> L1b
            r1.<init>(r0, r2)     // Catch: java.text.ParseException -> L1b
            java.lang.String r0 = "GMT"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)     // Catch: java.text.ParseException -> L1b
            r1.setTimeZone(r0)     // Catch: java.text.ParseException -> L1b
            java.util.Date r0 = r1.parse(r5)     // Catch: java.text.ParseException -> L1b
            long r0 = r0.getTime()     // Catch: java.text.ParseException -> L1b
            return r0
        L1b:
            r0 = move-exception
            java.lang.String r1 = "Unable to parse dateStr: %s, falling back to 0"
            java.lang.String r2 = "0"
            boolean r2 = r2.equals(r5)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L3f
            java.lang.String r2 = "-1"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L31
            goto L3f
        L31:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r5
            java.lang.String r5 = p105g2.C2227u.m5819a(r1, r2)
            java.lang.String r1 = "Volley"
            android.util.Log.e(r1, r5, r0)
            goto L46
        L3f:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r5
            p105g2.C2227u.m5822d(r1, r0)
        L46:
            r0 = 0
            return r0
    }
}
