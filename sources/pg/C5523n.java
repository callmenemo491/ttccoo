package pg;

/* renamed from: pg.n */
/* loaded from: classes.dex */
public final class C5523n extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.lang.String, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ pg.C5522m f21523Z;

    public C5523n(pg.C5522m r1) {
            r0 = this;
            r0.f21523Z = r1
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
            pg.m r0 = r4.f21523Z
            androidx.lifecycle.d0<vg.b<ah.a>> r1 = r0.f21513k
            if (r5 == 0) goto L3a
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r5.<init>(r6)
            pg.m r6 = r4.f21523Z
            pg.c r0 = new pg.c
            r2 = 1
            r0.<init>(r6, r2)
            r2 = 1000(0x3e8, double:4.94E-321)
            r5.postDelayed(r0, r2)
            java.lang.String r5 = "Congratulations"
            java.lang.String r6 = "title"
            p214m2.C4339q.m9706k(r5, r6)
            vg.b r6 = new vg.b
            ah.a r0 = new ah.a
            zg.d r2 = p458zg.EnumC7332d.f28067Y
            java.lang.String r3 = "Assets staked correctly"
            r0.<init>(r5, r3, r2)
            r6.<init>(r0)
            goto L4c
        L3a:
            r0.m11781f()
            vg.b r5 = new vg.b
            ah.a r0 = new ah.a
            zg.d r2 = p458zg.EnumC7332d.f28068Z
            java.lang.String r3 = "Transaction Error"
            r0.<init>(r3, r6, r2)
            r5.<init>(r0)
            r6 = r5
        L4c:
            r1.mo7l(r6)
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}
