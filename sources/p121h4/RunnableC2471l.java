package p121h4;

/* renamed from: h4.l */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2471l implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f11058Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f11059Z;

    /* renamed from: a0 */
    public final /* synthetic */ boolean f11060a0;

    public /* synthetic */ RunnableC2471l(ad.C0061d r2, boolean r3) {
            r1 = this;
            r0 = 3
            r1.f11058Y = r0
            r1.<init>()
            r1.f11059Z = r2
            r1.f11060a0 = r3
            return
    }

    public /* synthetic */ RunnableC2471l(p121h4.InterfaceC2473n.a r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.f11058Y = r0
            r1.<init>()
            r1.f11059Z = r2
            r1.f11060a0 = r3
            return
    }

    public /* synthetic */ RunnableC2471l(p413xb.C7018a r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.f11058Y = r0
            r1.<init>()
            r1.f11059Z = r2
            r1.f11060a0 = r3
            return
    }

    public /* synthetic */ RunnableC2471l(p413xb.C7024g.b r2, boolean r3) {
            r1 = this;
            r0 = 2
            r1.f11058Y = r0
            r1.<init>()
            r1.f11059Z = r2
            r1.f11060a0 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f11058Y
            switch(r0) {
                case 0: goto L35;
                case 1: goto L29;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L43
        L6:
            java.lang.Object r0 = r4.f11059Z
            xb.g$b r0 = (p413xb.C7024g.b) r0
            boolean r1 = r4.f11060a0
            xb.g r0 = r0.f27354a
            r0.f27353f = r1
            boolean r1 = r0.f27350c
            if (r1 == 0) goto L28
            android.os.Handler r1 = r0.f27351d
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            boolean r1 = r0.f27353f
            if (r1 == 0) goto L28
            android.os.Handler r1 = r0.f27351d
            java.lang.Runnable r0 = r0.f27352e
            r2 = 300000(0x493e0, double:1.482197E-318)
            r1.postDelayed(r0, r2)
        L28:
            return
        L29:
            java.lang.Object r0 = r4.f11059Z
            xb.a r0 = (p413xb.C7018a) r0
            boolean r1 = r4.f11060a0
            ad.e r0 = r0.f27336a
            r0.m100f(r1)
            return
        L35:
            java.lang.Object r0 = r4.f11059Z
            h4.n$a r0 = (p121h4.InterfaceC2473n.a) r0
            boolean r1 = r4.f11060a0
            h4.n r0 = r0.f11064b
            int r2 = p371v5.C6552b0.f25624a
            r0.mo5290c(r1)
            return
        L43:
            java.lang.Object r0 = r4.f11059Z
            ad.d r0 = (ad.C0061d) r0
            boolean r1 = r4.f11060a0
            ad.e r0 = r0.f164c
            r0.m100f(r1)
            return
    }
}
