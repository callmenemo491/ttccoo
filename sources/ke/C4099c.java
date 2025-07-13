package ke;

/* renamed from: ke.c */
/* loaded from: classes.dex */
public final class C4099c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p458zg.C7334f, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ java.lang.String f17029Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.String f17030a0;

    /* renamed from: b0 */
    public final /* synthetic */ ke.C4100d f17031b0;

    public C4099c(java.lang.String r1, java.lang.String r2, ke.C4100d r3) {
            r0 = this;
            r0.f17029Z = r1
            r0.f17030a0 = r2
            r0.f17031b0 = r3
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public ch.C0985l mo107b(p458zg.C7334f r5) {
            r4 = this;
            zg.f r5 = (p458zg.C7334f) r5
            java.lang.String r0 = "$this$showProjectDialog"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = r4.f17029Z
            r1 = 0
            r2 = 1
            p458zg.C7334f.m14409e(r5, r1, r0, r2)
            androidx.appcompat.app.b r0 = r5.f28077a
            r3 = 0
            r0.setCancelable(r3)
            java.lang.String r0 = r4.f17030a0
            p458zg.C7334f.m14406a(r5, r1, r0, r2)
            r0 = 2131951953(0x7f130151, float:1.9540335E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            ke.b r2 = new ke.b
            ke.d r3 = r4.f17031b0
            r2.<init>(r3)
            r3 = 2
            p458zg.C7334f.m14408c(r5, r0, r1, r2, r3)
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}
