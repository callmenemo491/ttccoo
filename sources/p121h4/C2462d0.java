package p121h4;

/* renamed from: h4.d0 */
/* loaded from: classes.dex */
public final class C2462d0 implements p121h4.InterfaceC2465f {

    /* renamed from: b */
    public int f11009b;

    /* renamed from: c */
    public float f11010c;

    /* renamed from: d */
    public float f11011d;

    /* renamed from: e */
    public p121h4.InterfaceC2465f.a f11012e;

    /* renamed from: f */
    public p121h4.InterfaceC2465f.a f11013f;

    /* renamed from: g */
    public p121h4.InterfaceC2465f.a f11014g;

    /* renamed from: h */
    public p121h4.InterfaceC2465f.a f11015h;

    /* renamed from: i */
    public boolean f11016i;

    /* renamed from: j */
    public p121h4.C2460c0 f11017j;

    /* renamed from: k */
    public java.nio.ByteBuffer f11018k;

    /* renamed from: l */
    public java.nio.ShortBuffer f11019l;

    /* renamed from: m */
    public java.nio.ByteBuffer f11020m;

    /* renamed from: n */
    public long f11021n;

    /* renamed from: o */
    public long f11022o;

    /* renamed from: p */
    public boolean f11023p;

    public C2462d0() {
            r2 = this;
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.f11010c = r0
            r2.f11011d = r0
            h4.f$a r0 = p121h4.InterfaceC2465f.a.f11037e
            r2.f11012e = r0
            r2.f11013f = r0
            r2.f11014g = r0
            r2.f11015h = r0
            java.nio.ByteBuffer r0 = p121h4.InterfaceC2465f.f11036a
            r2.f11018k = r0
            java.nio.ShortBuffer r1 = r0.asShortBuffer()
            r2.f11019l = r1
            r2.f11020m = r0
            r0 = -1
            r2.f11009b = r0
            return
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: a */
    public boolean mo6240a() {
            r3 = this;
            h4.f$a r0 = r3.f11013f
            int r0 = r0.f11038a
            r1 = -1
            if (r0 == r1) goto L2e
            float r0 = r3.f11010c
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            r2 = 953267991(0x38d1b717, float:1.0E-4)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2c
            float r0 = r3.f11011d
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2c
            h4.f$a r0 = r3.f11013f
            int r0 = r0.f11038a
            h4.f$a r1 = r3.f11012e
            int r1 = r1.f11038a
            if (r0 == r1) goto L2e
        L2c:
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            return r0
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: b */
    public void mo6257b() {
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.f11010c = r0
            r3.f11011d = r0
            h4.f$a r0 = p121h4.InterfaceC2465f.a.f11037e
            r3.f11012e = r0
            r3.f11013f = r0
            r3.f11014g = r0
            r3.f11015h = r0
            java.nio.ByteBuffer r0 = p121h4.InterfaceC2465f.f11036a
            r3.f11018k = r0
            java.nio.ShortBuffer r1 = r0.asShortBuffer()
            r3.f11019l = r1
            r3.f11020m = r0
            r0 = -1
            r3.f11009b = r0
            r0 = 0
            r3.f11016i = r0
            r1 = 0
            r3.f11017j = r1
            r1 = 0
            r3.f11021n = r1
            r3.f11022o = r1
            r3.f11023p = r0
            return
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: c */
    public java.nio.ByteBuffer mo6258c() {
            r7 = this;
            h4.c0 r0 = r7.f11017j
            if (r0 == 0) goto L6d
            int r1 = r0.f10993m
            int r2 = r0.f10982b
            int r1 = r1 * r2
            int r1 = r1 * 2
            if (r1 <= 0) goto L6d
            java.nio.ByteBuffer r2 = r7.f11018k
            int r2 = r2.capacity()
            if (r2 >= r1) goto L2b
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f11018k = r2
            java.nio.ShortBuffer r2 = r2.asShortBuffer()
            r7.f11019l = r2
            goto L35
        L2b:
            java.nio.ByteBuffer r2 = r7.f11018k
            r2.clear()
            java.nio.ShortBuffer r2 = r7.f11019l
            r2.clear()
        L35:
            java.nio.ShortBuffer r2 = r7.f11019l
            int r3 = r2.remaining()
            int r4 = r0.f10982b
            int r3 = r3 / r4
            int r4 = r0.f10993m
            int r3 = java.lang.Math.min(r3, r4)
            short[] r4 = r0.f10992l
            int r5 = r0.f10982b
            int r5 = r5 * r3
            r6 = 0
            r2.put(r4, r6, r5)
            int r2 = r0.f10993m
            int r2 = r2 - r3
            r0.f10993m = r2
            short[] r4 = r0.f10992l
            int r0 = r0.f10982b
            int r3 = r3 * r0
            int r2 = r2 * r0
            java.lang.System.arraycopy(r4, r3, r4, r6, r2)
            long r2 = r7.f11022o
            long r4 = (long) r1
            long r2 = r2 + r4
            r7.f11022o = r2
            java.nio.ByteBuffer r0 = r7.f11018k
            r0.limit(r1)
            java.nio.ByteBuffer r0 = r7.f11018k
            r7.f11020m = r0
        L6d:
            java.nio.ByteBuffer r0 = r7.f11020m
            java.nio.ByteBuffer r1 = p121h4.InterfaceC2465f.f11036a
            r7.f11020m = r1
            return r0
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: d */
    public boolean mo6259d() {
            r2 = this;
            boolean r0 = r2.f11023p
            if (r0 == 0) goto L14
            h4.c0 r0 = r2.f11017j
            if (r0 == 0) goto L12
            int r1 = r0.f10993m
            int r0 = r0.f10982b
            int r1 = r1 * r0
            int r1 = r1 * 2
            if (r1 != 0) goto L14
        L12:
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: e */
    public void mo6260e() {
            r8 = this;
            h4.c0 r0 = r8.f11017j
            if (r0 == 0) goto L54
            int r1 = r0.f10991k
            float r2 = r0.f10983c
            float r3 = r0.f10984d
            float r2 = r2 / r3
            float r4 = r0.f10985e
            float r4 = r4 * r3
            int r3 = r0.f10993m
            float r5 = (float) r1
            float r5 = r5 / r2
            int r2 = r0.f10995o
            float r2 = (float) r2
            float r5 = r5 + r2
            float r5 = r5 / r4
            r2 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r2
            int r2 = (int) r5
            int r3 = r3 + r2
            short[] r2 = r0.f10990j
            int r4 = r0.f10988h
            int r4 = r4 * 2
            int r4 = r4 + r1
            short[] r2 = r0.m6252c(r2, r1, r4)
            r0.f10990j = r2
            r2 = 0
            r4 = 0
        L2c:
            int r5 = r0.f10988h
            int r5 = r5 * 2
            int r6 = r0.f10982b
            int r7 = r5 * r6
            if (r4 >= r7) goto L40
            short[] r5 = r0.f10990j
            int r6 = r6 * r1
            int r6 = r6 + r4
            r5[r6] = r2
            int r4 = r4 + 1
            goto L2c
        L40:
            int r1 = r0.f10991k
            int r5 = r5 + r1
            r0.f10991k = r5
            r0.m6254f()
            int r1 = r0.f10993m
            if (r1 <= r3) goto L4e
            r0.f10993m = r3
        L4e:
            r0.f10991k = r2
            r0.f10998r = r2
            r0.f10995o = r2
        L54:
            r0 = 1
            r8.f11023p = r0
            return
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: f */
    public p121h4.InterfaceC2465f.a mo6261f(p121h4.InterfaceC2465f.a r4) {
            r3 = this;
            int r0 = r4.f11040c
            r1 = 2
            if (r0 != r1) goto L1b
            int r0 = r3.f11009b
            r2 = -1
            if (r0 != r2) goto Lc
            int r0 = r4.f11038a
        Lc:
            r3.f11012e = r4
            h4.f$a r2 = new h4.f$a
            int r4 = r4.f11039b
            r2.<init>(r0, r4, r1)
            r3.f11013f = r2
            r4 = 1
            r3.f11016i = r4
            return r2
        L1b:
            h4.f$b r0 = new h4.f$b
            r0.<init>(r4)
            throw r0
    }

    @Override // p121h4.InterfaceC2465f
    public void flush() {
            r10 = this;
            boolean r0 = r10.mo6240a()
            r1 = 0
            if (r0 == 0) goto L3e
            h4.f$a r0 = r10.f11012e
            r10.f11014g = r0
            h4.f$a r2 = r10.f11013f
            r10.f11015h = r2
            boolean r3 = r10.f11016i
            if (r3 == 0) goto L26
            h4.c0 r3 = new h4.c0
            int r5 = r0.f11038a
            int r6 = r0.f11039b
            float r7 = r10.f11010c
            float r8 = r10.f11011d
            int r9 = r2.f11038a
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r10.f11017j = r3
            goto L3e
        L26:
            h4.c0 r0 = r10.f11017j
            if (r0 == 0) goto L3e
            r0.f10991k = r1
            r0.f10993m = r1
            r0.f10995o = r1
            r0.f10996p = r1
            r0.f10997q = r1
            r0.f10998r = r1
            r0.f10999s = r1
            r0.f11000t = r1
            r0.f11001u = r1
            r0.f11002v = r1
        L3e:
            java.nio.ByteBuffer r0 = p121h4.InterfaceC2465f.f11036a
            r10.f11020m = r0
            r2 = 0
            r10.f11021n = r2
            r10.f11022o = r2
            r10.f11023p = r1
            return
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: g */
    public void mo6237g(java.nio.ByteBuffer r9) {
            r8 = this;
            boolean r0 = r9.hasRemaining()
            if (r0 != 0) goto L7
            return
        L7:
            h4.c0 r0 = r8.f11017j
            java.util.Objects.requireNonNull(r0)
            java.nio.ShortBuffer r1 = r9.asShortBuffer()
            int r2 = r9.remaining()
            long r3 = r8.f11021n
            long r5 = (long) r2
            long r3 = r3 + r5
            r8.f11021n = r3
            int r3 = r1.remaining()
            int r4 = r0.f10982b
            int r3 = r3 / r4
            int r4 = r4 * r3
            int r4 = r4 * 2
            short[] r5 = r0.f10990j
            int r6 = r0.f10991k
            short[] r5 = r0.m6252c(r5, r6, r3)
            r0.f10990j = r5
            int r6 = r0.f10991k
            int r7 = r0.f10982b
            int r6 = r6 * r7
            int r4 = r4 / 2
            r1.get(r5, r6, r4)
            int r1 = r0.f10991k
            int r1 = r1 + r3
            r0.f10991k = r1
            r0.m6254f()
            int r0 = r9.position()
            int r0 = r0 + r2
            r9.position(r0)
            return
    }
}
