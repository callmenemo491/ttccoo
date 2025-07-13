package p352u5;

/* renamed from: u5.q */
/* loaded from: classes.dex */
public class C6328q extends p352u5.AbstractC6310d {

    /* renamed from: e */
    public final boolean f24760e;

    /* renamed from: f */
    public final int f24761f;

    /* renamed from: g */
    public final int f24762g;

    /* renamed from: h */
    public final java.lang.String f24763h;

    /* renamed from: i */
    public final p352u5.C6337z f24764i;

    /* renamed from: j */
    public final p352u5.C6337z f24765j;

    /* renamed from: k */
    public final boolean f24766k;

    /* renamed from: l */
    public p010a9.InterfaceC0039g<java.lang.String> f24767l;

    /* renamed from: m */
    public p352u5.C6323l f24768m;

    /* renamed from: n */
    public java.net.HttpURLConnection f24769n;

    /* renamed from: o */
    public java.io.InputStream f24770o;

    /* renamed from: p */
    public boolean f24771p;

    /* renamed from: q */
    public int f24772q;

    /* renamed from: r */
    public long f24773r;

    /* renamed from: s */
    public long f24774s;

    /* renamed from: u5.q$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: u5.q$b */
    public static final class b implements p352u5.InterfaceC6333v {

        /* renamed from: a */
        public final p352u5.C6337z f24775a;

        /* renamed from: b */
        public java.lang.String f24776b;

        /* renamed from: c */
        public int f24777c;

        /* renamed from: d */
        public int f24778d;

        public b() {
                r1 = this;
                r1.<init>()
                u5.z r0 = new u5.z
                r0.<init>()
                r1.f24775a = r0
                r0 = 8000(0x1f40, float:1.121E-41)
                r1.f24777c = r0
                r1.f24778d = r0
                return
        }

        @Override // p352u5.InterfaceC6320i.a
        /* renamed from: a */
        public /* bridge */ /* synthetic */ p352u5.InterfaceC6320i mo12964a() {
                r1 = this;
                u5.q r0 = r1.m12981b()
                return r0
        }

        /* renamed from: b */
        public p352u5.C6328q m12981b() {
                r10 = this;
                u5.q r9 = new u5.q
                java.lang.String r1 = r10.f24776b
                int r2 = r10.f24777c
                int r3 = r10.f24778d
                u5.z r5 = r10.f24775a
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }
    }

    /* renamed from: u5.q$c */
    public static class c extends p026b9.AbstractC0708k<java.lang.String, java.util.List<java.lang.String>> {

        /* renamed from: Z */
        public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> f24779Z;

        public c(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1) {
                r0 = this;
                r0.<init>()
                r0.f24779Z = r1
                return
        }

        @Override // p124h7.AbstractC2947xb
        /* renamed from: a */
        public java.lang.Object mo7308a() {
                r1 = this;
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r1.f24779Z
                return r0
        }

        @Override // p026b9.AbstractC0708k, java.util.Map
        public boolean containsKey(java.lang.Object r1) {
                r0 = this;
                if (r1 == 0) goto La
                boolean r1 = super.containsKey(r1)
                if (r1 == 0) goto La
                r1 = 1
                goto Lb
            La:
                r1 = 0
            Lb:
                return r1
        }

        @Override // java.util.Map
        public boolean containsValue(java.lang.Object r4) {
                r3 = this;
                java.util.Set r0 = r3.entrySet()
                java.util.Iterator r0 = r0.iterator()
                java.util.Objects.requireNonNull(r0)
                r1 = 1
                if (r4 != 0) goto L21
            Le:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L38
                java.lang.Object r4 = r0.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto Le
                goto L39
            L21:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L38
                java.lang.Object r2 = r0.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r2 = r2.getValue()
                boolean r2 = r4.equals(r2)
                if (r2 == 0) goto L21
                goto L39
            L38:
                r1 = 0
            L39:
                return r1
        }

        @Override // p026b9.AbstractC0708k, java.util.Map
        public java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entrySet() {
                r2 = this;
                java.util.Set r0 = super.entrySet()
                t5.g r1 = p337t5.C6177g.f23983Z
                java.util.Set r0 = p026b9.C0707j0.m2299b(r0, r1)
                return r0
        }

        @Override // java.util.Map
        public boolean equals(java.lang.Object r1) {
                r0 = this;
                if (r1 == 0) goto La
                boolean r1 = p026b9.C0722v.m2331a(r0, r1)
                if (r1 == 0) goto La
                r1 = 1
                goto Lb
            La:
                r1 = 0
            Lb:
                return r1
        }

        @Override // p026b9.AbstractC0708k, java.util.Map
        public java.lang.Object get(java.lang.Object r1) {
                r0 = this;
                if (r1 != 0) goto L4
                r1 = 0
                goto La
            L4:
                java.lang.Object r1 = super.get(r1)
                java.util.List r1 = (java.util.List) r1
            La:
                return r1
        }

        @Override // java.util.Map
        public int hashCode() {
                r1 = this;
                java.util.Set r0 = r1.entrySet()
                int r0 = p026b9.C0707j0.m2300c(r0)
                return r0
        }

        @Override // p026b9.AbstractC0708k, java.util.Map
        public boolean isEmpty() {
                r2 = this;
                boolean r0 = super.isEmpty()
                r1 = 1
                if (r0 != 0) goto L16
                int r0 = super.size()
                if (r0 != r1) goto L15
                r0 = 0
                boolean r0 = super.containsKey(r0)
                if (r0 == 0) goto L15
                goto L16
            L15:
                r1 = 0
            L16:
                return r1
        }

        @Override // p026b9.AbstractC0708k, java.util.Map
        public java.util.Set<java.lang.String> keySet() {
                r2 = this;
                java.util.Set r0 = super.keySet()
                u5.r r1 = p352u5.C6329r.f24780Y
                java.util.Set r0 = p026b9.C0707j0.m2299b(r0, r1)
                return r0
        }

        @Override // p026b9.AbstractC0708k, java.util.Map
        public int size() {
                r2 = this;
                int r0 = super.size()
                r1 = 0
                boolean r1 = super.containsKey(r1)
                int r0 = r0 - r1
                return r0
        }
    }

    public C6328q(java.lang.String r1, int r2, int r3, boolean r4, p352u5.C6337z r5, p010a9.InterfaceC0039g r6, boolean r7, p352u5.C6328q.a r8) {
            r0 = this;
            r6 = 1
            r0.<init>(r6)
            r0.f24763h = r1
            r0.f24761f = r2
            r0.f24762g = r3
            r0.f24760e = r4
            r0.f24764i = r5
            r1 = 0
            r0.f24767l = r1
            u5.z r1 = new u5.z
            r1.<init>()
            r0.f24765j = r1
            r0.f24766k = r7
            return
    }

    /* renamed from: z */
    public static void m12975z(java.net.HttpURLConnection r3, long r4) {
            if (r3 == 0) goto L5b
            int r0 = p371v5.C6552b0.f25624a
            r1 = 19
            if (r0 < r1) goto L5b
            r1 = 20
            if (r0 <= r1) goto Ld
            goto L5b
        Ld:
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Exception -> L5b
            r0 = -1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L1f
            int r4 = r3.read()     // Catch: java.lang.Exception -> L5b
            r5 = -1
            if (r4 != r5) goto L26
            return
        L1f:
            r0 = 2048(0x800, double:1.012E-320)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L26
            return
        L26:
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.Exception -> L5b
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Exception -> L5b
            java.lang.String r5 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r5 = r5.equals(r4)     // Catch: java.lang.Exception -> L5b
            if (r5 != 0) goto L3e
            java.lang.String r5 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Exception -> L5b
            if (r4 == 0) goto L5b
        L3e:
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.Exception -> L5b
            java.lang.Class r4 = r4.getSuperclass()     // Catch: java.lang.Exception -> L5b
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Exception -> L5b
            java.lang.String r5 = "unexpectedEndOfInput"
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L5b
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r1)     // Catch: java.lang.Exception -> L5b
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.Exception -> L5b
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L5b
            r4.invoke(r3, r5)     // Catch: java.lang.Exception -> L5b
        L5b:
            return
    }

    /* renamed from: A */
    public final void m12976A(long r8, p352u5.C6323l r10) {
            r7 = this;
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            return
        L7:
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r2]
        Lb:
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 <= 0) goto L47
            long r4 = (long) r2
            long r4 = java.lang.Math.min(r8, r4)
            int r5 = (int) r4
            java.io.InputStream r4 = r7.f24770o
            int r6 = p371v5.C6552b0.f25624a
            r6 = 0
            int r4 = r4.read(r3, r6, r5)
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            boolean r5 = r5.isInterrupted()
            r6 = 1
            if (r5 != 0) goto L3a
            r5 = -1
            if (r4 == r5) goto L32
            long r5 = (long) r4
            long r8 = r8 - r5
            r7.m12952r(r4)
            goto Lb
        L32:
            u5.w r8 = new u5.w
            r9 = 2008(0x7d8, float:2.814E-42)
            r8.<init>(r10, r9, r6)
            throw r8
        L3a:
            u5.w r8 = new u5.w
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException
            r9.<init>()
            r0 = 2000(0x7d0, float:2.803E-42)
            r8.<init>(r9, r10, r0, r6)
            throw r8
        L47:
            return
    }

    @Override // p352u5.InterfaceC6314f
    /* renamed from: b */
    public int mo6020b(byte[] r7, int r8, int r9) {
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            goto L35
        L4:
            long r0 = r6.f24773r     // Catch: java.io.IOException -> L1e
            r2 = -1
            r4 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L20
            long r2 = r6.f24774s     // Catch: java.io.IOException -> L1e
            long r0 = r0 - r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L17
            goto L2a
        L17:
            long r2 = (long) r9     // Catch: java.io.IOException -> L1e
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.io.IOException -> L1e
            int r9 = (int) r0     // Catch: java.io.IOException -> L1e
            goto L20
        L1e:
            r7 = move-exception
            goto L36
        L20:
            java.io.InputStream r0 = r6.f24770o     // Catch: java.io.IOException -> L1e
            int r1 = p371v5.C6552b0.f25624a     // Catch: java.io.IOException -> L1e
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L1e
            if (r7 != r4) goto L2c
        L2a:
            r7 = -1
            goto L35
        L2c:
            long r8 = r6.f24774s     // Catch: java.io.IOException -> L1e
            long r0 = (long) r7     // Catch: java.io.IOException -> L1e
            long r8 = r8 + r0
            r6.f24774s = r8     // Catch: java.io.IOException -> L1e
            r6.m12952r(r7)     // Catch: java.io.IOException -> L1e
        L35:
            return r7
        L36:
            u5.l r8 = r6.f24768m
            int r9 = p371v5.C6552b0.f25624a
            r9 = 2
            u5.w r7 = p352u5.C6334w.m12986b(r7, r8, r9)
            throw r7
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: c */
    public long mo6021c(p352u5.C6323l r19) {
            r18 = this;
            r1 = r18
            r7 = r19
            r1.f24768m = r7
            r2 = 0
            r1.f24774s = r2
            r1.f24773r = r2
            r18.m12954t(r19)
            r0 = 1
            java.net.HttpURLConnection r4 = r18.m12980y(r19)     // Catch: java.io.IOException -> L1fa
            r1.f24769n = r4     // Catch: java.io.IOException -> L1fa
            int r5 = r4.getResponseCode()     // Catch: java.io.IOException -> L1fa
            r1.f24772q = r5     // Catch: java.io.IOException -> L1fa
            java.lang.String r5 = r4.getResponseMessage()     // Catch: java.io.IOException -> L1fa
            int r6 = r1.f24772q
            java.lang.String r8 = "Content-Range"
            r9 = 200(0xc8, float:2.8E-43)
            r10 = -1
            if (r6 < r9) goto L183
            r12 = 299(0x12b, float:4.19E-43)
            if (r6 <= r12) goto L30
            goto L183
        L30:
            java.lang.String r5 = r4.getContentType()
            a9.g<java.lang.String> r6 = r1.f24767l
            if (r6 == 0) goto L48
            boolean r6 = r6.apply(r5)
            if (r6 == 0) goto L3f
            goto L48
        L3f:
            r18.m12977v()
            u5.x r0 = new u5.x
            r0.<init>(r5, r7)
            throw r0
        L48:
            int r5 = r1.f24772q
            if (r5 != r9) goto L53
            long r5 = r7.f24709f
            int r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r9 == 0) goto L53
            r2 = r5
        L53:
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r5 = r4.getHeaderField(r5)
            java.lang.String r6 = "gzip"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 != 0) goto L141
            long r12 = r7.f24710g
            int r6 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r6 == 0) goto L6b
        L67:
            r1.f24773r = r12
            goto L145
        L6b:
            java.lang.String r6 = "Content-Length"
            java.lang.String r6 = r4.getHeaderField(r6)
            java.lang.String r8 = r4.getHeaderField(r8)
            java.util.regex.Pattern r9 = p352u5.C6305a0.f24621a
            boolean r9 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r10 = "]"
            java.lang.String r11 = "HttpUtil"
            if (r9 != 0) goto La3
            long r12 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L86
            goto La5
        L86:
            r9 = 28
            int r9 = p064e.C1489c.m4038a(r6, r9)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r9)
            java.lang.String r9 = "Unexpected Content-Length ["
            r12.append(r9)
            r12.append(r6)
            r12.append(r10)
            java.lang.String r9 = r12.toString()
            android.util.Log.e(r11, r9)
        La3:
            r12 = -1
        La5:
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L134
            java.util.regex.Pattern r9 = p352u5.C6305a0.f24621a
            java.util.regex.Matcher r9 = r9.matcher(r8)
            boolean r14 = r9.matches()
            if (r14 == 0) goto L134
            r14 = 2
            java.lang.String r14 = r9.group(r14)     // Catch: java.lang.NumberFormatException -> L117
            java.util.Objects.requireNonNull(r14)     // Catch: java.lang.NumberFormatException -> L117
            long r14 = java.lang.Long.parseLong(r14)     // Catch: java.lang.NumberFormatException -> L117
            java.lang.String r0 = r9.group(r0)     // Catch: java.lang.NumberFormatException -> L117
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.NumberFormatException -> L117
            long r16 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L117
            long r14 = r14 - r16
            r16 = 1
            long r14 = r14 + r16
            r16 = 0
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 >= 0) goto Ldc
            r12 = r14
            goto L134
        Ldc:
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L134
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch: java.lang.NumberFormatException -> L117
            int r0 = r0.length()     // Catch: java.lang.NumberFormatException -> L117
            int r0 = r0 + 26
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch: java.lang.NumberFormatException -> L117
            int r9 = r9.length()     // Catch: java.lang.NumberFormatException -> L117
            int r0 = r0 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L117
            r9.<init>(r0)     // Catch: java.lang.NumberFormatException -> L117
            java.lang.String r0 = "Inconsistent headers ["
            r9.append(r0)     // Catch: java.lang.NumberFormatException -> L117
            r9.append(r6)     // Catch: java.lang.NumberFormatException -> L117
            java.lang.String r0 = "] ["
            r9.append(r0)     // Catch: java.lang.NumberFormatException -> L117
            r9.append(r8)     // Catch: java.lang.NumberFormatException -> L117
            r9.append(r10)     // Catch: java.lang.NumberFormatException -> L117
            java.lang.String r0 = r9.toString()     // Catch: java.lang.NumberFormatException -> L117
            android.util.Log.w(r11, r0)     // Catch: java.lang.NumberFormatException -> L117
            long r12 = java.lang.Math.max(r12, r14)     // Catch: java.lang.NumberFormatException -> L117
            goto L134
        L117:
            r0 = 27
            int r0 = p064e.C1489c.m4038a(r8, r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            java.lang.String r0 = "Unexpected Content-Range ["
            r6.append(r0)
            r6.append(r8)
            r6.append(r10)
            java.lang.String r0 = r6.toString()
            android.util.Log.e(r11, r0)
        L134:
            r8 = -1
            int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r0 == 0) goto L13d
            long r12 = r12 - r2
            goto L67
        L13d:
            r12 = -1
            goto L67
        L141:
            long r8 = r7.f24710g
            r1.f24773r = r8
        L145:
            r6 = 2000(0x7d0, float:2.803E-42)
            java.io.InputStream r0 = r4.getInputStream()     // Catch: java.io.IOException -> L178
            r1.f24770o = r0     // Catch: java.io.IOException -> L178
            if (r5 == 0) goto L158
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.io.IOException -> L178
            java.io.InputStream r4 = r1.f24770o     // Catch: java.io.IOException -> L178
            r0.<init>(r4)     // Catch: java.io.IOException -> L178
            r1.f24770o = r0     // Catch: java.io.IOException -> L178
        L158:
            r0 = 1
            r1.f24771p = r0
            r18.m12955u(r19)
            r1.m12976A(r2, r7)     // Catch: java.io.IOException -> L164
            long r2 = r1.f24773r
            return r2
        L164:
            r0 = move-exception
            r2 = r0
            r18.m12977v()
            boolean r0 = r2 instanceof p352u5.C6334w
            if (r0 == 0) goto L171
            r0 = r2
            u5.w r0 = (p352u5.C6334w) r0
            throw r0
        L171:
            u5.w r0 = new u5.w
            r3 = 1
            r0.<init>(r2, r7, r6, r3)
            throw r0
        L178:
            r0 = move-exception
            r2 = 1
            r18.m12977v()
            u5.w r3 = new u5.w
            r3.<init>(r0, r7, r6, r2)
            throw r3
        L183:
            java.util.Map r6 = r4.getHeaderFields()
            int r0 = r1.f24772q
            r9 = 416(0x1a0, float:5.83E-43)
            if (r0 != r9) goto L1cb
            java.lang.String r0 = r4.getHeaderField(r8)
            java.util.regex.Pattern r8 = p352u5.C6305a0.f24621a
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 == 0) goto L19a
            goto L1b3
        L19a:
            java.util.regex.Pattern r8 = p352u5.C6305a0.f24622b
            java.util.regex.Matcher r0 = r8.matcher(r0)
            boolean r8 = r0.matches()
            if (r8 == 0) goto L1b3
            r8 = 1
            java.lang.String r0 = r0.group(r8)
            java.util.Objects.requireNonNull(r0)
            long r10 = java.lang.Long.parseLong(r0)
            goto L1b6
        L1b3:
            r8 = 1
            r10 = -1
        L1b6:
            long r12 = r7.f24709f
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 != 0) goto L1cb
            r1.f24771p = r8
            r18.m12955u(r19)
            long r4 = r7.f24710g
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L1ca
            r2 = r4
        L1ca:
            return r2
        L1cb:
            java.io.InputStream r0 = r4.getErrorStream()
            if (r0 == 0) goto L1d6
            byte[] r0 = p371v5.C6552b0.m13305I(r0)     // Catch: java.io.IOException -> L1da
            goto L1d8
        L1d6:
            byte[] r0 = p371v5.C6552b0.f25629f     // Catch: java.io.IOException -> L1da
        L1d8:
            r8 = r0
            goto L1dd
        L1da:
            byte[] r0 = p371v5.C6552b0.f25629f
            goto L1d8
        L1dd:
            r18.m12977v()
            int r0 = r1.f24772q
            if (r0 != r9) goto L1ec
            u5.j r0 = new u5.j
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r2)
            goto L1ed
        L1ec:
            r0 = 0
        L1ed:
            u5.y r9 = new u5.y
            int r3 = r1.f24772q
            r2 = r9
            r4 = r5
            r5 = r0
            r7 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            throw r9
        L1fa:
            r0 = move-exception
            r18.m12977v()
            r2 = 1
            u5.w r0 = p352u5.C6334w.m12986b(r0, r7, r2)
            throw r0
    }

    @Override // p352u5.InterfaceC6320i
    public void close() {
            r8 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r8.f24770o     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L2a
            long r3 = r8.f24773r     // Catch: java.lang.Throwable -> L39
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto Lf
            goto L13
        Lf:
            long r5 = r8.f24774s     // Catch: java.lang.Throwable -> L39
            long r5 = r3 - r5
        L13:
            java.net.HttpURLConnection r3 = r8.f24769n     // Catch: java.lang.Throwable -> L39
            m12975z(r3, r5)     // Catch: java.lang.Throwable -> L39
            r2.close()     // Catch: java.io.IOException -> L1c java.lang.Throwable -> L39
            goto L2a
        L1c:
            r2 = move-exception
            u5.w r3 = new u5.w     // Catch: java.lang.Throwable -> L39
            u5.l r4 = r8.f24768m     // Catch: java.lang.Throwable -> L39
            int r5 = p371v5.C6552b0.f25624a     // Catch: java.lang.Throwable -> L39
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L39
            throw r3     // Catch: java.lang.Throwable -> L39
        L2a:
            r8.f24770o = r1
            r8.m12977v()
            boolean r1 = r8.f24771p
            if (r1 == 0) goto L38
            r8.f24771p = r0
            r8.m12953s()
        L38:
            return
        L39:
            r2 = move-exception
            r8.f24770o = r1
            r8.m12977v()
            boolean r1 = r8.f24771p
            if (r1 == 0) goto L48
            r8.f24771p = r0
            r8.m12953s()
        L48:
            throw r2
    }

    @Override // p352u5.AbstractC6310d, p352u5.InterfaceC6320i
    /* renamed from: g */
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> mo6022g() {
            r2 = this;
            java.net.HttpURLConnection r0 = r2.f24769n
            if (r0 != 0) goto L7
            b9.o<java.lang.Object, java.lang.Object> r0 = p026b9.C0695d0.f3901e0
            return r0
        L7:
            u5.q$c r1 = new u5.q$c
            java.util.Map r0 = r0.getHeaderFields()
            r1.<init>(r0)
            return r1
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: l */
    public android.net.Uri mo6024l() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.f24769n
            if (r0 != 0) goto L6
            r0 = 0
            goto L12
        L6:
            java.net.URL r0 = r0.getURL()
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
        L12:
            return r0
    }

    /* renamed from: v */
    public final void m12977v() {
            r3 = this;
            java.net.HttpURLConnection r0 = r3.f24769n
            if (r0 == 0) goto L13
            r0.disconnect()     // Catch: java.lang.Exception -> L8
            goto L10
        L8:
            r0 = move-exception
            java.lang.String r1 = "DefaultHttpDataSource"
            java.lang.String r2 = "Unexpected error while disconnecting"
            p371v5.C6565o.m13369b(r1, r2, r0)
        L10:
            r0 = 0
            r3.f24769n = r0
        L13:
            return
    }

    /* renamed from: w */
    public final java.net.URL m12978w(java.net.URL r7, java.lang.String r8, p352u5.C6323l r9) {
            r6 = this;
            r0 = 1
            r1 = 2001(0x7d1, float:2.804E-42)
            if (r8 == 0) goto L77
            java.net.URL r2 = new java.net.URL     // Catch: java.net.MalformedURLException -> L70
            r2.<init>(r7, r8)     // Catch: java.net.MalformedURLException -> L70
            java.lang.String r8 = r2.getProtocol()
            java.lang.String r3 = "https"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L3a
            java.lang.String r3 = "http"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L3a
            u5.w r7 = new u5.w
            java.lang.String r2 = "Unsupported protocol redirect: "
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r3 = r8.length()
            if (r3 == 0) goto L31
            java.lang.String r8 = r2.concat(r8)
            goto L36
        L31:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r2)
        L36:
            r7.<init>(r8, r9, r1, r0)
            throw r7
        L3a:
            boolean r3 = r6.f24760e
            if (r3 != 0) goto L6f
            java.lang.String r3 = r7.getProtocol()
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L49
            goto L6f
        L49:
            u5.w r2 = new u5.w
            java.lang.String r7 = r7.getProtocol()
            r3 = 41
            int r3 = p064e.C1489c.m4038a(r7, r3)
            int r4 = r8.length()
            int r4 = r4 + r3
            java.lang.String r3 = "Disallowed cross-protocol redirect ("
            java.lang.String r5 = " to "
            java.lang.StringBuilder r7 = p064e.C1491e.m4040a(r4, r3, r7, r5, r8)
            java.lang.String r8 = ")"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r2.<init>(r7, r9, r1, r0)
            throw r2
        L6f:
            return r2
        L70:
            r7 = move-exception
            u5.w r8 = new u5.w
            r8.<init>(r7, r9, r1, r0)
            throw r8
        L77:
            u5.w r7 = new u5.w
            java.lang.String r8 = "Null location redirect"
            r7.<init>(r8, r9, r1, r0)
            throw r7
    }

    /* renamed from: x */
    public final java.net.HttpURLConnection m12979x(java.net.URL r5, int r6, byte[] r7, long r8, long r10, boolean r12, boolean r13, java.util.Map<java.lang.String, java.lang.String> r14) {
            r4 = this;
            java.net.URLConnection r5 = r5.openConnection()
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5
            int r0 = r4.f24761f
            r5.setConnectTimeout(r0)
            int r0 = r4.f24762g
            r5.setReadTimeout(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            u5.z r1 = r4.f24764i
            if (r1 == 0) goto L20
            java.util.Map r1 = r1.m12987a()
            r0.putAll(r1)
        L20:
            u5.z r1 = r4.f24765j
            java.util.Map r1 = r1.m12987a()
            r0.putAll(r1)
            r0.putAll(r14)
            java.util.Set r14 = r0.entrySet()
            java.util.Iterator r14 = r14.iterator()
        L34:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r0 = r14.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r5.setRequestProperty(r1, r0)
            goto L34
        L50:
            java.util.regex.Pattern r14 = p352u5.C6305a0.f24621a
            r0 = -1
            r2 = 0
            int r14 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r14 != 0) goto L60
            int r14 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r14 != 0) goto L60
            r8 = 0
            goto L81
        L60:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r2 = "bytes="
            r14.append(r2)
            r14.append(r8)
            java.lang.String r2 = "-"
            r14.append(r2)
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 == 0) goto L7d
            long r8 = r8 + r10
            r10 = 1
            long r8 = r8 - r10
            r14.append(r8)
        L7d:
            java.lang.String r8 = r14.toString()
        L81:
            if (r8 == 0) goto L88
            java.lang.String r9 = "Range"
            r5.setRequestProperty(r9, r8)
        L88:
            java.lang.String r8 = r4.f24763h
            if (r8 == 0) goto L91
            java.lang.String r9 = "User-Agent"
            r5.setRequestProperty(r9, r8)
        L91:
            if (r12 == 0) goto L96
            java.lang.String r8 = "gzip"
            goto L98
        L96:
            java.lang.String r8 = "identity"
        L98:
            java.lang.String r9 = "Accept-Encoding"
            r5.setRequestProperty(r9, r8)
            r5.setInstanceFollowRedirects(r13)
            if (r7 == 0) goto La4
            r8 = 1
            goto La5
        La4:
            r8 = 0
        La5:
            r5.setDoOutput(r8)
            java.lang.String r6 = p352u5.C6323l.m12965a(r6)
            r5.setRequestMethod(r6)
            if (r7 == 0) goto Lc3
            int r6 = r7.length
            r5.setFixedLengthStreamingMode(r6)
            r5.connect()
            java.io.OutputStream r6 = r5.getOutputStream()
            r6.write(r7)
            r6.close()
            goto Lc6
        Lc3:
            r5.connect()
        Lc6:
            return r5
    }

    /* renamed from: y */
    public final java.net.HttpURLConnection m12980y(p352u5.C6323l r25) {
            r24 = this;
            r11 = r24
            r12 = r25
            java.net.URL r1 = new java.net.URL
            android.net.Uri r0 = r12.f24704a
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            int r2 = r12.f24706c
            byte[] r3 = r12.f24707d
            long r13 = r12.f24709f
            long r9 = r12.f24710g
            int r0 = r12.f24712i
            r4 = 1
            r0 = r0 & r4
            if (r0 != r4) goto L20
            r0 = 1
            r15 = 1
            goto L22
        L20:
            r0 = 0
            r15 = 0
        L22:
            boolean r0 = r11.f24760e
            if (r0 != 0) goto L3b
            boolean r0 = r11.f24766k
            if (r0 != 0) goto L3b
            r16 = 1
            java.util.Map<java.lang.String, java.lang.String> r12 = r12.f24708e
            r0 = r24
            r4 = r13
            r6 = r9
            r8 = r15
            r9 = r16
            r10 = r12
            java.net.HttpURLConnection r0 = r0.m12979x(r1, r2, r3, r4, r6, r8, r9, r10)
            return r0
        L3b:
            r0 = 0
            r8 = r1
            r6 = r2
            r16 = r3
        L40:
            int r7 = r0 + 1
            r1 = 20
            if (r0 > r1) goto Lc5
            r17 = 0
            java.util.Map<java.lang.String, java.lang.String> r4 = r12.f24708e
            r0 = r24
            r1 = r8
            r2 = r6
            r3 = r16
            r18 = r4
            r4 = r13
            r19 = r13
            r13 = r6
            r14 = r7
            r6 = r9
            r21 = r14
            r14 = r8
            r8 = r15
            r22 = r9
            r9 = r17
            r10 = r18
            java.net.HttpURLConnection r0 = r0.m12979x(r1, r2, r3, r4, r6, r8, r9, r10)
            int r1 = r0.getResponseCode()
            java.lang.String r2 = "Location"
            java.lang.String r2 = r0.getHeaderField(r2)
            r3 = 303(0x12f, float:4.25E-43)
            r4 = 301(0x12d, float:4.22E-43)
            r5 = 300(0x12c, float:4.2E-43)
            r6 = 302(0x12e, float:4.23E-43)
            r7 = 1
            if (r13 == r7) goto L7e
            r7 = 3
            if (r13 != r7) goto L8f
        L7e:
            if (r1 == r5) goto Lb4
            if (r1 == r4) goto Lb4
            if (r1 == r6) goto Lb4
            if (r1 == r3) goto Lb4
            r7 = 307(0x133, float:4.3E-43)
            if (r1 == r7) goto Lb4
            r7 = 308(0x134, float:4.32E-43)
            if (r1 != r7) goto L8f
            goto Lb4
        L8f:
            r7 = 2
            if (r13 != r7) goto Lb3
            if (r1 == r5) goto L9a
            if (r1 == r4) goto L9a
            if (r1 == r6) goto L9a
            if (r1 != r3) goto Lb3
        L9a:
            r0.disconnect()
            boolean r0 = r11.f24766k
            if (r0 == 0) goto La5
            if (r1 != r6) goto La5
            r0 = 1
            goto La6
        La5:
            r0 = 0
        La6:
            if (r0 != 0) goto Lac
            r16 = 0
            r6 = 1
            goto Lad
        Lac:
            r6 = r13
        Lad:
            java.net.URL r0 = r11.m12978w(r14, r2, r12)
            r8 = r0
            goto Lbd
        Lb3:
            return r0
        Lb4:
            r0.disconnect()
            java.net.URL r0 = r11.m12978w(r14, r2, r12)
            r8 = r0
            r6 = r13
        Lbd:
            r13 = r19
            r0 = r21
            r9 = r22
            goto L40
        Lc5:
            r21 = r7
            u5.w r0 = new u5.w
            java.net.NoRouteToHostException r1 = new java.net.NoRouteToHostException
            r2 = 31
            java.lang.String r3 = "Too many redirects: "
            r4 = r21
            java.lang.String r2 = p064e.C1490d.m4039a(r2, r3, r4)
            r1.<init>(r2)
            r2 = 2001(0x7d1, float:2.804E-42)
            r3 = 1
            r0.<init>(r1, r12, r2, r3)
            throw r0
    }
}
