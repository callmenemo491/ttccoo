package com.bumptech.glide.load;

/* renamed from: com.bumptech.glide.load.d */
/* loaded from: classes.dex */
public final class C1011d {
    /* renamed from: a */
    public static int m2779a(java.util.List<com.bumptech.glide.load.ImageHeaderParser> r4, java.io.InputStream r5, p229n2.InterfaceC4672b r6) {
            r0 = -1
            if (r5 != 0) goto L4
            return r0
        L4:
            boolean r1 = r5.markSupported()
            if (r1 != 0) goto L10
            t2.t r1 = new t2.t
            r1.<init>(r5, r6)
            r5 = r1
        L10:
            r1 = 5242880(0x500000, float:7.34684E-39)
            r5.mark(r1)
            int r1 = r4.size()
            r2 = 0
        L1a:
            if (r2 >= r1) goto L35
            java.lang.Object r3 = r4.get(r2)
            com.bumptech.glide.load.ImageHeaderParser r3 = (com.bumptech.glide.load.ImageHeaderParser) r3
            int r3 = r3.mo2777b(r5, r6)     // Catch: java.lang.Throwable -> L30
            r5.reset()
            if (r3 == r0) goto L2d
            r0 = r3
            goto L35
        L2d:
            int r2 = r2 + 1
            goto L1a
        L30:
            r4 = move-exception
            r5.reset()
            throw r4
        L35:
            return r0
    }

    /* renamed from: b */
    public static com.bumptech.glide.load.ImageHeaderParser.ImageType m2780b(java.util.List<com.bumptech.glide.load.ImageHeaderParser> r3, java.io.InputStream r4, p229n2.InterfaceC4672b r5) {
            if (r4 != 0) goto L5
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r3
        L5:
            boolean r0 = r4.markSupported()
            if (r0 != 0) goto L11
            t2.t r0 = new t2.t
            r0.<init>(r4, r5)
            r4 = r0
        L11:
            r5 = 5242880(0x500000, float:7.34684E-39)
            r4.mark(r5)
            int r5 = r3.size()
            r0 = 0
        L1b:
            if (r0 >= r5) goto L37
            java.lang.Object r1 = r3.get(r0)
            com.bumptech.glide.load.ImageHeaderParser r1 = (com.bumptech.glide.load.ImageHeaderParser) r1
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = r1.mo2778c(r4)     // Catch: java.lang.Throwable -> L32
            r4.reset()
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            if (r1 == r2) goto L2f
            goto L39
        L2f:
            int r0 = r0 + 1
            goto L1b
        L32:
            r3 = move-exception
            r4.reset()
            throw r3
        L37:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
        L39:
            return r1
    }
}
