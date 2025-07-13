package com.google.firebase.remoteconfig.internal;

/* renamed from: com.google.firebase.remoteconfig.internal.a */
/* loaded from: classes.dex */
public class C1247a {

    /* renamed from: i */
    public static final long f6636i = 0;

    /* renamed from: j */
    public static final int[] f6637j = null;

    /* renamed from: a */
    public final p412xa.InterfaceC7011d f6638a;

    /* renamed from: b */
    public final p392wa.InterfaceC6823b<p329s9.InterfaceC5997a> f6639b;

    /* renamed from: c */
    public final java.util.concurrent.Executor f6640c;

    /* renamed from: d */
    public final java.util.Random f6641d;

    /* renamed from: e */
    public final p128hb.C2998c f6642e;

    /* renamed from: f */
    public final com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient f6643f;

    /* renamed from: g */
    public final com.google.firebase.remoteconfig.internal.C1248b f6644g;

    /* renamed from: h */
    public final java.util.Map<java.lang.String, java.lang.String> f6645h;

    /* renamed from: com.google.firebase.remoteconfig.internal.a$a */
    public static class a {

        /* renamed from: a */
        public final int f6646a;

        /* renamed from: b */
        public final p128hb.C2999d f6647b;

        /* renamed from: c */
        public final java.lang.String f6648c;

        public a(java.util.Date r1, int r2, p128hb.C2999d r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.f6646a = r2
                r0.f6647b = r3
                r0.f6648c = r4
                return
        }
    }

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            r1 = 12
            long r0 = r0.toSeconds(r1)
            com.google.firebase.remoteconfig.internal.C1247a.f6636i = r0
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [2, 4, 8, 16, 32, 64, 128, 256} // fill-array
            com.google.firebase.remoteconfig.internal.C1247a.f6637j = r0
            return
    }

    public C1247a(p412xa.InterfaceC7011d r1, p392wa.InterfaceC6823b<p329s9.InterfaceC5997a> r2, java.util.concurrent.Executor r3, p353u6.InterfaceC6340c r4, java.util.Random r5, p128hb.C2998c r6, com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient r7, com.google.firebase.remoteconfig.internal.C1248b r8, java.util.Map<java.lang.String, java.lang.String> r9) {
            r0 = this;
            r0.<init>()
            r0.f6638a = r1
            r0.f6639b = r2
            r0.f6640c = r3
            r0.f6641d = r5
            r0.f6642e = r6
            r0.f6643f = r7
            r0.f6644g = r8
            r0.f6645h = r9
            return
    }

    /* renamed from: a */
    public final com.google.firebase.remoteconfig.internal.C1247a.a m3678a(java.lang.String r11, java.lang.String r12, java.util.Date r13) {
            r10 = this;
            r0 = 0
            com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient r1 = r10.f6643f     // Catch: gb.C2317g -> L46
            java.net.HttpURLConnection r3 = r1.m3675b()     // Catch: gb.C2317g -> L46
            com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient r2 = r10.f6643f     // Catch: gb.C2317g -> L46
            java.util.Map r6 = r10.m3679b()     // Catch: gb.C2317g -> L46
            com.google.firebase.remoteconfig.internal.b r1 = r10.f6644g     // Catch: gb.C2317g -> L46
            android.content.SharedPreferences r1 = r1.f6651a     // Catch: gb.C2317g -> L46
            java.lang.String r4 = "last_fetch_etag"
            r5 = 0
            java.lang.String r7 = r1.getString(r4, r5)     // Catch: gb.C2317g -> L46
            java.util.Map<java.lang.String, java.lang.String> r8 = r10.f6645h     // Catch: gb.C2317g -> L46
            r4 = r11
            r5 = r12
            r9 = r13
            com.google.firebase.remoteconfig.internal.a$a r11 = r2.fetch(r3, r4, r5, r6, r7, r8, r9)     // Catch: gb.C2317g -> L46
            java.lang.String r12 = r11.f6648c     // Catch: gb.C2317g -> L46
            if (r12 == 0) goto L3e
            com.google.firebase.remoteconfig.internal.b r1 = r10.f6644g     // Catch: gb.C2317g -> L46
            java.lang.Object r2 = r1.f6652b     // Catch: gb.C2317g -> L46
            monitor-enter(r2)     // Catch: gb.C2317g -> L46
            android.content.SharedPreferences r1 = r1.f6651a     // Catch: java.lang.Throwable -> L3b
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "last_fetch_etag"
            android.content.SharedPreferences$Editor r12 = r1.putString(r3, r12)     // Catch: java.lang.Throwable -> L3b
            r12.apply()     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
            goto L3e
        L3b:
            r11 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
            throw r11     // Catch: gb.C2317g -> L46
        L3e:
            com.google.firebase.remoteconfig.internal.b r12 = r10.f6644g     // Catch: gb.C2317g -> L46
            java.util.Date r1 = com.google.firebase.remoteconfig.internal.C1248b.f6650e     // Catch: gb.C2317g -> L46
            r12.m3681b(r0, r1)     // Catch: gb.C2317g -> L46
            return r11
        L46:
            r11 = move-exception
            int r12 = r11.f10544Y
            r1 = 429(0x1ad, float:6.01E-43)
            r2 = 1
            if (r12 == r1) goto L5d
            r3 = 502(0x1f6, float:7.03E-43)
            if (r12 == r3) goto L5d
            r3 = 503(0x1f7, float:7.05E-43)
            if (r12 == r3) goto L5d
            r3 = 504(0x1f8, float:7.06E-43)
            if (r12 != r3) goto L5b
            goto L5d
        L5b:
            r12 = 0
            goto L5e
        L5d:
            r12 = 1
        L5e:
            if (r12 == 0) goto L97
            com.google.firebase.remoteconfig.internal.b r12 = r10.f6644g
            com.google.firebase.remoteconfig.internal.b$a r12 = r12.m3680a()
            int r12 = r12.f6654a
            int r12 = r12 + r2
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES
            int[] r4 = com.google.firebase.remoteconfig.internal.C1247a.f6637j
            int r5 = r4.length
            int r5 = java.lang.Math.min(r12, r5)
            int r5 = r5 + (-1)
            r4 = r4[r5]
            long r4 = (long) r4
            long r3 = r3.toMillis(r4)
            r5 = 2
            long r5 = r3 / r5
            java.util.Random r7 = r10.f6641d
            int r4 = (int) r3
            int r3 = r7.nextInt(r4)
            long r3 = (long) r3
            long r5 = r5 + r3
            java.util.Date r3 = new java.util.Date
            long r7 = r13.getTime()
            long r7 = r7 + r5
            r3.<init>(r7)
            com.google.firebase.remoteconfig.internal.b r13 = r10.f6644g
            r13.m3681b(r12, r3)
        L97:
            com.google.firebase.remoteconfig.internal.b r12 = r10.f6644g
            com.google.firebase.remoteconfig.internal.b$a r12 = r12.m3680a()
            int r13 = r11.f10544Y
            int r3 = r12.f6654a
            if (r3 > r2) goto La5
            if (r13 != r1) goto La6
        La5:
            r0 = 1
        La6:
            if (r0 != 0) goto Ldd
            r12 = 401(0x191, float:5.62E-43)
            if (r13 == r12) goto Lcd
            r12 = 403(0x193, float:5.65E-43)
            if (r13 == r12) goto Lca
            if (r13 == r1) goto Lc2
            r12 = 500(0x1f4, float:7.0E-43)
            if (r13 == r12) goto Lbf
            switch(r13) {
                case 502: goto Lbc;
                case 503: goto Lbc;
                case 504: goto Lbc;
                default: goto Lb9;
            }
        Lb9:
            java.lang.String r12 = "The server returned an unexpected error."
            goto Lcf
        Lbc:
            java.lang.String r12 = "The server is unavailable. Please try again later."
            goto Lcf
        Lbf:
            java.lang.String r12 = "There was an internal server error."
            goto Lcf
        Lc2:
            gb.d r11 = new gb.d
            java.lang.String r12 = "The throttled response from the server was not handled correctly by the FRC SDK."
            r11.<init>(r12)
            throw r11
        Lca:
            java.lang.String r12 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project."
            goto Lcf
        Lcd:
            java.lang.String r12 = "The request did not have the required credentials. Please make sure your google-services.json is valid."
        Lcf:
            gb.g r13 = new gb.g
            int r0 = r11.f10544Y
            java.lang.String r1 = "Fetch failed: "
            java.lang.String r12 = p064e.C1493g.m4049a(r1, r12)
            r13.<init>(r0, r12, r11)
            throw r13
        Ldd:
            gb.f r11 = new gb.f
            java.util.Date r12 = r12.f6655b
            long r12 = r12.getTime()
            r11.<init>(r12)
            throw r11
    }

    /* renamed from: b */
    public final java.util.Map<java.lang.String, java.lang.String> m3679b() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            wa.b<s9.a> r1 = r4.f6639b
            java.lang.Object r1 = r1.get()
            s9.a r1 = (p329s9.InterfaceC5997a) r1
            if (r1 != 0) goto L10
            return r0
        L10:
            r2 = 0
            java.util.Map r1 = r1.mo12479b(r2)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = r2.toString()
            r0.put(r3, r2)
            goto L1d
        L3b:
            return r0
    }
}
