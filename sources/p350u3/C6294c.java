package p350u3;

/* renamed from: u3.c */
/* loaded from: classes.dex */
public final class C6294c implements p405x3.InterfaceC6926h {

    /* renamed from: a */
    public final qa.InterfaceC5604a f24546a;

    /* renamed from: b */
    public final android.net.ConnectivityManager f24547b;

    /* renamed from: c */
    public final android.content.Context f24548c;

    /* renamed from: d */
    public final java.net.URL f24549d;

    /* renamed from: e */
    public final p050d4.InterfaceC1277a f24550e;

    /* renamed from: f */
    public final p050d4.InterfaceC1277a f24551f;

    /* renamed from: g */
    public final int f24552g;

    /* renamed from: u3.c$a */
    public static final class a {

        /* renamed from: a */
        public final java.net.URL f24553a;

        /* renamed from: b */
        public final p369v3.AbstractC6511o f24554b;

        /* renamed from: c */
        public final java.lang.String f24555c;

        public a(java.net.URL r1, p369v3.AbstractC6511o r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.f24553a = r1
                r0.f24554b = r2
                r0.f24555c = r3
                return
        }
    }

    /* renamed from: u3.c$b */
    public static final class b {

        /* renamed from: a */
        public final int f24556a;

        /* renamed from: b */
        public final java.net.URL f24557b;

        /* renamed from: c */
        public final long f24558c;

        public b(int r1, java.net.URL r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.f24556a = r1
                r0.f24557b = r2
                r0.f24558c = r3
                return
        }
    }

    public C6294c(android.content.Context r4, p050d4.InterfaceC1277a r5, p050d4.InterfaceC1277a r6) {
            r3 = this;
            r3.<init>()
            sa.e r0 = new sa.e
            r0.<init>()
            java.lang.Class<v3.o> r1 = p369v3.AbstractC6511o.class
            v3.c r2 = p369v3.C6499c.f25192a
            r0.m12486a(r1, r2)
            java.lang.Class<v3.i> r1 = p369v3.C6505i.class
            r0.m12486a(r1, r2)
            java.lang.Class<v3.r> r1 = p369v3.AbstractC6514r.class
            v3.f r2 = p369v3.C6502f.f25205a
            r0.m12486a(r1, r2)
            java.lang.Class<v3.l> r1 = p369v3.C6508l.class
            r0.m12486a(r1, r2)
            java.lang.Class<v3.p> r1 = p369v3.AbstractC6512p.class
            v3.d r2 = p369v3.C6500d.f25194a
            r0.m12486a(r1, r2)
            java.lang.Class<v3.j> r1 = p369v3.C6506j.class
            r0.m12486a(r1, r2)
            java.lang.Class<v3.a> r1 = p369v3.AbstractC6497a.class
            v3.b r2 = p369v3.C6498b.f25179a
            r0.m12486a(r1, r2)
            java.lang.Class<v3.h> r1 = p369v3.C6504h.class
            r0.m12486a(r1, r2)
            java.lang.Class<v3.q> r1 = p369v3.AbstractC6513q.class
            v3.e r2 = p369v3.C6501e.f25197a
            r0.m12486a(r1, r2)
            java.lang.Class<v3.k> r1 = p369v3.C6507k.class
            r0.m12486a(r1, r2)
            java.lang.Class<v3.t> r1 = p369v3.AbstractC6516t.class
            v3.g r2 = p369v3.C6503g.f25213a
            r0.m12486a(r1, r2)
            java.lang.Class<v3.n> r1 = p369v3.C6510n.class
            r0.m12486a(r1, r2)
            r1 = 1
            r0.f23143d = r1
            sa.d r1 = new sa.d
            r1.<init>(r0)
            r3.f24546a = r1
            r3.f24548c = r4
            java.lang.String r0 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4
            r3.f24547b = r4
            java.lang.String r4 = p350u3.C6292a.f24538c
            java.net.URL r4 = m12927c(r4)
            r3.f24549d = r4
            r3.f24550e = r6
            r3.f24551f = r5
            r4 = 40000(0x9c40, float:5.6052E-41)
            r3.f24552g = r4
            return
    }

    /* renamed from: c */
    public static java.net.URL m12927c(java.lang.String r3) {
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L6
            r0.<init>(r3)     // Catch: java.net.MalformedURLException -> L6
            return r0
        L6:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid url: "
            java.lang.String r3 = p064e.C1493g.m4049a(r2, r3)
            r1.<init>(r3, r0)
            throw r1
    }

    @Override // p405x3.InterfaceC6926h
    /* renamed from: a */
    public p385w3.AbstractC6784f mo12928a(p385w3.AbstractC6784f r6) {
            r5 = this;
            android.net.ConnectivityManager r0 = r5.f24547b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            w3.f$a r6 = r6.m13806i()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.util.Map r2 = r6.mo13793c()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "sdk-version"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Map r2 = r6.mo13793c()
            java.lang.String r3 = "model"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.HARDWARE
            java.util.Map r2 = r6.mo13793c()
            java.lang.String r3 = "hardware"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.DEVICE
            java.util.Map r2 = r6.mo13793c()
            java.lang.String r3 = "device"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.PRODUCT
            java.util.Map r2 = r6.mo13793c()
            java.lang.String r3 = "product"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.ID
            java.util.Map r2 = r6.mo13793c()
            java.lang.String r3 = "os-uild"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.util.Map r2 = r6.mo13793c()
            java.lang.String r3 = "manufacturer"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.FINGERPRINT
            java.util.Map r2 = r6.mo13793c()
            java.lang.String r3 = "fingerprint"
            r2.put(r3, r1)
            java.util.Calendar.getInstance()
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r2 = r2.getTimeInMillis()
            int r1 = r1.getOffset(r2)
            int r1 = r1 / 1000
            long r1 = (long) r1
            java.util.Map r3 = r6.mo13793c()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "tz-offset"
            r3.put(r2, r1)
            r1 = -1
            if (r0 != 0) goto L90
            v3.t$b r2 = p369v3.AbstractC6516t.b.f25262Z
            r2 = -1
            goto L94
        L90:
            int r2 = r0.getType()
        L94:
            java.util.Map r3 = r6.mo13793c()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "net-type"
            r3.put(r4, r2)
            r2 = 0
            if (r0 != 0) goto La7
            v3.t$a r0 = p369v3.AbstractC6516t.a.f25257Z
            goto Lbd
        La7:
            int r0 = r0.getSubtype()
            if (r0 != r1) goto Lb2
            v3.t$a r0 = p369v3.AbstractC6516t.a.f25258a0
            r0 = 100
            goto Lbe
        Lb2:
            android.util.SparseArray<v3.t$a> r3 = p369v3.AbstractC6516t.a.f25259b0
            java.lang.Object r3 = r3.get(r0)
            v3.t$a r3 = (p369v3.AbstractC6516t.a) r3
            if (r3 == 0) goto Lbd
            goto Lbe
        Lbd:
            r0 = 0
        Lbe:
            java.util.Map r3 = r6.mo13793c()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "mobile-subtype"
            r3.put(r4, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.util.Map r3 = r6.mo13793c()
            java.lang.String r4 = "country"
            r3.put(r4, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.util.Map r3 = r6.mo13793c()
            java.lang.String r4 = "locale"
            r3.put(r4, r0)
            android.content.Context r0 = r5.f24548c
            java.lang.String r3 = "phone"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r0 = r0.getSimOperator()
            java.util.Map r3 = r6.mo13793c()
            java.lang.String r4 = "mcc_mnc"
            r3.put(r4, r0)
            android.content.Context r0 = r5.f24548c
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L115
            java.lang.String r0 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L115
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L115
            int r1 = r0.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L115
            goto L11d
        L115:
            r0 = move-exception
            java.lang.String r2 = "CctTransportBackend"
            java.lang.String r3 = "Unable to find version code for package"
            p064e.C1494h.m4054e(r2, r3, r0)
        L11d:
            java.lang.String r0 = java.lang.Integer.toString(r1)
            java.util.Map r1 = r6.mo13793c()
            java.lang.String r2 = "application_build"
            r1.put(r2, r0)
            w3.f r6 = r6.mo13792b()
            return r6
    }

    @Override // p405x3.InterfaceC6926h
    /* renamed from: b */
    public com.google.android.datatransport.runtime.backends.AbstractC1039c mo12929b(com.google.android.datatransport.runtime.backends.AbstractC1038b r35) {
            r34 = this;
            r1 = r34
            com.google.android.datatransport.runtime.backends.c$a r2 = com.google.android.datatransport.runtime.backends.AbstractC1039c.a.f5232Z
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3 = r35
            x3.a r3 = (p405x3.C6919a) r3
            java.lang.Iterable<w3.f> r4 = r3.f26942a
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3f
            java.lang.Object r5 = r4.next()
            w3.f r5 = (p385w3.AbstractC6784f) r5
            java.lang.String r6 = r5.mo13790g()
            boolean r7 = r0.containsKey(r6)
            if (r7 != 0) goto L35
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.add(r5)
            r0.put(r6, r7)
            goto L13
        L35:
            java.lang.Object r6 = r0.get(r6)
            java.util.List r6 = (java.util.List) r6
            r6.add(r5)
            goto L13
        L3f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L4c:
            boolean r5 = r0.hasNext()
            java.lang.String r6 = "CctTransportBackend"
            r7 = 0
            if (r5 == 0) goto L277
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r8 = r5.getValue()
            java.util.List r8 = (java.util.List) r8
            r9 = 0
            java.lang.Object r8 = r8.get(r9)
            w3.f r8 = (p385w3.AbstractC6784f) r8
            v3.u r18 = p369v3.EnumC6517u.f25266Y
            d4.a r9 = r1.f24551f
            long r9 = r9.mo3736a()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            d4.a r10 = r1.f24550e
            long r10 = r10.mo3736a()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            v3.p$a r11 = p369v3.AbstractC6512p.a.f25255Y
            java.lang.String r12 = "sdk-version"
            int r12 = r8.m13805f(r12)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r12)
            java.lang.String r12 = "model"
            java.lang.String r21 = r8.m13804a(r12)
            java.lang.String r12 = "hardware"
            java.lang.String r22 = r8.m13804a(r12)
            java.lang.String r12 = "device"
            java.lang.String r23 = r8.m13804a(r12)
            java.lang.String r12 = "product"
            java.lang.String r24 = r8.m13804a(r12)
            java.lang.String r12 = "os-uild"
            java.lang.String r25 = r8.m13804a(r12)
            java.lang.String r12 = "manufacturer"
            java.lang.String r26 = r8.m13804a(r12)
            java.lang.String r12 = "fingerprint"
            java.lang.String r27 = r8.m13804a(r12)
            java.lang.String r12 = "country"
            java.lang.String r29 = r8.m13804a(r12)
            java.lang.String r12 = "locale"
            java.lang.String r28 = r8.m13804a(r12)
            java.lang.String r12 = "mcc_mnc"
            java.lang.String r30 = r8.m13804a(r12)
            java.lang.String r12 = "application_build"
            java.lang.String r31 = r8.m13804a(r12)
            v3.h r8 = new v3.h
            r32 = 0
            r19 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            v3.j r14 = new v3.j
            r14.<init>(r11, r8, r7)
            java.lang.Object r8 = r5.getKey()     // Catch: java.lang.NumberFormatException -> Lec
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.NumberFormatException -> Lec
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> Lec
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.NumberFormatException -> Lec
            r16 = r7
            r15 = r8
            goto Lf5
        Lec:
            java.lang.Object r8 = r5.getKey()
            java.lang.String r8 = (java.lang.String) r8
            r15 = r7
            r16 = r8
        Lf5:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L104:
            boolean r8 = r5.hasNext()
            java.lang.String r11 = "Missing required properties:"
            java.lang.String r12 = ""
            if (r8 == 0) goto L236
            java.lang.Object r8 = r5.next()
            w3.f r8 = (p385w3.AbstractC6784f) r8
            w3.e r13 = r8.mo13788d()
            r20 = r0
            t3.b r0 = r13.f26329a
            r17 = r5
            t3.b r5 = new t3.b
            r19 = r12
            java.lang.String r12 = "proto"
            r5.<init>(r12)
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L137
            byte[] r0 = r13.f26330b
            v3.k$b r5 = new v3.k$b
            r5.<init>()
            r5.f25241d = r0
            goto L158
        L137:
            t3.b r5 = new t3.b
            java.lang.String r12 = "json"
            r5.<init>(r12)
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L219
            java.lang.String r0 = new java.lang.String
            byte[] r5 = r13.f26330b
            java.lang.String r12 = "UTF-8"
            java.nio.charset.Charset r12 = java.nio.charset.Charset.forName(r12)
            r0.<init>(r5, r12)
            v3.k$b r5 = new v3.k$b
            r5.<init>()
            r5.f25242e = r0
        L158:
            long r12 = r8.mo13789e()
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r5.f25238a = r0
            long r12 = r8.mo13791h()
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r5.f25240c = r0
            java.util.Map r0 = r8.mo13786b()
            java.lang.String r12 = "tz-offset"
            java.lang.Object r0 = r0.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L17d
            r12 = 0
            goto L185
        L17d:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r12 = r0.longValue()
        L185:
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r5.f25243f = r0
            java.lang.String r0 = "net-type"
            int r0 = r8.m13805f(r0)
            android.util.SparseArray<v3.t$b> r12 = p369v3.AbstractC6516t.b.f25263a0
            java.lang.Object r0 = r12.get(r0)
            v3.t$b r0 = (p369v3.AbstractC6516t.b) r0
            java.lang.String r12 = "mobile-subtype"
            int r12 = r8.m13805f(r12)
            android.util.SparseArray<v3.t$a> r13 = p369v3.AbstractC6516t.a.f25259b0
            java.lang.Object r12 = r13.get(r12)
            v3.t$a r12 = (p369v3.AbstractC6516t.a) r12
            v3.n r13 = new v3.n
            r21 = r2
            r2 = 0
            r13.<init>(r0, r12, r2)
            r5.f25244g = r13
            java.lang.Integer r0 = r8.mo13787c()
            if (r0 == 0) goto L1bd
            java.lang.Integer r0 = r8.mo13787c()
            r5.f25239b = r0
        L1bd:
            java.lang.Long r0 = r5.f25238a
            if (r0 != 0) goto L1c4
            java.lang.String r12 = " eventTimeMs"
            goto L1c6
        L1c4:
            r12 = r19
        L1c6:
            java.lang.Long r0 = r5.f25240c
            if (r0 != 0) goto L1d0
            java.lang.String r0 = " eventUptimeMs"
            java.lang.String r12 = p064e.C1493g.m4049a(r12, r0)
        L1d0:
            java.lang.Long r0 = r5.f25243f
            if (r0 != 0) goto L1da
            java.lang.String r0 = " timezoneOffsetSeconds"
            java.lang.String r12 = p064e.C1493g.m4049a(r12, r0)
        L1da:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L20f
            v3.k r0 = new v3.k
            java.lang.Long r2 = r5.f25238a
            long r23 = r2.longValue()
            java.lang.Integer r2 = r5.f25239b
            java.lang.Long r8 = r5.f25240c
            long r26 = r8.longValue()
            byte[] r8 = r5.f25241d
            java.lang.String r11 = r5.f25242e
            java.lang.Long r12 = r5.f25243f
            long r30 = r12.longValue()
            v3.t r5 = r5.f25244g
            r33 = 0
            r22 = r0
            r25 = r2
            r28 = r8
            r29 = r11
            r32 = r5
            r22.<init>(r23, r25, r26, r28, r29, r30, r32, r33)
            r7.add(r0)
            goto L22e
        L20f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = p064e.C1493g.m4049a(r11, r12)
            r0.<init>(r2)
            throw r0
        L219:
            r21 = r2
            java.lang.String r2 = p064e.C1494h.m4058i(r6)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r8 = 0
            r5[r8] = r0
            java.lang.String r0 = "Received event of unsupported encoding %s. Skipping..."
            java.lang.String r0 = java.lang.String.format(r0, r5)
            android.util.Log.w(r2, r0)
        L22e:
            r5 = r17
            r0 = r20
            r2 = r21
            goto L104
        L236:
            r20 = r0
            r21 = r2
            r19 = r12
            if (r9 != 0) goto L241
            java.lang.String r12 = " requestTimeMs"
            goto L243
        L241:
            r12 = r19
        L243:
            if (r10 != 0) goto L24b
            java.lang.String r0 = " requestUptimeMs"
            java.lang.String r12 = p064e.C1493g.m4049a(r12, r0)
        L24b:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L26d
            v3.l r0 = new v3.l
            long r5 = r9.longValue()
            long r12 = r10.longValue()
            r19 = 0
            r9 = r0
            r10 = r5
            r17 = r7
            r9.<init>(r10, r12, r14, r15, r16, r17, r18, r19)
            r4.add(r0)
            r0 = r20
            r2 = r21
            goto L4c
        L26d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = p064e.C1493g.m4049a(r11, r12)
            r0.<init>(r2)
            throw r0
        L277:
            r21 = r2
            v3.i r0 = new v3.i
            r0.<init>(r4)
            java.net.URL r2 = r1.f24549d
            byte[] r3 = r3.f26943b
            if (r3 == 0) goto L2a2
            r3 = r35
            x3.a r3 = (p405x3.C6919a) r3     // Catch: java.lang.IllegalArgumentException -> L29d
            byte[] r3 = r3.f26943b     // Catch: java.lang.IllegalArgumentException -> L29d
            u3.a r3 = p350u3.C6292a.m12924a(r3)     // Catch: java.lang.IllegalArgumentException -> L29d
            java.lang.String r4 = r3.f24543b     // Catch: java.lang.IllegalArgumentException -> L29d
            if (r4 == 0) goto L293
            goto L294
        L293:
            r4 = r7
        L294:
            java.lang.String r3 = r3.f24542a     // Catch: java.lang.IllegalArgumentException -> L29d
            if (r3 == 0) goto L2a3
            java.net.URL r2 = m12927c(r3)     // Catch: java.lang.IllegalArgumentException -> L29d
            goto L2a3
        L29d:
            com.google.android.datatransport.runtime.backends.c r0 = com.google.android.datatransport.runtime.backends.AbstractC1039c.m2805a()
            return r0
        L2a2:
            r4 = r7
        L2a3:
            r3 = 5
            r8 = -1
            u3.c$a r5 = new u3.c$a     // Catch: java.io.IOException -> L2ff
            r5.<init>(r2, r0, r4)     // Catch: java.io.IOException -> L2ff
            u3.b r0 = new u3.b     // Catch: java.io.IOException -> L2ff
            r0.<init>(r1)     // Catch: java.io.IOException -> L2ff
        L2b0:
            java.lang.Object r2 = r0.apply(r5)     // Catch: java.io.IOException -> L2ff
            r4 = r2
            u3.c$b r4 = (p350u3.C6294c.b) r4     // Catch: java.io.IOException -> L2ff
            java.net.URL r10 = r4.f24557b     // Catch: java.io.IOException -> L2ff
            if (r10 == 0) goto L2cd
            java.lang.String r11 = "Following redirect to: %s"
            p064e.C1494h.m4052c(r6, r11, r10)     // Catch: java.io.IOException -> L2ff
            java.net.URL r4 = r4.f24557b     // Catch: java.io.IOException -> L2ff
            u3.c$a r10 = new u3.c$a     // Catch: java.io.IOException -> L2ff
            v3.o r11 = r5.f24554b     // Catch: java.io.IOException -> L2ff
            java.lang.String r5 = r5.f24555c     // Catch: java.io.IOException -> L2ff
            r10.<init>(r4, r11, r5)     // Catch: java.io.IOException -> L2ff
            r5 = r10
            goto L2ce
        L2cd:
            r5 = r7
        L2ce:
            if (r5 == 0) goto L2d5
            int r3 = r3 + (-1)
            r4 = 1
            if (r3 >= r4) goto L2b0
        L2d5:
            u3.c$b r2 = (p350u3.C6294c.b) r2     // Catch: java.io.IOException -> L2ff
            int r0 = r2.f24556a     // Catch: java.io.IOException -> L2ff
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 != r3) goto L2e7
            long r2 = r2.f24558c     // Catch: java.io.IOException -> L2ff
            com.google.android.datatransport.runtime.backends.a r0 = new com.google.android.datatransport.runtime.backends.a     // Catch: java.io.IOException -> L2ff
            com.google.android.datatransport.runtime.backends.c$a r4 = com.google.android.datatransport.runtime.backends.AbstractC1039c.a.f5231Y     // Catch: java.io.IOException -> L2ff
            r0.<init>(r4, r2)     // Catch: java.io.IOException -> L2ff
            return r0
        L2e7:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r2) goto L2f5
            r2 = 404(0x194, float:5.66E-43)
            if (r0 != r2) goto L2f0
            goto L2f5
        L2f0:
            com.google.android.datatransport.runtime.backends.c r0 = com.google.android.datatransport.runtime.backends.AbstractC1039c.m2805a()     // Catch: java.io.IOException -> L2ff
            return r0
        L2f5:
            com.google.android.datatransport.runtime.backends.a r0 = new com.google.android.datatransport.runtime.backends.a     // Catch: java.io.IOException -> L2ff
            r2 = r21
            r0.<init>(r2, r8)     // Catch: java.io.IOException -> L2fd
            return r0
        L2fd:
            r0 = move-exception
            goto L302
        L2ff:
            r0 = move-exception
            r2 = r21
        L302:
            java.lang.String r3 = "Could not make request to the backend"
            p064e.C1494h.m4054e(r6, r3, r0)
            com.google.android.datatransport.runtime.backends.a r0 = new com.google.android.datatransport.runtime.backends.a
            r0.<init>(r2, r8)
            return r0
    }
}
