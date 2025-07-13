package p334t2;

/* renamed from: t2.b */
/* loaded from: classes.dex */
public class C6124b implements p180k2.InterfaceC3675g<android.graphics.Bitmap> {

    /* renamed from: Z */
    public static final p180k2.C3672d<java.lang.Integer> f23658Z = null;

    /* renamed from: a0 */
    public static final p180k2.C3672d<android.graphics.Bitmap.CompressFormat> f23659a0 = null;

    /* renamed from: Y */
    public final p229n2.InterfaceC4672b f23660Y;

    static {
            r0 = 90
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality"
            k2.d r0 = p180k2.C3672d.m8128a(r1, r0)
            p334t2.C6124b.f23658Z = r0
            k2.d r0 = new k2.d
            k2.d$b<java.lang.Object> r1 = p180k2.C3672d.f16245e
            r2 = 0
            java.lang.String r3 = "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat"
            r0.<init>(r3, r2, r1)
            p334t2.C6124b.f23659a0 = r0
            return
    }

    public C6124b(p229n2.InterfaceC4672b r1) {
            r0 = this;
            r0.<init>()
            r0.f23660Y = r1
            return
    }

    @Override // p180k2.InterfaceC3669a
    /* renamed from: d */
    public boolean mo814d(java.lang.Object r9, java.io.File r10, p180k2.C3673e r11) {
            r8 = this;
            m2.w r9 = (p214m2.InterfaceC4345w) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            k2.d<android.graphics.Bitmap$CompressFormat> r1 = p334t2.C6124b.f23659a0
            java.lang.Object r1 = r11.m8130c(r1)
            android.graphics.Bitmap$CompressFormat r1 = (android.graphics.Bitmap.CompressFormat) r1
            if (r1 == 0) goto L15
            goto L20
        L15:
            boolean r1 = r9.hasAlpha()
            if (r1 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r9.getWidth()
            r9.getHeight()
            int r2 = p106g3.C2234f.f10203b     // Catch: java.lang.Throwable -> Lc3
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> Lc3
            k2.d<java.lang.Integer> r4 = p334t2.C6124b.f23658Z     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r4 = r11.m8130c(r4)     // Catch: java.lang.Throwable -> Lc3
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lc3
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lc3
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            n2.b r10 = r8.f23660Y     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r10 == 0) goto L4c
            com.bumptech.glide.load.data.c r10 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            n2.b r6 = r8.f23660Y     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r10.<init>(r7, r6)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r6 = r10
            goto L4d
        L4c:
            r6 = r7
        L4d:
            r9.compress(r1, r4, r6)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r6.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r5 = 1
            goto L6b
        L55:
            r9 = move-exception
            goto Lbd
        L57:
            r10 = move-exception
            r6 = r7
            goto L5d
        L5a:
            r9 = move-exception
            goto Lbc
        L5c:
            r10 = move-exception
        L5d:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L69
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch: java.lang.Throwable -> L5a
        L69:
            if (r6 == 0) goto L6e
        L6b:
            r6.close()     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lc3
        L6e:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> Lc3
            if (r10 == 0) goto Lbb
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            r10.<init>()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = "Compressed with type: "
            r10.append(r4)     // Catch: java.lang.Throwable -> Lc3
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = " of size "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            int r1 = p106g3.C2238j.m5844d(r9)     // Catch: java.lang.Throwable -> Lc3
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = " in "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            double r1 = p106g3.C2234f.m5833a(r2)     // Catch: java.lang.Throwable -> Lc3
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = ", options format: "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc3
            k2.d<android.graphics.Bitmap$CompressFormat> r1 = p334t2.C6124b.f23659a0     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r11 = r11.m8130c(r1)     // Catch: java.lang.Throwable -> Lc3
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc3
            boolean r9 = r9.hasAlpha()     // Catch: java.lang.Throwable -> Lc3
            r10.append(r9)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> Lc3
            android.util.Log.v(r0, r9)     // Catch: java.lang.Throwable -> Lc3
        Lbb:
            return r5
        Lbc:
            r7 = r6
        Lbd:
            if (r7 == 0) goto Lc2
            r7.close()     // Catch: java.io.IOException -> Lc2 java.lang.Throwable -> Lc3
        Lc2:
            throw r9     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r9 = move-exception
            throw r9
    }

    @Override // p180k2.InterfaceC3675g
    /* renamed from: s */
    public com.bumptech.glide.load.EnumC1010c mo827s(p180k2.C3673e r1) {
            r0 = this;
            com.bumptech.glide.load.c r1 = com.bumptech.glide.load.EnumC1010c.f5190Z
            return r1
    }
}
