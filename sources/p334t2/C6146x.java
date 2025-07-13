package p334t2;

/* renamed from: t2.x */
/* loaded from: classes.dex */
public class C6146x<T> implements p180k2.InterfaceC3674f<T, android.graphics.Bitmap> {

    /* renamed from: d */
    public static final p180k2.C3672d<java.lang.Long> f23729d = null;

    /* renamed from: e */
    public static final p180k2.C3672d<java.lang.Integer> f23730e = null;

    /* renamed from: f */
    public static final p334t2.C6146x.e f23731f = null;

    /* renamed from: a */
    public final p334t2.C6146x.f<T> f23732a;

    /* renamed from: b */
    public final p229n2.InterfaceC4673c f23733b;

    /* renamed from: c */
    public final p334t2.C6146x.e f23734c;

    /* renamed from: t2.x$a */
    public class a implements p180k2.C3672d.b<java.lang.Long> {

        /* renamed from: a */
        public final java.nio.ByteBuffer f23735a;

        public a() {
                r1 = this;
                r1.<init>()
                r0 = 8
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                r1.f23735a = r0
                return
        }

        @Override // p180k2.C3672d.b
        /* renamed from: a */
        public void mo8129a(byte[] r4, java.lang.Long r5, java.security.MessageDigest r6) {
                r3 = this;
                java.lang.Long r5 = (java.lang.Long) r5
                r6.update(r4)
                java.nio.ByteBuffer r4 = r3.f23735a
                monitor-enter(r4)
                java.nio.ByteBuffer r0 = r3.f23735a     // Catch: java.lang.Throwable -> L21
                r1 = 0
                r0.position(r1)     // Catch: java.lang.Throwable -> L21
                java.nio.ByteBuffer r0 = r3.f23735a     // Catch: java.lang.Throwable -> L21
                long r1 = r5.longValue()     // Catch: java.lang.Throwable -> L21
                java.nio.ByteBuffer r5 = r0.putLong(r1)     // Catch: java.lang.Throwable -> L21
                byte[] r5 = r5.array()     // Catch: java.lang.Throwable -> L21
                r6.update(r5)     // Catch: java.lang.Throwable -> L21
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
                return
            L21:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
                throw r5
        }
    }

    /* renamed from: t2.x$b */
    public class b implements p180k2.C3672d.b<java.lang.Integer> {

        /* renamed from: a */
        public final java.nio.ByteBuffer f23736a;

        public b() {
                r1 = this;
                r1.<init>()
                r0 = 4
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                r1.f23736a = r0
                return
        }

        @Override // p180k2.C3672d.b
        /* renamed from: a */
        public void mo8129a(byte[] r3, java.lang.Integer r4, java.security.MessageDigest r5) {
                r2 = this;
                java.lang.Integer r4 = (java.lang.Integer) r4
                if (r4 != 0) goto L5
                goto L23
            L5:
                r5.update(r3)
                java.nio.ByteBuffer r3 = r2.f23736a
                monitor-enter(r3)
                java.nio.ByteBuffer r0 = r2.f23736a     // Catch: java.lang.Throwable -> L24
                r1 = 0
                r0.position(r1)     // Catch: java.lang.Throwable -> L24
                java.nio.ByteBuffer r0 = r2.f23736a     // Catch: java.lang.Throwable -> L24
                int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L24
                java.nio.ByteBuffer r4 = r0.putInt(r4)     // Catch: java.lang.Throwable -> L24
                byte[] r4 = r4.array()     // Catch: java.lang.Throwable -> L24
                r5.update(r4)     // Catch: java.lang.Throwable -> L24
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            L23:
                return
            L24:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
                throw r4
        }
    }

    /* renamed from: t2.x$c */
    public static final class c implements p334t2.C6146x.f<android.content.res.AssetFileDescriptor> {
        public c(p334t2.C6146x.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p334t2.C6146x.f
        /* renamed from: a */
        public void mo12694a(android.media.MediaMetadataRetriever r7, android.content.res.AssetFileDescriptor r8) {
                r6 = this;
                android.content.res.AssetFileDescriptor r8 = (android.content.res.AssetFileDescriptor) r8
                java.io.FileDescriptor r1 = r8.getFileDescriptor()
                long r2 = r8.getStartOffset()
                long r4 = r8.getLength()
                r0 = r7
                r0.setDataSource(r1, r2, r4)
                return
        }
    }

    /* renamed from: t2.x$d */
    public static final class d implements p334t2.C6146x.f<java.nio.ByteBuffer> {
        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p334t2.C6146x.f
        /* renamed from: a */
        public void mo12694a(android.media.MediaMetadataRetriever r2, java.nio.ByteBuffer r3) {
                r1 = this;
                java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
                t2.y r0 = new t2.y
                r0.<init>(r1, r3)
                r2.setDataSource(r0)
                return
        }
    }

    /* renamed from: t2.x$e */
    public static class e {
        public e() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: t2.x$f */
    public interface f<T> {
        /* renamed from: a */
        void mo12694a(android.media.MediaMetadataRetriever r1, T r2);
    }

    /* renamed from: t2.x$g */
    public static final class g implements p334t2.C6146x.f<android.os.ParcelFileDescriptor> {
        public g() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p334t2.C6146x.f
        /* renamed from: a */
        public void mo12694a(android.media.MediaMetadataRetriever r1, android.os.ParcelFileDescriptor r2) {
                r0 = this;
                android.os.ParcelFileDescriptor r2 = (android.os.ParcelFileDescriptor) r2
                java.io.FileDescriptor r2 = r2.getFileDescriptor()
                r1.setDataSource(r2)
                return
        }
    }

    /* renamed from: t2.x$h */
    public static final class h extends java.lang.RuntimeException {
        public h() {
                r1 = this;
                java.lang.String r0 = "MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details"
                r1.<init>(r0)
                return
        }
    }

    static {
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            t2.x$a r1 = new t2.x$a
            r1.<init>()
            k2.d r2 = new k2.d
            java.lang.String r3 = "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame"
            r2.<init>(r3, r0, r1)
            p334t2.C6146x.f23729d = r2
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            t2.x$b r1 = new t2.x$b
            r1.<init>()
            k2.d r2 = new k2.d
            java.lang.String r3 = "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption"
            r2.<init>(r3, r0, r1)
            p334t2.C6146x.f23730e = r2
            t2.x$e r0 = new t2.x$e
            r0.<init>()
            p334t2.C6146x.f23731f = r0
            return
    }

    public C6146x(p229n2.InterfaceC4673c r2, p334t2.C6146x.f<T> r3) {
            r1 = this;
            t2.x$e r0 = p334t2.C6146x.f23731f
            r1.<init>()
            r1.f23733b = r2
            r1.f23732a = r3
            r1.f23734c = r0
            return
    }

    /* renamed from: c */
    public static android.graphics.Bitmap m12693c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, p334t2.AbstractC6133k r15) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L62
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L62
            if (r14 == r0) goto L62
            t2.k r0 = p334t2.AbstractC6133k.f23678d
            if (r15 == r0) goto L62
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch: java.lang.Throwable -> L53
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L53
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch: java.lang.Throwable -> L53
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L53
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch: java.lang.Throwable -> L53
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L53
            r3 = 90
            if (r2 == r3) goto L36
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L39
        L36:
            r8 = r1
            r1 = r0
            r0 = r8
        L39:
            float r13 = r15.mo12666b(r0, r1, r13, r14)     // Catch: java.lang.Throwable -> L53
            float r14 = (float) r0     // Catch: java.lang.Throwable -> L53
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch: java.lang.Throwable -> L53
            float r14 = (float) r1     // Catch: java.lang.Throwable -> L53
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch: java.lang.Throwable -> L53
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = r2.getScaledFrameAtTime(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L53
            goto L63
        L53:
            r13 = move-exception
            r14 = 3
            java.lang.String r15 = "VideoDecoder"
            boolean r14 = android.util.Log.isLoggable(r15, r14)
            if (r14 == 0) goto L62
            java.lang.String r14 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
            android.util.Log.d(r15, r14, r13)
        L62:
            r13 = 0
        L63:
            if (r13 != 0) goto L69
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L69:
            if (r13 == 0) goto L6c
            return r13
        L6c:
            t2.x$h r9 = new t2.x$h
            r9.<init>()
            throw r9
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: a */
    public p214m2.InterfaceC4345w<android.graphics.Bitmap> mo8132a(T r9, int r10, int r11, p180k2.C3673e r12) {
            r8 = this;
            k2.d<java.lang.Long> r0 = p334t2.C6146x.f23729d
            java.lang.Object r0 = r12.m8130c(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L25
            r0 = -1
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L19
            goto L25
        L19:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Requested frame must be non-negative, or DEFAULT_FRAME, given: "
            java.lang.String r10 = p382w0.C6774a.m13748a(r10, r2)
            r9.<init>(r10)
            throw r9
        L25:
            k2.d<java.lang.Integer> r0 = p334t2.C6146x.f23730e
            java.lang.Object r0 = r12.m8130c(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L34
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L34:
            k2.d<t2.k> r1 = p334t2.AbstractC6133k.f23680f
            java.lang.Object r12 = r12.m8130c(r1)
            t2.k r12 = (p334t2.AbstractC6133k) r12
            if (r12 != 0) goto L40
            t2.k r12 = p334t2.AbstractC6133k.f23679e
        L40:
            r7 = r12
            t2.x$e r12 = r8.f23734c
            java.util.Objects.requireNonNull(r12)
            android.media.MediaMetadataRetriever r12 = new android.media.MediaMetadataRetriever
            r12.<init>()
            t2.x$f<T> r1 = r8.f23732a     // Catch: java.lang.Throwable -> L65
            r1.mo12694a(r12, r9)     // Catch: java.lang.Throwable -> L65
            int r4 = r0.intValue()     // Catch: java.lang.Throwable -> L65
            r1 = r12
            r5 = r10
            r6 = r11
            android.graphics.Bitmap r9 = m12693c(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L65
            r12.release()
            n2.c r10 = r8.f23733b
            t2.d r9 = p334t2.C6126d.m12654f(r9, r10)
            return r9
        L65:
            r9 = move-exception
            r12.release()
            throw r9
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: b */
    public boolean mo8133b(T r1, p180k2.C3673e r2) {
            r0 = this;
            r1 = 1
            return r1
    }
}
