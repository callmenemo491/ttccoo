package p352u5;

/* renamed from: u5.b */
/* loaded from: classes.dex */
public final class C6306b extends p352u5.AbstractC6310d {

    /* renamed from: e */
    public final android.content.res.AssetManager f24623e;

    /* renamed from: f */
    public android.net.Uri f24624f;

    /* renamed from: g */
    public java.io.InputStream f24625g;

    /* renamed from: h */
    public long f24626h;

    /* renamed from: i */
    public boolean f24627i;

    /* renamed from: u5.b$a */
    public static final class a extends p352u5.C6321j {
        public a(java.lang.Throwable r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public C6306b(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            android.content.res.AssetManager r2 = r2.getAssets()
            r1.f24623e = r2
            return
    }

    @Override // p352u5.InterfaceC6314f
    /* renamed from: b */
    public int mo6020b(byte[] r8, int r9, int r10) {
            r7 = this;
            if (r10 != 0) goto L4
            r8 = 0
            return r8
        L4:
            long r0 = r7.f24626h
            r2 = 0
            r4 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto Le
            return r4
        Le:
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L15
            goto L1b
        L15:
            long r5 = (long) r10
            long r0 = java.lang.Math.min(r0, r5)     // Catch: java.io.IOException -> L34
            int r10 = (int) r0     // Catch: java.io.IOException -> L34
        L1b:
            java.io.InputStream r0 = r7.f24625g     // Catch: java.io.IOException -> L34
            int r1 = p371v5.C6552b0.f25624a     // Catch: java.io.IOException -> L34
            int r8 = r0.read(r8, r9, r10)     // Catch: java.io.IOException -> L34
            if (r8 != r4) goto L26
            return r4
        L26:
            long r9 = r7.f24626h
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 == 0) goto L30
            long r0 = (long) r8
            long r9 = r9 - r0
            r7.f24626h = r9
        L30:
            r7.m12952r(r8)
            return r8
        L34:
            r8 = move-exception
            u5.b$a r9 = new u5.b$a
            r10 = 2000(0x7d0, float:2.803E-42)
            r9.<init>(r8, r10)
            throw r9
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: c */
    public long mo6021c(p352u5.C6323l r9) {
            r8 = this;
            android.net.Uri r0 = r9.f24704a     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            r8.f24624f = r0     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            java.lang.String r0 = r0.getPath()     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            java.util.Objects.requireNonNull(r0)     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            java.lang.String r1 = "/android_asset/"
            boolean r1 = r0.startsWith(r1)     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            r2 = 1
            if (r1 == 0) goto L1b
            r1 = 15
            java.lang.String r0 = r0.substring(r1)     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            goto L27
        L1b:
            java.lang.String r1 = "/"
            boolean r1 = r0.startsWith(r1)     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            if (r1 == 0) goto L27
            java.lang.String r0 = r0.substring(r2)     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
        L27:
            r8.m12954t(r9)     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            android.content.res.AssetManager r1 = r8.f24623e     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            java.io.InputStream r0 = r1.open(r0, r2)     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            r8.f24625g = r0     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            long r3 = r9.f24709f     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            long r0 = r0.skip(r3)     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            long r3 = r9.f24709f     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L63
            long r0 = r9.f24710g     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L49
            r8.f24626h = r0     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            goto L5b
        L49:
            java.io.InputStream r0 = r8.f24625g     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            int r0 = r0.available()     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            long r0 = (long) r0     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            r8.f24626h = r0     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 != 0) goto L5b
            r8.f24626h = r3     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
        L5b:
            r8.f24627i = r2
            r8.m12955u(r9)
            long r0 = r8.f24626h
            return r0
        L63:
            u5.b$a r9 = new u5.b$a     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            r0 = 0
            r1 = 2008(0x7d8, float:2.814E-42)
            r9.<init>(r0, r1)     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
            throw r9     // Catch: java.io.IOException -> L6c p352u5.C6306b.a -> L7c
        L6c:
            r9 = move-exception
            u5.b$a r0 = new u5.b$a
            boolean r1 = r9 instanceof java.io.FileNotFoundException
            if (r1 == 0) goto L76
            r1 = 2005(0x7d5, float:2.81E-42)
            goto L78
        L76:
            r1 = 2000(0x7d0, float:2.803E-42)
        L78:
            r0.<init>(r9, r1)
            throw r0
        L7c:
            r9 = move-exception
            throw r9
    }

    @Override // p352u5.InterfaceC6320i
    public void close() {
            r5 = this;
            r0 = 0
            r5.f24624f = r0
            r1 = 0
            java.io.InputStream r2 = r5.f24625g     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.f24625g = r0
            boolean r0 = r5.f24627i
            if (r0 == 0) goto L16
            r5.f24627i = r1
            r5.m12953s()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            u5.b$a r3 = new u5.b$a     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.f24625g = r0
            boolean r0 = r5.f24627i
            if (r0 == 0) goto L2d
            r5.f24627i = r1
            r5.m12953s()
        L2d:
            throw r2
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: l */
    public android.net.Uri mo6024l() {
            r1 = this;
            android.net.Uri r0 = r1.f24624f
            return r0
    }
}
