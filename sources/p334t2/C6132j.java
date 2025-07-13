package p334t2;

/* renamed from: t2.j */
/* loaded from: classes.dex */
public final class C6132j implements com.bumptech.glide.load.ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f23670a = null;

    /* renamed from: b */
    public static final int[] f23671b = null;

    /* renamed from: t2.j$a */
    public static final class a implements p334t2.C6132j.c {

        /* renamed from: a */
        public final java.nio.ByteBuffer f23672a;

        public a(java.nio.ByteBuffer r2) {
                r1 = this;
                r1.<init>()
                r1.f23672a = r2
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                r2.order(r0)
                return
        }

        @Override // p334t2.C6132j.c
        /* renamed from: a */
        public int mo12659a(byte[] r3, int r4) {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.f23672a
                int r0 = r0.remaining()
                int r4 = java.lang.Math.min(r4, r0)
                if (r4 != 0) goto Le
                r3 = -1
                return r3
            Le:
                java.nio.ByteBuffer r0 = r2.f23672a
                r1 = 0
                r0.get(r3, r1, r4)
                return r4
        }

        @Override // p334t2.C6132j.c
        /* renamed from: b */
        public long mo12660b(long r3) {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.f23672a
                int r0 = r0.remaining()
                long r0 = (long) r0
                long r3 = java.lang.Math.min(r0, r3)
                int r4 = (int) r3
                java.nio.ByteBuffer r3 = r2.f23672a
                int r0 = r3.position()
                int r0 = r0 + r4
                r3.position(r0)
                long r3 = (long) r4
                return r3
        }

        @Override // p334t2.C6132j.c
        /* renamed from: c */
        public short mo12661c() {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.f23672a
                int r0 = r0.remaining()
                r1 = 1
                if (r0 < r1) goto L13
                java.nio.ByteBuffer r0 = r2.f23672a
                byte r0 = r0.get()
                r0 = r0 & 255(0xff, float:3.57E-43)
                short r0 = (short) r0
                return r0
            L13:
                t2.j$c$a r0 = new t2.j$c$a
                r0.<init>()
                throw r0
        }

        @Override // p334t2.C6132j.c
        /* renamed from: d */
        public int mo12662d() {
                r2 = this;
                short r0 = r2.mo12661c()
                int r0 = r0 << 8
                short r1 = r2.mo12661c()
                r0 = r0 | r1
                return r0
        }
    }

    /* renamed from: t2.j$b */
    public static final class b {

        /* renamed from: a */
        public final java.nio.ByteBuffer f23673a;

        public b(byte[] r2, int r3) {
                r1 = this;
                r1.<init>()
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                java.nio.ByteBuffer r2 = r2.order(r0)
                java.nio.Buffer r2 = r2.limit(r3)
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
                r1.f23673a = r2
                return
        }

        /* renamed from: a */
        public short m12663a(int r3) {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.f23673a
                int r0 = r0.remaining()
                int r0 = r0 - r3
                r1 = 2
                if (r0 < r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                if (r0 == 0) goto L16
                java.nio.ByteBuffer r0 = r2.f23673a
                short r3 = r0.getShort(r3)
                goto L17
            L16:
                r3 = -1
            L17:
                return r3
        }

        /* renamed from: b */
        public int m12664b(int r3) {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.f23673a
                int r0 = r0.remaining()
                int r0 = r0 - r3
                r1 = 4
                if (r0 < r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                if (r0 == 0) goto L16
                java.nio.ByteBuffer r0 = r2.f23673a
                int r3 = r0.getInt(r3)
                goto L17
            L16:
                r3 = -1
            L17:
                return r3
        }
    }

    /* renamed from: t2.j$c */
    public interface c {

        /* renamed from: t2.j$c$a */
        public static final class a extends java.io.IOException {
            public a() {
                    r1 = this;
                    java.lang.String r0 = "Unexpectedly reached end of a file"
                    r1.<init>(r0)
                    return
            }
        }

        /* renamed from: a */
        int mo12659a(byte[] r1, int r2);

        /* renamed from: b */
        long mo12660b(long r1);

        /* renamed from: c */
        short mo12661c();

        /* renamed from: d */
        int mo12662d();
    }

    /* renamed from: t2.j$d */
    public static final class d implements p334t2.C6132j.c {

        /* renamed from: a */
        public final java.io.InputStream f23674a;

        public d(java.io.InputStream r1) {
                r0 = this;
                r0.<init>()
                r0.f23674a = r1
                return
        }

        @Override // p334t2.C6132j.c
        /* renamed from: a */
        public int mo12659a(byte[] r5, int r6) {
                r4 = this;
                r0 = 0
                r1 = 0
            L2:
                r2 = -1
                if (r0 >= r6) goto L11
                java.io.InputStream r1 = r4.f23674a
                int r3 = r6 - r0
                int r1 = r1.read(r5, r0, r3)
                if (r1 == r2) goto L11
                int r0 = r0 + r1
                goto L2
            L11:
                if (r0 != 0) goto L1c
                if (r1 == r2) goto L16
                goto L1c
            L16:
                t2.j$c$a r5 = new t2.j$c$a
                r5.<init>()
                throw r5
            L1c:
                return r0
        }

        @Override // p334t2.C6132j.c
        /* renamed from: b */
        public long mo12660b(long r8) {
                r7 = this;
                r0 = 0
                int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r2 >= 0) goto L7
                return r0
            L7:
                r2 = r8
            L8:
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 <= 0) goto L25
                java.io.InputStream r4 = r7.f23674a
                long r4 = r4.skip(r2)
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 <= 0) goto L18
            L16:
                long r2 = r2 - r4
                goto L8
            L18:
                java.io.InputStream r4 = r7.f23674a
                int r4 = r4.read()
                r5 = -1
                if (r4 != r5) goto L22
                goto L25
            L22:
                r4 = 1
                goto L16
            L25:
                long r8 = r8 - r2
                return r8
        }

        @Override // p334t2.C6132j.c
        /* renamed from: c */
        public short mo12661c() {
                r2 = this;
                java.io.InputStream r0 = r2.f23674a
                int r0 = r0.read()
                r1 = -1
                if (r0 == r1) goto Lb
                short r0 = (short) r0
                return r0
            Lb:
                t2.j$c$a r0 = new t2.j$c$a
                r0.<init>()
                throw r0
        }

        @Override // p334t2.C6132j.c
        /* renamed from: d */
        public int mo12662d() {
                r2 = this;
                short r0 = r2.mo12661c()
                int r0 = r0 << 8
                short r1 = r2.mo12661c()
                r0 = r0 | r1
                return r0
        }
    }

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = "Exif\u0000\u0000"
            byte[] r0 = r1.getBytes(r0)
            p334t2.C6132j.f23670a = r0
            r0 = 13
            int[] r0 = new int[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8} // fill-array
            p334t2.C6132j.f23671b = r0
            return
    }

    public C6132j() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public com.bumptech.glide.load.ImageHeaderParser.ImageType mo2776a(java.nio.ByteBuffer r3) {
            r2 = this;
            t2.j$a r0 = new t2.j$a
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r3, r1)
            r0.<init>(r3)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = r2.m12656d(r0)
            return r3
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public int mo2777b(java.io.InputStream r6, p229n2.InterfaceC4672b r7) {
            r5 = this;
            t2.j$d r0 = new t2.j$d
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r6, r1)
            r0.<init>(r6)
            java.util.Objects.requireNonNull(r7, r1)
            r6 = -1
            int r1 = r0.mo12662d()     // Catch: p334t2.C6132j.c.a -> L6a
            r2 = 65496(0xffd8, float:9.178E-41)
            r3 = r1 & r2
            if (r3 == r2) goto L24
            r2 = 19789(0x4d4d, float:2.773E-41)
            if (r1 == r2) goto L24
            r2 = 18761(0x4949, float:2.629E-41)
            if (r1 != r2) goto L22
            goto L24
        L22:
            r2 = 0
            goto L25
        L24:
            r2 = 1
        L25:
            r3 = 3
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r2 != 0) goto L42
            boolean r7 = android.util.Log.isLoggable(r4, r3)     // Catch: p334t2.C6132j.c.a -> L6a
            if (r7 == 0) goto L6a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: p334t2.C6132j.c.a -> L6a
            r7.<init>()     // Catch: p334t2.C6132j.c.a -> L6a
            java.lang.String r0 = "Parser doesn't handle magic number: "
            r7.append(r0)     // Catch: p334t2.C6132j.c.a -> L6a
            r7.append(r1)     // Catch: p334t2.C6132j.c.a -> L6a
            java.lang.String r7 = r7.toString()     // Catch: p334t2.C6132j.c.a -> L6a
            goto L50
        L42:
            int r1 = r5.m12657e(r0)     // Catch: p334t2.C6132j.c.a -> L6a
            if (r1 != r6) goto L54
            boolean r7 = android.util.Log.isLoggable(r4, r3)     // Catch: p334t2.C6132j.c.a -> L6a
            if (r7 == 0) goto L6a
            java.lang.String r7 = "Failed to parse exif segment length, or exif segment not found"
        L50:
            android.util.Log.d(r4, r7)     // Catch: p334t2.C6132j.c.a -> L6a
            goto L6a
        L54:
            java.lang.Class<byte[]> r2 = byte[].class
            java.lang.Object r2 = r7.mo10688e(r1, r2)     // Catch: p334t2.C6132j.c.a -> L6a
            byte[] r2 = (byte[]) r2     // Catch: p334t2.C6132j.c.a -> L6a
            int r0 = r5.m12658f(r0, r2, r1)     // Catch: java.lang.Throwable -> L65
            r7.mo10687d(r2)     // Catch: p334t2.C6132j.c.a -> L6a
            r6 = r0
            goto L6a
        L65:
            r0 = move-exception
            r7.mo10687d(r2)     // Catch: p334t2.C6132j.c.a -> L6a
            throw r0     // Catch: p334t2.C6132j.c.a -> L6a
        L6a:
            return r6
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public com.bumptech.glide.load.ImageHeaderParser.ImageType mo2778c(java.io.InputStream r3) {
            r2 = this;
            t2.j$d r0 = new t2.j$d
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r3, r1)
            r0.<init>(r3)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = r2.m12656d(r0)
            return r3
    }

    /* renamed from: d */
    public final com.bumptech.glide.load.ImageHeaderParser.ImageType m12656d(p334t2.C6132j.c r6) {
            r5 = this;
            int r0 = r6.mo12662d()     // Catch: p334t2.C6132j.c.a -> La0
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto Lc
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch: p334t2.C6132j.c.a -> La0
            return r6
        Lc:
            int r0 = r0 << 8
            short r1 = r6.mo12661c()     // Catch: p334t2.C6132j.c.a -> La0
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L1b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch: p334t2.C6132j.c.a -> La0
            return r6
        L1b:
            int r0 = r0 << 8
            short r1 = r6.mo12661c()     // Catch: p334t2.C6132j.c.a -> La0
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L3c
            r0 = 21
            r6.mo12660b(r0)     // Catch: p334t2.C6132j.c.a -> La0
            short r6 = r6.mo12661c()     // Catch: p334t2.C6132j.c.a -> L39
            r0 = 3
            if (r6 < r0) goto L36
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch: p334t2.C6132j.c.a -> L39
            goto L38
        L36:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch: p334t2.C6132j.c.a -> L39
        L38:
            return r6
        L39:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch: p334t2.C6132j.c.a -> La0
            return r6
        L3c:
            r1 = 1380533830(0x52494646, float:2.1611685E11)
            if (r0 == r1) goto L44
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch: p334t2.C6132j.c.a -> La0
            return r6
        L44:
            r0 = 4
            r6.mo12660b(r0)     // Catch: p334t2.C6132j.c.a -> La0
            int r2 = r6.mo12662d()     // Catch: p334t2.C6132j.c.a -> La0
            int r2 = r2 << 16
            int r3 = r6.mo12662d()     // Catch: p334t2.C6132j.c.a -> La0
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.168886E14)
            if (r2 == r3) goto L5c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch: p334t2.C6132j.c.a -> La0
            return r6
        L5c:
            int r2 = r6.mo12662d()     // Catch: p334t2.C6132j.c.a -> La0
            int r2 = r2 << 16
            int r3 = r6.mo12662d()     // Catch: p334t2.C6132j.c.a -> La0
            r2 = r2 | r3
            r3 = r2 & (-256(0xffffffffffffff00, float:NaN))
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L71
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch: p334t2.C6132j.c.a -> La0
            return r6
        L71:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L88
            r6.mo12660b(r0)     // Catch: p334t2.C6132j.c.a -> La0
            short r6 = r6.mo12661c()     // Catch: p334t2.C6132j.c.a -> La0
            r6 = r6 & 16
            if (r6 == 0) goto L85
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch: p334t2.C6132j.c.a -> La0
            goto L87
        L85:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch: p334t2.C6132j.c.a -> La0
        L87:
            return r6
        L88:
            r3 = 76
            if (r2 != r3) goto L9d
            r6.mo12660b(r0)     // Catch: p334t2.C6132j.c.a -> La0
            short r6 = r6.mo12661c()     // Catch: p334t2.C6132j.c.a -> La0
            r6 = r6 & 8
            if (r6 == 0) goto L9a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch: p334t2.C6132j.c.a -> La0
            goto L9c
        L9a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch: p334t2.C6132j.c.a -> La0
        L9c:
            return r6
        L9d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch: p334t2.C6132j.c.a -> La0
            return r6
        La0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
    }

    /* renamed from: e */
    public final int m12657e(p334t2.C6132j.c r11) {
            r10 = this;
        L0:
            short r0 = r11.mo12661c()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = -1
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r0 == r1) goto L27
            boolean r11 = android.util.Log.isLoggable(r4, r2)
            if (r11 == 0) goto L26
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "Unknown segmentId="
            r11.append(r1)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            android.util.Log.d(r4, r11)
        L26:
            return r3
        L27:
            short r0 = r11.mo12661c()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L30
            return r3
        L30:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L40
            boolean r11 = android.util.Log.isLoggable(r4, r2)
            if (r11 == 0) goto L3f
            java.lang.String r11 = "Found MARKER_EOI in exif segment"
            android.util.Log.d(r4, r11)
        L3f:
            return r3
        L40:
            int r1 = r11.mo12662d()
            int r1 = r1 + (-2)
            r5 = 225(0xe1, float:3.15E-43)
            if (r0 == r5) goto L6e
            long r5 = (long) r1
            long r7 = r11.mo12660b(r5)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 == 0) goto L0
            boolean r11 = android.util.Log.isLoggable(r4, r2)
            if (r11 == 0) goto L6d
            java.lang.String r11 = "Unable to skip enough data, type: "
            java.lang.String r2 = ", wanted to skip: "
            java.lang.String r5 = ", but actually skipped: "
            java.lang.StringBuilder r11 = androidx.recyclerview.widget.C0608s.m2117a(r11, r0, r2, r1, r5)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            android.util.Log.d(r4, r11)
        L6d:
            return r3
        L6e:
            return r1
    }

    /* renamed from: f */
    public final int m12658f(p334t2.C6132j.c r13, byte[] r14, int r15) {
            r12 = this;
            int r13 = r13.mo12659a(r14, r15)
            r0 = -1
            r1 = 3
            java.lang.String r2 = "DfltImageHeaderParser"
            if (r13 == r15) goto L2d
            boolean r14 = android.util.Log.isLoggable(r2, r1)
            if (r14 == 0) goto L2c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "Unable to read exif segment data, length: "
            r14.append(r1)
            r14.append(r15)
            java.lang.String r15 = ", actually read: "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            android.util.Log.d(r2, r13)
        L2c:
            return r0
        L2d:
            r13 = 0
            r3 = 1
            if (r14 == 0) goto L38
            byte[] r4 = p334t2.C6132j.f23670a
            int r4 = r4.length
            if (r15 <= r4) goto L38
            r4 = 1
            goto L39
        L38:
            r4 = 0
        L39:
            if (r4 == 0) goto L4c
            r5 = 0
        L3c:
            byte[] r6 = p334t2.C6132j.f23670a
            int r7 = r6.length
            if (r5 >= r7) goto L4c
            r7 = r14[r5]
            r6 = r6[r5]
            if (r7 == r6) goto L49
            r4 = 0
            goto L4c
        L49:
            int r5 = r5 + 1
            goto L3c
        L4c:
            if (r4 == 0) goto L14f
            t2.j$b r4 = new t2.j$b
            r4.<init>(r14, r15)
            r14 = 6
            short r15 = r4.m12663a(r14)
            r5 = 18761(0x4949, float:2.629E-41)
            if (r15 == r5) goto L7d
            r5 = 19789(0x4d4d, float:2.773E-41)
            if (r15 == r5) goto L7a
            boolean r5 = android.util.Log.isLoggable(r2, r1)
            if (r5 == 0) goto L7a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Unknown endianness = "
            r5.append(r6)
            r5.append(r15)
            java.lang.String r15 = r5.toString()
            android.util.Log.d(r2, r15)
        L7a:
            java.nio.ByteOrder r15 = java.nio.ByteOrder.BIG_ENDIAN
            goto L7f
        L7d:
            java.nio.ByteOrder r15 = java.nio.ByteOrder.LITTLE_ENDIAN
        L7f:
            java.nio.ByteBuffer r5 = r4.f23673a
            r5.order(r15)
            r15 = 10
            int r15 = r4.m12664b(r15)
            int r15 = r15 + r14
            short r14 = r4.m12663a(r15)
        L8f:
            if (r13 >= r14) goto L14e
            int r5 = r15 + 2
            int r6 = r13 * 12
            int r6 = r6 + r5
            short r5 = r4.m12663a(r6)
            r7 = 274(0x112, float:3.84E-43)
            if (r5 == r7) goto La0
            goto L14a
        La0:
            int r7 = r6 + 2
            short r7 = r4.m12663a(r7)
            if (r7 < r3) goto L130
            r8 = 12
            if (r7 <= r8) goto Lae
            goto L130
        Lae:
            int r8 = r6 + 4
            int r8 = r4.m12664b(r8)
            if (r8 >= 0) goto Lc0
            boolean r5 = android.util.Log.isLoggable(r2, r1)
            if (r5 == 0) goto L14a
            java.lang.String r5 = "Negative tiff component count"
            goto L147
        Lc0:
            boolean r9 = android.util.Log.isLoggable(r2, r1)
            java.lang.String r10 = " tagType="
            if (r9 == 0) goto Le2
            java.lang.String r9 = "Got tagIndex="
            java.lang.String r11 = " formatCode="
            java.lang.StringBuilder r9 = androidx.recyclerview.widget.C0608s.m2117a(r9, r13, r10, r5, r11)
            r9.append(r7)
            java.lang.String r11 = " componentCount="
            r9.append(r11)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r2, r9)
        Le2:
            int[] r9 = p334t2.C6132j.f23671b
            r9 = r9[r7]
            int r8 = r8 + r9
            r9 = 4
            if (r8 <= r9) goto Lf8
            boolean r5 = android.util.Log.isLoggable(r2, r1)
            if (r5 == 0) goto L14a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Got byte count > 4, not orientation, continuing, formatCode="
            goto L13d
        Lf8:
            int r6 = r6 + 8
            if (r6 < 0) goto L123
            java.nio.ByteBuffer r7 = r4.f23673a
            int r7 = r7.remaining()
            if (r6 <= r7) goto L105
            goto L123
        L105:
            if (r8 < 0) goto L116
            int r8 = r8 + r6
            java.nio.ByteBuffer r7 = r4.f23673a
            int r7 = r7.remaining()
            if (r8 <= r7) goto L111
            goto L116
        L111:
            short r0 = r4.m12663a(r6)
            goto L14e
        L116:
            boolean r6 = android.util.Log.isLoggable(r2, r1)
            if (r6 == 0) goto L14a
            java.lang.String r6 = "Illegal number of bytes for TI tag data tagType="
            java.lang.String r5 = android.support.v4.media.C0142a.m254a(r6, r5)
            goto L147
        L123:
            boolean r7 = android.util.Log.isLoggable(r2, r1)
            if (r7 == 0) goto L14a
            java.lang.String r7 = "Illegal tagValueOffset="
            java.lang.String r5 = p243o1.C4872b.m11020a(r7, r6, r10, r5)
            goto L147
        L130:
            boolean r5 = android.util.Log.isLoggable(r2, r1)
            if (r5 == 0) goto L14a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Got invalid format code = "
        L13d:
            r5.append(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
        L147:
            android.util.Log.d(r2, r5)
        L14a:
            int r13 = r13 + 1
            goto L8f
        L14e:
            return r0
        L14f:
            boolean r13 = android.util.Log.isLoggable(r2, r1)
            if (r13 == 0) goto L15a
            java.lang.String r13 = "Missing jpeg exif preamble"
            android.util.Log.d(r2, r13)
        L15a:
            return r0
    }
}
