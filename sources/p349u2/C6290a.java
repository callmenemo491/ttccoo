package p349u2;

/* renamed from: u2.a */
/* loaded from: classes.dex */
public class C6290a implements com.bumptech.glide.load.data.InterfaceC1017e<java.nio.ByteBuffer> {

    /* renamed from: a */
    public final java.nio.ByteBuffer f24536a;

    /* renamed from: u2.a$a */
    public static class a implements com.bumptech.glide.load.data.InterfaceC1017e.a<java.nio.ByteBuffer> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1017e.a
        /* renamed from: a */
        public java.lang.Class<java.nio.ByteBuffer> mo2784a() {
                r1 = this;
                java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
                return r0
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1017e.a
        /* renamed from: b */
        public com.bumptech.glide.load.data.InterfaceC1017e<java.nio.ByteBuffer> mo2785b(java.nio.ByteBuffer r2) {
                r1 = this;
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
                u2.a r0 = new u2.a
                r0.<init>(r2)
                return r0
        }
    }

    public C6290a(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.<init>()
            r0.f24536a = r1
            return
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1017e
    /* renamed from: a */
    public java.nio.ByteBuffer mo2781a() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f24536a
            r1 = 0
            r0.position(r1)
            java.nio.ByteBuffer r0 = r2.f24536a
            return r0
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1017e
    /* renamed from: b */
    public void mo2782b() {
            r0 = this;
            return
    }
}
