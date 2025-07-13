package gg;

/* renamed from: gg.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2368f implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f10706Y;

    /* renamed from: Z */
    public final /* synthetic */ gg.C2369g f10707Z;

    public /* synthetic */ RunnableC2368f(gg.C2369g r2, int r3) {
            r1 = this;
            r1.f10706Y = r3
            r0 = 1
            if (r3 == r0) goto Lc
            r0 = 2
            r1.<init>()
            r1.f10707Z = r2
            return
        Lc:
            r1.<init>()
            r1.f10707Z = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f10706Y
            java.lang.String r1 = "this$0"
            switch(r0) {
                case 0: goto L11;
                case 1: goto L8;
                default: goto L7;
            }
        L7:
            goto L1a
        L8:
            gg.g r0 = r3.f10707Z
            p214m2.C4339q.m9706k(r0, r1)
            r0.m6109j()
            return
        L11:
            gg.g r0 = r3.f10707Z
            p214m2.C4339q.m9706k(r0, r1)
            r0.m6109j()
            return
        L1a:
            gg.g r0 = r3.f10707Z
            int r2 = gg.CountDownTimerC2364b0.f10689b
            p214m2.C4339q.m9706k(r0, r1)
            r0.m6109j()
            return
    }
}
