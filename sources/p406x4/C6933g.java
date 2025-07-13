package p406x4;

/* renamed from: x4.g */
/* loaded from: classes.dex */
public final class C6933g extends p142i4.C3073g {

    /* renamed from: g0 */
    public long f27003g0;

    /* renamed from: h0 */
    public int f27004h0;

    /* renamed from: i0 */
    public int f27005i0;

    public C6933g() {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            r0 = 32
            r1.f27005i0 = r0
            return
    }

    @Override // p142i4.C3073g
    /* renamed from: t */
    public void mo7522t() {
            r1 = this;
            super.mo7522t()
            r0 = 0
            r1.f27004h0 = r0
            return
    }

    /* renamed from: y */
    public boolean m14057y(p142i4.C3073g r5) {
            r4 = this;
            boolean r0 = r5.m7526x()
            r1 = 1
            r0 = r0 ^ r1
            p371v5.C6549a.m13288b(r0)
            boolean r0 = r5.m7515p()
            r0 = r0 ^ r1
            p371v5.C6549a.m13288b(r0)
            boolean r0 = r5.m7517r()
            r0 = r0 ^ r1
            p371v5.C6549a.m13288b(r0)
            boolean r0 = r4.m14058z()
            r2 = 0
            if (r0 != 0) goto L22
        L20:
            r0 = 1
            goto L4c
        L22:
            int r0 = r4.f27004h0
            int r3 = r4.f27005i0
            if (r0 < r3) goto L2a
        L28:
            r0 = 0
            goto L4c
        L2a:
            boolean r0 = r5.m7516q()
            boolean r3 = r4.m7516q()
            if (r0 == r3) goto L35
            goto L28
        L35:
            java.nio.ByteBuffer r0 = r5.f12358a0
            if (r0 == 0) goto L20
            java.nio.ByteBuffer r3 = r4.f12358a0
            if (r3 == 0) goto L20
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L20
            goto L28
        L4c:
            if (r0 != 0) goto L4f
            return r2
        L4f:
            int r0 = r4.f27004h0
            int r2 = r0 + 1
            r4.f27004h0 = r2
            if (r0 != 0) goto L63
            long r2 = r5.f12360c0
            r4.f12360c0 = r2
            boolean r0 = r5.m7518s()
            if (r0 == 0) goto L63
            r4.f12333Y = r1
        L63:
            boolean r0 = r5.m7516q()
            if (r0 == 0) goto L6d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.f12333Y = r0
        L6d:
            java.nio.ByteBuffer r0 = r5.f12358a0
            if (r0 == 0) goto L7d
            int r2 = r0.remaining()
            r4.m7524v(r2)
            java.nio.ByteBuffer r2 = r4.f12358a0
            r2.put(r0)
        L7d:
            long r2 = r5.f12360c0
            r4.f27003g0 = r2
            return r1
    }

    /* renamed from: z */
    public boolean m14058z() {
            r1 = this;
            int r0 = r1.f27004h0
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
