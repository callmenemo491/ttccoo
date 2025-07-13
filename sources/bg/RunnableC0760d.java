package bg;

/* renamed from: bg.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0760d implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f4109Y;

    /* renamed from: Z */
    public final /* synthetic */ bg.C0767k f4110Z;

    public /* synthetic */ RunnableC0760d(bg.C0767k r2, int r3) {
            r1 = this;
            r1.f4109Y = r3
            r0 = 1
            r1.<init>()
            r1.f4110Z = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f4109Y
            java.lang.String r1 = "this$0"
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L11
        L8:
            bg.k r0 = r2.f4110Z
            p214m2.C4339q.m9706k(r0, r1)
            r0.m2359f()
            return
        L11:
            bg.k r0 = r2.f4110Z
            p214m2.C4339q.m9706k(r0, r1)
            r0.m2359f()
            return
    }
}
