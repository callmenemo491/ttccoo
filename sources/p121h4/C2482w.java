package p121h4;

/* renamed from: h4.w */
/* loaded from: classes.dex */
public final class C2482w extends p121h4.AbstractC2478s {

    /* renamed from: i */
    public static final int f11204i = 0;

    static {
            r0 = 2143289344(0x7fc00000, float:NaN)
            int r0 = java.lang.Float.floatToIntBits(r0)
            p121h4.C2482w.f11204i = r0
            return
    }

    public C2482w() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: m */
    public static void m6333m(int r4, java.nio.ByteBuffer r5) {
            double r0 = (double) r4
            r2 = 4467570830353629184(0x3e00000000200000, double:4.656612875245797E-10)
            double r0 = r0 * r2
            float r4 = (float) r0
            int r4 = java.lang.Float.floatToIntBits(r4)
            int r0 = p121h4.C2482w.f11204i
            if (r4 != r0) goto L16
            r4 = 0
            int r4 = java.lang.Float.floatToIntBits(r4)
        L16:
            r5.putInt(r4)
            return
    }

    @Override // p121h4.InterfaceC2465f
    /* renamed from: g */
    public void mo6237g(java.nio.ByteBuffer r6) {
            r5 = this;
            int r0 = r6.position()
            int r1 = r6.limit()
            int r2 = r1 - r0
            h4.f$a r3 = r5.f11115b
            int r3 = r3.f11040c
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            if (r3 == r4) goto L4f
            r4 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 != r4) goto L49
            java.nio.ByteBuffer r2 = r5.m6300l(r2)
        L1a:
            if (r0 >= r1) goto L7d
            byte r3 = r6.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r0 + 1
            byte r4 = r6.get(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r3 = r3 | r4
            int r4 = r0 + 2
            byte r4 = r6.get(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r3 = r3 | r4
            int r4 = r0 + 3
            byte r4 = r6.get(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 24
            r3 = r3 | r4
            m6333m(r3, r2)
            int r0 = r0 + 4
            goto L1a
        L49:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L4f:
            int r2 = r2 / 3
            int r2 = r2 * 4
            java.nio.ByteBuffer r2 = r5.m6300l(r2)
        L57:
            if (r0 >= r1) goto L7d
            byte r3 = r6.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            int r4 = r0 + 1
            byte r4 = r6.get(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r3 = r3 | r4
            int r4 = r0 + 2
            byte r4 = r6.get(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 24
            r3 = r3 | r4
            m6333m(r3, r2)
            int r0 = r0 + 3
            goto L57
        L7d:
            int r0 = r6.limit()
            r6.position(r0)
            r2.flip()
            return
    }

    @Override // p121h4.AbstractC2478s
    /* renamed from: h */
    public p121h4.InterfaceC2465f.a mo6238h(p121h4.InterfaceC2465f.a r4) {
            r3 = this;
            int r0 = r4.f11040c
            boolean r1 = p371v5.C6552b0.m13331x(r0)
            if (r1 == 0) goto L18
            r1 = 4
            if (r0 == r1) goto L15
            h4.f$a r0 = new h4.f$a
            int r2 = r4.f11038a
            int r4 = r4.f11039b
            r0.<init>(r2, r4, r1)
            goto L17
        L15:
            h4.f$a r0 = p121h4.InterfaceC2465f.a.f11037e
        L17:
            return r0
        L18:
            h4.f$b r0 = new h4.f$b
            r0.<init>(r4)
            throw r0
    }
}
