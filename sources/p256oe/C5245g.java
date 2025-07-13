package p256oe;

/* renamed from: oe.g */
/* loaded from: classes.dex */
public final class C5245g extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.lang.String, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p256oe.C5246h f20374Z;

    public C5245g(p256oe.C5246h r1) {
            r0 = this;
            r0.f20374Z = r1
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
            oe.h r5 = r4.f20374Z
            androidx.lifecycle.d0<vg.b<ch.l>> r5 = r5.f20378f
            vg.b r6 = new vg.b
            ch.l r0 = ch.C0985l.f5061a
            r6.<init>(r0)
            r5.mo7l(r6)
            goto L2e
        L19:
            oe.h r5 = r4.f20374Z
            androidx.lifecycle.d0<vg.b<ah.a>> r5 = r5.f20377e
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
