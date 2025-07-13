package p260oi;

/* renamed from: oi.n */
/* loaded from: classes.dex */
public final class C5292n implements p260oi.InterfaceC5304z {

    /* renamed from: Y */
    public int f20517Y;

    /* renamed from: Z */
    public boolean f20518Z;

    /* renamed from: a0 */
    public final p260oi.InterfaceC5286h f20519a0;

    /* renamed from: b0 */
    public final java.util.zip.Inflater f20520b0;

    public C5292n(p260oi.InterfaceC5286h r1, java.util.zip.Inflater r2) {
            r0 = this;
            r0.<init>()
            r0.f20519a0 = r1
            r0.f20520b0 = r2
            return
    }

    @Override // p260oi.InterfaceC5304z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            boolean r0 = r1.f20518Z
            if (r0 == 0) goto L5
            return
        L5:
            java.util.zip.Inflater r0 = r1.f20520b0
            r0.end()
            r0 = 1
            r1.f20518Z = r0
            oi.h r0 = r1.f20519a0
            r0.close()
            return
    }

    @Override // p260oi.InterfaceC5304z
    /* renamed from: d */
    public p260oi.C5279a0 mo7463d() {
            r1 = this;
            oi.h r0 = r1.f20519a0
            oi.a0 r0 = r0.mo7463d()
            return r0
    }

    @Override // p260oi.InterfaceC5304z
    /* renamed from: j0 */
    public long mo4683j0(p260oi.C5283e r10, long r11) {
            r9 = this;
            java.lang.String r0 = "sink"
            p214m2.C4339q.m9706k(r10, r0)
        L5:
            p214m2.C4339q.m9706k(r10, r0)
            r1 = 0
            r3 = 1
            int r4 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r4 < 0) goto L11
            r5 = 1
            goto L12
        L11:
            r5 = 0
        L12:
            if (r5 == 0) goto Ld3
            boolean r5 = r9.f20518Z
            r5 = r5 ^ r3
            if (r5 == 0) goto Lc7
            if (r4 != 0) goto L1d
            goto L94
        L1d:
            oi.u r3 = r10.m11580y0(r3)     // Catch: java.util.zip.DataFormatException -> Lc0
            int r4 = r3.f20538c     // Catch: java.util.zip.DataFormatException -> Lc0
            int r4 = 8192 - r4
            long r4 = (long) r4     // Catch: java.util.zip.DataFormatException -> Lc0
            long r4 = java.lang.Math.min(r11, r4)     // Catch: java.util.zip.DataFormatException -> Lc0
            int r5 = (int) r4     // Catch: java.util.zip.DataFormatException -> Lc0
            java.util.zip.Inflater r4 = r9.f20520b0     // Catch: java.util.zip.DataFormatException -> Lc0
            boolean r4 = r4.needsInput()     // Catch: java.util.zip.DataFormatException -> Lc0
            if (r4 != 0) goto L34
            goto L56
        L34:
            oi.h r4 = r9.f20519a0     // Catch: java.util.zip.DataFormatException -> Lc0
            boolean r4 = r4.mo11541F()     // Catch: java.util.zip.DataFormatException -> Lc0
            if (r4 == 0) goto L3d
            goto L56
        L3d:
            oi.h r4 = r9.f20519a0     // Catch: java.util.zip.DataFormatException -> Lc0
            oi.e r4 = r4.mo11561c()     // Catch: java.util.zip.DataFormatException -> Lc0
            oi.u r4 = r4.f20500Y     // Catch: java.util.zip.DataFormatException -> Lc0
            p214m2.C4339q.m9704i(r4)     // Catch: java.util.zip.DataFormatException -> Lc0
            int r6 = r4.f20538c     // Catch: java.util.zip.DataFormatException -> Lc0
            int r7 = r4.f20537b     // Catch: java.util.zip.DataFormatException -> Lc0
            int r6 = r6 - r7
            r9.f20517Y = r6     // Catch: java.util.zip.DataFormatException -> Lc0
            java.util.zip.Inflater r8 = r9.f20520b0     // Catch: java.util.zip.DataFormatException -> Lc0
            byte[] r4 = r4.f20536a     // Catch: java.util.zip.DataFormatException -> Lc0
            r8.setInput(r4, r7, r6)     // Catch: java.util.zip.DataFormatException -> Lc0
        L56:
            java.util.zip.Inflater r4 = r9.f20520b0     // Catch: java.util.zip.DataFormatException -> Lc0
            byte[] r6 = r3.f20536a     // Catch: java.util.zip.DataFormatException -> Lc0
            int r7 = r3.f20538c     // Catch: java.util.zip.DataFormatException -> Lc0
            int r4 = r4.inflate(r6, r7, r5)     // Catch: java.util.zip.DataFormatException -> Lc0
            int r5 = r9.f20517Y     // Catch: java.util.zip.DataFormatException -> Lc0
            if (r5 != 0) goto L65
            goto L77
        L65:
            java.util.zip.Inflater r6 = r9.f20520b0     // Catch: java.util.zip.DataFormatException -> Lc0
            int r6 = r6.getRemaining()     // Catch: java.util.zip.DataFormatException -> Lc0
            int r5 = r5 - r6
            int r6 = r9.f20517Y     // Catch: java.util.zip.DataFormatException -> Lc0
            int r6 = r6 - r5
            r9.f20517Y = r6     // Catch: java.util.zip.DataFormatException -> Lc0
            oi.h r6 = r9.f20519a0     // Catch: java.util.zip.DataFormatException -> Lc0
            long r7 = (long) r5     // Catch: java.util.zip.DataFormatException -> Lc0
            r6.mo11559b(r7)     // Catch: java.util.zip.DataFormatException -> Lc0
        L77:
            if (r4 <= 0) goto L85
            int r5 = r3.f20538c     // Catch: java.util.zip.DataFormatException -> Lc0
            int r5 = r5 + r4
            r3.f20538c = r5     // Catch: java.util.zip.DataFormatException -> Lc0
            long r5 = r10.f20501Z     // Catch: java.util.zip.DataFormatException -> Lc0
            long r3 = (long) r4     // Catch: java.util.zip.DataFormatException -> Lc0
            long r5 = r5 + r3
            r10.f20501Z = r5     // Catch: java.util.zip.DataFormatException -> Lc0
            goto L95
        L85:
            int r4 = r3.f20537b     // Catch: java.util.zip.DataFormatException -> Lc0
            int r5 = r3.f20538c     // Catch: java.util.zip.DataFormatException -> Lc0
            if (r4 != r5) goto L94
            oi.u r4 = r3.m11604a()     // Catch: java.util.zip.DataFormatException -> Lc0
            r10.f20500Y = r4     // Catch: java.util.zip.DataFormatException -> Lc0
            p260oi.C5300v.m11608b(r3)     // Catch: java.util.zip.DataFormatException -> Lc0
        L94:
            r3 = r1
        L95:
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L9a
            return r3
        L9a:
            java.util.zip.Inflater r1 = r9.f20520b0
            boolean r1 = r1.finished()
            if (r1 != 0) goto Lbd
            java.util.zip.Inflater r1 = r9.f20520b0
            boolean r1 = r1.needsDictionary()
            if (r1 == 0) goto Lab
            goto Lbd
        Lab:
            oi.h r1 = r9.f20519a0
            boolean r1 = r1.mo11541F()
            if (r1 != 0) goto Lb5
            goto L5
        Lb5:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r11 = "source exhausted prematurely"
            r10.<init>(r11)
            throw r10
        Lbd:
            r10 = -1
            return r10
        Lc0:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r10)
            throw r11
        Lc7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "closed"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Ld3:
            java.lang.String r10 = "byteCount < 0: "
            java.lang.String r10 = p382w0.C6774a.m13748a(r10, r11)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
    }
}
