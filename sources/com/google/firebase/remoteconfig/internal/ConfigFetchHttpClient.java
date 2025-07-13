package com.google.firebase.remoteconfig.internal;

/* loaded from: classes.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h */
    public static final java.util.regex.Pattern f6628h = null;

    /* renamed from: a */
    public final android.content.Context f6629a;

    /* renamed from: b */
    public final java.lang.String f6630b;

    /* renamed from: c */
    public final java.lang.String f6631c;

    /* renamed from: d */
    public final java.lang.String f6632d;

    /* renamed from: e */
    public final java.lang.String f6633e;

    /* renamed from: f */
    public final long f6634f;

    /* renamed from: g */
    public final long f6635g;

    static {
            java.lang.String r0 = "^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.f6628h = r0
            return
    }

    public ConfigFetchHttpClient(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5, long r7) {
            r0 = this;
            r0.<init>()
            r0.f6629a = r1
            r0.f6630b = r2
            r0.f6631c = r3
            java.util.regex.Pattern r1 = com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.f6628h
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r2 = r1.matches()
            if (r2 == 0) goto L1b
            r2 = 1
            java.lang.String r1 = r1.group(r2)
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r0.f6632d = r1
            r0.f6633e = r4
            r0.f6634f = r5
            r0.f6635g = r7
            return
    }

    /* renamed from: a */
    public final org.json.JSONObject m3674a(java.lang.String r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r4 == 0) goto L9f
            java.lang.String r1 = "appInstanceId"
            r0.put(r1, r4)
            java.lang.String r4 = "appInstanceIdToken"
            r0.put(r4, r5)
            java.lang.String r4 = r3.f6630b
            java.lang.String r5 = "appId"
            r0.put(r5, r4)
            android.content.Context r4 = r3.f6629a
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            java.lang.String r5 = r4.getCountry()
            java.lang.String r1 = "countryCode"
            r0.put(r1, r5)
            int r5 = android.os.Build.VERSION.SDK_INT
            java.lang.String r4 = r4.toLanguageTag()
            java.lang.String r1 = "languageCode"
            r0.put(r1, r4)
            java.lang.String r4 = java.lang.Integer.toString(r5)
            java.lang.String r1 = "platformVersion"
            r0.put(r1, r4)
            java.util.TimeZone r4 = java.util.TimeZone.getDefault()
            java.lang.String r4 = r4.getID()
            java.lang.String r1 = "timeZone"
            r0.put(r1, r4)
            android.content.Context r4 = r3.f6629a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            android.content.Context r1 = r3.f6629a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            r2 = 0
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            if (r4 == 0) goto L7d
            java.lang.String r1 = "appVersion"
            java.lang.String r2 = r4.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            r0.put(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            java.lang.String r1 = "appBuild"
            r2 = 28
            if (r5 < r2) goto L73
            long r4 = r4.getLongVersionCode()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            goto L76
        L73:
            int r4 = r4.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            long r4 = (long) r4     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
        L76:
            java.lang.String r4 = java.lang.Long.toString(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
            r0.put(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7d
        L7d:
            android.content.Context r4 = r3.f6629a
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r5 = "packageName"
            r0.put(r5, r4)
            java.lang.String r4 = "sdkVersion"
            java.lang.String r5 = "21.0.1"
            r0.put(r4, r5)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>(r6)
            java.lang.String r5 = "analyticsUserProperties"
            r0.put(r5, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>(r0)
            return r4
        L9f:
            gb.d r4 = new gb.d
            java.lang.String r5 = "Fetch failed: Firebase installation id is null."
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: b */
    public java.net.HttpURLConnection m3675b() {
            r5 = this;
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> L1f
            java.lang.String r1 = r5.f6632d     // Catch: java.io.IOException -> L1f
            java.lang.String r2 = r5.f6633e     // Catch: java.io.IOException -> L1f
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.io.IOException -> L1f
            r4 = 0
            r3[r4] = r1     // Catch: java.io.IOException -> L1f
            r1 = 1
            r3[r1] = r2     // Catch: java.io.IOException -> L1f
            java.lang.String r1 = "https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch"
            java.lang.String r1 = java.lang.String.format(r1, r3)     // Catch: java.io.IOException -> L1f
            r0.<init>(r1)     // Catch: java.io.IOException -> L1f
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.io.IOException -> L1f
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.io.IOException -> L1f
            return r0
        L1f:
            r0 = move-exception
            gb.e r1 = new gb.e
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: c */
    public final org.json.JSONObject m3676c(java.net.URLConnection r4) {
            r3 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r4 = r4.getInputStream()
            java.lang.String r2 = "utf-8"
            r1.<init>(r4, r2)
            r0.<init>(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L15:
            int r1 = r0.read()
            r2 = -1
            if (r1 == r2) goto L21
            char r1 = (char) r1
            r4.append(r1)
            goto L15
        L21:
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            return r0
    }

    /* renamed from: d */
    public final void m3677d(java.net.HttpURLConnection r2, byte[] r3) {
            r1 = this;
            int r0 = r3.length
            r2.setFixedLengthStreamingMode(r0)
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            java.io.OutputStream r2 = r2.getOutputStream()
            r0.<init>(r2)
            r0.write(r3)
            r0.flush()
            r0.close()
            return
    }

    @androidx.annotation.Keep
    public com.google.firebase.remoteconfig.internal.C1247a.a fetch(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12, java.util.Date r13) {
            r6 = this;
            r0 = 1
            r7.setDoOutput(r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r6.f6634f
            long r2 = r1.toMillis(r2)
            int r3 = (int) r2
            r7.setConnectTimeout(r3)
            long r2 = r6.f6635g
            long r1 = r1.toMillis(r2)
            int r2 = (int) r1
            r7.setReadTimeout(r2)
            java.lang.String r1 = "If-None-Match"
            r7.setRequestProperty(r1, r11)
            java.lang.String r11 = r6.f6631c
            java.lang.String r1 = "X-Goog-Api-Key"
            r7.setRequestProperty(r1, r11)
            android.content.Context r11 = r6.f6629a
            java.lang.String r11 = r11.getPackageName()
            java.lang.String r1 = "X-Android-Package"
            r7.setRequestProperty(r1, r11)
            java.lang.String r11 = "FirebaseRemoteConfig"
            r1 = 0
            r2 = 0
            android.content.Context r3 = r6.f6629a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r4 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            byte[] r3 = p353u6.C6338a.m12988a(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            if (r3 != 0) goto L5c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r3.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r4 = "Could not get fingerprint hash for package: "
            r3.append(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.content.Context r4 = r6.f6629a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r3.append(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r3 = r3.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.util.Log.e(r11, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            goto L78
        L5c:
            java.lang.String r11 = p353u6.C6343f.m12993a(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            goto L79
        L61:
            r3 = move-exception
            java.lang.String r4 = "No such package: "
            java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
            android.content.Context r5 = r6.f6629a
            java.lang.String r5 = r5.getPackageName()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r11, r4, r3)
        L78:
            r11 = r2
        L79:
            java.lang.String r3 = "X-Android-Cert"
            r7.setRequestProperty(r3, r11)
            java.lang.String r11 = "X-Google-GFE-Can-Retry"
            java.lang.String r3 = "yes"
            r7.setRequestProperty(r11, r3)
            java.lang.String r11 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r11, r9)
            java.lang.String r11 = "application/json"
            java.lang.String r3 = "Content-Type"
            r7.setRequestProperty(r3, r11)
            java.lang.String r3 = "Accept"
            r7.setRequestProperty(r3, r11)
            java.util.Set r11 = r12.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L9e:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lba
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r3 = r12.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r7.setRequestProperty(r3, r12)
            goto L9e
        Lba:
            org.json.JSONObject r8 = r6.m3674a(r8, r9, r10)     // Catch: java.lang.Throwable -> L170 org.json.JSONException -> L172 java.io.IOException -> L174
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L170 org.json.JSONException -> L172 java.io.IOException -> L174
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)     // Catch: java.lang.Throwable -> L170 org.json.JSONException -> L172 java.io.IOException -> L174
            r6.m3677d(r7, r8)     // Catch: java.lang.Throwable -> L170 org.json.JSONException -> L172 java.io.IOException -> L174
            r7.connect()     // Catch: java.lang.Throwable -> L170 org.json.JSONException -> L172 java.io.IOException -> L174
            int r8 = r7.getResponseCode()     // Catch: java.lang.Throwable -> L170 org.json.JSONException -> L172 java.io.IOException -> L174
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 != r9) goto L166
            java.lang.String r8 = "ETag"
            java.lang.String r8 = r7.getHeaderField(r8)     // Catch: java.lang.Throwable -> L170 org.json.JSONException -> L172 java.io.IOException -> L174
            org.json.JSONObject r9 = r6.m3676c(r7)     // Catch: java.lang.Throwable -> L170 org.json.JSONException -> L172 java.io.IOException -> L174
            r7.disconnect()
            java.io.InputStream r7 = r7.getInputStream()     // Catch: java.io.IOException -> Lea
            r7.close()     // Catch: java.io.IOException -> Lea
        Lea:
            java.lang.String r7 = "state"
            java.lang.Object r7 = r9.get(r7)     // Catch: org.json.JSONException -> Lf8
            java.lang.String r10 = "NO_CHANGE"
            boolean r7 = r7.equals(r10)     // Catch: org.json.JSONException -> Lf8
            r7 = r7 ^ r0
            goto Lf9
        Lf8:
            r7 = 1
        Lf9:
            if (r7 != 0) goto L101
            com.google.firebase.remoteconfig.internal.a$a r7 = new com.google.firebase.remoteconfig.internal.a$a
            r7.<init>(r13, r0, r2, r2)
            return r7
        L101:
            java.util.Date r7 = p128hb.C2999d.f12099f     // Catch: org.json.JSONException -> L15d
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L15d
            r7.<init>()     // Catch: org.json.JSONException -> L15d
            java.util.Date r10 = p128hb.C2999d.f12099f     // Catch: org.json.JSONException -> L15d
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch: org.json.JSONException -> L15d
            r10.<init>()     // Catch: org.json.JSONException -> L15d
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: org.json.JSONException -> L15d
            r11.<init>()     // Catch: org.json.JSONException -> L15d
            java.lang.String r12 = "entries"
            org.json.JSONObject r12 = r9.getJSONObject(r12)     // Catch: org.json.JSONException -> L11b
            goto L11c
        L11b:
            r12 = r2
        L11c:
            if (r12 == 0) goto L128
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L128
            java.lang.String r12 = r12.toString()     // Catch: org.json.JSONException -> L128
            r0.<init>(r12)     // Catch: org.json.JSONException -> L128
            r7 = r0
        L128:
            java.lang.String r12 = "experimentDescriptions"
            org.json.JSONArray r12 = r9.getJSONArray(r12)     // Catch: org.json.JSONException -> L12f
            goto L130
        L12f:
            r12 = r2
        L130:
            if (r12 == 0) goto L13c
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L13c
            java.lang.String r12 = r12.toString()     // Catch: org.json.JSONException -> L13c
            r0.<init>(r12)     // Catch: org.json.JSONException -> L13c
            r10 = r0
        L13c:
            java.lang.String r12 = "personalizationMetadata"
            org.json.JSONObject r2 = r9.getJSONObject(r12)     // Catch: org.json.JSONException -> L143
            goto L144
        L143:
        L144:
            if (r2 == 0) goto L150
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> L150
            java.lang.String r12 = r2.toString()     // Catch: org.json.JSONException -> L150
            r9.<init>(r12)     // Catch: org.json.JSONException -> L150
            r11 = r9
        L150:
            hb.d r9 = new hb.d     // Catch: org.json.JSONException -> L15d
            r9.<init>(r7, r13, r10, r11)     // Catch: org.json.JSONException -> L15d
            com.google.firebase.remoteconfig.internal.a$a r7 = new com.google.firebase.remoteconfig.internal.a$a
            java.util.Date r10 = r9.f12102c
            r7.<init>(r10, r1, r9, r8)
            return r7
        L15d:
            r7 = move-exception
            gb.d r8 = new gb.d
            java.lang.String r9 = "Fetch failed: fetch response could not be parsed."
            r8.<init>(r9, r7)
            throw r8
        L166:
            gb.g r9 = new gb.g     // Catch: java.lang.Throwable -> L170 org.json.JSONException -> L172 java.io.IOException -> L174
            java.lang.String r10 = r7.getResponseMessage()     // Catch: java.lang.Throwable -> L170 org.json.JSONException -> L172 java.io.IOException -> L174
            r9.<init>(r8, r10)     // Catch: java.lang.Throwable -> L170 org.json.JSONException -> L172 java.io.IOException -> L174
            throw r9     // Catch: java.lang.Throwable -> L170 org.json.JSONException -> L172 java.io.IOException -> L174
        L170:
            r8 = move-exception
            goto L17d
        L172:
            r8 = move-exception
            goto L175
        L174:
            r8 = move-exception
        L175:
            gb.d r9 = new gb.d     // Catch: java.lang.Throwable -> L170
            java.lang.String r10 = "The client had an error while calling the backend!"
            r9.<init>(r10, r8)     // Catch: java.lang.Throwable -> L170
            throw r9     // Catch: java.lang.Throwable -> L170
        L17d:
            r7.disconnect()
            java.io.InputStream r7 = r7.getInputStream()     // Catch: java.io.IOException -> L187
            r7.close()     // Catch: java.io.IOException -> L187
        L187:
            throw r8
    }
}
