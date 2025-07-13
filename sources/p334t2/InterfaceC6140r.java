package p334t2;

/* renamed from: t2.r */
/* loaded from: classes.dex */
public interface InterfaceC6140r {

    /* renamed from: t2.r$a */
    public static final class a implements p334t2.InterfaceC6140r {

        /* renamed from: a */
        public final com.bumptech.glide.load.data.C1023k f23709a;

        /* renamed from: b */
        public final p229n2.InterfaceC4672b f23710b;

        /* renamed from: c */
        public final java.util.List<com.bumptech.glide.load.ImageHeaderParser> f23711c;

        public a(java.io.InputStream r2, java.util.List<com.bumptech.glide.load.ImageHeaderParser> r3, p229n2.InterfaceC4672b r4) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "Argument must not be null"
                java.util.Objects.requireNonNull(r4, r0)
                r1.f23710b = r4
                java.util.Objects.requireNonNull(r3, r0)
                r1.f23711c = r3
                com.bumptech.glide.load.data.k r3 = new com.bumptech.glide.load.data.k
                r3.<init>(r2, r4)
                r1.f23709a = r3
                return
        }

        @Override // p334t2.InterfaceC6140r
        /* renamed from: a */
        public android.graphics.Bitmap mo12684a(android.graphics.BitmapFactory.Options r3) {
                r2 = this;
                com.bumptech.glide.load.data.k r0 = r2.f23709a
                java.io.InputStream r0 = r0.m2798c()
                r1 = 0
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r0, r1, r3)
                return r3
        }

        @Override // p334t2.InterfaceC6140r
        /* renamed from: b */
        public void mo12685b() {
                r2 = this;
                com.bumptech.glide.load.data.k r0 = r2.f23709a
                t2.t r0 = r0.f5215a
                monitor-enter(r0)
                byte[] r1 = r0.f23716Y     // Catch: java.lang.Throwable -> Lc
                int r1 = r1.length     // Catch: java.lang.Throwable -> Lc
                r0.f23718a0 = r1     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r0)
                return
            Lc:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @Override // p334t2.InterfaceC6140r
        /* renamed from: c */
        public int mo12686c() {
                r3 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r3.f23711c
                com.bumptech.glide.load.data.k r1 = r3.f23709a
                java.io.InputStream r1 = r1.m2798c()
                n2.b r2 = r3.f23710b
                int r0 = com.bumptech.glide.load.C1011d.m2779a(r0, r1, r2)
                return r0
        }

        @Override // p334t2.InterfaceC6140r
        /* renamed from: d */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType mo12687d() {
                r3 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r3.f23711c
                com.bumptech.glide.load.data.k r1 = r3.f23709a
                java.io.InputStream r1 = r1.m2798c()
                n2.b r2 = r3.f23710b
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.C1011d.m2780b(r0, r1, r2)
                return r0
        }
    }

    /* renamed from: t2.r$b */
    public static final class b implements p334t2.InterfaceC6140r {

        /* renamed from: a */
        public final p229n2.InterfaceC4672b f23712a;

        /* renamed from: b */
        public final java.util.List<com.bumptech.glide.load.ImageHeaderParser> f23713b;

        /* renamed from: c */
        public final com.bumptech.glide.load.data.ParcelFileDescriptorRewinder f23714c;

        public b(android.os.ParcelFileDescriptor r2, java.util.List<com.bumptech.glide.load.ImageHeaderParser> r3, p229n2.InterfaceC4672b r4) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "Argument must not be null"
                java.util.Objects.requireNonNull(r4, r0)
                r1.f23712a = r4
                java.util.Objects.requireNonNull(r3, r0)
                r1.f23713b = r3
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder
                r3.<init>(r2)
                r1.f23714c = r3
                return
        }

        @Override // p334t2.InterfaceC6140r
        /* renamed from: a */
        public android.graphics.Bitmap mo12684a(android.graphics.BitmapFactory.Options r3) {
                r2 = this;
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r2.f23714c
                android.os.ParcelFileDescriptor r0 = r0.m2783c()
                java.io.FileDescriptor r0 = r0.getFileDescriptor()
                r1 = 0
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFileDescriptor(r0, r1, r3)
                return r3
        }

        @Override // p334t2.InterfaceC6140r
        /* renamed from: b */
        public void mo12685b() {
                r0 = this;
                return
        }

        @Override // p334t2.InterfaceC6140r
        /* renamed from: c */
        public int mo12686c() {
                r11 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r11.f23713b
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r11.f23714c
                n2.b r2 = r11.f23712a
                int r3 = r0.size()
                r4 = 0
            Lb:
                r5 = -1
                if (r4 >= r3) goto L47
                java.lang.Object r6 = r0.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r6 = (com.bumptech.glide.load.ImageHeaderParser) r6
                r7 = 0
                t2.t r8 = new t2.t     // Catch: java.lang.Throwable -> L3d
                java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3d
                android.os.ParcelFileDescriptor r10 = r1.m2783c()     // Catch: java.lang.Throwable -> L3d
                java.io.FileDescriptor r10 = r10.getFileDescriptor()     // Catch: java.lang.Throwable -> L3d
                r9.<init>(r10)     // Catch: java.lang.Throwable -> L3d
                r8.<init>(r9, r2)     // Catch: java.lang.Throwable -> L3d
                int r6 = r6.mo2777b(r8, r2)     // Catch: java.lang.Throwable -> L3a
                r8.close()     // Catch: java.io.IOException -> L2f
                goto L30
            L2f:
            L30:
                r1.m2783c()
                if (r6 == r5) goto L37
                r5 = r6
                goto L47
            L37:
                int r4 = r4 + 1
                goto Lb
            L3a:
                r0 = move-exception
                r7 = r8
                goto L3e
            L3d:
                r0 = move-exception
            L3e:
                if (r7 == 0) goto L43
                r7.close()     // Catch: java.io.IOException -> L43
            L43:
                r1.m2783c()
                throw r0
            L47:
                return r5
        }

        @Override // p334t2.InterfaceC6140r
        /* renamed from: d */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType mo12687d() {
                r10 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r10.f23713b
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r10.f23714c
                n2.b r2 = r10.f23712a
                int r3 = r0.size()
                r4 = 0
            Lb:
                if (r4 >= r3) goto L47
                java.lang.Object r5 = r0.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r5 = (com.bumptech.glide.load.ImageHeaderParser) r5
                r6 = 0
                t2.t r7 = new t2.t     // Catch: java.lang.Throwable -> L3d
                java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3d
                android.os.ParcelFileDescriptor r9 = r1.m2783c()     // Catch: java.lang.Throwable -> L3d
                java.io.FileDescriptor r9 = r9.getFileDescriptor()     // Catch: java.lang.Throwable -> L3d
                r8.<init>(r9)     // Catch: java.lang.Throwable -> L3d
                r7.<init>(r8, r2)     // Catch: java.lang.Throwable -> L3d
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.mo2778c(r7)     // Catch: java.lang.Throwable -> L3a
                r7.close()     // Catch: java.io.IOException -> L2e
                goto L2f
            L2e:
            L2f:
                r1.m2783c()
                com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
                if (r5 == r6) goto L37
                goto L49
            L37:
                int r4 = r4 + 1
                goto Lb
            L3a:
                r0 = move-exception
                r6 = r7
                goto L3e
            L3d:
                r0 = move-exception
            L3e:
                if (r6 == 0) goto L43
                r6.close()     // Catch: java.io.IOException -> L43
            L43:
                r1.m2783c()
                throw r0
            L47:
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            L49:
                return r5
        }
    }

    /* renamed from: a */
    android.graphics.Bitmap mo12684a(android.graphics.BitmapFactory.Options r1);

    /* renamed from: b */
    void mo12685b();

    /* renamed from: c */
    int mo12686c();

    /* renamed from: d */
    com.bumptech.glide.load.ImageHeaderParser.ImageType mo12687d();
}
