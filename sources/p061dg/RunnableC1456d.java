package p061dg;

/* renamed from: dg.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1456d implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f7211Y;

    /* renamed from: Z */
    public final /* synthetic */ p061dg.C1463k f7212Z;

    public /* synthetic */ RunnableC1456d(p061dg.C1463k r2, int r3) {
            r1 = this;
            r1.f7211Y = r3
            r0 = 1
            r1.<init>()
            r1.f7212Z = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f7211Y
            java.lang.String r1 = "this$0"
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L11
        L8:
            dg.k r0 = r2.f7212Z
            p214m2.C4339q.m9706k(r0, r1)
            r0.m3980f()
            return
        L11:
            dg.k r0 = r2.f7212Z
            p214m2.C4339q.m9706k(r0, r1)
            r0.m3980f()
            return
    }
}
