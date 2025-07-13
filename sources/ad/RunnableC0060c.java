package ad;

/* renamed from: ad.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0060c implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f158Y;

    /* renamed from: Z */
    public final /* synthetic */ ad.C0061d f159Z;

    /* renamed from: a0 */
    public final /* synthetic */ ad.InterfaceC0069l f160a0;

    public /* synthetic */ RunnableC0060c(ad.C0061d r1, ad.InterfaceC0069l r2, int r3) {
            r0 = this;
            r0.f158Y = r3
            r0.<init>()
            r0.f159Z = r1
            r0.f160a0 = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.f158Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L22
        L6:
            ad.d r0 = r5.f159Z
            ad.l r1 = r5.f160a0
            boolean r2 = r0.f167f
            if (r2 != 0) goto L16
            java.lang.String r0 = "d"
            java.lang.String r1 = "Camera is closed, not requesting preview"
            android.util.Log.d(r0, r1)
            goto L21
        L16:
            ad.g r2 = r0.f162a
            ad.c r3 = new ad.c
            r4 = 1
            r3.<init>(r0, r1, r4)
            r2.m103b(r3)
        L21:
            return
        L22:
            ad.d r0 = r5.f159Z
            ad.l r1 = r5.f160a0
            ad.e r0 = r0.f164c
            android.hardware.Camera r2 = r0.f180a
            if (r2 == 0) goto L37
            boolean r3 = r0.f184e
            if (r3 == 0) goto L37
            ad.e$a r0 = r0.f192m
            r0.f193a = r1
            r2.setOneShotPreviewCallback(r0)
        L37:
            return
    }
}
