package de;

/* renamed from: de.e */
/* loaded from: classes.dex */
public final class C1435e extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p458zg.C7334f, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ de.C1444n f7121Z;

    /* renamed from: a0 */
    public final /* synthetic */ io.tacocrypto.app.p156ui.secret.SecretFragment f7122a0;

    public C1435e(de.C1444n r1, io.tacocrypto.app.p156ui.secret.SecretFragment r2) {
            r0 = this;
            r0.f7121Z = r1
            r0.f7122a0 = r2
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
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            de.n r1 = r5.f7121Z
            io.tacocrypto.app.ui.secret.c r1 = r1.f7163a
            java.lang.String r1 = r1.m7732g()
            r0.append(r1)
            java.lang.String r1 = " Sauce"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2 = 1
            p458zg.C7334f.m14409e(r6, r1, r0, r2)
            zg.d r0 = p458zg.EnumC7332d.f28071c0
            r6.m14410d(r0)
            java.lang.String r0 = "Are you sure you want to buy this Taco Sauce NFT?"
            p458zg.C7334f.m14406a(r6, r1, r0, r2)
            r0 = 2131951953(0x7f130151, float:1.9540335E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            de.d r2 = new de.d
            io.tacocrypto.app.ui.secret.SecretFragment r3 = r5.f7122a0
            de.n r4 = r5.f7121Z
            r2.<init>(r3, r4)
            r3 = 2
            p458zg.C7334f.m14408c(r6, r0, r1, r2, r3)
            r0 = 2131951662(0x7f13002e, float:1.9539745E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 6
            p458zg.C7334f.m14407b(r6, r0, r1, r1, r2)
            ch.l r6 = ch.C0985l.f5061a
            return r6
    }
}
