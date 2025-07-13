package com.bumptech.glide;

/* renamed from: com.bumptech.glide.c */
/* loaded from: classes.dex */
public class ComponentCallbacks2C0999c implements android.content.ComponentCallbacks2 {

    /* renamed from: h0 */
    public static volatile com.bumptech.glide.ComponentCallbacks2C0999c f5095h0;

    /* renamed from: i0 */
    public static volatile boolean f5096i0;

    /* renamed from: Y */
    public final p229n2.InterfaceC4673c f5097Y;

    /* renamed from: Z */
    public final p244o2.InterfaceC4885i f5098Z;

    /* renamed from: a0 */
    public final com.bumptech.glide.C1001e f5099a0;

    /* renamed from: b0 */
    public final com.bumptech.glide.C1004h f5100b0;

    /* renamed from: c0 */
    public final p229n2.InterfaceC4672b f5101c0;

    /* renamed from: d0 */
    public final p445z2.C7238l f5102d0;

    /* renamed from: e0 */
    public final p445z2.InterfaceC7229c f5103e0;

    /* renamed from: f0 */
    public final java.util.List<com.bumptech.glide.ComponentCallbacks2C1006j> f5104f0;

    /* renamed from: g0 */
    public int f5105g0;

    /* renamed from: com.bumptech.glide.c$a */
    public interface a {
    }

    public ComponentCallbacks2C0999c(android.content.Context r27, p214m2.C4334l r28, p244o2.InterfaceC4885i r29, p229n2.InterfaceC4673c r30, p229n2.InterfaceC4672b r31, p445z2.C7238l r32, p445z2.InterfaceC7229c r33, int r34, com.bumptech.glide.ComponentCallbacks2C0999c.a r35, java.util.Map<java.lang.Class<?>, com.bumptech.glide.AbstractC1007k<?, ?>> r36, java.util.List<p033c3.InterfaceC0861g<java.lang.Object>> r37, com.bumptech.glide.C1002f r38) {
            r26 = this;
            r1 = r26
            r0 = r27
            r2 = r30
            r4 = r31
            java.lang.Class<j2.a> r3 = p160j2.InterfaceC3388a.class
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            java.lang.Class<byte[]> r7 = byte[].class
            r26.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r1.f5104f0 = r8
            r8 = 2
            r1.f5105g0 = r8
            r1.f5097Y = r2
            r1.f5101c0 = r4
            r9 = r29
            r1.f5098Z = r9
            r9 = r32
            r1.f5102d0 = r9
            r9 = r33
            r1.f5103e0 = r9
            android.content.res.Resources r9 = r27.getResources()
            com.bumptech.glide.h r10 = new com.bumptech.glide.h
            r10.<init>()
            r1.f5100b0 = r10
            t2.j r11 = new t2.j
            r11.<init>()
            b3.b r12 = r10.f5146g
            monitor-enter(r12)
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r13 = r12.f3814a     // Catch: java.lang.Throwable -> L3e0
            r13.add(r11)     // Catch: java.lang.Throwable -> L3e0
            monitor-exit(r12)
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 27
            if (r11 < r12) goto L5e
            t2.o r12 = new t2.o
            r12.<init>()
            b3.b r13 = r10.f5146g
            monitor-enter(r13)
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r14 = r13.f3814a     // Catch: java.lang.Throwable -> L5b
            r14.add(r12)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r13)
            goto L5e
        L5b:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L5e:
            java.util.List r12 = r10.m2743e()
            x2.a r13 = new x2.a
            r13.<init>(r0, r12, r2, r4)
            t2.x r14 = new t2.x
            t2.x$g r15 = new t2.x$g
            r15.<init>()
            r14.<init>(r2, r15)
            t2.l r15 = new t2.l
            java.util.List r8 = r10.m2743e()
            android.util.DisplayMetrics r1 = r9.getDisplayMetrics()
            r15.<init>(r8, r1, r2, r4)
            java.lang.Class<com.bumptech.glide.d$b> r1 = com.bumptech.glide.C1000d.b.class
            r8 = r38
            r17 = r7
            java.util.Map<java.lang.Class<?>, java.lang.Object> r7 = r8.f5133a
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L9b
            r1 = 28
            if (r11 < r1) goto L9b
            t2.s r1 = new t2.s
            r1.<init>()
            t2.g r7 = new t2.g
            r7.<init>()
            goto La6
        L9b:
            t2.f r7 = new t2.f
            r1 = 0
            r7.<init>(r15, r1)
            t2.u r1 = new t2.u
            r1.<init>(r15, r4)
        La6:
            v2.d r8 = new v2.d
            r8.<init>(r0)
            r29 = r11
            q2.r$c r11 = new q2.r$c
            r11.<init>(r9)
            q2.r$d r0 = new q2.r$d
            r0.<init>(r9)
            r18 = r5
            q2.r$b r5 = new q2.r$b
            r5.<init>(r9)
            r32 = r0
            q2.r$a r0 = new q2.r$a
            r0.<init>(r9)
            r33 = r0
            t2.b r0 = new t2.b
            r0.<init>(r4)
            r19 = r6
            y2.a r6 = new y2.a
            r6.<init>()
            r20 = r6
            t8.e r6 = new t8.e
            r21 = r5
            r5 = 2
            r6.<init>(r5)
            android.content.ContentResolver r5 = r27.getContentResolver()
            r16 = r6
            java.lang.Class<java.nio.ByteBuffer> r6 = java.nio.ByteBuffer.class
            r22 = r5
            v1.b r5 = new v1.b
            r23 = r11
            r11 = 1
            r5.<init>(r11)
            r10.m2740b(r6, r5)
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            f.t r6 = new f.t
            r6.<init>(r4)
            r10.m2740b(r5, r6)
            java.lang.String r5 = "Bitmap"
            java.lang.Class<java.nio.ByteBuffer> r6 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.Bitmap> r11 = android.graphics.Bitmap.class
            r10.m2742d(r5, r6, r11, r7)
            java.lang.String r5 = "Bitmap"
            java.lang.Class<java.io.InputStream> r6 = java.io.InputStream.class
            java.lang.Class<android.graphics.Bitmap> r11 = android.graphics.Bitmap.class
            r10.m2742d(r5, r6, r11, r1)
            java.lang.String r5 = "Bitmap"
            java.lang.Class<android.os.ParcelFileDescriptor> r6 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r11 = android.graphics.Bitmap.class
            r24 = r8
            t2.f r8 = new t2.f
            r25 = r3
            r3 = 1
            r8.<init>(r15, r3)
            r10.m2742d(r5, r6, r11, r8)
            java.lang.String r3 = "Bitmap"
            java.lang.Class<android.os.ParcelFileDescriptor> r5 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r6 = android.graphics.Bitmap.class
            r10.m2742d(r3, r5, r6, r14)
            java.lang.String r3 = "Bitmap"
            java.lang.Class<android.content.res.AssetFileDescriptor> r5 = android.content.res.AssetFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r6 = android.graphics.Bitmap.class
            t2.x r8 = new t2.x
            t2.x$c r11 = new t2.x$c
            r15 = 0
            r11.<init>(r15)
            r8.<init>(r2, r11)
            r10.m2742d(r3, r5, r6, r8)
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            q2.t$a<?> r6 = p282q2.C5563t.a.f21657a
            r10.m2739a(r3, r5, r6)
            java.lang.String r3 = "Bitmap"
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.Bitmap> r8 = android.graphics.Bitmap.class
            t2.w r11 = new t2.w
            r11.<init>()
            r10.m2742d(r3, r5, r8, r11)
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            r10.m2741c(r3, r0)
            java.lang.String r3 = "BitmapDrawable"
            java.lang.Class<java.nio.ByteBuffer> r5 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r8 = android.graphics.drawable.BitmapDrawable.class
            t2.a r11 = new t2.a
            r11.<init>(r9, r7)
            r10.m2742d(r3, r5, r8, r11)
            java.lang.String r3 = "BitmapDrawable"
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r7 = android.graphics.drawable.BitmapDrawable.class
            t2.a r8 = new t2.a
            r8.<init>(r9, r1)
            r10.m2742d(r3, r5, r7, r8)
            java.lang.String r1 = "BitmapDrawable"
            java.lang.Class<android.os.ParcelFileDescriptor> r3 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r5 = android.graphics.drawable.BitmapDrawable.class
            t2.a r7 = new t2.a
            r7.<init>(r9, r14)
            r10.m2742d(r1, r3, r5, r7)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            androidx.appcompat.widget.x r3 = new androidx.appcompat.widget.x
            r3.<init>(r2, r0)
            r10.m2741c(r1, r3)
            java.lang.String r0 = "Gif"
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            java.lang.Class<x2.c> r3 = p404x2.C6914c.class
            x2.g r5 = new x2.g
            r5.<init>(r12, r13, r4)
            r10.m2742d(r0, r1, r3, r5)
            java.lang.String r0 = "Gif"
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.Class<x2.c> r3 = p404x2.C6914c.class
            r10.m2742d(r0, r1, r3, r13)
            java.lang.Class<x2.c> r0 = p404x2.C6914c.class
            m2.q r1 = new m2.q
            r3 = 1
            r1.<init>(r3)
            r10.m2741c(r0, r1)
            r0 = r25
            r10.m2739a(r0, r0, r6)
            java.lang.String r1 = "Bitmap"
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            t2.f r5 = new t2.f
            r5.<init>(r2)
            r10.m2742d(r1, r0, r3, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            java.lang.String r3 = "legacy_append"
            r5 = r24
            r10.m2742d(r3, r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            t2.a r3 = new t2.a
            r3.<init>(r5, r2)
            java.lang.String r5 = "legacy_append"
            r10.m2742d(r5, r0, r1, r3)
            u2.a$a r0 = new u2.a$a
            r0.<init>()
            r10.m2745g(r0)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            q2.c$b r3 = new q2.c$b
            r3.<init>()
            r10.m2739a(r0, r1, r3)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            q2.e$e r3 = new q2.e$e
            r3.<init>()
            r10.m2739a(r0, r1, r3)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.File> r1 = java.io.File.class
            w2.a r3 = new w2.a
            r3.<init>()
            java.lang.String r5 = "legacy_append"
            r10.m2742d(r5, r0, r1, r3)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            q2.e$b r3 = new q2.e$b
            r3.<init>()
            r10.m2739a(r0, r1, r3)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r10.m2739a(r0, r1, r6)
            com.bumptech.glide.load.data.k$a r0 = new com.bumptech.glide.load.data.k$a
            r0.<init>(r4)
            r10.m2745g(r0)
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a
            r0.<init>()
            r10.m2745g(r0)
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            r3 = r23
            r10.m2739a(r0, r1, r3)
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            r5 = r21
            r10.m2739a(r0, r1, r5)
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            r7 = r19
            r10.m2739a(r7, r1, r3)
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            r10.m2739a(r7, r1, r5)
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r3 = r32
            r10.m2739a(r7, r1, r3)
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            r5 = r33
            r10.m2739a(r0, r1, r5)
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            r10.m2739a(r7, r1, r5)
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r10.m2739a(r0, r1, r3)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            q2.d$c r1 = new q2.d$c
            r1.<init>()
            r3 = r18
            r10.m2739a(r3, r0, r1)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            q2.d$c r5 = new q2.d$c
            r5.<init>()
            r10.m2739a(r0, r1, r5)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            q2.s$c r1 = new q2.s$c
            r1.<init>()
            r10.m2739a(r3, r0, r1)
            java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
            q2.s$b r1 = new q2.s$b
            r1.<init>()
            r10.m2739a(r3, r0, r1)
            java.lang.Class<android.content.res.AssetFileDescriptor> r0 = android.content.res.AssetFileDescriptor.class
            q2.s$a r1 = new q2.s$a
            r1.<init>()
            r10.m2739a(r3, r0, r1)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            q2.a$c r3 = new q2.a$c
            android.content.res.AssetManager r5 = r27.getAssets()
            r3.<init>(r5)
            r10.m2739a(r0, r1, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            q2.a$b r3 = new q2.a$b
            android.content.res.AssetManager r5 = r27.getAssets()
            r3.<init>(r5)
            r10.m2739a(r0, r1, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            r2.b$a r3 = new r2.b$a
            r5 = r27
            r3.<init>(r5)
            r10.m2739a(r0, r1, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            r2.c$a r3 = new r2.c$a
            r3.<init>(r5)
            r10.m2739a(r0, r1, r3)
            r0 = 29
            r1 = r29
            if (r1 < r0) goto L2ed
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            r2.d$c r7 = new r2.d$c
            r7.<init>(r5)
            r10.m2739a(r0, r3, r7)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r3 = android.os.ParcelFileDescriptor.class
            r2.d$b r7 = new r2.d$b
            r7.<init>(r5)
            r10.m2739a(r0, r3, r7)
        L2ed:
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            q2.u$d r7 = new q2.u$d
            r8 = r22
            r7.<init>(r8)
            r10.m2739a(r0, r3, r7)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r3 = android.os.ParcelFileDescriptor.class
            q2.u$b r7 = new q2.u$b
            r7.<init>(r8)
            r10.m2739a(r0, r3, r7)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.content.res.AssetFileDescriptor> r3 = android.content.res.AssetFileDescriptor.class
            q2.u$a r7 = new q2.u$a
            r7.<init>(r8)
            r10.m2739a(r0, r3, r7)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            q2.v$a r7 = new q2.v$a
            r7.<init>()
            r10.m2739a(r0, r3, r7)
            java.lang.Class<java.net.URL> r0 = java.net.URL.class
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            r2.e$a r7 = new r2.e$a
            r7.<init>()
            r10.m2739a(r0, r3, r7)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.File> r3 = java.io.File.class
            q2.j$a r7 = new q2.j$a
            r7.<init>(r5)
            r10.m2739a(r0, r3, r7)
            java.lang.Class<q2.f> r0 = p282q2.C5549f.class
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            r2.a$a r7 = new r2.a$a
            r7.<init>()
            r10.m2739a(r0, r3, r7)
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            q2.b$a r3 = new q2.b$a
            r3.<init>()
            r7 = r17
            r10.m2739a(r7, r0, r3)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            q2.b$d r3 = new q2.b$d
            r3.<init>()
            r10.m2739a(r7, r0, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.net.Uri> r3 = android.net.Uri.class
            r10.m2739a(r0, r3, r6)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.Class<android.graphics.drawable.Drawable> r3 = android.graphics.drawable.Drawable.class
            r10.m2739a(r0, r3, r6)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.Class<android.graphics.drawable.Drawable> r3 = android.graphics.drawable.Drawable.class
            v2.e r6 = new v2.e
            r6.<init>()
            java.lang.String r8 = "legacy_append"
            r10.m2742d(r8, r0, r3, r6)
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r3 = android.graphics.drawable.BitmapDrawable.class
            f.t r6 = new f.t
            r6.<init>(r9)
            r10.m2746h(r0, r3, r6)
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            r3 = r20
            r10.m2746h(r0, r7, r3)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            androidx.fragment.app.l0 r6 = new androidx.fragment.app.l0
            r8 = r16
            r6.<init>(r2, r3, r8)
            r10.m2746h(r0, r7, r6)
            java.lang.Class<x2.c> r0 = p404x2.C6914c.class
            r10.m2746h(r0, r7, r8)
            r0 = 23
            if (r1 < r0) goto L3be
            t2.x r0 = new t2.x
            t2.x$d r1 = new t2.x$d
            r1.<init>()
            r0.<init>(r2, r1)
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            java.lang.String r3 = "legacy_append"
            r10.m2742d(r3, r1, r2, r0)
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r2 = android.graphics.drawable.BitmapDrawable.class
            t2.a r3 = new t2.a
            r3.<init>(r9, r0)
            java.lang.String r0 = "legacy_append"
            r10.m2742d(r0, r1, r2, r3)
        L3be:
            v1.b r6 = new v1.b
            r0 = 4
            r6.<init>(r0)
            com.bumptech.glide.e r0 = new com.bumptech.glide.e
            r2 = r0
            r3 = r27
            r4 = r31
            r5 = r10
            r7 = r35
            r8 = r36
            r9 = r37
            r10 = r28
            r11 = r38
            r12 = r34
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r26
            r1.f5099a0 = r0
            return
        L3e0:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
    }

    /* renamed from: a */
    public static void m2733a(android.content.Context r25, com.bumptech.glide.GeneratedAppGlideModule r26) {
            r0 = r26
            boolean r1 = com.bumptech.glide.ComponentCallbacks2C0999c.f5096i0
            if (r1 != 0) goto L330
            r1 = 1
            com.bumptech.glide.ComponentCallbacks2C0999c.f5096i0 = r1
            com.bumptech.glide.d r2 = new com.bumptech.glide.d
            r2.<init>()
            android.content.Context r15 = r25.getApplicationContext()
            java.util.List r3 = java.util.Collections.emptyList()
            r4 = 3
            r5 = 2
            if (r0 == 0) goto L25
            boolean r6 = r26.mo17c()
            if (r6 == 0) goto L21
            goto L25
        L21:
            r16 = r3
            goto Lc4
        L25:
            java.lang.String r3 = "ManifestParser"
            boolean r6 = android.util.Log.isLoggable(r3, r4)
            if (r6 == 0) goto L32
            java.lang.String r6 = "Loading Glide modules"
            android.util.Log.d(r3, r6)
        L32:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.content.pm.PackageManager r7 = r15.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            java.lang.String r8 = r15.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            r9 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo(r8, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            android.os.Bundle r8 = r7.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            if (r8 != 0) goto L55
            boolean r5 = android.util.Log.isLoggable(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            if (r5 == 0) goto Lc2
            java.lang.String r5 = "Got null app info metadata"
            android.util.Log.d(r3, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            goto Lc2
        L55:
            boolean r5 = android.util.Log.isLoggable(r3, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            if (r5 == 0) goto L71
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            r5.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            java.lang.String r8 = "Got app info metadata: "
            r5.append(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            android.os.Bundle r8 = r7.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            r5.append(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            java.lang.String r5 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            android.util.Log.v(r3, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
        L71:
            android.os.Bundle r5 = r7.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            java.util.Set r5 = r5.keySet()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            java.util.Iterator r5 = r5.iterator()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
        L7b:
            boolean r8 = r5.hasNext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            if (r8 == 0) goto Lb7
            java.lang.Object r8 = r5.next()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            java.lang.String r8 = (java.lang.String) r8     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            java.lang.String r9 = "GlideModule"
            android.os.Bundle r10 = r7.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            java.lang.Object r10 = r10.get(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            boolean r9 = r9.equals(r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            if (r9 == 0) goto L7b
            a3.c r9 = p004a3.C0010e.m19a(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            r6.add(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            boolean r9 = android.util.Log.isLoggable(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            if (r9 == 0) goto L7b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            r9.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            java.lang.String r10 = "Loaded Glide module: "
            r9.append(r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            r9.append(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            java.lang.String r8 = r9.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            android.util.Log.d(r3, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L327
            goto L7b
        Lb7:
            boolean r5 = android.util.Log.isLoggable(r3, r4)
            if (r5 == 0) goto Lc2
            java.lang.String r5 = "Finished loading Glide modules"
            android.util.Log.d(r3, r5)
        Lc2:
            r16 = r6
        Lc4:
            java.lang.String r3 = "Glide"
            if (r0 == 0) goto L10f
            java.util.Set r5 = r26.mo2730d()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L10f
            java.util.Set r5 = r26.mo2730d()
            java.util.Iterator r6 = r16.iterator()
        Lda:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L10f
            java.lang.Object r7 = r6.next()
            a3.c r7 = (p004a3.InterfaceC0008c) r7
            java.lang.Class r8 = r7.getClass()
            boolean r8 = r5.contains(r8)
            if (r8 != 0) goto Lf1
            goto Lda
        Lf1:
            boolean r8 = android.util.Log.isLoggable(r3, r4)
            if (r8 == 0) goto L10b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "AppGlideModule excludes manifest GlideModule: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.d(r3, r7)
        L10b:
            r6.remove()
            goto Lda
        L10f:
            boolean r4 = android.util.Log.isLoggable(r3, r4)
            if (r4 == 0) goto L13a
            java.util.Iterator r4 = r16.iterator()
        L119:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L13a
            java.lang.Object r5 = r4.next()
            a3.c r5 = (p004a3.InterfaceC0008c) r5
            java.lang.String r6 = "Discovered GlideModule from manifest: "
            java.lang.StringBuilder r6 = android.support.v4.media.C0144c.m256a(r6)
            java.lang.Class r5 = r5.getClass()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.d(r3, r5)
            goto L119
        L13a:
            if (r0 == 0) goto L141
            z2.l$b r3 = r26.mo2731e()
            goto L142
        L141:
            r3 = 0
        L142:
            r2.f5119n = r3
            java.util.Iterator r3 = r16.iterator()
        L148:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L158
            java.lang.Object r4 = r3.next()
            a3.c r4 = (p004a3.InterfaceC0008c) r4
            r4.mo16a(r15, r2)
            goto L148
        L158:
            if (r0 == 0) goto L15d
            r0.mo16a(r15, r2)
        L15d:
            p2.a r3 = r2.f5112g
            r4 = 0
            if (r3 != 0) goto L195
            int r7 = p266p2.ExecutorServiceC5346a.m11653a()
            java.lang.String r3 = "source"
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L18d
            java.util.concurrent.ThreadPoolExecutor r13 = new java.util.concurrent.ThreadPoolExecutor
            r8 = 0
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.PriorityBlockingQueue r11 = new java.util.concurrent.PriorityBlockingQueue
            r11.<init>()
            p2.a$a r12 = new p2.a$a
            p2.a$b r5 = p266p2.ExecutorServiceC5346a.b.f21263a
            r12.<init>(r3, r5, r4)
            r5 = r13
            r6 = r7
            r5.<init>(r6, r7, r8, r10, r11, r12)
            p2.a r3 = new p2.a
            r3.<init>(r13)
            r2.f5112g = r3
            goto L195
        L18d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Name must be non-null and non-empty, but given: source"
            r0.<init>(r1)
            throw r0
        L195:
            p2.a r3 = r2.f5113h
            if (r3 != 0) goto L1cb
            int r3 = p266p2.ExecutorServiceC5346a.f21257a0
            java.lang.String r3 = "disk-cache"
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L1c3
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor
            r9 = 0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.PriorityBlockingQueue r12 = new java.util.concurrent.PriorityBlockingQueue
            r12.<init>()
            p2.a$a r13 = new p2.a$a
            p2.a$b r6 = p266p2.ExecutorServiceC5346a.b.f21263a
            r13.<init>(r3, r6, r1)
            r8 = 1
            r6 = r5
            r7 = r8
            r6.<init>(r7, r8, r9, r11, r12, r13)
            p2.a r3 = new p2.a
            r3.<init>(r5)
            r2.f5113h = r3
            goto L1cb
        L1c3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Name must be non-null and non-empty, but given: disk-cache"
            r0.<init>(r1)
            throw r0
        L1cb:
            p2.a r3 = r2.f5120o
            if (r3 != 0) goto L20a
            int r3 = p266p2.ExecutorServiceC5346a.m11653a()
            r5 = 4
            if (r3 < r5) goto L1d9
            r3 = 2
            r7 = 2
            goto L1db
        L1d9:
            r3 = 1
            r7 = 1
        L1db:
            java.lang.String r3 = "animation"
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L202
            java.util.concurrent.ThreadPoolExecutor r13 = new java.util.concurrent.ThreadPoolExecutor
            r8 = 0
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.PriorityBlockingQueue r11 = new java.util.concurrent.PriorityBlockingQueue
            r11.<init>()
            p2.a$a r12 = new p2.a$a
            p2.a$b r5 = p266p2.ExecutorServiceC5346a.b.f21263a
            r12.<init>(r3, r5, r1)
            r5 = r13
            r6 = r7
            r5.<init>(r6, r7, r8, r10, r11, r12)
            p2.a r1 = new p2.a
            r1.<init>(r13)
            r2.f5120o = r1
            goto L20a
        L202:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Name must be non-null and non-empty, but given: animation"
            r0.<init>(r1)
            throw r0
        L20a:
            o2.j r1 = r2.f5115j
            if (r1 != 0) goto L21a
            o2.j$a r1 = new o2.j$a
            r1.<init>(r15)
            o2.j r3 = new o2.j
            r3.<init>(r1)
            r2.f5115j = r3
        L21a:
            z2.c r1 = r2.f5116k
            if (r1 != 0) goto L225
            z2.e r1 = new z2.e
            r1.<init>()
            r2.f5116k = r1
        L225:
            n2.c r1 = r2.f5109d
            if (r1 != 0) goto L23f
            o2.j r1 = r2.f5115j
            int r1 = r1.f19372a
            if (r1 <= 0) goto L238
            n2.i r3 = new n2.i
            long r5 = (long) r1
            r3.<init>(r5)
            r2.f5109d = r3
            goto L23f
        L238:
            n2.d r1 = new n2.d
            r1.<init>()
            r2.f5109d = r1
        L23f:
            n2.b r1 = r2.f5110e
            if (r1 != 0) goto L24e
            n2.h r1 = new n2.h
            o2.j r3 = r2.f5115j
            int r3 = r3.f19375d
            r1.<init>(r3)
            r2.f5110e = r1
        L24e:
            o2.i r1 = r2.f5111f
            if (r1 != 0) goto L25e
            o2.h r1 = new o2.h
            o2.j r3 = r2.f5115j
            int r3 = r3.f19373b
            long r5 = (long) r3
            r1.<init>(r5)
            r2.f5111f = r1
        L25e:
            o2.a$a r1 = r2.f5114i
            if (r1 != 0) goto L269
            o2.g r1 = new o2.g
            r1.<init>(r15)
            r2.f5114i = r1
        L269:
            m2.l r1 = r2.f5108c
            if (r1 != 0) goto L2a5
            m2.l r1 = new m2.l
            o2.i r6 = r2.f5111f
            o2.a$a r7 = r2.f5114i
            p2.a r8 = r2.f5113h
            p2.a r9 = r2.f5112g
            p2.a r10 = new p2.a
            java.util.concurrent.ThreadPoolExecutor r3 = new java.util.concurrent.ThreadPoolExecutor
            long r20 = p266p2.ExecutorServiceC5346a.f21256Z
            java.util.concurrent.TimeUnit r22 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.SynchronousQueue r23 = new java.util.concurrent.SynchronousQueue
            r23.<init>()
            p2.a$a r5 = new p2.a$a
            p2.a$b r11 = p266p2.ExecutorServiceC5346a.b.f21263a
            java.lang.String r12 = "source-unlimited"
            r5.<init>(r12, r11, r4)
            r18 = 0
            r19 = 2147483647(0x7fffffff, float:NaN)
            r17 = r3
            r24 = r5
            r17.<init>(r18, r19, r20, r22, r23, r24)
            r10.<init>(r3)
            p2.a r11 = r2.f5120o
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r2.f5108c = r1
        L2a5:
            java.util.List<c3.g<java.lang.Object>> r1 = r2.f5121p
            if (r1 != 0) goto L2ae
            java.util.List r1 = java.util.Collections.emptyList()
            goto L2b2
        L2ae:
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
        L2b2:
            r2.f5121p = r1
            com.bumptech.glide.f$a r1 = r2.f5107b
            java.util.Objects.requireNonNull(r1)
            com.bumptech.glide.f r14 = new com.bumptech.glide.f
            r14.<init>(r1)
            z2.l r9 = new z2.l
            z2.l$b r1 = r2.f5119n
            r9.<init>(r1, r14)
            com.bumptech.glide.c r1 = new com.bumptech.glide.c
            m2.l r5 = r2.f5108c
            o2.i r6 = r2.f5111f
            n2.c r7 = r2.f5109d
            n2.b r8 = r2.f5110e
            z2.c r10 = r2.f5116k
            int r11 = r2.f5117l
            com.bumptech.glide.c$a r12 = r2.f5118m
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.k<?, ?>> r13 = r2.f5106a
            java.util.List<c3.g<java.lang.Object>> r2 = r2.f5121p
            r17 = 0
            r3 = r1
            r4 = r15
            r18 = r14
            r14 = r2
            r2 = r15
            r15 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.util.Iterator r3 = r16.iterator()
        L2ea:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L318
            java.lang.Object r4 = r3.next()
            a3.c r4 = (p004a3.InterfaceC0008c) r4
            com.bumptech.glide.h r5 = r1.f5100b0     // Catch: java.lang.AbstractMethodError -> L2fc
            r4.mo18b(r2, r1, r5)     // Catch: java.lang.AbstractMethodError -> L2fc
            goto L2ea
        L2fc:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L318:
            if (r0 == 0) goto L31f
            com.bumptech.glide.h r3 = r1.f5100b0
            r0.mo18b(r2, r1, r3)
        L31f:
            r2.registerComponentCallbacks(r1)
            com.bumptech.glide.ComponentCallbacks2C0999c.f5095h0 = r1
            com.bumptech.glide.ComponentCallbacks2C0999c.f5096i0 = r17
            return
        L327:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to find metadata to parse GlideModules"
            r1.<init>(r2, r0)
            throw r1
        L330:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: b */
    public static com.bumptech.glide.ComponentCallbacks2C0999c m2734b(android.content.Context r7) {
            com.bumptech.glide.c r0 = com.bumptech.glide.ComponentCallbacks2C0999c.f5095h0
            if (r0 != 0) goto L59
            android.content.Context r0 = r7.getApplicationContext()
            r1 = 0
            java.lang.Class<com.bumptech.glide.GeneratedAppGlideModuleImpl> r2 = com.bumptech.glide.GeneratedAppGlideModuleImpl.class
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L31 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L3b
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L31 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L3b
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L31 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L3b
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L31 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L3b
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L31 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L3b
            r3[r6] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L31 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L3b
            java.lang.Object r0 = r2.newInstance(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L31 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L3b
            com.bumptech.glide.GeneratedAppGlideModule r0 = (com.bumptech.glide.GeneratedAppGlideModule) r0     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L31 java.lang.InstantiationException -> L36 java.lang.ClassNotFoundException -> L3b
            r1 = r0
            goto L4a
        L27:
            r7 = move-exception
            m2735d(r7)
            throw r1
        L2c:
            r7 = move-exception
            m2735d(r7)
            throw r1
        L31:
            r7 = move-exception
            m2735d(r7)
            throw r1
        L36:
            r7 = move-exception
            m2735d(r7)
            throw r1
        L3b:
            r0 = 5
            java.lang.String r2 = "Glide"
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto L4a
            java.lang.String r0 = "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"
            android.util.Log.w(r2, r0)
        L4a:
            java.lang.Class<com.bumptech.glide.c> r0 = com.bumptech.glide.ComponentCallbacks2C0999c.class
            monitor-enter(r0)
            com.bumptech.glide.c r2 = com.bumptech.glide.ComponentCallbacks2C0999c.f5095h0     // Catch: java.lang.Throwable -> L56
            if (r2 != 0) goto L54
            m2733a(r7, r1)     // Catch: java.lang.Throwable -> L56
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            goto L59
        L56:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            throw r7
        L59:
            com.bumptech.glide.c r7 = com.bumptech.glide.ComponentCallbacks2C0999c.f5095h0
            return r7
    }

    /* renamed from: d */
    public static void m2735d(java.lang.Exception r2) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."
            r0.<init>(r1, r2)
            throw r0
    }

    /* renamed from: e */
    public static com.bumptech.glide.ComponentCallbacks2C1006j m2736e(android.content.Context r1) {
            java.lang.String r0 = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."
            java.util.Objects.requireNonNull(r1, r0)
            com.bumptech.glide.c r0 = m2734b(r1)
            z2.l r0 = r0.f5102d0
            com.bumptech.glide.j r1 = r0.m14300f(r1)
            return r1
    }

    /* renamed from: f */
    public static com.bumptech.glide.ComponentCallbacks2C1006j m2737f(android.view.View r6) {
            android.content.Context r0 = r6.getContext()
            java.lang.String r1 = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."
            java.util.Objects.requireNonNull(r0, r1)
            com.bumptech.glide.c r0 = m2734b(r0)
            z2.l r0 = r0.f5102d0
            java.util.Objects.requireNonNull(r0)
            boolean r1 = p106g3.C2238j.m5848h()
            if (r1 == 0) goto L19
            goto L2c
        L19:
            android.content.Context r1 = r6.getContext()
            java.lang.String r2 = "Unable to obtain a request manager for a view without a Context"
            java.util.Objects.requireNonNull(r1, r2)
            android.content.Context r1 = r6.getContext()
            android.app.Activity r1 = p445z2.C7238l.m14294a(r1)
            if (r1 != 0) goto L3a
        L2c:
            android.content.Context r6 = r6.getContext()
            android.content.Context r6 = r6.getApplicationContext()
            com.bumptech.glide.j r6 = r0.m14300f(r6)
            goto L160
        L3a:
            boolean r2 = r1 instanceof androidx.fragment.app.ActivityC0405s
            r3 = 0
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            if (r2 == 0) goto Le9
            androidx.fragment.app.s r1 = (androidx.fragment.app.ActivityC0405s) r1
            s.a<android.view.View, androidx.fragment.app.n> r2 = r0.f27821d0
            r2.clear()
            androidx.fragment.app.d0 r2 = r1.m1354t()
            java.util.List r2 = r2.m1143L()
            s.a<android.view.View, androidx.fragment.app.n> r5 = r0.f27821d0
            p445z2.C7238l.m14295c(r2, r5)
            android.view.View r2 = r1.findViewById(r4)
            r4 = r3
        L5b:
            boolean r5 = r6.equals(r2)
            if (r5 != 0) goto L7b
            s.a<android.view.View, androidx.fragment.app.n> r4 = r0.f27821d0
            java.lang.Object r4 = r4.getOrDefault(r6, r3)
            androidx.fragment.app.n r4 = (androidx.fragment.app.ComponentCallbacksC0395n) r4
            if (r4 == 0) goto L6c
            goto L7b
        L6c:
            android.view.ViewParent r5 = r6.getParent()
            boolean r5 = r5 instanceof android.view.View
            if (r5 == 0) goto L7b
            android.view.ViewParent r6 = r6.getParent()
            android.view.View r6 = (android.view.View) r6
            goto L5b
        L7b:
            s.a<android.view.View, androidx.fragment.app.n> r6 = r0.f27821d0
            r6.clear()
            if (r4 == 0) goto Le3
            android.content.Context r6 = r4.m1339v()
            java.lang.String r1 = "You cannot start a load on a fragment before it is attached or after it is destroyed"
            java.util.Objects.requireNonNull(r6, r1)
            boolean r6 = p106g3.C2238j.m5848h()
            if (r6 == 0) goto L9f
            android.content.Context r6 = r4.m1339v()
            android.content.Context r6 = r6.getApplicationContext()
            com.bumptech.glide.j r6 = r0.m14300f(r6)
            goto L160
        L9f:
            androidx.fragment.app.s r6 = r4.m1333s()
            if (r6 == 0) goto Lae
            z2.g r6 = r0.f27824g0
            androidx.fragment.app.s r1 = r4.m1333s()
            r6.mo9716g(r1)
        Lae:
            androidx.fragment.app.d0 r6 = r4.m1337u()
            android.content.Context r1 = r4.m1339v()
            androidx.fragment.app.a0<?> r2 = r4.f2295q0
            r3 = 1
            r5 = 0
            if (r2 == 0) goto Lc2
            boolean r2 = r4.f2287i0
            if (r2 == 0) goto Lc2
            r2 = 1
            goto Lc3
        Lc2:
            r2 = 0
        Lc3:
            if (r2 == 0) goto Ldc
            boolean r2 = r4.f2301w0
            if (r2 != 0) goto Ldc
            android.view.View r2 = r4.f2260C0
            if (r2 == 0) goto Ldc
            android.os.IBinder r2 = r2.getWindowToken()
            if (r2 == 0) goto Ldc
            android.view.View r2 = r4.f2260C0
            int r2 = r2.getVisibility()
            if (r2 != 0) goto Ldc
            goto Ldd
        Ldc:
            r3 = 0
        Ldd:
            com.bumptech.glide.j r6 = r0.m14304k(r1, r6, r4, r3)
            goto L160
        Le3:
            com.bumptech.glide.j r6 = r0.m14301g(r1)
            goto L160
        Le9:
            s.a<android.view.View, android.app.Fragment> r2 = r0.f27822e0
            r2.clear()
            android.app.FragmentManager r2 = r1.getFragmentManager()
            s.a<android.view.View, android.app.Fragment> r5 = r0.f27822e0
            r0.m14297b(r2, r5)
            android.view.View r2 = r1.findViewById(r4)
            r4 = r3
        Lfc:
            boolean r5 = r6.equals(r2)
            if (r5 != 0) goto L11c
            s.a<android.view.View, android.app.Fragment> r4 = r0.f27822e0
            java.lang.Object r4 = r4.getOrDefault(r6, r3)
            android.app.Fragment r4 = (android.app.Fragment) r4
            if (r4 == 0) goto L10d
            goto L11c
        L10d:
            android.view.ViewParent r5 = r6.getParent()
            boolean r5 = r5 instanceof android.view.View
            if (r5 == 0) goto L11c
            android.view.ViewParent r6 = r6.getParent()
            android.view.View r6 = (android.view.View) r6
            goto Lfc
        L11c:
            s.a<android.view.View, android.app.Fragment> r6 = r0.f27822e0
            r6.clear()
            if (r4 != 0) goto L128
            com.bumptech.glide.j r6 = r0.m14299e(r1)
            goto L160
        L128:
            android.app.Activity r6 = r4.getActivity()
            if (r6 == 0) goto L161
            boolean r6 = p106g3.C2238j.m5848h()
            if (r6 != 0) goto L154
            android.app.Activity r6 = r4.getActivity()
            if (r6 == 0) goto L143
            z2.g r6 = r0.f27824g0
            android.app.Activity r1 = r4.getActivity()
            r6.mo9716g(r1)
        L143:
            android.app.FragmentManager r6 = r4.getChildFragmentManager()
            android.app.Activity r1 = r4.getActivity()
            boolean r2 = r4.isVisible()
            com.bumptech.glide.j r6 = r0.m14298d(r1, r6, r4, r2)
            goto L160
        L154:
            android.app.Activity r6 = r4.getActivity()
            android.content.Context r6 = r6.getApplicationContext()
            com.bumptech.glide.j r6 = r0.m14300f(r6)
        L160:
            return r6
        L161:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You cannot start a load on a fragment before it is attached"
            r6.<init>(r0)
            throw r6
    }

    /* renamed from: c */
    public int m2738c(int r5) {
            r4 = this;
            p106g3.C2238j.m5841a()
            o2.i r0 = r4.f5098Z
            float r1 = p365v.C6480g.m13153f(r5)
            g3.g r0 = (p106g3.C2235g) r0
            monitor-enter(r0)
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L2f
            long r2 = r0.f10205b     // Catch: java.lang.Throwable -> L37
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L37
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)     // Catch: java.lang.Throwable -> L37
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L37
            r0.f10206c = r1     // Catch: java.lang.Throwable -> L37
            r0.m5838e(r1)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)
            n2.c r0 = r4.f5097Y
            float r1 = p365v.C6480g.m13153f(r5)
            r0.mo10691c(r1)
            int r0 = r4.f5105g0
            r4.f5105g0 = r5
            return r0
        L2f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "Multiplier must be >= 0"
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L37
            throw r5     // Catch: java.lang.Throwable -> L37
        L37:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
            r3 = this;
            p106g3.C2238j.m5841a()
            o2.i r0 = r3.f5098Z
            g3.g r0 = (p106g3.C2235g) r0
            r1 = 0
            r0.m5838e(r1)
            n2.c r0 = r3.f5097Y
            r0.mo10690b()
            n2.b r0 = r3.f5101c0
            r0.mo10685b()
            return
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int r6) {
            r5 = this;
            p106g3.C2238j.m5841a()
            java.util.List<com.bumptech.glide.j> r0 = r5.f5104f0
            monitor-enter(r0)
            java.util.List<com.bumptech.glide.j> r1 = r5.f5104f0     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L4e
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L4e
            com.bumptech.glide.j r2 = (com.bumptech.glide.ComponentCallbacks2C1006j) r2     // Catch: java.lang.Throwable -> L4e
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L4e
            goto Lc
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            o2.i r0 = r5.f5098Z
            o2.h r0 = (p244o2.C4884h) r0
            java.util.Objects.requireNonNull(r0)
            r1 = 40
            if (r6 < r1) goto L2e
            r1 = 0
            r0.m5838e(r1)
            goto L40
        L2e:
            r1 = 20
            if (r6 >= r1) goto L36
            r1 = 15
            if (r6 != r1) goto L40
        L36:
            monitor-enter(r0)
            long r1 = r0.f10206c     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r0)
            r3 = 2
            long r1 = r1 / r3
            r0.m5838e(r1)
        L40:
            n2.c r0 = r5.f5097Y
            r0.mo10689a(r6)
            n2.b r0 = r5.f5101c0
            r0.mo10684a(r6)
            return
        L4b:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L4e:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r6
    }
}
