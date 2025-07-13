package p258og;

/* renamed from: og.e */
/* loaded from: classes.dex */
public final class C5268e extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<java.lang.Boolean, java.lang.String, p255od.C5230t0, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p258og.C5267d f20470Z;

    public C5268e(p258og.C5267d r1) {
            r0 = this;
            r0.f20470Z = r1
            r1 = 3
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(java.lang.Boolean r9, java.lang.String r10, p255od.C5230t0 r11) {
            r8 = this;
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            java.lang.String r10 = (java.lang.String) r10
            od.t0 r11 = (p255od.C5230t0) r11
            if (r9 == 0) goto L39
            og.d r9 = r8.f20470Z
            nd.b0 r9 = r9.f20446c
            id.b r9 = r9.m10795h()
            if (r9 == 0) goto L4e
            java.lang.String r9 = r9.f12559a
            if (r9 != 0) goto L1b
            goto L4e
        L1b:
            og.d r10 = r8.f20470Z
            p214m2.C4339q.m9704i(r11)
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r10.f20448e
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.mo7l(r1)
            vh.b0 r2 = p064e.C1488b.m4037d(r10)
            og.m r5 = new og.m
            r0 = 0
            r5.<init>(r10, r9, r11, r0)
            r3 = 0
            r6 = 3
            r7 = 0
            r4 = 0
            p101fh.C2174f.m5714d(r2, r3, r4, r5, r6, r7)
            goto L4e
        L39:
            og.d r9 = r8.f20470Z
            androidx.lifecycle.d0<vg.b<ah.a>> r9 = r9.f20455l
            vg.b r11 = new vg.b
            ah.a r0 = new ah.a
            zg.d r1 = p458zg.EnumC7332d.f28068Z
            java.lang.String r2 = "Transaction Error"
            r0.<init>(r2, r10, r1)
            r11.<init>(r0)
            r9.mo7l(r11)
        L4e:
            ch.l r9 = ch.C0985l.f5061a
            return r9
    }
}
