package cg;

/* renamed from: cg.k */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0969k implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f5012Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f5013Z;

    public /* synthetic */ RunnableC0969k(cg.C0970l r2) {
            r1 = this;
            r0 = 0
            r1.f5012Y = r0
            r1.<init>()
            r1.f5013Z = r2
            return
    }

    public /* synthetic */ RunnableC0969k(io.tacocrypto.app.utils.view.BlockParentScrollLayout r2) {
            r1 = this;
            r0 = 2
            r1.f5012Y = r0
            r1.<init>()
            r1.f5013Z = r2
            return
    }

    public /* synthetic */ RunnableC0969k(p258og.C5267d r2) {
            r1 = this;
            r0 = 1
            r1.f5012Y = r0
            r1.<init>()
            r1.f5013Z = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            int r0 = r6.f5012Y
            switch(r0) {
                case 0: goto Le;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L5f
        L6:
            java.lang.Object r0 = r6.f5013Z
            og.d r0 = (p258og.C5267d) r0
            r0.m11523h()
            return
        Le:
            java.lang.Object r0 = r6.f5013Z
            cg.l r0 = (cg.C0970l) r0
            java.lang.String r1 = "this$0"
            p214m2.C4339q.m9706k(r0, r1)
            android.support.v4.media.session.PlaybackStateCompat r1 = r0.f5016e
            int r2 = r1.f564Y
            r3 = 3
            if (r2 != r3) goto L30
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r1.f571f0
            long r2 = r2 - r4
            long r4 = r1.f565Z
            float r4 = (float) r4
            float r2 = (float) r2
            float r1 = r1.f567b0
            float r2 = r2 * r1
            float r2 = r2 + r4
            long r1 = (long) r2
            goto L32
        L30:
            long r1 = r1.f565Z
        L32:
            androidx.lifecycle.d0<java.lang.Long> r3 = r0.f5018g
            java.lang.Object r3 = r3.m1411d()
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 != 0) goto L3d
            goto L45
        L3d:
            long r3 = r3.longValue()
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L4e
        L45:
            androidx.lifecycle.d0<java.lang.Long> r3 = r0.f5018g
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.mo1415j(r1)
        L4e:
            boolean r1 = r0.f5026o
            if (r1 == 0) goto L5e
            android.os.Handler r1 = r0.f5027p
            cg.k r2 = new cg.k
            r2.<init>(r0)
            r3 = 300(0x12c, double:1.48E-321)
            r1.postDelayed(r2, r3)
        L5e:
            return
        L5f:
            java.lang.Object r0 = r6.f5013Z
            io.tacocrypto.app.utils.view.BlockParentScrollLayout r0 = (io.tacocrypto.app.utils.view.BlockParentScrollLayout) r0
            io.tacocrypto.app.utils.view.BlockParentScrollLayout.m7753a(r0)
            return
    }
}
