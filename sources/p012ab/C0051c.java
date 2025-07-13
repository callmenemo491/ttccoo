package p012ab;

/* renamed from: ab.c */
/* loaded from: classes.dex */
public class C0051c {

    /* renamed from: e */
    public static final java.util.regex.Pattern f113e = null;

    /* renamed from: f */
    public static final java.nio.charset.Charset f114f = null;

    /* renamed from: a */
    public final android.content.Context f115a;

    /* renamed from: b */
    public final p392wa.InterfaceC6823b<p095fb.InterfaceC2137g> f116b;

    /* renamed from: c */
    public final p392wa.InterfaceC6823b<ua.InterfaceC6369d> f117c;

    /* renamed from: d */
    public final p012ab.C0053e f118d;

    static {
            java.lang.String r0 = "[0-9]+s"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p012ab.C0051c.f113e = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            p012ab.C0051c.f114f = r0
            return
    }

    public C0051c(android.content.Context r1, p392wa.InterfaceC6823b<p095fb.InterfaceC2137g> r2, p392wa.InterfaceC6823b<ua.InterfaceC6369d> r3) {
            r0 = this;
            r0.<init>()
            r0.f115a = r1
            r0.f116b = r2
            r0.f117c = r3
            ab.e r1 = new ab.e
            r1.<init>()
            r0.f118d = r1
            return
    }

    /* renamed from: b */
    public static void m66b(java.net.HttpURLConnection r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
            java.io.InputStream r0 = r10.getErrorStream()
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            if (r0 != 0) goto Lc
            goto L52
        Lc:
            java.io.BufferedReader r6 = new java.io.BufferedReader
            java.io.InputStreamReader r7 = new java.io.InputStreamReader
            java.nio.charset.Charset r8 = p012ab.C0051c.f114f
            r7.<init>(r0, r8)
            r6.<init>(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4d
            r0.<init>()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4d
        L1d:
            java.lang.String r7 = r6.readLine()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4d
            if (r7 == 0) goto L2c
            r0.append(r7)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4d
            r7 = 10
            r0.append(r7)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4d
            goto L1d
        L2c:
            java.lang.String r7 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4d
            int r9 = r10.getResponseCode()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4d
            r8[r4] = r9     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4d
            java.lang.String r10 = r10.getResponseMessage()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4d
            r8[r3] = r10     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4d
            r8[r2] = r0     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4d
            java.lang.String r10 = java.lang.String.format(r7, r8)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4d
            r1 = r10
            goto L4d
        L48:
            r10 = move-exception
            r6.close()     // Catch: java.io.IOException -> L4c
        L4c:
            throw r10
        L4d:
            r6.close()     // Catch: java.io.IOException -> L51
            goto L52
        L51:
        L52:
            boolean r10 = android.text.TextUtils.isEmpty(r1)
            if (r10 != 0) goto L7d
            java.lang.String r10 = "Firebase-Installations"
            android.util.Log.w(r10, r1)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r12
            r0[r3] = r13
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L6c
            java.lang.String r11 = ""
            goto L72
        L6c:
            java.lang.String r12 = ", "
            java.lang.String r11 = p064e.C1493g.m4049a(r12, r11)
        L72:
            r0[r2] = r11
            java.lang.String r11 = "Firebase options used while communicating with Firebase server APIs: %s, %s%s"
            java.lang.String r11 = java.lang.String.format(r11, r0)
            android.util.Log.w(r10, r11)
        L7d:
            return
    }

    /* renamed from: d */
    public static long m67d(java.lang.String r2) {
            java.util.regex.Pattern r0 = p012ab.C0051c.f113e
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r0 = r0.matches()
            java.lang.String r1 = "Invalid Expiration Timestamp."
            com.google.android.gms.common.internal.C1101a.m3097b(r0, r1)
            if (r2 == 0) goto L28
            int r0 = r2.length()
            if (r0 != 0) goto L18
            goto L28
        L18:
            r0 = 0
            int r1 = r2.length()
            int r1 = r1 + (-1)
            java.lang.String r2 = r2.substring(r0, r1)
            long r0 = java.lang.Long.parseLong(r2)
            goto L2a
        L28:
            r0 = 0
        L2a:
            return r0
    }

    /* renamed from: i */
    public static void m68i(java.net.URLConnection r1, byte[] r2) {
            java.io.OutputStream r1 = r1.getOutputStream()
            if (r1 == 0) goto L1d
            java.util.zip.GZIPOutputStream r0 = new java.util.zip.GZIPOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch: java.lang.Throwable -> L15
            r0.close()     // Catch: java.io.IOException -> L14
            r1.close()     // Catch: java.io.IOException -> L14
        L14:
            return
        L15:
            r2 = move-exception
            r0.close()     // Catch: java.io.IOException -> L1c
            r1.close()     // Catch: java.io.IOException -> L1c
        L1c:
            throw r2
        L1d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Cannot send request to FIS servers. No OutputStream available."
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: a */
    public final java.net.URL m69a(java.lang.String r7) {
            r6 = this;
            r0 = 2
            java.net.URL r1 = new java.net.URL     // Catch: java.net.MalformedURLException -> L1c
            java.lang.String r2 = "https://%s/%s/%s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.net.MalformedURLException -> L1c
            r4 = 0
            java.lang.String r5 = "firebaseinstallations.googleapis.com"
            r3[r4] = r5     // Catch: java.net.MalformedURLException -> L1c
            r4 = 1
            java.lang.String r5 = "v1"
            r3[r4] = r5     // Catch: java.net.MalformedURLException -> L1c
            r3[r0] = r7     // Catch: java.net.MalformedURLException -> L1c
            java.lang.String r7 = java.lang.String.format(r2, r3)     // Catch: java.net.MalformedURLException -> L1c
            r1.<init>(r7)     // Catch: java.net.MalformedURLException -> L1c
            return r1
        L1c:
            r7 = move-exception
            xa.e r1 = new xa.e
            java.lang.String r7 = r7.getMessage()
            r1.<init>(r7, r0)
            throw r1
    }

    /* renamed from: c */
    public final java.net.HttpURLConnection m70c(java.net.URL r6, java.lang.String r7) {
            r5 = this;
            java.net.URLConnection r6 = r6.openConnection()     // Catch: java.io.IOException -> Lc7
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.io.IOException -> Lc7
            r0 = 10000(0x2710, float:1.4013E-41)
            r6.setConnectTimeout(r0)
            r1 = 0
            r6.setUseCaches(r1)
            r6.setReadTimeout(r0)
            java.lang.String r0 = "application/json"
            java.lang.String r2 = "Content-Type"
            r6.addRequestProperty(r2, r0)
            java.lang.String r2 = "Accept"
            r6.addRequestProperty(r2, r0)
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r2 = "gzip"
            r6.addRequestProperty(r0, r2)
            java.lang.String r0 = "Cache-Control"
            java.lang.String r2 = "no-cache"
            r6.addRequestProperty(r0, r2)
            android.content.Context r0 = r5.f115a
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r2 = "X-Android-Package"
            r6.addRequestProperty(r2, r0)
            wa.b<ua.d> r0 = r5.f117c
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L76
            wa.b<fb.g> r0 = r5.f116b
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L76
            wa.b<ua.d> r0 = r5.f117c
            java.lang.Object r0 = r0.get()
            ua.d r0 = (ua.InterfaceC6369d) r0
            java.lang.String r2 = "fire-installations-id"
            int r0 = r0.mo13015a(r2)
            r2 = 1
            if (r0 == r2) goto L76
            wa.b<fb.g> r2 = r5.f116b
            java.lang.Object r2 = r2.get()
            fb.g r2 = (p095fb.InterfaceC2137g) r2
            java.lang.String r2 = r2.mo5694a()
            java.lang.String r3 = "x-firebase-client"
            r6.addRequestProperty(r3, r2)
            int r0 = p365v.C6480g.m13148b(r0)
            java.lang.String r0 = java.lang.Integer.toString(r0)
            java.lang.String r2 = "x-firebase-client-log-type"
            r6.addRequestProperty(r2, r0)
        L76:
            java.lang.String r0 = "ContentValues"
            r2 = 0
            android.content.Context r3 = r5.f115a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La5
            java.lang.String r4 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La5
            byte[] r3 = p353u6.C6338a.m12988a(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La5
            if (r3 != 0) goto La0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La5
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La5
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r1.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La5
            android.content.Context r3 = r5.f115a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La5
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La5
            r1.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La5
            java.lang.String r1 = r1.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La5
            android.util.Log.e(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La5
            goto Lbc
        La0:
            java.lang.String r2 = p353u6.C6343f.m12993a(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La5
            goto Lbc
        La5:
            r1 = move-exception
            java.lang.String r3 = "No such package: "
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            android.content.Context r4 = r5.f115a
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r0, r3, r1)
        Lbc:
            java.lang.String r0 = "X-Android-Cert"
            r6.addRequestProperty(r0, r2)
            java.lang.String r0 = "x-goog-api-key"
            r6.addRequestProperty(r0, r7)
            return r6
        Lc7:
            xa.e r6 = new xa.e
            r7 = 2
            java.lang.String r0 = "Firebase Installations Service is unavailable. Please try again later."
            r6.<init>(r0, r7)
            throw r6
    }

    /* renamed from: e */
    public final p012ab.AbstractC0052d m71e(java.net.HttpURLConnection r11) {
            r10 = this;
            java.io.InputStream r11 = r11.getInputStream()
            android.util.JsonReader r0 = new android.util.JsonReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.nio.charset.Charset r2 = p012ab.C0051c.f114f
            r1.<init>(r11, r2)
            r0.<init>(r1)
            ab.f$a r1 = p012ab.AbstractC0054f.m77a()
            r0.beginObject()
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
        L1c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L98
            java.lang.String r2 = r0.nextName()
            java.lang.String r3 = "name"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L33
            java.lang.String r4 = r0.nextString()
            goto L1c
        L33:
            java.lang.String r3 = "fid"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L40
            java.lang.String r5 = r0.nextString()
            goto L1c
        L40:
            java.lang.String r3 = "refreshToken"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L4d
            java.lang.String r6 = r0.nextString()
            goto L1c
        L4d:
            java.lang.String r3 = "authToken"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L94
            r0.beginObject()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8c
            java.lang.String r2 = r0.nextName()
            java.lang.String r3 = "token"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L74
            java.lang.String r2 = r0.nextString()
            r3 = r1
            ab.b$b r3 = (p012ab.C0050b.b) r3
            r3.f110a = r2
            goto L58
        L74:
            java.lang.String r3 = "expiresIn"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L88
            java.lang.String r2 = r0.nextString()
            long r2 = m67d(r2)
            r1.mo65b(r2)
            goto L58
        L88:
            r0.skipValue()
            goto L58
        L8c:
            ab.f r7 = r1.mo64a()
            r0.endObject()
            goto L1c
        L94:
            r0.skipValue()
            goto L1c
        L98:
            r0.endObject()
            r0.close()
            r11.close()
            ab.d$a r8 = p012ab.AbstractC0052d.a.f119Y
            ab.a r11 = new ab.a
            r9 = 0
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    /* renamed from: f */
    public final p012ab.AbstractC0054f m72f(java.net.HttpURLConnection r5) {
            r4 = this;
            java.io.InputStream r5 = r5.getInputStream()
            android.util.JsonReader r0 = new android.util.JsonReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.nio.charset.Charset r2 = p012ab.C0051c.f114f
            r1.<init>(r5, r2)
            r0.<init>(r1)
            ab.f$a r1 = p012ab.AbstractC0054f.m77a()
            r0.beginObject()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4b
            java.lang.String r2 = r0.nextName()
            java.lang.String r3 = "token"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L33
            java.lang.String r2 = r0.nextString()
            r3 = r1
            ab.b$b r3 = (p012ab.C0050b.b) r3
            r3.f110a = r2
            goto L17
        L33:
            java.lang.String r3 = "expiresIn"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L47
            java.lang.String r2 = r0.nextString()
            long r2 = m67d(r2)
            r1.mo65b(r2)
            goto L17
        L47:
            r0.skipValue()
            goto L17
        L4b:
            r0.endObject()
            r0.close()
            r5.close()
            ab.f$b r5 = p012ab.AbstractC0054f.b.f127Y
            ab.b$b r1 = (p012ab.C0050b.b) r1
            r1.f112c = r5
            ab.f r5 = r1.mo64a()
            return r5
    }

    /* renamed from: g */
    public final void m73g(java.net.HttpURLConnection r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2b
            r0.<init>()     // Catch: org.json.JSONException -> L2b
            java.lang.String r1 = "fid"
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L2b
            java.lang.String r4 = "appId"
            r0.put(r4, r5)     // Catch: org.json.JSONException -> L2b
            java.lang.String r4 = "authVersion"
            java.lang.String r5 = "FIS_v2"
            r0.put(r4, r5)     // Catch: org.json.JSONException -> L2b
            java.lang.String r4 = "sdkVersion"
            java.lang.String r5 = "a:17.0.0"
            r0.put(r4, r5)     // Catch: org.json.JSONException -> L2b
            java.lang.String r4 = r0.toString()
            java.lang.String r5 = "UTF-8"
            byte[] r4 = r4.getBytes(r5)
            m68i(r3, r4)
            return
        L2b:
            r3 = move-exception
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r3)
            throw r4
    }

    /* renamed from: h */
    public final void m74h(java.net.HttpURLConnection r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L24
            r0.<init>()     // Catch: org.json.JSONException -> L24
            java.lang.String r1 = "sdkVersion"
            java.lang.String r2 = "a:17.0.0"
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L24
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L24
            r1.<init>()     // Catch: org.json.JSONException -> L24
            java.lang.String r2 = "installation"
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L24
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)
            m68i(r4, r0)
            return
        L24:
            r4 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
    }
}
