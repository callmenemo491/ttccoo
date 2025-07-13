package p404x2;

/* renamed from: x2.g */
/* loaded from: classes.dex */
public class C6918g implements p180k2.InterfaceC3674f<java.io.InputStream, p404x2.C6914c> {

    /* renamed from: a */
    public final java.util.List<com.bumptech.glide.load.ImageHeaderParser> f26939a;

    /* renamed from: b */
    public final p180k2.InterfaceC3674f<java.nio.ByteBuffer, p404x2.C6914c> f26940b;

    /* renamed from: c */
    public final p229n2.InterfaceC4672b f26941c;

    public C6918g(java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1, p180k2.InterfaceC3674f<java.nio.ByteBuffer, p404x2.C6914c> r2, p229n2.InterfaceC4672b r3) {
            r0 = this;
            r0.<init>()
            r0.f26939a = r1
            r0.f26940b = r2
            r0.f26941c = r3
            return
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: a */
    public p214m2.InterfaceC4345w<p404x2.C6914c> mo8132a(java.io.InputStream r6, int r7, int r8, p180k2.C3673e r9) {
            r5 = this;
            java.io.InputStream r6 = (java.io.InputStream) r6
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r1)
            r2 = 0
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L20
        Lc:
            int r3 = r6.read(r1)     // Catch: java.io.IOException -> L20
            r4 = -1
            if (r3 == r4) goto L18
            r4 = 0
            r0.write(r1, r4, r3)     // Catch: java.io.IOException -> L20
            goto Lc
        L18:
            r0.flush()     // Catch: java.io.IOException -> L20
            byte[] r6 = r0.toByteArray()
            goto L30
        L20:
            r6 = move-exception
            r0 = 5
            java.lang.String r1 = "StreamGifDecoder"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L2f
            java.lang.String r0 = "Error reading data from stream"
            android.util.Log.w(r1, r0, r6)
        L2f:
            r6 = r2
        L30:
            if (r6 != 0) goto L33
            goto L3d
        L33:
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            k2.f<java.nio.ByteBuffer, x2.c> r0 = r5.f26940b
            m2.w r2 = r0.mo8132a(r6, r7, r8, r9)
        L3d:
            return r2
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: b */
    public boolean mo8133b(java.io.InputStream r2, p180k2.C3673e r3) {
            r1 = this;
            java.io.InputStream r2 = (java.io.InputStream) r2
            k2.d<java.lang.Boolean> r0 = p404x2.C6917f.f26938b
            java.lang.Object r3 = r3.m8130c(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L1e
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r3 = r1.f26939a
            n2.b r0 = r1.f26941c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.C1011d.m2780b(r3, r2, r0)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF
            if (r2 != r3) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            return r2
    }
}
