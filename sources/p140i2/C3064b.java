package p140i2;

/* renamed from: i2.b */
/* loaded from: classes.dex */
public class C3064b implements java.io.Closeable {

    /* renamed from: Y */
    public final java.io.InputStream f12326Y;

    /* renamed from: Z */
    public final java.nio.charset.Charset f12327Z;

    /* renamed from: a0 */
    public byte[] f12328a0;

    /* renamed from: b0 */
    public int f12329b0;

    /* renamed from: c0 */
    public int f12330c0;

    /* renamed from: i2.b$a */
    public class a extends java.io.ByteArrayOutputStream {

        /* renamed from: Y */
        public final /* synthetic */ p140i2.C3064b f12331Y;

        public a(p140i2.C3064b r1, int r2) {
                r0 = this;
                r0.f12331Y = r1
                r0.<init>(r2)
                return
        }

        @Override // java.io.ByteArrayOutputStream
        public java.lang.String toString() {
                r5 = this;
                int r0 = r5.count
                if (r0 <= 0) goto L10
                byte[] r1 = r5.buf
                int r2 = r0 + (-1)
                r1 = r1[r2]
                r2 = 13
                if (r1 != r2) goto L10
                int r0 = r0 + (-1)
            L10:
                java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L21
                byte[] r2 = r5.buf     // Catch: java.io.UnsupportedEncodingException -> L21
                r3 = 0
                i2.b r4 = r5.f12331Y     // Catch: java.io.UnsupportedEncodingException -> L21
                java.nio.charset.Charset r4 = r4.f12327Z     // Catch: java.io.UnsupportedEncodingException -> L21
                java.lang.String r4 = r4.name()     // Catch: java.io.UnsupportedEncodingException -> L21
                r1.<init>(r2, r3, r0, r4)     // Catch: java.io.UnsupportedEncodingException -> L21
                return r1
            L21:
                r0 = move-exception
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>(r0)
                throw r1
        }
    }

    public C3064b(java.io.InputStream r2, java.nio.charset.Charset r3) {
            r1 = this;
            r1.<init>()
            if (r3 == 0) goto L20
            java.nio.charset.Charset r0 = p140i2.C3065c.f12332a
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L18
            r1.f12326Y = r2
            r1.f12327Z = r3
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r2]
            r1.f12328a0 = r2
            return
        L18:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Unsupported encoding"
            r2.<init>(r3)
            throw r2
        L20:
            r2 = 0
            throw r2
    }

    /* renamed from: a */
    public final void m7510a() {
            r4 = this;
            java.io.InputStream r0 = r4.f12326Y
            byte[] r1 = r4.f12328a0
            int r2 = r1.length
            r3 = 0
            int r0 = r0.read(r1, r3, r2)
            r1 = -1
            if (r0 == r1) goto L12
            r4.f12329b0 = r3
            r4.f12330c0 = r0
            return
        L12:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.io.InputStream r0 = r2.f12326Y
            monitor-enter(r0)
            byte[] r1 = r2.f12328a0     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto Lf
            r1 = 0
            r2.f12328a0 = r1     // Catch: java.lang.Throwable -> L11
            java.io.InputStream r1 = r2.f12326Y     // Catch: java.lang.Throwable -> L11
            r1.close()     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    /* renamed from: h */
    public java.lang.String m7511h() {
            r7 = this;
            java.io.InputStream r0 = r7.f12326Y
            monitor-enter(r0)
            byte[] r1 = r7.f12328a0     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L7f
            int r1 = r7.f12329b0     // Catch: java.lang.Throwable -> L87
            int r2 = r7.f12330c0     // Catch: java.lang.Throwable -> L87
            if (r1 < r2) goto L10
            r7.m7510a()     // Catch: java.lang.Throwable -> L87
        L10:
            int r1 = r7.f12329b0     // Catch: java.lang.Throwable -> L87
        L12:
            int r2 = r7.f12330c0     // Catch: java.lang.Throwable -> L87
            r3 = 10
            if (r1 == r2) goto L41
            byte[] r2 = r7.f12328a0     // Catch: java.lang.Throwable -> L87
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L87
            if (r4 != r3) goto L3e
            int r3 = r7.f12329b0     // Catch: java.lang.Throwable -> L87
            if (r1 == r3) goto L2b
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L87
            r6 = 13
            if (r5 != r6) goto L2b
            goto L2c
        L2b:
            r4 = r1
        L2c:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L87
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.f12327Z     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L87
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L87
            int r1 = r1 + 1
            r7.f12329b0 = r1     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            return r5
        L3e:
            int r1 = r1 + 1
            goto L12
        L41:
            i2.b$a r1 = new i2.b$a     // Catch: java.lang.Throwable -> L87
            int r2 = r7.f12330c0     // Catch: java.lang.Throwable -> L87
            int r4 = r7.f12329b0     // Catch: java.lang.Throwable -> L87
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L87
        L4d:
            byte[] r2 = r7.f12328a0     // Catch: java.lang.Throwable -> L87
            int r4 = r7.f12329b0     // Catch: java.lang.Throwable -> L87
            int r5 = r7.f12330c0     // Catch: java.lang.Throwable -> L87
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L87
            r2 = -1
            r7.f12330c0 = r2     // Catch: java.lang.Throwable -> L87
            r7.m7510a()     // Catch: java.lang.Throwable -> L87
            int r2 = r7.f12329b0     // Catch: java.lang.Throwable -> L87
        L5f:
            int r4 = r7.f12330c0     // Catch: java.lang.Throwable -> L87
            if (r2 == r4) goto L4d
            byte[] r4 = r7.f12328a0     // Catch: java.lang.Throwable -> L87
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L87
            if (r5 != r3) goto L7c
            int r3 = r7.f12329b0     // Catch: java.lang.Throwable -> L87
            if (r2 == r3) goto L72
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L87
        L72:
            int r2 = r2 + 1
            r7.f12329b0 = r2     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            return r1
        L7c:
            int r2 = r2 + 1
            goto L5f
        L7f:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L87
            throw r1     // Catch: java.lang.Throwable -> L87
        L87:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            throw r1
    }
}
