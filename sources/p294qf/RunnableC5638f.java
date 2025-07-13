package p294qf;

/* renamed from: qf.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5638f implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f21934Y;

    /* renamed from: Z */
    public final /* synthetic */ p294qf.C5645m f21935Z;

    public /* synthetic */ RunnableC5638f(p294qf.C5645m r2, int r3) {
            r1 = this;
            r1.f21934Y = r3
            r0 = 1
            r1.<init>()
            r1.f21935Z = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f21934Y
            java.lang.String r1 = "this$0"
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L11
        L8:
            qf.m r0 = r2.f21935Z
            p214m2.C4339q.m9706k(r0, r1)
            r0.m11933f()
            return
        L11:
            qf.m r0 = r2.f21935Z
            p214m2.C4339q.m9706k(r0, r1)
            r0.m11933f()
            return
    }
}
