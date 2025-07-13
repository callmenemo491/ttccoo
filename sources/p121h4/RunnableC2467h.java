package p121h4;

/* renamed from: h4.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2467h implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f11042Y;

    /* renamed from: Z */
    public final /* synthetic */ p121h4.InterfaceC2473n.a f11043Z;

    /* renamed from: a0 */
    public final /* synthetic */ p142i4.C3071e f11044a0;

    public /* synthetic */ RunnableC2467h(p121h4.InterfaceC2473n.a r1, p142i4.C3071e r2, int r3) {
            r0 = this;
            r0.f11042Y = r3
            r0.<init>()
            r0.f11043Z = r1
            r0.f11044a0 = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f11042Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L17
        L6:
            h4.n$a r0 = r3.f11043Z
            i4.e r1 = r3.f11044a0
            java.util.Objects.requireNonNull(r0)
            monitor-enter(r1)
            monitor-exit(r1)
            h4.n r0 = r0.f11064b
            int r2 = p371v5.C6552b0.f25624a
            r0.mo5289b0(r1)
            return
        L17:
            h4.n$a r0 = r3.f11043Z
            i4.e r1 = r3.f11044a0
            h4.n r0 = r0.f11064b
            int r2 = p371v5.C6552b0.f25624a
            r0.mo5299m(r1)
            return
    }
}
