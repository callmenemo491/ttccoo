package pg;

/* renamed from: pg.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5512c implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f21497Y;

    /* renamed from: Z */
    public final /* synthetic */ pg.C5522m f21498Z;

    public /* synthetic */ RunnableC5512c(pg.C5522m r2, int r3) {
            r1 = this;
            r1.f21497Y = r3
            r0 = 1
            r1.<init>()
            r1.f21498Z = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f21497Y
            java.lang.String r1 = "this$0"
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L11
        L8:
            pg.m r0 = r2.f21498Z
            p214m2.C4339q.m9706k(r0, r1)
            r0.m11781f()
            return
        L11:
            pg.m r0 = r2.f21498Z
            p214m2.C4339q.m9706k(r0, r1)
            r0.m11781f()
            return
    }
}
