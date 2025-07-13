package p090f6;

/* renamed from: f6.j */
/* loaded from: classes.dex */
public final class C2075j implements p090f6.InterfaceC2066a {

    /* renamed from: Y */
    public final /* synthetic */ int f9479Y;

    /* renamed from: Z */
    public final /* synthetic */ p090f6.C2077l f9480Z;

    public C2075j(p090f6.C2077l r2, int r3) {
            r1 = this;
            r1.f9479Y = r3
            r0 = 1
            if (r3 == r0) goto Lb
            r1.f9480Z = r2
            r1.<init>()
            return
        Lb:
            r1.f9480Z = r2
            r1.<init>()
            return
    }

    @Override // p090f6.InterfaceC2066a
    /* renamed from: e */
    public final void mo815e(android.graphics.Bitmap r9) {
            r8 = this;
            int r0 = r8.f9479Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L47
        L6:
            r0 = 0
            if (r9 != 0) goto La
            goto L40
        La:
            int r1 = r9.getWidth()
            int r2 = r9.getHeight()
            float r3 = (float) r1
            r4 = 1091567616(0x41100000, float:9.0)
            float r4 = r4 * r3
            r5 = 1098907648(0x41800000, float:16.0)
            float r4 = r4 / r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            int r5 = r4 - r2
            int r5 = r5 / 2
            float r5 = (float) r5
            android.graphics.RectF r6 = new android.graphics.RectF
            r7 = 0
            float r2 = (float) r2
            float r2 = r2 + r5
            r6.<init>(r7, r5, r3, r2)
            android.graphics.Bitmap$Config r2 = r9.getConfig()
            if (r2 != 0) goto L33
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L33:
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r4, r2)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r1)
            r2.drawBitmap(r9, r0, r6, r0)
            r0 = r1
        L40:
            f6.l r9 = r8.f9480Z
            r1 = 0
            r9.m5498k(r0, r1)
            return
        L47:
            f6.l r0 = r8.f9480Z
            r1 = 3
            r0.m5498k(r9, r1)
            return
    }
}
