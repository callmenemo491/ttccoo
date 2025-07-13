package p334t2;

/* renamed from: t2.h */
/* loaded from: classes.dex */
public class C6130h extends p334t2.AbstractC6127e {

    /* renamed from: b */
    public static final byte[] f23668b = null;

    static {
            java.nio.charset.Charset r0 = p180k2.InterfaceC3671c.f16244a
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.CenterCrop"
            byte[] r0 = r1.getBytes(r0)
            p334t2.C6130h.f23668b = r0
            return
    }

    public C6130h() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p180k2.InterfaceC3671c
    /* renamed from: b */
    public void mo5082b(java.security.MessageDigest r2) {
            r1 = this;
            byte[] r0 = p334t2.C6130h.f23668b
            r2.update(r0)
            return
    }

    @Override // p334t2.AbstractC6127e
    /* renamed from: c */
    public android.graphics.Bitmap mo12655c(p229n2.InterfaceC4673c r7, android.graphics.Bitmap r8, int r9, int r10) {
            r6 = this;
            android.graphics.Paint r0 = p334t2.C6144v.f23726a
            int r0 = r8.getWidth()
            if (r0 != r9) goto Lf
            int r0 = r8.getHeight()
            if (r0 != r10) goto Lf
            goto L6b
        Lf:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r8.getWidth()
            int r1 = r1 * r10
            int r2 = r8.getHeight()
            int r2 = r2 * r9
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 0
            if (r1 <= r2) goto L3a
            float r1 = (float) r10
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = (float) r9
            int r5 = r8.getWidth()
            float r5 = (float) r5
            float r5 = r5 * r1
            float r2 = r2 - r5
            float r2 = r2 * r3
            r4 = r2
            r2 = 0
            goto L4c
        L3a:
            float r1 = (float) r9
            int r2 = r8.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = (float) r10
            int r5 = r8.getHeight()
            float r5 = (float) r5
            float r5 = r5 * r1
            float r2 = r2 - r5
            float r2 = r2 * r3
        L4c:
            r0.setScale(r1, r1)
            float r4 = r4 + r3
            int r1 = (int) r4
            float r1 = (float) r1
            float r2 = r2 + r3
            int r2 = (int) r2
            float r2 = (float) r2
            r0.postTranslate(r1, r2)
            android.graphics.Bitmap$Config r1 = p334t2.C6144v.m12692c(r8)
            android.graphics.Bitmap r7 = r7.mo10693e(r9, r10, r1)
            boolean r9 = r8.hasAlpha()
            r7.setHasAlpha(r9)
            p334t2.C6144v.m12690a(r8, r7, r0)
            r8 = r7
        L6b:
            return r8
    }

    @Override // p180k2.InterfaceC3671c
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof p334t2.C6130h
            return r1
    }

    @Override // p180k2.InterfaceC3671c
    public int hashCode() {
            r1 = this;
            r0 = -599754482(0xffffffffdc40790e, float:-2.1670519E17)
            return r0
    }
}
