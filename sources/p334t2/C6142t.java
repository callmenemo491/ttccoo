package p334t2;

/* renamed from: t2.t */
/* loaded from: classes.dex */
public class C6142t extends java.io.FilterInputStream {

    /* renamed from: Y */
    public volatile byte[] f23716Y;

    /* renamed from: Z */
    public int f23717Z;

    /* renamed from: a0 */
    public int f23718a0;

    /* renamed from: b0 */
    public int f23719b0;

    /* renamed from: c0 */
    public int f23720c0;

    /* renamed from: d0 */
    public final p229n2.InterfaceC4672b f23721d0;

    /* renamed from: t2.t$a */
    public static class a extends java.io.IOException {
        public a(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public C6142t(java.io.InputStream r2, p229n2.InterfaceC4672b r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = -1
            r1.f23719b0 = r2
            r1.f23721d0 = r3
            java.lang.Class<byte[]> r2 = byte[].class
            r0 = 65536(0x10000, float:9.1835E-41)
            java.lang.Object r2 = r3.mo10688e(r0, r2)
            byte[] r2 = (byte[]) r2
            r1.f23716Y = r2
            return
    }

    /* renamed from: h */
    public static java.io.IOException m12688h() {
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "BufferedInputStream is closed"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: a */
    public final int m12689a(java.io.InputStream r6, byte[] r7) {
            r5 = this;
            int r0 = r5.f23719b0
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L57
            int r3 = r5.f23720c0
            int r3 = r3 - r0
            int r4 = r5.f23718a0
            if (r3 < r4) goto Le
            goto L57
        Le:
            if (r0 != 0) goto L36
            int r1 = r7.length
            if (r4 <= r1) goto L36
            int r1 = r5.f23717Z
            int r3 = r7.length
            if (r1 != r3) goto L36
            int r0 = r7.length
            int r0 = r0 * 2
            if (r0 <= r4) goto L1e
            goto L1f
        L1e:
            r4 = r0
        L1f:
            n2.b r0 = r5.f23721d0
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Object r0 = r0.mo10688e(r4, r1)
            byte[] r0 = (byte[]) r0
            int r1 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r2, r1)
            r5.f23716Y = r0
            n2.b r1 = r5.f23721d0
            r1.mo10687d(r7)
            r7 = r0
            goto L3d
        L36:
            if (r0 <= 0) goto L3d
            int r1 = r7.length
            int r1 = r1 - r0
            java.lang.System.arraycopy(r7, r0, r7, r2, r1)
        L3d:
            int r0 = r5.f23720c0
            int r1 = r5.f23719b0
            int r0 = r0 - r1
            r5.f23720c0 = r0
            r5.f23719b0 = r2
            r5.f23717Z = r2
            int r1 = r7.length
            int r1 = r1 - r0
            int r6 = r6.read(r7, r0, r1)
            int r7 = r5.f23720c0
            if (r6 > 0) goto L53
            goto L54
        L53:
            int r7 = r7 + r6
        L54:
            r5.f23717Z = r7
            return r6
        L57:
            int r6 = r6.read(r7)
            if (r6 <= 0) goto L63
            r5.f23719b0 = r1
            r5.f23720c0 = r2
            r5.f23717Z = r6
        L63:
            return r6
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
            r3 = this;
            monitor-enter(r3)
            java.io.InputStream r0 = r3.in     // Catch: java.lang.Throwable -> L1a
            byte[] r1 = r3.f23716Y     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L15
            if (r0 == 0) goto L15
            int r1 = r3.f23717Z     // Catch: java.lang.Throwable -> L1a
            int r2 = r3.f23720c0     // Catch: java.lang.Throwable -> L1a
            int r1 = r1 - r2
            int r0 = r0.available()     // Catch: java.lang.Throwable -> L1a
            int r1 = r1 + r0
            monitor-exit(r3)
            return r1
        L15:
            m12688h()     // Catch: java.lang.Throwable -> L1a
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L1a
        L1a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            byte[] r0 = r3.f23716Y
            r1 = 0
            if (r0 == 0) goto Le
            n2.b r0 = r3.f23721d0
            byte[] r2 = r3.f23716Y
            r0.mo10687d(r2)
            r3.f23716Y = r1
        Le:
            java.io.InputStream r0 = r3.in
            r3.in = r1
            if (r0 == 0) goto L17
            r0.close()
        L17:
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r2) {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f23718a0     // Catch: java.lang.Throwable -> Lf
            int r2 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> Lf
            r1.f23718a0 = r2     // Catch: java.lang.Throwable -> Lf
            int r2 = r1.f23720c0     // Catch: java.lang.Throwable -> Lf
            r1.f23719b0 = r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        Lf:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f23716Y     // Catch: java.lang.Throwable -> L3d
            java.io.InputStream r1 = r6.in     // Catch: java.lang.Throwable -> L3d
            r2 = 0
            if (r0 == 0) goto L39
            if (r1 == 0) goto L39
            int r3 = r6.f23720c0     // Catch: java.lang.Throwable -> L3d
            int r4 = r6.f23717Z     // Catch: java.lang.Throwable -> L3d
            r5 = -1
            if (r3 < r4) goto L19
            int r1 = r6.m12689a(r1, r0)     // Catch: java.lang.Throwable -> L3d
            if (r1 != r5) goto L19
            monitor-exit(r6)
            return r5
        L19:
            byte[] r1 = r6.f23716Y     // Catch: java.lang.Throwable -> L3d
            if (r0 == r1) goto L26
            byte[] r0 = r6.f23716Y     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L22
            goto L26
        L22:
            m12688h()     // Catch: java.lang.Throwable -> L3d
            throw r2     // Catch: java.lang.Throwable -> L3d
        L26:
            int r1 = r6.f23717Z     // Catch: java.lang.Throwable -> L3d
            int r2 = r6.f23720c0     // Catch: java.lang.Throwable -> L3d
            int r1 = r1 - r2
            if (r1 <= 0) goto L37
            int r1 = r2 + 1
            r6.f23720c0 = r1     // Catch: java.lang.Throwable -> L3d
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L3d
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L37:
            monitor-exit(r6)
            return r5
        L39:
            m12688h()     // Catch: java.lang.Throwable -> L3d
            throw r2     // Catch: java.lang.Throwable -> L3d
        L3d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] r8, int r9, int r10) {
            r7 = this;
            monitor-enter(r7)
            byte[] r0 = r7.f23716Y     // Catch: java.lang.Throwable -> L8e
            r1 = 0
            if (r0 == 0) goto L8a
            if (r10 != 0) goto Lb
            r8 = 0
            monitor-exit(r7)
            return r8
        Lb:
            java.io.InputStream r2 = r7.in     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L86
            int r3 = r7.f23720c0     // Catch: java.lang.Throwable -> L8e
            int r4 = r7.f23717Z     // Catch: java.lang.Throwable -> L8e
            if (r3 >= r4) goto L33
            int r5 = r4 - r3
            if (r5 < r10) goto L1b
            r4 = r10
            goto L1c
        L1b:
            int r4 = r4 - r3
        L1c:
            java.lang.System.arraycopy(r0, r3, r8, r9, r4)     // Catch: java.lang.Throwable -> L8e
            int r3 = r7.f23720c0     // Catch: java.lang.Throwable -> L8e
            int r3 = r3 + r4
            r7.f23720c0 = r3     // Catch: java.lang.Throwable -> L8e
            if (r4 == r10) goto L31
            int r3 = r2.available()     // Catch: java.lang.Throwable -> L8e
            if (r3 != 0) goto L2d
            goto L31
        L2d:
            int r9 = r9 + r4
            int r3 = r10 - r4
            goto L34
        L31:
            monitor-exit(r7)
            return r4
        L33:
            r3 = r10
        L34:
            int r4 = r7.f23719b0     // Catch: java.lang.Throwable -> L8e
            r5 = -1
            if (r4 != r5) goto L49
            int r4 = r0.length     // Catch: java.lang.Throwable -> L8e
            if (r3 < r4) goto L49
            int r4 = r2.read(r8, r9, r3)     // Catch: java.lang.Throwable -> L8e
            if (r4 != r5) goto L76
            if (r3 != r10) goto L45
            goto L47
        L45:
            int r5 = r10 - r3
        L47:
            monitor-exit(r7)
            return r5
        L49:
            int r4 = r7.m12689a(r2, r0)     // Catch: java.lang.Throwable -> L8e
            if (r4 != r5) goto L56
            if (r3 != r10) goto L52
            goto L54
        L52:
            int r5 = r10 - r3
        L54:
            monitor-exit(r7)
            return r5
        L56:
            byte[] r4 = r7.f23716Y     // Catch: java.lang.Throwable -> L8e
            if (r0 == r4) goto L63
            byte[] r0 = r7.f23716Y     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L5f
            goto L63
        L5f:
            m12688h()     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        L63:
            int r4 = r7.f23717Z     // Catch: java.lang.Throwable -> L8e
            int r5 = r7.f23720c0     // Catch: java.lang.Throwable -> L8e
            int r6 = r4 - r5
            if (r6 < r3) goto L6d
            r4 = r3
            goto L6e
        L6d:
            int r4 = r4 - r5
        L6e:
            java.lang.System.arraycopy(r0, r5, r8, r9, r4)     // Catch: java.lang.Throwable -> L8e
            int r5 = r7.f23720c0     // Catch: java.lang.Throwable -> L8e
            int r5 = r5 + r4
            r7.f23720c0 = r5     // Catch: java.lang.Throwable -> L8e
        L76:
            int r3 = r3 - r4
            if (r3 != 0) goto L7b
            monitor-exit(r7)
            return r10
        L7b:
            int r5 = r2.available()     // Catch: java.lang.Throwable -> L8e
            if (r5 != 0) goto L84
            int r10 = r10 - r3
            monitor-exit(r7)
            return r10
        L84:
            int r9 = r9 + r4
            goto L34
        L86:
            m12688h()     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        L8a:
            m12688h()     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        L8e:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    public synchronized void release() {
            r2 = this;
            monitor-enter(r2)
            byte[] r0 = r2.f23716Y     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Lf
            n2.b r0 = r2.f23721d0     // Catch: java.lang.Throwable -> L11
            byte[] r1 = r2.f23716Y     // Catch: java.lang.Throwable -> L11
            r0.mo10687d(r1)     // Catch: java.lang.Throwable -> L11
            r0 = 0
            r2.f23716Y = r0     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r2)
            return
        L11:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
            r3 = this;
            monitor-enter(r3)
            byte[] r0 = r3.f23716Y     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L31
            r0 = -1
            int r1 = r3.f23719b0     // Catch: java.lang.Throwable -> L39
            if (r0 == r1) goto Le
            r3.f23720c0 = r1     // Catch: java.lang.Throwable -> L39
            monitor-exit(r3)
            return
        Le:
            t2.t$a r0 = new t2.t$a     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "Mark has been invalidated, pos: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            int r2 = r3.f23720c0     // Catch: java.lang.Throwable -> L39
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = " markLimit: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            int r2 = r3.f23718a0     // Catch: java.lang.Throwable -> L39
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L39
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L39
            throw r0     // Catch: java.lang.Throwable -> L39
        L31:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = "Stream is closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L39
            throw r0     // Catch: java.lang.Throwable -> L39
        L39:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long r11) {
            r10 = this;
            monitor-enter(r10)
            r0 = 1
            r2 = 0
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 >= 0) goto Lb
            monitor-exit(r10)
            return r2
        Lb:
            byte[] r0 = r10.f23716Y     // Catch: java.lang.Throwable -> L72
            r1 = 0
            if (r0 == 0) goto L6e
            java.io.InputStream r4 = r10.in     // Catch: java.lang.Throwable -> L72
            if (r4 == 0) goto L6a
            int r1 = r10.f23717Z     // Catch: java.lang.Throwable -> L72
            int r5 = r10.f23720c0     // Catch: java.lang.Throwable -> L72
            int r6 = r1 - r5
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L72
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 < 0) goto L26
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L72
            long r0 = r0 + r11
            int r1 = (int) r0     // Catch: java.lang.Throwable -> L72
            r10.f23720c0 = r1     // Catch: java.lang.Throwable -> L72
            monitor-exit(r10)
            return r11
        L26:
            long r6 = (long) r1
            long r8 = (long) r5
            long r6 = r6 - r8
            r10.f23720c0 = r1     // Catch: java.lang.Throwable -> L72
            int r1 = r10.f23719b0     // Catch: java.lang.Throwable -> L72
            r5 = -1
            if (r1 == r5) goto L5c
            int r1 = r10.f23718a0     // Catch: java.lang.Throwable -> L72
            long r8 = (long) r1     // Catch: java.lang.Throwable -> L72
            int r1 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r1 > 0) goto L5c
            int r0 = r10.m12689a(r4, r0)     // Catch: java.lang.Throwable -> L72
            if (r0 != r5) goto L3f
            monitor-exit(r10)
            return r6
        L3f:
            int r0 = r10.f23717Z     // Catch: java.lang.Throwable -> L72
            int r1 = r10.f23720c0     // Catch: java.lang.Throwable -> L72
            int r2 = r0 - r1
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L72
            long r4 = r11 - r6
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 < 0) goto L54
            long r0 = (long) r1     // Catch: java.lang.Throwable -> L72
            long r0 = r0 + r11
            long r0 = r0 - r6
            int r1 = (int) r0     // Catch: java.lang.Throwable -> L72
            r10.f23720c0 = r1     // Catch: java.lang.Throwable -> L72
            monitor-exit(r10)
            return r11
        L54:
            long r11 = (long) r0
            long r6 = r6 + r11
            long r11 = (long) r1
            long r6 = r6 - r11
            r10.f23720c0 = r0     // Catch: java.lang.Throwable -> L72
            monitor-exit(r10)
            return r6
        L5c:
            long r11 = r11 - r6
            long r11 = r4.skip(r11)     // Catch: java.lang.Throwable -> L72
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 <= 0) goto L67
            r10.f23719b0 = r5     // Catch: java.lang.Throwable -> L72
        L67:
            long r6 = r6 + r11
            monitor-exit(r10)
            return r6
        L6a:
            m12688h()     // Catch: java.lang.Throwable -> L72
            throw r1     // Catch: java.lang.Throwable -> L72
        L6e:
            m12688h()     // Catch: java.lang.Throwable -> L72
            throw r1     // Catch: java.lang.Throwable -> L72
        L72:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
    }
}
