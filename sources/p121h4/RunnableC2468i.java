package p121h4;

/* renamed from: h4.i */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2468i implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f11045Y;

    /* renamed from: Z */
    public final /* synthetic */ p121h4.InterfaceC2473n.a f11046Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.Exception f11047a0;

    public /* synthetic */ RunnableC2468i(p121h4.InterfaceC2473n.a r1, java.lang.Exception r2, int r3) {
            r0 = this;
            r0.f11045Y = r3
            r0.<init>()
            r0.f11046Z = r1
            r0.f11047a0 = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f11045Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            h4.n$a r0 = r3.f11046Z
            java.lang.Exception r1 = r3.f11047a0
            h4.n r0 = r0.f11064b
            int r2 = p371v5.C6552b0.f25624a
            r0.mo5283I(r1)
            return
        L12:
            h4.n$a r0 = r3.f11046Z
            java.lang.Exception r1 = r3.f11047a0
            h4.n r0 = r0.f11064b
            int r2 = p371v5.C6552b0.f25624a
            r0.mo5278A(r1)
            return
    }
}
