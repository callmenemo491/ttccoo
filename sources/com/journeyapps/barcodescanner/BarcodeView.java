package com.journeyapps.barcodescanner;

/* loaded from: classes.dex */
public class BarcodeView extends com.journeyapps.barcodescanner.C1253a {

    /* renamed from: B0 */
    public int f6656B0;

    /* renamed from: C0 */
    public p454zc.InterfaceC7278b f6657C0;

    /* renamed from: D0 */
    public p454zc.C7287k f6658D0;

    /* renamed from: E0 */
    public p454zc.InterfaceC7285i f6659E0;

    /* renamed from: F0 */
    public android.os.Handler f6660F0;

    /* renamed from: G0 */
    public final android.os.Handler.Callback f6661G0;

    /* renamed from: com.journeyapps.barcodescanner.BarcodeView$a */
    public class C1249a implements android.os.Handler.Callback {

        /* renamed from: Y */
        public final /* synthetic */ com.journeyapps.barcodescanner.BarcodeView f6662Y;

        public C1249a(com.journeyapps.barcodescanner.BarcodeView r1) {
                r0 = this;
                r0.f6662Y = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r4) {
                r3 = this;
                int r0 = r4.what
                r1 = 1
                r2 = 2131362788(0x7f0a03e4, float:1.8345366E38)
                if (r0 != r2) goto L2b
                java.lang.Object r4 = r4.obj
                zc.c r4 = (p454zc.C7279c) r4
                if (r4 == 0) goto L2a
                com.journeyapps.barcodescanner.BarcodeView r0 = r3.f6662Y
                zc.b r2 = r0.f6657C0
                if (r2 == 0) goto L2a
                int r0 = r0.f6656B0
                if (r0 == r1) goto L2a
                r2.mo2673a(r4)
                com.journeyapps.barcodescanner.BarcodeView r4 = r3.f6662Y
                int r0 = r4.f6656B0
                r2 = 2
                if (r0 != r2) goto L2a
                r4.f6656B0 = r1
                r0 = 0
                r4.f6657C0 = r0
                r4.m3687j()
            L2a:
                return r1
            L2b:
                r2 = 2131362787(0x7f0a03e3, float:1.8345364E38)
                if (r0 != r2) goto L31
                return r1
            L31:
                r2 = 2131362789(0x7f0a03e5, float:1.8345368E38)
                if (r0 != r2) goto L48
                java.lang.Object r4 = r4.obj
                java.util.List r4 = (java.util.List) r4
                com.journeyapps.barcodescanner.BarcodeView r0 = r3.f6662Y
                zc.b r2 = r0.f6657C0
                if (r2 == 0) goto L47
                int r0 = r0.f6656B0
                if (r0 == r1) goto L47
                r2.mo2674b(r4)
            L47:
                return r1
            L48:
                r4 = 0
                return r4
        }
    }

    public BarcodeView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            r0.f6656B0 = r1
            r1 = 0
            r0.f6657C0 = r1
            com.journeyapps.barcodescanner.BarcodeView$a r1 = new com.journeyapps.barcodescanner.BarcodeView$a
            r1.<init>(r0)
            r0.f6661G0 = r1
            zc.l r2 = new zc.l
            r2.<init>()
            r0.f6659E0 = r2
            android.os.Handler r2 = new android.os.Handler
            r2.<init>(r1)
            r0.f6660F0 = r2
            return
    }

    @Override // com.journeyapps.barcodescanner.C1253a
    /* renamed from: c */
    public void mo3683c() {
            r0 = this;
            r0.m3687j()
            super.mo3683c()
            return
    }

    @Override // com.journeyapps.barcodescanner.C1253a
    /* renamed from: d */
    public void mo3684d() {
            r0 = this;
            r0.m3686i()
            return
    }

    public p454zc.InterfaceC7285i getDecoderFactory() {
            r1 = this;
            zc.i r0 = r1.f6659E0
            return r0
    }

    /* renamed from: h */
    public final p454zc.C7284h m3685h() {
            r3 = this;
            zc.i r0 = r3.f6659E0
            if (r0 != 0) goto Lb
            zc.l r0 = new zc.l
            r0.<init>()
            r3.f6659E0 = r0
        Lb:
            zc.j r0 = new zc.j
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            sb.c r2 = sb.EnumC6009c.f23178h0
            r1.put(r2, r0)
            zc.i r2 = r3.f6659E0
            zc.h r1 = r2.mo14391a(r1)
            r0.f27940a = r1
            return r1
    }

    /* renamed from: i */
    public final void m3686i() {
            r5 = this;
            r5.m3687j()
            int r0 = r5.f6656B0
            r1 = 1
            if (r0 == r1) goto L4b
            boolean r0 = r5.f6691g0
            if (r0 == 0) goto L4b
            zc.k r0 = new zc.k
            ad.d r2 = r5.getCameraInstance()
            zc.h r3 = r5.m3685h()
            android.os.Handler r4 = r5.f6660F0
            r0.<init>(r2, r3, r4)
            r5.f6658D0 = r0
            android.graphics.Rect r2 = r5.getPreviewFramingRect()
            r0.f27946f = r2
            zc.k r0 = r5.f6658D0
            java.util.Objects.requireNonNull(r0)
            p185k7.C3828h5.m8580I()
            android.os.HandlerThread r2 = new android.os.HandlerThread
            java.lang.String r3 = "k"
            r2.<init>(r3)
            r0.f27942b = r2
            r2.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.HandlerThread r3 = r0.f27942b
            android.os.Looper r3 = r3.getLooper()
            android.os.Handler$Callback r4 = r0.f27949i
            r2.<init>(r3, r4)
            r0.f27943c = r2
            r0.f27947g = r1
            r0.m14392a()
        L4b:
            return
    }

    /* renamed from: j */
    public final void m3687j() {
            r4 = this;
            zc.k r0 = r4.f6658D0
            if (r0 == 0) goto L22
            java.util.Objects.requireNonNull(r0)
            p185k7.C3828h5.m8580I()
            java.lang.Object r1 = r0.f27948h
            monitor-enter(r1)
            r2 = 0
            r0.f27947g = r2     // Catch: java.lang.Throwable -> L1f
            android.os.Handler r2 = r0.f27943c     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            r2.removeCallbacksAndMessages(r3)     // Catch: java.lang.Throwable -> L1f
            android.os.HandlerThread r0 = r0.f27942b     // Catch: java.lang.Throwable -> L1f
            r0.quit()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            r4.f6658D0 = r3
            goto L22
        L1f:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r0
        L22:
            return
    }

    public void setDecoderFactory(p454zc.InterfaceC7285i r2) {
            r1 = this;
            p185k7.C3828h5.m8580I()
            r1.f6659E0 = r2
            zc.k r2 = r1.f6658D0
            if (r2 == 0) goto Lf
            zc.h r0 = r1.m3685h()
            r2.f27944d = r0
        Lf:
            return
    }
}
