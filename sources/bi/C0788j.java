package bi;

/* renamed from: bi.j */
/* loaded from: classes.dex */
public final class C0788j {

    /* renamed from: b */
    public static final java.util.Comparator<java.lang.String> f4266b = null;

    /* renamed from: c */
    public static final java.util.Map<java.lang.String, bi.C0788j> f4267c = null;

    /* renamed from: d */
    public static final bi.C0788j f4268d = null;

    /* renamed from: e */
    public static final bi.C0788j f4269e = null;

    /* renamed from: f */
    public static final bi.C0788j f4270f = null;

    /* renamed from: g */
    public static final bi.C0788j f4271g = null;

    /* renamed from: h */
    public static final bi.C0788j f4272h = null;

    /* renamed from: i */
    public static final bi.C0788j f4273i = null;

    /* renamed from: j */
    public static final bi.C0788j f4274j = null;

    /* renamed from: k */
    public static final bi.C0788j f4275k = null;

    /* renamed from: l */
    public static final bi.C0788j f4276l = null;

    /* renamed from: m */
    public static final bi.C0788j f4277m = null;

    /* renamed from: n */
    public static final bi.C0788j f4278n = null;

    /* renamed from: o */
    public static final bi.C0788j f4279o = null;

    /* renamed from: p */
    public static final bi.C0788j f4280p = null;

    /* renamed from: q */
    public static final bi.C0788j f4281q = null;

    /* renamed from: r */
    public static final bi.C0788j f4282r = null;

    /* renamed from: s */
    public static final bi.C0788j f4283s = null;

    /* renamed from: t */
    public static final bi.C0788j.b f4284t = null;

    /* renamed from: a */
    public final java.lang.String f4285a;

    /* renamed from: bi.j$a */
    public static final class a implements java.util.Comparator<java.lang.String> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(java.lang.String r7, java.lang.String r8) {
                r6 = this;
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r0 = "a"
                p214m2.C4339q.m9706k(r7, r0)
                java.lang.String r0 = "b"
                p214m2.C4339q.m9706k(r8, r0)
                int r0 = r7.length()
                int r1 = r8.length()
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 4
            L1b:
                r2 = -1
                r3 = 1
                if (r1 >= r0) goto L35
                char r4 = r7.charAt(r1)
                char r5 = r8.charAt(r1)
                if (r4 == r5) goto L32
                int r7 = p214m2.C4339q.m9708m(r4, r5)
                if (r7 >= 0) goto L30
                goto L43
            L30:
                r2 = 1
                goto L43
            L32:
                int r1 = r1 + 1
                goto L1b
            L35:
                int r7 = r7.length()
                int r8 = r8.length()
                if (r7 == r8) goto L42
                if (r7 >= r8) goto L30
                goto L43
            L42:
                r2 = 0
            L43:
                return r2
        }
    }

    /* renamed from: bi.j$b */
    public static final class b {
        public b(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public static final bi.C0788j m2398a(bi.C0788j.b r0, java.lang.String r1, int r2) {
                bi.j r0 = new bi.j
                r2 = 0
                r0.<init>(r1, r2)
                java.util.Map<java.lang.String, bi.j> r2 = bi.C0788j.f4267c
                r2.put(r1, r0)
                return r0
        }

        /* renamed from: b */
        public final synchronized bi.C0788j m2399b(java.lang.String r4) {
                r3 = this;
                monitor-enter(r3)
                java.lang.String r0 = "javaName"
                p214m2.C4339q.m9706k(r4, r0)     // Catch: java.lang.Throwable -> L2d
                java.util.Map<java.lang.String, bi.j> r0 = bi.C0788j.f4267c     // Catch: java.lang.Throwable -> L2d
                r1 = r0
                java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L2d
                bi.j r1 = (bi.C0788j) r1     // Catch: java.lang.Throwable -> L2d
                if (r1 != 0) goto L2b
                java.lang.String r1 = r3.m2400c(r4)     // Catch: java.lang.Throwable -> L2d
                r2 = r0
                java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L2d
                bi.j r1 = (bi.C0788j) r1     // Catch: java.lang.Throwable -> L2d
                if (r1 != 0) goto L28
                bi.j r1 = new bi.j     // Catch: java.lang.Throwable -> L2d
                r2 = 0
                r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L2d
            L28:
                r0.put(r4, r1)     // Catch: java.lang.Throwable -> L2d
            L2b:
                monitor-exit(r3)
                return r1
            L2d:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
        }

        /* renamed from: c */
        public final java.lang.String m2400c(java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = "TLS_"
                r1 = 0
                r2 = 2
                boolean r3 = p362uh.C6463i.m13061R(r8, r0, r1, r2)
                java.lang.String r4 = "(this as java.lang.String).substring(startIndex)"
                r5 = 4
                java.lang.String r6 = "SSL_"
                if (r3 == 0) goto L26
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r6)
                java.lang.String r8 = r8.substring(r5)
                p214m2.C4339q.m9705j(r8, r4)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                goto L42
            L26:
                boolean r1 = p362uh.C6463i.m13061R(r8, r6, r1, r2)
                if (r1 == 0) goto L42
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r8 = r8.substring(r5)
                p214m2.C4339q.m9705j(r8, r4)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
            L42:
                return r8
        }
    }

    static {
            bi.j$b r0 = new bi.j$b
            r1 = 0
            r0.<init>(r1)
            bi.C0788j.f4284t = r0
            bi.j$a r1 = new bi.j$a
            r1.<init>()
            bi.C0788j.f4266b = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            bi.C0788j.f4267c = r1
            java.lang.String r1 = "SSL_RSA_WITH_NULL_MD5"
            r2 = 1
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "SSL_RSA_WITH_NULL_SHA"
            r2 = 2
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "SSL_RSA_EXPORT_WITH_RC4_40_MD5"
            r2 = 3
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "SSL_RSA_WITH_RC4_128_MD5"
            r2 = 4
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "SSL_RSA_WITH_RC4_128_SHA"
            r2 = 5
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA"
            r2 = 8
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "SSL_RSA_WITH_DES_CBC_SHA"
            r2 = 9
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "SSL_RSA_WITH_3DES_EDE_CBC_SHA"
            r2 = 10
            bi.j r1 = bi.C0788j.b.m2398a(r0, r1, r2)
            bi.C0788j.f4268d = r1
            java.lang.String r1 = "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA"
            r2 = 17
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "SSL_DHE_DSS_WITH_DES_CBC_SHA"
            r2 = 18
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA"
            r2 = 19
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA"
            r2 = 20
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "SSL_DHE_RSA_WITH_DES_CBC_SHA"
            r2 = 21
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA"
            r2 = 22
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5"
            r2 = 23
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "SSL_DH_anon_WITH_RC4_128_MD5"
            r2 = 24
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA"
            r2 = 25
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "SSL_DH_anon_WITH_DES_CBC_SHA"
            r2 = 26
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"
            r2 = 27
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_KRB5_WITH_DES_CBC_SHA"
            r2 = 30
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_KRB5_WITH_3DES_EDE_CBC_SHA"
            r2 = 31
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_KRB5_WITH_RC4_128_SHA"
            r2 = 32
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_KRB5_WITH_DES_CBC_MD5"
            r2 = 34
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_KRB5_WITH_3DES_EDE_CBC_MD5"
            r2 = 35
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_KRB5_WITH_RC4_128_MD5"
            r2 = 36
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA"
            r2 = 38
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_KRB5_EXPORT_WITH_RC4_40_SHA"
            r2 = 40
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5"
            r2 = 41
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_KRB5_EXPORT_WITH_RC4_40_MD5"
            r2 = 43
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_RSA_WITH_AES_128_CBC_SHA"
            r2 = 47
            bi.j r1 = bi.C0788j.b.m2398a(r0, r1, r2)
            bi.C0788j.f4269e = r1
            java.lang.String r1 = "TLS_DHE_DSS_WITH_AES_128_CBC_SHA"
            r2 = 50
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DHE_RSA_WITH_AES_128_CBC_SHA"
            r2 = 51
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DH_anon_WITH_AES_128_CBC_SHA"
            r2 = 52
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_RSA_WITH_AES_256_CBC_SHA"
            r2 = 53
            bi.j r1 = bi.C0788j.b.m2398a(r0, r1, r2)
            bi.C0788j.f4270f = r1
            java.lang.String r1 = "TLS_DHE_DSS_WITH_AES_256_CBC_SHA"
            r2 = 56
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DHE_RSA_WITH_AES_256_CBC_SHA"
            r2 = 57
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DH_anon_WITH_AES_256_CBC_SHA"
            r2 = 58
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_RSA_WITH_NULL_SHA256"
            r2 = 59
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_RSA_WITH_AES_128_CBC_SHA256"
            r2 = 60
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_RSA_WITH_AES_256_CBC_SHA256"
            r2 = 61
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256"
            r2 = 64
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA"
            r2 = 65
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA"
            r2 = 68
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA"
            r2 = 69
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256"
            r2 = 103(0x67, float:1.44E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256"
            r2 = 106(0x6a, float:1.49E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256"
            r2 = 107(0x6b, float:1.5E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DH_anon_WITH_AES_128_CBC_SHA256"
            r2 = 108(0x6c, float:1.51E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DH_anon_WITH_AES_256_CBC_SHA256"
            r2 = 109(0x6d, float:1.53E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA"
            r2 = 132(0x84, float:1.85E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA"
            r2 = 135(0x87, float:1.89E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA"
            r2 = 136(0x88, float:1.9E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_PSK_WITH_RC4_128_SHA"
            r2 = 138(0x8a, float:1.93E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_PSK_WITH_3DES_EDE_CBC_SHA"
            r2 = 139(0x8b, float:1.95E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_PSK_WITH_AES_128_CBC_SHA"
            r2 = 140(0x8c, float:1.96E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_PSK_WITH_AES_256_CBC_SHA"
            r2 = 141(0x8d, float:1.98E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_RSA_WITH_SEED_CBC_SHA"
            r2 = 150(0x96, float:2.1E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_RSA_WITH_AES_128_GCM_SHA256"
            r2 = 156(0x9c, float:2.19E-43)
            bi.j r1 = bi.C0788j.b.m2398a(r0, r1, r2)
            bi.C0788j.f4271g = r1
            java.lang.String r1 = "TLS_RSA_WITH_AES_256_GCM_SHA384"
            r2 = 157(0x9d, float:2.2E-43)
            bi.j r1 = bi.C0788j.b.m2398a(r0, r1, r2)
            bi.C0788j.f4272h = r1
            java.lang.String r1 = "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256"
            r2 = 158(0x9e, float:2.21E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"
            r2 = 159(0x9f, float:2.23E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256"
            r2 = 162(0xa2, float:2.27E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"
            r2 = 163(0xa3, float:2.28E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DH_anon_WITH_AES_128_GCM_SHA256"
            r2 = 166(0xa6, float:2.33E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_DH_anon_WITH_AES_256_GCM_SHA384"
            r2 = 167(0xa7, float:2.34E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"
            r2 = 255(0xff, float:3.57E-43)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_FALLBACK_SCSV"
            r2 = 22016(0x5600, float:3.0851E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_ECDSA_WITH_NULL_SHA"
            r2 = 49153(0xc001, float:6.8878E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_ECDSA_WITH_RC4_128_SHA"
            r2 = 49154(0xc002, float:6.888E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA"
            r2 = 49155(0xc003, float:6.8881E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA"
            r2 = 49156(0xc004, float:6.8882E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA"
            r2 = 49157(0xc005, float:6.8884E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_ECDSA_WITH_NULL_SHA"
            r2 = 49158(0xc006, float:6.8885E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA"
            r2 = 49159(0xc007, float:6.8886E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA"
            r2 = 49160(0xc008, float:6.8888E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA"
            r2 = 49161(0xc009, float:6.8889E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA"
            r2 = 49162(0xc00a, float:6.889E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_RSA_WITH_NULL_SHA"
            r2 = 49163(0xc00b, float:6.8892E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_RSA_WITH_RC4_128_SHA"
            r2 = 49164(0xc00c, float:6.8893E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA"
            r2 = 49165(0xc00d, float:6.8895E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA"
            r2 = 49166(0xc00e, float:6.8896E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA"
            r2 = 49167(0xc00f, float:6.8898E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_RSA_WITH_NULL_SHA"
            r2 = 49168(0xc010, float:6.8899E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_RSA_WITH_RC4_128_SHA"
            r2 = 49169(0xc011, float:6.89E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA"
            r2 = 49170(0xc012, float:6.8902E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"
            r2 = 49171(0xc013, float:6.8903E-41)
            bi.j r1 = bi.C0788j.b.m2398a(r0, r1, r2)
            bi.C0788j.f4273i = r1
            java.lang.String r1 = "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"
            r2 = 49172(0xc014, float:6.8905E-41)
            bi.j r1 = bi.C0788j.b.m2398a(r0, r1, r2)
            bi.C0788j.f4274j = r1
            java.lang.String r1 = "TLS_ECDH_anon_WITH_NULL_SHA"
            r2 = 49173(0xc015, float:6.8906E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_anon_WITH_RC4_128_SHA"
            r2 = 49174(0xc016, float:6.8907E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA"
            r2 = 49175(0xc017, float:6.8909E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_anon_WITH_AES_128_CBC_SHA"
            r2 = 49176(0xc018, float:6.891E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_anon_WITH_AES_256_CBC_SHA"
            r2 = 49177(0xc019, float:6.8912E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256"
            r2 = 49187(0xc023, float:6.8926E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384"
            r2 = 49188(0xc024, float:6.8927E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256"
            r2 = 49189(0xc025, float:6.8928E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384"
            r2 = 49190(0xc026, float:6.893E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256"
            r2 = 49191(0xc027, float:6.8931E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"
            r2 = 49192(0xc028, float:6.8933E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256"
            r2 = 49193(0xc029, float:6.8934E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384"
            r2 = 49194(0xc02a, float:6.8935E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256"
            r2 = 49195(0xc02b, float:6.8937E-41)
            bi.j r1 = bi.C0788j.b.m2398a(r0, r1, r2)
            bi.C0788j.f4275k = r1
            java.lang.String r1 = "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384"
            r2 = 49196(0xc02c, float:6.8938E-41)
            bi.j r1 = bi.C0788j.b.m2398a(r0, r1, r2)
            bi.C0788j.f4276l = r1
            java.lang.String r1 = "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256"
            r2 = 49197(0xc02d, float:6.894E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384"
            r2 = 49198(0xc02e, float:6.8941E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"
            r2 = 49199(0xc02f, float:6.8942E-41)
            bi.j r1 = bi.C0788j.b.m2398a(r0, r1, r2)
            bi.C0788j.f4277m = r1
            java.lang.String r1 = "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"
            r2 = 49200(0xc030, float:6.8944E-41)
            bi.j r1 = bi.C0788j.b.m2398a(r0, r1, r2)
            bi.C0788j.f4278n = r1
            java.lang.String r1 = "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256"
            r2 = 49201(0xc031, float:6.8945E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384"
            r2 = 49202(0xc032, float:6.8947E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA"
            r2 = 49205(0xc035, float:6.8951E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA"
            r2 = 49206(0xc036, float:6.8952E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256"
            r2 = 52392(0xcca8, float:7.3417E-41)
            bi.j r1 = bi.C0788j.b.m2398a(r0, r1, r2)
            bi.C0788j.f4279o = r1
            java.lang.String r1 = "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256"
            r2 = 52393(0xcca9, float:7.3418E-41)
            bi.j r1 = bi.C0788j.b.m2398a(r0, r1, r2)
            bi.C0788j.f4280p = r1
            java.lang.String r1 = "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256"
            r2 = 52394(0xccaa, float:7.342E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256"
            r2 = 52396(0xccac, float:7.3422E-41)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_AES_128_GCM_SHA256"
            r2 = 4865(0x1301, float:6.817E-42)
            bi.j r1 = bi.C0788j.b.m2398a(r0, r1, r2)
            bi.C0788j.f4281q = r1
            java.lang.String r1 = "TLS_AES_256_GCM_SHA384"
            r2 = 4866(0x1302, float:6.819E-42)
            bi.j r1 = bi.C0788j.b.m2398a(r0, r1, r2)
            bi.C0788j.f4282r = r1
            java.lang.String r1 = "TLS_CHACHA20_POLY1305_SHA256"
            r2 = 4867(0x1303, float:6.82E-42)
            bi.j r1 = bi.C0788j.b.m2398a(r0, r1, r2)
            bi.C0788j.f4283s = r1
            java.lang.String r1 = "TLS_AES_128_CCM_SHA256"
            r2 = 4868(0x1304, float:6.822E-42)
            bi.C0788j.b.m2398a(r0, r1, r2)
            java.lang.String r1 = "TLS_AES_128_CCM_8_SHA256"
            r2 = 4869(0x1305, float:6.823E-42)
            bi.C0788j.b.m2398a(r0, r1, r2)
            return
    }

    public C0788j(java.lang.String r1, p239nh.C4826f r2) {
            r0 = this;
            r0.<init>()
            r0.f4285a = r1
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f4285a
            return r0
    }
}
