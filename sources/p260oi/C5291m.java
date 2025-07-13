package p260oi;

/* renamed from: oi.m */
/* loaded from: classes.dex */
public final class C5291m implements p260oi.InterfaceC5304z {

    /* renamed from: Y */
    public byte f20512Y;

    /* renamed from: Z */
    public final p260oi.C5298t f20513Z;

    /* renamed from: a0 */
    public final java.util.zip.Inflater f20514a0;

    /* renamed from: b0 */
    public final p260oi.C5292n f20515b0;

    /* renamed from: c0 */
    public final java.util.zip.CRC32 f20516c0;

    public C5291m(p260oi.InterfaceC5304z r3) {
            r2 = this;
            java.lang.String r0 = "source"
            p214m2.C4339q.m9706k(r3, r0)
            r2.<init>()
            oi.t r0 = new oi.t
            r0.<init>(r3)
            r2.f20513Z = r0
            java.util.zip.Inflater r3 = new java.util.zip.Inflater
            r1 = 1
            r3.<init>(r1)
            r2.f20514a0 = r3
            oi.n r1 = new oi.n
            r1.<init>(r0, r3)
            r2.f20515b0 = r1
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32
            r3.<init>()
            r2.f20516c0 = r3
            return
    }

    /* renamed from: a */
    public final void m11597a(java.lang.String r5, int r6, int r7) {
            r4 = this;
            if (r7 != r6) goto L3
            return
        L3:
            java.io.IOException r0 = new java.io.IOException
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r5] = r7
            r5 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r5] = r6
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r6 = "%s: actual 0x%08x != expected 0x%08x"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.String r6 = "java.lang.String.format(this, *args)"
            p214m2.C4339q.m9705j(r5, r6)
            r0.<init>(r5)
            throw r0
    }

    @Override // p260oi.InterfaceC5304z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            oi.n r0 = r1.f20515b0
            r0.close()
            return
    }

    @Override // p260oi.InterfaceC5304z
    /* renamed from: d */
    public p260oi.C5279a0 mo7463d() {
            r1 = this;
            oi.t r0 = r1.f20513Z
            oi.a0 r0 = r0.mo7463d()
            return r0
    }

    /* renamed from: h */
    public final void m11598h(p260oi.C5283e r6, long r7, long r9) {
            r5 = this;
            oi.u r6 = r6.f20500Y
        L2:
            p214m2.C4339q.m9704i(r6)
            int r0 = r6.f20538c
            int r1 = r6.f20537b
            int r2 = r0 - r1
            long r2 = (long) r2
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto L16
            int r0 = r0 - r1
            long r0 = (long) r0
            long r7 = r7 - r0
            oi.u r6 = r6.f20541f
            goto L2
        L16:
            r0 = 0
        L18:
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3a
            int r2 = r6.f20537b
            long r2 = (long) r2
            long r2 = r2 + r7
            int r7 = (int) r2
            int r8 = r6.f20538c
            int r8 = r8 - r7
            long r2 = (long) r8
            long r2 = java.lang.Math.min(r2, r9)
            int r8 = (int) r2
            java.util.zip.CRC32 r2 = r5.f20516c0
            byte[] r3 = r6.f20536a
            r2.update(r3, r7, r8)
            long r7 = (long) r8
            long r9 = r9 - r7
            oi.u r6 = r6.f20541f
            p214m2.C4339q.m9704i(r6)
            r7 = r0
            goto L18
        L3a:
            return
    }

    @Override // p260oi.InterfaceC5304z
    /* renamed from: j0 */
    public long mo4683j0(p260oi.C5283e r25, long r26) {
            r24 = this;
            r6 = r24
            r7 = r25
            r8 = r26
            java.lang.String r0 = "sink"
            p214m2.C4339q.m9706k(r7, r0)
            r0 = 0
            r10 = 0
            r11 = 1
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L15
            r3 = 1
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 == 0) goto L19c
            if (r2 != 0) goto L1b
            return r0
        L1b:
            byte r0 = r6.f20512Y
            r12 = -1
            if (r0 != 0) goto L143
            oi.t r0 = r6.f20513Z
            r1 = 10
            r0.mo11566k0(r1)
            oi.t r0 = r6.f20513Z
            oi.e r0 = r0.f20532Y
            r1 = 3
            byte r14 = r0.m11554S(r1)
            int r0 = r14 >> 1
            r0 = r0 & r11
            if (r0 != r11) goto L3a
            r0 = 1
            r15 = 1
            goto L3c
        L3a:
            r0 = 0
            r15 = 0
        L3c:
            if (r15 == 0) goto L4b
            oi.t r0 = r6.f20513Z
            oi.e r1 = r0.f20532Y
            r2 = 0
            r4 = 10
            r0 = r24
            r0.m11598h(r1, r2, r4)
        L4b:
            oi.t r0 = r6.f20513Z
            r1 = 2
            r0.mo11566k0(r1)
            oi.e r0 = r0.f20532Y
            short r0 = r0.readShort()
            r3 = 8075(0x1f8b, float:1.1315E-41)
            java.lang.String r4 = "ID1ID2"
            r6.m11597a(r4, r3, r0)
            oi.t r0 = r6.f20513Z
            r3 = 8
            r0.mo11559b(r3)
            int r0 = r14 >> 2
            r0 = r0 & r11
            if (r0 != r11) goto L6d
            r0 = 1
            goto L6e
        L6d:
            r0 = 0
        L6e:
            if (r0 == 0) goto Lab
            oi.t r0 = r6.f20513Z
            r0.mo11566k0(r1)
            if (r15 == 0) goto L84
            oi.t r0 = r6.f20513Z
            oi.e r1 = r0.f20532Y
            r2 = 0
            r4 = 2
            r0 = r24
            r0.m11598h(r1, r2, r4)
        L84:
            oi.t r0 = r6.f20513Z
            oi.e r0 = r0.f20532Y
            short r0 = r0.m11562d0()
            long r4 = (long) r0
            oi.t r0 = r6.f20513Z
            r0.mo11566k0(r4)
            if (r15 == 0) goto La2
            oi.t r0 = r6.f20513Z
            oi.e r1 = r0.f20532Y
            r2 = 0
            r0 = r24
            r16 = r4
            r0.m11598h(r1, r2, r4)
            goto La4
        La2:
            r16 = r4
        La4:
            oi.t r0 = r6.f20513Z
            r1 = r16
            r0.mo11559b(r1)
        Lab:
            int r0 = r14 >> 3
            r0 = r0 & r11
            if (r0 != r11) goto Lb2
            r0 = 1
            goto Lb3
        Lb2:
            r0 = 0
        Lb3:
            r16 = 1
            if (r0 == 0) goto Le9
            oi.t r0 = r6.f20513Z
            r19 = 0
            r20 = 0
            r22 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = r0
            long r18 = r18.m11602a(r19, r20, r22)
            int r0 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r0 == 0) goto Le3
            if (r15 == 0) goto Ldb
            oi.t r0 = r6.f20513Z
            oi.e r1 = r0.f20532Y
            r2 = 0
            long r4 = r18 + r16
            r0 = r24
            r0.m11598h(r1, r2, r4)
        Ldb:
            oi.t r0 = r6.f20513Z
            long r1 = r18 + r16
            r0.mo11559b(r1)
            goto Le9
        Le3:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Le9:
            int r0 = r14 >> 4
            r0 = r0 & r11
            if (r0 != r11) goto Lef
            r10 = 1
        Lef:
            if (r10 == 0) goto L120
            oi.t r0 = r6.f20513Z
            r1 = 0
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r18 = r0.m11602a(r1, r2, r4)
            int r0 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r0 == 0) goto L11a
            if (r15 == 0) goto L112
            oi.t r0 = r6.f20513Z
            oi.e r1 = r0.f20532Y
            r2 = 0
            long r4 = r18 + r16
            r0 = r24
            r0.m11598h(r1, r2, r4)
        L112:
            oi.t r0 = r6.f20513Z
            long r1 = r18 + r16
            r0.mo11559b(r1)
            goto L120
        L11a:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L120:
            if (r15 == 0) goto L141
            oi.t r0 = r6.f20513Z
            r1 = 2
            r0.mo11566k0(r1)
            oi.e r0 = r0.f20532Y
            short r0 = r0.m11562d0()
            java.util.zip.CRC32 r1 = r6.f20516c0
            long r1 = r1.getValue()
            int r2 = (int) r1
            short r1 = (short) r2
            java.lang.String r2 = "FHCRC"
            r6.m11597a(r2, r0, r1)
            java.util.zip.CRC32 r0 = r6.f20516c0
            r0.reset()
        L141:
            r6.f20512Y = r11
        L143:
            byte r0 = r6.f20512Y
            r1 = 2
            if (r0 != r11) goto L15f
            long r2 = r7.f20501Z
            oi.n r0 = r6.f20515b0
            long r8 = r0.mo4683j0(r7, r8)
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 == 0) goto L15d
            r0 = r24
            r1 = r25
            r4 = r8
            r0.m11598h(r1, r2, r4)
            return r8
        L15d:
            r6.f20512Y = r1
        L15f:
            byte r0 = r6.f20512Y
            if (r0 != r1) goto L19b
            oi.t r0 = r6.f20513Z
            int r0 = r0.m11603h()
            java.util.zip.CRC32 r1 = r6.f20516c0
            long r1 = r1.getValue()
            int r2 = (int) r1
            java.lang.String r1 = "CRC"
            r6.m11597a(r1, r0, r2)
            oi.t r0 = r6.f20513Z
            int r0 = r0.m11603h()
            java.util.zip.Inflater r1 = r6.f20514a0
            long r1 = r1.getBytesWritten()
            int r2 = (int) r1
            java.lang.String r1 = "ISIZE"
            r6.m11597a(r1, r0, r2)
            r0 = 3
            r6.f20512Y = r0
            oi.t r0 = r6.f20513Z
            boolean r0 = r0.mo11541F()
            if (r0 == 0) goto L193
            goto L19b
        L193:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "gzip finished without exhausting source"
            r0.<init>(r1)
            throw r0
        L19b:
            return r12
        L19c:
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r0 = p382w0.C6774a.m13748a(r0, r8)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }
}
