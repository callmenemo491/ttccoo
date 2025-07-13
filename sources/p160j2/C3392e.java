package p160j2;

/* renamed from: j2.e */
/* loaded from: classes.dex */
public class C3392e implements p160j2.InterfaceC3388a {

    /* renamed from: a */
    public int[] f14571a;

    /* renamed from: b */
    public final int[] f14572b;

    /* renamed from: c */
    public final p160j2.InterfaceC3388a.a f14573c;

    /* renamed from: d */
    public java.nio.ByteBuffer f14574d;

    /* renamed from: e */
    public byte[] f14575e;

    /* renamed from: f */
    public short[] f14576f;

    /* renamed from: g */
    public byte[] f14577g;

    /* renamed from: h */
    public byte[] f14578h;

    /* renamed from: i */
    public byte[] f14579i;

    /* renamed from: j */
    public int[] f14580j;

    /* renamed from: k */
    public int f14581k;

    /* renamed from: l */
    public p160j2.C3390c f14582l;

    /* renamed from: m */
    public android.graphics.Bitmap f14583m;

    /* renamed from: n */
    public boolean f14584n;

    /* renamed from: o */
    public int f14585o;

    /* renamed from: p */
    public int f14586p;

    /* renamed from: q */
    public int f14587q;

    /* renamed from: r */
    public int f14588r;

    /* renamed from: s */
    public java.lang.Boolean f14589s;

    /* renamed from: t */
    public android.graphics.Bitmap.Config f14590t;

    public C3392e(p160j2.InterfaceC3388a.a r2, p160j2.C3390c r3, java.nio.ByteBuffer r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r0]
            r1.f14572b = r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r1.f14590t = r0
            r1.f14573c = r2
            j2.c r2 = new j2.c
            r2.<init>()
            r1.f14582l = r2
            monitor-enter(r1)
            if (r5 <= 0) goto L88
            int r2 = java.lang.Integer.highestOneBit(r5)     // Catch: java.lang.Throwable -> L9f
            r5 = 0
            r1.f14585o = r5     // Catch: java.lang.Throwable -> L9f
            r1.f14582l = r3     // Catch: java.lang.Throwable -> L9f
            r0 = -1
            r1.f14581k = r0     // Catch: java.lang.Throwable -> L9f
            java.nio.ByteBuffer r4 = r4.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L9f
            r1.f14574d = r4     // Catch: java.lang.Throwable -> L9f
            r4.position(r5)     // Catch: java.lang.Throwable -> L9f
            java.nio.ByteBuffer r4 = r1.f14574d     // Catch: java.lang.Throwable -> L9f
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L9f
            r4.order(r0)     // Catch: java.lang.Throwable -> L9f
            r1.f14584n = r5     // Catch: java.lang.Throwable -> L9f
            java.util.List<j2.b> r4 = r3.f14560e     // Catch: java.lang.Throwable -> L9f
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L9f
        L3d:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L9f
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L9f
            j2.b r5 = (p160j2.C3389b) r5     // Catch: java.lang.Throwable -> L9f
            int r5 = r5.f14551g     // Catch: java.lang.Throwable -> L9f
            r0 = 3
            if (r5 != r0) goto L3d
            r4 = 1
            r1.f14584n = r4     // Catch: java.lang.Throwable -> L9f
        L51:
            r1.f14586p = r2     // Catch: java.lang.Throwable -> L9f
            int r4 = r3.f14561f     // Catch: java.lang.Throwable -> L9f
            int r5 = r4 / r2
            r1.f14588r = r5     // Catch: java.lang.Throwable -> L9f
            int r3 = r3.f14562g     // Catch: java.lang.Throwable -> L9f
            int r2 = r3 / r2
            r1.f14587q = r2     // Catch: java.lang.Throwable -> L9f
            j2.a$a r2 = r1.f14573c     // Catch: java.lang.Throwable -> L9f
            int r4 = r4 * r3
            x2.b r2 = (p404x2.C6913b) r2     // Catch: java.lang.Throwable -> L9f
            byte[] r2 = r2.m14018a(r4)     // Catch: java.lang.Throwable -> L9f
            r1.f14579i = r2     // Catch: java.lang.Throwable -> L9f
            j2.a$a r2 = r1.f14573c     // Catch: java.lang.Throwable -> L9f
            int r3 = r1.f14588r     // Catch: java.lang.Throwable -> L9f
            int r4 = r1.f14587q     // Catch: java.lang.Throwable -> L9f
            int r3 = r3 * r4
            x2.b r2 = (p404x2.C6913b) r2     // Catch: java.lang.Throwable -> L9f
            n2.b r2 = r2.f26902b     // Catch: java.lang.Throwable -> L9f
            if (r2 != 0) goto L7c
            int[] r2 = new int[r3]     // Catch: java.lang.Throwable -> L9f
            goto L84
        L7c:
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Object r2 = r2.mo10688e(r3, r4)     // Catch: java.lang.Throwable -> L9f
            int[] r2 = (int[]) r2     // Catch: java.lang.Throwable -> L9f
        L84:
            r1.f14580j = r2     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r1)
            return
        L88:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r4 = "Sample size must be >=0, not: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L9f
            r3.append(r5)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L9f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L9f
            throw r2     // Catch: java.lang.Throwable -> L9f
        L9f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // p160j2.InterfaceC3388a
    /* renamed from: a */
    public int mo7759a() {
            r1 = this;
            int r0 = r1.f14581k
            return r0
    }

    @Override // p160j2.InterfaceC3388a
    /* renamed from: b */
    public synchronized android.graphics.Bitmap mo7760b() {
            r8 = this;
            monitor-enter(r8)
            j2.c r0 = r8.f14582l     // Catch: java.lang.Throwable -> Lec
            int r0 = r0.f14558c     // Catch: java.lang.Throwable -> Lec
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto Ld
            int r0 = r8.f14581k     // Catch: java.lang.Throwable -> Lec
            if (r0 >= 0) goto L3b
        Ld:
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Lec
            if (r0 == 0) goto L39
            java.lang.String r0 = "e"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lec
            r3.<init>()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch: java.lang.Throwable -> Lec
            j2.c r4 = r8.f14582l     // Catch: java.lang.Throwable -> Lec
            int r4 = r4.f14558c     // Catch: java.lang.Throwable -> Lec
            r3.append(r4)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch: java.lang.Throwable -> Lec
            int r4 = r8.f14581k     // Catch: java.lang.Throwable -> Lec
            r3.append(r4)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lec
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> Lec
        L39:
            r8.f14585o = r2     // Catch: java.lang.Throwable -> Lec
        L3b:
            int r0 = r8.f14585o     // Catch: java.lang.Throwable -> Lec
            r3 = 0
            if (r0 == r2) goto Lca
            r4 = 2
            if (r0 != r4) goto L45
            goto Lca
        L45:
            r0 = 0
            r8.f14585o = r0     // Catch: java.lang.Throwable -> Lec
            byte[] r5 = r8.f14575e     // Catch: java.lang.Throwable -> Lec
            if (r5 != 0) goto L58
            j2.a$a r5 = r8.f14573c     // Catch: java.lang.Throwable -> Lec
            r6 = 255(0xff, float:3.57E-43)
            x2.b r5 = (p404x2.C6913b) r5     // Catch: java.lang.Throwable -> Lec
            byte[] r5 = r5.m14018a(r6)     // Catch: java.lang.Throwable -> Lec
            r8.f14575e = r5     // Catch: java.lang.Throwable -> Lec
        L58:
            j2.c r5 = r8.f14582l     // Catch: java.lang.Throwable -> Lec
            java.util.List<j2.b> r5 = r5.f14560e     // Catch: java.lang.Throwable -> Lec
            int r6 = r8.f14581k     // Catch: java.lang.Throwable -> Lec
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> Lec
            j2.b r5 = (p160j2.C3389b) r5     // Catch: java.lang.Throwable -> Lec
            int r6 = r8.f14581k     // Catch: java.lang.Throwable -> Lec
            int r6 = r6 - r2
            if (r6 < 0) goto L74
            j2.c r7 = r8.f14582l     // Catch: java.lang.Throwable -> Lec
            java.util.List<j2.b> r7 = r7.f14560e     // Catch: java.lang.Throwable -> Lec
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> Lec
            j2.b r6 = (p160j2.C3389b) r6     // Catch: java.lang.Throwable -> Lec
            goto L75
        L74:
            r6 = r3
        L75:
            int[] r7 = r5.f14555k     // Catch: java.lang.Throwable -> Lec
            if (r7 == 0) goto L7a
            goto L7e
        L7a:
            j2.c r7 = r8.f14582l     // Catch: java.lang.Throwable -> Lec
            int[] r7 = r7.f14556a     // Catch: java.lang.Throwable -> Lec
        L7e:
            r8.f14571a = r7     // Catch: java.lang.Throwable -> Lec
            if (r7 != 0) goto La6
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Lec
            if (r0 == 0) goto La2
            java.lang.String r0 = "e"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lec
            r1.<init>()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch: java.lang.Throwable -> Lec
            int r4 = r8.f14581k     // Catch: java.lang.Throwable -> Lec
            r1.append(r4)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lec
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> Lec
        La2:
            r8.f14585o = r2     // Catch: java.lang.Throwable -> Lec
            monitor-exit(r8)
            return r3
        La6:
            boolean r1 = r5.f14550f     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto Lc4
            int[] r1 = r8.f14572b     // Catch: java.lang.Throwable -> Lec
            int r2 = r7.length     // Catch: java.lang.Throwable -> Lec
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch: java.lang.Throwable -> Lec
            int[] r1 = r8.f14572b     // Catch: java.lang.Throwable -> Lec
            r8.f14571a = r1     // Catch: java.lang.Throwable -> Lec
            int r2 = r5.f14552h     // Catch: java.lang.Throwable -> Lec
            r1[r2] = r0     // Catch: java.lang.Throwable -> Lec
            int r0 = r5.f14551g     // Catch: java.lang.Throwable -> Lec
            if (r0 != r4) goto Lc4
            int r0 = r8.f14581k     // Catch: java.lang.Throwable -> Lec
            if (r0 != 0) goto Lc4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lec
            r8.f14589s = r0     // Catch: java.lang.Throwable -> Lec
        Lc4:
            android.graphics.Bitmap r0 = r8.m7774i(r5, r6)     // Catch: java.lang.Throwable -> Lec
            monitor-exit(r8)
            return r0
        Lca:
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Lec
            if (r0 == 0) goto Lea
            java.lang.String r0 = "e"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lec
            r1.<init>()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch: java.lang.Throwable -> Lec
            int r2 = r8.f14585o     // Catch: java.lang.Throwable -> Lec
            r1.append(r2)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lec
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> Lec
        Lea:
            monitor-exit(r8)
            return r3
        Lec:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
    }

    @Override // p160j2.InterfaceC3388a
    /* renamed from: c */
    public void mo7761c() {
            r2 = this;
            int r0 = r2.f14581k
            int r0 = r0 + 1
            j2.c r1 = r2.f14582l
            int r1 = r1.f14558c
            int r0 = r0 % r1
            r2.f14581k = r0
            return
    }

    @Override // p160j2.InterfaceC3388a
    public void clear() {
            r3 = this;
            r0 = 0
            r3.f14582l = r0
            byte[] r1 = r3.f14579i
            if (r1 == 0) goto L13
            j2.a$a r2 = r3.f14573c
            x2.b r2 = (p404x2.C6913b) r2
            n2.b r2 = r2.f26902b
            if (r2 != 0) goto L10
            goto L13
        L10:
            r2.mo10687d(r1)
        L13:
            int[] r1 = r3.f14580j
            if (r1 == 0) goto L23
            j2.a$a r2 = r3.f14573c
            x2.b r2 = (p404x2.C6913b) r2
            n2.b r2 = r2.f26902b
            if (r2 != 0) goto L20
            goto L23
        L20:
            r2.mo10687d(r1)
        L23:
            android.graphics.Bitmap r1 = r3.f14583m
            if (r1 == 0) goto L30
            j2.a$a r2 = r3.f14573c
            x2.b r2 = (p404x2.C6913b) r2
            n2.c r2 = r2.f26901a
            r2.mo10694f(r1)
        L30:
            r3.f14583m = r0
            r3.f14574d = r0
            r3.f14589s = r0
            byte[] r0 = r3.f14575e
            if (r0 == 0) goto L46
            j2.a$a r1 = r3.f14573c
            x2.b r1 = (p404x2.C6913b) r1
            n2.b r1 = r1.f26902b
            if (r1 != 0) goto L43
            goto L46
        L43:
            r1.mo10687d(r0)
        L46:
            return
    }

    @Override // p160j2.InterfaceC3388a
    /* renamed from: d */
    public int mo7762d() {
            r1 = this;
            j2.c r0 = r1.f14582l
            int r0 = r0.f14558c
            return r0
    }

    @Override // p160j2.InterfaceC3388a
    /* renamed from: e */
    public int mo7763e() {
            r3 = this;
            j2.c r0 = r3.f14582l
            int r1 = r0.f14558c
            if (r1 <= 0) goto L1c
            int r2 = r3.f14581k
            if (r2 >= 0) goto Lb
            goto L1c
        Lb:
            if (r2 < 0) goto L1a
            if (r2 >= r1) goto L1a
            java.util.List<j2.b> r0 = r0.f14560e
            java.lang.Object r0 = r0.get(r2)
            j2.b r0 = (p160j2.C3389b) r0
            int r0 = r0.f14553i
            goto L1b
        L1a:
            r0 = -1
        L1b:
            return r0
        L1c:
            r0 = 0
            return r0
    }

    @Override // p160j2.InterfaceC3388a
    /* renamed from: f */
    public int mo7764f() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f14574d
            int r0 = r0.limit()
            byte[] r1 = r2.f14579i
            int r1 = r1.length
            int r0 = r0 + r1
            int[] r1 = r2.f14580j
            int r1 = r1.length
            int r1 = r1 * 4
            int r1 = r1 + r0
            return r1
    }

    /* renamed from: g */
    public final android.graphics.Bitmap m7772g() {
            r4 = this;
            java.lang.Boolean r0 = r4.f14589s
            if (r0 == 0) goto Le
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb
            goto Le
        Lb:
            android.graphics.Bitmap$Config r0 = r4.f14590t
            goto L10
        Le:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
        L10:
            j2.a$a r1 = r4.f14573c
            int r2 = r4.f14588r
            int r3 = r4.f14587q
            x2.b r1 = (p404x2.C6913b) r1
            n2.c r1 = r1.f26901a
            android.graphics.Bitmap r0 = r1.mo10692d(r2, r3, r0)
            r1 = 1
            r0.setHasAlpha(r1)
            return r0
    }

    @Override // p160j2.InterfaceC3388a
    public java.nio.ByteBuffer getData() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f14574d
            return r0
    }

    /* renamed from: h */
    public void m7773h(android.graphics.Bitmap.Config r4) {
            r3 = this;
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            if (r4 == r0) goto L34
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            if (r4 != r0) goto L9
            goto L34
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported format: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", must be one of "
            r1.append(r4)
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            r1.append(r4)
            java.lang.String r4 = " or "
            r1.append(r4)
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L34:
            r3.f14590t = r4
            return
    }

    /* renamed from: i */
    public final android.graphics.Bitmap m7774i(p160j2.C3389b r36, p160j2.C3389b r37) {
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            int[] r10 = r0.f14580j
            r11 = 0
            if (r2 != 0) goto L1e
            android.graphics.Bitmap r3 = r0.f14583m
            if (r3 == 0) goto L18
            j2.a$a r4 = r0.f14573c
            x2.b r4 = (p404x2.C6913b) r4
            n2.c r4 = r4.f26901a
            r4.mo10694f(r3)
        L18:
            r3 = 0
            r0.f14583m = r3
            java.util.Arrays.fill(r10, r11)
        L1e:
            r12 = 3
            if (r2 == 0) goto L2c
            int r3 = r2.f14551g
            if (r3 != r12) goto L2c
            android.graphics.Bitmap r3 = r0.f14583m
            if (r3 != 0) goto L2c
            java.util.Arrays.fill(r10, r11)
        L2c:
            r13 = 2
            if (r2 == 0) goto L80
            int r3 = r2.f14551g
            if (r3 <= 0) goto L80
            if (r3 != r13) goto L6e
            boolean r3 = r1.f14550f
            if (r3 != 0) goto L47
            j2.c r3 = r0.f14582l
            int r4 = r3.f14566k
            int[] r5 = r1.f14555k
            if (r5 == 0) goto L48
            int r3 = r3.f14565j
            int r5 = r1.f14552h
            if (r3 != r5) goto L48
        L47:
            r4 = 0
        L48:
            int r3 = r2.f14548d
            int r5 = r0.f14586p
            int r3 = r3 / r5
            int r6 = r2.f14546b
            int r6 = r6 / r5
            int r7 = r2.f14547c
            int r7 = r7 / r5
            int r2 = r2.f14545a
            int r2 = r2 / r5
            int r5 = r0.f14588r
            int r6 = r6 * r5
            int r6 = r6 + r2
            int r3 = r3 * r5
            int r3 = r3 + r6
        L5e:
            if (r6 >= r3) goto L80
            int r2 = r6 + r7
            r5 = r6
        L63:
            if (r5 >= r2) goto L6a
            r10[r5] = r4
            int r5 = r5 + 1
            goto L63
        L6a:
            int r2 = r0.f14588r
            int r6 = r6 + r2
            goto L5e
        L6e:
            if (r3 != r12) goto L80
            android.graphics.Bitmap r2 = r0.f14583m
            if (r2 == 0) goto L80
            r4 = 0
            int r8 = r0.f14588r
            r6 = 0
            r7 = 0
            int r9 = r0.f14587q
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L80:
            java.nio.ByteBuffer r2 = r0.f14574d
            int r3 = r1.f14554j
            r2.position(r3)
            int r2 = r1.f14547c
            int r3 = r1.f14548d
            int r2 = r2 * r3
            byte[] r3 = r0.f14579i
            if (r3 == 0) goto L94
            int r3 = r3.length
            if (r3 >= r2) goto L9e
        L94:
            j2.a$a r3 = r0.f14573c
            x2.b r3 = (p404x2.C6913b) r3
            byte[] r3 = r3.m14018a(r2)
            r0.f14579i = r3
        L9e:
            byte[] r3 = r0.f14579i
            short[] r4 = r0.f14576f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto Laa
            short[] r4 = new short[r5]
            r0.f14576f = r4
        Laa:
            short[] r4 = r0.f14576f
            byte[] r6 = r0.f14577g
            if (r6 != 0) goto Lb4
            byte[] r6 = new byte[r5]
            r0.f14577g = r6
        Lb4:
            byte[] r6 = r0.f14577g
            byte[] r7 = r0.f14578h
            if (r7 != 0) goto Lc0
            r7 = 4097(0x1001, float:5.741E-42)
            byte[] r7 = new byte[r7]
            r0.f14578h = r7
        Lc0:
            byte[] r7 = r0.f14578h
            java.nio.ByteBuffer r8 = r0.f14574d
            byte r8 = r8.get()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 1
            int r14 = r9 << r8
            int r15 = r14 + 1
            int r16 = r14 + 2
            int r8 = r8 + r9
            int r17 = r9 << r8
            r13 = -1
            int r17 = r17 + (-1)
            r5 = 0
        Ld8:
            if (r5 >= r14) goto Le3
            r4[r5] = r11
            byte r13 = (byte) r5
            r6[r5] = r13
            int r5 = r5 + 1
            r13 = -1
            goto Ld8
        Le3:
            byte[] r5 = r0.f14575e
            r12 = r0
            r25 = r8
            r24 = r16
            r28 = r17
            r9 = 0
            r13 = -1
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r29 = 0
        Lfc:
            r30 = 8
            if (r9 >= r2) goto L1f7
            if (r20 != 0) goto L139
            java.nio.ByteBuffer r11 = r12.f14574d
            byte r11 = r11.get()
            r11 = r11 & 255(0xff, float:3.57E-43)
            if (r11 > 0) goto L115
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r13
            goto L12d
        L115:
            r31 = r8
            java.nio.ByteBuffer r8 = r12.f14574d
            r32 = r9
            byte[] r9 = r12.f14575e
            r33 = r13
            int r13 = r8.remaining()
            int r13 = java.lang.Math.min(r11, r13)
            r34 = r10
            r10 = 0
            r8.get(r9, r10, r13)
        L12d:
            if (r11 > 0) goto L134
            r8 = 3
            r12.f14585o = r8
            goto L1f9
        L134:
            r20 = r11
            r21 = 0
            goto L141
        L139:
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r13
        L141:
            r8 = r5[r21]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r22
            int r23 = r23 + r8
            int r22 = r22 + 8
            r8 = 1
            int r21 = r21 + 1
            r8 = -1
            int r20 = r20 + (-1)
            r10 = r22
            r11 = r24
            r8 = r25
            r9 = r32
            r13 = r33
            r22 = r5
            r5 = r26
        L15f:
            if (r10 < r8) goto L1e1
            r24 = r12
            r12 = r23 & r28
            int r23 = r23 >> r8
            int r10 = r10 - r8
            if (r12 != r14) goto L17b
            r25 = r10
            r11 = r16
            r28 = r17
            r12 = r24
            r8 = r31
            r13 = -1
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            goto L1db
        L17b:
            if (r12 != r15) goto L185
            r12 = r24
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            goto L1e6
        L185:
            r25 = r10
            r10 = -1
            if (r13 != r10) goto L197
            r5 = r6[r12]
            r3[r27] = r5
            int r27 = r27 + 1
            int r9 = r9 + 1
            r24 = r12
            r5 = 4096(0x1000, float:5.74E-42)
            goto L1d9
        L197:
            if (r12 < r11) goto L1a0
            byte r5 = (byte) r5
            r7[r29] = r5
            int r29 = r29 + 1
            r5 = r13
            goto L1a1
        L1a0:
            r5 = r12
        L1a1:
            if (r5 < r14) goto L1ac
            r10 = r6[r5]
            r7[r29] = r10
            int r29 = r29 + 1
            short r5 = r4[r5]
            goto L1a1
        L1ac:
            r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r5
            r3[r27] = r10
        L1b3:
            r19 = 1
            int r27 = r27 + 1
            int r9 = r9 + 1
            if (r29 <= 0) goto L1c2
            int r29 = r29 + (-1)
            r24 = r7[r29]
            r3[r27] = r24
            goto L1b3
        L1c2:
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            if (r11 >= r5) goto L1d9
            short r13 = (short) r13
            r4[r11] = r13
            r6[r11] = r10
            int r11 = r11 + 1
            r10 = r11 & r28
            if (r10 != 0) goto L1d9
            if (r11 >= r5) goto L1d9
            int r8 = r8 + 1
            int r28 = r28 + r11
        L1d9:
            r13 = r12
            r12 = r0
        L1db:
            r5 = r24
            r10 = r25
            goto L15f
        L1e1:
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            r12 = r0
        L1e6:
            r25 = r8
            r5 = r22
            r26 = r24
            r8 = r31
            r22 = r10
            r24 = r11
            r10 = r34
            r11 = 0
            goto Lfc
        L1f7:
            r34 = r10
        L1f9:
            r11 = r27
            r10 = 0
            java.util.Arrays.fill(r3, r11, r2, r10)
            boolean r2 = r1.f14549e
            if (r2 != 0) goto L276
            int r2 = r0.f14586p
            r3 = 1
            if (r2 == r3) goto L20a
            goto L276
        L20a:
            int[] r2 = r0.f14580j
            int r3 = r1.f14548d
            int r4 = r1.f14546b
            int r5 = r1.f14547c
            int r6 = r1.f14545a
            int r7 = r0.f14581k
            if (r7 != 0) goto L21a
            r7 = 1
            goto L21b
        L21a:
            r7 = 0
        L21b:
            int r8 = r0.f14588r
            byte[] r9 = r0.f14579i
            int[] r11 = r0.f14571a
            r12 = -1
            r13 = 0
        L223:
            if (r13 >= r3) goto L258
            int r14 = r13 + r4
            int r14 = r14 * r8
            int r15 = r14 + r6
            int r10 = r15 + r5
            int r14 = r14 + r8
            if (r14 >= r10) goto L231
            r10 = r14
        L231:
            int r14 = r1.f14547c
            int r14 = r14 * r13
        L235:
            r16 = r3
            if (r15 >= r10) goto L252
            r3 = r9[r14]
            r17 = r4
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 == r12) goto L249
            r4 = r11[r4]
            if (r4 == 0) goto L248
            r2[r15] = r4
            goto L249
        L248:
            r12 = r3
        L249:
            int r14 = r14 + 1
            int r15 = r15 + 1
            r3 = r16
            r4 = r17
            goto L235
        L252:
            r17 = r4
            int r13 = r13 + 1
            r10 = 0
            goto L223
        L258:
            java.lang.Boolean r2 = r0.f14589s
            if (r2 == 0) goto L262
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L26b
        L262:
            java.lang.Boolean r2 = r0.f14589s
            if (r2 != 0) goto L26d
            if (r7 == 0) goto L26d
            r2 = -1
            if (r12 == r2) goto L26d
        L26b:
            r11 = 1
            goto L26e
        L26d:
            r11 = 0
        L26e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.f14589s = r2
            goto L402
        L276:
            int[] r2 = r0.f14580j
            int r3 = r1.f14548d
            int r4 = r0.f14586p
            int r3 = r3 / r4
            int r5 = r1.f14546b
            int r5 = r5 / r4
            int r6 = r1.f14547c
            int r6 = r6 / r4
            int r7 = r1.f14545a
            int r7 = r7 / r4
            int r8 = r0.f14581k
            if (r8 != 0) goto L28c
            r10 = 1
            goto L28d
        L28c:
            r10 = 0
        L28d:
            int r8 = r0.f14588r
            int r9 = r0.f14587q
            byte[] r11 = r0.f14579i
            int[] r12 = r0.f14571a
            java.lang.Boolean r13 = r0.f14589s
            r14 = r13
            r13 = 0
            r15 = 0
            r16 = 1
            r17 = 8
        L29e:
            r37 = r14
            if (r13 >= r3) goto L3f0
            boolean r14 = r1.f14549e
            if (r14 == 0) goto L2cd
            if (r15 < r3) goto L2c8
            int r14 = r16 + 1
            r20 = r3
            r3 = 2
            if (r14 == r3) goto L2c3
            r3 = 3
            if (r14 == r3) goto L2bc
            r3 = 4
            r16 = r14
            if (r14 == r3) goto L2b8
            goto L2ca
        L2b8:
            r15 = 1
            r17 = 2
            goto L2ca
        L2bc:
            r3 = 4
            r16 = r14
            r15 = 2
            r17 = 4
            goto L2ca
        L2c3:
            r3 = 4
            r16 = r14
            r15 = 4
            goto L2ca
        L2c8:
            r20 = r3
        L2ca:
            int r3 = r15 + r17
            goto L2d1
        L2cd:
            r20 = r3
            r3 = r15
            r15 = r13
        L2d1:
            int r15 = r15 + r5
            r14 = 1
            if (r4 != r14) goto L2d7
            r14 = 1
            goto L2d8
        L2d7:
            r14 = 0
        L2d8:
            if (r15 >= r9) goto L3d0
            int r15 = r15 * r8
            int r18 = r15 + r7
            r21 = r3
            int r3 = r18 + r6
            int r15 = r15 + r8
            if (r15 >= r3) goto L2e6
            r3 = r15
        L2e6:
            int r15 = r13 * r4
            r22 = r5
            int r5 = r1.f14547c
            int r15 = r15 * r5
            if (r14 == 0) goto L310
            r14 = r37
            r5 = r18
        L2f4:
            r23 = r6
            if (r5 >= r3) goto L3c9
            r6 = r11[r15]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r12[r6]
            if (r6 == 0) goto L303
            r2[r5] = r6
            goto L30a
        L303:
            if (r10 == 0) goto L30a
            if (r14 != 0) goto L30a
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r14 = r6
        L30a:
            int r15 = r15 + r4
            int r5 = r5 + 1
            r6 = r23
            goto L2f4
        L310:
            r23 = r6
            int r5 = r3 - r18
            int r5 = r5 * r4
            int r5 = r5 + r15
            r14 = r37
            r6 = r18
        L31b:
            if (r6 >= r3) goto L3c9
            r18 = r3
            int r3 = r1.f14547c
            r29 = r7
            r31 = r8
            r7 = r15
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L330:
            int r8 = r0.f14586p
            int r8 = r8 + r15
            if (r7 >= r8) goto L365
            byte[] r8 = r0.f14579i
            r32 = r9
            int r9 = r8.length
            if (r7 >= r9) goto L367
            if (r7 >= r5) goto L367
            r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f14571a
            r8 = r9[r8]
            if (r8 == 0) goto L360
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L360:
            int r7 = r7 + 1
            r9 = r32
            goto L330
        L365:
            r32 = r9
        L367:
            int r3 = r3 + r15
            r7 = r3
        L369:
            int r8 = r0.f14586p
            int r8 = r8 + r3
            if (r7 >= r8) goto L39a
            byte[] r8 = r0.f14579i
            int r9 = r8.length
            if (r7 >= r9) goto L39a
            if (r7 >= r5) goto L39a
            r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f14571a
            r8 = r9[r8]
            if (r8 == 0) goto L397
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L397:
            int r7 = r7 + 1
            goto L369
        L39a:
            if (r28 != 0) goto L39e
            r3 = 0
            goto L3b0
        L39e:
            int r24 = r24 / r28
            int r3 = r24 << 24
            int r25 = r25 / r28
            int r7 = r25 << 16
            r3 = r3 | r7
            int r26 = r26 / r28
            int r7 = r26 << 8
            r3 = r3 | r7
            int r27 = r27 / r28
            r3 = r3 | r27
        L3b0:
            if (r3 == 0) goto L3b5
            r2[r6] = r3
            goto L3bc
        L3b5:
            if (r10 == 0) goto L3bc
            if (r14 != 0) goto L3bc
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r14 = r3
        L3bc:
            int r15 = r15 + r4
            int r6 = r6 + 1
            r3 = r18
            r7 = r29
            r8 = r31
            r9 = r32
            goto L31b
        L3c9:
            r29 = r7
            r31 = r8
            r32 = r9
            goto L3de
        L3d0:
            r21 = r3
            r22 = r5
            r23 = r6
            r29 = r7
            r31 = r8
            r32 = r9
            r14 = r37
        L3de:
            int r13 = r13 + 1
            r3 = r20
            r15 = r21
            r5 = r22
            r6 = r23
            r7 = r29
            r8 = r31
            r9 = r32
            goto L29e
        L3f0:
            java.lang.Boolean r2 = r0.f14589s
            if (r2 != 0) goto L402
            if (r37 != 0) goto L3f8
            r11 = 0
            goto L3fc
        L3f8:
            boolean r11 = r37.booleanValue()
        L3fc:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.f14589s = r2
        L402:
            boolean r2 = r0.f14584n
            if (r2 == 0) goto L426
            int r1 = r1.f14551g
            if (r1 == 0) goto L40d
            r2 = 1
            if (r1 != r2) goto L426
        L40d:
            android.graphics.Bitmap r1 = r0.f14583m
            if (r1 != 0) goto L417
            android.graphics.Bitmap r1 = r35.m7772g()
            r0.f14583m = r1
        L417:
            android.graphics.Bitmap r1 = r0.f14583m
            r3 = 0
            int r7 = r0.f14588r
            r5 = 0
            r6 = 0
            int r8 = r0.f14587q
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L426:
            android.graphics.Bitmap r9 = r35.m7772g()
            r3 = 0
            int r7 = r0.f14588r
            r5 = 0
            r6 = 0
            int r8 = r0.f14587q
            r1 = r9
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
    }
}
