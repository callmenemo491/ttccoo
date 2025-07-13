package p334t2;

/* renamed from: t2.o */
/* loaded from: classes.dex */
public final class C6137o implements com.bumptech.glide.load.ImageHeaderParser {
    public C6137o() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public com.bumptech.glide.load.ImageHeaderParser.ImageType mo2776a(java.nio.ByteBuffer r1) {
            r0 = this;
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r1
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public int mo2777b(java.io.InputStream r2, p229n2.InterfaceC4672b r3) {
            r1 = this;
            w0.b r3 = new w0.b
            r3.<init>(r2)
            java.lang.String r2 = "Orientation"
            w0.b$c r2 = r3.m13755e(r2)
            r0 = 1
            if (r2 != 0) goto Lf
            goto L15
        Lf:
            java.nio.ByteOrder r3 = r3.f26281g     // Catch: java.lang.NumberFormatException -> L15
            int r0 = r2.m13783f(r3)     // Catch: java.lang.NumberFormatException -> L15
        L15:
            if (r0 != 0) goto L19
            r2 = -1
            return r2
        L19:
            return r0
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public com.bumptech.glide.load.ImageHeaderParser.ImageType mo2778c(java.io.InputStream r1) {
            r0 = this;
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r1
    }
}
