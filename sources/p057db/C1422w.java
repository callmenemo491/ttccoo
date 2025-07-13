package p057db;

/* renamed from: db.w */
/* loaded from: classes.dex */
public class C1422w {

    /* renamed from: a */
    public final android.os.Bundle f7100a;

    public C1422w(android.os.Bundle r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "data"
            java.util.Objects.requireNonNull(r2, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r2)
            r1.f7100a = r0
            return
    }

    /* renamed from: l */
    public static boolean m3951l(android.os.Bundle r4) {
            java.lang.String r0 = "gcm.n.e"
            java.lang.String r1 = r4.getString(r0)
            java.lang.String r2 = "1"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L23
            java.lang.String r1 = "gcm.n."
            java.lang.String r3 = "gcm.notification."
            java.lang.String r0 = r0.replace(r1, r3)
            java.lang.String r4 = r4.getString(r0)
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L21
            goto L23
        L21:
            r4 = 0
            return r4
        L23:
            r4 = 1
            return r4
    }

    /* renamed from: n */
    public static java.lang.String m3952n(java.lang.String r1) {
            java.lang.String r0 = "gcm.n."
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto Ld
            r0 = 6
            java.lang.String r1 = r1.substring(r0)
        Ld:
            return r1
    }

    /* renamed from: a */
    public boolean m3953a(java.lang.String r2) {
            r1 = this;
            java.lang.String r2 = r1.m3962j(r2)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L15
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 == 0) goto L13
            goto L15
        L13:
            r2 = 0
            return r2
        L15:
            r2 = 1
            return r2
    }

    /* renamed from: b */
    public java.lang.Integer m3954b(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = r4.m3962j(r5)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L44
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L13
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L13
            return r5
        L13:
            java.lang.String r5 = m3952n(r5)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 38
            int r1 = r1 + r2
            r3.<init>(r1)
            java.lang.String r1 = "Couldn't parse value of "
            java.lang.String r2 = "("
            p179k1.C3661s.m8090a(r3, r1, r5, r2, r0)
            java.lang.String r5 = ") into an int"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            java.lang.String r0 = "NotificationParams"
            android.util.Log.w(r0, r5)
        L44:
            r5 = 0
            return r5
    }

    /* renamed from: c */
    public org.json.JSONArray m3955c(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = r4.m3962j(r5)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L41
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L10
            r1.<init>(r0)     // Catch: org.json.JSONException -> L10
            return r1
        L10:
            java.lang.String r5 = m3952n(r5)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 50
            int r1 = r1 + r2
            r3.<init>(r1)
            java.lang.String r1 = "Malformed JSON for key "
            java.lang.String r2 = ": "
            p179k1.C3661s.m8090a(r3, r1, r5, r2, r0)
            java.lang.String r5 = ", falling back to default"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            java.lang.String r0 = "NotificationParams"
            android.util.Log.w(r0, r5)
        L41:
            r5 = 0
            return r5
    }

    /* renamed from: d */
    public int[] m3956d() {
            r9 = this;
            java.lang.String r0 = "NotificationParams"
            java.lang.String r1 = ". Skipping setting LightSettings"
            java.lang.String r2 = "LightSettings is invalid: "
            java.lang.String r3 = "gcm.n.light_settings"
            org.json.JSONArray r3 = r9.m3955c(r3)
            r4 = 0
            if (r3 != 0) goto L10
            return r4
        L10:
            r5 = 3
            int[] r6 = new int[r5]
            int r7 = r3.length()     // Catch: java.lang.IllegalArgumentException -> L47 org.json.JSONException -> L71
            if (r7 != r5) goto L3f
            r5 = 0
            java.lang.String r7 = r3.optString(r5)     // Catch: java.lang.IllegalArgumentException -> L47 org.json.JSONException -> L71
            int r7 = android.graphics.Color.parseColor(r7)     // Catch: java.lang.IllegalArgumentException -> L47 org.json.JSONException -> L71
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r7 == r8) goto L37
            r6[r5] = r7     // Catch: java.lang.IllegalArgumentException -> L47 org.json.JSONException -> L71
            r5 = 1
            int r7 = r3.optInt(r5)     // Catch: java.lang.IllegalArgumentException -> L47 org.json.JSONException -> L71
            r6[r5] = r7     // Catch: java.lang.IllegalArgumentException -> L47 org.json.JSONException -> L71
            r5 = 2
            int r7 = r3.optInt(r5)     // Catch: java.lang.IllegalArgumentException -> L47 org.json.JSONException -> L71
            r6[r5] = r7     // Catch: java.lang.IllegalArgumentException -> L47 org.json.JSONException -> L71
            return r6
        L37:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L47 org.json.JSONException -> L71
            java.lang.String r6 = "Transparent color is invalid"
            r5.<init>(r6)     // Catch: java.lang.IllegalArgumentException -> L47 org.json.JSONException -> L71
            throw r5     // Catch: java.lang.IllegalArgumentException -> L47 org.json.JSONException -> L71
        L3f:
            org.json.JSONException r5 = new org.json.JSONException     // Catch: java.lang.IllegalArgumentException -> L47 org.json.JSONException -> L71
            java.lang.String r6 = "lightSettings don't have all three fields"
            r5.<init>(r6)     // Catch: java.lang.IllegalArgumentException -> L47 org.json.JSONException -> L71
            throw r5     // Catch: java.lang.IllegalArgumentException -> L47 org.json.JSONException -> L71
        L47:
            r5 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = r5.getMessage()
            int r6 = r3.length()
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r6 = r6 + 60
            int r6 = r6 + r7
            r8.<init>(r6)
            java.lang.String r6 = ". "
            p179k1.C3661s.m8090a(r8, r2, r3, r6, r5)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            goto L84
        L71:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r5 = r3.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 58
            r6.<init>(r5)
            java.lang.String r1 = p083f.C1932s.m4774a(r6, r2, r3, r1)
        L84:
            android.util.Log.w(r0, r1)
            return r4
    }

    /* renamed from: e */
    public android.net.Uri m3957e() {
            r2 = this;
            java.lang.String r0 = "gcm.n.link_android"
            java.lang.String r0 = r2.m3962j(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L12
            java.lang.String r0 = "gcm.n.link"
            java.lang.String r0 = r2.m3962j(r0)
        L12:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1d
            android.net.Uri r0 = android.net.Uri.parse(r0)
            return r0
        L1d:
            r0 = 0
            return r0
    }

    /* renamed from: f */
    public java.lang.Object[] m3958f(java.lang.String r5) {
            r4 = this;
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "_loc_args"
            java.lang.String r5 = r5.concat(r0)
            org.json.JSONArray r5 = r4.m3955c(r5)
            if (r5 != 0) goto L12
            r5 = 0
            return r5
        L12:
            int r0 = r5.length()
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
        L19:
            if (r2 >= r0) goto L24
            java.lang.String r3 = r5.optString(r2)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L19
        L24:
            return r1
    }

    /* renamed from: g */
    public java.lang.String m3959g(java.lang.String r2) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "_loc_key"
            java.lang.String r2 = r2.concat(r0)
            java.lang.String r2 = r1.m3962j(r2)
            return r2
    }

    /* renamed from: h */
    public java.lang.Long m3960h(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = r4.m3962j(r5)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L44
            long r1 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L13
            java.lang.Long r5 = java.lang.Long.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L13
            return r5
        L13:
            java.lang.String r5 = m3952n(r5)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 38
            int r1 = r1 + r2
            r3.<init>(r1)
            java.lang.String r1 = "Couldn't parse value of "
            java.lang.String r2 = "("
            p179k1.C3661s.m8090a(r3, r1, r5, r2, r0)
            java.lang.String r5 = ") into a long"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            java.lang.String r0 = "NotificationParams"
            android.util.Log.w(r0, r5)
        L44:
            r5 = 0
            return r5
    }

    /* renamed from: i */
    public java.lang.String m3961i(android.content.res.Resources r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            java.lang.String r0 = r6.m3962j(r9)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = r6.m3959g(r9)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L18
            goto L9a
        L18:
            java.lang.String r1 = "string"
            int r8 = r7.getIdentifier(r0, r1, r8)
            java.lang.String r0 = "NotificationParams"
            java.lang.String r1 = " Default value will be used."
            if (r8 != 0) goto L58
            java.lang.String r7 = "_loc_key"
            java.lang.String r7 = r9.concat(r7)
            java.lang.String r7 = m3952n(r7)
            java.lang.String r8 = java.lang.String.valueOf(r7)
            int r8 = r8.length()
            int r3 = r9.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r8 = r8 + 49
            int r8 = r8 + r3
            r4.<init>(r8)
            r4.append(r7)
            java.lang.String r7 = " resource not found: "
            r4.append(r7)
            r4.append(r9)
            r4.append(r1)
            java.lang.String r7 = r4.toString()
            android.util.Log.w(r0, r7)
            goto L9a
        L58:
            java.lang.Object[] r3 = r6.m3958f(r9)
            if (r3 != 0) goto L63
            java.lang.String r2 = r7.getString(r8)
            goto L9a
        L63:
            java.lang.String r2 = r7.getString(r8, r3)     // Catch: java.util.MissingFormatArgumentException -> L68
            goto L9a
        L68:
            r7 = move-exception
            java.lang.String r8 = m3952n(r9)
            java.lang.String r9 = java.util.Arrays.toString(r3)
            java.lang.String r3 = java.lang.String.valueOf(r8)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r9)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 58
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = "Missing format argument for "
            java.lang.String r4 = ": "
            p179k1.C3661s.m8090a(r5, r3, r8, r4, r9)
            r5.append(r1)
            java.lang.String r8 = r5.toString()
            android.util.Log.w(r0, r8, r7)
        L9a:
            return r2
    }

    /* renamed from: j */
    public java.lang.String m3962j(java.lang.String r4) {
            r3 = this;
            android.os.Bundle r0 = r3.f7100a
            boolean r1 = r0.containsKey(r4)
            if (r1 != 0) goto L27
            java.lang.String r1 = "gcm.n."
            boolean r2 = r4.startsWith(r1)
            if (r2 == 0) goto L27
            boolean r2 = r4.startsWith(r1)
            if (r2 != 0) goto L18
            r1 = r4
            goto L1e
        L18:
            java.lang.String r2 = "gcm.notification."
            java.lang.String r1 = r4.replace(r1, r2)
        L1e:
            android.os.Bundle r2 = r3.f7100a
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L27
            r4 = r1
        L27:
            java.lang.String r4 = r0.getString(r4)
            return r4
    }

    /* renamed from: k */
    public long[] m3963k() {
            r7 = this;
            java.lang.String r0 = "gcm.n.vibrate_timings"
            org.json.JSONArray r0 = r7.m3955c(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L2c
            r3 = 1
            if (r2 <= r3) goto L24
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L2c
            long[] r3 = new long[r2]     // Catch: java.lang.Throwable -> L2c
            r4 = 0
        L18:
            if (r4 >= r2) goto L23
            long r5 = r0.optLong(r4)     // Catch: java.lang.Throwable -> L2c
            r3[r4] = r5     // Catch: java.lang.Throwable -> L2c
            int r4 = r4 + 1
            goto L18
        L23:
            return r3
        L24:
            org.json.JSONException r2 = new org.json.JSONException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "vibrateTimings have invalid length"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2c
            throw r2     // Catch: java.lang.Throwable -> L2c
        L2c:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 74
            r3.<init>(r2)
            java.lang.String r2 = "User defined vibrateTimings is invalid: "
            java.lang.String r4 = ". Skipping setting vibrateTimings."
            java.lang.String r5 = "NotificationParams"
            p057db.C1387a.m3905a(r3, r2, r0, r4, r5)
            return r1
    }

    /* renamed from: m */
    public android.os.Bundle m3964m() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            android.os.Bundle r1 = r4.f7100a
            r0.<init>(r1)
            android.os.Bundle r1 = r4.f7100a
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "google.c.a."
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L30
            java.lang.String r3 = "from"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2e
            goto L30
        L2e:
            r3 = 0
            goto L31
        L30:
            r3 = 1
        L31:
            if (r3 != 0) goto L11
            r0.remove(r2)
            goto L11
        L37:
            return r0
    }
}
