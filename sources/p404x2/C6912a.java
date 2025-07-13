package p404x2;

/* renamed from: x2.a */
/* loaded from: classes.dex */
public class C6912a implements p180k2.InterfaceC3674f<java.nio.ByteBuffer, p404x2.C6914c> {

    /* renamed from: f */
    public static final p404x2.C6912a.a f26893f = null;

    /* renamed from: g */
    public static final p404x2.C6912a.b f26894g = null;

    /* renamed from: a */
    public final android.content.Context f26895a;

    /* renamed from: b */
    public final java.util.List<com.bumptech.glide.load.ImageHeaderParser> f26896b;

    /* renamed from: c */
    public final p404x2.C6912a.b f26897c;

    /* renamed from: d */
    public final p404x2.C6912a.a f26898d;

    /* renamed from: e */
    public final p404x2.C6913b f26899e;

    /* renamed from: x2.a$a */
    public static class a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: x2.a$b */
    public static class b {

        /* renamed from: a */
        public final java.util.Queue<p160j2.C3391d> f26900a;

        public b() {
                r2 = this;
                r2.<init>()
                char[] r0 = p106g3.C2238j.f10214a
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r1 = 0
                r0.<init>(r1)
                r2.f26900a = r0
                return
        }

        /* renamed from: a */
        public synchronized void m14017a(p160j2.C3391d r2) {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r2.f14568b = r0     // Catch: java.lang.Throwable -> Ld
                r2.f14569c = r0     // Catch: java.lang.Throwable -> Ld
                java.util.Queue<j2.d> r0 = r1.f26900a     // Catch: java.lang.Throwable -> Ld
                r0.offer(r2)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r1)
                return
            Ld:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
        }
    }

    static {
            x2.a$a r0 = new x2.a$a
            r0.<init>()
            p404x2.C6912a.f26893f = r0
            x2.a$b r0 = new x2.a$b
            r0.<init>()
            p404x2.C6912a.f26894g = r0
            return
    }

    public C6912a(android.content.Context r3, java.util.List<com.bumptech.glide.load.ImageHeaderParser> r4, p229n2.InterfaceC4673c r5, p229n2.InterfaceC4672b r6) {
            r2 = this;
            x2.a$b r0 = p404x2.C6912a.f26894g
            x2.a$a r1 = p404x2.C6912a.f26893f
            r2.<init>()
            android.content.Context r3 = r3.getApplicationContext()
            r2.f26895a = r3
            r2.f26896b = r4
            r2.f26898d = r1
            x2.b r3 = new x2.b
            r3.<init>(r5, r6)
            r2.f26899e = r3
            r2.f26897c = r0
            return
    }

    /* renamed from: d */
    public static int m14015d(p160j2.C3390c r5, int r6, int r7) {
            int r0 = r5.f14562g
            int r0 = r0 / r7
            int r1 = r5.f14561f
            int r1 = r1 / r6
            int r0 = java.lang.Math.min(r0, r1)
            if (r0 != 0) goto Le
            r0 = 0
            goto L12
        Le:
            int r0 = java.lang.Integer.highestOneBit(r0)
        L12:
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            r2 = 2
            java.lang.String r3 = "BufferGifDecoder"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L4d
            if (r0 <= r1) goto L4d
            java.lang.String r1 = "Downsampling GIF, sampleSize: "
            java.lang.String r2 = ", target dimens: ["
            java.lang.String r4 = "x"
            java.lang.StringBuilder r6 = androidx.recyclerview.widget.C0608s.m2117a(r1, r0, r2, r6, r4)
            r6.append(r7)
            java.lang.String r7 = "], actual dimens: ["
            r6.append(r7)
            int r7 = r5.f14561f
            r6.append(r7)
            r6.append(r4)
            int r5 = r5.f14562g
            r6.append(r5)
            java.lang.String r5 = "]"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.v(r3, r5)
        L4d:
            return r0
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: a */
    public p214m2.InterfaceC4345w<p404x2.C6914c> mo8132a(java.nio.ByteBuffer r8, int r9, int r10, p180k2.C3673e r11) {
            r7 = this;
            r1 = r8
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            x2.a$b r8 = r7.f26897c
            monitor-enter(r8)
            java.util.Queue<j2.d> r0 = r8.f26900a     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L4f
            j2.d r0 = (p160j2.C3391d) r0     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L15
            j2.d r0 = new j2.d     // Catch: java.lang.Throwable -> L4f
            r0.<init>()     // Catch: java.lang.Throwable -> L4f
        L15:
            r6 = r0
            r0 = 0
            r6.f14568b = r0     // Catch: java.lang.Throwable -> L4f
            byte[] r0 = r6.f14567a     // Catch: java.lang.Throwable -> L4f
            r2 = 0
            java.util.Arrays.fill(r0, r2)     // Catch: java.lang.Throwable -> L4f
            j2.c r0 = new j2.c     // Catch: java.lang.Throwable -> L4f
            r0.<init>()     // Catch: java.lang.Throwable -> L4f
            r6.f14569c = r0     // Catch: java.lang.Throwable -> L4f
            r6.f14570d = r2     // Catch: java.lang.Throwable -> L4f
            java.nio.ByteBuffer r0 = r1.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L4f
            r6.f14568b = r0     // Catch: java.lang.Throwable -> L4f
            r0.position(r2)     // Catch: java.lang.Throwable -> L4f
            java.nio.ByteBuffer r0 = r6.f14568b     // Catch: java.lang.Throwable -> L4f
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L4f
            r0.order(r2)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r8)
            r0 = r7
            r2 = r9
            r3 = r10
            r4 = r6
            r5 = r11
            v2.c r8 = r0.m14016c(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L48
            x2.a$b r9 = r7.f26897c
            r9.m14017a(r6)
            return r8
        L48:
            r8 = move-exception
            x2.a$b r9 = r7.f26897c
            r9.m14017a(r6)
            throw r8
        L4f:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: b */
    public boolean mo8133b(java.nio.ByteBuffer r6, p180k2.C3673e r7) {
            r5 = this;
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            k2.d<java.lang.Boolean> r0 = p404x2.C6917f.f26938b
            java.lang.Object r7 = r7.m8130c(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r0 = 0
            if (r7 != 0) goto L39
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r7 = r5.f26896b
            if (r6 != 0) goto L18
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            goto L34
        L18:
            int r1 = r7.size()
            r2 = 0
        L1d:
            if (r2 >= r1) goto L32
            java.lang.Object r3 = r7.get(r2)
            com.bumptech.glide.load.ImageHeaderParser r3 = (com.bumptech.glide.load.ImageHeaderParser) r3
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = r3.mo2776a(r6)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            if (r3 == r4) goto L2f
            r6 = r3
            goto L34
        L2f:
            int r2 = r2 + 1
            goto L1d
        L32:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
        L34:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF
            if (r6 != r7) goto L39
            r0 = 1
        L39:
            return r0
    }

    /* renamed from: c */
    public final p368v2.C6494c m14016c(java.nio.ByteBuffer r17, int r18, int r19, p160j2.C3391d r20, p180k2.C3673e r21) {
            r16 = this;
            r1 = r16
            java.lang.String r2 = "Decoded GIF from stream in "
            java.lang.String r3 = "BufferGifDecoder"
            int r0 = p106g3.C2234f.f10203b
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()
            r6 = 2
            j2.c r0 = r20.m7766b()     // Catch: java.lang.Throwable -> Lb9
            int r7 = r0.f14558c     // Catch: java.lang.Throwable -> Lb9
            r8 = 0
            if (r7 <= 0) goto La0
            int r7 = r0.f14557b     // Catch: java.lang.Throwable -> Lb9
            if (r7 == 0) goto L1c
            goto La0
        L1c:
            k2.d<com.bumptech.glide.load.b> r7 = p404x2.C6917f.f26937a     // Catch: java.lang.Throwable -> Lb9
            r9 = r21
            java.lang.Object r7 = r9.m8130c(r7)     // Catch: java.lang.Throwable -> Lb9
            com.bumptech.glide.load.b r9 = com.bumptech.glide.load.EnumC1009b.f5187Z     // Catch: java.lang.Throwable -> Lb9
            if (r7 != r9) goto L2b
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Throwable -> Lb9
            goto L2d
        L2b:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> Lb9
        L2d:
            r13 = r18
            r14 = r19
            int r9 = m14015d(r0, r13, r14)     // Catch: java.lang.Throwable -> Lb9
            x2.a$a r10 = r1.f26898d     // Catch: java.lang.Throwable -> Lb9
            x2.b r11 = r1.f26899e     // Catch: java.lang.Throwable -> Lb9
            java.util.Objects.requireNonNull(r10)     // Catch: java.lang.Throwable -> Lb9
            j2.e r12 = new j2.e     // Catch: java.lang.Throwable -> Lb9
            r10 = r17
            r12.<init>(r11, r0, r10, r9)     // Catch: java.lang.Throwable -> Lb9
            r12.m7773h(r7)     // Catch: java.lang.Throwable -> Lb9
            int r0 = r12.f14581k     // Catch: java.lang.Throwable -> Lb9
            int r0 = r0 + 1
            j2.c r7 = r12.f14582l     // Catch: java.lang.Throwable -> Lb9
            int r7 = r7.f14558c     // Catch: java.lang.Throwable -> Lb9
            int r0 = r0 % r7
            r12.f14581k = r0     // Catch: java.lang.Throwable -> Lb9
            android.graphics.Bitmap r15 = r12.mo7760b()     // Catch: java.lang.Throwable -> Lb9
            if (r15 != 0) goto L70
            boolean r0 = android.util.Log.isLoggable(r3, r6)
            if (r0 == 0) goto L6f
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r2)
            double r4 = p106g3.C2234f.m5833a(r4)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
        L6f:
            return r8
        L70:
            k2.h<?> r0 = p322s2.C5946b.f22830b     // Catch: java.lang.Throwable -> Lb9
            s2.b r0 = (p322s2.C5946b) r0     // Catch: java.lang.Throwable -> Lb9
            x2.c r7 = new x2.c     // Catch: java.lang.Throwable -> Lb9
            android.content.Context r10 = r1.f26895a     // Catch: java.lang.Throwable -> Lb9
            r9 = r7
            r11 = r12
            r12 = r0
            r13 = r18
            r14 = r19
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Lb9
            v2.c r0 = new v2.c     // Catch: java.lang.Throwable -> Lb9
            r0.<init>(r7)     // Catch: java.lang.Throwable -> Lb9
            boolean r6 = android.util.Log.isLoggable(r3, r6)
            if (r6 == 0) goto L9f
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            double r4 = p106g3.C2234f.m5833a(r4)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r3, r2)
        L9f:
            return r0
        La0:
            boolean r0 = android.util.Log.isLoggable(r3, r6)
            if (r0 == 0) goto Lb8
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r2)
            double r4 = p106g3.C2234f.m5833a(r4)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
        Lb8:
            return r8
        Lb9:
            r0 = move-exception
            boolean r6 = android.util.Log.isLoggable(r3, r6)
            if (r6 == 0) goto Ld2
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            double r4 = p106g3.C2234f.m5833a(r4)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r3, r2)
        Ld2:
            throw r0
    }
}
