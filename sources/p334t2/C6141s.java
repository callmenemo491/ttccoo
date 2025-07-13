package p334t2;

/* renamed from: t2.s */
/* loaded from: classes.dex */
public final class C6141s implements p180k2.InterfaceC3674f<java.io.InputStream, android.graphics.Bitmap> {

    /* renamed from: a */
    public final p334t2.C6125c f23715a;

    public C6141s() {
            r1 = this;
            r1.<init>()
            t2.c r0 = new t2.c
            r0.<init>()
            r1.f23715a = r0
            return
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: a */
    public p214m2.InterfaceC4345w<android.graphics.Bitmap> mo8132a(java.io.InputStream r5, int r6, int r7, p180k2.C3673e r8) {
            r4 = this;
            java.io.InputStream r5 = (java.io.InputStream) r5
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = p106g3.C2229a.f10188a
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = p106g3.C2229a.f10188a
            r3 = 0
            java.lang.Object r2 = r2.getAndSet(r3)
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L18
            byte[] r2 = new byte[r1]
        L18:
            int r1 = r5.read(r2)
            r3 = 0
            if (r1 < 0) goto L23
            r0.write(r2, r3, r1)
            goto L18
        L23:
            java.util.concurrent.atomic.AtomicReference<byte[]> r5 = p106g3.C2229a.f10188a
            r5.set(r2)
            byte[] r5 = r0.toByteArray()
            int r0 = r5.length
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteBuffer r5 = r0.put(r5)
            java.nio.Buffer r5 = r5.position(r3)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            android.graphics.ImageDecoder$Source r5 = android.graphics.ImageDecoder.createSource(r5)
            t2.c r0 = r4.f23715a
            m2.w r5 = r0.m12355c(r5, r6, r7, r8)
            return r5
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo8133b(java.io.InputStream r1, p180k2.C3673e r2) {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            r1 = 1
            return r1
    }
}
