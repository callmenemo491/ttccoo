package p360ue;

/* renamed from: ue.w */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6428w implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f24971Y;

    /* renamed from: Z */
    public final /* synthetic */ p360ue.C6402b0 f24972Z;

    public /* synthetic */ RunnableC6428w(p360ue.C6402b0 r2, int r3) {
            r1 = this;
            r1.f24971Y = r3
            r0 = 1
            if (r3 == r0) goto L15
            r0 = 2
            if (r3 == r0) goto Lf
            r0 = 3
            r1.<init>()
            r1.f24972Z = r2
            return
        Lf:
            r1.<init>()
            r1.f24972Z = r2
            return
        L15:
            r1.<init>()
            r1.f24972Z = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f24971Y
            java.lang.String r1 = "this$0"
            switch(r0) {
                case 0: goto L1a;
                case 1: goto L11;
                case 2: goto L8;
                default: goto L7;
            }
        L7:
            goto L23
        L8:
            ue.b0 r0 = r2.f24972Z
            p214m2.C4339q.m9706k(r0, r1)
            r0.m13034j()
            return
        L11:
            ue.b0 r0 = r2.f24972Z
            p214m2.C4339q.m9706k(r0, r1)
            r0.m13034j()
            return
        L1a:
            ue.b0 r0 = r2.f24972Z
            p214m2.C4339q.m9706k(r0, r1)
            r0.m13034j()
            return
        L23:
            ue.b0 r0 = r2.f24972Z
            p214m2.C4339q.m9706k(r0, r1)
            r0.m13034j()
            return
    }
}
