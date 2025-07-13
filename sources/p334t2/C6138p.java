package p334t2;

/* renamed from: t2.p */
/* loaded from: classes.dex */
public class C6138p extends p334t2.AbstractC6127e {

    /* renamed from: b */
    public static final byte[] f23697b = null;

    static {
            java.nio.charset.Charset r0 = p180k2.InterfaceC3671c.f16244a
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.FitCenter"
            byte[] r0 = r1.getBytes(r0)
            p334t2.C6138p.f23697b = r0
            return
    }

    public C6138p() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p180k2.InterfaceC3671c
    /* renamed from: b */
    public void mo5082b(java.security.MessageDigest r2) {
            r1 = this;
            byte[] r0 = p334t2.C6138p.f23697b
            r2.update(r0)
            return
    }

    @Override // p334t2.AbstractC6127e
    /* renamed from: c */
    public android.graphics.Bitmap mo12655c(p229n2.InterfaceC4673c r1, android.graphics.Bitmap r2, int r3, int r4) {
            r0 = this;
            android.graphics.Bitmap r1 = p334t2.C6144v.m12691b(r1, r2, r3, r4)
            return r1
    }

    @Override // p180k2.InterfaceC3671c
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof p334t2.C6138p
            return r1
    }

    @Override // p180k2.InterfaceC3671c
    public int hashCode() {
            r1 = this;
            r0 = 1572326941(0x5db7ce1d, float:1.6555694E18)
            return r0
    }
}
