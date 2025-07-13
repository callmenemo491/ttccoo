package pe;

/* renamed from: pe.i */
/* loaded from: classes.dex */
public final class C5487i extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.lang.String, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ pe.C5491m f21421Z;

    public C5487i(pe.C5491m r1) {
            r0 = this;
            r0.f21421Z = r1
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
            pe.m r0 = r4.f21421Z
            androidx.lifecycle.d0<vg.b<ah.a>> r1 = r0.f21428h
            if (r5 == 0) goto L3f
            androidx.lifecycle.d0<java.util.List<qe.e>> r5 = r0.f21427g
            dh.k r6 = p062dh.C1475k.f7237Y
            r5.mo7l(r6)
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r5.<init>(r6)
            pe.m r6 = r4.f21421Z
            f1.f r0 = new f1.f
            r0.<init>(r6)
            r2 = 1000(0x3e8, double:4.94E-321)
            r5.postDelayed(r0, r2)
            java.lang.String r5 = "Claim success"
            r6 = 0
            java.lang.String r0 = "title"
            p214m2.C4339q.m9706k(r5, r0)
            vg.b r0 = new vg.b
            ah.a r2 = new ah.a
            zg.d r3 = p458zg.EnumC7332d.f28067Y
            r2.<init>(r5, r6, r3)
            r0.<init>(r2)
            goto L50
        L3f:
            r0.m11771d()
            vg.b r0 = new vg.b
            ah.a r5 = new ah.a
            zg.d r2 = p458zg.EnumC7332d.f28068Z
            java.lang.String r3 = "Transaction Error"
            r5.<init>(r3, r6, r2)
            r0.<init>(r5)
        L50:
            r1.mo7l(r0)
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}
