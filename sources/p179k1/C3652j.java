package p179k1;

/* renamed from: k1.j */
/* loaded from: classes.dex */
public final class C3652j extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.Throwable, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ android.os.CancellationSignal f16142Z;

    /* renamed from: a0 */
    public final /* synthetic */ p379vh.InterfaceC6687b1 f16143a0;

    public C3652j(android.os.CancellationSignal r1, p379vh.InterfaceC6687b1 r2) {
            r0 = this;
            r0.f16142Z = r1
            r0.f16143a0 = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public ch.C0985l mo107b(java.lang.Throwable r3) {
            r2 = this;
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            android.os.CancellationSignal r3 = r2.f16142Z
            r3.cancel()
            vh.b1 r3 = r2.f16143a0
            r0 = 1
            r1 = 0
            p379vh.InterfaceC6687b1.a.m13556a(r3, r1, r0, r1)
            ch.l r3 = ch.C0985l.f5061a
            return r3
    }
}
