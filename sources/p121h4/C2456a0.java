package p121h4;

/* renamed from: h4.a0 */
/* loaded from: classes.dex */
public final class C2456a0 extends p121h4.AbstractC2478s {
    public C2456a0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: g */
    public void mo6237g(java.nio.ByteBuffer r10) {
            r9 = this;
            int r0 = r10.position()
            int r1 = r10.limit()
            int r2 = r1 - r0
            h4.f$a r3 = r9.f11115b
            int r3 = r3.f11040c
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = 268435456(0x10000000, float:2.524355E-29)
            r7 = 4
            r8 = 3
            if (r3 == r8) goto L2d
            if (r3 == r7) goto L2a
            if (r3 == r6) goto L2f
            if (r3 == r5) goto L27
            if (r3 != r4) goto L21
            goto L2a
        L21:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L27:
            int r2 = r2 / 3
            goto L2d
        L2a:
            int r2 = r2 / 2
            goto L2f
        L2d:
            int r2 = r2 * 2
        L2f:
            java.nio.ByteBuffer r2 = r9.m6300l(r2)
            h4.f$a r3 = r9.f11115b
            int r3 = r3.f11040c
            if (r3 == r8) goto Lb0
            if (r3 == r7) goto L8a
            if (r3 == r6) goto L75
            if (r3 == r5) goto L5e
            if (r3 != r4) goto L58
        L41:
            if (r0 >= r1) goto Lc5
            int r3 = r0 + 2
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r3 = r0 + 3
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L41
        L58:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L5e:
            if (r0 >= r1) goto Lc5
            int r3 = r0 + 1
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r3 = r0 + 2
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L5e
        L75:
            if (r0 >= r1) goto Lc5
            int r3 = r0 + 1
            byte r3 = r10.get(r3)
            r2.put(r3)
            byte r3 = r10.get(r0)
            r2.put(r3)
            int r0 = r0 + 2
            goto L75
        L8a:
            if (r0 >= r1) goto Lc5
            float r3 = r10.getFloat(r0)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = p371v5.C6552b0.m13314g(r3, r4, r5)
            r4 = 1191181824(0x46fffe00, float:32767.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            short r3 = (short) r3
            r4 = r3 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2.put(r4)
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 4
            goto L8a
        Lb0:
            if (r0 >= r1) goto Lc5
            r3 = 0
            r2.put(r3)
            byte r3 = r10.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto Lb0
        Lc5:
            int r0 = r10.limit()
            r10.position(r0)
            r2.flip()
            return
    }

    @Override // p121h4.AbstractC2478s
    /* renamed from: h */
    public p121h4.InterfaceC2465f.a mo6238h(p121h4.InterfaceC2465f.a r4) {
            r3 = this;
            int r0 = r4.f11040c
            r1 = 2
            r2 = 3
            if (r0 == r2) goto L1e
            if (r0 == r1) goto L1e
            r2 = 268435456(0x10000000, float:2.524355E-29)
            if (r0 == r2) goto L1e
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            if (r0 == r2) goto L1e
            r2 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == r2) goto L1e
            r2 = 4
            if (r0 != r2) goto L18
            goto L1e
        L18:
            h4.f$b r0 = new h4.f$b
            r0.<init>(r4)
            throw r0
        L1e:
            if (r0 == r1) goto L2a
            h4.f$a r0 = new h4.f$a
            int r2 = r4.f11038a
            int r4 = r4.f11039b
            r0.<init>(r2, r4, r1)
            goto L2c
        L2a:
            h4.f$a r0 = p121h4.InterfaceC2465f.a.f11037e
        L2c:
            return r0
    }
}
