package p249o7;

/* renamed from: o7.l5 */
/* loaded from: classes.dex */
public final class RunnableC5043l5 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f19826Y;

    /* renamed from: Z */
    public final /* synthetic */ p249o7.C5051m5 f19827Z;

    public RunnableC5043l5(p249o7.C5051m5 r2, int r3) {
            r1 = this;
            r1.f19826Y = r3
            r0 = 1
            if (r3 == r0) goto Lb
            r1.f19827Z = r2
            r1.<init>()
            return
        Lb:
            r1.f19827Z = r2
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f19826Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Ld
        L6:
            o7.m5 r0 = r2.f19827Z
            o7.j5 r1 = r0.f19853j
            r0.f19848e = r1
            return
        Ld:
            o7.m5 r0 = r2.f19827Z
            r1 = 0
            r0.f19853j = r1
            return
    }
}
