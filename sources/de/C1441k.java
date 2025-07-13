package de;

/* renamed from: de.k */
/* loaded from: classes.dex */
public final class C1441k extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.lang.String, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ de.C1442l f7132Z;

    /* renamed from: a0 */
    public final /* synthetic */ de.C1444n f7133a0;

    public C1441k(de.C1442l r1, de.C1444n r2) {
            r0 = this;
            r0.f7132Z = r1
            r0.f7133a0 = r2
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public ch.C0985l mo122l(java.lang.Boolean r5, java.lang.String r6) {
            r4 = this;
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.String r6 = (java.lang.String) r6
            if (r5 == 0) goto L19
            de.l r5 = r4.f7132Z
            androidx.lifecycle.d0<vg.b<de.n>> r5 = r5.f7143l
            vg.b r6 = new vg.b
            de.n r0 = r4.f7133a0
            r6.<init>(r0)
            r5.mo7l(r6)
            goto L2e
        L19:
            de.l r5 = r4.f7132Z
            androidx.lifecycle.d0<vg.b<ah.a>> r5 = r5.f7138g
            vg.b r0 = new vg.b
            ah.a r1 = new ah.a
            zg.d r2 = p458zg.EnumC7332d.f28068Z
            java.lang.String r3 = "Transaction Error"
            r1.<init>(r3, r6, r2)
            r0.<init>(r1)
            r5.mo7l(r0)
        L2e:
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}
