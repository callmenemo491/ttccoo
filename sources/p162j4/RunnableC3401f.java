package p162j4;

/* renamed from: j4.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3401f implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f14736Y;

    /* renamed from: Z */
    public final /* synthetic */ p162j4.InterfaceC3403h.a f14737Z;

    /* renamed from: a0 */
    public final /* synthetic */ p162j4.InterfaceC3403h f14738a0;

    public /* synthetic */ RunnableC3401f(p162j4.InterfaceC3403h.a r2, p162j4.InterfaceC3403h r3, int r4) {
            r1 = this;
            r1.f14736Y = r4
            r0 = 1
            if (r4 == r0) goto L6
            r0 = 2
        L6:
            r1.<init>()
            r1.f14737Z = r2
            r1.f14738a0 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f14736Y
            switch(r0) {
                case 0: goto L1e;
                case 1: goto L12;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L2a
        L6:
            j4.h$a r0 = r3.f14737Z
            j4.h r1 = r3.f14738a0
            int r2 = r0.f14743a
            g5.r$a r0 = r0.f14744b
            r1.mo5396E(r2, r0)
            return
        L12:
            j4.h$a r0 = r3.f14737Z
            j4.h r1 = r3.f14738a0
            int r2 = r0.f14743a
            g5.r$a r0 = r0.f14744b
            r1.mo5400g0(r2, r0)
            return
        L1e:
            j4.h$a r0 = r3.f14737Z
            j4.h r1 = r3.f14738a0
            int r2 = r0.f14743a
            g5.r$a r0 = r0.f14744b
            r1.mo5397P(r2, r0)
            return
        L2a:
            j4.h$a r0 = r3.f14737Z
            j4.h r1 = r3.f14738a0
            int r2 = r0.f14743a
            g5.r$a r0 = r0.f14744b
            r1.mo5399e0(r2, r0)
            return
    }
}
