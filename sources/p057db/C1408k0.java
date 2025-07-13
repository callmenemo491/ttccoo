package p057db;

/* renamed from: db.k0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1408k0 implements p327s7.InterfaceC5980d {

    /* renamed from: a */
    public final /* synthetic */ int f7066a;

    /* renamed from: b */
    public final java.lang.Object f7067b;

    public C1408k0(p057db.ServiceConnectionC1412m0.a r2) {
            r1 = this;
            r0 = 0
            r1.f7066a = r0
            r1.<init>()
            r1.f7067b = r2
            return
    }

    public C1408k0(java.util.concurrent.ScheduledFuture r2) {
            r1 = this;
            r0 = 1
            r1.f7066a = r0
            r1.<init>()
            r1.f7067b = r2
            return
    }

    @Override // p327s7.InterfaceC5980d
    /* renamed from: a */
    public void mo3092a(p327s7.AbstractC5985i r2) {
            r1 = this;
            int r2 = r1.f7066a
            switch(r2) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            java.lang.Object r2 = r1.f7067b
            db.m0$a r2 = (p057db.ServiceConnectionC1412m0.a) r2
            r2.m3938a()
            return
        Le:
            java.lang.Object r2 = r1.f7067b
            java.util.concurrent.ScheduledFuture r2 = (java.util.concurrent.ScheduledFuture) r2
            r0 = 0
            r2.cancel(r0)
            return
    }
}
