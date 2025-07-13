package p260oi;

/* renamed from: oi.t */
/* loaded from: classes.dex */
public final class C5298t implements p260oi.InterfaceC5286h {

    /* renamed from: Y */
    public final p260oi.C5283e f20532Y;

    /* renamed from: Z */
    public boolean f20533Z;

    /* renamed from: a0 */
    public final p260oi.InterfaceC5304z f20534a0;

    /* renamed from: oi.t$a */
    public static final class a extends java.io.InputStream {

        /* renamed from: Y */
        public final /* synthetic */ p260oi.C5298t f20535Y;

        public a(p260oi.C5298t r1) {
                r0 = this;
                r0.f20535Y = r1
                r0.<init>()
                return
        }

        @Override // java.io.InputStream
        public int available() {
                r4 = this;
                oi.t r0 = r4.f20535Y
                boolean r1 = r0.f20533Z
                if (r1 != 0) goto L14
                oi.e r0 = r0.f20532Y
                long r0 = r0.f20501Z
                r2 = 2147483647(0x7fffffff, float:NaN)
                long r2 = (long) r2
                long r0 = java.lang.Math.min(r0, r2)
                int r1 = (int) r0
                return r1
            L14:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "closed"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                oi.t r0 = r1.f20535Y
                r0.close()
                return
        }

        @Override // java.io.InputStream
        public int read() {
                r7 = this;
                oi.t r0 = r7.f20535Y
                boolean r1 = r0.f20533Z
                if (r1 != 0) goto L2c
                oi.e r1 = r0.f20532Y
                long r2 = r1.f20501Z
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L21
                oi.z r0 = r0.f20534a0
                r2 = 8192(0x2000, float:1.148E-41)
                long r2 = (long) r2
                long r0 = r0.mo4683j0(r1, r2)
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L21
                r0 = -1
                return r0
            L21:
                oi.t r0 = r7.f20535Y
                oi.e r0 = r0.f20532Y
                byte r0 = r0.readByte()
                r0 = r0 & 255(0xff, float:3.57E-43)
                return r0
            L2c:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "closed"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r8, int r9, int r10) {
                r7 = this;
                java.lang.String r0 = "data"
                p214m2.C4339q.m9706k(r8, r0)
                oi.t r0 = r7.f20535Y
                boolean r0 = r0.f20533Z
                if (r0 != 0) goto L38
                int r0 = r8.length
                long r1 = (long) r0
                long r3 = (long) r9
                long r5 = (long) r10
                p080ei.C1854b.m4602d(r1, r3, r5)
                oi.t r0 = r7.f20535Y
                oi.e r1 = r0.f20532Y
                long r2 = r1.f20501Z
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L2f
                oi.z r0 = r0.f20534a0
                r2 = 8192(0x2000, float:1.148E-41)
                long r2 = (long) r2
                long r0 = r0.mo4683j0(r1, r2)
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L2f
                r8 = -1
                return r8
            L2f:
                oi.t r0 = r7.f20535Y
                oi.e r0 = r0.f20532Y
                int r8 = r0.m11557Z(r8, r9, r10)
                return r8
            L38:
                java.io.IOException r8 = new java.io.IOException
                java.lang.String r9 = "closed"
                r8.<init>(r9)
                throw r8
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                oi.t r1 = r2.f20535Y
                r0.append(r1)
                java.lang.String r1 = ".inputStream()"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public C5298t(p260oi.InterfaceC5304z r1) {
            r0 = this;
            r0.<init>()
            r0.f20534a0 = r1
            oi.e r1 = new oi.e
            r1.<init>()
            r0.f20532Y = r1
            return
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: C */
    public java.lang.String mo11537C() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r0 = r2.mo11556W(r0)
            return r0
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: F */
    public boolean mo11541F() {
            r6 = this;
            boolean r0 = r6.f20533Z
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L22
            oi.e r0 = r6.f20532Y
            boolean r0 = r0.mo11541F()
            if (r0 == 0) goto L20
            oi.z r0 = r6.f20534a0
            oi.e r2 = r6.f20532Y
            r3 = 8192(0x2000, float:1.148E-41)
            long r3 = (long) r3
            long r2 = r0.mo4683j0(r2, r3)
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: K */
    public byte[] mo11549K(long r2) {
            r1 = this;
            boolean r0 = r1.mo11577w(r2)
            if (r0 == 0) goto Ld
            oi.e r0 = r1.f20532Y
            byte[] r2 = r0.mo11549K(r2)
            return r2
        Ld:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: P */
    public int mo11552P(p260oi.C5295q r9) {
            r8 = this;
            java.lang.String r0 = "options"
            p214m2.C4339q.m9706k(r9, r0)
            boolean r0 = r8.f20533Z
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L39
        Lb:
            oi.e r0 = r8.f20532Y
            int r0 = p277pi.C5527a.m11788b(r0, r9, r1)
            r2 = -2
            r3 = -1
            if (r0 == r2) goto L26
            if (r0 == r3) goto L37
            oi.i[] r9 = r9.f20525Y
            r9 = r9[r0]
            int r9 = r9.mo11585h()
            oi.e r1 = r8.f20532Y
            long r2 = (long) r9
            r1.mo11559b(r2)
            goto L38
        L26:
            oi.z r0 = r8.f20534a0
            oi.e r2 = r8.f20532Y
            r4 = 8192(0x2000, float:1.148E-41)
            long r4 = (long) r4
            long r4 = r0.mo4683j0(r2, r4)
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto Lb
        L37:
            r0 = -1
        L38:
            return r0
        L39:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: W */
    public java.lang.String mo11556W(long r14) {
            r13 = this;
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto La6
            r0 = 1
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 != 0) goto L18
            r4 = r2
            goto L1a
        L18:
            long r4 = r14 + r0
        L1a:
            r6 = 10
            byte r12 = (byte) r6
            r8 = 0
            r6 = r13
            r7 = r12
            r10 = r4
            long r6 = r6.m11602a(r7, r8, r10)
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L33
            oi.e r14 = r13.f20532Y
            java.lang.String r14 = p277pi.C5527a.m11787a(r14, r6)
            goto L5f
        L33:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L60
            boolean r2 = r13.mo11577w(r4)
            if (r2 == 0) goto L60
            oi.e r2 = r13.f20532Y
            long r6 = r4 - r0
            byte r2 = r2.m11554S(r6)
            r3 = 13
            byte r3 = (byte) r3
            if (r2 != r3) goto L60
            long r0 = r0 + r4
            boolean r0 = r13.mo11577w(r0)
            if (r0 == 0) goto L60
            oi.e r0 = r13.f20532Y
            byte r0 = r0.m11554S(r4)
            if (r0 != r12) goto L60
            oi.e r14 = r13.f20532Y
            java.lang.String r14 = p277pi.C5527a.m11787a(r14, r4)
        L5f:
            return r14
        L60:
            oi.e r6 = new oi.e
            r6.<init>()
            oi.e r0 = r13.f20532Y
            r2 = 0
            r1 = 32
            long r4 = r0.f20501Z
            long r7 = (long) r1
            long r4 = java.lang.Math.min(r7, r4)
            r1 = r6
            r0.m11553R(r1, r2, r4)
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.String r1 = "\\n not found: limit="
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            oi.e r2 = r13.f20532Y
            long r2 = r2.f20501Z
            long r14 = java.lang.Math.min(r2, r14)
            r1.append(r14)
            java.lang.String r14 = " content="
            r1.append(r14)
            oi.i r14 = r6.m11560b0()
            java.lang.String r14 = r14.mo11586k()
            r1.append(r14)
            java.lang.String r14 = "\u2026"
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        La6:
            java.lang.String r0 = "limit < 0: "
            java.lang.String r14 = p382w0.C6774a.m13748a(r0, r14)
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.toString()
            r15.<init>(r14)
            throw r15
    }

    /* renamed from: a */
    public long m11602a(byte r9, long r10, long r12) {
            r8 = this;
            boolean r0 = r8.f20533Z
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L69
            r2 = 0
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto Ld
            goto L12
        Ld:
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 < 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L46
        L15:
            r0 = -1
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 >= 0) goto L45
            oi.e r2 = r8.f20532Y
            r3 = r9
            r4 = r10
            r6 = r12
            long r2 = r2.m11555V(r3, r4, r6)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L2a
            r0 = r2
            goto L45
        L2a:
            oi.e r2 = r8.f20532Y
            long r3 = r2.f20501Z
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 >= 0) goto L45
            oi.z r5 = r8.f20534a0
            r6 = 8192(0x2000, float:1.148E-41)
            long r6 = (long) r6
            long r5 = r5.mo4683j0(r2, r6)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L40
            goto L45
        L40:
            long r10 = java.lang.Math.max(r10, r3)
            goto L15
        L45:
            return r0
        L46:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "fromIndex="
            r9.append(r0)
            r9.append(r10)
            java.lang.String r10 = " toIndex="
            r9.append(r10)
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L69:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: b */
    public void mo11559b(long r7) {
            r6 = this;
            boolean r0 = r6.f20533Z
            r0 = r0 ^ 1
            if (r0 == 0) goto L3a
        L6:
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L39
            oi.e r2 = r6.f20532Y
            long r3 = r2.f20501Z
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L2a
            oi.z r0 = r6.f20534a0
            r1 = 8192(0x2000, float:1.148E-41)
            long r3 = (long) r1
            long r0 = r0.mo4683j0(r2, r3)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L24
            goto L2a
        L24:
            java.io.EOFException r7 = new java.io.EOFException
            r7.<init>()
            throw r7
        L2a:
            oi.e r0 = r6.f20532Y
            long r0 = r0.f20501Z
            long r0 = java.lang.Math.min(r7, r0)
            oi.e r2 = r6.f20532Y
            r2.mo11559b(r0)
            long r7 = r7 - r0
            goto L6
        L39:
            return
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "closed"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    @Override // p260oi.InterfaceC5286h, p260oi.InterfaceC5285g
    /* renamed from: c */
    public p260oi.C5283e mo11561c() {
            r1 = this;
            oi.e r0 = r1.f20532Y
            return r0
    }

    @Override // p260oi.InterfaceC5304z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            boolean r0 = r3.f20533Z
            if (r0 == 0) goto L5
            goto L14
        L5:
            r0 = 1
            r3.f20533Z = r0
            oi.z r0 = r3.f20534a0
            r0.close()
            oi.e r0 = r3.f20532Y
            long r1 = r0.f20501Z
            r0.mo11559b(r1)
        L14:
            return
    }

    @Override // p260oi.InterfaceC5304z
    /* renamed from: d */
    public p260oi.C5279a0 mo7463d() {
            r1 = this;
            oi.z r0 = r1.f20534a0
            oi.a0 r0 = r0.mo7463d()
            return r0
    }

    /* renamed from: h */
    public int m11603h() {
            r3 = this;
            r0 = 4
            r3.mo11566k0(r0)
            oi.e r0 = r3.f20532Y
            int r0 = r0.readInt()
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r0
            int r1 = r1 >>> 24
            r2 = 16711680(0xff0000, float:2.3418052E-38)
            r2 = r2 & r0
            int r2 = r2 >>> 8
            r1 = r1 | r2
            r2 = 65280(0xff00, float:9.1477E-41)
            r2 = r2 & r0
            int r2 = r2 << 8
            r1 = r1 | r2
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r0 = r0 | r1
            return r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            boolean r0 = r1.f20533Z
            r0 = r0 ^ 1
            return r0
    }

    @Override // p260oi.InterfaceC5304z
    /* renamed from: j0 */
    public long mo4683j0(p260oi.C5283e r9, long r10) {
            r8 = this;
            java.lang.String r0 = "sink"
            p214m2.C4339q.m9706k(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto L49
            boolean r2 = r8.f20533Z
            r2 = r2 ^ 1
            if (r2 == 0) goto L3d
            oi.e r2 = r8.f20532Y
            long r3 = r2.f20501Z
            r5 = -1
            int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r7 != 0) goto L2e
            oi.z r0 = r8.f20534a0
            r1 = 8192(0x2000, float:1.148E-41)
            long r3 = (long) r1
            long r0 = r0.mo4683j0(r2, r3)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L2e
            goto L3c
        L2e:
            oi.e r0 = r8.f20532Y
            long r0 = r0.f20501Z
            long r10 = java.lang.Math.min(r10, r0)
            oi.e r0 = r8.f20532Y
            long r5 = r0.mo4683j0(r9, r10)
        L3c:
            return r5
        L3d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L49:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = p382w0.C6774a.m13748a(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: k0 */
    public void mo11566k0(long r1) {
            r0 = this;
            boolean r1 = r0.mo11577w(r1)
            if (r1 == 0) goto L7
            return
        L7:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: q */
    public p260oi.C5287i mo11571q(long r2) {
            r1 = this;
            boolean r0 = r1.mo11577w(r2)
            if (r0 == 0) goto Ld
            oi.e r0 = r1.f20532Y
            oi.i r2 = r0.mo11571q(r2)
            return r2
        Ld:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer r7) {
            r6 = this;
            java.lang.String r0 = "sink"
            p214m2.C4339q.m9706k(r7, r0)
            oi.e r0 = r6.f20532Y
            long r1 = r0.f20501Z
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L20
            oi.z r1 = r6.f20534a0
            r2 = 8192(0x2000, float:1.148E-41)
            long r2 = (long) r2
            long r0 = r1.mo4683j0(r0, r2)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L20
            r7 = -1
            return r7
        L20:
            oi.e r0 = r6.f20532Y
            int r7 = r0.read(r7)
            return r7
    }

    @Override // p260oi.InterfaceC5286h
    public byte readByte() {
            r2 = this;
            r0 = 1
            r2.mo11566k0(r0)
            oi.e r0 = r2.f20532Y
            byte r0 = r0.readByte()
            return r0
    }

    @Override // p260oi.InterfaceC5286h
    public int readInt() {
            r2 = this;
            r0 = 4
            r2.mo11566k0(r0)
            oi.e r0 = r2.f20532Y
            int r0 = r0.readInt()
            return r0
    }

    @Override // p260oi.InterfaceC5286h
    public short readShort() {
            r2 = this;
            r0 = 2
            r2.mo11566k0(r0)
            oi.e r0 = r2.f20532Y
            short r0 = r0.readShort()
            return r0
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: t */
    public long mo11573t(p260oi.InterfaceC5302x r10) {
            r9 = this;
            r0 = 0
            r2 = r0
        L3:
            oi.z r4 = r9.f20534a0
            oi.e r5 = r9.f20532Y
            r6 = 8192(0x2000, float:1.148E-41)
            long r6 = (long) r6
            long r4 = r4.mo4683j0(r5, r6)
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            oi.e r4 = r9.f20532Y
            if (r8 == 0) goto L28
            long r4 = r4.m11534A()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L3
            long r2 = r2 + r4
            oi.e r6 = r9.f20532Y
            r7 = r10
            oi.e r7 = (p260oi.C5283e) r7
            r7.mo5749p0(r6, r4)
            goto L3
        L28:
            long r5 = r4.f20501Z
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L34
            long r2 = r2 + r5
            oi.e r10 = (p260oi.C5283e) r10
            r10.mo5749p0(r4, r5)
        L34:
            return r2
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: t0 */
    public long mo11574t0() {
            r5 = this;
            r0 = 1
            r5.mo11566k0(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.mo11577w(r2)
            if (r2 == 0) goto L62
            oi.e r2 = r5.f20532Y
            long r3 = (long) r0
            byte r2 = r2.m11554S(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L20
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L35
        L20:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L2a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L35
        L2a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L37
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L35
            goto L37
        L35:
            r0 = r1
            goto L6
        L37:
            if (r0 == 0) goto L3a
            goto L62
        L3a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            gh.C2390b.m6112b(r3)
            gh.C2390b.m6112b(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "java.lang.Integer.toStri\u2026(this, checkRadix(radix))"
            p214m2.C4339q.m9705j(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L62:
            oi.e r0 = r5.f20532Y
            long r0 = r0.mo11574t0()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "buffer("
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            oi.z r1 = r2.f20534a0
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: u0 */
    public java.lang.String mo11575u0(java.nio.charset.Charset r3) {
            r2 = this;
            oi.e r0 = r2.f20532Y
            oi.z r1 = r2.f20534a0
            r0.m11538C0(r1)
            oi.e r0 = r2.f20532Y
            java.lang.String r3 = r0.mo11575u0(r3)
            return r3
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: w */
    public boolean mo11577w(long r7) {
            r6 = this;
            r0 = 0
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 < 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            if (r1 == 0) goto L38
            boolean r1 = r6.f20533Z
            r1 = r1 ^ 1
            if (r1 == 0) goto L2c
        L12:
            oi.e r1 = r6.f20532Y
            long r2 = r1.f20501Z
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 >= 0) goto L2a
            oi.z r2 = r6.f20534a0
            r3 = 8192(0x2000, float:1.148E-41)
            long r3 = (long) r3
            long r1 = r2.mo4683j0(r1, r3)
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L12
            goto L2b
        L2a:
            r0 = 1
        L2b:
            return r0
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "closed"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r7 = p382w0.C6774a.m13748a(r0, r7)
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
    }

    @Override // p260oi.InterfaceC5286h
    /* renamed from: w0 */
    public java.io.InputStream mo11578w0() {
            r1 = this;
            oi.t$a r0 = new oi.t$a
            r0.<init>(r1)
            return r0
    }
}
