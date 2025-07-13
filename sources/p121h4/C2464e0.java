package p121h4;

/* renamed from: h4.e0 */
/* loaded from: classes.dex */
public final class C2464e0 extends p121h4.AbstractC2478s {

    /* renamed from: i */
    public int f11029i;

    /* renamed from: j */
    public int f11030j;

    /* renamed from: k */
    public boolean f11031k;

    /* renamed from: l */
    public int f11032l;

    /* renamed from: m */
    public byte[] f11033m;

    /* renamed from: n */
    public int f11034n;

    /* renamed from: o */
    public long f11035o;

    public C2464e0() {
            r1 = this;
            r1.<init>()
            byte[] r0 = p371v5.C6552b0.f25629f
            r1.f11033m = r0
            return
    }

    @Override // p121h4.AbstractC2478s, p121h4.InterfaceC2465f
    /* renamed from: c */
    public java.nio.ByteBuffer mo6258c() {
            r4 = this;
            boolean r0 = super.mo6259d()
            if (r0 == 0) goto L1c
            int r0 = r4.f11034n
            if (r0 <= 0) goto L1c
            java.nio.ByteBuffer r0 = r4.m6300l(r0)
            byte[] r1 = r4.f11033m
            int r2 = r4.f11034n
            r3 = 0
            java.nio.ByteBuffer r0 = r0.put(r1, r3, r2)
            r0.flip()
            r4.f11034n = r3
        L1c:
            java.nio.ByteBuffer r0 = super.mo6258c()
            return r0
    }

    @Override // p121h4.AbstractC2478s, p121h4.InterfaceC2465f
    /* renamed from: d */
    public boolean mo6259d() {
            r1 = this;
            boolean r0 = super.mo6259d()
            if (r0 == 0) goto Lc
            int r0 = r1.f11034n
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: g */
    public void mo6237g(java.nio.ByteBuffer r9) {
            r8 = this;
            int r0 = r9.position()
            int r1 = r9.limit()
            int r2 = r1 - r0
            if (r2 != 0) goto Ld
            return
        Ld:
            int r3 = r8.f11032l
            int r3 = java.lang.Math.min(r2, r3)
            long r4 = r8.f11035o
            h4.f$a r6 = r8.f11115b
            int r6 = r6.f11041d
            int r6 = r3 / r6
            long r6 = (long) r6
            long r4 = r4 + r6
            r8.f11035o = r4
            int r4 = r8.f11032l
            int r4 = r4 - r3
            r8.f11032l = r4
            int r0 = r0 + r3
            r9.position(r0)
            int r0 = r8.f11032l
            if (r0 <= 0) goto L2d
            return
        L2d:
            int r2 = r2 - r3
            int r0 = r8.f11034n
            int r0 = r0 + r2
            byte[] r3 = r8.f11033m
            int r3 = r3.length
            int r0 = r0 - r3
            java.nio.ByteBuffer r3 = r8.m6300l(r0)
            int r4 = r8.f11034n
            r5 = 0
            int r4 = p371v5.C6552b0.m13315h(r0, r5, r4)
            byte[] r6 = r8.f11033m
            r3.put(r6, r5, r4)
            int r0 = r0 - r4
            int r0 = p371v5.C6552b0.m13315h(r0, r5, r2)
            int r6 = r9.position()
            int r6 = r6 + r0
            r9.limit(r6)
            r3.put(r9)
            r9.limit(r1)
            int r2 = r2 - r0
            int r0 = r8.f11034n
            int r0 = r0 - r4
            r8.f11034n = r0
            byte[] r1 = r8.f11033m
            java.lang.System.arraycopy(r1, r4, r1, r5, r0)
            byte[] r0 = r8.f11033m
            int r1 = r8.f11034n
            r9.get(r0, r1, r2)
            int r9 = r8.f11034n
            int r9 = r9 + r2
            r8.f11034n = r9
            r3.flip()
            return
    }

    @Override // p121h4.AbstractC2478s
    /* renamed from: h */
    public p121h4.InterfaceC2465f.a mo6238h(p121h4.InterfaceC2465f.a r3) {
            r2 = this;
            int r0 = r3.f11040c
            r1 = 2
            if (r0 != r1) goto L14
            r0 = 1
            r2.f11031k = r0
            int r0 = r2.f11029i
            if (r0 != 0) goto L13
            int r0 = r2.f11030j
            if (r0 == 0) goto L11
            goto L13
        L11:
            h4.f$a r3 = p121h4.InterfaceC2465f.a.f11037e
        L13:
            return r3
        L14:
            h4.f$b r0 = new h4.f$b
            r0.<init>(r3)
            throw r0
    }

    @Override // p121h4.AbstractC2478s
    /* renamed from: i */
    public void mo6241i() {
            r3 = this;
            boolean r0 = r3.f11031k
            r1 = 0
            if (r0 == 0) goto L19
            r3.f11031k = r1
            int r0 = r3.f11030j
            h4.f$a r2 = r3.f11115b
            int r2 = r2.f11041d
            int r0 = r0 * r2
            byte[] r0 = new byte[r0]
            r3.f11033m = r0
            int r0 = r3.f11029i
            int r0 = r0 * r2
            r3.f11032l = r0
        L19:
            r3.f11034n = r1
            return
    }

    @Override // p121h4.AbstractC2478s
    /* renamed from: j */
    public void mo6242j() {
            r5 = this;
            boolean r0 = r5.f11031k
            if (r0 == 0) goto L16
            int r0 = r5.f11034n
            if (r0 <= 0) goto L13
            long r1 = r5.f11035o
            h4.f$a r3 = r5.f11115b
            int r3 = r3.f11041d
            int r0 = r0 / r3
            long r3 = (long) r0
            long r1 = r1 + r3
            r5.f11035o = r1
        L13:
            r0 = 0
            r5.f11034n = r0
        L16:
            return
    }

    @Override // p121h4.AbstractC2478s
    /* renamed from: k */
    public void mo6243k() {
            r1 = this;
            byte[] r0 = p371v5.C6552b0.f25629f
            r1.f11033m = r0
            return
    }
}
