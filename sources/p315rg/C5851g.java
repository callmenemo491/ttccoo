package p315rg;

/* renamed from: rg.g */
/* loaded from: classes.dex */
public final class C5851g extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.lang.String, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p315rg.C5850f f22646Z;

    public C5851g(p315rg.C5850f r1) {
            r0 = this;
            r0.f22646Z = r1
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
            rg.f r0 = r4.f22646Z
            androidx.lifecycle.d0<vg.b<ah.a>> r1 = r0.f22636m
            if (r5 == 0) goto L34
            androidx.lifecycle.d0<java.lang.String> r5 = r0.f22638o
            java.lang.String r6 = ""
            r5.mo7l(r6)
            androidx.lifecycle.d0<java.lang.String> r5 = r0.f22639p
            r5.mo7l(r6)
            androidx.lifecycle.d0<java.lang.String> r5 = r0.f22640q
            r5.mo7l(r6)
            java.lang.String r5 = "Transfer success"
            r6 = 0
            java.lang.String r0 = "title"
            p214m2.C4339q.m9706k(r5, r0)
            vg.b r0 = new vg.b
            ah.a r2 = new ah.a
            zg.d r3 = p458zg.EnumC7332d.f28067Y
            r2.<init>(r5, r6, r3)
            r0.<init>(r2)
            goto L42
        L34:
            vg.b r0 = new vg.b
            ah.a r5 = new ah.a
            zg.d r2 = p458zg.EnumC7332d.f28068Z
            java.lang.String r3 = "Transaction Error"
            r5.<init>(r3, r6, r2)
            r0.<init>(r5)
        L42:
            r1.mo7l(r0)
            rg.f r5 = r4.f22646Z
            r5.m12201d()
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}
