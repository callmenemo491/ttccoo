package p382w0;

/* renamed from: w0.b */
/* loaded from: classes.dex */
public class C6775b {

    /* renamed from: A */
    public static final byte[] f26244A = null;

    /* renamed from: B */
    public static final byte[] f26245B = null;

    /* renamed from: C */
    public static final byte[] f26246C = null;

    /* renamed from: D */
    public static final byte[] f26247D = null;

    /* renamed from: E */
    public static final byte[] f26248E = null;

    /* renamed from: F */
    public static final java.lang.String[] f26249F = null;

    /* renamed from: G */
    public static final int[] f26250G = null;

    /* renamed from: H */
    public static final byte[] f26251H = null;

    /* renamed from: I */
    public static final p382w0.C6775b.d f26252I = null;

    /* renamed from: J */
    public static final p382w0.C6775b.d[][] f26253J = null;

    /* renamed from: K */
    public static final p382w0.C6775b.d[] f26254K = null;

    /* renamed from: L */
    public static final java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface.ExifTag>[] f26255L = null;

    /* renamed from: M */
    public static final java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifTag>[] f26256M = null;

    /* renamed from: N */
    public static final java.util.HashSet<java.lang.String> f26257N = null;

    /* renamed from: O */
    public static final java.util.HashMap<java.lang.Integer, java.lang.Integer> f26258O = null;

    /* renamed from: P */
    public static final java.nio.charset.Charset f26259P = null;

    /* renamed from: Q */
    public static final byte[] f26260Q = null;

    /* renamed from: R */
    public static final byte[] f26261R = null;

    /* renamed from: n */
    public static final boolean f26262n = false;

    /* renamed from: o */
    public static final java.util.List<java.lang.Integer> f26263o = null;

    /* renamed from: p */
    public static final java.util.List<java.lang.Integer> f26264p = null;

    /* renamed from: q */
    public static final int[] f26265q = null;

    /* renamed from: r */
    public static final int[] f26266r = null;

    /* renamed from: s */
    public static final byte[] f26267s = null;

    /* renamed from: t */
    public static final byte[] f26268t = null;

    /* renamed from: u */
    public static final byte[] f26269u = null;

    /* renamed from: v */
    public static final byte[] f26270v = null;

    /* renamed from: w */
    public static final byte[] f26271w = null;

    /* renamed from: x */
    public static final byte[] f26272x = null;

    /* renamed from: y */
    public static final byte[] f26273y = null;

    /* renamed from: z */
    public static final byte[] f26274z = null;

    /* renamed from: a */
    public java.io.FileDescriptor f26275a;

    /* renamed from: b */
    public android.content.res.AssetManager.AssetInputStream f26276b;

    /* renamed from: c */
    public int f26277c;

    /* renamed from: d */
    public boolean f26278d;

    /* renamed from: e */
    public final java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>[] f26279e;

    /* renamed from: f */
    public java.util.Set<java.lang.Integer> f26280f;

    /* renamed from: g */
    public java.nio.ByteOrder f26281g;

    /* renamed from: h */
    public boolean f26282h;

    /* renamed from: i */
    public int f26283i;

    /* renamed from: j */
    public int f26284j;

    /* renamed from: k */
    public int f26285k;

    /* renamed from: l */
    public int f26286l;

    /* renamed from: m */
    public int f26287m;

    /* renamed from: w0.b$a */
    public class a extends android.media.MediaDataSource {

        /* renamed from: Y */
        public long f26288Y;

        /* renamed from: Z */
        public final /* synthetic */ p382w0.C6775b.b f26289Z;

        public a(p382w0.C6775b r1, p382w0.C6775b.b r2) {
                r0 = this;
                r0.f26289Z = r2
                r0.<init>()
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
                return
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
                r2 = this;
                r0 = -1
                return r0
        }

        @Override // android.media.MediaDataSource
        public int readAt(long r7, byte[] r9, int r10, int r11) {
                r6 = this;
                if (r11 != 0) goto L4
                r7 = 0
                return r7
            L4:
                r0 = 0
                r2 = -1
                int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r3 >= 0) goto Lc
                return r2
            Lc:
                long r3 = r6.f26288Y     // Catch: java.io.IOException -> L4e
                int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r5 == 0) goto L2a
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 < 0) goto L23
                w0.b$b r0 = r6.f26289Z     // Catch: java.io.IOException -> L4e
                int r0 = r0.available()     // Catch: java.io.IOException -> L4e
                long r0 = (long) r0     // Catch: java.io.IOException -> L4e
                long r3 = r3 + r0
                int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r0 < 0) goto L23
                return r2
            L23:
                w0.b$b r0 = r6.f26289Z     // Catch: java.io.IOException -> L4e
                r0.m13777h(r7)     // Catch: java.io.IOException -> L4e
                r6.f26288Y = r7     // Catch: java.io.IOException -> L4e
            L2a:
                w0.b$b r7 = r6.f26289Z     // Catch: java.io.IOException -> L4e
                int r7 = r7.available()     // Catch: java.io.IOException -> L4e
                if (r11 <= r7) goto L38
                w0.b$b r7 = r6.f26289Z     // Catch: java.io.IOException -> L4e
                int r11 = r7.available()     // Catch: java.io.IOException -> L4e
            L38:
                w0.b$b r7 = r6.f26289Z     // Catch: java.io.IOException -> L4e
                java.io.DataInputStream r8 = r7.f26292Y     // Catch: java.io.IOException -> L4e
                int r8 = r8.read(r9, r10, r11)     // Catch: java.io.IOException -> L4e
                int r9 = r7.f26295b0     // Catch: java.io.IOException -> L4e
                int r9 = r9 + r8
                r7.f26295b0 = r9     // Catch: java.io.IOException -> L4e
                if (r8 < 0) goto L4e
                long r9 = r6.f26288Y     // Catch: java.io.IOException -> L4e
                long r0 = (long) r8     // Catch: java.io.IOException -> L4e
                long r9 = r9 + r0
                r6.f26288Y = r9     // Catch: java.io.IOException -> L4e
                return r8
            L4e:
                r7 = -1
                r6.f26288Y = r7
                return r2
        }
    }

    /* renamed from: w0.b$b */
    public static class b extends java.io.InputStream implements java.io.DataInput {

        /* renamed from: c0 */
        public static final java.nio.ByteOrder f26290c0 = null;

        /* renamed from: d0 */
        public static final java.nio.ByteOrder f26291d0 = null;

        /* renamed from: Y */
        public java.io.DataInputStream f26292Y;

        /* renamed from: Z */
        public java.nio.ByteOrder f26293Z;

        /* renamed from: a0 */
        public final int f26294a0;

        /* renamed from: b0 */
        public int f26295b0;

        static {
                java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
                p382w0.C6775b.b.f26290c0 = r0
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                p382w0.C6775b.b.f26291d0 = r0
                return
        }

        public b(java.io.InputStream r3) {
                r2 = this;
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                r2.<init>()
                r2.f26293Z = r0
                java.io.DataInputStream r1 = new java.io.DataInputStream
                r1.<init>(r3)
                r2.f26292Y = r1
                int r3 = r1.available()
                r2.f26294a0 = r3
                r1 = 0
                r2.f26295b0 = r1
                java.io.DataInputStream r1 = r2.f26292Y
                r1.mark(r3)
                r2.f26293Z = r0
                return
        }

        public b(byte[] r2) {
                r1 = this;
                java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
                r0.<init>(r2)
                r1.<init>(r0)
                return
        }

        /* renamed from: a */
        public long m13776a() {
                r4 = this;
                int r0 = r4.readInt()
                long r0 = (long) r0
                r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r0 = r0 & r2
                return r0
        }

        @Override // java.io.InputStream
        public int available() {
                r1 = this;
                java.io.DataInputStream r0 = r1.f26292Y
                int r0 = r0.available()
                return r0
        }

        /* renamed from: h */
        public void m13777h(long r5) {
                r4 = this;
                int r0 = r4.f26295b0
                long r1 = (long) r0
                int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r3 <= 0) goto L17
                r0 = 0
                r4.f26295b0 = r0
                java.io.DataInputStream r0 = r4.f26292Y
                r0.reset()
                java.io.DataInputStream r0 = r4.f26292Y
                int r1 = r4.f26294a0
                r0.mark(r1)
                goto L19
            L17:
                long r0 = (long) r0
                long r5 = r5 - r0
            L19:
                int r6 = (int) r5
                int r5 = r4.skipBytes(r6)
                if (r5 != r6) goto L21
                return
            L21:
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r6 = "Couldn't seek up to the byteCount"
                r5.<init>(r6)
                throw r5
        }

        @Override // java.io.InputStream
        public int read() {
                r1 = this;
                int r0 = r1.f26295b0
                int r0 = r0 + 1
                r1.f26295b0 = r0
                java.io.DataInputStream r0 = r1.f26292Y
                int r0 = r0.read()
                return r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r2, int r3, int r4) {
                r1 = this;
                java.io.DataInputStream r0 = r1.f26292Y
                int r2 = r0.read(r2, r3, r4)
                int r3 = r1.f26295b0
                int r3 = r3 + r2
                r1.f26295b0 = r3
                return r2
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
                r1 = this;
                int r0 = r1.f26295b0
                int r0 = r0 + 1
                r1.f26295b0 = r0
                java.io.DataInputStream r0 = r1.f26292Y
                boolean r0 = r0.readBoolean()
                return r0
        }

        @Override // java.io.DataInput
        public byte readByte() {
                r2 = this;
                int r0 = r2.f26295b0
                int r0 = r0 + 1
                r2.f26295b0 = r0
                int r1 = r2.f26294a0
                if (r0 > r1) goto L1a
                java.io.DataInputStream r0 = r2.f26292Y
                int r0 = r0.read()
                if (r0 < 0) goto L14
                byte r0 = (byte) r0
                return r0
            L14:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
            L1a:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        @Override // java.io.DataInput
        public char readChar() {
                r1 = this;
                int r0 = r1.f26295b0
                int r0 = r0 + 2
                r1.f26295b0 = r0
                java.io.DataInputStream r0 = r1.f26292Y
                char r0 = r0.readChar()
                return r0
        }

        @Override // java.io.DataInput
        public double readDouble() {
                r2 = this;
                long r0 = r2.readLong()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // java.io.DataInput
        public float readFloat() {
                r1 = this;
                int r0 = r1.readInt()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // java.io.DataInput
        public void readFully(byte[] r4) {
                r3 = this;
                int r0 = r3.f26295b0
                int r1 = r4.length
                int r0 = r0 + r1
                r3.f26295b0 = r0
                int r1 = r3.f26294a0
                if (r0 > r1) goto L1e
                java.io.DataInputStream r0 = r3.f26292Y
                r1 = 0
                int r2 = r4.length
                int r0 = r0.read(r4, r1, r2)
                int r4 = r4.length
                if (r0 != r4) goto L16
                return
            L16:
                java.io.IOException r4 = new java.io.IOException
                java.lang.String r0 = "Couldn't read up to the length of buffer"
                r4.<init>(r0)
                throw r4
            L1e:
                java.io.EOFException r4 = new java.io.EOFException
                r4.<init>()
                throw r4
        }

        @Override // java.io.DataInput
        public void readFully(byte[] r3, int r4, int r5) {
                r2 = this;
                int r0 = r2.f26295b0
                int r0 = r0 + r5
                r2.f26295b0 = r0
                int r1 = r2.f26294a0
                if (r0 > r1) goto L1a
                java.io.DataInputStream r0 = r2.f26292Y
                int r3 = r0.read(r3, r4, r5)
                if (r3 != r5) goto L12
                return
            L12:
                java.io.IOException r3 = new java.io.IOException
                java.lang.String r4 = "Couldn't read up to the length of buffer"
                r3.<init>(r4)
                throw r3
            L1a:
                java.io.EOFException r3 = new java.io.EOFException
                r3.<init>()
                throw r3
        }

        @Override // java.io.DataInput
        public int readInt() {
                r6 = this;
                int r0 = r6.f26295b0
                int r0 = r0 + 4
                r6.f26295b0 = r0
                int r1 = r6.f26294a0
                if (r0 > r1) goto L61
                java.io.DataInputStream r0 = r6.f26292Y
                int r0 = r0.read()
                java.io.DataInputStream r1 = r6.f26292Y
                int r1 = r1.read()
                java.io.DataInputStream r2 = r6.f26292Y
                int r2 = r2.read()
                java.io.DataInputStream r3 = r6.f26292Y
                int r3 = r3.read()
                r4 = r0 | r1
                r4 = r4 | r2
                r4 = r4 | r3
                if (r4 < 0) goto L5b
                java.nio.ByteOrder r4 = r6.f26293Z
                java.nio.ByteOrder r5 = p382w0.C6775b.b.f26290c0
                if (r4 != r5) goto L38
                int r3 = r3 << 24
                int r2 = r2 << 16
                int r3 = r3 + r2
                int r1 = r1 << 8
                int r3 = r3 + r1
                int r3 = r3 + r0
                return r3
            L38:
                java.nio.ByteOrder r5 = p382w0.C6775b.b.f26291d0
                if (r4 != r5) goto L46
                int r0 = r0 << 24
                int r1 = r1 << 16
                int r0 = r0 + r1
                int r1 = r2 << 8
                int r0 = r0 + r1
                int r0 = r0 + r3
                return r0
            L46:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Invalid byte order: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.nio.ByteOrder r2 = r6.f26293Z
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L5b:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
            L61:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        @Override // java.io.DataInput
        public java.lang.String readLine() {
                r2 = this;
                java.lang.String r0 = "ExifInterface"
                java.lang.String r1 = "Currently unsupported"
                android.util.Log.d(r0, r1)
                r0 = 0
                return r0
        }

        @Override // java.io.DataInput
        public long readLong() {
                r17 = this;
                r0 = r17
                int r1 = r0.f26295b0
                int r1 = r1 + 8
                r0.f26295b0 = r1
                int r2 = r0.f26294a0
                if (r1 > r2) goto Laf
                java.io.DataInputStream r1 = r0.f26292Y
                int r1 = r1.read()
                java.io.DataInputStream r2 = r0.f26292Y
                int r2 = r2.read()
                java.io.DataInputStream r3 = r0.f26292Y
                int r3 = r3.read()
                java.io.DataInputStream r4 = r0.f26292Y
                int r4 = r4.read()
                java.io.DataInputStream r5 = r0.f26292Y
                int r5 = r5.read()
                java.io.DataInputStream r6 = r0.f26292Y
                int r6 = r6.read()
                java.io.DataInputStream r7 = r0.f26292Y
                int r7 = r7.read()
                java.io.DataInputStream r8 = r0.f26292Y
                int r8 = r8.read()
                r9 = r1 | r2
                r9 = r9 | r3
                r9 = r9 | r4
                r9 = r9 | r5
                r9 = r9 | r6
                r9 = r9 | r7
                r9 = r9 | r8
                if (r9 < 0) goto La9
                java.nio.ByteOrder r9 = r0.f26293Z
                java.nio.ByteOrder r10 = p382w0.C6775b.b.f26290c0
                r13 = 32
                r14 = 40
                r15 = 48
                r16 = 56
                if (r9 != r10) goto L72
                long r8 = (long) r8
                long r8 = r8 << r16
                long r11 = (long) r7
                long r11 = r11 << r15
                long r8 = r8 + r11
                long r6 = (long) r6
                long r6 = r6 << r14
                long r8 = r8 + r6
                long r5 = (long) r5
                long r5 = r5 << r13
                long r8 = r8 + r5
                long r4 = (long) r4
                r6 = 24
                long r4 = r4 << r6
                long r8 = r8 + r4
                long r3 = (long) r3
                r5 = 16
                long r3 = r3 << r5
                long r8 = r8 + r3
                long r2 = (long) r2
                r4 = 8
                long r2 = r2 << r4
                long r8 = r8 + r2
                long r1 = (long) r1
                long r8 = r8 + r1
                return r8
            L72:
                java.nio.ByteOrder r10 = p382w0.C6775b.b.f26291d0
                if (r9 != r10) goto L94
                long r9 = (long) r1
                long r9 = r9 << r16
                long r1 = (long) r2
                long r1 = r1 << r15
                long r9 = r9 + r1
                long r1 = (long) r3
                long r1 = r1 << r14
                long r9 = r9 + r1
                long r1 = (long) r4
                long r1 = r1 << r13
                long r9 = r9 + r1
                long r1 = (long) r5
                r3 = 24
                long r1 = r1 << r3
                long r9 = r9 + r1
                long r1 = (long) r6
                r3 = 16
                long r1 = r1 << r3
                long r9 = r9 + r1
                long r1 = (long) r7
                r3 = 8
                long r1 = r1 << r3
                long r9 = r9 + r1
                long r1 = (long) r8
                long r9 = r9 + r1
                return r9
            L94:
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "Invalid byte order: "
                java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
                java.nio.ByteOrder r3 = r0.f26293Z
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            La9:
                java.io.EOFException r1 = new java.io.EOFException
                r1.<init>()
                throw r1
            Laf:
                java.io.EOFException r1 = new java.io.EOFException
                r1.<init>()
                throw r1
        }

        @Override // java.io.DataInput
        public short readShort() {
                r4 = this;
                int r0 = r4.f26295b0
                int r0 = r0 + 2
                r4.f26295b0 = r0
                int r1 = r4.f26294a0
                if (r0 > r1) goto L49
                java.io.DataInputStream r0 = r4.f26292Y
                int r0 = r0.read()
                java.io.DataInputStream r1 = r4.f26292Y
                int r1 = r1.read()
                r2 = r0 | r1
                if (r2 < 0) goto L43
                java.nio.ByteOrder r2 = r4.f26293Z
                java.nio.ByteOrder r3 = p382w0.C6775b.b.f26290c0
                if (r2 != r3) goto L25
                int r1 = r1 << 8
                int r1 = r1 + r0
                short r0 = (short) r1
                return r0
            L25:
                java.nio.ByteOrder r3 = p382w0.C6775b.b.f26291d0
                if (r2 != r3) goto L2e
                int r0 = r0 << 8
                int r0 = r0 + r1
                short r0 = (short) r0
                return r0
            L2e:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Invalid byte order: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.nio.ByteOrder r2 = r4.f26293Z
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L43:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
            L49:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        @Override // java.io.DataInput
        public java.lang.String readUTF() {
                r1 = this;
                int r0 = r1.f26295b0
                int r0 = r0 + 2
                r1.f26295b0 = r0
                java.io.DataInputStream r0 = r1.f26292Y
                java.lang.String r0 = r0.readUTF()
                return r0
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
                r1 = this;
                int r0 = r1.f26295b0
                int r0 = r0 + 1
                r1.f26295b0 = r0
                java.io.DataInputStream r0 = r1.f26292Y
                int r0 = r0.readUnsignedByte()
                return r0
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
                r4 = this;
                int r0 = r4.f26295b0
                int r0 = r0 + 2
                r4.f26295b0 = r0
                int r1 = r4.f26294a0
                if (r0 > r1) goto L47
                java.io.DataInputStream r0 = r4.f26292Y
                int r0 = r0.read()
                java.io.DataInputStream r1 = r4.f26292Y
                int r1 = r1.read()
                r2 = r0 | r1
                if (r2 < 0) goto L41
                java.nio.ByteOrder r2 = r4.f26293Z
                java.nio.ByteOrder r3 = p382w0.C6775b.b.f26290c0
                if (r2 != r3) goto L24
                int r1 = r1 << 8
                int r1 = r1 + r0
                return r1
            L24:
                java.nio.ByteOrder r3 = p382w0.C6775b.b.f26291d0
                if (r2 != r3) goto L2c
                int r0 = r0 << 8
                int r0 = r0 + r1
                return r0
            L2c:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Invalid byte order: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.nio.ByteOrder r2 = r4.f26293Z
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L41:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
            L47:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }

        @Override // java.io.DataInput
        public int skipBytes(int r4) {
                r3 = this;
                int r0 = r3.f26294a0
                int r1 = r3.f26295b0
                int r0 = r0 - r1
                int r4 = java.lang.Math.min(r4, r0)
                r0 = 0
            La:
                if (r0 >= r4) goto L16
                java.io.DataInputStream r1 = r3.f26292Y
                int r2 = r4 - r0
                int r1 = r1.skipBytes(r2)
                int r0 = r0 + r1
                goto La
            L16:
                int r4 = r3.f26295b0
                int r4 = r4 + r0
                r3.f26295b0 = r4
                return r0
        }
    }

    /* renamed from: w0.b$c */
    public static class c {

        /* renamed from: a */
        public final int f26296a;

        /* renamed from: b */
        public final int f26297b;

        /* renamed from: c */
        public final byte[] f26298c;

        public c(int r1, int r2, long r3, byte[] r5) {
                r0 = this;
                r0.<init>()
                r0.f26296a = r1
                r0.f26297b = r2
                r0.f26298c = r5
                return
        }

        public c(int r1, int r2, byte[] r3) {
                r0 = this;
                r0.<init>()
                r0.f26296a = r1
                r0.f26297b = r2
                r0.f26298c = r3
                return
        }

        /* renamed from: a */
        public static p382w0.C6775b.c m13778a(java.lang.String r3) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                r3 = 0
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.nio.charset.Charset r0 = p382w0.C6775b.f26259P
                byte[] r3 = r3.getBytes(r0)
                w0.b$c r0 = new w0.b$c
                int r1 = r3.length
                r2 = 2
                r0.<init>(r2, r1, r3)
                return r0
        }

        /* renamed from: b */
        public static p382w0.C6775b.c m13779b(long r5, java.nio.ByteOrder r7) {
                r0 = 1
                long[] r1 = new long[r0]
                r2 = 0
                r1[r2] = r5
                int[] r5 = p382w0.C6775b.f26250G
                r6 = 4
                r5 = r5[r6]
                int r5 = r5 * 1
                byte[] r5 = new byte[r5]
                java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
                r5.order(r7)
            L16:
                if (r2 >= r0) goto L21
                r3 = r1[r2]
                int r7 = (int) r3
                r5.putInt(r7)
                int r2 = r2 + 1
                goto L16
            L21:
                w0.b$c r7 = new w0.b$c
                byte[] r5 = r5.array()
                r7.<init>(r6, r0, r5)
                return r7
        }

        /* renamed from: c */
        public static p382w0.C6775b.c m13780c(p382w0.C6775b.e r6, java.nio.ByteOrder r7) {
                r0 = 1
                w0.b$e[] r1 = new p382w0.C6775b.e[r0]
                r2 = 0
                r1[r2] = r6
                int[] r6 = p382w0.C6775b.f26250G
                r3 = 5
                r6 = r6[r3]
                int r6 = r6 * 1
                byte[] r6 = new byte[r6]
                java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
                r6.order(r7)
            L16:
                if (r2 >= r0) goto L29
                r7 = r1[r2]
                long r4 = r7.f26303a
                int r5 = (int) r4
                r6.putInt(r5)
                long r4 = r7.f26304b
                int r7 = (int) r4
                r6.putInt(r7)
                int r2 = r2 + 1
                goto L16
            L29:
                w0.b$c r7 = new w0.b$c
                byte[] r6 = r6.array()
                r7.<init>(r3, r0, r6)
                return r7
        }

        /* renamed from: d */
        public static p382w0.C6775b.c m13781d(int r4, java.nio.ByteOrder r5) {
                r0 = 1
                int[] r1 = new int[r0]
                r2 = 0
                r1[r2] = r4
                int[] r4 = p382w0.C6775b.f26250G
                r3 = 3
                r4 = r4[r3]
                int r4 = r4 * 1
                byte[] r4 = new byte[r4]
                java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
                r4.order(r5)
            L16:
                if (r2 >= r0) goto L21
                r5 = r1[r2]
                short r5 = (short) r5
                r4.putShort(r5)
                int r2 = r2 + 1
                goto L16
            L21:
                w0.b$c r5 = new w0.b$c
                byte[] r4 = r4.array()
                r5.<init>(r3, r0, r4)
                return r5
        }

        /* renamed from: e */
        public double m13782e(java.nio.ByteOrder r5) {
                r4 = this;
                java.lang.Object r5 = r4.m13785h(r5)
                if (r5 == 0) goto L6e
                boolean r0 = r5 instanceof java.lang.String
                if (r0 == 0) goto L11
                java.lang.String r5 = (java.lang.String) r5
                double r0 = java.lang.Double.parseDouble(r5)
                return r0
            L11:
                boolean r0 = r5 instanceof long[]
                r1 = 0
                java.lang.String r2 = "There are more than one component"
                r3 = 1
                if (r0 == 0) goto L28
                long[] r5 = (long[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L22
                r0 = r5[r1]
                double r0 = (double) r0
                return r0
            L22:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L28:
                boolean r0 = r5 instanceof int[]
                if (r0 == 0) goto L3b
                int[] r5 = (int[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L35
                r5 = r5[r1]
                double r0 = (double) r5
                return r0
            L35:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L3b:
                boolean r0 = r5 instanceof double[]
                if (r0 == 0) goto L4d
                double[] r5 = (double[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L47
                r0 = r5[r1]
                return r0
            L47:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L4d:
                boolean r0 = r5 instanceof p382w0.C6775b.e[]
                if (r0 == 0) goto L66
                w0.b$e[] r5 = (p382w0.C6775b.e[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L60
                r5 = r5[r1]
                long r0 = r5.f26303a
                double r0 = (double) r0
                long r2 = r5.f26304b
                double r2 = (double) r2
                double r0 = r0 / r2
                return r0
            L60:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L66:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "Couldn't find a double value"
                r5.<init>(r0)
                throw r5
            L6e:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "NULL can't be converted to a double value"
                r5.<init>(r0)
                throw r5
        }

        /* renamed from: f */
        public int m13783f(java.nio.ByteOrder r5) {
                r4 = this;
                java.lang.Object r5 = r4.m13785h(r5)
                if (r5 == 0) goto L42
                boolean r0 = r5 instanceof java.lang.String
                if (r0 == 0) goto L11
                java.lang.String r5 = (java.lang.String) r5
                int r5 = java.lang.Integer.parseInt(r5)
                return r5
            L11:
                boolean r0 = r5 instanceof long[]
                r1 = 0
                java.lang.String r2 = "There are more than one component"
                r3 = 1
                if (r0 == 0) goto L28
                long[] r5 = (long[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L22
                r0 = r5[r1]
                int r5 = (int) r0
                return r5
            L22:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L28:
                boolean r0 = r5 instanceof int[]
                if (r0 == 0) goto L3a
                int[] r5 = (int[]) r5
                int r0 = r5.length
                if (r0 != r3) goto L34
                r5 = r5[r1]
                return r5
            L34:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                r5.<init>(r2)
                throw r5
            L3a:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "Couldn't find a integer value"
                r5.<init>(r0)
                throw r5
            L42:
                java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
                java.lang.String r0 = "NULL can't be converted to a integer value"
                r5.<init>(r0)
                throw r5
        }

        /* renamed from: g */
        public java.lang.String m13784g(java.nio.ByteOrder r8) {
                r7 = this;
                java.lang.Object r8 = r7.m13785h(r8)
                r0 = 0
                if (r8 != 0) goto L8
                return r0
            L8:
                boolean r1 = r8 instanceof java.lang.String
                if (r1 == 0) goto Lf
                java.lang.String r8 = (java.lang.String) r8
                return r8
            Lf:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                boolean r2 = r8 instanceof long[]
                java.lang.String r3 = ","
                r4 = 0
                if (r2 == 0) goto L33
                long[] r8 = (long[]) r8
            L1d:
                int r0 = r8.length
                if (r4 >= r0) goto L2e
                r5 = r8[r4]
                r1.append(r5)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L1d
                r1.append(r3)
                goto L1d
            L2e:
                java.lang.String r8 = r1.toString()
                return r8
            L33:
                boolean r2 = r8 instanceof int[]
                if (r2 == 0) goto L4f
                int[] r8 = (int[]) r8
            L39:
                int r0 = r8.length
                if (r4 >= r0) goto L4a
                r0 = r8[r4]
                r1.append(r0)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L39
                r1.append(r3)
                goto L39
            L4a:
                java.lang.String r8 = r1.toString()
                return r8
            L4f:
                boolean r2 = r8 instanceof double[]
                if (r2 == 0) goto L6b
                double[] r8 = (double[]) r8
            L55:
                int r0 = r8.length
                if (r4 >= r0) goto L66
                r5 = r8[r4]
                r1.append(r5)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L55
                r1.append(r3)
                goto L55
            L66:
                java.lang.String r8 = r1.toString()
                return r8
            L6b:
                boolean r2 = r8 instanceof p382w0.C6775b.e[]
                if (r2 == 0) goto L95
                w0.b$e[] r8 = (p382w0.C6775b.e[]) r8
            L71:
                int r0 = r8.length
                if (r4 >= r0) goto L90
                r0 = r8[r4]
                long r5 = r0.f26303a
                r1.append(r5)
                r0 = 47
                r1.append(r0)
                r0 = r8[r4]
                long r5 = r0.f26304b
                r1.append(r5)
                int r4 = r4 + 1
                int r0 = r8.length
                if (r4 == r0) goto L71
                r1.append(r3)
                goto L71
            L90:
                java.lang.String r8 = r1.toString()
                return r8
            L95:
                return r0
        }

        /* renamed from: h */
        public java.lang.Object m13785h(java.nio.ByteOrder r11) {
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                w0.b$b r3 = new w0.b$b     // Catch: java.lang.Throwable -> L186 java.io.IOException -> L188
                byte[] r4 = r10.f26298c     // Catch: java.lang.Throwable -> L186 java.io.IOException -> L188
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L186 java.io.IOException -> L188
                r3.f26293Z = r11     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                int r11 = r10.f26296a     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L147;
                    case 2: goto Lfc;
                    case 3: goto Le2;
                    case 4: goto Lc8;
                    case 5: goto La5;
                    case 6: goto L147;
                    case 7: goto Lfc;
                    case 8: goto L8b;
                    case 9: goto L71;
                    case 10: goto L4c;
                    case 11: goto L31;
                    case 12: goto L17;
                    default: goto L15;
                }     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
            L15:
                goto L17b
            L17:
                int r11 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                double[] r11 = new double[r11]     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
            L1b:
                int r4 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                if (r5 >= r4) goto L28
                double r6 = r3.readDouble()     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r11[r5] = r6     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                int r5 = r5 + 1
                goto L1b
            L28:
                r3.close()     // Catch: java.io.IOException -> L2c
                goto L30
            L2c:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L30:
                return r11
            L31:
                int r11 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                double[] r11 = new double[r11]     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
            L35:
                int r4 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                if (r5 >= r4) goto L43
                float r4 = r3.readFloat()     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                double r6 = (double) r4     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r11[r5] = r6     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                int r5 = r5 + 1
                goto L35
            L43:
                r3.close()     // Catch: java.io.IOException -> L47
                goto L4b
            L47:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L4b:
                return r11
            L4c:
                int r11 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                w0.b$e[] r11 = new p382w0.C6775b.e[r11]     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
            L50:
                int r4 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                if (r5 >= r4) goto L68
                int r4 = r3.readInt()     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                long r6 = (long) r4     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                int r4 = r3.readInt()     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                long r8 = (long) r4     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                w0.b$e r4 = new w0.b$e     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r4.<init>(r6, r8)     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r11[r5] = r4     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                int r5 = r5 + 1
                goto L50
            L68:
                r3.close()     // Catch: java.io.IOException -> L6c
                goto L70
            L6c:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L70:
                return r11
            L71:
                int r11 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                int[] r11 = new int[r11]     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
            L75:
                int r4 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                if (r5 >= r4) goto L82
                int r4 = r3.readInt()     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r11[r5] = r4     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                int r5 = r5 + 1
                goto L75
            L82:
                r3.close()     // Catch: java.io.IOException -> L86
                goto L8a
            L86:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L8a:
                return r11
            L8b:
                int r11 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                int[] r11 = new int[r11]     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
            L8f:
                int r4 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                if (r5 >= r4) goto L9c
                short r4 = r3.readShort()     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r11[r5] = r4     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                int r5 = r5 + 1
                goto L8f
            L9c:
                r3.close()     // Catch: java.io.IOException -> La0
                goto La4
            La0:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            La4:
                return r11
            La5:
                int r11 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                w0.b$e[] r11 = new p382w0.C6775b.e[r11]     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
            La9:
                int r4 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                if (r5 >= r4) goto Lbf
                long r6 = r3.m13776a()     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                long r8 = r3.m13776a()     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                w0.b$e r4 = new w0.b$e     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r4.<init>(r6, r8)     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r11[r5] = r4     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                int r5 = r5 + 1
                goto La9
            Lbf:
                r3.close()     // Catch: java.io.IOException -> Lc3
                goto Lc7
            Lc3:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            Lc7:
                return r11
            Lc8:
                int r11 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                long[] r11 = new long[r11]     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
            Lcc:
                int r4 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                if (r5 >= r4) goto Ld9
                long r6 = r3.m13776a()     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r11[r5] = r6     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                int r5 = r5 + 1
                goto Lcc
            Ld9:
                r3.close()     // Catch: java.io.IOException -> Ldd
                goto Le1
            Ldd:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            Le1:
                return r11
            Le2:
                int r11 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                int[] r11 = new int[r11]     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
            Le6:
                int r4 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                if (r5 >= r4) goto Lf3
                int r4 = r3.readUnsignedShort()     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r11[r5] = r4     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                int r5 = r5 + 1
                goto Le6
            Lf3:
                r3.close()     // Catch: java.io.IOException -> Lf7
                goto Lfb
            Lf7:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            Lfb:
                return r11
            Lfc:
                int r11 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                byte[] r6 = p382w0.C6775b.f26251H     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                int r6 = r6.length     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                if (r11 < r6) goto L119
                r11 = 0
            L104:
                byte[] r6 = p382w0.C6775b.f26251H     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                int r7 = r6.length     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                if (r11 >= r7) goto L116
                byte[] r7 = r10.f26298c     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r7 = r7[r11]     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r8 = r6[r11]     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                if (r7 == r8) goto L113
                r4 = 0
                goto L116
            L113:
                int r11 = r11 + 1
                goto L104
            L116:
                if (r4 == 0) goto L119
                int r5 = r6.length     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
            L119:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r11.<init>()     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
            L11e:
                int r4 = r10.f26297b     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                if (r5 >= r4) goto L13a
                byte[] r4 = r10.f26298c     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r4 = r4[r5]     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                if (r4 != 0) goto L129
                goto L13a
            L129:
                r6 = 32
                if (r4 < r6) goto L132
                char r4 = (char) r4     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r11.append(r4)     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                goto L137
            L132:
                r4 = 63
                r11.append(r4)     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
            L137:
                int r5 = r5 + 1
                goto L11e
            L13a:
                java.lang.String r11 = r11.toString()     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r3.close()     // Catch: java.io.IOException -> L142
                goto L146
            L142:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L146:
                return r11
            L147:
                byte[] r11 = r10.f26298c     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                int r6 = r11.length     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                if (r6 != r4) goto L16b
                r6 = r11[r5]     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                if (r6 < 0) goto L16b
                r6 = r11[r5]     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                if (r6 > r4) goto L16b
                java.lang.String r6 = new java.lang.String     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                char[] r4 = new char[r4]     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r11 = r11[r5]     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                int r11 = r11 + 48
                char r11 = (char) r11     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r4[r5] = r11     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r6.<init>(r4)     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r3.close()     // Catch: java.io.IOException -> L166
                goto L16a
            L166:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L16a:
                return r6
            L16b:
                java.lang.String r4 = new java.lang.String     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                java.nio.charset.Charset r5 = p382w0.C6775b.f26259P     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r4.<init>(r11, r5)     // Catch: java.io.IOException -> L184 java.lang.Throwable -> L19a
                r3.close()     // Catch: java.io.IOException -> L176
                goto L17a
            L176:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L17a:
                return r4
            L17b:
                r3.close()     // Catch: java.io.IOException -> L17f
                goto L183
            L17f:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L183:
                return r2
            L184:
                r11 = move-exception
                goto L18a
            L186:
                r11 = move-exception
                goto L19c
            L188:
                r11 = move-exception
                r3 = r2
            L18a:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch: java.lang.Throwable -> L19a
                if (r3 == 0) goto L199
                r3.close()     // Catch: java.io.IOException -> L195
                goto L199
            L195:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L199:
                return r2
            L19a:
                r11 = move-exception
                r2 = r3
            L19c:
                if (r2 == 0) goto L1a6
                r2.close()     // Catch: java.io.IOException -> L1a2
                goto L1a6
            L1a2:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L1a6:
                throw r11
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "("
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String[] r1 = p382w0.C6775b.f26249F
                int r2 = r3.f26296a
                r1 = r1[r2]
                r0.append(r1)
                java.lang.String r1 = ", data length:"
                r0.append(r1)
                byte[] r1 = r3.f26298c
                int r1 = r1.length
                java.lang.String r2 = ")"
                java.lang.String r0 = p381w.C6764e.m13690a(r0, r1, r2)
                return r0
        }
    }

    /* renamed from: w0.b$d */
    public static class d {

        /* renamed from: a */
        public final int f26299a;

        /* renamed from: b */
        public final java.lang.String f26300b;

        /* renamed from: c */
        public final int f26301c;

        /* renamed from: d */
        public final int f26302d;

        public d(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f26300b = r1
                r0.f26299a = r2
                r0.f26301c = r3
                r1 = -1
                r0.f26302d = r1
                return
        }

        public d(java.lang.String r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.f26300b = r1
                r0.f26299a = r2
                r0.f26301c = r3
                r0.f26302d = r4
                return
        }
    }

    /* renamed from: w0.b$e */
    public static class e {

        /* renamed from: a */
        public final long f26303a;

        /* renamed from: b */
        public final long f26304b;

        public e(long r4, long r6) {
                r3 = this;
                r3.<init>()
                r0 = 0
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 != 0) goto L10
                r3.f26303a = r0
                r4 = 1
                r3.f26304b = r4
                return
            L10:
                r3.f26303a = r4
                r3.f26304b = r6
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long r1 = r3.f26303a
                r0.append(r1)
                java.lang.String r1 = "/"
                r0.append(r1)
                long r1 = r3.f26304b
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "ExifInterface"
            boolean r2 = android.util.Log.isLoggable(r2, r0)
            p382w0.C6775b.f26262n = r2
            r2 = 4
            java.lang.Integer[] r3 = new java.lang.Integer[r2]
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 0
            r3[r6] = r5
            r7 = 6
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r3[r4] = r8
            r8 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r3[r8] = r1
            r10 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r3[r0] = r11
            java.util.List r3 = java.util.Arrays.asList(r3)
            p382w0.C6775b.f26263o = r3
            java.lang.Integer[] r3 = new java.lang.Integer[r2]
            r3[r6] = r9
            r12 = 7
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r3[r4] = r13
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            r3[r8] = r14
            r14 = 5
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r3[r0] = r15
            java.util.List r3 = java.util.Arrays.asList(r3)
            p382w0.C6775b.f26264p = r3
            int[] r3 = new int[r0]
            r3 = {x0c6c: FILL_ARRAY_DATA , data: [8, 8, 8} // fill-array
            p382w0.C6775b.f26265q = r3
            int[] r3 = new int[r4]
            r3[r6] = r10
            p382w0.C6775b.f26266r = r3
            byte[] r3 = new byte[r0]
            r3 = {x0c76: FILL_ARRAY_DATA , data: [-1, -40, -1} // fill-array
            p382w0.C6775b.f26267s = r3
            byte[] r3 = new byte[r2]
            r3 = {x0c7c: FILL_ARRAY_DATA , data: [102, 116, 121, 112} // fill-array
            p382w0.C6775b.f26268t = r3
            byte[] r3 = new byte[r2]
            r3 = {x0c82: FILL_ARRAY_DATA , data: [109, 105, 102, 49} // fill-array
            p382w0.C6775b.f26269u = r3
            byte[] r3 = new byte[r2]
            r3 = {x0c88: FILL_ARRAY_DATA , data: [104, 101, 105, 99} // fill-array
            p382w0.C6775b.f26270v = r3
            byte[] r3 = new byte[r7]
            r3 = {x0c8e: FILL_ARRAY_DATA , data: [79, 76, 89, 77, 80, 0} // fill-array
            p382w0.C6775b.f26271w = r3
            r3 = 10
            byte[] r12 = new byte[r3]
            r12 = {x0c96: FILL_ARRAY_DATA , data: [79, 76, 89, 77, 80, 85, 83, 0, 73, 73} // fill-array
            p382w0.C6775b.f26272x = r12
            byte[] r12 = new byte[r10]
            r12 = {x0ca0: FILL_ARRAY_DATA , data: [-119, 80, 78, 71, 13, 10, 26, 10} // fill-array
            p382w0.C6775b.f26273y = r12
            byte[] r12 = new byte[r2]
            r12 = {x0ca8: FILL_ARRAY_DATA , data: [101, 88, 73, 102} // fill-array
            p382w0.C6775b.f26274z = r12
            byte[] r12 = new byte[r2]
            r12 = {x0cae: FILL_ARRAY_DATA , data: [73, 72, 68, 82} // fill-array
            p382w0.C6775b.f26244A = r12
            byte[] r12 = new byte[r2]
            r12 = {x0cb4: FILL_ARRAY_DATA , data: [73, 69, 78, 68} // fill-array
            p382w0.C6775b.f26245B = r12
            byte[] r12 = new byte[r2]
            r12 = {x0cba: FILL_ARRAY_DATA , data: [82, 73, 70, 70} // fill-array
            p382w0.C6775b.f26246C = r12
            byte[] r12 = new byte[r2]
            r12 = {x0cc0: FILL_ARRAY_DATA , data: [87, 69, 66, 80} // fill-array
            p382w0.C6775b.f26247D = r12
            byte[] r12 = new byte[r2]
            r12 = {x0cc6: FILL_ARRAY_DATA , data: [69, 88, 73, 70} // fill-array
            p382w0.C6775b.f26248E = r12
            java.nio.charset.Charset r12 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r3 = "VP8X"
            r3.getBytes(r12)
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r12 = "VP8L"
            r12.getBytes(r3)
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r12 = "VP8 "
            r12.getBytes(r3)
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r12 = "ANIM"
            r12.getBytes(r3)
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r12 = "ANMF"
            r12.getBytes(r3)
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r12 = "XMP "
            r12.getBytes(r3)
            java.lang.String r16 = ""
            java.lang.String r17 = "BYTE"
            java.lang.String r18 = "STRING"
            java.lang.String r19 = "USHORT"
            java.lang.String r20 = "ULONG"
            java.lang.String r21 = "URATIONAL"
            java.lang.String r22 = "SBYTE"
            java.lang.String r23 = "UNDEFINED"
            java.lang.String r24 = "SSHORT"
            java.lang.String r25 = "SLONG"
            java.lang.String r26 = "SRATIONAL"
            java.lang.String r27 = "SINGLE"
            java.lang.String r28 = "DOUBLE"
            java.lang.String r29 = "IFD"
            java.lang.String[] r3 = new java.lang.String[]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}
            p382w0.C6775b.f26249F = r3
            r3 = 14
            int[] r12 = new int[r3]
            r12 = {x0ccc: FILL_ARRAY_DATA , data: [0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1} // fill-array
            p382w0.C6775b.f26250G = r12
            byte[] r12 = new byte[r10]
            r12 = {x0cec: FILL_ARRAY_DATA , data: [65, 83, 67, 73, 73, 0, 0, 0} // fill-array
            p382w0.C6775b.f26251H = r12
            r12 = 42
            w0.b$d[] r12 = new p382w0.C6775b.d[r12]
            w0.b$d r3 = new w0.b$d
            java.lang.String r10 = "NewSubfileType"
            r7 = 254(0xfe, float:3.56E-43)
            r3.<init>(r10, r7, r2)
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "SubfileType"
            r10 = 255(0xff, float:3.57E-43)
            r3.<init>(r7, r10, r2)
            r12[r4] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "ImageWidth"
            r10 = 256(0x100, float:3.59E-43)
            r3.<init>(r7, r10, r0, r2)
            r12[r8] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "ImageLength"
            r10 = 257(0x101, float:3.6E-43)
            r3.<init>(r7, r10, r0, r2)
            r12[r0] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "BitsPerSample"
            r10 = 258(0x102, float:3.62E-43)
            r3.<init>(r7, r10, r0)
            r12[r2] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "Compression"
            r10 = 259(0x103, float:3.63E-43)
            r3.<init>(r7, r10, r0)
            r12[r14] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "PhotometricInterpretation"
            r10 = 262(0x106, float:3.67E-43)
            r3.<init>(r7, r10, r0)
            r7 = 6
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "ImageDescription"
            r10 = 270(0x10e, float:3.78E-43)
            r3.<init>(r7, r10, r8)
            r7 = 7
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "Make"
            r10 = 271(0x10f, float:3.8E-43)
            r3.<init>(r7, r10, r8)
            r7 = 8
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "Model"
            r10 = 272(0x110, float:3.81E-43)
            r3.<init>(r7, r10, r8)
            r7 = 9
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r10 = "StripOffsets"
            r7 = 273(0x111, float:3.83E-43)
            r3.<init>(r10, r7, r0, r2)
            r7 = 10
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "Orientation"
            r10 = 274(0x112, float:3.84E-43)
            r3.<init>(r7, r10, r0)
            r7 = 11
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "SamplesPerPixel"
            r10 = 277(0x115, float:3.88E-43)
            r3.<init>(r7, r10, r0)
            r7 = 12
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "RowsPerStrip"
            r10 = 278(0x116, float:3.9E-43)
            r3.<init>(r7, r10, r0, r2)
            r7 = 13
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "StripByteCounts"
            r10 = 279(0x117, float:3.91E-43)
            r3.<init>(r7, r10, r0, r2)
            r7 = 14
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "XResolution"
            r10 = 282(0x11a, float:3.95E-43)
            r3.<init>(r7, r10, r14)
            r7 = 15
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "YResolution"
            r10 = 283(0x11b, float:3.97E-43)
            r3.<init>(r7, r10, r14)
            r7 = 16
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "PlanarConfiguration"
            r10 = 284(0x11c, float:3.98E-43)
            r3.<init>(r7, r10, r0)
            r7 = 17
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "ResolutionUnit"
            r10 = 296(0x128, float:4.15E-43)
            r3.<init>(r7, r10, r0)
            r7 = 18
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "TransferFunction"
            r10 = 301(0x12d, float:4.22E-43)
            r3.<init>(r7, r10, r0)
            r7 = 19
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "Software"
            r10 = 305(0x131, float:4.27E-43)
            r3.<init>(r7, r10, r8)
            r7 = 20
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r7 = "DateTime"
            r10 = 306(0x132, float:4.29E-43)
            r3.<init>(r7, r10, r8)
            r7 = 21
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r10 = "Artist"
            r7 = 315(0x13b, float:4.41E-43)
            r3.<init>(r10, r7, r8)
            r7 = 22
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r10 = "WhitePoint"
            r7 = 318(0x13e, float:4.46E-43)
            r3.<init>(r10, r7, r14)
            r7 = 23
            r12[r7] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r10 = "PrimaryChromaticities"
            r6 = 319(0x13f, float:4.47E-43)
            r3.<init>(r10, r6, r14)
            r6 = 24
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r10 = "SubIFDPointer"
            r6 = 330(0x14a, float:4.62E-43)
            r3.<init>(r10, r6, r2)
            r6 = 25
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r10 = "JPEGInterchangeFormat"
            r6 = 513(0x201, float:7.19E-43)
            r3.<init>(r10, r6, r2)
            r6 = 26
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r10 = "JPEGInterchangeFormatLength"
            r6 = 514(0x202, float:7.2E-43)
            r3.<init>(r10, r6, r2)
            r6 = 27
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r10 = "YCbCrCoefficients"
            r6 = 529(0x211, float:7.41E-43)
            r3.<init>(r10, r6, r14)
            r6 = 28
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r10 = "YCbCrSubSampling"
            r6 = 530(0x212, float:7.43E-43)
            r3.<init>(r10, r6, r0)
            r6 = 29
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r10 = "YCbCrPositioning"
            r6 = 531(0x213, float:7.44E-43)
            r3.<init>(r10, r6, r0)
            r6 = 30
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r10 = "ReferenceBlackWhite"
            r6 = 532(0x214, float:7.45E-43)
            r3.<init>(r10, r6, r14)
            r6 = 31
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r10 = "Copyright"
            r6 = 33432(0x8298, float:4.6848E-41)
            r3.<init>(r10, r6, r8)
            r6 = 32
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r6 = "ExifIFDPointer"
            r10 = 34665(0x8769, float:4.8576E-41)
            r3.<init>(r6, r10, r2)
            r6 = 33
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r6 = "GPSInfoIFDPointer"
            r10 = 34853(0x8825, float:4.884E-41)
            r3.<init>(r6, r10, r2)
            r6 = 34
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r6 = "SensorTopBorder"
            r3.<init>(r6, r2, r2)
            r6 = 35
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r6 = "SensorLeftBorder"
            r3.<init>(r6, r14, r2)
            r6 = 36
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r6 = "SensorBottomBorder"
            r10 = 6
            r3.<init>(r6, r10, r2)
            r6 = 37
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r6 = "SensorRightBorder"
            r10 = 7
            r3.<init>(r6, r10, r2)
            r6 = 38
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r6 = "ISO"
            r3.<init>(r6, r7, r0)
            r6 = 39
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r6 = "JpgFromRaw"
            r7 = 46
            r3.<init>(r6, r7, r10)
            r6 = 40
            r12[r6] = r3
            w0.b$d r3 = new w0.b$d
            java.lang.String r6 = "Xmp"
            r7 = 700(0x2bc, float:9.81E-43)
            r3.<init>(r6, r7, r4)
            r6 = 41
            r12[r6] = r3
            r3 = 74
            w0.b$d[] r3 = new p382w0.C6775b.d[r3]
            w0.b$d r6 = new w0.b$d
            java.lang.String r7 = "ExposureTime"
            r10 = 33434(0x829a, float:4.6851E-41)
            r6.<init>(r7, r10, r14)
            r7 = 0
            r3[r7] = r6
            w0.b$d r6 = new w0.b$d
            java.lang.String r7 = "FNumber"
            r10 = 33437(0x829d, float:4.6855E-41)
            r6.<init>(r7, r10, r14)
            r3[r4] = r6
            w0.b$d r6 = new w0.b$d
            java.lang.String r7 = "ExposureProgram"
            r10 = 34850(0x8822, float:4.8835E-41)
            r6.<init>(r7, r10, r0)
            r3[r8] = r6
            w0.b$d r6 = new w0.b$d
            java.lang.String r7 = "SpectralSensitivity"
            r10 = 34852(0x8824, float:4.8838E-41)
            r6.<init>(r7, r10, r8)
            r3[r0] = r6
            w0.b$d r6 = new w0.b$d
            java.lang.String r7 = "PhotographicSensitivity"
            r10 = 34855(0x8827, float:4.8842E-41)
            r6.<init>(r7, r10, r0)
            r3[r2] = r6
            w0.b$d r6 = new w0.b$d
            java.lang.String r7 = "OECF"
            r10 = 34856(0x8828, float:4.8844E-41)
            r4 = 7
            r6.<init>(r7, r10, r4)
            r3[r14] = r6
            w0.b$d r6 = new w0.b$d
            java.lang.String r7 = "SensitivityType"
            r10 = 34864(0x8830, float:4.8855E-41)
            r6.<init>(r7, r10, r0)
            r7 = 6
            r3[r7] = r6
            w0.b$d r6 = new w0.b$d
            java.lang.String r7 = "StandardOutputSensitivity"
            r10 = 34865(0x8831, float:4.8856E-41)
            r6.<init>(r7, r10, r2)
            r3[r4] = r6
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "RecommendedExposureIndex"
            r7 = 34866(0x8832, float:4.8858E-41)
            r4.<init>(r6, r7, r2)
            r6 = 8
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "ISOSpeed"
            r7 = 34867(0x8833, float:4.8859E-41)
            r4.<init>(r6, r7, r2)
            r6 = 9
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "ISOSpeedLatitudeyyy"
            r7 = 34868(0x8834, float:4.886E-41)
            r4.<init>(r6, r7, r2)
            r6 = 10
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "ISOSpeedLatitudezzz"
            r7 = 34869(0x8835, float:4.8862E-41)
            r4.<init>(r6, r7, r2)
            r6 = 11
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "ExifVersion"
            r7 = 36864(0x9000, float:5.1657E-41)
            r4.<init>(r6, r7, r8)
            r6 = 12
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "DateTimeOriginal"
            r7 = 36867(0x9003, float:5.1662E-41)
            r4.<init>(r6, r7, r8)
            r6 = 13
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "DateTimeDigitized"
            r7 = 36868(0x9004, float:5.1663E-41)
            r4.<init>(r6, r7, r8)
            r6 = 14
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "OffsetTime"
            r7 = 36880(0x9010, float:5.168E-41)
            r4.<init>(r6, r7, r8)
            r6 = 15
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "OffsetTimeOriginal"
            r7 = 36881(0x9011, float:5.1681E-41)
            r4.<init>(r6, r7, r8)
            r6 = 16
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "OffsetTimeDigitized"
            r7 = 36882(0x9012, float:5.1683E-41)
            r4.<init>(r6, r7, r8)
            r6 = 17
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "ComponentsConfiguration"
            r7 = 37121(0x9101, float:5.2018E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 18
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "CompressedBitsPerPixel"
            r7 = 37122(0x9102, float:5.2019E-41)
            r4.<init>(r6, r7, r14)
            r6 = 19
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "ShutterSpeedValue"
            r7 = 37377(0x9201, float:5.2376E-41)
            r10 = 10
            r4.<init>(r6, r7, r10)
            r6 = 20
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "ApertureValue"
            r7 = 37378(0x9202, float:5.2378E-41)
            r4.<init>(r6, r7, r14)
            r6 = 21
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "BrightnessValue"
            r7 = 37379(0x9203, float:5.2379E-41)
            r4.<init>(r6, r7, r10)
            r6 = 22
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "ExposureBiasValue"
            r7 = 37380(0x9204, float:5.238E-41)
            r4.<init>(r6, r7, r10)
            r6 = 23
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "MaxApertureValue"
            r7 = 37381(0x9205, float:5.2382E-41)
            r4.<init>(r6, r7, r14)
            r6 = 24
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "SubjectDistance"
            r7 = 37382(0x9206, float:5.2383E-41)
            r4.<init>(r6, r7, r14)
            r6 = 25
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "MeteringMode"
            r7 = 37383(0x9207, float:5.2385E-41)
            r4.<init>(r6, r7, r0)
            r6 = 26
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "LightSource"
            r7 = 37384(0x9208, float:5.2386E-41)
            r4.<init>(r6, r7, r0)
            r6 = 27
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "Flash"
            r7 = 37385(0x9209, float:5.2388E-41)
            r4.<init>(r6, r7, r0)
            r6 = 28
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "FocalLength"
            r7 = 37386(0x920a, float:5.2389E-41)
            r4.<init>(r6, r7, r14)
            r6 = 29
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "SubjectArea"
            r7 = 37396(0x9214, float:5.2403E-41)
            r4.<init>(r6, r7, r0)
            r6 = 30
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "MakerNote"
            r7 = 37500(0x927c, float:5.2549E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 31
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "UserComment"
            r7 = 37510(0x9286, float:5.2563E-41)
            r4.<init>(r6, r7, r10)
            r6 = 32
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "SubSecTime"
            r7 = 37520(0x9290, float:5.2577E-41)
            r4.<init>(r6, r7, r8)
            r6 = 33
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "SubSecTimeOriginal"
            r7 = 37521(0x9291, float:5.2578E-41)
            r4.<init>(r6, r7, r8)
            r6 = 34
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "SubSecTimeDigitized"
            r7 = 37522(0x9292, float:5.258E-41)
            r4.<init>(r6, r7, r8)
            r6 = 35
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "FlashpixVersion"
            r7 = 40960(0xa000, float:5.7397E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 36
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "ColorSpace"
            r7 = 40961(0xa001, float:5.7399E-41)
            r4.<init>(r6, r7, r0)
            r6 = 37
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "PixelXDimension"
            r7 = 40962(0xa002, float:5.74E-41)
            r4.<init>(r6, r7, r0, r2)
            r6 = 38
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "PixelYDimension"
            r7 = 40963(0xa003, float:5.7401E-41)
            r4.<init>(r6, r7, r0, r2)
            r6 = 39
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "RelatedSoundFile"
            r7 = 40964(0xa004, float:5.7403E-41)
            r4.<init>(r6, r7, r8)
            r6 = 40
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "InteroperabilityIFDPointer"
            r7 = 40965(0xa005, float:5.7404E-41)
            r4.<init>(r6, r7, r2)
            r6 = 41
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "FlashEnergy"
            r7 = 41483(0xa20b, float:5.813E-41)
            r4.<init>(r6, r7, r14)
            r6 = 42
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "SpatialFrequencyResponse"
            r7 = 41484(0xa20c, float:5.8131E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 43
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "FocalPlaneXResolution"
            r7 = 41486(0xa20e, float:5.8134E-41)
            r4.<init>(r6, r7, r14)
            r6 = 44
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "FocalPlaneYResolution"
            r7 = 41487(0xa20f, float:5.8136E-41)
            r4.<init>(r6, r7, r14)
            r6 = 45
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "FocalPlaneResolutionUnit"
            r7 = 41488(0xa210, float:5.8137E-41)
            r4.<init>(r6, r7, r0)
            r6 = 46
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "SubjectLocation"
            r7 = 41492(0xa214, float:5.8143E-41)
            r4.<init>(r6, r7, r0)
            r6 = 47
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "ExposureIndex"
            r7 = 41493(0xa215, float:5.8144E-41)
            r4.<init>(r6, r7, r14)
            r6 = 48
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "SensingMethod"
            r7 = 41495(0xa217, float:5.8147E-41)
            r4.<init>(r6, r7, r0)
            r6 = 49
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "FileSource"
            r7 = 41728(0xa300, float:5.8473E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 50
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "SceneType"
            r7 = 41729(0xa301, float:5.8475E-41)
            r4.<init>(r6, r7, r10)
            r6 = 51
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "CFAPattern"
            r7 = 41730(0xa302, float:5.8476E-41)
            r4.<init>(r6, r7, r10)
            r6 = 52
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "CustomRendered"
            r7 = 41985(0xa401, float:5.8834E-41)
            r4.<init>(r6, r7, r0)
            r6 = 53
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "ExposureMode"
            r7 = 41986(0xa402, float:5.8835E-41)
            r4.<init>(r6, r7, r0)
            r6 = 54
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "WhiteBalance"
            r7 = 41987(0xa403, float:5.8836E-41)
            r4.<init>(r6, r7, r0)
            r6 = 55
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "DigitalZoomRatio"
            r7 = 41988(0xa404, float:5.8838E-41)
            r4.<init>(r6, r7, r14)
            r6 = 56
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "FocalLengthIn35mmFilm"
            r7 = 41989(0xa405, float:5.8839E-41)
            r4.<init>(r6, r7, r0)
            r6 = 57
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "SceneCaptureType"
            r7 = 41990(0xa406, float:5.884E-41)
            r4.<init>(r6, r7, r0)
            r6 = 58
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "GainControl"
            r7 = 41991(0xa407, float:5.8842E-41)
            r4.<init>(r6, r7, r0)
            r6 = 59
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "Contrast"
            r7 = 41992(0xa408, float:5.8843E-41)
            r4.<init>(r6, r7, r0)
            r6 = 60
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "Saturation"
            r7 = 41993(0xa409, float:5.8845E-41)
            r4.<init>(r6, r7, r0)
            r6 = 61
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "Sharpness"
            r7 = 41994(0xa40a, float:5.8846E-41)
            r4.<init>(r6, r7, r0)
            r6 = 62
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "DeviceSettingDescription"
            r7 = 41995(0xa40b, float:5.8848E-41)
            r10 = 7
            r4.<init>(r6, r7, r10)
            r6 = 63
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "SubjectDistanceRange"
            r7 = 41996(0xa40c, float:5.8849E-41)
            r4.<init>(r6, r7, r0)
            r6 = 64
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "ImageUniqueID"
            r7 = 42016(0xa420, float:5.8877E-41)
            r4.<init>(r6, r7, r8)
            r6 = 65
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "CameraOwnerName"
            r7 = 42032(0xa430, float:5.89E-41)
            r4.<init>(r6, r7, r8)
            r6 = 66
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "BodySerialNumber"
            r7 = 42033(0xa431, float:5.8901E-41)
            r4.<init>(r6, r7, r8)
            r6 = 67
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "LensSpecification"
            r7 = 42034(0xa432, float:5.8902E-41)
            r4.<init>(r6, r7, r14)
            r6 = 68
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "LensMake"
            r7 = 42035(0xa433, float:5.8904E-41)
            r4.<init>(r6, r7, r8)
            r6 = 69
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "LensModel"
            r7 = 42036(0xa434, float:5.8905E-41)
            r4.<init>(r6, r7, r8)
            r6 = 70
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "Gamma"
            r7 = 42240(0xa500, float:5.9191E-41)
            r4.<init>(r6, r7, r14)
            r6 = 71
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "DNGVersion"
            r7 = 50706(0xc612, float:7.1054E-41)
            r10 = 1
            r4.<init>(r6, r7, r10)
            r6 = 72
            r3[r6] = r4
            w0.b$d r4 = new w0.b$d
            java.lang.String r6 = "DefaultCropSize"
            r7 = 50720(0xc620, float:7.1074E-41)
            r4.<init>(r6, r7, r0, r2)
            r6 = 73
            r3[r6] = r4
            r4 = 32
            w0.b$d[] r4 = new p382w0.C6775b.d[r4]
            w0.b$d r6 = new w0.b$d
            java.lang.String r7 = "GPSVersionID"
            r2 = 1
            r10 = 0
            r6.<init>(r7, r10, r2)
            r4[r10] = r6
            w0.b$d r6 = new w0.b$d
            java.lang.String r7 = "GPSLatitudeRef"
            r6.<init>(r7, r2, r8)
            r4[r2] = r6
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSLatitude"
            r2.<init>(r6, r8, r14)
            r4[r8] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSLongitudeRef"
            r2.<init>(r6, r0, r8)
            r4[r0] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSLongitude"
            r7 = 4
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSAltitudeRef"
            r7 = 1
            r2.<init>(r6, r14, r7)
            r4[r14] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSAltitude"
            r7 = 6
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSTimeStamp"
            r7 = 7
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSSatellites"
            r7 = 8
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSStatus"
            r7 = 9
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSMeasureMode"
            r7 = 10
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSDOP"
            r7 = 11
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSSpeedRef"
            r7 = 12
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSSpeed"
            r7 = 13
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSTrackRef"
            r7 = 14
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSTrack"
            r7 = 15
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSImgDirectionRef"
            r7 = 16
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSImgDirection"
            r7 = 17
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSMapDatum"
            r7 = 18
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSDestLatitudeRef"
            r7 = 19
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSDestLatitude"
            r7 = 20
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSDestLongitudeRef"
            r7 = 21
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSDestLongitude"
            r7 = 22
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSDestBearingRef"
            r7 = 23
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSDestBearing"
            r7 = 24
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSDestDistanceRef"
            r7 = 25
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSDestDistance"
            r7 = 26
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSProcessingMethod"
            r7 = 27
            r10 = 7
            r2.<init>(r6, r7, r10)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSAreaInformation"
            r7 = 28
            r2.<init>(r6, r7, r10)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSDateStamp"
            r7 = 29
            r2.<init>(r6, r7, r8)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSDifferential"
            r7 = 30
            r2.<init>(r6, r7, r0)
            r4[r7] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r6 = "GPSHPositioningError"
            r7 = 31
            r2.<init>(r6, r7, r14)
            r4[r7] = r2
            r2 = 1
            w0.b$d[] r6 = new p382w0.C6775b.d[r2]
            w0.b$d r7 = new w0.b$d
            java.lang.String r10 = "InteroperabilityIndex"
            r7.<init>(r10, r2, r8)
            r2 = 0
            r6[r2] = r7
            r7 = 37
            w0.b$d[] r7 = new p382w0.C6775b.d[r7]
            w0.b$d r10 = new w0.b$d
            java.lang.String r14 = "NewSubfileType"
            r8 = 254(0xfe, float:3.56E-43)
            r0 = 4
            r10.<init>(r14, r8, r0)
            r7[r2] = r10
            w0.b$d r2 = new w0.b$d
            java.lang.String r8 = "SubfileType"
            r10 = 255(0xff, float:3.57E-43)
            r2.<init>(r8, r10, r0)
            r8 = 1
            r7[r8] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r8 = "ThumbnailImageWidth"
            r10 = 256(0x100, float:3.59E-43)
            r14 = 3
            r2.<init>(r8, r10, r14, r0)
            r8 = 2
            r7[r8] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r8 = "ThumbnailImageLength"
            r10 = 257(0x101, float:3.6E-43)
            r2.<init>(r8, r10, r14, r0)
            r7[r14] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r8 = "BitsPerSample"
            r10 = 258(0x102, float:3.62E-43)
            r2.<init>(r8, r10, r14)
            r7[r0] = r2
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "Compression"
            r8 = 259(0x103, float:3.63E-43)
            r0.<init>(r2, r8, r14)
            r2 = 5
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "PhotometricInterpretation"
            r8 = 262(0x106, float:3.67E-43)
            r0.<init>(r2, r8, r14)
            r2 = 6
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "ImageDescription"
            r8 = 270(0x10e, float:3.78E-43)
            r10 = 2
            r0.<init>(r2, r8, r10)
            r2 = 7
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "Make"
            r8 = 271(0x10f, float:3.8E-43)
            r0.<init>(r2, r8, r10)
            r2 = 8
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "Model"
            r8 = 272(0x110, float:3.81E-43)
            r0.<init>(r2, r8, r10)
            r2 = 9
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "StripOffsets"
            r8 = 273(0x111, float:3.83E-43)
            r10 = 3
            r14 = 4
            r0.<init>(r2, r8, r10, r14)
            r2 = 10
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "ThumbnailOrientation"
            r8 = 274(0x112, float:3.84E-43)
            r0.<init>(r2, r8, r10)
            r2 = 11
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "SamplesPerPixel"
            r8 = 277(0x115, float:3.88E-43)
            r0.<init>(r2, r8, r10)
            r2 = 12
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "RowsPerStrip"
            r8 = 278(0x116, float:3.9E-43)
            r14 = 4
            r0.<init>(r2, r8, r10, r14)
            r2 = 13
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "StripByteCounts"
            r8 = 279(0x117, float:3.91E-43)
            r0.<init>(r2, r8, r10, r14)
            r2 = 14
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "XResolution"
            r8 = 282(0x11a, float:3.95E-43)
            r10 = 5
            r0.<init>(r2, r8, r10)
            r2 = 15
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "YResolution"
            r8 = 283(0x11b, float:3.97E-43)
            r0.<init>(r2, r8, r10)
            r2 = 16
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "PlanarConfiguration"
            r8 = 284(0x11c, float:3.98E-43)
            r10 = 3
            r0.<init>(r2, r8, r10)
            r2 = 17
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "ResolutionUnit"
            r8 = 296(0x128, float:4.15E-43)
            r0.<init>(r2, r8, r10)
            r2 = 18
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "TransferFunction"
            r8 = 301(0x12d, float:4.22E-43)
            r0.<init>(r2, r8, r10)
            r2 = 19
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "Software"
            r8 = 305(0x131, float:4.27E-43)
            r10 = 2
            r0.<init>(r2, r8, r10)
            r2 = 20
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "DateTime"
            r8 = 306(0x132, float:4.29E-43)
            r0.<init>(r2, r8, r10)
            r2 = 21
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "Artist"
            r8 = 315(0x13b, float:4.41E-43)
            r0.<init>(r2, r8, r10)
            r2 = 22
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "WhitePoint"
            r8 = 318(0x13e, float:4.46E-43)
            r10 = 5
            r0.<init>(r2, r8, r10)
            r2 = 23
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "PrimaryChromaticities"
            r8 = 319(0x13f, float:4.47E-43)
            r0.<init>(r2, r8, r10)
            r2 = 24
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "SubIFDPointer"
            r8 = 330(0x14a, float:4.62E-43)
            r10 = 4
            r0.<init>(r2, r8, r10)
            r2 = 25
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "JPEGInterchangeFormat"
            r8 = 513(0x201, float:7.19E-43)
            r0.<init>(r2, r8, r10)
            r2 = 26
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r8 = 514(0x202, float:7.2E-43)
            r0.<init>(r2, r8, r10)
            r2 = 27
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "YCbCrCoefficients"
            r8 = 529(0x211, float:7.41E-43)
            r10 = 5
            r0.<init>(r2, r8, r10)
            r2 = 28
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "YCbCrSubSampling"
            r8 = 530(0x212, float:7.43E-43)
            r10 = 3
            r0.<init>(r2, r8, r10)
            r2 = 29
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "YCbCrPositioning"
            r8 = 531(0x213, float:7.44E-43)
            r0.<init>(r2, r8, r10)
            r2 = 30
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "ReferenceBlackWhite"
            r8 = 532(0x214, float:7.45E-43)
            r10 = 5
            r0.<init>(r2, r8, r10)
            r2 = 31
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "Copyright"
            r8 = 33432(0x8298, float:4.6848E-41)
            r10 = 2
            r0.<init>(r2, r8, r10)
            r2 = 32
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "ExifIFDPointer"
            r8 = 34665(0x8769, float:4.8576E-41)
            r10 = 4
            r0.<init>(r2, r8, r10)
            r2 = 33
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "GPSInfoIFDPointer"
            r8 = 34853(0x8825, float:4.884E-41)
            r0.<init>(r2, r8, r10)
            r2 = 34
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "DNGVersion"
            r8 = 50706(0xc612, float:7.1054E-41)
            r10 = 1
            r0.<init>(r2, r8, r10)
            r2 = 35
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "DefaultCropSize"
            r8 = 50720(0xc620, float:7.1074E-41)
            r10 = 3
            r14 = 4
            r0.<init>(r2, r8, r10, r14)
            r2 = 36
            r7[r2] = r0
            w0.b$d r0 = new w0.b$d
            java.lang.String r2 = "StripOffsets"
            r8 = 273(0x111, float:3.83E-43)
            r0.<init>(r2, r8, r10)
            p382w0.C6775b.f26252I = r0
            w0.b$d[] r0 = new p382w0.C6775b.d[r10]
            w0.b$d r2 = new w0.b$d
            java.lang.String r8 = "ThumbnailImage"
            r10 = 256(0x100, float:3.59E-43)
            r14 = 7
            r2.<init>(r8, r10, r14)
            r8 = 0
            r0[r8] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r8 = "CameraSettingsIFDPointer"
            r10 = 8224(0x2020, float:1.1524E-41)
            r14 = 4
            r2.<init>(r8, r10, r14)
            r8 = 1
            r0[r8] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r8 = "ImageProcessingIFDPointer"
            r10 = 8256(0x2040, float:1.1569E-41)
            r2.<init>(r8, r10, r14)
            r8 = 2
            r0[r8] = r2
            w0.b$d[] r2 = new p382w0.C6775b.d[r8]
            w0.b$d r8 = new w0.b$d
            java.lang.String r10 = "PreviewImageStart"
            r16 = r11
            r11 = 257(0x101, float:3.6E-43)
            r8.<init>(r10, r11, r14)
            r10 = 0
            r2[r10] = r8
            w0.b$d r8 = new w0.b$d
            java.lang.String r11 = "PreviewImageLength"
            r10 = 258(0x102, float:3.62E-43)
            r8.<init>(r11, r10, r14)
            r10 = 1
            r2[r10] = r8
            w0.b$d[] r8 = new p382w0.C6775b.d[r10]
            w0.b$d r11 = new w0.b$d
            java.lang.String r14 = "AspectFrame"
            r10 = 4371(0x1113, float:6.125E-42)
            r20 = r13
            r13 = 3
            r11.<init>(r14, r10, r13)
            r10 = 0
            r8[r10] = r11
            r11 = 1
            w0.b$d[] r14 = new p382w0.C6775b.d[r11]
            w0.b$d r11 = new w0.b$d
            java.lang.String r10 = "ColorSpace"
            r21 = r1
            r1 = 55
            r11.<init>(r10, r1, r13)
            r1 = 0
            r14[r1] = r11
            r10 = 10
            w0.b$d[][] r11 = new p382w0.C6775b.d[r10][]
            r11[r1] = r12
            r1 = 1
            r11[r1] = r3
            r1 = 2
            r11[r1] = r4
            r11[r13] = r6
            r1 = 4
            r11[r1] = r7
            r3 = 5
            r11[r3] = r12
            r3 = 6
            r11[r3] = r0
            r0 = 7
            r11[r0] = r2
            r0 = 8
            r11[r0] = r8
            r0 = 9
            r11[r0] = r14
            p382w0.C6775b.f26253J = r11
            w0.b$d[] r0 = new p382w0.C6775b.d[r3]
            w0.b$d r2 = new w0.b$d
            java.lang.String r3 = "SubIFDPointer"
            r4 = 330(0x14a, float:4.62E-43)
            r2.<init>(r3, r4, r1)
            r3 = 0
            r0[r3] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r3 = "ExifIFDPointer"
            r4 = 34665(0x8769, float:4.8576E-41)
            r2.<init>(r3, r4, r1)
            r3 = 1
            r0[r3] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r3 = "GPSInfoIFDPointer"
            r4 = 34853(0x8825, float:4.884E-41)
            r2.<init>(r3, r4, r1)
            r3 = 2
            r0[r3] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r3 = "InteroperabilityIFDPointer"
            r4 = 40965(0xa005, float:5.7404E-41)
            r2.<init>(r3, r4, r1)
            r3 = 3
            r0[r3] = r2
            w0.b$d r2 = new w0.b$d
            java.lang.String r3 = "CameraSettingsIFDPointer"
            r4 = 8224(0x2020, float:1.1524E-41)
            r6 = 1
            r2.<init>(r3, r4, r6)
            r0[r1] = r2
            w0.b$d r1 = new w0.b$d
            java.lang.String r2 = "ImageProcessingIFDPointer"
            r3 = 8256(0x2040, float:1.1569E-41)
            r1.<init>(r2, r3, r6)
            r2 = 5
            r0[r2] = r1
            p382w0.C6775b.f26254K = r0
            r0 = 10
            java.util.HashMap[] r1 = new java.util.HashMap[r0]
            p382w0.C6775b.f26255L = r1
            java.util.HashMap[] r0 = new java.util.HashMap[r0]
            p382w0.C6775b.f26256M = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "FNumber"
            java.lang.String r2 = "DigitalZoomRatio"
            java.lang.String r3 = "ExposureTime"
            java.lang.String r4 = "SubjectDistance"
            java.lang.String r6 = "GPSTimeStamp"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r6}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            p382w0.C6775b.f26257N = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            p382w0.C6775b.f26258O = r0
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            p382w0.C6775b.f26259P = r0
            java.lang.String r1 = "Exif\u0000\u0000"
            byte[] r1 = r1.getBytes(r0)
            p382w0.C6775b.f26260Q = r1
            java.lang.String r1 = "http://ns.adobe.com/xap/1.0/\u0000"
            byte[] r0 = r1.getBytes(r0)
            p382w0.C6775b.f26261R = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy:MM:dd HH:mm:ss"
            r0.<init>(r1)
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            r7 = 0
        Lbd4:
            w0.b$d[][] r0 = p382w0.C6775b.f26253J
            int r1 = r0.length
            if (r7 >= r1) goto Lc0f
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r1 = p382w0.C6775b.f26255L
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1[r7] = r2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifTag>[] r1 = p382w0.C6775b.f26256M
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1[r7] = r2
            r0 = r0[r7]
            int r1 = r0.length
            r2 = 0
        Lbef:
            if (r2 >= r1) goto Lc0c
            r3 = r0[r2]
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r4 = p382w0.C6775b.f26255L
            r4 = r4[r7]
            int r6 = r3.f26299a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r6, r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifTag>[] r4 = p382w0.C6775b.f26256M
            r4 = r4[r7]
            java.lang.String r6 = r3.f26300b
            r4.put(r6, r3)
            int r2 = r2 + 1
            goto Lbef
        Lc0c:
            int r7 = r7 + 1
            goto Lbd4
        Lc0f:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = p382w0.C6775b.f26258O
            w0.b$d[] r1 = p382w0.C6775b.f26254K
            r2 = 0
            r2 = r1[r2]
            int r2 = r2.f26299a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r15)
            r2 = 1
            r2 = r1[r2]
            int r2 = r2.f26299a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r5)
            r2 = 2
            r2 = r1[r2]
            int r2 = r2.f26299a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r9)
            r2 = 3
            r2 = r1[r2]
            int r2 = r2.f26299a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = r21
            r0.put(r2, r3)
            r2 = 4
            r2 = r1[r2]
            int r2 = r2.f26299a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = r20
            r0.put(r2, r3)
            r2 = 5
            r1 = r1[r2]
            int r1 = r1.f26299a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = r16
            r0.put(r1, r2)
            java.lang.String r0 = ".*[1-9].*"
            java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = "^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$"
            java.util.regex.Pattern.compile(r0)
            return
    }

    public C6775b(java.io.InputStream r9) {
            r8 = this;
            r8.<init>()
            w0.b$d[][] r0 = p382w0.C6775b.f26253J
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r8.f26279e = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r8.f26280f = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r8.f26281g = r0
            java.lang.String r0 = "inputStream cannot be null"
            java.util.Objects.requireNonNull(r9, r0)
            boolean r0 = r9 instanceof android.content.res.AssetManager.AssetInputStream
            r1 = 0
            r2 = 0
            java.lang.String r3 = "ExifInterface"
            if (r0 == 0) goto L29
            r0 = r9
            android.content.res.AssetManager$AssetInputStream r0 = (android.content.res.AssetManager.AssetInputStream) r0
            r8.f26276b = r0
            goto L53
        L29:
            boolean r0 = r9 instanceof java.io.FileInputStream
            if (r0 == 0) goto L51
            r0 = r9
            java.io.FileInputStream r0 = (java.io.FileInputStream) r0
            java.io.FileDescriptor r4 = r0.getFD()
            r5 = 0
            int r7 = android.system.OsConstants.SEEK_CUR     // Catch: java.lang.Exception -> L3d
            android.system.Os.lseek(r4, r5, r7)     // Catch: java.lang.Exception -> L3d
            r4 = 1
            goto L48
        L3d:
            boolean r4 = p382w0.C6775b.f26262n
            if (r4 == 0) goto L47
            java.lang.String r4 = "The file descriptor for the given input is not seekable"
            android.util.Log.d(r3, r4)
        L47:
            r4 = 0
        L48:
            if (r4 == 0) goto L51
            r8.f26276b = r2
            java.io.FileDescriptor r2 = r0.getFD()
            goto L53
        L51:
            r8.f26276b = r2
        L53:
            r8.f26275a = r2
            r0 = 0
        L56:
            w0.b$d[][] r2 = p382w0.C6775b.f26253J     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            int r2 = r2.length     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            if (r0 >= r2) goto L67
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r8.f26279e     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            r4.<init>()     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            r2[r0] = r4     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            int r0 = r0 + 1
            goto L56
        L67:
            boolean r0 = r8.f26278d     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            if (r0 != 0) goto L79
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            r2 = 5000(0x1388, float:7.006E-42)
            r0.<init>(r9, r2)     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            int r9 = r8.m13758h(r0)     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            r8.f26277c = r9     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            r9 = r0
        L79:
            w0.b$b r0 = new w0.b$b     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            r0.<init>(r9)     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            boolean r9 = r8.f26278d     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            if (r9 != 0) goto La8
            int r9 = r8.f26277c     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            switch(r9) {
                case 0: goto La4;
                case 1: goto La4;
                case 2: goto La4;
                case 3: goto La4;
                case 4: goto La0;
                case 5: goto La4;
                case 6: goto La4;
                case 7: goto L9c;
                case 8: goto La4;
                case 9: goto L98;
                case 10: goto L94;
                case 11: goto La4;
                case 12: goto L90;
                case 13: goto L8c;
                case 14: goto L88;
                default: goto L87;
            }     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
        L87:
            goto Lab
        L88:
            r8.m13765o(r0)     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            goto Lab
        L8c:
            r8.m13760j(r0)     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            goto Lab
        L90:
            r8.m13756f(r0)     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            goto Lab
        L94:
            r8.m13763m(r0)     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            goto Lab
        L98:
            r8.m13761k(r0)     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            goto Lab
        L9c:
            r8.m13759i(r0)     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            goto Lab
        La0:
            r8.m13757g(r0, r1, r1)     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            goto Lab
        La4:
            r8.m13762l(r0)     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            goto Lab
        La8:
            r8.m13764n(r0)     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
        Lab:
            r8.m13773w(r0)     // Catch: java.lang.Throwable -> Lb6 java.io.IOException -> Lb8
            r8.m13753a()
            boolean r9 = p382w0.C6775b.f26262n
            if (r9 == 0) goto Lca
            goto Lc7
        Lb6:
            r9 = move-exception
            goto Lcb
        Lb8:
            r9 = move-exception
            boolean r0 = p382w0.C6775b.f26262n     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto Lc2
            java.lang.String r1 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r3, r1, r9)     // Catch: java.lang.Throwable -> Lb6
        Lc2:
            r8.m13753a()
            if (r0 == 0) goto Lca
        Lc7:
            r8.m13769s()
        Lca:
            return
        Lcb:
            r8.m13753a()
            boolean r0 = p382w0.C6775b.f26262n
            if (r0 == 0) goto Ld5
            r8.m13769s()
        Ld5:
            throw r9
    }

    /* renamed from: b */
    public static java.lang.String m13749b(byte[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.length
            int r1 = r1 * 2
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        La:
            int r3 = r5.length
            if (r2 >= r3) goto L24
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r5[r2]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r3[r1] = r4
            java.lang.String r4 = "%02x"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L24:
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* renamed from: c */
    public static long[] m13750c(java.lang.Object r4) {
            boolean r0 = r4 instanceof int[]
            if (r0 == 0) goto L16
            int[] r4 = (int[]) r4
            int r0 = r4.length
            long[] r0 = new long[r0]
            r1 = 0
        La:
            int r2 = r4.length
            if (r1 >= r2) goto L15
            r2 = r4[r1]
            long r2 = (long) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto La
        L15:
            return r0
        L16:
            boolean r0 = r4 instanceof long[]
            if (r0 == 0) goto L1d
            long[] r4 = (long[]) r4
            return r4
        L1d:
            r4 = 0
            return r4
    }

    /* renamed from: x */
    public static boolean m13751x(byte[] r4, byte[] r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 >= r2) goto L9
            return r0
        L9:
            r1 = 0
        La:
            int r2 = r5.length
            if (r1 >= r2) goto L17
            r2 = r4[r1]
            r3 = r5[r1]
            if (r2 == r3) goto L14
            return r0
        L14:
            int r1 = r1 + 1
            goto La
        L17:
            r4 = 1
            return r4
    }

    /* renamed from: A */
    public final void m13752A() {
            r7 = this;
            r0 = 0
            r1 = 5
            r7.m13774y(r0, r1)
            r2 = 4
            r7.m13774y(r0, r2)
            r7.m13774y(r1, r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r7.f26279e
            r4 = 1
            r3 = r3[r4]
            java.lang.String r5 = "PixelXDimension"
            java.lang.Object r3 = r3.get(r5)
            w0.b$c r3 = (p382w0.C6775b.c) r3
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r7.f26279e
            r4 = r5[r4]
            java.lang.String r5 = "PixelYDimension"
            java.lang.Object r4 = r4.get(r5)
            w0.b$c r4 = (p382w0.C6775b.c) r4
            if (r3 == 0) goto L3b
            if (r4 == 0) goto L3b
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r7.f26279e
            r5 = r5[r0]
            java.lang.String r6 = "ImageWidth"
            r5.put(r6, r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r7.f26279e
            r0 = r3[r0]
            java.lang.String r3 = "ImageLength"
            r0.put(r3, r4)
        L3b:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r7.f26279e
            r0 = r0[r2]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r7.f26279e
            r0 = r0[r1]
            boolean r0 = r7.m13767q(r0)
            if (r0 == 0) goto L5c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r7.f26279e
            r3 = r0[r1]
            r0[r2] = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r0[r1] = r3
        L5c:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r7.f26279e
            r0 = r0[r2]
            boolean r0 = r7.m13767q(r0)
            if (r0 != 0) goto L6d
            java.lang.String r0 = "ExifInterface"
            java.lang.String r1 = "No image meets the size requirements of a thumbnail image."
            android.util.Log.d(r0, r1)
        L6d:
            return
    }

    /* renamed from: a */
    public final void m13753a() {
            r6 = this;
            java.lang.String r0 = "DateTimeOriginal"
            java.lang.String r0 = r6.m13754d(r0)
            r1 = 0
            if (r0 == 0) goto L1c
            java.lang.String r2 = "DateTime"
            java.lang.String r3 = r6.m13754d(r2)
            if (r3 != 0) goto L1c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r6.f26279e
            r3 = r3[r1]
            w0.b$c r0 = p382w0.C6775b.c.m13778a(r0)
            r3.put(r2, r0)
        L1c:
            java.lang.String r0 = "ImageWidth"
            java.lang.String r2 = r6.m13754d(r0)
            r3 = 0
            if (r2 != 0) goto L33
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.f26279e
            r2 = r2[r1]
            java.nio.ByteOrder r5 = r6.f26281g
            w0.b$c r5 = p382w0.C6775b.c.m13779b(r3, r5)
            r2.put(r0, r5)
        L33:
            java.lang.String r0 = "ImageLength"
            java.lang.String r2 = r6.m13754d(r0)
            if (r2 != 0) goto L48
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.f26279e
            r2 = r2[r1]
            java.nio.ByteOrder r5 = r6.f26281g
            w0.b$c r5 = p382w0.C6775b.c.m13779b(r3, r5)
            r2.put(r0, r5)
        L48:
            java.lang.String r0 = "Orientation"
            java.lang.String r2 = r6.m13754d(r0)
            if (r2 != 0) goto L5d
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.f26279e
            r1 = r2[r1]
            java.nio.ByteOrder r2 = r6.f26281g
            w0.b$c r2 = p382w0.C6775b.c.m13779b(r3, r2)
            r1.put(r0, r2)
        L5d:
            java.lang.String r0 = "LightSource"
            java.lang.String r1 = r6.m13754d(r0)
            if (r1 != 0) goto L73
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r6.f26279e
            r2 = 1
            r1 = r1[r2]
            java.nio.ByteOrder r2 = r6.f26281g
            w0.b$c r2 = p382w0.C6775b.c.m13779b(r3, r2)
            r1.put(r0, r2)
        L73:
            return
    }

    /* renamed from: d */
    public java.lang.String m13754d(java.lang.String r6) {
            r5 = this;
            w0.b$c r0 = r5.m13755e(r6)
            r1 = 0
            if (r0 == 0) goto Laa
            java.util.HashSet<java.lang.String> r2 = p382w0.C6775b.f26257N
            boolean r2 = r2.contains(r6)
            if (r2 != 0) goto L16
            java.nio.ByteOrder r6 = r5.f26281g
            java.lang.String r6 = r0.m13784g(r6)
            return r6
        L16:
            java.lang.String r2 = "GPSTimeStamp"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L9f
            int r6 = r0.f26296a
            r2 = 5
            if (r6 == r2) goto L37
            r2 = 10
            if (r6 == r2) goto L37
            java.lang.String r6 = "GPS Timestamp format is not rational. format="
            java.lang.StringBuilder r6 = android.support.v4.media.C0144c.m256a(r6)
            int r0 = r0.f26296a
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            goto L99
        L37:
            java.nio.ByteOrder r6 = r5.f26281g
            java.lang.Object r6 = r0.m13785h(r6)
            w0.b$e[] r6 = (p382w0.C6775b.e[]) r6
            if (r6 == 0) goto L88
            int r0 = r6.length
            r2 = 3
            if (r0 == r2) goto L46
            goto L88
        L46:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1 = 0
            r2 = r6[r1]
            long r2 = r2.f26303a
            float r2 = (float) r2
            r3 = r6[r1]
            long r3 = r3.f26304b
            float r3 = (float) r3
            float r2 = r2 / r3
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 1
            r2 = r6[r1]
            long r2 = r2.f26303a
            float r2 = (float) r2
            r3 = r6[r1]
            long r3 = r3.f26304b
            float r3 = (float) r3
            float r2 = r2 / r3
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 2
            r2 = r6[r1]
            long r2 = r2.f26303a
            float r2 = (float) r2
            r6 = r6[r1]
            long r3 = r6.f26304b
            float r6 = (float) r3
            float r2 = r2 / r6
            int r6 = (int) r2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r1] = r6
            java.lang.String r6 = "%02d:%02d:%02d"
            java.lang.String r6 = java.lang.String.format(r6, r0)
            return r6
        L88:
            java.lang.String r0 = "Invalid GPS Timestamp array. array="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
        L99:
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r6)
            return r1
        L9f:
            java.nio.ByteOrder r6 = r5.f26281g     // Catch: java.lang.NumberFormatException -> Laa
            double r2 = r0.m13782e(r6)     // Catch: java.lang.NumberFormatException -> Laa
            java.lang.String r6 = java.lang.Double.toString(r2)     // Catch: java.lang.NumberFormatException -> Laa
            return r6
        Laa:
            return r1
    }

    /* renamed from: e */
    public final p382w0.C6775b.c m13755e(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "ISOSpeedRatings"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L15
            boolean r3 = p382w0.C6775b.f26262n
            if (r3 == 0) goto L13
            java.lang.String r3 = "ExifInterface"
            java.lang.String r0 = "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."
            android.util.Log.d(r3, r0)
        L13:
            java.lang.String r3 = "PhotographicSensitivity"
        L15:
            r0 = 0
        L16:
            w0.b$d[][] r1 = p382w0.C6775b.f26253J
            int r1 = r1.length
            if (r0 >= r1) goto L2b
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r2.f26279e
            r1 = r1[r0]
            java.lang.Object r1 = r1.get(r3)
            w0.b$c r1 = (p382w0.C6775b.c) r1
            if (r1 == 0) goto L28
            return r1
        L28:
            int r0 = r0 + 1
            goto L16
        L2b:
            r3 = 0
            return r3
    }

    /* renamed from: f */
    public final void m13756f(p382w0.C6775b.b r13) {
            r12 = this;
            java.lang.String r0 = "yes"
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L144
            r3 = 23
            if (r2 < r3) goto L16
            w0.b$a r2 = new w0.b$a     // Catch: java.lang.Throwable -> L144
            r2.<init>(r12, r13)     // Catch: java.lang.Throwable -> L144
            r1.setDataSource(r2)     // Catch: java.lang.Throwable -> L144
            goto L1d
        L16:
            java.io.FileDescriptor r2 = r12.f26275a     // Catch: java.lang.Throwable -> L144
            if (r2 == 0) goto L140
            r1.setDataSource(r2)     // Catch: java.lang.Throwable -> L144
        L1d:
            r2 = 33
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch: java.lang.Throwable -> L144
            r3 = 34
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch: java.lang.Throwable -> L144
            r4 = 26
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch: java.lang.Throwable -> L144
            r5 = 17
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch: java.lang.Throwable -> L144
            boolean r4 = r0.equals(r4)     // Catch: java.lang.Throwable -> L144
            r6 = 0
            if (r4 == 0) goto L4f
            r0 = 29
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch: java.lang.Throwable -> L144
            r0 = 30
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch: java.lang.Throwable -> L144
            r4 = 31
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch: java.lang.Throwable -> L144
            goto L6a
        L4f:
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L144
            if (r0 == 0) goto L68
            r0 = 18
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch: java.lang.Throwable -> L144
            r0 = 19
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch: java.lang.Throwable -> L144
            r4 = 24
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch: java.lang.Throwable -> L144
            goto L6a
        L68:
            r0 = r6
            r4 = r0
        L6a:
            r5 = 0
            if (r6 == 0) goto L80
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r12.f26279e     // Catch: java.lang.Throwable -> L144
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L144
            java.lang.String r8 = "ImageWidth"
            int r9 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> L144
            java.nio.ByteOrder r10 = r12.f26281g     // Catch: java.lang.Throwable -> L144
            w0.b$c r9 = p382w0.C6775b.c.m13781d(r9, r10)     // Catch: java.lang.Throwable -> L144
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L144
        L80:
            if (r0 == 0) goto L95
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r12.f26279e     // Catch: java.lang.Throwable -> L144
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L144
            java.lang.String r8 = "ImageLength"
            int r9 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L144
            java.nio.ByteOrder r10 = r12.f26281g     // Catch: java.lang.Throwable -> L144
            w0.b$c r9 = p382w0.C6775b.c.m13781d(r9, r10)     // Catch: java.lang.Throwable -> L144
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L144
        L95:
            r7 = 6
            if (r4 == 0) goto Lbf
            r8 = 1
            int r9 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L144
            r10 = 90
            if (r9 == r10) goto Laf
            r10 = 180(0xb4, float:2.52E-43)
            if (r9 == r10) goto Lad
            r10 = 270(0x10e, float:3.78E-43)
            if (r9 == r10) goto Laa
            goto Lb0
        Laa:
            r8 = 8
            goto Lb0
        Lad:
            r8 = 3
            goto Lb0
        Laf:
            r8 = 6
        Lb0:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r12.f26279e     // Catch: java.lang.Throwable -> L144
            r9 = r9[r5]     // Catch: java.lang.Throwable -> L144
            java.lang.String r10 = "Orientation"
            java.nio.ByteOrder r11 = r12.f26281g     // Catch: java.lang.Throwable -> L144
            w0.b$c r8 = p382w0.C6775b.c.m13781d(r8, r11)     // Catch: java.lang.Throwable -> L144
            r9.put(r10, r8)     // Catch: java.lang.Throwable -> L144
        Lbf:
            if (r2 == 0) goto L112
            if (r3 == 0) goto L112
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L144
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L144
            if (r3 <= r7) goto L10a
            long r8 = (long) r2     // Catch: java.lang.Throwable -> L144
            r13.m13777h(r8)     // Catch: java.lang.Throwable -> L144
            byte[] r8 = new byte[r7]     // Catch: java.lang.Throwable -> L144
            int r9 = r13.read(r8)     // Catch: java.lang.Throwable -> L144
            if (r9 != r7) goto L102
            int r2 = r2 + r7
            int r3 = r3 + (-6)
            byte[] r7 = p382w0.C6775b.f26260Q     // Catch: java.lang.Throwable -> L144
            boolean r7 = java.util.Arrays.equals(r8, r7)     // Catch: java.lang.Throwable -> L144
            if (r7 == 0) goto Lfa
            byte[] r7 = new byte[r3]     // Catch: java.lang.Throwable -> L144
            int r13 = r13.read(r7)     // Catch: java.lang.Throwable -> L144
            if (r13 != r3) goto Lf2
            r12.f26283i = r2     // Catch: java.lang.Throwable -> L144
            r12.m13771u(r7, r5)     // Catch: java.lang.Throwable -> L144
            goto L112
        Lf2:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L144
            java.lang.String r0 = "Can't read exif"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L144
            throw r13     // Catch: java.lang.Throwable -> L144
        Lfa:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L144
            java.lang.String r0 = "Invalid identifier"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L144
            throw r13     // Catch: java.lang.Throwable -> L144
        L102:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L144
            java.lang.String r0 = "Can't read identifier"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L144
            throw r13     // Catch: java.lang.Throwable -> L144
        L10a:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L144
            java.lang.String r0 = "Invalid exif length"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L144
            throw r13     // Catch: java.lang.Throwable -> L144
        L112:
            boolean r13 = p382w0.C6775b.f26262n     // Catch: java.lang.Throwable -> L144
            if (r13 == 0) goto L13c
            java.lang.String r13 = "ExifInterface"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L144
            r2.<init>()     // Catch: java.lang.Throwable -> L144
            java.lang.String r3 = "Heif meta: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L144
            r2.append(r6)     // Catch: java.lang.Throwable -> L144
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch: java.lang.Throwable -> L144
            r2.append(r0)     // Catch: java.lang.Throwable -> L144
            java.lang.String r0 = ", rotation "
            r2.append(r0)     // Catch: java.lang.Throwable -> L144
            r2.append(r4)     // Catch: java.lang.Throwable -> L144
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L144
            android.util.Log.d(r13, r0)     // Catch: java.lang.Throwable -> L144
        L13c:
            r1.release()
            return
        L140:
            r1.release()
            return
        L144:
            r13 = move-exception
            r1.release()
            throw r13
    }

    /* renamed from: g */
    public final void m13757g(p382w0.C6775b.b r18, int r19, int r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = p382w0.C6775b.f26262n
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L22
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "getJpegAttributes starting with: "
            r4.append(r6)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L22:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r1.f26293Z = r4
            long r6 = (long) r2
            r1.m13777h(r6)
            byte r4 = r18.readByte()
            java.lang.String r6 = "Invalid marker: "
            r7 = -1
            if (r4 != r7) goto L1b9
            r8 = 1
            int r2 = r2 + r8
            byte r9 = r18.readByte()
            r10 = -40
            if (r9 != r10) goto L1a2
            int r2 = r2 + r8
        L3e:
            byte r4 = r18.readByte()
            if (r4 != r7) goto L189
            int r2 = r2 + r8
            byte r4 = r18.readByte()
            boolean r6 = p382w0.C6775b.f26262n
            if (r6 == 0) goto L63
            java.lang.String r7 = "Found JPEG segment indicator: "
            java.lang.StringBuilder r7 = android.support.v4.media.C0144c.m256a(r7)
            r9 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
        L63:
            int r2 = r2 + r8
            r7 = -39
            if (r4 == r7) goto L184
            r7 = -38
            if (r4 != r7) goto L6e
            goto L184
        L6e:
            int r7 = r18.readUnsignedShort()
            int r7 = r7 + (-2)
            int r2 = r2 + 2
            if (r6 == 0) goto L9d
            java.lang.String r6 = "JPEG segment: "
            java.lang.StringBuilder r6 = android.support.v4.media.C0144c.m256a(r6)
            r9 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r6.append(r9)
            java.lang.String r9 = " (length: "
            r6.append(r9)
            int r9 = r7 + 2
            r6.append(r9)
            java.lang.String r9 = ")"
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L9d:
            java.lang.String r6 = "Invalid length"
            if (r7 < 0) goto L17e
            r9 = -31
            r10 = 0
            if (r4 == r9) goto L11c
            r9 = -2
            if (r4 == r9) goto Lf1
            switch(r4) {
                case -64: goto Lb7;
                case -63: goto Lb7;
                case -62: goto Lb7;
                case -61: goto Lb7;
                default: goto Lac;
            }
        Lac:
            switch(r4) {
                case -59: goto Lb7;
                case -58: goto Lb7;
                case -57: goto Lb7;
                default: goto Laf;
            }
        Laf:
            switch(r4) {
                case -55: goto Lb7;
                case -54: goto Lb7;
                case -53: goto Lb7;
                default: goto Lb2;
            }
        Lb2:
            switch(r4) {
                case -51: goto Lb7;
                case -50: goto Lb7;
                case -49: goto Lb7;
                default: goto Lb5;
            }
        Lb5:
            goto L163
        Lb7:
            int r4 = r1.skipBytes(r8)
            if (r4 != r8) goto Le9
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.f26279e
            r4 = r4[r3]
            int r8 = r18.readUnsignedShort()
            long r8 = (long) r8
            java.nio.ByteOrder r10 = r0.f26281g
            w0.b$c r8 = p382w0.C6775b.c.m13779b(r8, r10)
            java.lang.String r9 = "ImageLength"
            r4.put(r9, r8)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.f26279e
            r4 = r4[r3]
            int r8 = r18.readUnsignedShort()
            long r8 = (long) r8
            java.nio.ByteOrder r10 = r0.f26281g
            w0.b$c r8 = p382w0.C6775b.c.m13779b(r8, r10)
            java.lang.String r9 = "ImageWidth"
            r4.put(r9, r8)
            int r7 = r7 + (-5)
            goto L163
        Le9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid SOFx"
            r1.<init>(r2)
            throw r1
        Lf1:
            byte[] r4 = new byte[r7]
            int r9 = r1.read(r4)
            if (r9 != r7) goto L114
            java.lang.String r7 = "UserComment"
            java.lang.String r9 = r0.m13754d(r7)
            if (r9 != 0) goto L162
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.f26279e
            r8 = r9[r8]
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p382w0.C6775b.f26259P
            r9.<init>(r4, r10)
            w0.b$c r4 = p382w0.C6775b.c.m13778a(r9)
            r8.put(r7, r4)
            goto L162
        L114:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L11c:
            byte[] r4 = new byte[r7]
            r1.readFully(r4)
            int r8 = r2 + r7
            byte[] r9 = p382w0.C6775b.f26260Q
            boolean r11 = m13751x(r4, r9)
            if (r11 == 0) goto L138
            int r10 = r9.length
            int r2 = r2 + r10
            int r9 = r9.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r9, r7)
            r0.f26283i = r2
            r0.m13771u(r4, r3)
            goto L161
        L138:
            byte[] r9 = p382w0.C6775b.f26261R
            boolean r11 = m13751x(r4, r9)
            if (r11 == 0) goto L161
            int r11 = r9.length
            int r2 = r2 + r11
            int r9 = r9.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r9, r7)
            java.lang.String r7 = "Xmp"
            java.lang.String r9 = r0.m13754d(r7)
            if (r9 != 0) goto L161
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.f26279e
            r9 = r9[r10]
            w0.b$c r10 = new w0.b$c
            r12 = 1
            int r13 = r4.length
            long r14 = (long) r2
            r11 = r10
            r16 = r4
            r11.<init>(r12, r13, r14, r16)
            r9.put(r7, r10)
        L161:
            r2 = r8
        L162:
            r7 = 0
        L163:
            if (r7 < 0) goto L178
            int r4 = r1.skipBytes(r7)
            if (r4 != r7) goto L170
            int r2 = r2 + r7
            r7 = -1
            r8 = 1
            goto L3e
        L170:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid JPEG segment"
            r1.<init>(r2)
            throw r1
        L178:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L17e:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L184:
            java.nio.ByteOrder r2 = r0.f26281g
            r1.f26293Z = r2
            return
        L189:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid marker:"
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1a2:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r6)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1b9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r6)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: h */
    public final int m13758h(java.io.BufferedInputStream r18) {
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 5000(0x1388, float:7.006E-42)
            r0.mark(r2)
            byte[] r3 = new byte[r2]
            r0.read(r3)
            r18.reset()
            r4 = 0
            r0 = 0
        L13:
            byte[] r5 = p382w0.C6775b.f26267s
            int r6 = r5.length
            if (r0 >= r6) goto L23
            r6 = r3[r0]
            r5 = r5[r0]
            if (r6 == r5) goto L20
            r0 = 0
            goto L24
        L20:
            int r0 = r0 + 1
            goto L13
        L23:
            r0 = 1
        L24:
            r5 = 4
            if (r0 == 0) goto L28
            return r5
        L28:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r6 = "FUJIFILMCCD-RAW"
            byte[] r0 = r6.getBytes(r0)
            r6 = 0
        L33:
            int r8 = r0.length
            if (r6 >= r8) goto L41
            r8 = r3[r6]
            r9 = r0[r6]
            if (r8 == r9) goto L3e
            r0 = 0
            goto L42
        L3e:
            int r6 = r6 + 1
            goto L33
        L41:
            r0 = 1
        L42:
            if (r0 == 0) goto L47
            r0 = 9
            return r0
        L47:
            w0.b$b r8 = new w0.b$b     // Catch: java.lang.Throwable -> Lbd java.lang.Exception -> Lc1
            r8.<init>(r3)     // Catch: java.lang.Throwable -> Lbd java.lang.Exception -> Lc1
            int r0 = r8.readInt()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lbb
            long r9 = (long) r0     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lbb
            byte[] r0 = new byte[r5]     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lbb
            r8.read(r0)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lbb
            byte[] r11 = p382w0.C6775b.f26268t     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lbb
            boolean r0 = java.util.Arrays.equals(r0, r11)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lbb
            if (r0 != 0) goto L60
            goto Ld0
        L60:
            r11 = 16
            r13 = 8
            r15 = 1
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 != 0) goto L73
            long r9 = r8.readLong()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lbb
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 >= 0) goto L74
            goto Ld0
        L73:
            r11 = r13
        L74:
            long r6 = (long) r2     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lbb
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L7a
            r9 = r6
        L7a:
            long r9 = r9 - r11
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 >= 0) goto L80
            goto Ld0
        L80:
            byte[] r0 = new byte[r5]     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lbb
            r6 = 0
            r2 = 0
            r11 = 0
        L86:
            r12 = 4
            long r12 = r9 / r12
            int r14 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r14 >= 0) goto Ld0
            int r12 = r8.read(r0)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lbb
            if (r12 == r5) goto L95
            goto Ld0
        L95:
            int r12 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r12 != 0) goto L9a
            goto Lb6
        L9a:
            byte[] r12 = p382w0.C6775b.f26269u     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lbb
            boolean r12 = java.util.Arrays.equals(r0, r12)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lbb
            if (r12 == 0) goto La4
            r2 = 1
            goto Lad
        La4:
            byte[] r12 = p382w0.C6775b.f26270v     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lbb
            boolean r12 = java.util.Arrays.equals(r0, r12)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lbb
            if (r12 == 0) goto Lad
            r11 = 1
        Lad:
            if (r2 == 0) goto Lb6
            if (r11 == 0) goto Lb6
            r8.close()
            r0 = 1
            goto Ld4
        Lb6:
            long r6 = r6 + r15
            goto L86
        Lb8:
            r0 = move-exception
            goto L18e
        Lbb:
            r0 = move-exception
            goto Lc3
        Lbd:
            r0 = move-exception
            r6 = 0
            goto L18d
        Lc1:
            r0 = move-exception
            r8 = 0
        Lc3:
            boolean r2 = p382w0.C6775b.f26262n     // Catch: java.lang.Throwable -> L18b
            if (r2 == 0) goto Lce
            java.lang.String r2 = "ExifInterface"
            java.lang.String r6 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r6, r0)     // Catch: java.lang.Throwable -> L18b
        Lce:
            if (r8 == 0) goto Ld3
        Ld0:
            r8.close()
        Ld3:
            r0 = 0
        Ld4:
            if (r0 == 0) goto Ld9
            r0 = 12
            return r0
        Ld9:
            w0.b$b r2 = new w0.b$b     // Catch: java.lang.Throwable -> Lff java.lang.Exception -> L107
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lff java.lang.Exception -> L107
            java.nio.ByteOrder r0 = r1.m13770t(r2)     // Catch: java.lang.Throwable -> Lfa java.lang.Exception -> Lfd
            r1.f26281g = r0     // Catch: java.lang.Throwable -> Lfa java.lang.Exception -> Lfd
            r2.f26293Z = r0     // Catch: java.lang.Throwable -> Lfa java.lang.Exception -> Lfd
            short r0 = r2.readShort()     // Catch: java.lang.Throwable -> Lfa java.lang.Exception -> Lfd
            r6 = 20306(0x4f52, float:2.8455E-41)
            if (r0 == r6) goto Lf5
            r6 = 21330(0x5352, float:2.989E-41)
            if (r0 != r6) goto Lf3
            goto Lf5
        Lf3:
            r0 = 0
            goto Lf6
        Lf5:
            r0 = 1
        Lf6:
            r2.close()
            goto L10e
        Lfa:
            r0 = move-exception
            r6 = r2
            goto L101
        Lfd:
            goto L108
        Lff:
            r0 = move-exception
            r6 = 0
        L101:
            if (r6 == 0) goto L106
            r6.close()
        L106:
            throw r0
        L107:
            r2 = 0
        L108:
            if (r2 == 0) goto L10d
            r2.close()
        L10d:
            r0 = 0
        L10e:
            if (r0 == 0) goto L112
            r0 = 7
            return r0
        L112:
            w0.b$b r2 = new w0.b$b     // Catch: java.lang.Throwable -> L133 java.lang.Exception -> L13b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L133 java.lang.Exception -> L13b
            java.nio.ByteOrder r0 = r1.m13770t(r2)     // Catch: java.lang.Throwable -> L12e java.lang.Exception -> L131
            r1.f26281g = r0     // Catch: java.lang.Throwable -> L12e java.lang.Exception -> L131
            r2.f26293Z = r0     // Catch: java.lang.Throwable -> L12e java.lang.Exception -> L131
            short r0 = r2.readShort()     // Catch: java.lang.Throwable -> L12e java.lang.Exception -> L131
            r6 = 85
            if (r0 != r6) goto L129
            r0 = 1
            goto L12a
        L129:
            r0 = 0
        L12a:
            r2.close()
            goto L142
        L12e:
            r0 = move-exception
            r6 = r2
            goto L135
        L131:
            r6 = r2
            goto L13c
        L133:
            r0 = move-exception
            r6 = 0
        L135:
            if (r6 == 0) goto L13a
            r6.close()
        L13a:
            throw r0
        L13b:
            r6 = 0
        L13c:
            if (r6 == 0) goto L141
            r6.close()
        L141:
            r0 = 0
        L142:
            if (r0 == 0) goto L147
            r0 = 10
            return r0
        L147:
            r0 = 0
        L148:
            byte[] r2 = p382w0.C6775b.f26273y
            int r6 = r2.length
            if (r0 >= r6) goto L158
            r6 = r3[r0]
            r2 = r2[r0]
            if (r6 == r2) goto L155
            r0 = 0
            goto L159
        L155:
            int r0 = r0 + 1
            goto L148
        L158:
            r0 = 1
        L159:
            if (r0 == 0) goto L15e
            r0 = 13
            return r0
        L15e:
            r0 = 0
        L15f:
            byte[] r2 = p382w0.C6775b.f26246C
            int r6 = r2.length
            if (r0 >= r6) goto L16e
            r6 = r3[r0]
            r2 = r2[r0]
            if (r6 == r2) goto L16b
            goto L17f
        L16b:
            int r0 = r0 + 1
            goto L15f
        L16e:
            r0 = 0
        L16f:
            byte[] r2 = p382w0.C6775b.f26247D
            int r6 = r2.length
            if (r0 >= r6) goto L184
            byte[] r6 = p382w0.C6775b.f26246C
            int r6 = r6.length
            int r6 = r6 + r0
            int r6 = r6 + r5
            r6 = r3[r6]
            r2 = r2[r0]
            if (r6 == r2) goto L181
        L17f:
            r7 = 0
            goto L185
        L181:
            int r0 = r0 + 1
            goto L16f
        L184:
            r7 = 1
        L185:
            if (r7 == 0) goto L18a
            r0 = 14
            return r0
        L18a:
            return r4
        L18b:
            r0 = move-exception
            r6 = r8
        L18d:
            r8 = r6
        L18e:
            if (r8 == 0) goto L193
            r8.close()
        L193:
            throw r0
    }

    /* renamed from: i */
    public final void m13759i(p382w0.C6775b.b r7) {
            r6 = this;
            r6.m13762l(r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.f26279e
            r0 = 1
            r7 = r7[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r7 = r7.get(r1)
            w0.b$c r7 = (p382w0.C6775b.c) r7
            if (r7 == 0) goto Lef
            w0.b$b r1 = new w0.b$b
            byte[] r7 = r7.f26298c
            r1.<init>(r7)
            java.nio.ByteOrder r7 = r6.f26281g
            r1.f26293Z = r7
            byte[] r7 = p382w0.C6775b.f26271w
            int r2 = r7.length
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            r3 = 0
            r1.m13777h(r3)
            byte[] r3 = p382w0.C6775b.f26272x
            int r4 = r3.length
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            boolean r7 = java.util.Arrays.equals(r2, r7)
            if (r7 == 0) goto L3b
            r2 = 8
            goto L43
        L3b:
            boolean r7 = java.util.Arrays.equals(r4, r3)
            if (r7 == 0) goto L46
            r2 = 12
        L43:
            r1.m13777h(r2)
        L46:
            r7 = 6
            r6.m13772v(r1, r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.f26279e
            r1 = 7
            r7 = r7[r1]
            java.lang.String r2 = "PreviewImageStart"
            java.lang.Object r7 = r7.get(r2)
            w0.b$c r7 = (p382w0.C6775b.c) r7
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.f26279e
            r1 = r2[r1]
            java.lang.String r2 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r2)
            w0.b$c r1 = (p382w0.C6775b.c) r1
            if (r7 == 0) goto L7a
            if (r1 == 0) goto L7a
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.f26279e
            r3 = 5
            r2 = r2[r3]
            java.lang.String r4 = "JPEGInterchangeFormat"
            r2.put(r4, r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.f26279e
            r7 = r7[r3]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r7.put(r2, r1)
        L7a:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.f26279e
            r1 = 8
            r7 = r7[r1]
            java.lang.String r1 = "AspectFrame"
            java.lang.Object r7 = r7.get(r1)
            w0.b$c r7 = (p382w0.C6775b.c) r7
            if (r7 == 0) goto Lef
            java.nio.ByteOrder r1 = r6.f26281g
            java.lang.Object r7 = r7.m13785h(r1)
            int[] r7 = (int[]) r7
            if (r7 == 0) goto Ld9
            int r1 = r7.length
            r2 = 4
            if (r1 == r2) goto L99
            goto Ld9
        L99:
            r1 = 2
            r2 = r7[r1]
            r3 = 0
            r4 = r7[r3]
            if (r2 <= r4) goto Lef
            r2 = 3
            r4 = r7[r2]
            r5 = r7[r0]
            if (r4 <= r5) goto Lef
            r1 = r7[r1]
            r4 = r7[r3]
            int r1 = r1 - r4
            int r1 = r1 + r0
            r2 = r7[r2]
            r7 = r7[r0]
            int r2 = r2 - r7
            int r2 = r2 + r0
            if (r1 >= r2) goto Lba
            int r1 = r1 + r2
            int r2 = r1 - r2
            int r1 = r1 - r2
        Lba:
            java.nio.ByteOrder r7 = r6.f26281g
            w0.b$c r7 = p382w0.C6775b.c.m13781d(r1, r7)
            java.nio.ByteOrder r0 = r6.f26281g
            w0.b$c r0 = p382w0.C6775b.c.m13781d(r2, r0)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r6.f26279e
            r1 = r1[r3]
            java.lang.String r2 = "ImageWidth"
            r1.put(r2, r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.f26279e
            r7 = r7[r3]
            java.lang.String r1 = "ImageLength"
            r7.put(r1, r0)
            goto Lef
        Ld9:
            java.lang.String r0 = "Invalid aspect frame values. frame="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r7)
        Lef:
            return
    }

    /* renamed from: j */
    public final void m13760j(p382w0.C6775b.b r7) {
            r6 = this;
            boolean r0 = p382w0.C6775b.f26262n
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getPngAttributes starting with: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L1a:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r7.f26293Z = r0
            byte[] r0 = p382w0.C6775b.f26273y
            int r1 = r0.length
            r7.skipBytes(r1)
            int r0 = r0.length
            r1 = 0
            int r0 = r0 + r1
        L27:
            int r2 = r7.readInt()     // Catch: java.io.EOFException -> Ld1
            r3 = 4
            int r0 = r0 + r3
            byte[] r4 = new byte[r3]     // Catch: java.io.EOFException -> Ld1
            int r5 = r7.read(r4)     // Catch: java.io.EOFException -> Ld1
            if (r5 != r3) goto Lc9
            int r0 = r0 + r3
            r3 = 16
            if (r0 != r3) goto L4b
            byte[] r3 = p382w0.C6775b.f26244A     // Catch: java.io.EOFException -> Ld1
            boolean r3 = java.util.Arrays.equals(r4, r3)     // Catch: java.io.EOFException -> Ld1
            if (r3 == 0) goto L43
            goto L4b
        L43:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.io.EOFException -> Ld1
            java.lang.String r0 = "Encountered invalid PNG file--IHDR chunk should appearas the first chunk"
            r7.<init>(r0)     // Catch: java.io.EOFException -> Ld1
            throw r7     // Catch: java.io.EOFException -> Ld1
        L4b:
            byte[] r3 = p382w0.C6775b.f26245B     // Catch: java.io.EOFException -> Ld1
            boolean r3 = java.util.Arrays.equals(r4, r3)     // Catch: java.io.EOFException -> Ld1
            if (r3 == 0) goto L54
            goto L82
        L54:
            byte[] r3 = p382w0.C6775b.f26274z     // Catch: java.io.EOFException -> Ld1
            boolean r3 = java.util.Arrays.equals(r4, r3)     // Catch: java.io.EOFException -> Ld1
            if (r3 == 0) goto Lc1
            byte[] r3 = new byte[r2]     // Catch: java.io.EOFException -> Ld1
            int r5 = r7.read(r3)     // Catch: java.io.EOFException -> Ld1
            if (r5 != r2) goto La6
            int r7 = r7.readInt()     // Catch: java.io.EOFException -> Ld1
            java.util.zip.CRC32 r2 = new java.util.zip.CRC32     // Catch: java.io.EOFException -> Ld1
            r2.<init>()     // Catch: java.io.EOFException -> Ld1
            r2.update(r4)     // Catch: java.io.EOFException -> Ld1
            r2.update(r3)     // Catch: java.io.EOFException -> Ld1
            long r4 = r2.getValue()     // Catch: java.io.EOFException -> Ld1
            int r5 = (int) r4     // Catch: java.io.EOFException -> Ld1
            if (r5 != r7) goto L83
            r6.f26283i = r0     // Catch: java.io.EOFException -> Ld1
            r6.m13771u(r3, r1)     // Catch: java.io.EOFException -> Ld1
            r6.m13752A()     // Catch: java.io.EOFException -> Ld1
        L82:
            return
        L83:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.EOFException -> Ld1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Ld1
            r1.<init>()     // Catch: java.io.EOFException -> Ld1
            java.lang.String r3 = "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "
            r1.append(r3)     // Catch: java.io.EOFException -> Ld1
            r1.append(r7)     // Catch: java.io.EOFException -> Ld1
            java.lang.String r7 = ", calculated CRC value: "
            r1.append(r7)     // Catch: java.io.EOFException -> Ld1
            long r2 = r2.getValue()     // Catch: java.io.EOFException -> Ld1
            r1.append(r2)     // Catch: java.io.EOFException -> Ld1
            java.lang.String r7 = r1.toString()     // Catch: java.io.EOFException -> Ld1
            r0.<init>(r7)     // Catch: java.io.EOFException -> Ld1
            throw r0     // Catch: java.io.EOFException -> Ld1
        La6:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.io.EOFException -> Ld1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Ld1
            r0.<init>()     // Catch: java.io.EOFException -> Ld1
            java.lang.String r1 = "Failed to read given length for given PNG chunk type: "
            r0.append(r1)     // Catch: java.io.EOFException -> Ld1
            java.lang.String r1 = m13749b(r4)     // Catch: java.io.EOFException -> Ld1
            r0.append(r1)     // Catch: java.io.EOFException -> Ld1
            java.lang.String r0 = r0.toString()     // Catch: java.io.EOFException -> Ld1
            r7.<init>(r0)     // Catch: java.io.EOFException -> Ld1
            throw r7     // Catch: java.io.EOFException -> Ld1
        Lc1:
            int r2 = r2 + 4
            r7.skipBytes(r2)     // Catch: java.io.EOFException -> Ld1
            int r0 = r0 + r2
            goto L27
        Lc9:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.io.EOFException -> Ld1
            java.lang.String r0 = "Encountered invalid length while parsing PNG chunktype"
            r7.<init>(r0)     // Catch: java.io.EOFException -> Ld1
            throw r7     // Catch: java.io.EOFException -> Ld1
        Ld1:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "Encountered corrupt PNG file."
            r7.<init>(r0)
            throw r7
    }

    /* renamed from: k */
    public final void m13761k(p382w0.C6775b.b r8) {
            r7 = this;
            r0 = 84
            r8.skipBytes(r0)
            r0 = 4
            byte[] r1 = new byte[r0]
            byte[] r2 = new byte[r0]
            r8.read(r1)
            r8.skipBytes(r0)
            r8.read(r2)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r1)
            int r0 = r0.getInt()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r2)
            int r1 = r1.getInt()
            r2 = 5
            r7.m13757g(r8, r0, r2)
            long r0 = (long) r1
            r8.m13777h(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r8.f26293Z = r0
            int r0 = r8.readInt()
            boolean r1 = p382w0.C6775b.f26262n
            java.lang.String r2 = "ExifInterface"
            if (r1 == 0) goto L4d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "numberOfDirectoryEntry: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L4d:
            r1 = 0
            r3 = 0
        L4f:
            if (r3 >= r0) goto Lac
            int r4 = r8.readUnsignedShort()
            int r5 = r8.readUnsignedShort()
            w0.b$d r6 = p382w0.C6775b.f26252I
            int r6 = r6.f26299a
            if (r4 != r6) goto La6
            short r0 = r8.readShort()
            short r8 = r8.readShort()
            java.nio.ByteOrder r3 = r7.f26281g
            w0.b$c r3 = p382w0.C6775b.c.m13781d(r0, r3)
            java.nio.ByteOrder r4 = r7.f26281g
            w0.b$c r4 = p382w0.C6775b.c.m13781d(r8, r4)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r7.f26279e
            r5 = r5[r1]
            java.lang.String r6 = "ImageLength"
            r5.put(r6, r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r7.f26279e
            r1 = r3[r1]
            java.lang.String r3 = "ImageWidth"
            r1.put(r3, r4)
            boolean r1 = p382w0.C6775b.f26262n
            if (r1 == 0) goto La5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Updated to length: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = ", width: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            android.util.Log.d(r2, r8)
        La5:
            return
        La6:
            r8.skipBytes(r5)
            int r3 = r3 + 1
            goto L4f
        Lac:
            return
    }

    /* renamed from: l */
    public final void m13762l(p382w0.C6775b.b r5) {
            r4 = this;
            int r0 = r5.available()
            r4.m13768r(r5, r0)
            r0 = 0
            r4.m13772v(r5, r0)
            r4.m13775z(r5, r0)
            r0 = 5
            r4.m13775z(r5, r0)
            r0 = 4
            r4.m13775z(r5, r0)
            r4.m13752A()
            int r5 = r4.f26277c
            r0 = 8
            if (r5 != r0) goto L58
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r4.f26279e
            r0 = 1
            r5 = r5[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r5 = r5.get(r1)
            w0.b$c r5 = (p382w0.C6775b.c) r5
            if (r5 == 0) goto L58
            w0.b$b r1 = new w0.b$b
            byte[] r5 = r5.f26298c
            r1.<init>(r5)
            java.nio.ByteOrder r5 = r4.f26281g
            r1.f26293Z = r5
            r2 = 6
            r1.m13777h(r2)
            r5 = 9
            r4.m13772v(r1, r5)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r4.f26279e
            r5 = r1[r5]
            java.lang.String r1 = "ColorSpace"
            java.lang.Object r5 = r5.get(r1)
            w0.b$c r5 = (p382w0.C6775b.c) r5
            if (r5 == 0) goto L58
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r4.f26279e
            r0 = r2[r0]
            r0.put(r1, r5)
        L58:
            return
    }

    /* renamed from: m */
    public final void m13763m(p382w0.C6775b.b r4) {
            r3 = this;
            r3.m13762l(r4)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r3.f26279e
            r1 = 0
            r0 = r0[r1]
            java.lang.String r2 = "JpgFromRaw"
            java.lang.Object r0 = r0.get(r2)
            w0.b$c r0 = (p382w0.C6775b.c) r0
            if (r0 == 0) goto L18
            int r0 = r3.f26287m
            r2 = 5
            r3.m13757g(r4, r0, r2)
        L18:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r3.f26279e
            r4 = r4[r1]
            java.lang.String r0 = "ISO"
            java.lang.Object r4 = r4.get(r0)
            w0.b$c r4 = (p382w0.C6775b.c) r4
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r3.f26279e
            r1 = 1
            r0 = r0[r1]
            java.lang.String r2 = "PhotographicSensitivity"
            java.lang.Object r0 = r0.get(r2)
            w0.b$c r0 = (p382w0.C6775b.c) r0
            if (r4 == 0) goto L3c
            if (r0 != 0) goto L3c
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r3.f26279e
            r0 = r0[r1]
            r0.put(r2, r4)
        L3c:
            return
    }

    /* renamed from: n */
    public final void m13764n(p382w0.C6775b.b r3) {
            r2 = this;
            byte[] r0 = p382w0.C6775b.f26260Q
            int r1 = r0.length
            r3.skipBytes(r1)
            int r1 = r3.available()
            byte[] r1 = new byte[r1]
            r3.readFully(r1)
            int r3 = r0.length
            r2.f26283i = r3
            r3 = 0
            r2.m13771u(r1, r3)
            return
    }

    /* renamed from: o */
    public final void m13765o(p382w0.C6775b.b r6) {
            r5 = this;
            boolean r0 = p382w0.C6775b.f26262n
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getWebpAttributes starting with: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L1a:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r6.f26293Z = r0
            byte[] r0 = p382w0.C6775b.f26246C
            int r0 = r0.length
            r6.skipBytes(r0)
            int r0 = r6.readInt()
            int r0 = r0 + 8
            byte[] r1 = p382w0.C6775b.f26247D
            int r1 = r1.length
            int r1 = r6.skipBytes(r1)
            int r1 = r1 + 8
        L33:
            r2 = 4
            byte[] r3 = new byte[r2]     // Catch: java.io.EOFException -> La2
            int r4 = r6.read(r3)     // Catch: java.io.EOFException -> La2
            if (r4 != r2) goto L9a
            int r1 = r1 + r2
            int r4 = r6.readInt()     // Catch: java.io.EOFException -> La2
            int r1 = r1 + r2
            byte[] r2 = p382w0.C6775b.f26248E     // Catch: java.io.EOFException -> La2
            boolean r2 = java.util.Arrays.equals(r2, r3)     // Catch: java.io.EOFException -> La2
            if (r2 == 0) goto L76
            byte[] r0 = new byte[r4]     // Catch: java.io.EOFException -> La2
            int r6 = r6.read(r0)     // Catch: java.io.EOFException -> La2
            if (r6 != r4) goto L5b
            r5.f26283i = r1     // Catch: java.io.EOFException -> La2
            r6 = 0
            r5.m13771u(r0, r6)     // Catch: java.io.EOFException -> La2
            r5.f26283i = r1     // Catch: java.io.EOFException -> La2
            goto L81
        L5b:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.io.EOFException -> La2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> La2
            r0.<init>()     // Catch: java.io.EOFException -> La2
            java.lang.String r1 = "Failed to read given length for given PNG chunk type: "
            r0.append(r1)     // Catch: java.io.EOFException -> La2
            java.lang.String r1 = m13749b(r3)     // Catch: java.io.EOFException -> La2
            r0.append(r1)     // Catch: java.io.EOFException -> La2
            java.lang.String r0 = r0.toString()     // Catch: java.io.EOFException -> La2
            r6.<init>(r0)     // Catch: java.io.EOFException -> La2
            throw r6     // Catch: java.io.EOFException -> La2
        L76:
            int r2 = r4 % 2
            r3 = 1
            if (r2 != r3) goto L7d
            int r4 = r4 + 1
        L7d:
            int r2 = r1 + r4
            if (r2 != r0) goto L82
        L81:
            return
        L82:
            java.lang.String r3 = "Encountered WebP file with invalid chunk size"
            if (r2 > r0) goto L94
            int r2 = r6.skipBytes(r4)     // Catch: java.io.EOFException -> La2
            if (r2 != r4) goto L8e
            int r1 = r1 + r2
            goto L33
        L8e:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.io.EOFException -> La2
            r6.<init>(r3)     // Catch: java.io.EOFException -> La2
            throw r6     // Catch: java.io.EOFException -> La2
        L94:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.io.EOFException -> La2
            r6.<init>(r3)     // Catch: java.io.EOFException -> La2
            throw r6     // Catch: java.io.EOFException -> La2
        L9a:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.io.EOFException -> La2
            java.lang.String r0 = "Encountered invalid length while parsing WebP chunktype"
            r6.<init>(r0)     // Catch: java.io.EOFException -> La2
            throw r6     // Catch: java.io.EOFException -> La2
        La2:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "Encountered corrupt WebP file."
            r6.<init>(r0)
            throw r6
    }

    /* renamed from: p */
    public final void m13766p(p382w0.C6775b.b r6, java.util.HashMap r7) {
            r5 = this;
            java.lang.String r0 = "JPEGInterchangeFormat"
            java.lang.Object r0 = r7.get(r0)
            w0.b$c r0 = (p382w0.C6775b.c) r0
            java.lang.String r1 = "JPEGInterchangeFormatLength"
            java.lang.Object r7 = r7.get(r1)
            w0.b$c r7 = (p382w0.C6775b.c) r7
            if (r0 == 0) goto L69
            if (r7 == 0) goto L69
            java.nio.ByteOrder r1 = r5.f26281g
            int r0 = r0.m13783f(r1)
            java.nio.ByteOrder r1 = r5.f26281g
            int r7 = r7.m13783f(r1)
            int r1 = r5.f26277c
            r2 = 7
            if (r1 != r2) goto L28
            int r1 = r5.f26284j
            int r0 = r0 + r1
        L28:
            int r1 = r6.f26294a0
            int r1 = r1 - r0
            int r7 = java.lang.Math.min(r7, r1)
            if (r0 <= 0) goto L47
            if (r7 <= 0) goto L47
            int r1 = r5.f26283i
            int r1 = r1 + r0
            android.content.res.AssetManager$AssetInputStream r2 = r5.f26276b
            if (r2 != 0) goto L47
            java.io.FileDescriptor r2 = r5.f26275a
            if (r2 != 0) goto L47
            byte[] r2 = new byte[r7]
            long r3 = (long) r1
            r6.m13777h(r3)
            r6.readFully(r2)
        L47:
            boolean r6 = p382w0.C6775b.f26262n
            if (r6 == 0) goto L69
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Setting thumbnail attributes with offset: "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = ", length: "
            r6.append(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "ExifInterface"
            android.util.Log.d(r7, r6)
        L69:
            return
    }

    /* renamed from: q */
    public final boolean m13767q(java.util.HashMap r3) {
            r2 = this;
            java.lang.String r0 = "ImageLength"
            java.lang.Object r0 = r3.get(r0)
            w0.b$c r0 = (p382w0.C6775b.c) r0
            java.lang.String r1 = "ImageWidth"
            java.lang.Object r3 = r3.get(r1)
            w0.b$c r3 = (p382w0.C6775b.c) r3
            if (r0 == 0) goto L28
            if (r3 == 0) goto L28
            java.nio.ByteOrder r1 = r2.f26281g
            int r0 = r0.m13783f(r1)
            java.nio.ByteOrder r1 = r2.f26281g
            int r3 = r3.m13783f(r1)
            r1 = 512(0x200, float:7.17E-43)
            if (r0 > r1) goto L28
            if (r3 > r1) goto L28
            r3 = 1
            return r3
        L28:
            r3 = 0
            return r3
    }

    /* renamed from: r */
    public final void m13768r(p382w0.C6775b.b r4, int r5) {
            r3 = this;
            java.nio.ByteOrder r0 = r3.m13770t(r4)
            r3.f26281g = r0
            r4.f26293Z = r0
            int r0 = r4.readUnsignedShort()
            int r1 = r3.f26277c
            r2 = 7
            if (r1 == r2) goto L31
            r2 = 10
            if (r1 == r2) goto L31
            r1 = 42
            if (r0 != r1) goto L1a
            goto L31
        L1a:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Invalid start code: "
            java.lang.StringBuilder r5 = android.support.v4.media.C0144c.m256a(r5)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L31:
            int r0 = r4.readInt()
            r1 = 8
            if (r0 < r1) goto L53
            if (r0 >= r5) goto L53
            int r0 = r0 + (-8)
            if (r0 <= 0) goto L52
            int r4 = r4.skipBytes(r0)
            if (r4 != r0) goto L46
            goto L52
        L46:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Couldn't jump to first Ifd: "
            java.lang.String r5 = android.support.v4.media.C0142a.m254a(r5, r0)
            r4.<init>(r5)
            throw r4
        L52:
            return
        L53:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Invalid first Ifd offset: "
            java.lang.String r5 = android.support.v4.media.C0142a.m254a(r5, r0)
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: s */
    public final void m13769s() {
            r6 = this;
            r0 = 0
        L1:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r6.f26279e
            int r1 = r1.length
            if (r0 >= r1) goto L79
            java.lang.String r1 = "The size of tag group["
            java.lang.String r2 = "]: "
            java.lang.StringBuilder r1 = androidx.appcompat.widget.C0300r0.m777a(r1, r0, r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.f26279e
            r2 = r2[r0]
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ExifInterface"
            android.util.Log.d(r2, r1)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r6.f26279e
            r1 = r1[r0]
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L76
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            w0.b$c r4 = (p382w0.C6775b.c) r4
            java.lang.String r5 = "tagName: "
            java.lang.StringBuilder r5 = android.support.v4.media.C0144c.m256a(r5)
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r5.append(r3)
            java.lang.String r3 = ", tagType: "
            r5.append(r3)
            java.lang.String r3 = r4.toString()
            r5.append(r3)
            java.lang.String r3 = ", tagValue: '"
            r5.append(r3)
            java.nio.ByteOrder r3 = r6.f26281g
            java.lang.String r3 = r4.m13784g(r3)
            r5.append(r3)
            java.lang.String r3 = "'"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.d(r2, r3)
            goto L2e
        L76:
            int r0 = r0 + 1
            goto L1
        L79:
            return
    }

    /* renamed from: t */
    public final java.nio.ByteOrder m13770t(p382w0.C6775b.b r3) {
            r2 = this;
            short r3 = r3.readShort()
            r0 = 18761(0x4949, float:2.629E-41)
            java.lang.String r1 = "ExifInterface"
            if (r3 == r0) goto L31
            r0 = 19789(0x4d4d, float:2.773E-41)
            if (r3 != r0) goto L1a
            boolean r3 = p382w0.C6775b.f26262n
            if (r3 == 0) goto L17
            java.lang.String r3 = "readExifSegment: Byte Align MM"
            android.util.Log.d(r1, r3)
        L17:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            return r3
        L1a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Invalid byte order: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L31:
            boolean r3 = p382w0.C6775b.f26262n
            if (r3 == 0) goto L3a
            java.lang.String r3 = "readExifSegment: Byte Align II"
            android.util.Log.d(r1, r3)
        L3a:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            return r3
    }

    /* renamed from: u */
    public final void m13771u(byte[] r2, int r3) {
            r1 = this;
            w0.b$b r0 = new w0.b$b
            r0.<init>(r2)
            int r2 = r2.length
            r1.m13768r(r0, r2)
            r1.m13772v(r0, r3)
            return
    }

    /* renamed from: v */
    public final void m13772v(p382w0.C6775b.b r24, int r25) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.util.Set<java.lang.Integer> r3 = r0.f26280f
            int r4 = r1.f26295b0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f26295b0
            int r3 = r3 + 2
            int r4 = r1.f26294a0
            if (r3 <= r4) goto L1a
            return
        L1a:
            short r3 = r24.readShort()
            boolean r4 = p382w0.C6775b.f26262n
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L38:
            int r4 = r1.f26295b0
            int r6 = r3 * 12
            int r6 = r6 + r4
            int r4 = r1.f26294a0
            if (r6 > r4) goto L404
            if (r3 > 0) goto L45
            goto L404
        L45:
            r4 = 0
            r6 = 0
        L47:
            r7 = 5
            if (r6 >= r3) goto L38a
            int r8 = r24.readUnsignedShort()
            int r9 = r24.readUnsignedShort()
            int r12 = r24.readInt()
            int r10 = r1.f26295b0
            long r10 = (long) r10
            r13 = 4
            long r10 = r10 + r13
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r15 = p382w0.C6775b.f26255L
            r15 = r15[r2]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            java.lang.Object r13 = r15.get(r13)
            r15 = r13
            w0.b$d r15 = (p382w0.C6775b.d) r15
            boolean r13 = p382w0.C6775b.f26262n
            r14 = 3
            if (r13 == 0) goto La0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r25)
            r7[r4] = r18
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r18 = 1
            r7[r18] = r4
            if (r15 == 0) goto L85
            java.lang.String r4 = r15.f26300b
            goto L86
        L85:
            r4 = 0
        L86:
            r18 = 2
            r7[r18] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r7[r14] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r14 = 4
            r7[r14] = r4
            java.lang.String r4 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r4 = java.lang.String.format(r4, r7)
            android.util.Log.d(r5, r4)
        La0:
            r4 = 7
            if (r15 != 0) goto Lbd
            if (r13 == 0) goto Lb9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Skip the tag entry since tag number is not defined: "
            r4.append(r7)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        Lb9:
            r18 = r3
            goto L11c
        Lbd:
            if (r9 <= 0) goto L153
            int[] r7 = p382w0.C6775b.f26250G
            int r14 = r7.length
            if (r9 < r14) goto Lc6
            goto L153
        Lc6:
            int r14 = r15.f26301c
            if (r14 == r4) goto Lf7
            if (r9 != r4) goto Lcd
            goto Lf7
        Lcd:
            if (r14 == r9) goto Lf7
            int r4 = r15.f26302d
            if (r4 != r9) goto Ld4
            goto Lf7
        Ld4:
            r18 = r3
            r3 = 4
            if (r14 == r3) goto Ldb
            if (r4 != r3) goto Ldf
        Ldb:
            r3 = 3
            if (r9 != r3) goto Ldf
            goto Lf9
        Ldf:
            r3 = 9
            if (r14 == r3) goto Le5
            if (r4 != r3) goto Lea
        Le5:
            r3 = 8
            if (r9 != r3) goto Lea
            goto Lf9
        Lea:
            r3 = 12
            if (r14 == r3) goto Lf0
            if (r4 != r3) goto Lf5
        Lf0:
            r3 = 11
            if (r9 != r3) goto Lf5
            goto Lf9
        Lf5:
            r3 = 0
            goto Lfa
        Lf7:
            r18 = r3
        Lf9:
            r3 = 1
        Lfa:
            if (r3 != 0) goto L11f
            if (r13 == 0) goto L11c
            java.lang.String r3 = "Skip the tag entry since data format ("
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            java.lang.String[] r4 = p382w0.C6775b.f26249F
            r4 = r4[r9]
            r3.append(r4)
            java.lang.String r4 = ") is unexpected for tag: "
            r3.append(r4)
            java.lang.String r4 = r15.f26300b
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L11c:
            r19 = r6
            goto L16d
        L11f:
            r3 = 7
            if (r9 != r3) goto L123
            r9 = r14
        L123:
            long r3 = (long) r12
            r7 = r7[r9]
            r19 = r6
            long r6 = (long) r7
            long r3 = r3 * r6
            r6 = 0
            int r14 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r14 < 0) goto L13b
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r14 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r14 <= 0) goto L139
            goto L13b
        L139:
            r6 = 1
            goto L170
        L13b:
            if (r13 == 0) goto L151
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since the number of components is invalid: "
            r6.append(r7)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L151:
            r6 = 0
            goto L170
        L153:
            r18 = r3
            r19 = r6
            if (r13 == 0) goto L16d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L16d:
            r6 = 0
            r3 = 0
        L170:
            if (r6 != 0) goto L177
        L172:
            r1.m13777h(r10)
            goto L380
        L177:
            java.lang.String r6 = "Compression"
            r16 = 4
            int r7 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r7 <= 0) goto L23d
            int r7 = r24.readInt()
            if (r13 == 0) goto L19c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r16 = r9
            java.lang.String r9 = "seek to data offset: "
            r14.append(r9)
            r14.append(r7)
            java.lang.String r9 = r14.toString()
            android.util.Log.d(r5, r9)
            goto L19e
        L19c:
            r16 = r9
        L19e:
            int r9 = r0.f26277c
            r14 = 7
            if (r9 != r14) goto L1fc
            java.lang.String r9 = r15.f26300b
            java.lang.String r14 = "MakerNote"
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L1b0
            r0.f26284j = r7
            goto L1f8
        L1b0:
            r9 = 6
            if (r2 != r9) goto L1f8
            java.lang.String r9 = r15.f26300b
            java.lang.String r14 = "ThumbnailImage"
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L1f8
            r0.f26285k = r7
            r0.f26286l = r12
            java.nio.ByteOrder r9 = r0.f26281g
            r14 = 6
            w0.b$c r9 = p382w0.C6775b.c.m13781d(r14, r9)
            int r14 = r0.f26285k
            r20 = r10
            long r10 = (long) r14
            java.nio.ByteOrder r14 = r0.f26281g
            w0.b$c r10 = p382w0.C6775b.c.m13779b(r10, r14)
            int r11 = r0.f26286l
            r14 = r12
            long r11 = (long) r11
            java.nio.ByteOrder r2 = r0.f26281g
            w0.b$c r2 = p382w0.C6775b.c.m13779b(r11, r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r11 = r0.f26279e
            r12 = 4
            r11 = r11[r12]
            r11.put(r6, r9)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.f26279e
            r9 = r9[r12]
            java.lang.String r11 = "JPEGInterchangeFormat"
            r9.put(r11, r10)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.f26279e
            r9 = r9[r12]
            java.lang.String r10 = "JPEGInterchangeFormatLength"
            r9.put(r10, r2)
            goto L20f
        L1f8:
            r20 = r10
            r14 = r12
            goto L20f
        L1fc:
            r20 = r10
            r14 = r12
            r2 = 10
            if (r9 != r2) goto L20f
            java.lang.String r2 = r15.f26300b
            java.lang.String r9 = "JpgFromRaw"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L20f
            r0.f26287m = r7
        L20f:
            long r9 = (long) r7
            long r11 = r9 + r3
            int r2 = r1.f26294a0
            r22 = r14
            r17 = r15
            long r14 = (long) r2
            int r2 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r2 > 0) goto L223
            r1.m13777h(r9)
            r10 = r20
            goto L243
        L223:
            if (r13 == 0) goto L239
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L239:
            r10 = r20
            goto L172
        L23d:
            r16 = r9
            r22 = r12
            r17 = r15
        L243:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = p382w0.C6775b.f26258O
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.Object r2 = r2.get(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r13 == 0) goto L26d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "nextIfdType: "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r8 = " byteCount: "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
        L26d:
            if (r2 == 0) goto L30a
            r3 = -1
            r6 = 3
            r9 = r16
            if (r9 == r6) goto L295
            r6 = 4
            if (r9 == r6) goto L290
            r6 = 8
            if (r9 == r6) goto L28b
            r6 = 9
            if (r9 == r6) goto L286
            r6 = 13
            if (r9 == r6) goto L286
            goto L29a
        L286:
            int r3 = r24.readInt()
            goto L299
        L28b:
            short r3 = r24.readShort()
            goto L299
        L290:
            long r3 = r24.m13776a()
            goto L29a
        L295:
            int r3 = r24.readUnsignedShort()
        L299:
            long r3 = (long) r3
        L29a:
            r6 = 2
            if (r13 == 0) goto L2b6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            r8 = 0
            r6[r8] = r7
            r7 = r17
            java.lang.String r7 = r7.f26300b
            r8 = 1
            r6[r8] = r7
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.d(r5, r6)
        L2b6:
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L2fc
            int r6 = r1.f26294a0
            long r6 = (long) r6
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 >= 0) goto L2fc
            java.util.Set<java.lang.Integer> r6 = r0.f26280f
            int r7 = (int) r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L2db
            r1.m13777h(r3)
            int r2 = r2.intValue()
            r0.m13772v(r1, r2)
            goto L307
        L2db:
            if (r13 == 0) goto L307
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = " (at "
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = ")"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            goto L304
        L2fc:
            if (r13 == 0) goto L307
            java.lang.String r2 = "Skip jump into the IFD since its offset is invalid: "
            java.lang.String r2 = p382w0.C6774a.m13748a(r2, r3)
        L304:
            android.util.Log.d(r5, r2)
        L307:
            r7 = r10
            goto L37d
        L30a:
            r9 = r16
            r7 = r17
            int r2 = r1.f26295b0
            int r8 = r0.f26283i
            int r2 = r2 + r8
            int r4 = (int) r3
            byte[] r15 = new byte[r4]
            r1.readFully(r15)
            w0.b$c r3 = new w0.b$c
            long r13 = (long) r2
            r11 = r10
            r10 = r3
            r7 = r11
            r11 = r9
            r12 = r22
            r2 = r17
            r10.<init>(r11, r12, r13, r15)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.f26279e
            r4 = r4[r25]
            java.lang.String r9 = r2.f26300b
            r4.put(r9, r3)
            java.lang.String r4 = r2.f26300b
            java.lang.String r9 = "DNGVersion"
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L33d
            r4 = 3
            r0.f26277c = r4
        L33d:
            java.lang.String r4 = r2.f26300b
            java.lang.String r9 = "Make"
            boolean r4 = r9.equals(r4)
            if (r4 != 0) goto L351
            java.lang.String r4 = r2.f26300b
            java.lang.String r9 = "Model"
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L35f
        L351:
            java.nio.ByteOrder r4 = r0.f26281g
            java.lang.String r4 = r3.m13784g(r4)
            java.lang.String r9 = "PENTAX"
            boolean r4 = r4.contains(r9)
            if (r4 != 0) goto L372
        L35f:
            java.lang.String r2 = r2.f26300b
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L376
            java.nio.ByteOrder r2 = r0.f26281g
            int r2 = r3.m13783f(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L376
        L372:
            r2 = 8
            r0.f26277c = r2
        L376:
            int r2 = r1.f26295b0
            long r2 = (long) r2
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L380
        L37d:
            r1.m13777h(r7)
        L380:
            int r6 = r19 + 1
            short r6 = (short) r6
            r4 = 0
            r2 = r25
            r3 = r18
            goto L47
        L38a:
            int r2 = r1.f26295b0
            int r2 = r2 + 4
            int r3 = r1.f26294a0
            if (r2 > r3) goto L404
            int r2 = r24.readInt()
            boolean r3 = p382w0.C6775b.f26262n
            if (r3 == 0) goto L3ad
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r4[r8] = r6
            java.lang.String r6 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r6, r4)
            android.util.Log.d(r5, r4)
        L3ad:
            long r8 = (long) r2
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L3ee
            int r4 = r1.f26294a0
            if (r2 >= r4) goto L3ee
            java.util.Set<java.lang.Integer> r4 = r0.f26280f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.contains(r6)
            if (r4 != 0) goto L3e4
            r1.m13777h(r8)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.f26279e
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L3d6
            r0.m13772v(r1, r3)
            goto L404
        L3d6:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.f26279e
            r2 = r2[r7]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L404
            r0.m13772v(r1, r7)
            goto L404
        L3e4:
            if (r3 == 0) goto L404
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            goto L3f7
        L3ee:
            if (r3 == 0) goto L404
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
        L3f7:
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
        L404:
            return
    }

    /* renamed from: w */
    public final void m13773w(p382w0.C6775b.b r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.f26279e
            r3 = 4
            r2 = r2[r3]
            java.lang.String r3 = "Compression"
            java.lang.Object r3 = r2.get(r3)
            w0.b$c r3 = (p382w0.C6775b.c) r3
            if (r3 == 0) goto L10a
            java.nio.ByteOrder r4 = r0.f26281g
            int r3 = r3.m13783f(r4)
            r4 = 1
            r5 = 6
            if (r3 == r4) goto L24
            if (r3 == r5) goto L10a
            r6 = 7
            if (r3 == r6) goto L24
            goto L10d
        L24:
            java.lang.String r3 = "BitsPerSample"
            java.lang.Object r3 = r2.get(r3)
            w0.b$c r3 = (p382w0.C6775b.c) r3
            java.lang.String r6 = "ExifInterface"
            r7 = 0
            if (r3 == 0) goto L6b
            java.nio.ByteOrder r8 = r0.f26281g
            java.lang.Object r3 = r3.m13785h(r8)
            int[] r3 = (int[]) r3
            int[] r8 = p382w0.C6775b.f26265q
            boolean r9 = java.util.Arrays.equals(r8, r3)
            if (r9 == 0) goto L42
            goto L69
        L42:
            int r9 = r0.f26277c
            r10 = 3
            if (r9 != r10) goto L6b
            java.lang.String r9 = "PhotometricInterpretation"
            java.lang.Object r9 = r2.get(r9)
            w0.b$c r9 = (p382w0.C6775b.c) r9
            if (r9 == 0) goto L6b
            java.nio.ByteOrder r10 = r0.f26281g
            int r9 = r9.m13783f(r10)
            if (r9 != r4) goto L61
            int[] r10 = p382w0.C6775b.f26266r
            boolean r10 = java.util.Arrays.equals(r3, r10)
            if (r10 != 0) goto L69
        L61:
            if (r9 != r5) goto L6b
            boolean r3 = java.util.Arrays.equals(r3, r8)
            if (r3 == 0) goto L6b
        L69:
            r3 = 1
            goto L75
        L6b:
            boolean r3 = p382w0.C6775b.f26262n
            if (r3 == 0) goto L74
            java.lang.String r3 = "Unsupported data type value"
            android.util.Log.d(r6, r3)
        L74:
            r3 = 0
        L75:
            if (r3 == 0) goto L10d
            java.lang.String r3 = "StripOffsets"
            java.lang.Object r3 = r2.get(r3)
            w0.b$c r3 = (p382w0.C6775b.c) r3
            java.lang.String r5 = "StripByteCounts"
            java.lang.Object r2 = r2.get(r5)
            w0.b$c r2 = (p382w0.C6775b.c) r2
            if (r3 == 0) goto L10d
            if (r2 == 0) goto L10d
            java.nio.ByteOrder r5 = r0.f26281g
            java.lang.Object r3 = r3.m13785h(r5)
            long[] r3 = m13750c(r3)
            java.nio.ByteOrder r5 = r0.f26281g
            java.lang.Object r2 = r2.m13785h(r5)
            long[] r2 = m13750c(r2)
            if (r3 == 0) goto L104
            int r5 = r3.length
            if (r5 != 0) goto La5
            goto L104
        La5:
            if (r2 == 0) goto L101
            int r5 = r2.length
            if (r5 != 0) goto Lab
            goto L101
        Lab:
            int r5 = r3.length
            int r8 = r2.length
            if (r5 == r8) goto Lb2
            java.lang.String r1 = "stripOffsets and stripByteCounts should have same length."
            goto L106
        Lb2:
            r8 = 0
            int r5 = r2.length
            r10 = 0
        Lb6:
            if (r10 >= r5) goto Lbe
            r11 = r2[r10]
            long r8 = r8 + r11
            int r10 = r10 + 1
            goto Lb6
        Lbe:
            int r5 = (int) r8
            byte[] r5 = new byte[r5]
            r0.f26282h = r4
            r8 = 0
            r9 = 0
            r10 = 0
        Lc6:
            int r11 = r3.length
            if (r8 >= r11) goto Lfa
            r11 = r3[r8]
            int r12 = (int) r11
            r13 = r2[r8]
            int r11 = (int) r13
            int r13 = r3.length
            int r13 = r13 - r4
            if (r8 >= r13) goto Le0
            int r13 = r12 + r11
            long r13 = (long) r13
            int r15 = r8 + 1
            r15 = r3[r15]
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto Le0
            r0.f26282h = r7
        Le0:
            int r12 = r12 - r9
            if (r12 >= 0) goto Le8
            java.lang.String r13 = "Invalid strip offset value"
            android.util.Log.d(r6, r13)
        Le8:
            long r13 = (long) r12
            r1.m13777h(r13)
            int r9 = r9 + r12
            byte[] r12 = new byte[r11]
            r1.read(r12)
            int r9 = r9 + r11
            java.lang.System.arraycopy(r12, r7, r5, r10, r11)
            int r10 = r10 + r11
            int r8 = r8 + 1
            goto Lc6
        Lfa:
            boolean r1 = r0.f26282h
            if (r1 == 0) goto L10d
            r1 = r3[r7]
            goto L10d
        L101:
            java.lang.String r1 = "stripByteCounts should not be null or have zero length."
            goto L106
        L104:
            java.lang.String r1 = "stripOffsets should not be null or have zero length."
        L106:
            android.util.Log.w(r6, r1)
            goto L10d
        L10a:
            r0.m13766p(r1, r2)
        L10d:
            return
    }

    /* renamed from: y */
    public final void m13774y(int r7, int r8) {
            r6 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r6.f26279e
            r0 = r0[r7]
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "ExifInterface"
            if (r0 != 0) goto L86
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r6.f26279e
            r0 = r0[r8]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            goto L86
        L18:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r6.f26279e
            r0 = r0[r7]
            java.lang.String r2 = "ImageLength"
            java.lang.Object r0 = r0.get(r2)
            w0.b$c r0 = (p382w0.C6775b.c) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r6.f26279e
            r3 = r3[r7]
            java.lang.String r4 = "ImageWidth"
            java.lang.Object r3 = r3.get(r4)
            w0.b$c r3 = (p382w0.C6775b.c) r3
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r6.f26279e
            r5 = r5[r8]
            java.lang.Object r2 = r5.get(r2)
            w0.b$c r2 = (p382w0.C6775b.c) r2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r6.f26279e
            r5 = r5[r8]
            java.lang.Object r4 = r5.get(r4)
            w0.b$c r4 = (p382w0.C6775b.c) r4
            if (r0 == 0) goto L7c
            if (r3 != 0) goto L49
            goto L7c
        L49:
            if (r2 == 0) goto L75
            if (r4 != 0) goto L4e
            goto L75
        L4e:
            java.nio.ByteOrder r1 = r6.f26281g
            int r0 = r0.m13783f(r1)
            java.nio.ByteOrder r1 = r6.f26281g
            int r1 = r3.m13783f(r1)
            java.nio.ByteOrder r3 = r6.f26281g
            int r2 = r2.m13783f(r3)
            java.nio.ByteOrder r3 = r6.f26281g
            int r3 = r4.m13783f(r3)
            if (r0 >= r2) goto L85
            if (r1 >= r3) goto L85
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r6.f26279e
            r1 = r0[r7]
            r2 = r0[r8]
            r0[r7] = r2
            r0[r8] = r1
            goto L85
        L75:
            boolean r7 = p382w0.C6775b.f26262n
            if (r7 == 0) goto L85
            java.lang.String r7 = "Second image does not contain valid size information"
            goto L82
        L7c:
            boolean r7 = p382w0.C6775b.f26262n
            if (r7 == 0) goto L85
            java.lang.String r7 = "First image does not contain valid size information"
        L82:
            android.util.Log.d(r1, r7)
        L85:
            return
        L86:
            boolean r7 = p382w0.C6775b.f26262n
            if (r7 == 0) goto L8f
            java.lang.String r7 = "Cannot perform swap since only one image data exists"
            android.util.Log.d(r1, r7)
        L8f:
            return
    }

    /* renamed from: z */
    public final void m13775z(p382w0.C6775b.b r9, int r10) {
            r8 = this;
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r8.f26279e
            r0 = r0[r10]
            java.lang.String r1 = "DefaultCropSize"
            java.lang.Object r0 = r0.get(r1)
            w0.b$c r0 = (p382w0.C6775b.c) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r8.f26279e
            r1 = r1[r10]
            java.lang.String r2 = "SensorTopBorder"
            java.lang.Object r1 = r1.get(r2)
            w0.b$c r1 = (p382w0.C6775b.c) r1
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r8.f26279e
            r2 = r2[r10]
            java.lang.String r3 = "SensorLeftBorder"
            java.lang.Object r2 = r2.get(r3)
            w0.b$c r2 = (p382w0.C6775b.c) r2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r8.f26279e
            r3 = r3[r10]
            java.lang.String r4 = "SensorBottomBorder"
            java.lang.Object r3 = r3.get(r4)
            w0.b$c r3 = (p382w0.C6775b.c) r3
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r8.f26279e
            r4 = r4[r10]
            java.lang.String r5 = "SensorRightBorder"
            java.lang.Object r4 = r4.get(r5)
            w0.b$c r4 = (p382w0.C6775b.c) r4
            java.lang.String r5 = "ImageWidth"
            java.lang.String r6 = "ImageLength"
            if (r0 == 0) goto Lb7
            int r9 = r0.f26296a
            r1 = 5
            r2 = 1
            r3 = 0
            r4 = 2
            java.lang.String r7 = "Invalid crop size values. cropSize="
            if (r9 != r1) goto L74
            java.nio.ByteOrder r9 = r8.f26281g
            java.lang.Object r9 = r0.m13785h(r9)
            w0.b$e[] r9 = (p382w0.C6775b.e[]) r9
            if (r9 == 0) goto L6b
            int r0 = r9.length
            if (r0 == r4) goto L5a
            goto L6b
        L5a:
            r0 = r9[r3]
            java.nio.ByteOrder r1 = r8.f26281g
            w0.b$c r0 = p382w0.C6775b.c.m13780c(r0, r1)
            r9 = r9[r2]
            java.nio.ByteOrder r1 = r8.f26281g
            w0.b$c r9 = p382w0.C6775b.c.m13780c(r9, r1)
            goto L92
        L6b:
            java.lang.StringBuilder r10 = android.support.v4.media.C0144c.m256a(r7)
            java.lang.String r9 = java.util.Arrays.toString(r9)
            goto Laa
        L74:
            java.nio.ByteOrder r9 = r8.f26281g
            java.lang.Object r9 = r0.m13785h(r9)
            int[] r9 = (int[]) r9
            if (r9 == 0) goto La2
            int r0 = r9.length
            if (r0 == r4) goto L82
            goto La2
        L82:
            r0 = r9[r3]
            java.nio.ByteOrder r1 = r8.f26281g
            w0.b$c r0 = p382w0.C6775b.c.m13781d(r0, r1)
            r9 = r9[r2]
            java.nio.ByteOrder r1 = r8.f26281g
            w0.b$c r9 = p382w0.C6775b.c.m13781d(r9, r1)
        L92:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r8.f26279e
            r1 = r1[r10]
            r1.put(r5, r0)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r8.f26279e
            r10 = r0[r10]
            r10.put(r6, r9)
            goto L127
        La2:
            java.lang.StringBuilder r10 = android.support.v4.media.C0144c.m256a(r7)
            java.lang.String r9 = java.util.Arrays.toString(r9)
        Laa:
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "ExifInterface"
            android.util.Log.w(r10, r9)
            return
        Lb7:
            if (r1 == 0) goto Lf8
            if (r2 == 0) goto Lf8
            if (r3 == 0) goto Lf8
            if (r4 == 0) goto Lf8
            java.nio.ByteOrder r9 = r8.f26281g
            int r9 = r1.m13783f(r9)
            java.nio.ByteOrder r0 = r8.f26281g
            int r0 = r3.m13783f(r0)
            java.nio.ByteOrder r1 = r8.f26281g
            int r1 = r4.m13783f(r1)
            java.nio.ByteOrder r3 = r8.f26281g
            int r2 = r2.m13783f(r3)
            if (r0 <= r9) goto L127
            if (r1 <= r2) goto L127
            int r0 = r0 - r9
            int r1 = r1 - r2
            java.nio.ByteOrder r9 = r8.f26281g
            w0.b$c r9 = p382w0.C6775b.c.m13781d(r0, r9)
            java.nio.ByteOrder r0 = r8.f26281g
            w0.b$c r0 = p382w0.C6775b.c.m13781d(r1, r0)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r8.f26279e
            r1 = r1[r10]
            r1.put(r6, r9)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r8.f26279e
            r9 = r9[r10]
            r9.put(r5, r0)
            goto L127
        Lf8:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r8.f26279e
            r0 = r0[r10]
            java.lang.Object r0 = r0.get(r6)
            w0.b$c r0 = (p382w0.C6775b.c) r0
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r8.f26279e
            r1 = r1[r10]
            java.lang.Object r1 = r1.get(r5)
            w0.b$c r1 = (p382w0.C6775b.c) r1
            if (r0 == 0) goto L110
            if (r1 != 0) goto L127
        L110:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r8.f26279e
            r0 = r0[r10]
            java.lang.String r1 = "JPEGInterchangeFormat"
            java.lang.Object r0 = r0.get(r1)
            w0.b$c r0 = (p382w0.C6775b.c) r0
            if (r0 == 0) goto L127
            java.nio.ByteOrder r1 = r8.f26281g
            int r0 = r0.m13783f(r1)
            r8.m13757g(r9, r0, r10)
        L127:
            return
    }
}
