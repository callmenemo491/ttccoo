package p260oi;

/* renamed from: oi.s */
/* loaded from: classes.dex */
public final class C5297s implements p260oi.InterfaceC5285g {

    /* renamed from: Y */
    public final p260oi.C5283e f20529Y;

    /* renamed from: Z */
    public boolean f20530Z;

    /* renamed from: a0 */
    public final p260oi.InterfaceC5302x f20531a0;

    public C5297s(p260oi.InterfaceC5302x r1) {
            r0 = this;
            r0.<init>()
            r0.f20531a0 = r1
            oi.e r1 = new oi.e
            r1.<init>()
            r0.f20529Y = r1
            return
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: G */
    public p260oi.InterfaceC5285g mo11543G(int r2) {
            r1 = this;
            boolean r0 = r1.f20530Z
            r0 = r0 ^ 1
            if (r0 == 0) goto Lf
            oi.e r0 = r1.f20529Y
            r0.m11539D0(r2)
            r1.m11601a()
            return r1
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: I */
    public p260oi.InterfaceC5285g mo11546I(p260oi.C5287i r2) {
            r1 = this;
            java.lang.String r0 = "byteString"
            p214m2.C4339q.m9706k(r2, r0)
            boolean r0 = r1.f20530Z
            r0 = r0 ^ 1
            if (r0 == 0) goto L14
            oi.e r0 = r1.f20529Y
            r0.m11582z0(r2)
            r1.m11601a()
            return r1
        L14:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: O */
    public p260oi.InterfaceC5285g mo11551O(byte[] r2) {
            r1 = this;
            java.lang.String r0 = "source"
            p214m2.C4339q.m9706k(r2, r0)
            boolean r0 = r1.f20530Z
            r0 = r0 ^ 1
            if (r0 == 0) goto L14
            oi.e r0 = r1.f20529Y
            r0.m11535A0(r2)
            r1.m11601a()
            return r1
        L14:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: a */
    public p260oi.InterfaceC5285g m11601a() {
            r5 = this;
            boolean r0 = r5.f20530Z
            r0 = r0 ^ 1
            if (r0 == 0) goto L1a
            oi.e r0 = r5.f20529Y
            long r0 = r0.m11534A()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L19
            oi.x r2 = r5.f20531a0
            oi.e r3 = r5.f20529Y
            r2.mo5749p0(r3, r0)
        L19:
            return r5
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: c */
    public p260oi.C5283e mo11561c() {
            r1 = this;
            oi.e r0 = r1.f20529Y
            return r0
    }

    @Override // p260oi.InterfaceC5302x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r7 = this;
            boolean r0 = r7.f20530Z
            if (r0 == 0) goto L5
            goto L26
        L5:
            r0 = 0
            oi.e r1 = r7.f20529Y     // Catch: java.lang.Throwable -> L16
            long r2 = r1.f20501Z     // Catch: java.lang.Throwable -> L16
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L17
            oi.x r4 = r7.f20531a0     // Catch: java.lang.Throwable -> L16
            r4.mo5749p0(r1, r2)     // Catch: java.lang.Throwable -> L16
            goto L17
        L16:
            r0 = move-exception
        L17:
            oi.x r1 = r7.f20531a0     // Catch: java.lang.Throwable -> L1d
            r1.close()     // Catch: java.lang.Throwable -> L1d
            goto L21
        L1d:
            r1 = move-exception
            if (r0 != 0) goto L21
            r0 = r1
        L21:
            r1 = 1
            r7.f20530Z = r1
            if (r0 != 0) goto L27
        L26:
            return
        L27:
            throw r0
    }

    @Override // p260oi.InterfaceC5302x
    /* renamed from: d */
    public p260oi.C5279a0 mo7464d() {
            r1 = this;
            oi.x r0 = r1.f20531a0
            oi.a0 r0 = r0.mo7464d()
            return r0
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: e */
    public p260oi.InterfaceC5285g mo11563e(byte[] r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "source"
            p214m2.C4339q.m9706k(r2, r0)
            boolean r0 = r1.f20530Z
            r0 = r0 ^ 1
            if (r0 == 0) goto L14
            oi.e r0 = r1.f20529Y
            r0.m11536B0(r2, r3, r4)
            r1.m11601a()
            return r1
        L14:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // p260oi.InterfaceC5285g, p260oi.InterfaceC5302x, java.io.Flushable
    public void flush() {
            r6 = this;
            boolean r0 = r6.f20530Z
            r0 = r0 ^ 1
            if (r0 == 0) goto L1b
            oi.e r0 = r6.f20529Y
            long r1 = r0.f20501Z
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L15
            oi.x r3 = r6.f20531a0
            r3.mo5749p0(r0, r1)
        L15:
            oi.x r0 = r6.f20531a0
            r0.flush()
            return
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            boolean r0 = r1.f20530Z
            r0 = r0 ^ 1
            return r0
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: l0 */
    public p260oi.InterfaceC5285g mo11567l0(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "string"
            p214m2.C4339q.m9706k(r2, r0)
            boolean r0 = r1.f20530Z
            r0 = r0 ^ 1
            if (r0 == 0) goto L14
            oi.e r0 = r1.f20529Y
            r0.m11547I0(r2)
            r1.m11601a()
            return r1
        L14:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: m */
    public p260oi.InterfaceC5285g mo11568m(long r2) {
            r1 = this;
            boolean r0 = r1.f20530Z
            r0 = r0 ^ 1
            if (r0 == 0) goto L10
            oi.e r0 = r1.f20529Y
            r0.m11542F0(r2)
            oi.g r2 = r1.m11601a()
            return r2
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: n0 */
    public p260oi.InterfaceC5285g mo11570n0(long r2) {
            r1 = this;
            boolean r0 = r1.f20530Z
            r0 = r0 ^ 1
            if (r0 == 0) goto Lf
            oi.e r0 = r1.f20529Y
            r0.m11540E0(r2)
            r1.m11601a()
            return r1
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // p260oi.InterfaceC5302x
    /* renamed from: p0 */
    public void mo5749p0(p260oi.C5283e r2, long r3) {
            r1 = this;
            java.lang.String r0 = "source"
            p214m2.C4339q.m9706k(r2, r0)
            boolean r0 = r1.f20530Z
            r0 = r0 ^ 1
            if (r0 == 0) goto L14
            oi.e r0 = r1.f20529Y
            r0.mo5749p0(r2, r3)
            r1.m11601a()
            return
        L14:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "closed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "buffer("
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            oi.x r1 = r2.f20531a0
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: v */
    public p260oi.InterfaceC5285g mo11576v(int r2) {
            r1 = this;
            boolean r0 = r1.f20530Z
            r0 = r0 ^ 1
            if (r0 == 0) goto Lf
            oi.e r0 = r1.f20529Y
            r0.m11545H0(r2)
            r1.m11601a()
            return r1
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r2) {
            r1 = this;
            java.lang.String r0 = "source"
            p214m2.C4339q.m9706k(r2, r0)
            boolean r0 = r1.f20530Z
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            oi.e r0 = r1.f20529Y
            int r2 = r0.write(r2)
            r1.m11601a()
            return r2
        L15:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // p260oi.InterfaceC5285g
    /* renamed from: z */
    public p260oi.InterfaceC5285g mo11581z(int r2) {
            r1 = this;
            boolean r0 = r1.f20530Z
            r0 = r0 ^ 1
            if (r0 == 0) goto Lf
            oi.e r0 = r1.f20529Y
            r0.m11544G0(r2)
            r1.m11601a()
            return r1
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }
}
