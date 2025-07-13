package p334t2;

/* renamed from: t2.l */
/* loaded from: classes.dex */
public final class C6134l {

    /* renamed from: f */
    public static final p180k2.C3672d<com.bumptech.glide.load.EnumC1009b> f23682f = null;

    /* renamed from: g */
    public static final p180k2.C3672d<com.bumptech.glide.load.EnumC1027e> f23683g = null;

    /* renamed from: h */
    public static final p180k2.C3672d<java.lang.Boolean> f23684h = null;

    /* renamed from: i */
    public static final p180k2.C3672d<java.lang.Boolean> f23685i = null;

    /* renamed from: j */
    public static final java.util.Set<java.lang.String> f23686j = null;

    /* renamed from: k */
    public static final p334t2.C6134l.b f23687k = null;

    /* renamed from: l */
    public static final java.util.Queue<android.graphics.BitmapFactory.Options> f23688l = null;

    /* renamed from: a */
    public final p229n2.InterfaceC4673c f23689a;

    /* renamed from: b */
    public final android.util.DisplayMetrics f23690b;

    /* renamed from: c */
    public final p229n2.InterfaceC4672b f23691c;

    /* renamed from: d */
    public final java.util.List<com.bumptech.glide.load.ImageHeaderParser> f23692d;

    /* renamed from: e */
    public final p334t2.C6139q f23693e;

    /* renamed from: t2.l$a */
    public class a implements p334t2.C6134l.b {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p334t2.C6134l.b
        /* renamed from: a */
        public void mo12679a(p229n2.InterfaceC4673c r1, android.graphics.Bitmap r2) {
                r0 = this;
                return
        }

        @Override // p334t2.C6134l.b
        /* renamed from: b */
        public void mo12680b() {
                r0 = this;
                return
        }
    }

    /* renamed from: t2.l$b */
    public interface b {
        /* renamed from: a */
        void mo12679a(p229n2.InterfaceC4673c r1, android.graphics.Bitmap r2);

        /* renamed from: b */
        void mo12680b();
    }

    static {
            com.bumptech.glide.load.b r0 = com.bumptech.glide.load.EnumC1009b.f5186Y
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat"
            k2.d r0 = p180k2.C3672d.m8128a(r1, r0)
            p334t2.C6134l.f23682f = r0
            com.bumptech.glide.load.e r0 = com.bumptech.glide.load.EnumC1027e.f5221Y
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace"
            k2.d r0 = p180k2.C3672d.m8128a(r1, r0)
            p334t2.C6134l.f23683g = r0
            k2.d<t2.k> r0 = p334t2.AbstractC6133k.f23680f
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize"
            k2.d r1 = p180k2.C3672d.m8128a(r1, r0)
            p334t2.C6134l.f23684h = r1
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode"
            k2.d r0 = p180k2.C3672d.m8128a(r1, r0)
            p334t2.C6134l.f23685i = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "image/vnd.wap.wbmp"
            java.lang.String r2 = "image/x-ico"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            p334t2.C6134l.f23686j = r0
            t2.l$a r0 = new t2.l$a
            r0.<init>()
            p334t2.C6134l.f23687k = r0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            java.util.EnumSet r0 = java.util.EnumSet.of(r0, r1, r2)
            java.util.Collections.unmodifiableSet(r0)
            char[] r0 = p106g3.C2238j.f10214a
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 0
            r0.<init>(r1)
            p334t2.C6134l.f23688l = r0
            return
    }

    public C6134l(java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2, android.util.DisplayMetrics r3, p229n2.InterfaceC4673c r4, p229n2.InterfaceC4672b r5) {
            r1 = this;
            r1.<init>()
            t2.q r0 = p334t2.C6139q.m12682a()
            r1.f23693e = r0
            r1.f23692d = r2
            java.lang.String r2 = "Argument must not be null"
            java.util.Objects.requireNonNull(r3, r2)
            r1.f23690b = r3
            java.util.Objects.requireNonNull(r4, r2)
            r1.f23689a = r4
            java.util.Objects.requireNonNull(r5, r2)
            r1.f23691c = r5
            return
    }

    /* renamed from: d */
    public static android.graphics.Bitmap m12667d(p334t2.InterfaceC6140r r5, android.graphics.BitmapFactory.Options r6, p334t2.C6134l.b r7, p229n2.InterfaceC4673c r8) {
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.mo12680b()
            r5.mo12685b()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = p334t2.C6144v.f23727b
            r4.lock()
            android.graphics.Bitmap r5 = r5.mo12684a(r6)     // Catch: java.lang.Throwable -> L1f java.lang.IllegalArgumentException -> L21
            r4.unlock()
            return r5
        L1f:
            r5 = move-exception
            goto L48
        L21:
            r4 = move-exception
            java.io.IOException r1 = m12672i(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L1f
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L32
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L1f
        L32:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L47
            r8.mo10694f(r0)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            android.graphics.Bitmap r5 = m12667d(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            java.util.concurrent.locks.Lock r6 = p334t2.C6144v.f23727b
            r6.unlock()
            return r5
        L46:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L47:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L48:
            java.util.concurrent.locks.Lock r6 = p334t2.C6144v.f23727b
            r6.unlock()
            throw r5
    }

    @android.annotation.TargetApi(19)
    /* renamed from: e */
    public static java.lang.String m12668e(android.graphics.Bitmap r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.String r0 = " ("
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.getAllocationByteCount()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "["
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r2 = r3.getWidth()
            r1.append(r2)
            java.lang.String r2 = "x"
            r1.append(r2)
            int r2 = r3.getHeight()
            r1.append(r2)
            java.lang.String r2 = "] "
            r1.append(r2)
            android.graphics.Bitmap$Config r3 = r3.getConfig()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            return r3
    }

    /* renamed from: f */
    public static int m12669f(double r3) {
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            goto L9
        L7:
            double r3 = r0 / r3
        L9:
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r3 = r3 * r0
            long r3 = java.lang.Math.round(r3)
            int r4 = (int) r3
            return r4
    }

    /* renamed from: g */
    public static int[] m12670g(p334t2.InterfaceC6140r r1, android.graphics.BitmapFactory.Options r2, p334t2.C6134l.b r3, p229n2.InterfaceC4673c r4) {
            r0 = 1
            r2.inJustDecodeBounds = r0
            m12667d(r1, r2, r3, r4)
            r1 = 0
            r2.inJustDecodeBounds = r1
            r3 = 2
            int[] r3 = new int[r3]
            int r4 = r2.outWidth
            r3[r1] = r4
            int r1 = r2.outHeight
            r3[r0] = r1
            return r3
    }

    /* renamed from: h */
    public static boolean m12671h(int r1) {
            r0 = 90
            if (r1 == r0) goto Lb
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    /* renamed from: i */
    public static java.io.IOException m12672i(java.lang.IllegalArgumentException r4, int r5, int r6, java.lang.String r7, android.graphics.BitmapFactory.Options r8) {
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Exception decoding bitmap, outWidth: "
            java.lang.String r2 = ", outHeight: "
            java.lang.String r3 = ", outMimeType: "
            java.lang.StringBuilder r5 = androidx.recyclerview.widget.C0608s.m2117a(r1, r5, r2, r6, r3)
            r5.append(r7)
            java.lang.String r6 = ", inBitmap: "
            r5.append(r6)
            android.graphics.Bitmap r6 = r8.inBitmap
            java.lang.String r6 = m12668e(r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5, r4)
            return r0
    }

    /* renamed from: j */
    public static void m12673j(android.graphics.BitmapFactory.Options r2) {
            m12674k(r2)
            java.util.Queue<android.graphics.BitmapFactory$Options> r0 = p334t2.C6134l.f23688l
            monitor-enter(r0)
            r1 = r0
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> Le
            r1.offer(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    /* renamed from: k */
    public static void m12674k(android.graphics.BitmapFactory.Options r5) {
            r0 = 0
            r5.inTempStorage = r0
            r1 = 0
            r5.inDither = r1
            r5.inScaled = r1
            r2 = 1
            r5.inSampleSize = r2
            r5.inPreferredConfig = r0
            r5.inJustDecodeBounds = r1
            r5.inDensity = r1
            r5.inTargetDensity = r1
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L1f
            r5.inPreferredColorSpace = r0
            r5.outColorSpace = r0
            r5.outConfig = r0
        L1f:
            r5.outWidth = r1
            r5.outHeight = r1
            r5.outMimeType = r0
            r5.inBitmap = r0
            r5.inMutable = r2
            return
    }

    /* renamed from: l */
    public static int m12675l(double r2) {
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    /* renamed from: a */
    public p214m2.InterfaceC4345w<android.graphics.Bitmap> m12676a(java.io.InputStream r7, int r8, int r9, p180k2.C3673e r10, p334t2.C6134l.b r11) {
            r6 = this;
            t2.r$a r1 = new t2.r$a
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r6.f23692d
            n2.b r2 = r6.f23691c
            r1.<init>(r7, r0, r2)
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            m2.w r7 = r0.m12677b(r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: b */
    public final p214m2.InterfaceC4345w<android.graphics.Bitmap> m12677b(p334t2.InterfaceC6140r r16, int r17, int r18, p180k2.C3673e r19, p334t2.C6134l.b r20) {
            r15 = this;
            r12 = r15
            r0 = r19
            n2.b r1 = r12.f23691c
            java.lang.Class<byte[]> r2 = byte[].class
            r3 = 65536(0x10000, float:9.1835E-41)
            java.lang.Object r1 = r1.mo10688e(r3, r2)
            r13 = r1
            byte[] r13 = (byte[]) r13
            java.lang.Class<t2.l> r1 = p334t2.C6134l.class
            monitor-enter(r1)
            java.util.Queue<android.graphics.BitmapFactory$Options> r2 = p334t2.C6134l.f23688l     // Catch: java.lang.Throwable -> L98
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L98
            r3 = r2
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L95
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L95
            android.graphics.BitmapFactory$Options r3 = (android.graphics.BitmapFactory.Options) r3     // Catch: java.lang.Throwable -> L95
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L95
            if (r3 != 0) goto L2a
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L98
            r3.<init>()     // Catch: java.lang.Throwable -> L98
            m12674k(r3)     // Catch: java.lang.Throwable -> L98
        L2a:
            r14 = r3
            monitor-exit(r1)
            r14.inTempStorage = r13
            k2.d<com.bumptech.glide.load.b> r1 = p334t2.C6134l.f23682f
            java.lang.Object r1 = r0.m8130c(r1)
            r5 = r1
            com.bumptech.glide.load.b r5 = (com.bumptech.glide.load.EnumC1009b) r5
            k2.d<com.bumptech.glide.load.e> r1 = p334t2.C6134l.f23683g
            java.lang.Object r1 = r0.m8130c(r1)
            r6 = r1
            com.bumptech.glide.load.e r6 = (com.bumptech.glide.load.EnumC1027e) r6
            k2.d<t2.k> r1 = p334t2.AbstractC6133k.f23680f
            java.lang.Object r1 = r0.m8130c(r1)
            r4 = r1
            t2.k r4 = (p334t2.AbstractC6133k) r4
            k2.d<java.lang.Boolean> r1 = p334t2.C6134l.f23684h
            java.lang.Object r1 = r0.m8130c(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r10 = r1.booleanValue()
            k2.d<java.lang.Boolean> r1 = p334t2.C6134l.f23685i
            java.lang.Object r2 = r0.m8130c(r1)
            if (r2 == 0) goto L6c
            java.lang.Object r0 = r0.m8130c(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6c
            r0 = 1
            r7 = 1
            goto L6e
        L6c:
            r0 = 0
            r7 = 0
        L6e:
            r1 = r15
            r2 = r16
            r3 = r14
            r8 = r17
            r9 = r18
            r11 = r20
            android.graphics.Bitmap r0 = r1.m12678c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L8b
            n2.c r1 = r12.f23689a     // Catch: java.lang.Throwable -> L8b
            t2.d r0 = p334t2.C6126d.m12654f(r0, r1)     // Catch: java.lang.Throwable -> L8b
            m12673j(r14)
            n2.b r1 = r12.f23691c
            r1.mo10687d(r13)
            return r0
        L8b:
            r0 = move-exception
            m12673j(r14)
            n2.b r1 = r12.f23691c
            r1.mo10687d(r13)
            throw r0
        L95:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L95
            throw r0     // Catch: java.lang.Throwable -> L98
        L98:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* renamed from: c */
    public final android.graphics.Bitmap m12678c(p334t2.InterfaceC6140r r31, android.graphics.BitmapFactory.Options r32, p334t2.AbstractC6133k r33, com.bumptech.glide.load.EnumC1009b r34, com.bumptech.glide.load.EnumC1027e r35, boolean r36, int r37, int r38, boolean r39, p334t2.C6134l.b r40) {
            r30 = this;
            r1 = r30
            r2 = r31
            r3 = r32
            r0 = r33
            r4 = r34
            r5 = r37
            r6 = r38
            r7 = r40
            int r8 = p106g3.C2234f.f10203b
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            n2.c r10 = r1.f23689a
            int[] r10 = m12670g(r2, r3, r7, r10)
            r11 = 0
            r11 = r10[r11]
            r12 = 1
            r10 = r10[r12]
            java.lang.String r12 = r3.outMimeType
            r13 = -1
            if (r11 == r13) goto L2d
            if (r10 != r13) goto L2a
            goto L2d
        L2a:
            r13 = r36
            goto L2e
        L2d:
            r13 = 0
        L2e:
            int r14 = r31.mo12686c()
            switch(r14) {
                case 3: goto L3d;
                case 4: goto L3d;
                case 5: goto L3a;
                case 6: goto L3a;
                case 7: goto L37;
                case 8: goto L37;
                default: goto L35;
            }
        L35:
            r15 = 0
            goto L3f
        L37:
            r15 = 270(0x10e, float:3.78E-43)
            goto L3f
        L3a:
            r15 = 90
            goto L3f
        L3d:
            r15 = 180(0xb4, float:2.52E-43)
        L3f:
            switch(r14) {
                case 2: goto L4a;
                case 3: goto L4a;
                case 4: goto L4a;
                case 5: goto L4a;
                case 6: goto L4a;
                case 7: goto L4a;
                case 8: goto L4a;
                default: goto L42;
            }
        L42:
            r16 = 0
            r16 = r8
            r36 = r14
            r14 = 0
            goto L51
        L4a:
            r16 = 1
            r16 = r8
            r36 = r14
            r14 = 1
        L51:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r8) goto L5f
            boolean r9 = m12671h(r15)
            if (r9 == 0) goto L5d
            r9 = r10
            goto L60
        L5d:
            r9 = r11
            goto L60
        L5f:
            r9 = r5
        L60:
            if (r6 != r8) goto L6c
            boolean r8 = m12671h(r15)
            if (r8 == 0) goto L6a
            r8 = r11
            goto L6d
        L6a:
            r8 = r10
            goto L6d
        L6c:
            r8 = r6
        L6d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = r31.mo12687d()
            n2.c r5 = r1.f23689a
            r18 = r12
            java.lang.String r12 = "]"
            java.lang.String r4 = ", target density: "
            r19 = r13
            java.lang.String r13 = ", density: "
            r20 = r14
            java.lang.String r14 = "x"
            java.lang.String r1 = "Downsampler"
            if (r11 <= 0) goto L280
            if (r10 > 0) goto L92
            r0 = 3
            r7 = r1
            r1 = r4
            r15 = r10
            r5 = r12
            r4 = r13
            r10 = r8
            r13 = r11
            r11 = r9
            goto L289
        L92:
            boolean r21 = m12671h(r15)
            r23 = r4
            if (r21 == 0) goto La1
            r21 = r12
            r22 = r13
            r12 = r10
            r13 = r11
            goto La7
        La1:
            r21 = r12
            r22 = r13
            r13 = r10
            r12 = r11
        La7:
            float r4 = r0.mo12666b(r12, r13, r9, r8)
            r24 = 0
            int r24 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r24 <= 0) goto L23b
            r24 = r15
            int r15 = r0.mo12665a(r12, r13, r9, r8)
            if (r15 == 0) goto L233
            r25 = r10
            float r10 = (float) r12
            r26 = r11
            float r11 = r4 * r10
            r27 = r1
            double r0 = (double) r11
            int r0 = m12675l(r0)
            float r1 = (float) r13
            float r11 = r4 * r1
            r29 = r8
            r28 = r9
            double r8 = (double) r11
            int r8 = m12675l(r8)
            int r0 = r12 / r0
            int r8 = r13 / r8
            r9 = 1
            if (r15 != r9) goto Ldf
            int r0 = java.lang.Math.max(r0, r8)
            goto Le3
        Ldf:
            int r0 = java.lang.Math.min(r0, r8)
        Le3:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 23
            if (r8 > r9) goto Lf5
            java.util.Set<java.lang.String> r9 = p334t2.C6134l.f23686j
            java.lang.String r11 = r3.outMimeType
            boolean r9 = r9.contains(r11)
            if (r9 == 0) goto Lf5
            r0 = 1
            goto L10a
        Lf5:
            int r0 = java.lang.Integer.highestOneBit(r0)
            r9 = 1
            int r0 = java.lang.Math.max(r9, r0)
            if (r15 != r9) goto L10a
            float r9 = (float) r0
            r11 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11 / r4
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L10a
            int r0 = r0 << 1
        L10a:
            r3.inSampleSize = r0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            if (r6 != r9) goto L12c
            r5 = 8
            int r5 = java.lang.Math.min(r0, r5)
            float r5 = (float) r5
            float r10 = r10 / r5
            double r8 = (double) r10
            double r8 = java.lang.Math.ceil(r8)
            int r6 = (int) r8
            float r1 = r1 / r5
            double r8 = (double) r1
            double r8 = java.lang.Math.ceil(r8)
            int r1 = (int) r8
            int r5 = r0 / 8
            if (r5 <= 0) goto L17c
            int r6 = r6 / r5
            int r1 = r1 / r5
            goto L17c
        L12c:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r6 == r9) goto L16d
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r6 != r9) goto L135
            goto L16d
        L135:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP
            if (r6 == r9) goto L15d
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A
            if (r6 != r9) goto L13e
            goto L15d
        L13e:
            int r1 = r12 % r0
            if (r1 != 0) goto L14c
            int r1 = r13 % r0
            if (r1 == 0) goto L147
            goto L14c
        L147:
            int r6 = r12 / r0
            int r1 = r13 / r0
            goto L17c
        L14c:
            int[] r1 = m12670g(r2, r3, r7, r5)
            r5 = 0
            r5 = r1[r5]
            r6 = 1
            r1 = r1[r6]
            r6 = r33
            r11 = r28
            r10 = r29
            goto L183
        L15d:
            r5 = 24
            if (r8 < r5) goto L16d
            float r5 = (float) r0
            float r10 = r10 / r5
            int r6 = java.lang.Math.round(r10)
            float r1 = r1 / r5
            int r1 = java.lang.Math.round(r1)
            goto L17c
        L16d:
            float r5 = (float) r0
            float r10 = r10 / r5
            double r8 = (double) r10
            double r8 = java.lang.Math.floor(r8)
            int r6 = (int) r8
            float r1 = r1 / r5
            double r8 = (double) r1
            double r8 = java.lang.Math.floor(r8)
            int r1 = (int) r8
        L17c:
            r5 = r6
            r11 = r28
            r10 = r29
            r6 = r33
        L183:
            float r6 = r6.mo12666b(r5, r1, r11, r10)
            double r8 = (double) r6
            int r6 = m12669f(r8)
            double r12 = (double) r6
            double r12 = r12 * r8
            int r12 = m12675l(r12)
            float r13 = (float) r12
            float r6 = (float) r6
            float r13 = r13 / r6
            double r6 = (double) r13
            double r6 = r8 / r6
            double r12 = (double) r12
            double r6 = r6 * r12
            int r6 = m12675l(r6)
            r3.inTargetDensity = r6
            int r6 = m12669f(r8)
            r3.inDensity = r6
            int r7 = r3.inTargetDensity
            if (r7 <= 0) goto L1b2
            if (r6 <= 0) goto L1b2
            if (r7 == r6) goto L1b2
            r6 = 1
            goto L1b3
        L1b2:
            r6 = 0
        L1b3:
            if (r6 == 0) goto L1b9
            r6 = 1
            r3.inScaled = r6
            goto L1be
        L1b9:
            r6 = 0
            r3.inTargetDensity = r6
            r3.inDensity = r6
        L1be:
            r6 = 2
            r7 = r27
            boolean r6 = android.util.Log.isLoggable(r7, r6)
            if (r6 == 0) goto L229
            java.lang.String r6 = "Calculate scaling, source: ["
            java.lang.String r12 = "], degreesToRotate: "
            r15 = r25
            r13 = r26
            java.lang.StringBuilder r6 = androidx.recyclerview.widget.C0608s.m2117a(r6, r13, r14, r15, r12)
            r12 = r24
            r6.append(r12)
            java.lang.String r12 = ", target: ["
            r6.append(r12)
            r6.append(r11)
            r6.append(r14)
            r6.append(r10)
            java.lang.String r12 = "], power of two scaled: ["
            r6.append(r12)
            r6.append(r5)
            r6.append(r14)
            r6.append(r1)
            java.lang.String r1 = "], exact scale factor: "
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = ", power of 2 sample size: "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = ", adjusted scale factor: "
            r6.append(r0)
            r6.append(r8)
            r1 = r23
            r6.append(r1)
            int r0 = r3.inTargetDensity
            r6.append(r0)
            r4 = r22
            r6.append(r4)
            int r0 = r3.inDensity
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.v(r7, r0)
            goto L2b4
        L229:
            r4 = r22
            r1 = r23
            r15 = r25
            r13 = r26
            goto L2b4
        L233:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L23b:
            r6 = r0
            r15 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot scale with factor: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " from: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = ", source: ["
            r1.append(r2)
            r1.append(r13)
            r1.append(r14)
            r1.append(r15)
            java.lang.String r2 = "], target: ["
            r1.append(r2)
            r1.append(r11)
            r1.append(r14)
            r1.append(r10)
            r5 = r21
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L280:
            r7 = r1
            r1 = r4
            r15 = r10
            r5 = r12
            r4 = r13
            r10 = r8
            r13 = r11
            r11 = r9
            r0 = 3
        L289:
            boolean r0 = android.util.Log.isLoggable(r7, r0)
            if (r0 == 0) goto L2b4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "Unable to determine dimensions for: "
            r0.append(r8)
            r0.append(r6)
            java.lang.String r6 = " with target ["
            r0.append(r6)
            r0.append(r11)
            r0.append(r14)
            r0.append(r10)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r7, r0)
        L2b4:
            r5 = r30
            r6 = r7
            t2.q r0 = r5.f23693e
            r7 = r19
            r8 = r20
            boolean r0 = r0.m12683b(r11, r10, r7, r8)
            if (r0 == 0) goto L2ca
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.HARDWARE
            r3.inPreferredConfig = r7
            r7 = 0
            r3.inMutable = r7
        L2ca:
            if (r0 == 0) goto L2ce
            r7 = r1
            goto L310
        L2ce:
            com.bumptech.glide.load.b r0 = com.bumptech.glide.load.EnumC1009b.f5186Y
            r7 = r1
            r1 = r34
            if (r1 == r0) goto L30c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = r31.mo12687d()     // Catch: java.io.IOException -> L2de
            boolean r0 = r0.hasAlpha()     // Catch: java.io.IOException -> L2de
            goto L2fb
        L2de:
            r0 = move-exception
            r8 = 3
            boolean r8 = android.util.Log.isLoggable(r6, r8)
            if (r8 == 0) goto L2fa
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Cannot determine whether the image has alpha or not from header, format "
            r8.append(r9)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            android.util.Log.d(r6, r1, r0)
        L2fa:
            r0 = 0
        L2fb:
            if (r0 == 0) goto L300
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            goto L302
        L300:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
        L302:
            r3.inPreferredConfig = r0
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            if (r0 != r1) goto L310
            r0 = 1
            r3.inDither = r0
            goto L310
        L30c:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r3.inPreferredConfig = r0
        L310:
            int r0 = android.os.Build.VERSION.SDK_INT
            int r1 = r3.inSampleSize
            if (r13 < 0) goto L31e
            if (r15 < 0) goto L31e
            if (r39 == 0) goto L31e
            r8 = r10
            r9 = r11
            goto L396
        L31e:
            int r8 = r3.inTargetDensity
            if (r8 <= 0) goto L32a
            int r9 = r3.inDensity
            if (r9 <= 0) goto L32a
            if (r8 == r9) goto L32a
            r9 = 1
            goto L32b
        L32a:
            r9 = 0
        L32b:
            if (r9 == 0) goto L333
            float r8 = (float) r8
            int r9 = r3.inDensity
            float r9 = (float) r9
            float r8 = r8 / r9
            goto L335
        L333:
            r8 = 1065353216(0x3f800000, float:1.0)
        L335:
            float r9 = (float) r13
            float r10 = (float) r1
            float r9 = r9 / r10
            double r11 = (double) r9
            double r11 = java.lang.Math.ceil(r11)
            int r9 = (int) r11
            float r11 = (float) r15
            float r11 = r11 / r10
            double r10 = (double) r11
            double r10 = java.lang.Math.ceil(r10)
            int r10 = (int) r10
            float r9 = (float) r9
            float r9 = r9 * r8
            int r9 = java.lang.Math.round(r9)
            float r10 = (float) r10
            float r10 = r10 * r8
            int r10 = java.lang.Math.round(r10)
            r11 = 2
            boolean r11 = android.util.Log.isLoggable(r6, r11)
            if (r11 == 0) goto L395
            java.lang.String r11 = "Calculated target ["
            java.lang.String r12 = "] for source ["
            java.lang.StringBuilder r11 = androidx.recyclerview.widget.C0608s.m2117a(r11, r9, r14, r10, r12)
            r11.append(r13)
            r11.append(r14)
            r11.append(r15)
            java.lang.String r12 = "], sampleSize: "
            r11.append(r12)
            r11.append(r1)
            java.lang.String r1 = ", targetDensity: "
            r11.append(r1)
            int r1 = r3.inTargetDensity
            r11.append(r1)
            r11.append(r4)
            int r1 = r3.inDensity
            r11.append(r1)
            java.lang.String r1 = ", density multiplier: "
            r11.append(r1)
            r11.append(r8)
            java.lang.String r1 = r11.toString()
            android.util.Log.v(r6, r1)
        L395:
            r8 = r10
        L396:
            r10 = 26
            if (r9 <= 0) goto L3b5
            if (r8 <= 0) goto L3b5
            n2.c r11 = r5.f23689a
            if (r0 < r10) goto L3aa
            android.graphics.Bitmap$Config r12 = r3.inPreferredConfig
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
            if (r12 != r1) goto L3a7
            goto L3b5
        L3a7:
            android.graphics.Bitmap$Config r1 = r3.outConfig
            goto L3ab
        L3aa:
            r1 = 0
        L3ab:
            if (r1 != 0) goto L3af
            android.graphics.Bitmap$Config r1 = r3.inPreferredConfig
        L3af:
            android.graphics.Bitmap r1 = r11.mo10692d(r9, r8, r1)
            r3.inBitmap = r1
        L3b5:
            r1 = 28
            if (r0 < r1) goto L3d1
            com.bumptech.glide.load.e r0 = com.bumptech.glide.load.EnumC1027e.f5222Z
            r1 = r35
            if (r1 != r0) goto L3cb
            android.graphics.ColorSpace r0 = r3.outColorSpace
            if (r0 == 0) goto L3cb
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L3cb
            r0 = 1
            goto L3cc
        L3cb:
            r0 = 0
        L3cc:
            if (r0 == 0) goto L3d3
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L3d5
        L3d1:
            if (r0 < r10) goto L3db
        L3d3:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L3d5:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
        L3db:
            n2.c r0 = r5.f23689a
            r1 = r40
            android.graphics.Bitmap r0 = m12667d(r2, r3, r1, r0)
            n2.c r2 = r5.f23689a
            r1.mo12679a(r2, r0)
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r6, r1)
            if (r1 == 0) goto L471
            java.lang.String r1 = "Decoded "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = m12668e(r0)
            r1.append(r2)
            java.lang.String r2 = " from ["
            r1.append(r2)
            r1.append(r13)
            r1.append(r14)
            r1.append(r15)
            java.lang.String r2 = "] "
            r1.append(r2)
            r2 = r18
            r1.append(r2)
            java.lang.String r2 = " with inBitmap "
            r1.append(r2)
            android.graphics.Bitmap r2 = r3.inBitmap
            java.lang.String r2 = m12668e(r2)
            r1.append(r2)
            java.lang.String r2 = " for ["
            r1.append(r2)
            r2 = r37
            r1.append(r2)
            r1.append(r14)
            r2 = r38
            r1.append(r2)
            java.lang.String r2 = "], sample size: "
            r1.append(r2)
            int r2 = r3.inSampleSize
            r1.append(r2)
            r1.append(r4)
            int r2 = r3.inDensity
            r1.append(r2)
            r1.append(r7)
            int r2 = r3.inTargetDensity
            r1.append(r2)
            java.lang.String r2 = ", thread: "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = ", duration: "
            r1.append(r2)
            double r2 = p106g3.C2234f.m5833a(r16)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r6, r1)
        L471:
            if (r0 == 0) goto L504
            android.util.DisplayMetrics r1 = r5.f23690b
            int r1 = r1.densityDpi
            r0.setDensity(r1)
            n2.c r1 = r5.f23689a
            switch(r36) {
                case 2: goto L481;
                case 3: goto L481;
                case 4: goto L481;
                case 5: goto L481;
                case 6: goto L481;
                case 7: goto L481;
                case 8: goto L481;
                default: goto L47f;
            }
        L47f:
            r2 = 0
            goto L482
        L481:
            r2 = 1
        L482:
            if (r2 != 0) goto L487
            r1 = r0
            goto L4f8
        L487:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r4 = 1119092736(0x42b40000, float:90.0)
            r6 = 1127481344(0x43340000, float:180.0)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r36) {
                case 2: goto L4b5;
                case 3: goto L4b1;
                case 4: goto L4a8;
                case 5: goto L4a4;
                case 6: goto L4a0;
                case 7: goto L49c;
                case 8: goto L498;
                default: goto L497;
            }
        L497:
            goto L4ba
        L498:
            r2.setRotate(r3)
            goto L4ba
        L49c:
            r2.setRotate(r3)
            goto L4ab
        L4a0:
            r2.setRotate(r4)
            goto L4ba
        L4a4:
            r2.setRotate(r4)
            goto L4ab
        L4a8:
            r2.setRotate(r6)
        L4ab:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.postScale(r7, r3)
            goto L4ba
        L4b1:
            r2.setRotate(r6)
            goto L4ba
        L4b5:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setScale(r7, r3)
        L4ba:
            android.graphics.RectF r3 = new android.graphics.RectF
            int r4 = r0.getWidth()
            float r4 = (float) r4
            int r6 = r0.getHeight()
            float r6 = (float) r6
            r7 = 0
            r3.<init>(r7, r7, r4, r6)
            r2.mapRect(r3)
            float r4 = r3.width()
            int r4 = java.lang.Math.round(r4)
            float r6 = r3.height()
            int r6 = java.lang.Math.round(r6)
            android.graphics.Bitmap$Config r7 = p334t2.C6144v.m12692c(r0)
            android.graphics.Bitmap r1 = r1.mo10693e(r4, r6, r7)
            float r4 = r3.left
            float r4 = -r4
            float r3 = r3.top
            float r3 = -r3
            r2.postTranslate(r4, r3)
            boolean r3 = r0.hasAlpha()
            r1.setHasAlpha(r3)
            p334t2.C6144v.m12690a(r0, r1, r2)
        L4f8:
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L505
            n2.c r2 = r5.f23689a
            r2.mo10694f(r0)
            goto L505
        L504:
            r1 = 0
        L505:
            return r1
    }
}
