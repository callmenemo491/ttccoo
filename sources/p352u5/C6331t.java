package p352u5;

/* renamed from: u5.t */
/* loaded from: classes.dex */
public final class C6331t extends p352u5.AbstractC6310d {

    /* renamed from: e */
    public java.io.RandomAccessFile f24781e;

    /* renamed from: f */
    public android.net.Uri f24782f;

    /* renamed from: g */
    public long f24783g;

    /* renamed from: h */
    public boolean f24784h;

    /* renamed from: u5.t$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ boolean m12983a(java.lang.Throwable r0) {
                boolean r0 = m12984b(r0)
                return r0
        }

        /* renamed from: b */
        private static boolean m12984b(java.lang.Throwable r1) {
                boolean r0 = r1 instanceof android.system.ErrnoException
                if (r0 == 0) goto Le
                android.system.ErrnoException r1 = (android.system.ErrnoException) r1
                int r1 = r1.errno
                int r0 = android.system.OsConstants.EACCES
                if (r1 != r0) goto Le
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                return r1
        }
    }

    /* renamed from: u5.t$b */
    public static class b extends p352u5.C6321j {
        public b(java.lang.String r1, java.lang.Throwable r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public b(java.lang.Throwable r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public C6331t() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @Override // p352u5.InterfaceC6314f
    /* renamed from: b */
    public int mo6020b(byte[] r6, int r7, int r8) {
            r5 = this;
            if (r8 != 0) goto L4
            r6 = 0
            return r6
        L4:
            long r0 = r5.f24783g
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r6 = -1
            return r6
        Le:
            java.io.RandomAccessFile r2 = r5.f24781e     // Catch: java.io.IOException -> L28
            int r3 = p371v5.C6552b0.f25624a     // Catch: java.io.IOException -> L28
            long r3 = (long) r8     // Catch: java.io.IOException -> L28
            long r0 = java.lang.Math.min(r0, r3)     // Catch: java.io.IOException -> L28
            int r8 = (int) r0     // Catch: java.io.IOException -> L28
            int r6 = r2.read(r6, r7, r8)     // Catch: java.io.IOException -> L28
            if (r6 <= 0) goto L27
            long r7 = r5.f24783g
            long r0 = (long) r6
            long r7 = r7 - r0
            r5.f24783g = r7
            r5.m12952r(r6)
        L27:
            return r6
        L28:
            r6 = move-exception
            u5.t$b r7 = new u5.t$b
            r8 = 2000(0x7d0, float:2.803E-42)
            r7.<init>(r6, r8)
            throw r7
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: c */
    public long mo6021c(p352u5.C6323l r8) {
            r7 = this;
            android.net.Uri r0 = r8.f24704a
            r7.f24782f = r0
            r7.m12954t(r8)
            r1 = 2006(0x7d6, float:2.811E-42)
            r2 = 1
            r3 = 2000(0x7d0, float:2.803E-42)
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            java.lang.String r5 = r0.getPath()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            java.lang.String r6 = "r"
            r4.<init>(r5, r6)     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            r7.f24781e = r4
            long r0 = r8.f24709f     // Catch: java.io.IOException -> L4b
            r4.seek(r0)     // Catch: java.io.IOException -> L4b
            long r0 = r8.f24710g     // Catch: java.io.IOException -> L4b
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L32
            java.io.RandomAccessFile r0 = r7.f24781e     // Catch: java.io.IOException -> L4b
            long r0 = r0.length()     // Catch: java.io.IOException -> L4b
            long r4 = r8.f24709f     // Catch: java.io.IOException -> L4b
            long r0 = r0 - r4
        L32:
            r7.f24783g = r0     // Catch: java.io.IOException -> L4b
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L42
            r7.f24784h = r2
            r7.m12955u(r8)
            long r0 = r7.f24783g
            return r0
        L42:
            u5.t$b r8 = new u5.t$b
            r0 = 2008(0x7d8, float:2.814E-42)
            r1 = 0
            r8.<init>(r1, r1, r0)
            throw r8
        L4b:
            r8 = move-exception
            u5.t$b r0 = new u5.t$b
            r0.<init>(r8, r3)
            throw r0
        L52:
            r8 = move-exception
            u5.t$b r0 = new u5.t$b
            r0.<init>(r8, r3)
            throw r0
        L59:
            r8 = move-exception
            u5.t$b r0 = new u5.t$b
            r0.<init>(r8, r1)
            throw r0
        L60:
            r8 = move-exception
            java.lang.String r3 = r0.getQuery()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L8e
            java.lang.String r3 = r0.getFragment()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L8e
            u5.t$b r0 = new u5.t$b
            int r2 = p371v5.C6552b0.f25624a
            r3 = 21
            if (r2 < r3) goto L88
            java.lang.Throwable r2 = r8.getCause()
            boolean r2 = p352u5.C6331t.a.m12983a(r2)
            if (r2 == 0) goto L88
            goto L8a
        L88:
            r1 = 2005(0x7d5, float:2.81E-42)
        L8a:
            r0.<init>(r8, r1)
            throw r0
        L8e:
            u5.t$b r1 = new u5.t$b
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.String r5 = r0.getPath()
            r3[r4] = r5
            java.lang.String r4 = r0.getQuery()
            r3[r2] = r4
            r2 = 2
            java.lang.String r0 = r0.getFragment()
            r3[r2] = r0
            java.lang.String r0 = "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r2 = 1004(0x3ec, float:1.407E-42)
            r1.<init>(r0, r8, r2)
            throw r1
    }

    @Override // p352u5.InterfaceC6320i
    public void close() {
            r5 = this;
            r0 = 0
            r5.f24782f = r0
            r1 = 0
            java.io.RandomAccessFile r2 = r5.f24781e     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.f24781e = r0
            boolean r0 = r5.f24784h
            if (r0 == 0) goto L16
            r5.f24784h = r1
            r5.m12953s()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            u5.t$b r3 = new u5.t$b     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.f24781e = r0
            boolean r0 = r5.f24784h
            if (r0 == 0) goto L2d
            r5.f24784h = r1
            r5.m12953s()
        L2d:
            throw r2
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: l */
    public android.net.Uri mo6024l() {
            r1 = this;
            android.net.Uri r0 = r1.f24782f
            return r0
    }
}
