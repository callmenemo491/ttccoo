package p144i6;

/* renamed from: i6.b */
/* loaded from: classes.dex */
public final class C3091b {

    /* renamed from: a */
    public static final p123h6.C2489b f12448a = null;

    /* renamed from: b */
    public static final java.lang.String[] f12449b = null;

    /* renamed from: c */
    public static final java.lang.String f12450c = null;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "MetadataUtils"
            r0.<init>(r1)
            p144i6.C3091b.f12448a = r0
            java.lang.String r0 = "Z"
            java.lang.String r1 = "+hh"
            java.lang.String r2 = "+hhmm"
            java.lang.String r3 = "+hh:mm"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            p144i6.C3091b.f12449b = r0
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r2 = "yyyyMMdd'T'HHmmss"
            if (r1 == 0) goto L2b
            java.lang.String r0 = r2.concat(r0)
            goto L30
        L2b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L30:
            p144i6.C3091b.f12450c = r0
            return
    }

    /* renamed from: a */
    public static java.util.Calendar m7551a(java.lang.String r9) {
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r1 = "Input string is empty or null"
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L12
            h6.b r9 = p144i6.C3091b.f12448a
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r9.m6376a(r1, r0)
            return r3
        L12:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r4 = 8
            if (r0 != 0) goto L30
            java.lang.String r0 = r9.substring(r2, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L1f
            goto L38
        L1f:
            r0 = move-exception
            h6.b r1 = p144i6.C3091b.f12448a
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = r1.f11253a
            java.lang.String r7 = "Error extracting the date"
            java.lang.String r1 = r1.m6380e(r7, r5)
            android.util.Log.e(r6, r1, r0)
            goto L37
        L30:
            h6.b r0 = p144i6.C3091b.f12448a
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r0.m6376a(r1, r5)
        L37:
            r0 = r3
        L38:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L48
            h6.b r9 = p144i6.C3091b.f12448a
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "Invalid date format"
            r9.m6376a(r1, r0)
            return r3
        L48:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            r5 = 6
            r6 = 1
            if (r1 == 0) goto L5b
            h6.b r9 = p144i6.C3091b.f12448a
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "string is empty or null"
            r9.m6376a(r4, r1)
            goto Led
        L5b:
            r1 = 84
            int r1 = r9.indexOf(r1)
            int r7 = r1 + 1
            if (r1 == r4) goto L70
            h6.b r9 = p144i6.C3091b.f12448a
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "T delimeter is not found"
            r9.m6376a(r4, r1)
            goto Led
        L70:
            java.lang.String r9 = r9.substring(r7)     // Catch: java.lang.IndexOutOfBoundsException -> Ldd
            int r1 = r9.length()
            if (r1 != r5) goto L7c
            goto Lee
        L7c:
            char r1 = r9.charAt(r5)
            r4 = 43
            if (r1 == r4) goto Lb1
            r4 = 45
            if (r1 == r4) goto Lb1
            r4 = 90
            if (r1 == r4) goto L8d
            goto Led
        L8d:
            int r1 = r9.length()
            java.lang.String[] r4 = p144i6.C3091b.f12449b
            r4 = r4[r2]
            int r4 = r4.length()
            int r4 = r4 + r5
            if (r1 != r4) goto Led
            int r1 = r9.length()
            int r1 = r1 + (-1)
            java.lang.String r9 = r9.substring(r2, r1)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r1 = "+0000"
            java.lang.String r9 = r9.concat(r1)
            goto Lee
        Lb1:
            int r1 = r9.length()
            java.lang.String[] r4 = p144i6.C3091b.f12449b
            r7 = r4[r6]
            int r7 = r7.length()
            int r7 = r7 + r5
            if (r1 == r7) goto Ld4
            r7 = 2
            r7 = r4[r7]
            int r7 = r7.length()
            int r7 = r7 + r5
            if (r1 == r7) goto Ld4
            r7 = 3
            r4 = r4[r7]
            int r4 = r4.length()
            int r4 = r4 + r5
            if (r1 != r4) goto Led
        Ld4:
            java.lang.String r1 = "([\\+\\-]\\d\\d):(\\d\\d)"
            java.lang.String r4 = "$1$2"
            java.lang.String r9 = r9.replaceAll(r1, r4)
            goto Lee
        Ldd:
            r9 = move-exception
            h6.b r1 = p144i6.C3091b.f12448a
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r7 = r1.f11253a
            java.lang.String r8 = "Error extracting the time substring: %s"
            java.lang.String r1 = r1.m6380e(r8, r4)
            android.util.Log.e(r7, r1, r9)
        Led:
            r9 = r3
        Lee:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L11d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r4 = java.lang.String.valueOf(r9)
            int r4 = r4.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r1 = r1 + r6
            int r1 = r1 + r4
            r7.<init>(r1)
            java.lang.String r1 = "T"
            java.lang.String r0 = p083f.C1932s.m4774a(r7, r0, r1, r9)
            int r9 = r9.length()
            if (r9 != r5) goto L11a
            java.lang.String r9 = "yyyyMMdd'T'HHmmss"
            goto L11f
        L11a:
            java.lang.String r9 = p144i6.C3091b.f12450c
            goto L11f
        L11d:
            java.lang.String r9 = "yyyyMMdd"
        L11f:
            java.util.Calendar r1 = java.util.GregorianCalendar.getInstance()
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat     // Catch: java.text.ParseException -> L130
            r4.<init>(r9)     // Catch: java.text.ParseException -> L130
            java.util.Date r9 = r4.parse(r0)     // Catch: java.text.ParseException -> L130
            r1.setTime(r9)
            return r1
        L130:
            r9 = move-exception
            h6.b r0 = p144i6.C3091b.f12448a
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = r0.f11253a
            java.lang.String r4 = "Error parsing string"
            java.lang.String r0 = r0.m6380e(r4, r1)
            android.util.Log.e(r2, r0, r9)
            return r3
    }

    /* renamed from: b */
    public static void m7552b(java.util.List<p233n6.C4691a> r3, org.json.JSONArray r4) {
            r3.clear()     // Catch: org.json.JSONException -> L19
            r0 = 0
        L4:
            int r1 = r4.length()     // Catch: org.json.JSONException -> L19
            if (r0 >= r1) goto L19
            org.json.JSONObject r1 = r4.getJSONObject(r0)     // Catch: org.json.JSONException -> L19
            n6.a r2 = new n6.a     // Catch: java.lang.IllegalArgumentException -> L16 org.json.JSONException -> L19
            r2.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L16 org.json.JSONException -> L19
            r3.add(r2)     // Catch: java.lang.IllegalArgumentException -> L16 org.json.JSONException -> L19
        L16:
            int r0 = r0 + 1
            goto L4
        L19:
            return
    }
}
