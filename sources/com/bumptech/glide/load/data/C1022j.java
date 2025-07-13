package com.bumptech.glide.load.data;

/* renamed from: com.bumptech.glide.load.data.j */
/* loaded from: classes.dex */
public class C1022j implements com.bumptech.glide.load.data.InterfaceC1016d<java.io.InputStream> {

    /* renamed from: d0 */
    public static final com.bumptech.glide.load.data.C1022j.b f5209d0 = null;

    /* renamed from: Y */
    public final p282q2.C5549f f5210Y;

    /* renamed from: Z */
    public final int f5211Z;

    /* renamed from: a0 */
    public java.net.HttpURLConnection f5212a0;

    /* renamed from: b0 */
    public java.io.InputStream f5213b0;

    /* renamed from: c0 */
    public volatile boolean f5214c0;

    /* renamed from: com.bumptech.glide.load.data.j$a */
    public static class a implements com.bumptech.glide.load.data.C1022j.b {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: com.bumptech.glide.load.data.j$b */
    public interface b {
    }

    static {
            com.bumptech.glide.load.data.j$a r0 = new com.bumptech.glide.load.data.j$a
            r0.<init>()
            com.bumptech.glide.load.data.C1022j.f5209d0 = r0
            return
    }

    public C1022j(p282q2.C5549f r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f5210Y = r1
            r0.f5211Z = r2
            return
    }

    /* renamed from: c */
    public static int m2796c(java.net.HttpURLConnection r2) {
            int r2 = r2.getResponseCode()     // Catch: java.io.IOException -> L5
            return r2
        L5:
            r2 = move-exception
            r0 = 3
            java.lang.String r1 = "HttpUrlFetcher"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L14
            java.lang.String r0 = "Failed to get a response code"
            android.util.Log.d(r1, r0, r2)
        L14:
            r2 = -1
            return r2
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: a */
    public java.lang.Class<java.io.InputStream> mo2786a() {
            r1 = this;
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: b */
    public void mo2789b() {
            r1 = this;
            java.io.InputStream r0 = r1.f5213b0
            if (r0 == 0) goto L9
            r0.close()     // Catch: java.io.IOException -> L8
            goto L9
        L8:
        L9:
            java.net.HttpURLConnection r0 = r1.f5212a0
            if (r0 == 0) goto L10
            r0.disconnect()
        L10:
            r0 = 0
            r1.f5212a0 = r0
            return
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    public void cancel() {
            r1 = this;
            r0 = 1
            r1.f5214c0 = r0
            return
    }

    /* renamed from: d */
    public final java.io.InputStream m2797d(java.net.URL r8, int r9, java.net.URL r10, java.util.Map<java.lang.String, java.lang.String> r11) {
            r7 = this;
            r0 = -1
            r1 = 0
            r2 = 5
            if (r9 >= r2) goto L13c
            if (r10 == 0) goto L1e
            java.net.URI r2 = r8.toURI()     // Catch: java.net.URISyntaxException -> L1e
            java.net.URI r10 = r10.toURI()     // Catch: java.net.URISyntaxException -> L1e
            boolean r10 = r2.equals(r10)     // Catch: java.net.URISyntaxException -> L1e
            if (r10 != 0) goto L16
            goto L1e
        L16:
            k2.b r10 = new k2.b     // Catch: java.net.URISyntaxException -> L1e
            java.lang.String r2 = "In re-direct loop"
            r10.<init>(r2, r0, r1)     // Catch: java.net.URISyntaxException -> L1e
            throw r10     // Catch: java.net.URISyntaxException -> L1e
        L1e:
            r10 = 0
            java.net.URLConnection r2 = r8.openConnection()     // Catch: java.io.IOException -> L133
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.io.IOException -> L133
            java.util.Set r3 = r11.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L2d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L49
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r2.addRequestProperty(r5, r4)
            goto L2d
        L49:
            int r3 = r7.f5211Z
            r2.setConnectTimeout(r3)
            int r3 = r7.f5211Z
            r2.setReadTimeout(r3)
            r2.setUseCaches(r10)
            r3 = 1
            r2.setDoInput(r3)
            r2.setInstanceFollowRedirects(r10)
            r7.f5212a0 = r2
            r2.connect()     // Catch: java.io.IOException -> L124
            java.net.HttpURLConnection r2 = r7.f5212a0     // Catch: java.io.IOException -> L124
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.io.IOException -> L124
            r7.f5213b0 = r2     // Catch: java.io.IOException -> L124
            boolean r2 = r7.f5214c0
            if (r2 == 0) goto L6f
            return r1
        L6f:
            java.net.HttpURLConnection r2 = r7.f5212a0
            int r2 = m2796c(r2)
            int r4 = r2 / 100
            r5 = 2
            if (r4 != r5) goto L7c
            r5 = 1
            goto L7d
        L7c:
            r5 = 0
        L7d:
            r6 = 3
            if (r5 == 0) goto Lcf
            java.net.HttpURLConnection r8 = r7.f5212a0
            java.lang.String r9 = "HttpUrlFetcher"
            java.lang.String r10 = r8.getContentEncoding()     // Catch: java.io.IOException -> Lc2
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch: java.io.IOException -> Lc2
            if (r10 == 0) goto L9d
            int r9 = r8.getContentLength()     // Catch: java.io.IOException -> Lc2
            java.io.InputStream r10 = r8.getInputStream()     // Catch: java.io.IOException -> Lc2
            long r0 = (long) r9     // Catch: java.io.IOException -> Lc2
            g3.c r9 = new g3.c     // Catch: java.io.IOException -> Lc2
            r9.<init>(r10, r0)     // Catch: java.io.IOException -> Lc2
            goto Lbf
        L9d:
            boolean r10 = android.util.Log.isLoggable(r9, r6)     // Catch: java.io.IOException -> Lc2
            if (r10 == 0) goto Lbb
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lc2
            r10.<init>()     // Catch: java.io.IOException -> Lc2
            java.lang.String r11 = "Got non empty content encoding: "
            r10.append(r11)     // Catch: java.io.IOException -> Lc2
            java.lang.String r11 = r8.getContentEncoding()     // Catch: java.io.IOException -> Lc2
            r10.append(r11)     // Catch: java.io.IOException -> Lc2
            java.lang.String r10 = r10.toString()     // Catch: java.io.IOException -> Lc2
            android.util.Log.d(r9, r10)     // Catch: java.io.IOException -> Lc2
        Lbb:
            java.io.InputStream r9 = r8.getInputStream()     // Catch: java.io.IOException -> Lc2
        Lbf:
            r7.f5213b0 = r9     // Catch: java.io.IOException -> Lc2
            return r9
        Lc2:
            r9 = move-exception
            k2.b r10 = new k2.b
            int r8 = m2796c(r8)
            java.lang.String r11 = "Failed to obtain InputStream"
            r10.<init>(r11, r8, r9)
            throw r10
        Lcf:
            if (r4 != r6) goto Ld2
            r10 = 1
        Ld2:
            if (r10 == 0) goto L105
            java.net.HttpURLConnection r10 = r7.f5212a0
            java.lang.String r0 = "Location"
            java.lang.String r10 = r10.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto Lfd
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> Lf0
            r0.<init>(r8, r10)     // Catch: java.net.MalformedURLException -> Lf0
            r7.mo2789b()
            int r9 = r9 + r3
            java.io.InputStream r8 = r7.m2797d(r0, r9, r8, r11)
            return r8
        Lf0:
            r8 = move-exception
            k2.b r9 = new k2.b
            java.lang.String r11 = "Bad redirect url: "
            java.lang.String r10 = p064e.C1493g.m4049a(r11, r10)
            r9.<init>(r10, r2, r8)
            throw r9
        Lfd:
            k2.b r8 = new k2.b
            java.lang.String r9 = "Received empty or null redirect url"
            r8.<init>(r9, r2, r1)
            throw r8
        L105:
            if (r2 != r0) goto L10f
            k2.b r8 = new k2.b
            java.lang.String r9 = "Http request failed"
            r8.<init>(r9, r2, r1)
            throw r8
        L10f:
            k2.b r8 = new k2.b     // Catch: java.io.IOException -> L11b
            java.net.HttpURLConnection r9 = r7.f5212a0     // Catch: java.io.IOException -> L11b
            java.lang.String r9 = r9.getResponseMessage()     // Catch: java.io.IOException -> L11b
            r8.<init>(r9, r2, r1)     // Catch: java.io.IOException -> L11b
            throw r8     // Catch: java.io.IOException -> L11b
        L11b:
            r8 = move-exception
            k2.b r9 = new k2.b
            java.lang.String r10 = "Failed to get a response message"
            r9.<init>(r10, r2, r8)
            throw r9
        L124:
            r8 = move-exception
            k2.b r9 = new k2.b
            java.net.HttpURLConnection r10 = r7.f5212a0
            int r10 = m2796c(r10)
            java.lang.String r11 = "Failed to connect or obtain data"
            r9.<init>(r11, r10, r8)
            throw r9
        L133:
            r8 = move-exception
            k2.b r9 = new k2.b
            java.lang.String r11 = "URL.openConnection threw"
            r9.<init>(r11, r10, r8)
            throw r9
        L13c:
            k2.b r8 = new k2.b
            java.lang.String r9 = "Too many (> 5) redirects!"
            r8.<init>(r9, r0, r1)
            throw r8
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: e */
    public com.bumptech.glide.load.EnumC1008a mo2792e() {
            r1 = this;
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.EnumC1008a.f5181Z
            return r0
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: f */
    public void mo2793f(com.bumptech.glide.EnumC1003g r9, com.bumptech.glide.load.data.InterfaceC1016d.a<? super java.io.InputStream> r10) {
            r8 = this;
            java.lang.String r9 = "Finished http url fetcher fetch in "
            java.lang.String r0 = "HttpUrlFetcher"
            int r1 = p106g3.C2234f.f10203b
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()
            r3 = 2
            q2.f r4 = r8.f5210Y     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            java.net.URL r4 = r4.m11832d()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r5 = 0
            r6 = 0
            q2.f r7 = r8.f5210Y     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            q2.g r7 = r7.f21601b     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            java.util.Map r7 = r7.mo11833a()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            java.io.InputStream r4 = r8.m2797d(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r10.mo2795d(r4)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            boolean r10 = android.util.Log.isLoggable(r0, r3)
            if (r10 == 0) goto L5c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            goto L4b
        L2e:
            r10 = move-exception
            goto L5d
        L30:
            r4 = move-exception
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto L3d
            java.lang.String r5 = "Failed to load data for url"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L2e
        L3d:
            r10.mo2794c(r4)     // Catch: java.lang.Throwable -> L2e
            boolean r10 = android.util.Log.isLoggable(r0, r3)
            if (r10 == 0) goto L5c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
        L4b:
            r10.append(r9)
            double r1 = p106g3.C2234f.m5833a(r1)
            r10.append(r1)
            java.lang.String r9 = r10.toString()
            android.util.Log.v(r0, r9)
        L5c:
            return
        L5d:
            boolean r3 = android.util.Log.isLoggable(r0, r3)
            if (r3 == 0) goto L75
            java.lang.StringBuilder r9 = android.support.v4.media.C0144c.m256a(r9)
            double r1 = p106g3.C2234f.m5833a(r1)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r0, r9)
        L75:
            throw r10
    }
}
