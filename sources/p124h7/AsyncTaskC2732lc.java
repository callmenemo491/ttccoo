package p124h7;

/* renamed from: h7.lc */
/* loaded from: classes.dex */
public final class AsyncTaskC2732lc extends android.os.AsyncTask<java.lang.Void, java.lang.Void, p124h7.C2714kc> {

    /* renamed from: f */
    public static final p306r6.C5797a f11741f = null;

    /* renamed from: a */
    public final java.lang.String f11742a;

    /* renamed from: b */
    public final java.lang.String f11743b;

    /* renamed from: c */
    public final java.lang.ref.WeakReference<p124h7.InterfaceC2750mc> f11744c;

    /* renamed from: d */
    public final android.net.Uri.Builder f11745d;

    /* renamed from: e */
    public final java.lang.String f11746e;

    static {
            r6.a r0 = new r6.a
            java.lang.String r1 = "GetAuthDomainTask"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r2 = "FirebaseAuth"
            r0.<init>(r2, r1)
            p124h7.AsyncTaskC2732lc.f11741f = r0
            return
    }

    public AsyncTaskC2732lc(java.lang.String r6, java.lang.String r7, android.content.Intent r8, p124h7.InterfaceC2750mc r9) {
            r5 = this;
            r5.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r6)
            r5.f11742a = r6
            com.google.android.gms.common.internal.C1101a.m3100e(r7)
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r8, r0)
            java.lang.String r1 = "com.google.firebase.auth.KEY_API_KEY"
            java.lang.String r1 = r8.getStringExtra(r1)
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            java.lang.String r2 = r9.mo3639g(r1)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r2 = r2.buildUpon()
            java.lang.String r3 = "getProjectConfig"
            android.net.Uri$Builder r3 = r2.appendPath(r3)
            java.lang.String r4 = "key"
            android.net.Uri$Builder r1 = r3.appendQueryParameter(r4, r1)
            java.lang.String r3 = "androidPackageName"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r6)
            java.util.Objects.requireNonNull(r7, r0)
            java.lang.String r0 = "sha1Cert"
            r1.appendQueryParameter(r0, r7)
            android.net.Uri r0 = r2.build()
            java.lang.String r0 = r0.toString()
            r5.f11743b = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r9)
            r5.f11744c = r0
            android.net.Uri$Builder r6 = r9.mo3638d(r8, r6, r7)
            r5.f11745d = r6
            java.lang.String r6 = "com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN"
            java.lang.String r6 = r8.getStringExtra(r6)
            r5.f11746e = r6
            return
    }

    /* renamed from: b */
    public static byte[] m6963b(java.io.InputStream r3, int r4) {
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            r0 = 128(0x80, float:1.8E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L1d
        L9:
            int r1 = r3.read(r0)     // Catch: java.lang.Throwable -> L1d
            r2 = -1
            if (r1 != r2) goto L18
            byte[] r3 = r4.toByteArray()     // Catch: java.lang.Throwable -> L1d
            r4.close()
            return r3
        L18:
            r2 = 0
            r4.write(r0, r2, r1)     // Catch: java.lang.Throwable -> L1d
            goto L9
        L1d:
            r3 = move-exception
            r4.close()
            throw r3
    }

    /* renamed from: a */
    public final void m6964a(p124h7.C2714kc r4) {
            r3 = this;
            java.lang.ref.WeakReference<h7.mc> r0 = r3.f11744c
            java.lang.Object r0 = r0.get()
            h7.mc r0 = (p124h7.InterfaceC2750mc) r0
            r1 = 0
            if (r4 == 0) goto L10
            java.lang.String r1 = r4.f11707a
            java.lang.String r4 = r4.f11708b
            goto L11
        L10:
            r4 = r1
        L11:
            if (r0 != 0) goto L24
            r6.a r4 = p124h7.AsyncTaskC2732lc.f11741f
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r4.f22479a
            java.lang.String r2 = "An error has occurred: the handler reference has returned null."
            java.lang.String r4 = r4.m12162c(r2, r0)
            android.util.Log.e(r1, r4)
            return
        L24:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L3d
            android.net.Uri$Builder r2 = r3.f11745d
            if (r2 == 0) goto L3d
            r2.authority(r1)
            android.net.Uri$Builder r4 = r3.f11745d
            android.net.Uri r4 = r4.build()
            java.lang.String r1 = r3.f11742a
            r0.mo3641k(r4, r1)
            return
        L3d:
            com.google.android.gms.common.api.Status r4 = p074e9.C1805a.m4514B(r4)
            java.lang.String r1 = r3.f11742a
            r0.mo3642p(r1, r4)
            return
    }

    @Override // android.os.AsyncTask
    public final p124h7.C2714kc doInBackground(java.lang.Void[] r7) {
            r6 = this;
            java.lang.Void[] r7 = (java.lang.Void[]) r7
            java.lang.String r7 = r6.f11746e
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r0 = 0
            if (r7 != 0) goto L16
            java.lang.String r7 = r6.f11746e
            h7.kc r0 = new h7.kc
            r0.<init>()
            r0.f11707a = r7
            goto L15d
        L16:
            r7 = 0
            java.net.URL r1 = new java.net.URL     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.lang.String r2 = r6.f11743b     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r1.<init>(r2)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.lang.ref.WeakReference<h7.mc> r2 = r6.f11744c     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.lang.Object r2 = r2.get()     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            h7.mc r2 = (p124h7.InterfaceC2750mc) r2     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.net.HttpURLConnection r1 = r2.mo3640j(r1)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/json; charset=UTF-8"
            r1.addRequestProperty(r3, r4)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r3 = 60000(0xea60, float:8.4078E-41)
            r1.setConnectTimeout(r3)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            h7.ed r3 = new h7.ed     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            android.content.Context r2 = r2.mo3637a()     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            h7.cd r4 = new h7.cd     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.lang.String r5 = p124h7.C2571cd.m6532b()     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r4.<init>(r5)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.lang.String r4 = r4.m6533a()     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r3.<init>(r2, r4)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r3.m6647a(r1)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            int r2 = r1.getResponseCode()     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 128(0x80, float:1.8E-43)
            if (r2 == r3) goto Lc4
            int r3 = r1.getResponseCode()     // Catch: java.io.IOException -> L7d p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122
            r5 = 400(0x190, float:5.6E-43)
            if (r3 < r5) goto La0
            java.io.InputStream r1 = r1.getErrorStream()     // Catch: java.io.IOException -> L7d p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122
            if (r1 != 0) goto L6b
            java.lang.String r1 = "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again."
            goto La1
        L6b:
            java.lang.String r3 = new java.lang.String     // Catch: java.io.IOException -> L7d p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122
            byte[] r1 = m6963b(r1, r4)     // Catch: java.io.IOException -> L7d p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122
            r3.<init>(r1)     // Catch: java.io.IOException -> L7d p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r1 = p124h7.C2984zc.m7358a(r3, r1)     // Catch: java.io.IOException -> L7d p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.io.IOException -> L7d p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122
            goto La1
        L7d:
            r1 = move-exception
            r6.a r3 = p124h7.AsyncTaskC2732lc.f11741f     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            int r4 = r1.length()     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            int r4 = r4 + 75
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r5.<init>(r4)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.lang.String r4 = "Error parsing error message from response body in getErrorMessageFromBody. "
            r5.append(r4)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r5.append(r1)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.lang.String r1 = r5.toString()     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r3.m12164e(r1, r4)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
        La0:
            r1 = r0
        La1:
            r6.a r3 = p124h7.AsyncTaskC2732lc.f11741f     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r4[r7] = r1     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r5 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r4[r5] = r2     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.lang.String r2 = "Error getting project config. Failed with %s %s"
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r3.m12161b(r2, r4)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            h7.kc r2 = new h7.kc     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r2.<init>()     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r2.f11708b = r1     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r0 = r2
            goto L15d
        Lc4:
            h7.le r2 = new h7.le     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r2.<init>()     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.lang.String r3 = new java.lang.String     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.io.InputStream r1 = r1.getInputStream()     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            byte[] r1 = m6963b(r1, r4)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r3.<init>(r1)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r2.m6965a(r3)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.util.List<java.lang.String> r1 = r2.f11749Y     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.util.Iterator r1 = r1.iterator()     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
        Ldf:
            boolean r2 = r1.hasNext()     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            if (r2 == 0) goto L15d
            java.lang.Object r2 = r1.next()     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.lang.String r2 = (java.lang.String) r2     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            java.lang.String r3 = "firebaseapp.com"
            boolean r3 = r2.endsWith(r3)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            if (r3 != 0) goto Lfb
            java.lang.String r3 = "web.app"
            boolean r3 = r2.endsWith(r3)     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            if (r3 == 0) goto Ldf
        Lfb:
            h7.kc r1 = new h7.kc     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r1.<init>()     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r1.f11707a = r2     // Catch: p124h7.C2713kb -> L104 java.lang.NullPointerException -> L122 java.io.IOException -> L140
            r0 = r1
            goto L15d
        L104:
            r1 = move-exception
            r6.a r2 = p124h7.AsyncTaskC2732lc.f11741f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 33
            r4.<init>(r3)
            java.lang.String r3 = "ConversionException encountered: "
            java.lang.String r1 = p346u.C6269n.m12888a(r4, r3, r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.m12161b(r1, r7)
            goto L15d
        L122:
            r1 = move-exception
            r6.a r2 = p124h7.AsyncTaskC2732lc.f11741f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 26
            r4.<init>(r3)
            java.lang.String r3 = "Null pointer encountered: "
            java.lang.String r1 = p346u.C6269n.m12888a(r4, r3, r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.m12161b(r1, r7)
            goto L15d
        L140:
            r1 = move-exception
            r6.a r2 = p124h7.AsyncTaskC2732lc.f11741f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 22
            r4.<init>(r3)
            java.lang.String r3 = "IOException occurred: "
            java.lang.String r1 = p346u.C6269n.m12888a(r4, r3, r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.m12161b(r1, r7)
        L15d:
            return r0
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onCancelled(p124h7.C2714kc r1) {
            r0 = this;
            h7.kc r1 = (p124h7.C2714kc) r1
            r1 = 0
            r0.m6964a(r1)
            return
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(p124h7.C2714kc r1) {
            r0 = this;
            h7.kc r1 = (p124h7.C2714kc) r1
            r0.m6964a(r1)
            return
    }
}
