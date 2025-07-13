package p334t2;

/* renamed from: t2.i */
/* loaded from: classes.dex */
public class C6131i extends p334t2.AbstractC6127e {

    /* renamed from: b */
    public static final byte[] f23669b = null;

    static {
            java.nio.charset.Charset r0 = p180k2.InterfaceC3671c.f16244a
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.CenterInside"
            byte[] r0 = r1.getBytes(r0)
            p334t2.C6131i.f23669b = r0
            return
    }

    public C6131i() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p180k2.InterfaceC3671c
    /* renamed from: b */
    public void mo5082b(java.security.MessageDigest r2) {
            r1 = this;
            byte[] r0 = p334t2.C6131i.f23669b
            r2.update(r0)
            return
    }

    @Override // p334t2.AbstractC6127e
    /* renamed from: c */
    public android.graphics.Bitmap mo12655c(p229n2.InterfaceC4673c r4, android.graphics.Bitmap r5, int r6, int r7) {
            r3 = this;
            android.graphics.Paint r0 = p334t2.C6144v.f23726a
            int r0 = r5.getWidth()
            r1 = 2
            java.lang.String r2 = "TransformationUtils"
            if (r0 > r6) goto L1d
            int r0 = r5.getHeight()
            if (r0 > r7) goto L1d
            boolean r4 = android.util.Log.isLoggable(r2, r1)
            if (r4 == 0) goto L2c
            java.lang.String r4 = "requested target size larger or equal to input, returning input"
            android.util.Log.v(r2, r4)
            goto L2c
        L1d:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L28
            java.lang.String r0 = "requested target size too big for input, fit centering instead"
            android.util.Log.v(r2, r0)
        L28:
            android.graphics.Bitmap r5 = p334t2.C6144v.m12691b(r4, r5, r6, r7)
        L2c:
            return r5
    }

    @Override // p180k2.InterfaceC3671c
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof p334t2.C6131i
            return r1
    }

    @Override // p180k2.InterfaceC3671c
    public int hashCode() {
            r1 = this;
            r0 = -670243078(0xffffffffd80ce6fa, float:-6.1969466E14)
            return r0
    }
}
