package p106g3;

/* renamed from: g3.a */
/* loaded from: classes.dex */
public final class C2229a {

    /* renamed from: a */
    public static final java.util.concurrent.atomic.AtomicReference<byte[]> f10188a = null;

    /* renamed from: g3.a$a */
    public static class a extends java.io.InputStream {

        /* renamed from: Y */
        public final java.nio.ByteBuffer f10189Y;

        /* renamed from: Z */
        public int f10190Z;

        public a(java.nio.ByteBuffer r2) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.f10190Z = r0
                r1.f10189Y = r2
                return
        }

        @Override // java.io.InputStream
        public int available() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.f10189Y
                int r0 = r0.remaining()
                return r0
        }

        @Override // java.io.InputStream
        public synchronized void mark(int r1) {
                r0 = this;
                monitor-enter(r0)
                java.nio.ByteBuffer r1 = r0.f10189Y     // Catch: java.lang.Throwable -> Lb
                int r1 = r1.position()     // Catch: java.lang.Throwable -> Lb
                r0.f10190Z = r1     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)
                return
            Lb:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.io.InputStream
        public int read() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.f10189Y
                boolean r0 = r0.hasRemaining()
                if (r0 != 0) goto La
                r0 = -1
                return r0
            La:
                java.nio.ByteBuffer r0 = r1.f10189Y
                byte r0 = r0.get()
                r0 = r0 & 255(0xff, float:3.57E-43)
                return r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r2, int r3, int r4) {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.f10189Y
                boolean r0 = r0.hasRemaining()
                if (r0 != 0) goto La
                r2 = -1
                return r2
            La:
                int r0 = r1.available()
                int r4 = java.lang.Math.min(r4, r0)
                java.nio.ByteBuffer r0 = r1.f10189Y
                r0.get(r2, r3, r4)
                return r4
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.f10190Z     // Catch: java.lang.Throwable -> L15
                r1 = -1
                if (r0 == r1) goto Ld
                java.nio.ByteBuffer r1 = r2.f10189Y     // Catch: java.lang.Throwable -> L15
                r1.position(r0)     // Catch: java.lang.Throwable -> L15
                monitor-exit(r2)
                return
            Ld:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L15
                java.lang.String r1 = "Cannot reset to unset mark position"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L15
                throw r0     // Catch: java.lang.Throwable -> L15
            L15:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
        }

        @Override // java.io.InputStream
        public long skip(long r4) {
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f10189Y
                boolean r0 = r0.hasRemaining()
                if (r0 != 0) goto Lb
                r4 = -1
                return r4
            Lb:
                int r0 = r3.available()
                long r0 = (long) r0
                long r4 = java.lang.Math.min(r4, r0)
                java.nio.ByteBuffer r0 = r3.f10189Y
                int r1 = r0.position()
                long r1 = (long) r1
                long r1 = r1 + r4
                int r2 = (int) r1
                r0.position(r2)
                return r4
        }
    }

    /* renamed from: g3.a$b */
    public static final class b {

        /* renamed from: a */
        public final int f10191a;

        /* renamed from: b */
        public final int f10192b;

        /* renamed from: c */
        public final byte[] f10193c;

        public b(byte[] r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f10193c = r1
                r0.f10191a = r2
                r0.f10192b = r3
                return
        }
    }

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            p106g3.C2229a.f10188a = r0
            return
    }

    /* renamed from: a */
    public static java.nio.ByteBuffer m5827a(java.io.File r8) {
            r0 = 0
            long r5 = r8.length()     // Catch: java.lang.Throwable -> L43
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto L3b
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L33
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "r"
            r7.<init>(r8, r1)     // Catch: java.lang.Throwable -> L43
            java.nio.channels.FileChannel r0 = r7.getChannel()     // Catch: java.lang.Throwable -> L31
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L31
            r3 = 0
            r1 = r0
            java.nio.MappedByteBuffer r8 = r1.map(r2, r3, r5)     // Catch: java.lang.Throwable -> L31
            java.nio.MappedByteBuffer r8 = r8.load()     // Catch: java.lang.Throwable -> L31
            r0.close()     // Catch: java.io.IOException -> L2d
        L2d:
            r7.close()     // Catch: java.io.IOException -> L30
        L30:
            return r8
        L31:
            r8 = move-exception
            goto L45
        L33:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "File unsuitable for memory mapping"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L43
            throw r8     // Catch: java.lang.Throwable -> L43
        L3b:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "File too large to map into memory"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L43
            throw r8     // Catch: java.lang.Throwable -> L43
        L43:
            r8 = move-exception
            r7 = r0
        L45:
            if (r0 == 0) goto L4c
            r0.close()     // Catch: java.io.IOException -> L4b
            goto L4c
        L4b:
        L4c:
            if (r7 == 0) goto L51
            r7.close()     // Catch: java.io.IOException -> L51
        L51:
            throw r8
    }

    /* renamed from: b */
    public static void m5828b(java.nio.ByteBuffer r4, java.io.File r5) {
            r0 = 0
            r4.position(r0)
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "rw"
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L25
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch: java.lang.Throwable -> L23
            r1.write(r4)     // Catch: java.lang.Throwable -> L23
            r1.force(r0)     // Catch: java.lang.Throwable -> L23
            r1.close()     // Catch: java.lang.Throwable -> L23
            r2.close()     // Catch: java.lang.Throwable -> L23
            r1.close()     // Catch: java.io.IOException -> L1f
        L1f:
            r2.close()     // Catch: java.io.IOException -> L22
        L22:
            return
        L23:
            r4 = move-exception
            goto L27
        L25:
            r4 = move-exception
            r2 = r1
        L27:
            if (r1 == 0) goto L2e
            r1.close()     // Catch: java.io.IOException -> L2d
            goto L2e
        L2d:
        L2e:
            if (r2 == 0) goto L33
            r2.close()     // Catch: java.io.IOException -> L33
        L33:
            throw r4
    }
}
