package gg;

/* renamed from: gg.d */
/* loaded from: classes.dex */
public final class C2366d extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p458zg.C7334f, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ java.lang.String f10692Z;

    /* renamed from: a0 */
    public final /* synthetic */ gg.C2367e f10693a0;

    public C2366d(java.lang.String r1, gg.C2367e r2) {
            r0 = this;
            r0.f10692Z = r1
            r0.f10693a0 = r2
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
            r0 = 2131952009(0x7f130189, float:1.9540449E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            r2 = 2
            p458zg.C7334f.m14409e(r6, r0, r1, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "After claiming, if your Claim Limit is not enough for the mined aether, the rest of the aether will be burned. To not lose aether, increase the Claim Limit. \n\n"
            r0.append(r3)
            java.lang.String r3 = r5.f10692Z
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = 1
            p458zg.C7334f.m14406a(r6, r1, r0, r3)
            zg.d r0 = p458zg.EnumC7332d.f28069a0
            r6.m14410d(r0)
            r0 = 2131951712(0x7f130060, float:1.9539846E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            gg.c r3 = new gg.c
            gg.e r4 = r5.f10693a0
            r3.<init>(r4)
            p458zg.C7334f.m14408c(r6, r0, r1, r3, r2)
            r0 = 2131951662(0x7f13002e, float:1.9539745E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 6
            p458zg.C7334f.m14407b(r6, r0, r1, r1, r2)
            ch.l r6 = ch.C0985l.f5061a
            return r6
    }
}
