package p455zd;

/* renamed from: zd.h */
/* loaded from: classes.dex */
public final class C7303h extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p458zg.C7334f, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ java.lang.String f27992Z;

    /* renamed from: a0 */
    public final /* synthetic */ p455zd.C7301f f27993a0;

    public C7303h(java.lang.String r1, p455zd.C7301f r2) {
            r0 = this;
            r0.f27992Z = r1
            r0.f27993a0 = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public ch.C0985l mo107b(p458zg.C7334f r6) {
            r5 = this;
            zg.f r6 = (p458zg.C7334f) r6
            java.lang.String r0 = "$this$showProjectDialog"
            p214m2.C4339q.m9706k(r6, r0)
            r0 = 0
            r1 = 1
            java.lang.String r2 = "Wait"
            p458zg.C7334f.m14409e(r6, r0, r2, r1)
            androidx.appcompat.app.b r2 = r6.f28077a
            r3 = 0
            r2.setCancelable(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The requested wallet ("
            r2.append(r3)
            java.lang.String r3 = r5.f27992Z
            java.lang.String r4 = ") is not linked to the app"
            java.lang.String r2 = p346u.C6269n.m12888a(r2, r3, r4)
            p458zg.C7334f.m14406a(r6, r0, r2, r1)
            zg.d r1 = p458zg.EnumC7332d.f28069a0
            r6.m14410d(r1)
            r1 = 2131951953(0x7f130151, float:1.9540335E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            zd.g r2 = new zd.g
            zd.f r3 = r5.f27993a0
            r2.<init>(r3)
            r3 = 2
            p458zg.C7334f.m14408c(r6, r1, r0, r2, r3)
            ch.l r6 = ch.C0985l.f5061a
            return r6
    }
}
