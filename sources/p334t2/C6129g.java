package p334t2;

/* renamed from: t2.g */
/* loaded from: classes.dex */
public final class C6129g implements p180k2.InterfaceC3674f<java.nio.ByteBuffer, android.graphics.Bitmap> {

    /* renamed from: a */
    public final p334t2.C6125c f23667a;

    public C6129g() {
            r1 = this;
            r1.<init>()
            t2.c r0 = new t2.c
            r0.<init>()
            r1.f23667a = r0
            return
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: a */
    public p214m2.InterfaceC4345w<android.graphics.Bitmap> mo8132a(java.nio.ByteBuffer r2, int r3, int r4, p180k2.C3673e r5) {
            r1 = this;
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            android.graphics.ImageDecoder$Source r2 = android.graphics.ImageDecoder.createSource(r2)
            t2.c r0 = r1.f23667a
            m2.w r2 = r0.m12355c(r2, r3, r4, r5)
            return r2
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo8133b(java.nio.ByteBuffer r1, p180k2.C3673e r2) {
            r0 = this;
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r1 = 1
            return r1
    }
}
