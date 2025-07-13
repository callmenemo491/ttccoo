package ae;

/* renamed from: ae.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0075d implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f220Y;

    /* renamed from: Z */
    public final /* synthetic */ ae.C0080i f221Z;

    public /* synthetic */ RunnableC0075d(ae.C0080i r2, int r3) {
            r1 = this;
            r1.f220Y = r3
            r0 = 1
            if (r3 == r0) goto Lc
            r0 = 2
            r1.<init>()
            r1.f221Z = r2
            return
        Lc:
            r1.<init>()
            r1.f221Z = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f220Y
            switch(r0) {
                case 0: goto Lc;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L17
        L6:
            ae.i r0 = r2.f221Z
            r0.m120e()
            return
        Lc:
            ae.i r0 = r2.f221Z
            java.lang.String r1 = "this$0"
            p214m2.C4339q.m9706k(r0, r1)
            r0.m120e()
            return
        L17:
            ae.i r0 = r2.f221Z
            r0.m120e()
            return
    }
}
