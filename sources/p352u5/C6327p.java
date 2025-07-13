package p352u5;

/* renamed from: u5.p */
/* loaded from: classes.dex */
public final class C6327p implements p352u5.InterfaceC6320i {

    /* renamed from: a */
    public final android.content.Context f24747a;

    /* renamed from: b */
    public final java.util.List<p352u5.InterfaceC6317g0> f24748b;

    /* renamed from: c */
    public final p352u5.InterfaceC6320i f24749c;

    /* renamed from: d */
    public p352u5.InterfaceC6320i f24750d;

    /* renamed from: e */
    public p352u5.InterfaceC6320i f24751e;

    /* renamed from: f */
    public p352u5.InterfaceC6320i f24752f;

    /* renamed from: g */
    public p352u5.InterfaceC6320i f24753g;

    /* renamed from: h */
    public p352u5.InterfaceC6320i f24754h;

    /* renamed from: i */
    public p352u5.InterfaceC6320i f24755i;

    /* renamed from: j */
    public p352u5.InterfaceC6320i f24756j;

    /* renamed from: k */
    public p352u5.InterfaceC6320i f24757k;

    /* renamed from: u5.p$a */
    public static final class a implements p352u5.InterfaceC6320i.a {

        /* renamed from: a */
        public final android.content.Context f24758a;

        /* renamed from: b */
        public final p352u5.InterfaceC6320i.a f24759b;

        public a(android.content.Context r1, p352u5.InterfaceC6320i.a r2) {
                r0 = this;
                r0.<init>()
                android.content.Context r1 = r1.getApplicationContext()
                r0.f24758a = r1
                r0.f24759b = r2
                return
        }

        @Override // p352u5.InterfaceC6320i.a
        /* renamed from: a */
        public p352u5.InterfaceC6320i mo12964a() {
                r3 = this;
                u5.p r0 = new u5.p
                android.content.Context r1 = r3.f24758a
                u5.i$a r2 = r3.f24759b
                u5.i r2 = r2.mo12964a()
                r0.<init>(r1, r2)
                return r0
        }
    }

    public C6327p(android.content.Context r1, p352u5.InterfaceC6320i r2) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f24747a = r1
            java.util.Objects.requireNonNull(r2)
            r0.f24749c = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f24748b = r1
            return
    }

    @Override // p352u5.InterfaceC6314f
    /* renamed from: b */
    public int mo6020b(byte[] r2, int r3, int r4) {
            r1 = this;
            u5.i r0 = r1.f24757k
            java.util.Objects.requireNonNull(r0)
            int r2 = r0.mo6020b(r2, r3, r4)
            return r2
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: c */
    public long mo6021c(p352u5.C6323l r6) {
            r5 = this;
            u5.i r0 = r5.f24757k
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            p371v5.C6549a.m13291e(r0)
            android.net.Uri r0 = r6.f24704a
            java.lang.String r0 = r0.getScheme()
            android.net.Uri r3 = r6.f24704a
            int r4 = p371v5.C6552b0.f25624a
            java.lang.String r3 = r3.getScheme()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L2a
            java.lang.String r4 = "file"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L29
            goto L2a
        L29:
            r1 = 0
        L2a:
            if (r1 == 0) goto L5a
            android.net.Uri r0 = r6.f24704a
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L48
            java.lang.String r1 = "/android_asset/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L48
            u5.i r0 = r5.f24751e
            if (r0 != 0) goto L72
            u5.b r0 = new u5.b
            android.content.Context r1 = r5.f24747a
            r0.<init>(r1)
            goto L6d
        L48:
            u5.i r0 = r5.f24750d
            if (r0 != 0) goto L56
            u5.t r0 = new u5.t
            r0.<init>()
            r5.f24750d = r0
            r5.m12974r(r0)
        L56:
            u5.i r0 = r5.f24750d
            goto L12b
        L5a:
            java.lang.String r1 = "asset"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L76
            u5.i r0 = r5.f24751e
            if (r0 != 0) goto L72
            u5.b r0 = new u5.b
            android.content.Context r1 = r5.f24747a
            r0.<init>(r1)
        L6d:
            r5.f24751e = r0
            r5.m12974r(r0)
        L72:
            u5.i r0 = r5.f24751e
            goto L12b
        L76:
            java.lang.String r1 = "content"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L92
            u5.i r0 = r5.f24752f
            if (r0 != 0) goto L8e
            u5.e r0 = new u5.e
            android.content.Context r1 = r5.f24747a
            r0.<init>(r1)
            r5.f24752f = r0
            r5.m12974r(r0)
        L8e:
            u5.i r0 = r5.f24752f
            goto L12b
        L92:
            java.lang.String r1 = "rtmp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Ld3
            u5.i r0 = r5.f24753g
            if (r0 != 0) goto Ld0
            java.lang.String r0 = "com.google.android.exoplayer2.ext.rtmp.RtmpDataSource"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> Lb8 java.lang.ClassNotFoundException -> Lc1
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lb8 java.lang.ClassNotFoundException -> Lc1
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.Exception -> Lb8 java.lang.ClassNotFoundException -> Lc1
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lb8 java.lang.ClassNotFoundException -> Lc1
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> Lb8 java.lang.ClassNotFoundException -> Lc1
            u5.i r0 = (p352u5.InterfaceC6320i) r0     // Catch: java.lang.Exception -> Lb8 java.lang.ClassNotFoundException -> Lc1
            r5.f24753g = r0     // Catch: java.lang.Exception -> Lb8 java.lang.ClassNotFoundException -> Lc1
            r5.m12974r(r0)     // Catch: java.lang.Exception -> Lb8 java.lang.ClassNotFoundException -> Lc1
            goto Lc8
        Lb8:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Error instantiating RTMP extension"
            r0.<init>(r1, r6)
            throw r0
        Lc1:
            java.lang.String r0 = "DefaultDataSource"
            java.lang.String r1 = "Attempting to play RTMP stream without depending on the RTMP extension"
            android.util.Log.w(r0, r1)
        Lc8:
            u5.i r0 = r5.f24753g
            if (r0 != 0) goto Ld0
            u5.i r0 = r5.f24749c
            r5.f24753g = r0
        Ld0:
            u5.i r0 = r5.f24753g
            goto L12b
        Ld3:
            java.lang.String r1 = "udp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lec
            u5.i r0 = r5.f24754h
            if (r0 != 0) goto Le9
            u5.h0 r0 = new u5.h0
            r0.<init>()
            r5.f24754h = r0
            r5.m12974r(r0)
        Le9:
            u5.i r0 = r5.f24754h
            goto L12b
        Lec:
            java.lang.String r1 = "data"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L105
            u5.i r0 = r5.f24755i
            if (r0 != 0) goto L102
            u5.g r0 = new u5.g
            r0.<init>()
            r5.f24755i = r0
            r5.m12974r(r0)
        L102:
            u5.i r0 = r5.f24755i
            goto L12b
        L105:
            java.lang.String r1 = "rawresource"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L119
            java.lang.String r1 = "android.resource"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L116
            goto L119
        L116:
            u5.i r0 = r5.f24749c
            goto L12b
        L119:
            u5.i r0 = r5.f24756j
            if (r0 != 0) goto L129
            u5.d0 r0 = new u5.d0
            android.content.Context r1 = r5.f24747a
            r0.<init>(r1)
            r5.f24756j = r0
            r5.m12974r(r0)
        L129:
            u5.i r0 = r5.f24756j
        L12b:
            r5.f24757k = r0
            long r0 = r0.mo6021c(r6)
            return r0
    }

    @Override // p352u5.InterfaceC6320i
    public void close() {
            r2 = this;
            u5.i r0 = r2.f24757k
            if (r0 == 0) goto Lf
            r1 = 0
            r0.close()     // Catch: java.lang.Throwable -> Lb
            r2.f24757k = r1
            goto Lf
        Lb:
            r0 = move-exception
            r2.f24757k = r1
            throw r0
        Lf:
            return
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: g */
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> mo6022g() {
            r1 = this;
            u5.i r0 = r1.f24757k
            if (r0 != 0) goto L9
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto Ld
        L9:
            java.util.Map r0 = r0.mo6022g()
        Ld:
            return r0
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: j */
    public void mo6023j(p352u5.InterfaceC6317g0 r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            u5.i r0 = r1.f24749c
            r0.mo6023j(r2)
            java.util.List<u5.g0> r0 = r1.f24748b
            r0.add(r2)
            u5.i r0 = r1.f24750d
            if (r0 == 0) goto L14
            r0.mo6023j(r2)
        L14:
            u5.i r0 = r1.f24751e
            if (r0 == 0) goto L1b
            r0.mo6023j(r2)
        L1b:
            u5.i r0 = r1.f24752f
            if (r0 == 0) goto L22
            r0.mo6023j(r2)
        L22:
            u5.i r0 = r1.f24753g
            if (r0 == 0) goto L29
            r0.mo6023j(r2)
        L29:
            u5.i r0 = r1.f24754h
            if (r0 == 0) goto L30
            r0.mo6023j(r2)
        L30:
            u5.i r0 = r1.f24755i
            if (r0 == 0) goto L37
            r0.mo6023j(r2)
        L37:
            u5.i r0 = r1.f24756j
            if (r0 == 0) goto L3e
            r0.mo6023j(r2)
        L3e:
            return
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: l */
    public android.net.Uri mo6024l() {
            r1 = this;
            u5.i r0 = r1.f24757k
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            android.net.Uri r0 = r0.mo6024l()
        La:
            return r0
    }

    /* renamed from: r */
    public final void m12974r(p352u5.InterfaceC6320i r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.List<u5.g0> r1 = r2.f24748b
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.List<u5.g0> r1 = r2.f24748b
            java.lang.Object r1 = r1.get(r0)
            u5.g0 r1 = (p352u5.InterfaceC6317g0) r1
            r3.mo6023j(r1)
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }
}
