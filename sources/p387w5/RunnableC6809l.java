package p387w5;

/* renamed from: w5.l */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6809l implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f26507Y;

    /* renamed from: Z */
    public final /* synthetic */ p387w5.InterfaceC6812o.a f26508Z;

    /* renamed from: a0 */
    public final /* synthetic */ long f26509a0;

    /* renamed from: b0 */
    public final /* synthetic */ int f26510b0;

    public /* synthetic */ RunnableC6809l(p387w5.InterfaceC6812o.a r2, int r3, long r4) {
            r1 = this;
            r0 = 1
            r1.f26507Y = r0
            r1.<init>()
            r1.f26508Z = r2
            r1.f26510b0 = r3
            r1.f26509a0 = r4
            return
    }

    public /* synthetic */ RunnableC6809l(p387w5.InterfaceC6812o.a r2, long r3, int r5) {
            r1 = this;
            r0 = 0
            r1.f26507Y = r0
            r1.<init>()
            r1.f26508Z = r2
            r1.f26509a0 = r3
            r1.f26510b0 = r5
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.f26507Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L14
        L6:
            w5.o$a r0 = r5.f26508Z
            long r1 = r5.f26509a0
            int r3 = r5.f26510b0
            w5.o r0 = r0.f26518b
            int r4 = p371v5.C6552b0.f25624a
            r0.mo5296h0(r1, r3)
            return
        L14:
            w5.o$a r0 = r5.f26508Z
            int r1 = r5.f26510b0
            long r2 = r5.f26509a0
            w5.o r0 = r0.f26518b
            int r4 = p371v5.C6552b0.f25624a
            r0.mo5293d0(r1, r2)
            return
    }
}
