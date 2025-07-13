package p121h4;

/* renamed from: h4.t */
/* loaded from: classes.dex */
public final class C2479t extends p121h4.AbstractC2478s {

    /* renamed from: i */
    public int[] f11122i;

    /* renamed from: j */
    public int[] f11123j;

    public C2479t() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: g */
    public void mo6237g(java.nio.ByteBuffer r8) {
            r7 = this;
            int[] r0 = r7.f11123j
            java.util.Objects.requireNonNull(r0)
            int r1 = r8.position()
            int r2 = r8.limit()
            int r3 = r2 - r1
            h4.f$a r4 = r7.f11115b
            int r4 = r4.f11041d
            int r3 = r3 / r4
            h4.f$a r4 = r7.f11116c
            int r4 = r4.f11041d
            int r3 = r3 * r4
            java.nio.ByteBuffer r3 = r7.m6300l(r3)
        L1e:
            if (r1 >= r2) goto L39
            int r4 = r0.length
            r5 = 0
        L22:
            if (r5 >= r4) goto L33
            r6 = r0[r5]
            int r6 = r6 * 2
            int r6 = r6 + r1
            short r6 = r8.getShort(r6)
            r3.putShort(r6)
            int r5 = r5 + 1
            goto L22
        L33:
            h4.f$a r4 = r7.f11115b
            int r4 = r4.f11041d
            int r1 = r1 + r4
            goto L1e
        L39:
            r8.position(r2)
            r3.flip()
            return
    }

    @Override // p121h4.AbstractC2478s
    /* renamed from: h */
    public p121h4.InterfaceC2465f.a mo6238h(p121h4.InterfaceC2465f.a r9) {
            r8 = this;
            int[] r0 = r8.f11122i
            if (r0 != 0) goto L7
            h4.f$a r9 = p121h4.InterfaceC2465f.a.f11037e
            return r9
        L7:
            int r1 = r9.f11040c
            r2 = 2
            if (r1 != r2) goto L3d
            int r1 = r9.f11039b
            int r3 = r0.length
            r4 = 1
            r5 = 0
            if (r1 == r3) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            r3 = 0
        L17:
            int r6 = r0.length
            if (r3 >= r6) goto L2f
            r6 = r0[r3]
            int r7 = r9.f11039b
            if (r6 >= r7) goto L29
            if (r6 == r3) goto L24
            r6 = 1
            goto L25
        L24:
            r6 = 0
        L25:
            r1 = r1 | r6
            int r3 = r3 + 1
            goto L17
        L29:
            h4.f$b r0 = new h4.f$b
            r0.<init>(r9)
            throw r0
        L2f:
            if (r1 == 0) goto L3a
            h4.f$a r1 = new h4.f$a
            int r9 = r9.f11038a
            int r0 = r0.length
            r1.<init>(r9, r0, r2)
            goto L3c
        L3a:
            h4.f$a r1 = p121h4.InterfaceC2465f.a.f11037e
        L3c:
            return r1
        L3d:
            h4.f$b r0 = new h4.f$b
            r0.<init>(r9)
            throw r0
    }

    @Override // p121h4.AbstractC2478s
    /* renamed from: i */
    public void mo6241i() {
            r1 = this;
            int[] r0 = r1.f11122i
            r1.f11123j = r0
            return
    }

    @Override // p121h4.AbstractC2478s
    /* renamed from: k */
    public void mo6243k() {
            r1 = this;
            r0 = 0
            r1.f11123j = r0
            r1.f11122i = r0
            return
    }
}
