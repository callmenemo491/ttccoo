package bi;

/* renamed from: bi.h0 */
/* loaded from: classes.dex */
public abstract class AbstractC0785h0 implements java.io.Closeable {

    /* renamed from: Y */
    public java.io.Reader f4255Y;

    /* renamed from: bi.h0$a */
    public static final class a extends java.io.Reader {

        /* renamed from: Y */
        public boolean f4256Y;

        /* renamed from: Z */
        public java.io.Reader f4257Z;

        /* renamed from: a0 */
        public final p260oi.InterfaceC5286h f4258a0;

        /* renamed from: b0 */
        public final java.nio.charset.Charset f4259b0;

        public a(p260oi.InterfaceC5286h r2, java.nio.charset.Charset r3) {
                r1 = this;
                java.lang.String r0 = "source"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "charset"
                p214m2.C4339q.m9706k(r3, r0)
                r1.<init>()
                r1.f4258a0 = r2
                r1.f4259b0 = r3
                return
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                r0 = 1
                r1.f4256Y = r0
                java.io.Reader r0 = r1.f4257Z
                if (r0 == 0) goto Lb
                r0.close()
                goto L10
            Lb:
                oi.h r0 = r1.f4258a0
                r0.close()
            L10:
                return
        }

        @Override // java.io.Reader
        public int read(char[] r5, int r6, int r7) {
                r4 = this;
                java.lang.String r0 = "cbuf"
                p214m2.C4339q.m9706k(r5, r0)
                boolean r0 = r4.f4256Y
                if (r0 != 0) goto L28
                java.io.Reader r0 = r4.f4257Z
                if (r0 == 0) goto Le
                goto L23
            Le:
                java.io.InputStreamReader r0 = new java.io.InputStreamReader
                oi.h r1 = r4.f4258a0
                java.io.InputStream r1 = r1.mo11578w0()
                oi.h r2 = r4.f4258a0
                java.nio.charset.Charset r3 = r4.f4259b0
                java.nio.charset.Charset r2 = ci.C0988c.m2712q(r2, r3)
                r0.<init>(r1, r2)
                r4.f4257Z = r0
            L23:
                int r5 = r0.read(r5, r6, r7)
                return r5
            L28:
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r6 = "Stream closed"
                r5.<init>(r6)
                throw r5
        }
    }

    public AbstractC0785h0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final java.io.Reader m2393a() {
            r4 = this;
            java.io.Reader r0 = r4.f4255Y
            if (r0 == 0) goto L5
            goto L21
        L5:
            bi.h0$a r0 = new bi.h0$a
            oi.h r1 = r4.mo2396l()
            bi.y r2 = r4.mo2395i()
            if (r2 == 0) goto L1a
            java.nio.charset.Charset r3 = p362uh.C6455a.f25034b
            java.nio.charset.Charset r2 = r2.m2458a(r3)
            if (r2 == 0) goto L1a
            goto L1c
        L1a:
            java.nio.charset.Charset r2 = p362uh.C6455a.f25034b
        L1c:
            r0.<init>(r1, r2)
            r4.f4255Y = r0
        L21:
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            oi.h r0 = r1.mo2396l()
            ci.C0988c.m2698c(r0)
            return
    }

    /* renamed from: h */
    public abstract long mo2394h();

    /* renamed from: i */
    public abstract bi.C0805y mo2395i();

    /* renamed from: l */
    public abstract p260oi.InterfaceC5286h mo2396l();

    /* renamed from: n */
    public final java.lang.String m2397n() {
            r3 = this;
            oi.h r0 = r3.mo2396l()
            bi.y r1 = r3.mo2395i()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L13
            java.nio.charset.Charset r2 = p362uh.C6455a.f25034b     // Catch: java.lang.Throwable -> L22
            java.nio.charset.Charset r1 = r1.m2458a(r2)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L13
            goto L15
        L13:
            java.nio.charset.Charset r1 = p362uh.C6455a.f25034b     // Catch: java.lang.Throwable -> L22
        L15:
            java.nio.charset.Charset r1 = ci.C0988c.m2712q(r0, r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r0.mo11575u0(r1)     // Catch: java.lang.Throwable -> L22
            r2 = 0
            p101fh.C2174f.m5717g(r0, r2)
            return r1
        L22:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L24
        L24:
            r2 = move-exception
            p101fh.C2174f.m5717g(r0, r1)
            throw r2
    }
}
