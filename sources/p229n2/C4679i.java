package p229n2;

/* renamed from: n2.i */
/* loaded from: classes.dex */
public class C4679i implements p229n2.InterfaceC4673c {

    /* renamed from: k */
    public static final android.graphics.Bitmap.Config f18626k = null;

    /* renamed from: a */
    public final p229n2.InterfaceC4680j f18627a;

    /* renamed from: b */
    public final java.util.Set<android.graphics.Bitmap.Config> f18628b;

    /* renamed from: c */
    public final long f18629c;

    /* renamed from: d */
    public final p229n2.C4679i.a f18630d;

    /* renamed from: e */
    public long f18631e;

    /* renamed from: f */
    public long f18632f;

    /* renamed from: g */
    public int f18633g;

    /* renamed from: h */
    public int f18634h;

    /* renamed from: i */
    public int f18635i;

    /* renamed from: j */
    public int f18636j;

    /* renamed from: n2.i$a */
    public interface a {
    }

    /* renamed from: n2.i$b */
    public static final class b implements p229n2.C4679i.a {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            p229n2.C4679i.f18626k = r0
            return
    }

    public C4679i(long r5) {
            r4 = this;
            n2.l r0 = new n2.l
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            android.graphics.Bitmap$Config[] r2 = android.graphics.Bitmap.Config.values()
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r1.add(r3)
            r3 = 26
            if (r2 < r3) goto L21
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.HARDWARE
            r1.remove(r2)
        L21:
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            r4.<init>()
            r4.f18629c = r5
            r4.f18631e = r5
            r4.f18627a = r0
            r4.f18628b = r1
            n2.i$b r5 = new n2.i$b
            r5.<init>()
            r4.f18630d = r5
            return
    }

    @Override // p229n2.InterfaceC4673c
    @android.annotation.SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo10689a(int r6) {
            r5 = this;
            java.lang.String r0 = "LruBitmapPool"
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            if (r2 == 0) goto L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "trimMemory, level="
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r0, r2)
        L1d:
            r2 = 40
            if (r6 >= r2) goto L3b
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            r4 = 20
            if (r2 < r3) goto L2c
            if (r6 < r4) goto L2c
            goto L3b
        L2c:
            if (r6 >= r4) goto L32
            r0 = 15
            if (r6 != r0) goto L4b
        L32:
            long r0 = r5.f18631e
            r2 = 2
            long r0 = r0 / r2
            r5.m10710j(r0)
            goto L4b
        L3b:
            boolean r6 = android.util.Log.isLoggable(r0, r1)
            if (r6 == 0) goto L46
            java.lang.String r6 = "clearMemory"
            android.util.Log.d(r0, r6)
        L46:
            r0 = 0
            r5.m10710j(r0)
        L4b:
            return
    }

    @Override // p229n2.InterfaceC4673c
    /* renamed from: b */
    public void mo10690b() {
            r2 = this;
            java.lang.String r0 = "LruBitmapPool"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto Le
            java.lang.String r1 = "clearMemory"
            android.util.Log.d(r0, r1)
        Le:
            r0 = 0
            r2.m10710j(r0)
            return
    }

    @Override // p229n2.InterfaceC4673c
    /* renamed from: c */
    public synchronized void mo10691c(float r3) {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.f18629c     // Catch: java.lang.Throwable -> L12
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L12
            float r0 = r0 * r3
            int r3 = java.lang.Math.round(r0)     // Catch: java.lang.Throwable -> L12
            long r0 = (long) r3     // Catch: java.lang.Throwable -> L12
            r2.f18631e = r0     // Catch: java.lang.Throwable -> L12
            r2.m10710j(r0)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return
        L12:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // p229n2.InterfaceC4673c
    /* renamed from: d */
    public android.graphics.Bitmap mo10692d(int r2, int r3, android.graphics.Bitmap.Config r4) {
            r1 = this;
            android.graphics.Bitmap r0 = r1.m10709i(r2, r3, r4)
            if (r0 != 0) goto Lf
            if (r4 == 0) goto L9
            goto Lb
        L9:
            android.graphics.Bitmap$Config r4 = p229n2.C4679i.f18626k
        Lb:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r4)
        Lf:
            return r0
    }

    @Override // p229n2.InterfaceC4673c
    /* renamed from: e */
    public android.graphics.Bitmap mo10693e(int r2, int r3, android.graphics.Bitmap.Config r4) {
            r1 = this;
            android.graphics.Bitmap r0 = r1.m10709i(r2, r3, r4)
            if (r0 == 0) goto Lb
            r2 = 0
            r0.eraseColor(r2)
            goto L14
        Lb:
            if (r4 == 0) goto Le
            goto L10
        Le:
            android.graphics.Bitmap$Config r4 = p229n2.C4679i.f18626k
        L10:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r4)
        L14:
            return r0
    }

    @Override // p229n2.InterfaceC4673c
    /* renamed from: f */
    public synchronized void mo10694f(android.graphics.Bitmap r7) {
            r6 = this;
            monitor-enter(r6)
            if (r7 == 0) goto Ld3
            boolean r0 = r7.isRecycled()     // Catch: java.lang.Throwable -> Ldb
            if (r0 != 0) goto Lcb
            boolean r0 = r7.isMutable()     // Catch: java.lang.Throwable -> Ldb
            r1 = 2
            if (r0 == 0) goto L82
            n2.j r0 = r6.f18627a     // Catch: java.lang.Throwable -> Ldb
            n2.l r0 = (p229n2.C4682l) r0     // Catch: java.lang.Throwable -> Ldb
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> Ldb
            int r0 = p106g3.C2238j.m5844d(r7)     // Catch: java.lang.Throwable -> Ldb
            long r2 = (long) r0     // Catch: java.lang.Throwable -> Ldb
            long r4 = r6.f18631e     // Catch: java.lang.Throwable -> Ldb
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L82
            java.util.Set<android.graphics.Bitmap$Config> r0 = r6.f18628b     // Catch: java.lang.Throwable -> Ldb
            android.graphics.Bitmap$Config r2 = r7.getConfig()     // Catch: java.lang.Throwable -> Ldb
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> Ldb
            if (r0 != 0) goto L2f
            goto L82
        L2f:
            n2.j r0 = r6.f18627a     // Catch: java.lang.Throwable -> Ldb
            n2.l r0 = (p229n2.C4682l) r0     // Catch: java.lang.Throwable -> Ldb
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> Ldb
            int r0 = p106g3.C2238j.m5844d(r7)     // Catch: java.lang.Throwable -> Ldb
            n2.j r2 = r6.f18627a     // Catch: java.lang.Throwable -> Ldb
            n2.l r2 = (p229n2.C4682l) r2     // Catch: java.lang.Throwable -> Ldb
            r2.m10716f(r7)     // Catch: java.lang.Throwable -> Ldb
            n2.i$a r2 = r6.f18630d     // Catch: java.lang.Throwable -> Ldb
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> Ldb
            int r2 = r6.f18635i     // Catch: java.lang.Throwable -> Ldb
            int r2 = r2 + 1
            r6.f18635i = r2     // Catch: java.lang.Throwable -> Ldb
            long r2 = r6.f18632f     // Catch: java.lang.Throwable -> Ldb
            long r4 = (long) r0     // Catch: java.lang.Throwable -> Ldb
            long r2 = r2 + r4
            r6.f18632f = r2     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r0 = "LruBitmapPool"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Ldb
            if (r0 == 0) goto L78
            java.lang.String r0 = "LruBitmapPool"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldb
            r1.<init>()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = "Put bitmap in pool="
            r1.append(r2)     // Catch: java.lang.Throwable -> Ldb
            n2.j r2 = r6.f18627a     // Catch: java.lang.Throwable -> Ldb
            n2.l r2 = (p229n2.C4682l) r2     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r7 = r2.m10715e(r7)     // Catch: java.lang.Throwable -> Ldb
            r1.append(r7)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> Ldb
            android.util.Log.v(r0, r7)     // Catch: java.lang.Throwable -> Ldb
        L78:
            r6.m10707g()     // Catch: java.lang.Throwable -> Ldb
            long r0 = r6.f18631e     // Catch: java.lang.Throwable -> Ldb
            r6.m10710j(r0)     // Catch: java.lang.Throwable -> Ldb
            monitor-exit(r6)
            return
        L82:
            java.lang.String r0 = "LruBitmapPool"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Ldb
            if (r0 == 0) goto Lc6
            java.lang.String r0 = "LruBitmapPool"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldb
            r1.<init>()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = "Reject bitmap from pool, bitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Ldb
            n2.j r2 = r6.f18627a     // Catch: java.lang.Throwable -> Ldb
            n2.l r2 = (p229n2.C4682l) r2     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = r2.m10715e(r7)     // Catch: java.lang.Throwable -> Ldb
            r1.append(r2)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = ", is mutable: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Ldb
            boolean r2 = r7.isMutable()     // Catch: java.lang.Throwable -> Ldb
            r1.append(r2)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = ", is allowed config: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Ldb
            java.util.Set<android.graphics.Bitmap$Config> r2 = r6.f18628b     // Catch: java.lang.Throwable -> Ldb
            android.graphics.Bitmap$Config r3 = r7.getConfig()     // Catch: java.lang.Throwable -> Ldb
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> Ldb
            r1.append(r2)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ldb
            android.util.Log.v(r0, r1)     // Catch: java.lang.Throwable -> Ldb
        Lc6:
            r7.recycle()     // Catch: java.lang.Throwable -> Ldb
            monitor-exit(r6)
            return
        Lcb:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r0 = "Cannot pool recycled bitmap"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Ldb
            throw r7     // Catch: java.lang.Throwable -> Ldb
        Ld3:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r0 = "Bitmap must not be null"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Ldb
            throw r7     // Catch: java.lang.Throwable -> Ldb
        Ldb:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    /* renamed from: g */
    public final void m10707g() {
            r2 = this;
            java.lang.String r0 = "LruBitmapPool"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto Lc
            r2.m10708h()
        Lc:
            return
    }

    /* renamed from: h */
    public final void m10708h() {
            r3 = this;
            java.lang.String r0 = "Hits="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.f18633g
            r0.append(r1)
            java.lang.String r1 = ", misses="
            r0.append(r1)
            int r1 = r3.f18634h
            r0.append(r1)
            java.lang.String r1 = ", puts="
            r0.append(r1)
            int r1 = r3.f18635i
            r0.append(r1)
            java.lang.String r1 = ", evictions="
            r0.append(r1)
            int r1 = r3.f18636j
            r0.append(r1)
            java.lang.String r1 = ", currentSize="
            r0.append(r1)
            long r1 = r3.f18632f
            r0.append(r1)
            java.lang.String r1 = ", maxSize="
            r0.append(r1)
            long r1 = r3.f18631e
            r0.append(r1)
            java.lang.String r1 = "\nStrategy="
            r0.append(r1)
            n2.j r1 = r3.f18627a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LruBitmapPool"
            android.util.Log.v(r1, r0)
            return
    }

    /* renamed from: i */
    public final synchronized android.graphics.Bitmap m10709i(int r7, int r8, android.graphics.Bitmap.Config r9) {
            r6 = this;
            monitor-enter(r6)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lc1
            r1 = 26
            if (r0 >= r1) goto L8
            goto Lc
        L8:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.HARDWARE     // Catch: java.lang.Throwable -> Lc1
            if (r9 == r0) goto La5
        Lc:
            n2.j r0 = r6.f18627a     // Catch: java.lang.Throwable -> Lc1
            if (r9 == 0) goto L12
            r1 = r9
            goto L14
        L12:
            android.graphics.Bitmap$Config r1 = p229n2.C4679i.f18626k     // Catch: java.lang.Throwable -> Lc1
        L14:
            n2.l r0 = (p229n2.C4682l) r0     // Catch: java.lang.Throwable -> Lc1
            android.graphics.Bitmap r0 = r0.m10713b(r7, r8, r1)     // Catch: java.lang.Throwable -> Lc1
            r1 = 1
            if (r0 != 0) goto L51
            java.lang.String r2 = "LruBitmapPool"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch: java.lang.Throwable -> Lc1
            if (r2 == 0) goto L4b
            java.lang.String r2 = "LruBitmapPool"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            r3.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = "Missing bitmap="
            r3.append(r4)     // Catch: java.lang.Throwable -> Lc1
            n2.j r4 = r6.f18627a     // Catch: java.lang.Throwable -> Lc1
            n2.l r4 = (p229n2.C4682l) r4     // Catch: java.lang.Throwable -> Lc1
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> Lc1
            int r4 = p106g3.C2238j.m5843c(r7, r8, r9)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = p229n2.C4682l.m10711c(r4, r9)     // Catch: java.lang.Throwable -> Lc1
            r3.append(r4)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lc1
            android.util.Log.d(r2, r3)     // Catch: java.lang.Throwable -> Lc1
        L4b:
            int r2 = r6.f18634h     // Catch: java.lang.Throwable -> Lc1
            int r2 = r2 + r1
            r6.f18634h = r2     // Catch: java.lang.Throwable -> Lc1
            goto L72
        L51:
            int r2 = r6.f18633g     // Catch: java.lang.Throwable -> Lc1
            int r2 = r2 + r1
            r6.f18633g = r2     // Catch: java.lang.Throwable -> Lc1
            long r2 = r6.f18632f     // Catch: java.lang.Throwable -> Lc1
            n2.j r4 = r6.f18627a     // Catch: java.lang.Throwable -> Lc1
            n2.l r4 = (p229n2.C4682l) r4     // Catch: java.lang.Throwable -> Lc1
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> Lc1
            int r4 = p106g3.C2238j.m5844d(r0)     // Catch: java.lang.Throwable -> Lc1
            long r4 = (long) r4     // Catch: java.lang.Throwable -> Lc1
            long r2 = r2 - r4
            r6.f18632f = r2     // Catch: java.lang.Throwable -> Lc1
            n2.i$a r2 = r6.f18630d     // Catch: java.lang.Throwable -> Lc1
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> Lc1
            r0.setHasAlpha(r1)     // Catch: java.lang.Throwable -> Lc1
            r0.setPremultiplied(r1)     // Catch: java.lang.Throwable -> Lc1
        L72:
            java.lang.String r1 = "LruBitmapPool"
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> Lc1
            if (r1 == 0) goto La0
            java.lang.String r1 = "LruBitmapPool"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            r2.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r3 = "Get bitmap="
            r2.append(r3)     // Catch: java.lang.Throwable -> Lc1
            n2.j r3 = r6.f18627a     // Catch: java.lang.Throwable -> Lc1
            n2.l r3 = (p229n2.C4682l) r3     // Catch: java.lang.Throwable -> Lc1
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> Lc1
            int r7 = p106g3.C2238j.m5843c(r7, r8, r9)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r7 = p229n2.C4682l.m10711c(r7, r9)     // Catch: java.lang.Throwable -> Lc1
            r2.append(r7)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> Lc1
            android.util.Log.v(r1, r7)     // Catch: java.lang.Throwable -> Lc1
        La0:
            r6.m10707g()     // Catch: java.lang.Throwable -> Lc1
            monitor-exit(r6)
            return r0
        La5:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lc1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            r8.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = "Cannot create a mutable Bitmap with config: "
            r8.append(r0)     // Catch: java.lang.Throwable -> Lc1
            r8.append(r9)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r9 = ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions"
            r8.append(r9)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lc1
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lc1
            throw r7     // Catch: java.lang.Throwable -> Lc1
        Lc1:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    /* renamed from: j */
    public final synchronized void m10710j(long r7) {
            r6 = this;
            monitor-enter(r6)
        L1:
            long r0 = r6.f18632f     // Catch: java.lang.Throwable -> L88
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L86
            n2.j r0 = r6.f18627a     // Catch: java.lang.Throwable -> L88
            n2.l r0 = (p229n2.C4682l) r0     // Catch: java.lang.Throwable -> L88
            n2.f<n2.l$b, android.graphics.Bitmap> r1 = r0.f18643b     // Catch: java.lang.Throwable -> L88
            java.lang.Object r1 = r1.m10697c()     // Catch: java.lang.Throwable -> L88
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L20
            int r2 = p106g3.C2238j.m5844d(r1)     // Catch: java.lang.Throwable -> L88
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L88
            r0.m10712a(r2, r1)     // Catch: java.lang.Throwable -> L88
        L20:
            if (r1 != 0) goto L3b
            java.lang.String r7 = "LruBitmapPool"
            r8 = 5
            boolean r7 = android.util.Log.isLoggable(r7, r8)     // Catch: java.lang.Throwable -> L88
            if (r7 == 0) goto L35
            java.lang.String r7 = "LruBitmapPool"
            java.lang.String r8 = "Size mismatch, resetting"
            android.util.Log.w(r7, r8)     // Catch: java.lang.Throwable -> L88
            r6.m10708h()     // Catch: java.lang.Throwable -> L88
        L35:
            r7 = 0
            r6.f18632f = r7     // Catch: java.lang.Throwable -> L88
            monitor-exit(r6)
            return
        L3b:
            n2.i$a r0 = r6.f18630d     // Catch: java.lang.Throwable -> L88
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L88
            long r2 = r6.f18632f     // Catch: java.lang.Throwable -> L88
            n2.j r0 = r6.f18627a     // Catch: java.lang.Throwable -> L88
            n2.l r0 = (p229n2.C4682l) r0     // Catch: java.lang.Throwable -> L88
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L88
            int r0 = p106g3.C2238j.m5844d(r1)     // Catch: java.lang.Throwable -> L88
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L88
            long r2 = r2 - r4
            r6.f18632f = r2     // Catch: java.lang.Throwable -> L88
            int r0 = r6.f18636j     // Catch: java.lang.Throwable -> L88
            int r0 = r0 + 1
            r6.f18636j = r0     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = "LruBitmapPool"
            r2 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L7e
            java.lang.String r0 = "LruBitmapPool"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r2.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r3 = "Evicting bitmap="
            r2.append(r3)     // Catch: java.lang.Throwable -> L88
            n2.j r3 = r6.f18627a     // Catch: java.lang.Throwable -> L88
            n2.l r3 = (p229n2.C4682l) r3     // Catch: java.lang.Throwable -> L88
            java.lang.String r3 = r3.m10715e(r1)     // Catch: java.lang.Throwable -> L88
            r2.append(r3)     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L88
            android.util.Log.d(r0, r2)     // Catch: java.lang.Throwable -> L88
        L7e:
            r6.m10707g()     // Catch: java.lang.Throwable -> L88
            r1.recycle()     // Catch: java.lang.Throwable -> L88
            goto L1
        L86:
            monitor-exit(r6)
            return
        L88:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }
}
