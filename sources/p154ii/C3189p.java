package p154ii;

/* renamed from: ii.p */
/* loaded from: classes.dex */
public final class C3189p implements java.io.Closeable {

    /* renamed from: e0 */
    public static final java.util.logging.Logger f12837e0 = null;

    /* renamed from: Y */
    public final p260oi.C5283e f12838Y;

    /* renamed from: Z */
    public int f12839Z;

    /* renamed from: a0 */
    public boolean f12840a0;

    /* renamed from: b0 */
    public final p154ii.C3177d.b f12841b0;

    /* renamed from: c0 */
    public final p260oi.InterfaceC5285g f12842c0;

    /* renamed from: d0 */
    public final boolean f12843d0;

    static {
            java.lang.Class<ii.e> r0 = p154ii.C3178e.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p154ii.C3189p.f12837e0 = r0
            return
    }

    public C3189p(p260oi.InterfaceC5285g r3, boolean r4) {
            r2 = this;
            r2.<init>()
            r2.f12842c0 = r3
            r2.f12843d0 = r4
            oi.e r3 = new oi.e
            r3.<init>()
            r2.f12838Y = r3
            r4 = 16384(0x4000, float:2.2959E-41)
            r2.f12839Z = r4
            ii.d$b r4 = new ii.d$b
            r0 = 0
            r1 = 3
            r4.<init>(r0, r0, r3, r1)
            r2.f12841b0 = r4
            return
    }

    /* renamed from: A */
    public final synchronized void m7669A(boolean r4, int r5, int r6) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f12840a0     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L22
            r0 = 8
            r1 = 6
            r2 = 0
            if (r4 == 0) goto Ld
            r4 = 1
            goto Le
        Ld:
            r4 = 0
        Le:
            r3.m7675i(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L2a
            oi.g r4 = r3.f12842c0     // Catch: java.lang.Throwable -> L2a
            r4.mo11581z(r5)     // Catch: java.lang.Throwable -> L2a
            oi.g r4 = r3.f12842c0     // Catch: java.lang.Throwable -> L2a
            r4.mo11581z(r6)     // Catch: java.lang.Throwable -> L2a
            oi.g r4 = r3.f12842c0     // Catch: java.lang.Throwable -> L2a
            r4.flush()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)
            return
        L22:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2a
            throw r4     // Catch: java.lang.Throwable -> L2a
        L2a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    /* renamed from: L */
    public final synchronized void m7670L(int r4, p154ii.EnumC3175b r5) {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "errorCode"
            p214m2.C4339q.m9706k(r5, r0)     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r3.f12840a0     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L34
            int r0 = r5.f12680Y     // Catch: java.lang.Throwable -> L3c
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L28
            r0 = 4
            r1 = 3
            r3.m7675i(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L3c
            oi.g r4 = r3.f12842c0     // Catch: java.lang.Throwable -> L3c
            int r5 = r5.f12680Y     // Catch: java.lang.Throwable -> L3c
            r4.mo11581z(r5)     // Catch: java.lang.Throwable -> L3c
            oi.g r4 = r3.f12842c0     // Catch: java.lang.Throwable -> L3c
            r4.flush()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r3)
            return
        L28:
            java.lang.String r4 = "Failed requirement."
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3c
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L3c
            throw r5     // Catch: java.lang.Throwable -> L3c
        L34:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3c
            throw r4     // Catch: java.lang.Throwable -> L3c
        L3c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    /* renamed from: Q */
    public final synchronized void m7671Q(int r5, long r6) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f12840a0     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L46
            r0 = 0
            r2 = 0
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 == 0) goto L15
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 > 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L2b
            r0 = 4
            r1 = 8
            r4.m7675i(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L4e
            oi.g r5 = r4.f12842c0     // Catch: java.lang.Throwable -> L4e
            int r7 = (int) r6     // Catch: java.lang.Throwable -> L4e
            r5.mo11581z(r7)     // Catch: java.lang.Throwable -> L4e
            oi.g r5 = r4.f12842c0     // Catch: java.lang.Throwable -> L4e
            r5.flush()     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r4)
            return
        L2b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r5.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "
            r5.append(r0)     // Catch: java.lang.Throwable -> L4e
            r5.append(r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L4e
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L4e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L4e
            throw r6     // Catch: java.lang.Throwable -> L4e
        L46:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r6 = "closed"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4e
            throw r5     // Catch: java.lang.Throwable -> L4e
        L4e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    /* renamed from: R */
    public final void m7672R(int r8, long r9) {
            r7 = this;
        L0:
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L23
            int r2 = r7.f12839Z
            long r2 = (long) r2
            long r2 = java.lang.Math.min(r2, r9)
            long r9 = r9 - r2
            int r4 = (int) r2
            r5 = 9
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 != 0) goto L17
            r0 = 4
            goto L18
        L17:
            r0 = 0
        L18:
            r7.m7675i(r8, r4, r5, r0)
            oi.g r0 = r7.f12842c0
            oi.e r1 = r7.f12838Y
            r0.mo5749p0(r1, r2)
            goto L0
        L23:
            return
    }

    /* renamed from: a */
    public final synchronized void m7673a(p154ii.C3193t r5) {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "peerSettings"
            p214m2.C4339q.m9706k(r5, r0)     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r4.f12840a0     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L65
            int r0 = r4.f12839Z     // Catch: java.lang.Throwable -> L6d
            int r1 = r5.f12852a     // Catch: java.lang.Throwable -> L6d
            r2 = r1 & 32
            if (r2 == 0) goto L17
            int[] r0 = r5.f12853b     // Catch: java.lang.Throwable -> L6d
            r2 = 5
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L6d
        L17:
            r4.f12839Z = r0     // Catch: java.lang.Throwable -> L6d
            r0 = r1 & 2
            r1 = 1
            r2 = -1
            if (r0 == 0) goto L24
            int[] r3 = r5.f12853b     // Catch: java.lang.Throwable -> L6d
            r3 = r3[r1]     // Catch: java.lang.Throwable -> L6d
            goto L25
        L24:
            r3 = -1
        L25:
            if (r3 == r2) goto L59
            ii.d$b r3 = r4.f12841b0     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L2f
            int[] r5 = r5.f12853b     // Catch: java.lang.Throwable -> L6d
            r2 = r5[r1]     // Catch: java.lang.Throwable -> L6d
        L2f:
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> L6d
            r5 = 16384(0x4000, float:2.2959E-41)
            int r5 = java.lang.Math.min(r2, r5)     // Catch: java.lang.Throwable -> L6d
            int r0 = r3.f12703c     // Catch: java.lang.Throwable -> L6d
            if (r0 != r5) goto L3d
            goto L59
        L3d:
            if (r5 >= r0) goto L47
            int r0 = r3.f12701a     // Catch: java.lang.Throwable -> L6d
            int r0 = java.lang.Math.min(r0, r5)     // Catch: java.lang.Throwable -> L6d
            r3.f12701a = r0     // Catch: java.lang.Throwable -> L6d
        L47:
            r3.f12702b = r1     // Catch: java.lang.Throwable -> L6d
            r3.f12703c = r5     // Catch: java.lang.Throwable -> L6d
            int r0 = r3.f12707g     // Catch: java.lang.Throwable -> L6d
            if (r5 >= r0) goto L59
            if (r5 != 0) goto L55
            r3.m7620a()     // Catch: java.lang.Throwable -> L6d
            goto L59
        L55:
            int r0 = r0 - r5
            r3.m7621b(r0)     // Catch: java.lang.Throwable -> L6d
        L59:
            r5 = 4
            r0 = 0
            r4.m7675i(r0, r0, r5, r1)     // Catch: java.lang.Throwable -> L6d
            oi.g r5 = r4.f12842c0     // Catch: java.lang.Throwable -> L6d
            r5.flush()     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r4)
            return
        L65:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = "closed"
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L6d
            throw r5     // Catch: java.lang.Throwable -> L6d
        L6d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.f12840a0 = r0     // Catch: java.lang.Throwable -> Lb
            oi.g r0 = r1.f12842c0     // Catch: java.lang.Throwable -> Lb
            r0.close()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void flush() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f12840a0     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto Lc
            oi.g r0 = r2.f12842c0     // Catch: java.lang.Throwable -> L14
            r0.flush()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        Lc:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            throw r0     // Catch: java.lang.Throwable -> L14
        L14:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    /* renamed from: h */
    public final synchronized void m7674h(boolean r3, int r4, p260oi.C5283e r5, int r6) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f12840a0     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L16
            r0 = 0
            r2.m7675i(r4, r6, r0, r3)     // Catch: java.lang.Throwable -> L1e
            if (r6 <= 0) goto L14
            oi.g r3 = r2.f12842c0     // Catch: java.lang.Throwable -> L1e
            p214m2.C4339q.m9704i(r5)     // Catch: java.lang.Throwable -> L1e
            long r0 = (long) r6     // Catch: java.lang.Throwable -> L1e
            r3.mo5749p0(r5, r0)     // Catch: java.lang.Throwable -> L1e
        L14:
            monitor-exit(r2)
            return
        L16:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "closed"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1e
            throw r3     // Catch: java.lang.Throwable -> L1e
        L1e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    /* renamed from: i */
    public final void m7675i(int r9, int r10, int r11, int r12) {
            r8 = this;
            java.util.logging.Logger r0 = p154ii.C3189p.f12837e0
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r0.isLoggable(r1)
            if (r1 == 0) goto L18
            ii.e r2 = p154ii.C3178e.f12714e
            r3 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            java.lang.String r1 = r2.m7627b(r3, r4, r5, r6, r7)
            r0.fine(r1)
        L18:
            int r0 = r8.f12839Z
            r1 = 1
            if (r10 > r0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L73
            r2 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r0 = (int) r2
            r0 = r0 & r9
            if (r0 != 0) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            if (r1 == 0) goto L63
            oi.g r0 = r8.f12842c0
            byte[] r1 = ci.C0988c.f5065a
            java.lang.String r1 = "$this$writeMedium"
            p214m2.C4339q.m9706k(r0, r1)
            int r1 = r10 >>> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.mo11543G(r1)
            int r1 = r10 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.mo11543G(r1)
            r10 = r10 & 255(0xff, float:3.57E-43)
            r0.mo11543G(r10)
            oi.g r10 = r8.f12842c0
            r11 = r11 & 255(0xff, float:3.57E-43)
            r10.mo11543G(r11)
            oi.g r10 = r8.f12842c0
            r11 = r12 & 255(0xff, float:3.57E-43)
            r10.mo11543G(r11)
            oi.g r10 = r8.f12842c0
            r11 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r11
            r10.mo11581z(r9)
            return
        L63:
            java.lang.String r10 = "reserved bit set: "
            java.lang.String r9 = android.support.v4.media.C0142a.m254a(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L73:
            java.lang.String r9 = "FRAME_SIZE_ERROR length > "
            java.lang.StringBuilder r9 = android.support.v4.media.C0144c.m256a(r9)
            int r11 = r8.f12839Z
            r9.append(r11)
            java.lang.String r11 = ": "
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    /* renamed from: l */
    public final synchronized void m7676l(int r5, p154ii.EnumC3175b r6, byte[] r7) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f12840a0     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto L44
            int r0 = r6.f12680Y     // Catch: java.lang.Throwable -> L4c
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L38
            int r0 = r7.length     // Catch: java.lang.Throwable -> L4c
            int r0 = r0 + 8
            r1 = 7
            r4.m7675i(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L4c
            oi.g r0 = r4.f12842c0     // Catch: java.lang.Throwable -> L4c
            r0.mo11581z(r5)     // Catch: java.lang.Throwable -> L4c
            oi.g r5 = r4.f12842c0     // Catch: java.lang.Throwable -> L4c
            int r6 = r6.f12680Y     // Catch: java.lang.Throwable -> L4c
            r5.mo11581z(r6)     // Catch: java.lang.Throwable -> L4c
            int r5 = r7.length     // Catch: java.lang.Throwable -> L4c
            if (r5 != 0) goto L28
            r2 = 1
        L28:
            r5 = r2 ^ 1
            if (r5 == 0) goto L31
            oi.g r5 = r4.f12842c0     // Catch: java.lang.Throwable -> L4c
            r5.mo11551O(r7)     // Catch: java.lang.Throwable -> L4c
        L31:
            oi.g r5 = r4.f12842c0     // Catch: java.lang.Throwable -> L4c
            r5.flush()     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r4)
            return
        L38:
            java.lang.String r5 = "errorCode.httpCode == -1"
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L4c
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L4c
            throw r6     // Catch: java.lang.Throwable -> L4c
        L44:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = "closed"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4c
            throw r5     // Catch: java.lang.Throwable -> L4c
        L4c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    /* renamed from: n */
    public final synchronized void m7677n(boolean r7, int r8, java.util.List<p154ii.C3176c> r9) {
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "headerBlock"
            p214m2.C4339q.m9706k(r9, r0)     // Catch: java.lang.Throwable -> L41
            boolean r0 = r6.f12840a0     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L39
            ii.d$b r0 = r6.f12841b0     // Catch: java.lang.Throwable -> L41
            r0.m7624e(r9)     // Catch: java.lang.Throwable -> L41
            oi.e r9 = r6.f12838Y     // Catch: java.lang.Throwable -> L41
            long r0 = r9.f20501Z     // Catch: java.lang.Throwable -> L41
            int r9 = r6.f12839Z     // Catch: java.lang.Throwable -> L41
            long r2 = (long) r9     // Catch: java.lang.Throwable -> L41
            long r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L41
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 != 0) goto L20
            r4 = 4
            goto L21
        L20:
            r4 = 0
        L21:
            if (r7 == 0) goto L25
            r4 = r4 | 1
        L25:
            int r7 = (int) r2     // Catch: java.lang.Throwable -> L41
            r5 = 1
            r6.m7675i(r8, r7, r5, r4)     // Catch: java.lang.Throwable -> L41
            oi.g r7 = r6.f12842c0     // Catch: java.lang.Throwable -> L41
            oi.e r4 = r6.f12838Y     // Catch: java.lang.Throwable -> L41
            r7.mo5749p0(r4, r2)     // Catch: java.lang.Throwable -> L41
            if (r9 <= 0) goto L37
            long r0 = r0 - r2
            r6.m7672R(r8, r0)     // Catch: java.lang.Throwable -> L41
        L37:
            monitor-exit(r6)
            return
        L39:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L41
            java.lang.String r8 = "closed"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L41
            throw r7     // Catch: java.lang.Throwable -> L41
        L41:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }
}
