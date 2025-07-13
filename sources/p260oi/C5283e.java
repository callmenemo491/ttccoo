package p260oi;

/* renamed from: oi.e */
/* loaded from: classes.dex */
public final class C5283e implements p260oi.InterfaceC5286h, p260oi.InterfaceC5285g, java.lang.Cloneable, java.nio.channels.ByteChannel {

    /* renamed from: Y */
    public p260oi.C5299u f20500Y;

    /* renamed from: Z */
    public long f20501Z;

    /* renamed from: oi.e$a */
    public static final class a extends java.io.InputStream {

        /* renamed from: Y */
        public final /* synthetic */ p260oi.C5283e f20502Y;

        public a(p260oi.C5283e r1) {
                r0 = this;
                r0.f20502Y = r1
                r0.<init>()
                return
        }

        @Override // java.io.InputStream
        public int available() {
                r4 = this;
                oi.e r0 = r4.f20502Y
                long r0 = r0.f20501Z
                r2 = 2147483647(0x7fffffff, float:NaN)
                long r2 = (long) r2
                long r0 = java.lang.Math.min(r0, r2)
                int r1 = (int) r0
                return r1
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
                return
        }

        @Override // java.io.InputStream
        public int read() {
                r6 = this;
                oi.e r0 = r6.f20502Y
                long r1 = r0.f20501Z
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L11
                byte r0 = r0.readByte()
                r0 = r0 & 255(0xff, float:3.57E-43)
                goto L12
            L11:
                r0 = -1
            L12:
                return r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "sink"
                p214m2.C4339q.m9706k(r2, r0)
                oi.e r0 = r1.f20502Y
                int r2 = r0.m11557Z(r2, r3, r4)
                return r2
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                oi.e r1 = r2.f20502Y
                r0.append(r1)
                java.lang.String r1 = ".inputStream()"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public C5283e() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: A */
    public final long m11534A() {
            r5 = this;
            long r0 = r5.f20501Z
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            goto L23
        L9:
            oi.u r2 = r5.f20500Y
            p214m2.C4339q.m9704i(r2)
            oi.u r2 = r2.f20542g
            p214m2.C4339q.m9704i(r2)
            int r3 = r2.f20538c
            r4 = 8192(0x2000, float:1.148E-41)
            if (r3 >= r4) goto L22
            boolean r4 = r2.f20540e
            if (r4 == 0) goto L22
            int r2 = r2.f20537b
            int r3 = r3 - r2
            long r2 = (long) r3
            long r0 = r0 - r2
        L22:
            r2 = r0
        L23:
            return r2
    }

    /* renamed from: A0 */
    public p260oi.C5283e m11535A0(byte[] r3) {
            r2 = this;
            java.lang.String r0 = "source"
            p214m2.C4339q.m9706k(r3, r0)
            int r0 = r3.length
            r1 = 0
            r2.m11536B0(r3, r1, r0)
            return r2
    }

    /* renamed from: B0 */
    public p260oi.C5283e m11536B0(byte[] r10, int r11, int r12) {
            r9 = this;
            java.lang.String r0 = "source"
            p214m2.C4339q.m9706k(r10, r0)
            int r0 = r10.length
            long r1 = (long) r0
            long r3 = (long) r11
            long r7 = (long) r12
            r5 = r7
            p080ei.C1854b.m4602d(r1, r3, r5)
            int r12 = r12 + r11
        Le:
            if (r11 >= r12) goto L2f
            r0 = 1
            oi.u r0 = r9.m11580y0(r0)
            int r1 = r12 - r11
            int r2 = r0.f20538c
            int r2 = 8192 - r2
            int r1 = java.lang.Math.min(r1, r2)
            byte[] r2 = r0.f20536a
            int r3 = r0.f20538c
            int r4 = r11 + r1
            p062dh.C1468d.m3983E(r10, r2, r3, r11, r4)
            int r11 = r0.f20538c
            int r11 = r11 + r1
            r0.f20538c = r11
            r11 = r4
            goto Le
        L2f:
            long r10 = r9.f20501Z
            long r10 = r10 + r7
            r9.f20501Z = r10
            return r9
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: C */
    public java.lang.String mo11537C() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r0 = r2.mo11556W(r0)
            return r0
    }

    /* renamed from: C0 */
    public long m11538C0(p260oi.InterfaceC5304z r8) {
            r7 = this;
            java.lang.String r0 = "source"
            p214m2.C4339q.m9706k(r8, r0)
            r0 = 0
        L7:
            r2 = 8192(0x2000, float:1.148E-41)
            long r2 = (long) r2
            long r2 = r8.mo4683j0(r7, r2)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L15
            return r0
        L15:
            long r0 = r0 + r2
            goto L7
    }

    /* renamed from: D0 */
    public p260oi.C5283e m11539D0(int r5) {
            r4 = this;
            r0 = 1
            oi.u r0 = r4.m11580y0(r0)
            byte[] r1 = r0.f20536a
            int r2 = r0.f20538c
            int r3 = r2 + 1
            r0.f20538c = r3
            byte r5 = (byte) r5
            r1[r2] = r5
            long r0 = r4.f20501Z
            r2 = 1
            long r0 = r0 + r2
            r4.f20501Z = r0
            return r4
    }

    /* renamed from: E0 */
    public p260oi.C5283e m11540E0(long r13) {
            r12 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            r13 = 48
            r12.m11539D0(r13)
            goto L117
        Ld:
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L1e
            long r13 = -r13
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1d
            java.lang.String r13 = "-9223372036854775808"
            r12.m11547I0(r13)
            goto L117
        L1d:
            r3 = 1
        L1e:
            r5 = 100000000(0x5f5e100, double:4.94065646E-316)
            r2 = 10
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 >= 0) goto L6c
            r5 = 10000(0x2710, double:4.9407E-320)
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 >= 0) goto L4a
            r5 = 100
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 >= 0) goto L3e
            r5 = 10
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 >= 0) goto L3b
            goto Le4
        L3b:
            r4 = 2
            goto Le4
        L3e:
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L47
            r4 = 3
            goto Le4
        L47:
            r4 = 4
            goto Le4
        L4a:
            r4 = 1000000(0xf4240, double:4.940656E-318)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L5e
            r4 = 100000(0x186a0, double:4.94066E-319)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L5b
            r4 = 5
            goto Le4
        L5b:
            r4 = 6
            goto Le4
        L5e:
            r4 = 10000000(0x989680, double:4.9406565E-317)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L68
            r4 = 7
            goto Le4
        L68:
            r4 = 8
            goto Le4
        L6c:
            r4 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L9a
            r4 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L8b
            r4 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L88
            r4 = 9
            goto Le4
        L88:
            r4 = 10
            goto Le4
        L8b:
            r4 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto L97
            r4 = 11
            goto Le4
        L97:
            r4 = 12
            goto Le4
        L9a:
            r4 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Lbe
            r4 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Laf
            r4 = 13
            goto Le4
        Laf:
            r4 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Lbb
            r4 = 14
            goto Le4
        Lbb:
            r4 = 15
            goto Le4
        Lbe:
            r4 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Ld6
            r4 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Ld3
            r4 = 16
            goto Le4
        Ld3:
            r4 = 17
            goto Le4
        Ld6:
            r4 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 >= 0) goto Le2
            r4 = 18
            goto Le4
        Le2:
            r4 = 19
        Le4:
            if (r3 == 0) goto Le8
            int r4 = r4 + 1
        Le8:
            oi.u r5 = r12.m11580y0(r4)
            byte[] r6 = r5.f20536a
            int r7 = r5.f20538c
            int r7 = r7 + r4
        Lf1:
            int r8 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r8 == 0) goto L103
            long r8 = (long) r2
            long r10 = r13 % r8
            int r11 = (int) r10
            int r7 = r7 + (-1)
            byte[] r10 = p277pi.C5527a.f21527a
            r10 = r10[r11]
            r6[r7] = r10
            long r13 = r13 / r8
            goto Lf1
        L103:
            if (r3 == 0) goto L10c
            int r7 = r7 + (-1)
            r13 = 45
            byte r13 = (byte) r13
            r6[r7] = r13
        L10c:
            int r13 = r5.f20538c
            int r13 = r13 + r4
            r5.f20538c = r13
            long r13 = r12.f20501Z
            long r0 = (long) r4
            long r13 = r13 + r0
            r12.f20501Z = r13
        L117:
            return r12
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: F */
    public boolean mo11541F() {
            r5 = this;
            long r0 = r5.f20501Z
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* renamed from: F0 */
    public p260oi.C5283e m11542F0(long r13) {
            r12 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            r13 = 48
            r12.m11539D0(r13)
            goto L7c
        Lc:
            r0 = 1
            long r1 = r13 >>> r0
            long r1 = r1 | r13
            r3 = 2
            long r4 = r1 >>> r3
            long r1 = r1 | r4
            r4 = 4
            long r5 = r1 >>> r4
            long r1 = r1 | r5
            r5 = 8
            long r6 = r1 >>> r5
            long r1 = r1 | r6
            r6 = 16
            long r7 = r1 >>> r6
            long r1 = r1 | r7
            r7 = 32
            long r8 = r1 >>> r7
            long r1 = r1 | r8
            long r8 = r1 >>> r0
            r10 = 6148914691236517205(0x5555555555555555, double:1.1945305291614955E103)
            long r8 = r8 & r10
            long r1 = r1 - r8
            long r8 = r1 >>> r3
            r10 = 3689348814741910323(0x3333333333333333, double:4.667261458395856E-62)
            long r8 = r8 & r10
            long r1 = r1 & r10
            long r8 = r8 + r1
            long r1 = r8 >>> r4
            long r1 = r1 + r8
            r8 = 1085102592571150095(0xf0f0f0f0f0f0f0f, double:3.815736827118017E-236)
            long r1 = r1 & r8
            long r8 = r1 >>> r5
            long r1 = r1 + r8
            long r5 = r1 >>> r6
            long r1 = r1 + r5
            r5 = 63
            long r8 = r1 & r5
            long r1 = r1 >>> r7
            long r1 = r1 & r5
            long r8 = r8 + r1
            r1 = 3
            long r1 = (long) r1
            long r8 = r8 + r1
            long r1 = (long) r4
            long r8 = r8 / r1
            int r1 = (int) r8
            oi.u r2 = r12.m11580y0(r1)
            byte[] r3 = r2.f20536a
            int r5 = r2.f20538c
            int r6 = r5 + r1
            int r6 = r6 - r0
        L61:
            if (r6 < r5) goto L71
            byte[] r0 = p277pi.C5527a.f21527a
            r7 = 15
            long r7 = r7 & r13
            int r8 = (int) r7
            r0 = r0[r8]
            r3[r6] = r0
            long r13 = r13 >>> r4
            int r6 = r6 + (-1)
            goto L61
        L71:
            int r13 = r2.f20538c
            int r13 = r13 + r1
            r2.f20538c = r13
            long r13 = r12.f20501Z
            long r0 = (long) r1
            long r13 = r13 + r0
            r12.f20501Z = r13
        L7c:
            return r12
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: G */
    public /* bridge */ /* synthetic */ p260oi.InterfaceC5285g mo11543G(int r1) {
            r0 = this;
            r0.m11539D0(r1)
            return r0
    }

    /* renamed from: G0 */
    public p260oi.C5283e m11544G0(int r6) {
            r5 = this;
            r0 = 4
            oi.u r0 = r5.m11580y0(r0)
            byte[] r1 = r0.f20536a
            int r2 = r0.f20538c
            int r3 = r2 + 1
            int r4 = r6 >>> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r3 + 1
            int r4 = r6 >>> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r1[r3] = r4
            int r3 = r2 + 1
            int r4 = r6 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r3 + 1
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r1[r3] = r6
            r0.f20538c = r2
            long r0 = r5.f20501Z
            r2 = 4
            long r0 = r0 + r2
            r5.f20501Z = r0
            return r5
    }

    /* renamed from: H0 */
    public p260oi.C5283e m11545H0(int r6) {
            r5 = this;
            r0 = 2
            oi.u r0 = r5.m11580y0(r0)
            byte[] r1 = r0.f20536a
            int r2 = r0.f20538c
            int r3 = r2 + 1
            int r4 = r6 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r3 + 1
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r1[r3] = r6
            r0.f20538c = r2
            long r0 = r5.f20501Z
            r2 = 2
            long r0 = r0 + r2
            r5.f20501Z = r0
            return r5
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: I */
    public /* bridge */ /* synthetic */ p260oi.InterfaceC5285g mo11546I(p260oi.C5287i r1) {
            r0 = this;
            r0.m11582z0(r1)
            return r0
    }

    /* renamed from: I0 */
    public p260oi.C5283e m11547I0(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "string"
            p214m2.C4339q.m9706k(r3, r0)
            int r0 = r3.length()
            r1 = 0
            r2.m11548J0(r3, r1, r0)
            return r2
    }

    /* renamed from: J0 */
    public p260oi.C5283e m11548J0(java.lang.String r11, int r12, int r13) {
            r10 = this;
            r0 = 1
            if (r12 < 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            if (r1 == 0) goto L147
            if (r13 < r12) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L135
            int r1 = r11.length()
            if (r13 > r1) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            if (r1 == 0) goto L118
        L1a:
            if (r12 >= r13) goto L117
            char r1 = r11.charAt(r12)
            r2 = 128(0x80, float:1.8E-43)
            if (r1 >= r2) goto L58
            oi.u r3 = r10.m11580y0(r0)
            byte[] r4 = r3.f20536a
            int r5 = r3.f20538c
            int r5 = r5 - r12
            int r6 = 8192 - r5
            int r6 = java.lang.Math.min(r13, r6)
            int r7 = r12 + 1
            int r12 = r12 + r5
            byte r1 = (byte) r1
            r4[r12] = r1
        L39:
            r12 = r7
            if (r12 >= r6) goto L4a
            char r1 = r11.charAt(r12)
            if (r1 < r2) goto L43
            goto L4a
        L43:
            int r7 = r12 + 1
            int r12 = r12 + r5
            byte r1 = (byte) r1
            r4[r12] = r1
            goto L39
        L4a:
            int r5 = r5 + r12
            int r1 = r3.f20538c
            int r5 = r5 - r1
            int r1 = r1 + r5
            r3.f20538c = r1
            long r1 = r10.f20501Z
            long r3 = (long) r5
            long r1 = r1 + r3
            r10.f20501Z = r1
            goto L1a
        L58:
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 >= r3) goto L7d
            r3 = 2
            oi.u r4 = r10.m11580y0(r3)
            byte[] r5 = r4.f20536a
            int r6 = r4.f20538c
            int r7 = r1 >> 6
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            int r7 = r6 + 1
            r1 = r1 & 63
            r1 = r1 | r2
            byte r1 = (byte) r1
            r5[r7] = r1
            int r6 = r6 + r3
            r4.f20538c = r6
            long r1 = r10.f20501Z
            r3 = 2
            goto L110
        L7d:
            r3 = 55296(0xd800, float:7.7486E-41)
            r4 = 63
            if (r1 < r3) goto Le8
            r3 = 57343(0xdfff, float:8.0355E-41)
            if (r1 <= r3) goto L8a
            goto Le8
        L8a:
            int r5 = r12 + 1
            if (r5 >= r13) goto L93
            char r6 = r11.charAt(r5)
            goto L94
        L93:
            r6 = 0
        L94:
            r7 = 56319(0xdbff, float:7.892E-41)
            if (r1 > r7) goto Le2
            r7 = 56320(0xdc00, float:7.8921E-41)
            if (r7 > r6) goto Le2
            if (r3 >= r6) goto La1
            goto Le2
        La1:
            r3 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & 1023(0x3ff, float:1.434E-42)
            int r1 = r1 << 10
            r5 = r6 & 1023(0x3ff, float:1.434E-42)
            r1 = r1 | r5
            int r1 = r1 + r3
            r3 = 4
            oi.u r5 = r10.m11580y0(r3)
            byte[] r6 = r5.f20536a
            int r7 = r5.f20538c
            int r8 = r1 >> 18
            r8 = r8 | 240(0xf0, float:3.36E-43)
            byte r8 = (byte) r8
            r6[r7] = r8
            int r8 = r7 + 1
            int r9 = r1 >> 12
            r9 = r9 & r4
            r9 = r9 | r2
            byte r9 = (byte) r9
            r6[r8] = r9
            int r8 = r7 + 2
            int r9 = r1 >> 6
            r9 = r9 & r4
            r9 = r9 | r2
            byte r9 = (byte) r9
            r6[r8] = r9
            int r8 = r7 + 3
            r1 = r1 & r4
            r1 = r1 | r2
            byte r1 = (byte) r1
            r6[r8] = r1
            int r7 = r7 + r3
            r5.f20538c = r7
            long r1 = r10.f20501Z
            r3 = 4
            long r1 = r1 + r3
            r10.f20501Z = r1
            int r12 = r12 + 2
            goto L1a
        Le2:
            r10.m11539D0(r4)
            r12 = r5
            goto L1a
        Le8:
            r3 = 3
            oi.u r5 = r10.m11580y0(r3)
            byte[] r6 = r5.f20536a
            int r7 = r5.f20538c
            int r8 = r1 >> 12
            r8 = r8 | 224(0xe0, float:3.14E-43)
            byte r8 = (byte) r8
            r6[r7] = r8
            int r8 = r7 + 1
            int r9 = r1 >> 6
            r4 = r4 & r9
            r4 = r4 | r2
            byte r4 = (byte) r4
            r6[r8] = r4
            int r4 = r7 + 2
            r1 = r1 & 63
            r1 = r1 | r2
            byte r1 = (byte) r1
            r6[r4] = r1
            int r7 = r7 + r3
            r5.f20538c = r7
            long r1 = r10.f20501Z
            r3 = 3
        L110:
            long r1 = r1 + r3
            r10.f20501Z = r1
            int r12 = r12 + 1
            goto L1a
        L117:
            return r10
        L118:
            java.lang.String r12 = "endIndex > string.length: "
            java.lang.String r0 = " > "
            java.lang.StringBuilder r12 = androidx.appcompat.widget.C0300r0.m777a(r12, r13, r0)
            int r11 = r11.length()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L135:
            java.lang.String r11 = "endIndex < beginIndex: "
            java.lang.String r0 = " < "
            java.lang.String r11 = p243o1.C4872b.m11020a(r11, r13, r0, r12)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L147:
            java.lang.String r11 = "beginIndex < 0: "
            java.lang.String r11 = android.support.v4.media.C0142a.m254a(r11, r12)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: K */
    public byte[] mo11549K(long r5) {
            r4 = this;
            r0 = 0
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 < 0) goto L11
            r1 = 2147483647(0x7fffffff, float:NaN)
            long r1 = (long) r1
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L3c
            long r1 = r4.f20501Z
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L36
            int r6 = (int) r5
            byte[] r5 = new byte[r6]
            java.lang.String r1 = "sink"
            p214m2.C4339q.m9706k(r5, r1)
        L22:
            if (r0 >= r6) goto L35
            int r1 = r6 - r0
            int r1 = r4.m11557Z(r5, r0, r1)
            r2 = -1
            if (r1 == r2) goto L2f
            int r0 = r0 + r1
            goto L22
        L2f:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L35:
            return r5
        L36:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L3c:
            java.lang.String r0 = "byteCount: "
            java.lang.String r5 = p382w0.C6774a.m13748a(r0, r5)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    /* renamed from: K0 */
    public p260oi.C5283e m11550K0(int r12) {
            r11 = this;
            r0 = 128(0x80, float:1.8E-43)
            if (r12 >= r0) goto L9
            r11.m11539D0(r12)
            goto La1
        L9:
            r1 = 2048(0x800, float:2.87E-42)
            r2 = 2
            r3 = 63
            if (r12 >= r1) goto L2e
            oi.u r1 = r11.m11580y0(r2)
            byte[] r4 = r1.f20536a
            int r5 = r1.f20538c
            int r6 = r12 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            r12 = r12 & r3
            r12 = r12 | r0
            byte r12 = (byte) r12
            r4[r6] = r12
            int r5 = r5 + r2
            r1.f20538c = r5
            long r0 = r11.f20501Z
            r2 = 2
            goto L9e
        L2e:
            r1 = 57343(0xdfff, float:8.0355E-41)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r4 <= r12) goto L37
            goto L3d
        L37:
            if (r1 < r12) goto L3d
            r11.m11539D0(r3)
            goto La1
        L3d:
            r1 = 65536(0x10000, float:9.1835E-41)
            r4 = 3
            if (r12 >= r1) goto L69
            oi.u r1 = r11.m11580y0(r4)
            byte[] r2 = r1.f20536a
            int r5 = r1.f20538c
            int r6 = r12 >> 12
            r6 = r6 | 224(0xe0, float:3.14E-43)
            byte r6 = (byte) r6
            r2[r5] = r6
            int r6 = r5 + 1
            int r7 = r12 >> 6
            r7 = r7 & r3
            r7 = r7 | r0
            byte r7 = (byte) r7
            r2[r6] = r7
            int r6 = r5 + 2
            r12 = r12 & r3
            r12 = r12 | r0
            byte r12 = (byte) r12
            r2[r6] = r12
            int r5 = r5 + r4
            r1.f20538c = r5
            long r0 = r11.f20501Z
            r2 = 3
            goto L9e
        L69:
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            r5 = 4
            if (r12 > r1) goto La2
            oi.u r1 = r11.m11580y0(r5)
            byte[] r2 = r1.f20536a
            int r4 = r1.f20538c
            int r6 = r12 >> 18
            r6 = r6 | 240(0xf0, float:3.36E-43)
            byte r6 = (byte) r6
            r2[r4] = r6
            int r6 = r4 + 1
            int r7 = r12 >> 12
            r7 = r7 & r3
            r7 = r7 | r0
            byte r7 = (byte) r7
            r2[r6] = r7
            int r6 = r4 + 2
            int r7 = r12 >> 6
            r7 = r7 & r3
            r7 = r7 | r0
            byte r7 = (byte) r7
            r2[r6] = r7
            int r6 = r4 + 3
            r12 = r12 & r3
            r12 = r12 | r0
            byte r12 = (byte) r12
            r2[r6] = r12
            int r4 = r4 + r5
            r1.f20538c = r4
            long r0 = r11.f20501Z
            r2 = 4
        L9e:
            long r0 = r0 + r2
            r11.f20501Z = r0
        La1:
            return r11
        La2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unexpected code point: 0x"
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            if (r12 == 0) goto L108
            r3 = 8
            char[] r6 = new char[r3]
            char[] r7 = p277pi.C5528b.f21528a
            int r8 = r12 >> 28
            r8 = r8 & 15
            char r8 = r7[r8]
            r9 = 0
            r6[r9] = r8
            int r8 = r12 >> 24
            r8 = r8 & 15
            char r8 = r7[r8]
            r10 = 1
            r6[r10] = r8
            int r8 = r12 >> 20
            r8 = r8 & 15
            char r8 = r7[r8]
            r6[r2] = r8
            int r2 = r12 >> 16
            r2 = r2 & 15
            char r2 = r7[r2]
            r6[r4] = r2
            int r2 = r12 >> 12
            r2 = r2 & 15
            char r2 = r7[r2]
            r6[r5] = r2
            r2 = 5
            int r4 = r12 >> 8
            r4 = r4 & 15
            char r4 = r7[r4]
            r6[r2] = r4
            int r2 = r12 >> 4
            r2 = r2 & 15
            char r2 = r7[r2]
            r4 = 6
            r6[r4] = r2
            r2 = 7
            r12 = r12 & 15
            char r12 = r7[r12]
            r6[r2] = r12
        Lf5:
            if (r9 >= r3) goto L100
            char r12 = r6[r9]
            r2 = 48
            if (r12 != r2) goto L100
            int r9 = r9 + 1
            goto Lf5
        L100:
            int r12 = 8 - r9
            java.lang.String r2 = new java.lang.String
            r2.<init>(r6, r9, r12)
            goto L10a
        L108:
            java.lang.String r2 = "0"
        L10a:
            r1.append(r2)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: O */
    public /* bridge */ /* synthetic */ p260oi.InterfaceC5285g mo11551O(byte[] r1) {
            r0 = this;
            r0.m11535A0(r1)
            return r0
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: P */
    public int mo11552P(p260oi.C5295q r4) {
            r3 = this;
            java.lang.String r0 = "options"
            p214m2.C4339q.m9706k(r4, r0)
            r0 = 0
            int r0 = p277pi.C5527a.m11788b(r3, r4, r0)
            r1 = -1
            if (r0 != r1) goto Lf
            r0 = -1
            goto L1b
        Lf:
            oi.i[] r4 = r4.f20525Y
            r4 = r4[r0]
            int r4 = r4.mo11585h()
            long r1 = (long) r4
            r3.mo11559b(r1)
        L1b:
            return r0
    }

    /* renamed from: R */
    public final p260oi.C5283e m11553R(p260oi.C5283e r9, long r10, long r12) {
            r8 = this;
            java.lang.String r0 = "out"
            p214m2.C4339q.m9706k(r9, r0)
            long r1 = r8.f20501Z
            r3 = r10
            r5 = r12
            p080ei.C1854b.m4602d(r1, r3, r5)
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            goto L6a
        L13:
            long r2 = r9.f20501Z
            long r2 = r2 + r12
            r9.f20501Z = r2
            oi.u r2 = r8.f20500Y
        L1a:
            p214m2.C4339q.m9704i(r2)
            int r3 = r2.f20538c
            int r4 = r2.f20537b
            int r5 = r3 - r4
            long r5 = (long) r5
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 < 0) goto L2e
            int r3 = r3 - r4
            long r3 = (long) r3
            long r10 = r10 - r3
            oi.u r2 = r2.f20541f
            goto L1a
        L2e:
            int r3 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r3 <= 0) goto L6a
            p214m2.C4339q.m9704i(r2)
            oi.u r3 = r2.m11606c()
            int r4 = r3.f20537b
            int r11 = (int) r10
            int r4 = r4 + r11
            r3.f20537b = r4
            int r10 = (int) r12
            int r4 = r4 + r10
            int r10 = r3.f20538c
            int r10 = java.lang.Math.min(r4, r10)
            r3.f20538c = r10
            oi.u r10 = r9.f20500Y
            if (r10 != 0) goto L54
            r3.f20542g = r3
            r3.f20541f = r3
            r9.f20500Y = r3
            goto L5f
        L54:
            p214m2.C4339q.m9704i(r10)
            oi.u r10 = r10.f20542g
            p214m2.C4339q.m9704i(r10)
            r10.m11605b(r3)
        L5f:
            int r10 = r3.f20538c
            int r11 = r3.f20537b
            int r10 = r10 - r11
            long r10 = (long) r10
            long r12 = r12 - r10
            oi.u r2 = r2.f20541f
            r10 = r0
            goto L2e
        L6a:
            return r8
    }

    /* renamed from: S */
    public final byte m11554S(long r8) {
            r7 = this;
            long r0 = r7.f20501Z
            r4 = 1
            r2 = r8
            p080ei.C1854b.m4602d(r0, r2, r4)
            oi.u r0 = r7.f20500Y
            if (r0 == 0) goto L4d
            long r1 = r7.f20501Z
            long r3 = r1 - r8
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 >= 0) goto L30
        L14:
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 <= 0) goto L25
            oi.u r0 = r0.f20542g
            p214m2.C4339q.m9704i(r0)
            int r3 = r0.f20538c
            int r4 = r0.f20537b
            int r3 = r3 - r4
            long r3 = (long) r3
            long r1 = r1 - r3
            goto L14
        L25:
            byte[] r3 = r0.f20536a
            int r0 = r0.f20537b
            long r4 = (long) r0
            long r4 = r4 + r8
            long r4 = r4 - r1
            int r8 = (int) r4
            r8 = r3[r8]
            goto L5d
        L30:
            r1 = 0
        L32:
            int r3 = r0.f20538c
            int r4 = r0.f20537b
            int r3 = r3 - r4
            long r5 = (long) r3
            long r5 = r5 + r1
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 <= 0) goto L46
            byte[] r0 = r0.f20536a
            long r3 = (long) r4
            long r3 = r3 + r8
            long r3 = r3 - r1
            int r8 = (int) r3
            r8 = r0[r8]
            goto L5d
        L46:
            oi.u r0 = r0.f20541f
            p214m2.C4339q.m9704i(r0)
            r1 = r5
            goto L32
        L4d:
            r0 = 0
            r1 = -1
            p214m2.C4339q.m9704i(r0)
            byte[] r3 = r0.f20536a
            int r0 = r0.f20537b
            long r4 = (long) r0
            long r4 = r4 + r8
            long r4 = r4 - r1
            int r8 = (int) r4
            r8 = r3[r8]
        L5d:
            return r8
    }

    /* renamed from: V */
    public long m11555V(byte r10, long r11, long r13) {
            r9 = this;
            r0 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L7
            goto Ld
        L7:
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 < 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto Lb9
            long r2 = r9.f20501Z
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 <= 0) goto L17
            r13 = r2
        L17:
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 != 0) goto L1d
            goto Lb6
        L1d:
            oi.u r4 = r9.f20500Y
            if (r4 == 0) goto Lb6
            long r5 = r2 - r11
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 >= 0) goto L6e
        L27:
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 <= 0) goto L38
            oi.u r4 = r4.f20542g
            p214m2.C4339q.m9704i(r4)
            int r0 = r4.f20538c
            int r1 = r4.f20537b
            int r0 = r0 - r1
            long r0 = (long) r0
            long r2 = r2 - r0
            goto L27
        L38:
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 >= 0) goto Lb6
            byte[] r0 = r4.f20536a
            int r1 = r4.f20538c
            long r5 = (long) r1
            int r1 = r4.f20537b
            long r7 = (long) r1
            long r7 = r7 + r13
            long r7 = r7 - r2
            long r5 = java.lang.Math.min(r5, r7)
            int r1 = (int) r5
            int r5 = r4.f20537b
            long r5 = (long) r5
            long r5 = r5 + r11
            long r5 = r5 - r2
            int r11 = (int) r5
        L51:
            if (r11 >= r1) goto L60
            r12 = r0[r11]
            if (r12 != r10) goto L5d
            int r10 = r4.f20537b
            int r11 = r11 - r10
            long r10 = (long) r11
            long r10 = r10 + r2
            goto Lb8
        L5d:
            int r11 = r11 + 1
            goto L51
        L60:
            int r11 = r4.f20538c
            int r12 = r4.f20537b
            int r11 = r11 - r12
            long r11 = (long) r11
            long r2 = r2 + r11
            oi.u r4 = r4.f20541f
            p214m2.C4339q.m9704i(r4)
            r11 = r2
            goto L38
        L6e:
            int r2 = r4.f20538c
            int r3 = r4.f20537b
            int r2 = r2 - r3
            long r2 = (long) r2
            long r2 = r2 + r0
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 <= 0) goto Laf
        L79:
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 >= 0) goto Lb6
            byte[] r2 = r4.f20536a
            int r3 = r4.f20538c
            long r5 = (long) r3
            int r3 = r4.f20537b
            long r7 = (long) r3
            long r7 = r7 + r13
            long r7 = r7 - r0
            long r5 = java.lang.Math.min(r5, r7)
            int r3 = (int) r5
            int r5 = r4.f20537b
            long r5 = (long) r5
            long r5 = r5 + r11
            long r5 = r5 - r0
            int r11 = (int) r5
        L92:
            if (r11 >= r3) goto La1
            r12 = r2[r11]
            if (r12 != r10) goto L9e
            int r10 = r4.f20537b
            int r11 = r11 - r10
            long r10 = (long) r11
            long r10 = r10 + r0
            goto Lb8
        L9e:
            int r11 = r11 + 1
            goto L92
        La1:
            int r11 = r4.f20538c
            int r12 = r4.f20537b
            int r11 = r11 - r12
            long r11 = (long) r11
            long r0 = r0 + r11
            oi.u r4 = r4.f20541f
            p214m2.C4339q.m9704i(r4)
            r11 = r0
            goto L79
        Laf:
            oi.u r4 = r4.f20541f
            p214m2.C4339q.m9704i(r4)
            r0 = r2
            goto L6e
        Lb6:
            r10 = -1
        Lb8:
            return r10
        Lb9:
            java.lang.String r10 = "size="
            java.lang.StringBuilder r10 = android.support.v4.media.C0144c.m256a(r10)
            long r0 = r9.f20501Z
            r10.append(r0)
            java.lang.String r0 = " fromIndex="
            r10.append(r0)
            r10.append(r11)
            java.lang.String r11 = " toIndex="
            r10.append(r11)
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: W */
    public java.lang.String mo11556W(long r12) {
            r11 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L8f
            r0 = 1
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 != 0) goto L17
            goto L19
        L17:
            long r2 = r12 + r0
        L19:
            r4 = 10
            byte r10 = (byte) r4
            r6 = 0
            r4 = r11
            r5 = r10
            r8 = r2
            long r4 = r4.m11555V(r5, r6, r8)
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L30
            java.lang.String r12 = p277pi.C5527a.m11787a(r11, r4)
            goto L4b
        L30:
            long r4 = r11.f20501Z
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L4c
            long r0 = r2 - r0
            byte r0 = r11.m11554S(r0)
            r1 = 13
            byte r1 = (byte) r1
            if (r0 != r1) goto L4c
            byte r0 = r11.m11554S(r2)
            if (r0 != r10) goto L4c
            java.lang.String r12 = p277pi.C5527a.m11787a(r11, r2)
        L4b:
            return r12
        L4c:
            oi.e r6 = new oi.e
            r6.<init>()
            r2 = 0
            r0 = 32
            long r4 = r11.f20501Z
            long r0 = (long) r0
            long r4 = java.lang.Math.min(r0, r4)
            r0 = r11
            r1 = r6
            r0.m11553R(r1, r2, r4)
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.String r1 = "\\n not found: limit="
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            long r2 = r11.f20501Z
            long r12 = java.lang.Math.min(r2, r12)
            r1.append(r12)
            java.lang.String r12 = " content="
            r1.append(r12)
            oi.i r12 = r6.m11560b0()
            java.lang.String r12 = r12.mo11586k()
            r1.append(r12)
            r12 = 8230(0x2026, float:1.1533E-41)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        L8f:
            java.lang.String r0 = "limit < 0: "
            java.lang.String r12 = p382w0.C6774a.m13748a(r0, r12)
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
    }

    /* renamed from: Z */
    public int m11557Z(byte[] r8, int r9, int r10) {
            r7 = this;
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            p080ei.C1854b.m4602d(r1, r3, r5)
            oi.u r0 = r7.f20500Y
            if (r0 == 0) goto L36
            int r1 = r0.f20538c
            int r2 = r0.f20537b
            int r1 = r1 - r2
            int r10 = java.lang.Math.min(r10, r1)
            byte[] r1 = r0.f20536a
            int r2 = r0.f20537b
            int r3 = r2 + r10
            p062dh.C1468d.m3983E(r1, r8, r9, r2, r3)
            int r8 = r0.f20537b
            int r8 = r8 + r10
            r0.f20537b = r8
            long r1 = r7.f20501Z
            long r3 = (long) r10
            long r1 = r1 - r3
            r7.f20501Z = r1
            int r9 = r0.f20538c
            if (r8 != r9) goto L37
            oi.u r8 = r0.m11604a()
            r7.f20500Y = r8
            p260oi.C5300v.m11608b(r0)
            goto L37
        L36:
            r10 = -1
        L37:
            return r10
    }

    /* renamed from: a */
    public p260oi.C5283e m11558a() {
            r6 = this;
            oi.e r0 = new oi.e
            r0.<init>()
            long r1 = r6.f20501Z
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto Le
            goto L37
        Le:
            oi.u r1 = r6.f20500Y
            p214m2.C4339q.m9704i(r1)
            oi.u r2 = r1.m11606c()
            r0.f20500Y = r2
            r2.f20542g = r2
            r2.f20541f = r2
            oi.u r3 = r1.f20541f
        L1f:
            if (r3 == r1) goto L33
            oi.u r4 = r2.f20542g
            p214m2.C4339q.m9704i(r4)
            p214m2.C4339q.m9704i(r3)
            oi.u r5 = r3.m11606c()
            r4.m11605b(r5)
            oi.u r3 = r3.f20541f
            goto L1f
        L33:
            long r1 = r6.f20501Z
            r0.f20501Z = r1
        L37:
            return r0
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: b */
    public void mo11559b(long r8) {
            r7 = this;
        L0:
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L35
            oi.u r0 = r7.f20500Y
            if (r0 == 0) goto L2f
            int r1 = r0.f20538c
            int r2 = r0.f20537b
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r8, r1)
            int r2 = (int) r1
            long r3 = r7.f20501Z
            long r5 = (long) r2
            long r3 = r3 - r5
            r7.f20501Z = r3
            long r8 = r8 - r5
            int r1 = r0.f20537b
            int r1 = r1 + r2
            r0.f20537b = r1
            int r2 = r0.f20538c
            if (r1 != r2) goto L0
            oi.u r1 = r0.m11604a()
            r7.f20500Y = r1
            p260oi.C5300v.m11608b(r0)
            goto L0
        L2f:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>()
            throw r8
        L35:
            return
    }

    /* renamed from: b0 */
    public p260oi.C5287i m11560b0() {
            r2 = this;
            long r0 = r2.f20501Z
            oi.i r0 = r2.mo11571q(r0)
            return r0
    }

    @Override // p260oi.InterfaceC5286h, p260oi.InterfaceC5285g
    /* renamed from: c */
    public p260oi.C5283e mo11561c() {
            r0 = this;
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            oi.e r0 = r1.m11558a()
            return r0
    }

    @Override // p260oi.InterfaceC5304z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    @Override // p260oi.InterfaceC5304z
    /* renamed from: d */
    public p260oi.C5279a0 mo7463d() {
            r1 = this;
            oi.a0 r0 = p260oi.C5279a0.f20485d
            return r0
    }

    /* renamed from: d0 */
    public short m11562d0() {
            r2 = this;
            short r0 = r2.readShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r0
            int r1 = r1 >>> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r0 = r0 | r1
            short r0 = (short) r0
            return r0
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: e */
    public /* bridge */ /* synthetic */ p260oi.InterfaceC5285g mo11563e(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.m11536B0(r1, r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Lb
        L8:
            r2 = 1
            goto L78
        Lb:
            boolean r4 = r1 instanceof p260oi.C5283e
            if (r4 != 0) goto L11
            goto L78
        L11:
            long r4 = r0.f20501Z
            oi.e r1 = (p260oi.C5283e) r1
            long r6 = r1.f20501Z
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L1c
            goto L78
        L1c:
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L23
            goto L8
        L23:
            oi.u r4 = r0.f20500Y
            p214m2.C4339q.m9704i(r4)
            oi.u r1 = r1.f20500Y
            p214m2.C4339q.m9704i(r1)
            int r5 = r4.f20537b
            int r8 = r1.f20537b
            r9 = r6
        L32:
            long r11 = r0.f20501Z
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L8
            int r11 = r4.f20538c
            int r11 = r11 - r5
            int r12 = r1.f20538c
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r6
        L44:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L60
            byte[] r15 = r4.f20536a
            int r16 = r5 + 1
            r5 = r15[r5]
            byte[] r15 = r1.f20536a
            int r17 = r8 + 1
            r8 = r15[r8]
            if (r5 == r8) goto L57
            goto L78
        L57:
            r18 = 1
            long r13 = r13 + r18
            r5 = r16
            r8 = r17
            goto L44
        L60:
            int r13 = r4.f20538c
            if (r5 != r13) goto L6b
            oi.u r4 = r4.f20541f
            p214m2.C4339q.m9704i(r4)
            int r5 = r4.f20537b
        L6b:
            int r13 = r1.f20538c
            if (r8 != r13) goto L76
            oi.u r1 = r1.f20541f
            p214m2.C4339q.m9704i(r1)
            int r8 = r1.f20537b
        L76:
            long r9 = r9 + r11
            goto L32
        L78:
            return r2
    }

    /* renamed from: f0 */
    public java.lang.String m11564f0(long r8, java.nio.charset.Charset r10) {
            r7 = this;
            java.lang.String r0 = "charset"
            p214m2.C4339q.m9706k(r10, r0)
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L15
            r0 = 2147483647(0x7fffffff, float:NaN)
            long r0 = (long) r0
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 > 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L63
            long r0 = r7.f20501Z
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 < 0) goto L5d
            if (r2 != 0) goto L23
            java.lang.String r8 = ""
            return r8
        L23:
            oi.u r0 = r7.f20500Y
            p214m2.C4339q.m9704i(r0)
            int r1 = r0.f20537b
            long r2 = (long) r1
            long r2 = r2 + r8
            int r4 = r0.f20538c
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L3d
            byte[] r8 = r7.mo11549K(r8)
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8, r10)
            return r9
        L3d:
            byte[] r2 = r0.f20536a
            int r3 = (int) r8
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2, r1, r3, r10)
            int r10 = r0.f20537b
            int r10 = r10 + r3
            r0.f20537b = r10
            long r1 = r7.f20501Z
            long r1 = r1 - r8
            r7.f20501Z = r1
            int r8 = r0.f20538c
            if (r10 != r8) goto L5c
            oi.u r8 = r0.m11604a()
            r7.f20500Y = r8
            p260oi.C5300v.m11608b(r0)
        L5c:
            return r4
        L5d:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>()
            throw r8
        L63:
            java.lang.String r10 = "byteCount: "
            java.lang.String r8 = p382w0.C6774a.m13748a(r10, r8)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
    }

    @Override // p260oi.InterfaceC5285g, p260oi.InterfaceC5302x, java.io.Flushable
    public void flush() {
            r0 = this;
            return
    }

    public int hashCode() {
            r5 = this;
            oi.u r0 = r5.f20500Y
            if (r0 == 0) goto L1f
            r1 = 1
        L5:
            int r2 = r0.f20537b
            int r3 = r0.f20538c
        L9:
            if (r2 >= r3) goto L15
            int r1 = r1 * 31
            byte[] r4 = r0.f20536a
            r4 = r4[r2]
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto L9
        L15:
            oi.u r0 = r0.f20541f
            p214m2.C4339q.m9704i(r0)
            oi.u r2 = r5.f20500Y
            if (r0 != r2) goto L5
            goto L20
        L1f:
            r1 = 0
        L20:
            return r1
    }

    /* renamed from: i0 */
    public java.lang.String m11565i0() {
            r3 = this;
            long r0 = r3.f20501Z
            java.nio.charset.Charset r2 = p362uh.C6455a.f25034b
            java.lang.String r0 = r3.m11564f0(r0, r2)
            return r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p260oi.InterfaceC5304z
    /* renamed from: j0 */
    public long mo4683j0(p260oi.C5283e r6, long r7) {
            r5 = this;
            java.lang.String r0 = "sink"
            p214m2.C4339q.m9706k(r6, r0)
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto L23
            long r2 = r5.f20501Z
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L19
            r6 = -1
            goto L22
        L19:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1e
            r7 = r2
        L1e:
            r6.mo5749p0(r5, r7)
            r6 = r7
        L22:
            return r6
        L23:
            java.lang.String r6 = "byteCount < 0: "
            java.lang.String r6 = p382w0.C6774a.m13748a(r6, r7)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: k0 */
    public void mo11566k0(long r4) {
            r3 = this;
            long r0 = r3.f20501Z
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L7
            return
        L7:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: l0 */
    public /* bridge */ /* synthetic */ p260oi.InterfaceC5285g mo11567l0(java.lang.String r1) {
            r0 = this;
            r0.m11547I0(r1)
            return r0
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: m */
    public /* bridge */ /* synthetic */ p260oi.InterfaceC5285g mo11568m(long r1) {
            r0 = this;
            oi.e r1 = r0.m11542F0(r1)
            return r1
    }

    /* renamed from: m0 */
    public java.lang.String m11569m0(long r2) {
            r1 = this;
            java.nio.charset.Charset r0 = p362uh.C6455a.f25034b
            java.lang.String r2 = r1.m11564f0(r2, r0)
            return r2
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: n0 */
    public /* bridge */ /* synthetic */ p260oi.InterfaceC5285g mo11570n0(long r1) {
            r0 = this;
            oi.e r1 = r0.m11540E0(r1)
            return r1
    }

    @Override // p260oi.InterfaceC5302x
    /* renamed from: p0 */
    public void mo5749p0(p260oi.C5283e r13, long r14) {
            r12 = this;
            java.lang.String r0 = "source"
            p214m2.C4339q.m9706k(r13, r0)
            r0 = 1
            r1 = 0
            if (r13 == r12) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            if (r2 == 0) goto L13d
            long r3 = r13.f20501Z
            r5 = 0
            r7 = r14
            p080ei.C1854b.m4602d(r3, r5, r7)
        L16:
            r2 = 0
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 <= 0) goto L13c
            oi.u r2 = r13.f20500Y
            p214m2.C4339q.m9704i(r2)
            int r2 = r2.f20538c
            oi.u r3 = r13.f20500Y
            p214m2.C4339q.m9704i(r3)
            int r3 = r3.f20537b
            int r2 = r2 - r3
            long r2 = (long) r2
            r4 = 8192(0x2000, float:1.148E-41)
            int r5 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r5 >= 0) goto Lba
            oi.u r2 = r12.f20500Y
            if (r2 == 0) goto L3c
            p214m2.C4339q.m9704i(r2)
            oi.u r2 = r2.f20542g
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L6b
            boolean r3 = r2.f20540e
            if (r3 == 0) goto L6b
            int r3 = r2.f20538c
            long r5 = (long) r3
            long r5 = r5 + r14
            boolean r3 = r2.f20539d
            if (r3 == 0) goto L4d
            r3 = 0
            goto L4f
        L4d:
            int r3 = r2.f20537b
        L4f:
            long r7 = (long) r3
            long r5 = r5 - r7
            long r7 = (long) r4
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 > 0) goto L6b
            oi.u r0 = r13.f20500Y
            p214m2.C4339q.m9704i(r0)
            int r1 = (int) r14
            r0.m11607d(r2, r1)
            long r0 = r13.f20501Z
            long r0 = r0 - r14
            r13.f20501Z = r0
            long r0 = r12.f20501Z
            long r0 = r0 + r14
            r12.f20501Z = r0
            goto L13c
        L6b:
            oi.u r2 = r13.f20500Y
            p214m2.C4339q.m9704i(r2)
            int r3 = (int) r14
            if (r3 <= 0) goto L7c
            int r5 = r2.f20538c
            int r6 = r2.f20537b
            int r5 = r5 - r6
            if (r3 > r5) goto L7c
            r5 = 1
            goto L7d
        L7c:
            r5 = 0
        L7d:
            if (r5 == 0) goto Lae
            r5 = 1024(0x400, float:1.435E-42)
            if (r3 < r5) goto L88
            oi.u r5 = r2.m11606c()
            goto L99
        L88:
            oi.u r5 = p260oi.C5300v.m11609c()
            byte[] r6 = r2.f20536a
            byte[] r7 = r5.f20536a
            r8 = 0
            int r9 = r2.f20537b
            int r10 = r9 + r3
            r11 = 2
            p062dh.C1468d.m3984F(r6, r7, r8, r9, r10, r11)
        L99:
            int r6 = r5.f20537b
            int r6 = r6 + r3
            r5.f20538c = r6
            int r6 = r2.f20537b
            int r6 = r6 + r3
            r2.f20537b = r6
            oi.u r2 = r2.f20542g
            p214m2.C4339q.m9704i(r2)
            r2.m11605b(r5)
            r13.f20500Y = r5
            goto Lba
        Lae:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "byteCount out of range"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        Lba:
            oi.u r2 = r13.f20500Y
            p214m2.C4339q.m9704i(r2)
            int r3 = r2.f20538c
            int r5 = r2.f20537b
            int r3 = r3 - r5
            long r5 = (long) r3
            oi.u r3 = r2.m11604a()
            r13.f20500Y = r3
            oi.u r3 = r12.f20500Y
            if (r3 != 0) goto Ld6
            r12.f20500Y = r2
            r2.f20542g = r2
            r2.f20541f = r2
            goto L123
        Ld6:
            p214m2.C4339q.m9704i(r3)
            oi.u r3 = r3.f20542g
            p214m2.C4339q.m9704i(r3)
            r3.m11605b(r2)
            oi.u r3 = r2.f20542g
            if (r3 == r2) goto Le7
            r7 = 1
            goto Le8
        Le7:
            r7 = 0
        Le8:
            if (r7 == 0) goto L130
            p214m2.C4339q.m9704i(r3)
            boolean r3 = r3.f20540e
            if (r3 != 0) goto Lf2
            goto L123
        Lf2:
            int r3 = r2.f20538c
            int r7 = r2.f20537b
            int r3 = r3 - r7
            oi.u r7 = r2.f20542g
            p214m2.C4339q.m9704i(r7)
            int r7 = r7.f20538c
            int r4 = r4 - r7
            oi.u r7 = r2.f20542g
            p214m2.C4339q.m9704i(r7)
            boolean r7 = r7.f20539d
            if (r7 == 0) goto L10a
            r7 = 0
            goto L111
        L10a:
            oi.u r7 = r2.f20542g
            p214m2.C4339q.m9704i(r7)
            int r7 = r7.f20537b
        L111:
            int r4 = r4 + r7
            if (r3 <= r4) goto L115
            goto L123
        L115:
            oi.u r4 = r2.f20542g
            p214m2.C4339q.m9704i(r4)
            r2.m11607d(r4, r3)
            r2.m11604a()
            p260oi.C5300v.m11608b(r2)
        L123:
            long r2 = r13.f20501Z
            long r2 = r2 - r5
            r13.f20501Z = r2
            long r2 = r12.f20501Z
            long r2 = r2 + r5
            r12.f20501Z = r2
            long r14 = r14 - r5
            goto L16
        L130:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "cannot compact"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L13c:
            return
        L13d:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "source == this"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: q */
    public p260oi.C5287i mo11571q(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L10
            r0 = 2147483647(0x7fffffff, float:NaN)
            long r0 = (long) r0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L39
            long r0 = r3.f20501Z
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L33
            r0 = 4096(0x1000, float:5.74E-42)
            long r0 = (long) r0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L29
            int r0 = (int) r4
            oi.i r0 = r3.m11579x0(r0)
            r3.mo11559b(r4)
            goto L32
        L29:
            oi.i r0 = new oi.i
            byte[] r4 = r3.mo11549K(r4)
            r0.<init>(r4)
        L32:
            return r0
        L33:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
        L39:
            java.lang.String r0 = "byteCount: "
            java.lang.String r4 = p382w0.C6774a.m13748a(r0, r4)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer r7) {
            r6 = this;
            java.lang.String r0 = "sink"
            p214m2.C4339q.m9706k(r7, r0)
            oi.u r0 = r6.f20500Y
            if (r0 == 0) goto L36
            int r1 = r7.remaining()
            int r2 = r0.f20538c
            int r3 = r0.f20537b
            int r2 = r2 - r3
            int r1 = java.lang.Math.min(r1, r2)
            byte[] r2 = r0.f20536a
            int r3 = r0.f20537b
            r7.put(r2, r3, r1)
            int r7 = r0.f20537b
            int r7 = r7 + r1
            r0.f20537b = r7
            long r2 = r6.f20501Z
            long r4 = (long) r1
            long r2 = r2 - r4
            r6.f20501Z = r2
            int r2 = r0.f20538c
            if (r7 != r2) goto L35
            oi.u r7 = r0.m11604a()
            r6.f20500Y = r7
            p260oi.C5300v.m11608b(r0)
        L35:
            return r1
        L36:
            r7 = -1
            return r7
    }

    @Override // p260oi.InterfaceC5286h
    public byte readByte() {
            r9 = this;
            long r0 = r9.f20501Z
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L2d
            oi.u r0 = r9.f20500Y
            p214m2.C4339q.m9704i(r0)
            int r1 = r0.f20537b
            int r2 = r0.f20538c
            byte[] r3 = r0.f20536a
            int r4 = r1 + 1
            r1 = r3[r1]
            long r5 = r9.f20501Z
            r7 = 1
            long r5 = r5 - r7
            r9.f20501Z = r5
            if (r4 != r2) goto L2a
            oi.u r2 = r0.m11604a()
            r9.f20500Y = r2
            p260oi.C5300v.m11608b(r0)
            goto L2c
        L2a:
            r0.f20537b = r4
        L2c:
            return r1
        L2d:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // p260oi.InterfaceC5286h
    public int readInt() {
            r8 = this;
            long r0 = r8.f20501Z
            r2 = 4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L72
            oi.u r0 = r8.f20500Y
            p214m2.C4339q.m9704i(r0)
            int r1 = r0.f20537b
            int r4 = r0.f20538c
            int r5 = r4 - r1
            long r5 = (long) r5
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L3a
            byte r0 = r8.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            byte r1 = r8.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            byte r1 = r8.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r1 = r8.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            goto L71
        L3a:
            byte[] r5 = r0.f20536a
            int r6 = r1 + 1
            r1 = r5[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            int r7 = r6 + 1
            r6 = r5[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r1 = r1 | r6
            int r6 = r7 + 1
            r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r1 = r1 | r7
            int r7 = r6 + 1
            r5 = r5[r6]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r1 = r1 | r5
            long r5 = r8.f20501Z
            long r5 = r5 - r2
            r8.f20501Z = r5
            if (r7 != r4) goto L6e
            oi.u r2 = r0.m11604a()
            r8.f20500Y = r2
            p260oi.C5300v.m11608b(r0)
            goto L70
        L6e:
            r0.f20537b = r7
        L70:
            r0 = r1
        L71:
            return r0
        L72:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // p260oi.InterfaceC5286h
    public short readShort() {
            r8 = this;
            long r0 = r8.f20501Z
            r2 = 2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L4d
            oi.u r0 = r8.f20500Y
            p214m2.C4339q.m9704i(r0)
            int r1 = r0.f20537b
            int r4 = r0.f20538c
            int r5 = r4 - r1
            r6 = 2
            if (r5 >= r6) goto L27
            byte r0 = r8.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            byte r1 = r8.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            short r0 = (short) r0
            goto L4c
        L27:
            byte[] r5 = r0.f20536a
            int r6 = r1 + 1
            r1 = r5[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r7 = r6 + 1
            r5 = r5[r6]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r1 = r1 | r5
            long r5 = r8.f20501Z
            long r5 = r5 - r2
            r8.f20501Z = r5
            if (r7 != r4) goto L49
            oi.u r2 = r0.m11604a()
            r8.f20500Y = r2
            p260oi.C5300v.m11608b(r0)
            goto L4b
        L49:
            r0.f20537b = r7
        L4b:
            short r0 = (short) r1
        L4c:
            return r0
        L4d:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    /* renamed from: s0 */
    public int m11572s0() {
            r12 = this;
            long r0 = r12.f20501Z
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La4
            byte r0 = r12.m11554S(r2)
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 1
            r3 = 128(0x80, float:1.8E-43)
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r1 != 0) goto L1b
            r1 = r0 & 127(0x7f, float:1.78E-43)
            r5 = 1
            r6 = 0
            goto L3e
        L1b:
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L27
            r1 = r0 & 31
            r5 = 2
            r6 = 128(0x80, float:1.8E-43)
            goto L3e
        L27:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r1 != r5) goto L33
            r1 = r0 & 15
            r5 = 3
            r6 = 2048(0x800, float:2.87E-42)
            goto L3e
        L33:
            r1 = r0 & 248(0xf8, float:3.48E-43)
            r5 = 240(0xf0, float:3.36E-43)
            if (r1 != r5) goto L9e
            r1 = r0 & 7
            r5 = 4
            r6 = 65536(0x10000, float:9.1835E-41)
        L3e:
            long r7 = r12.f20501Z
            long r9 = (long) r5
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L76
        L45:
            if (r2 >= r5) goto L5c
            long r7 = (long) r2
            byte r0 = r12.m11554S(r7)
            r11 = r0 & 192(0xc0, float:2.69E-43)
            if (r11 != r3) goto L58
            int r1 = r1 << 6
            r0 = r0 & 63
            r1 = r1 | r0
            int r2 = r2 + 1
            goto L45
        L58:
            r12.mo11559b(r7)
            goto La3
        L5c:
            r12.mo11559b(r9)
            r0 = 1114111(0x10ffff, float:1.561202E-39)
            if (r1 <= r0) goto L65
            goto La3
        L65:
            r0 = 57343(0xdfff, float:8.0355E-41)
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r2 <= r1) goto L6e
            goto L71
        L6e:
            if (r0 < r1) goto L71
            goto La3
        L71:
            if (r1 >= r6) goto L74
            goto La3
        L74:
            r4 = r1
            goto La3
        L76:
            java.io.EOFException r1 = new java.io.EOFException
            java.lang.String r2 = "size < "
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = androidx.appcompat.widget.C0300r0.m777a(r2, r5, r3)
            long r3 = r12.f20501Z
            r2.append(r3)
            java.lang.String r3 = " (to read code point prefixed 0x"
            r2.append(r3)
            java.lang.String r0 = p080ei.C1854b.m4613o(r0)
            r2.append(r0)
            r0 = 41
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L9e:
            r0 = 1
            r12.mo11559b(r0)
        La3:
            return r4
        La4:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: t */
    public long mo11573t(p260oi.InterfaceC5302x r6) {
            r5 = this;
            long r0 = r5.f20501Z
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Ld
            oi.e r6 = (p260oi.C5283e) r6
            r6.mo5749p0(r5, r0)
        Ld:
            return r0
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: t0 */
    public long mo11574t0() {
            r15 = this;
            long r0 = r15.f20501Z
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La8
            r0 = 0
            r1 = 0
            r4 = r2
        Lb:
            oi.u r6 = r15.f20500Y
            p214m2.C4339q.m9704i(r6)
            byte[] r7 = r6.f20536a
            int r8 = r6.f20537b
            int r9 = r6.f20538c
        L16:
            if (r8 >= r9) goto L8d
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L27
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L27
            int r11 = r10 - r11
            goto L40
        L27:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L32
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L32
            goto L3c
        L32:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L72
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L72
        L3c:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L40:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L50
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L50:
            oi.e r0 = new oi.e
            r0.<init>()
            r0.m11542F0(r4)
            r0.m11539D0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r0 = r0.m11565i0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L72:
            if (r0 == 0) goto L76
            r1 = 1
            goto L8d
        L76:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = p080ei.C1854b.m4613o(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8d:
            if (r8 != r9) goto L99
            oi.u r7 = r6.m11604a()
            r15.f20500Y = r7
            p260oi.C5300v.m11608b(r6)
            goto L9b
        L99:
            r6.f20537b = r8
        L9b:
            if (r1 != 0) goto La1
            oi.u r6 = r15.f20500Y
            if (r6 != 0) goto Lb
        La1:
            long r1 = r15.f20501Z
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f20501Z = r1
            return r4
        La8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    public java.lang.String toString() {
            r5 = this;
            long r0 = r5.f20501Z
            r2 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            if (r2 == 0) goto L19
            int r1 = (int) r0
            oi.i r0 = r5.m11579x0(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L19:
            java.lang.String r0 = "size > Int.MAX_VALUE: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r5.f20501Z
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: u0 */
    public java.lang.String mo11575u0(java.nio.charset.Charset r3) {
            r2 = this;
            long r0 = r2.f20501Z
            java.lang.String r3 = r2.m11564f0(r0, r3)
            return r3
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: v */
    public /* bridge */ /* synthetic */ p260oi.InterfaceC5285g mo11576v(int r1) {
            r0 = this;
            r0.m11545H0(r1)
            return r0
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: w */
    public boolean mo11577w(long r4) {
            r3 = this;
            long r0 = r3.f20501Z
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L8
            r4 = 1
            goto L9
        L8:
            r4 = 0
        L9:
            return r4
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: w0 */
    public java.io.InputStream mo11578w0() {
            r1 = this;
            oi.e$a r0 = new oi.e$a
            r0.<init>(r1)
            return r0
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r7) {
            r6 = this;
            java.lang.String r0 = "source"
            p214m2.C4339q.m9706k(r7, r0)
            int r0 = r7.remaining()
            r1 = r0
        La:
            if (r1 <= 0) goto L27
            r2 = 1
            oi.u r2 = r6.m11580y0(r2)
            int r3 = r2.f20538c
            int r3 = 8192 - r3
            int r3 = java.lang.Math.min(r1, r3)
            byte[] r4 = r2.f20536a
            int r5 = r2.f20538c
            r7.get(r4, r5, r3)
            int r1 = r1 - r3
            int r4 = r2.f20538c
            int r4 = r4 + r3
            r2.f20538c = r4
            goto La
        L27:
            long r1 = r6.f20501Z
            long r3 = (long) r0
            long r1 = r1 + r3
            r6.f20501Z = r1
            return r0
    }

    /* renamed from: x0 */
    public final p260oi.C5287i m11579x0(int r9) {
            r8 = this;
            if (r9 != 0) goto L5
            oi.i r9 = p260oi.C5287i.f20504b0
            goto L5d
        L5:
            long r0 = r8.f20501Z
            r2 = 0
            long r4 = (long) r9
            p080ei.C1854b.m4602d(r0, r2, r4)
            oi.u r0 = r8.f20500Y
            r1 = 0
            r2 = 0
            r3 = 0
        L12:
            if (r2 >= r9) goto L2c
            p214m2.C4339q.m9704i(r0)
            int r4 = r0.f20538c
            int r5 = r0.f20537b
            if (r4 == r5) goto L24
            int r4 = r4 - r5
            int r2 = r2 + r4
            int r3 = r3 + 1
            oi.u r0 = r0.f20541f
            goto L12
        L24:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r0 = "s.limit == s.pos"
            r9.<init>(r0)
            throw r9
        L2c:
            byte[][] r0 = new byte[r3][]
            int r2 = r3 * 2
            int[] r2 = new int[r2]
            oi.u r4 = r8.f20500Y
            r5 = r4
            r4 = 0
        L36:
            if (r1 >= r9) goto L58
            p214m2.C4339q.m9704i(r5)
            byte[] r6 = r5.f20536a
            r0[r4] = r6
            int r6 = r5.f20538c
            int r7 = r5.f20537b
            int r6 = r6 - r7
            int r1 = r1 + r6
            int r6 = java.lang.Math.min(r1, r9)
            r2[r4] = r6
            int r6 = r4 + r3
            int r7 = r5.f20537b
            r2[r6] = r7
            r6 = 1
            r5.f20539d = r6
            int r4 = r4 + r6
            oi.u r5 = r5.f20541f
            goto L36
        L58:
            oi.w r9 = new oi.w
            r9.<init>(r0, r2)
        L5d:
            return r9
    }

    /* renamed from: y0 */
    public final p260oi.C5299u m11580y0(int r4) {
            r3 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1 = 1
            if (r4 < r1) goto L8
            if (r4 > r0) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            if (r1 == 0) goto L36
            oi.u r1 = r3.f20500Y
            if (r1 != 0) goto L1a
            oi.u r4 = p260oi.C5300v.m11609c()
            r3.f20500Y = r4
            r4.f20542g = r4
            r4.f20541f = r4
            goto L35
        L1a:
            p214m2.C4339q.m9704i(r1)
            oi.u r1 = r1.f20542g
            p214m2.C4339q.m9704i(r1)
            int r2 = r1.f20538c
            int r2 = r2 + r4
            if (r2 > r0) goto L2e
            boolean r4 = r1.f20540e
            if (r4 != 0) goto L2c
            goto L2e
        L2c:
            r4 = r1
            goto L35
        L2e:
            oi.u r4 = p260oi.C5300v.m11609c()
            r1.m11605b(r4)
        L35:
            return r4
        L36:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unexpected capacity"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: z */
    public /* bridge */ /* synthetic */ p260oi.InterfaceC5285g mo11581z(int r1) {
            r0 = this;
            r0.m11544G0(r1)
            return r0
    }

    /* renamed from: z0 */
    public p260oi.C5283e m11582z0(p260oi.C5287i r3) {
            r2 = this;
            java.lang.String r0 = "byteString"
            p214m2.C4339q.m9706k(r3, r0)
            int r0 = r3.mo11585h()
            r1 = 0
            r3.mo11593t(r2, r1, r0)
            return r2
    }
}
