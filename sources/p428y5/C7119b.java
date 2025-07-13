package p428y5;

/* renamed from: y5.b */
/* loaded from: classes.dex */
public final class C7119b extends java.lang.Thread {

    /* renamed from: Y */
    public final /* synthetic */ java.util.Map f27533Y;

    public C7119b(java.util.Map r1) {
            r0 = this;
            r0.f27533Y = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r7 = this;
            java.lang.String r0 = ". "
            java.lang.String r1 = "HttpUrlPinger"
            java.util.Map r2 = r7.f27533Y
            java.lang.String r3 = "https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.util.Set r4 = r2.keySet()
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2e
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            r3.appendQueryParameter(r5, r6)
            goto L18
        L2e:
            android.net.Uri r2 = r3.build()
            java.lang.String r2 = r2.toString()
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.RuntimeException -> L7c java.io.IOException -> L7e java.lang.IndexOutOfBoundsException -> L95
            r3.<init>(r2)     // Catch: java.lang.RuntimeException -> L7c java.io.IOException -> L7e java.lang.IndexOutOfBoundsException -> L95
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.RuntimeException -> L7c java.io.IOException -> L7e java.lang.IndexOutOfBoundsException -> L95
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.RuntimeException -> L7c java.io.IOException -> L7e java.lang.IndexOutOfBoundsException -> L95
            int r4 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L77
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 < r5) goto L4d
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 < r5) goto L73
        L4d:
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L77
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L77
            int r5 = r5 + 65
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L77
            java.lang.String r5 = "Received non-success response code "
            r6.append(r5)     // Catch: java.lang.Throwable -> L77
            r6.append(r4)     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = " from pinging URL: "
            r6.append(r4)     // Catch: java.lang.Throwable -> L77
            r6.append(r2)     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L77
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L77
        L73:
            r3.disconnect()     // Catch: java.lang.RuntimeException -> L7c java.io.IOException -> L7e java.lang.IndexOutOfBoundsException -> L95
            return
        L77:
            r4 = move-exception
            r3.disconnect()     // Catch: java.lang.RuntimeException -> L7c java.io.IOException -> L7e java.lang.IndexOutOfBoundsException -> L95
            throw r4     // Catch: java.lang.RuntimeException -> L7c java.io.IOException -> L7e java.lang.IndexOutOfBoundsException -> L95
        L7c:
            r3 = move-exception
            goto L7f
        L7e:
            r3 = move-exception
        L7f:
            java.lang.String r4 = r3.getMessage()
            r5 = 27
            int r5 = p064e.C1489c.m4038a(r2, r5)
            int r5 = p064e.C1489c.m4038a(r4, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Error while pinging URL: "
            goto Lab
        L95:
            r3 = move-exception
            java.lang.String r4 = r3.getMessage()
            r5 = 32
            int r5 = p064e.C1489c.m4038a(r2, r5)
            int r5 = p064e.C1489c.m4038a(r4, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Error while parsing ping URL: "
        Lab:
            r6.append(r5)
            r6.append(r2)
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            android.util.Log.w(r1, r0, r3)
            return
    }
}
