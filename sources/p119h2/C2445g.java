package p119h2;

/* renamed from: h2.g */
/* loaded from: classes.dex */
public class C2445g extends p119h2.AbstractC2439a {

    /* renamed from: h2.g$a */
    public static class a extends java.io.FilterInputStream {

        /* renamed from: Y */
        public final java.net.HttpURLConnection f10941Y;

        public a(java.net.HttpURLConnection r2) {
                r1 = this;
                java.io.InputStream r0 = r2.getInputStream()     // Catch: java.io.IOException -> L5
                goto L9
            L5:
                java.io.InputStream r0 = r2.getErrorStream()
            L9:
                r1.<init>(r0)
                r1.f10941Y = r2
                return
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                super.close()
                java.net.HttpURLConnection r0 = r1.f10941Y
                r0.disconnect()
                return
        }
    }

    public C2445g() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: d */
    public static java.util.List<p105g2.C2214h> m6217d(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L11:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            if (r2 == 0) goto L11
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L2d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            g2.h r4 = new g2.h
            java.lang.Object r5 = r1.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r4.<init>(r5, r3)
            r0.add(r4)
            goto L2d
        L48:
            return r0
    }

    @Override // p119h2.AbstractC2439a
    /* renamed from: a */
    public p119h2.C2444f mo6190a(p105g2.AbstractC2220n<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) {
            r6 = this;
            java.lang.String r0 = r7.f10142a0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1.putAll(r8)
            java.util.Map r8 = r7.mo5806p()
            r1.putAll(r8)
            java.net.URL r8 = new java.net.URL
            r8.<init>(r0)
            java.net.URLConnection r0 = r8.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            boolean r2 = java.net.HttpURLConnection.getFollowRedirects()
            r0.setInstanceFollowRedirects(r2)
            g2.f r2 = r7.f10151j0
            int r2 = r2.f10121a
            r0.setConnectTimeout(r2)
            r0.setReadTimeout(r2)
            r2 = 0
            r0.setUseCaches(r2)
            r3 = 1
            r0.setDoInput(r3)
            java.lang.String r8 = r8.getProtocol()
            java.lang.String r4 = "https"
            r4.equals(r8)
            java.util.Set r8 = r1.keySet()     // Catch: java.lang.Throwable -> Lb4
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lb4
        L46:
            boolean r4 = r8.hasNext()     // Catch: java.lang.Throwable -> Lb4
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r8.next()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r5 = r1.get(r4)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lb4
            r0.setRequestProperty(r4, r5)     // Catch: java.lang.Throwable -> Lb4
            goto L46
        L5c:
            r6.m6220e(r0, r7)     // Catch: java.lang.Throwable -> Lb4
            int r8 = r0.getResponseCode()     // Catch: java.lang.Throwable -> Lb4
            r1 = -1
            if (r8 == r1) goto Lac
            int r7 = r7.f10141Z     // Catch: java.lang.Throwable -> Lb4
            r4 = 4
            if (r7 == r4) goto L7d
            r7 = 100
            if (r7 > r8) goto L73
            r7 = 200(0xc8, float:2.8E-43)
            if (r8 < r7) goto L7d
        L73:
            r7 = 204(0xcc, float:2.86E-43)
            if (r8 == r7) goto L7d
            r7 = 304(0x130, float:4.26E-43)
            if (r8 == r7) goto L7d
            r7 = 1
            goto L7e
        L7d:
            r7 = 0
        L7e:
            if (r7 != 0) goto L92
            h2.f r7 = new h2.f     // Catch: java.lang.Throwable -> Lb4
            java.util.Map r3 = r0.getHeaderFields()     // Catch: java.lang.Throwable -> Lb4
            java.util.List r3 = m6217d(r3)     // Catch: java.lang.Throwable -> Lb4
            r4 = 0
            r7.<init>(r8, r3, r1, r4)     // Catch: java.lang.Throwable -> Lb4
            r0.disconnect()
            return r7
        L92:
            h2.f r7 = new h2.f     // Catch: java.lang.Throwable -> La9
            java.util.Map r1 = r0.getHeaderFields()     // Catch: java.lang.Throwable -> La9
            java.util.List r1 = m6217d(r1)     // Catch: java.lang.Throwable -> La9
            int r2 = r0.getContentLength()     // Catch: java.lang.Throwable -> La9
            h2.g$a r4 = new h2.g$a     // Catch: java.lang.Throwable -> La9
            r4.<init>(r0)     // Catch: java.lang.Throwable -> La9
            r7.<init>(r8, r1, r2, r4)     // Catch: java.lang.Throwable -> La9
            return r7
        La9:
            r7 = move-exception
            r2 = 1
            goto Lb5
        Lac:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r8 = "Could not retrieve response code from HttpUrlConnection."
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lb4
            throw r7     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r7 = move-exception
        Lb5:
            if (r2 != 0) goto Lba
            r0.disconnect()
        Lba:
            throw r7
    }

    /* renamed from: b */
    public final void m6218b(java.net.HttpURLConnection r2, p105g2.AbstractC2220n<?> r3, byte[] r4) {
            r1 = this;
            r3 = 1
            r2.setDoOutput(r3)
            java.util.Map r3 = r2.getRequestProperties()
            java.lang.String r0 = "Content-Type"
            boolean r3 = r3.containsKey(r0)
            if (r3 != 0) goto L15
            java.lang.String r3 = "application/x-www-form-urlencoded; charset=UTF-8"
            r2.setRequestProperty(r0, r3)
        L15:
            java.io.DataOutputStream r3 = new java.io.DataOutputStream
            java.io.OutputStream r2 = r2.getOutputStream()
            r3.<init>(r2)
            r3.write(r4)
            r3.close()
            return
    }

    /* renamed from: c */
    public final void m6219c(java.net.HttpURLConnection r2, p105g2.AbstractC2220n<?> r3) {
            r1 = this;
            byte[] r0 = r3.mo116l()
            if (r0 == 0) goto L9
            r1.m6218b(r2, r3, r0)
        L9:
            return
    }

    /* renamed from: e */
    public void m6220e(java.net.HttpURLConnection r2, p105g2.AbstractC2220n<?> r3) {
            r1 = this;
            int r0 = r3.f10141Z
            switch(r0) {
                case -1: goto L2d;
                case 0: goto L28;
                case 1: goto L1f;
                case 2: goto L1c;
                case 3: goto L19;
                case 4: goto L16;
                case 5: goto L13;
                case 6: goto L10;
                case 7: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unknown method type."
            r2.<init>(r3)
            throw r2
        Ld:
            java.lang.String r0 = "PATCH"
            goto L21
        L10:
            java.lang.String r3 = "TRACE"
            goto L2a
        L13:
            java.lang.String r3 = "OPTIONS"
            goto L2a
        L16:
            java.lang.String r3 = "HEAD"
            goto L2a
        L19:
            java.lang.String r3 = "DELETE"
            goto L2a
        L1c:
            java.lang.String r0 = "PUT"
            goto L21
        L1f:
            java.lang.String r0 = "POST"
        L21:
            r2.setRequestMethod(r0)
            r1.m6219c(r2, r3)
            goto L2d
        L28:
            java.lang.String r3 = "GET"
        L2a:
            r2.setRequestMethod(r3)
        L2d:
            return
    }
}
