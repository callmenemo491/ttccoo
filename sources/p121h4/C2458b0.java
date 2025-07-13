package p121h4;

/* renamed from: h4.b0 */
/* loaded from: classes.dex */
public final class C2458b0 extends p121h4.AbstractC2478s {

    /* renamed from: i */
    public final long f10965i;

    /* renamed from: j */
    public final long f10966j;

    /* renamed from: k */
    public final short f10967k;

    /* renamed from: l */
    public int f10968l;

    /* renamed from: m */
    public boolean f10969m;

    /* renamed from: n */
    public byte[] f10970n;

    /* renamed from: o */
    public byte[] f10971o;

    /* renamed from: p */
    public int f10972p;

    /* renamed from: q */
    public int f10973q;

    /* renamed from: r */
    public int f10974r;

    /* renamed from: s */
    public boolean f10975s;

    /* renamed from: t */
    public long f10976t;

    public C2458b0() {
            r2 = this;
            r2.<init>()
            r0 = 1
            p371v5.C6549a.m13288b(r0)
            r0 = 150000(0x249f0, double:7.411E-319)
            r2.f10965i = r0
            r0 = 20000(0x4e20, double:9.8813E-320)
            r2.f10966j = r0
            r0 = 1024(0x400, float:1.435E-42)
            r2.f10967k = r0
            byte[] r0 = p371v5.C6552b0.f25629f
            r2.f10970n = r0
            r2.f10971o = r0
            return
    }

    @Override // p121h4.AbstractC2478s, p121h4.InterfaceC2465f
    /* renamed from: a */
    public boolean mo6240a() {
            r1 = this;
            boolean r0 = r1.f10969m
            return r0
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: g */
    public void mo6237g(java.nio.ByteBuffer r10) {
            r9 = this;
        L0:
            boolean r0 = r10.hasRemaining()
            if (r0 == 0) goto L11a
            java.nio.ByteBuffer r0 = r9.f11120g
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L11a
            int r0 = r9.f10972p
            r1 = 1
            if (r0 == 0) goto Lc0
            r2 = 0
            r3 = 2
            if (r0 == r1) goto L4d
            if (r0 != r3) goto L47
            int r0 = r10.limit()
            int r1 = r9.m6244m(r10)
            r10.limit(r1)
            long r3 = r9.f10976t
            int r5 = r10.remaining()
            int r6 = r9.f10968l
            int r5 = r5 / r6
            long r5 = (long) r5
            long r3 = r3 + r5
            r9.f10976t = r3
            byte[] r3 = r9.f10971o
            int r4 = r9.f10974r
            r9.m6246o(r10, r3, r4)
            if (r1 >= r0) goto L0
            byte[] r1 = r9.f10971o
            int r3 = r9.f10974r
            r9.m6245n(r1, r3)
            r9.f10972p = r2
            r10.limit(r0)
            goto L0
        L47:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L4d:
            int r0 = r10.limit()
            int r1 = r9.m6244m(r10)
            int r4 = r10.position()
            int r4 = r1 - r4
            byte[] r5 = r9.f10970n
            int r6 = r5.length
            int r7 = r9.f10973q
            int r6 = r6 - r7
            if (r1 >= r0) goto L6d
            if (r4 >= r6) goto L6d
            r9.m6245n(r5, r7)
            r9.f10973q = r2
            r9.f10972p = r2
            goto L0
        L6d:
            int r1 = java.lang.Math.min(r4, r6)
            int r4 = r10.position()
            int r4 = r4 + r1
            r10.limit(r4)
            byte[] r4 = r9.f10970n
            int r5 = r9.f10973q
            r10.get(r4, r5, r1)
            int r4 = r9.f10973q
            int r4 = r4 + r1
            r9.f10973q = r4
            byte[] r1 = r9.f10970n
            int r5 = r1.length
            if (r4 != r5) goto Lbb
            boolean r5 = r9.f10975s
            if (r5 == 0) goto La4
            int r4 = r9.f10974r
            r9.m6245n(r1, r4)
            long r4 = r9.f10976t
            int r1 = r9.f10973q
            int r6 = r9.f10974r
            int r6 = r6 * 2
            int r1 = r1 - r6
            int r6 = r9.f10968l
            int r1 = r1 / r6
            long r6 = (long) r1
            long r4 = r4 + r6
            r9.f10976t = r4
            goto Lb0
        La4:
            long r5 = r9.f10976t
            int r1 = r9.f10974r
            int r4 = r4 - r1
            int r1 = r9.f10968l
            int r4 = r4 / r1
            long r7 = (long) r4
            long r5 = r5 + r7
            r9.f10976t = r5
        Lb0:
            byte[] r1 = r9.f10970n
            int r4 = r9.f10973q
            r9.m6246o(r10, r1, r4)
            r9.f10973q = r2
            r9.f10972p = r3
        Lbb:
            r10.limit(r0)
            goto L0
        Lc0:
            int r0 = r10.limit()
            int r2 = r10.position()
            byte[] r3 = r9.f10970n
            int r3 = r3.length
            int r2 = r2 + r3
            int r2 = java.lang.Math.min(r0, r2)
            r10.limit(r2)
            int r2 = r10.limit()
        Ld7:
            int r2 = r2 + (-2)
            int r3 = r10.position()
            if (r2 < r3) goto Lf2
            short r3 = r10.getShort(r2)
            int r3 = java.lang.Math.abs(r3)
            short r4 = r9.f10967k
            if (r3 <= r4) goto Ld7
            int r3 = r9.f10968l
            int r2 = r2 / r3
            int r2 = r2 * r3
            int r2 = r2 + r3
            goto Lf6
        Lf2:
            int r2 = r10.position()
        Lf6:
            int r3 = r10.position()
            if (r2 != r3) goto Lff
            r9.f10972p = r1
            goto L115
        Lff:
            r10.limit(r2)
            int r2 = r10.remaining()
            java.nio.ByteBuffer r3 = r9.m6300l(r2)
            java.nio.ByteBuffer r3 = r3.put(r10)
            r3.flip()
            if (r2 <= 0) goto L115
            r9.f10975s = r1
        L115:
            r10.limit(r0)
            goto L0
        L11a:
            return
    }

    @Override // p121h4.AbstractC2478s
    /* renamed from: h */
    public p121h4.InterfaceC2465f.a mo6238h(p121h4.InterfaceC2465f.a r3) {
            r2 = this;
            int r0 = r3.f11040c
            r1 = 2
            if (r0 != r1) goto Ld
            boolean r0 = r2.f10969m
            if (r0 == 0) goto La
            goto Lc
        La:
            h4.f$a r3 = p121h4.InterfaceC2465f.a.f11037e
        Lc:
            return r3
        Ld:
            h4.f$b r0 = new h4.f$b
            r0.<init>(r3)
            throw r0
    }

    @Override // p121h4.AbstractC2478s
    /* renamed from: i */
    public void mo6241i() {
            r8 = this;
            boolean r0 = r8.f10969m
            if (r0 == 0) goto L34
            h4.f$a r0 = r8.f11115b
            int r1 = r0.f11041d
            r8.f10968l = r1
            long r2 = r8.f10965i
            int r0 = r0.f11038a
            long r4 = (long) r0
            long r2 = r2 * r4
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r6
            int r0 = (int) r2
            int r0 = r0 * r1
            byte[] r2 = r8.f10970n
            int r2 = r2.length
            if (r2 == r0) goto L21
            byte[] r0 = new byte[r0]
            r8.f10970n = r0
        L21:
            long r2 = r8.f10966j
            long r2 = r2 * r4
            long r2 = r2 / r6
            int r0 = (int) r2
            int r0 = r0 * r1
            r8.f10974r = r0
            byte[] r1 = r8.f10971o
            int r1 = r1.length
            if (r1 == r0) goto L34
            byte[] r0 = new byte[r0]
            r8.f10971o = r0
        L34:
            r0 = 0
            r8.f10972p = r0
            r1 = 0
            r8.f10976t = r1
            r8.f10973q = r0
            r8.f10975s = r0
            return
    }

    @Override // p121h4.AbstractC2478s
    /* renamed from: j */
    public void mo6242j() {
            r4 = this;
            int r0 = r4.f10973q
            if (r0 <= 0) goto L9
            byte[] r1 = r4.f10970n
            r4.m6245n(r1, r0)
        L9:
            boolean r0 = r4.f10975s
            if (r0 != 0) goto L18
            long r0 = r4.f10976t
            int r2 = r4.f10974r
            int r3 = r4.f10968l
            int r2 = r2 / r3
            long r2 = (long) r2
            long r0 = r0 + r2
            r4.f10976t = r0
        L18:
            return
    }

    @Override // p121h4.AbstractC2478s
    /* renamed from: k */
    public void mo6243k() {
            r1 = this;
            r0 = 0
            r1.f10969m = r0
            r1.f10974r = r0
            byte[] r0 = p371v5.C6552b0.f25629f
            r1.f10970n = r0
            r1.f10971o = r0
            return
    }

    /* renamed from: m */
    public final int m6244m(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.position()
        L4:
            int r1 = r4.limit()
            if (r0 >= r1) goto L1f
            short r1 = r4.getShort(r0)
            int r1 = java.lang.Math.abs(r1)
            short r2 = r3.f10967k
            if (r1 <= r2) goto L1c
            int r4 = r3.f10968l
            int r0 = r0 / r4
            int r0 = r0 * r4
            return r0
        L1c:
            int r0 = r0 + 2
            goto L4
        L1f:
            int r4 = r4.limit()
            return r4
    }

    /* renamed from: n */
    public final void m6245n(byte[] r3, int r4) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.m6300l(r4)
            r1 = 0
            java.nio.ByteBuffer r3 = r0.put(r3, r1, r4)
            r3.flip()
            if (r4 <= 0) goto L11
            r3 = 1
            r2.f10975s = r3
        L11:
            return
    }

    /* renamed from: o */
    public final void m6246o(java.nio.ByteBuffer r5, byte[] r6, int r7) {
            r4 = this;
            int r0 = r5.remaining()
            int r1 = r4.f10974r
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r4.f10974r
            int r1 = r1 - r0
            int r7 = r7 - r1
            byte[] r2 = r4.f10971o
            r3 = 0
            java.lang.System.arraycopy(r6, r7, r2, r3, r1)
            int r6 = r5.limit()
            int r6 = r6 - r0
            r5.position(r6)
            byte[] r6 = r4.f10971o
            r5.get(r6, r1, r0)
            return
    }
}
