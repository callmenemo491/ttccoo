package p457zf;

/* renamed from: zf.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7321h implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f28035Y;

    /* renamed from: Z */
    public final /* synthetic */ p457zf.C7327n f28036Z;

    public /* synthetic */ RunnableC7321h(p457zf.C7327n r2, int r3) {
            r1 = this;
            r1.f28035Y = r3
            r0 = 1
            r1.<init>()
            r1.f28036Z = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f28035Y
            java.lang.String r1 = "this$0"
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L1a
        L8:
            zf.n r0 = r3.f28036Z
            p214m2.C4339q.m9706k(r0, r1)
            androidx.lifecycle.d0<vg.b<ch.l>> r0 = r0.f28053k
            vg.b r1 = new vg.b
            ch.l r2 = ch.C0985l.f5061a
            r1.<init>(r2)
            r0.mo7l(r1)
            return
        L1a:
            zf.n r0 = r3.f28036Z
            p214m2.C4339q.m9706k(r0, r1)
            r0.m14400e()
            return
    }
}
