package p327s7;

/* renamed from: s7.m */
/* loaded from: classes.dex */
public final class C5989m<TResult, TContinuationResult> implements p327s7.InterfaceC5991o<TResult>, p327s7.InterfaceC5979c, p327s7.InterfaceC5981e, p327s7.InterfaceC5982f {

    /* renamed from: Y */
    public final /* synthetic */ int f23088Y;

    /* renamed from: Z */
    public final java.util.concurrent.Executor f23089Z;

    /* renamed from: a0 */
    public final p327s7.InterfaceC5977a<TResult, TContinuationResult> f23090a0;

    /* renamed from: b0 */
    public final p327s7.C5993q<TContinuationResult> f23091b0;

    public C5989m(java.util.concurrent.Executor r2, p327s7.InterfaceC5977a r3, p327s7.C5993q r4, int r5) {
            r1 = this;
            r1.f23088Y = r5
            r0 = 1
            if (r5 == r0) goto Lf
            r1.<init>()
            r1.f23089Z = r2
            r1.f23090a0 = r3
            r1.f23091b0 = r4
            return
        Lf:
            r1.<init>()
            r1.f23089Z = r2
            r1.f23090a0 = r3
            r1.f23091b0 = r4
            return
    }

    @Override // p327s7.InterfaceC5979c
    /* renamed from: a */
    public void mo7372a() {
            r1 = this;
            s7.q<TContinuationResult> r0 = r1.f23091b0
            r0.m12474s()
            return
    }

    @Override // p327s7.InterfaceC5991o
    /* renamed from: b */
    public final void mo12470b(p327s7.AbstractC5985i r4) {
            r3 = this;
            int r0 = r3.f23088Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L11
        L6:
            java.util.concurrent.Executor r0 = r3.f23089Z
            h6.a0 r1 = new h6.a0
            r1.<init>(r3, r4)
            r0.execute(r1)
            return
        L11:
            java.util.concurrent.Executor r0 = r3.f23089Z
            h6.a0 r1 = new h6.a0
            r2 = 0
            r1.<init>(r3, r4, r2)
            r0.execute(r1)
            return
    }

    @Override // p327s7.InterfaceC5981e
    /* renamed from: c */
    public void mo4109c(java.lang.Exception r2) {
            r1 = this;
            s7.q<TContinuationResult> r0 = r1.f23091b0
            r0.m12472q(r2)
            return
    }

    @Override // p327s7.InterfaceC5982f
    /* renamed from: d */
    public void mo1270d(TContinuationResult r2) {
            r1 = this;
            s7.q<TContinuationResult> r0 = r1.f23091b0
            r0.m12473r(r2)
            return
    }
}
