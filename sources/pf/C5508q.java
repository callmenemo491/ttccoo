package pf;

/* renamed from: pf.q */
/* loaded from: classes.dex */
public final class C5508q extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.lang.String, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ pf.C5498g f21483Z;

    public C5508q(pf.C5498g r1) {
            r0 = this;
            r0.f21483Z = r1
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
            if (r5 == 0) goto L35
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r5.<init>(r6)
            pf.g r6 = r4.f21483Z
            pf.p r0 = new pf.p
            r1 = 0
            r0.<init>(r6, r1)
            r1 = 1000(0x3e8, double:4.94E-321)
            r5.postDelayed(r0, r1)
            pf.g r5 = r4.f21483Z
            androidx.lifecycle.d0<vg.b<ch.e<java.lang.String, java.lang.String>>> r5 = r5.f21457g
            vg.b r6 = new vg.b
            ch.e r0 = new ch.e
            r1 = 0
            java.lang.String r2 = "Deposit success"
            r0.<init>(r2, r1)
            r6.<init>(r0)
            r5.mo7l(r6)
            goto L4a
        L35:
            pf.g r5 = r4.f21483Z
            androidx.lifecycle.d0<vg.b<ah.a>> r5 = r5.f21456f
            vg.b r0 = new vg.b
            ah.a r1 = new ah.a
            zg.d r2 = p458zg.EnumC7332d.f28068Z
            java.lang.String r3 = "Transaction Error"
            r1.<init>(r3, r6, r2)
            r0.<init>(r1)
            r5.mo7l(r0)
        L4a:
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}
