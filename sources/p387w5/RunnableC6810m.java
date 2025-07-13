package p387w5;

/* renamed from: w5.m */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6810m implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f26511Y;

    /* renamed from: Z */
    public final /* synthetic */ p387w5.InterfaceC6812o.a f26512Z;

    /* renamed from: a0 */
    public final /* synthetic */ p142i4.C3071e f26513a0;

    public /* synthetic */ RunnableC6810m(p387w5.InterfaceC6812o.a r1, p142i4.C3071e r2, int r3) {
            r0 = this;
            r0.f26511Y = r3
            r0.<init>()
            r0.f26512Z = r1
            r0.f26513a0 = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f26511Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L17
        L6:
            w5.o$a r0 = r3.f26512Z
            i4.e r1 = r3.f26513a0
            java.util.Objects.requireNonNull(r0)
            monitor-enter(r1)
            monitor-exit(r1)
            w5.o r0 = r0.f26518b
            int r2 = p371v5.C6552b0.f25624a
            r0.mo5285K(r1)
            return
        L17:
            w5.o$a r0 = r3.f26512Z
            i4.e r1 = r3.f26513a0
            w5.o r0 = r0.f26518b
            int r2 = p371v5.C6552b0.f25624a
            r0.mo5284J(r1)
            return
    }
}
