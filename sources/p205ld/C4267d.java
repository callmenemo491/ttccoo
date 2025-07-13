package p205ld;

/* renamed from: ld.d */
/* loaded from: classes.dex */
public final class C4267d implements com.bumptech.glide.load.data.InterfaceC1016d<java.io.InputStream> {

    /* renamed from: Y */
    public final java.lang.String f17466Y;

    /* renamed from: Z */
    public volatile android.media.MediaMetadataRetriever f17467Z;

    public C4267d(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f17466Y = r1
            return
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: a */
    public java.lang.Class<java.io.InputStream> mo2786a() {
            r1 = this;
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: b */
    public void mo2789b() {
            r1 = this;
            android.media.MediaMetadataRetriever r0 = r1.f17467Z
            if (r0 == 0) goto L7
            r0.close()
        L7:
            return
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    public void cancel() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: e */
    public com.bumptech.glide.load.EnumC1008a mo2792e() {
            r1 = this;
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.EnumC1008a.f5181Z
            return r0
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d
    /* renamed from: f */
    public void mo2793f(com.bumptech.glide.EnumC1003g r4, com.bumptech.glide.load.data.InterfaceC1016d.a<? super java.io.InputStream> r5) {
            r3 = this;
            java.lang.String r0 = "priority"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r4 = "callback"
            p214m2.C4339q.m9706k(r5, r4)
            android.media.MediaMetadataRetriever r4 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L45
            r4.<init>()     // Catch: java.lang.Throwable -> L45
            r3.f17467Z = r4     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = r3.f17466Y     // Catch: java.lang.Throwable -> L45
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L45
            r1.<init>()     // Catch: java.lang.Throwable -> L45
            r4.setDataSource(r0, r1)     // Catch: java.lang.Throwable -> L45
            r0 = 1000(0x3e8, double:4.94E-321)
            android.graphics.Bitmap r4 = r4.getFrameAtTime(r0)     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L3d
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L45
            r0.<init>()     // Catch: java.lang.Throwable -> L45
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L45
            r2 = 0
            r4.compress(r1, r2, r0)     // Catch: java.lang.Throwable -> L45
            byte[] r4 = r0.toByteArray()     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = "bos.toByteArray()"
            p214m2.C4339q.m9705j(r4, r0)     // Catch: java.lang.Throwable -> L45
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L45
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L45
            goto L4a
        L3d:
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = "Frame 1 is null"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L45
            throw r4     // Catch: java.lang.Throwable -> L45
        L45:
            r4 = move-exception
            java.lang.Object r0 = p074e9.C1805a.m4520e(r4)
        L4a:
            boolean r4 = r0 instanceof ch.C0979f.a
            r4 = r4 ^ 1
            if (r4 == 0) goto L56
            r4 = r0
            java.io.ByteArrayInputStream r4 = (java.io.ByteArrayInputStream) r4
            r5.mo2795d(r4)
        L56:
            java.lang.Throwable r4 = ch.C0979f.m2690b(r0)
            if (r4 == 0) goto L68
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r4 = r4.getMessage()
            r0.<init>(r4)
            r5.mo2794c(r0)
        L68:
            return
    }
}
